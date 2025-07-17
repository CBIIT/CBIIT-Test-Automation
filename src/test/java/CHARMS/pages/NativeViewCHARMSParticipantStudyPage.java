package CHARMS.pages;

import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static APPS_COMMON.Pages.Selenium_Common_Locators.locateByXpath;

public class NativeViewCHARMSParticipantStudyPage {

    /*** Participant input field
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
     * Current reconsent record preview button
     */
    @FindBy(xpath = "//a[normalize-space()='Current']/parent::td/parent::tr//a[contains(@aria-label,'Preview record')]")
    public WebElement currentReconsentRecordPreviewButton;

    /**
     * "Do you have a FSID for this participant? If you do, please enter it here." Heading
     */
    @FindBy(xpath = "//input[@placeholder='Enter Subject ID']")
    public WebElement doYouHaveAFSIDForThisParticipantHeading;

    /**
     * Enter Subject ID field for pop up "Do you have a FSID for this participant? If you do, please enter it here."
     */
    @FindBy(xpath = "//input[@placeholder='Enter Subject ID']")
    public WebElement enterSubjectIDField;

    /**
     * "Confirm" button for pop up "Do you have a FSID for this participant? If you do, please enter it here."
     */
    @FindBy(xpath = "//button[normalize-space()='Confirm']")
    public WebElement confirmButton;

    /**
     * "A new Subject ID has been generated, enrollment status updated to 'Awaiting Consent', and the participant is now eligible." Text
     */
    @FindBy(xpath = "//div[@ng-show='c.data.update']//p[@class='ng-binding'][contains(text(),'A new Subject ID has been generated')]")
    public WebElement aNewSubjectIDHasBeenGeneratedText;

    /**
     * "No" button for pop up "Do you have a FSID for this participant? If you do, please enter it here."
     */
    @FindBy(xpath = "//button[normalize-space()='No']")
    public WebElement noButton;

    /**
     * "Close" button for pop up "Do you have a FSID for this participant? If you do, please enter it here."
     */
    @FindBy(css = ".gb_close.icon-cross-circle.i12.i12_close")
    public WebElement closeButton;

    /**
     * Finds and returns the WebElement for the current or previous consent record based on the Current/Previous status
     *
     * @param currentPreviousStatus the status text used to identify the consent record (e.g., "Current" or "Previous").
     * @return the WebElement representing the preview link for the specified current or previous consent record.
     */
    public static WebElement findCurrentOrPreviousConsentRecord(String currentPreviousStatus) {
        return locateByXpath("//a[contains(@aria-label, '" + currentPreviousStatus + " - Open record')]/parent::td/parent::tr//a[contains(@aria-label,'Preview record')]");
    }

    /* Method to dynamically locate Input Value elements in Native View */
    public WebElement dynamicLocatorForInputElements(String text) {
        return WebDriverUtils.webDriver.findElement(By.xpath("(//input[@id='sys_display.x_naci_family_coho_participant_study." + text + "'])[1]"));
    }

    /* Method to dynamically locate elements in Native View */
    public WebElement dynamicLocatorUsingDataNormalizeSpaceInSpan(String text) {
        return WebDriverUtils.webDriver.findElement(By.xpath("(//span[@data-html='false'][normalize-space()='" + text + "'])[1]"));
    }

    /* Method to dynamically locate Select Value elements in Native View */
    public WebElement dynamicLocatorForSelectElements(String text) {
        return WebDriverUtils.webDriver.findElement(By.xpath("(//select[@id='x_naci_family_coho_participant_study." + text + "'])[1]"));
    }

    /* Method to dynamically locate elements in Native View */
    public WebElement dynamicLocatorContainsText1(String text) {
        return WebDriverUtils.webDriver.findElement(By.xpath("(//span[@class='label-text'][normalize-space()='Screener'])[1]"));
    }

    /* Method to dynamically locate elements in Native View */
    public WebElement dynamicLocatorContainsText(String text) {
        return WebDriverUtils.webDriver.findElement(By.xpath("//*[contains(text(),'" + text + "')]"));
    }

    /* Method to dynamically locate CheckBox labels in Fanconi study page in Native View */
    public WebElement dynamicLocatorForCheckBoxElements1(String text) {
        return WebDriverUtils.webDriver.findElement(By.xpath("(//label[@id='label.ni.x_naci_family_coho_participant_study." + text + "'])[1]"));
    }

    /* Method to dynamically locate CheckBox labels in Fanconi study page in Native View */
    public WebElement dynamicLocatorForCheckBoxElements(String text) {
        return WebDriverUtils.webDriver.findElement(By.xpath("(//input[@id='ni.x_naci_family_coho_participant_study." + text + "'])[1]"));
    }

