package AnalysisTools.CEDCD.Steps;

import java.util.ArrayList;
import org.openqa.selenium.WebElement;
import com.nci.automation.web.JavascriptUtils;
import appsCommon.PageInitializer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

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
