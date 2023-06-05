package ServiceNow.SEER.Pages;

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

	/**Native View Preview Rejection Email SEER Incidence Data: Thank you for submitting  */
	@FindBy(xpath = "//span[contains(text(),'Thank you for submitting your request for SEER Res')]")
	public WebElement nativeViewPreviewEmailSEERIncidenceDataRejectedThankYouForSubmitting;

	/**Native View Preview Rejection Email SEER Incidence Data: Requests for SEER Research Plus Data must meet the following requirements: Text */
	@FindBy(xpath = "//span[contains(text(),'Requests for SEER Research Plus Data must meet the')]")
	public WebElement nativeViewPreviewEmailSEERIncidenceDataRejectedRequestsRorSeerResearchPlusText;

	/**Native View Preview Rejection Email SEER Incidence Data: Use an institution-affiliated email address Text */
	@FindBy(xpath = "//span[normalize-space()='Use an institution-affiliated email address.']")
	public WebElement nativeViewPreviewEmailSEERIncidenceDataRejectedUseAnInstitutionAffiliatedText;

	/**Native View Preview Rejection Email SEER Incidence Data: List an institution in the Organization field Text */
	@FindBy(xpath = "//span[contains(text(),'List an institution in the')]")
	public WebElement nativeViewPreviewEmailSEERIncidenceDataRejectedListAnInstitutionInTheOrganizationFieldText;

	/**Native View Preview Rejection Email SEER Incidence Data: Use an appropriate Signing Official affiliated with your institution. Text */
	@FindBy(xpath = "//span[contains(text(),'Use an appropriate Signing Official affiliated wit')]")
	public WebElement nativeViewPreviewEmailSEERIncidenceDataRejectedUseAnAppropriateSigningOfficialText;

	/**Native View Preview Rejection Email SEER Incidence Data: This request has been rejected based on one or more of the possible issues listed below. Text */
	@FindBy(xpath = "//span[contains(text(),'This request has been rejected based on one or mor')]")
	public WebElement nativeViewPreviewEmailSEERIncidenceDataRejectedThisRequestHasBeenRejectedBasedOnText;

	/**Native View Preview Rejection Email SEER Incidence Data: Email addresses for the Signing Official and Requestor must be affiliated  Text */
	@FindBy(xpath = "//strong[contains(text(),'Email addresses for the Signing Official and Reque')]")
	public WebElement nativeViewPreviewEmailSEERIncidenceDataRejectedEmailAddressesForTheSigningOfficialAndRequestorText;

	/**Native View Preview Rejection Email SEER Incidence Data: Requests using open email accounts such as Gmail, iCloud  Text */
	@FindBy(xpath = "//em[contains(text(),'Requests using open email accounts such as Gmail, ')]")
	public WebElement nativeViewPreviewEmailSEERIncidenceDataRejectedRequestsUsingOpenEmailText;

	/**Native View Preview Email SEER Incidence Data: It is unclear who the Signing Official at your Institution Section Text*/
	@FindBy(xpath = "/html[1]/body[1]/table[1]/tbody[1]/tr[1]/td[1]")
	public WebElement nativeViewPreviewEmailSEERIncidenceDataRejectedEmailText;

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

	/**Native View Preview Email SEER Incidence Data: The Organization field was left blank. Text */
	@FindBy(xpath = "//strong[contains(text(),'The Organization field was left blank.')]")
	public WebElement nativeViewPreviewEmailSEERIncidenceDataRejectedTheOrganizationFieldWasLeftBlankText;

	/**Native View Preview Email SEER Incidence Data: The Institution/University/Company of the Text */
	@FindBy(xpath = "//span[contains(text(),'The Institution/University/Company of the requesto')]")
	public WebElement nativeViewPreviewEmailSEERIncidenceDataRejectedTheInstitutionUniversityCompanyText;

	/**Native View Preview Email SEER Incidence Data: //span[contains(text(),'must be listed.')] */
	@FindBy(xpath = "//span[contains(text(),'must be listed.')]")
	public WebElement nativeViewPreviewEmailSEERIncidenceDataRejectedMustBeListedText;

	/**Native View Preview Email SEER Incidence Data: To resubmit your request, please go to Text */
	@FindBy(xpath = "//span[normalize-space()='To resubmit your request, please go to']")
	public WebElement nativeViewPreviewEmailSEERIncidenceDataRejectedToResubmitYourRequestText;

	/**Native View Preview Email SEER Incidence Data: SEER Data access Link */
	@FindBy(xpath = "//span[normalize-space()='https://seerdataaccess.cancer.gov/seer-data-access']")
	public WebElement nativeViewPreviewEmailSEERIncidenceDataRejectedSeerDataAccessLink;

	/**Native View Preview Email SEER Incidence Data: Note Text */
	@FindBy(xpath = "//span[normalize-space()='Note:']")
	public WebElement nativeViewPreviewEmailSEERIncidenceDataRejectedNoteText;

	/**Native View Preview Email SEER Incidence Data:  you cannot edit your email address after you’ve already submitted a request.Text */
	@FindBy(xpath = "//span[contains(text(),'you cannot edit your email address after you’ve al')]")
	public WebElement nativeViewPreviewEmailSEERIncidenceDataRejectedYouCannotEditYourEmailText;

	/**Native View Preview Email SEER Incidence Data: seerstat Email */
	@FindBy(xpath = "//a[normalize-space()='seerstat@imsweb.com']")
	public WebElement nativeViewPreviewEmailSEERIncidenceDataRejectedSeersrtatEmail;

	/**Native View Preview Email SEER Incidence Data: for help Text */
	@FindBy(xpath = "//span[normalize-space()='for help.']")
	public WebElement nativeViewPreviewEmailSEERIncidenceDataRejectedForHelpText;

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
