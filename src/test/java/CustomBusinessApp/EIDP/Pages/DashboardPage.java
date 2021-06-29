package CustomBusinessApp.EIDP.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

import CustomBusinessApp.EIDP.Util.SharedData;

public class DashboardPage extends CommonUtils{
	
	@FindBy(css = "div[onclick*='advanced-search']")
	public WebElement search;
	
	@FindBy(css = "div[onclick*='manage-delegate']")
	public WebElement manageDelegate;
	
	@FindBy(xpath ="//li[@id='manageDelegatetabs']")
	public WebElement manageDelegateTab;
	
	@FindBy(how = How.CSS, css="a[href*='/idp/general'][class='btn btn-primary']")
	public WebElement startIDPButton;
	
	
	@FindBy(xpath = "//a[text()='Proceed']")
	public WebElement proceedButton;
	
	@FindBy(how = How.CSS, css = "input[value='Send IDP to the Primary Mentor']")
	public WebElement sendIDPToPrimaryMentoryButton;
	
	@FindBy(how = How.CSS, css = "#tab1 h3")
	public WebElement idpMessage;
	
	@FindBy(how = How.CSS, css = "[data-cat='admin ']")
	public WebElement idpAwaitingResponseButton;
	
	@FindBy(xpath = "//a[text()='Verify Meeting']")
	public WebElement verifyMeetingButton;
	
	@FindBy(xpath = "//*[text()='Submit']")
	public WebElement submitButton;

	@FindBy(id = "advanced_search_btn")
	public WebElement searchButton;
	
	@FindBy(id = "(//select[@name='mentorsTable_length'])[1]")
	public WebElement show100;
	
	
	public DashboardPage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}
	
	

	
	
	

}
