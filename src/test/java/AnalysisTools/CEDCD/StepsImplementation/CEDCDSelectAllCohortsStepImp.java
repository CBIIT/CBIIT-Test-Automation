package AnalysisTools.CEDCD.StepsImplementation;

import org.junit.Assert;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.JavascriptUtils;
import appsCommon.PageInitializer;

public class CEDCDSelectAllCohortsStepImp extends PageInitializer {

	/** This method clicks on the search results button */
	public void clickOnResultButton() {
		JavascriptUtils.clickByJS(cedcdSearchCohortsPage.searchCohortResultBtn);
	}

	/** This element clicks on the check box that selects all cohorts and logs a screenshot */
	public void clickOnSelectAllCheckbox() {
		JavascriptUtils.clickByJS(cedcdSearchCohortsPage.selectAllCheckBox);
		CucumberLogUtils.logScreenShot();

	}

	/** This element returns the number of cohorts, highlights the number in red and logs screenshot */
	public void verifyNumberOfCohortsReturned() {
	Assert.assertTrue(cedcdSearchCohortsPage.numberOfSearchResultReturned.getText().contains("61"));
		JavascriptUtils.drawRedBorder(cedcdSearchCohortsPage.numberOfSearchResultReturned);
		CucumberLogUtils.logScreenShot();

	}

}
