package AnalysisTools.CEDCD.Steps;

import com.nci.automation.web.JavascriptUtils;
import appsCommon.PageInitializer;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CEDCDSearchCohortsCategoriesofDataSortedSteps extends PageInitializer {

	@When("the user clicks on the Categories of Data Collected drop down")
	public void the_user_clicks_on_the_Categories_of_Data_Collected_drop_down() {
		/** This step clicks on the categories of data collected drop down */
		JavascriptUtils.clickByJS(cedcdSearchCohortsPage.categoriesOfDataCollectedDropDown);

	}

	@Then("all selections are sorted alphabetically")
	public void all_selections_are_sorted_alphabetically() {

		cedcdSearchCohortsCategoriesOfDataOfDataSortedStepImp.sortingCategoriesOfDataCollectedAlphabetically();

	}

}
