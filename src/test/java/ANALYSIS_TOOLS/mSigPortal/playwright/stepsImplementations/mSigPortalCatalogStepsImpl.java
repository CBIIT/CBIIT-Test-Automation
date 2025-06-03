package ANALYSIS_TOOLS.mSigPortal.playwright.stepsImplementations;

import com.microsoft.playwright.Locator;
import com.nci.automation.web.PlaywrightUtils;
import static Hooks.Hooks.softAssert;

public class mSigPortalCatalogStepsImpl {

    /**
     * CLICKING AND THEN SELECTING PROPOSED ETIOLOGY
     */
    public static void clickAndSelectEtiology() {
        PlaywrightUtils.page.locator("//button[normalize-space()='Aromatic Amines']").click();
        PlaywrightUtils.page.locator("//div[@class='mb-3 col-md-2 col-sm-4']//div[@title='Aromatic Amines - 4-Aminobiphenyl 300 µM + rat S9 (SBS)']").click();
    }

    /**
     * CLICKING ON THE PROFILE TAB AND THEN CALCULATED TO VISUALIZE MUTATIONAL PROFILE
     */
    public static void clickProfileAndCalculates() {
        PlaywrightUtils.page.locator("//strong[normalize-space()='RS Profile']").click();
        PlaywrightUtils.page.locator("//button[@type='button'][normalize-space()='Calculate']").click();
    }

    /**
     * VALIDATING THE MUTATIONAL PROFILE PLOT
     */
    public static void validateMutationalProfilePlot() {
        Locator barChart = PlaywrightUtils.page.locator("//div[@id='mutationalProfilePlot']");
        softAssert.assertTrue(barChart.count()>0);
    }

    /**
     * CLICKING ON NEW PLOT BUTTON AND THEN CALCULATES ON SELECTED RESOURCE
     */
    public static void addNewPlotAndCalculates() throws InterruptedException {
        PlaywrightUtils.page.locator("//span[@title='Add Plot']").click();
        PlaywrightUtils.page.locator("//div//label[contains(text(),'Signature Source') and @for='plotForms[1].source']//parent::div//div").first().click();
        Thread.sleep(2000);
        PlaywrightUtils.page.locator("//div//label[contains(text(),'Signature Source') and @for='plotForms[1].source']//parent::div//div").first().press("Enter");
        Thread.sleep(2000);
        PlaywrightUtils.page.locator("//div[contains(text(),'Enter any [Signature Source], [Profile Name], [Ref')]//div[2]//form[1]//div[1]//div[7]//button[1]").click();
    }

    /**
     * CLICKING ON NEW PLOT BUTTON AND THEN CALCULATES ON SELECTED RESOURCE
     */
    public static void verifyNewPlotAndDownloadData() throws InterruptedException {
        PlaywrightUtils.page.locator("//div[@role='tabpanel']//div[2]//div[1]//div[2]//div[2]//div[1]//button[1]").isVisible();
        Thread.sleep(2000);
        PlaywrightUtils.page.locator("//div[@role='tabpanel']//div[2]//div[1]//div[2]//div[2]//div[1]//button[1]").click();
    }
}