    /* NV Study Page: Subject Id Input value  */
    @FindBy(xpath = "(//input[@id='sys_readonly.x_naci_family_coho_participant_study.participant.name'])[1]")
    public WebElement nVParticipantNameValue;

    /* NV Study Page: NIH MRN number Input value  */
    @FindBy(xpath = "(//input[@id='x_naci_family_coho_participant_study.participant.nih_number'])[1]")
    public WebElement nVParticipantNIHMRNNumberInput;

    /*NV Screener Referral Preview button */
    @FindBy(xpath = "(//button[@id='viewr.x_naci_family_coho_participant_study.screener_ref'])[1]")
    public WebElement nVFScreenerRefPreviewRecordButton;

    /* NV Screener: Open Record button */
    @FindBy(xpath = "(//a[normalize-space()='Open Record'])[1]")
    public WebElement nVFScreenerOpenRecordButton;

    @FindBy(xpath = "(//span[normalize-space()='Proxy Contact Info'])[1]")
    public WebElement nVParticipantProxyContactInfoTab;

    /* USE THIS METHOD TO DYNAMICALLY LOCATE RECORD BUTTONS ON */
    public WebElement dynamicPreviewButtonLocator1(String text) {
        return WebDriverUtils.webDriver.findElement(By.xpath("//*[text()='" + text + "']//parent::tr/td[2]"));
    }

    public WebElement dynamicPreviewButtonLocator(String text) {
        return WebDriverUtils.webDriver.findElement(By.xpath("(//a[normalize-space()='" + text + "'])[1]"));
    }

    public WebElement dynamicPreviewButtonLocators(String text) {
        return WebDriverUtils.webDriver.findElement(By.xpath("(//a[@aria-label='Preview record:’” +text+”'])[1]"));
    }

    /* Method to dynamically locate elements in Native View */
    public WebElement dynamicLocatorUsingLabel(String text) {
        return WebDriverUtils.webDriver.findElement(By.xpath("//label[@aria-label='" + text + "']"));
    }

    /* Method to dynamically locate elements in Native View */
    public WebElement dynamicLocatorUsingNormalizeSpace(String text) {
        return WebDriverUtils.webDriver.findElement(By.xpath("//*[normalize-space()='" + text + "']"));
    }

    /* Method to dynamically locate elements in Native View */
    public WebElement dynamicLocatorUsingSpanNormalizeSpace(String text) {
        return WebDriverUtils.webDriver.findElement(By.xpath("(//span[normalize-space()='" + text + "'])[1]"));
    }

    /* Method to dynamically locate text elements in Native View */
    public WebElement dynamicLocatorUsingNormalizeSpaceInSpan(String text) {
        return WebDriverUtils.webDriver.findElement(By.xpath("//span[@class='label-text'][normalize-space()='" + text + "']"));
    }

    /* Method to dynamically locate Read Only Input Values in Participant Details page for Fanconi Native View */
    public WebElement dynamicLocatorForReadOnlyInputValuesInParticipantDetailsPage(String text) {
        return WebDriverUtils.webDriver.findElement(By.xpath("(//input[@id='sys_readonly.x_naci_family_coho_family_history_details." + text + "'])[1]"));
    }

    /* Method to dynamically locate Display only Input Values in Participant Details page for Fanconi Native View */
    public WebElement dynamicLocatorForInputElementsInParticipantDetailsPage(String text) {
        return WebDriverUtils.webDriver.findElement(By.xpath("(//input[@id='sys_display.x_naci_family_coho_family_history_details." + text + "'])[1]"));
    }

    /* Method to dynamically locate Input Values added by the user in Participant Details page for Fanconi Native View */
    public WebElement dynamicLocatorForInputElementInParticipantDetailsPage(String text) {
        return WebDriverUtils.webDriver.findElement(By.xpath("(//input[@id='x_naci_family_coho_family_history_details." + text + "'])[1]"));
    }

    /* Method to dynamically locate Read Only select Values by the user in Participant Details page for Fanconi Native View */
    public WebElement dynamicLocatorForReadOnlySelectValuesInParticipantDetailsPage(String text) {
        return WebDriverUtils.webDriver.findElement(By.xpath("(//select[@id='sys_readonly.x_naci_family_coho_family_history_details." + text + "'])[1]"));
    }

    /* Method to dynamically locate editable select Values by the user in Participant Details page for Fanconi Native View */
    public WebElement dynamicLocatorForSelectElementsInParticipantDetailsPage(String text) {
        return WebDriverUtils.webDriver.findElement(By.xpath("(//select[@id='x_naci_family_coho_family_history_details." + text + "'])[1]"));
    }

    /* CHARMS Navigation-> All Participant Details Back Button */
    @FindBy(xpath = "(//button[@aria-label='Back'])[1]")
    public static WebElement nVAllParticipantDetailsBackButton;

