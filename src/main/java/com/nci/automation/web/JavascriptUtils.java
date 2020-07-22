package com.nci.automation.web;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * This is a util class which contains all JavaScript common methods that will
 * be used through out the application. New JavaScript methods can be added any
 * time. Modifying the existing methods may result in build failure.
 * @author Sohilz2
 */
public class JavascriptUtils extends WebDriverUtils {
	
	private static Logger logger = Logger.getLogger(JavascriptUtils.class);
	
	
	/**
	 * Use this method in need of clicking on a WebElement internally. This is used
	 * when WebDriver is failed to click on a WebElement UI.
	 * 
	 * @param web Element
	 */
	public static void clickByJS(WebElement element) {
		JavascriptExecutor js = ((JavascriptExecutor) webDriver);
		js.executeScript("arguments[0].click();", element);
	}

	/**
	 * Use this method in need of clearing WebElement internally. This is used when
	 * WebDriver is failed to clear a text box value.
	 * 
	 * @param web Element.
	 */
	public static void clearByJS(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) webDriver;
		js.executeScript("arguments[0].value = '';", element);
	}

	/**
	 * Use this method in need of scrolling to the very bottom of the page.
	 * 
	 * @param driver Pass the object of the WebDriver here.
	 */
	public static void scrollDown(int pixels) {
		JavascriptExecutor js = ((JavascriptExecutor) webDriver);
		js.executeScript("window.scrollBy(0," + pixels + ")");
	}

	/**
	 * This method will scroll page up by the given pixel
	 * 
	 * @param pixel
	 */
	public static void scrollUp(int pixel) {
		JavascriptExecutor js = (JavascriptExecutor) webDriver;
		js.executeScript("window.scrollBy(0, -" + pixel + ")");
	}

	/**
	 * Use this method in need of scrolling the page to a specific element.
	 * 
	 * @param wbe element to which you want to bring in to view.
	 */
	public static void scrollIntoView(WebElement element) {
		JavascriptExecutor js = ((JavascriptExecutor) webDriver);
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}

	/**
	 * Use this method in need of surrounding an element with blue border.
	 * 
	 * @param web element.
	 */
	public static void drawBlueBorder(WebElement element) {
		JavascriptExecutor js = ((JavascriptExecutor) webDriver);
		js.executeScript("arguments[0].style.border='3px solid blue'", element);
	}

	/**
	 * Use this method in need of surrounding an element with Red border.
	 * 
	 * @param element Pass the web element.
	 */
	public static void drawRedBorder(WebElement element) {
		JavascriptExecutor js = ((JavascriptExecutor) webDriver);
		js.executeScript("arguments[0].style.border='3px solid Red'", element);
	}

	/**
	 * Use this method in need of generating alert in runtime while an issue raises.
	 * 
	 * @param object  of WebDriver.
	 * @param message Pass the message you want to generate.
	 */
	public static void generateAlert(WebDriver driver, String message) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("alert('" + message + "')");
	}

	/**
	 * Use this method in need of refreshing browser instance which is opened by
	 * selenium WebDriver.
	 * 
	 * @param driver Pass the object of WebDriver here.
	 */
	public static void refreshBrowserByJS(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("history.go(0)");
	}

	/**
	 * Use this method in need of retrieving the page title.
	 * 
	 * @param driver pass the object of WebDriver here.
	 * @return string object.
	 */
	public static String getPageTitleByJS(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String title = js.executeScript("return document.title;").toString();
		return title;
	}

	/**
	 * Use this method in need of retrieving the whole page text.
	 * 
	 * @param driver Pass the object of the WebDriver here.
	 * @return string object.
	 */
	public static String getPageInnerText(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String pageText = js.executeScript("return document.documentElement.innerText;").toString();
		return pageText;
	}

	/**
	 * Use this method in need of sending text to a web element.
	 * 
	 * @param element
	 * @param value
	 */
	public static void enterValueByJS(WebElement element, String value) {
		JavascriptExecutor jse = (JavascriptExecutor) webDriver;
		jse.executeScript("arguments[0].value=value;");
	}

	/**
	 * This method is to select values from bootstrap drop downs Pass the element
	 * and date desired in String format as arguments
	 * @param element
	 * @param date to be selected
	 */
	public static void selectDateByJS(WebElement element, String date) {
		JavascriptExecutor js = (JavascriptExecutor) webDriver;
		js.executeScript("arguments[0].setAttribute('value','" + date + "');", element);

	}

}
