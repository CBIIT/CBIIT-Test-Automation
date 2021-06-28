package AnalysisTools.PLCO.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
<<<<<<< Updated upstream
=======
<<<<<<< HEAD

=======
>>>>>>> 8f4e2d8f13237294dd99ecbb9a77e6b945dae2eb
>>>>>>> Stashed changes
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class BrowsePhenotypePage extends CommonUtils {
<<<<<<< Updated upstream

=======
<<<<<<< HEAD
	
	public BrowsePhenotypePage(){
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}
	
=======

>>>>>>> 8f4e2d8f13237294dd99ecbb9a77e6b945dae2eb
>>>>>>> Stashed changes
	/**Browse Phenotype Tab**/
	@FindBy(xpath = "//*[@href='#/phenotypes']")
	public WebElement lnkBrowsePhenotype; 
	
	/** Select A Phenotype Text **/
	@FindBy(xpath = "//*[@class='h5 text-center text-secondary my-1']")
	public WebElement txtSelectPhenotype; 

<<<<<<< Updated upstream
	public BrowsePhenotypePage(){
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}
=======
<<<<<<< HEAD
=======
	public BrowsePhenotypePage(){
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}
>>>>>>> 8f4e2d8f13237294dd99ecbb9a77e6b945dae2eb
>>>>>>> Stashed changes
}
