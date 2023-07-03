package ServiceNow.COVIDCode.StepsImplementation;

import ServiceNow.COVIDCode.Steps.HooksSteps;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;

import appsCommon.PageInitializer;

public class SignOutVerificationStepImp extends PageInitializer {

	/**
	 * This method directs user to the COVIDCode web site and logs in with
	 * credentials and takes a screenshot of fields already filled out
	 */
	public void covidCodeServicePortalLogIn() throws TestingException {
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("COVIDCode"));
		CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
		iTrustloginPage.covidCodeLogInButton();
		loginImpl.loginToITrust();
		CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
	}

	/**
	 * This method logs out of the COVIDCode web site and logs a screenshot when the
	 * user is signed in and when user logs out
	 */
	public void covidCodeServicePortalLogOut() {
		CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
		JavascriptUtils.clickByJS(iTrustloginPage.profileDropDown);
		JavascriptUtils.clickByJS(iTrustloginPage.covidCodeSignOutButton);
		MiscUtils.sleep(2000);
		CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
	}
}
