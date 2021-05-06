package ServiceNow.AppTracker.StepsImplementation;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;

import ServiceNow.AppTracker.Pages.VacancyManagerUserPage;
import appsCommon.PageInitializer;

public class VacancyManagerUserStepsImpl extends PageInitializer {

	public void appTrackerServicePortalLogin() throws TestingException {
		CommonUtils.click(vacancyManagerUserPage.logInMainPage);
		CommonUtils.click(vacancyManagerUserPage.NIHTrustedUserLogin);
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
		loginImpl.alenaiTrustLogin();
		CucumberLogUtils.logScreenShot();
		MiscUtils.sleep(2000);
		
	}
	
	public void verifyVacancyDashboardHeader() throws TestingException {
			String actualText = vacancyManagerUserPage.vacancyDashboardPageHeader.getText();
			CucumberLogUtils.logScreenShot();
			String expectedText = "Vacancy Dashboard";
			MiscUtils.sleep(2000);
			Assert.assertEquals("Verifying Vacancy Manager sees Vacancy Dashboard text", expectedText,
					actualText);
		}
	    
	}


