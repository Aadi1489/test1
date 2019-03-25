/*
 * SonarQube Scanner for Jenkins
 * Copyright (C) 2007-2019 SonarSource SA
 * mailto:info AT sonarsource DOT com
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */
package hudson.plugins.sonar.utils;

import hudson.FilePath;
import hudson.model.Action;
import hudson.model.Actionable;
import hudson.model.Run;
import hudson.model.TaskListener;
import hudson.plugins.sonar.action.SonarAnalysisAction;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;
import javax.annotation.CheckForNull;
import javax.annotation.Nullable;

public final class SonarUtils {

  public static final String SERVER_URL_KEY = "serverUrl";
  public static final String DASHBOARD_URL_KEY = "dashboardUrl";
  public static final String CE_TASK_ID_KEY = "ceTaskId";
  public static final String REPORT_TASK_FILE_NAME = "report-task.txt";

  /**
   * Hide utility-class constructor.
   */
  private SonarUtils() {
  }

  public static <T extends Action> List<T> getPersistentActions(Actionable actionable, Class<T> type) {
    List<T> filtered = new LinkedList<>();

    // we use this method to avoid recursively calling transitive action factories
    for (Action a : actionable.getActions()) {
      if (a == null) {
        continue;
      }
      if (type.isAssignableFrom(a.getClass())) {
        filtered.add((T) a);
      }
    }
    return filtered;
  }

  @CheckForNull
  public static <T extends Action> T getPersistentAction(Actionable actionable, Class<T> type) {
    // we use this method to avoid recursively calling transitive action factories
    for (Action a : actionable.getActions()) {
      if (a == null) {
        continue;
      }
      if (type.isAssignableFrom(a.getClass())) {
        return (T) a;
      }
    }
    return null;
  }

  public static Properties extractReportTask(TaskListener listener, FilePath workspace) throws IOException, InterruptedException {
    FilePath[] candidates = workspace.list("**/" + REPORT_TASK_FILE_NAME);
    if (candidates.length == 0) {
      listener.getLogger().println("WARN: Unable to locate '" + REPORT_TASK_FILE_NAME + "' in the workspace. Did the SonarScanner succeeded?");
      return null;
    } else {
      if (candidates.length > 1) {
        listener.getLogger().println("WARN: Found multiple '" + REPORT_TASK_FILE_NAME + "' in the workspace. Taking the first one.");
        Stream.of(candidates).forEach(p -> listener.getLogger().println(p));
      }
      FilePath reportTaskFile = candidates[0];
      try (InputStream in = reportTaskFile.read()) {
        Properties p = new Properties();
        p.load(new InputStreamReader(in, StandardCharsets.UTF_8));
        return p;
      }
    }

  }

  @Nullable
  /** 
   * Collects as much information as it finds from the sonar analysis in the build and adds it as an action to the build.
   * Even if no information is found, the action is added, marking in the build that a sonar analysis ran. 
   */
  public static SonarAnalysisAction addBuildInfoTo(Run<?, ?> build, TaskListener listener, FilePath workspace, String installationName, boolean skippedIfNoBuild)
    throws IOException, InterruptedException {
    SonarAnalysisAction buildInfo = new SonarAnalysisAction(installationName);
    Properties reportTask = extractReportTask(listener, workspace);

    if (reportTask != null) {
      buildInfo.setServerUrl(reportTask.getProperty(SERVER_URL_KEY));
      buildInfo.setUrl(reportTask.getProperty(DASHBOARD_URL_KEY));
      buildInfo.setCeTaskId(reportTask.getProperty(CE_TASK_ID_KEY));
    } else {
      return addBuildInfoFromLastBuildTo(build, installationName, skippedIfNoBuild);
    }

    build.addAction(buildInfo);
    return buildInfo;
  }

  public static SonarAnalysisAction addBuildInfoTo(Run<?, ?> build, TaskListener listener, FilePath workspace, String installationName) throws IOException, InterruptedException {
    return addBuildInfoTo(build, listener, workspace, installationName, false);
  }

  public static SonarAnalysisAction addBuildInfoFromLastBuildTo(Run<?, ?> build, String installationName, boolean isSkipped) {
    Run<?, ?> previousBuild = build.getPreviousBuild();
    if (previousBuild == null) {
      return addEmptyBuildInfo(build, installationName, isSkipped);
    }

    for (SonarAnalysisAction analysis : previousBuild.getActions(SonarAnalysisAction.class)) {
      if (analysis.getUrl() != null && analysis.getInstallationName().equals(installationName)) {
        SonarAnalysisAction copy = new SonarAnalysisAction(analysis);
        copy.setSkipped(isSkipped);
        build.addAction(copy);
        return copy;
      }
    }
    return addEmptyBuildInfo(build, installationName, isSkipped);
  }

  public static SonarAnalysisAction addEmptyBuildInfo(Run<?, ?> build, String installationName, boolean isSkipped) {
    SonarAnalysisAction analysis = new SonarAnalysisAction(installationName);
    analysis.setSkipped(isSkipped);
    build.addAction(analysis);
    return analysis;
  }

  public static String getMavenGoal(String version) {
    Float majorMinor = extractMajorMinor(version);

    if (majorMinor == null || majorMinor >= 3.0) {
      return "org.sonarsource.scanner.maven:sonar-maven-plugin:" + version + ":sonar";
    } else {
      return "org.codehaus.mojo:sonar-maven-plugin:" + version + ":sonar";
    }
  }

  @CheckForNull
  public static Float extractMajorMinor(String version) {
    Pattern p = Pattern.compile("\\d+\\.\\d+");
    Matcher m = p.matcher(version);

    if (m.find()) {
      return Float.parseFloat(m.group());
    }

    return null;
  }
}
