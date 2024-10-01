package ServiceNow.ESR.Playwright.Steps;

import ServiceNow.ESR.Playwright.StepsImplementation.ESRShortDescriptionStepsImplementation;
import io.cucumber.java.en.Then;

public class ESRShortDescriptionSteps {

    @Then("user confirms the following fields: ESR ID, Stage, Short Description and Project Name")
    public void user_confirms_the_following_fields_esr_id_stage_short_description_and_project_name() {
        ESRShortDescriptionStepsImplementation.validateFieldsForESR();
    }
}
