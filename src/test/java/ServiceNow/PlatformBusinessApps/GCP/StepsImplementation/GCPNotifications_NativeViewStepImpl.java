package ServiceNow.PlatformBusinessApps.GCP.StepsImplementation;

import ServiceNow.PlatformBusinessApps.GCP.Constants.GCPNotifications_NativeView_Constants;
import appsCommon.Pages.NativeView_SideDoor_Dashboard_Page;
import appsCommon.Utils.ServiceNow_Common_Methods;
import appsCommon.Utils.ServiceNow_Login_Methods;
import appsCommon.PageInitializers.PageInitializer;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.Keys;

public class GCPNotifications_NativeViewStepImpl extends PageInitializer {

    /**
     * This method navigate to the notifications page in the native view for a user with admin rights.
     */
    public static void aUserWithAdminRightsGoToNotificationsIsInTheNativeView() {
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        ServiceNow_Common_Methods.impersonateAnyUser("songjay@nih.gov");
        MiscUtils.sleep(1000);
        CucumberLogUtils.logScreenshot();
        MiscUtils.sleep(2000);
        WebDriverUtils.webDriver.get(GCPNotifications_NativeView_Constants.GCP_NATIVE_VIEW_NOTIFICATIONS_UNDER_SYSTEM_NOTIFICATION_URL);
//        WebDriverUtils.webDriver.get(GCPNotifications_NativeView_Constants.GCP_SAND_BOX_NATIVE_VIEW_NOTIFICATIONS_UNDER_SYSTEM_NOTIFICATION_URL);
        MiscUtils.sleep(3000);
        CommonUtils.switchToFrame(NativeView_SideDoor_Dashboard_Page.nativeViewiFrame);
        MiscUtils.sleep(2000);
    }

