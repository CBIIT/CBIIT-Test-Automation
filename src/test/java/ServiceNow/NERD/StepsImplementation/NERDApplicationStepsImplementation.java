package ServiceNow.NERD.StepsImplementation;

import AnalysisTools.PLCOAPI.Steps.PublicAPISteps;
import ServiceNow.COVIDDash.Utils.COVIDConstants;
import ServiceNow.NERD.Constants.ReturningSubmissions_Constants;
import ServiceNow.NERD.Constants.TopAccomplishmentsSubmission_Constants;
import ServiceNow.NERD.Steps.HooksSteps;
import appsCommon.PageInitializer;

import java.util.Set;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NERDApplicationStepsImplementation extends PageInitializer {

    /**
     * This method will create new Submission by Staff Member
     *
     * @param SubmissionType
     */
    public static void creatingNewSubmission(WebElement SubmissionType) {
        MiscUtils.sleep(1000);
        CommonUtils.waitForClickability(SubmissionType);
        SubmissionType.click();
        Set<String> allWindowHandles1 = WebDriverUtils.webDriver.getWindowHandles();
        for (String currentWindow1 : allWindowHandles1) {
            WebDriverUtils.webDriver.switchTo().window(currentWindow1);
        }
        MiscUtils.sleep(1000);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
    }

    /**
     * This method will save created Submission
     */
    public static void savingOfSubmission() {
        MiscUtils.sleep(2000);
        JavascriptUtils
                .scrollIntoView(nerdCrsKnowledgeDatabaseSubmissionsPage.topAccomplishmentNewSubmissionSaveButton);
        MiscUtils.sleep(2000);
        CommonUtils.click(nerdCrsKnowledgeDatabaseSubmissionsPage.topAccomplishmentNewSubmissionSaveButton);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        MiscUtils.sleep(2000);
        CommonUtils.click(createNewSubmissionPage.popUpSubmissionConfirmationOkButton);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
    }

    /**
     * This method will delete created Submission
     *
     * @param submissionName
     */
    public static void deletingOfSubmission(String submissionName) {
        MiscUtils.sleep(1000);
        nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink.click();
        MiscUtils.sleep(1000);
        JavascriptUtils.scrollIntoView(nerdDynamicXpaths.deleteButton(submissionName));
        MiscUtils.sleep(1500);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        nerdDynamicXpaths.deleteButton(submissionName).click();
        MiscUtils.sleep(1000);
        nerdCrsKnowledgeDatabaseSubmissionsPage.confirmDeleteYesButton.click();
        MiscUtils.sleep(1000);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        nerdCrsKnowledgeDatabaseSubmissionsPage.popUpOKbutton.click();
        MiscUtils.sleep(1000);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
    }

    /**
     * This method will return the Submission
     *
     * @param submissionName
     */
    public static void returningOfSubmission(String submissionName) {
        MiscUtils.sleep(3000);
        JavascriptUtils.clickByJS(nerdDynamicXpaths.returnButton(submissionName));
        MiscUtils.sleep(5000);
        nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNpopUpWindowTextField.sendKeys(submissionName);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNpopUpWindowYESbutton.click();
        MiscUtils.sleep(1000);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        nerdCrsKnowledgeDatabaseSubmissionsPage.popUpOKbutton.click();
        MiscUtils.sleep(3000);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
    }

    /**
     * This method will locate the existing Submission
     *
     * @param submissionName
     */
    public static void locatingOfCollaboration(String submissionName) {
        CommonUtils.waitForVisibility(
                nerdDynamicXpaths.publishedCollaboration(submissionName));
        JavascriptUtils.drawRedBorder(
                nerdDynamicXpaths.publishedCollaboration(submissionName));
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        MiscUtils.sleep(1000);
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
        MiscUtils.sleep(1000);
        JavascriptUtils.clickByJS(nerdDynamicXpaths.returnButtonToStaff(submissionName));
        MiscUtils.sleep(1000);
        CommonUtils.waitForVisibility(nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNtoStaffPopUpWindowTextField);
        nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNtoStaffPopUpWindowTextField
                .sendKeys(ReturningSubmissions_Constants.RETURN_TO_PROGRAM_STUFF_MESSAGE);
        nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNtoStaffPopUpWindowYesButton.click();
        nerdCrsKnowledgeDatabaseSubmissionsPage.popUpOKbutton.click();
        MiscUtils.sleep(1000);
        CommonUtils.assertTrue(nerdDynamicXpaths.returnedToStaffMemberText(submissionName).getText()
                .contentEquals(ReturningSubmissions_Constants.RETURNED_TO_STUFF_MEMBER_TEXT));
        JavascriptUtils.drawBlueBorder(nerdDynamicXpaths.returnedToStaffMemberText(submissionName));
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        MiscUtils.sleep(2000);
    }

    /**
     * This method will return the Submission to a Program Staff In Same DOC
     *
     * @param submissionName
     */
    public static void returningOfSubmissionToTheProgramStaffInSameDOC(String submissionName) {
        nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink.click();
        MiscUtils.sleep(4000);
        JavascriptUtils.scrollIntoView(nerdDynamicXpaths.returnButtonToDOC(submissionName));
        MiscUtils.sleep(500);
        JavascriptUtils.clickByJS(nerdDynamicXpaths.returnButtonToDOC(submissionName));
        MiscUtils.sleep(2000);
        nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNtoStaffPopUpWindowDropDown.click();
        MiscUtils.sleep(2000);
        nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNtoStaffPopUpWindowForSearchStaffMemberTextField
                .sendKeys(ReturningSubmissions_Constants.CBIIT_TEST_ACCOUNT_TEXT);
        MiscUtils.sleep(5000);
        nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNtoStaffPopUpWindowResultsTextField.click();
        MiscUtils.sleep(2000);
        nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNtoStaffPopUpWindowTextField
                .sendKeys(ReturningSubmissions_Constants.RETURN_TO_STUFF_MEMBER_MESSAGE);
        MiscUtils.sleep(2000);
        nerdCrsKnowledgeDatabaseSubmissionsPage.confirmReturnYesButton.click();
        MiscUtils.sleep(2000);
        nerdCrsKnowledgeDatabaseSubmissionsPage.popUpOKbutton.click();
        MiscUtils.sleep(2000);
        JavascriptUtils
                .drawBlueBorder(nerdDynamicXpaths.returnedToStaffMemberText(submissionName));
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        MiscUtils.sleep(4000);
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
        CommonUtils.waitForVisibility(
                nerdDynamicXpaths.publishedCollaboration(submissionName));
        nerdDynamicXpaths.returnButton(submissionName).click();
        CommonUtils.waitForVisibility(nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNpopUpWindowTextField);
        nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNpopUpWindowTextField.click();
        nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNpopUpWindowTextField
                .sendKeys(ReturningSubmissions_Constants.RETURN_TO_STUFF_MEMBER_MESSAGE);
        MiscUtils.sleep(5000);
        CommonUtils.waitForVisibility(nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNpopUpWindowYESbutton);
        nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNpopUpWindowYESbutton.click();
        CommonUtils.waitForVisibility(nerdCrsKnowledgeDatabaseSubmissionsPage.submissionSuccessfullyPopUpOkButton);
        nerdCrsKnowledgeDatabaseSubmissionsPage.submissionSuccessfullyPopUpOkButton.click();
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        MiscUtils.sleep(2000);

    }

    /**
     * This method will locate user to a Submissions Page
     *
     * @param applicationName
     */
    public static void userIsOnSubmissionsPage(String applicationName) throws TestingException {
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl(applicationName));
        WebDriverUtils.webDriver.navigate().refresh();
        MiscUtils.sleep(1000);
        CommonUtils.waitForVisibility(
                nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemHomePageNERDButton);
        nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemHomePageNERDButton.click();
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
    }

    /**
     * This method will verify that section of Covid-19 Submission is Displayed
     *
     * @param sectionName
     */
    public static void sectionOfCovid_19_SubmissionIsDisplayed(String sectionName) {
        MiscUtils.sleep(1000);
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
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
    }

    /**
     * This method will open new tab for adding new OM Entry
     */
    public static void addingNewOM_Entry() {
        MiscUtils.sleep(1000);
        CommonUtils.waitForVisibility(nerdCrsKnowledgeDatabaseSubmissionsPage.omAddNewEntryButton);
        JavascriptUtils.scrollIntoView(nerdCrsKnowledgeDatabaseSubmissionsPage.omAddNewEntryButton);
        MiscUtils.sleep(1000);
        nerdCrsKnowledgeDatabaseSubmissionsPage.omAddNewEntryButton.click();
        MiscUtils.sleep(2000);
        Set<String> allWindowHandles1 = WebDriverUtils.webDriver.getWindowHandles();
        for (String currentWindow1 : allWindowHandles1) {
            WebDriverUtils.webDriver.switchTo().window(currentWindow1);
        }
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
    }

    /**
     * This method will verify OM Entry content type
     *
     * @param omContentType
     */
    public static void verifyingOM_ContentType(String omContentType) {
        MiscUtils.sleep(2000);
        CommonUtils.waitForVisibility(nerdCrsKnowledgeDatabaseSubmissionsPage.omContentTypeHeaderText);
        CommonUtils.assertTrue(nerdCrsKnowledgeDatabaseSubmissionsPage.omContentTypeHeaderText.isDisplayed());
        CommonUtils.assertTrue(
                nerdCrsKnowledgeDatabaseSubmissionsPage.omContentTypeHeaderText.getText().equals(omContentType));
        MiscUtils.sleep(2000);
        JavascriptUtils.drawBlueBorder(nerdCrsKnowledgeDatabaseSubmissionsPage.omContentTypeHeaderText);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
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
        MiscUtils.sleep(1000);
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
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
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
        MiscUtils.sleep(1000);
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
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
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
        MiscUtils.sleep(2000);
        CommonUtils.switchToFrame(createNewSubmissionPage.DescriptionTextBoxIframe);
        CommonUtils.sendKeys(createNewSubmissionPage.DescriptionTextBox, "Test Description");
        WebDriverUtils.webDriver.switchTo().defaultContent();
        CommonUtils.selectDropDownValue(createNewSubmissionPage.fyTheCollaborativeActivityOriginatedDropDown, "2020");
        CommonUtils.selectDropDownValue(createNewSubmissionPage.leadDOCDropDown, "CBIIT");
        MiscUtils.sleep(2000);
        CommonUtils.selectCheckbox(createNewSubmissionPage.crsKnowledgeManagementSystemOtherDOCsList, "aria-label",
                "CBIIT");
        MiscUtils.sleep(3000);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        CommonUtils.sendKeys(createNewSubmissionPage.pocTextBox, "Test");
        CommonUtils.selectDropDownValue(createNewSubmissionPage.nihICs_ODcollaboratorsDropDown, "Other");
        MiscUtils.sleep(1000);
        Assert.assertEquals("IF OTHER IS SELECTED ABOVE, please specify",
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
        MiscUtils.sleep(1000);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        CommonUtils.selectDropDownValue(createNewSubmissionPage.isThisCollaborationRelatedToRegulatoryActivityDropDown,
                "Yes");
        CommonUtils.selectDropDownValue(createNewSubmissionPage.wasNIHFundingProvidedForThisActivityDropDown, "No");
        CommonUtils.selectCheckbox(createNewSubmissionPage.crsKnowledgeManagementSystemProductsOutputsList,
                "aria-label", "Strategic Plan");
        JavascriptUtils.scrollDown(2000);
        MiscUtils.sleep(1000);
        CommonUtils.selectDropDownValue(createNewSubmissionPage.nihStrategicAlignment_Primary_DropDown,
                "Objective 1: Advancing Biomedical and Behavioral Sciences");
        CommonUtils.selectDropDownValue(createNewSubmissionPage.hhsStrategicPlanAlignment_SecondaryOptional_DropDown,
                "Strategic Goal 3: Strengthen the Economic and Social Well-Being of Americans Across the Lifespan");
        MiscUtils.sleep(1000);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        CommonUtils.sendKeys(createNewSubmissionPage.chooseFileButton, COVIDConstants.DOC_PATH);
        MiscUtils.sleep(1000);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        CommonUtils.click(createNewSubmissionPage.submitButton);
        CommonUtils.click(createNewSubmissionPage.popUpConfirmationYesButton);
        MiscUtils.sleep(3000);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        MiscUtils.sleep(3000);
        CommonUtils.click(createNewSubmissionPage.popUpSubmissionConfirmationOkButton);
    }

    /**
     * This method will fill out required fields of Submission
     *
     */
    public static void filingOutAllRequiredFieldsOfSubmission() {
        MiscUtils.sleep(1000);
        nerdCrsKnowledgeDatabaseSubmissionsPage.topAccomplishmentFiscalYear2019.click();
        MiscUtils.sleep(2000);
        CommonUtils.sendKeys(nerdCrsKnowledgeDatabaseSubmissionsPage.topAccomplishmentTitle, TopAccomplishmentsSubmission_Constants.TOP_ACCOMPLISHMENTS_SUBMISSION_NAME);
        MiscUtils.sleep(2000);
        CommonUtils.selectDropDownValue(createNewSubmissionPage.leadDOCDropDown, TopAccomplishmentsSubmission_Constants.TOP_ACCOMPLISHMENTS_DOC_DROPDOWN);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        MiscUtils.sleep(4000);
        CommonUtils.switchToFrame(createNewSubmissionPage.DescriptionTextBoxIframe);
        createNewSubmissionPage.DescriptionTextBox.sendKeys(TopAccomplishmentsSubmission_Constants.TOP_ACCOMPLISHMENTS_DESCRIPTION_TEXT_BOX);
        MiscUtils.sleep(2000);
        WebDriverUtils.webDriver.switchTo().defaultContent();
        MiscUtils.sleep(2000);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        MiscUtils.sleep(2000);
        JavascriptUtils.scrollIntoView(nerdCrsKnowledgeDatabaseSubmissionsPage.topAccomplishmentResearchType);
        MiscUtils.sleep(2000);
        CommonUtils.selectDropDownValue(nerdCrsKnowledgeDatabaseSubmissionsPage.topAccomplishmentResearchType,
                TopAccomplishmentsSubmission_Constants.TOP_ACCOMPLISHMENTS_RESEARCH_TYPE);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
    }

    /**
     * This method will select Other OM Content
     *
     * @param otherOmContent
     */
    public static void selectingOfOtherOM_Content(String otherOmContent) {
        MiscUtils.sleep(1000);
        CommonUtils.waitForVisibility(nerdCrsKnowledgeDatabaseSubmissionsPage.otherOmContentText);
        MiscUtils.sleep(1000);
        CommonUtils.assertTrue(nerdCrsKnowledgeDatabaseSubmissionsPage.otherOmContentText.getText().equals(otherOmContent));
        nerdCrsKnowledgeDatabaseSubmissionsPage.otherOmContentText.click();
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
    }

    /**
     * This method will verify that Please Specify Field is displayed
     *
     * @param omContentTypeOtherPleaseSpecify
     */
    public static void pleaseSpecifyFieldIsDisplayed(String omContentTypeOtherPleaseSpecify) {
        MiscUtils.sleep(1000);
        CommonUtils.waitForVisibility(nerdCrsKnowledgeDatabaseSubmissionsPage.omContentTypeOtherPleaseSpecifyText);
        CommonUtils.assertTrue(nerdCrsKnowledgeDatabaseSubmissionsPage.omContentTypeOtherPleaseSpecifyText.isDisplayed());
        CommonUtils.assertTrue(nerdCrsKnowledgeDatabaseSubmissionsPage.omContentTypeOtherPleaseSpecifyText.getText()
                .contentEquals(omContentTypeOtherPleaseSpecify));
        JavascriptUtils.drawBlueBorder(nerdCrsKnowledgeDatabaseSubmissionsPage.omContentTypeOtherPleaseSpecifyText);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
    }

    /**
     * This method will delete created Submission by Program Staff
     *
     * @param submissionName
     */
    public static void deleteCreatedSubmissionByProgramStaff(String submissionName) throws TestingException {
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("nativeview"));
        MiscUtils.sleep(2000);
        nativeViewDashPage.clickNativeViewLink();
        MiscUtils.sleep(5000);
        nativeViewDashPage.clickUserDropDown();
        MiscUtils.sleep(2000);
        nativeViewDashPage.clickImpersonateUserLink();
        MiscUtils.sleep(2000);
        nativeViewDashPage.clickImpersonateSearchDD();
        MiscUtils.sleep(2000);
        nativeViewDashPage.enterTextImpersntSearchBox(ReturningSubmissions_Constants.CBIIT_TEST_ACCOUNT_TEXT);
        MiscUtils.sleep(5000);
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));
        WebDriverUtils.webDriver.navigate().refresh();
        MiscUtils.sleep(5000);
        nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink.click();
        JavascriptUtils.scrollIntoView(nerdDynamicXpaths.deleteButtonReturnedToStaffMember(submissionName));
        nerdDynamicXpaths.deleteButtonReturnedToStaffMember(submissionName).click();
        MiscUtils.sleep(1000);
        JavascriptUtils.clickByJS(nerdCrsKnowledgeDatabaseSubmissionsPage.confirmDeleteYesButton);
        MiscUtils.sleep(1000);
        nerdCrsKnowledgeDatabaseSubmissionsPage.popUpOKbutton.click();
        MiscUtils.sleep(1000);
    }

    /**
     * This method will verify Options to Submit, Edit and Delete of created
     * Submission
     *
     */
    public static void submissionOptions_SubmitEditDelete_areAvailable() {
        WebDriverUtils.webDriver.navigate().refresh();
        CommonUtils.assertEquals(ReturningSubmissions_Constants.BOOTSTRAP_DROPDOWN_SELECT_SUBMISSIONS, nerdCrsKnowledgeDatabaseSubmissionsPage.topSubmisionsName.getText());
        MiscUtils.sleep(2000);
        JavascriptUtils.clickByJS(nerdCrsKnowledgeDatabaseSubmissionsPage.topAccomplishmentSubmissionsPageLink);
        MiscUtils.sleep(2000);
        CommonUtils.assertTrue(nerdDynamicXpaths.submitToCRSButton(TopAccomplishmentsSubmission_Constants.TOP_ACCOMPLISHMENTS_SUBMISSION_NAME).isDisplayed());
        CommonUtils.assertTrue(nerdDynamicXpaths.submitToCRSButton(TopAccomplishmentsSubmission_Constants.TOP_ACCOMPLISHMENTS_SUBMISSION_NAME).isEnabled());
        JavascriptUtils.drawBlueBorder(nerdDynamicXpaths.submitToCRSButton(TopAccomplishmentsSubmission_Constants.TOP_ACCOMPLISHMENTS_SUBMISSION_NAME));
        CommonUtils.assertEquals("Submit", nerdDynamicXpaths.submitToCRSButton(TopAccomplishmentsSubmission_Constants.TOP_ACCOMPLISHMENTS_SUBMISSION_NAME).getText());
        CommonUtils.assertTrue(nerdDynamicXpaths.eiditCRSButton(TopAccomplishmentsSubmission_Constants.TOP_ACCOMPLISHMENTS_SUBMISSION_NAME).isDisplayed());
        CommonUtils.assertTrue(nerdDynamicXpaths.eiditCRSButton(TopAccomplishmentsSubmission_Constants.TOP_ACCOMPLISHMENTS_SUBMISSION_NAME).isEnabled());
        JavascriptUtils.drawBlueBorder(nerdDynamicXpaths.eiditCRSButton(TopAccomplishmentsSubmission_Constants.TOP_ACCOMPLISHMENTS_SUBMISSION_NAME));
        CommonUtils.assertEquals("Edit", nerdDynamicXpaths.eiditCRSButton(TopAccomplishmentsSubmission_Constants.TOP_ACCOMPLISHMENTS_SUBMISSION_NAME).getText());
        CommonUtils.assertTrue(nerdDynamicXpaths.deleteCRSButton(TopAccomplishmentsSubmission_Constants.TOP_ACCOMPLISHMENTS_SUBMISSION_NAME).isDisplayed());
        CommonUtils.assertTrue(nerdDynamicXpaths.deleteCRSButton(TopAccomplishmentsSubmission_Constants.TOP_ACCOMPLISHMENTS_SUBMISSION_NAME).isEnabled());
        JavascriptUtils.drawBlueBorder(nerdDynamicXpaths.deleteCRSButton(TopAccomplishmentsSubmission_Constants.TOP_ACCOMPLISHMENTS_SUBMISSION_NAME));
        CommonUtils.assertEquals("Delete", nerdDynamicXpaths.deleteCRSButton(TopAccomplishmentsSubmission_Constants.TOP_ACCOMPLISHMENTS_SUBMISSION_NAME).getText());
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        MiscUtils.sleep(2000);
        CommonUtils.click(nerdDynamicXpaths.deleteCRSButton(TopAccomplishmentsSubmission_Constants.TOP_ACCOMPLISHMENTS_SUBMISSION_NAME));
        MiscUtils.sleep(2000);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        CommonUtils.click(createNewSubmissionPage.crsKnowledgeManagementSystemConfirmDeleteButton);
        MiscUtils.sleep(2000);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        CommonUtils.click(createNewSubmissionPage.informationDialogPopUpOKbutton);
        MiscUtils.sleep(2000);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
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
        MiscUtils.sleep(2000);
        Set<String> allWindowHandles1 = WebDriverUtils.webDriver.getWindowHandles();
        for (String currentWindow1 : allWindowHandles1) {
            WebDriverUtils.webDriver.switchTo().window(currentWindow1);
        }
        MiscUtils.sleep(1000);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        CommonUtils.waitForVisibility(createNewSubmissionPage.pleaseSpecifyText);
        CommonUtils.assertTrue(createNewSubmissionPage.pleaseSpecifyText.getText().contentEquals(PleaseSpecify));
        JavascriptUtils.drawBlueBorder(createNewSubmissionPage.pleaseSpecifyAsterisk);
        if (!createNewSubmissionPage.pleaseSpecifyDropDown.isSelected()) {
            CommonUtils.selectDropDownValue("Edited", createNewSubmissionPage.pleaseSpecifyDropDown);
            MiscUtils.sleep(1000);
        }
        CommonUtils.assertTrue(createNewSubmissionPage.fiscalYearText.getText().contentEquals(FiscalYear));
        JavascriptUtils.drawBlueBorder(createNewSubmissionPage.fiscalYearAsterisk);
        if (!createNewSubmissionPage.fiscalYearDropDown.isSelected()) {
            CommonUtils.selectDropDownValue("2024", createNewSubmissionPage.fiscalYearDropDown);
            MiscUtils.sleep(1000);
        }
        MiscUtils.sleep(1000);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        createNewSubmissionPage.cancelButton.click();
    }

    /**
     * This method will verify required fields of Submission are NOT cleared and
     * required
     *
     */
    public static void verifyingThatFieldsOfSubmissionAreNotClearedAndRequired() {
        JavascriptUtils.scrollIntoView(nerdCrsKnowledgeDatabaseSubmissionsPage.pleaseSpecifyHeaderText);
        CommonUtils.assertTrue(nerdCrsKnowledgeDatabaseSubmissionsPage.pleaseSpecifyDropDownEditedOption.isSelected()
                && nerdCrsKnowledgeDatabaseSubmissionsPage.pleaseSpecifyDropDownEditedOption.isDisplayed());
        MiscUtils.sleep(1000);
        CommonUtils.assertTrue(
                nerdCrsKnowledgeDatabaseSubmissionsPage.pleaseSpecifyDropDownEditedOption.getText().equals("Edited"));
        JavascriptUtils.drawBlueBorder(nerdCrsKnowledgeDatabaseSubmissionsPage.pleaseSpecifyHeaderText);
        MiscUtils.sleep(1000);
        CommonUtils.assertTrue(nerdCrsKnowledgeDatabaseSubmissionsPage.fiscalYearDropDown2024Option.isSelected()
                && nerdCrsKnowledgeDatabaseSubmissionsPage.fiscalYearDropDown2024Option.isDisplayed());
        MiscUtils.sleep(1000);
        CommonUtils.assertTrue(
                nerdCrsKnowledgeDatabaseSubmissionsPage.fiscalYearDropDown2024Option.getText().equals("2024"));
        JavascriptUtils.drawBlueBorder(nerdCrsKnowledgeDatabaseSubmissionsPage.fiscalYearHeaderText);
        MiscUtils.sleep(1000);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        JavascriptUtils.scrollIntoView(nerdCrsKnowledgeDatabaseSubmissionsPage.collaborationsCategorySaveButton);
        nerdCrsKnowledgeDatabaseSubmissionsPage.collaborationsCategorySaveButton.click();
        nerdCrsKnowledgeDatabaseSubmissionsPage.collaborationCategoryYesButton.click();
        nerdCrsKnowledgeDatabaseSubmissionsPage.collaborationCategoryOkButton.click();
        MiscUtils.sleep(1000);
    }

    /**
     * This method will select required fields of Submission
     *
     * @param PleaseSpecify
     * @param FiscalYear
     */
    public static void selectingPleaseRequiredValues(String PleaseSpecify, String FiscalYear) {
        MiscUtils.sleep(1000);
        CommonUtils.waitForVisibility(createNewSubmissionPage.pleaseSpecifyDropDown);
        CommonUtils.selectDropDownValue("Edited", createNewSubmissionPage.pleaseSpecifyDropDown);
        CommonUtils.selectDropDownValue("2022", createNewSubmissionPage.fiscalYearDropDown);
        MiscUtils.sleep(1000);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
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
    public static void verifyingAvailableOptionsOfSubmission(String submissionName, String PleaseSpecify, String Edited,
            String NocChange,
            String Ended, String NotLedByNCI) {
        WebDriverUtils.webDriver.navigate().refresh();
        MiscUtils.sleep(5000);
        nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink.click();
        nerdDynamicXpaths.editButtonReturnedToStaffMember(submissionName).click();
        MiscUtils.sleep(2000);
        Set<String> allWindowHandles1 = WebDriverUtils.webDriver.getWindowHandles();
        for (String currentWindow1 : allWindowHandles1) {
            WebDriverUtils.webDriver.switchTo().window(currentWindow1);
        }
        CommonUtils.assertTrue(createNewSubmissionPage.pleaseSpecifyText.getText().contentEquals(PleaseSpecify));
        MiscUtils.sleep(1000);
        String[] exp = { Edited, NocChange, Ended, NotLedByNCI };

        for (WebElement act : createNewSubmissionPage.pleaseSpecifyDropDownValues) {
            boolean match = false;
            for (int i = 0; i < exp.length; i++) {
                if (act.getText().equals(exp[i])) {
                    match = true;
                    CommonUtils.selectDropDownValue(createNewSubmissionPage.pleaseSpecifyDropDown, exp[i]);
                    JavascriptUtils.drawBlueBorder(createNewSubmissionPage.pleaseSpecifyDropDown);
                    MiscUtils.sleep(1000);
                    CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
                }
            }
            Assert.assertTrue(match);
        }
        MiscUtils.sleep(1000);
        createNewSubmissionPage.cancelButton.click();
    }

    /**
     * This method will verify Submission is Under Review
     *
     * @param submissionName
     * @param UnderReview
     */
    public static void verifyingSubmissionIsUnderReview(String submissionName, String UnderReview) {
        MiscUtils.sleep(1000);
        JavascriptUtils.scrollIntoView(
                nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink);
        nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink.click();
        JavascriptUtils
                .scrollIntoView(nerdDynamicXpaths.publishedCollaboration(submissionName));
        MiscUtils.sleep(1000);
        CommonUtils.assertTrue(nerdDynamicXpaths.underReviewText(submissionName).getText()
                .equals(UnderReview));
        JavascriptUtils.drawBlueBorder(nerdDynamicXpaths.underReviewText(submissionName));
        MiscUtils.sleep(1000);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
    }

    /**
     * This method will verify Submission is Returned to Staff Member
     *
     * @param submissionName
     * @param ReturnedToStaffMember
     */
    public static void verifyingReturnedToStaffMemberStatus(String submissionName, String ReturnedToStaffMember) {
        MiscUtils.sleep(2000);
        JavascriptUtils.scrollIntoView(nerdDynamicXpaths.returnedToStaffMemberTextVerification(submissionName));
        CommonUtils.assertTrue(nerdDynamicXpaths.returnedToStaffMemberTextVerification(submissionName).getText()
                .contentEquals(ReturnedToStaffMember));
        MiscUtils.sleep(2000);
        JavascriptUtils.drawBlueBorder(nerdDynamicXpaths.returnedToStaffMemberTextVerification(submissionName));
        MiscUtils.sleep(2000);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
    }

    /**
     * This method will verify Submission is Returned to DOC Planing Contact
     *
     * @param submissionName
     * @param ReturnedToDOCPlaningContact
     */
    public static void verifyingReturnedDOCStatus(String submissionName, String ReturnedToDOCPlaningContact) {
        WebDriverUtils.refreshPage(WebDriverUtils.webDriver);
        MiscUtils.sleep(2000);
        JavascriptUtils.scrollIntoView(
                nerdDynamicXpaths.returnedToDOCText(submissionName));
        CommonUtils.waitForVisibility(nerdDynamicXpaths.returnedToDOCTextCRS(ReturnedToDOCPlaningContact));
        MiscUtils.sleep(2000);
        CommonUtils.assertTrue(
                nerdDynamicXpaths.returnedToDOCTextCRS(ReturnedToDOCPlaningContact).getText()
                        .contentEquals(ReturnedToDOCPlaningContact));
        JavascriptUtils.drawRedBorder(nerdDynamicXpaths.returnedToDOCTextCRS(ReturnedToDOCPlaningContact));
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        MiscUtils.sleep(2000);
    }

    /**
     * This method will verify the version number of Submission
     *
     * @param versionNumber
     */
    public static void verifyingArticleVersionNumber(String versionNumber) {
        JavascriptUtils.refreshPage(WebDriverUtils.webDriver);
        nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemHomePageHOMEButton.click();
        nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemHomePageNERDButton.click();
        MiscUtils.sleep(7000);
        nerdCrsKnowledgeDatabaseSubmissionsPage.collaborationsList.click();
        MiscUtils.sleep(1000);
        JavascriptUtils.clickByJS(nerdDynamicXpaths.publishedCollaboration(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_VERSION_NUMBER));
        CommonUtils.switchToAnotherWindow();
        MiscUtils.sleep(1000);
        Assert.assertTrue(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_VERSION_NUMBER,
                nerdCrsKnowledgeDatabaseSubmissionsPage.collaborationsVersionNumber1.getText().trim()
                        .contentEquals(versionNumber));
        JavascriptUtils.drawBlueBorder(nerdCrsKnowledgeDatabaseSubmissionsPage.collaborationsVersionNumber1);
        MiscUtils.sleep(5000);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
    }

    /**
     * This method will verify incremented version number of Submission
     *
     * @param versionNumber
     */
    public static void verifyingIncrementedArticleVersionNumber(String versionNumber) {
        JavascriptUtils.refreshPage(WebDriverUtils.webDriver);
        nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemHomePageHOMEButton.click();
        nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemHomePageNERDButton.click();
        MiscUtils.sleep(7000);
        nerdCrsKnowledgeDatabaseSubmissionsPage.collaborationsList.click();
        MiscUtils.sleep(2000);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        JavascriptUtils.clickByJS(nerdDynamicXpaths.publishedCollaboration(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_VERSION_NUMBER));
        CommonUtils.switchToAnotherWindow();
        MiscUtils.sleep(1000);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        Assert.assertTrue(nerdCrsKnowledgeDatabaseSubmissionsPage.collaborationsVersionNumber2.getText().contentEquals(versionNumber));
        JavascriptUtils.drawBlueBorder(nerdCrsKnowledgeDatabaseSubmissionsPage.collaborationsVersionNumber2);
        MiscUtils.sleep(5000);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
    }

    /**
     * This method will verify the original author of created Submission
     *
     * @param submissionName
     */
    public static void verifyingTheAuthorOfCreatedSubmission(String submissionName) {
        String authorExpected = nerdDynamicXpaths.authorTextDocSubmission(submissionName).getText();
        MiscUtils.sleep(3000);
        Assert.assertEquals(authorExpected, nerdDynamicXpaths.authorTextDocSubmission(submissionName).getText());
        MiscUtils.sleep(3000);
        JavascriptUtils.scrollUp(300);
        MiscUtils.sleep(3000);
        JavascriptUtils.drawBlueBorder(nerdDynamicXpaths.authorTextDocSubmission(submissionName));
        MiscUtils.sleep(5000);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        MiscUtils.sleep(5000);
    }

    /**
     * This method will click on "Yes" button when returning Submission
     *
     * @param buttonName
     */
    public static void clickingOnYESButtonWhenReturningCollaboration(String buttonName) {
        CommonUtils.assertTrue(
                nerdCrsKnowledgeDatabaseSubmissionsPage.confirmReturnYesButton.getText().equals(buttonName));
        MiscUtils.sleep(1000);
        nerdCrsKnowledgeDatabaseSubmissionsPage.confirmReturnYesButton.click();
        CommonUtils.waitForVisibility(nerdCrsKnowledgeDatabaseSubmissionsPage.submissionSuccessfullyPopUpOkButton);
        nerdCrsKnowledgeDatabaseSubmissionsPage.submissionSuccessfullyPopUpOkButton.click();
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        MiscUtils.sleep(2000);
    }

    /**
     * This method will click on "Edit" button of Submission
     *
     * @param submissionName
     * @param buttonName
     */
    public static void clickingOnEditButtonWhenReturningCollaboration(String submissionName, String buttonName) {
        if (nerdDynamicXpaths.editButton(submissionName).isDisplayed()) {
            JavascriptUtils.scrollIntoView(
                    nerdDynamicXpaths.editButton(submissionName));
            CommonUtils.assertTrue(nerdDynamicXpaths.editButton(submissionName)
                    .getText().equals(buttonName));
            nerdDynamicXpaths.editButton(submissionName).click();
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);

        }
    }

    /**
     * This method will open new Tab to Edit Submission
     *
     * @param submissionName
     */
    public static void openingNewTabToEditSubmission(String submissionName) {
        MiscUtils.sleep(2000);
        Set<String> allWindowHandles1 = WebDriverUtils.webDriver.getWindowHandles();
        for (String currentWindow1 : allWindowHandles1) {
            WebDriverUtils.webDriver.switchTo().window(currentWindow1);
        }
        MiscUtils.sleep(1000);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
    }

    /**
     * This method will click on Save button of Submission
     *
     * @param saveButton
     */
    public static void clickingOnSaveButton(String saveButton) {
        JavascriptUtils.scrollIntoView(createNewSubmissionPage.editedDOCSubmissionSaveButton);
        CommonUtils.assertTrue(createNewSubmissionPage.editedDOCSubmissionSaveButton.getText().equals(saveButton));
        JavascriptUtils.drawBlueBorder(createNewSubmissionPage.editedDOCSubmissionSaveButton);
        MiscUtils.sleep(1000);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        createNewSubmissionPage.editedDOCSubmissionSaveButton.click();
        CommonUtils.waitForVisibility(nerdCrsKnowledgeDatabaseSubmissionsPage.submissionSuccessfullyPopUpOkButton);
        nerdCrsKnowledgeDatabaseSubmissionsPage.submissionSuccessfullyPopUpOkButton.click();
    }

    /**
     * This method will click on Submit button of Submission
     *
     * @param submissionName
     * @param buttonName
     */
    public static void clickingOnSubmitButton(String submissionName, String buttonName) {
        JavascriptUtils.scrollIntoView(nerdDynamicXpaths
                .submitButtonToDOCPlanningContact(submissionName));
        nerdDynamicXpaths.submitButtonToDOCPlanningContact(submissionName)
                .click();
        MiscUtils.sleep(1000);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
    }

    /**
     * This method will click on confirmation button of Submission
     *
     */
    public static void confirmingSubmission() {
        createNewSubmissionPage.popUpConfirmationYesButton.click();
        CommonUtils.waitForVisibility(nerdCrsKnowledgeDatabaseSubmissionsPage.submissionSuccessfullyPopUpOkButton);
        nerdCrsKnowledgeDatabaseSubmissionsPage.submissionSuccessfullyPopUpOkButton.click();
    }

    /**
     * This method will click on Collaborations Link
     *
     */
    public static void clickingOnCollaborationsLink() {
        CommonUtils.waitForVisibility(
                nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink);
        nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink.click();
    }

    /**
     * This method will edit and resubmit the existing Submission by DOC Planing
     * Contact to CRS Reviewer
     *
     * @param submissionName
     */
    public static void editAndResubmittingOfSubmissionByDOCContactToCRSREviewer(String submissionName)
            throws TestingException {
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
        CommonUtils.waitForVisibility(nerdCrsKnowledgeDatabaseSubmissionsPage.submissionSuccessfullyPopUpOkButton);
        nerdCrsKnowledgeDatabaseSubmissionsPage.submissionSuccessfullyPopUpOkButton.click();
        CommonUtils.waitForVisibility(
                nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink);
        nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink.click();
        JavascriptUtils.scrollIntoView(
                nerdDynamicXpaths.submitToCRSButton(submissionName));
        CommonUtils.assertTrue(
                nerdDynamicXpaths.submitToCRSButton(submissionName)
                        .getText().equals("Submit to CRS"));
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        MiscUtils.sleep(1000);
        nerdDynamicXpaths.submitToCRSButton(submissionName).click();
        CommonUtils.waitForVisibility(nerdCrsKnowledgeDatabaseSubmissionsPage.confirmPopUpWindowYESbutton);
        JavascriptUtils.scrollIntoView(nerdCrsKnowledgeDatabaseSubmissionsPage.confirmPopUpWindowYESbutton);
        nerdCrsKnowledgeDatabaseSubmissionsPage.confirmPopUpWindowYESbutton.click();
        CommonUtils.waitForVisibility(nerdCrsKnowledgeDatabaseSubmissionsPage.submissionSuccessfullyPopUpOkButton);
        nerdCrsKnowledgeDatabaseSubmissionsPage.submissionSuccessfullyPopUpOkButton.click();
        MiscUtils.sleep(1000);
    }

    /**
     * This method will redirect user to a Submissions Page
     *
     */
    public static void redirectingToSubmissionsPage() {
        CommonUtils.waitForVisibility(
                nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageSubmissionsLink);
        CommonUtils.assertTrue(
                nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageSubmissionsLink
                        .isDisplayed());
        JavascriptUtils.drawRedBorder(
                nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageSubmissionsLink);
        MiscUtils.sleep(1000);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);

    }

    /**
     * This method will submit the Collaboration to CRS Reviewer
     *
     * @param submissionName
     */
    public static void submittingOfCollaborationToCRSReviewer(String submissionName) {
        CommonUtils.waitForVisibility(
                nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink);
        MiscUtils.sleep(3000);
        nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink.click();
        JavascriptUtils.scrollIntoView(
                nerdDynamicXpaths.submitToCRSButton(ReturningSubmissions_Constants.SUBMIT_TO_CRS_BUTTON));
        MiscUtils.sleep(1500);
        nerdDynamicXpaths.submitToCRSButton(ReturningSubmissions_Constants.SUBMIT_TO_CRS_BUTTON).click();
        nerdCrsKnowledgeDatabaseSubmissionsPage.confirmPopUpWindowYESbutton.click();
        CommonUtils.waitForVisibility(nerdCrsKnowledgeDatabaseSubmissionsPage.submissionSuccessfullyPopUpOkButton);
        nerdCrsKnowledgeDatabaseSubmissionsPage.submissionSuccessfullyPopUpOkButton.click();
    }

    /**
     * This method will select user from DropDown
     *
     * @param user
     */
    public static void selectingMemberFromUserDropDown(String user) {
        CommonUtils.waitForVisibility(nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNtoStaffPopUpWindowDropDown);
        nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNtoStaffPopUpWindowDropDown.click();
        nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNtoStaffPopUpWindowForSearchStaffMemberTextField
                .sendKeys(user);

        MiscUtils.sleep(2000);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
    }

    /**
     * This method will send a comment to a Member when returning Collaboration
     *
     * @param comment
     */
    public static void enteringACommentWhenReturningCollaboration(String comment) {
        MiscUtils.sleep(2000);
        nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNtoStaffPopUpWindowResultsTextField.click();
        MiscUtils.sleep(2000);
        nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNtoStaffPopUpWindowTextField
                .sendKeys(comment);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
    }

}
