package ServiceNow.PlatformBusinessApps.NERD.StepsImplementation;

import ServiceNow.PlatformBusinessApps.NERD.Constants.ReturningSubmissions_Constants;
import ServiceNow.PlatformBusinessApps.NERD.Constants.TopAccomplishmentsSubmission_Constants;
import ServiceNow.PlatformBusinessApps.NERD.Pages.NERDDOCCollaborationsPage;
import appsCommon.PageInitializers.PageInitializer;
import appsCommon.Utils.ServiceNow_Common_Methods;
import appsCommon.Utils.ServiceNow_Login_Methods;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;

public class NERDCollaborationSubmissionStepImpl extends PageInitializer {

    public static void createsANewSubmissionForCollaborationCategory() {
        NERDApplicationStepsImplementation.creatingNewCollaborationSubmission(
                nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsCreateNewSubmissionLink);
    }

    public static void theCreatedCollaborationsSubmissionIsDisplayInTheCollaborationsCategorySectionWithTheStatus(String underReview)  {
        NERDApplicationStepsImplementation.creatingOfNewSubmissionByStaffMember(TopAccomplishmentsSubmission_Constants.TOP_ACCOMPLISHMENTS_SUBMISSION_NAME);
        NERDApplicationStepsImplementation.verifyingSubmissionIsUnderReview(TopAccomplishmentsSubmission_Constants.TOP_ACCOMPLISHMENTS_SUBMISSION_NAME, underReview);
        NERD_NCI_DOC_PlanningContactStepsImplementation
                .deleteCreatedSubmissionByDocPlanningContact(TopAccomplishmentsSubmission_Constants.TOP_ACCOMPLISHMENTS_SUBMISSION_NAME);
    }

    public static void aRegularUserHasSubmittedACollaboration() {
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));
        NERDApplicationStepsImplementation.creatingNewSubmission(
                nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsCreateNewSubmissionLink);
        NERDApplicationStepsImplementation.creatingOfNewSubmissionByStaffMember(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION);
        ServiceNow_Common_Methods.logOutOfNativeView();
    }

    public static void theDOCPlanningContactLocatesTheRecordInTheirCollaborationQueue(String docPlanningContact,String nameOfRecord) {
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        ServiceNow_Common_Methods.impersonateAnyUser(docPlanningContact);
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));
        NERDApplicationStepsImplementation.clickingOnCollaborationsLink();
        JavascriptUtils.scrollIntoView(nerdDynamicXpaths.publishedCollaboration(nameOfRecord));
        CucumberLogUtils.logScreenshot();
    }

    public static void clicksTheEditButtonForTheRecord(String nameOfRecord) {
        MiscUtils.sleep(1000);
        CommonUtils.waitForClickability(nerdDynamicXpaths.editButton(nameOfRecord));
        nerdDynamicXpaths.editButton(nameOfRecord).click();
        CucumberLogUtils.logScreenshot();
    }

    public static void landsOnTheSubmissionEditPageForAuthor(String author) {
        CommonUtils.switchToAnotherWindow();
        MiscUtils.sleep(3000);
        String actualText = NERDDOCCollaborationsPage.authorText(author).getText();
        JavascriptUtils.drawBlueBorder(NERDDOCCollaborationsPage.authorText(author));
        CommonUtils.assertEquals(actualText, author);
        CucumberLogUtils.logScreenshot();
    }

    public static void aDOCPlanningContactClicksTheSubmitToCRSButtonForACollaboration(String docPlanningContact) {
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));
        NERDApplicationStepsImplementation.creatingNewSubmission(
                nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsCreateNewSubmissionLink);
        NERDApplicationStepsImplementation.creatingOfNewSubmissionByStaffMember(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION);
        ServiceNow_Common_Methods.logOutOfNativeView();
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        ServiceNow_Common_Methods.impersonateAnyUser(docPlanningContact);
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));
        NERDApplicationStepsImplementation.clickingOnCollaborationsLink();
        MiscUtils.sleep(1000);
        JavascriptUtils.scrollIntoView(nerdDynamicXpaths.publishedCollaboration(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION));
        nerdDynamicXpaths.submitToCRSButton(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION).click();
        CommonUtils.waitForVisibility(
                nerdCrsKnowledgeDatabaseSubmissionsPage.confirmPopUpWindowYESbutton);
        nerdCrsKnowledgeDatabaseSubmissionsPage.confirmPopUpWindowYESbutton.click();
        CommonUtils.waitForVisibility(
                nerdCrsKnowledgeDatabaseSubmissionsPage.submissionSuccessfullyPopUpOkButton);
        nerdCrsKnowledgeDatabaseSubmissionsPage.submissionSuccessfullyPopUpOkButton.click();
    }

    public static void theCRSReviewerLocatesTheRecordInTheSubmissionsPage(String crsReviewer) {
        NERD_NCI_CRSReviewerStepsImplementation.crsReviewerIsOnSubmissionsPage(crsReviewer, ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION);
    }
}