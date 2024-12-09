package ANALYSIS_TOOLS.mSigPortal.steps;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import APPS_COMMON.PageInitializers.PageInitializer;
import io.cucumber.java.en.*;

public class CatalogSteps extends PageInitializer {

	@When("the user navigates to the Catalog page")
	public void the_user_navigates_to_the_Catalog_page() {
		JavascriptUtils.clickByJS(mSigPortalHomePage.CatalogTab);
	}

	@When("the user clicks RSProfile")
	public void the_user_clicks_rs_profile() {
	}
	@When("the user clicks calculate button")
	public void the_user_clicks_calculate_button() {
	}
	@Then("the SBS1 plot is displays")
	public void the_sbs1_plot_is_displays() {
	}
	@Then("the RS Profile graph is displays")
	public void the_rs_profile_graph_is_displays() {
	}
	@Then("the RS Profile graph bar is displays")
	public void the_rs_profile_graph_bar_is_displays() {
	}
	@When("the user clicks Reference Signature tab")
	public void the_user_clicks_reference_signature_tab() {
	}
	@Then("the SBS96 Pie chart is displays")
	public void the_sbs96_pie_chart_is_displays() {
	}

	@When("the user calculates by clicking on the SBS Graph")
	public void the_user_calculates_by_clicking_on_the_SBS_Graph() {
		CommonUtils.sleep(2000);
		JavascriptUtils.clickByJS(catalogPages.signaturesSearchIcon);
		CommonUtils.sleep(2000);
		JavascriptUtils.scrollIntoView(catalogPages.catalogSignatureName);
		CucumberLogUtils.logScreenshot();
	}

	@Then("a download link for the graph is displayed on the Catalog page")
	public void a_download_link_for_the_graph_is_displayed_on_the_Catalog_page() {
		CommonUtils.sleep(1000);
		CommonUtils.waitForVisibility(catalogPages.downloadPlotOnEtiologyPage);
		JavascriptUtils.drawRedBorder(catalogPages.downloadPlotOnEtiologyPage);
		CucumberLogUtils.logScreenshot();
	}

	@When("the user clicks Cancer Reference Signatures Catagory")
	public void the_user_clicks_cancer_reference_signatures_catagory() {
	}
	@When("the user clicks Aflatoxin Proposed Etiologies")
	public void the_user_clicks_aflatoxin_proposed_etiologies() {
	}
	@When("the user selects SBS24 signature")
	public void the_user_selects_sbs24_signature() {
	}
	@Then("SBS24 plot displays")
	public void sbs24_plot_displays() {
	}
}