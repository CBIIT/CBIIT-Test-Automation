package ServiceNow.SEER.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class SEERLandingPage extends CommonUtils {

	/** --------------- SEER Data Access Landing Page --------------- */

	/** Request Database Access Header */
	@FindBy(xpath = "//h2[contains(text(), 'About Research Plus Data Access')]")
	public WebElement requestDatabaseAccessHeader;

	/** Request Access to Research Plus Data text */
	@FindBy(xpath = "//div[contains(@class,'row how-to')]//div[contains(@class,'col-xs-12')]")
	public WebElement requestDatabaseAccessText;

	/** If You Have Access Paragraph */
	@FindBy(xpath = "//b[contains(text(), 'If you have access to an institutional account,')]")
	public WebElement ifYouHaveAccessParagraph;

	/** Existing SEER*Stat Account Paragraph */
	@FindBy(xpath = "//p[contains(text(), 'Existing SEER*Stat account holders ')]")
	public WebElement existingSEERStatAccountParagraph;

	/** Only Users Who Have Already Used Paragraph */
	@FindBy(xpath = "//b[contains(text(), 'Only users who have already used')]")
	public WebElement onlyUsersWhoHaveAlreadyUsedParagraph;

	/**
	 * Warning text for Undergraduate or Graduate Students should apply for
	 * Institutional access using their Institution affiliated email account.
	 */
	@FindBy(xpath = "//span[@class='alert-msg ng-binding'] ")
	public WebElement warningTextForUndergraduateOrGraduateStudents;

	/** SEER Incidence Database Breadcrumb */
	@FindBy(xpath = "//a[text() = 'SEER Incidence Database']")
	public WebElement seerIncidenceDatabaseBreadcrumb;

	/** SEER Home Breadcrumb */
	@FindBy(xpath = "//div[@class = 'breadcrumbs']/a[1]")
	public WebElement seerHomeBreadcrumb;

	/** SEER Data And Software Breadcrumb */
	@FindBy(xpath = "//a[text() = 'SEER Data & Software']")
	public WebElement seerDataAndSoftwareBreadcrumb;

	/** SEER Request SEER Incidence Data Breadcrumb */
	@FindBy(xpath = "//a[text() = 'Request SEER Incidence Data']")
	public WebElement seerRequestSeerIncidenceDataBreadcrumb;

	/** SEER Submission Confirmation Breadcrumb */
	@FindBy(xpath = "//p[text() = 'Submission Confirmation']")
	public WebElement seerSubmissionConfirmationBreadcrumb;

	/** --------------- Create a New SEER*Stat Account Section --------------- */

	/** Institutional Accounts Header Text */
	@FindBy(xpath = "//h4[text() = 'Institutional Accounts']")
	public WebElement institutionalAccountsHeaderText;

	/** Do You Have An Account Paragraph */
	@FindBy(xpath = "(//p[@class = 'detail-text'])[1]")
	public WebElement doYouHaveAnAccountParagraph;

	/** If You Are Unable To Authenticate Text */
	@FindBy(xpath = "//p[contains(text(), '* If you are unable to authenticate')]")
	public WebElement ifYouAreUnableToAuthenticateText;

	/** Non-Institutional Accounts Header Text */
	@FindBy(xpath = "//h4[text() = 'Non-Institutional Accounts']")
	public WebElement nonInstitutionalAccountsHeaderText;

	/** For All Other Accounts Paragraph */
	@FindBy(xpath = "(//p[@class = 'detail-text'])[2]")
	public WebElement forAllOtherAccountsParagraph;

	/** Non-Institutional Accounts email address field */
	@FindBy(xpath = "//input[@placeholder='email address']")
	public WebElement researchDataRequestsEmailAddressField;

	/** Register for Research Data button */
	@FindBy(xpath = "//*[contains(text(),'Register for Research Data')]")
	public WebElement registerForResearchDataButton;

	/** SEER ODS Landing Page Text */
	@FindBy(xpath = "(//div[@class='col-xs-12'])[3]")
	public WebElement landingPageText;

	/**
	 * --------------- End Of Create a New SEER*Stat Account Section ---------------
	 */

	/**
	 * --------------- Upgrade an existing SEER*Stat Account Section ---------------
	 */

	/** Existing SEER*Stat Account Holders Header Text */
	@FindBy(xpath = "//h4[text() = 'Existing SEER*Stat Account Holders']")
	public WebElement existingSeerStatAccountHoldersHeaderText;

	/** Please Enter Your Current SEER*Stat Username Paragraph */
	@FindBy(xpath = "//p[contains(text(),  'Please enter your current SEER*Stat Username')]")
	public WebElement pleaseEnterYourCurrentSeerStatUsernameParagraph;

	/** Request SEER Research Plus Databases Paragraph */
	@FindBy(xpath = "//p[contains(text(),  ' Request SEER Research Plus Databases ')]")
	public WebElement requestSeerResearchPlusDatabasesParagraph;

	/**
	 * --------------- End Of Upgrade an existing SEER*Stat Account Section
	 * ---------------
	 */

	/** --------------- End Of SEER Data Access Landing Page --------------- */

	public SEERLandingPage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}
}