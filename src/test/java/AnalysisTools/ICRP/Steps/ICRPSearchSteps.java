package AnalysisTools.ICRP.Steps;

import org.junit.Assert;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import appsCommon.PageInitializers.PageInitializer;
import io.cucumber.java.en.*;
import static com.nci.automation.web.TestProperties.getIcrpUrl;

public class ICRPSearchSteps extends PageInitializer {

	@Given("user on ICRP home page")
	public void user_on_ICRP_home_page() {
		WebDriverUtils.webDriver.get(getIcrpUrl());
	}

	@When("user clicks ICRP data")
	public void user_clicks_ICRP_data() {
		icrpHomePage.ICRPDataBtn.click();
	}

	@When("user clicks search database")
	public void user_clicks_search_database() {
		CommonUtils.waitForClickability(icrpHomePage.searchDatabaseBtn);
		JavascriptUtils.clickByJS(icrpHomePage.searchDatabaseBtn);
	}

	@When("user clicks search")
	public void user_clicks_search() {
		CommonUtils.sleep(5000);
		JavascriptUtils.clickByJS(icrpSearchDatabasePage.searchBtn);
		CommonUtils.sleep(5000);
	}

	@Then("{string} and {string} displays")
	public void and_displays(String totalBaseProjects, String totalProjects) {
		Assert.assertTrue(icrpSearchDatabasePage.totalBaseProj.getText().contentEquals(totalBaseProjects));
		Assert.assertTrue(icrpSearchDatabasePage.totalProj.getText().contentEquals(totalProjects));
	}

	@When("user searchs by {string} in search terms")
	public void user_searchs_by_in_search_terms(String gliomaOrganoids) {
		CommonUtils.sleep(5000);
		icrpSearchDatabasePage.searchTxtbox.sendKeys(gliomaOrganoids);
	}

	@When("user selects exact phrase provided")
	public void user_selects_exact_phrase_provided() {
		CommonUtils.sleep(5000);
		icrpSearchDatabasePage.exactPhraseRadioBtn.click();
	}

	@Then("study titled {string} is displayed")
	public void study_titled_is_displayed(String gliomaOrganoids) {
		CommonUtils.waitForVisibility(icrpSearchDatabasePage.projGliomaInvastion);
		Assert.assertTrue(icrpSearchDatabasePage.projTitles.size() == 1);
		Assert.assertTrue(icrpSearchDatabasePage.projGliomaInvastion.getText().contentEquals(gliomaOrganoids));

	}

	@When("user searchs {string}")
	public void user_searchs(String institutionName) {
		CommonUtils.sleep(5000);
		JavascriptUtils.scrollIntoView(icrpSearchDatabasePage.institutionPanelHeader);
		icrpSearchDatabasePage.institutionPanelHeader.click();
		icrpSearchDatabasePage.institutionTxtBox.sendKeys(institutionName);
	}

	@Then("projects with institution as {string} display")
	public void projects_with_institution_as_display(String institutionName) {
		for (int i = 0; i < icrpSearchDatabasePage.institutionUniversityOfColoradoDenver.size(); i++) {
			Assert.assertTrue(icrpSearchDatabasePage.institutionUniversityOfColoradoDenver.get(i).getText()
					.contentEquals(institutionName));
		}
	}

	@When("user selects Alexs Lemonade Stand Foundation")
	public void user_selects_Alexs_Lemonade_Stand_Foundation() {
		CommonUtils.sleep(5000);
		CommonUtils.scrollIntoView(icrpSearchDatabasePage.fundingPanelHeader);
		icrpSearchDatabasePage.fundingPanelHeader.click();
		icrpSearchDatabasePage.ALSFChkbox.click();
		CommonUtils.sleep(5000);
	}

	@Then("projects funded by Alexs Lemonade Stand Foundation displays")
	public void projects_funded_by_Alexs_Lemonade_Stand_Foundation_displays() {
		Assert.assertTrue(icrpSearchDatabasePage.fundingOrgALSF.getText().contentEquals("ALSF"));
	}

	@When("user selects cancer type as brain tumor")
	public void user_selects_cancer_type_as_brain_tumor() {
		CommonUtils.sleep(5000);
		icrpSearchDatabasePage.cancerTypePanelHeader.click();
		icrpSearchDatabasePage.cancerTypeTxtbox.sendKeys("Brain Tumor");
		icrpSearchDatabasePage.cancerTypeTxtbox.submit();
		icrpSearchDatabasePage.cancerTypePanelHeader.click();
		icrpSearchDatabasePage.cancerTypePanelHeader.click();
		CommonUtils.sleep(5000);
	}

	@Then("projects with cancer type as {string} display")
	public void projects_with_cancer_type_as_display(String brainTumorText) {
		CommonUtils.selectDropDownValue(icrpSearchDatabasePage.paginationDropDown, "300");
		CommonUtils.waitForVisibility(icrpSearchDatabasePage.projGliomaInvastion);
		JavascriptUtils.clickByJS(icrpSearchDatabasePage.projGliomaInvastion);
		CommonUtils.switchToAnotherWindow();
		Assert.assertTrue(icrpSearchDatabasePage.brainTumorText.getText().contentEquals(brainTumorText));
	}

	@Then("exact phrase provided is selected")
	public void exact_phrase_provided_is_selected() {
		CommonUtils.sleep(5000);
		System.out.println(icrpSearchDatabasePage.exactPhraseRadioBtn.isSelected());
		Assert.assertTrue(icrpSearchDatabasePage.exactPhraseRadioBtn.isSelected());
	}

	@When("user clicks reset")
	public void user_clicks_reset() {
		icrpSearchDatabasePage.resetBtn.click();
	}

	@Then("exact phrase provided is unselected")
	public void exact_phrase_provided_is_unselected() {
		Assert.assertFalse(icrpSearchDatabasePage.resetBtn.isSelected());
	}

	@When("user clicks clear")
	public void user_clicks_clear() {
		CommonUtils.sleep(5000);
		icrpSearchDatabasePage.clearBtn.click();
	}

	@Then("all projects are displayed")
	public void all_projects_are_displayed() {
		CommonUtils.sleep(10000);
		System.out.println(icrpSearchDatabasePage.allProjTxt.getText());
		Assert.assertTrue(icrpSearchDatabasePage.allProjTxt.getText()
				.contentEquals("All projects are shown below. Use the form on the left to refine search results"));
	}

	@When("user selects normal functioning")
	public void user_selects_normal_functioning() {
		CommonUtils.sleep(5000);
		icrpSearchDatabasePage.researchAreaPanelHeader.click();
		icrpSearchDatabasePage.normalFunctioningChkbox.click();
	}

	@Then("projects with research area as {string} display")
	public void projects_with_research_area_as_display(String normalFunctioningText) {
		JavascriptUtils.clickByJS(icrpSearchDatabasePage.firstReturnedProjectList);
		CommonUtils.switchToAnotherWindow();
		CommonUtils.scrollIntoView(icrpSearchDatabasePage.normalFunctioningText);
		System.out.println(icrpSearchDatabasePage.normalFunctioningText.getText());
		Assert.assertTrue(icrpSearchDatabasePage.normalFunctioningText.getText().contentEquals(normalFunctioningText));
	}
}