package ServiceNow.CHARMS.Pages;

import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NativeViewCHARMSSubjectFlagsPage {

    /**
     * Participant Textbox
     */
    @FindBy(xpath = "//input[@name='sys_display.x_naci_family_coho_subject_flag.participant']")
    public WebElement participantTextbox;

    /**
     * Study Textbox
     */
    @FindBy(xpath = "//input[@id='sys_display.x_naci_family_coho_subject_flag.study']")
    public WebElement studyTextbox;

    /**
     * Participation Status Dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_subject_flag.participation_status']")
    public WebElement participationStatusDropdown;

    /**
     * Non-Participation Reason Dropdown
     */
    @FindBy(xpath = "//select[@name='x_naci_family_coho_subject_flag.non_participation_reason']")
    public WebElement nonParticipationReasonDropdown;

    /**
     * Other Reason Textbox
     */
    @FindBy(xpath = "//textarea[@name='x_naci_family_coho_subject_flag.other_please_specify']")
    public WebElement otherReasonTextbox;

    /**
     * Hold/Non-Participation Date Calendar
     */
    @FindBy(xpath = "//a[@id='x_naci_family_coho_subject_flag.hold_non_participation_date.ui_policy_sensitive']")
    public WebElement holdNonParticipationDateCalendar;

    /**
     * Go To Today Calendar Button
     */
    @FindBy(xpath = "//td[@aria-label='Go to Today']")
    public WebElement goToTodayCalendarButton;

    /**
     * Hold Reason Textbox
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_subject_flag.hold_reason']")
    public WebElement holdReasonTextbox;

    /**
     * Age Group Dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_subject_flag.age_group']")
    public WebElement ageGroupDropdown;

    /**
     * Preview Record for Field: Study. Button
     */
    @FindBy(xpath = "//button[@aria-label='Preview record for field: Study']")
    public WebElement previewRecordForFieldStudyButton;

    /**
     * IBMFS Affected Status Text
     */
    @FindBy(xpath = "//span[normalize-space()='IBMFS Affected Status']")
    public WebElement IBMFSAffectedStatusText;

    /**
     * IBMFS Affected Status Drop Down
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_subject_flag.ibmfs_affected_status']")
    public WebElement IBMFSAffectedStatusDropDown;

    /**
     * Back Button.
     */
    @FindBy(xpath = "//button[@aria-label='Back']")
    public WebElement backButton;

    /**
     * Submit Button
     */
    @FindBy(xpath = "//button[@id='sysverb_insert']")
    public WebElement submitButton;

    /**
     * Save Button
     */
    @FindBy(xpath = "//button[@id='sysverb_insert_and_stay']")
    public WebElement saveButton;

    /**
     * Sync Updates to Related Records. Button
     */
    @FindBy(xpath = "//button[@id='sync_updates']")
    public WebElement syncUpdatesToRelatedRecordsButton;

    /**
     * Sync Updates to Related Records Alert Text.
     */
    @FindBy(xpath = "//p[contains(text(),'This action will sync subject flags across all CGB')]")
    public WebElement syncUpdatesToRelatedRecordsAlertText;

    /**
     * Sync Updates to Related Records Alert, Yes continue Button.
     */
    @FindBy(xpath = "//button[normalize-space()='Yes, continue']")
    public WebElement alertYesContinueButton;

    /**
     * Sync Updates to Related Records Alert, No cancel Button.
     */
    @FindBy(xpath = "//button[normalize-space()='No, cancel']")
    public WebElement alertNoCancelButton;

    /**
     * Response recieved from server:Sync completed! Message
     */
    @FindBy(xpath = "//span[normalize-space()='Response recieved from server:Sync completed!']")
    public WebElement syncCompletedMessage;

    /**
     * Sync complete for related subject flag records! Message
     */
    @FindBy(xpath = "//span[normalize-space()='Sync complete for related subject flag records!']")
    public WebElement syncCompleteForRelatedSubjectFlagRecordsMessage;

    /**
     * The following mandatory fields are not filled in: IBMFS Affected Status. Error Text
     */
    @FindBy(xpath = "//span[@class='outputmsg_text']")
    public WebElement IBMFSAffectedStatusNotFilledInErrorText;

    public NativeViewCHARMSSubjectFlagsPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}