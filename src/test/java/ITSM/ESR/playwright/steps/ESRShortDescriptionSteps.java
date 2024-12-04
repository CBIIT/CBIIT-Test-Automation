package ITSM.ESR.playwright.steps;

import ITSM.ESR.playwright.stepsImplementation.ESRShortDescriptionStepsImplementation;
import io.cucumber.java.en.Then;

public class ESRShortDescriptionSteps {

    @Then("user confirms the following fields: ESR ID, Stage, Short Description and Project Name")
    public void user_confirms_the_following_fields_esr_id_stage_short_description_and_project_name() {
        ESRShortDescriptionStepsImplementation.validateFieldsForESR();
    }

    @Then("user confirms the following fields: Number, Approval, State and Requested For")
    public void user_confirms_the_following_fields_number_approval_state_and_requested_for() {
        ESRShortDescriptionStepsImplementation.validateFieldsForESRTwo();
    }
}