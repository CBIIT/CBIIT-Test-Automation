package ServiceNow.COVIDCode.Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class EnrollmentQuestionnairePage extends CommonUtils {

	// COVIDcode Enrollment Questionnaire title
	@FindBy(xpath = "//h1[text()='COVIDcode Enrollment Questionnaire']")
	public WebElement COVIDcodeEnrollmentQuestionnaireText;

	// COVIDcode Enrollment Questionnaire header
	@FindBy(xpath = "//span[contains(text(),'please contact the study team')]")
	public WebElement enrollmentQuestionnaireTextHeader;

	// COVIDcode Enrollment Questionnaire header contact email address
	@FindBy(linkText = "covidcode@mail.nih.gov")
	public WebElement headerEmail;

	// COVIDcode Enrollment Questionnaire header contact phone number
	@FindBy(xpath = "//div[@class='sc-item-description ng-binding']/p/span[3]")
	public WebElement headerPhoneNumber;

	// COVIDcode Enrollment Questionnaire User Group ID dropdown
	@FindBy(id = "select2-chosen-1")
	public WebElement userGroupIdDropdown;

	// COVIDcode Enrollment Questionnaire dropdown values in a List
	@FindBy(xpath = "//ul[contains(@class,'select2-results')]/li/div")
	public List<WebElement> dropDownValues;

	// COVIDcode Enrollment Questionnaire consent dropdown
	@FindBy(id = "select2-chosen-2")
	public WebElement consentDropdown;

	// COVIDcode Enrollment Questionnaire patient last name text box
	@FindBy(id = "sp_formfield_last_name")
	public WebElement patientLastNameTextBox;

	// COVIDcode Enrollment Questionnaire patient first name text box
	@FindBy(id = "sp_formfield_first_name")
	public WebElement patientFirstNameTextBox;

	// COVIDcode Enrollment Questionnaire patient middle name text box
	@FindBy(id = "sp_formfield_middle_initial")
	public WebElement patientMiddletNameTextBox;

	// COVIDcode Enrollment Questionnaire patient email address text box
	@FindBy(id = "sp_formfield_contact_email")
	public WebElement patientEmailAddressTextBox;

	// COVIDcode Enrollment Questionnaire patient phone number text box
	@FindBy(id = "sp_formfield_contact_phone_number")
	public WebElement patientPhoneNumberTextBox;

	// COVIDcode Enrollment Questionnaire patient street address 1 text box
	@FindBy(id = "sp_formfield_street_address_1")
	public WebElement patientStreetAddress1TextBox;

	// COVIDcode Enrollment Questionnaire patient city text box
	@FindBy(id = "sp_formfield_city")
	public WebElement patientCityTextBox;

	// COVIDcode Enrollment Questionnaire patient state text box
	@FindBy(id = "sp_formfield_us_state")
	public WebElement patientStateTextBox;

	// COVIDcode Enrollment Questionnaire patient zip code text box
	@FindBy(id = "sp_formfield_zip_code")
	public WebElement patientZipCodeTextBox;

	// COVIDcode Enrollment Questionnaire date form completed calendar
	@FindBy(id = "sp_formfield_form_complete_date")
	public WebElement dateFormCompleted;

	// COVIDcode Enrollment Questionnaire current weight dropdown
	@FindBy(id = "select2-chosen-5")
	public WebElement currentWeightDropdown;

	// COVIDcode Enrollment Questionnaire DOB calendar
	@FindBy(id = "sp_formfield_date_of_birth")
	public WebElement DOBCalendar;

	// COVIDcode Enrollment Questionnaire describe your race drop down
	@FindBy(id = "select2-chosen-6")
	public WebElement raceDropdown;

	// COVIDcode Enrollment Questionnaire biological sex drop down
	@FindBy(id = "select2-chosen-3")
	public WebElement biologicalSexDropdown;

	// COVIDcode Enrollment Questionnaire are you hispanic or latino drop down
	@FindBy(id = "select2-chosen-7")
	public WebElement hispanicOrLatinoDropdown;

	// COVIDcode Enrollment Questionnaire what is your current height drop down
	@FindBy(id = "select2-chosen-4")
	public WebElement currentHeightDropdown;

	// COVIDcode Enrollment Questionnaire feet text box
	@FindBy(id = "sp_formfield_height_feet")
	public WebElement feetTextBox;

	// COVIDcode Enrollment Questionnaire inches text box
	@FindBy(id = "sp_formfield_height_inches")
	public WebElement inchesTextBox;

	// COVIDcode Enrollment Questionnaire when did you first develop symptoms of
	// COVID-19? calendar
	@FindBy(id = "sp_formfield_date_first_symptoms")
	public WebElement whenDevelopSymptoms;

	// COVIDcode Enrollment Questionnaire when were you officially diagnosed with
	// COVID-19? calendar
	@FindBy(id = "sp_formfield_date_official_diagnosis")
	public WebElement whenOfficiallyDiagnosed;

	// COVIDcode Enrollment Questionnaire weight text box when selecting
	@FindBy(id = "sp_formfield_weight_pounds")
	public WebElement weightTextBox;

	// COVIDcode EQ submit button
	@FindBy(xpath = "//*[@id='catItemTop']/div[1]/div[4]/div[1]/div[1]/button")
	public WebElement submitButton;

	// Submission pop up
	@FindBy(xpath = "/html/body/div[1]/div/div/div[3]/button[2]")
	public WebElement YesButton;

	public EnrollmentQuestionnairePage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}
}
