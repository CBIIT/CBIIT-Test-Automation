package appsCommon.PlaywrightUtils;

import appsCommon.Pages.Playwright_NativeView_Dashboard_Page;
import appsCommon.Pages.Playwright_NativeView_Side_Door_Login_Page;
import appsCommon.Pages.Playwright_ServiceNow_NCISP_Page;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import com.nci.automation.utils.EncryptionUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.ConfUtils;
import com.nci.automation.web.EnvUtils;
import static com.nci.automation.web.PlaywrightUtils.page;

public class Playwright_ServiceNow_Common_Methods {

    /***
     * THIS METHOD LOGS INTO NATIVE VIEW USING THE SIDE DOOR TEST ACCOUNT
     */
    public static void side_Door_Test_Account_Login(){
        page.navigate(EnvUtils.getApplicationUrl("nativeviewSideDoor"));
        page.locator(Playwright_NativeView_Side_Door_Login_Page.usernameTextBox).fill(ConfUtils.getProperty("SideDoorUsername"));
        page.locator(Playwright_NativeView_Side_Door_Login_Page.passwordTextBox).fill(EncryptionUtils.decrypt(ConfUtils.getProperty("SideDoorPassword")));
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName(Playwright_NativeView_Side_Door_Login_Page.loginButton)).click();
    }

    /***
     * THIS METHOD LOGS INTO NATIVE VIEW USING THE SIDE DOOR TEST ACCOUNT AND IMPERSONATES ANY USER
     * PARAMETERIZE THE USER NAME AS A STRING ARGUMENT
     * @param name
     */
    public static void side_Door_Test_Account_Login_Impersonate(String name){
        page.navigate(EnvUtils.getApplicationUrl("nativeviewSideDoor"));
        page.locator(Playwright_NativeView_Side_Door_Login_Page.usernameTextBox).fill(ConfUtils.getProperty("SideDoorUsername"));
        page.locator(Playwright_NativeView_Side_Door_Login_Page.passwordTextBox).fill(EncryptionUtils.decrypt(ConfUtils.getProperty("SideDoorPassword")));
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName(Playwright_NativeView_Side_Door_Login_Page.loginButton)).click();
        page.waitForLoadState();
        page.reload();
        MiscUtils.sleep(2000);
        //**** for test env ***
//        page.getByLabel(Playwright_NativeView_Dashboard_Page.profileButton).click();
        //**** for sbx env ***
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("CBIIT Test Account: available")).click();
        page.getByRole(AriaRole.MENUITEM, new Page.GetByRoleOptions().setName(Playwright_NativeView_Dashboard_Page.impersonateUserOption)).click();
        MiscUtils.sleep(3000);
        page.getByRole(AriaRole.COMBOBOX, new Page.GetByRoleOptions().setName(Playwright_NativeView_Dashboard_Page.impersonateUserDropDown)).click();
        page.getByRole(AriaRole.COMBOBOX, new Page.GetByRoleOptions().setName(Playwright_NativeView_Dashboard_Page.impersonateUserDropDown)).fill(name);
        page.waitForLoadState();
        MiscUtils.sleep(3000);
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
        page.navigate(EnvUtils.getApplicationUrl("ServiceNow NCISP"));
        page.locator(Playwright_ServiceNow_NCISP_Page.profileAccountButton).click();
        page.getByRole(AriaRole.MENUITEM, new Page.GetByRoleOptions().setName(Playwright_ServiceNow_NCISP_Page.logOutLink)).click();
    }
}