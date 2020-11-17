package AnalysisTools.CEDCD.Steps;

import org.junit.Assert;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.JavascriptUtils;

import appsCommon.PageInitializer;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CEDCDBiospecimenCountsSelectAllCohortsSteps extends PageInitializer{
	
	/** this method clicks but  */
	
	@When("the user clicks on the Biospecimen Counts tab")
	public void the_user_clicks_on_the_Biospecimen_Counts_tab() {
		JavascriptUtils.clickByJS(cedcdBiospecimenCountsPage.biospecimenTab);
	}

	@When("the user clicks on the Specimen Type drop down")
	public void the_user_clicks_on_the_Specimen_Type_drop_down() {
		JavascriptUtils.clickByJS(cedcdBiospecimenCountsPage.specimenType);
		
		
	}

	@When("the user clicks on the All Types check box")
	public void the_user_clicks_on_the_All_Types_check_box() {
		JavascriptUtils.clickByJS(cedcdBiospecimenCountsPage.specimenTypeDropDownAllTypeValue);
		
	}

	
	/** This method verifies that the "All Types" check box is enabled
	 * NOTE that you can have the "All Types" check box selected and un-select the other values but still have the "All Types" check box enabled */
	@Then("all Specimen tabs are selected")
	public void all_Specimen_tabs_are_selected() {
		Assert.assertTrue(cedcdBiospecimenCountsPage.specimenTypeDropDownAllTypeValue.isEnabled());
		CucumberLogUtils.logScreenShot();
		
		
	}
	
}
