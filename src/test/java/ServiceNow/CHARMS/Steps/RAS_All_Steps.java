package ServiceNow.CHARMS.Steps;

import ServiceNow.CHARMS.Constants.CHARMSRASScreenerConstants;
import ServiceNow.CHARMS.Pages.NativeViewCHARMSDashboardPage;
import appsCommon.PageInitializers.PageInitializer;
import appsCommon.Pages.NativeView_SideDoor_Dashboard_Page;
import appsCommon.Utils.ServiceNow_Common_Methods;
import appsCommon.Utils.ServiceNow_Login_Methods;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

import static ServiceNow.CHARMS.Pages.MyRASHomePage.dynamicModuleLocator;
import static ServiceNow.CHARMS.Steps.RAS_Common_Methods.*;
import static appsCommon.Pages.Selenium_Common_Locators.locateByXpath;

public class RAS_All_Steps extends PageInitializer {

    /**
     * THIS METHOD WILL SELECT THE CONSENT FLOW ACCORDING TO THE SHEET CHOSEN IN THE FEATURE FILE
     *
     * @param sheetName the name of the sheet for which the e-consent is being submitted
     */
    @Given("the e-consent is submitted for {string}")
    public static void the_e_consent_is_submitted_for(String sheetName) {
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        navigateToParticipantRecordInNativeView(sheetName);
        submitParticipantForReviewAndEligibility();
        CommonUtils.sleep(2000);
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
        CucumberLogUtils.scenario.log("* * * * * CONSENT CALL SCHEDULED TIME * * * * *");
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeCalendar);
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeTodayButton);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeTodayButton);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeAcceptButton);
        CucumberLogUtils.scenario.log("* * * * * CONSENT CALL DATE * * * * *");
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleDateCalendar);
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeTodayButton);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeTodayButton);
        CucumberLogUtils.scenario.log("* * * * * RESPONSE TYPE * * * * *");
        CommonUtils.selectDropDownValue("CHARMS e-consent", nativeViewCHARMSParticipantConsentPage.rasStudyConsentResponseTypeDropDown);
        CucumberLogUtils.scenario.log("* * * * * CONSENT CALL VERSION * * * * *");
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleVersionCalendar);
        CommonUtils.waitForClickability(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleVersionCalendar);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleVersionCalendar);
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeTodayButton);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeTodayButton);
        CucumberLogUtils.scenario.log("* * * * * CONSENT DATE * * * * *");
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentDateCalendar);
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeTodayButton);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeTodayButton);
        CucumberLogUtils.scenario.log("* * * * * CONSENTED BY * * * * *");
        CommonUtils.sendKeys(nativeViewCHARMSParticipantConsentPage.rasStudyConsentByTextBox, CHARMSRASScreenerConstants.CONSENTED_BY_USER_NAME);
        CommonUtils.sendKeys(nativeViewCHARMSParticipantConsentPage.rasStudyConsentByTextBox, Keys.ENTER);
        CucumberLogUtils.scenario.log("* * * * * CURRENT/PREVIOUS * * * * *");
        CommonUtils.selectDropDownValue("Current", nativeViewCHARMSParticipantConsentPage.rasStudyConsentCurrentDropDown);
        CucumberLogUtils.scenario.log("* * * * * COPY OF CONSENT/ASSENT PROVIDED PROVIDED BEFORE SIGNING * * * * *");
        CommonUtils.selectDropDownValue("Yes", nativeViewCHARMSParticipantConsentPage.rasStudyConsentCopyOfConsentAssentProvidedDropDown);
        CommonUtils.sleep(500);
        CucumberLogUtils.logScreenshot();
        CucumberLogUtils.scenario.log("* * * * * CALL COMPLETE * * * * *");
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallCompleteButton);
        CucumberLogUtils.logScreenshot();
        ServiceNow_Common_Methods.logOutOfNativeView();
    }

    /**
     * This method represents the step where the proxy clicks on the Study Consent and completes the consent form with the given password.
     *
     * @param password the password to be used for completing the form
     */
    @Given("proxy clicks on Study Consent and completes form with {string} {string}")
    public void proxy_clicks_on_study_consent_and_completes_form_with(String password, String sheetName) {
        CommonUtils.waitForVisibility(myRASHomePage.rasopathyStudyConsent);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(myRASHomePage.rasopathyStudyConsent);
        CommonUtils.sleep(5000);
        CucumberLogUtils.logScreenshot();
        System.out.println("* * * * * PROXY FILLING OUT CONSENT FORM * * * * *");
        JavascriptUtils.scrollIntoView(myRasStudyConsentPage.yesIhaveReadTheTermsAndConditionsCheckbox);
        CommonUtils.waitForClickability(myRasStudyConsentPage.yesIhaveReadTheTermsAndConditionsCheckbox);
        CommonUtils.clickOnElement(myRasStudyConsentPage.yesIhaveReadTheTermsAndConditionsCheckbox);
        CucumberLogUtils.logScreenshot();
        CommonUtils.waitForClickability(myRasStudyConsentPage.iAmThisPersonsParentGuardianRadioButton);
        CommonUtils.clickOnElement(myRasStudyConsentPage.iAmThisPersonsParentGuardianRadioButton);
        CommonUtils.clickOnElement(myRasStudyConsentPage.iDoGivePermissionForMyIdentifiableSpecimensAndDataToBeStoredAndUsedByTheStudyTeamRadioButton);
        CommonUtils.clickOnElement(myRasStudyConsentPage.iDoGivePermissionForMyDeIdentifiedSpecimensAndDataToBeSharedWithAndUsedByOtherResearchersRadioButton);
        CommonUtils.clickOnElement(myRasStudyConsentPage.iDoGivePermissionForMyIdentifiableSpecimensAndDataToBeSharedWithAndUsedByOtherResearchersForFutureStudiesRadioButton);
        CucumberLogUtils.logScreenshot();
        CommonUtils.waitForClickability(myRasStudyConsentPage.consentButton);
        CommonUtils.clickOnElement(myRasStudyConsentPage.consentButton);
        CucumberLogUtils.logScreenshot();
        CommonUtils.waitForVisibility(myRasStudyConsentPage.signingPasswordTextBox);
        myRasStudyConsentPage.signingPasswordTextBox.sendKeys(password);
        if (sheetName.equals("screenerScenarioAge14-17")) {
            CommonUtils.assertEquals(myRasStudyConsentPage.iVoluntarilyGiveMyAssentToParticipateInThisResearchText.getText().trim(), "I voluntarily give my assent to participate in this research. (The minor should check this box)");
            myRasStudyConsentPage.iVoluntarilyGiveMyAssentToParticipateInThisResearchCheckBox.click();
            CucumberLogUtils.logScreenshot();
            myRasStudyConsentPage.signButton.click();
        } else {
            CommonUtils.waitForVisibility(myRasStudyConsentPage.signButton);
            CommonUtils.clickOnElement(myRasStudyConsentPage.signButton);
            CucumberLogUtils.logScreenshot();
            CommonUtils.sleep(500);
            if (sheetName.equals("screenerScenarioAge11-13")) {
                CommonUtils.assertEquals(CommonUtils.getAlertText(), "To complete enrollment, please have your 11-13 year-old minor click through the \"Study Assent\" tile. If your minor declines participation, please contact the study team.");
                CommonUtils.acceptAlert();
            }
        }
        CommonUtils.sleep(500);
        CommonUtils.waitForVisibility(myRasStudyConsentPage.yourConsentFormHasBeenSubmittedOKbutton);
        CommonUtils.clickOnElement(myRasStudyConsentPage.yourConsentFormHasBeenSubmittedOKbutton);
        CommonUtils.sleep(500);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * Participant clicks on Study Consent and completes the form with the provided password.
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
        System.out.println("* * * * * PARTICIPANT FILLING OUT CONSENT FORM * * * * *");
        CommonUtils.assertEquals(myRasStudyConsentPage.consentButton.getAttribute("disabled"), "disabled");
        JavascriptUtils.scrollIntoView(myRasStudyConsentPage.yesIhaveReadTheTermsAndConditionsCheckbox);
        CommonUtils.waitForClickability(myRasStudyConsentPage.yesIhaveReadTheTermsAndConditionsCheckbox);
        CommonUtils.clickOnElement(myRasStudyConsentPage.yesIhaveReadTheTermsAndConditionsCheckbox);
        CommonUtils.assertEquals(myRasStudyConsentPage.consentButton.getAttribute("disabled"), "disabled");
        CucumberLogUtils.logScreenshot();
        CommonUtils.waitForClickability(myRasStudyConsentPage.iAmThisPersonRadioButton);
        CommonUtils.clickOnElement(myRasStudyConsentPage.iAmThisPersonRadioButton);
        CommonUtils.assertEquals(myRasStudyConsentPage.consentButton.getAttribute("disabled"), "disabled");
        CommonUtils.waitForClickability(myRasStudyConsentPage.iDoGivePermissionForMyIdentifiableSpecimensAndDataToBeStoredAndUsedByTheStudyTeamText);
        CommonUtils.assertEquals(myRasStudyConsentPage.iDoGivePermissionForMyIdentifiableSpecimensAndDataToBeStoredAndUsedByTheStudyTeamText.getText().trim(), "* Please indicate if you give permission for your identifiable specimens and data to be stored and used by the study team for future studies as described above.:");
        CommonUtils.clickOnElement(myRasStudyConsentPage.iDoGivePermissionForMyIdentifiableSpecimensAndDataToBeStoredAndUsedByTheStudyTeamRadioButton);
        CommonUtils.assertEquals(myRasStudyConsentPage.consentButton.getAttribute("disabled"), "disabled");
        CommonUtils.assertEquals(myRasStudyConsentPage.iDoGivePermissionForMyDeIdentifiedSpecimensAndDataToBeSharedWithAndUsedByOtherResearchersText.getText().trim(), "* Please indicate if you give permission for your de-identified specimens and data to be shared with and used by other researchers for future research by selecting one of the following statements:");
        CommonUtils.clickOnElement(myRasStudyConsentPage.iDoGivePermissionForMyDeIdentifiedSpecimensAndDataToBeSharedWithAndUsedByOtherResearchersRadioButton);
        CommonUtils.assertEquals(myRasStudyConsentPage.consentButton.getAttribute("disabled"), "disabled");
        CommonUtils.assertEquals(myRasStudyConsentPage.iDoGivePermissionForMyIdentifiableSpecimensAndDataToBeSharedWithAndUsedByOtherResearchersForFutureStudiesText.getText().trim(), "* Please indicate if you give permission for your identifiable specimens and data to be shared with and used by other researchers for future studies by selecting one of the following statements:");
        CommonUtils.clickOnElement(myRasStudyConsentPage.iDoGivePermissionForMyIdentifiableSpecimensAndDataToBeSharedWithAndUsedByOtherResearchersForFutureStudiesRadioButton);
        CucumberLogUtils.logScreenshot();
        CommonUtils.assertEquals(myRasStudyConsentPage.consentButton.getAttribute("disabled"), "null");
        CommonUtils.assertTrue(myRasStudyConsentPage.consentButton.isEnabled());
        CommonUtils.waitForClickability(myRasStudyConsentPage.consentButton);
        CommonUtils.clickOnElement(myRasStudyConsentPage.consentButton);
        CucumberLogUtils.logScreenshot();
        CommonUtils.waitForVisibility(myRasStudyConsentPage.signingPasswordTextBox);
        CommonUtils.sendKeys(myRasStudyConsentPage.signingPasswordTextBox, password);
        CommonUtils.waitForVisibility(myRasStudyConsentPage.signButton);
        CommonUtils.clickOnElement(myRasStudyConsentPage.signButton);
        CucumberLogUtils.logScreenshot();
        CommonUtils.assertEquals(myRasStudyConsentPage.yourConsentFormHasBeenSubmittedSuccessfullyMessage.getText(), "Your Consent Form has been submitted successfully !\n" +
                "Thank you for your interest in NCI Family Studies Hub: RASopathies at the NIH. Your Consent Form has been successfully submitted! Once the study team reviews your documents, the study team will contact you about the next steps for your participation in this study.\n" +
                "Please feel free to speak to your study contact should you have any questions. Again, thank you for your interest in NCI Family Studies Hub: RASopathies, and we look forward to working with you!");
        CommonUtils.sleep(200);
        CucumberLogUtils.logScreenshot();
        CommonUtils.waitForVisibility(myRasStudyConsentPage.yourConsentFormHasBeenSubmittedOKbutton);
        CommonUtils.clickOnElement(myRasStudyConsentPage.yourConsentFormHasBeenSubmittedOKbutton);
        ServiceNow_Common_Methods.logOutOfNativeView();
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method represents the step where the participant clicks on Study Assent and completes the form with the provided password.
     *
     * @param password the password to be used for completing the form
     */
    @Given("participant clicks on Study Assent and completes form with {string}")
    public static void participant_clicks_on_Study_Assent_and_completes_form_with(String password) {
        CommonUtils.waitForVisibility(myRASHomePage.rasopathyStudyAssent);
        CommonUtils.assertTrue(myRASHomePage.rasopathyStudyAssent.isDisplayed());
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(myRASHomePage.rasopathyStudyAssent);
        CommonUtils.sleep(3000);
        System.out.println("* * * * * PARTICIPANT FILLING OUT ASSENT FORM * * * * *");
        JavascriptUtils.scrollIntoView(myRASStudyAssentPage.yesIHaveReadAndAssentToTheTermsAndConditionsCheckbox);
        CommonUtils.assertEquals(myRASStudyAssentPage.yesIHaveReadAndAssentToTheTermsAndConditionsText.getText(), "Yes, I have read and assent to the terms and conditions.");
        CommonUtils.assertEquals(myRASStudyAssentPage.assentButton.getAttribute("ng-if"), "!c.disabled");
        CommonUtils.waitForClickability(myRASStudyAssentPage.yesIHaveReadAndAssentToTheTermsAndConditionsCheckbox);
        CommonUtils.clickOnElement(myRASStudyAssentPage.yesIHaveReadAndAssentToTheTermsAndConditionsCheckbox);
        CucumberLogUtils.logScreenshot();
        CommonUtils.waitForClickability(myRASStudyAssentPage.assentButton);
        CommonUtils.clickOnElement(myRASStudyAssentPage.assentButton);
        CommonUtils.assertEquals(myRASStudyAssentPage.assentButton.getAttribute("ng-if"), "c.disabled");
        CucumberLogUtils.logScreenshot();
        CommonUtils.waitForVisibility(myRASStudyAssentPage.signaturePasswordTextBox);
        CommonUtils.sendKeys(myRASStudyAssentPage.signaturePasswordTextBox, password);
        CommonUtils.waitForClickability(myRASStudyAssentPage.signButton);
        CommonUtils.clickOnElement(myRASStudyAssentPage.signButton);
        CucumberLogUtils.logScreenshot();
        CommonUtils.waitForVisibility(myRASStudyAssentPage.yourAssentFormHasBeenSubmittedSuccessfullyMessage);
        CommonUtils.assertEquals(myRASStudyAssentPage.yourAssentFormHasBeenSubmittedSuccessfullyMessage.getText(), "Your Assent Form has been submitted successfully !\n" +
                "Thank you for your interest in the NCI Family Studies Hub: RASopathies at the NIH. Your Assent Form has been successfully submitted! Once the study team reviews your documents, the study team will contact you about the next steps for your participation in this study.\n" +
                "Please feel free to speak to your study contact should you have any questions. Again, thank you for your interest in NCI Family Studies Hub: RASopathies, and we look forward to working with you!");
        CommonUtils.sleep(200);
        CucumberLogUtils.logScreenshot();
        CommonUtils.waitForVisibility(myRASStudyAssentPage.youAssentFormHasBeenSubmittedOKButton);
        CommonUtils.clickOnElement(myRASStudyAssentPage.youAssentFormHasBeenSubmittedOKButton);
        CucumberLogUtils.logScreenshot();
        CommonUtils.sleep(500);
    }

    /**
     * PI completes consent and verifies the specified information in Native View.
     *
     * @param sheetName     The name of the Excel sheet containing the data.
     * @param consentStatus The expected consent status.
     * @param consentType   The expected consent type.
     * @param responseType  The expected response type.
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
        } else if (sheetName.contentEquals("screenerScenarioAge11-13")) {
            CommonUtils.hoverOverElement(participantDetailsPage.dynamicRecordButtonLocator(ras_Screener_TestDataManager.PARTICIPANT_FIRST_NAME + " " + ras_Screener_TestDataManager.PARTICIPANT_LAST_NAME));
            CucumberLogUtils.logScreenshot();
            CommonUtils.clickOnElement(NativeViewCHARMSDashboardPage.nativeViewnewScreenerReceivedLocator(ras_Screener_TestDataManager.PARTICIPANT_FIRST_NAME + " " + ras_Screener_TestDataManager.PARTICIPANT_LAST_NAME));
        } else if (sheetName.contentEquals("screenerScenarioAge14-17")) {
            CommonUtils.hoverOverElement(participantDetailsPage.dynamicRecordButtonLocator(ras_Screener_TestDataManager.PARTICIPANT_FIRST_NAME + " " + ras_Screener_TestDataManager.PARTICIPANT_LAST_NAME));
            CucumberLogUtils.logScreenshot();
            CommonUtils.clickOnElement(NativeViewCHARMSDashboardPage.nativeViewnewScreenerReceivedLocator(ras_Screener_TestDataManager.PARTICIPANT_FIRST_NAME + " " + ras_Screener_TestDataManager.PARTICIPANT_LAST_NAME));
        }
        CommonUtils.sleep(1000);
        if (CommonUtils.isElementDisplayed(nativeViewCHARMSDashboardPage.rasStudyOpenRecordButton)) {
            CucumberLogUtils.logScreenshot();
            CommonUtils.clickOnElement(nativeViewCHARMSDashboardPage.rasStudyOpenRecordButton);
        }
        JavascriptUtils.scrollIntoView(nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsConsentsTab);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsConsentsTab);
        CommonUtils.hoverOverElement(locateByXpath("//td[normalize-space()='" + consentType + "']"));
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsConsentsPreviewButton);
        CommonUtils.waitForVisibility(nativeViewCHARMSDashboardPage.rasStudyOpenRecordButton);
        CommonUtils.sleep(500);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(nativeViewCHARMSDashboardPage.rasStudyOpenRecordButton);
        CommonUtils.waitForClickability(nativeViewCHARMSParticipantConsentPage.rasStudyConsentSignAndCompleteButton);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentSignAndCompleteButton);
        CommonUtils.sleep(2000);
        CucumberLogUtils.logScreenshot();
        CommonUtils.waitForClickability(locateByXpath("//button[@title='Back']"));
        CommonUtils.clickOnElement(locateByXpath("//button[@title='Back']"));
        CommonUtils.sleep(1000);
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.scrollIntoView(nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsConsentsTab);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsConsentsTab);
        CucumberLogUtils.logScreenshot();
        CommonUtils.assertEquals(locateByXpath("//td[normalize-space()='" + consentStatus + "']").getText(), consentStatus);
        CommonUtils.assertEquals(locateByXpath("//td[normalize-space()='" + consentType + "']").getText(), consentType);
        CommonUtils.assertEquals(locateByXpath("//td[normalize-space()='" + responseType + "']").getText(), responseType);
        CucumberLogUtils.logScreenshot();
        ServiceNow_Common_Methods.logOutOfNativeView();
    }

    /**
     * THIS METHOD WILL VERIFY THAT THE CONSENT WIDGET DISPLAYS ON THE PARTICIPANT PORTAL AND WHEN CLICKED VERIFIES THAT THE CONSENT FORM PDF WAS DOWNLOADED
     *
     * @param expectedDownloadStudyText The expected text to be shown on the participant portal.
     * @param pdfName                   The name of the PDF file to be downloaded.
     */
    @Given("{string} text shows on participant portal and when clicked downloads {string}")
    public static void text_shows_on_participant_portal_and_when_clicked_downloads_consent_form(String expectedDownloadStudyText, String pdfName) {
        CommonUtils.webDriver.navigate().refresh();
        dynamicModuleLocator(expectedDownloadStudyText);
        CommonUtils.waitForVisibility(dynamicModuleLocator(expectedDownloadStudyText));
        CommonUtils.assertEquals(dynamicModuleLocator(expectedDownloadStudyText).getText(), expectedDownloadStudyText);
        CommonUtils.waitForClickability(dynamicModuleLocator(expectedDownloadStudyText));
        String pdfUrl = dynamicModuleLocator(expectedDownloadStudyText).getAttribute("href");
        dynamicModuleLocator(expectedDownloadStudyText).click();
        CucumberLogUtils.logScreenshot();
        String downloadPath = System.getProperty("user.dir") + "/src/test/resources/" + pdfName + ".pdf";
        CucumberLogUtils.scenario.log("* * * * * DOWNLOADING " + pdfName.toUpperCase() + " PDF * * * * *");
        CucumberLogUtils.logScreenshot();
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
        CommonUtils.assertTrue(downloadedFile.exists());
        if (downloadedFile.delete()) {
            CucumberLogUtils.scenario.log("* * * * * " + pdfName.toUpperCase() + " PDF DELETED SUCCESSFULLY * * * * *");
        } else {
            CucumberLogUtils.scenario.log("* * * * * FAILED TO DELETE " + pdfName.toUpperCase() + "  PDF * * * * *");
        }
    }

    /**
     * Submits and verifies the consent in native view for a specified sheet name, consent status, consent type, and response type.
     *
     * @param sheetName     the name of the sheet for which the consent is being processed
     * @param consentStatus the expected status of the consent
     * @param consentType   the expected type of the consent
     * @param responseType  the expected response type of the consent
     */
    @When("the consent is submitted for {string} and {string} {string} {string} is verified in Native View")
    public void the_consent_is_submitted_for_and_is_verified_in_native_view(String sheetName, String consentStatus, String consentType, String responseType) {
        CommonUtils.sleep(20000);
        ras_Screener_TestDataManager.dataInitializerRasScreener(sheetName);
        RAS_Common_Methods.nativeViewConsentFlowProcessScenario1Parameterized(sheetName, consentStatus, consentType, responseType);
    }

    /**
     * Logs in a Study Team member to the Native View and completes a consent call.
     *
     * @param sheetName                                the name of the sheet for which the consent is being processed
     * @param consentType                              the expected type of the consent
     * @param responseType                             the expected response type of the consent
     * @param parentGuardianStatus                     the status of the parent/guardian for the consent
     * @param numberOfGuardianSignaturesRequired       the number of guardian signatures required for the consent
     * @param numberOfParentGuardianSignaturesReceived the number of parent/guardian signatures received for the consent
     */
    @Then("Study Team member logs in to Native View and completes consent call {string}, {string}, {string}, {string}, {string}, {string}")
    public void study_team_member_logs_in_to_native_view_and_completes_consent_call(String sheetName, String consentType, String responseType, String parentGuardianStatus, String numberOfGuardianSignaturesRequired, String numberOfParentGuardianSignaturesReceived) {
        nativeViewConsentAssentFlowProcess(sheetName, consentType, responseType, parentGuardianStatus, numberOfGuardianSignaturesRequired, numberOfParentGuardianSignaturesReceived);
    }

    /**
     * Study Team member logs in to Native View and verifies that the field Assent signed is true.
     *
     * @param sheetName the name of the sheet for which the field Assent signed is being verified.
     */
    @Then("Study Team member logs in to Native View and verifies that the field Assent signed is true {string}")
    public void study_team_member_logs_in_to_native_view_and_verifies_that_the_field_assent_signed_is_true(String sheetName) {
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        navigateToParticipantRecordInNativeView(sheetName);
        JavascriptUtils.scrollIntoView(nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsConsentsTab);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsConsentsTab);
        CommonUtils.hoverOverElement(locateByXpath("//td[normalize-space()='Awaiting Patient Signature(s)']"));
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsConsentsPreviewButton);
        CommonUtils.waitForVisibility(nativeViewCHARMSDashboardPage.rasStudyOpenRecordButton);
        CommonUtils.sleep(500);
        JavascriptUtils.scrollIntoView(nativeViewCHARMSParticipantConsentPage.rasStudyAssentSignedCheckBox);
        CommonUtils.assertTrue(nativeViewCHARMSParticipantConsentPage.rasStudyHiddenAssentSignedInput.isSelected());
        CommonUtils.sleep(200);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * Logs out the participant from the RAS portal.
     */
    @Then("participant logs out of RAS portal")
    public void participant_logs_out_of_ras_portal() {
        ServiceNow_Common_Methods.logOutOfNativeView();
    }

    /**
     * Logs out the study team member from Native View.
     */
    @Then("Study Team member logs out of Native View")
    public static void nativeViewStudyTeamMemberLogsOut() {
        ServiceNow_Common_Methods.logOutOfNativeView();
    }

    /**
     * Study Team member logs in to Native View and navigates to participant's record using the specified sheet name.
     *
     * @param sheetName the name of the sheet corresponding to the participant's record
     */
    @When("Study Team member logs in to Native View and navigates to participant's record {string}")
    public void study_team_member_logs_in_to_native_view_and_navigates_to_participant_s_record(String sheetName) {
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        navigateToParticipantRecordInNativeView(sheetName);
    }

    /**
     * Study Team member submits a participant for review and marks them as eligible for further processing.
     * This method triggers the submission process and eligibility marking within the study team workflow.
     */
    @When("Study Team member submits participant for review and marks them eligible")
    public void study_team_member_submits_participant_for_review_and_marks_them_eligible() {
        submitParticipantForReviewAndEligibility();
    }

    /**
     * Study Team member logs in to Native View and verifies that a new screener has been submitted.
     *
     * @param sheetName the name of the sheet corresponding to the new screener submitted
     */
    @Then("Study Team member logs in to Native View and verifies that a new screener has been submitted {string}")
    public void study_team_member_logs_in_to_native_view_and_verifies_that_a_new_screener_has_been_submitted(String sheetName) {
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
        if (sheetName.equals("screenerScenarioAdult")) {
            CommonUtils.assertEquals(locateByXpath("//td[normalize-space()='" + ras_Screener_TestDataManager.FIRST_NAME + " " + ras_Screener_TestDataManager.LAST_NAME + "']/following-sibling::td[4]").getText(), "New Screener Received");
        } else {
            CommonUtils.assertEquals(locateByXpath("//td[normalize-space()='" + ras_Screener_TestDataManager.PARTICIPANT_FIRST_NAME + " " + ras_Screener_TestDataManager.PARTICIPANT_LAST_NAME + "']/following-sibling::td[4]").getText(), "New Screener Received");
        }
    }

    /**
     * Study Team member navigates to the Consent Record and selects the response type and interpreter used for the consent record.
     * Verifies that two new fields, Interpreter Name or ID and Interpreter Language, display on the page.
     *
     * @param responseType            the response type to be selected
     * @param interpreterUsed         the interpreter used selection
     * @param interpreterNameOrIdText the text for Interpreter Name or ID field
     * @param interpreterLanguageText the text for Interpreter Language field
     */
    @Then("Study Team member navigates to the Consent Record and selects {string} for the response type, {string} for Interpreter Used, and verifies that two new fields {string} and {string} display")
    public void study_team_member_navigates_to_the_consent_record_and_selects_for_the_response_type_for_interpreter_used_and_verifies_that_two_new_fields_and_display(String responseType, String interpreterUsed, String interpreterNameOrIdText, String interpreterLanguageText) {
        JavascriptUtils.scrollIntoView(nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsConsentsTab);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsConsentsTab);
        CommonUtils.hoverOverElement(participantDetailsPage.consentStatusText);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsConsentsPreviewButton);
        CommonUtils.waitForVisibility(nativeViewCHARMSDashboardPage.rasStudyOpenRecordButton);
        CommonUtils.sleep(500);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(nativeViewCHARMSDashboardPage.rasStudyOpenRecordButton);
        CommonUtils.waitForClickability(nativeViewCHARMSParticipantConsentPage.rasStudyConsentResponseTypeDropDown);
        CommonUtils.selectDropDownValue(responseType, nativeViewCHARMSParticipantConsentPage.rasStudyConsentResponseTypeDropDown);
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantConsentPage.rasStudyConsentInterpreterUsedDropDown);
        CommonUtils.waitForClickability(nativeViewCHARMSParticipantConsentPage.rasStudyConsentInterpreterUsedDropDown);
        CucumberLogUtils.logScreenshot();
        CommonUtils.assertEquals(locateByXpath("//span[normalize-space()='Interpreter used?']").getText(), "Interpreter used?");
        CommonUtils.assertTrue(locateByXpath("//span[normalize-space()='Interpreter used?']").isDisplayed());
        CommonUtils.assertTrue(nativeViewCHARMSParticipantConsentPage.rasStudyConsentInterpreterUsedDropDown.isDisplayed());
        CommonUtils.assertTrue(nativeViewCHARMSParticipantConsentPage.rasStudyConsentInterpreterUsedDropDown.isEnabled());
        CommonUtils.selectDropDownValue(interpreterUsed, nativeViewCHARMSParticipantConsentPage.rasStudyConsentInterpreterUsedDropDown);
        CucumberLogUtils.logScreenshot();
        CommonUtils.waitForVisibility(locateByXpath("//span[normalize-space()='Interpreter Name or ID']"));
        CommonUtils.assertEquals(locateByXpath("//span[normalize-space()='Interpreter Name or ID']").getText(), interpreterNameOrIdText);
        CommonUtils.assertTrue(locateByXpath("//span[normalize-space()='Interpreter Name or ID']").isDisplayed());
        CommonUtils.assertTrue(nativeViewCHARMSParticipantConsentPage.rasStudyConsentInterpreterNameOrIdTextField.isDisplayed());
        CommonUtils.assertTrue(nativeViewCHARMSParticipantConsentPage.rasStudyConsentInterpreterNameOrIdTextField.isEnabled());
        nativeViewCHARMSParticipantConsentPage.rasStudyConsentInterpreterNameOrIdTextField.sendKeys("FirstName LastName");
        CommonUtils.waitForVisibility(locateByXpath("//span[normalize-space()='Interpreter Language']"));
        CommonUtils.assertEquals(locateByXpath("//span[normalize-space()='Interpreter Language']").getText(), interpreterLanguageText);
        CommonUtils.assertTrue(locateByXpath("//span[normalize-space()='Interpreter Language']").isDisplayed());
        CommonUtils.assertTrue(nativeViewCHARMSParticipantConsentPage.rasStudyConsentInterpreterLanguageTextField.isDisplayed());
        CommonUtils.assertTrue(nativeViewCHARMSParticipantConsentPage.rasStudyConsentInterpreterLanguageTextField.isEnabled());
        nativeViewCHARMSParticipantConsentPage.rasStudyConsentInterpreterLanguageTextField.sendKeys("English");
        CucumberLogUtils.logScreenshot();
    }


    /**
     * Logs in a Study Team member to the Native View and completes a consent call.
     *
     * @param sheetName the name of the sheet for which the consent is being processed
     */
    @When("Study Team member logs in to Native View and completes consent call {string} {string}")
    public void study_team_member_logs_in_to_Native_View_and_completes_consent_call(String sheetName, String consentRecordSheetName) {
        ras_NV_Consent_Record_TestDataManager.dataInitializerRasConsentRecord(consentRecordSheetName);
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        navigateToParticipantRecordInNativeView(sheetName);
        submitParticipantForReviewAndEligibility();
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
        if (ras_NV_Consent_Record_TestDataManager.RESPONSE_TYPE != null) {
            CommonUtils.clickOnElement(nativeViewCHARMSDashboardPage.rasStudyOpenRecordButton);
            CommonUtils.waitForClickability(nativeViewCHARMSParticipantConsentPage.rasStudyConsentResponseTypeDropDown);
            CommonUtils.selectDropDownValue(ras_NV_Consent_Record_TestDataManager.RESPONSE_TYPE, nativeViewCHARMSParticipantConsentPage.rasStudyConsentResponseTypeDropDown);
        }
    }

    /**
     * Study Team member logs in to Native View and navigates to All Participant Details.
     * This method is responsible for performing the steps to log in to the Native View as a Study Team member
     * and navigating to the All Participant Details page.
     * It first logs in using the nativeViewSideDoorLogin method from ServiceNow_Login_Methods class.
     * Then it sleeps for 4 seconds before waiting for the visibility of the filterNavigatorTextBox element
     * on the Native View SideDoor Dashboard page.
     * The method uses the filterNavigatorTextBox element to enter "All Participant Details",
     * logs a screenshot using CucumberLogUtils, then sleeps for 3 seconds.
     * After that, it clicks on the allParticipantDetailsLink element, sleeps for 3 seconds again,
     * switches to the nativeViewiFrame frame, sleeps for 2 seconds, and finally logs another screenshot.
     */
    @Given("Study Team member logs in to Native View and navigates to All Participant Details")
    public void study_team_member_logs_in_to_native_view_and_navigates_to_all_participant_details() {
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
    }

    /**
     * Given method to simulate a study team member clicking on the "Add New Participant" button and completing the form with provided details.
     *
     * @param study                 The study to be entered in the form.
     * @param relationshipToProband The relationship to the proband to be selected from the dropdown.
     * @param firstName             The first name of the participant to be entered in the form.
     * @param lastName              The last name of the participant to be entered in the form.
     */
    @Given("Study Team member clicks Add New Participant and completes the form with:  FSID {string}, Study {string}, Relationship to Proband {string}, First Name {string}, Last Name {string}")
    public void study_team_member_clicks_add_new_participant_and_completes_the_form(String existingFSID, String study, String relationshipToProband, String firstName, String lastName) {
        CommonUtils.waitForClickability(nativeViewCHARMSDashboardPage.nativeViewAddNewParticipantButton);
        nativeViewCHARMSDashboardPage.nativeViewAddNewParticipantButton.click();
        CucumberLogUtils.logScreenshot();
        if (!existingFSID.isEmpty()) {
            nativeViewCHARMSAddNewParticipantPage.isThereAnExistingFSIDCheckbox.click();
            CommonUtils.waitForVisibility(nativeViewCHARMSAddNewParticipantPage.FSIDToUseTextBox);
            CommonUtils.sendKeys(nativeViewCHARMSAddNewParticipantPage.FSIDToUseTextBox, existingFSID);
        }
        CommonUtils.clickOnElement(nativeViewCHARMSAddNewParticipantPage.unlockStudiesButton);
        CommonUtils.waitForClickability(nativeViewCHARMSAddNewParticipantPage.studiesTextBox);
        CommonUtils.sendKeys(nativeViewCHARMSAddNewParticipantPage.studiesTextBox, study);
        CommonUtils.sendKeys(nativeViewCHARMSAddNewParticipantPage.studiesTextBox, Keys.ENTER);
        CucumberLogUtils.logScreenshot();
        CommonUtils.waitForClickability(nativeViewCHARMSAddNewParticipantPage.relationshipToProbandDropdown);
        CommonUtils.selectDropDownValue(relationshipToProband, nativeViewCHARMSAddNewParticipantPage.relationshipToProbandDropdown);
        if (existingFSID.isEmpty() && (relationshipToProband.equals("Other") || relationshipToProband.equals("Unknown"))) {
            CommonUtils.waitForVisibility(nativeViewCHARMSAddNewParticipantPage.warningFSIDWillNotGenerateForOtherOrUnknownRelationshipText);
            CommonUtils.assertEquals(nativeViewCHARMSAddNewParticipantPage.warningFSIDWillNotGenerateForOtherOrUnknownRelationshipText.getText(), "WARNING: FSID will not generate for Other or Unknown relationship. But if you have an existing FSID, you may go ahead to enter below and save the data.");
            CucumberLogUtils.logScreenshot();
        }
        CommonUtils.scrollIntoView(nativeViewCHARMSAddNewParticipantPage.firstNameTextBox);
        CommonUtils.sendKeys(nativeViewCHARMSAddNewParticipantPage.firstNameTextBox, firstName);
        CommonUtils.sendKeys(nativeViewCHARMSAddNewParticipantPage.lastNameTextBox, lastName);
        CommonUtils.clickOnElement(nativeViewCHARMSAddNewParticipantPage.saveRecordAndRemainHereButton);
        if (existingFSID.isEmpty() && (relationshipToProband.equals("Other") || relationshipToProband.equals("Unknown"))) {
            CommonUtils.waitForVisibility(nativeViewCHARMSAddNewParticipantPage.errorNewParticipantDataWillNOTBeSavedForOtherOrUnknownRelationshipText);
            CommonUtils.assertEquals(nativeViewCHARMSAddNewParticipantPage.errorNewParticipantDataWillNOTBeSavedForOtherOrUnknownRelationshipText.getText(), "ERROR: New participant data will NOT be saved for Other or Unknown relationship");
            CommonUtils.assertEquals(nativeViewCHARMSAddNewParticipantPage.subjectIDTextBox.getAttribute("value"), "");
            CommonUtils.assertEquals(nativeViewCHARMSAddNewParticipantPage.firstNameTextBox.getAttribute("value"), "");
            CucumberLogUtils.logScreenshot();
        } else {
            CommonUtils.waitForVisibility(nativeViewCHARMSAddNewParticipantPage.familyIDTextBox);
            CommonUtils.assertEquals(nativeViewCHARMSAddNewParticipantPage.subjectIDTextBox.getAttribute("value").split("-")[0], nativeViewCHARMSAddNewParticipantPage.familyIDTextBox.getAttribute("value"));
            CucumberLogUtils.logScreenshot();
        }
    }

    /**
     * This method represents the functionality where a Study Team member deletes a record in order to prepare for re-running a test.
     * The method triggers the deletion of a record by clicking on the "delete" button and accepting the alert prompt that follows.
     * In case of any exceptions during the deletion process, they are caught and no action is taken.
     * Additionally, a screenshot of the current view is logged for reference using the CucumberLogUtils after the deletion process.
     */
    @Given("Study Team member deletes record so that the test can be run again")
    public void study_team_member_deletes_record_so_that_the_test_can_be_run_again() {
        try {
            nativeViewCHARMSAddNewParticipantPage.deleteRecordButton.click();
            CommonUtils.acceptAlert();
        } catch (Exception e) {
        }
        CucumberLogUtils.logScreenshot();
    }
}