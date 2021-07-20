package AnalysisTools.PLCO.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
<<<<<<< HEAD

=======
>>>>>>> 50ca581691149b22cd7787846a4643ffc08a645c
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class BrowsePhenotypePage extends CommonUtils {
<<<<<<< HEAD
	
	public BrowsePhenotypePage(){
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}
	
=======

>>>>>>> 50ca581691149b22cd7787846a4643ffc08a645c
	/**Browse Phenotype Tab**/
	@FindBy(xpath = "//*[@href='#/phenotypes']")
	public WebElement lnkBrowsePhenotype; 
	
	/** Select A Phenotype Text **/
	@FindBy(xpath = "//*[@class='h5 text-center text-secondary my-1']")
	public WebElement txtSelectPhenotype; 

<<<<<<< HEAD
=======
	public BrowsePhenotypePage(){
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}
>>>>>>> 50ca581691149b22cd7787846a4643ffc08a645c
}
