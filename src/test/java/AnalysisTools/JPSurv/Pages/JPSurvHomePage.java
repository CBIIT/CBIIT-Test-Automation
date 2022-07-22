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
	
	public String dicFilePath = "/Users/uddins2/git/CBIIT-Test-Automation/src/test/resources/SEER9_Survival_6CancerSitesByStage_1975_2007.dic";
	public String txtFilePath = "/Users/uddins2/git/CBIIT-Test-Automation/src/test/resources/SEER9_Survival_6CancerSitesByStage_1975_2007.txt"; 
	
/**================================================= Input Section =======================================================*/
	
	/** Files Format Text*/
	@FindBy(xpath = "//*[@id = 'inputTypeLabel'")
	public WebElement fileFormattxt; 
	
	/** Dic/Data files Radio button */
	@FindBy(xpath = "//*[@aria-label = 'dictionary'")
	public WebElement dicRadioBtn; 
	
	/** CSV Radio Button */
	@FindBy(xpath = "//*[@aria-label = 'csv'")
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
	
	/**Upload Btn **/
	@FindBy(xpath = "//*[@id='upload_dictxt']")
	public WebElement fileUploadBtn; 
	
	
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
	
	/** calculate button**/
	@FindBy(id = "full-dataset-link")
	public WebElement downloadFullDataSetButton; 
	
	/** calculate button**/
	@FindBy(id = "exportButton")
	public WebElement exportWorkspaceButton; 




}
