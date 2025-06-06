package CHARMS.pages;

import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ParticipantDetailsPage {

    /***
     * USE THIS METHOD TO DYNAMICALLY LOCATE RECORD BUTTONS ON
     * @param text
     * @return
     */
    public WebElement dynamicRecordButtonLocator(String text) {
        return WebDriverUtils.webDriver.findElement(By.xpath("//td[normalize-space()='" + text + "']"));
    }

    /* OPEN RECORD BUTTON */
    @FindBy(xpath = "//*[contains(text(),'Open Record')]")
    public WebElement openRecordButton;

    /* FIRST NAME RECORD PREVIEW FIELD */
    @FindBy(xpath = "//div[@class='form-group is-prefilled'][2]/div[2]/input")
    public WebElement firstNameRecordPreviewField;

    /* LAST NAME RECORD PREVIEW FIELD */
    @FindBy(xpath = "//input[@id='sys_readonly.x_naci_family_coho_family_history_details.last_name']")
    public WebElement lastNameRecordPreviewField;

    /* MIDDLE NAME RECORD PREVIEW FIELD */
    @FindBy(xpath = "//input[@id='sys_readonly.x_naci_family_coho_family_history_details.middle_name']")
    public WebElement middleNameRecordPreviewField;

    /* CONTACT HOME PHONE RECORD PREVIEW FIELD */
    @FindBy(xpath = "//input[@id='sys_readonly.x_naci_family_coho_family_history_details.phone']")
    public WebElement contactHomePhoneRecordPreviewField;

    /* CONTACT EMAIL RECORD PREVIEW FIELD */
    @FindBy(xpath = "//input[@id='sys_readonly.x_naci_family_coho_family_history_details.email_address']")
    public WebElement contactEmailRecordPreviewField;

    /* PROXY CONTACT EMAIL RECORD PREVIEW FIELD */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_family_history_details.proxy_email_address']")
    public WebElement proxyContactEmailRecordPreviewField;

    /* PERSONAL INFORMATION TAB */
    @FindBy(xpath = "//span[normalize-space()='Personal Information']")
    public WebElement personalInformationTab;

    /* RELATIONSHIP TO PROBAND DROPDOWN */
    @FindBy(xpath = "//select[@name='x_naci_family_coho_family_history_details.relationship_to_you']")
    public WebElement relationshipToProbandDropDown;

    /* NAME TEXT BOX */
    @FindBy(xpath = "//input[@aria-label='Name']")
    public WebElement nameTextBox;

    /* FIRST NAME TEXT BOX*/
    @FindBy(xpath = "(//input[@name='x_naci_family_coho_family_history_details.first_name'])[1]")
    public WebElement firstNameTextBox;

    /* MIDDLE INITIAL TEXT BOX */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_family_history_details.middle_name']")
    public WebElement middleInitialTextBox;

    /* LAST NAME TEXT BOX */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_family_history_details.last_name']")
    public WebElement lastNameTextBox;

    /**
     * DEMOGRAPHICS SECTION
     */

    /* DEMOGRAPHICS TAB */
    @FindBy(xpath = "//span[contains(text(),'Demographics')]")
    public WebElement demographicsTab;

    /* DATE OF BIRTH TEXT BOX*/
    @FindBy(xpath = "//input[@name='x_naci_family_coho_family_history_details.date_of_birth']")
    public WebElement dateOfBirthTextBox;

    /* BIOLOGICAL GENDER DROPDOWN  */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_family_history_details.biological_gender']")
    public WebElement biologicalGenderDropDown;

    /* IS PARTICIPANT ADOPTED DROP DOWN */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_family_history_details.adopted']")
    public WebElement isParticipantAdoptedDropDown;

    /* PARTICIPANT RACE PREFER NOT TO ANSWER OPTION */
    @FindBy(xpath = "//p[contains(text(),'Prefer not to answer')]")
    public WebElement participantRacePreferNotToAnswerOption;

    /* PARTICIPANT RACE TEXT */
    @FindBy(xpath = "//p[@data-original-title='Participant Race (Select all that apply)']")
    public WebElement participantRaceOption;

    /* ETHNICITY DROP DOWN OPTION*/
    @FindBy(xpath = "//select[@id='x_naci_family_coho_family_history_details.ethnicity']")
    public WebElement ethnicityDropDownOption;

    /**
     * CONTACT INFORMATION SECTION
     */
    /* CONTACT INFO TAB */
    @FindBy(xpath = "//span[contains(text(),'Contact Info')]")
    public WebElement contactInfoTab;

    /* CONTACT STREET ADDRESS */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_family_history_details.street_address']")
    public WebElement contactStreetAddress;

    /* CONTACT STATE */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_family_history_details.state']")
    public WebElement contactState;

    /* CONTACT CITY */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_family_history_details.city']")
    public WebElement contactCity;

    /* CONTACT ZIP CODE */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_family_history_details.zipcode']")
    public WebElement contactZipCode;

    /* CONTACT COUNTRY DROP DOWN */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_family_history_details.country']")
    public WebElement contactCountryDropDown;

    /* CONTACT EMAIL */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_family_history_details.email_address']")
    public WebElement contactEmailAddress;

    /* CONTACT HOME PHONE */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_family_history_details.phone']")
    public WebElement contactHomePhone;

    /* CONTACT CELL PHONE */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_family_history_details.cell_phone']")
    public WebElement contactCellPhone;

    /* CONTACT WORK PHONE */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_family_history_details.work_phone']")
    public WebElement contactWorkPhone;

    /* CONTACT PREFERRED PHONE */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_family_history_details.preferred_phone']")
    public WebElement contactPreferredPhone;

    /**
     * PROXY CONTACT INFORMATION SECTION
     */
    /* PROXY CONTACT INFO TAB */
    @FindBy(xpath = "//span[normalize-space()='Proxy Contact Info']")
    public WebElement proxyContactInfoTab;

    /* PROXY FIRST NAME */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_family_history_details.proxy_first_name']")
    public WebElement proxyFirstName;

    /* PROXY MIDDLE NAME */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_family_history_details.proxy_middle_name']")
    public WebElement proxyMiddleName;

    /* PROXY LAST NAME */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_family_history_details.proxy_last_name']")
    public WebElement proxyLastName;

    /* PROXY CONTACT STREET ADDRESS */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_family_history_details.proxy_contact_street_address']")
    public WebElement proxyContactStreetAddress;

    /* PROXY CONTACT STREET ADDRESS 2(OPTIONAL) */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_family_history_details.proxy_street_address_2']")
    public WebElement proxyContactStreetAddress2Optional;

    /* PROXY CONTACT CITY */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_family_history_details.proxy_contact_city']")
    public WebElement proxyContactCity;

    /* PROXY CONTACT STATE */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_family_history_details.proxy_state']")
    public WebElement proxyContactState;

    /* PROXY CONTACT ZIPCODE */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_family_history_details.proxy_contact_zipcode']")
    public WebElement proxyContactZipcode;

    /* PROXY CONTACT COUNTRY */
    @FindBy(xpath = "//input[@name='sys_display.x_naci_family_coho_family_history_details.proxy_contact_country']")
    public WebElement proxyContactCountry;

    /* PROXY CONTACT EMAIL ADDRESS */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_family_history_details.proxy_email_address']")
    public WebElement proxyContactEmailAddress;

    /* PROXY CONTACT HOME PHONE */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_family_history_details.proxy_phone_number']")
    public WebElement proxyContactHomePhone;

    /* PROXY CONTACT CELLPHONE */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_family_history_details.proxy_work_phone']")
    public WebElement proxyContactWorkPhone;

    /* PROXY CONTACT WORK PHONE */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_family_history_details.proxy_cell_phone']")
    public WebElement proxyContactHomeCellphone;

    /* PROXY CONTACT PREFERRED PHONE */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_family_history_details.proxy_preferred_phone']")
    public WebElement proxyContactPreferredPhone;

    /**
     * RELATED LINKS SECTION
     */
    /* PARTICIPANT STUDIES TAB */
    @FindBy(xpath = "//span[normalize-space()='Participant Studies (1)']")
    public WebElement participantStudiesTab;

    /* PARTICIPANT STUDIES PREVIEW BUTTON */
    @FindBy(xpath = "//table[@glide_table='x_naci_family_coho_participant_study']//td//a[contains(@aria-label,'Preview record')]")
    public WebElement participantStudiesPreviewButton;

    /* PARTICIPANT STUDIES INFO BUTTON */
    @FindBy(xpath = "//tr[@record_class='x_naci_family_coho_participant_study']//td/a[contains(@data-list_id, 'x_naci_family_coho_family_history_details')]")
    public WebElement participantStudiesInfoButton;

    /***
     * MEDICAL INFORMATION SECTION
     */
    /* VITAL STATUS YES DROP DOWN OPTION */
    @FindBy(xpath = "//*[@name='x_naci_family_coho_ras_referral.person_alive']")
    public WebElement vitalStatusYesDropDownOption;

    /***
     * RASOPATHY HISTORY SECTION
     */

    /* CONSENT STATUS TEXT */
    @FindBy(xpath = "//td[normalize-space()='Consent Call Pending']")
    public WebElement consentStatusText;

    public ParticipantDetailsPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}
