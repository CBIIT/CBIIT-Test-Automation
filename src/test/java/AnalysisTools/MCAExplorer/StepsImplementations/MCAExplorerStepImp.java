package AnalysisTools.MCAExplorer.StepsImplementations;

import org.testng.Assert;
import java.time.Duration;
import org.openqa.selenium.Keys;
import com.nci.automation.services.RestApiHelper;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import appsCommon.PageInitializers.PageInitializer;
import io.restassured.response.Response;

public class MCAExplorerStepImp extends PageInitializer {

	/**
	 *  VALIDATE IF CIRCLE IS AVAILABLE
	 */
	public void isCircleImageIsAvailable() {
		CommonUtils.waitForThePresenceOfEl(mcaExplorerPage.summaryCircleXpath, Duration.ofSeconds(40));
		MiscUtils.sleep(4000);
		Assert.assertTrue(CommonUtils.isElementDisplayed(mcaExplorerPage.summaryCircle));
	}

	/**
	 * VALIDATE IF TWO CIRCLES ARE AVAILABLE
	 */
	public void isTwoCircleImageIsAvailable() {
		CommonUtils.waitForThePresenceOfEl(mcaExplorerPage.compareCircleXpath, Duration.ofSeconds(40));
		Assert.assertTrue(CommonUtils.isElementDisplayed(mcaExplorerPage.compareCircle));
	}

	/**
	 * VALIDATE SOME ROWS ARE DISPLAYED
	 */
	public void validateNumberOfRows() {
		if (!(CommonUtils.getText(mcaExplorerPage.showingRows).length() > 0)) {
			Assert.assertTrue(false, "Expected atleast " + 1 + " in number of rows but found "
					+ CommonUtils.getText(mcaExplorerPage.showingRows));
		}
	}

	/**
	 * CLEAR ALL VALUES FROM STUDY
	 */
	public void clearAllValuesFromStudy() {
		mcaExplorerPage.studyClearButton.click();
	}

	/**
	 * SELECT CHROMOSOME
	 *
	 * @param chromosome The value of chromosome
	 */
	public void selectChromosome(String chromosome) {
		if (chromosome.equals("X"))
			mcaExplorerPage.chromosomeXCheckbox.click();
		if (chromosome.equals("Y"))
			mcaExplorerPage.chromosomeYCheckbox.click();
	}

	/**
	 * SELECT TWO CHROMOSOME
	 *
	 * @param firstChromosome The Value of firstChromosome
	 * @param secondChromosome The Value of secondChromosome
	 */
	public void selectTwoChromosome(String firstChromosome, String secondChromosome) {
		selectChromosome(firstChromosome);
		selectChromosome(secondChromosome);
	}

	/**
	 * VERIFY CHROMOSOME DISPLAYED
	 *
	 * @param chromosome The Value of chromosome
	 */
	public void verifyChromosomeDisplayedInGraph(String chromosome) {
		if (chromosome.equals("X"))
			Assert.assertTrue(mcaExplorerPage.chromosomeXCheckbox.isDisplayed());
		if (chromosome.equals("Y"))
			Assert.assertTrue(mcaExplorerPage.chromosomeYCheckbox.isDisplayed());
	}

	/**
	 * VERIFY END RANGE
	 *
	 * @param value
	 */
	public void verifyEndRange(String value) {
		String actualValue = mcaExplorerPage.endRange.getAttribute("value");
		Assert.assertEquals(actualValue, value);
	}

	/**
	 * VERIFY NO OF ROWS
	 *
	 * @param rows
	 */
	public void verifyNoOfRows(String rows) {
		validateNumberOfRows();
	}

	/**
	 * SELECT THE PAGINATION DROPDOWN
	 *
	 * @param value
	 */
	public void selectThePaginationDropDownValue(String value) {
		CommonUtils.selectDropDownValue(mcaExplorerPage.pageSize, value);
	}

	/**
	 * SELECT STUDY COPY NUMBER STATE AND RANGE IN GROUP A AND GROUP B
	 *
	 * @param start
	 * @param end
	 */
	public void user_selects_study_copy_number_state_and_age_range_in_both_group_a_and_group_b(String start,
			String end) {
		CommonUtils.clickOnElement(mcaExplorerPage.groupA_Study_dropdown);
		MiscUtils.sleep(1000);
		
		CommonUtils.clickOnElement(mcaExplorerPage.groupA_Study_dropdown_biobank);
		CommonUtils.clickOnElement(mcaExplorerPage.groupA_copynumber_dropdown);
		CommonUtils.clickOnElement(mcaExplorerPage.groupA_copynum_dropdown_loss);
		MiscUtils.sleep(2000);
		
		mcaExplorerPage.groupA_age_Start.sendKeys(start);
		mcaExplorerPage.groupA_age_End.sendKeys(end);
		CommonUtils.clickOnElement(mcaExplorerPage.groupB_Study_dropdown);
		CommonUtils.clickOnElement(mcaExplorerPage.groupA_Study_dropdown_biobank);
		CommonUtils.clickOnElement(mcaExplorerPage.groupB_copynumber_dropdown);
		CommonUtils.clickOnElement(mcaExplorerPage.groupB_copynum_dropdown_loss);
		mcaExplorerPage.groupB_age_Start.sendKeys(start);
		mcaExplorerPage.groupB_age_End.sendKeys(end);
	}

