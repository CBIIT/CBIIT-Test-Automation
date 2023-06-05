package ServiceNow.CHARMS.StepsImplementation;

import ServiceNow.CHARMS.Constants.CHARMSConstants;
import ServiceNow.CHARMS.Constants.RAS_SCREENER_CONSTANTS;
import appsCommon.PageInitializer;
import com.nci.automation.dao.ExcelReader;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import java.util.Map;

public class RasScreenerStepsImpl extends PageInitializer {


    /***
     * USE THIS METHOD TO CLICK ON SCREENER NEXT BUTTON
     */
    public void clickOnScreenerNextButton() {
        JavascriptUtils.scrollIntoView(rasopathyQuestionnairePage.studyNextButton);
        CommonUtils.clickOnElement(rasopathyQuestionnairePage.studyNextButton);
    }

    public void rasScreenerSubmissionScenario1() {
         /*
        FETCHING DATA FROM EXCEL SHEET BEFORE FILLING OUT SCREENER
        *** SCENARIO 1 DATA BELOW ***
         */
        Map<String, String> testData = ExcelReader.excelIntoHashMap(CHARMSConstants.RAS_SELF_SUBMISSION_SCENARIO_1, "Sheet1");
        String areYouCompletingThisFormForSomeoneElseOrYourself = testData.get(rasScreenerConstants.areYouCompletingThisFormForSomeoneElse);
        String firstName = testData.get(rasScreenerConstants.firstName);
        String middleInitial = testData.get(rasScreenerConstants.middleInitial);
        String lastName = testData.get(rasScreenerConstants.lastName);
        String dateOfBirthMonth = testData.get(rasScreenerConstants.dateOfBirthMonth);
        String dateOfBirthYear = testData.get(rasScreenerConstants.dateOfBirthYear);
        String sexAssignedAtBirthOption = testData.get(rasScreenerConstants.sexAssignedAtBirthOption);
        String areYouAdoptedOption = testData.get(rasScreenerConstants.areYouAdoptedOption);
        String countryOption = testData.get(rasScreenerConstants.whichCountryDoYouCurrentlyLiveInOption);
        String street = testData.get(rasScreenerConstants.streetAddress);
        String street2 = testData.get(rasScreenerConstants.street2Address);
        String city = testData.get(rasScreenerConstants.cityText);
        String state = testData.get(rasScreenerConstants.stateText);
        String zipcode = testData.get(rasScreenerConstants.zipCodeText);
        String emailAddress = testData.get(rasScreenerConstants.emailAddress);
        String emailAddressConfirm = testData.get(rasScreenerConstants.confirmEmailAddress);
        String homePhoneNumber = testData.get(rasScreenerConstants.homePhoneNumber);
        String cellPhoneNumber = testData.get(rasScreenerConstants.cellPhoneNumber);
        String workPhoneNumber = testData.get(rasScreenerConstants.workPhoneNumber);
        String whatIsYourEthnicity = testData.get(rasScreenerConstants.whatIsYourEthnicity);
        String whatIsYourRace = testData.get(rasScreenerConstants.whatIsYourRace);
        String areYouAParticipantInOtherStudyGroup = testData.get(rasScreenerConstants.areYouAParticipantInOtherStudyGroup);
        String haveYouBeenDiagnosedWithFollowingConditions = testData.get(rasScreenerConstants.haveYouBeenDiagnosedWithTheFollowingConditions);
        String haveYouBeenDiagnosedWithCancer = testData.get(rasScreenerConstants.haveYouEverBeenDiagnosedWithCancer);
        String haveYouBeenDiagnosedWithARasopathy = testData.get(rasScreenerConstants.haveYouBeenDiagnosedWithARasopathy);
        String haveAnyOfYourBiologicalRelativesBeenDiagnosedWithARasopathy = testData.get(rasScreenerConstants.haveAnyBiologicalRelativesBeenDiagnosedWithARasopathy);
        String haveYouEverHadGeneticTesting = testData.get(rasScreenerConstants.haveYouEverHadGeneticTesting);
        String howDidYouHearAboutThisStudy = testData.get(rasScreenerConstants.howDidYouHearAboutThisStudy);
        String howDidYouHearAboutThisStudyOtherReason = testData.get(rasScreenerConstants.howDidYouHearAboutThisStudyOtherReason);
        String haveYouOrOtherFamilyMembersParticipatedInOtherStudy = testData.get(rasScreenerConstants.haveYouOrOtherFamilyMembersParticipatedInOtherStudy);
        String whatAreMainReasonsForParticipatingInStudy = testData.get(rasScreenerConstants.whatAreTheMainReasonsForParticipatingInThisStudy);
        String whatAreMainReasonsForParticipatingInStudyOtherReason = testData.get(rasScreenerConstants.getWhatAreTheMainReasonsForParticipatingInThisStudyOtherReason);

        CommonUtils.switchToNextWindow();
        CucumberLogUtils.logScreenShot();
        rasScreenerStepsImpl.clickOnScreenerNextButton();

        try {
            rasopathyQuestionnairePage.dynamicLocator(areYouCompletingThisFormForSomeoneElseOrYourself).click();
            CucumberLogUtils.logScreenShot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerStepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicLocator(areYouCompletingThisFormForSomeoneElseOrYourself).click();
            CucumberLogUtils.logScreenShot();
        }

        rasScreenerStepsImpl.clickOnScreenerNextButton();

        try {
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rasScreenerConstants.firstName).sendKeys(firstName);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rasScreenerConstants.middleInitial).sendKeys(middleInitial);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rasScreenerConstants.lastName).sendKeys(lastName);
            CucumberLogUtils.logScreenShot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerStepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rasScreenerConstants.firstName).sendKeys(firstName);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rasScreenerConstants.middleInitial).sendKeys(middleInitial);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rasScreenerConstants.lastName).sendKeys(lastName);
            CucumberLogUtils.logScreenShot();
        }

        rasScreenerStepsImpl.clickOnScreenerNextButton();
        CucumberLogUtils.logScreenShot();
        rasScreenerStepsImpl.clickOnScreenerNextButton();

        try {
            rasopathyQuestionnairePage.calendarYearTextBox.clear();
            rasopathyQuestionnairePage.calendarYearTextBox.sendKeys(dateOfBirthYear);
            CommonUtils.selectDropDownValue(dateOfBirthMonth, rasopathyQuestionnairePage.calendarMonthDropDown);
            rasopathyQuestionnairePage.calendarDayOption.click();
            CucumberLogUtils.logScreenShot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerStepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.calendarYearTextBox.clear();
            rasopathyQuestionnairePage.calendarYearTextBox.sendKeys(dateOfBirthYear);
            CommonUtils.selectDropDownValue(dateOfBirthMonth, rasopathyQuestionnairePage.calendarMonthDropDown);
            rasopathyQuestionnairePage.calendarDayOption.click();
            CucumberLogUtils.logScreenShot();
        }

        rasScreenerStepsImpl.clickOnScreenerNextButton();

        try {
            rasopathyQuestionnairePage.dynamicLocator(sexAssignedAtBirthOption).click();
            CucumberLogUtils.logScreenShot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerStepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicLocator(sexAssignedAtBirthOption).click();
            CucumberLogUtils.logScreenShot();
        }

        rasScreenerStepsImpl.clickOnScreenerNextButton();

        try {
            rasopathyQuestionnairePage.dynamicLocator(areYouAdoptedOption).click();
            CucumberLogUtils.logScreenShot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerStepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicLocator(areYouAdoptedOption).click();
            CucumberLogUtils.logScreenShot();
        }

        rasScreenerStepsImpl.clickOnScreenerNextButton();

        try {
            CommonUtils.selectDropDownValue(countryOption, rasopathyQuestionnairePage.whatCountryDoesParticipantCurrentlyLiveInDropDown);
            CucumberLogUtils.logScreenShot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerStepsImpl.clickOnScreenerNextButton();
            CommonUtils.selectDropDownValue(countryOption, rasopathyQuestionnairePage.whatCountryDoesParticipantCurrentlyLiveInDropDown);
            CucumberLogUtils.logScreenShot();
        }

        rasScreenerStepsImpl.clickOnScreenerNextButton();

        try {
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rasScreenerConstants.streetAddress).sendKeys(street);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rasScreenerConstants.street2Address).sendKeys(street2);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rasScreenerConstants.cityText).sendKeys(city);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rasScreenerConstants.stateText).sendKeys(state);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rasScreenerConstants.zipCodeText).sendKeys(zipcode);
            CucumberLogUtils.logScreenShot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerStepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rasScreenerConstants.streetAddress).sendKeys(street);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rasScreenerConstants.street2Address).sendKeys(street2);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rasScreenerConstants.cityText).sendKeys(city);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rasScreenerConstants.stateText).sendKeys(state);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rasScreenerConstants.zipCodeText).sendKeys(zipcode);
            CucumberLogUtils.logScreenShot();
        }

        rasScreenerStepsImpl.clickOnScreenerNextButton();

        try {
            rasopathyQuestionnairePage.dynamicEmailAddressTextBox(rasScreenerConstants.emailAddress).sendKeys(emailAddress);
            CucumberLogUtils.logScreenShot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerStepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicEmailAddressTextBox(rasScreenerConstants.emailAddress).sendKeys(emailAddress);
            CucumberLogUtils.logScreenShot();
        }
        rasScreenerStepsImpl.clickOnScreenerNextButton();

        try {
            rasopathyQuestionnairePage.dynamicEmailAddressTextBox(rasScreenerConstants.confirmEmailAddress).sendKeys(emailAddressConfirm);
            CucumberLogUtils.logScreenShot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerStepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicEmailAddressTextBox(rasScreenerConstants.confirmEmailAddress).sendKeys(emailAddressConfirm);
            CucumberLogUtils.logScreenShot();
        }
        rasScreenerStepsImpl.clickOnScreenerNextButton();

        try {
            rasopathyQuestionnairePage.dynamicTextBoxLocatorForPhoneNumbers(rasScreenerConstants.homePhoneNumber).sendKeys(homePhoneNumber);
            rasopathyQuestionnairePage.dynamicTextBoxLocatorForPhoneNumbers(rasScreenerConstants.cellPhoneNumber).sendKeys(cellPhoneNumber);
            rasopathyQuestionnairePage.dynamicTextBoxLocatorForPhoneNumbers(rasScreenerConstants.workPhoneNumber).sendKeys(workPhoneNumber);
            rasopathyQuestionnairePage.dynamicPhoneNumberCheckBox(rasScreenerConstants.cellPhoneNumber).click();
            CucumberLogUtils.logScreenShot();
        } catch (NoSuchFrameException e) {
            e.printStackTrace();
            rasScreenerStepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicTextBoxLocatorForPhoneNumbers(rasScreenerConstants.homePhoneNumber).sendKeys(homePhoneNumber);
            rasopathyQuestionnairePage.dynamicTextBoxLocatorForPhoneNumbers(rasScreenerConstants.cellPhoneNumber).sendKeys(cellPhoneNumber);
            rasopathyQuestionnairePage.dynamicTextBoxLocatorForPhoneNumbers(rasScreenerConstants.workPhoneNumber).sendKeys(workPhoneNumber);
            rasopathyQuestionnairePage.dynamicPhoneNumberCheckBox(rasScreenerConstants.cellPhoneNumber).click();
            CucumberLogUtils.logScreenShot();
        }

        rasScreenerStepsImpl.clickOnScreenerNextButton();
        try {
            rasopathyQuestionnairePage.dynamicLocator(whatIsYourEthnicity).click();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerStepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicLocator(whatIsYourEthnicity).click();
        }

        rasScreenerStepsImpl.clickOnScreenerNextButton();

        try {
            rasopathyQuestionnairePage.dynamicLocator(whatIsYourRace).click();
            CucumberLogUtils.logScreenShot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerStepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicLocator(whatIsYourRace).click();
            CucumberLogUtils.logScreenShot();
        }

        rasScreenerStepsImpl.clickOnScreenerNextButton();

        try {
            rasopathyQuestionnairePage.dynamicLocator(areYouAParticipantInOtherStudyGroup).click();
            CucumberLogUtils.logScreenShot();
        } catch (NoSuchElementException e) {
            rasScreenerStepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicLocator(whatIsYourRace).click();
            CucumberLogUtils.logScreenShot();
        }

        rasScreenerStepsImpl.clickOnScreenerNextButton();
        CucumberLogUtils.logScreenShot();
        rasScreenerStepsImpl.clickOnScreenerNextButton();

        try {
            rasopathyQuestionnairePage.dynamicLocator(haveYouBeenDiagnosedWithFollowingConditions).click();
            CucumberLogUtils.logScreenShot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerStepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicLocator(haveYouBeenDiagnosedWithFollowingConditions).click();
            CucumberLogUtils.logScreenShot();
        }
        rasScreenerStepsImpl.clickOnScreenerNextButton();
        CucumberLogUtils.logScreenShot();

        try {
            rasopathyQuestionnairePage.dynamicLocator(haveYouBeenDiagnosedWithCancer).click();
            CucumberLogUtils.logScreenShot();
        } catch (NoSuchElementException e) {
            rasScreenerStepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicLocator(haveYouBeenDiagnosedWithCancer).click();
            CucumberLogUtils.logScreenShot();
        }

        rasScreenerStepsImpl.clickOnScreenerNextButton();
        try {
            MiscUtils.sleep(500);
            CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicLocator(haveYouBeenDiagnosedWithARasopathy));
            CucumberLogUtils.logScreenShot();
        } catch (NoSuchElementException e) {
            rasScreenerStepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicLocator(haveYouBeenDiagnosedWithARasopathy).click();
            CucumberLogUtils.logScreenShot();
        }
        rasScreenerStepsImpl.clickOnScreenerNextButton();
        rasScreenerStepsImpl.clickOnScreenerNextButton();

        try {
            CommonUtils.click(rasopathyQuestionnairePage.dynamicLocator(haveAnyOfYourBiologicalRelativesBeenDiagnosedWithARasopathy));
            CucumberLogUtils.logScreenShot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerStepsImpl.clickOnScreenerNextButton();
            CommonUtils.click(rasopathyQuestionnairePage.dynamicLocator(haveAnyOfYourBiologicalRelativesBeenDiagnosedWithARasopathy));
            CucumberLogUtils.logScreenShot();
        }

        rasScreenerStepsImpl.clickOnScreenerNextButton();

        try {
            MiscUtils.sleep(500);
            CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicLocator(haveYouEverHadGeneticTesting));
            CucumberLogUtils.logScreenShot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerStepsImpl.clickOnScreenerNextButton();
            CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicLocator(haveYouEverHadGeneticTesting));
            CucumberLogUtils.logScreenShot();
        }

        rasScreenerStepsImpl.clickOnScreenerNextButton();
        rasScreenerStepsImpl.clickOnScreenerNextButton();

        try {
            MiscUtils.sleep(500);
            CommonUtils.scrollIntoView(rasopathyQuestionnairePage.dynamicLocator(howDidYouHearAboutThisStudy));
            CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicLocator(howDidYouHearAboutThisStudy));
            rasopathyQuestionnairePage.dynamicLocatorForHowDidYouHearAboutStudyTextBoxes(howDidYouHearAboutThisStudy).sendKeys(howDidYouHearAboutThisStudyOtherReason);
            CucumberLogUtils.logScreenShot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerStepsImpl.clickOnScreenerNextButton();
            CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicTextBoxLocator(howDidYouHearAboutThisStudy));
            rasopathyQuestionnairePage.dynamicLocatorForHowDidYouHearAboutStudyTextBoxes(howDidYouHearAboutThisStudy).sendKeys(howDidYouHearAboutThisStudyOtherReason);
            CucumberLogUtils.logScreenShot();
        }

        rasScreenerStepsImpl.clickOnScreenerNextButton();

        try {
            MiscUtils.sleep(500);
            CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicLocator(haveYouOrOtherFamilyMembersParticipatedInOtherStudy));
            CucumberLogUtils.logScreenShot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerStepsImpl.clickOnScreenerNextButton();
            CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicLocator(haveYouOrOtherFamilyMembersParticipatedInOtherStudy));
            CucumberLogUtils.logScreenShot();
        }
        rasScreenerStepsImpl.clickOnScreenerNextButton();

        try {
            MiscUtils.sleep(500);
            CommonUtils.scrollIntoView(rasopathyQuestionnairePage.dynamicLocator(whatAreMainReasonsForParticipatingInStudy));
            CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicLocator(whatAreMainReasonsForParticipatingInStudy));
            System.out.println();
            rasopathyQuestionnairePage.dynamicLocatorForMainReasonForParticipatingInStudy(whatAreMainReasonsForParticipatingInStudy).sendKeys(whatAreMainReasonsForParticipatingInStudyOtherReason);
            CucumberLogUtils.logScreenShot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerStepsImpl.clickOnScreenerNextButton();
            MiscUtils.sleep(500);
            CommonUtils.scrollIntoView(rasopathyQuestionnairePage.dynamicLocator(whatAreMainReasonsForParticipatingInStudy));
            CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicLocator(whatAreMainReasonsForParticipatingInStudy));
            rasopathyQuestionnairePage.dynamicLocatorForMainReasonForParticipatingInStudy(whatAreMainReasonsForParticipatingInStudy).sendKeys(whatAreMainReasonsForParticipatingInStudyOtherReason);
            CucumberLogUtils.logScreenShot();
        }
        rasScreenerStepsImpl.clickOnScreenerNextButton();
        rasScreenerStepsImpl.clickOnScreenerNextButton();
        MiscUtils.sleep(1000);
        logOutOfNativeView();
    }

    public static void logOutOfNativeView(){
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("nativeview"));
        CommonUtils.clickOnElement(nativeViewHomePage.profileModule);
        CommonUtils.clickOnElement(nativeViewHomePage.logOutButton);
    }
}
