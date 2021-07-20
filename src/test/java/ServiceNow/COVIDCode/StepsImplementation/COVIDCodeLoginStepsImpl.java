package ServiceNow.COVIDCode.StepsImplementation;

import org.junit.Assert;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;
<<<<<<< HEAD
=======

import appsCommon.ITrustLoginPageImpl;
>>>>>>> 9920c6c3de959132d7416e5cd4d2a4a0f496472d
import appsCommon.PageInitializer;

public class COVIDCodeLoginStepsImpl extends PageInitializer {

	public void covidCodeServicePortalLogin() throws TestingException {
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("COVIDCode"));
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.clickByJS(covidCodeLoginPage.LogInButton);
		CucumberLogUtils.logScreenShot();
<<<<<<< HEAD
	    loginImpl.loginToITrust();
=======
		loginImpl.loginToITrust();
>>>>>>> 9920c6c3de959132d7416e5cd4d2a4a0f496472d
		CucumberLogUtils.logScreenShot();
		MiscUtils.sleep(2000);
	}

	public void covidCodeStudyHomePage() throws TestingException {
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("COVIDCode"));
		String expectedTitle = "COVIDcode Home - COVIDcode";
		String actualTitle = WebDriverUtils.webDriver.getTitle();
		Assert.assertEquals("Verifying COVIDcode homepage title", expectedTitle, actualTitle);
		CucumberLogUtils.logScreenShot();
	}

	public void verifyingNIHDashboardHeader() throws TestingException {
		String actualText = servicePortalQuestionnairePage.nihUserDashboardHeader.getText();
		CucumberLogUtils.logScreenShot();
		String expectedText = "NIH User Dashboard";
		MiscUtils.sleep(2000);
		Assert.assertEquals("Verifying COVIDcode Study Provider sees the CNIH User Dashboard", expectedText,
				actualText);
	}

}
