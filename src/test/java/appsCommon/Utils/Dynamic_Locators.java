package appsCommon.Utils;

import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Dynamic_Locators {
    /**
     * THIS CLASS CONTAINS DYNAMIC LOCATORS
     */

    /***
     * USE THIS METHOD TO DYNAMICALLY LOCATE ELEMENTS BASED ON TEXT
     * @param text
     * @return
     */
    public static WebElement dynamicContainsTextLocator(String text) {
        return WebDriverUtils.webDriver.findElement(By.xpath("//*[contains(text(),'" + text + "')]"));
    }

    /***
     * USE THIS METHOD TO DYNAMICALLY LOCATE ELEMENTS BASED ON EXACT TEXT
     * @param text
     * @return
     */
    public static WebElement dynamicTextLocator(String text) {
        return WebDriverUtils.webDriver.findElement(By.xpath("(//*[text()='" + text + "'])[1]"));
    }

    /***
     * USE THIS METHOD TO DYNAMICALLY LOCATE ELEMENTS BASED ON TEXT WITH SPAN TAG NAME
     * @param text
     * @return
     */
    public static WebElement dynamicContainsTextLocatorWithSpanTagName(String text) {
        return WebDriverUtils.webDriver.findElement(By.xpath("//span[contains(text(),'" + text + "')]"));
    }
}
