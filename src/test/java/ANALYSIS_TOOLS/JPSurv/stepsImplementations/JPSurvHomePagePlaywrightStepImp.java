package ANALYSIS_TOOLS.JPSurv.stepsImplementations;

import ANALYSIS_TOOLS.JPSurv.pages.JPSurvHomePagePlaywright;
import APPS_COMMON.PageInitializers.PageInitializer;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.PlaywrightUtils;
import org.testng.Assert;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.regex.Pattern;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class JPSurvHomePagePlaywrightStepImp extends PageInitializer {

    /**
     * UPLOAD FILES
     */
    public static void uploadFile(){
        String UPLOAD_FILE_PATH = "src/test/resources/Tutorial_JPSURV.dic";
        String UPLOAD_FILE_PATH1 = "src/test/resources/Tutorial_JPSURV.txt";
        Path path1 = Paths.get(UPLOAD_FILE_PATH);
        Path path2 = Paths.get(UPLOAD_FILE_PATH1);
        PlaywrightUtils.page.setInputFiles(JPSurvHomePagePlaywright.inputFileLocator, new Path[]{path1, path2});
        CommonUtils.sleep(2000);
    }

    /**
     * SELECTS THE START AND END INTERVAL
     */
    public static void selectStartAndEndInterval() {
        PlaywrightUtils.page.locator("//select[@name='conditionalIntervals[0].start']").selectOption("2");
        CommonUtils.sleep(2000);
        PlaywrightUtils.page.locator("//select[@name='conditionalIntervals[0].end']").selectOption("4");
    }

    /**
     * SELECTS THE ANOTHER NEW START AND END INTERVAL
     */
    public static void selectNewStartAndEndInterval() {
        PlaywrightUtils.page.locator("//select[@name='conditionalIntervals[1].start']").selectOption("2");
        CommonUtils.sleep(2000);
        PlaywrightUtils.page.locator("//select[@name='conditionalIntervals[1].end']").selectOption("5");
    }

    /**
     * UPLOAD CSV FILE
     */
    public static void uploadCSVFile() {
        String UPLOAD_CSV_FILE_PATH = "./src/test/resources/Breast_RelativeSurvival_Head_NA0.csv";
        Path pathNew = Paths.get(UPLOAD_CSV_FILE_PATH);
        PlaywrightUtils.page.setInputFiles(JPSurvHomePagePlaywright.inputFileLocator, pathNew);
        CommonUtils.sleep(4000);
    }

    /**
     * CLICK ON THE EVERY PRESENTATION ON THE ANALYSIS PAGE
     */
    public static void clickEveryPresentation(){
        String[] buttonTexts = {
                "Death vs. Year at Diagnosis",
                "Survival vs. Time Since Diagnosis",
                "Model Estimates"
        };

        for (String text : buttonTexts) {
            PlaywrightUtils.page.locator("//ul//li//button[contains(text(),'" + text + "')]").click();
        }
    }

    /**
     * UPLOAD ZIP FILE
     */
    public static void uploadZIPFile() {
        String UPLOAD_ZIP_FILE_PATH = "./src/test/resources/jpsurv-6bce02ba-b041-49df-b453-3cf35d15c6ce.zip";
        Path pathNew = Paths.get(UPLOAD_ZIP_FILE_PATH);
        PlaywrightUtils.page.setInputFiles(JPSurvHomePagePlaywright.inputFileLocator, pathNew);
        CommonUtils.sleep(4000);
    }

    /**
     * ENTER THE JOB NAME AND EMAIL
     */
    public static void enterJobNameAndEmail(String string1, String string2){
        PlaywrightUtils.page.locator("//input[@id='jobName']").fill(string1);
        PlaywrightUtils.page.locator("//input[@id='email']").fill(string2);
    }

    /**
     * SELECTS BOTH NHL AND CHL CHECKBOXES
     */
    public static void selectBothNhLAndCHL() {
        PlaywrightUtils.page.locator("//label[@for='Non-Hodgkin Lymphoma']").click();
        PlaywrightUtils.page.locator("//label[@for='Chronic Myeloid Leukemia']").click();
    }

    /**
     * SELECTS THE RELAX PROPORTIONALITY AND CUTPOINT
     *
     * @param cutpoint
     */
    public static void checkRelaxProportionalityAndCutPoint(String cutpoint) {
        PlaywrightUtils.page.locator("//input[@id='useRelaxModel']").click();
        CommonUtils.sleep(2000);
        PlaywrightUtils.page.locator("//select[@name='cutpoint']").selectOption(cutpoint);
        CommonUtils.sleep(4000);
    }

    /**
     * SELECTS ONLY CHL CHECKBOX
     */
    public static void selectOnlyCML() {
        PlaywrightUtils.page.locator("//label[@for='Chronic Myeloid Leukemia']").click();
    }

    /**
     * RECALCULATE AFTER SELECTING FROM AND TO YEAR
     */
    public static void reCalculateAfterSelectingYear(String startYear, String endYear) {
        PlaywrightUtils.page.locator("//input[@id='calendarTrend']").click();
        PlaywrightUtils.page.locator("//select[@id='trendStart']").selectOption(startYear);
        CommonUtils.sleep(2000);
        PlaywrightUtils.page.locator("//select[@id='trendEnd']").selectOption(endYear);
        PlaywrightUtils.page.locator("//form[@class='border rounded m-1']//div[@class='d-flex justify-content-center align-items-center col-sm-2']//button[@type='submit'][normalize-space()='Recalculate']").click();
        CommonUtils.sleep(4000);
    }

    /**
     * ASSERTING THE TEXT AFTER RECALCULATING
     */
    public static void assertText() {
        assertThat(PlaywrightUtils.page.getByRole(AriaRole.MAIN)).containsText("Trend Measures for User Selected Years");
    }

    /**
     * ASSERTING THE TEXT AFTER RECALCULATING
     */
    public static void addAndRemoveInterval() {
        PlaywrightUtils.page.locator(JPSurvHomePagePlaywright.cscLocator).click();
        PlaywrightUtils.page.locator(JPSurvHomePagePlaywright.cscCheckBoxLocator).click();
        PlaywrightUtils.page.locator("//select[@name='conditionalIntervals[0].start']").selectOption("2");
        CommonUtils.sleep(2000);
        PlaywrightUtils.page.locator("//select[@name='conditionalIntervals[0].end']").selectOption("4");
        PlaywrightUtils.page.locator(JPSurvHomePagePlaywright.addInterval).click();
        CommonUtils.sleep(2000);
        PlaywrightUtils.page.locator(JPSurvHomePagePlaywright.removeInterval).click();
    }

    /**
     * CLICK AND VERIFY NCI LINK UNDER LI TAG
     */
    public static void clickNCILinkAndVerify(String Name, String NewPage) {
        Page newPage1 = PlaywrightUtils.context.waitForPage(() -> {
            PlaywrightUtils.page.locator("li").filter(new Locator.FilterOptions().setHasText(Name)).getByRole(AriaRole.LINK).click();
        });
        CommonUtils.sleep(2000);
        assertThat(newPage1).hasURL(NewPage);
        newPage1.close();
    }

    /**
     * CLICK AND VERIFY NCI LINK UNDER DIV TAG
     */
    public static void clickNCILinkAndVerifyUnderDiv(String Name, String NewPage) {
        Page newPage1 = PlaywrightUtils.context.waitForPage(() -> {
            PlaywrightUtils.page.locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^at the National Cancer Institute$"))).getByRole(AriaRole.LINK).click();
        });
        CommonUtils.sleep(2000);
        assertThat(newPage1).hasURL(NewPage);
        newPage1.close();
    }

    /**
     * VALIDATE COUNT OF PLOT IS NOT ZERO
     */
    public static void validatePlotCount() {
        int plotCount = PlaywrightUtils.page.locator(JPSurvHomePagePlaywright.plotCount).count();
        assert plotCount > 0;
    }

    /**
     * CALCULATE COHERT AND MODEL SPECIFICATION WITH CSM
     */
    public static void calculateCohertAndModelSpecificationWithCSM() {
        uploadFile();
        PlaywrightUtils.page.locator(JPSurvHomePagePlaywright.startYear).selectOption("5");
        PlaywrightUtils.page.locator(JPSurvHomePagePlaywright.endYear).selectOption("15");
        PlaywrightUtils.page.locator(JPSurvHomePagePlaywright.nhlLocator).click();
        selectOnlyCML();
        PlaywrightUtils.page.locator("//input[@id='useCondModel']").click();
        CommonUtils.sleep(1000);
        PlaywrightUtils.page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Submit")).click();
        CommonUtils.sleep(10000);
    }

    /**
     * VALIDATE CONDITIONAL SURVIVAL CALCULATION BUTTON NOT AVAILABILITY
     */
    public static void validateCSCButtonNotAvailable() {
        boolean isButtonVisible = PlaywrightUtils.page.isVisible("//button[normalize-space()='Conditional Survival Calculation']");
        assertFalse(isButtonVisible, "Conditional Survival Calculation button should not be available after calculation.");
    }

    /**
     * CALCULATE COHERT AND MODEL SPECIFICATION WITH RELAX PROPORTIONALITY
     */
    public static void calculateCohertAndModelSpecificationWithRelaxProportionality() {
        PlaywrightUtils.page.locator("//*[name()='path' and contains(@d,'m3.86 8.75')]").click();
        PlaywrightUtils.page.locator("//input[@id='useCondModel']").click();
        checkRelaxProportionalityAndCutPoint("5");
        CommonUtils.sleep(1000);
        PlaywrightUtils.page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Submit")).click();
        CommonUtils.sleep(10000);
    }

    /**
     * CALCULATE COHERT AND MODEL SPECIFICATION WITH NO OPTIONS
     */
    public static void calculateCohertAndModelSpecificationWithNoOptions() {
        PlaywrightUtils.page.locator("//*[name()='path' and contains(@d,'m3.86 8.75')]").click();
        PlaywrightUtils.page.locator("//input[@id='useRelaxModel']").click();
        CommonUtils.sleep(1000);
        PlaywrightUtils.page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Submit")).click();
        CommonUtils.sleep(10000);
    }

    /**
     * VALIDATE CONDITIONAL SURVIVAL CALCULATION BUTTON AVAILABILITY
     */
    public static void validateCSCButtonAvailable() {
        boolean isButtonVisible = PlaywrightUtils.page.isVisible("//button[normalize-space()='Conditional Survival Calculation']");
        assertTrue(isButtonVisible, "Conditional Survival Calculation button should not be available after calculation.");
    }

    /**
     * UPLOAD THE FILES AND SELECTS RELAX PROPORTIONALITY
     */
    public static void uploadsFileAndSelectRelaxProportionality() {
        uploadFile();
        PlaywrightUtils.page.locator(JPSurvHomePagePlaywright.startYear).selectOption("5");
        PlaywrightUtils.page.locator(JPSurvHomePagePlaywright.endYear).selectOption("15");
        PlaywrightUtils.page.locator(JPSurvHomePagePlaywright.nhlLocator).click();
        selectOnlyCML();
        PlaywrightUtils.page.locator("//input[@id='useRelaxModel']").click();
        CommonUtils.sleep(1000);
    }

    /**
     * VALIDATE CUTPOINT IS ALREADY SELECTED FROM DROPDOWN
     */
    public static void validateCutpointAlreadySelected() {
        String selectedValue = PlaywrightUtils.page.locator("//select[@name='cutpoint']").inputValue();
        Assert.assertEquals("5", selectedValue, "The 'cutpoint' dropdown should have value '5' selected.");
    }

    /**
     * VALIDATE SPECIFIED TEXT ON THE CALCULATION PAGE
     */
    public static void validateSpecifiedText() {
        String actualText =  PlaywrightUtils.page.locator("//label[normalize-space()='Cut Point']").innerText();
        String expectedString = "Cut Point";
        Assert.assertEquals(expectedString, actualText.trim());
        String actualText1 =  PlaywrightUtils.page.locator("//small[@class='form-text']").innerText();
        String expectedString1 = "The cut-point is the time after diagnosis that splits data into two groups. Cluster 1 includes years 1 to the cut-point. Separate JPSurv models are applied to each cluster.";
        Assert.assertEquals(expectedString1, actualText1.trim());
    }

    /**
     * CHECK ADD ANNOTATION BUTTON IS CLICKABLE AND VISIBLE
     */
    public static void checkAddAnnotationButton() {
        assertThat(PlaywrightUtils.page.locator("//*[@data-testid='MainPanel']//div[@role='tabpanel']//div//button[contains(text(),'+ Add Annotation')]").first()).isVisible();
        assertThat(PlaywrightUtils.page.locator("//*[@data-testid='MainPanel']//div[@role='tabpanel']//div//button[contains(text(),'+ Add Annotation')]").first()).isEnabled();
    }

    /**
     * ADDS SPECIFICATIONS WITH NHL AND RELAX PROPORTIONALITY CHECKBOXES
     */
    public static void addSpecificationWithNHLAndRelaxProportionality(){
        uploadFile();
        PlaywrightUtils.page.locator(JPSurvHomePagePlaywright.startYear).selectOption("5");
        PlaywrightUtils.page.locator(JPSurvHomePagePlaywright.endYear).selectOption("15");
        PlaywrightUtils.page.locator(JPSurvHomePagePlaywright.nhlLocator).click();
        PlaywrightUtils.page.locator("//input[@id='useRelaxModel']").click();
        CommonUtils.sleep(1000);
    }

    /**
     * VALIDATING OF COLUMN TITLES OF THE MODEL TABLE
     */
    public static void columnTitleOfModelTable() {
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 1; i <= 7; i++) {
            String xpath = "//span[contains(text(),'Select Model')]//parent::th//following::th[" + i + "]";
            Locator element = PlaywrightUtils.page.locator(xpath);
            arr.add(element.textContent());
        }
        System.out.println(arr);
        Assert.assertTrue(arr.contains("Model"));
        Assert.assertTrue(arr.contains("Number of Joinpoints"));
        Assert.assertTrue(arr.contains("Location"));
        Assert.assertTrue(arr.contains("Bayesian Information Criterion (BIC)"));
        Assert.assertTrue(arr.contains("Akaike Information Criterion (AIC)"));
        Assert.assertTrue(arr.contains("Log Likelihood"));
        Assert.assertTrue(arr.contains("Converged"));
    }
}