package ServiceNow.CHARMS.Steps;

import org.testng.asserts.SoftAssert;

import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;

import ServiceNow.CHARMS.StepsImplementation.FHQSubmissionStepsImpl;
import appsCommon.PageInitializers.PageInitializer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class FHQSubmissionSteps extends PageInitializer {
	SoftAssert softAssert = new SoftAssert();

	@Given("the study nurse logs into Native View")
	public void the_study_nurse_logs_into_native_view() {
		FHQSubmissionStepsImpl.nativeViewSideDoorLogin("CBIITTestAccount","curlbylawdighalvekinlarswould");
		FHQSubmissionStepsImpl.loginToFHQPatientInNativeView();
	}
	
	@Given("participant open RASopathies Longitudinal Cohort Study login page")
	public void participant_open_rasopathies_longitudinal_cohort_study_login_page() throws TestingException {
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("myRASLoginPage"));
	}
	
	@Then("logs Rasopathy page via Okta with username {string} and password {string}")
	public void logs_rasopathy_page_via_okta_with_username_and_password(String username, String password) throws TestingException {
		FHQSubmissionStepsImpl.loginToRASStudyPage(username, password);
	}
	
	@Then("clicks CHARMS FHQ Relative Link page")
	public void clicks_charms_fhq_relative_link_page() throws TestingException {
		FHQSubmissionStepsImpl.loginToFHQGridPage();
	}
	
	@Then("participant submits FHQ Relatives Form from excel name {string}")
	public void participant_submits_fhq_Relatives_form_from_excel_name(String excelName) throws TestingException {
		FHQSubmissionStepsImpl.scenarioSelectorForFHQRelativesList(excelName);
	}
	
	@Then("user submits FHQ Relative from excel name {string} and excel sheet {string}")
	public void user_submits_fhq_relative_from_excel_name_and_excel_sheet(String excelName, String sheetName)throws TestingException {
		FHQSubmissionStepsImpl.scenarioSelectorForFHQRelative(excelName,sheetName); 
	}
	
	@Then("data submitted for FHQ Relative is verified in FHQ Patient page of NativeView from excel name {string} and excel sheet {string}")
	public void data_submitted_for_fhq_relative_is_verified_in_fhq_patient_page_of_native_view_from_excel_name_and_excel_sheet(String excelName, String sheetName) throws TestingException {
		FHQSubmissionStepsImpl.scenarioAssertionForFHQ(excelName,sheetName);
	}
}















