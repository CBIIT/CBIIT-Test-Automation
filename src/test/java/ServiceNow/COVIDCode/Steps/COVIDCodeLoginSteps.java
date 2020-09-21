package ServiceNow.COVIDCode.Steps;

import org.junit.Assert;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;

import appsCommon.PageInitializer;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class COVIDCodeLoginSteps extends PageInitializer {

	
	@Given("a COVIDcode Study Provider user is on the COVIDcode study homepage")
	public void a_COVIDcode_Study_Provider_user_is_on_the_COVIDcode_study_homepage() throws TestingException {
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("COVIDCode"));
		String expectedTitle = "COVIDcode Home - COVIDcode";
		String actualTitle = WebDriverUtils.webDriver.getTitle();
		System.out.println("Title of homepage is: " + actualTitle);
		Assert.assertEquals("Verifying COVIDcode homepage title", expectedTitle, actualTitle);
		CucumberLogUtils.logScreenShot();
	}

	@When("the COVIDcode Study Provider user logs in by clicking Access and complete questionnaire button")
	public void the_COVIDcode_Study_Provider_user_logs_in_by_clicking_Access_and_complete_questionnaire_button() throws TestingException {
		covidCodeLoginPage.LogInButton.click();
		CucumberLogUtils.logScreenShot();
		loginImpl.loginToITrust();
		MiscUtils.sleep(2000);
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("COVIDCode"));
		MiscUtils.sleep(2000);
		covidCodeLoginPage.AcceptandCompleteQuestionnaireButton.click();
	}

	@Then("the COVIDcode Study Provider user should see the COVIDcode Enrollment Questionnaire")
	public void the_COVIDcode_Study_Provider_user_should_see_the_COVIDcode_Enrollment_Questionnaire() {
		covidCodeLoginPage.AcceptandCompleteQuestionnaireButton.click();
		String actualText = covidCodeEQPage.COVIDcodeEnrollmentQuestionnaireText.getText();
		CucumberLogUtils.logScreenShot();
		String expectedText = "COVIDcode Enrollment Questionnaire";
		Assert.assertEquals("Verifying COVIDcode Study Provider sees the COVIDcode EnrollmentQuestionnaire",
				expectedText, actualText);
	}

	@Then("the Study Provider user sees the header text {string}")
	public void the_COVIDcode_Study_Provider_user_sees_the_header_text(String ExpectedHeaderText) {
		String actualHeaderText = covidCodeEQPage.enrollmentQuestionnaireTextHeader.getText() + covidCodeEQPage.headerEmail.getText()
				+ covidCodeEQPage.headerPhoneNumber.getText();
		CucumberLogUtils.logScreenShot();
		Assert.assertEquals("Verifying Text Header in COVIDcode Enrollment Questionnaire", ExpectedHeaderText,
				actualHeaderText);
		System.out.println("Header text displayed is: " + actualHeaderText);
	}

	@Then("the Study Provider also sees contact email and phone number as {string}")
	public void the_COVIDcode_Study_Provider_also_sees_contact_email_and_phone_number_as(String headerPhoneAndEmail) {
		String actualPhoneAndEmail = covidCodeEQPage.headerEmail.getText() + covidCodeEQPage.headerPhoneNumber.getText();
		String ExpectedPhoneAndEmail = headerPhoneAndEmail;
		CucumberLogUtils.logScreenShot();
		Assert.assertEquals("Verifying header contact email address and phone number", ExpectedPhoneAndEmail,
				actualPhoneAndEmail);
		System.out.println("Header contact email address and phone number is: " + actualPhoneAndEmail);
	}

	@When("the COVIDcode Study Provider user logs in by clicking Log In button")
	public void the_COVIDcode_Study_Provider_user_logs_in_by_clicking_Log_In_button() throws TestingException {	
		covidCodeLoginPage.LogInButton.click();
		CucumberLogUtils.logScreenShot();
		loginImpl.loginToITrust();
	}


	
}
