package ServiceNow.NERD.StepsImplementation;

import ServiceNow.NERD.Constants.TopAccomplishmentsSubmission_Constants;
import ServiceNow.NERD.Pages.NERDDOCCollaborationsPage;
import appsCommon.Utils.ServiceNow_Common_Methods;
import appsCommon.Utils.ServiceNow_Login_Methods;
import appsCommon.PageInitializers.PageInitializer;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;
import org.openqa.selenium.WebDriver;

public class NERDCollaborationSubmissionStepImpl extends PageInitializer {

    public static void createsANewSubmissionForCollaborationCategory() {
        NERDApplicationStepsImplementation.creatingNewCollaborationSubmission(
                nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsCreateNewSubmissionLink);
    }

    public static void theCreatedCollaborationsSubmissionIsDisplayInTheCollaborationsCategorySectionWithTheStatus(
            String underReview) throws TestingException {
        NERDApplicationStepsImplementation.creatingOfNewSubmissionByStaffMember(TopAccomplishmentsSubmission_Constants.TOP_ACCOMPLISHMENTS_SUBMISSION_NAME);
        NERDApplicationStepsImplementation.verifyingSubmissionIsUnderReview(TopAccomplishmentsSubmission_Constants.TOP_ACCOMPLISHMENTS_SUBMISSION_NAME, underReview);
        NERD_NCI_DOC_PlanningContactStepsImplementation
                .deleteCreatedSubmissionByDocPlanningContact(TopAccomplishmentsSubmission_Constants.TOP_ACCOMPLISHMENTS_SUBMISSION_NAME);
    }

    public static void aRegularUserHasSubmittedACollaboration() throws TestingException {
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));
        NERDApplicationStepsImplementation.creatingNewSubmission(
                nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsCreateNewSubmissionLink);
        NERDApplicationStepsImplementation.creatingOfNewSubmissionByStaffMember("Diego Test");
        ServiceNow_Common_Methods.logOutOfNativeView();
    }

    public static void theDOCPlanningContactLocatesTheRecordInTheirCollaborationQueue(String nameOfRecord)
            throws TestingException {
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        ServiceNow_Common_Methods.impersonateAnyUser("Karen Ortner");
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));
        NERDApplicationStepsImplementation.clickingOnCollaborationsLink();
        JavascriptUtils.scrollIntoView(nerdDynamicXpaths.publishedCollaboration(nameOfRecord));
    }

    public static void clicksTheEditButtonForTheRecord(String nameOfRecord) {
        MiscUtils.sleep(1000);
        CommonUtils.waitForClickability(nerdDynamicXpaths.editButton(nameOfRecord));
        nerdDynamicXpaths.editButton(nameOfRecord).click();
    }

    public static void landsOnTheSubmissionEditPageForAuthor(String author) {
        CommonUtils.switchToAnotherWindow();
        MiscUtils.sleep(3000);
        String actualText = NERDDOCCollaborationsPage.authorText(author).getText();
        CommonUtils.assertEquals(actualText, author);
    }

    public static void theRankFieldIsNotVisibleAndCollaborationIsDeletedForAutomationTesting(
            String collaborationName) throws TestingException {
        NERD_NCI_DOC_PlanningContactStepsImplementation
                .verifyingRankFieldIsNotDisplayedOnCollaborationForm(collaborationName);
    }

    public static void aDOCPlanningContactClicksTheSubmitToCRSButtonForACollaboration(String nameOfRecord)
            throws TestingException {
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));
        NERDApplicationStepsImplementation.creatingNewSubmission(
                nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsCreateNewSubmissionLink);
        NERDApplicationStepsImplementation.creatingOfNewSubmissionByStaffMember("Diego Test");
        ServiceNow_Common_Methods.logOutOfNativeView();
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        ServiceNow_Common_Methods.impersonateAnyUser("Karen Ortner");
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));
        NERDApplicationStepsImplementation.clickingOnCollaborationsLink();
        MiscUtils.sleep(1000);
        JavascriptUtils.scrollIntoView(nerdDynamicXpaths.publishedCollaboration(nameOfRecord));
        nerdDynamicXpaths.submitToCRSButton(nameOfRecord).click();
        CommonUtils.waitForVisibility(
                nerdCrsKnowledgeDatabaseSubmissionsPage.confirmPopUpWindowYESbutton);
        nerdCrsKnowledgeDatabaseSubmissionsPage.confirmPopUpWindowYESbutton.click();
        CommonUtils.waitForVisibility(
                nerdCrsKnowledgeDatabaseSubmissionsPage.submissionSuccessfullyPopUpOkButton);
        nerdCrsKnowledgeDatabaseSubmissionsPage.submissionSuccessfullyPopUpOkButton.click();
    }

    public static void theCRSReviewerLocatesTheRecordInTheSubmissionsPage(String collaborationName)
            throws TestingException {
        NERD_NCI_CRSReviewerStepsImplementation.crsReviewerIsOnSubmissionsPage(collaborationName);
        CommonUtils.waitForVisibility(nerdDynamicXpaths.publishedCollaboration(collaborationName));
        JavascriptUtils.scrollIntoView(nerdDynamicXpaths.publishedCollaboration(collaborationName));
    }
}
