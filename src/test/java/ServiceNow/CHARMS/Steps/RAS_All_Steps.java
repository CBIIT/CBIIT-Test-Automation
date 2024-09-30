package ServiceNow.CHARMS.Steps;

import ServiceNow.CHARMS.Constants.CHARMSRASScreenerConstants;
import ServiceNow.CHARMS.Pages.NativeViewCHARMSDashboardPage;
import appsCommon.PageInitializers.PageInitializer;
import appsCommon.Pages.NativeView_SideDoor_Dashboard_Page;
import appsCommon.Utils.ServiceNow_Common_Methods;
import appsCommon.Utils.ServiceNow_Login_Methods;
import com.nci.automation.utils.CucumberLogUtils;
<<<<<<< HEAD
=======
import com.nci.automation.utils.MiscUtils;
>>>>>>> 34ba6435f2d4ba14ee4ee18d34e8b6de3ebf8535
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Set;
import static Hooks.Hooks.softAssert;
import static appsCommon.Pages.Selenium_Common_Locators.locateByXpath;

public class RAS_All_Steps extends PageInitializer {

    /**
     * THIS METHOD WILL SELECT THE CONSENT FLOW ACCORDING TO THE SHEET CHOSEN IN THE FEATURE FILE
     *
     * @param sheetName the name of the sheet for which the e-consent is being submitted
     */
    @Given("the e-consent is submitted for {string}")
    public static void the_e_consent_is_submitted_for(String sheetName) {
<<<<<<< HEAD
        ras_Screener_TestDataManager.dataInitializerRasScreener(sheetName);
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        CommonUtils.sleep(4000);
        CommonUtils.waitForVisibility(NativeView_SideDoor_Dashboard_Page.filterNavigatorTextBox);
        NativeView_SideDoor_Dashboard_Page.filterNavigatorTextBox.sendKeys("All Participant Details");
        CucumberLogUtils.logScreenshot();
        CommonUtils.sleep(3000);
        CommonUtils.clickOnElement(NativeView_SideDoor_Dashboard_Page.allParticipantDetailsLink);
        CommonUtils.sleep(3000);
        CommonUtils.switchToFrame(NativeView_SideDoor_Dashboard_Page.nativeViewiFrame);
        CommonUtils.sleep(2000);
        CucumberLogUtils.logScreenshot();
        if (sheetName.contentEquals("screenerScenario1")) {
            CommonUtils.hoverOverElement(participantDetailsPage.dynamicRecordButtonLocator(ras_Screener_TestDataManager.FIRST_NAME + " " + ras_Screener_TestDataManager.LAST_NAME));
            CucumberLogUtils.logScreenshot();
            CommonUtils.clickOnElement(NativeViewCHARMSDashboardPage.nativeViewnewScreenerReceivedLocator(ras_Screener_TestDataManager.FIRST_NAME + " " + ras_Screener_TestDataManager.LAST_NAME));
        } else if (sheetName.contentEquals("screenerScenario2")) {
            CommonUtils.hoverOverElement(participantDetailsPage.dynamicRecordButtonLocator(ras_Screener_TestDataManager.FIRST_NAME + " " + ras_Screener_TestDataManager.LAST_NAME));
            CucumberLogUtils.logScreenshot();
            CommonUtils.clickOnElement(NativeViewCHARMSDashboardPage.nativeViewnewScreenerReceivedLocator(ras_Screener_TestDataManager.FIRST_NAME + " " + ras_Screener_TestDataManager.LAST_NAME));
        } else if (sheetName.contentEquals("screenerScenario3")) {
            CommonUtils.hoverOverElement(participantDetailsPage.dynamicRecordButtonLocator(ras_Screener_TestDataManager.WHAT_IS_THE_NAME_OF_THE_PERSON_WHO_MAY_BE_ELIGIBLE_FOR_THIS_STUDY_FIRST + " " + ras_Screener_TestDataManager.WHAT_IS_THE_NAME_OF_THE_PERSON_WHO_MAY_BE_ELIGIBLE_FOR_THIS_STUDY_LAST));
            CucumberLogUtils.logScreenshot();
            CommonUtils.clickOnElement(NativeViewCHARMSDashboardPage.nativeViewnewScreenerReceivedLocator(ras_Screener_TestDataManager.WHAT_IS_THE_NAME_OF_THE_PERSON_WHO_MAY_BE_ELIGIBLE_FOR_THIS_STUDY_FIRST + " " + ras_Screener_TestDataManager.WHAT_IS_THE_NAME_OF_THE_PERSON_WHO_MAY_BE_ELIGIBLE_FOR_THIS_STUDY_LAST));
        } else if (sheetName.contentEquals("screenerScenario4")) {
            CommonUtils.hoverOverElement(participantDetailsPage.dynamicRecordButtonLocator(ras_Screener_TestDataManager.WHAT_IS_THE_NAME_OF_THE_PERSON_WHO_MAY_BE_ELIGIBLE_FOR_THIS_STUDY_FIRST + " " + ras_Screener_TestDataManager.WHAT_IS_THE_NAME_OF_THE_PERSON_WHO_MAY_BE_ELIGIBLE_FOR_THIS_STUDY_LAST));
            CucumberLogUtils.logScreenshot();
            CommonUtils.clickOnElement(NativeViewCHARMSDashboardPage.nativeViewnewScreenerReceivedLocator(ras_Screener_TestDataManager.WHAT_IS_THE_NAME_OF_THE_PERSON_WHO_MAY_BE_ELIGIBLE_FOR_THIS_STUDY_FIRST + " " + ras_Screener_TestDataManager.WHAT_IS_THE_NAME_OF_THE_PERSON_WHO_MAY_BE_ELIGIBLE_FOR_THIS_STUDY_LAST));
        }
        CommonUtils.sleep(1000);
        if (CommonUtils.isElementDisplayed(nativeViewCHARMSDashboardPage.rasStudyOpenRecordButton)) {
            CucumberLogUtils.logScreenshot();
            CommonUtils.clickOnElement(nativeViewCHARMSDashboardPage.rasStudyOpenRecordButton);
        }
        CommonUtils.sleep(2000);
=======
        RAS_Common_Methods.navigateToRecordInNativeView(sheetName);
        MiscUtils.sleep(2000);
>>>>>>> 34ba6435f2d4ba14ee4ee18d34e8b6de3ebf8535
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsSubmitForEligibilityButton);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsSubmitForEligibilityButton);
        CommonUtils.sleep(1500);
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsMarkEligibleButton);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsMarkEligibleButton);
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsConsentAddedText);
        CucumberLogUtils.logScreenshot();
        CommonUtils.assertEqualsWithMessage(nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsConsentAddedText.getText(), CHARMSRASScreenerConstants.CONSENT_ADDED_TEXT, "---- VERIFYING SCREENER RECORD RASOPATHY HISTORY DATA ----");

        /**
         * BEGINNING: CONSENT FLOW PROCESS
         */
        JavascriptUtils.scrollIntoView(nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsConsentsTab);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsConsentsTab);
        CommonUtils.hoverOverElement(participantDetailsPage.consentStatusText);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsConsentsPreviewButton);
        CommonUtils.waitForVisibility(nativeViewCHARMSDashboardPage.rasStudyOpenRecordButton);
        CommonUtils.sleep(500);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(nativeViewCHARMSDashboardPage.rasStudyOpenRecordButton);
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeCalendar);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeCalendar);
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeTodayButton);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeTodayButton);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeAcceptButton);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleDateCalendar);
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeTodayButton);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeTodayButton);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleVerionCalendar);
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeTodayButton);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeTodayButton);
        CommonUtils.selectDropDownValue("CHARMS e-consent", nativeViewCHARMSParticipantConsentPage.rasStudyConsentResponseTypeDropDown);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentDateCalendar);
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeTodayButton);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeTodayButton);
        CommonUtils.sendKeys(nativeViewCHARMSParticipantConsentPage.rasStudyConsentByTextBox, CHARMSRASScreenerConstants.CONSENTED_BY_USER_NAME);
        CommonUtils.sendKeys(nativeViewCHARMSParticipantConsentPage.rasStudyConsentByTextBox, Keys.ENTER);
        CommonUtils.selectDropDownValue(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCurrentDropDown, 1);
        CommonUtils.selectDropDownValue(nativeViewCHARMSParticipantConsentPage.rasStudyConsentConsentAssentStatusDropDown, 4);
        CommonUtils.selectDropDownValue(nativeViewCHARMSParticipantConsentPage.rasStudyConsentFutureSpecimensAndDataDropDown, 4);
        CommonUtils.selectDropDownValue(nativeViewCHARMSParticipantConsentPage.rasStudyConsentFutureUseCollaboratorsDropDown, 4);
        CommonUtils.selectDropDownValue(nativeViewCHARMSParticipantConsentPage.rasStudyConsentFutureIdentifiableUseCollaboratorsDropDown, 4);
        CommonUtils.sleep(500);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallCompleteButton);
        CucumberLogUtils.logScreenshot();
        ServiceNow_Common_Methods.logOutOfNativeView();
    }

    /**
     * THIS METHOD WILL FILL OUT THE STUDY CONSENT FORM
     *
     * @param password the password to be used for completing the form
     */
    @Given("participant clicks on Study Consent and completes form with {string}")
    public static void participant_clicks_on_Study_Consent_and_completes_form_with(String password) {
        CommonUtils.waitForVisibility(myRASHomePage.rasopathyStudyConsent);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(myRASHomePage.rasopathyStudyConsent);
        CommonUtils.sleep(5000);
        CucumberLogUtils.logScreenshot();
        System.out.println("* * * * * FILLING OUT CONSENT FORM * * * * *");
        JavascriptUtils.scrollIntoView(locateByXpath("//input[@id='consent_read']"));
        WebElement readConsentCheckbox = locateByXpath("//input[@id='consent_read']");
        CommonUtils.waitForClickability(readConsentCheckbox);
        CommonUtils.clickOnElement(readConsentCheckbox);
        CucumberLogUtils.logScreenshot();
        WebElement IAmThisPersonRadioButton = locateByXpath("//input[@aria-label='I am this person.']");
        WebElement futureResearchYesRadioButton = locateByXpath("(//input[@id='future_research_yes'])[2]");
        WebElement specimenShareYesRadioButton = locateByXpath("//input[@id='specimen_share_yes']");
        WebElement specimenShareForFutureYesRadioButton = locateByXpath("//input[@id='specimen_share_for_future_yes']");
        CommonUtils.waitForClickability(IAmThisPersonRadioButton);
        CommonUtils.clickOnElement(IAmThisPersonRadioButton);
        CommonUtils.clickOnElement(futureResearchYesRadioButton);
        CommonUtils.clickOnElement(specimenShareYesRadioButton);
        CommonUtils.clickOnElement(specimenShareForFutureYesRadioButton);
        CucumberLogUtils.logScreenshot();
        WebElement toConsentButton = locateByXpath("//button[@id='toConsentBtn']");
        CommonUtils.waitForClickability(toConsentButton);
        CommonUtils.clickOnElement(toConsentButton);
        CucumberLogUtils.logScreenshot();
        CommonUtils.waitForVisibility(locateByXpath("//div[@class='form-group']//input[@id='signature_password']"));
        CommonUtils.sendKeys(locateByXpath("//div[@class='form-group']//input[@id='signature_password']"), password);
        CommonUtils.waitForVisibility(locateByXpath("//div[@class='modal-footer']//button[@id='consentBtn']"));
        CommonUtils.clickOnElement(locateByXpath("//div[@class='modal-footer']//button[@id='consentBtn']"));
        CucumberLogUtils.logScreenshot();
        CommonUtils.waitForVisibility(locateByXpath("//button[normalize-space()='OK']"));
        CommonUtils.clickOnElement(locateByXpath("//button[normalize-space()='OK']"));
        CucumberLogUtils.logScreenshot();
        ServiceNow_Common_Methods.logOutOfNativeView();
        CucumberLogUtils.logScreenshot();
    }

    /**
     * THIS METHOD WILL SIGN THE CONSENT RECORD IN NATIVE VIEW
     *
     * @param sheetName     the name of the sheet for which the consent is being processed
     * @param consentStatus the expected status of the consent
     * @param consentType   the expected type of the consent
     * @param responseType  the expected response type of the consent
     */
    @Then("PI completes consent and verifies {string} {string} {string} {string} in Native View")
    public static void PI_completes_consent_and_verifies_in_Native_View(String sheetName, String consentStatus, String consentType, String responseType) {
        ras_Screener_TestDataManager.dataInitializerRasScreener(sheetName);
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        CommonUtils.sleep(8000);
        NativeView_SideDoor_Dashboard_Page.filterNavigatorTextBox.sendKeys("All Participant Details");
        CommonUtils.sleep(3000);
        CommonUtils.clickOnElement(NativeView_SideDoor_Dashboard_Page.allParticipantDetailsLink);
        CommonUtils.sleep(8000);
        CommonUtils.switchToFrame(NativeView_SideDoor_Dashboard_Page.nativeViewiFrame);
        CommonUtils.sleep(2000);
        CucumberLogUtils.logScreenshot();
        if (sheetName.contentEquals("screenerScenario1")) {
            CommonUtils.hoverOverElement(participantDetailsPage.dynamicRecordButtonLocator(ras_Screener_TestDataManager.FIRST_NAME + " " + ras_Screener_TestDataManager.LAST_NAME));
            CucumberLogUtils.logScreenshot();
            CommonUtils.clickOnElement(NativeViewCHARMSDashboardPage.nativeViewnewScreenerReceivedLocator(ras_Screener_TestDataManager.FIRST_NAME + " " + ras_Screener_TestDataManager.LAST_NAME));
        } else if (sheetName.contentEquals("screenerScenario2")) {
            CommonUtils.hoverOverElement(participantDetailsPage.dynamicRecordButtonLocator(ras_Screener_TestDataManager.FIRST_NAME + " " + ras_Screener_TestDataManager.LAST_NAME));
            CucumberLogUtils.logScreenshot();
            CommonUtils.clickOnElement(NativeViewCHARMSDashboardPage.nativeViewnewScreenerReceivedLocator(ras_Screener_TestDataManager.FIRST_NAME + " " + ras_Screener_TestDataManager.LAST_NAME));
        } else if (sheetName.contentEquals("screenerScenario3")) {
            CommonUtils.hoverOverElement(participantDetailsPage.dynamicRecordButtonLocator(ras_Screener_TestDataManager.WHAT_IS_THE_NAME_OF_THE_PERSON_WHO_MAY_BE_ELIGIBLE_FOR_THIS_STUDY_FIRST + " " + ras_Screener_TestDataManager.WHAT_IS_THE_NAME_OF_THE_PERSON_WHO_MAY_BE_ELIGIBLE_FOR_THIS_STUDY_LAST));
            CucumberLogUtils.logScreenshot();
            CommonUtils.clickOnElement(NativeViewCHARMSDashboardPage.nativeViewnewScreenerReceivedLocator(ras_Screener_TestDataManager.WHAT_IS_THE_NAME_OF_THE_PERSON_WHO_MAY_BE_ELIGIBLE_FOR_THIS_STUDY_FIRST + " " + ras_Screener_TestDataManager.WHAT_IS_THE_NAME_OF_THE_PERSON_WHO_MAY_BE_ELIGIBLE_FOR_THIS_STUDY_LAST));
        } else if (sheetName.contentEquals("screenerScenario4")) {
            CommonUtils.hoverOverElement(participantDetailsPage.dynamicRecordButtonLocator(ras_Screener_TestDataManager.WHAT_IS_THE_NAME_OF_THE_PERSON_WHO_MAY_BE_ELIGIBLE_FOR_THIS_STUDY_FIRST + " " + ras_Screener_TestDataManager.WHAT_IS_THE_NAME_OF_THE_PERSON_WHO_MAY_BE_ELIGIBLE_FOR_THIS_STUDY_LAST));
            CucumberLogUtils.logScreenshot();
            CommonUtils.clickOnElement(NativeViewCHARMSDashboardPage.nativeViewnewScreenerReceivedLocator(ras_Screener_TestDataManager.WHAT_IS_THE_NAME_OF_THE_PERSON_WHO_MAY_BE_ELIGIBLE_FOR_THIS_STUDY_FIRST + " " + ras_Screener_TestDataManager.WHAT_IS_THE_NAME_OF_THE_PERSON_WHO_MAY_BE_ELIGIBLE_FOR_THIS_STUDY_LAST));
        }
        CommonUtils.sleep(1000);
        if (CommonUtils.isElementDisplayed(nativeViewCHARMSDashboardPage.rasStudyOpenRecordButton)) {
            CucumberLogUtils.logScreenshot();
            CommonUtils.clickOnElement(nativeViewCHARMSDashboardPage.rasStudyOpenRecordButton);
        }
        JavascriptUtils.scrollIntoView(nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsConsentsTab);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsConsentsTab);
        CommonUtils.hoverOverElement(locateByXpath("//td[normalize-space()='Awaiting PI Signature']"));
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsConsentsPreviewButton);
        CommonUtils.waitForVisibility(nativeViewCHARMSDashboardPage.rasStudyOpenRecordButton);
        CommonUtils.sleep(500);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(nativeViewCHARMSDashboardPage.rasStudyOpenRecordButton);
        CommonUtils.waitForClickability(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCompletedConsentButton);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCompletedConsentButton);
        CommonUtils.sleep(2000);
        CucumberLogUtils.logScreenshot();
        CommonUtils.waitForClickability(locateByXpath("//button[@title='Back']"));
        CommonUtils.clickOnElement(locateByXpath("//button[@title='Back']"));
        CommonUtils.sleep(1000);
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.scrollIntoView(nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsConsentsTab);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsConsentsTab);
        CucumberLogUtils.logScreenshot();
        softAssert.assertEquals(locateByXpath("//td[normalize-space()='" + consentStatus + "']").getText(), consentStatus);
        softAssert.assertEquals(locateByXpath("//td[normalize-space()='" + consentType + "']").getText(), consentType);
        softAssert.assertEquals(locateByXpath("//td[normalize-space()='" + responseType + "']").getText(), responseType);
        CucumberLogUtils.logScreenshot();
        ServiceNow_Common_Methods.logOutOfNativeView();
    }

    /**
     * THIS METHOD VERIFIES THAT THE CONSENT DOWNLOAD FORM IS SHOWN ON THE PARTICIPANT'S PORTAL
     *
     * @param participantPortalText The expected text to be shown on the participant portal.
     */
    @Given("{string} shows on participant portal")
    public static void shows_on_participant_portal(String participantPortalText) {
        CommonUtils.waitForVisibility(locateByXpath("//span[normalize-space()='Download Study Consent']"));
        softAssert.assertEquals(locateByXpath("//span[normalize-space()='Download Study Consent']").getText(), participantPortalText);
    }

    /**
     * THIS METHOD WILL VERIFY THAT THE CONSENT WIDGET DISPLAYS ON THE PARTICIPANT PORTAL AND WHEN CLICKED VERIFIES THAT THE CONSENT FORM PDF WAS DOWNLOADED
     *
     * @param expectedDownloadStudyConsentText The expected text to be shown on the participant portal.
     * @param pdfName                          The name of the PDF file to be downloaded.
     */
    @Given("{string} text shows on participant portal and when clicked downloads {string}")
    public static void text_shows_on_participant_portal_and_when_clicked_downloads_consent_form(String expectedDownloadStudyConsentText, String pdfName) {
        CommonUtils.waitForVisibility(locateByXpath("//span[normalize-space()='Download Study Consent']"));
        softAssert.assertEquals(locateByXpath("//span[normalize-space()='Download Study Consent']").getText(), expectedDownloadStudyConsentText);
        CommonUtils.waitForClickability(locateByXpath("//span[normalize-space()='Download Study Consent']"));
        locateByXpath("//span[normalize-space()='Download Study Consent']").click();
        CucumberLogUtils.logScreenshot();
        String mainWindowHandle = webDriver.getWindowHandle();
        Set<String> windowHandles = webDriver.getWindowHandles();
        for (String handle : windowHandles) {
            if (!handle.equals(mainWindowHandle)) {
                webDriver.switchTo().window(handle);
                break;
            }
        }
        String pdfUrl = webDriver.getCurrentUrl();
        String downloadPath = System.getProperty("user.dir") + "/src/test/resources/" + pdfName + ".pdf";
        System.out.println("* * * * * DOWNLOADING STUDY CONSENT PDF * * * * *");
        try {
            HttpURLConnection connection = (HttpURLConnection) new URL(pdfUrl).openConnection();
            String cookies = String.join(";", webDriver.manage().getCookies().stream()
                    .map(cookie -> cookie.getName() + "=" + cookie.getValue())
                    .toArray(String[]::new));
            connection.setRequestProperty("Cookie", cookies);
            connection.connect();
            InputStream in = connection.getInputStream();
            FileOutputStream fos = new FileOutputStream(downloadPath);
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = in.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
            fos.close();
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        File downloadedFile = new File(downloadPath);
        softAssert.assertTrue(downloadedFile.exists());
        CucumberLogUtils.logScreenshot();
        if (downloadedFile.delete()) {
            System.out.println("* * * * * STUDY CONSENT PDF DELETED SUCCESSFULLY * * * * *");
        } else {
            System.out.println("* * * * * FAILED TO DELETE STUDY CONSENT PDF * * * * *");
        }
    }

    /**
     * Submits and verifies the consent in native view for a specified sheet name, consent status, consent type, and response type.
     *
     * @param sheetName      the name of the sheet for which the consent is being processed
     * @param consentStatus  the expected status of the consent
     * @param consentType    the expected type of the consent
     * @param responseType   the expected response type of the consent
     */
    @When("the consent is submitted for {string} and {string} {string} {string} is verified in Native View")
    public void the_consent_is_submitted_for_and_is_verified_in_native_view(String sheetName, String consentStatus, String consentType, String responseType) {
        MiscUtils.sleep(20000);
        ras_Screener_TestDataManager.dataInitializerRasScreener(sheetName);
        RAS_Common_Methods.nativeViewConsentFlowProcessScenario1Parameterized(sheetName, consentStatus, consentType, responseType);
    }
}
