package CustomBusiness.Egrants.Pages;

import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class EgrantsQuickLinkAndManagementMenuPage {

	/**
	 * Quick Links
	 */
	@FindBy (xpath = "//a[@id='navDrop']")
	public WebElement quickLinks;

	/**
	 * Expand QLink
	 */
	@FindBy (xpath = "//a[contains(text(),'Quick Links')]")
	public WebElement expandQlink;


	/**
	 * myOGA link
	 */
	@FindBy (xpath = "//a[text()='myOGA']")
	public WebElement myOGALink;

	/**
	 * eRA GM link
	 */
	@FindBy (xpath = "//a[text()='eRA GM']")
	public WebElement eRAGMLink;

	/**
	 * PMS link
	 */
	@FindBy (xpath = "//a[text()='PMS']")
	public WebElement pMSLink;

	/**
	 * Management Menu
	 */
	@FindBy (xpath = "//a[text()='Management']")
	public WebElement managementMenu;

	/**
	 * QC Reason
	 */
	@FindBy (xpath = "//select[@id='ddlQCreason']")
	public WebElement qcReason;

	/**
	 * QC Person
	 */
	@FindBy (xpath = "//select[@id='ddlQCperson']")
	public WebElement qcPerson;

	/**
	 * Scroll to desired user
	 */
	@FindBy (xpath = "(//td/select/option[@value=3928])[1]")
	public WebElement scrollToDesiredUser;

	/**
	 * Assign button
	 */
	@FindBy (xpath = "//button[@id='btnAssign']")
	public WebElement assignButton;

	/**
	 * QC Route From
	 */
	@FindBy (xpath = "//select[@id='ddlFromPerson']")
	public WebElement fromQC;

	/**
	 * QC Route To
	 */
	@FindBy (xpath = "//select[@id='ddlToPerson']")
	public WebElement toQC;

	/**
	 * QC Route Percentage
	 */
	@FindBy (xpath = "//select[@id='ddlPercent']")
	public WebElement percentageQC;

	/**
	 * QC Route button
	 */
	@FindBy (xpath = "//button[@id='btnRoute']")
	public WebElement routeButton;

	/**
	 * Test user
	 */
	@FindBy (xpath = "//div[3]/div[2]/div/div[3]/table/tbody/tr/td[2]/select/option[@value='3928']")
	public WebElement testUser;

	public static WebElement dynamicUserTextLocator(String user) {
		return WebDriverUtils.webDriver.findElement(By.xpath("//p[contains(text(),'" + user + "')]"));
	}

	public static WebElement dynamicLinkLocator(String text) {
		return WebDriverUtils.webDriver.findElement(By.xpath("//a[text()='" + text + "']"));
	}

	public EgrantsQuickLinkAndManagementMenuPage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}
}