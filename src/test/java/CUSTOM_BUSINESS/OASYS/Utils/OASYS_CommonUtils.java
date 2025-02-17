package CUSTOM_BUSINESS.OASYS.Utils;

import com.microsoft.playwright.Locator;
import static com.nci.automation.web.PlaywrightUtils.page;

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

    /**
     * Waits dynamically for the element to be visible, checks for visibility every 500ms
     * @param selector the selector to wait for
     */
    public static void waitForElementToBeVisible(String selector) {
        while (true) {
            if (page.locator(selector).isVisible()) {
                break;
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}