package AnalysisTools.CEDCD.StepsImplementation;

import java.util.List;

import org.openqa.selenium.WebElement;
import appsCommon.PageInitializers.PageInitializer;

public class CEDCDSearchFemaleCohortsStepImp extends PageInitializer {

	/**
	 * This method filters the cohorts by selecting female and clicking "Search
	 * Cohorts" button
	 */
	public void filterResultsByFemale() {
		cedcdSearchCohortsPage.searchCohortsGenderBtn.click();
		cedcdSearchCohortsPage.searchCohortsFemaleOption.click();
		cedcdSearchCohortsPage.searchCohortResultBtn.click();
		cedcdSearchCohortsPage.searchCohortSelectAllCheckbox.click();
		cedcdSearchCohortsPage.viewSelectedCohortDataButton.click();
	}
	public void comparingResultsReturnedtoFemaleAndAllValues() {

		List<WebElement> listOfWebElements = cedcdSearchCohortsPage.returnedResultsFilter;
		System.out.println(listOfWebElements.size());
		for (WebElement webElement : listOfWebElements) {
			String locator = webElement.getText();
			if (locator.endsWith("All")) {
			} 
			else if (locator.endsWith("Female")) {
			}
			System.out.println("Returned result: " + locator);
		}
		
	}

}
