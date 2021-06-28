package AnalysisTools.CEDCD.Steps;

import org.junit.Assert;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.JavascriptUtils;

import appsCommon.PageInitializer;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CEDCDBiospecimenCountClearAllSteps extends PageInitializer {

	/** This clicks on the Specimen Type drop down and selects "All Type" */
	@When("the user selects All Types from the Specimen Type drop down")
	public void the_user_selects_All_Types_from_the_Specimen_Type_drop_down() {

		JavascriptUtils.clickByJS(cedcdBiospecimenCountsPage.specimenType);
		JavascriptUtils.clickByJS(cedcdBiospecimenCountsPage.specimenTypeDropDownAllTypeValue);

	}

	/** This method clicks on the Cancer Type drop down and selects "All Type" */
	@When("the user selects All Cancers from the Cancer Type drop down")
	public void the_user_selects_All_Cancers_from_the_Cancer_Type_drop_down() {
		JavascriptUtils.clickByJS(cedcdBiospecimenCountsPage.cancerType);
		JavascriptUtils.clickByJS(cedcdBiospecimenCountsPage.cancerTypeDropDownAllTypeValues);
	}

<<<<<<< Updated upstream
	/** This method clicks on the Cohorts drop down and selects "All Types" 
	 * @throws InterruptedException */
=======
<<<<<<< HEAD
	/** This method clicks on the Cohorts drop down and selects "All Types" */
=======
	/** This method clicks on the Cohorts drop down and selects "All Types" 
	 * @throws InterruptedException */
>>>>>>> 8f4e2d8f13237294dd99ecbb9a77e6b945dae2eb
>>>>>>> Stashed changes
	@When("the user selects All Cohorts from the Cohorts drop down")
	public void the_user_selects_All_Cohorts_from_the_Cohorts_drop_down() {
		JavascriptUtils.clickByJS(cedcdBiospecimenCountsPage.cohortType);
		JavascriptUtils.clickByJS(cedcdBiospecimenCountsPage.cohortTypeDropDownAllTypeValue);
<<<<<<< Updated upstream
		
=======
<<<<<<< HEAD
>>>>>>> Stashed changes
	}

	/** The user clicks on the submit button to search and takes a screenshot 
	 * @throws InterruptedException */
	@When("the user searches results")
	public void the_user_searches_results() throws InterruptedException  {

		JavascriptUtils.clickByJS(cedcdBiospecimenCountsPage.biospecimenSubmitBtn);
		CucumberLogUtils.logScreenShot();
<<<<<<< Updated upstream
		Thread.sleep(1000);
		
=======
=======
		
	}

	/** The user clicks on the submit button to search and takes a screenshot 
	 * @throws InterruptedException */
	@When("the user searches results")
	public void the_user_searches_results() throws InterruptedException  {

		JavascriptUtils.clickByJS(cedcdBiospecimenCountsPage.biospecimenSubmitBtn);
		CucumberLogUtils.logScreenShot();
		Thread.sleep(1000);
		
>>>>>>> 8f4e2d8f13237294dd99ecbb9a77e6b945dae2eb
>>>>>>> Stashed changes

	}

	/** This method clicks on the "Clear All" button */
	@When("the user clicks on the Clear All button")
	public void the_user_clicks_on_the_Clear_All_button() {
		JavascriptUtils.clickByJS(cedcdBiospecimenCountsPage.biospecimenClearAllBtn);
<<<<<<< Updated upstream
		CucumberLogUtils.logScreenShot();
=======
<<<<<<< HEAD
=======
		CucumberLogUtils.logScreenShot();
>>>>>>> 8f4e2d8f13237294dd99ecbb9a77e6b945dae2eb
>>>>>>> Stashed changes
	}

	/**
	 * This method verifies that all selected fields are cleared and takes a
	 * screenshot The only reason the bipSpecimen submit button should be disabled
	 * is because no options are selected in the drop downs
	 */
	@Then("all previously selected fields are no longer selected")
	public void all_previously_selected_fields_are_no_longer_selected() {

<<<<<<< Updated upstream
		Assert.assertTrue(cedcdBiospecimenCountsPage.biospecimenSubmitBtn.isEnabled());
=======
<<<<<<< HEAD
		Assert.assertFalse(cedcdBiospecimenCountsPage.biospecimenSubmitBtn.isEnabled());
		CucumberLogUtils.logScreenShot();
=======
		Assert.assertTrue(cedcdBiospecimenCountsPage.biospecimenSubmitBtn.isEnabled());
>>>>>>> 8f4e2d8f13237294dd99ecbb9a77e6b945dae2eb
>>>>>>> Stashed changes
		MiscUtils.sleep(2000);

	}

}
