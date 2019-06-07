// CHECKSTYLE:OFF

package hudson.plugins.sonar;

import org.jvnet.localizer.Localizable;
import org.jvnet.localizer.ResourceBundleHolder;
import org.kohsuke.accmod.Restricted;


/**
 * Generated localization support class.
 * 
 */
@SuppressWarnings({
    "",
    "PMD",
    "all"
})
@Restricted(org.kohsuke.accmod.restrictions.NoExternalUse.class)
public class Messages {

    /**
     * The resource bundle reference
     * 
     */
    private final static ResourceBundleHolder holder = ResourceBundleHolder.get(Messages.class);

    /**
     * Key {@code SonarScanner.ExecFailed}: {@code command execution
     * failed.}.
     * 
     * @return
     *     {@code command execution failed.}
     */
    public static String SonarScanner_ExecFailed() {
        return holder.format("SonarScanner.ExecFailed");
    }

    /**
     * Key {@code SonarScanner.ExecFailed}: {@code command execution
     * failed.}.
     * 
     * @return
     *     {@code command execution failed.}
     */
    public static Localizable _SonarScanner_ExecFailed() {
        return new Localizable(holder, "SonarScanner.ExecFailed");
    }

    /**
     * Key {@code SonarBuildWrapper.Injecting}: {@code Injecting SonarQube
     * environment variables using the configuration: {0}}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Injecting SonarQube environment variables using the
     *     configuration: {0}}
     */
    public static String SonarBuildWrapper_Injecting(Object arg0) {
        return holder.format("SonarBuildWrapper.Injecting", arg0);
    }

    /**
     * Key {@code SonarBuildWrapper.Injecting}: {@code Injecting SonarQube
     * environment variables using the configuration: {0}}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Injecting SonarQube environment variables using the
     *     configuration: {0}}
     */
    public static Localizable _SonarBuildWrapper_Injecting(Object arg0) {
        return new Localizable(holder, "SonarBuildWrapper.Injecting", arg0);
    }

    /**
     * Key {@code SonarScanner.ExecutableNotFound}: {@code SonarQube Scanner
     * executable was not found for {0}}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code SonarQube Scanner executable was not found for {0}}
     */
    public static String SonarScanner_ExecutableNotFound(Object arg0) {
        return holder.format("SonarScanner.ExecutableNotFound", arg0);
    }

    /**
     * Key {@code SonarScanner.ExecutableNotFound}: {@code SonarQube Scanner
     * executable was not found for {0}}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code SonarQube Scanner executable was not found for {0}}
     */
    public static Localizable _SonarScanner_ExecutableNotFound(Object arg0) {
        return new Localizable(holder, "SonarScanner.ExecutableNotFound", arg0);
    }

    /**
     * Key {@code MsBuildScannerEnd.DisplayName}: {@code SonarScanner for
     * MSBuild - End Analysis}.
     * 
     * @return
     *     {@code SonarScanner for MSBuild - End Analysis}
     */
    public static String MsBuildScannerEnd_DisplayName() {
        return holder.format("MsBuildScannerEnd.DisplayName");
    }

    /**
     * Key {@code MsBuildScannerEnd.DisplayName}: {@code SonarScanner for
     * MSBuild - End Analysis}.
     * 
     * @return
     *     {@code SonarScanner for MSBuild - End Analysis}
     */
    public static Localizable _MsBuildScannerEnd_DisplayName() {
        return new Localizable(holder, "MsBuildScannerEnd.DisplayName");
    }

    /**
     * Key {@code SonarInstallation.NoMatchInstallation}: {@code SonarQube
     * installation defined in this job ({0}) does not match any configured
     * installation. Number of installations that can be configured: {1}.}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code SonarQube installation defined in this job ({0}) does not match
     *     any configured installation. Number of installations that can be
     *     configured: {1}.}
     */
    public static String SonarInstallation_NoMatchInstallation(Object arg0, Object arg1) {
        return holder.format("SonarInstallation.NoMatchInstallation", arg0, arg1);
    }

