package ServiceNow.SEER.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class NativeViewSentViewPage extends CommonUtils {

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
	@FindBy(xpath = "//table/tbody/tr/td/div/table/thead/tr[1]/th[3]/span/a")
	public WebElement nativeViewCreatedButton;
	
	/**Native View Preview Verify Email I icon*/
	@FindBy(xpath = "//*[@data-type='list2_popup']")
	public WebElement nativeViewPreviewVerifyEmailIcon;
	
	/**Native View Preview Email Open Record Button*/
	@FindBy(linkText ="Open Record")
	public WebElement NativeViewPreviewVerifyEmailOpenRecordButton;
	
	/**Native View Preview Email Preview HTML Body Link*/
	@FindBy(xpath = "//*[contains(text(), 'Preview HTML Body')]")
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
	@FindBy (xpath = "//tr[@id = 'hdr_sys_email']/th[3]/span/a")
	public WebElement sortingCreatedDataInOrderLink;
	
	/** --------------- END OF NATIVE VIEW SENT VIEW PAGE --------------- */
	
	public NativeViewSentViewPage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}
}
