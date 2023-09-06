package CustomBusiness.EIDP.Steps;

import com.nci.automation.xceptions.TestingException;
import CustomBusiness.EIDP.Util.SharedData;
import appsCommon.PageInitializer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginSteps extends PageInitializer {

	@Given("User logs in to EIDP {string} as {string} and {string}")
	public void user_logs_in_to_EIDP_as_and(String url, String username, String password) {
		eidpLoginStepImpl.ApplicationLogin(username, password, url);
	}

	@When("User will login to the application as \"([^\"]*)\" user")
	public void loginByUsername(String username) {
			eidpLoginStepImpl.eidpApplicationLogin("Username", "Password");
	}

	@When("Logged in user changes the user to \"([^\"]*)\"")
	public void changeUser(String username) {
		eidpLoginStepImpl.changeUser(username);
	}

	@When("Logged in user changes the user to trainee")
	public void changeUser() {
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