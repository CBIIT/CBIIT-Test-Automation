package AnalysisTools.LDLink.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nci.automation.web.WebDriverUtils;

public class LDLinkLandingPage {
	
	public LDLinkLandingPage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}
	
	@FindBy(linkText = "LDLink")
	public WebElement lnkLDLink; 
	
	
//	@FindBy(xpath = "//a[text() = 'LDLink']/../following-sibling::div")
//	public WebElement lblLDLinkDescripition; 
	
	@FindBy(xpath = "(//div[@class='tools-section'])[8]/div")
	public WebElement lblLDLinkDescripition; 
	

}
