package CHARMS.Steps;

import CHARMS.Constants.CHARMSRASScreenerConstants;
import CHARMS.Constants.CHARMS_Data_File_Path_Constants;
import CHARMS.Constants.Native_View_Constants;
import CHARMS.Pages.NativeViewCHARMSDashboardPage;
import DEPRECATED.COVIDDash.Utils.COVIDConstants;
import APPS_COMMON.PageInitializers.PageInitializer;
import APPS_COMMON.Pages.NativeView_SideDoor_Dashboard_Page;
import APPS_COMMON.Utils.ServiceNow_Login_Methods;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import static Hooks.Hooks.softAssert;
import static APPS_COMMON.Pages.Selenium_Common_Locators.locateByXpath;
import static APPS_COMMON.Pages.Selenium_Common_Locators.locateElementsByXpath;

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
        CommonUtils.sleep(2000);
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
        softAssert.assertEquals(nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsSubjectID.getText().split("-")[0], nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsFamilyID.getText());
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsMarkEligibleButton);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsMarkEligibleButton);
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsConsentAddedText);
        CucumberLogUtils.logScreenshot();
        softAssert.assertEquals(nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsConsentAddedText.getText(), CHARMSRASScreenerConstants.CONSENT_ADDED_TEXT, "---- VERIFYING SCREENER RECORD RASOPATHY HISTORY DATA ----");
        softAssert.assertEquals(nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsConsentAddedText.getText(), CHARMSRASScreenerConstants.CONSENT_ADDED_TEXT, "---- VERIFYING SCREENER RECORD RASOPATHY HISTORY DATA ----");
        CommonUtils.sleep(2000);
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
        CommonUtils.selectDropDownValue(responseType, nativeViewCHARMSParticipantConsentPage.rasStudyConsentCollectionMethodDropDown);
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
            CucumberLogUtils.logScreenshot();
        }
        if (!consentType.equalsIgnoreCase("Adult")) {
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
        if (!responseType.equalsIgnoreCase("iMed")) {
            CucumberLogUtils.scenario.log("* * * * CONSENT/ASSENT OBTAINED BEFORE STUDY PROCEDURES * * * *");
            CommonUtils.selectDropDownValue("Yes", nativeViewCHARMSParticipantConsentPage.rasStudyConsentConsentAssentObtainedBeforeStudyProceduresDropDown);
            CucumberLogUtils.scenario.log("* * * * COPY OF SIGNED/DATED CONSENT/ASSENT GIVEN TO PARTICIPANT * * * *");
            CommonUtils.selectDropDownValue("Yes", nativeViewCHARMSParticipantConsentPage.rasStudyConsentCopyOfSignedDatedConsentAssentGivenToParticipantDropDown);
        }
        CommonUtils.waitForClickability(nativeViewCHARMSParticipantConsentPage.rasStudyConsentAddFileButton);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentAddFileButton);
        CucumberLogUtils.logScreenshot();
        CommonUtils.sleep(5000);
        JavascriptUtils.uploadFileToHiddenFieldWithInputTag(nativeViewCHARMSParticipantConsentPage.rasStudyConsentChoseFileButton, CHARMS_Data_File_Path_Constants.FAMILY_COHORT_STUDY_PDF_PATH);
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
     * Retrieves the formatted string representation of the first day of the next month based on the current system date.
     *
     * @return A string representing the first day of the next month formatted as 'MM/dd/yyyy'.
     */
    public static String getFirstDayNextMonth() {
        LocalDate currentDate = LocalDate.now();
        LocalDate firstDayOfNextMonth = currentDate.plusMonths(1).withDayOfMonth(1);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        return firstDayOfNextMonth.format(formatter);
    }

    /**
     * Verifying data and order of Subject Flags.
     */
    public static void verifySubjectFlagsColumns() {
        for (int i = 0; i < Native_View_Constants.subjectFlagsColumns.size(); i++) {
            softAssert.assertEquals(Native_View_Constants.subjectFlagsColumns.get(i), locateByXpath("//tr[@id='hdr_x_naci_family_coho_participant_study.x_naci_family_coho_subject_flag.participant_study']//th[@class='text-align-left list_header_cell list_hdr '][" + (i + 1) + "]").getText());
        }
    }

    /**
     * Generates a random sleep interval between the specified minimum and maximum values.
     *
     * @param min The minimum value for the sleep interval.
     * @param max The maximum value for the sleep interval.
     */
    public static void randomSleepInterval(int min, int max) {
        CommonUtils.sleep(ThreadLocalRandom.current().nextInt(min, max + 1));
    }

    /**
     * Uses softAssert to verify that the expected dropdown value is selected.
     *
     * @param element       The WebElement representing the dropdown element.
     * @param expectedValue The expected value that should be selected in the dropdown.
     * @param errorMessage  The message to be displayed in case of assertion failure.
     */
    public static void softAssertDropDownValueIsSelected(WebElement element, String expectedValue, String errorMessage) {
        Select select = new Select(element);
        softAssert.assertEquals(select.getFirstSelectedOption().getText(), expectedValue, errorMessage);
    }

    /**
     * Verifies that the dropdown element contains the expected list of options.
     *
     * @param element                 The WebElement representing the dropdown element to verify.
     * @param expectedDropdownOptions The list of expected dropdown options to match against.
     * @param errorMessage            The error message to display if the verification fails.
     */
    public static void softAssertDropdownOptions(WebElement element, List<String> expectedDropdownOptions, String errorMessage) {
        Select select = new Select(element);
        List<String> actualDropdownOptions = new ArrayList<>();
        for (WebElement option : select.getOptions()) {
            actualDropdownOptions.add(option.getText());
        }
        softAssert.assertEquals(actualDropdownOptions, expectedDropdownOptions, errorMessage);
    }

    /**
     * Verifies the subject flags fields.
     *
     * @param participationStatus The participation status of the subject.
     * @param study               The study associated with the subject.
     */
    public static void verifySubjectFlagsFields(String study, String participationStatus) {
        if (participationStatus.equalsIgnoreCase("Not Participating")) {
            RAS_Common_Methods.softAssertDropdownOptions(nativeViewCHARMSSubjectFlagsPage.nonParticipationReasonDropdown, Native_View_Constants.nonParticipationDropdownOptions, "---- VERIFYING NON-PARTICIPATION REASON DROPDOWN OPTIONS ----");
        } else if (participationStatus.equalsIgnoreCase("Hold")) {
            softAssert.assertTrue(locateByXpath("//span[normalize-space()='Hold Reason']").isDisplayed());
            softAssert.assertTrue(locateByXpath("//div[@id='label.x_naci_family_coho_subject_flag.hold_non_participation_date']//span[2]").isDisplayed());
        }
        RAS_Common_Methods.softAssertDropdownOptions(nativeViewCHARMSSubjectFlagsPage.participationStatusDropdown, Native_View_Constants.participationStatusDropdownOptions, "---- VERIFYING PARTICIPATION STATUS DROPDOWN OPTIONS ----");
        RAS_Common_Methods.softAssertDropdownOptions(nativeViewCHARMSSubjectFlagsPage.ageGroupDropdown, Native_View_Constants.ageGroupDropdownOptions, "---- VERIFYING AGE GROUP DROPDOWN OPTIONS ----");
        RAS_Common_Methods.softAssertDropdownOptions(nativeViewCHARMSSubjectFlagsPage.eligibleForClinicDropdown, Native_View_Constants.eligibleForClinicDropdownOptions, "---- VERIFYING ELIGIBILITY FOR CLINIC DROPDOWN OPTIONS ----");
        RAS_Common_Methods.softAssertDropdownOptions(nativeViewCHARMSSubjectFlagsPage.individualAffectedStatusDropdown, Native_View_Constants.individualAffectedStatusDropdownOptions, "---- VERIFYING INDIVIDUAL AFFECTED DROPDOWN OPTIONS ----");
        RAS_Common_Methods.softAssertDropdownOptions(nativeViewCHARMSSubjectFlagsPage.individualGeneticStatusDropdown, Native_View_Constants.individualGeneticStatusDropdownOptions, "---- VERIFYING INDIVIDUAL GENETIC STATUS DROPDOWN OPTIONS ----");
        RAS_Common_Methods.softAssertDropdownOptions(nativeViewCHARMSSubjectFlagsPage.familyGeneticStatusDropdown, Native_View_Constants.familyGeneticStatusDropdownOptions, "---- VERIFYING FAMILY GENETIC STATUS STATUS DROPDOWN OPTIONS ----");
        if (study.equalsIgnoreCase("Fanconi") || study.equalsIgnoreCase("Bone Marrow Failure Syndrome")) {
            RAS_Common_Methods.softAssertDropdownOptions(nativeViewCHARMSSubjectFlagsPage.IBMFSAffectedStatusDropDown, Native_View_Constants.IBMFSAffectedStatusDropdownOptions, "---- VERIFYING IBMFS AFFECTED STATUS DROPDOWN OPTIONS ----");
        }
    }

    /**
     * Retrieves a list of web elements representing the columns in the NV table list view.
     *
     * @return a List of WebElement objects representing the columns in the NV table list view
     */
    public static List<String> getTableListViewColumns() {
        List<WebElement> columns = locateElementsByXpath("//th[@class='text-align-left list_header_cell list_hdr ']//a[@role='button']");
        List<String> tableListText = new ArrayList<>();
        columns.forEach(column -> tableListText.add(column.getText()));
        return tableListText;
    }
}