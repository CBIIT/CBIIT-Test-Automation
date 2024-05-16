package appsCommon.PlaywrightUtils;

import com.microsoft.playwright.Locator;
import com.nci.automation.web.PlaywrightUtils;

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
}