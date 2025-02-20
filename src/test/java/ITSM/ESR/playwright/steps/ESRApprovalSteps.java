package ITSM.ESR.playwright.steps;

import ITSM.ESR.playwright.stepsImplementation.ESRApprovalStepsImplementation;
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

    @And("the user is rejected from a federal lead with a need more info")
    public void the_user_is_rejected_from_a_federal_lead_with_a_need_more_info() {
        ESRApprovalStepsImplementation.federalLeadNeedMoreInfo();
    }

    @And("user clicks on Intake Preparation catalog task and completes it again")
    public void user_clicks_on_intake_preparation_catalog_task_and_completes_it_again() {
        ESRApprovalStepsImplementation.completeIntakePreparation();
    }

    @And("the user is approved from the ESR Board approvers")
    public void the_user_is_approved_from_the_esr_board_approvers() {
        ESRApprovalStepsImplementation.esrBoardIntakeApprovals();
    }

    @Then("the user confirms the ESR Board Intake Approvals are completed")
    public void the_user_confirms_the_esr_board_intake_approvals_are_completed() {
        ESRApprovalStepsImplementation.confirmESRBoardIntakeApprovalsAreCompleted();
    }

    @And("the user is approved from the Operational POC")
    public void the_user_is_approved_from_the_operational_poc() {
        ESRApprovalStepsImplementation.operationalPOCApproval();
    }

    @Then("the user confirms the Operational POC Approval is completed")
    public void the_user_confirms_the_operational_poc_approval_is_completed() {
        ESRApprovalStepsImplementation.confirmOperationalPOCApprovalIsCompleted();
    }

    @And("the user is approved from a federal lead for closeout approval")
    public void the_user_is_approved_from_a_federal_lead_for_closeout_approval() {
        ESRApprovalStepsImplementation.federalLeadCloseoutApproval();
    }

    @And("the user is rejected from a federal lead for closeout approval with a need more info")
    public void the_user_is_rejected_from_a_federal_lead_for_closeout_approval_with_a_need_more_info() {
        ESRApprovalStepsImplementation.federalLeadCloseoutNeedMoreInfo();
    }

    @And("user clicks on Closeout Preparation catalog task and completes it again")
    public void user_clicks_on_closeout_preparation_catalog_task_and_completes_it_again() {
        ESRApprovalStepsImplementation.completeCloseoutPreparation();
    }

    @Then("the user confirms the Federal Lead Closeout Approval is completed")
    public void the_user_confirms_the_federal_lead_closeout_approval_is_completed() {
        ESRApprovalStepsImplementation.confirmFederalLeadCloseoutApprovalIsCompleted();
    }

    @And("the user is approved from a federal lead for ESR-I closeout approval")
    public void the_user_is_approved_from_a_federal_lead_for_esr_i_closeout_approval() {
        ESRApprovalStepsImplementation.federalLeadESRIApproval();
    }

    @And("the user is rejected from a federal lead for closeout approval with a need more info for ESR-I")
    public void the_user_is_rejected_from_a_federal_lead_for_closeout_approval_with_a_need_more_info_for_esr_i() {
        ESRApprovalStepsImplementation.federalLeadCloseoutNeedMoreInfoForESRI();
    }

    @And("user clicks on Closeout Preparation catalog task and completes it again for ESR-I")
    public void user_clicks_on_closeout_preparation_catalog_task_and_completes_it_again_for_esr_i() {
        ESRApprovalStepsImplementation.completeCloseoutPreparationForESRI();
    }

    @And("the user is approved for ESR Board Closeout Review for ESR-Q")
    public void the_user_is_approved_for_esr_board_closeout_review_for_esr_q() {
        ESRApprovalStepsImplementation.esrBoardCloseoutApprovalsForESRQ();
    }

    @And("the user is approved for ESR Board Closeout Review for ESR-I")
    public void the_user_is_approved_for_esr_board_closeout_review_for_esr_i() {
        ESRApprovalStepsImplementation.esrBoardCloseoutApprovalsForESRI();
    }

    @Then("the user confirms the ESR Board Closeout Review approvals are completed")
    public void the_user_confirms_the_esr_board_closeout_review_approvals_are_completed() {
        ESRApprovalStepsImplementation.confirmESRBoardCloseoutReviewApprovalsAreCompleted();
    }
}