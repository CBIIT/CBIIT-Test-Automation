package ServiceNow.SCSS.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class UnauthenticatedApplicantPage extends CommonUtils {

    /** Register for Okta**/
    @FindBy(xpath = "//span[contains(text(),'Register for Okta')]")
    public WebElement registerForOkta;

    /** First Name Okta Registration**/
    @FindBy(xpath = "//input[@id='RegisterOkta_firstname']")
    public WebElement firstNameOktaRegistration;

    /** Last Name Okta Registration**/
    @FindBy(xpath = "//input[@id='RegisterOkta_lastname']")
    public WebElement lastNameOktaRegistration;

    /** Email Okta Registration**/
    @FindBy(xpath = "//input[@id='RegisterOkta_email']")
    public WebElement emailOktaRegistration;

    /** Confirm Email Okta Registration**/
    @FindBy(xpath = "//input[@id='RegisterOkta_confirmEmail']")
    public WebElement confirmEmailOktaRegistration;

    /** Phone Number Okta Registration**/
    @FindBy(xpath = "//input[@id='RegisterOkta_phone']")
    public WebElement phoneNumberOktaRegistration;

    /** Create Account Okta Registration**/
    @FindBy(xpath = "//span[contains(text(),'Create Account')]")
    public WebElement createAccountOktaRegistration;

    /** Error Email Okta Registration**/
    @FindBy(xpath = "//div[contains(text(),'This account already exists.  Please try logging in.')]")
    public WebElement sameEmailErrorOktaRegistration;

    /** Login Button Okta Registration**/
    @FindBy(xpath = "//button[@class='ant-btn ant-btn-link OktaRegistrationLoginButton']")
    public WebElement loginButtonOktaRegistration;

    /** SalesForce Dev Vacancy Okta Registration**/
    @FindBy(xpath = "//a[contains(text(),'Salesforce Developer')]")
    public WebElement salesforceDevVacancy;

    /** Master Data Engineer Vacancy Okta Registration**/
    @FindBy(xpath = "//a[contains(text(),'Master Data Engineer')]")
    public WebElement masterDataEngineerVacancy;

    /** Master Data Engineer headline Vacancy Okta Registration**/
    @FindBy(xpath = "//h1[contains(text(),'Master Data Engineer')]")
    public WebElement masterDataEngineerHeadlineVacancy;

    /** Sign In and Apply Okta Registration**/
    @FindBy(xpath = "//span[contains(text(),'Sign In and Apply')]")
    public WebElement signInAndApply;

    /**Create your NCI account to access SCSSheadline Okta Registration**/
    @FindBy(xpath = "//h1[contains(text(),'Create your NCI account to access SCSS')]")
    public WebElement headlineOkta;

    /** Home Button**/
    @FindBy(xpath = "(//a[contains(text(),'Home')])[1]")
    public WebElement homeButton;

    /** Okta registartion error of creation**/
    @FindBy(xpath = "//div[contains(text(),'An error occurred while trying to create your account.  Please try again later.')]")
    public WebElement errorAccountOkta;

    public UnauthenticatedApplicantPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);

    }

}
