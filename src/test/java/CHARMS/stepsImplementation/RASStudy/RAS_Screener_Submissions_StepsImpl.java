package CHARMS.stepsImplementation.RASStudy;

import CHARMS.constants.CHARMS_Data_File_Path_Constants;
import CHARMS.constants.CHARMSRASScreenerConstants;
import CHARMS.pages.*;
import APPS_COMMON.Pages.NativeView_SideDoor_Dashboard_Page;
import APPS_COMMON.Utils.Dynamic_Locators;
import APPS_COMMON.Utils.ServiceNow_Common_Methods;
import APPS_COMMON.Utils.ServiceNow_Login_Methods;
import APPS_COMMON.PageInitializers.PageInitializer;
import CHARMS.utils.CharmsUtil;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.*;
import static CHARMS.steps.RAS_All_Steps.*;
import static CHARMS.steps.RAS_Common_Methods.*;
import static CHARMS.utils.CharmsUtil.convertDOBToMMddyyyyFormat;
import static Hooks.Hooks.softAssert;
import static CHARMS.pages.RAS_Screener_Page.*;
import static CHARMS.studyQuestions.RAS_Screener_Questions_Proband.*;
import static CHARMS.studyQuestions.RAS_Screener_Questions_Proxy.*;
import static APPS_COMMON.Pages.Selenium_Common_Locators.locateByXpath;
import static com.nci.automation.web.TestProperties.getRasLoginUrl;

public class RAS_Screener_Submissions_StepsImpl extends PageInitializer {
    public static String FSID;

    /**
     * USE THIS METHOD TO NAVIGATE TO THE RASOPATHIES LONGITUDINAL COHORT STUDY LOGIN PAGE.
     *
     * @param applicationID The identifier for the application related to the login page.
     */
    public void navigateToRASopathiesLongitudinalCohortStudyLoginPage(String applicationID) {
        WebDriverUtils.webDriver.get(getRasLoginUrl());
        CucumberLogUtils.logScreenshot();
    }

    /***
     * USE THIS METHOD TO CLICK ON SCREENER NEXT BUTTON
     */
    public void clickOnScreenerNextButton() {
        CommonUtils.sleep(1000);
        CommonUtils.waitForClickability(rasopathyQuestionnairePage.studyNextButton);
        JavascriptUtils.scrollIntoView(rasopathyQuestionnairePage.studyNextButton);
        CommonUtils.sleep(1000);
        CommonUtils.clickOnElement(rasopathyQuestionnairePage.studyNextButton);
        CommonUtils.sleep(1000);
    }

    /***
     * USE THIS METHOD TO CLICK ON SURVEY SAVE AND NEXT BUTTON
     */
    public void clickOnSurveySavAndNextButton() {
        JavascriptUtils.scrollIntoView(rasopathyQuestionnairePage.rasSurveySaveAndNextButton);
        CommonUtils.clickOnElement(rasopathyQuestionnairePage.rasSurveySaveAndNextButton);
    }

    /***
     * USE THIS METHOD TO CLICK ON SURVEY PREVIOUS BUTTON
     */
    public void clickOnSurveyPreviousButton() {
        JavascriptUtils.scrollIntoView(rasopathyQuestionnairePage.rasSurveyPreviousButton);
        CommonUtils.clickOnElement(rasopathyQuestionnairePage.rasSurveyPreviousButton);
    }

    /***
     * THIS METHOD WILL SELECT THE SCREENER SUBMISSION ACCORDING TO THE SHEET CHOSEN IN THE FEATURE FILE
     */
    public void rasScreenerScenarioSelector(String sheetName) {
        if (sheetName.contentEquals("screenerScenario1")) {
            ras_Screener_TestDataManager.dataInitializerRasScreener(sheetName);
            rasScreenerSubmissions(sheetName);
        } else if (sheetName.contentEquals("screenerScenario2")) {
            ras_Screener_TestDataManager.dataInitializerRasScreener(sheetName);
            rasScreenerSubmissions(sheetName);
//             rasScenario2StepsImpl.rasScreenerSubmissionScenario2();
        } else if (sheetName.contentEquals("screenerScenario3")) {
            ras_Screener_TestDataManager.dataInitializerRasScreener(sheetName);
            rasScenario3StepsImpl.rasScreenerSubmissionScenario3();
        } else if (sheetName.contentEquals("screenerScenario4")) {
            ras_Screener_TestDataManager.dataInitializerRasScreener(sheetName);
//            rasScenario4StepsImpl.rasScreenerSubmissionScenario4();
        } else if (sheetName.contentEquals("screenerScenario5")) {
            ras_Screener_TestDataManager.dataInitializerRasScreener(sheetName);
//            ras_scenario_five_stepsImpl.ras_screener_submission_five();
        } else if (sheetName.contentEquals("screenerScenarioAdult")) {
            ras_Screener_TestDataManager.dataInitializerRasScreener(sheetName);
            rasScreenerSubmissions(sheetName);
        } else if (sheetName.contentEquals("screenerScenarioAdult-NeedsLAR")) {
            ras_Screener_TestDataManager.dataInitializerRasScreener(sheetName);
            rasScreenerSubmissions(sheetName);
        } else if (sheetName.contentEquals("screenerScenarioAgeUnder7")) {
            ras_Screener_TestDataManager.dataInitializerRasScreener(sheetName);
            rasScreenerSubmissions(sheetName);
        } else if (sheetName.contentEquals("screenerScenarioAge7-10")) {
            ras_Screener_TestDataManager.dataInitializerRasScreener(sheetName);
            rasScreenerSubmissions(sheetName);
        } else if (sheetName.contentEquals("screenerScenarioAge11-13")) {
            ras_Screener_TestDataManager.dataInitializerRasScreener(sheetName);
            rasScreenerSubmissions(sheetName);
        } else if (sheetName.contentEquals("screenerScenarioAge14-17")) {
            ras_Screener_TestDataManager.dataInitializerRasScreener(sheetName);
            rasScreenerSubmissions(sheetName);
        }
    }

