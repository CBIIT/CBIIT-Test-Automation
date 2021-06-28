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
<<<<<<< Updated upstream
		System.out.println(cedcdSearchCohortsPage.categoriesOfDataCollectedValues.size());
		
		for (int i = 0; i < cedcdSearchCohortsPage.categoriesOfDataCollectedValues.size(); i++) {
=======
<<<<<<< HEAD

		for (int i = 1; i < 30; i++) {
=======
		System.out.println(cedcdSearchCohortsPage.categoriesOfDataCollectedValues.size());
		
		for (int i = 0; i < cedcdSearchCohortsPage.categoriesOfDataCollectedValues.size(); i++) {
>>>>>>> 8f4e2d8f13237294dd99ecbb9a77e6b945dae2eb
>>>>>>> Stashed changes
			categoriesOfData.add(cedcdSearchCohortsPage.categoriesOfDataCollectedValues.get(i).getText());
		}

		ArrayList<String> sortedCategoriesOfData = new ArrayList<String>();

<<<<<<< Updated upstream
		for (int i = 0; i < cedcdSearchCohortsPage.categoriesOfDataCollectedValues.size(); i++) {
=======
<<<<<<< HEAD
		for (int i = 1; i < 30; i++) {
=======
		for (int i = 0; i < cedcdSearchCohortsPage.categoriesOfDataCollectedValues.size(); i++) {
>>>>>>> 8f4e2d8f13237294dd99ecbb9a77e6b945dae2eb
>>>>>>> Stashed changes
			sortedCategoriesOfData.add(cedcdSearchCohortsPage.categoriesOfDataCollectedValues.get(i).getText());
		}

		System.out.println(categoriesOfData);

		Collections.sort(sortedCategoriesOfData);
		System.out.println(sortedCategoriesOfData);

		Assert.assertTrue(categoriesOfData.equals(sortedCategoriesOfData));

	}
}