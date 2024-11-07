package ServiceNow.CHARMS.Pages;

import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NativeViewCHARMSSubjectFlagsPage {

    /**
     * Native View Participant Textbox
     */
    @FindBy(xpath = "//input[@name='sys_display.x_naci_family_coho_subject_flag.participant']")
    public WebElement participantTextbox;

    /**
     * Native View Subject Flags Study Textbox
     */
    @FindBy(xpath = "//input[@id='sys_display.x_naci_family_coho_subject_flag.study']")
    public WebElement studyTextbox;

    /**
     * Native View Subject Flags Participation Status Dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_subject_flag.participation_status']")
    public WebElement participationStatusDropdown;

    /**
     * Native View Subject Flags Non-Participation Reason Dropdown
     */
    @FindBy(xpath = "//select[@name='x_naci_family_coho_subject_flag.non_participation_reason']")
    public WebElement nonParticipationReasonDropdown;

    /**
     * Native View Subject Flags Other Reason Textbox
     */
    @FindBy(xpath = "//textarea[@name='x_naci_family_coho_subject_flag.other_please_specify']")
    public WebElement otherReasonTextbox;

    /**
     * Native View Subject Flags Hold/Non-Participation Date Calendar
     */
    @FindBy(xpath = "//a[@id='x_naci_family_coho_subject_flag.hold_non_participation_date.ui_policy_sensitive']")
    public WebElement holdNonParticipationDateCalendar;

    /**
     * Native View Subject Flags Go To Today Calendar Button
     */
    @FindBy(xpath = "//td[@aria-label='Go to Today']")
    public WebElement goToTodayCalendarButton;

    /**
     * Native View Subject Flags Hold Reason Textbox
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_subject_flag.hold_reason']")
    public WebElement holdReasonTextbox;

    /**
     * Native View Subject Flags Age Group Dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_subject_flag.age_group']")
    public WebElement ageGroupDropdown;

    /**
     * Native View Subject Flags Preview Record for Field: Study. Button
     */
    @FindBy(xpath = "//button[@aria-label='Preview record for field: Study']")
    public WebElement previewRecordForFieldStudyButton;

    /**
     * Native View Subject Flags IBMFS Affected Status Text
     */
    @FindBy(xpath = "//span[normalize-space()='IBMFS Affected Status']")
    public WebElement IBMFSAffectedStatusText;

    /**
     * Native View Subject Flags IBMFS Affected Status Drop Down
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_subject_flag.ibmfs_affected_status']")
    public WebElement IBMFSAffectedStatusDropDown;


    /**
     * Native View Subject Flags Back Button.
     */
    @FindBy(xpath = "//button[@aria-label='Back']")
    public WebElement backButton;

    /**
     * Native View Subject Flags Submit Button
     */
    @FindBy(xpath = "//button[@id='sysverb_insert']")
    public WebElement submitButton;

    /**
     * Native View Subject Flags Save Button
     */
    @FindBy(xpath = "//button[@id='sysverb_insert_and_stay']")
    public WebElement saveButton;

    /**
     * Native View Subject Flags Sync Updates to Related Records. Button
     */
    @FindBy(xpath = "//button[@id='sync_updates']")
    public WebElement syncUpdatesToRelatedRecordsButton;

    /**
     * Native View Subject Flags Sync Updates to Related Records Alert Text.
     */
    @FindBy(xpath = "//p[contains(text(),'This action will sync subject flags across all CGB')]")
    public WebElement syncUpdatesToRelatedRecordsAlertText;

    /**
     * Native View Subject Flags Sync Updates to Related Records Alert, Yes continue Button.
     */
    @FindBy(xpath = "//button[normalize-space()='Yes, continue']")
    public WebElement alertYesContinueButton;

    /**
     * Sync Updates to Related Records Alert, No cancel Button.
     */
    @FindBy(xpath = "//button[normalize-space()='No, cancel']")
    public WebElement alertNoCancelButton;

    /**
     * Native View Subject Flags Response recieved from server:Sync completed! Message
     */
    @FindBy(xpath = "//span[normalize-space()='Response recieved from server:Sync completed!']")
    public WebElement syncCompletedMessage;

    /**
     * Native View Subject Flags Sync complete for related subject flag records! Message
     */
    @FindBy(xpath = "//span[normalize-space()='Sync complete for related subject flag records!']")
    public WebElement syncCompleteForRelatedSubjectFlagRecordsMessage;

    /**
     * Native View Subject Flags The following mandatory fields are not filled in: IBMFS Affected Status. Error Text
     */
    @FindBy(xpath = "//span[@class='outputmsg_text']")
    public WebElement IBMFSAffectedStatusNotFilledInErrorText;

    public NativeViewCHARMSSubjectFlagsPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}