package ANALYSIS_TOOLS.ThreeDVizSNP.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;
import java.util.List;

public class ThreeDVizSNPPage extends CommonUtils {

	public ThreeDVizSNPPage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}

	/** CHOOSE VISUALIZE BUTTON ***/
	@FindBy(xpath = "//a[text()='Visualize']")
	public WebElement visulizeButton;

	/** ABOUT BUTTON **/
	@FindBy(xpath = "//a[text()='About']")
	public WebElement aboutButton;

	/** VCF FILE UPLOAD **/
	@FindBy(name = "vcfFile")
	public WebElement vcfFileUpload;

	/** GENE TEXT BOX **/
	@FindBy(name = "gene")
	public WebElement geneTextbox;

	/** SUBMIT BUTTON **/
	@FindBy(xpath = "//button[text()='Submit']")
	public WebElement submitButton;

	/** VCF FILE INPUTBOX **/
	@FindBy(id = "vcfFile")
	public WebElement vcfFIle;

	/** DOWNLOAD RESULTS **/
	@FindBy(xpath = "//a[text()='Download Results']")
	public WebElement downloadResults;

	/** NUMBER OF RECORDS **/
	@FindBy(xpath = "//div[text()='Total # of Records: ']")
	public WebElement recordCount;

	/** FIRST VARIENT **/
	@FindBy(xpath = "(//div[text()='Variant']/parent::th/parent::tr/parent::thead/following-sibling::tbody//td)[17]")
	public WebElement firstVarient;

	/** VARIENT HEADER **/
	@FindBy(xpath = "//*[text()='Variant']")
	public WebElement varientHeader;

	/** VARIENT DESENDING SORTING INDICATOR **/
	@FindBy(xpath = "//i[@class='bi bi-sort-down ms-1']")
	public WebElement sortingOrderApplied;

	/** FILTER OPTION **/
	@FindBy(xpath = "//input[@type='input']")
	public WebElement filterOption;

	/** NUMBER OF PAGES **/
	@FindBy(xpath = "(//small)[2]")
	public WebElement numberOfPages;

	/** LONG RUNNING JOB CHECKBOX **/
	@FindBy(name = "useAsync")
	public WebElement longRunningJobCheckBox;

	/** EMAIL ID **/
	@FindBy(id = "email")
	public WebElement emailId;

	/** JOB NAME **/
	@FindBy(id = "jobName")
	public WebElement jobName;
	
	/** GENE TEXT BOX **/
	@FindBy(id = "gene")
	public WebElement gene;
	
	/** ERROR MESSAGE **/
	@FindBy(xpath = "//pre[text()='The Gene symbols searched for are not found in the attached file, please change the search criteria of the gene symbols and resubmit the analysis.']")
	public WebElement errorMessage;
	
	/** EMAIL NOTIFICATION SENT **/
	@FindBy(xpath="//span[text()=' You will receive an email once processing is complete.']")
	public WebElement emailNotificationCnfirmation;
	
	/** ERROR MESSAGE FOR INVALID JOB**/
	@FindBy(xpath = "//div[text()='Visualization Job Failed']")
	public WebElement invalidJobErrorMessage;
	
	/** SVG BUTTON **/
	@FindBy(xpath="//button[text()='SVG' and contains(@id,'linegraph_svg')]")
	public WebElement svgButton;
	
	/** PNG BUTTON **/
	@FindBy(xpath="//button[text()='PNG' and contains(@id,'linegraph_pn')]")
	public WebElement pngButton;
	
	/** SVG BUTTON **/
	@FindBy(xpath="//button[text()='JSON' and contains(@id,'linegraph_json')]")
	public WebElement jsonButton;
	
	/** SUMMARY BUTTON **/
	@FindBy(xpath="//a[text()='Summary']")
	public WebElement summaryButton;
	
	/** FEEDBACK BUTTON **/
	@FindBy(id = "QSIFeedbackButton-btn")
	public WebElement feedback;
	
	/** FEEDBACK BUTTON LOCATOR **/
	public String feedbackLocator = "//button[@id='QSIFeedbackButton-btn']";
	
	/** FEEDBACK IFRAME **/
	@FindBy(xpath="//*[@title='ICN3D']")
	public WebElement ifrmaeFeedback;

	/* THESE ARE ALL THE FILE INPUT FIELDS*/
	@FindBy(xpath = "//div[@class='shadow p-3 rounded']//form//child::div[1]//child::div")
	public List<WebElement> allUploadFields;

	/** VCF TEXT**/
	@FindBy(xpath="//label[normalize-space()='VCF File']")
	public WebElement actualVcfText;
}