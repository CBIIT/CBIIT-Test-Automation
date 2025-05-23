package CHARMS.steps;

import CHARMS.constants.CHARMSRASScreenerConstants;
import CHARMS.constants.Native_View_Constants;
import CHARMS.pages.MyRASPhysicalActivitiesSurvey;
import CHARMS.pages.MyRASSmokingSurveyPage;
import CHARMS.pages.NativeViewCHARMSDashboardPage;
import APPS_COMMON.PageInitializers.PageInitializer;
import APPS_COMMON.Pages.NativeView_SideDoor_Dashboard_Page;
import APPS_COMMON.Utils.ServiceNow_Common_Methods;
import APPS_COMMON.Utils.ServiceNow_Login_Methods;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import static Hooks.Hooks.softAssert;
import static CHARMS.pages.MyRASHomePage.dynamicModuleLocator;
import static CHARMS.steps.RAS_Common_Methods.*;
import static APPS_COMMON.Pages.Selenium_Common_Locators.locateByXpath;
import static APPS_COMMON.Pages.Selenium_Common_Locators.locateByCssSelector;

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
        CommonUtils.selectDropDownValue("CHARMS e-consent", nativeViewCHARMSParticipantConsentPage.rasStudyConsentCollectionMethodDropDown);
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
        CucumberLogUtils.scenario.log("* * * * COPY OF CONSENT/ASSENT PROVIDED PROVIDED BEFORE SIGNING * * * *");
        CommonUtils.waitForClickability(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCopyOfConsentAssentProvidedDropDown);
        CommonUtils.selectDropDownValue("Yes", nativeViewCHARMSParticipantConsentPage.rasStudyConsentCopyOfConsentAssentProvidedDropDown);
        CucumberLogUtils.scenario.log("* * * * PROTOCOL DISCUSSED IN PRIVATE SETTING * * * *");
        CommonUtils.selectDropDownValue("Yes", nativeViewCHARMSParticipantConsentPage.rasStudyConsentProtocolDiscussedInPrivateSettingDropDown);
        CucumberLogUtils.scenario.log("* * * * PARTICIPANT VERBALIZED UNDERSTANDING OF STUDY CONDITIONS AND PARTICIPATION * * * *");
        CommonUtils.selectDropDownValue("Yes", nativeViewCHARMSParticipantConsentPage.rasStudyConsentParticipantVerbalizedUnderstandingOfStudyConditionsAndParticipationDropDown);
        CucumberLogUtils.scenario.log("* * * * QUESTIONS ADDRESSED BEFORE SIGNING * * * *");
        CommonUtils.selectDropDownValue("Yes", nativeViewCHARMSParticipantConsentPage.rasStudyConsentQuestionsAddressedBeforeSigningDropDown);
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
            softAssert.assertEquals(myRasStudyConsentPage.iVoluntarilyGiveMyAssentToParticipateInThisResearchText.getText().trim(), "I voluntarily give my assent to participate in this research. (The minor should check this box)");
            myRasStudyConsentPage.iVoluntarilyGiveMyAssentToParticipateInThisResearchCheckBox.click();
            CucumberLogUtils.logScreenshot();
            myRasStudyConsentPage.signButton.click();
        } else {
            CommonUtils.waitForVisibility(myRasStudyConsentPage.signButton);
            CommonUtils.clickOnElement(myRasStudyConsentPage.signButton);
            CucumberLogUtils.logScreenshot();
            CommonUtils.sleep(1000);
            if (sheetName.equals("screenerScenarioAge11-13")) {
                softAssert.assertEquals(CommonUtils.getAlertText(), "To complete enrollment, please have your 11-13 year-old minor click through the \"Study Assent\" tile. If your minor declines participation, please contact the study team.");
                CommonUtils.acceptAlert();
            }
        }
        CommonUtils.sleep(1000);
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
        CommonUtils.waitForClickability(myRASHomePage.rasopathyStudyConsent);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(myRASHomePage.rasopathyStudyConsent);
        CommonUtils.sleep(5000);
        CucumberLogUtils.logScreenshot();
        System.out.println("* * * * * PARTICIPANT FILLING OUT CONSENT FORM * * * * *");
        softAssert.assertTrue(myRasStudyConsentPage.consentButton.getAttribute("ng-if").contains("!c.disabled"));
        JavascriptUtils.scrollIntoView(myRasStudyConsentPage.yesIhaveReadTheTermsAndConditionsCheckbox);
        CommonUtils.waitForClickability(myRasStudyConsentPage.yesIhaveReadTheTermsAndConditionsCheckbox);
        CommonUtils.clickOnElement(myRasStudyConsentPage.yesIhaveReadTheTermsAndConditionsCheckbox);
        softAssert.assertTrue(myRasStudyConsentPage.consentButton.getAttribute("ng-if").contains("!c.disabled"));
        CucumberLogUtils.logScreenshot();
        CommonUtils.waitForClickability(myRasStudyConsentPage.iAmThisPersonRadioButton);
        CommonUtils.clickOnElement(myRasStudyConsentPage.iAmThisPersonRadioButton);
        softAssert.assertTrue(myRasStudyConsentPage.consentButton.getAttribute("ng-if").contains("!c.disabled"));
        CommonUtils.waitForClickability(myRasStudyConsentPage.iDoGivePermissionForMyIdentifiableSpecimensAndDataToBeStoredAndUsedByTheStudyTeamText);
        softAssert.assertEquals(myRasStudyConsentPage.iDoGivePermissionForMyIdentifiableSpecimensAndDataToBeStoredAndUsedByTheStudyTeamText.getText().trim(), "* Please indicate if you give permission for your identifiable specimens and data to be stored and used by the study team for future studies as described above.:");
        CommonUtils.clickOnElement(myRasStudyConsentPage.iDoGivePermissionForMyIdentifiableSpecimensAndDataToBeStoredAndUsedByTheStudyTeamRadioButton);
        softAssert.assertTrue(myRasStudyConsentPage.consentButton.getAttribute("ng-if").contains("!c.disabled"));
        softAssert.assertEquals(myRasStudyConsentPage.iDoGivePermissionForMyDeIdentifiedSpecimensAndDataToBeSharedWithAndUsedByOtherResearchersText.getText().trim(), "* Please indicate if you give permission for your de-identified specimens and data to be shared with and used by other researchers for future research by selecting one of the following statements:");
        CommonUtils.clickOnElement(myRasStudyConsentPage.iDoGivePermissionForMyDeIdentifiedSpecimensAndDataToBeSharedWithAndUsedByOtherResearchersRadioButton);
        softAssert.assertTrue(myRasStudyConsentPage.consentButton.getAttribute("ng-if").contains("!c.disabled"));
        softAssert.assertEquals(myRasStudyConsentPage.iDoGivePermissionForMyIdentifiableSpecimensAndDataToBeSharedWithAndUsedByOtherResearchersForFutureStudiesText.getText().trim(), "* Please indicate if you give permission for your identifiable specimens and data to be shared with and used by other researchers for future studies by selecting one of the following statements:");
        CommonUtils.clickOnElement(myRasStudyConsentPage.iDoGivePermissionForMyIdentifiableSpecimensAndDataToBeSharedWithAndUsedByOtherResearchersForFutureStudiesRadioButton);
        CucumberLogUtils.logScreenshot();
        softAssert.assertTrue(myRasStudyConsentPage.consentButton.getAttribute("ng-if").contains("c.disabled"));
        CommonUtils.waitForClickability(myRasStudyConsentPage.consentButton);
        CommonUtils.clickOnElement(myRasStudyConsentPage.consentButton);
        CucumberLogUtils.logScreenshot();
        CommonUtils.waitForVisibility(myRasStudyConsentPage.signingPasswordTextBox);
        CommonUtils.sendKeys(myRasStudyConsentPage.signingPasswordTextBox, password);
        CommonUtils.waitForVisibility(myRasStudyConsentPage.signButton);
        CommonUtils.clickOnElement(myRasStudyConsentPage.signButton);
        CucumberLogUtils.logScreenshot();
        softAssert.assertEquals(myRasStudyConsentPage.yourConsentFormHasBeenSubmittedSuccessfullyMessage.getText(), "Your Consent Form has been submitted successfully !\n" +
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
        softAssert.assertTrue(myRASHomePage.rasopathyStudyAssent.isDisplayed());
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(myRASHomePage.rasopathyStudyAssent);
        CommonUtils.sleep(3000);
        System.out.println("* * * * * PARTICIPANT FILLING OUT ASSENT FORM * * * * *");
        JavascriptUtils.scrollIntoView(myRASStudyAssentPage.yesIHaveReadAndAssentToTheTermsAndConditionsCheckbox);
        softAssert.assertEquals(myRASStudyAssentPage.yesIHaveReadAndAssentToTheTermsAndConditionsText.getText(), "Yes, I have read and assent to the terms and conditions.");
        softAssert.assertEquals(myRASStudyAssentPage.assentButton.getAttribute("ng-if"), "!c.disabled");
        CommonUtils.waitForClickability(myRASStudyAssentPage.yesIHaveReadAndAssentToTheTermsAndConditionsCheckbox);
        CommonUtils.clickOnElement(myRASStudyAssentPage.yesIHaveReadAndAssentToTheTermsAndConditionsCheckbox);
        CucumberLogUtils.logScreenshot();
        CommonUtils.waitForClickability(myRASStudyAssentPage.assentButton);
        CommonUtils.clickOnElement(myRASStudyAssentPage.assentButton);
        softAssert.assertEquals(myRASStudyAssentPage.assentButton.getAttribute("ng-if"), "c.disabled");
        CucumberLogUtils.logScreenshot();
        CommonUtils.waitForVisibility(myRASStudyAssentPage.signaturePasswordTextBox);
        CommonUtils.sendKeys(myRASStudyAssentPage.signaturePasswordTextBox, password);
        CommonUtils.waitForClickability(myRASStudyAssentPage.signButton);
        CommonUtils.clickOnElement(myRASStudyAssentPage.signButton);
        CucumberLogUtils.logScreenshot();
        CommonUtils.waitForVisibility(myRASStudyAssentPage.yourAssentFormHasBeenSubmittedSuccessfullyMessage);
        softAssert.assertEquals(myRASStudyAssentPage.yourAssentFormHasBeenSubmittedSuccessfullyMessage.getText(), "Your Assent Form has been submitted successfully !\n" +
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
            CommonUtils.hoverOverElement(participantDetailsPage.dynamicRecordButtonLocator(ras_Screener_TestDataManager.FIRST_NAME + " " + ras_Screener_TestDataManager.MIDDLE_INITIAL + " " + ras_Screener_TestDataManager.LAST_NAME));
            CucumberLogUtils.logScreenshot();
            CommonUtils.clickOnElement(NativeViewCHARMSDashboardPage.nativeViewnewScreenerReceivedLocator(ras_Screener_TestDataManager.FIRST_NAME + " " + ras_Screener_TestDataManager.MIDDLE_INITIAL + " " + ras_Screener_TestDataManager.LAST_NAME));
        } else if (sheetName.contentEquals("screenerScenario2")) {
            CommonUtils.hoverOverElement(participantDetailsPage.dynamicRecordButtonLocator(ras_Screener_TestDataManager.FIRST_NAME + " " + ras_Screener_TestDataManager.MIDDLE_INITIAL + " " + ras_Screener_TestDataManager.LAST_NAME));
            CucumberLogUtils.logScreenshot();
            CommonUtils.clickOnElement(NativeViewCHARMSDashboardPage.nativeViewnewScreenerReceivedLocator(ras_Screener_TestDataManager.FIRST_NAME + " " + ras_Screener_TestDataManager.MIDDLE_INITIAL + " " + ras_Screener_TestDataManager.LAST_NAME));
        } else if (sheetName.contentEquals("screenerScenario3")) {
            CommonUtils.hoverOverElement(participantDetailsPage.dynamicRecordButtonLocator(ras_Screener_TestDataManager.WHAT_IS_THE_NAME_OF_THE_PERSON_WHO_MAY_BE_ELIGIBLE_FOR_THIS_STUDY_FIRST + " " + ras_Screener_TestDataManager.WHAT_IS_THE_NAME_OF_THE_PERSON_WHO_MAY_BE_ELIGIBLE_FOR_THIS_STUDY_MI + " " + ras_Screener_TestDataManager.WHAT_IS_THE_NAME_OF_THE_PERSON_WHO_MAY_BE_ELIGIBLE_FOR_THIS_STUDY_LAST));
            CucumberLogUtils.logScreenshot();
            CommonUtils.clickOnElement(NativeViewCHARMSDashboardPage.nativeViewnewScreenerReceivedLocator(ras_Screener_TestDataManager.WHAT_IS_THE_NAME_OF_THE_PERSON_WHO_MAY_BE_ELIGIBLE_FOR_THIS_STUDY_FIRST + " " + ras_Screener_TestDataManager.WHAT_IS_THE_NAME_OF_THE_PERSON_WHO_MAY_BE_ELIGIBLE_FOR_THIS_STUDY_MI + " " + ras_Screener_TestDataManager.WHAT_IS_THE_NAME_OF_THE_PERSON_WHO_MAY_BE_ELIGIBLE_FOR_THIS_STUDY_LAST));
        } else if (sheetName.contentEquals("screenerScenario4")) {
            CommonUtils.hoverOverElement(participantDetailsPage.dynamicRecordButtonLocator(ras_Screener_TestDataManager.WHAT_IS_THE_NAME_OF_THE_PERSON_WHO_MAY_BE_ELIGIBLE_FOR_THIS_STUDY_FIRST + " " + ras_Screener_TestDataManager.WHAT_IS_THE_NAME_OF_THE_PERSON_WHO_MAY_BE_ELIGIBLE_FOR_THIS_STUDY_MI + " " + ras_Screener_TestDataManager.WHAT_IS_THE_NAME_OF_THE_PERSON_WHO_MAY_BE_ELIGIBLE_FOR_THIS_STUDY_LAST));
            CucumberLogUtils.logScreenshot();
            CommonUtils.clickOnElement(NativeViewCHARMSDashboardPage.nativeViewnewScreenerReceivedLocator(ras_Screener_TestDataManager.WHAT_IS_THE_NAME_OF_THE_PERSON_WHO_MAY_BE_ELIGIBLE_FOR_THIS_STUDY_FIRST + " " + ras_Screener_TestDataManager.WHAT_IS_THE_NAME_OF_THE_PERSON_WHO_MAY_BE_ELIGIBLE_FOR_THIS_STUDY_MI + " " + ras_Screener_TestDataManager.WHAT_IS_THE_NAME_OF_THE_PERSON_WHO_MAY_BE_ELIGIBLE_FOR_THIS_STUDY_LAST));
        } else if (sheetName.contentEquals("screenerScenarioAdult")) {
            CommonUtils.hoverOverElement(participantDetailsPage.dynamicRecordButtonLocator(ras_Screener_TestDataManager.FIRST_NAME + " " + ras_Screener_TestDataManager.MIDDLE_INITIAL + " " + ras_Screener_TestDataManager.LAST_NAME));
            CucumberLogUtils.logScreenshot();
            CommonUtils.clickOnElement(NativeViewCHARMSDashboardPage.nativeViewnewScreenerReceivedLocator(ras_Screener_TestDataManager.FIRST_NAME + " " + ras_Screener_TestDataManager.MIDDLE_INITIAL + " " + ras_Screener_TestDataManager.LAST_NAME));
        } else if (sheetName.contentEquals("screenerScenarioAge11-13")) {
            CommonUtils.hoverOverElement(participantDetailsPage.dynamicRecordButtonLocator(ras_Screener_TestDataManager.WHAT_IS_THE_NAME_OF_THE_PERSON_WHO_MAY_BE_ELIGIBLE_FOR_THIS_STUDY_FIRST + " " + ras_Screener_TestDataManager.WHAT_IS_THE_NAME_OF_THE_PERSON_WHO_MAY_BE_ELIGIBLE_FOR_THIS_STUDY_MI + " " + ras_Screener_TestDataManager.WHAT_IS_THE_NAME_OF_THE_PERSON_WHO_MAY_BE_ELIGIBLE_FOR_THIS_STUDY_LAST));
            CucumberLogUtils.logScreenshot();
            CommonUtils.clickOnElement(NativeViewCHARMSDashboardPage.nativeViewnewScreenerReceivedLocator(ras_Screener_TestDataManager.WHAT_IS_THE_NAME_OF_THE_PERSON_WHO_MAY_BE_ELIGIBLE_FOR_THIS_STUDY_FIRST + " " + ras_Screener_TestDataManager.WHAT_IS_THE_NAME_OF_THE_PERSON_WHO_MAY_BE_ELIGIBLE_FOR_THIS_STUDY_MI + " " + ras_Screener_TestDataManager.WHAT_IS_THE_NAME_OF_THE_PERSON_WHO_MAY_BE_ELIGIBLE_FOR_THIS_STUDY_LAST));
        } else if (sheetName.contentEquals("screenerScenarioAge14-17")) {
            CommonUtils.hoverOverElement(participantDetailsPage.dynamicRecordButtonLocator(ras_Screener_TestDataManager.WHAT_IS_THE_NAME_OF_THE_PERSON_WHO_MAY_BE_ELIGIBLE_FOR_THIS_STUDY_FIRST + " " + ras_Screener_TestDataManager.WHAT_IS_THE_NAME_OF_THE_PERSON_WHO_MAY_BE_ELIGIBLE_FOR_THIS_STUDY_MI + " " + ras_Screener_TestDataManager.WHAT_IS_THE_NAME_OF_THE_PERSON_WHO_MAY_BE_ELIGIBLE_FOR_THIS_STUDY_LAST));
            CucumberLogUtils.logScreenshot();
            CommonUtils.clickOnElement(NativeViewCHARMSDashboardPage.nativeViewnewScreenerReceivedLocator(ras_Screener_TestDataManager.WHAT_IS_THE_NAME_OF_THE_PERSON_WHO_MAY_BE_ELIGIBLE_FOR_THIS_STUDY_FIRST + " " + ras_Screener_TestDataManager.WHAT_IS_THE_NAME_OF_THE_PERSON_WHO_MAY_BE_ELIGIBLE_FOR_THIS_STUDY_MI + " " + ras_Screener_TestDataManager.WHAT_IS_THE_NAME_OF_THE_PERSON_WHO_MAY_BE_ELIGIBLE_FOR_THIS_STUDY_LAST));
        }
        CommonUtils.sleep(1000);
        if (CommonUtils.isElementDisplayed(nativeViewCHARMSDashboardPage.rasStudyOpenRecordButton)) {
            CucumberLogUtils.logScreenshot();
            CommonUtils.clickOnElement(nativeViewCHARMSDashboardPage.rasStudyOpenRecordButton);
        }
        CommonUtils.sleep(2000);
        JavascriptUtils.scrollIntoView(nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsConsentsTab);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsConsentsTab);
        CommonUtils.hoverOverElement(locateByXpath("//td[normalize-space()='" + consentType + "']"));
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsConsentsPreviewButton);
        CommonUtils.waitForVisibility(nativeViewCHARMSDashboardPage.rasStudyOpenRecordButton);
        CommonUtils.sleep(500);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(nativeViewCHARMSDashboardPage.rasStudyOpenRecordButton);
        CucumberLogUtils.scenario.log("* * * * CONSENT/ASSENT OBTAINED BEFORE STUDY PROCEDURES * * * *");
        CommonUtils.selectDropDownValue("Yes", nativeViewCHARMSParticipantConsentPage.rasStudyConsentConsentAssentObtainedBeforeStudyProceduresDropDown);
        CucumberLogUtils.scenario.log("* * * * COPY OF SIGNED/DATED CONSENT/ASSENT GIVEN TO PARTICIPANT * * * *");
        CommonUtils.sleep(300);
        CommonUtils.selectDropDownValue("Yes", nativeViewCHARMSParticipantConsentPage.rasStudyConsentCopyOfSignedDatedConsentAssentGivenToParticipantDropDown);
        CucumberLogUtils.logScreenshot();
        CommonUtils.waitForClickability(nativeViewCHARMSParticipantConsentPage.rasStudyConsentSignAndCompleteButton);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentSignAndCompleteButton);
        CommonUtils.sleep(2000);
        CommonUtils.waitForVisibility(locateByXpath("//div[@class='outputmsg_text']"));
        CucumberLogUtils.logScreenshot();
        CommonUtils.waitForClickability(locateByCssSelector("button[aria-label='Back']"));
        JavascriptUtils.clickByJS(locateByCssSelector("button[aria-label='Back']"));
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
        softAssert.assertEquals(dynamicModuleLocator(expectedDownloadStudyText).getText(), expectedDownloadStudyText);
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
        softAssert.assertTrue(downloadedFile.exists());
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
     * Study Team member logs in to Native View and verifies that the field Assent signed is true.
     *
     * @param sheetName the name of the sheet for which the field Assent signed is being verified.
     */
    @Then("Study Team member logs in to Native View and verifies that the field Assent signed is true {string}")
    public void study_team_member_logs_in_to_native_view_and_verifies_that_the_field_assent_signed_is_true(String sheetName) {
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        navigateToParticipantRecordInNativeView(sheetName);
        study_team_member_navigates_to_participant_studies();
        softAssert.assertEquals("true", nativeViewCHARMSParticipantDetailsPage.assentSignedCheckBox.getDomAttribute("value"));
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
            softAssert.assertEquals(locateByXpath("//td[normalize-space()='" + ras_Screener_TestDataManager.FIRST_NAME + " " + ras_Screener_TestDataManager.LAST_NAME + "']/following-sibling::td[4]").getText(), "New Screener Received");
        } else {
            softAssert.assertEquals(locateByXpath("//td[normalize-space()='" + ras_Screener_TestDataManager.PARTICIPANT_FIRST_NAME + " " + ras_Screener_TestDataManager.PARTICIPANT_LAST_NAME + "']/following-sibling::td[4]").getText(), "New Screener Received");
        }
    }

    /**
     * When Study Team member logs in to Native View and completes consent call with provided sheet names.
     *
     * @param sheetName              The name of the sheet containing participant record details.
     * @param consentRecordSheetName The name of the sheet containing consent record details.
     */
    @When("Study Team member logs in to Native View and completes consent call {string} {string}")
    public void study_team_member_logs_in_to_Native_View_and_completes_consent_call(String sheetName, String consentRecordSheetName) {
        ras_Screener_TestDataManager.dataInitializerRasScreener(sheetName);
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
        CommonUtils.sleep(1000);
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeCalendar);
        CucumberLogUtils.logScreenshot();
        if (!ras_NV_Consent_Record_TestDataManager.RESPONSE_TYPE.equals("")) {
            CucumberLogUtils.scenario.log("* * * * * RESPONSE TYPE * * * * *");
            CommonUtils.waitForClickability(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCollectionMethodDropDown);
            CommonUtils.selectDropDownValue(ras_NV_Consent_Record_TestDataManager.RESPONSE_TYPE, nativeViewCHARMSParticipantConsentPage.rasStudyConsentCollectionMethodDropDown);
            CommonUtils.sleep(500);
        }
        if (!ras_NV_Consent_Record_TestDataManager.CONSENT_CALL_SCHEDULED_TIME.isEmpty()) {
            CucumberLogUtils.scenario.log("* * * * * CONSENT CALL SCHEDULED TIME * * * * *");
            CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeCalendar);
            CommonUtils.waitForVisibility(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeTodayButton);
            CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeTodayButton);
            CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeAcceptButton);
        }
        if (!ras_NV_Consent_Record_TestDataManager.CONSENT_CALL_DATE.isEmpty()) {
            CucumberLogUtils.scenario.log("* * * * * CONSENT CALL DATE * * * * *");
            CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleDateCalendar);
            CommonUtils.waitForVisibility(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeTodayButton);
            CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeTodayButton);
        }
        if (!ras_NV_Consent_Record_TestDataManager.COHORT.isEmpty()) {

        }
        if (!ras_NV_Consent_Record_TestDataManager.CONSENT_FORM.isEmpty()) {

        }
        if (!ras_NV_Consent_Record_TestDataManager.CONSENT_VERSION.isEmpty()) {
            CucumberLogUtils.scenario.log("* * * * * CONSENT VERSION * * * * *");
            CommonUtils.waitForVisibility(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleVersionCalendar);
            CommonUtils.waitForClickability(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleVersionCalendar);
            CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleVersionCalendar);
            CommonUtils.waitForVisibility(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeTodayButton);
            CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeTodayButton);
        }
        if (!ras_NV_Consent_Record_TestDataManager.CONSENT_ASSENT_STATUS.isEmpty()) {

        }
        if (!ras_NV_Consent_Record_TestDataManager.CONSENT_TYPE.isEmpty()) {

        }
        if (!ras_NV_Consent_Record_TestDataManager.LEGAL_DOCUMENTATION_RECEIVED.isEmpty()) {

        }
        if (!ras_NV_Consent_Record_TestDataManager.NOT_DEVELOPMENTALLY_ABLE_TO_GIVE_ASSENT.isEmpty()) {

        }
        if (!ras_NV_Consent_Record_TestDataManager.PARENT_GUARDIAN_STATUS.isEmpty()) {

        }
        if (!ras_NV_Consent_Record_TestDataManager.PARENT_GUARDIAN_1_SIGNED.isEmpty()) {

        }
        if (!ras_NV_Consent_Record_TestDataManager.PARENT_GUARDIAN_2_SIGNED.isEmpty()) {

        }
        if (!ras_NV_Consent_Record_TestDataManager.NUMBER_OF_LARS.isEmpty()) {
            CucumberLogUtils.scenario.log("* * * * * NUMBER OF LARS: " + ras_NV_Consent_Record_TestDataManager.NUMBER_OF_LARS + "* * * * *");
            CommonUtils.selectDropDownValue(ras_NV_Consent_Record_TestDataManager.NUMBER_OF_LARS, nativeViewCHARMSParticipantConsentPage.numberOfLARsDropDown);
        }
        if (!ras_NV_Consent_Record_TestDataManager.LAR_1_SIGNED.isEmpty()) {
            CucumberLogUtils.scenario.log("* * * * * LAR 1 SIGNED: " + ras_NV_Consent_Record_TestDataManager.LAR_1_SIGNED + "* * * * *");
            CommonUtils.waitForClickability(nativeViewCHARMSParticipantConsentPage.lar1SignedDropDown);
            CommonUtils.selectDropDownValue(ras_NV_Consent_Record_TestDataManager.LAR_1_SIGNED, nativeViewCHARMSParticipantConsentPage.lar1SignedDropDown);
        }
        if (!ras_NV_Consent_Record_TestDataManager.LAR_1_NAME.isEmpty()) {
            CucumberLogUtils.scenario.log("* * * * * LAR 1 NAME: " + ras_NV_Consent_Record_TestDataManager.LAR_1_NAME + "* * * * *");
            CommonUtils.waitForClickability(nativeViewCHARMSParticipantConsentPage.lar1NameTextField);
            nativeViewCHARMSParticipantConsentPage.lar1NameTextField.sendKeys(ras_NV_Consent_Record_TestDataManager.LAR_1_NAME);
        }
        if (!ras_NV_Consent_Record_TestDataManager.LAR_2_SIGNED.isEmpty()) {
            CucumberLogUtils.scenario.log("* * * * * LAR 2 SIGNED: " + ras_NV_Consent_Record_TestDataManager.LAR_2_SIGNED + "* * * * *");
            CommonUtils.waitForClickability(nativeViewCHARMSParticipantConsentPage.lar2SignedDropDown);
            CommonUtils.selectDropDownValue(ras_NV_Consent_Record_TestDataManager.LAR_2_SIGNED, nativeViewCHARMSParticipantConsentPage.lar2SignedDropDown);
        }
        if (!ras_NV_Consent_Record_TestDataManager.LAR_2_NAME.isEmpty()) {
            CucumberLogUtils.scenario.log("* * * * * LAR 2 NAME: " + ras_NV_Consent_Record_TestDataManager.LAR_2_NAME + "* * * * *");
            CommonUtils.waitForClickability(nativeViewCHARMSParticipantConsentPage.lar2NameTextField);
            nativeViewCHARMSParticipantConsentPage.lar1NameTextField.sendKeys(ras_NV_Consent_Record_TestDataManager.LAR_2_NAME);
        }
        if (!ras_NV_Consent_Record_TestDataManager.ASSIGNED_TO.isEmpty()) {

        }
        if (!ras_NV_Consent_Record_TestDataManager.CONSENT_STATUS.isEmpty()) {

        }
        if (!ras_NV_Consent_Record_TestDataManager.CONSENT_DATE.isEmpty()) {
            CucumberLogUtils.scenario.log("* * * * * CONSENT DATE * * * * *");
            CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentDateCalendar);
            CommonUtils.waitForVisibility(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeTodayButton);
            CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeTodayButton);
        }
        if (!ras_NV_Consent_Record_TestDataManager.CONSENT_BY.isEmpty()) {
            CucumberLogUtils.scenario.log("* * * * * CONSENTED BY * * * * *");
            CommonUtils.sendKeys(nativeViewCHARMSParticipantConsentPage.rasStudyConsentByTextBox, CHARMSRASScreenerConstants.CONSENTED_BY_USER_NAME);
            CommonUtils.sendKeys(nativeViewCHARMSParticipantConsentPage.rasStudyConsentByTextBox, Keys.ENTER);
            CommonUtils.sleep(500);
        }
        if (!ras_NV_Consent_Record_TestDataManager.CURRENT_PREVIOUS.isEmpty()) {
            CucumberLogUtils.scenario.log("* * * * * CURRENT/PREVIOUS * * * * *");
            System.out.println("CURRENT/PREVIOUS: " + "[" + ras_NV_Consent_Record_TestDataManager.CURRENT_PREVIOUS + "]");
            CommonUtils.selectDropDownValue(ras_NV_Consent_Record_TestDataManager.CURRENT_PREVIOUS, nativeViewCHARMSParticipantConsentPage.rasStudyConsentCurrentDropDown);
        }
        if (!ras_NV_Consent_Record_TestDataManager.STUDY.isEmpty()) {

        }
        if (!ras_NV_Consent_Record_TestDataManager.COPY_OF_CONSENT_ASSENT_PROVIDED_BEFORE_SIGNING.isEmpty()) {
            CucumberLogUtils.scenario.log("* * * * COPY OF CONSENT/ASSENT PROVIDED PROVIDED BEFORE SIGNING * * * *");
            CommonUtils.waitForClickability(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCopyOfConsentAssentProvidedDropDown);
            CommonUtils.selectDropDownValue(ras_NV_Consent_Record_TestDataManager.COPY_OF_CONSENT_ASSENT_PROVIDED_BEFORE_SIGNING, nativeViewCHARMSParticipantConsentPage.rasStudyConsentCopyOfConsentAssentProvidedDropDown);
        }
        if (!ras_NV_Consent_Record_TestDataManager.PROTOCOL_DISCUSSED_IN_PRIVATE_SETTING.isEmpty()) {
            CucumberLogUtils.scenario.log("* * * * PROTOCOL DISCUSSED IN PRIVATE SETTING * * * *");
            CommonUtils.selectDropDownValue(ras_NV_Consent_Record_TestDataManager.PROTOCOL_DISCUSSED_IN_PRIVATE_SETTING, nativeViewCHARMSParticipantConsentPage.rasStudyConsentProtocolDiscussedInPrivateSettingDropDown);
        }
        if (!ras_NV_Consent_Record_TestDataManager.PARTICIPANT_VERBALIZED_UNDERSTANDING_OF_STUDY_CONDITIONS_AND_PARTICIPATION.isEmpty()) {
            CucumberLogUtils.scenario.log("* * * * PARTICIPANT VERBALIZED UNDERSTANDING OF STUDY CONDITIONS AND PARTICIPATION * * * *");
            CommonUtils.selectDropDownValue(ras_NV_Consent_Record_TestDataManager.PARTICIPANT_VERBALIZED_UNDERSTANDING_OF_STUDY_CONDITIONS_AND_PARTICIPATION, nativeViewCHARMSParticipantConsentPage.rasStudyConsentParticipantVerbalizedUnderstandingOfStudyConditionsAndParticipationDropDown);
        }
        if (!ras_NV_Consent_Record_TestDataManager.QUESTIONS_ADDRESSED_BEFORE_SIGNING.isEmpty()) {
            CucumberLogUtils.scenario.log("* * * * QUESTIONS ADDRESSED BEFORE SIGNING * * * *");
            CommonUtils.selectDropDownValue(ras_NV_Consent_Record_TestDataManager.QUESTIONS_ADDRESSED_BEFORE_SIGNING, nativeViewCHARMSParticipantConsentPage.rasStudyConsentQuestionsAddressedBeforeSigningDropDown);
        }
        if (!ras_NV_Consent_Record_TestDataManager.CONSENT_ASSENT_OBTAINED_BEFORE_STUDY_PROCEDURES.isEmpty()) {
            CucumberLogUtils.scenario.log("* * * * CONSENT/ASSENT OBTAINED BEFORE STUDY PROCEDURES * * * *");
            CommonUtils.selectDropDownValue(ras_NV_Consent_Record_TestDataManager.CONSENT_ASSENT_OBTAINED_BEFORE_STUDY_PROCEDURES, nativeViewCHARMSParticipantConsentPage.rasStudyConsentConsentAssentObtainedBeforeStudyProceduresDropDown);
        }
        if (!ras_NV_Consent_Record_TestDataManager.COPY_OF_SIGNED_DATED_CONSENT_ASSENT_GIVEN_TO_PARTICIPANT.isEmpty()) {
            CucumberLogUtils.scenario.log("* * * * COPY OF SIGNED/DATED CONSENT/ASSENT GIVEN TO PARTICIPANT * * * *");
            CommonUtils.selectDropDownValue(ras_NV_Consent_Record_TestDataManager.COPY_OF_SIGNED_DATED_CONSENT_ASSENT_GIVEN_TO_PARTICIPANT, nativeViewCHARMSParticipantConsentPage.rasStudyConsentCopyOfSignedDatedConsentAssentGivenToParticipantDropDown);
        }
        if (!ras_NV_Consent_Record_TestDataManager.SHORT_FORM_CONSENT.isEmpty()) {

        }
        if (!ras_NV_Consent_Record_TestDataManager.INTERPRETER_USED.isEmpty()) {

        }
        if (!ras_NV_Consent_Record_TestDataManager.INTERPRETER_NAME_OR_ID.isEmpty()) {

        }
        if (!ras_NV_Consent_Record_TestDataManager.INTERPRETER_LANGUAGE.isEmpty()) {

        }
        if (!ras_NV_Consent_Record_TestDataManager.INTERPRETER_WITNESS.isEmpty()) {

        }
        if (!ras_NV_Consent_Record_TestDataManager.INTERPRETER_SIGNED.isEmpty()) {

        }
        if (!ras_NV_Consent_Record_TestDataManager.FUTURE_USE_OF_SPECIMENS_AND_DATA_BY_NIH.isEmpty()) {

        }
        if (!ras_NV_Consent_Record_TestDataManager.FUTURE_USE_BY_COLLABORATORS.isEmpty()) {

        }
        if (!ras_NV_Consent_Record_TestDataManager.FUTURE_IDENTIFIABLE_USE_BY_COLLABORATORS.isEmpty()) {

        }
        if (!ras_NV_Consent_Record_TestDataManager.RETURN_OF_GENETIC_FINDINGS.isEmpty()) {

        }
        if (!ras_NV_Consent_Record_TestDataManager.CREATED.isEmpty()) {

        }
        if (!ras_NV_Consent_Record_TestDataManager.SENT_TO_MEDIDATA.isEmpty()) {

        }
        if (!ras_NV_Consent_Record_TestDataManager.ASSENT_SIGNED.isEmpty()) {

        }
        CommonUtils.sleep(500);
        CucumberLogUtils.logScreenshot();
        CucumberLogUtils.scenario.log("* * * * * CALL COMPLETE * * * * *");
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallCompleteButton);
        CucumberLogUtils.logScreenshot();
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
    @Given("Study Team member clicks Add New Participant and completes the form with:  FSID {string}, Study {string}, Study Subcategory {string}, Relationship to Proband {string}, First Name {string}, Last Name {string}")
    public void study_team_member_clicks_add_new_participant_and_completes_the_form(String existingFSID, String study, String studySubcategory, String relationshipToProband, String firstName, String lastName) {
        CommonUtils.waitForClickability(nativeViewCHARMSDashboardPage.nativeViewAddNewParticipantButton);
        nativeViewCHARMSDashboardPage.nativeViewAddNewParticipantButton.click();
        CucumberLogUtils.logScreenshot();
        if (!existingFSID.isEmpty()) {
            nativeViewCHARMSAddNewParticipantPage.isThereAnExistingFSIDCheckbox.click();
            CommonUtils.waitForVisibility(nativeViewCHARMSAddNewParticipantPage.FSIDToUseTextBox);
            CommonUtils.sendKeys(nativeViewCHARMSAddNewParticipantPage.FSIDToUseTextBox, existingFSID);
        }
        CommonUtils.sleep(1000);
        nativeViewCHARMSAddNewParticipantPage.unlockStudiesButton.click();
        CommonUtils.waitForClickability(nativeViewCHARMSAddNewParticipantPage.studiesTextBox);
        CommonUtils.sendKeys(nativeViewCHARMSAddNewParticipantPage.studiesTextBox, study);
        CommonUtils.sleep(500);
        CommonUtils.sendKeys(nativeViewCHARMSAddNewParticipantPage.studiesTextBox, Keys.ENTER);
        nativeViewCHARMSAddNewParticipantPage.lockStudiesButton.click();
        CommonUtils.sleep(800);
        CommonUtils.clickOnElement(nativeViewCHARMSAddNewParticipantPage.unlockStudySubcategoryButton);
        CommonUtils.waitForClickability(nativeViewCHARMSAddNewParticipantPage.studySubcategoryTextbox);
        CommonUtils.sendKeys(nativeViewCHARMSAddNewParticipantPage.studySubcategoryTextbox, studySubcategory);
        CommonUtils.sleep(500);
        CommonUtils.sendKeys(nativeViewCHARMSAddNewParticipantPage.studySubcategoryTextbox, Keys.ENTER);
        nativeViewCHARMSAddNewParticipantPage.lockStudySubcategoryButton.click();
        CommonUtils.sleep(800);
        CucumberLogUtils.logScreenshot();
        CommonUtils.waitForClickability(nativeViewCHARMSAddNewParticipantPage.relationshipToProbandDropdown);
        CommonUtils.selectDropDownValue(relationshipToProband, nativeViewCHARMSAddNewParticipantPage.relationshipToProbandDropdown);
        if (existingFSID.isEmpty() && (relationshipToProband.equals("Other") || relationshipToProband.equals("Unknown"))) {
            CommonUtils.waitForVisibility(nativeViewCHARMSAddNewParticipantPage.warningFSIDWillNotGenerateForOtherOrUnknownRelationshipText);
            softAssert.assertEquals(nativeViewCHARMSAddNewParticipantPage.warningFSIDWillNotGenerateForOtherOrUnknownRelationshipText.getText(), "WARNING: FSID will not generate for Other or Unknown relationship. But if you have an existing FSID, you may go ahead to enter below and save the data.");
            CucumberLogUtils.logScreenshot();
        }
        CommonUtils.scrollIntoView(nativeViewCHARMSAddNewParticipantPage.firstNameTextBox);
        CommonUtils.sendKeys(nativeViewCHARMSAddNewParticipantPage.firstNameTextBox, firstName);
        CommonUtils.sendKeys(nativeViewCHARMSAddNewParticipantPage.lastNameTextBox, lastName);
        CommonUtils.clickOnElement(nativeViewCHARMSAddNewParticipantPage.saveRecordAndRemainHereButton);
        CommonUtils.sleep(800);
        if (existingFSID.isEmpty() && (relationshipToProband.equals("Other") || relationshipToProband.equals("Unknown"))) {
            CommonUtils.waitForVisibility(nativeViewCHARMSAddNewParticipantPage.errorNewParticipantDataWillNOTBeSavedForOtherOrUnknownRelationshipText);
            softAssert.assertEquals(nativeViewCHARMSAddNewParticipantPage.errorNewParticipantDataWillNOTBeSavedForOtherOrUnknownRelationshipText.getText(), "ERROR: New participant data will NOT be saved for Other or Unknown relationship");
            softAssert.assertEquals(nativeViewCHARMSAddNewParticipantPage.subjectIDTextBox.getAttribute("value"), "");
            softAssert.assertEquals(nativeViewCHARMSAddNewParticipantPage.subjectNameTextBox.getAttribute("value"), "");
            CucumberLogUtils.logScreenshot();
        } else {
            CucumberLogUtils.scenario.log("* * * * VERIFYING FSID * * * *");
            CommonUtils.waitForVisibility(nativeViewCHARMSAddNewParticipantPage.familyIDTextBox);
            softAssert.assertEquals(nativeViewCHARMSAddNewParticipantPage.subjectIDTextBox.getAttribute("value").split("-")[0], nativeViewCHARMSAddNewParticipantPage.familyIDTextBox.getAttribute("value"));
            CucumberLogUtils.logScreenshot();
        }
        softAssert.assertEquals(nativeViewCHARMSAddNewParticipantPage.selectedStudyNonEditText.getText(), study);
        softAssert.assertEquals(nativeViewCHARMSAddNewParticipantPage.selectedStudySubcategoryNonEditText.getText(), studySubcategory);
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

    /**
     * Logs in a study team member to the Native View application and navigates to a specific Participant Consent record.
     *
     * @param sheetName the name of the sheet containing participant consent record information
     */
    @Given("Study Team member logs in to Native View and navigates to Participant Consent record {string}")
    public void study_team_member_logs_in_to_native_view_and_navigates_to_participant_consent_record(String sheetName) {
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        navigateToParticipantRecordInNativeView(sheetName);
        CommonUtils.sleep(2000);
        JavascriptUtils.scrollIntoView(nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsConsentsTab);
        CommonUtils.sleep(500);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsConsentsTab);
        CommonUtils.hoverOverElement(locateByXpath("//td[normalize-space()='" + Native_View_Constants.consentAssentCategoryBySheetMap.get(sheetName) + "']"));
        CommonUtils.sleep(500);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsConsentsPreviewButton);
        CommonUtils.waitForVisibility(nativeViewCHARMSDashboardPage.rasStudyOpenRecordButton);
        CommonUtils.sleep(500);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(nativeViewCHARMSDashboardPage.rasStudyOpenRecordButton);
        CommonUtils.sleep(1000);
    }

    /**
     * Verifies that the Consent Status and Consent Type match the provided values,
     * and checks that the Parent Guardian fields are disabled.
     *
     * @param consentStatus The expected Consent Status value
     * @param consentType   The expected Consent Type value
     */
    @Given("Study Team member verifies that Consent Status equals {string}, Consent Type equals {string}, and that Parent Guardian fields are disabled")
    public void study_team_member_verifies_consent_status_consent_type_guardian_and_that_parent_guardian_fields_are_disabled(String consentStatus, String consentType) {
        CommonUtils.verifyingDropDownValueIsSelected(nativeViewCHARMSParticipantConsentPage.rasStudyConsentStatusTextBox, consentStatus, "* * * * * CONSENT STATUS MISMATCH * * * * *");
        CommonUtils.verifyingDropDownValueIsSelected(nativeViewCHARMSParticipantConsentPage.rasStudyConsentAssentCategoryDropDown, consentType, "* * * * * CONSENT TYPE MISMATCH * * * * *");
        softAssert.assertEquals(nativeViewCHARMSParticipantConsentPage.rasStudyConsentParentGuardian1SignedDropDown.getAttribute("mandatory"), "false");
        softAssert.assertEquals(nativeViewCHARMSParticipantConsentPage.rasStudyConsentParentGuardian1SignedDropDown.getAttribute("aria-required"), "false");
        softAssert.assertFalse(nativeViewCHARMSParticipantConsentPage.rasStudyConsentParentGuardian1SignedDropDown.isDisplayed());
        softAssert.assertEquals(nativeViewCHARMSParticipantConsentPage.rasStudyConsentParentGuardian1SignedDropDown.getAttribute("mandatory"), "false");
        softAssert.assertEquals(nativeViewCHARMSParticipantConsentPage.rasStudyConsentParentGuardian1SignedDropDown.getAttribute("aria-required"), "false");
        softAssert.assertFalse(nativeViewCHARMSParticipantConsentPage.rasStudyConsentParentGuardian1SignedDropDown.isDisplayed());
    }

    /**
     * PI verifies that the fields ConsentAssent Obtained Before Study Procedures and Copy of SignedDated ConsentAssent
     * Given to Participant must be answered before clicking Sign and Complete. This method waits for the Sign and
     * Complete button to be clickable, then clicks on it. It also verifies that specific messages appear on the page
     * prompting the PI to mark whether the Consent/Assent was obtained before study procedures and if the copy of
     * signed/dated Consent/Assent was given to the participant. The method then selects 'Yes' from dropdown menus
     * corresponding to these fields, logs screenshots, and clicks on the Sign and Complete button again after the
     * selections are made. Finally, a sleep timeout is added for 2000 milliseconds before logging another screenshot.
     */
    @Given("PI verifies that the fields ConsentAssent Obtained Before Study Procedures and Copy of SignedDated ConsentAssent Given to Participant must be answered before clicking Sign and Complete")
    public void pi_verifies_that_the_fields_consent_assent_obtained_before_study_procedures_and_copy_of_signed_dated_consent_assent_given_to_participant_must_be_answered_before_clicking_sign_and_complete() {
        CommonUtils.waitForClickability(nativeViewCHARMSParticipantConsentPage.rasStudyConsentSignAndCompleteButton);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentSignAndCompleteButton);
        CommonUtils.waitForVisibility(locateByXpath("//div[@id='output_messages']//div[contains(@role,'region')]//div[1]//span[2]"));
        softAssert.assertEquals(locateByXpath("//div[@id='output_messages']//div[contains(@role,'region')]//div[1]//span[2]").getText(), "Please mark whether the Consent/Assent was Obtained Before Study Procedures.");
        softAssert.assertEquals(locateByXpath("//div[@id='output_messages']//div[2]//span[2]").getText(), "Please mark whether the Copy of Signed/Dated Consent/Assent was Given to Participant.");
        CommonUtils.sleep(500);
        CucumberLogUtils.logScreenshot();
        CucumberLogUtils.scenario.log("* * * * CONSENT/ASSENT OBTAINED BEFORE STUDY PROCEDURES * * * *");
        CommonUtils.selectDropDownValue("Yes", nativeViewCHARMSParticipantConsentPage.rasStudyConsentConsentAssentObtainedBeforeStudyProceduresDropDown);
        CucumberLogUtils.scenario.log("* * * * COPY OF SIGNED/DATED CONSENT/ASSENT GIVEN TO PARTICIPANT * * * *");
        CommonUtils.selectDropDownValue("Yes", nativeViewCHARMSParticipantConsentPage.rasStudyConsentCopyOfSignedDatedConsentAssentGivenToParticipantDropDown);
        CucumberLogUtils.logScreenshot();
        CommonUtils.waitForClickability(nativeViewCHARMSParticipantConsentPage.rasStudyConsentSignAndCompleteButton);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentSignAndCompleteButton);
        CommonUtils.sleep(2000);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * Signs the PI into the Native View and completes consent by signing.
     *
     * @param sheetName the name of the sheet containing participant consent record
     */
    @Then("PI signs into to Native View and completes consent by signing {string}")
    public void pi_signs_into_to_native_view_and_completes_consent_by_signing(String sheetName) {
        study_team_member_logs_in_to_native_view_and_navigates_to_participant_consent_record(sheetName);
        CucumberLogUtils.scenario.log("* * * * CONSENT/ASSENT OBTAINED BEFORE STUDY PROCEDURES * * * *");
        CommonUtils.selectDropDownValue("Yes", nativeViewCHARMSParticipantConsentPage.rasStudyConsentConsentAssentObtainedBeforeStudyProceduresDropDown);
        CucumberLogUtils.scenario.log("* * * * COPY OF SIGNED/DATED CONSENT/ASSENT GIVEN TO PARTICIPANT * * * *");
        CommonUtils.selectDropDownValue("Yes", nativeViewCHARMSParticipantConsentPage.rasStudyConsentCopyOfSignedDatedConsentAssentGivenToParticipantDropDown);
        CucumberLogUtils.logScreenshot();
        CommonUtils.waitForClickability(nativeViewCHARMSParticipantConsentPage.rasStudyConsentSignAndCompleteButton);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentSignAndCompleteButton);
        CommonUtils.sleep(2000);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * Navigates to the Participant Studies section in Native View Participant Details.
     */
    @Given("Study Team member navigates to Participant Studies")
    public void study_team_member_navigates_to_participant_studies() {
        CommonUtils.sleep(2000);
        JavascriptUtils.scrollIntoView(nativeViewCHARMSAddNewParticipantPage.participantStudiesTab);
        CommonUtils.clickOnElement(nativeViewCHARMSAddNewParticipantPage.participantStudiesTab);
        CommonUtils.hoverOverElement(locateByXpath("//*[@glide_table='x_naci_family_coho_participant_study']//child::tbody//child::tr//child::td[5]"));
        CommonUtils.sleep(500);
        CommonUtils.clickOnElement(locateByXpath("//*[@glide_table='x_naci_family_coho_participant_study']//child::tbody//child::tr//child::td[2]//child::a"));
        CommonUtils.sleep(500);
        CommonUtils.waitForClickability(locateByXpath("//a[normalize-space()='Open Record']"));
        CommonUtils.sleep(200);
        JavascriptUtils.clickByJS(locateByXpath("//a[normalize-space()='Open Record']"));
        CucumberLogUtils.logScreenshot();
        CommonUtils.sleep(800);
    }

    /**
     * Study Team member creates a new Subject Flags and verifies that the field IBMFS Affected Status displays if the specified study is Fanconi or Bone Marrow Failure Syndrome.
     *
     * @param study the study type to verify the IBMFS Affected Status field for (e.g. "Fanconi" or "Bone Marrow Failure Syndrome")
     */
    @Then("Study Team member creates a new Subject Flags and verifies that the field IBMFS Affected Status displays if the {string} is Fanconi or Bone Marrow Failure Syndrome")
    public void study_team_member_creates_a_new_subject_flags_and_verifies_that_the_field_ibmfs_affected_status_displays_if_the_is_fanconi_or_bone_marrow_failure_syndrome(String study) {
        CommonUtils.sleep(800);
        JavascriptUtils.scrollIntoView(locateByXpath("//span[@class='tab_caption_text'][normalize-space()='Subject Flags']"));
        JavascriptUtils.clickByJS(locateByXpath("//span[@class='tab_caption_text'][contains(text(), 'Subject Flags')]"));
        CommonUtils.sleep(800);
        CommonUtils.hoverOverElement(locateByXpath("//*[@data-list_id='x_naci_family_coho_participant_study.x_naci_family_coho_subject_flag.participant_study']//child::tbody//child::tr//child::td[5]"));
        CommonUtils.sleep(500);
        CommonUtils.clickOnElement(locateByXpath("//*[@data-list_id='x_naci_family_coho_participant_study.x_naci_family_coho_subject_flag.participant_study']//child::tbody//child::tr//child::td[2]//child::a"));
        CommonUtils.sleep(500);
        CommonUtils.waitForClickability(locateByXpath("//a[normalize-space()='Open Record']"));
        CommonUtils.sleep(200);
        JavascriptUtils.clickByJS(locateByXpath("//a[normalize-space()='Open Record']"));

        if (study.equalsIgnoreCase("Fanconi") || study.equalsIgnoreCase("Bone Marrow Failure Syndrome")) {
            CommonUtils.waitForVisibility(nativeViewCHARMSSubjectFlagsPage.IBMFSAffectedStatusText);
            softAssert.assertEquals(nativeViewCHARMSSubjectFlagsPage.IBMFSAffectedStatusText.getText(), "IBMFS Affected Status");
            softAssert.assertTrue(locateByXpath("//span[@id='status.x_naci_family_coho_subject_flag.ibmfs_affected_status']").getAttribute("data-dynamic-title").equals("Mandatory - must be populated before Submit"));
            softAssert.assertEquals(nativeViewCHARMSSubjectFlagsPage.IBMFSAffectedStatusDropDown.getAttribute("aria-required"), "true", "* * * * * ERROR: IBMFS Affected Status dropdown is not displayed. * * * * *");
            nativeViewCHARMSSubjectFlagsPage.saveButton.click();
            CommonUtils.waitForVisibility(nativeViewCHARMSSubjectFlagsPage.IBMFSAffectedStatusNotFilledInErrorText);
            softAssert.assertEquals(nativeViewCHARMSSubjectFlagsPage.IBMFSAffectedStatusNotFilledInErrorText.getText(), "The following mandatory fields are not filled in: IBMFS Affected Status");
        } else {
            softAssert.assertTrue(locateByXpath("//span[@id='status.x_naci_family_coho_subject_flag.ibmfs_affected_status']").getAttribute("data-dynamic-title").equals(""));
            softAssert.assertEquals(nativeViewCHARMSSubjectFlagsPage.IBMFSAffectedStatusDropDown.getAttribute("aria-required"), "false", "* * * * * ERROR: IBMFS Affected Status dropdown should NOT display for this study. * * * *");
        }
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(nativeViewCHARMSSubjectFlagsPage.previewRecordForFieldStudyButton);
        CommonUtils.sleep(500);
        CommonUtils.waitForVisibility(locateByXpath("//input[@id='sys_readonly.x_naci_family_coho_mock_up_study.study_name']"));
        softAssert.assertEquals(locateByXpath("//input[@id='sys_readonly.x_naci_family_coho_mock_up_study.study_name']").getAttribute("value"), study);
        CommonUtils.sleep(500);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method creates a new Subject Flags entry with the specified values.
     *
     * @param study                    the name of the study associated with the subject
     * @param participationStatus      the participation status of the subject
     * @param holdNonParticipationDate the date for hold/non-participation, if applicable
     */
    @Then("Study Team member creates a new Subject Flags with the values: Study {string}, Participation Status {string}, Hold Non-Participation Date {string}")
    public void study_team_member_creates_a_new_subject_flags(String study, String participationStatus, String holdNonParticipationDate) {
        String participantName = locateByXpath("//input[@aria-labelledby='label.x_naci_family_coho_participant_study.participant']").getAttribute("value");
        JavascriptUtils.scrollIntoView(locateByXpath("//span[@class='tab_caption_text'][contains(text(), 'Subject Flags')]"));
        JavascriptUtils.clickByJS(locateByXpath("//span[@class='tab_caption_text'][contains(text(), 'Subject Flags')]"));
        JavascriptUtils.clickByJS(locateByXpath("//div[@aria-label='Subject Flags, filtering toolbar']//button[@value='sysverb_new'][normalize-space()='New']"));
        CommonUtils.sleep(800);
        CommonUtils.sendKeys(nativeViewCHARMSSubjectFlagsPage.studyTextbox, study);
        locateByXpath("//button[@aria-label='Look up value for field: Participant']").click();
        CommonUtils.sleep(1000);
        CommonUtils.switchToAnotherTabWindow();
        locateByXpath("//input[@aria-label='Search']").sendKeys(participantName);
        CommonUtils.sleep(800);
        locateByXpath("//a[@role='button'][normalize-space()='" + participantName + "']").click();
        CommonUtils.switchToNextWindow();
        CommonUtils.switchToFrame(NativeView_SideDoor_Dashboard_Page.nativeViewiFrame);
        CommonUtils.sleep(800);
        CommonUtils.waitForClickability(nativeViewCHARMSSubjectFlagsPage.participationStatusDropdown);
        CommonUtils.selectDropDownValue(participationStatus, nativeViewCHARMSSubjectFlagsPage.participationStatusDropdown);
        if (participationStatus.equals("Hold")) {
            CommonUtils.waitForVisibility(nativeViewCHARMSSubjectFlagsPage.holdReasonTextbox);
            nativeViewCHARMSSubjectFlagsPage.holdReasonTextbox.sendKeys("Hold reason test.");
            nativeViewCHARMSSubjectFlagsPage.holdNonParticipationDateCalendar.click();
            CommonUtils.sleep(500);
            if (holdNonParticipationDate.equals("Today")) {
                nativeViewCHARMSSubjectFlagsPage.goToTodayCalendarButton.click();
            } else {
                CommonUtils.sleep(500);
                locateByXpath("//a[@class='calOtherMonthDateAnchor'][text()='1']").click();
            }
        } else if (participationStatus.equals("Not Participating")) {
            CommonUtils.selectDropDownValue("Other Reason", nativeViewCHARMSSubjectFlagsPage.nonParticipationReasonDropdown);
            CommonUtils.waitForVisibility(nativeViewCHARMSSubjectFlagsPage.otherReasonTextbox);
            nativeViewCHARMSSubjectFlagsPage.otherReasonTextbox.sendKeys("Other reason test.");
            nativeViewCHARMSSubjectFlagsPage.holdNonParticipationDateCalendar.click();
            CommonUtils.sleep(500);
            if (holdNonParticipationDate.equals("Today")) {
                nativeViewCHARMSSubjectFlagsPage.goToTodayCalendarButton.click();
            } else {
                CommonUtils.sleep(500);
                locateByXpath("//a[@class='calOtherMonthDateAnchor'][text()='1']").click();
            }
        }
        CommonUtils.selectDropDownValue("Adult", nativeViewCHARMSSubjectFlagsPage.ageGroupDropdown);
        CucumberLogUtils.logScreenshot();
        RAS_Common_Methods.verifySubjectFlagsFields(study, participationStatus);
        nativeViewCHARMSSubjectFlagsPage.submitButton.click();
        CommonUtils.sleep(1000);
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.scrollIntoView(locateByXpath("//span[@class='tab_caption_text'][contains(text(), 'Subject Flags')]"));
        ((JavascriptExecutor) WebDriverUtils.webDriver).executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'nearest', inline: 'end'});", locateByXpath("//i[@aria-label='Hold/Non-Participation Date column options']"));
        CommonUtils.sleep(1000);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * Study Team syncs fields in Subject Flags and verifies their values based on the provided parameters.
     *
     * @param expectedParticipantName           The expected participant name for verification.
     * @param expectedStudy                     The expected study for verification.
     * @param expectedParticipationStatus1      The expected participation status for the first row in verification.
     * @param expectedParticipationStatus2      The expected participation status for the second row in verification.
     * @param expectedHoldNonParticipationDate1 The expected hold non-participation date for the first row in verification.
     * @param expectedHoldNonParticipationDate2 The expected hold non-participation date for the second row in verification.
     */
    @Then("Study Team syncs fields and verifies their values: Participant Name {string}, Study {string}, Participation Status {string} {string}, Hold Non-Participation Date {string} {string}")
    public void study_team_syncs_fields_and_verifies_their_values(String expectedParticipantName, String expectedStudy, String expectedParticipationStatus1, String expectedParticipationStatus2, String expectedHoldNonParticipationDate1, String expectedHoldNonParticipationDate2) {
        WebDriverUtils.webDriver.navigate().refresh();
        CommonUtils.sleep(2000);
        CommonUtils.switchToFrame(NativeView_SideDoor_Dashboard_Page.nativeViewiFrame);
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.scrollIntoView(locateByXpath("//span[@role='tab']/span[contains(text(), 'Subject Flags')]"));
        JavascriptUtils.clickByJS(locateByXpath("//span[@role='tab']/span[contains(text(), 'Subject Flags')]"));
        CommonUtils.sleep(800);
        CucumberLogUtils.logScreenshot();
        verifySubjectFlagsColumns();
        ((JavascriptExecutor) WebDriverUtils.webDriver).executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'nearest', inline: 'end'});", locateByXpath("//i[@aria-label='Hold/Non-Participation Date column options']"));
        CommonUtils.sleep(800);
        CucumberLogUtils.logScreenshot();
        String sf1Row = locateByXpath("//a[normalize-space()='" + expectedParticipationStatus1 + "']/parent::td/parent::tr").getAttribute("class");
        String sf2Row = locateByXpath("//a[normalize-space()='" + expectedParticipationStatus2 + "']/parent::td/parent::tr").getAttribute("class");
        locateByXpath("//tr[@class='" + sf1Row + "']//a[@aria-label='Open record: " + expectedParticipantName + "'][normalize-space()='" + expectedParticipantName + "']");
        JavascriptUtils.clickByJS(locateByXpath("//a[normalize-space()='" + expectedParticipationStatus1 + "']/parent::td/preceding-sibling::td[3]/a[@aria-label='Preview record: " + expectedParticipantName + "']"));
        CommonUtils.sleep(1000);
        locateByXpath("//a[normalize-space()='Open Record']").click();
        CommonUtils.sleep(1000);
        CucumberLogUtils.logScreenshot();
        nativeViewCHARMSSubjectFlagsPage.syncUpdatesToRelatedRecordsButton.click();
        CucumberLogUtils.logScreenshot();
        CommonUtils.waitForClickability(nativeViewCHARMSSubjectFlagsPage.alertYesContinueButton);
        softAssert.assertEquals(nativeViewCHARMSSubjectFlagsPage.syncUpdatesToRelatedRecordsAlertText.getText(), "This action will sync subject flags across all CGB study records associated with this individual. Do you wish to continue?");
        softAssert.assertEquals(nativeViewCHARMSSubjectFlagsPage.alertNoCancelButton.getText(), "No, cancel");
        softAssert.assertEquals(nativeViewCHARMSSubjectFlagsPage.alertYesContinueButton.getText(), "Yes, continue");
        nativeViewCHARMSSubjectFlagsPage.alertYesContinueButton.click();
        CommonUtils.sleep(500);
        softAssert.assertTrue(nativeViewCHARMSSubjectFlagsPage.syncCompleteForRelatedSubjectFlagRecordsMessage.isDisplayed());
        softAssert.assertEquals(nativeViewCHARMSSubjectFlagsPage.syncCompleteForRelatedSubjectFlagRecordsMessage.getText(), "Sync complete for related subject flag records!");
        CucumberLogUtils.logScreenshot();
        nativeViewCHARMSSubjectFlagsPage.backButton.click();
        JavascriptUtils.scrollIntoView(locateByXpath("//span[@class='tab_caption_text'][contains(text(), 'Subject Flags')]"));
        JavascriptUtils.clickByJS(locateByXpath("//span[@class='tab_caption_text'][contains(text(), 'Subject Flags')]"));
        CommonUtils.sleep(2000);
        CucumberLogUtils.scenario.log("* * * * SUBJECT FLAGS: VERIFYING STUDY AFTER SYNC * * * *");
        softAssert.assertEquals(locateByXpath("//tr[@class='" + sf1Row + "']//td[3]").getText(), expectedStudy);
        softAssert.assertEquals(locateByXpath("//tr[@class='" + sf2Row + "']//td[3]").getText(), expectedStudy);
        CucumberLogUtils.scenario.log("* * * * SUBJECT FLAGS: VERIFYING PARTICIPANT NAME AFTER SYNC  * * * *");
        softAssert.assertEquals(locateByXpath("//tr[@class='" + sf1Row + "']//td[4]").getText(), expectedParticipantName);
        softAssert.assertEquals(locateByXpath("//tr[@class='" + sf2Row + "']//td[4]").getText(), expectedParticipantName);
        CucumberLogUtils.scenario.log("* * * * SUBJECT FLAGS: VERIFYING PARTICIPANT STATUS AFTER SYNC  * * * *");
        softAssert.assertEquals(locateByXpath("//tr[@class='" + sf1Row + "']//td[5]").getText(), expectedParticipationStatus1);
        softAssert.assertEquals(locateByXpath("//tr[@class='" + sf2Row + "']//td[5]").getText(), expectedParticipationStatus1);
        CucumberLogUtils.logScreenshot();
        ((JavascriptExecutor) WebDriverUtils.webDriver).executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'nearest', inline: 'end'});", locateByXpath("//i[@aria-label='Hold/Non-Participation Date column options']"));
        CommonUtils.sleep(800);
        CucumberLogUtils.scenario.log("* * * * SUBJECT FLAGS: HOLD/NON-PARTICIPATION DATE AFTER SYNC  * * * *");
        CucumberLogUtils.logScreenshot();
        if (expectedHoldNonParticipationDate1.equalsIgnoreCase("Today") && expectedHoldNonParticipationDate2.isEmpty()) {
            softAssert.assertEquals(locateByXpath("//tr[@class='" + sf1Row + "']//td[10]").getText(), CommonUtils.getTodayDate());
            softAssert.assertEquals(locateByXpath("//tr[@class='" + sf2Row + "']//td[10]").getText(), CommonUtils.getTodayDate());
        }
        if (expectedHoldNonParticipationDate1.isEmpty() && expectedHoldNonParticipationDate2.equalsIgnoreCase("Today")) {
            softAssert.assertEquals(locateByXpath("//tr[@class='" + sf1Row + "']//td[10]").getText(), "");
            softAssert.assertEquals(locateByXpath("//tr[@class='" + sf2Row + "']//td[10]").getText(), CommonUtils.getTodayDate());
        }
        if (expectedHoldNonParticipationDate1.equalsIgnoreCase("1st of Next Month") && expectedHoldNonParticipationDate2.equalsIgnoreCase("Today")) {
            softAssert.assertEquals(locateByXpath("//tr[@class='" + sf1Row + "']//td[10]").getText(), RAS_Common_Methods.getFirstDayNextMonth());
            softAssert.assertEquals(locateByXpath("//tr[@class='" + sf2Row + "']//td[10]").getText(), RAS_Common_Methods.getFirstDayNextMonth());
        }
    }

    /**
     * This method is used to simulate a Study Team member creating new Subject Flags and verifying that the audit trail history is displayed correctly.
     * It retrieves the participant's name, sets the expected values for the audit trail, navigates to the Subject Flags section, creates a new flag,
     * sets various dropdown values, saves the changes, and then verifies that the audit trail values match the expected values.
     */
    @Then("Study Team member creates new Subject Flags and verifies that the audit trail history displays")
    public void study_team_member_creates_new_subject_flags_and_verifies_that_the_audit_trail_history_displays() {
        String participantName = locateByXpath("//input[@aria-labelledby='label.x_naci_family_coho_participant_study.participant']").getAttribute("value");
        CommonUtils.sleep(1000);
        Map<String, String> actualAuditTrailValues = new HashMap<>();
        Map<String, String> expectedAuditTrailValues = new HashMap<>(
                Map.ofEntries(
                        Map.entry("Participant", participantName),
                        Map.entry("Participant Study", participantName),
                        Map.entry("Study", "RASopathy"),
                        Map.entry("Participation Status", "Participating"),
                        Map.entry("Age Group", "Adult"),
                        Map.entry("Eligible for Clinic", "Yes")
                )
        );
        JavascriptUtils.scrollIntoView(locateByXpath("//span[@class='tab_caption_text'][contains(text(), 'Subject Flags')]"));
        JavascriptUtils.clickByJS(locateByXpath("//span[@class='tab_caption_text'][contains(text(), 'Subject Flags')]"));
        JavascriptUtils.clickByJS(locateByXpath("//div[@aria-label='Subject Flags, filtering toolbar']//button[@value='sysverb_new'][normalize-space()='New']"));
        CommonUtils.sleep(800);
        locateByXpath("//button[@aria-label='Look up value for field: Participant']").click();
        CommonUtils.sleep(1000);
        CommonUtils.switchToAnotherTabWindow();
        locateByXpath("//input[@aria-label='Search']").sendKeys(participantName);
        CommonUtils.sleep(800);
        locateByXpath("//a[@role='button'][normalize-space()='" + participantName + "']").click();
        CommonUtils.switchToNextWindow();
        CommonUtils.switchToFrame(NativeView_SideDoor_Dashboard_Page.nativeViewiFrame);
        CommonUtils.sleep(800);
        CommonUtils.waitForClickability(nativeViewCHARMSSubjectFlagsPage.participationStatusDropdown);
        CommonUtils.selectDropDownValue(expectedAuditTrailValues.get("Participation Status"), nativeViewCHARMSSubjectFlagsPage.participationStatusDropdown);
        CommonUtils.selectDropDownValue(expectedAuditTrailValues.get("Age Group"), nativeViewCHARMSSubjectFlagsPage.ageGroupDropdown);
        CommonUtils.selectDropDownValue(expectedAuditTrailValues.get("Eligible for Clinic"), nativeViewCHARMSSubjectFlagsPage.eligibleForClinicDropdown);
        CucumberLogUtils.logScreenshot();
        nativeViewCHARMSSubjectFlagsPage.saveButton.click();
        CommonUtils.sleep(1000);
        CucumberLogUtils.logScreenshot();
        CommonUtils.scrollIntoView(locateByXpath("//div[@class='activity-stream-label-counter']"));
        for (int i = 1; i <= expectedAuditTrailValues.size(); i++) {
            String key = locateByXpath("//ul[@class='sn-widget-list sn-widget-list-table']/li[" + i + "]/span[1]").getText();
            String value = locateByXpath("//ul[@class='sn-widget-list sn-widget-list-table']/li[" + i + "]/span[2]").getText();
            actualAuditTrailValues.put(key, value);
        }
        softAssert.assertEquals(actualAuditTrailValues, expectedAuditTrailValues);
        CommonUtils.sleep(800);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * Logs in to Native View and types the provided filter query into the Filter Navigator.
     *
     * @param filterQuery the filter query to be typed into the Filter Navigator
     */
    @Given("Study Team member logs in to Native View and types {string} into the Filter Navigator")
    public void study_team_member_logs_in_to_native_view_and_types_into_the_filter_navigator(String filterQuery) {
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        CommonUtils.sleep(4000);
        CommonUtils.waitForVisibility(NativeView_SideDoor_Dashboard_Page.filterNavigatorTextBox);
        NativeView_SideDoor_Dashboard_Page.filterNavigatorTextBox.sendKeys(filterQuery);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * Clicks the link for the specified table in the Native View dashboard.
     *
     * @param linkText the text of the link to be clicked
     */
    @Given("clicks the link for the {string} table")
    public void clicks_the_link_for_the_NV_table(String linkText) {
        NativeView_SideDoor_Dashboard_Page.dynamicFilterNavigatorTextSearch(linkText).click();
        CommonUtils.sleep(3000);
        CommonUtils.switchToFrame(NativeView_SideDoor_Dashboard_Page.nativeViewiFrame);
        CommonUtils.sleep(2000);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * Verifies if the columns displayed in the list view of the table match the expected columns.
     */
    @Then("Study Team member verifies the columns displayed in the list view of the Participant Studies table")
    public void study_team_member_verifies_the_columns_displayed_in_the_list_view_of_the_participant_studies_table() {
        softAssert.assertEquals(RAS_Common_Methods.getTableListViewColumns(), Native_View_Constants.participantStudiesListViewColumns, "---- TABLE LIST VIEW COLUMNS DO NOT MATCH ----");
        CucumberLogUtils.logScreenshot();
    }

    /**
     * Opens the first record in the Participant Studies table
     */
    @Given("Study Team member opens the first Participant Studies record")
    public void study_team_member_opens_first_participant_studies_record() {
        CommonUtils.sleep(2000);
        JavascriptUtils.clickByJS(locateByXpath("(//*[@class='btn btn-icon table-btn-lg icon-info list_popup'])[1]"));
        CommonUtils.sleep(1000);
        CommonUtils.waitForClickability(locateByXpath("//a[normalize-space()='Open Record']"));
        JavascriptUtils.clickByJS(locateByXpath("//a[normalize-space()='Open Record']"));
        CucumberLogUtils.logScreenshot();
        CommonUtils.sleep(2000);
    }

    /**
     * Verifies the presence and visibility of various fields in the Participant Studies record.
     * Checks if specific elements such as labels and dropdown options are displayed on the page.
     */
    @Then("verifies fields in the Participant Studies record")
    public void verifies_fields_in_the_participant_studies_record() {
        softAssert.assertTrue(locateByXpath("//span[@class='label-text'][normalize-space()='Participant']").isDisplayed());
        softAssert.assertTrue(locateByXpath("//span[normalize-space()='Subject ID']").isDisplayed());
        softAssert.assertTrue(locateByXpath("//span[normalize-space()='NIH MRN number']").isDisplayed());
        softAssert.assertTrue(locateByXpath("//span[@class='label-text'][normalize-space()='Screener']").isDisplayed());
        softAssert.assertTrue(locateByXpath("//span[@class='label-text'][normalize-space()='IIQ']").isDisplayed());
        if (locateByXpath("//input[@id='sys_display.x_naci_family_coho_participant_study.study']").getDomAttribute("value").equalsIgnoreCase("Fanconi")) {
            softAssert.assertTrue(locateByXpath("//span[contains(text(),'FA Survey')]").isDisplayed());
        }
        softAssert.assertTrue(locateByXpath("//span[@class='label-text'][normalize-space()='Available Questionnaires']").isDisplayed());
        softAssert.assertTrue(locateByXpath("//span[@class='label-text'][normalize-space()='Study']").isDisplayed());
        softAssert.assertTrue(locateByXpath("//span[@class='label-text'][normalize-space()='Cohort']").isDisplayed());
        RAS_Common_Methods.softAssertDropdownOptions(locateByXpath("//select[@id='x_naci_family_coho_participant_study.cohort']"), Native_View_Constants.consentRecordCohortDropdownOptions, "---- VERIFYING COHORT OPTIONS IN PARTICIPANT STUDIES RECORD ----");
        softAssert.assertTrue(locateByXpath("//span[@class='label-text'][normalize-space()='Study Sub Categories']").isDisplayed());
        softAssert.assertTrue(locateByXpath("//span[@class='label-text'][normalize-space()='Eligibility Status']").isDisplayed());
        softAssert.assertTrue(locateByXpath("//span[@class='label-text'][normalize-space()='Enrollment Status']").isDisplayed());
        softAssert.assertTrue(locateByXpath("//span[@class='label-text'][normalize-space()='Screener Complete']").isDisplayed());
        softAssert.assertTrue(locateByXpath("//span[@class='label-text'][normalize-space()='IIQ Complete']").isDisplayed());
        softAssert.assertTrue(locateByXpath("//span[@class='label-text'][normalize-space()='Study Survey Complete']").isDisplayed());
        softAssert.assertTrue(locateByXpath("//span[@class='label-text'][normalize-space()='Ever Consented']").isDisplayed());
        softAssert.assertTrue(locateByXpath("//span[@class='label-text'][normalize-space()='Ever Assented']").isDisplayed());
        softAssert.assertTrue(locateByXpath("//span[@class='label-text'][normalize-space()='MRR Complete']").isDisplayed());
        CucumberLogUtils.logScreenshot();
    }

    /**
     * Waits for the Back button to be clickable and then clicks it to navigate to the previous page.
     */
    @Then("clicks the Back button")
    public void clicks_the_back_button() {
        CommonUtils.waitForClickability(locateByCssSelector("button[aria-label='Back']"));
        locateByCssSelector("button[aria-label='Back']").click();
    }

    /**
     * Adds a specific survey from the available Questionnaires section.
     *
     * @param surveyName The name of the survey to be added.
     */
    @When("adds {string} from the Available Questionnaires")
    public void adds_from_the_available_questionnaires(String surveyName) {
        CommonUtils.waitForClickability(nativeViewCHARMSParticipantStudyPage.availableQuestionnairesButton);
        nativeViewCHARMSParticipantStudyPage.availableQuestionnairesButton.click();
        CommonUtils.sleep(1000);
        CommonUtils.waitForClickability(nativeViewCHARMSParticipantStudyPage.availableQuestionnairesRecordSelectTextBox);
        CommonUtils.sendKeys(nativeViewCHARMSParticipantStudyPage.availableQuestionnairesRecordSelectTextBox, surveyName);
        CommonUtils.sendKeys(nativeViewCHARMSParticipantStudyPage.availableQuestionnairesRecordSelectTextBox, Keys.ENTER);
        CommonUtils.sleep(800);
        JavascriptUtils.clickByJS(nativeViewCHARMSParticipantStudyPage.availableQuestionnairesLockButton);
        CommonUtils.sleep(800);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * Initiates the process of publishing questionnaires by a Study Team member.
     */
    @Given("Study Team member publishes questionnaires")
    public void study_team_member_publishes_questionnaires() {
        CommonUtils.waitForClickability(nativeViewCHARMSParticipantStudyPage.saveButton);
        nativeViewCHARMSParticipantStudyPage.saveButton.click();
        CommonUtils.waitForClickability(nativeViewCHARMSParticipantStudyPage.publishQuestionnaireButton);
        nativeViewCHARMSParticipantStudyPage.publishQuestionnaireButton.click();
        CommonUtils.sleep(800);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * Submits the Physical Activities Survey.
     * This method interacts with the user interface to submit the Physical Activities Survey by selecting various options and filling out necessary information.
     * It clicks on checkboxes, dropdowns, and radio buttons representing different physical activities and time spent on each activity in a survey form.
     */
    @Given("submits the Physical Activities Survey")
    public void submits_the_physical_activities_survey() {
        CommonUtils.waitForVisibility(locateByXpath("//span[normalize-space()='In the past 12 months how often did you walk or hike for exercise?']"));
        JavascriptUtils.scrollIntoView(locateByXpath("//span[normalize-space()='In the past 12 months how often did you walk or hike for exercise?']"));
        MyRASPhysicalActivitiesSurvey.dropdownSelectorDuringPast12MonthsHowOften("In the past 12 months how often did you walk or hike for exercise?", "Once a month or less");
        MyRASPhysicalActivitiesSurvey.dropdownSelectorDuringPast12MonthsHowOften("On the days that you walked or hiked, about how much time per day did you spend doing this activity?", "1 hour");
        MyRASPhysicalActivitiesSurvey.dropdownSelectorDuringPast12MonthsHowOften("Light household chores (such as cooking, tidying up, laundry, or dusting)", "Never");
        MyRASPhysicalActivitiesSurvey.dropdownSelectorDuringPast12MonthsHowOften("Moderate to Vigorous household chores (such as vacuuming or sweeping)", "Once a month or less");
        MyRASPhysicalActivitiesSurvey.dropdownSelectorDuringPast12MonthsHowOften("Caring for pets (walking dogs, feeding, playing, grooming)", "2 to 3 days per month");
        MyRASPhysicalActivitiesSurvey.dropdownSelectorDuringPast12MonthsHowOften("Caring for children or adults (pushing stroller or wheelchair, lifting, bathing)", "1 to 2 days per week");
        MyRASPhysicalActivitiesSurvey.dropdownSelectorDuringPast12MonthsHowOften("Walking while shopping or doing errands (do not count walking for exercise)", "3 to 4 days per week");
        CommonUtils.sleep(500);
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.scrollIntoView(locateByXpath("//span[@role='heading'][normalize-space()='When you did household tasks or shopping, how much time per day did you spend doing each activity?']"));
        MyRASPhysicalActivitiesSurvey.dropdownSelectorHowMuchTimePerDay("Light household chores (such as cooking, cleaning up, laundry, or dusting.)", "15 minutes or less");
        MyRASPhysicalActivitiesSurvey.dropdownSelectorHowMuchTimePerDay("Moderate to vigorous household chores (such as vacuuming or sweeping)", "16 to 30 minutes");
        MyRASPhysicalActivitiesSurvey.dropdownSelectorHowMuchTimePerDay("Caring for pets (walking dogs, feeding, playing, grooming)", "31 to 44 minutes");
        MyRASPhysicalActivitiesSurvey.dropdownSelectorHowMuchTimePerDay("Caring for children or adults (pushing stroller or wheelchair, lifting, bathing)", "45 to 59 minutes");
        MyRASPhysicalActivitiesSurvey.dropdownSelectorHowMuchTimePerDay("Walking while shopping or doing errands (do not count walking for exercise)", "1 hour");
        CommonUtils.sleep(500);
        CucumberLogUtils.logScreenshot();
        MyRASPhysicalActivitiesSurvey.dropdownSelectorDidYouDoAnyOfTheseOutsideOfWork("Moderate outdoor chores (such as weeding, raking or mowing the lawn)", "Yes");
        MyRASPhysicalActivitiesSurvey.dropdownSelectorDidYouDoAnyOfTheseOutsideOfWork("Vigorous outdoor chores (such as digging, carrying lumber, or snow shoveling)", "No");
        MyRASPhysicalActivitiesSurvey.dropdownSelectorDidYouDoAnyOfTheseOutsideOfWork("Home repair (such as painting, plumbing, or replacing carpeting)", "Yes");
        CommonUtils.clickOnElement(locateByXpath("//div[@id='select_age_range']//span[@class='type-choice field-actual question-width']"));
        CommonUtils.waitForClickability(locateByXpath("//ul[@aria-label='Select Age Group']//div[contains(text(), '25-34')]"));
        locateByXpath("//ul[@aria-label='Select Age Group']//div[contains(text(), '25-34')]").click();
        CommonUtils.clickOnElement(locateByXpath("//div[@id='frequency_stren_activities']//div[contains(@class,'form-group ng-scope ng-isolate-scope')]"));
        CommonUtils.waitForClickability(locateByXpath("//ul[@aria-label='Average Hours per week']//div[text()='1-3 hours']"));
        locateByXpath("//ul[@aria-label='Average Hours per week']//div[text()='1-3 hours']").click();
        CommonUtils.clickOnElement(locateByXpath("//div[@id='select_age_group_2']//span[contains(@class,'type-choice field-actual question-width')]"));
        CommonUtils.waitForClickability(locateByXpath("//ul[@aria-label='Select Age Group']//div[text()='25-34']"));
        locateByXpath("//ul[@aria-label='Select Age Group']//div[text()='25-34']").click();
        CommonUtils.clickOnElement(locateByXpath("//div[@id='average_hours_per_week_2']//div[contains(@class,'form-group ng-scope ng-isolate-scope')]"));
        CommonUtils.waitForClickability(locateByXpath("//ul[@aria-label='Average Hours per week']//div[text()='More than 3 hours']"));
        locateByXpath("//ul[@aria-label='Average Hours per week']//div[text()='More than 3 hours']").click();
        CommonUtils.sleep(500);
        CucumberLogUtils.logScreenshot();
        myRASPhysicalActivitiesSurvey.submitButton.click();
        CommonUtils.sleep(1000);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * Submits the Smoking Survey by initializing data, selecting radio buttons and dropdown values.
     */
    @Given("submits the Smoking Survey Survey")
    public void submits_the_smoking_survey_survey() {
        ras_Survey_Smoking_Survey_TestDataManager.dataInitializerSmokingSurvey("RASSmokingSurvey");
        CommonUtils.sleep(500);
        MyRASSmokingSurveyPage.dynamicRadioButtonSelector(ras_Survey_Smoking_Survey_TestDataManager.HAVE_YOU_EVER_USED_ANY_OF_THESE_TOBACCO_PRODUCTS_EVEN_ONCE_SELECT_ALL_THAT_APPLY);
        CommonUtils.selectDropDownValue(ras_Survey_Smoking_Survey_TestDataManager.HOW_MANY_CIGARETTES_HAVE_YOU_SMOKED_IN_YOUR_LIFE_PROVIDE_AN_ESTIMATE, myRASSmokingSurveyPage.howManyCigarettesHaveYouSmokedInYourLifeSelectDropdown);
        CommonUtils.selectDropDownValue(ras_Survey_Smoking_Survey_TestDataManager.HOW_OLD_WERE_YOU_WHEN_YOU_FIRST_SMOKED_A_CIGARETTE, myRASSmokingSurveyPage.ageWhenYouFirstSmokedACigaretteSelectDropdown);
        CommonUtils.selectDropDownValue(ras_Survey_Smoking_Survey_TestDataManager.HOW_OLD_WERE_YOU_WHEN_YOU_STARTED_SMOKING_CIGARETTES_ON_A_REGULAR_BASIS, myRASSmokingSurveyPage.ageWhenStartedSmokingCigarettesOnARegularBasisSelectDropdown);
        myRASSmokingSurveyPage.howManyCigarettesHaveYouSmokedPerDayInputField.sendKeys(ras_Survey_Smoking_Survey_TestDataManager.ON_DAYS_THAT_YOU_SMOKE_SMOKED_HOW_MANY_CIGARETTES_DO_DID_YOU_SMOKE_PER_DAY);
        CommonUtils.sleep(500);
        CucumberLogUtils.logScreenshot();
        myRASSmokingSurveyPage.submitButton.click();
        CommonUtils.sleep(500);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * Study Team members logs in to Native View and verifies QBank data for a specific survey.
     *
     * @param surveyName the name of the survey for which QBank data needs to be verified
     */
    @Given("Study Team members logs in to Native View and verifies {string} QBank data")
    public void study_team_members_logs_in_to_native_view_and_verifies_qbank_data(String surveyName) {
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        CommonUtils.sleep(4000);
        CommonUtils.waitForVisibility(NativeView_SideDoor_Dashboard_Page.filterNavigatorTextBox);
        NativeView_SideDoor_Dashboard_Page.filterNavigatorTextBox.sendKeys("Participant Studies");
        CucumberLogUtils.logScreenshot();
        NativeView_SideDoor_Dashboard_Page.dynamicFilterNavigatorTextSearch("Participant Studies").click();
        CommonUtils.sleep(3000);
        CommonUtils.switchToFrame(NativeView_SideDoor_Dashboard_Page.nativeViewiFrame);
        CommonUtils.sleep(2000);
        CucumberLogUtils.logScreenshot();
        CommonUtils.hoverOverElement(participantDetailsPage.dynamicRecordButtonLocator(ras_Screener_TestDataManager.FIRST_NAME));
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(NativeViewCHARMSDashboardPage.nativeViewnewScreenerReceivedLocator(ras_Screener_TestDataManager.FIRST_NAME));
        CommonUtils.sleep(1000);
        if (CommonUtils.isElementDisplayed(nativeViewCHARMSDashboardPage.rasStudyOpenRecordButton)) {
            CucumberLogUtils.logScreenshot();
            CommonUtils.clickOnElement(nativeViewCHARMSDashboardPage.rasStudyOpenRecordButton);
        }
        CommonUtils.sleep(2000);
        JavascriptUtils.scrollIntoView(nativeViewCHARMSParticipantStudyPage.questionBanksTab);
        nativeViewCHARMSParticipantStudyPage.questionBanksTab.click();
        CucumberLogUtils.logScreenshot();
        CommonUtils.sleep(500);
        if (surveyName.equals("Patient Smoking History")) {
            CommonUtils.hoverOverElement(nativeViewCHARMSParticipantStudyPage.patientSmokingHistoryText);
            CommonUtils.waitForVisibility(nativeViewCHARMSParticipantStudyPage.questionBanksPreviewButton);
            nativeViewCHARMSParticipantStudyPage.questionBanksPreviewButton.click();
            CommonUtils.sleep(500);
            CucumberLogUtils.logScreenshot();
            CommonUtils.clickOnElement(nativeViewCHARMSDashboardPage.rasStudyOpenRecordButton);
            CommonUtils.sleep(500);
            verify_patient_smoking_history_in_native_view();
        } else if (surveyName.equals("Physical Activities Survey")) {
            CommonUtils.hoverOverElement(nativeViewCHARMSParticipantStudyPage.physicalActivitiesSurveyText);
            CommonUtils.waitForVisibility(nativeViewCHARMSParticipantStudyPage.questionBanksPreviewButton);
            nativeViewCHARMSParticipantStudyPage.questionBanksPreviewButton.click();
            CommonUtils.sleep(500);
            CucumberLogUtils.logScreenshot();
            CommonUtils.clickOnElement(nativeViewCHARMSDashboardPage.rasStudyOpenRecordButton);
            CommonUtils.sleep(500);
            verify_physical_activities_survey_in_native_view();
        }

    }

    /**
     * Method for verifying that Patient Smoking History in Native View matches the values provided by the QBankSurveys Excel sheet.
     */
    public void verify_patient_smoking_history_in_native_view() {
        softAssert.assertTrue(nativeViewCHARMSPatientSmokingHistoryPage.checkboxIsChecked(ras_Survey_Smoking_Survey_TestDataManager.HAVE_YOU_EVER_USED_ANY_OF_THESE_TOBACCO_PRODUCTS_EVEN_ONCE_SELECT_ALL_THAT_APPLY), "* * * * *  PATIENT SMOKING HISTORY -- CHECKBOX NOT CHECKED * * * * *");
        CommonUtils.verifyingDropDownValueIsSelected(nativeViewCHARMSPatientSmokingHistoryPage.howManyCigarettesHaveYouSmokedInYourLifeDropdown, ras_Survey_Smoking_Survey_TestDataManager.HOW_MANY_CIGARETTES_HAVE_YOU_SMOKED_IN_YOUR_LIFE_PROVIDE_AN_ESTIMATE, "* * * * *  PATIENT SMOKING HISTORY -- VALUE MISMATCH IN 'How many cigarettes have you smoked in your life? Provide an estimate.' DROPDOWN * * * * *");
        JavascriptUtils.scrollIntoView(nativeViewCHARMSPatientSmokingHistoryPage.ageAtFirstCigarette);
        CommonUtils.verifyingDropDownValueIsSelected(nativeViewCHARMSPatientSmokingHistoryPage.ageAtFirstCigarette, ras_Survey_Smoking_Survey_TestDataManager.HOW_OLD_WERE_YOU_WHEN_YOU_FIRST_SMOKED_A_CIGARETTE, "* * * * * PATIENT SMOKING HISTORY -- VALUE MISMATCH IN 'How old were you when you first smoked a cigarette?' DROPDOWN * * * * *");
        CommonUtils.verifyingDropDownValueIsSelected(nativeViewCHARMSPatientSmokingHistoryPage.ageAtRegularCigaretteUse, ras_Survey_Smoking_Survey_TestDataManager.HOW_OLD_WERE_YOU_WHEN_YOU_STARTED_SMOKING_CIGARETTES_ON_A_REGULAR_BASIS, "* * * * *  PATIENT SMOKING HISTORY -- VALUE MISMATCH IN 'How old were you when you started smoking cigarettes on a regular basis?' DROPDOWN * * * * *");
        softAssert.assertEquals(nativeViewCHARMSPatientSmokingHistoryPage.cigarettesPerDay.getDomAttribute("value"), ras_Survey_Smoking_Survey_TestDataManager.ON_DAYS_THAT_YOU_SMOKE_SMOKED_HOW_MANY_CIGARETTES_DO_DID_YOU_SMOKE_PER_DAY, "* * * * *  PATIENT SMOKING HISTORY -- VALUE MISMATCH IN 'On days that you [smoke/smoked] how many cigarettes [do/did] you smoke per day?' FIELD * * * * *");
    }

    /**
     * Method for verifying that Physical Activities Survey in Native View matches the values provided by the QBankSurveys Excel sheet.
     */
    public void verify_physical_activities_survey_in_native_view() {
        ras_Physical_Activities_Survey_TestDataManager.dataInitializerPhysicalActivitiesSurvey("RASPhysicalActivitiesSurvey");
        RAS_Common_Methods.softAssertDropDownValueIsSelected(nativeViewCHARMSPhysicalActivitiesSurveyPage.frequencyOfWalkingHikingLast12MonthsDropdown, ras_Physical_Activities_Survey_TestDataManager.IN_THE_PAST_12_MONTHS_HOW_OFTEN_DID_YOU_WALK_OR_HIKE_FOR_EXERCISE, "* * * * * PHYSICAL ACTIVITIES SURVEY -- VALUE MISMATCH IN 'Frequency of walking or hiking in the last 12 months' DROPDOWN * * * * *");
        RAS_Common_Methods.softAssertDropDownValueIsSelected(nativeViewCHARMSPhysicalActivitiesSurveyPage.timeSpentWalkingHikingLastPerDayDropdown, ras_Physical_Activities_Survey_TestDataManager.ON_THE_DAYS_THAT_YOU_WALKED_OR_HIKED_ABOUT_HOW_MUCH_TIME_PER_DAY_DID_YOU_SPEND_DOING_THIS_ACTIVITY, "* * * * * PHYSICAL ACTIVITIES SURVEY -- VALUE MISMATCH IN 'Time per day spent walking or hiking per day' DROPDOWN * * * * *");
        CucumberLogUtils.logScreenshot();
        CommonUtils.scrollIntoView(nativeViewCHARMSPhysicalActivitiesSurveyPage.frequencyOfLightHouseholdChoresLast12MonthsDropdown);
        RAS_Common_Methods.softAssertDropDownValueIsSelected(nativeViewCHARMSPhysicalActivitiesSurveyPage.frequencyOfLightHouseholdChoresLast12MonthsDropdown, ras_Physical_Activities_Survey_TestDataManager.HOW_OFTEN_DID_YOU_DO_EACH_OF_THESE_HOUSEHOLD_OR_SHOPPING_ACTIVITIES_OUTSIDE_OF_WORK_LIGHT_HOUSEHOLD_CHORES_SUCH_AS_COOKING_TIDYING_UP_LAUNDRY_OR_DUSTING, "* * * * * PHYSICAL ACTIVITIES SURVEY -- VALUE MISMATCH IN 'Frequency of light household chores in the past 12 months' DROPDOWN * * * * *");
        RAS_Common_Methods.softAssertDropDownValueIsSelected(nativeViewCHARMSPhysicalActivitiesSurveyPage.frequencyOfModerateToVigorousHouseholdChoresLast12MonthsDropdown, ras_Physical_Activities_Survey_TestDataManager.HOW_OFTEN_DID_YOU_DO_EACH_OF_THESE_HOUSEHOLD_OR_SHOPPING_ACTIVITIES_OUTSIDE_OF_WORK_MODERATE_TO_VIGOROUS_HOUSEHOLD_CHORES_SUCH_AS_VACUUMING_OR_SWEEPING, "* * * * * PHYSICAL ACTIVITIES SURVEY -- VALUE MISMATCH IN 'Frequency of moderate to vigorous household chores in the past 12 months' DROPDOWN * * * * *");
        RAS_Common_Methods.softAssertDropDownValueIsSelected(nativeViewCHARMSPhysicalActivitiesSurveyPage.frequencyOfCaringForPetsDropdown, ras_Physical_Activities_Survey_TestDataManager.HOW_OFTEN_DID_YOU_DO_EACH_OF_THESE_HOUSEHOLD_OR_SHOPPING_ACTIVITIES_OUTSIDE_OF_WORK_CARING_FOR_PETS_WALKING_DOGS_FEEDING_PLAYING_GROOMING, "* * * * * PHYSICAL ACTIVITIES SURVEY -- VALUE MISMATCH IN 'Frequency of caring for pets' DROPDOWN * * * * *");
        RAS_Common_Methods.softAssertDropDownValueIsSelected(nativeViewCHARMSPhysicalActivitiesSurveyPage.frequencyOfCaringForChildrenOrAdultsDropdown, ras_Physical_Activities_Survey_TestDataManager.HOW_OFTEN_DID_YOU_DO_EACH_OF_THESE_HOUSEHOLD_OR_SHOPPING_ACTIVITIES_OUTSIDE_OF_WORK_CARING_FOR_CHILDREN_OR_ADULTS_PUSHING_STROLLER_OR_WHEELCHAIR_LIFTING_BATHING, "* * * * * PHYSICAL ACTIVITIES SURVEY -- VALUE MISMATCH IN 'Frequency of caring for children or adults' DROPDOWN * * * * *");
        RAS_Common_Methods.softAssertDropDownValueIsSelected(nativeViewCHARMSPhysicalActivitiesSurveyPage.frequencyOfWalkingWhileShoppingErrandsDropdown, ras_Physical_Activities_Survey_TestDataManager.HOW_OFTEN_DID_YOU_DO_EACH_OF_THESE_HOUSEHOLD_OR_SHOPPING_ACTIVITIES_OUTSIDE_OF_WORK_WALKING_WHILE_SHOPPING_OR_DOING_ERRANDS_DO_NOT_COUNT_WALKING_FOR_EXERCISE, "* * * * * PHYSICAL ACTIVITIES SURVEY -- VALUE MISMATCH IN 'Frequency of walking while shopping or doing errands' DROPDOWN * * * * *");
        CucumberLogUtils.logScreenshot();
        CommonUtils.scrollIntoView(nativeViewCHARMSPhysicalActivitiesSurveyPage.timeSpentDoingLightHouseholdChoresDropdown);
        RAS_Common_Methods.softAssertDropDownValueIsSelected(nativeViewCHARMSPhysicalActivitiesSurveyPage.timeSpentDoingLightHouseholdChoresDropdown, ras_Physical_Activities_Survey_TestDataManager.HOW_MUCH_TIME_PER_DAY_DID_YOU_SPEND_DOING_EACH_ACTIVITY_LIGHT_HOUSEHOLD_CHORES_SUCH_AS_COOKING_CLEANING_UP_LAUNDRY_OR_DUSTING, "* * * * * PHYSICAL ACTIVITIES SURVEY -- VALUE MISMATCH IN 'Time spent doing light household chores (cooking, cleaning up, laundry, dusting)' DROPDOWN * * * * *");
        RAS_Common_Methods.softAssertDropDownValueIsSelected(nativeViewCHARMSPhysicalActivitiesSurveyPage.timeSpentDoingModerateToVigorousHouseholdChoresDropdown, ras_Physical_Activities_Survey_TestDataManager.HOW_MUCH_TIME_PER_DAY_DID_YOU_SPEND_DOING_EACH_ACTIVITY_MODERATE_TO_VIGOROUS_HOUSEHOLD_CHORES_SUCH_AS_VACUUMING_OR_SWEEPING, "* * * * * PHYSICAL ACTIVITIES SURVEY -- VALUE MISMATCH IN 'Time spent doing moderate to vigorous household chores (vacuuming, sweeping, etc)' DROPDOWN * * * * *");
        RAS_Common_Methods.softAssertDropDownValueIsSelected(nativeViewCHARMSPhysicalActivitiesSurveyPage.timeSpentCaringForPetsDropdown, ras_Physical_Activities_Survey_TestDataManager.HOW_MUCH_TIME_PER_DAY_DID_YOU_SPEND_DOING_EACH_ACTIVITY_CARING_FOR_PETS_WALKING_DOGS_FEEDING_PLAYING_GROOMING, "* * * * * PHYSICAL ACTIVITIES SURVEY -- VALUE MISMATCH IN 'Time spent caring for pets (walking dogs, feeding, playing, grooming)' DROPDOWN * * * * *");
        RAS_Common_Methods.softAssertDropDownValueIsSelected(nativeViewCHARMSPhysicalActivitiesSurveyPage.timeSpentCaringForChildrenOrAdultsDropdown, ras_Physical_Activities_Survey_TestDataManager.HOW_MUCH_TIME_PER_DAY_DID_YOU_SPEND_DOING_EACH_ACTIVITY_CARING_FOR_CHILDREN_OR_ADULTS_PUSHING_STROLLER_OR_WHEELCHAIR_LIFTING_BATHING, "* * * * * PHYSICAL ACTIVITIES SURVEY -- VALUE MISMATCH IN 'Time spent caring for children or adults (pushing stroller or wheelchair)' DROPDOWN * * * * *");
        RAS_Common_Methods.softAssertDropDownValueIsSelected(nativeViewCHARMSPhysicalActivitiesSurveyPage.timeSpentWalkingOtherThanExerciseDropdown, ras_Physical_Activities_Survey_TestDataManager.HOW_MUCH_TIME_PER_DAY_DID_YOU_SPEND_DOING_EACH_ACTIVITY_WALKING_WHILE_SHOPPING_OR_DOING_ERRANDS_DO_NOT_COUNT_WALKING_FOR_EXERCISE, "* * * * * PHYSICAL ACTIVITIES SURVEY -- VALUE MISMATCH IN 'Time spent walking (other than exercise)' DROPDOWN * * * * *");
        CucumberLogUtils.logScreenshot();
        CommonUtils.scrollIntoView(nativeViewCHARMSPhysicalActivitiesSurveyPage.frequencyOfStrenuousActivitiesDropdown);
        RAS_Common_Methods.softAssertDropDownValueIsSelected(nativeViewCHARMSPhysicalActivitiesSurveyPage.frequencyOfStrenuousActivitiesDropdown, ras_Physical_Activities_Survey_TestDataManager.HOW_OFTEN_DID_YOU_PARTICIPATE_IN_STRENUOUS_ACTIVITIES_OR_SPORTS_AVERAGE_HOURS_PER_WEEK, "* * * * * PHYSICAL ACTIVITIES SURVEY -- VALUE MISMATCH IN 'Frequency of strenuous activities (per week)' DROPDOWN * * * * *");
        RAS_Common_Methods.softAssertDropDownValueIsSelected(nativeViewCHARMSPhysicalActivitiesSurveyPage.selectAgeGroupDropdown, ras_Physical_Activities_Survey_TestDataManager.HOW_OFTEN_DID_YOU_PARTICIPATE_IN_STRENUOUS_ACTIVITIES_OR_SPORTS_SELECT_AGE_GROUP, "* * * * * PHYSICAL ACTIVITIES SURVEY -- VALUE MISMATCH IN 'Frequency of strenuous activities (per week) Select Age Group' DROPDOWN * * * * *");
        RAS_Common_Methods.softAssertDropDownValueIsSelected(nativeViewCHARMSPhysicalActivitiesSurveyPage.frequencyOfModerateActivitiesDropdown, ras_Physical_Activities_Survey_TestDataManager.HOW_OFTEN_DID_YOU_PARTICIPATE_IN_MODERATE_ACTIVITIES_OR_SPORTS_AVERAGE_HOURS_PER_WEEK, "* * * * * PHYSICAL ACTIVITIES SURVEY -- VALUE MISMATCH IN 'Frequency of moderate activities (per week)' DROPDOWN * * * * *");
        RAS_Common_Methods.softAssertDropDownValueIsSelected(nativeViewCHARMSPhysicalActivitiesSurveyPage.selectAgeGroupDropdown2, ras_Physical_Activities_Survey_TestDataManager.HOW_OFTEN_DID_YOU_PARTICIPATE_IN_MODERATE_ACTIVITIES_OR_SPORTS_SELECT_AGE_GROUP, "* * * * * PHYSICAL ACTIVITIES SURVEY -- VALUE MISMATCH IN 'Frequency of moderate activities (per week) Select Age Group' DROPDOWN * * * * *");
        CucumberLogUtils.logScreenshot();
    }

    /**
     * Presses the back button in NV Form View.
     */
    @Then("presses the back button")
    public void presses_the_back_button() {
        CommonUtils.waitForClickability(locateByCssSelector("button[aria-label='Back']"));
        JavascriptUtils.clickByJS(locateByCssSelector("button[aria-label='Back']"));
        CommonUtils.sleep(1000);
    }

    /**
     * The method for a Study Team member to fill out a new FHQ
     */
    @Then("Study Team member fills out new FHQ for participant in NV")
    public void study_team_member_fills_out_new_fhq_for_participant_in_nv() {
        String subjectID = nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsSubjectID.getDomAttribute("value").trim();
        CucumberLogUtils.logScreenshot();
        WebDriverUtils.webDriver.navigate().refresh();
        CommonUtils.waitForVisibility(NativeView_SideDoor_Dashboard_Page.filterNavigatorTextBox);
        NativeView_SideDoor_Dashboard_Page.filterNavigatorTextBox.sendKeys("FHQ Patient");
        CucumberLogUtils.logScreenshot();
        CommonUtils.sleep(3000);
        CommonUtils.clickOnElement(NativeView_SideDoor_Dashboard_Page.fhqPatientsLink);
        CommonUtils.sleep(3000);
        CommonUtils.switchToFrame(NativeView_SideDoor_Dashboard_Page.nativeViewiFrame);
        CommonUtils.sleep(2000);
        locateByXpath("//button[@value='sysverb_new']").click();
        CommonUtils.sleep(1000);
        CommonUtils.selectDropDownValue("I am the participant", nativeViewCHARMSFHQPatientPage.confirmIdentityRelationshipToParticipantDropdown);
        nativeViewCHARMSFHQPatientPage.firstNameOfParticipantInputField.sendKeys(ras_Screener_TestDataManager.FIRST_NAME);
        nativeViewCHARMSFHQPatientPage.firstInitialOfLastNameOfParticipantInputField.sendKeys(ras_Screener_TestDataManager.LAST_NAME.substring(0, 1));
        CucumberLogUtils.logScreenshot();
        CommonUtils.selectDropDownValue(ras_Screener_TestDataManager.WHAT_IS_YOUR_SEX, nativeViewCHARMSFHQPatientPage.sexAssignedAtBirthDropdown);
        JavascriptUtils.scrollIntoView(nativeViewCHARMSFHQPatientPage.sexAssignedAtBirthDropdown);
        CommonUtils.selectDropDownValue("No", nativeViewCHARMSFHQPatientPage.hasParticipantHadAnyMiscarriageStillbirthDropdown);
        nativeViewCHARMSFHQPatientPage.howManyTotalChildrenHasTheParticipantHadInputField.sendKeys("1");
        nativeViewCHARMSFHQPatientPage.howManyTotalDifferentPartnersHasParticipantHadBiologicalChildrenWithInputField.sendKeys("1");
        nativeViewCHARMSFHQPatientPage.howManySiblingsDoesTheParticipantHaveInputField.sendKeys("1");
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.scrollIntoView(nativeViewCHARMSFHQPatientPage.fhqStudyDropdown);
        nativeViewCHARMSFHQPatientPage.participantInputField.clear();
        nativeViewCHARMSFHQPatientPage.participantInputField.sendKeys(subjectID);
        CommonUtils.sleep(500);
        nativeViewCHARMSFHQPatientPage.saveButton.click();
        CommonUtils.sleep(800);
        JavascriptUtils.scrollIntoView(nativeViewCHARMSFHQPatientPage.fhqStudyDropdown);
        CucumberLogUtils.logScreenshot();
        CommonUtils.waitForClickability(nativeViewCHARMSFHQPatientPage.dynamicRelatedListsTabLocator("Parent(s)"));
        JavascriptUtils.scrollIntoView(nativeViewCHARMSFHQPatientPage.dynamicRelatedListsTabLocator("Parent(s)"));
        CucumberLogUtils.logScreenshot();
    }

    /**
     * Method for navigating to participant study and then opening the RASopathy Survey
     */
    @When("Study Team member navigates to RASopathy Survey")
    public void study_team_member_navigates_to_rasopathy_survey() {
        study_team_member_navigates_to_participant_studies();
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantStudyPage.cgbIIQTab);
        nativeViewCHARMSParticipantStudyPage.cgbIIQTab.click();
        JavascriptUtils.scrollIntoView(nativeViewCHARMSParticipantStudyPage.cgbIIQTab);
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantStudyPage.rasopathySurveyText);
        CommonUtils.hoverOverElement(nativeViewCHARMSParticipantStudyPage.rasopathySurveyText);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantStudyPage.rasopathySurveyPreviewButton);
        CommonUtils.waitForVisibility(nativeViewCHARMSDashboardPage.rasStudyOpenRecordButton);
        CommonUtils.sleep(500);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(nativeViewCHARMSDashboardPage.rasStudyOpenRecordButton);
    }
}