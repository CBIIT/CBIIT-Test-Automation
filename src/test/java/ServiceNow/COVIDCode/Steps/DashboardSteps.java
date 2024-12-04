package ServiceNow.COVIDCode.Steps;

import com.nci.automation.web.CommonUtils;
import org.junit.Assert;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import APPS_COMMON.PageInitializers.PageInitializer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DashboardSteps extends PageInitializer {

	@Given("a Study Nurse has logged in")
	public void a_Study_Nurse_has_logged_in() {
		WebDriverUtils.webDriver.get("");
		CucumberLogUtils.logScreenshot();
	}

	@When("the user lands on the COVIDCode Home Page")
	public void the_user_lands_on_the_COVIDCode_Home_Page() {
		covidCodeLoginPage.LogInButton.click();
		CucumberLogUtils.logScreenshot();
		iTrustLoginPageImpl.loginToITrust();
		CucumberLogUtils.logScreenshot();
	}

	@Then("there is a button called {string}")
	public void there_is_a_button_called(String startNewInitialQuestionnaireText) {
		CommonUtils.sleep(2000);
		Assert.assertTrue(servicePortalQuestionnairePage.startNewInitialQuestionnaireButton.getText()
				.contentEquals(startNewInitialQuestionnaireText));

		CucumberLogUtils.logScreenshot();
	}

	@Then("there is a button named {string}")
	public void there_is_a_button_named(String startNewFollowUpText) {
		CommonUtils.sleep(2000);
		JavascriptUtils.scrollIntoView(servicePortalQuestionnairePage.startNewFollowUpButton);
		Assert.assertTrue(
				servicePortalQuestionnairePage.startNewFollowUpButton.getText().contentEquals(startNewFollowUpText));
		CucumberLogUtils.logScreenshot();
	}

	@Given("a user in the CovidCode App Admins group has logged in")
	public void a_user_in_the_CovidCode_App_Admins_group_has_logged_in() {
		WebDriverUtils.webDriver.get("");
		CucumberLogUtils.logScreenshot();
	}

	@Then("there is a table called {string}")
	public void there_is_a_table_called(String draftInitialQuestionnaireText) {
		CommonUtils.sleep(2000);
		Assert.assertTrue(servicePortalQuestionnairePage.draftInitialQuestionnaireText.getText()
				.contentEquals(draftInitialQuestionnaireText));
		CucumberLogUtils.logScreenshot();
	}

	@Then("there is a table named {string}")
	public void there_is_a_table_named(String draftFollowUpQuestionnaireText) {
		CommonUtils.sleep(2000);
		JavascriptUtils.scrollIntoView(servicePortalQuestionnairePage.startNewFollowUpButton);
		Assert.assertTrue(servicePortalQuestionnairePage.draftFollowUpQuestionnaireText.getText()
				.contentEquals(draftFollowUpQuestionnaireText));
		CucumberLogUtils.logScreenshot();
	}

	@Then("the table contains the following columns, {string}, {string}, {string}, {string}, {string}")
	public void the_table_contains_the_following_columns(String draftInitialPatientIDText,
			String draftInitialUserGroupIDText, String draftInitialNIHMedicalRecordText,
			String draftInitialLastUpdatedText, String draftInitialAvailableActionsText) {
		CommonUtils.sleep(2000);
		dashboardStepImpl.draftInitialQuestionnaireTableHeaderAssertion(draftInitialPatientIDText,
				draftInitialUserGroupIDText, draftInitialNIHMedicalRecordText, draftInitialLastUpdatedText,
				draftInitialAvailableActionsText);
	}

	@Then("the table contains the following: {string}, {string}, {string}, {string}, {string}")
	public void the_table_contains_the_following(String draftFollowUpPatientIDText, String draftFollowUpGroupIDText,
			String draftFollowUpNIHMedicalRecordText, String draftFollowUpLastUpdateText,
			String draftFollowUpAvailableActionsText) {
		CommonUtils.sleep(2000);
		dashboardStepImpl.draftFollowUpQuestionnaireTableHeaderAssertion(draftFollowUpPatientIDText,
				draftFollowUpGroupIDText, draftFollowUpNIHMedicalRecordText, draftFollowUpLastUpdateText,
				draftFollowUpAvailableActionsText);
	}
}