    /**
     * Key {@code SonarInstallation.NoMatchInstallation}: {@code SonarQube
     * installation defined in this job ({0}) does not match any configured
     * installation. Number of installations that can be configured: {1}.}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code SonarQube installation defined in this job ({0}) does not match
     *     any configured installation. Number of installations that can be
     *     configured: {1}.}
     */
    public static Localizable _SonarInstallation_NoMatchInstallation(Object arg0, Object arg1) {
        return new Localizable(holder, "SonarInstallation.NoMatchInstallation", arg0, arg1);
    }

    /**
     * Key {@code SonarBuildWrapper.MaskingPasswords}: {@code Masking
     * SonarQube passwords}.
     * 
     * @return
     *     {@code Masking SonarQube passwords}
     */
    public static String SonarBuildWrapper_MaskingPasswords() {
        return holder.format("SonarBuildWrapper.MaskingPasswords");
    }

    /**
     * Key {@code SonarBuildWrapper.MaskingPasswords}: {@code Masking
     * SonarQube passwords}.
     * 
     * @return
     *     {@code Masking SonarQube passwords}
     */
    public static Localizable _SonarBuildWrapper_MaskingPasswords() {
        return new Localizable(holder, "SonarBuildWrapper.MaskingPasswords");
    }

    /**
     * Key {@code SonarGlobalConfiguration.MandatoryProperty}: {@code This
     * property is mandatory.}.
     * 
     * @return
     *     {@code This property is mandatory.}
     */
    public static String SonarGlobalConfiguration_MandatoryProperty() {
        return holder.format("SonarGlobalConfiguration.MandatoryProperty");
    }

    /**
     * Key {@code SonarGlobalConfiguration.MandatoryProperty}: {@code This
     * property is mandatory.}.
     * 
     * @return
     *     {@code This property is mandatory.}
     */
    public static Localizable _SonarGlobalConfiguration_MandatoryProperty() {
        return new Localizable(holder, "SonarGlobalConfiguration.MandatoryProperty");
    }

    /**
     * Key {@code SonarInstallation.NoInstallation}: {@code No SonarQube
     * installation assigned for this job. There are {0} available
     * installations that can be configured.}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code No SonarQube installation assigned for this job. There are {0}
     *     available installations that can be configured.}
     */
    public static String SonarInstallation_NoInstallation(Object arg0) {
        return holder.format("SonarInstallation.NoInstallation", arg0);
    }

    /**
     * Key {@code SonarInstallation.NoInstallation}: {@code No SonarQube
     * installation assigned for this job. There are {0} available
     * installations that can be configured.}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code No SonarQube installation assigned for this job. There are {0}
     *     available installations that can be configured.}
     */
    public static Localizable _SonarInstallation_NoInstallation(Object arg0) {
        return new Localizable(holder, "SonarInstallation.NoInstallation", arg0);
    }

    /**
     * Key {@code SonarBuildWrapper.DisplayName}: {@code Prepare SonarQube
     * Scanner environment}.
     * 
     * @return
     *     {@code Prepare SonarQube Scanner environment}
     */
    public static String SonarBuildWrapper_DisplayName() {
        return holder.format("SonarBuildWrapper.DisplayName");
    }

    /**
     * Key {@code SonarBuildWrapper.DisplayName}: {@code Prepare SonarQube
     * Scanner environment}.
     * 
     * @return
     *     {@code Prepare SonarQube Scanner environment}
     */
    public static Localizable _SonarBuildWrapper_DisplayName() {
        return new Localizable(holder, "SonarBuildWrapper.DisplayName");
    }

    /**
     * Key {@code MsBuildScanner.ExecutableNotFound}: {@code SonarScanner for
     * MSBuild executable was not found for {0}}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code SonarScanner for MSBuild executable was not found for {0}}
     */
    public static String MsBuildScanner_ExecutableNotFound(Object arg0) {
        return holder.format("MsBuildScanner.ExecutableNotFound", arg0);
    }

