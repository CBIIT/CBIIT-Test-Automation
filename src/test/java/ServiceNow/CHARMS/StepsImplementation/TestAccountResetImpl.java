package ServiceNow.CHARMS.StepsImplementation;

import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;

import appsCommon.ITrustLoginPageImpl;
import appsCommon.PageInitializer;

public class TestAccountResetImpl extends PageInitializer {

	/**
	 * This method resets RASopathy Study Test Account Call this method at the end
	 * of your test case to rerun test case with same test account
	 * @throws TestingException 
	 */

	public void resetTestAccount() throws TestingException {

		WebDriverUtils.webDriver.get(
				"https://service-test.nci.nih.gov/nav_to.do?uri=%2Fsys_script_fix.do%3Fsys_id%3Da32b45c21be638106daea681f54bcb81%26sysparm_view%3D%26sysparm_domain%3Dnull%26sysparm_domain_scope%3Dnull%26sysparm_record_row%3D1%26sysparm_record_rows%3D603%26sysparm_record_list%3DORDERBYDESCsys_updated_on");
		MiscUtils.sleep(2000);
		iTrustloginPage.enterUsername(iTrustloginPage.userNameField, "Username");
		iTrustloginPage.enterPassword("Password");
		iTrustloginPage.clickSignInButton();
		MiscUtils.sleep(500);
		
	}

}
