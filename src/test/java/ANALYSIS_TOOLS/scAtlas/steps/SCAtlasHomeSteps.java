package ANALYSIS_TOOLS.scAtlas.steps;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;
import APPS_COMMON.PageInitializers.PageInitializer;
import io.cucumber.java.en.*;
import static com.nci.automation.web.TestProperties.getScatlasUrl;

public class SCAtlasHomeSteps extends PageInitializer {

    @Given("the user is on the scAtlas home page")
    public void the_user_is_on_the_sc_atlas_home_page() {
        WebDriverUtils.webDriver.get(getScatlasUrl());
        CommonUtils.sleep(2000);
    }

    @When("the user clicks Sequential NCI-Clarity window")
    public void the_user_clicks_sequential_nci_clarity_window() {
        CommonUtils.clickOnElement(scAtlasHomePage.sequentialNciClarityWindow);
    }

    @Then("the {string} tab is displayed but the {string} tab is not displayed")
    public void the_tab_is_displayed_but_the_tab_is_not_displayed(String tumorCellCommunity, String tCell) {
        CommonUtils.sleep(5000);
        CommonUtils.assertTrue(scAtlasCohortsPage.tumorCellCommunityTab.isDisplayed());
    }

    @When("the user clicks Multi-Regional window")
    public void the_user_clicks_multi_regional_window() {
        CommonUtils.clickOnElement(scAtlasHomePage.multiRegionalWindow);
    }

    @When("the user clicks NCI-CLARITY window")
    public void the_user_clicks_nci_clarity_window() {
        CommonUtils.clickOnElement(scAtlasHomePage.nciClarityWindow);
    }

    @Then("the {string} and {string} tabs are displayed")
    public void the_and_tabs_are_displayed(String tumorCellCommunity, String tCell) {
        CommonUtils.sleep(5000);
        CommonUtils.assertTrue(scAtlasCohortsPage.tumorCellCommunityTab.isDisplayed());
        CommonUtils.assertEquals(scAtlasCohortsPage.tumorCellCommunityTab.getText(),tumorCellCommunity);
        CommonUtils.assertTrue(scAtlasCohortsPage.tCellTab.isDisplayed());
        CommonUtils.assertEquals(scAtlasCohortsPage.tCellTab.getText(),tCell);
    }
}