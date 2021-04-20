package AnalysisTools.CEDCD.StepsImplementation;

import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.JavascriptUtils;
import appsCommon.PageInitializer;

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

	/**
	 * This method verifies the correct number of cohorts are returned, highlights
	 * the results in red and logs screenshot
	 */
//	public void femaleResultsReturnedWithRedBorderScreenshot() {
//		MiscUtils.sleep(2000);
//		Assert.assertTrue(cedcdSearchCohortsPage.numberOfSearchResultReturned.getText().contains("53"));
//		JavascriptUtils.drawRedBorder(cedcdSearchCohortsPage.numberOfSearchResultReturned);
//		CucumberLogUtils.logScreenShot();
//	}

	public void comparingResultsReturnedtoFemaleAndAllValues() {

		List<WebElement> listOfWebElements = cedcdSearchCohortsPage.returnedResultsForFemaleFilter;

		System.out.println(listOfWebElements.size());

		for (WebElement webElement : listOfWebElements) {
			String locator = webElement.getText();
			if (locator.endsWith("All")) {

			} else if (locator.endsWith("Female")) {

			}
			System.out.println("Returned result: " + locator);
		}
	}

}