    /**
     * Key {@code MsBuildScanner.ExecutableNotFound}: {@code SonarScanner for
     * MSBuild executable was not found for {0}}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code SonarScanner for MSBuild executable was not found for {0}}
     */
    public static Localizable _MsBuildScanner_ExecutableNotFound(Object arg0) {
        return new Localizable(holder, "MsBuildScanner.ExecutableNotFound", arg0);
    }

    /**
     * Key {@code InstallFromMavenCentral}: {@code Install from Maven
     * Central}.
     * 
     * @return
     *     {@code Install from Maven Central}
     */
    public static String InstallFromMavenCentral() {
        return holder.format("InstallFromMavenCentral");
    }

    /**
     * Key {@code InstallFromMavenCentral}: {@code Install from Maven
     * Central}.
     * 
     * @return
     *     {@code Install from Maven Central}
     */
    public static Localizable _InstallFromMavenCentral() {
        return new Localizable(holder, "InstallFromMavenCentral");
    }

    /**
     * Key {@code SonarScanner.GlobalConfigNeeded}: {@code Maybe you need to
     * configure where your SonarQube Scanner installations are?}.
     * 
     * @return
     *     {@code Maybe you need to configure where your SonarQube Scanner
     *     installations are?}
     */
    public static String SonarScanner_GlobalConfigNeeded() {
        return holder.format("SonarScanner.GlobalConfigNeeded");
    }

    /**
     * Key {@code SonarScanner.GlobalConfigNeeded}: {@code Maybe you need to
     * configure where your SonarQube Scanner installations are?}.
     * 
     * @return
     *     {@code Maybe you need to configure where your SonarQube Scanner
     *     installations are?}
     */
    public static Localizable _SonarScanner_GlobalConfigNeeded() {
        return new Localizable(holder, "SonarScanner.GlobalConfigNeeded");
    }

    /**
     * Key {@code BuildSonarAction.Tooltip}: {@code Analyzed by SonarQube}.
     * 
     * @return
     *     {@code Analyzed by SonarQube}
     */
    public static String BuildSonarAction_Tooltip() {
        return holder.format("BuildSonarAction.Tooltip");
    }

    /**
     * Key {@code BuildSonarAction.Tooltip}: {@code Analyzed by SonarQube}.
     * 
     * @return
     *     {@code Analyzed by SonarQube}
     */
    public static Localizable _BuildSonarAction_Tooltip() {
        return new Localizable(holder, "BuildSonarAction.Tooltip");
    }

    /**
     * Key {@code SonarAction.Sonar}: {@code SonarQube}.
     * 
     * @return
     *     {@code SonarQube}
     */
    public static String SonarAction_Sonar() {
        return holder.format("SonarAction.Sonar");
    }

    /**
     * Key {@code SonarAction.Sonar}: {@code SonarQube}.
     * 
     * @return
     *     {@code SonarQube}
     */
    public static Localizable _SonarAction_Sonar() {
        return new Localizable(holder, "SonarAction.Sonar");
    }

    /**
     * Key {@code MSBuildScanner.ExecFailed}: {@code Execution of
     * SonarScanner for MSBuild failed (exit code {0})}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Execution of SonarScanner for MSBuild failed (exit code {0})}
     */
    public static String MSBuildScanner_ExecFailed(Object arg0) {
        return holder.format("MSBuildScanner.ExecFailed", arg0);
    }

    /**
     * Key {@code MSBuildScanner.ExecFailed}: {@code Execution of
     * SonarScanner for MSBuild failed (exit code {0})}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Execution of SonarScanner for MSBuild failed (exit code {0})}
     */
    public static Localizable _MSBuildScanner_ExecFailed(Object arg0) {
        return new Localizable(holder, "MSBuildScanner.ExecFailed", arg0);
    }

