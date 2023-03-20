package ServiceNow.CcrHelpDesk.Pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;

public class CCRHelpDeskPage extends CommonUtils {

	protected WebDriver driver;
	protected WebDriverWait wait;
	public static int captureCount = 1;

	@FindBy(partialLinkText = "Native View")
	public WebElement nativeviewLink;

	/** Left navigation panel searchable filter input field */
	@FindBy(id = "filter")
	public WebElement filterId;

	public CCRHelpDeskPage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
		this.driver = WebDriverUtils.getWebDriver();
		wait = new WebDriverWait(this.driver, Duration.ofSeconds(30));
	}

	protected void clickOnElement(WebElement element) {
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
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				//CommonUtil.waitBrowser(2000);
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

	public void fillTikcetDetails() {
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		// driver.findElement(By.id("s2id_sp_formfield_u_requested_for")).sendKeys(Keys.TAB);
		Actions builder = new Actions(driver);
		Action sendKeysToElemen = builder.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB)
				.sendKeys(Keys.TAB).sendKeys("NIH IRP Website").sendKeys(Keys.TAB).sendKeys("NIH IRP Website Testing")
				.sendKeys(Keys.TAB).sendKeys("NIH IRP Website Testing description").build();
		sendKeysToElemen.perform();

		driver.findElement(By.xpath("//*[@id='s2id_sp_formfield_application']/a")).click();
		// //input[@id='s2id_autogen2_search']

		driver.findElement(By.xpath("//*[@id='s2id_sp_formfield_application']/a")).sendKeys(Keys.DOWN);
		driver.findElement(By.xpath("//*[@id='s2id_sp_formfield_application']/a")).sendKeys(Keys.DOWN);
		driver.findElement(By.xpath("//*[@id='s2id_sp_formfield_application']/a")).sendKeys(Keys.ENTER);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		enterText(driver.findElement(By.xpath("//input[@id='s2id_autogen2_search']")), "NIH IRP Website");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// driver.findElement(By.xpath("//input[@id='s2id_autogen2_search']")).sendKeys(Keys.ENTER);
		sendKeysToElemen = builder.sendKeys(Keys.TAB).sendKeys(Keys.TAB).build();
		sendKeysToElemen.perform();
		JavascriptUtils
				.clickByJS(driver.findElement(By.xpath("//div[@class=\"form-group m-b-xs\"]/button[text()='Submit']")));
		// driver.findElement().click();
	}

	public void validateTheStatsAs(String expectedState) {
		String currentState = getText(
				driver.findElement(By.xpath("//h5[normalize-space(text())='" + expectedState + "']"))).trim();

		Assert.assertTrue(currentState.equalsIgnoreCase(expectedState));
	}

	public void clickOnNativeView() {
		clickOnElement(nativeviewLink);
	}

	protected void switchToFrame() {
		List<WebElement> f = driver.findElements(By.tagName("iframe"));
		driver.switchTo().frame(0);
	}

	protected void switchToDefaultFrame() {
		driver.switchTo().defaultContent();
	}

	public void setFilterValue(String value) {
		try {
			switchToFrame();
			waitForElementToLoad(By.cssSelector(".list2_body"));
		} catch (Exception e) {

		}
		
		switchToDefaultFrame();
		enterText(filterId, value);
	}

	public void seelctAllFromFilterMenu() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<WebElement> filteredList = driver
				.findElements(By.cssSelector("[aria-label='Modules for Application: CCR/OIT Helpdesk'] li"));
		for (int i = 0; i < filteredList.size(); i++) {
			if (filteredList.get(i).getText().contains("All")) {
				filteredList.get(i).click();
			}
		}
	}
	
	public void seelctFromFilterMenu(String name) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<WebElement> filteredList = driver
				.findElements(By.cssSelector("[aria-label='Modules for Application: CCR/OIT Helpdesk'] li"));
		for (int i = 0; i < filteredList.size(); i++) {
			if (filteredList.get(i).getText().contains(name)) {
				filteredList.get(i).click();
			}
		}
	}

	public void sortTheTicketsToDisplayTheLatestOnOnTop() {
		try {
			switchToFrame();
		} catch (Exception e) {

		}
		if (isElementDisplayed(By.xpath(
				"(//a[@data-context-menu-label=\"Created column options\"]/parent::span//i[@class=\"sort-icon-padding list-column-icon icon-vcr-up\"])[1]"))) {
			clickOnElementByXpath(
					"(//a[@data-context-menu-label=\"Created column options\"]/parent::span//i[@class=\"sort-icon-padding list-column-icon icon-vcr-up\"])[1]");
		}
		switchToDefaultFrame();
	}

	public void OpenLatestTicket() {
		try {
			switchToFrame();
		} catch (Exception e) {

		}
		clickOnElementByXpath("(//a[@class=\"linked formlink\"])[1]");
		switchToDefaultFrame();

	}

	public void assignTicketToMe() {
		try {
			switchToFrame();
		} catch (Exception e) {

		}
		clickOnElementByXpath("(//button[text()='Assign to Me'])[1]");
		switchToDefaultFrame();
	}

	public void VerifyStateAs(String string) {
		try {
			switchToFrame();
		} catch (Exception e) {

		}
		Assert.assertTrue(isElementDisplayed(By.xpath(
				"//select[@id=\"x_g_nci_ccr_oit_0_ccr_oit_ticket.state\"]/option[@selected='SELECTED' and text()='"
						+ string + "']")));
		switchToDefaultFrame();

	}

	public void ticketOnHoldButtonClick() {
		try {
			switchToFrame();
		} catch (Exception e) {

		}
		clickOnElementByXpath("(//button[text()='Ticket On Hold'])[1]");
		switchToDefaultFrame();
	}

	public void ClickOnTicketName(String string) {
		try {
			switchToFrame();
		} catch (Exception e) {

		}
		clickOnElementByXpath("(//button[text()='" + string + "'])[1]");
		switchToDefaultFrame();
	}
	
	public void validateFieldsArePresent(String name) {
		Assert.assertTrue(isElementDisplayed(By.xpath("//span[text()='"+name+"']")));
	}

	public void validateFieldsArePresentOnNativeView(String name) {
		try {
			switchToFrame();
		} catch (Exception e) {

		}
		Assert.assertTrue(isElementDisplayed(By.xpath("//span[text()='"+name+"']")));
		switchToDefaultFrame();
		
	}
	
	public void validateFieldsArePresentOnNativeViewWithNewLocator(String name) {
		try {
			switchToFrame();
		} catch (Exception e) {

		}
		Assert.assertTrue(isElementPresent(By.xpath("//*[text()='"+name+"']")));
		switchToDefaultFrame();
		
	}

	public static boolean isElementPresent(By locator) {
		try {
			if(WebDriverUtils.webDriver.findElements(locator).size()>0) {
				return true;
			}else {
				return false;
			}
		}catch(Exception e) {
			throw e;
		}
	}

}
