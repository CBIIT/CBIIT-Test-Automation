package ServiceNow.SEER.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class NativeViewSentViewPage extends CommonUtils {

	/** --------------- NATIVE VIEW SENT VIEW PAGE --------------- */
	
	/** System Mailboxes SENT link */
	@FindBy(xpath="//div[contains(text(),'Sent')]")
	public WebElement nativeViewmailboxSentLink;
	
	/**Native View IFRAME*/
	@FindBy(id = "gsft_main")
	public WebElement nativeViewFrame;
	
	/**Native View Sent Search drop down*/
	@FindBy (xpath = "//select[@class='form-control default-focus-outline']")
	public WebElement nativeViewSearchDropDown;
	
	/**NativeView Sent Search filed*/
	@FindBy(xpath = "//div/span/div/div/input")
	public WebElement nativeViewSentSearchField;
	
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
	@FindBy(linkText= "https://service-test.nci.nih.gov/api/x_g_nci_seer_data/verify?id=b2001b671bb92850af3bed7bbc4bcbd0")
	public WebElement nativeViewPreviewEmailVerifyEMAILlink;
	
	
	
	
	
	
	
	
	
	public NativeViewSentViewPage() {

		PageFactory.initElements(WebDriverUtils.webDriver, this);

	}

}
