package ServiceNow.NERD.StepsImplementation;

import appsCommon.PageInitializer;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;

public class NERD_NCI_CRSReviewerStepsImplementation extends PageInitializer {

    /**
     * This method will publish existing submission by CRS Reviewer
     *
     * @param submissionName
     */
    public static void publishingOfSubmissionByCRSReviewer(String submissionName) throws TestingException {
        nativeViewImpersonateUser.impersonateToCRSReviewer();
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));
        CommonUtils.waitForVisibility(
                nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemHomePageDropDownMenu);
        nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemHomePageDropDownMenu.click();
        CommonUtils.selectValueFromBootStrapDropDown(
                nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemHomePageDropDownMenuValues,
                "Submissions");
        CommonUtils.waitForVisibility(nerdCrsKnowledgeDatabaseSubmissionsPage.submissionsOrderByDropDown);
        nerdCrsKnowledgeDatabaseSubmissionsPage.submissionsOrderByDropDown.click();
        CommonUtils.waitForVisibility(nerdDynamicXpaths
                .publishedCollaboration(submissionName));
        nerdDynamicXpaths.publishToNERDButton(submissionName).click();
        CommonUtils.waitForVisibility(nerdCrsKnowledgeDatabaseSubmissionsPage.confirmPopUpWindowYESbutton);
        nerdCrsKnowledgeDatabaseSubmissionsPage.confirmPopUpWindowYESbutton.click();
        CommonUtils.waitForVisibility(nerdCrsKnowledgeDatabaseSubmissionsPage.submissionSuccessfullyPopUpOkButton);
        nerdCrsKnowledgeDatabaseSubmissionsPage.submissionSuccessfullyPopUpOkButton.click();
    }

    /**
     * This method will return existing submission by CRS Reviewer to DOC Planing Contact
     *
     * @param submissionName
     */
    public static void returningOfSubmissionByCRSReviewer(String submissionName) throws TestingException {
        nativeViewImpersonateUser.impersonateToCRSReviewer();
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));
        CommonUtils.waitForVisibility(
                nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemHomePageDropDownMenu);
        nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemHomePageDropDownMenu.click();
        CommonUtils.selectValueFromBootStrapDropDown(
                nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemHomePageDropDownMenuValues,
                "Submissions");
        CommonUtils.waitForVisibility(nerdCrsKnowledgeDatabaseSubmissionsPage.submissionsOrderByDropDown);
        nerdCrsKnowledgeDatabaseSubmissionsPage.submissionsOrderByDropDown.click();
        CommonUtils.waitForVisibility(
                nerdDynamicXpaths.publishedCollaboration(submissionName));
        nerdDynamicXpaths.returnButton(submissionName).click();
        CommonUtils.waitForVisibility(nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNpopUpWindowTextField);
        nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNpopUpWindowTextField.click();
        nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNpopUpWindowTextField
                .sendKeys("Returning to Doc - Automated Test");
        CommonUtils.waitForVisibility(nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNpopUpWindowYESbutton);
        nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNpopUpWindowYESbutton.click();
        CommonUtils.waitForVisibility(nerdCrsKnowledgeDatabaseSubmissionsPage.submissionSuccessfullyPopUpOkButton);
        nerdCrsKnowledgeDatabaseSubmissionsPage.submissionSuccessfullyPopUpOkButton.click();
        CucumberLogUtils.logScreenShot();
        MiscUtils.sleep(2000);
    }

    /**
     * This method will bring CRS Reviewer to a Submissions Page
     *
     * @param submissionType
     */
    public static void crsReviewerIsOnSubmissionsPage(String submissionType) throws TestingException {
        nativeViewImpersonateUser.impersonateToCRSReviewer();
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));
        CommonUtils.waitForVisibility(
                nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemHomePageDropDownMenu);
        nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemHomePageDropDownMenu.click();
        CommonUtils.selectValueFromBootStrapDropDown(
                nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemHomePageDropDownMenuValues,
                submissionType);
        CucumberLogUtils.logScreenShot();
        CommonUtils.waitForVisibility(nerdCrsKnowledgeDatabaseSubmissionsPage.submissionsOrderByDropDown);
        nerdCrsKnowledgeDatabaseSubmissionsPage.submissionsOrderByDropDown.click();
    }

}
