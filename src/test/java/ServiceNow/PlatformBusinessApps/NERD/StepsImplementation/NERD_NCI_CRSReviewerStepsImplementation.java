package ServiceNow.PlatformBusinessApps.NERD.StepsImplementation;

import ServiceNow.PlatformBusinessApps.NERD.Constants.CRSReviewers_Constants;
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
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class NERD_NCI_CRSReviewerStepsImplementation extends PageInitializer {

        /**
         * This method will publish existing submission by CRS Reviewer
         *
         * @param submissionName
         */
        public static void publishingOfSubmissionByCRSReviewer(String submissionName) {
                ServiceNow_Common_Methods.logOutOfNativeView();
                ServiceNow_Login_Methods.nativeViewSideDoorLogin();
                ServiceNow_Common_Methods.impersonateAnyUser(CRSReviewers_Constants.CRS_REVIEWER);
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
                MiscUtils.sleep(5000);
                CucumberLogUtils.logScreenshot();
                JavascriptUtils.clickByJS(nerdCrsKnowledgeDatabaseSubmissionsPage.confirmPopUpWindowYESbuttonCRS);
                MiscUtils.sleep(1000);
                CucumberLogUtils.logScreenshot();
                JavascriptUtils.clickByJS(nerdCrsKnowledgeDatabaseSubmissionsPage.submissionSuccessfullyPopUpOkButton);
        }

        /**
         * This method will return existing submission by CRS Reviewer to DOC Planing
         * Contact
         *
         * @param submissionName
         */
        public static void returningOfSubmissionByCRSReviewer(String submissionName) {
                ServiceNow_Common_Methods.logOutOfNativeView();
                ServiceNow_Login_Methods.nativeViewSideDoorLogin();
                ServiceNow_Common_Methods.impersonateAnyUser(CRSReviewers_Constants.CRS_REVIEWER);
                WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));
                CommonUtils.waitForVisibility(
                                nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemHomePageDropDownMenu);
                nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemHomePageDropDownMenu.click();
                CommonUtils.selectValueFromBootStrapDropDown(
                                nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemHomePageDropDownMenuValues,
                                "Submissions");
                MiscUtils.sleep(2000);
                JavascriptUtils.clickByJS( nerdCrsKnowledgeDatabaseSubmissionsPage.submissionsOrderByDropDown);
                CommonUtils.waitForVisibility(nerdDynamicXpaths.publishedCollaboration(submissionName));
                nerdDynamicXpaths.returnButton(submissionName).click();
                CommonUtils.waitForVisibility(nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNpopUpWindowTextField);
                nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNpopUpWindowTextField.click();
                nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNpopUpWindowTextField
                                .sendKeys("Returning to Doc - Automated Test");
                CommonUtils.waitForVisibility(
                                nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNpopUpWindowYESbutton);
                nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNpopUpWindowYESbutton.click();
                CommonUtils.waitForVisibility(
                                nerdCrsKnowledgeDatabaseSubmissionsPage.submissionSuccessfullyPopUpOkButton);
                nerdCrsKnowledgeDatabaseSubmissionsPage.submissionSuccessfullyPopUpOkButton.click();
                CucumberLogUtils.logScreenshot();
                MiscUtils.sleep(2000);
        }

        /**
         * This method will bring CRS Reviewer to a Submissions Page
         *
         * @param submissionType
         */
        public static void crsReviewerIsOnSubmissionsPage(String submissionType) {
                ServiceNow_Common_Methods.logOutOfNativeView();
                ServiceNow_Login_Methods.nativeViewSideDoorLogin();
                ServiceNow_Common_Methods.impersonateAnyUser(CRSReviewers_Constants.CRS_REVIEWER);
                WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));
                CommonUtils.waitForVisibility(
                                nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemHomePageDropDownMenu);
                nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemHomePageDropDownMenu.click();
                WebDriverUtils.webDriver.findElement(By.xpath("//*[contains(text(),'Submissions')]")).click();
                CucumberLogUtils.logScreenshot();
                CommonUtils.waitForVisibility(nerdCrsKnowledgeDatabaseSubmissionsPage.submissionsOrderByDropDown);
                nerdCrsKnowledgeDatabaseSubmissionsPage.submissionsOrderByDropDown.click();
                MiscUtils.sleep(2000);
        }

        /**
         * This method verifies that the 'Rank' field is not displayed to CRS Reviewers
         * when opening a collaborations submission
         */
        public static void crsReviersDoesNotSeeRankFieldOnCollaborationSubmissions() {
                WebElement element = WebDriverUtils.webDriver
                                .findElement(By.xpath("//*[@id='crs-article']/div/div/div/div[1]/div[4]/div[1]/i"));
                Assert.assertTrue(element.getDomAttribute("aria-hidden").contentEquals("true"));
                CucumberLogUtils.logScreenshot();
        }

        /**
         * This method deletes a submission after clicking cancel button when viewing
         * the submission
         * Paramaterize the submission record name as a String argument
         * 
         * @param collaborationName
         */
        public static void crsReviewerDeletingSubmissionAfterClickingCancelButton(String collaborationName) {
                JavascriptUtils.scrollIntoView(nerdCRSTCollaborationsPage.cancelButton);
                nerdCRSTCollaborationsPage.cancelButton.click();
                CommonUtils.waitForVisibility(nerdCrsKnowledgeDatabaseSubmissionsPage.submissionsOrderByDropDown);
                nerdCrsKnowledgeDatabaseSubmissionsPage.submissionsOrderByDropDown.click();
                MiscUtils.sleep(3000);
                nerdDynamicXpaths.deleteButton(collaborationName).click();
                CucumberLogUtils.logScreenshot();
                CommonUtils.waitForVisibility(nerdCRSTCollaborationsPage.yesPopUpButton);
                nerdCRSTCollaborationsPage.yesPopUpButton.click();
                CommonUtils.waitForVisibility(
                                nerdCrsKnowledgeDatabaseSubmissionsPage.submissionSuccessfullyPopUpOkButton);
                nerdCrsKnowledgeDatabaseSubmissionsPage.submissionSuccessfullyPopUpOkButton.click();
                CucumberLogUtils.logScreenshot();
        }

        /**
         * This method verifies rank field is not visible AND deletes submission
         */
        public static void verifyingRankFieldIsNotDisplayedAndDeletingSubmission(){
                crsReviersDoesNotSeeRankFieldOnCollaborationSubmissions();
                crsReviewerDeletingSubmissionAfterClickingCancelButton(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION);
        }
}