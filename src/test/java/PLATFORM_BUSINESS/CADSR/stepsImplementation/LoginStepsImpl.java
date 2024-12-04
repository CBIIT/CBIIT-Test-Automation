package PLATFORM_BUSINESS.CADSR.stepsImplementation;

import com.nci.automation.web.CommonUtils;
import ServiceNow.ITSM.ITPG.Pages.LoginPage;

public class LoginStepsImpl extends LoginPage {

    public LoginStepsImpl() {
        super();
    }

    public void openApp() {
        CommonUtils.sleep(30000);
        driver.get("");
    }

    public void openApp(String url) {
        driver.get(url);
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

    public void clickOnButton(String btnName) {
        String xpath = "//button[text()='" + btnName + "']";
        switchToFrame();
        clickOnElementByXpath(xpath);
    }

    public void clickOnButtonInIframe(String btnName) throws InterruptedException {
        String xpath = "//button[text()='" + btnName + "']";
        driver.switchTo().defaultContent();
        switchToFrame();
        clickOnElementByXpath(xpath);
        Thread.sleep(2000);
    }
}