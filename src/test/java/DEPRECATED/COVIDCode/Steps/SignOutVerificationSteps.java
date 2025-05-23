package DEPRECATED.COVIDCode.Steps;

import com.nci.automation.utils.CucumberLogUtils;
import APPS_COMMON.PageInitializers.PageInitializer;
import com.nci.automation.web.CommonUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SignOutVerificationSteps extends PageInitializer {

	@Given("an internal user is logged into the COVIDcode application")
	public void an_internal_user_is_logged_into_the_COVIDcode_application()  {
		signOutVerificationStepImp.covidCodeServicePortalLogIn();
	}

	@Given("is on the home page")
	public void is_on_the_home_page() {
		CommonUtils.sleep(1000);
		CucumberLogUtils.logScreenshot();
	}

	@Then("the internal user is able to sign out of the application by clicking on the Sign Out button")
	public void the_internal_user_is_able_to_sign_out_of_the_application_by_clicking_on_the_button() {
		signOutVerificationStepImp.covidCodeServicePortalLogOut();
	}

}
