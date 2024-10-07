package ServiceNow.PlatformBusinessApps.NERD.StepsImplementation;

import ServiceNow.PlatformBusinessApps.NERD.Constants.ReturningSubmissions_Constants;
import ServiceNow.PlatformBusinessApps.NERD.Pages.NERDDOCCollaborationsPage;
import appsCommon.PageInitializers.PageInitializer;
import appsCommon.Utils.ServiceNow_Common_Methods;
import appsCommon.Utils.ServiceNow_Login_Methods;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import static com.nci.automation.web.TestProperties.getNerdUrl;

public class NERDCollaborationSubmissionStepImpl extends PageInitializer {

    /**
     * Creates a new submission for the Collaboration category.
     */
    public static void createsANewSubmissionForCollaborationCategory() {
        NERDApplicationStepsImplementation.creatingNewCollaborationSubmission(
                nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsCreateNewSubmissionLink);
    }

    /**
     * This method represents the submission process for a collaboration submission.
     */
    public static void aRegularUserHasSubmittedACollaboration() {
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        WebDriverUtils.webDriver.get(getNerdUrl());
        NERDApplicationStepsImplementation.creatingNewSubmission(
                nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsCreateNewSubmissionLink);
        NERDApplicationStepsImplementation.creatingOfNewSubmissionByStaffMember(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION);
        ServiceNow_Common_Methods.logOutOfNativeView();
    }

    /**
     * The method allows the DOC planning contact to locate and view a record in their collaboration queue.
     *
     * @param docPlanningContact The DOC planning contact who will view the record.
     * @param nameOfRecord The name/id of the record to be located.
     */
    public static void theDOCPlanningContactLocatesTheRecordInTheirCollaborationQueue(String docPlanningContact,String nameOfRecord) {
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        ServiceNow_Common_Methods.impersonateAnyUser(docPlanningContact);
        WebDriverUtils.webDriver.get(getNerdUrl());
        NERDApplicationStepsImplementation.clickingOnCollaborationsLink();
        JavascriptUtils.scrollIntoView(nerdDynamicXpaths.publishedCollaboration(nameOfRecord));
        CucumberLogUtils.logScreenshot();
    }

    /**
     * Clicks the edit button for a specific record.
     *
     * @param nameOfRecord The name/id of the record to be edited.
     */
    public static void clicksTheEditButtonForTheRecord(String nameOfRecord) {
        CommonUtils.sleep(1000);
        CommonUtils.waitForClickability(nerdDynamicXpaths.editButton(nameOfRecord));
        nerdDynamicXpaths.editButton(nameOfRecord).click();
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method navigates to the submission edit page for a specific author.
     *
     * @param author The name of the author for whom the submission edit page needs to be opened.
     */
    public static void landsOnTheSubmissionEditPageForAuthor(String author) {
        CommonUtils.switchToAnotherWindow();
        CommonUtils.sleep(3000);
        String actualText = NERDDOCCollaborationsPage.authorText(author).getText();
        JavascriptUtils.drawBlueBorder(NERDDOCCollaborationsPage.authorText(author));
        CommonUtils.assertEquals(actualText, author);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method represents the behavior of a DOC planning contact clicking the Submit to CRS button for a collaboration.
     *
     * @param docPlanningContact The name of the DOC planning contact.
     */
    public static void aDOCPlanningContactClicksTheSubmitToCRSButtonForACollaboration(String docPlanningContact) {
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        WebDriverUtils.webDriver.get(getNerdUrl());
        NERDApplicationStepsImplementation.creatingNewSubmission(
                nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsCreateNewSubmissionLink);
        NERDApplicationStepsImplementation.creatingOfNewSubmissionByStaffMember(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION);
        ServiceNow_Common_Methods.logOutOfNativeView();
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        ServiceNow_Common_Methods.impersonateAnyUser(docPlanningContact);
        WebDriverUtils.webDriver.get(getNerdUrl());
        NERDApplicationStepsImplementation.clickingOnCollaborationsLink();
        CommonUtils.sleep(1000);
        JavascriptUtils.scrollIntoView(nerdDynamicXpaths.publishedCollaboration(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION));
        nerdDynamicXpaths.submitToCRSButton(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION).click();
        CommonUtils.waitForVisibility(
                nerdCrsKnowledgeDatabaseSubmissionsPage.confirmPopUpWindowYESbutton);
        nerdCrsKnowledgeDatabaseSubmissionsPage.confirmPopUpWindowYESbutton.click();
        CommonUtils.waitForVisibility(
                nerdCrsKnowledgeDatabaseSubmissionsPage.submissionSuccessfullyPopUpOkButton);
        nerdCrsKnowledgeDatabaseSubmissionsPage.submissionSuccessfullyPopUpOkButton.click();
    }

    /**
     * This` method is used to navigate the CRS Reviewer to locate the record on the Submissions page.
     *
     * @param crsReviewer the username of the CRS Reviewer
     */
    public static void theCRSReviewerLocatesTheRecordInTheSubmissionsPage(String crsReviewer) {
        NERD_NCI_CRSReviewerStepsImplementation.crsReviewerIsOnSubmissionsPage(crsReviewer, ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION);
    }
}