package CUSTOM_BUSINESS.EIDP.stepsImplementation;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.EncryptionUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;
import APPS_COMMON.PageInitializers.PageInitializer;
import static com.nci.automation.web.TestProperties.*;

public class EIDPLoginStepImpl extends PageInitializer {

	public void eidpApplicationLogin(String username, String password)  {
		WebDriverUtils.webDriver.get(getEidpNhgriUrl());
		CommonUtils.sendKeys(nihLoginPage.username, I_TRUST_USERNAME);
		String decyptedPass = EncryptionUtils.decrypt(I_TRUST_PASSWORD);
		CommonUtils.sendKeys(nihLoginPage.password, decyptedPass);
		CommonUtils.clickOnElement(nihLoginPage.signInButton);
		CommonUtils.sleep(3000);
	}
	 /**
	 * This method will login to application based on the environment
	 * @param username, password, appName
	 */
	 public void ApplicationLogin(String username, String password,String appName) {
		WebDriverUtils.webDriver.get("");
		CommonUtils.waitForVisibility(nihLoginPage.username);
		CommonUtils.sendKeys(nihLoginPage.username, I_TRUST_USERNAME);
		String decyptedPass=EncryptionUtils.decrypt(I_TRUST_PASSWORD);
		CommonUtils.sendKeys(nihLoginPage.password, decyptedPass);
		CommonUtils.clickOnElement(nihLoginPage.signInButton);
		CommonUtils.sleep(3000);
	}

	public void enterUsername(String username) {
		CommonUtils.sendKeys(nihLoginPage.username, username);
	}

	public void enterPassword(String password) {
		CommonUtils.sendKeys(nihLoginPage.password, password);
	}

	public void clickOnSignInButton() {
		CommonUtils.clickOnElement(nihLoginPage.signInButton);

	}

	public void changeUser(String username) {
			CommonUtils.waitForVisibility(nihLoginPage.changeUserButton);
			CommonUtils.clickOnElement(nihLoginPage.changeUserButton);
			CommonUtils.clickOnElement(nihLoginPage.changeUserDropdown);
			CommonUtils.sendKeys(nihLoginPage.searchableChangeUserInput, username);
			CommonUtils.sleep(1000);
			CucumberLogUtils.logScreenshot();
			CommonUtils.clickOnElement(nihLoginPage.changeUserOption);

	}

	public String lastNameFirstName(String userName){
		if (!userName.contains(",")) {
			String[] temp = userName.split(" ");
			if (temp.length > 2) {
				userName = temp[1] + " " + temp[2] + "," + temp[0];
			} else {
				userName = temp[1] + "," + temp[0];
			}
		}
		System.out.println("Updated name as LastName, FirstName = " + userName);
		return userName;
	}

	public void changeUserToTrainee(String username) {
			CommonUtils.sleep(3000);
			eidpBasePage.scrollToElement(nihLoginPage.changeUserButton);
			CommonUtils.clickOnElement(nihLoginPage.changeUserButton);
			CommonUtils.clickOnElement(nihLoginPage.changeUserDropdown);
			CommonUtils.sleep(1000);
			CommonUtils.sendKeys(nihLoginPage.searchableChangeUserInput, username);
			CommonUtils.sleep(3000);
			CommonUtils.waitForVisibility(nihLoginPage.changeUserOption);
			CucumberLogUtils.logScreenshot();
			CommonUtils.clickOnElement(nihLoginPage.changeUserOption);
			CommonUtils.sleep(1000);
	}
}
