package AnalysisTools.CometsAnalytics.StepsImplementation;

import java.util.Set;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import AnalysisTools.CometsAnalytics.Utils.CometsAnalysis_Constants;
import appsCommon.PageInitializers.PageInitializer;

public class CometsAnalyticsStepImp extends PageInitializer {

	/** METHOD TO GOTO APPLICATION **/
	public void gotoApplication() {
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("CometsAnalystics"));
	}

	/** CLICK ON ANALYSIS BUTTON **/
	public void clickOnAnalysisButton() {
		cometsAnalyticsPage.analysisButton.click();
	}

	/** CHECK INTEGRETY BUTTON **/
	public void verify_user_is_on_analysis_page() {
		CommonUtils.isElementDisplayed(cometsAnalyticsPage.checkIntegretyButton);
	}

	/** DOWNLOAD SAMPLE INPUT **/
	public void downloadSampleInput() {
		cometsAnalyticsPage.downloadSampleInput.click();
	}

	/** SELECCT COMET DROPDOWN **/
	public void selectCometDropdown(String dropDownValue) {
		CommonUtils.selectDropDownValue(cometsAnalyticsPage.cohortDropDown, dropDownValue);
	}

	/** UPLOAD FILE **/
	public void uploadFileCheckIntegrity() {
		CommonUtils.sendKeys(cometsAnalyticsPage.inputFileUpload, CometsAnalysis_Constants.VALID_FILE_PATH);
	}

	/** DOWNLOAD REPORT **/
	public void downloadReport() {
		cometsAnalyticsPage.downloadResults.click();
	}

	/** VERIFY ERROR MESSAGE **/
	public void viewErrorMessage(String expectedErrorMessage) {
		CommonUtils.waitForVisibility(cometsAnalyticsPage.ErrorMessage);
		Assert.assertEquals(cometsAnalyticsPage.ErrorMessage.getText(), expectedErrorMessage);
	}

	/** CLICK ABOUT COMMENT **/
	public void clickOnAboutComment() {
		cometsAnalyticsPage.aboutCometsButton.click();
		Set<String> s = WebDriverUtils.webDriver.getWindowHandles();
		Assert.assertTrue(s.size() > 1);
	}

	/** CHECK HEAT MAP **/
	public void clickOnHeatMap() {
		CommonUtils.waitForClickability(cometsAnalyticsPage.heatMapTab);
		cometsAnalyticsPage.heatMapTab.click();
	}

	/** SORT TESTING VALIDATION **/
	public void sortTestingValidation() {
		cometsAnalyticsPage.pValueRange.click();
	}

	/** VIEW SUCESS MESSAGE **/
	public void viewSucessMessage(String successMessage) {
		CommonUtils.waitForVisibility(cometsAnalyticsPage.SuccessMessage);
		Assert.assertEquals(cometsAnalyticsPage.SuccessMessage.getText(), successMessage);
	}

	/** VIEW RESULTS METHOD **/
	public void viewDownloadButton() {
		CommonUtils.waitForClickability(cometsAnalyticsPage.downloadButton);
		Assert.assertTrue(CommonUtils.isElementDisplayed(cometsAnalyticsPage.downloadButton));
	}

	/** SELECT MODEL DROPDOWN AND ENTER MODEL NAME **/
	public void selectModelDropDownAndEnterModelName() {
		JavascriptUtils.clickByJS(cometsAnalyticsPage.modelDropDown);
	}

	/** CUSTOM MODEL FILL AND RUN **/
	public void customModelFillAndRun() {
		cometsAnalyticsPage.showMetabolites.sendKeys(Keys.TAB);
		cometsAnalyticsPage.exposures.sendKeys("A");
		cometsAnalyticsPage.exposures.sendKeys(Keys.TAB);
		JavascriptUtils.clickByJS(cometsAnalyticsPage.runModelButton);
	}

	/** CLICK ON RESET BUTTON **/
	public void clickOnResetButton() {
		cometsAnalyticsPage.resetButton.click();
	}

	/** VERIFY RESET BUTTON **/
	public void verfyResetCustomCOhort(String expectedValue) {
		CommonUtils.verifyingDropDownValueIsSelected(cometsAnalyticsPage.cohortDropDown, expectedValue,
				"RESET OPERATION FAILED");
	}

	/** CLICK ALL MODELS AND RUN **/
	public void clickAllModelsAndRun(String emailId) {
		CommonUtils.waitForClickability(cometsAnalyticsPage.emailId);
		cometsAnalyticsPage.emailId.sendKeys(emailId);
		cometsAnalyticsPage.runModel.click();
	}

	/** VALIDATE SUCESS MESSAGE **/
	public void validateSuccessMessage() {
		Assert.assertTrue(CommonUtils.isElementDisplayed(cometsAnalyticsPage.emailReport));
	}

	/** UPLOAD INVALID FILE **/
	public void uploadInvalidFileAndCheck() {
		CommonUtils.sendKeys(cometsAnalyticsPage.inputFileUpload, CometsAnalysis_Constants.INVALID_FILE_PATH);
	}

	/** CLICK ON ABOUT BUTTON **/
	public void clickOnAboutButton() {
		cometsAnalyticsPage.aboutButton.click();
	}

	/** VIEW HELLO AND OTHER OPTION **/
	public void viewHeloAndOtherOptionsIsDisplayed() {
		Assert.assertTrue(CommonUtils.isElementDisplayed(cometsAnalyticsPage.accessibilityText));
		Assert.assertTrue(CommonUtils.isElementDisplayed(cometsAnalyticsPage.currentVersionFunctionalityText));
		Assert.assertTrue(CommonUtils.isElementDisplayed(cometsAnalyticsPage.HelpText));
	}

	/** METHOD TO CLICK ON TUTORIALS BUTTON **/
	public void clickOnTutorials() {
		JavascriptUtils.clickByJS(cometsAnalyticsPage.tutorialsButton);
		Set<String> s = WebDriverUtils.webDriver.getWindowHandles();
		Assert.assertTrue(s.size() > 1);
	}

	/** METHOD TO CLICK ON VIGENETTE BUTTON **/
	public void clickOnVigenette() {
		JavascriptUtils.clickByJS(cometsAnalyticsPage.vignettesButton);
		Set<String> s = WebDriverUtils.webDriver.getWindowHandles();
		Assert.assertTrue(s.size() > 1);
	}

	/** METHOD TO CLICK ON CHECK INTEGRITY BUTTON AND WAIT FOR 20 SECONDS **/
	public void clickOnCheckIntegrity() {
		cometsAnalyticsPage.checkIntegrityButton.click();
		CommonUtils.waitForVisibility(cometsAnalyticsPage.message);
	}

	/** METHOD TO CLICK ON PRESPECIFIED MODEL RADIO **/
	public void prespecifiedModelCLick() {
		cometsAnalyticsPage.selectedModel.click();
		cometsAnalyticsPage.showPredefinedModelTypes.click();
	}

	/** METHOD TO CLICK ON CUSTOM MODEL AND USE MODEL TYPE **/
	public void clickCustomModelAndCLickUseModelType() {
		cometsAnalyticsPage.customModelRadio.click();
		cometsAnalyticsPage.showCustomModelTypes.click();
	}

	/** METHOD TO UPLOAD VALID FILE AND CHECK INTEGRITY **/
	public void uploadFileAndCheckIntegrity() {
		uploadFileCheckIntegrity();
		clickOnCheckIntegrity();
	}

	/** METHOD TO UPLOAD INVALID FILE AND CHECK INTEGRITY **/
	public void uploadInvalidFileAndCheckIntegrity() {
		uploadInvalidFileAndCheck();
		clickOnCheckIntegrity();
	}

	/** MODEL AND MODEL TYPE SELECTION **/
	public void modelDropdownselectionAndModelTypeSelection() {
		CommonUtils.selectDropDownValue(cometsAnalyticsPage.selectedModelType, 1);
		CommonUtils.sendKeys(cometsAnalyticsPage.selectedModelType, Keys.TAB);
		CommonUtils.sendKeys(cometsAnalyticsPage.modelDropdown2, "C");
		JavascriptUtils.clickByJS(cometsAnalyticsPage.modelDropDownOption);
		JavascriptUtils.clickByJS(cometsAnalyticsPage.runModelButton);
	}
}
