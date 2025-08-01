package CHARMS.pages;

import APPS_COMMON.PageInitializers.PageInitializer;
import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NativeViewScreeningFollowUpPage extends PageInitializer {

    /**
     * Save button
     */
    @FindBy(xpath = "//button[@id='sysverb_insert_and_stay']")
    public WebElement saveButton;

    /**
     * Study lookup button
     */
    @FindBy(css = "button[id='lookup.x_naci_family_coho_screening_follow_up.study']")
    public WebElement studyLookupButton;

    /**
     * Study input field
     */
    @FindBy(css = "input[id='sys_display.x_naci_family_coho_screening_follow_up.study']")
    public WebElement studyInputField;

    /**
     * Site dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_screening_follow_up.site']")
    public WebElement siteDropdown;

    /**
     * Task Name lookup button
     */
    @FindBy(xpath = "//button[@id='lookup.x_naci_family_coho_screening_follow_up.task_name']")
    public WebElement taskNameLookupButton;

    /**
     * Task Name input field
     */
    @FindBy(xpath = "//input[@id='sys_display.x_naci_family_coho_screening_follow_up.task_name']")
    public WebElement taskNameInputField;

    /**
     * Status dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_screening_follow_up.status']")
    public WebElement statusDropdown;

    /**
     * Status Date calendar button
     */
    @FindBy(xpath = "//a[@id='x_naci_family_coho_screening_follow_up.status_date.ui_policy_sensitive']")
    public WebElement statusDateCalendarButton;

    /**
     * Status Date input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_screening_follow_up.status_date']")
    public WebElement statusDateInputField;

    /**
     * Due Date calendar button
     */
    @FindBy(xpath = "//a[@id='x_naci_family_coho_screening_follow_up.due_date.ui_policy_sensitive']")
    public WebElement dueDateCalendarButton;

    /**
     * Due Date input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_screening_follow_up.due_date']")
    public WebElement dueDateInputField;

    /**
     * Event Type dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_screening_follow_up.event_type']")
    public WebElement eventTypeDropdown;

    /**
     * Calendar Go to Today button
     */
    @FindBy(xpath = "//td[@aria-label='Go to Today']")
    public WebElement goToTodayButton;

    /**
     * Details RL - Duration (hours) input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_screening_follow_up.duration_hours']")
    public WebElement durationHoursInputField;

    /**
     * Details RL - Staff input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_screening_follow_up.staff']")
    public WebElement staffInputField;

    /**
     * Details RL - Date/Time calendar button
     */
    @FindBy(xpath = "//span[@class='input-group ']//button[@id='x_naci_family_coho_screening_follow_up.date_time.ui_policy_sensitive']")
    public WebElement dateTimeCalendarButton;

    /**
     * Details RL - Date/Time calendar ok button
     */
    @FindBy(xpath = "//button[@id='GwtDateTimePicker_ok']")
    public WebElement dateTimeCalendarOkButton;

    /**
     * Details RL - Date/Time calendar input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_screening_follow_up.date_time']")
    public WebElement dateTimeCalendarInputField;

    /**
     * Details RL - Location input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_screening_follow_up.location']")
    public WebElement locationInputField;

    /**
     * Details RL - Report Status dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_screening_follow_up.report_status']")
    public WebElement reportStatusDropdown;

    /**
     * Details RL - Report Status (specify) input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_screening_follow_up.other_report_status_specify']")
    public WebElement reportStatusSpecifyInputField;

    /**
     * Details RL - Report Status Date calendar button
     */
    @FindBy(xpath = "//a[@id='x_naci_family_coho_screening_follow_up.report_status_date.ui_policy_sensitive']")
    public WebElement reportStatusDateCalendarButton;

    /**
     * Details RL - Report Status Date calendar input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_screening_follow_up.report_status_date']")
    public WebElement reportStatusDateCalendarInputField;

    /**
     * Details RL - Media Status dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_screening_follow_up.media_status']")
    public WebElement mediaStatusDropdown;

    /**
     * Details RL - Other Media Status(specify) input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_screening_follow_up.other_media_status_specify']")
    public WebElement otherMediaStatusInputField;

    /**
     * Details RL - Media Status Date calendar button
     */
    @FindBy(xpath = "//a[@id='x_naci_family_coho_screening_follow_up.media_status_date.ui_policy_sensitive']")
    public WebElement mediaStatusDateCalendarButton;

    /**
     * Details RL - Media Status Date input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_screening_follow_up.media_status_date']")
    public WebElement mediaStatusDateInputField;

    /**
     * Screening Reminders RL - Screening Reminder 1 Date input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_screening_follow_up.screening_reminder_1_date']")
    public WebElement screeningReminder1InputField;

    /**
     * Screening Reminders RL - Screening Reminder 1 Status dropdown
     */
    @FindBy(css = "select[id='x_naci_family_coho_screening_follow_up.screening_reminder_1_status']")
    public WebElement screeningReminderStatus1Dropdown;

    /**
     * Screening Reminders RL - Other Reminder 1 Status input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_screening_follow_up.other_screening_reminder_1']")
    public WebElement otherReminder1StatusInputField;

    /**
     * Screening Reminders RL - Screening Reminder 2 Date input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_screening_follow_up.screening_reminder_2_date']")
    public WebElement screeningReminder2InputField;

    /**
     * Screening Reminders RL - Screening Reminder 2 Status dropdown
     */
    @FindBy(css = "select[id='x_naci_family_coho_screening_follow_up.screening_reminder_2_status']")
    public WebElement screeningReminderStatus2Dropdown;

    /**
     * Screening Reminders RL - Screening Reminder 2 Date input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_screening_follow_up.other_screening_reminder_2']")
    public WebElement otherReminder2StatusInputField;

    /**
     * Screening Reminders RL - Screening Reminder 3 Date input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_screening_follow_up.screening_reminder_3_date']")
    public WebElement screeningReminder3InputField;

    /**
     * Screening Reminders RL - Screening Reminder 3 Status dropdown
     */
    @FindBy(css = "select[id='x_naci_family_coho_screening_follow_up.screening_reminder_3_status']")
    public WebElement screeningReminderStatus3Dropdown;

    /**
     * Screening Reminders RL - Screening Reminder 3 Date input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_screening_follow_up.other_screening_reminder_3']")
    public WebElement otherReminder3StatusInputField;

    public NativeViewScreeningFollowUpPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}