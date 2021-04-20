package AnalysisTools.CEDCD.StepsImplementation;

import java.util.ArrayList;
import org.junit.Assert;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.JavascriptUtils;
import appsCommon.PageInitializer;

public class CEDCDSelectAllCohortsStepImp extends PageInitializer {

	/** This method clicks on the search results button */
	public void clickOnResultButton() {
		JavascriptUtils.clickByJS(cedcdSearchCohortsPage.searchCohortResultBtn);
	}

	/** This method clicks on the check box that selects all cohorts and the view selected cohort data button */
	public void clickOnSelectAllCheckbox() {
		JavascriptUtils.clickByJS(cedcdSearchCohortsPage.searchCohortSelectAllCheckbox);
		JavascriptUtils.scrollIntoView(cedcdSearchCohortsPage.bCFRCohort);
		CucumberLogUtils.logScreenShot();
		cedcdSearchCohortsPage.viewSelectedCohortDataButton.click();
	}

	/** This method returns the number of cohorts, highlights the number in red and logs screenshot */
	public void verifyNumberOfCohortsReturned() {
//		Assert.assertTrue(cedcdSearchCohortsPage.numberOfSearchResultReturned.getText().contains("61"));
//		JavascriptUtils.drawRedBorder(cedcdSearchCohortsPage.numberOfSearchResultReturned);
		ArrayList<String> results = new ArrayList<String>();
		for(int i=1; i<68;i++) {
			results.add(cedcdSearchCohortsPage.numberofCohortsReturned.get(i).getText());
		}
			System.out.println(results.size());
			int result = results.size();
			String textResults = Integer.toString(result);
			cedcdSearchCohortsPage.backToFilterButton.click();
			
			cedcdSearchCohortsPage.numberOfSearchResultReturned.getText().contains(textResults);
			Assert.assertEquals(cedcdSearchCohortsPage.numberOfSearchResultReturned.getText().contains(textResults), true);
			}

}
