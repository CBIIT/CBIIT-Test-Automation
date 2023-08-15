package ServiceNow.CHARMS.Steps;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import java.util.Set;
import com.nci.automation.web.WebDriverUtils;
import appsCommon.PageInitializer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RAS_Survey_Submission_Steps extends PageInitializer {

	@Given("clicks on the Ras Survey Form")
	public void clicks_on_the_ras_survey_form() {
		rasScenario1StepsImpl.clicksOnTheRasSurveyForm();
	}

	@Given("clicks on the IIQ Form")
	public void clicks_on_the_iiq_form() {
		rasScenario1StepsImpl.clicksOnTheIiqForm();
	}

	@Given("a participant enters username {string} and pin")
	public void a_participant_enters_username_and_pin(String email) {
		rasScenario1StepsImpl.aParticipantEntersUsernameUndPin(email);
	}
	@Then("the participant will be able to rewind the form")
	public void the_participant_will_be_able_to_rewind_the_form() {
		rasScenario1StepsImpl.theParticipantWillBeAbleToRewindTheForm();
	}

	@When("the participant submits a RAS Survey from excel sheet {string}")
	public void the_participant_submits_a_ras_survey_from_excel_sheet(String rasSurveySheet) {
		rasScenario1StepsImpl.rasSurveyScenarioSelector(rasSurveySheet);
	}

	static String rasSurveyPin;

	@Given("enters Okta email address {string} and One Time Pin code to proceed with the RAS Survey")
	public void enters_Okta_email_address_and_One_Time_Pin_code_to_proceed_with_the_RAS_Survey(
			String oktaEmailAddress) {

		/**
		 * USING SAME PIN TEXT AND GO BUTTON LOCATORS AS CGB IIQ SINCE THEY ARE THE SAME
		 */
		CommonUtils.waitForVisibility(myRASHomePage.rasoptathyIndividualInformationQuestionnairePinText);

		rasSurveyPin = myRASHomePage.rasoptathyIndividualInformationQuestionnairePinText.getText();

		CommonUtils.waitForVisibility(myRASHomePage.rasoptathyIndividualInformationQuestionnaireOneTimePinGoButton);
		myRASHomePage.rasoptathyIndividualInformationQuestionnaireOneTimePinGoButton.click();

		Set<String> allWindowHandles1 = WebDriverUtils.webDriver.getWindowHandles();
		for (String currentWindow1 : allWindowHandles1) {
			WebDriverUtils.webDriver.switchTo().window(currentWindow1);
		}

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rAS_Survey_Page.cHARMSEmailLogIn);
		rAS_Survey_Page.cHARMSEmailLogIn.sendKeys("charmsras5@yahoo.com");
		rAS_Survey_Page.cHARMSpasswordToLogIn.sendKeys(rasSurveyPin);
		CucumberLogUtils.logScreenshot();
		rAS_Survey_Page.surveyNextButton.click();
	}


}
