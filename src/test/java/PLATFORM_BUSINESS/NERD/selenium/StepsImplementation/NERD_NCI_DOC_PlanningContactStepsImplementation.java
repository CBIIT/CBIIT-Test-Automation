package PLATFORM_BUSINESS.NERD.selenium.StepsImplementation;

import PLATFORM_BUSINESS.NERD.selenium.Constants.ReturningSubmissions_Constants;
import APPS_COMMON.PageInitializers.PageInitializer;
import APPS_COMMON.Utils.ServiceNow_Common_Methods;
import APPS_COMMON.Utils.ServiceNow_Login_Methods;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.Set;
import static com.nci.automation.web.TestProperties.getNerdUrl;

public class NERD_NCI_DOC_PlanningContactStepsImplementation extends PageInitializer {

        /**
         * Submits a submission to the CRS reviewer.
         *
         * @param docPlanningContact The DOC (Department of Commerce) planning contact who will submit the submission.
         * @param submissionName The name of the submission to be submitted.
         */
        public static void submittingOfSubmissionToCRSReviewer(String docPlanningContact, String submissionName) {
                ServiceNow_Common_Methods.logOutOfNativeView();
                ServiceNow_Login_Methods.nativeViewSideDoorLogin();
                ServiceNow_Common_Methods.impersonateAnyUser(docPlanningContact);
                WebDriverUtils.webDriver.get(getNerdUrl());
                CommonUtils.waitForVisibility(nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink);
                nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink.click();
                JavascriptUtils.scrollIntoView(nerdDynamicXpaths.submitToCRSButton(submissionName));
                CucumberLogUtils.logScreenshot();
                CommonUtils.assertTrue(nerdDynamicXpaths.submitToCRSButton(submissionName).getText().equals("Submit to CRS"));
                CucumberLogUtils.logScreenshot();
                CommonUtils.sleep(2000);
                nerdDynamicXpaths.submitToCRSButton(submissionName).click();
                CommonUtils.waitForVisibility(nerdCrsKnowledgeDatabaseSubmissionsPage.confirmPopUpWindowYESbutton);
                nerdCrsKnowledgeDatabaseSubmissionsPage.confirmPopUpWindowYESbutton.click();
                CommonUtils.waitForVisibility(nerdCrsKnowledgeDatabaseSubmissionsPage.submissionSuccessfullyPopUpOkButton);
                nerdCrsKnowledgeDatabaseSubmissionsPage.submissionSuccessfullyPopUpOkButton.click();
        }

        /**
         * Resubmits a submission by a DOC Planning Contact to a CRS Reviewer.
         *
         * @param docPlanningContact The DOC Planning Contact who will resubmit the submission.
         * @param submissionName     The name of the submission to be resubmitted.
         */
        public static void resubmittingOfSubmissionByDOCContactToCRSReviewer(String docPlanningContact, String submissionName) {
                ServiceNow_Common_Methods.logOutOfNativeView();
                ServiceNow_Login_Methods.nativeViewSideDoorLogin();
                ServiceNow_Common_Methods.impersonateAnyUser(docPlanningContact);
                WebDriverUtils.webDriver.get(getNerdUrl());
                CommonUtils.waitForVisibility(
                                nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink);
                nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink
                                .click();
                JavascriptUtils.scrollIntoView(
                                nerdDynamicXpaths.editButton(submissionName));
                CommonUtils.sleep(2000);
                nerdDynamicXpaths.editButton(submissionName).click();
                CommonUtils.sleep(2000);
                Set<String> allWindowHandles1 = WebDriverUtils.webDriver.getWindowHandles();
                for (String currentWindow1 : allWindowHandles1) {
                        WebDriverUtils.webDriver.switchTo().window(currentWindow1);
                }
                CommonUtils.sleep(1000);
                CommonUtils.waitForVisibility(createNewSubmissionPage.pleaseSpecifyDropDown);
                CommonUtils.selectDropDownValue("Edited", createNewSubmissionPage.pleaseSpecifyDropDown);
                CommonUtils.selectDropDownValue("2022", createNewSubmissionPage.fiscalYearDropDown);
                CommonUtils.sleep(1000);
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
                CommonUtils.sleep(1000);
                nerdDynamicXpaths.submitToCRSButton(submissionName).click();
                CommonUtils.waitForVisibility(nerdCrsKnowledgeDatabaseSubmissionsPage.confirmPopUpWindowYESbutton);
                JavascriptUtils.scrollIntoView(nerdCrsKnowledgeDatabaseSubmissionsPage.confirmPopUpWindowYESbutton);
                nerdCrsKnowledgeDatabaseSubmissionsPage.confirmPopUpWindowYESbutton.click();
                CommonUtils.waitForVisibility(
                                nerdCrsKnowledgeDatabaseSubmissionsPage.submissionSuccessfullyPopUpOkButton);
                nerdCrsKnowledgeDatabaseSubmissionsPage.submissionSuccessfullyPopUpOkButton.click();
                CommonUtils.sleep(1000);
        }

