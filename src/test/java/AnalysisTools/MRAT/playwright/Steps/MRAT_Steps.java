package AnalysisTools.MRAT.playwright.Steps;

import AnalysisTools.MRAT.playwright.Pages.MRATPage;
import AnalysisTools.MRAT.playwright.StepsImplementation.MRATStepsImpl;
import AnalysisTools.MRAT.playwright.Utils.MRAT_Constants;
import appsCommon.PageInitializers.PageInitializer;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.PlaywrightUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import static com.nci.automation.web.TestProperties.getMRATUrl;

public class MRAT_Steps extends PageInitializer {

    @Given("User navigates to the MRAT Website")
    public void user_navigates_to_the_mrat_website() {
        PlaywrightUtils.page.navigate(getMRATUrl());
        CommonUtils.sleep(2000);
    }

    @Then("User clicks on the MRAT link")
    public void user_clicks_on_the_mrat_link() {
        PlaywrightUtils.page.locator(MRATPage.mratPageLink).click();
    }

    @Then("Verify User is on the MRAT calculator page")
    public void verify_user_is_on_the_mrat_calculator_page() {
        assertThat(PlaywrightUtils.page).hasTitle(MRAT_Constants.MRAT_PAGE_TITLE);
    }

    @Then("User clicks on the about the calculator tab in the MRAT Website")
    public void user_clicks_on_the_about_the_calculator_tab_in_the_mrat_website() {
        PlaywrightUtils.page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(MRATPage.aboutTheCalculatorLocator)).click();
    }

    @Then("User clicks on the risk calculator tab in the MRAT Website")
    public void user_clicks_on_the_risk_calculator_tab_in_the_mrat_website() {
        PlaywrightUtils.page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(MRATPage.riskCalculatorLocator)).click();
    }

    @Then("Verify User is on the risk calculator tab of the MRAT Website")
    public void verify_user_is_on_the_risk_calculator_tab_of_the_mrat_website() {
        assertThat(PlaywrightUtils.page).hasTitle(MRAT_Constants.RISK_CALCULATOR_TAB_TITLE);
    }

    @Then("Verify User is on the about the calculator tab of the MRAT Website")
    public void verify_user_is_on_the_about_the_calculator_tab_of_the_mrat_website() {
        assertThat(PlaywrightUtils.page).hasTitle(MRAT_Constants.CALCULATOR_TAB_TITLE);
    }

    @Then("User clicks on the skin cancer link")
    public void user_clicks_on_the_skin_cancer_link() {
        MRATStepsImpl.clickSkinCancerLink();
    }

    @Then("User clicks on the Melanoma vs Mole link")
    public void user_clicks_on_the_melanoma_vs_mole_link() {
        MRATStepsImpl.clickMelanomaVsMoleLink();
    }

    @Then("User clicks on the common moles link")
    public void user_clicks_on_the_common_moles_link() {
        MRATStepsImpl.clickCommonMolesLink();
    }

    @Then("User clicks on the CCT for Melanoma Prevention link")
    public void user_clicks_on_the_cct_for_melanoma_prevention_link() {
        MRATStepsImpl.clickCCTMelanomaPreventionLink();
    }

    @Then("User clicks on the What Does Melanoma Look Like link")
    public void user_clicks_on_the_what_does_melanoma_look_like_link() {
        MRATStepsImpl.clickWhatDoesMelanomaLookLikeLink();
    }
}