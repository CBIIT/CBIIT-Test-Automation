package AnalysisTools.PLCO.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class BrowsePhenotypePage extends CommonUtils {

	/**Browse Phenotype Tab**/
	@FindBy(xpath = "//*[@href='#/phenotypes']")
	public WebElement lnkBrowsePhenotype; 
	
	/** Select A Phenotype Text **/
	@FindBy(xpath = "//*[@class='h5 text-center text-secondary my-1']")
	public WebElement txtSelectPhenotype; 

	
	
	public BrowsePhenotypePage(){
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}
	
}
