package ServiceNow.SEER.Steps;

import java.util.Iterator;
import java.util.Set;

import ServiceNow.SEER.Constants.Registration_Constants;
import ServiceNow.SEER.Constants.SEERDataAccessRequest_Constants;
import ServiceNow.SEER.StepsImplementation.SEERUserRegistrationPageStepImpl;
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
import cucumber.api.java.en.When;

public class SEERDataAccessRequestPageSteps extends PageInitializer {

	@Given("a SEER User Registration has been successfully submitted")
	public void a_SEER_User_Registration_has_been_successfully_submitted() throws TestingException {
		SEERUserRegistrationPageStepImpl.aSEERUserRegistrationHasBeenSuccessfullySubmitted();
	}

	@Given("user verifies email address by clicking on the email verification link that is sent to the user after submitting a SEER User registration form")
	public void user_verifies_email_address_by_clicking_on_the_email_verification_link_that_is_sent_to_the_user_after_submitting_a_SEER_User_registration_form()
			throws TestingException {
		nativeViewLoginImpl.nativeViewLogin();
		CommonUtils.waitForVisibility(nativeViewEnrollementsPage.filterNavigator);
		nativeViewEnrollementsPage.filterNavigator.sendKeys("mailbox");
		MiscUtils.sleep(2000);
		JavascriptUtils.scrollIntoView(nativeViewSentViewPage.nativeViewmailboxSentLink);
		MiscUtils.sleep(40000);
		nativeViewSentViewPage.nativeViewmailboxSentLink.click();
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
		CommonUtils.switchToFrame(nativeViewSentViewPage.nativeViewFrame);
		MiscUtils.sleep(2000);
		CommonUtils.selectDropDownValue("Recipients", nativeViewSentViewPage.nativeViewSearchDropDown);
		MiscUtils.sleep(2000);
		nativeViewSentViewPage.nativeViewSentSearchField.sendKeys(CommonUtils.email);
		MiscUtils.sleep(2000);
		nativeViewSentViewPage.nativeViewSentSearchField.sendKeys(Keys.ENTER);
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
		nativeViewSentViewPage.nativeViewCreatedButton.click();
		MiscUtils.sleep(2000);
		nativeViewSentViewPage.nativeViewPreviewVerifyEmailIcon.click();
		MiscUtils.sleep(2000);
		nativeViewSentViewPage.NativeViewPreviewVerifyEmailOpenRecordButton.click();
		MiscUtils.sleep(2000);
		JavascriptUtils.scrollIntoView(nativeViewSentViewPage.nativeViewPreviewVerifyEmailPreviewHTMLBodyLink);
		MiscUtils.sleep(2000);
		nativeViewSentViewPage.nativeViewPreviewVerifyEmailPreviewHTMLBodyLink.click();
		CommonUtils.switchToFrame(nativeViewSentViewPage.nativeViewPreviewEmailIFRAME);
		MiscUtils.sleep(2000);
		Assert.assertTrue(nativeViewSentViewPage.nativeViewPreviewEmailSEERIncidenceDataHeader.getText()
				.contentEquals("SEER Incidence Data: Verify your email address"));
		Assert.assertTrue(nativeViewSentViewPage.nativeViewPreviewEmailHelloNameText.getText()
				.contentEquals("Hello " + Registration_Constants.NI_FIRST_NAME + ","));
		CommonUtils.waitForVisibility(nativeViewSentViewPage.nativeViewPreviewEmailVerifyEMAILlink);
		nativeViewSentViewPage.nativeViewPreviewEmailVerifyEMAILlink.click();
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}

