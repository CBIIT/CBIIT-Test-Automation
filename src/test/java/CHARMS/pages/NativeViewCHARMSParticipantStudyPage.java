package CHARMS.pages;

import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static APPS_COMMON.Pages.Selenium_Common_Locators.locateByXpath;

public class NativeViewCHARMSParticipantStudyPage {

    /**
     * Participant input field
     */
    @FindBy(xpath = "//input[@name='sys_display.x_naci_family_coho_participant_study.participant']")
    public WebElement participantInputField;

    /**
     * Native View Participant Study Screener Info Button
     */
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

    /**
     * Question Banks Tab
     */
    @FindBy(xpath = "//span[@class ='tab_caption_text' and contains(text(), 'Question Banks')]")
    public WebElement questionBanksTab;

    /**
     * Survey Type Patient Smoking History Text
     */
    @FindBy(xpath = "//td[normalize-space()='Patient Smoking History']")
    public WebElement patientSmokingHistoryText;

    /**
     * Survey Type Physical Activities Survey Text
     */
    @FindBy(xpath = "//tr[@record_class='x_naci_family_coho_question_bank']//td[normalize-space()='Physical Activities Survey']")
    public WebElement physicalActivitiesSurveyText;

    /**
     * Question Banks Preview Button
     */
    @FindBy(xpath = "//*[@data-list_id='x_naci_family_coho_participant_study.x_naci_family_coho_question_bank.participant_study']//child::tbody//child::tr//child::td[2]//child::a")
    public WebElement questionBanksPreviewButton;

    /**
     * CGB IIQ Tab
     */
    @FindBy(xpath = "//span[@class = 'tab_header']//span[contains(text(), 'CGB IIQ')]")
    public WebElement cgbIIQTab;

    /**
     * RASopathy Survey text
     */
    @FindBy(xpath = "//td[normalize-space()='RASopathy Survey']")
    public WebElement rasopathySurveyText;

    /**
     * RASopathy Survey preview button
     */
    @FindBy(xpath = "//tr[@record_class='x_naci_family_coho_rasopathy_iiq']//a[@class='btn btn-icon table-btn-lg icon-info list_popup']")
    public WebElement rasopathySurveyPreviewButton;

    /**
     * RASopathy Survey re-consent button
     */
    @FindBy(xpath = "//span[contains(@class,'navbar_ui_actions')]//button[contains(@name,'not_important')][normalize-space()='Re-Consent']")
    public WebElement reConsentButton;

    /**
     * RASopathy Survey Subject Flags tab
     */
    @FindBy(xpath = "//span[@class='tab_caption_text' and contains(text(), 'Subject Flags')]")
    public WebElement subjectFlagsTab;

    /**
     * RASopathy Survey Subject Flags tab
     */
    @FindBy(xpath = "//tr[@record_class='x_naci_family_coho_subject_flag']//a[contains(@aria-label, 'Preview record')]")
    public WebElement subjectFlagsRecordPreviewButton;

    /**
     * Finds and returns the WebElement for the current or previous consent record based on the Current/Previous status
     *
     * @param currentPreviousStatus the status text used to identify the consent record (e.g., "Current" or "Previous").
     * @return the WebElement representing the preview link for the specified current or previous consent record.
     */
    public static WebElement findCurrentOrPreviousConsentRecord(String currentPreviousStatus) {
        return locateByXpath("//a[contains(@aria-label, '" + currentPreviousStatus + " - Open record')]/parent::td/parent::tr//a[contains(@aria-label,'Preview record')]");
    }

    public NativeViewCHARMSParticipantStudyPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}