package ServiceNow.COVIDCode.StepsImplementation;

import org.junit.Assert;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import APPS_COMMON.PageInitializers.PageInitializer;
import static com.nci.automation.web.CommonUtils.sleep;

public class COVIDCodeLoginStepsImpl extends PageInitializer {

	public void covidCodeServicePortalLogin()  {
		WebDriverUtils.webDriver.get("");
		CucumberLogUtils.logScreenshot();
		JavascriptUtils.clickByJS(covidCodeLoginPage.LogInButton);
		CucumberLogUtils.logScreenshot();
		iTrustLoginPageImpl.loginToITrust();
		CucumberLogUtils.logScreenshot();
		sleep(2000);
	}

	public void covidCodeStudyHomePage()  {
		WebDriverUtils.webDriver.get("");
		String expectedTitle = "COVIDcode Home - COVIDcode";
		String actualTitle = WebDriverUtils.webDriver.getTitle();
		Assert.assertEquals("Verifying COVIDcode homepage title", expectedTitle, actualTitle);
		CucumberLogUtils.logScreenshot();
	}

	public void verifyingNIHDashboardHeader()  {
		String actualText = servicePortalQuestionnairePage.nihUserDashboardHeader.getText();
		CucumberLogUtils.logScreenshot();
		String expectedText = "NIH User Dashboard";
		sleep(2000);
		Assert.assertEquals("Verifying COVIDcode Study Provider sees the CNIH User Dashboard", expectedText,
				actualText);
	}

}
