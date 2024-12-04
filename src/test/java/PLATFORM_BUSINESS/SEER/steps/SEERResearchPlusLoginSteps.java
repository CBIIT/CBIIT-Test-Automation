package PLATFORM_BUSINESS.SEER.steps;

import ServiceNow.PLATFORM_BUSINESS.SEER.StepsImplementation.SEERResearchPlusLoginStepImplementation;
import APPS_COMMON.PageInitializers.PageInitializer;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SEERResearchPlusLoginSteps extends PageInitializer {

    @When("the user clicks the SEER Research Plus button")
    public void the_user_clicks_the_seer_research_plus_button() {
        SEERResearchPlusLoginStepImplementation.theUserClicksTheSeerResearchPlusButton();
    }

    @Then("the user will be brought to the Sign in Page")
    public void the_user_will_be_brought_to_the_sign_in_page() {
        SEERResearchPlusLoginStepImplementation.theUserWillBeBroughtToTheSignInPage();
    }
}
