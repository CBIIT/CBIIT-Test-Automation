package CHARMS.steps;

import CHARMS.utils.CharmsUtil;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import io.cucumber.java.en.Then;
import static APPS_COMMON.PageInitializers.PageInitializer.*;
import static CHARMS.pages.NativeViewCHARMSNewAppointmentPage.getLabel;
import static Hooks.Hooks.softAssert;

public class NativeViewClinicVisitsSteps {

    public static String participantFSID;
    public static String newAppointmentTime;
    public static String currentDate = CommonUtils.getTodayDate();

    /**
     * Study Team member opens PD record, navigates to the Clinic Visits related list, and creates a new Clinic Visit.
     *
     @param sheetName The name of the Excel sheet containing the data to be entered.
     */
    @Then("Study Team member navigates to the Clinic Visits related list and creates new Clinic Visit for {string}")
    public void study_team_member_navigates_to_the_clinic_visits_related_list_and_creates_new_clinic_visit(String sheetName) {
        if (sheetName.equals("screenerScenario2")) {
            nv_Clinic_Visits_TestDataManager.dataInitializerClinicVisits(sheetName);
            CommonUtils.sleep(2000);
            JavascriptUtils.scrollIntoView(nativeViewCHARMSParticipantDetailsPage.clinicVisitsTab);
            CommonUtils.clickOnElement(nativeViewCHARMSParticipantDetailsPage.clinicVisitsTab);
            CommonUtils.waitForClickability(nativeViewCHARMSParticipantDetailsPage.newClinicVisitButton);
            nativeViewCHARMSParticipantDetailsPage.newClinicVisitButton.click();
            CommonUtils.sleep(2000);
            CucumberLogUtils.logScreenshot();
            participantFSID = nativeViewCHARMSClinicVisitsPage.participantInputField.getDomAttribute("value");
            CharmsUtil.lookUpInReferenceField(nativeViewCHARMSClinicVisitsPage.studyLookupListButton, "study name", nv_Clinic_Visits_TestDataManager.study);
            CommonUtils.selectDropDownValue(nv_Clinic_Visits_TestDataManager.visitType, nativeViewCHARMSClinicVisitsPage.visitTypeDropdown);
            CommonUtils.selectDropDownValue(nv_Clinic_Visits_TestDataManager.status, nativeViewCHARMSClinicVisitsPage.statusDropdown);
            nativeViewCHARMSClinicVisitsPage.clinicDateCalendarButton.click();
            CommonUtils.sleep(500);
            CommonUtils.waitForClickability(nativeViewCHARMSClinicVisitsPage.clinicDateCalendarTodayButton);
            nativeViewCHARMSClinicVisitsPage.clinicDateCalendarTodayButton.click();
            CommonUtils.sleep(500);
            CucumberLogUtils.logScreenshot();
            nativeViewCHARMSClinicVisitsPage.primaryProviderInputField.clear();
            CharmsUtil.lookUpInReferenceField(nativeViewCHARMSClinicVisitsPage.primaryProviderLookupListButton, "name", nv_Clinic_Visits_TestDataManager.primaryProvider);
            CommonUtils.sleep(300);
            nativeViewCHARMSClinicVisitsPage.schedulingCoordinatorInputField.clear();
            CharmsUtil.lookUpInReferenceField(nativeViewCHARMSClinicVisitsPage.schedulingCoordinatorLookupListButton, "name", nv_Clinic_Visits_TestDataManager.schedulingCoordinator);
            CommonUtils.selectDropDownValue(nv_Clinic_Visits_TestDataManager.preclinicNoteComplete, nativeViewCHARMSClinicVisitsPage.preclinicNoteCompleteDropdown);
            CommonUtils.selectDropDownValue(nv_Clinic_Visits_TestDataManager.coordinationWithOtherNIHProtocol, nativeViewCHARMSClinicVisitsPage.coordinationWithOtherNihProtocolDropdown);
            CommonUtils.waitForClickability(nativeViewCHARMSClinicVisitsPage.specifyNihProtocolInputField);
            nativeViewCHARMSClinicVisitsPage.specifyNihProtocolInputField.sendKeys(nv_Clinic_Visits_TestDataManager.specifyNIHProtocolSpecialty);
            CommonUtils.selectDropDownValue(nv_Clinic_Visits_TestDataManager.CRISOrderStatus, nativeViewCHARMSClinicVisitsPage.crisOrderStatusDropdown);
            CommonUtils.selectDropDownValue(nv_Clinic_Visits_TestDataManager.schedulingStatus, nativeViewCHARMSClinicVisitsPage.scheduleStatusDropdown);
            nativeViewCHARMSClinicVisitsPage.afterHoursEmergencyContactNameInputField.sendKeys(nv_Clinic_Visits_TestDataManager.afterHoursEmergencyContactName);
            nativeViewCHARMSClinicVisitsPage.afterHoursEmergencyContactNumberInputField.sendKeys(nv_Clinic_Visits_TestDataManager.afterHoursEmergencyContactNumber);
            nativeViewCHARMSClinicVisitsPage.saveButton.click();
            CommonUtils.sleep(500);
        }
        clinic_visit_data_is_verified(sheetName);
    }

