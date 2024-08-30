package ServiceNow.PlatformBusinessApps.NERD.StepsImplementation;

import ServiceNow.PlatformBusinessApps.NERD.Constants.ReturningSubmissions_Constants;
import appsCommon.Utils.ServiceNow_Common_Methods;
import appsCommon.Utils.ServiceNow_Login_Methods;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.WebDriverUtils;

public class NERD_Returning_Submission_StepImpl {

    /**
     * Executes the process of returning a published collaboration to the DOC planning contact by the CRS reviewer.
     *
     * @param docPlanningContact The contact person for the DOC planning
     * @param crsReviewer The CRS reviewer who is returning the collaboration
     */
    public static void published_collaboration_has_been_returned_to_the_doc_planning_contact_by_the_crs_reviewer(String docPlanningContact, String crsReviewer) {
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        NERD_NCI_StaffMemberStepsImplementation.creatingOfSubmissionByProgramStaff(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_NAME_CRS_REVIEWER);
        NERD_NCI_DOC_PlanningContactStepsImplementation.submittingOfSubmissionToCRSReviewer(docPlanningContact, ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_NAME_CRS_REVIEWER);
        NERD_NCI_CRSReviewerStepsImplementation.publishingOfSubmissionByCRSReviewer(crsReviewer, ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_NAME_CRS_REVIEWER);
        NERDApplicationStepsImplementation.returningOfSubmission(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_NAME_CRS_REVIEWER);
    }

    /**
     * This method verifies that "Please specify" and "Fiscal Year" fields are not cleared and Required
     *
     * @param PleaseSpecify The value of the PleaseSpecify field
     * @param FiscalYear The value of the FiscalYear field
     */
    public static void the_and_field_values_are_cleared_and_are_required(String PleaseSpecify, String FiscalYear) {
        NERDApplicationStepsImplementation.openingNewTabToEditSubmission(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_NAME_CRS_REVIEWER);
        NERD_NCI_DOC_PlanningContactStepsImplementation.verifyingByDOCContactThatFieldsOfSubmissionAreClearedAndRequired(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_NAME_CRS_REVIEWER, PleaseSpecify, FiscalYear);
    }

    /**
     * This method verifies that "Please specify" and "Fiscal Year" fields are not cleared and Required
     *
     * @param PleaseSpecify The value of PleaseSpecify parameter
     * @param FiscalYear The value of FiscalYear parameter
     */
    public static void the_and_field_values_are_not_cleared_and_are_required(String PleaseSpecify, String FiscalYear) {
        ServiceNow_Common_Methods.logOutOfNativeView();
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));
        NERDApplicationStepsImplementation.openingNewTabToEditSubmission(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_NAME_CRS_REVIEWER);
        NERDApplicationStepsImplementation.verifyingThatFieldsOfSubmissionAreClearedAndRequired(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_NAME_CRS_REVIEWER, PleaseSpecify, FiscalYear);
    }

    /**
     * This method verifies that "Please specify" field has "Edited", "No change", "Ended", and "Not led by NCI" options available
     *
     * @param PleaseSpecify The available option for the field to specify.
     * @param Edited The available option for the field to indicate it has been edited.
     * @param NocChange The available option for the field to indicate it needs a No Change response.
     * @param Ended The available option for the field to indicate it has ended.
     * @param NotLedByNCI The available option for the field to indicate it is not led by NCI.
     */
    public static void the_options_available_for_the_field_are_and(String PleaseSpecify, String Edited, String NocChange, String Ended, String NotLedByNCI) {
        ServiceNow_Common_Methods.logOutOfNativeView();
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));
        NERDApplicationStepsImplementation.verifyingAvailableOptionsOfSubmission(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_NAME_CRS_REVIEWER, PleaseSpecify, Edited, NocChange, Ended, NotLedByNCI);
    }

        /**
         * This method verifies that program staff member submits a collaboration to the DOC planning contact
         */
    public static void a_Collaboration_has_been_submitted_to_the_DOC_Planning_Contact() {
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        NERD_NCI_StaffMemberStepsImplementation.creatingOfSubmissionByProgramStaff(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_NAME_UNDER_REVIEW_TEXT);
    }

    /**
     * This method submits a collaboration for publishing.
     * A Collaboration is submitted by Program Staff Member
     * Program Staff Member submits to Doc Planning Contact
     * Doc Planning Contact submits to The CRS reviewer
     * The CRS reviewer publishes the Collaboration and
     *
     * @param docPlanningContact The contact person for the DOC planning
     * @param crsReviewer The CRS reviewer who will review and publish the collaboration
     */
    public static void a_collaboration_has_been_submitted_by_the_program_staff_member_to_the_doc_planning_contact_who_submits_to_crs_reviewer_for_publishing(String docPlanningContact, String crsReviewer) {
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        NERD_NCI_StaffMemberStepsImplementation.creatingOfSubmissionByProgramStaff(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_VERSION_NUMBER);
        NERD_NCI_DOC_PlanningContactStepsImplementation.submittingOfSubmissionToCRSReviewer(docPlanningContact, ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_VERSION_NUMBER);
        NERD_NCI_CRSReviewerStepsImplementation.publishingOfSubmissionByCRSReviewer(crsReviewer, ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_VERSION_NUMBER);
    }

    /**
     * Executes the process of returning a published collaboration to the DOC planning contact.
     */
    public static void a_published_collaboration_has_been_returned_to_the_doc_planning_contact() {
        NERDApplicationStepsImplementation.returningOfSubmission(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_VERSION_NUMBER);
    }

    /**
     * Executes the process of returning a published collaboration to the program staff by the DOC planning contact,
     * specifying the article version number.
     *
     * @param docPlanningContact The contact person for the DOC planning
     * @param versionNumber The version number of the article
     */
    public static void a_published_collaboration_has_been_returned_to_the_program_staff_by_doc_planning_contact_with_the_article_version_number_as(String docPlanningContact, String versionNumber) {
        NERDApplicationStepsImplementation.verifyingArticleVersionNumber(versionNumber);
        NERD_NCI_DOC_PlanningContactStepsImplementation.editingAndReturningSubmissionToProgramStaff(docPlanningContact, ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_VERSION_NUMBER);
    }

    /**
     * The method the_doc_planning_contact_resubmits_the_article_to_the_crs_reviewer
     * the article is resubmitted to the CRS reviewer by the DOC planning contact.
     *
     * @param docPlanningContact The contact person for the DOC planning.
     * @param crsReviewer The CRS reviewer who will review the submission.
     */
    public static void the_doc_planning_contact_resubmits_the_article_to_the_crs_reviewer(String docPlanningContact, String crsReviewer) {
        NERD_NCI_DOC_PlanningContactStepsImplementation.submittingOfSubmissionToCRSReviewer(docPlanningContact, ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_VERSION_NUMBER);
        NERD_NCI_CRSReviewerStepsImplementation.publishingOfSubmissionByCRSReviewer(crsReviewer, ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_VERSION_NUMBER);
    }

    /**
     * The method increments the article version number by one major version.
     * This method verifies the incremented article version number,
     * and returns the submission to the DOC planning contact,
     * and checks if an email was not received.
     *
     * @param versionNumber The current version number of the article.
     */
    public static void the_article_is_incremented_one_major_version_number_as(String versionNumber) {
        NERDApplicationStepsImplementation.verifyingIncrementedArticleVersionNumber(versionNumber);
        NERDApplicationStepsImplementation.returningOfSubmissionToDOCPlaningContact(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_VERSION_NUMBER);
        NERDApplicationStepsImplementation.checkingEmailWasNotReceived();
    }
}