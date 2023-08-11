package CustomBusiness.DCEG.Pages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.*;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;
import CustomBusiness.EIDP.Util.CommonUtil;

public class BasePage extends CommonUtils{

	protected WebDriver driver;
	protected WebDriverWait wait ;
	public static int captureCount = 1;

	public BasePage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
		this.driver = WebDriverUtils.webDriver;
		wait = new WebDriverWait(this.driver, Duration.ofSeconds(30));
	}
	protected void clickOnElements(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
	
	protected void clickOnElementByXpath(String xpath) {	
		WebElement element = driver.findElement(By.xpath(xpath));
		wait.until(ExpectedConditions.visibilityOf(element ));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
	
	protected void enterText(WebElement element, String text) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
		if(text != null) {
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
		while(count < 5) {
			try {
				ele.click();
				break;
			} catch(Exception ex) {
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
	
	public void selectOptionByIndex(WebElement selectEl ) {
		Select select = new Select(selectEl);
		select.selectByIndex(2);
	}
}