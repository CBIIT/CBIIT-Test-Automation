package ServiceNow.CHARMS.StepsImplementation.RASStudy;

import Hooks.Hooks;
import ServiceNow.CHARMS.Constants.CHARMS_Data_File_Path_Constants;
import ServiceNow.CHARMS.Constants.CHARMSRASScreenerConstants;
import ServiceNow.CHARMS.Pages.MyRASHomePage;
import ServiceNow.CHARMS.Pages.NativeViewCHARMSDashboardPage;
import ServiceNow.CHARMS.Pages.RAS_Screener_Page;
import ServiceNow.CHARMS.Pages.ScreenerRecordTablePage;
import ServiceNow.COVIDDash.Utils.COVIDConstants;
import appsCommon.Pages.NativeView_SideDoor_Dashboard_Page;
import appsCommon.Utils.ServiceNow_Common_Methods;
import appsCommon.Utils.ServiceNow_Login_Methods;
import appsCommon.PageInitializers.PageInitializer;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import io.cucumber.messages.types.Hook;
import org.openqa.selenium.*;
import org.testng.Assert;
import static ServiceNow.CHARMS.Pages.RAS_Screener_Page.dynamicLocator;

public class RAS_Screener_Submissions_StepsImpl extends PageInitializer {
    /***
     * USE THIS METHOD TO CLICK ON SCREENER NEXT BUTTON
     */
    public void clickOnScreenerNextButton() {
        JavascriptUtils.scrollIntoView(rasopathyQuestionnairePage.studyNextButton);
        MiscUtils.sleep(1000);
        CommonUtils.clickOnElement(rasopathyQuestionnairePage.studyNextButton);
        MiscUtils.sleep(1000);
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
            rasScreenerSubmissions();
        } else if (sheetName.contentEquals("screenerScenario2")) {
            ras_Screener_TestDataManager.dataInitializerRasScreener(sheetName);
            rasScenario2StepsImpl.rasScreenerSubmissionScenario2();
        } else if (sheetName.contentEquals("screenerScenario3")) {
            ras_Screener_TestDataManager.dataInitializerRasScreener(sheetName);
            rasScenario3StepsImpl.rasScreenerSubmissionScenario3();
        } else if (sheetName.contentEquals("screenerScenario4")) {
            ras_Screener_TestDataManager.dataInitializerRasScreener(sheetName);
            rasScenario4StepsImpl.rasScreenerSubmissionScenario4();
        } else if (sheetName.contentEquals("screenerScenario5")) {
            ras_Screener_TestDataManager.dataInitializerRasScreener(sheetName);
            ras_scenario_five_stepsImpl.ras_screener_submission_five();
        }
    }

    public static void rasScreenerSubmissions() {
        CommonUtils.switchToNextWindow();
        MiscUtils.sleep(2000);
        CommonUtils.waitForVisibility(myRASSurveyPage.rasSurveyThisCopyText);
        //ASSERTING THAT THIS IS THE COPY FOR LOWER ENVIRONMENTS ONLY!!! MESSAGE DISPLAYS
        Assert.assertEquals(myRASSurveyPage.rasSurveyThisCopyText.getText(), ras_Screener_Constants.THIS_IS_A_COPY);
        CucumberLogUtils.logScreenshot();
        MiscUtils.sleep(2000);
        JavascriptUtils.scrollIntoView(rasopathyQuestionnairePage.studyNextButton);
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
        MiscUtils.sleep(2000);
        if (!rasopathyQuestionnairePage.iAmCompletingThisFormForMyselfOption.isDisplayed()) {
            ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
        }

        if (ras_Screener_TestDataManager.areYouCompletingThisFormForSomeoneElseOrYourself.contentEquals("I am completing this form for myself")) {
            CucumberLogUtils.scenario.log("* * * THIS IS A SELF SCREENER SUBMISSION * * *");
        } else if (ras_Screener_TestDataManager.areYouCompletingThisFormForSomeoneElseOrYourself.contentEquals("I am completing this form for someone else")) {
            CucumberLogUtils.scenario.log("* * * THIS IS A PROXY SCREENER SUBMISSION * * *");
        }

        for (int i = 0; i < 40; i++) {

            try {
                /**
                 * * * * * ARE YOU COMPLETING THIS FORM FOR SOMEONE ELSE OR FOR YOURSELF? * * * *
                 */
                if (rasopathyQuestionnairePage.question.isDisplayed() && rasopathyQuestionnairePage.question.getText().contentEquals("Are you completing this form for someone else or for yourself?")) {
                    CucumberLogUtils.scenario.log("* * * * ARE YOU COMPLETING THIS FORM FOR SOMEONE ELSE OR FOR YOURSELF? * * * *");
                    dynamicLocator(ras_Screener_TestDataManager.areYouCompletingThisFormForSomeoneElseOrYourself).click();
                    CucumberLogUtils.logScreenshot();
                    ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
                }
                /**
                 * * * * * WHAT IS YOUR NAME? * * * *
                 */
                else if (rasopathyQuestionnairePage.question.isDisplayed() && rasopathyQuestionnairePage.question.getText().contentEquals("What is your name?")) {
                    CucumberLogUtils.scenario.log("* * * * * ENTERING FIRST NAME, MIDDLE INITIAL, LAST NAME * * * * *");
                    rasopathyQuestionnairePage.dynamicTextBoxLocator(ras_Screener_Constants.FIRST_NAME).sendKeys(ras_Screener_TestDataManager.firstName);
                    rasopathyQuestionnairePage.dynamicTextBoxLocator(ras_Screener_Constants.MIDDLE_INITIAL).sendKeys(ras_Screener_TestDataManager.middleInitial);
                    rasopathyQuestionnairePage.dynamicTextBoxLocator(ras_Screener_Constants.LAST_NAME).sendKeys(ras_Screener_TestDataManager.lastName);
                    CucumberLogUtils.logScreenshot();
                    ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
                }
                /**
                 * * * * * THE NEXT SET OF QUESTIONS WILL COLLECT BASIC INFORMATION ABOUT YOU. * * * *
                 */
                else if (rasopathyQuestionnairePage.question.isDisplayed() && rasopathyQuestionnairePage.question.getText().contentEquals("The next set of questions will collect basic information about you.")) {
                    CucumberLogUtils.scenario.log("* * * * * THE NEXT SET OF QUESTIONS WILL COLLECT BASIC INFORMATION ABOUT YOU. * * * * *");
                    CucumberLogUtils.logScreenshot();
                    ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
                }
                /**
                 * * * * * WHAT IS YOUR DATE OF BIRTH? * * * *
                 */
                else if (rasopathyQuestionnairePage.question.isDisplayed() && rasopathyQuestionnairePage.question.getText().contentEquals("What is your date of birth?")) {
                    CucumberLogUtils.scenario.log("* * * * * WHAT IS YOUR DATE OF BIRTH? * * * * *");
                    CommonUtils.selectDropDownValue(ras_Screener_TestDataManager.dateOfBirthMonth, rasopathyQuestionnairePage.calendarMonthDropDown);
                    rasopathyQuestionnairePage.calendarYearTextBox.clear();
                    rasopathyQuestionnairePage.calendarYearTextBox.sendKeys(ras_Screener_TestDataManager.dateOfBirthYear);
                    RAS_Screener_Page.dynamicDateOfBirthCalendarLocator(ras_Screener_TestDataManager.whatIsYourDateOfBirth).click();
                    CucumberLogUtils.logScreenshot();
                    ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
                }
                /**
                 * * * * * WHAT WAS YOUR SEX ASSIGNED AT BIRTH? * * * *
                 */
                else if (rasopathyQuestionnairePage.question.isDisplayed() && rasopathyQuestionnairePage.question.getText().contentEquals("What was your sex assigned at birth?")) {
                    CucumberLogUtils.scenario.log("* * * * * WHAT WAS YOUR SEX ASSIGNED AT BIRTH? * * * * *");
                    dynamicLocator(ras_Screener_TestDataManager.sexAssignedAtBirthOption).click();
                    CucumberLogUtils.logScreenshot();
                    ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
                }
                /**
                 * * * * * ARE YOU ADOPTED? * * * *
                 */
                else if (rasopathyQuestionnairePage.question.isDisplayed() && rasopathyQuestionnairePage.question.getText().contentEquals("Are you adopted?")) {
                    CucumberLogUtils.scenario.log("* * * * * ARE YOU ADOPTED? * * * * *");
                    dynamicLocator(ras_Screener_TestDataManager.areYouAdoptedOption).click();
                    CucumberLogUtils.logScreenshot();
                    ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
                }
                /**
                 * * * * * IN WHICH COUNTRY DO YOU CURRENTLY LIVE? * * * *
                 */
                else if (rasopathyQuestionnairePage.question.isDisplayed() && rasopathyQuestionnairePage.question.getText().contentEquals("In which country do you currently live?")) {
                    CucumberLogUtils.scenario.log("* * * * * IN WHICH COUNTRY DO YOU CURRENTLY LIVE? * * * * *");
                    CommonUtils.selectDropDownValue(ras_Screener_TestDataManager.countryOption, rasopathyQuestionnairePage.whatCountryDoesParticipantCurrentlyLiveInDropDown);
                    CucumberLogUtils.logScreenshot();
                    ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
                }
                /**
                 * * * * * PLEASE PROVIDE THE MAILING ADDRESS WHERE STUDY MATERIALS CAN BE SENT, AS NEEDED. * * * *
                 */
                else if (rasopathyQuestionnairePage.question.isDisplayed() && rasopathyQuestionnairePage.question.getText().contentEquals("Please provide the mailing address where study materials can be sent, as needed.")) {
                    CucumberLogUtils.scenario.log("* * * * * PLEASE PROVIDE THE MAILING ADDRESS WHERE STUDY MATERIALS CAN BE SENT, AS NEEDED. * * * * *");
                    rasopathyQuestionnairePage.dynamicTextBoxLocator(ras_Screener_Constants.STREET_ADDRESS).sendKeys(ras_Screener_TestDataManager.street);
                    rasopathyQuestionnairePage.dynamicTextBoxLocator(ras_Screener_Constants.STREET_2_ADDRESS).sendKeys(ras_Screener_TestDataManager.street2);
                    rasopathyQuestionnairePage.dynamicTextBoxLocator(ras_Screener_Constants.CITY_TEXT).sendKeys(ras_Screener_TestDataManager.city);
                    rasopathyQuestionnairePage.dynamicTextBoxLocator(ras_Screener_Constants.STATE_TEXT).sendKeys(ras_Screener_TestDataManager.state);
                    rasopathyQuestionnairePage.dynamicTextBoxLocator(ras_Screener_Constants.ZIP_CODE_TEXT).sendKeys(ras_Screener_TestDataManager.zipcode);
                    CucumberLogUtils.logScreenshot();
                    ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
                }
                /**
                 * * * * * WHAT IS YOUR EMAIL ADDRESS? * * * *
                 */
                else if (rasopathyQuestionnairePage.question.isDisplayed() && rasopathyQuestionnairePage.question.getText().contentEquals("What is your email address?")) {
                    CucumberLogUtils.scenario.log("* * * * * WHAT IS YOUR EMAIL ADDRESS? * * * * *");
                    rasopathyQuestionnairePage.dynamicEmailAddressTextBox(ras_Screener_Constants.EMAIL_ADDRESS).sendKeys(ras_Screener_TestDataManager.emailAddress);
                    CucumberLogUtils.logScreenshot();
                    ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
                }
                /**
                 * * * * * PLEASE CONFIRM YOUR EMAIL ADDRESS * * * *
                 */
                else if (rasopathyQuestionnairePage.question.isDisplayed() && rasopathyQuestionnairePage.question.getText().contentEquals("Please confirm your email address")) {
                    CucumberLogUtils.scenario.log("* * * * * PLEASE CONFIRM YOUR EMAIL ADDRESS * * * * *");
                    rasopathyQuestionnairePage.dynamicEmailAddressTextBox(ras_Screener_Constants.CONFIRM_EMAIL_ADDRESS).sendKeys(ras_Screener_TestDataManager.emailAddressConfirm);
                    CucumberLogUtils.logScreenshot();
                    ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
                }
                /**
                 * * * * * PLEASE LIST YOUR PHONE NUMBERS BELOW.  PLEASE ALSO SELECT YOUR PREFERRED CONTACT NUMBER.  * * * *
                 */
                else if (rasopathyQuestionnairePage.question.isDisplayed() && rasopathyQuestionnairePage.question.getText().contentEquals("Please list your phone numbers below.  Please also select your preferred contact number. ")) {
                    CucumberLogUtils.scenario.log("* * * * * PLEASE LIST YOUR PHONE NUMBERS BELOW.  PLEASE ALSO SELECT YOUR PREFERRED CONTACT NUMBER.  * * * * *");
                    rasopathyQuestionnairePage.dynamicTextBoxLocatorForPhoneNumbers(ras_Screener_Constants.HOME_PHONE_NUMBER).sendKeys(ras_Screener_TestDataManager.homePhoneNumber);
                    rasopathyQuestionnairePage.dynamicTextBoxLocatorForPhoneNumbers(ras_Screener_Constants.CELL_PHONE_NUMBER).sendKeys(ras_Screener_TestDataManager.cellPhoneNumber);
                    rasopathyQuestionnairePage.dynamicTextBoxLocatorForPhoneNumbers(ras_Screener_Constants.WORK_PHONE_NUMBER).sendKeys(ras_Screener_TestDataManager.workPhoneNumber);
                    rasopathyQuestionnairePage.dynamicPhoneNumberCheckBox(ras_Screener_Constants.CELL_PHONE_NUMBER).click();
                    CucumberLogUtils.logScreenshot();
                    ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
                }
                /**
                 * * * * * WHAT IS YOUR ETHNICITY?  * * * *
                 */
                else if (rasopathyQuestionnairePage.question.isDisplayed() && rasopathyQuestionnairePage.question.getText().contentEquals("What is your ethnicity?")) {
                    CucumberLogUtils.scenario.log("* * * * * WHAT IS YOUR ETHNICITY?  * * * * *");
                    dynamicLocator(ras_Screener_TestDataManager.whatIsYourEthnicity).click();
                    CucumberLogUtils.logScreenshot();
                    ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
                }
                /**
                 * * * * * WHAT IS YOUR RACE? PLEASE SELECT ALL THAT APPLY.  * * * *
                 */
                else if (rasopathyQuestionnairePage.question.isDisplayed() && rasopathyQuestionnairePage.question.getText().contentEquals("What is your race? Please select all that apply.")) {
                    CucumberLogUtils.scenario.log("* * * * * WHAT IS YOUR RACE? PLEASE SELECT ALL THAT APPLY.  * * * * *");
                    dynamicLocator(ras_Screener_TestDataManager.whatIsYourRace).click();
                    CucumberLogUtils.logScreenshot();
                    ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
                }
                /**
                 * * * * * ARE YOU A PARTICIPANT IN ANY OTHER RESEARCH STUDY OR REGISTRY GROUP?  PLEASE SPECIFY.  * * * *
                 */
                else if (rasopathyQuestionnairePage.question.isDisplayed() && rasopathyQuestionnairePage.question.getText().contentEquals("Are you a participant in any other research study or registry group?  Please specify.")) {
                    CucumberLogUtils.scenario.log("* * * * * ARE YOU A PARTICIPANT IN ANY OTHER RESEARCH STUDY OR REGISTRY GROUP?  PLEASE SPECIFY.  * * * * *");
                    dynamicLocator(ras_Screener_TestDataManager.areYouAParticipantInOtherStudyGroup).click();
                    CucumberLogUtils.logScreenshot();
                    ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
                }
                /**
                 * * * * * TO DETERMINE ELIGIBILITY FOR THIS STUDY, WE NEED TO COLLECT INFORMATION ABOUT MEDICAL DIAGNOSES.  THESE QUESTIONS ASK ABOUT GENERAL MEDICAL CONDITIONS, CANCER AND ANY PRIOR DIAGNOSIS OF A RASOPATHY.  PLEASE COMPLETE THIS INFORMATION TO THE BEST OF YOUR KNOWLEDGE.   * * * *
                 */
                else if (rasopathyQuestionnairePage.question.isDisplayed() && rasopathyQuestionnairePage.question.getText().contentEquals("To determine eligibility for this study, we need to collect information about medical diagnoses.  These questions ask about general medical conditions, cancer and any prior diagnosis of a RASopathy.  Please complete this information to the best of your knowledge. ")) {
                    CucumberLogUtils.scenario.log("* * * * * TO DETERMINE ELIGIBILITY FOR THIS STUDY, WE NEED TO COLLECT INFORMATION ABOUT MEDICAL DIAGNOSES.  THESE QUESTIONS ASK ABOUT GENERAL MEDICAL CONDITIONS, CANCER AND ANY PRIOR DIAGNOSIS OF A RASOPATHY.  PLEASE COMPLETE THIS INFORMATION TO THE BEST OF YOUR KNOWLEDGE.  * * * * *");
                    CucumberLogUtils.logScreenshot();
                    ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
                }
                /**
                 * * * * * HAVE YOU EVER BEEN DIAGNOSED WITH THE FOLLOWING CONDITIONS?  SELECT ALL THAT APPLY.  IF YOU DO NOT SEE THE EXACT CONDITION DIAGNOSED, PLEASE SELECT THE CLOSEST ANSWER.   * * * *
                 */
                else if (rasopathyQuestionnairePage.question.isDisplayed() && rasopathyQuestionnairePage.question.getText().contentEquals("Have you ever been diagnosed with the following conditions?  Select all that apply.  If you do not see the exact condition diagnosed, please select the closest answer.")) {
                    CucumberLogUtils.scenario.log("* * * * * HAVE YOU EVER BEEN DIAGNOSED WITH THE FOLLOWING CONDITIONS?  SELECT ALL THAT APPLY.  IF YOU DO NOT SEE THE EXACT CONDITION DIAGNOSED, PLEASE SELECT THE CLOSEST ANSWER.   * * * * *");
                    dynamicLocator(ras_Screener_TestDataManager.haveYouBeenDiagnosedWithFollowingConditions).click();
                    CucumberLogUtils.logScreenshot();
                    ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
                }
                /**
                 * * * * * HAVE YOU EVER BEEN DIAGNOSED WITH CANCER? * * * *
                 */
                else if (rasopathyQuestionnairePage.question.isDisplayed() && rasopathyQuestionnairePage.question.getText().contentEquals("Have you ever been diagnosed with cancer?")) {
                    CucumberLogUtils.scenario.log("* * * * * HAVE YOU EVER BEEN DIAGNOSED WITH CANCER? * * * * *");
                    dynamicLocator(ras_Screener_TestDataManager.haveYouBeenDiagnosedWithCancer).click();
                    CucumberLogUtils.logScreenshot();
                    ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
                }
                /**
                 * * * * * HAVE YOU BEEN DIAGNOSED WITH A RASOPATHY SUCH AS NOONAN SYNDROME, NOONAN SYNDROME WITH MULTIPLE LENTIGINES, COSTELLO SYNDROME, CARDIOFACIOCUTANEOUS SYNDROME, LEGIUS SYNDROME, CAPILLARY ARTERIOVENOUS MALFORMATION SYNDROME, HEREDITARY GINGIVAL FIBROMATOSIS OR SYNGAP1 SYNDROME? * * * *
                 */
                else if (rasopathyQuestionnairePage.question.isDisplayed() && rasopathyQuestionnairePage.question.getText().contentEquals("Have you been diagnosed with a RASopathy such as Noonan syndrome, Noonan syndrome with multiple lentigines, Costello syndrome, cardiofaciocutaneous syndrome, Legius syndrome, capillary arteriovenous malformation syndrome, hereditary gingival fibromatosis or SYNGAP1 syndrome?")) {
                    CucumberLogUtils.scenario.log("* * * * * HAVE YOU BEEN DIAGNOSED WITH A RASOPATHY SUCH AS NOONAN SYNDROME, NOONAN SYNDROME WITH MULTIPLE LENTIGINES, COSTELLO SYNDROME, CARDIOFACIOCUTANEOUS SYNDROME, LEGIUS SYNDROME, CAPILLARY ARTERIOVENOUS MALFORMATION SYNDROME, HEREDITARY GINGIVAL FIBROMATOSIS OR SYNGAP1 SYNDROME? * * * * *");
                    dynamicLocator(ras_Screener_TestDataManager.haveYouBeenDiagnosedWithARasopathy).click();
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
                else if (rasopathyQuestionnairePage.question.isDisplayed() && rasopathyQuestionnairePage.question.getText().contentEquals(" Have any of your biological relatives been diagnosed with a RASopathy?")) {
                    CucumberLogUtils.scenario.log("* * * * * HAVE ANY OF YOUR BIOLOGICAL RELATIVES BEEN DIAGNOSED WITH A RASOPATHY? * * * * *");
                    dynamicLocator(ras_Screener_TestDataManager.haveAnyOfYourBiologicalRelativesBeenDiagnosedWithARasopathy).click();
                    CucumberLogUtils.logScreenshot();
                    ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
                }
                /**
                 * * * * *
                 * HAVE YOU EVER HAD GENETIC TESTING? * * * *
                 */
                else if (rasopathyQuestionnairePage.question.isDisplayed() && rasopathyQuestionnairePage.question.getText().contentEquals("Have you ever had genetic testing?")) {
                    CucumberLogUtils.scenario.log("* * * * * HAVE YOU EVER HAD GENETIC TESTING? * * * * *");
                    dynamicLocator(ras_Screener_TestDataManager.haveYouEverHadGeneticTesting).click();
                    CucumberLogUtils.logScreenshot();
                    ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
                }
                /**
                 * * * * * WE WILL NOW ASK A FEW REMAINING QUESTIONS REGARDING THIS STUDY. * * * *
                 */
                else if (rasopathyQuestionnairePage.question.isDisplayed() && rasopathyQuestionnairePage.question.getText().contentEquals("We will now ask a few remaining questions regarding this study.")) {
                    CucumberLogUtils.scenario.log("* * * * * WE WILL NOW ASK A FEW REMAINING QUESTIONS REGARDING THIS STUDY. * * * * *");
                    CucumberLogUtils.logScreenshot();
                    ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
                }
                /**
                 * * * * * HOW DID YOU HEAR ABOUT THIS STUDY?  IF A SPECIFIC HEALTH CARE PROVIDER REFERRED YOU TO THIS STUDY, PLEASE INCLUDE THEIR NAME IN THE CORRESPONDING TEXT BOX. * * * *
                 */
                else if (rasopathyQuestionnairePage.question.isDisplayed() && rasopathyQuestionnairePage.question.getText().contentEquals("How did you hear about this study?  If a specific health care provider referred you to this study, please include their name in the corresponding text box.")) {
                    CucumberLogUtils.scenario.log("* * * * * HOW DID YOU HEAR ABOUT THIS STUDY?  IF A SPECIFIC HEALTH CARE PROVIDER REFERRED YOU TO THIS STUDY, PLEASE INCLUDE THEIR NAME IN THE CORRESPONDING TEXT BOX. * * * * *");
                    CommonUtils.scrollIntoView(dynamicLocator(ras_Screener_TestDataManager.howDidYouHearAboutThisStudy));
                    dynamicLocator(ras_Screener_TestDataManager.howDidYouHearAboutThisStudy);
                    rasopathyQuestionnairePage.dynamicLocatorForHowDidYouHearAboutStudyTextBoxes(ras_Screener_TestDataManager.howDidYouHearAboutThisStudy).sendKeys(ras_Screener_TestDataManager.howDidYouHearAboutThisStudyOtherReason);
                    CucumberLogUtils.logScreenshot();
                    ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
                }
                /**
                 * * * * * HAVE YOU OR OTHER FAMILY MEMBERS EVER PARTICIPATED IN ANOTHER STUDY ON RASOPATHY AT ANOTHER MEDICAL INSTITUTION, UNIVERSITY, GOVERNMENT AGENCY OR OTHER SITE? * * * *
                 */
                else if (rasopathyQuestionnairePage.question.isDisplayed() && rasopathyQuestionnairePage.question.getText().contentEquals("Have you or other family members ever participated in another study on RASopathy at another medical institution, university, government agency or other site?")) {
                    CucumberLogUtils.scenario.log("* * * * * HAVE YOU OR OTHER FAMILY MEMBERS EVER PARTICIPATED IN ANOTHER STUDY ON RASOPATHY AT ANOTHER MEDICAL INSTITUTION, UNIVERSITY, GOVERNMENT AGENCY OR OTHER SITE? * * * * *");
                    dynamicLocator(ras_Screener_TestDataManager.haveYouOrOtherFamilyMembersParticipatedInOtherStudy).click();
                    CucumberLogUtils.logScreenshot();
                    ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
                }
                /**
                 * * * * * WHAT ARE THE MAIN REASONS FOR PARTICIPATING IN THIS STUDY?  SELECT ALL THAT APPLY.  PLEASE ELABORATE ON THE REASON IN THE CORRESPONDING TEXTBOX. * * * *
                 */
                else if (rasopathyQuestionnairePage.question.isDisplayed() && rasopathyQuestionnairePage.question.getText().contentEquals("What are the main reasons for participating in this study?  Select all that apply.  Please elaborate on the reason in the corresponding textbox.")) {
                    CucumberLogUtils.scenario.log("* * * * * WHAT ARE THE MAIN REASONS FOR PARTICIPATING IN THIS STUDY?  SELECT ALL THAT APPLY.  PLEASE ELABORATE ON THE REASON IN THE CORRESPONDING TEXTBOX. * * * * *");
                    CommonUtils.scrollIntoView(dynamicLocator(ras_Screener_TestDataManager.whatAreMainReasonsForParticipatingInStudy));
                    dynamicLocator(ras_Screener_TestDataManager.whatAreMainReasonsForParticipatingInStudy).click();
                    rasopathyQuestionnairePage.dynamicLocatorForMainReasonForParticipatingInStudy(ras_Screener_TestDataManager.whatAreMainReasonsForParticipatingInStudy).sendKeys(ras_Screener_TestDataManager.whatAreMainReasonsForParticipatingInStudyOtherReason);
                    CucumberLogUtils.logScreenshot();
                    ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
                }
                /**
                 * * * * * YOU ARE ALMOST DONE! * * * *
                 */
                else if (rasopathyQuestionnairePage.question.isDisplayed() && rasopathyQuestionnairePage.question.getText().contains("You are almost done!")) {
                    CucumberLogUtils.scenario.log("* * * * * YOU ARE ALMOST DONE! * * * * *");
                    ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
                    MiscUtils.sleep(3000);
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
        if (sheetName.contentEquals("screenerScenario1")) {
            ras_Screener_TestDataManager.dataInitializerRasScreener(sheetName);
            ras_screenerSubmissions_stepsImpl.verifying_RAS_Screener_Scenario_1_Data(sheetName);
        }
    }

    /***
     * THIS METHOD WILL SELECT THE CONSENT FLOW ACCORDING TO THE SHEET CHOSEN IN THE FEATURE FILE
     */
    public void rasConsentScenarioSelector(String sheetName) {
        MiscUtils.sleep(20000);
        ras_Screener_TestDataManager.dataInitializerRasScreener(sheetName);
        ras_screenerSubmissions_stepsImpl.nativeViewConsentFlowProcessScenario1(sheetName);
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

        MiscUtils.sleep(1000);
        CommonUtils.waitForVisibility(myRASLoginPage.loginToMyRASButton);
        CommonUtils.clickOnElement(myRASLoginPage.loginToMyRASButton);

        try {
            oktaLoginPage.usernameTxtBox.clear();
            oktaLoginPage.usernameTxtBox.sendKeys(username);
            CommonUtils.clickOnElement(oktaLoginPage.nextButton);
            MiscUtils.sleep(1000);
            oktaLoginPage.passwordTxtBox.sendKeys(password);
            MiscUtils.sleep(1000);
            CommonUtils.clickOnElement(oktaLoginPage.loginBtn);
            MiscUtils.sleep(2000);
            CommonUtils.waitForVisibility(myRASHomePage.warningAgreeButton);
            CucumberLogUtils.logScreenshot();
            myRASHomePage.warningAgreeButton.click();
        } catch (NoSuchElementException e) {
            CommonUtils.sendKeysToElement(oktaLoginPage.passwordTxtBox, password);
            MiscUtils.sleep(1000);
            CommonUtils.clickOnElement(oktaLoginPage.loginBtn);
            MiscUtils.sleep(2000);
            CommonUtils.waitForVisibility(myRASHomePage.warningAgreeButton);
            CucumberLogUtils.logScreenshot();
            myRASHomePage.warningAgreeButton.click();
        }
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
        MiscUtils.sleep(30000);
        CucumberLogUtils.logScreenshot();
        CommonUtils.waitForClickability(myRASHomePage.rasoptathyRasSurveyCloseButton);
        CommonUtils.clickOnElement(myRASHomePage.rasoptathyRasSurveyCloseButton);
        CommonUtils.waitForVisibility(myRASHomePage.rasoptathyRasSurveyButton);
        CucumberLogUtils.logScreenshot();
        MiscUtils.sleep(5000);
        CommonUtils.clickOnElement(myRASHomePage.rasoptathyRasSurveyButton);
        CommonUtils.waitForClickability(myRASHomePage.rasoptathyRasSurveyGoButton);
        MiscUtils.sleep(5000);
    }

    /***
     * USE THIS METHOD TO CLICK ON RAS IIQ FORM
     */
    public void clicksOnTheIiqForm() {
        CommonUtils.waitForVisibility(myRASHomePage.rasoptathyIiqButton);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(myRASHomePage.rasoptathyIiqButton);
        MiscUtils.sleep(30000);
        CucumberLogUtils.logScreenshot();
        CommonUtils.waitForClickability(myRASHomePage.rasoptathyRasSurveyCloseButton);
        CommonUtils.clickOnElement(myRASHomePage.rasoptathyRasSurveyCloseButton);
        CommonUtils.waitForVisibility(myRASHomePage.rasoptathyIiqButton);
        CucumberLogUtils.logScreenshot();
        MiscUtils.sleep(5000);
        CommonUtils.clickOnElement(myRASHomePage.rasoptathyIiqButton);
        CommonUtils.waitForClickability(myRASHomePage.rasoptathyRasSurveyGoButton);
        MiscUtils.sleep(5000);
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
        MiscUtils.sleep(3000);
        CommonUtils.waitForVisibility(rasopathyQuestionnairePage.dynamicTextBoxLocator("Email"));
        rasopathyQuestionnairePage.dynamicTextBoxLocator("Email").sendKeys(email);
        rasopathyQuestionnairePage.pinTextBox.sendKeys(pin);
        CucumberLogUtils.logScreenshot();
        MiscUtils.sleep(3000);
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        MiscUtils.sleep(3000);
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
        MiscUtils.sleep(3000);
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        MiscUtils.sleep(3000);
        CucumberLogUtils.logScreenshot();
    }

    /***
     * USE THIS METHOD TO REWIND THE SURVEY FORM
     */
    public void theParticipantWillBeAbleToRewindTheForm() {
        MiscUtils.sleep(2000);
        while (rasopathyQuestionnairePage.rasSurveyPreviousButton.isDisplayed()) {
            ras_screenerSubmissions_stepsImpl.clickOnSurveyPreviousButton();
        }
    }

    /***
     * USE THIS METHOD FOR NATIVE VIEW CONSENT FLOW PROCESS SCENARIO 1
     */
    public void nativeViewConsentFlowProcessScenario1(String sheetName) {
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        MiscUtils.sleep(2000);
        NativeView_SideDoor_Dashboard_Page.filterNavigatorTextBox.sendKeys("All Participant Details");
        MiscUtils.sleep(3000);
        CommonUtils.clickOnElement(NativeView_SideDoor_Dashboard_Page.allParticipantDetailsLink);
        MiscUtils.sleep(3000);
        CommonUtils.switchToFrame(NativeView_SideDoor_Dashboard_Page.nativeViewiFrame);
        MiscUtils.sleep(2000);
        CucumberLogUtils.logScreenshot();
        if (sheetName.contentEquals("screenerScenario1")) {
            CommonUtils.hoverOverElement(participantDetailsPage.dynamicRecordButtonLocator(ras_Screener_TestDataManager.firstName + " " + ras_Screener_TestDataManager.lastName));
            CucumberLogUtils.logScreenshot();
            CommonUtils.clickOnElement(NativeViewCHARMSDashboardPage.nativeViewnewScreenerReceivedLocator(ras_Screener_TestDataManager.firstName + " " + ras_Screener_TestDataManager.lastName));
        } else if (sheetName.contentEquals("screenerScenario2")) {
            CommonUtils.hoverOverElement(participantDetailsPage.dynamicRecordButtonLocator(ras_Screener_TestDataManager.firstName + " " + ras_Screener_TestDataManager.lastName));
            CucumberLogUtils.logScreenshot();
            CommonUtils.clickOnElement(NativeViewCHARMSDashboardPage.nativeViewnewScreenerReceivedLocator(ras_Screener_TestDataManager.firstName + " " + ras_Screener_TestDataManager.lastName));
        } else if (sheetName.contentEquals("screenerScenario3")) {
            CommonUtils.hoverOverElement(participantDetailsPage.dynamicRecordButtonLocator(ras_Screener_TestDataManager.whatIsTheNameOfThePersonWhoMayBeEligibleForThisStudyFirst + " " + ras_Screener_TestDataManager.whatIsTheNameOfThePersonWhoMayBeEligibleForThisStudyLast));
            CucumberLogUtils.logScreenshot();
            CommonUtils.clickOnElement(NativeViewCHARMSDashboardPage.nativeViewnewScreenerReceivedLocator(ras_Screener_TestDataManager.whatIsTheNameOfThePersonWhoMayBeEligibleForThisStudyFirst + " " + ras_Screener_TestDataManager.whatIsTheNameOfThePersonWhoMayBeEligibleForThisStudyLast));
        } else if (sheetName.contentEquals("screenerScenario4")) {
            CommonUtils.hoverOverElement(participantDetailsPage.dynamicRecordButtonLocator(ras_Screener_TestDataManager.whatIsTheNameOfThePersonWhoMayBeEligibleForThisStudyFirst + " " + ras_Screener_TestDataManager.whatIsTheNameOfThePersonWhoMayBeEligibleForThisStudyLast));
            CucumberLogUtils.logScreenshot();
            CommonUtils.clickOnElement(NativeViewCHARMSDashboardPage.nativeViewnewScreenerReceivedLocator(ras_Screener_TestDataManager.whatIsTheNameOfThePersonWhoMayBeEligibleForThisStudyFirst + " " + ras_Screener_TestDataManager.whatIsTheNameOfThePersonWhoMayBeEligibleForThisStudyLast));
        }
        MiscUtils.sleep(1000);
        if (CommonUtils.isElementDisplayed(nativeViewCHARMSDashboardPage.rasStudyOpenRecordButton)) {
            CucumberLogUtils.logScreenshot();
            CommonUtils.clickOnElement(nativeViewCHARMSDashboardPage.rasStudyOpenRecordButton);
        }
        MiscUtils.sleep(2000);

        MiscUtils.sleep(2000);
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsSubmitForEligibilityButton);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsSubmitForEligibilityButton);


        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsMarkEligibleButton);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsMarkEligibleButton);
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsConsentAddedText);
        CucumberLogUtils.logScreenshot();
        CommonUtils.assertEqualsWithMessage(nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsConsentAddedText.getText(), CHARMSRASScreenerConstants.CONSENT_ADDED_TEXT, "---- VERIFYING SCREENER RECORD RASOPATHY HISTORY DATA ----");
        /* BEGINNING: CONSENT FLOW PROCESS */

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

        //CommonUtils.waitForClickability(nativeViewCHARMSParticipantDetailsPage.nativeSubjectFlagButton);
