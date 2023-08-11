package CustomBusiness.ETD.Pages;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;
import CustomBusiness.EIDP.Util.CommonUtil;

public class ETDBasePage extends CommonUtils {

	protected WebDriver driver;
	protected WebDriverWait wait;
	public static int captureCount = 1;

	public ETDBasePage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
<<<<<<< HEAD
		this.driver = WebDriverUtils.getWebDriver();
		wait = new WebDriverWait(this.driver, Duration.ofSeconds(30));
=======
		this.driver = WebDriverUtils.webDriver;
		wait = new WebDriverWait(this.driver,Duration.ofSeconds(30));
>>>>>>> 829249a15e6003b50d33d6afb09487b4f3b9cd62
	}

	protected void clickOnElements(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}

	protected void clickOnElementByXpath(String xpath) {
		WebElement element = driver.findElement(By.xpath(xpath));
		wait.until(ExpectedConditions.visibilityOf(element));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}

	protected void enterText(WebElement element, String text) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
		if (text != null) {
			element.sendKeys(text);
		}
	}

	protected void selectTodayDate(WebElement inputEle) {
		clickOnElement(inputEle);
		clickOnElement(driver.findElement(By.cssSelector(".today.day")));
		System.out.print("");
	}

	protected void waitForElementToVisible(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void waitForElementToLoad(By locator) {
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

	protected void clickOnStaleElement(WebElement ele) {
		int count = 0;
		while (count < 5) {
			try {
				ele.click();
				break;
			} catch (Exception ex) {
				CommonUtil.waitBrowser(2000);
				count++;
			}
		}
	}

	public void scrollToElement(WebElement element) {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	}

	public void selectOption(WebElement selectEl, String optionText) {
		Select select = new Select(selectEl);
		select.selectByVisibleText(optionText);
	}

	public void selectOptionByIndex(WebElement selectEl) {
		Select select = new Select(selectEl);
		select.selectByIndex(2);
	}

	public void moveToElementByXpath(WebElement element) {
		Actions actions = new Actions(WebDriverUtils.webDriver);
		wait.until(ExpectedConditions.visibilityOf(element));
		actions.moveToElement(element).perform();

	}

	// Get The Current Day
	public String getCurrentDay() {
		// Create a Calendar Object
		Calendar calendar = Calendar.getInstance(TimeZone.getDefault());

		// Get Current Day as a number
		int todayInt = calendar.get(Calendar.DAY_OF_MONTH);
		System.out.println("Today Int: " + todayInt + "\n");

		// Integer to String Conversion
		String todayStr = Integer.toString(todayInt);
		System.out.println("Today Str: " + todayStr + "\n");

		return todayStr;
	}

}