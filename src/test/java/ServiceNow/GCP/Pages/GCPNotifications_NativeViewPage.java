package ServiceNow.GCP.Pages;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GCPNotifications_NativeViewPage extends CommonUtils {

    public GCPNotifications_NativeViewPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }

    /** Native View Filter Navigator */
    @FindBy(xpath = "//input[@id='filter']")
    public WebElement nVFilterNavigator;

    /** Native View Filter Navigator System Notification Label */
    @FindBy(xpath = "//span[normalize-space()='System Notification']")
    public WebElement nVFilterNavigatorSystemNotificationLabel;

    /** Native View Filter Navigator Notifications Sub Menu */
    @FindBy(xpath = "//span[normalize-space()='System Notification']//parent::a//parent::li/child::ul/child::li[1]/child::div/child::ul/child::li[2]//child::a")
    public WebElement nVFilterNavigatorNotificationSubMenu;

    /** Native View GCP Record Search Drop Down */
    @FindBy(xpath = "//*[@id='sysevent_email_action_hide_search']/div//child::span//child::span//child::select")
    public WebElement nVGCPRecordSearchDropDown;

    /** Native View GCP SEARCH Text Box */
    @FindBy(xpath = "//*[@id='sysevent_email_action_hide_search']//child::input")
    public WebElement nVGCPSearchTextBox;

    /** Native View Record locator Dynamic Xpath */
    public WebElement nVRecordLocator(String value) {
        return WebDriverUtils.webDriver
                .findElement(By.xpath("//a[normalize-space()='" + value + "']//parent::td//parent::tr//child::td[2]//child::a"));
    }

    /** Native View Open Record Button */
    @FindBy(xpath = "//a[normalize-space()='Open Record']")
    public WebElement nVOpenRecordButton;

    /** Native View GCP Record Preview Notification Button */
    @FindBy(xpath = "//*[@id='sysevent_email_action.do']/div[2]//child::button[4]")
    public WebElement nVGCPRecordPreviewNotificationButton;

    /** Native View GCP Record Notification Preview Title */
    @FindBy(xpath = "//*[@id='notification_preview_title']")
    public WebElement nVGCPRecordNotificationPreviewTitle;

    /** Native View GCP Employee Training expired Notification Body Title */
    @FindBy(xpath = "//strong[normalize-space()='Body']")
    public WebElement nVGCPGCPEmployeeTrainingExpiredNotificationBodyTitle;

    /** Native View GCP Employee Training expired Notification Body iFrame */
    @FindBy(xpath = "//iframe[@id='simulated_html_iframe']")
    public WebElement nVGCPGCPEmployeeTrainingExpiredNotificationBodyiFrame;

    /** Native View GCP Employee Training expired Notification Body Content */
    @FindBy(xpath = "//*[@id='simulated_body']")
    public WebElement nVGCPGCPEmployeeTrainingExpiredNotificationBodyContent;
}
