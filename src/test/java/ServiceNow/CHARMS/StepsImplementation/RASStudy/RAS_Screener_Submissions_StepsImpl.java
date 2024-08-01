package ServiceNow.CHARMS.StepsImplementation.RASStudy;

import ServiceNow.CHARMS.Pages.RAS_Screener_Page;
import appsCommon.PageInitializers.PageInitializer;
import appsCommon.Utils.ServiceNow_Common_Methods;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;

import static ServiceNow.CHARMS.Pages.RAS_Screener_Page.dynamicLocator;

public class RAS_Screener_Submissions_StepsImpl extends PageInitializer {

    public void screener_submissions() {

        CommonUtils.switchToNextWindow();
        MiscUtils.sleep(2000);
        CommonUtils.waitForVisibility(myRASSurveyPage.rasSurveyThisCopyText);
        //ASSERTING THAT THIS IS THE COPY FOR LOWER ENVIRONMENTS ONLY!!! MESSAGE DISPLAYS
        Assert.assertEquals(myRASSurveyPage.rasSurveyThisCopyText.getText(), ras_Screener_Constants.THIS_IS_A_COPY);
        CucumberLogUtils.logScreenshot();
        MiscUtils.sleep(2000);
        JavascriptUtils.scrollIntoView(rasopathyQuestionnairePage.studyNextButton);
        CucumberLogUtils.logScreenshot();
        ras_scenario_one_stepsImpl.clickOnScreenerNextButton();
        MiscUtils.sleep(2000);
        if (!rasopathyQuestionnairePage.iAmCompletingThisFormForMyselfOption.isDisplayed()) {
            ras_scenario_one_stepsImpl.clickOnScreenerNextButton();
        }

        if (ras_Screener_TestDataManager.areYouCompletingThisFormForSomeoneElseOrYourself.contentEquals("I am completing this form for myself")) {
            CucumberLogUtils.scenario.log("* * * THIS IS A SELF SCREENER SUBMISSION * * *");
        } else if (ras_Screener_TestDataManager.areYouCompletingThisFormForSomeoneElseOrYourself.contentEquals("I am completing this form for someone else")) {
            CucumberLogUtils.scenario.log("* * * THIS IS A PROXY SCREENER SUBMISSION * * *");
        }

        for (int i = 0; i < 40; i++) {

            /**
             * * * * * ARE YOU COMPLETING THIS FORM FOR SOMEONE ELSE OR FOR YOURSELF? * * * *
             */
            try {
                if (rasopathyQuestionnairePage.question.isDisplayed() && rasopathyQuestionnairePage.question.getText().contentEquals("Are you completing this form for someone else or for yourself?")) {
                    CucumberLogUtils.scenario.log("* * * * ARE YOU COMPLETING THIS FORM FOR SOMEONE ELSE OR FOR YOURSELF? * * * *");
                    dynamicLocator(ras_Screener_TestDataManager.areYouCompletingThisFormForSomeoneElseOrYourself).click();
                    CucumberLogUtils.logScreenshot();
                    ras_scenario_one_stepsImpl.clickOnScreenerNextButton();
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
                    ras_scenario_one_stepsImpl.clickOnScreenerNextButton();
                }
                /**
                 * * * * * THE NEXT SET OF QUESTIONS WILL COLLECT BASIC INFORMATION ABOUT YOU. * * * *
                 */
                else if (rasopathyQuestionnairePage.question.isDisplayed() && rasopathyQuestionnairePage.question.getText().contentEquals("The next set of questions will collect basic information about you.")) {
                    CucumberLogUtils.scenario.log("* * * * * THE NEXT SET OF QUESTIONS WILL COLLECT BASIC INFORMATION ABOUT YOU. * * * * *");
                    CucumberLogUtils.logScreenshot();
                    ras_scenario_one_stepsImpl.clickOnScreenerNextButton();
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
                    ras_scenario_one_stepsImpl.clickOnScreenerNextButton();
                }
                /**
                 * * * * * WHAT WAS YOUR SEX ASSIGNED AT BIRTH? * * * *
                 */
                else if (rasopathyQuestionnairePage.question.isDisplayed() && rasopathyQuestionnairePage.question.getText().contentEquals("What was your sex assigned at birth?")) {
                    CucumberLogUtils.scenario.log("* * * * * WHAT WAS YOUR SEX ASSIGNED AT BIRTH? * * * * *");
                    dynamicLocator(ras_Screener_TestDataManager.sexAssignedAtBirthOption).click();
                    CucumberLogUtils.logScreenshot();
                    ras_scenario_one_stepsImpl.clickOnScreenerNextButton();
                }
                /**
                 * * * * * ARE YOU ADOPTED? * * * *
                 */
                else if (rasopathyQuestionnairePage.question.isDisplayed() && rasopathyQuestionnairePage.question.getText().contentEquals("Are you adopted?")) {
                    CucumberLogUtils.scenario.log("* * * * * ARE YOU ADOPTED? * * * * *");
                    dynamicLocator(ras_Screener_TestDataManager.areYouAdoptedOption).click();
                    CucumberLogUtils.logScreenshot();
                    ras_scenario_one_stepsImpl.clickOnScreenerNextButton();
                }
                /**
                 * * * * * IN WHICH COUNTRY DO YOU CURRENTLY LIVE? * * * *
                 */
                else if (rasopathyQuestionnairePage.question.isDisplayed() && rasopathyQuestionnairePage.question.getText().contentEquals("In which country do you currently live?")) {
                    CucumberLogUtils.scenario.log("* * * * * IN WHICH COUNTRY DO YOU CURRENTLY LIVE? * * * * *");
                    CommonUtils.selectDropDownValue(ras_Screener_TestDataManager.countryOption, rasopathyQuestionnairePage.whatCountryDoesParticipantCurrentlyLiveInDropDown);
                    CucumberLogUtils.logScreenshot();
                    ras_scenario_one_stepsImpl.clickOnScreenerNextButton();
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
                    ras_scenario_one_stepsImpl.clickOnScreenerNextButton();
                }
                /**
                 * * * * * WHAT IS YOUR EMAIL ADDRESS? * * * *
                 */
                else if (rasopathyQuestionnairePage.question.isDisplayed() && rasopathyQuestionnairePage.question.getText().contentEquals("What is your email address?")) {
                    CucumberLogUtils.scenario.log("* * * * * WHAT IS YOUR EMAIL ADDRESS? * * * * *");
                    rasopathyQuestionnairePage.dynamicEmailAddressTextBox(ras_Screener_Constants.EMAIL_ADDRESS).sendKeys(ras_Screener_TestDataManager.emailAddress);
                    CucumberLogUtils.logScreenshot();
                    ras_scenario_one_stepsImpl.clickOnScreenerNextButton();
                }
                /**
                 * * * * * PLEASE CONFIRM YOUR EMAIL ADDRESS * * * *
                 */
                else if (rasopathyQuestionnairePage.question.isDisplayed() && rasopathyQuestionnairePage.question.getText().contentEquals("Please confirm your email address")) {
                    CucumberLogUtils.scenario.log("* * * * * PLEASE CONFIRM YOUR EMAIL ADDRESS * * * * *");
                    rasopathyQuestionnairePage.dynamicEmailAddressTextBox(ras_Screener_Constants.CONFIRM_EMAIL_ADDRESS).sendKeys(ras_Screener_TestDataManager.emailAddressConfirm);
                    CucumberLogUtils.logScreenshot();
                    ras_scenario_one_stepsImpl.clickOnScreenerNextButton();
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
                    ras_scenario_one_stepsImpl.clickOnScreenerNextButton();
                }
                /**
                 * * * * * WHAT IS YOUR ETHNICITY?  * * * *
                 */
                else if (rasopathyQuestionnairePage.question.isDisplayed() && rasopathyQuestionnairePage.question.getText().contentEquals("What is your ethnicity?")) {
                    CucumberLogUtils.scenario.log("* * * * * WHAT IS YOUR ETHNICITY?  * * * * *");
                    dynamicLocator(ras_Screener_TestDataManager.whatIsYourEthnicity).click();
                    CucumberLogUtils.logScreenshot();
                    ras_scenario_one_stepsImpl.clickOnScreenerNextButton();
                }
                /**
                 * * * * * WHAT IS YOUR RACE? PLEASE SELECT ALL THAT APPLY.  * * * *
                 */
                else if (rasopathyQuestionnairePage.question.isDisplayed() && rasopathyQuestionnairePage.question.getText().contentEquals("What is your race? Please select all that apply.")) {
                    CucumberLogUtils.scenario.log("* * * * * WHAT IS YOUR RACE? PLEASE SELECT ALL THAT APPLY.  * * * * *");
                    dynamicLocator(ras_Screener_TestDataManager.whatIsYourRace).click();
                    CucumberLogUtils.logScreenshot();
                    ras_scenario_one_stepsImpl.clickOnScreenerNextButton();
                }
                /**
                 * * * * * ARE YOU A PARTICIPANT IN ANY OTHER RESEARCH STUDY OR REGISTRY GROUP?  PLEASE SPECIFY.  * * * *
                 */
                else if (rasopathyQuestionnairePage.question.isDisplayed() && rasopathyQuestionnairePage.question.getText().contentEquals("Are you a participant in any other research study or registry group?  Please specify.")) {
                    CucumberLogUtils.scenario.log("* * * * * ARE YOU A PARTICIPANT IN ANY OTHER RESEARCH STUDY OR REGISTRY GROUP?  PLEASE SPECIFY.  * * * * *");
                    dynamicLocator(ras_Screener_TestDataManager.areYouAParticipantInOtherStudyGroup).click();
                    CucumberLogUtils.logScreenshot();
                    ras_scenario_one_stepsImpl.clickOnScreenerNextButton();
                }
                /**
                 * * * * * TO DETERMINE ELIGIBILITY FOR THIS STUDY, WE NEED TO COLLECT INFORMATION ABOUT MEDICAL DIAGNOSES.  THESE QUESTIONS ASK ABOUT GENERAL MEDICAL CONDITIONS, CANCER AND ANY PRIOR DIAGNOSIS OF A RASOPATHY.  PLEASE COMPLETE THIS INFORMATION TO THE BEST OF YOUR KNOWLEDGE.   * * * *
                 */
                else if (rasopathyQuestionnairePage.question.isDisplayed() && rasopathyQuestionnairePage.question.getText().contentEquals("To determine eligibility for this study, we need to collect information about medical diagnoses.  These questions ask about general medical conditions, cancer and any prior diagnosis of a RASopathy.  Please complete this information to the best of your knowledge. ")) {
                    CucumberLogUtils.scenario.log("* * * * * TO DETERMINE ELIGIBILITY FOR THIS STUDY, WE NEED TO COLLECT INFORMATION ABOUT MEDICAL DIAGNOSES.  THESE QUESTIONS ASK ABOUT GENERAL MEDICAL CONDITIONS, CANCER AND ANY PRIOR DIAGNOSIS OF A RASOPATHY.  PLEASE COMPLETE THIS INFORMATION TO THE BEST OF YOUR KNOWLEDGE.  * * * * *");
                    CucumberLogUtils.logScreenshot();
                    ras_scenario_one_stepsImpl.clickOnScreenerNextButton();
                }
                /**
                 * * * * * HAVE YOU EVER BEEN DIAGNOSED WITH THE FOLLOWING CONDITIONS?  SELECT ALL THAT APPLY.  IF YOU DO NOT SEE THE EXACT CONDITION DIAGNOSED, PLEASE SELECT THE CLOSEST ANSWER.   * * * *
                 */
                else if (rasopathyQuestionnairePage.question.isDisplayed() && rasopathyQuestionnairePage.question.getText().contentEquals("Have you ever been diagnosed with the following conditions?  Select all that apply.  If you do not see the exact condition diagnosed, please select the closest answer.")) {
                    CucumberLogUtils.scenario.log("* * * * * HAVE YOU EVER BEEN DIAGNOSED WITH THE FOLLOWING CONDITIONS?  SELECT ALL THAT APPLY.  IF YOU DO NOT SEE THE EXACT CONDITION DIAGNOSED, PLEASE SELECT THE CLOSEST ANSWER.   * * * * *");
                    dynamicLocator(ras_Screener_TestDataManager.haveYouBeenDiagnosedWithFollowingConditions).click();
                    CucumberLogUtils.logScreenshot();
                    ras_scenario_one_stepsImpl.clickOnScreenerNextButton();
                }
                /**
                 * * * * * HAVE YOU EVER BEEN DIAGNOSED WITH CANCER? * * * *
                 */
                else if (rasopathyQuestionnairePage.question.isDisplayed() && rasopathyQuestionnairePage.question.getText().contentEquals("Have you ever been diagnosed with cancer?")) {
                    CucumberLogUtils.scenario.log("* * * * * HAVE YOU EVER BEEN DIAGNOSED WITH CANCER? * * * * *");
                    dynamicLocator(ras_Screener_TestDataManager.haveYouBeenDiagnosedWithCancer).click();
                    CucumberLogUtils.logScreenshot();
                    ras_scenario_one_stepsImpl.clickOnScreenerNextButton();
                }
                /**
                 * * * * * HAVE YOU BEEN DIAGNOSED WITH A RASOPATHY SUCH AS NOONAN SYNDROME, NOONAN SYNDROME WITH MULTIPLE LENTIGINES, COSTELLO SYNDROME, CARDIOFACIOCUTANEOUS SYNDROME, LEGIUS SYNDROME, CAPILLARY ARTERIOVENOUS MALFORMATION SYNDROME, HEREDITARY GINGIVAL FIBROMATOSIS OR SYNGAP1 SYNDROME? * * * *
                 */
                else if (rasopathyQuestionnairePage.question.isDisplayed() && rasopathyQuestionnairePage.question.getText().contentEquals("Have you been diagnosed with a RASopathy such as Noonan syndrome, Noonan syndrome with multiple lentigines, Costello syndrome, cardiofaciocutaneous syndrome, Legius syndrome, capillary arteriovenous malformation syndrome, hereditary gingival fibromatosis or SYNGAP1 syndrome?")) {
                    CucumberLogUtils.scenario.log("* * * * * HAVE YOU BEEN DIAGNOSED WITH A RASOPATHY SUCH AS NOONAN SYNDROME, NOONAN SYNDROME WITH MULTIPLE LENTIGINES, COSTELLO SYNDROME, CARDIOFACIOCUTANEOUS SYNDROME, LEGIUS SYNDROME, CAPILLARY ARTERIOVENOUS MALFORMATION SYNDROME, HEREDITARY GINGIVAL FIBROMATOSIS OR SYNGAP1 SYNDROME? * * * * *");
                    dynamicLocator(ras_Screener_TestDataManager.haveYouBeenDiagnosedWithARasopathy).click();
                    CucumberLogUtils.logScreenshot();
                    ras_scenario_one_stepsImpl.clickOnScreenerNextButton();
                }
                /**
                 * * * * * WE KNOW THAT RASOPATHIES ARE A GROUP OF SYNDROMES THAT HAVE A GENETIC BASIS.  IN ORDER TO HELP US DETERMINE ELIGIBILITY FOR THE RASOPATHIES STUDY, WE ALSO NEED TO KNOW ABOUT ANY GENETIC TESTING THAT HAS BEEN COMPLETED.  WE WILL NEED A COPY OF ANY TEST RESULTS. * * * *
                 */
                else if (rasopathyQuestionnairePage.question.isDisplayed() && rasopathyQuestionnairePage.question.getText().contentEquals("We know that RASopathies are a group of syndromes that have a genetic basis.  In order to help us determine eligibility for the RASopathies Study, we also need to know about any genetic testing that has been completed.  We will need a copy of any test results.  ")) {
                    CucumberLogUtils.scenario.log("* * * * * WE KNOW THAT RASOPATHIES ARE A GROUP OF SYNDROMES THAT HAVE A GENETIC BASIS.  IN ORDER TO HELP US DETERMINE ELIGIBILITY FOR THE RASOPATHIES STUDY, WE ALSO NEED TO KNOW ABOUT ANY GENETIC TESTING THAT HAS BEEN COMPLETED.  WE WILL NEED A COPY OF ANY TEST RESULTS. * * * * *");
                    CucumberLogUtils.logScreenshot();
                    ras_scenario_one_stepsImpl.clickOnScreenerNextButton();
                }
                /**
                 * * * * * HAVE ANY OF YOUR BIOLOGICAL RELATIVES BEEN DIAGNOSED WITH A RASOPATHY? * * * *
                 */
                else if (rasopathyQuestionnairePage.question.isDisplayed() && rasopathyQuestionnairePage.question.getText().contentEquals(" Have any of your biological relatives been diagnosed with a RASopathy?")) {
                    CucumberLogUtils.scenario.log("* * * * * HAVE ANY OF YOUR BIOLOGICAL RELATIVES BEEN DIAGNOSED WITH A RASOPATHY? * * * * *");
                    dynamicLocator(ras_Screener_TestDataManager.haveAnyOfYourBiologicalRelativesBeenDiagnosedWithARasopathy).click();
                    CucumberLogUtils.logScreenshot();
                    ras_scenario_one_stepsImpl.clickOnScreenerNextButton();
                }
                /**
                 * * * * *
                 * HAVE YOU EVER HAD GENETIC TESTING? * * * *
                 */
                else if (rasopathyQuestionnairePage.question.isDisplayed() && rasopathyQuestionnairePage.question.getText().contentEquals("Have you ever had genetic testing?")) {
                    CucumberLogUtils.scenario.log("* * * * * HAVE YOU EVER HAD GENETIC TESTING? * * * * *");
                    dynamicLocator(ras_Screener_TestDataManager.haveYouEverHadGeneticTesting).click();
                    CucumberLogUtils.logScreenshot();
                    ras_scenario_one_stepsImpl.clickOnScreenerNextButton();
                }
                /**
                 * * * * * WE WILL NOW ASK A FEW REMAINING QUESTIONS REGARDING THIS STUDY. * * * *
                 */
                else if (rasopathyQuestionnairePage.question.isDisplayed() && rasopathyQuestionnairePage.question.getText().contentEquals("We will now ask a few remaining questions regarding this study.")) {
                    CucumberLogUtils.scenario.log("* * * * * WE WILL NOW ASK A FEW REMAINING QUESTIONS REGARDING THIS STUDY. * * * * *");
                    CucumberLogUtils.logScreenshot();
                    ras_scenario_one_stepsImpl.clickOnScreenerNextButton();
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
                    ras_scenario_one_stepsImpl.clickOnScreenerNextButton();
                }
                /**
                 * * * * * HAVE YOU OR OTHER FAMILY MEMBERS EVER PARTICIPATED IN ANOTHER STUDY ON RASOPATHY AT ANOTHER MEDICAL INSTITUTION, UNIVERSITY, GOVERNMENT AGENCY OR OTHER SITE? * * * *
                 */
                else if (rasopathyQuestionnairePage.question.isDisplayed() && rasopathyQuestionnairePage.question.getText().contentEquals("Have you or other family members ever participated in another study on RASopathy at another medical institution, university, government agency or other site?")) {
                    CucumberLogUtils.scenario.log("* * * * * HAVE YOU OR OTHER FAMILY MEMBERS EVER PARTICIPATED IN ANOTHER STUDY ON RASOPATHY AT ANOTHER MEDICAL INSTITUTION, UNIVERSITY, GOVERNMENT AGENCY OR OTHER SITE? * * * * *");
                    dynamicLocator(ras_Screener_TestDataManager.haveYouOrOtherFamilyMembersParticipatedInOtherStudy).click();
                    CucumberLogUtils.logScreenshot();
                    ras_scenario_one_stepsImpl.clickOnScreenerNextButton();
                }
                /**
                 * * * * * WHAT ARE THE MAIN REASONS FOR PARTICIPATING IN THIS STUDY?  SELECT ALL THAT APPLY.  PLEASE ELABORATE ON THE REASON IN THE CORRESPONDING TEXTBOX. * * * *
                 */
                else if (rasopathyQuestionnairePage.question.isDisplayed() && rasopathyQuestionnairePage.question.getText().contentEquals("What are the main reasons for participating in this study?  Select all that apply.  Please elaborate on the reason in the corresponding textbox.")) {
                    CucumberLogUtils.scenario.log("* * * * * WHAT ARE THE MAIN REASONS FOR PARTICIPATING IN THIS STUDY?  SELECT ALL THAT APPLY.  PLEASE ELABORATE ON THE REASON IN THE CORRESPONDING TEXTBOX. * * * * *");
                    CommonUtils.scrollIntoView(dynamicLocator(ras_Screener_TestDataManager.whatAreMainReasonsForParticipatingInStudy));
                    System.out.println("TEXT IS: " + ras_Screener_TestDataManager.whatAreMainReasonsForParticipatingInStudy);
                    dynamicLocator(ras_Screener_TestDataManager.whatAreMainReasonsForParticipatingInStudy).click();
                    rasopathyQuestionnairePage.dynamicLocatorForMainReasonForParticipatingInStudy(ras_Screener_TestDataManager.whatAreMainReasonsForParticipatingInStudy).sendKeys(ras_Screener_TestDataManager.whatAreMainReasonsForParticipatingInStudyOtherReason);
                    CucumberLogUtils.logScreenshot();
                    ras_scenario_one_stepsImpl.clickOnScreenerNextButton();
                }
                /**
                 * * * * * YOU ARE ALMOST DONE! * * * *
                 */
                else if (rasopathyQuestionnairePage.question.isDisplayed() && rasopathyQuestionnairePage.question.getText().contains("You are almost done!")) {
                    CucumberLogUtils.scenario.log("* * * * * YOU ARE ALMOST DONE! * * * * *");
                    ras_scenario_one_stepsImpl.clickOnScreenerNextButton();
                    MiscUtils.sleep(3000);
                    CucumberLogUtils.logScreenshot();
                    ServiceNow_Common_Methods.logOutOfNativeView();
                }
            } catch (Exception e) {
                CucumberLogUtils.scenario.log("* * * SCREENER COMPLETED * * *");
                break;
            }
//            if (rasopathyQuestionnairePage.question.isDisplayed() && rasopathyQuestionnairePage.question.getText().contentEquals("Are you completing this form for someone else or for yourself?")) {
//                CucumberLogUtils.scenario.log("* * * * ARE YOU COMPLETING THIS FORM FOR SOMEONE ELSE OR FOR YOURSELF? * * * *");
//                dynamicLocator(ras_Screener_TestDataManager.areYouCompletingThisFormForSomeoneElseOrYourself).click();
//                CucumberLogUtils.logScreenshot();
//                ras_scenario_one_stepsImpl.clickOnScreenerNextButton();
//            }
//            /**
//             * * * * * WHAT IS YOUR NAME? * * * *
//             */
//            else if (rasopathyQuestionnairePage.question.isDisplayed() && rasopathyQuestionnairePage.question.getText().contentEquals("What is your name?")) {
//                CucumberLogUtils.scenario.log("* * * * * ENTERING FIRST NAME, MIDDLE INITIAL, LAST NAME * * * * *");
//                rasopathyQuestionnairePage.dynamicTextBoxLocator(ras_Screener_Constants.FIRST_NAME).sendKeys(ras_Screener_TestDataManager.firstName);
//                rasopathyQuestionnairePage.dynamicTextBoxLocator(ras_Screener_Constants.MIDDLE_INITIAL).sendKeys(ras_Screener_TestDataManager.middleInitial);
//                rasopathyQuestionnairePage.dynamicTextBoxLocator(ras_Screener_Constants.LAST_NAME).sendKeys(ras_Screener_TestDataManager.lastName);
//                CucumberLogUtils.logScreenshot();
//                ras_scenario_one_stepsImpl.clickOnScreenerNextButton();
//            }
//            /**
//             * * * * * THE NEXT SET OF QUESTIONS WILL COLLECT BASIC INFORMATION ABOUT YOU. * * * *
//             */
//            else if (rasopathyQuestionnairePage.question.isDisplayed() && rasopathyQuestionnairePage.question.getText().contentEquals("The next set of questions will collect basic information about you.")) {
//                CucumberLogUtils.scenario.log("* * * * * THE NEXT SET OF QUESTIONS WILL COLLECT BASIC INFORMATION ABOUT YOU. * * * * *");
//                CucumberLogUtils.logScreenshot();
//                ras_scenario_one_stepsImpl.clickOnScreenerNextButton();
//            }
//            /**
//             * * * * * WHAT IS YOUR DATE OF BIRTH? * * * *
//             */
//            else if (rasopathyQuestionnairePage.question.isDisplayed() && rasopathyQuestionnairePage.question.getText().contentEquals("What is your date of birth?")) {
//                CucumberLogUtils.scenario.log("* * * * * WHAT IS YOUR DATE OF BIRTH? * * * * *");
//                CommonUtils.selectDropDownValue(ras_Screener_TestDataManager.dateOfBirthMonth, rasopathyQuestionnairePage.calendarMonthDropDown);
//                rasopathyQuestionnairePage.calendarYearTextBox.clear();
//                rasopathyQuestionnairePage.calendarYearTextBox.sendKeys(ras_Screener_TestDataManager.dateOfBirthYear);
//                RAS_Screener_Page.dynamicDateOfBirthCalendarLocator(ras_Screener_TestDataManager.whatIsYourDateOfBirth).click();
//                CucumberLogUtils.logScreenshot();
//                ras_scenario_one_stepsImpl.clickOnScreenerNextButton();
//            }
//            /**
//             * * * * * WHAT WAS YOUR SEX ASSIGNED AT BIRTH? * * * *
//             */
//            else if (rasopathyQuestionnairePage.question.isDisplayed() && rasopathyQuestionnairePage.question.getText().contentEquals("What was your sex assigned at birth?")) {
//                CucumberLogUtils.scenario.log("* * * * * WHAT WAS YOUR SEX ASSIGNED AT BIRTH? * * * * *");
//                dynamicLocator(ras_Screener_TestDataManager.sexAssignedAtBirthOption).click();
//                CucumberLogUtils.logScreenshot();
//                ras_scenario_one_stepsImpl.clickOnScreenerNextButton();
//            }
//            /**
//             * * * * * ARE YOU ADOPTED? * * * *
//             */
//            else if (rasopathyQuestionnairePage.question.isDisplayed() && rasopathyQuestionnairePage.question.getText().contentEquals("Are you adopted?")) {
//                CucumberLogUtils.scenario.log("* * * * * ARE YOU ADOPTED? * * * * *");
//                dynamicLocator(ras_Screener_TestDataManager.areYouAdoptedOption).click();
//                CucumberLogUtils.logScreenshot();
//                ras_scenario_one_stepsImpl.clickOnScreenerNextButton();
//            }
//            /**
//             * * * * * IN WHICH COUNTRY DO YOU CURRENTLY LIVE? * * * *
//             */
//            else if (rasopathyQuestionnairePage.question.isDisplayed() && rasopathyQuestionnairePage.question.getText().contentEquals("In which country do you currently live?")) {
//                CucumberLogUtils.scenario.log("* * * * * IN WHICH COUNTRY DO YOU CURRENTLY LIVE? * * * * *");
//                CommonUtils.selectDropDownValue(ras_Screener_TestDataManager.countryOption, rasopathyQuestionnairePage.whatCountryDoesParticipantCurrentlyLiveInDropDown);
//                CucumberLogUtils.logScreenshot();
//                ras_scenario_one_stepsImpl.clickOnScreenerNextButton();
//            }
//
//            /**
//             * * * * * PLEASE PROVIDE THE MAILING ADDRESS WHERE STUDY MATERIALS CAN BE SENT, AS NEEDED. * * * *
//             */
//            else if (rasopathyQuestionnairePage.question.isDisplayed() && rasopathyQuestionnairePage.question.getText().contentEquals("Please provide the mailing address where study materials can be sent, as needed.")) {
//                CucumberLogUtils.scenario.log("* * * * * PLEASE PROVIDE THE MAILING ADDRESS WHERE STUDY MATERIALS CAN BE SENT, AS NEEDED. * * * * *");
//                rasopathyQuestionnairePage.dynamicTextBoxLocator(ras_Screener_Constants.STREET_ADDRESS).sendKeys(ras_Screener_TestDataManager.street);
//                rasopathyQuestionnairePage.dynamicTextBoxLocator(ras_Screener_Constants.STREET_2_ADDRESS).sendKeys(ras_Screener_TestDataManager.street2);
//                rasopathyQuestionnairePage.dynamicTextBoxLocator(ras_Screener_Constants.CITY_TEXT).sendKeys(ras_Screener_TestDataManager.city);
//                rasopathyQuestionnairePage.dynamicTextBoxLocator(ras_Screener_Constants.STATE_TEXT).sendKeys(ras_Screener_TestDataManager.state);
//                rasopathyQuestionnairePage.dynamicTextBoxLocator(ras_Screener_Constants.ZIP_CODE_TEXT).sendKeys(ras_Screener_TestDataManager.zipcode);
//                CucumberLogUtils.logScreenshot();
//                ras_scenario_one_stepsImpl.clickOnScreenerNextButton();
//            }
//            /**
//             * * * * * WHAT IS YOUR EMAIL ADDRESS? * * * *
//             */
//            else if (rasopathyQuestionnairePage.question.isDisplayed() && rasopathyQuestionnairePage.question.getText().contentEquals("What is your email address?")) {
//                CucumberLogUtils.scenario.log("* * * * * WHAT IS YOUR EMAIL ADDRESS? * * * * *");
//                rasopathyQuestionnairePage.dynamicEmailAddressTextBox(ras_Screener_Constants.EMAIL_ADDRESS).sendKeys(ras_Screener_TestDataManager.emailAddress);
//                CucumberLogUtils.logScreenshot();
//                ras_scenario_one_stepsImpl.clickOnScreenerNextButton();
//            }
//            /**
//             * * * * * PLEASE CONFIRM YOUR EMAIL ADDRESS * * * *
//             */
//            else if (rasopathyQuestionnairePage.question.isDisplayed() && rasopathyQuestionnairePage.question.getText().contentEquals("Please confirm your email address")) {
//                CucumberLogUtils.scenario.log("* * * * * PLEASE CONFIRM YOUR EMAIL ADDRESS * * * * *");
//                rasopathyQuestionnairePage.dynamicEmailAddressTextBox(ras_Screener_Constants.CONFIRM_EMAIL_ADDRESS).sendKeys(ras_Screener_TestDataManager.emailAddressConfirm);
//                CucumberLogUtils.logScreenshot();
//                ras_scenario_one_stepsImpl.clickOnScreenerNextButton();
//            }
//            /**
//             * * * * * PLEASE LIST YOUR PHONE NUMBERS BELOW.  PLEASE ALSO SELECT YOUR PREFERRED CONTACT NUMBER.  * * * *
//             */
//            else if (rasopathyQuestionnairePage.question.isDisplayed() && rasopathyQuestionnairePage.question.getText().contentEquals("Please list your phone numbers below.  Please also select your preferred contact number. ")) {
//                CucumberLogUtils.scenario.log("* * * * * PLEASE LIST YOUR PHONE NUMBERS BELOW.  PLEASE ALSO SELECT YOUR PREFERRED CONTACT NUMBER.  * * * * *");
//                rasopathyQuestionnairePage.dynamicTextBoxLocatorForPhoneNumbers(ras_Screener_Constants.HOME_PHONE_NUMBER).sendKeys(ras_Screener_TestDataManager.homePhoneNumber);
//                rasopathyQuestionnairePage.dynamicTextBoxLocatorForPhoneNumbers(ras_Screener_Constants.CELL_PHONE_NUMBER).sendKeys(ras_Screener_TestDataManager.cellPhoneNumber);
//                rasopathyQuestionnairePage.dynamicTextBoxLocatorForPhoneNumbers(ras_Screener_Constants.WORK_PHONE_NUMBER).sendKeys(ras_Screener_TestDataManager.workPhoneNumber);
//                rasopathyQuestionnairePage.dynamicPhoneNumberCheckBox(ras_Screener_Constants.CELL_PHONE_NUMBER).click();
//                CucumberLogUtils.logScreenshot();
//                ras_scenario_one_stepsImpl.clickOnScreenerNextButton();
//            }
//            /**
//             * * * * * WHAT IS YOUR ETHNICITY?  * * * *
//             */
//            else if (rasopathyQuestionnairePage.question.isDisplayed() && rasopathyQuestionnairePage.question.getText().contentEquals("What is your ethnicity?")) {
//                CucumberLogUtils.scenario.log("* * * * * WHAT IS YOUR ETHNICITY?  * * * * *");
//                dynamicLocator(ras_Screener_TestDataManager.whatIsYourEthnicity).click();
//                CucumberLogUtils.logScreenshot();
//                ras_scenario_one_stepsImpl.clickOnScreenerNextButton();
//            }
//            /**
//             * * * * * WHAT IS YOUR RACE? PLEASE SELECT ALL THAT APPLY.  * * * *
//             */
//            else if (rasopathyQuestionnairePage.question.isDisplayed() && rasopathyQuestionnairePage.question.getText().contentEquals("What is your race? Please select all that apply.")) {
//                CucumberLogUtils.scenario.log("* * * * * WHAT IS YOUR RACE? PLEASE SELECT ALL THAT APPLY.  * * * * *");
//                dynamicLocator(ras_Screener_TestDataManager.whatIsYourRace).click();
//                CucumberLogUtils.logScreenshot();
//                ras_scenario_one_stepsImpl.clickOnScreenerNextButton();
//            }
//            /**
//             * * * * * ARE YOU A PARTICIPANT IN ANY OTHER RESEARCH STUDY OR REGISTRY GROUP?  PLEASE SPECIFY.  * * * *
//             */
//            else if (rasopathyQuestionnairePage.question.isDisplayed() && rasopathyQuestionnairePage.question.getText().contentEquals("Are you a participant in any other research study or registry group?  Please specify.")) {
//                CucumberLogUtils.scenario.log("* * * * * ARE YOU A PARTICIPANT IN ANY OTHER RESEARCH STUDY OR REGISTRY GROUP?  PLEASE SPECIFY.  * * * * *");
//                dynamicLocator(ras_Screener_TestDataManager.areYouAParticipantInOtherStudyGroup).click();
//                CucumberLogUtils.logScreenshot();
//                ras_scenario_one_stepsImpl.clickOnScreenerNextButton();
//            }
//            /**
//             * * * * * TO DETERMINE ELIGIBILITY FOR THIS STUDY, WE NEED TO COLLECT INFORMATION ABOUT MEDICAL DIAGNOSES.  THESE QUESTIONS ASK ABOUT GENERAL MEDICAL CONDITIONS, CANCER AND ANY PRIOR DIAGNOSIS OF A RASOPATHY.  PLEASE COMPLETE THIS INFORMATION TO THE BEST OF YOUR KNOWLEDGE.   * * * *
//             */
//            else if (rasopathyQuestionnairePage.question.isDisplayed() && rasopathyQuestionnairePage.question.getText().contentEquals("To determine eligibility for this study, we need to collect information about medical diagnoses.  These questions ask about general medical conditions, cancer and any prior diagnosis of a RASopathy.  Please complete this information to the best of your knowledge. ")) {
//                CucumberLogUtils.scenario.log("* * * * * TO DETERMINE ELIGIBILITY FOR THIS STUDY, WE NEED TO COLLECT INFORMATION ABOUT MEDICAL DIAGNOSES.  THESE QUESTIONS ASK ABOUT GENERAL MEDICAL CONDITIONS, CANCER AND ANY PRIOR DIAGNOSIS OF A RASOPATHY.  PLEASE COMPLETE THIS INFORMATION TO THE BEST OF YOUR KNOWLEDGE.  * * * * *");
//                CucumberLogUtils.logScreenshot();
//                ras_scenario_one_stepsImpl.clickOnScreenerNextButton();
//            }
//            /**
//             * * * * * HAVE YOU EVER BEEN DIAGNOSED WITH THE FOLLOWING CONDITIONS?  SELECT ALL THAT APPLY.  IF YOU DO NOT SEE THE EXACT CONDITION DIAGNOSED, PLEASE SELECT THE CLOSEST ANSWER.   * * * *
//             */
//            else if (rasopathyQuestionnairePage.question.isDisplayed() && rasopathyQuestionnairePage.question.getText().contentEquals("Have you ever been diagnosed with the following conditions?  Select all that apply.  If you do not see the exact condition diagnosed, please select the closest answer.")) {
//                CucumberLogUtils.scenario.log("* * * * * HAVE YOU EVER BEEN DIAGNOSED WITH THE FOLLOWING CONDITIONS?  SELECT ALL THAT APPLY.  IF YOU DO NOT SEE THE EXACT CONDITION DIAGNOSED, PLEASE SELECT THE CLOSEST ANSWER.   * * * * *");
//                dynamicLocator(ras_Screener_TestDataManager.haveYouBeenDiagnosedWithFollowingConditions).click();
//                CucumberLogUtils.logScreenshot();
//                ras_scenario_one_stepsImpl.clickOnScreenerNextButton();
//            }
//            /**
//             * * * * * HAVE YOU EVER BEEN DIAGNOSED WITH CANCER? * * * *
//             */
//            else if (rasopathyQuestionnairePage.question.isDisplayed() && rasopathyQuestionnairePage.question.getText().contentEquals("Have you ever been diagnosed with cancer?")) {
//                CucumberLogUtils.scenario.log("* * * * * HAVE YOU EVER BEEN DIAGNOSED WITH CANCER? * * * * *");
//                dynamicLocator(ras_Screener_TestDataManager.haveYouBeenDiagnosedWithCancer).click();
//                CucumberLogUtils.logScreenshot();
//                ras_scenario_one_stepsImpl.clickOnScreenerNextButton();
//            }
//            /**
//             * * * * * HAVE YOU BEEN DIAGNOSED WITH A RASOPATHY SUCH AS NOONAN SYNDROME, NOONAN SYNDROME WITH MULTIPLE LENTIGINES, COSTELLO SYNDROME, CARDIOFACIOCUTANEOUS SYNDROME, LEGIUS SYNDROME, CAPILLARY ARTERIOVENOUS MALFORMATION SYNDROME, HEREDITARY GINGIVAL FIBROMATOSIS OR SYNGAP1 SYNDROME? * * * *
//             */
//            else if (rasopathyQuestionnairePage.question.isDisplayed() && rasopathyQuestionnairePage.question.getText().contentEquals("Have you been diagnosed with a RASopathy such as Noonan syndrome, Noonan syndrome with multiple lentigines, Costello syndrome, cardiofaciocutaneous syndrome, Legius syndrome, capillary arteriovenous malformation syndrome, hereditary gingival fibromatosis or SYNGAP1 syndrome?")) {
//                CucumberLogUtils.scenario.log("* * * * * HAVE YOU BEEN DIAGNOSED WITH A RASOPATHY SUCH AS NOONAN SYNDROME, NOONAN SYNDROME WITH MULTIPLE LENTIGINES, COSTELLO SYNDROME, CARDIOFACIOCUTANEOUS SYNDROME, LEGIUS SYNDROME, CAPILLARY ARTERIOVENOUS MALFORMATION SYNDROME, HEREDITARY GINGIVAL FIBROMATOSIS OR SYNGAP1 SYNDROME? * * * * *");
//                dynamicLocator(ras_Screener_TestDataManager.haveYouBeenDiagnosedWithARasopathy).click();
//                CucumberLogUtils.logScreenshot();
//                ras_scenario_one_stepsImpl.clickOnScreenerNextButton();
//            }
//            /**
//             * * * * * WE KNOW THAT RASOPATHIES ARE A GROUP OF SYNDROMES THAT HAVE A GENETIC BASIS.  IN ORDER TO HELP US DETERMINE ELIGIBILITY FOR THE RASOPATHIES STUDY, WE ALSO NEED TO KNOW ABOUT ANY GENETIC TESTING THAT HAS BEEN COMPLETED.  WE WILL NEED A COPY OF ANY TEST RESULTS. * * * *
//             */
//            else if (rasopathyQuestionnairePage.question.isDisplayed() && rasopathyQuestionnairePage.question.getText().contentEquals("We know that RASopathies are a group of syndromes that have a genetic basis.  In order to help us determine eligibility for the RASopathies Study, we also need to know about any genetic testing that has been completed.  We will need a copy of any test results.  ")) {
//                CucumberLogUtils.scenario.log("* * * * * WE KNOW THAT RASOPATHIES ARE A GROUP OF SYNDROMES THAT HAVE A GENETIC BASIS.  IN ORDER TO HELP US DETERMINE ELIGIBILITY FOR THE RASOPATHIES STUDY, WE ALSO NEED TO KNOW ABOUT ANY GENETIC TESTING THAT HAS BEEN COMPLETED.  WE WILL NEED A COPY OF ANY TEST RESULTS. * * * * *");
//                CucumberLogUtils.logScreenshot();
//                ras_scenario_one_stepsImpl.clickOnScreenerNextButton();
//            }
//            /**
//             * * * * * HAVE ANY OF YOUR BIOLOGICAL RELATIVES BEEN DIAGNOSED WITH A RASOPATHY? * * * *
//             */
//            else if (rasopathyQuestionnairePage.question.isDisplayed() && rasopathyQuestionnairePage.question.getText().contentEquals(" Have any of your biological relatives been diagnosed with a RASopathy?")) {
//                CucumberLogUtils.scenario.log("* * * * * HAVE ANY OF YOUR BIOLOGICAL RELATIVES BEEN DIAGNOSED WITH A RASOPATHY? * * * * *");
//                dynamicLocator(ras_Screener_TestDataManager.haveAnyOfYourBiologicalRelativesBeenDiagnosedWithARasopathy).click();
//                CucumberLogUtils.logScreenshot();
//                ras_scenario_one_stepsImpl.clickOnScreenerNextButton();
//            }
//            /**
//             * * * * *
//             * HAVE YOU EVER HAD GENETIC TESTING? * * * *
//             */
//            else if (rasopathyQuestionnairePage.question.isDisplayed() && rasopathyQuestionnairePage.question.getText().contentEquals("Have you ever had genetic testing?")) {
//                CucumberLogUtils.scenario.log("* * * * * HAVE YOU EVER HAD GENETIC TESTING? * * * * *");
//                dynamicLocator(ras_Screener_TestDataManager.haveYouEverHadGeneticTesting).click();
//                CucumberLogUtils.logScreenshot();
//                ras_scenario_one_stepsImpl.clickOnScreenerNextButton();
//            }
//            /**
//             * * * * * WE WILL NOW ASK A FEW REMAINING QUESTIONS REGARDING THIS STUDY. * * * *
//             */
//            else if (rasopathyQuestionnairePage.question.isDisplayed() && rasopathyQuestionnairePage.question.getText().contentEquals("We will now ask a few remaining questions regarding this study.")) {
//                CucumberLogUtils.scenario.log("* * * * * WE WILL NOW ASK A FEW REMAINING QUESTIONS REGARDING THIS STUDY. * * * * *");
//                CucumberLogUtils.logScreenshot();
//                ras_scenario_one_stepsImpl.clickOnScreenerNextButton();
//            }
//            /**
//             * * * * * HOW DID YOU HEAR ABOUT THIS STUDY?  IF A SPECIFIC HEALTH CARE PROVIDER REFERRED YOU TO THIS STUDY, PLEASE INCLUDE THEIR NAME IN THE CORRESPONDING TEXT BOX. * * * *
//             */
//            else if (rasopathyQuestionnairePage.question.isDisplayed() && rasopathyQuestionnairePage.question.getText().contentEquals("How did you hear about this study?  If a specific health care provider referred you to this study, please include their name in the corresponding text box.")) {
//                CucumberLogUtils.scenario.log("* * * * * HOW DID YOU HEAR ABOUT THIS STUDY?  IF A SPECIFIC HEALTH CARE PROVIDER REFERRED YOU TO THIS STUDY, PLEASE INCLUDE THEIR NAME IN THE CORRESPONDING TEXT BOX. * * * * *");
//                CommonUtils.scrollIntoView(dynamicLocator(ras_Screener_TestDataManager.howDidYouHearAboutThisStudy));
//                dynamicLocator(ras_Screener_TestDataManager.howDidYouHearAboutThisStudy);
//                rasopathyQuestionnairePage.dynamicLocatorForHowDidYouHearAboutStudyTextBoxes(ras_Screener_TestDataManager.howDidYouHearAboutThisStudy).sendKeys(ras_Screener_TestDataManager.howDidYouHearAboutThisStudyOtherReason);
//                CucumberLogUtils.logScreenshot();
//                ras_scenario_one_stepsImpl.clickOnScreenerNextButton();
//            }
//            /**
//             * * * * * HAVE YOU OR OTHER FAMILY MEMBERS EVER PARTICIPATED IN ANOTHER STUDY ON RASOPATHY AT ANOTHER MEDICAL INSTITUTION, UNIVERSITY, GOVERNMENT AGENCY OR OTHER SITE? * * * *
//             */
//            else if (rasopathyQuestionnairePage.question.isDisplayed() && rasopathyQuestionnairePage.question.getText().contentEquals("Have you or other family members ever participated in another study on RASopathy at another medical institution, university, government agency or other site?")) {
//                CucumberLogUtils.scenario.log("* * * * * HAVE YOU OR OTHER FAMILY MEMBERS EVER PARTICIPATED IN ANOTHER STUDY ON RASOPATHY AT ANOTHER MEDICAL INSTITUTION, UNIVERSITY, GOVERNMENT AGENCY OR OTHER SITE? * * * * *");
//                dynamicLocator(ras_Screener_TestDataManager.haveYouOrOtherFamilyMembersParticipatedInOtherStudy).click();
//                CucumberLogUtils.logScreenshot();
//                ras_scenario_one_stepsImpl.clickOnScreenerNextButton();
//            }
//            /**
//             * * * * * WHAT ARE THE MAIN REASONS FOR PARTICIPATING IN THIS STUDY?  SELECT ALL THAT APPLY.  PLEASE ELABORATE ON THE REASON IN THE CORRESPONDING TEXTBOX. * * * *
//             */
//            else if (rasopathyQuestionnairePage.question.isDisplayed() && rasopathyQuestionnairePage.question.getText().contentEquals("What are the main reasons for participating in this study?  Select all that apply.  Please elaborate on the reason in the corresponding textbox.")) {
//                CucumberLogUtils.scenario.log("* * * * * WHAT ARE THE MAIN REASONS FOR PARTICIPATING IN THIS STUDY?  SELECT ALL THAT APPLY.  PLEASE ELABORATE ON THE REASON IN THE CORRESPONDING TEXTBOX. * * * * *");
//                CommonUtils.scrollIntoView(dynamicLocator(ras_Screener_TestDataManager.whatAreMainReasonsForParticipatingInStudy));
//                System.out.println("TEXT IS: " + ras_Screener_TestDataManager.whatAreMainReasonsForParticipatingInStudy);
//                dynamicLocator(ras_Screener_TestDataManager.whatAreMainReasonsForParticipatingInStudy).click();
//                rasopathyQuestionnairePage.dynamicLocatorForMainReasonForParticipatingInStudy(ras_Screener_TestDataManager.whatAreMainReasonsForParticipatingInStudy).sendKeys(ras_Screener_TestDataManager.whatAreMainReasonsForParticipatingInStudyOtherReason);
//                CucumberLogUtils.logScreenshot();
//                ras_scenario_one_stepsImpl.clickOnScreenerNextButton();
//            }
//            /**
//             * * * * * YOU ARE ALMOST DONE! * * * *
//             */
//            else if (rasopathyQuestionnairePage.question.isDisplayed() && rasopathyQuestionnairePage.question.getText().contains("You are almost done!")) {
//                CucumberLogUtils.scenario.log("* * * * * YOU ARE ALMOST DONE! * * * * *");
//                ras_scenario_one_stepsImpl.clickOnScreenerNextButton();
//                MiscUtils.sleep(3000);
//                CucumberLogUtils.logScreenshot();
//                ServiceNow_Common_Methods.logOutOfNativeView();
//            }


        }

    }

}
