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
import org.openqa.selenium.WebElement;
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
     * This method represents the step where the proxy clicks on the Study Consent and completes the consent form with the given password.
     *
     * @param password the password to be used for completing the form
     */
    @Given("proxy clicks on Study Consent and completes form with {string}")
    public void proxy_clicks_on_study_consent_and_completes_form_with(String password) {
        CommonUtils.waitForVisibility(myRASHomePage.rasopathyStudyConsent);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(myRASHomePage.rasopathyStudyConsent);
        CommonUtils.sleep(5000);
        CucumberLogUtils.logScreenshot();
        System.out.println("* * * * * PROXY FILLING OUT CONSENT FORM * * * * *");
        JavascriptUtils.scrollIntoView(locateByXpath("//input[@id='consent_read']"));
        WebElement readConsentCheckbox = locateByXpath("//input[@id='consent_read']");
        CommonUtils.waitForClickability(readConsentCheckbox);
        CommonUtils.clickOnElement(readConsentCheckbox);
        CucumberLogUtils.logScreenshot();
        WebElement IAmThisPersonRadioButton = locateByXpath("//input[@aria-label='Yes']");
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
        CommonUtils.sleep(500);
        CommonUtils.assertEquals(CommonUtils.getAlertText(), "To complete enrollment, please have your 11-13 year-old minor click through the \"Study Assent\" tile. If your minor declines participation, please contact the study team.");
        CommonUtils.acceptAlert();
        CommonUtils.sleep(500);
        CommonUtils.waitForVisibility(locateByXpath("//button[normalize-space()='OK']"));
        CommonUtils.clickOnElement(locateByXpath("//button[normalize-space()='OK']"));
        CommonUtils.sleep(500);
        CucumberLogUtils.logScreenshot();
        ServiceNow_Common_Methods.logOutOfNativeView();
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
     * This method represents the step where the participant clicks on Study Assent and completes the form with the provided password.
     *
     * @param password the password to be used for completing the form
     */
    @Given("participant clicks on Study Assent and completes form with {string}")
    public static void participant_clicks_on_Study_Assent_and_completes_form_with(String password) {
        CommonUtils.waitForVisibility(myRASHomePage.rasopathyStudyAssent);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(myRASHomePage.rasopathyStudyAssent);
        CommonUtils.sleep(3000);
        System.out.println("* * * * * PARTICIPANT FILLING OUT ASSENT FORM * * * * *");
        JavascriptUtils.scrollIntoView(locateByXpath("//input[@id='consent_read']"));
        WebElement readConsentCheckbox = locateByXpath("//input[@id='consent_read']");
        CommonUtils.assertEquals(locateByXpath("//b[contains(text(),'Yes, I have read and assent to the terms and condi')]").getText(), "Yes, I have read and assent to the terms and conditions.");
        CommonUtils.waitForClickability(readConsentCheckbox);
        CommonUtils.clickOnElement(readConsentCheckbox);
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
     * @param consentStatus                            the expected status of the consent
     * @param consentType                              the expected type of the consent
     * @param responseType                             the expected response type of the consent
     * @param parentGuardianStatus                     the status of the parent/guardian for the consent
     * @param numberOfGuardianSignaturesRequired       the number of guardian signatures required for the consent
     * @param numberOfParentGuardianSignaturesReceived the number of parent/guardian signatures received for the consent
     */
    @Then("Study Team member logs in to Native View and completes consent call {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void study_team_member_logs_in_to_native_view_and_completes_consent_call(String sheetName, String consentStatus, String consentType, String responseType, String parentGuardianStatus, String numberOfGuardianSignaturesRequired, String numberOfParentGuardianSignaturesReceived) {
        nativeViewConsentAssentFlowProcess(sheetName, consentStatus, consentType, responseType, parentGuardianStatus, numberOfGuardianSignaturesRequired, numberOfParentGuardianSignaturesReceived);
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
}