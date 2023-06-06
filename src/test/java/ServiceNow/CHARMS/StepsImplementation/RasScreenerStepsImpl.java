package ServiceNow.CHARMS.StepsImplementation;

import appsCommon.PageInitializer;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;

public class RasScreenerStepsImpl extends PageInitializer {
    /***
     * USE THIS METHOD TO CLICK ON SCREENER NEXT BUTTON
     */
    public void clickOnScreenerNextButton() {
        JavascriptUtils.scrollIntoView(rasopathyQuestionnairePage.studyNextButton);
        CommonUtils.clickOnElement(rasopathyQuestionnairePage.studyNextButton);
    }

    public void rasScreenerSubmissionScenario1() {
        CommonUtils.switchToNextWindow();
        CucumberLogUtils.logScreenShot();
        rasScreenerStepsImpl.clickOnScreenerNextButton();

        try {
            rasopathyQuestionnairePage.dynamicLocator(testDataManager.areYouCompletingThisFormForSomeoneElseOrYourself).click();
            CucumberLogUtils.logScreenShot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerStepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicLocator(testDataManager.areYouCompletingThisFormForSomeoneElseOrYourself).click();
            CucumberLogUtils.logScreenShot();
        }

        rasScreenerStepsImpl.clickOnScreenerNextButton();

        try {
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rasScreenerConstants.firstName).sendKeys(testDataManager.firstName);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rasScreenerConstants.middleInitial).sendKeys(testDataManager.middleInitial);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rasScreenerConstants.lastName).sendKeys(testDataManager.lastName);
            CucumberLogUtils.logScreenShot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerStepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rasScreenerConstants.firstName).sendKeys(testDataManager.firstName);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rasScreenerConstants.middleInitial).sendKeys(testDataManager.middleInitial);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rasScreenerConstants.lastName).sendKeys(testDataManager.lastName);
            CucumberLogUtils.logScreenShot();
        }

        rasScreenerStepsImpl.clickOnScreenerNextButton();
        CucumberLogUtils.logScreenShot();
        rasScreenerStepsImpl.clickOnScreenerNextButton();

        try {
            rasopathyQuestionnairePage.calendarYearTextBox.clear();
            rasopathyQuestionnairePage.calendarYearTextBox.sendKeys(testDataManager.dateOfBirthYear);
            CommonUtils.selectDropDownValue(testDataManager.dateOfBirthMonth, rasopathyQuestionnairePage.calendarMonthDropDown);
            rasopathyQuestionnairePage.calendarDayOption.click();
            CucumberLogUtils.logScreenShot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerStepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.calendarYearTextBox.clear();
            rasopathyQuestionnairePage.calendarYearTextBox.sendKeys(testDataManager.dateOfBirthYear);
            CommonUtils.selectDropDownValue(testDataManager.dateOfBirthMonth, rasopathyQuestionnairePage.calendarMonthDropDown);
            rasopathyQuestionnairePage.calendarDayOption.click();
            CucumberLogUtils.logScreenShot();
        }

        rasScreenerStepsImpl.clickOnScreenerNextButton();

        try {
            rasopathyQuestionnairePage.dynamicLocator(testDataManager.sexAssignedAtBirthOption).click();
            CucumberLogUtils.logScreenShot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerStepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicLocator(testDataManager.sexAssignedAtBirthOption).click();
            CucumberLogUtils.logScreenShot();
        }

        rasScreenerStepsImpl.clickOnScreenerNextButton();

        try {
            rasopathyQuestionnairePage.dynamicLocator(testDataManager.areYouAdoptedOption).click();
            CucumberLogUtils.logScreenShot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerStepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicLocator(testDataManager.areYouAdoptedOption).click();
            CucumberLogUtils.logScreenShot();
        }

        rasScreenerStepsImpl.clickOnScreenerNextButton();

        try {
            CommonUtils.selectDropDownValue(testDataManager.countryOption, rasopathyQuestionnairePage.whatCountryDoesParticipantCurrentlyLiveInDropDown);
            CucumberLogUtils.logScreenShot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerStepsImpl.clickOnScreenerNextButton();
            CommonUtils.selectDropDownValue(testDataManager.countryOption, rasopathyQuestionnairePage.whatCountryDoesParticipantCurrentlyLiveInDropDown);
            CucumberLogUtils.logScreenShot();
        }

        rasScreenerStepsImpl.clickOnScreenerNextButton();

        try {
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rasScreenerConstants.streetAddress).sendKeys(testDataManager.street);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rasScreenerConstants.street2Address).sendKeys(testDataManager.street2);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rasScreenerConstants.cityText).sendKeys(testDataManager.city);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rasScreenerConstants.stateText).sendKeys(testDataManager.state);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rasScreenerConstants.zipCodeText).sendKeys(testDataManager.zipcode);
            CucumberLogUtils.logScreenShot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerStepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rasScreenerConstants.streetAddress).sendKeys(testDataManager.street);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rasScreenerConstants.street2Address).sendKeys(testDataManager.street2);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rasScreenerConstants.cityText).sendKeys(testDataManager.city);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rasScreenerConstants.stateText).sendKeys(testDataManager.state);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rasScreenerConstants.zipCodeText).sendKeys(testDataManager.zipcode);
            CucumberLogUtils.logScreenShot();
        }

        rasScreenerStepsImpl.clickOnScreenerNextButton();

        try {
            rasopathyQuestionnairePage.dynamicEmailAddressTextBox(rasScreenerConstants.emailAddress).sendKeys(testDataManager.emailAddress);
            CucumberLogUtils.logScreenShot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerStepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicEmailAddressTextBox(rasScreenerConstants.emailAddress).sendKeys(testDataManager.emailAddress);
            CucumberLogUtils.logScreenShot();
        }
        rasScreenerStepsImpl.clickOnScreenerNextButton();

        try {
            rasopathyQuestionnairePage.dynamicEmailAddressTextBox(rasScreenerConstants.confirmEmailAddress).sendKeys(testDataManager.emailAddressConfirm);
            CucumberLogUtils.logScreenShot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerStepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicEmailAddressTextBox(rasScreenerConstants.confirmEmailAddress).sendKeys(testDataManager.emailAddressConfirm);
            CucumberLogUtils.logScreenShot();
        }
        rasScreenerStepsImpl.clickOnScreenerNextButton();

        try {
            rasopathyQuestionnairePage.dynamicTextBoxLocatorForPhoneNumbers(rasScreenerConstants.homePhoneNumber).sendKeys(testDataManager.homePhoneNumber);
            rasopathyQuestionnairePage.dynamicTextBoxLocatorForPhoneNumbers(rasScreenerConstants.cellPhoneNumber).sendKeys(testDataManager.cellPhoneNumber);
            rasopathyQuestionnairePage.dynamicTextBoxLocatorForPhoneNumbers(rasScreenerConstants.workPhoneNumber).sendKeys(testDataManager.workPhoneNumber);
            rasopathyQuestionnairePage.dynamicPhoneNumberCheckBox(rasScreenerConstants.cellPhoneNumber).click();
            CucumberLogUtils.logScreenShot();
        } catch (NoSuchFrameException e) {
            e.printStackTrace();
            rasScreenerStepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicTextBoxLocatorForPhoneNumbers(rasScreenerConstants.homePhoneNumber).sendKeys(testDataManager.homePhoneNumber);
            rasopathyQuestionnairePage.dynamicTextBoxLocatorForPhoneNumbers(rasScreenerConstants.cellPhoneNumber).sendKeys(testDataManager.cellPhoneNumber);
            rasopathyQuestionnairePage.dynamicTextBoxLocatorForPhoneNumbers(rasScreenerConstants.workPhoneNumber).sendKeys(testDataManager.workPhoneNumber);
            rasopathyQuestionnairePage.dynamicPhoneNumberCheckBox(rasScreenerConstants.cellPhoneNumber).click();
            CucumberLogUtils.logScreenShot();
        }

        rasScreenerStepsImpl.clickOnScreenerNextButton();
        try {
            rasopathyQuestionnairePage.dynamicLocator(testDataManager.whatIsYourEthnicity).click();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerStepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicLocator(testDataManager.whatIsYourEthnicity).click();
        }

        rasScreenerStepsImpl.clickOnScreenerNextButton();

        try {
            rasopathyQuestionnairePage.dynamicLocator(testDataManager.whatIsYourRace).click();
            CucumberLogUtils.logScreenShot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerStepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicLocator(testDataManager.whatIsYourRace).click();
            CucumberLogUtils.logScreenShot();
        }

        rasScreenerStepsImpl.clickOnScreenerNextButton();

        try {
            rasopathyQuestionnairePage.dynamicLocator(testDataManager.areYouAParticipantInOtherStudyGroup).click();
            CucumberLogUtils.logScreenShot();
        } catch (NoSuchElementException e) {
            rasScreenerStepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicLocator(testDataManager.whatIsYourRace).click();
            CucumberLogUtils.logScreenShot();
        }

        rasScreenerStepsImpl.clickOnScreenerNextButton();
        CucumberLogUtils.logScreenShot();
        rasScreenerStepsImpl.clickOnScreenerNextButton();

        try {
            rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouBeenDiagnosedWithFollowingConditions).click();
            CucumberLogUtils.logScreenShot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerStepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouBeenDiagnosedWithFollowingConditions).click();
            CucumberLogUtils.logScreenShot();
        }
        rasScreenerStepsImpl.clickOnScreenerNextButton();
        CucumberLogUtils.logScreenShot();

        try {
            rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouBeenDiagnosedWithCancer).click();
            CucumberLogUtils.logScreenShot();
        } catch (NoSuchElementException e) {
            rasScreenerStepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouBeenDiagnosedWithCancer).click();
            CucumberLogUtils.logScreenShot();
        }

        rasScreenerStepsImpl.clickOnScreenerNextButton();
        try {
            MiscUtils.sleep(500);
            CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouBeenDiagnosedWithARasopathy));
            CucumberLogUtils.logScreenShot();
        } catch (NoSuchElementException e) {
            rasScreenerStepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouBeenDiagnosedWithARasopathy).click();
            CucumberLogUtils.logScreenShot();
        }
        rasScreenerStepsImpl.clickOnScreenerNextButton();
        rasScreenerStepsImpl.clickOnScreenerNextButton();

        try {
            CommonUtils.click(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveAnyOfYourBiologicalRelativesBeenDiagnosedWithARasopathy));
            CucumberLogUtils.logScreenShot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerStepsImpl.clickOnScreenerNextButton();
            CommonUtils.click(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveAnyOfYourBiologicalRelativesBeenDiagnosedWithARasopathy));
            CucumberLogUtils.logScreenShot();
        }

        rasScreenerStepsImpl.clickOnScreenerNextButton();

        try {
            MiscUtils.sleep(500);
            CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouEverHadGeneticTesting));
            CucumberLogUtils.logScreenShot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerStepsImpl.clickOnScreenerNextButton();
            CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouEverHadGeneticTesting));
            CucumberLogUtils.logScreenShot();
        }

        rasScreenerStepsImpl.clickOnScreenerNextButton();
        rasScreenerStepsImpl.clickOnScreenerNextButton();

        try {
            MiscUtils.sleep(500);
            CommonUtils.scrollIntoView(rasopathyQuestionnairePage.dynamicLocator(testDataManager.howDidYouHearAboutThisStudy));
            CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicLocator(testDataManager.howDidYouHearAboutThisStudy));
            rasopathyQuestionnairePage.dynamicLocatorForHowDidYouHearAboutStudyTextBoxes(testDataManager.howDidYouHearAboutThisStudy).sendKeys(testDataManager.howDidYouHearAboutThisStudyOtherReason);
            CucumberLogUtils.logScreenShot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerStepsImpl.clickOnScreenerNextButton();
            CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicTextBoxLocator(testDataManager.howDidYouHearAboutThisStudy));
            rasopathyQuestionnairePage.dynamicLocatorForHowDidYouHearAboutStudyTextBoxes(testDataManager.howDidYouHearAboutThisStudy).sendKeys(testDataManager.howDidYouHearAboutThisStudyOtherReason);
            CucumberLogUtils.logScreenShot();
        }

        rasScreenerStepsImpl.clickOnScreenerNextButton();

        try {
            MiscUtils.sleep(500);
            CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouOrOtherFamilyMembersParticipatedInOtherStudy));
            CucumberLogUtils.logScreenShot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerStepsImpl.clickOnScreenerNextButton();
            CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouOrOtherFamilyMembersParticipatedInOtherStudy));
            CucumberLogUtils.logScreenShot();
        }
        rasScreenerStepsImpl.clickOnScreenerNextButton();

        try {
            MiscUtils.sleep(500);
            CommonUtils.scrollIntoView(rasopathyQuestionnairePage.dynamicLocator(testDataManager.whatAreMainReasonsForParticipatingInStudy));
            CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicLocator(testDataManager.whatAreMainReasonsForParticipatingInStudy));
            System.out.println();
            rasopathyQuestionnairePage.dynamicLocatorForMainReasonForParticipatingInStudy(testDataManager.whatAreMainReasonsForParticipatingInStudy).sendKeys(testDataManager.whatAreMainReasonsForParticipatingInStudyOtherReason);
            CucumberLogUtils.logScreenShot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerStepsImpl.clickOnScreenerNextButton();
            MiscUtils.sleep(500);
            CommonUtils.scrollIntoView(rasopathyQuestionnairePage.dynamicLocator(testDataManager.whatAreMainReasonsForParticipatingInStudy));
            CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicLocator(testDataManager.whatAreMainReasonsForParticipatingInStudy));
            rasopathyQuestionnairePage.dynamicLocatorForMainReasonForParticipatingInStudy(testDataManager.whatAreMainReasonsForParticipatingInStudy).sendKeys(testDataManager.whatAreMainReasonsForParticipatingInStudyOtherReason);
            CucumberLogUtils.logScreenShot();
        }
        rasScreenerStepsImpl.clickOnScreenerNextButton();
        rasScreenerStepsImpl.clickOnScreenerNextButton();
        MiscUtils.sleep(1000);
        logOutOfNativeView();
    }

    public static void logOutOfNativeView() {
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("nativeview"));
        CommonUtils.clickOnElement(nativeViewHomePage.profileModule);
        CommonUtils.clickOnElement(nativeViewHomePage.logOutButton);
    }
}
