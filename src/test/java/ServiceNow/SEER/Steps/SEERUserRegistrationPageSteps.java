package ServiceNow.SEER.Steps;

import ServiceNow.SEER.StepsImplementation.SEERDataAccessRequestPageStepsImpl;
import ServiceNow.SEER.StepsImplementation.SEERUserRegistrationPageStepImpl;
import com.nci.automation.web.CommonUtils;
import appsCommon.PageInitializer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class SEERUserRegistrationPageSteps extends PageInitializer {
	public static String newEmail = "seer" + CommonUtils.email;

	@When("fills out the SEER Registration form")
	public void fills_out_the_SEER_Registration_form() {
	SEERUserRegistrationPageStepImpl.fillsOutTheSEERRegistrationFormNonInstitutional();
	}

	@Given("user proceeds with email verification for Research Data Requests")
	public void user_proceeds_with_email_verification_for_Research_Data_Requests() {
		SEERDataAccessRequestPageStepsImpl.enterEmailAddress283();
	}

	@When("entering required information except State and Zip code")
	public void entering_required_information_except_State_and_Zip_code() {
		SEERUserRegistrationPageStepImpl.fillingOutRegistrationFormWithoutStateAndZip();
	}

	@When("entering and selecting {string} for Country field")
	public void entering_and_selecting_for_Country_field(String USA) {
		SEERDataAccessRequestPageStepsImpl.enteringAndSelectingForCountryField(USA);
	}

	@Then("the user is not able to submit the registration form because the State and Zip Code fields are required")
	public void the_user_is_not_able_to_submit_the_registration_form_because_the_State_and_Zip_Code_fields_are_required() {
		SEERDataAccessRequestPageStepsImpl.theUserIsNotAbleToSubmitTheRegistrationFormBecauseTheStateAndZipCodeFieldsAreRequired();
	}

	@When("user enters email address for a Non-Institutional Account")
	public void user_enters_email_address_for_a_Non_Institutional_Account() {
		SEERDataAccessRequestPageStepsImpl.enterEmailAddress286();
	}

	@When("the user enter an email address for a Non-Institutional Account")
	public void the_user_enter_an_email_address_for_a_Non_Institutional_Account() {
		SEERDataAccessRequestPageStepsImpl.enterEmailAddress285();
	}

	@When("user enter an email address for a Non-Institutional Account")
	public void user_enter_an_email_address_for_a_Non_Institutional_Account() {
		SEERDataAccessRequestPageStepsImpl.enterEmailAddress399();
		}

	@When("fills out all required fields on SEER Data registration page except Organization")
	public void fills_out_all_required_fields_on_SEER_Data_registration_page_except_Organization() {
		SEERUserRegistrationPageStepImpl.validateEmailFieldReadOnly();
		SEERUserRegistrationPageStepImpl.fillingOutRegistrationFormOrganizationNotFound();
	}

	@Then("user should not be able to select {string} as an Organization option")
	public void user_should_not_be_able_to_select_as_an_Organization_option(String organizationOption) {
		SEERUserRegistrationPageStepImpl.userShouldNotBeAleToSelectAsAnOrganizationOption(organizationOption);
	}

	@When("fills out all required fields on the SEER Data registration page")
	public void fills_out_all_required_fields_on_the_SEER_Data_registration_page() {
		SEERUserRegistrationPageStepImpl.validateEmailFieldReadOnly();
		SEERUserRegistrationPageStepImpl.fillingOutRegistrationForm();
	}

	@When("the user enters email address for a Non-Institutional Account")
	public void the_user_enters_email_address_for_a_Non_Institutional_Account() {
		SEERDataAccessRequestPageStepsImpl.enterEmailAddress284();
	}

	@When("fills out all required fields on SEER Data registration page")
	public void fills_out_all_required_fields_on_SEER_Data_registration_page() {
		SEERUserRegistrationPageStepImpl.validateEmailFieldReadOnly();
		SEERUserRegistrationPageStepImpl.fillingOutRegistrationForm();
	}

	@When("submits the registration form")
	public void submits_the_registration_form() {
		SEERDataAccessRequestPageStepsImpl.submitsTheRegistrationForm();
	}

	@Then("the user lands on the {string} page")
	public void the_user_lands_on_the_page(String registrationIsCompleteText) {
		SEERDataAccessRequestPageStepsImpl.theUserLandsOnThePage(registrationIsCompleteText);
	}

	@Then("the page header displays as {string}")
	public void the_page_header_displays_as(String seerIncidenceDatabasDetailsText) {
		SEERDataAccessRequestPageStepsImpl.thePageHeaderDisplaysAs(seerIncidenceDatabasDetailsText);
	}

	@Then("the following text also displays")
	public void the_following_text_also_displays(String registrationIsCompleteFullText) {
		SEERDataAccessRequestPageStepsImpl.theFollowingTextAlsoDisplays(registrationIsCompleteFullText);
	}

	@Then("the <- Back to SEER Database details button displays")
	public void the_Back_to_SEER_Database_details_button_displays() {
		SEERDataAccessRequestPageStepsImpl.theBackToSEERDatabaseDetailsButtonDisplays();
	}

	@Then("the following SEER information text displays on the bottom of the page")
	public void the_following_SEER_information_text_displays_on_the_bottom_of_the_page(
			String seerIsSupportedByTheSurveillanceResearchProgramText) {
		SEERDataAccessRequestPageStepsImpl.theFollowingSEERInformationTextDisplaysOnTheBottomOfThePage(seerIsSupportedByTheSurveillanceResearchProgramText);
	}

	@Then("the following breadcrumbs are displayed {string}, {string}, {string}, {string}, {string}")
	public void the_following_breadcrumbs_are_displayed(String homeBreadcrumb, String dataAndSoftwareBreadcrumb,
														String incidenceDatabaseBreadcrumb, String requestSeerIncidenceDataBreadcrumb,
														String submissionConfirmationBreadcrumb) {
		SEERDataAccessRequestPageStepsImpl.theFollowingBreadcrumbsAreDisplayed(homeBreadcrumb, dataAndSoftwareBreadcrumb,
				incidenceDatabaseBreadcrumb, requestSeerIncidenceDataBreadcrumb, submissionConfirmationBreadcrumb);
	}
}