package ANALYSIS_TOOLS.CometsAnalytics.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;
import java.util.List;

public class CometsAnalyticsPage extends CommonUtils {

	public CometsAnalyticsPage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}

	/** ANALYSIS BUTTON **/
	@FindBy(xpath = "//a[@href='/analysis']")
	public WebElement analysisButton;

	/** CHECK INTEGRITY BUTTON **/
	@FindBy(xpath = "//button[text()='Check Integrity']")
	public WebElement checkIntegretyButton;

	/* TUTORIALS BUTTON */
	@FindBy(xpath = "//a[normalize-space()='Tutorials']")
	public WebElement tutorialsButton;

	/* ABOUT COMETS BUTTON */
	@FindBy(xpath = "//body//footer//div//ul//li//a[@href='https://epi.grants.cancer.gov/comets/']")
	public WebElement aboutCometsButton;

	/* VIGNETTES BUTTON */
	@FindBy(xpath = "//a[normalize-space()='Vignettes']")
	public WebElement vignettesButton;

	/** ABOUT BUTTON **/
	@FindBy(xpath = "//a[@href='/about']")
	public WebElement aboutButton;

	/** ACCESSIBILITY TEXT **/
	@FindBy(xpath = "//h2[text()='Accessibility']")
	public WebElement accessibilityText;

	/** CURRENT VERSION **/
	@FindBy(xpath = "//h2[text()='Current Version Functionality']")
	public WebElement currentVersionFunctionalityText;

	/** HELP TEXT **/
	@FindBy(xpath = "//h2[text()='Help']")
	public WebElement HelpText;

	/** DOWNLOAD BUTTON **/
	@FindBy(xpath = "//a[text()='Download Sample Input']")
	public WebElement downloadSampleInput;

	/** COHORT DROPDOWN **/
	@FindBy(id = "cohort")
	public WebElement cohortDropDown;

	/** INPUT FILE UPLOAD **/
	@FindBy(id = "inputFile")
	public WebElement inputFileUpload;

	/** CHECK INTEGRITY BUTTON **/
	@FindBy(xpath = "//*[@id='main-content']/div/div/div[1]/div/div/form/div[3]/button[2]")
	public WebElement checkIntegrityButton;

	/** CHECK SUCCESS MESSAGE **/
	@FindBy(xpath = "//*[@id='results-tabs-tabpane-integrityCheckResults']/div[1]/h2")
	public WebElement SuccessMessage;

	/** CHECK ERROR MESSAGE **/
	@FindBy(xpath = "//*[@id='results-tabs-tabpane-integrityCheckResults']/div/h2")
	public WebElement ErrorMessage;

	/** VALIDATION RESULT MESSAGE **/
	@FindBy(xpath = "//*[@id='results-tabs-tabpane-integrityCheckResults']/div/h2")
	public WebElement message;

	/** RESET BUTTON **/
	@FindBy(xpath = "//button[@type='reset']")
	public WebElement resetButton;

	/** DOWNLOAD RESULTS BUTTON **/
	@FindBy(xpath = "//button[text()='Download Results']")
	public WebElement downloadResults;

	/** EMAIL ID **/
	@FindBy(id = "email")
	public WebElement emailId;

	/** RUN MODEL BUTTON **/
	@FindBy(xpath = "//button[text()='Run Models']")
	public WebElement runModel;

	/** EMAIL REPORT TEXT **/
	@FindBy(xpath = "//h2[text()='Results Will Be Emailed']")
	public WebElement emailReport;

	/** SELECTED MODEL RADIO **/
	@FindBy(id = "selectedModel")
	public WebElement selectedModel;

	/** PREDEFINED MODEL CHECKBOX **/
	@FindBy(id = "showPredefinedModelTypes")
	public WebElement showPredefinedModelTypes;

	/** MODEL DOWNDROP **/
	@FindBy(id = "react-select-2-input")
	public WebElement modelDropDown;

	/** MODEL TYPE DROPDOWN **/
	@FindBy(id = "selectedModelType")
	public WebElement selectedModelType;

	/** MODEL2 DROPDOWN **/
	@FindBy(id = "react-select-2-input")
	public WebElement modelDropdown2;

	/** MODEL DROPDOWN OPTION **/
	@FindBy(id = "react-select-2-option-0")
	public WebElement modelDropDownOption;

	/** RUN MODEL **/
	@FindBy(xpath = "//button[text()='Run Model']")
	public WebElement runModelButton;

	/** DOWNLOAD RESULTS BUTTON **/
	@FindBy(xpath = "(//button[text()='Download Results'])[2]")
	public WebElement downloadButton;

	/** CUSTOM MODEL **/
	@FindBy(id = "customModel")
	public WebElement customModelRadio;

	/** CSUTOM MODEL TYPES **/
	@FindBy(id = "showCustomModelTypes")
	public WebElement showCustomModelTypes;

	/** SHOW META BOLITIES **/
	@FindBy(id = "showMetabolites")
	public WebElement showMetabolites;

	/** EXPOSURES BUTTON **/
	@FindBy(id = "react-select-2-input")
	public WebElement exposures;

	/** HEATMAP TAB **/
	@FindBy(xpath = "//a[text()='Heatmap']")
	public WebElement heatMapTab;

	/** PVALUE RANGE **/
	@FindBy(id = "pValueRange")
	public WebElement pValueRange;

	/** RESET BUTTON UNDER METHOD OF ANALYSES **/
	@FindBy(xpath = "//div[2]//div[1]//form[1]//div[3]//button[1]")
	public WebElement resetButtonUnderMethodOfAnalyses;

	/** CROSS BUTTON **/
	@FindBy(xpath = "//div[@class='fade alert alert-primary alert-dismissible show']//button[@aria-label='Close alert']")
	public WebElement crossButton;

	/** CHECK ELEMENT CONTAINS SUCCESS MESSAGE **/
	@FindBy(xpath = "//div[@class='fade alert alert-primary alert-dismissible show']")
	public List<WebElement> SuccessMessageElement;

	/** SELECT PAGE SIZE **/
	@FindBy(xpath = "//select[@name='select-page-size']")
	public WebElement selectPageSize;

	/** DOWNLOAD BUTTON IN MODEL RESULT **/
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/h2[1]/button[1]")
	public WebElement downloadButtonModelResult;

	/** LAST BUTTON IN THE MODEL RESULT PAGE **/
	@FindBy(xpath = "//span[@aria-hidden='true'][normalize-space()='Last']")
	public WebElement lastButton;
}