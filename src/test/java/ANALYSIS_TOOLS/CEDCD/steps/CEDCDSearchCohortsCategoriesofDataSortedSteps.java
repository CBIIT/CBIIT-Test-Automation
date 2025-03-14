package ANALYSIS_TOOLS.CEDCD.steps;

import com.nci.automation.web.JavascriptUtils;
import APPS_COMMON.PageInitializers.PageInitializer;
import io.cucumber.java.en.*;

public class CEDCDSearchCohortsCategoriesofDataSortedSteps extends PageInitializer {

	@When("the user clicks on the Categories of Data Collected drop down")
	public void the_user_clicks_on_the_Categories_of_Data_Collected_drop_down() {
		JavascriptUtils.clickByJS(cedcdSearchCohortsPage.categoriesOfDataCollectedDropDown);
	}

	@Then("all selections are sorted alphabetically")
	public void all_selections_are_sorted_alphabetically() {
		cedcdSearchCohortsCategoriesOfDataOfDataSortedStepImp.sortingCategoriesOfDataCollectedAlphabetically();
	}
}