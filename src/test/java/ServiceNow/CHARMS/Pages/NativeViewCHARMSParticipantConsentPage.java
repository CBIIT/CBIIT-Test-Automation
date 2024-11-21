package ServiceNow.CHARMS.Pages;

import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NativeViewCHARMSParticipantConsentPage {

    /**
     * Native View Ras Study Consent Call Schedule Time Calendar
     */
    @FindBy(xpath = "//*[@id='element.x_naci_family_coho_fcsms_consent.consent_call_scheduled_time']//child::div[2]//child::div[2]//child::span//child::span[1]//child::button")
    public WebElement rasStudyConsentCallScheduleTimeCalendar;

    /**
     * Native View Ras Study Consent Call Date Calendar
     */
    @FindBy(xpath = "//*[@id='element.x_naci_family_coho_fcsms_consent.consent_call_date']//child::div[2]//child::span[1]//child::span[1]//child::a")
    public WebElement rasStudyConsentCallScheduleDateCalendar;

    /**
     * Native View Ras Study Consent Date Calendar
     */
    @FindBy(xpath = "//*[@id='element.x_naci_family_coho_fcsms_consent.consent_date']//child::div[2]//child::span[1]//child::span[1]//child::a")
    public WebElement rasStudyConsentDateCalendar;

    /**
     * Native View Ras Study Cohort Dropdown
     */
    @FindBy(xpath = "//select[@name='x_naci_family_coho_fcsms_consent.participant_study.cohort']")
    public WebElement rasStudyConsentCohortDropDown;

    /**
     * Native View Ras Study Consent Form Dropdown
     */
    @FindBy(xpath = "//select[@name='x_naci_family_coho_fcsms_consent.consent_form']")
    public WebElement rasStudyConsentFormDropDown;

    /**
     * Consent Date Textbox
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_fcsms_consent.consent_date']")
    public WebElement rasStudyConsentDateTextBox;

    /**
     * Native View Ras Study Consent version Calendar
     */
    @FindBy(xpath = "//*[@id='element.x_naci_family_coho_fcsms_consent.consent_version']//child::div[2]//child::span[1]//child::span[1]//child::a")
    public WebElement rasStudyConsentCallScheduleVersionCalendar;

    /**
     * Native View Ras Study Consent Call Schedule Time Go To Today Button
     */
    @FindBy(xpath = "//td[@aria-label='Go to Today']")
    public WebElement rasStudyConsentCallScheduleTimeTodayButton;

    /**
     * Native View Ras Study Consent Call Schedule Time Accept Button
     */
    @FindBy(xpath = "//button[@id='GwtDateTimePicker_ok']")
    public WebElement rasStudyConsentCallScheduleTimeAcceptButton;

    /**
     * Native View Ras Study Consent/Assent Category Drop Down
     */
    @FindBy(xpath = "//select[@name='x_naci_family_coho_fcsms_consent.consent_type']")
    public WebElement rasStudyConsentAssentCategoryDropDown;

    /**
     * Native View Ras Study Consent Collection Method Drop Down
     */
    @FindBy(xpath = "//*[@id='x_naci_family_coho_fcsms_consent.response_type']")
    public WebElement rasStudyConsentCollectionMethodDropDown;

    /**
     * Native View Ras Study Consent Status Text Box
     */
    @FindBy(xpath = "//select[@name='x_naci_family_coho_fcsms_consent.status']")
    public WebElement rasStudyConsentStatusTextBox;

    /**
     * Was verbal assent obtained? Dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_fcsms_consent.was_verbal_assent_obtained']")
    public WebElement rasStudyConsentWasVerbalAssentObtainedDropDown;

    /**
     *
     */
    @FindBy(xpath = "//input[@name='sys_display.x_naci_family_coho_fcsms_consent.assigned_to']")
    public WebElement rasStudyConsentAssignedToTextBox;

    /**
     * Native View Ras Study Consent By Text Box
     */
    @FindBy(xpath = "//*[@id='sys_display.x_naci_family_coho_fcsms_consent.consent_by']")
    public WebElement rasStudyConsentByTextBox;

    /**
     * Native View Ras Study Current Drop Down
     */
    @FindBy(xpath = "//*[@id='x_naci_family_coho_fcsms_consent.current_previous']")
    public WebElement rasStudyConsentCurrentDropDown;

    /**
     * Native View Ras Study Copy of Consent/Assent Provided Before Signing Drop Down
     */
    @FindBy(xpath = "//select[@name='x_naci_family_coho_fcsms_consent.copy_of_consent_assent_provided']")
    public WebElement rasStudyConsentCopyOfConsentAssentProvidedDropDown;

    /**
     * Native View Ras Protocol Discussed in Private Setting Drop Down
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_fcsms_consent.protocol_discussed_in_private_setting']")
    public WebElement rasStudyConsentProtocolDiscussedInPrivateSettingDropDown;

    /**
     * Native View Ras Participant Verbalized Understanding of Study Conditions and Participation Drop Down
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_fcsms_consent.participant_verbalized']")
    public WebElement rasStudyConsentParticipantVerbalizedUnderstandingOfStudyConditionsAndParticipationDropDown;

    /**
     * Native View Ras Questions Addressed Before Signing Drop Down
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_fcsms_consent.questions_addressed_before_signing']")
    public WebElement rasStudyConsentQuestionsAddressedBeforeSigningDropDown;

    /**
     * Native View Ras Consent/Assent Obtained Before Study Procedures Drop Down
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_fcsms_consent.consent_assent_obtained_before_study_procedures']")
    public WebElement rasStudyConsentConsentAssentObtainedBeforeStudyProceduresDropDown;

    /**
     * Native View Ras Copy of Signed/Dated Consent/Assent Given to Participant Drop Down
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_fcsms_consent.copy_of_signed_dated_consent_assent_given_to_participant']")
    public WebElement rasStudyConsentCopyOfSignedDatedConsentAssentGivenToParticipantDropDown;

    /**
     * Native View Ras Short Form Consent Checkbox
     */
    @FindBy(xpath = "//label[@id='label.ni.x_naci_family_coho_fcsms_consent.short_form_consent']")
    public WebElement rasStudyConsentShortFormConsentCheckBox;

    /**
     * Native View Ras Study Consent/Assent Status Drop Down
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_fcsms_consent.participant_response']")
    public WebElement rasStudyConsentConsentAssentStatusDropDown;

    /**
     * Native View Ras Study Parent/Guardian Status Drop Down
     */
    @FindBy(xpath = "//select[contains(@name,'x_naci_family_coho_fcsms_consent.parental_relationship')]")
    public WebElement rasStudyConsentParentGuardianStatusDropDown;

    /**
     * Native View Ras Study Number of Parent/Guardian Signatures Required Drop Down
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_fcsms_consent.number_of_guardian']")
    public WebElement rasStudyConsentNumberOfParentGuardianSignaturesRequiredDropDown;

    /**
     * Native View Parent/Guardian 1 Signed Drop Down
     */
    @FindBy(xpath = "(//select[@name='x_naci_family_coho_fcsms_consent.guardian_1_signed'])[1]")
    public WebElement rasStudyConsentParentGuardian1SignedDropDown;

    /**
     * Native View Parent/Guardian 1 Name Text Field
     */
    @FindBy(css = "input[id='x_naci_family_coho_fcsms_consent.guardian_1_name']")
    public WebElement rasStudyConsentParentGuardian1NameTextField;

    /**
     * Native View Parent/Guardian 2 Signed Drop Down
     */
    @FindBy(xpath = "(//select[@name='x_naci_family_coho_fcsms_consent.guardian_2_signed'])[1]")
    public WebElement rasStudyConsentParentGuardian2SignedDropDown;

    /**
     * Native View Parent/Guardian 2 Name Text Field
     */
    @FindBy(css = "input[id='x_naci_family_coho_fcsms_consent.guardian_2_name']")
    public WebElement rasStudyConsentParentGuardian2NameTextField;

    /**
     * Native View Number of LARs Drop down
     */
    @FindBy(xpath = "//select[@name='x_naci_family_coho_fcsms_consent.number_of_lars']")
    public WebElement numberOfLARsDropDown;

    /**
     * Native View LAR 1 Signed Drop down
     */
    @FindBy(css = "select[id='x_naci_family_coho_fcsms_consent.lar_1_signed']")
    public WebElement lar1SignedDropDown;

    /**
     * Native View LAR 1 Name Text field
     */
    @FindBy(css = "input[name='x_naci_family_coho_fcsms_consent.lar_1_name']")
    public WebElement lar1NameTextField;

    /**
     * Native View LAR 2 Signed Drop down
     */
    @FindBy(css = "select[name='x_naci_family_coho_fcsms_consent.lar_2_signed']")
    public WebElement lar2SignedDropDown;

    /**
     * Native View LAR 2 Name Text field
     */
    @FindBy(css = "input[name='x_naci_family_coho_fcsms_consent.lar_2_name']")
    public WebElement lar2NameTextField;

    /**
     * Age-appropriate assent obtained? Dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_fcsms_consent.assent_status']")
    public WebElement ageAppropriateAssentObtainedDropDown;

    /**
     * Native View Ras Study Interpreter Used? drop down
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_fcsms_consent.interpreter_used']")
    public WebElement rasStudyConsentInterpreterUsedDropDown;

    /**
     * Native View Ras Study Interpreter Name or ID text field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_fcsms_consent.interpreter_name_or_id']")
    public WebElement rasStudyConsentInterpreterNameOrIdTextField;

    /**
     * Native View Ras Study Interpreter Language text field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_fcsms_consent.interpreter_language']")
    public WebElement rasStudyConsentInterpreterLanguageTextField;

    /**
     * Native View Ras Study Future Use Of Specimens and Data by NIH Drop Down
     */
    @FindBy(xpath = "//*[@id='x_naci_family_coho_fcsms_consent.future_use_of_specimens_and_data_by_nih']")
    public WebElement rasStudyConsentFutureSpecimensAndDataDropDown;

    /**
     * Native View Ras Study Future Use By Collaborators Drop Down
     */
    @FindBy(xpath = "//*[@id='x_naci_family_coho_fcsms_consent.future_use_by_collaborators']")
    public WebElement rasStudyConsentFutureUseCollaboratorsDropDown;

    /**
     * Native View Ras Study Future Identifiable Use By Collaborators Drop Down
     */
    @FindBy(xpath = "//*[@id='x_naci_family_coho_fcsms_consent.future_identifiable_use_by_collaborators']")
    public WebElement rasStudyConsentFutureIdentifiableUseCollaboratorsDropDown;

    /**
     * Native View Ras Study Comments Text Area
     */
    @FindBy(xpath = "//textarea[@name='x_naci_family_coho_fcsms_consent.comments']")
    public WebElement rasStudyConsentCommentsTextArea;

    /**
     * Native View Ras Study Call Complete Button
     */
    @FindBy(xpath = "//*[@id='call_complete']")
    public WebElement rasStudyConsentCallCompleteButton;

    /**
     * Native View Ras Study Add File Button
     */
    @FindBy(xpath = "//*[@id='add_attachment']")
    public WebElement rasStudyConsentAddFileButton;

    /**
     * Native View Ras Study Choose File Button
     */
    @FindBy(xpath = "//*[@id='attachFile']")
    public WebElement rasStudyConsentChoseFileButton;

    /**
     * Native View Ras Study Chose File Close Button
     */
    @FindBy(xpath = "//*[@id='attachment_closemodal']")
    public WebElement rasStudyConsentChoseFileCloseButton;

    /**
     * Native View Ras Study Chose Call Complete Button
     */
    @FindBy(xpath = "//button[@id='call_complete']")
    public WebElement rasStudyConsentChoseCallCompleteButton;

    /**
     * Native View Ras Study Hard Copy of Consent Received Button
     */
    @FindBy(xpath = "//*[@id='hard_consent_received']")
    public WebElement rasStudyConsentHardCopyReceivedButton;

    /**
     * Native View Ras Complete Consent Button
     */
    @FindBy(xpath = "//*[@id='complete_consent']")
    public WebElement rasStudyConsentCompletedConsentButton;

    /**
     * Native View Ras Study Participant Records Ready To Progress Message
     */
    @FindBy(xpath = "//div[normalize-space()='Participant record ready to progress.']")
    public WebElement rasStudyConsentParticipantRecordsReadyToProgressMessage;

    /**
     * Native View Ras Sign And Complete Button
     */
    @FindBy(xpath = "//button[@id='sign_and_complete_client']")
    public WebElement rasStudyConsentSignAndCompleteButton;

    /**
     * Native View Ras Study Consent Record Completed Message
     */
    @FindBy(xpath = "//div[normalize-space()='Consent record completed and Family record is now active!']")
    public WebElement rasStudyConsentConsentRecordCompletedMessageMessage;

    public NativeViewCHARMSParticipantConsentPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}