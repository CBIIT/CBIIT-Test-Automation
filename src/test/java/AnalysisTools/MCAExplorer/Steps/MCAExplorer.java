/**
 * 
 */
package AnalysisTools.MCAExplorer.Steps;

import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;

import appsCommon.PageInitializers.PageInitializer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

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
	@Then("clicks on submit button")
	public void clicks_on_submit_button() {
		JavascriptUtils.clickByJS(mcaExplorerPage.submitButton);
	}
	@Then("verify if the circle is present on the screen")
	public void verify_if_the_circle_is_present_on_the_screen() {
		mcaExplorerStepImp.isCircleImageIsAvailable();
	}
	@Then("verify that there are {int} rows in the result")
	public void verify_that_there_are_rows_in_the_result(Integer int1) {
		mcaExplorerStepImp.validateNumberOfRows(int1);
	}







}
