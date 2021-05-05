package ServiceNow.AppTracker.StepsImplementation;

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

import appsCommon.PageInitializer;

public class VacancyManagerUserStepsImpl extends PageInitializer {
	
	public void appTrackerServicePortalLogin() throws TestingException {
		WebElement loginMainPage = WebDriverUtils.getWebDriver().findElement(By.xpath("//*[text()='Login with NIH iTrust']"));
		Actions actions = new Actions(WebDriverUtils.getWebDriver());
	    CommonUtils.waitForVisibility(loginMainPage);
	    actions.moveToElement(loginMainPage).perform();
	    MiscUtils.sleep(3000);
	    CommonUtils.click(appTrackerLogInPage.NIHTrustedUserLogin);
	    MiscUtils.sleep(3000);
		//JavascriptUtils.clickByJS(covidCodeLoginPage.LogInButton);
		//CucumberLogUtils.logScreenShot();
	    //loginImpl.loginToITrust();
		//CucumberLogUtils.logScreenShot();
		//MiscUtils.sleep(2000);
		//iTrustloginPage.clickSignInButton();
		//MiscUtils.sleep(2000);
	}

}
