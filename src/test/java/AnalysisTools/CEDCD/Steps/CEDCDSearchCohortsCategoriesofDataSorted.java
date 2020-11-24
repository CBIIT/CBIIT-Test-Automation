package AnalysisTools.CEDCD.Steps;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Assert;

import com.nci.automation.web.JavascriptUtils;

import appsCommon.PageInitializer;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CEDCDSearchCohortsCategoriesofDataSorted extends PageInitializer{
	
	@When("the user clicks on the Categories of Data Collected drop down")
	public void the_user_clicks_on_the_Categories_of_Data_Collected_drop_down() {
		/** This step clicks on the categories of data collected drop down */
		JavascriptUtils.clickByJS(cedcdSearchCohortsPage.categoriesOfDataCollectedDropDown);
		
	}

	@Then("all selections are sorted alphabetically")
	public void all_selections_are_sorted_alphabetically() {
		
		/** This step will pull the values from the drop downs in the initial order and then sort them, compare them and verify that the drop down is sorted alphabetically */
		
		ArrayList<String> categoriesOfData = new ArrayList<String>();

		for (int i = 1; i < 30; i++) {
			categoriesOfData.add(cedcdSearchCohortsPage.categoriesOfDataCollectedValues.get(i).getText());
		}
		
		ArrayList<String> sortedCategoriesOfData = new ArrayList<String>();

		for (int i = 1; i < 30; i++) {
			sortedCategoriesOfData.add(cedcdSearchCohortsPage.categoriesOfDataCollectedValues.get(i).getText());
		}
		
		System.out.println(categoriesOfData);
		
		Collections.sort(sortedCategoriesOfData);
		System.out.println(sortedCategoriesOfData);
		
		Assert.assertTrue(categoriesOfData.equals(sortedCategoriesOfData));
		
		
	}

	
}
