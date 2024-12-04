package ITSM.ESR.playwright.stepsImplementation;

import ITSM.ESR.playwright.pages.CreateESRPage;
import APPS_COMMON.Pages.Playwright_Common_Locators;
import com.microsoft.playwright.FrameLocator;
import com.microsoft.playwright.options.AriaRole;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import static com.nci.automation.web.PlaywrightUtils.page;

public class ESRNotificationStepsImplementation {

    /**
     * Validates the request notification is sent after ESR creation
     */
    public static void verifyRequestNotification() {
        page.frameLocator(CreateESRPage.iframeSelector).locator(CreateESRPage.newESRTicketSelector).click();
        page.frameLocator(CreateESRPage.iframeSelector).getByRole(AriaRole.TAB, new FrameLocator.GetByRoleOptions().setName("Notes")).click();
        assertThat(page.frameLocator(CreateESRPage.iframeSelector).getByLabel("NotesAdditional comments (").locator("td")).containsText("Activities");
    }

    /**
     * Validates the watchlist update notification is sent after ESR creation
     */
    public static void verifyWatchlistUpdateNotification() {
        page.frameLocator(CreateESRPage.iframeSelector).getByRole(AriaRole.TAB, new FrameLocator.GetByRoleOptions().setName("Notes")).click();
        assertThat(Playwright_Common_Locators.iframeLocator().locator("//div[@id='sn_form_inline_stream_entries']")).containsText("FYI: Watch List Updated");
    }
}
