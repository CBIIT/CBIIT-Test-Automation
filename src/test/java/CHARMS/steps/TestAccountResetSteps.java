package CHARMS.steps;

import CHARMS.stepsImplementation.TestAccountResetImpl;
import APPS_COMMON.PageInitializers.PageInitializer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class TestAccountResetSteps extends PageInitializer {

	@Then("test account is reset to be used for next test execution")
	public void test_account_is_reset_to_be_used_for_next_test_execution()  {
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