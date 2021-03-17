package AnalysisTools.PLCO.Steps;

import static org.junit.Assert.assertEquals;

import appsCommon.PageInitializer;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class BrowsePhenotypeSteps extends PageInitializer {
	
	
	@When("user clicks browse phenotype tab")
	public void user_clicks_browse_phenotype_tab() {
		browsePhenotypePage.lnkBrowsePhenotype.click();
	}
	
	@SuppressWarnings("deprecation")
	@Then("browse phenotype page displays {string}")
	public void browse_phenotype_page_displays(String text) {
		Assert.assertTrue(browsePhenotypePage.txtSelectPhenotype.getText().contentEquals("Please select a phenotype"));
	}

}
