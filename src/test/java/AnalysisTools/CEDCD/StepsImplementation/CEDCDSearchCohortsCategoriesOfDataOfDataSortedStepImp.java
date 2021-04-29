package AnalysisTools.CEDCD.StepsImplementation;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Assert;

import appsCommon.PageInitializer;

public class CEDCDSearchCohortsCategoriesOfDataOfDataSortedStepImp extends PageInitializer {

	public void sortingCategoriesOfDataCollectedAlphabetically() {
		/**
		 * This step will pull the values from the drop downs in the initial order and
		 * then sort them, compare them and verify that the drop down is sorted
		 * alphabetically
		 */

		ArrayList<String> categoriesOfData = new ArrayList<String>();
		System.out.println(cedcdSearchCohortsPage.categoriesOfDataCollectedValues.size());
		
		for (int i = 0; i < cedcdSearchCohortsPage.categoriesOfDataCollectedValues.size(); i++) {
			categoriesOfData.add(cedcdSearchCohortsPage.categoriesOfDataCollectedValues.get(i).getText());
		}

		ArrayList<String> sortedCategoriesOfData = new ArrayList<String>();

		for (int i = 0; i < cedcdSearchCohortsPage.categoriesOfDataCollectedValues.size(); i++) {
			sortedCategoriesOfData.add(cedcdSearchCohortsPage.categoriesOfDataCollectedValues.get(i).getText());
		}

		System.out.println(categoriesOfData);

		Collections.sort(sortedCategoriesOfData);
		System.out.println(sortedCategoriesOfData);

		Assert.assertTrue(categoriesOfData.equals(sortedCategoriesOfData));

	}
}