package AnalysisTools.PLCO.Pages;

import java.util.ArrayList;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class PLCOAboutPage extends CommonUtils {
	
	public PLCOAboutPage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}
	
	@FindBy(linkText = "About")
	public WebElement lnkAbout; 
	
	@FindBy(linkText = "GitHub")
	public WebElement lnkGitHub; 
	


}
