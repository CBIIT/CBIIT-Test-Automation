package CHARMS.Pages;

import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NativeViewCHARMSParticipantStudyPage {

    /** Native View Participant Study Screener Info Button */
    @FindBy(xpath = "//span[normalize-space()='Screener']//parent::label//parent::div//parent::div//child::div[3]//child::span//child::button")
    public WebElement participantStudyScreenerInfoButton;

    /**
     * Available Questionnaires Button
     */
    @FindBy(xpath = "//button[@id='x_naci_family_coho_participant_study.available_questionnaires_unlock']")
    public WebElement availableQuestionnairesButton;

    /**
     * Select target record for Available Questionnaires. Textbox
     */
    @FindBy(xpath = "//input[@id='sys_display.x_naci_family_coho_participant_study.available_questionnaires']")
    public WebElement availableQuestionnairesRecordSelectTextBox;

    /**
     * Lock Available Questionnaires Button
     */
    @FindBy(xpath = "//button[@title='Lock Available Questionnaires']")
    public WebElement availableQuestionnairesLockButton;

    /**
     * List of available questionnaires
     */
    @FindBy(xpath = "//p[@id='x_naci_family_coho_participant_study.available_questionnaires_nonedit']")
    public WebElement availableQuestionnairesList;

    /**
     * Save Button
     */
    @FindBy(xpath = "//button[@id='sysverb_update_and_stay']")
    public WebElement saveButton;

    /**
     * Publish Questionnaire Button
     */
    @FindBy(xpath = "//button[@id='publish_questionnaire']")
    public WebElement publishQuestionnaireButton;



    public NativeViewCHARMSParticipantStudyPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}
