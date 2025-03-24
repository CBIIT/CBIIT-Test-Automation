package ANALYSIS_TOOLS.CometsAnalytics.stepsImplementation;

import java.util.Set;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import ANALYSIS_TOOLS.CometsAnalytics.utils.CometsAnalysis_Constants;
import APPS_COMMON.PageInitializers.PageInitializer;
import static com.nci.automation.web.TestProperties.getCometsAnalyticsUrl;

public class CometsAnalyticsStepImp extends PageInitializer {

    /**
     * METHOD TO GOTO APPLICATION
     */
    public void gotoApplication() {
        WebDriverUtils.webDriver.get(getCometsAnalyticsUrl());
    }

    /**
     * CLICK ON ANALYSIS BUTTON
     */
    public void clickOnAnalysisButton() {
        cometsAnalyticsPage.analysisButton.click();
    }

    /**
     * CHECK INTEGRETY BUTTON
     */
    public void verify_user_is_on_analysis_page() {
        Assert.assertTrue(CommonUtils.isElementDisplayed(cometsAnalyticsPage.checkIntegretyButton));
    }

    /**
     * DOWNLOAD SAMPLE INPUT
     */
    public void downloadSampleInput() {
        cometsAnalyticsPage.downloadSampleInput.click();
    }

    /**
     * SELECT COMET DROPDOWN
     *
     * @param dropDownValue
     */
    public void selectCometDropdown(String dropDownValue) {
        CommonUtils.selectDropDownValue(cometsAnalyticsPage.cohortDropDown, dropDownValue);
    }

    /**
     * UPLOAD FILE
     */
    public void uploadFileCheckIntegrity() {
        CommonUtils.sendKeys(cometsAnalyticsPage.inputFileUpload, CometsAnalysis_Constants.VALID_FILE_PATH);
    }

    /**
     * DOWNLOAD REPORT
     */
    public void downloadReport() {
        cometsAnalyticsPage.downloadResults.click();
    }

    /**
     * VERIFY ERROR MESSAGE
     *
     * @param expectedErrorMessage
     */
    public void viewErrorMessage(String expectedErrorMessage) {
        CommonUtils.waitForVisibility(cometsAnalyticsPage.ErrorMessage);
        Assert.assertEquals(cometsAnalyticsPage.ErrorMessage.getText(), expectedErrorMessage);
    }

    /**
     * CLICK ON ABOUT COMMENT
     */
    public void clickOnAboutComment() {
        CommonUtils.sleep(4000);
        CommonUtils.waitForVisibility(cometsAnalyticsPage.aboutCometsButton);
        String parent = WebDriverUtils.webDriver.getWindowHandle();
        JavascriptUtils.scrollDown(1000);
        CommonUtils.sleep(2000);
        cometsAnalyticsPage.aboutCometsButton.click();
        assertMoreThanOneWindowIsPresent();
        CommonUtils.switchToAnotherTabWindow();
        CommonUtils.sleep(2000);
        webDriver.close();
        webDriver.switchTo().window(parent);
    }

    /**
     * CHECK HEAT MAP
     */
    public void clickOnHeatMap() {
        CommonUtils.waitForClickability(cometsAnalyticsPage.heatMapTab);
        cometsAnalyticsPage.heatMapTab.click();
    }

    /**
     * SORT TESTING VALIDATION
     */
    public void sortTestingValidation() {
        cometsAnalyticsPage.pValueRange.click();
    }

    /**
     * VIEW SUCESS MESSAGE
     *
     * @param successMessage
     */
    public void viewSucessMessage(String successMessage) {
        CommonUtils.sleep(5000);
        CommonUtils.waitForVisibility(cometsAnalyticsPage.SuccessMessage);
        Assert.assertEquals(cometsAnalyticsPage.SuccessMessage.getText(), successMessage);
    }

    /**
     * VIEW RESULTS METHOD
     */
    public void viewDownloadButton() {
        CommonUtils.waitForClickability(cometsAnalyticsPage.downloadButton);
        Assert.assertTrue(CommonUtils.isElementDisplayed(cometsAnalyticsPage.downloadButton));
    }

