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
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.Set;

public class NERD_NCI_DOC_PlanningContactStepsImplementation extends PageInitializer {

        /**
         * This method will bring DOC Planing Contact to a Submissions Page
         *
         * @param submissionType
         */
        public static void docPlaningContactIsOnSubmissionsPage(String submissionType) {
                nativeViewImpersonateUser.impersonateToDocPlanningContact();
                WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));
                CommonUtils.waitForVisibility(
                                nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemHomePageDropDownMenu);
                nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemHomePageDropDownMenu.click();
                CommonUtils.selectValueFromBootStrapDropDown(
                                nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemHomePageDropDownMenuValues,
                                submissionType);
                MiscUtils.sleep(1000);
                nerdCrsKnowledgeDatabaseSubmissionsPage.collaborationsList.click();
        }

        /**
         * This method will return existing submission to CRS Reviewer
         *
         * @param submissionName
         */
        public static void submittingOfSubmissionToCRSReviewer(String submissionName) {
                ServiceNow_Common_Methods.logOutOfNativeView();
                ServiceNow_Login_Methods.nativeViewSideDoorLogin();
                ServiceNow_Common_Methods.impersonateAnyUser(CRSReviewers_Constants.DOC_PLANNING_CONTACT_NAME);
                WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));
                CommonUtils.waitForVisibility(
                                nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink);
                nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink
                                .click();
                JavascriptUtils.scrollIntoView(
                                nerdDynamicXpaths.submitToCRSButton(submissionName));
                CucumberLogUtils.logScreenshot();
                CommonUtils.assertTrue(
                                nerdDynamicXpaths.submitToCRSButton(submissionName)
                                                .getText().equals("Submit to CRS"));
                CucumberLogUtils.logScreenshot();
                MiscUtils.sleep(2000);
                nerdDynamicXpaths.submitToCRSButton(submissionName).click();
                CommonUtils.waitForVisibility(
                                nerdCrsKnowledgeDatabaseSubmissionsPage.confirmPopUpWindowYESbutton);
                nerdCrsKnowledgeDatabaseSubmissionsPage.confirmPopUpWindowYESbutton.click();
                CommonUtils.waitForVisibility(
                                nerdCrsKnowledgeDatabaseSubmissionsPage.submissionSuccessfullyPopUpOkButton);
                nerdCrsKnowledgeDatabaseSubmissionsPage.submissionSuccessfullyPopUpOkButton.click();
        }

        /**
         * This method will resubmit the existing Submission by DOC Planing Contact to
         * CRS Reviewer
         *
         * @param submissionName
         */
        public static void resubmittingOfSubmissionByDOCContactToCRSREviewer(String submissionName) {
                ServiceNow_Common_Methods.logOutOfNativeView();
                ServiceNow_Login_Methods.nativeViewSideDoorLogin();
                ServiceNow_Common_Methods.impersonateAnyUser(CRSReviewers_Constants.DOC_PLANNING_CONTACT_NAME);
                WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));
                CommonUtils.waitForVisibility(
                                nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink);
                nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink
                                .click();
                JavascriptUtils.scrollIntoView(
                                nerdDynamicXpaths.editButton(submissionName));
                MiscUtils.sleep(2000);
                nerdDynamicXpaths.editButton(submissionName).click();
                MiscUtils.sleep(2000);
                Set<String> allWindowHandles1 = WebDriverUtils.webDriver.getWindowHandles();
                for (String currentWindow1 : allWindowHandles1) {
                        WebDriverUtils.webDriver.switchTo().window(currentWindow1);
                }
                MiscUtils.sleep(1000);
                CommonUtils.waitForVisibility(createNewSubmissionPage.pleaseSpecifyDropDown);
                CommonUtils.selectDropDownValue("Edited", createNewSubmissionPage.pleaseSpecifyDropDown);
                CommonUtils.selectDropDownValue("2022", createNewSubmissionPage.fiscalYearDropDown);
                MiscUtils.sleep(1000);
                JavascriptUtils.scrollIntoView(createNewSubmissionPage.editedDOCSubmissionSaveButton);
                createNewSubmissionPage.editedDOCSubmissionSaveButton.click();
                CommonUtils.waitForVisibility(
                                nerdCrsKnowledgeDatabaseSubmissionsPage.submissionSuccessfullyPopUpOkButton);
                nerdCrsKnowledgeDatabaseSubmissionsPage.submissionSuccessfullyPopUpOkButton.click();
                CommonUtils.waitForVisibility(
                                nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink);
                nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink
                                .click();
                JavascriptUtils.scrollIntoView(
                                nerdDynamicXpaths.submitToCRSButton(submissionName));
                Assert.assertTrue(
                                nerdDynamicXpaths.submitToCRSButton(submissionName)
                                                .getText().equals("Submit to CRS"));
                CucumberLogUtils.logScreenshot();
                MiscUtils.sleep(1000);
                nerdDynamicXpaths.submitToCRSButton(submissionName).click();
                CommonUtils.waitForVisibility(nerdCrsKnowledgeDatabaseSubmissionsPage.confirmPopUpWindowYESbutton);
                JavascriptUtils.scrollIntoView(nerdCrsKnowledgeDatabaseSubmissionsPage.confirmPopUpWindowYESbutton);
                nerdCrsKnowledgeDatabaseSubmissionsPage.confirmPopUpWindowYESbutton.click();
                CommonUtils.waitForVisibility(
                                nerdCrsKnowledgeDatabaseSubmissionsPage.submissionSuccessfullyPopUpOkButton);
                nerdCrsKnowledgeDatabaseSubmissionsPage.submissionSuccessfullyPopUpOkButton.click();
                MiscUtils.sleep(1000);
        }

        /**
         * This method will check if the collaboration shows as in the Submission page
         *
         */
        public static void theCollaborationShowsAsInTheSubmissionsPage(String ReturnedToDOC) {
                MiscUtils.sleep(1000);
                Assert.assertTrue(
                        nerdDynamicXpaths.returnedToDOCText(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_NAME_CRS_REVIEWER).getText().contentEquals(ReturnedToDOC));
                JavascriptUtils.drawBlueBorder(nerdDynamicXpaths.returnedToDOCText(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_NAME_CRS_REVIEWER));
                MiscUtils.sleep(2000);
                ServiceNow_Common_Methods.logOutOfNativeView();
        }

        /**
         * This method will delete created by Staff Member Submission
         *
         * @param submissionName
         */
        public static void deleteCreatedSubmissionByDocPlanningContact(String submissionName)  {
                ServiceNow_Common_Methods.logOutOfNativeView();
                ServiceNow_Login_Methods.nativeViewSideDoorLogin();
                ServiceNow_Common_Methods.impersonateAnyUser(CRSReviewers_Constants.DOC_PLANNING_CONTACT_NAME);
                WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));
                WebDriverUtils.webDriver.navigate().refresh();
                MiscUtils.sleep(6000);
                CommonUtils.waitForVisibility(nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink);
                nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink.click();
                MiscUtils.sleep(2000);
                JavascriptUtils.scrollIntoView(nerdDynamicXpaths.deleteButton(submissionName));
                MiscUtils.sleep(1000);
                nerdDynamicXpaths.deleteButton(submissionName).click();
                MiscUtils.sleep(1000);
                CucumberLogUtils.logScreenshot();
                JavascriptUtils.clickByJS(nerdCrsKnowledgeDatabaseSubmissionsPage.confirmDeleteYesButton);
                MiscUtils.sleep(1000);
                CucumberLogUtils.logScreenshot();
                nerdCrsKnowledgeDatabaseSubmissionsPage.popUpOKbutton.click();
                MiscUtils.sleep(1000);
                CucumberLogUtils.logScreenshot();
        }

        /**
         * This method will fill out required fields of Submission
         *
         * @param submissionName
         * @param PleaseSpecify
         * @param FiscalYear
         */
        public static void fillingOutRequiredFieldsByDOCPlaningContact(String submissionName, String PleaseSpecify,
                        String FiscalYear) {
                ServiceNow_Common_Methods.logOutOfNativeView();
                ServiceNow_Login_Methods.nativeViewSideDoorLogin();
                ServiceNow_Common_Methods.impersonateAnyUser(CRSReviewers_Constants.DOC_PLANNING_CONTACT_NAME);
                WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));
                MiscUtils.sleep(7000);
                CommonUtils.waitForVisibility(
                                nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink);
                nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink
                                .click();
                nerdDynamicXpaths.editButton(submissionName).click();
                MiscUtils.sleep(2000);
                Set<String> allWindowHandles1 = WebDriverUtils.webDriver.getWindowHandles();
                for (String currentWindow1 : allWindowHandles1) {
                        WebDriverUtils.webDriver.switchTo().window(currentWindow1);
                }
                CommonUtils.waitForVisibility(createNewSubmissionPage.pleaseSpecifyText);
                Assert.assertTrue(createNewSubmissionPage.pleaseSpecifyText.getText().contentEquals(PleaseSpecify));
                if (!createNewSubmissionPage.pleaseSpecifyDropDown.isSelected()) {
                        CommonUtils.selectDropDownValue("Edited", createNewSubmissionPage.pleaseSpecifyDropDown);
                }
                Assert.assertTrue(createNewSubmissionPage.fiscalYearText.getText().contentEquals(FiscalYear));
                if (!createNewSubmissionPage.fiscalYearDropDown.isSelected()) {
                        CommonUtils.selectDropDownValue("2024", createNewSubmissionPage.fiscalYearDropDown);
                }
                MiscUtils.sleep(2000);
                CucumberLogUtils.logScreenshot();
                nerdCrsKnowledgeDatabaseSubmissionsPage.SaveButton.click();
                nerdCrsKnowledgeDatabaseSubmissionsPage.popUpOKbutton.click();
                MiscUtils.sleep(3000);
        }

        /**
         * This method will verify required fields of Submission
         *
         * @param submissionName
         * @param PleaseSpecify
         * @param FiscalYear
         */
        public static void verifyingByDOCContactThatFieldsOfSubmissionAreClearedAndRequired(String submissionName,
                        String PleaseSpecify, String FiscalYear) {
                ServiceNow_Common_Methods.logOutOfNativeView();
                ServiceNow_Login_Methods.nativeViewSideDoorLogin();
                ServiceNow_Common_Methods.impersonateAnyUser(CRSReviewers_Constants.DOC_PLANNING_CONTACT_NAME);
                WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));
                WebDriverUtils.webDriver.navigate().refresh();
                MiscUtils.sleep(7000);
                CommonUtils.waitForVisibility(nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink);
                JavascriptUtils.clickByJS(nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink);
                MiscUtils.sleep(1000);
                CucumberLogUtils.logScreenshot();
                nerdDynamicXpaths.submitToCRSButton(submissionName).click();
                JavascriptUtils.clickByJS(nerdCrsKnowledgeDatabaseSubmissionsPage.confirmSubmissionYesButton);
                MiscUtils.sleep(1000);
                Assert.assertTrue(
                                nerdCrsKnowledgeDatabaseSubmissionsPage.requiredFieldsNeedToBeFilledInBeforeSubmissionText
                                                .getText()
                                                .contentEquals("Required fields need to be filled in before submission."));
                MiscUtils.sleep(1000);
                JavascriptUtils.clickByJS(nerdCrsKnowledgeDatabaseSubmissionsPage.popUpOKbutton);
                MiscUtils.sleep(1000);
                nerdDynamicXpaths.editButton(submissionName).click();
                MiscUtils.sleep(2000);
                Set<String> allWindowHandles1 = WebDriverUtils.webDriver.getWindowHandles();
                for (String currentWindow1 : allWindowHandles1) {
                        WebDriverUtils.webDriver.switchTo().window(currentWindow1);
                }
                CommonUtils.waitForVisibility(createNewSubmissionPage.pleaseSpecifyText);
                Assert.assertTrue(createNewSubmissionPage.pleaseSpecifyText.getText().contentEquals(PleaseSpecify));
                JavascriptUtils.drawBlueBorder(createNewSubmissionPage.pleaseSpecifyDropDown);
                if (!createNewSubmissionPage.pleaseSpecifyDropDown.isSelected()) {
                        CommonUtils.selectDropDownValue("Edited", createNewSubmissionPage.pleaseSpecifyDropDown);
                        MiscUtils.sleep(1000);
                }
                Assert.assertTrue(createNewSubmissionPage.fiscalYearText.getText().contentEquals(FiscalYear));
                JavascriptUtils.drawBlueBorder(createNewSubmissionPage.fiscalYearDropDown);
                if (!createNewSubmissionPage.fiscalYearDropDown.isSelected()) {
                        CommonUtils.selectDropDownValue("2024", createNewSubmissionPage.fiscalYearDropDown);
                        MiscUtils.sleep(1000);
                }
                CucumberLogUtils.logScreenshot();
                createNewSubmissionPage.cancelButton.click();
        }

        /**
         * This method will edit and return Submission to Program Staff Member
         *
         * @param submissionName
         */
        public static void editingAndReturningSubmissionToProgramStaff(String submissionName) {
                ServiceNow_Common_Methods.logOutOfNativeView();
                ServiceNow_Login_Methods.nativeViewSideDoorLogin();
                ServiceNow_Common_Methods.impersonateAnyUser(CRSReviewers_Constants.DOC_PLANNING_CONTACT_NAME);
                WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));
                WebDriverUtils.webDriver.navigate().refresh();
                MiscUtils.sleep(5000);
                CommonUtils.waitForVisibility(nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink);
                JavascriptUtils.clickByJS(nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink);
                MiscUtils.sleep(3000);
                nerdDynamicXpaths.editButton(submissionName).click();
                MiscUtils.sleep(2000);
                CommonUtils.switchToAnotherWindow();
                CommonUtils.waitForVisibility(createNewSubmissionPage.pleaseSpecifyDropDown);
                CommonUtils.selectDropDownValue("Edited", createNewSubmissionPage.pleaseSpecifyDropDown);
                MiscUtils.sleep(1000);
                CommonUtils.selectDropDownValue("2024", createNewSubmissionPage.fiscalYearDropDown);
                nerdCrsKnowledgeDatabaseSubmissionsPage.SaveButton.click();
                MiscUtils.sleep(1000);
                nerdCrsKnowledgeDatabaseSubmissionsPage.popUpOKbutton.click();
                MiscUtils.sleep(3000);
                nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink
                                .click();
                MiscUtils.sleep(1000);
                JavascriptUtils.scrollIntoView(nerdDynamicXpaths.returnButtonToStaff(submissionName));
                nerdDynamicXpaths.returnButtonToStaff(submissionName).click();
                MiscUtils.sleep(1000);
                nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNtoStaffPopUpWindowTextField
                                .sendKeys(ReturningSubmissions_Constants.RETURN_TO_PROGRAM_STUFF_MESSAGE);
                nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNtoStaffPopUpWindowYesButton.click();
                MiscUtils.sleep(1000);
                nerdCrsKnowledgeDatabaseSubmissionsPage.popUpOKbutton.click();
                MiscUtils.sleep(1000);
                JavascriptUtils.drawBlueBorder(nerdDynamicXpaths.returnedToStaffMemberText(submissionName));
                MiscUtils.sleep(1000);
                CucumberLogUtils.logScreenshot();
        }

        /**
         * This method will return Submission to Program Staff Member
         *
         * @param submissionName
         */
        public static void returningSubmissionToProgramStaffByDOCContact(String submissionName) {
                ServiceNow_Common_Methods.logOutOfNativeView();
                ServiceNow_Login_Methods.nativeViewSideDoorLogin();
                ServiceNow_Common_Methods.impersonateAnyUser(CRSReviewers_Constants.DOC_PLANNING_CONTACT_NAME);
                WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));
                WebDriverUtils.webDriver.navigate().refresh();
                MiscUtils.sleep(7000);
                CommonUtils.waitForVisibility(
                                nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink);
                JavascriptUtils.clickByJS(nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink);

                JavascriptUtils.scrollIntoView(nerdDynamicXpaths.returnButtonToStaff(submissionName));
                MiscUtils.sleep(1000);
                nerdDynamicXpaths.returnButtonToStaff(submissionName).click();
                MiscUtils.sleep(1000);
                CommonUtils.waitForVisibility(
                                nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNtoStaffPopUpWindowTextField);
                nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNtoStaffPopUpWindowTextField
                                .sendKeys(ReturningSubmissions_Constants.RETURN_TO_PROGRAM_STUFF_MESSAGE);
                nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNtoStaffPopUpWindowYesButton.click();
                nerdCrsKnowledgeDatabaseSubmissionsPage.popUpOKbutton.click();
                MiscUtils.sleep(1000);
        }

        /**
         * This method will create new Collaboration Submission by DOC Planing Contact
         *
         * @param submissionName
         */
        public static void creatingOfCollaborationSubmissionByDOCPlaningContact(WebElement SubmissionType, String submissionName) {
                ServiceNow_Common_Methods.impersonateAnyUser(CRSReviewers_Constants.DOC_PLANNING_CONTACT_NAME);
                WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));
                MiscUtils.sleep(1000);
                CommonUtils.waitForClickability(SubmissionType);
                SubmissionType.click();
                Set<String> allWindowHandles1 = WebDriverUtils.webDriver.getWindowHandles();
                for (String currentWindow1 : allWindowHandles1) {
                        WebDriverUtils.webDriver.switchTo().window(currentWindow1);
                }
                CommonUtils.waitForVisibility(createNewSubmissionPage.titleTextBox);
                createNewSubmissionPage.titleTextBox.sendKeys(submissionName);
                CommonUtils.selectDropDownValue("New", createNewSubmissionPage.pleaseSpecifyDropDown);
                createNewSubmissionPage.acronymTextBox.sendKeys("Testing");
                CommonUtils.selectDropDownValue("2021", createNewSubmissionPage.fiscalYearDropDown);
                MiscUtils.sleep(2000);
                CommonUtils.switchToFrame(createNewSubmissionPage.DescriptionTextBoxIframe);
                createNewSubmissionPage.DescriptionTextBox.sendKeys("Testing the Description");
                WebDriverUtils.webDriver.switchTo().defaultContent();
                JavascriptUtils.scrollIntoView(createNewSubmissionPage.fyTheCollaborativeActivityOriginatedDropDown);
                CommonUtils.selectDropDownValue("2021",
                                createNewSubmissionPage.fyTheCollaborativeActivityOriginatedDropDown);
                CommonUtils.selectDropDownValue("CBIIT", createNewSubmissionPage.leadDOCDropDown);
                createNewSubmissionPage.otherDOCsCBIITCheckBox.click();
                createNewSubmissionPage.pocTextBox.sendKeys("Testing");
                createNewSubmissionPage.ReferencesTextBox.sendKeys("Test");
                CommonUtils.selectDropDownValue("CC", createNewSubmissionPage.nihICs_ODcollaboratorsDropDown);
                JavascriptUtils.scrollIntoView(createNewSubmissionPage.hhsAgencyCollaboratorsDropDown);
                CommonUtils.selectDropDownValue("ACF", createNewSubmissionPage.hhsAgencyCollaboratorsDropDown);
                CommonUtils.selectDropDownValue("Commerce",
                                createNewSubmissionPage.otherFederalAgencyCollaboratorsDropDown);
                CommonUtils.selectDropDownValue("No Tribal/State/Local/Government Collaborators",
                                createNewSubmissionPage.tribalStateLocalGovernmentCollaboratorsDropDown);
                CommonUtils.selectDropDownValue("Health Canada",
                                createNewSubmissionPage.foreignGovernmentCollaboratorsDropDown);
                CommonUtils.selectDropDownValue("American Society for Microbiology (ASM)",
                                createNewSubmissionPage.nonGovernmentalCollaboratorsDropDown);
                createNewSubmissionPage.selectTypeOfCollaborativeActivityListResourceDevelopmentCheckBox.click();
                CommonUtils.selectDropDownValue("Yes",
                                createNewSubmissionPage.isThisCollaborationRelatedToRegulatoryActivityDropDown);
                CommonUtils.selectDropDownValue("Yes",
                                createNewSubmissionPage.wasNIHFundingProvidedForThisActivityDropDown);
                JavascriptUtils.scrollIntoView(
                                createNewSubmissionPage.productsOutputsListResearchToolDevelopmentCheckBox);
                createNewSubmissionPage.productsOutputsListResearchToolDevelopmentCheckBox.click();
                CommonUtils.selectDropDownValue("Objective 1: Advancing Biomedical and Behavioral Sciences",
                                createNewSubmissionPage.nihStrategicAlignment_Primary_DropDown);
                CommonUtils.selectDropDownValue(
                                "Strategic Goal 2: Protect the Health of Americans Where They Live, Learn, Work, and Pay",
                                createNewSubmissionPage.hhsStrategicPlanAlignment_Primary_DropDown);
                nerdCrsKnowledgeDatabaseSubmissionsPage.saveButtonNewSubmissionDOCplanning.click();
                MiscUtils.sleep(2000);
                createNewSubmissionPage.informationDialogPopUpOKbutton.click();
                MiscUtils.sleep(30000);
                JavascriptUtils.refreshBrowserByJS(WebDriverUtils.webDriver);
                JavascriptUtils.scrollIntoView(nerdDynamicXpaths.returnButtonToStaff(submissionName));
                MiscUtils.sleep(2000);
        }

        /**
         * Verifies that the rank field is not displayed on the collaboration form.
         */
        public static void verifyingRankFieldIsNotDisplayedOnCollaborationForm() {
                WebElement element = WebDriverUtils.webDriver
                                .findElement(By.xpath("//*[@id='crs-article']/div/div/div/div[1]/div[4]/div[1]/i"));
                Assert.assertTrue("VERIFYING RANK FIELD IS NOT DISPLAYED",
                                element.getDomAttribute("aria-hidden").contentEquals("true"));
                CucumberLogUtils.logScreenshot();
                ServiceNow_Common_Methods.logOutOfNativeView();
        }
}