package AnalysisTools.CEDCD.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nci.automation.web.WebDriverUtils;

public class CEDCDAdminPage {
	
	public CEDCDAdminPage(){
		
		PageFactory.initElements(WebDriverUtils.webDriver, this);
		
	}
	
	/**================================================= Internal Login Page WebElements =======================================================*/
	
	@FindBy(id="USER")
	public WebElement internalUsernameTxtBox; 
	
	@FindBy(id="PASSWORD")
	public WebElement internalPasswordTxtBox; 
	
	@FindBy(xpath = "//*[@type='submit']")
	public WebElement submit; 
	
	

}
