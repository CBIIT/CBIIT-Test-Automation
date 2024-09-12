package appsCommon.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static com.nci.automation.web.WebDriverUtils.webDriver;

public class Selenium_Common_Locators {

    /**
     * Locates an element in the web page using the provided XPath expression.
     *
     * @param xpath the XPath expression used to locate the element
     */
    public static WebElement locateByXpath(String xpath){
        return webDriver.findElement(By.xpath(xpath));
    }
}