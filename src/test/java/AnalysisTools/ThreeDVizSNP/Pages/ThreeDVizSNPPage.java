package AnalysisTools.ThreeDVizSNP.Pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class ThreeDVizSNPPage extends CommonUtils {

	public ThreeDVizSNPPage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}

	/** choose visualize button ***/
	@FindBy(xpath = "//a[text()='Visualize']")
	public WebElement visulizeButton;

	/** About Button **/
	@FindBy(xpath = "//a[text()='About']")
	public WebElement aboutButton;

	/** VCF FILE Upload **/
	@FindBy(name = "vcfFile")
	public WebElement vcfFileUpload;

	/** GENE Text Box **/
	@FindBy(name = "gene")
	public WebElement geneTextbox;

	/** Submit Button **/
	@FindBy(xpath = "//button[text()='Submit']")
	public WebElement submitButton;

	/** VCF FILE INputBox **/
	@FindBy(id = "vcfFile")
	public WebElement vcfFIle;

	/** Download Results **/
	@FindBy(xpath = "//a[text()='Download Results']")
	public WebElement downloadResults;

	/** Number of records **/
	@FindBy(xpath = "//div[text()='Total # of Records: ']")
	public WebElement recordCount;

	/** FIrst Varient **/
	@FindBy(xpath = "//div[text()='Variant']/parent::th/parent::tr/parent::thead/following-sibling::tbody//td")
	public WebElement firstVarient;

	/** Varient Header **/
	@FindBy(xpath = "//*[text()='Variant']")
	public WebElement varientHeader;

	/** Varient desending sorting indicator **/
	@FindBy(xpath = "//i[@class='bi bi-sort-down ms-1']")
	public WebElement sortingOrderApplied;

	/** Filter Option **/
	@FindBy(xpath = "//input[@type=\"input\"]")
	public WebElement filterOption;

	/** Number of pages **/
	@FindBy(xpath = "(//small)[2]")
	public WebElement numberOfPages;

	/** Long Running Job CheckBox **/
	@FindBy(name = "useAsync")
	public WebElement longRunningJobCheckBox;

	/** LEmail Id **/
	@FindBy(id = "email")
	public WebElement emailId;

	/** jobName **/
	@FindBy(id = "jobName")
	public WebElement jobName;
	
	/** gene text box **/
	@FindBy(id = "gene")
	public WebElement gene;
	
	/** Error Message **/
	@FindBy(xpath = "//pre[text()='The Gene symbols searched for are not found in the attached file, please change the search criteria of the gene symbols and resubmit the analysis.']")
	public WebElement errorMessage;
	
	/** Email Notification Sent **/
	@FindBy(xpath="//span[text()=' You will receive an email once processing is complete.']")
	public WebElement emailNotificationCnfirmation;
	
	/** Error Message for invalid Job**/
	@FindBy(xpath = "//div[text()='Visualization Job Failed']")
	public WebElement invalidJobErrorMessage;
	
	/** SVG Button **/
	@FindBy(xpath="//button[text()='SVG' and contains(@id,'linegraph_svg')]")
	public WebElement svgButton;
	
	/** PNG Button **/
	@FindBy(xpath="//button[text()='PNG' and contains(@id,'linegraph_pn')]")
	public WebElement pngButton;
	/** SVG Button **/
	@FindBy(xpath="//button[text()='JSON' and contains(@id,'linegraph_json')]")
	public WebElement jsonButton;
	
	/** Summary Button **/
	@FindBy(xpath="//a[text()='Summary']")
	public WebElement summaryButton;
	
	/** Feedback button **/
	@FindBy(id = "QSIFeedbackButton-btn")
	public WebElement feedback;
	
	/** Feedback ifrme **/
	@FindBy(xpath="//*[@title=\"ICN3D\"]")
	public WebElement ifrmaeFeedback;
	}