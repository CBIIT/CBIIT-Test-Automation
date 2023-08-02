package ServiceNow.CHARMS.StepsImplementation;

import ServiceNow.CHARMS.Constants.CHARMSConstants;
import ServiceNow.CHARMS.Constants.CHARMSRASScreenerConstants;
import ServiceNow.CHARMS.Pages.NativeViewCHARMSDashboardPage;
import ServiceNow.CHARMS.Steps.HooksSteps;
import ServiceNow.COVIDDash.Utils.COVIDConstants;
import ServiceNow.SEER.StepsImplementation.SEERDataAccessRequestPageStepsImpl;
import appsCommon.PageInitializer;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebElement;

public class RasScreenerScenario1StepsImpl extends PageInitializer {
    /***
     * USE THIS METHOD TO CLICK ON SCREENER NEXT BUTTON
     */
    public void clickOnScreenerNextButton() {
        JavascriptUtils.scrollIntoView(rasopathyQuestionnairePage.studyNextButton);
        CommonUtils.clickOnElement(rasopathyQuestionnairePage.studyNextButton);
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
        testDataManagerScenario1.dataInitializerRasScreenerSurveyScenario1(sheetName);
        if(sheetName.contains("screenerScenario1")) {
            rasScreenerScenario1StepsImpl.rasScreenerSubmissionScenario1();
        }else if(sheetName.contains("screenerScenario2")) {
            rasScreenerScenario1StepsImpl.rasScreenerSubmissionScenario1();
        }
    }

    /***
     * THIS METHOD WILL LOG IN WITH USER NAME AND PASSWORD DEFINED IN FEATURE FILE
     */
    public void logsInViaOktaWithUsernameAndPassword(String username, String password) {
        MiscUtils.sleep(1000);
        CommonUtils.waitForVisibility(myRASLoginPage.loginToMyRASButton);
        myRASLoginPage.loginToMyRASButton.click();
        oktaLoginPage.usernameTxtBox.sendKeys(username);
        oktaLoginPage.passwordTxtBox.sendKeys(password);
        CommonUtils.waitForVisibility(oktaLoginPage.loginBtn);
        oktaLoginPage.loginBtn.click();
        MiscUtils.sleep(1000);
        CommonUtils.waitForVisibility(myRASHomePage.warningAgreeButton);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        myRASHomePage.warningAgreeButton.click();
    }

    /***
     * USE THIS METHOD TO CLICK ON ELIGIBILITY QUESTIONNAIRE
     */

    public void clicksOnEligibilityQuestionnaireToBeginQuestionnaire() {
        CommonUtils.waitForVisibility(myRASHomePage.rasoptathyEligibilityQuestionnaire);
        CommonUtils.clickOnElement(myRASHomePage.rasoptathyEligibilityQuestionnaire);
    }

    /***
     * USE THIS METHOD TO CLICK ON RAS SURVEY QUESTIONNAIRE
     */
    public void clicksOnTheRasSurveyForm() {
        CommonUtils.waitForVisibility(myRASHomePage.rasoptathyRasSurveyButton);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        CommonUtils.clickOnElement(myRASHomePage.rasoptathyRasSurveyButton);
        CommonUtils.waitForClickability(myRASHomePage.rasoptathyRasSurveyGoButton);
    }

    /***
     * USE THIS METHOD TO ENTER EMAIL AND PIN
     */
    public void aParticipantEntersUsernameUndPin(String email) {
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        String pin = myRASHomePage.rasoptathyRasSurveyPin.getText();
        CommonUtils.clickOnElement(myRASHomePage.rasoptathyRasSurveyGoButton);
        CommonUtils.switchToNextWindow();
        MiscUtils.sleep(1000);
        CommonUtils.waitForVisibility(rasopathyQuestionnairePage.dynamicTextBoxLocator("Email"));
        rasopathyQuestionnairePage.dynamicTextBoxLocator("Email").sendKeys(email);
        rasopathyQuestionnairePage.dynamicTextBoxLocator("Pin").sendKeys(pin);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
    }

    /***
     * USE THIS METHOD TO REWIND THE SURVEY FORM
     */
    public void theParticipantWillBeAbleToRewindTheForm() {
        MiscUtils.sleep(2000);
        while (rasopathyQuestionnairePage.rasSurveyPreviousButton.isDisplayed()){
            rasScreenerScenario1StepsImpl.clickOnSurveyPreviousButton();
        }
    }

