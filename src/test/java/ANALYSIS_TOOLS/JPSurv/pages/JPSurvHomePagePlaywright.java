package ANALYSIS_TOOLS.JPSurv.pages;

public class JPSurvHomePagePlaywright {

    /***
     * HELP TAB IN JPSURV
     */
    public static String helpTabElement = "//a[normalize-space()='Help']";

    /***
     * HELP WEBSITE URL IN JPSURV
     */
    public static String helpWebsite = "https://analysistools-dev.cancer.gov/jpsurv/help";

    /***
     * START YEAR IDENTIFIER
     */
    public static String startYear = "//select[@name='yearStart']";

    /***
     * END YEAR IDENTIFIER
     */
    public static String endYear = "//select[@name='yearEnd']";

    /***
     * INTERVAL OF MAXIMUM YEAR OF DIAGNOSIS
     */
    public static String intervalForDiagnosis = "//select[@name='yearStart']";

    /***
     * NON HODGKIN LYMPHOMA LOCATOR
     */
    public static String nhlLocator = "//input[@id='Non-Hodgkin Lymphoma']";

    /***
     * CONDITIONAL SURVIVAL CALCULATION LOCATOR
     */
    public static String cscLocator = "//button[normalize-space()='Conditional Survival Calculation']";

    /***
     * CONDITIONAL SURVIVAL CALCULATION CHECKBOX LOCATOR
     */
    public static String cscCheckBoxLocator = "//input[@id='conditional']";

    /***
     * RECALCULATE BUTTON LOCATOR
     */
    public static String recalculateButton = "//div[@class='accordion-body']//button[@type='submit'][normalize-space()='Recalculate']";

    /***
     * ADD INTERVAL LOCATOR
     */
    public static String addInterval = "//span[@title='Add Interval']";

    /***
     * DOWNLOAD FULL DATASET LOCATOR
     */
    public static String downloadDataset = "//button[normalize-space()='Download Full Dataset']";

    /***
     * EXPORT WORKSPACE LOCATOR
     */
    public static String exportWorkspace = "//button[normalize-space()='Export Workspace']";

    /***
     * INPUT TYPE LOCATOR
     */
    public static String inputType = "//select[@id='inputType']";

    /***
     * SUBMIT BUTTON LOCATOR
     */
    public static String submitButtonLocator = "//button[@type='submit']";

    /***
     * SEND NOTIFICATION LOCATOR
     */
    public static String sendNotification = "//input[@id='sendNotification']";

    /***
     * JOB SUBMITTED LOCATOR
     */
    public static String jobSubmitted = "//div[contains(text(),'Your job has been submitted')]";

    /***
     * COHORT SELECTION LOCATOR
     */
    public static String selectCohort = "//label[normalize-space()='Cohort']//parent::div//select";

    /***
     * DOI ORG LINK
     */
    public static String doiOrg = "https://doi.org/10.1158/1055-9965.EPI-21-0423";

    /***
     * INPUT FILE LOCATOR
     */
    public static String inputFileLocator = "xpath=//input[@id='inputFile']";

    /***
     * CUTPOINT LOCATOR
     */
    public static String cutPointLocator = "//label[text()='Cutpoint']/parent::div//select";

    /***
     * TOOLTIP LOCATOR
     */
    public static String toolTipLocator = "//a[@rel='tooltip']";

    /***
     * CANCER CONTROL LINK LOCATOR
     */
    public static String cancerControl = "Division of Cancer Control and Population Sciences";

    /***
     * ACCESSIBILITY PAGE
     */
    public static String accessibilityPage = "Accessibility";

    /***
     * FOIA PAGE LINK
     */
    public static String FOIAPage = "FOIA";

    /***
     * DEATH VS YEAR DIAGNOSIS LINK
     */
    public static String deathVsYear = "//ul//li//button[contains(text(),'Death vs. Year at Diagnosis')]";

    /***
     * SELECTED MODEL LOCATOR
     */
    public static String modelLocator = "//td[normalize-space()='1 (final selected model)']";

    /***
     * REMOVE INTERVAL LOCATOR
     */
    public static String removeInterval = "//span[@title='Remove Interval']";

    /***
     * LOCATOR OF HHS LINK OF US DEPARTMENT
     */
    public static String hhsLink = "U.S. Department of Health and Human Services";

    /***
     * NIH LINK LOCATOR
     */
    public static String NIHPage = "National Institutes of Health";

    /***
     * NATIONAL CANCER INSTITUTE
     */
    public static String NCIPage = "National Cancer Institute";

    /***
     * USA GOV ELEMENT
     */
    public static String USAGov = "USA.gov";

    /***
     * DISCLAIMER ELEMENT
     */
    public static String Disclaimer = "Disclaimer";

    /***
     * HHS VULNERABILITY ELEMENT
     */
    public static String HHSVulnerability = "HHS Vulnerability Disclosure";

    /***
     * PLOT COUNT LOCATOR
     */
    public static String plotCount = "//*[@data-testid='MainPanel']//div[@role='tabpanel']//div[@class='w-100 js-plotly-plot']";
}