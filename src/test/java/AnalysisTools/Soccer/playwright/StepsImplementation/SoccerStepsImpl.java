package AnalysisTools.Soccer.playwright.StepsImplementation;

import appsCommon.PageInitializers.PageInitializer;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.PlaywrightUtils;
import AnalysisTools.Soccer.playwright.Pages.SoccerPage;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class SoccerStepsImpl extends PageInitializer {

    /**
     * CLICK ON RUN SOCCER BUTTON
     */
    public static void clickOnRunSoccerButton() {
        PlaywrightUtils.page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName(SoccerPage.run_Soccer_Button)).click();
    }

    /**
     * VERIFY SOCCER PAGE
     */
    public static void verifySoccerPage(){
        assertThat(PlaywrightUtils.page).hasTitle(SoccerPage.soccer_Page_Title);
    }

    /**
     * CLICK ON HOME TAB
     */
    public static void clickOnHomeTab() {
        PlaywrightUtils.page.getByRole(AriaRole.TAB, new Page.GetByRoleOptions().setName(SoccerPage.home_Tab)).click();
    }

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
     * CLICK ON MODELS BUTTON
     */
    public static void clickOnModelButton() {
        PlaywrightUtils.page.getByRole(AriaRole.TAB, new Page.GetByRoleOptions().setName(SoccerPage.models_Button)).click();
    }

    /**
     * VERIFY GRAPH ON MODELS PAGE
     */
    public static void verifyGraphOnModels(){
        assertThat(PlaywrightUtils.page.getByRole(AriaRole.IMG, new Page.GetByRoleOptions().setName(SoccerPage.graphs_Model))).isVisible();
    }

    /**
     * USER_CLICK_ON_SOCASSIGN_BUTTON
     */
    public static void ClickOnSocassignButton() {
    PlaywrightUtils.page.getByRole(AriaRole.TAB, new Page.GetByRoleOptions().setName(SoccerPage.socassign_Button)).click();
    }

    /**
     * CLICK ON DOWNLOAD BUTTON
     */
    public static void ClickOnDopwnloadButton() {
        PlaywrightUtils.page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(SoccerPage.download_Button)).click();
        MiscUtils.sleep(5000);}

    /**
     * CLICK ON SOCASSIGN LINK
     */
    public static void ClickOnSocassignLink() {
        PlaywrightUtils.page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(SoccerPage.SOCAssignDownloadLink)).click();}

    /**
     * CLICK ON RESOURCES BUTTON
     */
    public static void ClickOnResourcesButton() {
        PlaywrightUtils.page.getByRole(AriaRole.TAB, new Page.GetByRoleOptions().setName(SoccerPage.resources_Button)).click();}

    /**
     *  CLICK ON HELP BUTTON
     */
    public static void ClickOnHelpButton() {
        PlaywrightUtils.page.getByRole(AriaRole.TAB, new Page.GetByRoleOptions().setName(SoccerPage.help_Button)).click();}

    /**
     * DOWNLOAD SOCASSIGN JAR FILE
     */
    public static void DownloadSocAssignJarFile(){
            PlaywrightUtils.page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Download")).click();
          MiscUtils.sleep(2000);}

    /**
     * CLICK ON DOI LINK IN MODELS PAGE
     */
    public static void clickDOILinkInModelsPage() {
        PlaywrightUtils.page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(SoccerPage.doi_Link)).click();}

    /**
     * CLICK ON COMPUTER BASED CODING LINK
     */
    public static void clickOnComputerBasedCodingLink() {
        PlaywrightUtils.page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(SoccerPage.computer_based_coding_link)).click();
        assertThat(PlaywrightUtils.page).hasTitle(SoccerPage.computer_based_coding_page_title);}

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
        newPage3.close();}

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
                PlaywrightUtils.page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(SoccerPage.doi_Link_help_page)).click();}}}

    /**
     * CLICK ON FAQ BUTTON
     */
    public static void clickOnFAQButton(){
        PlaywrightUtils.page.getByRole(AriaRole.TAB, new Page.GetByRoleOptions().setName(SoccerPage.FAQPage)).click();}

    /**
     * VERIFY FAQ PAGE
     */
    public static void verifyFAQPage(){
        assertThat(PlaywrightUtils.page.getByLabel(SoccerPage.FAQPage).getByRole(AriaRole.HEADING)).containsText(SoccerPage.FAQText);
    }
}