    /**
     * SELECT MODEL DROPDOWN AND ENTER MODEL NAME
     */
    public void selectModelDropDownAndEnterModelName() {
        JavascriptUtils.clickByJS(cometsAnalyticsPage.modelDropDown);
    }

    /**
     * CUSTOM MODEL FILL AND RUN
     */
    public void customModelFillAndRun() {
        cometsAnalyticsPage.showMetabolites.sendKeys(Keys.TAB);
        cometsAnalyticsPage.exposures.sendKeys("A");
        cometsAnalyticsPage.exposures.sendKeys(Keys.TAB);
        JavascriptUtils.clickByJS(cometsAnalyticsPage.runModelButton);
    }

    /**
     * CLICK ON RESET BUTTON
     */
    public void clickOnResetButton() {
        cometsAnalyticsPage.resetButton.click();
    }

    /**
     * VERIFY RESET BUTTON
     *
     * @param expectedValue
     */
    public void verfyResetCustomCOhort(String expectedValue) {
        CommonUtils.verifyingDropDownValueIsSelected(cometsAnalyticsPage.cohortDropDown, expectedValue, "RESET OPERATION FAILED");
    }

    /**
     * CLICK ALL MODELS AND RUN
     *
     * @param emailId
     */
    public void clickAllModelsAndRun(String emailId) {
        CommonUtils.waitForClickability(cometsAnalyticsPage.emailId);
        cometsAnalyticsPage.emailId.sendKeys(emailId);
        JavascriptUtils.scrollDown(400);
        CommonUtils.sleep(2000);
        cometsAnalyticsPage.runModel.click();
    }

    /**
     * VALIDATE SUCESS MESSAGE
     */
    public void validateSuccessMessage() {
        Assert.assertTrue(CommonUtils.isElementDisplayed(cometsAnalyticsPage.emailReport));
    }

    /**
     * UPLOAD INVALID FILE
     */
    public void uploadInvalidFileAndCheck() {
        CommonUtils.sendKeys(cometsAnalyticsPage.inputFileUpload, CometsAnalysis_Constants.INVALID_FILE_PATH);
    }

    /**
     * CLICK ON ABOUT BUTTON
     */
    public void clickOnAboutButton() {
        cometsAnalyticsPage.aboutButton.click();
    }

    /**
     * VIEW HELLO AND OTHER OPTION
     */
    public void viewHeloAndOtherOptionsIsDisplayed() {
        Assert.assertTrue(CommonUtils.isElementDisplayed(cometsAnalyticsPage.accessibilityText));
        Assert.assertTrue(CommonUtils.isElementDisplayed(cometsAnalyticsPage.currentVersionFunctionalityText));
        Assert.assertTrue(CommonUtils.isElementDisplayed(cometsAnalyticsPage.HelpText));
    }

    /**
     * METHOD TO CLICK ON TUTORIALS AND VERIFYING THE WINDOW IS PRESENT OR NOT
     */
    public void clickOnTutorials() {
        CommonUtils.sleep(2000);
        String parent = WebDriverUtils.webDriver.getWindowHandle();
        JavascriptUtils.clickByJS(cometsAnalyticsPage.tutorialsButton);
        assertMoreThanOneWindowIsPresent();
        CommonUtils.switchToAnotherTabWindow();
        CommonUtils.sleep(2000);
        webDriver.close();
        webDriver.switchTo().window(parent);
    }

    /**
     * METHOD TO CLICK ON VIGENETTE BUTTON
     */
    public void clickOnVigenette() {
        CommonUtils.sleep(2000);
        String parent = WebDriverUtils.webDriver.getWindowHandle();
        JavascriptUtils.clickByJS(cometsAnalyticsPage.vignettesButton);
        assertMoreThanOneWindowIsPresent();
        CommonUtils.switchToAnotherTabWindow();
        CommonUtils.sleep(2000);
        webDriver.close();
        webDriver.switchTo().window(parent);
    }

