package ServiceNow.GCP.StepsImplementation;

import ServiceNow.GCP.Constants.GCPNotifications_NativeView_Constants;
import appsCommon.PageInitializer;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.xceptions.TestingException;
import org.openqa.selenium.Keys;

public class GCPNotifications_NativeViewStepImpl extends PageInitializer {

    public static void aUserWithAdminRightsIsInTheNativeView() throws TestingException {
        nativeViewLoginImpl.sideDoorAccountLogin();
        nativeViewImpersonateUser.impersonateAdminUser();
    }

    public static void theUserTypesSystemNotificationsInTheFilterNavigator() {
        nativeViewEnrollementsPage.filterNavigator.clear();
        CommonUtils.waitForVisibility(gCPNotifications_NativeViewPage.nVFilterNavigator);
        CommonUtils.sendKeys(gCPNotifications_NativeViewPage.nVFilterNavigator,GCPNotifications_NativeView_Constants.NATIVE_VIEW_ASSETS_FILTER_NAVIGATION_SEARCH_TEXT_BOX);
        gCPNotifications_NativeViewPage.nVFilterNavigator.click();
        CommonUtils.sendKeys(gCPNotifications_NativeViewPage.nVFilterNavigator, Keys.ENTER);
        CucumberLogUtils.logScreenshot();
    }

    public static void clicksNotificationsUnder(String systemNotification) {
        CommonUtils.waitForVisibility(gCPNotifications_NativeViewPage.nVFilterNavigatorSystemNotificationLabel);
        CommonUtils.assertEqualsWithMessage(gCPNotifications_NativeViewPage.nVFilterNavigatorSystemNotificationLabel.getText(), systemNotification, "--Verify the System Notification Label");
        JavascriptUtils.drawBlueBorder(gCPNotifications_NativeViewPage.nVFilterNavigatorSystemNotificationLabel);
        JavascriptUtils.drawBlueBorder(gCPNotifications_NativeViewPage.nVFilterNavigatorNotificationSubMenu);
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(gCPNotifications_NativeViewPage.nVFilterNavigatorNotificationSubMenu);
        MiscUtils.sleep(5000);
        CucumberLogUtils.logScreenshot();
    }

    public static void searchesGcpEmployeeTrainingExpiredForTheNameFilter() {
        CommonUtils.switchToFrame(etrackAssetsRecords_NativeViewPage.accessRequestIFrame);
        CommonUtils.waitForVisibility(gCPNotifications_NativeViewPage.nVGCPRecordSearchDropDown);
        CommonUtils.selectDropDownValue(gCPNotifications_NativeViewPage.nVGCPRecordSearchDropDown, GCPNotifications_NativeView_Constants.GCP_NATIVE_VIEW_RECORD_SEARCH_DROP_DOWN);
        CommonUtils.sendKeysToElement(gCPNotifications_NativeViewPage.nVGCPSearchTextBox, GCPNotifications_NativeView_Constants.NATIVE_VIEW_GCP_SEARCH_TEXT_BOX_GCP_EMPLOYEE_TRAINING_EXPIRED );
        CommonUtils.sendKeys(gCPNotifications_NativeViewPage.nVGCPSearchTextBox, Keys.ENTER);
        CucumberLogUtils.logScreenshot();
    }

    public static void clicksTheGcpEmployeeTrainingExpiredRecord() {
        CommonUtils.waitForClickability(gCPNotifications_NativeViewPage.nVRecordLocator(GCPNotifications_NativeView_Constants.NATIVE_VIEW_GCP_SEARCH_TEXT_BOX_GCP_EMPLOYEE_TRAINING_EXPIRED));
        CommonUtils.clickOnElement(gCPNotifications_NativeViewPage.nVRecordLocator(GCPNotifications_NativeView_Constants.NATIVE_VIEW_GCP_SEARCH_TEXT_BOX_GCP_EMPLOYEE_TRAINING_EXPIRED));
        CommonUtils.waitForVisibility(gCPNotifications_NativeViewPage.nVOpenRecordButton);
        CommonUtils.clickOnElement(gCPNotifications_NativeViewPage.nVOpenRecordButton);
        CucumberLogUtils.logScreenshot();
    }

    public static void clicksPreviewNotification() {
        CommonUtils.waitForClickability(gCPNotifications_NativeViewPage.nVGCPRecordPreviewNotificationButton);
        JavascriptUtils.drawBlueBorder(gCPNotifications_NativeViewPage.nVGCPRecordPreviewNotificationButton);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(gCPNotifications_NativeViewPage.nVGCPRecordPreviewNotificationButton);
        CommonUtils.waitForVisibility(gCPNotifications_NativeViewPage.nVGCPRecordNotificationPreviewTitle);
        JavascriptUtils.drawBlueBorder(gCPNotifications_NativeViewPage.nVGCPRecordNotificationPreviewTitle);
        CucumberLogUtils.logScreenshot();
        }

