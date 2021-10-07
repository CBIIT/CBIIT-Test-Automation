package AnalysisTools.mSigPortal.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class SignatureVisualizationsPage extends CommonUtils {

	public SignatureVisualizationsPage() {

		PageFactory.initElements(WebDriverUtils.webDriver, this);

	}

	/** These are the elements on the Signature Visualizations Page */

	/** Data Sources User radio button value */
	@FindBy(xpath = "//input[@id='radioUser']")
	public WebElement userDataSourceRadioButton;

	/** Load Example Data button */
	@FindBy(xpath = "//button[contains(text(),'Load Example Data')]")
	public WebElement loadExampleDataButton;

	/** Submit button on signature visualization tab */
	@FindBy(xpath = "(//button[contains(text(),'Submit')])[1]")
	public WebElement submitButton;

	/** The Remove File button on the signature visualization tab */
	@FindBy(xpath = "//button[contains(text(),'Remove File')]")
	public WebElement removeFilesButton;

	/** Profile Comparison tab web element */
	@FindBy(xpath = "(//button[contains(text(),'Profile Comparison')])[1]")
	public WebElement profileComparisonTab;

	/** PC to Reference tab on profile comparison */
	@FindBy(xpath = "//strong[contains(text(),'PC to Reference Signatures')]")
	public WebElement pcToReferenceTab;

	/** Sample name 1 drop down */
	@FindBy(xpath = "(//div[@class=' css-2b097c-container'])[14]")
	public WebElement sample1Dropdown;

	/** Sample name 2 drop down */
	@FindBy(xpath = "(//div[@class=' css-2b097c-container'])[15]")
	public WebElement sample2Dropdown;

	/** Calculate button on Profile comparison tab */
	@FindBy(xpath = "(//button[contains(text(),'Calculate')])[6]")
	public WebElement calculateButtonOnPcToReferenceTab;

	/**
	 * This is the plot of data returned on the profile comparison tab on the PC to
	 * Reference Tab
	 */
	@FindBy(xpath = "(//div[@class='react-transform-element TransformComponent-module_content__TZU5O '])[2]")
	public WebElement plotReturnedOnProfileComparison;

	/** This is the download plot link web element */
	@FindBy(xpath = "(//button[contains(text(),'Download Plot')])[1]")
	public WebElement downloadPlotOnProfileSummary;

	/** This is the download section tab on the Signature Visualizations page */
	@FindBy(xpath = "(//button[contains(text(),'Download')])[1]")
	public WebElement downloadTab;

	/** This is the description of the download tab */
	@FindBy(xpath = "//p[contains(text(),'were successfully analyzed.')]")
	public WebElement downloadDescriptionText;

}
