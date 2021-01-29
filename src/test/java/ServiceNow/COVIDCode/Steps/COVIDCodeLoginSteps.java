package ServiceNow.COVIDCode.Steps;

import org.junit.Assert;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.xceptions.TestingException;

import appsCommon.PageInitializer;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class COVIDCodeLoginSteps extends PageInitializer {

	@Given("a COVIDcode Study Provider user is on the COVIDcode study homepage")
	public void a_COVIDcode_Study_Provider_user_is_on_the_COVIDcode_study_homepage() throws TestingException {
		covidCodeLoginStepsImpl.covidCodeStudyHomePage();
	}

	@When("the COVIDcode Study Provider user logs in by clicking Log In button")
	public void the_COVIDcode_Study_Provider_user_logs_in_by_clicking_Log_In_button() throws TestingException {
		covidCodeLoginStepsImpl.covidCodeServicePortalLogin();
	}

	@Then("the COVIDcode Study Provider user should see the header NIH User Dashboard")
	public void the_COVIDcode_Study_Provider_user_should_see_the_NIH_User_Dashboard() throws TestingException {
		covidCodeLoginStepsImpl.verifyingNIHDashboardHeader();
	}

	@Then("the COVIDcode Study Provider starts new initial questionnaire by clicking on Start new initial questionnaire button and choose User Group ID {string}")
	public void the_COVIDcode_Study_Provider_starts_new_initial_questionnaire_by_clicking_on_Start_new_initial_questionnaire_button_and_choose_User_Group_ID(
			String UserGroupID) throws TestingException {
		JavascriptUtils.clickByJS(servicePortalQuestionnairePage.startNewInitialQuestionnaireButton);
		MiscUtils.sleep(2000);
		CommonUtils.selectDropDownValue(servicePortalQuestionnairePage.EnrollmentCreationUserGroupIDSelectDropDown,
				UserGroupID);
		JavascriptUtils.clickByJS(servicePortalQuestionnairePage.createEnrollmentButton);
		CucumberLogUtils.logScreenShot();
		MiscUtils.sleep(2000);
	}

	@Then("the COVIDcode Study Provider user should see the header {string}")
	public void the_COVIDcode_Study_Provider_user_should_see_the_header(String actualHeader) throws TestingException {
		String expectedlText = actualHeader;
		String actualText = covidCodeEQPage.COVIDcodeEnrollmentQuestionnaireHeader.getText();
		Assert.assertEquals("Verifying COVIDcode Enrollment Questionnaire header", expectedlText, actualText);
		JavascriptUtils.drawBlueBorder(covidCodeEQPage.COVIDcodeEnrollmentQuestionnaireHeader);
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();

	}

	@Then("the COVIDcode Study Provider also sees the header text as {string}")
	public void the_COVIDcode_Study_Provider_also_sees_the_header_text_as(String actualHeaderText)
			throws TestingException {
		String expectedlText = actualHeaderText;
		String actualText = covidCodeEQPage.enrollmentQuestionnaireParagraph.getText();
		Assert.assertEquals("Verifying COVIDcode Enrollment Questionnaire Paragraph", expectedlText, actualText);
		JavascriptUtils.drawBlueBorder(covidCodeEQPage.enrollmentQuestionnaireParagraph);
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}

}
