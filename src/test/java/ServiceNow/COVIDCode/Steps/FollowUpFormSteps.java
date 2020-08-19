package ServiceNow.COVIDCode.Steps;

import org.junit.Assert;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;

import appsCommon.PageInitializer;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FollowUpFormSteps extends PageInitializer {

	@When("a COVIDCode user accesses a Follow Up Form to update an existing enrollment")
	public void a_COVIDCode_user_accesses_a_Follow_Up_Form_to_update_an_existing_enrollment() throws TestingException {
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("COVIDCode"));
		CucumberLogUtils.logScreenShot();
		covidCodeLoginPage.accessAndCompleteFollowUpQuestionnaireButton.click();
		CucumberLogUtils.logScreenShot();
		loginImpl.loginToITrust();
		CucumberLogUtils.logScreenShot();
	}

	@Then("the question {string} should display in the demographics section")
	public void the_question_should_display_in_the_demographics_section(String questionText) {
		JavascriptUtils.scrollDown(5000);
		String txt = followUpFormPage.whatIsHighestEducationLevelCompleted.getText();
		Assert.assertTrue(txt.contentEquals(questionText));
		
	}

}
