package ServiceNow.CHARMS.Steps;

import ServiceNow.CHARMS.Constants.CHARMSRASScreenerConstants;
import ServiceNow.CHARMS.Pages.NativeViewCHARMSDashboardPage;
import ServiceNow.COVIDDash.Utils.COVIDConstants;
import appsCommon.PageInitializers.PageInitializer;
import appsCommon.Pages.NativeView_SideDoor_Dashboard_Page;
import appsCommon.Utils.ServiceNow_Login_Methods;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import org.openqa.selenium.Keys;
import static Hooks.Hooks.softAssert;
import static appsCommon.Pages.Selenium_Common_Locators.locateByXpath;

public class RAS_Common_Methods extends PageInitializer {

    /**
     * Navigates to a specific participant record in Native View.
     *
     * @param sheetName The name of the sheet containing the data for the record.
     */
    public static void navigateToParticipantRecordInNativeView(String sheetName) {
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
        } else if (sheetName.contentEquals("screenerScenarioAdult")) {
            CommonUtils.hoverOverElement(participantDetailsPage.dynamicRecordButtonLocator(ras_Screener_TestDataManager.FIRST_NAME + " " + ras_Screener_TestDataManager.LAST_NAME));
            CucumberLogUtils.logScreenshot();
            CommonUtils.clickOnElement(NativeViewCHARMSDashboardPage.nativeViewnewScreenerReceivedLocator(ras_Screener_TestDataManager.FIRST_NAME + " " + ras_Screener_TestDataManager.LAST_NAME));
        } else if (sheetName.contentEquals("screenerScenarioAdult-NeedsLAR")) {
            CommonUtils.hoverOverElement(participantDetailsPage.dynamicRecordButtonLocator(ras_Screener_TestDataManager.PARTICIPANT_FIRST_NAME + " " + ras_Screener_TestDataManager.PARTICIPANT_LAST_NAME));
            CucumberLogUtils.logScreenshot();
            CommonUtils.clickOnElement(NativeViewCHARMSDashboardPage.nativeViewnewScreenerReceivedLocator(ras_Screener_TestDataManager.PARTICIPANT_FIRST_NAME + " " + ras_Screener_TestDataManager.PARTICIPANT_LAST_NAME));
        } else if (sheetName.contentEquals("screenerScenarioAgeUnder7")) {
            CommonUtils.hoverOverElement(participantDetailsPage.dynamicRecordButtonLocator(ras_Screener_TestDataManager.PARTICIPANT_FIRST_NAME + " " + ras_Screener_TestDataManager.PARTICIPANT_LAST_NAME));
            CucumberLogUtils.logScreenshot();
            CommonUtils.clickOnElement(NativeViewCHARMSDashboardPage.nativeViewnewScreenerReceivedLocator(ras_Screener_TestDataManager.PARTICIPANT_FIRST_NAME + " " + ras_Screener_TestDataManager.PARTICIPANT_LAST_NAME));
        } else if (sheetName.contentEquals("screenerScenarioAge7-10")) {
            CommonUtils.hoverOverElement(participantDetailsPage.dynamicRecordButtonLocator(ras_Screener_TestDataManager.PARTICIPANT_FIRST_NAME + " " + ras_Screener_TestDataManager.PARTICIPANT_LAST_NAME));
            CucumberLogUtils.logScreenshot();
            CommonUtils.clickOnElement(NativeViewCHARMSDashboardPage.nativeViewnewScreenerReceivedLocator(ras_Screener_TestDataManager.PARTICIPANT_FIRST_NAME + " " + ras_Screener_TestDataManager.PARTICIPANT_LAST_NAME));
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
    }

