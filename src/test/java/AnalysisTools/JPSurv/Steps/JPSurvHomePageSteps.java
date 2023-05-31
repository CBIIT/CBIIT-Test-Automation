package AnalysisTools.JPSurv.Steps;

import static org.junit.Assert.assertTrue;

import java.io.File;


import cucumber.api.java.en.And;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

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

public class JPSurvHomePageSteps extends PageInitializer {

	@Given("the user is on the JPSurv homepage")
	public void the_user_is_on_the_JPSurv_homepage() throws TestingException {
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("JPSurv"));
	}

	@When("user selects Dic and Txt file")
	public void user_selects_Dic_and_Txt_file() {
		// jpsurvHomePage.fileInputTextbox.sendKeys("/Users/uddins2/git/CBIIT-Test-Automation/src/test/resources/SEER9_Survival_6CancerSitesByStage_1975_2007.dic");
		// jpsurvHomePage.fileInputTextbox.sendKeys("/Users/uddins2/git/CBIIT-Test-Automation/src/test/resources/SEER9_Survival_6CancerSitesByStage_1975_2007.txt");

//		String dicFilePath = System.getProperty("user.dir") + "/src/test/resources/SEER9_Survival_6CancerSitesByStage_1975_2007.dic"; 
//		String txtFilePath = System.getProperty("user.dir") + "src/test/resources/SEER9_Survival_6CancerSitesByStage_1975_2007.txt"; 
//		
//		jpsurvHomePage.fileInputTextbox.sendKeys(dicFilePath);
//		jpsurvHomePage.fileInputTextbox.sendKeys(txtFilePath); 

		File dicFile = new File(jpsurvHomePage.dicFilePath);
		File txtFile = new File(jpsurvHomePage.txtFilePath);
		jpsurvHomePage.fileInputTextbox.sendKeys(dicFile.getAbsolutePath());
		jpsurvHomePage.fileInputTextbox.sendKeys(txtFile.getAbsolutePath());


	}

	@When("user clicks upload")
	public void user_clicks_upload() {
        //jpsurvHomePage.fileUploadBtn.click();
		JavascriptUtils.clickByJS(jpsurvHomePage.fileUploadBtn);
	}

	@When("user select year of diagnosis drop down {string}")
	public void selectYearOfDiagnosis(String valueToSelect) {
		CommonUtils.selectDropDownValue(valueToSelect, jpsurvHomePage.yearOfDiagnosisDropdown);
	}

	@When("user select year of diagnosis start {string}")
	public void selectYearOfDiagnosisStart(String valueToSelect) {
		CommonUtils.waitForVisibility(jpsurvHomePage.yearOfDiagnosisStartDropdown);
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
		MiscUtils.sleep(5000);
		CommonUtils.click(jpsurvHomePage.calculateButton);
	}

	@Then("user verify survival vs year at diagnosis tab displayed")
	public void verifySurvivalVsYearAtDiagnosisTabDisplayed() {
		CommonUtils.waitForVisibility(jpsurvHomePage.survivalVsYearAtDiagnosisTab);
		Assert.assertTrue(CommonUtils.isElementDisplayed(jpsurvHomePage.survivalVsYearAtDiagnosisTab));
	}

	@When("user click download full data set button")
	public void clickDownloadFullDatasetButton() {
		CommonUtils.click(jpsurvHomePage.downloadFullDataSetButton);
		try {
			// CommonUtils.getWaitObject().until(ExpectedConditions.not(ExpectedConditions.attributeContains(jpsurvHomePage.downloadFullDataSetButton.findElement(By.xpath("./span")),
			// "class", "none")));
			// CommonUtils.getWaitObject().until(ExpectedConditions.attributeContains(jpsurvHomePage.downloadFullDataSetButton.findElement(By.xpath("./span")),
			// "class", "none"));
		} catch (Exception e) {
			e.printStackTrace();
		}
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
		CommonUtils.click(jpsurvHomePage.exportWorkspaceButton);
		try {
			// CommonUtils.getWaitObject().until(ExpectedConditions.not(ExpectedConditions.attributeContains(jpsurvHomePage.exportWorkspaceButton.findElement(By.xpath("./span")),
			// "class", "none")));
			// CommonUtils.getWaitObject().until(ExpectedConditions.attributeContains(jpsurvHomePage.exportWorkspaceButton.findElement(By.xpath("./span")),
			// "class", "none"));
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
		MiscUtils.sleep(5000);
		jpsurvHomePage.cvsFileInputTextbox.sendKeys(csvFile.getAbsolutePath());
		
//		
//		JavascriptUtils.clickByJS(jpsurvHomePage.configureCSVbtn);
		
	}
	
	@When("user selects workspace")
	public void user_selects_workspace() {
		jpsurvHomePage.WorkspaceRadiobtn.click();;
		File workspaceFile = new File(jpsurvHomePage.workspaceFilePath);
		MiscUtils.sleep(5000);
		jpsurvHomePage.WorkspaceFileInputTextbox.sendKeys(workspaceFile.getAbsolutePath());
		MiscUtils.sleep(5000);
	}

	@When("user clicks import")
	public void user_clicks_import() {
	    jpsurvHomePage.importButton.click();
	}

	@When("select Non-Hodgkin-Lymphoma")
	public void select_Non_Hodgkin_Lymphoma() {
		jpsurvHomePage.nonhodgkinlymphonmaCheckbox.click();
		MiscUtils.sleep(5000);
	}
	
	@When("select Calculate")
	public void select_Calculate() {
	  MiscUtils.sleep(5000);
	  JavascriptUtils.clickByJS(jpsurvHomePage.calculateButton);
	 
	}
	
	@When("click Reset")
	public void click_Reset() {
		MiscUtils.sleep(5000);
	    jpsurvHomePage.showhidearrowButton.click();
		MiscUtils.sleep(5000);
	    jpsurvHomePage.resetButton.click();
	    
	}

	@Then("page is reset")
	public void page_is_reset() {	
		Assert.assertTrue(jpsurvHomePage.csvRadioBtn.isDisplayed());
	}
	
	@When("click download full dataset button")
	public void click_download_full_dataset_button() {
	   CommonUtils.deleteFile( "/JPSurv-Tutorial_JPSURV.xlsx");
	   MiscUtils.sleep(5000);
	   jpsurvHomePage.downloadFullDataSetButton.click();
	   MiscUtils.sleep(5000);
	}

	@Then("verify dataset download {string}")
	public void verifyDatasetDownload(String fileName) {
		 MiscUtils.sleep(20000);
		Assert.assertTrue(CommonUtils.isFileDownloaded(fileName));
		 MiscUtils.sleep(10000);
		CommonUtils.deleteFile(fileName);
	}
	
	@Then("workspace results display")
	public void workspace_results_display() {
	   MiscUtils.sleep(5000);
	   Assert.assertTrue(jpsurvHomePage.survivalVsYearAtDiagnosisTab.isDisplayed());
	} 
	
	@When("enter email address")
	public void enter_email_address() {
		JavascriptUtils.scrollDown(5000);
		 MiscUtils.sleep(5000);
	    jpsurvHomePage.emailTextbox.sendKeys("shomir.uddin@nih.gov");
	   
	}
	
	@Then("click submit")
	public void click_submit() {
	    jpsurvHomePage.submitButton.click();
	}
	
	@Then("verify email send")
	public void verify_email_send() {
		MiscUtils.sleep(5000);
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
		MiscUtils.sleep(5000);
		File workspaceFile = new File(jpsurvHomePage.nonExampleworkspaceFilePath);
		MiscUtils.sleep(5000);
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
		 MiscUtils.sleep(4000);
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
		MiscUtils.sleep(2000);
	    jpsurvHomePage.uploadCSVbtn.click();
	}
	
	@When("selects zero for age rec")
	public void selects_zero_for_age_rec() {
		MiscUtils.sleep(2000);
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


}
