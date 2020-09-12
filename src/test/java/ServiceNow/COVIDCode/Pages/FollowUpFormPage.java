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
	
	/** Disease Course Drug Treatments text */
	@FindBy (xpath = "//*[@id='drug_treatments']/div/label")
	public WebElement diseaseCourseDrugTreatmentsText;
	
	/** Disease Course Drug Treatments text field */
	@FindBy (xpath = "/html/body/div[1]/div/div/div/div/div/div/div[2]/div/sp-variable-layout/fieldset/div/div[1]/div[9]/div/span/div/ul/li/input")
	public WebElement diseaseCourseDrugTreatmentsTextField;
	
	/** Disease Course Drug Treatments drop down values */
	@FindBy (xpath = "//*[@id='s2id_autogen32_results']/li")
	public List<WebElement> diseaseCourseDrugTreatmentsDropDownValues;
	
	/*
	 * Demographics Section elements
	 */
	/** What is the highest level of school that you/the patient completed? */
	@FindBy (xpath = "//*[@id='highest_education_level']/div/label")
	public WebElement whatIsHighestEducationLevelCompleted;
	
	
	/*
	 * Exposures and Risk Factors
	 */
	/** Exposures and Risk Factors label text */
	@FindBy (xpath = "//*[@id='exposures_label']/div/label")
	public WebElement exposuredAndRiskFactorsLabelText;
	
	/** Exposures and Risk Factors Your/Patient's typical self reported health? */
	@FindBy (xpath = "//*[@id='self_reported_health']/div/label")
	public WebElement exposuresAndRiskFactorsSelfReportedHealthQuestionText;
	
	/** Exposures and Risk Factors Medical Conditions question text */
	@FindBy (xpath = "//*[@id='comorbidities']/div/label")
	public WebElement exposuresAndRiskFactorsMedicalConditionsQuestionText;
	
	/** Exposures amd Risk Factors Cancer question text */
	@FindBy (xpath = "//*[@id='specify_cancer_type']/div/label")
	public WebElement exposuresAndRiskFactorsCancerQuestionText;
	
	/** Exposures and Risk Factors Immunizations question text */
	@FindBy (xpath = "//*[@id='immunizations_up_to_date']/div/label")
	public WebElement exposuresAndRiskFactorsImmunizationsQuestionText;
	
	/** Exposures and Risk Factors Vacinations received question text */ 
	@FindBy (xpath = "//*[@id='vacinations_received']/div/label")
	public WebElement exposuresAndRiskFactorsVacinationsReceivedQuestionText;
	
	/** Exposures and Risk Factors walking pace question text */
	@FindBy (xpath = "//*[@id='patient_walking_pace']/div/label")
	public WebElement exposiresAndRiskFactorsWalkingPaceQuestionText;
	
	/** Exposures and Risk Factors hours spent sitting question text */
	@FindBy (xpath = "//*[@id='hours_spent_sitting']/div/label")
	public WebElement exposuresAndRiskFactorsHoursSpentSittingQuestionText;
	
	/** Exposures and Risk Factors vape habit question text */
	@FindBy (xpath = "//*[@id='vape_habit']/div/label")
	public WebElement exposureAndRiskFactorsVapeHabit;
	
	/** Exposures and Risk Factors smoke question text */
	@FindBy (xpath = "//*[@id='smoke_100']/div/label")
	public WebElement exposureAndRiskFactorsSmokeQuestionText;
	
	/** Exposures and Risk Factors alcohol consuption question text */
	@FindBy (xpath = "//*[@id='alcohol_consumption']/div/label")
	public WebElement exposuresAndRiskFactorsAlcoholConsumptionQuestionText;
	
	/** Exposures and Risk Factors hours per week spent exercising */
	@FindBy (xpath = "//*[@id='hours_per_week_spent_exercising']/div/label")
	public WebElement exposuresAndRiskFactorsHoursPerWeekSpentQuestionText;
	
	
	
	public FollowUpFormPage() {
		
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}

}
