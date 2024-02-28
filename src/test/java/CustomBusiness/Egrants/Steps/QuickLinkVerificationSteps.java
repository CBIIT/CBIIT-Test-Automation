package CustomBusiness.Egrants.Steps;

import CustomBusiness.Egrants.StepsImplementation.EgrantsStepImplementation;
import appsCommon.PageInitializers.PageInitializer;
import io.cucumber.java.en.Given;

public class QuickLinkVerificationSteps extends PageInitializer {

	@Given("User is logged in the application and is on the landing page")
	public void user_is_logged_in_the_application_and_is_on_the_landing_page() {
		EgrantsStepImplementation.user_is_logged_in_the_application_and_is_on_the_landing_page();
	}

	@Given("verifies that the logged in user {string} is shown")
	public void verifies_that_the_logged_in_user_is_shown(String user) {
		EgrantsStepImplementation.verifies_that_the_logged_in_user_is_shown(user);
	}

	@Given("User is able to navigate to {string} hyperlink")
	public void user_is_able_to_navigate_to_hyperlink(String linkText) {
		EgrantsStepImplementation.is_able_to_navigate_to_hyperlink(linkText);
	}
}