package AnalysisTools.mSigPortal.Steps;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;

import appsCommon.PageInitializer;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

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
		CucumberLogUtils.logScreenShot();
		

	}
	
	@Then("a download link for the graph is displayed on the Catalog page")
	public void a_download_link_for_the_graph_is_displayed_on_the_Catalog_page() {
		
		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(catalogPages.downloadPlotOnEtiologyPage);
		JavascriptUtils.drawRedBorder(catalogPages.downloadPlotOnEtiologyPage);
		CucumberLogUtils.logScreenShot();
		
	}

}
