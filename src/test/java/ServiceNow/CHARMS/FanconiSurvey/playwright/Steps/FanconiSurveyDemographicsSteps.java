package ServiceNow.CHARMS.FanconiSurvey.playwright.Steps;

import ServiceNow.CHARMS.FanconiSurvey.playwright.StepsImplementation.FanconiSurveyStepsImpl;
import io.cucumber.java.en.Given;

public class FanconiSurveyDemographicsSteps {
    @Given("a Participant is on the Fanconi Study login page and logs with user credentials via Okta")
    public void a_participant_is_on_the_fanconi_study_login_page_and_logs_with_user_credentials_via_okta() {
        FanconiSurveyStepsImpl.login();
    }

    @Given("fills the Demographic section")
    public void fills_the_demographic_section() {
        FanconiSurveyStepsImpl.demographicSection();
    }
}
