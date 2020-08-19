package ServiceNow.COVIDCode.StepsImplementation;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;

import appsCommon.PageInitializer;

public class COVIDCodeLoginStepsImpl extends PageInitializer {
	
	public void covidCodeServicePortalLogin() throws TestingException {
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("Code"));
		CucumberLogUtils.logScreenShot();
		covidCodeLoginPage.AcceptandCompleteQuestionnaireButton.click();
		CucumberLogUtils.logScreenShot();
		loginImpl.loginToITrust();	
	}

}
