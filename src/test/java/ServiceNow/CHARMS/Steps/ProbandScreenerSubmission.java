package ServiceNow.CHARMS.Steps;

import org.junit.Assert;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;

import appsCommon.PageInitializer;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ProbandScreenerSubmission extends PageInitializer {

	@Given("a Proband is on the CHARMS home page")
	public void a_Proband_is_on_the_CHARMS_home_page() throws TestingException {
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("CHARMS"));
		CucumberLogUtils.logScreenShot();
	}

	@When("the Proband logs in with existing valid credentials")
	public void the_Proband_logs_in_with_existing_valid_credentials() {
		charmsHomePageImpl.charmsLogin();
	}

	@Then("the {string} page displays")
	public void the_page_displays(String clinicalGeneticsBranchText) {
		Assert.assertTrue(clinicalGeneticsBranchPage.clinicalGeneticsBranchText.getText()
				.contentEquals(clinicalGeneticsBranchText));
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}

	@When("the probands selects on screener to submit a screener")
	public void the_probands_selects_on_screener_to_submit_a_screener() {
		clinicalGeneticsBranchPage.screenerBtn.click();
	}

	@When("selects {string} to filling questionnaire out for someone else")
	public void selects_to_filling_questionnaire_out_for_someone_else(String string) {
	}

	@When("fills out all Demographic Information {string}, {string}, {string},{string}, {string} {string}, {string}, {string}, {string}, {string}, {string}")
	public void fills_out_all_Demographic_Information(String string, String string2, String string3, String string4,
			String string5, String string6, String string7, String string8, String string9, String string10,
			String string11) {
	}

	@When("fills out all Contact Information with {string}, {string}, {string}, {string}, {string}")
	public void fills_out_all_Contact_Information_with(String string, String string2, String string3, String string4,
			String string5) {
	}

	@When("on the Personal Cancer History section selects {string} to a physician diagnosing the research participant with cancer")
	public void on_the_Personal_Cancer_History_section_selects_to_a_physician_diagnosing_the_research_participant_with_cancer(
			String string) {
	}

	@When("adds Personal Cancer information {string}, {string}")
	public void adds_Personal_Cancer_information(String string, String string2) {
	}

	@When("on the Personal Genetic Tests sections selects {string} to being genetically tested for inherited cancer syndromes")
	public void on_the_Personal_Genetic_Tests_sections_selects_to_being_genetically_tested_for_inherited_cancer_syndromes(
			String string) {
	}

	@When("adds Personal Genetic Tests information {string}, {string}")
	public void adds_Personal_Genetic_Tests_information(String string, String string2) {
	}

	@When("on Family Members Cancer History selects {string} to having any biological relatives being diagnosed with cancer")
	public void on_Family_Members_Cancer_History_selects_to_having_any_biological_relatives_being_diagnosed_with_cancer(
			String string) {
	}

	@When("adds Family Cancer information {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
	public void adds_Family_Cancer_information(String string, String string2, String string3, String string4,
			String string5, String string6, String string7, String string8, String string9, String string10) {
	}

	@When("on the Family Members Genetic Tests selects {string} to having any relatives being genetically tested for inherited cancer syndromes")
	public void on_the_Family_Members_Genetic_Tests_selects_to_having_any_relatives_being_genetically_tested_for_inherited_cancer_syndromes(
			String string) {
	}

	@When("adds Relatives with Genetic Tests information {string}, {string}, {string}, {string}")
	public void adds_Relatives_with_Genetic_Tests_information(String string, String string2, String string3,
			String string4) {
	}

	@When("on the Final Information section selects the following information {string}, {string}, {string}, {string}")
	public void on_the_Final_Information_section_selects_the_following_information(String string, String string2,
			String string3, String string4) {
	}

	@When("Submits the Screener Questionnaire")
	public void submits_the_Screener_Questionnaire() {
	}

}