	@Then("the user is directed to the {string} page")
	public void the_user_is_directed_to_the_page(String landingPageHeaderText) {
		Set<String> allWindowHandles1 = WebDriverUtils.webDriver.getWindowHandles();
		for (String currentWindow1 : allWindowHandles1) {
			WebDriverUtils.webDriver.switchTo().window(currentWindow1);
		}
		String landingPageTitle = WebDriverUtils.getWebDriver().getTitle();
		Assert.assertTrue(landingPageTitle.contentEquals("SEER Data Access Request - ODS SEER Data Access Request"));
		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(seerDataAccessRequestPage.seerDataAccessRequestHeader);
		Assert.assertTrue(
				seerDataAccessRequestPage.seerDataAccessRequestHeader.getText().contentEquals(landingPageHeaderText));
		MiscUtils.sleep(1000);
		CucumberLogUtils.logScreenShot();
	}

	@Then("the {string} field contains the name of the requestor in read-only format")
	public void the_field_contains_the_name_of_the_requestor_in_read_only_format(String requestedFor) {
		Assert.assertTrue(seerDataAccessRequestPage.requestedForText.getText().contentEquals(requestedFor));
		Assert.assertEquals(Registration_Constants.NI_FIRST_NAME + " " + Registration_Constants.NI_MIDDLE_NAME + " " + Registration_Constants.NI_LAST_NAME,
				seerDataAccessRequestPage.seerDataAccessRequestedForReadOnlyTextBox.getAttribute("value"));
		Assert.assertTrue(seerDataAccessRequestPage.seerDataAccessRequestedForReadOnlyTextBox.getAttribute("disabled")
				.equals("true"));
		MiscUtils.sleep(1000);
		CucumberLogUtils.logScreenShot();
	}

	@Then("the {string} field displays with {string} in read-only format")
	public void the_field_displays_with_in_read_only_format(String databaseType, String seerResearchDatabase) {
		Assert.assertTrue(
				seerDataAccessRequestPage.seerDataAccessDatabaseTypeText.getText().contentEquals(databaseType));
		Assert.assertTrue(seerDataAccessRequestPage.seerDataAccessDatabaseTypeReadOnlyTextBox.getText()
				.contains(seerResearchDatabase));
		Assert.assertTrue(seerDataAccessRequestPage.seerDataAccessDatabaseTypeReadOnlyTextBox.getAttribute("disabled")
				.equals("true"));
		MiscUtils.sleep(1000);
		CucumberLogUtils.logScreenShot();
	}

	@Then("the user can select a general purpose for using the data")
	public void the_user_can_select_a_general_purpose_for_using_the_data() {
		Assert.assertTrue(seerDataAccessRequestPage.seerDataAccessRequestWhatIsYourGeneralPurposeUsingTheDataText
				.getText().contentEquals("What is your general purpose for using the data?"));
		CommonUtils.selectDropDownValue("Administrative",
				seerDataAccessRequestPage.seerDataAccessRequestWhatIsYourGeneralPurposeForUsingTheDataDD);
		MiscUtils.sleep(1000);
		CucumberLogUtils.logScreenShot();
	}

	@Then("before entering initials for {string} the text box for initials is displays with the users initials in read-only mode")
	public void before_entering_initials_for_the_text_box_for_initials_is_displays_with_the_users_initials_in_read_only_mode(String IUnderstandTheLimitationsOfTreatmentData) {
		JavascriptUtils.scrollIntoView(
				seerDataAccessRequestPage.seerDataAccessRequestWhatIsYourGeneralPurposeForUsingTheDataDD);
		Assert.assertTrue(seerDataAccessRequestPage.iUnderstandTheLimitationOfTreatmentDataInitialsfieldHeader.getText()
				.contentEquals(IUnderstandTheLimitationsOfTreatmentData));
		Assert.assertTrue(seerDataAccessRequestPage.seerDataAccessDataUseAgreementCertificationInitialsText.getText()
				.contentEquals("Initials"));
		Assert.assertTrue(seerDataAccessRequestPage.iUnderstandTheLimitationOfTreatmentDataInitialsfield.getAttribute("disabled")
				.equals("true"));
	}

