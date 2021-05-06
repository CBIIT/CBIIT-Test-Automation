package ServiceNow.AppTracker.Steps;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;

import appsCommon.PageInitializer;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class VacancyManagerUserSteps extends PageInitializer {

	@Given("User is on AppTracker home page")
	public void user_is_on_AppTracker_home_page() throws TestingException {
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("AppTracker"));
		CucumberLogUtils.logScreenShot();
	}

	@When("User logs in as an NIH Trusted User")
	public void user_logs_in_as_an_NIH_Trusted_User() throws TestingException {
		vacancyManagerUserStepsImpl.appTrackerServicePortalLogin();
		
	}

	@When("User should see Vacancy Dashboard Page")
	public void user_should_see_Vacancy_Dashboard_Page() throws TestingException {
	vacancyManagerUserStepsImpl.verifyVacancyDashboardHeader();	
	}

	@When("User clicks on Create Vacancy button")
	public void user_clicks_on_Create_Vacancy_button() {
		
	}

	@When("User enters the vacancy title")
	public void user_enters_the_vacancy_title() {
		
	}

	@When("User enters vacancy description")
	public void user_enters_vacancy_description() {
	
	}

	@Then("User should see the vacancy title & description entered with same format")
	public void user_should_see_the_vacancy_title_description_entered_with_same_format() {
		
	}

}
