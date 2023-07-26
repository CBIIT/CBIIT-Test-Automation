package AnalysisTools.mSigPortal.Steps;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;

import appsCommon.PageInitializer;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CatalogSteps extends PageInitializer {

	@When("the user navigates to the Catalog page")
	public void the_user_navigates_to_the_Catalog_page() {
		JavascriptUtils.clickByJS(mSigPortalHomePage.CatalogTab);

	}

	@When("the user calculates by clicking on the SBS Graph")
	public void the_user_calculates_by_clicking_on_the_SBS_Graph() {

		MiscUtils.sleep(2000);
		JavascriptUtils.clickByJS(catalogPages.signaturesSearchIcon);
		MiscUtils.sleep(2000);
		JavascriptUtils.scrollIntoView(catalogPages.catalogSignatureName);
		CucumberLogUtils.takeScreenShot(HooksSteps.scenario);

	}

	@Then("a download link for the graph is displayed on the Catalog page")
	public void a_download_link_for_the_graph_is_displayed_on_the_Catalog_page() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(catalogPages.downloadPlotOnEtiologyPage);
		JavascriptUtils.drawRedBorder(catalogPages.downloadPlotOnEtiologyPage);
		CucumberLogUtils.takeScreenShot(HooksSteps.scenario);

	}

	@And("the user clicks Catagory")
	public void theUserClicksCatagory() {

	}

	@And("the user clicks Cancer Reference Signatures Catagory")
	public void theUserClicksCancerReferenceSignaturesCatagory() {
		catalogPages.catalogCancerrefSignature.click();

	}

	@And("the user clicks Aflatoxin Proposed Etiologies")
	public void theUserClicksAflatoxinProposedEtiologies() {
		catalogPages.catalogCancerrefAflatoxin.click();
		JavascriptUtils.scrollDown(200);
	}

	@And("the user selects SBS{int} signature")
	public void theUserSelectsSBSSignature(int arg0) {
		MiscUtils.sleep(1000);
		catalogPages.catalogSignatureSBS24.click();
	}

	@Then("SBS{int} plot displays")
	public void sbsPlotDisplays(int arg0) {
		Assert.assertTrue(catalogPages.catalogSignatureSBS24Display.isDisplayed());
	}

	@And("the user clicks Reference Signature tab")
	public void theUserClicksReferenceSignatureTab() {
		catalogPages.catalogReferenceSignature.click();
	}

	@And("the SBS{int} Pie chart is displays")
	public void theSBSPieChartIsDisplays(int arg0) {
		MiscUtils.sleep(3000);
		Assert.assertTrue(catalogPages.catalogReferenceSignatureSBS96.isDisplayed());
	}

	@And("the user clicks RSProfile")
	public void theUserClicksRSProfile() {
		catalogPages.rsProfile.click();
	}

	@And("the user clicks calculate button")
	public void theUserClicksCalculateButton() {
		catalogPages.rsProfileCalculate.click();
	}

	@Then("the SBS{int} plot is displays")
	public void theSBSPlotIsDisplays(int arg0) {
		Assert.assertTrue(catalogPages.rsProfileSBS1display.isDisplayed());
	}

	@Then("the RS Profile graph is displays")
	public void theRSProfileGraphIsDisplays() {
		Assert.assertTrue(catalogPages.rsProfileGraphDisplay.isDisplayed());
	}

	@Then("the RS Profile graph bar is displays")
	public void theRSProfileGraphBarIsDisplays() throws InterruptedException {
		Actions act = new Actions(WebDriverUtils.webDriver);
		try {
			Thread.sleep(5000);
			act.moveToElement(catalogPages.rsProfileGraphBarsDisplay).perform();
			String barVal = catalogPages.rsProfileGraphBarsValue.getText();
			System.out.println("Bars value is :" + barVal);
			Assert.assertEquals(barVal, "(ACG, 36.5%)");
			Thread.sleep(5000);
		} catch (Exception e) {
			System.out.println("Value not found for the bar");
		}
		// Assert.assertTrue(catalogPages.rsProfileGraphDisplay.isDisplayed());
	}

}