	@Then("the I Understand the limitations of treatment data text agreement displayed")
	public void the_I_Understand_the_limitations_of_treatment_data_text_agreement_displayed() {
		CommonUtils.waitForVisibility(seerDataAccessRequestPage.iUnderstandTheLimitationOfTreatmentDataContentTextLastParagraph);
        Assert.assertEquals(SEERDataAccessRequest_Constants.I_UNDERSTAND_THE_LIMITATIONS_OF_TREATEMENT_DATA,seerDataAccessRequestPage.iUnderstandTheLimitationOfTreatmentDataContentTextLastParagraph.getText());
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}

	@Then("before entering initials for {string} the Initials text box displays with the users initials in read-only mode")
	public void before_entering_initials_for_the_Initials_text_box_displays_with_the_users_initials_in_read_only_mode(
			String dataUseAgreementCertification) {
		JavascriptUtils.scrollIntoView(
				seerDataAccessRequestPage.seerDataAccessRequestWhatIsYourGeneralPurposeForUsingTheDataDD);
		Assert.assertTrue(seerDataAccessRequestPage.seerDataAccessDataUseAgreementCertificationHeaderText.getText()
				.contentEquals(dataUseAgreementCertification));
		Assert.assertTrue(seerDataAccessRequestPage.seerDataAccessDataUseAgreementCertificationInitials.getAttribute("disabled")
				.equals("true"));
		Assert.assertTrue(seerDataAccessRequestPage.seerDataAccessBestPracticeAssuranceInitials.getAttribute("disabled")
				.equals("true"));
		Assert.assertTrue(seerDataAccessRequestPage.seerDataAccessDataUseAgreementCertificationInitials
				.getAttribute("disabled").equals("true"));
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}

	@Then("the Data Use Agreement Certification text agreement displayed")
	public void the_Data_Use_Agreement_Certification_text_agreement_displayed() {
		CommonUtils.waitForVisibility(seerDataAccessRequestPage.seerDataAccessDataUseAgreementCertificationText);
		Assert.assertEquals(SEERDataAccessRequest_Constants.DATA_USE_AGREE_EMT_CERTIFFICATION,seerDataAccessRequestPage.seerDataAccessDataUseAgreementCertificationText.getText());
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}

	@Then("before entering initials for {string}, the users initials display in read only format")
	public void before_entering_initials_for_the_users_initials_display_in_read_only_format(
			String bestPracticeAssurance) {
		Assert.assertTrue(seerDataAccessRequestPage.seerDataAccessBestPracticeAssuranceHeaderText.getText()
				.contentEquals(bestPracticeAssurance));
		Assert.assertTrue(seerDataAccessRequestPage.seerDataAccessBestPracticeAssuranceInitialsText.getText()
				.contentEquals("Initials"));
		Assert.assertNotNull("Verifying that the Initials field's value is null",
				seerDataAccessRequestPage.seerDataAccessBestPracticeAssuranceInitials.getAttribute("value")
						.equals("false"));
		Assert.assertTrue(seerDataAccessRequestPage.seerDataAccessBestPracticeAssuranceInitials.getAttribute("disabled")
				.equals("true"));
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}

	@Then("the Best Practice Assurance text displayed")
	public void the_Best_Practice_Assurance_text_displayed() {
		CommonUtils.waitForVisibility(seerDataAccessRequestPage.seerDataAccessBestPracticeAssuranceText);
		Assert.assertEquals(SEERDataAccessRequest_Constants.BEAT_PRACTICE_ASSURANCE,seerDataAccessRequestPage.seerDataAccessBestPracticeAssuranceText.getText());
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}

	@Then("when the user scrolls down each agreement")
	public void when_the_user_scrolls_down_each_agreement() {
		JavascriptUtils.scrollUpWithinElement(seerDataAccessRequestPage.iUnderstandTheLimitationOfTreatmentDataContentTextLastParagraph,
				8000);
		MiscUtils.sleep(2000);
		JavascriptUtils.scrollUpWithinElement(seerDataAccessRequestPage.seerDataAccessDataUseAgreementCertificationText,
				8000);
		MiscUtils.sleep(2000);
		JavascriptUtils.scrollUpWithinElement(seerDataAccessRequestPage.seerDataAccessBestPracticeAssuranceText, 8000);
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}

