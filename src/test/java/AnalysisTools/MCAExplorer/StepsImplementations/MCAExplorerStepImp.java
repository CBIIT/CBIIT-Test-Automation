package AnalysisTools.MCAExplorer.StepsImplementations;

import org.testng.Assert;

import java.time.Duration;

import org.openqa.selenium.Keys;
import com.nci.automation.services.RestApiHelper;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import appsCommon.PageInitializers.PageInitializer;
import io.restassured.response.Response;

public class MCAExplorerStepImp extends PageInitializer {

	/** validate if circle is available **/
	public void isCircleImageIsAvailable() {
		CommonUtils.waitForThePresenceOfEl(mcaExplorerPage.summaryCircleXpath, Duration.ofSeconds(40));
		Assert.assertTrue(CommonUtils.isElementDisplayed(mcaExplorerPage.summaryCircle));
	}

	/** validate if two circles are available **/
	public void isTwoCircleImageIsAvailable() {
		CommonUtils.waitForThePresenceOfEl(mcaExplorerPage.compareCircleXpath, Duration.ofSeconds(40));
	}

	/** Validate some rows are displayed **/
	public void validateNumberOfRows() {
		if (!(CommonUtils.getText(mcaExplorerPage.showingRows).length() > 0)) {
			org.testng.Assert.assertTrue(false, "Expected atleast " + 1 + " in number of rows but found "
					+ CommonUtils.getText(mcaExplorerPage.showingRows));
		}
	}

	/** Clear all values from Study **/
	public void clearAllValuesFromStudy() {
		mcaExplorerPage.studyClearButton.click();
	}

	/** select chromosome */
	public void selectChromosome(String chromosome) {
		if (chromosome.equals("X"))
			mcaExplorerPage.chromosomeXCheckbox.click();
		if (chromosome.equals("Y"))
			mcaExplorerPage.chromosomeYCheckbox.click();
	}

	/** select two chromosome **/
	public void selectTwoChromosome(String firstChromosome, String secondChromosome) {
		selectChromosome(firstChromosome);
		selectChromosome(secondChromosome);
	}

	/** verify chromosome displayed **/
	public void verifyChromosomeDisplayedInGraph(String chromosome) {
		if (chromosome.equals("X"))
			Assert.assertTrue(mcaExplorerPage.chromosomeXCheckbox.isDisplayed());
		if (chromosome.equals("Y"))
			Assert.assertTrue(mcaExplorerPage.chromosomeYCheckbox.isDisplayed());
	}

	/** verify end range **/
	public void verifyEndRange(String value) {
		String actualValue = mcaExplorerPage.endRange.getAttribute("value");
		Assert.assertEquals(actualValue, value);
	}

	/** verify No of rows **/
	public void verifyNoOfRows(String rows) {
		int noOfRows = mcaExplorerPage.gridAllRows.size();
		Assert.assertTrue(noOfRows>0);
	}

	/** select the pagination dropdown **/
	public void selectThePaginationDropDownValue(String value) {
		CommonUtils.selectDropDownValue(mcaExplorerPage.pageSize, value);
	}

	/** select study copy number state and range in group a and group b */
	public void user_selects_study_copy_number_state_and_age_range_in_both_group_a_and_group_b(String start,
			String end) {
		CommonUtils.clickOnElement(mcaExplorerPage.groupA_Study_dropdown);
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
		}
		CommonUtils.clickOnElement(mcaExplorerPage.groupA_Study_dropdown_biobank);
		CommonUtils.clickOnElement(mcaExplorerPage.groupA_copynumber_dropdown);
		CommonUtils.clickOnElement(mcaExplorerPage.groupA_copynum_dropdown_loss);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		mcaExplorerPage.groupA_age_Start.sendKeys(start);
		mcaExplorerPage.groupA_age_End.sendKeys(end);
		CommonUtils.clickOnElement(mcaExplorerPage.groupB_Study_dropdown);
		CommonUtils.clickOnElement(mcaExplorerPage.groupA_Study_dropdown_biobank);
		CommonUtils.clickOnElement(mcaExplorerPage.groupB_copynumber_dropdown);
		CommonUtils.clickOnElement(mcaExplorerPage.groupB_copynum_dropdown_loss);
		mcaExplorerPage.groupB_age_Start.sendKeys(start);
		mcaExplorerPage.groupB_age_End.sendKeys(end);
	}

	/** zoom feature test */
	public void zoom_feature() {
		CommonUtils.clickOnElement(mcaExplorerPage.pointOnImage);
		CommonUtils.clickOnElement(mcaExplorerPage.zoomButton);
		CommonUtils.clickOnElement(mcaExplorerPage.zoomButton);
		CommonUtils.clickOnElement(mcaExplorerPage.zoomButton);
	}

	/** select Plot type */
	public void select_plot_type() {
		CommonUtils.clickOnElement(mcaExplorerPage.plotDropDown);
		CommonUtils.clickOnElement(mcaExplorerPage.plotDropdown_chromosomelevel);
	}

	/** select chromosome **/
	public void select_chtomosome(Integer int1) {
		CommonUtils.sendKeys(mcaExplorerPage.chromosomeDropdown, String.valueOf(int1));
		CommonUtils.sendKeys(mcaExplorerPage.chromosomeDropdown, Keys.TAB);
	}

	/** Enter Group A age **/
	public void enter_groupA_age(String min, String max) {
		CommonUtils.sendKeys(mcaExplorerPage.groupA_min_age, min);
		CommonUtils.sendKeys(mcaExplorerPage.groupA_max_age, max);
	}

	/** Enter Group B Age */
	public void enter_groupb_age(String min, String max) {
		CommonUtils.sendKeys(mcaExplorerPage.groupB_min_age, min);
		CommonUtils.sendKeys(mcaExplorerPage.groupB_max_age, max);
	}

	/** select Plot type */
	public void selet_in_plot_type() {
		CommonUtils.clickOnElement(mcaExplorerPage.plotDropDown);
		CommonUtils.clickOnElement(mcaExplorerPage.plotDropdown_allchromosome);
	}

	/** Test helper class object **/
	RestApiHelper rest;

	/** setting rest help class base url **/
	public void setApiBaseUrl(String url) {
		rest = new RestApiHelper(url);
	}

	/** verify the response is 200 **/
	public void sendPostReqestWithBody(String body) {
		Response response = rest.postRequestWIthBody(body);
		System.out.print(response.getStatusCode());
		System.out.print(rest.getResponseBody());
		Assert.assertTrue(response.getStatusCode() == (200));
	}

	/** Verify Chart header is as expected */
	public void verifyChartheader(String currentValue, String expectedValue) {
		CommonUtils.assertEquals(currentValue, expectedValue);
	}

	/** Click on advanced filter */
	public void clickOnAdvaceFilter() {
		JavascriptUtils.clickByJS(mcaExplorerPage.advanceSettings);
	}

	/** Click on Export Data button */
	public void clickOnExportData() {
		JavascriptUtils.clickByJS(mcaExplorerPage.export_data_btn);
	}

	/** Click on Submit button */
	public void clickOnSubmitButton() {
		JavascriptUtils.clickByJS(mcaExplorerPage.submitButton);
	}
}
