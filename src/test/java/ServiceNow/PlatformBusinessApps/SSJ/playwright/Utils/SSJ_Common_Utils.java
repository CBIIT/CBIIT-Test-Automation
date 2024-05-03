package ServiceNow.PlatformBusinessApps.SSJ.playwright.Utils;

import appsCommon.PlaywrightUtils.Playwright_Common_Utils;
import com.microsoft.playwright.ElementHandle;
import com.microsoft.playwright.Locator;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.PlaywrightUtils;
import java.util.List;

public class SSJ_Common_Utils {

    /**
     * Selects the calendar option for today's date based on the provided locator.
     *
     * @param locator the locator used to identify the calendar options
     */
    public static void selectingTodaysCalendarOption(String locator){
        List<ElementHandle> days = PlaywrightUtils.page.querySelectorAll(locator);
        for (ElementHandle day : days) {
            if (day.getAttribute("title").equals(CommonUtils.getCurrentDateIn_YYYYMMDD_format())) {
                day.click();
                break;
            }
        }
    }

    public static void selectingAMonthFromTodaysDateCalendarOption(String locator){
        List<ElementHandle> months = PlaywrightUtils.page.querySelectorAll(locator);
        for (ElementHandle month : months) {
            if (month.getAttribute("title").equals(CommonUtils.getDateOneMonthFromNowin_YYYY_MM_DD_format())) {
                month.click();
                break;
            }
        }
    }
}
