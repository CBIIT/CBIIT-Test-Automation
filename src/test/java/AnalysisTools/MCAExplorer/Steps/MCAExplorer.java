/**
 * 
 */
package AnalysisTools.MCAExplorer.Steps;

import org.junit.Assert;
import org.openqa.selenium.Keys;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;

import CustomBusiness.EIDP.Util.CommonUtil;
import appsCommon.PageInitializers.PageInitializer;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * 
 */
public class MCAExplorer extends PageInitializer {

	@Given("User navigates to MCAExplorer page")
	public void user_navigates_to_mca_explorer_page() {
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("MCAExplorer"));
	}

	@Then("clicks on advance filters")
	public void clicks_on_advance_filters() {
		mcaExplorerPage.advanceSettings.click();
	}
	
	@Then("user clicks export data, {string} should get downloaded")
	public void user_clicks_export_data_should_get_downloaded(String string) {
	    //mcaExplorerPage.export_data_btn.click();
	    JavascriptUtils.clickByJS(mcaExplorerPage.export_data_btn);
	}
	

	@Then("clicks on submit button")
	public void clicks_on_submit_button() {
		JavascriptUtils.clickByJS(mcaExplorerPage.submitButton);
	}

	@Then("verify if the circle is present on the screen")
	public void verify_if_the_circle_is_present_on_the_screen() {
		mcaExplorerStepImp.isCircleImageIsAvailable();
	}

	@Then("Verify the chart header is {string}")
	public void verifyChartHeader(String expectedHeader) {
		Assert.assertTrue(CommonUtils.isElementDisplayed(mcaExplorerPage.chartHeader));
	}

	@Then("verify that there are {int} rows in the result")
	public void verify_that_there_are_rows_in_the_result(Integer int1) {
		mcaExplorerStepImp.validateNumberOfRows(int1);
	}

	@Then("Zoom in in the circle")
	public void zoom_function() {
		CommonUtils.clickOnElement(mcaExplorerPage.pointOnImage);
		CommonUtils.clickOnElement(mcaExplorerPage.zoomButton);
		CommonUtils.clickOnElement(mcaExplorerPage.zoomButton);
		CommonUtils.clickOnElement(mcaExplorerPage.zoomButton);
	}

	@Then("go back to full circle")
	public void resetZoom() throws InterruptedException {
		CommonUtils.clickOnElement(mcaExplorerPage.breadcrum);
	}

	@Then("user select {string} in plot type")
	public void user_select_in_plot_type(String string) {
		// JavascriptUtils.clearByJS(mcaExplorerPage.plotDropDown);
		//CommonUtils.sendKeys(mcaExplorerPage.plotDropDown, string);
		//CommonUtils.sendKeys(mcaExplorerPage.plotDropDown, Keys.TAB);
		//if(string == "Chromosome level") {
		CommonUtils.clickOnElement(mcaExplorerPage.plotDropDown);
		CommonUtils.clickOnElement(mcaExplorerPage.plotDropdown_chromosomelevel);
		//}
	}

	@Then("select chromosome {int} in chromosome dropdown")
	public void select_chromosome_in_chromosome_dropdown(Integer int1) {
		CommonUtils.sendKeys(mcaExplorerPage.chromosomeDropdown, String.valueOf(int1));
		CommonUtils.sendKeys(mcaExplorerPage.chromosomeDropdown, Keys.TAB);
	}

	@When("User clears the mandatory field Study")
	public void user_clears_the_mandatory_field_study() {
		mcaExplorerStepImp.clearAllValuesFromStudy();
	}

	@When("User selects {string} include chromosome")
	public void user_selects_include_chromosome(String chromosome) {
		mcaExplorerStepImp.selectChromosome(chromosome);
	}

	@Then("verify the graph contains the {string} value")
	public void verify_the_graph_contains_the_value(String chromosome) {
		mcaExplorerStepImp.verifyChromosomeDisplayedInGraph(chromosome);
	}

	@When("User verify the end range as {string}")
	public void user_verify_the_end_range_as(String value) {
		mcaExplorerStepImp.verifyEndRange(value);
	}

	@Then("verify {string} rows displayed in the table")
	public void verify_rows_displayed_in_the_table(String rows) {
		mcaExplorerStepImp.verifyNoOfRows(rows);
	}

	@Then("select the pagination drop down as {string}")
	public void select_the_pagination_drop_down_as(String value) {
		mcaExplorerStepImp.selectThePaginationDropDownValue(value);
	}

}
