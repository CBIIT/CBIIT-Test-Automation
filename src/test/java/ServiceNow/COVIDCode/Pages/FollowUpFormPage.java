package ServiceNow.COVIDCode.Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class FollowUpFormPage extends CommonUtils{
	
	/** Enrollment Search drop down */
	@FindBy (xpath = "//*[@id='s2id_sp_formfield_patient_id']/a")
	public WebElement enrollmentSearchDropDown;
	
	/** Enrollment search x button*/
	@FindBy (xpath = "//*[@id='s2id_sp_formfield_patient_id']/a/abbr")
	public WebElement enrollmentSearchXbutton;
	
	/** Enrollment Search text box */
	@FindBy (xpath = "//*[@id='select2-drop']/div/input")
	public WebElement enrollmentSearchTxtBox;
	
	/** Existing Enrollment search values */
	@FindBy(xpath = "//*[@id='select2-results-48']/li")
	public List<WebElement> enrollmentSearchValues;
	
	/** User Group ID */
	@FindBy (xpath = "//*[@id='s2id_autogen1']")
	public WebElement userGroupID;
	
	/** Host Hospital Code */
	@FindBy (xpath = "//*[@id='s2id_sp_formfield_host_hospital_code']/input")	
	public WebElement hostHospitalCode;
	
	/*
	 * Disease Course Section
	 */
	
	/** Disease Course Add button */
	@FindBy (xpath = "//div[@style='min-height:0px;']/button[1]")
	public WebElement diseaseCourseAddButton;
	
	/** Disease Course Symptoms Field */
	@FindBy (xpath = "//input[contains(@id,'s2id_auto') and @autocomplete='sp_formfield_symptoms']")
	public WebElement diseaseCourseSymptomsField;
	
	/** Disease Course Symptoms drop down Cough option */
	@FindBy (xpath = "//div[contains(text(),'Cough')]")
	public WebElement diseasCourseSymptomsDDCoughOption;
	
	/** Disease Course Symptoms drop down Fever option */
	@FindBy (xpath = "//div[contains(text(),'Fever')]")
	public WebElement diseasCourseSymptomsDDFeverOption;
	
	/** Disease Course Symptoms drop down None of the above option */
	@FindBy (xpath = "//div[contains(text(),'None of the above')]")
	public WebElement diseasCourseSymptomsDDNoneOfTheAboveOption;
	
	/** Disease Course Symptoms drop down Don't know option */
	@FindBy (xpath = "//div[contains(text(),'Don')]")
	public WebElement diseasCourseSymptomsDDdontKnowOption;
	
	/** Disease Course pop up message */
	@FindBy (xpath = "//div[@class='modal-content']/div[2]/p")
	public WebElement diseaseCoursePopUpMessage;
	
	/** Disease Course None of the above option displayed after selected */
	@FindBy (xpath = "//ul[@class='select2-choices']/li[1]/div")
	public WebElement diseaseCourseOptionDisplayeAfterSelecting;
	
	/** Disease Course pop up Yes button */
	@FindBy (xpath = "//div[@class='modal-content']/div[3]/button[2]")
	public WebElement diseaseCoursePopUpYesButton;
	
	/** Treatment Items section */
	@FindBy (xpath = "//*[@id='treatment_items']/div/label")
	public WebElement diseaseCoursetreatmentItemsSectionText;
	
	/** Treatment Items field */
	@FindBy (xpath = "//div[@id='s2id_sp_formfield_treatment_items']/ul/li/input")
	public WebElement diseaseCoursetreatmentItemsField;
	
	/** Disease Course treatment items drop down Intubation option */
	@FindBy (xpath = "//div[contains(text(),'Intubation')]")
	public WebElement diseasCourseTreatmentItemDDIntubationOption;
	
	
	/*
	 * Demographics Section elements
	 */
	/** What is the highest level of school that you/the patient completed? */
	@FindBy (xpath = "//*[@id='highest_education_level']/div/label")
	public WebElement whatIsHighestEducationLevelCompleted;
	
	
	public FollowUpFormPage() {
		
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}

}
