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
		threeDVizSNPStepImp.visukizeButtionAndAboutButtonClick();
	}

	@Then("upload the vcf file and submit")
	public void uploadVcfFile() {
		threeDVizSNPStepImp.uploadVcfFile();
	}

	@When("User clicks Visualize Button")
	public void user_clicks_visualize_button() {
		threeDVizSNPPage.visulizeButton.click();
	}

	@When("User clicks choose file and upload the vcf file")
	public void user_clicks_choose_file_and_upload_the_vcf_file() {
		threeDVizSNPStepImp.uploadExampleVCFFile();
	}
	@Then("User should see the vcf text and one file upload filed")
	public void user_should_see_the_vcf_text_and_one_file_upload_filed() {
		threeDVizSNPStepImp.verifyFileUploadText();
	}

	@When("User clicks submit button")
	public void user_clicks_submit_button() {
		threeDVizSNPPage.submitButton.click();
	}

	@When("User should click OK in Alert")
	public void user_should_click_ok_in_alert() {
		threeDVizSNPStepImp.dismissPopUpAlert();
	}

	@When("User click Download Results button")
	public void user_click_download_results_button() {
		threeDVizSNPPage.downloadResults.click();
	}

	@Then("User should verify that Records are getting displayed as expected")
	public void verifyRecordsDisplay() {
		CommonUtils.isElementDisplayed(threeDVizSNPPage.recordCount);
	}

	@Then("User clicks Other varient")
	public void clickOnVarient() {
		threeDVizSNPPage.firstVarient.click();
	}

	@Then("Verify that selected varient is getting highlighted and exact dimensions are getting displayed")
	public void verifySelectedVarient() {
		threeDVizSNPStepImp.dismissPopUpAlert();
	}

	@Then("User clicks on varient header")
	public void varientHeader() {
		threeDVizSNPPage.varientHeader.click();
	}

	@Then("Verify that sorting order is getting changed based on varient")
	public void verifySorting() {
		threeDVizSNPPage.sortingOrderApplied.click();
	}

	@Then("User entered {string} filter")
	public void filterdata(String filterName) {
		threeDVizSNPPage.filterOption.sendKeys(filterName);
	}

	@Then("Verify Records are getting filtered as expected")
	public void verifyRecordsFilter() {
		threeDVizSNPStepImp.verifyNumberOfPagesDisplayed();
	}

	@Then("user clicks Long-running Job checkbox,entering email and name")
	public void longRunningJobAndEnterEmailAndname() {
		threeDVizSNPStepImp.longRunningJobSubmit();
	}

	@Then("User enter invalid text in Gene Textbox")
	public void enterGeneText() {
		threeDVizSNPPage.gene.sendKeys("12345");
	}

	@Then("User should verify Error message Gene symbols searched for are not found in the attached file is getting displayed.")
	public void verifyErrorMessage() {
		threeDVizSNPStepImp.validateErrorMessage();
	}

	@Then("User should verify Error message Visualization Job Failed is getting displayed.")
	public void verifyErrorMessageFailedJob() {
		threeDVizSNPStepImp.validateErrorMessageForInvalidVcf();
	}

	@Then("User clicks choose file and upload invalid file")
	public void uploadInvalidFile() {
		threeDVizSNPStepImp.uploadInvalidVCFFIle();
	}

	@Then("User should verify that email notification is sent")
	public void verifyEmailNotificationSent() {
		threeDVizSNPStepImp.verifyEmailNotificationSent();
	}

	@Then("User clicks svg,json,png button and download files")
	public void validateButtons() {
		threeDVizSNPStepImp.DownloadFilesForSvgPngAndJson();
	}

	@Then("Verify that all the mini windows are interactable")
	public void interactWithAllMiniWindow() {
		threeDVizSNPStepImp.miniWindowInteraction();
	}

	@Then("user clicks feedback button")
	public void provideFeedback() {
		threeDVizSNPStepImp.feedbackOption();
	}
}
