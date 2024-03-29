package ServiceNow.PlatformBusinessApps.NERD.selenium.StepsImplementation;

import ServiceNow.PlatformBusinessApps.NERD.Constants.NCI_Staff_Members_Constants;
import ServiceNow.PlatformBusinessApps.NERD.Constants.ReturningSubmissions_Constants;
import appsCommon.PageInitializers.PageInitializer;
import appsCommon.Utils.ServiceNow_Common_Methods;
import appsCommon.Utils.ServiceNow_Login_Methods;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;
import org.junit.Assert;

import java.util.Set;

public class NERD_NCI_StaffMemberStepsImplementation extends PageInitializer {
    /**
     * This method will submit Application to DOC Planing Contact
     *
     * @param submissionName
     */
    public static void submittingOfApplicationToDocPlaningContact(String submissionName) {
        ServiceNow_Common_Methods.logOutOfNativeView();
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));
        WebDriverUtils.webDriver.navigate().refresh();
        MiscUtils.sleep(5000);
        nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink.click();
        MiscUtils.sleep(2000);
        JavascriptUtils.clickByJS(nerdDynamicXpaths.submitButtonToDOCPlanningContact(submissionName));
        MiscUtils.sleep(2000);
        JavascriptUtils.clickByJS(nerdCrsKnowledgeDatabaseSubmissionsPage.confirmSubmissionYesButton);
        MiscUtils.sleep(2000);
        JavascriptUtils.clickByJS(nerdCrsKnowledgeDatabaseSubmissionsPage.popUpOKbutton);
        MiscUtils.sleep(2000);
        JavascriptUtils.scrollIntoView(nerdDynamicXpaths.underReviewText(submissionName));
        MiscUtils.sleep(1000);
        Assert.assertTrue(nerdDynamicXpaths.underReviewText(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_VERSION_NUMBER).getText().contentEquals("Under Review"));
        JavascriptUtils.drawBlueBorder(nerdDynamicXpaths.underReviewText(submissionName));
        CucumberLogUtils.logScreenshot();
        MiscUtils.sleep(5000);
    }

    /**
     * This method will edit and submit Collaboration to DOC Planing Contact
     *
     * @param submissionName
     */
    public static void editingAndSubmittingOfCollaborationToDOCPlaningContact(String submissionName) throws TestingException {
        nativeViewImpersonateUser.impersonateToStaffMemberCBIIT();
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));
        CommonUtils.waitForVisibility(
                nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink);
        nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink.click();
        JavascriptUtils.scrollIntoView(
                nerdDynamicXpaths.eiditCRSButton(submissionName));
        nerdDynamicXpaths.eiditCRSButton(submissionName).click();
        MiscUtils.sleep(2000);
        Set<String> allWindowHandles1 = WebDriverUtils.webDriver.getWindowHandles();
        for (String currentWindow1 : allWindowHandles1) {
            WebDriverUtils.webDriver.switchTo().window(currentWindow1);
        }
        CommonUtils.waitForVisibility(createNewSubmissionPage.pleaseSpecifyDropDown);
        CommonUtils.selectDropDownValue("Edited", createNewSubmissionPage.pleaseSpecifyDropDown);
        CommonUtils.selectDropDownValue("2022", createNewSubmissionPage.fiscalYearDropDown);
        JavascriptUtils.scrollIntoView(createNewSubmissionPage.editedStaffMemberSubmissionSaveButton);
        createNewSubmissionPage.editedStaffMemberSubmissionSaveButton.click();
        CommonUtils.waitForVisibility(nerdCrsKnowledgeDatabaseSubmissionsPage.submissionSuccessfullyPopUpOkButton);
        nerdCrsKnowledgeDatabaseSubmissionsPage.submissionSuccessfullyPopUpOkButton.click();
        CommonUtils.waitForVisibility(
                nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink);
        nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink.click();
        JavascriptUtils.scrollIntoView(nerdDynamicXpaths
                .submitButtonToDOCPlanningContact(submissionName));
        nerdDynamicXpaths.submitButtonToDOCPlanningContact(submissionName)
                .click();
        CommonUtils.waitForVisibility(nerdCrsKnowledgeDatabaseSubmissionsPage.confirmPopUpWindowYESbutton);
        nerdCrsKnowledgeDatabaseSubmissionsPage.confirmPopUpWindowYESbutton.click();
        CommonUtils.waitForVisibility(nerdCrsKnowledgeDatabaseSubmissionsPage.submissionSuccessfullyPopUpOkButton);
        nerdCrsKnowledgeDatabaseSubmissionsPage.submissionSuccessfullyPopUpOkButton.click();
    }

    /**
     * This method will delete the Submission by Program Staff
     *
     * @param submissionName
     */
    public static void deletingOfSubmissionByProgramStaff(String submissionName) {
        ServiceNow_Common_Methods.logOutOfNativeView();
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        MiscUtils.sleep(2000);
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));
        WebDriverUtils.webDriver.navigate().refresh();
        MiscUtils.sleep(5000);
        nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink.click();
        nerdDynamicXpaths.deleteButtonReturnedToStaffMember(submissionName).click();
        MiscUtils.sleep(1000);
        JavascriptUtils.clickByJS(nerdCrsKnowledgeDatabaseSubmissionsPage.confirmDeleteYesButton);
        MiscUtils.sleep(1000);
        nerdCrsKnowledgeDatabaseSubmissionsPage.popUpOKbutton.click();
        MiscUtils.sleep(1000);
    }

    /**
     * This method will create the Submission by Program Staff
     *
     * @param submissionName
     */
    public static void creatingOfSubmissionByProgramStaff(String submissionName) {
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));
        NERDApplicationStepsImplementation.creatingNewSubmission(nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsCreateNewSubmissionLink);
        NERDApplicationStepsImplementation.creatingOfNewSubmissionByStaffMember(submissionName);
    }

    /**
     * This method will locate Staff Member to Submissions Page
     *
     * @param applicationName
     */
    public static void locatingProgramStaffMemberToSubmissionsPage(String applicationName) throws TestingException {
        nativeViewImpersonateUser.impersonateToStaffMemberCBIIT();
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl(applicationName));
        CucumberLogUtils.logScreenshot();
        CommonUtils.waitForVisibility(
                nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink);
        nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink.click();
    }

    public static void aProgramStaffMemberIsOnTheCRSKnowledgeManagementSystemPage(String submissionsPage)
            throws TestingException {
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));
        MiscUtils.sleep(1000);
        CommonUtils.assertEquals(NCI_Staff_Members_Constants.CRS_KNOWLEDGE_MANAGEMENT_SYSTEM_TEXT_MAIN_PAGE, nerdKnowledgeBasePage.nerdCRSKnowledgeMainText.getText());
        JavascriptUtils.drawBlueBorder(
                nerdKnowledgeBasePage.nerdCRSKnowledgeMainText);
        Assert.assertEquals(submissionsPage,
                nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageSubmissionsLink
                        .getText());
        JavascriptUtils.drawBlueBorder(
                nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageSubmissionsLink);
        CucumberLogUtils.logScreenshot();
    }

    public static void thereAreFiveSubmissionsCalled(String topAccomplishments, String otherAccomplishments, String collaborations,
                                                     String covid19Activities, String adHocDataCall){
        CommonUtils.assertEquals(topAccomplishments, nerdHomePage.nerdKnowledgeBaseText.getText());
        CommonUtils.assertEquals(otherAccomplishments, nerdHomePage.rockKnowledgeBaseText.getText());
        CommonUtils.assertEquals(collaborations,
                nerdHomePage.moonshotEvaluationKnowledgeBaseText.getText());
        CommonUtils.assertEquals(covid19Activities, nerdHomePage.nerdKnowledgeBaseText.getText());
        CommonUtils.assertEquals(adHocDataCall, nerdHomePage.rockKnowledgeBaseText.getText());

        JavascriptUtils.drawBlueBorder(nerdHomePage.nerdKnowledgeBaseText);
        JavascriptUtils.drawBlueBorder(nerdHomePage.rockKnowledgeBaseText);
        JavascriptUtils.drawBlueBorder(nerdHomePage.moonshotEvaluationKnowledgeBaseText);
        CucumberLogUtils.logScreenshot();

    }
}
