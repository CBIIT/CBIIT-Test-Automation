package AnalysisTools.PLCO.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;


public class ExploreGWASPage extends CommonUtils {
	
	public ExploreGWASPage(){
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}
	
	/*** Summary Results Tab WebElements ***/
	
	/** Explore GWAS tab **/
	@FindBy(xpath = "(//*[@href='#/gwas'])[3]")
	public WebElement lnkExploreGWAS;
	
	/** Anthropometric Measures Plus Mark Box **/
	@FindBy(xpath = "(//*[@role='button'])[2]")
	public WebElement btnPlusAnthropometricMeasures; 
	
	/** BMI Plus Mark Box **/
	@FindBy(xpath = "(//*[@role='button'])[3]")
	public WebElement btnPlusBMI;
	
	/** Height Plus Mark Box **/
	@FindBy(xpath = "(//*[@role='button'])[4]")
	public WebElement btnPlusHeight; 
	
	/** Pairwise Plot Check Box **/
	@FindBy(xpath = "//*[@for='is-pairwise']")
	public WebElement chkPairWise;
	
	/** BMI at Baseline BQ check box for Summary Results **/
	@FindBy(xpath = "(//*[@type='checkbox'])[8]")
	public WebElement chkBMIBaseLineSummary; 
	
	/** Height BQ Check Box for Summary Results**/
	@FindBy(xpath = "//*[@title='Height (BQ)']")
	public WebElement chkHeight; 
	
	
	/** Ancestry/Sex drop down Top*/
	@FindBy(xpath = "(//*[@class='form-control'])[1]")
	public WebElement selAncestryTop; 
	
	/** Ancestry/Sex drop down Bottom**/
	@FindBy(xpath = "(//*[@class='form-control'])[2]")
	public WebElement selAncestryBottom; 
	
	/** Submit button for Summary Results **/
	@FindBy(xpath = "//*[@type='submit']")
	public WebElement subSummaryResults; 
	
	/** Manhattan Plot **/
//	@FindBy(xpath = "//*[@class='manhattan-plot gene-plot-collapsed']")
//	public WebElement dspManhattanPlot; 
	
	/** Manhattan Plot **/
	@FindBy(xpath = "//div[@role='tabpanel' and contains(@class, 'active')]//canvas[contains(@style, 'block')]")
	public WebElement dspManhattanPlot; 
	
	/** Summary Results tab **/
	@FindBy(xpath = "//*[@href='#/gwas/summary']")
	public WebElement txtSummaryResults;
	
	/**Gene Plot**/
	@FindBy(xpath = "//div[@data-type='gene-plot']/canvas")
	public WebElement dspGenePlot; 
	
	
	/**** Variant Lookup Tab WebElements ***/
	
	/**Variant Lookup Tab**/
	@FindBy(xpath = "//*[@href='#/gwas/lookup']")
	public WebElement lnkVariantLookUp;
	
	/** Variant Search Textbox **/
	@FindBy(xpath = "//*[@id='lookup-form-variant']")
	public WebElement actVariantTextBox; 
	
	/** BMI at Baseline BQ check box Variant Lookup **/
	@FindBy(xpath = "(//*[@type='checkbox'])[7]")
	public WebElement chkBMIBaseLineVariantLookup;
	
	/** Ancestry dropdown for variant lookup **/
	@FindBy(xpath = "//*[@id='lookup-form-ancestry']")
	public WebElement selAncestryVariantLookup;
	
	/** Sex Dropdown for variant lookup **/
	@FindBy(xpath = "//*[@id='lookup-form-sex']")
	public WebElement selSexVariantLookup;
	
	/** Variant Lookup Table **/
	@FindBy(xpath = "//*[@class='react-bootstrap-table table-responsive']")
	public WebElement dspVariantLookupResults;
	
	/** Phenotype Correlations Tab WebElements **/
	
	/** Phenotype Correlations Tab **/
	@FindBy(xpath = "//*[@href='#/gwas/correlations']")
	public WebElement lnkPhenotypeCorrelationsTab;
	
	
	/** BMI at Baseline BQ check box for Phenotype Correlation **/
	@FindBy(xpath = "(//*[@type='checkbox'])[7]")
	public WebElement chkBMIBaseLinePhenotypeCorrelations; 
	
	/** Check height check box for Phenotype Correlation **/
	@FindBy(xpath = "(//*[@role='button'])[13]")
	public WebElement chkHeightPhenotypeCorrelation;
	
	

}
