package AnalysisTools.MCAExplorer.StepsImplementations;

import org.junit.Assert;

import com.nci.automation.web.CommonUtils;

import appsCommon.PageInitializers.PageInitializer;

public class MCAExplorerStepImp extends PageInitializer {

	public void isCircleImageIsAvailable() {
		CommonUtils.waitForVisibility(mcaExplorerPage.summaryCircle);
		Assert.assertTrue(CommonUtils.isElementDisplayed(mcaExplorerPage.summaryCircle));
	}

	public void validateNumberOfRows(int expectedCount) {
		if (!CommonUtils.getText(mcaExplorerPage.showingRows).replace(",", "").contains(String.valueOf(expectedCount))) {
			Assert.assertTrue("Expected " + expectedCount + " in number of rows but found "
					+ CommonUtils.getText(mcaExplorerPage.showingRows), false);
		}
	}

}
