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

	/** --------------- NATIVE VIEW MAILBOX SENT PAGE --------------- */
	
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
	@FindBy(xpath = "//td[normalize-space()='Verify your email address - SEER Data Access User Registration']//parent::tr//child::td[2]//child::a")
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

	/**Native View Preview Email SEER Incidence Data: It is unclear who the Signing Official at your Institution Section Text*/
	@FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[3]/td/ul[2]/li/ul/li[1]/span")
	public WebElement nativeViewPreviewEmailSEERIncidenceDataRejectedItIsUnclearText;

	/**Native View Preview Email SEER Incidence Data: It is unclear who the Signing Official at your Institution is Text Part 1 */
	@FindBy(xpath = "//strong[contains(text(),'It is unclear who the Signing Official at your Ins')]")
	public WebElement nativeViewPreviewEmailSEERIncidenceDataRejectedItIsUnclearTextOne;

	/**Native View Preview Email SEER Incidence Data: It is unclear who the Signing Official at your Institution is Text Part 2 */
	@FindBy(xpath = "//em[contains(text(),'The Requestor and Signing Official should not be t')]")
	public WebElement nativeViewPreviewEmailSEERIncidenceDataRejectedItIsUnclearTextTwo;

	/**Native View Preview Email SEER Incidence Data: It is unclear who the Signing Official at your Institution is Text Part 3 */
	@FindBy(xpath = "//span[normalize-space()='for help determining']")
	public WebElement nativeViewPreviewEmailSEERIncidenceDataRejectedItIsUnclearTextThree;

	/**Native View Preview Email SEER Incidence Data: It is unclear who the Signing Official at your Institution is Text SEER Data FAQs Link*/
	@FindBy(xpath = "//a[@href='https://seer.cancer.gov/data/faqs.html#signing-official']")
	public WebElement nativeViewPreviewEmailSEERIncidenceDataRejectedItIsUnclearSeerDataFaqsLink;
	
	/** Native View Review Email Hello NAME text*/
	@FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[3]/td/p[1]/span")
	public WebElement nativeViewPreviewEmailHelloNameText;
	
	/** Native View Review Email Verify EMAIL link*/
	@FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[3]/td/p[3]/span/a")
	public WebElement nativeViewPreviewEmailVerifyEMAILlink;
	
	/** Native View Sorting Created Data In Order Link */
	@FindBy (xpath = "//table[@id='sys_email_table']//th[@name='sys_created_on']//a[@role='button']")
	public WebElement sortingCreatedDataInOrderLink;

	public NativeViewSentViewPage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}
}
