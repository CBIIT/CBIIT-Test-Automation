package CustomBusiness.EIDP.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class DashboardPage extends CommonUtils{
	
	/* ------ Search tab ------ */
	@FindBy(css = "div[onclick*='advanced-search']")
	public WebElement search;
	
	/* ------ Manage Delegate button ------ */
	@FindBy(css = "div[onclick*='manage-delegate']")
	public WebElement manageDelegate;
	
	/* ------ Manage delegate tab ------ */
	@FindBy(xpath ="//li[@id='manageDelegatetabs']")
	public WebElement manageDelegateTab;
	
	/* ------ Start IDP button ------ */
	@FindBy(css="a[href*='/idp/general'][class='btn btn-primary']")
	public WebElement startIDPButton;
	
	/* ------ Proceed button ------ */
	@FindBy(xpath = "//a[text()='Proceed']")
	public WebElement proceedButton;
	
	/* ------ Send IDP to PM button ------ */
	@FindBy(css = "input[value='Send IDP to the Primary Mentor']")
	public WebElement sendIDPToPrimaryMentoryButton;
	
	/* ------ IDP message ------ */
	@FindBy(css = "#tab1 h3")
	public WebElement idpMessage;
	
	/* ------ IDP awaiting Response button ------ */
	@FindBy(css = "[data-cat='admin ']")
	public WebElement idpAwaitingResponseButton;
	
	/* ------ Verify meeting button ------ */
	@FindBy(xpath = "//a[text()='Verify Meeting']")
	public WebElement verifyMeetingButton;
	
	/* ------ Submit button ------ */
	@FindBy(xpath = "//*[text()='Submit']")
	public WebElement submitButton;

	/* ------ Search button ------ */
	@FindBy(id = "advanced_search_btn")
	public WebElement searchButton;
	
	/* ------ Table view of 100 ------ */
	@FindBy(id = "(//select[@name='mentorsTable_length'])[1]")
	public WebElement show100;

	/* ------ mentors table pagination next button ------ */
	@FindBy(xpath = "//li[@id=\"mentorsTable_next\"]/a")
	public WebElement mentorsTableNext;
	
	public DashboardPage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}
	
}