    /**
     * Study Team member creates a new Appointment.
     *
     @param sheetName The name of the Excel sheet containing the data to be entered.
     */
    @Then("creates a new Appointment for {string}")
    public void creates_a_new_appointment(String sheetName) {
        if (sheetName.equals("screenerScenario2")) {
            nv_New_Appointment_TestDataManager.dataInitializerClinicVisits(sheetName);
            JavascriptUtils.scrollIntoView(nativeViewCHARMSClinicVisitsPage.relatedListNewAppointmentButton);
            nativeViewCHARMSClinicVisitsPage.relatedListNewAppointmentButton.click();
            CommonUtils.sleep(1500);
            CharmsUtil.lookUpInReferenceField(nativeViewCHARMSNewAppointmentPage.lookUpAppointmentButton, "label", nv_New_Appointment_TestDataManager.appointment);
            CommonUtils.waitForClickability(nativeViewCHARMSNewAppointmentPage.otherAppointmentSpecifyInputField);
            nativeViewCHARMSNewAppointmentPage.otherAppointmentSpecifyInputField.sendKeys(nv_New_Appointment_TestDataManager.otherAppointmentSpecify);
            CommonUtils.sleep(500);
            CommonUtils.selectDropDownValue(nv_New_Appointment_TestDataManager.duration, nativeViewCHARMSNewAppointmentPage.durationHoursDropdown);
            CommonUtils.selectDropDownValue(nv_New_Appointment_TestDataManager.location, nativeViewCHARMSNewAppointmentPage.locationDropdown);
            CommonUtils.waitForClickability(nativeViewCHARMSNewAppointmentPage.otherLocationSpecifyInputField);
            nativeViewCHARMSNewAppointmentPage.otherLocationSpecifyInputField.sendKeys(nv_New_Appointment_TestDataManager.otherLocationSpecify);
            nativeViewCHARMSNewAppointmentPage.providerInputField.sendKeys(nv_New_Appointment_TestDataManager.provider);
            CommonUtils.selectDropDownValue(nativeViewCHARMSNewAppointmentPage.statusDropdown, nv_New_Appointment_TestDataManager.status);
            CommonUtils.clickOnElement(nativeViewCHARMSNewAppointmentPage.statusDateCalendarButton);
            CommonUtils.sleep(500);
            CommonUtils.waitForVisibility(nativeViewCHARMSNewAppointmentPage.calendarGoToTodayButton);
            CommonUtils.clickOnElement(nativeViewCHARMSNewAppointmentPage.calendarGoToTodayButton);
            CommonUtils.selectDropDownValue(nv_New_Appointment_TestDataManager.reportStatus, nativeViewCHARMSNewAppointmentPage.reportStatusDropdown);
            CommonUtils.sleep(500);
            CommonUtils.waitForVisibility(nativeViewCHARMSNewAppointmentPage.otherReportStatusSpecifyInputField);
            nativeViewCHARMSNewAppointmentPage.otherReportStatusSpecifyInputField.sendKeys(nv_New_Appointment_TestDataManager.otherReportStatusSpecify);
            CommonUtils.clickOnElement(nativeViewCHARMSNewAppointmentPage.scheduledDateTimeCalendarButton);
            CommonUtils.waitForVisibility(nativeViewCHARMSNewAppointmentPage.scheduledDateTimeCalendarGoToTodayButton);
            CommonUtils.clickOnElement(nativeViewCHARMSNewAppointmentPage.scheduledDateTimeCalendarGoToTodayButton);
            CommonUtils.clickOnElement(nativeViewCHARMSNewAppointmentPage.scheduledDateTimeCalendarGoToTodayButton);
            CommonUtils.sleep(500);
            nativeViewCHARMSNewAppointmentPage.scheduledDateTimeCalendarSaveButton.click();
            newAppointmentTime = nativeViewCHARMSNewAppointmentPage.scheduledDateTimeHiddenField.getDomAttribute("title");
            nativeViewCHARMSNewAppointmentPage.notesInputField.sendKeys(nv_New_Appointment_TestDataManager.notes);
            CommonUtils.sleep(500);
            CucumberLogUtils.logScreenshot();
            nativeViewCHARMSNewAppointmentPage.saveButton.click();
            CommonUtils.sleep(500);
        }
        new_appointment_data_is_verified(sheetName);
    }

