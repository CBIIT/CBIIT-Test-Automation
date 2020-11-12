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
	
	/** BMI at Baseline BQ check box **/
	@FindBy(xpath = "(//*[@type='checkbox'])[8]")
	public WebElement chkBMIBaseLine; 
	
	/** Height BQ Check Box**/
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
	@FindBy(xpath = "//*[@class='manhattan-plot gene-plot-collapsed']")
	public WebElement dspManhattanPlot; 
	
	

}
