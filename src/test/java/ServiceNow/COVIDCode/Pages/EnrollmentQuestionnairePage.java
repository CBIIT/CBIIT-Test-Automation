package ServiceNow.COVIDCode.Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class EnrollmentQuestionnairePage extends CommonUtils {

	/**--------------- COVIDcode ENROLLMENT QUESTIONNAIRE GENERALS ---------------*/

	/** COVIDcode Enrollment Questionnaire Header */
	@FindBy(xpath = "//h1[text()=' COVIDcode Enrollment Questionnaire ']")
	public WebElement COVIDcodeEnrollmentQuestionnaireHeader;

	/** COVIDcode Enrollment Questionnaire: Home Button */
	@FindBy(xpath = "//*[contains(text(), 'Home')]")
	public WebElement COVIDcodeHomeButton;
	/**
	 * COVIDcode Enrollment Questionnaire: Please fill out each data
	 * element..Paragraph
	 */
	@FindBy(xpath = "//p[contains(text(),'please contact the study team')]")
	public WebElement enrollmentQuestionnaireParagraph;

	/** COVIDcode Enrollment Questionnaire: NIH Medical Record Number Text Box */
	@FindBy(id = "sp_formfield_nih_medical_record_number")
	public WebElement enrollmentQuestionnaireNIHMedicalRecordNumberTextBox;

	/** COVIDcode Enrollment Questionnaire: Anonymized Patient ID Text box */
	@FindBy(xpath = "//*[@id='sp_formfield_anonymized_patient_id']")
	public WebElement enrollmentQuestionnaireAnonymizedPatiendIDTextBox;

	/** COVIDcode Enrollment Questionnaire: User Group ID dropdown */
	@FindBy(xpath = "//div[@id='s2id_sp_formfield_user_group_id']")
	public WebElement enrollmentQuestionnaireUserGroupIdDropdown;

	/** COVIDcode Enrollment Questionnaire: User Group ID dropdown values */
	@FindBy(xpath = "//select[@id='user-group-id']/option")
	public List<WebElement> enrollmentQuestionnaireUserGroupIDdropDownValues;

	/** COVIDcode Enrollment Questionnaire: Consent dropdown */
	@FindBy(xpath = "//*[@id='s2id_sp_formfield_verbal_consent']/a")
	public WebElement enrollmentQuestionnaireConsentDropdown;

	/** COVIDcode Enrollment Questionnaire: Consent drop down values in a List */
	@FindBy(xpath = "/html/body/div[9]/ul/li")
	public List<WebElement> enrollmentQuestionaireConsentDropDownValues;

	/** COVIDcode Enrollment Questionnaire Confirm submission pop up: YES button */
	@FindBy(xpath = "/html/body/div[1]/div/div/div[3]/button[2]")
	public WebElement enrollmentQuestionnaireConfirmSubmissionYesButton;


	/** COVIDcode Confirm Submission Pop Up Text */
	@FindBy(xpath = "//p[contains(text(), 'Are you sure you want to submit')]")
	public WebElement enrollmentQuestionnaireConfirmSubmissionPopUpText;

	/** COVIDcode Enrollment Questionnaire Save button */
	@FindBy(xpath = "//button[@type='submit']")
	public WebElement enrollmentQuestionnaireSaveButton;

	/** COVIDcode Enrollment Questionnaire Submit button */
	@FindBy(xpath = "//*[contains(text(), 'Submit for Review')]")
	public WebElement enrollmentQuestionnaireSubmitButton;



	/**--------------- THE END OF COVIDcode ENROLLMENT QUESTIONNAIRE GENERALS ---------------*/
	

	/**--------------- COVIDcode ENROLLMENT QUESTIONNAIRE CONTACT INFO SECTION ---------------*/

	/**
	 * COVIDcode Enrollment Questionnaire Contact info: patient LAST NAME text
	 * 
	 * box
	 */
	@FindBy(id = "sp_formfield_last_name")
	public WebElement enrollmentQuestionnairePatientLastNameTextBox;

	/**
	 * COVIDcode Enrollment Questionnaire Contact info: patient FIRST NAME text box
	 */
	@FindBy(id = "sp_formfield_first_name")
	public WebElement enrollmentQuestionnairePatientFirstNameTextBox;

	/**
	 * COVIDcode Enrollment Questionnaire Contact info: patient MIDDLE NAME text box
	 */
	@FindBy(id = "sp_formfield_middle_initial")
	public WebElement enrollmentQuestionnairePatientMiddletNameTextBox;

	/**
	 * COVIDcode Enrollment Questionnaire Contact info: patient EMAIL ADDRESS text
	 * box
	 */
	@FindBy(id = "sp_formfield_contact_email")
	public WebElement enrollmentQuestionnairePatientEmailAddressTextBox;

	/**
	 * COVIDcode Enrollment Questionnaire Contact info: patient PHONE NUMBER text
	 * box
	 */
	@FindBy(id = "sp_formfield_contact_phone_number")
	public WebElement enrollmentQuestionnairePatientPhoneNumberTextBox;

	/**
	 * COVIDcode Enrollment Questionnaire Contact info: patient STREET ADDRESS 1
	 * text box
	 */
	@FindBy(id = "sp_formfield_street_address_1")
	public WebElement enrollmentQuestionnairePatientStreetAddress1TextBox;

	/** COVIDcode Enrollment Questionnaire Contact info: patient CITY text box */
	@FindBy(id = "sp_formfield_city")
	public WebElement enrollmentQuestionnairePatientCityTextBox;

	/** COVIDcode Enrollment Questionnaire Contact info: patient STATE text box */
	@FindBy(id = "sp_formfield_us_state")
	public WebElement enrollmentQuestionnairePatientStateTextBox;

	/**
	 * COVIDcode Enrollment Questionnaire Contact info: patient ZIP CODE text box
	 */
	@FindBy(id = "sp_formfield_zip_code")
	public WebElement enrollmentQuestionnairePatientZipCodeTextBox;

	/**
	 * --------------- THE END OF COVIDcode ENROLLMENT QUESTIONNAIRE CONTACT INFO SECTION ---------------
	 */

	/**
	 * --------------- COVIDcode ENROLLMENT QUESTIONNAIRE DEMOGRAPHICS SECTION ---------------
	 */

	/** COVIDcode Enrollment Questionnaire demographics tab */
	@FindBy(xpath = "//a[contains(text(), 'Demographics')]")
	public WebElement demographicsTab;
	/**
	 * COVIDcode Enrollment Questionnaire Demographics: Date form completed calendar
	 * field
	 */
	@FindBy(id = "sp_formfield_form_complete_date")
	public WebElement enrollmentQuestionnaireDateFormCompletedBox;

	/** COVIDcode Enrollment Questionnaire Demographics: current weight dropdown */
	@FindBy(xpath = "//div[@id = 's2id_sp_formfield_weight_choice']/a")
	public WebElement enrollmentQuestionnaireCurrentWeightDropdown;

	/**
	 * COVIDcode Enrollment Questionnaire Demographics: what is your current weight
	 * drop down values
	 */
	@FindBy(xpath ="//div[@class='select2-result-label']")
	public List<WebElement> enrollmentQuestionnaireCurrentWeightDropdownValues;

	/** COVIDcode Enrollment Questionnaire Demographics: Weight Text Box */
	@FindBy(id = "sp_formfield_weight_pounds")
	public WebElement enrollmentQuestionnaireWeightTextBox;

	/** COVIDcode Enrollment Questionnaire Demographics: DOB calendar */
	@FindBy(id = "sp_formfield_date_of_birth")
	public WebElement enrollmentQuestionnaireDOBbox;

	/**
	 * COVIDcode Enrollment Questionnaire Demographics: describe your race drop down
	 */
	@FindBy(xpath = "//div[@id = 's2id_sp_formfield_ancestry']/a")
	public WebElement enrollmentQuestionnaireRaceDropdown;
	
	/** COVIDcode Enrollment Questionnaire Demographics: Race dropdown values */
	@FindBy(xpath = "//div[@class='select2-result-label']")
	public List<WebElement> enrollmentQuestionnaireRaceDropdownValues;
	
	/**
	 * COVIDcode Enrollment Questionnaire Demographics:when were you officially
	 * diagnosed with COVID-19?
	 */
	@FindBy(xpath = "//input[@id='sp_formfield_date_official_diagnosis']")
	public WebElement enrollmentQuestionnaireWhenOfficiallyDiagnosed;

	/** COVIDcode Enrollment Questionnaire Demographics: biological sex drop down */
	@FindBy(xpath = "//div[@id = 's2id_sp_formfield_sex']/a")
	public WebElement enrollmentQuestionnaireBiologicalSexDropdown;
	
	/** COVIDcode Enrollment Questionnaire Demographics: biological search box */
	@FindBy(xpath = "//input[@id='s2id_autogen5_search']")
	public WebElement enrollmentQuestionnaireBiologicalSexSearchBox;
	
	/**  
	 * COVIDcode Enrollment Questionnaire Demographics: biological sex dropdown
	 * values
	 */
	@FindBy(xpath = "//div[@class='select2-result-label']")
	public List<WebElement> enrollmentQuestionnaireBiologicalSexDropDownValues;

	/**
	 * COVIDcode Enrollment Questionnaire Demographics: are you hispanic or latino
	 * drop down
	 */
	@FindBy(xpath = "//div[@id = 's2id_sp_formfield_are_you_hispanic_or_latino']/a")
	public WebElement enrollmentQuestionnaireHispanicOrLatinoDropdown;

	/**
	 * COVIDcode Enrollment Questionnaire Demographics: are you hispanic or latino
	 * dropdown values
	 */
	@FindBy(xpath = "//div[@class='select2-result-label']")
	public List<WebElement> enrollmentQuestionnaireHispanicOrLatinoDropdownValues;

	/**
	 * COVIDcode Enrollment Questionnaire Demographics: what is your current height
	 * drop down
	 */
	@FindBy(xpath = "//div[@id = 's2id_sp_formfield_height_choice']/a")
	public WebElement enrollmentQuestionnaireCurrentHeightDropdown;

	/**
	 * COVIDcode Enrollment Questionnaire Demographics: what is your current height
	 * dropdown values
	 */
	@FindBy(xpath = "//div[@class='select2-result-label']")
	public List<WebElement> enrollmentQuestionnaireCurrentHeightDropdownValues;

	/** COVIDcode Enrollment Questionnaire Demographics: feet text box */
	@FindBy(id = "sp_formfield_height_feet")
	public WebElement enrollmentQuestionnaireFeetTextBox;

	/** COVIDcode Enrollment Questionnaire Demographics: inches text box */
	@FindBy(id = "sp_formfield_height_inches")
	public WebElement enrollmentQuestionnaireInchesTextBox;

	/**
	 * --------------- THE END OF COVIDcode ENROLLMENT QUESTIONNAIRE DEMOGRAPHICS SECTION ---------------
	 */

	/**
	 * --------------- COVIDcode ENROLLMENT QUESTIONNAIRE SYMPTOMOLOGY SECTION ---------------
	 */

	/** COVIDcode Enrollment Questionnaire patient zip code text box */
	@FindBy(id = "sp_formfield_zip_code")
	public WebElement patientZipCodeTextBox;

	/** COVIDcode Enrollment Questionnaire Symptomology tab */
	@FindBy(xpath = "//*[contains(text(),'Symptomology')]")
	public WebElement symptomologyTab;
	/**
	 * COVIDcode Enrollment Questionnaire Symptomology: Were you symptomatic
	 * dropdown
	 */
	@FindBy(xpath = "//div[@id='s2id_sp_formfield_symptomatic']")
	public WebElement enrollmentQuestionnaireWereYouSymptomaticDropdown;

	/**
	 * COVIDcode Enrollment Questionnaire Symptomology: Were you symptomatic
	 * dropdown values
	 */
	@FindBy(xpath = "//li[@role='presentation']")
	public List<WebElement> enrollmentQuestionnaireWereYouSymptomaticDropdownValues;

	/**
	 * COVIDcode Enrollment Questionnaire Symptomology: When did you first develop
	 * symptoms of COVID-19? calendar
	 */
	@FindBy(xpath = "//input[@id='sp_formfield_date_first_symptoms']")
	public WebElement enrollmentQuestionnaireWhenDevelopSymptoms;
	/**
	 * COVIDcode Enrollment Questionnaire Symptomology: When were you officially
	 * diagnosed with COVID-19? calendar
	 */
	@FindBy(xpath = "//input[@id='sp_formfield_date_official_diagnosis']")
	public WebElement enrollmentQuestionnaireWhenOfficiallyDiagnosedCalendar;

	/**
	 * --------------- THE END OF COVIDcode ENROLLMENT QUESTIONNAIRE SYMPTOMOLOGY SECTION ---------------
	 */

	public EnrollmentQuestionnairePage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}

}
