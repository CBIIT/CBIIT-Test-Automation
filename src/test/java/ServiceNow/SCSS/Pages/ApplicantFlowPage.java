package ServiceNow.SCSS.Pages;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class
ApplicantFlowPage extends CommonUtils {

    public ApplicantFlowPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }

    /** tab Profile **/
    @FindBy(xpath = "//span[@class='ant-menu-title-content']//*[contains(text(),'Profile')]")
    public WebElement tabProfile;

    /** tab Basic Information **/
    @FindBy(xpath = "//div[contains(text(),'Basic Information')]")
    public WebElement tabPBasicInfo;

    /** tab Demographics **/
    @FindBy(xpath = "//div[contains(text(),'Demographics (optional)')]")
    public WebElement tabDemographics;

    /** button Edit Profile tab **/
    @FindBy(xpath = "//button//span[contains(text(),'Edit')]")
    public WebElement btnEditProfileTab;

    /**  Profile first name field **/
    @FindBy(xpath = "//input[@id='basic_firstName']")
    public WebElement fldFirstNameProfile;

    /**  Profile middle name field **/
    @FindBy(xpath = "//input[@id='basic_middleName']")
    public WebElement fldMiddleNameProfile;

    /**  Profile last name field **/
    @FindBy(xpath = "//div//input[@id='basic_lastName']")
    public WebElement fldLastNameProfile;

    /**  Profile email field **/
    @FindBy(xpath = "//div//input[@id='basic_email']")
    public WebElement fldEmailProfile;

    /**  Profile phone field **/
    @FindBy(xpath = "//span//input[@name='phone']")
    public WebElement fldPhoneProfile;

    /**  Profile business phone field **/
    @FindBy(xpath = "//span//input[@name='businessPhone']")
    public WebElement fldBusinessPhoneProfile;

    /**  Profile address field **/
    @FindBy(xpath = "//div//input[@id='basic_address_address']")
    public WebElement fldAddressProfile;

    /**  Profile app number field **/
    @FindBy(xpath = "//div//input[@id='basic_address_address2']")
    public WebElement fldAppNumberProfile;

    /**  Profile city field **/
    @FindBy(xpath = "//div//input[@id='basic_address_city']")
    public WebElement fldCityProfile;

    /**  Profile state field **/
    @FindBy(xpath = "//div//input[@id='basic_address_stateProvince']")
    public WebElement fldStateProfile;

    /**  Profile country field **/
    @FindBy(xpath = "//div//input[@id='basic_address_country']")
    public WebElement fldCountryProfile;

    /**  Profile zip field **/
    @FindBy(xpath = "//div//input[@id='basic_address_zip']")
    public WebElement fldZipProfile;

    /**  Degree dropdown **/
    @FindBy(xpath = "(//div[@class='ant-select-selector'])[3]")
    public WebElement dropdownDegree;

    /**  Degree Masters **/
    @FindBy(xpath = "//div[@title='Masters']")
    public WebElement degreeMasters;

    /**  Degree Masters **/
    @FindBy(xpath = "//div[@title='Bachelors']")
    public WebElement degreeBachelors;

    /**  radio button yes "Are you a US citizen" **/
    @FindBy(xpath = "(//span//input[@class='ant-radio-input'])[1]")
    public WebElement rdButtonUSCitizen;

    /**  button save Profile tab **/
    @FindBy(xpath = "//button//span[.='Save']")
    public WebElement buttonSave;

    /**  button Share Demographics Profile tab **/
    @FindBy(xpath = "//label[@class='ant-radio-wrapper ant-radio-wrapper-in-form-item']//input[@value='1']")
    public WebElement buttonShareDemographics;

    /**  button  NOT Share Demographics Profile tab **/
    @FindBy(xpath = "//label[@class='ant-radio-wrapper ant-radio-wrapper-in-form-item']//input[@value='0']")
    public WebElement buttonNotShareDemographics;

    /**  button Female Sex Profile tab **/
    @FindBy(xpath = "//div[@class='ant-space-item']//input[@value='Male']")
    public WebElement buttonFemaleSex;

    /**  button Male Sex Profile tab **/
    @FindBy(xpath = "//div[@class='ant-space-item']//input[@value='Female']")
    public WebElement buttonMaleSex;

    /**  button Hispanic or Latino Profile tab **/
    @FindBy(xpath = "//div[@id='demographics_ethnicity']//input[@value='1']")
    public WebElement buttonHispanicOrLatino;

    /**  button Not Hispanic or Latino Profile tab **/
    @FindBy(xpath = "//div[@id='demographics_ethnicity']//input[@value='0']")
    public WebElement buttonNotHispanicOrLatino;

    /**  button American Indian or Alaska Native Profile tab **/
    @FindBy(xpath = "//input[@value='American Indian']")
    public WebElement buttonAmericanIndianAlaskaNative;

    /**  button Asian Profile tab **/
    @FindBy(xpath = "//input[@value='Asian']")
    public WebElement buttonAsian;

    /**  button Blind Profile tab **/
    @FindBy(xpath = "//input[@value='Blind']")
    public WebElement buttonBlind;

    /**  button Deaf Profile tab **/
    @FindBy(xpath = "//input[@value='Deaf']")
    public WebElement buttonDeaf;
}