    public static void theContentOfTheGCPEmployeeTrainingExpiredNotificationIsSameAsAC() {
        CommonUtils.waitForVisibility(gCPNotifications_NativeViewPage.nVGCPGCPNotificationBodyTitle);
        JavascriptUtils.drawBlueBorder(gCPNotifications_NativeViewPage.nVGCPGCPNotificationBodyTitle);
        CommonUtils.switchToFrame(gCPNotifications_NativeViewPage.nVGCPGCPNotificationBodyiFrame);
        CommonUtils.waitForVisibility(gCPNotifications_NativeViewPage.nVGCPNotificationBodyContent);
        JavascriptUtils.drawBlueBorder(gCPNotifications_NativeViewPage.nVGCPNotificationBodyContent);
        CommonUtils.assertEqualsWithMessage(gCPNotifications_NativeViewPage.nVGCPNotificationBodyContent.getText(), GCPNotifications_NativeView_Constants.NATIVE_VIEW_GCP_EMPLOYEE_TRAINING_EXPIRED_NOTIFICATION_CONTENT, "verifying Notification Content");
        CucumberLogUtils.logScreenshot();
    }

    public static void searchesGcpManagerApprovalNotificationForTheNameFilter() {
        CommonUtils.switchToFrame(etrackAssetsRecords_NativeViewPage.accessRequestIFrame);
        CommonUtils.waitForVisibility(gCPNotifications_NativeViewPage.nVGCPRecordSearchDropDown);
        CommonUtils.selectDropDownValue(gCPNotifications_NativeViewPage.nVGCPRecordSearchDropDown, GCPNotifications_NativeView_Constants.GCP_NATIVE_VIEW_RECORD_SEARCH_DROP_DOWN);
        CommonUtils.sendKeysToElement(gCPNotifications_NativeViewPage.nVGCPSearchTextBox, GCPNotifications_NativeView_Constants.NATIVE_VIEW_GCP_SEARCH_TEXT_BOX_GCP_MANAGER_APPROVAL_NOTIFICATION );
        CommonUtils.sendKeys(gCPNotifications_NativeViewPage.nVGCPSearchTextBox, Keys.ENTER);
        CommonUtils.waitForClickability(gCPNotifications_NativeViewPage.nVGCPSearchResultFirstRow);
        JavascriptUtils.drawBlueBorder(gCPNotifications_NativeViewPage.nVGCPSearchResultFirstRow);
        CucumberLogUtils.logScreenshot();
    }

    public static void clicksTheGcpManagerApprovalNotificationRecord() {
        CommonUtils.waitForClickability(gCPNotifications_NativeViewPage.nVRecordLocator(GCPNotifications_NativeView_Constants.NATIVE_VIEW_GCP_SEARCH_TEXT_BOX_GCP_MANAGER_APPROVAL_NOTIFICATION));
        CommonUtils.clickOnElement(gCPNotifications_NativeViewPage.nVRecordLocator(GCPNotifications_NativeView_Constants.NATIVE_VIEW_GCP_SEARCH_TEXT_BOX_GCP_MANAGER_APPROVAL_NOTIFICATION));
        CommonUtils.waitForVisibility(gCPNotifications_NativeViewPage.nVOpenRecordButton);
        CommonUtils.clickOnElement(gCPNotifications_NativeViewPage.nVOpenRecordButton);
        CucumberLogUtils.logScreenshot();
    }

