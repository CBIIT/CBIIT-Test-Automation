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
    /** Apply Now button **/
    @FindBy(xpath = "//a[contains( text(),' Apply Now ')]")
    public WebElement applyNowButton;
    /** First Name Field **/
    @FindBy(xpath = "//input[@name='first_name']")
    public WebElement firstNameField;
    /** Middle Name Field **/
    @FindBy(xpath = "//input[@name='middle_name']")
    public WebElement middleNameField;
    /** Last Name Field **/
    @FindBy(xpath = "//input[@name='last_name']")
    public WebElement lastNameField;
    /** Email Field **/
    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailField;
    /** Phone Field **/
    @FindBy(xpath = "//input[@name='phone']")
    public WebElement phoneField;
    /**  Business Phone Field  **/
    @FindBy(xpath = "//input[@name='phone_2']")
    public WebElement businessPhoneField;
    /** Other Degrees Field **/
    @FindBy(xpath = "//input[@name='other_degree']")
    public WebElement otherDegreesField;
    /** YES US Citizen Option **/
    @FindBy(xpath = "//div[@class='radio radio-primary mt-0']//input[@id='us_citizen_yes']")
    public WebElement yesUSCitizenOption;
    /** Next Button Basic Info Section **/
    @FindBy(xpath = "(//div//button[contains(text(),' Next ')])[1]")
    public WebElement nextButtonBasicInfoSection;
    /** Address Field **/
    @FindBy(xpath = "//input[@name='address']")
    public WebElement addressField;
    /** Address2 Field **/
    @FindBy(xpath = "//input[@name='address_2']")
    public WebElement address2Field;
    /** City Field **/
    @FindBy(xpath = "//input[@name='city']")
    public WebElement cityField;
    /** State Field **/
    @FindBy(xpath = "//input[@name='state']")
    public WebElement stateField;
    /** Zipcode Field **/
    @FindBy(xpath = "//input[@name='zip']")
    public WebElement zipcodeField;
    /** Next Button Address Section **/
    @FindBy(xpath = "(//div//button[contains(text(),' Next ')])[2]")
    public WebElement nextButtonAddressSection;
    /** Next Button Business Address Section **/
    @FindBy(xpath = "(//div//button[contains(text(),' Next ')])[3]")
    public WebElement nextButtonBusinessAddressSection;
    /** Next Button Required Documents Section **/
    @FindBy(xpath = "(//div//button[contains(text(),' Next ')])[4]")
    public WebElement nextButtonRequiredDocumentsSection;
    /** Department Field **/
    @FindBy(xpath = "//input[@name='business_department']")
    public WebElement departmentField;
    /** Institution Field **/
    @FindBy(xpath = "//input[@name='business_institution']")
    public WebElement institutionField;
    /** Business Address Field **/
    @FindBy(xpath = "//input[@name='business_address']")
    public WebElement businessAddressField;
    /** Business Address2 Field **/
    @FindBy(xpath = "//input[@name='business_address_2']")
    public WebElement businessAddress2Field;
    /** Business City Field **/
    @FindBy(xpath = "//input[@name='business_city']")
    public WebElement businessCityField;
    /** Business State Field **/
    @FindBy(xpath = "//input[@name='business_state']")
    public WebElement businessStateField;
    /** Business Zip Field **/
    @FindBy(xpath = "//input[@name='business_zip']")
    public WebElement businessZipField;
    /** Additional Questions: Was it easy to enter and upload application materials? YES **/
    @FindBy(xpath = "(//div[@class='radio radio-primary mt-0 ng-scope']//input[@value='yes'])[1]")
    public WebElement yesOptionSimplicityOfUploadingMaterials;
    /** Additional Questions: Was it easy to enter and upload application materials? NO **/
    @FindBy(xpath = "(//div[@class='radio radio-primary mt-0 ng-scope']//input[@value='no'])[1]")
    public WebElement noOptionSimplicityOfUploadingMaterials;
    /** Additional Questions: Did the ad posted on the website contain all the information you needed to decide whether or not to apply for the job? YES **/
    @FindBy(xpath = "(//div[@class='radio radio-primary mt-0 ng-scope']//input[@value='yes'])[2]")
    public WebElement yesPostedAd;
    /** Additional Questions: Did the ad posted on the website contain all the information you needed to decide whether or not to apply for the job? NO **/
    @FindBy(xpath = "(//div[@class='radio radio-primary mt-0 ng-scope']//input[@value='no'])[2]")
    public WebElement noPostedAd;
    /** Suggestion text Field **/
    @FindBy(xpath = "//textarea[@id='suggest_change_response']")
    public WebElement textFieldSuggestions;
    /** Submit Button **/
    @FindBy(xpath = "//button[@class='btn btn-primary mx-2']")
    public WebElement submitButton;
    /** Submit Confirmation Button **/
    @FindBy(xpath = "//button[@class='btn btn-primary mx-2']")
    public WebElement submitConfirmationButton;
    /** Close Application Submitted Button **/
    @FindBy(xpath = "//button[@class='btn btn-primary mx-2']")
    public WebElement closeApplicationSubmittedButton;
    /** Upload File1 **/
    @FindBy(xpath = "(//div[@class='input-group-btn']//button[contains(text(),' Choose File ')])[1]")
    public WebElement uploadFile1;
    /** Upload File2 **/
    @FindBy(xpath = "(//div[@class='input-group-btn']//button[contains(text(),' Choose File ')])[2]")
    public WebElement uploadFile2;
    /** Upload File3 **/
    @FindBy(xpath = "(//div[@class='input-group-btn']//button[contains(text(),' Choose File ')])[3]")
    public WebElement uploadFile3;
    /** Outreach Source Dropdown **/
    @FindBy(xpath = "//select[@id='outreach_source']")
    public WebElement outreachSourceDropdown;
}