    /**
     * Key {@code SonarInstallation.FixInstallationTip}: {@code If you want
     * to reassign jobs to a different SonarQube installation, check the
     * documentation under
     * https://redirect.sonarsource.com/plugins/jenkins.html}.
     * 
     * @return
     *     {@code If you want to reassign jobs to a different SonarQube
     *     installation, check the documentation under
     *     https://redirect.sonarsource.com/plugins/jenkins.html}
     */
    public static String SonarInstallation_FixInstallationTip() {
        return holder.format("SonarInstallation.FixInstallationTip");
    }

    /**
     * Key {@code SonarInstallation.FixInstallationTip}: {@code If you want
     * to reassign jobs to a different SonarQube installation, check the
     * documentation under
     * https://redirect.sonarsource.com/plugins/jenkins.html}.
     * 
     * @return
     *     {@code If you want to reassign jobs to a different SonarQube
     *     installation, check the documentation under
     *     https://redirect.sonarsource.com/plugins/jenkins.html}
     */
    public static Localizable _SonarInstallation_FixInstallationTip() {
        return new Localizable(holder, "SonarInstallation.FixInstallationTip");
    }

    /**
     * Key {@code MsBuildScanner.NoInstallation}: {@code No SonarScanner for
     * MSBuild installation found, trying to execute from PATH}.
     * 
     * @return
     *     {@code No SonarScanner for MSBuild installation found, trying to
     *     execute from PATH}
     */
    public static String MsBuildScanner_NoInstallation() {
        return holder.format("MsBuildScanner.NoInstallation");
    }

    /**
     * Key {@code MsBuildScanner.NoInstallation}: {@code No SonarScanner for
     * MSBuild installation found, trying to execute from PATH}.
     * 
     * @return
     *     {@code No SonarScanner for MSBuild installation found, trying to
     *     execute from PATH}
     */
    public static Localizable _MsBuildScanner_NoInstallation() {
        return new Localizable(holder, "MsBuildScanner.NoInstallation");
    }

    /**
     * Key {@code MsBuildScannerEnd.NoBeginStep}: {@code Missing parameters
     * in the build environment. Was the begin step invoked before?}.
     * 
     * @return
     *     {@code Missing parameters in the build environment. Was the begin step
     *     invoked before?}
     */
    public static String MsBuildScannerEnd_NoBeginStep() {
        return holder.format("MsBuildScannerEnd.NoBeginStep");
    }

    /**
     * Key {@code MsBuildScannerEnd.NoBeginStep}: {@code Missing parameters
     * in the build environment. Was the begin step invoked before?}.
     * 
     * @return
     *     {@code Missing parameters in the build environment. Was the begin step
     *     invoked before?}
     */
    public static Localizable _MsBuildScannerEnd_NoBeginStep() {
        return new Localizable(holder, "MsBuildScannerEnd.NoBeginStep");
    }

    /**
     * Key {@code SonarPublisher.DisplayName}: {@code SonarQube analysis with
     * Maven}.
     * 
     * @return
     *     {@code SonarQube analysis with Maven}
     */
    public static String SonarPublisher_DisplayName() {
        return holder.format("SonarPublisher.DisplayName");
    }

    /**
     * Key {@code SonarPublisher.DisplayName}: {@code SonarQube analysis with
     * Maven}.
     * 
     * @return
     *     {@code SonarQube analysis with Maven}
     */
    public static Localizable _SonarPublisher_DisplayName() {
        return new Localizable(holder, "SonarPublisher.DisplayName");
    }

    /**
     * Key {@code Skipping_Sonar_analysis}: {@code Skipping SonarQube
     * analysis}.
     * 
     * @return
     *     {@code Skipping SonarQube analysis}
     */
    public static String Skipping_Sonar_analysis() {
        return holder.format("Skipping_Sonar_analysis");
    }

