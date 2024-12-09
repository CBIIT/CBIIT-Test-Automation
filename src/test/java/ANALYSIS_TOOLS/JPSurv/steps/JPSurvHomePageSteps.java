package ANALYSIS_TOOLS.JPSurv.steps;

import java.io.File;
import java.io.IOException;
import ANALYSIS_TOOLS.JPSurv.stepsImplementations.JPSurvHomePageStepImp;
import org.junit.Assert;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import APPS_COMMON.PageInitializers.PageInitializer;
import io.cucumber.java.en.*;
import static com.nci.automation.web.TestProperties.getJpSurvUrl;

public class JPSurvHomePageSteps extends PageInitializer {

	@Given("the user is on the JPSurv homepage")
	public void the_user_is_on_the_JPSurv_homepage() {
		WebDriverUtils.webDriver.get(getJpSurvUrl());
		CucumberLogUtils.logScreenshot();
	}

	@When("user selects Dic and Txt file")
	public void user_selects_Dic_and_Txt_file() {
		File dicFile = new File(jpsurvHomePage.dicFilePath);
		File txtFile = new File(jpsurvHomePage.txtFilePath);
		jpsurvHomePage.fileInputTextbox.sendKeys(dicFile.getAbsolutePath());
		jpsurvHomePage.fileInputTextbox.sendKeys(txtFile.getAbsolutePath());
	}

	@When("user clicks upload")
	public void user_clicks_upload() {
		JavascriptUtils.clickByJS(jpsurvHomePage.fileUploadBtn);
	}

	@When("user select year of diagnosis drop down {string}")
	public void selectYearOfDiagnosis(String valueToSelect) {
		CommonUtils.selectDropDownValue(valueToSelect, jpsurvHomePage.yearOfDiagnosisDropdown);
	}

	@When("user select year of diagnosis start {string}")
	public void selectYearOfDiagnosisStart(String valueToSelect) {
		CommonUtils.waitForVisibility(jpsurvHomePage.yearOfDiagnosisStartDropdown);
		CommonUtils.sleep(2000);
		CommonUtils.selectDropDownValue(valueToSelect, jpsurvHomePage.yearOfDiagnosisStartDropdown);
	}

	@When("user select year of diagnosis end {string}")
	public void selectYearOfDiagnosisEnd(String valueToSelect) {
		CommonUtils.selectDropDownValue(valueToSelect, jpsurvHomePage.yearOfDiagnosisEndDropdown);
	}

	@When("user select maximum number of years from diagnosis {string}")
	public void selectMaximumNumberOfYearsDiagnosisEnd(String valueToSelect) {
		CommonUtils.selectDropDownValue(valueToSelect, jpsurvHomePage.maxnumOfYearsFromDiagnosisDropdown);
	}

	@When("user click colon_and_rectum check box")
	public void clickCheckBoxForNonHodgkinLymphoma() {
		JavascriptUtils.clickByJS(jpsurvHomePage.colonAndRectumCheckbox);
	}

	@When("user click Male check box")
	public void clickMaleCheckBox() {
		JavascriptUtils.clickByJS(jpsurvHomePage.maleCheckbox);
	}

	@When("user click all stages check box")
	public void clickAllStagesCheckBox() {
		JavascriptUtils.clickByJS(jpsurvHomePage.allStagesCheckbox);
	}

	@When("user select max points dropdown as {string}")
	public void maxPointsDropdownSelect(String valueToSelect) {
		CommonUtils.selectDropDownValue(valueToSelect, jpsurvHomePage.maxPointsDropdown);
	}

	@When("user click calculate button")
	public void clickCalculateButton() {
		CommonUtils.sleep(5000);
		CommonUtils.clickOnElement(jpsurvHomePage.calculateButton);
	}

	@Then("user verify survival vs year at diagnosis tab displayed")
	public void verifySurvivalVsYearAtDiagnosisTabDisplayed() {
		CommonUtils.waitForVisibility(jpsurvHomePage.survivalVsYearAtDiagnosisTab);
		Assert.assertTrue(CommonUtils.isElementDisplayed(jpsurvHomePage.survivalVsYearAtDiagnosisTab));
	}

	@When("user click download full data set button")
	public void clickDownloadFullDatasetButton() {
		CommonUtils.clickOnElement(jpsurvHomePage.downloadFullDataSetButton);
	}

