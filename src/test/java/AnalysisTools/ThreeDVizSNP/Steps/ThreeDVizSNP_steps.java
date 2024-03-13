package AnalysisTools.ThreeDVizSNP.Steps;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.WebDriverUtils;
import appsCommon.PageInitializers.PageInitializer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ThreeDVizSNP_steps extends PageInitializer {

	@Given("User navigates to 3DVizSNP page")
	public void user_navigates_to_3DVizSNP_explorer_page() {
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("ThreeDVizSNP"));
	}

	@Then("verify that vizulise and about tabs are available")
	public void clicks_on_advance_filters() {
		ThreeDVizSNPPage.visulizeButton.click();
		ThreeDVizSNPPage.aboutButton.click();
	}

	@Then("upload the vcf file and submit")
	public void uploadVcfFile() {
		ThreeDVizSNPPage.visulizeButton.click();
		ThreeDVizSNPStepImp.uploadExampleVCFFile();
		ThreeDVizSNPPage.submitButton.click();
	}

	@When("User clicks Visualize Button")
	public void user_clicks_visualize_button() {
		ThreeDVizSNPPage.visulizeButton.click();
	}

	@When("User clicks choose file and upload the vcf file")
	public void user_clicks_choose_file_and_upload_the_vcf_file() {
		ThreeDVizSNPStepImp.uploadExampleVCFFile();
	}

	@When("User clicks submit button")
	public void user_clicks_submit_button() {
		ThreeDVizSNPPage.submitButton.click();
	}

	@When("User should click OK in Alert")
	public void user_should_click_ok_in_alert() {
		ThreeDVizSNPStepImp.dismissPopUpAlert();
	}

	@When("User click Download Results button")
	public void user_click_download_results_button() {
		ThreeDVizSNPPage.downloadResults.click();
	}

	@Then("User should verify that Records are getting displayed as expected")
	public void verifyRecordsDisplay() {
		CommonUtils.isElementDisplayed(ThreeDVizSNPPage.recordCount);
	}

	@Then("User clicks Other varient")
	public void clickOnVarient() {
		ThreeDVizSNPPage.firstVarient.click();
	}

	@Then("Verify that selected varient is getting highlighted and exact dimensions are getting displayed")
	public void verifySelectedVarient() {
		ThreeDVizSNPStepImp.dismissPopUpAlert();
	}

	@Then("User clicks on varient header")
	public void varientHeader() {
		ThreeDVizSNPPage.varientHeader.click();
	}

	@Then("Verify that sorting order is getting changed based on varient")
	public void verifySorting() {
		ThreeDVizSNPPage.sortingOrderApplied.click();
	}

	@Then("User entered {string} filter")
	public void filterdata(String filterName) {
		ThreeDVizSNPPage.filterOption.sendKeys(filterName);
	}

	@Then("Verify Records are getting filtered as expected")
	public void verifyRecordsFilter() {
		ThreeDVizSNPStepImp.verifyNumberOfPagesDisplayed();
	}

	@Then("user clicks Long-running Job checkbox,entering email and name")
	public void longRunningJobAndEnterEmailAndname() {
		ThreeDVizSNPStepImp.longRunningJobSubmit();
	}

	@Then("User enter invalid text in Gene Textbox")
	public void enterGeneText() {
		ThreeDVizSNPPage.gene.sendKeys("12345");
	}

	@Then("User should verify Error message Gene symbols searched for are not found in the attached file is getting displayed.")
	public void verifyErrorMessage() {
		ThreeDVizSNPStepImp.validateErrorMessage();
	}

	@Then("User should verify Error message Visualization Job Failed is getting displayed.")
	public void verifyErrorMessageFailedJob() {
		ThreeDVizSNPStepImp.validateErrorMessageForInvalidVcf();
	}

	@Then("User clicks choose file and upload invalid file")
	public void uploadInvalidFile() {
		ThreeDVizSNPStepImp.uploadInvalidVCFFIle();
	}

	@Then("User should verify that email notification is sent")
	public void verifyEmailNotificationSent() {
		ThreeDVizSNPStepImp.verifyEmailNotificationSent();
	}

	@Then("User clicks svg,json,png button and download files")
	public void validateButtons() {
		ThreeDVizSNPStepImp.DownloadFilesForSvgPngAndJson();
	}

	@Then("Verify that all the mini windows are interactable")
	public void interactWithAllMiniWindow() {
		ThreeDVizSNPStepImp.miniWindowInteraction();
	}

	@Then("user clicks feedback button")
	public void provideFeedback() {
		ThreeDVizSNPStepImp.feedbackOption();
	}
}
