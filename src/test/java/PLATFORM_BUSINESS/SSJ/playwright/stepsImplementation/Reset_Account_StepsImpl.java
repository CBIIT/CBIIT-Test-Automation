package PLATFORM_BUSINESS.SSJ.playwright.stepsImplementation;

import ServiceNow.PLATFORM_BUSINESS.SSJ.playwright.Pages.User_Table_Page;
import ServiceNow.PLATFORM_BUSINESS.SSJ.playwright.Utils.SSJ_Constants;
import APPS_COMMON.Pages.Playwright_NativeView_Dashboard_Page;
import APPS_COMMON.Pages.Playwright_ServiceNow_NCISP_Page;
import APPS_COMMON.PlaywrightUtils.Playwright_ServiceNow_Common_Methods;
import com.microsoft.playwright.FrameLocator;
import com.microsoft.playwright.PlaywrightException;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.PlaywrightUtils;
import static com.nci.automation.web.TestProperties.getNCISPUrl;

public class Reset_Account_StepsImpl {

    /***
     * USE THIS METHOD TO RESET A PROFILE AFTER CREATING A PROFILE
     * THIS METHOD NEEDS THE FIRST NAME OF THE PROFILE THAT WAS CREATED
     * USE A UNIQUE NAME
     * @param name
     */
    public static void tester_navigates_to_native_view_to_reset_account_with_name_so_that_automated_test_can_run_again_without_manual_intervention(String name) {
        PlaywrightUtils.page.navigate(getNCISPUrl());
        PlaywrightUtils.page.locator(Playwright_ServiceNow_NCISP_Page.nativeViewLink).click();
        Playwright_ServiceNow_Common_Methods.searchFilterNavigatorAndClickOption("SCSS", "Users");
        Playwright_ServiceNow_Common_Methods.selectDropDownOptionInsideIframe(User_Table_Page.usersDropDown, "First Name");
        PlaywrightUtils.page.frameLocator(Playwright_NativeView_Dashboard_Page.iFrame).getByLabel("Search", new FrameLocator.GetByLabelOptions().setExact(true)).fill(name);
        PlaywrightUtils.page.frameLocator(Playwright_NativeView_Dashboard_Page.iFrame).getByLabel("Search", new FrameLocator.GetByLabelOptions().setExact(true)).press("Enter");
        PlaywrightUtils.page.frameLocator(Playwright_NativeView_Dashboard_Page.iFrame).locator(User_Table_Page.dynamicUserLocator(name)).click();
        PlaywrightUtils.page.frameLocator(Playwright_NativeView_Dashboard_Page.iFrame).locator(User_Table_Page.deleteButton).click();
        PlaywrightUtils.page.frameLocator(Playwright_NativeView_Dashboard_Page.iFrame).locator(User_Table_Page.modalDialogDeleteButton).click();
    }

    /**
     * THIS METHOD CHECKS IF A TEST RECORD EXISTS BEFORE EXECUTING A TEST, IF IT DOES, THEN IT WILL DELETE THE TEST RECORD BEFORE THE TEST STARTS TO EXECUTE
     *
     * @param testAccountName
     */
    public static void a_test_account_is_reset_before_executing_a_test(String testAccountName) {
        Playwright_ServiceNow_Common_Methods.side_Door_Test_Account_Login_Impersonate(SSJ_Constants.SSJ_TESTER);
        PlaywrightUtils.page.locator(Playwright_ServiceNow_NCISP_Page.nativeViewLink).click();
        Playwright_ServiceNow_Common_Methods.searchFilterNavigatorAndClickOption("SCSS", "Users");
        Playwright_ServiceNow_Common_Methods.selectDropDownOptionInsideIframe(User_Table_Page.usersDropDown, "First Name");
        CommonUtils.sleep(3000);
        PlaywrightUtils.page.frameLocator(Playwright_NativeView_Dashboard_Page.iFrame).getByLabel("Search", new FrameLocator.GetByLabelOptions().setExact(true)).fill(testAccountName);
        PlaywrightUtils.page.frameLocator(Playwright_NativeView_Dashboard_Page.iFrame).getByLabel("Search", new FrameLocator.GetByLabelOptions().setExact(true)).press("Enter");
        CommonUtils.sleep(2000);
        try {
            if (PlaywrightUtils.page.frameLocator(Playwright_NativeView_Dashboard_Page.iFrame).locator(User_Table_Page.dynamicUserLocator(testAccountName)).isVisible()) {
                PlaywrightUtils.page.frameLocator(Playwright_NativeView_Dashboard_Page.iFrame).locator(User_Table_Page.dynamicUserLocator(testAccountName)).click();
                PlaywrightUtils.page.frameLocator(Playwright_NativeView_Dashboard_Page.iFrame).locator(User_Table_Page.deleteButton).click();
                PlaywrightUtils.page.frameLocator(Playwright_NativeView_Dashboard_Page.iFrame).locator(User_Table_Page.modalDialogDeleteButton).click();
                CommonUtils.sleep(2000);
            }
            Playwright_ServiceNow_Common_Methods.logOutOfNativeView();
        } catch (PlaywrightException e) {
            e.printStackTrace();
            CucumberLogUtils.scenario.log("***** TEST ACCOUNT NOT FOUND - TEST CONTINUES *****");
            Playwright_ServiceNow_Common_Methods.logOutOfNativeView();
        }
    }
}