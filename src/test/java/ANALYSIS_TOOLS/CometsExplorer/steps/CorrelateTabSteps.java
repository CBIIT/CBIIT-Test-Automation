package ANALYSIS_TOOLS.CometsExplorer.steps;

import org.junit.Assert;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import APPS_COMMON.PageInitializers.PageInitializer;
import io.cucumber.java.en.*;
import static com.nci.automation.web.TestProperties.getComets2Url;

public class CorrelateTabSteps extends PageInitializer {

	@Given("the user is on the Comets homepage")
	public void the_user_is_on_the_Comets_homepage() {
		WebDriverUtils.webDriver.get(getComets2Url());
		CommonUtils.sleep(1000);
		CucumberLogUtils.logScreenshot();
	}

	@When("the user clicks on the correlate")
	public void the_user_clicks_on_the_correlate() {
		CommonUtils.sleep(2000);
		JavascriptUtils.clickByJS(comets2Page.correlateTab);
	}

	@When("the user submits a file and checks Integrity")
	public void the_user_submits_a_file_and_checks_Integrity() {
		CommonUtils.sleep(2000);
		comets2Page.chooseFileButton.sendKeys("/Users/matarodriguezko/Downloads/cometsInput (1).xlsx");
		CucumberLogUtils.logScreenshot();
		CommonUtils.sleep(1000);
		CucumberLogUtils.logScreenshot();
		JavascriptUtils.clickByJS(comets2Page.checkIntegrityButton);
		CommonUtils.sleep(10000);
	}

	@Then("the passed QC message appears")
	public void the_passed_QC_message_appears() {
		Assert.assertTrue(comets2Page.inputDataQCSuccessMessage.isDisplayed());
		CucumberLogUtils.logScreenshot();
	}

	@When("the user runs the integrity check")
	public void the_user_runs_the_integrity_check() {
		CommonUtils.sleep(2000);
		comets2Page.chooseFileButton.sendKeys("/Users/matarodriguezko/Downloads/cometsInput.xlsx");
		CommonUtils.sleep(1000);
		CucumberLogUtils.logScreenshot();
		JavascriptUtils.clickByJS(comets2Page.checkIntegrityButton);
		CommonUtils.sleep(10000);
	}

	@When("select pre-specified models")
	public void select_pre_specified_models() {
		JavascriptUtils.clickByJS(comets2Page.prespecifiedModelsRadioButton);
	}

	@When("selecting the Gender Stratified options from the Choose Model drop down")
	public void selecting_the_Gender_Stratified_options_from_the_Choose_Model_drop_down() {
		CommonUtils.selectDropDownValue(comets2Page.chooseModelDropDown, 3);
	}

	@When("clicking on Run Model")
	public void clicking_on_Run_Model() {
		JavascriptUtils.clickByJS(comets2Page.runModelButton);
		CommonUtils.sleep(10000);
	}

	@Then("the Correlation successful message appears")
	public void the_Correlation_successful_message_appears() {
		Assert.assertTrue(comets2Page.modelSuccessMessage.isDisplayed());
		CucumberLogUtils.logScreenshot();
	}
}