    /**
     * Key {@code Skipping_Sonar_analysis}: {@code Skipping SonarQube
     * analysis}.
     * 
     * @return
     *     {@code Skipping SonarQube analysis}
     */
    public static Localizable _Skipping_Sonar_analysis() {
        return new Localizable(holder, "Skipping_Sonar_analysis");
    }

    /**
     * Key {@code SonarScannerBuilder.DisplayName}: {@code Execute SonarQube
     * Scanner}.
     * 
     * @return
     *     {@code Execute SonarQube Scanner}
     */
    public static String SonarScannerBuilder_DisplayName() {
        return holder.format("SonarScannerBuilder.DisplayName");
    }

    /**
     * Key {@code SonarScannerBuilder.DisplayName}: {@code Execute SonarQube
     * Scanner}.
     * 
     * @return
     *     {@code Execute SonarQube Scanner}
     */
    public static Localizable _SonarScannerBuilder_DisplayName() {
        return new Localizable(holder, "SonarScannerBuilder.DisplayName");
    }

    /**
     * Key {@code InstallFromGitHub}: {@code Install from GitHub}.
     * 
     * @return
     *     {@code Install from GitHub}
     */
    public static String InstallFromGitHub() {
        return holder.format("InstallFromGitHub");
    }

    /**
     * Key {@code InstallFromGitHub}: {@code Install from GitHub}.
     * 
     * @return
     *     {@code Install from GitHub}
     */
    public static Localizable _InstallFromGitHub() {
        return new Localizable(holder, "InstallFromGitHub");
    }

    /**
     * Key {@code SonarPublisher.NoMavenInstallation}: {@code No Maven
     * installation found. Call the 'mvn' executable from path}.
     * 
     * @return
     *     {@code No Maven installation found. Call the 'mvn' executable from
     *     path}
     */
    public static String SonarPublisher_NoMavenInstallation() {
        return holder.format("SonarPublisher.NoMavenInstallation");
    }

    /**
     * Key {@code SonarPublisher.NoMavenInstallation}: {@code No Maven
     * installation found. Call the 'mvn' executable from path}.
     * 
     * @return
     *     {@code No Maven installation found. Call the 'mvn' executable from
     *     path}
     */
    public static Localizable _SonarPublisher_NoMavenInstallation() {
        return new Localizable(holder, "SonarPublisher.NoMavenInstallation");
    }

    /**
     * Key {@code MsBuildScannerBegin.DisplayName}: {@code SonarScanner for
     * MSBuild - Begin Analysis}.
     * 
     * @return
     *     {@code SonarScanner for MSBuild - Begin Analysis}
     */
    public static String MsBuildScannerBegin_DisplayName() {
        return holder.format("MsBuildScannerBegin.DisplayName");
    }

    /**
     * Key {@code MsBuildScannerBegin.DisplayName}: {@code SonarScanner for
     * MSBuild - Begin Analysis}.
     * 
     * @return
     *     {@code SonarScanner for MSBuild - Begin Analysis}
     */
    public static Localizable _MsBuildScannerBegin_DisplayName() {
        return new Localizable(holder, "MsBuildScannerBegin.DisplayName");
    }

    /**
     * Key {@code SonarPublisher.BadBuildStatus}: {@code Skipping sonar
     * analysis due to bad build status {0}}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Skipping sonar analysis due to bad build status {0}}
     */
    public static String SonarPublisher_BadBuildStatus(Object arg0) {
        return holder.format("SonarPublisher.BadBuildStatus", arg0);
    }

    /**
     * Key {@code SonarPublisher.BadBuildStatus}: {@code Skipping sonar
     * analysis due to bad build status {0}}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Skipping sonar analysis due to bad build status {0}}
     */
    public static Localizable _SonarPublisher_BadBuildStatus(Object arg0) {
        return new Localizable(holder, "SonarPublisher.BadBuildStatus", arg0);
    }

}
