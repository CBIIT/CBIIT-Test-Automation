package ServiceNow.ATO.StepsImplementation;

import org.openqa.selenium.By;

import com.nci.automation.web.EnvUtils;
import com.nci.automation.xceptions.TestingException;

import ServiceNow.ATO.Pages.LoginPage;
import ServiceNow.ATO.Utils.CommonUtil;

public class LoginStepsImpl extends LoginPage {

	public LoginStepsImpl() {
		super();
	}

	public void openApp() {
		// driver.get(ConfigFileReader.getConfigFileReader().getAtoUrl());
		try {
			driver.get(EnvUtils.getApplicationUrl("AtoTestUrl"));
		} catch (TestingException e) {
			e.printStackTrace();
		}
	}
	
	public void openApp(String url)  {
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
		CommonUtil.waitBrowser(5000);
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
}