	/**
	 * ZOOM FEATURE TEST
	 */
	public void zoom_feature() {
		CommonUtils.clickOnElement(mcaExplorerPage.pointOnImage);
		CommonUtils.clickOnElement(mcaExplorerPage.zoomButton);
		CommonUtils.clickOnElement(mcaExplorerPage.zoomButton);
		CommonUtils.clickOnElement(mcaExplorerPage.zoomButton);
	}

	/**
	 * SELECT PLOT TYPE
	 */
	public void select_plot_type() {
		CommonUtils.clickOnElement(mcaExplorerPage.plotDropDown);
		CommonUtils.clickOnElement(mcaExplorerPage.plotDropdown_chromosomelevel);
	}

	/**
	 * SELECT CHROMOSOME
	 *
	 * @param number
	 */
	public void select_chtomosome(Integer number) {
		CommonUtils.sendKeys(mcaExplorerPage.chromosomeDropdown, String.valueOf(number));
		CommonUtils.sendKeys(mcaExplorerPage.chromosomeDropdown, Keys.TAB);
	}

	/**
	 * ENTER GROUP A AGE
	 *
	 * @param max
	 * @param min
	 */
	public void enter_groupA_age(String min, String max) {
		CommonUtils.sendKeys(mcaExplorerPage.groupA_min_age, min);
		CommonUtils.sendKeys(mcaExplorerPage.groupA_max_age, max);
	}

	/**
	 * ENTER GROUP B AGE
	 *
	 * @param min
	 * @param max
	 */
	public void enter_groupb_age(String min, String max) {
		CommonUtils.sendKeys(mcaExplorerPage.groupB_min_age, min);
		CommonUtils.sendKeys(mcaExplorerPage.groupB_max_age, max);
	}

	/**
	 * SELECT PLOT TYPE
	 */
	public void selet_in_plot_type() {
		CommonUtils.clickOnElement(mcaExplorerPage.plotDropDown);
		CommonUtils.clickOnElement(mcaExplorerPage.plotDropdown_allchromosome);
	}

	/**
	 * TEST HELPER CLASS OBJECT
	 */
	RestApiHelper rest;

	/**
	 * SETTING REST HELP CLASS BASE URL
	 *
	 * @param url
	 */
	public void setApiBaseUrl(String url) {
		rest = new RestApiHelper(url);
	}

	/**
	 * VERIFY THE RESPONSE IS 200
	 *
	 * @param body
	 */
	public void sendPostReqestWithBody(String body) {
		Response response = rest.postRequestWIthBody(body);
		System.out.print(response.getStatusCode());
		System.out.print(rest.getResponseBody());
		Assert.assertTrue(response.getStatusCode() == (200));
	}

	/**
	 * VERIFY CHART HEADER IS AS EXPECTED
	 *
	 * @param currentValue
	 * @param expectedValue
	 */
	public void verifyChartheader(String currentValue, String expectedValue) {
		System.out.println(currentValue.toLowerCase());
		System.out.println(expectedValue.toLowerCase());
		CommonUtils.assertTrue(currentValue.toLowerCase().contains(expectedValue.toLowerCase()));
	}

	/**
	 * CLICK ON ADVANCED FILTER
	 */
	public void clickOnAdvaceFilter() {
		JavascriptUtils.clickByJS(mcaExplorerPage.advanceSettings);
	}

	/**
	 * CLICK ON EXPORT DATA BUTTON
	 */
	public void clickOnExportData() {
		JavascriptUtils.clickByJS(mcaExplorerPage.export_data_btn);
	}

	/**
	 * CLICK ON SUBMIT BUTTON
	 */
	public void clickOnSubmitButton() {
		JavascriptUtils.clickByJS(mcaExplorerPage.submitButton);
	}

	/**
	 * VERIFY IF ALERT IS PRESENT
	 */
	public void verifyIfAlertIsPresent() {
		Assert.assertTrue(!CommonUtils.getAlertText().isEmpty());
		CommonUtils.dismissAlert();
	}
}
