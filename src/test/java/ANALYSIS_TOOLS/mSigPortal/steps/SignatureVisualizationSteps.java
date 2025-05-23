package ANALYSIS_TOOLS.mSigPortal.steps;

import org.junit.Assert;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import APPS_COMMON.PageInitializers.PageInitializer;
import io.cucumber.java.en.*;
import static com.nci.automation.web.TestProperties.getMsigPortalUrl;

public class SignatureVisualizationSteps extends PageInitializer {

	@Given("the user is on the mSigPortal Home page")
	public void the_user_is_on_the_mSigPortal_Home_page()  {
		WebDriverUtils.webDriver.get(getMsigPortalUrl());
		CommonUtils.sleep(3000);
		CucumberLogUtils.logScreenshot();
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
		CucumberLogUtils.logScreenshot();
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
		CucumberLogUtils.logScreenshot();
	}

	@Then("the user navigates to Profile Comparison")
	public void the_user_navigates_to_Profile_Comparison() throws InterruptedException {
		CommonUtils.waitForVisibility(signatureVisualizationsPage.profileComparisonTab);
		CucumberLogUtils.logScreenshot();
		CommonUtils.waitForVisibility(signatureVisualizationsPage.profileComparisonTab);
		JavascriptUtils.clickByJS(signatureVisualizationsPage.profileComparisonTab);
	}

	@When("the user calculates on Profile Comparison")
	public void the_user_calculates_on_Profile_Comparison() throws InterruptedException {
		JavascriptUtils.clickByJS(signatureVisualizationsPage.profileComparisonTab);
		JavascriptUtils.clickByJS(signatureVisualizationsPage.pcToReferenceTab);
		CommonUtils.sleep(5000);
		JavascriptUtils.clickByJS(signatureVisualizationsPage.calculateOnPcReferenceSignatures);
	}

	@Then("the chart is displayed")
	public void the_chart_is_displayed() {
		CucumberLogUtils.logScreenshot();
		Assert.assertTrue(signatureVisualizationsPage.plotReturnedOnProfileComparison.isDisplayed());
	}

	@When("the user calculates sample data")
	public void the_user_calculates_sample_data() {
		JavascriptUtils.clickByJS(signatureVisualizationsPage.userDataSourceRadioButton);
		CommonUtils.waitForClickability(signatureVisualizationsPage.loadExampleDataButton);
		JavascriptUtils.clickByJS(signatureVisualizationsPage.loadExampleDataButton);
		JavascriptUtils.clickByJS(signatureVisualizationsPage.removeFilesButton);
		JavascriptUtils.clickByJS(signatureVisualizationsPage.loadExampleDataButton);
		CucumberLogUtils.logScreenshot();
		JavascriptUtils.clickByJS(signatureVisualizationsPage.submitButton);
		CommonUtils.sleep(60000);
		CucumberLogUtils.logScreenshot();
	}

	@Then("the download plot link is displayed")
	public void the_download_plot_link_is_displayed() {
		CucumberLogUtils.logScreenshot();
		Assert.assertTrue(signatureVisualizationsPage.downloadPlotOnProfileSummary.isEnabled());
	}

	@When("the user clicks on the Download section tab")
	public void the_user_clicks_on_the_Download_section_tab() {
		JavascriptUtils.clickByJS(signatureVisualizationsPage.downloadTab);
	}

