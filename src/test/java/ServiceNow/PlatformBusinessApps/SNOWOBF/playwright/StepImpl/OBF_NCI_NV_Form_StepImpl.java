package ServiceNow.PlatformBusinessApps.SNOWOBF.playwright.StepImpl;

import ServiceNow.PlatformBusinessApps.SNOWOBF.playwright.Pages.NCISP_Portal_Page;
import ServiceNow.PlatformBusinessApps.SNOWOBF.playwright.Pages.OBF_NCI_NV_Form_Page;
import appsCommon.PlaywrightUtils.Playwright_ServiceNow_Common_Methods;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.PlaywrightUtils;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class OBF_NCI_NV_Form_StepImpl {

    /**
     * THIS METHOD NAVIGATES TO OBF Systems Support Native view PAGE
     */
    public static void i_am_an_authenticated_obf_fulfiller_user() {
        Playwright_ServiceNow_Common_Methods.side_Door_Test_Account_Login_Impersonate(OBF_NCI_NV_Form_Page.obf_Fulfiller_User_Name);
    }

    public static void i_navigate_to_the_native_view_and_type_in_the_navigation_search_window(String obfSystemsSupport) {
        //PlaywrightUtils.page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(NCISP_Portal_Page.nativeViewLink)).click();
        Playwright_ServiceNow_Common_Methods.searchFilterNavigatorAndClickOption(obfSystemsSupport, OBF_NCI_NV_Form_Page.obf_App_NV_OBF_Systems_Support_Search_Options);
        assertThat(PlaywrightUtils.page.locator(OBF_NCI_NV_Form_Page.obf_App_NV_Search_Menu_Locator)).containsText(OBF_NCI_NV_Form_Page.obf_App_NV_Search_OBF_Systems_Support);
        }

    public static void i_should_see_the_following_options_in_the_obf_systems_support_module(String allTickets, String openTickets, String closedTickets, String oneStreamBus) {
        PlaywrightUtils.page.locator(OBF_NCI_NV_Form_Page.obf_App_NV_Search_Menu_Locator).click();
        assertThat(PlaywrightUtils.page.getByRole(AriaRole.LIST)).containsText(OBF_NCI_NV_Form_Page.obf_App_NV_OBF_Systems_Support_Search_Options);
        assertThat(PlaywrightUtils.page.getByRole(AriaRole.LIST)).containsText(OBF_NCI_NV_Form_Page.obf_App_NV_OBF_Systems_Support_Search_Menu_Open_Tickets_Option);
        assertThat(PlaywrightUtils.page.getByRole(AriaRole.LIST)).containsText(OBF_NCI_NV_Form_Page.obf_App_NV_OBF_Systems_Support_Search_Menu_Closed_Tickets_Option);
        assertThat(PlaywrightUtils.page.getByRole(AriaRole.LIST)).containsText(OBF_NCI_NV_Form_Page.obf_App_NV_OBF_Systems_Support_Search_Menu_OneStream_BUS_Option);
        assertThat(PlaywrightUtils.page.locator(OBF_NCI_NV_Form_Page.obf_App_NV_Search_Menu_Locator)).containsText(allTickets);
        assertThat(PlaywrightUtils.page.locator(OBF_NCI_NV_Form_Page.obf_App_NV_Search_Menu_Locator)).containsText(openTickets);
        assertThat(PlaywrightUtils.page.locator(OBF_NCI_NV_Form_Page.obf_App_NV_Search_Menu_Locator)).containsText(closedTickets);
        assertThat(PlaywrightUtils.page.locator(OBF_NCI_NV_Form_Page.obf_App_NV_Search_Menu_Locator)).containsText(oneStreamBus);
        CucumberLogUtils.playwrightScreenshot();
    }
}
