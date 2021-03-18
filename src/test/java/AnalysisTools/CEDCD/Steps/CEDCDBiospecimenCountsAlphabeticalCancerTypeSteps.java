package AnalysisTools.CEDCD.Steps;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Assert;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.xceptions.TestingException;

import appsCommon.PageInitializer;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CEDCDBiospecimenCountsAlphabeticalCancerTypeSteps extends PageInitializer {

	@Given("the user is on the CEDCD Biospecimen tab")
	public void the_user_is_on_the_CEDCD_Biospecimen_tab() throws TestingException {

		/** This step starts the browser and directs us to the CEDCD Biospecimen Tab */
		cedcdStartUps.setUpOnBiospecimenTabPage();

	}

	@When("the user clicks on the Cancer Types drop down")
	public void the_user_clicks_on_the_Cancer_Types_drop_down() {

		/** This step clicks on the Cancer Type */
		JavascriptUtils.clickByJS(cedcdBiospecimenCountsPage.cancerType);

	}

	@Then("the drop down is sorted alphabetically")
	public void the_drop_down_is_sorted_alphabetically() {

		/**
		 * This step verifies that the drop down is sorted alphabetically and logs a
		 * screenshot
		 */
		cedcdBiospecimenCountsAlphabeticalCancerTypeStepImp.sortCancerTypeAlphabetically();

	}

}
