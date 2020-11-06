package AnalysisTools.PLCO.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class APIAcessPage extends CommonUtils {
	
	public APIAcessPage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}
	
	/** API Acess Tab **/
	@FindBy(xpath = "//*[@href='#/api-access']")
	public WebElement lnkAPIAcess;
	
	/** API Acess Page Heading **/
	@FindBy(xpath = "//h1[contains(text(), 'API Access')]")
	public WebElement txtAPIAcessHeading;
	
	
	
	

}
