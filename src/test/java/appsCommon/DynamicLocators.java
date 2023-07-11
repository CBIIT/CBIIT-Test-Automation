package appsCommon;

import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DynamicLocators {
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
     * USE THIS METHOD TO DYNAMICALLY LOCATE ELEMENTS BASED ON TEXT WITH SPAN TAG NAME
     * @param text
     * @return
     */
    public static WebElement dynamicContainsTextLocatorWithSpanTagName(String text) {
        return WebDriverUtils.webDriver.findElement(By.xpath("//span[contains(text(),'" + text + "')]"));
    }
}
