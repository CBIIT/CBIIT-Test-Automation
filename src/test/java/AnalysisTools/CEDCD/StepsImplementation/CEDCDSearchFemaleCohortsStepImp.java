package AnalysisTools.CEDCD.StepsImplementation;

<<<<<<< Updated upstream
import java.util.List;
=======
<<<<<<< HEAD
>>>>>>> Stashed changes
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.JavascriptUtils;
<<<<<<< Updated upstream
=======
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;

=======
import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.JavascriptUtils;
>>>>>>> 8f4e2d8f13237294dd99ecbb9a77e6b945dae2eb
>>>>>>> Stashed changes
import appsCommon.PageInitializer;

public class CEDCDSearchFemaleCohortsStepImp extends PageInitializer {

<<<<<<< Updated upstream
=======
<<<<<<< HEAD

=======
>>>>>>> 8f4e2d8f13237294dd99ecbb9a77e6b945dae2eb
>>>>>>> Stashed changes
	/**
	 * This method filters the cohorts by selecting female and clicking "Search
	 * Cohorts" button
	 */
	public void filterResultsByFemale() {
		cedcdSearchCohortsPage.searchCohortsGenderBtn.click();
		cedcdSearchCohortsPage.searchCohortsFemaleOption.click();
		cedcdSearchCohortsPage.searchCohortResultBtn.click();
<<<<<<< Updated upstream
		cedcdSearchCohortsPage.searchCohortSelectAllCheckbox.click();
		cedcdSearchCohortsPage.viewSelectedCohortDataButton.click();
	}
=======
<<<<<<< HEAD
		cedcdSearchCohortsPage.showVariablesCollectedInCohortStudy.click();

	}

	/**
	 * This method verifies the correct number of cohorts are returned, highlights
	 * the results in red and logs screenshot
	 */
	public void femaleResultsReturnedWithRedBorderScreenshot() {
		MiscUtils.sleep(2000);
		Assert.assertTrue(cedcdSearchCohortsPage.numberOfSearchResultReturned.getText().contains("53"));
		JavascriptUtils.drawRedBorder(cedcdSearchCohortsPage.numberOfSearchResultReturned);
		CucumberLogUtils.logScreenShot();
=======
		cedcdSearchCohortsPage.searchCohortSelectAllCheckbox.click();
		cedcdSearchCohortsPage.viewSelectedCohortDataButton.click();
	}
>>>>>>> Stashed changes
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
		
<<<<<<< Updated upstream
=======
>>>>>>> 8f4e2d8f13237294dd99ecbb9a77e6b945dae2eb
>>>>>>> Stashed changes
	}

}
