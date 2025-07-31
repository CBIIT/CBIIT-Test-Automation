package CHARMS.stepsImplementation;

import APPS_COMMON.PageInitializers.PageInitializer;
import CHARMS.steps.RAS_Common_Methods;
import CHARMS.utils.CharmsUtil;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import static CHARMS.constants.CHARMSRASScreenerConstants.ASSIGNED_TO_USER_NAME;
import static Hooks.Hooks.softAssert;

public class ClinicVisitsStepsImpl extends PageInitializer {

    /**
     * Adds the following Post Clinic procedures and verifies the data.
     * - CDs to PPB Registry
     * - Discharge Summary
     * - Post-Clinic Collaboration
     * - Records to PPB Registry
     * - Reports to Patient
     * - Summary Letter
     * - Thank You Letter
     * - Wrap Up
     * - Telehealth
     */
    public void addPostClinicProcedures() {
        RAS_Common_Methods.dynamicTabLocator("Post Clinic").click();
        CommonUtils.sleep(600);
        addPostClinicProcedureCDsToPPBRegistry();
        addPostClinicProcedureDischargeSummary();
        addPostProcedurePostClinicCollaboration();
        addPostClinicProcedureRecordsToPPBRegistry();
        addPostClinicProcedureReportsToPatient();
        addPostClinicProcedureSummaryLetter();
        addPostClinicProcedureThankYouLetter();
        addPostClinicProcedureWrapUp();
        addPostClinicProcedureTelehealth();
    }

