package ServiceNow.PlatformBusinessApps.SNOW_TRAVEL.playwright.Steps;

import ServiceNow.PlatformBusinessApps.SNOW_TRAVEL.playwright.StepImpl.Travel_Request_NV_StepImpl;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Travel_Request_NV_Steps {

    @When("I search {string}, in the filter navigator,")
    public void i_search_in_the_filter_navigator(String travelPlanningSystem) {
        Travel_Request_NV_StepImpl.i_search_in_the_filter_navigator(travelPlanningSystem);
    }

    @Then("I will see Modules created for the {string}, {string}, {string},and {string} underneath Travel Planning System Application")
    public void i_will_see_modules_created_for_the_and_underneath_travel_planning_system_application(String travelRequest, String assignedToMe, String assignedToMyGroup, String myApprovals) {
        Travel_Request_NV_StepImpl.i_will_see_modules_created_for_the_and_underneath_application(travelRequest, assignedToMe, assignedToMyGroup, myApprovals);
    }
}