    /**
     * Verifies clinic visit data by comparing values from an Excel sheet with the data displayed on Native View.
     *
     * @param sheetName The name of the Excel sheet containing the data to be verified.
     */
    public static void clinic_visit_data_is_verified(String sheetName) {
        nv_New_Appointment_TestDataManager.dataInitializerClinicVisits(sheetName);
        if (sheetName.equals("screenerScenario2")) {
            CharmsUtil.verifyLabel(getLabel("Clinic Number"), "Clinic Number");
            CharmsUtil.labelHighlight(nativeViewCHARMSClinicVisitsPage.clinicNumberInputField);
            softAssert.assertTrue(nativeViewCHARMSClinicVisitsPage.clinicNumberInputField.getDomAttribute("value").contains(participantFSID), "* * * * * NV CLINIC VISIT - Participant - MISMATCH * * * * *");
            CharmsUtil.verifyLabel(getLabel("Participant"), "Participant");
            CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSClinicVisitsPage.participantInputField, participantFSID, "* * * * * NV CLINIC VISIT - Participant - MISMATCH * * * * *");
            CharmsUtil.verifyLabel(getLabel("Name"), "Name");
            CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSClinicVisitsPage.nameInputField, nv_Clinic_Visits_TestDataManager.name, "* * * * * NV CLINIC VISIT - Name - MISMATCH * * * * *");
            CharmsUtil.verifyLabel(getLabel("Date of Birth"), "Date of Birth");
            CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSClinicVisitsPage.dateOfBirthInputField, nv_Clinic_Visits_TestDataManager.dateOfBirth, "* * * * * NV CLINIC VISIT - Date of Birth - MISMATCH * * * * *");
            CharmsUtil.verifyLabel(getLabel("Study"), "Study");
            CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSClinicVisitsPage.studyInputField, nv_Clinic_Visits_TestDataManager.study, "* * * * * NV CLINIC VISIT - Study - MISMATCH * * * * *");
            CharmsUtil.verifyLabel(getLabel("Visit Type"), "Visit Type");
            CharmsUtil.assertDropDownData(softAssert, nativeViewCHARMSClinicVisitsPage.visitTypeDropdown, nv_Clinic_Visits_TestDataManager.visitType, "* * * * * NV CLINIC VISIT - Visit Type - MISMATCH * * * * *");
            CharmsUtil.verifyLabel(getLabel("Status"), "Status");
            CharmsUtil.assertDropDownData(softAssert, nativeViewCHARMSClinicVisitsPage.statusDropdown, nv_Clinic_Visits_TestDataManager.status, "* * * * * NV CLINIC VISIT - Status - MISMATCH * * * * *");
            CharmsUtil.verifyLabel(getLabel("Clinic Date"), "Clinic Date");
            CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSClinicVisitsPage.clinicDateInputFieldButton, currentDate, "* * * * * NV CLINIC VISIT - Clinic Date - MISMATCH * * * * *");
            CharmsUtil.verifyLabel(getLabel("Primary Provider"), "Primary Provider");
            CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSClinicVisitsPage.primaryProviderInputField, nv_Clinic_Visits_TestDataManager.primaryProvider, "* * * * * NV CLINIC VISIT - Primary Provider - MISMATCH * * * * *");
            CharmsUtil.verifyLabel(getLabel("Scheduling Coordinator"), "Scheduling Coordinator");
            CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSClinicVisitsPage.schedulingCoordinatorInputField, nv_Clinic_Visits_TestDataManager.schedulingCoordinator, "* * * * * NV CLINIC VISIT - Scheduling Coordinator - MISMATCH * * * * *");
            CharmsUtil.verifyLabel(getLabel("Preclinic Note Complete"), "Preclinic Note Complete");
            CharmsUtil.assertDropDownData(softAssert, nativeViewCHARMSClinicVisitsPage.preclinicNoteCompleteDropdown, nv_Clinic_Visits_TestDataManager.preclinicNoteComplete, "* * * * * NV CLINIC VISIT - Preclinic Note Complete - MISMATCH * * * * *");
            CharmsUtil.verifyLabel(getLabel("Coordination with Other NIH Protocol"), "Coordination with Other NIH Protocol");
            CharmsUtil.assertDropDownData(softAssert, nativeViewCHARMSClinicVisitsPage.coordinationWithOtherNihProtocolDropdown, nv_Clinic_Visits_TestDataManager.coordinationWithOtherNIHProtocol, "* * * * * NV CLINIC VISIT - Coordination with Other NIH Protocol - MISMATCH * * * * *");
            CharmsUtil.verifyLabel(getLabel("Specify NIH Protocol/Specialty"), "Specify NIH Protocol/Specialty");
            CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSClinicVisitsPage.specifyNihProtocolInputField, nv_Clinic_Visits_TestDataManager.specifyNIHProtocolSpecialty, "* * * * * NV CLINIC VISIT - Specify NIH Protocol/Specialty - MISMATCH * * * * *");
            CharmsUtil.verifyLabel(getLabel("CRIS Order Status"), "CRIS Order Status");
            CharmsUtil.assertDropDownData(softAssert, nativeViewCHARMSClinicVisitsPage.crisOrderStatusDropdown, nv_Clinic_Visits_TestDataManager.CRISOrderStatus, "* * * * * NV CLINIC VISIT - CRIS Order Status - MISMATCH * * * * *");
            CharmsUtil.verifyLabel(getLabel("Schedule Status"), "Schedule Status");
            CharmsUtil.assertDropDownData(softAssert, nativeViewCHARMSClinicVisitsPage.scheduleStatusDropdown, nv_Clinic_Visits_TestDataManager.schedulingStatus, "* * * * * NV CLINIC VISIT - Schedule Status - MISMATCH * * * * *");
            CharmsUtil.verifyLabel(getLabel("After Hours Emergency Contact Name"), "After Hours Emergency Contact Name");
            CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSClinicVisitsPage.afterHoursEmergencyContactNameInputField, nv_Clinic_Visits_TestDataManager.afterHoursEmergencyContactName, "* * * * * NV CLINIC VISIT - After Hours Emergency Contact Name - MISMATCH * * * * *");
            CharmsUtil.verifyLabel(getLabel("After Hours Emergency Contact Number"), "After Hours Emergency Contact Number");
            CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSClinicVisitsPage.afterHoursEmergencyContactNumberInputField, nv_Clinic_Visits_TestDataManager.afterHoursEmergencyContactNumber, "* * * * * NV CLINIC VISIT - After Hours Emergency Contact Number - MISMATCH * * * * *");
            CommonUtils.sleep(500);
            CucumberLogUtils.logScreenshot();
        }
    }

    /**
     * Verifies new appointment data by comparing values from an Excel sheet with the data displayed on Native View.
     *
     * @param sheetName The name of the Excel sheet containing the data to be verified.
     */
    public static void new_appointment_data_is_verified(String sheetName) {
        if (sheetName.equals("screenerScenario2")) {
            CharmsUtil.verifyLabel(getLabel("Name"), "Name");
            CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSNewAppointmentPage.nameInputField, nv_New_Appointment_TestDataManager.name, "* * * * * NV NEW APPOINTMENT - Name - MISMATCH * * * * *");
            CharmsUtil.verifyLabel(getLabel("Study"), "Study");
            CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSNewAppointmentPage.studyInputField, nv_New_Appointment_TestDataManager.study, "* * * * * NV NEW APPOINTMENT - Study - MISMATCH * * * * *");
            CharmsUtil.verifyLabel(getLabel("Appointment"), "Appointment");
            CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSNewAppointmentPage.appointmentInputField, nv_New_Appointment_TestDataManager.appointment, "* * * * * NV NEW APPOINTMENT - Appointment - MISMATCH * * * * *");
            CharmsUtil.verifyLabel(getLabel("Other Appointment (Specify)"), "Other Appointment (Specify)");
            CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSNewAppointmentPage.otherAppointmentSpecifyInputField, nv_New_Appointment_TestDataManager.otherAppointmentSpecify, "* * * * * NV NEW APPOINTMENT - Other Appointment (Specify) - MISMATCH * * * * *");
            CharmsUtil.verifyLabel(getLabel("Duration (hours)"), "Duration (hours)");
            CharmsUtil.assertDropDownData(softAssert, nativeViewCHARMSNewAppointmentPage.durationHoursDropdown, nv_New_Appointment_TestDataManager.duration, "* * * * * NV CLINIC VISIT - Duration (hours) - MISMATCH * * * * *");
            CharmsUtil.verifyLabel(getLabel("Location"), "Location");
            CharmsUtil.assertDropDownData(softAssert, nativeViewCHARMSNewAppointmentPage.locationDropdown, nv_New_Appointment_TestDataManager.location, "* * * * * NV CLINIC VISIT - Location - MISMATCH * * * * *");
            CharmsUtil.verifyLabel(getLabel("Other Location (Specify)"), "Other Location (Specify)");
            CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSNewAppointmentPage.otherLocationSpecifyInputField, nv_New_Appointment_TestDataManager.otherLocationSpecify, "* * * * * NV NEW APPOINTMENT - Other Location (Specify) - MISMATCH * * * * *");
            CharmsUtil.verifyLabel(getLabel("Provider"), "Provider");
            CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSNewAppointmentPage.providerInputField, nv_New_Appointment_TestDataManager.provider, "* * * * * NV NEW APPOINTMENT - Provider - MISMATCH * * * * *");
            CharmsUtil.verifyLabel(getLabel("Participant Study"), "Participant Study");
            CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSNewAppointmentPage.participantStudyInputField, participantFSID, "* * * * * NV NEW APPOINTMENT - Participant Study - MISMATCH * * * * *");
            CharmsUtil.verifyLabel(getLabel("Status"), "Status");
            CharmsUtil.assertDropDownData(softAssert, nativeViewCHARMSNewAppointmentPage.statusDropdown, nv_New_Appointment_TestDataManager.status, "* * * * * NV CLINIC VISIT - Status - MISMATCH * * * * *");
            CharmsUtil.verifyLabel(getLabel("Status Date"), "Status Date");
            CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSNewAppointmentPage.statusDateInputField, currentDate, "* * * * * NV NEW APPOINTMENT - Status Date - MISMATCH * * * * *");
            CharmsUtil.verifyLabel(getLabel("Report Status"), "Report Status");
            CharmsUtil.assertDropDownData(softAssert, nativeViewCHARMSNewAppointmentPage.reportStatusDropdown, nv_New_Appointment_TestDataManager.reportStatus, "* * * * * NV CLINIC VISIT - Report Status - MISMATCH * * * * *");
            CharmsUtil.verifyLabel(getLabel("Other Report Status (Specify)"), "Other Report Status (Specify)");
            CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSNewAppointmentPage.otherReportStatusSpecifyInputField, nv_New_Appointment_TestDataManager.otherReportStatusSpecify, "* * * * * NV NEW APPOINTMENT - Other Report Status (Specify) - MISMATCH * * * * *");
            CharmsUtil.verifyLabel(getLabel("Scheduled Date/Time"), "Scheduled Date/Time");
            CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSNewAppointmentPage.scheduledDateTimeInputField, newAppointmentTime, "* * * * * NV NEW APPOINTMENT - Scheduled Date/Time - MISMATCH * * * * *");
            CharmsUtil.verifyLabel(getLabel("Notes"), "Notes");
            CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSNewAppointmentPage.notesInputField, nv_New_Appointment_TestDataManager.notes, "* * * * * NV NEW APPOINTMENT - Notes - MISMATCH * * * * *");
            CommonUtils.sleep(500);
            CucumberLogUtils.logScreenshot();
        }
    }
}