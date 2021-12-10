package AnalysisTools.PLCO.Steps;

import org.junit.Assert;

import com.nci.automation.utils.CucumberLogUtils;

import appsCommon.PageInitializer;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class InformationSteps extends PageInitializer {

	@When("user selects API Acess tab")
	public void user_selects_API_Acess_tab() {
		informationPage.lnkAPIAcess.click();

	}

	@Then("API Acess page displays")
	public void api_Acess_page_displays() {
		CucumberLogUtils.logScreenShot();
	}

	@Then("API Acess page displays {string} heading")
	public void api_Acess_page_displays_heading(String heading) {
		Assert.assertTrue(informationPage.txtAPIAcessHeading.getText().contentEquals(heading));

	}

	@When("user clicks on About page")
	public void user_clicks_on_About_page() {
		informationPage.lnkAbout.click();
	}

	@When("clicks on Github")
	public void clicks_on_Github() {
		informationPage.lnkGitHub.click();
	}

	@Then("user goes to source code from About page")
	public void user_goes_to_source_code_from_About_page() {
		CucumberLogUtils.logScreenShot();
	}

	@When("user clicks on source code")
	public void user_clicks_on_source_code() {
		informationPage.lnkSourceCode.click();
	}

	@Then("user goes to PLCO source code on github")
	public void user_goes_to_PLCO_source_code_on_github() {
		CucumberLogUtils.logScreenShot();
	}

	@When("user clicks explore on GWAS results")
	public void user_clicks_explore_on_GWAS_results() {
		informationPage.lnkExploreGwasResults.click();
	}

	@Then("user is on explore GWAS tab where {string} displays")
	public void user_is_on_explore_GWAS_tab_where_displays(String summaryResults) {
		Assert.assertEquals(summaryResults, exploreGWASPage.txtSummaryResults.getText());
		;
	}

}
