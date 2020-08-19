package ServiceNow.COVIDCode.StepsImplementation;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;

import appsCommon.PageInitializer;

public class FollowUpFormPageImpl extends PageInitializer{
	
	public void accessingFollowUpForm() throws TestingException {
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("COVIDCode"));
		CucumberLogUtils.logScreenShot();
		covidCodeLoginPage.accessAndCompleteFollowUpQuestionnaireButton.click();
		CucumberLogUtils.logScreenShot();
		loginImpl.loginToITrust();
	}

}
