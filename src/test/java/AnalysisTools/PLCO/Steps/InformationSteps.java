package AnalysisTools.PLCO.Steps;

import org.junit.Assert;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import appsCommon.PageInitializers.PageInitializer;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;

public class InformationSteps extends PageInitializer {

	@When("user selects API Access tab")
	public void user_selects_API_Access_tab() {
		informationPage.lnkAPIAcess.click();
	}

	@Then("API Acess page displays")
	public void api_Acess_page_displays() {
		CucumberLogUtils.logScreenshot();
	}

	@Then("API Acess page displays {string} heading")
	public void api_Acess_page_displays_heading(String heading) {
		Assert.assertTrue(informationPage.txtAPIAccessHeading.getText().contentEquals(heading));
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
		CucumberLogUtils.logScreenshot();
	}

	@When("user clicks on source code")
	public void user_clicks_on_source_code() {
		informationPage.lnkSourceCode.click();
	}

	@Then("user goes to PLCO source code on github")
	public void user_goes_to_PLCO_source_code_on_github() {
		CucumberLogUtils.logScreenshot();
	}

	@When("user navigates to the About page")
	public void user_navigates_to_the_About_page() {
		MiscUtils.sleep(2000);
		informationPage.aboutTab.click();
	}

	@And("user clicks explore on GWAS results")
	public void user_clicks_explore_on_GWAS_results() {
		informationPage.lnkExploreGwasResults.click();
	}

	@Then("user is on explore GWAS tab where {string} displays")
	public void user_is_on_explore_GWAS_tab_where_displays(String summaryResults) {
		Assert.assertEquals(summaryResults, exploreGWASPage.txtSummaryResults.getText());
	}
}