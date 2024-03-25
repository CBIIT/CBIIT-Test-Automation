package ServiceNow.PlatformBusinessApps.SSJ.playwright.StepsImplementation;

import ServiceNow.PlatformBusinessApps.SSJ.playwright.Pages.User_Table_Page;
import appsCommon.Pages.Playwright_NativeView_Dashboard_Page;
import appsCommon.Pages.Playwright_ServiceNow_NCISP_Page;
import appsCommon.PlaywrightUtils.Playwright_ServiceNow_Common_Methods;
import com.microsoft.playwright.FrameLocator;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.PlaywrightUtils;

public class Rest_Account_StepsImpl {

    /***
     * USE THIS METHOD TO RESET A PROFILE AFTER CREATING A PROFILE
     * THIS METHOD NEEDS THE FIRST NAME OF THE PROFILE THAT WAS CREATED
     * USE A UNIQUE NAME
     * @param name
     */
    public static void tester_navigates_to_native_view_to_reset_account_with_name_so_that_automated_test_can_run_again_without_manual_intervention(String name) {
        PlaywrightUtils.page.navigate(EnvUtils.getApplicationUrl("ServiceNow NCISP"));
        PlaywrightUtils.page.locator(Playwright_ServiceNow_NCISP_Page.nativeViewLink).click();
        Playwright_ServiceNow_Common_Methods.searchFilterNavigatorAndClickOption("SCSS", "Users");
        Playwright_ServiceNow_Common_Methods.selectDropDownOptionInsideIframe(User_Table_Page.usersDropDown, "First Name");
        PlaywrightUtils.page.frameLocator(Playwright_NativeView_Dashboard_Page.iFrame).getByLabel("Search", new FrameLocator.GetByLabelOptions().setExact(true)).fill(name);
        PlaywrightUtils.page.frameLocator(Playwright_NativeView_Dashboard_Page.iFrame).getByLabel("Search", new FrameLocator.GetByLabelOptions().setExact(true)).press("Enter");
        PlaywrightUtils.page.frameLocator(Playwright_NativeView_Dashboard_Page.iFrame).locator(User_Table_Page.dynamicUserLocator(name)).click();
        PlaywrightUtils.page.frameLocator(Playwright_NativeView_Dashboard_Page.iFrame).locator(User_Table_Page.deleteButton).click();
        PlaywrightUtils.page.frameLocator(Playwright_NativeView_Dashboard_Page.iFrame).locator(User_Table_Page.modalDialogDeleteButton).click();
    }
}
