package ServiceNow.NERD.Steps;

import ServiceNow.NERD.StepsImplementation.NERDApplicationStepsImplementation;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;

import appsCommon.PageInitializer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TopAccomplishmentsSubmissionSteps extends PageInitializer{
	
	@Given("a Program Staff member is on the CRS Knowledge Management System page")
	public void a_Program_Staff_member_is_on_the_CRS_Knowledge_Management_System_page() 
			throws TestingException{
	//	nerdLoginStepsImplementation.loginToNerd();
		nativeViewLoginImpl.sideDoorAccountLogin();
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));
	}

	@When("the Program Staff Member clicks on {string} for Top Accomplishments")
	public void the_Program_Staff_Member_clicks_on_for_Top_Accomplishments(String createNewSubmission) {
		NERDApplicationStepsImplementation.creatingNewSubmission(nerdCrsKnowledgeDatabaseSubmissionsPage.topAccomplishmentsCreateNewSubmissionLink);
	}

	@When("fills out all required fields")
	public void fills_out_all_required_fields() {
		NERDApplicationStepsImplementation.filingOutAllRequiredFieldsOfSubmission("AutomationTest", "CBIIT", "Testing", "Basic");
	}

	@Then("the Program Staff Member is able to Save the submission")
	public void the_Program_Staff_Member_is_able_to_Save_the_submission() {
		NERDApplicationStepsImplementation.savingOfSubmission();
	}

	@Then("on the CRS Knowledge Management System page, the Program Staff member sees options to Submit, Edit, and Delete")
	public void on_the_CRS_Knowledge_Management_System_page_the_Program_Staff_member_sees_options_to_Submit_Edit_and_Delete() {
		NERDApplicationStepsImplementation.submissionOptions_SubmitEditDelete_areAvailable("AutomationTest");
	}

}
