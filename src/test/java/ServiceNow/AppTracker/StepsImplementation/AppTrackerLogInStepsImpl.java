package ServiceNow.AppTracker.StepsImplementation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.nci.automation.utils.EncryptionUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.ConfUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;


import appsCommon.PageInitializer;


public class AppTrackerLogInStepsImpl  extends PageInitializer{
	public void appTrackerApplicationLogin() throws TestingException {
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("AppTrackerUrl"));
	    WebElement loginMainPage = WebDriverUtils.getWebDriver().findElement(By.xpath("//*[text()=\\\" Login \\\"]"));
	    Actions actions = new Actions(WebDriverUtils.getWebDriver());
	    CommonUtils.waitForVisibility(loginMainPage);
	    actions.moveToElement(loginMainPage).perform();
	    MiscUtils.sleep(3000);
	    CommonUtils.click(appTrackerLogInPage.NIHTrustedUserLogin);
	    MiscUtils.sleep(3000);
	   // CommonUtils.sendKeys(nihLoginPage.username, ConfUtils.getProperty(username));
		//String decyptedPass=EncryptionUtils.decrypt(ConfUtils.getProperty(password));
		//CommonUtils.sendKeys(nihLoginPage.password, decyptedPass);
		//CommonUtils.click(nihLoginPage.signInButton);
		//MiscUtils.sleep(3000);
		
	}

	

}