	@Then("user verify an excel file downloaded with name {string}")
	public void verifyExcelFileDownloaded(String fileName) {
		boolean fileFound = false;
		File fileToDelete = null;
		String path = System.getProperty("user.home") + "/Downloads";
		File downloadFolder = new File(path);
		for (File f : downloadFolder.listFiles()) {
			if (!f.isDirectory() && f.getName().contains(fileName) && f.getAbsolutePath().endsWith(".xlsx")) {
				System.out.println(f.getAbsolutePath());
				fileFound = true;
				fileToDelete = f;
				break;
			}
		}

		Assert.assertTrue("Excel file is not found with name " + fileName, fileFound);
		fileToDelete.delete();
	}

	@When("user click export workspace button")
	public void clickexportWorkspaceButton() {
		CommonUtils.clickOnElement(jpsurvHomePage.exportWorkspaceButton);
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
	}

	@Then("user verify a jpsurv file downloaded with name {string}")
	public void verifyJpsurvFileDownloaded(String fileName) {
		boolean fileFound = false;
		File fileToDelete = null;
		String path = System.getProperty("user.home") + "/Downloads";
		File downloadFolder = new File(path);
		for (File f : downloadFolder.listFiles()) {
			if (!f.isDirectory() && f.getName().contains(fileName) && f.getAbsolutePath().endsWith(".jpsurv")) {
				System.out.println(f.getAbsolutePath());
				fileFound = true;
				fileToDelete = f;
				break;
			}
		}
		Assert.assertTrue("Jpsurv file is not found with name " + fileName, fileFound);
		fileToDelete.delete();
	}

	@When("user selects CSV Files")
	public void user_selects_CSV_Files() {
		jpsurvHomePage.csvRadioBtn.click();
		File csvFile = new File(jpsurvHomePage.csvFilePath);
		CommonUtils.sleep(5000);
		jpsurvHomePage.cvsFileInputTextbox.sendKeys(csvFile.getAbsolutePath());
	}

	@When("user selects workspace")
	public void user_selects_workspace() {
		jpsurvHomePage.WorkspaceRadiobtn.click();
		File workspaceFile = new File(jpsurvHomePage.workspaceFilePath);
		CommonUtils.sleep(5000);
		jpsurvHomePage.WorkspaceFileInputTextbox.sendKeys(workspaceFile.getAbsolutePath());
		CommonUtils.sleep(5000);
	}

	@When("user clicks import")
	public void user_clicks_import() {
		jpsurvHomePage.importButton.click();
	}

	@When("select Non-Hodgkin-Lymphoma")
	public void select_Non_Hodgkin_Lymphoma() {
		jpsurvHomePage.nonhodgkinlymphonmaCheckbox.click();
		CommonUtils.sleep(5000);
	}

	@When("select Calculate")
	public void select_Calculate() {
		CommonUtils.sleep(5000);
		JavascriptUtils.clickByJS(jpsurvHomePage.calculateButton);
	}

	@When("click Reset")
	public void click_Reset() {
		CommonUtils.sleep(5000);
		JavascriptUtils.clickByJS(jpsurvHomePage.showhidearrowButton);
		CommonUtils.sleep(5000);
		JavascriptUtils.clickByJS(jpsurvHomePage.resetButton);
	}

	@Then("page is reset")
	public void page_is_reset() {
		Assert.assertTrue(jpsurvHomePage.csvRadioBtn.isDisplayed());
	}

	@When("click download full dataset button")
	public void click_download_full_dataset_button() {
		CommonUtils.deleteFile("/JPSurv-Tutorial_JPSURV.xlsx");
		CommonUtils.sleep(5000);
		jpsurvHomePage.downloadFullDataSetButton.click();
		CommonUtils.sleep(5000);
	}

	@Then("verify dataset download {string}")
	public void verifyDatasetDownload(String fileName) {
		Assert.assertTrue(jpsurvHomePage.downloadFullDataSetButton.isDisplayed());
	}

	@Then("workspace results display")
	public void workspace_results_display() {
		CommonUtils.sleep(5000);
		Assert.assertTrue(jpsurvHomePage.survivalVsYearAtDiagnosisTab.isDisplayed());
	}

	@When("enter email address")
	public void enter_email_address() {
		JavascriptUtils.scrollDown(5000);
		CommonUtils.sleep(5000);
		jpsurvHomePage.emailTextbox.sendKeys("Kevin.MataRodriguez@nih.gov");
	}

	@Then("click submit")
	public void click_submit() {
		jpsurvHomePage.submitButton.click();
	}

	@Then("verify email send")
	public void verify_email_send() {
		CommonUtils.sleep(5000);
		Assert.assertTrue(jpsurvHomePage.submitemailConfirmation.isDisplayed());
	}

