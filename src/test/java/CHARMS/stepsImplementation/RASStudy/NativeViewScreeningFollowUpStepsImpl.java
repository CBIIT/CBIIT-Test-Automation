package CHARMS.stepsImplementation.RASStudy;

import APPS_COMMON.PageInitializers.PageInitializer;
import APPS_COMMON.Utils.ServiceNow_Login_Methods;
import CHARMS.steps.RAS_Common_Methods;
import CHARMS.utils.CharmsUtil;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import static CHARMS.steps.RAS_Common_Methods.dynamicTabLocator;
import static CHARMS.steps.RAS_Common_Methods.navigateToParticipantRecordInNativeView;
import static Hooks.Hooks.softAssert;

public class NativeViewScreeningFollowUpStepsImpl extends PageInitializer {

    /**
     * Creates a Screening and Follow-up record for a given participant.
     *
     * @param sheetName The name of the sheet containing the data for the record.
     */
    public void createScreeningRecord(String sheetName) {
        ras_Screener_TestDataManager.dataInitializerRasScreener(sheetName);
        nv_screening_follow_up_testDataManager.dataInitializerScreeningFollowUp(sheetName);
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        navigateToParticipantRecordInNativeView(sheetName);
        CommonUtils.sleep(2000);
        JavascriptUtils.scrollIntoView(nativeViewCHARMSParticipantDetailsPage.participantStudiesTab);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantDetailsPage.participantStudiesTab);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantDetailsPage.participantStudiesTab);
        dynamicTabLocator("Screening/Follow-ups").click();
        CommonUtils.sleep(600);
        CommonUtils.waitForClickability(nativeViewCHARMSParticipantDetailsPage.screeningFollowUpsNewButton);
        nativeViewCHARMSParticipantDetailsPage.screeningFollowUpsNewButton.click();
        CommonUtils.sleep(2000);
        CucumberLogUtils.scenario.log("* * * * SCREENING/FOLLOW-UP * * * *");
        CharmsUtil.lookUpInReferenceField(nativeViewScreeningFollowUpPage.studyLookupButton, "study name", nv_screening_follow_up_testDataManager.STUDY);
        CommonUtils.selectDropDownValue(nv_screening_follow_up_testDataManager.SITE, nativeViewScreeningFollowUpPage.siteDropdown);
        CommonUtils.waitForClickability(nativeViewScreeningFollowUpPage.taskNameLookupButton);
        CharmsUtil.lookUpInReferenceField(nativeViewScreeningFollowUpPage.taskNameLookupButton, "label", nv_screening_follow_up_testDataManager.TASK_NAME);
        CommonUtils.selectDropDownValue(nv_screening_follow_up_testDataManager.STATUS, nativeViewScreeningFollowUpPage.statusDropdown);
        nativeViewScreeningFollowUpPage.statusDateCalendarButton.click();
        CommonUtils.waitForClickability(nativeViewScreeningFollowUpPage.goToTodayButton);
        nativeViewScreeningFollowUpPage.goToTodayButton.click();
        nativeViewScreeningFollowUpPage.dueDateCalendarButton.click();
        CommonUtils.waitForClickability(nativeViewScreeningFollowUpPage.goToTodayButton);
        nativeViewScreeningFollowUpPage.goToTodayButton.click();
        CommonUtils.selectDropDownValue(nv_screening_follow_up_testDataManager.EVENT_TYPE, nativeViewScreeningFollowUpPage.eventTypeDropdown);
        CucumberLogUtils.logScreenshot();
        dynamicTabLocator("Details").click();
        CommonUtils.waitForClickability(nativeViewScreeningFollowUpPage.durationHoursInputField);
        CucumberLogUtils.scenario.log("* * * * SCREENING/FOLLOW-UP - DETAILS * * * *");
        nativeViewScreeningFollowUpPage.durationHoursInputField.sendKeys(nv_screening_follow_up_testDataManager.DURATION_HOURS);
        nativeViewScreeningFollowUpPage.staffInputField.sendKeys(nv_screening_follow_up_testDataManager.STAFF);
        nativeViewScreeningFollowUpPage.dateTimeCalendarButton.click();
        CommonUtils.waitForClickability(nativeViewScreeningFollowUpPage.goToTodayButton);
        nativeViewScreeningFollowUpPage.goToTodayButton.click();
        nativeViewScreeningFollowUpPage.dateTimeCalendarOkButton.click();
        CommonUtils.waitForClickability(nativeViewScreeningFollowUpPage.staffInputField);
        nativeViewScreeningFollowUpPage.locationInputField.sendKeys(nv_screening_follow_up_testDataManager.LOCATION);
        CommonUtils.selectDropDownValue("Other Specify", nativeViewScreeningFollowUpPage.reportStatusDropdown);
        nativeViewScreeningFollowUpPage.reportStatusSpecifyInputField.sendKeys("Report Status Specify Test");
        nativeViewScreeningFollowUpPage.reportStatusDateCalendarButton.click();
        CommonUtils.waitForClickability(nativeViewScreeningFollowUpPage.goToTodayButton);
        nativeViewScreeningFollowUpPage.goToTodayButton.click();
        CommonUtils.selectDropDownValue(nv_screening_follow_up_testDataManager.REPORT_STATUS, nativeViewScreeningFollowUpPage.mediaStatusDropdown);
        nativeViewScreeningFollowUpPage.otherMediaStatusInputField.sendKeys(nv_screening_follow_up_testDataManager.OTHER_MEDIA_STATUS_SPECIFY);
        nativeViewScreeningFollowUpPage.mediaStatusDateCalendarButton.click();
        CommonUtils.waitForClickability(nativeViewScreeningFollowUpPage.goToTodayButton);
        nativeViewScreeningFollowUpPage.goToTodayButton.click();
        CucumberLogUtils.logScreenshot();
        dynamicTabLocator("Screening Reminders").click();
        CucumberLogUtils.scenario.log("* * * * SCREENING/FOLLOW-UP - SCREENING REMINDERS * * * *");
        nativeViewScreeningFollowUpPage.screeningReminder1InputField.sendKeys(CommonUtils.getOneMonthFromTodayDate_In_DD_MM_YYY_format());
        CommonUtils.selectDropDownValue(nv_screening_follow_up_testDataManager.SCREENING_REMINDER_1_STATUS, nativeViewScreeningFollowUpPage.screeningReminderStatus1Dropdown);
        CommonUtils.waitForClickability(nativeViewScreeningFollowUpPage.otherReminder1StatusInputField);
        nativeViewScreeningFollowUpPage.otherReminder1StatusInputField.sendKeys(nv_screening_follow_up_testDataManager.OTHER_REMINDER_1_STATUS);
        nativeViewScreeningFollowUpPage.screeningReminder2InputField.sendKeys(CommonUtils.getOneMonthFromTodayDate_In_DD_MM_YYY_format());
        CommonUtils.selectDropDownValue(nv_screening_follow_up_testDataManager.SCREENING_REMINDER_2_STATUS, nativeViewScreeningFollowUpPage.screeningReminderStatus2Dropdown);
        CommonUtils.waitForClickability(nativeViewScreeningFollowUpPage.otherReminder2StatusInputField);
        nativeViewScreeningFollowUpPage.otherReminder2StatusInputField.sendKeys(nv_screening_follow_up_testDataManager.OTHER_REMINDER_2_STATUS);
        nativeViewScreeningFollowUpPage.screeningReminder3InputField.sendKeys(CommonUtils.getOneMonthFromTodayDate_In_DD_MM_YYY_format());
        CommonUtils.selectDropDownValue(nv_screening_follow_up_testDataManager.SCREENING_REMINDER_3_STATUS, nativeViewScreeningFollowUpPage.screeningReminderStatus3Dropdown);
        CommonUtils.waitForClickability(nativeViewScreeningFollowUpPage.otherReminder3StatusInputField);
        nativeViewScreeningFollowUpPage.otherReminder3StatusInputField.sendKeys(nv_screening_follow_up_testDataManager.OTHER_REMINDER_3_STATUS);
        CucumberLogUtils.logScreenshot();
        nativeViewScreeningFollowUpPage.saveButton.click();
        verifyScreeningRecord();
    }

    /**
     * Verifies the fields and dropdowns of a Screening and Follow-Up record.
     */
    public void verifyScreeningRecord() {
        CucumberLogUtils.scenario.log("* * * * SCREENING/FOLLOW-UP VERIFICATION * * * *");
        CharmsUtil.verifyLabel("Study");
        CharmsUtil.verifyInputField(nativeViewScreeningFollowUpPage.studyInputField, nv_screening_follow_up_testDataManager.STUDY, "* * * * SCREENING/FOLLOW-UP - STUDY FIELD MISMATCH * * * *");
        CharmsUtil.verifyLabel("Site");
        RAS_Common_Methods.softAssertDropDownValueIsSelected(nativeViewScreeningFollowUpPage.siteDropdown, nv_screening_follow_up_testDataManager.SITE, "* * * * SCREENING/FOLLOW-UP - SITE DROPDOWN MISMATCH * * * *");
        CharmsUtil.verifyLabel("Task Name");
        CharmsUtil.verifyInputField(nativeViewScreeningFollowUpPage.taskNameInputField, nv_screening_follow_up_testDataManager.TASK_NAME, "* * * * SCREENING/FOLLOW-UP - TASK NAME FIELD MISMATCH * * * *");
        CharmsUtil.verifyLabel("Status");
        RAS_Common_Methods.softAssertDropDownValueIsSelected(nativeViewScreeningFollowUpPage.statusDropdown, nv_screening_follow_up_testDataManager.STATUS, "* * * * SCREENING/FOLLOW-UP - STATUS DROPDOWN MISMATCH * * * *");
        CharmsUtil.verifyLabel("Status Date");
        CharmsUtil.verifyInputField(nativeViewScreeningFollowUpPage.statusDateInputField, CharmsUtil.getCurrentDateIn_MM_DD_YYYY_format(), "* * * * SCREENING/FOLLOW-UP - STATUS DATE FIELD MISMATCH * * * *");
        CharmsUtil.verifyLabel("Due Date");
        CharmsUtil.verifyInputField(nativeViewScreeningFollowUpPage.dueDateInputField, CharmsUtil.getCurrentDateIn_MM_DD_YYYY_format(), "* * * * SCREENING/FOLLOW-UP - DUE DATE FIELD MISMATCH * * * *");
        CharmsUtil.verifyLabel("Event Type");
        RAS_Common_Methods.softAssertDropDownValueIsSelected(nativeViewScreeningFollowUpPage.eventTypeDropdown, nv_screening_follow_up_testDataManager.EVENT_TYPE, "* * * * SCREENING/FOLLOW-UP - EVENT TYPE DROPDOWN MISMATCH * * * *");
        dynamicTabLocator("Details").click();
        CommonUtils.waitForClickability(nativeViewScreeningFollowUpPage.durationHoursInputField);
        CucumberLogUtils.scenario.log("* * * * SCREENING/FOLLOW-UP VERIFICATION - DETAILS RL * * * *");
        CharmsUtil.verifyLabel("Duration (hours)");
        CharmsUtil.verifyInputField(nativeViewScreeningFollowUpPage.durationHoursInputField, nv_screening_follow_up_testDataManager.DURATION_HOURS, "* * * * SCREENING/FOLLOW-UP - DETAILS RL - DURATION (HOURS) FIELD MISMATCH * * * *");
        CharmsUtil.verifyLabel("Staff");
        CharmsUtil.verifyInputField(nativeViewScreeningFollowUpPage.staffInputField, nv_screening_follow_up_testDataManager.STAFF, "* * * * SCREENING/FOLLOW-UP - DETAILS RL - STAFF FIELD MISMATCH * * * *");
        CharmsUtil.verifyLabel("Date/Time");
        softAssert.assertTrue(nativeViewScreeningFollowUpPage.dateTimeCalendarInputField.getDomAttribute("value").contains(CharmsUtil.getCurrentDateIn_MM_DD_YYYY_format()), "* * * * SCREENING/FOLLOW-UP - DETAILS RL - DATE/TIME FIELD MISMATCH * * * *");
        CharmsUtil.verifyLabel("Location");
        CharmsUtil.verifyInputField(nativeViewScreeningFollowUpPage.locationInputField, nv_screening_follow_up_testDataManager.LOCATION, "* * * * SCREENING/FOLLOW-UP - DETAILS RL - LOCATION FIELD MISMATCH * * * *");
        CharmsUtil.verifyLabel("Report Status");
        RAS_Common_Methods.softAssertDropDownValueIsSelected(nativeViewScreeningFollowUpPage.reportStatusDropdown, nv_screening_follow_up_testDataManager.REPORT_STATUS, "* * * * SCREENING/FOLLOW-UP - REPORT STATUS DROPDOWN MISMATCH * * * *");
        CharmsUtil.verifyLabel("Other Report Status (specify)");
        CharmsUtil.verifyInputField(nativeViewScreeningFollowUpPage.reportStatusSpecifyInputField, nv_screening_follow_up_testDataManager.OTHER_REPORT_STATUS_SPECIFY, "* * * * SCREENING/FOLLOW-UP - DETAILS RL - Other Report Status (specify) FIELD MISMATCH * * * *");
        CharmsUtil.verifyLabel("Report Status Date");
        CharmsUtil.verifyInputField(nativeViewScreeningFollowUpPage.reportStatusDateCalendarInputField, CharmsUtil.getCurrentDateIn_MM_DD_YYYY_format(), "* * * * SCREENING/FOLLOW-UP - REPORT STATUS DATE DROPDOWN MISMATCH * * * *");
        CharmsUtil.verifyLabel("Media Status");
        RAS_Common_Methods.softAssertDropDownValueIsSelected(nativeViewScreeningFollowUpPage.mediaStatusDropdown, nv_screening_follow_up_testDataManager.MEDIA_STATUS, "* * * * SCREENING/FOLLOW-UP - MEDIA STATUS DROPDOWN MISMATCH * * * *");
        CharmsUtil.verifyLabel("Other Media Status (specify)");
        CharmsUtil.verifyInputField(nativeViewScreeningFollowUpPage.otherMediaStatusInputField, nv_screening_follow_up_testDataManager.OTHER_MEDIA_STATUS_SPECIFY, "* * * * SCREENING/FOLLOW-UP - DETAILS RL - OTHER MEDIA STATUS (SPECIFY) FIELD MISMATCH * * * *");
        CharmsUtil.verifyLabel("Media Status Date");
        CharmsUtil.verifyInputField(nativeViewScreeningFollowUpPage.mediaStatusDateInputField, CharmsUtil.getCurrentDateIn_MM_DD_YYYY_format(), "* * * * SCREENING/FOLLOW-UP - DETAILS RL - MEDIA STATUS DATE FIELD MISMATCH * * * *");
        dynamicTabLocator("Screening Reminders").click();
        CommonUtils.waitForClickability(nativeViewScreeningFollowUpPage.screeningReminder1InputField);
        CucumberLogUtils.scenario.log("* * * * SCREENING/FOLLOW-UP VERIFICATION - SCREENING REMINDERS RL * * * *");
        CharmsUtil.verifyLabel("Screening Reminder 1 Date");
        CharmsUtil.verifyInputField(nativeViewScreeningFollowUpPage.screeningReminder1InputField, CommonUtils.getOneMonthFromTodayDate_In_DD_MM_YYY_format(), "* * * * SCREENING/FOLLOW-UP - SCREENING REMINDERS RL - SCREENING REMINDER 1 DATE FIELD MISMATCH * * * *");
        CharmsUtil.verifyLabel("Screening Reminder 1 Status");
        RAS_Common_Methods.softAssertDropDownValueIsSelected(nativeViewScreeningFollowUpPage.screeningReminderStatus1Dropdown, nv_screening_follow_up_testDataManager.SCREENING_REMINDER_1_STATUS, "* * * * SCREENING/FOLLOW-UP - SCREENING REMINDERS RL - SCREENING REMINDER 1 STATUS DROPDOWN MISMATCH  * * * *");
        CharmsUtil.verifyLabel("Other Reminder 1 Status");
        CharmsUtil.verifyInputField(nativeViewScreeningFollowUpPage.otherReminder1StatusInputField, nv_screening_follow_up_testDataManager.OTHER_REMINDER_1_STATUS, "* * * * SCREENING/FOLLOW-UP - SCREENING REMINDERS RL - SCREENING REMINDER 1 DATE FIELD MISMATCH * * * *");
        CharmsUtil.verifyLabel("Screening Reminder 2 Date");
        CharmsUtil.verifyInputField(nativeViewScreeningFollowUpPage.screeningReminder2InputField, CommonUtils.getOneMonthFromTodayDate_In_DD_MM_YYY_format(), "* * * * SCREENING/FOLLOW-UP - SCREENING REMINDERS RL - SCREENING REMINDER 2 DATE FIELD MISMATCH * * * *");
        CharmsUtil.verifyLabel("Screening Reminder 2 Status");
        RAS_Common_Methods.softAssertDropDownValueIsSelected(nativeViewScreeningFollowUpPage.screeningReminderStatus2Dropdown, nv_screening_follow_up_testDataManager.SCREENING_REMINDER_2_STATUS, "* * * * SCREENING/FOLLOW-UP - SCREENING REMINDERS RL - SCREENING REMINDER 2 STATUS DROPDOWN MISMATCH  * * * *");
        CharmsUtil.verifyLabel("Other Reminder 2 Status");
        CharmsUtil.verifyInputField(nativeViewScreeningFollowUpPage.otherReminder2StatusInputField, nv_screening_follow_up_testDataManager.OTHER_REMINDER_2_STATUS, "* * * * SCREENING/FOLLOW-UP - SCREENING REMINDERS RL - SCREENING REMINDER 2 DATE FIELD MISMATCH * * * *");
        CharmsUtil.verifyLabel("Screening Reminder 3 Date");
        CharmsUtil.verifyInputField(nativeViewScreeningFollowUpPage.screeningReminder3InputField, CommonUtils.getOneMonthFromTodayDate_In_DD_MM_YYY_format(), "* * * * SCREENING/FOLLOW-UP - SCREENING REMINDERS RL - SCREENING REMINDER 3 DATE FIELD MISMATCH * * * *");
        CharmsUtil.verifyLabel("Screening Reminder 3 Status");
        RAS_Common_Methods.softAssertDropDownValueIsSelected(nativeViewScreeningFollowUpPage.screeningReminderStatus3Dropdown, nv_screening_follow_up_testDataManager.SCREENING_REMINDER_3_STATUS, "* * * * SCREENING/FOLLOW-UP - SCREENING REMINDERS RL - SCREENING REMINDER 3 STATUS DROPDOWN MISMATCH  * * * *");
        CharmsUtil.verifyLabel("Other Reminder 3 Status");
        CharmsUtil.verifyInputField(nativeViewScreeningFollowUpPage.otherReminder3StatusInputField, nv_screening_follow_up_testDataManager.OTHER_REMINDER_3_STATUS, "* * * * SCREENING/FOLLOW-UP - SCREENING REMINDERS RL - SCREENING REMINDER 3 DATE FIELD MISMATCH * * * *");
        CucumberLogUtils.logScreenshot();
    }
}
