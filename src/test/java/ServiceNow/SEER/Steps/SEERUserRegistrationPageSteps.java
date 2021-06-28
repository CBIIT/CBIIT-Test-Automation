package ServiceNow.SEER.Steps;

import org.junit.Assert;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;

import appsCommon.PageInitializer;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SEERUserRegistrationPageSteps extends PageInitializer {
	public static String newEmail = "seer" + CommonUtils.email;

<<<<<<< Updated upstream
	@When("the user enters an email address and continues with the email verification for Non-Institutional Accounts")
	public void the_user_enters_an_email_address_and_continues_with_the_email_verification_for_Non_Institutional_Accounts() {
		JavascriptUtils.scrollIntoView(seerLandingPage.nonInstitutionalAccountsEmailAddressField);
=======
<<<<<<< HEAD
	@When("the user enters an email address as {string} and continues with the email verification for Non-Institutional Accounts")
	public void the_user_enters_an_email_address_as_and_continues_with_the_email_verification_for_Non_Institutional_Accounts(
			String emailAddress) {
=======
	@When("the user enters an email address and continues with the email verification for Non-Institutional Accounts")
	public void the_user_enters_an_email_address_and_continues_with_the_email_verification_for_Non_Institutional_Accounts() {
		JavascriptUtils.scrollIntoView(seerLandingPage.nonInstitutionalAccountsEmailAddressField);
>>>>>>> 8f4e2d8f13237294dd99ecbb9a77e6b945dae2eb
>>>>>>> Stashed changes
		Assert.assertTrue("Verifying that the User entering email address for Non-Institutional Accounts",
				seerLandingPage.nonInstitutionalAccountsHeaderText.getText()
						.contentEquals("Non-Institutional Accounts"));
		MiscUtils.sleep(2000);
<<<<<<< Updated upstream
		CommonUtils.sendKeys(seerLandingPage.nonInstitutionalAccountsEmailAddressField, newEmail);
=======
<<<<<<< HEAD
		JavascriptUtils.scrollIntoView(seerLandingPage.nonInstitutionalAccountsEmailAddressField);
		MiscUtils.sleep(2000);
		CommonUtils.sendKeys(seerLandingPage.nonInstitutionalAccountsEmailAddressField, emailAddress);
=======
		CommonUtils.sendKeys(seerLandingPage.nonInstitutionalAccountsEmailAddressField, newEmail);
>>>>>>> 8f4e2d8f13237294dd99ecbb9a77e6b945dae2eb
>>>>>>> Stashed changes
		MiscUtils.sleep(2000);
		seerLandingPage.nonInstitutionalAccountsContinuetoEmailVerificationButton.click();
		MiscUtils.sleep(2000);
	}

	@When("fills out the SEER Registration form")
	public void fills_out_the_SEER_Registration_form() {
		String seerRegistrationPage = WebDriverUtils.getWebDriver().getTitle();
		Assert.assertTrue(seerRegistrationPage.contentEquals("SEER User Registration - ODS SEER Data Access Request"));
		seerUserRegistrationPage.seerUserRegistrationFirstNameField.sendKeys("Test");
		seerUserRegistrationPage.seerUserRegistrationMiddleNameField.sendKeys("Tester");
		seerUserRegistrationPage.seerUserRegistrationLastNameField.sendKeys("Testing");
		MiscUtils.sleep(2000);
<<<<<<< Updated upstream
		Assert.assertEquals(newEmail,
=======
<<<<<<< HEAD
		Assert.assertEquals("test@mail.com",
=======
		Assert.assertEquals(newEmail,
>>>>>>> 8f4e2d8f13237294dd99ecbb9a77e6b945dae2eb
>>>>>>> Stashed changes
				seerUserRegistrationPage.seerUserRegistrationEmailField.getAttribute("value"));
		Assert.assertTrue(
				seerUserRegistrationPage.seerUserRegistrationEmailField.getAttribute("disabled").equals("true"));
		MiscUtils.sleep(2000);
		seerUserRegistrationPage.seerUserRegistrationOrganizationField.click();
		seerUserRegistrationPage.seerUserRegistrationOrganizationField.sendKeys("A. T. Still University");
		MiscUtils.sleep(2000);
		seerUserRegistrationPage.seerUserRegistrationJobTitleField.sendKeys("Tester");
		JavascriptUtils.scrollIntoView(seerUserRegistrationPage.seerUserRegistrationEmailField);
		MiscUtils.sleep(2000);
		seerUserRegistrationPage.seerUserRegistrationCountryField.click();
		seerUserRegistrationPage.seerUserRegistrationCountryField.sendKeys("United States of America");
		seerUserRegistrationPage.seerUserRegistrationCountryUSA.click();
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
		seerUserRegistrationPage.seerUserRegistrationAddressField.sendKeys("330 Ivy Lane, Apartment 6");
		seerUserRegistrationPage.seerUserRegistrationCityField.sendKeys("NYC");
		seerUserRegistrationPage.seerUserRegistrationStateField.sendKeys("NY");
		seerUserRegistrationPage.seerUserRegistrationZipcodeField.sendKeys("11214");
		seerUserRegistrationPage.seerUserRegistrationPhoneField.sendKeys("6306543343");
		MiscUtils.sleep(2000);
	}

	@When("for {string} selects {string}")
	public void for_selects(String expectedWhichofTheseBestDescribeYouText,
			String UndergraduateOrGraduateStudentValue) {
		Assert.assertTrue(seerUserRegistrationPage.seerUserRegistrationWhichOfTheseBestDescribeYouText.getText()
				.contentEquals(expectedWhichofTheseBestDescribeYouText));
		MiscUtils.sleep(2000);
		CommonUtils.selectDropDownValue(UndergraduateOrGraduateStudentValue,
				seerUserRegistrationPage.seerUserRegistrationWhichOfTheseBestDescribeYouField);
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}

	@Then("the user is directed back to the landing page with a message indicating the user must request access via the Institutional Accounts option")
	public void the_user_is_directed_back_to_the_landing_page_with_a_message_indicating_the_user_must_request_access_via_the_Institutional_Accounts_option() {
		String landingPage = WebDriverUtils.getWebDriver().getTitle();
		Assert.assertTrue(landingPage.contentEquals("SEER Incidence Data Request - ODS SEER Data Access Request"));
		CommonUtils.waitForVisibility(seerLandingPage.warningTextForUndergraduateOrGraduateStudents);
		Assert.assertTrue(
				"Verifying the message indicating the user must request access via the Institutional Accounts option",
				seerLandingPage.warningTextForUndergraduateOrGraduateStudents.getText().contentEquals(
						"Undergraduate or Graduate Students should apply for Institutional access using their Institution affiliated email account."));
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}

	@Given("user proceeds with email verification for a Non-Institutional Account")
	public void user_proceeds_with_email_verification_for_a_Non_Institutional_Account() {
		JavascriptUtils.scrollIntoView(seerLandingPage.nonInstitutionalAccountsEmailAddressField);
		MiscUtils.sleep(2000);
		CommonUtils.sendKeys(seerLandingPage.nonInstitutionalAccountsEmailAddressField, "test@mail.com");
		MiscUtils.sleep(2000);
		seerLandingPage.nonInstitutionalAccountsContinuetoEmailVerificationButton.click();
		MiscUtils.sleep(2000);
	}

	@When("entering required information")
	public void entering_required_information() {
		String seerRegistrationPage = WebDriverUtils.getWebDriver().getTitle();
		Assert.assertTrue(seerRegistrationPage.contentEquals("SEER User Registration - ODS SEER Data Access Request"));
		seerUserRegistrationPage.seerUserRegistrationFirstNameField.sendKeys("Test");
		seerUserRegistrationPage.seerUserRegistrationMiddleNameField.sendKeys("Tester");
		seerUserRegistrationPage.seerUserRegistrationLastNameField.sendKeys("Testing");
		MiscUtils.sleep(2000);
		Assert.assertEquals("test@mail.com",
				seerUserRegistrationPage.seerUserRegistrationEmailField.getAttribute("value"));
		Assert.assertTrue(
				seerUserRegistrationPage.seerUserRegistrationEmailField.getAttribute("disabled").equals("true"));
		MiscUtils.sleep(2000);
		seerUserRegistrationPage.seerUserRegistrationOrganizationField.click();
		seerUserRegistrationPage.seerUserRegistrationOrganizationField.sendKeys("A. T. Still University");
		MiscUtils.sleep(2000);
		seerUserRegistrationPage.seerUserRegistrationJobTitleField.sendKeys("Tester");
		JavascriptUtils.scrollIntoView(seerUserRegistrationPage.seerUserRegistrationEmailField);
		MiscUtils.sleep(2000);
	}

	@When("entering and selecting {string} for Country field")
	public void entering_and_selecting_for_Country_field(String string) {
		seerUserRegistrationPage.seerUserRegistrationCountryField.click();
		seerUserRegistrationPage.seerUserRegistrationCountryField.sendKeys("United States of America");
		seerUserRegistrationPage.seerUserRegistrationCountryUSA.click();
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
		seerUserRegistrationPage.seerUserRegistrationAddressField.sendKeys("330 Ivy Lane, Apartment 6");
		MiscUtils.sleep(2000);
		seerUserRegistrationPage.seerUserRegistrationCityField.sendKeys("NYC");
		MiscUtils.sleep(2000);
		seerUserRegistrationPage.seerUserRegistrationPhoneField.sendKeys("6306543343");
		MiscUtils.sleep(2000);
		CommonUtils.selectDropDownValue("General Public",
				seerUserRegistrationPage.seerUserRegistrationWhichOfTheseBestDescribeYouField);
		MiscUtils.sleep(2000);
	}

	@When("submitting the registration form")
	public void submitting_the_registration_form() {
		seerUserRegistrationPage.seerUserRegistrationSubmitButton.click();
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}

	@Then("the user is not able to submit the registration form because the State and Zip Code fields are required")
	public void the_user_is_not_able_to_submit_the_registration_form_because_the_State_and_Zip_Code_fields_are_required() {
		String seerRegistrationPage = WebDriverUtils.getWebDriver().getTitle();
		Assert.assertTrue(seerRegistrationPage.contentEquals("SEER User Registration - ODS SEER Data Access Request"));
		Assert.assertTrue("Verifying State field is required",
				seerUserRegistrationPage.seerUserRegistrationStateStarSign.isDisplayed());
		Assert.assertTrue("Verifying Zip Code field is required",
				seerUserRegistrationPage.seerUserRegistrationZipcodeStarSign.isDisplayed());
		JavascriptUtils.drawBlueBorder(seerUserRegistrationPage.seerUserRegistrationStateStarSign);
		MiscUtils.sleep(2000);
		JavascriptUtils.drawBlueBorder(seerUserRegistrationPage.seerUserRegistrationZipcodeStarSign);
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}

	@When("the user enters an email address for Non-Institutional Account")
	public void the_user_enters_an_email_address_for_Non_Institutional_Account() {
		CommonUtils.sendKeys(seerLandingPage.nonInstitutionalAccountsEmailAddressField, "email@email.com");
		CucumberLogUtils.logScreenShot();
		CommonUtils.click(seerLandingPage.nonInstitutionalAccountsContinuetoEmailVerificationButton);
	}
	
	@When("user enters email address for a Non-Institutional Account")
	public void user_enters_email_address_for_a_Non_Institutional_Account() {
	    CommonUtils.sendKeys(seerLandingPage.nonInstitutionalAccountsEmailAddressField, "email@email.com");
	    CucumberLogUtils.logScreenShot();
		CommonUtils.click(seerLandingPage.nonInstitutionalAccountsContinuetoEmailVerificationButton);
	}
	
	@When("the user enter an email address for a Non-Institutional Account")
	public void the_user_enter_an_email_address_for_a_Non_Institutional_Account() {
		
		CommonUtils.sendKeys(seerLandingPage.nonInstitutionalAccountsEmailAddressField, newEmail);
		CucumberLogUtils.logScreenShot();
		CommonUtils.click(seerLandingPage.nonInstitutionalAccountsContinuetoEmailVerificationButton);
	}

	@When("fills out all required fields on the SEER Data registration page")
	public void fills_out_all_required_fields_on_the_SEER_Data_registration_page() {
		CommonUtils.sendKeys(seerUserRegistrationPage.seerUserRegistrationFirstNameField, "FirstName");
		CommonUtils.sendKeys(seerUserRegistrationPage.seerUserRegistrationLastNameField, "LastName");
		Assert.assertEquals(newEmail,
				seerUserRegistrationPage.seerUserRegistrationEmailField.getAttribute("value"));
		Assert.assertTrue(
				seerUserRegistrationPage.seerUserRegistrationEmailField.getAttribute("disabled").equals("true"));
		MiscUtils.sleep(1000);
		CommonUtils.click(seerUserRegistrationPage.seerUserRegistrationOrganizationField);
		CommonUtils.sendKeys(seerUserRegistrationPage.seerUserRegistrationOrganizationField, "American University");
		MiscUtils.sleep(1000);
		CommonUtils.click(seerUserRegistrationPage.seerUserRegistrationCountryField);
		CommonUtils.sendKeys(seerUserRegistrationPage.seerUserRegistrationCountryField, "United States of America");
		CommonUtils.click(seerUserRegistrationPage.seerUserRegistrationCountryUSA);
		MiscUtils.sleep(1000);
		CommonUtils.sendKeys(seerUserRegistrationPage.seerUserRegistrationAddressField, "123 Street");
		CommonUtils.sendKeys(seerUserRegistrationPage.seerUserRegistrationCityField, "City");
		CommonUtils.sendKeys(seerUserRegistrationPage.seerUserRegistrationStateField, "LA");
		CommonUtils.sendKeys(seerUserRegistrationPage.seerUserRegistrationZipcodeField, "12345");
		MiscUtils.sleep(1000);
		CommonUtils.sendKeys(seerUserRegistrationPage.seerUserRegistrationPhoneField, "1234567890");
		CommonUtils.selectDropDownValue("General Public",
				seerUserRegistrationPage.seerUserRegistrationWhichOfTheseBestDescribeYouField);
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}
	
	@When("fills out all required fields on SEER Data registration page")
	public void fills_out_all_required_fields_on_SEER_Data_registration_page() {
		CommonUtils.sendKeys(seerUserRegistrationPage.seerUserRegistrationFirstNameField, "FirstName");
		CommonUtils.sendKeys(seerUserRegistrationPage.seerUserRegistrationLastNameField, "LastName");
		Assert.assertEquals("email@email.com",
				seerUserRegistrationPage.seerUserRegistrationEmailField.getAttribute("value"));
		Assert.assertTrue(
				seerUserRegistrationPage.seerUserRegistrationEmailField.getAttribute("disabled").equals("true"));
		MiscUtils.sleep(1000);
		CommonUtils.click(seerUserRegistrationPage.seerUserRegistrationOrganizationField);
		CommonUtils.sendKeys(seerUserRegistrationPage.seerUserRegistrationOrganizationField, "American University");
		MiscUtils.sleep(1000);
		CommonUtils.click(seerUserRegistrationPage.seerUserRegistrationCountryField);
		CommonUtils.sendKeys(seerUserRegistrationPage.seerUserRegistrationCountryField, "United States of America");
		CommonUtils.click(seerUserRegistrationPage.seerUserRegistrationCountryUSA);
		MiscUtils.sleep(1000);
		CommonUtils.sendKeys(seerUserRegistrationPage.seerUserRegistrationAddressField, "123 Street");
		CommonUtils.sendKeys(seerUserRegistrationPage.seerUserRegistrationCityField, "City");
		CommonUtils.sendKeys(seerUserRegistrationPage.seerUserRegistrationStateField, "LA");
		CommonUtils.sendKeys(seerUserRegistrationPage.seerUserRegistrationZipcodeField, "12345");
		MiscUtils.sleep(1000);
		CommonUtils.sendKeys(seerUserRegistrationPage.seerUserRegistrationPhoneField, "1234567890");
		CommonUtils.selectDropDownValue("General Public",
				seerUserRegistrationPage.seerUserRegistrationWhichOfTheseBestDescribeYouField);
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}

	@When("submits the registration form")
	public void submits_the_registration_form() {
		CommonUtils.click(seerUserRegistrationPage.seerUserRegistrationSubmitButton);
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}

	@Then("the {string} page displays")
	public void the_page_displays(String registrationIsCompleteText) {
		MiscUtils.sleep(2000);
		String seerRegistrationIsCompletePage = WebDriverUtils.getWebDriver().getTitle();
		Assert.assertEquals("SEER Data Confirmation - ODS SEER Data Access Request", seerRegistrationIsCompletePage);
		Assert.assertEquals(registrationIsCompleteText,
				seerUserRegistrationPage.seerUserRegistrationIsCompleteHeader.getText());
		CucumberLogUtils.logScreenShot();
	}

	@Then("the page header displays as {string}")
	public void the_page_header_displays_as(String seerIncidenceDatabasDetailsText) {
		Assert.assertEquals(seerIncidenceDatabasDetailsText,
				seerUserRegistrationPage.seerUserRegistrationIncidenceDatabaseDetailsLink.getText());
		CucumberLogUtils.logScreenShot();
	}

	@Then("the following text also displays")
	public void the_following_text_also_displays(String registrationIsCompleteFullText) {
		Assert.assertEquals(registrationIsCompleteFullText,
				seerUserRegistrationPage.seerUserRegistrationConfirmationText.getText());
		CucumberLogUtils.logScreenShot();
	}

	@Then("the <- Back to SEER Database details button displays")
	public void the_Back_to_SEER_Database_details_button_displays() {
		Assert.assertEquals("← Back to SEER Database details",
				seerUserRegistrationPage.seerUserRegistrationBackToSeerDatabaseDetailsButton.getText());
		CucumberLogUtils.logScreenShot();
	}

	@Then("the following SEER information text displays on the bottom of the page")
	public void the_following_SEER_information_text_displays_on_the_bottom_of_the_page(
			String seerIsSupportedByTheSurveillanceResearchProgramText) {
		Assert.assertEquals(seerIsSupportedByTheSurveillanceResearchProgramText,
				seerUserRegistrationPage.seerUserRegistrationSeerIsSupportedByTheSurveillanceResearchProgramText
						.getText());
		CucumberLogUtils.logScreenShot();
	}
	
	@Then("the following breadcrumbs are displayed {string}, {string}, {string}, {string}, {string}")
	public void the_following_breadcrumbs_are_displayed(String homeBreadcrumb, String dataAndSoftwareBreadcrumb, String incidenceDatabaseBreadcrumb, String requestSeerIncidenceDataBreadcrumb, String submissionConfirmationBreadcrumb) {
	    Assert.assertEquals(homeBreadcrumb, seerLandingPage.seerHomeBreadcrumb.getText());
	    Assert.assertEquals(dataAndSoftwareBreadcrumb, seerLandingPage.seerDataAndSoftwareBreadcrumb.getText());
	    Assert.assertEquals(incidenceDatabaseBreadcrumb, seerLandingPage.seerIncidenceDatabaseBreadcrumb.getText());
	    Assert.assertEquals(requestSeerIncidenceDataBreadcrumb, seerLandingPage.seerRequestSeerIncidenceDataBreadcrumb.getText());
	    Assert.assertEquals(submissionConfirmationBreadcrumb, seerLandingPage.seerSubmissionConfirmationBreadcrumb.getText());
	    CucumberLogUtils.logScreenShot();
	}
}
