package AnalysisTools.LDLink.Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class LDLinkHomePage extends CommonUtils {
	
	
	public LDLinkHomePage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}
	
	@FindBy(xpath = "//div[@class='card-outside']")
	public List<WebElement> crdLDLinkApplications;
	
	@FindBy(xpath = "//div[@id='home-tab']/div/h2")
	public List<WebElement> lblWelcomeHeading;
	
	@FindBy(xpath = "//div[@id='home-tab']/div[2]/p")
	public List<WebElement> lblLDLinkDescription;

}
