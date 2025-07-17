package CHARMS.stepsImplementation.RASStudy;

import APPS_COMMON.PageInitializers.PageInitializer;
import APPS_COMMON.Utils.ServiceNow_Login_Methods;
import CHARMS.constants.CHARMSRASScreenerConstants;
import CHARMS.pages.MyRASHomePage;
import CHARMS.steps.RAS_All_Steps;
import CHARMS.steps.RAS_Common_Methods;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.CommonUtils;
import org.openqa.selenium.Keys;
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
        ras_Screener_TestDataManager.dataInitializerRasScreener(sheetName);
        ras_NV_Consent_Record_TestDataManager.dataInitializerRasConsentRecord(sheetName, collectionMethod);
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        navigateToParticipantRecordInNativeView(sheetName);
        openParticipantStudyRecord();
        nativeViewCHARMSParticipantStudyPage.reConsentButton.click();
        CommonUtils.sleep(800);
        openConsentRecord();
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
     * @param username the participant's username for logging into the portal
     * @param password the participant's password for logging into the portal
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
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleVersionCalendar);
        CommonUtils.waitForClickability(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleVersionCalendar);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleVersionCalendar);
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
}