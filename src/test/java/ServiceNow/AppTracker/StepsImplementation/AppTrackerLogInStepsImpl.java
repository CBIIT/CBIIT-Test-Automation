package ServiceNow.AppTracker.StepsImplementation;

import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

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

public class AppTrackerLogInStepsImpl extends PageInitializer {

	Set<String> windowHandles;

	public void appTrackerServicePortalLogin(String userName) throws TestingException {

		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("AppTracker"));
		MiscUtils.sleep(3000);

		CucumberLogUtils.logScreenShot();
		CommonUtils.click(appTrackerLoginPage.logInMainPage);
		MiscUtils.sleep(3000);
		CommonUtils.click(appTrackerLoginPage.NIHTrustedUserLogin);
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
		loginImpl.alenaiTrustLogin();
		CucumberLogUtils.logScreenShot();
		MiscUtils.sleep(2000);
		((JavascriptExecutor) WebDriverUtils.webDriver)
				.executeScript(EnvUtils.getApplicationUrl("AppTrackerNativeView"));
		windowHandles = WebDriverUtils.webDriver.getWindowHandles();
		for (String each : windowHandles) {
			MiscUtils.sleep(1000);

			WebDriverUtils.webDriver.switchTo().window(each);
			MiscUtils.sleep(1000);

			CucumberLogUtils.logScreenShot();

			System.out.println("Curent page title " + WebDriverUtils.webDriver.getTitle());

			if (WebDriverUtils.webDriver.getCurrentUrl().contains("service-test.nci.nih.gov/ncisp")) {
				MiscUtils.sleep(1000);
				Assert.assertTrue(WebDriverUtils.webDriver.getTitle().contains("NCI"));
				break;

			}

			MiscUtils.sleep(1000);
			CucumberLogUtils.logScreenShot();

		}

		MiscUtils.sleep(1000);
		CommonUtils.click(appTrackerLoginPage.nativeViewButton);
		CucumberLogUtils.logScreenShot();

		JavascriptUtils.clickByJS(appTrackerLoginPage.impersonateViewDropDown);
		CucumberLogUtils.logScreenShot();
		MiscUtils.sleep(2000);
		JavascriptUtils.clickByJS(appTrackerLoginPage.impersonateOption);

		if (userName.equals("AppTracker Vacancy Manager")) {
			CommonUtils.click(appTrackerLoginPage.apptrackVacancyManager);

			windowHandles = WebDriverUtils.webDriver.getWindowHandles();
			MiscUtils.sleep(1000);
			for (String each : windowHandles) {
				MiscUtils.sleep(2000);
				JavascriptUtils.refreshBrowserByJS(WebDriverUtils.webDriver.switchTo().window(each));
				MiscUtils.sleep(3000);

				System.out.println("Curent page title " + WebDriverUtils.webDriver.getTitle());

				if (WebDriverUtils.webDriver.getCurrentUrl().contains("service-test.nci.nih.gov/nci-scss.do#")) {
					MiscUtils.sleep(2000);
					Assert.assertTrue(WebDriverUtils.webDriver.getTitle().contains("NCI"));
					break;

				}
			}
			CucumberLogUtils.logScreenShot();

		} else if (userName.equals("AppTracker Committee Member")) {
			CommonUtils.click(appTrackerLoginPage.apptrackCommitteeMember);

			windowHandles = WebDriverUtils.webDriver.getWindowHandles();
			for (String each : windowHandles) {
				MiscUtils.sleep(1000);

				JavascriptUtils.refreshBrowserByJS(WebDriverUtils.webDriver.switchTo().window(each));
				MiscUtils.sleep(4000);

				System.out.println("Curent page title " + WebDriverUtils.webDriver.getTitle());

				if (WebDriverUtils.webDriver.getCurrentUrl().contains("vacancy-dashboard")) {
					MiscUtils.sleep(1000);
					Assert.assertTrue(WebDriverUtils.webDriver.getTitle().contains("NCI"));
					break;

				}
			}
			CucumberLogUtils.logScreenShot();
		} else if (userName.equals("AppTracker Scoring Member")) {
			CommonUtils.click(appTrackerLoginPage.apptrackScoringMember);
			windowHandles = WebDriverUtils.webDriver.getWindowHandles();
			for (String each : windowHandles) {
				MiscUtils.sleep(1000);

				JavascriptUtils.refreshBrowserByJS(WebDriverUtils.webDriver.switchTo().window(each));
				MiscUtils.sleep(1000);

				System.out.println("Curent page title " + WebDriverUtils.webDriver.getTitle());

				if (WebDriverUtils.webDriver.getCurrentUrl().contains("service-test.nci.nih.gov/nci-scss.do#")) {
					MiscUtils.sleep(1000);
					Assert.assertTrue(WebDriverUtils.webDriver.getTitle().contains("NCI"));
					break;

				}
			}
			CucumberLogUtils.logScreenShot();

		}

	}

}