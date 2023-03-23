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

	@When("fills out the SEER Registration form")
	public void fills_out_the_SEER_Registration_form() {

		seerUserRegistrationPage.seerUserRegistrationFirstNameField.sendKeys("Test");
		seerUserRegistrationPage.seerUserRegistrationMiddleNameField.sendKeys("Tester");
		seerUserRegistrationPage.seerUserRegistrationLastNameField.sendKeys("Testing");
		Assert.assertEquals("test@mail.com",
				seerUserRegistrationPage.seerUserRegistrationEmailField.getAttribute("value"));
		Assert.assertTrue(
				seerUserRegistrationPage.seerUserRegistrationEmailField.getAttribute("disabled").equals("true"));
		CommonUtils.waitForVisibility(seerUserRegistrationPage.seerUserRegistrationOrganizationField);
		seerUserRegistrationPage.seerUserRegistrationOrganizationField.click();
		seerUserRegistrationPage.seerUserRegistrationOrganizationField.sendKeys("A. T. Still University");
		MiscUtils.sleep(2000);
		seerUserRegistrationPage.seerUserRegistrationJobTitleField.sendKeys("Tester");
		JavascriptUtils.scrollIntoView(seerUserRegistrationPage.seerUserRegistrationEmailField);
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

	@Given("user proceeds with email verification for Research Data Requests")
	public void user_proceeds_with_email_verification_for_Research_Data_Requests() {
		JavascriptUtils.scrollIntoView(seerLandingPage.researchDataRequestsEmailAddressField);
		CommonUtils.waitForVisibility(seerLandingPage.researchDataRequestsEmailAddressField);
		CommonUtils.sendKeys(seerLandingPage.researchDataRequestsEmailAddressField, "test@mail.com");

		/*
		 * ----- UPDATE BELOW -----
		 */
		CommonUtils.waitForVisibility(seerLandingPage.registerForResearchDataButton);
		seerLandingPage.registerForResearchDataButton.click();
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}

	@When("entering required information")
	public void entering_required_information() {
		String seerRegistrationPage = WebDriverUtils.getWebDriver().getTitle();
		Assert.assertTrue(seerRegistrationPage.contentEquals("SEER User Registration - ODS SEER Data Access Request"));
		seerUserRegistrationPage.seerUserRegistrationFirstNameField.sendKeys("Test");
		seerUserRegistrationPage.seerUserRegistrationMiddleNameField.sendKeys("Tester");
		seerUserRegistrationPage.seerUserRegistrationLastNameField.sendKeys("Testing");
		Assert.assertEquals("test@mail.com",
				seerUserRegistrationPage.seerUserRegistrationEmailField.getAttribute("value"));
		Assert.assertTrue(
				seerUserRegistrationPage.seerUserRegistrationEmailField.getAttribute("disabled").equals("true"));
		CommonUtils.waitForVisibility(seerUserRegistrationPage.seerUserRegistrationOrganizationField);
		seerUserRegistrationPage.seerUserRegistrationOrganizationField.click();
		seerUserRegistrationPage.seerUserRegistrationOrganizationField.sendKeys("A. T. Still University");
		CommonUtils.waitForVisibility(seerUserRegistrationPage.seerUserRegistrationJobTitleField);
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
		seerUserRegistrationPage.seerUserRegistrationCityField.sendKeys("NYC");
		seerUserRegistrationPage.seerUserRegistrationPhoneField.sendKeys("6306543343");
		CommonUtils.selectDropDownValue("General Public",
				seerUserRegistrationPage.seerUserRegistrationWhichOfTheseBestDescribeYouField);
		MiscUtils.sleep(2000);
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

	@When("user enters email address for a Non-Institutional Account")
	public void user_enters_email_address_for_a_Non_Institutional_Account() {
		CommonUtils.sendKeys(seerLandingPage.researchDataRequestsEmailAddressField, newEmail);
		CucumberLogUtils.logScreenShot();
		CommonUtils.click(seerLandingPage.registerForResearchDataButton);
	}

	@When("the user enter an email address for a Non-Institutional Account")
	public void the_user_enter_an_email_address_for_a_Non_Institutional_Account() {

		CommonUtils.sendKeys(seerLandingPage.researchDataRequestsEmailAddressField, newEmail);
		CucumberLogUtils.logScreenShot();
		CommonUtils.click(seerLandingPage.registerForResearchDataButton);
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
		seerDataAccessRequestPageStepsImpl.fillingOutRegistrationForm();
	}

	@When("submits the registration form")
	public void submits_the_registration_form() {
		CommonUtils.waitForVisibility(seerUserRegistrationPage.seerUserRegistrationSubmitButton);
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
		System.out.println(seerUserRegistrationPage.seerUserRegistrationConfirmationText.getText());
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
	public void the_following_breadcrumbs_are_displayed(String homeBreadcrumb, String dataAndSoftwareBreadcrumb,
			String incidenceDatabaseBreadcrumb, String requestSeerIncidenceDataBreadcrumb,
			String submissionConfirmationBreadcrumb) {
		Assert.assertEquals(homeBreadcrumb, seerLandingPage.seerHomeBreadcrumb.getText());
		Assert.assertEquals(dataAndSoftwareBreadcrumb, seerLandingPage.seerDataAndSoftwareBreadcrumb.getText());
		Assert.assertEquals(incidenceDatabaseBreadcrumb, seerLandingPage.seerIncidenceDatabaseBreadcrumb.getText());
		Assert.assertEquals(requestSeerIncidenceDataBreadcrumb,
				seerLandingPage.seerRequestSeerIncidenceDataBreadcrumb.getText());
		Assert.assertEquals(submissionConfirmationBreadcrumb,
				seerLandingPage.seerSubmissionConfirmationBreadcrumb.getText());
		CucumberLogUtils.logScreenShot();
	}
}
