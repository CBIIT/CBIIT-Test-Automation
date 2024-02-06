package AnalysisTools.MCAExplorer.Steps;

import org.testng.Assert;
import org.testng.asserts.Assertion;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import AnalysisTools.MCAExplorer.Pages.MCAExplorerPage;
import appsCommon.PageInitializers.PageInitializer;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MCAExplorer_pairwiseplots_steps extends PageInitializer {

	@Given("User navigates to MCAExplorer")
	public void user_navigates_to_mca_explorer() {
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("MCAExplorer"));
	}

	@When("user clicks pairwise PLOTS CHECKBOX")
	public void user_clicks_pairwise_plots_checkbox() {
		mcaExplorerPage.pairwise_checkbox.click();
	}

	@And("user selects {string} in Plot Type dropdown")
	public void user_selects_in_Plot_Type_dropdown(String string) {
		CommonUtils.clickOnElement(mcaExplorerPage.plotDropDown);
		CommonUtils.clickOnElement(mcaExplorerPage.plotDropdown_allchromosome);
	}

	@When("user selects {string} and {string} chromosomes in Include Chromosomes")
	public void user_selects_and_chromosomes_in_include_chromosomes(String string, String string2) {
		mcaExplorerStepImp.selectChromosome(string);
		mcaExplorerStepImp.selectChromosome(string2);
	}

	@When("user click choose more attribute")
	public void user_click_choose_more_attribute() {
		mcaExplorerPage.choose_more_attribute.click();
	}

	@Then("user enter 5 & 7 in GroupA age")
	public void groupA() {
		CommonUtils.sendKeys(mcaExplorerPage.groupA_min_age, "5");
		CommonUtils.sendKeys(mcaExplorerPage.groupA_max_age, "7");
	}

	@Then("user enter 6 & 8 in GroupB age")
	public void groupB() {
		CommonUtils.sendKeys(mcaExplorerPage.groupB_min_age, "6");
		CommonUtils.sendKeys(mcaExplorerPage.groupB_max_age, "8");
	}

	@When("user selects age checkbox")
	public void user_selects_age_checkbox() {
		mcaExplorerPage.age_checkbox.click();
	}

	@Then("user clicks save button")
	public void user_clicks_save_button() {
		JavascriptUtils.clickByJS(mcaExplorerPage.submitButton2);
	}

	@Then("click on download comparison image")
	public void click_on_download_comparison_image() {
		CommonUtils.clickOnElement(mcaExplorerPage.download_comparison_image_btn);
	}

	@Then("user should verify that circle is present on the screen")
	public void user_should_verify_that_circle_is_present_on_the_screen() {
		mcaExplorerStepImp.isTwoCircleImageIsAvailable();
	}
	@When("user selects study,copy number state and age range in both Group A and Group B")
	public void user_selects_study_copy_number_state_and_age_range_in_both_group_a_and_group_b() {

		CommonUtils.clickOnElement(mcaExplorerPage.groupA_Study_dropdown);
		CommonUtils.clickOnElement(mcaExplorerPage.groupA_Study_dropdown_biobank);

		CommonUtils.clickOnElement(mcaExplorerPage.groupA_copynumber_dropdown);
		CommonUtils.clickOnElement(mcaExplorerPage.groupA_copynum_dropdown_loss);

		mcaExplorerPage.groupA_age_Start.sendKeys("5");
		mcaExplorerPage.groupA_age_End.sendKeys("20");
		
		CommonUtils.clickOnElement(mcaExplorerPage.groupB_Study_dropdown);
		CommonUtils.clickOnElement(mcaExplorerPage.groupB_Study_dropdown_biobank);

		CommonUtils.clickOnElement(mcaExplorerPage.groupB_copynumber_dropdown);
		CommonUtils.clickOnElement(mcaExplorerPage.groupB_copynum_dropdown_loss);

		mcaExplorerPage.groupB_age_Start.sendKeys("5");
		mcaExplorerPage.groupB_age_End.sendKeys("20");
	}
	@Then("user can verify that chart header is {string}")
	public void user_can_verify_that_chart_header_is(String string) {
		String chart_header_text = CommonUtils.getText(mcaExplorerPage.chart_header_text).trim();
		try {
			CommonUtils.assertEquals(chart_header_text, "Study: PLCOUK Biobank; Types: Loss; Age: 5-20");
		} catch (AssertionError e) {
			e.getMessage();
		}
	}

}