    /**
     * This method searches for "GCP Employee Training expired" notification in GCP application.
     */
    public static void searchesGcpEmployeeTrainingExpiredForTheNameFilter() {
        CommonUtils.waitForVisibility(gCPNotifications_NativeViewPage.nVGCPRecordSearchDropDown);
        CommonUtils.selectDropDownValue(gCPNotifications_NativeViewPage.nVGCPRecordSearchDropDown, GCPNotifications_NativeView_Constants.GCP_NATIVE_VIEW_RECORD_SEARCH_DROP_DOWN);
        CommonUtils.sendKeysToElement(gCPNotifications_NativeViewPage.nVGCPSearchTextBox, GCPNotifications_NativeView_Constants.NATIVE_VIEW_GCP_SEARCH_TEXT_BOX_GCP_EMPLOYEE_TRAINING_EXPIRED );
        CommonUtils.sendKeys(gCPNotifications_NativeViewPage.nVGCPSearchTextBox, Keys.ENTER);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method clicks on the preview button for "GCP Employee Training expired" notification in GCP application.
     */
    public static void userClicksThePreviewNotificationButtonForGcpEmployeeTrainingExpiredRecord() {
        CommonUtils.hoverOverElement(gCPNotifications_NativeViewPage.nVRecordName(GCPNotifications_NativeView_Constants.NATIVE_VIEW_GCP_SEARCH_TEXT_BOX_GCP_EMPLOYEE_TRAINING_EXPIRED));
        CommonUtils.waitForClickability(gCPNotifications_NativeViewPage.nVRecordLocator(GCPNotifications_NativeView_Constants.NATIVE_VIEW_GCP_SEARCH_TEXT_BOX_GCP_EMPLOYEE_TRAINING_EXPIRED));
        CommonUtils.clickOnElement(gCPNotifications_NativeViewPage.nVRecordLocator(GCPNotifications_NativeView_Constants.NATIVE_VIEW_GCP_SEARCH_TEXT_BOX_GCP_EMPLOYEE_TRAINING_EXPIRED));
        CommonUtils.waitForVisibility(gCPNotifications_NativeViewPage.nVOpenRecordButton);
        CommonUtils.clickOnElement(gCPNotifications_NativeViewPage.nVOpenRecordButton);
        CucumberLogUtils.logScreenshot();
        CommonUtils.waitForClickability(gCPNotifications_NativeViewPage.nVGCPRecordPreviewNotificationButton);
        JavascriptUtils.drawBlueBorder(gCPNotifications_NativeViewPage.nVGCPRecordPreviewNotificationButton);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(gCPNotifications_NativeViewPage.nVGCPRecordPreviewNotificationButton);
        CommonUtils.waitForVisibility(gCPNotifications_NativeViewPage.nVGCPRecordNotificationPreviewTitle);
        JavascriptUtils.drawBlueBorder(gCPNotifications_NativeViewPage.nVGCPRecordNotificationPreviewTitle);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method verifies that the content of the "GCP Employee Training expired" notification is the same as expected.
     */
    public static void theContentOfTheGCPEmployeeTrainingExpiredNotificationIsSameAsAC() {
        CommonUtils.waitForVisibility(gCPNotifications_NativeViewPage.nVGCPGCPNotificationBodyTitle);
        JavascriptUtils.drawBlueBorder(gCPNotifications_NativeViewPage.nVGCPGCPNotificationBodyTitle);
        CommonUtils.switchToFrame(gCPNotifications_NativeViewPage.nVGCPGCPNotificationBodyiFrame);
        CommonUtils.waitForVisibility(gCPNotifications_NativeViewPage.nVGCPNotificationBodyContent);
        JavascriptUtils.drawBlueBorder(gCPNotifications_NativeViewPage.nVGCPNotificationBodyContent);
        CommonUtils.assertEqualsWithMessage(gCPNotifications_NativeViewPage.nVGCPNotificationBodyContent.getText(), GCPNotifications_NativeView_Constants.NATIVE_VIEW_GCP_EMPLOYEE_TRAINING_EXPIRED_NOTIFICATION_CONTENT, "verifying Notification Content");
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method searches for "GCP Manager Approval Notification" Notification.
     */
    public static void searchesGcpManagerApprovalNotificationForTheNameFilter() {
        CommonUtils.waitForVisibility(gCPNotifications_NativeViewPage.nVGCPRecordSearchDropDown);
        CommonUtils.selectDropDownValue(gCPNotifications_NativeViewPage.nVGCPRecordSearchDropDown, GCPNotifications_NativeView_Constants.GCP_NATIVE_VIEW_RECORD_SEARCH_DROP_DOWN);
        CommonUtils.sendKeysToElement(gCPNotifications_NativeViewPage.nVGCPSearchTextBox, GCPNotifications_NativeView_Constants.NATIVE_VIEW_GCP_SEARCH_TEXT_BOX_GCP_MANAGER_APPROVAL_NOTIFICATION );
        CommonUtils.sendKeys(gCPNotifications_NativeViewPage.nVGCPSearchTextBox, Keys.ENTER);
        CommonUtils.waitForClickability(gCPNotifications_NativeViewPage.nVGCPSearchResultFirstRow);
        JavascriptUtils.drawBlueBorder(gCPNotifications_NativeViewPage.nVGCPSearchResultFirstRow);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method clicks on the preview button for "GCP Manager Approval Notification" notification in GCP application.
     */
    public static void userClicksThePreviewNotificationButtonGcpManagerApprovalNotificationRecord() {
        CommonUtils.hoverOverElement(gCPNotifications_NativeViewPage.nVRecordName(GCPNotifications_NativeView_Constants.NATIVE_VIEW_GCP_SEARCH_TEXT_BOX_GCP_MANAGER_APPROVAL_NOTIFICATION));
        CommonUtils.waitForClickability(gCPNotifications_NativeViewPage.nVRecordLocator(GCPNotifications_NativeView_Constants.NATIVE_VIEW_GCP_SEARCH_TEXT_BOX_GCP_MANAGER_APPROVAL_NOTIFICATION));
        CommonUtils.clickOnElement(gCPNotifications_NativeViewPage.nVRecordLocator(GCPNotifications_NativeView_Constants.NATIVE_VIEW_GCP_SEARCH_TEXT_BOX_GCP_MANAGER_APPROVAL_NOTIFICATION));
        CommonUtils.waitForVisibility(gCPNotifications_NativeViewPage.nVOpenRecordButton);
        CommonUtils.clickOnElement(gCPNotifications_NativeViewPage.nVOpenRecordButton);
        CucumberLogUtils.logScreenshot();
        CommonUtils.waitForClickability(gCPNotifications_NativeViewPage.nVGCPRecordPreviewNotificationButton);
        JavascriptUtils.drawBlueBorder(gCPNotifications_NativeViewPage.nVGCPRecordPreviewNotificationButton);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(gCPNotifications_NativeViewPage.nVGCPRecordPreviewNotificationButton);
        CommonUtils.waitForVisibility(gCPNotifications_NativeViewPage.nVGCPRecordNotificationPreviewTitle);
        JavascriptUtils.drawBlueBorder(gCPNotifications_NativeViewPage.nVGCPRecordNotificationPreviewTitle);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method verifies that the content of the "GCP Manager Approval Notification" notification is the same as expected.
     */
    public static void theContentOfTheGCPManagerApprovalNotification() {
        CommonUtils.waitForVisibility(gCPNotifications_NativeViewPage.nVGCPGCPNotificationBodyTitle);
        JavascriptUtils.drawBlueBorder(gCPNotifications_NativeViewPage.nVGCPGCPNotificationBodyTitle);
        CommonUtils.switchToFrame(gCPNotifications_NativeViewPage.nVGCPGCPNotificationBodyiFrame);
        CommonUtils.waitForVisibility(gCPNotifications_NativeViewPage.nVGCPNotificationBodyContent);
        JavascriptUtils.drawBlueBorder(gCPNotifications_NativeViewPage.nVGCPNotificationBodyContent);
        CommonUtils.assertEqualsWithMessage(gCPNotifications_NativeViewPage.nVGCPNotificationBodyContent.getText(), GCPNotifications_NativeView_Constants.NATIVE_VIEW_GCP_MANAGER_APPROVAL_APPROVAL_NOTIFICATION_CONTENT, "verifying Notification Content");
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method searches for "GCP Employee Training Past Due" notification.
     */
    public static void searchesGcpEmployeeTrainingPastDueForTheNameFilter() {
        CommonUtils.waitForVisibility(gCPNotifications_NativeViewPage.nVGCPRecordSearchDropDown);
        CommonUtils.selectDropDownValue(gCPNotifications_NativeViewPage.nVGCPRecordSearchDropDown, GCPNotifications_NativeView_Constants.GCP_NATIVE_VIEW_RECORD_SEARCH_DROP_DOWN);
        CommonUtils.sendKeysToElement(gCPNotifications_NativeViewPage.nVGCPSearchTextBox, GCPNotifications_NativeView_Constants.NATIVE_VIEW_GCP_SEARCH_TEXT_BOX_GCP_EMPLOYEE_TRAINING_PAST_DUE);
        CommonUtils.sendKeys(gCPNotifications_NativeViewPage.nVGCPSearchTextBox, Keys.ENTER);
        CommonUtils.waitForClickability(gCPNotifications_NativeViewPage.nVGCPSearchResultFirstRow);
        JavascriptUtils.drawBlueBorder(gCPNotifications_NativeViewPage.nVGCPSearchResultFirstRow);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method clicks on the preview button for the GCP Employee Training Past Due notification record.
     */
    public static void userClicksThePreviewNotificationButtonForTheGcpEmployeeTrainingPastDueNotificationRecord() {
        CommonUtils.hoverOverElement(gCPNotifications_NativeViewPage.nVRecordName(GCPNotifications_NativeView_Constants.NATIVE_VIEW_GCP_SEARCH_TEXT_BOX_GCP_EMPLOYEE_TRAINING_PAST_DUE));
        CommonUtils.waitForClickability(gCPNotifications_NativeViewPage.nVRecordLocator(GCPNotifications_NativeView_Constants.NATIVE_VIEW_GCP_SEARCH_TEXT_BOX_GCP_EMPLOYEE_TRAINING_PAST_DUE));
        CommonUtils.clickOnElement(gCPNotifications_NativeViewPage.nVRecordLocator(GCPNotifications_NativeView_Constants.NATIVE_VIEW_GCP_SEARCH_TEXT_BOX_GCP_EMPLOYEE_TRAINING_PAST_DUE));
        CommonUtils.waitForVisibility(gCPNotifications_NativeViewPage.nVOpenRecordButton);
        CommonUtils.clickOnElement(gCPNotifications_NativeViewPage.nVOpenRecordButton);
        CucumberLogUtils.logScreenshot();
        CommonUtils.waitForClickability(gCPNotifications_NativeViewPage.nVGCPRecordPreviewNotificationButton);
        JavascriptUtils.drawBlueBorder(gCPNotifications_NativeViewPage.nVGCPRecordPreviewNotificationButton);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(gCPNotifications_NativeViewPage.nVGCPRecordPreviewNotificationButton);
        CommonUtils.waitForVisibility(gCPNotifications_NativeViewPage.nVGCPRecordNotificationPreviewTitle);
        JavascriptUtils.drawBlueBorder(gCPNotifications_NativeViewPage.nVGCPRecordNotificationPreviewTitle);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method is used to verify the content of the "GCP Employee Training Past Due" notification in the GCP application.
     */
    public static void theContentOfTheGCPEmployeeTrainingPastDueNotification() {
        CommonUtils.waitForVisibility(gCPNotifications_NativeViewPage.nVGCPGCPNotificationBodyTitle);
        JavascriptUtils.drawBlueBorder(gCPNotifications_NativeViewPage.nVGCPGCPNotificationBodyTitle);
        CommonUtils.switchToFrame(gCPNotifications_NativeViewPage.nVGCPGCPNotificationBodyiFrame);
        CommonUtils.waitForVisibility(gCPNotifications_NativeViewPage.nVGCPNotificationBodyContent);
        JavascriptUtils.drawBlueBorder(gCPNotifications_NativeViewPage.nVGCPNotificationBodyContent);
        CommonUtils.assertEqualsWithMessage(gCPNotifications_NativeViewPage.nVGCPNotificationBodyContent.getText(), GCPNotifications_NativeView_Constants.NATIVE_VIEW_GCP_MANAGER_EMPLOYEE_TRAINING_PAST_DUE_NOTIFICATION_CONTENT, "verifying Notification Content");
        CucumberLogUtils.logScreenshot();
    }

    /**
     * Searches for "GCP Employee Training Notification" notification.
     */
    public static void searchesGcpEmployeeTrainingNotificationForTheNameFilter() {
        CommonUtils.waitForVisibility(gCPNotifications_NativeViewPage.nVGCPRecordSearchDropDown);
        CommonUtils.selectDropDownValue(gCPNotifications_NativeViewPage.nVGCPRecordSearchDropDown, GCPNotifications_NativeView_Constants.GCP_NATIVE_VIEW_RECORD_SEARCH_DROP_DOWN);
        CommonUtils.sendKeysToElement(gCPNotifications_NativeViewPage.nVGCPSearchTextBox, GCPNotifications_NativeView_Constants.NATIVE_VIEW_GCP_SEARCH_TEXT_BOX_GCP_EMPLOYEE_TRAINING_NOTIFICATION);
        CommonUtils.sendKeys(gCPNotifications_NativeViewPage.nVGCPSearchTextBox, Keys.ENTER);
        CommonUtils.waitForClickability(gCPNotifications_NativeViewPage.nVGCPSearchResultFirstRow);
        JavascriptUtils.drawBlueBorder(gCPNotifications_NativeViewPage.nVGCPSearchResultFirstRow);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method clicks on the preview button for "the GCP Employee Training Notification" notification record.
     */
    public static void userClicksThePreviewNotificationButtonForGcpEmployeeTrainingNotificationRecord() {
        CommonUtils.hoverOverElement(gCPNotifications_NativeViewPage.nVRecordName(GCPNotifications_NativeView_Constants.NATIVE_VIEW_GCP_SEARCH_TEXT_BOX_GCP_EMPLOYEE_TRAINING_NOTIFICATION));
        CommonUtils.waitForClickability(gCPNotifications_NativeViewPage.nVRecordLocator(GCPNotifications_NativeView_Constants.NATIVE_VIEW_GCP_SEARCH_TEXT_BOX_GCP_EMPLOYEE_TRAINING_NOTIFICATION));
        CommonUtils.clickOnElement(gCPNotifications_NativeViewPage.nVRecordLocator(GCPNotifications_NativeView_Constants.NATIVE_VIEW_GCP_SEARCH_TEXT_BOX_GCP_EMPLOYEE_TRAINING_NOTIFICATION));
        CommonUtils.waitForVisibility(gCPNotifications_NativeViewPage.nVOpenRecordButton);
        CommonUtils.clickOnElement(gCPNotifications_NativeViewPage.nVOpenRecordButton);
        CucumberLogUtils.logScreenshot();
        CommonUtils.waitForClickability(gCPNotifications_NativeViewPage.nVGCPRecordPreviewNotificationButton);
        JavascriptUtils.drawBlueBorder(gCPNotifications_NativeViewPage.nVGCPRecordPreviewNotificationButton);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(gCPNotifications_NativeViewPage.nVGCPRecordPreviewNotificationButton);
        CommonUtils.waitForVisibility(gCPNotifications_NativeViewPage.nVGCPRecordNotificationPreviewTitle);
        JavascriptUtils.drawBlueBorder(gCPNotifications_NativeViewPage.nVGCPRecordNotificationPreviewTitle);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method is used to verify the content of the "GCP Employee Training Notification" notification in the GCP application.
     */
    public static void theContentOfTheGCPEmployeeTrainingNotification() {
        CommonUtils.waitForVisibility(gCPNotifications_NativeViewPage.nVGCPGCPNotificationBodyTitle);
        JavascriptUtils.drawBlueBorder(gCPNotifications_NativeViewPage.nVGCPGCPNotificationBodyTitle);
        CommonUtils.switchToFrame(gCPNotifications_NativeViewPage.nVGCPGCPNotificationBodyiFrame);
        CommonUtils.waitForVisibility(gCPNotifications_NativeViewPage.nVGCPNotificationBodyContent);
        JavascriptUtils.drawBlueBorder(gCPNotifications_NativeViewPage.nVGCPNotificationBodyContent);
        CommonUtils.assertEqualsWithMessage(gCPNotifications_NativeViewPage.nVGCPNotificationBodyContent.getText(), GCPNotifications_NativeView_Constants.NATIVE_VIEW_GCP_MANAGER_EMPLOYEE_TRAINING_NOTIFICATION_CONTENT, "verifying Notification Content");
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method searches for "GCP Employee Training expires in a Month" notification.
     */
    public static void searchesGcpEmployeeTrainingExpiresInaMonthForTheNameFilter() {
        CommonUtils.waitForVisibility(gCPNotifications_NativeViewPage.nVGCPRecordSearchDropDown);
        CommonUtils.selectDropDownValue(gCPNotifications_NativeViewPage.nVGCPRecordSearchDropDown, GCPNotifications_NativeView_Constants.GCP_NATIVE_VIEW_RECORD_SEARCH_DROP_DOWN);
        CommonUtils.sendKeysToElement(gCPNotifications_NativeViewPage.nVGCPSearchTextBox, GCPNotifications_NativeView_Constants.NATIVE_VIEW_GCP_SEARCH_TEXT_BOX_GCP_EMPLOYEE_TRAINING_EXPIRED_IN_A_MONTH);
        CommonUtils.sendKeys(gCPNotifications_NativeViewPage.nVGCPSearchTextBox, Keys.ENTER);
        CommonUtils.waitForClickability(gCPNotifications_NativeViewPage.nVGCPSearchResultFirstRow);
        JavascriptUtils.drawBlueBorder(gCPNotifications_NativeViewPage.nVGCPSearchResultFirstRow);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method clicks the preview notification button for the "GCP Employee Training Expires In a Month" notification record.
     */
    public static void userClicksThePreviewNotificationButtonForGcpEmployeeTrainingExpiresInaMonthNotificationRecord() {
        CommonUtils.hoverOverElement(gCPNotifications_NativeViewPage.nVRecordName(GCPNotifications_NativeView_Constants.NATIVE_VIEW_GCP_SEARCH_TEXT_BOX_GCP_EMPLOYEE_TRAINING_EXPIRED_IN_A_MONTH));
        CommonUtils.waitForClickability(gCPNotifications_NativeViewPage.nVRecordLocator(GCPNotifications_NativeView_Constants.NATIVE_VIEW_GCP_SEARCH_TEXT_BOX_GCP_EMPLOYEE_TRAINING_EXPIRED_IN_A_MONTH));
        CommonUtils.clickOnElement(gCPNotifications_NativeViewPage.nVRecordLocator(GCPNotifications_NativeView_Constants.NATIVE_VIEW_GCP_SEARCH_TEXT_BOX_GCP_EMPLOYEE_TRAINING_EXPIRED_IN_A_MONTH));
        CommonUtils.waitForVisibility(gCPNotifications_NativeViewPage.nVOpenRecordButton);
        CommonUtils.clickOnElement(gCPNotifications_NativeViewPage.nVOpenRecordButton);
        CucumberLogUtils.logScreenshot();
        CommonUtils.waitForClickability(gCPNotifications_NativeViewPage.nVGCPRecordPreviewNotificationButton);
        JavascriptUtils.drawBlueBorder(gCPNotifications_NativeViewPage.nVGCPRecordPreviewNotificationButton);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(gCPNotifications_NativeViewPage.nVGCPRecordPreviewNotificationButton);
        CommonUtils.waitForVisibility(gCPNotifications_NativeViewPage.nVGCPRecordNotificationPreviewTitle);
        JavascriptUtils.drawBlueBorder(gCPNotifications_NativeViewPage.nVGCPRecordNotificationPreviewTitle);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method is used to verify the content of the "GCP Employee Training Expires In a Month" notification in the GCP application.
     */
    public static void theContentOfTheGCPEmployeeTrainingExpiresInaMonthNotification() {
        CommonUtils.waitForVisibility(gCPNotifications_NativeViewPage.nVGCPGCPNotificationBodyTitle);
        JavascriptUtils.drawBlueBorder(gCPNotifications_NativeViewPage.nVGCPGCPNotificationBodyTitle);
        CommonUtils.switchToFrame(gCPNotifications_NativeViewPage.nVGCPGCPNotificationBodyiFrame);
        CommonUtils.waitForVisibility(gCPNotifications_NativeViewPage.nVGCPNotificationBodyContent);
        JavascriptUtils.drawBlueBorder(gCPNotifications_NativeViewPage.nVGCPNotificationBodyContent);
        CommonUtils.assertEqualsWithMessage(gCPNotifications_NativeViewPage.nVGCPNotificationBodyContent.getText(), GCPNotifications_NativeView_Constants.NATIVE_VIEW_GCP_MANAGER_EMPLOYEE_TRAINING_EXPIRES_IN_A_MONTH_NOTIFICATION_CONTENT, "verifying Notification Content");
        CucumberLogUtils.logScreenshot();
    }
}