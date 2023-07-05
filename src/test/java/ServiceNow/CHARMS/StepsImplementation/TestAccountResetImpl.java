package ServiceNow.CHARMS.StepsImplementation;

import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;
import appsCommon.PageInitializer;

public class TestAccountResetImpl extends PageInitializer {

	/**
	 * This method resets RASopathy Study Test Account Call this method at the end
	 * of your test case to rerun test case with same test account
	 * 
	 * @throws TestingException
	 */

	public void resetTestAccount() throws TestingException {

		WebDriverUtils.webDriver.get(
				"https://service-test.nci.nih.gov/nav_to.do?uri=sys_script_fix.do?sys_id=2af3a5711bff6150cc42ddb6bc4bcbb1");
		MiscUtils.sleep(2000);
		iTrustloginPage.enterUsername(iTrustloginPage.userNameField, "Username");
		iTrustloginPage.enterPassword("Password");
		iTrustloginPage.clickSignInButton();
		MiscUtils.sleep(500);

	}

}
