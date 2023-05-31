package com.nci.automation.web;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import com.nci.automation.utils.MiscUtils;

/**
 * This is a utility class which contains all common methods that will be used
 * through out any application. New methods can be added at any time. Modifying
 * the existing methods may result in build failure. - Please
 *
 * @author juarezds
 */
public class CommonUtils extends WebDriverUtils {

	private static Logger logger = LogManager.getLogger(CommonUtils.class);

	/**
	 * Use this method in need of clicking on a WebElement by selenium WebDriver.
	 *
	 * @param element Pass the desired WebElement to be clicked.
	 */
	public static void click(WebElement element) {
		waitForClickability(element);
		element.click();
	}

	/**
	 * Use this method in need of entering value to a text box through selenium
	 * WebDriver.
	 *
	 * @param element Pass the element to which the text needs to be entered.
	 * @param value   Pass the desired text/value in the second parameter.
	 */
	public static void sendKeys(WebElement element, String value) {
		element.clear();
		element.sendKeys(value);
	}

	/**
	 * Use this method in need of entering keyboard keys into a WebElement by
	 * selenium WebDriver.
	 *
	 * @param element     Pass the element to which the key needs to be entered.
	 * @param keyboardKey Pass the desired keyboardKey to be entered to an element.
	 */
	public static void sendKeys(WebElement element, Keys keyboardKey) {
		element.sendKeys(keyboardKey);
	}

	/**
	 * Use this method in need of retrieving the text of an element through selenium
	 * WebDriver.
	 *
	 * @param element Pass the element from which the text to be retrieved.
	 * @return This method returns a string object.
	 */
	public static String getText(WebElement element) {
		return element.getText();
	}

	/**
	 * Use this over loaded method in need of selecting an element of dropDown by
	 * VisbleText.
	 *
	 * @param dropDownElement Pass the WebElement of the desired dropDown.
	 * @param ValueOfDropDown Pass the Visible text of DropDown to be selected.
	 */
	public static void selectDropDownValue(String VisibleTextOfDD, WebElement dropDownWebEl) {
		Select select = new Select(dropDownWebEl);
		select.selectByVisibleText(VisibleTextOfDD);
	}

