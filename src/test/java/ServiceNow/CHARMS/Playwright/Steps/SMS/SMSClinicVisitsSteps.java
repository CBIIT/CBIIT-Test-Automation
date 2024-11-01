package ServiceNow.CHARMS.Playwright.Steps.SMS;

import ServiceNow.CHARMS.Playwright.StepsImplementation.FanconiStudy.FanconiSurveyStepsImpl;
import ServiceNow.CHARMS.Playwright.StepsImplementation.SMS.SMSStepsImpl;
import io.cucumber.java.en.Given;

public class SMSClinicVisitsSteps {
    @Given("a Participant is on the RAS Study login page and logs with user credentials via Okta")
    public void a_participant_is_on_the_rAS_study_login_page_and_logs_with_user_credentials_via_okta() {
        SMSStepsImpl.login();
    }

    @Given("fills the Background Information section for scenario 1")
    public void fills_the_background_information_section_for_scenario_1() {
        FanconiSurveyStepsImpl.backgroundInformationSectionScenario1();
    }
}

