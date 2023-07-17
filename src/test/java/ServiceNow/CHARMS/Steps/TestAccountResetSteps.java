package ServiceNow.CHARMS.Steps;

import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.xceptions.TestingException;
import appsCommon.PageInitializer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestAccountResetSteps extends PageInitializer {

	@Then("test account is reset to be used for next test execution")
	public void test_account_is_reset_to_be_used_for_next_test_execution() throws TestingException {
		testAccountResetImpl.resetTestAccount();
		MiscUtils.sleep(2000);
		CommonUtils.waitForVisibility(testAccountResetPage.nativeViewIFrame);
		CommonUtils.switchToFrame(testAccountResetPage.nativeViewIFrame);
		CommonUtils.waitForVisibility(testAccountResetPage.nativeViewRunFixScriptButton);
		testAccountResetPage.nativeViewRunFixScriptButton.click();
		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(testAccountResetPage.nativeViewProceedInBackgroundButton);
		testAccountResetPage.nativeViewProceedInBackgroundButton.click();
	}

}
