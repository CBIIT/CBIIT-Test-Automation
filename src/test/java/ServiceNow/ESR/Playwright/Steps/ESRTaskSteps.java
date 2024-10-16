package ServiceNow.ESR.Playwright.Steps;

import ServiceNow.ESR.Playwright.StepsImplementation.ESRTaskStepsImplementation;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class ESRTaskSteps {

    @And("user clicks on Intake Preparation catalog task")
    public void user_clicks_on_intake_preparation_catalog_task() {
        ESRTaskStepsImplementation.clickOnIntakePreparationCatalogTask();
    }
    @And("user fills out all required information for Intake Preparation")
    public void user_fills_out_all_required_information_for_intake_preparation() {
        ESRTaskStepsImplementation.fillOutAllRequiredInformationForIntakePreparation();
    }

    @Then("the user confirms the Intake Preparation task is completed")
    public void the_user_confirms_the_intake_preparation_task_is_completed() {
        ESRTaskStepsImplementation.confirmIntakePreparationTaskIsCompleted();
    }
}
