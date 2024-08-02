package ServiceNow.CHARMS.Steps;

import appsCommon.PageInitializers.PageInitializer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RAS_Survey_Submission_Steps extends PageInitializer {

	@Given("clicks on the Ras Survey Form")
	public void clicks_on_the_ras_survey_form() {
		ras_screenerSubmissions_stepsImpl.clicksOnTheRasSurveyForm();
	}

	@Given("clicks on the IIQ Form")
	public void clicks_on_the_iiq_form() {
		ras_screenerSubmissions_stepsImpl.clicksOnTheIiqForm();
	}

	@Given("a participant enters username {string} and pin")
	public void a_participant_enters_username_and_pin(String email) {
		ras_screenerSubmissions_stepsImpl.aParticipantEntersUsernameUndPin(email);
	}

	@Given("a participant enters username {string} and pin {string}")
	public void a_participant_enters_username_and_pin(String email, String pin) {
		ras_screenerSubmissions_stepsImpl.aParticipantEntersUsernameUndPinSample(email, pin);
	}

	@Then("the participant will be able to rewind the form")
	public void the_participant_will_be_able_to_rewind_the_form() {
		ras_screenerSubmissions_stepsImpl.theParticipantWillBeAbleToRewindTheForm();
	}

	@When("the participant submits a RAS Survey from excel sheet {string}")
	public void the_participant_submits_a_ras_survey_from_excel_sheet(String rasSurveySheet) {
		ras_screenerSubmissions_stepsImpl.rasSurveyScenarioSelector(rasSurveySheet);
	}
}