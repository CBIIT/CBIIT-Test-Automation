package ServiceNow.CHARMS.Pages;

import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NativeViewCHARMSAddNewParticipantPage {

    /**
     * Subject ID text box
     */
    @FindBy(xpath = "//input[@id='sys_readonly.x_naci_family_coho_family_history_details.full_family_id']")
    public WebElement subjectIDTextBox;

    /**
     * Family text box
     */
    @FindBy(xpath = "//input[@id='sys_display.x_naci_family_coho_family_history_details.family']")
    public WebElement familyIDTextBox;

    /**
     * Is there an existing FSID? Checkbox
     */
    @FindBy(xpath = "//label[@aria-label='Is there an existing FSID?']")
    public WebElement isThereAnExistingFSIDCheckbox;

    /**
     * FSID to use text box
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_family_history_details.fsid_to_use']")
    public WebElement FSIDToUseTextBox;

    /**
     * Unlock Studies button
     */
    @FindBy(xpath = "//button[@id='x_naci_family_coho_family_history_details.studies_unlock']")
    public WebElement unlockStudiesButton;

    /**
     * Studies textbox
     */
    @FindBy(xpath = "//input[@id='sys_display.x_naci_family_coho_family_history_details.studies']")
    public WebElement studiesTextBox;

    /**
     * Look up using list button
     */
    @FindBy(xpath = "//button[@id='lookup.x_naci_family_coho_family_history_details.studies']")
    public WebElement lookUpUsingListButton;

    /**
     * Relationship to Proband dropdown
     */
    @FindBy(xpath = "//select[@name='x_naci_family_coho_family_history_details.relationship_to_you']")
    public WebElement relationshipToProbandDropdown;

    /**
     * First Name textbox
     */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_family_history_details.first_name']")
    public WebElement firstNameTextBox;

    /**
     * Last Name textbox
     */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_family_history_details.last_name']")
    public WebElement lastNameTextBox;

    /**
     * Save record and remain here button
     */
    @FindBy(xpath = "//button[@id='sysverb_insert_and_stay']")
    public WebElement saveRecordAndRemainHereButton;

    /**
     * Delete record button
     */
    @FindBy(xpath = "//button[@id='deleteRecord']")
    public WebElement deleteRecordButton;

    /**
     * WARNING: FSID will not generate for Other or Unknown relationship. But if you have an existing FSID, you may go ahead to enter below and save the data. Text
     */
    @FindBy(xpath = "//span[normalize-space()='WARNING: FSID will not generate for Other or Unknown relationship. But if you have an existing FSID, you may go ahead to enter below and save the data.']")
    public WebElement warningFSIDWillNotGenerateForOtherOrUnknownRelationshipText;

    /**
     * ERROR: New participant data will NOT be saved for Other or Unknown relationship
     */
    @FindBy(xpath = "//span[normalize-space()='ERROR: New participant data will NOT be saved for Other or Unknown relationship']")
    public WebElement errorNewParticipantDataWillNOTBeSavedForOtherOrUnknownRelationshipText;

    public NativeViewCHARMSAddNewParticipantPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}