        /**
         * This method will check if the collaboration shows as in the Submission page
         *
         */
        public static void theCollaborationShowsAsInTheSubmissionsPage(String ReturnedToDOC) {
                CommonUtils.sleep(1000);
                Assert.assertTrue(
                        nerdDynamicXpaths.returnedToDOCText(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_NAME_CRS_REVIEWER).getText().contentEquals(ReturnedToDOC));
                JavascriptUtils.drawBlueBorder(nerdDynamicXpaths.returnedToDOCText(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_NAME_CRS_REVIEWER));
                CommonUtils.sleep(2000);
                ServiceNow_Common_Methods.logOutOfNativeView();
        }

        /**
         * Fills out the required fields of a submission by DOC Planning Contact.
         *
         * @param docPlanningContact The DOC Planning Contact who will fill out the submission.
         * @param submissionName     The name of the submission to be filled out.
         * @param PleaseSpecify      The value for the "Please Specify" field.
         * @param FiscalYear         The value for the "Fiscal Year" field.
         */
        public static void fillingOutRequiredFieldsByDOCPlaningContact(String docPlanningContact,String submissionName, String PleaseSpecify,
                                                                       String FiscalYear) {
                ServiceNow_Common_Methods.logOutOfNativeView();
                ServiceNow_Login_Methods.nativeViewSideDoorLogin();
                ServiceNow_Common_Methods.impersonateAnyUser(docPlanningContact);
                WebDriverUtils.webDriver.get(getNerdUrl());
                CommonUtils.sleep(7000);
                CommonUtils.waitForVisibility(
                        nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink);
                nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink
                        .click();
                nerdDynamicXpaths.editButton(submissionName).click();
                CommonUtils.sleep(2000);
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
                CommonUtils.sleep(2000);
                CucumberLogUtils.logScreenshot();
                nerdCrsKnowledgeDatabaseSubmissionsPage.SaveButton.click();
                nerdCrsKnowledgeDatabaseSubmissionsPage.popUpOKbutton.click();
                CommonUtils.sleep(3000);
        }


