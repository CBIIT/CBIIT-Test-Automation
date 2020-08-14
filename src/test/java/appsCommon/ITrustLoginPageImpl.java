package appsCommon;

import com.nci.automation.utils.MiscUtils;
import com.nci.automation.xceptions.TestingException;

public class ITrustLoginPageImpl extends PageInitializer{
	
	
	public void loginToITrust() throws TestingException {
		MiscUtils.sleep(2000);
		iTrustloginPage.enterUsername();
		iTrustloginPage.enterPassword();
		//CucumberLogUtils.logScreenShot();
		iTrustloginPage.clickSignInButton();
		MiscUtils.sleep(500);
	}
	

}
