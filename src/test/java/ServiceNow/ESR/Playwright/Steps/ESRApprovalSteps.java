package ServiceNow.ESR.Playwright.Steps;

import ServiceNow.ESR.Playwright.StepsImplementation.ESRApprovalStepsImplementation;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class ESRApprovalSteps {

    @And("the user is approved from a federal lead")
    public void the_user_is_approved_from_a_federal_lead() {
        ESRApprovalStepsImplementation.federalLeadApproval();
    }

    @Then("the user confirms the Federal Intake Approval is completed")
    public void the_user_confirms_the_federal_intake_approval_is_completed() {
        ESRApprovalStepsImplementation.confirmFederalIntakeApprovalIsCompleted();
    }

    @And("the user is approved from the ESR Board approvers")
    public void the_user_is_approved_from_the_esr_board_approvers() {
        ESRApprovalStepsImplementation.esrBoardIntakeApprovals();
    }
    @Then("the user confirms the ESR Board Intake Approvals are completed")
    public void the_user_confirms_the_esr_board_intake_approvals_are_completed() {
        ESRApprovalStepsImplementation.confirmESRBoardIntakeApprovalsAreCompleted();
    }
}