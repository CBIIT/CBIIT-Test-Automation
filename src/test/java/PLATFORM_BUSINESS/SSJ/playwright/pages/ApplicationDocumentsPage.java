package PLATFORM_BUSINESS.SSJ.playwright.pages;

public class ApplicationDocumentsPage {

    /**
     * Locates an input element based on the given text.
     *
     * @param text The text used to locate the input element.
     * @return The XPath query used to locate the input element.
     */
    public static String dynamicDocLocator(String text){
        return "//*[text()='"+ text + "']//following-sibling::div/div/div/div/div/div/span/div/span/input";
    }
}
