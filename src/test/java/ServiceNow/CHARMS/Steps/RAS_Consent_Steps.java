package ServiceNow.CHARMS.Steps;

import ServiceNow.CHARMS.Constants.CHARMSRASScreenerConstants;
import ServiceNow.CHARMS.Pages.NativeViewCHARMSDashboardPage;
import appsCommon.Pages.NativeView_SideDoor_Dashboard_Page;
import appsCommon.Utils.ServiceNow_Common_Methods;
import appsCommon.Utils.ServiceNow_Login_Methods;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.LocalConfUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import io.cucumber.java.en.Given;
import org.apache.commons.collections4.map.HashedMap;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Paths;
import java.util.Properties;
import java.util.Set;

import static Hooks.Hooks.softAssert;
import static appsCommon.PageInitializers.PageInitializer.*;
import static appsCommon.Pages.Selenium_Common_Locators.locateByXpath;

public class RAS_Consent_Steps {

    /**
     * THIS METHOD WILL SELECT THE CONSENT FLOW ACCORDING TO THE SHEET CHOSEN IN THE FEATURE FILE
     *
     * @param sheetName
     */
    @Given("the e-consent is submitted for {string}")
    public void the_e_consent_is_submitted_for(String sheetName) {
        MiscUtils.sleep(20000);
        ras_Screener_TestDataManager.dataInitializerRasScreener(sheetName);
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        MiscUtils.sleep(8000);
        NativeView_SideDoor_Dashboard_Page.filterNavigatorTextBox.sendKeys("All Participant Details");
        MiscUtils.sleep(3000);
        CommonUtils.clickOnElement(NativeView_SideDoor_Dashboard_Page.allParticipantDetailsLink);
        MiscUtils.sleep(8000);
        CommonUtils.switchToFrame(NativeView_SideDoor_Dashboard_Page.nativeViewiFrame);
        MiscUtils.sleep(2000);
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
        MiscUtils.sleep(1000);
        if (CommonUtils.isElementDisplayed(nativeViewCHARMSDashboardPage.rasStudyOpenRecordButton)) {
            CucumberLogUtils.logScreenshot();
            CommonUtils.clickOnElement(nativeViewCHARMSDashboardPage.rasStudyOpenRecordButton);
        }
        MiscUtils.sleep(2000);
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsSubmitForEligibilityButton);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsSubmitForEligibilityButton);
        MiscUtils.sleep(1500);
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
        MiscUtils.sleep(500);
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
        CommonUtils.selectDropDownValue(nativeViewCHARMSParticipantConsentPage.rasStudyConsentResponseTypeDropDown, 1);
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
        MiscUtils.sleep(500);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallCompleteButton);
        CucumberLogUtils.logScreenshot();
        ServiceNow_Common_Methods.logOutOfNativeView();
    }

    /**
     * THIS METHOD WILL FILL OUT THE E-CONSENT FORM
     * @param password
     */
    @Given("clicks on Study Consent to begin form {string}")
    public void clicks_on_Study_Consent_to_begin_form(String password) {
        CommonUtils.waitForVisibility(myRASHomePage.rasopathyStudyConsent);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(myRASHomePage.rasopathyStudyConsent);
        MiscUtils.sleep(5000);
        CucumberLogUtils.logScreenshot();
        System.out.println("* * * * * FILLING OUT CONSENT FORM * * * * *");
        JavascriptUtils.scrollIntoView(locateByXpath("//input[@id='consent_read']"));
        WebElement readConsentCheckbbox = locateByXpath("//input[@id='consent_read']");
        CommonUtils.waitForClickability(readConsentCheckbbox);
        CommonUtils.clickOnElement(readConsentCheckbbox);
        CucumberLogUtils.logScreenshot();
        WebElement IAmThisPersonRadioButton = locateByXpath("//input[@aria-label='I am this person.']");
        WebElement futureResearchYesRadioButton = locateByXpath("(//input[@id='future_research_yes'])[2]");
        WebElement specimenShareYesRadioButton = locateByXpath("//input[@id='specimen_share_yes']");
        WebElement specimenShareForFutureYesRadioButton = locateByXpath("//input[@id='specimen_share_for_future_yes']");
        CommonUtils.waitForClickability(IAmThisPersonRadioButton);
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
     * @param sheetName
     * @param consentStatus
     * @param consentType
     * @param responseType
     */
    @Given("PI completes consent and verifies {string} {string} {string} {string}")
    public void PI_completes_consent_and_verifies(String sheetName, String consentStatus, String consentType, String responseType) {
        MiscUtils.sleep(20000);
        ras_Screener_TestDataManager.dataInitializerRasScreener(sheetName);
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        MiscUtils.sleep(8000);
        NativeView_SideDoor_Dashboard_Page.filterNavigatorTextBox.sendKeys("All Participant Details");
        MiscUtils.sleep(3000);
        CommonUtils.clickOnElement(NativeView_SideDoor_Dashboard_Page.allParticipantDetailsLink);
        MiscUtils.sleep(8000);
        CommonUtils.switchToFrame(NativeView_SideDoor_Dashboard_Page.nativeViewiFrame);
        MiscUtils.sleep(2000);
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
        MiscUtils.sleep(1000);
        if (CommonUtils.isElementDisplayed(nativeViewCHARMSDashboardPage.rasStudyOpenRecordButton)) {
            CucumberLogUtils.logScreenshot();
            CommonUtils.clickOnElement(nativeViewCHARMSDashboardPage.rasStudyOpenRecordButton);
        }
        JavascriptUtils.scrollIntoView(nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsConsentsTab);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsConsentsTab);
        CommonUtils.hoverOverElement(locateByXpath("//td[normalize-space()='Awaiting PI Signature']"));
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsConsentsPreviewButton);
        CommonUtils.waitForVisibility(nativeViewCHARMSDashboardPage.rasStudyOpenRecordButton);
        MiscUtils.sleep(500);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(nativeViewCHARMSDashboardPage.rasStudyOpenRecordButton);
        CommonUtils.waitForClickability(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCompletedConsentButton);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCompletedConsentButton);
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantConsentPage.rasStudyConsentConsentRecordCompletedMessageMessage);
        CommonUtils.waitForClickability(nativeViewCHARMSParticipantConsentPage.rasStudyConsentConsentRecordCompletedMessageMessage);
        nativeViewCHARMSParticipantConsentPage.rasStudyConsentConsentRecordCompletedMessageMessage.click();
