package ANALYSIS_TOOLS.BCRAT.playwright.steps;

import ANALYSIS_TOOLS.BCRAT.playwright.pages.BCRATPage;
import ANALYSIS_TOOLS.BCRAT.playwright.stepsImplementation.BCRATStepsImpl;
import ANALYSIS_TOOLS.BCRAT.playwright.utils.BCRAT_Constants;
import APPS_COMMON.PageInitializers.PageInitializer;
import APPS_COMMON.PlaywrightUtils.Playwright_Common_Utils;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.PlaywrightUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import static com.nci.automation.web.TestProperties.getBCRATUrl;

public class BCRAT_Steps extends PageInitializer {

    @Given("User navigates to the BCRAT Website")
    public void user_navigates_to_the_bcrat_website() {
        PlaywrightUtils.page.navigate(getBCRATUrl());
        CommonUtils.sleep(2000);
    }

    @Then("User clicks on the BCRAT link")
    public void user_clicks_on_the_bcrat_link() {
        PlaywrightUtils.page.locator(BCRATPage.bcratPageLink).click();
    }

    @Then("Verify User is on the BCRAT calculator page")
    public void verify_user_is_on_the_bcrat_calculator_page() {
        assertThat(PlaywrightUtils.page).hasTitle(BCRAT_Constants.BCRAT_PAGE_TITLE);
    }

