package ServiceNow.CHARMS.StepsImplementation.RASStudy;

import appsCommon.PageInitializers.PageInitializer;
import appsCommon.Utils.ServiceNow_Common_Methods;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.testng.Assert;

public class RAS_Scenario_Five_StepsImpl extends PageInitializer {
    /***
     * USE THIS METHOD WILL COMPLETE THE RAS SCREENER SCENARIO 5
     */
//    public void ras_screener_submission_five() {
//        CommonUtils.switchToNextWindow();
//        MiscUtils.sleep(2000);
//        CommonUtils.waitForVisibility(myRASSurveyPage.rasSurveyThisCopyText);
//        //ASSERTING THAT THIS IS THE COPY FOR LOWER ENVIRONMENTS ONLY!!! MESSAGE DISPLAYS
//        Assert.assertEquals(myRASSurveyPage.rasSurveyThisCopyText.getText(), ras_Screener_Constants.THIS_IS_A_COPY);
//        CucumberLogUtils.logScreenshot();
//        JavascriptUtils.scrollIntoView(rasopathyQuestionnairePage.studyNextButton);
//        CucumberLogUtils.logScreenshot();
//        ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
//        MiscUtils.sleep(2000);
//        if (!rasopathyQuestionnairePage.iAmCompletingThisFormForMyselfOption.isDisplayed()) {
//            ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
//        }
//        try {
//            rasopathyQuestionnairePage.dynamicLocator(ras_Screener_Constants.ARE_YOU_COMPLETING_THIS_FORM_FOR_SOMEONE_ELSE);
//            CucumberLogUtils.logScreenshot();
//        } catch (NoSuchElementException e) {
//            e.printStackTrace();
//            ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
//            rasopathyQuestionnairePage.dynamicLocator(ras_Screener_Constants.ARE_YOU_COMPLETING_THIS_FORM_FOR_SOMEONE_ELSE);
//            CucumberLogUtils.logScreenshot();
//        }
//        ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
//        try {
//            rasopathyQuestionnairePage.dynamicTextBoxLocator(ras_Screener_Constants.FIRST_NAME).sendKeys(ras_Screener_TestDataManager.FIRST_NAME);
//            rasopathyQuestionnairePage.dynamicTextBoxLocator(ras_Screener_Constants.MIDDLE_INITIAL).sendKeys(ras_Screener_TestDataManager.middleInitial);
//            rasopathyQuestionnairePage.dynamicTextBoxLocator(ras_Screener_Constants.LAST_NAME).sendKeys(ras_Screener_TestDataManager.lastName);
//            CucumberLogUtils.logScreenshot();
//        } catch (NoSuchElementException e) {
//            e.printStackTrace();
//            ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
//            rasopathyQuestionnairePage.dynamicTextBoxLocator(ras_Screener_Constants.FIRST_NAME).sendKeys(ras_Screener_TestDataManager.FIRST_NAME);
//            rasopathyQuestionnairePage.dynamicTextBoxLocator(ras_Screener_Constants.MIDDLE_INITIAL).sendKeys(ras_Screener_TestDataManager.middleInitial);
//            rasopathyQuestionnairePage.dynamicTextBoxLocator(ras_Screener_Constants.LAST_NAME).sendKeys(ras_Screener_TestDataManager.lastName);
//            CucumberLogUtils.logScreenshot();
//        }
//        ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
//        CucumberLogUtils.logScreenshot();
//        ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
//        try {
//            rasopathyQuestionnairePage.calendarYearTextBox.clear();
//            rasopathyQuestionnairePage.calendarYearTextBox.sendKeys(ras_Screener_TestDataManager.dateOfBirthYear);
//            CommonUtils.selectDropDownValue(ras_Screener_TestDataManager.dateOfBirthMonth, rasopathyQuestionnairePage.calendarMonthDropDown);
//            rasopathyQuestionnairePage.calendarDayOption.click();
//            CucumberLogUtils.logScreenshot();
//        } catch (NoSuchElementException e) {
//            e.printStackTrace();
//            ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
//            rasopathyQuestionnairePage.calendarYearTextBox.clear();
//            rasopathyQuestionnairePage.calendarYearTextBox.sendKeys(ras_Screener_TestDataManager.dateOfBirthYear);
//            CommonUtils.selectDropDownValue(ras_Screener_TestDataManager.dateOfBirthMonth, rasopathyQuestionnairePage.calendarMonthDropDown);
//            rasopathyQuestionnairePage.calendarDayOption.click();
//            CucumberLogUtils.logScreenshot();
//        }
//        ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
//        try {
//            rasopathyQuestionnairePage.dynamicLocator(ras_Screener_TestDataManager.sexAssignedAtBirthOption).click();
//            CucumberLogUtils.logScreenshot();
//        } catch (NoSuchElementException e) {
//            e.printStackTrace();
//            ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
//            rasopathyQuestionnairePage.dynamicLocator(ras_Screener_TestDataManager.sexAssignedAtBirthOption).click();
//            CucumberLogUtils.logScreenshot();
//        }
//        ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
//        try {
//            rasopathyQuestionnairePage.dynamicLocator(ras_Screener_TestDataManager.areYouAdoptedOption).click();
//            CucumberLogUtils.logScreenshot();
//        } catch (NoSuchElementException e) {
//            e.printStackTrace();
//            ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
//            rasopathyQuestionnairePage.dynamicLocator(ras_Screener_TestDataManager.areYouAdoptedOption).click();
//            CucumberLogUtils.logScreenshot();
//        }
//        ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
//        try {
//            CommonUtils.selectDropDownValue(ras_Screener_TestDataManager.countryOption, rasopathyQuestionnairePage.whatCountryDoesParticipantCurrentlyLiveInDropDown);
//            CucumberLogUtils.logScreenshot();
//        } catch (NoSuchElementException e) {
//            e.printStackTrace();
//            ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
//            CommonUtils.selectDropDownValue(ras_Screener_TestDataManager.countryOption, rasopathyQuestionnairePage.whatCountryDoesParticipantCurrentlyLiveInDropDown);
//            CucumberLogUtils.logScreenshot();
//        }
//        ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
//        try {
//            rasopathyQuestionnairePage.dynamicTextBoxLocator(ras_Screener_Constants.STREET_ADDRESS).sendKeys(ras_Screener_TestDataManager.street);
//            rasopathyQuestionnairePage.dynamicTextBoxLocator(ras_Screener_Constants.STREET_2_ADDRESS).sendKeys(ras_Screener_TestDataManager.street2);
//            rasopathyQuestionnairePage.dynamicTextBoxLocator(ras_Screener_Constants.CITY_TEXT).sendKeys(ras_Screener_TestDataManager.city);
//            rasopathyQuestionnairePage.dynamicTextBoxLocator(ras_Screener_Constants.STATE_TEXT).sendKeys(ras_Screener_TestDataManager.state);
//            rasopathyQuestionnairePage.dynamicTextBoxLocator(ras_Screener_Constants.ZIP_CODE_TEXT).sendKeys(ras_Screener_TestDataManager.zipcode);
//            CucumberLogUtils.logScreenshot();
//        } catch (NoSuchElementException e) {
//            e.printStackTrace();
//            ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
//            rasopathyQuestionnairePage.dynamicTextBoxLocator(ras_Screener_Constants.STREET_ADDRESS).sendKeys(ras_Screener_TestDataManager.street);
//            rasopathyQuestionnairePage.dynamicTextBoxLocator(ras_Screener_Constants.STREET_2_ADDRESS).sendKeys(ras_Screener_TestDataManager.street2);
//            rasopathyQuestionnairePage.dynamicTextBoxLocator(ras_Screener_Constants.CITY_TEXT).sendKeys(ras_Screener_TestDataManager.city);
//            rasopathyQuestionnairePage.dynamicTextBoxLocator(ras_Screener_Constants.STATE_TEXT).sendKeys(ras_Screener_TestDataManager.state);
//            rasopathyQuestionnairePage.dynamicTextBoxLocator(ras_Screener_Constants.ZIP_CODE_TEXT).sendKeys(ras_Screener_TestDataManager.zipcode);
//            CucumberLogUtils.logScreenshot();
//        }
//        ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
//        try {
//            CommonUtils.waitForVisibility(rasopathyQuestionnairePage.dynamicEmailAddressTextBox(ras_Screener_Constants.EMAIL_ADDRESS));
//            rasopathyQuestionnairePage.dynamicEmailAddressTextBox(ras_Screener_Constants.EMAIL_ADDRESS).sendKeys(ras_Screener_TestDataManager.emailAddress);
//            CucumberLogUtils.logScreenshot();
//        } catch (NoSuchElementException e) {
//            e.printStackTrace();
//            ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
//            rasopathyQuestionnairePage.dynamicEmailAddressTextBox(ras_Screener_Constants.EMAIL_ADDRESS).sendKeys(ras_Screener_TestDataManager.emailAddress);
//            CucumberLogUtils.logScreenshot();
//        }
//        ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
//        try {
//            CommonUtils.waitForVisibility(rasopathyQuestionnairePage.dynamicEmailAddressTextBox(ras_Screener_Constants.CONFIRM_EMAIL_ADDRESS));
//            rasopathyQuestionnairePage.dynamicEmailAddressTextBox(ras_Screener_Constants.CONFIRM_EMAIL_ADDRESS).sendKeys(ras_Screener_TestDataManager.emailAddressConfirm);
//            CucumberLogUtils.logScreenshot();
//        } catch (NoSuchElementException e) {
//            e.printStackTrace();
//            ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
//            rasopathyQuestionnairePage.dynamicEmailAddressTextBox(ras_Screener_Constants.CONFIRM_EMAIL_ADDRESS).sendKeys(ras_Screener_TestDataManager.emailAddressConfirm);
//            CucumberLogUtils.logScreenshot();
//        }
//        ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
//        try {
//            rasopathyQuestionnairePage.dynamicTextBoxLocatorForPhoneNumbers(ras_Screener_Constants.HOME_PHONE_NUMBER).sendKeys(ras_Screener_TestDataManager.homePhoneNumber);
//            rasopathyQuestionnairePage.dynamicTextBoxLocatorForPhoneNumbers(ras_Screener_Constants.CELL_PHONE_NUMBER).sendKeys(ras_Screener_TestDataManager.cellPhoneNumber);
//            rasopathyQuestionnairePage.dynamicTextBoxLocatorForPhoneNumbers(ras_Screener_Constants.WORK_PHONE_NUMBER).sendKeys(ras_Screener_TestDataManager.workPhoneNumber);
//            rasopathyQuestionnairePage.dynamicPhoneNumberCheckBox(ras_Screener_Constants.CELL_PHONE_NUMBER).click();
//            CucumberLogUtils.logScreenshot();
//        } catch (NoSuchFrameException e) {
//            e.printStackTrace();
//            ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
//            rasopathyQuestionnairePage.dynamicTextBoxLocatorForPhoneNumbers(ras_Screener_Constants.HOME_PHONE_NUMBER).sendKeys(ras_Screener_TestDataManager.homePhoneNumber);
//            rasopathyQuestionnairePage.dynamicTextBoxLocatorForPhoneNumbers(ras_Screener_Constants.CELL_PHONE_NUMBER).sendKeys(ras_Screener_TestDataManager.cellPhoneNumber);
//            rasopathyQuestionnairePage.dynamicTextBoxLocatorForPhoneNumbers(ras_Screener_Constants.WORK_PHONE_NUMBER).sendKeys(ras_Screener_TestDataManager.workPhoneNumber);
//            rasopathyQuestionnairePage.dynamicPhoneNumberCheckBox(ras_Screener_Constants.CELL_PHONE_NUMBER).click();
//            CucumberLogUtils.logScreenshot();
//        }
//        ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
//        try {
//            rasopathyQuestionnairePage.dynamicLocator(ras_Screener_TestDataManager.whatIsYourEthnicity).click();
//        } catch (NoSuchElementException e) {
//            e.printStackTrace();
//            ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
//            rasopathyQuestionnairePage.dynamicLocator(ras_Screener_TestDataManager.whatIsYourEthnicity).click();
//        }
//        ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
//        try {
//            rasopathyQuestionnairePage.dynamicLocator(ras_Screener_TestDataManager.whatIsYourRace).click();
//            CucumberLogUtils.logScreenshot();
//        } catch (NoSuchElementException e) {
//            e.printStackTrace();
//            ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
//            rasopathyQuestionnairePage.dynamicLocator(ras_Screener_TestDataManager.whatIsYourRace).click();
//            CucumberLogUtils.logScreenshot();
//        }
//        ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
//        try {
//            rasopathyQuestionnairePage.dynamicLocator(ras_Screener_TestDataManager.areYouAParticipantInOtherStudyGroup).click();
//            CucumberLogUtils.logScreenshot();
//        } catch (NoSuchElementException e) {
//            ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
//            rasopathyQuestionnairePage.dynamicLocator(ras_Screener_TestDataManager.whatIsYourRace).click();
//            CucumberLogUtils.logScreenshot();
//        }
//        ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
//        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(26));
////        CommonUtils.assertEqualsWithMessage(ras_Screener_TestDataManager.toDetermineEligibilityForThisStudy, myRASSurveyPage.rasScreenerText.getText(), "-- VERIFYING TO DETERMINE ELIGIBILITY FOR THIS STUDY TEXT --");
//        CucumberLogUtils.logScreenshot();
//        ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
//        try {
//            rasopathyQuestionnairePage.dynamicLocator(ras_Screener_TestDataManager.haveYouBeenDiagnosedWithFollowingConditions).click();
//            CucumberLogUtils.logScreenshot();
//        } catch (NoSuchElementException e) {
//            e.printStackTrace();
//            ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
//            rasopathyQuestionnairePage.dynamicLocator(ras_Screener_TestDataManager.haveYouBeenDiagnosedWithFollowingConditions).click();
//            CucumberLogUtils.logScreenshot();
//        }
//        ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
//        CucumberLogUtils.logScreenshot();
//        try {
//            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(117));
//            rasopathyQuestionnairePage.dynamicLocator(ras_Screener_TestDataManager.haveYouBeenDiagnosedWithCancer).click();
//            CucumberLogUtils.logScreenshot();
//        } catch (NoSuchElementException e) {
//            ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
//            rasopathyQuestionnairePage.dynamicLocator(ras_Screener_TestDataManager.haveYouBeenDiagnosedWithCancer).click();
//            CucumberLogUtils.logScreenshot();
//        }
//        ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
//        try {
//            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(118));
//            CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicLocator(ras_Screener_TestDataManager.haveYouBeenDiagnosedWithARasopathy));
//            CucumberLogUtils.logScreenshot();
//        } catch (NoSuchElementException e) {
//            ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
//            rasopathyQuestionnairePage.dynamicLocator(ras_Screener_TestDataManager.haveYouBeenDiagnosedWithARasopathy).click();
//            CucumberLogUtils.logScreenshot();
//        }
//        ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
//        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(101));
//        CommonUtils.assertEqualsWithMessage(ras_Screener_TestDataManager.weKnowThatRASopathiesAreAGroup, myRASSurveyPage.dynamicTopText(101).getText(), "-- VERIFYING WE KNOW THAT RASOPATHIES ARE A GROUP TEXT --");
//        CucumberLogUtils.logScreenshot();
//        ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
//        try {
//            CommonUtils.waitForVisibility(rasopathyQuestionnairePage.haveAnyOfYourRelativesBeenDiagnosedNoRadioButton);
//            CommonUtils.clickOnElement(rasopathyQuestionnairePage.haveAnyOfYourRelativesBeenDiagnosedNoRadioButton);
//            CucumberLogUtils.logScreenshot();
//        } catch (NoSuchElementException e) {
//            e.printStackTrace();
//            ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
//            CommonUtils.clickOnElement(rasopathyQuestionnairePage.haveAnyOfYourRelativesBeenDiagnosedNoRadioButton);
//            CucumberLogUtils.logScreenshot();
//        }
//        ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
//        try {
//            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(120));
//            CommonUtils.clickOnElement(rasopathyQuestionnairePage.haveYouEverHadGeneticTestingNoRadioButton);
//            CucumberLogUtils.logScreenshot();
//        } catch (NoSuchElementException e) {
//            e.printStackTrace();
//            ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
//            CommonUtils.clickOnElement(rasopathyQuestionnairePage.haveYouEverHadGeneticTestingNoRadioButton);
//            CucumberLogUtils.logScreenshot();
//        }
//        ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
//        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(69));
//        CommonUtils.assertEqualsWithMessage(ras_Screener_TestDataManager.weWillNowAskAFewRemainingQuestionsRegarding, myRASSurveyPage.rasScreenerText.getText(), "-- VERIFYING WE WILL NOW ASK A FEW REMAINING QUESTIONS TEXT --");
//        CucumberLogUtils.logScreenshot();
//        ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
//
//        try {
//            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(126));
//            CommonUtils.scrollIntoView(rasopathyQuestionnairePage.dynamicLocator(ras_Screener_TestDataManager.howDidYouHearAboutThisStudy));
//            CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicLocator(ras_Screener_TestDataManager.howDidYouHearAboutThisStudy));
//            rasopathyQuestionnairePage.dynamicLocatorForHowDidYouHearAboutStudyTextBoxes(ras_Screener_TestDataManager.howDidYouHearAboutThisStudy).sendKeys(ras_Screener_TestDataManager.howDidYouHearAboutThisStudyOtherReason);
//            CucumberLogUtils.logScreenshot();
//        } catch (NoSuchElementException e) {
//            e.printStackTrace();
//            ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
//            CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicTextBoxLocator(ras_Screener_TestDataManager.howDidYouHearAboutThisStudy));
//            rasopathyQuestionnairePage.dynamicLocatorForHowDidYouHearAboutStudyTextBoxes(ras_Screener_TestDataManager.howDidYouHearAboutThisStudy).sendKeys(ras_Screener_TestDataManager.howDidYouHearAboutThisStudyOtherReason);
//            CucumberLogUtils.logScreenshot();
//        }
//        ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
//        try {
//            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(71));
//            CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicLocator(ras_Screener_TestDataManager.haveYouOrOtherFamilyMembersParticipatedInOtherStudy));
//            CucumberLogUtils.logScreenshot();
//        } catch (NoSuchElementException e) {
//            e.printStackTrace();
//            ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
//            CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicLocator(ras_Screener_TestDataManager.haveYouOrOtherFamilyMembersParticipatedInOtherStudy));
//            CucumberLogUtils.logScreenshot();
//        }
//        ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
//        try {
//            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(81));
//            CommonUtils.scrollIntoView(rasopathyQuestionnairePage.dynamicLocator(ras_Screener_TestDataManager.whatAreMainReasonsForParticipatingInStudy));
//            CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicLocator(ras_Screener_TestDataManager.whatAreMainReasonsForParticipatingInStudy));
//            System.out.println();
//            rasopathyQuestionnairePage.dynamicLocatorForMainReasonForParticipatingInStudy(ras_Screener_TestDataManager.whatAreMainReasonsForParticipatingInStudy).sendKeys(ras_Screener_TestDataManager.whatAreMainReasonsForParticipatingInStudyOtherReason);
//            CucumberLogUtils.logScreenshot();
//        } catch (NoSuchElementException e) {
//            e.printStackTrace();
//            ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
//            CommonUtils.scrollIntoView(rasopathyQuestionnairePage.dynamicLocator(ras_Screener_TestDataManager.whatAreMainReasonsForParticipatingInStudy));
//            CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicLocator(ras_Screener_TestDataManager.whatAreMainReasonsForParticipatingInStudy));
//            rasopathyQuestionnairePage.dynamicLocatorForMainReasonForParticipatingInStudy(ras_Screener_TestDataManager.whatAreMainReasonsForParticipatingInStudy).sendKeys(ras_Screener_TestDataManager.whatAreMainReasonsForParticipatingInStudyOtherReason);
//            CucumberLogUtils.logScreenshot();
//        }
//        ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
//        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(91));
//        CommonUtils.assertEqualsWithMessage(ras_Screener_TestDataManager.youAreAlmostDone, myRASSurveyPage.rasScreenerText.getText(), "-- VERIFYING YOU ARE ALMOST DONE TEXT --");
//        CucumberLogUtils.logScreenshot();
//        ras_screenerSubmissions_stepsImpl.clickOnScreenerNextButton();
//        MiscUtils.sleep(3000);
//        CucumberLogUtils.logScreenshot();
//        MiscUtils.sleep(1000);
//        ServiceNow_Common_Methods.logOutOfNativeView();
//    }
}