    public static void theContentOfTheGCPManagerApprovalNotification() {
        CommonUtils.waitForVisibility(gCPNotifications_NativeViewPage.nVGCPGCPNotificationBodyTitle);
        JavascriptUtils.drawBlueBorder(gCPNotifications_NativeViewPage.nVGCPGCPNotificationBodyTitle);
        CommonUtils.switchToFrame(gCPNotifications_NativeViewPage.nVGCPGCPNotificationBodyiFrame);
        CommonUtils.waitForVisibility(gCPNotifications_NativeViewPage.nVGCPNotificationBodyContent);
        JavascriptUtils.drawBlueBorder(gCPNotifications_NativeViewPage.nVGCPNotificationBodyContent);
        CommonUtils.assertEqualsWithMessage(gCPNotifications_NativeViewPage.nVGCPNotificationBodyContent.getText(), GCPNotifications_NativeView_Constants.NATIVE_VIEW_GCP_MANAGER_APPROVAL_APPROVAL_NOTIFICATION_CONTENT, "verifying Notification Content");
        CucumberLogUtils.logScreenshot();
    }
    public static void searchesGcpEmployeeTrainingPastDueForTheNameFilter() {
        CommonUtils.switchToFrame(etrackAssetsRecords_NativeViewPage.accessRequestIFrame);
        CommonUtils.waitForVisibility(gCPNotifications_NativeViewPage.nVGCPRecordSearchDropDown);
        CommonUtils.selectDropDownValue(gCPNotifications_NativeViewPage.nVGCPRecordSearchDropDown, GCPNotifications_NativeView_Constants.GCP_NATIVE_VIEW_RECORD_SEARCH_DROP_DOWN);
        CommonUtils.sendKeysToElement(gCPNotifications_NativeViewPage.nVGCPSearchTextBox, GCPNotifications_NativeView_Constants.NATIVE_VIEW_GCP_SEARCH_TEXT_BOX_GCP_EMPLOYEE_TRAINING_PAST_DUE);
        CommonUtils.sendKeys(gCPNotifications_NativeViewPage.nVGCPSearchTextBox, Keys.ENTER);
        CommonUtils.waitForClickability(gCPNotifications_NativeViewPage.nVGCPSearchResultFirstRow);
        JavascriptUtils.drawBlueBorder(gCPNotifications_NativeViewPage.nVGCPSearchResultFirstRow);
        CucumberLogUtils.logScreenshot();
    }

    public static void clicksTheGcpEmployeeTrainingPastDueNotificationRecord() {
        CommonUtils.waitForClickability(gCPNotifications_NativeViewPage.nVRecordLocator(GCPNotifications_NativeView_Constants.NATIVE_VIEW_GCP_SEARCH_TEXT_BOX_GCP_EMPLOYEE_TRAINING_PAST_DUE));
        CommonUtils.clickOnElement(gCPNotifications_NativeViewPage.nVRecordLocator(GCPNotifications_NativeView_Constants.NATIVE_VIEW_GCP_SEARCH_TEXT_BOX_GCP_EMPLOYEE_TRAINING_PAST_DUE));
        CommonUtils.waitForVisibility(gCPNotifications_NativeViewPage.nVOpenRecordButton);
        CommonUtils.clickOnElement(gCPNotifications_NativeViewPage.nVOpenRecordButton);
        CucumberLogUtils.logScreenshot();
    }

    public static void theContentOfTheGCPEmployeeTrainingPastDueNotification() {
        CommonUtils.waitForVisibility(gCPNotifications_NativeViewPage.nVGCPGCPNotificationBodyTitle);
        JavascriptUtils.drawBlueBorder(gCPNotifications_NativeViewPage.nVGCPGCPNotificationBodyTitle);
        CommonUtils.switchToFrame(gCPNotifications_NativeViewPage.nVGCPGCPNotificationBodyiFrame);
        CommonUtils.waitForVisibility(gCPNotifications_NativeViewPage.nVGCPNotificationBodyContent);
        JavascriptUtils.drawBlueBorder(gCPNotifications_NativeViewPage.nVGCPNotificationBodyContent);
        CommonUtils.assertEqualsWithMessage(gCPNotifications_NativeViewPage.nVGCPNotificationBodyContent.getText(), GCPNotifications_NativeView_Constants.NATIVE_VIEW_GCP_MANAGER_EMPLOYEE_TRAINING_PAST_DUE_NOTIFICATION_CONTENT, "verifying Notification Content");
        CucumberLogUtils.logScreenshot();
    }

    public static void searchesGcpEmployeeTrainingNotificationForTheNameFilter() {
        CommonUtils.switchToFrame(etrackAssetsRecords_NativeViewPage.accessRequestIFrame);
        CommonUtils.waitForVisibility(gCPNotifications_NativeViewPage.nVGCPRecordSearchDropDown);
        CommonUtils.selectDropDownValue(gCPNotifications_NativeViewPage.nVGCPRecordSearchDropDown, GCPNotifications_NativeView_Constants.GCP_NATIVE_VIEW_RECORD_SEARCH_DROP_DOWN);
        CommonUtils.sendKeysToElement(gCPNotifications_NativeViewPage.nVGCPSearchTextBox, GCPNotifications_NativeView_Constants.NATIVE_VIEW_GCP_SEARCH_TEXT_BOX_GCP_EMPLOYEE_TRAINING_NOTIFICATION);
        CommonUtils.sendKeys(gCPNotifications_NativeViewPage.nVGCPSearchTextBox, Keys.ENTER);
        CommonUtils.waitForClickability(gCPNotifications_NativeViewPage.nVGCPSearchResultFirstRow);
        JavascriptUtils.drawBlueBorder(gCPNotifications_NativeViewPage.nVGCPSearchResultFirstRow);
        CucumberLogUtils.logScreenshot();
    }

