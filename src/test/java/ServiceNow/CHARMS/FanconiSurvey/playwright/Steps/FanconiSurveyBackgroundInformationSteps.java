package ServiceNow.CHARMS.FanconiSurvey.Playwright.Steps;

import ServiceNow.CHARMS.FanconiSurvey.Playwright.StepsImplementation.FanconiSurveyStepsImpl;
import io.cucumber.java.en.Given;

public class FanconiSurveyBackgroundInformationSteps {

    @Given("a Participant is on the Fanconi Study login page and logs with user credentials via Okta")
    public void a_participant_is_on_the_fanconi_study_login_page_and_logs_with_user_credentials_via_okta() {
        FanconiSurveyStepsImpl.login();
    }

    @Given("fills the Background Information section")
    public void fills_the_background_information_section() {
        FanconiSurveyStepsImpl.backgroundInformationSection();
    }
}
