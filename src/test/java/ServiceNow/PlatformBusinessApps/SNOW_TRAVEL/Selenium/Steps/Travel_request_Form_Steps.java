package ServiceNow.PlatformBusinessApps.SNOW_TRAVEL.Selenium.Steps;

import ServiceNow.PlatformBusinessApps.SNOW_TRAVEL.Selenium.StepImpl.Travel_Requests_Form_StepImpl;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Travel_request_Form_Steps {

    @Given("I am a authenticated Travel Request User under the DOC CGH")
    public void i_am_a_authenticated_travel_request_user_under_the_doc_cgh() {
        Travel_Requests_Form_StepImpl.i_am_a_authenticated_travel_request_user_under_the_doc_cgh();
    }

    @When("I am on the {string} Portal form")
    public void i_am_on_the_portal_form(String travelPlanningSystem) {
        Travel_Requests_Form_StepImpl.i_am_on_the_portal_form(travelPlanningSystem);
    }
}