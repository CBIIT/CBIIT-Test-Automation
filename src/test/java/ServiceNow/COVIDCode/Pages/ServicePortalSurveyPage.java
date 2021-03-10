package ServiceNow.COVIDCode.Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class ServicePortalSurveyPage extends CommonUtils {

	/** --------------- BEGINNING OF COVIDcode HOME PAGE ---------------  */ 

	/** COVIDCode Volunteer Survey text */
	@FindBy(xpath = "//h3[contains(text(),'COVIDcode Volunteer Survey')]")
	public WebElement covidCodeVolunteerSurvey;
	
	/** --------------- THE END OF COVIDcode HOME PAGE ---------------  */ 
	
	
	/** --------------- BEGINNING OF COVIDcode TAKE SURVEY PAGE ---------------  */ 

	/** COVIDcode Volunteer Survey: Get Started button */
	@FindBy(xpath = "//button[contains(text(),'Get Started')]")
	public WebElement getStartedButton;

	/**
	 * COVIDcode Volunteer Survey: Are you filling this out for yourself or child?
	 * drop down
	 */
	@FindBy(xpath = "//*[@id='select2-chosen-6']")
	public WebElement areYouFillingThisOutForYourselfDropDown;

	/**
	 * COVIDcode Volunteer Survey: Are you filling this out for yourself or child?
	 * drop down values
	 */

	/** Are you filling this out for yourself or child? drop down values */
	@FindBy(xpath = "/html/body/div[3]/ul/li")
	public List<WebElement> areYouFillingThisOutForYourselfDropDownValues;

	/**
	 * COVIDcode Volunteer Survey: Have you tested positive for SARS-CoV-2 (the
	 * novel coronavirus text
	 */
	@FindBy(xpath = "//*[contains(text(),'Have you tested positive for SARS-CoV-2 (the novel coronavirus)?')]")
	public WebElement haveYouTestedPositiveForSARSCoV2Text;

	/**
	 * COVIDcode Volunteer Survey: Have you tested positive for SARS-CoV-2 (the
	 * novel coronavirus)? drop down
	 */
	@FindBy(xpath = "//span[@class='select2-chosen' and @id='select2-chosen-13']")
	public WebElement haveYouTestedPositiveForSARSCoV2DropDown;

	/**
	 * COVIDcode Volunteer Survey: Have you tested positive for SARS-CoV-2 (the
	 * novel coronavirus)? drop down values
	 */
	@FindBy(xpath = "//li[starts-with(@class,'select2-results-dept-0')]")
	public List<WebElement> haveYouTestedPositiveForSARSCoV2DropDownValues;

	/** COVIDcode Volunteer Survey: How was the sample taken? text */
	@FindBy(xpath = "//*[contains(text(),'How was the sample taken?')]")
	public WebElement howWasTheSampleTakenTxt;

	/** COVIDcode Volunteer Survey: How was the sample taken? drop down */
	@FindBy(xpath = "//span[@id = 'select2-chosen-32' and @class = 'select2-chosen']")
	public WebElement howWasTheSampleTakenDropDown;

	/** COVIDcode Volunteer Survey: How was the sample taken? drop down values */
	@FindBy(xpath = "/html/body/div[5]/ul/li")
	public List<WebElement> howWasTheSampleTakenDropDownValues;

	/**
	 * COVIDcode Volunteer Survey: Rapid testing (up to 2 hour turnaround) checkbox
	 */
	@FindBy(xpath = "//input[starts-with(@aria-label,'Rapid testing (up to 2 hour turnaround)')]")
	public WebElement rapidTestingCheckbox;
	
	/**
	 * COVIDcode Volunteer Survey: Were you tested by OMS? Text
	 */
	@FindBy(xpath = "//h4[contains(text(), 'Were you tested by OMS?')]")
	public WebElement wereYouTestedByOMSText;

	
	/**
	 * COVIDcode Volunteer Survey: Were you tested by OMS? drop
	 * down
	 */
	@FindBy(xpath = "//*[@id='s2id_autogen44']/a")
	public WebElement wereYouTestedByOMSDropDown;
	
	/**
	 * COVIDcode Volunteer Survey: Were you tested by OMS? drop
	 * down values
	 */
	@FindBy(xpath = "/html/body/div[7]/ul/li")
	public List<WebElement> wereYouTestedByOMSDropDownValues;

	/**
	 * COVIDcode Volunteer Survey: Can you provide a copy of your test report? text
	 */
	@FindBy(xpath = "//h4[contains(text(), 'Can you provide a copy of your test report?')]")
	public WebElement canYouProvideCopyofTestReportTxt;

	/**
	 * COVIDcode Volunteer Survey: Can you provide a copy of your test report? drop
	 * down
	 */
	@FindBy(xpath = "//div[@id = 's2id_autogen20']/a")
	public WebElement canYouProvideCopyofTestReportDropDown;
	
	/**
	 * COVIDcode Volunteer Survey: Are you a National Institute of Health Employee? Text
	 */
	@FindBy(xpath = "//h4[contains(text(), 'Are you a National Institute of Health Employee?')]")
	public WebElement areYouANationalInstituteOfHealthEmployeeText;
	
	/**
	 * COVIDcode Volunteer Survey: Are you a National Institute of Health Employee? drop
	 * down
	 */
	@FindBy(xpath = "//div[@id = 's2id_autogen16']/a")
	public WebElement areYouANationalInstituteOfHealthEmployeeDropDown;
	
	/**
	 * COVIDcode Volunteer Survey: Are you a National Institute of Health Employee? drop
	 * down values
	 */
	@FindBy(xpath = "/html/body/div[6]/ul/li")
	public List<WebElement> areYouANationalInstituteOfHealthEmployeeDropDownValues;
	
	/**
	 * COVIDcode Volunteer Survey: Are you a National Institute of Health Employee? TextBox
	 */
	@FindBy(xpath = "//input[@id= 's2id_autogen181_search']")
	public WebElement areYouANationalInstituteOfHealthEmployeeTextBox;

	/**
	 * COVIDcode Volunteer Survey: Can you provide a copy of your test report? drop
	 * down values
	 */
	@FindBy(xpath = "/html/body/div[8]/ul/li")
	public List<WebElement> canYouProvideCopyofTestReportDropDownValues;
	
	/**
	 * COVIDcode Volunteer Survey: Can you provide a copy of your test report? TextBox
	 */
	@FindBy(xpath = "//input[@id = 's2id_autogen21_search']")
	public WebElement canYouProvideACopyOfYourTestReportTextBox;


	/**COVIDcode Volunteer Survey: Were you ever hospitalized for COVID-19? drop down */
	@FindBy(xpath = "//div[@id='s2id_autogen24']/a")
	public WebElement wereYouEverHospitalizedDropDown;
	
	/**COVIDcode Volunteer Survey: Were you ever hospitalized for COVID-19? TextBox */
	@FindBy(xpath = "//input[@id = 's2id_autogen25_search']")
	public WebElement wereYouEverHospitalizedTextBox;


	/**
	 * COVIDcode Volunteer Survey: Were you ever hospitalized for COVID-19? drop
	 * down values
	 */
	@FindBy(xpath = "/html/body/div[9]/ul/li")
	public List<WebElement> wereYouEverHospitalizedDropDownValues;

	/** COVIDcode Volunteer Survey: Next button */
	@FindBy(xpath = "//*[@id='sp_survey_root']/div/div/div[2]/sp-survey-form/div/div[3]/div/div[2]/div/div/button[1]")
	public WebElement nextButton;

	/** Contact Information: Contact Information text */
	@FindBy(xpath = "//span[contains(text(),'Contact Information')]")
	public WebElement contactInformationTxt;

	/** Contact Information: First name text box */
	@FindBy(xpath = "/html/body/div[1]/section/main/div[2]/div/sp-page-row/div/div/span/div/div[2]/div/div/div/div[2]/sp-survey-form/div/div[2]/div[2]/div[1]/div/sp-survey-field/div/div/div/input")
	public WebElement firstNameTextBox;

	/** Contact Information: Last name text box */
	@FindBy(xpath = "/html/body/div[1]/section/main/div[2]/div/sp-page-row/div/div/span/div/div[2]/div/div/div/div[2]/sp-survey-form/div/div[2]/div[2]/div[2]/div/sp-survey-field/div/div/div/input")
	public WebElement lastNameTextBox;

	/** Contact Information: Phone Number text box */
	@FindBy(xpath = "/html/body/div[1]/section/main/div[2]/div/sp-page-row/div/div/span/div/div[2]/div/div/div/div[2]/sp-survey-form/div/div[2]/div[2]/div[3]/div/sp-survey-field/div/div/div/input")
	public WebElement phoneNumberTextBox;

	/** Contact Information: Email address text box */
	@FindBy(xpath = "/html/body/div[1]/section/main/div[2]/div/sp-page-row/div/div/span/div/div[2]/div/div/div/div[2]/sp-survey-form/div/div[2]/div[2]/div[4]/div/sp-survey-field/div/div/div/input")
	public WebElement emailAddressTextBox;

	/** Contact Information: Preferred Method of Contact drop down */
	@FindBy(xpath = "(//span[@class = 'select2-chosen'])[1]")
	public WebElement preferredMethodOfContactDropDown;

	/** Contact Information: Preferred Method of Contact drop down values */
	@FindBy(xpath = "/html/body/div[3]/ul/li")
	public List<WebElement> preferredMethodOfContactDropDownValues;

	/** Contact Information: Your year of birth text box */
	@FindBy(xpath = "/html/body/div[1]/section/main/div[2]/div/sp-page-row/div/div/span/div/div[2]/div/div/div/div[2]/sp-survey-form/div/div[2]/div[2]/div[6]/div/sp-survey-field/div/div/div/input")
	public WebElement yearOfBirthTextBox;

	/** Contact Information: Home Zip Code text box */
	@FindBy(xpath = "/html/body/div[1]/section/main/div[2]/div/sp-page-row/div/div/span/div/div[2]/div/div/div/div[2]/sp-survey-form/div/div[2]/div[2]/div[7]/div/sp-survey-field/div/div/div/input")
	public WebElement homeZipCodeTextBox;

	/** How did you hear about us? text */
	@FindBy(xpath = "//span[contains(text(), 'How did you hear about us?')]")
	public WebElement howDidYouHearAboutUsTxt;

	/** How did you find out about our study? drop down */
	@FindBy(xpath = "(//span[@class = 'select2-chosen'])[1]")
	public WebElement howDidYouFindOutAboutOurStudyDropDown;

	/** How did you find out about our study? drop down values */
	@FindBy(xpath = "/html/body/div[3]/ul/li")
	public List<WebElement> howDidYouFindOutAboutOurStudyDropDownValues;

	/** Submit Button */
	@FindBy(xpath = "//*[@id='sp_survey_root']/div/div/div[2]/sp-survey-form/div/div[3]/div/div[2]/div/div/button[1]")
	public WebElement submitButton;

	/** --------------- THE END OF COVIDcode TAKE SURVEY PAGE ---------------  */ 

	
	/** --------------- BEGINNING OF COVIDcode SURVEY THANK YOU PAGE ---------------  */ 

	/** Survey Thank you page: Your survey has been submitted successfully! text */
	@FindBy(xpath = "//*[@id='thank_you']/p[1]")
	public WebElement yourSurveyHasBeenSubmittedTxt;

	/** Survey Thank you page: If you have questions... text */
	@FindBy(xpath = "//*[@id='thank_you']/p[2]")
	public WebElement ifYouHaveQuestionsText;

	/** Survey Thank you page: OK Button */
	@FindBy(xpath = "//*[@id='thank_you']/div/button")
	public WebElement okButton;

	/** --------------- THE END OF COVIDcode SURVEY THANK YOU PAGE ---------------  */ 

	public ServicePortalSurveyPage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}

}
