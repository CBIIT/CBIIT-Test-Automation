package CustomBusiness.CCR.Pages;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CCRApplicationPage extends CommonUtils {
    public CCRApplicationPage() {
        PageFactory.initElements(WebDriverUtils.getWebDriver(), this);
    }
    /** Apply Now button */
    @FindBy(xpath = "//a[contains( text(),' Apply Now ')]")
    public WebElement applyNowButton;
    /** First Name Field */
    @FindBy(xpath = "//input[@name='first_name']")
    public WebElement firstNameField;
    /** Middle Name Field */
    @FindBy(xpath = "//input[@name='middle_name']")
    public WebElement middleNameField;
    /** Last Name Field */
    @FindBy(xpath = "//input[@name='last_name']")
    public WebElement lastNameField;
    /** Email Field */
    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailField;
    /** Phone Field */
    @FindBy(xpath = "//input[@name='phone']")
    public WebElement phoneField;
    /**  Business Phone Field */
    @FindBy(xpath = "//input[@name='phone_2']")
    public WebElement businessPhoneField;
    /** Other Degrees Field */
    @FindBy(xpath = "//input[@name='other_degree']")
    public WebElement otherDegreesField;
    /** YES US Citizen Option */
    @FindBy(xpath = "//div[@class='radio radio-primary mt-0']//input[@id='us_citizen_yes']")
    public WebElement yesUSCitizenOption;
    /** Next Button Basic Info Section*/
    @FindBy(xpath = "(//div//button[contains(text(),' Next ')])[1]")
    public WebElement nextButtonBasicInfoSection;
    /**  Address Field */
    @FindBy(xpath = "//input[@name='address']")
    public WebElement addressField;
    /**  Address2 Field */
    @FindBy(xpath = "//input[@name='address_2']")
    public WebElement address2Field;
    /**  City Field */
    @FindBy(xpath = "//input[@name='city']")
    public WebElement cityField;
    /**  State Field */
    @FindBy(xpath = "//input[@name='state']")
    public WebElement stateField;
    /**  Zipcode Field */
    @FindBy(xpath = "//input[@name='zip']")
    public WebElement zipcodeField;
    /** Next Button Address Section*/
    @FindBy(xpath = "(//div//button[contains(text(),' Next ')])[2]")
    public WebElement nextButtonAddressSection;
}
