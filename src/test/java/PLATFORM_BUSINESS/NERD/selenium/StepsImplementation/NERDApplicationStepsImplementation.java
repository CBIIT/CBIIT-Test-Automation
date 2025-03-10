package PLATFORM_BUSINESS.NERD.selenium.StepsImplementation;

import DEPRECATED.COVIDDash.Utils.COVIDConstants;
import PLATFORM_BUSINESS.NERD.selenium.Constants.NCI_Staff_Members_Constants;
import PLATFORM_BUSINESS.NERD.selenium.Constants.ReturningSubmissions_Constants;
import PLATFORM_BUSINESS.NERD.selenium.Constants.TopAccomplishmentsSubmission_Constants;
import PLATFORM_BUSINESS.NERD.selenium.Pages.NERDDynamicXPATHS;
import PLATFORM_BUSINESS.SEER.constants.SEERNativeView_Constants;
import APPS_COMMON.PageInitializers.PageInitializer;
import APPS_COMMON.Pages.NativeView_SideDoor_Dashboard_Page;
import APPS_COMMON.Utils.ServiceNow_Common_Methods;
import APPS_COMMON.Utils.ServiceNow_Login_Methods;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import java.util.Set;
import static com.nci.automation.web.TestProperties.getNerdUrl;

public class NERDApplicationStepsImplementation extends PageInitializer {

    /**
     * This method will create new Submission by Staff Member
     *
     * @param SubmissionType
     */
    public static void creatingNewCollaborationSubmission(WebElement SubmissionType) {
        CommonUtils.sleep(1000);
        CommonUtils.waitForClickability(SubmissionType);
        SubmissionType.click();
        Set<String> allWindowHandles1 = WebDriverUtils.webDriver.getWindowHandles();
        for (String currentWindow1 : allWindowHandles1) {
            WebDriverUtils.webDriver.switchTo().window(currentWindow1);
        }
        CucumberLogUtils.logScreenshot();
        CommonUtils.sendKeys(createNewSubmissionPage.titleTextBox, NCI_Staff_Members_Constants.CRS_COLLABORATION_NEW_SUBMISSION_TITLE_TEXT_BOX);
        CommonUtils.selectDropDownValue(createNewSubmissionPage.pleaseSpecifyDropDown, NCI_Staff_Members_Constants.CRS_COLLABORATION_NEW_SUBMISSION_PLEASE_SPECIFY_DROP_DOWN);
        CommonUtils.selectDropDownValue(createNewSubmissionPage.fiscalYearDropDown, NCI_Staff_Members_Constants.CRS_COLLABORATION_NEW_SUBMISSION_FISCAL_YEAR_DROP_DOWN);
        CommonUtils.switchToFrame(createNewSubmissionPage.DescriptionTextBoxIframe);
        CommonUtils.sleep(1000);
        CommonUtils.sendKeys(createNewSubmissionPage.collaborationsDescriptionTextBox,NCI_Staff_Members_Constants.CRS_COLLABORATION_NEW_SUBMISSION_DESCRIPTION_TEXT_BOX);
        CommonUtils.sleep(2000);
        WebDriverUtils.webDriver.switchTo().defaultContent();
        CommonUtils.sleep(2000);
        CucumberLogUtils.logScreenshot();
        CommonUtils.sleep(2000);
        CommonUtils.selectDropDownValue(createNewSubmissionPage.fyTheCollaborativeActivityOriginatedDropDown, NCI_Staff_Members_Constants.CRS_COLLABORATION_NEW_SUBMISSION_FY_THE_COLLABORATIVE_ACTIVITY_ORIGINATED_DROP_DOWN);
        CommonUtils.selectDropDownValue(createNewSubmissionPage.leadDOCDropDown, NCI_Staff_Members_Constants.CRS_COLLABORATION_NEW_SUBMISSION_LEAD_DOC_DROP_DOWN);
        CommonUtils.sendKeys(createNewSubmissionPage.pocTextBox, NCI_Staff_Members_Constants.CRS_COLLABORATION_NEW_SUBMISSION_POC_TEXT_BOX);
        CommonUtils.selectDropDownValue(createNewSubmissionPage.nihICs_ODcollaboratorsDropDown,NCI_Staff_Members_Constants.CRS_COLLABORATION_NEW_SUBMISSION_NIH_ICS_OD_COLLABORATORS_DROP_DOWN);
        CommonUtils.selectDropDownValue(createNewSubmissionPage.hhsAgencyCollaboratorsDropDown,NCI_Staff_Members_Constants.CRS_COLLABORATION_NEW_SUBMISSION_HHS_AGENCY_COLLABORATORS_DROP_DOWN);
        CommonUtils.selectDropDownValue(createNewSubmissionPage.otherFederalAgencyCollaboratorsDropDown,NCI_Staff_Members_Constants.CRS_COLLABORATION_NEW_SUBMISSION_OTHER_FEDERAL_AGENCY_COLLABORATORS_DROP_DOWN);
        CommonUtils.selectDropDownValue(createNewSubmissionPage.tribalStateLocalGovernmentCollaboratorsDropDown,NCI_Staff_Members_Constants.CRS_COLLABORATION_NEW_SUBMISSION_TRIBAL_STATE_LOCAL_GOVERNMENT_COLLABORATORS_DROP_DOWN);
        CommonUtils.selectDropDownValue(createNewSubmissionPage.foreignGovernmentCollaboratorsDropDown,NCI_Staff_Members_Constants.CRS_COLLABORATION_NEW_SUBMISSION_FOREIGN_GOVERNMENT_COLLABORATORS_DROP_DOWN);
        CommonUtils.selectDropDownValue(createNewSubmissionPage.nonGovernmentalCollaboratorsDropDown,NCI_Staff_Members_Constants.CRS_COLLABORATION_NEW_SUBMISSION_NON_GOVERNMENTAL_COLLABORATORS_DROP_DOWN);
        CommonUtils.clickOnElement(createNewSubmissionPage.selectTypeOfCollaborativeActivityListResourceDevelopmentCheckBox);
        CommonUtils.selectDropDownValue(createNewSubmissionPage.isThisCollaborationRelatedToRegulatoryActivityDropDown,NCI_Staff_Members_Constants.CRS_COLLABORATION_NEW_SUBMISSION_IS_THIS_COLLABORATION_RELATED_TO_A_REGULATORY_ACTIVITY_DROP_DOWN);
        CommonUtils.selectDropDownValue(createNewSubmissionPage.wasNIHFundingProvidedForThisActivityDropDown,NCI_Staff_Members_Constants.CRS_COLLABORATION_NEW_SUBMISSION_WAS_NIH_FUNDING_PROVIDED_FOR_THIS_ACTIVITY_DROP_DOWN);
        CommonUtils.clickOnElement(createNewSubmissionPage.productsOutputsListResearchToolDevelopmentCheckBox);
        JavascriptUtils.scrollIntoView(createNewSubmissionPage.submitButton);
        CommonUtils.selectDropDownValue(createNewSubmissionPage.nihStrategicAlignment_Primary_DropDown,NCI_Staff_Members_Constants.CRS_COLLABORATION_NEW_SUBMISSION_NIH_STRATEGIC_ALIGNMENT_DROP_DOWN);
        CommonUtils.selectDropDownValue(createNewSubmissionPage.hhsStrategicPlanAlignment_Primary_DropDown,NCI_Staff_Members_Constants.CRS_COLLABORATION_NEW_SUBMISSION_HHS_STRATEGIC_PLAN_ALIGNMENT_DROP_DOWN);
        CommonUtils.clickOnElement(createNewSubmissionPage.submitButton);
        CommonUtils.clickOnElement(createNewSubmissionPage.popUpConfirmationYesButton);
        CommonUtils.sleep(3000);
        CucumberLogUtils.logScreenshot();
        CommonUtils.sleep(3000);
        CommonUtils.clickOnElement(createNewSubmissionPage.popUpSubmissionConfirmationOkButton);
        CommonUtils.sleep(2000);
    }

