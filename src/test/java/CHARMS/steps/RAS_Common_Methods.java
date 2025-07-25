package CHARMS.steps;

import CHARMS.constants.CHARMSRASScreenerConstants;
import CHARMS.constants.CHARMS_Data_File_Path_Constants;
import CHARMS.constants.Native_View_Constants;
import CHARMS.pages.NativeViewCHARMSDashboardPage;
import APPS_COMMON.PageInitializers.PageInitializer;
import APPS_COMMON.Pages.NativeView_SideDoor_Dashboard_Page;
import APPS_COMMON.Utils.ServiceNow_Login_Methods;
import CHARMS.utils.CharmsUtil;
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
import static APPS_COMMON.Pages.Selenium_Common_Locators.*;
import static CHARMS.constants.CHARMSRASScreenerConstants.A_NEW_SUBJECT_ID_HAS_BEEN_GENERATED;
import static Hooks.Hooks.softAssert;

public class RAS_Common_Methods extends PageInitializer {

    /**
     * Navigates to a specific participant record in Native View.
     *
     * @param sheetName The name of the sheet containing the data for the record.
     */
    public static void navigateToParticipantRecordInNativeView(String sheetName) {
        ras_Screener_TestDataManager.dataInitializerRasScreener(sheetName);
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
            CommonUtils.hoverOverElement(nativeViewCHARMSParticipantDetailsPage.dynamicRecordButtonLocator(ras_Screener_TestDataManager.FIRST_NAME + " " + ras_Screener_TestDataManager.MIDDLE_INITIAL + " " + ras_Screener_TestDataManager.LAST_NAME));
            CucumberLogUtils.logScreenshot();
            CommonUtils.clickOnElement(NativeViewCHARMSDashboardPage.nativeViewnewScreenerReceivedLocator(ras_Screener_TestDataManager.FIRST_NAME + " " + ras_Screener_TestDataManager.MIDDLE_INITIAL + " " + ras_Screener_TestDataManager.LAST_NAME));
        } else if (sheetName.contentEquals("screenerScenario2")) {
            CommonUtils.hoverOverElement(nativeViewCHARMSParticipantDetailsPage.dynamicRecordButtonLocator(ras_Screener_TestDataManager.FIRST_NAME + " " + ras_Screener_TestDataManager.MIDDLE_INITIAL + " " + ras_Screener_TestDataManager.LAST_NAME));
            CucumberLogUtils.logScreenshot();
            CommonUtils.clickOnElement(NativeViewCHARMSDashboardPage.nativeViewnewScreenerReceivedLocator(ras_Screener_TestDataManager.FIRST_NAME + " " + ras_Screener_TestDataManager.MIDDLE_INITIAL + " " + ras_Screener_TestDataManager.LAST_NAME));
        } else if (sheetName.contentEquals("screenerScenario3")) {
            CommonUtils.hoverOverElement(nativeViewCHARMSParticipantDetailsPage.dynamicRecordButtonLocator(ras_Screener_TestDataManager.WHAT_IS_THE_NAME_OF_THE_PERSON_WHO_MAY_BE_ELIGIBLE_FOR_THIS_STUDY_FIRST + " " + ras_Screener_TestDataManager.WHAT_IS_THE_NAME_OF_THE_PERSON_WHO_MAY_BE_ELIGIBLE_FOR_THIS_STUDY_LAST));
            CucumberLogUtils.logScreenshot();
            CommonUtils.clickOnElement(NativeViewCHARMSDashboardPage.nativeViewnewScreenerReceivedLocator(ras_Screener_TestDataManager.WHAT_IS_THE_NAME_OF_THE_PERSON_WHO_MAY_BE_ELIGIBLE_FOR_THIS_STUDY_FIRST + " " + ras_Screener_TestDataManager.WHAT_IS_THE_NAME_OF_THE_PERSON_WHO_MAY_BE_ELIGIBLE_FOR_THIS_STUDY_LAST));
        } else if (sheetName.contentEquals("screenerScenario4")) {
            CommonUtils.hoverOverElement(nativeViewCHARMSParticipantDetailsPage.dynamicRecordButtonLocator(ras_Screener_TestDataManager.WHAT_IS_THE_NAME_OF_THE_PERSON_WHO_MAY_BE_ELIGIBLE_FOR_THIS_STUDY_FIRST + " " + ras_Screener_TestDataManager.WHAT_IS_THE_NAME_OF_THE_PERSON_WHO_MAY_BE_ELIGIBLE_FOR_THIS_STUDY_LAST));
            CucumberLogUtils.logScreenshot();
            CommonUtils.clickOnElement(NativeViewCHARMSDashboardPage.nativeViewnewScreenerReceivedLocator(ras_Screener_TestDataManager.WHAT_IS_THE_NAME_OF_THE_PERSON_WHO_MAY_BE_ELIGIBLE_FOR_THIS_STUDY_FIRST + " " + ras_Screener_TestDataManager.WHAT_IS_THE_NAME_OF_THE_PERSON_WHO_MAY_BE_ELIGIBLE_FOR_THIS_STUDY_LAST));
        } else if (sheetName.contentEquals("screenerScenarioAdult")) {
            CommonUtils.hoverOverElement(nativeViewCHARMSParticipantDetailsPage.dynamicRecordButtonLocator(ras_Screener_TestDataManager.FIRST_NAME + " " + ras_Screener_TestDataManager.MIDDLE_INITIAL + " " + ras_Screener_TestDataManager.LAST_NAME));
            CucumberLogUtils.logScreenshot();
            CommonUtils.clickOnElement(NativeViewCHARMSDashboardPage.nativeViewnewScreenerReceivedLocator(ras_Screener_TestDataManager.FIRST_NAME + " " + ras_Screener_TestDataManager.MIDDLE_INITIAL + " " + ras_Screener_TestDataManager.LAST_NAME));
        } else if (sheetName.contentEquals("screenerScenarioAdult-NeedsLAR")) {
            CommonUtils.hoverOverElement(nativeViewCHARMSParticipantDetailsPage.dynamicRecordButtonLocator(ras_Screener_TestDataManager.PARTICIPANT_FIRST_NAME + " " + ras_Screener_TestDataManager.PARTICIPANT_MIDDLE_INITIAL + " " + ras_Screener_TestDataManager.PARTICIPANT_LAST_NAME));
            CucumberLogUtils.logScreenshot();
            CommonUtils.clickOnElement(NativeViewCHARMSDashboardPage.nativeViewnewScreenerReceivedLocator(ras_Screener_TestDataManager.PARTICIPANT_FIRST_NAME + " " + ras_Screener_TestDataManager.PARTICIPANT_MIDDLE_INITIAL + " " + ras_Screener_TestDataManager.PARTICIPANT_LAST_NAME));
        } else if (sheetName.contentEquals("screenerScenarioAgeUnder7")) {
            CommonUtils.hoverOverElement(nativeViewCHARMSParticipantDetailsPage.dynamicRecordButtonLocator(ras_Screener_TestDataManager.FIRST_NAME + " " + ras_Screener_TestDataManager.MIDDLE_INITIAL + " " + ras_Screener_TestDataManager.LAST_NAME));
            CucumberLogUtils.logScreenshot();
            CommonUtils.clickOnElement(NativeViewCHARMSDashboardPage.nativeViewnewScreenerReceivedLocator(ras_Screener_TestDataManager.FIRST_NAME + " " + ras_Screener_TestDataManager.MIDDLE_INITIAL + " " + ras_Screener_TestDataManager.LAST_NAME));
        } else if (sheetName.contentEquals("screenerScenarioAge7-10")) {
            CommonUtils.hoverOverElement(nativeViewCHARMSParticipantDetailsPage.dynamicRecordButtonLocator(ras_Screener_TestDataManager.PARTICIPANT_FIRST_NAME + " " + ras_Screener_TestDataManager.PARTICIPANT_MIDDLE_INITIAL + " " + ras_Screener_TestDataManager.PARTICIPANT_LAST_NAME));
            CucumberLogUtils.logScreenshot();
            CommonUtils.clickOnElement(NativeViewCHARMSDashboardPage.nativeViewnewScreenerReceivedLocator(ras_Screener_TestDataManager.PARTICIPANT_FIRST_NAME + " " + ras_Screener_TestDataManager.PARTICIPANT_MIDDLE_INITIAL + " " + ras_Screener_TestDataManager.PARTICIPANT_LAST_NAME));
        } else if (sheetName.contentEquals("screenerScenarioAge11-13")) {
            CommonUtils.hoverOverElement(nativeViewCHARMSParticipantDetailsPage.dynamicRecordButtonLocator(ras_Screener_TestDataManager.PARTICIPANT_FIRST_NAME + " " + ras_Screener_TestDataManager.PARTICIPANT_MIDDLE_INITIAL + " " + ras_Screener_TestDataManager.PARTICIPANT_LAST_NAME));
            CucumberLogUtils.logScreenshot();
            CommonUtils.clickOnElement(NativeViewCHARMSDashboardPage.nativeViewnewScreenerReceivedLocator(ras_Screener_TestDataManager.PARTICIPANT_FIRST_NAME + " " + ras_Screener_TestDataManager.PARTICIPANT_MIDDLE_INITIAL + " " + ras_Screener_TestDataManager.PARTICIPANT_LAST_NAME));
        } else if (sheetName.contentEquals("screenerScenarioAge14-17")) {
            CommonUtils.hoverOverElement(nativeViewCHARMSParticipantDetailsPage.dynamicRecordButtonLocator(ras_Screener_TestDataManager.PARTICIPANT_FIRST_NAME + " " + ras_Screener_TestDataManager.PARTICIPANT_MIDDLE_INITIAL + " " + ras_Screener_TestDataManager.PARTICIPANT_LAST_NAME));
            CucumberLogUtils.logScreenshot();
            CommonUtils.clickOnElement(NativeViewCHARMSDashboardPage.nativeViewnewScreenerReceivedLocator(ras_Screener_TestDataManager.PARTICIPANT_FIRST_NAME + " " + ras_Screener_TestDataManager.PARTICIPANT_MIDDLE_INITIAL + " " + ras_Screener_TestDataManager.PARTICIPANT_LAST_NAME));
        }
        CommonUtils.sleep(1000);
        if (CommonUtils.isElementDisplayed(nativeViewCHARMSDashboardPage.rasStudyOpenRecordButton)) {
            CucumberLogUtils.logScreenshot();
            CommonUtils.clickOnElement(nativeViewCHARMSDashboardPage.rasStudyOpenRecordButton);
        }
        CommonUtils.sleep(2000);
    }

    /**
     * Navigates to Participant Study and submits the participant for review and eligibility.
     * Does not add an existing FSID for the participant.
     */
    public static void submitParticipantForReviewAndEligibility() {
        CommonUtils.sleep(2000);
        JavascriptUtils.scrollIntoView(nativeViewCHARMSParticipantDetailsPage.participantStudiesTab);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantDetailsPage.participantStudiesTab);
        CommonUtils.sleep(500);
        JavascriptUtils.clickByJS(nativeViewCHARMSParticipantDetailsPage.participantStudiesPreviewButton);
        CommonUtils.sleep(800);
        CommonUtils.clickOnElement(nativeViewCHARMSDashboardPage.rasStudyOpenRecordButton);
        CommonUtils.sleep(500);
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsSubmitForEligibilityButton);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsSubmitForEligibilityButton);
        CommonUtils.sleep(2000);
        CommonUtils.waitForClickability(nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsMarkEligibleButton);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsMarkEligibleButton);
        CommonUtils.sleep(4000);
        CommonUtils.switchToFrame(locateByCssSelector(".gb_iframe"));
        CommonUtils.waitForClickability(nativeViewCHARMSParticipantStudyPage.noButton);
        JavascriptUtils.clickByJS(nativeViewCHARMSParticipantStudyPage.noButton);
        CommonUtils.sleep(2000);
        CucumberLogUtils.logScreenshot();
        softAssert.assertTrue(nativeViewCHARMSParticipantStudyPage.aNewSubjectIDHasBeenGeneratedText.getText().contains(A_NEW_SUBJECT_ID_HAS_BEEN_GENERATED), "---- VERIFYING SUBMIT FOR REVIEW BUTTON IS VISIBLE ----");
        CommonUtils.switchToDefaultContent();
        CommonUtils.switchToFrame(NativeView_SideDoor_Dashboard_Page.nativeViewiFrame);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantStudyPage.closeButton);
        CommonUtils.sleep(800);
        nativeViewCHARMSParticipantStudyPage.saveButton.click();
        CommonUtils.sleep(2000);
    }

    /**
     * Performs the consent flow process for a given scenario (iMed, Participant upload to portal, Mail/Fax/Email/Other)
     *
     * @param sheetName             The name of the sheet containing the scenario data.
     * @param consentAssentCategory The consent type data.
     * @param collectionMethod      The response type data.
     */
    public static void nativeViewConsentFlowProcessScenario1Parameterized(String sheetName, String consentAssentCategory, String collectionMethod) {
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        navigateToParticipantRecordInNativeView(sheetName);
        submitParticipantForReviewAndEligibility();
        ras_NV_Consent_Record_TestDataManager.dataInitializerRasConsentRecord(sheetName, collectionMethod);
        /**
         * BEGINNING: CONSENT FLOW PROCESS
         */
        JavascriptUtils.scrollIntoView(nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsConsentsTab);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsConsentsTab);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsConsentsPreviewButton);
        CommonUtils.waitForVisibility(nativeViewCHARMSDashboardPage.rasStudyOpenRecordButton);
        CommonUtils.sleep(500);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(nativeViewCHARMSDashboardPage.rasStudyOpenRecordButton);
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeCalendar);
        CucumberLogUtils.logScreenshot();
        CucumberLogUtils.scenario.log("* * * * CONSENT DATE * * * *");
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentDateCalendar);
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeTodayButton);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeTodayButton);
        CucumberLogUtils.scenario.log("* * * * CONSENTED BY * * * *");
        CommonUtils.waitForClickability(nativeViewCHARMSParticipantConsentPage.rasStudyConsentByTextBox);
        CommonUtils.sendKeys(nativeViewCHARMSParticipantConsentPage.rasStudyConsentByTextBox, CHARMSRASScreenerConstants.CONSENTED_BY_USER_NAME);
        CommonUtils.sendKeys(nativeViewCHARMSParticipantConsentPage.rasStudyConsentByTextBox, Keys.ENTER);
        dynamicTabLocator("Consent Call").click();
        CucumberLogUtils.scenario.log("* * * * CONSENT CALL - CONSENT CALL SCHEDULED TIME * * * *");
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeCalendar);
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeTodayButton);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeTodayButton);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeAcceptButton);
        CucumberLogUtils.scenario.log("* * * * CONSENT CALL - CONSENT CALL DATE * * * *");
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleDateCalendar);
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeTodayButton);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeTodayButton);

        CommonUtils.sleep(500);
        CucumberLogUtils.logScreenshot();
        dynamicTabLocator("Consent Information").click();
        CucumberLogUtils.scenario.log("* * * * CONSENT INFORMATION - RESPONSE TYPE * * * *");
        CommonUtils.selectDropDownValue(collectionMethod, nativeViewCHARMSParticipantConsentPage.rasStudyConsentCollectionMethodDropDown);
        CucumberLogUtils.scenario.log("* * * * CONSENT INFORMATION - CONSENT CALL VERSION * * * *");
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleVersionCalendarButton);
        CommonUtils.waitForClickability(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleVersionCalendarButton);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleVersionCalendarButton);
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeTodayButton);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeTodayButton);
        CucumberLogUtils.scenario.log("* * * * CONSENT INFORMATION - CURRENT/PREVIOUS * * * *");
        CommonUtils.selectDropDownValue("Current", nativeViewCHARMSParticipantConsentPage.rasStudyConsentCurrentDropDown);
        CommonUtils.sleep(500);
        if (!collectionMethod.equalsIgnoreCase("iMed")) {
            dynamicTabLocator("Consent Call").click();
            CucumberLogUtils.scenario.log("* * * * CONSENT CALL - COPY OF CONSENT/ASSENT PROVIDED PROVIDED BEFORE SIGNING * * * *");
            CommonUtils.waitForClickability(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCopyOfConsentAssentProvidedDropDown);
            CommonUtils.selectDropDownValue("Yes", nativeViewCHARMSParticipantConsentPage.rasStudyConsentCopyOfConsentAssentProvidedDropDown);
            CucumberLogUtils.scenario.log("* * * * CONSENT CALL - PROTOCOL DISCUSSED IN PRIVATE SETTING * * * *");
            CommonUtils.selectDropDownValue("Yes", nativeViewCHARMSParticipantConsentPage.rasStudyConsentProtocolDiscussedInPrivateSettingDropDown);
            CucumberLogUtils.scenario.log("* * * * CONSENT CALL - PARTICIPANT VERBALIZED UNDERSTANDING OF STUDY CONDITIONS AND PARTICIPATION * * * *");
            CommonUtils.selectDropDownValue("Yes", nativeViewCHARMSParticipantConsentPage.rasStudyConsentParticipantVerbalizedUnderstandingOfStudyConditionsAndParticipationDropDown);
            CucumberLogUtils.scenario.log("* * * * CONSENT CALL - QUESTIONS ADDRESSED BEFORE SIGNING * * * *");
            CommonUtils.selectDropDownValue("Yes", nativeViewCHARMSParticipantConsentPage.rasStudyConsentQuestionsAddressedBeforeSigningDropDown);
            CucumberLogUtils.logScreenshot();
        }
        CommonUtils.sleep(500);
        CucumberLogUtils.logScreenshot();
        dynamicTabLocator("Consent Signed").click();
        CucumberLogUtils.scenario.log("* * * * CONSENT SIGNED - FUTURE USE OF SPECIMENS AND DATA BY NIH * * * *");
        CommonUtils.selectDropDownValue("Yes", nativeViewCHARMSParticipantConsentPage.rasStudyConsentFutureSpecimensAndDataDropDown);
        CucumberLogUtils.scenario.log("* * * * CONSENT SIGNED - FUTURE USE BY COLLABORATORS * * * *");
        CommonUtils.selectDropDownValue("Yes", nativeViewCHARMSParticipantConsentPage.rasStudyConsentFutureUseCollaboratorsDropDown);
        CucumberLogUtils.scenario.log("* * * * CONSENT SIGNED - FUTURE IDENTIFIABLE USE BY COLLABORATORS * * * *");
        CommonUtils.selectDropDownValue("Yes", nativeViewCHARMSParticipantConsentPage.rasStudyConsentFutureIdentifiableUseCollaboratorsDropDown);
        CommonUtils.sleep(500);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallCompleteButton);
        CommonUtils.sleep(1000);
        if (!collectionMethod.equalsIgnoreCase("iMed")) {
            dynamicTabLocator("Consent Call").click();
            CucumberLogUtils.scenario.log("* * * * CONSENT CALL - CONSENT/ASSENT OBTAINED BEFORE STUDY PROCEDURES * * * *");
            CommonUtils.selectDropDownValue("Yes", nativeViewCHARMSParticipantConsentPage.rasStudyConsentConsentAssentObtainedBeforeStudyProceduresDropDown);
            CucumberLogUtils.scenario.log("* * * * CONSENT CALL - COPY OF SIGNED/DATED CONSENT/ASSENT GIVEN TO PARTICIPANT * * * *");
            CommonUtils.selectDropDownValue("Yes", nativeViewCHARMSParticipantConsentPage.rasStudyConsentCopyOfSignedDatedConsentAssentGivenToParticipantDropDown);
        }
        CommonUtils.waitForClickability(nativeViewCHARMSParticipantConsentPage.rasStudyConsentAddFileButton);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentAddFileButton);
        CucumberLogUtils.logScreenshot();
        CommonUtils.sleep(5000);
        CucumberLogUtils.scenario.log("* * * * UPLOADING COPY OF FAMILY COHORT STUDY PDF * * * *");
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
        softAssert.assertEquals(locateByXpath("//td[normalize-space()='" + consentAssentCategory + "']").getText(), consentAssentCategory);
        softAssert.assertEquals(locateByXpath("//td[normalize-space()='" + collectionMethod + "']").getText(), collectionMethod);
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
     * Uses softAssert to verify that the expected dropdown value is selected.
     *
     * @param element       The WebElement representing the dropdown element.
     * @param expectedValue The expected value that should be selected in the dropdown.
     * @param errorMessage  The message to be displayed in case of assertion failure.
     */
    public static void softAssertDropDownValueIsSelected(WebElement element, String expectedValue, String errorMessage) {
        CharmsUtil.labelHighlight(element);
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

    /**
     * Dynamically locates a web element representing a tab using its visible text.
     *
     * @param tabCaptionText the visible text of the tab to be located
     * @return the WebElement corresponding to the specified tab text
     */
    public static WebElement dynamicTabLocator(String tabCaptionText) {
        return locateByXpath("//span[contains(@class, 'tab_caption_text') and normalize-space()='" + tabCaptionText + "']");
    }
}