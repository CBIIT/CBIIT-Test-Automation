package ServiceNow.PlatformBusinessApps.SNOWOBF.playwright.Steps;

import ServiceNow.PlatformBusinessApps.SNOWOBF.playwright.StepImpl.OBF_NCI_NV_Form_StepImpl;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OBF_NCI_NV_Form_Steps {

    @Given("I am an authenticated OBF fulfiller user")
    public void i_am_an_authenticated_obf_fulfiller_user() {
        OBF_NCI_NV_Form_StepImpl.i_am_an_authenticated_obf_fulfiller_user();
    }

    @When("I navigate to the Native View and type {string} in the navigation search window")
    public void i_navigate_to_the_native_view_and_type_in_the_navigation_search_window(String obfSystemsSupport) {
        OBF_NCI_NV_Form_StepImpl.i_navigate_to_the_native_view_and_type_in_the_navigation_search_window(obfSystemsSupport);
    }

    @Then("I should see the following options in the OBF Systems Support Module: {string}, {string}, {string}, {string}")
    public void i_should_see_the_following_options_in_the_obf_systems_support_module(String allTickets, String openTickets, String closedTickets, String oneStreamBus) {
        OBF_NCI_NV_Form_StepImpl.i_should_see_the_following_options_in_the_obf_systems_support_module(allTickets, openTickets, closedTickets,oneStreamBus);
    }
}