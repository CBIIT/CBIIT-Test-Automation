package ServiceNow.CcrHelpDesk.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;

import ServiceNow.ATO.Pages.BasePage;
import ServiceNow.ATO.Pages.LoginPage;
import ServiceNow.ATO.Utils.CommonUtils;

public class LoginStepsImplCCR extends BasePage {

	@FindBy(xpath = "//ul[contains(@class,'hidden-sm')]//a[text()='Log in']")
	public WebElement loginButton;

	public By username = By.id("USER");

	public By password = By.id("PASSWORD");

	public By signInButton = By.cssSelector("button[onclick='return submitForm(1);']");

	/** Native view link button on home page */
	@FindBy(partialLinkText = "Native View")
	public WebElement nativeviewLink;

	public void openApp() {
			driver.get(EnvUtils.getApplicationUrl("CCRHelpdesk") + "&sys_id=350223aa1bc515906daea681f54bcb89");
	}

	public void openApp(String url) {
		driver.get(url);
	}

	public void validateHeader() {
		driver.findElement(By.xpath("//h1[text()='FISMA ATO Streamlining Tool (FAST ATO)']"));
	}

	public Boolean isLoginButtonDisplayed() {
		try {
			return loginButton.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}

	public void enterUsername(String username) {
		this.enterText(driver.findElement(this.username), username);
	}

	public void enterPassword(String password) {
		this.enterText(driver.findElement(this.password), password);
	}

	public void clickOnSignInButton() throws InterruptedException {
		this.clickOnElement(driver.findElement(signInButton));
		Thread.sleep(5000);
	}

	public void clckOnLoginButton() {
		this.clickOnElement(loginButton);
	}

	public void loginButtonFastAto() {
		this.clickOnElementByXpath("//div[@class=\"login-text text-center\"]");
	}

	public void clickOnButton(String btnName) {
		String xpath = "//button[text()='" + btnName + "']";
		switchToFrame();
		clickOnElementByXpath(xpath);
	}

	public void clickOnHeaderMenu(String menu) throws InterruptedException {
		switch (menu) {
		case "Native View": {
			clickOnElement(nativeviewLink);
			break;
		}
		}
	}

	public void waitForListToLoad() {
		try {
			switchToFrame();
		} catch (Exception e) {

		}
		waitForElementToLoad(By.cssSelector(".list2_body"));
		switchToDefaultFrame();
	}

	public void clickOnButtonInIframe(String btnName) throws InterruptedException {
		String xpath = "//button[text()='" + btnName + "']";
		driver.switchTo().defaultContent();
		switchToFrame();
		clickOnElementByXpath(xpath);
		Thread.sleep(2000);
	}
}