    public static void clicksTheGcpEmployeeTrainingNotificationRecord() {
        CommonUtils.waitForClickability(gCPNotifications_NativeViewPage.nVRecordLocator(GCPNotifications_NativeView_Constants.NATIVE_VIEW_GCP_SEARCH_TEXT_BOX_GCP_EMPLOYEE_TRAINING_NOTIFICATION));
        CommonUtils.clickOnElement(gCPNotifications_NativeViewPage.nVRecordLocator(GCPNotifications_NativeView_Constants.NATIVE_VIEW_GCP_SEARCH_TEXT_BOX_GCP_EMPLOYEE_TRAINING_NOTIFICATION));
        CommonUtils.waitForVisibility(gCPNotifications_NativeViewPage.nVOpenRecordButton);
        CommonUtils.clickOnElement(gCPNotifications_NativeViewPage.nVOpenRecordButton);
        CucumberLogUtils.logScreenshot();
    }

    public static void theContentOfTheGCPEmployeeTrainingNotification() {
        CommonUtils.waitForVisibility(gCPNotifications_NativeViewPage.nVGCPGCPNotificationBodyTitle);
        JavascriptUtils.drawBlueBorder(gCPNotifications_NativeViewPage.nVGCPGCPNotificationBodyTitle);
        CommonUtils.switchToFrame(gCPNotifications_NativeViewPage.nVGCPGCPNotificationBodyiFrame);
        CommonUtils.waitForVisibility(gCPNotifications_NativeViewPage.nVGCPNotificationBodyContent);
        JavascriptUtils.drawBlueBorder(gCPNotifications_NativeViewPage.nVGCPNotificationBodyContent);
        CommonUtils.assertEqualsWithMessage(gCPNotifications_NativeViewPage.nVGCPNotificationBodyContent.getText(), GCPNotifications_NativeView_Constants.NATIVE_VIEW_GCP_MANAGER_EMPLOYEE_TRAINING_NOTIFICATION_CONTENT, "verifying Notification Content");
        CucumberLogUtils.logScreenshot();
    }

    public static void searchesGcpEmployeeTrainingExpiresInaMonthForTheNameFilter() {
        CommonUtils.switchToFrame(etrackAssetsRecords_NativeViewPage.accessRequestIFrame);
        CommonUtils.waitForVisibility(gCPNotifications_NativeViewPage.nVGCPRecordSearchDropDown);
        CommonUtils.selectDropDownValue(gCPNotifications_NativeViewPage.nVGCPRecordSearchDropDown, GCPNotifications_NativeView_Constants.GCP_NATIVE_VIEW_RECORD_SEARCH_DROP_DOWN);
        CommonUtils.sendKeysToElement(gCPNotifications_NativeViewPage.nVGCPSearchTextBox, GCPNotifications_NativeView_Constants.NATIVE_VIEW_GCP_SEARCH_TEXT_BOX_GCP_EMPLOYEE_TRAINING_EXPIRED_IN_A_MONTH);
        CommonUtils.sendKeys(gCPNotifications_NativeViewPage.nVGCPSearchTextBox, Keys.ENTER);
        CommonUtils.waitForClickability(gCPNotifications_NativeViewPage.nVGCPSearchResultFirstRow);
        JavascriptUtils.drawBlueBorder(gCPNotifications_NativeViewPage.nVGCPSearchResultFirstRow);
        CucumberLogUtils.logScreenshot();
    }

    public static void clicksTheGcpEmployeeTrainingExpiresInaMonthNotificationRecord() {
        CommonUtils.waitForClickability(gCPNotifications_NativeViewPage.nVRecordLocator(GCPNotifications_NativeView_Constants.NATIVE_VIEW_GCP_SEARCH_TEXT_BOX_GCP_EMPLOYEE_TRAINING_EXPIRED_IN_A_MONTH));
        CommonUtils.clickOnElement(gCPNotifications_NativeViewPage.nVRecordLocator(GCPNotifications_NativeView_Constants.NATIVE_VIEW_GCP_SEARCH_TEXT_BOX_GCP_EMPLOYEE_TRAINING_EXPIRED_IN_A_MONTH));
        CommonUtils.waitForVisibility(gCPNotifications_NativeViewPage.nVOpenRecordButton);
        CommonUtils.clickOnElement(gCPNotifications_NativeViewPage.nVOpenRecordButton);
        CucumberLogUtils.logScreenshot();
    }

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
