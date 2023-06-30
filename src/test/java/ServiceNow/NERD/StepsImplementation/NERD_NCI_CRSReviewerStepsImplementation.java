package ServiceNow.NERD.StepsImplementation;

import ServiceNow.NERD.Steps.HooksSteps;
import appsCommon.PageInitializer;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.JavascriptUtils;
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
                MiscUtils.sleep(5000);
                CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
                JavascriptUtils.clickByJS(nerdCrsKnowledgeDatabaseSubmissionsPage.confirmPopUpWindowYESbuttonCRS);
                MiscUtils.sleep(1000);
                CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
                JavascriptUtils.clickByJS(nerdCrsKnowledgeDatabaseSubmissionsPage.submissionSuccessfullyPopUpOkButton);
        }

        /**
         * This method will return existing submission by CRS Reviewer to DOC Planing
         * Contact
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
                MiscUtils.sleep(2000);
//                CommonUtils.waitForVisibility(nerdCrsKnowledgeDatabaseSubmissionsPage.submissionsOrderByDropDown);
                JavascriptUtils.clickByJS( nerdCrsKnowledgeDatabaseSubmissionsPage.submissionsOrderByDropDown);
                CommonUtils.waitForVisibility(
                                nerdDynamicXpaths.publishedCollaboration(submissionName));
                nerdDynamicXpaths.returnButton(submissionName).click();
                CommonUtils.waitForVisibility(
                                nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNpopUpWindowTextField);
                nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNpopUpWindowTextField.click();
                nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNpopUpWindowTextField
                                .sendKeys("Returning to Doc - Automated Test");
                CommonUtils.waitForVisibility(
                                nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNpopUpWindowYESbutton);
                nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNpopUpWindowYESbutton.click();
                CommonUtils.waitForVisibility(
                                nerdCrsKnowledgeDatabaseSubmissionsPage.submissionSuccessfullyPopUpOkButton);
                nerdCrsKnowledgeDatabaseSubmissionsPage.submissionSuccessfullyPopUpOkButton.click();
                CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
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
                WebDriverUtils.webDriver.findElement(By.xpath("//*[contains(text(),'Submissions')]")).click();
                CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
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
                CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
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
                MiscUtils.sleep(2000);
                nerdDynamicXpaths.deleteButton(collaborationName).click();
                CommonUtils.waitForVisibility(
                                nerdCRSTCollaborationsPage.yesPopUpButton);
                nerdCRSTCollaborationsPage.yesPopUpButton.click();
                CommonUtils.waitForVisibility(
                                nerdCrsKnowledgeDatabaseSubmissionsPage.submissionSuccessfullyPopUpOkButton);
                nerdCrsKnowledgeDatabaseSubmissionsPage.submissionSuccessfullyPopUpOkButton.click();
        }

        /**
         * This method verifies rank field is not visible AND deletes submission
         * @param collaborationName
         */
        public static void verifyingRankFieldIsNotDisplayedAndDeletingSubmission(String collaborationName){
                crsReviersDoesNotSeeRankFieldOnCollaborationSubmissions();
                crsReviewerDeletingSubmissionAfterClickingCancelButton(collaborationName);
        }

}
