package AnalysisTools.CEDCD.Steps;

import com.nci.automation.web.JavascriptUtils;
import appsCommon.PageInitializers.PageInitializer;
import io.cucumber.java.en.*;

public class CEDCDBiospecimenCountsSelectTypesAlphabeticallySteps extends PageInitializer {

	@When("the user clicks on the Specimen Types drop down")
	public void the_user_clicks_on_the_Specimen_Types_drop_down() {
		JavascriptUtils.clickByJS(cedcdBiospecimenCountsPage.specimenType);
	}

	@Then("the alphabetized Specimen Types are displayed")
	public void the_alphabetized_Specimen_Types_are_displayed() throws InterruptedException {
		cedcdAlphabetizedSelectTypesStepImp.alphabetizedComparison();
	}
}