    /***
     * USE THIS METHOD WILL COMPLETE THE RAS SCREENER SCENARIO 1
     */
    public void rasScreenerSubmissionScenario1() {
        CommonUtils.switchToNextWindow();
        MiscUtils.sleep(2000);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        try {
            JavascriptUtils.scrollIntoView(rasopathyQuestionnairePage.studyNextButton);
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            JavascriptUtils.scrollIntoView(rasopathyQuestionnairePage.studyNextButton);
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        CommonUtils.waitForVisibility(rasopathyQuestionnairePage.iAmCompletingThisFormForMyselfOption);
        try {
            rasopathyQuestionnairePage.iAmCompletingThisFormForMyselfOption.click();
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.iAmCompletingThisFormForMyselfOption.click();
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rASScreenerScenario1_Constants.FIRST_NAME).sendKeys(testDataManagerScenario1.firstName);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rASScreenerScenario1_Constants.MIDDLE_INITIAL).sendKeys(testDataManagerScenario1.middleInitial);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rASScreenerScenario1_Constants.LAST_NAME).sendKeys(testDataManagerScenario1.lastName);
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rASScreenerScenario1_Constants.FIRST_NAME).sendKeys(testDataManagerScenario1.firstName);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rASScreenerScenario1_Constants.MIDDLE_INITIAL).sendKeys(testDataManagerScenario1.middleInitial);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rASScreenerScenario1_Constants.LAST_NAME).sendKeys(testDataManagerScenario1.lastName);
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            rasopathyQuestionnairePage.calendarYearTextBox.clear();
            rasopathyQuestionnairePage.calendarYearTextBox.sendKeys(testDataManagerScenario1.dateOfBirthYear);
            CommonUtils.selectDropDownValue(testDataManagerScenario1.dateOfBirthMonth, rasopathyQuestionnairePage.calendarMonthDropDown);
            rasopathyQuestionnairePage.calendarDayOption.click();
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.calendarYearTextBox.clear();
            rasopathyQuestionnairePage.calendarYearTextBox.sendKeys(testDataManagerScenario1.dateOfBirthYear);
            CommonUtils.selectDropDownValue(testDataManagerScenario1.dateOfBirthMonth, rasopathyQuestionnairePage.calendarMonthDropDown);
            rasopathyQuestionnairePage.calendarDayOption.click();
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.sexAssignedAtBirthOption).click();
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.sexAssignedAtBirthOption).click();
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.areYouAdoptedOption).click();
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.areYouAdoptedOption).click();
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            CommonUtils.selectDropDownValue(testDataManagerScenario1.countryOption, rasopathyQuestionnairePage.whatCountryDoesParticipantCurrentlyLiveInDropDown);
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            CommonUtils.selectDropDownValue(testDataManagerScenario1.countryOption, rasopathyQuestionnairePage.whatCountryDoesParticipantCurrentlyLiveInDropDown);
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rASScreenerScenario1_Constants.STREET_ADDRESS).sendKeys(testDataManagerScenario1.street);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rASScreenerScenario1_Constants.STREET_2_ADDRESS).sendKeys(testDataManagerScenario1.street2);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rASScreenerScenario1_Constants.CITY_TEXT).sendKeys(testDataManagerScenario1.city);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rASScreenerScenario1_Constants.STATE_TEXT).sendKeys(testDataManagerScenario1.state);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rASScreenerScenario1_Constants.ZIP_CODE_TEXT).sendKeys(testDataManagerScenario1.zipcode);
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rASScreenerScenario1_Constants.STREET_ADDRESS).sendKeys(testDataManagerScenario1.street);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rASScreenerScenario1_Constants.STREET_2_ADDRESS).sendKeys(testDataManagerScenario1.street2);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rASScreenerScenario1_Constants.CITY_TEXT).sendKeys(testDataManagerScenario1.city);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rASScreenerScenario1_Constants.STATE_TEXT).sendKeys(testDataManagerScenario1.state);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rASScreenerScenario1_Constants.ZIP_CODE_TEXT).sendKeys(testDataManagerScenario1.zipcode);
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            rasopathyQuestionnairePage.dynamicEmailAddressTextBox(rASScreenerScenario1_Constants.EMAIL_ADDRESS).sendKeys(testDataManagerScenario1.emailAddress);
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicEmailAddressTextBox(rASScreenerScenario1_Constants.EMAIL_ADDRESS).sendKeys(testDataManagerScenario1.emailAddress);
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            rasopathyQuestionnairePage.dynamicEmailAddressTextBox(rASScreenerScenario1_Constants.CONFIRM_EMAIL_ADDRESS).sendKeys(testDataManagerScenario1.emailAddressConfirm);
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicEmailAddressTextBox(rASScreenerScenario1_Constants.CONFIRM_EMAIL_ADDRESS).sendKeys(testDataManagerScenario1.emailAddressConfirm);
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            rasopathyQuestionnairePage.dynamicTextBoxLocatorForPhoneNumbers(rASScreenerScenario1_Constants.HOME_PHONE_NUMBER).sendKeys(testDataManagerScenario1.homePhoneNumber);
            rasopathyQuestionnairePage.dynamicTextBoxLocatorForPhoneNumbers(rASScreenerScenario1_Constants.CELL_PHONE_NUMBER).sendKeys(testDataManagerScenario1.cellPhoneNumber);
            rasopathyQuestionnairePage.dynamicTextBoxLocatorForPhoneNumbers(rASScreenerScenario1_Constants.WORK_PHONE_NUMBER).sendKeys(testDataManagerScenario1.workPhoneNumber);
            rasopathyQuestionnairePage.dynamicPhoneNumberCheckBox(rASScreenerScenario1_Constants.CELL_PHONE_NUMBER).click();
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchFrameException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicTextBoxLocatorForPhoneNumbers(rASScreenerScenario1_Constants.HOME_PHONE_NUMBER).sendKeys(testDataManagerScenario1.homePhoneNumber);
            rasopathyQuestionnairePage.dynamicTextBoxLocatorForPhoneNumbers(rASScreenerScenario1_Constants.CELL_PHONE_NUMBER).sendKeys(testDataManagerScenario1.cellPhoneNumber);
            rasopathyQuestionnairePage.dynamicTextBoxLocatorForPhoneNumbers(rASScreenerScenario1_Constants.WORK_PHONE_NUMBER).sendKeys(testDataManagerScenario1.workPhoneNumber);
            rasopathyQuestionnairePage.dynamicPhoneNumberCheckBox(rASScreenerScenario1_Constants.CELL_PHONE_NUMBER).click();
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.whatIsYourEthnicity).click();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.whatIsYourEthnicity).click();
        }
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.whatIsYourRace).click();
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.whatIsYourRace).click();
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.areYouAParticipantInOtherStudyGroup).click();
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.whatIsYourRace).click();
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.haveYouBeenDiagnosedWithFollowingConditions).click();
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.haveYouBeenDiagnosedWithFollowingConditions).click();
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        try {
            rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.haveYouBeenDiagnosedWithCancer).click();
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.haveYouBeenDiagnosedWithCancer).click();
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            MiscUtils.sleep(500);
            CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.haveYouBeenDiagnosedWithARasopathy));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.haveYouBeenDiagnosedWithARasopathy).click();
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            CommonUtils.waitForVisibility(rasopathyQuestionnairePage.haveAnyOfYourRelativesBeenDiagnosedNoRadioButton);
            CommonUtils.click(rasopathyQuestionnairePage.haveAnyOfYourRelativesBeenDiagnosedNoRadioButton);
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            CommonUtils.click(rasopathyQuestionnairePage.haveAnyOfYourRelativesBeenDiagnosedNoRadioButton);
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            CommonUtils.waitForVisibility(rasopathyQuestionnairePage.haveYouEverHadGeneticTestingNoRadioButton);
            CommonUtils.click(rasopathyQuestionnairePage.haveYouEverHadGeneticTestingNoRadioButton);
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            CommonUtils.click(rasopathyQuestionnairePage.haveYouEverHadGeneticTestingNoRadioButton);
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();

        try {
            MiscUtils.sleep(500);
            CommonUtils.scrollIntoView(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.howDidYouHearAboutThisStudy));
            CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.howDidYouHearAboutThisStudy));
            rasopathyQuestionnairePage.dynamicLocatorForHowDidYouHearAboutStudyTextBoxes(testDataManagerScenario1.howDidYouHearAboutThisStudy).sendKeys(testDataManagerScenario1.howDidYouHearAboutThisStudyOtherReason);
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicTextBoxLocator(testDataManagerScenario1.howDidYouHearAboutThisStudy));
            rasopathyQuestionnairePage.dynamicLocatorForHowDidYouHearAboutStudyTextBoxes(testDataManagerScenario1.howDidYouHearAboutThisStudy).sendKeys(testDataManagerScenario1.howDidYouHearAboutThisStudyOtherReason);
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            MiscUtils.sleep(500);
            CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.haveYouOrOtherFamilyMembersParticipatedInOtherStudy));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.haveYouOrOtherFamilyMembersParticipatedInOtherStudy));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            MiscUtils.sleep(500);
            CommonUtils.scrollIntoView(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.whatAreMainReasonsForParticipatingInStudy));
            CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.whatAreMainReasonsForParticipatingInStudy));
            System.out.println();
            rasopathyQuestionnairePage.dynamicLocatorForMainReasonForParticipatingInStudy(testDataManagerScenario1.whatAreMainReasonsForParticipatingInStudy).sendKeys(testDataManagerScenario1.whatAreMainReasonsForParticipatingInStudyOtherReason);
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            MiscUtils.sleep(500);
            CommonUtils.scrollIntoView(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.whatAreMainReasonsForParticipatingInStudy));
            CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.whatAreMainReasonsForParticipatingInStudy));
            rasopathyQuestionnairePage.dynamicLocatorForMainReasonForParticipatingInStudy(testDataManagerScenario1.whatAreMainReasonsForParticipatingInStudy).sendKeys(testDataManagerScenario1.whatAreMainReasonsForParticipatingInStudyOtherReason);
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        MiscUtils.sleep(1000);
        logOutOfNativeView();
    }

    /***
     * USE THIS METHOD FOR NATIVE VIEW CONSENT FLOW PROCESS SCENARIO 1
     */
    public void nativeViewConsentFlowProcessScenario1() {
        nativeViewLoginImpl.sideDoorAccountLogin();
        MiscUtils.sleep(1000);
        if(nativeViewEnrollementsPage.filterNavigatorIconButton.isDisplayed()){
            CommonUtils.clickOnElement(nativeViewEnrollementsPage.filterNavigatorIconButton);
            CommonUtils.waitForVisibility(nativeViewEnrollementsPage.filterNavigator);
        }
        nativeViewEnrollementsPage.filterNavigator.clear();
        MiscUtils.sleep(500);
        nativeViewEnrollementsPage.filterNavigator.sendKeys("CHARMS");
        CommonUtils.waitForClickability(nativeViewCHARMSDashboardPage.nativeViewAllParticipantsDetailsButton);
        JavascriptUtils.scrollIntoView(nativeViewCHARMSDashboardPage.nativeViewAllParticipantsDetailsButton);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        JavascriptUtils.clickByJS(nativeViewCHARMSDashboardPage.nativeViewAllParticipantsDetailsButton);
        CommonUtils.waitForVisibility(nativeViewAccessRequestPage.accessRequestIFrame);
        CommonUtils.switchToFrame(nativeViewAccessRequestPage.accessRequestIFrame);
        CommonUtils.waitForVisibility(nativeViewCHARMSDashboardPage.rasStudyParticipantsDetailsMenu);
        CommonUtils.assertTrue(nativeViewCHARMSDashboardPage.rasStudyParticipantsDetailsMenu.getText()
                .contains("Participant Details"));
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        CommonUtils.waitForVisibility(NativeViewCHARMSDashboardPage.nativeViewnewScreenerReceivedLocator(CHARMSRASScreenerConstants.CONSENT_FLOW_NAME)); //Add this inted of name when running entire test:testDataManager.firstName + " " + testDataManager.lastName
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        CommonUtils.clickOnElement(NativeViewCHARMSDashboardPage.nativeViewnewScreenerReceivedLocator(CHARMSRASScreenerConstants.CONSENT_FLOW_NAME));//Add this inted of name when running entire test:testDataManager.firstName + " " + testDataManager.lastName
        MiscUtils.sleep(1000);
        if(CommonUtils.isElementDisplayed(nativeViewCHARMSDashboardPage.rasStudyOpenRecordButton)){
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
            CommonUtils.clickOnElement(nativeViewCHARMSDashboardPage.rasStudyOpenRecordButton);
        }
        MiscUtils.sleep(2000);
        JavascriptUtils.clearByJS(nativeViewCHARMSParticipantDetailsPage.nativeSubjectFlagButton);
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantConsentPage.rasStudyNonParticipantDateButton);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyNonParticipantDateButton);
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeTodayButton);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeTodayButton);
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsSubmitForEligibilityButton);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsSubmitForEligibilityButton);
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsMarkEligibleButton);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsMarkEligibleButton);
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsConsentAddedText);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        CommonUtils.assertEqualsWithMessage(nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsConsentAddedText.getText(), CHARMSRASScreenerConstants.CONSENT_ADDED_TEXT, "---- VERIFYING SCREENER RECORD RASOPATHY HISTORY DATA ----");
        /* BEGINNING: CONSENT FLOW PROCESS */
        JavascriptUtils.scrollIntoView(nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsConsentsButton);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsConsentsButton);
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsConsentsPreviewButton);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsConsentsPreviewButton);
        CommonUtils.waitForVisibility(nativeViewCHARMSDashboardPage.rasStudyOpenRecordButton);
        MiscUtils.sleep(500);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        CommonUtils.clickOnElement(nativeViewCHARMSDashboardPage.rasStudyOpenRecordButton);
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeCalendar);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
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
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallCompleteButton);
        MiscUtils.sleep(1000);
        CommonUtils.waitForClickability(nativeViewCHARMSParticipantConsentPage.rasStudyConsentAddFileButton);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentAddFileButton);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        CommonUtils.sendKeys(nativeViewCHARMSParticipantConsentPage.rasStudyConsentChoseFileButton,
                COVIDConstants.IIQ_STUDY_DOCUMENTATION_PDF_PATH);
        MiscUtils.sleep(2000);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentChoseFileCloseButton);
        CommonUtils.waitForClickability(nativeViewCHARMSParticipantConsentPage.rasStudyConsentHardCopyReceivedButton);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentHardCopyReceivedButton);
        CommonUtils.waitForClickability(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCompletedConsentButton);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCompletedConsentButton);
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantConsentPage.rasStudyConsentParticipantRecordsReadyToProgressMessage);
        CommonUtils.assertEqualsWithMessage(nativeViewCHARMSParticipantConsentPage.rasStudyConsentParticipantRecordsReadyToProgressMessage.getText(), CHARMSRASScreenerConstants.PARTICIPANT_READY_TO_PROGRESS_TEXT, "---- VERIFYING PARTICIPANT RECORD READY TO PROGRESS MESSAGE ----");
        CommonUtils.assertEqualsWithMessage(nativeViewCHARMSParticipantConsentPage.rasStudyConsentConsentRecordCompletedMessageMessage.getText(), CHARMSRASScreenerConstants.CONSENT_RECORD_COMPLETED_TEXT, "---- VERIFYING CONSENT RECORD COMPLETED AND FAMILY RECORD IS NOW ACTIVE! MESSAGE ----");
        MiscUtils.sleep(500);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        SEERDataAccessRequestPageStepsImpl.nativeViewLogOut();
    }

    /***
     * USE THIS METHOD WILL COMPLETE THE IIQ FORM SCENARIO 1
     */
    public void rasScreenerIIQFormScenario1(String sheetNameIiq) {
            testDataManagerScenario1.dataInitializerRasScreenerIiqFormScenario1(sheetNameIiq);
            WebDriverUtils.webDriver.get(CHARMSConstants.IIQ_SAMPLE_FORM);

        try {
            myRASIIQFormPage.screenerIiqFormEmail.sendKeys(testDataManagerScenario1.pleaseLogInEmailTextBox);
            myRASIIQFormPage.screenerIiqFormPin.sendKeys(testDataManagerScenario1.pleaseLogInOneTimePinTextBox);
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            CommonUtils.waitForVisibility(myRASIIQFormPage.screenerIiqFormThisIsACopyForLowerEnvironments);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            myRASIIQFormPage.screenerIiqFormEmail.sendKeys(testDataManagerScenario1.pleaseLogInEmailTextBox);
            myRASIIQFormPage.screenerIiqFormPin.sendKeys(testDataManagerScenario1.pleaseLogInOneTimePinTextBox);
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        }
        CommonUtils.waitForVisibility(myRASIIQFormPage.screenerIiqFormThisIsACopyForLowerEnvironments);
        CommonUtils.assertEqualsWithMessage(testDataManagerScenario1.thisIsACopyForLowerEnvironmentsText, myRASIIQFormPage.screenerIiqFormThisIsACopyForLowerEnvironments.getText(), "-- VERIFYING THIS IS THE COPY FOR LOWER ENVIRONMENTS TEXT --");
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        CommonUtils.waitForVisibility(myRASIIQFormPage.screenerIiqFormSomeOfThisInformation);
        CommonUtils.assertEqualsWithMessage(testDataManagerScenario1.someOfThisInformationText, myRASIIQFormPage.screenerIiqFormSomeOfThisInformation.getText(), "-- VERIFYING SOME OF THIS INFORMATION TEXT --");
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        CommonUtils.waitForVisibility(myRASIIQFormPage.screenerIiqFormThisFirstQuestionOfTheQuestionnaire);
        CommonUtils.assertEqualsWithMessage(testDataManagerScenario1.thisFirstSectionOfTheQuestionnaireText, myRASIIQFormPage.screenerIiqFormThisFirstQuestionOfTheQuestionnaire.getText(), "-- VERIFYING THIS FIRST QUESTION OF THE QUESTIONNAIRE TEXT --");
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.areYouCompletingThisFormForYourselfRadioButton).click();
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.areYouCompletingThisFormForYourselfRadioButton).click();
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.whatIsYourBiologicalSexRadioButton).click();
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.whatIsYourBiologicalSexRadioButton).click();
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            CommonUtils.waitForClickability(myRASIIQFormPage.screenerIiqFormForWhichSexYouIdentifyRadioButton);
            myRASIIQFormPage.screenerIiqFormForWhichSexYouIdentifyRadioButton.click();
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            myRASIIQFormPage.screenerIiqFormForWhichSexYouIdentifyRadioButton.click();
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.doYouConsiderYourselfToBeRadioButton));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.doYouConsiderYourselfToBeRadioButton));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.doYouConsiderYourselfToBeRadioButton));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.whatIsYourRaceCheckBox));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.whatIsYourRaceCheckBox));
            MiscUtils.sleep(2000);
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.whatIsYourRaceCheckBox));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.whatIsYourRaceCheckBox));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.areYouOfAshkenazyJewishDescentRadioButton));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.areYouOfAshkenazyJewishDescentRadioButton));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.areYouOfAshkenazyJewishDescentRadioButton));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.areYouAdoptedRadioButton));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.areYouAdoptedRadioButton));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.areYouAdoptedRadioButton));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.wereYouRaisedPrimarilyRadioButton));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.wereYouRaisedPrimarilyRadioButton));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.wereYouRaisedPrimarilyRadioButton));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            rasopathyQuestionnairePage.calendarYearTextBox.clear();
            rasopathyQuestionnairePage.calendarYearTextBox.sendKeys(testDataManagerScenario1.whatIsYourDateOfBirthYearDropDown);
            CommonUtils.selectDropDownValue(testDataManagerScenario1.whatIsYourDateOfBirthMonthDropDown, rasopathyQuestionnairePage.calendarMonthDropDown);
            rasopathyQuestionnairePage.iIQcalendarDayOption.click();
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.calendarYearTextBox.clear();
            rasopathyQuestionnairePage.calendarYearTextBox.sendKeys(testDataManagerScenario1.whatIsYourDateOfBirthYearDropDown);
            CommonUtils.selectDropDownValue(testDataManagerScenario1.whatIsYourDateOfBirthMonthDropDown, rasopathyQuestionnairePage.calendarMonthDropDown);
            rasopathyQuestionnairePage.iIQcalendarDayOption.click();
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rASScreenerScenario1_Constants.WHERE_WERE_YOU_BORN_CITY_TEXT_BOX_QUESTION).clear();
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rASScreenerScenario1_Constants.WHERE_WERE_YOU_BORN_CITY_TEXT_BOX_QUESTION).sendKeys(testDataManagerScenario1.whereWereYouBornCityTextBox);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rASScreenerScenario1_Constants.WHERE_WERE_YOU_BORN_STATE_TEXT_BOX_QUESTION).clear();
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rASScreenerScenario1_Constants.WHERE_WERE_YOU_BORN_STATE_TEXT_BOX_QUESTION).sendKeys(testDataManagerScenario1.whereWereYouBornStateTextBox);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rASScreenerScenario1_Constants.WHERE_WERE_YOU_BORN_COUNTRY_TEXT_BOX_QUESTION).clear();
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rASScreenerScenario1_Constants.WHERE_WERE_YOU_BORN_COUNTRY_TEXT_BOX_QUESTION).sendKeys(testDataManagerScenario1.whereWereYouBornCountryTextBox);
            rasopathyQuestionnairePage.iIQAddressDontKnowTextBox.clear();
            rasopathyQuestionnairePage.iIQAddressDontKnowTextBox.sendKeys(testDataManagerScenario1.whereWereYouBornDontKnowTextBox);
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rASScreenerScenario1_Constants.WHERE_WERE_YOU_BORN_CITY_TEXT_BOX_QUESTION).clear();
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rASScreenerScenario1_Constants.WHERE_WERE_YOU_BORN_CITY_TEXT_BOX_QUESTION).sendKeys(testDataManagerScenario1.whereWereYouBornCityTextBox);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rASScreenerScenario1_Constants.WHERE_WERE_YOU_BORN_STATE_TEXT_BOX_QUESTION).clear();
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rASScreenerScenario1_Constants.WHERE_WERE_YOU_BORN_STATE_TEXT_BOX_QUESTION).sendKeys(testDataManagerScenario1.whereWereYouBornStateTextBox);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rASScreenerScenario1_Constants.WHERE_WERE_YOU_BORN_COUNTRY_TEXT_BOX_QUESTION).clear();
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rASScreenerScenario1_Constants.WHERE_WERE_YOU_BORN_COUNTRY_TEXT_BOX_QUESTION).sendKeys(testDataManagerScenario1.whereWereYouBornCountryTextBox);
            rasopathyQuestionnairePage.iIQAddressDontKnowTextBox.clear();
            rasopathyQuestionnairePage.iIQAddressDontKnowTextBox.sendKeys(testDataManagerScenario1.whereWereYouBornDontKnowTextBox);
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            MiscUtils.sleep(2000);
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.mostPeopleHaveAncestorsCheckBox));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.mostPeopleHaveAncestorsCheckBox));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            MiscUtils.sleep(2000);
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.whatIsYourBiologicalFatherAncestralBackgroundTextBox));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.whatIsYourBiologicalFatherAncestralBackgroundTextBox));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            MiscUtils.sleep(2000);
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.whatIsYourFammilysReligiousBackgroundCheckBox));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.whatIsYourFammilysReligiousBackgroundCheckBox));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.whatIsYourMaritalStatusCheckBox));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.whatIsYourMaritalStatusCheckBox));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.whatIsYourMaritalStatusCheckBox));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.whatIsYourMainOccupationRadioButton));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.whatIsYourMainOccupationRadioButton));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.whatIsYourMainOccupationRadioButton));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.doYouCurrentlyHaveHealthInsuranceRadioButton));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.doYouCurrentlyHaveHealthInsuranceRadioButton));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.doYouCurrentlyHaveHealthInsuranceRadioButton));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.doYouCurrentlyHaveHealthInsuranceRadioButton));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.doYouCurrentlyHaveHealthInsuranceRadioButton));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.doYouCurrentlyHaveHealthInsuranceRadioButton));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.whatIsTheTotalCombinedYearlyIncomeRadioButton));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.whatIsTheTotalCombinedYearlyIncomeRadioButton));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.whatIsTheTotalCombinedYearlyIncomeRadioButton));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.whatIsTheHighestLevelOfSchoolingRadioButton));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.whatIsTheHighestLevelOfSchoolingRadioButton));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.whatIsTheHighestLevelOfSchoolingRadioButton));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        CommonUtils.waitForVisibility(myRASIIQFormPage.screenerIiqFormThisSectionAsksDetailedMedicalHistoryText);
        CommonUtils.assertEqualsWithMessage(rASScreenerScenario1_Constants.THIS_SECTION_ASKS_YOU_TEXT, myRASIIQFormPage.screenerIiqFormThisSectionAsksDetailedMedicalHistoryText.getText(), "-- VERIFYING THIS SECTION ASKS DETAILED MEDICAL HISTORY TEXT --");
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.wereYouConceivedUsingVitroRadioButton));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.wereYouConceivedUsingVitroRadioButton));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.wereYouConceivedUsingVitroRadioButton));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.wereYouATwinRadioButton));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.wereYouATwinRadioButton));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.wereYouATwinRadioButton));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.areYourBiologicalParentsBloodRelatedRadioButton));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.areYourBiologicalParentsBloodRelatedRadioButton));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.areYourBiologicalParentsBloodRelatedRadioButton));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.wouldYouSayYouWereBornRadioButton));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.wouldYouSayYouWereBornRadioButton));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.wouldYouSayYouWereBornRadioButton));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        CommonUtils.waitForVisibility(myRASIIQFormPage.screenerIiqFormFillOutBirthWeight);
        CommonUtils.sendKeysToElement(myRASIIQFormPage.screenerIiqFormFillOutBirthWeight, testDataManagerScenario1.pleaseFillOutBirtWeightNumericTextBox);
        MiscUtils.sleep(3000);
        CommonUtils.selectDropDownValue(testDataManagerScenario1.pleaseFillOutBirtWeightUnitDropDown,myRASIIQFormPage.screenerIiqFormFillOutBirthWeightUnitDropDown);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        CommonUtils.waitForVisibility(myRASIIQFormPage.screenerIiqFormFillOutBirthLenghtHeadNumeticTextBox);
        CommonUtils.sendKeysToElement(myRASIIQFormPage.screenerIiqFormFillOutBirthLenghtHeadNumeticTextBox, testDataManagerScenario1.pleaseFillOutHeadNumericTextBox);
        CommonUtils.sendKeysToElement(myRASIIQFormPage.screenerIiqFormFillOutBirthLenghtHeadCircumferenceNumeticTextBox, testDataManagerScenario1.pleaseFillOutHeadCircumferenceNumericTextBox);
        MiscUtils.sleep(3000);
        CommonUtils.selectDropDownValue(testDataManagerScenario1.pleaseFillOutHeadUnitDropDown,myRASIIQFormPage.screenerIiqFormFillOutBirthLenghtHeadUnitDropDown);
        CommonUtils.selectDropDownValue(testDataManagerScenario1.pleaseFillOutHeadCircumferenceUnitDropDown,myRASIIQFormPage.screenerIiqFormFillOutBirthLenghtHeadCircumferenceUnitDropDown);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        CommonUtils.waitForVisibility(myRASIIQFormPage.screenerIiqFormThisSectionWillAskAboutCancerText);
        CommonUtils.assertEqualsWithMessage(rASScreenerScenario1_Constants.THIS_SECTION_WILL_ASK_ABOUT_CANCER_TEXT, myRASIIQFormPage.screenerIiqFormThisSectionWillAskAboutCancerText.getText(), "-- VERIFYING THIS SECTION WILL ASK ABOUT CANCER TEXT --");
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.haveYouEverBeenDiagnosedWithAnyCancerRadioButton));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.haveYouEverBeenDiagnosedWithAnyCancerRadioButton));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.haveYouEverBeenDiagnosedWithAnyCancerRadioButton));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.haveYouEverHadMedicalGeneticTestingRadioButton));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.haveYouEverHadMedicalGeneticTestingRadioButton));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.haveYouEverHadMedicalGeneticTestingRadioButton));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        CommonUtils.waitForVisibility(myRASIIQFormPage.screenerIiqFormFillOutCurrentHeightTextBox);
        CommonUtils.sendKeysToElement(myRASIIQFormPage.screenerIiqFormFillOutCurrentHeightTextBox, testDataManagerScenario1.pleaseFillTheTableBelowWithHeightNumericTextBox);
        MiscUtils.sleep(3000);
        CommonUtils.selectDropDownValue(testDataManagerScenario1.pleaseFillTheTableBelowWithHeightUnitDropDown,myRASIIQFormPage.screenerIiqFormFillOutCurrentHeightUnitDropDown);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        CommonUtils.waitForVisibility(myRASIIQFormPage.screenerIiqFormCompleteCurrentWeightTextBox);
        CommonUtils.sendKeysToElement(myRASIIQFormPage.screenerIiqFormCompleteCurrentWeightTextBox, testDataManagerScenario1.pleaseFillTheTableBelowWithWeightCurrentNumericTextBox);
        CommonUtils.sendKeysToElement(myRASIIQFormPage.screenerIiqFormCompleteOverLifetimeWeightTextBox, testDataManagerScenario1.pleaseFillTheTableBelowWithWeightDuringLifetimeNumericTextBox);
        CommonUtils.sendKeysToElement(myRASIIQFormPage.screenerIiqFormCompleteAt18WeightTextBox, testDataManagerScenario1.pleaseFillTheTableBelowWithWeightAt18NumericTextBox);
        MiscUtils.sleep(3000);
        CommonUtils.selectDropDownValue(testDataManagerScenario1.pleaseFillTheTableBelowWithWeightCurrentUnitDropDown,myRASIIQFormPage.screenerIiqFormCompleteCurrentWeightUnitDropDown);
        CommonUtils.selectDropDownValue(testDataManagerScenario1.pleaseFillTheTableBelowWithWeightDuringLifetimeUnitDropDown,myRASIIQFormPage.screenerIiqFormCompleteOverLifetimeWeightUnitDropDown);
        CommonUtils.selectDropDownValue(testDataManagerScenario1.pleaseFillTheTableBelowWithWeightAt18UnitDropDown,myRASIIQFormPage.screenerIiqFormCompleteAt18WeightUnitDropDown);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        CommonUtils.waitForVisibility(myRASIIQFormPage.screenerIiqFormWhatAgeHighestWeightTextBox);
        CommonUtils.sendKeysToElement(myRASIIQFormPage.screenerIiqFormWhatAgeHighestWeightTextBox, testDataManagerScenario1.atWhatAgeWereYouAtTheHighestWeightTextBox);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.haveYouSoughtMedicalAdviceRegardingFertilityRadioButton));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.haveYouSoughtMedicalAdviceRegardingFertilityRadioButton));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.haveYouSoughtMedicalAdviceRegardingFertilityRadioButton));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        CommonUtils.waitForVisibility(myRASIIQFormPage.screenerIiqFormYouAreAlmostDoneText);
        CommonUtils.assertEqualsWithMessage(rASScreenerScenario1_Constants.YOU_ARE_ALMOST_DONE_TEXT, myRASIIQFormPage.screenerIiqFormYouAreAlmostDoneText.getText(), "-- VERIFYING YOU ARE ALMOST DONE TEXT --");
    }

    /***
     * USE THIS METHOD WILL COMPLETE THE RAS SURVEY SCENARIO 1
     */

    public void rasScreenerSurveyScenario1dataInitializer(String rasSurveySheet){
        testDataManagerScenario1.dataInitializerRasSurveyScenario1(rasSurveySheet);
    }
    public void rasScreenerSurveyScenario1partOne(){
        CommonUtils.waitForVisibility(myRASSurveyPage.rasSurveyThankYouForStartingText);
        CommonUtils.assertEqualsWithMessage(testDataManagerScenario1.thankYouForStartingTheRASSurveyAndFor,myRASSurveyPage.rasSurveyText.getText(), "-- VERIFYING THANK YOU FOR STARTING THE RAS SURVEY AND FOR YOUR TEXT --");
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.rasSurveyThisQuestionMayTakeText);
        CommonUtils.assertEqualsWithMessage(testDataManagerScenario1.thisQuestionnaireMayTakeYouSeveral,myRASSurveyPage.rasSurveyText.getText(), "-- VERIFYING THIS QUESTIONNAIRE MAY TAKE YOU SEVERAL HOURS TO COMPLETE TEXT --");
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.rasSurveyTheFirstBlockText);
        CommonUtils.assertEqualsWithMessage(testDataManagerScenario1.thisQuestionnaireMayTakeYouSeveral,myRASSurveyPage.rasSurveyText.getText(), "-- VERIFYING THE FIRST BLOCK OF QUESTIONS WILL COLLECT TEXT --");
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.toConfirmAreYouCompleting));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.toConfirmAreYouCompleting));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.toConfirmAreYouCompleting));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.haveYouEverBeenIncluded));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.haveYouEverBeenIncluded));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.haveYouEverBeenIncluded));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.rasSurveyPleaseProvideAnyAdditionalInformationTextBox);
        myRASSurveyPage.rasSurveyPleaseProvideAnyAdditionalInformationTextBox.clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.rasSurveyPleaseProvideAnyAdditionalInformationTextBox, testDataManagerScenario1.pleaseProvideAnyAdditionalInformation);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.rasSurveyTheNextSetOfQuestionsWillAskAboutBirthAndNeonatalText);
        CommonUtils.assertEqualsWithMessage(testDataManagerScenario1.theNextSetOfQuestionsWillAskAboutNeonatalHistory,myRASSurveyPage.rasSurveyText.getText(), "-- VERIFYING THE NEXT SET OF QUESTIONS WILL ASK ABOUT BIRTH AND NEONATAL  TEXT --");
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.pleaseCompleteYourBiologicalParentsBiologicalMotherCityTextBox);
        myRASSurveyPage.pleaseCompleteYourBiologicalParentsBiologicalMotherCityTextBox.clear();
        int momAgeDropdownIndex = Integer.valueOf(testDataManagerScenario1.pleaseCompleteYourBiologicalParentsBiologicalMotherAge) - 11;
        int fatherDropDownIndex = Integer.valueOf(testDataManagerScenario1.pleaseCompleteYourBiologicalParentsBiologicalFatherAge) - 11;
        CommonUtils.sendKeysToElement(myRASSurveyPage.pleaseCompleteYourBiologicalParentsBiologicalMotherCityTextBox, testDataManagerScenario1.pleaseCompleteYourBiologicalParentsBiologicalMotherCity);
        CommonUtils.clickOnElement(myRASSurveyPage.pleaseCompleteYourBiologicalParentsBiologicalMotherUnsureRadioButton);
        CommonUtils.selectDropDownValue(myRASSurveyPage.pleaseCompleteYourBiologicalParentsBiologicalMotherYearsDropDown, momAgeDropdownIndex);
        myRASSurveyPage.pleaseCompleteYourBiologicalParentsBiologicalFatherCityTextBox.clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.pleaseCompleteYourBiologicalParentsBiologicalFatherCityTextBox, testDataManagerScenario1.pleaseCompleteYourBiologicalParentsBiologicalFatherCity);
        CommonUtils.clickOnElement(myRASSurveyPage.pleaseCompleteYourBiologicalParentsBiologicalFatherUnsureRadioButton);
        CommonUtils.selectDropDownValue(myRASSurveyPage.pleaseCompleteYourBiologicalParentsBiologicalFatherYearsDropDown, fatherDropDownIndex);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.wereYouDiagnosedWithHypoglycemia));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.wereYouDiagnosedWithHypoglycemia));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.wereYouDiagnosedWithHypoglycemia));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.wereYouDiagnosedWithAnyOfTheFollowingDuringPregnancyOption1));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.wereYouDiagnosedWithAnyOfTheFollowingDuringPregnancyOption1));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.wereYouDiagnosedWithAnyOfTheFollowingDuringPregnancyOption2));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.wereYouDiagnosedWithAnyOfTheFollowingDuringPregnancyOption3));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.wereYouDiagnosedWithAnyOfTheFollowingDuringPregnancyOption4));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.wereYouDiagnosedWithAnyOfTheFollowingDuringPregnancyOption5));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.wereYouDiagnosedWithAnyOfTheFollowingDuringPregnancyOption6));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.wereYouDiagnosedWithAnyOfTheFollowingDuringPregnancyOption7));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.wereYouDiagnosedWithAnyOfTheFollowingDuringPregnancyOption1));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.wereYouDiagnosedWithAnyOfTheFollowingDuringPregnancyOption1));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.wereYouDiagnosedWithAnyOfTheFollowingDuringPregnancyOption2));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.wereYouDiagnosedWithAnyOfTheFollowingDuringPregnancyOption3));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.wereYouDiagnosedWithAnyOfTheFollowingDuringPregnancyOption4));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.wereYouDiagnosedWithAnyOfTheFollowingDuringPregnancyOption5));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.wereYouDiagnosedWithAnyOfTheFollowingDuringPregnancyOption6));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.wereYouDiagnosedWithAnyOfTheFollowingDuringPregnancyOption7));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.duringHerPregnancyWithYou));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.duringHerPregnancyWithYou));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.duringHerPregnancyWithYou));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        for(int i = 1;i < 9;i++){
            CommonUtils.clickOnElement(myRASSurveyPage.dynamicLocatorRadioButtonNormal("" + i));
        }
        myRASSurveyPage.pleaseIndicateTheResultsOfThePrenatalTestsOtherTextBox.clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.pleaseIndicateTheResultsOfThePrenatalTestsOtherTextBox, testDataManagerScenario1.pleaseIndicateTheResultsOfThePrenatalTestsOther);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.wasYourBiologicalMotherDiagnosedOption1));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.wasYourBiologicalMotherDiagnosedOption1));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.wasYourBiologicalMotherDiagnosedOption2));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.wasYourBiologicalMotherDiagnosedOption3));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.wasYourBiologicalMotherDiagnosedOption4));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.wasYourBiologicalMotherDiagnosedOption5));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.wasYourBiologicalMotherDiagnosedOption6));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.wasYourBiologicalMotherDiagnosedOption7));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.wasYourBiologicalMotherDiagnosedOption8));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.wasYourBiologicalMotherDiagnosedOption9));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.wasYourBiologicalMotherDiagnosedOption10));
        myRASSurveyPage.dynamicallyEnterTextInCheckMarkedTextBox(8).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.dynamicallyEnterTextInCheckMarkedTextBox(8), testDataManagerScenario1.wasYourBiologicalMotherDiagnosedOption8PleaseSpecify);
        myRASSurveyPage.dynamicallyEnterTextInCheckMarkedTextBox(9).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.dynamicallyEnterTextInCheckMarkedTextBox(9), testDataManagerScenario1.wasYourBiologicalMotherDiagnosedOption9PleaseSpecify);
        myRASSurveyPage.dynamicallyEnterTextInCheckMarkedTextBox(10).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.dynamicallyEnterTextInCheckMarkedTextBox(10), testDataManagerScenario1.wasYourBiologicalMotherDiagnosedOption10PleaseSpecify);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.duringHerPregnancyWithYouSupplements));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.duringHerPregnancyWithYouSupplements));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.duringHerPregnancyWithYouSupplements));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1. pleaseSelectAllMedicationsYourMotherTookOption1));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.pleaseSelectAllMedicationsYourMotherTookOption1));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.pleaseSelectAllMedicationsYourMotherTookOption2));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.pleaseSelectAllMedicationsYourMotherTookOption3));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.pleaseSelectAllMedicationsYourMotherTookOption4));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.pleaseSelectAllMedicationsYourMotherTookOption5));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.pleaseSelectAllMedicationsYourMotherTookOption6));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.pleaseSelectAllMedicationsYourMotherTookOption7));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.pleaseSelectAllMedicationsYourMotherTookOption8));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.pleaseSelectAllMedicationsYourMotherTookOption9));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.pleaseSelectAllMedicationsYourMotherTookOption10));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.pleaseSelectAllMedicationsYourMotherTookOption11));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.pleaseSelectAllMedicationsYourMotherTookOption12));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.pleaseSelectAllMedicationsYourMotherTookOption13));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.pleaseSelectAllMedicationsYourMotherTookOption14));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.pleaseSelectAllMedicationsYourMotherTookOption15));
        myRASSurveyPage.dynamicallyEnterTextInCheckMarkedTextBox(13).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.dynamicallyEnterTextInCheckMarkedTextBox(13), testDataManagerScenario1.pleaseSelectAllMedicationsYourMotherTookOption14PleaseSpecify);
        myRASSurveyPage.dynamicallyEnterTextInCheckMarkedTextBox(15).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.dynamicallyEnterTextInCheckMarkedTextBox(15), testDataManagerScenario1.pleaseSelectAllMedicationsYourMotherTookOption15PleaseSpecify);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        MiscUtils.sleep(2000);
        String[] column1Values = {testDataManagerScenario1.pleaseProvideDetailsOfTheMedicationTakenColumn1Option1,
                testDataManagerScenario1.pleaseProvideDetailsOfTheMedicationTakenColumn1Option2,
                testDataManagerScenario1.pleaseProvideDetailsOfTheMedicationTakenColumn1Option3,
                testDataManagerScenario1.pleaseProvideDetailsOfTheMedicationTakenColumn1Option4,
                testDataManagerScenario1.pleaseProvideDetailsOfTheMedicationTakenColumn1Option5,
                testDataManagerScenario1.pleaseProvideDetailsOfTheMedicationTakenColumn1Option6,
                testDataManagerScenario1.pleaseProvideDetailsOfTheMedicationTakenColumn1Option7,
                testDataManagerScenario1.pleaseProvideDetailsOfTheMedicationTakenColumn1Option8,
                testDataManagerScenario1.pleaseProvideDetailsOfTheMedicationTakenColumn1Option9,
                testDataManagerScenario1.pleaseProvideDetailsOfTheMedicationTakenColumn1Option10,
                testDataManagerScenario1.pleaseProvideDetailsOfTheMedicationTakenColumn1Option11,
                testDataManagerScenario1.pleaseProvideDetailsOfTheMedicationTakenColumn1Option12,
                testDataManagerScenario1.pleaseProvideDetailsOfTheMedicationTakenColumn1Option13,
                testDataManagerScenario1.pleaseProvideDetailsOfTheMedicationTakenColumn1Option14,
                testDataManagerScenario1.pleaseProvideDetailsOfTheMedicationTakenColumn1Option15};
        for(int j = 1;j < 16;j++){
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(j, 3).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(j, 3),column1Values[j-1]);
        }
        String[] column2Values = {testDataManagerScenario1.pleaseProvideDetailsOfTheMedicationTakenColumn2Option1,
                testDataManagerScenario1.pleaseProvideDetailsOfTheMedicationTakenColumn2Option2,
                testDataManagerScenario1.pleaseProvideDetailsOfTheMedicationTakenColumn2Option3,
                testDataManagerScenario1.pleaseProvideDetailsOfTheMedicationTakenColumn2Option4,
                testDataManagerScenario1.pleaseProvideDetailsOfTheMedicationTakenColumn2Option5,
                testDataManagerScenario1.pleaseProvideDetailsOfTheMedicationTakenColumn2Option6,
                testDataManagerScenario1.pleaseProvideDetailsOfTheMedicationTakenColumn2Option7,
                testDataManagerScenario1.pleaseProvideDetailsOfTheMedicationTakenColumn2Option8,
                testDataManagerScenario1.pleaseProvideDetailsOfTheMedicationTakenColumn2Option9,
                testDataManagerScenario1.pleaseProvideDetailsOfTheMedicationTakenColumn2Option10,
                testDataManagerScenario1.pleaseProvideDetailsOfTheMedicationTakenColumn2Option11,
                testDataManagerScenario1.pleaseProvideDetailsOfTheMedicationTakenColumn2Option12,
                testDataManagerScenario1.pleaseProvideDetailsOfTheMedicationTakenColumn2Option13,
                testDataManagerScenario1.pleaseProvideDetailsOfTheMedicationTakenColumn2Option14,
                testDataManagerScenario1.pleaseProvideDetailsOfTheMedicationTakenColumn2Option15};
        for(int a = 1; a < 16; a++){
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(a, 6).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(a, 6),column2Values[a-1]);
        }
        String[] dropDownValues = {testDataManagerScenario1.pleaseProvideDetailsOfTheMedicationTakenDROPDOWNOption1,
                testDataManagerScenario1.pleaseProvideDetailsOfTheMedicationTakenDROPDOWNOption2,
                testDataManagerScenario1.pleaseProvideDetailsOfTheMedicationTakenDROPDOWNOption3,
                testDataManagerScenario1.pleaseProvideDetailsOfTheMedicationTakenDROPDOWNOption4,
                testDataManagerScenario1.pleaseProvideDetailsOfTheMedicationTakenDROPDOWNOption5,
                testDataManagerScenario1.pleaseProvideDetailsOfTheMedicationTakenDROPDOWNOption6,
                testDataManagerScenario1.pleaseProvideDetailsOfTheMedicationTakenDROPDOWNOption7,
                testDataManagerScenario1.pleaseProvideDetailsOfTheMedicationTakenDROPDOWNOption8,
                testDataManagerScenario1.pleaseProvideDetailsOfTheMedicationTakenDROPDOWNOption9,
                testDataManagerScenario1.pleaseProvideDetailsOfTheMedicationTakenDROPDOWNOption10,
                testDataManagerScenario1.pleaseProvideDetailsOfTheMedicationTakenDROPDOWNOption11,
                testDataManagerScenario1.pleaseProvideDetailsOfTheMedicationTakenDROPDOWNOption12,
                testDataManagerScenario1.pleaseProvideDetailsOfTheMedicationTakenDROPDOWNOption13,
                testDataManagerScenario1.pleaseProvideDetailsOfTheMedicationTakenDROPDOWNOption14,
                testDataManagerScenario1.pleaseProvideDetailsOfTheMedicationTakenDROPDOWNOption15,};
        for(int b = 1; b < 16; b++){
            CommonUtils.selectDropDownValue(dropDownValues[b-1],myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationdropDown(b));
        }
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.didYourBiologicalMotherUseAnyTobacco));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.didYourBiologicalMotherUseAnyTobacco));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.didYourBiologicalMotherUseAnyTobacco));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.whatTobaccoProductsDidYourBiologicalMotherOption1));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.whatTobaccoProductsDidYourBiologicalMotherOption1));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.whatTobaccoProductsDidYourBiologicalMotherOption2));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.whatTobaccoProductsDidYourBiologicalMotherOption3));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.whatTobaccoProductsDidYourBiologicalMotherOption4));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.whatTobaccoProductsDidYourBiologicalMotherOption5));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.whatTobaccoProductsDidYourBiologicalMotherOption6));
        myRASSurveyPage.otherPleaseSpecifyTextBox.clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.otherPleaseSpecifyTextBox, testDataManagerScenario1.whatTobaccoProductsDidYourBiologicalMotherOption6PleaseSpecify);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.didYourBiologicalMotherUseAnyVaping));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.didYourBiologicalMotherUseAnyVaping));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.didYourBiologicalMotherUseAnyVaping));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.whichVapingProductsDidYourMotherUseOption1));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.whichVapingProductsDidYourMotherUseOption1));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.whichVapingProductsDidYourMotherUseOption2));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.whichVapingProductsDidYourMotherUseOption3));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.whichVapingProductsDidYourMotherUseOption4));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.whichVapingProductsDidYourMotherUseOption5));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.whichVapingProductsDidYourMotherUseOption6));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.whichVapingProductsDidYourMotherUseOption7));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.whichVapingProductsDidYourMotherUseOption8));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.whichVapingProductsDidYourMotherUseOption9));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.whichVapingProductsDidYourMotherUseOption10));
        myRASSurveyPage.otherPleaseSpecifyTextBox.clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.otherPleaseSpecifyTextBox, testDataManagerScenario1.whichVapingProductsDidYourMotherUseOption10PleaseSpecify);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.didYourBiologicalMotherDrink));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.didYourBiologicalMotherDrink));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.didYourBiologicalMotherDrink));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.WhatAlcoholicBeveragesDidYourMotherDrinkOption1));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.WhatAlcoholicBeveragesDidYourMotherDrinkOption1));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.WhatAlcoholicBeveragesDidYourMotherDrinkOption2));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.WhatAlcoholicBeveragesDidYourMotherDrinkOption3));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.WhatAlcoholicBeveragesDidYourMotherDrinkOption4));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.WhatAlcoholicBeveragesDidYourMotherDrinkOption5));
        myRASSurveyPage.otherPleaseSpecifyTextBox.clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.otherPleaseSpecifyTextBox, testDataManagerScenario1.WhatAlcoholicBeveragesDidYourMotherDrinkOption5Other);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.didYourBiologicalMotherUseAnyRecreationalDrugs));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.didYourBiologicalMotherUseAnyRecreationalDrugs));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.didYourBiologicalMotherUseAnyRecreationalDrugs));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.whatRecreationalDrugOption1));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.whatRecreationalDrugOption1));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.whatRecreationalDrugOption2));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.whatRecreationalDrugOption3));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.whatRecreationalDrugOption4));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.whatRecreationalDrugOption5));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.whatRecreationalDrugOption6));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.whatRecreationalDrugOption7));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.whatRecreationalDrugOption8));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.whatRecreationalDrugOption9));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.whatRecreationalDrugOption10));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.whatRecreationalDrugOption11));
        myRASSurveyPage.otherPleaseSpecifyTextBox.clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.otherPleaseSpecifyTextBox, testDataManagerScenario1.whatRecreationalDrugOption11Other);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.didYourBiologicalMotherEverLiveWhereSmokedCigarettes));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.didYourBiologicalMotherEverLiveWhereSmokedCigarettes));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.didYourBiologicalMotherEverLiveWhereSmokedCigarettes));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.whatProductsWereUsedAroundOption1));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.whatProductsWereUsedAroundOption1));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.whatProductsWereUsedAroundOption2));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.whatProductsWereUsedAroundOption3));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.whatProductsWereUsedAroundOption4));
        myRASSurveyPage.otherPleaseSpecifyTextBox.clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.otherPleaseSpecifyTextBox, testDataManagerScenario1.whatProductsWereUsedAroundOption4Other);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3));
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3),testDataManagerScenario1.biologicalMotherOccupationDuringPregnancy);
        JavascriptUtils.clickByJS(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(1, 6));
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 3),testDataManagerScenario1.biologicalMotherOccupationDuringPregnancyFather);
        JavascriptUtils.clickByJS(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(2, 6));
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.whatIsTheHeightOfYourBiologicalMotherAndFatherText);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3),testDataManagerScenario1.whatIsTheHeightOfYourBiologicalMother);
        JavascriptUtils.clickByJS(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(1, 6));
        JavascriptUtils.clickByJS(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(1, 10));
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 3),testDataManagerScenario1.whatIsTheHeightOfYourBiologicalFather);
        JavascriptUtils.clickByJS(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(2, 6));
        JavascriptUtils.clickByJS(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(2, 10));
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.rasSurveyTheNextSetOfQuestionsWillAskAboutHormoneRelatedGrowthText);
        CommonUtils.assertEqualsWithMessage(testDataManagerScenario1.theNextSetHormoneRelatedGrowth,myRASSurveyPage.rasSurveyText.getText(), "-- VERIFYING THE NEXT SET OF QUESTIONS WILL ASK ABOUT HORMONE RELATED GROWTH TEXT --");
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
    }

    public void rasScreenerSurveyScenario1partTwo(){
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.haveYouEverBeenEvaluatedByAnEndocrinologist));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.haveYouEverBeenEvaluatedByAnEndocrinologist));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.haveYouEverBeenEvaluatedByAnEndocrinologist));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.enterTextInDoctorLocationHospitalTextBox(1));
        myRASSurveyPage.enterTextInDoctorLocationHospitalTextBox(1).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInDoctorLocationHospitalTextBox(1),testDataManagerScenario1.whatIsTheNameOfTheEndocrinologistDoctor);
        myRASSurveyPage.enterTextInDoctorLocationHospitalTextBox(2).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInDoctorLocationHospitalTextBox(2),testDataManagerScenario1.whatIsTheNameOfTheEndocrinologistLocation);
        myRASSurveyPage.enterTextInDoctorLocationHospitalTextBox(3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInDoctorLocationHospitalTextBox(3),testDataManagerScenario1.whatIsTheNameOfTheEndocrinologistHospital);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.haveYouEverHadGrowthHormoneTesting));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.haveYouEverHadGrowthHormoneTesting));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.haveYouEverHadGrowthHormoneTesting));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.whatWereTheResultsOfYourGrowthHormoneOption1));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.whatWereTheResultsOfYourGrowthHormoneOption1));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.whatWereTheResultsOfYourGrowthHormoneOption2));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.whatWereTheResultsOfYourGrowthHormoneOption3));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.whatWereTheResultsOfYourGrowthHormoneOption4));
        myRASSurveyPage.otherPleaseSpecifyTextBox.clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.otherPleaseSpecifyTextBox, testDataManagerScenario1.whatWereTheResultsOfYourGrowthHormoneOption4Other);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.haveYouEverReceivedGrowthHormoneTreatment));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.haveYouEverReceivedGrowthHormoneTreatment));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.haveYouEverReceivedGrowthHormoneTreatment));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.whatWasYourHeightBeforeStartingGrowthHormone));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.whatWasYourHeightBeforeStartingGrowthHormone));
        myRASSurveyPage.whatWasYourHeightBeforeStartingGrowthHormoneHeightTextBox.clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.whatWasYourHeightBeforeStartingGrowthHormoneHeightTextBox, testDataManagerScenario1.whatWasYourHeightBeforeStartingGrowthHormoneHeight);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.howManyTimesHaveYouReceivedGrowthHormoneTreatmentDropDown);
        CommonUtils.selectDropDownValue(testDataManagerScenario1.howManyTimesHaveYouReceivedGrowthHormoneTreatment,myRASSurveyPage.howManyTimesHaveYouReceivedGrowthHormoneTreatmentDropDown);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3));
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3),testDataManagerScenario1.pleaseProvideTheDetailsOfGrowthHormoneReplacementAgeStart);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 4).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 4),testDataManagerScenario1.pleaseProvideTheDetailsOfGrowthHormoneReplacementAgeStopped);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 7).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 7),testDataManagerScenario1.pleaseProvideTheDetailsOfGrowthHormoneReplacementDateStart);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 8).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 8),testDataManagerScenario1.pleaseProvideTheDetailsOfGrowthHormoneReplacementDateStopped);
        JavascriptUtils.clickByJS(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(1, 11));
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.theNextSetOfQuestionsWillAskAboutDevelopmentText);
        CommonUtils.assertEqualsWithMessage(testDataManagerScenario1.theNextSetOfQuestionsWillAskAboutDevelopment,myRASSurveyPage.rasSurveyText.getText(), "-- VERIFYING THE NEXT SET OF QUESTIONS WILL ASK ABOUT DEVELOPMENT TEXT --");
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.wereYouEverDiagnosedWithHypotoniaAsAnInfantOrChild));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.wereYouEverDiagnosedWithHypotoniaAsAnInfantOrChild));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.wereYouEverDiagnosedWithHypotoniaAsAnInfantOrChild));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.atWhatAgeWereYouAbleToSitWithoutSupport));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.atWhatAgeWereYouAbleToSitWithoutSupport));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.atWhatAgeWereYouAbleToSitWithoutSupport));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.atWhatAgeWereYouAbleToWalkWithoutSupportText);
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.atWhatAgeWereYouAbleToWalkWithoutSupport));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.haveYouEverReceivedPhysicalTherapy));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.haveYouEverReceivedPhysicalTherapy));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.haveYouEverReceivedPhysicalTherapy));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.atWhatAgeWereYouAbleToUseSimpleTwoWordPhrases));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.atWhatAgeWereYouAbleToUseSimpleTwoWordPhrases));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.atWhatAgeWereYouAbleToUseSimpleTwoWordPhrases));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.howWouldYouDescribeYourCurrentSpeechCapabilities));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.howWouldYouDescribeYourCurrentSpeechCapabilities));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.howWouldYouDescribeYourCurrentSpeechCapabilities));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.haveYouEverReceivedSpeechTherapy));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.haveYouEverReceivedSpeechTherapy));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.haveYouEverReceivedSpeechTherapy));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.betweenTheAgesOf3And6YearsOld));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.betweenTheAgesOf3And6YearsOld));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.betweenTheAgesOf3And6YearsOld));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.didYouReceiveOccupationalTherapyBetween3And6YearsOfAge));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.didYouReceiveOccupationalTherapyBetween3And6YearsOfAge));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.didYouReceiveOccupationalTherapyBetween3And6YearsOfAge));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.betweenTheAgesOf6And10));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.betweenTheAgesOf6And10));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.betweenTheAgesOf6And10));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.betweenTheAgesOf10And17));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.betweenTheAgesOf10And17));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.betweenTheAgesOf10And17));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.pleaseIndicateTheHighestDegree));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.pleaseIndicateTheHighestDegree));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.pleaseIndicateTheHighestDegree));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.whatIsYourCurrentEmploymentStatus));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.whatIsYourCurrentEmploymentStatus));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.whatIsYourCurrentEmploymentStatus));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.haveYouEverBeenDiagnosedWithLearningDifferencesOption1));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.haveYouEverBeenDiagnosedWithLearningDifferencesOption1));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.haveYouEverBeenDiagnosedWithLearningDifferencesOption2));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.haveYouEverBeenDiagnosedWithLearningDifferencesOption3));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.haveYouEverBeenDiagnosedWithLearningDifferencesOption4));
        myRASSurveyPage.otherPleaseSpecifyTextBox.clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.otherPleaseSpecifyTextBox, testDataManagerScenario1.haveYouEverBeenDiagnosedWithLearningDifferencesOption4Other);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
    }

    public void rasScreenerSurveyScenario1partThree() {
//        CommonUtils.sendKeys(myRASSurveyPage.rasSurveyAffFile,COVIDConstants.IIQ_STUDY_DOCUMENTATION_PDF_PATH);
//        MiscUtils.sleep(2000);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.theNextSetOfQuestionsWillAskAboutHeartText);
        CommonUtils.assertEqualsWithMessage(testDataManagerScenario1.theNextSetOfQuestionsWillAskAboutHeart, myRASSurveyPage.rasSurveyText.getText(), "-- VERIFYING THE NEXT SET OF QUESTIONS WILL ASK ABOUT HEART TEXT --");
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.haveYouEverBeenEvaluatedByACardiologist));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.haveYouEverBeenEvaluatedByACardiologist));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.haveYouEverBeenEvaluatedByACardiologist));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.enterTextInDoctorLocationHospitalTextBox(1));
        myRASSurveyPage.enterTextInDoctorLocationHospitalTextBox(1).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInDoctorLocationHospitalTextBox(1), testDataManagerScenario1.whatIsTheNameOfTheCardiologistDoctor);
        myRASSurveyPage.enterTextInDoctorLocationHospitalTextBox(2).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInDoctorLocationHospitalTextBox(2), testDataManagerScenario1.whatIsTheNameOfTheCardiologistLocation);
        myRASSurveyPage.enterTextInDoctorLocationHospitalTextBox(3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInDoctorLocationHospitalTextBox(3), testDataManagerScenario1.whatIsTheNameOfTheCardiologistHospital);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.haveYouEverBeenDiagnosedWithAnyStructuralHeartIssues));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.haveYouEverBeenDiagnosedWithAnyStructuralHeartIssues));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.haveYouEverBeenDiagnosedWithAnyStructuralHeartIssues));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForClickability(myRASSurveyPage.pulmonaryValveButton);
        JavascriptUtils.clickByJS(myRASSurveyPage.pulmonaryValveButton);
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.haveYouEverBeenDiagnosedWithAnyOfTheFollowingStructuralHeartIssuesOption2));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.haveYouEverBeenDiagnosedWithAnyOfTheFollowingStructuralHeartIssuesOption3));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.haveYouEverBeenDiagnosedWithAnyOfTheFollowingStructuralHeartIssuesOption4));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.haveYouEverBeenDiagnosedWithAnyOfTheFollowingStructuralHeartIssuesOption5));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.haveYouEverBeenDiagnosedWithAnyOfTheFollowingStructuralHeartIssuesOption6));
        myRASSurveyPage.otherPleaseSpecifyTextBox.clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.otherPleaseSpecifyTextBox, testDataManagerScenario1.haveYouEverBeenDiagnosedWithAnyOfTheFollowingStructuralHeartIssuesOption6Other);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.haveYouEverHadAnyOfTheFollowingSymptomsOption1));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.haveYouEverHadAnyOfTheFollowingSymptomsOption1));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.haveYouEverHadAnyOfTheFollowingSymptomsOption2));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.haveYouEverHadAnyOfTheFollowingSymptomsOption3));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.haveYouEverHadAnyOfTheFollowingSymptomsOption4));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.haveYouEverHadAnyOfTheFollowingSymptomsOption5));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.haveYouEverHadAnyOfTheFollowingSymptomsOption6));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.haveYouEverHadAnyOfTheFollowingSymptomsOption7));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.haveYouEverHadAnyOfTheFollowingSymptomsOption8));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.haveYouEverHadAnyOfTheFollowingSymptomsOption9));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.haveYouEverHadAnyOfTheFollowingSymptomsOption10));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.haveYouEverHadAnyOfTheFollowingSymptomsOption11));
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        String[] column1Value = {testDataManagerScenario1.pleaseProvideInformationForTheFIRSTTreatmentColumn1Option1,
                testDataManagerScenario1.pleaseProvideInformationForTheFIRSTTreatmentColumn1Option2,
                testDataManagerScenario1.pleaseProvideInformationForTheFIRSTTreatmentColumn1Option3,
                testDataManagerScenario1.pleaseProvideInformationForTheFIRSTTreatmentColumn1Option4,
                testDataManagerScenario1.pleaseProvideInformationForTheFIRSTTreatmentColumn1Option5,
                testDataManagerScenario1.pleaseProvideInformationForTheFIRSTTreatmentColumn1Option6,
                testDataManagerScenario1.pleaseProvideInformationForTheFIRSTTreatmentColumn1Option7,
                testDataManagerScenario1.pleaseProvideInformationForTheFIRSTTreatmentColumn1Option8,
                testDataManagerScenario1.pleaseProvideInformationForTheFIRSTTreatmentColumn1Option9,
                testDataManagerScenario1.pleaseProvideInformationForTheFIRSTTreatmentColumn1Option10,
                testDataManagerScenario1.pleaseProvideInformationForTheFIRSTTreatmentColumn1Option11};
        for (int c = 1; c < 12; c++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(c, 3).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(c, 3), column1Value[c - 1]);
        }
        String[] column2Value = {testDataManagerScenario1.pleaseProvideInformationForTheFIRSTTreatmentColumn2Option1,
                testDataManagerScenario1.pleaseProvideInformationForTheFIRSTTreatmentColumn2Option2,
                testDataManagerScenario1.pleaseProvideInformationForTheFIRSTTreatmentColumn2Option3,
                testDataManagerScenario1.pleaseProvideInformationForTheFIRSTTreatmentColumn2Option4,
                testDataManagerScenario1.pleaseProvideInformationForTheFIRSTTreatmentColumn2Option5,
                testDataManagerScenario1.pleaseProvideInformationForTheFIRSTTreatmentColumn2Option6,
                testDataManagerScenario1.pleaseProvideInformationForTheFIRSTTreatmentColumn2Option7,
                testDataManagerScenario1.pleaseProvideInformationForTheFIRSTTreatmentColumn2Option8,
                testDataManagerScenario1.pleaseProvideInformationForTheFIRSTTreatmentColumn2Option9,
                testDataManagerScenario1.pleaseProvideInformationForTheFIRSTTreatmentColumn2Option10,
                testDataManagerScenario1.pleaseProvideInformationForTheFIRSTTreatmentColumn2Option11};
        for (int d = 1; d < 12; d++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(d, 4).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(d, 4), column2Value[d - 1]);
        }
        String[] column3Value = {testDataManagerScenario1.pleaseProvideInformationForTheFIRSTTreatmentColumn3Option1,
                testDataManagerScenario1.pleaseProvideInformationForTheFIRSTTreatmentColumn3Option2,
                testDataManagerScenario1.pleaseProvideInformationForTheFIRSTTreatmentColumn3Option3,
                testDataManagerScenario1.pleaseProvideInformationForTheFIRSTTreatmentColumn3Option4,
                testDataManagerScenario1.pleaseProvideInformationForTheFIRSTTreatmentColumn3Option5,
                testDataManagerScenario1.pleaseProvideInformationForTheFIRSTTreatmentColumn3Option6,
                testDataManagerScenario1.pleaseProvideInformationForTheFIRSTTreatmentColumn3Option7,
                testDataManagerScenario1.pleaseProvideInformationForTheFIRSTTreatmentColumn3Option8,
                testDataManagerScenario1.pleaseProvideInformationForTheFIRSTTreatmentColumn3Option9,
                testDataManagerScenario1.pleaseProvideInformationForTheFIRSTTreatmentColumn3Option10,
                testDataManagerScenario1.pleaseProvideInformationForTheFIRSTTreatmentColumn3Option11};
        for (int e = 1; e < 12; e++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(e, 5).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(e, 5), column3Value[e - 1]);
        }
        String[] column4Value = {testDataManagerScenario1.pleaseProvideInformationForTheFIRSTTreatmentColumn4Option1,
                testDataManagerScenario1.pleaseProvideInformationForTheFIRSTTreatmentColumn4Option2,
                testDataManagerScenario1.pleaseProvideInformationForTheFIRSTTreatmentColumn4Option3,
                testDataManagerScenario1.pleaseProvideInformationForTheFIRSTTreatmentColumn4Option4,
                testDataManagerScenario1.pleaseProvideInformationForTheFIRSTTreatmentColumn4Option5,
                testDataManagerScenario1.pleaseProvideInformationForTheFIRSTTreatmentColumn4Option6,
                testDataManagerScenario1.pleaseProvideInformationForTheFIRSTTreatmentColumn4Option7,
                testDataManagerScenario1.pleaseProvideInformationForTheFIRSTTreatmentColumn4Option8,
                testDataManagerScenario1.pleaseProvideInformationForTheFIRSTTreatmentColumn4Option9,
                testDataManagerScenario1.pleaseProvideInformationForTheFIRSTTreatmentColumn4Option10,
                testDataManagerScenario1.pleaseProvideInformationForTheFIRSTTreatmentColumn4Option11};
        for (int f = 1; f < 12; f++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(f, 8).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(f, 8), column4Value[f - 1]);
        }
        String[] column5Value = {testDataManagerScenario1.pleaseProvideInformationForTheFIRSTTreatmentColumn5Option1,
                testDataManagerScenario1.pleaseProvideInformationForTheFIRSTTreatmentColumn5Option2,
                testDataManagerScenario1.pleaseProvideInformationForTheFIRSTTreatmentColumn5Option3,
                testDataManagerScenario1.pleaseProvideInformationForTheFIRSTTreatmentColumn5Option4,
                testDataManagerScenario1.pleaseProvideInformationForTheFIRSTTreatmentColumn5Option5,
                testDataManagerScenario1.pleaseProvideInformationForTheFIRSTTreatmentColumn5Option6,
                testDataManagerScenario1.pleaseProvideInformationForTheFIRSTTreatmentColumn5Option7,
                testDataManagerScenario1.pleaseProvideInformationForTheFIRSTTreatmentColumn5Option8,
                testDataManagerScenario1.pleaseProvideInformationForTheFIRSTTreatmentColumn5Option9,
                testDataManagerScenario1.pleaseProvideInformationForTheFIRSTTreatmentColumn5Option10,
                testDataManagerScenario1.pleaseProvideInformationForTheFIRSTTreatmentColumn5Option11};
        for (int g = 1; g < 12; g++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(g, 11).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(g, 11), column5Value[g - 1]);
        }
        String[] column6Value = {testDataManagerScenario1.pleaseProvideInformationForTheFIRSTTreatmentColumn6Option1,
                testDataManagerScenario1.pleaseProvideInformationForTheFIRSTTreatmentColumn6Option2,
                testDataManagerScenario1.pleaseProvideInformationForTheFIRSTTreatmentColumn6Option3,
                testDataManagerScenario1.pleaseProvideInformationForTheFIRSTTreatmentColumn6Option4,
                testDataManagerScenario1.pleaseProvideInformationForTheFIRSTTreatmentColumn6Option5,
                testDataManagerScenario1.pleaseProvideInformationForTheFIRSTTreatmentColumn6Option6,
                testDataManagerScenario1.pleaseProvideInformationForTheFIRSTTreatmentColumn6Option7,
                testDataManagerScenario1.pleaseProvideInformationForTheFIRSTTreatmentColumn6Option8,
                testDataManagerScenario1.pleaseProvideInformationForTheFIRSTTreatmentColumn6Option9,
                testDataManagerScenario1.pleaseProvideInformationForTheFIRSTTreatmentColumn6Option10,
                testDataManagerScenario1.pleaseProvideInformationForTheFIRSTTreatmentColumn6Option11};
        for (int h = 1; h < 12; h++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(h, 12).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(h, 12), column6Value[h - 1]);
        }
        String[] column7Value = {testDataManagerScenario1.pleaseProvideInformationForTheFIRSTTreatmentColumn7Option1,
                testDataManagerScenario1.pleaseProvideInformationForTheFIRSTTreatmentColumn7Option2,
                testDataManagerScenario1.pleaseProvideInformationForTheFIRSTTreatmentColumn7Option3,
                testDataManagerScenario1.pleaseProvideInformationForTheFIRSTTreatmentColumn7Option4,
                testDataManagerScenario1.pleaseProvideInformationForTheFIRSTTreatmentColumn7Option5,
                testDataManagerScenario1.pleaseProvideInformationForTheFIRSTTreatmentColumn7Option6,
                testDataManagerScenario1.pleaseProvideInformationForTheFIRSTTreatmentColumn7Option7,
                testDataManagerScenario1.pleaseProvideInformationForTheFIRSTTreatmentColumn7Option8,
                testDataManagerScenario1.pleaseProvideInformationForTheFIRSTTreatmentColumn7Option9,
                testDataManagerScenario1.pleaseProvideInformationForTheFIRSTTreatmentColumn7Option10,
                testDataManagerScenario1.pleaseProvideInformationForTheFIRSTTreatmentColumn7Option11};
        for (int k = 1; k < 12; k++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(k, 13).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(k, 13), column7Value[k - 1]);
        }
        String[] column8Value = {testDataManagerScenario1.pleaseProvideInformationForTheFIRSTTreatmentColumn8Option1,
                testDataManagerScenario1.pleaseProvideInformationForTheFIRSTTreatmentColumn8Option2,
                testDataManagerScenario1.pleaseProvideInformationForTheFIRSTTreatmentColumn8Option3,
                testDataManagerScenario1.pleaseProvideInformationForTheFIRSTTreatmentColumn8Option4,
                testDataManagerScenario1.pleaseProvideInformationForTheFIRSTTreatmentColumn8Option5,
                testDataManagerScenario1.pleaseProvideInformationForTheFIRSTTreatmentColumn8Option6,
                testDataManagerScenario1.pleaseProvideInformationForTheFIRSTTreatmentColumn8Option7,
                testDataManagerScenario1.pleaseProvideInformationForTheFIRSTTreatmentColumn8Option8,
                testDataManagerScenario1.pleaseProvideInformationForTheFIRSTTreatmentColumn8Option9,
                testDataManagerScenario1.pleaseProvideInformationForTheFIRSTTreatmentColumn8Option10,
                testDataManagerScenario1.pleaseProvideInformationForTheFIRSTTreatmentColumn8Option11};
        for (int l = 1; l < 12; l++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(l, 16).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(l, 16), column8Value[l - 1]);
        }
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.haveYouEverReceivedTreatmentForHeartProblems));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.haveYouEverReceivedTreatmentForHeartProblems));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.haveYouEverReceivedTreatmentForHeartProblems));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.haveYouEverHadAnyOfTheFollowingTreatmentsForHeartOption1));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.haveYouEverHadAnyOfTheFollowingTreatmentsForHeartOption1));
        JavascriptUtils.clickByJS(myRASSurveyPage.catheterInterventionTextBox);
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.haveYouEverHadAnyOfTheFollowingTreatmentsForHeartOption3));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.haveYouEverHadAnyOfTheFollowingTreatmentsForHeartOption4));
        myRASSurveyPage.otherPleaseSpecifyTextBox.clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.otherPleaseSpecifyTextBox, testDataManagerScenario1.haveYouEverHadAnyOfTheFollowingTreatmentsForHeartOption4Specify);
        CommonUtils.sendKeysToElement(myRASSurveyPage.medicationPleaseSpecifyTextBox, testDataManagerScenario1.haveYouEverHadAnyOfTheFollowingTreatmentsForHeartOption1Specify);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForClickability(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3));
        String[] column1ValueFirstTreatment = {testDataManagerScenario1.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn1Option1,
                testDataManagerScenario1.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn1Option2,
                testDataManagerScenario1.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn1Option3,
                testDataManagerScenario1.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn1Option4};
        for (int m = 1; m < 5; m++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(m, 3).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(m, 3), column1ValueFirstTreatment[m - 1]);
        }
        String[] column2ValueFirstTreatment = {testDataManagerScenario1.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn2Option1,
                testDataManagerScenario1.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn2Option2,
                testDataManagerScenario1.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn2Option3,
                testDataManagerScenario1.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn2Option4};
        for (int n = 1; n < 5; n++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(n, 4).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(n, 4), column2ValueFirstTreatment[n - 1]);
        }
        String[] column3ValueFirstTreatment = {testDataManagerScenario1.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn3Option1,
                testDataManagerScenario1.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn3Option2,
                testDataManagerScenario1.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn3Option3,
                testDataManagerScenario1.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn3Option4};
        for (int o = 1; o < 5; o++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(o, 5).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(o, 5), column3ValueFirstTreatment[o - 1]);
        }
        String[] column4ValueFirstTreatment = {testDataManagerScenario1.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn4Option1,
                testDataManagerScenario1.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn4Option2,
                testDataManagerScenario1.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn4Option3,
                testDataManagerScenario1.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn4Option4};
        for (int p = 1; p < 5; p++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(p, 8).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(p, 8), column4ValueFirstTreatment[p - 1]);
        }
        String[] column5ValueFirstTreatment = {testDataManagerScenario1.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn5Option1,
                testDataManagerScenario1.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn5Option2,
                testDataManagerScenario1.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn5Option3,
                testDataManagerScenario1.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn5Option4};
        for (int q = 1; q < 5; q++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(q, 11).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(q, 11), column5ValueFirstTreatment[q - 1]);
        }
        String[] column6ValueFirstTreatment = {testDataManagerScenario1.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn6Option1,
                testDataManagerScenario1.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn6Option2,
                testDataManagerScenario1.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn6Option3,
                testDataManagerScenario1.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn6Option4};
        for (int r = 1; r < 5; r++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(r, 12).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(r, 12), column6ValueFirstTreatment[r - 1]);
        }
        String[] column7ValueFirstTreatment = {testDataManagerScenario1.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn7Option1,
                testDataManagerScenario1.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn7Option2,
                testDataManagerScenario1.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn7Option3,
                testDataManagerScenario1.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn7Option4};
        for (int s = 1; s < 5; s++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(s, 13).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(s, 13), column7ValueFirstTreatment[s - 1]);
        }
        String[] column8ValueFirstTreatment = {testDataManagerScenario1.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn8Option1,
                testDataManagerScenario1.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn8Option2,
                testDataManagerScenario1.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn8Option3,
                testDataManagerScenario1.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn8Option4};
        for (int t = 1; t < 5; t++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(t, 16).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(t, 16), column8ValueFirstTreatment[t - 1]);
        }
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.areYouStillOn));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.areYouStillOn));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.areYouStillOn));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.haveYouEverBeenDiagnosedWithAnyFunctionalHeartIssues));
        CommonUtils.waitForVisibility(myRASSurveyPage.haveYouEverBeenDiagnosedWithAnyFunctionalHeartIssueText);
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.haveYouEverBeenDiagnosedWithAnyFunctionalHeartIssues));
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.haveYouEverBeenDiagnosedOption1CheckBox);
        JavascriptUtils.clickByJS(myRASSurveyPage.haveYouEverBeenDiagnosedOption2CheckBox);
        JavascriptUtils.clickByJS(myRASSurveyPage.haveYouEverBeenDiagnosedOption3CheckBox);
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManagerScenario1.haveYouEverBeenDiagnosedWithAnyFunctionalHeartIssuesOption4));
        myRASSurveyPage.otherPleaseSpecifyTextBox.clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.otherPleaseSpecifyTextBox, testDataManagerScenario1.haveYouEverBeenDiagnosedWithAnyFunctionalHeartIssuesOption4Other);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForClickability(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3));
        String[] column1ValueConditions = {testDataManagerScenario1.pleaseProvideAnyDetailsKnownForTheConditionsColumn1Option1,
                testDataManagerScenario1.pleaseProvideAnyDetailsKnownForTheConditionsColumn1Option2,
                testDataManagerScenario1.pleaseProvideAnyDetailsKnownForTheConditionsColumn1Option3,
                testDataManagerScenario1.pleaseProvideAnyDetailsKnownForTheConditionsColumn1Option4};
        for (int mm = 1; mm < 5; mm++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(mm, 3).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(mm, 3), column1ValueConditions[mm - 1]);
        }
        String[] column2ValueConditions = {testDataManagerScenario1.pleaseProvideAnyDetailsKnownForTheConditionsColumn2Option1,
                testDataManagerScenario1.pleaseProvideAnyDetailsKnownForTheConditionsColumn2Option2,
                testDataManagerScenario1.pleaseProvideAnyDetailsKnownForTheConditionsColumn2Option3,
                testDataManagerScenario1.pleaseProvideAnyDetailsKnownForTheConditionsColumn2Option4};
        for (int nn = 1; nn < 5; nn++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(nn, 4).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(nn, 4), column2ValueConditions[nn - 1]);
        }
        String[] column3ValueConditions = {testDataManagerScenario1.pleaseProvideAnyDetailsKnownForTheConditionsColumn3Option1,
                testDataManagerScenario1.pleaseProvideAnyDetailsKnownForTheConditionsColumn3Option2,
                testDataManagerScenario1.pleaseProvideAnyDetailsKnownForTheConditionsColumn3Option3,
                testDataManagerScenario1.pleaseProvideAnyDetailsKnownForTheConditionsColumn3Option4};
        for (int oo = 1; oo < 5; oo++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(oo, 5).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(oo, 5), column3ValueConditions[oo - 1]);
        }
        String[] column4ValueConditions = {testDataManagerScenario1.pleaseProvideAnyDetailsKnownForTheConditionsColumn4Option1,
                testDataManagerScenario1.pleaseProvideAnyDetailsKnownForTheConditionsColumn4Option2,
                testDataManagerScenario1.pleaseProvideAnyDetailsKnownForTheConditionsColumn4Option3,
                testDataManagerScenario1.pleaseProvideAnyDetailsKnownForTheConditionsColumn4Option4};
        for (int pp = 1; pp < 5; pp++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(pp, 8).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(pp, 8), column4ValueConditions[pp - 1]);
        }
        String[] column5ValueConditions = {testDataManagerScenario1.pleaseProvideAnyDetailsKnownForTheConditionsColumn5Option1,
                testDataManagerScenario1.pleaseProvideAnyDetailsKnownForTheConditionsColumn5Option2,
                testDataManagerScenario1.pleaseProvideAnyDetailsKnownForTheConditionsColumn5Option3,
                testDataManagerScenario1.pleaseProvideAnyDetailsKnownForTheConditionsColumn5Option4};
        for (int qq = 1; qq < 5; qq++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(qq, 9).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(qq, 9), column5ValueConditions[qq - 1]);
        }
        String[] column6ValueConditions = {testDataManagerScenario1.pleaseProvideAnyDetailsKnownForTheConditionsColumn6Option1,
                testDataManagerScenario1.pleaseProvideAnyDetailsKnownForTheConditionsColumn6Option2,
                testDataManagerScenario1.pleaseProvideAnyDetailsKnownForTheConditionsColumn6Option3,
                testDataManagerScenario1.pleaseProvideAnyDetailsKnownForTheConditionsColumn6Option4};
        for (int rr = 1; rr < 5; rr++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(rr, 10).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(rr, 10), column6ValueConditions[rr - 1]);
        }
        String[] column7ValueConditions = {testDataManagerScenario1.pleaseProvideAnyDetailsKnownForTheConditionsColumn7Option1,
                testDataManagerScenario1.pleaseProvideAnyDetailsKnownForTheConditionsColumn7Option2,
                testDataManagerScenario1.pleaseProvideAnyDetailsKnownForTheConditionsColumn7Option3,
                testDataManagerScenario1.pleaseProvideAnyDetailsKnownForTheConditionsColumn7Option4};
        for (int ss = 1; ss < 5; ss++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(ss, 13).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(ss, 13), column7ValueConditions[ss - 1]);
        }
        String[] column8ValueConditions = {testDataManagerScenario1.pleaseProvideAnyDetailsKnownForTheConditionsColumn8Option1,
                testDataManagerScenario1.pleaseProvideAnyDetailsKnownForTheConditionsColumn8Option2,
                testDataManagerScenario1.pleaseProvideAnyDetailsKnownForTheConditionsColumn8Option3,
                testDataManagerScenario1.pleaseProvideAnyDetailsKnownForTheConditionsColumn8Option4};
        for (int tt = 1; tt < 5; tt++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(tt, 16).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(tt, 16), column8ValueConditions[tt - 1]);
        }
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.theNextTwoQuestionsWillAskAboutRASopathyDiagnosesText);
        CommonUtils.assertEqualsWithMessage(testDataManagerScenario1.theNextTwoQuestionsWillAskAboutRASopathyDiagnoses, myRASSurveyPage.rasSurveyText.getText(), "-- VERIFYING THE NEXT TWO QUESTIONS WILL ASK ABOUT RASOPATHY DIAGNOSES TEXT --");
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
    }
    public void rasScreenerSurveyScenario1partFour() {
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();



        MiscUtils.sleep(5000);
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

    /***
     * THIS METHOD VERIFIES RAS SCREENER SCENARIO 1 DATA IN NATIVE VIEW
     */
    public void verifying_RAS_Screener_Scenario_1_Data(){
        testDataManagerScenario1.dataInitializerRasScreenerSurveyScenario1("screenerScenario1");
        nativeViewLoginImpl.sideDoorAccountLogin();
        CommonUtils.sendKeysToElement(nativeViewHomePage.nativeViewFilterNavigator, "CHARMS");
        CommonUtils.clickOnElement(charmsNativeViewPage.dashboardModuleLink);
        CommonUtils.switchToFrame(charmsNativeViewPage.nativeViewiFrameCHARMS);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        JavascriptUtils.scrollIntoView(charmsNativeViewPage.dynamicDashboardModuleLinkLocator("Eligibility Review Needed"));
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        CommonUtils.clickOnElement(charmsNativeViewPage.dynamicDashboardModuleLinkLocator("Eligibility Review Needed"));
        CommonUtils.switchToNextWindow();
        CucumberLogUtils.logToConsole("---- RETRIEVING DATA FROM EXCEL ----");
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        CommonUtils.clickOnElement(participantDetailsPage.dynamicRecordButtonLocator(testDataManagerScenario1.firstName + rASScreenerScenario1_Constants.SPACE + testDataManagerScenario1.lastName));
        CucumberLogUtils.logToConsole("---- VERIFYING PARTICIPANT RECORD PREVIEW DATA ----");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(participantDetailsPage.firstNameRecordPreviewField), testDataManagerScenario1.firstName, "-- VERIFYING PREVIEW RECORD FIRST NAME --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(participantDetailsPage.lastNameRecordPreviewField), testDataManagerScenario1.lastName, "-- VERIFYING PREVIEW RECORD LAST NAME --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(participantDetailsPage.middleNameRecordPreviewField), testDataManagerScenario1.middleInitial, "-- VERIFYING PREVIEW RECORD MIDDLE NAME --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(participantDetailsPage.contactHomePhoneRecordPreviewField), testDataManagerScenario1.homePhoneNumber, "-- VERIFYING PREVIEW RECORD CONTACT HOME PHONE NUMBER --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(participantDetailsPage.contactEmailRecordPreviewField), testDataManagerScenario1.emailAddress, "-- VERIFYING PREVIEW RECORD CONTACT EMAIL ADDRESS --");
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        CommonUtils.clickOnElement(participantDetailsPage.openRecordButton);
        CucumberLogUtils.logToConsole("---- VERIFYING PARTICIPANT NAME DATA ----");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(participantDetailsPage.nameTextBox), testDataManagerScenario1.firstName + rASScreenerScenario1_Constants.SPACE + testDataManagerScenario1.lastName, "-- VERIFYING FULL NAME --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(participantDetailsPage.firstNameTextBox), testDataManagerScenario1.firstName, "-- VERIFYING FIRST NAME --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(participantDetailsPage.middleInitialTextBox), testDataManagerScenario1.middleInitial, "-- VERIFYING MIDDLE INITIAL --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(participantDetailsPage.lastNameTextBox), testDataManagerScenario1.lastName, "-- VERIFYING LAST NAME --");
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        CommonUtils.clickOnElement(participantDetailsPage.demographicsTab);
        CucumberLogUtils.logToConsole("---- VERIFYING PARTICIPANT DEMOGRAPHICS DATA ----");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(participantDetailsPage.dateOfBirthTextBox), testDataManagerScenario1.whatIsYourDateOfBirth, "-- VERIFYING DATE OF BIRTH --");
        CommonUtils.verifyingDropDownValueIsSelected(participantDetailsPage.biologicalGenderDropDown, testDataManagerScenario1.sexAssignedAtBirthOption, "-- VERIFYING BIOLOGICAL GENDER --");
        CommonUtils.verifyingDropDownValueIsSelected(participantDetailsPage.isParticipantAdoptedDropDown, testDataManagerScenario1.areYouAdoptedOption, "-- VERIFYING IF THE PARTICIPANT IS ADOPTED --");
        CommonUtils.assertEqualsWithMessage(participantDetailsPage.participantRacePreferNotToAnswerOption.getText(), testDataManagerScenario1.whatIsYourRace, "-- VERIFYING RACE --");
        CommonUtils.verifyingDropDownValueIsSelected(participantDetailsPage.ethnicityDropDownOption, testDataManagerScenario1.whatIsYourEthnicity, "-- VERIFYING ETHNICITY --");
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        CommonUtils.clickOnElement(participantDetailsPage.contactInfoTab);
        CucumberLogUtils.logToConsole("---- VERIFYING PARTICIPANT CONTACT INFORMATION DATA ----");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(participantDetailsPage.contactStreetAddress), testDataManagerScenario1.street + rASScreenerScenario1_Constants.SPACE + testDataManagerScenario1.street2, "-- VERIFYING CONTACT STREET ADDRESS --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(participantDetailsPage.contactState), testDataManagerScenario1.state, "-- VERIFYING CONTACT STATE --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(participantDetailsPage.contactCity), testDataManagerScenario1.city, "- VERIFYING CONTACT CITY --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(participantDetailsPage.contactZipCode), testDataManagerScenario1.zipcode, "-- VERIFYING ZIP CODE --");
        CommonUtils.verifyingDropDownValueIsSelected(participantDetailsPage.contactCountryDropDown, testDataManagerScenario1.countryOption, "-- VERIFYING CONTACT COUNTRY --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(participantDetailsPage.contactEmailAddress), testDataManagerScenario1.emailAddress, "-- VERIFYING CONTACT EMAIL ADDRESS --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(participantDetailsPage.contactHomePhone), testDataManagerScenario1.homePhoneNumber, "-- VERIFYING CONTACT HOME PHONE --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(participantDetailsPage.contactCellPhone), testDataManagerScenario1.cellPhoneNumber, "-- VERIFYING CONTACT CELL PHONE --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(participantDetailsPage.contactWorkPhone), testDataManagerScenario1.workPhoneNumber, "-- VERIFYING CONTACT WORK PHONE --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(participantDetailsPage.contactPreferredPhone), testDataManagerScenario1.cellPhoneNumber, "-- VERIFYING PREFERRED PHONE --");
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        CommonUtils.clickOnElement(participantDetailsPage.medicalInformationTab);
        CucumberLogUtils.logToConsole("---- VERIFYING PARTICIPANT MEDICAL INFORMATION DATA ----");
        CommonUtils.verifyingDropDownValueIsSelected(participantDetailsPage.hasAPhysicianEverDiagnosedThisParticipantWithCancerDropDown, testDataManagerScenario1.haveYouBeenDiagnosedWithCancer, "-- VERIFYING IF PARTICIPANT HAS BEEN DIAGNOSED WITH CANCER --");
        rasScreenerScenario1StepsImpl.verifyingDropDownOption(participantDetailsPage.vitalStatusYesDropDownOption, "-- VERIFYING VITAL STATUS --");
        CommonUtils.verifyingDropDownValueIsSelected(participantDetailsPage.hasTheParticipantEverHadGeneticTestingDropDown, testDataManagerScenario1.haveYouEverHadGeneticTesting, "-- VERIFYING IF THE PARTICIPANT HAS HAD GENETIC TESTING --");
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        CommonUtils.clickOnElement(participantDetailsPage.rasopathyHistoryTab);
        CucumberLogUtils.logToConsole("---- VERIFYING PARTICIPANT RASOPATHY HISTORY DATA ----");
        CommonUtils.verifyingDropDownValueIsSelected(participantDetailsPage.haveYouBeenDiagnosedWithARasopathyDropDown, testDataManagerScenario1.haveYouBeenDiagnosedWithARasopathy, "-- VERIFYING IF PARTICIPANT HAS BEEN DIAGNOSED WITH A RASOPATHY --");
        CommonUtils.verifyingDropDownValueIsSelected(participantDetailsPage.haveAnyOfYourBiologicalRelativesBeenDiagnosedWithARasopathyDropDown, testDataManagerScenario1.haveAnyOfYourBiologicalRelativesBeenDiagnosedWithARasopathy, "-- VERIFYING IF BIOLOGICAL RELATIVES HAVE BEEN DIAGNOSED WITH A RASOPATHY --");
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        CucumberLogUtils.logToConsole("---- OPENING AND VERIFYING SCREENER RECORD DATA ----");
        CommonUtils.clickOnElement(screenerRecordTablePage.referralPreviewButton);
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(screenerRecordTablePage.screenerPreviewFamilyMemberRecordField), testDataManagerScenario1.firstName + rASScreenerScenario1_Constants.SPACE + testDataManagerScenario1.lastName, "-- VERIFYING SCREENER PREVIEW RECORD FAMILY MEMBER RECORD NAME --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(screenerRecordTablePage.screenerPreviewContactEmailAddressField), testDataManagerScenario1.emailAddress, "-- VERIFYING SCREENER PREVIEW RECORD CONTACT EMAIL ADDRESS FIELD --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(screenerRecordTablePage.screenerPreviewStudyField), rASScreenerScenario1_Constants.RAS_STUDY, "-- VERIFYING SCREENER PREVIEW STUDY FIELD --");
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        CommonUtils.clickOnElement(screenerRecordTablePage.openRecordButton);
        CucumberLogUtils.logToConsole("---- VERIFYING SCREENER RECORD NAME AND CONTACT INFORMATION DATA ----");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(screenerRecordTablePage.screenerStudyField), rASScreenerScenario1_Constants.RAS_STUDY, "-- VERIFYING STUDY FIELD --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(screenerRecordTablePage.familyMemberRecordField), testDataManagerScenario1.firstName + rASScreenerScenario1_Constants.SPACE + testDataManagerScenario1.lastName, "-- VERIFYING FAMILY MEMBER RECORD FIELD --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(screenerRecordTablePage.contactEmailField), testDataManagerScenario1.emailAddress, "-- VERIFYING CONTACT EMAIL FIELD --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(screenerRecordTablePage.contactHomePhoneField), testDataManagerScenario1.homePhoneNumber, "-- VERIFYING CONTACT HOME PHONE NUMBER --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(screenerRecordTablePage.contactCellPhoneField), testDataManagerScenario1.cellPhoneNumber, "-- VERIFYING CONTACT CELL PHONE NUMBER --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(screenerRecordTablePage.contactWorkPhoneField), testDataManagerScenario1.workPhoneNumber, "-- VERIFYING CONTACT WORK PHONE NUMBER --");
        CommonUtils.verifyingDropDownValueIsSelected(screenerRecordTablePage.contactCountryDropDown, testDataManagerScenario1.countryOption, "-- VERIFYING COUNTRY CONTACT FIELD --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(screenerRecordTablePage.contactStateField), testDataManagerScenario1.state, "-- VERIFYING STATE --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(screenerRecordTablePage.contactStreetAddressField), testDataManagerScenario1.street + rASScreenerScenario1_Constants.SPACE + testDataManagerScenario1.street2, "-- VERIFYING CONTACT STREET ADDRESS --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(screenerRecordTablePage.contactCityField), testDataManagerScenario1.city, "-- VERIFYING CONTACT CITY --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(screenerRecordTablePage.contactZipCodeField), testDataManagerScenario1.zipcode, "-- VERIFYING ZIP CODE --");
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        CommonUtils.clickOnElement(screenerRecordTablePage.dynamicLocatorForTabs("Demographics"));
        CommonUtils.assertEqualsWithMessage(screenerRecordTablePage.demographicsParticipantRacePreferNotToAnswerOption.getText(), testDataManagerScenario1.whatIsYourRace, "-- VERIFYING RACE OF PARTICIPANT --");
        CommonUtils.verifyingDropDownValueIsSelected(screenerRecordTablePage.demographicsBiologicalGenderDropDown, testDataManagerScenario1.sexAssignedAtBirthOption, "-- VERIFYING BIOLOGICAL GENDER --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(screenerRecordTablePage.demographicsDateOfBirthField), testDataManagerScenario1.whatIsYourDateOfBirth, "-- VERIFYING DATE OF BIRTH --");
        CommonUtils.verifyingDropDownValueIsSelected(screenerRecordTablePage.demographicsEthnicityDropDown, testDataManagerScenario1.whatIsYourEthnicity, "-- VERIFYING ETHNICITY --");
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        CommonUtils.clickOnElement(screenerRecordTablePage.dynamicLocatorForTabs("RASopathy History"));
        CucumberLogUtils.logToConsole("---- VERIFYING SCREENER RECORD RASOPATHY HISTORY DATA ----");
        CommonUtils.verifyingDropDownValueIsSelected(screenerRecordTablePage.rasopathyHistoryHaveYouBeenDiagnosedWithARasopathyDropDown, testDataManagerScenario1.haveYouBeenDiagnosedWithARasopathy, "-- VERIFYING IF PARTICIPANT HAS BEEN DIAGNOSED WITH A RASOPATHY --");
        CommonUtils.assertEqualsWithMessage(screenerRecordTablePage.rasopathyHistoryNeverDiagnosedWithAnyOfTheseConditions.getText(), testDataManagerScenario1.haveYouBeenDiagnosedWithFollowingConditions, "-- VERIFYING IF CANDIDATE HAS BEEN DIAGNOSED WITH ANY CONDITIONS --");
        CommonUtils.verifyingDropDownValueIsSelected(screenerRecordTablePage.rasopathyHistoryHaveAnyOfYourBiologicalRelativesBeenDiagnosedWithARasopathyDropDown, testDataManagerScenario1.haveAnyOfYourBiologicalRelativesBeenDiagnosedWithARasopathy, "-- VERIFYING IF ANY OF BIOLOGICAL RELATIVES BEEN DIAGNOSED WITH A RASOPATHY --");
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        CommonUtils.clickOnElement(screenerRecordTablePage.dynamicLocatorForTabs("Cancer History"));
        CucumberLogUtils.logToConsole("---- VERIFYING SCREENER RECORD CANCER HISTORY DATA ----");
        CommonUtils.verifyingDropDownValueIsSelected(screenerRecordTablePage.cancerHistoryHasAPhysicianEverDiagnosedParticipantWithCancerDropDown, testDataManagerScenario1.haveYouBeenDiagnosedWithCancer, "-- VERIFYING IF PARTICIPANT HAS BEEN DIAGNOSED WITH CANCER --");
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        CommonUtils.clickOnElement(screenerRecordTablePage.dynamicLocatorForTabs("Genetic Testing History"));
        CucumberLogUtils.logToConsole("---- VERIFYING SCREENER RECORD GENETIC TESTING HISTORY DATA ----");
        CommonUtils.verifyingDropDownValueIsSelected(screenerRecordTablePage.geneticTestingHistoryHasTheParticipantEverHadGeneticTestingDropDown, testDataManagerScenario1.haveYouEverHadGeneticTesting, "-- VERIFYING IF PARTICIPANT HAS HAD GENETIC TESTING --");
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        CommonUtils.clickOnElement(screenerRecordTablePage.dynamicLocatorForTabs("Final Information"));
        CucumberLogUtils.logToConsole("---- VERIFYING SCREENER RECORD FINAL INFORMATION DATA ----");
        CommonUtils.verifyingDropDownValueIsSelected(screenerRecordTablePage.finalInformationHowDidYouHearAboutThisStudyDropDown, testDataManagerScenario1.howDidYouHearAboutThisStudy, "-- VERIFYING HOW DID PARTICIPANT HEAR ABOUT THE STUDY --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(screenerRecordTablePage.finalInformationHowDidYouHearAboutThisStudyPleaseSpecifyTextBox), testDataManagerScenario1.howDidYouHearAboutThisStudyOtherReason, "-- VERIFYING HOW DID YOU PARTICIPANT HEAR ABOUT THE STUDY OTHER REASONS --");
        CommonUtils.verifyingDropDownValueIsSelected(screenerRecordTablePage.finalInformationHasParticipantOrAnyFamilyMemberParticipatedInAnyCancerStudyDropDown, testDataManagerScenario1.haveYouOrOtherFamilyMembersParticipatedInOtherStudy, "-- VERIFYING IF PARTICIPANT OR FAMILY MEMBER HAVE PARTICIPATED IN CANCER STUDY --");
        CommonUtils.assertEqualsWithMessage(screenerRecordTablePage.finalInformationMainReasonsForParticipatingInThisStudyOtherOption.getText(), testDataManagerScenario1.whatAreMainReasonsForParticipatingInStudy, "-- VERIFYING MAIN REASONS FOR PARTICIPATING IN STUDY --");
        CommonUtils.assertEqualsWithMessage(screenerRecordTablePage.finalInformationMainReasonsForParticipatingInThisStudyOtherReasonsField.getText(), testDataManagerScenario1.whatAreMainReasonsForParticipatingInStudyOtherReason, "-- VERIFYING MAIN REASONS FOR PARTICIPATING IN STUDY FIELD --");
        CommonUtils.verifyingDropDownValueIsSelected(screenerRecordTablePage.finalInformationAreYouAParticipantInAnyOtherResearchStudyOrRegistryGroupDropDown, testDataManagerScenario1.areYouAParticipantInOtherStudyGroup, "-- VERIFYING IF PARTICIPANT IS PART OF RESEARCH STUDY OR REGISTRY GROUP --");
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
    }
}