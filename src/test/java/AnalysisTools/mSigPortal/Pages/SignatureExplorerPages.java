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
	/**  */
	@FindBy (xpath = "//button[contains(text(),'Calculate')]")
	public WebElement calculateOnExplorerTab;
	
	@FindBy (xpath = "(//button[contains(text(),'Download Plot')])[1]")
	public WebElement downloadFirstPlotOnSignatureExplorer;
	
	@FindBy (xpath = "(//a[contains(text(),'Exposure')])[1]")
	public WebElement exposureTabOnSignatureExposureSection;
	
	@FindBy (xpath = "//button[contains(text(),'Calculate All')]")
	public WebElement calculateAllButtonOnExposureTab;
	
	@FindBy (xpath = "(//button[contains(text(),'Calculate')])[2]")
	public WebElement calculateOnTumorMutationalBurdenSearch;
	
	@FindBy (xpath = "//*[@id='tmbPlot']/div/div[2]/div/img")
	public WebElement imageOnExposureSearch;
	
	@FindBy (xpath = "//button[contains(text(),'Calculate')]")
	public WebElement explorerCalculate;
	
	@FindBy (xpath = "//strong[contains(text(),'Tumor Mutational Burden')]")
	public WebElement tmbText;
	
	@FindBy (xpath = "//p[contains(text(),'Choose a Data Source and its associated options to submit a query using the panel on the left')]")
	public WebElement instructionsOnExplorerPage;
	
	

}
