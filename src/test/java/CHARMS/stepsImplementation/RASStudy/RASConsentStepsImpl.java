package CHARMS.stepsImplementation.RASStudy;

import APPS_COMMON.PageInitializers.PageInitializer;
import APPS_COMMON.Utils.ServiceNow_Login_Methods;
import CHARMS.constants.CHARMSRASScreenerConstants;
import CHARMS.pages.MyRASHomePage;
import CHARMS.steps.RAS_All_Steps;
import CHARMS.steps.RAS_Common_Methods;
import CHARMS.utils.CharmsUtil;
import Hooks.Hooks;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.CommonUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import static APPS_COMMON.Pages.Selenium_Common_Locators.locateByXpath;
import static CHARMS.steps.RAS_All_Steps.*;
import static CHARMS.steps.RAS_Common_Methods.navigateToParticipantRecordInNativeView;
import static CHARMS.steps.RAS_Common_Methods.submitParticipantForReviewAndEligibility;
import static Hooks.Hooks.softAssert;

public class RASConsentStepsImpl extends PageInitializer {

    /**
     * This method presses the Sign and Complete button in the Consent form.
     */
    public void study_team_member_presses_the_sign_and_complete_button() {
        CucumberLogUtils.scenario.log("* * * * * COMPLETE CONSENT * * * * *");
        nativeViewCHARMSParticipantConsentPage.rasStudyConsentCompleteConsentButton.click();
        CommonUtils.sleep(2000);
        CommonUtils.waitForVisibility(locateByXpath("//div[@class='outputmsg_text']"));
        CucumberLogUtils.logScreenshot();
    }

    /**
     * Completes the re-consent process for a study team member using a specified collection method.
     *
     * @param sheetName the name of the sheet to retrieve relevant data or configurations
     */
    public void study_team_member_completes_re_consent_with_as_the_collection_method(String sheetName, String collectionMethod) {
        boolean reConsentButtonPresent;
        ras_Screener_TestDataManager.dataInitializerRasScreener(sheetName);
        ras_NV_Consent_Record_TestDataManager.dataInitializerRasConsentRecord(sheetName, collectionMethod);
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        navigateToParticipantRecordInNativeView(sheetName);
        openParticipantStudyRecord();
        try {
            nativeViewCHARMSParticipantStudyPage.reConsentButton.click();
            reConsentButtonPresent = true;
        } catch (NoSuchElementException e) {
            reConsentButtonPresent = false;
        }
        softAssert.assertTrue(reConsentButtonPresent, "---- RECONSENT BUTTON SHOULD NOT DISPLAY IN PS RECORD ----");
        nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsConsentsTab.click();
        nativeViewCHARMSParticipantStudyPage.newConsentButton.click();
        CommonUtils.sleep(800);
        consentFlowProcess();
    }

