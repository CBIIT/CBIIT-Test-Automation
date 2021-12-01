package ServiceNow.CHARMS.StepsImplementation;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.nci.automation.utils.MiscUtils;

import appsCommon.PageInitializer;

public class RASSurveyStepsImpl extends PageInitializer {

	/*
	 * Use this method to click all check boxes in myRassurvey
	 */
	public void selectingCheckBoxes() {

		MiscUtils.sleep(1000);
		List<WebElement> listOfElements = rASSurveyPage.xpathForAllCheckBoxes;
		for (WebElement element : listOfElements) {
			element.click();
		}
	}

	/*
	 * Use this method to click all check boxes in myRassurvey except for the
	 * parameter passed
	 *
	 * @param string the string to no be clicked
	 */
	public void selectingCheckBoxes(String unsureOrUnknown) {

		MiscUtils.sleep(1000);
		List<WebElement> listOfElements = rASSurveyPage.xpathForAllCheckBoxes;
		for (WebElement element : listOfElements) {
			if (!element.getText().contentEquals(unsureOrUnknown)) {
				element.click();
			} else {
				break;
			}
		}
	}

	/*
	 * Use this method to click all check boxes in myRassurvey except for the
	 * parameters passed
	 *
	 * @param string the strings to not be clicked
	 */
	public void selectingCheckBoxes(String unsureOrUnknown, String otherNotKnownIssues) {

		MiscUtils.sleep(1000);
		List<WebElement> listOfElements = rASSurveyPage.xpathForAllCheckBoxes;
		for (WebElement element : listOfElements) {
			if (!element.getText().contentEquals(unsureOrUnknown)
					|| element.getText().contentEquals(otherNotKnownIssues)) {
				element.click();
			} else {
				break;
			}
		}
	}

	/*
	 * Use this method to click all check boxes in myRassurvey except for the
	 * parameters passed
	 *
	 * @param string the strings to not be clicked
	 */
	public void selectingCheckBoxesAnd(String unsureOrUnknown, String otherNotKnownIssues) {

		MiscUtils.sleep(1000);
		List<WebElement> listOfElements = rASSurveyPage.xpathForAllCheckBoxes;
		for (WebElement element : listOfElements) {
			if (!element.getText().contentEquals(unsureOrUnknown)
					&& !element.getText().contentEquals(otherNotKnownIssues)) {
				element.click();
			}
		}
	}
}
