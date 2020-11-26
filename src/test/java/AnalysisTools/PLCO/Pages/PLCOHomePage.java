package AnalysisTools.PLCO.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class PLCOHomePage extends CommonUtils {
	
	public PLCOHomePage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}
	
	@FindBy(linkText = "source code")
	public WebElement lnkSourceCode; 

}
