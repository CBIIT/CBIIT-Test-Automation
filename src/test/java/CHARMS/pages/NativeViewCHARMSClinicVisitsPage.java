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


    public NativeViewCHARMSClinicVisitsPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}