//        CommonUtils.clickOnElement(nativeViewCHARMSParticipantDetailsPage.nativeSubjectFlagButton);
//        MiscUtils.sleep(2000);
//        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantConsentPage.rasStudyNonParticipantDateButton);
//        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyNonParticipantDateButton);
//        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeTodayButton);
//        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeTodayButton);

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
        CommonUtils.selectDropDownValue(nativeViewCHARMSParticipantConsentPage.rasStudyConsentResponseTypeDropDown, 2);
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
        MiscUtils.sleep(1000);
        CommonUtils.waitForClickability(nativeViewCHARMSParticipantConsentPage.rasStudyConsentAddFileButton);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentAddFileButton);
        CucumberLogUtils.logScreenshot();
        MiscUtils.sleep(5000);
        JavascriptUtils.uploadFileToHiddenFieldWithInputTag(nativeViewCHARMSParticipantConsentPage.rasStudyConsentChoseFileButton, COVIDConstants.IIQ_STUDY_DOCUMENTATION_PDF_PATH);
        MiscUtils.sleep(2000);
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
        MiscUtils.sleep(500);
        CucumberLogUtils.logScreenshot();
        ServiceNow_Common_Methods.logOutOfNativeView();
    }

    /***
     * USE THIS METHOD WILL COMPLETE THE IIQ FORM SCENARIO 1
     */
    public void rasScreenerIIQFormScenario1() {
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(14));
        CommonUtils.assertEqualsWithMessage(iiq_TestDataManager.thisIsACopyForLowerEnvironmentsText, myRASSurveyPage.dynamicTopText(14).getText(), "-- VERIFYING THIS IS THE COPY FOR LOWER ENVIRONMENTS TEXT --");
        ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(16));
        CommonUtils.assertEqualsWithMessage(iiq_TestDataManager.someOfThisInformationText, myRASSurveyPage.dynamicTopText(16).getText(), "-- VERIFYING SOME OF THIS INFORMATION TEXT --");
        ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(35));
        CommonUtils.assertEqualsWithMessage(iiq_TestDataManager.thisFirstSectionOfTheQuestionnaireText, myRASSurveyPage.dynamicTopText(35).getText(), "-- VERIFYING THIS FIRST QUESTION OF THE QUESTIONNAIRE TEXT --");
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
            MiscUtils.sleep(1000);
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
        MiscUtils.sleep(1000);
        CommonUtils.clickOnElement(rasopathyQuestionnairePage.iiqWereYouRaisedNoOption);
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
        if (!rasopathyQuestionnairePage.calendarYearTextBox.isDisplayed()) {
            CommonUtils.clickOnElement(rasopathyQuestionnairePage.iiqWereYouRaisedNoOption);
            ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
        }
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
        MiscUtils.sleep(2000);
        CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicClickOnCheckboxesIiqTable(1, 4));
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
        try {
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(29));
            MiscUtils.sleep(500);
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
            MiscUtils.sleep(1000);
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
        CommonUtils.assertEqualsWithMessage(iiq_Constants.THIS_SECTION_ASKS_YOU_TEXT, myRASIIQFormPage.screenerIiqFormThisSectionAsksDetailedMedicalHistoryText.getText(), "-- VERIFYING THIS SECTION ASKS DETAILED MEDICAL HISTORY TEXT --");
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
        MiscUtils.sleep(1000);
        CommonUtils.clickOnElement(dynamicLocator(iiq_TestDataManager.wereYouATwinRadioButton));
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
        if (!myRASSurveyPage.dynamicTopText(41).isDisplayed()) {
            CommonUtils.clickOnElement(dynamicLocator(iiq_TestDataManager.wereYouATwinRadioButton));
            CucumberLogUtils.logScreenshot();
            ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
        }

        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(41));
        MiscUtils.sleep(1000);
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
        MiscUtils.sleep(3000);
        CommonUtils.selectDropDownValue(iiq_TestDataManager.pleaseFillOutBirtWeightUnitDropDown, myRASIIQFormPage.screenerIiqFormFillOutBirthWeightUnitDropDown);
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
        CommonUtils.waitForVisibility(myRASIIQFormPage.screenerIiqFormFillOutBirthLenghtHeadNumeticTextBox);
        CommonUtils.sendKeysToElement(myRASIIQFormPage.screenerIiqFormFillOutBirthLenghtHeadNumeticTextBox, iiq_TestDataManager.pleaseFillOutHeadNumericTextBox);
        CommonUtils.sendKeysToElement(myRASIIQFormPage.screenerIiqFormFillOutBirthLenghtHeadCircumferenceNumeticTextBox, iiq_TestDataManager.pleaseFillOutHeadCircumferenceNumericTextBox);
        MiscUtils.sleep(3000);
        CommonUtils.selectDropDownValue(iiq_TestDataManager.pleaseFillOutHeadUnitDropDown, myRASIIQFormPage.screenerIiqFormFillOutBirthLenghtHeadUnitDropDown);
        CommonUtils.selectDropDownValue(iiq_TestDataManager.pleaseFillOutHeadCircumferenceUnitDropDown, myRASIIQFormPage.screenerIiqFormFillOutBirthLenghtHeadCircumferenceUnitDropDown);
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
        CommonUtils.waitForVisibility(myRASIIQFormPage.screenerIiqFormThisSectionWillAskAboutCancerText);
        CommonUtils.assertEqualsWithMessage(iiq_Constants.THIS_SECTION_WILL_ASK_ABOUT_CANCER_TEXT, myRASIIQFormPage.screenerIiqFormThisSectionWillAskAboutCancerText.getText(), "-- VERIFYING THIS SECTION WILL ASK ABOUT CANCER TEXT --");
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
        MiscUtils.sleep(1000);
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
        MiscUtils.sleep(2000);
        CommonUtils.selectDropDownValue(iiq_TestDataManager.pleaseFillTheTableBelowWithHeightUnitDropDown, myRASIIQFormPage.screenerIiqFormFillOutCurrentHeightUnitDropDown);
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
        MiscUtils.sleep(3000);
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
        CommonUtils.assertEqualsWithMessage(iiq_Constants.YOU_ARE_ALMOST_DONE_TEXT, myRASIIQFormPage.screenerIiqFormYouAreAlmostDoneText.getText(), "-- VERIFYING YOU ARE ALMOST DONE TEXT --");
        CucumberLogUtils.logScreenshot();
        MiscUtils.sleep(3000);
        ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
        MiscUtils.sleep(1000);
        CucumberLogUtils.logScreenshot();
        ServiceNow_Common_Methods.logOutOfNativeView();
    }

    /***
     * USE THIS METHOD WILL COMPLETE THE RAS SURVEY SCENARIO 1
     */
    public void rasScreenerSurveyScenario1PartOne() {
        CommonUtils.waitForVisibility(myRASSurveyPage.rasSurveyThankYouForStartingText);
        CommonUtils.assertEqualsWithMessage(ras_Survey_TestDataManager.thankYouForStartingTheRASSurveyAndFor, myRASSurveyPage.rasSurveyText.getText(), "-- VERIFYING THANK YOU FOR STARTING THE RAS SURVEY AND FOR YOUR TEXT --");
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.rasSurveyThisQuestionMayTakeText);
        CommonUtils.assertEqualsWithMessage(ras_Survey_TestDataManager.thisQuestionnaireMayTakeYouSeveral, myRASSurveyPage.rasSurveyText.getText(), "-- VERIFYING THIS QUESTIONNAIRE MAY TAKE YOU SEVERAL HOURS TO COMPLETE TEXT --");
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.rasSurveyTheFirstBlockText);
        CommonUtils.assertEqualsWithMessage(ras_Survey_TestDataManager.thisQuestionnaireMayTakeYouSeveral, myRASSurveyPage.rasSurveyText.getText(), "-- VERIFYING THE FIRST BLOCK OF QUESTIONS WILL COLLECT TEXT --");
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
        CommonUtils.assertEqualsWithMessage(ras_Survey_TestDataManager.theNextSetOfQuestionsWillAskAboutNeonatalHistory, myRASSurveyPage.rasSurveyText.getText(), "-- VERIFYING THE NEXT SET OF QUESTIONS WILL ASK ABOUT BIRTH AND NEONATAL  TEXT --");
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
        CommonUtils.assertEqualsWithMessage(ras_Survey_TestDataManager.theNextSetHormoneRelatedGrowth, myRASSurveyPage.rasSurveyText.getText(), "-- VERIFYING THE NEXT SET OF QUESTIONS WILL ASK ABOUT HORMONE RELATED GROWTH TEXT --");
        CucumberLogUtils.logScreenshot();
    }

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
        CommonUtils.assertEqualsWithMessage(ras_Survey_TestDataManager.theNextSetOfQuestionsWillAskAboutDevelopment, myRASSurveyPage.rasSurveyText.getText(), "-- VERIFYING THE NEXT SET OF QUESTIONS WILL ASK ABOUT DEVELOPMENT TEXT --");
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
        MiscUtils.sleep(2000);
        CommonUtils.waitForVisibility(rasopathyQuestionnairePage.dynamicClickOnCheckboxesScreener(5));
        CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicClickOnCheckboxesScreener(5));
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(97));
        MiscUtils.sleep(2000);
    }

    public void rasScreenerSurveyScenario1PartThree() {
        //*** ATTACHING FILE CAN'T BE AUTOMATED IN QUATRICS. MANUAL TESTING WAS PERFORMED FOR UPLOADING A FILE *******
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.theNextSetOfQuestionsWillAskAboutHeartText);
        CommonUtils.assertEqualsWithMessage(ras_Survey_TestDataManager.theNextSetOfQuestionsWillAskAboutHeart, myRASSurveyPage.rasSurveyText.getText(), "-- VERIFYING THE NEXT SET OF QUESTIONS WILL ASK ABOUT HEART TEXT --");
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
        CommonUtils.assertEqualsWithMessage(ras_Survey_TestDataManager.theNextTwoQuestionsWillAskAboutRASopathyDiagnoses, myRASSurveyPage.rasSurveyText.getText(), "-- VERIFYING THE NEXT TWO QUESTIONS WILL ASK ABOUT RASOPATHY DIAGNOSES TEXT --");
        CucumberLogUtils.logScreenshot();
    }

    public void rasScreenerSurveyScenario1PartFour() {
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(dynamicLocator(ras_Survey_TestDataManager.haveYouBeenDiagnosedWithARASopathy));
        JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.haveYouBeenDiagnosedWithARASopathy));
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.theNextTwoQuestionsWillAskAboutMedicalHistoryText);
        CommonUtils.assertEqualsWithMessage(ras_Survey_TestDataManager.theNextSetOfQuestionsWillAskAboutGeneralMedicalHistory, myRASSurveyPage.rasSurveyText.getText(), "-- VERIFYING THE NEXT SET OF QUESTIONS WILL ASK ABOUT GENERAL MEDICAL HISTORY TEXT --");
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
        CommonUtils.assertEqualsWithMessage(ras_Survey_TestDataManager.theNextSetOfQuestionsWillAskAboutGi, myRASSurveyPage.rasSurveyText.getText(), "-- VERIFYING THE NEXT SET OF QUESTIONS WILL ASK ABOUT GI TEXT --");
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

    public void rasScreenerSurveyScenario1PartSix() {
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(305));
        CommonUtils.assertEqualsWithMessage(ras_Survey_TestDataManager.theNextSetOfQuestionsAskAboutBreathingAndTheLungs, myRASSurveyPage.rasSurveyText.getText(), "-- VERIFYING THE NEXT SET OF QUESTIONS ASK ABOUT BREATHING AND THE LUNGS TEXT --");
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
        CommonUtils.assertEqualsWithMessage(ras_Survey_TestDataManager.theNextSetOfQuestionsWillAskAboutOralHealthAndDental, myRASSurveyPage.rasSurveyText.getText(), "-- VERIFYING THE NEXT SET OF QUESTIONS WILL ASK ABOUT ORAL HEALTH AND DENTAL HISTORY TEXT --");
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

    public void rasScreenerSurveyScenario1PartSeven() {
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(306));
        CommonUtils.assertEqualsWithMessage(ras_Survey_TestDataManager.theNextSetOfQuestionsAskAboutFluidBalance, myRASSurveyPage.rasSurveyText.getText(), "-- VERIFYING THE NEXT SET OF QUESTIONS ASK ABOUT FLUID BALANCE AND IF ANY FLUID BUILDS TEXT --");
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(331));
        JavascriptUtils.clickByJS(dynamicLocator(ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithALymphaticSystemIssue));
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(332));
        CommonUtils.assertEqualsWithMessage(ras_Survey_TestDataManager.theNextSetOfQuestionsWillAskAboutTheKidneys, myRASSurveyPage.rasSurveyText.getText(), "-- VERIFYING THE NEXT SET OF QUESTIONS WILL ASK ABOUT THE KIDNEYS TEXT --");
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
        CommonUtils.assertEqualsWithMessage(ras_Survey_TestDataManager.theNextSetOfQuestionsAskAboutHairAndSkinQualities, myRASSurveyPage.rasSurveyText.getText(), "-- VERIFYING THE NEXT SET OF QUESTIONS ASK ABOUT HAIR AND SKIN QUALITIES TEXT --");
        CucumberLogUtils.logScreenshot();
    }

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
        CommonUtils.assertEqualsWithMessage(ras_Survey_TestDataManager.theNextSetOfQuestionsAskAboutSkeletalConditions, myRASSurveyPage.rasSurveyText.getText(), "-- VERIFYING THE NEXT SET OF QUESTIONS ASK ABOUT SKELETAL CONDITIONS TEXT --");
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
        CommonUtils.assertEqualsWithMessage(ras_Survey_TestDataManager.theNextSetOfQuestionsAskAboutBloodDisorders, myRASSurveyPage.rasSurveyText.getText(), "-- VERIFYING THE NEXT SET OF QUESTIONS ASK ABOUT BLOOD DISORDERS TEXT --");
        CucumberLogUtils.logScreenshot();
    }

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
        CommonUtils.assertEqualsWithMessage(ras_Survey_TestDataManager.theNextSetOfQuestionsAskAboutNervousSystem, myRASSurveyPage.rasSurveyText.getText(), "-- VERIFYING THE NEXT SET OF QUESTIONS ASK ABOUT NERVOUS SYSTEM TEXT --");
        CucumberLogUtils.logScreenshot();
    }

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
        CommonUtils.assertEqualsWithMessage(ras_Survey_TestDataManager.theNextSetOfQuestionsAskAboutVisionAndHearing, myRASSurveyPage.rasSurveyText.getText(), "-- VERIFYING THE NEXT SET OF QUESTIONS ASK ABOUT VISION AND HEARING TEXT --");
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
        CommonUtils.assertEqualsWithMessage(ras_Survey_TestDataManager.youAreAlmostDoneSurvey, myRASSurveyPage.dynamicTopText(298).getText(), "-- VERIFYING YOU ARE ALMOST DONE TEXT --");
        MiscUtils.sleep(1000);
        CucumberLogUtils.logScreenshot();
        ras_screenerSubmissions_stepsImpl.clickOnSurveySavAndNextButton();
        MiscUtils.sleep(3000);
        CucumberLogUtils.logScreenshot();
        MiscUtils.sleep(1000);
        ServiceNow_Common_Methods.logOutOfNativeView();
    }

    public void verifyingDropDownOption(WebElement element, String message) {
        CommonUtils.assertEqualsWithMessage(element.getAttribute("selected"), "true", message);
    }

    /***
     * THIS METHOD VERIFIES RAS SCREENER SCENARIO 1 DATA IN NATIVE VIEW
     */
    public void verifying_RAS_Screener_Scenario_1_Data(String sheetName) {
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        MiscUtils.sleep(2000);

        NativeView_SideDoor_Dashboard_Page.filterNavigatorTextBox.sendKeys("All Participant Details");
        MiscUtils.sleep(3000);
        CommonUtils.clickOnElement(NativeView_SideDoor_Dashboard_Page.allParticipantDetailsLink);
        MiscUtils.sleep(3000);
        CommonUtils.switchToFrame(NativeView_SideDoor_Dashboard_Page.nativeViewiFrame);
        CommonUtils.waitForVisibility(nativeViewCHARMSDashboardPage.rasStudyParticipantsDetailsMenu);
        CucumberLogUtils.logScreenshot();
        if (sheetName.contentEquals("screenerScenario1")) {
            CommonUtils.hoverOverElement(participantDetailsPage.dynamicRecordButtonLocator(ras_Screener_TestDataManager.firstName + " " + ras_Screener_TestDataManager.lastName));
            CucumberLogUtils.logScreenshot();
            CommonUtils.clickOnElement(NativeViewCHARMSDashboardPage.nativeViewnewScreenerReceivedLocator(ras_Screener_TestDataManager.firstName + " " + ras_Screener_TestDataManager.lastName));
        } else if (sheetName.contentEquals("screenerScenario2")) {
            CommonUtils.hoverOverElement(participantDetailsPage.dynamicRecordButtonLocator(ras_Screener_TestDataManager.firstName + " " + ras_Screener_TestDataManager.lastName));
            CucumberLogUtils.logScreenshot();
            CommonUtils.clickOnElement(NativeViewCHARMSDashboardPage.nativeViewnewScreenerReceivedLocator(ras_Screener_TestDataManager.firstName + " " + ras_Screener_TestDataManager.lastName));
        } else if (sheetName.contentEquals("screenerScenario3")) {
            CommonUtils.hoverOverElement(participantDetailsPage.dynamicRecordButtonLocator(ras_Screener_TestDataManager.whatIsTheNameOfThePersonWhoMayBeEligibleForThisStudyFirst + " " + ras_Screener_TestDataManager.whatIsTheNameOfThePersonWhoMayBeEligibleForThisStudyLast));
            CucumberLogUtils.logScreenshot();
            CommonUtils.clickOnElement(NativeViewCHARMSDashboardPage.nativeViewnewScreenerReceivedLocator(ras_Screener_TestDataManager.whatIsTheNameOfThePersonWhoMayBeEligibleForThisStudyFirst + " " + ras_Screener_TestDataManager.whatIsTheNameOfThePersonWhoMayBeEligibleForThisStudyLast));
        } else if (sheetName.contentEquals("screenerScenario4")) {
            CommonUtils.hoverOverElement(participantDetailsPage.dynamicRecordButtonLocator(ras_Screener_TestDataManager.whatIsTheNameOfThePersonWhoMayBeEligibleForThisStudyFirst + " " + ras_Screener_TestDataManager.whatIsTheNameOfThePersonWhoMayBeEligibleForThisStudyLast));
            CucumberLogUtils.logScreenshot();
            CommonUtils.clickOnElement(NativeViewCHARMSDashboardPage.nativeViewnewScreenerReceivedLocator(ras_Screener_TestDataManager.whatIsTheNameOfThePersonWhoMayBeEligibleForThisStudyFirst + " " + ras_Screener_TestDataManager.whatIsTheNameOfThePersonWhoMayBeEligibleForThisStudyLast));
        }
        MiscUtils.sleep(1000);
        CucumberLogUtils.scenario.log("---- VERIFYING PARTICIPANT RECORD PREVIEW DATA ----");
        Hooks.softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(participantDetailsPage.firstNameRecordPreviewField), ras_Screener_TestDataManager.firstName, "-- VERIFYING PREVIEW RECORD FIRST NAME --");
        Hooks.softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(participantDetailsPage.lastNameRecordPreviewField), ras_Screener_TestDataManager.lastName, "-- VERIFYING PREVIEW RECORD LAST NAME --");
        Hooks.softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(participantDetailsPage.middleNameRecordPreviewField), ras_Screener_TestDataManager.middleInitial, "-- VERIFYING PREVIEW RECORD MIDDLE NAME --");
        Hooks.softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(participantDetailsPage.contactHomePhoneRecordPreviewField), ras_Screener_TestDataManager.homePhoneNumber, "-- VERIFYING PREVIEW RECORD CONTACT HOME PHONE NUMBER --");
        Hooks.softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(participantDetailsPage.contactEmailRecordPreviewField), ras_Screener_TestDataManager.emailAddress, "-- VERIFYING PREVIEW RECORD CONTACT EMAIL ADDRESS --");
        CucumberLogUtils.logScreenshot();
        if (CommonUtils.isElementDisplayed(nativeViewCHARMSDashboardPage.rasStudyOpenRecordButton)) {
            CommonUtils.clickOnElement(nativeViewCHARMSDashboardPage.rasStudyOpenRecordButton);
        }
        CucumberLogUtils.scenario.log("---- VERIFYING PARTICIPANT NAME DATA ----");
        Hooks.softAssert.assertEquals(CommonUtils.getTextOfSelectedDropDownOption(webDriver.findElement(By.xpath("//select[@name='x_naci_family_coho_family_history_details.relationship_to_you']"))), "Proband", "-- VERIFYING RELATIONSHIP TO PROBAND --");
        Hooks.softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(participantDetailsPage.nameTextBox), ras_Screener_TestDataManager.firstName + ras_Screener_Constants.SPACE + ras_Screener_TestDataManager.lastName, "-- VERIFYING FULL NAME --");
        Hooks.softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(participantDetailsPage.firstNameTextBox), ras_Screener_TestDataManager.firstName, "-- VERIFYING FIRST NAME --");
        Hooks.softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(participantDetailsPage.middleInitialTextBox), ras_Screener_TestDataManager.middleInitial, "-- VERIFYING MIDDLE INITIAL --");
        Hooks.softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(participantDetailsPage.lastNameTextBox), ras_Screener_TestDataManager.lastName, "-- VERIFYING LAST NAME --");
        CucumberLogUtils.logScreenshot();

        CucumberLogUtils.scenario.log("---- VERIFYING PARTICIPANT DEMOGRAPHICS DATA ----");
        CommonUtils.clickOnElement(participantDetailsPage.demographicsTab);
        Hooks.softAssert.assertEquals(CommonUtils.getTextOfSelectedDropDownOption(participantDetailsPage.biologicalGenderDropDown), ras_Screener_TestDataManager.sexAssignedAtBirthOption, "-- VERIFYING BIOLOGICAL GENDER --");
        Hooks.softAssert.assertEquals(participantDetailsPage.participantRacePreferNotToAnswerOption.getText(), ras_Screener_TestDataManager.whatIsYourRace, "-- VERIFYING RACE --");
        Hooks.softAssert.assertEquals(CommonUtils.getTextOfSelectedDropDownOption(participantDetailsPage.ethnicityDropDownOption),ras_Screener_TestDataManager.whatIsYourEthnicity, "-- VERIFYING ETHNICITY --");
        Hooks.softAssert.assertEquals(CommonUtils.getTextOfSelectedDropDownOption(participantDetailsPage.isParticipantAdoptedDropDown), ras_Screener_TestDataManager.areYouAdoptedOption, "-- VERIFYING IF THE PARTICIPANT IS ADOPTED --");
        Hooks.softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(participantDetailsPage.dateOfBirthTextBox), CommonUtils.convertDate(ras_Screener_TestDataManager.whatIsYourDateOfBirth), "-- VERIFYING DATE OF BIRTH --");
        CucumberLogUtils.logScreenshot();

        CucumberLogUtils.scenario.log("---- VERIFYING PARTICIPANT CONTACT INFORMATION DATA ----");
        CommonUtils.clickOnElement(participantDetailsPage.contactInfoTab);
        Hooks.softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(participantDetailsPage.contactStreetAddress), ras_Screener_TestDataManager.street + ras_Screener_Constants.SPACE + ras_Screener_TestDataManager.street2, "-- VERIFYING CONTACT STREET ADDRESS --");
        Hooks.softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(participantDetailsPage.contactState), ras_Screener_TestDataManager.state, "-- VERIFYING CONTACT STATE --");
        Hooks.softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(participantDetailsPage.contactCity), ras_Screener_TestDataManager.city, "- VERIFYING CONTACT CITY --");
        Hooks.softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(participantDetailsPage.contactZipCode), ras_Screener_TestDataManager.zipcode, "-- VERIFYING ZIP CODE --");
        Hooks.softAssert.assertEquals(CommonUtils.getTextOfSelectedDropDownOption(participantDetailsPage.contactCountryDropDown), ras_Screener_TestDataManager.countryOption, "-- VERIFYING CONTACT COUNTRY --");
        Hooks.softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(participantDetailsPage.contactEmailAddress), ras_Screener_TestDataManager.emailAddress, "-- VERIFYING CONTACT EMAIL ADDRESS --");
        Hooks.softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(participantDetailsPage.contactHomePhone), ras_Screener_TestDataManager.homePhoneNumber, "-- VERIFYING CONTACT HOME PHONE --");
        Hooks.softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(participantDetailsPage.contactCellPhone), ras_Screener_TestDataManager.cellPhoneNumber, "-- VERIFYING CONTACT CELL PHONE --");
        Hooks.softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(participantDetailsPage.contactWorkPhone), ras_Screener_TestDataManager.workPhoneNumber, "-- VERIFYING CONTACT WORK PHONE --");
        Hooks.softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(participantDetailsPage.contactPreferredPhone), ras_Screener_TestDataManager.cellPhoneNumber, "-- VERIFYING PREFERRED PHONE --");
        CucumberLogUtils.logScreenshot();

        CucumberLogUtils.scenario.log("---- OPENING PARTICIPANT STUDIES RECORD ----");
        JavascriptUtils.scrollIntoView(participantDetailsPage.participantStudiesTab);
        CommonUtils.clickOnElement(participantDetailsPage.participantStudiesTab);
        CucumberLogUtils.logScreenshot();
        CommonUtils.hoverOverElement(participantDetailsPage.dynamicRecordButtonLocator("Eligible"));
        CommonUtils.waitForVisibility(participantDetailsPage.participantStudiesInfoButton);
        CommonUtils.clickOnElement(participantDetailsPage.participantStudiesInfoButton);
        CucumberLogUtils.logScreenshot();

        CucumberLogUtils.scenario.log("---- NAVIGATING TO RAS SCREENER TABLE ----");
        CommonUtils.waitForClickability(nativeViewCHARMSDashboardPage.rasStudyOpenRecordButton);
        CommonUtils.clickOnElement(nativeViewCHARMSDashboardPage.rasStudyOpenRecordButton);
        CucumberLogUtils.logScreenshot();
        CommonUtils.waitForClickability(nativeViewCHARMSParticipantStudyPage.participantStudyScreenerInfoButton);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantStudyPage.participantStudyScreenerInfoButton);

        CucumberLogUtils.scenario.log("---- VERIFYING RAS SCREENER PREVIEW RECORD DATA ----");
        Hooks.softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(screenerRecordTablePage.screenerPreviewFamilyMemberRecordField), ras_Screener_TestDataManager.firstName + ras_Screener_Constants.SPACE + ras_Screener_TestDataManager.lastName, "-- VERIFYING SCREENER PREVIEW RECORD FAMILY MEMBER RECORD NAME --");
        Hooks.softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(screenerRecordTablePage.screenerPreviewContactEmailAddressField), ras_Screener_TestDataManager.emailAddress, "-- VERIFYING SCREENER PREVIEW RECORD CONTACT EMAIL ADDRESS FIELD --");
        Hooks.softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(screenerRecordTablePage.screenerPreviewStudyField), ras_Screener_Constants.RAS_STUDY, "-- VERIFYING SCREENER PREVIEW STUDY FIELD --");
        CucumberLogUtils.logScreenshot();

        CucumberLogUtils.scenario.log("---- NAVIGATING TO RAS SCREENER TABLE ----");
        CommonUtils.waitForClickability(nativeViewCHARMSDashboardPage.rasStudyOpenRecordButton);
        CommonUtils.clickOnElement(nativeViewCHARMSDashboardPage.rasStudyOpenRecordButton);
        CucumberLogUtils.logScreenshot();

        CucumberLogUtils.scenario.log("---- VERIFYING SCREENER RECORD NAME AND CONTACT INFORMATION DATA ----");
        Hooks.softAssert.assertEquals(CommonUtils.getTextOfSelectedDropDownOption(participantDetailsPage.vitalStatusYesDropDownOption), "Alive","-- VERIFYING VITAL STATUS --" );
        CommonUtils.clickOnElement(ScreenerRecordTablePage.dynamicTabLocatorUsingExactText("Contact Information"));
        Hooks.softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(screenerRecordTablePage.screenerStudyField), ras_Screener_Constants.RAS_STUDY, "-- VERIFYING STUDY FIELD --");
        Hooks.softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(screenerRecordTablePage.familyMemberRecordField), ras_Screener_TestDataManager.firstName + ras_Screener_Constants.SPACE + ras_Screener_TestDataManager.lastName, "-- VERIFYING FAMILY MEMBER RECORD FIELD --");
        Hooks.softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(screenerRecordTablePage.contactEmailField), ras_Screener_TestDataManager.emailAddress, "-- VERIFYING CONTACT EMAIL FIELD --");
        Hooks.softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(screenerRecordTablePage.contactHomePhoneField), ras_Screener_TestDataManager.homePhoneNumber, "-- VERIFYING CONTACT HOME PHONE NUMBER --");
        Hooks.softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(screenerRecordTablePage.contactCellPhoneField), ras_Screener_TestDataManager.cellPhoneNumber, "-- VERIFYING CONTACT CELL PHONE NUMBER --");
        Hooks.softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(screenerRecordTablePage.contactWorkPhoneField), ras_Screener_TestDataManager.workPhoneNumber, "-- VERIFYING CONTACT WORK PHONE NUMBER --");
        Hooks.softAssert.assertEquals(CommonUtils.getTextOfSelectedDropDownOption(screenerRecordTablePage.contactCountryDropDown), ras_Screener_TestDataManager.countryOption, "-- VERIFYING COUNTRY CONTACT FIELD --");
        Hooks.softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(screenerRecordTablePage.contactStateField), ras_Screener_TestDataManager.state, "-- VERIFYING STATE --");
        Hooks.softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(screenerRecordTablePage.contactStreetAddressField), ras_Screener_TestDataManager.street + ras_Screener_Constants.SPACE + ras_Screener_TestDataManager.street2, "-- VERIFYING CONTACT STREET ADDRESS --");
        Hooks.softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(screenerRecordTablePage.contactCityField), ras_Screener_TestDataManager.city, "-- VERIFYING CONTACT CITY --");
        Hooks.softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(screenerRecordTablePage.contactZipCodeField), ras_Screener_TestDataManager.zipcode, "-- VERIFYING ZIP CODE --");
        CucumberLogUtils.logScreenshot();

        CucumberLogUtils.scenario.log("---- VERIFYING RAS SCREENER TABLE DEMOGRAPHICS INFORMATION DATA ----");
        CommonUtils.clickOnElement(screenerRecordTablePage.dynamicLocatorForTabs("Demographics"));
        Hooks.softAssert.assertEquals(screenerRecordTablePage.demographicsParticipantRacePreferNotToAnswerOption.getText(), ras_Screener_TestDataManager.whatIsYourRace, "-- VERIFYING RACE OF PARTICIPANT --");
        Hooks.softAssert.assertEquals(CommonUtils.getTextOfSelectedDropDownOption(screenerRecordTablePage.demographicsBiologicalGenderDropDown), ras_Screener_TestDataManager.sexAssignedAtBirthOption, "-- VERIFYING BIOLOGICAL GENDER --");
        Hooks.softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(screenerRecordTablePage.demographicsDateOfBirthField), ras_Screener_TestDataManager.whatIsYourDateOfBirth, "-- VERIFYING DATE OF BIRTH --");
        Hooks.softAssert.assertEquals(CommonUtils.getTextOfSelectedDropDownOption(screenerRecordTablePage.demographicsEthnicityDropDown), ras_Screener_TestDataManager.whatIsYourEthnicity, "-- VERIFYING ETHNICITY --");
        CucumberLogUtils.logScreenshot();

        CucumberLogUtils.scenario.log("---- VERIFYING RAS SCREENER TABLE RASOPATHY HISTORY DATA ----");
        CommonUtils.clickOnElement(screenerRecordTablePage.dynamicLocatorForTabs("RASopathy History"));
        Hooks.softAssert.assertEquals(CommonUtils.getTextOfSelectedDropDownOption(screenerRecordTablePage.rasopathyHistoryHaveYouBeenDiagnosedWithARasopathyDropDown), ras_Screener_TestDataManager.haveYouBeenDiagnosedWithARasopathy, "-- VERIFYING IF PARTICIPANT HAS BEEN DIAGNOSED WITH A RASOPATHY --");
        Hooks.softAssert.assertEquals(screenerRecordTablePage.rasopathyHistoryNeverDiagnosedWithAnyOfTheseConditions.getText(), ras_Screener_TestDataManager.haveYouBeenDiagnosedWithFollowingConditions, "-- VERIFYING IF CANDIDATE HAS BEEN DIAGNOSED WITH ANY CONDITIONS --");
        Hooks.softAssert.assertEquals(CommonUtils.getTextOfSelectedDropDownOption(screenerRecordTablePage.rasopathyHistoryHaveAnyOfYourBiologicalRelativesBeenDiagnosedWithARasopathyDropDown), ras_Screener_TestDataManager.haveAnyOfYourBiologicalRelativesBeenDiagnosedWithARasopathy, "-- VERIFYING IF ANY OF BIOLOGICAL RELATIVES BEEN DIAGNOSED WITH A RASOPATHY --");
        CucumberLogUtils.logScreenshot();

        CucumberLogUtils.scenario.log("---- VERIFYING RAS SCREENER TABLE CANCER HISTORY ----");
        CommonUtils.clickOnElement(screenerRecordTablePage.dynamicLocatorForTabs("Cancer History"));
        Hooks.softAssert.assertEquals(CommonUtils.getTextOfSelectedDropDownOption(screenerRecordTablePage.cancerHistoryHasAPhysicianEverDiagnosedParticipantWithCancerDropDown), ras_Screener_TestDataManager.haveYouBeenDiagnosedWithCancer, "-- VERIFYING IF PARTICIPANT HAS BEEN DIAGNOSED WITH CANCER --");
        CucumberLogUtils.logScreenshot();

        CucumberLogUtils.scenario.log("---- VERIFYING RAS SCREENER TABLE GENETIC TESTING HISTORY ----");
        CommonUtils.clickOnElement(screenerRecordTablePage.dynamicLocatorForTabs("Genetic Testing History"));
        Hooks.softAssert.assertEquals(CommonUtils.getTextOfSelectedDropDownOption(screenerRecordTablePage.geneticTestingHistoryHasTheParticipantEverHadGeneticTestingDropDown), ras_Screener_TestDataManager.haveYouEverHadGeneticTesting, "-- VERIFYING IF PARTICIPANT HAS HAD GENETIC TESTING --");
        CucumberLogUtils.logScreenshot();

        CucumberLogUtils.scenario.log("---- VERIFYING RAS SCREENER TABLE FINAL INFORMATION ----");
        CommonUtils.clickOnElement(screenerRecordTablePage.dynamicLocatorForTabs("Final Information"));
        Hooks.softAssert.assertEquals(CommonUtils.getTextOfSelectedDropDownOption(screenerRecordTablePage.finalInformationHowDidYouHearAboutThisStudyDropDown),  ras_Screener_TestDataManager.howDidYouHearAboutThisStudy, "-- VERIFYING HOW DID PARTICIPANT HEAR ABOUT THE STUDY --");
        Hooks.softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(screenerRecordTablePage.finalInformationHowDidYouHearAboutThisStudyPleaseSpecifyTextBox), ras_Screener_TestDataManager.howDidYouHearAboutThisStudyOtherReason, "-- VERIFYING HOW DID YOU PARTICIPANT HEAR ABOUT THE STUDY OTHER REASONS --");
        Hooks.softAssert.assertEquals(CommonUtils.getTextOfSelectedDropDownOption(screenerRecordTablePage.finalInformationHasParticipantOrAnyFamilyMemberParticipatedInAnyCancerStudyDropDown), ras_Screener_TestDataManager.haveYouOrOtherFamilyMembersParticipatedInOtherStudy, "-- VERIFYING IF PARTICIPANT OR FAMILY MEMBER HAVE PARTICIPATED IN CANCER STUDY --");
        Hooks.softAssert.assertEquals(screenerRecordTablePage.finalInformationMainReasonsForParticipatingInThisStudyOtherOption.getText(), ras_Screener_TestDataManager.whatAreMainReasonsForParticipatingInStudy, "-- VERIFYING MAIN REASONS FOR PARTICIPATING IN STUDY --");
        Hooks.softAssert.assertEquals(screenerRecordTablePage.finalInformationMainReasonsForParticipatingInThisStudyOtherReasonsField.getText(), ras_Screener_TestDataManager.whatAreMainReasonsForParticipatingInStudyOtherReason, "-- VERIFYING MAIN REASONS FOR PARTICIPATING IN STUDY FIELD --");
        Hooks.softAssert.assertEquals(CommonUtils.getTextOfSelectedDropDownOption(screenerRecordTablePage.finalInformationAreYouAParticipantInAnyOtherResearchStudyOrRegistryGroupDropDown), ras_Screener_TestDataManager.areYouAParticipantInOtherStudyGroup, "-- VERIFYING IF PARTICIPANT IS PART OF RESEARCH STUDY OR REGISTRY GROUP --");
        CucumberLogUtils.logScreenshot();
        ServiceNow_Common_Methods.logOutOfNativeView();
    }
}