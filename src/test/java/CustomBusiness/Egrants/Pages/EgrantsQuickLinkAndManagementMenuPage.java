package CustomBusiness.Egrants.Pages;

import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EgrantsQuickLinkAndManagementMenuPage {

	/**
	 * QUICK LINKS
	 */
	@FindBy (xpath = "//a[@id='navDrop']")
	public WebElement quickLinks;

	/**
	 * EXPAND QUICK LINKS
	 */
	@FindBy (xpath = "//a[contains(text(),'Quick Links')]")
	public WebElement expandQlink;

	/**
	 * MYOGA LINK
	 */
	@FindBy (xpath = "//a[text()='myOGA']")
	public WebElement myOGALink;

	/**
	 * ERA GM LINK
	 */
	@FindBy (xpath = "//a[text()='eRA GM']")
	public WebElement eRAGMLink;

	/**
	 * PMS LINK
	 */
	@FindBy (xpath = "//a[text()='PMS']")
	public WebElement pMSLink;

	/**
	 * MANAGEMENT MENU
	 */
	@FindBy (xpath = "//a[text()='Management']")
	public WebElement managementMenu;

	/**
	 * QC REASON
	 */
	@FindBy (xpath = "//select[@id='ddlQCreason']")
	public WebElement qcReason;

	/**
	 * QC PERSON
	 */
	@FindBy (xpath = "//select[@id='ddlQCperson']")
	public WebElement qcPerson;

	/**
	 * ASSIGN BUTTON
	 */
	@FindBy (xpath = "//button[@id='btnAssign']")
	public WebElement assignButton;

	/**
	 * QC ROUTE FROM
	 */
	@FindBy (xpath = "//select[@id='ddlFromPerson']")
	public WebElement fromQC;

	/**
	 * QC ROUTE TO
	 */
	@FindBy (xpath = "//select[@id='ddlToPerson']")
	public WebElement toQC;

	/**
	 * QC ROUTE PERCENTAGE
	 */
	@FindBy (xpath = "//select[@id='ddlPercent']")
	public WebElement percentageQC;

	/**
	 * QC ROUTE BUTTON
	 */
	@FindBy (xpath = "//button[@id='btnRoute']")
	public WebElement routeButton;

	/**
	 * ADMIN MENU
	 */
	@FindBy (xpath = "//a[@title='Admin [shift + alt + A]']")
	public WebElement adminMenu;

	/**
	 * MENU OPTIONS - ADMIN MENU
	 */
	@FindBy (xpath = "//select[@id='ddlMenus']")
	public WebElement menuOptions;

	/**
	 * SETUP FLAGS LINK
	 */
	@FindBy (xpath = "//div/a[@href='/FlagMaintenance/To_Setup']")
	public WebElement setupFlagsLink;

	/**
	 * FLAG TYPE
	 */
	@FindBy (xpath = "//select[@id='ddlFlagTypes']")
	public WebElement flagType;

	/**
	 * SERIAL NUMBER TEXT BOX
	 */
	@FindBy (xpath = "//input[@id='txtSerialnum']")
	public WebElement serialNumberTextBox;

	/**
	 * SETUP FLAG PAGE - SEARCH BUTTON
	 */
	@FindBy (xpath = "//div[@id='ShowSearch']")
	public WebElement flagMaintenanceSearchButton;

	/**
	 * SETUP FLAG PAGE - YEAR 17 CHECKBOX
	 */
	@FindBy (xpath = "//tr/td/input[@id='10674535']")
	public WebElement year17CheckBox;

	/**
	 * SETUP FLAG PAGE - SETUP FLAGS BUTTON
	 */
	@FindBy (xpath = "//button[@onclick='return setup_flags();']")
	public WebElement setupFlagsButton;

	/**
	 * FLAG MAINTENANCE PAGE - SEARCH BUTTON
	 */
	@FindBy (xpath = "//button[@title='Click here to load available appls [shift + alt + S]']")
	public WebElement searchButtonFlagMaintenance;

	/**
	 * FLAG MAINTENANCE PAGE - REMOVE BUTTON
	 */
	@FindBy (xpath = "//button[@title='Click here to remove selected flags [shift + alt + S]']")
	public WebElement removeButtonFlagMaintenance;

	/**
	 * SETUP FLAG PAGE - YEAR 17 CHECKBOX
	 */
	@FindBy (xpath = "//tr/td/input[@id='15514']")
	public WebElement year17CheckBoxRemoveFlag;

	/**
	 * THIS METHOD DYNAMICALLY LOCATES THE LOGGED IN USER NAME
	 */
	public static WebElement dynamicUserTextLocator(String user) {
		return WebDriverUtils.webDriver.findElement(By.xpath("//p[contains(text(),'" + user + "')]"));
	}

	/**
	 * THIS METHOD DYNAMICALLY LOCATES THE LINKS WITHIN THE PAGE
	 */
	public static WebElement dynamicLinkLocator(String text) {
		return WebDriverUtils.webDriver.findElement(By.xpath("//a[text()='" + text + "']"));
	}

	public EgrantsQuickLinkAndManagementMenuPage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}
}