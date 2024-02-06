package AnalysisTools.MCAExplorer.StepsImplementations;

import org.junit.Assert;

import com.nci.automation.web.CommonUtils;

import appsCommon.PageInitializers.PageInitializer;

public class MCAExplorerStepImp extends PageInitializer {

	public void isCircleImageIsAvailable() {
		CommonUtils.waitForVisibility(mcaExplorerPage.summaryCircle);
		Assert.assertTrue(CommonUtils.isElementDisplayed(mcaExplorerPage.summaryCircle));
	}
	
	public void isTwoCircleImageIsAvailable() {
		CommonUtils.waitForVisibility(mcaExplorerPage.compareCircle);
		Assert.assertTrue(CommonUtils.isElementDisplayed(mcaExplorerPage.compareCircle));
	}
	

	public void validateNumberOfRows(int expectedCount) {
		if (!CommonUtils.getText(mcaExplorerPage.showingRows).replace(",", "").contains(String.valueOf(expectedCount))) {
			Assert.assertTrue("Expected " + expectedCount + " in number of rows but found "
					+ CommonUtils.getText(mcaExplorerPage.showingRows), false);
		}
	}

	public void clearAllValuesFromStudy() {
		mcaExplorerPage.studyClearButton.click();
	}

	public void selectChromosome(String chromosome) {
		if(chromosome.equals("X"))
			mcaExplorerPage.chromosomeXCheckbox.click();
		if(chromosome.equals("Y"))
			mcaExplorerPage.chromosomeYCheckbox.click();
	}

	public void verifyChromosomeDisplayedInGraph(String chromosome) {
		if(chromosome.equals("X"))
			Assert.assertTrue(mcaExplorerPage.chromosomeXCheckbox.isDisplayed());
		if(chromosome.equals("Y"))
			Assert.assertTrue(mcaExplorerPage.chromosomeYCheckbox.isDisplayed());
	}

	public void verifyEndRange(String value) {
		String actualValue = mcaExplorerPage.endRange.getAttribute("value");
		Assert.assertEquals(actualValue, value);
	}

	public void verifyNoOfRows(String rows) {
		int noOfRows = mcaExplorerPage.gridAllRows.size();
		Assert.assertEquals(Integer.parseInt(rows), noOfRows);
	}

	public void selectThePaginationDropDownValue(String value) {
		CommonUtils.selectDropDownValue(mcaExplorerPage.pageSize, value);	
	}

}