	@Then("the results were successfully analyzed")
	public void the_results_were_successfully_analyzed() {
		CucumberLogUtils.logScreenshot();
		Assert.assertTrue(signatureVisualizationsPage.downloadDescriptionText.toString().contains("successfully analyzed"));
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

	@When("the user clicks on the Load Example File button")
	public void the_user_clicks_on_the_Load_Example_File_button() {
		JavascriptUtils.clickByJS(signatureVisualizationsPage.userDataSourceRadioButton);
		CommonUtils.waitForClickability(signatureVisualizationsPage.loadExampleDataButton);
		JavascriptUtils.clickByJS(signatureVisualizationsPage.loadExampleDataButton);
		JavascriptUtils.clickByJS(signatureVisualizationsPage.removeFilesButton);
		JavascriptUtils.clickByJS(signatureVisualizationsPage.loadExampleDataButton);
		CucumberLogUtils.logScreenshot();
	}

	@Then("the VCF example file is displayed")
	public void the_VCF_example_file_is_displayed() {
		CommonUtils.sleep(2000);
		JavascriptUtils.drawBlueBorder(signatureVisualizationsPage.uploadFileVCFText);
		String uploadFileValue = signatureVisualizationsPage.uploadFileVCFText.getText();
		Assert.assertEquals("demo_input_multi.vcf.gz", uploadFileValue);
	}

	@When("the user clicks on Cosine Similarity")
	public void the_user_clicks_on_Cosine_Similarity() {
		CommonUtils.sleep(2000);
		CommonUtils.waitForClickability(signatureVisualizationsPage.cosineSimilarityTab);
		JavascriptUtils.clickByJS(signatureVisualizationsPage.cosineSimilarityTab);
	}

	@Then("the calculate button is enabled on all Cosine Tabs")
	public void the_calculate_button_is_enabled_on_all_Cosine_Tabs() {
		JavascriptUtils.clickByJS(signatureVisualizationsPage.csWithinSamplesTab);
		JavascriptUtils.drawRedBorder(signatureVisualizationsPage.csWithinSamplesCalculateButton);
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
		Assert.assertTrue(signatureVisualizationsPage.csWithinSamplesCalculateButton.isEnabled());
		JavascriptUtils.clickByJS(signatureVisualizationsPage.csToReferenceTab);
		CommonUtils.sleep(1000);
		JavascriptUtils.drawRedBorder(signatureVisualizationsPage.csToReferenceSignaturesCalculateButton);
		CommonUtils.sleep(1000);
		CucumberLogUtils.logScreenshot();
		Assert.assertTrue(signatureVisualizationsPage.csToReferenceSignaturesCalculateButton.isEnabled());
		JavascriptUtils.clickByJS(signatureVisualizationsPage.csToPublicDataTab);
		CommonUtils.sleep(1000);
		JavascriptUtils.drawRedBorder(signatureVisualizationsPage.csToPublicDataCalculateButton);
		CommonUtils.sleep(1000);
		CucumberLogUtils.logScreenshot();
		Assert.assertTrue(signatureVisualizationsPage.csToPublicDataCalculateButton.isEnabled());
	}

	@When("the user clicks on the i icon when on the Profile Comparison tab")
	public void the_user_clicks_on_the_i_icon_when_on_the_Profile_Comparison_tab() {
		CommonUtils.waitForClickability(signatureVisualizationsPage.profileComparisonTab);
		JavascriptUtils.clickByJS(signatureVisualizationsPage.profileComparisonTab);
		JavascriptUtils.clickByJS(signatureVisualizationsPage.pcToReferenceTab);
		CommonUtils.sleep(20000);
		JavascriptUtils.clickByJS(signatureVisualizationsPage.compareSignatureInfoButton);
		CucumberLogUtils.logScreenshot();
	}

	@Then("the cosmic Signature pop up is displayed")
	public void the_cosmic_Signature_pop_up_is_displayed() {
		JavascriptUtils.drawBlueBorder(signatureVisualizationsPage.signatureInfoPopUpBox);
		CucumberLogUtils.logScreenshot();
	}

	@When("then navigates to the Mutational Profiles tab")
	public void then_navigates_to_the_Mutational_Profiles_tab() {
		CommonUtils.sleep(5000);
		CommonUtils.waitForClickability(signatureVisualizationsPage.mutationalProfileTab);
		JavascriptUtils.clickByJS(signatureVisualizationsPage.mutationalProfileTab);
	}

	@Then("text can be entered in at the Sample Name text box")
	public void text_can_be_entered_in_at_the_Sample_Name_text_box() throws InterruptedException {
		CommonUtils.sleep(2000);
		signatureVisualizationsPage.mutationalProfileSampleNameTextBox.click();
		CommonUtils.sleep(2000);
		JavascriptUtils.drawRedBorder(signatureVisualizationsPage.mutationalProfileSampleNameBorder);
		Thread.sleep(2000);
		CucumberLogUtils.logScreenshot();
	}

	@When("the user calculates public data")
	public void the_user_calculates_public_data() {
		CommonUtils.sleep(10000);
		JavascriptUtils.clickByJS(signatureVisualizationsPage.visualPublicSubmitButton);
		CommonUtils.sleep(30000);
	}

	@Then("the Profiler Summary plot is displayed")
	public void the_Profiler_Summary_plot_is_displayed() {
		CommonUtils.sleep(2000);
		JavascriptUtils.scrollIntoView(signatureVisualizationsPage.profilerSummaryHeaderText);
		JavascriptUtils.drawBlueBorder(signatureVisualizationsPage.publicPlotOnProfilerSummary);
		CucumberLogUtils.logScreenshot();
		Assert.assertTrue(signatureVisualizationsPage.publicPlotOnProfilerSummary.isDisplayed());
	}

	@And("the user click submit")
	public void theUserClickSubmit() {
		signatureVisualizationsPage.submitButton1.click();
	}

	@Then("the sample count plot is displayed")
	public void theSampleCountPlotIsDisplayed() {
		Assert.assertTrue(signatureVisualizationsPage.profilerSummaryHeaderText.isDisplayed());
	}
}