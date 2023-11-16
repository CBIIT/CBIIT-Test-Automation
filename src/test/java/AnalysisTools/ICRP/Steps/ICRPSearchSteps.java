package AnalysisTools.ICRP.Steps;

import org.junit.Assert;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;
import appsCommon.PageInitializers.PageInitializer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ICRPSearchSteps extends PageInitializer {

	@Given("user on ICRP home page")
	public void user_on_ICRP_home_page() throws TestingException {
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("ICRP"));
	}

	@When("user clicks ICRP data")
	public void user_clicks_ICRP_data() {
		icrpHomePage.ICRPDataBtn.click();

	}

	@When("user clicks search database")
	public void user_clicks_search_database() {
		icrpHomePage.searchDatabaseBtn.click();
	}

	@When("user clicks search")
	public void user_clicks_search() {
//		WebDriverWait wait = new WebDriverWait(WebDriverUtils.webDriver , 1800); 
//		wait.until(ExpectedConditions.elementToBeClickable((By.xpath("//*[@class='btn btn-primary ml2']"))));
		MiscUtils.sleep(5000);
		icrpSearchDatabasePage.searchBtn.click();
		MiscUtils.sleep(5000);
	}

	@Then("{string} and {string} displays")
	public void and_displays(String totalBaseProjects, String totalProjects) {
		Assert.assertTrue(icrpSearchDatabasePage.totalBaseProj.getText().contentEquals(totalBaseProjects));
		Assert.assertTrue(icrpSearchDatabasePage.totalProj.getText().contentEquals(totalProjects));
	}

	@When("user searchs by {string} in search terms")
	public void user_searchs_by_in_search_terms(String gliomaOrganoids) {
		MiscUtils.sleep(5000);
		icrpSearchDatabasePage.searchTxtbox.sendKeys(gliomaOrganoids);
	}

	@When("user selects exact phrase provided")
	public void user_selects_exact_phrase_provided() {
		MiscUtils.sleep(5000);
		icrpSearchDatabasePage.exactPhraseRadioBtn.click();
	}

	@Then("study titled {string} is displayed")
	public void study_titled_is_displayed(String gliomaOrganoids) {
		Assert.assertTrue(icrpSearchDatabasePage.projTitles.size() == 1);
		Assert.assertTrue(icrpSearchDatabasePage.projGliomaOrganoids.getText().contentEquals(gliomaOrganoids));

	}

	@When("user searchs {string}")
	public void user_searchs(String institutionName) {
		MiscUtils.sleep(5000);
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
		MiscUtils.sleep(5000);
		JavascriptUtils.scrollIntoView(icrpSearchDatabasePage.fundingPanelHeader);
		icrpSearchDatabasePage.fundingPanelHeader.click();
		icrpSearchDatabasePage.ALSFChkbox.click();
		MiscUtils.sleep(5000);

	}

	@Then("projects funded by Alexs Lemonade Stand Foundation displays")
	public void projects_funded_by_Alexs_Lemonade_Stand_Foundation_displays() {
		Assert.assertTrue(icrpSearchDatabasePage.fundingOrgALSF.getText().contentEquals("ALSF"));

	}

	@When("user selects cancer type as brain tumor")
	public void user_selects_cancer_type_as_brain_tumor() {
		MiscUtils.sleep(5000);
		icrpSearchDatabasePage.cancerTypePanelHeader.click();
		icrpSearchDatabasePage.cancerTypeTxtbox.sendKeys("Brain Tumor");
		icrpSearchDatabasePage.cancerTypeTxtbox.submit();
		icrpSearchDatabasePage.cancerTypePanelHeader.click();
		icrpSearchDatabasePage.cancerTypePanelHeader.click();
		MiscUtils.sleep(5000);
	}

	@Then("projects with cancer type as Brain Tumor display")
	public void projects_with_cancer_type_as_Brain_Tumor_display() {
		icrpSearchDatabasePage.projGliomaOrganoids.click();
		CommonUtils.switchToAnotherWindow();
		Assert.assertTrue(icrpSearchDatabasePage.brainTumortxt.getText().contentEquals("Brain Tumor"));
	}

	@Then("exact phrase provided is selected")
	public void exact_phrase_provided_is_selected() {
		MiscUtils.sleep(5000);
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
		MiscUtils.sleep(5000);
		icrpSearchDatabasePage.clearBtn.click();

	}

	@Then("all projects are displayed")
	public void all_projects_are_displayed() {
		Assert.assertTrue(icrpSearchDatabasePage.allProjTxt.getText()
				.contentEquals("All projects are shown below. Use the form on the left to refine search results"));
	}

	@When("user selects normal functioning")
	public void user_selects_normal_functioning() {
		MiscUtils.sleep(5000);
		icrpSearchDatabasePage.researchAreaPanelHeader.click();
		icrpSearchDatabasePage.normalFunctioningChkbox.click();
	}

	@Then("projects with research area as normal functioning display")
	public void projects_with_research_area_as_normal_functioning_display() {
		icrpSearchDatabasePage.proj3DPrinting.click();
		

	}

}
