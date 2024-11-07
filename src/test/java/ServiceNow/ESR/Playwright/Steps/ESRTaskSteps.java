package ServiceNow.ESR.Playwright.Steps;

import ServiceNow.ESR.Playwright.StepsImplementation.ESRTaskStepsImplementation;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class ESRTaskSteps {

    @And("user clicks on Intake Preparation catalog task")
    public void user_clicks_on_intake_preparation_catalog_task() {
        ESRTaskStepsImplementation.clickOnIntakePreparationCatalogTask();
    }

    @And("user fills out all required information for ESR-Q Intake Preparation")
    public void user_fills_out_all_required_information_for_esr_q_intake_preparation() {
        ESRTaskStepsImplementation.fillOutAllRequiredInformationForESRQIntakePreparation();
    }

    @And("user fills out all required information for ESR-I Intake Preparation")
    public void user_fills_out_all_required_information_for_esr_i_intake_preparation() {
        ESRTaskStepsImplementation.fillOutAllRequiredInformationForESRIIntakePreparation();
    }

    @Then("the user confirms the Intake Preparation task is completed")
    public void the_user_confirms_the_intake_preparation_task_is_completed() {
        ESRTaskStepsImplementation.confirmIntakePreparationTaskIsCompleted();
    }

    @And("ESR Board Intake Review catalog task is completed")
    public void esr_board_intake_review_catalog_task_is_completed() {
        ESRTaskStepsImplementation.completeESRBoardIntakeReviewCatalogTask();
    }

    @Then("the user confirms the ESR Board Intake Review catalog task is completed")
    public void the_user_confirms_the_esr_board_intake_review_catalog_task_is_completed() {
        ESRTaskStepsImplementation.confirmESRBoardIntakeReviewCatalogTaskIsCompleted();
    }

    @And("the Engineering Project Execution catalog task is completed")
    public void the_engineering_project_execution_catalog_task_is_completed() {
        ESRTaskStepsImplementation.completeEngineeringProjectExecutionCatalogTask();
    }

    @Then("the user confirms the Engineering Project Execution catalog task is completed")
    public void the_user_confirms_the_engineering_project_execution_catalog_task_is_completed() {
        ESRTaskStepsImplementation.confirmEngineeringProjectExecutionCatalogTaskIsCompleted();
    }

    @And("the Closeout Preparation catalog task for ESR-Q is completed")
    public void the_closeout_preparation_catalog_task_for_esr_q_is_completed() {
        ESRTaskStepsImplementation.completeCloseoutPreparationCatalogTaskForESRQ();
    }

    @And("the Closeout Preparation catalog task for ESR-I is completed")
    public void the_closeout_preparation_catalog_task_for_esr_i_is_completed() {
        ESRTaskStepsImplementation.completeCloseoutPreparationCatalogTaskForESRI();
    }

    @Then("the user confirms the Closeout Preparation catalog task is completed")
    public void the_user_confirms_the_closeout_preparation_catalog_task_is_completed() {
        ESRTaskStepsImplementation.confirmCloseoutPreparationCatalogTaskIsCompleted();
    }
}