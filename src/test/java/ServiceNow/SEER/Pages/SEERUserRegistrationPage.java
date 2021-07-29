package ServiceNow.SEER.Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class SEERUserRegistrationPage extends CommonUtils {

	/** --------------- SEER USER REGISTRATION PAGE --------------- */

	/** SEER User Registration Header Text */
	@FindBy(xpath = "//h1[contains(text(), ' SEER User Registration ')]")
	public WebElement seerUserRegistrationHeaderText;

	/** SEER User Registration First Name field */
	@FindBy(xpath = "//input[@ng-model='data.user.first_name']")
	public WebElement seerUserRegistrationFirstNameField;
	
	/** SEER User Registration Middle Name field */
	@FindBy(xpath = "//input[@ng-model='data.user.middle_name']")
	public WebElement seerUserRegistrationMiddleNameField;

	/** SEER User Registration Last Name field */
	@FindBy(xpath = "//input[@ng-model='data.user.last_name']")
	public WebElement seerUserRegistrationLastNameField;

	/** SEER User Registration Email field */
	@FindBy(xpath = "//div/div/form/div[2]/div/input[1]")
	public WebElement seerUserRegistrationEmailField;
	
	/**SEER User Registration Organization field*/
	@FindBy (xpath ="//input[@ng-model='data.user.organization']")
	public WebElement seerUserRegistrationOrganizationField;
	
	/**SEER User Registration Organization Drop Drown Values*/
	@FindBy(xpath = "//div/div/form/div[3]/div[1]/input/following-sibling::datalist/option")
	public List<WebElement> seerUserRegistrationOrganizationDropDrownValues;
	
	/**SEER User Registration Job Title field*/
	@FindBy (xpath = "//input[@ng-model='data.user.title']")
	public WebElement seerUserRegistrationJobTitleField;
	
	/**SEER User Registration Country field*/
	@FindBy (xpath = "//input[@ng-model='data.country_search']")
	public WebElement seerUserRegistrationCountryField;
	
	/**SEER User Registration Country drop down*/
	@FindBy(xpath = "//div[4]/div/ul/li")
	public List<WebElement> seerUserRegistrationCountryDropDrown;
	
	/**SEER User Registration Country USA*/
	@FindBy(xpath="//div/div/form/div[4]/div/ul/li/a")
	public WebElement seerUserRegistrationCountryUSA;
	
	/**SEER User Registration Address field*/
	@FindBy(xpath = "//*[@ng-model='data.user.address_line_1']")
	public WebElement seerUserRegistrationAddressField;
	
	/**SEER User Registration City Field*/
	@FindBy (xpath = "//*[@ng-model='data.user.city']")
	public WebElement seerUserRegistrationCityField;
	
	/**SEER User Registration State field*/
	@FindBy (xpath = "//*[@ng-model='data.user.state']")
	public WebElement seerUserRegistrationStateField;
	
	/**SEER User Registration Stat Star Sign*/
	@FindBy(xpath = "//div/div/form/div[6]/div[2]/label[1]")
	public WebElement seerUserRegistrationStateStarSign;
	
	/**SEER User Registration Zip code Field*/
	@FindBy(xpath = "//*[@ng-model='data.user.zipcode']")
	public WebElement seerUserRegistrationZipcodeField;
	
	/**SEER User Registration Zip code Star Sign*/
	@FindBy(xpath = " //div/div/form/div[6]/div[3]/label[1]")
	public WebElement seerUserRegistrationZipcodeStarSign;
	
	/**SEER User Registration Phone Field*/
	@FindBy(xpath = "//*[@ng-model='data.user.phone']")
	public WebElement seerUserRegistrationPhoneField;
	
	/**SEER User Registration  Which of these best describe you? Text*/
	@FindBy(xpath = "//label[contains(text(),'What best describes you for the purpose of request')]")
	public WebElement seerUserRegistrationWhichOfTheseBestDescribeYouText;

	/**SEER User Registration  Which of these best describe you? field*/
	@FindBy(xpath = "//select[@ng-model = 'data.user.role']")
	public WebElement seerUserRegistrationWhichOfTheseBestDescribeYouField;
	
	/**SEER User Registration  Submit button*/
	@FindBy(xpath = "//button[contains(text(),'Submit')]")
	public WebElement seerUserRegistrationSubmitButton;
	
	/** --------------- SEER USER REGISTRATION SUBMISSION CONFIRMATION SECTION --------------- */
	
	/** SEER User Registration Is Complete Header */
	@FindBy (xpath = " //h3[text() = ' Thank you - your registration is complete. ']")
	public WebElement seerUserRegistrationIsCompleteHeader;
	
	/** SEER User Registration Incidence Database Details Link */
	@FindBy (xpath = " //a[text() = ' SEER Incidence Database details ']")
	public WebElement seerUserRegistrationIncidenceDatabaseDetailsLink;
	
	/** SEER User Registration Back to SEER Database Details Button */
	@FindBy (xpath = " //a[text() = '← Back to SEER Database details']")
	public WebElement seerUserRegistrationBackToSeerDatabaseDetailsButton;
	
	/** SEER User Registration Confirmation Text */
	@FindBy (xpath = "//div[@class = 'box']")
	public WebElement seerUserRegistrationConfirmationText;
	
	/** SEER User Registration SEER Is Supported By The Surveillance Research Program Text*/
	@FindBy (xpath = "//div[@class = 'col-sm-10']/child::p")
	public WebElement seerUserRegistrationSeerIsSupportedByTheSurveillanceResearchProgramText;
	
	/** --------------- END OF SEER USER REGISTRATION SUBMISSION CONFIRMATION SECTION --------------- */
	
	/** --------------- END OF SEER USER REGISTRATION PAGE --------------- */
	
	public SEERUserRegistrationPage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);    
	}
}