    @Then("User clicks on the about the calculator tab")
    public void user_clicks_on_the_about_the_calculator_tab() {
        PlaywrightUtils.page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(BCRATPage.aboutTheCalculatorLocator)).click();
    }

    @Then("Verify User is on the about the calculator tab")
    public void verify_user_is_on_the_about_the_calculator_tab() {
        assertThat(PlaywrightUtils.page).hasTitle(BCRAT_Constants.CALCULATOR_TAB_TITLE);
    }

    @Then("User clicks on the Calculate Patient Risk button")
    public void user_clicks_on_the_calculate_patient_risk_button() {
        PlaywrightUtils.page.locator(BCRATPage.patientRiskLocator).click();
        CommonUtils.sleep(2000);
    }

    @Then("User clicks yes for the patient eligibility and clicks ok button")
    public void user_clicks_yes_for_the_patient_eligibility_and_clicks_ok_button() {
        BCRATStepsImpl.checksPatientEligibility();
    }

    @Then("User reset the selection on the risk calculator tab")
    public void user_reset_the_selection_on_the_risk_calculator_tab() {
        PlaywrightUtils.page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Reset")).click();
    }

    @Then("User clicks on the health professional version link")
    public void user_clicks_on_the_health_professional_version_link() {
        BCRATStepsImpl.clickHealthProfessionalLink();
    }

    @Then("User clicks on the BCRisk in American women link")
    public void user_clicks_on_the_bc_risk_in_american_women_link() {
        BCRATStepsImpl.clickBCRiskLink();
    }

    @Then("User clicks on the CCT BCScreening link")
    public void user_clicks_on_the_cct_bc_screening_link() {
        BCRATStepsImpl.clickCCTBCScreeningLink();
    }

    @Then("User clicks on the CCT BCPrevention link")
    public void user_clicks_on_the_cct_bc_prevention_link() {
        BCRATStepsImpl.clickCCTBCPreventionLink();
    }

    @Then("User clicks on the CCT BCTreatment link")
    public void user_clicks_on_the_cct_bc_treatment_link() {
        BCRATStepsImpl.clickCCTBCTreatmentLink();
    }

    @Then("User clicks on the risk calculator tab")
    public void user_clicks_on_the_risk_calculator_tab() {
        BCRATStepsImpl.clickRiskCalculatorTab();
    }

    @Then("User enters all the data for demographics with eligibility and history")
    public void user_enters_all_the_data_for_demographics_with_eligibility_and_history() {
        BCRATStepsImpl.enterAllDataForRiskCalculator();
    }

    @Then("User clicks on the calculate risk button")
    public void user_clicks_on_the_calculate_risk_button() {
        PlaywrightUtils.page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName(BCRATPage.calculateRiskLocator)).click();
    }

    @Then("Verify User is on the personalized results page")
    public void verify_user_is_on_the_personalized_results_page() {
        assertThat(PlaywrightUtils.page.locator("#results_home")).containsText(BCRAT_Constants.PERSONALIZED_RESULT_TEXT);
    }

    @Then("User edit the response on the personalized result page")
    public void user_edit_the_response_on_the_personalized_result_page() {
        PlaywrightUtils.page.locator(BCRATPage.personalizedResultLocator).click();
    }

    @Then("User clicks on the home link and verify it in the BCRAT")
    public void user_clicks_on_the_home_link_and_verify_it_in_the_bcrat() {
        Playwright_Common_Utils.clickAndAssertNewPageTitle(BCRATPage.homeLink,BCRAT_Constants.HOME_PAGE_TITLE);
    }

    @Then("User clicks on the contact link and verify it in the BCRAT")
    public void user_clicks_on_the_contact_link_and_verify_it_in_the_bcrat() {
        Playwright_Common_Utils.clickAndAssertNewPageTitle(BCRATPage.contactLocator,BCRAT_Constants.CONTACT_PAGE_TITLE);
    }

    @Then("User clicks on the policies link and verify it in the BCRAT")
    public void user_clicks_on_the_policies_link_and_verify_it_in_the_bcrat() {
        Playwright_Common_Utils.clickAndAssertNewPageTitle(BCRATPage.policiesLocator,BCRAT_Constants.POLICIES_PAGE_TITLE);
    }

    @Then("User clicks on the HHS Vulnerability Disclosure link and verify it in the BCRAT")
    public void user_clicks_on_the_hhs_vulnerability_disclosure_link_and_verify_it_in_the_bcrat() {
        Playwright_Common_Utils.clickAndAssertNewPageTitle(BCRATPage.HHSLocator,BCRAT_Constants.HHS_PAGE_TITLE);
    }

    @Then("User clicks on the Accessibility link and verify it in the BCRAT")
    public void user_clicks_on_the_accessibility_link_and_verify_it_in_the_bcrat() {
        Playwright_Common_Utils.clickAndAssertNewPageTitle(BCRATPage.accessibilityLocator,BCRAT_Constants.ACCESSIBILITY_PAGE_TITLE);
    }

    @Then("User clicks on the US Department of HHS link and verify it in the BCRAT")
    public void user_clicks_on_the_us_department_of_hhs_link_and_verify_it_in_the_bcrat() {
        Playwright_Common_Utils.clickAndAssertNewPageTitle(BCRATPage.USDeptHHSLocator,BCRAT_Constants.US_DEPARTMENT_PAGE_TITLE);
    }

    @Then("User clicks on the NIH link and verify it in the BCRAT")
    public void user_clicks_on_the_nih_link_and_verify_it_in_the_bcrat() {
        Playwright_Common_Utils.clickAndAssertNewPageTitle(BCRATPage.NIHLocator,BCRAT_Constants.NIH_PAGE_TITLE);
    }

    @Then("User clicks on the NCI link and verify it in the BCRAT")
    public void user_clicks_on_the_nci_link_and_verify_it_in_the_bcrat() {
        Playwright_Common_Utils.clickAndAssertNewPageTitle(BCRATPage.NCIPage,BCRAT_Constants.NCI_PAGE_TITLE);
    }

    @Then("User clicks on the USA gov link and verify it in the BCRAT")
    public void user_clicks_on_the_usa_gov_link_and_verify_it_in_the_bcrat() {
        Playwright_Common_Utils.clickAndAssertNewPageTitle(BCRATPage.USAGov,BCRAT_Constants.USA_GOV_PAGE_TITLE);
    }

    @Then("User clicks on the other risk assessment tool link")
    public void user_clicks_on_the_other_risk_assessment_tool_link() {
        PlaywrightUtils.page.locator("li").filter(new Locator.FilterOptions().setHasText(BCRATPage.riskAssessmentLinkLocator)).getByRole(AriaRole.LINK).click();
    }

    @Then("Verify user navigated to the other risk assessment section")
    public void verify_user_navigated_to_the_other_risk_assessment_section() {
        assertThat(PlaywrightUtils.page.locator(BCRATPage.riskAssessmentLocator)).containsText(BCRAT_Constants.RISK_ASSESSMENT_TEXT);
    }
}