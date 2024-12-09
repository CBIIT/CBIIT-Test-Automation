package CHARMS.Steps;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.WebDriverUtils;
import APPS_COMMON.PageInitializers.PageInitializer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static com.nci.automation.web.TestProperties.getRasLoginUrl;

public class RAS_Screener_Submission_Steps extends PageInitializer {

    @Given("a participant is on the RASopathies Longitudinal Cohort Study login page {string}")
    public void a_participant_is_on_the_RASopathies_Longitudinal_Cohort_Study_login_page(String applicationID) {
        WebDriverUtils.webDriver.get(getRasLoginUrl());
        CucumberLogUtils.logScreenshot();
    }

    @When("the participant submits a screener from excel sheet {string}")
    public void the_participant_submits_a_screener_from_excel_sheet(String sheetName) {
        ras_screenerSubmissions_stepsImpl.rasScreenerScenarioSelector(sheetName);
    }

    @Then("data submitted for scenario is verified in native from the excel sheet {string}")
    public void data_submitted_for_scenario_is_verified_in_native_from_the_excel_sheet(String sheetName) {
        ras_screenerSubmissions_stepsImpl.rasScreenerVerificationScenarioSelector(sheetName);
    }

    @Then("the consent is submitted for {string}")
    public void the_consent_is_submitted_for(String sheetName) {
        ras_screenerSubmissions_stepsImpl.rasConsentScenarioSelector(sheetName);
    }

    @Given("the participant submits a Individual Information Questionnaire for excel sheet {string}")
    public void the_participant_submits_a_individual_information_questionnaire_for_excel_sheet(String sheetNameIiq) {
        ras_screenerSubmissions_stepsImpl.iiqScenarioSelector(sheetNameIiq);
    }

    @Given("a proxy is on the RASopathies Longitudinal Cohort Study login page")
    public void a_user_is_on_the_RASopathies_Longitudinal_Cohort_Study_login_page() {
        WebDriverUtils.webDriver.get(getRasLoginUrl());
    }

    @Given("a proband is on the RASopathies Longitudinal Cohort Study login page")
    public void a_proband_is_on_the_RASopathies_Longitudinal_Cohort_Study_login_page() {
        WebDriverUtils.webDriver.get(getRasLoginUrl());
    }

    @Given("logs in via Okta with username {string} and password {string}")
    public void logs_in_via_Okta_with_username_and_password(String username, String password) {
        ras_screenerSubmissions_stepsImpl.logsInViaOktaWithUsernameAndPassword(username, password);
    }

    @Given("clicks on {string} to begin survey")
    public void clicks_on_to_begin_survey(String text) {
        ras_screenerSubmissions_stepsImpl.clicksOnEligibilityQuestionnaireToBeginQuestionnaire(text);
    }
}