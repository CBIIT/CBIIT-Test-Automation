package PLATFORM_BUSINESS.SNOW_TRAVEL.playwright.stepsImpl;

import PLATFORM_BUSINESS.SNOW_TRAVEL.playwright.constants.Travel_Request_NV_Contants;
import PLATFORM_BUSINESS.SNOW_TRAVEL.playwright.constants.Travel_Request_Portal_Form_Constants;
import com.microsoft.playwright.FrameLocator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import com.nci.automation.utils.CucumberLogUtils;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import static com.nci.automation.web.PlaywrightUtils.page;

public class Travel_Request_NV_StepImpl {

    /**
     * Searches for the given travel planning system in the filter navigator.
     *
     * @param travelPlanningSystem the travel planning system to search for
     */
    public static void i_search_in_the_filter_navigator(String travelPlanningSystem) {
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(Travel_Request_Portal_Form_Constants.NATIVE_VIEW_LINK)).click();
        page.getByPlaceholder("Filter").click();
        page.getByPlaceholder("Filter").fill(travelPlanningSystem);
        assertThat(page.getByPlaceholder("Filter")).isVisible();
        assertThat(page.getByPlaceholder("Filter")).hasValue(travelPlanningSystem);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Verifies that modules are created for the given parameters underneath the ravel planning system application in NV.
     *
     * @param travelRequest         the name of the travel request module
     * @param assignedToMe          the name of the assigned to me module
     * @param assignedToMyGroup     the name of the assigned to my group module
     * @param myApprovals           the name of the my approvals module
     */
    public static void i_will_see_modules_created_for_the_and_underneath_application(String travelRequest, String assignedToMe, String assignedToMyGroup, String myApprovals) {
        page.waitForSelector(".sn-polaris-nav-body");
        assertThat(page.locator(".sn-polaris-nav-body")).isVisible();
        assertThat(page.getByLabel("Travel Planning System", new Page.GetByLabelOptions().setExact(true))).containsText(Travel_Request_NV_Contants.TRAVEL_PLANNING_SYSTEM_NV_MODULE);
        assertThat(page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(travelRequest))).isVisible();
        assertThat(page.getByRole(AriaRole.LIST)).containsText(travelRequest);
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(travelRequest)).click();
        assertThat(page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(assignedToMe))).isVisible();
        assertThat(page.getByRole(AriaRole.LIST)).containsText(assignedToMe);
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(assignedToMe)).click();
        assertThat(page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(assignedToMyGroup))).isVisible();
        assertThat(page.getByRole(AriaRole.LIST)).containsText(assignedToMyGroup);
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(assignedToMyGroup)).click();
        assertThat(page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(myApprovals))).isVisible();
        assertThat(page.getByRole(AriaRole.LIST)).containsText(myApprovals);
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(myApprovals)).click();
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByRole(AriaRole.BUTTON, new FrameLocator.GetByRoleOptions().setName(Travel_Request_NV_Contants.NV_MY_APPROVAL_MODULE_APPROVALS_TEXT))).isVisible();
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByRole(AriaRole.HEADING)).containsText(Travel_Request_NV_Contants.NV_MY_APPROVAL_MODULE_APPROVALS_TEXT);
        CucumberLogUtils.playwrightScreenshot(page);
    }
}