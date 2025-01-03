package ANALYSIS_TOOLS.CEDCD.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import APPS_COMMON.PageInitializers.PageInitializer;

public class CEDCDBiospecimenCountsAlphabeticalCancerTypeSteps extends PageInitializer {

	@Given("the user is on the CEDCD Biospecimen tab")
	public void the_user_is_on_the_CEDCD_Biospecimen_tab()  {
		/** This step starts the browser and directs us to the CEDCD Biospecimen Tab */
		cedcdStartUps.setUpOnBiospecimenTabPage();
	}

	@When("the user clicks on the Cancer Types drop down")
	public void the_user_clicks_on_the_Cancer_Types_drop_down() {
		/** This step clicks on the Cancer Type */
		JavascriptUtils.clickByJS(cedcdBiospecimenCountsPage.cancerType);
	}

	@Then("the drop down is sorted alphabetically")
	public void the_drop_down_is_sorted_alphabetically() {
		/**
		 * This step verifies that the drop down is sorted alphabetically and logs a
		 * screenshot
		 */
		CommonUtils.waitForVisibility(cedcdBiospecimenCountsPage.cancerTypeValues.get(0));
		cedcdBiospecimenCountsAlphabeticalCancerTypeStepImp.sortCancerTypeAlphabetically();
	}
}