    /**
     * Adds "CDs to PPB Registry" post-clinic procedure and fills in fields
     */
    public void addPostClinicProcedureCDsToPPBRegistry() {
        nativeViewCHARMSClinicVisitsPage.postClinicUnlockProcedureButton.click();
        CommonUtils.sleep(600);
        CommonUtils.selectDropDownValue("CDs to PPB Registry", nativeViewCHARMSClinicVisitsPage.postClinicProceduresDropdown);
        CommonUtils.sleep(1000);
        JavascriptUtils.scrollIntoView(nativeViewCHARMSClinicVisitsPage.postClinicProceduresCDsToPPBRegistryStatusDropdown);
        CommonUtils.selectDropDownValue("Completed ", nativeViewCHARMSClinicVisitsPage.postClinicProceduresCDsToPPBRegistryStatusDropdown);
        CucumberLogUtils.scenario.log("* * * * ADDING \"CDS TO PPB REGISTRY\" POST-CLINIC PROCEDURE * * * *");
        nativeViewCHARMSClinicVisitsPage.postClinicProceduresCDsToPPBRegistryStatusDateCalendarButton.click();
        CommonUtils.waitForClickability(nativeViewCHARMSClinicVisitsPage.clinicDateCalendarTodayButton);
        nativeViewCHARMSClinicVisitsPage.clinicDateCalendarTodayButton.click();
        CharmsUtil.lookUpInReferenceField(nativeViewCHARMSClinicVisitsPage.postClinicProceduresCDsToPPBRegistryAssignedToLookupButton, "name", ASSIGNED_TO_USER_NAME);
        nativeViewCHARMSClinicVisitsPage.postClinicProceduresCDsToPPBRegistryNotesField.sendKeys("CDs to PPB Registry Notes test");
        CucumberLogUtils.logScreenshot();
        nativeViewCHARMSClinicVisitsPage.saveButton.click();
        CommonUtils.sleep(500);
        JavascriptUtils.scrollIntoView(nativeViewCHARMSClinicVisitsPage.postClinicProceduresCDsToPPBRegistryStatusDropdown);
        CharmsUtil.verifyLabel("CDs to PPB Registry Status");
        RAS_Common_Methods.softAssertDropDownValueIsSelected(nativeViewCHARMSClinicVisitsPage.postClinicProceduresCDsToPPBRegistryStatusDropdown, "Completed", "---- POST-CLINIC PROCEDURES: CDS TO PPB REGISTRY STATUS DROPDOWN MISMATCH ----");
        CharmsUtil.verifyLabel("CDs to PPB Registry Status Date");
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSClinicVisitsPage.postClinicProceduresCDsToPPBRegistryStatusDateField, CharmsUtil.getCurrentDateIn_MM_DD_YYYY_format(), "---- POST-CLINIC PROCEDURES: CDS TO PPB REGISTRY STATUS DATE FIELD MISMATCH ----");
        CharmsUtil.verifyLabel("CDs to PPB Registry Assigned To");
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSClinicVisitsPage.postClinicProceduresCDsToPPBRegistryAssignedToField, ASSIGNED_TO_USER_NAME, "---- POST-CLINIC PROCEDURES: CDS TO PPB REGISTRY ASSIGNED TO FIELD MISMATCH ----");
        CharmsUtil.verifyLabel("CDs to PPB Registry Notes");
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSClinicVisitsPage.postClinicProceduresCDsToPPBRegistryNotesField, "CDs to PPB Registry Notes test", "---- POST-CLINIC PROCEDURES: CDS TO PPB REGISTRY NOTES FIELD MISMATCH ----");
        CucumberLogUtils.logScreenshot();
    }

    /**
     * Adds "Discharge Summary" post-clinic procedure and fills in fields
     */
    public void addPostClinicProcedureDischargeSummary() {
        nativeViewCHARMSClinicVisitsPage.postClinicUnlockProcedureButton.click();
        CommonUtils.sleep(600);
        CommonUtils.selectDropDownValue("Discharge Summary ", nativeViewCHARMSClinicVisitsPage.postClinicProceduresDropdown);
        CommonUtils.sleep(1000);
        JavascriptUtils.scrollIntoView(nativeViewCHARMSClinicVisitsPage.postClinicProceduresDischargeSummaryStatusDropdown);
        CommonUtils.selectDropDownValue("Completed ", nativeViewCHARMSClinicVisitsPage.postClinicProceduresDischargeSummaryStatusDropdown);
        CucumberLogUtils.scenario.log("* * * * ADDING \"DISCHARGE SUMMARY\" POST-CLINIC PROCEDURE * * * *");
        nativeViewCHARMSClinicVisitsPage.postClinicProceduresDischargeSummaryStatusDateCalendarButton.click();
        CommonUtils.waitForClickability(nativeViewCHARMSClinicVisitsPage.clinicDateCalendarTodayButton);
        nativeViewCHARMSClinicVisitsPage.clinicDateCalendarTodayButton.click();
        CharmsUtil.lookUpInReferenceField(nativeViewCHARMSClinicVisitsPage.postClinicProceduresDischargeSummaryAssignedToLookupButton, "name", ASSIGNED_TO_USER_NAME);
        nativeViewCHARMSClinicVisitsPage.postClinicProceduresDischargeSummaryNotesField.sendKeys("Discharge Summary Notes test");
        CucumberLogUtils.logScreenshot();
        nativeViewCHARMSClinicVisitsPage.saveButton.click();
        CommonUtils.sleep(500);
        JavascriptUtils.scrollIntoView(nativeViewCHARMSClinicVisitsPage.postClinicProceduresDischargeSummaryStatusDropdown);
        CharmsUtil.verifyLabel("Discharge Summary Status");
        RAS_Common_Methods.softAssertDropDownValueIsSelected(nativeViewCHARMSClinicVisitsPage.postClinicProceduresDischargeSummaryStatusDropdown, "Completed", "---- POST-CLINIC PROCEDURES: DISCHARGE SUMMARY STATUS DROPDOWN MISMATCH ----");
        CharmsUtil.verifyLabel("Discharge Summary Status Date");
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSClinicVisitsPage.postClinicProceduresDischargeSummaryStatusDateField, CharmsUtil.getCurrentDateIn_MM_DD_YYYY_format(), "---- POST-CLINIC PROCEDURES: DISCHARGE SUMMARY STATUS DATE FIELD MISMATCH ----");
        CharmsUtil.verifyLabel("Discharge Summary Assigned To");
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSClinicVisitsPage.postClinicProceduresDischargeSummaryAssignedToField, ASSIGNED_TO_USER_NAME, "---- POST-CLINIC PROCEDURES: DISCHARGE SUMMARY ASSIGNED TO FIELD MISMATCH ----");
        CharmsUtil.verifyLabel("Discharge Summary Notes");
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSClinicVisitsPage.postClinicProceduresDischargeSummaryNotesField, "Discharge Summary Notes test", "---- POST-CLINIC PROCEDURES: DISCHARGE SUMMARY NOTES FIELD MISMATCH ----");
        CucumberLogUtils.logScreenshot();
    }

    /**
     * Adds "Post-Clinic Collaboration" post-clinic procedure and fills in fields
     */
    public void addPostProcedurePostClinicCollaboration() {
        nativeViewCHARMSClinicVisitsPage.postClinicUnlockProcedureButton.click();
        CommonUtils.sleep(600);
        CommonUtils.selectDropDownValue("Post-Clinic Collaboration", nativeViewCHARMSClinicVisitsPage.postClinicProceduresDropdown);
        CommonUtils.sleep(1000);
        JavascriptUtils.scrollIntoView(nativeViewCHARMSClinicVisitsPage.postClinicProceduresCollaborationStatusDropdown);
        CommonUtils.selectDropDownValue("Completed ", nativeViewCHARMSClinicVisitsPage.postClinicProceduresCollaborationStatusDropdown);
        CucumberLogUtils.scenario.log("* * * * ADDING \"POST-CLINIC COLLABORATION\" POST-CLINIC PROCEDURE * * * *");
        nativeViewCHARMSClinicVisitsPage.postClinicProceduresCollaborationsStatusDateCalendarButton.click();
        CommonUtils.waitForClickability(nativeViewCHARMSClinicVisitsPage.clinicDateCalendarTodayButton);
        nativeViewCHARMSClinicVisitsPage.clinicDateCalendarTodayButton.click();
        CharmsUtil.lookUpInReferenceField(nativeViewCHARMSClinicVisitsPage.postClinicProceduresCollaborationAssignedToLookupButton, "name", ASSIGNED_TO_USER_NAME);
        nativeViewCHARMSClinicVisitsPage.postClinicProceduresCollaborationNotesField.sendKeys("Post-Clinic Collaboration Notes test");
        CucumberLogUtils.logScreenshot();
        nativeViewCHARMSClinicVisitsPage.saveButton.click();
        CommonUtils.sleep(500);
        JavascriptUtils.scrollIntoView(nativeViewCHARMSClinicVisitsPage.postClinicProceduresCollaborationStatusDropdown);
        CharmsUtil.verifyLabel("Post-Clinic Collaboration Status");
        RAS_Common_Methods.softAssertDropDownValueIsSelected(nativeViewCHARMSClinicVisitsPage.postClinicProceduresCollaborationStatusDropdown, "Completed", "---- POST-CLINIC PROCEDURES: POST-CLINIC COLLABORATION STATUS DROPDOWN MISMATCH ----");
        CharmsUtil.verifyLabel("Post-Clinic Collaboration Status Date");
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSClinicVisitsPage.postClinicProceduresCollaborationsStatusDateField, CharmsUtil.getCurrentDateIn_MM_DD_YYYY_format(), "---- POST-CLINIC PROCEDURES: POST-CLINIC COLLABORATION STATUS DATE FIELD MISMATCH ----");
        CharmsUtil.verifyLabel("Post-Clinic Collaboration Assigned To");
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSClinicVisitsPage.postClinicProceduresCollaborationAssignedToField, ASSIGNED_TO_USER_NAME, "---- POST-CLINIC PROCEDURES: POST-CLINIC COLLABORATION ASSIGNED TO FIELD MISMATCH ----");
        CharmsUtil.verifyLabel("Post-Clinic Collaboration Notes");
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSClinicVisitsPage.postClinicProceduresCollaborationNotesField, "Post-Clinic Collaboration Notes test", "---- POST-CLINIC PROCEDURES: POST-CLINIC COLLABORATION NOTES FIELD MISMATCH ----");
        CucumberLogUtils.logScreenshot();
    }

    /**
     * Adds "Records to PPB Registry" post-clinic procedure and fills in fields
     */
    public void addPostClinicProcedureRecordsToPPBRegistry() {
        nativeViewCHARMSClinicVisitsPage.postClinicUnlockProcedureButton.click();
        CommonUtils.sleep(600);
        CommonUtils.selectDropDownValue("Records to PPB Registry", nativeViewCHARMSClinicVisitsPage.postClinicProceduresDropdown);
        CommonUtils.sleep(1000);
        JavascriptUtils.scrollIntoView(nativeViewCHARMSClinicVisitsPage.postClinicRecordsToPPBRegistryStatusDropdown);
        CommonUtils.selectDropDownValue("Completed ", nativeViewCHARMSClinicVisitsPage.postClinicRecordsToPPBRegistryStatusDropdown);
        CucumberLogUtils.scenario.log("* * * * ADDING \"RECORDS TO PPB REGISTRY\" POST-CLINIC PROCEDURE * * * *");
        nativeViewCHARMSClinicVisitsPage.postClinicRecordsToPPBRegistryStatusDateCalendarButton.click();
        CommonUtils.waitForClickability(nativeViewCHARMSClinicVisitsPage.clinicDateCalendarTodayButton);
        nativeViewCHARMSClinicVisitsPage.clinicDateCalendarTodayButton.click();
        CharmsUtil.lookUpInReferenceField(nativeViewCHARMSClinicVisitsPage.postClinicRecordsToPPBRegistryAssignedToLookupButton, "name", ASSIGNED_TO_USER_NAME);
        nativeViewCHARMSClinicVisitsPage.postClinicRecordsToPPBRegistryNotesField.sendKeys("Records to PPB Registry Notes test");
        CucumberLogUtils.logScreenshot();
        nativeViewCHARMSClinicVisitsPage.saveButton.click();
        CommonUtils.sleep(500);
        JavascriptUtils.scrollIntoView(nativeViewCHARMSClinicVisitsPage.postClinicRecordsToPPBRegistryStatusDropdown);
        CharmsUtil.verifyLabel("Records to PPB Registry Status");
        RAS_Common_Methods.softAssertDropDownValueIsSelected(nativeViewCHARMSClinicVisitsPage.postClinicRecordsToPPBRegistryStatusDropdown, "Completed", "---- POST-CLINIC PROCEDURES: RECORDS TO PPB REGISTRY STATUS DROPDOWN MISMATCH ----");
        CharmsUtil.verifyLabel("Records to PPB Registry Status Date");
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSClinicVisitsPage.postClinicRecordsToPPBRegistryStatusDateField, CharmsUtil.getCurrentDateIn_MM_DD_YYYY_format(), "---- POST-CLINIC PROCEDURES: RECORDS TO PPB REGISTRY STATUS DATE FIELD MISMATCH ----");
        CharmsUtil.verifyLabel("Records to PPB Registry Assigned To");
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSClinicVisitsPage.postClinicRecordsToPPBRegistryAssignedToField, ASSIGNED_TO_USER_NAME, "---- POST-CLINIC PROCEDURES: RECORDS TO PPB REGISTRY ASSIGNED TO FIELD MISMATCH ----");
        CharmsUtil.verifyLabel("Records to PPB Registry Notes");
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSClinicVisitsPage.postClinicRecordsToPPBRegistryNotesField, "Records to PPB Registry Notes test", "---- POST-CLINIC PROCEDURES: RECORDS TO PPB REGISTRY NOTES FIELD MISMATCH ----");
        CucumberLogUtils.logScreenshot();
    }

    /**
     * Adds "Reports to Patient" post-clinic procedure and fills in fields
     */
    public void addPostClinicProcedureReportsToPatient() {
        nativeViewCHARMSClinicVisitsPage.postClinicUnlockProcedureButton.click();
        CommonUtils.sleep(600);
        CommonUtils.selectDropDownValue("Reports to Patient ", nativeViewCHARMSClinicVisitsPage.postClinicProceduresDropdown);
        CommonUtils.sleep(1000);
        JavascriptUtils.scrollIntoView(nativeViewCHARMSClinicVisitsPage.postClinicRecordsReportsToPatientStatusDropdown);
        CommonUtils.selectDropDownValue("Completed ", nativeViewCHARMSClinicVisitsPage.postClinicRecordsReportsToPatientStatusDropdown);
        CucumberLogUtils.scenario.log("* * * * ADDING \"REPORTS TO PATIENT\" POST-CLINIC PROCEDURE * * * *");
        nativeViewCHARMSClinicVisitsPage.postClinicRecordsReportsToPatientStatusDateCalendarButton.click();
        CommonUtils.waitForClickability(nativeViewCHARMSClinicVisitsPage.clinicDateCalendarTodayButton);
        nativeViewCHARMSClinicVisitsPage.clinicDateCalendarTodayButton.click();
        CharmsUtil.lookUpInReferenceField(nativeViewCHARMSClinicVisitsPage.postClinicRecordsReportsToPatientAssignedToLookupButton, "name", ASSIGNED_TO_USER_NAME);
        nativeViewCHARMSClinicVisitsPage.postClinicRecordsReportsToPatientNotesField.sendKeys("Reports to Patient Notes test");
        CucumberLogUtils.logScreenshot();
        nativeViewCHARMSClinicVisitsPage.saveButton.click();
        CommonUtils.sleep(500);
        JavascriptUtils.scrollIntoView(nativeViewCHARMSClinicVisitsPage.postClinicRecordsReportsToPatientStatusDropdown);
        CharmsUtil.verifyLabel("Reports to Patient Status");
        RAS_Common_Methods.softAssertDropDownValueIsSelected(nativeViewCHARMSClinicVisitsPage.postClinicRecordsReportsToPatientStatusDropdown, "Completed", "---- POST-CLINIC PROCEDURES: REPORTS TO PATIENT STATUS DROPDOWN MISMATCH ----");
        CharmsUtil.verifyLabel("Reports to Patient Status Date");
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSClinicVisitsPage.postClinicRecordsReportsToPatientStatusDateField, CharmsUtil.getCurrentDateIn_MM_DD_YYYY_format(), "---- POST-CLINIC PROCEDURES: REPORTS TO PATIENT STATUS DATE FIELD MISMATCH ----");
        CharmsUtil.verifyLabel("Reports to Patient Assigned To");
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSClinicVisitsPage.postClinicRecordsReportsToPatientAssignedToField, ASSIGNED_TO_USER_NAME, "---- POST-CLINIC PROCEDURES: REPORTS TO PATIENT ASSIGNED TO FIELD MISMATCH ----");
        CharmsUtil.verifyLabel("Reports to Patient Notes");
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSClinicVisitsPage.postClinicRecordsReportsToPatientNotesField, "Reports to Patient Notes test", "---- POST-CLINIC PROCEDURES: REPORTS TO PATIENT NOTES FIELD MISMATCH ----");
        CucumberLogUtils.logScreenshot();
    }

    /**
     * Adds "Summary Letter" post-clinic procedure and fills in fields
     */
    public void addPostClinicProcedureSummaryLetter() {
        nativeViewCHARMSClinicVisitsPage.postClinicUnlockProcedureButton.click();
        CommonUtils.sleep(600);
        CommonUtils.selectDropDownValue("Summary Letter ", nativeViewCHARMSClinicVisitsPage.postClinicProceduresDropdown);
        CommonUtils.sleep(1000);
        JavascriptUtils.scrollIntoView(nativeViewCHARMSClinicVisitsPage.postClinicSummaryLetterStatusDropdown);
        CommonUtils.selectDropDownValue("Completed ", nativeViewCHARMSClinicVisitsPage.postClinicSummaryLetterStatusDropdown);
        CucumberLogUtils.scenario.log("* * * * ADDING \"SUMMARY LETTER\" POST-CLINIC PROCEDURE * * * *");
        nativeViewCHARMSClinicVisitsPage.postClinicSummaryLetterStatusDateCalendarButton.click();
        CommonUtils.waitForClickability(nativeViewCHARMSClinicVisitsPage.clinicDateCalendarTodayButton);
        nativeViewCHARMSClinicVisitsPage.clinicDateCalendarTodayButton.click();
        CharmsUtil.lookUpInReferenceField(nativeViewCHARMSClinicVisitsPage.postClinicSummaryLetterAssignedToLookupButton, "name", ASSIGNED_TO_USER_NAME);
        nativeViewCHARMSClinicVisitsPage.postClinicSummaryLetterNotesField.sendKeys("Summary Letter Notes test");
        CucumberLogUtils.logScreenshot();
        nativeViewCHARMSClinicVisitsPage.saveButton.click();
        CommonUtils.sleep(500);
        JavascriptUtils.scrollIntoView(nativeViewCHARMSClinicVisitsPage.postClinicSummaryLetterStatusDropdown);
        CharmsUtil.verifyLabel("Summary Letter Status");
        RAS_Common_Methods.softAssertDropDownValueIsSelected(nativeViewCHARMSClinicVisitsPage.postClinicSummaryLetterStatusDropdown, "Completed", "---- POST-CLINIC PROCEDURES: SUMMARY LETTER STATUS DROPDOWN MISMATCH ----");
        CharmsUtil.verifyLabel("Summary Letter Status Date");
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSClinicVisitsPage.postClinicSummaryLetterStatusDateField, CharmsUtil.getCurrentDateIn_MM_DD_YYYY_format(), "---- POST-CLINIC PROCEDURES: SUMMARY LETTER STATUS DATE FIELD MISMATCH ----");
        CharmsUtil.verifyLabel("Summary Letter Assigned To");
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSClinicVisitsPage.postClinicSummaryLetterAssignedToField, ASSIGNED_TO_USER_NAME, "---- POST-CLINIC PROCEDURES: SUMMARY LETTER ASSIGNED TO FIELD MISMATCH ----");
        CharmsUtil.verifyLabel("Summary Letter Notes");
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSClinicVisitsPage.postClinicSummaryLetterNotesField, "Summary Letter Notes test", "---- POST-CLINIC PROCEDURES: SUMMARY LETTER NOTES FIELD MISMATCH ----");
        CucumberLogUtils.logScreenshot();
    }

    /**
     * Adds "Thank You Letter" post-clinic procedure and fills in fields
     */
    public void addPostClinicProcedureThankYouLetter() {
        nativeViewCHARMSClinicVisitsPage.postClinicUnlockProcedureButton.click();
        CommonUtils.sleep(600);
        CommonUtils.selectDropDownValue("Thank You Letter ", nativeViewCHARMSClinicVisitsPage.postClinicProceduresDropdown);
        CommonUtils.sleep(1000);
        JavascriptUtils.scrollIntoView(nativeViewCHARMSClinicVisitsPage.postClinicThankYouLetterStatusDropdown);
        CommonUtils.selectDropDownValue("Completed ", nativeViewCHARMSClinicVisitsPage.postClinicThankYouLetterStatusDropdown);
        CucumberLogUtils.scenario.log("* * * * ADDING \"THANK YOU LETTER\" POST-CLINIC PROCEDURE * * * *");
        nativeViewCHARMSClinicVisitsPage.postClinicThankYouLetterStatusDateCalendarButton.click();
        CommonUtils.waitForClickability(nativeViewCHARMSClinicVisitsPage.clinicDateCalendarTodayButton);
        nativeViewCHARMSClinicVisitsPage.clinicDateCalendarTodayButton.click();
        CharmsUtil.lookUpInReferenceField(nativeViewCHARMSClinicVisitsPage.postClinicThankYouLetterAssignedToLookUpButton, "name", ASSIGNED_TO_USER_NAME);
        nativeViewCHARMSClinicVisitsPage.postClinicThankYouLetterNotesField.sendKeys("Thank You Letter Notes test");
        CucumberLogUtils.logScreenshot();
        nativeViewCHARMSClinicVisitsPage.saveButton.click();
        CommonUtils.sleep(500);
        JavascriptUtils.scrollIntoView(nativeViewCHARMSClinicVisitsPage.postClinicThankYouLetterStatusDropdown);
        CharmsUtil.verifyLabel("Thank You Letter Status");
        RAS_Common_Methods.softAssertDropDownValueIsSelected(nativeViewCHARMSClinicVisitsPage.postClinicThankYouLetterStatusDropdown, "Completed", "---- POST-CLINIC PROCEDURES: THANK YOU LETTER STATUS DROPDOWN MISMATCH ----");
        CharmsUtil.verifyLabel("Thank You Letter Status Date");
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSClinicVisitsPage.postClinicThankYouLetterStatusDateField, CharmsUtil.getCurrentDateIn_MM_DD_YYYY_format(), "---- POST-CLINIC PROCEDURES: THANK YOU LETTER STATUS DATE FIELD MISMATCH ----");
        CharmsUtil.verifyLabel("Thank You Letter Assigned To");
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSClinicVisitsPage.postClinicThankYouLetterAssignedToField, ASSIGNED_TO_USER_NAME, "---- POST-CLINIC PROCEDURES: THANK YOU LETTER ASSIGNED TO FIELD MISMATCH ----");
        CharmsUtil.verifyLabel("Thank You Letter Notes");
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSClinicVisitsPage.postClinicThankYouLetterNotesField, "Thank You Letter Notes test", "---- POST-CLINIC PROCEDURES: THANK YOU LETTER NOTES FIELD MISMATCH ----");
        CucumberLogUtils.logScreenshot();
    }

    /**
     * Adds "Wrap Up" post-clinic procedure and fills in fields
     */
    public void addPostClinicProcedureWrapUp() {
        nativeViewCHARMSClinicVisitsPage.postClinicUnlockProcedureButton.click();
        CommonUtils.sleep(600);
        CommonUtils.selectDropDownValue("Wrap Up ", nativeViewCHARMSClinicVisitsPage.postClinicProceduresDropdown);
        CommonUtils.sleep(1000);
        JavascriptUtils.scrollIntoView(nativeViewCHARMSClinicVisitsPage.postClinicWrapUpStatusDropdown);
        CommonUtils.selectDropDownValue("Completed ", nativeViewCHARMSClinicVisitsPage.postClinicWrapUpStatusDropdown);
        CucumberLogUtils.scenario.log("* * * * ADDING \"WRAP UP\" POST-CLINIC PROCEDURE * * * *");
        nativeViewCHARMSClinicVisitsPage.postClinicWrapUpStatusDateCalendarButton.click();
        CommonUtils.waitForClickability(nativeViewCHARMSClinicVisitsPage.clinicDateCalendarTodayButton);
        nativeViewCHARMSClinicVisitsPage.clinicDateCalendarTodayButton.click();
        CharmsUtil.lookUpInReferenceField(nativeViewCHARMSClinicVisitsPage.postClinicWrapUpAssignedToLookUpButton, "name", ASSIGNED_TO_USER_NAME);
        nativeViewCHARMSClinicVisitsPage.postClinicWrapUpNotesField.sendKeys("Wrap Up Notes test");
        CucumberLogUtils.logScreenshot();
        nativeViewCHARMSClinicVisitsPage.saveButton.click();
        CommonUtils.sleep(500);
        JavascriptUtils.scrollIntoView(nativeViewCHARMSClinicVisitsPage.postClinicWrapUpStatusDropdown);
        CharmsUtil.verifyLabel("Wrap Up Status");
        RAS_Common_Methods.softAssertDropDownValueIsSelected(nativeViewCHARMSClinicVisitsPage.postClinicWrapUpStatusDropdown, "Completed", "---- POST-CLINIC PROCEDURES: WRAP UP STATUS DROPDOWN MISMATCH ----");
        CharmsUtil.verifyLabel("Wrap Up Status Date");
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSClinicVisitsPage.postClinicWrapUpStatusDateField, CharmsUtil.getCurrentDateIn_MM_DD_YYYY_format(), "---- POST-CLINIC PROCEDURES: WRAP UP STATUS DATE FIELD MISMATCH ----");
        CharmsUtil.verifyLabel("Wrap Up Assigned To");
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSClinicVisitsPage.postClinicWrapUpAssignedToField, ASSIGNED_TO_USER_NAME, "---- POST-CLINIC PROCEDURES: WRAP UP ASSIGNED TO FIELD MISMATCH ----");
        CharmsUtil.verifyLabel("Wrap Up Notes");
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSClinicVisitsPage.postClinicWrapUpNotesField, "Wrap Up Notes test", "---- POST-CLINIC PROCEDURES: WRAP UP NOTES FIELD MISMATCH ----");
        CucumberLogUtils.logScreenshot();
    }

    /**
     * Adds "Telehealth" post-clinic procedure and fills in fields
     */
    public void addPostClinicProcedureTelehealth() {
        nativeViewCHARMSClinicVisitsPage.postClinicUnlockProcedureButton.click();
        CommonUtils.sleep(600);
        CommonUtils.selectDropDownValue("Telehealth", nativeViewCHARMSClinicVisitsPage.postClinicProceduresDropdown);
        CommonUtils.sleep(1000);
        JavascriptUtils.scrollIntoView(nativeViewCHARMSClinicVisitsPage.postClinicTelehealthStatusDropdown);
        CommonUtils.selectDropDownValue("Completed ", nativeViewCHARMSClinicVisitsPage.postClinicTelehealthStatusDropdown);
        CucumberLogUtils.scenario.log("* * * * ADDING \"TELEHEALTH\" POST-CLINIC PROCEDURE * * * *");
        nativeViewCHARMSClinicVisitsPage.postClinicTelehealthCallScheduledDateTimeButton.click();
        CommonUtils.waitForClickability(nativeViewCHARMSClinicVisitsPage.clinicDateCalendarTodayButton);
        nativeViewCHARMSClinicVisitsPage.clinicDateCalendarTodayButton.click();
        CucumberLogUtils.logScreenshot();
        nativeViewCHARMSClinicVisitsPage.saveButton.click();
        CommonUtils.sleep(500);
        JavascriptUtils.scrollIntoView(nativeViewCHARMSClinicVisitsPage.postClinicTelehealthStatusDropdown);
        CharmsUtil.verifyLabel("Telehealth Status");
        RAS_Common_Methods.softAssertDropDownValueIsSelected(nativeViewCHARMSClinicVisitsPage.postClinicTelehealthStatusDropdown, "Completed", "---- POST-CLINIC PROCEDURES: TELEHEALTH STATUS DROPDOWN MISMATCH ----");
        CharmsUtil.verifyLabel("Telehealth Call Scheduled Date/Time");
        CharmsUtil.labelHighlight(nativeViewCHARMSClinicVisitsPage.postClinicTelehealthCallScheduledDateTimeField);
        System.out.println("Telehealth Call Scheduled Date/Time: " + nativeViewCHARMSClinicVisitsPage.postClinicTelehealthCallScheduledDateTimeField.getDomAttribute("timeago"));
        softAssert.assertTrue(nativeViewCHARMSClinicVisitsPage.postClinicTelehealthCallScheduledDateTimeField.getDomAttribute("title").contains(CharmsUtil.getCurrentDateIn_MM_DD_YYYY_format()), "---- POST-CLINIC PROCEDURES: TELEHEALTH STATUS DATE FIELD MISMATCH ----");
        CucumberLogUtils.logScreenshot();
    }
}
