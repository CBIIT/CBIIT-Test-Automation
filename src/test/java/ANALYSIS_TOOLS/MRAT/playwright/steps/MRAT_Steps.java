package ANALYSIS_TOOLS.MRAT.playwright.steps;

import ANALYSIS_TOOLS.MRAT.playwright.pages.MRATPage;
import ANALYSIS_TOOLS.MRAT.playwright.stepsImplementation.MRATStepsImpl;
import ANALYSIS_TOOLS.MRAT.playwright.utils.MRAT_Constants;
import APPS_COMMON.PageInitializers.PageInitializer;
import APPS_COMMON.PlaywrightUtils.Playwright_Common_Utils;
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

    @Then("User clicks on the github repository link and verify it")
    public void user_clicks_on_the_github_repository_link_and_verify_it() {
        Playwright_Common_Utils.clickAndAssertNewPageTitle(MRATPage.githubRepositoryLocator, MRAT_Constants.GITHUB_REPOSITORY_PAGE_TITLE);
    }

    @Then("User clicks on the terms and condition link and verify it")
    public void user_clicks_on_the_terms_and_condition_link_and_verify_it() {
        MRATStepsImpl.clickTermsAndConditions();
    }

    @Then("User clicks on the high risk of melanoma link and verify it")
    public void user_clicks_on_the_high_risk_of_melanoma_link_and_verify_it() {
        MRATStepsImpl.clickHighRiskMelanoma();
    }

    @Then("User selects some fields in the risk calculator page")
    public void user_selects_some_fields_in_the_risk_calculator_page() {
        PlaywrightUtils.page.locator(MRATPage.riskCalculator).click();
    }

    @Then("User clicks on the reset button in the MRAT website")
    public void user_clicks_on_the_reset_button_in_the_mrat_website() {
        PlaywrightUtils.page.locator(MRATPage.resetLocator).click();
    }

    @Then("User clicks on the home link and verify it in the MRAT")
    public void user_clicks_on_the_home_link_and_verify_it_in_the_mrat() {
        Playwright_Common_Utils.clickAndAssertNewPageTitle(MRATPage.homeLink, MRAT_Constants.HOME_PAGE_TITLE);
    }

    @Then("User clicks on the contact link and verify it in the MRAT")
    public void user_clicks_on_the_contact_link_and_verify_it_in_the_mrat() {
        Playwright_Common_Utils.clickAndAssertNewPageTitle(MRATPage.contactLocator,MRAT_Constants.CONTACT_PAGE_TITLE);
    }

    @Then("User clicks on the policies link and verify it in the MRAT")
    public void user_clicks_on_the_policies_link_and_verify_it_in_the_mrat() {
        Playwright_Common_Utils.clickAndAssertNewPageTitle(MRATPage.policiesLocator,MRAT_Constants.POLICIES_PAGE_TITLE);
    }

    @Then("User clicks on the HHS Vulnerability Disclosure link and verify it in the MRAT")
    public void user_clicks_on_the_hhs_vulnerability_disclosure_link_and_verify_it_in_the_mrat() {
        Playwright_Common_Utils.clickAndAssertNewPage(MRATPage.HHSLocator,MRAT_Constants.HHS_PAGE_URL);
    }

    @Then("User clicks on the Accessibility link and verify it in the MRAT")
    public void user_clicks_on_the_accessibility_link_and_verify_it_in_the_mrat() {
        Playwright_Common_Utils.clickAndAssertNewPageTitle(MRATPage.accessibilityLocator,MRAT_Constants.ACCESSIBILITY_PAGE_TITLE);
    }

    @Then("User clicks on the US Department of HHS link and verify it in the MRAT")
    public void user_clicks_on_the_us_department_of_hhs_link_and_verify_it_in_the_mrat() {
        Playwright_Common_Utils.clickAndAssertNewPage(MRATPage.USDeptHHSLocator,MRAT_Constants.US_DEPARTMENT_PAGE_URL);
    }

    @Then("User clicks on the NIH link and verify it in the MRAT")
    public void user_clicks_on_the_nih_link_and_verify_it_in_the_mrat() {
        Playwright_Common_Utils.clickAndAssertNewPageTitle(MRATPage.NIHLocator,MRAT_Constants.NIH_PAGE_TITLE);
    }

    @Then("User clicks on the NCI link and verify it in the MRAT")
    public void user_clicks_on_the_nci_link_and_verify_it_in_the_mrat() {
        Playwright_Common_Utils.clickAndAssertNewPageTitle(MRATPage.NCIPage,MRAT_Constants.NCI_PAGE_TITLE);
    }

    @Then("User clicks on the USA gov link and verify it in the MRAT")
    public void user_clicks_on_the_usa_gov_link_and_verify_it_in_the_mrat() {
        Playwright_Common_Utils.clickAndAssertNewPage(MRATPage.USAGov,MRAT_Constants.USA_GOV_PAGE_URL);
    }

    @Then("User enters all the required details for risk calculation")
    public void user_enters_all_the_required_details_for_risk_calculation() {
        MRATStepsImpl.enterRequiredDetailsForRiskCalculation();
    }

    @Then("User clicks on the calculate risk button in the MRAT")
    public void user_clicks_on_the_calculate_risk_button_in_the_mrat() {
        PlaywrightUtils.page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName(MRATPage.calculateRiskLocator)).click();
    }

    @Then("Verify calculate risk button is visible and risk is not calculated")
    public void verify_calculate_risk_button_is_visible_and_risk_is_not_calculated() {
        assertThat(PlaywrightUtils.page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName(MRATPage.calculateRiskLocator))).isVisible();
    }
}