package APPS_COMMON.Pages;

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

    /**
     * Locates an element in the web page using the provided CSS selector.
     *
     * @param cssSelector the CSS selector used to locate the element
     */
    public static WebElement locateByCssSelector(String cssSelector) {
        return webDriver.findElement(By.cssSelector(cssSelector));
    }

    /**
     * Locates an element in the web page using the provided ID.
     *
     * @param id the ID used to locate the element
     */
    public static WebElement locateById(String id) {
        return webDriver.findElement(By.id(id));
    }

    /**
     * Locates an element in the web page using the provided name.
     *
     * @param name the name used to locate the element
     */
    public static WebElement locateByName(String name) {
        return webDriver.findElement(By.name(name));
    }

    /**
     * Locates an element in the web page using the provided link text.
     *
     * @param linkText the link text used to locate the element
     */
    public static WebElement locateByLinkText(String linkText) {
        return webDriver.findElement(By.linkText(linkText));
    }

    /**
     * Locates an element in the web page using the provided partial link text.
     *
     * @param partialLinkText the partial link text used to locate the element
     */
    public static WebElement locateByPartialLinkText(String partialLinkText) {
        return webDriver.findElement(By.partialLinkText(partialLinkText));
    }

    /**
     * Locates an element in the web page using the provided tag name.
     *
     * @param tagName the tag name used to locate the element
     */
    public static WebElement locateByTagName(String tagName) {
        return webDriver.findElement(By.tagName(tagName));
    }

    /**
     * Locates an element in the web page using the provided class name.
     *
     * @param className the class name used to locate the element
     */
    public static WebElement locateByClassName(String className) {
        return webDriver.findElement(By.className(className));
    }
}