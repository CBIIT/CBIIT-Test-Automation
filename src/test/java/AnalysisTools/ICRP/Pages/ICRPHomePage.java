package AnalysisTools.ICRP.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class ICRPHomePage extends CommonUtils {
	
	@FindBy(xpath = "(//*[@class='dropdown-toggle'])[1]")
	public WebElement ICRPDataBtn; 
	
	
	@FindBy(xpath = "//*[@title='Search and analyze the ICRP Database']")
	public WebElement searchDatabaseBtn;
	
	
	public ICRPHomePage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
		
	}
	
	

}
