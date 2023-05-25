package ServiceNow.SEER.Steps;

import ServiceNow.SEER.StepsImplementation.SEERLandingPageStepImpl;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;
import appsCommon.PageInitializer;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SEERLandingPageSteps extends PageInitializer {

	@Given("a user is on the SEER Data Access landing page")
	public void a_user_is_on_the_SEER_Data_Access_landing_page() throws TestingException {
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("SEERDataAccess"));
		CucumberLogUtils.logScreenShot();
	}


	@When("the user attempts to request research data with existing email address {string}")
	public void the_user_attempts_to_request_research_data_with_existing_email_address(String existingEmailAddress) {
		SEERLandingPageStepImpl.theUserAttemptsToRequestResearchDataWithExistingEmailAddress(existingEmailAddress);
	}

	@Then("user sees the following header {string}  and message pop-up with links:")
	public void user_sees_the_following_header_and_message_pop_up_with_links(String expectedHeaderText,String expectedParagraph) {
		SEERLandingPageStepImpl.userSeesTheFollowingHeaderAndMessagePopUpWithLinks(expectedHeaderText,expectedParagraph);
	}

	@Then("{string} button is also displayed")
	public void button_is_also_displayed(String expectedButtonText) {
		SEERLandingPageStepImpl.buttonIsAlsoDisplayed(expectedButtonText);
	}

	@Then("the SEER Data Access landing page has the following text displayed")
	public void the_SEER_Data_Access_landing_page_has_the_following_text_displayed(String expectedLandingPageText) {
		SEERLandingPageStepImpl.theSEERDataAccessLandingPageHasTheFollowingTextDisplayed(expectedLandingPageText);
	}
}