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

    @And("the user receives a rejection from a federal lead for intake approval in ESR-Q")
    public void the_user_receives_a_rejection_from_a_federal_lead_for_intake_approval_in_esr_q() {
        ESRApprovalStepsImplementation.federalLeadIntakeRejectionForESRQ();
    }

    @And("user clicks on Intake Preparation catalog task and completes it again")
    public void user_clicks_on_intake_preparation_catalog_task_and_completes_it_again() {
        ESRApprovalStepsImplementation.completeIntakePreparation();
    }

    @Then("the user confirms the Federal Intake Approval was rejected for the ESR-Q ticket")
    public void the_user_confirms_the_federal_intake_approval_was_rejected_for_the_esr_q_ticket() {
        ESRApprovalStepsImplementation.confirmFederalIntakeApprovalWasRejectedForESRQ();
    }

    @And("the user receives a rejection for incorrect approver from a federal lead for intake approval in ESR-Q")
    public void the_user_receives_a_rejection_for_incorrect_approver_from_a_federal_lead_for_intake_approval_in_esr_q() {
        ESRApprovalStepsImplementation.federalLeadIntakeRejectionForIncorrectApproverInESRQ();
    }

    @Then("the user confirms the Federal Intake Approval was rejected for an incorrect approver in the ESR-Q ticket")
    public void the_user_confirms_the_federal_intake_approval_was_rejected_for_an_incorrect_approver_in_the_esr_q_ticket() {
        ESRApprovalStepsImplementation.confirmFederalIntakeApprovalWasRejectedForIncorrectApproverInESRQ();
    }

    @And("the user receives a rejection from a federal lead for intake approval in ESR-I")
    public void the_user_receives_a_rejection_from_a_federal_lead_for_intake_approval_in_esr_i() {
        ESRApprovalStepsImplementation.federalLeadIntakeRejectionForESRI();
    }

    @Then("the user confirms the Federal Intake Approval was rejected for the ESR-I ticket")
    public void the_user_confirms_the_federal_intake_approval_was_rejected_for_the_esr_i_ticket() {
        ESRApprovalStepsImplementation.confirmFederalIntakeApprovalWasRejectedForESRI();
    }

    @And("the user receives a rejection for incorrect approver from a federal lead for intake approval in ESR-I")
    public void the_user_receives_a_rejection_for_incorrect_approver_from_a_federal_lead_for_intake_approval_in_esr_i() {
        ESRApprovalStepsImplementation.federalLeadIntakeRejectionForIncorrectApproverInESRI();
    }

    @Then("the user confirms the Federal Intake Approval was rejected for an incorrect approver in the ESR-I ticket")
    public void the_user_confirms_the_federal_intake_approval_was_rejected_for_an_incorrect_approver_in_the_esr_i_ticket() {
        ESRApprovalStepsImplementation.confirmFederalIntakeApprovalWasRejectedForIncorrectApproverInESRI();
    }

    @And("the user is approved from the ESR Board approvers")
    public void the_user_is_approved_from_the_esr_board_approvers() {
        ESRApprovalStepsImplementation.esrBoardIntakeApprovals();
    }

    @Then("the user confirms the ESR Board Intake Approvals are completed")
    public void the_user_confirms_the_esr_board_intake_approvals_are_completed() {
        ESRApprovalStepsImplementation.confirmESRBoardIntakeApprovalsAreCompleted();
    }

    @And("the user is rejected from the ESR Board approvers with a need more info for ESR-Q")
    public void the_user_is_rejected_from_the_esr_board_approvers_with_a_need_more_info_for_esr_q() {
        ESRApprovalStepsImplementation.esrBoardNeedMoreInfoForESRQ();
    }

    @Then("the user confirms more information is needed for the ESR-Q ticket")
    public void the_user_confirms_more_information_is_needed_for_the_esr_q_ticket() {
        ESRApprovalStepsImplementation.confirmMoreInfoNeededForESRQ();
    }

    @And("the user is rejected from the ESR Board approvers with a rejection approval for ESR-Q")
    public void the_user_is_rejected_from_the_esr_board_approvers_with_a_rejection_approval_for_esr_q() {
        ESRApprovalStepsImplementation.esrBoardRejectionForESRQ();
    }

    @Then("the user confirms the ESR Board Intake Approval was rejected for the ESR-Q ticket")
    public void the_user_confirms_the_esr_board_intake_approval_was_rejected_for_the_esr_q_ticket() {
        ESRApprovalStepsImplementation.confirmESRBoardIntakeApprovalWasRejectedForESRQ();
    }

    @And("the user is rejected from the ESR Board approvers due to incorrect approver for ESR-Q")
    public void the_user_is_rejected_from_the_esr_board_approvers_due_to_incorrect_approver_for_esr_q() {
        ESRApprovalStepsImplementation.esrBoardRejectionForIncorrectApproverInESRQ();
    }

    @Then("the user confirms the ESR Board Intake Approval was rejected for an incorrect approver in the ESR-Q ticket")
    public void the_user_confirms_the_esr_board_intake_approval_was_rejected_for_an_incorrect_approver_in_the_esr_q_ticket() {
        ESRApprovalStepsImplementation.confirmESRBoardIntakeApprovalWasRejectedForIncorrectApproverInESRQ();
    }

    @And("the user is rejected from the ESR Board approvers with a need more info for ESR-I")
    public void the_user_is_rejected_from_the_esr_board_approvers_with_a_need_more_info_for_esr_i() {
        ESRApprovalStepsImplementation.esrBoardNeedMoreInfoForESRI();
    }

    @Then("the user confirms more information is needed for the ESR-I ticket")
    public void the_user_confirms_more_information_is_needed_for_the_esr_i_ticket() {
        ESRApprovalStepsImplementation.confirmMoreInfoNeededForESRI();
    }

    @And("the user is rejected from the ESR Board approvers with a rejection approval for ESR-I")
    public void the_user_is_rejected_from_the_esr_board_approvers_with_a_rejection_approval_for_esr_i() {
        ESRApprovalStepsImplementation.esrBoardRejectionForESRI();
    }

    @Then("the user confirms the ESR Board Intake Approval was rejected for the ESR-I ticket")
    public void the_user_confirms_the_esr_board_intake_approval_was_rejected_for_the_esr_i_ticket() {
        ESRApprovalStepsImplementation.confirmESRBoardIntakeApprovalWasRejectedForESRI();
    }

    @And("the user is rejected from the ESR Board approvers due to incorrect approver for ESR-I")
    public void the_user_is_rejected_from_the_esr_board_approvers_due_to_incorrect_approver_for_esr_i() {
        ESRApprovalStepsImplementation.esrBoardRejectionForIncorrectApproverInESRI();
    }

    @Then("the user confirms the ESR Board Intake Approval was rejected for an incorrect approver in the ESR-I ticket")
    public void the_user_confirms_the_esr_board_intake_approval_was_rejected_for_an_incorrect_approver_in_the_esr_i_ticket() {
        ESRApprovalStepsImplementation.confirmESRBoardIntakeApprovalWasRejectedForIncorrectApproverInESRI();
    }

    @And("the user is approved from the Operational POC")
    public void the_user_is_approved_from_the_operational_poc() {
        ESRApprovalStepsImplementation.operationalPOCApproval();
    }

    @Then("the user confirms the Operational POC Approval is completed")
    public void the_user_confirms_the_operational_poc_approval_is_completed() {
        ESRApprovalStepsImplementation.confirmOperationalPOCApprovalIsCompleted();
    }

    @And("the user is rejected from an Operational POC with a need more info")
    public void the_user_is_rejected_from_an_operational_poc_with_a_need_more_info() {
        ESRApprovalStepsImplementation.operationalPOCNeedMoreInfo();
    }

    @Then("the user confirms the Operational POC Approval needs more information")
    public void the_user_confirms_the_operational_poc_approval_needs_more_information() {
        ESRApprovalStepsImplementation.confirmOperationalPOCApprovalNeedsMoreInfo();
    }

    @And("the user is rejected from an Operational POC")
    public void the_user_is_rejected_from_an_operational_poc() {
        ESRApprovalStepsImplementation.operationalPOCRejection();
    }

    @Then("the user confirms the Operational POC Approval is rejected")
    public void the_user_confirms_the_operational_poc_approval_is_rejected() {
        ESRApprovalStepsImplementation.confirmOperationalPOCApprovalIsRejected();
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

    @And("the user is rejected from a federal lead for closeout approval for ESR-Q")
    public void the_user_is_rejected_from_a_federal_lead_for_closeout_approval_for_esr_q() {
        ESRApprovalStepsImplementation.federalLeadCloseoutRejectionForESRQ();
    }

    @Then("the user confirms the Federal Lead Closeout Approval was rejected for the ESR-Q ticket")
    public void the_user_confirms_the_federal_lead_closeout_approval_was_rejected_for_the_esr_q_ticket() {
        ESRApprovalStepsImplementation.confirmFederalLeadCloseoutApprovalWasRejectedForESRQ();
    }

    @And("the user is rejected from a federal lead closeout due to incorrect approver for ESR-Q")
    public void the_user_is_rejected_from_a_federal_lead_closeout_due_to_incorrect_approver_for_esr_q() {
        ESRApprovalStepsImplementation.federalLeadCloseoutRejectionForIncorrectApproverInESRQ();
    }

    @Then("the user confirms the Federal Lead Closeout Approval was rejected for incorrect approver in the ESR-Q ticket")
    public void the_user_confirms_the_federal_lead_closeout_approval_was_rejected_for_incorrect_approver_in_the_esr_q_ticket() {
        ESRApprovalStepsImplementation.confirmFederalLeadCloseoutApprovalWasRejectedForIncorrectApproverInESRQ();
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

    @And("the user is rejected from ESR Board Closeout Review with a need more info for ESR-Q")
    public void the_user_is_rejected_from_esr_board_closeout_review_with_a_need_more_info_for_esr_q() {
        ESRApprovalStepsImplementation.esrBoardCloseoutNeedMoreInfoForESRQ();
    }

    @And("the user is rejected from the ESR Board Closeout approvers with a rejection approval for ESR-Q")
    public void the_user_is_rejected_from_the_esr_board_closeout_approvers_with_a_rejection_approval_for_esr_q() {
        ESRApprovalStepsImplementation.esrBoardCloseoutRejectionForESRQ();
    }

    @Then("the user confirms the ESR Board Closeout Approval was rejected for the ESR-Q ticket")
    public void the_user_confirms_the_esr_board_closeout_approval_was_rejected_for_the_esr_q_ticket() {
        ESRApprovalStepsImplementation.confirmESRBoardCloseoutApprovalWasRejectedForESRQ();
    }

    @And("the user is approved for ESR Board Closeout Review for ESR-I")
    public void the_user_is_approved_for_esr_board_closeout_review_for_esr_i() {
        ESRApprovalStepsImplementation.esrBoardCloseoutApprovalsForESRI();
    }

    @And("the user is rejected from ESR Board Closeout Review with a need more info for ESR-I")
    public void the_user_is_rejected_from_esr_board_closeout_review_with_a_need_more_info_for_esr_i() {
        ESRApprovalStepsImplementation.esrBoardCloseoutNeedMoreInfoForESRI();
    }

    @And("the user is rejected from the ESR Board Closeout approvers with a rejection approval for ESR-I")
    public void the_user_is_rejected_from_the_esr_board_closeout_approvers_with_a_rejection_approval_for_esr_i() {
        ESRApprovalStepsImplementation.esrBoardCloseoutRejectionForESRI();
    }

    @Then("the user confirms the ESR Board Closeout Approval was rejected for the ESR-I ticket")
    public void the_user_confirms_the_esr_board_closeout_approval_was_rejected_for_the_esr_i_ticket() {
        ESRApprovalStepsImplementation.confirmESRBoardCloseoutApprovalWasRejectedForESRI();
    }

    @Then("the user confirms the ESR Board Closeout Review approvals are completed")
    public void the_user_confirms_the_esr_board_closeout_review_approvals_are_completed() {
        ESRApprovalStepsImplementation.confirmESRBoardCloseoutReviewApprovalsAreCompleted();
    }
}