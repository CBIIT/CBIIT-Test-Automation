package CHARMS.stepsImplementation;

import APPS_COMMON.Pages.NativeView_SideDoor_Dashboard_Page;
import APPS_COMMON.Utils.ServiceNow_Common_Methods;
import APPS_COMMON.Utils.ServiceNow_Login_Methods;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.TestProperties;
import com.nci.automation.web.WebDriverUtils;
import APPS_COMMON.PageInitializers.PageInitializer;

public class TestAccountResetImpl extends PageInitializer {

    /**
     * This method resets RASopathy Study Test Account Call this method at the end
     * of your test case to rerun test case with same test account
     *
     * @
     */

    public void resetTestAccountSignIn()  {
        if (TestProperties.ENV.equals("test")) {
            ServiceNow_Login_Methods.nativeViewSideDoorLogin();
            WebDriverUtils.webDriver.get(
                    "https://service-test.nci.nih.gov/sys_script_fix.do?sys_id=a32b45c21be638106daea681f54bcb81&sysparm_view=&sysparm_domain=null&sysparm_domain_scope=null&sysparm_record_row=1&sysparm_record_rows=940&sysparm_record_list=ORDERBYDESCsys_updated_on");
            CommonUtils.sleep(2000);
        } else if (TestProperties.ENV.equals("dev2")) {
            ServiceNow_Login_Methods.nativeViewSideDoorLogin();
            WebDriverUtils.webDriver.get(
                    "https://service-dev2.nci.nih.gov/now/nav/ui/classic/params/target/sys_script_fix.do%3Fsys_id%3Da32b45c21be638106daea681f54bcb81%26sysparm_record_target%3Dsys_script_fix%26sysparm_record_row%3D5%26sysparm_record_rows%3D13%26sysparm_record_list%3DnameCONTAINSreset%255EORDERBYsys_scope");
            CommonUtils.sleep(2000);
        }

    }

    public void resetTestAccount() {
        if(TestProperties.ENV.equals("test")){
            CommonUtils.sleep(2000);
            CommonUtils.waitForVisibility(testAccountResetPage.nativeViewRunFixScriptButton);
            CommonUtils.sleep(2000);
            testAccountResetPage.nativeViewRunFixScriptButton.click();
            CommonUtils.sleep(1000);
            CommonUtils.waitForVisibility(testAccountResetPage.nativeViewProceedInBackgroundButton);
            testAccountResetPage.nativeViewProceedInBackgroundButton.click();
            CommonUtils.sleep(10000);
        }
    }

    /**
     * Resets the RASopathy Study Test Account by performing the following steps:
     * 1. Calls the nativeViewSideDoorLogin method from ServiceNow_Login_Methods class to log in using the side door test account.
     * 2. Navigates to the specified URL (https://service-test.nci.nih.gov/now/nav/ui/classic/params/target/sys_script_fix.do%3Fsys_id%3D6b09648c877fc6507e87a8a60cbb35f2%26sysparm
     * _view%3D%26sysparm_domain%3Dnull%26sysparm_domain_scope%3Dnull) in the web driver.
     * 3. Sleeps for 2000 milliseconds.
     * 4. Waits for the visibility of the nativeViewRunFixScriptButton on the testAccountResetPage.
     * 5. Sleeps for 2000 milliseconds.
     * 6. Clicks on the nativeViewRunFixScriptButton.
     * 7. Sleeps for 1000 milliseconds.
     * 8. Waits for the visibility of the nativeViewProceedInBackgroundButton on the testAccountResetPage.
     * 9. Clicks on the nativeViewProceedInBackgroundButton.
     * 10. Sleeps for 10000 milliseconds.
     * 11. Calls the logOutOfNativeView method from ServiceNow_Common_Methods class to log out of native view.
     */
    public static void charmsRasOneTestAccountReset(){
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        WebDriverUtils.webDriver.get(
                "https://service-test.nci.nih.gov/nav_to.do?uri=sys_script_fix.do?sys_id=a3ee10cc8790d610ad46326d3fbb350a");
        CommonUtils.sleep(2000);
        CucumberLogUtils.logScreenshot();
        CommonUtils.switchToFrame(NativeView_SideDoor_Dashboard_Page.nativeViewiFrame);
        CommonUtils.waitForVisibility(testAccountResetPage.nativeViewRunFixScriptButton);
        CommonUtils.sleep(2000);
        testAccountResetPage.nativeViewRunFixScriptButton.click();
        CommonUtils.sleep(1000);
        CommonUtils.waitForVisibility(testAccountResetPage.nativeViewProceedInBackgroundButton);
        testAccountResetPage.nativeViewProceedInBackgroundButton.click();
        CommonUtils.sleep(3000);
        CucumberLogUtils.logScreenshot();
        ServiceNow_Common_Methods.logOutOfNativeView();
    }

    /**
     * This method navigates to the url with the RASopathy Study Test Account reset script
     * Call this method at the end of your test case to rerun test case with same test account
     *
     * @param url the URL to navigate to the test account reset script
     */
    public static void test_automation_account_has_been_reset(String url) {
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        WebDriverUtils.webDriver.get(url);
        CommonUtils.sleep(2000);
        CommonUtils.switchToFrame(NativeView_SideDoor_Dashboard_Page.nativeViewiFrame);
        CommonUtils.waitForVisibility(testAccountResetPage.nativeViewRunFixScriptButton);
        CommonUtils.sleep(2000);
        testAccountResetPage.nativeViewRunFixScriptButton.click();
        CommonUtils.sleep(1000);
        CommonUtils.waitForVisibility(testAccountResetPage.nativeViewProceedInBackgroundButton);
        testAccountResetPage.nativeViewProceedInBackgroundButton.click();
        CommonUtils.sleep(3000);
        ServiceNow_Common_Methods.logOutOfNativeView();
    }
}
