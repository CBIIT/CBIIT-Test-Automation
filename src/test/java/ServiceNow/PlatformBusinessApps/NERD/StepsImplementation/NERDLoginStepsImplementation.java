package ServiceNow.PlatformBusinessApps.NERD.StepsImplementation;

import appsCommon.PageInitializers.PageInitializer;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.WebDriverUtils;

public class NERDLoginStepsImplementation extends PageInitializer{
	
	public void loginToNerd() {
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));
		CucumberLogUtils.logScreenshot();
		iTrustLoginPageImpl.loginToITrust();
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
	}
}