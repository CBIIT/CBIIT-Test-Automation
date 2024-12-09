package DEPRECATED.COVIDCode.StepsImplementation;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import APPS_COMMON.PageInitializers.PageInitializer;

public class SignOutVerificationStepImp extends PageInitializer {

	/**
	 * This method directs user to the COVIDCode web site and logs in with
	 * credentials and takes a screenshot of fields already filled out
	 */
	public void covidCodeServicePortalLogIn()  {
		WebDriverUtils.webDriver.get("");
		CucumberLogUtils.logScreenshot();
		iTrustloginPage.covidCodeLogInButton();
		iTrustLoginPageImpl.loginToITrust();
		CucumberLogUtils.logScreenshot();
	}

	/**
	 * This method logs out of the COVIDCode web site and logs a screenshot when the
	 * user is signed in and when user logs out
	 */
	public void covidCodeServicePortalLogOut() {
		CucumberLogUtils.logScreenshot();
		JavascriptUtils.clickByJS(iTrustloginPage.profileDropDown);
		JavascriptUtils.clickByJS(iTrustloginPage.covidCodeSignOutButton);
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
	}
}