	@Then("the user is able to enter intials")
	public void the_user_is_able_to_enter_intials() {
		seerDataAccessRequestPage.iUnderstandTheLimitationOfTreatmentDataInitialsfield.sendKeys(Registration_Constants.NI_FIRST_NAME.charAt(0) + "" + Registration_Constants.NI_LAST_NAME.charAt(0));
		JavascriptUtils.drawBlueBorder(seerDataAccessRequestPage.iUnderstandTheLimitationOfTreatmentDataInitialsfield);
		MiscUtils.sleep(500);
		seerDataAccessRequestPage.seerDataAccessDataUseAgreementCertificationInitials.sendKeys(Registration_Constants.NI_FIRST_NAME.charAt(0) + "" + Registration_Constants.NI_LAST_NAME.charAt(0));
		JavascriptUtils.drawBlueBorder(seerDataAccessRequestPage.seerDataAccessDataUseAgreementCertificationInitials);
		seerDataAccessRequestPage.seerDataAccessBestPracticeAssuranceInitials.sendKeys(Registration_Constants.NI_FIRST_NAME.charAt(0) + "" + Registration_Constants.NI_LAST_NAME.charAt(0));
		JavascriptUtils.drawBlueBorder(seerDataAccessRequestPage.seerDataAccessBestPracticeAssuranceInitials);
		CucumberLogUtils.logScreenShot();
	}

	@Then("SEER information is displayed on the bottom of the page as follows:")
	public void seer_information_is_displayed_on_the_bottom_of_the_page_as_follows(String expectedText) {
		Assert.assertTrue(seerDataAccessRequestPage.seerDataAccessSEERIsSupportedByTheBottomText.getText()
				.contentEquals(expectedText));
		MiscUtils.sleep(1000);
	}

	@Then("after entering required information, the user is able to successfully submit the SEER Data Access Request form")
	public void after_entering_required_information_the_user_is_able_to_successfully_submit_the_SEER_Data_Access_Request_form() {
		CommonUtils.waitForVisibility(seerDataAccessRequestPage.seerDataAccessSubmitButton);
		seerDataAccessRequestPage.seerDataAccessSubmitButton.click();
		MiscUtils.sleep(1000);
		CucumberLogUtils.logScreenShot();
		String seerRegistrationIsCompletePage = WebDriverUtils.getWebDriver().getTitle();
		Assert.assertEquals("SEER Data Request Confirmation - ODS SEER Data Access Request",
				seerRegistrationIsCompletePage);
		Assert.assertEquals("Thank you - your data access request is complete.",
				seerDataAccessRequestPage.seerDataAccessYourDataAccessRequestIsCompleteHeader.getText());
		MiscUtils.sleep(1000);
		CucumberLogUtils.logScreenShot();
	}

	@Then("the {string} bread crumb displays")
	public void the_bread_crumb_displays(String seerIncidenceDatabaseLink) {
		CommonUtils.waitForVisibility(seerLandingPage.seerIncidenceDatabaseBreadcrumb);
		Assert.assertEquals(seerIncidenceDatabaseLink, seerLandingPage.seerIncidenceDatabaseBreadcrumb.getText());
	}

	@Then("when clicking, user is directed to {string}")
	public void when_clicking_user_is_directed_to(String seerIncidenceDatabaseUrl) {
		CommonUtils.waitForVisibility(seerLandingPage.seerIncidenceDatabaseBreadcrumb);
		CommonUtils.click(seerLandingPage.seerIncidenceDatabaseBreadcrumb);
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
		String actualSeerCancerGovDataUrl = WebDriverUtils.getWebDriver().getCurrentUrl();
		Assert.assertEquals(seerIncidenceDatabaseUrl, actualSeerCancerGovDataUrl);
		MiscUtils.sleep(2000);
		WebDriverUtils.getWebDriver().navigate().back();
	}

