package CHARMS.steps;

import APPS_COMMON.PageInitializers.PageInitializer;
import APPS_COMMON.Utils.ServiceNow_Login_Methods;
import CHARMS.utils.CharmsUtil;
import com.nci.automation.web.WebDriverUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static com.nci.automation.web.TestProperties.getStudyAgnosticUrl;

public class MetforminScreenerSteps extends PageInitializer {

    @Given("a Participant is on the Metformin Study login page")
    public void participant_is_on_the_metformin_study_login_page() {
        WebDriverUtils.webDriver.get(getStudyAgnosticUrl());
    }

    @And("logs in Metformin page via Okta with username {string} and password {string}")
    public void logs_in_metformin_page_via_okta_with_username_and_password(String username, String password) {
        CharmsUtil.loginToStudyPageUsingUsernameAndPassword(username, password);
    }

    @And("clicks the Metformin Eligibility Questionnaire widget")
    public void clicks_the_metformin_eligibility_questionnaire_widget() {
        metforminScreenerStepsImpl.metforminEligibilityQuestionnaireWidgetClick();
    }

    @Then("fills the Metformin Eligibility Questionnaire form for scenario {string}")
    public void fills_eligibility_questionnaire_form_scenario(String metforminScreenerScenario) {
        metforminScreenerStepsImpl.metforminScreenerScenarioSubmission(metforminScreenerScenario);
    }

    @Then("click the submit button")
    public void click_submit_button() {
        metforminScreenerStepsImpl.clickSubmitButton();
    }

    @Given("the study nurse logs in Native View")
    public void the_study_nurse_logs_in_Native_View() {
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        metforminScreenerStepsImpl.navigateToParticipantDetailsPageInNativeView();
    }

    @Given("run the Metformin reset script to reset the accounts")
    public void run_reset_script() {
        metforminScreenerStepsImpl.runResetScripts();
    }

    @Given("All Metformin scenarios are submitted")
    public void all_metformin_scenarios_are_submitted() {
        metforminScreenerStepsImpl.submitAllScenarios();
    }

    @Then("data submitted for Metformin participant is verified in Participant Details page in NativeView from excel sheet {string}")
    public void data_submitted_for_metformin_participant_is_verified_in_participant_details_page_in_native_view_from_excel_sheet(String sheetName) {
        metforminScreenerStepsImpl.participantDetailsPageAssertionForMetforminScreener(sheetName);
    }

    @Then("data submitted for Metformin participant is verified in Study Screener page in NativeView from excel sheet {string}")
    public void data_submitted_for_metformin_participant_is_verified_in_study_screener_page_in_native_view_from_excel_sheet(String sheetName) {
        metforminScreenerStepsImpl.participantStudyScreenerPageAssertionForMetforminScreener(sheetName);
    }

    @Then("data submitted for Metformin participant is verified in Metformin Screener page in NativeView from excel sheet {string}")
    public void data_submitted_for_metformin_participant_is_verified_in_metformin_screener_page_in_native_view_from_excel_sheet(String sheetName) {
        metforminScreenerStepsImpl.participantReferralPageAssertionForMetforminScreener(sheetName);
    }
}