package CUSTOM_BUSINESS.OASYS.Utils;

import com.microsoft.playwright.Locator;

public class OASYS_CommonUtils {

    /**
     * Clicks on the locator if it is visible
     * @param locator the locator to click
     */
    public static void clickIfVisible(Locator locator) {
        if (locator.isVisible()) {
            locator.click();
        }
    }
}