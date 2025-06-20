package CHARMS.steps;

import APPS_COMMON.PageInitializers.PageInitializer;
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
        metforminScreenerPage.dynamicLocatorUsingSpanNormalizeSpace("Metformin Study").click();
        metforminScreenerPage.dynamicLocatorUsingSpanNormalizeSpace("Metformin Eligibility Questionnaire").click();
    }

    @Then("fills the Metformin Eligibility Questionnaire form for scenario {string}")
    public void fills_eligibility_questionnaire_form_scenario(String metforminScreenerScenario) {
        metforminScreenerStepsImpl.metforminScreenerScenarioSubmission(metforminScreenerScenario);
    }

    @Then("click the submit button")
    public void click_submit_button() {
        metforminScreenerStepsImpl.clickSubmitButton();
    }

    @Given("run the Metformin reset script to reset the accounts")
    public void run_reset_script() {
        metforminScreenerStepsImpl.runResetScripts();
    }

    @Given("All Metformin scenarios are submitted")
    public void all_metformin_scenarios_are_submitted() {
        metforminScreenerStepsImpl.submitAllScenarios();
    }
}