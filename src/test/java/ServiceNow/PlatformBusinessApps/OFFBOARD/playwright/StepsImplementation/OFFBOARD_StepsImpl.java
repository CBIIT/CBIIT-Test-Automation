package ServiceNow.PlatformBusinessApps.OFFBOARD.playwright.StepsImplementation;

import ServiceNow.PlatformBusinessApps.OFFBOARD.playwright.Features.Pages.NCISP_Page;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.PlaywrightUtils;

public class OFFBOARD_StepsImpl {

    /**
     * THIS METHOD NAVIGATES TO CBIIT OFFBOARDING PORTAL PAGE
     */
    public static void i_navigate_to_to_the_offboarding_request_form_to_put_in_a_request_to_off_board_or_transfer_an_employee() {
        PlaywrightUtils.page.navigate(EnvUtils.getApplicationUrl("ServiceNow NCISP"));
        PlaywrightUtils.page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName(NCISP_Page.servicesLink).setExact(true)).click();
        PlaywrightUtils.page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName(NCISP_Page.cbiit_BizServicesLink)).first().click();
        PlaywrightUtils.page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName(NCISP_Page.cbiit_OffBoardingLink).setExact(true)).click();
    }
}
