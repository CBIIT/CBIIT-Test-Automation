package CUSTOM_BUSINESS.MRS.Utils;

import com.microsoft.playwright.Locator;
import com.nci.automation.utils.CucumberLogUtils;
import static com.nci.automation.web.PlaywrightUtils.page;

public class MRS_CommonUtils {

    /**
     * Clicks on the locator if it is visible
     * @param locator the locator to click.
     */
    public static void clickIfVisible(Locator locator) {
        if (locator.isVisible()) {
            locator.click();
        }
    }

    /**
     * Waits dynamically for the element to be visible, checks for visibility every 300ms
     * @param selector the selector to wait for
     */
    public static void waitForElementToBeVisible(String selector) {
        while (true) {
            if (page.locator(selector).isVisible()) {
                break;
            }
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * This method handles adding users dynamically based on the provided locators and value
     * @param inputLocator the locator for the input field
     * @param value the value to fill in the input field
     */
    public static void addDelegateOrApproverUser(String inputLocator, String value) {
        page.locator(inputLocator).click();
        page.locator(inputLocator).fill(value);
        page.getByText(value).nth(1).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }
}