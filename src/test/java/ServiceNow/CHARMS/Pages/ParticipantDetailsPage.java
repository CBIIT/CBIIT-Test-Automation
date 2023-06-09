package ServiceNow.CHARMS.Pages;

import com.mysql.cj.x.protobuf.MysqlxCrud;
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
        return WebDriverUtils.webDriver.findElement(By.xpath("//*[text()='" + text + "']//parent::tr/td[2]"));
    }

    /* OPEN RECORD BUTTON */
    @FindBy(xpath = "//*[contains(text(),'Open Record')]")
    public WebElement openRecordButton;

    /* NAME TEXT BOX */
    @FindBy(xpath = "//input[@aria-label='Name']")
    public WebElement nameTextBox;

    /* FIRST NAME TEXT BOX*/
    @FindBy(xpath = "//input[@aria-label='First Name']")
    public WebElement firstNameTextBox;

    /* MIDDLE INITIAL TEXT BOX */
    @FindBy(xpath = "//input[@aria-label='Middle Name']")
    public WebElement middleInitialTextBox;

    /* LAST NAME TEXT BOX */
    @FindBy(xpath = "//input[@aria-label='Last Name']")
    public WebElement lastNameTextBox;

    /* DEMOGRAPHICS TAB */
    @FindBy(xpath = "//span[contains(text(),'Demographics')]")
    public WebElement demographicsTab;

    /* DATE OF BIRTH TEXT BOX*/
    @FindBy(xpath = "//div[@id='label.x_naci_family_coho_family_history_details.date_of_birth_month_day_year']/following-sibling::div/span/input")
    public WebElement dateOfBirthTextBox;

    /* BIOLOGICAL GENDER DROPDOWN MALE OPTION */
    @FindBy(xpath = "//select[@aria-labelledby='label.x_naci_family_coho_family_history_details.biological_gender']/option[3]")
    public WebElement biologicalGenderMaleDropDownOption;

    /* IS PARTICIPANT ADOPTED NO OPTION */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_family_history_details.adopted']/option[2]")
    public WebElement isParticipantAdoptedNoOption;

    /* PARTICIPANT RACE PREFER NOT TO ANSWER OPTION */
    @FindBy(xpath = "//p[contains(text(),'Prefer not to answer')]")
    public WebElement participantRacePreferNotToAnswerOption;

    /* NOT HISPANIC/LATINO ETHNICITY DROP DOWN OPTION*/
    @FindBy(xpath = "//select[@id='x_naci_family_coho_family_history_details.ethnicity']/option[3]")
    public WebElement notHispanicLatinoEthnicityDropDownOption;

    /* CONTACT INFO TAB */
    @FindBy(xpath = "//span[contains(text(),'Contact Info')]")
    public WebElement contactInfoTab;

    /* CONTACT STREET ADDRESS */
    @FindBy(xpath = "//input[@aria-label='Contact Street Address']")
    public WebElement contactStreetAddress;

    /* CONTACT STATE */
    @FindBy(xpath = "//input[@aria-label='Contact State']")
    public WebElement contactState;

    /* CONTACT CITY */
    @FindBy(xpath = "//input[@aria-label='Contact City']")
    public WebElement contactCity;

    /* CONTACT ZIP CODE */
    @FindBy(xpath = "//input[@aria-label='Contact Zip Code']")
    public WebElement contactZipCode;

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

    public ParticipantDetailsPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}
