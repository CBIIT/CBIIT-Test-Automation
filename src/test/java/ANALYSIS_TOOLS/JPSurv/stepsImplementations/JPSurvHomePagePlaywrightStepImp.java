package ANALYSIS_TOOLS.JPSurv.stepsImplementations;

import ANALYSIS_TOOLS.JPSurv.pages.JPSurvHomePagePlaywright;
import APPS_COMMON.PageInitializers.PageInitializer;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.PlaywrightUtils;
import java.nio.file.Path;
import java.nio.file.Paths;

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
}