//        CommonUtils.waitForVisibility(JavascriptUtils.shadowDriver.findElement("#close-messages-btn"));
//        CommonUtils.waitForClickability(JavascriptUtils.shadowDriver.findElement("#close-messages-btn"));
//        JavascriptUtils.shadowDriver.findElement("button.now-button-iconic.-tertiary.-md.is-bare[aria-label=\"Dismiss alert\"][data-tooltip=\"Dismiss alert\"]").click();
//        CommonUtils.waitForVisibility(locateByXpath("//button[@aria-label='Dismiss alert']"));
//        CommonUtils.waitForClickability(locateByXpath("//button[@aria-label='Dismiss alert']"));
//        CommonUtils.clickOnElement(locateByXpath("//button[@aria-label='Dismiss alert']"));
//        JavascriptUtils.shadowDriver.findElement("\button[type=\"button\"][aria-label=\"Dismiss alert\"]").click();
        CucumberLogUtils.logScreenshot();
        CommonUtils.waitForClickability(locateByXpath("//button[@title='Back']"));
        CommonUtils.clickOnElement(locateByXpath("//button[@title='Back']"));
        MiscUtils.sleep(1000);
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.scrollIntoView(nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsConsentsTab);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsConsentsTab);
        CucumberLogUtils.logScreenshot();
        softAssert.assertEquals(locateByXpath("//td[normalize-space()='Complete']").getText(), consentStatus);
        softAssert.assertEquals(locateByXpath("//td[normalize-space()='Adult']").getText(), consentType);
        softAssert.assertEquals(locateByXpath("//td[normalize-space()='CHARMS e-consent']").getText(), responseType);
    }

    /**
     * THIS METHOD VERIFIES THAT THE CONSENT DOWNLOAD FORM IS SHOWN ON THE PARTICIPANT'S PORTAL
     * @param participantPortalText
     */
    @Given("{string} shows on participant portal")
    public void shows_on_participant_portal(String participantPortalText) {
        CommonUtils.waitForVisibility(locateByXpath("//span[normalize-space()='Download Study Consent']"));
        softAssert.assertEquals(locateByXpath("//span[normalize-space()='Download Study Consent']").getText(), participantPortalText);
    }

    /**
     * THIS METHOD WILL VERIFY THAT THE CONSENT FORM PDF WAS DOWNLOADED AND THEN DELETE IT FROM THE DIRECTORY
     * @param pdfName
     */
    @Given("when clicked downloads {string}")
    public void when_clicked_downloads(String pdfName) {
        CommonUtils.waitForClickability(locateByXpath("//span[normalize-space()='Download Study Consent']"));
        locateByXpath("//span[normalize-space()='Download Study Consent']").click();
        String mainWindowHandle = webDriver.getWindowHandle();
        Set<String> windowHandles = webDriver.getWindowHandles();
        for (String handle : windowHandles) {
            if (!handle.equals(mainWindowHandle)) {
                webDriver.switchTo().window(handle);
                break;
            }
        }
        String pdfUrl = webDriver.getCurrentUrl();
        String downloadPath = LocalConfUtils.getRootDir() + "/src/test/resources/" + pdfName + ".pdf";
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

            System.out.println("PDF downloaded successfully to: " + downloadPath);
        } catch (Exception e) {
            e.printStackTrace();
        }
        File downloadedFile = new File(downloadPath);
        if (downloadedFile.delete()) {
            System.out.println("* * * * * DOWNLOADED PDF DELETED SUCCESSFULLY * * * * *");
        } else {
            System.out.println("* * * * * FAILED TO DELETE THE DOWNLOADED PDF * * * * *");
        }
    }
}
