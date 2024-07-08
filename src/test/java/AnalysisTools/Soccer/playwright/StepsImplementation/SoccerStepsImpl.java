package AnalysisTools.Soccer.playwright.StepsImplementation;

import AnalysisTools.Soccer.playwright.Utils.Soccer_Constants;
import appsCommon.PageInitializers.PageInitializer;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.PlaywrightUtils;
import AnalysisTools.Soccer.playwright.Pages.SoccerPage;
import java.nio.file.Paths;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class SoccerStepsImpl extends PageInitializer {

    /**
     * CLICK ON DOI LINK
     */
    public static void clickDOILink() {
        PlaywrightUtils.page.getByRole(AriaRole.TAB, new Page.GetByRoleOptions().setName(SoccerPage.home_Tab)).click();
        PlaywrightUtils.page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(SoccerPage.doi_Link)).click();
    }

    /**
     * VALIDATE ACADEMIC TAB OPENED ON CLICKING DOI LINK
     */
    public static void validateOxfordAcademicTab() {
        MiscUtils.sleep(4000);
        PlaywrightUtils.context.onPage(newPage -> {newPage.waitForLoadState();
            assertThat(newPage).hasTitle(SoccerPage.academic_Page_Title);});
    }

    /**
     * DOWNLOAD SOCASSIGN JAR FILE
     */
    public static void DownloadSocAssignJarFile(){
        PlaywrightUtils.page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Download")).click();
        MiscUtils.sleep(2000);
    }

    /**
     * CLICK ON COMPUTER BASED CODING LINK
     */
    public static void clickOnComputerBasedCodingLink() {
        PlaywrightUtils.page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(SoccerPage.computer_based_coding_link)).click();
        assertThat(PlaywrightUtils.page).hasTitle(SoccerPage.computer_based_coding_page_title);
    }

    /**
     * CLICK ON ALL HYPERLINKS AND VERIFY ALSO
     */
    public static void clickOnAllHyperlinksAndVerify(){
        MiscUtils.sleep(2000);
        Page newPage = PlaywrightUtils.context.waitForPage(() -> {
                    PlaywrightUtils.page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(SoccerPage.soc_2010_system)).click();});
        assertThat(newPage).hasTitle(SoccerPage.soc_2010_system_page_title);newPage.close();
        MiscUtils.sleep(4000);
        Page newPage1 = PlaywrightUtils.context.waitForPage(() -> {
            PlaywrightUtils.page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(SoccerPage.sic_1987_system)).click();});
        assertThat(newPage1).hasTitle( SoccerPage.sic_1987_page_title);newPage1.close();
        MiscUtils.sleep(4000);
        Page newPage2 = PlaywrightUtils.context.waitForPage(() -> {
            PlaywrightUtils.page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(SoccerPage.onet_online)).click();});
        assertThat(newPage2).hasTitle( SoccerPage.onet_online_title);newPage2.close();
        MiscUtils.sleep(4000);
        Page newPage3 = PlaywrightUtils.context.waitForPage(() -> {
            PlaywrightUtils.page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(SoccerPage.nioccs)).click();});
        assertThat(newPage3).hasURL(SoccerPage.nioccs_url);
        newPage3.close();
    }

    /**
     * VALIDATE ALL SECTIONS IN HELP PAGE
     *
     * @param sections
     */
    public static void validateAllSections(Integer sections){
        for(int i = 0;i<sections;i++) {
            if (i == 0) {
                PlaywrightUtils.page.getByRole(AriaRole.TAB, new Page.GetByRoleOptions().setName(SoccerPage.soccer10Tab)).click();
                MiscUtils.sleep(2000);
                assertThat(PlaywrightUtils.page.getByText(SoccerPage.warningText)).isVisible();
                assertThat(PlaywrightUtils.page.getByRole(AriaRole.CELL, new Page.GetByRoleOptions().setName("\"formulate lesson plans, teach 11th grade match"))).isVisible();
            }else if(i == 1){
                PlaywrightUtils.page.getByRole(AriaRole.TAB, new Page.GetByRoleOptions().setName(SoccerPage.soccer19Tab)).click();
                assertThat(PlaywrightUtils.page.getByLabel(SoccerPage.soccer19Tab).locator("div")).containsText("We recomend use of the most recent version, SOCcer 2.0, which has improved accuracy. See the warning under the Models tab.");
                PlaywrightUtils.page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(SoccerPage.oemedLInk)).click();
                PlaywrightUtils.page.navigate(EnvUtils.getApplicationUrl("Soccer"));
                PlaywrightUtils.page.getByRole(AriaRole.TAB, new Page.GetByRoleOptions().setName(SoccerPage.help_Button)).click();
                PlaywrightUtils.page.getByRole(AriaRole.TAB, new Page.GetByRoleOptions().setName(SoccerPage.soccer19Tab)).click();
                PlaywrightUtils.page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("[Pubmed Central]")).first().click();
                PlaywrightUtils.page.navigate(EnvUtils.getApplicationUrl("Soccer"));
                PlaywrightUtils.page.getByRole(AriaRole.TAB, new Page.GetByRoleOptions().setName(SoccerPage.help_Button)).click();
                PlaywrightUtils.page.getByRole(AriaRole.TAB, new Page.GetByRoleOptions().setName(SoccerPage.soccer19Tab)).click();
                PlaywrightUtils.page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(SoccerPage.cbms_Link)).click();
                PlaywrightUtils.page.navigate(EnvUtils.getApplicationUrl("Soccer"));
                PlaywrightUtils.page.getByRole(AriaRole.TAB, new Page.GetByRoleOptions().setName(SoccerPage.help_Button)).click();
                PlaywrightUtils.page.getByRole(AriaRole.TAB, new Page.GetByRoleOptions().setName(SoccerPage.soccer19Tab)).click();
                PlaywrightUtils.page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(SoccerPage.doi_Link_help_page)).click();
                PlaywrightUtils.page.navigate(EnvUtils.getApplicationUrl("Soccer"));
                PlaywrightUtils.page.getByRole(AriaRole.TAB, new Page.GetByRoleOptions().setName(SoccerPage.help_Button)).click();
            }else{
                MiscUtils.sleep(2000);
                PlaywrightUtils.page.getByRole(AriaRole.TAB, new Page.GetByRoleOptions().setName(SoccerPage.soccer2Tab)).click();
                assertThat(PlaywrightUtils.page.getByText("SOCcer 2.0 requires data in")).isVisible();
                PlaywrightUtils.page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(SoccerPage.oemedLInk)).click();
                PlaywrightUtils.page.navigate(EnvUtils.getApplicationUrl("Soccer"));
                PlaywrightUtils.page.getByRole(AriaRole.TAB, new Page.GetByRoleOptions().setName(SoccerPage.help_Button)).click();
                PlaywrightUtils.page.getByRole(AriaRole.TAB, new Page.GetByRoleOptions().setName(SoccerPage.soccer2Tab)).click();
                PlaywrightUtils.page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(SoccerPage.cbms_Link)).click();
                PlaywrightUtils.page.navigate(EnvUtils.getApplicationUrl("Soccer"));
                PlaywrightUtils.page.getByRole(AriaRole.TAB, new Page.GetByRoleOptions().setName(SoccerPage.help_Button)).click();
                PlaywrightUtils.page.getByRole(AriaRole.TAB, new Page.GetByRoleOptions().setName(SoccerPage.soccer2Tab)).click();
                PlaywrightUtils.page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(SoccerPage.doi_Link_help_page)).click();
                PlaywrightUtils.page.navigate(EnvUtils.getApplicationUrl("Soccer"));}}}

    /**
     * CLICK SOCCER BUTTON
     */
    public static void clickSoccerButton(){
        PlaywrightUtils.page.getByRole(AriaRole.TAB, new Page.GetByRoleOptions().setName(SoccerPage.soccerButton)).click();
        MiscUtils.sleep(2000);
    }

    /**
     * UPLOAD A FILE
     */
    public static void uploadFile(){
        PlaywrightUtils.page.getByLabel("Input File").setInputFiles(Paths.get(Soccer_Constants.UPLOAD_FILE_PATH));
        MiscUtils.sleep(2000);
    }

    /**
     * CLICK SUBMIT BUTTON
     */
    public static void clickSubmitButton(){
        PlaywrightUtils.page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName(SoccerPage.submitButton)).click();
        MiscUtils.sleep(8000);
    }

    /**
     * CLICK DOWNLOAD RESULTS
     */
    public static void clickDownloadResults(){
        PlaywrightUtils.page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName(SoccerPage.downloadResults)).click();
        MiscUtils.sleep(2000);
    }

    /**
     * CLICK DOWNLOAD RESULTS
     */
    public static void selectFirstVersion(){
        PlaywrightUtils.page.getByLabel(SoccerPage.soccerModel).selectOption(SoccerPage.modelVersion);
        MiscUtils.sleep(2000);
    }

    /**
     * CLICK JOB CHECKBOX AND ADD THE EMAIL
     */
    public static void clicksOnJobCheckBoxAndAddsEmail(){
        PlaywrightUtils.page.getByLabel(SoccerPage.submitCheckbox).check();
        PlaywrightUtils. page.getByPlaceholder(SoccerPage.enterEmail).click();
        PlaywrightUtils. page.getByPlaceholder(SoccerPage.enterEmail).fill(SoccerPage.email);
    }

    /**
     * VERIFY JOB IS SUBMITTED
     */
    public static void verifyJobSubmitted(){
        assertThat(PlaywrightUtils.page.locator("#successAlert")).containsText(SoccerPage.jobSubmitted);
        MiscUtils.sleep(2000);
    }

    /**
     * CLICK USA GOV LINK AND VERIFY IT
     */
    public static void verifyUSAgovLink(){
        Page newPage1 = PlaywrightUtils.context.waitForPage(() -> {
            MiscUtils.sleep(2000);
            PlaywrightUtils.page.locator(SoccerPage.USAGov).click();});
        MiscUtils.sleep(2000);
        assertThat(newPage1).hasURL(Soccer_Constants.USA_GOV_LINK);newPage1.close();
        }
    }

