package ANALYSIS_TOOLS.CCRAT.playwright.steps;

import ANALYSIS_TOOLS.CCRAT.playwright.pages.CCRATPage;
import ANALYSIS_TOOLS.CCRAT.playwright.stepsImplementation.CCRATStepsImpl;
import APPS_COMMON.PageInitializers.PageInitializer;
import APPS_COMMON.PlaywrightUtils.Playwright_Common_Utils;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.PlaywrightUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import static com.nci.automation.web.TestProperties.getCCRATUrl;

public class CCRAT_Steps extends PageInitializer {

    /**
     * Navigating to the CCRAT website
     */
    @Given("User navigates to the CCRAT Website")
    public void user_navigates_to_the_ccrat_website() {
        PlaywrightUtils.page.navigate(getCCRATUrl());
        CommonUtils.sleep(2000);
    }

    /**
     * Clicking on the CCRAT link
     */
    @Then("User clicks on the CCRAT link")
    public void user_clicks_on_the_bcrat_link() {
        PlaywrightUtils.page.locator(CCRATPage.ccratPageLink).click();
    }

    /**
     * Verifying user is on the CCRAT online calculator page
     */
    @Then("Verify User is on the CCRAT online calculator page")
    public void verify_user_is_on_the_ccrat_online_calculator_page() {
        assertThat(PlaywrightUtils.page).hasTitle("Colorectal Risk Assessment Tool: Online Calculator - NCI");
    }

