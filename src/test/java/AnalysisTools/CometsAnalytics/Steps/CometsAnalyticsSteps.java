package AnalysisTools.CometsAnalytics.Steps;

import appsCommon.PageInitializers.PageInitializer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CometsAnalyticsSteps extends PageInitializer {

	@Given("User navigates to comets analytics home page")
	public void User_navigates_to_comets_analytics_home_page() {cometsAnalyticsStepImp.gotoApplication();
	}

	@Then("Click on perform analysis button")
	public void click_on_perform_analysis_button() {cometsAnalyticsStepImp.clickOnAnalysisButton();
	}

	@Then("verify that user is on anaysis page")
	public void verify_that_user_is_on_anaysis_page() {cometsAnalyticsStepImp.verify_user_is_on_analysis_page();
	}

	@When("User clicks on Analysis button")
	public void user_clicks_on_analysis_button() {cometsAnalyticsStepImp.clickOnAnalysisButton();
	}

	@When("User clicks on Download Sample Input")
	public void user_clicks_on_download_sample_input() {cometsAnalyticsStepImp.downloadSampleInput();
	}

	@When("User selects option {string} from Comets Chorot Dropdown")
	public void user_selects_option_from_comets_chorot_dropdown(String dropDownValue) {cometsAnalyticsStepImp.selectCometDropdown(dropDownValue);
	}

	@When("User upload file and click check integrity")
	public void user_upload_file_and_click_check_iintegrity() {cometsAnalyticsStepImp.uploadFileAndCheckIntegrity();
	}

	@Then("User clicks download report, report should get downloaded")
	public void user_clicks_download_report_report_should_get_downloaded() {cometsAnalyticsStepImp.downloadReport();
	}

	@Then("User should be able to view the Error Message {string}")
	public void user_should_be_able_to_view_the_error_message(String errorMessage) {cometsAnalyticsStepImp.viewErrorMessage(errorMessage);
	}

	@When("User clicks on footer links like about comets and verify new tab is opened")
	public void user_clicks_on_footer_links_like_about_comets_tutorials_vigenette() {cometsAnalyticsStepImp.clickOnAboutComment();
	}

	@When("User clicks on footer links like tutorials and verify new tab is opened")
	public void user_clicks_on_footer_links_like_tutorials() {cometsAnalyticsStepImp.clickOnTutorials();
	}

	@When("User clicks on footer links like vigenette and verify new tab is opened")
	public void user_clicks_on_footer_links_like_vigenette() {cometsAnalyticsStepImp.clickOnVigenette();
	}
	
	@When("User should select option from Model type dropdown and Model Dropdown and click run model")
	public void user_should_select_option_from_model_type_dropdown_and_model_dropdown_and_click_run_model() {
		cometsAnalyticsStepImp.modelDropdownselectionAndModelTypeSelection();
	}

	@Then("User should be click pre-specified models and use model type should be clicked")
	public void user_should_click() {cometsAnalyticsStepImp.prespecifiedModelCLick();
	}

	@Then("User should able to click HeatMap")
	public void user_should_able_to_click_heat_map() {cometsAnalyticsStepImp.clickOnHeatMap();
	}

	@Then("User should verify sort starte By, Sort outcome, P-value functionality are working")
	public void user_should_verify_sort_starte_by_sort_outcome_p_value_functionality_are_working() {cometsAnalyticsStepImp.sortTestingValidation();
	}

	@Then("User should be able to view the Sucess message {string}")
	public void user_should_be_able_to_view_the_sucess_message(String successMessage) {cometsAnalyticsStepImp.viewSucessMessage(successMessage);
	}

	@Then("User should be able to view the downlad button")
	public void user_should_be_able_to_view_the_download_button() {cometsAnalyticsStepImp.viewDownloadButton();
	}

	@When("User should select option from Model type dropdown and and enter model name")
	public void user_should_select_option_from_model_type_dropdown_and_and_enter_model_name() {
		cometsAnalyticsStepImp.selectModelDropDownAndEnterModelName();
	}
	
	@Then("User should be click custom models and use model type should be clicked")
	public void user_should_click_custom_model() {
		cometsAnalyticsStepImp.clickCustomModelAndCLickUseModelType();
	}

	@When("User should fill all the custom model parameters and click run model")
	public void user_should_fill_all_the_custom_model_parameters_and_click_run_model() {
		cometsAnalyticsStepImp.customModelFillAndRun();
	}

	@Then("User should be able to view the results")
	public void user_should_be_able_to_view_the_results() {
	}

	@When("User should cick reset button")
	public void user_should_cick_reset_button() {cometsAnalyticsStepImp.clickOnResetButton();
	}

	@Then("user should verify that its reseted and  cohort dropdown value is {string}")
	public void user_should_verify_that_its_reseted_and_custom_cohort_field_is_getting_displayed(String expectedValue) {
		cometsAnalyticsStepImp.verfyResetCustomCOhort(expectedValue);
	}

	@When("User should be click all models set email id as {string} and click run models")
	public void user_should_be_click_all_models_and_click_run_models(String emailId) {cometsAnalyticsStepImp.clickAllModelsAndRun(emailId);
	}

	@Then("User should get success message and result should be emailed.")
	public void user_should_get_success_message_and_result_should_be_emailed() {cometsAnalyticsStepImp.validateSuccessMessage();
	}

	@When("User upload invalid file and click check integrity")
	public void user_upload_invalid_file_and_click_check_integrity() {cometsAnalyticsStepImp.uploadInvalidFileAndCheckIntegrity();
	}

	@When("User clicks About button")
	public void user_clicks_about_button() {cometsAnalyticsStepImp.clickOnAboutButton();
	}

	@Then("User should be able to view Help, Accessibility, Current Version Functionality, Acknowledgements, Citation is getting displayed")
	public void user_should_be_able_to_view_help_accessibility_current_version_functionality_acknowledgements_citation_is_getting_displayed() {
		cometsAnalyticsStepImp.viewHeloAndOtherOptionsIsDisplayed();
	}
}