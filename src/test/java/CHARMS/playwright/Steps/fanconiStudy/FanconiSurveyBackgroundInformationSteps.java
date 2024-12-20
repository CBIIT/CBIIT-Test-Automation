package CHARMS.playwright.Steps.fanconiStudy;

import CHARMS.playwright.StepsImplementation.fanconiStudy.FanconiSurveyStepsImpl;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FanconiSurveyBackgroundInformationSteps {

    @Given("a Participant runs reset Fanconi screener and Survey script")
    public void a_participant_runs_reset_fanconi_screener_and_Survey_script() {
        FanconiSurveyStepsImpl.resetFanconiScreenerAndSurveyAccount();
    }

    @Then("fills the Fanconi Screener")
    public void fills_the_fanconi_screener() {
        FanconiSurveyStepsImpl.fillFanconiScreener();
    }

    @Then("fills the consent in NativeView")
    public void fills_the_consent_in_native_view() throws InterruptedException {
        FanconiSurveyStepsImpl.fillFanconiConsent();
    }

    @When("a Participant is on the Fanconi Study login page and logs with user credentials via Okta")
    public void a_participant_is_on_the_fanconi_study_login_page_and_logs_with_user_credentials_via_okta() {
        FanconiSurveyStepsImpl.loginFanconiSurvey();
    }

    @Then("fills the Background Information section for scenario 1")
    public void fills_the_background_information_section_for_scenario_1() {
        FanconiSurveyStepsImpl.backgroundInformationSectionScenario1();
    }

    @Then("submit the Fanconi Survey")
    public void submit_the_fanconi_survey() {
        FanconiSurveyStepsImpl.submitFanconiSurvey();
    }
}