        /**
         * This method will verify required fields of Submission
         *
         * @param submissionName
         * @param PleaseSpecify
         * @param FiscalYear
         */
        public static void verifyingByDOCContactThatFieldsOfSubmissionAreClearedAndRequired(String docPlanningContact, String submissionName,
                        String PleaseSpecify, String FiscalYear) {
                ServiceNow_Common_Methods.logOutOfNativeView();
                ServiceNow_Login_Methods.nativeViewSideDoorLogin();
                ServiceNow_Common_Methods.impersonateAnyUser(docPlanningContact);
                WebDriverUtils.webDriver.get(getNerdUrl());
                WebDriverUtils.webDriver.navigate().refresh();
                CommonUtils.sleep(7000);
                CommonUtils.waitForVisibility(nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink);
                JavascriptUtils.clickByJS(nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink);
                CommonUtils.sleep(1000);
                CucumberLogUtils.logScreenshot();
                nerdDynamicXpaths.submitToCRSButton(submissionName).click();
                JavascriptUtils.clickByJS(nerdCrsKnowledgeDatabaseSubmissionsPage.confirmSubmissionYesButton);
                CommonUtils.sleep(1000);
                Assert.assertTrue(
                                nerdCrsKnowledgeDatabaseSubmissionsPage.requiredFieldsNeedToBeFilledInBeforeSubmissionText
                                                .getText()
                                                .contentEquals("Required fields need to be filled in before submission."));
                CommonUtils.sleep(1000);
                JavascriptUtils.clickByJS(nerdCrsKnowledgeDatabaseSubmissionsPage.popUpOKbutton);
                CommonUtils.sleep(1000);
                nerdDynamicXpaths.editButton(submissionName).click();
                CommonUtils.sleep(2000);
                Set<String> allWindowHandles1 = WebDriverUtils.webDriver.getWindowHandles();
                for (String currentWindow1 : allWindowHandles1) {
                        WebDriverUtils.webDriver.switchTo().window(currentWindow1);
                }
                CommonUtils.waitForVisibility(createNewSubmissionPage.pleaseSpecifyText);
                Assert.assertTrue(createNewSubmissionPage.pleaseSpecifyText.getText().contentEquals(PleaseSpecify));
                JavascriptUtils.drawBlueBorder(createNewSubmissionPage.pleaseSpecifyDropDown);
                if (!createNewSubmissionPage.pleaseSpecifyDropDown.isSelected()) {
                        CommonUtils.selectDropDownValue("Edited", createNewSubmissionPage.pleaseSpecifyDropDown);
                        CommonUtils.sleep(1000);
                }
                Assert.assertTrue(createNewSubmissionPage.fiscalYearText.getText().contentEquals(FiscalYear));
                JavascriptUtils.drawBlueBorder(createNewSubmissionPage.fiscalYearDropDown);
                if (!createNewSubmissionPage.fiscalYearDropDown.isSelected()) {
                        CommonUtils.selectDropDownValue("2024", createNewSubmissionPage.fiscalYearDropDown);
                        CommonUtils.sleep(1000);
                }
                CucumberLogUtils.logScreenshot();
                createNewSubmissionPage.cancelButton.click();
        }

        /**
         * This method edits a submission and returns it to the program staff.
         *
         * @param docPlanningContact The DOC Planning Contact who will edit and return the submission.
         * @param submissionName     The name of the submission to be edited and returned.
         */
        public static void editingAndReturningSubmissionToProgramStaff(String docPlanningContact, String submissionName) {
                ServiceNow_Common_Methods.logOutOfNativeView();
                ServiceNow_Login_Methods.nativeViewSideDoorLogin();
                ServiceNow_Common_Methods.impersonateAnyUser(docPlanningContact);
                WebDriverUtils.webDriver.get(getNerdUrl());
                WebDriverUtils.webDriver.navigate().refresh();
                CommonUtils.sleep(5000);
                CommonUtils.waitForVisibility(nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink);
                JavascriptUtils.clickByJS(nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink);
                CommonUtils.sleep(3000);
                nerdDynamicXpaths.editButton(submissionName).click();
                CommonUtils.sleep(2000);
                CommonUtils.switchToAnotherWindow();
                CommonUtils.waitForVisibility(createNewSubmissionPage.pleaseSpecifyDropDown);
                CommonUtils.selectDropDownValue("Edited", createNewSubmissionPage.pleaseSpecifyDropDown);
                CommonUtils.sleep(1000);
                CommonUtils.selectDropDownValue("2024", createNewSubmissionPage.fiscalYearDropDown);
                nerdCrsKnowledgeDatabaseSubmissionsPage.SaveButton.click();
                CommonUtils.sleep(1000);
                nerdCrsKnowledgeDatabaseSubmissionsPage.popUpOKbutton.click();
                CommonUtils.sleep(3000);
                nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink
                                .click();
                CommonUtils.sleep(1000);
                JavascriptUtils.scrollIntoView(nerdDynamicXpaths.returnButtonToStaff(submissionName));
                nerdDynamicXpaths.returnButtonToStaff(submissionName).click();
                CommonUtils.sleep(1000);
                nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNtoStaffPopUpWindowTextField
                                .sendKeys(ReturningSubmissions_Constants.RETURN_TO_PROGRAM_STUFF_MESSAGE);
                nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNtoStaffPopUpWindowYesButton.click();
                CommonUtils.sleep(1000);
                nerdCrsKnowledgeDatabaseSubmissionsPage.popUpOKbutton.click();
                CommonUtils.sleep(1000);
                JavascriptUtils.drawBlueBorder(nerdDynamicXpaths.returnedToStaffMemberText(submissionName));
                CommonUtils.sleep(1000);
                CucumberLogUtils.logScreenshot();
        }

