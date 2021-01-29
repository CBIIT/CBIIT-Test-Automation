package ServiceNow.COVIDCode.Steps;

import org.junit.Assert;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;

import appsCommon.PageInitializer;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DashboardSteps extends PageInitializer {

	@Given("a Study Nurse has logged in")
	public void a_Study_Nurse_has_logged_in() throws TestingException {
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("COVIDCode"));
		CucumberLogUtils.logScreenShot();
	}

	@When("the user lands on the COVIDCode Home Page")
	public void the_user_lands_on_the_COVIDCode_Home_Page() throws TestingException {
		covidCodeLoginPage.LogInButton.click();
		CucumberLogUtils.logScreenShot();
		loginImpl.loginToITrust();
		CucumberLogUtils.logScreenShot();
	}

	@Then("there is a button called {string}")
	public void there_is_a_button_called(String startNewInitialQuestionnaireText) {
		MiscUtils.sleep(2000);
		Assert.assertTrue(servicePortalQuestionnairePage.startNewInitialQuestionnaireButton.getText()
				.contentEquals(startNewInitialQuestionnaireText));

		CucumberLogUtils.logScreenShot();
	}

	@Then("there is a button named {string}")
	public void there_is_a_button_named(String startNewFollowUpText) {
		MiscUtils.sleep(2000);
		JavascriptUtils.scrollIntoView(servicePortalQuestionnairePage.startNewFollowUpButton);
		Assert.assertTrue(
				servicePortalQuestionnairePage.startNewFollowUpButton.getText().contentEquals(startNewFollowUpText));
		CucumberLogUtils.logScreenShot();
	}

	@Given("a user in the CovidCode App Admins group has logged in")
	public void a_user_in_the_CovidCode_App_Admins_group_has_logged_in() throws TestingException {
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("COVIDCode"));
		CucumberLogUtils.logScreenShot();
	}

	@Then("there is a table called {string}")
	public void there_is_a_table_called(String draftInitialQuestionnaireText) {
		MiscUtils.sleep(2000);
		Assert.assertTrue(servicePortalQuestionnairePage.draftInitialQuestionnaireText.getText()
				.contentEquals(draftInitialQuestionnaireText));
		CucumberLogUtils.logScreenShot();
	}

	@Then("there is a table named {string}")
	public void there_is_a_table_named(String draftFollowUpQuestionnaireText) {
		MiscUtils.sleep(2000);
		JavascriptUtils.scrollIntoView(servicePortalQuestionnairePage.startNewFollowUpButton);
		Assert.assertTrue(servicePortalQuestionnairePage.draftFollowUpQuestionnaireText.getText()
				.contentEquals(draftFollowUpQuestionnaireText));
		CucumberLogUtils.logScreenShot();
	}

	@Then("the table contains the following columns, {string}, {string}, {string}, {string}, {string}")
	public void the_table_contains_the_following_columns(String draftInitialPatientIDText,
			String draftInitialUserGroupIDText, String draftInitialNIHMedicalRecordText,
			String draftInitialLastUpdatedText, String draftInitialAvailableActionsText) {
		MiscUtils.sleep(2000);
		dashboardStepImpl.draftInitialQuestionnaireTableHeaderAssertion(draftInitialPatientIDText,
				draftInitialUserGroupIDText, draftInitialNIHMedicalRecordText, draftInitialLastUpdatedText,
				draftInitialAvailableActionsText);
	}

	@Then("the table contains the following: {string}, {string}, {string}, {string}, {string}")
	public void the_table_contains_the_following(String draftFollowUpPatientIDText, String draftFollowUpGroupIDText,
			String draftFollowUpNIHMedicalRecordText, String draftFollowUpLastUpdateText,
			String draftFollowUpAvailableActionsText) {
		MiscUtils.sleep(2000);
		dashboardStepImpl.draftFollowUpQuestionnaireTableHeaderAssertion(draftFollowUpPatientIDText,
				draftFollowUpGroupIDText, draftFollowUpNIHMedicalRecordText, draftFollowUpLastUpdateText,
				draftFollowUpAvailableActionsText);
	}

}
