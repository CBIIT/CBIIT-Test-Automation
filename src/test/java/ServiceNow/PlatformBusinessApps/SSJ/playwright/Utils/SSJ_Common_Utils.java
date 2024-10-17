package ServiceNow.PlatformBusinessApps.SSJ.playwright.Utils;

import com.microsoft.playwright.ElementHandle;
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
            if (day.getAttribute("title").equals(CommonUtils.getCurrentDateIn_YYYY_MM_DD_format())) {
                day.click();
                break;
            }
        }
    }

    /**
     * Selects the calendar option for ten days from now based on the provided locator.
     *
     * @param locator the locator used to identify the calendar options
     */
    public static void selectingTenDaysFromNowCalendarOption(String locator){
        List<ElementHandle> days = PlaywrightUtils.page.querySelectorAll(locator);
        for (ElementHandle day : days) {
            if (day.getAttribute("title").equals(CommonUtils.getDateAfterTenDaysIn_YYYY_MM_DD_format())) {
                day.click();
                break;
            }
        }
    }

    /**
     * Selects the calendar option for a month from today's date based on the provided locator.
     * NOTE: THIS ONLY WORKS FOR THE CLOSE DATE CALENDAR
     * @param locator the locator used to identify the calendar options
     */
    public static void selectingAMonthFromTodaysDateCalendarOption(String locator){
        List<ElementHandle> list = PlaywrightUtils.page.querySelectorAll(locator);
        for (ElementHandle day : list) {
            if (day.getAttribute("title").trim().equals(CommonUtils.getDateOneMonthFromNowIn_YYYY_MM_DD_format().trim())) {
                PlaywrightUtils.page.locator("(//*[@title='"+ CommonUtils.getDateOneMonthFromNowIn_YYYY_MM_DD_format()+ "'])[2]").click();
                break;
            }
        }
    }
}
