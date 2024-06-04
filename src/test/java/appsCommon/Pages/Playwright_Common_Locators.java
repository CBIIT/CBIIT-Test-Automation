package appsCommon.Pages;

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
}
