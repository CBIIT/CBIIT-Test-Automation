package ServiceNow.COVIDCode.Steps;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;

import ServiceNow.COVIDCode.Pages.EnrollmentQuestionnairePage;
import appsCommon.PageInitializer;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class cbiit9 extends PageInitializer {

	@Given("an enrollment form has been filled out")
	public void an_enrollment_form_has_been_filled_out() throws TestingException {
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("COVIDCode"));
		CucumberLogUtils.logScreenShot();
		covidCodeLoginPage.LogInButton.click();
		CucumberLogUtils.logScreenShot();
		loginImpl.loginToITrust();
		CucumberLogUtils.logScreenShot();
		// Start New initial questionnaire, select Group1 and click on create Enrollment
		// Button
		JavascriptUtils.clickByJS(servicePortalQuestionnairePage.startNewInitialQuestionnaireButton);
		MiscUtils.sleep(2000);

		CommonUtils.selectDropDownValue(servicePortalQuestionnairePage.enrollmentCreationUserGroupIDSelectDropDown,
				"1");
		JavascriptUtils.clickByJS(servicePortalQuestionnairePage.createEnrollmentButton);
		// filling the questionnaire
		MiscUtils.sleep(2000);
		JavascriptUtils.scrollIntoView(covidCodeEQPage.enrollmentQuestionnaireUserGroupIdDropdown);
		covidCodeEQPage.enrollmentQuestionnaireConsentDropdown.click();
		List<WebElement> consentValues = covidCodeEQPage.enrollmentQuestionaireConsentDropDownValues;
		CommonUtils.selectValueFromBootStrapDropDown(consentValues, "Yes");
		covidCodeEQPageImpl.requiredDemographicsInfo();
	}

	@When("submitting")
	public void submitting() {
		covidCodeEQPage.enrollmentQuestionnaireSubmitButton.click();
		MiscUtils.sleep(2000);
	}

	@Then("a pop up with the message {string} displays")
	public void a_pop_up_with_the_message_displays(String confirmSubmissionPopUpText) {
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
		Assert.assertEquals(confirmSubmissionPopUpText, covidCodeEQPage.enrollmentQuestionnaireConfirmSubmissionPopUpText.getText());
	}

}