    /**
     * METHOD TO COUNT NUMBER OF OPEN WINDOWS
     */
    public void assertMoreThanOneWindowIsPresent() {
        Set<String> s = WebDriverUtils.webDriver.getWindowHandles();
        Assert.assertTrue(s.size() > 1);
    }

    /**
     * METHOD TO CLICK ON CHECK INTEGRITY BUTTON AND WAIT FOR 20 SECONDS
     */
    public void clickOnCheckIntegrity() {
        cometsAnalyticsPage.checkIntegrityButton.click();
        CommonUtils.waitForVisibility(cometsAnalyticsPage.message);
    }

    /**
     * METHOD TO CLICK ON PRESPECIFIED MODEL RADIO
     */
    public void prespecifiedModelCLick() {
        cometsAnalyticsPage.selectedModel.click();
        JavascriptUtils.scrollDown(400);
        CommonUtils.sleep(2000);
        cometsAnalyticsPage.showPredefinedModelTypes.click();
    }

    /**
     * METHOD TO CLICK ON CUSTOM MODEL AND USE MODEL TYPE
     */
    public void clickCustomModelAndCLickUseModelType() {
        cometsAnalyticsPage.customModelRadio.click();
        JavascriptUtils.scrollDown(400);
        CommonUtils.sleep(2000);
        cometsAnalyticsPage.showCustomModelTypes.click();
    }

    /**
     * METHOD TO UPLOAD VALID FILE AND CHECK INTEGRITY
     */
    public void uploadFileAndCheckIntegrity() {
        uploadFileCheckIntegrity();
        CommonUtils.sleep(2000);
        clickOnCheckIntegrity();
    }

    /**
     * METHOD TO UPLOAD INVALID FILE AND CHECK INTEGRITY
     */
    public void uploadInvalidFileAndCheckIntegrity() {
        uploadInvalidFileAndCheck();
        clickOnCheckIntegrity();
    }

    /**
     * MODEL AND MODEL TYPE SELECTION
     */
    public void modelDropdownselectionAndModelTypeSelection() {
        CommonUtils.selectDropDownValue(cometsAnalyticsPage.selectedModelType, 1);
        CommonUtils.sendKeys(cometsAnalyticsPage.selectedModelType, Keys.TAB);
        CommonUtils.sendKeys(cometsAnalyticsPage.modelDropdown2, "C");
        JavascriptUtils.clickByJS(cometsAnalyticsPage.modelDropDownOption);
        JavascriptUtils.clickByJS(cometsAnalyticsPage.runModelButton);
    }

    /**
     * CLICK ON RESET BUTTON UNDER METHOD OF ANALYSES
     */
    public void clickOnResetButtonUnderMethodOfAnalyses() {
        JavascriptUtils.scrollDown(400);
        CommonUtils.sleep(2000);
        cometsAnalyticsPage.resetButtonUnderMethodOfAnalyses.click();
    }

    /**
     * CLICK ON CROSS ICON
     */
    public void clickOnCrossIcon() {
        cometsAnalyticsPage.crossButton.click();
    }

    /**
     * VALIDATE SUCCESS MESSAGE UNAVAILABILITY
     *
     * @param successMessage
     */
    public void validateSuccessMessageAvailability(String successMessage) {
        Assert.assertTrue(cometsAnalyticsPage.SuccessMessageElement.isEmpty(), successMessage);
    }

    /**
     * CHANGING RESULT VISIBILITY
     */
    public void changeResultVisibility() {
        JavascriptUtils.scrollDown(400);
        CommonUtils.selectDropDownValue(cometsAnalyticsPage.selectPageSize, "25");
        CommonUtils.sleep(2000);
        CommonUtils.selectDropDownValue(cometsAnalyticsPage.selectPageSize, "10");
    }

    /**
     * CLICK DOWNLOAD BUTTON
     */
    public void clickDownloadButton() {
        JavascriptUtils.scrollUp(600);
        cometsAnalyticsPage.downloadButtonModelResult.click();
    }

    /**
     * CLICK LAST BUTTON
     */
    public void clickLastButton() {
        JavascriptUtils.scrollDown(1200);
        cometsAnalyticsPage.lastButton.click();
    }
}