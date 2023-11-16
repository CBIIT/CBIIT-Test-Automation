package ServiceNow.SEER.Pages;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NativeViewAccessRequestPage extends CommonUtils {

    /** --------------- NATIVE VIEW ACCESS REQUEST PAGE --------------- */

    /** Native View SEER Access Requested Link */
    public static WebElement nativeViewSEERAccessRequestsLink(String accessRequestsText) {
        return WebDriverUtils.webDriver.findElement (By.xpath( "//div[contains(text(),'" + accessRequestsText + "')]"));
    }

    /**Native View Access Requests IFRAME*/
    @FindBy(xpath = "//*[@id=\'gsft_main\']")
    public WebElement accessRequestIFrame;

    /**Native View Access Requests Dropdown Menu*/
    @FindBy(xpath = "//*[@id=\"list_nav_x_g_nci_seer_data_access\"]/div/div[1]/h1/a")
    public WebElement accessRequestMenu;

    /** Native View Access Request New Button */
    @FindBy (xpath = "//*[@id=\'sysverb_new\']")
    public WebElement accessRequestNewButton;

    /** Native View Access Request Text */
    @FindBy (xpath = "//div[@class='navbar-title-caption navbar-title-new-record']")
    public WebElement accessRequestText;

    /** Native View Access Request Customer Text */
    @FindBy (xpath = "//div[@class='navbar-title-caption']")
    public WebElement accessRequestCustomerText;

    /**NativeView Access Request Customer field*/
    @FindBy(xpath = "//input[@id='sys_display.x_g_nci_seer_data_access.customer']")
    public WebElement nativeViewAccessRequestCustomerTextBox;

    /**NativeView Access Request No Records To Display Text*/
    @FindBy(xpath = "//td[normalize-space()='No records to display']")
    public WebElement nativeViewAccessRequestNoRecordsToDisplayText;

    /**NativeView Access Request Dataset field*/
    @FindBy(xpath = "//input[@id='sys_display.x_g_nci_seer_data_access.dataset']")
    public WebElement nativeViewAccessRequestDatasetTextBox;

    /**NativeView Access Request Preview Record*/
    @FindBy(xpath = "//button[@id='viewr.x_g_nci_seer_data_access.customer']")
    public WebElement nativeViewAccessRequestPreviewRecordButton;

    /**NativeView Access Request Preview Record*/
    @FindBy(xpath = "//a[@class='btn btn-sm btn-default pop-over-button pull-right']")
    public WebElement nativeViewAccessRequestOpenRecordButton;

    /**NativeView Access Request Save Changes Discard Button*/
    @FindBy(xpath = "//button[normalize-space()='Discard']")
    public WebElement nativeViewAccessRequestSaveChangesDiscardButton;

    /**NativeView Access Request Account Type Dropdown */
    @FindBy(xpath = "//select[@id='x_g_nci_seer_data_customer.email_type']")
    public WebElement nativeViewAccessRequestAccountTypeDropdown;

    /**NativeView Access Request Status Dropdown */
    @FindBy(xpath = "//select[@id='x_g_nci_seer_data_approval.status']")
    public WebElement nativeViewAccessRequestStatusDropdown;

    /**NativeView Access Request Save Client Button */
    @FindBy(xpath = "//button[@id='sysverb_update_and_stay']")
    public WebElement nativeViewAccessSaveClientButton;

    /**NativeView Access Request Save Client Button */
    @FindBy(xpath = "//*[@id=\'sysverb_insert_and_stay_bottom\']")
    public WebElement nativeViewAccessSaveClientButtonBottom;

    /**NativeView Access Request Update Client Button */
    @FindBy(xpath = "//*[@id=\'sysverb_update_and_stay_bottom\']")
    public WebElement nativeViewAccessSaveRejectedClientButtonBottom;

    /**NativeView Account Button */
    @FindBy(xpath = "//span[@class='user-name hidden-xs hidden-sm hidden-md']")
    public WebElement nativeViewAccountButton;

    /**NativeView Log Out Button */
    @FindBy(xpath = "//a[normalize-space()='Log out']")
    public WebElement nativeViewLogOutButton;

    /**NativeView Account Button */
    @FindBy(xpath = "//*[@id=\'sysverb_update_bottom\']")
    public WebElement nativeViewAccessUpdateClientButtonBottom;

    /**NativeView Access Request Request*/
    @FindBy(xpath = "//*[@id=\'x_g_nci_seer_data_access.x_g_nci_seer_data_approval.request_table\']/tbody//child::td[3]//child::a")
    public WebElement nativeViewAccessRequest;

    public NativeViewAccessRequestPage() { PageFactory.initElements(WebDriverUtils.webDriver, this); }
}