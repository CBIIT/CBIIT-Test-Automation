package appsCommon.Pages;

import com.microsoft.playwright.ElementHandle;
import static com.nci.automation.web.PlaywrightUtils.page;
import com.microsoft.playwright.FrameLocator;

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
     * Returns a dynamic XPath locator for locating a span element with normalized space based on the provided text.
     *
     * @param text the text value of the span element to be located
     * @return a string representing the dynamic XPath locator for the span element
     */
    public static String dynamicSpanNormalizeSpaceLocator (String text){
        return "(//span[normalize-space()='" + text + "'])[1]";
    }

    /**
     * Extracts text content from a header element followed by a span element if available,
     * or from a normalized space span element as a fallback.
     *
     * @param text the text value used to locate the elements
     * @return the extracted text content from the located element, or null if not found
     */
    public static String getTextFromHeaderOrNormalizedSpan(String text) {
        String xpathExpressionH2 = String.format("//h2[text()='%s']/following-sibling::span[1]", text);
        String xpathExpressionSpanNormSpace = String.format("(//span[normalize-space()='%s'])[1]", text);
        ElementHandle element = page.querySelector(xpathExpressionH2);
        if (element == null) {
            element = page.querySelector(xpathExpressionSpanNormSpace);
        }
        if (element == null) {
            return null;
        }
        return element.textContent();
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