    /**
     * This method highlight the Under Review Text
     *
     * @param expectedUnderReviewText
     */
    public static void theCreatedCollaborationsSubmissionIsDisplaysInTheCollaborationsCategorySectionWithTheStatus(String expectedUnderReviewText) {
        CommonUtils.sleep(1000);
        CucumberLogUtils.logScreenshot();
        createNewSubmissionPage.nerdCollaborationsButton.click();
        CommonUtils.sleep(1000);
        CucumberLogUtils.logScreenshot();
        String actualUnderReviewText = nerdDynamicXpaths.underReviewText(NCI_Staff_Members_Constants.CRS_COLLABORATION_NEW_SUBMISSION_TITLE_TEXT_BOX).getText();
        CommonUtils.assertEquals(expectedUnderReviewText, actualUnderReviewText);
        JavascriptUtils.drawBlueBorder(nerdDynamicXpaths.underReviewText(NCI_Staff_Members_Constants.CRS_COLLABORATION_NEW_SUBMISSION_TITLE_TEXT_BOX));
        CommonUtils.sleep(1000);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method will create new Submission by Staff Member
     *
     * @param SubmissionType
     */
    public static void creatingNewSubmission(WebElement SubmissionType) {
        CommonUtils.sleep(20000);
        CommonUtils.waitForClickability(SubmissionType);
        CommonUtils.clickOnElement(SubmissionType);
        Set<String> allWindowHandles1 = WebDriverUtils.webDriver.getWindowHandles();
        for (String currentWindow1 : allWindowHandles1) {
            WebDriverUtils.webDriver.switchTo().window(currentWindow1);
        }
        CommonUtils.sleep(1000);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method will save created Submission
     */
    public static void savingOfSubmission() {
        CommonUtils.sleep(2000);
        JavascriptUtils
                .scrollIntoView(nerdCrsKnowledgeDatabaseSubmissionsPage.topAccomplishmentNewSubmissionSaveButton);
        CommonUtils.sleep(2000);
        CommonUtils.clickOnElement(nerdCrsKnowledgeDatabaseSubmissionsPage.topAccomplishmentNewSubmissionSaveButton);
        CucumberLogUtils.logScreenshot();
        CommonUtils.sleep(2000);
        CommonUtils.clickOnElement(createNewSubmissionPage.popUpSubmissionConfirmationOkButton);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method will return the Submission
     *
     * @param submissionName
     */
    public static void returningOfSubmission(String submissionName) {
        CommonUtils.sleep(5000);
        CommonUtils.waitForVisibility(nerdDynamicXpaths.returnButton(submissionName));
        JavascriptUtils.clickByJS(nerdDynamicXpaths.returnButton(submissionName));
        CommonUtils.sleep(5000);
        nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNpopUpWindowTextField.sendKeys(submissionName);
        CucumberLogUtils.logScreenshot();
        nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNpopUpWindowYESbutton.click();
        CommonUtils.sleep(1000);
        CucumberLogUtils.logScreenshot();
        nerdCrsKnowledgeDatabaseSubmissionsPage.popUpOKbutton.click();
        CommonUtils.sleep(3000);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method will return the Submission to a Program Staff
     *
     * @param submissionName
     */
    public static void returningOfSubmissionToProgramStaff(String submissionName) {
        CommonUtils.waitForVisibility(
                nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink);
        nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink.click();
        JavascriptUtils.scrollIntoView(nerdDynamicXpaths.returnButtonToStaff(submissionName));
        CommonUtils.sleep(1000);
        JavascriptUtils.clickByJS(nerdDynamicXpaths.returnButtonToStaff(submissionName));
        CommonUtils.sleep(1000);
        CommonUtils.waitForVisibility(nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNtoStaffPopUpWindowTextField);
        nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNtoStaffPopUpWindowTextField
                .sendKeys(ReturningSubmissions_Constants.RETURN_TO_PROGRAM_STUFF_MESSAGE);
        nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNtoStaffPopUpWindowYesButton.click();
        nerdCrsKnowledgeDatabaseSubmissionsPage.popUpOKbutton.click();
        CommonUtils.sleep(3000);
        CommonUtils.assertTrue(nerdDynamicXpaths.returnedToStaffMemberText(submissionName).getText()
                .contentEquals(ReturningSubmissions_Constants.RETURNED_TO_STUFF_MEMBER_TEXT));
        JavascriptUtils.drawBlueBorder(nerdDynamicXpaths.returnedToStaffMemberText(submissionName));
        CucumberLogUtils.logScreenshot();
        CommonUtils.sleep(2000);
    }

    /**
     * This method will return the Submission to a Program Staff In Same DOC
     *
     * @param submissionName
     */
    public static void returningOfSubmissionToTheProgramStaffInSameDOC(String submissionName) {
        nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink.click();
        CommonUtils.sleep(4000);
        JavascriptUtils.scrollIntoView(nerdDynamicXpaths.returnButtonToDOC(submissionName));
        CommonUtils.sleep(500);
        JavascriptUtils.clickByJS(nerdDynamicXpaths.returnButtonToDOC(submissionName));
        CommonUtils.sleep(2000);
        nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNtoStaffPopUpWindowDropDown.click();
        CommonUtils.sleep(2000);
        nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNtoStaffPopUpWindowForSearchStaffMemberTextField
                .sendKeys(ReturningSubmissions_Constants.CBIIT_TEST_ACCOUNT_TEXT);
        CommonUtils.sleep(5000);
        nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNtoStaffPopUpWindowResultsTextField.click();
        CommonUtils.sleep(2000);
        nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNtoStaffPopUpWindowTextField
                .sendKeys(ReturningSubmissions_Constants.RETURN_TO_STUFF_MEMBER_MESSAGE);
        CommonUtils.sleep(2000);
        nerdCrsKnowledgeDatabaseSubmissionsPage.confirmReturnYesButton.click();
        CommonUtils.sleep(2000);
        nerdCrsKnowledgeDatabaseSubmissionsPage.popUpOKbutton.click();
        CommonUtils.sleep(2000);
        JavascriptUtils.drawBlueBorder(nerdDynamicXpaths.returnedToStaffMemberText(submissionName));
        CucumberLogUtils.logScreenshot();
        CommonUtils.sleep(4000);
    }

    /**
     * This method will return the Submission to a DOC Planing Contact
     *
     * @param submissionName
     */
    public static void returningOfSubmissionToDOCPlaningContact(String submissionName) {
        CommonUtils.waitForVisibility(
                nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemHomePageDropDownMenu);
        CommonUtils.waitForClickability(
                nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemHomePageDropDownMenu);
        nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemHomePageDropDownMenu.click();
        CommonUtils.selectValueFromBootStrapDropDown(
                nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemHomePageDropDownMenuValues,
                ReturningSubmissions_Constants.BOOTSTRAP_DROPDOWN_SELECT_SUBMISSIONS);
        CommonUtils.waitForVisibility(nerdCrsKnowledgeDatabaseSubmissionsPage.submissionsOrderByDropDown);
        nerdCrsKnowledgeDatabaseSubmissionsPage.submissionsOrderByDropDown.click();
        CommonUtils.waitForVisibility(nerdDynamicXpaths.publishedCollaboration(submissionName));
        nerdDynamicXpaths.returnButton(submissionName).click();
        CommonUtils.waitForVisibility(nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNpopUpWindowTextField);
        nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNpopUpWindowTextField.click();
        nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNpopUpWindowTextField
                .sendKeys(ReturningSubmissions_Constants.RETURN_TO_STUFF_MEMBER_MESSAGE);
        CommonUtils.sleep(5000);
        CommonUtils.waitForVisibility(nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNpopUpWindowYESbutton);
        nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNpopUpWindowYESbutton.click();
        CucumberLogUtils.logScreenshot();
        CommonUtils.waitForVisibility(nerdCrsKnowledgeDatabaseSubmissionsPage.submissionSuccessfullyPopUpOkButton);
        CucumberLogUtils.logScreenshot();
        nerdCrsKnowledgeDatabaseSubmissionsPage.submissionSuccessfullyPopUpOkButton.click();
        CucumberLogUtils.logScreenshot();
        CommonUtils.sleep(2000);
    }

    /**
     * This method verifies that email is not received in system Logs
     *
     */
    public static void checkingEmailWasNotReceived(String docPlanningContact) {
        ServiceNow_Common_Methods.logOutOfNativeView();
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        CommonUtils.sleep(2000);
        WebDriverUtils.webDriver.get(ReturningSubmissions_Constants.NATIVE_VIEW_EMAILS_UNDER_SYSTEM_LOGS_URL);
        CommonUtils.sleep(3000);
        CommonUtils.switchToFrame(NativeView_SideDoor_Dashboard_Page.nativeViewiFrame);
        CommonUtils.sleep(1000);
        CommonUtils.assertTrue(nativeViewEmailsPage.emailsMenu.getText()
                .contentEquals("Emails"));
        CucumberLogUtils.logScreenshot();
        CommonUtils.sleep(3000);
        CommonUtils.waitForVisibility(nativeViewSentViewPage.nativeViewSearchDropDown);
        CommonUtils.selectDropDownValue(nativeViewSentViewPage.nativeViewSearchDropDown, "recipients");
        CommonUtils.sendKeysToElement(nativeViewSentViewPage.nativeViewSentSearchField, docPlanningContact);
        CommonUtils.sleep(1000);
        CucumberLogUtils.logScreenshot();
        nativeViewSentViewPage.nativeViewSentSearchField.sendKeys(Keys.ENTER);
        CommonUtils.sleep(1000);
        CommonUtils.assertEqualsWithMessage(nativeViewAccessRequestPage.nativeViewAccessRequestEmailsNoRecordsToDisplayText.getText(),SEERNativeView_Constants.NATIVE_VIEW_NO_RECORD_TO_DISPLAY_TEXT, "Verify there are no records to display");
        JavascriptUtils.drawBlueBorder(nativeViewAccessRequestPage.nativeViewAccessRequestEmailsNoRecordsToDisplayText);
        CommonUtils.sleep(500);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method will locate user to a Submissions Page
     *
     * @param applicationName
     */
    public static void userIsOnSubmissionsPage(String applicationName) {
        WebDriverUtils.webDriver.get(getNerdUrl());
        WebDriverUtils.webDriver.navigate().refresh();
        CommonUtils.sleep(55000); //This is the only solution as per current situation for loading NERD records
        CommonUtils.waitForVisibility(
                nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemHomePageNERDButton);
        nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemHomePageNERDButton.click();
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method will verify that section of Covid-19 Submission is Displayed
     *
     * @param sectionName
     */
    public static void sectionOfCovid_19_SubmissionIsDisplayed(String sectionName) {
        CommonUtils.sleep(1000);
        CommonUtils.waitForVisibility(
                nerdCrsKnowledgeDatabaseSubmissionsPage.thisActivityAlignsWithTheFollowingNIHCovid19StrategicPlanText);
        CommonUtils.assertTrue(
                nerdCrsKnowledgeDatabaseSubmissionsPage.thisActivityAlignsWithTheFollowingNIHCovid19StrategicPlanText
                        .isDisplayed());
        JavascriptUtils.drawBlueBorder(
                nerdCrsKnowledgeDatabaseSubmissionsPage.thisActivityAlignsWithTheFollowingNIHCovid19StrategicPlanText);
        CommonUtils.assertTrue(
                nerdCrsKnowledgeDatabaseSubmissionsPage.thisActivityAlignsWithTheFollowingNIHCovid19StrategicPlanText
                        .getText().contentEquals(sectionName));
        JavascriptUtils.scrollIntoView(
                nerdCrsKnowledgeDatabaseSubmissionsPage.thisActivityAlignsWithTheFollowingNIHCovid19StrategicPlanText);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method will open new tab for adding new OM Entry
     */
    public static void addingNewOM_Entry() {
        CommonUtils.sleep(20000); //this wait time is needed for NERD that will be replaced by NERD redesign soon
        CommonUtils.waitForVisibility(nerdCrsKnowledgeDatabaseSubmissionsPage.omAddNewEntryButton);
        JavascriptUtils.scrollIntoView(nerdCrsKnowledgeDatabaseSubmissionsPage.omAddNewEntryButton);
        CommonUtils.sleep(1000);
        nerdCrsKnowledgeDatabaseSubmissionsPage.omAddNewEntryButton.click();
        CommonUtils.sleep(2000);
        Set<String> allWindowHandles1 = WebDriverUtils.webDriver.getWindowHandles();
        for (String currentWindow1 : allWindowHandles1) {
            WebDriverUtils.webDriver.switchTo().window(currentWindow1);
        }
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method will verify OM Entry content type
     *
     * @param omContentType
     */
    public static void verifyingOM_ContentType(String omContentType) {
        CommonUtils.sleep(2000);
        CommonUtils.waitForVisibility(nerdCrsKnowledgeDatabaseSubmissionsPage.omContentTypeHeaderText);
        CommonUtils.assertTrue(nerdCrsKnowledgeDatabaseSubmissionsPage.omContentTypeHeaderText.isDisplayed());
        CommonUtils.assertTrue(
                nerdCrsKnowledgeDatabaseSubmissionsPage.omContentTypeHeaderText.getText().equals(omContentType));
        CommonUtils.sleep(2000);
        JavascriptUtils.drawBlueBorder(nerdCrsKnowledgeDatabaseSubmissionsPage.omContentTypeHeaderText);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method will verify OM Entry Checkboxes
     *
     * @param administrationTransitionMaterial
     * @param congressionalJustification
     * @param hhsRequests
     * @param antiHarrassmentCivilityMaterial
     * @param donnasBlog
     * @param furloughPlanning
     * @param equityAndInclusionProgram
     * @param covid19LeadershipMessages
     */
    public static void verifyingOfOM_CheckBoxes(String administrationTransitionMaterial,
            String congressionalJustification, String hhsRequests, String antiHarrassmentCivilityMaterial,
            String donnasBlog, String furloughPlanning, String equityAndInclusionProgram,
            String covid19LeadershipMessages) {
        CommonUtils.sleep(1000);
        CommonUtils.waitForVisibility(nerdCrsKnowledgeDatabaseSubmissionsPage.administrationTransitionMaterialText);
        CommonUtils.assertTrue(nerdCrsKnowledgeDatabaseSubmissionsPage.administrationTransitionMaterialText.getText()
                .contentEquals(administrationTransitionMaterial)
                && nerdCrsKnowledgeDatabaseSubmissionsPage.administrationTransitionMaterialText.isDisplayed()
                && nerdCrsKnowledgeDatabaseSubmissionsPage.administrationTransitionMaterialText.isEnabled());
        CommonUtils.assertTrue(nerdCrsKnowledgeDatabaseSubmissionsPage.congressionalJustificationText.getText()
                .contentEquals(congressionalJustification)
                && nerdCrsKnowledgeDatabaseSubmissionsPage.congressionalJustificationText.isDisplayed()
                && nerdCrsKnowledgeDatabaseSubmissionsPage.congressionalJustificationText.isEnabled());
        CommonUtils.assertTrue(nerdCrsKnowledgeDatabaseSubmissionsPage.hhsRequestsText.getText().contentEquals(hhsRequests)
                && nerdCrsKnowledgeDatabaseSubmissionsPage.hhsRequestsText.isDisplayed()
                && nerdCrsKnowledgeDatabaseSubmissionsPage.hhsRequestsText.isEnabled());
        CommonUtils.assertTrue(nerdCrsKnowledgeDatabaseSubmissionsPage.antiHarrassmentCivilityMaterialText.getText()
                .contentEquals(antiHarrassmentCivilityMaterial)
                && nerdCrsKnowledgeDatabaseSubmissionsPage.antiHarrassmentCivilityMaterialText.isDisplayed()
                && nerdCrsKnowledgeDatabaseSubmissionsPage.antiHarrassmentCivilityMaterialText.isEnabled());
        CommonUtils.assertTrue(nerdCrsKnowledgeDatabaseSubmissionsPage.donnasBlogText.getText().contentEquals(donnasBlog)
                && nerdCrsKnowledgeDatabaseSubmissionsPage.donnasBlogText.isDisplayed()
                && nerdCrsKnowledgeDatabaseSubmissionsPage.donnasBlogText.isEnabled());
        CommonUtils.assertTrue(
                nerdCrsKnowledgeDatabaseSubmissionsPage.furloughPlanningText.getText().contentEquals(furloughPlanning)
                        && nerdCrsKnowledgeDatabaseSubmissionsPage.furloughPlanningText.isDisplayed()
                        && nerdCrsKnowledgeDatabaseSubmissionsPage.furloughPlanningText.isEnabled());
        CommonUtils.assertTrue(nerdCrsKnowledgeDatabaseSubmissionsPage.equityAndInclusionProgramText.getText()
                .contentEquals(equityAndInclusionProgram)
                && nerdCrsKnowledgeDatabaseSubmissionsPage.equityAndInclusionProgramText.isDisplayed()
                && nerdCrsKnowledgeDatabaseSubmissionsPage.equityAndInclusionProgramText.isEnabled());
        CommonUtils.assertTrue(nerdCrsKnowledgeDatabaseSubmissionsPage.covid19LeadershipMessagesText.getText()
                .contentEquals(covid19LeadershipMessages)
                && nerdCrsKnowledgeDatabaseSubmissionsPage.covid19LeadershipMessagesText.isDisplayed()
                && nerdCrsKnowledgeDatabaseSubmissionsPage.covid19LeadershipMessagesText.isEnabled());
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method verifies that the following check box option is displayed as COVID19 Leadership Messages
     *
     * @param covid19LeadershipMessages
     */
    public static void verifyingOfOM_CheckBox(String covid19LeadershipMessages) {
        CommonUtils.sleep(1000);
        CommonUtils.waitForVisibility(nerdCrsKnowledgeDatabaseSubmissionsPage.covid19LeadershipMessagesText);
        CommonUtils.assertTrue(nerdCrsKnowledgeDatabaseSubmissionsPage.covid19LeadershipMessagesText.getText()
            .contentEquals(covid19LeadershipMessages)
               && nerdCrsKnowledgeDatabaseSubmissionsPage.covid19LeadershipMessagesText.isDisplayed()
              && nerdCrsKnowledgeDatabaseSubmissionsPage.covid19LeadershipMessagesText.isEnabled());
        CommonUtils.clickOnElement(nerdCrsKnowledgeDatabaseSubmissionsPage.covid19LeadershipMessagesText);
        JavascriptUtils.drawBlueBorder(nerdCrsKnowledgeDatabaseSubmissionsPage.covid19LeadershipMessagesText);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method will verify that Checkbox options are Displayed
     *
     * @param covid19
     * @param communications
     * @param rare
     * @param bigDataDataSharing
     * @param researchResourcesAndInfrastructure
     * @param sexGenderDifferences
     * @param partnerships
     * @param technologyDevelopment
     * @param trainingWorkforceDevelopment
     * @param workforce
     * @param metastatic
     * @param meetingWorkshopConference
     * @param minorityHealthHealtDisparities
     * @param pediatric
     * @param reportGuidancePolicy
     */
    public static void checkBoxOptionsAreDisplayed(String covid19, String communications, String rare,
            String bigDataDataSharing, String researchResourcesAndInfrastructure, String sexGenderDifferences,
            String partnerships,
            String technologyDevelopment, String trainingWorkforceDevelopment, String workforce, String metastatic,
            String meetingWorkshopConference, String minorityHealthHealtDisparities, String pediatric,
            String reportGuidancePolicy) {
        CommonUtils.sleep(1000);
        JavascriptUtils.scrollIntoView(nerdCrsKnowledgeDatabaseSubmissionsPage.specialTopicHeaderText);
        CommonUtils.selectCheckboxDisplayed(nerdCrsKnowledgeDatabaseSubmissionsPage.covid19ActivitiesCheckBoxes,
                ReturningSubmissions_Constants.ARIA_LABEL_CHECK_BOX, covid19);
        nerdCrsKnowledgeDatabaseSubmissionsPage.covid19CheckBox.click();
        CommonUtils.selectCheckboxDisplayed(nerdCrsKnowledgeDatabaseSubmissionsPage.covid19ActivitiesCheckBoxes,
                ReturningSubmissions_Constants.ARIA_LABEL_CHECK_BOX, communications);
        CommonUtils.selectCheckboxDisplayed(nerdCrsKnowledgeDatabaseSubmissionsPage.covid19ActivitiesCheckBoxes,
                ReturningSubmissions_Constants.ARIA_LABEL_CHECK_BOX, rare);
        CommonUtils.selectCheckboxDisplayed(nerdCrsKnowledgeDatabaseSubmissionsPage.covid19ActivitiesCheckBoxes,
                ReturningSubmissions_Constants.ARIA_LABEL_CHECK_BOX, bigDataDataSharing);
        CommonUtils.selectCheckboxDisplayed(nerdCrsKnowledgeDatabaseSubmissionsPage.covid19ActivitiesCheckBoxes,
                ReturningSubmissions_Constants.ARIA_LABEL_CHECK_BOX, researchResourcesAndInfrastructure);
        CommonUtils.selectCheckboxDisplayed(nerdCrsKnowledgeDatabaseSubmissionsPage.covid19ActivitiesCheckBoxes,
                ReturningSubmissions_Constants.ARIA_LABEL_CHECK_BOX, sexGenderDifferences);
        CommonUtils.selectCheckboxDisplayed(nerdCrsKnowledgeDatabaseSubmissionsPage.covid19ActivitiesCheckBoxes,
                ReturningSubmissions_Constants.ARIA_LABEL_CHECK_BOX, partnerships);
        CommonUtils.selectCheckboxDisplayed(nerdCrsKnowledgeDatabaseSubmissionsPage.covid19ActivitiesCheckBoxes,
                ReturningSubmissions_Constants.ARIA_LABEL_CHECK_BOX, technologyDevelopment);
        CommonUtils.selectCheckboxDisplayed(nerdCrsKnowledgeDatabaseSubmissionsPage.covid19ActivitiesCheckBoxes,
                ReturningSubmissions_Constants.ARIA_LABEL_CHECK_BOX, trainingWorkforceDevelopment);
        CommonUtils.selectCheckboxDisplayed(nerdCrsKnowledgeDatabaseSubmissionsPage.covid19ActivitiesCheckBoxes,
                ReturningSubmissions_Constants.ARIA_LABEL_CHECK_BOX, workforce);
        CommonUtils.selectCheckboxDisplayed(nerdCrsKnowledgeDatabaseSubmissionsPage.covid19ActivitiesCheckBoxes,
                ReturningSubmissions_Constants.ARIA_LABEL_CHECK_BOX, metastatic);
        CommonUtils.selectCheckboxDisplayed(nerdCrsKnowledgeDatabaseSubmissionsPage.covid19ActivitiesCheckBoxes,
                ReturningSubmissions_Constants.ARIA_LABEL_CHECK_BOX, meetingWorkshopConference);
        CommonUtils.selectCheckboxDisplayed(nerdCrsKnowledgeDatabaseSubmissionsPage.covid19ActivitiesCheckBoxes,
                ReturningSubmissions_Constants.ARIA_LABEL_CHECK_BOX, minorityHealthHealtDisparities);
        CommonUtils.selectCheckboxDisplayed(nerdCrsKnowledgeDatabaseSubmissionsPage.covid19ActivitiesCheckBoxes,
                ReturningSubmissions_Constants.ARIA_LABEL_CHECK_BOX, pediatric);
        CommonUtils.selectCheckboxDisplayed(nerdCrsKnowledgeDatabaseSubmissionsPage.covid19ActivitiesCheckBoxes,
                ReturningSubmissions_Constants.ARIA_LABEL_CHECK_BOX, reportGuidancePolicy);
        JavascriptUtils.scrollIntoView(nerdCrsKnowledgeDatabaseSubmissionsPage.specialTopicHeaderText);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method will create new Submission by Staff Member
     *
     * @param submissionName
     */
    public static void creatingOfNewSubmissionByStaffMember(String submissionName) {
        CommonUtils.sendKeys(createNewSubmissionPage.titleTextBox, submissionName);
        CommonUtils.selectDropDownValue(createNewSubmissionPage.pleaseSpecifyDropDown, "New");
        CommonUtils.selectDropDownValue(createNewSubmissionPage.fiscalYearDropDown, "2021");
        CommonUtils.sleep(2000);
        CommonUtils.switchToFrame(createNewSubmissionPage.DescriptionTextBoxIframe);
        CommonUtils.sendKeys(createNewSubmissionPage.DescriptionTextBox, "Test Description");
        WebDriverUtils.webDriver.switchTo().defaultContent();
        CommonUtils.selectDropDownValue(createNewSubmissionPage.fyTheCollaborativeActivityOriginatedDropDown, "2020");
        CommonUtils.selectDropDownValue(createNewSubmissionPage.leadDOCDropDown, "CBIIT");
        CommonUtils.sleep(2000);
        CommonUtils.selectCheckbox(createNewSubmissionPage.crsKnowledgeManagementSystemOtherDOCsList, "aria-label",
                "CBIIT");
        CommonUtils.sleep(3000);
        CucumberLogUtils.logScreenshot();
        CommonUtils.sendKeys(createNewSubmissionPage.pocTextBox, "Test");
        CommonUtils.selectDropDownValue(createNewSubmissionPage.nihICs_ODcollaboratorsDropDown, "Other");
        CommonUtils.sleep(1000);
        CommonUtils.assertEquals("IF OTHER IS SELECTED ABOVE, please specify",
                createNewSubmissionPage.nihICs_ODCollaboratorsIfOtherIsSelectedAbovePleaseSpecifyText.getText());
        CommonUtils.sendKeys(createNewSubmissionPage.nihICs_ODCollaboratorsIfOtherIsSelectedAbovePleaseSpecifyTextBox,
                "Test");
        CommonUtils.selectDropDownValue(createNewSubmissionPage.hhsAgencyCollaboratorsDropDown, "ACF");
        CommonUtils.selectDropDownValue(createNewSubmissionPage.otherFederalAgencyCollaboratorsDropDown, "Commerce");
        CommonUtils.selectDropDownValue(createNewSubmissionPage.tribalStateLocalGovernmentCollaboratorsDropDown,
                "No Tribal/State/Local/Government Collaborators");
        CommonUtils.selectDropDownValue(createNewSubmissionPage.foreignGovernmentCollaboratorsDropDown,
                "Health Canada");
        CommonUtils.selectDropDownValue(createNewSubmissionPage.nonGovernmentalCollaboratorsDropDown, "Wellcome Trust");
        CommonUtils.selectCheckbox(
                createNewSubmissionPage.crsKnowledgeManagementSystemSelectTypeOfCollaborativeActivityList, "aria-label",
                "Research Initiative");
        CommonUtils.sleep(1000);
        CucumberLogUtils.logScreenshot();
        CommonUtils.selectDropDownValue(createNewSubmissionPage.isThisCollaborationRelatedToRegulatoryActivityDropDown,
                "Yes");
        CommonUtils.selectDropDownValue(createNewSubmissionPage.wasNIHFundingProvidedForThisActivityDropDown, "No");
        CommonUtils.selectCheckbox(createNewSubmissionPage.crsKnowledgeManagementSystemProductsOutputsList,
                "aria-label", "Strategic Plan");
        JavascriptUtils.scrollDown(2000);
        CommonUtils.sleep(1000);
        CommonUtils.selectDropDownValue(createNewSubmissionPage.nihStrategicAlignment_Primary_DropDown,
                "Objective 1: Advancing Biomedical and Behavioral Sciences");
        CommonUtils.selectDropDownValue(createNewSubmissionPage.hhsStrategicPlanAlignment_SecondaryOptional_DropDown,
                "Strategic Goal 3: Strengthen the Economic and Social Well-Being of Americans Across the Lifespan");
        CommonUtils.sleep(1000);
        CucumberLogUtils.logScreenshot();
        CommonUtils.sendKeys(createNewSubmissionPage.chooseFileButton, COVIDConstants.DOC_PATH);
        CommonUtils.sleep(1000);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(createNewSubmissionPage.submitButton);
        CommonUtils.clickOnElement(createNewSubmissionPage.popUpConfirmationYesButton);
        CommonUtils.sleep(3000);
        CucumberLogUtils.logScreenshot();
        CommonUtils.sleep(3000);
        CommonUtils.clickOnElement(createNewSubmissionPage.popUpSubmissionConfirmationOkButton);
        CommonUtils.sleep(3000);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method will fill out required fields of Submission
     *
     */
    public static void filingOutAllRequiredFieldsOfSubmission() {
        CommonUtils.sleep(1000);
        nerdCrsKnowledgeDatabaseSubmissionsPage.submissionsSelectCheckBoxFiscalYear2019.click();
        CommonUtils.sleep(2000);
        CommonUtils.sendKeys(nerdCrsKnowledgeDatabaseSubmissionsPage.submissionsPageTitleTextBox, TopAccomplishmentsSubmission_Constants.TOP_ACCOMPLISHMENTS_SUBMISSION_NAME);
        CommonUtils.sleep(2000);
        CommonUtils.selectDropDownValue(createNewSubmissionPage.leadDOCDropDown, TopAccomplishmentsSubmission_Constants.TOP_ACCOMPLISHMENTS_DOC_DROPDOWN);
        CucumberLogUtils.logScreenshot();
        CommonUtils.sleep(4000);
        CommonUtils.switchToFrame(createNewSubmissionPage.DescriptionTextBoxIframe);
        createNewSubmissionPage.DescriptionTextBox.sendKeys(TopAccomplishmentsSubmission_Constants.TOP_ACCOMPLISHMENTS_DESCRIPTION_TEXT_BOX);
        CommonUtils.sleep(2000);
        WebDriverUtils.webDriver.switchTo().defaultContent();
        CommonUtils.sleep(2000);
        CucumberLogUtils.logScreenshot();
        CommonUtils.sleep(2000);
        JavascriptUtils.scrollIntoView(nerdCrsKnowledgeDatabaseSubmissionsPage.submissionsPageResearchTypeDropDown);
        CommonUtils.sleep(2000);
        CommonUtils.selectDropDownValue(nerdCrsKnowledgeDatabaseSubmissionsPage.submissionsPageResearchTypeDropDown,
                TopAccomplishmentsSubmission_Constants.TOP_ACCOMPLISHMENTS_RESEARCH_TYPE);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method will select Other OM Content
     *
     * @param otherOmContent
     */
    public static void selectingOfOtherOM_Content(String otherOmContent) {
        CommonUtils.sleep(1000);
        CommonUtils.waitForVisibility(nerdCrsKnowledgeDatabaseSubmissionsPage.otherOmContentText);
        CommonUtils.sleep(1000);
        CommonUtils.assertTrue(nerdCrsKnowledgeDatabaseSubmissionsPage.otherOmContentText.getText().equals(otherOmContent));
        nerdCrsKnowledgeDatabaseSubmissionsPage.otherOmContentText.click();
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method will verify that Please Specify Field is displayed
     *
     * @param omContentTypeOtherPleaseSpecify
     */
    public static void pleaseSpecifyFieldIsDisplayed(String omContentTypeOtherPleaseSpecify) {
        CommonUtils.sleep(1000);
        CommonUtils.waitForVisibility(nerdCrsKnowledgeDatabaseSubmissionsPage.omContentTypeOtherPleaseSpecifyText);
        CommonUtils.assertTrue(nerdCrsKnowledgeDatabaseSubmissionsPage.omContentTypeOtherPleaseSpecifyText.isDisplayed());
        CommonUtils.assertTrue(nerdCrsKnowledgeDatabaseSubmissionsPage.omContentTypeOtherPleaseSpecifyText.getText()
                .contentEquals(omContentTypeOtherPleaseSpecify));
        JavascriptUtils.drawBlueBorder(nerdCrsKnowledgeDatabaseSubmissionsPage.omContentTypeOtherPleaseSpecifyText);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method will verify Options to Submit, Edit and Delete of created
     * Submission
     *
     */
    public static void submissionOptions_SubmitEdit_areAvailable() {
        WebDriverUtils.webDriver.navigate().refresh();
        CommonUtils.assertEquals(ReturningSubmissions_Constants.BOOTSTRAP_DROPDOWN_SELECT_SUBMISSIONS, nerdCrsKnowledgeDatabaseSubmissionsPage.topSubmisionsName.getText());
        CommonUtils.sleep(2000);
        JavascriptUtils.clickByJS(nerdCrsKnowledgeDatabaseSubmissionsPage.topAccomplishmentSubmissionsPageLink);
        CommonUtils.sleep(2000);
        CommonUtils.assertTrue(nerdDynamicXpaths.submitToCRSButton(TopAccomplishmentsSubmission_Constants.TOP_ACCOMPLISHMENTS_SUBMISSION_NAME).isDisplayed());
        CommonUtils.assertTrue(nerdDynamicXpaths.submitToCRSButton(TopAccomplishmentsSubmission_Constants.TOP_ACCOMPLISHMENTS_SUBMISSION_NAME).isEnabled());
        JavascriptUtils.drawBlueBorder(nerdDynamicXpaths.submitToCRSButton(TopAccomplishmentsSubmission_Constants.TOP_ACCOMPLISHMENTS_SUBMISSION_NAME));
        CommonUtils.assertEquals("Submit", nerdDynamicXpaths.submitToCRSButton(TopAccomplishmentsSubmission_Constants.TOP_ACCOMPLISHMENTS_SUBMISSION_NAME).getText());
        CommonUtils.assertTrue(nerdDynamicXpaths.eiditCRSButton(TopAccomplishmentsSubmission_Constants.TOP_ACCOMPLISHMENTS_SUBMISSION_NAME).isDisplayed());
        CommonUtils.assertTrue(nerdDynamicXpaths.eiditCRSButton(TopAccomplishmentsSubmission_Constants.TOP_ACCOMPLISHMENTS_SUBMISSION_NAME).isEnabled());
        JavascriptUtils.drawBlueBorder(nerdDynamicXpaths.eiditCRSButton(TopAccomplishmentsSubmission_Constants.TOP_ACCOMPLISHMENTS_SUBMISSION_NAME));
        CommonUtils.assertEquals("Edit", nerdDynamicXpaths.eiditCRSButton(TopAccomplishmentsSubmission_Constants.TOP_ACCOMPLISHMENTS_SUBMISSION_NAME).getText());
        Assert.assertNotEquals("Delete", nerdDynamicXpaths.deleteCRSButton(TopAccomplishmentsSubmission_Constants.TOP_ACCOMPLISHMENTS_SUBMISSION_NAME).getText());
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method will verify required fields of Submission
     *
     * @param submissionName
     * @param PleaseSpecify
     * @param FiscalYear
     */
    public static void verifyingThatFieldsOfSubmissionAreClearedAndRequired(String submissionName, String PleaseSpecify,
            String FiscalYear) {
        nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink
                .click();
        nerdDynamicXpaths.editButton(submissionName).click();
        CommonUtils.sleep(2000);
        Set<String> allWindowHandles1 = WebDriverUtils.webDriver.getWindowHandles();
        for (String currentWindow1 : allWindowHandles1) {
            WebDriverUtils.webDriver.switchTo().window(currentWindow1);
        }
        CommonUtils.sleep(1000);
        CucumberLogUtils.logScreenshot();
        CommonUtils.waitForVisibility(createNewSubmissionPage.pleaseSpecifyText);
        CommonUtils.assertTrue(createNewSubmissionPage.pleaseSpecifyText.getText().contentEquals(PleaseSpecify));
        JavascriptUtils.drawBlueBorder(createNewSubmissionPage.pleaseSpecifyAsterisk);
        if (!createNewSubmissionPage.pleaseSpecifyDropDown.isSelected()) {
            CommonUtils.selectDropDownValue("Edited", createNewSubmissionPage.pleaseSpecifyDropDown);
            CommonUtils.sleep(1000);
        }
        CommonUtils.assertTrue(createNewSubmissionPage.fiscalYearText.getText().contentEquals(FiscalYear));
        JavascriptUtils.drawBlueBorder(createNewSubmissionPage.fiscalYearAsterisk);
        if (!createNewSubmissionPage.fiscalYearDropDown.isSelected()) {
            CommonUtils.selectDropDownValue("2024", createNewSubmissionPage.fiscalYearDropDown);
            CommonUtils.sleep(1000);
        }
        CommonUtils.sleep(1000);
        CucumberLogUtils.logScreenshot();
        createNewSubmissionPage.cancelButton.click();
    }

    /**
     * This method will verify available options of Submission
     *
     * @param submissionName
     * @param PleaseSpecify
     * @param Edited
     * @param NocChange
     * @param Ended
     * @param NotLedByNCI
     */
    public static void verifyingAvailableOptionsOfSubmission(String submissionName, String PleaseSpecify, String Edited, String NocChange,
            String Ended, String NotLedByNCI) {
        WebDriverUtils.webDriver.navigate().refresh();
        CommonUtils.sleep(5000);
        nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink.click();
        nerdDynamicXpaths.editButtonReturnedToStaffMember(submissionName).click();
        CommonUtils.sleep(2000);
        Set<String> allWindowHandles1 = WebDriverUtils.webDriver.getWindowHandles();
        for (String currentWindow1 : allWindowHandles1) {
            WebDriverUtils.webDriver.switchTo().window(currentWindow1);
        }
        CommonUtils.assertTrue(createNewSubmissionPage.pleaseSpecifyText.getText().contentEquals(PleaseSpecify));
        CommonUtils.sleep(1000);
        String[] exp = { Edited, NocChange, Ended, NotLedByNCI };

        for (WebElement act : createNewSubmissionPage.pleaseSpecifyDropDownValues) {
            boolean match = false;
            for (int i = 0; i < exp.length; i++) {
                if (act.getText().equals(exp[i])) {
                    match = true;
                    CommonUtils.selectDropDownValue(createNewSubmissionPage.pleaseSpecifyDropDown, exp[i]);
                    JavascriptUtils.drawBlueBorder(createNewSubmissionPage.pleaseSpecifyDropDown);
                    CommonUtils.sleep(1000);
                    CucumberLogUtils.logScreenshot();
                }
            }
            CommonUtils.assertTrue(match);
        }
        CommonUtils.sleep(1000);
        createNewSubmissionPage.cancelButton.click();
    }

    /**
     * This method will verify Submission is Under Review
     *
     * @param submissionName
     * @param UnderReview
     */
    public static void verifyingSubmissionIsUnderReview(String submissionName, String UnderReview) {
        CommonUtils.sleep(1000);
        JavascriptUtils.scrollIntoView(
                nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink);
        nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink.click();
        JavascriptUtils
                .scrollIntoView(nerdDynamicXpaths.publishedCollaboration(submissionName));
        CommonUtils.sleep(1000);
        CommonUtils.assertTrue(nerdDynamicXpaths.underReviewText(submissionName).getText()
                .equals(UnderReview));
        JavascriptUtils.drawBlueBorder(nerdDynamicXpaths.underReviewText(submissionName));
        CommonUtils.sleep(1000);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method will verify Submission is Returned to Staff Member
     *
     * @param submissionName
     * @param ReturnedToStaffMember
     */
    public static void verifyingReturnedToStaffMemberStatus(String submissionName, String ReturnedToStaffMember) {
        CommonUtils.sleep(2000);
        JavascriptUtils.scrollIntoView(nerdDynamicXpaths.returnedToStaffMemberTextVerification(submissionName));
        CommonUtils.assertTrue(nerdDynamicXpaths.returnedToStaffMemberTextVerification(submissionName).getText()
                .contentEquals(ReturnedToStaffMember));
        CommonUtils.sleep(2000);
        JavascriptUtils.drawBlueBorder(nerdDynamicXpaths.returnedToStaffMemberTextVerification(submissionName));
        CommonUtils.sleep(2000);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method will verify the version number of Submission
     *
     * @param versionNumber
     */
    public static void verifyingArticleVersionNumber(String versionNumber) {
        webDriver.navigate().refresh();
        nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemHomePageHOMEButton.click();
        nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemHomePageNERDButton.click();
        CommonUtils.sleep(55000); //Required to load NERD records
        CommonUtils.waitForVisibility( nerdCrsKnowledgeDatabaseSubmissionsPage.collaborationsList);
        JavascriptUtils.clickByJS(nerdCrsKnowledgeDatabaseSubmissionsPage.collaborationsList);
        CommonUtils.sleep(1000);
        JavascriptUtils.clickByJS(nerdDynamicXpaths.publishedCollaboration(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_VERSION_NUMBER));
        CommonUtils.switchToAnotherWindow();
        CommonUtils.sleep(1000);
        CommonUtils.assertTrue(nerdCrsKnowledgeDatabaseSubmissionsPage.collaborationsVersionNumber1.getText().trim()
                .contentEquals(versionNumber));
        JavascriptUtils.drawBlueBorder(nerdCrsKnowledgeDatabaseSubmissionsPage.collaborationsVersionNumber1);
        CommonUtils.sleep(5000);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method will verify incremented version number of Submission
     *
     * @param versionNumber
     */
    public static void verifyingIncrementedArticleVersionNumber(String versionNumber) {
        webDriver.navigate().refresh();
        nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemHomePageHOMEButton.click();
        nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemHomePageNERDButton.click();
        CommonUtils.sleep(55000); //Required to load NERD records
        CommonUtils.waitForVisibility( nerdCrsKnowledgeDatabaseSubmissionsPage.collaborationsList);
        JavascriptUtils.clickByJS(nerdCrsKnowledgeDatabaseSubmissionsPage.collaborationsList);
        CommonUtils.sleep(2000);
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(nerdDynamicXpaths.publishedCollaboration(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_VERSION_NUMBER));
        CommonUtils.switchToAnotherWindow();
        CommonUtils.sleep(1000);
        CucumberLogUtils.logScreenshot();
        CommonUtils.assertTrue(nerdCrsKnowledgeDatabaseSubmissionsPage.collaborationsVersionNumber2.getText().contentEquals(versionNumber));
        JavascriptUtils.drawBlueBorder(nerdCrsKnowledgeDatabaseSubmissionsPage.collaborationsVersionNumber2);
        CommonUtils.sleep(5000);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method will verify the original author of created Submission
     *
     * @param submissionName
     */
    public static void verifyingTheAuthorOfCreatedSubmission(String submissionName) {
        String authorExpected = nerdDynamicXpaths.authorTextDocSubmission(submissionName).getText();
        CommonUtils.sleep(3000);
        CommonUtils.assertEquals(authorExpected, nerdDynamicXpaths.authorTextDocSubmission(submissionName).getText());
        CommonUtils.sleep(3000);
        JavascriptUtils.scrollUp(300);
        CommonUtils.sleep(3000);
        JavascriptUtils.drawBlueBorder(nerdDynamicXpaths.authorTextDocSubmission(submissionName));
        CommonUtils.sleep(500);
        CucumberLogUtils.logScreenshot();
        CommonUtils.sleep(5000);
    }

    /**
     * This method will open new Tab to Edit Submission
     *
     * @param submissionName
     */
    public static void openingNewTabToEditSubmission(String submissionName) {
        CommonUtils.sleep(2000);
        Set<String> allWindowHandles1 = WebDriverUtils.webDriver.getWindowHandles();
        for (String currentWindow1 : allWindowHandles1) {
            WebDriverUtils.webDriver.switchTo().window(currentWindow1);
        }
        CommonUtils.sleep(1000);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method clicks on Collaborations Link
     *
     */
    public static void clickingOnCollaborationsLink() {
        CommonUtils.waitForVisibility(
                nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink);
        nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink.click();
    }

    /**
     * This method will log in as a DOC Planing contact and will click on the submission in the hamburger menu
     *
     */
   public static void aDocPlanningContactIsOnTheCrsKnowledgeManagementSystemHomePage(String docPlanningContact) {
       ServiceNow_Login_Methods.nativeViewSideDoorLogin();
       ServiceNow_Common_Methods.impersonateAnyUser(docPlanningContact);
       WebDriverUtils.webDriver.get(getNerdUrl());
       CucumberLogUtils.logScreenshot();
       CommonUtils.waitForVisibility(
               nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemHomePageDropDownMenu);
       nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemHomePageDropDownMenu.click();
       CommonUtils.selectValueFromBootStrapDropDown(
               nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemHomePageDropDownMenuValues,
               ReturningSubmissions_Constants.BOOTSTRAP_DROPDOWN_SELECT_SUBMISSIONS);
       CommonUtils.sleep(500);
       CucumberLogUtils.logScreenshot();
    }

    /**
     * This method will click on the Published Only check box
     *
     */

    public static void selectingThePublishedOnlyCheckbox() {
       NERD_CRS_ReviewersStepImplementation.thereIsACollapsedAccordionWithRheHeaderLabeled(ReturningSubmissions_Constants.TOP_ACCOMPLISHMENTS_CATEGORY);
       CommonUtils.clickOnElement(nerdCrsKnowledgeDatabaseSubmissionsPage.publishedOnlyCheckBox);
       JavascriptUtils.drawBlueBorder(nerdCrsKnowledgeDatabaseSubmissionsPage.publishedOnlyText);
       CucumberLogUtils.logScreenshot();
    }

    /**
     * This method will click if only Published submissions are shown
     *
     */
    public static void theDocPlanningContactIsAbleToSeeOnlyPublishedSubmissions() {
        for (int i = 1; i < 5; i++) {
            CommonUtils.clickOnElement(nerdDynamicXpaths.docPlanningSubmissionCategories("" + i));
            CommonUtils.sleep(500);
            for (WebElement pText : NERDDynamicXPATHS.docPlaningPublishedSubmissions("" + i)) {
                String actualPublishedText = pText.getText();
                JavascriptUtils.drawBlueBorder(pText);
                CommonUtils.assertTrue(actualPublishedText.equals(ReturningSubmissions_Constants.SUBMISSION_PUBLISHED_TEXT));
            }
            CucumberLogUtils.logScreenshot();
            CommonUtils.clickOnElement(nerdDynamicXpaths.docPlanningSubmissionCategories("" + i));
        }
    }
}