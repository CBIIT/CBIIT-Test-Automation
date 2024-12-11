package CUSTOM_BUSINESS.EIDP.steps;

import CUSTOM_BUSINESS.EIDP.utils.SharedData;
import APPS_COMMON.PageInitializers.PageInitializer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginSteps extends PageInitializer {

	@Given("User logs in to EIDP {string} as {string} and {string}")
	public void user_logs_in_to_EIDP_as_and(String url, String username, String password)  {
		eidpLoginStepImpl.ApplicationLogin(username, password, url);
	}

	@When("User will login to the application as \"([^\"]*)\" user")
	public void loginByUsername(String username)  {
		if (username.equalsIgnoreCase("gugulothus2")) {
			eidpLoginStepImpl.eidpApplicationLogin("sgugulothuUsername", "sgugulothuPassword");
		} else if (username.equalsIgnoreCase("nekrashevicha2")) {
			eidpLoginStepImpl.eidpApplicationLogin("nekrashevicha2Username", "nekrashevicha2Password");
		} else {
			eidpLoginStepImpl.eidpApplicationLogin("Username", "Password");
		}
	}

	@When("Logged in user changes the user to \"([^\"]*)\"")
	public void changeUser(String username)  {
		eidpLoginStepImpl.changeUser(username);
	}

	@When("Logged in user changes the user to trainee")
	public void changeUser() throws Exception {
		String updatedUserName = SharedData.traineeName;
		eidpLoginStepImpl.changeUser(eidpLoginStepImpl.lastNameFirstName(updatedUserName));
	}

	@When("Logged in user changes the user to primary mentor")
	public void changeToPrimaryMentor() {
		String updatedUserName = SharedData.primaryMentorName;
		eidpLoginStepImpl.changeUser(eidpLoginStepImpl.lastNameFirstName(updatedUserName));
	}

	@When("Logged in user changes the user to Co-PM")
	public void changeToCoPM() {
		String updatedUserName = SharedData.coPmName;
		eidpLoginStepImpl.changeUser(eidpLoginStepImpl.lastNameFirstName(updatedUserName));
	}

}