	/**
	 * Use this over loaded method in need of selecting an element of dropDown by
	 * Value.
	 *
	 * @param dropDownElement Pass the value to be selected.
	 * @param ValueOfDropDown Pass the WebElement of the dropDown.
	 */
	public static void selectDropDownValue(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);
	}

	/**
	 * Use this over loaded method in need of selecting an element of dropDown by
	 * index.
	 *
	 * @param dropDownElement      WebElement of the dropDown.
	 * @param indexOfDropDownValue Pass the index
	 */
	public static void selectDropDownValue(WebElement dropDownElement, int index) {
		Select select = new Select(dropDownElement);
		select.selectByIndex(index);
	}

	/**
	 * this method will accept the alert
	 *
	 * @throws will throw NoAlertExeption if alert is not present.
	 */

	public static void acceptAlert() {

		try {
			Alert alert = webDriver.switchTo().alert();
			alert.accept();
		} catch (NoAlertPresentException e) {
			System.out.println("Alert is not present");
		}
	}

	/**
	 * this method will dismiss the alert
	 *
	 * @throws will throw NoAlertExeption if alert is not present.
	 */

	public static void dismissAlert() {

		try {
			Alert alert = webDriver.switchTo().alert();
			alert.dismiss();
		} catch (NoAlertPresentException e) {
			System.out.println("Alert is not present");
		}
	}

	/**
	 * this method will get the alert text
	 *
	 * @throws will throw NoAlertExeption if alert is not present.
	 */

	public static String getAlertText() {

		try {
			Alert alert = webDriver.switchTo().alert();
			return alert.getText();
		} catch (NoAlertPresentException e) {
			System.out.println("Alert is not present");
			return null;
		}
	}

	/**
	 * This method will switch to the frame
	 *
	 * @param nameOrId
	 */

	public static void switchToFrame(String nameOrId) {

		try {
			webDriver.switchTo().frame(nameOrId);
		} catch (NoSuchFrameException e) {
			System.out.println("Frame is not present.");
		}
	}

	/**
	 * use this method in need of switching to the frame
	 *
	 * @param element
	 */
	public static void switchToFrame(WebElement element) {
		try {
			webDriver.switchTo().frame(element);
		} catch (NoSuchFrameException e) {
			System.out.println("Frame is not present.");
		}
	}

	/**
	 * This method will switch to the frame
	 *
	 * @param index
	 */
	public static void switchToFrame(int index) {

		try {
			webDriver.switchTo().frame(index);
		} catch (NoSuchFrameException e) {
			System.out.println("Frame is not present.");
		}
	}

	/**
	 * This method will determine if element is present on ui or not.
	 *
	 * @param element
	 * @return
	 */
	public static boolean isElementDisplayed(WebElement element) {
		try {
			return element.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}

	public static boolean isElementDisplayed(By locator) {
		try {
			return webDriver.findElement(locator).isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}

	/**
	 * This method will determine if the element is enabled or disabled.
	 *
	 * @param element
	 * @return
	 */
	public static boolean isElementEnabled(WebElement element) {
		try {
			return (element.isDisplayed() && element.isEnabled());
		} catch (Exception e) {
			return false;
		}
	}

	/**
	 * This method will block until the element corresponding to the given
	 * {@code id} can be clicked in the page or {@code timeOut} whichever is
	 * earlier.
	 */
	public static void waitUntilElemtTobeClickableById(Duration timeOut, String id) {
		WebDriverWait webDriverWait = new WebDriverWait(webDriver, timeOut);
		webDriverWait.until(ExpectedConditions.elementToBeClickable(By.id(id)));
	}

	/**
	 * This method will block until the element corresponding to the given
	 * {@code id} can be clicked in the page or {@code timeOut} whichever is
	 * earlier.
	 */
	public static void waitUntilElemtTobeClickableByXpath(Duration timeOut, String xpathExcpression) {
		WebDriverWait webDriverWait = new WebDriverWait(webDriver, timeOut);
		webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathExcpression)));
	}

	/**
	 * Use this method in need of waiting for 30s for an element based on
	 * availability of elementToBeSelected.
	 *
	 * @param element Pass the WebElement on which synchronization to be applied.
	 * @return This method will return boolean type either True or False.
	 */
	public static WebElement waitForThePresenceOfEl(String element, Duration timeOut) {
		WebDriverWait wait = new WebDriverWait(webDriver, timeOut);
		return wait.until(ExpectedConditions.presenceOfElementLocated((By.xpath(element))));
	}

	/**
	 * This method will create an Object of WebDriverWait
	 *
	 * @return WebDriverWait
	 */
	public static WebDriverWait getWaitObject() {
		WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(30));
		return wait;
	}

	/**
	 * This method will wait until element becomes clickable
	 *
	 * @param element
	 */
	public static void waitForClickability(WebElement element) {
		getWaitObject().until(ExpectedConditions.elementToBeClickable(element));
	}

	/**
	 * This method will wait until element becomes visible
	 *
	 * @param element
	 */
	public static void waitForVisibility(WebElement element) {
		getWaitObject().until(ExpectedConditions.visibilityOf(element));
	}

	/**
	 * This method will wait until element becomes invisible
	 *
	 * @param element
	 */
	public static void waitForInvisibility(WebElement element) {
		getWaitObject().until(ExpectedConditions.invisibilityOf(element));
	}

	/**
	 * This method will select the specified day from the specified calendar table
	 *
	 * @param table
	 * @param day
	 */
	public static void selectDateFromTable(WebElement table, String day) {
		List<WebElement> rows = table.findElements(By.xpath("./tbody/tr"));
		List<WebElement> cells = new ArrayList<>();
		boolean daySelected = false;
		for (WebElement row : rows) {
			if (row.getText().contains(day)) {
				cells = row.findElements(By.xpath("./td/a"));
				break;
			}
		}
		for (WebElement cell : cells) {
			if (cell.getText().equals(day)) {
				JavascriptUtils.clickByJS(cell);
				daySelected = true;
				break;
			}
		}
		if (!daySelected) {
			System.out.println("The specified day could not be selected from the calendar.");
		}
	}

	/**
	 * This method will read a .json file and return it in a String type written in
	 * json format - for passing REST payloads
	 */
	static String jsonFile;

	public static String readJson(String fileName) {
		try {
			jsonFile = new String(Files.readAllBytes(Paths.get(fileName)));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return jsonFile;
	}

	/**
	 * Use this method in need of removing all characters except Alphabets
	 *
	 * @param yourValue
	 * @return Will return the updated value
	 */
	public static String getAlphabiticCharactersOnly(String yourValue) {
		return yourValue.replaceAll("[^a-zA-Z]", "");
	}

	/**
	 * Use this method in need of removing all characters except Numbers
	 *
	 * @param yourValue
	 * @return Will return the updated value
	 */
	public static String getNumChrtr(String yourValue) {
		return yourValue.replaceAll("[^0-9]", "");
	}

	/**
	 * Use this method to select a drop down value from a ServiceNow drop down menu
	 * when Select class will not work NOTE: Before using, first you must click on
	 * the drop down, then store elements in a list
	 */
	public static void selectValueFromBootStrapDropDown(List<WebElement> values, String value) {

		for (WebElement dropDownValues : values) {

			if (dropDownValues.getText().contentEquals(value)) {
				dropDownValues.click();
				break;
			}
		}

	}

	/**
	 * Use this method to pass an email concatenated with current date and time into
	 * an email text box
	 */

	public static String getEmail() {
		Date date = new Date();
		Timestamp ts = new Timestamp(date.getTime());
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String email = formatter.format(ts).toString();
		email = email.replaceAll("[^A-Za-z0-9]", "");
		email = ("test") + email + ("@email.com");
		return email;
	}

	/**
	 * Use this String to pass an email concatenated with current date and time into
	 * an email text box and you can pass same value (email+date+time) in another
	 * steps.
	 */

	public static String email = getEmail();

	/**
	 * Use this method to pass date as a string. You can concatinate with any String
	 * and get unique name
	 */
	public static String getDateAsString() {
		Date date = new Date();
		Timestamp ts = new Timestamp(date.getTime());
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateAsString = formatter.format(ts).toString();
		dateAsString = dateAsString.replaceAll("[^A-Za-z0-9]", "");
		return dateAsString;
	}

	public static String date = getDateAsString();

	/**
	 * Use this method to select a checkbox value
	 */
	public static void selectCheckbox(List<WebElement> checkboxList, String attribute, String value) {
		for (WebElement checkbox : checkboxList) {
			if (checkbox.isEnabled()) {
				String checkboxText = checkbox.getAttribute(attribute);
				if (checkboxText.equals(value)) {
					checkbox.click();
					MiscUtils.sleep(1000);
					break;
				}
			}
		}
	}

	/**
	 * Use this method to select a checkbox value & to check that checkbox is
	 * displayed
	 */

	public static void selectCheckboxDisplayed(List<WebElement> checkboxList, String attribute, String value) {
		for (WebElement checkbox : checkboxList) {

			if (checkbox.isEnabled() && checkbox.isDisplayed()) {
				String checkboxText = checkbox.getAttribute(attribute);
				if (checkboxText.equals(value)) {
					checkbox.click();
					MiscUtils.sleep(500);
					break;
				}
			}
		}
	}

	/**
	 * Use this method to open new tab
	 */

	public static void openNewTab() {
		JavascriptExecutor js = (JavascriptExecutor) WebDriverUtils.webDriver;
		js.executeScript("window.open('about:blank','_blank');");
	}

	/**
	 * @Author @SonikaJain
	 *         Switch to new tab opened by clicking a link
	 */
	public static void switchToAnotherTabWindow() {
		String parent = WebDriverUtils.webDriver.getWindowHandle();
		Set<String> s = WebDriverUtils.webDriver.getWindowHandles();
		Iterator<String> I1 = s.iterator();

		while (I1.hasNext()) {
			String child_window = I1.next();
			if (!parent.equals(child_window)) {
				WebDriverUtils.webDriver.switchTo().window(child_window);
			}
		}
	}

	/**
	 * @Author @SonikaJain
	 *         Click browser back button
	 */
	public static void clickBrowserBackButton() {
		WebDriverUtils.webDriver.navigate().back();
	}

	/**
	 * @Author @SonikaJain
	 *         To maximize the window
	 */
	public static void maximizeWindow() {
		WebDriverUtils.webDriver.manage().window().maximize();
	}

	/**
	 * Use this method to switch to the next another open window
	 */
	public static void switchToAnotherWindow() {
		Set<String> handlingAllOpenWindows = WebDriverUtils.webDriver.getWindowHandles();
		for (String nextWindow : handlingAllOpenWindows) {
			WebDriverUtils.webDriver.switchTo().window(nextWindow);
		}
	}

	/*
	 * Use this method to scroll into an element
	 */
	public static void scrollIntoView(By locator) {
		try {
			WebElement element = WebDriverUtils.webDriver.findElement(locator);
			Actions action = new Actions(WebDriverUtils.webDriver);
			action.moveToElement(element);
			action.perform();
		} catch (Exception e) {
			throw e;
		}
	}

	/*
	 * Use this method to scroll into an element
	 */
	public static void scrollIntoView(WebElement element) {
		try {
			Actions action = new Actions(WebDriverUtils.webDriver);
			action.moveToElement(element);
			action.perform();
		} catch (Exception e) {
			throw e;
		}
	}

	/*
	 *
	 * Use below method to assert expected String value with an actual String value
	 */
	public static void assertEquals(String actual, String expected) {

		try {
			Assert.assertEquals(actual, expected);
		} catch (AssertionError e) {

			e.printStackTrace();
		}
	}

	/*
	 *
	 * Use below method to assert actual String value with an expected String value
	 * using assertTrue() method
	 */
	public static void assertTrue(boolean flag) {

		try {
			Assert.assertTrue(flag);
		} catch (AssertionError e) {

			e.printStackTrace();
		}
	}

	/*
	 * Use this method to assert a boolean condition using JUnit assertion
	 */
	public static void assertTrueJUNIT(String message, boolean flag) {
		try {
			org.junit.Assert.assertTrue(message, flag);
		} catch (AssertionError e) {
			e.printStackTrace();
		}

	}

	/*
	 * Use this method to assert a boolean condition using TestNG assertion
	 * -- INCLUDE A STRING MESSAGE SPECIFYING THE ASSERTION --
	 */
	public static void assertTrueTestNG(boolean flag, String message) {
		try {
			Assert.assertTrue(flag, message);
		} catch (AssertionError e) {
			e.printStackTrace();
		}
	}

	/*
	 * Use this method to switch to switch to a following window
	 */
	public static void switchToNextWindow() {
		Set<String> allWindowHandles1 = WebDriverUtils.webDriver.getWindowHandles();
		for (String currentWindow1 : allWindowHandles1) {
			WebDriverUtils.webDriver.switchTo().window(currentWindow1);
		}
	}
}