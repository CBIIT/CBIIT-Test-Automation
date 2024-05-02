package appsCommon.PlaywrightUtils;

import com.microsoft.playwright.Locator;
import com.nci.automation.web.PlaywrightUtils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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
     * Returns the current date in the format "yyyy/MM/dd".
     *
     * @return the current date
     */
    public static String getCurrentDateIn_YYYYMMDD_format() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate today = LocalDate.now();
        return today.format(formatter);
    }
}
