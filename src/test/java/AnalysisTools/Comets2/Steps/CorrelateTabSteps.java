package AnalysisTools.Comets2.Steps;

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

public class CorrelateTabSteps extends PageInitializer{
	
	@Given("the user is on the Comets homepage")
	public void the_user_is_on_the_Comets_homepage() throws TestingException {
		
		/** This will navigate to the home page of Comets 2.0 */
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("Comets2"));
		MiscUtils.sleep(1000);
		CucumberLogUtils.logScreenShot();
		
	}

	@When("the user clicks on the correlate")
	public void the_user_clicks_on_the_correlate() {
		
		/** This will click on the Correlate tab in the header */
		MiscUtils.sleep(2000);
		JavascriptUtils.clickByJS(comets2Page.correlateTab);
		
	}

	@When("the user submits a file and checks Integrity")
	public void the_user_submits_a_file_and_checks_Integrity() {
		
		/** This step will click on the Choose File button and click on Check Integrity to search */
		MiscUtils.sleep(2000);
		comets2Page.chooseFileButton.sendKeys("/Users/matarodriguezko/Downloads/cometsInput (1).xlsx");
		CucumberLogUtils.logScreenShot();
		MiscUtils.sleep(1000);
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.clickByJS(comets2Page.checkIntegrityButton);
		MiscUtils.sleep(10000);
		
	}

	@Then("the passed QC message appears")
	public void the_passed_QC_message_appears() {
		
		/** This asserts that the Input data has passed QC (metabolite and sample names match in all input files) */
		Assert.assertTrue(comets2Page.inputDataQCSuccessMessage.isDisplayed());
		CucumberLogUtils.logScreenShot();
		
	}
	
	@When("the user runs the integrity check")
	public void the_user_runs_the_integrity_check() {
		/** This step will click on the Choose File button and click on Check Integrity to search */
		MiscUtils.sleep(2000);
		comets2Page.chooseFileButton.sendKeys("/Users/matarodriguezko/Downloads/cometsInput.xlsx");
		MiscUtils.sleep(1000);
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.clickByJS(comets2Page.checkIntegrityButton);
		MiscUtils.sleep(10000);
	}

	@When("select pre-specified models")
	public void select_pre_specified_models() {
		
		/** This will click on the pre-specified models radio button */
		JavascriptUtils.clickByJS(comets2Page.prespecifiedModelsRadioButton);
		
	}
	
	@When("selecting the Gender Stratified options from the Choose Model drop down")
	public void selecting_the_Gender_Stratified_options_from_the_Choose_Model_drop_down() {
		
		CommonUtils.selectDropDownValue(comets2Page.chooseModelDropDown, 3);
		
	}

	@When("clicking on Run Model")
	public void clicking_on_Run_Model() {
		
		JavascriptUtils.clickByJS(comets2Page.runModelButton);
		MiscUtils.sleep(10000);
		
	}

	@Then("the Correlation successful message appears")
	public void the_Correlation_successful_message_appears() {
		
		Assert.assertTrue(comets2Page.modelSuccessMessage.isDisplayed());
		CucumberLogUtils.logScreenShot();
		
	}

}
