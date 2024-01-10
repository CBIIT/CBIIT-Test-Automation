package AnalysisTools.PLCO.Steps;

import org.testng.Assert;
<<<<<<< HEAD
import appsCommon.PageInitializer;
=======
import appsCommon.PageInitializers.PageInitializer;
>>>>>>> 1f082a8263f81d9e192c053b5c975c4db2fbce07
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BrowsePhenotypeSteps extends PageInitializer {

	@When("user clicks browse phenotype tab")
	public void user_clicks_browse_phenotype_tab() {
		browsePhenotypePage.lnkBrowsePhenotype.click();
	}

	@Then("browse phenotype page displays {string}")
	public void browse_phenotype_page_displays(String text) {
		Assert.assertTrue(browsePhenotypePage.txtSelectPhenotype.getText().contentEquals("Please select a phenotype"));
	}
}