package AnalysisTools.mSigPortal.Steps;

import org.junit.Assert;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;

import appsCommon.PageInitializer;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignatureExplorerSteps extends PageInitializer {
	
	@When("the user navigates to the Signature Explorer page")
	public void the_user_navigates_to_the_Signature_Explorer_page() {
		
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.clickByJS(mSigPortalHomePage.signatureExplorerTab);
	
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
		
		Assert.assertTrue(signatureExplorerPages.imageOnExposureSearch.isEnabled());

	}

}