	@When("user selects non-example Dic and Txt file")
	public void user_selects_non_example_Dic_and_Txt_file() {
		File dicFile = new File(jpsurvHomePage.nonExampledicFilePath);
		File txtFile = new File(jpsurvHomePage.nonExampletxtFilePath);
		jpsurvHomePage.fileInputTextbox.sendKeys(dicFile.getAbsolutePath());
		jpsurvHomePage.fileInputTextbox.sendKeys(txtFile.getAbsolutePath());
	}

	@When("user selects non-example workspace")
	public void user_selects_non_example_workspace() {
		jpsurvHomePage.WorkspaceRadiobtn.click();
		CommonUtils.sleep(5000);
		File workspaceFile = new File(jpsurvHomePage.nonExampleworkspaceFilePath);
		CommonUtils.sleep(5000);
		jpsurvHomePage.WorkspaceFileInputTextbox.sendKeys(workspaceFile.getAbsolutePath());
	}

	@When("select {string} for age rec drop down")
	public void select_for_age_rec_drop_down(String string) {
		CommonUtils.selectDropDownValue(string, jpsurvHomePage.ager_recDD);
	}

	@When("select {string} for stage drop down")
	public void select_for_stage_drop_down(String string) {
		CommonUtils.selectDropDownValue(string, jpsurvHomePage.stageDD);
	}

	@When("select {string} for year drop down")
	public void select_for_year_drop_down(String string) {
		CommonUtils.selectDropDownValue(string, jpsurvHomePage.yearDXDD);
	}

	@When("select {string} for interval drop down")
	public void select_for_interval_drop_down(String string) {
		JavascriptUtils.scrollIntoView(jpsurvHomePage.intervalDD);
		CommonUtils.sleep(4000);
		CommonUtils.selectDropDownValue(string, jpsurvHomePage.intervalDD);
	}

	@When("select {string} for alive at start drop down")
	public void select_for_alive_at_start_drop_down(String string) {
		JavascriptUtils.scrollIntoView(jpsurvHomePage.aliveAtStartDD);
		CommonUtils.selectDropDownValue(string, jpsurvHomePage.aliveAtStartDD);
	}

	@When("select {string} for  died drop down")
	public void select_for_died_drop_down(String string) {
		JavascriptUtils.scrollIntoView(jpsurvHomePage.diedDD);
		CommonUtils.selectDropDownValue(string, jpsurvHomePage.diedDD);
	}

	@When("select {string} for  lost to follow up")
	public void select_for_lost_to_follow_up(String string) {
		JavascriptUtils.scrollIntoView(jpsurvHomePage.lostToFollowUpDD);
		CommonUtils.selectDropDownValue(string, jpsurvHomePage.lostToFollowUpDD);
	}

	@When("select {string} for exp int drop down")
	public void select_for_exp_int_drop_down(String string) {
		JavascriptUtils.scrollIntoView(jpsurvHomePage.expIntDD);
		CommonUtils.selectDropDownValue(string, jpsurvHomePage.expIntDD);
	}

	@When("select {string} for rel int drop down")
	public void select_for_rel_int_drop_down(String string) {
		JavascriptUtils.scrollIntoView(jpsurvHomePage.relIntDD);
		CommonUtils.selectDropDownValue(string, jpsurvHomePage.relIntDD);
	}

	@When("select {string} for rel cum drop down")
	public void select_for_rel_cum_drop_down(String string) {
		JavascriptUtils.scrollIntoView(jpsurvHomePage.relCumDD);
		CommonUtils.selectDropDownValue(string, jpsurvHomePage.relCumDD);
	}

	@When("select {string} for rel sur int se drop down")
	public void select_for_rel_sur_int_se_drop_down(String string) {
		JavascriptUtils.scrollIntoView(jpsurvHomePage.seIntRelDD);
		CommonUtils.selectDropDownValue(string, jpsurvHomePage.seIntRelDD);
	}

	@When("select {string} for  rel sur cum se drop down")
	public void select_for_rel_sur_cum_se_drop_down(String string) {
		JavascriptUtils.scrollIntoView(jpsurvHomePage.seRelCumDD);
		CommonUtils.selectDropDownValue(string, jpsurvHomePage.seRelCumDD);
	}

	@When("clicks save")
	public void clicks_save() {
		jpsurvHomePage.saveBtn.click();
	}

	@When("clicks upload")
	public void clicks_upload() {
		CommonUtils.sleep(2000);
		jpsurvHomePage.uploadCSVbtn.click();
	}

