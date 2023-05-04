package AnalysisTools.ICRP.Steps;

import cucumber.api.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;


import appsCommon.PageInitializer;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

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
	public void user_searchs_by_in_search_terms(String Cost) {
		icrpSearchDatabasePage.searchTxtbox.sendKeys(Cost);
	}

	@When("user selects any of the keywords")
	public void user_selects_any_of_the_keywords() {
		MiscUtils.sleep(5000);
		icrpSearchDatabasePage.anyOfTheKeywordsBtn.click();
	}

//	@Then("study titled {string} is displayed")
//	public void study_titled_is_displayed(String gliomaOrganoids) {
////		Assert.assertTrue(icrpSearchDatabasePage.projTitles.size() == 1);
////		Assert.assertTrue(icrpSearchDatabasePage.projGliomaOrganoids.getText().contentEquals(gliomaOrganoids));
//		MiscUtils.sleep(5000);
//		Assert.assertTrue(icrpSearchDatabasePage.projectTitles.get(1).isDisplayed());
//
//	}
	

	@Then("results display {string}")
	public void resultsDisplay(String searchVal) {
		MiscUtils.sleep(5000);
		Assert.assertTrue(icrpSearchDatabasePage.projectTitles.get(1).isDisplayed());
		List<WebElement> val= (List<WebElement>) WebDriverUtils.webDriver.findElements(By.xpath("//a[contains(text(),'"+searchVal+"')]"));
		Assert.assertTrue(val.get(0).isDisplayed());
	}

	@When("user searchs {string}")
	public void user_searchs(String institutionName) {
		MiscUtils.sleep(5000);
		JavascriptUtils.scrollIntoView(icrpSearchDatabasePage.institutionPanelHeader);
		MiscUtils.sleep(3000);
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
		MiscUtils.sleep(3000);
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
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		icrpSearchDatabasePage.cancerTypePanelHeader.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		icrpSearchDatabasePage.cancerTypeTxtbox.sendKeys("Brain Tumor");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		icrpSearchDatabasePage.cancerTypeTxtbox.submit();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		icrpSearchDatabasePage.cancerTypePanelHeader.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		icrpSearchDatabasePage.cancerTypePanelHeader.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("projects with cancer type as Brain Tumor display")
	public void projects_with_cancer_type_as_Brain_Tumor_display() {
<<<<<<< HEAD
//		icrpSearchDatabasePage.projGliomaOrganoids.click();
//		CommonUtils.swicthToAnotherWindow();
//		Assert.assertTrue(icrpSearchDatabasePage.brainTumortxt.getText().contentEquals("Brain Tumor"));
		Assert.assertTrue(icrpSearchDatabasePage.projectTitles.get(1).isDisplayed());
=======
		icrpSearchDatabase.projGliomaOrganoids.click();
		CommonUtils.switchToAnotherWindow();
		Assert.assertTrue(icrpSearchDatabase.brainTumortxt.getText().contentEquals("Brain Tumor"));
>>>>>>> 29e7eb2276a2cd21a2fbade1d460e137ec0e21a5
	}

//	@Then("exact phrase provided is selected")
//	public void exact_phrase_provided_is_selected() {
//		MiscUtils.sleep(5000);
//		System.out.println(icrpSearchDatabasePage.exactPhraseRadioBtn.isSelected());
//		Assert.assertTrue(icrpSearchDatabasePage.exactPhraseRadioBtn.isSelected());
//
//	}

	@When("user clicks reset")
	public void user_clicks_reset() {
		MiscUtils.sleep(5000);
		JavascriptUtils.scrollDown(500);
		MiscUtils.sleep(3000);
		icrpSearchDatabasePage.resetBtn.click();
		

	}

	@Then("exact phrase provided is unselected")
	public void exact_phrase_provided_is_unselected() {
		Assert.assertFalse(icrpSearchDatabasePage.resetBtn.isSelected());
	}

	@When("user clicks clear")
	public void user_clicks_clear() {
		MiscUtils.sleep(8000);
		icrpSearchDatabasePage.clearBtn.click();

	}

	@Then("all projects are displayed")
	public void all_projects_are_displayed() {
		Assert.assertTrue(icrpSearchDatabasePage.projectTitles.get(1).isDisplayed());
		CucumberLogUtils.logScreenShot();
	}

	@When("user selects normal functioning")
	public void user_selects_normal_functioning() {
		MiscUtils.sleep(5000);
		icrpSearchDatabasePage.researchAreaPanelHeader.click();
		icrpSearchDatabasePage.normalFunctioningChkbox.click();
	}

	@Then("projects with research area as normal functioning display")
	public void projects_with_research_area_as_normal_functioning_display() {
		Assert.assertTrue(icrpSearchDatabasePage.projectTitles.get(1).isDisplayed());

	}

	@When("user clicks email results")
	public void user_clicks_email_results() {
		icrpSearchDatabasePage.emailResultsBtn.click();
		
	}

	@When("user enters name")
	public void user_enters_name() {
		icrpSearchDatabasePage.emailNameTxtbox.sendKeys("Shomir");
		
	}

	@When("user enters email")
	public void user_enters_email() {
		icrpSearchDatabasePage.emailRecipientTxtbox.sendKeys("shomir.uddin@nih.gov");
		
		
	}

	@When("user clicks send email")
	public void user_clicks_send_email() {
		try{
			MiscUtils.sleep(5000);
			icrpSearchDatabasePage.emailSubmitBtn.click();
		}
		catch(Exception e) {
		icrpSearchDatabasePage.emailSubmitBtn.click();
		e.printStackTrace();
		}
		
		
	}

	@Then("email is sent")
	public void email_is_sent() {
		
		Assert.assertEquals("Your email has been sent successfully!", icrpSearchDatabasePage.emailSuccessMsg.getText());	
	}
	
	
	@When("user clicks export button")
	public void user_clicks_export_button() {
	    icrpSearchDatabasePage.exportBtn.click();
	}
	
	@When("user clicks projects multisheet")
	public void user_clicks_projects_multisheet() {
		MiscUtils.sleep(5000);
		 icrpSearchDatabasePage.projectMultisheetBtn.click();
		MiscUtils.sleep(15000);
	}
	
	@Then("data is exported")
	public void data_is_exported() {
		Assert.assertTrue(icrpSearchDatabasePage.projectTitles.get(1).isDisplayed());
	   
	}
	@Then("verify dataset download {string}")
	public void verifyDatasetDownload(String fileName) {
		MiscUtils.sleep(20000);
		Assert.assertTrue(CommonUtils.isFileDownloaded(fileName));
		MiscUtils.sleep(10000);
		CommonUtils.deleteFile(fileName);
	}

    @And("click on reset button")
    public void clickOnResetButton() {
		icrpSearchDatabasePage.resetBtn.click();
    }

	@And("validate the search term data is removed")
	public void validateTheSearchTermDataIsRemoved() {
		String data=icrpSearchDatabasePage.searchTxtbox.getText();
		Assert.assertNotEquals(data,"Cost");
	}
}
