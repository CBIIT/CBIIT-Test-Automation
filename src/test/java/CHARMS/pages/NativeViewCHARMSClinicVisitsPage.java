package CHARMS.pages;

import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NativeViewCHARMSClinicVisitsPage {

    /**
     * Clinic number Input field
     */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_clinic_visit.clinic_number']")
    public WebElement clinicNumberInputField;

    /**
     * Participant Input field
     */
    @FindBy(xpath = "//input[@name='sys_display.x_naci_family_coho_clinic_visit.participant']")
    public WebElement participantInputField;

    /**
     * Name input field
     */
    @FindBy(xpath = "//input[@aria-label='Name']")
    public WebElement nameInputField;

    /**
     * Date of Birth input field
     */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_clinic_visit.participant.date_of_birth']")
    public WebElement dateOfBirthInputField;

    /**
     * Study input field
     */
    @FindBy(xpath = "//input[@name='sys_display.original.x_naci_family_coho_clinic_visit.study']")
    public WebElement studyInputField;

    /**
     * Study lookup list button
     */
    @FindBy(xpath = "//button[@name='lookup.x_naci_family_coho_clinic_visit.study']")
    public WebElement studyLookupListButton;

    /**
     * Visit Type dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_clinic_visit.visit_type']")
    public WebElement visitTypeDropdown;

    /**
     * Status dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_clinic_visit.status']")
    public WebElement statusDropdown;

    /**
     * Clinic Date calendar button
     */
    @FindBy(xpath = "//a[@id='x_naci_family_coho_clinic_visit.clinic_date.ui_policy_sensitive']//span[@class='icon icon-calendar']")
    public WebElement clinicDateCalendarButton;


    /**
     * Clinic Date input field
     */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_clinic_visit.clinic_date']")
    public WebElement clinicDateInputFieldButton;

    /**
     * Clinic Date Calendar Today button
     */
    @FindBy(xpath = "//td[@aria-label='Go to Today']")
    public WebElement clinicDateCalendarTodayButton;

    /**
     * Primary Provider input field
     */
    @FindBy(xpath = "//input[@id='sys_display.x_naci_family_coho_clinic_visit.primary_provider']")
    public WebElement primaryProviderInputField;

    /**
     * Scheduling Coordinator Input Field
     */
    @FindBy(xpath = "//input[@id='sys_display.x_naci_family_coho_clinic_visit.scheduling_coordinator']")
    public WebElement schedulingCoordinatorInputField;

    /**
     * Preclinic Note Complete dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_clinic_visit.preclinic_note_complete']")
    public WebElement preclinicNoteCompleteDropdown;

    /**
     * Coordination with Other NIH Protocol dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_clinic_visit.coordination_with_other_nih_protocol']")
    public WebElement coordinationWithOtherNihProtocolDropdown;

    /**
     * Specify NIH Protocol/Specialty input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_clinic_visit.specify_nih_protocol_specialty']")
    public WebElement specifyNihProtocolInputField;

    /**
     * CRIS Order Status dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_clinic_visit.cris_order_status']")
    public WebElement crisOrderStatusDropdown;

    /**
     * Schedule Status dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_clinic_visit.schedule_status']")
    public WebElement scheduleStatusDropdown;

    /**
     * After Hours Emergency Contact Name input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_clinic_visit.after_hours_emergency_contact_name']")
    public WebElement afterHoursEmergencyContactNameInputField;

    /**
     * After Hours Emergency Contact Number input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_clinic_visit.after_hours_emergency_contact_number']")
    public WebElement afterHoursEmergencyContactNumberInputField;

    /**
     * Save button
     */
    @FindBy(xpath = "//span[contains(@class,'navbar_ui_actions')]//button[contains(@name,'not_important')][normalize-space()='Save']")
    public WebElement saveButton;

    /**
     * Submit button
     */
    @FindBy(xpath = "//span[contains(@class,'navbar_ui_actions')]//button[contains(@name,'not_important')][normalize-space()='Submit']")
    public WebElement submitButton;

    /**
     * Primary provider lookup list button
     */
    @FindBy(xpath = "//button[@name='lookup.x_naci_family_coho_clinic_visit.primary_provider']")
    public WebElement primaryProviderLookupListButton;

    /**
     * Primary provider lookup list button
     */
    @FindBy(xpath = "//button[@name='lookup.x_naci_family_coho_clinic_visit.scheduling_coordinator']")
    public WebElement schedulingCoordinatorLookupListButton;

    /**
     * New Appointment button
     */
    @FindBy(xpath = "//button[@value='related_list_new_appointment']")
    public WebElement relatedListNewAppointmentButton;

    /**
     * Post Clinic - Unlock Procedure button
     */
    @FindBy(xpath = "//button[@aria-labelledby='x_naci_family_coho_clinic_visit.procedure_title_text']")
    public WebElement postClinicUnlockProcedureButton;

    /**
     * Post Clinic - Procedures dropdown
     */
    @FindBy(xpath = "//select[@name='choice.x_naci_family_coho_clinic_visit.procedure']")
    public WebElement postClinicProceduresDropdown;

    /**
     * Post Clinic - CDs to PPB Registry Status Date calendar button
     */
    @FindBy(xpath = "//a[@name='x_naci_family_coho_clinic_visit.cd_ppb_reg_status_date.ui_policy_sensitive']")
    public WebElement postClinicProceduresCDsToPPBRegistryStatusDateCalendarButton;

    /**
     * Post Clinic - CDs to PPB Registry Status Date field
     */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_clinic_visit.cd_ppb_reg_status_date']")
    public WebElement postClinicProceduresCDsToPPBRegistryStatusDateField;

    /**
     * Post Clinic - CDs to PPB Registry Status Date status dropdown
     */
    @FindBy(xpath = "//select[@name='x_naci_family_coho_clinic_visit.cd_ppb_reg_status']")
    public WebElement postClinicProceduresCDsToPPBRegistryStatusDropdown;

    /**
     * Post Clinic - CDs to PPB Registry Assigned to lookup button
     */
    @FindBy(xpath = "//button[@name='lookup.x_naci_family_coho_clinic_visit.cd_ppb_reg_assigned_to']")
    public WebElement postClinicProceduresCDsToPPBRegistryAssignedToLookupButton;

    /**
     * Post Clinic - CDs to PPB Registry Assigned to field
     */
    @FindBy(xpath = "//input[@name='sys_display.x_naci_family_coho_clinic_visit.cd_ppb_reg_assigned_to']")
    public WebElement postClinicProceduresCDsToPPBRegistryAssignedToField;

    /**
     * Post Clinic - CDs to PPB Registry Notes field
     */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_clinic_visit.cd_ppb_reg_notes']")
    public WebElement postClinicProceduresCDsToPPBRegistryNotesField;

    /**
     * Post Clinic - Discharge Summary Status dropdown
     */
    @FindBy(xpath = "//select[@name='x_naci_family_coho_clinic_visit.discharge_summ_status']")
    public WebElement postClinicProceduresDischargeSummaryStatusDropdown;

    /**
     * Post Clinic - Discharge Summary Status Date Calendar button
     */
    @FindBy(xpath = "//a[@name='x_naci_family_coho_clinic_visit.discharge_summ_status_date.ui_policy_sensitive']")
    public WebElement postClinicProceduresDischargeSummaryStatusDateCalendarButton;

    /**
     * Post Clinic - Discharge Summary Status Date field
     */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_clinic_visit.discharge_summ_status_date']")
    public WebElement postClinicProceduresDischargeSummaryStatusDateField;

    /**
     * Post Clinic - Discharge Summary Assigned to lookup button
     */
    @FindBy(xpath = "//button[@name='lookup.x_naci_family_coho_clinic_visit.discharge_summ_assigned_to']")
    public WebElement postClinicProceduresDischargeSummaryAssignedToLookupButton;

    /**
     * Post Clinic - Discharge Summary Assigned To field
     */
    @FindBy(xpath = "//input[@name='sys_display.x_naci_family_coho_clinic_visit.discharge_summ_assigned_to']")
    public WebElement postClinicProceduresDischargeSummaryAssignedToField;

    /**
     * Post Clinic - Discharge Summary notes field
     */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_clinic_visit.discharge_summ_notes']")
    public WebElement postClinicProceduresDischargeSummaryNotesField;

    /**
     * Post Clinic - Post-Clinic Collaboration Status dropdown
     */
    @FindBy(xpath = "//select[@name='x_naci_family_coho_clinic_visit.post_clinic_collab_status']")
    public WebElement postClinicProceduresCollaborationStatusDropdown;

    /**
     * Post Clinic - Post-Clinic Collaboration Status Date calendar button
     */
    @FindBy(xpath = "//a[@name='x_naci_family_coho_clinic_visit.post_clinic_collab_status_date.ui_policy_sensitive']")
    public WebElement postClinicProceduresCollaborationsStatusDateCalendarButton;

    /**
     * Post Clinic - Post-Clinic Collaboration Status Date field
     */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_clinic_visit.post_clinic_collab_status_date']")
    public WebElement postClinicProceduresCollaborationsStatusDateField;

    /**
     * Post Clinic - Post-Clinic Collaboration Assigned To lookup button
     */
    @FindBy(xpath = "//button[@name='lookup.x_naci_family_coho_clinic_visit.post_clinic_collab_assigned_to']")
    public WebElement postClinicProceduresCollaborationAssignedToLookupButton;

    /**
     * Post Clinic - Post-Clinic Collaboration Assigned To field
     */
    @FindBy(xpath = "//input[@name='sys_display.x_naci_family_coho_clinic_visit.post_clinic_collab_assigned_to']")
    public WebElement postClinicProceduresCollaborationAssignedToField;

    /**
     * Post Clinic - Post-Clinic Collaboration Post-Clinic Collaboration Notes field
     */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_clinic_visit.post_clinic_collab_notes']")
    public WebElement postClinicProceduresCollaborationNotesField;

    /**
     * Post Clinic - Records to PPB Registry Status dropdown
     */
    @FindBy(xpath = "//select[@name='x_naci_family_coho_clinic_visit.records_ppb_reg_status']")
    public WebElement postClinicRecordsToPPBRegistryStatusDropdown;

    /**
     * Post Clinic - Records to PPB Registry Status Date calendar button
     */
    @FindBy(xpath = "//a[@name='x_naci_family_coho_clinic_visit.records_ppb_reg_status_date.ui_policy_sensitive']")
    public WebElement postClinicRecordsToPPBRegistryStatusDateCalendarButton;

    /**
     * Post Clinic - Records to PPB Registry Status Date field
     */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_clinic_visit.records_ppb_reg_status_date']")
    public WebElement postClinicRecordsToPPBRegistryStatusDateField;

    /**
     * Post Clinic - Records to PPB Registry Assigned To lookup button
     */
    @FindBy(xpath = "//button[@name='lookup.x_naci_family_coho_clinic_visit.records_ppb_reg_assigned_to']")
    public WebElement postClinicRecordsToPPBRegistryAssignedToLookupButton;

    /**
     * Post Clinic - Records to PPB Registry Assigned To field
     */
    @FindBy(xpath = "//input[@name='sys_display.x_naci_family_coho_clinic_visit.records_ppb_reg_assigned_to']")
    public WebElement postClinicRecordsToPPBRegistryAssignedToField;

    /**
     * Post Clinic - Records to PPB Registry Notes field
     */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_clinic_visit.records_ppb_reg_notes']")
    public WebElement postClinicRecordsToPPBRegistryNotesField;

    /**
     * Post Clinic - Reports to Patient Status dropdown
     */
    @FindBy(xpath = "//select[@name='x_naci_family_coho_clinic_visit.reports_patient_status']")
    public WebElement postClinicRecordsReportsToPatientStatusDropdown;

    /**
     * Post Clinic - Reports to Patient Status Date calendar button
     */
    @FindBy(xpath = "//a[@name='x_naci_family_coho_clinic_visit.reports_patient_status_date.ui_policy_sensitive']")
    public WebElement postClinicRecordsReportsToPatientStatusDateCalendarButton;

    /**
     * Post Clinic - Reports to Patient Status Date field
     */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_clinic_visit.reports_patient_status_date']")
    public WebElement postClinicRecordsReportsToPatientStatusDateField;

    /**
     * Post Clinic - Reports to Patient Assigned To lookup button
     */
    @FindBy(xpath = "//button[@name='lookup.x_naci_family_coho_clinic_visit.reports_patient_assigned_to']")
    public WebElement postClinicRecordsReportsToPatientAssignedToLookupButton;

    /**
     * Post Clinic - Reports to Patient Assigned To field
     */
    @FindBy(xpath = "//input[@name='sys_display.x_naci_family_coho_clinic_visit.reports_patient_assigned_to']")
    public WebElement postClinicRecordsReportsToPatientAssignedToField;

    /**
     * Post Clinic - Reports to Patient Notes field
     */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_clinic_visit.reports_patient_notes']")
    public WebElement postClinicRecordsReportsToPatientNotesField;

    /**
     * Post Clinic - Summary Letter Status dropdown
     */
    @FindBy(xpath = "//select[@name='x_naci_family_coho_clinic_visit.summ_letter_status']")
    public WebElement postClinicSummaryLetterStatusDropdown;

    /**
     * Post Clinic - Summary Letter Status Date calendar button
     */
    @FindBy(xpath = "//a[@name='x_naci_family_coho_clinic_visit.summ_letter_status_date.ui_policy_sensitive']")
    public WebElement postClinicSummaryLetterStatusDateCalendarButton;

    /**
     * Post Clinic - Summary Letter Status Date field
     */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_clinic_visit.summ_letter_status_date']")
    public WebElement postClinicSummaryLetterStatusDateField;

    /**
     * Post Clinic - Summary Letter Assigned To lookup button
     */
    @FindBy(xpath = "//button[@name='lookup.x_naci_family_coho_clinic_visit.summ_letter_assigned_to']")
    public WebElement postClinicSummaryLetterAssignedToLookupButton;

    /**
     * Post Clinic - Summary Letter Assigned To field
     */
    @FindBy(xpath = "//input[@name='sys_display.x_naci_family_coho_clinic_visit.summ_letter_assigned_to']")
    public WebElement postClinicSummaryLetterAssignedToField;

    /**
     * Post Clinic - Summary Letter Notes field
     */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_clinic_visit.summ_letter_notes']")
    public WebElement postClinicSummaryLetterNotesField;

    /**
     * Post Clinic - Thank You Letter Status dropdown
     */
    @FindBy(xpath = "//select[@name='x_naci_family_coho_clinic_visit.ty_letter_status']")
    public WebElement postClinicThankYouLetterStatusDropdown;

    /**
     * Post Clinic - Thank You Letter Status Date calendar button
     */
    @FindBy(xpath = "//a[@name='x_naci_family_coho_clinic_visit.ty_letter_status_date.ui_policy_sensitive']")
    public WebElement postClinicThankYouLetterStatusDateCalendarButton;

    /**
     * Post Clinic - Thank You Letter Status Date field
     */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_clinic_visit.ty_letter_status_date']")
    public WebElement postClinicThankYouLetterStatusDateField;

    /**
     * Post Clinic - Thank You Letter Assigned To lookup button
     */
    @FindBy(xpath = "//button[@name='lookup.x_naci_family_coho_clinic_visit.ty_letter_assigned_to']")
    public WebElement postClinicThankYouLetterAssignedToLookUpButton;

    /**
     * Post Clinic - Thank You Letter Assigned To field
     */
    @FindBy(xpath = "//input[@name='sys_display.x_naci_family_coho_clinic_visit.ty_letter_assigned_to']")
    public WebElement postClinicThankYouLetterAssignedToField;

    /**
     * Post Clinic - Thank You Letter Notes field
     */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_clinic_visit.ty_letter_notes']")
    public WebElement postClinicThankYouLetterNotesField;

    /**
     * Post Clinic - Wrap Up Status dropdown
     */
    @FindBy(xpath = "//select[@name='x_naci_family_coho_clinic_visit.wrapup_status']")
    public WebElement postClinicWrapUpStatusDropdown;

    /**
     * Post Clinic - Wrap Up Status Date Calendar button
     */
    @FindBy(xpath = "//a[@name='x_naci_family_coho_clinic_visit.wrapup_status_date.ui_policy_sensitive']")
    public WebElement postClinicWrapUpStatusDateCalendarButton;

    /**
     * Post Clinic - Wrap Up Status Date field
     */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_clinic_visit.wrapup_status_date']")
    public WebElement postClinicWrapUpStatusDateField;

    /**
     * Post Clinic - Wrap Up Assigned To lookup button
     */
    @FindBy(xpath = "//button[@name='lookup.x_naci_family_coho_clinic_visit.wrapup_assigned_to']")
    public WebElement postClinicWrapUpAssignedToLookUpButton;

    /**
     * Post Clinic - Wrap Up Assigned To field
     */
    @FindBy(xpath = "//input[@name='sys_display.x_naci_family_coho_clinic_visit.wrapup_assigned_to']")
    public WebElement postClinicWrapUpAssignedToField;

    /**
     * Post Clinic - Wrap Up Notes field
     */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_clinic_visit.wrapup_notes']")
    public WebElement postClinicWrapUpNotesField;

    /**
     * Post Clinic - Telehealth Status dropdown
     */
    @FindBy(xpath = "//select[@name='x_naci_family_coho_clinic_visit.telehealth_status']")
    public WebElement postClinicTelehealthStatusDropdown;

    /**
     * Post Clinic - Telehealth Call Scheduled Date/Time Calendar button
     */
    @FindBy(xpath = "//button[@class='btn btn-default btn-ref date_time_trigger']")
    public WebElement postClinicTelehealthCallScheduledDateTimeButton;

    /**
     * Post Clinic - Telehealth Call Scheduled Date/Time field
     */
    @FindBy(xpath = "//p[@id='x_naci_family_coho_clinic_visit.telehealth_call_scheduled_date_time.timeago']")
    public WebElement postClinicTelehealthCallScheduledDateTimeField;

    public NativeViewCHARMSClinicVisitsPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}