package AnalysisTools.mSigPortal.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class SignatureExplorerPages extends CommonUtils {

	public SignatureExplorerPages() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}

	/* This is the locator for the calculateOnExplorerTab */
	@FindBy(xpath = "//button[contains(text(),'Calculate')]")
	public WebElement calculateOnExplorerTab;

	/* This is the locator for the downloadFirstPlotOnSignatureExplorer */
	@FindBy(xpath = "(//button[contains(text(),'Download Plot')])[1]")
	public WebElement downloadFirstPlotOnSignatureExplorer;

	/* This is the locator for the exposureTabOnSignatureExposureSection */
	@FindBy(xpath = "(//a[contains(text(),'Exposure')])[1]")
	public WebElement exposureTabOnSignatureExposureSection;

	/* This is the locator for the calculateAllButtonOnExposureTab */
	@FindBy(xpath = "//button[contains(text(),'Calculate All')]")
	public WebElement calculateAllButtonOnExposureTab;

	/* This is the locator for the calculateOnTumorMutationalBurdenSearch */
	@FindBy(xpath = "(//button[contains(text(),'Calculate')])[2]")
	public WebElement calculateOnTumorMutationalBurdenSearch;

	/* This is the locator for the imageOnExposureSearch */
	@FindBy(xpath = "//*[@id='tmbPlot']/div/div[2]/div/img")
	public WebElement imageOnExposureSearch;

	/* This is the locator for the explorerCalculate */
	@FindBy(xpath = "//button[contains(text(),'Calculate')]")
	public WebElement explorerCalculate;

	/* This is the locator for the tmbText */
	@FindBy(xpath = "//strong[contains(text(),'Tumor Mutational Burden')]")
	public WebElement tmbText;

	/* This is the locator for the instructionsOnExplorerPage */
	@FindBy(xpath = "//p[contains(text(),'Choose a Data Source and its associated options to submit a query using the panel on the left')]")
	public WebElement instructionsOnExplorerPage;
}