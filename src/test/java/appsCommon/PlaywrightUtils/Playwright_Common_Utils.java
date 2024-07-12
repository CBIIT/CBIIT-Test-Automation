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
     * Scrolls the element into view on the page.
     *
     * @param text the text to be located on the element
     * @param exact indicates whether the text should be an exact match
     */
    public static void scrollIntoView(String text, boolean exact){
        Locator element = PlaywrightUtils.page.getByText(text, new Page.GetByTextOptions().setExact(exact));
        element.evaluate("element => element.scrollIntoView()");
    }

    /**
     * asserting and click on the new page link and footer.
     *
     * @param name
     * @param NewPage
     */
    public static void clickAndAssertNewPage(String Name, String NewPage){
        Page newPage1 = PlaywrightUtils.context.waitForPage(() -> {
            PlaywrightUtils.page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(Name)).click();});
        MiscUtils.sleep(2000);
        assertThat(newPage1).hasURL(NewPage);newPage1.close();
    }

    /**
     * clicking on the link and asserting the title of new page.
     *
     * @param locator
     * @param title
     */
    public static void clickAndAssertNewPageTitle(String locator, String title){
        Page newPage1 = PlaywrightUtils.context.waitForPage(() -> {
            PlaywrightUtils.page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(locator)).click();});
        MiscUtils.sleep(2000);
        assertThat(newPage1).hasTitle(title);newPage1.close();
    }
}