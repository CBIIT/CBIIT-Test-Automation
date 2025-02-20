package ANALYSIS_TOOLS.ACT24.stepsImpl;

import ANALYSIS_TOOLS.ACT24.pages.ACT24ResearcherPortalPlaywrightPage;
import com.microsoft.playwright.ElementHandle;
import com.microsoft.playwright.Locator;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.PlaywrightUtils;
import org.testng.Assert;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class ACT24ResearcherPlaywrightStepImpl {

    public static int uniqueNumber = ThreadLocalRandom.current().nextInt(100, 1000);
    public static String studyName = "KGA" + uniqueNumber;

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
        Locator menuTabs = PlaywrightUtils.page.locator("//li[@role='presentation']");
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
        PlaywrightUtils.page.locator("//div[@class='orgchartSelector']").click();
        PlaywrightUtils.page.locator("//div[@class='orgchartSelector active']").click();
    }

    /**
     * Clicking on export button
     */
    public static void clickExportButton() {
        CommonUtils.sleep(2000);
        PlaywrightUtils.page.locator("//button[@id='exportMyStudies1']").click();
        CommonUtils.sleep(2000);
        PlaywrightUtils.page.locator("//button[@id='exportMyStudies2']//span[@class='glyphicon glyphicon-export']").click();
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
        PlaywrightUtils.page.locator("//select[@id='studyId']").selectOption(studyName+" - "+studyName);
    }
}