package appsCommon;

import com.nci.automation.utils.MiscUtils;
import com.nci.automation.xceptions.TestingException;

<<<<<<< Updated upstream
public class ITrustLoginPageImpl extends PageInitializer {
=======
<<<<<<< HEAD
public class ITrustLoginPageImpl extends PageInitializer{
	
	
=======
public class ITrustLoginPageImpl extends PageInitializer {
>>>>>>> 8f4e2d8f13237294dd99ecbb9a77e6b945dae2eb
>>>>>>> Stashed changes
	public void loginToITrust() throws TestingException {
		MiscUtils.sleep(2000);
		iTrustloginPage.enterUsername(iTrustloginPage.userNameField, "Username");
		iTrustloginPage.enterPassword("Password");
<<<<<<< Updated upstream
		// CucumberLogUtils.logScreenShot();
		iTrustloginPage.clickSignInButton();
		MiscUtils.sleep(500);
	}

=======
<<<<<<< HEAD
		//CucumberLogUtils.logScreenShot();
		iTrustloginPage.clickSignInButton();
		MiscUtils.sleep(500);
	}
	
=======
		// CucumberLogUtils.logScreenShot();
		iTrustloginPage.clickSignInButton();
		MiscUtils.sleep(500);
	}

>>>>>>> 8f4e2d8f13237294dd99ecbb9a77e6b945dae2eb
>>>>>>> Stashed changes
	public void shomirITrustLogin() throws TestingException {
		MiscUtils.sleep(2000);
		iTrustloginPage.enterUsername(iTrustloginPage.userNameField, "ShomirUserName");
		iTrustloginPage.enterPassword("ShomirPassword");
<<<<<<< Updated upstream
		// CucumberLogUtils.logScreenShot();
		iTrustloginPage.clickSignInButton();
		MiscUtils.sleep(500);
	}


=======
<<<<<<< HEAD
		//CucumberLogUtils.logScreenShot();
		iTrustloginPage.clickSignInButton();
		MiscUtils.sleep(500);
	}
	
=======
		// CucumberLogUtils.logScreenShot();
		iTrustloginPage.clickSignInButton();
		MiscUtils.sleep(500);
	}

>>>>>>> 8f4e2d8f13237294dd99ecbb9a77e6b945dae2eb
>>>>>>> Stashed changes
	public void satyaiTrustLogin() throws TestingException {
		MiscUtils.sleep(2000);
		iTrustloginPage.enterUsername(iTrustloginPage.userNameField, "sgugulothuUsername");
		iTrustloginPage.enterPassword("sgugulothuPassword");
<<<<<<< Updated upstream
		// CucumberLogUtils.logScreenShot();
=======
<<<<<<< HEAD
		//CucumberLogUtils.logScreenShot();
>>>>>>> Stashed changes
		iTrustloginPage.clickSignInButton();
		MiscUtils.sleep(500);
	}
<<<<<<< Updated upstream

=======
	
=======
		// CucumberLogUtils.logScreenShot();
		iTrustloginPage.clickSignInButton();
		MiscUtils.sleep(500);
	}

>>>>>>> 8f4e2d8f13237294dd99ecbb9a77e6b945dae2eb
>>>>>>> Stashed changes
	public void alenaiTrustLogin() throws TestingException {
		MiscUtils.sleep(2000);
		iTrustloginPage.enterUsername(iTrustloginPage.userNameField, "nekrashevicha2Username");
		iTrustloginPage.enterPassword("nekrashevicha2Password");
<<<<<<< Updated upstream
		// CucumberLogUtils.logScreenShot();
=======
<<<<<<< HEAD
		//CucumberLogUtils.logScreenShot();
>>>>>>> Stashed changes
		iTrustloginPage.clickSignInButton();
		MiscUtils.sleep(500);
	}
}
<<<<<<< Updated upstream

=======
=======
		// CucumberLogUtils.logScreenShot();
		iTrustloginPage.clickSignInButton();
		MiscUtils.sleep(500);
	}
}

>>>>>>> 8f4e2d8f13237294dd99ecbb9a77e6b945dae2eb
>>>>>>> Stashed changes
