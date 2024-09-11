package CustomBusiness.Egrants.Steps;

import CustomBusiness.Egrants.StepsImplementation.EgrantsStepImplementation;
import appsCommon.PageInitializers.PageInitializer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class QuickLinkVerificationAndManagementMenuSteps extends PageInitializer {

	@Given("User is logged in the application and is on the landing page")
	public void user_is_logged_in_the_application_and_is_on_the_landing_page() {
		EgrantsStepImplementation.user_is_logged_in_the_application_and_is_on_the_landing_page();
	}

	@Given("User expands Quick Links")
	public void user_expands_quick_links() {
		EgrantsStepImplementation.clicks_on_quickLinks();
	}

	@Given("verifies that the logged in user {string} is shown")
	public void verifies_that_the_logged_in_user_is_shown(String user) {
		EgrantsStepImplementation.verifies_that_the_logged_in_user_is_shown(user);
	}

	@Given("User is able to navigate to {string} hyperlink")
	public void user_is_able_to_navigate_to_hyperlink(String linkText) {
		EgrantsStepImplementation.is_able_to_navigate_to_hyperlink(linkText);
	}

	@Given("User is on the Management menu")
	public void user_is_on_the_management_menu() {
		EgrantsStepImplementation.clicks_on_management_menu();
	}

	@When("User selects {string} as the QC Reason")
	public void user_selects_as_the_qc_reason(String change) {
		EgrantsStepImplementation.selects_qc_reason();
	}

	@When("User selects {string} as QC Person")
	public void user_selects_as_qc_person() {
		EgrantsStepImplementation.selects_qc_person();
	}

	@When("User clicks on Assign button to confirm the assignment")
	public void user_clicks_on_assign_button_to_confirm_the_assignment() {
		EgrantsStepImplementation.clicks_on_assign_button();
	}

	@Given("User clicks on FROM dropdown to select {string}")
	public void user_clicks_on_from_dropdown_to_select(String string) {
		EgrantsStepImplementation.clicks_on_from_dropdown();
	}

	@Given("User clicks on To dropdown to select {string}")
	public void user_clicks_on_to_dropdown_to_select() {
		EgrantsStepImplementation.clicks_on_to_dropdown();
	}

	@Given("User selects {int}% of the documents")
	public void user_selects_of_the_documents(Integer int1) {
		EgrantsStepImplementation.clicks_on_percentage_dropdown();
	}

	@Given("User clicks on Route button to confirm the routing")
	public void user_clicks_on_route_button() {
		EgrantsStepImplementation.clicks_on_route_button();
	}
}