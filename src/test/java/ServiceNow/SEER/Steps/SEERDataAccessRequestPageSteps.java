package ServiceNow.SEER.Steps;

import ServiceNow.SEER.StepsImplementation.SEERDataAccessRequestPageStepsImpl;
import ServiceNow.SEER.StepsImplementation.SEERUserRegistrationPageStepImpl;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.xceptions.TestingException;
import appsCommon.PageInitializer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SEERDataAccessRequestPageSteps extends PageInitializer {

	@Given("a SEER User Registration has been successfully submitted")
	public void a_SEER_User_Registration_has_been_successfully_submitted() throws TestingException {
		SEERUserRegistrationPageStepImpl.aSEERUserRegistrationHasBeenSuccessfullySubmitted();
	}

	@Given("user verifies email address by clicking on the email verification link that is sent to the user after submitting a SEER User registration form")
	public void user_verifies_email_address_by_clicking_on_the_email_verification_link_that_is_sent_to_the_user_after_submitting_a_SEER_User_registration_form()
			throws TestingException {
		SEERDataAccessRequestPageStepsImpl.userVerifiesEmailAddressByClickingOnTheEmailVerificationLinkThatIsSentToTheUserAfterSubmittingASEERUserRegistrationForm();
	}

	@Then("the user is directed to the {string} page")
	public void the_user_is_directed_to_the_page(String landingPageHeaderText) {
		SEERDataAccessRequestPageStepsImpl.theUserIsDirectedToThePage(landingPageHeaderText);
	}

	@Then("the {string} field contains the name of the requestor in read-only format")
	public void the_field_contains_the_name_of_the_requestor_in_read_only_format(String requestedFor) {
		SEERDataAccessRequestPageStepsImpl.theFieldContainsTheNameOfTheRequestorInReadOnlyFormat(requestedFor);
	}

	@Then("the {string} field displays with {string} in read-only format")
	public void the_field_displays_with_in_read_only_format(String databaseType, String seerResearchDatabase) {
		SEERDataAccessRequestPageStepsImpl.theFieldDisplaysWithInReadOnlyFormat(databaseType, seerResearchDatabase);
	}

	@Then("the user can select a general purpose for using the data")
	public void the_user_can_select_a_general_purpose_for_using_the_data() {
		SEERDataAccessRequestPageStepsImpl.theUserCanSelectAGeneralPurposeForUsingTheData();
	}

	@Then("before entering initials for {string} the text box for initials is displays with the users initials in read-only mode")
	public void before_entering_initials_for_the_text_box_for_initials_is_displays_with_the_users_initials_in_read_only_mode(String IUnderstandTheLimitationsOfTreatmentData) {
		SEERDataAccessRequestPageStepsImpl.beforeEnteringInitialsForTheTextBoxForInitialsIsDisplaysWithTheUsersInitialsInReadOnlyMode(IUnderstandTheLimitationsOfTreatmentData);
	}

	@Then("the I Understand the limitations of treatment data text agreement displayed")
	public void the_I_Understand_the_limitations_of_treatment_data_text_agreement_displayed() {
		SEERDataAccessRequestPageStepsImpl.theIUnderstandTheLimitationsOfTreatmentDataTextAgreementDisplayed();
	}

	@Then("before entering initials for {string} the Initials text box displays with the users initials in read-only mode")
	public void before_entering_initials_for_the_Initials_text_box_displays_with_the_users_initials_in_read_only_mode(
			String dataUseAgreementCertification) {
		SEERDataAccessRequestPageStepsImpl.beforeEnteringInitialsForTheInitialsTextBoxDisplaysWithTheUsersInitialsInReadOnlyMode(dataUseAgreementCertification);
	}

	@Then("the Data Use Agreement Certification text agreement displayed")
	public void the_Data_Use_Agreement_Certification_text_agreement_displayed() {
		SEERDataAccessRequestPageStepsImpl.theDataUseAgreementCertificationTextAgreementDisplayed();
	}

	@Then("before entering initials for {string}, the users initials display in read only format")
	public void before_entering_initials_for_the_users_initials_display_in_read_only_format(
			String bestPracticeAssurance) {
		SEERDataAccessRequestPageStepsImpl.beforeEnteringInitialsForTheUsersInitialsDisplayInReadOnlyFormat(bestPracticeAssurance);
	}

	@Then("the Best Practice Assurance text displayed")
	public void the_Best_Practice_Assurance_text_displayed() {
		SEERDataAccessRequestPageStepsImpl.theBestPracticeAssuranceTextDisplayed();
	}

	@Then("when the user scrolls down each agreement")
	public void when_the_user_scrolls_down_each_agreement() {
		SEERDataAccessRequestPageStepsImpl.whenTheUserScrollsDownEachAgreement();
	}

	@Then("the user is able to enter intials")
	public void the_user_is_able_to_enter_intials() {
		SEERDataAccessRequestPageStepsImpl.theUserIsAbleToEnterIntials();
	}

	@Then("SEER information is displayed on the bottom of the page as follows:")
	public void seer_information_is_displayed_on_the_bottom_of_the_page_as_follows(String expectedText) {
		SEERDataAccessRequestPageStepsImpl.seerInformationIsDisplayedOnTheBottomOfThePageAsFollows(expectedText);
	}

	@Then("after entering required information, the user is able to successfully submit the SEER Data Access Request form")
	public void after_entering_required_information_the_user_is_able_to_successfully_submit_the_SEER_Data_Access_Request_form() {
		SEERDataAccessRequestPageStepsImpl.afterEnteringRequiredInformationTheUserIsAbleToSuccessfullySubmitTheSEERDataAccessRequestForm();
	}

	@Then("the {string} bread crumb displays")
	public void the_bread_crumb_displays(String seerIncidenceDatabaseLink) {
		SEERDataAccessRequestPageStepsImpl.theBreadCrumbDisplays(seerIncidenceDatabaseLink);
	}

	@Then("when clicking, user is directed to {string}")
	public void when_clicking_user_is_directed_to(String seerIncidenceDatabaseUrl) {
		SEERDataAccessRequestPageStepsImpl.whenClickingUserIsDirectedTo(seerIncidenceDatabaseUrl);
	}

	@When("the user enters an email address for a Non-Institutional Account")
	public void the_user_enters_an_email_address_for_a_Non_Institutional_Account() {
		SEERDataAccessRequestPageStepsImpl.theUserEntersAnEmailAddressForANonInstitutionalAccount();
	}

	@When("the user is on the {string} page")
	public void the_user_is_on_the_page(String seerUserRegistrationHeader) {
		SEERDataAccessRequestPageStepsImpl.theUserIsOnThePage(seerUserRegistrationHeader);
	}

	@Then("user is directed to the {string} page")
	public void user_is_directed_to_the_page(String seerRegistrationIsCompleteText) {
		SEERDataAccessRequestPageStepsImpl.userIsDirectedToTheRegistrationPage(seerRegistrationIsCompleteText);
	}

	@When("user confirms their email address by clicking on the email verifation link sent to the users email address")
	public void user_confirms_their_email_address_by_clicking_on_the_email_verifation_link_sent_to_the_users_email_address()
			throws TestingException {
		SEERDataAccessRequestPageStepsImpl.userConfirmsTheirEmailAddressByClickingOnTheEmailVerificationLinkSentToTheUsersEmailAddress();
	}

	@Then("the user is directed to {string} page")
	public void the_user_is_directed_to_page(String seerDataAccessRequestPageText) {
		SEERDataAccessRequestPageStepsImpl.theUserIsDirectedToPage(seerDataAccessRequestPageText);
	}

	@Then("the user has to select a general purpose for using the data")
	public void the_user_has_to_select_a_general_purpose_for_using_the_data() {
		SEERDataAccessRequestPageStepsImpl.theUserHasToSelectAGeneralPurposeForUsingTheData();
	}

	@Then("also has to agree by typing initials to the Data Use Agreement Certification and Best Practice Assurance")
	public void also_has_to_agree_by_typing_initials_to_the_Data_Use_Agreement_Certification_and_Best_Practice_Assurance() {
		SEERDataAccessRequestPageStepsImpl.alsoHasToAgreeByTypingInitialsToTheDataUseAgreementCertificationAndBestPracticeAssurance();
	}

	@When("successfully submitting the SEER Data Request form")
	public void successfully_submitting_the_SEER_Data_Request_form() {
		CommonUtils.click(seerDataAccessRequestPage.seerDataAccessSubmitButton);
	}

	@Then("the page {string} displays")
	public void the_page_displays(String yourDataAccessRequestIsCompleteHeader) {
		SEERDataAccessRequestPageStepsImpl.thePageDisplays(yourDataAccessRequestIsCompleteHeader);
	}
}