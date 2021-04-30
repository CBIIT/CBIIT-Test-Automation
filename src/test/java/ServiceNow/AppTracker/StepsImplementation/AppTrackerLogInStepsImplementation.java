package ServiceNow.AppTracker.StepsImplementation;

import com.nci.automation.utils.EncryptionUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.ConfUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;

import ServiceNow.AppTracker.Pages.BasePage;
import ServiceNow.AppTracker.Pages.AppTrackerLogInPage;
import appsCommon.PageInitializer;

public class AppTrackerLogInStepsImplementation  extends PageInitializer{
	public void appTrackerApplicationLogin(String username, String password) throws TestingException {
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("AppTrackerTestUrl"));
	    //appTrackerBasePage.moveToElementByXpath(AppTrackerLogInPage.logInMainPage);
		CommonUtils.sendKeys(nihLoginPage.username, ConfUtils.getProperty(username));
		String decyptedPass=EncryptionUtils.decrypt(ConfUtils.getProperty(password));
		CommonUtils.sendKeys(nihLoginPage.password, decyptedPass);
		CommonUtils.click(nihLoginPage.signInButton);
		MiscUtils.sleep(3000);
	}

	

}