    /**
     * Submits the participant for review and eligibility.
     * This method performs the following steps:
     * - Sleeps for 2 seconds.
     * - Waits for the visibility of the "Submit for Eligibility" button in the participant details page.
     * - Logs a screenshot.
     * - Clicks on the "Submit for Eligibility" button.
     * - Sleeps for 1.5 seconds.
     * - Waits for the visibility of the "Mark Eligible" button in the participant details page.
     * - Logs a screenshot.
     * - Clicks on the "Mark Eligible" button.
     * - Waits for the visibility of the "Consent Added" text in the participant details page.
     * - Logs a screenshot.
     * - Asserts that the text of the "Consent Added" element is equal to the constant value "CONSENT_ADDED_TEXT" in the CHARMSRASScreenerConstants class.
     */
    public static void submitParticipantForReviewAndEligibility() {
        CommonUtils.sleep(2000);
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsSubmitForEligibilityButton);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsSubmitForEligibilityButton);
        CommonUtils.sleep(1500);
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsMarkEligibleButton);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsMarkEligibleButton);
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsConsentAddedText);
        CucumberLogUtils.logScreenshot();
        softAssert.assertEquals(nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsConsentAddedText.getText(), CHARMSRASScreenerConstants.CONSENT_ADDED_TEXT, "---- VERIFYING SCREENER RECORD RASOPATHY HISTORY DATA ----");
    }

    /**
     * Fills the parent/guardian signatures in the Native View consent form.
     *
     * @param responseType
     * @param parentGuardianStatus
     * @param numberOfGuardianSignaturesRequired
     * @param numberOfParentGuardianSignaturesReceived
     */
    public static void nativeViewFillParentGuardianSignatures(String responseType, String parentGuardianStatus, String numberOfGuardianSignaturesRequired, String numberOfParentGuardianSignaturesReceived) {
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantConsentPage.rasStudyConsentParentGuardianStatusDropDown);
        CommonUtils.waitForClickability(nativeViewCHARMSParticipantConsentPage.rasStudyConsentParentGuardianStatusDropDown);
        CommonUtils.selectDropDownValue(parentGuardianStatus, nativeViewCHARMSParticipantConsentPage.rasStudyConsentParentGuardianStatusDropDown);
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantConsentPage.rasStudyConsentNumberOfParentGuardianSignaturesRequiredDropDown);
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantConsentPage.rasStudyConsentParentGuardian1SignedDropDown);
        CommonUtils.waitForClickability(nativeViewCHARMSParticipantConsentPage.rasStudyConsentParentGuardian1SignedDropDown);
        JavascriptUtils.scrollIntoView(nativeViewCHARMSParticipantConsentPage.rasStudyConsentParentGuardian1SignedDropDown);
        if (responseType.equalsIgnoreCase("CHARMS e-consent")) {
            if (parentGuardianStatus.equalsIgnoreCase("Parents, Married")) {
                CommonUtils.selectDropDownValue("Pending", nativeViewCHARMSParticipantConsentPage.rasStudyConsentParentGuardian1SignedDropDown);
            } else if (parentGuardianStatus.equalsIgnoreCase("Parents, Separated - Joint Custody")) {
                CommonUtils.selectDropDownValue("Pending", nativeViewCHARMSParticipantConsentPage.rasStudyConsentParentGuardian1SignedDropDown);
                CommonUtils.selectDropDownValue("Pending", nativeViewCHARMSParticipantConsentPage.rasStudyConsentParentGuardian2SignedDropDown);
                CommonUtils.scrollIntoView(nativeViewCHARMSParticipantConsentPage.rasStudyConsentParentGuardian2SignedDropDown);
            } else if (parentGuardianStatus.equalsIgnoreCase("Parent, Separated or Widowed - Single Custody") && numberOfGuardianSignaturesRequired.equals("1")) {
                CommonUtils.selectDropDownValue(nativeViewCHARMSParticipantConsentPage.rasStudyConsentNumberOfParentGuardianSignaturesRequiredDropDown, numberOfGuardianSignaturesRequired);
                CommonUtils.selectDropDownValue("Pending", nativeViewCHARMSParticipantConsentPage.rasStudyConsentParentGuardian1SignedDropDown);
                CommonUtils.selectDropDownValue("N/A", nativeViewCHARMSParticipantConsentPage.rasStudyConsentParentGuardian2SignedDropDown);
                CommonUtils.scrollIntoView(nativeViewCHARMSParticipantConsentPage.rasStudyConsentParentGuardian2SignedDropDown);
            } else if (parentGuardianStatus.equalsIgnoreCase("Parent, Separated or Widowed - Single Custody") && numberOfGuardianSignaturesRequired.equals("2")) {
                CommonUtils.selectDropDownValue(nativeViewCHARMSParticipantConsentPage.rasStudyConsentNumberOfParentGuardianSignaturesRequiredDropDown, numberOfGuardianSignaturesRequired);
                CommonUtils.selectDropDownValue("Pending", nativeViewCHARMSParticipantConsentPage.rasStudyConsentParentGuardian1SignedDropDown);
                CommonUtils.selectDropDownValue("Pending", nativeViewCHARMSParticipantConsentPage.rasStudyConsentParentGuardian2SignedDropDown);
            } else if (parentGuardianStatus.equalsIgnoreCase("Other Legal Guardian - 1")) {
                CommonUtils.selectDropDownValue("Pending", nativeViewCHARMSParticipantConsentPage.rasStudyConsentParentGuardian1SignedDropDown);
            } else if (parentGuardianStatus.equalsIgnoreCase("Other Guardian - 2")) {
                CommonUtils.selectDropDownValue("Pending", nativeViewCHARMSParticipantConsentPage.rasStudyConsentParentGuardian1SignedDropDown);
                CommonUtils.selectDropDownValue("Pending", nativeViewCHARMSParticipantConsentPage.rasStudyConsentParentGuardian2SignedDropDown);
                CommonUtils.scrollIntoView(nativeViewCHARMSParticipantConsentPage.rasStudyConsentParentGuardian2SignedDropDown);
            }
        } else {
            if (numberOfParentGuardianSignaturesReceived.equals("1")) {
                CommonUtils.selectDropDownValue("Yes", nativeViewCHARMSParticipantConsentPage.rasStudyConsentParentGuardian1SignedDropDown);
            } else if (numberOfParentGuardianSignaturesReceived.equals("2")) {
                CommonUtils.selectDropDownValue("Yes", nativeViewCHARMSParticipantConsentPage.rasStudyConsentParentGuardian1SignedDropDown);
                CommonUtils.selectDropDownValue("Yes", nativeViewCHARMSParticipantConsentPage.rasStudyConsentParentGuardian2SignedDropDown);
            }
        }
        CucumberLogUtils.logScreenshot();
    }

    /**
     * Performs the consent flow process for a given scenario (iMed, Participant upload to portal, Mail/Fax/Email/Other)
     *
     * @param sheetName     The name of the sheet containing the scenario data.
     * @param consentStatus The consent status data.
     * @param consentType   The consent type data.
     * @param responseType  The response type data.
     */
    public static void nativeViewConsentFlowProcessScenario1Parameterized(String sheetName, String consentStatus, String consentType, String responseType) {
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
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeCalendar);
        CucumberLogUtils.logScreenshot();
        CucumberLogUtils.scenario.log("* * * * CONSENT CALL SCHEDULED TIME * * * *");
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeCalendar);
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeTodayButton);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeTodayButton);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeAcceptButton);
        CucumberLogUtils.scenario.log("* * * * CONSENT CALL DATE * * * *");
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleDateCalendar);
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeTodayButton);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeTodayButton);
        CucumberLogUtils.scenario.log("* * * * RESPONSE TYPE * * * *");
        CommonUtils.selectDropDownValue(responseType, nativeViewCHARMSParticipantConsentPage.rasStudyConsentResponseTypeDropDown);
        CucumberLogUtils.scenario.log("* * * * CONSENT CALL VERSION * * * *");
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleVersionCalendar);
        CommonUtils.waitForClickability(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleVersionCalendar);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleVersionCalendar);
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeTodayButton);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeTodayButton);
        CucumberLogUtils.scenario.log("* * * * CONSENT DATE * * * *");
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentDateCalendar);
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeTodayButton);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeTodayButton);
        CucumberLogUtils.scenario.log("* * * * CONSENTED BY * * * *");
        CommonUtils.waitForClickability(nativeViewCHARMSParticipantConsentPage.rasStudyConsentByTextBox);
        CommonUtils.sendKeys(nativeViewCHARMSParticipantConsentPage.rasStudyConsentByTextBox, CHARMSRASScreenerConstants.CONSENTED_BY_USER_NAME);
        CommonUtils.sendKeys(nativeViewCHARMSParticipantConsentPage.rasStudyConsentByTextBox, Keys.ENTER);
        CucumberLogUtils.scenario.log("* * * * CURRENT/PREVIOUS * * * *");
        CommonUtils.selectDropDownValue("Current", nativeViewCHARMSParticipantConsentPage.rasStudyConsentCurrentDropDown);
        CommonUtils.sleep(500);
        if (!responseType.equalsIgnoreCase("iMed")) {
            CucumberLogUtils.scenario.log("* * * * COPY OF CONSENT/ASSENT PROVIDED PROVIDED BEFORE SIGNING * * * *");
            CommonUtils.waitForClickability(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCopyOfConsentAssentProvidedDropDown);
            CommonUtils.selectDropDownValue("Yes", nativeViewCHARMSParticipantConsentPage.rasStudyConsentCopyOfConsentAssentProvidedDropDown);
            CucumberLogUtils.scenario.log("* * * * PROTOCOL DISCUSSED IN PRIVATE SETTING * * * *");
            CommonUtils.selectDropDownValue("Yes", nativeViewCHARMSParticipantConsentPage.rasStudyConsentProtocolDiscussedInPrivateSettingDropDown);
            CucumberLogUtils.scenario.log("* * * * PARTICIPANT VERBALIZED UNDERSTANDING OF STUDY CONDITIONS AND PARTICIPATION * * * *");
            CommonUtils.selectDropDownValue("Yes", nativeViewCHARMSParticipantConsentPage.rasStudyConsentParticipantVerbalizedUnderstandingOfStudyConditionsAndParticipationDropDown);
            CucumberLogUtils.scenario.log("* * * * QUESTIONS ADDRESSED BEFORE SIGNING * * * *");
            CommonUtils.selectDropDownValue("Yes", nativeViewCHARMSParticipantConsentPage.rasStudyConsentQuestionsAddressedBeforeSigningDropDown);
        }
        if(!consentType.equalsIgnoreCase("Adult")) {
            CommonUtils.waitForVisibility(nativeViewCHARMSParticipantConsentPage.rasStudyConsentConsentAssentStatusDropDown);
            CommonUtils.waitForClickability(nativeViewCHARMSParticipantConsentPage.rasStudyConsentConsentAssentStatusDropDown);
            CommonUtils.selectDropDownValue(nativeViewCHARMSParticipantConsentPage.rasStudyConsentConsentAssentStatusDropDown, 4);
        }
        CommonUtils.selectDropDownValue(nativeViewCHARMSParticipantConsentPage.rasStudyConsentFutureSpecimensAndDataDropDown, 4);
        CommonUtils.selectDropDownValue(nativeViewCHARMSParticipantConsentPage.rasStudyConsentFutureUseCollaboratorsDropDown, 4);
        CommonUtils.selectDropDownValue(nativeViewCHARMSParticipantConsentPage.rasStudyConsentFutureIdentifiableUseCollaboratorsDropDown, 4);
        CommonUtils.sleep(500);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallCompleteButton);
        CommonUtils.sleep(1000);
        CommonUtils.waitForClickability(nativeViewCHARMSParticipantConsentPage.rasStudyConsentAddFileButton);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentAddFileButton);
        CucumberLogUtils.logScreenshot();
        CommonUtils.sleep(5000);
        JavascriptUtils.uploadFileToHiddenFieldWithInputTag(nativeViewCHARMSParticipantConsentPage.rasStudyConsentChoseFileButton, COVIDConstants.IIQ_STUDY_DOCUMENTATION_PDF_PATH);
        CommonUtils.sleep(2000);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentChoseFileCloseButton);
        CommonUtils.waitForClickability(nativeViewCHARMSParticipantConsentPage.rasStudyConsentHardCopyReceivedButton);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentHardCopyReceivedButton);
        CommonUtils.waitForClickability(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCompletedConsentButton);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCompletedConsentButton);
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantConsentPage.rasStudyConsentParticipantRecordsReadyToProgressMessage);
        softAssert.assertEquals(nativeViewCHARMSParticipantConsentPage.rasStudyConsentParticipantRecordsReadyToProgressMessage.getText(), CHARMSRASScreenerConstants.PARTICIPANT_READY_TO_PROGRESS_TEXT, "---- VERIFYING PARTICIPANT RECORD READY TO PROGRESS MESSAGE ----");
        softAssert.assertEquals(nativeViewCHARMSParticipantConsentPage.rasStudyConsentConsentRecordCompletedMessageMessage.getText(), CHARMSRASScreenerConstants.CONSENT_RECORD_COMPLETED_TEXT, "---- VERIFYING CONSENT RECORD COMPLETED AND FAMILY RECORD IS NOW ACTIVE! MESSAGE ----");
        CommonUtils.sleep(500);
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
        RAS_All_Steps.nativeViewStudyTeamMemberLogsOut();
    }

    /**
     * Performs the consent flow process for a given scenario (iMed, Participant upload to portal, Mail/Fax/Email/Other)
     *
     * @param sheetName     The name of the sheet containing the scenario data.
     * @param consentType   The consent type data.
     * @param responseType  The response type data.
     */
    public static void nativeViewConsentAssentFlowProcess(String sheetName, String consentType, String responseType, String parentGuardianStatus, String numberOfGuardianSignaturesRequired, String numberOfParentGuardianSignaturesReceived) {
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
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeCalendar);
        CucumberLogUtils.logScreenshot();
        CucumberLogUtils.scenario.log("* * * * CONSENT CALL SCHEDULED TIME * * * *");
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeCalendar);
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeTodayButton);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeTodayButton);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeAcceptButton);
        CucumberLogUtils.scenario.log("* * * * CONSENT CALL DATE * * * *");
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleDateCalendar);
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeTodayButton);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeTodayButton);
        CucumberLogUtils.scenario.log("* * * * RESPONSE TYPE * * * *");
        CommonUtils.selectDropDownValue(responseType, nativeViewCHARMSParticipantConsentPage.rasStudyConsentResponseTypeDropDown);
        CucumberLogUtils.scenario.log("* * * * CONSENT CALL VERSION * * * *");
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleVersionCalendar);
        CommonUtils.waitForClickability(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleVersionCalendar);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleVersionCalendar);
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeTodayButton);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeTodayButton);
        CucumberLogUtils.scenario.log("* * * * CONSENT DATE * * * *");
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentDateCalendar);
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeTodayButton);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeTodayButton);
        CucumberLogUtils.scenario.log("* * * * CONSENTED BY * * * *");
        CommonUtils.waitForClickability(nativeViewCHARMSParticipantConsentPage.rasStudyConsentByTextBox);
        CommonUtils.sendKeys(nativeViewCHARMSParticipantConsentPage.rasStudyConsentByTextBox, CHARMSRASScreenerConstants.CONSENTED_BY_USER_NAME);
        CommonUtils.sendKeys(nativeViewCHARMSParticipantConsentPage.rasStudyConsentByTextBox, Keys.ENTER);
        CucumberLogUtils.scenario.log("* * * * CURRENT/PREVIOUS * * * *");
        CommonUtils.selectDropDownValue("Current", nativeViewCHARMSParticipantConsentPage.rasStudyConsentCurrentDropDown);
        CommonUtils.sleep(500);
        if (!responseType.equalsIgnoreCase("iMed")) {
            CommonUtils.waitForVisibility(nativeViewCHARMSParticipantConsentPage.rasStudyConsentConsentAssentStatusDropDown);
            CommonUtils.waitForClickability(nativeViewCHARMSParticipantConsentPage.rasStudyConsentConsentAssentStatusDropDown);
            CommonUtils.selectDropDownValue(nativeViewCHARMSParticipantConsentPage.rasStudyConsentConsentAssentStatusDropDown, 4);
        }
        nativeViewFillParentGuardianSignatures(responseType, parentGuardianStatus, numberOfGuardianSignaturesRequired, numberOfParentGuardianSignaturesReceived);
        CommonUtils.selectDropDownValue(nativeViewCHARMSParticipantConsentPage.rasStudyConsentFutureSpecimensAndDataDropDown, 4);
        CommonUtils.selectDropDownValue(nativeViewCHARMSParticipantConsentPage.rasStudyConsentFutureUseCollaboratorsDropDown, 4);
        CommonUtils.selectDropDownValue(nativeViewCHARMSParticipantConsentPage.rasStudyConsentFutureIdentifiableUseCollaboratorsDropDown, 4);
        CommonUtils.sleep(500);
        CucumberLogUtils.logScreenshot();
        CucumberLogUtils.scenario.log("* * * * COPY OF CONSENT/ASSENT PROVIDED PROVIDED BEFORE SIGNING * * * *");
        CommonUtils.waitForClickability(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCopyOfConsentAssentProvidedDropDown);
        CommonUtils.selectDropDownValue("Yes", nativeViewCHARMSParticipantConsentPage.rasStudyConsentCopyOfConsentAssentProvidedDropDown);
        CucumberLogUtils.logScreenshot();
        CucumberLogUtils.scenario.log("* * * * * CALL COMPLETE * * * * *");
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallCompleteButton);
        CommonUtils.sleep(1000);
        if (responseType.equalsIgnoreCase("Mail/Fax/Email/Other") || responseType.equalsIgnoreCase("iMed") || responseType.equalsIgnoreCase("Participant upload to portal")) {
            CommonUtils.waitForClickability(nativeViewCHARMSParticipantConsentPage.rasStudyConsentAddFileButton);
            CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentAddFileButton);
            CucumberLogUtils.logScreenshot();
            CommonUtils.sleep(5000);
            JavascriptUtils.uploadFileToHiddenFieldWithInputTag(nativeViewCHARMSParticipantConsentPage.rasStudyConsentChoseFileButton, COVIDConstants.IIQ_STUDY_DOCUMENTATION_PDF_PATH);
            CommonUtils.sleep(2000);
            CucumberLogUtils.logScreenshot();
            CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentChoseFileCloseButton);
            CommonUtils.waitForClickability(nativeViewCHARMSParticipantConsentPage.rasStudyConsentHardCopyReceivedButton);
            CucumberLogUtils.logScreenshot();
            CucumberLogUtils.scenario.log("* * * * COPY OF CONSENT/ASSENT PROVIDED PROVIDED BEFORE SIGNING * * * *");
            CommonUtils.waitForClickability(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCopyOfConsentAssentProvidedDropDown);
            CommonUtils.selectDropDownValue("Yes", nativeViewCHARMSParticipantConsentPage.rasStudyConsentCopyOfConsentAssentProvidedDropDown);
            CucumberLogUtils.logScreenshot();
            CucumberLogUtils.scenario.log("* * * * * CALL COMPLETE * * * * *");
            CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallCompleteButton);
        }
        CucumberLogUtils.logScreenshot();
    }

    public static void nativeViewConsentRecordCallSubmission(String sheetName) {
        if (sheetName.contentEquals("rasAdultConsentRecord")) {
        }
    }
}