    /* Participant--> Search column: button*/
    @FindBy(xpath = "(//button[@class='list_header_search_toggle icon-search btn btn-icon table-btn-lg'])[1]")
    public WebElement nVParticipantSearchColumnButton;

    /* Participant--> Search column: name TextBox */
    @FindBy(xpath = "(//input[@aria-label='Search column: name'])[1]")
    public WebElement nVParticipantSearchColumnName;

    /* Participant--> Enrollment Status */
    @FindBy(xpath = "(//select[@id='sys_readonly.x_naci_family_coho_family_history_details.enrollment_status'])[1]")
    public WebElement nVParticipantEnrollmentStatus;

    /* Participant--> Studies */
    @FindBy(xpath = "(//span[@id='x_naci_family_coho_family_history_details.studies_edit'] | //p[@id='x_naci_family_coho_family_history_details.studies_nonedit'])[2]")
    public WebElement nVParticipantStudies;

    /* Participant--> NIH MRN number Info =NIH MRN number should include the dashes */
    @FindBy(xpath = "(//div[@class='fieldmsg notification notification-info'])[1]")
    public WebElement nVParticipantNIHMRNnumberInfo;

    /* PERSONAL INFORMATION tab */
    @FindBy(xpath = "(//span[normalize-space()='Personal Information'])[1]")
    public WebElement nVParticipantPersonalInformationTab;

    /* DEMOGRAPHICS tab */
    @FindBy(xpath = "(//span[normalize-space()='Demographics'])[1]")
    public WebElement nVParticipantDemographicsTab;

    /* DEMOGRAPHICS tab-> Participant Race details (Select all that apply) */
    @FindBy(xpath = "(//p[@id='x_naci_family_coho_family_history_details.race_nonedit'])[1]")
    public WebElement nVParticipantDemographicsTabRaceDetails;

    /* CONTACT INFO tab */
    @FindBy(xpath = "(//span[normalize-space()='Contact Info'])[1]")
    public WebElement nVParticipantContactInfoTab;

    @FindBy(xpath = "(//button[@id='study_panel_review'])[1]")
    public WebElement nVParticipantSubmitForEligibilityReviewButton;

    @FindBy(xpath = "(//button[@id='mark_eligible'])[1]")
    public WebElement nVParticipantMarkEligibleButton;

    // Hold/Non-Participant Date Text Box
    @FindBy(xpath = "(//input[@id='x_naci_family_coho_family_history_details.u_participantdate'])[1]")
    public WebElement nVParticipantHoldDateTextBox;

    // Hold/Non-Participant Date Button
    @FindBy(xpath = "(//span[@class='icon icon-calendar'])[3]")
    public WebElement nVParticipantHoldDateButton;

    // Hold/Non-Participant Date Button
    @FindBy(xpath = "(//td[@aria-label='Go to Today'])[1]")
    public WebElement nVParticipantHoldGoToTodayButton;

    @FindBy(xpath = "(//span[normalize-space()='Consents (1)'])[1]")
    public WebElement nVParticipantConsentTableTab;

    @FindBy(xpath = "(//tbody[@class='list2_body']//tr/td[2])[1]")
    public WebElement nVParticipantConsentTablePreviewLink;

    @FindBy(xpath = "(//a[normalize-space()='Open Record'])[1]")
    public WebElement nVParticipantOpenRecordButton;

    @FindBy(xpath = "(//input[@id='sys_display.x_naci_family_coho_fcsms_consent.family_member'])[1]")
    public WebElement nVParticipantFamilyMemberTextBox;

    // Consent call scheduled time
    @FindBy(xpath = "(//input[@id='x_naci_family_coho_fcsms_consent.consent_call_scheduled_time'])[1]")
    public WebElement nVParticipantConsentCallScheduledTimeTextBox;

    // Consent call Date time Icon
    @FindBy(xpath = "(//span[@class='icon-calendar icon'])[1]")
    public WebElement nVParticipantTimeIcon;

    // Consent call scheduled time-->Go to today Date link
    @FindBy(xpath = "(//td[@aria-label='Go to Today'])[1]")
    public WebElement nVParticipantGoToToday;

    // Consent call Date time Icon Close Button
    @FindBy(xpath = "(//button[@id='GwtDateTimePicker_ok'])[1]")
    public WebElement nVParticipantTimeIconOkButton;

    // Consent Call Date
    @FindBy(xpath = "(//input[@id='x_naci_family_coho_fcsms_consent.consent_call_date'])[1]")
    public WebElement nVParticipantConsentCallDatesTextBox;

    // Consent call Date time Icon
    @FindBy(xpath = "(//span[contains(@class,'icon icon-calendar')])[2]")
    public WebElement nVParticipantTimeIcon1;

