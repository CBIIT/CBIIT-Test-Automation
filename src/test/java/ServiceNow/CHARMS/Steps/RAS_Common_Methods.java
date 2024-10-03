package ServiceNow.CHARMS.Steps;

import ServiceNow.CHARMS.Constants.CHARMSRASScreenerConstants;
import ServiceNow.CHARMS.Pages.NativeViewCHARMSDashboardPage;
import ServiceNow.COVIDDash.Utils.COVIDConstants;
import appsCommon.PageInitializers.PageInitializer;
import appsCommon.Pages.NativeView_SideDoor_Dashboard_Page;
import appsCommon.Utils.ServiceNow_Common_Methods;
import appsCommon.Utils.ServiceNow_Login_Methods;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import io.cucumber.java.en.Then;
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
        } else if (sheetName.contentEquals("screenerScenarioAge11-13")) {
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
        CommonUtils.assertEqualsWithMessage(nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsConsentAddedText.getText(), CHARMSRASScreenerConstants.CONSENT_ADDED_TEXT, "---- VERIFYING SCREENER RECORD RASOPATHY HISTORY DATA ----");
    }

    /**
     * Fills the parent/guardian signatures in the Native View consent form.
     *
     * @param parentGuardianStatus                     The status of the parent/guardian (e.g. "Yes", "No").
     * @param numberOfGuardianSignaturesRequired       The number of guardian signatures required for consent.
     * @param numberOfParentGuardianSignaturesReceived The number of parent/guardian signatures received.
     */
    public static void nativeViewFillParentGuardianSignatures(String responseType, String parentGuardianStatus, String numberOfGuardianSignaturesRequired, String numberOfParentGuardianSignaturesReceived) {
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantConsentPage.rasStudyConsentParentGuardianStatusDropDown);
        CommonUtils.waitForClickability(nativeViewCHARMSParticipantConsentPage.rasStudyConsentParentGuardianStatusDropDown);
        CommonUtils.selectDropDownValue(parentGuardianStatus, nativeViewCHARMSParticipantConsentPage.rasStudyConsentParentGuardianStatusDropDown);
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantConsentPage.rasStudyConsentNumberOfParentGuardianSignaturesRequiredDropDown);
        CommonUtils.selectDropDownValue(nativeViewCHARMSParticipantConsentPage.rasStudyConsentNumberOfParentGuardianSignaturesRequiredDropDown, numberOfGuardianSignaturesRequired);
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantConsentPage.rasStudyConsentParentGuardian1SignedDropDown);
        CommonUtils.waitForClickability(nativeViewCHARMSParticipantConsentPage.rasStudyConsentParentGuardian1SignedDropDown);
        if(responseType.equalsIgnoreCase("CHARMS e-consent")) {
            if(numberOfGuardianSignaturesRequired.equals("1")) {
//                CommonUtils.verifyingDropDownValueIsSelected(nativeViewCHARMSParticipantConsentPage.rasStudyConsentParentGuardian1SignedDropDown, "Pending", "* * * * * Parent/Guardian 1 Signed should default to Pending until the Consent form is signed * * * * *");
                CommonUtils.selectDropDownValue("Pending", nativeViewCHARMSParticipantConsentPage.rasStudyConsentParentGuardian1SignedDropDown);
            } else if(numberOfGuardianSignaturesRequired.equals("2")) {
                CommonUtils.verifyingDropDownValueIsSelected(nativeViewCHARMSParticipantConsentPage.rasStudyConsentParentGuardian1SignedDropDown, "Pending", "* * * * * Parent/Guardian 1 Signed should default to Pending until the Consent form is signed * * * * *");
                CommonUtils.verifyingDropDownValueIsSelected(nativeViewCHARMSParticipantConsentPage.rasStudyConsentParentGuardian2SignedDropDown, "Pending", "* * * * * Parent/Guardian 2 Signed should default to Pending until the Consent form is signed * * * * *");
            }
        } else {
            if (numberOfParentGuardianSignaturesReceived.equals("1")) {
                CommonUtils.selectDropDownValue("Yes", nativeViewCHARMSParticipantConsentPage.rasStudyConsentParentGuardian1SignedDropDown);
            }
        }
    }

    /**
     * Logs out the study team member from Native View.
     */
    @Then("Study Team member logs out of Native View")
    public static void nativeViewStudyTeamMemberLogsOut() {
        ServiceNow_Common_Methods.logOutOfNativeView();
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
        CommonUtils.selectDropDownValue(responseType, nativeViewCHARMSParticipantConsentPage.rasStudyConsentResponseTypeDropDown);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentDateCalendar);
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeTodayButton);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeTodayButton);
        CommonUtils.sendKeys(nativeViewCHARMSParticipantConsentPage.rasStudyConsentByTextBox, CHARMSRASScreenerConstants.CONSENTED_BY_USER_NAME);
        CommonUtils.sendKeys(nativeViewCHARMSParticipantConsentPage.rasStudyConsentByTextBox, Keys.ENTER);
        CommonUtils.selectDropDownValue(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCurrentDropDown, 1);
        CommonUtils.sleep(500);
        if (!responseType.equalsIgnoreCase("iMed")) {
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
        CommonUtils.assertEqualsWithMessage(nativeViewCHARMSParticipantConsentPage.rasStudyConsentParticipantRecordsReadyToProgressMessage.getText(), CHARMSRASScreenerConstants.PARTICIPANT_READY_TO_PROGRESS_TEXT, "---- VERIFYING PARTICIPANT RECORD READY TO PROGRESS MESSAGE ----");
        CommonUtils.assertEqualsWithMessage(nativeViewCHARMSParticipantConsentPage.rasStudyConsentConsentRecordCompletedMessageMessage.getText(), CHARMSRASScreenerConstants.CONSENT_RECORD_COMPLETED_TEXT, "---- VERIFYING CONSENT RECORD COMPLETED AND FAMILY RECORD IS NOW ACTIVE! MESSAGE ----");
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
        nativeViewStudyTeamMemberLogsOut();
    }

    /**
     * Performs the consent flow process for a given scenario (iMed, Participant upload to portal, Mail/Fax/Email/Other)
     *
     * @param sheetName     The name of the sheet containing the scenario data.
     * @param consentStatus The consent status data.
     * @param consentType   The consent type data.
     * @param responseType  The response type data.
     */
    public static void nativeViewConsentAssentFlowProcess(String sheetName, String consentStatus, String consentType, String responseType, String parentGuardianStatus, String numberOfGuardianSignaturesRequired, String numberOfParentGuardianSignaturesReceived) {
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
        CommonUtils.selectDropDownValue(responseType, nativeViewCHARMSParticipantConsentPage.rasStudyConsentResponseTypeDropDown);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentDateCalendar);
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeTodayButton);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeTodayButton);
        CommonUtils.sendKeys(nativeViewCHARMSParticipantConsentPage.rasStudyConsentByTextBox, CHARMSRASScreenerConstants.CONSENTED_BY_USER_NAME);
        CommonUtils.sendKeys(nativeViewCHARMSParticipantConsentPage.rasStudyConsentByTextBox, Keys.ENTER);
        CommonUtils.selectDropDownValue(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCurrentDropDown, 1);
        CommonUtils.sleep(500);
        if (!responseType.equalsIgnoreCase("iMed")) {
            CommonUtils.waitForVisibility(nativeViewCHARMSParticipantConsentPage.rasStudyConsentConsentAssentStatusDropDown);
            CommonUtils.waitForClickability(nativeViewCHARMSParticipantConsentPage.rasStudyConsentConsentAssentStatusDropDown);
            CommonUtils.selectDropDownValue(nativeViewCHARMSParticipantConsentPage.rasStudyConsentConsentAssentStatusDropDown, 4);
        }
        if(consentType.equalsIgnoreCase("Aged 11 - 13, signed assent required") && consentStatus.equalsIgnoreCase("CHARMS e-consent")) {

        }
        nativeViewFillParentGuardianSignatures(responseType, parentGuardianStatus, numberOfGuardianSignaturesRequired, numberOfParentGuardianSignaturesReceived);
        CommonUtils.selectDropDownValue(nativeViewCHARMSParticipantConsentPage.rasStudyConsentFutureSpecimensAndDataDropDown, 4);
        CommonUtils.selectDropDownValue(nativeViewCHARMSParticipantConsentPage.rasStudyConsentFutureUseCollaboratorsDropDown, 4);
        CommonUtils.selectDropDownValue(nativeViewCHARMSParticipantConsentPage.rasStudyConsentFutureIdentifiableUseCollaboratorsDropDown, 4);
        CommonUtils.sleep(500);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallCompleteButton);
        CommonUtils.sleep(1000);
        if (consentType.equalsIgnoreCase("Mail/Fax/Email/Other") || consentType.equalsIgnoreCase("iMed") || consentType.equalsIgnoreCase("Participant upload to portal")) {
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
        }
        CucumberLogUtils.logScreenshot();
    }
}
