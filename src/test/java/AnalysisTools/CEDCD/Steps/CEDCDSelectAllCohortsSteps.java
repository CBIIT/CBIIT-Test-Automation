package AnalysisTools.CEDCD.Steps;

import appsCommon.PageInitializer;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class CEDCDSelectAllCohortsSteps extends PageInitializer {

	@And("the user clicks on the select all check box")
	public void the_user_clicks_on_the_select_all_check_box() {

		cedcdSelectAllCohortsStepImp.clickOnSelectAllCheckbox();

	}

	@Then("all studies are selected")
	public void all_studies_are_selected() {
		cedcdSelectAllCohortsStepImp.verifyNumberOfCohortsReturned();

	}

}
