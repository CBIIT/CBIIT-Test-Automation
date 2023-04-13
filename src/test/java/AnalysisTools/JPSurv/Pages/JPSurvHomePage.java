package AnalysisTools.JPSurv.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class JPSurvHomePage extends CommonUtils{
	
	public JPSurvHomePage(){
		
		PageFactory.initElements(WebDriverUtils.webDriver, this);
		
	}
	
	public String dicFilePath = "./src/test/resources/Tutorial_JPSURV.dic";
	public String txtFilePath = "./src/test/resources/Tutorial_JPSURV.txt"; 
	public String nonExampledicFilePath = "./src/test/resources/75surv_jpsurv_example_CTPR.dic";
	public String nonExampletxtFilePath = "./src/test/resources/75surv_jpsurv_example_CTPR.txt"; 
	public String csvFilePath = "./src/test/resources/Breast_RelativeSurvival_Head_NA0.csv";
	public String workspaceFilePath ="./src/test/resources/6f0198be-e61b-4528-815d-5716267aa5cc-Tutorial_JPSURV_2.jpsurv";
	public String nonExampleworkspaceFilePath ="./src/test/resources/1458ff97-5106-49ef-a3c4-9df94babe692-75surv_jpsurv_example_CTPR.jpsurv";
	
	
	/**================================================= Input Section =======================================================*/
	
	/** Files Format Text*/
	@FindBy(xpath = "//*[@id = 'inputTypeLabel'")
	public WebElement fileFormattxt; 
	
	/** Dic/Data files Radio button */
	@FindBy(xpath = "//*[@aria-label = 'dictionary'")
	public WebElement dicRadioBtn; 
	
	/** CSV Radio Button */
	@FindBy(xpath = "//label[normalize-space()='CSV Files']")
	public WebElement csvRadioBtn;
	
	/** Work Space Radio Button */
	@FindBy(xpath = "//*[@aria-label = 'importRadioButton'")
	public WebElement importRadioBtn;
	
	/**SEER Stat Dictionary/Data Files*/
	@FindBy(xpath = "//*[@for='file-control'")
	public WebElement seerDictionaryDataFiletxt;
	
	/**Dic Example Text**/
	@FindBy(xpath = "//*[@download='SEER9_Survival_6CancerSitesByStage_1975_2007.dic']")
	public WebElement dicExampleLink; 
	
	/**File Input**/
	@FindBy(xpath = "//*[@id='file_control']")
	public WebElement fileInputTextbox; 
	
	/** Workspace input **/
	@FindBy(xpath = "//input[@id='fileSelect']")
	public WebElement WorkspaceFileInputTextbox; 
	
	/**CVS Input **/
	@FindBy(id = "file_control_csv")
	public WebElement cvsFileInputTextbox; 
	
	/**Upload Btn **/
	@FindBy(xpath = "//*[@id='upload_dictxt']")
	public WebElement fileUploadBtn; 
	
	/**Configure CSV Btn **/
	@FindBy(xpath = "//button[@id='Adv_input']")
	public WebElement configureCSVbtn; 
	
	/**Upload CSV Btn **/
	@FindBy(xpath = "//button[@id='upload_csv']")
	public WebElement uploadCSVbtn; 
	
	/**Configure import Btn **/
	@FindBy(xpath = "//label[normalize-space()='Workspace']")
	public WebElement WorkspaceRadiobtn; 
	
	
/**================================================= Cohort Model and Specification =======================================================*/
	
	/**Year of Diagnosis drop down **/
	@FindBy(xpath = "//select[@id='selectYear']")
	public WebElement yearOfDiagnosisDropdown; 
	
	/**Year of Diagnosis start drop down **/
	@FindBy(xpath = "//select[@id='year_of_diagnosis_start']")
	public WebElement yearOfDiagnosisStartDropdown; 
	
	/**Year of Diagnosis end drop down **/
	@FindBy(xpath = "//select[@id='year_of_diagnosis_end']")
	public WebElement yearOfDiagnosisEndDropdown; 
	
	/**Max No.Of years from diagnosis **/
	@FindBy(xpath = "//select[@id='intervals_from_diagnosis']")
	public WebElement maxnumOfYearsFromDiagnosisDropdown; 
	
	/** Non-Hodgkin_Lymphoma check box**/
	@FindBy(id = "Colon_and_Rectum")
	public WebElement colonAndRectumCheckbox; 
	
	/** Non-Hodgkin_Lymphoma check box**/
	@FindBy(id = "Male")
	public WebElement maleCheckbox; 
	
	/** Non-Hodgkin_Lymphoma check box**/
	@FindBy(xpath = "(//label[normalize-space()='Non-Hodgkin Lymphoma'])[1]")
	public WebElement nonhodgkinlymphonmaCheckbox;

	/** Chronic_Myeloid_Leukemia check box**/
	@FindBy(id = "All_stages")
	public WebElement allStagesCheckbox; 

	/** max join points drop down**/
	@FindBy(id = "max_join_point_select")
	public WebElement maxPointsDropdown; 

	/** calculate button**/
	@FindBy(id = "calculate")
	public WebElement calculateButton; 
	
	/** Survival vs. Year at Diagnosis tab**/
	@FindBy(xpath = "//ul[@id='jpsurv-tabs']//a[text()='Survival vs. Year at Diagnosis']")
	public WebElement survivalVsYearAtDiagnosisTab; 
	
	/** Download full dataset button**/
	@FindBy(xpath = "//button[@id='full-dataset-link']")
	public WebElement downloadFullDataSetButton; 
	
	/** calculate button**/
	@FindBy(xpath = "exportButton")
	public WebElement exportWorkspaceButton; 
	
	/** show/hide parameters arrow button button **/
	@FindBy(xpath = "//i[@id='icon']")
	public WebElement showhidearrowButton;
	
	/** Reset Button **/
	@FindBy(xpath = "//input[@value='Reset']")
	public WebElement resetButton;
	
	/** Import Button for .jpsurv file **/
	@FindBy(xpath = "//button[@id='upload_session']")
	public WebElement importButton;

	/** Email textbox **/
	@FindBy(xpath = "//input[@id='e-mail']")
	public WebElement emailTextbox;

	/** submit button **/
	@FindBy(xpath = "//input[@id='calculate']")
	public WebElement submitButton;
	
	/** Confirmation of submission by email **/
	@FindBy(xpath = "//h2[normalize-space()='Calculation in Queue']")
	public WebElement submitemailConfirmation;
	
	/** Age rec value 0 **/
	@FindBy(xpath = "//label[@for='age_rec0']")
	public WebElement ageRecValue0Checkbox;
	
	/** Stage value 0 **/
	@FindBy(xpath = "//label[@for='stage0']")
	public WebElement stageValue0Checkbox;
	@FindBy(id= "1975")
	public WebElement yearOfDiagnosed;

	/**================================================= CSV Dropdown =====================================*/
	
	/** age_rec drop down **/
	@FindBy(xpath = "//th[@id='type_1']/select")
	public WebElement ager_recDD;
	
	/** Stage drop down **/
	@FindBy(xpath = "//th[@id='type_2']/select")
	public WebElement stageDD;
	
	/** year drop down **/
	@FindBy(xpath = "//th[@id='type_3']/select")
	public WebElement yearDXDD;
	
	/** Interval drop down **/
	@FindBy(xpath = "//th[@id='type_4']/select[@id='column_values']")
	public WebElement intervalDD;
	
	/** Alive At Start drop down **/
	@FindBy(xpath = "//th[@id='type_5']/select")
	public WebElement aliveAtStartDD;
	
	/** Died drop down **/
	@FindBy(xpath = "//th[@id='type_6']/select")
	public WebElement diedDD;
	
	/** Lost to followup drop down **/
	@FindBy(xpath = "//th[@id='type_7']/select")
	public WebElement lostToFollowUpDD;
	
	/** Exp_int drop down **/
	@FindBy(xpath = "//th[@id='type_10']/select")
	public WebElement expIntDD;
	
	/** Exp_int Column Value **/
	@FindBy(xpath = "//input[@id='header_10']")
	public WebElement expIntColumn;
	
		/** rel int drop down **/
	@FindBy(xpath = "//th[@id='type_12']/select")
	public WebElement relIntDD;
	
	/**rel cum drop down **/
	@FindBy(xpath = "//th[@id='type_13']/select")
	public WebElement relCumDD;
	
	/** se rel int drop down **/
	@FindBy(xpath = "//th[@id='type_16']/select")
	public WebElement seIntRelDD;
	
	/** se rel cum drop down **/
	@FindBy(xpath = "//th[@id='type_17']/select")
	public WebElement seRelCumDD;
	
	/** se rel cum Column Value **/
	@FindBy(xpath = "//input[@id='header_17']")
	public WebElement seRelColumn;
	@FindBy(xpath = "//a")
	public WebElement downloadFile;
	/** Save Button **/
	@FindBy(xpath = "//button[@onclick='save_params()']")
	public WebElement saveBtn; 
	
	
}
