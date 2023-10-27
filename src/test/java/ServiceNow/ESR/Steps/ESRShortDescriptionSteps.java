package ServiceNow.ESR.Steps;

import ServiceNow.ESR.StepsImplementation.ESRShortDescriptionStepsImplementation;
import appsCommon.PageInitializers.PageInitializer;
import io.cucumber.java.en.Then;

public class ESRShortDescriptionSteps extends PageInitializer {

    @Then("user goes into the new ESR ticket and confirms the following fields: {string} and {string}")
    public void user_goes_into_the_new_esr_ticket_and_confirms_the_following_fields_and(String expectedIDField, String expectedStageField) {
        ESRShortDescriptionStepsImplementation.findShortDescriptionFields(expectedIDField, expectedStageField);
    }

    @Then("user goes into the new ESR ticket and confirms the fields {string} and {string}")
    public void user_goes_into_the_new_esr_ticket_and_confirms_the_fields_and(String expectedIDField, String expectedProjectField) {
        ESRShortDescriptionStepsImplementation.findShortDescriptionFieldsTwo(expectedIDField, expectedProjectField);
    }
}