        /**
         * Returns a submission to the program staff by the DOC contact.
         *
         * @param docPlanningContact The DOC Planning Contact who will return the submission.
         * @param submissionName The name of the submission to be returned.
         */
        public static void returningSubmissionToProgramStaffByDOCContact(String docPlanningContact, String submissionName) {
                ServiceNow_Common_Methods.logOutOfNativeView();
                ServiceNow_Login_Methods.nativeViewSideDoorLogin();
                ServiceNow_Common_Methods.impersonateAnyUser(docPlanningContact);
                WebDriverUtils.webDriver.get(getNerdUrl());
                WebDriverUtils.webDriver.navigate().refresh();
                CommonUtils.sleep(7000);
                CommonUtils.waitForVisibility(
                                nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink);
                JavascriptUtils.clickByJS(nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink);

                JavascriptUtils.scrollIntoView(nerdDynamicXpaths.returnButtonToStaff(submissionName));
                CommonUtils.sleep(1000);
                nerdDynamicXpaths.returnButtonToStaff(submissionName).click();
                CommonUtils.sleep(1000);
                CommonUtils.waitForVisibility(
                                nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNtoStaffPopUpWindowTextField);
                nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNtoStaffPopUpWindowTextField
                                .sendKeys(ReturningSubmissions_Constants.RETURN_TO_PROGRAM_STUFF_MESSAGE);
                nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNtoStaffPopUpWindowYesButton.click();
                nerdCrsKnowledgeDatabaseSubmissionsPage.popUpOKbutton.click();
                CommonUtils.sleep(1000);
                CucumberLogUtils.logScreenshot();
        }

        /**
         * Creates a collaboration submission by a DOC Planning Contact.
         *
         * @param docPlanningContact The DOC Planning Contact who will create the submission.
         * @param SubmissionType     The WebElement representing the submission type.
         * @param submissionName     The name of the submission to be created.
         */
        public static void creatingOfCollaborationSubmissionByDOCPlaningContact(String docPlanningContact, WebElement SubmissionType, String submissionName) {
                ServiceNow_Common_Methods.impersonateAnyUser(docPlanningContact);
                WebDriverUtils.webDriver.get(getNerdUrl());
                CommonUtils.sleep(1000);
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
                CommonUtils.sleep(2000);
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
                CommonUtils.sleep(2000);
                createNewSubmissionPage.informationDialogPopUpOKbutton.click();
                CommonUtils.sleep(30000);
                JavascriptUtils.refreshBrowserByJS(WebDriverUtils.webDriver);
                JavascriptUtils.scrollIntoView(nerdDynamicXpaths.returnButtonToStaff(submissionName));
                CommonUtils.sleep(2000);
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