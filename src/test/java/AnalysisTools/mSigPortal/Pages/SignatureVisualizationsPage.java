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
	@FindBy(xpath = "//button[@title = 'Remove']")
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
	
	/** This is the Mutational Profiles section Tab at the top of the screen */
	@FindBy (xpath = "(//button[contains(text(),'Mutational Profiles')])[1]")
	public WebElement mutationalProfileTab;
	
	/** This is the Sample Name text box under mutational profile tab */
	@FindBy (xpath = "//input[@id='mpSampleName']")
	public WebElement mutationalProfileSampleNameTextBox;
	
	/** This is the Sample Name text box under mutational profile tab's "SB749362" value */
	@FindBy (xpath = "//div[contains(text(),'SB749362')]")
	public WebElement mutationalProfileSampleNameBorder;
	
	/** This is the Cosine Similarity tab  */
	@FindBy (xpath = "(//button[contains(text(),'Cosine Similarity')])[1]")
	public WebElement cosineSimilarityTab;
	
	/** This is the CS Within Samples tab under the Cosine Similarities tab */
	@FindBy (xpath = "//*[@id=\"root\"]/div[2]/div[2]/div[2]/div/div/div[1]/div[1]/button/strong")
	public WebElement csWithinSamplesTab;
	
	/** This is the Cosine Similarity Within Samples calculate button  */
	@FindBy (xpath = "(//button[contains(text(),'Calculate')])[1]")
	public WebElement csWithinSamplesCalculateButton;
	
	/** This is the CS to Reference tab under the Cosine Similarities tab */
	@FindBy (xpath = "//strong[contains(text(),'CS to Reference Signatures')]")
	public WebElement csToReferenceTab;
	
	/** This is the Cosine Similarity to Reference Signatures calculate button  */
	@FindBy (xpath = "(//button[contains(text(),'Calculate')])[2]")
	public WebElement csToReferenceSignaturesCalculateButton;
	
	/** This is the CS to Public Data tab under the Cosine Similarities tab */
	@FindBy (xpath = "//strong[contains(text(),'CS to Public Data')]")
	public WebElement csToPublicDataTab;
	
	/** This is the Cosine Similarity to Public Data calculate button  */
	@FindBy (xpath = "(//button[contains(text(),'Calculate')])[3]")
	public WebElement csToPublicDataCalculateButton;
	
	/** This is the compare signature info button */
	@FindBy (xpath = "//button[@aria-label='compare signatures info']")
	public WebElement compareSignatureInfoButton;
	
	/** This is the compare signature info pop up box */
	@FindBy (xpath = "//div[@id='popover-basic']")
	public WebElement signatureInfoPopUpBox;
	
	/** This is the Profile Type drop down on the Profile Comparison tab under Visualization section */
	@FindBy (xpath = "(//div[contains(text(),'SBS')])[2]")
	public WebElement profileTypeSBSDropDown;
	
	/** This is the "demo_input_multi.vcf.gz" text value for the Upload File browser on the user inputed table */
	@FindBy (xpath = "//label[contains(text(),'demo_input_multi.vcf.gz')]")
	public WebElement uploadFileVCFText;
	
	/** This is the calculate button on the PC to Reference Signatures on the Visualization Tab */
	@FindBy (xpath = "(//button[contains(text(),'Calculate')])[2]")
	public WebElement calculateOnPcReferenceSignatures;
	
	/** This is the submit button when on the Public Visualization page */
	@FindBy (xpath = "(//button[contains(text(),'Submit')])[2]")
	public WebElement visualPublicSubmitButton;
	
	/** This is the plot returned on the Profiler Summary when using public data */
	@FindBy (xpath = "//div[@class='react-transform-component transform-component-module_content__2jYgh ']")
	public WebElement publicPlotOnProfilerSummary;
	
	/** This is the text header for the Profiler Summary */
	@FindBy (xpath = "//b[contains(text(),'Number of Mutations Per Sample with Regard to Mutational Profile')]")
	public WebElement profilerSummaryHeaderText;
	

}