    /**
     * Clicking on about the calculator page
     */
    @When("User clicks on about the calculator page")
    public void user_clicks_on_about_the_calculator_page() {
        PlaywrightUtils.page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(CCRATPage.aboutTheCalculator)).click();
    }

    /**
     * Verifying about the calculator page
     */
    @Then("Verify User is on about the calculator page")
    public void verify_user_is_on_about_the_calculator_page() {
        assertThat(PlaywrightUtils.page).hasTitle("About the Calculator: The Colorectal Cancer Risk Assessment Tool - NCI");
    }

    /**
     * Clicking on the CCRAT calculator page
     */
    @When("User clicks on the CCRAT calculator page")
    public void user_clicks_on_the_ccrat_calculator_page() {
        PlaywrightUtils.page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(CCRATPage.riskCalculator)).click();
    }

    /**
     * Verifying CCRAT calculator page
     */
    @Then("Verify User is on the CCRAT calculator page")
    public void verify_user_is_on_the_ccrat_calculator_page() {
        assertThat(PlaywrightUtils.page).hasTitle("Colorectal Cancer Risk Assessment Calculator - NCI");
    }

    /**
     * Clicking on the colorectal cancer link
     */
    @Then("User clicks on the colorectal cancer link and verify it")
    public void user_clicks_on_the_colorectal_cancer_link_and_verify_it() {
        CCRATStepsImpl.checkColorectalCancerLink();
    }

    /**
     * Clicking on the test to detect colorectal cancer link
     */
    @Then("User clicks on the test to detect colorectal cancer link and verify it")
    public void user_clicks_on_the_test_to_detect_colorectal_cancer_link_and_verify_it() {
        CCRATStepsImpl.checkTestToDetectColorectalCancerLink();
    }

    /**
     * Clicking on the sas macro link and verifying it
     */
    @Then("User clicks on the SAS Macro link and verify it")
    public void user_clicks_on_the_sas_macro_link_and_verify_it() {
        Playwright_Common_Utils.clickAndAssertNewPageTitle(CCRATPage.sasMacro, "Colon Cancer Risk Assessment - SAS Macro - NCI");
    }

    /**
     * Clicking on the gauss program link and verifying it
     */
    @Then("User clicks on the Gauss program link and verify it")
    public void user_clicks_on_the_gauss_program_link_and_verify_it() {
        Playwright_Common_Utils.clickAndAssertNewPageTitle(CCRATPage.gaussProgram, "Colon Cancer Risk Assessment Tool - Gauss Program - NCI");
    }

    /**
     * Clicking on the colorectal cancer risk prediction link and verifying it
     */
    @Then("user clicks on the Colorectal cancer risk prediction link and verify it")
    public void user_clicks_on_the_colorectal_cancer_risk_prediction_link_and_verify_it() {
        Playwright_Common_Utils.clickAndAssertNewPageTitle( CCRATPage.colorectalCancerRiskPredictionLink, "Colorectal cancer risk prediction tool for white men and women without known susceptibility - PubMed");
    }

    /**
     * Clicking on the validation of colorectal cancer risk prediction link and verifying it
     */
    @Then("user clicks on the  Validation of a colorectal cancer risk prediction link and verify it")
    public void user_clicks_on_the_validation_of_a_colorectal_cancer_risk_prediction_link_and_verify_it() {
        Playwright_Common_Utils.clickAndAssertNewPageTitle(CCRATPage.validationOfColorectalCancerRiskPredictionLink, "Validation of a colorectal cancer risk prediction model among white patients age 50 years and older - PubMed");
    }

    /**
     * Clicking on the calculate patient risk button
     */
    @When("User clicks on the Calculate Patient Risk button in CCRAT")
    public void user_clicks_on_the_calculate_patient_risk_button_in_ccrat() {
        PlaywrightUtils.page.locator(CCRATPage.accessPatientRisk).click();
    }

    /**
     * Selecting some fields under the risk calculator tab
     */
    @Then("User selects some fields under risk calculator tab")
    public void user_selects_some_fields_under_risk_calculator_tab() {
        PlaywrightUtils.page.locator(CCRATPage.selectingHispanic).click();
    }

    /**
     * Clicking on the reset button
     */
    @Then("User clicks on the reset button under risk calculator")
    public void user_clicks_on_the_reset_button_under_risk_calculator() {
        PlaywrightUtils.page.locator(CCRATPage.resetButtonCCRAT).click();
    }

    /**
     * Validating that selected fields are unselected now
     */
    @Then("Verify that selected fields are deselected now")
    public void verify_that_selected_fields_are_deselected_now() {
        CCRATStepsImpl.verifyFieldsAreUnselected();
    }

    /**
     * Entering all the required details to do the risk calculation
     */
    @Then("User enters all the mandatory details in the calculation of risk")
    public void user_enters_all_the_mandatory_details_in_the_calculation_of_risk() {
        CCRATStepsImpl.entersMandatoryDetails();
    }

    /**
     * Calculating the risk based on the entered details
     */
    @Then("User calculates the risk based on the entered details")
    public void user_calculates_the_risk_based_on_the_entered_details() {
        PlaywrightUtils.page.locator(CCRATPage.riskCalculateButton).click();
    }

    /**
     * Clicking on the start a new assessment button
     */
    @Then("User clicks on the start a new assessment button to recalculate")
    public void user_clicks_on_the_start_a_new_assessment_button_to_recalculate() {
        PlaywrightUtils.page.locator(CCRATPage.newAssessmentButton).click();
    }

    /**
     * Clicking on edit response button
     */
    @Then("User clicks on the edit response button")
    public void user_clicks_on_the_edit_response_button() {
        PlaywrightUtils.page.locator(CCRATPage.editResponseButton).click();
    }

    /**
     * Editing family details
     */
    @Then("user edits the family history details in the risk calculator page")
    public void user_edits_the_family_history_details_in_the_risk_calculator_page() {
        PlaywrightUtils.page.locator(CCRATPage.editFamilyDetails).click();
    }

    /**
     * Entering wrong height details
     */
    @Then("User enters wrong height data and validates the error message")
    public void user_enters_wrong_height_data_and_validates_the_error_message() {
        CCRATStepsImpl.enterWrongHeightData();
    }

    /**
     * Clicking on the home link
     */
    @Then("User clicks on home link in the footer and validates it")
    public void user_clicks_on_home_link_in_the_footer_and_validates_it() {
        CCRATStepsImpl.clickHomeLink();
    }

    /**
     * Clicking on the contact link
     */
    @Then("User clicks on contact link in the footer and validates it")
    public void user_clicks_on_contact_link_in_the_footer_and_validates_it() {
        CCRATStepsImpl.clickContactLink();
    }
}