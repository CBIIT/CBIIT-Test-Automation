package ServiceNow.SEER.Steps;

import org.junit.Assert;
import org.openqa.selenium.Keys;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;

import appsCommon.PageInitializer;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class SEERDataAccessRequestPageSteps extends PageInitializer {

	@Given("a SEER User Registration has been successfully submitted")
	public void a_SEER_User_Registration_has_been_successfully_submitted()  throws TestingException{
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("SEERDataAccess"));
		MiscUtils.sleep(2000);
		JavascriptUtils.scrollIntoView(seerLandingPage.nonInstitutionalAccountsEmailAddressField);
		MiscUtils.sleep(2000);
		CommonUtils.sendKeys(seerLandingPage.nonInstitutionalAccountsEmailAddressField, "test@email.com");
		MiscUtils.sleep(2000);
		seerLandingPage.nonInstitutionalAccountsContinuetoEmailVerificationButton.click();
		MiscUtils.sleep(2000);
		String seerRegistrationPage = WebDriverUtils.getWebDriver().getTitle();
		Assert.assertTrue(seerRegistrationPage.contentEquals("SEER User Registration - ODS SEER Data Access Request"));
		seerUserRegistrationPage.seerUserRegistrationFirstNameField.sendKeys("TestFIRSTname");
		seerUserRegistrationPage.seerUserRegistrationMiddleNameField.sendKeys("TestMIDDLEname");
		seerUserRegistrationPage.seerUserRegistrationLastNameField.sendKeys("TestLASTname");
		MiscUtils.sleep(2000);
		Assert.assertEquals("test@email.com",seerUserRegistrationPage.seerUserRegistrationEmailField.getAttribute("value"));
		Assert.assertTrue( seerUserRegistrationPage.seerUserRegistrationEmailField.getAttribute("disabled").equals("true"));
		MiscUtils.sleep(2000);
		seerUserRegistrationPage.seerUserRegistrationOrganizationField.click();
		seerUserRegistrationPage.seerUserRegistrationOrganizationField.sendKeys("A. T. Still University");
		MiscUtils.sleep(2000);
		seerUserRegistrationPage.seerUserRegistrationJobTitleField.sendKeys("TestJOBtitle");
		JavascriptUtils.scrollIntoView(seerUserRegistrationPage.seerUserRegistrationEmailField);
		MiscUtils.sleep(2000);
		seerUserRegistrationPage.seerUserRegistrationCountryField.click();
		seerUserRegistrationPage.seerUserRegistrationCountryField.sendKeys("United States of America");
		seerUserRegistrationPage.seerUserRegistrationCountryUSA.click();
		MiscUtils.sleep(2000);
		seerUserRegistrationPage.seerUserRegistrationAddressField.sendKeys("330 Ivy Lane, Apartment 6");
		seerUserRegistrationPage.seerUserRegistrationCityField.sendKeys("NYC");
		seerUserRegistrationPage.seerUserRegistrationStateField.sendKeys("NY");
		seerUserRegistrationPage.seerUserRegistrationZipcodeField.sendKeys("11214");
		seerUserRegistrationPage.seerUserRegistrationPhoneField.sendKeys("6306543343");
		MiscUtils.sleep(2000);
		CommonUtils.selectDropDownValue("General Public",
				seerUserRegistrationPage.seerUserRegistrationWhichOfTheseBestDescribeYouField);
		MiscUtils.sleep(2000);
		seerUserRegistrationPage.seerUserRegistrationSubmitButton.click();
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
		MiscUtils.sleep(2000);
		String seerRegistrationIsCompletePage = WebDriverUtils.getWebDriver().getTitle();
		Assert.assertEquals("SEER Data Confirmation - ODS SEER Data Access Request", seerRegistrationIsCompletePage);
		Assert.assertEquals("Thank you - your registration is complete.", seerUserRegistrationPage.seerUserRegistrationIsCompleteHeader.getText());	
 		MiscUtils.sleep(2000);
 		CucumberLogUtils.logScreenShot();

	}

	@Given("user verifies email address by clicking on the email verification link that is sent to the user after submitting a SEER User registration form")
	public void user_verifies_email_address_by_clicking_on_the_email_verification_link_that_is_sent_to_the_user_after_submitting_a_SEER_User_registration_form() throws TestingException{
		nativeViewLoginImpl.nativeViewLogin();
		CommonUtils.waitForVisibility(nativeViewEnrollementsPage.filterNavigator);
		nativeViewEnrollementsPage.filterNavigator.sendKeys("mailbox");
		MiscUtils.sleep(2000);
		JavascriptUtils.scrollIntoView(nativeViewSentViewPage.nativeViewmailboxSentLink);
		MiscUtils.sleep(20000);
		nativeViewSentViewPage.nativeViewmailboxSentLink.click();
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
		CommonUtils.switchToFrame(nativeViewSentViewPage.nativeViewFrame);
		MiscUtils.sleep(2000);
		CommonUtils.selectDropDownValue("Recipients", nativeViewSentViewPage.nativeViewSearchDropDown);
		MiscUtils.sleep(2000);
		nativeViewSentViewPage.nativeViewSentSearchField.sendKeys("test@email.com");
		nativeViewSentViewPage.nativeViewSentSearchField.sendKeys(Keys.ENTER);
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
		nativeViewSentViewPage.nativeViewPreviewVerifyEmailIcon.click();
		MiscUtils.sleep(2000);
		nativeViewSentViewPage.NativeViewPreviewVerifyEmailOpenRecordButton.click();
		MiscUtils.sleep(2000);
		JavascriptUtils.scrollIntoView(nativeViewSentViewPage.nativeViewPreviewVerifyEmailPreviewHTMLBodyLink);
		MiscUtils.sleep(2000);
		nativeViewSentViewPage.nativeViewPreviewVerifyEmailPreviewHTMLBodyLink.click();
		CommonUtils.switchToFrame(nativeViewSentViewPage.nativeViewPreviewEmailIFRAME);
		MiscUtils.sleep(2000);
		Assert.assertTrue(nativeViewSentViewPage.nativeViewPreviewEmailSEERIncidenceDataHeader.getText().contentEquals("SEER Incidence Data: Verify your email address"));
		Assert.assertTrue(nativeViewSentViewPage.nativeViewPreviewEmailHelloNameText.getText().contentEquals("Hello TestFIRSTname,")); 
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
		nativeViewSentViewPage.nativeViewPreviewEmailVerifyEMAILlink.click();
		MiscUtils.sleep(5000);
		
		
	}

	@Then("the user is directed to the {string} page")
	public void the_user_is_directed_to_the_page(String landingPageHeaderText) {
		String landingPageTitle = WebDriverUtils.getWebDriver().getTitle();
		Assert.assertTrue(landingPageTitle.contentEquals("Verify your email address - SEER Data Access User Registration | Email | NCI at Your Service"));
		MiscUtils.sleep(2000);
		//Assert.assertTrue(seerDataAccessRequestPage.seerDataAccessRequestHeader.getText().contentEquals(landingPageHeaderText));
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}

	@Then("the {string} field contains the name of the requestor in read-only format")
	public void the_field_contains_the_name_of_the_requestor_in_read_only_format(String requestedFor) {
		//Assert.assertTrue(seerDataAccessRequestPage.requestedForText.getText().contentEquals(requestedFor));
	//	Assert.assertEquals("TestFIRSTname TestLASTname",seerDataAccessRequestPage.requestedForField.getAttribute("value"));
	//	Assert.assertTrue( seerUserRegistrationPage.seerUserRegistrationEmailField.getAttribute("disabled").equals("true"));
//		seerDataAccessRequestPage.iUnderstandTheLimitationOfTreatmentDataContentText.click();
//		MiscUtils.sleep(2000);
//		JavascriptUtils.scrollIntoView(seerDataAccessRequestPage.iUnderstandTheLimitationOfTreatmentDataContentTextLastParagraph);
//		seerDataAccessRequestPage.iUnderstandTheLimitationOfTreatmentDataInitialsfield.sendKeys("TT");
//		MiscUtils.sleep(2000);
//		CucumberLogUtils.logScreenShot();
	}

	@Then("the {string} field displays with {string} in read-only format")
	public void the_field_displays_with_in_read_only_format(String string, String string2) {
	
	}

	@Then("the user can select a general purpose for using the data")
	public void the_user_can_select_a_general_purpose_for_using_the_data() {
		
	}

	@Then("user can enter official first name, official last name, and official email address")
	public void user_can_enter_official_first_name_official_last_name_and_official_email_address() {
	}	

	@Then("user can select Yes to {string}")
	public void user_can_select_Yes_to(String string) {
		
	}

	@Then("user can enter a plan to {string}")
	public void user_can_enter_a_plan_to(String string) {
		
	}

	@Then("before entering initials for {string} the Initials text box displays with the users initials in read-only mode")
	public void before_entering_initials_for_the_Initials_text_box_displays_with_the_users_initials_in_read_only_mode(
			String string) {
	}

	@Then("the {string} text agreement displays as followed")
	public void the_text_agreement_displays_as_followed(String string, String docString) {
	}

	@Then("before entering initials for {string}, the users initials display in read only format")
	public void before_entering_initials_for_the_users_initials_display_in_read_only_format(String string) {
	
	}

	@Then("the Data Use Agreement Certification text displays as the following:")
	public void the_Data_Use_Agreement_Certification_text_displays_as_the_following(String docString) {
	
	}

	@Then("before entering initials for {string}, the users initials are displayed in read-only format")
	public void before_entering_initials_for_the_users_initials_are_displayed_in_read_only_format(String string) {

	}

	@Then("the Best Practice Assurance text displays as follows:")
	public void the_Best_Practice_Assurance_text_displays_as_follows(String docString) {
	
	}

	@Then("when the user scrolls down each agreement")
	public void when_the_user_scrolls_down_each_agreement() {

	}

	@Then("the user is able to enter intials")
	public void the_user_is_able_to_enter_intials() {
	
	}

	@Then("SEER information is displayed on the bottom of the page as follows:")
	public void seer_information_is_displayed_on_the_bottom_of_the_page_as_follows(String docString) {
		
	}

	@Then("after entering required information, the user is able to successfully submit the SEER Data Access Request form")
	public void after_entering_required_information_the_user_is_able_to_successfully_submit_the_SEER_Data_Access_Request_form() {
	
	}

}