    // Cohort
    @FindBy(xpath = "(//select[@id='x_naci_family_coho_fcsms_consent.family_member.cohort'])[1]")
    public WebElement nVParticipantCohortTextBox;

    // Consent Form
    @FindBy(xpath = "(//select[@id='x_naci_family_coho_fcsms_consent.consent_form'])[1]")
    public WebElement nVParticipantConsentFormDropDown;

    // Consent Version
    @FindBy(xpath = "(//input[@id='x_naci_family_coho_fcsms_consent.consent_version'])[1]")
    public WebElement nVParticipantConsentVersionTextBox;

    // Consent Type
    @FindBy(xpath = "(//select[@id='x_naci_family_coho_fcsms_consent.consent_type'])[1]")
    public WebElement nVParticipantConsentTypeDropDown;

    // Consent call Date time Icon
    @FindBy(xpath = "(//span[@class='icon icon-calendar'])[3]")
    public WebElement nVParticipantTimeIcon3;

    // Response Type
    @FindBy(xpath = "(//select[@id='x_naci_family_coho_fcsms_consent.response_type'])[1]")
    public WebElement nVParticipantResponseTypeDropDown;

    // Consent Status
    @FindBy(xpath = "(//select[@id='x_naci_family_coho_fcsms_consent.status'])[1]")
    public WebElement nVParticipantConsentStatusTextBox;

    // Consent Date
    @FindBy(xpath = "(//input[@id='x_naci_family_coho_fcsms_consent.consent_date'])[1]")
    public WebElement nVParticipantConsentDateTextBox;

    // Consent Date time Icon
    @FindBy(xpath = "(//span[@class='icon icon-calendar'])[4]")
    public WebElement nVParticipantTimeIcon4;

    // Current/Previous
    @FindBy(xpath = "(//select[@id='x_naci_family_coho_fcsms_consent.current_previous'])[1]")
    public WebElement nVParticipantCurrentPreviousDropDown;

    // Study
    @FindBy(xpath = "(//input[@id='sys_display.x_naci_family_coho_fcsms_consent.study'])[1]")
    public WebElement nVParticipantStudyTextBox;

    // Consent/Assent Status
    @FindBy(xpath = "(//select[@id='x_naci_family_coho_fcsms_consent.participant_response'])[1]")
    public WebElement nVParticipantConsentAssentStatusDropDown;

    // Interpreter used?
    @FindBy(xpath = "(//select[@id='x_naci_family_coho_fcsms_consent.interpreter_used'])[1]")
    public WebElement nVParticipantInterpreterUsedDropDown;

    // Future Use of Specimens and Data by NIH
    @FindBy(xpath = "(//select[@id='x_naci_family_coho_fcsms_consent.future_use_of_specimens_and_data_by_nih'])[1]")
    public WebElement nVParticipantFutureUseOfSpecimensAndDataByNIHDropDown;

    // Future Use by Collaborators
    @FindBy(xpath = "(//select[@id='x_naci_family_coho_fcsms_consent.future_use_by_collaborators'])[1]")
    public WebElement nVParticipantFutureUseByCollaboratorsDropDown;

    // Future Identifiable Use by Collaborators
    @FindBy(xpath = "(//select[@id='x_naci_family_coho_fcsms_consent.future_identifiable_use_by_collaborators'])[1]")
    public WebElement nVParticipantFutureIdentifiableUseByCollaboratorsDropDown;

    // Return of Genetic Findings
    @FindBy(xpath = "(//select[@id='x_naci_family_coho_fcsms_consent.return_of_genetic_findings'])[1]")
    public WebElement nVParticipantReturnOfGeneticFindingsDropDown;

    // Participant Assent
    @FindBy(xpath = "(//select[@id='x_naci_family_coho_fcsms_consent.participant_assent'])[1]")
    public WebElement nVParticipantParticipantAssentDropDown;

    // Participant Consent
    @FindBy(xpath = "(//select[@id='x_naci_family_coho_fcsms_consent.participant_consent'])[1]")
    public WebElement nVParticipantParticipantConsentDropDown;

    // Call Complete Button
    @FindBy(xpath = "(//button[@id='call_complete'])[1]")
    public WebElement nVParticipantCallCompleteButton;

    // Attachment button
    @FindBy(xpath = "(//button[@id='header_add_attachment'])[1]")
    public WebElement nVParticipantAttachmentButton;

    // Choose File
    @FindBy(xpath = "(//input[@id='loadFileXml'])[1]")
    public WebElement nVParticipantChooseFileButton;

    @FindBy(xpath = "(//button[@id='hard_consent_received'])[1]")
    public WebElement nVParticipantHardCopyOfConsentReceivedButton;

    public NativeViewCHARMSParticipantStudyPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}