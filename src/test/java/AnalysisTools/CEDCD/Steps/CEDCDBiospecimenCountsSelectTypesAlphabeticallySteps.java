package AnalysisTools.CEDCD.Steps;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;

import appsCommon.PageInitializer;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CEDCDBiospecimenCountsSelectTypesAlphabeticallySteps extends PageInitializer {

	ArrayList<WebElement> arrayListOne;

	@When("the user clicks on the Specimen Types drop down")
	public void the_user_clicks_on_the_Specimen_Types_drop_down() {

		/** This step clicks on the specimen type drop down */
		JavascriptUtils.clickByJS(cedcdBiospecimenCountsPage.specimenType);

	}

	@Then("the alphabetized Specimen Types are displayed")
	public void the_alphabetized_Specimen_Types_are_displayed() throws InterruptedException {

		/**
		 * This step pulls all the values from the specimen type drop down, compares
		 * them, and logs a screenshot
		 */

		cedcdAlphabetizedSelectTypesStepImp.alphabetizedComparison();

	}
}
