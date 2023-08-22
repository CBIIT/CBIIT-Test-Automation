package ServiceNow.CHARMS.StepsImplementation;

import appsCommon.PageInitializer;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;

public class RasScenario4StepsImpl extends PageInitializer {

    /***
     * USE THIS METHOD WILL COMPLETE THE RAS SCREENER SCENARIO 4
     */
    public void rasScreenerSubmissionScenario4() {
        CommonUtils.switchToNextWindow();
        MiscUtils.sleep(2000);
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.scrollIntoView(rasopathyQuestionnairePage.studyNextButton);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        MiscUtils.sleep(2000);
        if(!rasopathyQuestionnairePage.iAmCompletingThisFormForMyselfOption.isDisplayed()){
            rasScenario1StepsImpl.clickOnScreenerNextButton();
        }
        try {
            rasopathyQuestionnairePage.dynamicLocator(ras_Screener_TestDataManager.areYouCompletingThisFormForSomeoneElseOrYourself).click();
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScenario1StepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicLocator(ras_Screener_TestDataManager.areYouCompletingThisFormForSomeoneElseOrYourself).click();
            CucumberLogUtils.logScreenshot();
        }
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            rasopathyQuestionnairePage.dynamicTextBoxLocator(ras_Screener_Constants.FIRST_NAME).sendKeys(ras_Screener_TestDataManager.whatIsTheNameOfThePersonWhoMayBeEligibleForThisStudyFirst);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(ras_Screener_Constants.MIDDLE_INITIAL).sendKeys(ras_Screener_TestDataManager.whatIsTheNameOfThePersonWhoMayBeEligibleForThisStudyMi);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(ras_Screener_Constants.LAST_NAME).sendKeys(ras_Screener_TestDataManager.whatIsTheNameOfThePersonWhoMayBeEligibleForThisStudyLast);
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScenario1StepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicTextBoxLocator(ras_Screener_Constants.FIRST_NAME).sendKeys(ras_Screener_TestDataManager.whatIsTheNameOfThePersonWhoMayBeEligibleForThisStudyFirst);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(ras_Screener_Constants.MIDDLE_INITIAL).sendKeys(ras_Screener_TestDataManager.whatIsTheNameOfThePersonWhoMayBeEligibleForThisStudyMi);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(ras_Screener_Constants.LAST_NAME).sendKeys(ras_Screener_TestDataManager.whatIsTheNameOfThePersonWhoMayBeEligibleForThisStudyLast);
            CucumberLogUtils.logScreenshot();
        }
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(3));
            rasopathyQuestionnairePage.dynamicTextBoxLocator(ras_Screener_Constants.FIRST_NAME).sendKeys(ras_Screener_TestDataManager.firstName);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(ras_Screener_Constants.MIDDLE_INITIAL).sendKeys(ras_Screener_TestDataManager.middleInitial);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(ras_Screener_Constants.LAST_NAME).sendKeys(ras_Screener_TestDataManager.lastName);
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScenario1StepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicTextBoxLocator(ras_Screener_Constants.FIRST_NAME).sendKeys(ras_Screener_TestDataManager.firstName);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(ras_Screener_Constants.MIDDLE_INITIAL).sendKeys(ras_Screener_TestDataManager.middleInitial);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(ras_Screener_Constants.LAST_NAME).sendKeys(ras_Screener_TestDataManager.lastName);
            CucumberLogUtils.logScreenshot();
        }
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            CommonUtils.waitForVisibility(rasopathyQuestionnairePage.dynamicLocator(ras_Screener_TestDataManager.whatIsYourRelationshipToTheProband));
            rasopathyQuestionnairePage.dynamicLocator(ras_Screener_TestDataManager.whatIsYourRelationshipToTheProband).click();
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScenario1StepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicLocator(ras_Screener_TestDataManager.whatIsYourRelationshipToTheProband).click();
            CucumberLogUtils.logScreenshot();
        }
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            CommonUtils.waitForVisibility(rasopathyQuestionnairePage.dynamicLocator(ras_Screener_TestDataManager.areYouTheLegalGuardianOfTheProband));
            rasopathyQuestionnairePage.dynamicLocator(ras_Screener_TestDataManager.areYouTheLegalGuardianOfTheProband).click();
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScenario1StepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicLocator(ras_Screener_TestDataManager.areYouTheLegalGuardianOfTheProband).click();
            CucumberLogUtils.logScreenshot();
        }
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(83));
        CommonUtils.assertEqualsWithMessage(ras_Screener_TestDataManager.theNextSetOfQuestionsWillCollectBasicInformationAboutTheProband + ras_Screener_TestDataManager.whatIsTheNameOfThePersonWhoMayBeEligibleForThisStudyFirst + " " + ras_Screener_TestDataManager.whatIsTheNameOfThePersonWhoMayBeEligibleForThisStudyLast + ".  ", myRASSurveyPage.rasScreenerText.getText(), "-- VERIFYING THE NEXT SET OF QUESTIONS WILL COLLECT BASIC INFORMATION ABOUT THE PROBAND TEXT --");
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            rasopathyQuestionnairePage.calendarYearTextBox.clear();
            rasopathyQuestionnairePage.calendarYearTextBox.sendKeys(ras_Screener_TestDataManager.dateOfBirthYear);
            CommonUtils.selectDropDownValue(ras_Screener_TestDataManager.dateOfBirthMonth, rasopathyQuestionnairePage.calendarMonthDropDown);
            rasopathyQuestionnairePage.calendarDayOption.click();
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScenario1StepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.calendarYearTextBox.clear();
            rasopathyQuestionnairePage.calendarYearTextBox.sendKeys(ras_Screener_TestDataManager.dateOfBirthYear);
            CommonUtils.selectDropDownValue(ras_Screener_TestDataManager.dateOfBirthMonth, rasopathyQuestionnairePage.calendarMonthDropDown);
            rasopathyQuestionnairePage.calendarDayOption.click();
            CucumberLogUtils.logScreenshot();
        }
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            rasopathyQuestionnairePage.dynamicLocator(ras_Screener_TestDataManager.sexAssignedAtBirthOption).click();
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScenario1StepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicLocator(ras_Screener_TestDataManager.sexAssignedAtBirthOption).click();
            CucumberLogUtils.logScreenshot();
        }
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            rasopathyQuestionnairePage.dynamicLocator(ras_Screener_TestDataManager.areYouAdoptedOption).click();
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScenario1StepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicLocator(ras_Screener_TestDataManager.areYouAdoptedOption).click();
            CucumberLogUtils.logScreenshot();
        }
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(12));
            CommonUtils.waitForVisibility(rasopathyQuestionnairePage.dynamicLocator(ras_Screener_TestDataManager.isTheProbandAlive));
            rasopathyQuestionnairePage.dynamicLocator(ras_Screener_TestDataManager.isTheProbandAlive).click();
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScenario1StepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicLocator(ras_Screener_TestDataManager.isTheProbandAlive).click();
            CucumberLogUtils.logScreenshot();
        }
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            CommonUtils.selectDropDownValue(ras_Screener_TestDataManager.countryOption, rasopathyQuestionnairePage.whatCountryDoesParticipantCurrentlyLiveInDropDown);
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScenario1StepsImpl.clickOnScreenerNextButton();
            CommonUtils.selectDropDownValue(ras_Screener_TestDataManager.countryOption, rasopathyQuestionnairePage.whatCountryDoesParticipantCurrentlyLiveInDropDown);
            CucumberLogUtils.logScreenshot();
        }
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            rasopathyQuestionnairePage.dynamicTextBoxLocator(ras_Screener_Constants.STREET_ADDRESS).sendKeys(ras_Screener_TestDataManager.street);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(ras_Screener_Constants.STREET_2_ADDRESS).sendKeys(ras_Screener_TestDataManager.street2);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(ras_Screener_Constants.CITY_TEXT).sendKeys(ras_Screener_TestDataManager.city);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(ras_Screener_Constants.STATE_TEXT).sendKeys(ras_Screener_TestDataManager.state);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(ras_Screener_Constants.ZIP_CODE_TEXT).sendKeys(ras_Screener_TestDataManager.zipcode);
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScenario1StepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicTextBoxLocator(ras_Screener_Constants.STREET_ADDRESS).sendKeys(ras_Screener_TestDataManager.street);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(ras_Screener_Constants.STREET_2_ADDRESS).sendKeys(ras_Screener_TestDataManager.street2);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(ras_Screener_Constants.CITY_TEXT).sendKeys(ras_Screener_TestDataManager.city);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(ras_Screener_Constants.STATE_TEXT).sendKeys(ras_Screener_TestDataManager.state);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(ras_Screener_Constants.ZIP_CODE_TEXT).sendKeys(ras_Screener_TestDataManager.zipcode);
            CucumberLogUtils.logScreenshot();
        }
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            CommonUtils.waitForVisibility(rasopathyQuestionnairePage.dynamicEmailAddressTextBox(ras_Screener_Constants.EMAIL_ADDRESS));
            rasopathyQuestionnairePage.dynamicEmailAddressTextBox(ras_Screener_Constants.EMAIL_ADDRESS).sendKeys(ras_Screener_TestDataManager.emailAddress);
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScenario1StepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicEmailAddressTextBox(ras_Screener_Constants.EMAIL_ADDRESS).sendKeys(ras_Screener_TestDataManager.emailAddress);
            CucumberLogUtils.logScreenshot();
        }
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            CommonUtils.waitForVisibility(rasopathyQuestionnairePage.dynamicEmailAddressTextBox(ras_Screener_Constants.CONFIRM_EMAIL_ADDRESS));
            rasopathyQuestionnairePage.dynamicEmailAddressTextBox(ras_Screener_Constants.CONFIRM_EMAIL_ADDRESS).sendKeys(ras_Screener_TestDataManager.emailAddressConfirm);
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScenario1StepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicEmailAddressTextBox(ras_Screener_Constants.CONFIRM_EMAIL_ADDRESS).sendKeys(ras_Screener_TestDataManager.emailAddressConfirm);
            CucumberLogUtils.logScreenshot();
        }
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            rasopathyQuestionnairePage.dynamicTextBoxLocatorForPhoneNumbers(ras_Screener_Constants.HOME_PHONE_NUMBER).sendKeys(ras_Screener_TestDataManager.homePhoneNumber);
            rasopathyQuestionnairePage.dynamicTextBoxLocatorForPhoneNumbers(ras_Screener_Constants.CELL_PHONE_NUMBER).sendKeys(ras_Screener_TestDataManager.cellPhoneNumber);
            rasopathyQuestionnairePage.dynamicTextBoxLocatorForPhoneNumbers(ras_Screener_Constants.WORK_PHONE_NUMBER).sendKeys(ras_Screener_TestDataManager.workPhoneNumber);
            rasopathyQuestionnairePage.dynamicPhoneNumberCheckBox(ras_Screener_Constants.CELL_PHONE_NUMBER).click();
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchFrameException e) {
            e.printStackTrace();
            rasScenario1StepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicTextBoxLocatorForPhoneNumbers(ras_Screener_Constants.HOME_PHONE_NUMBER).sendKeys(ras_Screener_TestDataManager.homePhoneNumber);
            rasopathyQuestionnairePage.dynamicTextBoxLocatorForPhoneNumbers(ras_Screener_Constants.CELL_PHONE_NUMBER).sendKeys(ras_Screener_TestDataManager.cellPhoneNumber);
            rasopathyQuestionnairePage.dynamicTextBoxLocatorForPhoneNumbers(ras_Screener_Constants.WORK_PHONE_NUMBER).sendKeys(ras_Screener_TestDataManager.workPhoneNumber);
            rasopathyQuestionnairePage.dynamicPhoneNumberCheckBox(ras_Screener_Constants.CELL_PHONE_NUMBER).click();
            CucumberLogUtils.logScreenshot();
        }
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            rasopathyQuestionnairePage.dynamicLocator(ras_Screener_TestDataManager.whatIsYourEthnicity).click();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScenario1StepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicLocator(ras_Screener_TestDataManager.whatIsYourEthnicity).click();
        }
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            rasopathyQuestionnairePage.dynamicLocator(ras_Screener_TestDataManager.whatIsYourRace).click();
            CommonUtils.sendKeysToElement(myRASSurveyPage.dynamicPleaseSpecifyTextBox(ras_Screener_TestDataManager.whatIsYourRace), ras_Screener_TestDataManager.whatIsYourRaceOther);
            CucumberLogUtils.logScreenshot();
         } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScenario1StepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicLocator(ras_Screener_TestDataManager.whatIsYourRace).click();
            CommonUtils.sendKeysToElement(myRASSurveyPage.dynamicPleaseSpecifyTextBox(ras_Screener_TestDataManager.whatIsYourRace), ras_Screener_TestDataManager.whatIsYourRaceOther);
            CucumberLogUtils.logScreenshot();
        }
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(ras_Screener_TestDataManager.isTheProbandAParticipantInAnyOtherResearchStudyOrRegistryGroupOption1));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Screener_TestDataManager.isTheProbandAParticipantInAnyOtherResearchStudyOrRegistryGroupOption1));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Screener_TestDataManager.isTheProbandAParticipantInAnyOtherResearchStudyOrRegistryGroupOption2));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Screener_TestDataManager.isTheProbandAParticipantInAnyOtherResearchStudyOrRegistryGroupOption3));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Screener_TestDataManager.isTheProbandAParticipantInAnyOtherResearchStudyOrRegistryGroupOption4));
        myRASSurveyPage.dynamicPleaseSpecifyTextBox(ras_Screener_TestDataManager.isTheProbandAParticipantInAnyOtherResearchStudyOrRegistryGroupOption2).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.dynamicPleaseSpecifyTextBox(ras_Screener_TestDataManager.isTheProbandAParticipantInAnyOtherResearchStudyOrRegistryGroupOption2), ras_Screener_TestDataManager.isTheProbandAParticipantInAnyOtherResearchStudyOrRegistryGroupOption2Other);
        myRASSurveyPage.dynamicPleaseSpecifyTextBox(ras_Screener_TestDataManager.isTheProbandAParticipantInAnyOtherResearchStudyOrRegistryGroupOption3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.dynamicPleaseSpecifyTextBox(ras_Screener_TestDataManager.isTheProbandAParticipantInAnyOtherResearchStudyOrRegistryGroupOption3), ras_Screener_TestDataManager.isTheProbandAParticipantInAnyOtherResearchStudyOrRegistryGroupOption3Other);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(26));
        CommonUtils.assertEqualsWithMessage(ras_Screener_TestDataManager.toDetermineEligibilityForThisStudy, myRASSurveyPage.rasScreenerText.getText(), "-- VERIFYING TO DETERMINE ELIGIBILITY FOR THIS STUDY TEXT --");
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(31));
        for(int z = 1; z < 12 ; z++) {
            CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicClickOnCheckboxesScreener(z));
        }
        JavascriptUtils.scrollIntoView(rasopathyQuestionnairePage.dynamicEnterTextOnCheckboxesScreener(11));
        rasopathyQuestionnairePage.dynamicEnterTextOnCheckboxesScreener(11).clear();
        CommonUtils.sendKeysToElement(rasopathyQuestionnairePage.dynamicEnterTextOnCheckboxesScreener(11), ras_Screener_TestDataManager.haveYouEverBeenDiagnosedWithTheFollowingConditionsOption11Other);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            rasopathyQuestionnairePage.dynamicLocator(ras_Screener_TestDataManager.haveYouBeenDiagnosedWithCancer).click();
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            rasScenario1StepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicLocator(ras_Screener_TestDataManager.haveYouBeenDiagnosedWithCancer).click();
            CucumberLogUtils.logScreenshot();
        }
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        CommonUtils.waitForClickability(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 6));
        CommonUtils.selectDropDownValue(ras_Screener_TestDataManager.pleaseCompleteTheBoxBelowBySelectingWhichPrimaryCancersColumn1Option1, myRASSurveyPage.selectFromDynamicdropDown(1));
        CommonUtils.selectDropDownValue(ras_Screener_TestDataManager.pleaseCompleteTheBoxBelowBySelectingWhichPrimaryCancersColumn1Option2, myRASSurveyPage.selectFromDynamicdropDown(2));
        CommonUtils.selectDropDownValue(ras_Screener_TestDataManager.pleaseCompleteTheBoxBelowBySelectingWhichPrimaryCancersColumn1Option3, myRASSurveyPage.selectFromDynamicdropDown(3));
        CommonUtils.selectDropDownValue(ras_Screener_TestDataManager.pleaseCompleteTheBoxBelowBySelectingWhichPrimaryCancersColumn1Option4, myRASSurveyPage.selectFromDynamicdropDown(4));
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1 , 6).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1 , 6), ras_Screener_TestDataManager.pleaseCompleteTheBoxBelowBySelectingWhichPrimaryCancersColumn2Option1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2 , 6).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2 , 6), ras_Screener_TestDataManager.pleaseCompleteTheBoxBelowBySelectingWhichPrimaryCancersColumn2Option2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3 , 6).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3 , 6), ras_Screener_TestDataManager.pleaseCompleteTheBoxBelowBySelectingWhichPrimaryCancersColumn2Option3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4 , 6).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4 , 6), ras_Screener_TestDataManager.pleaseCompleteTheBoxBelowBySelectingWhichPrimaryCancersColumn2Option4);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1 , 9).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1 , 9), ras_Screener_TestDataManager.pleaseCompleteTheBoxBelowBySelectingWhichPrimaryCancersColumn3Option1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2 , 9).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2 , 9), ras_Screener_TestDataManager.pleaseCompleteTheBoxBelowBySelectingWhichPrimaryCancersColumn3Option2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3 , 9).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3 , 9), ras_Screener_TestDataManager.pleaseCompleteTheBoxBelowBySelectingWhichPrimaryCancersColumn3Option3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4 , 9).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4 , 9), ras_Screener_TestDataManager.pleaseCompleteTheBoxBelowBySelectingWhichPrimaryCancersColumn3Option4);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1 , 12).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1 , 12), ras_Screener_TestDataManager.pleaseCompleteTheBoxBelowBySelectingWhichPrimaryCancersColumn4Option1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2 , 12).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2 , 12), ras_Screener_TestDataManager.pleaseCompleteTheBoxBelowBySelectingWhichPrimaryCancersColumn4Option2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3 , 12).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3 , 12), ras_Screener_TestDataManager.pleaseCompleteTheBoxBelowBySelectingWhichPrimaryCancersColumn4Option3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4 , 12).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4 , 12), ras_Screener_TestDataManager.pleaseCompleteTheBoxBelowBySelectingWhichPrimaryCancersColumn4Option4);
        CommonUtils.clickOnElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(1,15));
        CommonUtils.clickOnElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(2,15));
        CommonUtils.clickOnElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(3,15));
        CommonUtils.clickOnElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(4,15));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        CommonUtils.waitForVisibility(rasopathyQuestionnairePage.dynamicLocator(ras_Screener_TestDataManager.haveYouBeenDiagnosedWithARasopathy));
        CommonUtils.clickOnElement(myRASSurveyPage.rasSurveyYesRadioButton);
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicPleaseSpecifyTextBox(ras_Screener_TestDataManager.forWhichSpecificRASopathy));
        myRASSurveyPage.dynamicPleaseSpecifyTextBox(ras_Screener_TestDataManager.forWhichSpecificRASopathy).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.dynamicPleaseSpecifyTextBox(ras_Screener_TestDataManager.forWhichSpecificRASopathy), ras_Screener_TestDataManager.forWhichSpecificRASopathyOther);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopTextBox(29));
        myRASSurveyPage.dynamicTopTextBox(29).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.dynamicTopTextBox(29), ras_Screener_TestDataManager.ageAtDiagnosis);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopTextBox(30));
        myRASSurveyPage.dynamicTopTextBox(30).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.dynamicTopTextBox(30), ras_Screener_TestDataManager.yearOfDiagnosisRas);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(124));
        CommonUtils.assertEqualsWithMessage(ras_Screener_TestDataManager.weKnowThatRASopathiesAreAGroup, myRASSurveyPage.dynamicTopText(124).getText(), "-- VERIFYING WE KNOW THAT RASOPATHIES ARE A GROUP TEXT --");
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(123));
        CommonUtils.clickOnElement(myRASSurveyPage.rasSurveyYesRadioButton);
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(36));
        CommonUtils.clickOnElement(myRASSurveyPage.rasSurveyYesRadioButton);
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(102));
            rasopathyQuestionnairePage.dynamicLocator(ras_Screener_TestDataManager.doYouHaveACopyOfTheGenetic).click();
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            rasScenario1StepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicLocator(ras_Screener_TestDataManager.doYouHaveACopyOfTheGenetic).click();
            CucumberLogUtils.logScreenshot();
        }
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(125));
            rasopathyQuestionnairePage.dynamicLocator(ras_Screener_TestDataManager.howWouldYouLikeToProvideTheGeneticTest).click();
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            rasScenario1StepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicLocator(ras_Screener_TestDataManager.howWouldYouLikeToProvideTheGeneticTest).click();
            CucumberLogUtils.logScreenshot();
        }
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(41));
        //*** ATTACHING FILE CAN'T BE AUTOMATED IN QUATRICS. MANUAL TESTING WAS PERFORMED FOR UPLOADING A FILE *******
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(40));
        for(int a = 1; a < 9 ; a++) {
            CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicClickOnCheckboxesScreener(a));
        }
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(69));
        CommonUtils.assertEqualsWithMessage(ras_Screener_TestDataManager.weWillNowAskAFewRemainingQuestionsRegarding, myRASSurveyPage.rasScreenerText.getText(), "-- VERIFYING WE WILL NOW ASK A FEW REMAINING QUESTIONS TEXT --");
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(70));
            CommonUtils.scrollIntoView(rasopathyQuestionnairePage.dynamicLocator(ras_Screener_TestDataManager.howDidYouHearAboutThisStudy));
            CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicLocator(ras_Screener_TestDataManager.howDidYouHearAboutThisStudy));
            rasopathyQuestionnairePage.dynamicLocatorForHowDidYouHearAboutStudyTextBoxes(ras_Screener_TestDataManager.howDidYouHearAboutThisStudy).sendKeys(ras_Screener_TestDataManager.howDidYouHearAboutThisStudyOtherReason);
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScenario1StepsImpl.clickOnScreenerNextButton();
            CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicTextBoxLocator(ras_Screener_TestDataManager.howDidYouHearAboutThisStudy));
            rasopathyQuestionnairePage.dynamicLocatorForHowDidYouHearAboutStudyTextBoxes(ras_Screener_TestDataManager.howDidYouHearAboutThisStudy).sendKeys(ras_Screener_TestDataManager.howDidYouHearAboutThisStudyOtherReason);
            CucumberLogUtils.logScreenshot();
        }
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(127));
            CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicLocator(ras_Screener_TestDataManager.haveYouOrOtherFamilyMembersParticipatedInOtherStudy));
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScenario1StepsImpl.clickOnScreenerNextButton();
            CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicLocator(ras_Screener_TestDataManager.haveYouOrOtherFamilyMembersParticipatedInOtherStudy));
            CucumberLogUtils.logScreenshot();
        }
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(97));
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3), ras_Screener_TestDataManager.pleaseProvideTheInformationRegardingPreviousParticipationColumn1Option1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 6).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 6), ras_Screener_TestDataManager.pleaseProvideTheInformationRegardingPreviousParticipationColumn2Option1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 9).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 9), ras_Screener_TestDataManager.pleaseProvideTheInformationRegardingPreviousParticipationColumn3Option1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 12).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 12), ras_Screener_TestDataManager.pleaseProvideTheInformationRegardingPreviousParticipationColumn4Option1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 15).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 15), ras_Screener_TestDataManager.pleaseProvideTheInformationRegardingPreviousParticipationColumn5Option1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 16).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 16), ras_Screener_TestDataManager.pleaseProvideTheInformationRegardingPreviousParticipationColumn6Option1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 3), ras_Screener_TestDataManager.pleaseProvideTheInformationRegardingPreviousParticipationColumn1Option2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 6).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 6), ras_Screener_TestDataManager.pleaseProvideTheInformationRegardingPreviousParticipationColumn2Option2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 9).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 9), ras_Screener_TestDataManager.pleaseProvideTheInformationRegardingPreviousParticipationColumn3Option2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 12).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 12), ras_Screener_TestDataManager.pleaseProvideTheInformationRegardingPreviousParticipationColumn4Option2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 15).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 15), ras_Screener_TestDataManager.pleaseProvideTheInformationRegardingPreviousParticipationColumn5Option2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 16).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 16), ras_Screener_TestDataManager.pleaseProvideTheInformationRegardingPreviousParticipationColumn6Option2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 3), ras_Screener_TestDataManager.pleaseProvideTheInformationRegardingPreviousParticipationColumn1Option3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 6).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 6), ras_Screener_TestDataManager.pleaseProvideTheInformationRegardingPreviousParticipationColumn2Option3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 9).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 9), ras_Screener_TestDataManager.pleaseProvideTheInformationRegardingPreviousParticipationColumn3Option3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 12).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 12), ras_Screener_TestDataManager.pleaseProvideTheInformationRegardingPreviousParticipationColumn4Option3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 15).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 15), ras_Screener_TestDataManager.pleaseProvideTheInformationRegardingPreviousParticipationColumn5Option3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 16).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 16), ras_Screener_TestDataManager.pleaseProvideTheInformationRegardingPreviousParticipationColumn6Option3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 3), ras_Screener_TestDataManager.pleaseProvideTheInformationRegardingPreviousParticipationColumn1Option4);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 6).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 6), ras_Screener_TestDataManager.pleaseProvideTheInformationRegardingPreviousParticipationColumn2Option4);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 9).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 9), ras_Screener_TestDataManager.pleaseProvideTheInformationRegardingPreviousParticipationColumn3Option4);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 12).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 12), ras_Screener_TestDataManager.pleaseProvideTheInformationRegardingPreviousParticipationColumn4Option4);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 15).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 15), ras_Screener_TestDataManager.pleaseProvideTheInformationRegardingPreviousParticipationColumn5Option4);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 16).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 16), ras_Screener_TestDataManager.pleaseProvideTheInformationRegardingPreviousParticipationColumn6Option4);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(81));
        for(int b = 1; b < 5 ; b++) {
            CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicClickOnCheckboxesScreener(b));
        }
        myRASSurveyPage.screenerDynamicOtherTextBox(ras_Screener_TestDataManager.whatAreTheMainReasonsForParticipatingOptin1).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.screenerDynamicOtherTextBox(ras_Screener_TestDataManager.whatAreTheMainReasonsForParticipatingOptin1), ras_Screener_TestDataManager.whatAreTheMainReasonsForParticipatingOptin1Other);
        myRASSurveyPage.screenerDynamicOtherTextBox(ras_Screener_TestDataManager.whatAreTheMainReasonsForParticipatingOptin2).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.screenerDynamicOtherTextBox(ras_Screener_TestDataManager.whatAreTheMainReasonsForParticipatingOptin2), ras_Screener_TestDataManager.whatAreTheMainReasonsForParticipatingOptin2Other);
        myRASSurveyPage.screenerDynamicOtherTextBox(ras_Screener_TestDataManager.whatAreTheMainReasonsForParticipatingOptin3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.screenerDynamicOtherTextBox(ras_Screener_TestDataManager.whatAreTheMainReasonsForParticipatingOptin3), ras_Screener_TestDataManager.whatAreTheMainReasonsForParticipatingOptin3Other);
        myRASSurveyPage.screenerDynamicOtherTextBox(ras_Screener_TestDataManager.whatAreTheMainReasonsForParticipatingOptin4).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.screenerDynamicOtherTextBox(ras_Screener_TestDataManager.whatAreTheMainReasonsForParticipatingOptin4), ras_Screener_TestDataManager.whatAreTheMainReasonsForParticipatingOptin4Other);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(91));
        CommonUtils.assertEqualsWithMessage(ras_Screener_TestDataManager.youAreAlmostDone, myRASSurveyPage.rasScreenerText.getText(), "-- VERIFYING YOU ARE ALMOST DONE TEXT --");
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        MiscUtils.sleep(2000);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.logOutOfNativeView();
    }

    /***
     * USE THIS METHOD WILL COMPLETE THE IIQ FORM SCENARIO 4
     */
    public void rasScreenerIIQFormScenario4() {
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(14));
        CommonUtils.assertEqualsWithMessage(iiq_TestDataManager.thisIsACopyForLowerEnvironmentsText, myRASSurveyPage.dynamicTopText(14).getText(), "-- VERIFYING THIS IS THE COPY FOR LOWER ENVIRONMENTS TEXT --");
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(16));
        CommonUtils.assertEqualsWithMessage(iiq_TestDataManager.someOfThisInformationText, myRASSurveyPage.dynamicTopText(16).getText(), "-- VERIFYING SOME OF THIS INFORMATION TEXT --");
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(35));
        CommonUtils.assertEqualsWithMessage(iiq_TestDataManager.thisFirstSectionOfTheQuestionnaireText, myRASSurveyPage.dynamicTopText(35).getText(), "-- VERIFYING THIS FIRST QUESTION OF THE QUESTIONNAIRE TEXT --");
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            rasopathyQuestionnairePage.dynamicLocator(iiq_TestDataManager.areYouCompletingThisFormForYourselfRadioButton).click();
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScenario1StepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicLocator(iiq_TestDataManager.areYouCompletingThisFormForYourselfRadioButton).click();
            CucumberLogUtils.logScreenshot();
        }
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(105));
        myRASSurveyPage.dynamicOneTextBox(105).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.dynamicOneTextBox(105), iiq_TestDataManager.pleaseConfirmTheNameOfThePerson);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            rasopathyQuestionnairePage.dynamicLocator(iiq_TestDataManager.whatIsYourBiologicalSexRadioButton).click();
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScenario1StepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicLocator(iiq_TestDataManager.whatIsYourBiologicalSexRadioButton).click();
            CucumberLogUtils.logScreenshot();
        }
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(107));
        MiscUtils.sleep(2000);
        rasopathyQuestionnairePage.dynamicLocator(iiq_TestDataManager.forWhichSexDoYouIdentifyRadioButton).click();
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(iiq_TestDataManager.doYouConsiderYourselfToBeRadioButton));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(iiq_TestDataManager.doYouConsiderYourselfToBeRadioButton));
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScenario1StepsImpl.clickOnScreenerNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(iiq_TestDataManager.doYouConsiderYourselfToBeRadioButton));
            CucumberLogUtils.logScreenshot();
        }
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(109));
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(iiq_TestDataManager.whatIsYourRaceCheckBox));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(iiq_TestDataManager.whatIsYourRaceCheckBox));
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScenario1StepsImpl.clickOnScreenerNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(iiq_TestDataManager.whatIsYourRaceCheckBox));
            CucumberLogUtils.logScreenshot();
        }
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(110));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(iiq_TestDataManager.areYouOfAshkenazyJewishDescentRadioButton));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(111));
            MiscUtils.sleep(1000);
            CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicLocator(iiq_TestDataManager.areYouAdoptedRadioButton));
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScenario1StepsImpl.clickOnScreenerNextButton();
            CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicLocator(iiq_TestDataManager.areYouAdoptedRadioButton));
            CucumberLogUtils.logScreenshot();
        }
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(112));
            MiscUtils.sleep(1000);
            CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicLocator(iiq_TestDataManager.wereYouRaisedPrimarilyRadioButton));
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScenario1StepsImpl.clickOnScreenerNextButton();
            CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicLocator(iiq_TestDataManager.wereYouRaisedPrimarilyRadioButton));
            CucumberLogUtils.logScreenshot();
        }
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        CommonUtils.waitForClickability(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3));
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3), iiq_TestDataManager.sinceWasNotPrimarilyRaisedColumn1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 6).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 6), iiq_TestDataManager.sinceWasNotPrimarilyRaisedColumn2);
        CommonUtils.clickOnElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(1,9));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            rasopathyQuestionnairePage.calendarYearTextBox.clear();
            rasopathyQuestionnairePage.calendarYearTextBox.sendKeys(iiq_TestDataManager.whatIsYourDateOfBirthYearDropDown);
            CommonUtils.selectDropDownValue(iiq_TestDataManager.whatIsYourDateOfBirthMonthDropDown, rasopathyQuestionnairePage.calendarMonthDropDown);
            rasopathyQuestionnairePage.iIQcalendarDayOption.click();
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScenario1StepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.calendarYearTextBox.clear();
            rasopathyQuestionnairePage.calendarYearTextBox.sendKeys(iiq_TestDataManager.whatIsYourDateOfBirthYearDropDown);
            CommonUtils.selectDropDownValue(iiq_TestDataManager.whatIsYourDateOfBirthMonthDropDown, rasopathyQuestionnairePage.calendarMonthDropDown);
            rasopathyQuestionnairePage.iIQcalendarDayOption.click();
            CucumberLogUtils.logScreenshot();
        }
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(158));
        CommonUtils.waitForVisibility(myRASSurveyPage.enterTextInDoctorLocationHospitalTextBox(1));
        myRASSurveyPage.enterTextInDoctorLocationHospitalTextBox(1).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInDoctorLocationHospitalTextBox(1), iiq_TestDataManager.whereWereYouBornCityTextBox);
        myRASSurveyPage.enterTextInDoctorLocationHospitalTextBox(2).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInDoctorLocationHospitalTextBox(2), iiq_TestDataManager.whereWereYouBornStateTextBox);
        myRASSurveyPage.enterTextInDoctorLocationHospitalTextBox(3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInDoctorLocationHospitalTextBox(3), iiq_TestDataManager.whereWereYouBornCountryTextBox);
        myRASSurveyPage.enterTextInDoctorLocationHospitalTextBox(4).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInDoctorLocationHospitalTextBox(4), iiq_TestDataManager.whereWereYouBornDontKnowTextBox);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(116));
        CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicClickOnCheckboxesIiqTable(1,2));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(117));
        MiscUtils.sleep(2000);
        CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicClickOnCheckboxesIiqTable(1,4));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(118));
            MiscUtils.sleep(500);
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(iiq_TestDataManager.whatIsYourFammilysReligiousBackgroundCheckBox));
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScenario1StepsImpl.clickOnScreenerNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(iiq_TestDataManager.whatIsYourFammilysReligiousBackgroundCheckBox));
            CucumberLogUtils.logScreenshot();
        }
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(iiq_TestDataManager.whatIsYourMaritalStatusCheckBox));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(iiq_TestDataManager.whatIsYourMaritalStatusCheckBox));
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScenario1StepsImpl.clickOnScreenerNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(iiq_TestDataManager.whatIsYourMaritalStatusCheckBox));
            CucumberLogUtils.logScreenshot();
        }
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(120));
        MiscUtils.sleep(1000);
        CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicLocator(iiq_TestDataManager.whatIsYourMainOccupationRadioButton));
        CommonUtils.sendKeys(myRASSurveyPage.dynamicallyEnterTextInCheckMarkedTextBox(1), iiq_TestDataManager.whatHasBeenYourUsualJobOther );

        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(121));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(iiq_TestDataManager.doYouCurrentlyHaveHealthInsuranceRadioButton));
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScenario1StepsImpl.clickOnScreenerNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(iiq_TestDataManager.doYouCurrentlyHaveHealthInsuranceRadioButton));
            CucumberLogUtils.logScreenshot();
        }
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(122));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(iiq_TestDataManager.whatIsTheTotalCombinedYearlyIncomeRadioButton));
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScenario1StepsImpl.clickOnScreenerNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(iiq_TestDataManager.whatIsTheTotalCombinedYearlyIncomeRadioButton));
            CucumberLogUtils.logScreenshot();
        }
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(iiq_TestDataManager.whatIsTheHighestLevelOfSchoolingRadioButton));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(iiq_TestDataManager.whatIsTheHighestLevelOfSchoolingRadioButton));
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScenario1StepsImpl.clickOnScreenerNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(iiq_TestDataManager.whatIsTheHighestLevelOfSchoolingRadioButton));
            CucumberLogUtils.logScreenshot();
        }
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(36));
        CommonUtils.assertEqualsWithMessage(iiq_Constants.THIS_SECTION_ASKS_YOU_TEXT, myRASIIQFormPage.screenerIiqFormThisSectionAsksDetailedMedicalHistoryText.getText(), "-- VERIFYING THIS SECTION ASKS DETAILED MEDICAL HISTORY TEXT --");
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(124));
        MiscUtils.sleep(2000);
        CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicLocator(iiq_TestDataManager.wereYouConceivedUsingVitroRadioButton));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        CommonUtils.waitForVisibility(rasopathyQuestionnairePage.dynamicLocator(iiq_TestDataManager.wasProbandConceivedThroughADonorEgg));
        CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicLocator(iiq_TestDataManager.wasProbandConceivedThroughADonorEgg));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        CommonUtils.waitForVisibility(rasopathyQuestionnairePage.dynamicLocator(iiq_TestDataManager.wasPreimplantationGeneticTesting));
        CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicLocator(iiq_TestDataManager.wasPreimplantationGeneticTesting));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(127));
        MiscUtils.sleep(2000);
        CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicLocator(iiq_TestDataManager.wereYouATwinRadioButton));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        if(!myRASSurveyPage.dynamicTopText(128).isDisplayed()) {
            CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicLocator(iiq_TestDataManager.wereYouATwinRadioButton));
            CucumberLogUtils.logScreenshot();
            rasScenario1StepsImpl.clickOnScreenerNextButton();
        }
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(128));
        CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicLocator(iiq_TestDataManager.whatTypeOfBirthWas));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(40));
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3),iiq_TestDataManager.InTheTableBelowPleaseGiveTheNamesColumn1Option1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 3),iiq_TestDataManager.InTheTableBelowPleaseGiveTheNamesColumn1Option2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 3),iiq_TestDataManager.InTheTableBelowPleaseGiveTheNamesColumn1Option3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 3),iiq_TestDataManager.InTheTableBelowPleaseGiveTheNamesColumn1Option4);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(5, 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(5, 3),iiq_TestDataManager.InTheTableBelowPleaseGiveTheNamesColumn1Option5);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(6, 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(6, 3),iiq_TestDataManager.InTheTableBelowPleaseGiveTheNamesColumn1Option6);
        CommonUtils.selectDropDownValue(iiq_TestDataManager.InTheTableBelowPleaseGiveTheNamesColumn3Option1,myRASSurveyPage.dynamicDropDownTwo(1,9));
        CommonUtils.selectDropDownValue(iiq_TestDataManager.InTheTableBelowPleaseGiveTheNamesColumn3Option2,myRASSurveyPage.dynamicDropDownTwo(2,9));
        CommonUtils.selectDropDownValue(iiq_TestDataManager.InTheTableBelowPleaseGiveTheNamesColumn3Option3,myRASSurveyPage.dynamicDropDownTwo(3,9));
        CommonUtils.selectDropDownValue(iiq_TestDataManager.InTheTableBelowPleaseGiveTheNamesColumn3Option4,myRASSurveyPage.dynamicDropDownTwo(4,9));
        CommonUtils.selectDropDownValue(iiq_TestDataManager.InTheTableBelowPleaseGiveTheNamesColumn3Option5,myRASSurveyPage.dynamicDropDownTwo(5,9));
        CommonUtils.selectDropDownValue(iiq_TestDataManager.InTheTableBelowPleaseGiveTheNamesColumn3Option6,myRASSurveyPage.dynamicDropDownTwo(6,9));
        CommonUtils.selectDropDownValue(iiq_TestDataManager.InTheTableBelowPleaseGiveTheNamesColumn2Option1,myRASSurveyPage.dynamicDropDownTwo(1,6));
        CommonUtils.selectDropDownValue(iiq_TestDataManager.InTheTableBelowPleaseGiveTheNamesColumn2Option2,myRASSurveyPage.dynamicDropDownTwo(2,6));
        CommonUtils.selectDropDownValue(iiq_TestDataManager.InTheTableBelowPleaseGiveTheNamesColumn2Option3,myRASSurveyPage.dynamicDropDownTwo(3,6));
        CommonUtils.selectDropDownValue(iiq_TestDataManager.InTheTableBelowPleaseGiveTheNamesColumn2Option4,myRASSurveyPage.dynamicDropDownTwo(4,6));
        CommonUtils.selectDropDownValue(iiq_TestDataManager.InTheTableBelowPleaseGiveTheNamesColumn2Option5,myRASSurveyPage.dynamicDropDownTwo(5,6));
        CommonUtils.selectDropDownValue(iiq_TestDataManager.InTheTableBelowPleaseGiveTheNamesColumn2Option6,myRASSurveyPage.dynamicDropDownTwo(6,6));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(131));
        MiscUtils.sleep(2000);
         CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicLocator(iiq_TestDataManager.areYourBiologicalParentsBloodRelatedRadioButton));
         CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        if(!myRASSurveyPage.dynamicTopText(42).isDisplayed()) {
            CucumberLogUtils.logScreenshot();
            rasScenario1StepsImpl.clickOnScreenerNextButton();
        }
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(42));
        MiscUtils.sleep(2000);
        CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicLocator(iiq_TestDataManager.howAreTheBiologicalParentsBloodRelated));
        myRASSurveyPage.HowAreYourBiologicalTextArea.clear();
        CommonUtils.sendKeys(myRASSurveyPage.HowAreYourBiologicalTextArea, iiq_TestDataManager.howAreTheBiologicalParentsBloodRelatedOther);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(iiq_TestDataManager.wouldYouSayYouWereBornRadioButton));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(iiq_TestDataManager.wouldYouSayYouWereBornRadioButton));
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScenario1StepsImpl.clickOnScreenerNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(iiq_TestDataManager.wouldYouSayYouWereBornRadioButton));
            CucumberLogUtils.logScreenshot();
        }
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(133));
        MiscUtils.sleep(2000);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3),iiq_TestDataManager.pleaseFillOutBirtWeightNumericTextBox);
        CommonUtils.selectDropDownValue(iiq_TestDataManager.pleaseFillOutBirtWeightUnitDropDown,myRASSurveyPage.dynamicDropDownTwo(1,6));
        CommonUtils.clickOnElement(myRASSurveyPage.gaggingRadioButton(1,9));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(172));
        MiscUtils.sleep(3000);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3),iiq_TestDataManager.pleaseFillOutHeadNumericTextBox);
        CommonUtils.selectDropDownValue(iiq_TestDataManager.pleaseFillOutHeadUnitDropDown,myRASSurveyPage.dynamicDropDownTwo(1,6));
        CommonUtils.clickOnElement(myRASSurveyPage.gaggingRadioButton(1,9));
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 3),iiq_TestDataManager.pleaseFillOutHeadCircumferenceNumericTextBox);
        CommonUtils.selectDropDownValue(iiq_TestDataManager.pleaseFillOutHeadCircumferenceUnitDropDown,myRASSurveyPage.dynamicDropDownTwo(2,6));
        CommonUtils.clickOnElement(myRASSurveyPage.gaggingRadioButton(2,9));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        CommonUtils.waitForVisibility(myRASIIQFormPage.screenerIiqFormThisSectionWillAskAboutCancerText);
        CommonUtils.assertEqualsWithMessage(iiq_Constants.THIS_SECTION_WILL_ASK_ABOUT_CANCER_TEXT, myRASIIQFormPage.screenerIiqFormThisSectionWillAskAboutCancerText.getText(), "-- VERIFYING THIS SECTION WILL ASK ABOUT CANCER TEXT --");
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(134));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(iiq_TestDataManager.haveYouEverBeenDiagnosedWithAnyCancerRadioButton));
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScenario1StepsImpl.clickOnScreenerNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(iiq_TestDataManager.haveYouEverBeenDiagnosedWithAnyCancerRadioButton));
            CucumberLogUtils.logScreenshot();
        }
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicClickOnCheckboxesScreener(1));
        MiscUtils.sleep(2000);
        for (int k = 1; k < 17; k++) {
            CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicClickOnCheckboxesScreener(k));
        }
        myRASSurveyPage.dynamicallyEnterTextInCheckMarkedTextBox(12).clear();
        CommonUtils.sendKeys(myRASSurveyPage.dynamicallyEnterTextInCheckMarkedTextBox(12), iiq_TestDataManager.pleaseSelectOrReportAnyPrimaryTumorsOther12);
        myRASSurveyPage.dynamicallyEnterTextInCheckMarkedTextBox(13).clear();
        CommonUtils.sendKeys(myRASSurveyPage.dynamicallyEnterTextInCheckMarkedTextBox(13), iiq_TestDataManager.pleaseSelectOrReportAnyPrimaryTumorsOther13);
        myRASSurveyPage.dynamicallyEnterTextInCheckMarkedTextBox(14).clear();
        CommonUtils.sendKeys(myRASSurveyPage.dynamicallyEnterTextInCheckMarkedTextBox(14), iiq_TestDataManager.pleaseSelectOrReportAnyPrimaryTumorsOther14);
        myRASSurveyPage.dynamicallyEnterTextInCheckMarkedTextBox(15).clear();
        CommonUtils.sendKeys(myRASSurveyPage.dynamicallyEnterTextInCheckMarkedTextBox(15), iiq_TestDataManager.pleaseSelectOrReportAnyPrimaryTumorsOther15);
        myRASSurveyPage.dynamicallyEnterTextInCheckMarkedTextBox(16).clear();
        CommonUtils.sendKeys(myRASSurveyPage.dynamicallyEnterTextInCheckMarkedTextBox(16), iiq_TestDataManager.pleaseSelectOrReportAnyPrimaryTumorsOther16);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(63));
        String[] primaryCancerTumor1 = {iiq_TestDataManager.forEachPrimaryCancerOrTumorColumn1Option1,
                iiq_TestDataManager.forEachPrimaryCancerOrTumorColumn1Option2,
                iiq_TestDataManager.forEachPrimaryCancerOrTumorColumn1Option3,
                iiq_TestDataManager.forEachPrimaryCancerOrTumorColumn1Option4,
                iiq_TestDataManager.forEachPrimaryCancerOrTumorColumn1Option5,
                iiq_TestDataManager.forEachPrimaryCancerOrTumorColumn1Option6,
                iiq_TestDataManager.forEachPrimaryCancerOrTumorColumn1Option7,
                iiq_TestDataManager.forEachPrimaryCancerOrTumorColumn1Option8,
                iiq_TestDataManager.forEachPrimaryCancerOrTumorColumn1Option9,
                iiq_TestDataManager.forEachPrimaryCancerOrTumorColumn1Option10,
                iiq_TestDataManager.forEachPrimaryCancerOrTumorColumn1Option11,
                iiq_TestDataManager.forEachPrimaryCancerOrTumorColumn1Option12,
                iiq_TestDataManager.forEachPrimaryCancerOrTumorColumn1Option13,
                iiq_TestDataManager.forEachPrimaryCancerOrTumorColumn1Option14,
                iiq_TestDataManager.forEachPrimaryCancerOrTumorColumn1Option15,
                iiq_TestDataManager.forEachPrimaryCancerOrTumorColumn1Option16};
        for (int l = 1; l < 17; l++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(l, 3).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(l, 3), primaryCancerTumor1[l - 1]);
        }
        String[] primaryCancerTumor2 = {iiq_TestDataManager.forEachPrimaryCancerOrTumorColumn2Option1,
                iiq_TestDataManager.forEachPrimaryCancerOrTumorColumn2Option2,
                iiq_TestDataManager.forEachPrimaryCancerOrTumorColumn2Option3,
                iiq_TestDataManager.forEachPrimaryCancerOrTumorColumn2Option4,
                iiq_TestDataManager.forEachPrimaryCancerOrTumorColumn2Option5,
                iiq_TestDataManager.forEachPrimaryCancerOrTumorColumn2Option6,
                iiq_TestDataManager.forEachPrimaryCancerOrTumorColumn2Option7,
                iiq_TestDataManager.forEachPrimaryCancerOrTumorColumn2Option8,
                iiq_TestDataManager.forEachPrimaryCancerOrTumorColumn2Option9,
                iiq_TestDataManager.forEachPrimaryCancerOrTumorColumn2Option10,
                iiq_TestDataManager.forEachPrimaryCancerOrTumorColumn2Option11,
                iiq_TestDataManager.forEachPrimaryCancerOrTumorColumn2Option12,
                iiq_TestDataManager.forEachPrimaryCancerOrTumorColumn2Option13,
                iiq_TestDataManager.forEachPrimaryCancerOrTumorColumn2Option14,
                iiq_TestDataManager.forEachPrimaryCancerOrTumorColumn2Option15,
                iiq_TestDataManager.forEachPrimaryCancerOrTumorColumn2Option16};
        for (int m = 1; m < 17; m++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(m, 4).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(m, 4), primaryCancerTumor2[m - 1]);
        }
        String[] primaryCancerTumor3 = {iiq_TestDataManager.forEachPrimaryCancerOrTumorColumn3Option1,
                iiq_TestDataManager.forEachPrimaryCancerOrTumorColumn3Option2,
                iiq_TestDataManager.forEachPrimaryCancerOrTumorColumn3Option3,
                iiq_TestDataManager.forEachPrimaryCancerOrTumorColumn3Option4,
                iiq_TestDataManager.forEachPrimaryCancerOrTumorColumn3Option5,
                iiq_TestDataManager.forEachPrimaryCancerOrTumorColumn3Option6,
                iiq_TestDataManager.forEachPrimaryCancerOrTumorColumn3Option7,
                iiq_TestDataManager.forEachPrimaryCancerOrTumorColumn3Option8,
                iiq_TestDataManager.forEachPrimaryCancerOrTumorColumn3Option9,
                iiq_TestDataManager.forEachPrimaryCancerOrTumorColumn3Option10,
                iiq_TestDataManager.forEachPrimaryCancerOrTumorColumn3Option11,
                iiq_TestDataManager.forEachPrimaryCancerOrTumorColumn3Option12,
                iiq_TestDataManager.forEachPrimaryCancerOrTumorColumn3Option13,
                iiq_TestDataManager.forEachPrimaryCancerOrTumorColumn3Option14,
                iiq_TestDataManager.forEachPrimaryCancerOrTumorColumn3Option15,
                iiq_TestDataManager.forEachPrimaryCancerOrTumorColumn3Option16};
        for (int n = 1; n < 17; n++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(n, 5).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(n, 5), primaryCancerTumor3[n - 1]);
        }
        String[] primaryCancerTumor4 = {iiq_TestDataManager.forEachPrimaryCancerOrTumorColumn3Option1,
                iiq_TestDataManager.forEachPrimaryCancerOrTumorColumn3Option2,
                iiq_TestDataManager.forEachPrimaryCancerOrTumorColumn3Option3,
                iiq_TestDataManager.forEachPrimaryCancerOrTumorColumn3Option4,
                iiq_TestDataManager.forEachPrimaryCancerOrTumorColumn3Option5,
                iiq_TestDataManager.forEachPrimaryCancerOrTumorColumn3Option6,
                iiq_TestDataManager.forEachPrimaryCancerOrTumorColumn3Option7,
                iiq_TestDataManager.forEachPrimaryCancerOrTumorColumn3Option8,
                iiq_TestDataManager.forEachPrimaryCancerOrTumorColumn3Option9,
                iiq_TestDataManager.forEachPrimaryCancerOrTumorColumn3Option10,
                iiq_TestDataManager.forEachPrimaryCancerOrTumorColumn3Option11,
                iiq_TestDataManager.forEachPrimaryCancerOrTumorColumn3Option12,
                iiq_TestDataManager.forEachPrimaryCancerOrTumorColumn3Option13,
                iiq_TestDataManager.forEachPrimaryCancerOrTumorColumn3Option14,
                iiq_TestDataManager.forEachPrimaryCancerOrTumorColumn3Option15,
                iiq_TestDataManager.forEachPrimaryCancerOrTumorColumn3Option16};
        for (int o = 1; o < 17; o++) {
            myRASSurveyPage.enterTextInTextAreaTextBox(o, 8).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInTextAreaTextBox(o, 8), primaryCancerTumor4[o - 1]);
        }
        String[] primaryCancerTumor5 = {iiq_TestDataManager.forEachPrimaryCancerOrTumorColumn3Option1,
                iiq_TestDataManager.forEachPrimaryCancerOrTumorColumn3Option2,
                iiq_TestDataManager.forEachPrimaryCancerOrTumorColumn3Option3,
                iiq_TestDataManager.forEachPrimaryCancerOrTumorColumn3Option4,
                iiq_TestDataManager.forEachPrimaryCancerOrTumorColumn3Option5,
                iiq_TestDataManager.forEachPrimaryCancerOrTumorColumn3Option6,
                iiq_TestDataManager.forEachPrimaryCancerOrTumorColumn3Option7,
                iiq_TestDataManager.forEachPrimaryCancerOrTumorColumn3Option8,
                iiq_TestDataManager.forEachPrimaryCancerOrTumorColumn3Option9,
                iiq_TestDataManager.forEachPrimaryCancerOrTumorColumn3Option10,
                iiq_TestDataManager.forEachPrimaryCancerOrTumorColumn3Option11,
                iiq_TestDataManager.forEachPrimaryCancerOrTumorColumn3Option12,
                iiq_TestDataManager.forEachPrimaryCancerOrTumorColumn3Option13,
                iiq_TestDataManager.forEachPrimaryCancerOrTumorColumn3Option14,
                iiq_TestDataManager.forEachPrimaryCancerOrTumorColumn3Option15,
                iiq_TestDataManager.forEachPrimaryCancerOrTumorColumn3Option16};
        for (int p = 1; p < 17; p++) {
            myRASSurveyPage.enterTextInTextAreaTextBox(p, 11).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInTextAreaTextBox(p, 11), primaryCancerTumor5[p - 1]);
        }
        for (int q = 14; q < 20; q++) {
            for (int r = 1; r < 17; r++){
                CommonUtils.clickOnElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(r,q));
            }
        }
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(136));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(iiq_TestDataManager.haveYouEverHadMedicalGeneticTestingRadioButton));
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScenario1StepsImpl.clickOnScreenerNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(iiq_TestDataManager.haveYouEverHadMedicalGeneticTestingRadioButton));
            CucumberLogUtils.logScreenshot();
        }
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicDropDownTwo(1,3));
        CommonUtils.selectDropDownValue(iiq_TestDataManager.pleaseProvideTheDetailsForTheGeneticTestingColumn1Option1,myRASSurveyPage.dynamicDropDownTwo(1,3));
        CommonUtils.selectDropDownValue(iiq_TestDataManager.pleaseProvideTheDetailsForTheGeneticTestingColumn1Option2,myRASSurveyPage.dynamicDropDownTwo(2,3));
        CommonUtils.selectDropDownValue(iiq_TestDataManager.pleaseProvideTheDetailsForTheGeneticTestingColumn1Option3,myRASSurveyPage.dynamicDropDownTwo(3,3));
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 6).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 6), iiq_TestDataManager.pleaseProvideTheDetailsForTheGeneticTestingColumn2Option1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 6).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 6), iiq_TestDataManager.pleaseProvideTheDetailsForTheGeneticTestingColumn2Option2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 6).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 6), iiq_TestDataManager.pleaseProvideTheDetailsForTheGeneticTestingColumn2Option3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 7).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 7), iiq_TestDataManager.pleaseProvideTheDetailsForTheGeneticTestingColumn3Option1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 7).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 7), iiq_TestDataManager.pleaseProvideTheDetailsForTheGeneticTestingColumn3Option2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 7).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 7), iiq_TestDataManager.pleaseProvideTheDetailsForTheGeneticTestingColumn3Option3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 8).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 8), iiq_TestDataManager.pleaseProvideTheDetailsForTheGeneticTestingColumn4Option1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 8).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 8), iiq_TestDataManager.pleaseProvideTheDetailsForTheGeneticTestingColumn4Option2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 8).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 8), iiq_TestDataManager.pleaseProvideTheDetailsForTheGeneticTestingColumn4Option3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 11).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 11), iiq_TestDataManager.pleaseProvideTheDetailsForTheGeneticTestingColumn5Option1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 11).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 11), iiq_TestDataManager.pleaseProvideTheDetailsForTheGeneticTestingColumn5Option2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 11).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 11), iiq_TestDataManager.pleaseProvideTheDetailsForTheGeneticTestingColumn5Option3);
        CommonUtils.selectDropDownValue(iiq_TestDataManager.pleaseProvideTheDetailsForTheGeneticTestingColumn6Option1,myRASSurveyPage.dynamicDropDownTwo(1,14));
        CommonUtils.selectDropDownValue(iiq_TestDataManager.pleaseProvideTheDetailsForTheGeneticTestingColumn6Option2,myRASSurveyPage.dynamicDropDownTwo(2,14));
        CommonUtils.selectDropDownValue(iiq_TestDataManager.pleaseProvideTheDetailsForTheGeneticTestingColumn6Option3,myRASSurveyPage.dynamicDropDownTwo(3,14));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(166));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(iiq_TestDataManager.doYouHaveACopyOfTheGeneticTestResults));
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScenario1StepsImpl.clickOnScreenerNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(iiq_TestDataManager.doYouHaveACopyOfTheGeneticTestResults));
            CucumberLogUtils.logScreenshot();
        }
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        MiscUtils.sleep(2000);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(140));
        MiscUtils.sleep(2000);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3),iiq_TestDataManager.pleaseFillTheTableBelowWithHeightNumericTextBox);
        CommonUtils.selectDropDownValue(iiq_TestDataManager.pleaseFillTheTableBelowWithHeightUnitDropDown,myRASSurveyPage.dynamicDropDownTwo(1,6));
        CommonUtils.clickOnElement(myRASSurveyPage.gaggingRadioButton(1,9));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(174));
        MiscUtils.sleep(2000);
        CommonUtils.waitForVisibility(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3));
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3),iiq_TestDataManager.pleaseCompleteTheTableBelowIndicatingYourWeightColumn1Option1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 3),iiq_TestDataManager.pleaseCompleteTheTableBelowIndicatingYourWeightColumn1Option2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 3),iiq_TestDataManager.pleaseCompleteTheTableBelowIndicatingYourWeightColumn1Option3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 3),iiq_TestDataManager.pleaseCompleteTheTableBelowIndicatingYourWeightColumn1Option4);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(5, 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(5, 3),iiq_TestDataManager.pleaseCompleteTheTableBelowIndicatingYourWeightColumn1Option5);
        CommonUtils.selectDropDownValue(iiq_TestDataManager.pleaseCompleteTheTableBelowIndicatingYourWeightColumn2Option1,myRASSurveyPage.dynamicDropDownTwo(1,6));
        CommonUtils.selectDropDownValue(iiq_TestDataManager.pleaseCompleteTheTableBelowIndicatingYourWeightColumn2Option2,myRASSurveyPage.dynamicDropDownTwo(2,6));
        CommonUtils.selectDropDownValue(iiq_TestDataManager.pleaseCompleteTheTableBelowIndicatingYourWeightColumn2Option3,myRASSurveyPage.dynamicDropDownTwo(3,6));
        CommonUtils.selectDropDownValue(iiq_TestDataManager.pleaseCompleteTheTableBelowIndicatingYourWeightColumn2Option4,myRASSurveyPage.dynamicDropDownTwo(4,6));
        CommonUtils.selectDropDownValue(iiq_TestDataManager.pleaseCompleteTheTableBelowIndicatingYourWeightColumn2Option5,myRASSurveyPage.dynamicDropDownTwo(5,6));
        CommonUtils.clickOnElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(1,9));
        CommonUtils.clickOnElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(2,9));
        CommonUtils.clickOnElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(3,9));
        CommonUtils.clickOnElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(4,9));
        CommonUtils.clickOnElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(5,9));
        CommonUtils.clickOnElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(1,12));
        CommonUtils.clickOnElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(2,12));
        CommonUtils.clickOnElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(3,12));
        CommonUtils.clickOnElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(4,12));
        CommonUtils.clickOnElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(5,12));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(142));
        myRASSurveyPage.dynamicOneTextBox(142).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.dynamicOneTextBox(142), iiq_TestDataManager.atWhatAgeWereYouAtTheHighestWeightTextBox);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(79));
        CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicClickOnCheckboxesScreener(1));
        myRASSurveyPage.dynamicallyEnterTextInCheckMarkedTextBox(1).clear();
        CommonUtils.sendKeys(myRASSurveyPage.dynamicallyEnterTextInCheckMarkedTextBox(1), iiq_TestDataManager.ageAtFirstMenstrualPeriodOption1Other);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(80));
        CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicClickOnCheckboxesScreener(1));
        myRASSurveyPage.dynamicallyEnterTextInCheckMarkedTextBox(1).clear();
        CommonUtils.sendKeys(myRASSurveyPage.dynamicallyEnterTextInCheckMarkedTextBox(1), iiq_TestDataManager.mostRecentMenstrualPeriodOption1Other);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(81));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(iiq_TestDataManager.ifAPeriodHasNotOccurredForTheLast12Months));
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScenario1StepsImpl.clickOnScreenerNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(iiq_TestDataManager.ifAPeriodHasNotOccurredForTheLast12Months));
            CucumberLogUtils.logScreenshot();
        }
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(143));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(iiq_TestDataManager.hasProbandEverBeenPregnant));
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScenario1StepsImpl.clickOnScreenerNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(iiq_TestDataManager.hasProbandEverBeenPregnant));
            CucumberLogUtils.logScreenshot();
        }
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(162));
        myRASSurveyPage.dynamicOneTextBox(162).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.dynamicOneTextBox(162), iiq_TestDataManager.whatWasProbandAgeAtTheirFirstPregnancy);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(160));
        myRASSurveyPage.dynamicOneTextBox(160).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.dynamicOneTextBox(160), iiq_TestDataManager.howManyTimesHasProbandBeenPregnant);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(144));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(iiq_TestDataManager.hasProbandEverTriedToBecomePregnant));
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScenario1StepsImpl.clickOnScreenerNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(iiq_TestDataManager.hasProbandEverTriedToBecomePregnant));
            CucumberLogUtils.logScreenshot();
        }
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(145));
        MiscUtils.sleep(2000);
        CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicLocator(iiq_TestDataManager.hasProbandEverConsultedADoctorInGettingPregnant));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(146));
        myRASSurveyPage.dynamicOneTextBox(146).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.dynamicOneTextBox(146), iiq_TestDataManager.howOldWasProbandWhenTheyFirstConsultedADoctor);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicClickOnCheckboxesScreener(10));
        MiscUtils.sleep(2000);
        for (int s = 1; s < 11; s++) {
            CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicClickOnCheckboxesScreener(s));
        }
        myRASSurveyPage.dynamicallyEnterTextInCheckMarkedTextBox(10).clear();
        CommonUtils.sendKeys(myRASSurveyPage.dynamicallyEnterTextInCheckMarkedTextBox(10), iiq_TestDataManager.whatDiagnosisWasMadeToExplainOption10);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(151));
        CommonUtils.assertEqualsWithMessage(iiq_TestDataManager.theNextFewQuestionsAskAboutBeingPrescribedFemaleHormones, myRASSurveyPage.rasSurveyText.getText(), "-- VERIFYING THE NEXT FEW QUESTIONS ASK ABOUT BEING PRESCRIBED FEMALE HORMONES TEXT --");
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(153));
            CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicLocator(iiq_TestDataManager.hasProbandEverTakenPillsInjections));
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScenario1StepsImpl.clickOnScreenerNextButton();
            CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicLocator(iiq_TestDataManager.hasProbandEverTakenPillsInjections));
            CucumberLogUtils.logScreenshot();
        }
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(147));
        MiscUtils.sleep(2000);
        CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicLocator(iiq_TestDataManager.sometimesWomenAreGivenFemaleHormones));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(148));
            CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicClickOnCheckboxesScreener(1));
            myRASSurveyPage.dynamicallyEnterTextInCheckMarkedTextBox(1).clear();
            CommonUtils.sendKeys(myRASSurveyPage.dynamicallyEnterTextInCheckMarkedTextBox(1), iiq_TestDataManager.atWhatAgeWasProbandPrescribedFemaleHormones);
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScenario1StepsImpl.clickOnScreenerNextButton();
            CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicClickOnCheckboxesScreener(1));
            myRASSurveyPage.dynamicallyEnterTextInCheckMarkedTextBox(1).clear();
            CommonUtils.sendKeys(myRASSurveyPage.dynamicallyEnterTextInCheckMarkedTextBox(1), iiq_TestDataManager.atWhatAgeWasProbandPrescribedFemaleHormones);
            CucumberLogUtils.logScreenshot();
        }
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(149));
        MiscUtils.sleep(2000);
        CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicClickOnCheckboxesScreener(1));
        myRASSurveyPage.dynamicallyEnterTextInCheckMarkedTextBox(1).clear();
        CommonUtils.sendKeys(myRASSurveyPage.dynamicallyEnterTextInCheckMarkedTextBox(1), iiq_TestDataManager.whatIsTheTotalAmountOfTimeProbandHasTakenHormoneOther1);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(100));
        CommonUtils.assertEqualsWithMessage(iiq_Constants.YOU_ARE_ALMOST_DONE_TEXT, myRASIIQFormPage.screenerIiqFormYouAreAlmostDoneText.getText(), "-- VERIFYING YOU ARE ALMOST DONE TEXT --");
        CucumberLogUtils.logScreenshot();
        MiscUtils.sleep(1000);
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        MiscUtils.sleep(1000);
        CucumberLogUtils.logScreenshot();
        MiscUtils.sleep(1000);
        rasScenario1StepsImpl.logOutOfNativeView();
}

    /***
     * USE THIS METHOD WILL COMPLETE THE RAS SURVEY SCENARIO 4
     */
    public void rasScreenerSurveyScenario4PartOne(){
        CommonUtils.waitForVisibility(myRASSurveyPage.rasSurveyThankYouForStartingText);
        CommonUtils.assertEqualsWithMessage(ras_Survey_TestDataManager.thankYouForStartingTheRASSurveyAndFor,myRASSurveyPage.rasSurveyText.getText(), "-- VERIFYING THANK YOU FOR STARTING THE RAS SURVEY AND FOR YOUR TEXT --");
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.rasSurveyThisQuestionMayTakeText);
        CommonUtils.assertEqualsWithMessage(ras_Survey_TestDataManager.thisQuestionnaireMayTakeYouSeveral,myRASSurveyPage.rasSurveyText.getText(), "-- VERIFYING THIS QUESTIONNAIRE MAY TAKE YOU SEVERAL HOURS TO COMPLETE TEXT --");
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.rasSurveyTheFirstBlockText);
        CommonUtils.assertEqualsWithMessage(ras_Survey_TestDataManager.thisQuestionnaireMayTakeYouSeveral,myRASSurveyPage.rasSurveyText.getText(), "-- VERIFYING THE FIRST BLOCK OF QUESTIONS WILL COLLECT TEXT --");
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(1));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.toConfirmAreYouCompleting));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 2));
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 2).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 2), ras_Survey_TestDataManager.whatIsTheNameOfThePersonWhoMayBeEligibleForThisStudyFirst);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 2).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 2), ras_Survey_TestDataManager.whatIsTheNameOfThePersonWhoMayBeEligibleForThisStudyMi);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 2).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 2), ras_Survey_TestDataManager.whatIsTheNameOfThePersonWhoMayBeEligibleForThisStudyLast);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(55));
        MiscUtils.sleep(2000);
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.isTheProbandAlive));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(336));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverBeenIncluded));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.rasSurveyPleaseProvideAnyAdditionalInformationTextBox);
        myRASSurveyPage.rasSurveyPleaseProvideAnyAdditionalInformationTextBox.clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.rasSurveyPleaseProvideAnyAdditionalInformationTextBox, ras_Survey_TestDataManager.pleaseProvideAnyAdditionalInformation);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.rasSurveyTheNextSetOfQuestionsWillAskAboutBirthAndNeonatalText);
        CommonUtils.assertEqualsWithMessage(ras_Survey_TestDataManager.theNextSetOfQuestionsWillAskAboutNeonatalHistory,myRASSurveyPage.rasSurveyText.getText(), "-- VERIFYING THE NEXT SET OF QUESTIONS WILL ASK ABOUT BIRTH AND NEONATAL  TEXT --");
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3));
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3), ras_Survey_TestDataManager.pleaseCompleteYourBiologicalParentsBiologicalMotherCity);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 3), ras_Survey_TestDataManager.pleaseCompleteYourBiologicalParentsBiologicalFatherCity);
        CommonUtils.clickOnElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(1, 6));
        CommonUtils.clickOnElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(2, 6));
        CommonUtils.selectDropDownValue(ras_Survey_TestDataManager.pleaseCompleteYourBiologicalParentsBiologicalMotherAge, myRASSurveyPage.dynamicDropDownTwo(1, 9));
        CommonUtils.selectDropDownValue(ras_Survey_TestDataManager.ras_Survey_TestDataManager.pleaseCompleteYourBiologicalParentsBiologicalFatherAge, myRASSurveyPage.dynamicDropDownTwo(2, 9));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.wereYouDiagnosedWithHypoglycemia));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.wereYouDiagnosedWithHypoglycemia));
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.wereYouDiagnosedWithHypoglycemia));
            CucumberLogUtils.logScreenshot();
        }
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.wereYouDiagnosedWithAnyOfTheFollowingDuringPregnancyOption1));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.wereYouDiagnosedWithAnyOfTheFollowingDuringPregnancyOption1));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.wereYouDiagnosedWithAnyOfTheFollowingDuringPregnancyOption2));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.wereYouDiagnosedWithAnyOfTheFollowingDuringPregnancyOption3));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.wereYouDiagnosedWithAnyOfTheFollowingDuringPregnancyOption4));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.wereYouDiagnosedWithAnyOfTheFollowingDuringPregnancyOption5));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.wereYouDiagnosedWithAnyOfTheFollowingDuringPregnancyOption6));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.wereYouDiagnosedWithAnyOfTheFollowingDuringPregnancyOption7));
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.wereYouDiagnosedWithAnyOfTheFollowingDuringPregnancyOption1));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.wereYouDiagnosedWithAnyOfTheFollowingDuringPregnancyOption1));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.wereYouDiagnosedWithAnyOfTheFollowingDuringPregnancyOption2));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.wereYouDiagnosedWithAnyOfTheFollowingDuringPregnancyOption3));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.wereYouDiagnosedWithAnyOfTheFollowingDuringPregnancyOption4));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.wereYouDiagnosedWithAnyOfTheFollowingDuringPregnancyOption5));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.wereYouDiagnosedWithAnyOfTheFollowingDuringPregnancyOption6));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.wereYouDiagnosedWithAnyOfTheFollowingDuringPregnancyOption7));
            CucumberLogUtils.logScreenshot();
        }
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.duringHerPregnancyWithYou));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.duringHerPregnancyWithYou));
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.duringHerPregnancyWithYou));
            CucumberLogUtils.logScreenshot();
        }
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        for(int i = 1;i < 9;i++){
            CommonUtils.clickOnElement(myRASSurveyPage.dynamicLocatorRadioButtonNormal("" + i));
        }
        myRASSurveyPage.dynamicallyEnterTextInCheckWithRadioButtons(8).clear();
        CommonUtils.sendKeys(myRASSurveyPage.dynamicallyEnterTextInCheckWithRadioButtons(8), ras_Survey_TestDataManager.pleaseIndicateTheResultsOfThePrenatalTestsOther);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(44));
        for (int n = 1; n < 11; n++) {
            CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicClickOnCheckboxesScreener(n));
        }
        myRASSurveyPage.dynamicallyEnterTextInCheckMarkedTextBox(8).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.dynamicallyEnterTextInCheckMarkedTextBox(8), ras_Survey_TestDataManager.wasYourBiologicalMotherDiagnosedOption8PleaseSpecify);
        myRASSurveyPage.dynamicallyEnterTextInCheckMarkedTextBox(9).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.dynamicallyEnterTextInCheckMarkedTextBox(9), ras_Survey_TestDataManager.wasYourBiologicalMotherDiagnosedOption9PleaseSpecify);
        myRASSurveyPage.dynamicallyEnterTextInCheckMarkedTextBox(10).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.dynamicallyEnterTextInCheckMarkedTextBox(10), ras_Survey_TestDataManager.wasYourBiologicalMotherDiagnosedOption10PleaseSpecify);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.duringHerPregnancyWithYouSupplements));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.duringHerPregnancyWithYouSupplements));
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.duringHerPregnancyWithYouSupplements));
            CucumberLogUtils.logScreenshot();
        }
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.pleaseSelectAllMedicationsYourMotherTookOption1));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.pleaseSelectAllMedicationsYourMotherTookOption1));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.pleaseSelectAllMedicationsYourMotherTookOption2));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.pleaseSelectAllMedicationsYourMotherTookOption3));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.pleaseSelectAllMedicationsYourMotherTookOption4));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.pleaseSelectAllMedicationsYourMotherTookOption5));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.pleaseSelectAllMedicationsYourMotherTookOption6));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.pleaseSelectAllMedicationsYourMotherTookOption7));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.pleaseSelectAllMedicationsYourMotherTookOption8));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.pleaseSelectAllMedicationsYourMotherTookOption9));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.pleaseSelectAllMedicationsYourMotherTookOption10));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.pleaseSelectAllMedicationsYourMotherTookOption11));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.pleaseSelectAllMedicationsYourMotherTookOption12));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.pleaseSelectAllMedicationsYourMotherTookOption13));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.pleaseSelectAllMedicationsYourMotherTookOption14));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.pleaseSelectAllMedicationsYourMotherTookOption15));
        myRASSurveyPage.dynamicallyEnterTextInCheckMarkedTextBox(13).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.dynamicallyEnterTextInCheckMarkedTextBox(13), ras_Survey_TestDataManager.pleaseSelectAllMedicationsYourMotherTookOption14PleaseSpecify);
        myRASSurveyPage.dynamicallyEnterTextInCheckMarkedTextBox(15).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.dynamicallyEnterTextInCheckMarkedTextBox(15), ras_Survey_TestDataManager.pleaseSelectAllMedicationsYourMotherTookOption15PleaseSpecify);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        MiscUtils.sleep(2000);
        String[] column1Values = {ras_Survey_TestDataManager.pleaseProvideDetailsOfTheMedicationTakenColumn1Option1,
                ras_Survey_TestDataManager.pleaseProvideDetailsOfTheMedicationTakenColumn1Option2,
                ras_Survey_TestDataManager.pleaseProvideDetailsOfTheMedicationTakenColumn1Option3,
                ras_Survey_TestDataManager.pleaseProvideDetailsOfTheMedicationTakenColumn1Option4,
                ras_Survey_TestDataManager.pleaseProvideDetailsOfTheMedicationTakenColumn1Option5,
                ras_Survey_TestDataManager.pleaseProvideDetailsOfTheMedicationTakenColumn1Option6,
                ras_Survey_TestDataManager.pleaseProvideDetailsOfTheMedicationTakenColumn1Option7,
                ras_Survey_TestDataManager.pleaseProvideDetailsOfTheMedicationTakenColumn1Option8,
                ras_Survey_TestDataManager.pleaseProvideDetailsOfTheMedicationTakenColumn1Option9,
                ras_Survey_TestDataManager.pleaseProvideDetailsOfTheMedicationTakenColumn1Option10,
                ras_Survey_TestDataManager.pleaseProvideDetailsOfTheMedicationTakenColumn1Option11,
                ras_Survey_TestDataManager.pleaseProvideDetailsOfTheMedicationTakenColumn1Option12,
                ras_Survey_TestDataManager.pleaseProvideDetailsOfTheMedicationTakenColumn1Option13,
                ras_Survey_TestDataManager.pleaseProvideDetailsOfTheMedicationTakenColumn1Option14,
                ras_Survey_TestDataManager.pleaseProvideDetailsOfTheMedicationTakenColumn1Option15};
        for(int j = 1;j < 16;j++){
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(j, 3).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(j, 3),column1Values[j-1]);
        }
        String[] column2Values = {ras_Survey_TestDataManager.pleaseProvideDetailsOfTheMedicationTakenColumn2Option1,
                ras_Survey_TestDataManager.pleaseProvideDetailsOfTheMedicationTakenColumn2Option2,
                ras_Survey_TestDataManager.pleaseProvideDetailsOfTheMedicationTakenColumn2Option3,
                ras_Survey_TestDataManager.pleaseProvideDetailsOfTheMedicationTakenColumn2Option4,
                ras_Survey_TestDataManager.pleaseProvideDetailsOfTheMedicationTakenColumn2Option5,
                ras_Survey_TestDataManager.pleaseProvideDetailsOfTheMedicationTakenColumn2Option6,
                ras_Survey_TestDataManager.pleaseProvideDetailsOfTheMedicationTakenColumn2Option7,
                ras_Survey_TestDataManager.pleaseProvideDetailsOfTheMedicationTakenColumn2Option8,
                ras_Survey_TestDataManager.pleaseProvideDetailsOfTheMedicationTakenColumn2Option9,
                ras_Survey_TestDataManager.pleaseProvideDetailsOfTheMedicationTakenColumn2Option10,
                ras_Survey_TestDataManager.pleaseProvideDetailsOfTheMedicationTakenColumn2Option11,
                ras_Survey_TestDataManager.pleaseProvideDetailsOfTheMedicationTakenColumn2Option12,
                ras_Survey_TestDataManager.pleaseProvideDetailsOfTheMedicationTakenColumn2Option13,
                ras_Survey_TestDataManager.pleaseProvideDetailsOfTheMedicationTakenColumn2Option14,
                ras_Survey_TestDataManager.pleaseProvideDetailsOfTheMedicationTakenColumn2Option15};
        for(int a = 1; a < 16; a++){
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(a, 6).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(a, 6),column2Values[a-1]);
        }
        String[] dropDownValues = {ras_Survey_TestDataManager.pleaseProvideDetailsOfTheMedicationTakenDROPDOWNOption1,
                ras_Survey_TestDataManager.pleaseProvideDetailsOfTheMedicationTakenDROPDOWNOption2,
                ras_Survey_TestDataManager.pleaseProvideDetailsOfTheMedicationTakenDROPDOWNOption3,
                ras_Survey_TestDataManager.pleaseProvideDetailsOfTheMedicationTakenDROPDOWNOption4,
                ras_Survey_TestDataManager.pleaseProvideDetailsOfTheMedicationTakenDROPDOWNOption5,
                ras_Survey_TestDataManager.pleaseProvideDetailsOfTheMedicationTakenDROPDOWNOption6,
                ras_Survey_TestDataManager.pleaseProvideDetailsOfTheMedicationTakenDROPDOWNOption7,
                ras_Survey_TestDataManager.pleaseProvideDetailsOfTheMedicationTakenDROPDOWNOption8,
                ras_Survey_TestDataManager.pleaseProvideDetailsOfTheMedicationTakenDROPDOWNOption9,
                ras_Survey_TestDataManager.pleaseProvideDetailsOfTheMedicationTakenDROPDOWNOption10,
                ras_Survey_TestDataManager.pleaseProvideDetailsOfTheMedicationTakenDROPDOWNOption11,
                ras_Survey_TestDataManager.pleaseProvideDetailsOfTheMedicationTakenDROPDOWNOption12,
                ras_Survey_TestDataManager.pleaseProvideDetailsOfTheMedicationTakenDROPDOWNOption13,
                ras_Survey_TestDataManager.pleaseProvideDetailsOfTheMedicationTakenDROPDOWNOption14,
                ras_Survey_TestDataManager.pleaseProvideDetailsOfTheMedicationTakenDROPDOWNOption15,};
        for(int b = 1; b < 16; b++){
            CommonUtils.selectDropDownValue(dropDownValues[b-1],myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationdropDown(b));
        }
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.didYourBiologicalMotherUseAnyTobacco));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.didYourBiologicalMotherUseAnyTobacco));
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.didYourBiologicalMotherUseAnyTobacco));
            CucumberLogUtils.logScreenshot();
        }
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.whatTobaccoProductsDidYourBiologicalMotherOption1));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.whatTobaccoProductsDidYourBiologicalMotherOption1));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.whatTobaccoProductsDidYourBiologicalMotherOption2));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.whatTobaccoProductsDidYourBiologicalMotherOption3));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.whatTobaccoProductsDidYourBiologicalMotherOption4));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.whatTobaccoProductsDidYourBiologicalMotherOption5));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.whatTobaccoProductsDidYourBiologicalMotherOption6));
        myRASSurveyPage.otherPleaseSpecifyTextBox.clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.otherPleaseSpecifyTextBox, ras_Survey_TestDataManager.whatTobaccoProductsDidYourBiologicalMotherOption6PleaseSpecify);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.didYourBiologicalMotherUseAnyVaping));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.didYourBiologicalMotherUseAnyVaping));
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.didYourBiologicalMotherUseAnyVaping));
            CucumberLogUtils.logScreenshot();
        }
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.whichVapingProductsDidYourMotherUseOption1));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.whichVapingProductsDidYourMotherUseOption1));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.whichVapingProductsDidYourMotherUseOption2));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.whichVapingProductsDidYourMotherUseOption3));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.whichVapingProductsDidYourMotherUseOption4));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.whichVapingProductsDidYourMotherUseOption5));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.whichVapingProductsDidYourMotherUseOption6));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.whichVapingProductsDidYourMotherUseOption7));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.whichVapingProductsDidYourMotherUseOption8));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.whichVapingProductsDidYourMotherUseOption9));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.whichVapingProductsDidYourMotherUseOption10));
        myRASSurveyPage.otherPleaseSpecifyTextBox.clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.otherPleaseSpecifyTextBox, ras_Survey_TestDataManager.whichVapingProductsDidYourMotherUseOption10PleaseSpecify);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.didYourBiologicalMotherDrink));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.didYourBiologicalMotherDrink));
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.didYourBiologicalMotherDrink));
            CucumberLogUtils.logScreenshot();
        }
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.WhatAlcoholicBeveragesDidYourMotherDrinkOption1));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.WhatAlcoholicBeveragesDidYourMotherDrinkOption1));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.WhatAlcoholicBeveragesDidYourMotherDrinkOption2));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.WhatAlcoholicBeveragesDidYourMotherDrinkOption3));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.WhatAlcoholicBeveragesDidYourMotherDrinkOption4));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.WhatAlcoholicBeveragesDidYourMotherDrinkOption5));
        myRASSurveyPage.otherPleaseSpecifyTextBox.clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.otherPleaseSpecifyTextBox, ras_Survey_TestDataManager.WhatAlcoholicBeveragesDidYourMotherDrinkOption5Other);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.didYourBiologicalMotherUseAnyRecreationalDrugs));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.didYourBiologicalMotherUseAnyRecreationalDrugs));
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.didYourBiologicalMotherUseAnyRecreationalDrugs));
            CucumberLogUtils.logScreenshot();
        }
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.whatRecreationalDrugOption1));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.whatRecreationalDrugOption1));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.whatRecreationalDrugOption2));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.whatRecreationalDrugOption3));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.whatRecreationalDrugOption4));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.whatRecreationalDrugOption5));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.whatRecreationalDrugOption6));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.whatRecreationalDrugOption7));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.whatRecreationalDrugOption8));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.whatRecreationalDrugOption9));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.whatRecreationalDrugOption10));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.whatRecreationalDrugOption11));
        myRASSurveyPage.otherPleaseSpecifyTextBox.clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.otherPleaseSpecifyTextBox, ras_Survey_TestDataManager.whatRecreationalDrugOption11Other);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.didYourBiologicalMotherEverLiveWhereSmokedCigarettes));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.didYourBiologicalMotherEverLiveWhereSmokedCigarettes));
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.didYourBiologicalMotherEverLiveWhereSmokedCigarettes));
            CucumberLogUtils.logScreenshot();
        }
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.whatProductsWereUsedAroundOption1));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.whatProductsWereUsedAroundOption1));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.whatProductsWereUsedAroundOption2));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.whatProductsWereUsedAroundOption3));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.whatProductsWereUsedAroundOption4));
        myRASSurveyPage.otherPleaseSpecifyTextBox.clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.otherPleaseSpecifyTextBox, ras_Survey_TestDataManager.whatProductsWereUsedAroundOption4Other);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3));
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3),ras_Survey_TestDataManager.biologicalMotherOccupationDuringPregnancy);
        JavascriptUtils.clickByJS(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(1, 6));
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 3),ras_Survey_TestDataManager.biologicalMotherOccupationDuringPregnancyFather);
        JavascriptUtils.clickByJS(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(2, 6));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(410));
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3),ras_Survey_TestDataManager.whatIsTheHeightOfYourBiologicalMother);
        JavascriptUtils.clickByJS(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(1, 6));
        JavascriptUtils.clickByJS(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(1, 10));
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 3),ras_Survey_TestDataManager.whatIsTheHeightOfYourBiologicalFather);
        JavascriptUtils.clickByJS(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(2, 6));
        JavascriptUtils.clickByJS(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(2, 10));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.rasSurveyTheNextSetOfQuestionsWillAskAboutHormoneRelatedGrowthText);
        CommonUtils.assertEqualsWithMessage(ras_Survey_TestDataManager.theNextSetHormoneRelatedGrowth,myRASSurveyPage.rasSurveyText.getText(), "-- VERIFYING THE NEXT SET OF QUESTIONS WILL ASK ABOUT HORMONE RELATED GROWTH TEXT --");
        CucumberLogUtils.logScreenshot();
    }

    public void rasScreenerSurveyScenario4PartTwo(){
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverBeenEvaluatedByAnEndocrinologist));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverBeenEvaluatedByAnEndocrinologist));
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverBeenEvaluatedByAnEndocrinologist));
            CucumberLogUtils.logScreenshot();
        }
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.enterTextInDoctorLocationHospitalTextBox(1));
        myRASSurveyPage.enterTextInDoctorLocationHospitalTextBox(1).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInDoctorLocationHospitalTextBox(1),ras_Survey_TestDataManager.whatIsTheNameOfTheEndocrinologistDoctor);
        myRASSurveyPage.enterTextInDoctorLocationHospitalTextBox(2).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInDoctorLocationHospitalTextBox(2),ras_Survey_TestDataManager.whatIsTheNameOfTheEndocrinologistLocation);
        myRASSurveyPage.enterTextInDoctorLocationHospitalTextBox(3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInDoctorLocationHospitalTextBox(3),ras_Survey_TestDataManager.whatIsTheNameOfTheEndocrinologistHospital);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverHadGrowthHormoneTesting));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverHadGrowthHormoneTesting));
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverHadGrowthHormoneTesting));
            CucumberLogUtils.logScreenshot();
        }
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.whatWereTheResultsOfYourGrowthHormoneOption1));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.whatWereTheResultsOfYourGrowthHormoneOption1));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.whatWereTheResultsOfYourGrowthHormoneOption2));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.whatWereTheResultsOfYourGrowthHormoneOption3));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.whatWereTheResultsOfYourGrowthHormoneOption4));
        myRASSurveyPage.otherPleaseSpecifyTextBox.clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.otherPleaseSpecifyTextBox, ras_Survey_TestDataManager.whatWereTheResultsOfYourGrowthHormoneOption4Other);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverReceivedGrowthHormoneTreatment));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverReceivedGrowthHormoneTreatment));
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverReceivedGrowthHormoneTreatment));
            CucumberLogUtils.logScreenshot();
        }
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(416));
        myRASSurveyPage.dynamicallyEnterTextInCheckMarkedTextBox(1).clear();
        CommonUtils.sendKeys(myRASSurveyPage.dynamicallyEnterTextInCheckMarkedTextBox(1), ras_Survey_TestDataManager.whatWasYourHeightBeforeStartingGrowthHormoneHeight);
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.howManyTimesHaveYouReceivedGrowthHormoneTreatmentDropDown);
        CommonUtils.selectDropDownValue(ras_Survey_TestDataManager.howManyTimesHaveYouReceivedGrowthHormoneTreatment,myRASSurveyPage.howManyTimesHaveYouReceivedGrowthHormoneTreatmentDropDown);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3));
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3),ras_Survey_TestDataManager.pleaseProvideTheDetailsOfGrowthHormoneReplacementAgeStart);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 4).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 4),ras_Survey_TestDataManager.pleaseProvideTheDetailsOfGrowthHormoneReplacementAgeStopped);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 7).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 7),ras_Survey_TestDataManager.pleaseProvideTheDetailsOfGrowthHormoneReplacementDateStart);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 8).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 8),ras_Survey_TestDataManager.pleaseProvideTheDetailsOfGrowthHormoneReplacementDateStopped);
        JavascriptUtils.clickByJS(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(1, 11));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.theNextSetOfQuestionsWillAskAboutDevelopmentText);
        CommonUtils.assertEqualsWithMessage(ras_Survey_TestDataManager.theNextSetOfQuestionsWillAskAboutDevelopment,myRASSurveyPage.rasSurveyText.getText(), "-- VERIFYING THE NEXT SET OF QUESTIONS WILL ASK ABOUT DEVELOPMENT TEXT --");
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.wereYouEverDiagnosedWithHypotoniaAsAnInfantOrChild));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.wereYouEverDiagnosedWithHypotoniaAsAnInfantOrChild));
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.wereYouEverDiagnosedWithHypotoniaAsAnInfantOrChild));
            CucumberLogUtils.logScreenshot();
        }
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.atWhatAgeWereYouAbleToSitWithoutSupport));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.atWhatAgeWereYouAbleToSitWithoutSupport));
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.atWhatAgeWereYouAbleToSitWithoutSupport));
            CucumberLogUtils.logScreenshot();
        }
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(421));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.atWhatAgeWereYouAbleToWalkWithoutSupport));
        CucumberLogUtils.logScreenshot();
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(422));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverReceivedPhysicalTherapy));
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverReceivedPhysicalTherapy));
            CucumberLogUtils.logScreenshot();
        }
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(423));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.atWhatAgeWereYouAbleToUseSimpleTwoWordPhrases));
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.atWhatAgeWereYouAbleToUseSimpleTwoWordPhrases));
            CucumberLogUtils.logScreenshot();
        }
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(424));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.howWouldYouDescribeYourCurrentSpeechCapabilities));
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.howWouldYouDescribeYourCurrentSpeechCapabilities));
            CucumberLogUtils.logScreenshot();
        }
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverReceivedSpeechTherapy));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverReceivedSpeechTherapy));
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverReceivedSpeechTherapy));
            CucumberLogUtils.logScreenshot();
        }
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.betweenTheAgesOf3And6YearsOld));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.betweenTheAgesOf3And6YearsOld));
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.betweenTheAgesOf3And6YearsOld));
            CucumberLogUtils.logScreenshot();
        }
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.didYouReceiveOccupationalTherapyBetween3And6YearsOfAge));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.didYouReceiveOccupationalTherapyBetween3And6YearsOfAge));
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.didYouReceiveOccupationalTherapyBetween3And6YearsOfAge));
            CucumberLogUtils.logScreenshot();
        }
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.betweenTheAgesOf6And10));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.betweenTheAgesOf6And10));
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.betweenTheAgesOf6And10));
            CucumberLogUtils.logScreenshot();
        }
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.betweenTheAgesOf10And17));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.betweenTheAgesOf10And17));
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.betweenTheAgesOf10And17));
            CucumberLogUtils.logScreenshot();
        }
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.pleaseIndicateTheHighestDegree));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.pleaseIndicateTheHighestDegree));
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.pleaseIndicateTheHighestDegree));
            CucumberLogUtils.logScreenshot();
        }
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.whatIsYourCurrentEmploymentStatus));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.whatIsYourCurrentEmploymentStatus));
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.whatIsYourCurrentEmploymentStatus));
            CucumberLogUtils.logScreenshot();
        }
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithLearningDifferencesOption1));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithLearningDifferencesOption1));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithLearningDifferencesOption2));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithLearningDifferencesOption3));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithLearningDifferencesOption4));
        myRASSurveyPage.otherPleaseSpecifyTextBox.clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.otherPleaseSpecifyTextBox, ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithLearningDifferencesOption4Other);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
    }

    public void rasScreenerSurveyScenario4PartThree() {
        //*** ATTACHING FILE CAN'T BE AUTOMATED IN QUATRICS. MANUAL TESTING WAS PERFORMED FOR UPLOADING A FILE *******
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.theNextSetOfQuestionsWillAskAboutHeartText);
        CommonUtils.assertEqualsWithMessage(ras_Survey_TestDataManager.theNextSetOfQuestionsWillAskAboutHeart, myRASSurveyPage.rasSurveyText.getText(), "-- VERIFYING THE NEXT SET OF QUESTIONS WILL ASK ABOUT HEART TEXT --");
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverBeenEvaluatedByACardiologist));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverBeenEvaluatedByACardiologist));
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverBeenEvaluatedByACardiologist));
            CucumberLogUtils.logScreenshot();
        }
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.enterTextInDoctorLocationHospitalTextBox(1));
        myRASSurveyPage.enterTextInDoctorLocationHospitalTextBox(1).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInDoctorLocationHospitalTextBox(1), ras_Survey_TestDataManager.whatIsTheNameOfTheCardiologistDoctor);
        myRASSurveyPage.enterTextInDoctorLocationHospitalTextBox(2).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInDoctorLocationHospitalTextBox(2), ras_Survey_TestDataManager.whatIsTheNameOfTheCardiologistLocation);
        myRASSurveyPage.enterTextInDoctorLocationHospitalTextBox(3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInDoctorLocationHospitalTextBox(3), ras_Survey_TestDataManager.whatIsTheNameOfTheCardiologistHospital);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithAnyStructuralHeartIssues));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithAnyStructuralHeartIssues));
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithAnyStructuralHeartIssues));
            CucumberLogUtils.logScreenshot();
        }
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(432));
        for (int m = 1; m < 7; m++) {
            CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicClickOnCheckboxesScreener(m));
        }
        myRASSurveyPage.dynamicallyEnterTextInCheckMarkedTextBox(6).clear();
        CommonUtils.sendKeys(myRASSurveyPage.dynamicallyEnterTextInCheckMarkedTextBox(6), ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithAnyOfTheFollowingStructuralHeartIssuesOption6Other);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverHadAnyOfTheFollowingSymptomsOption1));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverHadAnyOfTheFollowingSymptomsOption1));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverHadAnyOfTheFollowingSymptomsOption2));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverHadAnyOfTheFollowingSymptomsOption3));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverHadAnyOfTheFollowingSymptomsOption4));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverHadAnyOfTheFollowingSymptomsOption5));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverHadAnyOfTheFollowingSymptomsOption6));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverHadAnyOfTheFollowingSymptomsOption7));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverHadAnyOfTheFollowingSymptomsOption8));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverHadAnyOfTheFollowingSymptomsOption9));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverHadAnyOfTheFollowingSymptomsOption10));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverHadAnyOfTheFollowingSymptomsOption11));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        String[] column1Value = {ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn1Option1,
                ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn1Option2,
                ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn1Option3,
                ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn1Option4,
                ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn1Option5,
                ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn1Option6,
                ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn1Option7,
                ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn1Option8,
                ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn1Option9,
                ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn1Option10,
                ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn1Option11};
        for (int c = 1; c < 12; c++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(c, 3).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(c, 3), column1Value[c - 1]);
        }
        String[] column2Value = {ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn2Option1,
                ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn2Option2,
                ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn2Option3,
                ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn2Option4,
                ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn2Option5,
                ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn2Option6,
                ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn2Option7,
                ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn2Option8,
                ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn2Option9,
                ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn2Option10,
                ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn2Option11};
        for (int d = 1; d < 12; d++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(d, 4).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(d, 4), column2Value[d - 1]);
        }
        String[] column3Value = {ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn3Option1,
                ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn3Option2,
                ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn3Option3,
                ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn3Option4,
                ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn3Option5,
                ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn3Option6,
                ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn3Option7,
                ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn3Option8,
                ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn3Option9,
                ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn3Option10,
                ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn3Option11};
        for (int e = 1; e < 12; e++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(e, 5).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(e, 5), column3Value[e - 1]);
        }
        String[] column4Value = {ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn4Option1,
                ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn4Option2,
                ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn4Option3,
                ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn4Option4,
                ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn4Option5,
                ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn4Option6,
                ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn4Option7,
                ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn4Option8,
                ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn4Option9,
                ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn4Option10,
                ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn4Option11};
        for (int f = 1; f < 12; f++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(f, 8).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(f, 8), column4Value[f - 1]);
        }
        String[] column5Value = {ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn5Option1,
                ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn5Option2,
                ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn5Option3,
                ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn5Option4,
                ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn5Option5,
                ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn5Option6,
                ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn5Option7,
                ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn5Option8,
                ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn5Option9,
                ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn5Option10,
                ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn5Option11};
        for (int g = 1; g < 12; g++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(g, 11).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(g, 11), column5Value[g - 1]);
        }
        String[] column6Value = {ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn6Option1,
                ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn6Option2,
                ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn6Option3,
                ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn6Option4,
                ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn6Option5,
                ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn6Option6,
                ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn6Option7,
                ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn6Option8,
                ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn6Option9,
                ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn6Option10,
                ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn6Option11};
        for (int h = 1; h < 12; h++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(h, 12).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(h, 12), column6Value[h - 1]);
        }
        String[] column7Value = {ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn7Option1,
                ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn7Option2,
                ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn7Option3,
                ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn7Option4,
                ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn7Option5,
                ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn7Option6,
                ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn7Option7,
                ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn7Option8,
                ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn7Option9,
                ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn7Option10,
                ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn7Option11};
        for (int k = 1; k < 12; k++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(k, 13).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(k, 13), column7Value[k - 1]);
        }
        String[] column8Value = {ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn8Option1,
                ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn8Option2,
                ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn8Option3,
                ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn8Option4,
                ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn8Option5,
                ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn8Option6,
                ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn8Option7,
                ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn8Option8,
                ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn8Option9,
                ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn8Option10,
                ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn8Option11};
        for (int l = 1; l < 12; l++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(l, 16).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(l, 16), column8Value[l - 1]);
        }
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverReceivedTreatmentForHeartProblems));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverReceivedTreatmentForHeartProblems));
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverReceivedTreatmentForHeartProblems));
            CucumberLogUtils.logScreenshot();
        }
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(436));
        for (int ll = 1; ll < 5; ll++) {
            CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicClickOnCheckboxesScreener(ll));
        }
        myRASSurveyPage.dynamicallyEnterTextInCheckMarkedTextBox(1).clear();
        CommonUtils.sendKeys(myRASSurveyPage.dynamicallyEnterTextInCheckMarkedTextBox(1), ras_Survey_TestDataManager.haveYouEverHadAnyOfTheFollowingTreatmentsForHeartOption1Specify);
        myRASSurveyPage.dynamicallyEnterTextInCheckMarkedTextBox(4).clear();
        CommonUtils.sendKeys(myRASSurveyPage.dynamicallyEnterTextInCheckMarkedTextBox(4), ras_Survey_TestDataManager.haveYouEverHadAnyOfTheFollowingTreatmentsForHeartOption4Specify);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForClickability(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3));
        String[] column1ValueFirstTreatment = {ras_Survey_TestDataManager.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn1Option1,
                ras_Survey_TestDataManager.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn1Option2,
                ras_Survey_TestDataManager.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn1Option3,
                ras_Survey_TestDataManager.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn1Option4};
        for (int m = 1; m < 5; m++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(m, 3).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(m, 3), column1ValueFirstTreatment[m - 1]);
        }
        String[] column2ValueFirstTreatment = {ras_Survey_TestDataManager.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn2Option1,
                ras_Survey_TestDataManager.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn2Option2,
                ras_Survey_TestDataManager.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn2Option3,
                ras_Survey_TestDataManager.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn2Option4};
        for (int n = 1; n < 5; n++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(n, 4).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(n, 4), column2ValueFirstTreatment[n - 1]);
        }
        String[] column3ValueFirstTreatment = {ras_Survey_TestDataManager.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn3Option1,
                ras_Survey_TestDataManager.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn3Option2,
                ras_Survey_TestDataManager.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn3Option3,
                ras_Survey_TestDataManager.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn3Option4};
        for (int o = 1; o < 5; o++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(o, 5).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(o, 5), column3ValueFirstTreatment[o - 1]);
        }
        String[] column4ValueFirstTreatment = {ras_Survey_TestDataManager.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn4Option1,
                ras_Survey_TestDataManager.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn4Option2,
                ras_Survey_TestDataManager.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn4Option3,
                ras_Survey_TestDataManager.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn4Option4};
        for (int p = 1; p < 5; p++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(p, 8).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(p, 8), column4ValueFirstTreatment[p - 1]);
        }
        String[] column5ValueFirstTreatment = {ras_Survey_TestDataManager.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn5Option1,
                ras_Survey_TestDataManager.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn5Option2,
                ras_Survey_TestDataManager.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn5Option3,
                ras_Survey_TestDataManager.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn5Option4};
        for (int q = 1; q < 5; q++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(q, 11).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(q, 11), column5ValueFirstTreatment[q - 1]);
        }
        String[] column6ValueFirstTreatment = {ras_Survey_TestDataManager.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn6Option1,
                ras_Survey_TestDataManager.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn6Option2,
                ras_Survey_TestDataManager.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn6Option3,
                ras_Survey_TestDataManager.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn6Option4};
        for (int r = 1; r < 5; r++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(r, 12).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(r, 12), column6ValueFirstTreatment[r - 1]);
        }
        String[] column7ValueFirstTreatment = {ras_Survey_TestDataManager.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn7Option1,
                ras_Survey_TestDataManager.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn7Option2,
                ras_Survey_TestDataManager.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn7Option3,
                ras_Survey_TestDataManager.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn7Option4};
        for (int s = 1; s < 5; s++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(s, 13).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(s, 13), column7ValueFirstTreatment[s - 1]);
        }
        String[] column8ValueFirstTreatment = {ras_Survey_TestDataManager.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn8Option1,
                ras_Survey_TestDataManager.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn8Option2,
                ras_Survey_TestDataManager.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn8Option3,
                ras_Survey_TestDataManager.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn8Option4};
        for (int t = 1; t < 5; t++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(t, 16).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(t, 16), column8ValueFirstTreatment[t - 1]);
        }
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.areYouStillOn));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.areYouStillOn));
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.areYouStillOn));
            CucumberLogUtils.logScreenshot();
        }
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(440));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithAnyFunctionalHeartIssues));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
                CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(441));
        for (int mm = 1; mm < 5; mm++) {
            CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicClickOnCheckboxesScreener(mm));
        }
        myRASSurveyPage.dynamicallyEnterTextInCheckMarkedTextBox(4).clear();
        CommonUtils.sendKeys(myRASSurveyPage.dynamicallyEnterTextInCheckMarkedTextBox(4), ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithAnyFunctionalHeartIssuesOption4Other);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForClickability(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3));
        String[] column1ValueConditions = {ras_Survey_TestDataManager.pleaseProvideAnyDetailsKnownForTheConditionsColumn1Option1,
                ras_Survey_TestDataManager.pleaseProvideAnyDetailsKnownForTheConditionsColumn1Option2,
                ras_Survey_TestDataManager.pleaseProvideAnyDetailsKnownForTheConditionsColumn1Option3,
                ras_Survey_TestDataManager.pleaseProvideAnyDetailsKnownForTheConditionsColumn1Option4};
        for (int mm = 1; mm < 5; mm++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(mm, 3).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(mm, 3), column1ValueConditions[mm - 1]);
        }
        String[] column2ValueConditions = {ras_Survey_TestDataManager.pleaseProvideAnyDetailsKnownForTheConditionsColumn2Option1,
                ras_Survey_TestDataManager.pleaseProvideAnyDetailsKnownForTheConditionsColumn2Option2,
                ras_Survey_TestDataManager.pleaseProvideAnyDetailsKnownForTheConditionsColumn2Option3,
                ras_Survey_TestDataManager.pleaseProvideAnyDetailsKnownForTheConditionsColumn2Option4};
        for (int nn = 1; nn < 5; nn++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(nn, 4).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(nn, 4), column2ValueConditions[nn - 1]);
        }
        String[] column3ValueConditions = {ras_Survey_TestDataManager.pleaseProvideAnyDetailsKnownForTheConditionsColumn3Option1,
                ras_Survey_TestDataManager.pleaseProvideAnyDetailsKnownForTheConditionsColumn3Option2,
                ras_Survey_TestDataManager.pleaseProvideAnyDetailsKnownForTheConditionsColumn3Option3,
                ras_Survey_TestDataManager.pleaseProvideAnyDetailsKnownForTheConditionsColumn3Option4};
        for (int oo = 1; oo < 5; oo++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(oo, 5).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(oo, 5), column3ValueConditions[oo - 1]);
        }
        String[] column4ValueConditions = {ras_Survey_TestDataManager.pleaseProvideAnyDetailsKnownForTheConditionsColumn4Option1,
                ras_Survey_TestDataManager.pleaseProvideAnyDetailsKnownForTheConditionsColumn4Option2,
                ras_Survey_TestDataManager.pleaseProvideAnyDetailsKnownForTheConditionsColumn4Option3,
                ras_Survey_TestDataManager.pleaseProvideAnyDetailsKnownForTheConditionsColumn4Option4};
        for (int pp = 1; pp < 5; pp++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(pp, 8).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(pp, 8), column4ValueConditions[pp - 1]);
        }
        String[] column5ValueConditions = {ras_Survey_TestDataManager.pleaseProvideAnyDetailsKnownForTheConditionsColumn5Option1,
                ras_Survey_TestDataManager.pleaseProvideAnyDetailsKnownForTheConditionsColumn5Option2,
                ras_Survey_TestDataManager.pleaseProvideAnyDetailsKnownForTheConditionsColumn5Option3,
                ras_Survey_TestDataManager.pleaseProvideAnyDetailsKnownForTheConditionsColumn5Option4};
        for (int qq = 1; qq < 5; qq++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(qq, 9).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(qq, 9), column5ValueConditions[qq - 1]);
        }
        String[] column6ValueConditions = {ras_Survey_TestDataManager.pleaseProvideAnyDetailsKnownForTheConditionsColumn6Option1,
                ras_Survey_TestDataManager.pleaseProvideAnyDetailsKnownForTheConditionsColumn6Option2,
                ras_Survey_TestDataManager.pleaseProvideAnyDetailsKnownForTheConditionsColumn6Option3,
                ras_Survey_TestDataManager.pleaseProvideAnyDetailsKnownForTheConditionsColumn6Option4};
        for (int rr = 1; rr < 5; rr++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(rr, 10).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(rr, 10), column6ValueConditions[rr - 1]);
        }
        String[] column7ValueConditions = {ras_Survey_TestDataManager.pleaseProvideAnyDetailsKnownForTheConditionsColumn7Option1,
                ras_Survey_TestDataManager.pleaseProvideAnyDetailsKnownForTheConditionsColumn7Option2,
                ras_Survey_TestDataManager.pleaseProvideAnyDetailsKnownForTheConditionsColumn7Option3,
                ras_Survey_TestDataManager.pleaseProvideAnyDetailsKnownForTheConditionsColumn7Option4};
        for (int ss = 1; ss < 5; ss++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(ss, 13).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(ss, 13), column7ValueConditions[ss - 1]);
        }
        String[] column8ValueConditions = {ras_Survey_TestDataManager.pleaseProvideAnyDetailsKnownForTheConditionsColumn8Option1,
                ras_Survey_TestDataManager.pleaseProvideAnyDetailsKnownForTheConditionsColumn8Option2,
                ras_Survey_TestDataManager.pleaseProvideAnyDetailsKnownForTheConditionsColumn8Option3,
                ras_Survey_TestDataManager.pleaseProvideAnyDetailsKnownForTheConditionsColumn8Option4};
        for (int tt = 1; tt < 5; tt++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(tt, 16).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(tt, 16), column8ValueConditions[tt - 1]);
        }
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.theNextTwoQuestionsWillAskAboutRASopathyDiagnosesText);
        CommonUtils.assertEqualsWithMessage(ras_Survey_TestDataManager.theNextTwoQuestionsWillAskAboutRASopathyDiagnoses, myRASSurveyPage.rasSurveyText.getText(), "-- VERIFYING THE NEXT TWO QUESTIONS WILL ASK ABOUT RASOPATHY DIAGNOSES TEXT --");
        CucumberLogUtils.logScreenshot();
    }
    public void rasScreenerSurveyScenario4PartFour() {
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouBeenDiagnosedWithARASopathy));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouBeenDiagnosedWithARASopathy));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.pleaseIndicateIfYouHaveBeenDiagnosedWithRASopathiesOption1));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.pleaseIndicateIfYouHaveBeenDiagnosedWithRASopathiesOption1));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.pleaseIndicateIfYouHaveBeenDiagnosedWithRASopathiesOption2));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.pleaseIndicateIfYouHaveBeenDiagnosedWithRASopathiesOption3));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.pleaseIndicateIfYouHaveBeenDiagnosedWithRASopathiesOption4));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.pleaseIndicateIfYouHaveBeenDiagnosedWithRASopathiesOption5));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.pleaseIndicateIfYouHaveBeenDiagnosedWithRASopathiesOption6));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.pleaseIndicateIfYouHaveBeenDiagnosedWithRASopathiesOption7));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.pleaseIndicateIfYouHaveBeenDiagnosedWithRASopathiesOption8));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.pleaseIndicateIfYouHaveBeenDiagnosedWithRASopathiesOption9));
        myRASSurveyPage.otherPleaseSpecifyTextBox.clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.otherPleaseSpecifyTextBox, ras_Survey_TestDataManager.pleaseIndicateIfYouHaveBeenDiagnosedWithRASopathiesOption9Other);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.theNextTwoQuestionsWillAskAboutMedicalHistoryText);
        CommonUtils.assertEqualsWithMessage(ras_Survey_TestDataManager.theNextSetOfQuestionsWillAskAboutGeneralMedicalHistory, myRASSurveyPage.rasSurveyText.getText(), "-- VERIFYING THE NEXT SET OF QUESTIONS WILL ASK ABOUT GENERAL MEDICAL HISTORY TEXT --");
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.doYouHaveAPrimaryCareProvider));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.doYouHaveAPrimaryCareProvider));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.enterTextInDoctorLocationHospitalTextBox(1));
        myRASSurveyPage.enterTextInDoctorLocationHospitalTextBox(1).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInDoctorLocationHospitalTextBox(1), ras_Survey_TestDataManager.pleaseProvideTheInformationForYourPrimaryCareProviderBelowDoctor);
        myRASSurveyPage.enterTextInDoctorLocationHospitalTextBox(2).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInDoctorLocationHospitalTextBox(2), ras_Survey_TestDataManager.pleaseProvideTheInformationForYourPrimaryCareProviderBelowLocation);
        myRASSurveyPage.enterTextInDoctorLocationHospitalTextBox(3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInDoctorLocationHospitalTextBox(3), ras_Survey_TestDataManager.pleaseProvideTheInformationForYourPrimaryCareProviderBelowHospital);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForClickability(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(1, 3));
        JavascriptUtils.clickByJS(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(1, 3));
        JavascriptUtils.clickByJS(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(2, 3));
        JavascriptUtils.clickByJS(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(3, 3));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.addButton);
        JavascriptUtils.clickByJS(myRASSurveyPage.addButton);
        CommonUtils.waitForVisibility(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3));
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3), ras_Survey_TestDataManager.pleaseCompleteAllMedicationsToWhichYouAreAllergicColumn1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 6).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 6), ras_Survey_TestDataManager.pleaseCompleteAllMedicationsToWhichYouAreAllergicColumn2);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(449));
        JavascriptUtils.clickByJS(myRASSurveyPage.addButton);
        CommonUtils.waitForVisibility(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3));
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3), ras_Survey_TestDataManager.pleaseCompleteAllFoodsToWhichYouAreAllergicColumn1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 6).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 6), ras_Survey_TestDataManager.pleaseCompleteAllFoodsToWhichYouAreAllergicColumn2);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(450));
        JavascriptUtils.clickByJS(myRASSurveyPage.addButton);
        CommonUtils.waitForVisibility(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3));
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3), ras_Survey_TestDataManager.pleaseCompleteAllOtherToWhichYouAreAllergicColumn1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 6).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 6), ras_Survey_TestDataManager.pleaseCompleteAllOtherToWhichYouAreAllergicColumn2);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverHadAnOperationOrBiopsy));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverHadAnOperationOrBiopsy));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.addButton);
        JavascriptUtils.clickByJS(myRASSurveyPage.addButton);
        CommonUtils.waitForVisibility(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3));
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3), ras_Survey_TestDataManager.pleaseProvideTheInformationForEachBiopsyColumn1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 6).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 6), ras_Survey_TestDataManager.pleaseProvideTheInformationForEachBiopsyColumn2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 7).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 7), ras_Survey_TestDataManager.pleaseProvideTheInformationForEachBiopsyColumn3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 8).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 8), ras_Survey_TestDataManager.pleaseProvideTheInformationForEachBiopsyColumn4);
        CommonUtils.selectDropDownValue(ras_Survey_TestDataManager.pleaseProvideTheInformationForEachBiopsyColumn5, myRASSurveyPage.dynamicDropDownTwo(1, 11));
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 14).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 14), ras_Survey_TestDataManager.pleaseProvideTheInformationForEachBiopsyColumn6);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverBeenHospitalizedForAnyReason));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverBeenHospitalizedForAnyReason));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.addButton);
        JavascriptUtils.clickByJS(myRASSurveyPage.addButton);
        CommonUtils.waitForVisibility(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3));
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3), ras_Survey_TestDataManager.pleaseProvideTheInformationForEachHospitalizationColumn1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 6).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 6), ras_Survey_TestDataManager.pleaseProvideTheInformationForEachHospitalizationColumn2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 7).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 7), ras_Survey_TestDataManager.pleaseProvideTheInformationForEachHospitalizationColumn3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 8).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 8), ras_Survey_TestDataManager.pleaseProvideTheInformationForEachHospitalizationColumn4);
        myRASSurveyPage.enterTextInTextAreaTextBox(1, 11).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInTextAreaTextBox(1, 11), ras_Survey_TestDataManager.pleaseProvideTheInformationForEachHospitalizationColumn5);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.theNextTwoQuestionsWillAskAboutGiText);
        CommonUtils.assertEqualsWithMessage(ras_Survey_TestDataManager.theNextSetOfQuestionsWillAskAboutGi, myRASSurveyPage.rasSurveyText.getText(), "-- VERIFYING THE NEXT SET OF QUESTIONS WILL ASK ABOUT GI TEXT --");
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverBeenEvaluatedByAGastroenterologist));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverBeenEvaluatedByAGastroenterologist));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.enterTextInDoctorLocationHospitalTextBox(1));
        myRASSurveyPage.enterTextInDoctorLocationHospitalTextBox(1).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInDoctorLocationHospitalTextBox(1), ras_Survey_TestDataManager.pleaseProvideTheDetailsForTheGastroenterologistDoctor);
        myRASSurveyPage.enterTextInDoctorLocationHospitalTextBox(2).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInDoctorLocationHospitalTextBox(2), ras_Survey_TestDataManager.pleaseProvideTheDetailsForTheGastroenterologistLocation);
        myRASSurveyPage.enterTextInDoctorLocationHospitalTextBox(3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInDoctorLocationHospitalTextBox(3), ras_Survey_TestDataManager.pleaseProvideTheDetailsForTheGastroenterologistHospital);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithAnyOfTheFollowingFeedingDifficultiesOption1));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithAnyOfTheFollowingFeedingDifficultiesOption1));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithAnyOfTheFollowingFeedingDifficultiesOption2));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithAnyOfTheFollowingFeedingDifficultiesOption3));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithAnyOfTheFollowingFeedingDifficultiesOption4));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithAnyOfTheFollowingFeedingDifficultiesOption5));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithAnyOfTheFollowingFeedingDifficultiesOption6));
        myRASSurveyPage.otherPleaseSpecifyTextBox.clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.otherPleaseSpecifyTextBox, ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithAnyOfTheFollowingFeedingDifficultiesOption6Other);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.atWhatAgeWasTheNasogastricOrNasojejunalTubePlaced));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.atWhatAgeWasTheNasogastricOrNasojejunalTubePlaced));
        myRASSurveyPage.agePleaseSpecifyTextBox.clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.agePleaseSpecifyTextBox, ras_Survey_TestDataManager.atWhatAgeWasTheNasogastricOrNasojejunalTubePlacedAge);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(123));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.atWhatAgeWasTheGastrostomyGtubePlaced));
        myRASSurveyPage.agePleaseSpecifyTextBox.clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.agePleaseSpecifyTextBox, ras_Survey_TestDataManager.atWhatAgeWasTheGastrostomyGtubePlacedAge);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.atWhatAgeWasTheGastrostomyGtubeRemoved));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.atWhatAgeWasTheGastrostomyGtubeRemoved));
        myRASSurveyPage.agePleaseSpecifyTextBox.clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.agePleaseSpecifyTextBox, ras_Survey_TestDataManager.atWhatAgeWasTheGastrostomyGtubeRemovedAge);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.HaveYouEverHadAnyPhysicalSymptoms));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.HaveYouEverHadAnyPhysicalSymptoms));
        CucumberLogUtils.logScreenshot();
    }

    public void rasScreenerSurveyScenario4PartFive() {
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.whichOfTheFollowingSymptomsRelatedToTheGIOption1));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.whichOfTheFollowingSymptomsRelatedToTheGIOption1));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.whichOfTheFollowingSymptomsRelatedToTheGIOption2));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.whichOfTheFollowingSymptomsRelatedToTheGIOption3));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.whichOfTheFollowingSymptomsRelatedToTheGIOption4));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.whichOfTheFollowingSymptomsRelatedToTheGIOption5));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.whichOfTheFollowingSymptomsRelatedToTheGIOption6));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.whichOfTheFollowingSymptomsRelatedToTheGIOption7));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.whichOfTheFollowingSymptomsRelatedToTheGIOption8));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.whichOfTheFollowingSymptomsRelatedToTheGIOption9));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.whichOfTheFollowingSymptomsRelatedToTheGIOption10));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.whichOfTheFollowingSymptomsRelatedToTheGIOption11));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.whichOfTheFollowingSymptomsRelatedToTheGIOption12));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.whichOfTheFollowingSymptomsRelatedToTheGIOption13));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.whichOfTheFollowingSymptomsRelatedToTheGIOption14));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.whichOfTheFollowingSymptomsRelatedToTheGIOption15));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.whichOfTheFollowingSymptomsRelatedToTheGIOption16));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.whichOfTheFollowingSymptomsRelatedToTheGIOption17));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.whichOfTheFollowingSymptomsRelatedToTheGIOption18));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.whichOfTheFollowingSymptomsRelatedToTheGIOption19));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.whichOfTheFollowingSymptomsRelatedToTheGIOption20));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.whichOfTheFollowingSymptomsRelatedToTheGIOption21));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForClickability(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(1, 3));
        for (int u = 1; u < 22; u++) {
            JavascriptUtils.clickByJS(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(u, 3));
        }
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForClickability(myRASSurveyPage.gaggingRadioButton(1, 1));
        JavascriptUtils.clickByJS(myRASSurveyPage.gaggingRadioButton(1, 1));
        JavascriptUtils.clickByJS(myRASSurveyPage.gaggingRadioButton(2, 1));
        JavascriptUtils.clickByJS(myRASSurveyPage.gaggingRadioButton(3, 1));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForClickability(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(1, 3));
        JavascriptUtils.clickByJS(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(1, 3));
        JavascriptUtils.clickByJS(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(1, 8));
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 13).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 13), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowRegardingHeartburnColumn1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 14).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 14), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowRegardingHeartburnColumn2);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForClickability(myRASSurveyPage.pleaseCompleteTheTableBelowRegardingNauseaSymptomsText);
        JavascriptUtils.clickByJS(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(1, 3));
        JavascriptUtils.clickByJS(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(1, 8));
        JavascriptUtils.clickByJS(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(1, 13));
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 18).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 18), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowRegardingHeartburnColumn1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 19).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 19), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowRegardingHeartburnColumn2);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForClickability(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(1, 3));
        MiscUtils.sleep(2000);
        for (int v = 1; v < 20; v++) {
            JavascriptUtils.clickByJS(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(v, 3));
        }
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(345));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveAnyMedicationsEverBeenTakenForAbdominalPain));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.medicationForAbdominalPainDropDownTwo());
        CommonUtils.selectDropDownValue(ras_Survey_TestDataManager.howManyMedicationsHaveBeenTakenForAbdominalPain, myRASSurveyPage.medicationForAbdominalPainDropDownTwo());
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3));
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowRegardingTheMedicationsColumn1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 4).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 4), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowRegardingTheMedicationsColumn2);
        myRASSurveyPage.enterTextInTextAreaTextBox(1, 7).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInTextAreaTextBox(1, 7), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowRegardingTheMedicationsColumn3);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.pleaseCompleteTheNextSetOfQuestionsRegardingVomitingText);
        for (int x = 1; x < 8; x++) {
            JavascriptUtils.clickByJS(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(x, 3));
        }
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(346));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.hasAnyMedicationEverBeenTakenForVomiting));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.medicationForAbdominalPainDropDownTwo());
        CommonUtils.selectDropDownValue(ras_Survey_TestDataManager.howManyMedicationsHaveBeenTakenForVomiting, myRASSurveyPage.medicationForAbdominalPainDropDownTwo());
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3));
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3), ras_Survey_TestDataManager.pleaseCompleteTheListMedicationsTakenForVomitingColumn1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 4).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 4), ras_Survey_TestDataManager.pleaseCompleteTheListMedicationsTakenForVomitingColumn1);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.haveAnyOfTheFollowingSymptomsOccurred4Text);
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveAnyOfTheFollowingSymptomsOccurred4Option1));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveAnyOfTheFollowingSymptomsOccurred4Option2));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveAnyOfTheFollowingSymptomsOccurred4Option3));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 2));
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 2).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 2), ras_Survey_TestDataManager.pleaseAnswerTheBelowQuestionsRegardingJaundiceTextBox1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 2).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 2), ras_Survey_TestDataManager.pleaseAnswerTheBelowQuestionsRegardingJaundiceTextBox2);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.doYouTakeALactoseSupplement));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.doYouTakeALactoseSupplement));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(575));
        myRASSurveyPage.dynamicOneTextBox(575).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.dynamicOneTextBox(575), ras_Survey_TestDataManager.toWhatFoodsAreYouAverse);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForClickability(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(1, 3));
        JavascriptUtils.clickByJS(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(1, 3));
        JavascriptUtils.clickByJS(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(2, 3));
        JavascriptUtils.clickByJS(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(3, 3));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 2));
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 2).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 2), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowRegardingDiarrheaOption1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 2).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 2), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowRegardingDiarrheaOption2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 2).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 2), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowRegardingDiarrheaOption3);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForClickability(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(1, 3));
        for (int y = 1; y < 9; y++) {
            JavascriptUtils.clickByJS(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(y, 3));
        }
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 2));
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 2).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 2), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowRegardingEncopresisOption1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 2).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 2), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowRegardingEncopresisOption2);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.pleaseCompleteTheInformationBelowRegardingBowelText);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 2).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 2), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowRegardingWeightLossOption1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 2).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 2), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowRegardingWeightLossOption2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 2).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 2), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowRegardingWeightLossOption3);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForClickability(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(1, 3));
        JavascriptUtils.clickByJS(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(1, 3));
        JavascriptUtils.clickByJS(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(1, 8));
        JavascriptUtils.clickByJS(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(1, 13));
        JavascriptUtils.clickByJS(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(1, 14));
        JavascriptUtils.clickByJS(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(1, 15));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(576));
        CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.areYouToiletTrained));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.medicationForAbdominalPainDropDownTwo());
        CommonUtils.selectDropDownValue(ras_Survey_TestDataManager.atWhatAgeWereYouToiletTrained, myRASSurveyPage.medicationForAbdominalPainDropDownTwo());
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForClickability(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(1, 3));
        JavascriptUtils.clickByJS(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(1, 3));
        JavascriptUtils.clickByJS(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(1, 8));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForClickability(myRASSurveyPage.pleaseCompleteTheTableBelowRegardingWeightLossText);
        JavascriptUtils.clickByJS(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(1, 3));
        JavascriptUtils.clickByJS(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(1, 8));
        JavascriptUtils.clickByJS(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(1, 13));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.medicationForAbdominalPainDropDownTwo());
        CommonUtils.selectDropDownValue(ras_Survey_TestDataManager.howManyBowelMovementsDoYouHavePerWeek, myRASSurveyPage.medicationForAbdominalPainDropDownTwo());
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(579));
        CommonUtils.selectDropDownValue(ras_Survey_TestDataManager.whatIsTheLongestAmountOfTimeThatHasPassedWithout,myRASSurveyPage.howManyTimesHaveYouReceivedGrowthHormoneTreatmentDropDown);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.pleaseUseTheBristolStoolChart));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.pleaseUseTheBristolStoolChart));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverHadAProcedureTestOrStudyToEvaluate));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverHadAProcedureTestOrStudyToEvaluate));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.pleaseIndicateWhichOfTheFollowingProceduresOption1));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.pleaseIndicateWhichOfTheFollowingProceduresOption1));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.pleaseIndicateWhichOfTheFollowingProceduresOption2));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.pleaseIndicateWhichOfTheFollowingProceduresOption3));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.pleaseIndicateWhichOfTheFollowingProceduresOption4));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.pleaseIndicateWhichOfTheFollowingProceduresOption5));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.pleaseIndicateWhichOfTheFollowingProceduresOption6));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.pleaseIndicateWhichOfTheFollowingProceduresOption7));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.pleaseIndicateWhichOfTheFollowingProceduresOption8));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.pleaseIndicateWhichOfTheFollowingProceduresOption9));
        myRASSurveyPage.dynamicOtheriPleaseSpecifyTextBox(ras_Survey_TestDataManager.pleaseIndicateWhichOfTheFollowingProceduresOption9).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.dynamicOtheriPleaseSpecifyTextBox(ras_Survey_TestDataManager.pleaseIndicateWhichOfTheFollowingProceduresOption9), ras_Survey_TestDataManager.pleaseIndicateWhichOfTheFollowingProceduresOption90ther);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForClickability(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3));
        String[] column1KindOfProcedure = {ras_Survey_TestDataManager.pleaseProvideAnyDetailsKnownForTheConditionsColumn1Option1,
                ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForTheFirstProcedureColumn1Option2,
                ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForTheFirstProcedureColumn1Option3,
                ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForTheFirstProcedureColumn1Option4,
                ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForTheFirstProcedureColumn1Option5,
                ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForTheFirstProcedureColumn1Option6,
                ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForTheFirstProcedureColumn1Option7,
                ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForTheFirstProcedureColumn1Option8,
                ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForTheFirstProcedureColumn1Option9};
        for (int aaa = 1; aaa < 10; aaa++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(aaa, 3).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(aaa, 3), column1KindOfProcedure[aaa - 1]);
        }
        String[] column2KindOfProcedure = {ras_Survey_TestDataManager.pleaseProvideAnyDetailsKnownForTheConditionsColumn2Option1,
                ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForTheFirstProcedureColumn2Option2,
                ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForTheFirstProcedureColumn2Option3,
                ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForTheFirstProcedureColumn2Option4,
                ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForTheFirstProcedureColumn2Option5,
                ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForTheFirstProcedureColumn2Option6,
                ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForTheFirstProcedureColumn2Option7,
                ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForTheFirstProcedureColumn2Option8,
                ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForTheFirstProcedureColumn2Option9};
        for (int bbb = 1; bbb < 10; bbb++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(bbb, 6).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(bbb, 6), column2KindOfProcedure[bbb - 1]);
        }
        String[] column3KindOfProcedure = {ras_Survey_TestDataManager.pleaseProvideAnyDetailsKnownForTheConditionsColumn3Option1,
                ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForTheFirstProcedureColumn3Option2,
                ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForTheFirstProcedureColumn3Option3,
                ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForTheFirstProcedureColumn3Option4,
                ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForTheFirstProcedureColumn3Option5,
                ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForTheFirstProcedureColumn3Option6,
                ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForTheFirstProcedureColumn3Option7,
                ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForTheFirstProcedureColumn3Option8,
                ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForTheFirstProcedureColumn3Option9};
        for (int ccc = 1; ccc < 10; ccc++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(ccc, 9).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(ccc, 9), column3KindOfProcedure[ccc - 1]);
        }
        String[] column4KindOfProcedure = {ras_Survey_TestDataManager.pleaseProvideAnyDetailsKnownForTheConditionsColumn4Option1,
                ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForTheFirstProcedureColumn4Option2,
                ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForTheFirstProcedureColumn4Option3,
                ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForTheFirstProcedureColumn4Option4,
                ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForTheFirstProcedureColumn4Option5,
                ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForTheFirstProcedureColumn4Option6,
                ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForTheFirstProcedureColumn4Option7,
                ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForTheFirstProcedureColumn4Option8,
                ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForTheFirstProcedureColumn4Option9};
        for (int ddd = 1; ddd < 10; ddd++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(ddd, 12).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(ddd, 12), column4KindOfProcedure[ddd - 1]);
        }
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        //*********************** RUN THIS CODE ONLY ON NEW OR RESETTED FORMS ********************************/
        CommonUtils.waitForClickability(myRASSurveyPage.pleaseProvideInformationForTheMostRecentProcedureText);
        String[] column1MostRecentProcedure = {ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn1Option1,
                ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn1Option2,
                ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn1Option3,
                ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn1Option4,
                ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn1Option5,
                ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn1Option6,
                ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn1Option7,
                ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn1Option8,
                ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn1Option9};
        for (int fff = 1; fff < 10; fff++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(fff, 3).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(fff, 3), column1MostRecentProcedure[fff - 1]);
        }
        String[] column2MostRecentProcedure = {ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn2Option1,
                ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn2Option2,
                ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn2Option3,
                ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn2Option4,
                ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn2Option5,
                ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn2Option6,
                ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn2Option7,
                ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn2Option8,
                ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn2Option9};
        for (int ggg = 1; ggg < 10; ggg++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(ggg, 6).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(ggg, 6), column2MostRecentProcedure[ggg - 1]);
        }
        String[] column3MostRecentProcedure = {ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn3Option1,
                ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn3Option2,
                ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn3Option3,
                ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn3Option4,
                ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn3Option5,
                ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn3Option6,
                ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn3Option7,
                ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn3Option8,
                ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn3Option9};
        for (int hhh = 1; hhh < 10; hhh++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(hhh, 9).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(hhh, 9), column3MostRecentProcedure[hhh - 1]);
        }
        String[] column4MostRecentProcedure = {ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn4Option1,
                ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn4Option2,
                ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn4Option3,
                ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn4Option4,
                ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn4Option5,
                ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn4Option6,
                ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn4Option7,
                ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn4Option8,
                ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn4Option9};
        for (int iii = 1; iii < 10; iii++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(iii, 12).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(iii, 12), column4MostRecentProcedure[iii - 1]);
        }
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        //*********************** RUN THE CODE ABOVE ONLY ON NEW OR RESETTED FORMS ********************************/
    }

    public void rasScreenerSurveyScenario4PartSix() {
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(305));
        CommonUtils.assertEqualsWithMessage(ras_Survey_TestDataManager.theNextSetOfQuestionsAskAboutBreathingAndTheLungs, myRASSurveyPage.rasSurveyText.getText(), "-- VERIFYING THE NEXT SET OF QUESTIONS ASK ABOUT BREATHING AND THE LUNGS TEXT --");
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(454));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverHadAnEvaluationByAPulmonologist));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 2));
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 2).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 2), ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForThePulmonologistOption1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 2).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 2), ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForThePulmonologistOption2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 2).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 2), ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForThePulmonologistOption3);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(456));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverHadWheezingOrWhistling));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(457));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouBeenDiagnosedWithReactiveAirwayDisease));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(458));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverBeenSeenInTheEmergencyRoomForABreathing));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(459));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverBeenSeenInTheHospitalForABreathing));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(330));
        CommonUtils.assertEqualsWithMessage(ras_Survey_TestDataManager.theNextSetOfQuestionsWillAskAboutOralHealthAndDental, myRASSurveyPage.rasSurveyText.getText(), "-- VERIFYING THE NEXT SET OF QUESTIONS WILL ASK ABOUT ORAL HEALTH AND DENTAL HISTORY TEXT --");
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(529));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.doYouReceiveRegularDentalCare));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 2));
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 2).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 2), ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForWhereDentalOption1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 2).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 2), ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForWhereDentalOption2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 2).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 2), ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForWhereDentalOption3);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(530));
        myRASSurveyPage.dynamicOneTextBox(530).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.dynamicOneTextBox(530), ras_Survey_TestDataManager.whenDidYouLastVisitADentist);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(531));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.whatWasTheReasonForYourLastDentalVisitOption));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(532));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.doYourGumsBleedRegularlyWithToothBrushing));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(533));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.doYourTeethOrGumsHurtRegularly));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(534));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.doYouHavePeriodontalOrGumDisease));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(535));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouHadDentalSealantsPlaced));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(536));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.doYouCurrentlyHaveCavities));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(537));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouPreviouslyHadAnyDentalFillings));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(538));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.doesYourMouthUsuallyFeelDry));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(539));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.overallHowWouldYouRateTheOverallHealth));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(540));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.overallHowWouldYouRateYourDentalHygieneRoutine));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(541));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouHadAnyChangesInYourSenseOfSmell));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(542));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouHadAnyChangesInYourSenseOfTaste));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(543));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.doYouHaveJawOrTemporomandibularJointPain));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(544));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.doYouHaveFrequentHeadaches));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(545));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouHadAnyOrthodonticTreatment));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(546));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouHadAPalatalExpansion));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(547));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouHadAnyFacialOrDentalTrauma));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(185));
        myRASSurveyPage.dynamicPleaseSpecifyTextBox(ras_Survey_TestDataManager.didTheFacialOrDentalTraumaRequireSurgery).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.dynamicPleaseSpecifyTextBox(ras_Survey_TestDataManager.didTheFacialOrDentalTraumaRequireSurgery), ras_Survey_TestDataManager.didTheFacialOrDentalTraumaRequireSurgeryPlease);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(548));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouHadElectiveJawSurgery));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(549));
        myRASSurveyPage.dynamicPleaseSpecifyTextBox(ras_Survey_TestDataManager.doYouHaveAHistoryOfCancerInTheMouthOrJaw).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.dynamicPleaseSpecifyTextBox(ras_Survey_TestDataManager.doYouHaveAHistoryOfCancerInTheMouthOrJaw), ras_Survey_TestDataManager.doYouHaveAHistoryOfCancerInTheMouthOrJawPlease);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(550));
        myRASSurveyPage.dynamicPleaseSpecifyTextBox(ras_Survey_TestDataManager.doYouHaveAFamilyMemberWithAJawAbnormality).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.dynamicPleaseSpecifyTextBox(ras_Survey_TestDataManager.doYouHaveAFamilyMemberWithAJawAbnormality), ras_Survey_TestDataManager.doYouHaveAFamilyMemberWithAJawAbnormalityPlease);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(551));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.doYouHaveAnyNumbnessInOrAroundYourMouth));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(552));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.doYouHaveAnyMouthSores));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(553));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.doYourTeethFeelSensitiveToHotOrColdFoods));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(554));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.doYouHaveProblemsMovingYourLipsTongueOrMouth));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(555));
        myRASSurveyPage.dynamicPleaseSpecifyTextBox(ras_Survey_TestDataManager.overallIsThereAnythingUnusualAboutYourTeethOrMouth).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.dynamicPleaseSpecifyTextBox(ras_Survey_TestDataManager.overallIsThereAnythingUnusualAboutYourTeethOrMouth), ras_Survey_TestDataManager.overallIsThereAnythingUnusualAboutYourTeethOrMouthPlease);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
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
                ras_Survey_TestDataManager.haveYouFeltThatLifeInGeneralIsLessSatisfying
        };
        for (int jjj = 556; jjj < 570; jjj++) {
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(jjj));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(clickingOnOptionInMultiplePages[jjj-556]));
            CucumberLogUtils.logScreenshot();
            rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        }
    }

    public void rasScreenerSurveyScenario4PartSeven() {
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(306));
        CommonUtils.assertEqualsWithMessage(ras_Survey_TestDataManager.theNextSetOfQuestionsAskAboutFluidBalance, myRASSurveyPage.rasSurveyText.getText(), "-- VERIFYING THE NEXT SET OF QUESTIONS ASK ABOUT FLUID BALANCE AND IF ANY FLUID BUILDS TEXT --");
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(460));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithALymphaticSystemIssue));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithAnyOfTheFollowingLymphaticOption1));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithAnyOfTheFollowingLymphaticOption1));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithAnyOfTheFollowingLymphaticOption2));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithAnyOfTheFollowingLymphaticOption3));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithAnyOfTheFollowingLymphaticOption4));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithAnyOfTheFollowingLymphaticOption5));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithAnyOfTheFollowingLymphaticOption6));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithAnyOfTheFollowingLymphaticOption7));
        myRASSurveyPage.dynamicPleaseSpecifyTextBox(ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithAnyOfTheFollowingLymphaticOption7).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.dynamicPleaseSpecifyTextBox(ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithAnyOfTheFollowingLymphaticOption7), ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithAnyOfTheFollowingLymphaticOption7Other);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForClickability(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3));
        String[] abilityOnser1 = {ras_Survey_TestDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn1Option1,
                ras_Survey_TestDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn1Option2,
                ras_Survey_TestDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn1Option3,
                ras_Survey_TestDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn1Option4,
                ras_Survey_TestDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn1Option5,
                ras_Survey_TestDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn1Option6,
                ras_Survey_TestDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn1Option7};
        for (int lll = 1; lll < 8; lll++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(lll, 3).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(lll, 3), abilityOnser1[lll - 1]);
        }
        String[] abilityOnser2 = {ras_Survey_TestDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn2Option1,
                ras_Survey_TestDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn2Option2,
                ras_Survey_TestDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn2Option3,
                ras_Survey_TestDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn2Option4,
                ras_Survey_TestDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn2Option5,
                ras_Survey_TestDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn2Option6,
                ras_Survey_TestDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn2Option7};
        for (int mmm = 1; mmm < 8; mmm++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(mmm, 4).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(mmm, 4), abilityOnser2[mmm - 1]);
        }
        String[] abilityOnser3 = {ras_Survey_TestDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn3Option1,
                ras_Survey_TestDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn3Option2,
                ras_Survey_TestDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn3Option3,
                ras_Survey_TestDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn3Option4,
                ras_Survey_TestDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn3Option5,
                ras_Survey_TestDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn3Option6,
                ras_Survey_TestDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn3Option7};
        for (int nnn = 1; nnn < 8; nnn++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(nnn, 5).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(nnn, 5), abilityOnser3[nnn - 1]);
        }
        String[] abilityOnser4 = {ras_Survey_TestDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn4Option1,
                ras_Survey_TestDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn4Option2,
                ras_Survey_TestDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn4Option3,
                ras_Survey_TestDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn4Option4,
                ras_Survey_TestDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn4Option5,
                ras_Survey_TestDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn4Option6,
                ras_Survey_TestDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn4Option7};
        for (int ooo = 1; ooo < 8; ooo++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(ooo, 8).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(ooo, 8), abilityOnser4[ooo - 1]);
        }
        String[] abilityOnser5 = {ras_Survey_TestDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn5Option1,
                ras_Survey_TestDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn5Option2,
                ras_Survey_TestDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn5Option3,
                ras_Survey_TestDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn5Option4,
                ras_Survey_TestDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn5Option5,
                ras_Survey_TestDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn5Option6,
                ras_Survey_TestDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn5Option7};
        for (int ppp = 1; ppp < 8; ppp++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(ppp, 9).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(ppp, 9), abilityOnser5[ppp - 1]);
        }
        String[] abilityOnser6 = {ras_Survey_TestDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn6Option1,
                ras_Survey_TestDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn6Option2,
                ras_Survey_TestDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn6Option3,
                ras_Survey_TestDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn6Option4,
                ras_Survey_TestDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn6Option5,
                ras_Survey_TestDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn6Option6,
                ras_Survey_TestDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn6Option7};
        for (int rrr = 1; rrr < 8; rrr++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(rrr, 10).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(rrr, 10), abilityOnser6[rrr - 1]);
        }
        String[] abilityOnser7 = {ras_Survey_TestDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn7Option1,
                ras_Survey_TestDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn7Option2,
                ras_Survey_TestDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn7Option3,
                ras_Survey_TestDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn7Option4,
                ras_Survey_TestDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn7Option5,
                ras_Survey_TestDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn7Option6,
                ras_Survey_TestDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn7Option7};
        for (int sss = 1; sss < 8; sss++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(sss, 13).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(sss, 13), abilityOnser7[sss - 1]);
        }
        String[] abilityOnser8 = {ras_Survey_TestDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn8Option1,
                ras_Survey_TestDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn8Option2,
                ras_Survey_TestDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn8Option3,
                ras_Survey_TestDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn8Option4,
                ras_Survey_TestDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn8Option5,
                ras_Survey_TestDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn8Option6,
                ras_Survey_TestDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn8Option7};
        for (int ttt = 1; ttt  < 8; ttt ++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(ttt , 16).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(ttt , 16), abilityOnser8[ttt  - 1]);
        }
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(332));
        CommonUtils.assertEqualsWithMessage(ras_Survey_TestDataManager.theNextSetOfQuestionsWillAskAboutTheKidneys, myRASSurveyPage.rasSurveyText.getText(), "-- VERIFYING THE NEXT SET OF QUESTIONS WILL ASK ABOUT THE KIDNEYS TEXT --");
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(463));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverBeenEvaluatedByANephrologist));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 2));
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 2).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 2), ras_Survey_TestDataManager.pleaseListTheInformationBelowForTheNephrologistOption1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 2).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 2), ras_Survey_TestDataManager.pleaseListTheInformationBelowForTheNephrologistOption2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 2).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 2), ras_Survey_TestDataManager.pleaseListTheInformationBelowForTheNephrologistOption3);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(465));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverBeenEvaluatedByANephrologist));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithAnyOfTheFollowingKidneyProblemsOption1));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithAnyOfTheFollowingKidneyProblemsOption1));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithAnyOfTheFollowingKidneyProblemsOption2));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithAnyOfTheFollowingKidneyProblemsOption3));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithAnyOfTheFollowingKidneyProblemsOption4));
        myRASSurveyPage.dynamicPleaseSpecifyTextBox(ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithAnyOfTheFollowingKidneyProblemsOption4).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.dynamicPleaseSpecifyTextBox(ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithAnyOfTheFollowingKidneyProblemsOption4), ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithAnyOfTheFollowingKidneyProblemsOption4Other);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForClickability(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3));
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1 , 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1 , 3), ras_Survey_TestDataManager.pleaseCompleteTheTableRegardingKidneyColumn1Option1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2 , 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2 , 3), ras_Survey_TestDataManager.pleaseCompleteTheTableRegardingKidneyColumn1Option2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3 , 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3 , 3), ras_Survey_TestDataManager.pleaseCompleteTheTableRegardingKidneyColumn1Option3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4 , 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4 , 3), ras_Survey_TestDataManager.pleaseCompleteTheTableRegardingKidneyColumn1Option4);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1 , 4).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1 , 4), ras_Survey_TestDataManager.pleaseCompleteTheTableRegardingKidneyColumn2Option1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2 , 4).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2 , 4), ras_Survey_TestDataManager.pleaseCompleteTheTableRegardingKidneyColumn2Option2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3 , 4).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3 , 4), ras_Survey_TestDataManager.pleaseCompleteTheTableRegardingKidneyColumn2Option3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4 , 4).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4 , 4), ras_Survey_TestDataManager.pleaseCompleteTheTableRegardingKidneyColumn2Option4);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1 , 5).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1 , 5), ras_Survey_TestDataManager.pleaseCompleteTheTableRegardingKidneyColumn3Option1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2 , 5).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2 , 5), ras_Survey_TestDataManager.pleaseCompleteTheTableRegardingKidneyColumn3Option2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3 , 5).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3 , 5), ras_Survey_TestDataManager.pleaseCompleteTheTableRegardingKidneyColumn3Option3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4 , 5).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4 , 5), ras_Survey_TestDataManager.pleaseCompleteTheTableRegardingKidneyColumn3Option4);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1 , 8).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1 , 8), ras_Survey_TestDataManager.pleaseCompleteTheTableRegardingKidneyColumn4Option1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2 , 8).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2 , 8), ras_Survey_TestDataManager.pleaseCompleteTheTableRegardingKidneyColumn4Option2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3 , 8).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3 , 8), ras_Survey_TestDataManager.pleaseCompleteTheTableRegardingKidneyColumn4Option3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4 , 8).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4 , 8), ras_Survey_TestDataManager.pleaseCompleteTheTableRegardingKidneyColumn4Option4);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1 , 9).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1 , 9), ras_Survey_TestDataManager.pleaseCompleteTheTableRegardingKidneyColumn5Option1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2 , 9).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2 , 9), ras_Survey_TestDataManager.pleaseCompleteTheTableRegardingKidneyColumn5Option2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3 , 9).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3 , 9), ras_Survey_TestDataManager.pleaseCompleteTheTableRegardingKidneyColumn5Option3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4 , 9).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4 , 9), ras_Survey_TestDataManager.pleaseCompleteTheTableRegardingKidneyColumn5Option4);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1 , 10).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1 , 10), ras_Survey_TestDataManager.pleaseCompleteTheTableRegardingKidneyColumn6Option1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2 , 10).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2 , 10), ras_Survey_TestDataManager.pleaseCompleteTheTableRegardingKidneyColumn6Option2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3 , 10).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3 , 10), ras_Survey_TestDataManager.pleaseCompleteTheTableRegardingKidneyColumn6Option3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4 , 10).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4 , 10), ras_Survey_TestDataManager.pleaseCompleteTheTableRegardingKidneyColumn6Option4);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1 , 13).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1 , 13), ras_Survey_TestDataManager.pleaseCompleteTheTableRegardingKidneyColumn7Option1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2 , 13).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2 , 13), ras_Survey_TestDataManager.pleaseCompleteTheTableRegardingKidneyColumn7Option2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3 , 13).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3 , 13), ras_Survey_TestDataManager.pleaseCompleteTheTableRegardingKidneyColumn7Option3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4 , 13).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4 , 13), ras_Survey_TestDataManager.pleaseCompleteTheTableRegardingKidneyColumn7Option4);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1 , 16).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1 , 16), ras_Survey_TestDataManager.pleaseCompleteTheTableRegardingKidneyColumn8Option1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2 , 16).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2 , 16), ras_Survey_TestDataManager.pleaseCompleteTheTableRegardingKidneyColumn8Option2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3 , 16).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3 , 16), ras_Survey_TestDataManager.pleaseCompleteTheTableRegardingKidneyColumn8Option3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4 , 16).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4 , 16), ras_Survey_TestDataManager.pleaseCompleteTheTableRegardingKidneyColumn8Option4);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(309));
        CommonUtils.assertEqualsWithMessage(ras_Survey_TestDataManager.theNextSetOfQuestionsAskAboutHairAndSkinQualities, myRASSurveyPage.rasSurveyText.getText(), "-- VERIFYING THE NEXT SET OF QUESTIONS ASK ABOUT HAIR AND SKIN QUALITIES TEXT --");
        CucumberLogUtils.logScreenshot();
    }

    public void rasScreenerSurveyScenario4PartEight() {
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(468));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverBeenEvaluatedByADermatologist));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 2));
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 2).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 2), ras_Survey_TestDataManager.pleaseProvideDermatologistWhoCompletedYourEvaluationOption1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 2).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 2), ras_Survey_TestDataManager.pleaseProvideDermatologistWhoCompletedYourEvaluationOption2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 2).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 2), ras_Survey_TestDataManager.pleaseProvideDermatologistWhoCompletedYourEvaluationOption3);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(rasopathyQuestionnairePage.dynamicClickOnCheckboxesScreener(5));
        MiscUtils.sleep(1000);
        for (int a = 1; a < 8; a++) {
            CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicClickOnCheckboxesScreener(a));
        }
        myRASSurveyPage.dynamicPleaseSpecifyTextBox(ras_Survey_TestDataManager.pleaseChooseTheBestTermsToDescribeYourHair7).clear();
        CommonUtils.sendKeys(myRASSurveyPage.dynamicPleaseSpecifyTextBox(ras_Survey_TestDataManager.pleaseChooseTheBestTermsToDescribeYourHair7), ras_Survey_TestDataManager.pleaseChooseTheBestTermsToDescribeYourHair7Other);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(471));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.isTheTextureOrAmountOfYourHairSimilar));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(rasopathyQuestionnairePage.dynamicClickOnCheckboxesScreener(5));
        for (int b = 1; b < 6; b++) {
            CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicClickOnCheckboxesScreener(b));
        }
        myRASSurveyPage.dynamicallyEnterTextInCheckMarkedTextBox(5).clear();
        CommonUtils.sendKeys(myRASSurveyPage.dynamicallyEnterTextInCheckMarkedTextBox(5), ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithPatchesOfThickenedSkinOther);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(rasopathyQuestionnairePage.dynamicClickOnCheckboxesScreener(5));
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(473));
        for (int c = 1; c < 6; c++) {
            CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicClickOnCheckboxesScreener(c));
        }
        myRASSurveyPage.dynamicallyEnterTextInCheckMarkedTextBox(5).clear();
        CommonUtils.sendKeys(myRASSurveyPage.dynamicallyEnterTextInCheckMarkedTextBox(5), ras_Survey_TestDataManager.doYouHaveAnyOfTheFollowingPigmentedSkinFindingsOther);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(474));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.doYouHaveAnyHemangiomas));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(rasopathyQuestionnairePage.dynamicClickOnCheckboxesScreener(5));
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(475));
        for (int d = 1; d < 6; d++) {
            CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicClickOnCheckboxesScreener(d));
        }
        myRASSurveyPage.dynamicallyEnterTextInCheckMarkedTextBox(5).clear();
        CommonUtils.sendKeys(myRASSurveyPage.dynamicallyEnterTextInCheckMarkedTextBox(5), ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithAnyOfTheFollowingSkinTumorsOthers);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(310));
        CommonUtils.assertEqualsWithMessage(ras_Survey_TestDataManager.theNextSetOfQuestionsAskAboutSkeletalConditions, myRASSurveyPage.rasSurveyText.getText(), "-- VERIFYING THE NEXT SET OF QUESTIONS ASK ABOUT SKELETAL CONDITIONS TEXT --");
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(476));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.isTheTextureOrAmountOfYourHairSimilar));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 2));
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 2).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 2), ras_Survey_TestDataManager.pleaseProvideTheDetailsBelowForTheOrthopaedicOption1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 2).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 2), ras_Survey_TestDataManager.pleaseProvideTheDetailsBelowForTheOrthopaedicOption2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 2).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 2), ras_Survey_TestDataManager.pleaseProvideTheDetailsBelowForTheOrthopaedicOption3);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(rasopathyQuestionnairePage.dynamicClickOnCheckboxesScreener(2));
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(478));
        for (int e = 1; e < 5; e++) {
            CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicClickOnCheckboxesScreener(e));
        }
        myRASSurveyPage.dynamicallyEnterTextInCheckMarkedTextBox(4).clear();
        CommonUtils.sendKeys(myRASSurveyPage.dynamicallyEnterTextInCheckMarkedTextBox(4), ras_Survey_TestDataManager.haveYouBeenDiagnosedWithAnyOfTheFollowingSkeletalOption4Other);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(479));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.doYouHaveAnyIssuesWithCurvingOfTheSpine));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(rasopathyQuestionnairePage.dynamicClickOnCheckboxesScreener(2));
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(480));
        for (int f = 1; f < 5; f++) {
            CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicClickOnCheckboxesScreener(f));
        }
        myRASSurveyPage.dynamicallyEnterTextInCheckMarkedTextBox(4).clear();
        CommonUtils.sendKeys(myRASSurveyPage.dynamicallyEnterTextInCheckMarkedTextBox(4), ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithAnyOfTheFollowingTypesOfCurvatureOption1Other);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForClickability(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3));
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowForEachOfTheSpineIssuesColumn1Option1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 3), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowForEachOfTheSpineIssuesColumn1Option2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 3), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowForEachOfTheSpineIssuesColumn1Option3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 3), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowForEachOfTheSpineIssuesColumn1Option4);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 4).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 4), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowForEachOfTheSpineIssuesColumn2Option1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 4).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 4), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowForEachOfTheSpineIssuesColumn2Option2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 4).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 4), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowForEachOfTheSpineIssuesColumn2Option3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 4).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 4), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowForEachOfTheSpineIssuesColumn2Option4);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 5).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 5), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowForEachOfTheSpineIssuesColumn3Option1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 5).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 5), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowForEachOfTheSpineIssuesColumn3Option2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 5).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 5), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowForEachOfTheSpineIssuesColumn3Option3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 5).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 5), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowForEachOfTheSpineIssuesColumn3Option4);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 8).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 8), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowForEachOfTheSpineIssuesColumn4Option1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 8).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 8), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowForEachOfTheSpineIssuesColumn4Option2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 8).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 8), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowForEachOfTheSpineIssuesColumn4Option3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 8).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 8), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowForEachOfTheSpineIssuesColumn4Option4);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 9).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 9), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowForEachOfTheSpineIssuesColumn5Option1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 9).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 9), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowForEachOfTheSpineIssuesColumn5Option2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 9).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 9), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowForEachOfTheSpineIssuesColumn5Option3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 9).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 9), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowForEachOfTheSpineIssuesColumn5Option4);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 10).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 10), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowForEachOfTheSpineIssuesColumn6Option1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 10).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 10), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowForEachOfTheSpineIssuesColumn6Option2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 10).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 10), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowForEachOfTheSpineIssuesColumn6Option3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 10).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 10), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowForEachOfTheSpineIssuesColumn6Option4);
        myRASSurveyPage.enterTextInTextAreaTextBox(1, 13).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInTextAreaTextBox(1, 13), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowForEachOfTheSpineIssuesColumn7Option1);
        myRASSurveyPage.enterTextInTextAreaTextBox(2, 13).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInTextAreaTextBox(2, 13), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowForEachOfTheSpineIssuesColumn7Option2);
        myRASSurveyPage.enterTextInTextAreaTextBox(3, 13).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInTextAreaTextBox(3, 13), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowForEachOfTheSpineIssuesColumn7Option3);
        myRASSurveyPage.enterTextInTextAreaTextBox(4, 13).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInTextAreaTextBox(4, 13), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowForEachOfTheSpineIssuesColumn7Option4);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(482));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.hasYourNeckBeenDescribedAsShortOrWebbed));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(483));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithJointIssues));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(rasopathyQuestionnairePage.dynamicClickOnCheckboxesScreener(2));
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(484));
        for (int g = 1; g < 7; g++) {
            CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicClickOnCheckboxesScreener(g));
        }
        myRASSurveyPage.dynamicallyEnterTextInCheckMarkedTextBox(6).clear();
        CommonUtils.sendKeys(myRASSurveyPage.dynamicallyEnterTextInCheckMarkedTextBox(6), ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithTheFollowingJointIssues6Other);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForClickability(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3));
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3), ras_Survey_TestDataManager.pleaseCompleteTheJointIssuesListedColumn1Option1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 3), ras_Survey_TestDataManager.pleaseCompleteTheJointIssuesListedColumn1Option2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 3), ras_Survey_TestDataManager.pleaseCompleteTheJointIssuesListedColumn1Option3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 3), ras_Survey_TestDataManager.pleaseCompleteTheJointIssuesListedColumn1Option4);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(5, 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(5, 3), ras_Survey_TestDataManager.pleaseCompleteTheJointIssuesListedColumn1Option5);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(6, 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(6, 3), ras_Survey_TestDataManager.pleaseCompleteTheJointIssuesListedColumn1Option6);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 4).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 4), ras_Survey_TestDataManager.pleaseCompleteTheJointIssuesListedColumn2Option1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 4).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 4), ras_Survey_TestDataManager.pleaseCompleteTheJointIssuesListedColumn2Option2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 4).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 4), ras_Survey_TestDataManager.pleaseCompleteTheJointIssuesListedColumn2Option3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 4).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 4), ras_Survey_TestDataManager.pleaseCompleteTheJointIssuesListedColumn2Option4);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(5, 4).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(5, 4), ras_Survey_TestDataManager.pleaseCompleteTheJointIssuesListedColumn2Option5);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(6, 4).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(6, 4), ras_Survey_TestDataManager.pleaseCompleteTheJointIssuesListedColumn2Option6);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 5).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 5), ras_Survey_TestDataManager.pleaseCompleteTheJointIssuesListedColumn3Option1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 5).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 5), ras_Survey_TestDataManager.pleaseCompleteTheJointIssuesListedColumn3Option2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 5).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 5), ras_Survey_TestDataManager.pleaseCompleteTheJointIssuesListedColumn3Option3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 5).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 5), ras_Survey_TestDataManager.pleaseCompleteTheJointIssuesListedColumn3Option4);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(5, 5).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(5, 5), ras_Survey_TestDataManager.pleaseCompleteTheJointIssuesListedColumn3Option5);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(6, 5).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(6, 5), ras_Survey_TestDataManager.pleaseCompleteTheJointIssuesListedColumn3Option6);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 8).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 8), ras_Survey_TestDataManager.pleaseCompleteTheJointIssuesListedColumn4Option1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 8).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 8), ras_Survey_TestDataManager.pleaseCompleteTheJointIssuesListedColumn4Option2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 8).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 8), ras_Survey_TestDataManager.pleaseCompleteTheJointIssuesListedColumn4Option3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 8).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 8), ras_Survey_TestDataManager.pleaseCompleteTheJointIssuesListedColumn4Option4);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(5, 8).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(5, 8), ras_Survey_TestDataManager.pleaseCompleteTheJointIssuesListedColumn4Option5);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(6, 8).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(6, 8), ras_Survey_TestDataManager.pleaseCompleteTheJointIssuesListedColumn4Option6);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 9).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 9), ras_Survey_TestDataManager.pleaseCompleteTheJointIssuesListedColumn5Option1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 9).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 9), ras_Survey_TestDataManager.pleaseCompleteTheJointIssuesListedColumn5Option2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 9).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 9), ras_Survey_TestDataManager.pleaseCompleteTheJointIssuesListedColumn5Option3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 9).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 9), ras_Survey_TestDataManager.pleaseCompleteTheJointIssuesListedColumn5Option4);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(5, 9).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(5, 9), ras_Survey_TestDataManager.pleaseCompleteTheJointIssuesListedColumn5Option5);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(6, 9).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(6, 9), ras_Survey_TestDataManager.pleaseCompleteTheJointIssuesListedColumn5Option6);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 10).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 10), ras_Survey_TestDataManager.pleaseCompleteTheJointIssuesListedColumn6Option1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 10).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 10), ras_Survey_TestDataManager.pleaseCompleteTheJointIssuesListedColumn6Option2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 10).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 10), ras_Survey_TestDataManager.pleaseCompleteTheJointIssuesListedColumn6Option3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 10).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 10), ras_Survey_TestDataManager.pleaseCompleteTheJointIssuesListedColumn6Option4);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(5, 10).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(5, 10), ras_Survey_TestDataManager.pleaseCompleteTheJointIssuesListedColumn6Option5);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(6, 10).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(6, 10), ras_Survey_TestDataManager.pleaseCompleteTheJointIssuesListedColumn6Option6);
        myRASSurveyPage.enterTextInTextAreaTextBox(1, 13).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInTextAreaTextBox(1, 13), ras_Survey_TestDataManager.pleaseCompleteTheJointIssuesListedColumn7Option1);
        myRASSurveyPage.enterTextInTextAreaTextBox(2, 13).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInTextAreaTextBox(2, 13), ras_Survey_TestDataManager.pleaseCompleteTheJointIssuesListedColumn7Option2);
        myRASSurveyPage.enterTextInTextAreaTextBox(3, 13).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInTextAreaTextBox(3, 13), ras_Survey_TestDataManager.pleaseCompleteTheJointIssuesListedColumn7Option3);
        myRASSurveyPage.enterTextInTextAreaTextBox(4, 13).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInTextAreaTextBox(4, 13), ras_Survey_TestDataManager.pleaseCompleteTheJointIssuesListedColumn7Option4);
        myRASSurveyPage.enterTextInTextAreaTextBox(5, 13).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInTextAreaTextBox(5, 13), ras_Survey_TestDataManager.pleaseCompleteTheJointIssuesListedColumn7Option5);
        myRASSurveyPage.enterTextInTextAreaTextBox(6, 13).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInTextAreaTextBox(6, 13), ras_Survey_TestDataManager.pleaseCompleteTheJointIssuesListedColumn7Option6);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(311));
        CommonUtils.assertEqualsWithMessage(ras_Survey_TestDataManager.theNextSetOfQuestionsAskAboutBloodDisorders, myRASSurveyPage.rasSurveyText.getText(), "-- VERIFYING THE NEXT SET OF QUESTIONS ASK ABOUT BLOOD DISORDERS TEXT --");
        CucumberLogUtils.logScreenshot();
    }
    public void rasScreenerSurveyScenario4PartNine() {
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(486));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverHadAnEvaluationByAHematologist));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 2));
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 2).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 2), ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForTheHematologistOption1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 2).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 2), ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForTheHematologistOption2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 2).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 2), ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForTheHematologistOption3);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(488));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager. doYouHaveIssuesWithBleedingOrBruising));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(489));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.doYouHaveAnyOfTheFollowingIssuesWithBleedingOrBruising1));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.doYouHaveAnyOfTheFollowingIssuesWithBleedingOrBruising2));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.doYouHaveAnyOfTheFollowingIssuesWithBleedingOrBruising3));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.doYouHaveAnyOfTheFollowingIssuesWithBleedingOrBruising4));
        myRASSurveyPage.dynamicallyEnterTextInCheckMarkedTextBox(4).clear();
        CommonUtils.sendKeys(myRASSurveyPage.dynamicallyEnterTextInCheckMarkedTextBox(4), ras_Survey_TestDataManager.doYouHaveAnyOfTheFollowingIssuesWithBleedingOrBruising4Other);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3));
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3), ras_Survey_TestDataManager.pleaseCompleteBleedingBruisingIssuesListedColumn1Option1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 3), ras_Survey_TestDataManager.pleaseCompleteBleedingBruisingIssuesListedColumn1Option2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 3), ras_Survey_TestDataManager.pleaseCompleteBleedingBruisingIssuesListedColumn1Option3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 3), ras_Survey_TestDataManager.pleaseCompleteBleedingBruisingIssuesListedColumn1Option4);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 4).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 4), ras_Survey_TestDataManager.pleaseCompleteBleedingBruisingIssuesListedColumn2Option1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 4).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 4), ras_Survey_TestDataManager.pleaseCompleteBleedingBruisingIssuesListedColumn2Option2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 4).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 4), ras_Survey_TestDataManager.pleaseCompleteBleedingBruisingIssuesListedColumn2Option3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 4).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 4), ras_Survey_TestDataManager.pleaseCompleteBleedingBruisingIssuesListedColumn2Option4);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 5).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 5), ras_Survey_TestDataManager.pleaseCompleteBleedingBruisingIssuesListedColumn3Option1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 5).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 5), ras_Survey_TestDataManager.pleaseCompleteBleedingBruisingIssuesListedColumn3Option2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 5).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 5), ras_Survey_TestDataManager.pleaseCompleteBleedingBruisingIssuesListedColumn3Option3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 5).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 5), ras_Survey_TestDataManager.pleaseCompleteBleedingBruisingIssuesListedColumn3Option4);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 8).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 8), ras_Survey_TestDataManager.pleaseCompleteBleedingBruisingIssuesListedColumn4Option1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 8).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 8), ras_Survey_TestDataManager.pleaseCompleteBleedingBruisingIssuesListedColumn4Option2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 8).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 8), ras_Survey_TestDataManager.pleaseCompleteBleedingBruisingIssuesListedColumn4Option3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 8).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 8), ras_Survey_TestDataManager.pleaseCompleteBleedingBruisingIssuesListedColumn4Option4);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 9).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 9), ras_Survey_TestDataManager.pleaseCompleteBleedingBruisingIssuesListedColumn5Option1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 9).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 9), ras_Survey_TestDataManager.pleaseCompleteBleedingBruisingIssuesListedColumn5Option2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 9).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 9), ras_Survey_TestDataManager.pleaseCompleteBleedingBruisingIssuesListedColumn5Option3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 9).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 9), ras_Survey_TestDataManager.pleaseCompleteBleedingBruisingIssuesListedColumn5Option4);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 10).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 10), ras_Survey_TestDataManager.pleaseCompleteBleedingBruisingIssuesListedColumn6Option1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 10).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 10), ras_Survey_TestDataManager.pleaseCompleteBleedingBruisingIssuesListedColumn6Option2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 10).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 10), ras_Survey_TestDataManager.pleaseCompleteBleedingBruisingIssuesListedColumn6Option3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 10).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 10), ras_Survey_TestDataManager.pleaseCompleteBleedingBruisingIssuesListedColumn6Option4);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 13).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 13), ras_Survey_TestDataManager.pleaseCompleteBleedingBruisingIssuesListedColumn7Option1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 13).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 13), ras_Survey_TestDataManager.pleaseCompleteBleedingBruisingIssuesListedColumn7Option2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 13).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 13), ras_Survey_TestDataManager.pleaseCompleteBleedingBruisingIssuesListedColumn7Option3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 13).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 13), ras_Survey_TestDataManager.pleaseCompleteBleedingBruisingIssuesListedColumn7Option4);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 16).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 16), ras_Survey_TestDataManager.pleaseCompleteBleedingBruisingIssuesListedColumn8Option1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 16).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 16), ras_Survey_TestDataManager.pleaseCompleteBleedingBruisingIssuesListedColumn8Option2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 16).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 16), ras_Survey_TestDataManager.pleaseCompleteBleedingBruisingIssuesListedColumn8Option3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 16).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 16), ras_Survey_TestDataManager.pleaseCompleteBleedingBruisingIssuesListedColumn8Option4);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(491));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.doYouHaveAnyKnownBloodDisorders));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(492));
        for (int j = 1; j < 9; j++) {
            CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicClickOnCheckboxesScreener(j));
        }
        myRASSurveyPage.dynamicallyEnterTextInCheckMarkedTextBox(7).clear();
        CommonUtils.sendKeys(myRASSurveyPage.dynamicallyEnterTextInCheckMarkedTextBox(7), ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithBloodDisorders7Other);
        myRASSurveyPage.dynamicallyEnterTextInCheckMarkedTextBox(8).clear();
        CommonUtils.sendKeys(myRASSurveyPage.dynamicallyEnterTextInCheckMarkedTextBox(8), ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithBloodDisorders8Other);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3));
        String[] blodDisorderColumn1 = {ras_Survey_TestDataManager.pleaseCompleteTheBloodDisordersIssuesListedColumn1Option1,
                ras_Survey_TestDataManager.pleaseCompleteTheBloodDisordersIssuesListedColumn1Option2,
                ras_Survey_TestDataManager.pleaseCompleteTheBloodDisordersIssuesListedColumn1Option3,
                ras_Survey_TestDataManager.pleaseCompleteTheBloodDisordersIssuesListedColumn1Option4,
                ras_Survey_TestDataManager.pleaseCompleteTheBloodDisordersIssuesListedColumn1Option5,
                ras_Survey_TestDataManager.pleaseCompleteTheBloodDisordersIssuesListedColumn1Option6,
                ras_Survey_TestDataManager.pleaseCompleteTheBloodDisordersIssuesListedColumn1Option7,
                ras_Survey_TestDataManager.pleaseCompleteTheBloodDisordersIssuesListedColumn1Option8};
        for (int k = 1; k < 9; k ++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(k, 3).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(k , 3), blodDisorderColumn1[k  - 1]);
        }
        String[] blodDisorderColumn2 = {ras_Survey_TestDataManager.pleaseCompleteTheBloodDisordersIssuesListedColumn2Option1,
                ras_Survey_TestDataManager.pleaseCompleteTheBloodDisordersIssuesListedColumn2Option2,
                ras_Survey_TestDataManager.pleaseCompleteTheBloodDisordersIssuesListedColumn2Option3,
                ras_Survey_TestDataManager.pleaseCompleteTheBloodDisordersIssuesListedColumn2Option4,
                ras_Survey_TestDataManager.pleaseCompleteTheBloodDisordersIssuesListedColumn2Option5,
                ras_Survey_TestDataManager.pleaseCompleteTheBloodDisordersIssuesListedColumn2Option6,
                ras_Survey_TestDataManager.pleaseCompleteTheBloodDisordersIssuesListedColumn2Option7,
                ras_Survey_TestDataManager.pleaseCompleteTheBloodDisordersIssuesListedColumn2Option8};
        for (int l = 1; l < 9; l ++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(l, 4).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(l, 4), blodDisorderColumn2[l - 1]);
        }
        String[] blodDisorderColumn3 = {ras_Survey_TestDataManager.pleaseCompleteTheBloodDisordersIssuesListedColumn3Option1,
                ras_Survey_TestDataManager.pleaseCompleteTheBloodDisordersIssuesListedColumn3Option2,
                ras_Survey_TestDataManager.pleaseCompleteTheBloodDisordersIssuesListedColumn3Option3,
                ras_Survey_TestDataManager.pleaseCompleteTheBloodDisordersIssuesListedColumn3Option4,
                ras_Survey_TestDataManager.pleaseCompleteTheBloodDisordersIssuesListedColumn3Option5,
                ras_Survey_TestDataManager.pleaseCompleteTheBloodDisordersIssuesListedColumn3Option6,
                ras_Survey_TestDataManager.pleaseCompleteTheBloodDisordersIssuesListedColumn3Option7,
                ras_Survey_TestDataManager.pleaseCompleteTheBloodDisordersIssuesListedColumn3Option8};
        for (int m = 1; m < 9; m ++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(m, 5).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(m, 5), blodDisorderColumn3[m - 1]);
        }
        String[] blodDisorderColumn4 = {ras_Survey_TestDataManager.pleaseCompleteTheBloodDisordersIssuesListedColumn4Option1,
                ras_Survey_TestDataManager.pleaseCompleteTheBloodDisordersIssuesListedColumn4Option2,
                ras_Survey_TestDataManager.pleaseCompleteTheBloodDisordersIssuesListedColumn4Option3,
                ras_Survey_TestDataManager.pleaseCompleteTheBloodDisordersIssuesListedColumn4Option4,
                ras_Survey_TestDataManager.pleaseCompleteTheBloodDisordersIssuesListedColumn4Option5,
                ras_Survey_TestDataManager.pleaseCompleteTheBloodDisordersIssuesListedColumn4Option6,
                ras_Survey_TestDataManager.pleaseCompleteTheBloodDisordersIssuesListedColumn4Option7,
                ras_Survey_TestDataManager.pleaseCompleteTheBloodDisordersIssuesListedColumn4Option8};
        for (int n = 1; n < 9; n ++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(n, 8).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(n, 8), blodDisorderColumn4[n - 1]);
        }
        String[] blodDisorderColumn5 = {ras_Survey_TestDataManager.pleaseCompleteTheBloodDisordersIssuesListedColumn5Option1,
                ras_Survey_TestDataManager.pleaseCompleteTheBloodDisordersIssuesListedColumn5Option2,
                ras_Survey_TestDataManager.pleaseCompleteTheBloodDisordersIssuesListedColumn5Option3,
                ras_Survey_TestDataManager.pleaseCompleteTheBloodDisordersIssuesListedColumn5Option4,
                ras_Survey_TestDataManager.pleaseCompleteTheBloodDisordersIssuesListedColumn5Option5,
                ras_Survey_TestDataManager.pleaseCompleteTheBloodDisordersIssuesListedColumn5Option6,
                ras_Survey_TestDataManager.pleaseCompleteTheBloodDisordersIssuesListedColumn5Option7,
                ras_Survey_TestDataManager.pleaseCompleteTheBloodDisordersIssuesListedColumn5Option8};
        for (int o = 1; o < 9; o ++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(o, 9).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(o, 9), blodDisorderColumn5[o - 1]);
        }
        String[] blodDisorderColumn6 = {ras_Survey_TestDataManager.pleaseCompleteTheBloodDisordersIssuesListedColumn6Option1,
                ras_Survey_TestDataManager.pleaseCompleteTheBloodDisordersIssuesListedColumn6Option2,
                ras_Survey_TestDataManager.pleaseCompleteTheBloodDisordersIssuesListedColumn6Option3,
                ras_Survey_TestDataManager.pleaseCompleteTheBloodDisordersIssuesListedColumn6Option4,
                ras_Survey_TestDataManager.pleaseCompleteTheBloodDisordersIssuesListedColumn6Option5,
                ras_Survey_TestDataManager.pleaseCompleteTheBloodDisordersIssuesListedColumn6Option6,
                ras_Survey_TestDataManager.pleaseCompleteTheBloodDisordersIssuesListedColumn6Option7,
                ras_Survey_TestDataManager.pleaseCompleteTheBloodDisordersIssuesListedColumn6Option8};
        for (int p = 1; p < 9; p ++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(p, 10).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(p, 10), blodDisorderColumn6[p - 1]);
        }
        String[] blodDisorderColumn7 = {ras_Survey_TestDataManager.pleaseCompleteTheBloodDisordersIssuesListedColumn7Option1,
                ras_Survey_TestDataManager.pleaseCompleteTheBloodDisordersIssuesListedColumn7Option2,
                ras_Survey_TestDataManager.pleaseCompleteTheBloodDisordersIssuesListedColumn7Option3,
                ras_Survey_TestDataManager.pleaseCompleteTheBloodDisordersIssuesListedColumn7Option4,
                ras_Survey_TestDataManager.pleaseCompleteTheBloodDisordersIssuesListedColumn7Option5,
                ras_Survey_TestDataManager.pleaseCompleteTheBloodDisordersIssuesListedColumn7Option6,
                ras_Survey_TestDataManager.pleaseCompleteTheBloodDisordersIssuesListedColumn7Option7,
                ras_Survey_TestDataManager.pleaseCompleteTheBloodDisordersIssuesListedColumn7Option8};
        for (int q = 1; q < 9; q ++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(q, 13).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(q, 13), blodDisorderColumn7[q - 1]);
        }
        String[] blodDisorderColumn8 = {ras_Survey_TestDataManager.pleaseCompleteTheBloodDisordersIssuesListedColumn8Option1,
                ras_Survey_TestDataManager.pleaseCompleteTheBloodDisordersIssuesListedColumn8Option2,
                ras_Survey_TestDataManager.pleaseCompleteTheBloodDisordersIssuesListedColumn8Option3,
                ras_Survey_TestDataManager.pleaseCompleteTheBloodDisordersIssuesListedColumn8Option4,
                ras_Survey_TestDataManager.pleaseCompleteTheBloodDisordersIssuesListedColumn8Option5,
                ras_Survey_TestDataManager.pleaseCompleteTheBloodDisordersIssuesListedColumn8Option6,
                ras_Survey_TestDataManager.pleaseCompleteTheBloodDisordersIssuesListedColumn8Option7,
                ras_Survey_TestDataManager.pleaseCompleteTheBloodDisordersIssuesListedColumn8Option8};
        for (int r = 1; r < 9; r ++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(r, 16).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(r, 16), blodDisorderColumn8[r - 1]);
        }
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(494));
        for (int s = 1; s < 7; s++) {
            CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicClickOnCheckboxesScreener(s));
        }
        myRASSurveyPage.dynamicallyEnterTextInCheckMarkedTextBox(6).clear();
        CommonUtils.sendKeys(myRASSurveyPage.dynamicallyEnterTextInCheckMarkedTextBox(6), ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithAnyOfTheFollowingTumorsOption6Other);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3));
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowForEachOfTheTumorsListedColumn1Option1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 3), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowForEachOfTheTumorsListedColumn1Option2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 3), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowForEachOfTheTumorsListedColumn1Option3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 3), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowForEachOfTheTumorsListedColumn1Option4);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(5, 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(5, 3), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowForEachOfTheTumorsListedColumn1Option5);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(6, 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(6, 3), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowForEachOfTheTumorsListedColumn1Option6);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 4).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 4), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowForEachOfTheTumorsListedColumn2Option1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 4).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 4), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowForEachOfTheTumorsListedColumn2Option2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 4).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 4), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowForEachOfTheTumorsListedColumn2Option3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 4).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 4), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowForEachOfTheTumorsListedColumn2Option4);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(5, 4).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(5, 4), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowForEachOfTheTumorsListedColumn2Option5);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(6, 4).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(6, 4), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowForEachOfTheTumorsListedColumn2Option6);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 5).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 5), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowForEachOfTheTumorsListedColumn3Option1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 5).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 5), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowForEachOfTheTumorsListedColumn3Option2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 5).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 5), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowForEachOfTheTumorsListedColumn3Option3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 5).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 5), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowForEachOfTheTumorsListedColumn3Option4);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(5, 5).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(5, 5), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowForEachOfTheTumorsListedColumn3Option5);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(6, 5).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(6, 5), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowForEachOfTheTumorsListedColumn3Option6);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 8).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 8), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowForEachOfTheTumorsListedColumn4Option1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 8).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 8), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowForEachOfTheTumorsListedColumn4Option2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 8).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 8), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowForEachOfTheTumorsListedColumn4Option3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 8).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 8), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowForEachOfTheTumorsListedColumn4Option4);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(5, 8).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(5, 8), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowForEachOfTheTumorsListedColumn4Option5);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(6, 8).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(6, 8), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowForEachOfTheTumorsListedColumn4Option6);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 9).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 9), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowForEachOfTheTumorsListedColumn5Option1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 9).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 9), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowForEachOfTheTumorsListedColumn5Option2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 9).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 9), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowForEachOfTheTumorsListedColumn5Option3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 9).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 9), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowForEachOfTheTumorsListedColumn5Option4);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(5, 9).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(5, 9), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowForEachOfTheTumorsListedColumn5Option5);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(6, 9).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(6, 9), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowForEachOfTheTumorsListedColumn5Option6);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 10).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 10), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowForEachOfTheTumorsListedColumn6Option1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 10).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 10), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowForEachOfTheTumorsListedColumn6Option2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 10).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 10), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowForEachOfTheTumorsListedColumn6Option3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 10).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 10), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowForEachOfTheTumorsListedColumn6Option4);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(5, 10).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(5, 10), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowForEachOfTheTumorsListedColumn6Option5);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(6, 10).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(6, 10), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowForEachOfTheTumorsListedColumn6Option6);
        for (int t = 1; t < 7; t++) {
            CommonUtils.clickOnElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(t, 13));
        }
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(496));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.doYouHaveAHistoryOfFrequentInfections));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(497));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverBeenEvaluatedByAnImmunologist));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 2));
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 2).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 2), ras_Survey_TestDataManager.pleaseProvideTheNameOfTheImmunologistOption1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 2).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 2), ras_Survey_TestDataManager.pleaseProvideTheNameOfTheImmunologistOption2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 2).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 2), ras_Survey_TestDataManager.pleaseProvideTheNameOfTheImmunologistOption3);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(499));
        for (int u = 1; u < 4; u++) {
            CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicClickOnCheckboxesScreener(u));
        }
        myRASSurveyPage.dynamicallyEnterTextInCheckMarkedTextBox(3).clear();
        CommonUtils.sendKeys(myRASSurveyPage.dynamicallyEnterTextInCheckMarkedTextBox(3), ras_Survey_TestDataManager.howWouldYouDescribeInfectionFrequencyOption3Other);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3));
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3), ras_Survey_TestDataManager.pleaseCompleteTheImmunodeficienciesListedColumn1Option1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 3), ras_Survey_TestDataManager.pleaseCompleteTheImmunodeficienciesListedColumn1Option2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 3), ras_Survey_TestDataManager.pleaseCompleteTheImmunodeficienciesListedColumn1Option3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 4).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 4), ras_Survey_TestDataManager.pleaseCompleteTheImmunodeficienciesListedColumn2Option1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 4).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 4), ras_Survey_TestDataManager.pleaseCompleteTheImmunodeficienciesListedColumn2Option2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 4).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 4), ras_Survey_TestDataManager.pleaseCompleteTheImmunodeficienciesListedColumn2Option3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 5).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 5), ras_Survey_TestDataManager.pleaseCompleteTheImmunodeficienciesListedColumn3Option1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 5).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 5), ras_Survey_TestDataManager.pleaseCompleteTheImmunodeficienciesListedColumn3Option2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 5).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 5), ras_Survey_TestDataManager.pleaseCompleteTheImmunodeficienciesListedColumn3Option3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 8).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 8), ras_Survey_TestDataManager.pleaseCompleteTheImmunodeficienciesListedColumn4Option1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 8).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 8), ras_Survey_TestDataManager.pleaseCompleteTheImmunodeficienciesListedColumn4Option2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 8).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 8), ras_Survey_TestDataManager.pleaseCompleteTheImmunodeficienciesListedColumn4Option3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 9).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 9), ras_Survey_TestDataManager.pleaseCompleteTheImmunodeficienciesListedColumn5Option1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 9).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 9), ras_Survey_TestDataManager.pleaseCompleteTheImmunodeficienciesListedColumn5Option2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 9).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 9), ras_Survey_TestDataManager.pleaseCompleteTheImmunodeficienciesListedColumn5Option3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 10).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 10), ras_Survey_TestDataManager.pleaseCompleteTheImmunodeficienciesListedColumn6Option1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 10).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 10), ras_Survey_TestDataManager.pleaseCompleteTheImmunodeficienciesListedColumn6Option2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 10).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 10), ras_Survey_TestDataManager.pleaseCompleteTheImmunodeficienciesListedColumn6Option3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 13).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 13), ras_Survey_TestDataManager.pleaseCompleteTheImmunodeficienciesListedColumn7Option1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 13).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 13), ras_Survey_TestDataManager.pleaseCompleteTheImmunodeficienciesListedColumn7Option2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 13).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 13), ras_Survey_TestDataManager.pleaseCompleteTheImmunodeficienciesListedColumn7Option3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 16).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 16), ras_Survey_TestDataManager.pleaseCompleteTheImmunodeficienciesListedColumn8Option1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 16).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 16), ras_Survey_TestDataManager.pleaseCompleteTheImmunodeficienciesListedColumn8Option2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 16).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 16), ras_Survey_TestDataManager.pleaseCompleteTheImmunodeficienciesListedColumn8Option3);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(501));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithAnAutoimmuneDisorder));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(502));
        for (int v = 1; v < 6; v++) {
            CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicClickOnCheckboxesScreener(v));
        }
        myRASSurveyPage.dynamicallyEnterTextInCheckMarkedTextBox(4).clear();
        CommonUtils.sendKeys(myRASSurveyPage.dynamicallyEnterTextInCheckMarkedTextBox(4), ras_Survey_TestDataManager.withWhatAutoimmuneDisorderHaveYouBeenDiagnosedOption4Other);
        myRASSurveyPage.dynamicallyEnterTextInCheckMarkedTextBox(5).clear();
        CommonUtils.sendKeys(myRASSurveyPage.dynamicallyEnterTextInCheckMarkedTextBox(5), ras_Survey_TestDataManager.withWhatAutoimmuneDisorderHaveYouBeenDiagnosedOption5Other);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3));
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3), ras_Survey_TestDataManager.pleaseCompleteTheAutoimmuneConditionsListedBelowColumn1Option1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 3), ras_Survey_TestDataManager.pleaseCompleteTheAutoimmuneConditionsListedBelowColumn1Option2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 3), ras_Survey_TestDataManager.pleaseCompleteTheAutoimmuneConditionsListedBelowColumn1Option3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 3), ras_Survey_TestDataManager.pleaseCompleteTheAutoimmuneConditionsListedBelowColumn1Option4);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(5, 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(5, 3), ras_Survey_TestDataManager.pleaseCompleteTheAutoimmuneConditionsListedBelowColumn1Option5);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 4).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 4), ras_Survey_TestDataManager.pleaseCompleteTheAutoimmuneConditionsListedBelowColumn2Option1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 4).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 4), ras_Survey_TestDataManager.pleaseCompleteTheAutoimmuneConditionsListedBelowColumn2Option2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 4).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 4), ras_Survey_TestDataManager.pleaseCompleteTheAutoimmuneConditionsListedBelowColumn2Option3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 4).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 4), ras_Survey_TestDataManager.pleaseCompleteTheAutoimmuneConditionsListedBelowColumn2Option4);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(5, 4).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(5, 4), ras_Survey_TestDataManager.pleaseCompleteTheAutoimmuneConditionsListedBelowColumn2Option5);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 5).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 5), ras_Survey_TestDataManager.pleaseCompleteTheAutoimmuneConditionsListedBelowColumn3Option1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 5).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 5), ras_Survey_TestDataManager.pleaseCompleteTheAutoimmuneConditionsListedBelowColumn3Option2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 5).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 5), ras_Survey_TestDataManager.pleaseCompleteTheAutoimmuneConditionsListedBelowColumn3Option3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 5).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 5), ras_Survey_TestDataManager.pleaseCompleteTheAutoimmuneConditionsListedBelowColumn3Option4);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(5, 5).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(5, 5), ras_Survey_TestDataManager.pleaseCompleteTheAutoimmuneConditionsListedBelowColumn3Option5);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 8).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 8), ras_Survey_TestDataManager.pleaseCompleteTheAutoimmuneConditionsListedBelowColumn4Option1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 8).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 8), ras_Survey_TestDataManager.pleaseCompleteTheAutoimmuneConditionsListedBelowColumn4Option2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 8).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 8), ras_Survey_TestDataManager.pleaseCompleteTheAutoimmuneConditionsListedBelowColumn4Option3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 8).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 8), ras_Survey_TestDataManager.pleaseCompleteTheAutoimmuneConditionsListedBelowColumn4Option4);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(5, 8).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(5, 8), ras_Survey_TestDataManager.pleaseCompleteTheAutoimmuneConditionsListedBelowColumn4Option5);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 9).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 9), ras_Survey_TestDataManager.pleaseCompleteTheAutoimmuneConditionsListedBelowColumn5Option1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 9).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 9), ras_Survey_TestDataManager.pleaseCompleteTheAutoimmuneConditionsListedBelowColumn5Option2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 9).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 9), ras_Survey_TestDataManager.pleaseCompleteTheAutoimmuneConditionsListedBelowColumn5Option3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 9).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 9), ras_Survey_TestDataManager.pleaseCompleteTheAutoimmuneConditionsListedBelowColumn5Option4);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(5, 9).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(5, 9), ras_Survey_TestDataManager.pleaseCompleteTheAutoimmuneConditionsListedBelowColumn5Option5);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 10).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 10), ras_Survey_TestDataManager.pleaseCompleteTheAutoimmuneConditionsListedBelowColumn6Option1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 10).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 10), ras_Survey_TestDataManager.pleaseCompleteTheAutoimmuneConditionsListedBelowColumn6Option2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 10).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 10), ras_Survey_TestDataManager.pleaseCompleteTheAutoimmuneConditionsListedBelowColumn6Option3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 10).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 10), ras_Survey_TestDataManager.pleaseCompleteTheAutoimmuneConditionsListedBelowColumn6Option4);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(5, 10).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(5, 10), ras_Survey_TestDataManager.pleaseCompleteTheAutoimmuneConditionsListedBelowColumn6Option5);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 13).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 13), ras_Survey_TestDataManager.pleaseCompleteTheAutoimmuneConditionsListedBelowColumn7Option1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 13).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 13), ras_Survey_TestDataManager.pleaseCompleteTheAutoimmuneConditionsListedBelowColumn7Option2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 13).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 13), ras_Survey_TestDataManager.pleaseCompleteTheAutoimmuneConditionsListedBelowColumn7Option3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 13).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 13), ras_Survey_TestDataManager.pleaseCompleteTheAutoimmuneConditionsListedBelowColumn7Option4);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(5, 13).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(5, 13), ras_Survey_TestDataManager.pleaseCompleteTheAutoimmuneConditionsListedBelowColumn7Option5);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 16).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 16), ras_Survey_TestDataManager.pleaseCompleteTheAutoimmuneConditionsListedBelowColumn8Option1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 16).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 16), ras_Survey_TestDataManager.pleaseCompleteTheAutoimmuneConditionsListedBelowColumn8Option2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 16).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 16), ras_Survey_TestDataManager.pleaseCompleteTheAutoimmuneConditionsListedBelowColumn8Option3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 16).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 16), ras_Survey_TestDataManager.pleaseCompleteTheAutoimmuneConditionsListedBelowColumn8Option4);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(5, 16).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(5, 16), ras_Survey_TestDataManager.pleaseCompleteTheAutoimmuneConditionsListedBelowColumn8Option5);
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(312));
        CommonUtils.assertEqualsWithMessage(ras_Survey_TestDataManager.theNextSetOfQuestionsAskAboutNervousSystem, myRASSurveyPage.rasSurveyText.getText(), "-- VERIFYING THE NEXT SET OF QUESTIONS ASK ABOUT NERVOUS SYSTEM TEXT --");
        CucumberLogUtils.logScreenshot();
    }
    public void rasScreenerSurveyScenario4PartTen() {
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(504));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverBeenEvaluatedByANeurologist));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 2));
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 2).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 2), ras_Survey_TestDataManager.pleaseProvideTheInformationForTheNeurologistOption1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 2).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 2), ras_Survey_TestDataManager.pleaseProvideTheInformationForTheNeurologistOption2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 2).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 2), ras_Survey_TestDataManager.pleaseProvideTheInformationForTheNeurologistOption3);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(506));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithAStructuralBrainAbnormality));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(507));
        for (int a = 1; a < 7; a++) {
            CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicClickOnCheckboxesScreener(a));
        }
        myRASSurveyPage.dynamicallyEnterTextInCheckMarkedTextBox(6).clear();
        CommonUtils.sendKeys(myRASSurveyPage.dynamicallyEnterTextInCheckMarkedTextBox(6), ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithAnyBrainOption6Other);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3));
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3), ras_Survey_TestDataManager.pleaseCompleteTheTableForEachOfTheConditionsListedBrainIssuesColumn1Option1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 3), ras_Survey_TestDataManager.pleaseCompleteTheTableForEachOfTheConditionsListedBrainIssuesColumn1Option2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 3), ras_Survey_TestDataManager.pleaseCompleteTheTableForEachOfTheConditionsListedBrainIssuesColumn1Option3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 3), ras_Survey_TestDataManager.pleaseCompleteTheTableForEachOfTheConditionsListedBrainIssuesColumn1Option4);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(5, 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(5, 3), ras_Survey_TestDataManager.pleaseCompleteTheTableForEachOfTheConditionsListedBrainIssuesColumn1Option5);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(6, 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(6, 3), ras_Survey_TestDataManager.pleaseCompleteTheTableForEachOfTheConditionsListedBrainIssuesColumn1Option6);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 4).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 4), ras_Survey_TestDataManager.pleaseCompleteTheTableForEachOfTheConditionsListedBrainIssuesColumn2Option1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 4).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 4), ras_Survey_TestDataManager.pleaseCompleteTheTableForEachOfTheConditionsListedBrainIssuesColumn2Option2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 4).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 4), ras_Survey_TestDataManager.pleaseCompleteTheTableForEachOfTheConditionsListedBrainIssuesColumn2Option3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 4).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 4), ras_Survey_TestDataManager.pleaseCompleteTheTableForEachOfTheConditionsListedBrainIssuesColumn2Option4);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(5, 4).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(5, 4), ras_Survey_TestDataManager.pleaseCompleteTheTableForEachOfTheConditionsListedBrainIssuesColumn2Option5);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(6, 4).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(6, 4), ras_Survey_TestDataManager.pleaseCompleteTheTableForEachOfTheConditionsListedBrainIssuesColumn2Option6);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 5).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 5), ras_Survey_TestDataManager.pleaseCompleteTheTableForEachOfTheConditionsListedBrainIssuesColumn3Option1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 5).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 5), ras_Survey_TestDataManager.pleaseCompleteTheTableForEachOfTheConditionsListedBrainIssuesColumn3Option2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 5).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 5), ras_Survey_TestDataManager.pleaseCompleteTheTableForEachOfTheConditionsListedBrainIssuesColumn3Option3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 5).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 5), ras_Survey_TestDataManager.pleaseCompleteTheTableForEachOfTheConditionsListedBrainIssuesColumn3Option4);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(5, 5).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(5, 5), ras_Survey_TestDataManager.pleaseCompleteTheTableForEachOfTheConditionsListedBrainIssuesColumn3Option5);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(6, 5).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(6, 5), ras_Survey_TestDataManager.pleaseCompleteTheTableForEachOfTheConditionsListedBrainIssuesColumn3Option6);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 8).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 8), ras_Survey_TestDataManager.pleaseCompleteTheTableForEachOfTheConditionsListedBrainIssuesColumn4Option1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 8).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 8), ras_Survey_TestDataManager.pleaseCompleteTheTableForEachOfTheConditionsListedBrainIssuesColumn4Option2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 8).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 8), ras_Survey_TestDataManager.pleaseCompleteTheTableForEachOfTheConditionsListedBrainIssuesColumn4Option3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 8).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 8), ras_Survey_TestDataManager.pleaseCompleteTheTableForEachOfTheConditionsListedBrainIssuesColumn4Option4);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(5, 8).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(5, 8), ras_Survey_TestDataManager.pleaseCompleteTheTableForEachOfTheConditionsListedBrainIssuesColumn4Option5);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(6, 8).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(6, 8), ras_Survey_TestDataManager.pleaseCompleteTheTableForEachOfTheConditionsListedBrainIssuesColumn4Option6);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 9).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 9), ras_Survey_TestDataManager.pleaseCompleteTheTableForEachOfTheConditionsListedBrainIssuesColumn5Option1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 9).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 9), ras_Survey_TestDataManager.pleaseCompleteTheTableForEachOfTheConditionsListedBrainIssuesColumn5Option2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 9).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 9), ras_Survey_TestDataManager.pleaseCompleteTheTableForEachOfTheConditionsListedBrainIssuesColumn5Option3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 9).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 9), ras_Survey_TestDataManager.pleaseCompleteTheTableForEachOfTheConditionsListedBrainIssuesColumn5Option4);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(5, 9).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(5, 9), ras_Survey_TestDataManager.pleaseCompleteTheTableForEachOfTheConditionsListedBrainIssuesColumn5Option5);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(6, 9).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(6, 9), ras_Survey_TestDataManager.pleaseCompleteTheTableForEachOfTheConditionsListedBrainIssuesColumn5Option6);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 10).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 10), ras_Survey_TestDataManager.pleaseCompleteTheTableForEachOfTheConditionsListedBrainIssuesColumn6Option1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 10).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 10), ras_Survey_TestDataManager.pleaseCompleteTheTableForEachOfTheConditionsListedBrainIssuesColumn6Option2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 10).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 10), ras_Survey_TestDataManager.pleaseCompleteTheTableForEachOfTheConditionsListedBrainIssuesColumn6Option3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 10).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 10), ras_Survey_TestDataManager.pleaseCompleteTheTableForEachOfTheConditionsListedBrainIssuesColumn6Option4);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(5, 10).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(5, 10), ras_Survey_TestDataManager.pleaseCompleteTheTableForEachOfTheConditionsListedBrainIssuesColumn6Option5);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(6, 10).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(6, 10), ras_Survey_TestDataManager.pleaseCompleteTheTableForEachOfTheConditionsListedBrainIssuesColumn6Option6);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 13).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 13), ras_Survey_TestDataManager.pleaseCompleteTheTableForEachOfTheConditionsListedBrainIssuesColumn7Option1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 13).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 13), ras_Survey_TestDataManager.pleaseCompleteTheTableForEachOfTheConditionsListedBrainIssuesColumn7Option2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 13).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 13), ras_Survey_TestDataManager.pleaseCompleteTheTableForEachOfTheConditionsListedBrainIssuesColumn7Option3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 13).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 13), ras_Survey_TestDataManager.pleaseCompleteTheTableForEachOfTheConditionsListedBrainIssuesColumn7Option4);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(5, 13).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(5, 13), ras_Survey_TestDataManager.pleaseCompleteTheTableForEachOfTheConditionsListedBrainIssuesColumn7Option5);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(6, 13).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(6, 13), ras_Survey_TestDataManager.pleaseCompleteTheTableForEachOfTheConditionsListedBrainIssuesColumn7Option6);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(509));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.doYouHaveAHistoryOfSeizures));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(510));
        for (int b = 1; b < 6; b++) {
            CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicClickOnCheckboxesScreener(b));
        }
        myRASSurveyPage.dynamicallyEnterTextInCheckMarkedTextBox(5).clear();
        CommonUtils.sendKeys(myRASSurveyPage.dynamicallyEnterTextInCheckMarkedTextBox(5), ras_Survey_TestDataManager.pleaseSelectAllSeizureDisordersOption5Other);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3));
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowSeizureDisordersColumn1Option1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 3), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowSeizureDisordersColumn1Option2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 3), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowSeizureDisordersColumn1Option3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 3), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowSeizureDisordersColumn1Option4);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(5, 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(5, 3), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowSeizureDisordersColumn1Option5);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 4).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 4), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowSeizureDisordersColumn2Option1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 4).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 4), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowSeizureDisordersColumn2Option2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 4).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 4), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowSeizureDisordersColumn2Option3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 4).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 4), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowSeizureDisordersColumn2Option4);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(5, 4).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(5, 4), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowSeizureDisordersColumn2Option5);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 5).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 5), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowSeizureDisordersColumn3Option1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 5).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 5), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowSeizureDisordersColumn3Option2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 5).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 5), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowSeizureDisordersColumn3Option3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 5).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 5), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowSeizureDisordersColumn3Option4);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(5, 5).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(5, 5), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowSeizureDisordersColumn3Option5);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 8).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 8), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowSeizureDisordersColumn4Option1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 8).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 8), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowSeizureDisordersColumn4Option2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 8).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 8), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowSeizureDisordersColumn4Option3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 8).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 8), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowSeizureDisordersColumn4Option4);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(5, 8).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(5, 8), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowSeizureDisordersColumn4Option5);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 9).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 9), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowSeizureDisordersColumn5Option1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 9).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 9), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowSeizureDisordersColumn5Option2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 9).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 9), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowSeizureDisordersColumn5Option3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 9).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 9), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowSeizureDisordersColumn5Option4);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(5, 9).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(5, 9), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowSeizureDisordersColumn5Option5);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 10).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 10), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowSeizureDisordersColumn6Option1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 10).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 10), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowSeizureDisordersColumn6Option2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 10).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 10), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowSeizureDisordersColumn6Option3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 10).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 10), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowSeizureDisordersColumn6Option4);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(5, 10).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(5, 10), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowSeizureDisordersColumn6Option5);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 13).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 13), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowSeizureDisordersColumn7Option1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 13).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 13), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowSeizureDisordersColumn7Option2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 13).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 13), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowSeizureDisordersColumn7Option3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 13).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 13), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowSeizureDisordersColumn7Option4);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(5, 13).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(5, 13), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowSeizureDisordersColumn7Option5);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(512));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverBeenEvaluatedByAPsychiatrist));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 2));
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 2).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 2), ras_Survey_TestDataManager.pleaseProvideTheInformationListedPsychiatristOption1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 2).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 2), ras_Survey_TestDataManager.pleaseProvideTheInformationListedPsychiatristOption2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 2).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 2), ras_Survey_TestDataManager.pleaseProvideTheInformationListedPsychiatristOption3);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(514));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithABehavioral));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(515));
        for (int c = 1; c < 11; c++) {
            CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicClickOnCheckboxesScreener(c));
        }
        myRASSurveyPage.dynamicallyEnterTextInCheckMarkedTextBox(10).clear();
        CommonUtils.sendKeys(myRASSurveyPage.dynamicallyEnterTextInCheckMarkedTextBox(10), ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithABehavioralOption10Other);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3));
        String[] psychiatricConditionColumn1 = {ras_Survey_TestDataManager.pleaseCompleteTheTableBehavioralAndPsychiatricConditionsColumn1Option1,
                ras_Survey_TestDataManager.pleaseCompleteTheTableBehavioralAndPsychiatricConditionsColumn1Option2,
                ras_Survey_TestDataManager.pleaseCompleteTheTableBehavioralAndPsychiatricConditionsColumn1Option3,
                ras_Survey_TestDataManager.pleaseCompleteTheTableBehavioralAndPsychiatricConditionsColumn1Option4,
                ras_Survey_TestDataManager.pleaseCompleteTheTableBehavioralAndPsychiatricConditionsColumn1Option5,
                ras_Survey_TestDataManager.pleaseCompleteTheTableBehavioralAndPsychiatricConditionsColumn1Option6,
                ras_Survey_TestDataManager.pleaseCompleteTheTableBehavioralAndPsychiatricConditionsColumn1Option7,
                ras_Survey_TestDataManager.pleaseCompleteTheTableBehavioralAndPsychiatricConditionsColumn1Option8,
                ras_Survey_TestDataManager.pleaseCompleteTheTableBehavioralAndPsychiatricConditionsColumn1Option9,
                ras_Survey_TestDataManager.pleaseCompleteTheTableBehavioralAndPsychiatricConditionsColumn1Option10};
        for (int d = 1; d < 11; d++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(d, 3).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(d , 3), psychiatricConditionColumn1[d - 1]);
        }
        String[] psychiatricConditionColumn2 = {ras_Survey_TestDataManager.pleaseCompleteTheTableBehavioralAndPsychiatricConditionsColumn2Option1,
                ras_Survey_TestDataManager.pleaseCompleteTheTableBehavioralAndPsychiatricConditionsColumn2Option2,
                ras_Survey_TestDataManager.pleaseCompleteTheTableBehavioralAndPsychiatricConditionsColumn2Option3,
                ras_Survey_TestDataManager.pleaseCompleteTheTableBehavioralAndPsychiatricConditionsColumn2Option4,
                ras_Survey_TestDataManager.pleaseCompleteTheTableBehavioralAndPsychiatricConditionsColumn2Option5,
                ras_Survey_TestDataManager.pleaseCompleteTheTableBehavioralAndPsychiatricConditionsColumn2Option6,
                ras_Survey_TestDataManager.pleaseCompleteTheTableBehavioralAndPsychiatricConditionsColumn2Option7,
                ras_Survey_TestDataManager.pleaseCompleteTheTableBehavioralAndPsychiatricConditionsColumn2Option8,
                ras_Survey_TestDataManager.pleaseCompleteTheTableBehavioralAndPsychiatricConditionsColumn2Option9,
                ras_Survey_TestDataManager.pleaseCompleteTheTableBehavioralAndPsychiatricConditionsColumn2Option10};
        for (int e = 1; e < 11; e++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(e, 4).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(e , 4), psychiatricConditionColumn2[e - 1]);
        }
        String[] psychiatricConditionColumn3 = {ras_Survey_TestDataManager.pleaseCompleteTheTableBehavioralAndPsychiatricConditionsColumn3Option1,
                ras_Survey_TestDataManager.pleaseCompleteTheTableBehavioralAndPsychiatricConditionsColumn3Option2,
                ras_Survey_TestDataManager.pleaseCompleteTheTableBehavioralAndPsychiatricConditionsColumn3Option3,
                ras_Survey_TestDataManager.pleaseCompleteTheTableBehavioralAndPsychiatricConditionsColumn3Option4,
                ras_Survey_TestDataManager.pleaseCompleteTheTableBehavioralAndPsychiatricConditionsColumn3Option5,
                ras_Survey_TestDataManager.pleaseCompleteTheTableBehavioralAndPsychiatricConditionsColumn3Option6,
                ras_Survey_TestDataManager.pleaseCompleteTheTableBehavioralAndPsychiatricConditionsColumn3Option7,
                ras_Survey_TestDataManager.pleaseCompleteTheTableBehavioralAndPsychiatricConditionsColumn3Option8,
                ras_Survey_TestDataManager.pleaseCompleteTheTableBehavioralAndPsychiatricConditionsColumn3Option9,
                ras_Survey_TestDataManager.pleaseCompleteTheTableBehavioralAndPsychiatricConditionsColumn3Option10};
        for (int f = 1; f < 11; f++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(f, 5).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(f , 5), psychiatricConditionColumn3[f - 1]);
        }
        String[] psychiatricConditionColumn4 = {ras_Survey_TestDataManager.pleaseCompleteTheTableBehavioralAndPsychiatricConditionsColumn4Option1,
                ras_Survey_TestDataManager.pleaseCompleteTheTableBehavioralAndPsychiatricConditionsColumn4Option2,
                ras_Survey_TestDataManager.pleaseCompleteTheTableBehavioralAndPsychiatricConditionsColumn4Option3,
                ras_Survey_TestDataManager.pleaseCompleteTheTableBehavioralAndPsychiatricConditionsColumn4Option4,
                ras_Survey_TestDataManager.pleaseCompleteTheTableBehavioralAndPsychiatricConditionsColumn4Option5,
                ras_Survey_TestDataManager.pleaseCompleteTheTableBehavioralAndPsychiatricConditionsColumn4Option6,
                ras_Survey_TestDataManager.pleaseCompleteTheTableBehavioralAndPsychiatricConditionsColumn4Option7,
                ras_Survey_TestDataManager.pleaseCompleteTheTableBehavioralAndPsychiatricConditionsColumn4Option8,
                ras_Survey_TestDataManager.pleaseCompleteTheTableBehavioralAndPsychiatricConditionsColumn4Option9,
                ras_Survey_TestDataManager.pleaseCompleteTheTableBehavioralAndPsychiatricConditionsColumn4Option10};
        for (int g = 1; g < 11; g++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(g, 8).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(g , 8), psychiatricConditionColumn4[g - 1]);
        }
        String[] psychiatricConditionColumn5 = {ras_Survey_TestDataManager.pleaseCompleteTheTableBehavioralAndPsychiatricConditionsColumn5Option1,
                ras_Survey_TestDataManager.pleaseCompleteTheTableBehavioralAndPsychiatricConditionsColumn5Option2,
                ras_Survey_TestDataManager.pleaseCompleteTheTableBehavioralAndPsychiatricConditionsColumn5Option3,
                ras_Survey_TestDataManager.pleaseCompleteTheTableBehavioralAndPsychiatricConditionsColumn5Option4,
                ras_Survey_TestDataManager.pleaseCompleteTheTableBehavioralAndPsychiatricConditionsColumn5Option5,
                ras_Survey_TestDataManager.pleaseCompleteTheTableBehavioralAndPsychiatricConditionsColumn5Option6,
                ras_Survey_TestDataManager.pleaseCompleteTheTableBehavioralAndPsychiatricConditionsColumn5Option7,
                ras_Survey_TestDataManager.pleaseCompleteTheTableBehavioralAndPsychiatricConditionsColumn5Option8,
                ras_Survey_TestDataManager.pleaseCompleteTheTableBehavioralAndPsychiatricConditionsColumn5Option9,
                ras_Survey_TestDataManager.pleaseCompleteTheTableBehavioralAndPsychiatricConditionsColumn5Option10};
        for (int h = 1; h < 11; h++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(h, 9).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(h , 9), psychiatricConditionColumn5[h - 1]);
        }
        String[] psychiatricConditionColumn6 = {ras_Survey_TestDataManager.pleaseCompleteTheTableBehavioralAndPsychiatricConditionsColumn6Option1,
                ras_Survey_TestDataManager.pleaseCompleteTheTableBehavioralAndPsychiatricConditionsColumn6Option2,
                ras_Survey_TestDataManager.pleaseCompleteTheTableBehavioralAndPsychiatricConditionsColumn6Option3,
                ras_Survey_TestDataManager.pleaseCompleteTheTableBehavioralAndPsychiatricConditionsColumn6Option4,
                ras_Survey_TestDataManager.pleaseCompleteTheTableBehavioralAndPsychiatricConditionsColumn5Option5,
                ras_Survey_TestDataManager.pleaseCompleteTheTableBehavioralAndPsychiatricConditionsColumn6Option6,
                ras_Survey_TestDataManager.pleaseCompleteTheTableBehavioralAndPsychiatricConditionsColumn6Option7,
                ras_Survey_TestDataManager.pleaseCompleteTheTableBehavioralAndPsychiatricConditionsColumn6Option8,
                ras_Survey_TestDataManager.pleaseCompleteTheTableBehavioralAndPsychiatricConditionsColumn6Option9,
                ras_Survey_TestDataManager.pleaseCompleteTheTableBehavioralAndPsychiatricConditionsColumn6Option10};
        for (int i = 1; i < 11; i++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(i, 10).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(i , 10), psychiatricConditionColumn6[i - 1]);
        }
        String[] psychiatricConditionColumn7 = {ras_Survey_TestDataManager.pleaseCompleteTheTableBehavioralAndPsychiatricConditionsColumn7Option1,
                ras_Survey_TestDataManager.pleaseCompleteTheTableBehavioralAndPsychiatricConditionsColumn7Option2,
                ras_Survey_TestDataManager.pleaseCompleteTheTableBehavioralAndPsychiatricConditionsColumn7Option3,
                ras_Survey_TestDataManager.pleaseCompleteTheTableBehavioralAndPsychiatricConditionsColumn7Option4,
                ras_Survey_TestDataManager.pleaseCompleteTheTableBehavioralAndPsychiatricConditionsColumn7Option5,
                ras_Survey_TestDataManager.pleaseCompleteTheTableBehavioralAndPsychiatricConditionsColumn7Option6,
                ras_Survey_TestDataManager.pleaseCompleteTheTableBehavioralAndPsychiatricConditionsColumn7Option7,
                ras_Survey_TestDataManager.pleaseCompleteTheTableBehavioralAndPsychiatricConditionsColumn7Option8,
                ras_Survey_TestDataManager.pleaseCompleteTheTableBehavioralAndPsychiatricConditionsColumn7Option9,
                ras_Survey_TestDataManager.pleaseCompleteTheTableBehavioralAndPsychiatricConditionsColumn7Option10};
        for (int j = 1; j < 11; j++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(j, 13).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(j , 13), psychiatricConditionColumn7[j - 1]);
        }
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(249));
        myRASSurveyPage.dynamicOneTextBox(249).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.dynamicOneTextBox(249), ras_Survey_TestDataManager.pleaseListAndDescribeAnyAdditionalNeurologicConditions);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(313));
        CommonUtils.assertEqualsWithMessage(ras_Survey_TestDataManager.theNextSetOfQuestionsAskAboutVisionAndHearing, myRASSurveyPage.rasSurveyText.getText(), "-- VERIFYING THE NEXT SET OF QUESTIONS ASK ABOUT VISION AND HEARING TEXT --");
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(517));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithPtosis));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(518));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.didYouRequireTreatmentForPtosis));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(519));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverHadAnyIssuesWithYourVision));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(520));
        for (int k = 1; k < 7; k++) {
            CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicClickOnCheckboxesScreener(k));
        }
        myRASSurveyPage.dynamicallyEnterTextInCheckMarkedTextBox(6).clear();
        CommonUtils.sendKeys(myRASSurveyPage.dynamicallyEnterTextInCheckMarkedTextBox(6), ras_Survey_TestDataManager.pleaseSelectAllTheVisionEyesightOption6Other);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3));
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3), ras_Survey_TestDataManager.pleaseCompleteTheTableVisionEyesightColumn1Option1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 3), ras_Survey_TestDataManager.pleaseCompleteTheTableVisionEyesightColumn1Option2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 3), ras_Survey_TestDataManager.pleaseCompleteTheTableVisionEyesightColumn1Option3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 3), ras_Survey_TestDataManager.pleaseCompleteTheTableVisionEyesightColumn1Option4);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(5, 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(5, 3), ras_Survey_TestDataManager.pleaseCompleteTheTableVisionEyesightColumn1Option5);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(6, 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(6, 3), ras_Survey_TestDataManager.pleaseCompleteTheTableVisionEyesightColumn1Option6);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 4).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 4), ras_Survey_TestDataManager.pleaseCompleteTheTableVisionEyesightColumn2Option1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 4).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 4), ras_Survey_TestDataManager.pleaseCompleteTheTableVisionEyesightColumn2Option2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 4).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 4), ras_Survey_TestDataManager.pleaseCompleteTheTableVisionEyesightColumn2Option3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 4).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 4), ras_Survey_TestDataManager.pleaseCompleteTheTableVisionEyesightColumn2Option4);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(5, 4).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(5, 4), ras_Survey_TestDataManager.pleaseCompleteTheTableVisionEyesightColumn2Option5);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(6, 4).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(6, 4), ras_Survey_TestDataManager.pleaseCompleteTheTableVisionEyesightColumn2Option6);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 5).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 5), ras_Survey_TestDataManager.pleaseCompleteTheTableVisionEyesightColumn3Option1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 5).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 5), ras_Survey_TestDataManager.pleaseCompleteTheTableVisionEyesightColumn3Option2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 5).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 5), ras_Survey_TestDataManager.pleaseCompleteTheTableVisionEyesightColumn3Option3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 5).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 5), ras_Survey_TestDataManager.pleaseCompleteTheTableVisionEyesightColumn3Option4);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(5, 5).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(5, 5), ras_Survey_TestDataManager.pleaseCompleteTheTableVisionEyesightColumn3Option5);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(6, 5).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(6, 5), ras_Survey_TestDataManager.pleaseCompleteTheTableVisionEyesightColumn3Option6);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 8).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 8), ras_Survey_TestDataManager.pleaseCompleteTheTableVisionEyesightColumn4Option1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 8).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 8), ras_Survey_TestDataManager.pleaseCompleteTheTableVisionEyesightColumn4Option2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 8).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 8), ras_Survey_TestDataManager.pleaseCompleteTheTableVisionEyesightColumn4Option3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 8).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 8), ras_Survey_TestDataManager.pleaseCompleteTheTableVisionEyesightColumn4Option4);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(5, 8).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(5, 8), ras_Survey_TestDataManager.pleaseCompleteTheTableVisionEyesightColumn4Option5);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(6, 8).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(6, 8), ras_Survey_TestDataManager.pleaseCompleteTheTableVisionEyesightColumn4Option6);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 9).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 9), ras_Survey_TestDataManager.pleaseCompleteTheTableVisionEyesightColumn5Option1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 9).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 9), ras_Survey_TestDataManager.pleaseCompleteTheTableVisionEyesightColumn5Option2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 9).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 9), ras_Survey_TestDataManager.pleaseCompleteTheTableVisionEyesightColumn5Option3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 9).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 9), ras_Survey_TestDataManager.pleaseCompleteTheTableVisionEyesightColumn5Option4);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(5, 9).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(5, 9), ras_Survey_TestDataManager.pleaseCompleteTheTableVisionEyesightColumn5Option5);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(6, 9).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(6, 9), ras_Survey_TestDataManager.pleaseCompleteTheTableVisionEyesightColumn5Option6);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 10).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 10), ras_Survey_TestDataManager.pleaseCompleteTheTableVisionEyesightColumn6Option1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 10).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 10), ras_Survey_TestDataManager.pleaseCompleteTheTableVisionEyesightColumn6Option2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 10).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 10), ras_Survey_TestDataManager.pleaseCompleteTheTableVisionEyesightColumn6Option3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 10).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 10), ras_Survey_TestDataManager.pleaseCompleteTheTableVisionEyesightColumn6Option4);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(5, 10).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(5, 10), ras_Survey_TestDataManager.pleaseCompleteTheTableVisionEyesightColumn6Option5);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(6, 10).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(6, 10), ras_Survey_TestDataManager.pleaseCompleteTheTableVisionEyesightColumn6Option6);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 13).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 13), ras_Survey_TestDataManager.pleaseCompleteTheTableVisionEyesightColumn7Option1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 13).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 13), ras_Survey_TestDataManager.pleaseCompleteTheTableVisionEyesightColumn7Option2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 13).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 13), ras_Survey_TestDataManager.pleaseCompleteTheTableVisionEyesightColumn7Option3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 13).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 13), ras_Survey_TestDataManager.pleaseCompleteTheTableVisionEyesightColumn7Option4);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(5, 13).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(5, 13), ras_Survey_TestDataManager.pleaseCompleteTheTableVisionEyesightColumn7Option5);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(6, 13).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(6, 13), ras_Survey_TestDataManager.pleaseCompleteTheTableVisionEyesightColumn7Option6);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(522));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverExperiencedStabismus));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3));
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowRegardingStrabismusColumn1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 4).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 4), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowRegardingStrabismusColumn2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 5).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 5), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowRegardingStrabismusColumn3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 8).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 8), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowRegardingStrabismusColumn4);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 9).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 9), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowRegardingStrabismusColumn5);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 10).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 10), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowRegardingStrabismusColumn6);
        CommonUtils.clickOnElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(1, 13));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(524));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverExperiencedNystagmus));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3));
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowRegardingNystagmusColumn1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 4).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 4), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowRegardingNystagmusColumn2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 5).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 5), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowRegardingNystagmusColumn3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 8).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 8), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowRegardingNystagmusColumn4);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 9).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 9), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowRegardingNystagmusColumn5);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 10).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 10), ras_Survey_TestDataManager.pleaseCompleteTheTableBelowRegardingNystagmusColumn6);
        CommonUtils.clickOnElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(1, 13));
        CommonUtils.clickOnElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(1, 18));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(525));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouExperiencedHearingLoss));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(526));
        for (int l = 1; l < 6; l++) {
            CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicClickOnCheckboxesScreener(l));
        }
        myRASSurveyPage.dynamicallyEnterTextInCheckMarkedTextBox(5).clear();
        CommonUtils.sendKeys(myRASSurveyPage.dynamicallyEnterTextInCheckMarkedTextBox(5), ras_Survey_TestDataManager.haveYouExperiencedAnyTypesOfHearingLossOption5Other);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3));
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3), ras_Survey_TestDataManager.pleaseCompleteTheTableHearingLossColumn1Option1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 3), ras_Survey_TestDataManager.pleaseCompleteTheTableHearingLossColumn1Option2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 3), ras_Survey_TestDataManager.pleaseCompleteTheTableHearingLossColumn1Option3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 3), ras_Survey_TestDataManager.pleaseCompleteTheTableHearingLossColumn1Option4);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(5, 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(5, 3), ras_Survey_TestDataManager.pleaseCompleteTheTableHearingLossColumn1Option5);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 4).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 4), ras_Survey_TestDataManager.pleaseCompleteTheTableHearingLossColumn2Option1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 4).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 4), ras_Survey_TestDataManager.pleaseCompleteTheTableHearingLossColumn2Option2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 4).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 4), ras_Survey_TestDataManager.pleaseCompleteTheTableHearingLossColumn2Option3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 4).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 4), ras_Survey_TestDataManager.pleaseCompleteTheTableHearingLossColumn2Option4);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(5, 4).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(5, 4), ras_Survey_TestDataManager.pleaseCompleteTheTableHearingLossColumn2Option5);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 5).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 5), ras_Survey_TestDataManager.pleaseCompleteTheTableHearingLossColumn3Option1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 5).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 5), ras_Survey_TestDataManager.pleaseCompleteTheTableHearingLossColumn3Option2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 5).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 5), ras_Survey_TestDataManager.pleaseCompleteTheTableHearingLossColumn3Option3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 5).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 5), ras_Survey_TestDataManager.pleaseCompleteTheTableHearingLossColumn3Option4);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(5, 5).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(5, 5), ras_Survey_TestDataManager.pleaseCompleteTheTableHearingLossColumn3Option5);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 8).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 8), ras_Survey_TestDataManager.pleaseCompleteTheTableHearingLossColumn4Option1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 8).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 8), ras_Survey_TestDataManager.pleaseCompleteTheTableHearingLossColumn4Option2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 8).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 8), ras_Survey_TestDataManager.pleaseCompleteTheTableHearingLossColumn4Option3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 8).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 8), ras_Survey_TestDataManager.pleaseCompleteTheTableHearingLossColumn4Option4);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(5, 8).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(5, 8), ras_Survey_TestDataManager.pleaseCompleteTheTableHearingLossColumn4Option5);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 9).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 9), ras_Survey_TestDataManager.pleaseCompleteTheTableHearingLossColumn5Option1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 9).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 9), ras_Survey_TestDataManager.pleaseCompleteTheTableHearingLossColumn5Option2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 9).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 9), ras_Survey_TestDataManager.pleaseCompleteTheTableHearingLossColumn5Option3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 9).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 9), ras_Survey_TestDataManager.pleaseCompleteTheTableHearingLossColumn5Option4);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(5, 9).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(5, 9), ras_Survey_TestDataManager.pleaseCompleteTheTableHearingLossColumn5Option5);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 10).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 10), ras_Survey_TestDataManager.pleaseCompleteTheTableHearingLossColumn6Option1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 10).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 10), ras_Survey_TestDataManager.pleaseCompleteTheTableHearingLossColumn6Option2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 10).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 10), ras_Survey_TestDataManager.pleaseCompleteTheTableHearingLossColumn6Option3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 10).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 10), ras_Survey_TestDataManager.pleaseCompleteTheTableHearingLossColumn6Option4);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(5, 10).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(5, 10), ras_Survey_TestDataManager.pleaseCompleteTheTableHearingLossColumn6Option5);
        for (int m = 1; m < 6; m++) {
            CommonUtils.clickOnElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(m, 13));
        }
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(528));
        for (int n = 1; n < 4; n++) {
            CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicClickOnCheckboxesScreener(n));
        }
        myRASSurveyPage.dynamicallyEnterTextInCheckMarkedTextBox(3).clear();
        CommonUtils.sendKeys(myRASSurveyPage.dynamicallyEnterTextInCheckMarkedTextBox(3), ras_Survey_TestDataManager.doYouHaveAnyOfTheFollowingIssuesWithYourEarsOption3Other);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(297));
        myRASSurveyPage.dynamicOneTextBox(297).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.dynamicOneTextBox(297), ras_Survey_TestDataManager.ifThereAreAnyOtherHealthIssues);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(298));
        CommonUtils.assertEqualsWithMessage(ras_Survey_TestDataManager.youAreAlmostDoneSurvey, myRASSurveyPage.dynamicTopText(298).getText(), "-- VERIFYING YOU ARE ALMOST DONE TEXT --");
        MiscUtils.sleep(1000);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        MiscUtils.sleep(1000);
        CucumberLogUtils.logScreenshot();
        MiscUtils.sleep(1000);
        rasScenario1StepsImpl.logOutOfNativeView();
    }
}