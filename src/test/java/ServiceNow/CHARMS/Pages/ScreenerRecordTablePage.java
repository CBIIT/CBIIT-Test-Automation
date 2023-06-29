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
