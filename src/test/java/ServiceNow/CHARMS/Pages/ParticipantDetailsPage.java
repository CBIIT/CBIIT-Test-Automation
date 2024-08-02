package ServiceNow.CHARMS.Pages;

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
    @FindBy(xpath = "//div[@id='label.x_naci_family_coho_family_history_details.date_of_birth_month_day_year']/following-sibling::div/span/input")
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
     * RELATED LINKS SECTION
     */
    /* PARTICIPANT STUDIES TAB */
    @FindBy(xpath = "//span[normalize-space()='Participant Studies (1)']")
    public WebElement participantStudiesTab;

    /* PARTICIPANT STUDIES INFO BUTTON */
    @FindBy(xpath = "//a[normalize-space()='RASopathy']//parent::td//parent::tr//child::td[2]//child::a")
    public WebElement participantStudiesInfoButton;

    /***
     * MEDICAL INFORMATION SECTION
     */
    /* MEDICAL INFORMATION TAB */
    @FindBy(xpath = "//span[contains(text(),'Medical Information')]")
    public WebElement medicalInformationTab;

    /* HAS A PHYSICIAN EVER DIAGNOSED THIS PARTICIPANT WITH CANCER? DROP DOWN*/
    @FindBy(xpath = "//select[@id='x_naci_family_coho_family_history_details.has_cancer']")
    public WebElement hasAPhysicianEverDiagnosedThisParticipantWithCancerDropDown;

    /* VITAL STATUS YES DROP DOWN OPTION */
    @FindBy(xpath = "//*[@id='x_naci_family_coho_ras_referral.family_member_record.person_alive']")
    public WebElement vitalStatusYesDropDownOption;

    /* HAS THE PARTICIPANT EVER HAD GENETIC TESTING? DROP DOWN */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_family_history_details.genetic_testing']")
    public WebElement hasTheParticipantEverHadGeneticTestingDropDown;

    /***
     * RASOPATHY HISTORY SECTION
     */

    /* RASOPATHY HISTORY TAB*/
    @FindBy(xpath = "//span[contains(text(),'RASopathy History')]")
    public WebElement rasopathyHistoryTab;

    /* HAVE YOU BEEN DIAGNOSED WITH A RASOPATHY? DROP DOWN */
    @FindBy(xpath = "//*[@id='x_naci_family_coho_ras_referral.rasopathy_diagnosis']")
    public WebElement haveYouBeenDiagnosedWithARasopathyDropDown;

    /* HAVE ANY OF YOUR BIOLOGICAL RELATIVES BEEN DIAGNOSED WITH A RASOPATHY? DROP DOWN */
    @FindBy(xpath = "//*[@id='x_naci_family_coho_ras_referral.realtives_rasopathy_diagnosis']")
    public WebElement haveAnyOfYourBiologicalRelativesBeenDiagnosedWithARasopathyDropDown;

    /* CONSENT STATUS TEXT */
    @FindBy(xpath = "//td[normalize-space()='Consent Call Pending']")
    public WebElement consentStatusText;

    public ParticipantDetailsPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}
