package AnalysisTools.JPSurv.Steps;

import java.io.File;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;

import appsCommon.PageInitializer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JPSurvHomePageSteps extends PageInitializer {
	

	@Given("the user is on the JPSurv homepage")
	public void the_user_is_on_the_JPSurv_homepage() throws TestingException {
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("JPSurv"));
	}
	@When("user selects Dic and Txt file")
	public void user_selects_Dic_and_Txt_file() {
		//jpsurvHomePage.fileInputTextbox.sendKeys("/Users/uddins2/git/CBIIT-Test-Automation/src/test/resources/SEER9_Survival_6CancerSitesByStage_1975_2007.dic");
		//jpsurvHomePage.fileInputTextbox.sendKeys("/Users/uddins2/git/CBIIT-Test-Automation/src/test/resources/SEER9_Survival_6CancerSitesByStage_1975_2007.txt");
		
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
		jpsurvHomePage.fileUploadBtn.click();
	}

	@When("user select year of diagnosis drop down {string}")
	public void selectYearOfDiagnosis(String valueToSelect) {
		CommonUtils.selectDropDownValue(valueToSelect, jpsurvHomePage.yearOfDiagnosisDropdown);
	}
	
	@When("user select year of diagnosis start {string}")
	public void selectYearOfDiagnosisStart(String valueToSelect) {
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
		//	CommonUtils.getWaitObject().until(ExpectedConditions.not(ExpectedConditions.attributeContains(jpsurvHomePage.downloadFullDataSetButton.findElement(By.xpath("./span")), "class", "none")));
		//	CommonUtils.getWaitObject().until(ExpectedConditions.attributeContains(jpsurvHomePage.downloadFullDataSetButton.findElement(By.xpath("./span")), "class", "none"));
		}catch(Exception e) {e.printStackTrace();}
	}

	@Then("user verify an excel file downloaded with name {string}")
	public void verifyExcelFileDownloaded(String fileName) {
		boolean fileFound = false;
		File fileToDelete = null;
		String path = System.getProperty("user.home")+"/Downloads";
		File downloadFolder = new File(path);
		for(File f:downloadFolder.listFiles()) {
			if(!f.isDirectory() && f.getName().contains(fileName)
					&& f.getAbsolutePath().endsWith(".xlsx")) {
				System.out.println(f.getAbsolutePath());
				fileFound = true;
				fileToDelete = f;
				break;
			}
		}

		Assert.assertTrue("Excel file is not found with name "+fileName, fileFound);
		fileToDelete.delete();
	}

	@When("user click export workspace button")
	public void clickexportWorkspaceButton() {
		CommonUtils.click(jpsurvHomePage.exportWorkspaceButton);
		try {
		//	CommonUtils.getWaitObject().until(ExpectedConditions.not(ExpectedConditions.attributeContains(jpsurvHomePage.exportWorkspaceButton.findElement(By.xpath("./span")), "class", "none")));
		//	CommonUtils.getWaitObject().until(ExpectedConditions.attributeContains(jpsurvHomePage.exportWorkspaceButton.findElement(By.xpath("./span")), "class", "none"));
			Thread.sleep(2000);
		}catch(Exception e) {}

	}

	@Then("user verify a jpsurv file downloaded with name {string}")
	public void verifyJpsurvFileDownloaded(String fileName) {
		boolean fileFound = false;
		File fileToDelete = null;
		String path = System.getProperty("user.home")+"/Downloads";
		File downloadFolder = new File(path);
		for(File f:downloadFolder.listFiles()) {
			if(!f.isDirectory() && f.getName().contains(fileName)
					&& f.getAbsolutePath().endsWith(".jpsurv")) {
				System.out.println(f.getAbsolutePath());
				fileFound = true;
				fileToDelete = f;
				break;
			}
		}

		Assert.assertTrue("Jpsurv file is not found with name "+fileName, fileFound);
		fileToDelete.delete();
	}


	@After
	public static void tearDown(Scenario scenario) {
		//validate if scenario has failed
		if (scenario.isFailed()) {
			final byte[] screenshot = ((TakesScreenshot) WebDriverUtils.webDriver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", scenario.getName());
		}


	}
	public static void main(String[] args) {
		String path = System.getProperty("user.home")+"/Downloads";
		System.out.println(path);
		File downloadFolder = new File(path);
		for(File f:downloadFolder.listFiles()) {
			if(!f.isDirectory() && f.getName().contains("SEER9_Survival_6CancerSitesByStage")
					&& f.getAbsolutePath().endsWith(".jpsurv")) {
				System.out.println(f.getAbsolutePath());
				f.delete();
			}
		}
	}

}
