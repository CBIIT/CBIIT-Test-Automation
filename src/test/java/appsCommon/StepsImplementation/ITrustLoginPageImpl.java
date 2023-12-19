package appsCommon.StepsImplementation;

import appsCommon.PageInitializers.PageInitializer;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.xceptions.TestingException;

public class ITrustLoginPageImpl extends PageInitializer {

	public void loginToITrust()  {
		MiscUtils.sleep(3000);
		CommonUtils.waitForVisibility(iTrustloginPage.userNameField);
		try {
			iTrustloginPage.enterUsername(iTrustloginPage.userNameField, "Username");
			iTrustloginPage.enterPassword("Password");
			iTrustloginPage.clickSignInButton();
			MiscUtils.sleep(2000);
		} catch (TestingException e) {
			throw new RuntimeException(e);
		}
	}

	public void shomirITrustLogin() throws TestingException {
		MiscUtils.sleep(2000);
		iTrustloginPage.enterUsername(iTrustloginPage.userNameField, "ShomirUserName");
		iTrustloginPage.enterPassword("ShomirPassword");
		iTrustloginPage.clickSignInButton();
		MiscUtils.sleep(500);
		iTrustloginPage.clickSignInButton();
		MiscUtils.sleep(500);
	}
	public void elizabethiTrustLogin() throws TestingException {
		MiscUtils.sleep(2000);
		iTrustloginPage.enterUsername(iTrustloginPage.userNameField, "andreyeveUsername");
		iTrustloginPage.enterPassword("andreyevePassword");
		iTrustloginPage.clickSignInButton();
		MiscUtils.sleep(500);
	}
}