    /**
     * This method performs a series of actions to submit a screener form for the RAS survey.
     *
     * @param sheetName the name of the sheet containing test data
     */
    public static void rasScreenerSubmissions(String sheetName) {
        CommonUtils.switchToNextWindow();
        CommonUtils.sleep(2000);
        CommonUtils.waitForVisibility(myRASSurveyPage.rasSurveyThisCopyText);
        //ASSERTING THAT THIS IS THE COPY FOR LOWER ENVIRONMENTS ONLY!!! MESSAGE DISPLAYS
        softAssert.assertEquals(myRASSurveyPage.rasSurveyThisCopyText.getText(), ras_Screener_Constants.THIS_IS_A_COPY);
        CucumberLogUtils.logScreenshot();
        CommonUtils.sleep(2000);
        JavascriptUtils.scrollIntoView(rasopathyQuestionnairePage.studyNextButton);
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
        CommonUtils.sleep(2000);
        if (!rasopathyQuestionnairePage.iAmCompletingThisFormForMyselfOption.isDisplayed()) {
            ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
        }

        if (ras_Screener_TestDataManager.ARE_YOU_COMPLETING_THIS_FORM_FOR_SOMEONE_ELSE_OR_YOURSELF.contentEquals("I am completing this form for myself")) {
            CucumberLogUtils.scenario.log("* * * THIS IS A SELF SCREENER SUBMISSION * * *");
        } else if (ras_Screener_TestDataManager.ARE_YOU_COMPLETING_THIS_FORM_FOR_SOMEONE_ELSE_OR_YOURSELF.contentEquals("I am completing this form for someone else")) {
            CucumberLogUtils.scenario.log("* * * THIS IS A PROXY SCREENER SUBMISSION * * *");
        }
        for (int i = 0; i < 95; i++) {
            try {
                /**
                 * * * * * ARE YOU COMPLETING THIS FORM FOR SOMEONE ELSE OR FOR YOURSELF? * * * *
                 */
                if (rasopathyQuestionnairePage.question.isDisplayed() && rasopathyQuestionnairePage.question.getText().trim().contentEquals(ARE_YOU_COMPLETING_THIS_FORM_FOR_SOMEONE_ELSE_OR_FOR_YOURSELF)) {
                    CucumberLogUtils.scenario.log("* * * * ARE YOU COMPLETING THIS FORM FOR SOMEONE ELSE OR FOR YOURSELF? * * * *");
                    dynamicLocatorNested(ras_Screener_TestDataManager.ARE_YOU_COMPLETING_THIS_FORM_FOR_SOMEONE_ELSE_OR_YOURSELF).click();
                    CommonUtils.sleep(200);
                    CucumberLogUtils.logScreenshot();
                    ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
                }
                /**
                 * * * * * WHAT IS YOUR NAME? * * * *
                 */
                else if (rasopathyQuestionnairePage.question.isDisplayed() && rasopathyQuestionnairePage.question.getText().trim().contentEquals(WHAT_IS_YOUR_NAME)) {
                    CucumberLogUtils.scenario.log("* * * * * ENTERING FIRST NAME, MIDDLE INITIAL, LAST NAME * * * * *");
                    rasopathyQuestionnairePage.dynamicTextBoxLocator("First name").sendKeys(ras_Screener_TestDataManager.FIRST_NAME);
                    rasopathyQuestionnairePage.dynamicTextBoxLocator("Middle Initial").sendKeys(ras_Screener_TestDataManager.MIDDLE_INITIAL);
                    rasopathyQuestionnairePage.dynamicTextBoxLocator("Last name").sendKeys(ras_Screener_TestDataManager.LAST_NAME);
                    CommonUtils.sleep(200);
                    CucumberLogUtils.logScreenshot();
                    ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
                }
                /**
                 * * * * * WHAT IS THE NAME OF THE PERSON WHO MAY BE ELIGIBLE FOR THIS STUDY? * * * *
                 */
                else if (rasopathyQuestionnairePage.question.isDisplayed() && rasopathyQuestionnairePage.question.getText().contentEquals(WHAT_IS_THE_NAME_OF_THE_PERSON_WHO_MAY_BE_ELIGIBLE_FOR_THIS_STUDY)) {
                    CucumberLogUtils.scenario.log("* * * * * ENTERING PARTICIPANT'S FIRST NAME, MIDDLE INITIAL, LAST NAME * * * * *");
                    rasopathyQuestionnairePage.dynamicTextBoxLocator("First name").sendKeys(ras_Screener_TestDataManager.PARTICIPANT_FIRST_NAME);
                    rasopathyQuestionnairePage.dynamicTextBoxLocator("Middle Initial").sendKeys(ras_Screener_TestDataManager.PARTICIPANT_MIDDLE_INITIAL);
                    rasopathyQuestionnairePage.dynamicTextBoxLocator("Last name").sendKeys(ras_Screener_TestDataManager.PARTICIPANT_LAST_NAME);
                    CommonUtils.sleep(200);
                    CucumberLogUtils.logScreenshot();
                    ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
                }
                /**
                 * * * * * WHAT IS YOUR RELATIONSHIP TO THE PARTICIPANT? * * * *
                 */
                else if (rasopathyQuestionnairePage.question.isDisplayed() && rasopathyQuestionnairePage.question.getText().trim().contentEquals(formatRASQuestionForProxy(WHAT_IS_YOUR_RELATIONSHIP_TO))) {
                    CucumberLogUtils.scenario.log("* * * * * ENTERING THE PROXY'S RELATIONSHIP TO THE PARTICIPANT * * * * *");
                    RAS_Screener_Page.dynamicRadioButtonLocator(ras_Screener_TestDataManager.WHAT_IS_YOUR_RELATIONSHIP_TO_THE_PARTICIPANT).click();
                    CommonUtils.sleep(200);
                    CucumberLogUtils.logScreenshot();
                    ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
                }
                /**
                 * * * * * ARE YOU THE LEGAL GUARDIAN OF THE PARTICIPANT? * * * *
                 */
                else if (rasopathyQuestionnairePage.question.isDisplayed() && rasopathyQuestionnairePage.question.getText().contentEquals(formatRASQuestionForProxy(ARE_YOUR_THE_LEGAL_GUARDIAN_OF))) {
                    CucumberLogUtils.scenario.log("* * * * * ARE YOU THE LEGAL GUARDIAN OF THE PARTICIPANT? * * * * *");
                    RAS_Screener_Page.dynamicRadioButtonLocator(ras_Screener_TestDataManager.ARE_YOU_THE_LEGAL_GUARDIAN_OF_THE_PARTICIPANT).click();
                    CommonUtils.sleep(200);
                    CucumberLogUtils.logScreenshot();
                    ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
                }
                /**
                 * * * * * THE NEXT SET OF QUESTIONS WILL COLLECT BASIC INFORMATION ABOUT YOU. * * * *
                 */
                else if (rasopathyQuestionnairePage.question.isDisplayed() && (rasopathyQuestionnairePage.question.getText().contentEquals(THE_NEXT_SET_OF_QUESTIONS_WILL_COLLECT_BASIC_INFORMATION_ABOUT_YOU) || rasopathyQuestionnairePage.question.getText().trim().contentEquals(formatRASQuestionForProxy(THE_NEXT_SET_OF_QUESTIONS_WILL_COLLECT_BASIC_INFORMATION_ABOUT)))) {
                    CucumberLogUtils.scenario.log("* * * * * THE NEXT SET OF QUESTIONS WILL COLLECT BASIC INFORMATION ABOUT YOU. * * * * *");
                    CucumberLogUtils.logScreenshot();
                    ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
                }
                /**
                 * * * * * WHAT IS YOUR DATE OF BIRTH? * * * *
                 */
                else if (rasopathyQuestionnairePage.question.isDisplayed() && rasopathyQuestionnairePage.question.getText().contentEquals(WHAT_IS_YOUR_DATE_OF_BIRTH)) {
                    CucumberLogUtils.scenario.log("* * * * * WHAT IS YOUR DATE OF BIRTH? * * * * *");
                    rasopathyQuestionnairePage.calendarYearTextBox.clear();
                    rasopathyQuestionnairePage.calendarYearTextBox.sendKeys(ras_Screener_TestDataManager.DATE_OF_BIRTH_YEAR);
                    CommonUtils.selectDropDownValue(ras_Screener_TestDataManager.DATE_OF_BIRTH_MONTH, rasopathyQuestionnairePage.calendarMonthDropDown);
                    RAS_Screener_Page.dynamicDateOfBirthCalendarLocator(ras_Screener_TestDataManager.WHAT_IS_YOUR_DATE_OF_BIRTH).click();
                    CucumberLogUtils.logScreenshot();
                    ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
                }
                /**
                 * * * * * WHAT IS THE PARTICIPANT'S DATE OF BIRTH? * * * *
                 */
                else if (rasopathyQuestionnairePage.question.isDisplayed() && rasopathyQuestionnairePage.question.getText().trim().contentEquals(formatRASQuestionForProxy(DATE_OF_BIRTH_OF))) {
                    CucumberLogUtils.scenario.log("* * * * * WHAT IS THE PARTICIPANT'S DATE OF BIRTH? * * * * *");
                    rasopathyQuestionnairePage.calendarYearTextBox.clear();
                    rasopathyQuestionnairePage.calendarYearTextBox.sendKeys(ras_Screener_TestDataManager.DATE_OF_BIRTH_YEAR);
                    CommonUtils.selectDropDownValue(ras_Screener_TestDataManager.DATE_OF_BIRTH_MONTH, rasopathyQuestionnairePage.calendarMonthDropDown);
                    RAS_Screener_Page.dynamicDateOfBirthCalendarLocator(ras_Screener_TestDataManager.DATE_OF_BIRTH_OF_THE_PARTICIPANT).click();
                    CucumberLogUtils.logScreenshot();
                    ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
                }
                /**
                 * * * * * WHAT WAS YOUR SEX ASSIGNED AT BIRTH? * * * *
                 */
                else if (rasopathyQuestionnairePage.question.isDisplayed() && (rasopathyQuestionnairePage.question.getText().contentEquals(WHAT_WAS_YOUR_SEX_ASSIGNED_AT_BIRTH) || rasopathyQuestionnairePage.question.getText().trim().contentEquals(formatRASQuestionForProxy(SEX_OF_ASSIGNED_AT_BIRTH)))) {
                    CucumberLogUtils.scenario.log("* * * * * WHAT WAS YOUR SEX ASSIGNED AT BIRTH? * * * * *");
                    CommonUtils.clickOnElement(dynamicLocator(ras_Screener_TestDataManager.SEX_ASSIGNED_AT_BIRTH_OPTION));
                    CucumberLogUtils.logScreenshot();
                    ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
                }
                /**
                 * * * * * WHAT IS YOUR SEX? * * * *
                 */
                else if (rasopathyQuestionnairePage.question.isDisplayed() && (rasopathyQuestionnairePage.question.getText().contentEquals(WHAT_IS_YOUR_SEX))) {
                    CucumberLogUtils.scenario.log("* * * * * WHAT IS YOUR SEX? * * * * *");
                    CommonUtils.clickOnElement(dynamicLocator(ras_Screener_TestDataManager.WHAT_IS_YOUR_SEX));
                    CucumberLogUtils.logScreenshot();
                    ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
                }
                /**
                 * * * * * WHAT IS THE PARTICIPANT'S SEX? * * * *
                 */
                else if (rasopathyQuestionnairePage.question.isDisplayed() && (rasopathyQuestionnairePage.question.getText().trim().contentEquals(formatRASQuestionForProxy(WHAT_IS_THE_PARTICIPANTS_SEX)))) {
                    CucumberLogUtils.scenario.log("* * * * * WHAT IS THE PARTICIPANT'S SEX? * * * * *");
                    CommonUtils.clickOnElement(dynamicLocator(ras_Screener_TestDataManager.WHAT_IS_THE_PARTICIPANTS_SEX));
                    CucumberLogUtils.logScreenshot();
                    ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
                }
                /**
                 * * * * * IS THE PARTICIPANT ALIVE? * * * *
                 */
                else if (rasopathyQuestionnairePage.question.isDisplayed() && rasopathyQuestionnairePage.question.getText().contentEquals(formatRASQuestionForProxy(IS_ALIVE))) {
                    CucumberLogUtils.scenario.log("* * * * * IS THE PARTICIPANT ALIVE? * * * * *");
                    dynamicRadioButtonLocator(ras_Screener_TestDataManager.IS_THE_PARTICIPANT_ALIVE).click();
                    CucumberLogUtils.logScreenshot();
                    ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
                }
                /**
                 * * * * * ARE YOU ADOPTED? * * * *
                 */
                else if (rasopathyQuestionnairePage.question.isDisplayed() && (rasopathyQuestionnairePage.question.getText().trim().contentEquals(ARE_YOU_ADOPTED) || rasopathyQuestionnairePage.question.getText().trim().contentEquals(formatRASQuestionForProxy(IS_ADOPTED)))) {
                    CucumberLogUtils.scenario.log("* * * * * ARE YOU ADOPTED? * * * * *");
                    CommonUtils.sleep(200);
                    dynamicLocator(ras_Screener_TestDataManager.ARE_YOU_ADOPTED_OPTION).click();
                    CucumberLogUtils.logScreenshot();
                    ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
                }
                /**
                 * * * * * DO YOU CURRENTLY LIVE IN THE UNITED STATES? * * * *
                 */
                else if (rasopathyQuestionnairePage.question.isDisplayed() && (rasopathyQuestionnairePage.question.getText().trim().contentEquals(DO_YOU_CURRENTLY_LIVE_IN_THE_US) || rasopathyQuestionnairePage.question.getText().trim().contentEquals(formatRASQuestionForProxy(DOES_PARTICIPANT_CURRENTLY_LIVE_IN_THE_US)))) {
                    CucumberLogUtils.scenario.log("* * * * * DO YOU CURRENTLY LIVE IN THE UNITED STATES? * * * * *");
                    CommonUtils.sleep(200);
                    dynamicLocator(ras_Screener_TestDataManager.DO_YOU_CURRENTLY_LIVE_IN_THE_US).click();
                    CucumberLogUtils.logScreenshot();
                    ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
                }
                /**
                 * * * * * IN WHICH COUNTRY DO YOU CURRENTLY LIVE? * * * *
                 */
                else if (rasopathyQuestionnairePage.question.isDisplayed() && (rasopathyQuestionnairePage.question.getText().trim().contentEquals(IN_WHICH_COUNTRY_DO_YOU_CURRENTLY_LIVE) || rasopathyQuestionnairePage.question.getText().trim().contentEquals(formatRASQuestionForProxy(IN_WHICH_COUNTRY_DOES_THE_PROBAND_CURRENTLY_LIVE)))) {
                    CucumberLogUtils.scenario.log("* * * * * IN WHICH COUNTRY DO YOU CURRENTLY LIVE? * * * * *");
                    CommonUtils.selectDropDownValue(ras_Screener_TestDataManager.COUNTRY_OPTION, rasopathyQuestionnairePage.whatCountryDoesParticipantCurrentlyLiveInDropDown);
                    CucumberLogUtils.logScreenshot();
                    ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
                }
                /**
                 * * * * * PLEASE PROVIDE THE MAILING ADDRESS WHERE STUDY MATERIALS CAN BE SENT, AS NEEDED. * * * *
                 */
                else if (rasopathyQuestionnairePage.question.isDisplayed() && rasopathyQuestionnairePage.question.getText().contentEquals(PLEASE_PROVIDE_THE_MAILING_ADDRESS_WHERE_STUDY_MATERIALS_CAN_BE_SENT_AS_NEEDED)) {
                    CucumberLogUtils.scenario.log("* * * * * PLEASE PROVIDE THE MAILING ADDRESS WHERE STUDY MATERIALS CAN BE SENT, AS NEEDED. * * * * *");
                    rasopathyQuestionnairePage.dynamicTextBoxLocator(ras_Screener_Constants.STREET_ADDRESS).sendKeys(ras_Screener_TestDataManager.STREET);
                    rasopathyQuestionnairePage.dynamicTextBoxLocator(ras_Screener_Constants.STREET_2_ADDRESS).sendKeys(ras_Screener_TestDataManager.STREET2);
                    rasopathyQuestionnairePage.dynamicTextBoxLocator(ras_Screener_Constants.CITY_TEXT).sendKeys(ras_Screener_TestDataManager.CITY);
                    rasopathyQuestionnairePage.dynamicTextBoxLocator(ras_Screener_Constants.STATE_TEXT).sendKeys(ras_Screener_TestDataManager.STATE);
                    rasopathyQuestionnairePage.dynamicTextBoxLocator(ras_Screener_Constants.ZIP_CODE_TEXT).sendKeys(ras_Screener_TestDataManager.ZIPCODE);
                    CucumberLogUtils.logScreenshot();
                    ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
                }
                /**
                 * * * * * WHAT IS YOUR EMAIL ADDRESS? * * * *
                 */
                else if (rasopathyQuestionnairePage.question.isDisplayed() && rasopathyQuestionnairePage.question.getText().contentEquals(WHAT_IS_YOUR_EMAIL_ADDRESS)) {
                    CucumberLogUtils.scenario.log("* * * * * WHAT IS YOUR EMAIL ADDRESS? * * * * *");
                    rasopathyQuestionnairePage.dynamicEmailAddressTextBox(ras_Screener_Constants.EMAIL_ADDRESS).sendKeys(ras_Screener_TestDataManager.EMAIL_ADDRESS);
                    CucumberLogUtils.logScreenshot();
                    ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
                }
                /**
                 * * * * * PLEASE CONFIRM YOUR EMAIL ADDRESS * * * *
                 */
                else if (rasopathyQuestionnairePage.question.isDisplayed() && rasopathyQuestionnairePage.question.getText().contentEquals(PLEASE_CONFIRM_YOUR_EMAIL_ADDRESS)) {
                    CucumberLogUtils.scenario.log("* * * * * PLEASE CONFIRM YOUR EMAIL ADDRESS * * * * *");
                    rasopathyQuestionnairePage.dynamicEmailAddressTextBox(ras_Screener_Constants.CONFIRM_EMAIL_ADDRESS).sendKeys(ras_Screener_TestDataManager.EMAIL_ADDRESS_CONFIRM);
                    CucumberLogUtils.logScreenshot();
                    ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
                }
                /**
                 * * * * * PLEASE LIST YOUR PHONE NUMBERS BELOW.  PLEASE ALSO SELECT YOUR PREFERRED CONTACT NUMBER.  * * * *
                 */
                else if (rasopathyQuestionnairePage.question.isDisplayed() && rasopathyQuestionnairePage.question.getText().contentEquals(PLEASE_LIST_YOUR_PHONE_NUMBERS_BELOW_PLEASE_ALSO_SELECT_YOUR_PREFERRED_CONTACT_NUMBER)) {
                    CucumberLogUtils.scenario.log("* * * * * PLEASE LIST YOUR PHONE NUMBERS BELOW.  PLEASE ALSO SELECT YOUR PREFERRED CONTACT NUMBER.  * * * * *");
                    rasopathyQuestionnairePage.dynamicTextBoxLocatorForPhoneNumbers(ras_Screener_Constants.HOME_PHONE_NUMBER).sendKeys(ras_Screener_TestDataManager.HOME_PHONE_NUMBER);
                    rasopathyQuestionnairePage.dynamicTextBoxLocatorForPhoneNumbers(ras_Screener_Constants.CELL_PHONE_NUMBER).sendKeys(ras_Screener_TestDataManager.CELL_PHONE_NUMBER);
                    rasopathyQuestionnairePage.dynamicTextBoxLocatorForPhoneNumbers(ras_Screener_Constants.WORK_PHONE_NUMBER).sendKeys(ras_Screener_TestDataManager.WORK_PHONE_NUMBER);
                    rasopathyQuestionnairePage.dynamicPhoneNumberCheckBox(ras_Screener_Constants.CELL_PHONE_NUMBER).click();
                    CucumberLogUtils.logScreenshot();
                    ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
                }
                /**
                 * * * * * WHAT IS YOUR ETHNICITY?  * * * *
                 */
                else if (rasopathyQuestionnairePage.question.isDisplayed() && (rasopathyQuestionnairePage.question.getText().contentEquals(WHAT_IS_YOUR_ETHNICITY) || rasopathyQuestionnairePage.question.getText().contentEquals(formatRASQuestionForProxy(ETHNICITY_OF)))) {
                    CucumberLogUtils.scenario.log("* * * * * WHAT IS YOUR ETHNICITY?  * * * * *");
                    dynamicLocator(ras_Screener_TestDataManager.WHAT_IS_YOUR_ETHNICITY).click();
                    CucumberLogUtils.logScreenshot();
                    CommonUtils.sleep(200);
                    ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
                }
                /**
                 * * * * * WHAT IS YOUR RACE? PLEASE SELECT ALL THAT APPLY.  * * * *
                 */
                else if (rasopathyQuestionnairePage.question.isDisplayed() && (rasopathyQuestionnairePage.question.getText().trim().contentEquals(WHAT_IS_YOUR_RACE_PLEASE_SELECT_ALL_THAT_APPLY) || rasopathyQuestionnairePage.question.getText().trim().contentEquals(formatRASQuestionForProxy(RACE_OF)))) {
                    CucumberLogUtils.scenario.log("* * * * * WHAT IS YOUR RACE? PLEASE SELECT ALL THAT APPLY.  * * * * *");
                    dynamicLocator(ras_Screener_TestDataManager.WHAT_IS_YOUR_RACE).click();
                    CucumberLogUtils.logScreenshot();
                    CommonUtils.sleep(200);
                    ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
                }
                /**
                 * * * * * ARE YOU A PARTICIPANT IN ANY OTHER RESEARCH STUDY OR REGISTRY GROUP?  PLEASE SPECIFY.  * * * *
                 */
                else if (rasopathyQuestionnairePage.question.isDisplayed() && (rasopathyQuestionnairePage.question.getText().trim().contentEquals(ARE_YOU_A_PARTICIPANT_IN_ANY_OTHER_RESEARCH_STUDY_OR_REGISTRY_GROUP_PLEASE_SPECIFY) || rasopathyQuestionnairePage.question.getText().contentEquals(formatRASQuestionForProxy(IS_PARTICIPANT_IN_ANY_OTHER_RESEARCH_STUDY_OR_REGISTRY_GROUP)))) {
                    CucumberLogUtils.scenario.log("* * * * * ARE YOU A PARTICIPANT IN ANY OTHER RESEARCH STUDY OR REGISTRY GROUP?  PLEASE SPECIFY.  * * * * *");
                    if (sheetName.contentEquals("screenerScenario1") || sheetName.contentEquals("screenerScenarioAdult") || sheetName.contentEquals("screenerScenarioAdult-NeedsLAR") || sheetName.contentEquals("screenerScenarioAgeUnder7") || sheetName.contentEquals("screenerScenarioAge7-10") || sheetName.contentEquals("screenerScenarioAge11-13") || sheetName.contentEquals("screenerScenarioAge14-17")) {
                        dynamicLocator(ras_Screener_TestDataManager.ARE_YOU_A_PARTICIPANT_IN_OTHER_STUDY_GROUP).click();
                    }
                    if (sheetName.contentEquals("screenerScenario2")) {
                        CommonUtils.waitForClickability(dynamicLocator(ras_Screener_TestDataManager.ARE_YOU_A_PARTICIPANT_IN_ANY_OTHER_RESEARCH_STUDY_OR_REGISTRY_GROUP_RASOPATHIES_NET_OPTION));
                        JavascriptUtils.clickByJS(dynamicLocator(ras_Screener_TestDataManager.ARE_YOU_A_PARTICIPANT_IN_ANY_OTHER_RESEARCH_STUDY_OR_REGISTRY_GROUP_RASOPATHIES_NET_OPTION));
                        JavascriptUtils.clickByJS(dynamicLocator(ras_Screener_TestDataManager.ARE_YOU_A_PARTICIPANT_IN_ANY_OTHER_RESEARCH_STUDY_OR_REGISTRY_GROUP_FAMILY_ADVOCACY_GROUP_OPTION));
                        JavascriptUtils.clickByJS(dynamicLocator(ras_Screener_TestDataManager.ARE_YOU_A_PARTICIPANT_IN_ANY_OTHER_RESEARCH_STUDY_OR_REGISTRY_GROUP_OTHER_OPTION));
                        JavascriptUtils.clickByJS(dynamicLocator(ras_Screener_TestDataManager.ARE_YOU_A_PARTICIPANT_IN_ANY_OTHER_RESEARCH_STUDY_OR_REGISTRY_GROUP_NOT_INVOLVED_IN_OTHER_STUDY));
                        CommonUtils.sendKeysToElement(myRASSurveyPage.dynamicPleaseSpecifyTextBox(ras_Screener_TestDataManager.ARE_YOU_A_PARTICIPANT_IN_ANY_OTHER_RESEARCH_STUDY_OR_REGISTRY_GROUP_FAMILY_ADVOCACY_GROUP_OPTION), ras_Screener_TestDataManager.ARE_YOU_A_PARTICIPANT_IN_ANY_OTHER_RESEARCH_STUDY_OR_REGISTRY_GROUP_OTHER_TEXT_BOX);
                        CommonUtils.sendKeysToElement(myRASSurveyPage.dynamicPleaseSpecifyTextBox(ras_Screener_TestDataManager.ARE_YOU_A_PARTICIPANT_IN_ANY_OTHER_RESEARCH_STUDY_OR_REGISTRY_GROUP_OTHER_OPTION), ras_Screener_TestDataManager.ARE_YOU_A_PARTICIPANT_IN_ANY_OTHER_RESEARCH_STUDY_OR_REGISTRY_GROUP_FAMILY_ADVOCACY_GROUP_TEXT_BOX);
                    }
                    CucumberLogUtils.logScreenshot();
                    ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
                }
                /**
                 * * * * * TO DETERMINE ELIGIBILITY FOR THIS STUDY, WE NEED TO COLLECT INFORMATION ABOUT MEDICAL DIAGNOSES.  THESE QUESTIONS ASK ABOUT GENERAL MEDICAL CONDITIONS, CANCER AND ANY PRIOR DIAGNOSIS OF A RASOPATHY.  PLEASE COMPLETE THIS INFORMATION TO THE BEST OF YOUR KNOWLEDGE.   * * * *
                 */
                else if (rasopathyQuestionnairePage.question.isDisplayed() && rasopathyQuestionnairePage.question.getText().contentEquals(TO_DETERMINE_ELIGIBILITY_FOR_THIS_STUDY_WE_NEED_TO_COLLECT_INFORMATION_ABOUT_MEDICAL_DIAGNOSES_THESE_QUESTIONS_ASK_ABOUT_GENERAL_MEDICAL_CONDITIONS_CANCER_AND_ANY_PRIOR_DIAGNOSIS_OF_A_RASOPATHY)) {
                    CucumberLogUtils.scenario.log("* * * * * TO DETERMINE ELIGIBILITY FOR THIS STUDY, WE NEED TO COLLECT INFORMATION ABOUT MEDICAL DIAGNOSES.  THESE QUESTIONS ASK ABOUT GENERAL MEDICAL CONDITIONS, CANCER AND ANY PRIOR DIAGNOSIS OF A RASOPATHY.  PLEASE COMPLETE THIS INFORMATION TO THE BEST OF YOUR KNOWLEDGE.  * * * * *");
                    CucumberLogUtils.logScreenshot();
                    ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
                }
                /**
                 * * * * * HAVE YOU EVER BEEN DIAGNOSED WITH THE FOLLOWING CONDITIONS?  SELECT ALL THAT APPLY.  IF YOU DO NOT SEE THE EXACT CONDITION DIAGNOSED, PLEASE SELECT THE CLOSEST ANSWER.   * * * *
                 */
                else if (rasopathyQuestionnairePage.question.isDisplayed() && (rasopathyQuestionnairePage.question.getText().trim().contentEquals(HAVE_YOU_EVER_BEEN_DIAGNOSED_WITH_THE_FOLLOWING_CONDITIONS) || rasopathyQuestionnairePage.question.getText().trim().contentEquals(formatRASQuestionForProxy(HAS_PARTICIPANT_EVER_BEEN_DIAGNOSED_WITH_THE_FOLLOWING_CONDITIONS)))) {
                    CucumberLogUtils.scenario.log("* * * * * HAVE YOU EVER BEEN DIAGNOSED WITH THE FOLLOWING CONDITIONS?  SELECT ALL THAT APPLY.  IF YOU DO NOT SEE THE EXACT CONDITION DIAGNOSED, PLEASE SELECT THE CLOSEST ANSWER.   * * * * *");
                    if (sheetName.contentEquals("screenerScenario1") || sheetName.contentEquals("screenerScenarioAdult") || sheetName.contentEquals("screenerScenarioAdult-NeedsLAR") || sheetName.contentEquals("screenerScenarioAgeUnder7") || sheetName.contentEquals("screenerScenarioAge7-10") || sheetName.contentEquals("screenerScenarioAge11-13") || sheetName.contentEquals("screenerScenarioAge14-17")) {
                        dynamicLocator(ras_Screener_TestDataManager.HAVE_YOU_BEEN_DIAGNOSED_WITH_FOLLOWING_CONDITIONS).click();
                    }
                    if (sheetName.contentEquals("screenerScenario2")) {
                        dynamicContainsLabelAndTextLocator(ras_Screener_TestDataManager.HAVE_YOU_EVER_BEEN_DIAGNOSED_WITH_THE_FOLLOWING_CONDITIONS_FEEDING_PROBLEMS_OPTION.trim()).click();
                        dynamicContainsLabelAndTextLocator(ras_Screener_TestDataManager.HAVE_YOU_EVER_BEEN_DIAGNOSED_WITH_THE_FOLLOWING_CONDITIONS_NEUROCOGNITIVE_OPTION.trim()).click();
                        dynamicContainsLabelAndTextLocator(ras_Screener_TestDataManager.HAVE_YOU_EVER_BEEN_DIAGNOSED_WITH_THE_FOLLOWING_CONDITIONS_SKELETAL_DEFORMITIES_OPTION.trim()).click();
                        dynamicContainsLabelAndTextLocator(ras_Screener_TestDataManager.HAVE_YOU_EVER_BEEN_DIAGNOSED_WITH_THE_FOLLOWING_CONDITIONS_HEAD_CRANIOFACIAL_OPTION.trim()).click();
                        dynamicContainsLabelAndTextLocator(ras_Screener_TestDataManager.HAVE_YOU_EVER_BEEN_DIAGNOSED_WITH_THE_FOLLOWING_CONDITIONS_EYE_EAR_OPTION.trim()).click();
                        dynamicContainsLabelAndTextLocator(ras_Screener_TestDataManager.HAVE_YOU_EVER_BEEN_DIAGNOSED_WITH_THE_FOLLOWING_CONDITIONS_SKIN_HAIR_OPTION.trim()).click();
                        dynamicContainsLabelAndTextLocator(ras_Screener_TestDataManager.HAVE_YOU_EVER_BEEN_DIAGNOSED_WITH_THE_FOLLOWING_CONDITIONS_HEART_PROBLEMS_OPTION.trim()).click();
                        dynamicContainsLabelAndTextLocator(ras_Screener_TestDataManager.HAVE_YOU_EVER_BEEN_DIAGNOSED_WITH_THE_FOLLOWING_CONDITIONS_GENITAL_ABNORMALITIES_OPTION.trim()).click();
                        dynamicContainsLabelAndTextLocator(ras_Screener_TestDataManager.HAVE_YOU_EVER_BEEN_DIAGNOSED_WITH_THE_FOLLOWING_CONDITIONS_NON_CANCEROUS_OPTION.trim()).click();
                        dynamicContainsLabelAndTextLocator(ras_Screener_TestDataManager.HAVE_YOU_EVER_BEEN_DIAGNOSED_WITH_THE_FOLLOWING_CONDITIONS_LYMPHEDEMA_OPTION.trim()).click();
                        dynamicContainsLabelAndTextLocator(ras_Screener_TestDataManager.HAVE_YOU_EVER_BEEN_DIAGNOSED_WITH_THE_FOLLOWING_CONDITIONS_OTHER_OPTION.trim()).click();
                        webDriver.findElement(By.xpath("//span[contains(text(),': such as endocrine issues, bleeding disorders, seizures, tethered cord')]//parent::label//parent::span//child::input")).sendKeys(ras_Screener_TestDataManager.HAVE_YOU_EVER_BEEN_DIAGNOSED_WITH_THE_FOLLOWING_CONDITIONS_OTHER_OPTION_TEXT_BOX);
                    }
                    CucumberLogUtils.logScreenshot();
                    ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
                }
                /**
                 * * * * * HAVE YOU EVER BEEN DIAGNOSED WITH CANCER? * * * *
                 */
                else if (rasopathyQuestionnairePage.question.isDisplayed() && (rasopathyQuestionnairePage.question.getText().contentEquals(HAVE_YOU_EVER_BEEN_DIAGNOSED_WITH_CANCER) || rasopathyQuestionnairePage.question.getText().contentEquals(formatRASQuestionForProxy(HAS_PARTICIPANT_EVER_BEEN_DIAGNOSED_WITH_CANCER)))) {
                    CucumberLogUtils.scenario.log("* * * * * HAVE YOU EVER BEEN DIAGNOSED WITH CANCER? * * * * *");
                    dynamicLocator(ras_Screener_TestDataManager.HAVE_YOU_BEEN_DIAGNOSED_WITH_CANCER).click();
                    CucumberLogUtils.logScreenshot();
                    ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
                }
                /**
                 * * * * * HAVE YOU BEEN DIAGNOSED WITH A RASOPATHY SUCH AS NOONAN SYNDROME, NOONAN SYNDROME WITH MULTIPLE LENTIGINES, COSTELLO SYNDROME, CARDIOFACIOCUTANEOUS SYNDROME, LEGIUS SYNDROME, CAPILLARY ARTERIOVENOUS MALFORMATION SYNDROME, HEREDITARY GINGIVAL FIBROMATOSIS OR SYNGAP1 SYNDROME? * * * *
                 */
                else if (rasopathyQuestionnairePage.question.isDisplayed() && (rasopathyQuestionnairePage.question.getText().contentEquals(HAVE_YOU_BEEN_DIAGNOSED_WITH_A_RASOPATHY) || rasopathyQuestionnairePage.question.getText().contentEquals(formatRASQuestionForProxy(HAS_PARTICIPANT_BEEN_DIAGNOSED_WITH_A_RASOPATHY)))) {
                    CucumberLogUtils.scenario.log("* * * * * HAVE YOU BEEN DIAGNOSED WITH A RASOPATHY SUCH AS NOONAN SYNDROME, NOONAN SYNDROME WITH MULTIPLE LENTIGINES, COSTELLO SYNDROME, CARDIOFACIOCUTANEOUS SYNDROME, LEGIUS SYNDROME, CAPILLARY ARTERIOVENOUS MALFORMATION SYNDROME, HEREDITARY GINGIVAL FIBROMATOSIS OR SYNGAP1 SYNDROME? * * * * *");
                    dynamicLocator(ras_Screener_TestDataManager.HAVE_YOU_BEEN_DIAGNOSED_WITH_A_RASOPATHY).click();
                    CucumberLogUtils.logScreenshot();
                    ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
                }
                /**
                 * * * * * WE KNOW THAT RASOPATHIES ARE A GROUP OF SYNDROMES THAT HAVE A GENETIC BASIS.  IN ORDER TO HELP US DETERMINE ELIGIBILITY FOR THE RASOPATHIES STUDY, WE ALSO NEED TO KNOW ABOUT ANY GENETIC TESTING THAT HAS BEEN COMPLETED.  WE WILL NEED A COPY OF ANY TEST RESULTS. * * * *
                 */
                else if (rasopathyQuestionnairePage.question.isDisplayed() && rasopathyQuestionnairePage.question.getText().contentEquals("We know that RASopathies are a group of syndromes that have a genetic basis.  In order to help us determine eligibility for the RASopathies Study, we also need to know about any genetic testing that has been completed.  We will need a copy of any test results.  ")) {
                    CucumberLogUtils.scenario.log("* * * * * WE KNOW THAT RASOPATHIES ARE A GROUP OF SYNDROMES THAT HAVE A GENETIC BASIS.  IN ORDER TO HELP US DETERMINE ELIGIBILITY FOR THE RASOPATHIES STUDY, WE ALSO NEED TO KNOW ABOUT ANY GENETIC TESTING THAT HAS BEEN COMPLETED.  WE WILL NEED A COPY OF ANY TEST RESULTS. * * * * *");
                    CucumberLogUtils.logScreenshot();
                    ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
                }
                /**
                 * * * * * HAVE ANY OF YOUR BIOLOGICAL RELATIVES BEEN DIAGNOSED WITH A RASOPATHY? * * * *
                 */
                else if (rasopathyQuestionnairePage.question.isDisplayed() && (rasopathyQuestionnairePage.question.getText().contentEquals(HAVE_ANY_OF_YOUR_BIOLOGICAL_RELATIVES_BEEN_DIAGNOSED_WITH_A_RASOPATHY) || rasopathyQuestionnairePage.question.getText().trim().contentEquals(HAVE_ANY_OF_PARTICIPANTS_RELATIVES_BEEN_DIAGNOSED_WITH_A_RASOPATHY.replace("%s's", ras_Screener_TestDataManager.PARTICIPANT_FIRST_NAME + "'s")))) {
                    CucumberLogUtils.scenario.log("* * * * * HAVE ANY OF YOUR BIOLOGICAL RELATIVES BEEN DIAGNOSED WITH A RASOPATHY? * * * * *");
                    dynamicLocator(ras_Screener_TestDataManager.HAVE_ANY_OF_YOUR_BIOLOGICAL_RELATIVES_BEEN_DIAGNOSED_WITH_A_RASOPATHY).click();
                    CucumberLogUtils.logScreenshot();
                    ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
                }
                /**
                 * * * * *
                 * HAVE YOU EVER HAD GENETIC TESTING? * * * *
                 */
                else if (rasopathyQuestionnairePage.question.isDisplayed() && (rasopathyQuestionnairePage.question.getText().trim().contentEquals(HAVE_YOU_EVER_HAD_GENETIC_TESTING) || rasopathyQuestionnairePage.question.getText().trim().contentEquals(formatRASQuestionForProxy(HAS_PARTICIPANT_EVER_HAD_GENETIC_TESTING)))) {
                    CucumberLogUtils.scenario.log("* * * * * HAVE YOU EVER HAD GENETIC TESTING? * * * * *");
                    dynamicLocator(ras_Screener_TestDataManager.HAVE_YOU_EVER_HAD_GENETIC_TESTING).click();
                    CucumberLogUtils.logScreenshot();
                    ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
                }
                /**
                 * * * * * WE WILL NOW ASK A FEW REMAINING QUESTIONS REGARDING THIS STUDY. * * * *
                 */
                else if (rasopathyQuestionnairePage.question.isDisplayed() && rasopathyQuestionnairePage.question.getText().contentEquals(WE_WILL_NOW_ASK_A_FEW_REMAINING_QUESTIONS_REGARDING_THIS_STUDY)) {
                    CucumberLogUtils.scenario.log("* * * * * WE WILL NOW ASK A FEW REMAINING QUESTIONS REGARDING THIS STUDY. * * * * *");
                    CucumberLogUtils.logScreenshot();
                    ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
                }
                /**
                 * * * * * HOW DID YOU HEAR ABOUT THIS STUDY?  IF A SPECIFIC HEALTH CARE PROVIDER REFERRED YOU TO THIS STUDY, PLEASE INCLUDE THEIR NAME IN THE CORRESPONDING TEXT BOX. * * * *
                 */
                else if (rasopathyQuestionnairePage.question.isDisplayed() && (rasopathyQuestionnairePage.question.getText().contentEquals(HOW_DID_YOU_HEAR_ABOUT_THIS_STUDY) || rasopathyQuestionnairePage.question.getText().contentEquals(formatRASQuestionForProxy(HOW_DID_PARTICIPANT_HEAR_ABOUT_THIS_STUDY)))) {
                    CucumberLogUtils.scenario.log("* * * * * HOW DID YOU HEAR ABOUT THIS STUDY?  IF A SPECIFIC HEALTH CARE PROVIDER REFERRED YOU TO THIS STUDY, PLEASE INCLUDE THEIR NAME IN THE CORRESPONDING TEXT BOX. * * * * *");
                    CommonUtils.scrollIntoView(dynamicLocator(ras_Screener_TestDataManager.HOW_DID_YOU_HEAR_ABOUT_THIS_STUDY));
                    dynamicLocator(ras_Screener_TestDataManager.HOW_DID_YOU_HEAR_ABOUT_THIS_STUDY);
                    rasopathyQuestionnairePage.dynamicLocatorForHowDidYouHearAboutStudyTextBoxes(ras_Screener_TestDataManager.HOW_DID_YOU_HEAR_ABOUT_THIS_STUDY).sendKeys(ras_Screener_TestDataManager.HOW_DID_YOU_HEAR_ABOUT_THIS_STUDY_OTHER_REASON);
                    CucumberLogUtils.logScreenshot();
                    ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
                }
                /**
                 * * * * * HAVE YOU OR OTHER FAMILY MEMBERS EVER PARTICIPATED IN ANOTHER STUDY ON RASOPATHY AT ANOTHER MEDICAL INSTITUTION, UNIVERSITY, GOVERNMENT AGENCY OR OTHER SITE? * * * *
                 */
                else if (rasopathyQuestionnairePage.question.isDisplayed() && (rasopathyQuestionnairePage.question.getText().contentEquals(HAVE_YOU_OR_OTHER_FAMILY_MEMBERS_EVER_PARTICIPATED_IN_ANOTHER_STUDY_ON_RASOPATHY_AT_ANOTHER_MEDICAL_INSTITUTION_UNIVERSITY_GOVERNMENT_AGENCY_OR_OTHER_SITE) || rasopathyQuestionnairePage.question.getText().contentEquals(formatRASQuestionForProxy(HAS_PARTICIPANT_OR_OTHER_FAMILY_MEMBERS_EVER_PARTICIPATED_IN_ANOTHER_STUDY_ON_RASOPATHY_AT_ANOTHER_MEDICAL_INSTITUTION_UNIVERSITY_GOVERNMENT_AGENCY_OR_OTHER_SITE)))) {
                    CucumberLogUtils.scenario.log("* * * * * HAVE YOU OR OTHER FAMILY MEMBERS EVER PARTICIPATED IN ANOTHER STUDY ON RASOPATHY AT ANOTHER MEDICAL INSTITUTION, UNIVERSITY, GOVERNMENT AGENCY OR OTHER SITE? * * * * *");
                    dynamicLocator(ras_Screener_TestDataManager.HAVE_YOU_OR_OTHER_FAMILY_MEMBERS_PARTICIPATED_IN_OTHER_STUDY).click();
                    CucumberLogUtils.logScreenshot();
                    ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
                }
                /**
                 * * * * * WHAT ARE THE MAIN REASONS FOR PARTICIPATING IN THIS STUDY?  SELECT ALL THAT APPLY.  PLEASE ELABORATE ON THE REASON IN THE CORRESPONDING TEXTBOX. * * * *
                 */
                else if (rasopathyQuestionnairePage.question.isDisplayed() && rasopathyQuestionnairePage.question.getText().contentEquals(WHAT_ARE_THE_MAIN_REASONS_FOR_PARTICIPATING_IN_THIS_STUDY)) {
                    CucumberLogUtils.scenario.log("* * * * * WHAT ARE THE MAIN REASONS FOR PARTICIPATING IN THIS STUDY?  SELECT ALL THAT APPLY.  PLEASE ELABORATE ON THE REASON IN THE CORRESPONDING TEXTBOX. * * * * *");
                    if (sheetName.contentEquals("screenerScenario1") || sheetName.contentEquals("screenerScenarioAdult") || sheetName.contentEquals("screenerScenarioAdult-NeedsLAR") || sheetName.contentEquals("screenerScenarioAgeUnder7") || sheetName.contentEquals("screenerScenarioAge7-10") || sheetName.contentEquals("screenerScenarioAge11-13") || sheetName.contentEquals("screenerScenarioAge14-17")) {
                        CommonUtils.scrollIntoView(dynamicLocator(ras_Screener_TestDataManager.WHAT_ARE_MAIN_REASONS_FOR_PARTICIPATING_IN_STUDY));
                        dynamicLocator(ras_Screener_TestDataManager.WHAT_ARE_MAIN_REASONS_FOR_PARTICIPATING_IN_STUDY).click();
                        rasopathyQuestionnairePage.dynamicLocatorForMainReasonForParticipatingInStudy(ras_Screener_TestDataManager.WHAT_ARE_MAIN_REASONS_FOR_PARTICIPATING_IN_STUDY).sendKeys(ras_Screener_TestDataManager.WHAT_ARE_MAIN_REASONS_FOR_PARTICIPATING_IN_STUDY_OTHER_REASON);
                    }
                    if (sheetName.contentEquals("screenerScenario2")) {
                        for (int b = 1; b < 5; b++) {
                            CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicClickOnCheckboxesScreener(b));
                        }
                        CommonUtils.sendKeysToElement(myRASSurveyPage.screenerDynamicOtherTextBox(ras_Screener_TestDataManager.WHAT_ARE_THE_MAIN_REASONS_FOR_PARTICIPATING_OPTION1), ras_Screener_TestDataManager.WHAT_ARE_THE_MAIN_REASONS_FOR_PARTICIPATING_OPTION1_OTHER);
                        CommonUtils.sendKeysToElement(myRASSurveyPage.screenerDynamicOtherTextBox(ras_Screener_TestDataManager.WHAT_ARE_THE_MAIN_REASONS_FOR_PARTICIPATING_OPTION2), ras_Screener_TestDataManager.WHAT_ARE_THE_MAIN_REASONS_FOR_PARTICIPATING_OPTION2_OTHER);
                        CommonUtils.sendKeysToElement(myRASSurveyPage.screenerDynamicOtherTextBox(ras_Screener_TestDataManager.WHAT_ARE_THE_MAIN_REASONS_FOR_PARTICIPATING_OPTION3), ras_Screener_TestDataManager.WHAT_ARE_THE_MAIN_REASONS_FOR_PARTICIPATING_OPTION3_OTHER);
                        CommonUtils.sendKeysToElement(myRASSurveyPage.screenerDynamicOtherTextBox(ras_Screener_TestDataManager.WHAT_ARE_THE_MAIN_REASONS_FOR_PARTICIPATING_OPTION4), ras_Screener_TestDataManager.WHAT_ARE_THE_MAIN_REASONS_FOR_PARTICIPATING_OPTION4_OTHER);
                    }
                    CucumberLogUtils.logScreenshot();
                    ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
                }
                /**
                 * * * * * PLEASE COMPLETE THE BOX BELOW BY SELECTING WHICH PRIMARY CANCERS WERE DIAGNOSED AND AT WHAT AGE AND YEAR THEY OCCURRED. IF CANCER SPREAD FROM ONE PLACE TO ANOTHER, PLEASE ONLY INDICATE THE ORIGINAL CANCERS AND NOT THE NUMBER OF SITES WHERE CANCER SPREAD. * * * *
                 */
                else if (rasopathyQuestionnairePage.question.isDisplayed() && rasopathyQuestionnairePage.question.getText().trim().contentEquals(PLEASE_COMPLETE_THE_BOX_BELOW_BY_SELECTING_WHICH_PRIMARY_CANCERS_WERE_DIAGNOSED)) {
                    CucumberLogUtils.scenario.log("* * * * * PLEASE COMPLETE THE BOX BELOW BY SELECTING WHICH PRIMARY CANCERS WERE DIAGNOSED AND AT WHAT AGE AND YEAR THEY OCCURRED. IF CANCER SPREAD FROM ONE PLACE TO ANOTHER, PLEASE ONLY INDICATE THE ORIGINAL CANCERS AND NOT THE NUMBER OF SITES WHERE CANCER SPREAD. * * * * *");
                    if (sheetName.contentEquals("screenerScenario2")) {
                        CommonUtils.sleep(800);
                        CommonUtils.selectDropDownValue(ras_Screener_TestDataManager.PLEASE_COMPLETE_THE_BOX_BELOW_BY_SELECTING_WHICH_PRIMARY_CANCERS_COLUMN1_OPTION1, myRASSurveyPage.whichPrimaryCancersWereDiagnosedDropDownSelector(1, 1));
                        CommonUtils.selectDropDownValue(ras_Screener_TestDataManager.PLEASE_COMPLETE_THE_BOX_BELOW_BY_SELECTING_WHICH_PRIMARY_CANCERS_COLUMN1_OPTION2, myRASSurveyPage.whichPrimaryCancersWereDiagnosedDropDownSelector(2, 1));
                        CommonUtils.selectDropDownValue(ras_Screener_TestDataManager.PLEASE_COMPLETE_THE_BOX_BELOW_BY_SELECTING_WHICH_PRIMARY_CANCERS_COLUMN1_OPTION3, myRASSurveyPage.whichPrimaryCancersWereDiagnosedDropDownSelector(3, 1));
                        CommonUtils.selectDropDownValue(ras_Screener_TestDataManager.PLEASE_COMPLETE_THE_BOX_BELOW_BY_SELECTING_WHICH_PRIMARY_CANCERS_COLUMN1_OPTION4, myRASSurveyPage.whichPrimaryCancersWereDiagnosedDropDownSelector(4, 1));

                        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 6), ras_Screener_TestDataManager.PLEASE_COMPLETE_THE_BOX_BELOW_BY_SELECTING_WHICH_PRIMARY_CANCERS_COLUMN2_OPTION1);
                        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 6), ras_Screener_TestDataManager.PLEASE_COMPLETE_THE_BOX_BELOW_BY_SELECTING_WHICH_PRIMARY_CANCERS_COLUMN2_OPTION2);
                        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 6), ras_Screener_TestDataManager.PLEASE_COMPLETE_THE_BOX_BELOW_BY_SELECTING_WHICH_PRIMARY_CANCERS_COLUMN2_OPTION3);
                        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 6), ras_Screener_TestDataManager.PLEASE_COMPLETE_THE_BOX_BELOW_BY_SELECTING_WHICH_PRIMARY_CANCERS_COLUMN2_OPTION4);

                        CommonUtils.selectDropDownValue(ras_Screener_TestDataManager.PLEASE_COMPLETE_THE_BOX_BELOW_BY_SELECTING_WHICH_PRIMARY_CANCERS_COLUMN3_OPTION1, myRASSurveyPage.whichPrimaryCancersWereDiagnosedDropDownSelector(1, 3));
                        CommonUtils.selectDropDownValue(ras_Screener_TestDataManager.PLEASE_COMPLETE_THE_BOX_BELOW_BY_SELECTING_WHICH_PRIMARY_CANCERS_COLUMN3_OPTION2, myRASSurveyPage.whichPrimaryCancersWereDiagnosedDropDownSelector(2, 3));
                        CommonUtils.selectDropDownValue(ras_Screener_TestDataManager.PLEASE_COMPLETE_THE_BOX_BELOW_BY_SELECTING_WHICH_PRIMARY_CANCERS_COLUMN3_OPTION3, myRASSurveyPage.whichPrimaryCancersWereDiagnosedDropDownSelector(3, 3));
                        CommonUtils.selectDropDownValue(ras_Screener_TestDataManager.PLEASE_COMPLETE_THE_BOX_BELOW_BY_SELECTING_WHICH_PRIMARY_CANCERS_COLUMN3_OPTION4, myRASSurveyPage.whichPrimaryCancersWereDiagnosedDropDownSelector(4, 3));

                        CommonUtils.sleep(300);
                        CommonUtils.selectDropDownValue(ras_Screener_TestDataManager.PLEASE_COMPLETE_THE_BOX_BELOW_BY_SELECTING_WHICH_PRIMARY_CANCERS_COLUMN4_OPTION1, myRASSurveyPage.whichPrimaryCancersWereDiagnosedDropDownSelector(1, 4));
                        CommonUtils.sleep(300);
                        CommonUtils.selectDropDownValue(ras_Screener_TestDataManager.PLEASE_COMPLETE_THE_BOX_BELOW_BY_SELECTING_WHICH_PRIMARY_CANCERS_COLUMN4_OPTION2, myRASSurveyPage.whichPrimaryCancersWereDiagnosedDropDownSelector(2, 4));


                        CommonUtils.selectDropDownValue(ras_Screener_TestDataManager.PLEASE_COMPLETE_THE_BOX_BELOW_BY_SELECTING_WHICH_PRIMARY_CANCERS_COLUMN5_OPTION1, myRASSurveyPage.whichPrimaryCancersWereDiagnosedDropDownSelector(1, 5));
                        CommonUtils.selectDropDownValue(ras_Screener_TestDataManager.PLEASE_COMPLETE_THE_BOX_BELOW_BY_SELECTING_WHICH_PRIMARY_CANCERS_COLUMN5_OPTION2, myRASSurveyPage.whichPrimaryCancersWereDiagnosedDropDownSelector(2, 5));

                        CommonUtils.selectDropDownValue(ras_Screener_TestDataManager.PLEASE_COMPLETE_THE_BOX_BELOW_BY_SELECTING_WHICH_PRIMARY_CANCERS_COLUMN6_OPTION3, myRASSurveyPage.whichPrimaryCancersWereDiagnosedDropDownSelector(3, 6));

                        CommonUtils.selectDropDownValue(ras_Screener_TestDataManager.PLEASE_COMPLETE_THE_BOX_BELOW_BY_SELECTING_WHICH_PRIMARY_CANCERS_COLUMN7_OPTION1, myRASSurveyPage.whichPrimaryCancersWereDiagnosedDropDownSelector(1, 7));
                        CommonUtils.selectDropDownValue(ras_Screener_TestDataManager.PLEASE_COMPLETE_THE_BOX_BELOW_BY_SELECTING_WHICH_PRIMARY_CANCERS_COLUMN7_OPTION2, myRASSurveyPage.whichPrimaryCancersWereDiagnosedDropDownSelector(2, 7));
                        CommonUtils.selectDropDownValue(ras_Screener_TestDataManager.PLEASE_COMPLETE_THE_BOX_BELOW_BY_SELECTING_WHICH_PRIMARY_CANCERS_COLUMN7_OPTION3, myRASSurveyPage.whichPrimaryCancersWereDiagnosedDropDownSelector(3, 7));
                        CommonUtils.selectDropDownValue(ras_Screener_TestDataManager.PLEASE_COMPLETE_THE_BOX_BELOW_BY_SELECTING_WHICH_PRIMARY_CANCERS_COLUMN7_OPTION4, myRASSurveyPage.whichPrimaryCancersWereDiagnosedDropDownSelector(4, 7));
                    }
                    CucumberLogUtils.logScreenshot();
                    ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
                }
                /**
                 * * * * * FOR WHICH SPECIFIC RASOPATHY HAVE YOU BEEN DIAGNOSED? * * * *
                 */
                else if (rasopathyQuestionnairePage.question.isDisplayed() && rasopathyQuestionnairePage.question.getText().contains(FOR_WHICH_SPECIFIC_RASOPATHY_HAVE_YOU_BEEN_DIAGNOSED)) {
                    CucumberLogUtils.scenario.log("* * * * * FOR WHICH SPECIFIC RASOPATHY HAVE YOU BEEN DIAGNOSED? * * * * *");
                    CommonUtils.sendKeysToElement(myRASSurveyPage.dynamicPleaseSpecifyTextBox(ras_Screener_TestDataManager.FOR_WHICH_SPECIFIC_RASOPATHY), ras_Screener_TestDataManager.FOR_WHICH_SPECIFIC_RASOPATHY_OTHER);
                    ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
                    CucumberLogUtils.logScreenshot();
                }
                /**
                 * * * * * AGE (IN YEARS) AT DIAGNOSIS * * * *
                 */
                else if (rasopathyQuestionnairePage.question.isDisplayed() && rasopathyQuestionnairePage.question.getText().contains(AGE_IN_YEARS_AT_DIAGNOSIS)) {
                    CucumberLogUtils.scenario.log("* * * * * AGE (IN YEARS) AT DIAGNOSIS * * * * *");
                    webDriver.findElement(By.xpath("//input[@type='TEXT']")).sendKeys(ras_Screener_TestDataManager.AGE_AT_DIAGNOSIS);
                    ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
                    CucumberLogUtils.logScreenshot();
                }
                /**
                 * * * * * YEAR OF DIAGNOSIS (YYYY) * * * *
                 */
                else if (rasopathyQuestionnairePage.question.isDisplayed() && rasopathyQuestionnairePage.question.getText().contains(YEAR_OF_DIAGNOSIS_YYYY)) {
                    CucumberLogUtils.scenario.log("* * * * * YEAR OF DIAGNOSIS (YYYY) * * * * *");
                    webDriver.findElement(By.xpath("//input[@type='TEXT']")).sendKeys(ras_Screener_TestDataManager.YEAR_OF_DIAGNOSIS_RAS);
                    ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
                    CucumberLogUtils.logScreenshot();
                }
                /**
                 * * * * * DO YOU HAVE A COPY OF THE GENETIC TEST RESULTS? * * * *
                 */
                else if (rasopathyQuestionnairePage.question.isDisplayed() && rasopathyQuestionnairePage.question.getText().contains(DO_YOU_HAVE_A_COPY_OF_THE_GENETIC_TEST_RESULTS)) {
                    CucumberLogUtils.scenario.log("* * * * * DO YOU HAVE A COPY OF THE GENETIC TEST RESULTS? * * * * *");
                    Dynamic_Locators.dynamicTextLocator(ras_Screener_TestDataManager.HAVE_YOU_EVER_HAD_GENETIC_TESTING).click();
                    ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
                    CucumberLogUtils.logScreenshot();
                }
                /**
                 * * * * * HOW WOULD YOU LIKE TO PROVIDE THE GENETIC TEST RESULTS TO US?  PLEASE SELECT ONE.  ON THE NEXT PAGE, YOU WILL BE PROVIDED WITH WHERE TO SEND THE INFORMATION. * * * *
                 */
                else if (rasopathyQuestionnairePage.question.isDisplayed() && rasopathyQuestionnairePage.question.getText().contains(HOW_WOULD_YOU_LIKE_TO_PROVIDE_THE_GENETIC_TEST_RESULTS_TO_US)) {
                    CucumberLogUtils.scenario.log("* * * * * HOW WOULD YOU LIKE TO PROVIDE THE GENETIC TEST RESULTS TO US?  PLEASE SELECT ONE.  ON THE NEXT PAGE, YOU WILL BE PROVIDED WITH WHERE TO SEND THE INFORMATION. * * * * *");
                    Dynamic_Locators.dynamicTextLocator(ras_Screener_TestDataManager.HOW_WOULD_YOU_LIKE_TO_PROVIDE_THE_GENETIC_TEST_RESULTS).click();
                    ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
                    CucumberLogUtils.logScreenshot();
                }
                /**
                 * * * * * IF YOU WOULD LIKE TO UPLOAD THE GENETIC TEST RESULTS, PLEASE DO SO HERE.  NOTE: ONLY PDF FILES ARE ACCEPTED. * * * *
                 */
                else if (rasopathyQuestionnairePage.question.isDisplayed() && rasopathyQuestionnairePage.question.getText().contains(IF_YOU_WOULD_LIKE_TO_UPLOAD_THE_GENETIC_TEST_RESULTS_PLEASE_DO_SO_HERE)) {
                    CucumberLogUtils.scenario.log("* * * * * IF YOU WOULD LIKE TO UPLOAD THE GENETIC TEST RESULTS, PLEASE DO SO HERE.  NOTE: ONLY PDF FILES ARE ACCEPTED. * * * * *");
                    ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
                    CucumberLogUtils.logScreenshot();
                }
                /**
                 * * * * * PLEASE PROVIDE THE INFORMATION REGARDING PREVIOUS PARTICIPATION IN OTHER RASOPATHY STUDIES IN THE BOX BELOW. * * * *
                 */
                else if (rasopathyQuestionnairePage.question.isDisplayed() && rasopathyQuestionnairePage.question.getText().contains(PLEASE_PROVIDE_THE_INFORMATION_REGARDING_PREVIOUS_PARTICIPATION_IN_OTHER_RASOPATHY_STUDIES_IN_THE_BOX_BELOW)) {
                    CucumberLogUtils.scenario.log("* * * * * PLEASE PROVIDE THE INFORMATION REGARDING PREVIOUS PARTICIPATION IN OTHER RASOPATHY STUDIES IN THE BOX BELOW. * * * * *");
                    if (sheetName.contentEquals("screenerScenario2")) {
                        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3), ras_Screener_TestDataManager.PLEASE_PROVIDE_THE_INFORMATION_REGARDING_PREVIOUS_PARTICIPATION_COLUMN1_OPTION1);
                        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 6), ras_Screener_TestDataManager.PLEASE_PROVIDE_THE_INFORMATION_REGARDING_PREVIOUS_PARTICIPATION_COLUMN2_OPTION1);
                        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 9), ras_Screener_TestDataManager.PLEASE_PROVIDE_THE_INFORMATION_REGARDING_PREVIOUS_PARTICIPATION_COLUMN3_OPTION1);
                        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 12), ras_Screener_TestDataManager.PLEASE_PROVIDE_THE_INFORMATION_REGARDING_PREVIOUS_PARTICIPATION_COLUMN4_OPTION1);
                        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 15), ras_Screener_TestDataManager.PLEASE_PROVIDE_THE_INFORMATION_REGARDING_PREVIOUS_PARTICIPATION_COLUMN5_OPTION1);
                        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 16), ras_Screener_TestDataManager.PLEASE_PROVIDE_THE_INFORMATION_REGARDING_PREVIOUS_PARTICIPATION_COLUMN6_OPTION1);
                        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 3), ras_Screener_TestDataManager.PLEASE_PROVIDE_THE_INFORMATION_REGARDING_PREVIOUS_PARTICIPATION_COLUMN1_OPTION2);
                        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 6), ras_Screener_TestDataManager.PLEASE_PROVIDE_THE_INFORMATION_REGARDING_PREVIOUS_PARTICIPATION_COLUMN2_OPTION2);
                        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 9), ras_Screener_TestDataManager.PLEASE_PROVIDE_THE_INFORMATION_REGARDING_PREVIOUS_PARTICIPATION_COLUMN3_OPTION2);
                        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 12), ras_Screener_TestDataManager.PLEASE_PROVIDE_THE_INFORMATION_REGARDING_PREVIOUS_PARTICIPATION_COLUMN4_OPTION2);
                        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 15), ras_Screener_TestDataManager.PLEASE_PROVIDE_THE_INFORMATION_REGARDING_PREVIOUS_PARTICIPATION_COLUMN5_OPTION2);
                        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 16), ras_Screener_TestDataManager.PLEASE_PROVIDE_THE_INFORMATION_REGARDING_PREVIOUS_PARTICIPATION_COLUMN6_OPTION2);
                        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 3), ras_Screener_TestDataManager.PLEASE_PROVIDE_THE_INFORMATION_REGARDING_PREVIOUS_PARTICIPATION_COLUMN1_OPTION3);
                        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 6), ras_Screener_TestDataManager.PLEASE_PROVIDE_THE_INFORMATION_REGARDING_PREVIOUS_PARTICIPATION_COLUMN2_OPTION3);
                        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 9), ras_Screener_TestDataManager.PLEASE_PROVIDE_THE_INFORMATION_REGARDING_PREVIOUS_PARTICIPATION_COLUMN3_OPTION3);
                        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 12), ras_Screener_TestDataManager.PLEASE_PROVIDE_THE_INFORMATION_REGARDING_PREVIOUS_PARTICIPATION_COLUMN4_OPTION3);
                        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 15), ras_Screener_TestDataManager.PLEASE_PROVIDE_THE_INFORMATION_REGARDING_PREVIOUS_PARTICIPATION_COLUMN5_OPTION3);
                        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 16), ras_Screener_TestDataManager.PLEASE_PROVIDE_THE_INFORMATION_REGARDING_PREVIOUS_PARTICIPATION_COLUMN6_OPTION3);
                        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 3), ras_Screener_TestDataManager.PLEASE_PROVIDE_THE_INFORMATION_REGARDING_PREVIOUS_PARTICIPATION_COLUMN1_OPTION4);
                        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 6), ras_Screener_TestDataManager.PLEASE_PROVIDE_THE_INFORMATION_REGARDING_PREVIOUS_PARTICIPATION_COLUMN2_OPTION4);
                        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 9), ras_Screener_TestDataManager.PLEASE_PROVIDE_THE_INFORMATION_REGARDING_PREVIOUS_PARTICIPATION_COLUMN3_OPTION4);
                        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 12), ras_Screener_TestDataManager.PLEASE_PROVIDE_THE_INFORMATION_REGARDING_PREVIOUS_PARTICIPATION_COLUMN4_OPTION4);
                        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 15), ras_Screener_TestDataManager.PLEASE_PROVIDE_THE_INFORMATION_REGARDING_PREVIOUS_PARTICIPATION_COLUMN5_OPTION4);
                        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 16), ras_Screener_TestDataManager.PLEASE_PROVIDE_THE_INFORMATION_REGARDING_PREVIOUS_PARTICIPATION_COLUMN6_OPTION4);
                    }
                    ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
                    CucumberLogUtils.logScreenshot();
                }
                /**
                 * * * * * YOU ARE ALMOST DONE! * * * *
                 */
                else if (rasopathyQuestionnairePage.question.isDisplayed() && rasopathyQuestionnairePage.question.getText().contains(YOU_ARE_ALMOST_DONE)) {
                    CucumberLogUtils.scenario.log("* * * * * YOU ARE ALMOST DONE! * * * * *");
                    ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
                    CommonUtils.sleep(3000);
                    CucumberLogUtils.logScreenshot();
                    ServiceNow_Common_Methods.logOutOfNativeView();
                }
            } catch (Exception e) {
                CucumberLogUtils.scenario.log("* * * SCREENER COMPLETED * * *");
                break;
            }
        }
    }

    /***
     * THIS METHOD WILL SELECT THE SCREENER FOR VERIFICATION ACCORDING TO THE SHEET CHOSEN IN THE FEATURE FILE
     */
    public void rasScreenerVerificationScenarioSelector(String sheetName) {
        if (sheetName.contentEquals("screenerScenario2")) {
            ras_Screener_TestDataManager.dataInitializerRasScreener(sheetName);
            ras_screenerSubmissions_stepsImpl.verifying_RAS_Screener_Scenario_2_Data(sheetName);
        } else if (sheetName.contentEquals("screenerScenarioAge11-13")) {
            ras_Screener_TestDataManager.dataInitializerRasScreener(sheetName);
            ras_screenerSubmissions_stepsImpl.verifying_RAS_Screener_Scenario_Minor_Data(sheetName);
        }
    }

    /***
     * THIS METHOD WILL SELECT THE CONSENT FLOW ACCORDING TO THE SHEET CHOSEN IN THE FEATURE FILE
     */
    public void rasConsentScenarioSelector(String sheetName) {
        CommonUtils.sleep(20000);
        ras_Screener_TestDataManager.dataInitializerRasScreener(sheetName);
        ras_screenerSubmissions_stepsImpl.nativeViewConsentFlowProcessScenario1(sheetName);
    }

    /**
     * Study Team member to logs in to the Native View and completes consent call.
     *
     * @param sheetName        The name of the sheet containing the relevant data for the consent call.
     * @param collectionMethod The method used to collect consent, such as manual or automated processes.
     */
    public void study_team_member_logs_in_to_Native_View_and_completes_consent_call(String sheetName, String collectionMethod) {
        ras_Screener_TestDataManager.dataInitializerRasScreener(sheetName);
        ras_NV_Consent_Record_TestDataManager.dataInitializerRasConsentRecord(sheetName, collectionMethod);
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        navigateToParticipantRecordInNativeView(sheetName);
        submitParticipantForReviewAndEligibility();
        openConsentRecord();
        consentFlowProcess();
    }

    /***
     * THIS METHOD WILL SELECT THE IIQ SUBMISSION ACCORDING TO THE SHEET CHOSEN IN THE FEATURE FILE
     */
    public void iiqScenarioSelector(String sheetNameIiq) {
        if (sheetNameIiq.contentEquals("IIQScenario1")) {
            iiq_TestDataManager.dataInitializerIIQ(sheetNameIiq);
            ras_screenerSubmissions_stepsImpl.rasScreenerIIQFormScenario1();
        } else if (sheetNameIiq.contentEquals("IIQScenario2")) {
            iiq_TestDataManager.dataInitializerIIQ(sheetNameIiq);
            rasScenario2StepsImpl.rasScreenerIIQFormScenario2();
        } else if (sheetNameIiq.contentEquals("IIQScenario3")) {
            iiq_TestDataManager.dataInitializerIIQ(sheetNameIiq);
            rasScenario3StepsImpl.rasScreenerIIQFormScenario3();
        } else if (sheetNameIiq.contentEquals("IIQScenario4")) {
            iiq_TestDataManager.dataInitializerIIQ(sheetNameIiq);
            rasScenario4StepsImpl.rasScreenerIIQFormScenario4();
        }
    }

    /***
     * THIS METHOD WILL SELECT THE SURVEY SUBMISSION ACCORDING TO THE SHEET CHOSEN IN THE FEATURE FILE
     */
    public void rasSurveyScenarioSelector(String sheetName) {
        if (sheetName.contentEquals("RASSurveyScenario1")) {
            ras_Survey_TestDataManager.dataInitializerRasSurvey(sheetName);
            ras_screenerSubmissions_stepsImpl.rasScreenerSurveyScenario1PartOne();
            ras_screenerSubmissions_stepsImpl.rasScreenerSurveyScenario1PartTwo();
            ras_screenerSubmissions_stepsImpl.rasScreenerSurveyScenario1PartThree();
            ras_screenerSubmissions_stepsImpl.rasScreenerSurveyScenario1PartFour();
            ras_screenerSubmissions_stepsImpl.rasScreenerSurveyScenario1PartFive();
            ras_screenerSubmissions_stepsImpl.rasScreenerSurveyScenario1PartSix();
            ras_screenerSubmissions_stepsImpl.rasScreenerSurveyScenario1PartSeven();
            ras_screenerSubmissions_stepsImpl.rasScreenerSurveyScenario1PartEight();
            ras_screenerSubmissions_stepsImpl.rasScreenerSurveyScenario1PartNine();
            ras_screenerSubmissions_stepsImpl.rasScreenerSurveyScenario1PartTen();
        } else if (sheetName.contentEquals("RASSurveyScenario2")) {
            ras_Survey_TestDataManager.dataInitializerRasSurvey(sheetName);
            rasScenario2StepsImpl.rasScreenerSurveyScenario2PartOne();
            rasScenario2StepsImpl.rasScreenerSurveyScenario2PartTwo();
            rasScenario2StepsImpl.rasScreenerSurveyScenario2PartThree();
            rasScenario2StepsImpl.rasScreenerSurveyScenario2PartFour();
            rasScenario2StepsImpl.rasScreenerSurveyScenario2PartFive();
            rasScenario2StepsImpl.rasScreenerSurveyScenario2PartSix();
            rasScenario2StepsImpl.rasScreenerSurveyScenario2PartSeven();
            rasScenario2StepsImpl.rasScreenerSurveyScenario2PartEight();
            rasScenario2StepsImpl.rasScreenerSurveyScenario2PartNine();
            rasScenario2StepsImpl.rasScreenerSurveyScenario2PartTen();
        } else if (sheetName.contentEquals("RASSurveyScenario3")) {
            ras_Survey_TestDataManager.dataInitializerRasSurvey(sheetName);
            rasScenario3StepsImpl.rasScreenerSurveyScenario3PartOne();
            rasScenario3StepsImpl.rasScreenerSurveyScenario3PartTwo();
            rasScenario3StepsImpl.rasScreenerSurveyScenario3PartThree();
            rasScenario3StepsImpl.rasScreenerSurveyScenario3PartFour();
            rasScenario3StepsImpl.rasScreenerSurveyScenario3PartFive();
            rasScenario3StepsImpl.rasScreenerSurveyScenario3PartSix();
            rasScenario3StepsImpl.rasScreenerSurveyScenario3PartSeven();
            rasScenario3StepsImpl.rasScreenerSurveyScenario3PartEight();
            rasScenario3StepsImpl.rasScreenerSurveyScenario3PartNine();
            rasScenario3StepsImpl.rasScreenerSurveyScenario3PartTen();
        } else if (sheetName.contentEquals("RASSurveyScenario4")) {
            ras_Survey_TestDataManager.dataInitializerRasSurvey(sheetName);
            rasScenario4StepsImpl.rasScreenerSurveyScenario4PartOne();
            rasScenario4StepsImpl.rasScreenerSurveyScenario4PartTwo();
            rasScenario4StepsImpl.rasScreenerSurveyScenario4PartThree();
            rasScenario4StepsImpl.rasScreenerSurveyScenario4PartFour();
            rasScenario4StepsImpl.rasScreenerSurveyScenario4PartFive();
            rasScenario4StepsImpl.rasScreenerSurveyScenario4PartSix();
            rasScenario4StepsImpl.rasScreenerSurveyScenario4PartSeven();
            rasScenario4StepsImpl.rasScreenerSurveyScenario4PartEight();
            rasScenario4StepsImpl.rasScreenerSurveyScenario4PartNine();
            rasScenario4StepsImpl.rasScreenerSurveyScenario4PartTen();
        }
    }

    /***
     * THIS METHOD WILL LOG IN WITH USER NAME AND PASSWORD DEFINED IN FEATURE FILE
     */
    public void logsInViaOktaWithUsernameAndPassword(String username, String password) {

        CommonUtils.sleep(1000);
        CommonUtils.waitForVisibility(myRASLoginPage.loginToMyRASButton);
        CommonUtils.clickOnElement(myRASLoginPage.loginToMyRASButton);

        try {
            oktaLoginPage.usernameTxtBox.clear();
            oktaLoginPage.usernameTxtBox.sendKeys(username);
            CommonUtils.clickOnElement(oktaLoginPage.nextButton);
            CommonUtils.sleep(1000);
            oktaLoginPage.passwordTxtBox.sendKeys(password);
            CommonUtils.sleep(1000);
            CommonUtils.clickOnElement(oktaLoginPage.loginBtn);
            CommonUtils.sleep(2000);
            CommonUtils.waitForVisibility(myRASHomePage.warningAgreeButton);
            CucumberLogUtils.logScreenshot();
            myRASHomePage.warningAgreeButton.click();
        } catch (NoSuchElementException e) {
            CommonUtils.sendKeysToElement(oktaLoginPage.passwordTxtBox, password);
            CommonUtils.sleep(1000);
            CommonUtils.clickOnElement(oktaLoginPage.loginBtn);
            CommonUtils.sleep(2000);
            CommonUtils.waitForVisibility(myRASHomePage.warningAgreeButton);
            CucumberLogUtils.logScreenshot();
            myRASHomePage.warningAgreeButton.click();
        }
        softAssert.assertEquals(myRASHomePage.rasopathyPortalHeader.getText(), CHARMSRASScreenerConstants.PORTAL_HEADER);
    }

    /***
     * USE THIS METHOD TO CLICK ON ELIGIBILITY QUESTIONNAIRE
     */
    public void clicksOnEligibilityQuestionnaireToBeginQuestionnaire(String text) {
        CommonUtils.waitForVisibility(MyRASHomePage.dynamicModuleLocator(text));
        MyRASHomePage.dynamicModuleLocator(text).click();
    }

    /***
     * USE THIS METHOD TO CLICK ON RAS SURVEY QUESTIONNAIRE
     */
    public void clicksOnTheRasSurveyForm() {
        CommonUtils.waitForVisibility(myRASHomePage.rasoptathyRasSurveyButton);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(myRASHomePage.rasoptathyRasSurveyButton);
        CommonUtils.sleep(30000);
        CucumberLogUtils.logScreenshot();
        CommonUtils.waitForClickability(myRASHomePage.rasoptathyRasSurveyCloseButton);
        CommonUtils.clickOnElement(myRASHomePage.rasoptathyRasSurveyCloseButton);
        CommonUtils.waitForVisibility(myRASHomePage.rasoptathyRasSurveyButton);
        CucumberLogUtils.logScreenshot();
        CommonUtils.sleep(5000);
        CommonUtils.clickOnElement(myRASHomePage.rasoptathyRasSurveyButton);
        CommonUtils.waitForClickability(myRASHomePage.rasoptathyRasSurveyGoButton);
        CommonUtils.sleep(5000);
    }

    /***
     * USE THIS METHOD TO CLICK ON RAS IIQ FORM
     */
    public void clicksOnTheIiqForm() {
        CommonUtils.waitForVisibility(myRASHomePage.rasoptathyIiqButton);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(myRASHomePage.rasoptathyIiqButton);
        CommonUtils.sleep(30000);
        CucumberLogUtils.logScreenshot();
        CommonUtils.waitForClickability(myRASHomePage.rasoptathyRasSurveyCloseButton);
        CommonUtils.clickOnElement(myRASHomePage.rasoptathyRasSurveyCloseButton);
        CommonUtils.waitForVisibility(myRASHomePage.rasoptathyIiqButton);
        CucumberLogUtils.logScreenshot();
        CommonUtils.sleep(5000);
        CommonUtils.clickOnElement(myRASHomePage.rasoptathyIiqButton);
        CommonUtils.waitForClickability(myRASHomePage.rasoptathyRasSurveyGoButton);
        CommonUtils.sleep(5000);
    }

    /***
     * USE THIS METHOD TO ENTER EMAIL AND PIN
     */
    public void aParticipantEntersUsernameUndPin(String email) {
        CucumberLogUtils.logScreenshot();
        CommonUtils.waitForVisibility(myRASHomePage.rasoptathyRasSurveyPin);
        String pin = myRASHomePage.rasoptathyRasSurveyPin.getText();
        CommonUtils.clickOnElement(myRASHomePage.rasoptathyRasSurveyGoButton);
        CommonUtils.switchToNextWindow();
        CommonUtils.sleep(3000);
        CommonUtils.waitForVisibility(rasopathyQuestionnairePage.dynamicTextBoxLocator("Email"));
        rasopathyQuestionnairePage.dynamicTextBoxLocator("Email").sendKeys(email);
        rasopathyQuestionnairePage.pinTextBox.sendKeys(pin);
        CucumberLogUtils.logScreenshot();
        CommonUtils.sleep(3000);
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.sleep(3000);
        CucumberLogUtils.logScreenshot();
    }

    /***
     * USE THIS METHOD TO ENTER EMAIL AND PIN IN THE IIQ SAMPLE FORM
     */
    public void aParticipantEntersUsernameUndPinSample(String email, String pin) {
        WebDriverUtils.webDriver.get(CHARMS_Data_File_Path_Constants.IIQ_SAMPLE_FORM);
        CucumberLogUtils.logScreenshot();
        CommonUtils.waitForVisibility(rasopathyQuestionnairePage.dynamicTextBoxLocator("Email"));
        rasopathyQuestionnairePage.dynamicTextBoxLocator("Email").sendKeys(email);
        rasopathyQuestionnairePage.pinTextBox.sendKeys(pin);
        CucumberLogUtils.logScreenshot();
        CommonUtils.sleep(3000);
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.sleep(3000);
        CucumberLogUtils.logScreenshot();
    }

    /***
     * USE THIS METHOD TO REWIND THE SURVEY FORM
     */
    public void theParticipantWillBeAbleToRewindTheForm() {
        CommonUtils.sleep(2000);
        while (rasopathyQuestionnairePage.rasSurveyPreviousButton.isDisplayed()) {
            ras_screenerSubmissions_stepsImpl.clickOnSurveyPreviousButton();
        }
    }

    /***
     * USE THIS METHOD FOR NATIVE VIEW CONSENT FLOW PROCESS SCENARIO 1
     */
    public void nativeViewConsentFlowProcessScenario1(String sheetName) {
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        CommonUtils.sleep(2000);
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
        } else if (sheetName.contentEquals("fanconiScreenerScenario")) {
            ras_Screener_TestDataManager.dataInitializerRasScreener(sheetName);
            CommonUtils.hoverOverElement(nativeViewCHARMSParticipantDetailsPage.dynamicRecordButtonLocator(ras_Screener_TestDataManager.FIRST_NAME + " " + ras_Screener_TestDataManager.MIDDLE_INITIAL + " " + ras_Screener_TestDataManager.LAST_NAME));
            CucumberLogUtils.logScreenshot();
            CommonUtils.clickOnElement(NativeViewCHARMSDashboardPage.nativeViewnewScreenerReceivedLocator(ras_Screener_TestDataManager.FIRST_NAME + " " + ras_Screener_TestDataManager.MIDDLE_INITIAL + " " + ras_Screener_TestDataManager.LAST_NAME));
        } else if (sheetName.contentEquals("screenerScenarioAdult")) {
            ras_Screener_TestDataManager.dataInitializerRasScreener(sheetName);
            CommonUtils.hoverOverElement(nativeViewCHARMSParticipantDetailsPage.dynamicRecordButtonLocator(ras_Screener_TestDataManager.FIRST_NAME + " " + ras_Screener_TestDataManager.MIDDLE_INITIAL + " " + ras_Screener_TestDataManager.LAST_NAME));
            CucumberLogUtils.logScreenshot();
            CommonUtils.clickOnElement(NativeViewCHARMSDashboardPage.nativeViewnewScreenerReceivedLocator(ras_Screener_TestDataManager.FIRST_NAME + " " + ras_Screener_TestDataManager.MIDDLE_INITIAL + " " + ras_Screener_TestDataManager.LAST_NAME));
        }
        CommonUtils.sleep(1000);
        if (CommonUtils.isElementDisplayed(nativeViewCHARMSDashboardPage.rasStudyOpenRecordButton)) {
            CucumberLogUtils.logScreenshot();
            CommonUtils.clickOnElement(nativeViewCHARMSDashboardPage.rasStudyOpenRecordButton);
        }
        CommonUtils.sleep(800);
        softAssert.assertEquals(nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsSubjectID.getText().split("-")[0], nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsFamilyID.getText());
        JavascriptUtils.scrollIntoView(nativeViewCHARMSParticipantDetailsPage.participantStudiesTab);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantDetailsPage.participantStudiesTab);
        CommonUtils.sleep(500);
        JavascriptUtils.clickByJS(nativeViewCHARMSParticipantDetailsPage.participantStudiesPreviewButton);
        CommonUtils.waitForClickability(nativeViewCHARMSDashboardPage.rasStudyOpenRecordButton);
        CommonUtils.clickOnElement(nativeViewCHARMSDashboardPage.rasStudyOpenRecordButton);
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
        softAssert.assertEquals(nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsConsentAddedText.getText(), CHARMSRASScreenerConstants.CONSENT_ADDED_TEXT, "---- VERIFYING CONSENT WAS ADDED  ----");
        /**
         * BEGINNING: CONSENT FLOW PROCESS
         */
        JavascriptUtils.scrollIntoView(nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsConsentsTab);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsConsentsTab);
        JavascriptUtils.clickByJS(nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsConsentsPreviewButton);
        CommonUtils.waitForVisibility(nativeViewCHARMSDashboardPage.rasStudyOpenRecordButton);
        CommonUtils.sleep(500);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(nativeViewCHARMSDashboardPage.rasStudyOpenRecordButton);
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeCalendar);
        CucumberLogUtils.logScreenshot();
        dynamicTabLocator("Consent Call").click();
        CucumberLogUtils.scenario.log("* * * * CONSENT CALL SCHEDULED TIME * * * *");
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeCalendar);
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeTodayButton);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeTodayButton);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeAcceptButton);
        CucumberLogUtils.scenario.log("* * * * CONSENT CALL DATE * * * *");
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleDateCalendar);
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeTodayButton);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeTodayButton);
        dynamicTabLocator("Consent Information").click();
        CucumberLogUtils.scenario.log("* * * * RESPONSE TYPE * * * *");
        CommonUtils.selectDropDownValue("Participant upload to portal", nativeViewCHARMSParticipantConsentPage.rasStudyConsentCollectionMethodDropDown);
        CucumberLogUtils.scenario.log("* * * * CONSENT CALL VERSION * * * *");
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleVersionCalendarButton);
        CommonUtils.waitForClickability(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleVersionCalendarButton);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleVersionCalendarButton);
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeTodayButton);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeTodayButton);
        CucumberLogUtils.scenario.log("* * * * CONSENT DATE * * * *");
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentDateCalendar);
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeTodayButton);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeTodayButton);
        CucumberLogUtils.scenario.log("* * * * CONSENTED BY * * * *");
        CommonUtils.sendKeys(nativeViewCHARMSParticipantConsentPage.rasStudyConsentByTextBox, Keys.CLEAR);
        CommonUtils.sendKeys(nativeViewCHARMSParticipantConsentPage.rasStudyConsentByTextBox, CHARMSRASScreenerConstants.CONSENTED_BY_USER_NAME);
        CommonUtils.sendKeys(nativeViewCHARMSParticipantConsentPage.rasStudyConsentByTextBox, Keys.ENTER);
        CucumberLogUtils.scenario.log("* * * * CURRENT/PREVIOUS * * * *");
        CommonUtils.selectDropDownValue("Current", nativeViewCHARMSParticipantConsentPage.rasStudyConsentCurrentDropDown);
        dynamicTabLocator("Consent Signed").click();
        CommonUtils.selectDropDownValue(nativeViewCHARMSParticipantConsentPage.rasStudyConsentFutureSpecimensAndDataDropDown, 4);
        CommonUtils.selectDropDownValue(nativeViewCHARMSParticipantConsentPage.rasStudyConsentFutureUseCollaboratorsDropDown, 4);
        CommonUtils.selectDropDownValue(nativeViewCHARMSParticipantConsentPage.rasStudyConsentFutureIdentifiableUseCollaboratorsDropDown, 4);
        CommonUtils.sleep(500);
        CucumberLogUtils.logScreenshot();
        dynamicTabLocator("Consent Call").click();
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
        CucumberLogUtils.scenario.log("* * * * * CALL COMPLETE * * * * *");
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallCompleteButton);
        CommonUtils.sleep(1000);
        CucumberLogUtils.scenario.log("* * * * CONSENT/ASSENT OBTAINED BEFORE STUDY PROCEDURES * * * *");
        CommonUtils.selectDropDownValue("Yes", nativeViewCHARMSParticipantConsentPage.rasStudyConsentConsentAssentObtainedBeforeStudyProceduresDropDown);
        CucumberLogUtils.scenario.log("* * * * COPY OF SIGNED/DATED CONSENT/ASSENT GIVEN TO PARTICIPANT * * * *");
        CommonUtils.selectDropDownValue("Yes", nativeViewCHARMSParticipantConsentPage.rasStudyConsentCopyOfSignedDatedConsentAssentGivenToParticipantDropDown);
        CucumberLogUtils.logScreenshot();
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
        FSID = nativeViewCHARMSParticipantConsentPage.rasStudyConsentParticipantInfoTextBox.getDomAttribute("value");
        ServiceNow_Common_Methods.logOutOfNativeView();
    }

    /***
     * USE THIS METHOD WILL COMPLETE THE IIQ FORM SCENARIO 1
     */
    public void rasScreenerIIQFormScenario1() {
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(14));
        softAssert.assertEquals(iiq_TestDataManager.thisIsACopyForLowerEnvironmentsText, myRASSurveyPage.dynamicTopText(14).getText(), "-- VERIFYING THIS IS THE COPY FOR LOWER ENVIRONMENTS TEXT --");
        ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(16));
        softAssert.assertEquals(iiq_TestDataManager.someOfThisInformationText, myRASSurveyPage.dynamicTopText(16).getText(), "-- VERIFYING SOME OF THIS INFORMATION TEXT --");
        ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
        softAssert.assertEquals(iiq_TestDataManager.thisQuestionnaireShouldTakeYouApproximately30MinutesText, myRASSurveyPage.dynamicTopText(187).getText(), "-- THIS QUESTIONNAIRE SHOULD TAKE APPROXIMATELY 30 MINUTES TO COMPLETE TEXT --");
        ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(35));
        softAssert.assertEquals(iiq_TestDataManager.thisFirstSectionOfTheQuestionnaireText, myRASSurveyPage.dynamicTopText(35).getText(), "-- VERIFYING THIS FIRST QUESTION OF THE QUESTIONNAIRE TEXT --");
        ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
        try {
            dynamicLocator(iiq_TestDataManager.areYouCompletingThisFormForYourselfRadioButton).click();
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
            dynamicLocator(iiq_TestDataManager.areYouCompletingThisFormForYourselfRadioButton).click();
            CucumberLogUtils.logScreenshot();
        }
        ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
        try {
            dynamicLocator(iiq_TestDataManager.whatIsYourBiologicalSexRadioButton).click();
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
            dynamicLocator(iiq_TestDataManager.whatIsYourBiologicalSexRadioButton).click();
            CucumberLogUtils.logScreenshot();
        }
        ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
        try {
            CommonUtils.waitForClickability(myRASIIQFormPage.screenerIiqFormForWhichSexYouIdentifyRadioButton);
            myRASIIQFormPage.screenerIiqFormForWhichSexYouIdentifyRadioButton.click();
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
            myRASIIQFormPage.screenerIiqFormForWhichSexYouIdentifyRadioButton.click();
            CucumberLogUtils.logScreenshot();
        }
        ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
        try {
            CommonUtils.waitForClickability(dynamicLocator(iiq_TestDataManager.doYouConsiderYourselfToBeRadioButton));
            JavascriptUtils.clickByJS(dynamicLocator(iiq_TestDataManager.doYouConsiderYourselfToBeRadioButton));
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
            JavascriptUtils.clickByJS(dynamicLocator(iiq_TestDataManager.doYouConsiderYourselfToBeRadioButton));
            CucumberLogUtils.logScreenshot();
        }
        ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
        try {
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(19));
            CommonUtils.waitForClickability(dynamicLocator(iiq_TestDataManager.whatIsYourRaceCheckBox));
            JavascriptUtils.clickByJS(dynamicLocator(iiq_TestDataManager.whatIsYourRaceCheckBox));
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
            JavascriptUtils.clickByJS(dynamicLocator(iiq_TestDataManager.whatIsYourRaceCheckBox));
            CucumberLogUtils.logScreenshot();
        }
        ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(93));
        JavascriptUtils.clickByJS(dynamicLocator(iiq_TestDataManager.areYouOfAshkenazyJewishDescentRadioButton));
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
        try {
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(20));
            CommonUtils.sleep(1000);
            CommonUtils.clickOnElement(dynamicLocator(iiq_TestDataManager.areYouAdoptedRadioButton));
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
            CommonUtils.clickOnElement(dynamicLocator(iiq_TestDataManager.areYouAdoptedRadioButton));
            CucumberLogUtils.logScreenshot();
        }
        ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(21));
        CommonUtils.sleep(1000);
        CommonUtils.clickOnElement(rasopathyQuestionnairePage.iiqWereYouRaisedNoOption);
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
        if (!rasopathyQuestionnairePage.calendarYearTextBox.isDisplayed()) {
            CommonUtils.clickOnElement(rasopathyQuestionnairePage.iiqWereYouRaisedNoOption);
            ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
        } else {
            try {
                rasopathyQuestionnairePage.probandDateOfBirthTextBox.sendKeys(iiq_TestDataManager.whatIsYourDateOfBirthCalendar);
                CucumberLogUtils.logScreenshot();
            } catch (NoSuchElementException e) {
            }
        }
        ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
        try {
            rasopathyQuestionnairePage.calendarYearTextBox.clear();
            rasopathyQuestionnairePage.calendarYearTextBox.sendKeys(iiq_TestDataManager.whatIsYourDateOfBirthYearDropDown);
            CommonUtils.selectDropDownValue(iiq_TestDataManager.whatIsYourDateOfBirthMonthDropDown, rasopathyQuestionnairePage.calendarMonthDropDown);
            rasopathyQuestionnairePage.iIQcalendarDayOption.click();
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.calendarYearTextBox.clear();
            rasopathyQuestionnairePage.calendarYearTextBox.sendKeys(iiq_TestDataManager.whatIsYourDateOfBirthYearDropDown);
            CommonUtils.selectDropDownValue(iiq_TestDataManager.whatIsYourDateOfBirthMonthDropDown, rasopathyQuestionnairePage.calendarMonthDropDown);
            rasopathyQuestionnairePage.iIQcalendarDayOption.click();
            CucumberLogUtils.logScreenshot();
        }
        ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
        try {
            rasopathyQuestionnairePage.dynamicTextBoxLocator(iiq_Constants.WHERE_WERE_YOU_BORN_CITY_TEXT_BOX_QUESTION).sendKeys(iiq_TestDataManager.whereWereYouBornCityTextBox);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(iiq_Constants.WHERE_WERE_YOU_BORN_STATE_TEXT_BOX_QUESTION).sendKeys(iiq_TestDataManager.whereWereYouBornStateTextBox);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(iiq_Constants.WHERE_WERE_YOU_BORN_COUNTRY_TEXT_BOX_QUESTION).sendKeys(iiq_TestDataManager.whereWereYouBornCountryTextBox);
            rasopathyQuestionnairePage.iIQAddressDontKnowTextBox.sendKeys(iiq_TestDataManager.whereWereYouBornDontKnowTextBox);
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicTextBoxLocator(iiq_Constants.WHERE_WERE_YOU_BORN_CITY_TEXT_BOX_QUESTION).sendKeys(iiq_TestDataManager.whereWereYouBornCityTextBox);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(iiq_Constants.WHERE_WERE_YOU_BORN_STATE_TEXT_BOX_QUESTION).sendKeys(iiq_TestDataManager.whereWereYouBornStateTextBox);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(iiq_Constants.WHERE_WERE_YOU_BORN_COUNTRY_TEXT_BOX_QUESTION).sendKeys(iiq_TestDataManager.whereWereYouBornCountryTextBox);
            rasopathyQuestionnairePage.iIQAddressDontKnowTextBox.sendKeys(iiq_TestDataManager.whereWereYouBornDontKnowTextBox);
            CucumberLogUtils.logScreenshot();
        }
        ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(27));
        CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicClickOnCheckboxesIiqTable(1, 2));
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(28));
        CommonUtils.sleep(2000);
        CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicClickOnCheckboxesIiqTable(1, 4));
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
        try {
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(29));
            CommonUtils.sleep(500);
            JavascriptUtils.clickByJS(dynamicLocator(iiq_TestDataManager.whatIsYourFammilysReligiousBackgroundCheckBox));
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
            JavascriptUtils.clickByJS(dynamicLocator(iiq_TestDataManager.whatIsYourFammilysReligiousBackgroundCheckBox));
            CucumberLogUtils.logScreenshot();
        }
        ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
        try {
            CommonUtils.waitForClickability(dynamicLocator(iiq_TestDataManager.whatIsYourMaritalStatusCheckBox));
            JavascriptUtils.clickByJS(dynamicLocator(iiq_TestDataManager.whatIsYourMaritalStatusCheckBox));
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
            JavascriptUtils.clickByJS(dynamicLocator(iiq_TestDataManager.whatIsYourMaritalStatusCheckBox));
            CucumberLogUtils.logScreenshot();
        }
        ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
        try {
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(31));
            CommonUtils.sleep(1000);
            JavascriptUtils.clickByJS(dynamicLocator(iiq_TestDataManager.whatIsYourMainOccupationRadioButton));
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
            JavascriptUtils.clickByJS(dynamicLocator(iiq_TestDataManager.whatIsYourMainOccupationRadioButton));
            CucumberLogUtils.logScreenshot();
        }
        ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
        try {
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(95));
            JavascriptUtils.clickByJS(dynamicLocator(iiq_TestDataManager.doYouCurrentlyHaveHealthInsuranceRadioButton));
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
            JavascriptUtils.clickByJS(dynamicLocator(iiq_TestDataManager.doYouCurrentlyHaveHealthInsuranceRadioButton));
            CucumberLogUtils.logScreenshot();
        }
        ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
        try {
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(33));
            JavascriptUtils.clickByJS(dynamicLocator(iiq_TestDataManager.whatIsTheTotalCombinedYearlyIncomeRadioButton));
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
            JavascriptUtils.clickByJS(dynamicLocator(iiq_TestDataManager.whatIsTheTotalCombinedYearlyIncomeRadioButton));
            CucumberLogUtils.logScreenshot();
        }
        ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
        try {
            CommonUtils.waitForClickability(dynamicLocator(iiq_TestDataManager.whatIsTheHighestLevelOfSchoolingRadioButton));
            JavascriptUtils.clickByJS(dynamicLocator(iiq_TestDataManager.whatIsTheHighestLevelOfSchoolingRadioButton));
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
            JavascriptUtils.clickByJS(dynamicLocator(iiq_TestDataManager.whatIsTheHighestLevelOfSchoolingRadioButton));
            CucumberLogUtils.logScreenshot();
        }
        ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
        CommonUtils.waitForVisibility(myRASIIQFormPage.screenerIiqFormThisSectionAsksDetailedMedicalHistoryText);
        softAssert.assertEquals(iiq_Constants.THIS_SECTION_ASKS_YOU_TEXT, myRASIIQFormPage.screenerIiqFormThisSectionAsksDetailedMedicalHistoryText.getText(), "-- VERIFYING THIS SECTION ASKS DETAILED MEDICAL HISTORY TEXT --");
        ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
        try {
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(47));
            JavascriptUtils.clickByJS(dynamicLocator(iiq_TestDataManager.wereYouConceivedUsingVitroRadioButton));
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
            JavascriptUtils.clickByJS(dynamicLocator(iiq_TestDataManager.wereYouConceivedUsingVitroRadioButton));
            CucumberLogUtils.logScreenshot();
        }
        ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(37));
        CommonUtils.sleep(1000);
        CommonUtils.clickOnElement(dynamicLocator(iiq_TestDataManager.wereYouATwinRadioButton));
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
        if (!myRASSurveyPage.dynamicTopText(41).isDisplayed()) {
            CommonUtils.clickOnElement(dynamicLocator(iiq_TestDataManager.wereYouATwinRadioButton));
            CucumberLogUtils.logScreenshot();
            ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
        }

        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(41));
        CommonUtils.sleep(1000);
        CommonUtils.clickOnElement(dynamicLocator(iiq_TestDataManager.areYourBiologicalParentsBloodRelatedRadioButton));
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
        if (!myRASSurveyPage.dynamicTopText(43).isDisplayed()) {
            CommonUtils.clickOnElement(dynamicLocator(iiq_TestDataManager.areYourBiologicalParentsBloodRelatedRadioButton));
            CucumberLogUtils.logScreenshot();
            ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
        }
        try {
            CommonUtils.waitForClickability(dynamicLocator(iiq_TestDataManager.wouldYouSayYouWereBornRadioButton));
            JavascriptUtils.clickByJS(dynamicLocator(iiq_TestDataManager.wouldYouSayYouWereBornRadioButton));
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
            JavascriptUtils.clickByJS(dynamicLocator(iiq_TestDataManager.wouldYouSayYouWereBornRadioButton));
            CucumberLogUtils.logScreenshot();
        }
        ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
        CommonUtils.waitForVisibility(myRASIIQFormPage.screenerIiqFormFillOutBirthWeight);
        CommonUtils.sendKeysToElement(myRASIIQFormPage.screenerIiqFormFillOutBirthWeight, iiq_TestDataManager.pleaseFillOutBirtWeightNumericTextBox);
        CommonUtils.sleep(3000);
        CommonUtils.selectDropDownValue(iiq_TestDataManager.pleaseFillOutBirtWeightUnitDropDown, myRASIIQFormPage.screenerIiqFormFillOutBirthWeightUnitDropDown);
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
        CommonUtils.waitForVisibility(myRASIIQFormPage.screenerIiqFormFillOutBirthLenghtHeadNumeticTextBox);
        CommonUtils.sendKeysToElement(myRASIIQFormPage.screenerIiqFormFillOutBirthLenghtHeadNumeticTextBox, iiq_TestDataManager.pleaseFillOutHeadNumericTextBox);
        CommonUtils.sendKeysToElement(myRASIIQFormPage.screenerIiqFormFillOutBirthLenghtHeadCircumferenceNumeticTextBox, iiq_TestDataManager.pleaseFillOutHeadCircumferenceNumericTextBox);
        CommonUtils.sleep(3000);
        CommonUtils.selectDropDownValue(iiq_TestDataManager.pleaseFillOutHeadUnitDropDown, myRASIIQFormPage.screenerIiqFormFillOutBirthLenghtHeadUnitDropDown);
        CommonUtils.selectDropDownValue(iiq_TestDataManager.pleaseFillOutHeadCircumferenceUnitDropDown, myRASIIQFormPage.screenerIiqFormFillOutBirthLenghtHeadCircumferenceUnitDropDown);
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
        CommonUtils.waitForVisibility(myRASIIQFormPage.screenerIiqFormThisSectionWillAskAboutCancerText);
        softAssert.assertEquals(iiq_Constants.THIS_SECTION_WILL_ASK_ABOUT_CANCER_TEXT, myRASIIQFormPage.screenerIiqFormThisSectionWillAskAboutCancerText.getText(), "-- VERIFYING THIS SECTION WILL ASK ABOUT CANCER TEXT --");
        ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
        try {
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(62));
            JavascriptUtils.clickByJS(dynamicLocator(iiq_TestDataManager.haveYouEverBeenDiagnosedWithAnyCancerRadioButton));
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
            JavascriptUtils.clickByJS(dynamicLocator(iiq_TestDataManager.haveYouEverBeenDiagnosedWithAnyCancerRadioButton));
            CucumberLogUtils.logScreenshot();
        }
        ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(67));
        CommonUtils.sleep(1000);
        CommonUtils.clickOnElement(dynamicLocator(iiq_TestDataManager.haveYouEverHadMedicalGeneticTestingRadioButton));
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
        if (!myRASIIQFormPage.screenerIiqFormFillOutCurrentHeightTextBox.isDisplayed()) {
            CommonUtils.clickOnElement(dynamicLocator(iiq_TestDataManager.haveYouEverHadMedicalGeneticTestingRadioButton));
            CucumberLogUtils.logScreenshot();
            ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
        }
        CommonUtils.waitForVisibility(myRASIIQFormPage.screenerIiqFormFillOutCurrentHeightTextBox);
        CommonUtils.sendKeysToElement(myRASIIQFormPage.screenerIiqFormFillOutCurrentHeightTextBox, iiq_TestDataManager.pleaseFillTheTableBelowWithHeightNumericTextBox);
        CommonUtils.sleep(2000);
        CommonUtils.selectDropDownValue(iiq_TestDataManager.pleaseFillTheTableBelowWithHeightUnitDropDown, myRASIIQFormPage.screenerIiqFormFillOutCurrentHeightUnitDropDown);
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
        CommonUtils.sleep(3000);
        CommonUtils.waitForVisibility(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3));
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3), iiq_TestDataManager.pleaseCompleteTheTableBelowIndicatingYourWeightColumn1Option1);
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 3), iiq_TestDataManager.pleaseCompleteTheTableBelowIndicatingYourWeightColumn1Option2);
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 3), iiq_TestDataManager.pleaseCompleteTheTableBelowIndicatingYourWeightColumn1Option3);
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 3), iiq_TestDataManager.pleaseCompleteTheTableBelowIndicatingYourWeightColumn1Option4);
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(5, 3), iiq_TestDataManager.pleaseCompleteTheTableBelowIndicatingYourWeightColumn1Option5);
        CommonUtils.selectDropDownValue(iiq_TestDataManager.pleaseCompleteTheTableBelowIndicatingYourWeightColumn2Option1, myRASSurveyPage.dynamicDropDownTwo(1, 6));
        CommonUtils.selectDropDownValue(iiq_TestDataManager.pleaseCompleteTheTableBelowIndicatingYourWeightColumn2Option2, myRASSurveyPage.dynamicDropDownTwo(2, 6));
        CommonUtils.selectDropDownValue(iiq_TestDataManager.pleaseCompleteTheTableBelowIndicatingYourWeightColumn2Option3, myRASSurveyPage.dynamicDropDownTwo(3, 6));
        CommonUtils.selectDropDownValue(iiq_TestDataManager.pleaseCompleteTheTableBelowIndicatingYourWeightColumn2Option4, myRASSurveyPage.dynamicDropDownTwo(4, 6));
        CommonUtils.selectDropDownValue(iiq_TestDataManager.pleaseCompleteTheTableBelowIndicatingYourWeightColumn2Option5, myRASSurveyPage.dynamicDropDownTwo(5, 6));
        CommonUtils.clickOnElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(1, 9));
        CommonUtils.clickOnElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(2, 9));
        CommonUtils.clickOnElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(3, 9));
        CommonUtils.clickOnElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(4, 9));
        CommonUtils.clickOnElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(5, 9));
        CommonUtils.clickOnElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(1, 12));
        CommonUtils.clickOnElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(2, 12));
        CommonUtils.clickOnElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(3, 12));
        CommonUtils.clickOnElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(4, 12));
        CommonUtils.clickOnElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(5, 12));
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(78));
        CommonUtils.sendKeysToElement(myRASSurveyPage.dynamicOneTextBox(78), iiq_TestDataManager.atWhatAgeWereYouAtTheHighestWeightTextBox);
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
        try {
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(154));
            JavascriptUtils.clickByJS(dynamicLocator(iiq_TestDataManager.haveYouSoughtMedicalAdviceRegardingFertilityRadioButton));
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
            JavascriptUtils.clickByJS(dynamicLocator(iiq_TestDataManager.haveYouSoughtMedicalAdviceRegardingFertilityRadioButton));
            CucumberLogUtils.logScreenshot();
        }
        ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
        CommonUtils.waitForVisibility(myRASIIQFormPage.screenerIiqFormYouAreAlmostDoneText);
        softAssert.assertEquals(iiq_Constants.YOU_ARE_ALMOST_DONE_TEXT, myRASIIQFormPage.screenerIiqFormYouAreAlmostDoneText.getText(), "-- VERIFYING YOU ARE ALMOST DONE TEXT --");
        CucumberLogUtils.logScreenshot();
        CommonUtils.sleep(3000);
        ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
        CommonUtils.sleep(1000);
        CucumberLogUtils.logScreenshot();
        ServiceNow_Common_Methods.logOutOfNativeView();
    }

    /***
     * USE THIS METHOD WILL COMPLETE THE RAS SURVEY SCENARIO 1
     */
    public void rasScreenerSurveyScenario1PartOne() {
        CommonUtils.waitForVisibility(myRASSurveyPage.rasSurveyThankYouForStartingText);
        softAssert.assertEquals(ras_Survey_TestDataManager.thankYouForStartingTheRASSurveyAndFor, myRASSurveyPage.rasSurveyText.getText(), "-- VERIFYING THANK YOU FOR STARTING THE RAS SURVEY AND FOR YOUR TEXT --");
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.rasSurveyThisQuestionMayTakeText);
        softAssert.assertEquals(ras_Survey_TestDataManager.thisQuestionnaireMayTakeYouSeveral, myRASSurveyPage.rasSurveyText.getText(), "-- VERIFYING THIS QUESTIONNAIRE MAY TAKE YOU SEVERAL HOURS TO COMPLETE TEXT --");
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.rasSurveyTheFirstBlockText);
        softAssert.assertEquals(ras_Survey_TestDataManager.thisQuestionnaireMayTakeYouSeveral, myRASSurveyPage.rasSurveyText.getText(), "-- VERIFYING THE FIRST BLOCK OF QUESTIONS WILL COLLECT TEXT --");
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(1));
        JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.toConfirmAreYouCompleting));
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(58));
        JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.haveYouEverBeenIncluded));
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.rasSurveyTheNextSetOfQuestionsWillAskAboutBirthAndNeonatalText);
        softAssert.assertEquals(ras_Survey_TestDataManager.theNextSetOfQuestionsWillAskAboutNeonatalHistory, myRASSurveyPage.rasSurveyText.getText(), "-- VERIFYING THE NEXT SET OF QUESTIONS WILL ASK ABOUT BIRTH AND NEONATAL  TEXT --");
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.pleaseCompleteYourBiologicalParentsBiologicalMotherCityTextBox);
        int momAgeDropdownIndex = Integer.valueOf(ras_Survey_TestDataManager.pleaseCompleteYourBiologicalParentsBiologicalMotherAge) - 11;
        int fatherDropDownIndex = Integer.valueOf(ras_Survey_TestDataManager.pleaseCompleteYourBiologicalParentsBiologicalFatherAge) - 11;
        CommonUtils.sendKeysToElement(myRASSurveyPage.pleaseCompleteYourBiologicalParentsBiologicalMotherCityTextBox, ras_Survey_TestDataManager.pleaseCompleteYourBiologicalParentsBiologicalMotherCity);
        CommonUtils.clickOnElement(myRASSurveyPage.pleaseCompleteYourBiologicalParentsBiologicalMotherUnsureRadioButton);
        CommonUtils.selectDropDownValue(myRASSurveyPage.pleaseCompleteYourBiologicalParentsBiologicalMotherYearsDropDown, momAgeDropdownIndex);
        CommonUtils.sendKeysToElement(myRASSurveyPage.pleaseCompleteYourBiologicalParentsBiologicalFatherCityTextBox, ras_Survey_TestDataManager.pleaseCompleteYourBiologicalParentsBiologicalFatherCity);
        CommonUtils.clickOnElement(myRASSurveyPage.pleaseCompleteYourBiologicalParentsBiologicalFatherUnsureRadioButton);
        CommonUtils.selectDropDownValue(myRASSurveyPage.pleaseCompleteYourBiologicalParentsBiologicalFatherYearsDropDown, fatherDropDownIndex);
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForClickability(dynamicLocator(ras_Survey_TestDataManager.wereYouDiagnosedWithHypoglycemia));
            JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.wereYouDiagnosedWithHypoglycemia));
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.wereYouDiagnosedWithHypoglycemia));
            CucumberLogUtils.logScreenshot();
        }
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(rasopathyQuestionnairePage.dynamicClickOnCheckboxesScreener(9));
        CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicClickOnCheckboxesScreener(9));
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForClickability(dynamicLocator(ras_Survey_TestDataManager.duringHerPregnancyWithYou));
            JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.duringHerPregnancyWithYou));
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.duringHerPregnancyWithYou));
            CucumberLogUtils.logScreenshot();
        }
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(rasopathyQuestionnairePage.dynamicClickOnCheckboxesScreener(12));
        CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicClickOnCheckboxesScreener(12));
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForClickability(dynamicLocator(ras_Survey_TestDataManager.duringHerPregnancyWithYouSupplements));
            JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.duringHerPregnancyWithYouSupplements));
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.duringHerPregnancyWithYouSupplements));
            CucumberLogUtils.logScreenshot();
        }
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(63));
            JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.didYourBiologicalMotherUseAnyTobacco));
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.didYourBiologicalMotherUseAnyTobacco));
            CucumberLogUtils.logScreenshot();
        }
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(65));
        JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.didYourBiologicalMotherUseAnyVaping));
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(67));
            JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.didYourBiologicalMotherDrink));
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.didYourBiologicalMotherDrink));
            CucumberLogUtils.logScreenshot();
        }
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(69));
        JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.didYourBiologicalMotherUseAnyRecreationalDrugs));
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(71));
            JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.didYourBiologicalMotherEverLiveWhereSmokedCigarettes));
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.didYourBiologicalMotherEverLiveWhereSmokedCigarettes));
            CucumberLogUtils.logScreenshot();
        }
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3));
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3), ras_Survey_TestDataManager.biologicalMotherOccupationDuringPregnancy);
        JavascriptUtils.clickByJS(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(1, 6));
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 3), ras_Survey_TestDataManager.biologicalMotherOccupationDuringPregnancyFather);
        JavascriptUtils.clickByJS(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(2, 6));
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.whatIsTheHeightOfYourBiologicalMotherAndFatherText);
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3), ras_Survey_TestDataManager.whatIsTheHeightOfYourBiologicalMother);
        JavascriptUtils.clickByJS(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(1, 6));
        JavascriptUtils.clickByJS(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(1, 10));
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 3), ras_Survey_TestDataManager.whatIsTheHeightOfYourBiologicalFather);
        JavascriptUtils.clickByJS(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(2, 6));
        JavascriptUtils.clickByJS(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(2, 10));
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.rasSurveyTheNextSetOfQuestionsWillAskAboutHormoneRelatedGrowthText);
        softAssert.assertEquals(ras_Survey_TestDataManager.theNextSetHormoneRelatedGrowth, myRASSurveyPage.rasSurveyText.getText(), "-- VERIFYING THE NEXT SET OF QUESTIONS WILL ASK ABOUT HORMONE RELATED GROWTH TEXT --");
        CucumberLogUtils.logScreenshot();
    }

    /**
     * Executes the second part of the RAS Screener Survey Scenario 1.
     * This method clicks on various options in the survey and logs screenshots.
     *
     * @throws NoSuchElementException if any element specified by the dynamic locators is not found
     */
    public void rasScreenerSurveyScenario1PartTwo() {
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForClickability(dynamicLocator(ras_Survey_TestDataManager.haveYouEverBeenEvaluatedByAnEndocrinologist));
            JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.haveYouEverBeenEvaluatedByAnEndocrinologist));
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.haveYouEverBeenEvaluatedByAnEndocrinologist));
            CucumberLogUtils.logScreenshot();
        }
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(76));
            JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.haveYouEverHadGrowthHormoneTesting));
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.haveYouEverHadGrowthHormoneTesting));
            CucumberLogUtils.logScreenshot();
        }
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(78));
            CommonUtils.waitForClickability(dynamicLocator(ras_Survey_TestDataManager.haveYouEverReceivedGrowthHormoneTreatment));
            JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.haveYouEverReceivedGrowthHormoneTreatment));
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.haveYouEverReceivedGrowthHormoneTreatment));
            CucumberLogUtils.logScreenshot();
        }
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.theNextSetOfQuestionsWillAskAboutDevelopmentText);
        softAssert.assertEquals(ras_Survey_TestDataManager.theNextSetOfQuestionsWillAskAboutDevelopment, myRASSurveyPage.rasSurveyText.getText(), "-- VERIFYING THE NEXT SET OF QUESTIONS WILL ASK ABOUT DEVELOPMENT TEXT --");
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForClickability(dynamicLocator(ras_Survey_TestDataManager.wereYouEverDiagnosedWithHypotoniaAsAnInfantOrChild));
            JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.wereYouEverDiagnosedWithHypotoniaAsAnInfantOrChild));
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.wereYouEverDiagnosedWithHypotoniaAsAnInfantOrChild));
            CucumberLogUtils.logScreenshot();
        }
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForClickability(dynamicLocator(ras_Survey_TestDataManager.atWhatAgeWereYouAbleToSitWithoutSupport));
            JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.atWhatAgeWereYouAbleToSitWithoutSupport));
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.atWhatAgeWereYouAbleToSitWithoutSupport));
            CucumberLogUtils.logScreenshot();
        }
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(84));
        JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.atWhatAgeWereYouAbleToWalkWithoutSupport));
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForClickability(dynamicLocator(ras_Survey_TestDataManager.haveYouEverReceivedPhysicalTherapy));
            JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.haveYouEverReceivedPhysicalTherapy));
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.haveYouEverReceivedPhysicalTherapy));
            CucumberLogUtils.logScreenshot();
        }
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForClickability(dynamicLocator(ras_Survey_TestDataManager.atWhatAgeWereYouAbleToUseSimpleTwoWordPhrases));
            JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.atWhatAgeWereYouAbleToUseSimpleTwoWordPhrases));
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.atWhatAgeWereYouAbleToUseSimpleTwoWordPhrases));
            CucumberLogUtils.logScreenshot();
        }
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(88));
            JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.howWouldYouDescribeYourCurrentSpeechCapabilities));
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.howWouldYouDescribeYourCurrentSpeechCapabilities));
            CucumberLogUtils.logScreenshot();
        }
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForClickability(dynamicLocator(ras_Survey_TestDataManager.haveYouEverReceivedSpeechTherapy));
            JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.haveYouEverReceivedSpeechTherapy));
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.haveYouEverReceivedSpeechTherapy));
            CucumberLogUtils.logScreenshot();
        }
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(90));
            JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.betweenTheAgesOf3And6YearsOld));
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.betweenTheAgesOf3And6YearsOld));
            CucumberLogUtils.logScreenshot();
        }
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForClickability(dynamicLocator(ras_Survey_TestDataManager.didYouReceiveOccupationalTherapyBetween3And6YearsOfAge));
            JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.didYouReceiveOccupationalTherapyBetween3And6YearsOfAge));
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.didYouReceiveOccupationalTherapyBetween3And6YearsOfAge));
            CucumberLogUtils.logScreenshot();
        }
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(92));
            JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.betweenTheAgesOf6And10));
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.betweenTheAgesOf6And10));
            CucumberLogUtils.logScreenshot();
        }
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(93));
            JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.betweenTheAgesOf10And17));
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.betweenTheAgesOf10And17));
            CucumberLogUtils.logScreenshot();
        }
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForClickability(dynamicLocator(ras_Survey_TestDataManager.pleaseIndicateTheHighestDegree));
            JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.pleaseIndicateTheHighestDegree));
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.pleaseIndicateTheHighestDegree));
            CucumberLogUtils.logScreenshot();
        }
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForClickability(dynamicLocator(ras_Survey_TestDataManager.whatIsYourCurrentEmploymentStatus));
            JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.whatIsYourCurrentEmploymentStatus));
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.whatIsYourCurrentEmploymentStatus));
            CucumberLogUtils.logScreenshot();
        }
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.sleep(2000);
        CommonUtils.waitForVisibility(rasopathyQuestionnairePage.dynamicClickOnCheckboxesScreener(5));
        CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicClickOnCheckboxesScreener(5));
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(97));
        CommonUtils.sleep(2000);
    }

    /**
     * Performs the third part of the RAS Screener Survey Scenario 1.
     * This method clicks on various options in the survey, logs screenshots, and verifies text elements.
     *
     * @throws NoSuchElementException if any element specified by the dynamic locators is not found
     */
    public void rasScreenerSurveyScenario1PartThree() {
        //*** ATTACHING FILE CAN'T BE AUTOMATED IN QUATRICS. MANUAL TESTING WAS PERFORMED FOR UPLOADING A FILE *******
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.theNextSetOfQuestionsWillAskAboutHeartText);
        softAssert.assertEquals(ras_Survey_TestDataManager.theNextSetOfQuestionsWillAskAboutHeart, myRASSurveyPage.rasSurveyText.getText(), "-- VERIFYING THE NEXT SET OF QUESTIONS WILL ASK ABOUT HEART TEXT --");
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(372));
        JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.haveYouEverBeenEvaluatedByACardiologist));
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(320));
        JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithAnyStructuralHeartIssues));
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(100));
        CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicClickOnCheckboxesScreener(12));
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForClickability(dynamicLocator(ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithAnyFunctionalHeartIssues));
        CommonUtils.waitForVisibility(myRASSurveyPage.haveYouEverBeenDiagnosedWithAnyFunctionalHeartIssueText);
        JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithAnyFunctionalHeartIssues));
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.theNextTwoQuestionsWillAskAboutRASopathyDiagnosesText);
        softAssert.assertEquals(ras_Survey_TestDataManager.theNextTwoQuestionsWillAskAboutRASopathyDiagnoses, myRASSurveyPage.rasSurveyText.getText(), "-- VERIFYING THE NEXT TWO QUESTIONS WILL ASK ABOUT RASOPATHY DIAGNOSES TEXT --");
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method performs a series of actions to complete the fourth part of the RAS Screener Survey Scenario 1.
     * It clicks on various options in the survey, logs screenshots, and verifies text elements.
     *
     * @throws NoSuchElementException if any element specified by the dynamic locators is not found
     */
    public void rasScreenerSurveyScenario1PartFour() {
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(dynamicLocator(ras_Survey_TestDataManager.haveYouBeenDiagnosedWithARASopathy));
        JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.haveYouBeenDiagnosedWithARASopathy));
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.theNextTwoQuestionsWillAskAboutMedicalHistoryText);
        softAssert.assertEquals(ras_Survey_TestDataManager.theNextSetOfQuestionsWillAskAboutGeneralMedicalHistory, myRASSurveyPage.rasSurveyText.getText(), "-- VERIFYING THE NEXT SET OF QUESTIONS WILL ASK ABOUT GENERAL MEDICAL HISTORY TEXT --");
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(dynamicLocator(ras_Survey_TestDataManager.doYouHaveAPrimaryCareProvider));
        JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.doYouHaveAPrimaryCareProvider));
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForClickability(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(1, 4));
        JavascriptUtils.clickByJS(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(1, 4));
        JavascriptUtils.clickByJS(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(2, 4));
        JavascriptUtils.clickByJS(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(3, 4));
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(108));
        JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.haveYouEverHadAnOperationOrBiopsy));
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(110));
        JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.haveYouEverBeenHospitalizedForAnyReason));
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.theNextTwoQuestionsWillAskAboutGiText);
        softAssert.assertEquals(ras_Survey_TestDataManager.theNextSetOfQuestionsWillAskAboutGi, myRASSurveyPage.rasSurveyText.getText(), "-- VERIFYING THE NEXT SET OF QUESTIONS WILL ASK ABOUT GI TEXT --");
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(dynamicLocator(ras_Survey_TestDataManager.haveYouEverBeenEvaluatedByAGastroenterologist));
        JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.haveYouEverBeenEvaluatedByAGastroenterologist));
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(rasopathyQuestionnairePage.dynamicClickOnCheckboxesScreener(7));
        CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicClickOnCheckboxesScreener(7));
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(dynamicLocator(ras_Survey_TestDataManager.HaveYouEverHadAnyPhysicalSymptoms));
        JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.HaveYouEverHadAnyPhysicalSymptoms));
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method performs the fifth part of the RAS Screener Survey Scenario 1.
     * It clicks on various options in the survey, logs screenshots, and verifies text elements.
     *
     * @throws NoSuchElementException if any element specified by the dynamic locators is not found
     */
    public void rasScreenerSurveyScenario1PartFive() {
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(327));
        CommonUtils.clickOnElement(dynamicLocator(ras_Survey_TestDataManager.areYouToiletTrained));
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.medicationForAbdominalPainDropDownTwo());
        CommonUtils.selectDropDownValue(ras_Survey_TestDataManager.howManyBowelMovementsDoYouHavePerWeek, myRASSurveyPage.medicationForAbdominalPainDropDownTwo());
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.whatIsTheLongestAmountOfTimeThatHasPassedText);
        CommonUtils.selectDropDownValue(ras_Survey_TestDataManager.whatIsTheLongestAmountOfTimeThatHasPassedWithout, myRASSurveyPage.medicationForAbdominalPainDropDownTwo());
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(153));
        CommonUtils.clickOnElement(dynamicLocator(ras_Survey_TestDataManager.ifYouAreNotYetAbleToUseTheToilet));
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(dynamicLocator(ras_Survey_TestDataManager.pleaseUseTheBristolStoolChart));
        JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.pleaseUseTheBristolStoolChart));
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(351));
        JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.haveYouEverHadAProcedureTestOrStudyToEvaluate));
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
    }

    /**
     * This method represents the sixth part of the RAS screener survey scenario 1.
     * It handles the interaction with the survey page elements to answer questions about breathing, lung health, and oral health.
     * <p>
     * The method performs the following actions:
     * 1. Waits for the visibility of the top text element with a specific dynamic locator.
     * 2. Verifies the next set of questions by comparing the expected text with the actual text on the survey page.
     * 3. Logs a screenshot of the survey page.
     * 4. Clicks on the "Save and Next" button.
     * 5. Repeats the above steps for multiple questions about breathing, lung health, and oral health.
     *
     * @throws TimeoutException if the visibility of an element is not achieved within a certain timeout period.
     */
    public void rasScreenerSurveyScenario1PartSix() {
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(305));
        softAssert.assertEquals(ras_Survey_TestDataManager.theNextSetOfQuestionsAskAboutBreathingAndTheLungs, myRASSurveyPage.rasSurveyText.getText(), "-- VERIFYING THE NEXT SET OF QUESTIONS ASK ABOUT BREATHING AND THE LUNGS TEXT --");
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(380));
        JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.haveYouEverHadAnEvaluationByAPulmonologist));
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(162));
        JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.haveYouEverHadWheezingOrWhistling));
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(163));
        JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.haveYouBeenDiagnosedWithReactiveAirwayDisease));
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(164));
        JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.haveYouEverBeenSeenInTheEmergencyRoomForABreathing));
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(165));
        JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.haveYouEverBeenSeenInTheHospitalForABreathing));
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(330));
        softAssert.assertEquals(ras_Survey_TestDataManager.theNextSetOfQuestionsWillAskAboutOralHealthAndDental, myRASSurveyPage.rasSurveyText.getText(), "-- VERIFYING THE NEXT SET OF QUESTIONS WILL ASK ABOUT ORAL HEALTH AND DENTAL HISTORY TEXT --");
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(166));
        JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.doYouReceiveRegularDentalCare));
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(168));
        CommonUtils.sendKeysToElement(myRASSurveyPage.dynamicOneTextBox(168), ras_Survey_TestDataManager.whenDidYouLastVisitADentist);
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(167));
        JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.whatWasTheReasonForYourLastDentalVisitOption));
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(169));
        JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.doYourGumsBleedRegularlyWithToothBrushing));
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(170));
        JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.doYourTeethOrGumsHurtRegularly));
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(171));
        JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.doYouHavePeriodontalOrGumDisease));
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(172));
        JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.haveYouHadDentalSealantsPlaced));
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(173));
        JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.doYouCurrentlyHaveCavities));
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(174));
        JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.haveYouPreviouslyHadAnyDentalFillings));
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(175));
        JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.doesYourMouthUsuallyFeelDry));
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(176));
        JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.overallHowWouldYouRateTheOverallHealth));
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(177));
        JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.overallHowWouldYouRateYourDentalHygieneRoutine));
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(178));
        JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.haveYouHadAnyChangesInYourSenseOfSmell));
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(179));
        JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.haveYouHadAnyChangesInYourSenseOfTaste));
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(180));
        JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.doYouHaveJawOrTemporomandibularJointPain));
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(181));
        JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.doYouHaveFrequentHeadaches));
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(182));
        JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.haveYouHadAnyOrthodonticTreatment));
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(184));
        JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.haveYouHadAnyFacialOrDentalTrauma));
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(186));
        JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.haveYouHadElectiveJawSurgery));
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(189));
        CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicClickOnCheckboxesScreener(2));
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(190));
        CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicClickOnCheckboxesScreener(2));
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(191));
        JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.doYouHaveAnyNumbnessInOrAroundYourMouth));
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(192));
        JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.doYouHaveAnyMouthSores));
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(193));
        JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.doYourTeethFeelSensitiveToHotOrColdFoods));
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(194));
        JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.doYouHaveProblemsMovingYourLipsTongueOrMouth));
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(195));
        CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicClickOnCheckboxesScreener(2));
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        String[] clickingOnOptionInMultiplePages = {ras_Survey_TestDataManager.haveYouHadTroublePronouncingAnyWords,
                ras_Survey_TestDataManager.haveYouFeltThatYourSenseOfTasteHasWorsened,
                ras_Survey_TestDataManager.haveYouHadPainfulAchingInYourMouth,
                ras_Survey_TestDataManager.haveYouFoundItUncomfortableToEatAnyFoods,
                ras_Survey_TestDataManager.areYouSelfConsciousBecauseOfYourTeeth,
                ras_Survey_TestDataManager.haveYouFeltTenseBecauseOfProblems,
                ras_Survey_TestDataManager.hasYourDietBeenUnsatisfactoryBecause,
                ras_Survey_TestDataManager.haveYouHadToInterruptMealsBecauseOfProblems,
                ras_Survey_TestDataManager.haveYouFoundItDifficultToRelaxBecause,
                ras_Survey_TestDataManager.haveYouBeenABitEmbarrassedBecause,
                ras_Survey_TestDataManager.haveYouBeenIrritableWithOtherPeopleBecause,
                ras_Survey_TestDataManager.haveYouHadDifficultyDoingYourUsualJobs,
                ras_Survey_TestDataManager.haveYouFeltThatLifeInGeneralIsLessSatisfying,
                ras_Survey_TestDataManager.haveYouFeltThatLifeInGeneralIsLessSatisfying};
        for (int jjj = 196; jjj < 210; jjj++) {
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(jjj));
            JavascriptUtils.clickByJS(dynamicLocator(clickingOnOptionInMultiplePages[jjj - 196]));
            CucumberLogUtils.logScreenshot();
            ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        }
    }

    /**
     * This method represents the seventh part of the RAS screener survey scenario 1.
     * It handles the interaction with the survey page elements to answer questions about fluid balance, lymphatic system issues, and kidneys.
     * <p>
     * The method performs the following actions:
     * 1. Waits for the visibility of the top text element with a specific dynamic locator.
     * 2. Verifies the next set of questions about fluid balance by comparing the expected text with the actual text on the survey page.
     * 3. Logs a screenshot of the survey page.
     * 4. Clicks on the "Save and Next" button.
     * 5. Repeats the above steps for questions about lymphatic system issues and kidneys.
     * 6. Verifies the next set of questions about hair and skin qualities by comparing the expected text with the actual text on the survey page.
     * 7. Logs a screenshot of the survey page.
     *
     * @throws NoSuchElementException if any element specified by the dynamic locators is not found
     * @throws TimeoutException       if the visibility of an element is not achieved within a certain timeout period
     */
    public void rasScreenerSurveyScenario1PartSeven() {
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(306));
        softAssert.assertEquals(ras_Survey_TestDataManager.theNextSetOfQuestionsAskAboutFluidBalance, myRASSurveyPage.rasSurveyText.getText(), "-- VERIFYING THE NEXT SET OF QUESTIONS ASK ABOUT FLUID BALANCE AND IF ANY FLUID BUILDS TEXT --");
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(331));
        JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithALymphaticSystemIssue));
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(332));
        softAssert.assertEquals(ras_Survey_TestDataManager.theNextSetOfQuestionsWillAskAboutTheKidneys, myRASSurveyPage.rasSurveyText.getText(), "-- VERIFYING THE NEXT SET OF QUESTIONS WILL ASK ABOUT THE KIDNEYS TEXT --");
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(383));
        JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.haveYouEverBeenEvaluatedByANephrologist));
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(329));
        JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithAKidneyProblem));
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(309));
        softAssert.assertEquals(ras_Survey_TestDataManager.theNextSetOfQuestionsAskAboutHairAndSkinQualities, myRASSurveyPage.rasSurveyText.getText(), "-- VERIFYING THE NEXT SET OF QUESTIONS ASK ABOUT HAIR AND SKIN QUALITIES TEXT --");
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method represents the eighth part of the ras screener survey scenario 1.
     * It performs a series of actions such as clicking on buttons, waiting for elements to be visible,
     * clicking on checkboxes, and verifying text.
     * Each step is documented with a comment explaining what it does.
     * At the end of each step, a screenshot is logged using CucumberLogUtils.
     */
    public void rasScreenerSurveyScenario1PartEight() {
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(385));
        JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.haveYouEverBeenEvaluatedByADermatologist));
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(rasopathyQuestionnairePage.dynamicClickOnCheckboxesScreener(4));
        CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicClickOnCheckboxesScreener(4));
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(221));
        JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.isTheTextureOrAmountOfYourHairSimilar));
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(rasopathyQuestionnairePage.dynamicClickOnCheckboxesScreener(7));
        CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicClickOnCheckboxesScreener(7));
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(rasopathyQuestionnairePage.dynamicClickOnCheckboxesScreener(5));
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(223));
        CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicClickOnCheckboxesScreener(7));
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(224));
        JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.doYouHaveAnyHemangiomas));
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(rasopathyQuestionnairePage.dynamicClickOnCheckboxesScreener(5));
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(225));
        CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicClickOnCheckboxesScreener(7));
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(310));
        softAssert.assertEquals(ras_Survey_TestDataManager.theNextSetOfQuestionsAskAboutSkeletalConditions, myRASSurveyPage.rasSurveyText.getText(), "-- VERIFYING THE NEXT SET OF QUESTIONS ASK ABOUT SKELETAL CONDITIONS TEXT --");
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(387));
        JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.haveYouEverBeenEvaluatedByAnOrthopaedicSurgeon));
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(226));
        CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicClickOnCheckboxesScreener(6));
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(352));
        JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.doYouHaveAnyIssuesWithCurvingOfTheSpine));
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(231));
        JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.hasYourNeckBeenDescribedAsShortOrWebbed));
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(353));
        JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithJointIssues));
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(311));
        softAssert.assertEquals(ras_Survey_TestDataManager.theNextSetOfQuestionsAskAboutBloodDisorders, myRASSurveyPage.rasSurveyText.getText(), "-- VERIFYING THE NEXT SET OF QUESTIONS ASK ABOUT BLOOD DISORDERS TEXT --");
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method is used to complete the ninth part of the RAS Screener Survey.
     * <p>
     * The method performs the following actions:
     * 1. Clicks on the Survey Save and Next button.
     * 2. Waits for the visibility of a specific dynamic top text element.
     * 3. Clicks on a specific checkbox option by using JavaScript.
     * 4. Logs a screenshot using CucumberLogUtils.
     * 5. Repeats steps 1-4 multiple times with different dynamic elements and checkbox options.
     * 6. Waits for the visibility of a specific dynamic top text element.
     * 7. Performs an assertion to verify the displayed text on the page.
     * 8. Logs a screenshot using CucumberLogUtils.
     * <p>
     * No parameters are accepted and no value is returned.
     */
    public void rasScreenerSurveyScenario1PartNine() {
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(389));
        JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.haveYouEverHadAnEvaluationByAHematologist));
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(354));
        JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.doYouHaveIssuesWithBleedingOrBruising));
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(355));
        JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.doYouHaveAnyKnownBloodDisorders));
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(238));
        CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicClickOnCheckboxesScreener(8));
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(356));
        JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.doYouHaveAHistoryOfFrequentInfections));
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(391));
        JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.haveYouEverBeenEvaluatedByAnImmunologist));
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(357));
        JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithAnAutoimmuneDisorder));
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(312));
        softAssert.assertEquals(ras_Survey_TestDataManager.theNextSetOfQuestionsAskAboutNervousSystem, myRASSurveyPage.rasSurveyText.getText(), "-- VERIFYING THE NEXT SET OF QUESTIONS ASK ABOUT NERVOUS SYSTEM TEXT --");
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method is used to perform a series of actions in the RAS screener survey scenario 1 part ten.
     * It clicks on various survey buttons, waits for visibility of certain elements, clicks on checkboxes,
     * fills in text boxes, verifies text, takes screenshots, and logs out of a native view.
     */
    public void rasScreenerSurveyScenario1PartTen() {
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(393));
        JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.haveYouEverBeenEvaluatedByANeurologist));
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(358));
        JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithAStructuralBrainAbnormality));
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(359));
        JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.doYouHaveAHistoryOfSeizures));
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(395));
        JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.haveYouEverBeenEvaluatedByAPsychiatrist));
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(360));
        JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithABehavioral));
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(249));
        CommonUtils.sendKeysToElement(myRASSurveyPage.dynamicOneTextBox(249), ras_Survey_TestDataManager.pleaseListAndDescribeAnyAdditionalNeurologicConditions);
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(313));
        softAssert.assertEquals(ras_Survey_TestDataManager.theNextSetOfQuestionsAskAboutVisionAndHearing, myRASSurveyPage.rasSurveyText.getText(), "-- VERIFYING THE NEXT SET OF QUESTIONS ASK ABOUT VISION AND HEARING TEXT --");
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(250));
        JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithPtosis));
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(361));
        JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.haveYouEverHadAnyIssuesWithYourVision));
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(253));
        CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicClickOnCheckboxesScreener(7));
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(254));
        JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.haveYouEverExperiencedStabismus));
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(256));
        JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.haveYouEverExperiencedNystagmus));
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(362));
        JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.haveYouExperiencedHearingLoss));
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(260));
        CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicClickOnCheckboxesScreener(4));
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(297));
        CommonUtils.sendKeysToElement(myRASSurveyPage.dynamicOneTextBox(297), ras_Survey_TestDataManager.ifThereAreAnyOtherHealthIssues);
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(298));
        softAssert.assertEquals(ras_Survey_TestDataManager.youAreAlmostDoneSurvey, myRASSurveyPage.dynamicTopText(298).getText(), "-- VERIFYING YOU ARE ALMOST DONE TEXT --");
        CommonUtils.sleep(1000);
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.sleep(3000);
        CucumberLogUtils.logScreenshot();
        CommonUtils.sleep(1000);
        ServiceNow_Common_Methods.logOutOfNativeView();
    }

    /***
     * THIS METHOD VERIFIES RAS SCREENER SCENARIO 2 DATA IN NATIVE VIEW
     */
    public void verifying_RAS_Screener_Scenario_2_Data(String sheetName) {
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        CommonUtils.sleep(3000);
        CommonUtils.waitForVisibility(NativeView_SideDoor_Dashboard_Page.filterNavigatorTextBox);
        NativeView_SideDoor_Dashboard_Page.filterNavigatorTextBox.sendKeys("All Participant Details");
        CommonUtils.sleep(3000);
        CommonUtils.clickOnElement(NativeView_SideDoor_Dashboard_Page.allParticipantDetailsLink);
        CommonUtils.sleep(3000);
        CommonUtils.switchToFrame(NativeView_SideDoor_Dashboard_Page.nativeViewiFrame);
        CommonUtils.waitForVisibility(nativeViewCHARMSDashboardPage.rasStudyParticipantsDetailsMenu);
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
        }

        CommonUtils.sleep(1000);
        CucumberLogUtils.scenario.log("---- VERIFYING PARTICIPANT RECORD PREVIEW DATA ----");
        softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(nativeViewCHARMSParticipantDetailsPage.firstNameRecordPreviewField), ras_Screener_TestDataManager.FIRST_NAME, "-- VERIFYING PREVIEW RECORD FIRST NAME --");
        softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(nativeViewCHARMSParticipantDetailsPage.lastNameRecordPreviewField), ras_Screener_TestDataManager.LAST_NAME, "-- VERIFYING PREVIEW RECORD LAST NAME --");
        softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(nativeViewCHARMSParticipantDetailsPage.contactHomePhoneRecordPreviewField), ras_Screener_TestDataManager.HOME_PHONE_NUMBER, "-- VERIFYING PREVIEW RECORD CONTACT HOME PHONE NUMBER --");
        softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(nativeViewCHARMSParticipantDetailsPage.contactEmailRecordPreviewField), ras_Screener_TestDataManager.EMAIL_ADDRESS, "-- VERIFYING PREVIEW RECORD CONTACT EMAIL ADDRESS --");
        CucumberLogUtils.logScreenshot();
        if (CommonUtils.isElementDisplayed(nativeViewCHARMSDashboardPage.rasStudyOpenRecordButton)) {
            CommonUtils.clickOnElement(nativeViewCHARMSDashboardPage.rasStudyOpenRecordButton);
        }
        CucumberLogUtils.scenario.log("---- VERIFYING PARTICIPANT NAME DATA ----");
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantDetailsPage.relationshipToProbandDropDown);
        softAssert.assertEquals(CommonUtils.getTextOfSelectedDropDownOption(nativeViewCHARMSParticipantDetailsPage.relationshipToProbandDropDown), "Proband", "-- VERIFYING RELATIONSHIP TO PROBAND --");
        softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(nativeViewCHARMSParticipantDetailsPage.nameTextBox), ras_Screener_TestDataManager.FIRST_NAME + ras_Screener_Constants.SPACE + ras_Screener_TestDataManager.MIDDLE_INITIAL + ras_Screener_Constants.SPACE + ras_Screener_TestDataManager.LAST_NAME, "-- VERIFYING FULL NAME --");
        softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(nativeViewCHARMSParticipantDetailsPage.firstNameTextBox), ras_Screener_TestDataManager.FIRST_NAME, "-- VERIFYING FIRST NAME --");
        softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(nativeViewCHARMSParticipantDetailsPage.middleInitialTextBox), ras_Screener_TestDataManager.MIDDLE_INITIAL, "-- VERIFYING MIDDLE INITIAL --");
        softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(nativeViewCHARMSParticipantDetailsPage.lastNameTextBox), ras_Screener_TestDataManager.LAST_NAME, "-- VERIFYING LAST NAME --");
        CucumberLogUtils.logScreenshot();

        CucumberLogUtils.scenario.log("---- VERIFYING PARTICIPANT DEMOGRAPHICS DATA ----");
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantDetailsPage.demographicsTab);
        softAssert.assertEquals(CommonUtils.getTextOfSelectedDropDownOption(nativeViewCHARMSParticipantDetailsPage.biologicalGenderDropDown), ras_Screener_TestDataManager.WHAT_IS_YOUR_SEX, "-- VERIFYING SEX --");
        softAssert.assertEquals(nativeViewCHARMSParticipantDetailsPage.participantRaceOption.getText(), ras_Screener_TestDataManager.WHAT_IS_YOUR_RACE, "-- VERIFYING RACE --");
        softAssert.assertEquals(CommonUtils.getTextOfSelectedDropDownOption(nativeViewCHARMSParticipantDetailsPage.ethnicityDropDownOption), ras_Screener_TestDataManager.WHAT_IS_YOUR_ETHNICITY, "-- VERIFYING ETHNICITY --");
        softAssert.assertEquals(CommonUtils.getTextOfSelectedDropDownOption(nativeViewCHARMSParticipantDetailsPage.isParticipantAdoptedDropDown), ras_Screener_TestDataManager.ARE_YOU_ADOPTED_OPTION, "-- VERIFYING IF THE PARTICIPANT IS ADOPTED --");
        softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(nativeViewCHARMSParticipantDetailsPage.dateOfBirthTextBox), CommonUtils.convertDate(ras_Screener_TestDataManager.WHAT_IS_YOUR_DATE_OF_BIRTH), "-- VERIFYING DATE OF BIRTH --");
        CucumberLogUtils.logScreenshot();

        CucumberLogUtils.scenario.log("---- VERIFYING PARTICIPANT CONTACT INFORMATION DATA ----");
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantDetailsPage.contactInfoTab);
        softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(nativeViewCHARMSParticipantDetailsPage.contactStreetAddress), ras_Screener_TestDataManager.STREET, "-- VERIFYING CONTACT STREET ADDRESS --");
        softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(nativeViewCHARMSParticipantDetailsPage.contactState), ras_Screener_TestDataManager.STATE, "-- VERIFYING CONTACT STATE --");
        softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(nativeViewCHARMSParticipantDetailsPage.contactCity), ras_Screener_TestDataManager.CITY, "- VERIFYING CONTACT CITY --");
        softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(nativeViewCHARMSParticipantDetailsPage.contactZipCode), ras_Screener_TestDataManager.ZIPCODE, "-- VERIFYING ZIP CODE --");
        softAssert.assertEquals(CommonUtils.getTextOfSelectedDropDownOption(nativeViewCHARMSParticipantDetailsPage.contactCountryDropDown), ras_Screener_TestDataManager.COUNTRY_OPTION, "-- VERIFYING CONTACT COUNTRY --");
        softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(nativeViewCHARMSParticipantDetailsPage.contactEmailAddress), ras_Screener_TestDataManager.EMAIL_ADDRESS, "-- VERIFYING CONTACT EMAIL ADDRESS --");
        softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(nativeViewCHARMSParticipantDetailsPage.contactHomePhone), ras_Screener_TestDataManager.HOME_PHONE_NUMBER, "-- VERIFYING CONTACT HOME PHONE --");
        softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(nativeViewCHARMSParticipantDetailsPage.contactCellPhone), ras_Screener_TestDataManager.CELL_PHONE_NUMBER, "-- VERIFYING CONTACT CELL PHONE --");
        softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(nativeViewCHARMSParticipantDetailsPage.contactWorkPhone), ras_Screener_TestDataManager.WORK_PHONE_NUMBER, "-- VERIFYING CONTACT WORK PHONE --");
        softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(nativeViewCHARMSParticipantDetailsPage.contactPreferredPhone), ras_Screener_TestDataManager.CELL_PHONE_NUMBER, "-- VERIFYING PREFERRED PHONE --");
        CucumberLogUtils.logScreenshot();

        CucumberLogUtils.scenario.log("---- OPENING PARTICIPANT STUDIES RECORD ----");
        JavascriptUtils.scrollIntoView(nativeViewCHARMSParticipantDetailsPage.participantStudiesTab);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantDetailsPage.participantStudiesTab);
        CucumberLogUtils.logScreenshot();
        CommonUtils.waitForClickability(nativeViewCHARMSParticipantDetailsPage.dynamicRecordButtonLocator("Eligible"));
        CommonUtils.hoverOverElement(nativeViewCHARMSParticipantDetailsPage.dynamicRecordButtonLocator("Eligible"));
        CommonUtils.waitForVisibility(locateByXpath("//tr[@record_class='x_naci_family_coho_participant_study']//td[normalize-space()='Field']"));
        CommonUtils.hoverOverElement(locateByXpath("//tr[@record_class='x_naci_family_coho_participant_study']//td[normalize-space()='Field']"));
        CommonUtils.sleep(500);
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantDetailsPage.participantStudiesInfoButton);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantDetailsPage.participantStudiesInfoButton);
        CommonUtils.waitForVisibility(locateByXpath("//tr[@record_class='x_naci_family_coho_participant_study']//td[@class='list_decoration_cell col-small col-center ']//a"));
        CommonUtils.clickOnElement(locateByXpath("//tr[@record_class='x_naci_family_coho_participant_study']//td[@class='list_decoration_cell col-small col-center ']//a"));
        CucumberLogUtils.logScreenshot();

        CucumberLogUtils.scenario.log("---- NAVIGATING TO RAS SCREENER TABLE ----");
        CommonUtils.waitForClickability(nativeViewCHARMSDashboardPage.rasStudyOpenRecordButton);
        CommonUtils.clickOnElement(nativeViewCHARMSDashboardPage.rasStudyOpenRecordButton);
        CucumberLogUtils.logScreenshot();
        CommonUtils.waitForClickability(nativeViewCHARMSParticipantStudyPage.participantStudyScreenerInfoButton);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantStudyPage.participantStudyScreenerInfoButton);
        CommonUtils.sleep(800);

        CucumberLogUtils.scenario.log("---- VERIFYING RAS SCREENER PREVIEW RECORD DATA ----");
        softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(nativeViewCHARMSScreenerRecordTablePage.screenerPreviewParticipantInfoRecordField), FSID, "-- VERIFYING SCREENER PREVIEW RECORD PARTICIPANT INFO FIELD --");
        softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(nativeViewCHARMSScreenerRecordTablePage.screenerPreviewContactEmailAddressField), ras_Screener_TestDataManager.EMAIL_ADDRESS, "-- VERIFYING SCREENER PREVIEW RECORD CONTACT EMAIL ADDRESS FIELD --");
        softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(nativeViewCHARMSScreenerRecordTablePage.screenerPreviewStudyField), ras_Screener_Constants.RAS_STUDY, "-- VERIFYING SCREENER PREVIEW STUDY FIELD --");
        CucumberLogUtils.logScreenshot();

        CucumberLogUtils.scenario.log("---- NAVIGATING TO RAS SCREENER TABLE ----");
        CommonUtils.waitForClickability(nativeViewCHARMSDashboardPage.rasStudyOpenRecordButton);
        CommonUtils.clickOnElement(nativeViewCHARMSDashboardPage.rasStudyOpenRecordButton);
        CommonUtils.sleep(800);
        CucumberLogUtils.logScreenshot();

        CucumberLogUtils.scenario.log("---- VERIFYING SCREENER RECORD NAME AND CONTACT INFORMATION DATA ----");
        softAssert.assertEquals(CommonUtils.getTextOfSelectedDropDownOption(nativeViewCHARMSParticipantDetailsPage.vitalStatusYesDropDownOption), "Alive", "-- VERIFYING VITAL STATUS --");
        CommonUtils.clickOnElement(NativeViewCHARMSScreenerRecordTablePage.dynamicTabLocatorUsingExactText("Contact Information"));
        softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(nativeViewCHARMSScreenerRecordTablePage.screenerStudyField), ras_Screener_Constants.RAS_STUDY, "-- VERIFYING STUDY FIELD --");
        softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(nativeViewCHARMSScreenerRecordTablePage.participantInfoRecordField), FSID, "-- VERIFYING PARTICIPANT INFO RECORD FIELD --");
        softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(nativeViewCHARMSScreenerRecordTablePage.contactEmailField), ras_Screener_TestDataManager.EMAIL_ADDRESS, "-- VERIFYING CONTACT EMAIL FIELD --");
        softAssert.assertEquals(CommonUtils.getTextOfSelectedDropDownOption(nativeViewCHARMSScreenerRecordTablePage.preferredContactDropDown), "Cell Phone", "-- VERIFYING PREFERRED CONTACT DROPDOWN --");
        softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(nativeViewCHARMSScreenerRecordTablePage.contactHomePhoneField), ras_Screener_TestDataManager.HOME_PHONE_NUMBER, "-- VERIFYING CONTACT HOME PHONE NUMBER --");
        softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(nativeViewCHARMSScreenerRecordTablePage.contactCellPhoneField), ras_Screener_TestDataManager.CELL_PHONE_NUMBER, "-- VERIFYING CONTACT CELL PHONE NUMBER --");
        softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(nativeViewCHARMSScreenerRecordTablePage.contactWorkPhoneField), ras_Screener_TestDataManager.WORK_PHONE_NUMBER, "-- VERIFYING CONTACT WORK PHONE NUMBER --");
        softAssert.assertEquals(CommonUtils.getTextOfSelectedDropDownOption(nativeViewCHARMSScreenerRecordTablePage.contactCountryDropDown), ras_Screener_TestDataManager.COUNTRY_OPTION, "-- VERIFYING COUNTRY CONTACT FIELD --");
        softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(nativeViewCHARMSScreenerRecordTablePage.contactStateField), ras_Screener_TestDataManager.STATE, "-- VERIFYING STATE --");
        softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(nativeViewCHARMSScreenerRecordTablePage.contactStreetAddressField), ras_Screener_TestDataManager.STREET, "-- VERIFYING CONTACT STREET ADDRESS --");
        softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(nativeViewCHARMSScreenerRecordTablePage.contactStreetAddress2OptionalField), ras_Screener_TestDataManager.STREET2, "-- VERIFYING CONTACT STREET ADDRESS 2(OPTIONAL) FIELD --");
        softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(nativeViewCHARMSScreenerRecordTablePage.contactCityField), ras_Screener_TestDataManager.CITY, "-- VERIFYING CONTACT CITY --");
        softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(nativeViewCHARMSScreenerRecordTablePage.contactZipCodeField), ras_Screener_TestDataManager.ZIPCODE, "-- VERIFYING ZIP CODE --");
        CucumberLogUtils.logScreenshot();

        CucumberLogUtils.scenario.log("---- VERIFYING RAS SCREENER TABLE DEMOGRAPHICS INFORMATION DATA ----");
        CommonUtils.clickOnElement(nativeViewCHARMSScreenerRecordTablePage.dynamicLocatorForTabs("Demographics"));
        softAssert.assertEquals(nativeViewCHARMSScreenerRecordTablePage.demographicsParticipantRacePreferNotToAnswerOption.getText(), ras_Screener_TestDataManager.WHAT_IS_YOUR_RACE, "-- VERIFYING RACE OF PARTICIPANT --");
        softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(nativeViewCHARMSScreenerRecordTablePage.demographicsSexInput), ras_Screener_TestDataManager.WHAT_IS_YOUR_SEX, "-- VERIFYING SEX --");
        softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(nativeViewCHARMSScreenerRecordTablePage.demographicsDateOfBirthField), convertDOBToMMddyyyyFormat(ras_Screener_TestDataManager.WHAT_IS_YOUR_DATE_OF_BIRTH), "-- VERIFYING DATE OF BIRTH --");
        softAssert.assertEquals(CommonUtils.getTextOfSelectedDropDownOption(nativeViewCHARMSScreenerRecordTablePage.demographicsEthnicityDropDown), ras_Screener_TestDataManager.WHAT_IS_YOUR_ETHNICITY, "-- VERIFYING ETHNICITY --");
        CucumberLogUtils.logScreenshot();

        CucumberLogUtils.scenario.log("---- VERIFYING RAS SCREENER TABLE RASOPATHY HISTORY DATA ----");
        CommonUtils.clickOnElement(nativeViewCHARMSScreenerRecordTablePage.dynamicLocatorForTabs("RASopathy History"));
        softAssert.assertEquals(CommonUtils.getTextOfSelectedDropDownOption(nativeViewCHARMSScreenerRecordTablePage.rasopathyHistoryHaveYouBeenDiagnosedWithARasopathyDropDown), ras_Screener_TestDataManager.HAVE_YOU_BEEN_DIAGNOSED_WITH_A_RASOPATHY, "-- VERIFYING IF PARTICIPANT HAS BEEN DIAGNOSED WITH A RASOPATHY --");
        softAssert.assertEquals(nativeViewCHARMSScreenerRecordTablePage.rasopathyHistoryNeverDiagnosedWithAnyOfTheseConditions.getText(), ras_Screener_TestDataManager.HAVE_YOU_BEEN_DIAGNOSED_WITH_FOLLOWING_CONDITIONS_ALL_OPTION, "-- VERIFYING IF CANDIDATE HAS BEEN DIAGNOSED WITH ANY CONDITIONS --");
        softAssert.assertEquals(CommonUtils.getTextOfSelectedDropDownOption(nativeViewCHARMSScreenerRecordTablePage.rasopathyHistoryHaveAnyOfYourBiologicalRelativesBeenDiagnosedWithARasopathyDropDown), ras_Screener_TestDataManager.HAVE_ANY_OF_YOUR_BIOLOGICAL_RELATIVES_BEEN_DIAGNOSED_WITH_A_RASOPATHY, "-- VERIFYING IF ANY OF BIOLOGICAL RELATIVES BEEN DIAGNOSED WITH A RASOPATHY --");
        CucumberLogUtils.logScreenshot();

        CucumberLogUtils.scenario.log("---- VERIFYING RAS SCREENER TABLE CANCER HISTORY ----");
        CommonUtils.clickOnElement(nativeViewCHARMSScreenerRecordTablePage.dynamicLocatorForTabs("Cancer History"));
        softAssert.assertEquals(CommonUtils.getTextOfSelectedDropDownOption(nativeViewCHARMSScreenerRecordTablePage.cancerHistoryHasAPhysicianEverDiagnosedParticipantWithCancerDropDown), ras_Screener_TestDataManager.HAVE_YOU_BEEN_DIAGNOSED_WITH_CANCER, "-- VERIFYING IF PARTICIPANT HAS BEEN DIAGNOSED WITH CANCER --");
        CucumberLogUtils.logScreenshot();

        CucumberLogUtils.scenario.log("---- VERIFYING RAS SCREENER TABLE GENETIC TESTING HISTORY ----");
        CommonUtils.clickOnElement(nativeViewCHARMSScreenerRecordTablePage.dynamicLocatorForTabs("Genetic Testing History"));
        softAssert.assertEquals(CommonUtils.getTextOfSelectedDropDownOption(nativeViewCHARMSScreenerRecordTablePage.geneticTestingHistoryHasTheParticipantEverHadGeneticTestingDropDown), ras_Screener_TestDataManager.HAVE_YOU_EVER_HAD_GENETIC_TESTING, "-- VERIFYING IF PARTICIPANT HAS HAD GENETIC TESTING --");
        softAssert.assertEquals(CommonUtils.getTextOfSelectedDropDownOption(nativeViewCHARMSScreenerRecordTablePage.doesTheParticipantHaveACopyOfGeneticTestResultsDropDown), ras_Screener_TestDataManager.DO_YOU_HAVE_A_COPY_OF_THE_GENETIC, "-- VERIFYING IF PARTICIPANT HAS A COPY OF GENETIC TEST RESULTS --");
        softAssert.assertEquals(CommonUtils.getTextOfSelectedDropDownOption(nativeViewCHARMSScreenerRecordTablePage.participantsPreferredMethodOfDeliveringGeneticTestResultsDropDown), ras_Screener_TestDataManager.HOW_WOULD_YOU_LIKE_TO_PROVIDE_THE_GENETIC_TEST_RESULTS, "-- VERIFYING PARTICIPANT'S PREFERRED METHOD OF DELIVERING GENETIC TEST RESULTS --");
        CucumberLogUtils.logScreenshot();

        CucumberLogUtils.scenario.log("---- VERIFYING RAS SCREENER TABLE FINAL INFORMATION ----");
        CommonUtils.clickOnElement(nativeViewCHARMSScreenerRecordTablePage.dynamicLocatorForTabs("Final Information"));
        softAssert.assertEquals(CommonUtils.getTextOfSelectedDropDownOption(nativeViewCHARMSScreenerRecordTablePage.finalInformationHowDidYouHearAboutThisStudyDropDown), ras_Screener_TestDataManager.HOW_DID_YOU_HEAR_ABOUT_THIS_STUDY, "-- VERIFYING HOW DID PARTICIPANT HEAR ABOUT THE STUDY --");
        softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(nativeViewCHARMSScreenerRecordTablePage.finalInformationHowDidYouHearAboutThisStudyPleaseSpecifyTextBox), ras_Screener_TestDataManager.HOW_DID_YOU_HEAR_ABOUT_THIS_STUDY_OTHER_REASON, "-- VERIFYING HOW DID YOU PARTICIPANT HEAR ABOUT THE STUDY OTHER REASONS --");
        softAssert.assertEquals(CommonUtils.getTextOfSelectedDropDownOption(nativeViewCHARMSScreenerRecordTablePage.finalInformationHasParticipantOrAnyFamilyMemberParticipatedInAnyCancerStudyDropDown), "Not answered", "-- VERIFYING IF PARTICIPANT OR FAMILY MEMBER HAVE PARTICIPATED IN CANCER STUDY --");
        softAssert.assertEquals(nativeViewCHARMSScreenerRecordTablePage.finalInformationMainReasonsForParticipatingInThisStudyOtherOption.getText(), ras_Screener_TestDataManager.WHAT_ARE_MAIN_REASONS_FOR_PARTICIPATING_IN_STUDY_ALL, "-- VERIFYING MAIN REASONS FOR PARTICIPATING IN STUDY --");
        softAssert.assertEquals(nativeViewCHARMSScreenerRecordTablePage.finalInformationMainReasonsForParticipatingInThisStudyOtherReasonsField.getText(), ras_Screener_TestDataManager.WHAT_ARE_MAIN_REASONS_FOR_PARTICIPATING_IN_STUDY_OTHER_REASON_OPTION_4, "-- VERIFYING MAIN REASONS FOR PARTICIPATING IN STUDY FIELD --");
        softAssert.assertEquals(CommonUtils.getTextOfSelectedDropDownOption(nativeViewCHARMSScreenerRecordTablePage.finalInformationAreYouAParticipantInAnyOtherResearchStudyOrRegistryGroupDropDown), "Not answered", "-- VERIFYING IF PARTICIPANT IS PART OF RESEARCH STUDY OR REGISTRY GROUP --");
        CucumberLogUtils.logScreenshot();
        ServiceNow_Common_Methods.logOutOfNativeView();
    }

    /***
     * THIS METHOD VERIFIES RAS SCREENER SCENARIO FOR MINOR DATA IN NATIVE VIEW
     */
    public void verifying_RAS_Screener_Scenario_Minor_Data(String sheetName) {
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        CommonUtils.sleep(3000);
        CommonUtils.waitForVisibility(NativeView_SideDoor_Dashboard_Page.filterNavigatorTextBox);
        NativeView_SideDoor_Dashboard_Page.filterNavigatorTextBox.sendKeys("All Participant Details");
        CommonUtils.sleep(3000);
        CommonUtils.clickOnElement(NativeView_SideDoor_Dashboard_Page.allParticipantDetailsLink);
        CommonUtils.sleep(3000);
        CommonUtils.switchToFrame(NativeView_SideDoor_Dashboard_Page.nativeViewiFrame);
        CommonUtils.waitForVisibility(nativeViewCHARMSDashboardPage.rasStudyParticipantsDetailsMenu);
        CucumberLogUtils.logScreenshot();
        if (sheetName.contentEquals("screenerScenarioAge11-13")) {
            CommonUtils.hoverOverElement(nativeViewCHARMSParticipantDetailsPage.dynamicRecordButtonLocator(ras_Screener_TestDataManager.WHAT_IS_THE_NAME_OF_THE_PERSON_WHO_MAY_BE_ELIGIBLE_FOR_THIS_STUDY_FIRST + " " + ras_Screener_TestDataManager.WHAT_IS_THE_NAME_OF_THE_PERSON_WHO_MAY_BE_ELIGIBLE_FOR_THIS_STUDY_MI + " " + ras_Screener_TestDataManager.WHAT_IS_THE_NAME_OF_THE_PERSON_WHO_MAY_BE_ELIGIBLE_FOR_THIS_STUDY_LAST));
            CucumberLogUtils.logScreenshot();
            CommonUtils.clickOnElement(NativeViewCHARMSDashboardPage.nativeViewnewScreenerReceivedLocator(ras_Screener_TestDataManager.WHAT_IS_THE_NAME_OF_THE_PERSON_WHO_MAY_BE_ELIGIBLE_FOR_THIS_STUDY_FIRST + " " + ras_Screener_TestDataManager.WHAT_IS_THE_NAME_OF_THE_PERSON_WHO_MAY_BE_ELIGIBLE_FOR_THIS_STUDY_MI + " " + ras_Screener_TestDataManager.WHAT_IS_THE_NAME_OF_THE_PERSON_WHO_MAY_BE_ELIGIBLE_FOR_THIS_STUDY_LAST));
        }
        CommonUtils.sleep(1000);
        CucumberLogUtils.scenario.log("---- VERIFYING PARTICIPANT RECORD PREVIEW DATA ----");
        softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(nativeViewCHARMSParticipantDetailsPage.firstNameRecordPreviewField), ras_Screener_TestDataManager.PARTICIPANT_FIRST_NAME, "-- VERIFYING PREVIEW RECORD FIRST NAME --");
        softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(nativeViewCHARMSParticipantDetailsPage.lastNameRecordPreviewField), ras_Screener_TestDataManager.PARTICIPANT_LAST_NAME, "-- VERIFYING PREVIEW RECORD LAST NAME --");
        softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(nativeViewCHARMSParticipantDetailsPage.proxyContactEmailRecordPreviewField), ras_Screener_TestDataManager.EMAIL_ADDRESS, "-- VERIFYING PREVIEW RECORD PROXY CONTACT EMAIL ADDRESS --");
        CucumberLogUtils.logScreenshot();
        if (CommonUtils.isElementDisplayed(nativeViewCHARMSDashboardPage.rasStudyOpenRecordButton)) {
            CommonUtils.clickOnElement(nativeViewCHARMSDashboardPage.rasStudyOpenRecordButton);
        }
        CucumberLogUtils.scenario.log("---- VERIFYING PARTICIPANT NAME DATA ----");
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantDetailsPage.personalInformationTab);
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantDetailsPage.relationshipToProbandDropDown);
        softAssert.assertEquals(CommonUtils.getTextOfSelectedDropDownOption(nativeViewCHARMSParticipantDetailsPage.relationshipToProbandDropDown), "Proband", "-- VERIFYING RELATIONSHIP TO PROBAND --");
        softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(nativeViewCHARMSParticipantDetailsPage.nameTextBox), ras_Screener_TestDataManager.PARTICIPANT_FIRST_NAME + ras_Screener_Constants.SPACE + ras_Screener_TestDataManager.PARTICIPANT_MIDDLE_INITIAL + ras_Screener_Constants.SPACE + ras_Screener_TestDataManager.PARTICIPANT_LAST_NAME, "-- VERIFYING FULL NAME --");
        softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(nativeViewCHARMSParticipantDetailsPage.firstNameTextBox), ras_Screener_TestDataManager.PARTICIPANT_FIRST_NAME, "-- VERIFYING FIRST NAME --");
        softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(nativeViewCHARMSParticipantDetailsPage.middleInitialTextBox), ras_Screener_TestDataManager.PARTICIPANT_MIDDLE_INITIAL, "-- VERIFYING MIDDLE INITIAL --");
        softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(nativeViewCHARMSParticipantDetailsPage.lastNameTextBox), ras_Screener_TestDataManager.PARTICIPANT_LAST_NAME, "-- VERIFYING LAST NAME --");
        CucumberLogUtils.logScreenshot();
        CucumberLogUtils.scenario.log("---- VERIFYING PARTICIPANT DEMOGRAPHICS DATA ----");
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantDetailsPage.demographicsTab);
        softAssert.assertEquals(CommonUtils.getTextOfSelectedDropDownOption(nativeViewCHARMSParticipantDetailsPage.biologicalGenderDropDown), ras_Screener_TestDataManager.WHAT_IS_THE_PARTICIPANTS_SEX, "-- VERIFYING SEX --");
        softAssert.assertEquals(nativeViewCHARMSParticipantDetailsPage.participantRaceOption.getText(), ras_Screener_TestDataManager.WHAT_IS_YOUR_RACE, "-- VERIFYING RACE --");
        softAssert.assertEquals(CommonUtils.getTextOfSelectedDropDownOption(nativeViewCHARMSParticipantDetailsPage.ethnicityDropDownOption), ras_Screener_TestDataManager.WHAT_IS_YOUR_ETHNICITY, "-- VERIFYING ETHNICITY --");
        softAssert.assertEquals(CommonUtils.getTextOfSelectedDropDownOption(nativeViewCHARMSParticipantDetailsPage.isParticipantAdoptedDropDown), ras_Screener_TestDataManager.ARE_YOU_ADOPTED_OPTION, "-- VERIFYING IF THE PARTICIPANT IS ADOPTED --");
        softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(nativeViewCHARMSParticipantDetailsPage.dateOfBirthTextBox), CommonUtils.convertDate(ras_Screener_TestDataManager.DATE_OF_BIRTH_OF_THE_PARTICIPANT), "-- VERIFYING DATE OF BIRTH --");
        CucumberLogUtils.logScreenshot();
        CucumberLogUtils.scenario.log("---- VERIFYING PROXY CONTACT INFORMATION DATA ----");
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantDetailsPage.proxyContactInfoTab);
        softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(nativeViewCHARMSParticipantDetailsPage.proxyFirstName), ras_Screener_TestDataManager.FIRST_NAME, "-- VERIFYING PROXY FIRST NAME --");
        softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(nativeViewCHARMSParticipantDetailsPage.proxyMiddleName).trim(), ras_Screener_TestDataManager.MIDDLE_INITIAL, "-- VERIFYING PROXY MIDDLE NAME --");
        softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(nativeViewCHARMSParticipantDetailsPage.proxyLastName).trim(), ras_Screener_TestDataManager.LAST_NAME, "-- VERIFYING PROXY LAST NAME --");
        softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(nativeViewCHARMSParticipantDetailsPage.proxyContactStreetAddress), ras_Screener_TestDataManager.STREET, "-- VERIFYING PROXY CONTACT STREET ADDRESS --");
        softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(nativeViewCHARMSParticipantDetailsPage.proxyContactStreetAddress2Optional), ras_Screener_TestDataManager.STREET2, "-- VERIFYING PROXY CONTACT STREET ADDRESS 2(OPTIONAL) --");
        softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(nativeViewCHARMSParticipantDetailsPage.proxyContactState), ras_Screener_TestDataManager.STATE, "-- VERIFYING PROXY CONTACT STATE --");
        softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(nativeViewCHARMSParticipantDetailsPage.proxyContactCity), ras_Screener_TestDataManager.CITY, "- VERIFYING PROXY CONTACT CITY --");
        softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(nativeViewCHARMSParticipantDetailsPage.proxyContactZipcode), ras_Screener_TestDataManager.ZIPCODE, "-- VERIFYING PROXY ZIP CODE --");
        softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(nativeViewCHARMSParticipantDetailsPage.proxyContactCountry), ras_Screener_TestDataManager.COUNTRY_OPTION, "-- VERIFYING PROXY CONTACT COUNTRY --");
        softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(nativeViewCHARMSParticipantDetailsPage.proxyContactEmailAddress), ras_Screener_TestDataManager.EMAIL_ADDRESS, "-- VERIFYING PROXY CONTACT EMAIL ADDRESS --");
        softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(nativeViewCHARMSParticipantDetailsPage.proxyContactHomePhone), ras_Screener_TestDataManager.HOME_PHONE_NUMBER, "-- VERIFYING PROXY CONTACT HOME PHONE --");
        softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(nativeViewCHARMSParticipantDetailsPage.proxyContactHomeCellphone), ras_Screener_TestDataManager.CELL_PHONE_NUMBER, "-- VERIFYING PROXY CONTACT CELL PHONE --");
        softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(nativeViewCHARMSParticipantDetailsPage.proxyContactWorkPhone), ras_Screener_TestDataManager.WORK_PHONE_NUMBER, "-- VERIFYING PROXY CONTACT WORK PHONE --");
        softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(nativeViewCHARMSParticipantDetailsPage.proxyContactPreferredPhone), ras_Screener_TestDataManager.CELL_PHONE_NUMBER, "-- VERIFYING PROXY PREFERRED PHONE --");
        CucumberLogUtils.logScreenshot();
        CucumberLogUtils.scenario.log("---- OPENING PARTICIPANT STUDIES RECORD ----");
        JavascriptUtils.scrollIntoView(nativeViewCHARMSParticipantDetailsPage.participantStudiesTab);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantDetailsPage.participantStudiesTab);
        CucumberLogUtils.logScreenshot();
        CommonUtils.sleep(500);
        JavascriptUtils.clickByJS(nativeViewCHARMSParticipantDetailsPage.participantStudiesPreviewButton);
        CucumberLogUtils.logScreenshot();
        CucumberLogUtils.scenario.log("---- NAVIGATING TO RAS SCREENER TABLE ----");
        CommonUtils.waitForClickability(nativeViewCHARMSDashboardPage.rasStudyOpenRecordButton);
        CommonUtils.clickOnElement(nativeViewCHARMSDashboardPage.rasStudyOpenRecordButton);
        CucumberLogUtils.logScreenshot();
        CommonUtils.waitForClickability(nativeViewCHARMSParticipantStudyPage.participantStudyScreenerInfoButton);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantStudyPage.participantStudyScreenerInfoButton);
        CommonUtils.sleep(800);
        CucumberLogUtils.scenario.log("---- VERIFYING RAS SCREENER PREVIEW RECORD DATA ----");
        softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(nativeViewCHARMSScreenerRecordTablePage.screenerPreviewProxyContactEmailAddressField), ras_Screener_TestDataManager.EMAIL_ADDRESS, "-- VERIFYING SCREENER PREVIEW RECORD CONTACT EMAIL ADDRESS FIELD --");
        softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(nativeViewCHARMSScreenerRecordTablePage.screenerPreviewStudyField), ras_Screener_Constants.RAS_STUDY, "-- VERIFYING SCREENER PREVIEW STUDY FIELD --");
        CucumberLogUtils.logScreenshot();
        CucumberLogUtils.scenario.log("---- NAVIGATING TO RAS SCREENER TABLE ----");
        CommonUtils.waitForClickability(nativeViewCHARMSDashboardPage.rasStudyOpenRecordButton);
        CommonUtils.clickOnElement(nativeViewCHARMSDashboardPage.rasStudyOpenRecordButton);
        CommonUtils.sleep(800);
        CucumberLogUtils.logScreenshot();
        CucumberLogUtils.scenario.log("---- VERIFYING SCREENER RECORD NAME AND CONTACT INFORMATION DATA ----");
        softAssert.assertEquals(CommonUtils.getTextOfSelectedDropDownOption(nativeViewCHARMSParticipantDetailsPage.vitalStatusYesDropDownOption), "Alive", "-- VERIFYING VITAL STATUS --");
        CommonUtils.clickOnElement(NativeViewCHARMSScreenerRecordTablePage.dynamicTabLocatorUsingExactText("Contact Information"));
        softAssert.assertEquals(CommonUtils.getTextOfSelectedDropDownOption(nativeViewCHARMSScreenerRecordTablePage.doesTheParticipantNeedLegalRepresentationDropdown), "Yes, minor under 18", "-- VERIFYING DOES THE PARTICIPANT NEED LEGAL REPRESENTATION? DROPDOWN --");
        softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(nativeViewCHARMSScreenerRecordTablePage.personWhoFilledTheScreenerField), ras_Screener_TestDataManager.FIRST_NAME + "  " + ras_Screener_TestDataManager.MIDDLE_INITIAL + "  " + ras_Screener_TestDataManager.LAST_NAME, "-- DOES THE PARTICIPANT NEED LEGAL REPRESENTATION? --");
        softAssert.assertEquals(CommonUtils.getTextOfSelectedDropDownOption(nativeViewCHARMSScreenerRecordTablePage.whatIsYourRelationshipToTheParticipantDropdown), "I am the person's parent", "-- WHAT IS YOUR RELATIONSHIP TO THE PARTICIPANT? DROPDOWN --");
        softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(nativeViewCHARMSScreenerRecordTablePage.ageCompletedField), String.valueOf(CharmsUtil.calculateAge(ras_Screener_TestDataManager.DATE_OF_BIRTH_OF_THE_PARTICIPANT)), "-- VERIFYING AGE COMPLETED FIELD --");
        softAssert.assertEquals(CommonUtils.getTextOfSelectedDropDownOption(nativeViewCHARMSScreenerRecordTablePage.vitalStatusDropdown), ras_Screener_TestDataManager.IS_THE_PARTICIPANT_ALIVE, "-- VERIFYING VITAL STATUS DROPDOWN --");
        softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(nativeViewCHARMSScreenerRecordTablePage.screenerStudyField), ras_Screener_Constants.RAS_STUDY, "-- VERIFYING STUDY FIELD --");
        softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(nativeViewCHARMSScreenerRecordTablePage.firstNameField), ras_Screener_TestDataManager.PARTICIPANT_FIRST_NAME, "-- VERIFYING FIRST NAME FIELD --");
        softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(nativeViewCHARMSScreenerRecordTablePage.middleNameField), ras_Screener_TestDataManager.PARTICIPANT_MIDDLE_INITIAL, "-- VERIFYING MIDDLE NAME FIELD --");
        softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(nativeViewCHARMSScreenerRecordTablePage.lastNameField), ras_Screener_TestDataManager.PARTICIPANT_LAST_NAME, "-- VERIFYING LAST NAME FIELD --");
        softAssert.assertEquals(CommonUtils.getTextOfSelectedDropDownOption(nativeViewCHARMSScreenerRecordTablePage.preferredContactDropDown), "Cell Phone", "-- VERIFYING PREFERRED CONTACT DROPDOWN --");
        softAssert.assertEquals(CommonUtils.getTextOfSelectedDropDownOption(nativeViewCHARMSScreenerRecordTablePage.whatIsYourRelationshipToThisPersonDropdown), "I am the person's parent", "-- WHAT IS YOUR RELATIONSHIP TO THIS PERSON? DROPDOWN --");
        softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(nativeViewCHARMSScreenerRecordTablePage.proxyFirstNameField).trim(), ras_Screener_TestDataManager.FIRST_NAME, "-- VERIFYING PROXY FIRST NAME FIELD --");
        softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(nativeViewCHARMSScreenerRecordTablePage.proxyMiddleNameField).trim(), ras_Screener_TestDataManager.MIDDLE_INITIAL, "-- VERIFYING PROXY LAST NAME FIELD --");
        softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(nativeViewCHARMSScreenerRecordTablePage.proxyLastNameField).trim(), ras_Screener_TestDataManager.LAST_NAME, "-- VERIFYING PROXY LAST NAME FIELD --");
        softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(nativeViewCHARMSScreenerRecordTablePage.proxyContactHomePhone), ras_Screener_TestDataManager.HOME_PHONE_NUMBER, "-- VERIFYING PROXY CONTACT HOME PHONE NUMBER --");
        softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(nativeViewCHARMSScreenerRecordTablePage.proxyContactHomeCellphone), ras_Screener_TestDataManager.CELL_PHONE_NUMBER, "-- VERIFYING PROXY CONTACT CELLPHONE NUMBER --");
        softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(nativeViewCHARMSScreenerRecordTablePage.proxyContactWorkPhone), ras_Screener_TestDataManager.WORK_PHONE_NUMBER, "-- VERIFYING PROXY CONTACT CELL PHONE NUMBER --");
        softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(nativeViewCHARMSScreenerRecordTablePage.proxyContactState), ras_Screener_TestDataManager.STATE, "-- VERIFYING STATE --");
        softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(nativeViewCHARMSScreenerRecordTablePage.proxyContactStreetAddress), ras_Screener_TestDataManager.STREET, "-- VERIFYING PROXY CONTACT STREET ADDRESS --");
        softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(nativeViewCHARMSScreenerRecordTablePage.proxyContactStreetAddress2Optional), ras_Screener_TestDataManager.STREET2, "-- VERIFYING PROXY CONTACT STREET ADDRESS 2(OPTIONAL) FIELD --");
        softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(nativeViewCHARMSScreenerRecordTablePage.proxyContactCity), ras_Screener_TestDataManager.CITY, "-- VERIFYING PROXY CONTACT CITY --");
        softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(nativeViewCHARMSScreenerRecordTablePage.proxyContactZipcode), ras_Screener_TestDataManager.ZIPCODE, "-- VERIFYING PROXY ZIP CODE --");
        softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(nativeViewCHARMSScreenerRecordTablePage.proxyContactEmailAddress), ras_Screener_TestDataManager.EMAIL_ADDRESS, "-- VERIFYING PROXY EMAIL ADDRESS FIELD --");
        CucumberLogUtils.logScreenshot();
        CucumberLogUtils.scenario.log("---- VERIFYING RAS SCREENER TABLE DEMOGRAPHICS INFORMATION DATA ----");
        CommonUtils.clickOnElement(nativeViewCHARMSScreenerRecordTablePage.dynamicLocatorForTabs("Demographics"));
        softAssert.assertEquals(nativeViewCHARMSScreenerRecordTablePage.demographicsParticipantRacePreferNotToAnswerOption.getText(), ras_Screener_TestDataManager.WHAT_IS_YOUR_RACE, "-- VERIFYING RACE OF PARTICIPANT --");
        softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(nativeViewCHARMSScreenerRecordTablePage.demographicsSexInput), ras_Screener_TestDataManager.WHAT_IS_THE_PARTICIPANTS_SEX, "-- VERIFYING SEX --");
        softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(nativeViewCHARMSScreenerRecordTablePage.demographicsDateOfBirthField), convertDOBToMMddyyyyFormat(ras_Screener_TestDataManager.DATE_OF_BIRTH_OF_THE_PARTICIPANT), "-- VERIFYING DATE OF BIRTH --");
        softAssert.assertEquals(CommonUtils.getTextOfSelectedDropDownOption(nativeViewCHARMSScreenerRecordTablePage.demographicsEthnicityDropDown), ras_Screener_TestDataManager.WHAT_IS_YOUR_ETHNICITY, "-- VERIFYING ETHNICITY --");
        CucumberLogUtils.logScreenshot();
        CucumberLogUtils.scenario.log("---- VERIFYING RAS SCREENER TABLE RASOPATHY HISTORY DATA ----");
        CommonUtils.clickOnElement(nativeViewCHARMSScreenerRecordTablePage.dynamicLocatorForTabs("RASopathy History"));
        CommonUtils.sleep(500);
        softAssert.assertEquals(CommonUtils.getTextOfSelectedDropDownOption(nativeViewCHARMSScreenerRecordTablePage.rasopathyHistoryHaveYouBeenDiagnosedWithARasopathyDropDown), ras_Screener_TestDataManager.HAVE_YOU_BEEN_DIAGNOSED_WITH_A_RASOPATHY, "-- VERIFYING IF PARTICIPANT HAS BEEN DIAGNOSED WITH A RASOPATHY --");
        softAssert.assertEquals(nativeViewCHARMSScreenerRecordTablePage.rasopathyHistoryNeverDiagnosedWithAnyOfTheseConditions.getText(), ras_Screener_TestDataManager.HAVE_YOU_BEEN_DIAGNOSED_WITH_FOLLOWING_CONDITIONS, "-- VERIFYING IF CANDIDATE HAS BEEN DIAGNOSED WITH ANY CONDITIONS --");
        softAssert.assertEquals(CommonUtils.getTextOfSelectedDropDownOption(nativeViewCHARMSScreenerRecordTablePage.rasopathyHistoryHaveAnyOfYourBiologicalRelativesBeenDiagnosedWithARasopathyDropDown), "No", "-- VERIFYING IF ANY OF BIOLOGICAL RELATIVES BEEN DIAGNOSED WITH A RASOPATHY --");
        CucumberLogUtils.logScreenshot();
        CucumberLogUtils.scenario.log("---- VERIFYING RAS SCREENER TABLE CANCER HISTORY ----");
        CommonUtils.clickOnElement(nativeViewCHARMSScreenerRecordTablePage.dynamicLocatorForTabs("Cancer History"));
        softAssert.assertEquals(CommonUtils.getTextOfSelectedDropDownOption(nativeViewCHARMSScreenerRecordTablePage.cancerHistoryHasAPhysicianEverDiagnosedParticipantWithCancerDropDown), ras_Screener_TestDataManager.HAVE_YOU_BEEN_DIAGNOSED_WITH_CANCER, "-- VERIFYING IF PARTICIPANT HAS BEEN DIAGNOSED WITH CANCER --");
        CucumberLogUtils.logScreenshot();
        CucumberLogUtils.scenario.log("---- VERIFYING RAS SCREENER TABLE GENETIC TESTING HISTORY ----");
        CommonUtils.clickOnElement(nativeViewCHARMSScreenerRecordTablePage.dynamicLocatorForTabs("Genetic Testing History"));
        softAssert.assertEquals(CommonUtils.getTextOfSelectedDropDownOption(nativeViewCHARMSScreenerRecordTablePage.geneticTestingHistoryHasTheParticipantEverHadGeneticTestingDropDown), ras_Screener_TestDataManager.HAVE_YOU_EVER_HAD_GENETIC_TESTING, "-- VERIFYING IF PARTICIPANT HAS HAD GENETIC TESTING --");
        softAssert.assertEquals(CommonUtils.getTextOfSelectedDropDownOption(nativeViewCHARMSScreenerRecordTablePage.doesTheParticipantHaveACopyOfGeneticTestResultsDropDown), "Not answered", "-- VERIFYING IF PARTICIPANT HAS A COPY OF GENETIC TEST RESULTS --");
        softAssert.assertEquals(CommonUtils.getTextOfSelectedDropDownOption(nativeViewCHARMSScreenerRecordTablePage.participantsPreferredMethodOfDeliveringGeneticTestResultsDropDown), "Not answered", "-- VERIFYING PARTICIPANT'S PREFERRED METHOD OF DELIVERING GENETIC TEST RESULTS --");
        CucumberLogUtils.logScreenshot();
        CucumberLogUtils.scenario.log("---- VERIFYING RAS SCREENER TABLE FINAL INFORMATION ----");
        CommonUtils.clickOnElement(nativeViewCHARMSScreenerRecordTablePage.dynamicLocatorForTabs("Final Information"));
        softAssert.assertEquals(CommonUtils.getTextOfSelectedDropDownOption(nativeViewCHARMSScreenerRecordTablePage.finalInformationHowDidYouHearAboutThisStudyDropDown), ras_Screener_TestDataManager.HOW_DID_YOU_HEAR_ABOUT_THIS_STUDY, "-- VERIFYING HOW DID PARTICIPANT HEAR ABOUT THE STUDY --");
        softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(nativeViewCHARMSScreenerRecordTablePage.finalInformationHowDidYouHearAboutThisStudyPleaseSpecifyTextBox), ras_Screener_TestDataManager.HOW_DID_YOU_HEAR_ABOUT_THIS_STUDY_OTHER_REASON, "-- VERIFYING HOW DID YOU PARTICIPANT HEAR ABOUT THE STUDY OTHER REASONS --");
        softAssert.assertEquals(CommonUtils.getTextOfSelectedDropDownOption(nativeViewCHARMSScreenerRecordTablePage.finalInformationHasParticipantOrAnyFamilyMemberParticipatedInAnyCancerStudyDropDown), "Not answered", "-- VERIFYING IF PARTICIPANT OR FAMILY MEMBER HAVE PARTICIPATED IN CANCER STUDY --");
        softAssert.assertEquals(nativeViewCHARMSScreenerRecordTablePage.finalInformationMainReasonsForParticipatingInThisStudyOtherOption.getText(), ras_Screener_TestDataManager.WHAT_ARE_MAIN_REASONS_FOR_PARTICIPATING_IN_STUDY, "-- VERIFYING MAIN REASONS FOR PARTICIPATING IN STUDY --");
        softAssert.assertEquals(nativeViewCHARMSScreenerRecordTablePage.finalInformationMainReasonsForParticipatingInThisStudyOtherReasonsField.getText(), ras_Screener_TestDataManager.WHAT_ARE_MAIN_REASONS_FOR_PARTICIPATING_IN_STUDY_OTHER_REASON, "-- VERIFYING MAIN REASONS FOR PARTICIPATING IN STUDY FIELD --");
        softAssert.assertEquals(CommonUtils.getTextOfSelectedDropDownOption(nativeViewCHARMSScreenerRecordTablePage.finalInformationAreYouAParticipantInAnyOtherResearchStudyOrRegistryGroupDropDown), "Not answered", "-- VERIFYING IF PARTICIPANT IS PART OF RESEARCH STUDY OR REGISTRY GROUP --");
        CucumberLogUtils.logScreenshot();
        ServiceNow_Common_Methods.logOutOfNativeView();
    }
}