	@When("the user enters an email address for a Non-Institutional Account")
	public void the_user_enters_an_email_address_for_a_Non_Institutional_Account() {
		CommonUtils.sendKeys(seerLandingPage.researchDataRequestsEmailAddressField, CommonUtils.email);
		CommonUtils.click(seerLandingPage.registerForResearchDataButton);
		CucumberLogUtils.logScreenShot();
	}

	@When("the user is on the {string} page")
	public void the_user_is_on_the_page(String seerUserRegistrationHeader) {
		CommonUtils.waitForVisibility(seerUserRegistrationPage.seerUserRegistrationHeaderText);
		Assert.assertEquals(seerUserRegistrationHeader,
				seerUserRegistrationPage.seerUserRegistrationHeaderText.getText());
	}

	@Then("user is directed to the {string} page")
	public void user_is_directed_to_the_page(String seerRegistrationIsCompleteText) {
		CommonUtils.waitForVisibility(seerUserRegistrationPage.seerUserRegistrationIsCompleteHeader);
		Assert.assertEquals(seerRegistrationIsCompleteText,
				seerUserRegistrationPage.seerUserRegistrationIsCompleteHeader.getText());
	}

	@When("user confirms their email address by clicking on the email verifation link sent to the users email address")
	public void user_confirms_their_email_address_by_clicking_on_the_email_verifation_link_sent_to_the_users_email_address()
			throws TestingException {
		nativeViewLoginImpl.nativeViewLogin();
		CommonUtils.waitForVisibility(nativeViewEnrollementsPage.filterNavigator);
		nativeViewEnrollementsPage.filterNavigator.sendKeys("Mailbox");
		CucumberLogUtils.logScreenShot();
		MiscUtils.sleep(40000);
		CommonUtils.click(nativeViewSentViewPage.nativeViewmailboxSentLink);
		CucumberLogUtils.logScreenShot();
		CommonUtils.switchToFrame(nativeViewSentViewPage.nativeViewFrame);
		MiscUtils.sleep(2000);
		CommonUtils.selectDropDownValue("Recipients", nativeViewSentViewPage.nativeViewSearchDropDown);
		MiscUtils.sleep(2000);
		CommonUtils.sendKeys(nativeViewSentViewPage.nativeViewSentSearchField, ("seerThankYou" + CommonUtils.email));
		MiscUtils.sleep(1000);
		CommonUtils.sendKeys(nativeViewSentViewPage.nativeViewSentSearchField, Keys.ENTER);
		MiscUtils.sleep(1000);
		CucumberLogUtils.logScreenShot();
		CommonUtils.click(nativeViewSentViewPage.sortingCreatedDataInOrderLink);
		MiscUtils.sleep(2000);
		JavascriptUtils.clickByJS(nativeViewSentViewPage.nativeViewPreviewVerifyEmailIcon);
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
		CommonUtils.click(nativeViewSentViewPage.NativeViewPreviewVerifyEmailOpenRecordButton);
		MiscUtils.sleep(2000);
		JavascriptUtils.scrollIntoView(nativeViewSentViewPage.nativeViewPreviewVerifyEmailPreviewHTMLBodyLink);
		MiscUtils.sleep(2000);
		CommonUtils.click(nativeViewSentViewPage.nativeViewPreviewVerifyEmailPreviewHTMLBodyLink);
		CucumberLogUtils.logScreenShot();
		CommonUtils.switchToFrame(nativeViewSentViewPage.nativeViewPreviewEmailIFRAME);
		MiscUtils.sleep(2000);
		Assert.assertTrue(nativeViewSentViewPage.nativeViewPreviewEmailSEERIncidenceDataHeader.getText()
				.contentEquals("SEER Incidence Data: Verify your email address"));
		Assert.assertTrue(nativeViewSentViewPage.nativeViewPreviewEmailHelloNameText.getText().contains(Registration_Constants.FIRST_NAME));
		MiscUtils.sleep(2000);
		String mainPageHandle = WebDriverUtils.getWebDriver().getWindowHandle();
		CommonUtils.click(nativeViewSentViewPage.nativeViewPreviewEmailVerifyEMAILlink);
		MiscUtils.sleep(2000);
		Set<String> allWindows = WebDriverUtils.getWebDriver().getWindowHandles();
		Iterator<String> it = allWindows.iterator();
		while (it.hasNext()) {
			String childHandle = it.next();
			if (!childHandle.equals(mainPageHandle)) {
				WebDriverUtils.getWebDriver().switchTo().window(childHandle);
			}
		}
	}

