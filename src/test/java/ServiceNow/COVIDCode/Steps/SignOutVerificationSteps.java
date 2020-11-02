package ServiceNow.COVIDCode.Steps;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.xceptions.TestingException;

import ServiceNow.COVIDCode.StepsImplementation.SignOutVerificationStepImp;
import appsCommon.PageInitializer;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class SignOutVerificationSteps extends PageInitializer {

	@Given("an internal user is logged into the COVIDcode application")
	public void an_internal_user_is_logged_into_the_COVIDcode_application() throws TestingException {

		signOutVerificationStepImp.covidCodeServicePortalLogIn();

	}

	@Given("is on the home page")
	public void is_on_the_home_page() {
		
		MiscUtils.sleep(1000);
		CucumberLogUtils.logScreenShot();

	}

	@Then("the internal user is able to sign out of the application by clicking on the Sign Out button")
	public void the_internal_user_is_able_to_sign_out_of_the_application_by_clicking_on_the_button() {

		signOutVerificationStepImp.covidCodeServicePortalLogOut();

	}

}
