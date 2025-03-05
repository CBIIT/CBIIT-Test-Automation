package ANALYSIS_TOOLS.ACT24.stepsImpl;

import ANALYSIS_TOOLS.ACT24.pages.ACT24ResearcherPortalPlaywrightPage;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.PlaywrightUtils;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.ThreadLocalRandom;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class ACT24ParticipantPlaywrightStepsImpl {
    public static String participantUrl;
    public static Page newPage3;
    public static int uniqueId = ThreadLocalRandom.current().nextInt(100, 1000);
    public static String randomWord = String.valueOf((char) ('A' + ThreadLocalRandom.current().nextInt(26)))
            + String.valueOf((char) ('A' + ThreadLocalRandom.current().nextInt(26)))
            + String.valueOf((char) ('A' + ThreadLocalRandom.current().nextInt(26)));
    public static String newStudyName = randomWord + uniqueId;
    public static String firstParticipantUrl;
    public static String secondParticipantUrl;
    public static String thirdParticipantUrl;

    /**
     * Login with the valid credentials in the participant portal
     */
    public static void loginWithCredentials() {
        PlaywrightUtils.page.locator("//input[@id='username']").fill("satya.gugulothu@nih.gov");
        PlaywrightUtils.page.locator("//input[@id='password']").fill("Satyakotya123@");
        PlaywrightUtils.page.locator("//button[@id='login']").click();
    }

    /**
     * Navigating to participant url from researcher website and validating the title
     */
    public static void navigateToNewTabAndOpenUrl() {
        participantUrl = PlaywrightUtils.page.locator("//table[@id='participantsTable']//tbody//tr//td[3]").first().innerText();
        System.out.println(participantUrl);
        navigateToNewTabWithUrl(participantUrl, PlaywrightUtils.context);
        newPage3.bringToFront();
        assertThat(newPage3).hasTitle("ACT24");
    }

    /**
     * Navigating to participant url from researcher website and validating the title
     */
    public static void navigateToNewTabAndOpenUrl1() {
        participantUrl = PlaywrightUtils.page.locator("//table[@id='participantsTable']//tbody//tr//td[3]").first().innerText();
        System.out.println(participantUrl);
        navigateToNewTabWithUrl(participantUrl, PlaywrightUtils.context);
    }

    /**
     * Navigating to new tab with the url
     */
    public static void navigateToNewTabWithUrl(String url, BrowserContext context) {
        try {
            newPage3 = context.newPage();
            newPage3.navigate(url);
            newPage3.waitForLoadState();
            newPage3.bringToFront();
            assertThat(newPage3).hasTitle("ACT24");
            CommonUtils.sleep(2000);
        } catch (Exception e) {
            System.err.println("Error navigating to new tab: " + e.getMessage());
        }
    }

    /**
     * Clicking on the fourth tab
     */
    public static void clickFourthTab() {
        newPage3.locator("//div[@id='overlayDesktopStartInfo']//button[4]").click();
        newPage3.locator("//button[@class='btn btn-lg btn-success rounded']").click();
        newPage3.close();
        PlaywrightUtils.page.bringToFront();
    }

    /**
     * Creating a new study for submitting the recalls
     */
    public static void createStudyAndUploadTemplateFile() {
        PlaywrightUtils.page.locator(ACT24ResearcherPortalPlaywrightPage.createNewStudy).click();
        CommonUtils.sleep(2000);
        addAllRequiredDetails();
        PlaywrightUtils.page.locator(ACT24ResearcherPortalPlaywrightPage.submitButtonLocator).click();
        CommonUtils.sleep(2000);
        PlaywrightUtils.page.locator("//a[normalize-space()='Participant Accounts']").click();
        PlaywrightUtils.page.locator("//a[@id='clearSearch']").click();
        PlaywrightUtils.page.locator("//select[@id='studyId']").selectOption(newStudyName+" - "+newStudyName);
        PlaywrightUtils.page.locator("//input[@name='searchParticipants']").click();
        String UPLOAD_XLSX_FILE_PATH = "./src/test/resources/ACT24TemplateFile.xlsx";
        Path pathNew = Paths.get(UPLOAD_XLSX_FILE_PATH);
        PlaywrightUtils.page.setInputFiles("//input[@id='file']", pathNew);
        CommonUtils.sleep(4000);
        PlaywrightUtils.page.locator(ACT24ResearcherPortalPlaywrightPage.uploadLocator).click();
    }

    /**
     * Adding all the required details
     */
    public static void addAllRequiredDetails(){
        PlaywrightUtils.page.locator("//input[@id='studyActual']").click();
        PlaywrightUtils.page.locator("//input[@id='name']").fill(newStudyName);
        CommonUtils.sleep(2000);
        PlaywrightUtils.page.locator("//textarea[@id='description']").fill(newStudyName);
        PlaywrightUtils.page.locator("//input[@id='abbreviation']").fill(newStudyName);
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
        PlaywrightUtils.page.locator("//textarea[@id='customParticipantExitMessage']").fill(newStudyName);
        PlaywrightUtils.page.locator("//label[normalize-space()='Accept']//input[@id='acceptBtn']").click();
        CommonUtils.sleep(2000);
    }

    /**
     * Searching the created study
     */
    public static void searchStudyThroughName() {
        PlaywrightUtils.page.locator("//select[@id='studyId']").selectOption(newStudyName+" - "+newStudyName);
        PlaywrightUtils.page.locator("//input[@name='searchParticipants']").click();
        firstParticipantUrl = PlaywrightUtils.page.locator("//table[@id='participantsTable']//tbody//tr//td[3]").first().innerText();
    }

    /**
     * Opening the first recall in the new tab
     */
    public static void openFirstRecall() {
        navigateToNewTabWithUrl(firstParticipantUrl, PlaywrightUtils.context);
    }

    /**
     * Selecting all the activities
     */
    public static void selectsAllActivities() {
        newPage3.locator("//div[@id='overlayDesktopStartInfo']//button[4]").click();
        newPage3.locator("//button[@class='btn btn-lg btn-success rounded']").click();
        newPage3.locator("//input[@id='submitBtn']").click();
        newPage3.locator("//span[contains(text(),'Sleeping or Napping')]").click();
        newPage3.locator("//span[@id='activityTitle_1']").click();
        newPage3.locator("//input[@id='ActivityQuestionId23_RADIOGROUP_IS_SLEEP']").click();
        newPage3.locator("//select[@id='ActivityQuestionId4000_STARTTIME']").selectOption("6:00am");
        newPage3.locator("//select[@id='ActivityQuestionId4001_ENDTIME']").selectOption("6:20am(20min)");
        newPage3.locator("//select[@id='QuestionId33_DROPDOWN']").selectOption("10min");
        newPage3.locator("//select[@id='QuestionId34_DROPDOWN']").selectOption("2");
        CommonUtils.sleep(2000);
        newPage3.locator("//select[@id='QuestionId35_DROPDOWN']").selectOption("10min");
        CommonUtils.sleep(2000);
        newPage3.locator("//div[@class='select-selected2']").click();
        CommonUtils.sleep(2000);
        newPage3.locator("//div[@id='container']//div[102]").click();
        CommonUtils.sleep(5000);
        newPage3.locator("//select[@id='QuestionId37_DROPDOWN']").selectOption("3:05pm(20min)");
        newPage3.locator("//select[@id='QuestionId38_DROPDOWN']").selectOption("10min");
        newPage3.locator("//input[@id='ActivityQuestionId4011_RADIOGROUP_Very_good']").click();
        newPage3.locator("//input[@id='ActivityQuestionId4021_RADIOGROUP_Refreshed']").click();
        newPage3.locator("//input[@id='ActivityQuestionId4023_RADIOGROUP_IS_NOT']").click();
        newPage3.locator("//input[@id='ActivityQuestionId4024_RADIOGROUP_IS_SLEEP']").click();
        newPage3.locator("//input[@id='ActivityQuestionId4026_CHECKGROUP_Work']").click();
    }

    /**
     * Clicking on the next button
     */
    public static void clickNextButton() {
        newPage3.locator("//button[@id='buttonNextSD']").click();
    }

    /**
     * Clicking on the submit recall now button
     */
    public static void clickSubmitRecallButton() {
        newPage3.locator("//b[normalize-space()='Submit Recall Now']").click();
    }

    /**
     * Verifying that recall is submitted
     */
    public static void validateSubmittedRecallText() {
        assertThat(newPage3.locator("//h1[@class='submitHeadline']")).containsText("You have successfully submitted your recall. ");
        newPage3.close();
        PlaywrightUtils.page.bringToFront();
    }

    /**
     * Opening the second recall of the created study in new tab
     */
    public static void openSecondRecall() {
        navigateToNewTabWithUrl(secondParticipantUrl, PlaywrightUtils.context);
    }

    /**
     * Doing Actions on Activity Page
     */
    public static void activityPage(){
        newPage3.locator("//div[@id='overlayDesktopStartInfo']//button[4]").click();
        newPage3.locator("//button[@class='btn btn-lg btn-success rounded']").click();
        newPage3.locator("//input[@id='submitBtn']").click();
    }

    /**
     * Navigating to the activity page of the participant portal
     */
    public static void navigatingActivityPage() {
        activityPage();
    }

    /**
     * Changing language from French to English
     */
    public static void changesLanguages() {
        newPage3.locator("//span[@id='activeLanguage']").click();
        newPage3.locator("//a[@id='frenchItem']").click();
        activityPage();
        newPage3.locator("//span[@id='activeLanguage']").click();
        newPage3.locator("//a[@id='englishItem']").click();
        activityPage();
    }

    /**
     * Clicking on help link and verifying it
     */
    public static void clickOnHelpAndVerify() {
        Page newPage11 = PlaywrightUtils.context.waitForPage(() -> {
            newPage3.locator("//a[normalize-space()='Help']").click();});
        CommonUtils.sleep(2000);
        assertThat(newPage11).hasTitle("ACT24 Frequently Asked Questions");
        newPage11.close();
        CommonUtils.sleep(4000);
    }

    /**
     * Clicking on logout button
     */
    public static void clickLogout() {
        newPage3.bringToFront();
        newPage3.locator("//a[@id='logout']").click();
        newPage3.locator("//input[@aria-label='Log Out']").click();
        newPage3.close();
        CommonUtils.sleep(2000);
        PlaywrightUtils.page.bringToFront();
    }

    /**
     * Selecting newly created study and clicking on the search button
     */
    public static void searchesNewlyCreatedStudy() {
        PlaywrightUtils.page.locator("//select[@id='studyId']").selectOption(newStudyName+" - "+newStudyName);
        System.out.println(newStudyName+" - "+newStudyName);
        PlaywrightUtils.page.locator("//input[@name='searchParticipants']").click();
    }

    /**
     * Selecting Second Recall
     */
    public static void getSecondRecallUrl() {
        secondParticipantUrl = PlaywrightUtils.page.locator("//table[@id='participantsTable']//tbody//tr//td[3]").nth(2).innerText();
        System.out.println(secondParticipantUrl);
    }

    /**
     * Selecting Third Recall
     */
    public static void getThirdRecallUrl() {
        thirdParticipantUrl = PlaywrightUtils.page.locator("//table[@id='participantsTable']//tbody//tr//td[3]").nth(3).innerText();
        System.out.println(thirdParticipantUrl);
    }

    /**
     * Opening the third recall of the created study in new tab
     */
    public static void openThirdRecall() {
        navigateToNewTabWithUrl(thirdParticipantUrl, PlaywrightUtils.context);
    }
}