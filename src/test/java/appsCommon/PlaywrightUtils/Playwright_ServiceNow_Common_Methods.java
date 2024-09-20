package appsCommon.PlaywrightUtils;

import appsCommon.Pages.Playwright_NativeView_Dashboard_Page;
import appsCommon.Pages.Playwright_NativeView_Side_Door_Login_Page;
import appsCommon.Pages.Playwright_ServiceNow_NCISP_Page;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import com.nci.automation.web.CommonUtils;
import static com.nci.automation.web.PlaywrightUtils.page;
import static com.nci.automation.web.TestProperties.*;

public class Playwright_ServiceNow_Common_Methods {

    /***
     * THIS METHOD LOGS INTO NATIVE VIEW USING THE SIDE DOOR TEST ACCOUNT
     */
    public static void side_Door_Test_Account_Login(){
        page.navigate(getNativeViewSideDoorUrl());
        page.locator(Playwright_NativeView_Side_Door_Login_Page.usernameTextBox).fill(SIDE_DOOR_USERNAME);
        page.locator(Playwright_NativeView_Side_Door_Login_Page.passwordTextBox).fill(SIDE_DOOR_PASSWORD);
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName(Playwright_NativeView_Side_Door_Login_Page.loginButton)).click();
    }

    /***
     * THIS METHOD LOGS INTO NATIVE VIEW USING THE SIDE DOOR TEST ACCOUNT AND IMPERSONATES ANY USER
     * PARAMETERIZE THE USER NAME AS A STRING ARGUMENT
     * @param name
     */
    public static void side_Door_Test_Account_Login_Impersonate(String name){

        page.navigate(getNativeViewSideDoorUrl());
        page.locator(Playwright_NativeView_Side_Door_Login_Page.usernameTextBox).fill(SIDE_DOOR_USERNAME);
        page.locator(Playwright_NativeView_Side_Door_Login_Page.passwordTextBox).fill(SIDE_DOOR_PASSWORD);
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName(Playwright_NativeView_Side_Door_Login_Page.loginButton)).click();
        page.waitForLoadState();
        page.reload();
        CommonUtils.sleep(2000);
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("CBIIT Test Account: available")).click();
        page.getByRole(AriaRole.MENUITEM, new Page.GetByRoleOptions().setName(Playwright_NativeView_Dashboard_Page.impersonateUserOption)).click();
        CommonUtils.sleep(3000);
        page.getByRole(AriaRole.COMBOBOX, new Page.GetByRoleOptions().setName(Playwright_NativeView_Dashboard_Page.impersonateUserDropDown)).click();
        page.getByRole(AriaRole.COMBOBOX, new Page.GetByRoleOptions().setName(Playwright_NativeView_Dashboard_Page.impersonateUserDropDown)).fill(name);
        page.waitForLoadState();
        CommonUtils.sleep(3000);
        page.locator(Playwright_NativeView_Dashboard_Page.impersonateDropDownOption).getByRole(AriaRole.OPTION, new Locator.GetByRoleOptions().setName(name)).click();
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName(Playwright_NativeView_Dashboard_Page.impersonateUserButton)).click();
    }

    /***
     * THIS METHOD SEARCHES THE FILTER NAVIGATOR AND CLICKS ON DESIRED OPTION
     * @param searchValue
     * @param option
     */
    public static void searchFilterNavigatorAndClickOption(String searchValue, String option){
        page.getByPlaceholder("Filter").fill(searchValue);
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(option)).click();
    }

    /***
     * THIS METHOD SELECTS AN OPTION FROM ANY DROPDOWN INSIDE THE NATIVE VIEW iFRAME
     * @param locator
     * @param option
     */
    public static void selectDropDownOptionInsideIframe(String locator, String option){
        page.frameLocator(Playwright_NativeView_Dashboard_Page.iFrame).locator(locator).selectOption(option);
    }

    /***
     * THIS METHOD LOGS OUT OF NATIVE VIEW
     */
    public static void logOutOfNativeView(){
        page.navigate(getNCISPUrl());
        page.locator(Playwright_ServiceNow_NCISP_Page.profileAccountButton).click();
        page.getByRole(AriaRole.MENUITEM, new Page.GetByRoleOptions().setName(Playwright_ServiceNow_NCISP_Page.logOutLink)).click();
    }
}