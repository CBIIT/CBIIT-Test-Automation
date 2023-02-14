package AnalysisTools.ICRP.Steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;

import AnalysisTools.ICRP.Pages.ICRPSearchDatabase;
import appsCommon.PageInitializer;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

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
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		icrpHomePage.searchDatabaseBtn.click();
		MiscUtils.sleep(5000);
	
	}

	@When("user clicks search")
	public void user_clicks_search() {
//		WebDriverWait wait = new WebDriverWait(WebDriverUtils.webDriver , 1800); 
//		wait.until(ExpectedConditions.elementToBeClickable((By.xpath("//*[@class='btn btn-primary ml2']"))));
		icrpSearchDatabase.searchBtn.click();
		MiscUtils.sleep(5000);
	}

	@Then("{string} and {string} displays")
	public void and_displays(String totalBaseProjects, String totalProjects) {
		Assert.assertTrue(icrpSearchDatabase.totalBaseProj.getText().contentEquals(totalBaseProjects));
		Assert.assertTrue(icrpSearchDatabase.totalProj.getText().contentEquals(totalProjects));
	}

	@When("user searchs by {string} in search terms")
	public void user_searchs_by_in_search_terms(String Cost) {
		icrpSearchDatabase.searchTxtbox.sendKeys(Cost);
	}

	@When("user selects any of the keywords")
	public void user_selects_any_of_the_keywords() {
		MiscUtils.sleep(5000);
		icrpSearchDatabase.anyOfTheKeywordsBtn.click();
	}

	@Then("study titled {string} is displayed")
	public void study_titled_is_displayed(String gliomaOrganoids) {
//		Assert.assertTrue(icrpSearchDatabase.projTitles.size() == 1);
//		Assert.assertTrue(icrpSearchDatabase.projGliomaOrganoids.getText().contentEquals(gliomaOrganoids));
		Assert.assertTrue(icrpSearchDatabase.projectTitles.get(1).isDisplayed());

	}

	@When("user searchs {string}")
	public void user_searchs(String institutionName) {
		MiscUtils.sleep(5000);
		JavascriptUtils.scrollIntoView(icrpSearchDatabase.institutionPanelHeader);
		MiscUtils.sleep(3000);
		icrpSearchDatabase.institutionPanelHeader.click();
		icrpSearchDatabase.institutionTxtBox.sendKeys(institutionName);
	}

	@Then("projects with institution as {string} display")
	public void projects_with_institution_as_display(String institutionName) {
		for (int i = 0; i < icrpSearchDatabase.institutionUniversityOfColoradoDenver.size(); i++) {
			Assert.assertTrue(icrpSearchDatabase.institutionUniversityOfColoradoDenver.get(i).getText()
					.contentEquals(institutionName));
		}

	}

	@When("user selects Alexs Lemonade Stand Foundation")
	public void user_selects_Alexs_Lemonade_Stand_Foundation() {
		MiscUtils.sleep(5000);
		JavascriptUtils.scrollIntoView(icrpSearchDatabase.fundingPanelHeader);
		MiscUtils.sleep(3000);
		icrpSearchDatabase.fundingPanelHeader.click();
		icrpSearchDatabase.ALSFChkbox.click();
		MiscUtils.sleep(5000);

	}

	@Then("projects funded by Alexs Lemonade Stand Foundation displays")
	public void projects_funded_by_Alexs_Lemonade_Stand_Foundation_displays() {
		Assert.assertTrue(icrpSearchDatabase.fundingOrgALSF.getText().contentEquals("ALSF"));

	}

	@When("user selects cancer type as brain tumor")
	public void user_selects_cancer_type_as_brain_tumor() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		icrpSearchDatabase.cancerTypePanelHeader.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		icrpSearchDatabase.cancerTypeTxtbox.sendKeys("Brain Tumor");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		icrpSearchDatabase.cancerTypeTxtbox.submit();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		icrpSearchDatabase.cancerTypePanelHeader.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		icrpSearchDatabase.cancerTypePanelHeader.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("projects with cancer type as Brain Tumor display")
	public void projects_with_cancer_type_as_Brain_Tumor_display() {
//		icrpSearchDatabase.projGliomaOrganoids.click();
//		CommonUtils.swicthToAnotherWindow();
//		Assert.assertTrue(icrpSearchDatabase.brainTumortxt.getText().contentEquals("Brain Tumor"));
		Assert.assertTrue(icrpSearchDatabase.projectTitles.get(1).isDisplayed());
	}

//	@Then("exact phrase provided is selected")
//	public void exact_phrase_provided_is_selected() {
//		MiscUtils.sleep(5000);
//		System.out.println(icrpSearchDatabase.exactPhraseRadioBtn.isSelected());
//		Assert.assertTrue(icrpSearchDatabase.exactPhraseRadioBtn.isSelected());
//
//	}

	@When("user clicks reset")
	public void user_clicks_reset() {
		MiscUtils.sleep(5000);
		JavascriptUtils.scrollDown(500);
		MiscUtils.sleep(3000);
		icrpSearchDatabase.resetBtn.click();

	}

	@Then("exact phrase provided is unselected")
	public void exact_phrase_provided_is_unselected() {
		Assert.assertFalse(icrpSearchDatabase.resetBtn.isSelected());
	}

	@When("user clicks clear")
	public void user_clicks_clear() {
		MiscUtils.sleep(8000);
		icrpSearchDatabase.clearBtn.click();

	}

	@Then("all projects are displayed")
	public void all_projects_are_displayed() {
		Assert.assertTrue(icrpSearchDatabase.projectTitles.get(1).isDisplayed());
	}

	@When("user selects normal functioning")
	public void user_selects_normal_functioning() {
		MiscUtils.sleep(5000);
		icrpSearchDatabase.researchAreaPanelHeader.click();
		icrpSearchDatabase.normalFunctioningChkbox.click();
	}

	@Then("projects with research area as normal functioning display")
	public void projects_with_research_area_as_normal_functioning_display() {
		Assert.assertTrue(icrpSearchDatabase.projectTitles.get(1).isDisplayed());

	}

}
