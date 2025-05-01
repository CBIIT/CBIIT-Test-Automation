package ANALYSIS_TOOLS.mSigPortal.playwright.stepsImplementations;

import com.microsoft.playwright.Locator;
import com.nci.automation.web.PlaywrightUtils;
import static Hooks.Hooks.softAssert;

public class mSigPortalVisualizationStepsImpl {

    /**
     * CLICKING RESET BUTTON
     */
    public static void clickResetButton() {
        PlaywrightUtils.page.locator("//i[contains(@class,'fa fa-lg')]").click();
        PlaywrightUtils.page.locator("//div[@class='col-lg-3 col-md-5']//div[4]//div[1]//button[1]").click();
    }

    /**
     * CALCULATING WITH MINIMAL PROPORTIONS
     */
    public static void calculatesWithMinimalProportions(String string) {
        PlaywrightUtils.page.locator("//input[@id='minimum']").clear();
        PlaywrightUtils.page.locator("//input[@id='minimum']").fill(string);
        PlaywrightUtils.page.locator("//div[@class='bg-white border rounded p-0 container-fluid']//div//button[@type='submit'][normalize-space()='Calculate']").click();
    }

    /**
     * VALIDATING ERROR MESSAGE
     */
    public static void validateErrorMessage(String string) {
        String str = PlaywrightUtils.page.locator("//div[normalize-space()='Enter a value between 0 and 1']").innerText();
        System.out.println(str);
        softAssert.assertEquals(string, str);
    }

    /**
     * VALIDATING WHETHER BAR GRAPH IS DISPLAYED OR NOT
     */
    public static void validateBarGraph() {
        Locator barChart = PlaywrightUtils.page.locator("//div[@id='barchart']");
        softAssert.assertTrue(barChart.count()>0);
    }

    /**
     * CLICKING ON THE DOWNLOAD PLOTLY DATA
     */
    public static void clickDownloadPlotlyData() {
        PlaywrightUtils.page.locator("//div[@id='barchart']//button[contains(@type,'button')][normalize-space()='Download Plotly Data >']").click();
    }

    /**
     * VERIFYING THE VALUES IN THE DROPDOWN IN THE VISUALIZATION TAB
     */
    public static void verifySelectedValueInVisualization(String string, String string2) {
        String profileTypeValue = PlaywrightUtils.page.locator("//div[contains(@class,'bg-white border rounded p-0 container-fluid')]//div//label[contains(@for,'profile')][normalize-space()='Profile Type']/..//div//div[contains(text(),'SBS')]").innerText();
        softAssert.assertEquals(profileTypeValue, string);
        String matrixSize = PlaywrightUtils.page.locator("//div[contains(@class,'bg-white border rounded p-0 container-fluid')]//div//label[contains(@for,'matrix')][normalize-space()='Matrix Size']/..//div//div[contains(text(),'96')]").innerText();
        softAssert.assertEquals(matrixSize, string2);
    }

    /**
     * VERIFYING THE PLOT IS AVAILABLE
     */
    public static void verifyPlot() {
        Locator catalogueNavItem = PlaywrightUtils.page.locator("//div[@id='mutationalProfilePlot']//div");
        boolean isActive = catalogueNavItem.first().getAttribute("class").contains("plot-container plotly");
        softAssert.assertTrue(isActive);
    }
}