package ServiceNow.CcrHelpDesk.StepsImplementation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.xceptions.TestingException;

import ServiceNow.ITPG.Pages.LoginPage;
import ServiceNow.ITPG.Utils.CommonUtils;

public class LoginStepsImpl extends LoginPage {

	public LoginStepsImpl() {
		super();
	}

	public void openApp() {
			driver.get(EnvUtils.getApplicationUrl("AtoTestUrl"));
	}

	public void openApp(String url) {
		driver.get(url);
	}

	public void openServiceApp() {
		driver.get(fasturl);
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
		this.enterText(this.username, username);
	}

	public void enterPassword(String password) {
		this.enterText(this.password, password);
	}

	public void clickOnSignInButton() throws InterruptedException {
		this.clickOnElement(this.signInButton);
		Thread.sleep(5000);
	}

	public void loginOnNewUrl(String username, String password) throws InterruptedException {
		driver.findElement(By.id("user_name")).sendKeys(username);
		driver.findElement(By.id("user_password")).sendKeys(password);
		driver.findElement(By.id("sysverb_login")).click();

	}

	/** Native View Button New **/
	@FindBy(xpath = "//button[@id='user_info_dropdown']")
	public WebElement nativeViewButtonNew;
	/** Impersonate option from DropDown View **/
	@FindBy(xpath = "//ul[@class='dropdown-menu']//a[@id='glide_ui_impersonator']")
	public WebElement impersonateOption;

	public void impersonateUser(String userName) throws Exception {
		try {

			JavascriptUtils.clickByJS(nativeViewButtonNew);
			// CucumberLogUtils.logScreenShot();
			Thread.sleep(2000);
			JavascriptUtils.scrollIntoView(impersonateOption);
			JavascriptUtils.clickByJS(impersonateOption);
			clickOnElement(find(By.xpath("//a[text()='" + userName + "']")));
		} catch (Exception e) {
			throw e;
		}
	}

	public void gotoUrl(String url) {
		driver.navigate().to(url);
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

	public void clickOnLeftSideMenuItem(String listItem) throws InterruptedException {
		CommonUtils.waitBrowser(5000);
		for (int i = 0; i < filteredList.size(); i++) {
			if (filteredList.get(i).getText().contains(listItem)) {
				filteredList.get(i).click();
			}
		}
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

	public void setFilterValue(String value) {
		try {
			switchToFrame();
		} catch (Exception e) {

		}
		waitForElementToLoad(By.cssSelector(".list2_body"));
		switchToDefaultFrame();
		enterText(filterId, value);

	}

	public void clickOnButtonInIframe(String btnName) throws InterruptedException {
		String xpath = "//button[text()='" + btnName + "']";
		driver.switchTo().defaultContent();
		switchToFrame();
		clickOnElementByXpath(xpath);
		Thread.sleep(2000);
	}

	public void completeLoginOnSandBox() {
		Set<String> allWindow = driver.getWindowHandles();
		for (String e : allWindow) {
			System.out.println(e + "<---------------------------------------->");
			driver.switchTo().window(e);
			System.out.println(driver.getPageSource());
		}

	}
}