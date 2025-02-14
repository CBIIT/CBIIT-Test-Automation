package ANALYSIS_TOOLS.ACT24.pages;

public class ACT24ResearcherPortalPlaywrightPage {

    /***
     * LOGOUT LOCATOR
     */
    public static String logoutLocator = "//a[@id='logout']";

    /***
     * SEARCH BOX LOCATOR
     */
    public static String searchBox = "//input[@type='search']";

    /***
     * CREATE NEW STUDY LOCATOR
     */
    public static String createNewStudy = "//a[normalize-space()='Create New Study']";

    /***
     * SUCCESS ALERT FOR STUDY CREATED
     */
    public static String successAlertStudy = "//div[@class='alert alert-success']";

    /***
     * SUBMIT BUTTON LOCATOR
     */
    public static String submitButtonLocator = "//button[@id='submitCreateStudy']";

    /***
     * STUDY STAFF LOCATOR
     */
    public static String studyStaff = "//table[@id='myStudies']//tbody//tr//a[@name='studyStaff']";

    /***
     * STUDY STAFF MENU TAB LOCATOR
     */
    public static String studyStaffMenuTab = "//a[normalize-space()='Study Staff']";

    /***
     * MY ACCOUNT LOCATOR
     */
    public static String myAccount = "//a[normalize-space()='My Account']";

    /***
     * EDIT STUDY LOCATOR
     */
    public static String editStudy = "//table[@id='myStudies']//tbody//tr//a[@name='editStudy']";

    /***
     * SUBMIT CREATED STUDY LOCATOR
     */
    public static String submitCreatedStudy = "//button[@id='submitCreateStudy']";

    /***
     * SEARCH ANALYTICS BUTTON LOCATOR
     */
    public static String searchAnalyticsButton = "//input[@id='searchAnalyticsButton']";

    /***
     * CLEAR BUTTON LOCATOR
     */
    public static String clearButton = "//a[@id='clearSearch']";

    /***
     * ANALYTICS DATA LOCATOR
     */
    public static String analyticsData = "//table[@id='myStudies']//tbody//tr//a[@title='Analytic Data']";
}