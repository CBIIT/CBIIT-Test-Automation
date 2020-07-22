package com.nci.automation.web;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nci.automation.utils.LocalConfUtils;


/**
 * This is a utill class which contains all common methods that 
 * will be used through out the application. New methods can be added at any time.
 * Modifying the existing methods may result in build failure.
 * @author Sohil
 */
public class CommonUtils extends WebDriverUtils{
	
	private static Logger logger = Logger.getLogger(CommonUtils.class);

	/**
	 * Use this method in need of clicking on a WebElement by selenium WebDriver.
	 * @param element Pass the desired WebElement to be clicked.
	 */
	public static void click(WebElement element) {
		element.click();
	}

	/**
	 * Use this method in need of entering value to a text box through selenium WebDriver. 
	 * @param element Pass the element to which the text needs to be entered.
	 * @param value Pass the desired text/value in the second parameter.
	 */
	public static void sendKeys(WebElement element, String value) {
		element.clear();
		element.sendKeys(value);
	}
	
	/**
	 * Use this method in need of entering keyboard keys into a WebElement by selenium WebDriver.
	 * @param element Pass the element to which the key needs to be entered.
	 * @param keyboardKey Pass the desired keyboardKey to be entered to an element.
	 */
	public static void sendKeys(WebElement element, Keys keyboardKey) {
		element.sendKeys(keyboardKey);
	}
	
	/**
	 * Use this method in need of retrieving the text of an element through selenium WebDriver.
	 * @param element Pass the element from which the text to be retrieved.
	 * @return This method returns a string object.
	 */
	public static String getText(WebElement element){
		return element.getText();
	}
	
	/**
	 * Use this over loaded method in need of selecting an element of dropDown by VisbleText.
	 * @param dropDownElement Pass the WebElement of the desired dropDown.
	 * @param ValueOfDropDown Pass the Visible text of DropDown to be selected.
	 */
	public static void selectDropDownValue(String VisibleTextOfDD,WebElement dropDownWebEl) {
		Select select = new Select(dropDownWebEl);
		select.selectByVisibleText(VisibleTextOfDD);
	}
	
	/**
	 * Use this over loaded method in need of selecting an element of dropDown by VisbleText.
	 * @param dropDownElement Pass the value to be selected.
	 * @param ValueOfDropDown Pass the WebElement of the dropDown.
	 */
	public static void selectDropDownValue(WebElement element,String value) {
		Select select = new Select(element);
		select.selectByValue(value);
	}
	
	/**
	 * Use this over loaded method in need of selecting an element of dropDown by index.
	 * @param dropDownElement WebElement of the dropDown.
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
	 * @param element
	 * @return 
	 */
	public static boolean isElementDisplayed(WebElement element) {
		try {
			return element.isDisplayed();
		}
		catch(Exception e) {
			return false;
		}
	}

	/**
	 * This method will determine if the element is enabled or disabled.
	 * @param element
	 * @return
	 */
    public static boolean isElementEnabled(WebElement element) {
        try {
            return (element.isDisplayed() && element.isEnabled());
        }
        catch(Exception e) {
            return false;
        }
    }
	
	
	/**
	 * This method will block until the element corresponding to the given
	 * {@code id} can be clicked in the page or {@code timeOut} whichever is
	 * earlier.
	 */
	public static void waitUntilElemtTobeClickableById( long timeOut, String id) {
		WebDriverWait webDriverWait = new WebDriverWait(webDriver, timeOut);
		webDriverWait.until(ExpectedConditions.elementToBeClickable(By.id(id)));
	}

	/**
	 * This method will block until the element corresponding to the given
	 * {@code id} can be clicked in the page or {@code timeOut} whichever is
	 * earlier.
	 */
	public static void waitUntilElemtTobeClickableByXpath(long timeOut, String xpathExcpression) {
		WebDriverWait webDriverWait = new WebDriverWait(webDriver, timeOut);
		webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathExcpression)));
	}
	
	
	/**
	 * Use this method in need of waiting for 30s for an element based on availability of elementToBeSelected.
	 * @param element Pass the WebElement on which synchronization to be applied.
	 * @return This method will return boolean type either True or False.
	 */
	public static WebElement waitForThePresenceOfEl(String element, long timeOut) {
		WebDriverWait wait = new WebDriverWait(webDriver, timeOut);
		return wait.until(ExpectedConditions.presenceOfElementLocated((By.xpath(element))));
	}
	
	/**
     * This method will create an Object of WebDriverWait
     * 
     * @return WebDriverWait
     */
     public static WebDriverWait getWaitObject() {
    	 long explicitWait=Long.valueOf(LocalConfUtils.getProperty("explicitWaitInSeconds"));
                 WebDriverWait wait = new WebDriverWait(webDriver, explicitWait);
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
	 * @param yourValue
	 * @return Will return the updated value
	 */
	public static String getAlphabiticCharactersOnly(String yourValue){
		return yourValue.replaceAll("[^a-zA-Z]", "");
	}
	
	/**
	 * Use this method in need of removing all characters except Numbers
	 * @param yourValue
	 * @return Will return the updated value
	 */
	public static String getNumChrtr(String yourValue){
		return yourValue.replaceAll("[^0-9]", "");
	}
	
}
