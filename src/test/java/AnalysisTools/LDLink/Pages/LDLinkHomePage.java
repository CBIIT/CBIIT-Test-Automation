package AnalysisTools.LDLink.Pages;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
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
	public WebElement lblWelcomeHeading;
	
	@FindBy(xpath = "//div[@id='home-tab']/div[2]/p")
	public WebElement lblLDLinkWelcomeNote;
	
	@FindBy(xpath = "//a[@dest='ldexpress']/div[1]")
	public WebElement lnkLdExpress;
	
	
	public boolean isLDLinkWelcomeHeaderDisplayed() {
		return CommonUtils.isElementDisplayed(lblWelcomeHeading); 
	}
	
	public String getLDLinkHomePageWelcomeNoteText() {
		return CommonUtils.getText(lblLDLinkWelcomeNote).trim(); 
	}
	
	public Map<String,String> getApplicationsNameAndDescription(){
		Map<String, String> actApplication = new HashMap<>(); 
		for(WebElement card:crdLDLinkApplications) {
			String appName = card.findElement(By.xpath("./a/div/h2")).getText().trim();
			String appDesc = card.findElement(By.xpath(".a/div/p")).getText().trim();
			actApplication.put(appName, appDesc); 
		}
		return actApplication; 
	}
	
	public void clickLDExpressCardOnHomePage() {
		CommonUtils.click(lnkLdExpress);
	}
	
	

}
