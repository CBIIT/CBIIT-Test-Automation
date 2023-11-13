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
	@Given("the study nurse logs into Native View with username {string} and password {string}")
	public void the_study_nurse_logs_into_native_view_with_username_and_password(String username, String password) throws TestingException {
		FHQSubmissionStepsImpl.loginToNativeViewForFHQ(username, password);
		FHQSubmissionStepsImpl.loginToFHQPatientInNativeView();
	}
	@Then("data submitted for FHQ Patient is verified in FHQ Patient page of NativeView from excel sheet {string}")
	public void data_submitted_for_fhq_patient_is_verified_in_fhq_patient_page_of_native_view_from_excel_sheet(String sheetName) throws TestingException {
		FHQSubmissionStepsImpl.scenarioAssertionForFHQ(sheetName);
	}
	@Then("data submitted for FHQ Partner is verified in FHQ Patient page of NativeView from excel sheet {string}")
	public void data_submitted_for_fhq_partner_is_verified_in_fhq_patient_page_of_native_view_from_excel_sheet(String sheetName) throws TestingException {
		FHQSubmissionStepsImpl.scenarioAssertionForFHQ(sheetName);
	}
	@Then("data submitted for FHQ Mother is verified in FHQ Patient page of NativeView from excel sheet {string}")
	public void data_submitted_for_fhq_mother_is_verified_in_fhq_patient_page_of_native_view_from_excel_sheet(String sheetName) throws TestingException {
		FHQSubmissionStepsImpl.scenarioAssertionForFHQ(sheetName);
	}
	@Then("data submitted for FHQ Father is verified in FHQ Patient page of NativeView from excel sheet {string}")
	public void data_submitted_for_fhq_father_is_verified_in_fhq_patient_page_of_native_view_from_excel_sheet(String sheetName) throws TestingException {
		FHQSubmissionStepsImpl.scenarioAssertionForFHQ(sheetName);
	}
	@Then("data submitted for FHQ Children is verified in FHQ Patient page of NativeView from excel sheet {string}")
	public void data_submitted_for_fhq_children_is_verified_in_fhq_patient_page_of_native_view_from_excel_sheet(String sheetName) throws TestingException {
		FHQSubmissionStepsImpl.scenarioAssertionForFHQ(sheetName);
	}
	@Then("data submitted for FHQ Sibling is verified in FHQ Patient page of NativeView from excel sheet {string}")
	public void data_submitted_for_fhq_sibling_is_verified_in_fhq_patient_page_of_native_view_from_excel_sheet(String sheetName) throws TestingException {
		FHQSubmissionStepsImpl.scenarioAssertionForFHQ(sheetName);
	}
	@Then("data submitted for FHQ AuntUncle is verified in FHQ Patient page of NativeView from excel sheet {string}")
	public void data_submitted_for_fhq_auntUncle_is_verified_in_fhq_patient_page_of_native_view_from_excel_sheet(String sheetName) throws TestingException {
		FHQSubmissionStepsImpl.scenarioAssertionForFHQ(sheetName);
	}
	@Then("data submitted for FHQ NieceNephew is verified in FHQ Patient page of NativeView from excel sheet {string}")
	public void data_submitted_for_fhq_nieceNephew_is_verified_in_fhq_patient_page_of_native_view_from_excel_sheet(String sheetName) throws TestingException {
		FHQSubmissionStepsImpl.scenarioAssertionForFHQ(sheetName);
	}
	@Then("data submitted for FHQ MaternalGrandMother is verified in FHQ Patient page of NativeView from excel sheet {string}")
	public void data_submitted_for_fhq_maternalGrandMother_is_verified_in_fhq_patient_page_of_native_view_from_excel_sheet(String sheetName) throws TestingException {
		FHQSubmissionStepsImpl.scenarioAssertionForFHQ(sheetName);
	}
	@Then("data submitted for FHQ MaternalGrandFather is verified in FHQ Patient page of NativeView from excel sheet {string}")
	public void data_submitted_for_fhq_maternalGrandFather_is_verified_in_fhq_patient_page_of_native_view_from_excel_sheet(String sheetName) throws TestingException {
		FHQSubmissionStepsImpl.scenarioAssertionForFHQ(sheetName);
	}
	@Then("data submitted for FHQ PaternalGrandMother is verified in FHQ Patient page of NativeView from excel sheet {string}")
	public void data_submitted_for_fhq_paternalGrandMother_is_verified_in_fhq_patient_page_of_native_view_from_excel_sheet(String sheetName) throws TestingException {
		FHQSubmissionStepsImpl.scenarioAssertionForFHQ(sheetName);
	}
	@Then("data submitted for FHQ PaternalGrandFather is verified in FHQ Patient page of NativeView from excel sheet {string}")
	public void data_submitted_for_fhq_paternalGrandFather_is_verified_in_fhq_patient_page_of_native_view_from_excel_sheet(String sheetName) throws TestingException {
		FHQSubmissionStepsImpl.scenarioAssertionForFHQ(sheetName);
	}
	@Then("data submitted for FHQ GrandChildren is verified in FHQ Patient page of NativeView from excel sheet {string}")
	public void data_submitted_for_fhq_grandChildren_is_verified_in_fhq_patient_page_of_native_view_from_excel_sheet(String sheetName) throws TestingException {
		FHQSubmissionStepsImpl.scenarioAssertionForFHQ(sheetName);
	}
	@Then("data submitted for FHQ Cousin is verified in FHQ Patient page of NativeView from excel sheet {string}")
	public void data_submitted_for_fhq_cousin_is_verified_in_fhq_patient_page_of_native_view_from_excel_sheet(String sheetName) throws TestingException {
		FHQSubmissionStepsImpl.scenarioAssertionForFHQ(sheetName);
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
	@Then("participant submits FHQ Relative from excel sheet {string}")
	public void participant_submits_fhq_relative_from_excel_sheet(String sheetName) throws TestingException {
		FHQSubmissionStepsImpl.scenarioSelectorForFHQ(sheetName); 
	}	
	@Then("clicks CHARMS FHQ Survey page")
	public void clicks_charms_fhq_survey_page() throws TestingException {
		FHQSubmissionStepsImpl.loginToFHQPage();
	}
	@Then("participant submits FHQ Participant from excel sheet {string}")
	public void participant_submits_fhq_participant_from_excel_sheet(String sheetName) throws TestingException {
		FHQSubmissionStepsImpl.scenarioSelectorForFHQ(sheetName); 
	}
	@Then("clicks CHARMS FHQ Partner Link page")
	public void clicks_charms_fhq_partner_link_page() throws TestingException {
		FHQSubmissionStepsImpl.loginToFHQGridPage();
	}
	@Then("participant submits FHQ Partner from excel sheet {string}")
	public void participant_submits_fhq_partner_from_excel_sheet(String sheetName) throws TestingException {
		FHQSubmissionStepsImpl.scenarioSelectorForFHQ(sheetName);
	}
	@Then("clicks CHARMS FHQ Parent Link page")
	public void clicks_charms_fhq_parent_link_page() throws TestingException {
		FHQSubmissionStepsImpl.loginToFHQGridPage();
	}
	@Then("clicks CHARMS FHQ Mother Link page")
	public void clicks_charms_fhq_mother_link_page() throws TestingException {
		FHQSubmissionStepsImpl.loginToFHQGridPage();
	}
	@Then("clicks CHARMS FHQ Father Link page")
	public void clicks_charms_fhq_father_link_page() throws TestingException {
		FHQSubmissionStepsImpl.loginToFHQGridPage();
	}
	@Then("clicks CHARMS FHQ Children Link page")
	public void clicks_charms_fhq_children_link_page() throws TestingException {
		FHQSubmissionStepsImpl.loginToFHQGridPage();
	}
	@Then("clicks CHARMS FHQ Sibling Link page")
	public void clicks_charms_fhq_sibling_link_page() throws TestingException {
		FHQSubmissionStepsImpl.loginToFHQGridPage();
	}
	@Then("clicks CHARMS FHQ Aunt Link page")
	public void clicks_charms_fhq_aunt_link_page() throws TestingException {
		FHQSubmissionStepsImpl.loginToFHQGridPage();
	}
	@Then("clicks CHARMS FHQ Uncle Link page")
	public void clicks_charms_fhq_uncle_link_page() throws TestingException {
		FHQSubmissionStepsImpl.loginToFHQGridPage();
	}
	@Then("clicks CHARMS FHQ NieceNephew Link page")
	public void clicks_charms_fhq_nieceNephew_link_page() throws TestingException {
		FHQSubmissionStepsImpl.loginToFHQGridPage();
	}
	@Then("clicks CHARMS FHQ MaternalGrandMother Link page")
	public void clicks_charms_fhq_maternalGrandMother_link_page() throws TestingException {
		FHQSubmissionStepsImpl.loginToFHQGridPage();
	}
	@Then("clicks CHARMS FHQ MaternalGrandFather Link page")
	public void clicks_charms_fhq_maternalGrandFather_link_page() throws TestingException {
		FHQSubmissionStepsImpl.loginToFHQGridPage();
	}
	@Then("clicks CHARMS FHQ PaternalGrandMother Link page")
	public void clicks_charms_fhq_paternalGrandMother_link_page() throws TestingException {
		FHQSubmissionStepsImpl.loginToFHQGridPage();
	}
	@Then("clicks CHARMS FHQ PaternalGrandFather Link page")
	public void clicks_charms_fhq_paternalGrandFather_link_page() throws TestingException {
		FHQSubmissionStepsImpl.loginToFHQGridPage();
	}
	@Then("clicks CHARMS FHQ GrandChildren Link page")
	public void clicks_charms_fhq_grandChildren_link_page() throws TestingException {
		FHQSubmissionStepsImpl.loginToFHQGridPage();
	}
	@Then("clicks CHARMS FHQ Cousin Link page")
	public void clicks_charms_fhq_cousin_link_page() throws TestingException {
		FHQSubmissionStepsImpl.loginToFHQGridPage();
	}
	@Then("participant submits FHQ Parent from excel sheet {string}")
	public void participant_submits_fhq_parent_from_excel_sheet(String sheetName) throws TestingException {
		FHQSubmissionStepsImpl.scenarioSelectorForFHQ(sheetName);
	}
	@Then("participant submits FHQ Mother from excel sheet {string}")
	public void participant_submits_fhq_mother_from_excel_sheet(String sheetName) throws TestingException {
		FHQSubmissionStepsImpl.scenarioSelectorForFHQ(sheetName);
	}
	@Then("participant submits FHQ Father from excel sheet {string}")
	public void participant_submits_fhq_father_from_excel_sheet(String sheetName) throws TestingException {
		FHQSubmissionStepsImpl.scenarioSelectorForFHQ(sheetName);
	}
	@Then("participant submits FHQ Children from excel sheet {string}")
	public void participant_submits_fhq_children_from_excel_sheet(String sheetName) throws TestingException {
		FHQSubmissionStepsImpl.scenarioSelectorForFHQ(sheetName);
	}
	@Then("participant submits FHQ Sibling from excel sheet {string}")
	public void participant_submits_fhq_sibling_from_excel_sheet(String sheetName) throws TestingException {
		FHQSubmissionStepsImpl.scenarioSelectorForFHQ(sheetName);
	}
	@Then("participant submits FHQ Aunt from excel sheet {string}")
	public void participant_submits_fhq_aunt_from_excel_sheet(String sheetName) throws TestingException {
		FHQSubmissionStepsImpl.scenarioSelectorForFHQ(sheetName);
	}
	@Then("participant submits FHQ Uncle from excel sheet {string}")
	public void participant_submits_fhq_uncle_from_excel_sheet(String sheetName) throws TestingException {
		FHQSubmissionStepsImpl.scenarioSelectorForFHQ(sheetName);
	}
	@Then("participant submits FHQ NieceNephew from excel sheet {string}")
	public void participant_submits_fhq_nieceNephew_from_excel_sheet(String sheetName) throws TestingException {
		FHQSubmissionStepsImpl.scenarioSelectorForFHQ(sheetName);
	}
	@Then("participant submits FHQ MaternalGrandMother from excel sheet {string}")
	public void participant_submits_fhq_maternalGrandMother_from_excel_sheet(String sheetName) throws TestingException {
		FHQSubmissionStepsImpl.scenarioSelectorForFHQ(sheetName);
	}
	@Then("participant submits FHQ MaternalGrandFather from excel sheet {string}")
	public void participant_submits_fhq_maternalGrandFather_from_excel_sheet(String sheetName) throws TestingException {
		FHQSubmissionStepsImpl.scenarioSelectorForFHQ(sheetName);
	}
	@Then("participant submits FHQ PaternalGrandMother from excel sheet {string}")
	public void participant_submits_fhq_PaternalGrandMother_from_excel_sheet(String sheetName) throws TestingException {
		FHQSubmissionStepsImpl.scenarioSelectorForFHQ(sheetName);
	}
	@Then("participant submits FHQ PaternalGrandFather from excel sheet {string}")
	public void participant_submits_fhq_paternalGrandFather_from_excel_sheet(String sheetName) throws TestingException {
		FHQSubmissionStepsImpl.scenarioSelectorForFHQ(sheetName);
	}
	@Then("participant submits FHQ GrandChildren from excel sheet {string}")
	public void participant_submits_fhq_grandChildren_from_excel_sheet(String sheetName) throws TestingException {
		FHQSubmissionStepsImpl.scenarioSelectorForFHQ(sheetName);
	}
	@Then("participant submits FHQ Cousin from excel sheet {string}")
	public void participant_submits_fhq_cousin_from_excel_sheet(String sheetName) throws TestingException {
		FHQSubmissionStepsImpl.scenarioSelectorForFHQ(sheetName);
	}
	@Then("participant submits FHQ Participant from excel name {string} and excel sheet {string}")
	public void participant_submits_fhq_participant_from_excel_name_and_excel_sheet(String excelName, String sheetName)throws TestingException {
		FHQSubmissionStepsImpl.scenarioSelectorForFHQ_test(excelName,sheetName); 
	}
	@Then("participant submits FHQ Partner from excel name {string} and excel sheet {string}")
	public void participant_submits_fhq_partner_from_excel_name_and_excel_sheet(String excelName, String sheetName)throws TestingException {
		FHQSubmissionStepsImpl.scenarioSelectorForFHQ_test(excelName,sheetName); 
	}
	@Then("participant submits FHQ Mother from excel name {string} and excel sheet {string}")
	public void participant_submits_fhq_mother_from_excel_name_and_excel_sheet(String excelName, String sheetName)throws TestingException {
		FHQSubmissionStepsImpl.scenarioSelectorForFHQ_test(excelName,sheetName); 
	}
	@Then("participant submits FHQ Father from excel name {string} and excel sheet {string}")
	public void participant_submits_fhq_father_from_excel_name_and_excel_sheet(String excelName, String sheetName)throws TestingException {
		FHQSubmissionStepsImpl.scenarioSelectorForFHQ_test(excelName,sheetName); 
	}
	
	
	
	
	@Then("participant submits FHQ Relatives Form from excel name {string} and excel sheet {string}")
	public void participant_submits_fhq_relatives_form_from_excel_name_and_excel_sheet(String excelName, String sheetName)throws TestingException {
		
		FHQSubmissionStepsImpl.scenarioSelectorForFHQ_test1(excelName,sheetName); 
	}
	
	@Then("participant submits FHQ Relatives Form from excel name {string}")
	public void participant_submits_fhq_Relatives_form_from_excel_name(String excelName) throws TestingException {
		FHQSubmissionStepsImpl.scenarioSelectorForFHQ_testTest(excelName); 
	}
}




















