package AnalysisTools.MCAExplorer.StepsImplementations;

import org.junit.Assert;
import org.openqa.selenium.Keys;

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
		if (!CommonUtils.getText(mcaExplorerPage.showingRows).replace(",", "")
				.contains(String.valueOf(expectedCount))) {
			Assert.assertTrue("Expected " + expectedCount + " in number of rows but found "
					+ CommonUtils.getText(mcaExplorerPage.showingRows), false);
		}
	}

	public void clearAllValuesFromStudy() {
		mcaExplorerPage.studyClearButton.click();
	}

	public void selectChromosome(String chromosome) {
		if (chromosome.equals("X"))
			mcaExplorerPage.chromosomeXCheckbox.click();
		if (chromosome.equals("Y"))
			mcaExplorerPage.chromosomeYCheckbox.click();
	}

	public void verifyChromosomeDisplayedInGraph(String chromosome) {
		if (chromosome.equals("X"))
			Assert.assertTrue(mcaExplorerPage.chromosomeXCheckbox.isDisplayed());
		if (chromosome.equals("Y"))
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

	public void user_selects_study_copy_number_state_and_age_range_in_both_group_a_and_group_b(String start,
			String end) {
		CommonUtils.clickOnElement(mcaExplorerPage.groupA_Study_dropdown);
		CommonUtils.clickOnElement(mcaExplorerPage.groupA_Study_dropdown_biobank);
		CommonUtils.clickOnElement(mcaExplorerPage.groupA_copynumber_dropdown);
		CommonUtils.clickOnElement(mcaExplorerPage.groupA_copynum_dropdown_loss);
		mcaExplorerPage.groupA_age_Start.sendKeys(start);
		mcaExplorerPage.groupA_age_End.sendKeys(end);
		CommonUtils.clickOnElement(mcaExplorerPage.groupB_Study_dropdown);
		CommonUtils.clickOnElement(mcaExplorerPage.groupB_Study_dropdown_biobank);
		CommonUtils.clickOnElement(mcaExplorerPage.groupB_copynumber_dropdown);
		CommonUtils.clickOnElement(mcaExplorerPage.groupB_copynum_dropdown_loss);
		mcaExplorerPage.groupB_age_Start.sendKeys(start);
		mcaExplorerPage.groupB_age_End.sendKeys(end);
	}

	public void zoom_feature() {
		CommonUtils.clickOnElement(mcaExplorerPage.pointOnImage);
		CommonUtils.clickOnElement(mcaExplorerPage.zoomButton);
		CommonUtils.clickOnElement(mcaExplorerPage.zoomButton);
		CommonUtils.clickOnElement(mcaExplorerPage.zoomButton);
	}

	public void select_plot_type() {
		CommonUtils.clickOnElement(mcaExplorerPage.plotDropDown);
		CommonUtils.clickOnElement(mcaExplorerPage.plotDropdown_chromosomelevel);
	}

	public void select_chtomosome(Integer int1) {
		CommonUtils.sendKeys(mcaExplorerPage.chromosomeDropdown, String.valueOf(int1));
		CommonUtils.sendKeys(mcaExplorerPage.chromosomeDropdown, Keys.TAB);
	}

	public void enter_groupA_age(String min, String max) {
		CommonUtils.sendKeys(mcaExplorerPage.groupA_min_age, min);
		CommonUtils.sendKeys(mcaExplorerPage.groupA_max_age, max);
	}

	public void enter_groupb_age(String min, String max) {
		CommonUtils.sendKeys(mcaExplorerPage.groupB_min_age, min);
		CommonUtils.sendKeys(mcaExplorerPage.groupB_max_age, max);
	}
	
	public void selet_in_plot_type() {
		CommonUtils.clickOnElement(mcaExplorerPage.plotDropDown);
		CommonUtils.clickOnElement(mcaExplorerPage.plotDropdown_allchromosome);
	}
}
