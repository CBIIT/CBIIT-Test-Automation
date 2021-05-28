package CustomBusinessApp.EIDP.Steps;

import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;

import CustomBusinessApp.EIDP.Util.SharedData;
import ServiceNow.ATO.Utils.Constants;
import appsCommon.PageInitializer;
import cucumber.api.java.en.When;

public class LoginSteps extends PageInitializer{
	
  
//	@Given("User opens nih application in browser")
//	public void openApp() {
//		nihLoginPage.openApp("nih");
//	}
//	
//	@Given("User opens nidcra application in browser")
//	public void openNIDCRApp() {
//		nihLoginPage.openApp("nidcra");
//	}
	
	@When("User will login to the application as \"([^\"]*)\" user")
	public void loginByUsername(String username) throws TestingException {

		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("CEDCD"));
		loginStepsImpl.clckOnLoginButton();
		Thread.sleep(3000);
		loginStepsImpl.enterUsername(username);
		loginStepsImpl.enterPassword(Constants.passwords.get(username));
		basePage.captureScreenshot("Before Login");
		loginStepsImpl.clickOnSignInButton();

	}
	
	@When("Logged in user changes the user to \"([^\"]*)\"")
	public void changeUser(String username) throws TestingException {
		eidpLoginStepImpl.changeUser(username);
	}
	
	@When("Logged in user changes the user to trainee")
	public void changeUser() throws Exception{
		String updatedUserName = SharedData.traineeName;
		if(!SharedData.traineeName.contains(",")) {
			String[] temp = SharedData.traineeName.split(" ");
			if(temp.length > 2) {
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
		if(!SharedData.primaryMentorName.contains(",")) {
			String[] temp = SharedData.primaryMentorName.split(" ");
			if(temp.length > 2) {
				updatedUserName = temp[1] + " " + temp[2] + "," + temp[0];
			} else {
				updatedUserName = temp[1] + "," + temp[0];
			} 
		}
		System.out.println("Primary mentor name = " + updatedUserName);
//		nihLoginPage.changeUserToTrainee(updatedUserName);
	}
	
}
