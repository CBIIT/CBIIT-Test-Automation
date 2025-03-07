package CHARMS.pages;

import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NativeViewCHARMSClinicVisitsPage {

    /**
     * Study input field
     */
    @FindBy(xpath = "//input[@id='sys_display.x_naci_family_coho_clinic_visit.study']")
    public WebElement studyInputField;

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
    public WebElement afterHoursEmergencyContactNameDropdown;

    /**
     * After Hours Emergency Contact Number input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_clinic_visit.after_hours_emergency_contact_number']")
    public WebElement afterHoursEmergencyContactNumberDropdown;

    public NativeViewCHARMSClinicVisitsPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}
