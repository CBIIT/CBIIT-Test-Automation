package ServiceNow.CHARMS.Pages;

import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ScreenerRecordTablePage {

    /* REFERRAL PREVIEW BUTTON */
    @FindBy(xpath = "//button[@id='viewr.x_naci_family_coho_family_history_details.proband_screener']")
    public WebElement referralPreviewButton;

    /* OPEN RECORD BUTTON */
    @FindBy(xpath = "//a[contains(text(),'Open Record')]")
    public WebElement openRecordButton;

    /* SCREENER PREVIEW FAMILY MEMBER RECORD FIELD */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_ras_referral.family_member_record_label']")
    public WebElement screenerPreviewFamilyMemberRecordField;

    /* SCREENER PREVIEW CONTACT EMAIL ADDRESS FIELD */
    @FindBy(xpath = "//input[@id='sys_readonly.x_naci_family_coho_ras_referral.family_member_record.email_address']")
    public WebElement screenerPreviewContactEmailAddressField;

    /* SCREENER PREVIEW STUDY FIELD */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_ras_referral.study_label']")
    public WebElement screenerPreviewStudyField;

    /* SCREENER STUDY FIELD */
    @FindBy(xpath = "//input[@id='sys_display.x_naci_family_coho_ras_referral.study']")
    public WebElement screenerStudyField;

    /* FAMILY MEMBER RECORD FIELD */
    @FindBy(xpath = "//input[@id='sys_display.x_naci_family_coho_ras_referral.family_member_record']")
    public WebElement familyMemberRecordField;

    /* CONTACT EMAIL FIELD */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_ras_referral.family_member_record.email_address']")
    public WebElement contactEmailField;

    /* CONTACT HOME PHONE FIELD */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_ras_referral.family_member_record.phone']")
    public WebElement contactHomePhoneField;

    /* CONTACT CELL PHONE FIELD */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_ras_referral.family_member_record.cell_phone']")
    public WebElement contactCellPhoneField;

    /* CONTACT WORK PHONE FIELD */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_ras_referral.family_member_record.work_phone']")
    public WebElement contactWorkPhoneField;

    /* CONTACT COUNTRY UNITED STATES OF AMERICA OPTION FIELD */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_ras_referral.family_member_record.country']/option[2]")
    public WebElement contactCountryUSAOption;

    /* CONTACT STATE FIELD */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_ras_referral.family_member_record.state']")
    public WebElement contactStateField;

    /* CONTACT STREET ADDRESS FIELD */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_ras_referral.family_member_record.street_address']")
    public WebElement contactStreetAddressField;

    /* CONTACT CITY FIELD */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_ras_referral.family_member_record.city']")
    public WebElement contactCityField;

    /* CONTACT ZIP CODE FIELD */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_ras_referral.family_member_record.zipcode']")
    public WebElement contactZipCodeField;

    /* DEMOGRAPHICS PARTICIPANT RACE PREFER NOT TO ANSWER OPTION */
    @FindBy(xpath = "//p[@id='x_naci_family_coho_ras_referral.family_member_record.race_nonedit']")
    public WebElement demographicsParticipantRacePreferNotToAnswerOption;

    /**
     * USE THIS METHOD TO DYNAMICALLY LOCATE TABS IN SCREENER TABLE
     * @param text
     * @return
     */
    public WebElement dynamicLocatorForTabs(String text) {
        return WebDriverUtils.webDriver.findElement(By.xpath("//span[contains(text(),'" + text + "')]"));
    }

    public ScreenerRecordTablePage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}