	@Then("the user is directed to {string} page")
	public void the_user_is_directed_to_page(String seerDataAccessRequestPageText) {
		MiscUtils.sleep(2000);
		Assert.assertEquals(seerDataAccessRequestPageText,
				seerDataAccessRequestPage.seerDataAccessRequestHeader.getText());
	}

	@Then("the user has to select a general purpose for using the data")
	public void the_user_has_to_select_a_general_purpose_for_using_the_data() {
		Assert.assertTrue(seerDataAccessRequestPage.seerDataAccessRequestedForReadOnlyTextBox.getAttribute("disabled")
				.equals("true"));
		MiscUtils.sleep(2000);
		Assert.assertTrue(seerDataAccessRequestPage.seerDataAccessDatabaseTypeReadOnlyTextBox.getAttribute("disabled")
				.equals("true"));
		CommonUtils.selectDropDownValue("Administrative",
				seerDataAccessRequestPage.seerDataAccessRequestWhatIsYourGeneralPurposeForUsingTheDataDD);
		CucumberLogUtils.logScreenShot();
		MiscUtils.sleep(2000);
	}

	@Then("also has to agree by typing initials to the Data Use Agreement Certification and Best Practice Assurance")
	public void also_has_to_agree_by_typing_initials_to_the_Data_Use_Agreement_Certification_and_Best_Practice_Assurance() {
		JavascriptUtils.scrollUpWithinElement(seerDataAccessRequestPage.iUnderstandTheLimitationOfTreatmentDataContentTextLastParagraph,
				8000);
		CommonUtils.sendKeys(seerDataAccessRequestPage.iUnderstandTheLimitationOfTreatmentDataInitialsfield, Registration_Constants.FIRST_NAME.charAt(0) + "" + Registration_Constants.LAST_NAME.charAt(0));
		MiscUtils.sleep(2000);
		JavascriptUtils.scrollUpWithinElement(seerDataAccessRequestPage.seerDataAccessDataUseAgreementCertificationText,
				8000);
		CommonUtils.sendKeys(seerDataAccessRequestPage.seerDataAccessDataUseAgreementCertificationInitials, Registration_Constants.FIRST_NAME.charAt(0) + "" + Registration_Constants.LAST_NAME.charAt(0));
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollUpWithinElement(seerDataAccessRequestPage.seerDataAccessBestPracticeAssuranceText, 8000);
		CommonUtils.sendKeys(seerDataAccessRequestPage.seerDataAccessBestPracticeAssuranceInitials, Registration_Constants.FIRST_NAME.charAt(0) + "" + Registration_Constants.LAST_NAME.charAt(0));
		MiscUtils.sleep(2000);
     	CucumberLogUtils.logScreenShot();
	}

	@When("successfully submitting the SEER Data Request form")
	public void successfully_submitting_the_SEER_Data_Request_form() {
		CommonUtils.click(seerDataAccessRequestPage.seerDataAccessSubmitButton);
	}

	@Then("the page {string} displays")
	public void the_page_displays(String yourDataAccessRequestIsCompleteHeader) {
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
		Assert.assertEquals(yourDataAccessRequestIsCompleteHeader,
				seerDataAccessRequestPage.seerDataAccessYourDataAccessRequestIsCompleteHeader.getText());
	}

}
