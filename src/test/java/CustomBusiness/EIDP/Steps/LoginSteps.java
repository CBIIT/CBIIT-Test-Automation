package CustomBusiness.EIDP.Steps;

import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;
import CustomBusiness.EIDP.Util.SharedData;
import appsCommon.PageInitializer;
import cucumber.api.java.en.When;

public class LoginSteps extends PageInitializer {

	@When("User will login to the application as {string} user on {string}")
	public void loginByUsernameOn(String username, String appUrl) throws InterruptedException, TestingException {
		eidpLoginStepImpl.ApplicationLogin(username, "Password", appUrl);
	}

	@When("User will login to the application as \"([^\"]*)\" user")
	public void loginByUsername(String username) throws TestingException {
		if (username.equalsIgnoreCase("gugulothus2")) {
			eidpLoginStepImpl.eidpApplicationLogin("sgugulothuUsername", "sgugulothuPassword");
		} else if (username.equalsIgnoreCase("nekrashevicha2")) {
			eidpLoginStepImpl.eidpApplicationLogin("nekrashevicha2Username", "nekrashevicha2Password");
		} else {
			eidpLoginStepImpl.eidpApplicationLogin("Username", "Password");
		}
	}

	@When("Logged in user changes the user to \"([^\"]*)\"")
	public void changeUser(String username) throws TestingException {
		eidpLoginStepImpl.changeUser(username);
	}

	@When("Logged in user changes the user to trainee")
	public void changeUser() throws Exception {
		String updatedUserName = SharedData.traineeName;
		if (!SharedData.traineeName.contains(",")) {
			String[] temp = SharedData.traineeName.split(" ");
			if (temp.length > 2) {
				updatedUserName = temp[1] + " " + temp[2] + "," + temp[0];
			} else {
				updatedUserName = temp[1] + "," + temp[0];
			}
		}
		System.out.println("trainee name = " + updatedUserName);
		eidpLoginStepImpl.changeUserToTrainee(updatedUserName);
	}

	@When("Logged in user changes the user to primary mentor")
	public void changeToPrimaryMentor() {
		String updatedUserName = SharedData.primaryMentorName;
		if (!SharedData.primaryMentorName.contains(",")) {
			String[] temp = SharedData.primaryMentorName.split(" ");
			if (temp.length > 2) {
				updatedUserName = temp[1] + " " + temp[2] + "," + temp[0];
			} else {
				updatedUserName = temp[1] + "," + temp[0];
			}
		}
		System.out.println("Primary mentor name = " + updatedUserName);

	}

}