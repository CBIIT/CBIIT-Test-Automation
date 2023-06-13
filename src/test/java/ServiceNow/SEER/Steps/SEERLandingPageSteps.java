package ServiceNow.SEER.Steps;

import ServiceNow.SEER.StepsImplementation.SEERDataAccessRequestPageStepsImpl;
import ServiceNow.SEER.StepsImplementation.SEERDataRejectionStepImpl;
import ServiceNow.SEER.StepsImplementation.SEERLandingPageStepImpl;
import ServiceNow.SEER.StepsImplementation.SEERUserRegistrationPageStepImpl;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;
import appsCommon.PageInitializer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SEERLandingPageSteps extends PageInitializer {

	@Given("a user is on the SEER Data Access landing page")
	public void a_user_is_on_the_SEER_Data_Access_landing_page() throws TestingException {
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("SEERDataAccess"));
		CucumberLogUtils.logScreenShot();
	}

	@Given("a new user who does not have an active SEER Research Database access request")
	public void a_new_user_who_does_not_have_an_active_SEER_Research_Database_access_request() {
		SEERDataAccessRequestPageStepsImpl.aNewUserWhoDoesNotHaveAnActiveSEERResearchDatabaseAccessRequest();
		SEERDataAccessRequestPageStepsImpl.nativeViewLogOut();
	}

	@When("enter email for SEER Research Database and click on the Register for Research Data")
	public void enter_email_for_SEER_Research_Database_and_click_on_the_Register_for_Research_Data() throws TestingException{
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("SEERDataAccess"));
		CucumberLogUtils.logScreenShot();
		SEERDataAccessRequestPageStepsImpl.enterEmailAddress349();
	}

	@Then("the user will be brought to the SEER User Registration Page with pre populated data from my customer profile")
	public void the_user_will_be_brought_to_the_SEER_User_Registration_Page_with_pre_populated_data_from_my_customer_profile() {
		SEERDataRejectionStepImpl.verifyPrePopulatedSEERDataRegistrationForm();
	}

	@When("a new request for the user is created for {string}")
	public void a_new_request_for_the_user_is_created_for(String registerForResearchData) {
		SEERDataRejectionStepImpl.createsANewAccessRequestForSeerResearchDatabase(registerForResearchData);
	}

	@Then("the user should see page {string} when re registering")
	public void the_user_should_see_page_when_re_registering(String youAlreadyHaveAccessToSeerResearchData) throws TestingException{
		SEERUserRegistrationPageStepImpl.theUserShouldSeePageWhenReRegistering(youAlreadyHaveAccessToSeerResearchData);
	}

	@Then("customer account type will be marked as {string} in Native View")
	public void customer_account_type_will_be_marked_as_in_Native_View(String publicAccount) {
		SEERDataAccessRequestPageStepsImpl.customerAccountTypeWillBeMarkedAsPublicInNativeView(publicAccount);
		SEERDataAccessRequestPageStepsImpl.nativeViewLogOut();
	}

	@Then("the landing page has link {string} for SEER Research Plus Instruction")
	public void the_landing_page_has_link_for_SEER_Research_Plus_Instruction(String howRoRequestAccessToSeerDataLink) {
		SEERUserRegistrationPageStepImpl.theLandingPageHasLinkForSeerResearchPlusInstruction(howRoRequestAccessToSeerDataLink);
	}

	@Then("fills out all required fields on the SEER Data registration form")
	public void fills_out_all_required_fields_on_the_SEER_Data_registration_form() {
		SEERUserRegistrationPageStepImpl.validateEmailFieldReadOnly();
		SEERDataRejectionStepImpl.fillsOutAllRequiredFieldsOnSEERDataRegistrationForm();
	}

	@Then("Submits the SEER User Registration form")
	public void submits_the_SEER_User_Registration_form() {
		SEERDataAccessRequestPageStepsImpl.submitsTheRegistrationForm();
	}

	@Then("customer account type will show as {string} in Native View")
	public void customer_account_type_will_show_as_in_Native_View(String publicAccount) {
		SEERDataAccessRequestPageStepsImpl.customerAccountTypeWillBeMarkedAsPublicInNativeView(publicAccount);
	}

	@Then("a user should see \\(which Federal Government Agencies can sign in with a PIV):")
	public void a_user_should_see_which_Federal_Government_Agencies_can_sign_in_with_a_PIV(String PIVCardLoginMessage) {
		SEERLandingPageStepImpl.userSeesTheFollowingPIVCardLoginMessage(PIVCardLoginMessage);
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