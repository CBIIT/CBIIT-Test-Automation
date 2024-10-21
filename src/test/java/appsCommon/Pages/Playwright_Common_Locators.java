package appsCommon.Pages;

import com.microsoft.playwright.FrameLocator;
import static com.nci.automation.web.PlaywrightUtils.page;

public class Playwright_Common_Locators {

    /**
     * Returns a dynamic XPath locator for locating an element based on its text value.
     *
     * @param text the text value of the element to be located
     * @return a string representing the dynamic XPath locator
     */
    public static String dynamicTextLocator(String text) {
        return "(//*[text()='" + text + "'])[1]";
    }

    /**
     * Returns a dynamic XPath locator for locating an element based on its text value and index.
     *
     * @param text  the text value of the element to be located
     * @param index the index of the element to be located
     * @return a string representing the dynamic XPath locator
     */
    public static String dynamicTextLocatorByIndex(String text, int index) {
        return "(//*[text()='" + text + "'])[" + index + "]";
    }

    /**
     * Returns the FrameLocator for the iframe in native view pages or applications.
     *
     * @return the FrameLocator for the iframe
     */
    public static FrameLocator iframeLocator() {
        return page.frameLocator("iframe[name=\"gsft_main\"]");
    }
}
