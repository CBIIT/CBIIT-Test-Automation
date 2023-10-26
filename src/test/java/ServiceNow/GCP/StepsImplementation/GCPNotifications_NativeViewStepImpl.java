package ServiceNow.GCP.StepsImplementation;

import ServiceNow.GCP.Constants.GCPNotifications_NativeView_Constants;
import appsCommon.Utils.ServiceNow_Login_Methods;
import appsCommon.PageInitializers.PageInitializer;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.xceptions.TestingException;
import org.openqa.selenium.Keys;

public class GCPNotifications_NativeViewStepImpl extends PageInitializer {

    public static void aUserWithAdminRightsIsInTheNativeView() throws TestingException {
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        nativeViewImpersonateUser.impersonateAdminUser();
    }

    public static void theUserTypesSystemNotificationsInTheFilterNavigator() {
        nativeViewEnrollementsPage.filterNavigator.clear();
        CommonUtils.waitForVisibility(gCPNotifications_NativeViewPage.nVFilterNavigator);
        CommonUtils.sendKeys(gCPNotifications_NativeViewPage.nVFilterNavigator,GCPNotifications_NativeView_Constants.NATIVE_VIEW_ASSETS_FILTER_NAVIGATION_SEARCH_TEXT_BOX);
        gCPNotifications_NativeViewPage.nVFilterNavigator.click();
        CommonUtils.sendKeys(gCPNotifications_NativeViewPage.nVFilterNavigator, Keys.ENTER);
    }

    public static void clicksNotificationsUnder(String systemNotification) {
        CommonUtils.waitForVisibility(gCPNotifications_NativeViewPage.nVFilterNavigatorSystemNotificationLabel);
        CommonUtils.assertEqualsWithMessage(gCPNotifications_NativeViewPage.nVFilterNavigatorSystemNotificationLabel.getText(), systemNotification, "--Verify the System Notification Label");
        JavascriptUtils.drawBlueBorder(gCPNotifications_NativeViewPage.nVFilterNavigatorSystemNotificationLabel);
        JavascriptUtils.drawBlueBorder(gCPNotifications_NativeViewPage.nVFilterNavigatorNotificationSubMenu);
        JavascriptUtils.clickByJS(gCPNotifications_NativeViewPage.nVFilterNavigatorNotificationSubMenu);
        MiscUtils.sleep(5000);
    }

    public static void searchesGcpEmployeeTrainingExpiredForTheNameFilter() {
        CommonUtils.switchToFrame(etrackAssetsRecords_NativeViewPage.accessRequestIFrame);
        CommonUtils.waitForVisibility(gCPNotifications_NativeViewPage.nVGCPRecordSearchDropDown);
        CommonUtils.selectDropDownValue(gCPNotifications_NativeViewPage.nVGCPRecordSearchDropDown, GCPNotifications_NativeView_Constants.GCP_NATIVE_VIEW_RECORD_SEARCH_DROP_DOWN);
        CommonUtils.sendKeysToElement(gCPNotifications_NativeViewPage.nVGCPSearchTextBox, GCPNotifications_NativeView_Constants.NATIVE_VIEW_GCP_SEARCH_TEXT_BOX );
        CommonUtils.sendKeys(gCPNotifications_NativeViewPage.nVGCPSearchTextBox, Keys.ENTER);
    }

    public static void clicksTheGcpEmployeeTrainingExpiredRecord() {
        CommonUtils.waitForClickability(gCPNotifications_NativeViewPage.nVRecordLocator(GCPNotifications_NativeView_Constants.NATIVE_VIEW_GCP_SEARCH_TEXT_BOX));
        CommonUtils.clickOnElement(gCPNotifications_NativeViewPage.nVRecordLocator(GCPNotifications_NativeView_Constants.NATIVE_VIEW_GCP_SEARCH_TEXT_BOX));
        CommonUtils.waitForVisibility(gCPNotifications_NativeViewPage.nVOpenRecordButton);
        CommonUtils.clickOnElement(gCPNotifications_NativeViewPage.nVOpenRecordButton);
    }

    public static void clicksPreviewNotification() {
        CommonUtils.waitForClickability(gCPNotifications_NativeViewPage.nVGCPRecordPreviewNotificationButton);
        CommonUtils.clickOnElement(gCPNotifications_NativeViewPage.nVGCPRecordPreviewNotificationButton);
        CommonUtils.waitForVisibility(gCPNotifications_NativeViewPage.nVGCPRecordNotificationPreviewTitle);
        JavascriptUtils.drawBlueBorder(gCPNotifications_NativeViewPage.nVGCPRecordNotificationPreviewTitle);
        }

    public static void theContentOfTheGCPEmployeeTrainingExpiredNotificationIsSameAsAC() {
        CommonUtils.waitForVisibility(gCPNotifications_NativeViewPage.nVGCPGCPEmployeeTrainingExpiredNotificationBodyTitle);
        JavascriptUtils.drawBlueBorder(gCPNotifications_NativeViewPage.nVGCPGCPEmployeeTrainingExpiredNotificationBodyTitle);
        CommonUtils.switchToFrame(gCPNotifications_NativeViewPage.nVGCPGCPEmployeeTrainingExpiredNotificationBodyiFrame);
        CommonUtils.waitForVisibility(gCPNotifications_NativeViewPage.nVGCPGCPEmployeeTrainingExpiredNotificationBodyContent);
        JavascriptUtils.drawBlueBorder(gCPNotifications_NativeViewPage.nVGCPGCPEmployeeTrainingExpiredNotificationBodyContent);
        CommonUtils.assertEqualsWithMessage(gCPNotifications_NativeViewPage.nVGCPGCPEmployeeTrainingExpiredNotificationBodyContent.getText(), GCPNotifications_NativeView_Constants.NATIVE_VIEW_GCP_EMPLOYEE_TRAINING_EXPIRED_NOTIFICATION_CONTENT, "verifying Notification Content");
    }
}
