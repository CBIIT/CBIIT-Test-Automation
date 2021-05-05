package ServiceNow.AppTracker.Steps;

import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;
import appsCommon.PageInitializer;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AppTrackerLogInSteps extends PageInitializer {

	@Given("User is on a login page of NIH website")
	public void user_is_on_a_login_page_of_NIH_website() throws TestingException {
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("AppTracker"));
	}

}
