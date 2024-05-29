package ServiceNow.CHARMS.FanconiSurvey.playwright.Steps;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;
import appsCommon.PageInitializers.PageInitializer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RAS_Screener_Submission_Steps extends PageInitializer {

    @Given("a participant is on the RASopathies Longitudinal Cohort Study login page {string}")
    public void a_participant_is_on_the_RASopathies_Longitudinal_Cohort_Study_login_page(String applicationID) {
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl(applicationID));
        CucumberLogUtils.logScreenshot();
    }

    @When("the participant submits a screener from excel sheet {string}")
    public void the_participant_submits_a_screener_from_excel_sheet(String sheetName) {
        ras_scenario_one_stepsImpl.rasScreenerScenarioSelector(sheetName);
    }

    @Then("data submitted for scenario is verified in native from the excel sheet {string}")
    public void data_submitted_for_scenario_is_verified_in_native_from_the_excel_sheet(String sheetName) {
        ras_scenario_one_stepsImpl.rasScreenerVerificationScenarioSelector(sheetName);
    }

    @Then("the consent is submitted for {string}")
    public void the_consent_is_submitted_for(String sheetName) {
        ras_scenario_one_stepsImpl.rasConsentScenarioSelector(sheetName);
    }

    @Given("the participant submits a Individual Information Questionnaire for excel sheet {string}")
    public void the_participant_submits_a_individual_information_questionnaire_for_excel_sheet(String sheetNameIiq) {
        ras_scenario_one_stepsImpl.iiqScenarioSelector(sheetNameIiq);
    }

    @Given("a proxy is on the RASopathies Longitudinal Cohort Study login page")
    public void a_user_is_on_the_RASopathies_Longitudinal_Cohort_Study_login_page() throws TestingException {
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("myRASLoginPage"));
    }

    @Given("a proband is on the RASopathies Longitudinal Cohort Study login page")
    public void a_proband_is_on_the_RASopathies_Longitudinal_Cohort_Study_login_page() throws TestingException {
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("myRASLoginPage"));
    }

    @Given("logs in via Okta with username {string} and password {string}")
    public void logs_in_via_Okta_with_username_and_password(String username, String password) {
        ras_scenario_one_stepsImpl.logsInViaOktaWithUsernameAndPassword(username, password);
    }

    @Given("clicks on Eligibility Questionnaire to begin questionnaire")
    public void clicks_on_Eligibility_Questionnaire_to_begin_questionnaire() {
        ras_scenario_one_stepsImpl.clicksOnEligibilityQuestionnaireToBeginQuestionnaire();
    }
}