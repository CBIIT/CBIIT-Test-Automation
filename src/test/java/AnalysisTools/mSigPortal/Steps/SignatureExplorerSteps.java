package AnalysisTools.mSigPortal.Steps;

import org.junit.Assert;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;

import appsCommon.PageInitializer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class SignatureExplorerSteps extends PageInitializer {
	
	@When("the user navigates to the Signature Explorer page")
	public void the_user_navigates_to_the_Signature_Explorer_page() {
		
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.clickByJS(mSigPortalHomePage.signatureExplorerTab);
	
	}
	
	@Then("the Instructions are displayed")
	public void the_Instructions_are_displayed() {
		
		Assert.assertTrue(signatureExplorerPages.instructionsOnExplorerPage.getText().equalsIgnoreCase("Choose a Data Source and its associated options to submit a query using the panel on the left"));
		
	}

	@When("the user calculates by clicking on the graph")
	public void the_user_calculates_by_clicking_on_the_graph() {
		
		JavascriptUtils.clickByJS(signatureExplorerPages.calculateOnExplorerTab);
		
	}

	@Then("a download link for the graph is displayed")
	public void a_download_link_for_the_graph_is_displayed() {
		
		CucumberLogUtils.logScreenShot();
		Assert.assertTrue(signatureExplorerPages.downloadFirstPlotOnSignatureExplorer.isDisplayed());
		
	}
	
	@When("the user navigates to and Calculates All on the Exposure tab")
	public void the_user_navigates_to_and_Calculates_All_on_the_Exposure_tab() {
		
		JavascriptUtils.clickByJS(signatureExplorerPages.exposureTabOnSignatureExposureSection);
		JavascriptUtils.clickByJS(signatureExplorerPages.calculateAllButtonOnExposureTab);
		MiscUtils.sleep(3000);
		JavascriptUtils.clickByJS(signatureExplorerPages.calculateOnTumorMutationalBurdenSearch);
		MiscUtils.sleep(10000);
//		CommonUtils.waitForVisibility(signatureExplorerPages.imageOnExposureSearch);

	}

	@Then("the Tumor Mutational Burden download plot link is displayed")
	public void the_Tumor_Mutational_Burden_download_plot_link_is_displayed() {
		
		MiscUtils.sleep(2000);
		JavascriptUtils.scrollIntoView(signatureExplorerPages.tmbText);
		CucumberLogUtils.logScreenShot();
		Assert.assertTrue(signatureExplorerPages.imageOnExposureSearch.isEnabled());

	}
	
	@When("the user calculates using public data")
	public void the_user_calculates_using_public_data() {
		
		MiscUtils.sleep(2000);
		JavascriptUtils.clickByJS(signatureExplorerPages.explorerCalculate);
		CommonUtils.waitForVisibility(signatureExplorerPages.tmbText);
		

		
	}

}
