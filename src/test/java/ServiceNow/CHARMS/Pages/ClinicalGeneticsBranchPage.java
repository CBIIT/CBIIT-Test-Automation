package ServiceNow.CHARMS.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class ClinicalGeneticsBranchPage extends CommonUtils{
	
	/** Warning Agree Button*/
	@FindBy(xpath = "//button[contains(text(),'Agree')]")
	public WebElement charmsAgreeBtn;
	
	/** Clinical Genetics Branch Text */
	@FindBy(xpath = "//div[contains(text(),'Clinical Genetics Branch')]")
	public WebElement clinicalGeneticsBranchText;
	
	
	
	
	public ClinicalGeneticsBranchPage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
		
	}

}
