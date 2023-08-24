package ServiceNow.CHARMS.StepsImplementation;

import ServiceNow.SEER.StepsImplementation.SEERDataAccessRequestPageStepsImpl;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
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

	public void resetTestAccountSignIn() throws TestingException {

		WebDriverUtils.webDriver.get(
				"https://service-test.nci.nih.gov/sys_script_fix.do?sys_id=a32b45c21be638106daea681f54bcb81&sysparm_view=&sysparm_domain=null&sysparm_domain_scope=null&sysparm_record_row=1&sysparm_record_rows=940&sysparm_record_list=ORDERBYDESCsys_updated_on");
		MiscUtils.sleep(2000);
		iTrustloginPage.enterUsername(iTrustloginPage.userNameField, "Username");
		iTrustloginPage.enterPassword("Password");
		iTrustloginPage.clickSignInButton();
		MiscUtils.sleep(500);

	}
	public void resetTestAccount() {
		MiscUtils.sleep(2000);
		CommonUtils.waitForVisibility(testAccountResetPage.nativeViewIFrame);
		CommonUtils.switchToFrame(testAccountResetPage.nativeViewIFrame);
		CommonUtils.waitForVisibility(testAccountResetPage.nativeViewRunFixScriptButton);
		MiscUtils.sleep(2000);
		testAccountResetPage.nativeViewRunFixScriptButton.click();
		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(testAccountResetPage.nativeViewProceedInBackgroundButton);
		testAccountResetPage.nativeViewProceedInBackgroundButton.click();
		MiscUtils.sleep(10000);
		SEERDataAccessRequestPageStepsImpl.nativeViewLogOut();
	}
}
