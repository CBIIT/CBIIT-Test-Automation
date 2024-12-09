package ANALYSIS_TOOLS.CEDCD.steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.JavascriptUtils;
import APPS_COMMON.PageInitializers.PageInitializer;

public class CEDCDBiospecimenCountsSelectAllCohortsSteps extends PageInitializer {

	@Given("the user is on the CEDCD Biospecimen Tab")
	public void the_user_is_on_the_CEDCD_Biospecimen_Tab()  {
		cedcdStartUps.setUpOnBiospecimenTabPage();
	}

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

	@Then("all Specimen tabs are selected")
	public void all_Specimen_tabs_are_selected() {
		Assert.assertTrue(cedcdBiospecimenCountsPage.specimenTypeDropDownAllTypeValue.isEnabled());
		CucumberLogUtils.logScreenshot();
	}
}