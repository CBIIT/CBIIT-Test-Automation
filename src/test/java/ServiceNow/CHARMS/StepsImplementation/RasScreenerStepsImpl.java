package ServiceNow.CHARMS.StepsImplementation;

import ServiceNow.CHARMS.Steps.HooksSteps;
import appsCommon.PageInitializer;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebElement;

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
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerStepsImpl.clickOnScreenerNextButton();

        try {
            rasopathyQuestionnairePage.dynamicLocator(testDataManager.areYouCompletingThisFormForSomeoneElseOrYourself).click();
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerStepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicLocator(testDataManager.areYouCompletingThisFormForSomeoneElseOrYourself).click();
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }

        rasScreenerStepsImpl.clickOnScreenerNextButton();

        try {
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rasScreenerConstants.firstName).sendKeys(testDataManager.firstName);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rasScreenerConstants.middleInitial).sendKeys(testDataManager.middleInitial);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rasScreenerConstants.lastName).sendKeys(testDataManager.lastName);
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerStepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rasScreenerConstants.firstName).sendKeys(testDataManager.firstName);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rasScreenerConstants.middleInitial).sendKeys(testDataManager.middleInitial);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rasScreenerConstants.lastName).sendKeys(testDataManager.lastName);
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }

        rasScreenerStepsImpl.clickOnScreenerNextButton();
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerStepsImpl.clickOnScreenerNextButton();

        try {
            rasopathyQuestionnairePage.calendarYearTextBox.clear();
            rasopathyQuestionnairePage.calendarYearTextBox.sendKeys(testDataManager.dateOfBirthYear);
            CommonUtils.selectDropDownValue(testDataManager.dateOfBirthMonth, rasopathyQuestionnairePage.calendarMonthDropDown);
            rasopathyQuestionnairePage.calendarDayOption.click();
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerStepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.calendarYearTextBox.clear();
            rasopathyQuestionnairePage.calendarYearTextBox.sendKeys(testDataManager.dateOfBirthYear);
            CommonUtils.selectDropDownValue(testDataManager.dateOfBirthMonth, rasopathyQuestionnairePage.calendarMonthDropDown);
            rasopathyQuestionnairePage.calendarDayOption.click();
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }

        rasScreenerStepsImpl.clickOnScreenerNextButton();

        try {
            rasopathyQuestionnairePage.dynamicLocator(testDataManager.sexAssignedAtBirthOption).click();
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerStepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicLocator(testDataManager.sexAssignedAtBirthOption).click();
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }

        rasScreenerStepsImpl.clickOnScreenerNextButton();

        try {
            rasopathyQuestionnairePage.dynamicLocator(testDataManager.areYouAdoptedOption).click();
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerStepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicLocator(testDataManager.areYouAdoptedOption).click();
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }

        rasScreenerStepsImpl.clickOnScreenerNextButton();

        try {
            CommonUtils.selectDropDownValue(testDataManager.countryOption, rasopathyQuestionnairePage.whatCountryDoesParticipantCurrentlyLiveInDropDown);
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerStepsImpl.clickOnScreenerNextButton();
            CommonUtils.selectDropDownValue(testDataManager.countryOption, rasopathyQuestionnairePage.whatCountryDoesParticipantCurrentlyLiveInDropDown);
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }

        rasScreenerStepsImpl.clickOnScreenerNextButton();

        try {
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rasScreenerConstants.streetAddress).sendKeys(testDataManager.street);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rasScreenerConstants.street2Address).sendKeys(testDataManager.street2);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rasScreenerConstants.cityText).sendKeys(testDataManager.city);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rasScreenerConstants.stateText).sendKeys(testDataManager.state);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rasScreenerConstants.zipCodeText).sendKeys(testDataManager.zipcode);
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerStepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rasScreenerConstants.streetAddress).sendKeys(testDataManager.street);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rasScreenerConstants.street2Address).sendKeys(testDataManager.street2);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rasScreenerConstants.cityText).sendKeys(testDataManager.city);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rasScreenerConstants.stateText).sendKeys(testDataManager.state);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rasScreenerConstants.zipCodeText).sendKeys(testDataManager.zipcode);
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }

        rasScreenerStepsImpl.clickOnScreenerNextButton();

        try {
            rasopathyQuestionnairePage.dynamicEmailAddressTextBox(rasScreenerConstants.emailAddress).sendKeys(testDataManager.emailAddress);
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerStepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicEmailAddressTextBox(rasScreenerConstants.emailAddress).sendKeys(testDataManager.emailAddress);
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        rasScreenerStepsImpl.clickOnScreenerNextButton();

        try {
            rasopathyQuestionnairePage.dynamicEmailAddressTextBox(rasScreenerConstants.confirmEmailAddress).sendKeys(testDataManager.emailAddressConfirm);
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerStepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicEmailAddressTextBox(rasScreenerConstants.confirmEmailAddress).sendKeys(testDataManager.emailAddressConfirm);
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        rasScreenerStepsImpl.clickOnScreenerNextButton();

        try {
            rasopathyQuestionnairePage.dynamicTextBoxLocatorForPhoneNumbers(rasScreenerConstants.homePhoneNumber).sendKeys(testDataManager.homePhoneNumber);
            rasopathyQuestionnairePage.dynamicTextBoxLocatorForPhoneNumbers(rasScreenerConstants.cellPhoneNumber).sendKeys(testDataManager.cellPhoneNumber);
            rasopathyQuestionnairePage.dynamicTextBoxLocatorForPhoneNumbers(rasScreenerConstants.workPhoneNumber).sendKeys(testDataManager.workPhoneNumber);
            rasopathyQuestionnairePage.dynamicPhoneNumberCheckBox(rasScreenerConstants.cellPhoneNumber).click();
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchFrameException e) {
            e.printStackTrace();
            rasScreenerStepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicTextBoxLocatorForPhoneNumbers(rasScreenerConstants.homePhoneNumber).sendKeys(testDataManager.homePhoneNumber);
            rasopathyQuestionnairePage.dynamicTextBoxLocatorForPhoneNumbers(rasScreenerConstants.cellPhoneNumber).sendKeys(testDataManager.cellPhoneNumber);
            rasopathyQuestionnairePage.dynamicTextBoxLocatorForPhoneNumbers(rasScreenerConstants.workPhoneNumber).sendKeys(testDataManager.workPhoneNumber);
            rasopathyQuestionnairePage.dynamicPhoneNumberCheckBox(rasScreenerConstants.cellPhoneNumber).click();
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
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
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerStepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicLocator(testDataManager.whatIsYourRace).click();
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }

        rasScreenerStepsImpl.clickOnScreenerNextButton();

        try {
            rasopathyQuestionnairePage.dynamicLocator(testDataManager.areYouAParticipantInOtherStudyGroup).click();
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            rasScreenerStepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicLocator(testDataManager.whatIsYourRace).click();
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }

        rasScreenerStepsImpl.clickOnScreenerNextButton();
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerStepsImpl.clickOnScreenerNextButton();

        try {
            rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouBeenDiagnosedWithFollowingConditions).click();
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerStepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouBeenDiagnosedWithFollowingConditions).click();
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        rasScreenerStepsImpl.clickOnScreenerNextButton();
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);

        try {
            rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouBeenDiagnosedWithCancer).click();
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            rasScreenerStepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouBeenDiagnosedWithCancer).click();
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }

        rasScreenerStepsImpl.clickOnScreenerNextButton();
        try {
            MiscUtils.sleep(500);
            CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouBeenDiagnosedWithARasopathy));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            rasScreenerStepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouBeenDiagnosedWithARasopathy).click();
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        rasScreenerStepsImpl.clickOnScreenerNextButton();
        rasScreenerStepsImpl.clickOnScreenerNextButton();

        try {
            CommonUtils.click(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveAnyOfYourBiologicalRelativesBeenDiagnosedWithARasopathy));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerStepsImpl.clickOnScreenerNextButton();
            CommonUtils.click(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveAnyOfYourBiologicalRelativesBeenDiagnosedWithARasopathy));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }

        rasScreenerStepsImpl.clickOnScreenerNextButton();

        try {
            MiscUtils.sleep(500);
            CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouEverHadGeneticTesting));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerStepsImpl.clickOnScreenerNextButton();
            CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouEverHadGeneticTesting));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }

        rasScreenerStepsImpl.clickOnScreenerNextButton();
        rasScreenerStepsImpl.clickOnScreenerNextButton();

        try {
            MiscUtils.sleep(500);
            CommonUtils.scrollIntoView(rasopathyQuestionnairePage.dynamicLocator(testDataManager.howDidYouHearAboutThisStudy));
            CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicLocator(testDataManager.howDidYouHearAboutThisStudy));
            rasopathyQuestionnairePage.dynamicLocatorForHowDidYouHearAboutStudyTextBoxes(testDataManager.howDidYouHearAboutThisStudy).sendKeys(testDataManager.howDidYouHearAboutThisStudyOtherReason);
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerStepsImpl.clickOnScreenerNextButton();
            CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicTextBoxLocator(testDataManager.howDidYouHearAboutThisStudy));
            rasopathyQuestionnairePage.dynamicLocatorForHowDidYouHearAboutStudyTextBoxes(testDataManager.howDidYouHearAboutThisStudy).sendKeys(testDataManager.howDidYouHearAboutThisStudyOtherReason);
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }

        rasScreenerStepsImpl.clickOnScreenerNextButton();

        try {
            MiscUtils.sleep(500);
            CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouOrOtherFamilyMembersParticipatedInOtherStudy));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerStepsImpl.clickOnScreenerNextButton();
            CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouOrOtherFamilyMembersParticipatedInOtherStudy));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        rasScreenerStepsImpl.clickOnScreenerNextButton();

        try {
            MiscUtils.sleep(500);
            CommonUtils.scrollIntoView(rasopathyQuestionnairePage.dynamicLocator(testDataManager.whatAreMainReasonsForParticipatingInStudy));
            CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicLocator(testDataManager.whatAreMainReasonsForParticipatingInStudy));
            System.out.println();
            rasopathyQuestionnairePage.dynamicLocatorForMainReasonForParticipatingInStudy(testDataManager.whatAreMainReasonsForParticipatingInStudy).sendKeys(testDataManager.whatAreMainReasonsForParticipatingInStudyOtherReason);
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerStepsImpl.clickOnScreenerNextButton();
            MiscUtils.sleep(500);
            CommonUtils.scrollIntoView(rasopathyQuestionnairePage.dynamicLocator(testDataManager.whatAreMainReasonsForParticipatingInStudy));
            CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicLocator(testDataManager.whatAreMainReasonsForParticipatingInStudy));
            rasopathyQuestionnairePage.dynamicLocatorForMainReasonForParticipatingInStudy(testDataManager.whatAreMainReasonsForParticipatingInStudy).sendKeys(testDataManager.whatAreMainReasonsForParticipatingInStudyOtherReason);
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        rasScreenerStepsImpl.clickOnScreenerNextButton();
        rasScreenerStepsImpl.clickOnScreenerNextButton();
        MiscUtils.sleep(1000);
        logOutOfNativeView();
    }

    /***
     * USE THIS METHOD TO LOG OUT OF NATIVE VIEW
     */
    public static void logOutOfNativeView() {
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("nativeview"));
        CommonUtils.clickOnElement(nativeViewHomePage.profileModule);
        CommonUtils.clickOnElement(nativeViewHomePage.logOutButton);
    }

    public void verifyingDropDownOption(WebElement element, String message) {
        CommonUtils.assertEqualsWithMessage(element.getAttribute("selected"), "true", message);
    }
}
