package appsCommon.PlaywrightUtils;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.PlaywrightUtils;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class Playwright_Common_Utils {

    /**
     * Scrolls the element into view on the page.
     *
     * @param locator the locator of the element to be scrolled into view
     */
    public static void scrollIntoView(String locator){
        Locator element = PlaywrightUtils.page.locator(locator);
        element.evaluate("element => element.scrollIntoView()");
    }

    /**
     * asserting the new page link and footer.
     *
     * @param name
     * @param NewPage
     */
    public static void assertNewPage(String Name, String NewPage){
        Page newPage1 = PlaywrightUtils.context.waitForPage(() -> {
            PlaywrightUtils.page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(Name)).click();});
        MiscUtils.sleep(2000);
        assertThat(newPage1).hasURL(NewPage);newPage1.close();
    }
}