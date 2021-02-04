package ServiceNow.COVIDCode.Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;


public class FollowUpFormPage extends CommonUtils {


	/** --------------- COVIDcode ENROLLMENT FOLOW UP FORM QUESTIONNAIRE GENERALS  ---------------  */ 
	
	/** COVIDcode Follow up: NIH Medical Record Number Text Box */
	@FindBy(id = "sp_formfield_nih_medical_record_number")
	public WebElement followUpNIHMedicalRecordNumberTextBox;

	/** Enrollment Search drop down */
	@FindBy (xpath = "//*[@id='s2id_enrollmentId']/a")
	public WebElement enrollmentSearchDropDown;
	
	/** Enrollment search x button*/
	@FindBy (xpath = "//div[@id='s2id_enrollmentId']/a/abbr")
	public WebElement enrollmentSearchXbutton;
	
	/** Enrollment Search text box */
	@FindBy (xpath = "//input[@id='s2id_autogen1_search']")
	public WebElement enrollmentSearchTxtBox;
	
	/** Existing Enrollment search values */
	@FindBy(xpath = "//ul[@class='select2-results']/li")
	public List<WebElement> enrollmentSearchValues;
	
	/** Existing Enrollment search values */
	@FindBy(xpath = "//ul[@class='select2-results']")
	public WebElement enrollmentSearchValuesAfterInput;
	
	/** User Group ID */
	@FindBy(xpath="//*[@id='enrollmentLookUp']/div/div/div[2]/div[2]/input")
	public WebElement userGroupID;
	
	/** Host Hospital Code */
	@FindBy (xpath = "//*[@id='s2id_sp_formfield_patient_id.host_hospital_code']")	
	public WebElement hostHospitalCode;
	
	/** Enrollment Follow Up Save Button */
	@FindBy (xpath = "//*[@class='btn btn-primary action-btn pull-right ng-scope']")
	public WebElement followUpSaveButton;
	
	/** Enrollment Follow Up Submit For Review Button */
	@FindBy (xpath = "//*[contains(text(), 'for Review')] ")
	public WebElement followUpSubmitForReview;
	
	/** --------------- THE END OF COVIDcode ENROLLMENT FOLOW UP FORM QUESTIONNAIRE GENERALS  ---------------  */ 


	/** --------------- COVIDcode ENROLLMENT FOLOW UP FORM QUESTIONNAIRE DISEASE COURSE SECTION  ---------------  */ 

	
	/** Disease Course New Button */
	@FindBy (xpath = "//*[contains(text(), 'New')] ")
	public WebElement diseaseCourseNewButton;
	
	/** Disease Course Add button */
	@FindBy (xpath = "//div[@class = 'modal-footer']/button[2]")
	public WebElement diseaseCourseAddButton;

	/** Disease Course Visit Date Calendar */
	@FindBy (id = "sp_formfield_visit_date")
	public WebElement diseaseCourseVisitDate;
	
	/** Disease Course Visit Date Search Box */
	@FindBy (id = "sp_formfield_visit_date")
	public WebElement diseaseCourseVisitDateSearchBox;
	
	/** Disease Course Symptoms Field */
	@FindBy (xpath = "//input[contains(@id,'s2id_auto') and @autocomplete='sp_formfield_symptoms']")
	public WebElement diseaseCourseSymptomsField;
	
	/** Disease Course Symptoms Other Text Field */
	@FindBy (xpath = "//*[@id='sp_formfield_please_specify_other_symptoms']")
	public WebElement diseaseCourseSymptomsOtherTextField;
	
	/** Disease Course Symptoms drop down value */
	@FindBy (xpath = "//*[@id='select2-drop']/ul/li/div")
	public List<WebElement> diseaseCourseSymptomsDDValue;
	
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
	@FindBy (xpath = "//div[@id='s2id_sp_formfield_drug_treatments']/ul/li/input")
	public WebElement diseaseCourseDrugTreatmentsTextField;
	
	/** Disease Course Drug Treatments drop down values */

	@FindBy (xpath = "//div[@id='select2-drop']/ul/li")
	public List<WebElement> diseaseCourseDrugTreatmentsDropDownValues;
	
	/** --------------- THE END OF COVIDcode ENROLLMENT FOLOW UP FORM QUESTIONNAIRE DISEASE COURSE SECTION  ---------------  */ 

	/** --------------- COVIDcode ENROLLMENT FOLOW UP FORM QUESTIONNAIRE DEMOGRAPHICS SECTION  ---------------  */ 

	
	/** Follow Up Questionnaire Demographics Text Box */
	@FindBy (xpath = "//*[contains(text(), 'Demographics')]")
	public WebElement followUpDemographicsTextBox;
	
	/** Follow Up Questionnaire Demographic Field Date Form Completed */
	@FindBy (xpath = "//*[@id=\"sp_formfield_form_complete_date\"]")
	public WebElement followUpQuestionnaireDemographicDateFormComplted;
	
	
	/** --------------- THE END OF COVIDcode ENROLLMENT FOLOW UP FORM QUESTIONNAIRE DEMOGRAPHICS SECTION  ---------------  */ 

	/** --------------- COVIDcode ENROLLMENT FOLOW UP FORM QUESTIONNAIRE EXPOSURES AND RISK FACTORS SECTION  ---------------  */ 
	
	/** Exposures and Risk Factors label text */
	@FindBy (xpath = "//*[contains(text(),'Exposures')]")
	public WebElement exposuredAndRiskFactorsLabelText;
	
	/** Exposures and Risk Factors Your/Patient's typical self reported health? */
	@FindBy (xpath = "//div[@id='self_reported_health']/div[2]/label")
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
	
	/** Exposures and Risk Factors alcohol consumption question text */
	@FindBy (xpath = "//*[@id='alcohol_consumption']/div/label")
	public WebElement exposuresAndRiskFactorsAlcoholConsumptionQuestionText;
	
	/** Exposures and Risk Factors hours per week spent exercising */
	@FindBy (xpath = "//*[@id='hours_per_week_spent_exercising']/div/label")
	public WebElement exposuresAndRiskFactorsHoursPerWeekSpentQuestionText;
	
	/** --------------- THE END OF COVIDcode ENROLLMENT FOLOW UP FORM QUESTIONNAIRE EXPOSURES AND RISK FACTORS SECTION  ---------------  */ 

	
	public FollowUpFormPage() {
		
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}


}
