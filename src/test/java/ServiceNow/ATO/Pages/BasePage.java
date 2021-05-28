package ServiceNow.ATO.Pages;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import ServiceNow.ATO.Steps.HookSteps;
import ServiceNow.ATO.Utils.DriverObjectFactory;


public class BasePage {

	protected WebDriver driver;
	private WebDriverWait wait;
	public static int captureCount = 1;

	static String TAB_HEADER = "//span[@class='tab_header']//span[contains(text(), 'tabName')]"; //Change tabName
	
	public BasePage() {
		this.driver = DriverObjectFactory.getWebDriver();
		wait = new WebDriverWait(this.driver, 30);
	}
	protected WebElement getElementByXpath(String xpath) {
		return driver.findElement(By.xpath(xpath));
	}

	protected void clickOnElement(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
	
	protected void clickOnElementInIFrame(WebElement element) {
		switchToFrame();
		wait.until(ExpectedConditions.visibilityOf(element));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
		switchToDefaultFrame();
	}
	
	protected WebElement getElementByCssText(List<WebElement> list, String targetText) {
		WebElement ele = null;
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getText().contains(targetText)) {
				return list.get(i);
			}
		}
		return ele;
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
			element.clear();
			element.sendKeys(text);
		}
	}
	
	protected void enterTextInIFrame(WebElement element, String text) {
		switchToFrame();
		wait.until(ExpectedConditions.elementToBeClickable(element));
		if (text != null) {
			element.clear();
			element.sendKeys(text);
		}
		switchToDefaultFrame();
	}

	protected void selectTodayDate(WebElement inputEle) throws InterruptedException {
		clickOnElement(inputEle);
		Thread.sleep(3000);
		clickOnElement(driver.findElement(By.xpath("//td[text()='Go to Today']")));
	}
	
	public void selectDatesTab() {
		clickOnElement(driver.findElement(By.xpath("//span[text()='Dates']")));
	}
	
	protected void selectTodayDateTime(WebElement inputEle) throws InterruptedException {
		clickOnElement(inputEle);
		Thread.sleep(4000);
		clickOnElement(driver.findElement(By.xpath("//td[text()='Go to Today']")));
		clickOnElement(driver.findElement(By.id("GwtDateTimePicker_ok")));
	}

	protected String getText(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
		return element.getText();
	}

	protected void waitForElementToVisible(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	
	
	protected void waitForElementIgnoreStaleException(By locator) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)							
				.withTimeout(30, TimeUnit.SECONDS) 			
				.pollingEvery(5, TimeUnit.SECONDS) 			
				.ignoring(StaleElementReferenceException.class);
		wait.until(ExpectedConditions.elementToBeClickable(locator));
	}

	protected void waitForElementToLoad(By locator) {
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

	protected void scrollToElement(WebElement element) {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	}

	protected void selectOption(WebElement selectEl, String optionText) {
		Select select = new Select(selectEl);
		select.selectByVisibleText(optionText);
	}
	
	protected void selectOptionInIFrame(WebElement selectEl, String optionText) {
		switchToFrame();
		Select select = new Select(selectEl);
		select.selectByVisibleText(optionText);
		switchToDefaultFrame();
	}

	protected void selectOptionByIndex(WebElement selectEl) {
		Select select = new Select(selectEl);
		select.selectByIndex(2);
	}

	protected void switchToFrame() {
		List<WebElement> f = driver.findElements(By.tagName("iframe"));
		driver.switchTo().frame(0);
	}
	
	protected void switchToDefaultFrame() {
		driver.switchTo().defaultContent();
	}

	protected void selectValueFromPopUp(String xpath) throws InterruptedException {
		String MainWindow = driver.getWindowHandle();

		// To handle all new opened window.
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i1 = s1.iterator();

		while (i1.hasNext()) {
			String ChildWindow = i1.next();

			if (!MainWindow.equalsIgnoreCase(ChildWindow)) {

				// Switching to Child window
				driver.switchTo().window(ChildWindow);
				Thread.sleep(2000);
				clickOnElementByXpath(xpath);
			}
		}
		// Switching to Parent window i.e Main Window.
		driver.switchTo().window(MainWindow);
	}

	public void captureScreenshot(String fileName) {
		String destination = HookSteps.foldeName +"/"+ captureCount + ". " + fileName + ".png";
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File finalDestination = new File(destination);
		try {
			FileUtils.copyFile(source, finalDestination);
		} catch (IOException e) {
			e.printStackTrace();
		}
		captureCount++;
	}
	public void clickOnButton(String btnName) {
		String xpath = "//button[text()='"+btnName+"']";
		switchToFrame();
		clickOnElementByXpath(xpath);
	}
	public void clickOnButtonInIframe(String btnName) throws InterruptedException {
		String xpath = "//button[text()='"+btnName+"']";
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", getElementByXpath(xpath));
		driver.switchTo().defaultContent();
		switchToFrame();
		clickOnElementByXpath(xpath);
		Thread.sleep(2000);
	}
	
	public void clickOnButtonInIframeByXpath(String xpath) throws InterruptedException {
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", getElementByXpath(xpath));
		driver.switchTo().defaultContent();
		switchToFrame();
		clickOnElementByXpath(xpath);
		Thread.sleep(2000);
	}
	public void selectOptionInField(String fieldName, String optionText) {
		String xpath = "//span[text()='" + fieldName + "']/../../following-sibling::div/select";
		WebElement element = driver.findElement(By.xpath(xpath));
		selectOption(element, optionText);
	}
	
	public void enterTextInTextArea(String fieldName, String value) {
		String xpath = "//span[contains(text(),'" + fieldName + "')]/../../following-sibling::div//textarea";
		getElementByXpath(xpath).clear();
		getElementByXpath(xpath).sendKeys(value);
	}
	
	public void enterTextByFieldName(String fieldName, String value) {
		String xpath = "//span[contains(text(),'" + fieldName + "')]/../../following-sibling::div//input[@type='text']";
		getElementByXpath(xpath).clear();
		getElementByXpath(xpath).sendKeys(value);
	}
	
	public void enterTextInSearchableField(String fieldName, String value) {
		String xpath = "//span[contains(text(),'"+fieldName+"')]/../../following-sibling::div//input[@type='search']";
		getElementByXpath(xpath).clear();
		getElementByXpath(xpath).sendKeys(value+Keys.TAB);
	}
	
	public void switchToTab(String tabName) throws InterruptedException {
		String xpath = TAB_HEADER.replace("tabName", tabName);
		clickOnElementByXpath(xpath);
		Thread.sleep(2000);
	}
	
	public WebElement find(By locator) {
		wait.until(ExpectedConditions.elementToBeClickable(locator));
		return driver.findElement(locator);
	}
	
	public Boolean isElementPresent(By locator) {
		return (driver.findElements(locator).size()>0);
	}
	
	public Boolean isElementVisible(By locator) {
		for (WebElement e:driver.findElements(locator)) {
			if(e.isDisplayed()) {
				return true;
			}
		}
		return false;
	}
	
	
}