    /**
     * THIS METHOD WILL CLICK ON TABS LOCATED IN NATIVE VIEW RECORDS.
     *
     * @param tabCaptionText the text of the tab to be clicked
     */
    public static void clicksTab(String tabCaptionText) {
        RAS_Common_Methods.dynamicTabLocator(tabCaptionText).click();
        CommonUtils.sleep(600);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * Verifies that the Preview Study Consent tile is displayed in the portal after a consent call is completed.
     *
     * @param sheetName the name of the sheet containing test data for the consent call
     * @param username  the participant's username for logging into the portal
     * @param password  the participant's password for logging into the portal
     */
    public void completes_consent_call_and_verifies_consent_preview_tile(String sheetName, String username, String password) {
        ras_Screener_TestDataManager.dataInitializerRasScreener(sheetName);
        ras_NV_Consent_Record_TestDataManager.dataInitializerRasConsentRecord(sheetName, "CHARMS e-consent");
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        navigateToParticipantRecordInNativeView(sheetName);
        submitParticipantForReviewAndEligibility();
        openConsentRecord();
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeCalendar);
        CucumberLogUtils.logScreenshot();
        CucumberLogUtils.scenario.log("* * * * CONSENT DATE * * * *");
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentDateCalendar);
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeTodayButton);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeTodayButton);
        CucumberLogUtils.scenario.log("* * * * CONSENTED BY * * * *");
        CommonUtils.waitForClickability(nativeViewCHARMSParticipantConsentPage.rasStudyConsentByTextBox);
        CommonUtils.sendKeys(nativeViewCHARMSParticipantConsentPage.rasStudyConsentByTextBox, CHARMSRASScreenerConstants.CONSENTED_BY_USER_NAME);
        CommonUtils.sendKeys(nativeViewCHARMSParticipantConsentPage.rasStudyConsentByTextBox, Keys.ENTER);
        clicksTab("Consent Call");
        CucumberLogUtils.scenario.log("* * * * CONSENT CALL - CONSENT CALL SCHEDULED TIME * * * *");
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeCalendar);
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeTodayButton);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeTodayButton);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeAcceptButton);
        CommonUtils.sleep(600);
        CucumberLogUtils.scenario.log("* * * * CONSENT CALL - CONSENT CALL DATE * * * *");
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleDateCalendar);
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeTodayButton);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeTodayButton);
        CucumberLogUtils.scenario.log("* * * * CONSENT CALL - COLLECTION METHOD * * * *");
        CommonUtils.selectDropDownValue(ras_NV_Consent_Record_TestDataManager.COLLECTION_METHOD, nativeViewCHARMSParticipantConsentPage.rasStudyConsentCollectionMethodDropDown);
        CommonUtils.sleep(500);
        CucumberLogUtils.logScreenshot();
        clicksTab("Consent Information");
        CommonUtils.sleep(500);
        CucumberLogUtils.scenario.log("* * * * CONSENT INFORMATION - CONSENT CALL VERSION * * * *");
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleVersionCalendarButton);
        CommonUtils.waitForClickability(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleVersionCalendarButton);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleVersionCalendarButton);
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeTodayButton);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeTodayButton);
        CommonUtils.sleep(500);
        if (ras_NV_Consent_Record_TestDataManager.CONSENT_ASSENT_CATEGORY.equalsIgnoreCase("Under 7") || ras_NV_Consent_Record_TestDataManager.CONSENT_ASSENT_CATEGORY.equalsIgnoreCase("Aged 7 - 10, verbal assent required") || ras_NV_Consent_Record_TestDataManager.CONSENT_ASSENT_CATEGORY.equalsIgnoreCase("Aged 14 - 17, signed consent required")) {
            CucumberLogUtils.scenario.log("* * * * CONSENT INFORMATION - PARENT/GUARDIAN STATUS * * * *");
            CommonUtils.selectDropDownValue(ras_NV_Consent_Record_TestDataManager.PARENT_GUARDIAN_STATUS, nativeViewCHARMSParticipantConsentPage.rasStudyConsentParentGuardianStatusDropDown);
            if (ras_NV_Consent_Record_TestDataManager.PARENT_GUARDIAN_STATUS.equalsIgnoreCase("Parents, Married") || ras_NV_Consent_Record_TestDataManager.PARENT_GUARDIAN_STATUS.equalsIgnoreCase("Parent, Separated or Widowed - Single Custody") || ras_NV_Consent_Record_TestDataManager.PARENT_GUARDIAN_STATUS.equalsIgnoreCase("Other Legal Guardian - 1")) {
                CucumberLogUtils.scenario.log("* * * * CONSENT INFORMATION - PARENT/GUARDIAN 1 SIGNED * * * *");
                CommonUtils.selectDropDownValue(ras_NV_Consent_Record_TestDataManager.PARENT_GUARDIAN_1_SIGNED, nativeViewCHARMSParticipantConsentPage.rasStudyConsentParentGuardian1SignedDropDown);
                CucumberLogUtils.scenario.log("* * * * CONSENT INFORMATION - PARENT/GUARDIAN 1 NAME * * * *");
                CommonUtils.waitForClickability(nativeViewCHARMSParticipantConsentPage.rasStudyConsentParentGuardian1NameTextField);
                CommonUtils.sendKeys(nativeViewCHARMSParticipantConsentPage.rasStudyConsentParentGuardian1NameTextField, ras_NV_Consent_Record_TestDataManager.PARENT_GUARDIAN_1_NAME);
            } else if (ras_NV_Consent_Record_TestDataManager.PARENT_GUARDIAN_STATUS.equalsIgnoreCase("Parents, Separated - Joint Custody") || ras_NV_Consent_Record_TestDataManager.PARENT_GUARDIAN_STATUS.equalsIgnoreCase("Other Guardian - 2")) {
                CucumberLogUtils.scenario.log("* * * * CONSENT INFORMATION - PARENT/GUARDIAN 1 SIGNED * * * *");
                CommonUtils.selectDropDownValue(ras_NV_Consent_Record_TestDataManager.PARENT_GUARDIAN_1_SIGNED, nativeViewCHARMSParticipantConsentPage.rasStudyConsentParentGuardian1SignedDropDown);
                CommonUtils.sleep(500);
                CucumberLogUtils.scenario.log("* * * * ENTERS PARENT/GUARDIAN 1 NAME * * * *");
                CommonUtils.waitForClickability(nativeViewCHARMSParticipantConsentPage.rasStudyConsentParentGuardian1NameTextField);
                CommonUtils.sendKeys(nativeViewCHARMSParticipantConsentPage.rasStudyConsentParentGuardian1NameTextField, ras_NV_Consent_Record_TestDataManager.PARENT_GUARDIAN_1_NAME);
                CucumberLogUtils.scenario.log("* * * * CONSENT INFORMATION - PARENT/GUARDIAN 2 SIGNED * * * *");
                CommonUtils.selectDropDownValue(ras_NV_Consent_Record_TestDataManager.PARENT_GUARDIAN_2_SIGNED, nativeViewCHARMSParticipantConsentPage.rasStudyConsentParentGuardian2SignedDropDown);
                CommonUtils.sleep(500);
                CucumberLogUtils.scenario.log("* * * * ENTERS PARENT/GUARDIAN 2 NAME * * * *");
                CommonUtils.waitForClickability(nativeViewCHARMSParticipantConsentPage.rasStudyConsentParentGuardian2NameTextField);
                CommonUtils.sendKeys(nativeViewCHARMSParticipantConsentPage.rasStudyConsentParentGuardian2NameTextField, ras_NV_Consent_Record_TestDataManager.PARENT_GUARDIAN_2_NAME);
            }
        }
        CommonUtils.sleep(500);
        CucumberLogUtils.logScreenshot();
        CucumberLogUtils.scenario.log("* * * * * * * * * * SAVE - CONSENT CALL SCHEDULED * * * * * * * * * * ");
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.saveButton);
        CommonUtils.sleep(1000);
        CucumberLogUtils.logScreenshot();
        RAS_All_Steps.nativeViewStudyTeamMemberLogsOut();
        CommonUtils.sleep(1000);
        ras_screenerSubmissions_stepsImpl.navigateToRASopathiesLongitudinalCohortStudyLoginPage("myRASLoginPage");
        CommonUtils.sleep(1000);
        ras_screenerSubmissions_stepsImpl.logsInViaOktaWithUsernameAndPassword(username, password);
        softAssert.assertTrue(MyRASHomePage.dynamicModuleLocator("Preview Study Consent").isDisplayed(), "---- PREVIEW STUDY CONSENT NOT DISPLAYED ----");
        CommonUtils.sleep(500);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * Verifies that the consent record initialization process is performed correctly
     * using the specified collection method and sheet name.
     *
     * @param sheetName        the name of the data sheet containing test data for initializing the consent record
     * @param collectionMethod the method used to collect consent data (e.g., electronic, paper-based)
     */
    public void verifyConsentRecord(String sheetName, String collectionMethod) {
        ras_Screener_TestDataManager.dataInitializerRasScreener(sheetName);
        ras_NV_Consent_Record_TestDataManager.dataInitializerRasConsentRecord(sheetName, collectionMethod);
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        navigateToParticipantRecordInNativeView(sheetName);
        openConsentRecord();
        CucumberLogUtils.scenario.log("---- VERIFYING PARTICIPANT CONSENT RECORD ----");
        CharmsUtil.verifyLabel("Study");
        CharmsUtil.assertTextBoxData(Hooks.softAssert, nativeViewCHARMSParticipantConsentPage.rasStudyConsentInputField, ras_NV_Consent_Record_TestDataManager.STUDY, "---- PARTICIPANT CONSENT RECORD: STUDY FIELD MISMATCH ----");
        CharmsUtil.verifyLabel("Current/Previous");
        RAS_Common_Methods.softAssertDropDownValueIsSelected(nativeViewCHARMSParticipantConsentPage.rasStudyCurrentPreviousDropDown, ras_NV_Consent_Record_TestDataManager.CURRENT_PREVIOUS, "---- PARTICIPANT CONSENT RECORD: CURRENT/PREVIOUS DROPDOWN MISMATCH ----");
        CharmsUtil.verifyLabel("Created");
        softAssert.assertTrue(nativeViewCHARMSParticipantConsentPage.rasStudyCreatedInputField.getDomAttribute("value").contains("0" + CommonUtils.getCurrentDateIn_MM_DD_YYYY_format()), "---- PARTICIPANT CONSENT RECORD: CREATED FIELD MISMATCH ----");
        CharmsUtil.verifyLabel("Consent Status");
        RAS_Common_Methods.softAssertDropDownValueIsSelected(nativeViewCHARMSParticipantConsentPage.rasStudyConsentStatusTextBox, ras_NV_Consent_Record_TestDataManager.CONSENT_STATUS, "---- PARTICIPANT CONSENT RECORD: CONSENT STATUS FIELD MISMATCH ----");
        CharmsUtil.verifyLabel("Consent Date");
        CharmsUtil.assertTextBoxData(Hooks.softAssert, nativeViewCHARMSParticipantConsentPage.rasStudyConsentDateInputField, "0" + CommonUtils.getCurrentDateIn_MM_DD_YYYY_format(), "---- PARTICIPANT CONSENT RECORD: CONSENT STATUS FIELD MISMATCH ----");
        CharmsUtil.verifyLabel("Consent By");
        CharmsUtil.assertTextBoxData(Hooks.softAssert, nativeViewCHARMSParticipantConsentPage.rasStudyConsentByTextBox, ras_NV_Consent_Record_TestDataManager.CONSENT_BY, "---- PARTICIPANT CONSENT RECORD: CONSENT BY FIELD MISMATCH ----");
        CharmsUtil.verifyLabel("Assigned to");
        CharmsUtil.assertTextBoxData(Hooks.softAssert, nativeViewCHARMSParticipantConsentPage.rasStudyConsentAssignedToTextBox, ras_NV_Consent_Record_TestDataManager.ASSIGNED_TO, "---- PARTICIPANT CONSENT RECORD: ASSIGNED TO FIELD MISMATCH ----");
        CommonUtils.sleep(500);
        CucumberLogUtils.logScreenshot();
        CucumberLogUtils.scenario.log("---- VERIFYING PARTICIPANT CONSENT RECORD DATA: CONSENT CALL TAB ----");
        clicksTab("Consent Call");
        CharmsUtil.verifyLabel("Consent call scheduled time");
        softAssert.assertTrue(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeCalendarInputField.getDomAttribute("value").contains("0" + CommonUtils.getCurrentDateIn_MM_DD_YYYY_format()), "---- CONSENT CALL: CONSENT CALL SCHEDULED TIME FIELD MISMATCH ----");
        CharmsUtil.verifyLabel("Consent Call Date");
        CharmsUtil.assertTextBoxData(Hooks.softAssert, nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallDateInputField, "0" + CommonUtils.getCurrentDateIn_MM_DD_YYYY_format(), "---- CONSENT CALL: CONSENT CALL DATE FIELD MISMATCH ----");
        CharmsUtil.verifyLabel("Collection Method");
        RAS_Common_Methods.softAssertDropDownValueIsSelected(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCollectionMethodDropDown, ras_NV_Consent_Record_TestDataManager.COLLECTION_METHOD, "---- CONSENT CALL: COLLECTION METHOD DROPDOWN MISMATCH ----");
        if (!collectionMethod.equalsIgnoreCase("iMed")) {
            CharmsUtil.verifyLabel("Copy of Consent/Assent Provided Before Signing");
            RAS_Common_Methods.softAssertDropDownValueIsSelected(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCopyOfConsentAssentProvidedDropDown, ras_NV_Consent_Record_TestDataManager.COPY_OF_CONSENT_ASSENT_PROVIDED_BEFORE_SIGNING, "---- CONSENT CALL: COPY OF CONSENT/ASSENT PROVIDED BEFORE SIGNING DROPDOWN MISMATCH ----");
            CharmsUtil.verifyLabel("Protocol Discussed in Private Setting");
            RAS_Common_Methods.softAssertDropDownValueIsSelected(nativeViewCHARMSParticipantConsentPage.rasStudyConsentProtocolDiscussedInPrivateSettingDropDown, ras_NV_Consent_Record_TestDataManager.PROTOCOL_DISCUSSED_IN_PRIVATE_SETTING, "---- CONSENT CALL: PROTOCOL DISCUSSED IN PRIVATE SETTING DROPDOWN MISMATCH ----");
            CharmsUtil.verifyLabel("Participant Verbalized Understanding of Study Conditions and Participation");
            RAS_Common_Methods.softAssertDropDownValueIsSelected(nativeViewCHARMSParticipantConsentPage.rasStudyConsentParticipantVerbalizedUnderstandingOfStudyConditionsAndParticipationDropDown, ras_NV_Consent_Record_TestDataManager.PARTICIPANT_VERBALIZED_UNDERSTANDING_OF_STUDY_CONDITIONS_AND_PARTICIPATION, "---- CONSENT CALL: PARTICIPANT VERBALIZED UNDERSTANDING OF STUDY CONDITIONS AND PARTICIPATION DROPDOWN MISMATCH ----");
            CharmsUtil.verifyLabel("Questions Addressed Before Signing");
            RAS_Common_Methods.softAssertDropDownValueIsSelected(nativeViewCHARMSParticipantConsentPage.rasStudyConsentQuestionsAddressedBeforeSigningDropDown, ras_NV_Consent_Record_TestDataManager.QUESTIONS_ADDRESSED_BEFORE_SIGNING, "---- CONSENT CALL: QUESTIONS ADDRESSED BEFORE SIGNING DROPDOWN MISMATCH ----");
        }
        CommonUtils.sleep(500);
        CucumberLogUtils.logScreenshot();
        CucumberLogUtils.scenario.log("---- VERIFYING PARTICIPANT CONSENT RECORD DATA: CONSENT INFORMATION TAB ----");
        clicksTab("Consent Information");
        CharmsUtil.verifyLabel("Cohort");
        RAS_Common_Methods.softAssertDropDownValueIsSelected(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCohortDropDown, ras_NV_Consent_Record_TestDataManager.COHORT, "---- CONSENT INFORMATION: COHORT DROPDOWN MISMATCH ----");
        CharmsUtil.verifyLabel("Consent Version");
        CharmsUtil.assertTextBoxData(Hooks.softAssert, nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleVersionCalendarInputField, "0" + CommonUtils.getCurrentDateIn_MM_DD_YYYY_format(), "---- CONSENT INFORMATION: CONSENT VERSION FIELD MISMATCH ----");
        CharmsUtil.verifyLabel("Consent/Assent Status");
        RAS_Common_Methods.softAssertDropDownValueIsSelected(nativeViewCHARMSParticipantConsentPage.rasStudyConsentConsentAssentStatusDropDown, ras_NV_Consent_Record_TestDataManager.CONSENT_ASSENT_STATUS, "---- CONSENT INFORMATION: CONSENT/ASSENT STATUS DROPDOWN MISMATCH ----");
        CharmsUtil.verifyLabel("Consent/Assent Category");
        RAS_Common_Methods.softAssertDropDownValueIsSelected(nativeViewCHARMSParticipantConsentPage.rasStudyConsentAssentCategoryDropDown, ras_NV_Consent_Record_TestDataManager.CONSENT_ASSENT_CATEGORY, "---- CONSENT INFORMATION: CONSENT/ASSENT CATEGORY DROPDOWN MISMATCH ----");
        if (!ras_NV_Consent_Record_TestDataManager.COLLECTION_METHOD.equalsIgnoreCase("iMed")) {
            if (ras_NV_Consent_Record_TestDataManager.NUMBER_OF_GUARDIAN_SIGNATURES_REQUIRED.equals("2")) {
                CharmsUtil.verifyLabel("Number of Guardian Signatures required");
                RAS_Common_Methods.softAssertDropDownValueIsSelected(nativeViewCHARMSParticipantConsentPage.rasStudyConsentNumberOfParentGuardianSignaturesRequiredDropDown, ras_NV_Consent_Record_TestDataManager.NUMBER_OF_GUARDIAN_SIGNATURES_REQUIRED, "---- CONSENT INFORMATION: NUMBER OF PARENT/GUARDIAN SIGNATURES REQUIRED DROPDOWN MISMATCH ----");
                CharmsUtil.verifyLabel("Parent/Guardian 1 Signed");
                RAS_Common_Methods.softAssertDropDownValueIsSelected(nativeViewCHARMSParticipantConsentPage.rasStudyConsentParentGuardian1SignedDropDown, ras_NV_Consent_Record_TestDataManager.PARENT_GUARDIAN_1_SIGNED, "---- CONSENT INFORMATION: PARENT/GUARDIAN 1 SIGNED DROPDOWN MISMATCH ----");
                CharmsUtil.verifyLabel("Parent/Guardian 1 Name");
                CharmsUtil.assertTextBoxData(Hooks.softAssert, nativeViewCHARMSParticipantConsentPage.rasStudyConsentParentGuardian1NameTextField, ras_NV_Consent_Record_TestDataManager.PARENT_GUARDIAN_1_NAME, "---- CONSENT INFORMATION: PARENT/GUARDIAN 1 NAME FIELD MISMATCH ----");
                CharmsUtil.verifyLabel("Parent/Guardian 2 Signed");
                RAS_Common_Methods.softAssertDropDownValueIsSelected(nativeViewCHARMSParticipantConsentPage.rasStudyConsentParentGuardian2SignedDropDown, ras_NV_Consent_Record_TestDataManager.PARENT_GUARDIAN_2_SIGNED, "---- CONSENT INFORMATION: PARENT/GUARDIAN 2 SIGNED DROPDOWN MISMATCH ----");
                CharmsUtil.verifyLabel("Parent/Guardian 2 Name");
                CharmsUtil.assertTextBoxData(Hooks.softAssert, nativeViewCHARMSParticipantConsentPage.rasStudyConsentParentGuardian2NameTextField, ras_NV_Consent_Record_TestDataManager.PARENT_GUARDIAN_2_NAME, "---- CONSENT INFORMATION: PARENT/GUARDIAN 2 NAME FIELD MISMATCH ----");
            } else if (ras_NV_Consent_Record_TestDataManager.NUMBER_OF_GUARDIAN_SIGNATURES_REQUIRED.equals("1")) {
                CharmsUtil.verifyLabel("Number of Guardian Signatures required");
                RAS_Common_Methods.softAssertDropDownValueIsSelected(nativeViewCHARMSParticipantConsentPage.rasStudyConsentNumberOfParentGuardianSignaturesRequiredDropDown, ras_NV_Consent_Record_TestDataManager.NUMBER_OF_GUARDIAN_SIGNATURES_REQUIRED, "---- CONSENT INFORMATION: NUMBER OF PARENT/GUARDIAN SIGNATURES REQUIRED DROPDOWN MISMATCH ----");
                CharmsUtil.verifyLabel("Parent/Guardian 1 Signed");
                RAS_Common_Methods.softAssertDropDownValueIsSelected(nativeViewCHARMSParticipantConsentPage.rasStudyConsentParentGuardian1SignedDropDown, ras_NV_Consent_Record_TestDataManager.PARENT_GUARDIAN_1_SIGNED, "---- CONSENT INFORMATION: PARENT/GUARDIAN 1 SIGNED DROPDOWN MISMATCH ----");
                CharmsUtil.verifyLabel("Parent/Guardian 1 Name");
                CharmsUtil.assertTextBoxData(Hooks.softAssert, nativeViewCHARMSParticipantConsentPage.rasStudyConsentParentGuardian1NameTextField, ras_NV_Consent_Record_TestDataManager.PARENT_GUARDIAN_1_NAME, "---- CONSENT INFORMATION: PARENT/GUARDIAN 1 NAME FIELD MISMATCH ----");
            }
            if (ras_NV_Consent_Record_TestDataManager.NUMBER_OF_GUARDIAN_SIGNATURES_REQUIRED.equals("2")) {
                CharmsUtil.verifyLabel("Number of LARs");
                RAS_Common_Methods.softAssertDropDownValueIsSelected(nativeViewCHARMSParticipantConsentPage.numberOfLARsDropDown, ras_NV_Consent_Record_TestDataManager.NUMBER_OF_LARS, "---- CONSENT INFORMATION: NUMBER OF LARS DROPDOWN MISMATCH ----");
                CharmsUtil.verifyLabel("LAR 1 Signed");
                RAS_Common_Methods.softAssertDropDownValueIsSelected(nativeViewCHARMSParticipantConsentPage.lar1SignedDropDown, ras_NV_Consent_Record_TestDataManager.LAR_1_SIGNED, "---- CONSENT INFORMATION: LAR 1 SIGNED DROPDOWN MISMATCH ----");
                CharmsUtil.verifyLabel("LAR 1 Name");
                CharmsUtil.assertTextBoxData(Hooks.softAssert, nativeViewCHARMSParticipantConsentPage.lar1NameTextField, ras_NV_Consent_Record_TestDataManager.LAR_1_NAME, "---- CONSENT INFORMATION: LAR 1 NAME FIELD MISMATCH ----");
                CharmsUtil.verifyLabel("LAR 2 Signed");
                RAS_Common_Methods.softAssertDropDownValueIsSelected(nativeViewCHARMSParticipantConsentPage.lar2SignedDropDown, ras_NV_Consent_Record_TestDataManager.LAR_2_SIGNED, "---- CONSENT INFORMATION: LAR 2 SIGNED DROPDOWN MISMATCH ----");
                CharmsUtil.verifyLabel("LAR 2 Name");
                CharmsUtil.assertTextBoxData(Hooks.softAssert, nativeViewCHARMSParticipantConsentPage.lar2NameTextField, ras_NV_Consent_Record_TestDataManager.LAR_2_NAME, "---- CONSENT INFORMATION: LAR 2 NAME FIELD MISMATCH ----");

            } else if (ras_NV_Consent_Record_TestDataManager.NUMBER_OF_GUARDIAN_SIGNATURES_REQUIRED.equals("1")) {
                CharmsUtil.verifyLabel("Number of LARs");
                RAS_Common_Methods.softAssertDropDownValueIsSelected(nativeViewCHARMSParticipantConsentPage.numberOfLARsDropDown, ras_NV_Consent_Record_TestDataManager.NUMBER_OF_LARS, "---- CONSENT INFORMATION: NUMBER OF LARS DROPDOWN MISMATCH ----");
                CharmsUtil.verifyLabel("LAR 1 Signed");
                RAS_Common_Methods.softAssertDropDownValueIsSelected(nativeViewCHARMSParticipantConsentPage.lar1SignedDropDown, ras_NV_Consent_Record_TestDataManager.LAR_1_SIGNED, "---- CONSENT INFORMATION: LAR 1 SIGNED DROPDOWN MISMATCH ----");
                CharmsUtil.verifyLabel("LAR 1 Name");
                CharmsUtil.assertTextBoxData(Hooks.softAssert, nativeViewCHARMSParticipantConsentPage.lar1NameTextField, ras_NV_Consent_Record_TestDataManager.LAR_1_NAME, "---- CONSENT INFORMATION: LAR 1 NAME FIELD MISMATCH ----");
            }
        }
        CommonUtils.sleep(500);
        CucumberLogUtils.logScreenshot();
        CucumberLogUtils.scenario.log("---- VERIFYING PARTICIPANT CONSENT RECORD DATA: CONSENT SIGNED TAB ----");
        clicksTab("Consent Signed");
        CharmsUtil.verifyLabel("Future Use of Specimens and Data by NIH");
        RAS_Common_Methods.softAssertDropDownValueIsSelected(nativeViewCHARMSParticipantConsentPage.rasStudyConsentFutureSpecimensAndDataDropDown, ras_NV_Consent_Record_TestDataManager.FUTURE_USE_OF_SPECIMENS_AND_DATA_BY_NIH, "---- CONSENT SIGNED: FUTURE USE OF SPECIMENS AND DATA BY NIH DROPDOWN MISMATCH ----");
        CharmsUtil.verifyLabel("Future Identifiable Use by Collaborators");
        RAS_Common_Methods.softAssertDropDownValueIsSelected(nativeViewCHARMSParticipantConsentPage.rasStudyConsentFutureIdentifiableUseCollaboratorsDropDown, ras_NV_Consent_Record_TestDataManager.FUTURE_IDENTIFIABLE_USE_BY_COLLABORATORS, "---- CONSENT SIGNED: FUTURE IDENTIFIABLE USE BY COLLABORATORS DROPDOWN MISMATCH ----");
        CharmsUtil.verifyLabel("Consent/Assent Obtained Before Study Procedures");
        RAS_Common_Methods.softAssertDropDownValueIsSelected(nativeViewCHARMSParticipantConsentPage.rasStudyConsentConsentAssentObtainedBeforeStudyProceduresDropDown, ras_NV_Consent_Record_TestDataManager.CONSENT_ASSENT_OBTAINED_BEFORE_STUDY_PROCEDURES, "---- CONSENT SIGNED: CONSENT/ASSENT OBTAINED BEFORE STUDY PROCEDURES DROPDOWN MISMATCH ----");
        CharmsUtil.verifyLabel("Future Use by Collaborators");
        RAS_Common_Methods.softAssertDropDownValueIsSelected(nativeViewCHARMSParticipantConsentPage.rasStudyConsentFutureUseCollaboratorsDropDown, ras_NV_Consent_Record_TestDataManager.CONSENT_ASSENT_OBTAINED_BEFORE_STUDY_PROCEDURES, "---- CONSENT SIGNED: FUTURE USE BY COLLABORATORS DROPDOWN MISMATCH ----");
        CharmsUtil.verifyLabel("Return of Genetic Findings");
        RAS_Common_Methods.softAssertDropDownValueIsSelected(nativeViewCHARMSParticipantConsentPage.rasStudyReturnOfGeneticFindingsDropDown, ras_NV_Consent_Record_TestDataManager.RETURN_OF_GENETIC_FINDINGS, "---- CONSENT SIGNED: RETURN OF GENETIC FINDINGS DROPDOWN MISMATCH ----");
        CharmsUtil.verifyLabel("Copy of Signed/Dated Consent/Assent Given to Participant");
        RAS_Common_Methods.softAssertDropDownValueIsSelected(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCopyOfSignedDatedConsentAssentGivenToParticipantDropDown, ras_NV_Consent_Record_TestDataManager.COPY_OF_SIGNED_DATED_CONSENT_ASSENT_GIVEN_TO_PARTICIPANT, "---- CONSENT SIGNED: COPY OF SIGNED/DATED CONSENT/ASSENT GIVEN TO PARTICIPANT DROPDOWN MISMATCH ----");
        CommonUtils.sleep(500);
        CucumberLogUtils.logScreenshot();
    }
}