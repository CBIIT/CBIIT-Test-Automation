package ServiceNow.CHARMS.FanconiSurvey.playwright.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class CHARMSNativeViewPage extends CommonUtils {

    /* **** BEGINNING OF NATIVE VIEW ELEMENTS FOR ALL PAGES ***** */

    /*--------- Dashboard Link  */
    @FindBy(xpath = "//ul[@aria-label='Modules for Application: CHARMS']//div//div[@class='sn-widget-list-title'][normalize-space()='Dashboard']")
    public WebElement nativeViewDashboardLink;

    /*--------- Native view frame -----------  */
    @FindBy(xpath = "//iframe[@title='RAS Study | ServiceNow']")
    public WebElement nativeViewiFrameCHARMS;

    /*--------- Native view Family Member Details Preview Automated Test button---------- */
    @FindBy(xpath = "//a[@aria-label='Preview record: AutomatedFirstNameOfParticipant AutomatedLastNameOfParticipant']")
    public WebElement nativeViewFamilyMemberDetailsPreviewAutomatedTestButton;

    /*--------- Native view Family Member Details Preview Automated Test First Name text ---------- */
    @FindBy(xpath = "/html/body/div[4]/div[3]/form/div/span/span/div[4]/div/div[1]/div[2]/div[2]/input[1]")
    public WebElement nativeViewFamilyMemberDetailsPreviewAutomatedFirstNameText;

    /*--------- Native view Family Member Details Preview Automated Test Last Name text ---------- */
    @FindBy(xpath = "//body/div[@role='dialog']/div[@class='popover-content']/form[@name='x_naci_family_coho_family_history_details.do']/div/span[contains(@class,'tabs2_section tabs2_section_0 tabs2_section0')]/span[contains(@class,'section')]/div[@aria-label='Family Member Details form section']/div[@class='row']/div[2]/div[2]/div[2]/input[1]")
    public WebElement nativeViewFamilyMemberDetailsPreviewAutomatedLastNameText;

    /*--------- Native view Family Member Details Preview Automated Test Contact Home Phone Text ---------- */
    @FindBy(xpath = "//body/div[@role='dialog']/div[@class='popover-content']/form[@name='x_naci_family_coho_family_history_details.do']/div/span[contains(@class,'tabs2_section tabs2_section_0 tabs2_section0')]/span[contains(@class,'section')]/div[@aria-label='Family Member Details form section']/div[@class='row']/div[2]/div[3]/div[2]/input[1]")
    public WebElement nativeViewFamilyMemberDetailsPreviewAutomatedContactHomePhoneText;

    /*--------- Native view Family Member Details Preview Automated Test Open Record button ---------- */
    @FindBy(xpath = "//a[normalize-space()='Open Record']")
    public WebElement nativeViewFamilyMemberDetailsPreviewAutomatedTestOpenRecordButton;

    /* Native view Family Member Details --> History Tab */
    @FindBy(xpath = "//span[normalize-space()='History']")
    public WebElement nativeViewFamilyMemberDetailsAutomatedTestRecordHistoryTab;

    /* Native view Family Member Details --> History comments box */
    @FindBy(xpath = "//textarea[contains(@class,'sn-string-textarea form-control ng-pristine ng-untouched ng-valid ng-isolate-scope ng-empty ng-valid-required')]")
    public WebElement nativeViewFamilyMemberDetailsAutomatedTestRecordHistoryCommentsBox;

    /* Native view Family Member Details--> History comments box */
    @FindBy(xpath = "//span[@class='navbar_ui_actions']//button[@value='e65678521bc9b814e541631ee54bcb87'][normalize-space()='Send Consent']")
    public WebElement nativeViewFamilyMemberDetailsAutomatedTestRecordSendConsentButton;

    /* ------ Native view 'DJ' button ----- */
    @FindBy(xpath = "//span[contains(text(),'DJ')]")
    public WebElement nativeViewDJButton;

    /* ----- Native view Log Out------ */
    @FindBy(xpath = "//a[normalize-space()='Log out']")
    public WebElement nativeViewLogOutButton;

    /* ----- Native view Awaiting PI Signature link ----- */
    @FindBy(xpath = "/html/body/div[1]/div[4]/div[1]/div[2]/div[2]/div/div[7]/div[1]/div[2]/div[1]/div[3]/div/span/a")
    public WebElement nativeViewAwaitingPISignatureLink;

    /* ------ Native view Family Study Consent link ------ */
    @FindBy(xpath = "//a[normalize-space()='Family Cohort Study Consent.pdf']")
    public WebElement nativeViewFamilyStudyConsentLink;

    /*----- NEW LOCATORS BELOW ----- */

    /***
     * USE THIS METHOD TO DYNAMICALLY LOCATE CHARMS DASHBOARD MODULE LINKS
     * 
     * @param text
     * @return
     */
    public WebElement dynamicDashboardModuleLinkLocator(String text) {
        return WebDriverUtils.webDriver.findElement(By.xpath("(//*[text()='" + text
                + "']//parent::div//parent::div//parent::div)[1]/div[1]/following-sibling::div/div/div[3]/div/div/span/a"));
    }

    /**
     * Dashboard module link
     */
    @FindBy(xpath = "(//div[text()='Dashboard'])[3]")
    public WebElement dashboardModuleLink;

    /**
     * NATIVE VIEW iFRAME
     */
    @FindBy(xpath = "//iframe[@id='gsft_main']")
    public WebElement nativeViewIframe;

    /* ********** END OF Native view RAS Survey Data Verification ********** */

    /* **************************************************** */
    public CHARMSNativeViewPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}
