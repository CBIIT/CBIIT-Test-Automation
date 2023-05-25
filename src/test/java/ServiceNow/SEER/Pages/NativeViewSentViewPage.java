package ServiceNow.SEER.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class NativeViewSentViewPage extends CommonUtils {

	/** Native View Home Button on Homepage */
	@FindBy (xpath = "//*[@id=\'gsft_nav\']/div/magellan-favorites-list/ul/li[1]/div/div[1]/a/div[2]/span")
	public WebElement nativeViewHomeButton;

	/** --------------- NATIVE VIEW SENT VIEW PAGE --------------- */
	
	/** System Mailboxes SENT link */
	@FindBy(xpath="//div[contains(@class,'sn-widget-list-title')][normalize-space()='Sent']")
	public WebElement nativeViewmailboxSentLink;
	
	/**Native View IFRAME*/
	@FindBy(id = "gsft_main")
	public WebElement nativeViewFrame;
	
	/**Native View Sent Search drop down*/
	@FindBy (xpath = "//select[@class='form-control default-focus-outline']")
	public WebElement nativeViewSearchDropDown;
	
	/**NativeView Sent Search fieled*/
	@FindBy(xpath = "//div/span/div/div/input")
	public WebElement nativeViewSentSearchField;
	
	/**Native View Created Button*/
	@FindBy(xpath = "//table[@id='sys_email_table']//th[@name='sys_created_on']//a[@role='button']")
	public WebElement nativeViewCreatedButton;
	
	/**Native View Preview Verify Email I icon*/
	@FindBy(xpath = "//*[@data-type='list2_popup']")
	public WebElement nativeViewPreviewVerifyEmailIcon;
	
	/**Native View Preview Email Open Record Button*/
	@FindBy(linkText ="Open Record")
	public WebElement NativeViewPreviewVerifyEmailOpenRecordButton;
	
	/**Native View Preview Email Preview HTML Body Link*/
	@FindBy(xpath = "//*[contains(text(), 'preview_email')]//parent::li//child::a")
	public WebElement nativeViewPreviewVerifyEmailPreviewHTMLBodyLink;
	
	/**Native View Preview Email IFRAME */
	@FindBy(id = "email_preview_iframe")
	public WebElement nativeViewPreviewEmailIFRAME;
	
	/**Native View Preview Email SEER Incidence Data: Verify your email address Header */
	@FindBy(xpath = "//span[contains(text(),'SEER Incidence Data')]")
	public WebElement nativeViewPreviewEmailSEERIncidenceDataHeader;
	
	/** Native View Review Email Hello NAME text*/
	@FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[3]/td/p[1]/span")
	public WebElement nativeViewPreviewEmailHelloNameText;
	
	/** Native View Review Email Verify EMAIL link*/
	@FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[3]/td/p[3]/span/a")
	public WebElement nativeViewPreviewEmailVerifyEMAILlink;
	
	/** Native View Sorting Created Data In Order Link */
	@FindBy (xpath = "//table[@id='sys_email_table']//th[@name='sys_created_on']//a[@role='button']")
	public WebElement sortingCreatedDataInOrderLink;


	/** --------------- NATIVE VIEW ACCESS REQUEST PAGE --------------- */

	/** Native View SEER Access Requested Link */
	public static WebElement nativeViewSEERAccessRequestsLink(String accessRequestsText) {
		return WebDriverUtils.webDriver.findElement (By.xpath( "//div[contains(text(),'" + accessRequestsText + "')]"));
	}

	/**Native View Access Requests IFRAME*/
	@FindBy(xpath = "//*[@id=\'gsft_main\']")
	public WebElement accessRequestIFrame;

	/**Native View Access Requests Dropdown Menu*/
	@FindBy(xpath = "//*[@id=\"list_nav_x_g_nci_seer_data_access\"]/div/div[1]/h1/a")
	public WebElement accessRequestMenu;

	/** Native View Access Request New Button */
	@FindBy (xpath = "//*[@id=\'sysverb_new\']")
	public WebElement accessRequestNewButton;

	/** Native View Access Request Text */
	@FindBy (xpath = "//div[@class='navbar-title-caption navbar-title-new-record']")
	public WebElement accessRequestText;

	/** Native View Access Request Customer Text */
	@FindBy (xpath = "//div[@class='navbar-title-caption']")
	public WebElement accessRequestCustomerText;

	/**NativeView Access Request Customer field*/
	@FindBy(xpath = "//input[@id='sys_display.x_g_nci_seer_data_access.customer']")
	public WebElement nativeViewAccessRequestCustomerTextBox;

	/**NativeView Access Request Dataset field*/
	@FindBy(xpath = "//input[@id='sys_display.x_g_nci_seer_data_access.dataset']")
	public WebElement nativeViewAccessRequestDatasetTextBox;

	/**NativeView Access Request Preview Record*/
	@FindBy(xpath = "//button[@id='viewr.x_g_nci_seer_data_access.customer']")
	public WebElement nativeViewAccessRequestPreviewRecordButton;

	/**NativeView Access Request Preview Record*/
	@FindBy(xpath = "//a[@class='btn btn-sm btn-default pop-over-button pull-right']")
	public WebElement nativeViewAccessRequestOpenRecordButton;

	/**NativeView Access Request Save Changes Discard Button*/
	@FindBy(xpath = "//button[normalize-space()='Discard']")
	public WebElement nativeViewAccessRequestSaveChangesDiscardButton;

	/**NativeView Access Request Account Type Dropdown */
	@FindBy(xpath = "//select[@id='x_g_nci_seer_data_customer.email_type']")
	public WebElement nativeViewAccessRequestAccountTypeDropdown;

	/**NativeView Access Request Status Dropdown */
	@FindBy(xpath = "//select[@id='x_g_nci_seer_data_approval.status']")
	public WebElement nativeViewAccessRequestStatusDropdown;

	/**NativeView Access Request Save Client Button */
	@FindBy(xpath = "//button[@id='sysverb_update_and_stay']")
	public WebElement nativeViewAccessSaveClientButton;

	/**NativeView Access Request Save Client Button */
	@FindBy(xpath = "//*[@id=\'sysverb_insert_and_stay_bottom\']")
	public WebElement nativeViewAccessSaveClientButtonBottom;

	@FindBy(xpath = "//*[@id=\'sysverb_update_and_stay_bottom\']")
	public WebElement nativeViewAccessSaveRejectedClientButtonBottom;

	/**NativeView Access Request Update Client Button */
	@FindBy(xpath = "//*[@id=\'sysverb_update_bottom\']")
	public WebElement nativeViewAccessUpdateClientButtonBottom;

	/**NativeView Access Request Request*/
	@FindBy(xpath = "//*[@id=\'x_g_nci_seer_data_access.x_g_nci_seer_data_approval.request_table\']/tbody//child::td[3]//child::a")
	public WebElement nativeViewAccessRequest;


	/** --------------- NATIVE VIEW ACCESS EMAILS PAGE --------------- */

	/**NativeView Emails Button */
	@FindBy(xpath = "//*[@id=\'8d620b63c611227b008368697b0b8d7b\']/div/div")
	public WebElement nativeViewAccessEmailsButton;

	/**Native View Emails Dropdown Menu*/
	@FindBy(xpath = "//*[@id=\'list_nav_sys_email\']/div/div[1]/h1/a")
	public WebElement emailsMenu;

	/**Native View Emails Preview Verify Email I icon*/
	@FindBy(xpath = "//*[@id=\'sys_email_table\']/tbody//child::td[2]//child::a")
	public WebElement nativeViewEmailsPreviewVerifyEmailIcon;

	/** --------------- END OF NATIVE VIEW SENT VIEW PAGE --------------- */
	
	public NativeViewSentViewPage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}
}
