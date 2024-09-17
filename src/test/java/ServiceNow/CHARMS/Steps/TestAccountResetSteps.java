package ServiceNow.CHARMS.Steps;

import ServiceNow.CHARMS.StepsImplementation.TestAccountResetImpl;
import appsCommon.Pages.NativeView_SideDoor_Dashboard_Page;
import appsCommon.Utils.ServiceNow_Common_Methods;
import appsCommon.Utils.ServiceNow_Login_Methods;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;
import appsCommon.PageInitializers.PageInitializer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class TestAccountResetSteps extends PageInitializer {

	@Then("test account is reset to be used for next test execution")
	public void test_account_is_reset_to_be_used_for_next_test_execution() throws TestingException {
		testAccountResetImpl.resetTestAccountSignIn();
		testAccountResetImpl.resetTestAccount();
	}

	@Given("test automation account has been reset")
	public void test_automation_account_has_been_reset() {
		TestAccountResetImpl.charmsRasOneTestAccountReset();
	}

	@Given("test automation account {string} has been reset")
	public static void test_automation_account_has_been_reset(String url) {
		TestAccountResetImpl.test_automation_account_has_been_reset(url);
	}
}