package ServiceNow.PlatformBusinessApps.GDC.Steps;

import ServiceNow.PlatformBusinessApps.GDC.StepImplementation.GDC_Workflow_NativeView_StepImplementation;
import appsCommon.PageInitializers.PageInitializer;
import com.nci.automation.xceptions.TestingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GDC_WOrkflow_NativeViewSteps extends PageInitializer {

    @Given("I am authenticated GDC Fulfiller in the Native View")
    public void i_am_authenticated_gdc_fulfiller_in_the_native_view() throws TestingException {
        GDC_Workflow_NativeView_StepImplementation.iAmAuthenticatedGDCFulfillerInNV();
    }

    @When("I get a ticket assigned to me to complete a request")
    public void i_get_a_ticket_assigned_to_me_to_complete_a_request() {
        GDC_Workflow_NativeView_StepImplementation.iGetATicketAssignedToMe();
    }

    @Then("I should see UI Actions in the top right hand corner that follow GDC flow")
    public void i_should_see_ui_actions_in_the_top_right_hand_corner_that_follow_gdc_flow() throws TestingException{
        GDC_Workflow_NativeView_StepImplementation.gDCUIActionsOnTopRightCornerForGDCFlow();
    }

    @When("a new ticket has been created and submitted")
    public void a_new_ticket_has_been_created_and_submitted() {
        GDC_Workflow_NativeView_StepImplementation.iGetATicketAssignedToMe();
    }

    @When("I change the state of the ticket to resolved and save")
    public void i_change_the_state_of_the_ticket_to_resolved_and_save() {
        GDC_Workflow_NativeView_StepImplementation.gDCTicketIsResolved();
    }

    @Then("I should be able to go to the closure info and check that business duration is filled")
    public void i_should_be_able_to_go_to_the_closure_info_and_check_that_business_duration_is_filled()throws TestingException {
        GDC_Workflow_NativeView_StepImplementation.clickOnClosureInfoAndCheckBusinessDuration();
    }

}
