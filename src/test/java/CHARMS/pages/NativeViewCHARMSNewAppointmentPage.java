package CHARMS.pages;

import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static APPS_COMMON.Pages.Selenium_Common_Locators.locateByXpath;

public class NativeViewCHARMSNewAppointmentPage {

    /**
     * Name input field
     */
    @FindBy(xpath = "//input[@aria-label='Name']")
    public WebElement nameInputField;

    /**
     * Study input field
     */
    @FindBy(xpath = "//input[@name='sys_display.original.x_naci_family_coho_appointment.clinic_visit.study']")
    public WebElement studyInputField;

    /**
     * Appointment input field
     */
    @FindBy(xpath = "//input[@name='sys_display.original.x_naci_family_coho_appointment.appointment']")
    public WebElement appointmentInputField;

    /**
     * Lookup appointment button
     */
    @FindBy(xpath = "//button[@name='lookup.x_naci_family_coho_appointment.appointment']")
    public WebElement lookUpAppointmentButton;

    /**
     * Other Appointment input field
     */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_appointment.other_appointment_specify']")
    public WebElement otherAppointmentSpecifyInputField;

    /**
     * Duration (hours) dropdown
     */
    @FindBy(xpath = "//select[@name='x_naci_family_coho_appointment.duration_hours']")
    public WebElement durationHoursDropdown;

    /**
     * Location dropdown
     */
    @FindBy(xpath = "//select[@name='x_naci_family_coho_appointment.location']")
    public WebElement locationDropdown;

    /**
     * Other Location (Specify) input field
     */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_appointment.other_location_specify']")
    public WebElement otherLocationSpecifyInputField;

    /**
     * Provider input field
     */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_appointment.provider']")
    public WebElement providerInputField;

    /**
     * Participant Study input field
     */
    @FindBy(xpath = "//input[@name='sys_display.original.x_naci_family_coho_appointment.participant_study']")
    public WebElement participantStudyInputField;

    /**
     * Status dropdown
     */
    @FindBy(xpath = "//select[@name='x_naci_family_coho_appointment.status']")
    public WebElement statusDropdown;

    /**
     * Status Date input field
     */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_appointment.status_date']")
    public WebElement statusDateInputField;

    /**
     * Status Date calendar button
     */
    @FindBy(xpath = "//a[@name='x_naci_family_coho_appointment.status_date.ui_policy_sensitive']")
    public WebElement statusDateCalendarButton;

    /**
     * Calendar Go to Today button
     */
    @FindBy(xpath = "//td[@aria-label='Go to Today']")
    public WebElement calendarGoToTodayButton;

    /**
     * Report Status dropdown
     */
    @FindBy(xpath = "//select[@name='x_naci_family_coho_appointment.report_status']")
    public WebElement reportStatusDropdown;

    /**
     * Other Report Status (Specify) input field
     */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_appointment.report_status_other_specify']")
    public WebElement otherReportStatusSpecifyInputField;

    /**
     * Scheduled Date/Time calendar button
     */
    @FindBy(xpath = "//button[@class='btn btn-default btn-ref date_time_trigger']")
    public WebElement scheduledDateTimeCalendarButton;

    /**
     * Scheduled Date/Time input field
     */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_appointment.date_time']")
    public WebElement scheduledDateTimeInputField;

    /**
     * Scheduled Date/Time hidden field
     */
    @FindBy(css = ".form-control-static.date-timeago")
    public WebElement scheduledDateTimeHiddenField;

    /**
     * Scheduled Date/Time calendar Go to Today button
     */
    @FindBy(xpath = "//td[@aria-label='Go to Today']")
    public WebElement scheduledDateTimeCalendarGoToTodayButton;

    /**
     * Scheduled Date/Time save button
     */
    @FindBy(xpath = "//button[@aria-label='Save (Enter)']")
    public WebElement scheduledDateTimeCalendarSaveButton;

    /**
     * Notes input field
     */
    @FindBy(xpath = "//input[contains(@aria-labelledby,'label.x_naci_family_coho_appointment.notes')]")
    public WebElement notesInputField;

    /**
     * Save button
     */
    @FindBy(xpath = "//span[contains(@class,'navbar_ui_actions')]//button[contains(@name,'not_important')][normalize-space()='Save']")
    public WebElement saveButton;

    /**
     * Retrieves a web element that represents a label with the specified text content.
     *
     * @param labelText the text content of the label element to locate
     * @return the WebElement representing the label with the specified text content
     */
    public static WebElement getLabel(String labelText) {
        return locateByXpath("//span[@class='label-text'][normalize-space()='" + labelText + "']");
    }

    public NativeViewCHARMSNewAppointmentPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}