	@When("selects zero for age rec")
	public void selects_zero_for_age_rec() {
		CommonUtils.sleep(2000);
		jpsurvHomePage.ageRecValue0Checkbox.click();
	}

	@When("selects zero for stage")
	public void selects_zero_for_stage() {
		jpsurvHomePage.stageValue0Checkbox.click();
	}

	@And("user click on year of diagnosed")
	public void userClickOnYearOfDiagnosed() {
		jpsurvHomePage.yearOfDiagnosed.click();
	}

	@Given("User is able to set the env for submitting data request")
	public void user_is_able_to_set_the_env_for_submitting_data_request() {
		JPSurvHomePageStepImp.setApiBaseUrl("https://analysistools-dev.cancer.gov/jpsurv/api/submit/fb16bc69-f75e-4fdf-98f4-60e8cef861d8");
	}

	@Then("User is able to send post request and receive valid response back on submitting of data")
	public void user_is_able_to_send_post_request_and_receive_valid_response_back_on_submitting_of_data() throws IOException {
		JPSurvHomePageStepImp.sendPostRequestForSubmit();
	}

	@Given("User is able to set the env for exporting data request")
	public void user_is_able_to_set_the_env_for_exporting_data_request() {
		JPSurvHomePageStepImp.setApiBaseUrl("https://analysistools-dev.cancer.gov/jpsurv/api/export/0b6d3b66-e04e-40c9-941e-99971652921b");
	}

	@Then("User is able to send get request and receive valid response back on exporting of data")
	public void user_is_able_to_send_get_request_and_receive_valid_response_back_on_exporting_of_data() {
		JPSurvHomePageStepImp.sendGetRequestForExport();
	}

	@Given("User is able to set the env for conditional survival recalculation")
	public void user_is_able_to_set_the_env_for_conditional_survival_recalculation() {
		JPSurvHomePageStepImp.setApiBaseUrl("https://analysistools-dev.cancer.gov/jpsurv/api/recalculateConditional/0b6d3b66-e04e-40c9-941e-99971652921b");
	}

	@Then("User is able to send post request and receive valid response back for conditional survival recalculation")
	public void user_is_able_to_send_post_request_and_receive_valid_response_back_for_conditional_survival_recalculation() {
		JPSurvHomePageStepImp.sendPostReqestWithBodyAndHeader("{\n" +
				"    \"cohortIndex\": 1,\n" +
				"    \"fitIndex\": 0,\n" +
				"    \"conditionalIntervals\": [\n" +
				"        {\n" +
				"            \"start\": 4,\n" +
				"            \"end\": 6\n" +
				"        }\n" +
				"    ]\n" +
				"}");
	}

	@Given("User is able to set the env for getting the calendar trends")
	public void user_is_able_to_set_the_env_for_getting_the_calendar_trends() {
		JPSurvHomePageStepImp.setApiBaseUrl("https://analysistools-dev.cancer.gov/jpsurv/api/calendarTrends/24fc6461-d38a-4e85-bead-8e1a8bb1d0db");
	}

	@Then("User is able to send post request and receive valid response back for the calendar trends")
	public void user_is_able_to_send_post_request_and_receive_valid_response_back_for_the_calendar_trends() {
		JPSurvHomePageStepImp.sendPostReqestWithBodyAndHeader("{\n" +
				"    \"yearRange\": [\n" +
				"        1,\n" +
				"        4\n" +
				"    ],\n" +
				"    \"cohortIndex\": 1,\n" +
				"    \"useRelaxModel\": false\n" +
				"}");
	}

	@Given("User is able to set the env for importing data request")
	public void user_is_able_to_set_the_env_for_importing_data_request() {
		JPSurvHomePageStepImp.setApiBaseUrl("https://analysistools-dev.cancer.gov/jpsurv/api/import/c99d27ec-9932-4dfe-87ef-4a7302ad3909");
	}

	@Then("User is able to send post request and receive valid response back on importing of data")
	public void user_is_able_to_send_post_request_and_receive_valid_response_back_on_importing_of_data() {
		JPSurvHomePageStepImp.sendPostRequestForImport();
	}

	@Then("Verify response of the API is submitted")
	public void verify_response_of_the_api_is_submitted() {
		JPSurvHomePageStepImp.validateSubittedResponse();
	}

	@Then("verify start and end year in the response of the API")
	public void verify_start_and_end_year_in_the_response_of_the_api() {
		JPSurvHomePageStepImp.validateStartAndEndYear();
	}
}