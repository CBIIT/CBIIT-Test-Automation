package CustomBusinessApp.EIDP.StepsImplementation;

import com.nci.automation.common.CucumberLoggerImpl;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.EncryptionUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.ConfUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;

import appsCommon.PageInitializer;

public class EIDPLoginStepImpl extends PageInitializer{
	
	public void eidpApplicationLogin(String username, String password) throws TestingException {
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("EidpTestUrl"));
		CommonUtils.sendKeys(nihLoginPage.username, ConfUtils.getProperty(username));
		String decyptedPass=EncryptionUtils.decrypt(ConfUtils.getProperty(password));
		CommonUtils.sendKeys(nihLoginPage.password, decyptedPass);
		CommonUtils.click(nihLoginPage.signInButton);
		MiscUtils.sleep(3000);
	}

	
	public void enterUsername(String username) {
		CommonUtils.sendKeys(nihLoginPage.username, username);
	}
	
	public void enterPassword(String password) {
		CommonUtils.sendKeys(nihLoginPage.password, password);
	}
	
	public void clickOnSignInButton() {
		CommonUtils.click(nihLoginPage.signInButton);
		
	}
	
	public void changeUser(String username) {
		try {
			Thread.sleep(5000);
			CommonUtils.click(nihLoginPage.changeUserButton);
			CommonUtils.click(nihLoginPage.changeUserDropdown);
			Thread.sleep(4000);
			CommonUtils.sendKeys(nihLoginPage.searchableChangeUserInput, username);
			Thread.sleep(6000);
			CucumberLogUtils.logScreenShot();
			CommonUtils.click(nihLoginPage.changeUserOption);
			
		} catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
	}
	
	public void changeUserToTrainee(String username) {
		try {
			
			Thread.sleep(3000);
			eidpBasePage.scrollToElement(nihLoginPage.changeUserButton);
			CommonUtils.click(nihLoginPage.changeUserButton);
			CommonUtils.click(nihLoginPage.changeUserDropdown);
			Thread.sleep(1000);
			CommonUtils.sendKeys(nihLoginPage.searchableChangeUserInput, username);
			Thread.sleep(3000);
			CucumberLogUtils.logScreenShot();
			CommonUtils.click(nihLoginPage.changeUserOption);
			
		} catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
	}
<<<<<<< Updated upstream
}
=======
}
>>>>>>> Stashed changes
