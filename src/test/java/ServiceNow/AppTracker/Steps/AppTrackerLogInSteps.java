package ServiceNow.AppTracker.Steps;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;
import appsCommon.PageInitializer;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AppTrackerLogInSteps extends PageInitializer {
	
	@Given("User is on AppTracker home page and user is {string}")
	public void user_is_on_AppTracker_home_page_and_user_is(String user) throws TestingException {
		appTrackerLoginStepsImpl.appTrackerServicePortalLogin(user);
	}
	   

	
		
	
}