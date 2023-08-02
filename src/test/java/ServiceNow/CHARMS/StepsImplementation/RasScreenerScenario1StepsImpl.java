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
        testDataManager.dataInitializerRasScreener(sheetName);
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
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rASScreenerScenario1_Constants.FIRST_NAME).sendKeys(testDataManager.firstName);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rASScreenerScenario1_Constants.MIDDLE_INITIAL).sendKeys(testDataManager.middleInitial);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rASScreenerScenario1_Constants.LAST_NAME).sendKeys(testDataManager.lastName);
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rASScreenerScenario1_Constants.FIRST_NAME).sendKeys(testDataManager.firstName);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rASScreenerScenario1_Constants.MIDDLE_INITIAL).sendKeys(testDataManager.middleInitial);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rASScreenerScenario1_Constants.LAST_NAME).sendKeys(testDataManager.lastName);
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            rasopathyQuestionnairePage.calendarYearTextBox.clear();
            rasopathyQuestionnairePage.calendarYearTextBox.sendKeys(testDataManager.dateOfBirthYear);
            CommonUtils.selectDropDownValue(testDataManager.dateOfBirthMonth, rasopathyQuestionnairePage.calendarMonthDropDown);
            rasopathyQuestionnairePage.calendarDayOption.click();
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.calendarYearTextBox.clear();
            rasopathyQuestionnairePage.calendarYearTextBox.sendKeys(testDataManager.dateOfBirthYear);
            CommonUtils.selectDropDownValue(testDataManager.dateOfBirthMonth, rasopathyQuestionnairePage.calendarMonthDropDown);
            rasopathyQuestionnairePage.calendarDayOption.click();
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            rasopathyQuestionnairePage.dynamicLocator(testDataManager.sexAssignedAtBirthOption).click();
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicLocator(testDataManager.sexAssignedAtBirthOption).click();
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            rasopathyQuestionnairePage.dynamicLocator(testDataManager.areYouAdoptedOption).click();
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicLocator(testDataManager.areYouAdoptedOption).click();
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            CommonUtils.selectDropDownValue(testDataManager.countryOption, rasopathyQuestionnairePage.whatCountryDoesParticipantCurrentlyLiveInDropDown);
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            CommonUtils.selectDropDownValue(testDataManager.countryOption, rasopathyQuestionnairePage.whatCountryDoesParticipantCurrentlyLiveInDropDown);
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rASScreenerScenario1_Constants.STREET_ADDRESS).sendKeys(testDataManager.street);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rASScreenerScenario1_Constants.STREET_2_ADDRESS).sendKeys(testDataManager.street2);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rASScreenerScenario1_Constants.CITY_TEXT).sendKeys(testDataManager.city);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rASScreenerScenario1_Constants.STATE_TEXT).sendKeys(testDataManager.state);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rASScreenerScenario1_Constants.ZIP_CODE_TEXT).sendKeys(testDataManager.zipcode);
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rASScreenerScenario1_Constants.STREET_ADDRESS).sendKeys(testDataManager.street);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rASScreenerScenario1_Constants.STREET_2_ADDRESS).sendKeys(testDataManager.street2);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rASScreenerScenario1_Constants.CITY_TEXT).sendKeys(testDataManager.city);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rASScreenerScenario1_Constants.STATE_TEXT).sendKeys(testDataManager.state);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rASScreenerScenario1_Constants.ZIP_CODE_TEXT).sendKeys(testDataManager.zipcode);
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            rasopathyQuestionnairePage.dynamicEmailAddressTextBox(rASScreenerScenario1_Constants.EMAIL_ADDRESS).sendKeys(testDataManager.emailAddress);
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicEmailAddressTextBox(rASScreenerScenario1_Constants.EMAIL_ADDRESS).sendKeys(testDataManager.emailAddress);
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            rasopathyQuestionnairePage.dynamicEmailAddressTextBox(rASScreenerScenario1_Constants.CONFIRM_EMAIL_ADDRESS).sendKeys(testDataManager.emailAddressConfirm);
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicEmailAddressTextBox(rASScreenerScenario1_Constants.CONFIRM_EMAIL_ADDRESS).sendKeys(testDataManager.emailAddressConfirm);
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            rasopathyQuestionnairePage.dynamicTextBoxLocatorForPhoneNumbers(rASScreenerScenario1_Constants.HOME_PHONE_NUMBER).sendKeys(testDataManager.homePhoneNumber);
            rasopathyQuestionnairePage.dynamicTextBoxLocatorForPhoneNumbers(rASScreenerScenario1_Constants.CELL_PHONE_NUMBER).sendKeys(testDataManager.cellPhoneNumber);
            rasopathyQuestionnairePage.dynamicTextBoxLocatorForPhoneNumbers(rASScreenerScenario1_Constants.WORK_PHONE_NUMBER).sendKeys(testDataManager.workPhoneNumber);
            rasopathyQuestionnairePage.dynamicPhoneNumberCheckBox(rASScreenerScenario1_Constants.CELL_PHONE_NUMBER).click();
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchFrameException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicTextBoxLocatorForPhoneNumbers(rASScreenerScenario1_Constants.HOME_PHONE_NUMBER).sendKeys(testDataManager.homePhoneNumber);
            rasopathyQuestionnairePage.dynamicTextBoxLocatorForPhoneNumbers(rASScreenerScenario1_Constants.CELL_PHONE_NUMBER).sendKeys(testDataManager.cellPhoneNumber);
            rasopathyQuestionnairePage.dynamicTextBoxLocatorForPhoneNumbers(rASScreenerScenario1_Constants.WORK_PHONE_NUMBER).sendKeys(testDataManager.workPhoneNumber);
            rasopathyQuestionnairePage.dynamicPhoneNumberCheckBox(rASScreenerScenario1_Constants.CELL_PHONE_NUMBER).click();
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            rasopathyQuestionnairePage.dynamicLocator(testDataManager.whatIsYourEthnicity).click();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicLocator(testDataManager.whatIsYourEthnicity).click();
        }
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            rasopathyQuestionnairePage.dynamicLocator(testDataManager.whatIsYourRace).click();
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicLocator(testDataManager.whatIsYourRace).click();
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            rasopathyQuestionnairePage.dynamicLocator(testDataManager.areYouAParticipantInOtherStudyGroup).click();
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicLocator(testDataManager.whatIsYourRace).click();
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouBeenDiagnosedWithFollowingConditions).click();
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouBeenDiagnosedWithFollowingConditions).click();
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        try {
            rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouBeenDiagnosedWithCancer).click();
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouBeenDiagnosedWithCancer).click();
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            MiscUtils.sleep(500);
            CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouBeenDiagnosedWithARasopathy));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouBeenDiagnosedWithARasopathy).click();
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
            CommonUtils.scrollIntoView(rasopathyQuestionnairePage.dynamicLocator(testDataManager.howDidYouHearAboutThisStudy));
            CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicLocator(testDataManager.howDidYouHearAboutThisStudy));
            rasopathyQuestionnairePage.dynamicLocatorForHowDidYouHearAboutStudyTextBoxes(testDataManager.howDidYouHearAboutThisStudy).sendKeys(testDataManager.howDidYouHearAboutThisStudyOtherReason);
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicTextBoxLocator(testDataManager.howDidYouHearAboutThisStudy));
            rasopathyQuestionnairePage.dynamicLocatorForHowDidYouHearAboutStudyTextBoxes(testDataManager.howDidYouHearAboutThisStudy).sendKeys(testDataManager.howDidYouHearAboutThisStudyOtherReason);
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            MiscUtils.sleep(500);
            CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouOrOtherFamilyMembersParticipatedInOtherStudy));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouOrOtherFamilyMembersParticipatedInOtherStudy));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            MiscUtils.sleep(500);
            CommonUtils.scrollIntoView(rasopathyQuestionnairePage.dynamicLocator(testDataManager.whatAreMainReasonsForParticipatingInStudy));
            CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicLocator(testDataManager.whatAreMainReasonsForParticipatingInStudy));
            System.out.println();
            rasopathyQuestionnairePage.dynamicLocatorForMainReasonForParticipatingInStudy(testDataManager.whatAreMainReasonsForParticipatingInStudy).sendKeys(testDataManager.whatAreMainReasonsForParticipatingInStudyOtherReason);
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            MiscUtils.sleep(500);
            CommonUtils.scrollIntoView(rasopathyQuestionnairePage.dynamicLocator(testDataManager.whatAreMainReasonsForParticipatingInStudy));
            CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicLocator(testDataManager.whatAreMainReasonsForParticipatingInStudy));
            rasopathyQuestionnairePage.dynamicLocatorForMainReasonForParticipatingInStudy(testDataManager.whatAreMainReasonsForParticipatingInStudy).sendKeys(testDataManager.whatAreMainReasonsForParticipatingInStudyOtherReason);
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
        CommonUtils.waitForClickability(nativeViewCHARMSParticipantDetailsPage.nativeSubjectFlagButton);
        JavascriptUtils.clickByJS(nativeViewCHARMSParticipantDetailsPage.nativeSubjectFlagButton);
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
            testDataManager.dataInitializerIiq(sheetNameIiq);
            WebDriverUtils.webDriver.get(CHARMSConstants.IIQ_SAMPLE_FORM);

        try {
            myRASIIQFormPage.screenerIiqFormEmail.sendKeys(testDataManager.pleaseLogInEmailTextBox);
            myRASIIQFormPage.screenerIiqFormPin.sendKeys(testDataManager.pleaseLogInOneTimePinTextBox);
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            CommonUtils.waitForVisibility(myRASIIQFormPage.screenerIiqFormThisIsACopyForLowerEnvironments);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            myRASIIQFormPage.screenerIiqFormEmail.sendKeys(testDataManager.pleaseLogInEmailTextBox);
            myRASIIQFormPage.screenerIiqFormPin.sendKeys(testDataManager.pleaseLogInOneTimePinTextBox);
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        }
        CommonUtils.waitForVisibility(myRASIIQFormPage.screenerIiqFormThisIsACopyForLowerEnvironments);
        CommonUtils.assertEqualsWithMessage(testDataManager.thisIsACopyForLowerEnvironmentsText, myRASIIQFormPage.screenerIiqFormThisIsACopyForLowerEnvironments.getText(), "-- VERIFYING THIS IS THE COPY FOR LOWER ENVIRONMENTS TEXT --");
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        CommonUtils.waitForVisibility(myRASIIQFormPage.screenerIiqFormSomeOfThisInformation);
        CommonUtils.assertEqualsWithMessage(testDataManager.someOfThisInformationText, myRASIIQFormPage.screenerIiqFormSomeOfThisInformation.getText(), "-- VERIFYING SOME OF THIS INFORMATION TEXT --");
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        CommonUtils.waitForVisibility(myRASIIQFormPage.screenerIiqFormThisFirstQuestionOfTheQuestionnaire);
        CommonUtils.assertEqualsWithMessage(testDataManager.thisFirstSectionOfTheQuestionnaireText, myRASIIQFormPage.screenerIiqFormThisFirstQuestionOfTheQuestionnaire.getText(), "-- VERIFYING THIS FIRST QUESTION OF THE QUESTIONNAIRE TEXT --");
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            rasopathyQuestionnairePage.dynamicLocator(testDataManager.areYouCompletingThisFormForYourselfRadioButton).click();
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicLocator(testDataManager.areYouCompletingThisFormForYourselfRadioButton).click();
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            rasopathyQuestionnairePage.dynamicLocator(testDataManager.whatIsYourBiologicalSexRadioButton).click();
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicLocator(testDataManager.whatIsYourBiologicalSexRadioButton).click();
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
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManager.doYouConsiderYourselfToBeRadioButton));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.doYouConsiderYourselfToBeRadioButton));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.doYouConsiderYourselfToBeRadioButton));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManager.whatIsYourRaceCheckBox));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.whatIsYourRaceCheckBox));
            MiscUtils.sleep(2000);
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.whatIsYourRaceCheckBox));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.whatIsYourRaceCheckBox));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManager.areYouOfAshkenazyJewishDescentRadioButton));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.areYouOfAshkenazyJewishDescentRadioButton));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.areYouOfAshkenazyJewishDescentRadioButton));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManager.areYouAdoptedRadioButton));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.areYouAdoptedRadioButton));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.areYouAdoptedRadioButton));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManager.wereYouRaisedPrimarilyRadioButton));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.wereYouRaisedPrimarilyRadioButton));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.wereYouRaisedPrimarilyRadioButton));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            rasopathyQuestionnairePage.calendarYearTextBox.clear();
            rasopathyQuestionnairePage.calendarYearTextBox.sendKeys(testDataManager.whatIsYourDateOfBirthYearDropDown);
            CommonUtils.selectDropDownValue(testDataManager.whatIsYourDateOfBirthMonthDropDown, rasopathyQuestionnairePage.calendarMonthDropDown);
            rasopathyQuestionnairePage.iIQcalendarDayOption.click();
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.calendarYearTextBox.clear();
            rasopathyQuestionnairePage.calendarYearTextBox.sendKeys(testDataManager.whatIsYourDateOfBirthYearDropDown);
            CommonUtils.selectDropDownValue(testDataManager.whatIsYourDateOfBirthMonthDropDown, rasopathyQuestionnairePage.calendarMonthDropDown);
            rasopathyQuestionnairePage.iIQcalendarDayOption.click();
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rASScreenerScenario1_Constants.WHERE_WERE_YOU_BORN_CITY_TEXT_BOX_QUESTION).clear();
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rASScreenerScenario1_Constants.WHERE_WERE_YOU_BORN_CITY_TEXT_BOX_QUESTION).sendKeys(testDataManager.whereWereYouBornCityTextBox);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rASScreenerScenario1_Constants.WHERE_WERE_YOU_BORN_STATE_TEXT_BOX_QUESTION).clear();
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rASScreenerScenario1_Constants.WHERE_WERE_YOU_BORN_STATE_TEXT_BOX_QUESTION).sendKeys(testDataManager.whereWereYouBornStateTextBox);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rASScreenerScenario1_Constants.WHERE_WERE_YOU_BORN_COUNTRY_TEXT_BOX_QUESTION).clear();
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rASScreenerScenario1_Constants.WHERE_WERE_YOU_BORN_COUNTRY_TEXT_BOX_QUESTION).sendKeys(testDataManager.whereWereYouBornCountryTextBox);
            rasopathyQuestionnairePage.iIQAddressDontKnowTextBox.clear();
            rasopathyQuestionnairePage.iIQAddressDontKnowTextBox.sendKeys(testDataManager.whereWereYouBornDontKnowTextBox);
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rASScreenerScenario1_Constants.WHERE_WERE_YOU_BORN_CITY_TEXT_BOX_QUESTION).clear();
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rASScreenerScenario1_Constants.WHERE_WERE_YOU_BORN_CITY_TEXT_BOX_QUESTION).sendKeys(testDataManager.whereWereYouBornCityTextBox);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rASScreenerScenario1_Constants.WHERE_WERE_YOU_BORN_STATE_TEXT_BOX_QUESTION).clear();
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rASScreenerScenario1_Constants.WHERE_WERE_YOU_BORN_STATE_TEXT_BOX_QUESTION).sendKeys(testDataManager.whereWereYouBornStateTextBox);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rASScreenerScenario1_Constants.WHERE_WERE_YOU_BORN_COUNTRY_TEXT_BOX_QUESTION).clear();
            rasopathyQuestionnairePage.dynamicTextBoxLocator(rASScreenerScenario1_Constants.WHERE_WERE_YOU_BORN_COUNTRY_TEXT_BOX_QUESTION).sendKeys(testDataManager.whereWereYouBornCountryTextBox);
            rasopathyQuestionnairePage.iIQAddressDontKnowTextBox.clear();
            rasopathyQuestionnairePage.iIQAddressDontKnowTextBox.sendKeys(testDataManager.whereWereYouBornDontKnowTextBox);
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            MiscUtils.sleep(2000);
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.mostPeopleHaveAncestorsCheckBox));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.mostPeopleHaveAncestorsCheckBox));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            MiscUtils.sleep(2000);
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.whatIsYourBiologicalFatherAncestralBackgroundTextBox));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.whatIsYourBiologicalFatherAncestralBackgroundTextBox));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            MiscUtils.sleep(2000);
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.whatIsYourFammilysReligiousBackgroundCheckBox));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.whatIsYourFammilysReligiousBackgroundCheckBox));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManager.whatIsYourMaritalStatusCheckBox));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.whatIsYourMaritalStatusCheckBox));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.whatIsYourMaritalStatusCheckBox));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManager.whatIsYourMainOccupationRadioButton));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.whatIsYourMainOccupationRadioButton));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.whatIsYourMainOccupationRadioButton));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManager.doYouCurrentlyHaveHealthInsuranceRadioButton));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.doYouCurrentlyHaveHealthInsuranceRadioButton));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.doYouCurrentlyHaveHealthInsuranceRadioButton));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManager.doYouCurrentlyHaveHealthInsuranceRadioButton));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.doYouCurrentlyHaveHealthInsuranceRadioButton));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.doYouCurrentlyHaveHealthInsuranceRadioButton));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManager.whatIsTheTotalCombinedYearlyIncomeRadioButton));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.whatIsTheTotalCombinedYearlyIncomeRadioButton));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.whatIsTheTotalCombinedYearlyIncomeRadioButton));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManager.whatIsTheHighestLevelOfSchoolingRadioButton));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.whatIsTheHighestLevelOfSchoolingRadioButton));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.whatIsTheHighestLevelOfSchoolingRadioButton));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        CommonUtils.waitForVisibility(myRASIIQFormPage.screenerIiqFormThisSectionAsksDetailedMedicalHistoryText);
        CommonUtils.assertEqualsWithMessage(rASScreenerScenario1_Constants.THIS_SECTION_ASKS_YOU_TEXT, myRASIIQFormPage.screenerIiqFormThisSectionAsksDetailedMedicalHistoryText.getText(), "-- VERIFYING THIS SECTION ASKS DETAILED MEDICAL HISTORY TEXT --");
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManager.wereYouConceivedUsingVitroRadioButton));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.wereYouConceivedUsingVitroRadioButton));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.wereYouConceivedUsingVitroRadioButton));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManager.wereYouATwinRadioButton));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.wereYouATwinRadioButton));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.wereYouATwinRadioButton));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManager.areYourBiologicalParentsBloodRelatedRadioButton));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.areYourBiologicalParentsBloodRelatedRadioButton));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.areYourBiologicalParentsBloodRelatedRadioButton));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManager.wouldYouSayYouWereBornRadioButton));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.wouldYouSayYouWereBornRadioButton));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.wouldYouSayYouWereBornRadioButton));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        CommonUtils.waitForVisibility(myRASIIQFormPage.screenerIiqFormFillOutBirthWeight);
        CommonUtils.sendKeysToElement(myRASIIQFormPage.screenerIiqFormFillOutBirthWeight, testDataManager.pleaseFillOutBirtWeightNumericTextBox);
        MiscUtils.sleep(3000);
        CommonUtils.selectDropDownValue(testDataManager.pleaseFillOutBirtWeightUnitDropDown,myRASIIQFormPage.screenerIiqFormFillOutBirthWeightUnitDropDown);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        CommonUtils.waitForVisibility(myRASIIQFormPage.screenerIiqFormFillOutBirthLenghtHeadNumeticTextBox);
        CommonUtils.sendKeysToElement(myRASIIQFormPage.screenerIiqFormFillOutBirthLenghtHeadNumeticTextBox, testDataManager.pleaseFillOutHeadNumericTextBox);
        CommonUtils.sendKeysToElement(myRASIIQFormPage.screenerIiqFormFillOutBirthLenghtHeadCircumferenceNumeticTextBox, testDataManager.pleaseFillOutHeadCircumferenceNumericTextBox);
        MiscUtils.sleep(3000);
        CommonUtils.selectDropDownValue(testDataManager.pleaseFillOutHeadUnitDropDown,myRASIIQFormPage.screenerIiqFormFillOutBirthLenghtHeadUnitDropDown);
        CommonUtils.selectDropDownValue(testDataManager.pleaseFillOutHeadCircumferenceUnitDropDown,myRASIIQFormPage.screenerIiqFormFillOutBirthLenghtHeadCircumferenceUnitDropDown);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        CommonUtils.waitForVisibility(myRASIIQFormPage.screenerIiqFormThisSectionWillAskAboutCancerText);
        CommonUtils.assertEqualsWithMessage(rASScreenerScenario1_Constants.THIS_SECTION_WILL_ASK_ABOUT_CANCER_TEXT, myRASIIQFormPage.screenerIiqFormThisSectionWillAskAboutCancerText.getText(), "-- VERIFYING THIS SECTION WILL ASK ABOUT CANCER TEXT --");
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouEverBeenDiagnosedWithAnyCancerRadioButton));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouEverBeenDiagnosedWithAnyCancerRadioButton));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouEverBeenDiagnosedWithAnyCancerRadioButton));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouEverHadMedicalGeneticTestingRadioButton));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouEverHadMedicalGeneticTestingRadioButton));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouEverHadMedicalGeneticTestingRadioButton));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        CommonUtils.waitForVisibility(myRASIIQFormPage.screenerIiqFormFillOutCurrentHeightTextBox);
        CommonUtils.sendKeysToElement(myRASIIQFormPage.screenerIiqFormFillOutCurrentHeightTextBox, testDataManager.pleaseFillTheTableBelowWithHeightNumericTextBox);
        MiscUtils.sleep(3000);
        CommonUtils.selectDropDownValue(testDataManager.pleaseFillTheTableBelowWithHeightUnitDropDown,myRASIIQFormPage.screenerIiqFormFillOutCurrentHeightUnitDropDown);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        CommonUtils.waitForVisibility(myRASIIQFormPage.screenerIiqFormCompleteCurrentWeightTextBox);
        CommonUtils.sendKeysToElement(myRASIIQFormPage.screenerIiqFormCompleteCurrentWeightTextBox, testDataManager.pleaseFillTheTableBelowWithWeightCurrentNumericTextBox);
        CommonUtils.sendKeysToElement(myRASIIQFormPage.screenerIiqFormCompleteOverLifetimeWeightTextBox, testDataManager.pleaseFillTheTableBelowWithWeightDuringLifetimeNumericTextBox);
        CommonUtils.sendKeysToElement(myRASIIQFormPage.screenerIiqFormCompleteAt18WeightTextBox, testDataManager.pleaseFillTheTableBelowWithWeightAt18NumericTextBox);
        MiscUtils.sleep(3000);
        CommonUtils.selectDropDownValue(testDataManager.pleaseFillTheTableBelowWithWeightCurrentUnitDropDown,myRASIIQFormPage.screenerIiqFormCompleteCurrentWeightUnitDropDown);
        CommonUtils.selectDropDownValue(testDataManager.pleaseFillTheTableBelowWithWeightDuringLifetimeUnitDropDown,myRASIIQFormPage.screenerIiqFormCompleteOverLifetimeWeightUnitDropDown);
        CommonUtils.selectDropDownValue(testDataManager.pleaseFillTheTableBelowWithWeightAt18UnitDropDown,myRASIIQFormPage.screenerIiqFormCompleteAt18WeightUnitDropDown);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        CommonUtils.waitForVisibility(myRASIIQFormPage.screenerIiqFormWhatAgeHighestWeightTextBox);
        CommonUtils.sendKeysToElement(myRASIIQFormPage.screenerIiqFormWhatAgeHighestWeightTextBox, testDataManager.atWhatAgeWereYouAtTheHighestWeightTextBox);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouSoughtMedicalAdviceRegardingFertilityRadioButton));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouSoughtMedicalAdviceRegardingFertilityRadioButton));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouSoughtMedicalAdviceRegardingFertilityRadioButton));
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
        testDataManager.dataInitializerRasSurvey(rasSurveySheet);
    }
    public void rasScreenerSurveyScenario1partOne(){
        CommonUtils.waitForVisibility(myRASSurveyPage.rasSurveyThankYouForStartingText);
        CommonUtils.assertEqualsWithMessage(testDataManager.thankYouForStartingTheRASSurveyAndFor,myRASSurveyPage.rasSurveyText.getText(), "-- VERIFYING THANK YOU FOR STARTING THE RAS SURVEY AND FOR YOUR TEXT --");
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.rasSurveyThisQuestionMayTakeText);
        CommonUtils.assertEqualsWithMessage(testDataManager.thisQuestionnaireMayTakeYouSeveral,myRASSurveyPage.rasSurveyText.getText(), "-- VERIFYING THIS QUESTIONNAIRE MAY TAKE YOU SEVERAL HOURS TO COMPLETE TEXT --");
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.rasSurveyTheFirstBlockText);
        CommonUtils.assertEqualsWithMessage(testDataManager.thisQuestionnaireMayTakeYouSeveral,myRASSurveyPage.rasSurveyText.getText(), "-- VERIFYING THE FIRST BLOCK OF QUESTIONS WILL COLLECT TEXT --");
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManager.toConfirmAreYouCompleting));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.toConfirmAreYouCompleting));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.toConfirmAreYouCompleting));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouEverBeenIncluded));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouEverBeenIncluded));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouEverBeenIncluded));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.rasSurveyPleaseProvideAnyAdditionalInformationTextBox);
        myRASSurveyPage.rasSurveyPleaseProvideAnyAdditionalInformationTextBox.clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.rasSurveyPleaseProvideAnyAdditionalInformationTextBox, testDataManager.pleaseProvideAnyAdditionalInformation);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.rasSurveyTheNextSetOfQuestionsWillAskAboutBirthAndNeonatalText);
        CommonUtils.assertEqualsWithMessage(testDataManager.theNextSetOfQuestionsWillAskAboutNeonatalHistory,myRASSurveyPage.rasSurveyText.getText(), "-- VERIFYING THE NEXT SET OF QUESTIONS WILL ASK ABOUT BIRTH AND NEONATAL  TEXT --");
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.pleaseCompleteYourBiologicalParentsBiologicalMotherCityTextBox);
        myRASSurveyPage.pleaseCompleteYourBiologicalParentsBiologicalMotherCityTextBox.clear();
        int momAgeDropdownIndex = Integer.valueOf(testDataManager.pleaseCompleteYourBiologicalParentsBiologicalMotherAge) - 11;
        int fatherDropDownIndex = Integer.valueOf(testDataManager.pleaseCompleteYourBiologicalParentsBiologicalFatherAge) - 11;
        CommonUtils.sendKeysToElement(myRASSurveyPage.pleaseCompleteYourBiologicalParentsBiologicalMotherCityTextBox, testDataManager.pleaseCompleteYourBiologicalParentsBiologicalMotherCity);
        CommonUtils.clickOnElement(myRASSurveyPage.pleaseCompleteYourBiologicalParentsBiologicalMotherUnsureRadioButton);
        CommonUtils.selectDropDownValue(myRASSurveyPage.pleaseCompleteYourBiologicalParentsBiologicalMotherYearsDropDown, momAgeDropdownIndex);
        myRASSurveyPage.pleaseCompleteYourBiologicalParentsBiologicalFatherCityTextBox.clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.pleaseCompleteYourBiologicalParentsBiologicalFatherCityTextBox, testDataManager.pleaseCompleteYourBiologicalParentsBiologicalFatherCity);
        CommonUtils.clickOnElement(myRASSurveyPage.pleaseCompleteYourBiologicalParentsBiologicalFatherUnsureRadioButton);
        CommonUtils.selectDropDownValue(myRASSurveyPage.pleaseCompleteYourBiologicalParentsBiologicalFatherYearsDropDown, fatherDropDownIndex);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManager.wereYouDiagnosedWithHypoglycemia));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.wereYouDiagnosedWithHypoglycemia));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.wereYouDiagnosedWithHypoglycemia));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManager.wereYouDiagnosedWithAnyOfTheFollowingDuringPregnancyOption1));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.wereYouDiagnosedWithAnyOfTheFollowingDuringPregnancyOption1));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.wereYouDiagnosedWithAnyOfTheFollowingDuringPregnancyOption2));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.wereYouDiagnosedWithAnyOfTheFollowingDuringPregnancyOption3));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.wereYouDiagnosedWithAnyOfTheFollowingDuringPregnancyOption4));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.wereYouDiagnosedWithAnyOfTheFollowingDuringPregnancyOption5));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.wereYouDiagnosedWithAnyOfTheFollowingDuringPregnancyOption6));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.wereYouDiagnosedWithAnyOfTheFollowingDuringPregnancyOption7));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManager.wereYouDiagnosedWithAnyOfTheFollowingDuringPregnancyOption1));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.wereYouDiagnosedWithAnyOfTheFollowingDuringPregnancyOption1));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.wereYouDiagnosedWithAnyOfTheFollowingDuringPregnancyOption2));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.wereYouDiagnosedWithAnyOfTheFollowingDuringPregnancyOption3));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.wereYouDiagnosedWithAnyOfTheFollowingDuringPregnancyOption4));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.wereYouDiagnosedWithAnyOfTheFollowingDuringPregnancyOption5));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.wereYouDiagnosedWithAnyOfTheFollowingDuringPregnancyOption6));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.wereYouDiagnosedWithAnyOfTheFollowingDuringPregnancyOption7));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManager.duringHerPregnancyWithYou));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.duringHerPregnancyWithYou));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.duringHerPregnancyWithYou));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        for(int i = 1;i < 9;i++){
            CommonUtils.clickOnElement(myRASSurveyPage.dynamicLocatorRadioButtonNormal("" + i));
        }
        myRASSurveyPage.pleaseIndicateTheResultsOfThePrenatalTestsOtherTextBox.clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.pleaseIndicateTheResultsOfThePrenatalTestsOtherTextBox, testDataManager.pleaseIndicateTheResultsOfThePrenatalTestsOther);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManager.wasYourBiologicalMotherDiagnosedOption1));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.wasYourBiologicalMotherDiagnosedOption1));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.wasYourBiologicalMotherDiagnosedOption2));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.wasYourBiologicalMotherDiagnosedOption3));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.wasYourBiologicalMotherDiagnosedOption4));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.wasYourBiologicalMotherDiagnosedOption5));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.wasYourBiologicalMotherDiagnosedOption6));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.wasYourBiologicalMotherDiagnosedOption7));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.wasYourBiologicalMotherDiagnosedOption8));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.wasYourBiologicalMotherDiagnosedOption9));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.wasYourBiologicalMotherDiagnosedOption10));
        myRASSurveyPage.dynamicallyEnterTextInCheckMarkedTextBox(8).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.dynamicallyEnterTextInCheckMarkedTextBox(8), testDataManager.wasYourBiologicalMotherDiagnosedOption8PleaseSpecify);
        myRASSurveyPage.dynamicallyEnterTextInCheckMarkedTextBox(9).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.dynamicallyEnterTextInCheckMarkedTextBox(9), testDataManager.wasYourBiologicalMotherDiagnosedOption9PleaseSpecify);
        myRASSurveyPage.dynamicallyEnterTextInCheckMarkedTextBox(10).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.dynamicallyEnterTextInCheckMarkedTextBox(10), testDataManager.wasYourBiologicalMotherDiagnosedOption10PleaseSpecify);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManager.duringHerPregnancyWithYouSupplements));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.duringHerPregnancyWithYouSupplements));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.duringHerPregnancyWithYouSupplements));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManager. pleaseSelectAllMedicationsYourMotherTookOption1));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.pleaseSelectAllMedicationsYourMotherTookOption1));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.pleaseSelectAllMedicationsYourMotherTookOption2));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.pleaseSelectAllMedicationsYourMotherTookOption3));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.pleaseSelectAllMedicationsYourMotherTookOption4));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.pleaseSelectAllMedicationsYourMotherTookOption5));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.pleaseSelectAllMedicationsYourMotherTookOption6));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.pleaseSelectAllMedicationsYourMotherTookOption7));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.pleaseSelectAllMedicationsYourMotherTookOption8));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.pleaseSelectAllMedicationsYourMotherTookOption9));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.pleaseSelectAllMedicationsYourMotherTookOption10));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.pleaseSelectAllMedicationsYourMotherTookOption11));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.pleaseSelectAllMedicationsYourMotherTookOption12));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.pleaseSelectAllMedicationsYourMotherTookOption13));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.pleaseSelectAllMedicationsYourMotherTookOption14));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.pleaseSelectAllMedicationsYourMotherTookOption15));
        myRASSurveyPage.dynamicallyEnterTextInCheckMarkedTextBox(13).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.dynamicallyEnterTextInCheckMarkedTextBox(13), testDataManager.pleaseSelectAllMedicationsYourMotherTookOption14PleaseSpecify);
        myRASSurveyPage.dynamicallyEnterTextInCheckMarkedTextBox(15).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.dynamicallyEnterTextInCheckMarkedTextBox(15), testDataManager.pleaseSelectAllMedicationsYourMotherTookOption15PleaseSpecify);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        MiscUtils.sleep(2000);
        String[] column1Values = {testDataManager.pleaseProvideDetailsOfTheMedicationTakenColumn1Option1,
                testDataManager.pleaseProvideDetailsOfTheMedicationTakenColumn1Option2,
                testDataManager.pleaseProvideDetailsOfTheMedicationTakenColumn1Option3,
                testDataManager.pleaseProvideDetailsOfTheMedicationTakenColumn1Option4,
                testDataManager.pleaseProvideDetailsOfTheMedicationTakenColumn1Option5,
                testDataManager.pleaseProvideDetailsOfTheMedicationTakenColumn1Option6,
                testDataManager.pleaseProvideDetailsOfTheMedicationTakenColumn1Option7,
                testDataManager.pleaseProvideDetailsOfTheMedicationTakenColumn1Option8,
                testDataManager.pleaseProvideDetailsOfTheMedicationTakenColumn1Option9,
                testDataManager.pleaseProvideDetailsOfTheMedicationTakenColumn1Option10,
                testDataManager.pleaseProvideDetailsOfTheMedicationTakenColumn1Option11,
                testDataManager.pleaseProvideDetailsOfTheMedicationTakenColumn1Option12,
                testDataManager.pleaseProvideDetailsOfTheMedicationTakenColumn1Option13,
                testDataManager.pleaseProvideDetailsOfTheMedicationTakenColumn1Option14,
                testDataManager.pleaseProvideDetailsOfTheMedicationTakenColumn1Option15};
        for(int j = 1;j < 16;j++){
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(j, 3).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(j, 3),column1Values[j-1]);
        }
        String[] column2Values = {testDataManager.pleaseProvideDetailsOfTheMedicationTakenColumn2Option1,
                testDataManager.pleaseProvideDetailsOfTheMedicationTakenColumn2Option2,
                testDataManager.pleaseProvideDetailsOfTheMedicationTakenColumn2Option3,
                testDataManager.pleaseProvideDetailsOfTheMedicationTakenColumn2Option4,
                testDataManager.pleaseProvideDetailsOfTheMedicationTakenColumn2Option5,
                testDataManager.pleaseProvideDetailsOfTheMedicationTakenColumn2Option6,
                testDataManager.pleaseProvideDetailsOfTheMedicationTakenColumn2Option7,
                testDataManager.pleaseProvideDetailsOfTheMedicationTakenColumn2Option8,
                testDataManager.pleaseProvideDetailsOfTheMedicationTakenColumn2Option9,
                testDataManager.pleaseProvideDetailsOfTheMedicationTakenColumn2Option10,
                testDataManager.pleaseProvideDetailsOfTheMedicationTakenColumn2Option11,
                testDataManager.pleaseProvideDetailsOfTheMedicationTakenColumn2Option12,
                testDataManager.pleaseProvideDetailsOfTheMedicationTakenColumn2Option13,
                testDataManager.pleaseProvideDetailsOfTheMedicationTakenColumn2Option14,
                testDataManager.pleaseProvideDetailsOfTheMedicationTakenColumn2Option15};
        for(int a = 1; a < 16; a++){
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(a, 6).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(a, 6),column2Values[a-1]);
        }
        String[] dropDownValues = {testDataManager.pleaseProvideDetailsOfTheMedicationTakenDROPDOWNOption1,
                testDataManager.pleaseProvideDetailsOfTheMedicationTakenDROPDOWNOption2,
                testDataManager.pleaseProvideDetailsOfTheMedicationTakenDROPDOWNOption3,
                testDataManager.pleaseProvideDetailsOfTheMedicationTakenDROPDOWNOption4,
                testDataManager.pleaseProvideDetailsOfTheMedicationTakenDROPDOWNOption5,
                testDataManager.pleaseProvideDetailsOfTheMedicationTakenDROPDOWNOption6,
                testDataManager.pleaseProvideDetailsOfTheMedicationTakenDROPDOWNOption7,
                testDataManager.pleaseProvideDetailsOfTheMedicationTakenDROPDOWNOption8,
                testDataManager.pleaseProvideDetailsOfTheMedicationTakenDROPDOWNOption9,
                testDataManager.pleaseProvideDetailsOfTheMedicationTakenDROPDOWNOption10,
                testDataManager.pleaseProvideDetailsOfTheMedicationTakenDROPDOWNOption11,
                testDataManager.pleaseProvideDetailsOfTheMedicationTakenDROPDOWNOption12,
                testDataManager.pleaseProvideDetailsOfTheMedicationTakenDROPDOWNOption13,
                testDataManager.pleaseProvideDetailsOfTheMedicationTakenDROPDOWNOption14,
                testDataManager.pleaseProvideDetailsOfTheMedicationTakenDROPDOWNOption15,};
        for(int b = 1; b < 16; b++){
            CommonUtils.selectDropDownValue(dropDownValues[b-1],myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationdropDown(b));
        }
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManager.didYourBiologicalMotherUseAnyTobacco));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.didYourBiologicalMotherUseAnyTobacco));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.didYourBiologicalMotherUseAnyTobacco));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManager.whatTobaccoProductsDidYourBiologicalMotherOption1));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.whatTobaccoProductsDidYourBiologicalMotherOption1));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.whatTobaccoProductsDidYourBiologicalMotherOption2));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.whatTobaccoProductsDidYourBiologicalMotherOption3));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.whatTobaccoProductsDidYourBiologicalMotherOption4));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.whatTobaccoProductsDidYourBiologicalMotherOption5));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.whatTobaccoProductsDidYourBiologicalMotherOption6));
        myRASSurveyPage.otherPleaseSpecifyTextBox.clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.otherPleaseSpecifyTextBox, testDataManager.whatTobaccoProductsDidYourBiologicalMotherOption6PleaseSpecify);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManager.didYourBiologicalMotherUseAnyVaping));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.didYourBiologicalMotherUseAnyVaping));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.didYourBiologicalMotherUseAnyVaping));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManager.whichVapingProductsDidYourMotherUseOption1));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.whichVapingProductsDidYourMotherUseOption1));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.whichVapingProductsDidYourMotherUseOption2));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.whichVapingProductsDidYourMotherUseOption3));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.whichVapingProductsDidYourMotherUseOption4));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.whichVapingProductsDidYourMotherUseOption5));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.whichVapingProductsDidYourMotherUseOption6));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.whichVapingProductsDidYourMotherUseOption7));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.whichVapingProductsDidYourMotherUseOption8));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.whichVapingProductsDidYourMotherUseOption9));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.whichVapingProductsDidYourMotherUseOption10));
        myRASSurveyPage.otherPleaseSpecifyTextBox.clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.otherPleaseSpecifyTextBox, testDataManager.whichVapingProductsDidYourMotherUseOption10PleaseSpecify);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManager.didYourBiologicalMotherDrink));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.didYourBiologicalMotherDrink));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.didYourBiologicalMotherDrink));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManager.WhatAlcoholicBeveragesDidYourMotherDrinkOption1));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.WhatAlcoholicBeveragesDidYourMotherDrinkOption1));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.WhatAlcoholicBeveragesDidYourMotherDrinkOption2));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.WhatAlcoholicBeveragesDidYourMotherDrinkOption3));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.WhatAlcoholicBeveragesDidYourMotherDrinkOption4));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.WhatAlcoholicBeveragesDidYourMotherDrinkOption5));
        myRASSurveyPage.otherPleaseSpecifyTextBox.clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.otherPleaseSpecifyTextBox, testDataManager.WhatAlcoholicBeveragesDidYourMotherDrinkOption5Other);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManager.didYourBiologicalMotherUseAnyRecreationalDrugs));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.didYourBiologicalMotherUseAnyRecreationalDrugs));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.didYourBiologicalMotherUseAnyRecreationalDrugs));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManager.whatRecreationalDrugOption1));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.whatRecreationalDrugOption1));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.whatRecreationalDrugOption2));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.whatRecreationalDrugOption3));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.whatRecreationalDrugOption4));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.whatRecreationalDrugOption5));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.whatRecreationalDrugOption6));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.whatRecreationalDrugOption7));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.whatRecreationalDrugOption8));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.whatRecreationalDrugOption9));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.whatRecreationalDrugOption10));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.whatRecreationalDrugOption11));
        myRASSurveyPage.otherPleaseSpecifyTextBox.clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.otherPleaseSpecifyTextBox, testDataManager.whatRecreationalDrugOption11Other);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManager.didYourBiologicalMotherEverLiveWhereSmokedCigarettes));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.didYourBiologicalMotherEverLiveWhereSmokedCigarettes));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.didYourBiologicalMotherEverLiveWhereSmokedCigarettes));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManager.whatProductsWereUsedAroundOption1));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.whatProductsWereUsedAroundOption1));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.whatProductsWereUsedAroundOption2));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.whatProductsWereUsedAroundOption3));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.whatProductsWereUsedAroundOption4));
        myRASSurveyPage.otherPleaseSpecifyTextBox.clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.otherPleaseSpecifyTextBox, testDataManager.whatProductsWereUsedAroundOption4Other);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3));
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3),testDataManager.biologicalMotherOccupationDuringPregnancy);
        JavascriptUtils.clickByJS(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(1, 6));
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 3),testDataManager.biologicalMotherOccupationDuringPregnancyFather);
        JavascriptUtils.clickByJS(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(2, 6));
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.whatIsTheHeightOfYourBiologicalMotherAndFatherText);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3),testDataManager.whatIsTheHeightOfYourBiologicalMother);
        JavascriptUtils.clickByJS(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(1, 6));
        JavascriptUtils.clickByJS(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(1, 10));
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 3),testDataManager.whatIsTheHeightOfYourBiologicalFather);
        JavascriptUtils.clickByJS(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(2, 6));
        JavascriptUtils.clickByJS(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(2, 10));
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.rasSurveyTheNextSetOfQuestionsWillAskAboutHormoneRelatedGrowthText);
        CommonUtils.assertEqualsWithMessage(testDataManager.theNextSetHormoneRelatedGrowth,myRASSurveyPage.rasSurveyText.getText(), "-- VERIFYING THE NEXT SET OF QUESTIONS WILL ASK ABOUT HORMONE RELATED GROWTH TEXT --");
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
    }

    public void rasScreenerSurveyScenario1partTwo(){
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouEverBeenEvaluatedByAnEndocrinologist));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouEverBeenEvaluatedByAnEndocrinologist));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouEverBeenEvaluatedByAnEndocrinologist));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.enterTextInDoctorLocationHospitalTextBox(1));
        myRASSurveyPage.enterTextInDoctorLocationHospitalTextBox(1).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInDoctorLocationHospitalTextBox(1),testDataManager.whatIsTheNameOfTheEndocrinologistDoctor);
        myRASSurveyPage.enterTextInDoctorLocationHospitalTextBox(2).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInDoctorLocationHospitalTextBox(2),testDataManager.whatIsTheNameOfTheEndocrinologistLocation);
        myRASSurveyPage.enterTextInDoctorLocationHospitalTextBox(3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInDoctorLocationHospitalTextBox(3),testDataManager.whatIsTheNameOfTheEndocrinologistHospital);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouEverHadGrowthHormoneTesting));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouEverHadGrowthHormoneTesting));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouEverHadGrowthHormoneTesting));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManager.whatWereTheResultsOfYourGrowthHormoneOption1));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.whatWereTheResultsOfYourGrowthHormoneOption1));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.whatWereTheResultsOfYourGrowthHormoneOption2));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.whatWereTheResultsOfYourGrowthHormoneOption3));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.whatWereTheResultsOfYourGrowthHormoneOption4));
        myRASSurveyPage.otherPleaseSpecifyTextBox.clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.otherPleaseSpecifyTextBox, testDataManager.whatWereTheResultsOfYourGrowthHormoneOption4Other);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouEverReceivedGrowthHormoneTreatment));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouEverReceivedGrowthHormoneTreatment));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouEverReceivedGrowthHormoneTreatment));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManager.whatWasYourHeightBeforeStartingGrowthHormone));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.whatWasYourHeightBeforeStartingGrowthHormone));
        myRASSurveyPage.whatWasYourHeightBeforeStartingGrowthHormoneHeightTextBox.clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.whatWasYourHeightBeforeStartingGrowthHormoneHeightTextBox, testDataManager.whatWasYourHeightBeforeStartingGrowthHormoneHeight);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.howManyTimesHaveYouReceivedGrowthHormoneTreatmentDropDown);
        CommonUtils.selectDropDownValue(testDataManager.howManyTimesHaveYouReceivedGrowthHormoneTreatment,myRASSurveyPage.howManyTimesHaveYouReceivedGrowthHormoneTreatmentDropDown);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3));
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3),testDataManager.pleaseProvideTheDetailsOfGrowthHormoneReplacementAgeStart);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 4).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 4),testDataManager.pleaseProvideTheDetailsOfGrowthHormoneReplacementAgeStopped);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 7).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 7),testDataManager.pleaseProvideTheDetailsOfGrowthHormoneReplacementDateStart);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 8).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 8),testDataManager.pleaseProvideTheDetailsOfGrowthHormoneReplacementDateStopped);
        JavascriptUtils.clickByJS(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(1, 11));
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.theNextSetOfQuestionsWillAskAboutDevelopmentText);
        CommonUtils.assertEqualsWithMessage(testDataManager.theNextSetOfQuestionsWillAskAboutDevelopment,myRASSurveyPage.rasSurveyText.getText(), "-- VERIFYING THE NEXT SET OF QUESTIONS WILL ASK ABOUT DEVELOPMENT TEXT --");
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManager.wereYouEverDiagnosedWithHypotoniaAsAnInfantOrChild));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.wereYouEverDiagnosedWithHypotoniaAsAnInfantOrChild));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.wereYouEverDiagnosedWithHypotoniaAsAnInfantOrChild));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManager.atWhatAgeWereYouAbleToSitWithoutSupport));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.atWhatAgeWereYouAbleToSitWithoutSupport));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.atWhatAgeWereYouAbleToSitWithoutSupport));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.atWhatAgeWereYouAbleToWalkWithoutSupportText);
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.atWhatAgeWereYouAbleToWalkWithoutSupport));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouEverReceivedPhysicalTherapy));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouEverReceivedPhysicalTherapy));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouEverReceivedPhysicalTherapy));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManager.atWhatAgeWereYouAbleToUseSimpleTwoWordPhrases));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.atWhatAgeWereYouAbleToUseSimpleTwoWordPhrases));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.atWhatAgeWereYouAbleToUseSimpleTwoWordPhrases));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManager.howWouldYouDescribeYourCurrentSpeechCapabilities));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.howWouldYouDescribeYourCurrentSpeechCapabilities));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.howWouldYouDescribeYourCurrentSpeechCapabilities));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouEverReceivedSpeechTherapy));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouEverReceivedSpeechTherapy));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouEverReceivedSpeechTherapy));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManager.betweenTheAgesOf3And6YearsOld));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.betweenTheAgesOf3And6YearsOld));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.betweenTheAgesOf3And6YearsOld));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManager.didYouReceiveOccupationalTherapyBetween3And6YearsOfAge));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.didYouReceiveOccupationalTherapyBetween3And6YearsOfAge));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.didYouReceiveOccupationalTherapyBetween3And6YearsOfAge));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManager.betweenTheAgesOf6And10));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.betweenTheAgesOf6And10));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.betweenTheAgesOf6And10));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManager.betweenTheAgesOf10And17));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.betweenTheAgesOf10And17));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.betweenTheAgesOf10And17));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManager.pleaseIndicateTheHighestDegree));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.pleaseIndicateTheHighestDegree));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.pleaseIndicateTheHighestDegree));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManager.whatIsYourCurrentEmploymentStatus));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.whatIsYourCurrentEmploymentStatus));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.whatIsYourCurrentEmploymentStatus));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouEverBeenDiagnosedWithLearningDifferencesOption1));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouEverBeenDiagnosedWithLearningDifferencesOption1));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouEverBeenDiagnosedWithLearningDifferencesOption2));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouEverBeenDiagnosedWithLearningDifferencesOption3));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouEverBeenDiagnosedWithLearningDifferencesOption4));
        myRASSurveyPage.otherPleaseSpecifyTextBox.clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.otherPleaseSpecifyTextBox, testDataManager.haveYouEverBeenDiagnosedWithLearningDifferencesOption4Other);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
    }

    public void rasScreenerSurveyScenario1partThree() {
//        CommonUtils.sendKeys(myRASSurveyPage.rasSurveyAffFile,COVIDConstants.IIQ_STUDY_DOCUMENTATION_PDF_PATH);
//        MiscUtils.sleep(2000);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.theNextSetOfQuestionsWillAskAboutHeartText);
        CommonUtils.assertEqualsWithMessage(testDataManager.theNextSetOfQuestionsWillAskAboutHeart, myRASSurveyPage.rasSurveyText.getText(), "-- VERIFYING THE NEXT SET OF QUESTIONS WILL ASK ABOUT HEART TEXT --");
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouEverBeenEvaluatedByACardiologist));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouEverBeenEvaluatedByACardiologist));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouEverBeenEvaluatedByACardiologist));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.enterTextInDoctorLocationHospitalTextBox(1));
        myRASSurveyPage.enterTextInDoctorLocationHospitalTextBox(1).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInDoctorLocationHospitalTextBox(1), testDataManager.whatIsTheNameOfTheCardiologistDoctor);
        myRASSurveyPage.enterTextInDoctorLocationHospitalTextBox(2).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInDoctorLocationHospitalTextBox(2), testDataManager.whatIsTheNameOfTheCardiologistLocation);
        myRASSurveyPage.enterTextInDoctorLocationHospitalTextBox(3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInDoctorLocationHospitalTextBox(3), testDataManager.whatIsTheNameOfTheCardiologistHospital);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouEverBeenDiagnosedWithAnyStructuralHeartIssues));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouEverBeenDiagnosedWithAnyStructuralHeartIssues));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouEverBeenDiagnosedWithAnyStructuralHeartIssues));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForClickability(myRASSurveyPage.pulmonaryValveButton);
        JavascriptUtils.clickByJS(myRASSurveyPage.pulmonaryValveButton);
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouEverBeenDiagnosedWithAnyOfTheFollowingStructuralHeartIssuesOption2));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouEverBeenDiagnosedWithAnyOfTheFollowingStructuralHeartIssuesOption3));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouEverBeenDiagnosedWithAnyOfTheFollowingStructuralHeartIssuesOption4));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouEverBeenDiagnosedWithAnyOfTheFollowingStructuralHeartIssuesOption5));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouEverBeenDiagnosedWithAnyOfTheFollowingStructuralHeartIssuesOption6));
        myRASSurveyPage.otherPleaseSpecifyTextBox.clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.otherPleaseSpecifyTextBox, testDataManager.haveYouEverBeenDiagnosedWithAnyOfTheFollowingStructuralHeartIssuesOption6Other);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouEverHadAnyOfTheFollowingSymptomsOption1));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouEverHadAnyOfTheFollowingSymptomsOption1));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouEverHadAnyOfTheFollowingSymptomsOption2));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouEverHadAnyOfTheFollowingSymptomsOption3));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouEverHadAnyOfTheFollowingSymptomsOption4));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouEverHadAnyOfTheFollowingSymptomsOption5));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouEverHadAnyOfTheFollowingSymptomsOption6));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouEverHadAnyOfTheFollowingSymptomsOption7));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouEverHadAnyOfTheFollowingSymptomsOption8));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouEverHadAnyOfTheFollowingSymptomsOption9));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouEverHadAnyOfTheFollowingSymptomsOption10));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouEverHadAnyOfTheFollowingSymptomsOption11));
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        String[] column1Value = {testDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn1Option1,
                testDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn1Option2,
                testDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn1Option3,
                testDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn1Option4,
                testDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn1Option5,
                testDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn1Option6,
                testDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn1Option7,
                testDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn1Option8,
                testDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn1Option9,
                testDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn1Option10,
                testDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn1Option11};
        for (int c = 1; c < 12; c++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(c, 3).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(c, 3), column1Value[c - 1]);
        }
        String[] column2Value = {testDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn2Option1,
                testDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn2Option2,
                testDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn2Option3,
                testDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn2Option4,
                testDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn2Option5,
                testDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn2Option6,
                testDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn2Option7,
                testDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn2Option8,
                testDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn2Option9,
                testDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn2Option10,
                testDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn2Option11};
        for (int d = 1; d < 12; d++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(d, 4).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(d, 4), column2Value[d - 1]);
        }
        String[] column3Value = {testDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn3Option1,
                testDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn3Option2,
                testDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn3Option3,
                testDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn3Option4,
                testDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn3Option5,
                testDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn3Option6,
                testDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn3Option7,
                testDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn3Option8,
                testDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn3Option9,
                testDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn3Option10,
                testDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn3Option11};
        for (int e = 1; e < 12; e++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(e, 5).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(e, 5), column3Value[e - 1]);
        }
        String[] column4Value = {testDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn4Option1,
                testDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn4Option2,
                testDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn4Option3,
                testDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn4Option4,
                testDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn4Option5,
                testDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn4Option6,
                testDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn4Option7,
                testDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn4Option8,
                testDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn4Option9,
                testDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn4Option10,
                testDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn4Option11};
        for (int f = 1; f < 12; f++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(f, 8).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(f, 8), column4Value[f - 1]);
        }
        String[] column5Value = {testDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn5Option1,
                testDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn5Option2,
                testDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn5Option3,
                testDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn5Option4,
                testDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn5Option5,
                testDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn5Option6,
                testDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn5Option7,
                testDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn5Option8,
                testDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn5Option9,
                testDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn5Option10,
                testDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn5Option11};
        for (int g = 1; g < 12; g++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(g, 11).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(g, 11), column5Value[g - 1]);
        }
        String[] column6Value = {testDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn6Option1,
                testDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn6Option2,
                testDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn6Option3,
                testDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn6Option4,
                testDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn6Option5,
                testDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn6Option6,
                testDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn6Option7,
                testDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn6Option8,
                testDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn6Option9,
                testDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn6Option10,
                testDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn6Option11};
        for (int h = 1; h < 12; h++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(h, 12).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(h, 12), column6Value[h - 1]);
        }
        String[] column7Value = {testDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn7Option1,
                testDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn7Option2,
                testDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn7Option3,
                testDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn7Option4,
                testDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn7Option5,
                testDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn7Option6,
                testDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn7Option7,
                testDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn7Option8,
                testDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn7Option9,
                testDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn7Option10,
                testDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn7Option11};
        for (int k = 1; k < 12; k++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(k, 13).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(k, 13), column7Value[k - 1]);
        }
        String[] column8Value = {testDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn8Option1,
                testDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn8Option2,
                testDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn8Option3,
                testDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn8Option4,
                testDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn8Option5,
                testDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn8Option6,
                testDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn8Option7,
                testDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn8Option8,
                testDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn8Option9,
                testDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn8Option10,
                testDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn8Option11};
        for (int l = 1; l < 12; l++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(l, 16).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(l, 16), column8Value[l - 1]);
        }
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouEverReceivedTreatmentForHeartProblems));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouEverReceivedTreatmentForHeartProblems));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouEverReceivedTreatmentForHeartProblems));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouEverHadAnyOfTheFollowingTreatmentsForHeartOption1));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouEverHadAnyOfTheFollowingTreatmentsForHeartOption1));
        JavascriptUtils.clickByJS(myRASSurveyPage.catheterInterventionTextBox);
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouEverHadAnyOfTheFollowingTreatmentsForHeartOption3));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouEverHadAnyOfTheFollowingTreatmentsForHeartOption4));
        myRASSurveyPage.otherPleaseSpecifyTextBox.clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.otherPleaseSpecifyTextBox, testDataManager.haveYouEverHadAnyOfTheFollowingTreatmentsForHeartOption4Specify);
        CommonUtils.sendKeysToElement(myRASSurveyPage.medicationPleaseSpecifyTextBox, testDataManager.haveYouEverHadAnyOfTheFollowingTreatmentsForHeartOption1Specify);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForClickability(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3));
        String[] column1ValueFirstTreatment = {testDataManager.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn1Option1,
                testDataManager.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn1Option2,
                testDataManager.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn1Option3,
                testDataManager.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn1Option4};
        for (int m = 1; m < 5; m++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(m, 3).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(m, 3), column1ValueFirstTreatment[m - 1]);
        }
        String[] column2ValueFirstTreatment = {testDataManager.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn2Option1,
                testDataManager.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn2Option2,
                testDataManager.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn2Option3,
                testDataManager.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn2Option4};
        for (int n = 1; n < 5; n++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(n, 4).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(n, 4), column2ValueFirstTreatment[n - 1]);
        }
        String[] column3ValueFirstTreatment = {testDataManager.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn3Option1,
                testDataManager.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn3Option2,
                testDataManager.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn3Option3,
                testDataManager.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn3Option4};
        for (int o = 1; o < 5; o++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(o, 5).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(o, 5), column3ValueFirstTreatment[o - 1]);
        }
        String[] column4ValueFirstTreatment = {testDataManager.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn4Option1,
                testDataManager.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn4Option2,
                testDataManager.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn4Option3,
                testDataManager.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn4Option4};
        for (int p = 1; p < 5; p++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(p, 8).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(p, 8), column4ValueFirstTreatment[p - 1]);
        }
        String[] column5ValueFirstTreatment = {testDataManager.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn5Option1,
                testDataManager.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn5Option2,
                testDataManager.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn5Option3,
                testDataManager.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn5Option4};
        for (int q = 1; q < 5; q++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(q, 11).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(q, 11), column5ValueFirstTreatment[q - 1]);
        }
        String[] column6ValueFirstTreatment = {testDataManager.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn6Option1,
                testDataManager.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn6Option2,
                testDataManager.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn6Option3,
                testDataManager.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn6Option4};
        for (int r = 1; r < 5; r++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(r, 12).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(r, 12), column6ValueFirstTreatment[r - 1]);
        }
        String[] column7ValueFirstTreatment = {testDataManager.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn7Option1,
                testDataManager.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn7Option2,
                testDataManager.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn7Option3,
                testDataManager.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn7Option4};
        for (int s = 1; s < 5; s++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(s, 13).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(s, 13), column7ValueFirstTreatment[s - 1]);
        }
        String[] column8ValueFirstTreatment = {testDataManager.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn8Option1,
                testDataManager.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn8Option2,
                testDataManager.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn8Option3,
                testDataManager.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn8Option4};
        for (int t = 1; t < 5; t++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(t, 16).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(t, 16), column8ValueFirstTreatment[t - 1]);
        }
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManager.areYouStillOn));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.areYouStillOn));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.areYouStillOn));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouEverBeenDiagnosedWithAnyFunctionalHeartIssues));
        CommonUtils.waitForVisibility(myRASSurveyPage.haveYouEverBeenDiagnosedWithAnyFunctionalHeartIssueText);
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouEverBeenDiagnosedWithAnyFunctionalHeartIssues));
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.haveYouEverBeenDiagnosedOption1CheckBox);
        JavascriptUtils.clickByJS(myRASSurveyPage.haveYouEverBeenDiagnosedOption2CheckBox);
        JavascriptUtils.clickByJS(myRASSurveyPage.haveYouEverBeenDiagnosedOption3CheckBox);
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouEverBeenDiagnosedWithAnyFunctionalHeartIssuesOption4));
        myRASSurveyPage.otherPleaseSpecifyTextBox.clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.otherPleaseSpecifyTextBox, testDataManager.haveYouEverBeenDiagnosedWithAnyFunctionalHeartIssuesOption4Other);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForClickability(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3));
        String[] column1ValueConditions = {testDataManager.pleaseProvideAnyDetailsKnownForTheConditionsColumn1Option1,
                testDataManager.pleaseProvideAnyDetailsKnownForTheConditionsColumn1Option2,
                testDataManager.pleaseProvideAnyDetailsKnownForTheConditionsColumn1Option3,
                testDataManager.pleaseProvideAnyDetailsKnownForTheConditionsColumn1Option4};
        for (int mm = 1; mm < 5; mm++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(mm, 3).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(mm, 3), column1ValueConditions[mm - 1]);
        }
        String[] column2ValueConditions = {testDataManager.pleaseProvideAnyDetailsKnownForTheConditionsColumn2Option1,
                testDataManager.pleaseProvideAnyDetailsKnownForTheConditionsColumn2Option2,
                testDataManager.pleaseProvideAnyDetailsKnownForTheConditionsColumn2Option3,
                testDataManager.pleaseProvideAnyDetailsKnownForTheConditionsColumn2Option4};
        for (int nn = 1; nn < 5; nn++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(nn, 4).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(nn, 4), column2ValueConditions[nn - 1]);
        }
        String[] column3ValueConditions = {testDataManager.pleaseProvideAnyDetailsKnownForTheConditionsColumn3Option1,
                testDataManager.pleaseProvideAnyDetailsKnownForTheConditionsColumn3Option2,
                testDataManager.pleaseProvideAnyDetailsKnownForTheConditionsColumn3Option3,
                testDataManager.pleaseProvideAnyDetailsKnownForTheConditionsColumn3Option4};
        for (int oo = 1; oo < 5; oo++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(oo, 5).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(oo, 5), column3ValueConditions[oo - 1]);
        }
        String[] column4ValueConditions = {testDataManager.pleaseProvideAnyDetailsKnownForTheConditionsColumn4Option1,
                testDataManager.pleaseProvideAnyDetailsKnownForTheConditionsColumn4Option2,
                testDataManager.pleaseProvideAnyDetailsKnownForTheConditionsColumn4Option3,
                testDataManager.pleaseProvideAnyDetailsKnownForTheConditionsColumn4Option4};
        for (int pp = 1; pp < 5; pp++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(pp, 8).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(pp, 8), column4ValueConditions[pp - 1]);
        }
        String[] column5ValueConditions = {testDataManager.pleaseProvideAnyDetailsKnownForTheConditionsColumn5Option1,
                testDataManager.pleaseProvideAnyDetailsKnownForTheConditionsColumn5Option2,
                testDataManager.pleaseProvideAnyDetailsKnownForTheConditionsColumn5Option3,
                testDataManager.pleaseProvideAnyDetailsKnownForTheConditionsColumn5Option4};
        for (int qq = 1; qq < 5; qq++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(qq, 9).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(qq, 9), column5ValueConditions[qq - 1]);
        }
        String[] column6ValueConditions = {testDataManager.pleaseProvideAnyDetailsKnownForTheConditionsColumn6Option1,
                testDataManager.pleaseProvideAnyDetailsKnownForTheConditionsColumn6Option2,
                testDataManager.pleaseProvideAnyDetailsKnownForTheConditionsColumn6Option3,
                testDataManager.pleaseProvideAnyDetailsKnownForTheConditionsColumn6Option4};
        for (int rr = 1; rr < 5; rr++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(rr, 10).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(rr, 10), column6ValueConditions[rr - 1]);
        }
        String[] column7ValueConditions = {testDataManager.pleaseProvideAnyDetailsKnownForTheConditionsColumn7Option1,
                testDataManager.pleaseProvideAnyDetailsKnownForTheConditionsColumn7Option2,
                testDataManager.pleaseProvideAnyDetailsKnownForTheConditionsColumn7Option3,
                testDataManager.pleaseProvideAnyDetailsKnownForTheConditionsColumn7Option4};
        for (int ss = 1; ss < 5; ss++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(ss, 13).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(ss, 13), column7ValueConditions[ss - 1]);
        }
        String[] column8ValueConditions = {testDataManager.pleaseProvideAnyDetailsKnownForTheConditionsColumn8Option1,
                testDataManager.pleaseProvideAnyDetailsKnownForTheConditionsColumn8Option2,
                testDataManager.pleaseProvideAnyDetailsKnownForTheConditionsColumn8Option3,
                testDataManager.pleaseProvideAnyDetailsKnownForTheConditionsColumn8Option4};
        for (int tt = 1; tt < 5; tt++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(tt, 16).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(tt, 16), column8ValueConditions[tt - 1]);
        }
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.theNextTwoQuestionsWillAskAboutRASopathyDiagnosesText);
        CommonUtils.assertEqualsWithMessage(testDataManager.theNextTwoQuestionsWillAskAboutRASopathyDiagnoses, myRASSurveyPage.rasSurveyText.getText(), "-- VERIFYING THE NEXT TWO QUESTIONS WILL ASK ABOUT RASOPATHY DIAGNOSES TEXT --");
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
    }
    public void rasScreenerSurveyScenario1partFour() {
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouBeenDiagnosedWithARASopathy));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouBeenDiagnosedWithARASopathy));
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManager.pleaseIndicateIfYouHaveBeenDiagnosedWithRASopathiesOption1));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.pleaseIndicateIfYouHaveBeenDiagnosedWithRASopathiesOption1));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.pleaseIndicateIfYouHaveBeenDiagnosedWithRASopathiesOption2));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.pleaseIndicateIfYouHaveBeenDiagnosedWithRASopathiesOption3));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.pleaseIndicateIfYouHaveBeenDiagnosedWithRASopathiesOption4));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.pleaseIndicateIfYouHaveBeenDiagnosedWithRASopathiesOption5));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.pleaseIndicateIfYouHaveBeenDiagnosedWithRASopathiesOption6));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.pleaseIndicateIfYouHaveBeenDiagnosedWithRASopathiesOption7));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.pleaseIndicateIfYouHaveBeenDiagnosedWithRASopathiesOption8));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.pleaseIndicateIfYouHaveBeenDiagnosedWithRASopathiesOption9));
        myRASSurveyPage.otherPleaseSpecifyTextBox.clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.otherPleaseSpecifyTextBox, testDataManager.pleaseIndicateIfYouHaveBeenDiagnosedWithRASopathiesOption9Other);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.theNextTwoQuestionsWillAskAboutMedicalHistoryText);
        CommonUtils.assertEqualsWithMessage(testDataManager.theNextSetOfQuestionsWillAskAboutGeneralMedicalHistory, myRASSurveyPage.rasSurveyText.getText(), "-- VERIFYING THE NEXT SET OF QUESTIONS WILL ASK ABOUT GENERAL MEDICAL HISTORY TEXT --");
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(rasopathyQuestionnairePage.dynamicLocator(testDataManager.doYouHaveAPrimaryCareProvider));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.doYouHaveAPrimaryCareProvider));
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.enterTextInDoctorLocationHospitalTextBox(1));
        myRASSurveyPage.enterTextInDoctorLocationHospitalTextBox(1).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInDoctorLocationHospitalTextBox(1), testDataManager.pleaseProvideTheInformationForYourPrimaryCareProviderBelowDoctor);
        myRASSurveyPage.enterTextInDoctorLocationHospitalTextBox(2).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInDoctorLocationHospitalTextBox(2), testDataManager.pleaseProvideTheInformationForYourPrimaryCareProviderBelowLocation);
        myRASSurveyPage.enterTextInDoctorLocationHospitalTextBox(3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInDoctorLocationHospitalTextBox(3), testDataManager.pleaseProvideTheInformationForYourPrimaryCareProviderBelowHospital);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForClickability(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(1, 3));
        JavascriptUtils.clickByJS(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(1, 3));
        JavascriptUtils.clickByJS(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(2, 3));
        JavascriptUtils.clickByJS(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(3, 3));
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.addButton);
        JavascriptUtils.clickByJS(myRASSurveyPage.addButton);
        CommonUtils.waitForVisibility(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3));
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3), testDataManager.pleaseCompleteAllMedicationsToWhichYouAreAllergicColumn1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 6).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 6), testDataManager.pleaseCompleteAllMedicationsToWhichYouAreAllergicColumn2);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.pleaseCompleteTheTableBelowForAllFoodsText);
        JavascriptUtils.clickByJS(myRASSurveyPage.addButton);
        CommonUtils.waitForVisibility(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3));
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3), testDataManager.pleaseCompleteAllFoodsToWhichYouAreAllergicColumn1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 6).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 6), testDataManager.pleaseCompleteAllFoodsToWhichYouAreAllergicColumn2);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.pleaseCompleteTheTableBelowForAllOtherText);
        JavascriptUtils.clickByJS(myRASSurveyPage.addButton);
        CommonUtils.waitForVisibility(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3));
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3), testDataManager.pleaseCompleteAllOtherToWhichYouAreAllergicColumn1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 6).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 6), testDataManager.pleaseCompleteAllOtherToWhichYouAreAllergicColumn2);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouEverHadAnOperationOrBiopsy));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouEverHadAnOperationOrBiopsy));
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.addButton);
        JavascriptUtils.clickByJS(myRASSurveyPage.addButton);
        CommonUtils.waitForVisibility(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3));
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3), testDataManager.pleaseProvideTheInformationForEachBiopsyColumn1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 6).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 6), testDataManager.pleaseProvideTheInformationForEachBiopsyColumn2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 7).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 7), testDataManager.pleaseProvideTheInformationForEachBiopsyColumn3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 8).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 8), testDataManager.pleaseProvideTheInformationForEachBiopsyColumn4);
        CommonUtils.selectDropDownValue(testDataManager.pleaseProvideTheInformationForEachBiopsyColumn5, myRASSurveyPage.dynamicDropDownTwo(1, 11));
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 14).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 14), testDataManager.pleaseProvideTheInformationForEachBiopsyColumn6);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouEverBeenHospitalizedForAnyReason));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouEverBeenHospitalizedForAnyReason));
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.addButton);
        JavascriptUtils.clickByJS(myRASSurveyPage.addButton);
        CommonUtils.waitForVisibility(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3));
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3), testDataManager.pleaseProvideTheInformationForEachHospitalizationColumn1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 6).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 6), testDataManager.pleaseProvideTheInformationForEachHospitalizationColumn2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 7).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 7), testDataManager.pleaseProvideTheInformationForEachHospitalizationColumn3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 8).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 8), testDataManager.pleaseProvideTheInformationForEachHospitalizationColumn4);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 11).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 11), testDataManager.pleaseProvideTheInformationForEachHospitalizationColumn5);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.theNextTwoQuestionsWillAskAboutGiText);
        CommonUtils.assertEqualsWithMessage(testDataManager.theNextSetOfQuestionsWillAskAboutGi, myRASSurveyPage.rasSurveyText.getText(), "-- VERIFYING THE NEXT SET OF QUESTIONS WILL ASK ABOUT GI TEXT --");
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
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
        testDataManager.dataInitializerRasScreener("screenerScenario1");
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
        CommonUtils.clickOnElement(participantDetailsPage.dynamicRecordButtonLocator(testDataManager.firstName + rASScreenerScenario1_Constants.SPACE + testDataManager.lastName));
        CucumberLogUtils.logToConsole("---- VERIFYING PARTICIPANT RECORD PREVIEW DATA ----");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(participantDetailsPage.firstNameRecordPreviewField), testDataManager.firstName, "-- VERIFYING PREVIEW RECORD FIRST NAME --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(participantDetailsPage.lastNameRecordPreviewField), testDataManager.lastName, "-- VERIFYING PREVIEW RECORD LAST NAME --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(participantDetailsPage.middleNameRecordPreviewField), testDataManager.middleInitial, "-- VERIFYING PREVIEW RECORD MIDDLE NAME --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(participantDetailsPage.contactHomePhoneRecordPreviewField), testDataManager.homePhoneNumber, "-- VERIFYING PREVIEW RECORD CONTACT HOME PHONE NUMBER --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(participantDetailsPage.contactEmailRecordPreviewField), testDataManager.emailAddress, "-- VERIFYING PREVIEW RECORD CONTACT EMAIL ADDRESS --");
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        CommonUtils.clickOnElement(participantDetailsPage.openRecordButton);
        CucumberLogUtils.logToConsole("---- VERIFYING PARTICIPANT NAME DATA ----");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(participantDetailsPage.nameTextBox), testDataManager.firstName + rASScreenerScenario1_Constants.SPACE + testDataManager.lastName, "-- VERIFYING FULL NAME --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(participantDetailsPage.firstNameTextBox), testDataManager.firstName, "-- VERIFYING FIRST NAME --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(participantDetailsPage.middleInitialTextBox), testDataManager.middleInitial, "-- VERIFYING MIDDLE INITIAL --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(participantDetailsPage.lastNameTextBox), testDataManager.lastName, "-- VERIFYING LAST NAME --");
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        CommonUtils.clickOnElement(participantDetailsPage.demographicsTab);
        CucumberLogUtils.logToConsole("---- VERIFYING PARTICIPANT DEMOGRAPHICS DATA ----");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(participantDetailsPage.dateOfBirthTextBox), testDataManager.whatIsYourDateOfBirth, "-- VERIFYING DATE OF BIRTH --");
        CommonUtils.verifyingDropDownValueIsSelected(participantDetailsPage.biologicalGenderDropDown, testDataManager.sexAssignedAtBirthOption, "-- VERIFYING BIOLOGICAL GENDER --");
        CommonUtils.verifyingDropDownValueIsSelected(participantDetailsPage.isParticipantAdoptedDropDown, testDataManager.areYouAdoptedOption, "-- VERIFYING IF THE PARTICIPANT IS ADOPTED --");
        CommonUtils.assertEqualsWithMessage(participantDetailsPage.participantRacePreferNotToAnswerOption.getText(), testDataManager.whatIsYourRace, "-- VERIFYING RACE --");
        CommonUtils.verifyingDropDownValueIsSelected(participantDetailsPage.ethnicityDropDownOption, testDataManager.whatIsYourEthnicity, "-- VERIFYING ETHNICITY --");
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        CommonUtils.clickOnElement(participantDetailsPage.contactInfoTab);
        CucumberLogUtils.logToConsole("---- VERIFYING PARTICIPANT CONTACT INFORMATION DATA ----");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(participantDetailsPage.contactStreetAddress), testDataManager.street + rASScreenerScenario1_Constants.SPACE + testDataManager.street2, "-- VERIFYING CONTACT STREET ADDRESS --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(participantDetailsPage.contactState), testDataManager.state, "-- VERIFYING CONTACT STATE --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(participantDetailsPage.contactCity), testDataManager.city, "- VERIFYING CONTACT CITY --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(participantDetailsPage.contactZipCode), testDataManager.zipcode, "-- VERIFYING ZIP CODE --");
        CommonUtils.verifyingDropDownValueIsSelected(participantDetailsPage.contactCountryDropDown, testDataManager.countryOption, "-- VERIFYING CONTACT COUNTRY --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(participantDetailsPage.contactEmailAddress), testDataManager.emailAddress, "-- VERIFYING CONTACT EMAIL ADDRESS --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(participantDetailsPage.contactHomePhone), testDataManager.homePhoneNumber, "-- VERIFYING CONTACT HOME PHONE --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(participantDetailsPage.contactCellPhone), testDataManager.cellPhoneNumber, "-- VERIFYING CONTACT CELL PHONE --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(participantDetailsPage.contactWorkPhone), testDataManager.workPhoneNumber, "-- VERIFYING CONTACT WORK PHONE --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(participantDetailsPage.contactPreferredPhone), testDataManager.cellPhoneNumber, "-- VERIFYING PREFERRED PHONE --");
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        CommonUtils.clickOnElement(participantDetailsPage.medicalInformationTab);
        CucumberLogUtils.logToConsole("---- VERIFYING PARTICIPANT MEDICAL INFORMATION DATA ----");
        CommonUtils.verifyingDropDownValueIsSelected(participantDetailsPage.hasAPhysicianEverDiagnosedThisParticipantWithCancerDropDown, testDataManager.haveYouBeenDiagnosedWithCancer, "-- VERIFYING IF PARTICIPANT HAS BEEN DIAGNOSED WITH CANCER --");
        rasScreenerScenario1StepsImpl.verifyingDropDownOption(participantDetailsPage.vitalStatusYesDropDownOption, "-- VERIFYING VITAL STATUS --");
        CommonUtils.verifyingDropDownValueIsSelected(participantDetailsPage.hasTheParticipantEverHadGeneticTestingDropDown, testDataManager.haveYouEverHadGeneticTesting, "-- VERIFYING IF THE PARTICIPANT HAS HAD GENETIC TESTING --");
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        CommonUtils.clickOnElement(participantDetailsPage.rasopathyHistoryTab);
        CucumberLogUtils.logToConsole("---- VERIFYING PARTICIPANT RASOPATHY HISTORY DATA ----");
        CommonUtils.verifyingDropDownValueIsSelected(participantDetailsPage.haveYouBeenDiagnosedWithARasopathyDropDown, testDataManager.haveYouBeenDiagnosedWithARasopathy, "-- VERIFYING IF PARTICIPANT HAS BEEN DIAGNOSED WITH A RASOPATHY --");
        CommonUtils.verifyingDropDownValueIsSelected(participantDetailsPage.haveAnyOfYourBiologicalRelativesBeenDiagnosedWithARasopathyDropDown, testDataManager.haveAnyOfYourBiologicalRelativesBeenDiagnosedWithARasopathy, "-- VERIFYING IF BIOLOGICAL RELATIVES HAVE BEEN DIAGNOSED WITH A RASOPATHY --");
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        CucumberLogUtils.logToConsole("---- OPENING AND VERIFYING SCREENER RECORD DATA ----");
        CommonUtils.clickOnElement(screenerRecordTablePage.referralPreviewButton);
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(screenerRecordTablePage.screenerPreviewFamilyMemberRecordField), testDataManager.firstName + rASScreenerScenario1_Constants.SPACE + testDataManager.lastName, "-- VERIFYING SCREENER PREVIEW RECORD FAMILY MEMBER RECORD NAME --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(screenerRecordTablePage.screenerPreviewContactEmailAddressField), testDataManager.emailAddress, "-- VERIFYING SCREENER PREVIEW RECORD CONTACT EMAIL ADDRESS FIELD --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(screenerRecordTablePage.screenerPreviewStudyField), rASScreenerScenario1_Constants.RAS_STUDY, "-- VERIFYING SCREENER PREVIEW STUDY FIELD --");
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        CommonUtils.clickOnElement(screenerRecordTablePage.openRecordButton);
        CucumberLogUtils.logToConsole("---- VERIFYING SCREENER RECORD NAME AND CONTACT INFORMATION DATA ----");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(screenerRecordTablePage.screenerStudyField), rASScreenerScenario1_Constants.RAS_STUDY, "-- VERIFYING STUDY FIELD --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(screenerRecordTablePage.familyMemberRecordField), testDataManager.firstName + rASScreenerScenario1_Constants.SPACE + testDataManager.lastName, "-- VERIFYING FAMILY MEMBER RECORD FIELD --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(screenerRecordTablePage.contactEmailField), testDataManager.emailAddress, "-- VERIFYING CONTACT EMAIL FIELD --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(screenerRecordTablePage.contactHomePhoneField), testDataManager.homePhoneNumber, "-- VERIFYING CONTACT HOME PHONE NUMBER --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(screenerRecordTablePage.contactCellPhoneField), testDataManager.cellPhoneNumber, "-- VERIFYING CONTACT CELL PHONE NUMBER --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(screenerRecordTablePage.contactWorkPhoneField), testDataManager.workPhoneNumber, "-- VERIFYING CONTACT WORK PHONE NUMBER --");
        CommonUtils.verifyingDropDownValueIsSelected(screenerRecordTablePage.contactCountryDropDown, testDataManager.countryOption, "-- VERIFYING COUNTRY CONTACT FIELD --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(screenerRecordTablePage.contactStateField), testDataManager.state, "-- VERIFYING STATE --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(screenerRecordTablePage.contactStreetAddressField), testDataManager.street + rASScreenerScenario1_Constants.SPACE + testDataManager.street2, "-- VERIFYING CONTACT STREET ADDRESS --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(screenerRecordTablePage.contactCityField), testDataManager.city, "-- VERIFYING CONTACT CITY --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(screenerRecordTablePage.contactZipCodeField), testDataManager.zipcode, "-- VERIFYING ZIP CODE --");
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        CommonUtils.clickOnElement(screenerRecordTablePage.dynamicLocatorForTabs("Demographics"));
        CommonUtils.assertEqualsWithMessage(screenerRecordTablePage.demographicsParticipantRacePreferNotToAnswerOption.getText(), testDataManager.whatIsYourRace, "-- VERIFYING RACE OF PARTICIPANT --");
        CommonUtils.verifyingDropDownValueIsSelected(screenerRecordTablePage.demographicsBiologicalGenderDropDown, testDataManager.sexAssignedAtBirthOption, "-- VERIFYING BIOLOGICAL GENDER --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(screenerRecordTablePage.demographicsDateOfBirthField), testDataManager.whatIsYourDateOfBirth, "-- VERIFYING DATE OF BIRTH --");
        CommonUtils.verifyingDropDownValueIsSelected(screenerRecordTablePage.demographicsEthnicityDropDown, testDataManager.whatIsYourEthnicity, "-- VERIFYING ETHNICITY --");
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        CommonUtils.clickOnElement(screenerRecordTablePage.dynamicLocatorForTabs("RASopathy History"));
        CucumberLogUtils.logToConsole("---- VERIFYING SCREENER RECORD RASOPATHY HISTORY DATA ----");
        CommonUtils.verifyingDropDownValueIsSelected(screenerRecordTablePage.rasopathyHistoryHaveYouBeenDiagnosedWithARasopathyDropDown, testDataManager.haveYouBeenDiagnosedWithARasopathy, "-- VERIFYING IF PARTICIPANT HAS BEEN DIAGNOSED WITH A RASOPATHY --");
        CommonUtils.assertEqualsWithMessage(screenerRecordTablePage.rasopathyHistoryNeverDiagnosedWithAnyOfTheseConditions.getText(), testDataManager.haveYouBeenDiagnosedWithFollowingConditions, "-- VERIFYING IF CANDIDATE HAS BEEN DIAGNOSED WITH ANY CONDITIONS --");
        CommonUtils.verifyingDropDownValueIsSelected(screenerRecordTablePage.rasopathyHistoryHaveAnyOfYourBiologicalRelativesBeenDiagnosedWithARasopathyDropDown, testDataManager.haveAnyOfYourBiologicalRelativesBeenDiagnosedWithARasopathy, "-- VERIFYING IF ANY OF BIOLOGICAL RELATIVES BEEN DIAGNOSED WITH A RASOPATHY --");
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        CommonUtils.clickOnElement(screenerRecordTablePage.dynamicLocatorForTabs("Cancer History"));
        CucumberLogUtils.logToConsole("---- VERIFYING SCREENER RECORD CANCER HISTORY DATA ----");
        CommonUtils.verifyingDropDownValueIsSelected(screenerRecordTablePage.cancerHistoryHasAPhysicianEverDiagnosedParticipantWithCancerDropDown, testDataManager.haveYouBeenDiagnosedWithCancer, "-- VERIFYING IF PARTICIPANT HAS BEEN DIAGNOSED WITH CANCER --");
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        CommonUtils.clickOnElement(screenerRecordTablePage.dynamicLocatorForTabs("Genetic Testing History"));
        CucumberLogUtils.logToConsole("---- VERIFYING SCREENER RECORD GENETIC TESTING HISTORY DATA ----");
        CommonUtils.verifyingDropDownValueIsSelected(screenerRecordTablePage.geneticTestingHistoryHasTheParticipantEverHadGeneticTestingDropDown, testDataManager.haveYouEverHadGeneticTesting, "-- VERIFYING IF PARTICIPANT HAS HAD GENETIC TESTING --");
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        CommonUtils.clickOnElement(screenerRecordTablePage.dynamicLocatorForTabs("Final Information"));
        CucumberLogUtils.logToConsole("---- VERIFYING SCREENER RECORD FINAL INFORMATION DATA ----");
        CommonUtils.verifyingDropDownValueIsSelected(screenerRecordTablePage.finalInformationHowDidYouHearAboutThisStudyDropDown, testDataManager.howDidYouHearAboutThisStudy, "-- VERIFYING HOW DID PARTICIPANT HEAR ABOUT THE STUDY --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(screenerRecordTablePage.finalInformationHowDidYouHearAboutThisStudyPleaseSpecifyTextBox), testDataManager.howDidYouHearAboutThisStudyOtherReason, "-- VERIFYING HOW DID YOU PARTICIPANT HEAR ABOUT THE STUDY OTHER REASONS --");
        CommonUtils.verifyingDropDownValueIsSelected(screenerRecordTablePage.finalInformationHasParticipantOrAnyFamilyMemberParticipatedInAnyCancerStudyDropDown, testDataManager.haveYouOrOtherFamilyMembersParticipatedInOtherStudy, "-- VERIFYING IF PARTICIPANT OR FAMILY MEMBER HAVE PARTICIPATED IN CANCER STUDY --");
        CommonUtils.assertEqualsWithMessage(screenerRecordTablePage.finalInformationMainReasonsForParticipatingInThisStudyOtherOption.getText(), testDataManager.whatAreMainReasonsForParticipatingInStudy, "-- VERIFYING MAIN REASONS FOR PARTICIPATING IN STUDY --");
        CommonUtils.assertEqualsWithMessage(screenerRecordTablePage.finalInformationMainReasonsForParticipatingInThisStudyOtherReasonsField.getText(), testDataManager.whatAreMainReasonsForParticipatingInStudyOtherReason, "-- VERIFYING MAIN REASONS FOR PARTICIPATING IN STUDY FIELD --");
        CommonUtils.verifyingDropDownValueIsSelected(screenerRecordTablePage.finalInformationAreYouAParticipantInAnyOtherResearchStudyOrRegistryGroupDropDown, testDataManager.areYouAParticipantInOtherStudyGroup, "-- VERIFYING IF PARTICIPANT IS PART OF RESEARCH STUDY OR REGISTRY GROUP --");
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
    }
}