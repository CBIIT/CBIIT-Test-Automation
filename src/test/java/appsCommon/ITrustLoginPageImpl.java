package appsCommon;

import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.xceptions.TestingException;

public class ITrustLoginPageImpl extends PageInitializer {

	public void loginToITrust() throws TestingException {
		MiscUtils.sleep(2000);
		CommonUtils.waitForVisibility(iTrustloginPage.userNameField);
		iTrustloginPage.enterUsername(iTrustloginPage.userNameField, "Username");
		iTrustloginPage.enterPassword("Password");
		iTrustloginPage.clickSignInButton();
		MiscUtils.sleep(500);
	}

	public void shomirITrustLogin() throws TestingException {
		MiscUtils.sleep(2000);
		iTrustloginPage.enterUsername(iTrustloginPage.userNameField, "ShomirUserName");
		iTrustloginPage.enterPassword("ShomirPassword");
		iTrustloginPage.clickSignInButton();
		MiscUtils.sleep(500);
		// CucumberLogUtils.logScreenShot();
		iTrustloginPage.clickSignInButton();
		MiscUtils.sleep(500);
	}

	public void satyaiTrustLogin() throws TestingException {
		MiscUtils.sleep(2000);
		iTrustloginPage.enterUsername(iTrustloginPage.userNameField, "sgugulothuUsername");
		iTrustloginPage.enterPassword("sgugulothuPassword");
		iTrustloginPage.clickSignInButton();
		MiscUtils.sleep(500);
		// CucumberLogUtils.logScreenShot();
		iTrustloginPage.clickSignInButton();
		MiscUtils.sleep(500);
	}

	public void alenaiTrustLogin() throws TestingException {
		MiscUtils.sleep(2000);
		iTrustloginPage.enterUsername(iTrustloginPage.userNameField, "nekrashevicha2Username");
		iTrustloginPage.enterPassword("nekrashevicha2Password");
		iTrustloginPage.clickSignInButton();
		MiscUtils.sleep(500);
	}

}