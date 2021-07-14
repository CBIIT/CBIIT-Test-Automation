package AnalysisTools.mSigPortal.Steps;

import org.junit.Assert;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;
import appsCommon.PageInitializer;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignatureVisualizationSteps extends PageInitializer {

	@Given("the user is on the mSigPortal Home page")
	public void the_user_is_on_the_mSigPortal_Home_page() throws TestingException {

		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("MSigPortal"));
		MiscUtils.sleep(3000);
		CucumberLogUtils.logScreenShot();

	}

	@When("the user submits with an incorrect file type")
	public void the_user_submits_with_an_incorrect_file_type() {

	}

	@Then("an error message is displayed")
	public void an_error_message_is_displayed() {

	}

	@Given("the user navigates to the Visualization section")
	public void the_user_navigates_to_the_Visualization_section() {

		JavascriptUtils.clickByJS(mSigPortalHomePage.signatureVisualizationTab);
		CucumberLogUtils.logScreenShot();

	}

	@When("User inputted data is selected")
	public void user_inputted_data_is_selected() throws InterruptedException {

		JavascriptUtils.clickByJS(signatureVisualizationsPage.userDataSourceRadioButton);
		Thread.sleep(2000);
		CommonUtils.waitForClickability(signatureVisualizationsPage.loadExampleDataButton);

	}

	@When("the user loads example data with file format VCF")
	public void the_user_loads_example_data_with_file_format_VCF() {

		JavascriptUtils.clickByJS(signatureVisualizationsPage.loadExampleDataButton);
		JavascriptUtils.clickByJS(signatureVisualizationsPage.removeFilesButton);
		JavascriptUtils.clickByJS(signatureVisualizationsPage.loadExampleDataButton);
		CucumberLogUtils.logScreenShot();

	}

	@When("the data is calculated")
	public void the_data_is_calculated() {

		JavascriptUtils.clickByJS(signatureVisualizationsPage.submitButton);

	}

	@Then("the user navigates to Profile Comparison")
	public void the_user_navigates_to_Profile_Comparison() throws InterruptedException {

		Thread.sleep(60000);
		CucumberLogUtils.logScreenShot();
		CommonUtils.waitForVisibility(signatureVisualizationsPage.profileComparisonTab);
		JavascriptUtils.clickByJS(signatureVisualizationsPage.profileComparisonTab);

	}

	@When("the user calculates on Profile Comparison")
	public void the_user_calculates_on_Profile_Comparison() throws InterruptedException {

		Thread.sleep(3000);
		JavascriptUtils.clickByJS(signatureVisualizationsPage.pcToReferenceTab);
		JavascriptUtils.clickByJS(signatureVisualizationsPage.submitButton);
//		CommonUtils.waitForVisibility(signatureVisualizationsPage.plotReturnedOnProfileComparison);

	}

	@Then("the chart is displayed")
	public void the_chart_is_displayed() {

		CucumberLogUtils.logScreenShot();
		Assert.assertTrue(signatureVisualizationsPage.plotReturnedOnProfileComparison.isDisplayed());

	}

	@When("the user calculates sample data")
	public void the_user_calculates_sample_data() throws InterruptedException {

		JavascriptUtils.clickByJS(signatureVisualizationsPage.userDataSourceRadioButton);
		CommonUtils.waitForClickability(signatureVisualizationsPage.loadExampleDataButton);
		JavascriptUtils.clickByJS(signatureVisualizationsPage.loadExampleDataButton);
		JavascriptUtils.clickByJS(signatureVisualizationsPage.removeFilesButton);
		JavascriptUtils.clickByJS(signatureVisualizationsPage.loadExampleDataButton);
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.clickByJS(signatureVisualizationsPage.submitButton);
		Thread.sleep(60000);
		CucumberLogUtils.logScreenShot();
		CommonUtils.waitForClickability(signatureVisualizationsPage.downloadPlotOnProfileSummary);

	}

	@Then("the download plot link is displayed")
	public void the_download_plot_link_is_displayed() {

		CucumberLogUtils.logScreenShot();
		Assert.assertTrue(signatureVisualizationsPage.downloadPlotOnProfileSummary.isDisplayed());

	}

	@When("the user clicks on the Download section tab")
	public void the_user_clicks_on_the_Download_section_tab() {

		JavascriptUtils.clickByJS(signatureVisualizationsPage.downloadTab);

	}

	@Then("the results were successfully analyzed")
	public void the_results_were_successfully_analyzed() {

		CucumberLogUtils.logScreenShot();
		Assert.assertTrue(
				signatureVisualizationsPage.downloadDescriptionText.toString().contains("successfully analyzed"));

	}

	@When("the user clicks on the Signature Visualization banner")
	public void the_user_clicks_on_the_Signature_Visualization_banner() {

	}

	@Then("the Public and User radio button buttons are clickable")
	public void the_Public_and_User_radio_button_buttons_are_clickable() {

	}

	@When("the User data source is selected")
	public void the_User_data_source_is_selected() {

	}

	@When("the user clicks on load Example Data link")
	public void the_user_clicks_on_load_Example_Data_link() {

	}

	@Then("the VCF example file is displayed")
	public void the_VCF_example_file_is_displayed() {

	}

	@When("the user calculates using User provided example data")
	public void the_user_calculates_using_User_provided_example_data() {

	}

	@When("the user clicks on Cosine Similarity")
	public void the_user_clicks_on_Cosine_Similarity() {

	}

	@Then("the calculate button is enabled on all {int} Cosine Tabs")
	public void the_calculate_button_is_enabled_on_all_Cosine_Tabs(int int1) {

	}

}