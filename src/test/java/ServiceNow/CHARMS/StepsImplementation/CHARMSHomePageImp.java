package ServiceNow.CHARMS.StepsImplementation;

import com.nci.automation.utils.CucumberLogUtils;

import appsCommon.PageInitializer;

public class CHARMSHomePageImp extends PageInitializer {
	
	public void charmsLogin() {
		charmsHomePage.loginButton.click();
		oktaLoginPage.usernameTxtBox.sendKeys("ncitestautomation@gmail.com");
		oktaLoginPage.nextButton.click();
		oktaLoginPage.passwordTxtBox.sendKeys("TESTAutomation1990!");
		CucumberLogUtils.logScreenShot();
		//need to click on login
		//then take screenshot	
	}

}
