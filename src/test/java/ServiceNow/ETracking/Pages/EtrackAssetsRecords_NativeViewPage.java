package ServiceNow.ETracking.Pages;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EtrackAssetsRecords_NativeViewPage extends CommonUtils{
    public EtrackAssetsRecords_NativeViewPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }

    /** Native View Filter Navigator */
    @FindBy(xpath = "//input[@id='filter']")
    public WebElement nVeTrackingFilterNavigator;

    /** Native View eTracking Tab */
    @FindBy(xpath = "//span[normalize-space()='eTracking']")
    public WebElement nVeTrackingTab;

    /** Native View eTracking Assets Tab */
    @FindBy(xpath = "//*[@id='94e67acd1b9365106daea681f54bcb7d']")
    public WebElement nVEtrackingAssetsTab;

    /**Native View Access Requests IFRAME*/
    @FindBy(xpath = "//*[@id='gsft_main']")
    public WebElement accessRequestIFrame;

    /** --------------- NATIVE VIEW ETRACK ASSETS CREATE NEW RECORD PAGE --------------- */

    /** Native View eTracking Assets Record New Button */
    @FindBy(xpath = "//*[@id='sysverb_new']")
    public WebElement nVEtrackAssetsNewButton;

    /** Native View eTracking NEW Assets Record Decal Number Label */
    @FindBy(xpath = "//label[@for='x_naci_e_tracking_etrack_assets.barcode']")
    public WebElement nVEtrackAssetsNewRecordDecalNumberLabel;

    /** Native View eTracking NEW Assets Record Decal Number Text Box */
    @FindBy(xpath = "//input[@id='x_naci_e_tracking_etrack_assets.barcode']")
    public WebElement nVEtrackAssetsNewRecordDecalNumberTextBox;

    /** Native View eTracking NEW Assets Record Model Text Box */
    @FindBy(xpath = "//*[@id='sys_display.x_naci_e_tracking_etrack_assets.model']")
    public WebElement nVEtrackAssetsNewRecordModelTextBox;

    /** Native View eTracking NEW Assets Record COST Text Box */
    @FindBy(xpath = "//*[@id='x_naci_e_tracking_etrack_assets.cost.display']")
    public WebElement nVEtrackAssetsNewRecordCostTextBox;

    /** Native View eTracking NEW Assets Record Stockroom Text Box */
    @FindBy(xpath = "//*[@id='sys_display.x_naci_e_tracking_etrack_assets.stockroom']")
    public WebElement nVEtrackAssetsNewRecordStockroomTextBox;

    /** Native View eTracking NEW Assets Record Quantity Text Box */
    @FindBy(xpath = "//input[@id='x_naci_e_tracking_etrack_assets.quantity']")
    public WebElement nVEtrackAssetsNewRecordQuantityTextBox;

    /** Native View eTracking NEW Assets Record Asset Type Text Box */
    @FindBy(xpath = "//*[@id='x_naci_e_tracking_etrack_assets.asset_type']")
    public WebElement nVEtrackAssetsNewRecordAssetTypeTextBox;

    /** Native View eTracking NEW Assets Record Expiration date Field */
    @FindBy(xpath = "//span[normalize-space()='Expiration date']")
    public WebElement nVEtrackAssetsNewRecordExpirationDateField;

    /** Native View eTracking NEW Assets Record Expiration date Text Box */
    @FindBy(xpath = "//*[@id='x_naci_e_tracking_etrack_assets.expiration_date']")
    public WebElement nVEtrackAssetsNewRecordExpirationDateTextBox;

    /** Native View eTracking NEW Assets Record Expiration date Calendar Icon */
    @FindBy(xpath = "//a[@id='x_naci_e_tracking_etrack_assets.expiration_date.ui_policy_sensitive']")
    public WebElement nVEtrackAssetsNewRecordExpirationDateCalendarIcon;

    /** Native View eTracking NEW Assets Record Expiration date Calendar */
    @FindBy(xpath = "//*[@id='window.GwtDateTimePicker']")
    public WebElement nVEtrackAssetsNewRecordExpirationDateCalendar;

    /** ETRACK ASSET Record Expiration Date Calendar Select date Dynamic Xpath */
    public WebElement eTrackAssetExpirationDateSelectAnyDate(int value) {
        return WebDriverUtils.webDriver
                .findElement(By.xpath("//*[@id='GwtDateTimePicker_day" + value + "']"));
    }

    /** ETRACK ASSET Record Expiration Date Calendar Select any date */
    @FindBy(xpath = "//*[@id='GwtDateTimePicker_day35']")
    public WebElement eTrackAssetExpirationDateSelectAnyDate;

    /** Native View eTracking NEW Assets Record Expiration date Select Go to Today Date */
    @FindBy(xpath = "//td[@aria-label='Go to Today']")
    public WebElement nVEtrackAssetsNewRecordExpirationDateSelectGoToTodayDate;

    /** Native View eTracking NEW Record Asset Information */
    @FindBy(xpath = "//span[normalize-space()='Asset information']")
    public WebElement nVEtrackAssetsNewRecordAssetInformation;

    /** Native View eTracking NEW Assets Record Asset Information Text Box */
    @FindBy(xpath = "//*[@id='x_naci_e_tracking_etrack_assets.asset_information']")
    public WebElement nVEtrackAssetsNewRecordAssetInformationTextBox;

    /** Native View eTracking NEW Assets Record Status Drop Down Box */
    @FindBy(xpath = "//*[@id='x_naci_e_tracking_etrack_assets.asset_status']")
    public WebElement nVEtrackAssetsNewRecordStatusDropDown;

    /** Native View eTracking Assets New Record Submit Button */
    @FindBy(xpath = "//*[@id='sysverb_insert_bottom']")
    public WebElement nVEtrackAssetsNewRecordSubmitButton;

    /** --------------- NATIVE VIEW ETRACK ASSETS ALL RECORDS PAGE --------------- */

    /** Native View eTracking Assets All Record Search Drop Down */
    @FindBy(xpath = "//*[@id='x_naci_e_tracking_etrack_assets_hide_search']/div//child::span//child::span//child::select")
    public WebElement nVEtrackAssetsAllRecordSearchDropDown;

    /** Native View eTracking Assets All Record Search Text Box */
    @FindBy(xpath = "//*[@id='x_naci_e_tracking_etrack_assets_hide_search']/div//child::input")
    public WebElement nVEtrackAssetsAllRecordSearchTextBox;

    /** ETRACK ASSET Record locator Dynamic Xpath */
    public WebElement eTrackAssetLocator(String value) {
        return WebDriverUtils.webDriver
                .findElement(By.xpath("//a[normalize-space()='" + value + "']//parent::td//parent::tr//child::td[2]//child::a"));
    }

    /** Native View eTracking Assets Open Record Button */
    @FindBy(xpath = "//a[normalize-space()='Open Record']")
    public WebElement nVEtrackAssetsOpenRecordButton;

    /** --------------- NATIVE VIEW ETRACK ASSETS OPEN RECORD PAGE --------------- */

    /** Native View eTracking Assets Open Record Delete Button */
    @FindBy(xpath = "//*[@id='delete_checked_bottom']")
    public WebElement nVEtrackAssetsOpenRecordDeleteButton;

    /** Native View eTracking Assets Model Record locator Button */
    @FindBy(xpath = "//*[@id='viewr.x_naci_e_tracking_etrack_assets.model']")
    public WebElement nVEtrackAssetsModelOpenRecordButton;

    /** Native View eTracking Assets Model Record Description Field */
    @FindBy(xpath = "//span[normalize-space()='Description']")
    public WebElement nVEtrackAssetsModelRecordDescriptionField;

    /** Native View eTracking Assets Model Record Description Text Box */
    @FindBy(xpath = "//*[@id='x_naci_e_tracking_model.description']")
    public WebElement nVEtrackAssetsModelRecordDescriptionTextBox;

    /** Native View eTracking Assets Model Record Update Button */
    @FindBy(xpath = "//*[@id='sysverb_update_bottom']")
    public WebElement nVEtrackAssetsModelRecordUpdateButton;

    /** Native View eTracking Assets Model Record Back Button */
    @FindBy(xpath = "//button[@aria-label='Back']")
    public WebElement nVEtrackAssetsModelRecordBackButton;
}
