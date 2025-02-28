package ANALYSIS_TOOLS.ACT24.stepsImpl;

import ANALYSIS_TOOLS.ACT24.pages.ACT24ResearcherPortalPlaywrightPage;
import com.microsoft.playwright.ElementHandle;
import com.microsoft.playwright.Locator;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.PlaywrightUtils;
import org.testng.Assert;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class ACT24ResearcherPlaywrightStepImpl {

    public static int uniqueNumber = ThreadLocalRandom.current().nextInt(100, 1000);
    public static String studyName = "KHA" + uniqueNumber;

    /**
     * Entering email and password to login
     *
     * @param email     The email to be entered.
     * @param password  The password to be entered.
     */
    public static void enterLoginDetails(String email, String password) {
        PlaywrightUtils.page.locator("//input[@id='email']").fill(email);
        CommonUtils.sleep(2000);
        PlaywrightUtils.page.locator("//input[@id='password']").fill(password);
        CommonUtils.sleep(2000);
        PlaywrightUtils.page.locator("//button[@id='login']").click();
        CommonUtils.sleep(4000);
    }

    /**
     * Clicking every menu tabs
     */
    public static void clickOnEveryMenuTabs() {
        Locator menuTabs = PlaywrightUtils.page.locator("//div[@id='navbarNav']//ul//li");
        ArrayList<String> arr = new ArrayList<>();
        String actualText = "[MY STUDIES, STUDY STAFF, PARTICIPANT ACCOUNTS, TRACK RECALLS, ANALYTIC DATA, MY ACCOUNT]";
        for(ElementHandle tabs : menuTabs.elementHandles()){
            String str = tabs.innerText();
            arr.add(str);
        }
        System.out.println(arr);
        Assert.assertEquals(actualText, arr.toString());
    }

    /**
     * Clicking on instruction
     */
    public static void clickInstructions() {
        PlaywrightUtils.page.locator("//span[contains(text(),'INSTRUCTIONS')]").click();
        CommonUtils.sleep(1000);
        PlaywrightUtils.page.locator("//span[contains(text(),'INSTRUCTIONS')]").click();
    }

    /**
     * Clicking on export button
     */
    public static void clickExportButton() {
        CommonUtils.sleep(2000);
        PlaywrightUtils.page.locator("//button[@id='exportMyStudies1']").click();
        CommonUtils.sleep(2000);
        PlaywrightUtils.page.locator("//button[@id='exportMyStudies2']").click();
    }

    /**
     * Selecting different entries on show entries dropdown
     *
     * @param entry1     The entry1 to be selected.
     * @param entry2     The entry2 to be selected.
     */
    public static void changesEntriesVisibility(String entry1, String entry2) {
        PlaywrightUtils.page.locator("//select[@name='myStudies_length']").selectOption(entry1);
        PlaywrightUtils.page.locator("//select[@name='myStudies_length']").selectOption(entry2);
    }

    /**
     * Checking column is clickable and clicking on it
     */
    public static void checkColumnClickable() {
        Locator columnButton  = PlaywrightUtils.page.locator("//th[@aria-label='Study Abbreviation: activate to sort column descending: activate to sort column descending']");
        columnButton.isEnabled();
        columnButton.click();
    }

    /**
     * Checking user is on the create new study page
     */
    public static void checkCreateStudyPageOpened() {
        String createStudy = PlaywrightUtils.page.locator("//h4[normalize-space()='Create New Study']").innerText();
        Assert.assertEquals("Create New Study", createStudy);
    }

    /**
     * Entering all the mandatory details to create an study
     */
    public static void enterMandatoryDetailsToCreateStudy() {
        PlaywrightUtils.page.locator("//input[@id='studyActual']").click();
        System.out.println(studyName);
        PlaywrightUtils.page.locator("//input[@id='name']").fill(studyName);
        CommonUtils.sleep(2000);
        PlaywrightUtils.page.locator("//textarea[@id='description']").fill(studyName);
        PlaywrightUtils.page.locator("//input[@id='abbreviation']").fill(studyName);
        CommonUtils.sleep(2000);
        Locator participantCount = PlaywrightUtils.page.locator("//input[@id='participantCount']");
        participantCount.clear();
        participantCount.fill("5");
        Locator recallCount = PlaywrightUtils.page.locator("//input[@id='recallCount']");
        recallCount.clear();
        recallCount.fill("5");
        PlaywrightUtils.page.locator("//input[@id='startDate']").type("12/12/2024");
        CommonUtils.sleep(2000);
        PlaywrightUtils.page.locator("//input[@id='endDate']").type("02/02/2025");
        CommonUtils.sleep(2000);
        PlaywrightUtils.page.locator("//input[@id='hasFunds2']").click();
        PlaywrightUtils.page.locator("//input[@id='loginAccessRequired1']").click();
        PlaywrightUtils.page.locator("//input[@id='accessAcknowledgement']").click();
        PlaywrightUtils.page.locator("//textarea[@id='customParticipantExitMessage']").fill("Test");
        PlaywrightUtils.page.locator("//label[normalize-space()='Accept']//input[@id='acceptBtn']").click();
        CommonUtils.sleep(2000);
    }

    /**
     * Searching the created study
     */
    public static void searchCreatedStudy() {
        PlaywrightUtils.page.locator(ACT24ResearcherPortalPlaywrightPage.searchBox).fill(studyName);
        CommonUtils.sleep(2000);
    }

    /**
     * Validating the displayed email in my account with the login email address
     *
     * @param emailInMyAccount     The mentioned email to be verified.
     */
    public static void verifyEmailAddress(String emailInMyAccount) {
        String emailAddress = PlaywrightUtils.page.locator("//input[@id='email']").inputValue();
        Assert.assertEquals(emailInMyAccount, emailAddress);
    }

    /**
     * Updating the details of the created study
     */
    public static void updateCreatedStudyDetails() {
        Locator participantCount = PlaywrightUtils.page.locator("//input[@id='participantCount']");
        participantCount.clear();
        participantCount.fill("8");
        Locator recallCount = PlaywrightUtils.page.locator("//input[@id='recallCount']");
        recallCount.clear();
        recallCount.fill("5");
    }

    /**
     * Selecting the created study from the dropdown
     */
    public static void selectCreatedStudy() {
        PlaywrightUtils.page.locator("//select[@name='studyId']").selectOption(studyName+" - "+studyName);
        CommonUtils.sleep(2000);
    }

    /**
     * User adds login credentials and do login
     */
    public static void loginACT24Website() {
        PlaywrightUtils.page.locator("//input[@id='email']").fill("satya.gugulothu@nih.gov");
        CommonUtils.sleep(2000);
        PlaywrightUtils.page.locator("//input[@id='password']").fill("Satya@1234");
        CommonUtils.sleep(2000);
        PlaywrightUtils.page.locator("//button[@id='login']").click();
        CommonUtils.sleep(2000);
    }

    /**
     * Creating a new study after entering all the mandatory details
     */
    public static void createNewStudy() {
        PlaywrightUtils.page.locator(ACT24ResearcherPortalPlaywrightPage.createNewStudy).click();
        ACT24ResearcherPlaywrightStepImpl.enterMandatoryDetailsToCreateStudy();
        CommonUtils.sleep(2000);
        PlaywrightUtils.page.locator(ACT24ResearcherPortalPlaywrightPage.submitButtonLocator).click();
        CommonUtils.sleep(2000);
    }

    /**
     * Navigating to the study staff menu tab and click on the clear button
     */
    public static void navigateStudyStaff() {
        PlaywrightUtils.page.locator("//a[normalize-space()='Study Staff']").click();
        PlaywrightUtils.page.locator("//a[@id='clearSearch']").click();
    }

    /**
     * Selecting created study and then clicking on search button
     */
    public static void selectAndSearchCreatedStudyUnderStudyStaff() {
        PlaywrightUtils.page.locator("//select[@id='studyList']").selectOption(studyName+" - "+studyName);
        PlaywrightUtils.page.locator("//input[@name='searchButton']").click();
    }

    /**
     * Checking if Add study staff button is visible or not
     */
    public static void validateAddStudyStaffButton() {
        PlaywrightUtils.page.locator("//button[@id='buttonMainAddStudyStaff']").isVisible();
        PlaywrightUtils.page.locator("//button[@id='buttonMainAddStudyStaff']").isEnabled();
    }

    /**
     * Clicking on Add study staff and enters email in text box
     */
    public static void enterEmailOnAddStudyStaffClick() {
        PlaywrightUtils.page.locator("//button[@id='buttonMainAddStudyStaff']").click();
        PlaywrightUtils.page.locator("//input[@id='studyStaff_username']").fill("satya.gugulothu@nih.gov");
    }

    /**
     * Validating text on click of the search button
     */
    public static void validateSearchedText(String validateEmailText) {
        PlaywrightUtils.page.locator("//button[@id='buttonSearchUsername']").click();
        String actualText = PlaywrightUtils.page.locator("//div[@id='usernameStatusMsg']").innerText();
        Assert.assertEquals(actualText, validateEmailText);
    }

    /**
     * Navigating to the participants account menu tab and click on the clear button
     */
    public static void navigateParticipantsAccount() {
        PlaywrightUtils.page.locator("//a[normalize-space()='Participant Accounts']").click();
        PlaywrightUtils.page.locator("//a[@id='clearSearch']").click();
    }

    /**
     * Selecting the created study and clicking on the search button
     */
    public static void searchCreatedStudyUnderParticipantAccount() {
        PlaywrightUtils.page.locator("//select[@id='studyId']").selectOption(studyName+" - "+studyName);
        PlaywrightUtils.page.locator("//input[@name='searchParticipants']").click();
    }

    /**
     * User uploads required xlsx file
     */
    public static void uploadXLSXFile() {
        String UPLOAD_XLSX_FILE_PATH = "./src/test/resources/ACT24TemplateFile.xlsx";
        Path pathNew = Paths.get(UPLOAD_XLSX_FILE_PATH);
        PlaywrightUtils.page.setInputFiles("//input[@id='file']", pathNew);
        CommonUtils.sleep(4000);
    }

    /**
     * Validating the specified entry text
     */
    public static void validateEntries(String entryText) {
        String actualText = PlaywrightUtils.page.locator("//div[@id='participantsTable_info']").innerText();
        Assert.assertNotEquals(actualText, entryText);
    }

    /**
     * Clicking on the delete button
     */
    public static void deleteEntry() {
        PlaywrightUtils.page.locator("//tbody/tr[1]/td[5]/button[2]/i[1]").click();
        PlaywrightUtils.page.locator("//button[@id='buttonDeleteConfirm']").click();
    }

    /**
     * Validating whether entry is deleted or not
     */
    public static void validateTextAfterDeleting() {
        String actualText1 = PlaywrightUtils.page.locator("//div[@id='successMessage']//div[@class='alert alert-success']").innerText();
        Assert.assertEquals(actualText1.trim(), "${ParticipantAccountDeltetedSuccessfully}");
    }

    /**
     * Validating the text once subject is locked
     *
     * @param validateLockedText     The validateLockedText to be verified.
     */
    public static void validateTextOnceSubjectLocked(String validateLockedText) {
        String actualText11 = PlaywrightUtils.page.locator("//span[@id='message']").innerText();
        Assert.assertEquals(actualText11.trim(), validateLockedText);
    }

    /**
     * Validating the text once subject is unlocked
     *
     * @param validateUnlockedText     The validateUnlockedText to be verified.
     */
    public static void validateTextOnceSubjectUnLocked(String validateUnlockedText) {
        String actualText111 = PlaywrightUtils.page.locator("//span[@id='message']").innerText();
        Assert.assertEquals(actualText111.trim(), validateUnlockedText);
    }

    /**
     * Navigating to track recalls menu tab and click on cleat button
     */
    public static void navigateTrackRecallsTab() {
        PlaywrightUtils.page.locator("//a[normalize-space()='Track Recalls']").click();
        PlaywrightUtils.page.locator("//a[@id='clearSearch']").click();
    }

    /**
     * Selecting study in which study are already added
     */
    public static void selectStudyHavingSubjects() {
        PlaywrightUtils.page.locator("//select[@id='studyId']").selectOption(studyName+" - "+studyName);
        PlaywrightUtils.page.locator("//input[@name='searchRecalls']").click();
    }

    /**
     * Validating the entry text under the track recall page
     *
     * @param entryText     The entryText to be verified.
     */
    public static void validateEntriesInTrackRecall(String entryText) {
        String actualText = PlaywrightUtils.page.locator("//div[@id='trackRecallTable_info']").innerText();
        Assert.assertEquals(actualText.trim(), entryText);
    }
}