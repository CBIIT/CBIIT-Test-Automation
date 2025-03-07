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

    /***
     * DISCLAIMER LOCATOR
     */
    public static String disclaimerLink = "Disclaimer";

    /***
     * FOIA LOCATOR
     */
    public static String foiaLink = "FOIA";

    /***
     * VULNERABILITY DISCLOSURE LOCATOR
     */
    public static String vulnerabilityDisclosure = "HHS Vulnerability Disclosure";

    /***
     * PRIVACY AND SECURITY LOCATOR
     */
    public static String privacyAndSecurity = "Privacy & Security";

    /***
     * ACCESSIBILITY LOCATOR
     */
    public static String accessibilityLink = "Accessibility";

    /***
     * HHS LOCATOR
     */
    public static String hhsLink = "U.S. Department of Health and Human Services";

    /***
     * NIH LOCATOR
     */
    public static String nihLink = "National Institutes of Health";

    /***
     * NCI LOCATOR
     */
    public static String nciLink = "National Cancer Institute";

    /***
     * USA GOV LOCATOR
     */
    public static String USAGovLink = "USA.gov";

    /***
     * TRACK RECALLS LOCATOR
     */
    public static String trackRecalls = "//table[@id='myStudies']//tbody//tr//a[@title='Track Recalls']";

    /***
     * LOCK BUTTON LOCATOR
     */
    public static String lockButton = "//tbody/tr[1]/td[5]/button[1]/i[1]";

    /***
     * NEW LOCK BUTTON LOCATOR
     */
    public static String newLockButton = "//i[@class='fa fa-lock fa-1x']";

    /***
     * UPLOAD LOCATOR
     */
    public static String uploadLocator = "//input[@id='upload']";

    /***
     * CANCEL BUTTON LOCATOR
     */
    public static String cancelButtonLocator = "//div[@class='modal-body']//button[@type='button'][normalize-space()='Cancel']";

    /***
     * SEARCH TRACK RECALLS LOCATOR
     */
    public static String searchTrackRecalls = "//input[@id='searchRecalls']";
}