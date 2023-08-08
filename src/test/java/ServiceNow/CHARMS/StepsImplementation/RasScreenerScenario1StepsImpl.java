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
        if(sheetName.contentEquals("screenerScenario1")) {
            rasScreenerScenario1StepsImpl.rasScreenerSubmissionScenario1();
        }else if(sheetName.contentEquals("screenerScenario2")) {
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
            rasopathyQuestionnairePage.dynamicTextBoxLocator(ras_Screener_Constants.FIRST_NAME).sendKeys(testDataManager.firstName);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(ras_Screener_Constants.MIDDLE_INITIAL).sendKeys(testDataManager.middleInitial);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(ras_Screener_Constants.LAST_NAME).sendKeys(testDataManager.lastName);
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicTextBoxLocator(ras_Screener_Constants.FIRST_NAME).sendKeys(testDataManager.firstName);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(ras_Screener_Constants.MIDDLE_INITIAL).sendKeys(testDataManager.middleInitial);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(ras_Screener_Constants.LAST_NAME).sendKeys(testDataManager.lastName);
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
            rasopathyQuestionnairePage.dynamicTextBoxLocator(ras_Screener_Constants.STREET_ADDRESS).sendKeys(testDataManager.street);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(ras_Screener_Constants.STREET_2_ADDRESS).sendKeys(testDataManager.street2);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(ras_Screener_Constants.CITY_TEXT).sendKeys(testDataManager.city);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(ras_Screener_Constants.STATE_TEXT).sendKeys(testDataManager.state);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(ras_Screener_Constants.ZIP_CODE_TEXT).sendKeys(testDataManager.zipcode);
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicTextBoxLocator(ras_Screener_Constants.STREET_ADDRESS).sendKeys(testDataManager.street);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(ras_Screener_Constants.STREET_2_ADDRESS).sendKeys(testDataManager.street2);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(ras_Screener_Constants.CITY_TEXT).sendKeys(testDataManager.city);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(ras_Screener_Constants.STATE_TEXT).sendKeys(testDataManager.state);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(ras_Screener_Constants.ZIP_CODE_TEXT).sendKeys(testDataManager.zipcode);
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            rasopathyQuestionnairePage.dynamicEmailAddressTextBox(ras_Screener_Constants.CONFIRM_EMAIL_ADDRESS).sendKeys(testDataManager.emailAddress);
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicEmailAddressTextBox(ras_Screener_Constants.CONFIRM_EMAIL_ADDRESS).sendKeys(testDataManager.emailAddress);
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            rasopathyQuestionnairePage.dynamicEmailAddressTextBox(ras_Screener_Constants.CONFIRM_EMAIL_ADDRESS).sendKeys(testDataManager.emailAddressConfirm);
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicEmailAddressTextBox(ras_Screener_Constants.CONFIRM_EMAIL_ADDRESS).sendKeys(testDataManager.emailAddressConfirm);
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            rasopathyQuestionnairePage.dynamicTextBoxLocatorForPhoneNumbers(ras_Screener_Constants.HOME_PHONE_NUMBER).sendKeys(testDataManager.homePhoneNumber);
            rasopathyQuestionnairePage.dynamicTextBoxLocatorForPhoneNumbers(ras_Screener_Constants.CELL_PHONE_NUMBER).sendKeys(testDataManager.cellPhoneNumber);
            rasopathyQuestionnairePage.dynamicTextBoxLocatorForPhoneNumbers(ras_Screener_Constants.WORK_PHONE_NUMBER).sendKeys(testDataManager.workPhoneNumber);
            rasopathyQuestionnairePage.dynamicPhoneNumberCheckBox(ras_Screener_Constants.CELL_PHONE_NUMBER).click();
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchFrameException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicTextBoxLocatorForPhoneNumbers(ras_Screener_Constants.HOME_PHONE_NUMBER).sendKeys(testDataManager.homePhoneNumber);
            rasopathyQuestionnairePage.dynamicTextBoxLocatorForPhoneNumbers(ras_Screener_Constants.CELL_PHONE_NUMBER).sendKeys(testDataManager.cellPhoneNumber);
            rasopathyQuestionnairePage.dynamicTextBoxLocatorForPhoneNumbers(ras_Screener_Constants.WORK_PHONE_NUMBER).sendKeys(testDataManager.workPhoneNumber);
            rasopathyQuestionnairePage.dynamicPhoneNumberCheckBox(ras_Screener_Constants.CELL_PHONE_NUMBER).click();
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
            CommonUtils.clickOnElement(rasopathyQuestionnairePage.haveAnyOfYourRelativesBeenDiagnosedNoRadioButton);
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            CommonUtils.clickOnElement(rasopathyQuestionnairePage.haveAnyOfYourRelativesBeenDiagnosedNoRadioButton);
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        }
        rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            CommonUtils.waitForVisibility(rasopathyQuestionnairePage.haveYouEverHadGeneticTestingNoRadioButton);
            CommonUtils.clickOnElement(rasopathyQuestionnairePage.haveYouEverHadGeneticTestingNoRadioButton);
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            CommonUtils.clickOnElement(rasopathyQuestionnairePage.haveYouEverHadGeneticTestingNoRadioButton);
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
            rasopathyQuestionnairePage.dynamicTextBoxLocator(ras_Screener_Constants.WHERE_WERE_YOU_BORN_CITY_TEXT_BOX_QUESTION).clear();
            rasopathyQuestionnairePage.dynamicTextBoxLocator(ras_Screener_Constants.WHERE_WERE_YOU_BORN_CITY_TEXT_BOX_QUESTION).sendKeys(testDataManager.whereWereYouBornCityTextBox);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(ras_Screener_Constants.WHERE_WERE_YOU_BORN_STATE_TEXT_BOX_QUESTION).clear();
            rasopathyQuestionnairePage.dynamicTextBoxLocator(ras_Screener_Constants.WHERE_WERE_YOU_BORN_STATE_TEXT_BOX_QUESTION).sendKeys(testDataManager.whereWereYouBornStateTextBox);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(ras_Screener_Constants.WHERE_WERE_YOU_BORN_COUNTRY_TEXT_BOX_QUESTION).clear();
            rasopathyQuestionnairePage.dynamicTextBoxLocator(ras_Screener_Constants.WHERE_WERE_YOU_BORN_COUNTRY_TEXT_BOX_QUESTION).sendKeys(testDataManager.whereWereYouBornCountryTextBox);
            rasopathyQuestionnairePage.iIQAddressDontKnowTextBox.clear();
            rasopathyQuestionnairePage.iIQAddressDontKnowTextBox.sendKeys(testDataManager.whereWereYouBornDontKnowTextBox);
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicTextBoxLocator(ras_Screener_Constants.WHERE_WERE_YOU_BORN_CITY_TEXT_BOX_QUESTION).clear();
            rasopathyQuestionnairePage.dynamicTextBoxLocator(ras_Screener_Constants.WHERE_WERE_YOU_BORN_CITY_TEXT_BOX_QUESTION).sendKeys(testDataManager.whereWereYouBornCityTextBox);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(ras_Screener_Constants.WHERE_WERE_YOU_BORN_STATE_TEXT_BOX_QUESTION).clear();
            rasopathyQuestionnairePage.dynamicTextBoxLocator(ras_Screener_Constants.WHERE_WERE_YOU_BORN_STATE_TEXT_BOX_QUESTION).sendKeys(testDataManager.whereWereYouBornStateTextBox);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(ras_Screener_Constants.WHERE_WERE_YOU_BORN_COUNTRY_TEXT_BOX_QUESTION).clear();
            rasopathyQuestionnairePage.dynamicTextBoxLocator(ras_Screener_Constants.WHERE_WERE_YOU_BORN_COUNTRY_TEXT_BOX_QUESTION).sendKeys(testDataManager.whereWereYouBornCountryTextBox);
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
        CommonUtils.assertEqualsWithMessage(ras_Screener_Constants.THIS_SECTION_ASKS_YOU_TEXT, myRASIIQFormPage.screenerIiqFormThisSectionAsksDetailedMedicalHistoryText.getText(), "-- VERIFYING THIS SECTION ASKS DETAILED MEDICAL HISTORY TEXT --");
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
        CommonUtils.assertEqualsWithMessage(ras_Screener_Constants.THIS_SECTION_WILL_ASK_ABOUT_CANCER_TEXT, myRASIIQFormPage.screenerIiqFormThisSectionWillAskAboutCancerText.getText(), "-- VERIFYING THIS SECTION WILL ASK ABOUT CANCER TEXT --");
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
        CommonUtils.assertEqualsWithMessage(ras_Screener_Constants.YOU_ARE_ALMOST_DONE_TEXT, myRASIIQFormPage.screenerIiqFormYouAreAlmostDoneText.getText(), "-- VERIFYING YOU ARE ALMOST DONE TEXT --");
    }

    /***
     * USE THIS METHOD WILL COMPLETE THE RAS SURVEY SCENARIO 1
     */

    public void rasScreenerSurveyScenario1dataInitializer(String rasSurveySheet){
        testDataManager.dataInitializerRasSurvey(rasSurveySheet);
    }
    public void rasScreenerSurveyScenario1PartOne(){
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

    public void rasScreenerSurveyScenario1PartTwo(){
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

    public void rasScreenerSurveyScenario1PartThree() {
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
    public void rasScreenerSurveyScenario1PartFour() {
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
        myRASSurveyPage.enterTextInTextAreaTextBox(1, 11).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInTextAreaTextBox(1, 11), testDataManager.pleaseProvideTheInformationForEachHospitalizationColumn5);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.theNextTwoQuestionsWillAskAboutGiText);
        CommonUtils.assertEqualsWithMessage(testDataManager.theNextSetOfQuestionsWillAskAboutGi, myRASSurveyPage.rasSurveyText.getText(), "-- VERIFYING THE NEXT SET OF QUESTIONS WILL ASK ABOUT GI TEXT --");
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouEverBeenEvaluatedByAGastroenterologist));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouEverBeenEvaluatedByAGastroenterologist));
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.enterTextInDoctorLocationHospitalTextBox(1));
        myRASSurveyPage.enterTextInDoctorLocationHospitalTextBox(1).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInDoctorLocationHospitalTextBox(1), testDataManager.pleaseProvideTheDetailsForTheGastroenterologistDoctor);
        myRASSurveyPage.enterTextInDoctorLocationHospitalTextBox(2).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInDoctorLocationHospitalTextBox(2), testDataManager.pleaseProvideTheDetailsForTheGastroenterologistLocation);
        myRASSurveyPage.enterTextInDoctorLocationHospitalTextBox(3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInDoctorLocationHospitalTextBox(3), testDataManager.pleaseProvideTheDetailsForTheGastroenterologistHospital);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouEverBeenDiagnosedWithAnyOfTheFollowingFeedingDifficultiesOption1));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouEverBeenDiagnosedWithAnyOfTheFollowingFeedingDifficultiesOption1));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouEverBeenDiagnosedWithAnyOfTheFollowingFeedingDifficultiesOption2));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouEverBeenDiagnosedWithAnyOfTheFollowingFeedingDifficultiesOption3));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouEverBeenDiagnosedWithAnyOfTheFollowingFeedingDifficultiesOption4));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouEverBeenDiagnosedWithAnyOfTheFollowingFeedingDifficultiesOption5));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouEverBeenDiagnosedWithAnyOfTheFollowingFeedingDifficultiesOption6));
        myRASSurveyPage.otherPleaseSpecifyTextBox.clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.otherPleaseSpecifyTextBox, testDataManager.haveYouEverBeenDiagnosedWithAnyOfTheFollowingFeedingDifficultiesOption6Other);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManager.atWhatAgeWasTheNasogastricOrNasojejunalTubePlaced));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.atWhatAgeWasTheNasogastricOrNasojejunalTubePlaced));
        myRASSurveyPage.agePleaseSpecifyTextBox.clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.agePleaseSpecifyTextBox, testDataManager.atWhatAgeWasTheNasogastricOrNasojejunalTubePlacedAge);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManager.atWhatAgeWasTheGastrostomyGtubePlaced));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.atWhatAgeWasTheGastrostomyGtubePlaced));
        myRASSurveyPage.agePleaseSpecifyTextBox.clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.agePleaseSpecifyTextBox, testDataManager.atWhatAgeWasTheGastrostomyGtubePlacedAge);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManager.atWhatAgeWasTheGastrostomyGtubeRemoved));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.atWhatAgeWasTheGastrostomyGtubeRemoved));
        myRASSurveyPage.agePleaseSpecifyTextBox.clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.agePleaseSpecifyTextBox, testDataManager.atWhatAgeWasTheGastrostomyGtubeRemovedAge);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(rasopathyQuestionnairePage.dynamicLocator(testDataManager.HaveYouEverHadAnyPhysicalSymptoms));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.HaveYouEverHadAnyPhysicalSymptoms));
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
    }

    public void rasScreenerSurveyScenario1PartFive() {
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManager.whichOfTheFollowingSymptomsRelatedToTheGIOption1));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.whichOfTheFollowingSymptomsRelatedToTheGIOption1));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.whichOfTheFollowingSymptomsRelatedToTheGIOption2));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.whichOfTheFollowingSymptomsRelatedToTheGIOption3));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.whichOfTheFollowingSymptomsRelatedToTheGIOption4));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.whichOfTheFollowingSymptomsRelatedToTheGIOption5));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.whichOfTheFollowingSymptomsRelatedToTheGIOption6));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.whichOfTheFollowingSymptomsRelatedToTheGIOption7));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.whichOfTheFollowingSymptomsRelatedToTheGIOption8));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.whichOfTheFollowingSymptomsRelatedToTheGIOption9));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.whichOfTheFollowingSymptomsRelatedToTheGIOption10));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.whichOfTheFollowingSymptomsRelatedToTheGIOption11));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.whichOfTheFollowingSymptomsRelatedToTheGIOption12));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.whichOfTheFollowingSymptomsRelatedToTheGIOption13));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.whichOfTheFollowingSymptomsRelatedToTheGIOption14));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.whichOfTheFollowingSymptomsRelatedToTheGIOption15));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.whichOfTheFollowingSymptomsRelatedToTheGIOption16));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.whichOfTheFollowingSymptomsRelatedToTheGIOption17));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.whichOfTheFollowingSymptomsRelatedToTheGIOption18));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.whichOfTheFollowingSymptomsRelatedToTheGIOption19));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.whichOfTheFollowingSymptomsRelatedToTheGIOption20));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.whichOfTheFollowingSymptomsRelatedToTheGIOption21));
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForClickability(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(1, 3));
        for (int u = 1; u < 22; u++) {
            JavascriptUtils.clickByJS(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(u, 3));
        }
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForClickability(myRASSurveyPage.gaggingRadioButton(1, 1));
        JavascriptUtils.clickByJS(myRASSurveyPage.gaggingRadioButton(1, 1));
        JavascriptUtils.clickByJS(myRASSurveyPage.gaggingRadioButton(2, 1));
        JavascriptUtils.clickByJS(myRASSurveyPage.gaggingRadioButton(3, 1));
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForClickability(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(1, 3));
        JavascriptUtils.clickByJS(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(1, 3));
        JavascriptUtils.clickByJS(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(1, 8));
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 13).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 13), testDataManager.pleaseCompleteTheTableBelowRegardingHeartburnColumn1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 14).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 14), testDataManager.pleaseCompleteTheTableBelowRegardingHeartburnColumn2);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForClickability(myRASSurveyPage.pleaseCompleteTheTableBelowRegardingNauseaSymptomsText);
        JavascriptUtils.clickByJS(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(1, 3));
        JavascriptUtils.clickByJS(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(1, 8));
        JavascriptUtils.clickByJS(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(1, 13));
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 18).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 18), testDataManager.pleaseCompleteTheTableBelowRegardingHeartburnColumn1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 19).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 19), testDataManager.pleaseCompleteTheTableBelowRegardingHeartburnColumn2);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForClickability(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(1, 3));
        for (int v = 1; v < 20; v++) {
            JavascriptUtils.clickByJS(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(v, 3));
        }
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveAnyMedicationsEverBeenTakenForAbdominalPain));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveAnyMedicationsEverBeenTakenForAbdominalPain));
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.medicationForAbdominalPainDropDownTwo());
        CommonUtils.selectDropDownValue(testDataManager.howManyMedicationsHaveBeenTakenForAbdominalPain, myRASSurveyPage.medicationForAbdominalPainDropDownTwo());
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3));
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3), testDataManager.pleaseCompleteTheTableBelowRegardingTheMedicationsColumn1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 4).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 4), testDataManager.pleaseCompleteTheTableBelowRegardingTheMedicationsColumn2);
        myRASSurveyPage.enterTextInTextAreaTextBox(1, 7).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInTextAreaTextBox(1, 7), testDataManager.pleaseCompleteTheTableBelowRegardingTheMedicationsColumn3);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.pleaseCompleteTheNextSetOfQuestionsRegardingVomitingText);
        for (int x = 1; x < 8; x++) {
            JavascriptUtils.clickByJS(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(x, 3));
        }
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(rasopathyQuestionnairePage.dynamicLocator(testDataManager.hasAnyMedicationEverBeenTakenForVomiting));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.hasAnyMedicationEverBeenTakenForVomiting));
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.medicationForAbdominalPainDropDownTwo());
        CommonUtils.selectDropDownValue(testDataManager.howManyMedicationsHaveBeenTakenForVomiting, myRASSurveyPage.medicationForAbdominalPainDropDownTwo());
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3));
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3), testDataManager.pleaseCompleteTheListMedicationsTakenForVomitingColumn1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 4).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 4), testDataManager.pleaseCompleteTheListMedicationsTakenForVomitingColumn1);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.haveAnyOfTheFollowingSymptomsOccurred4Text);
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveAnyOfTheFollowingSymptomsOccurred4Option1));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveAnyOfTheFollowingSymptomsOccurred4Option2));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveAnyOfTheFollowingSymptomsOccurred4Option3));
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 2));
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 2).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 2), testDataManager.pleaseAnswerTheBelowQuestionsRegardingJaundiceTextBox1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 2).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 2), testDataManager.pleaseAnswerTheBelowQuestionsRegardingJaundiceTextBox2);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(rasopathyQuestionnairePage.dynamicLocator(testDataManager.doYouTakeALactoseSupplement));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.doYouTakeALactoseSupplement));
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.toWhatFoodsAreYouAverseTextBox);
        myRASSurveyPage.toWhatFoodsAreYouAverseTextBox.clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.toWhatFoodsAreYouAverseTextBox, testDataManager.toWhatFoodsAreYouAverse);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForClickability(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(1, 3));
        JavascriptUtils.clickByJS(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(1, 3));
        JavascriptUtils.clickByJS(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(2, 3));
        JavascriptUtils.clickByJS(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(3, 3));
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 2));
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 2).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 2), testDataManager.pleaseCompleteTheTableBelowRegardingDiarrheaOption1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 2).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 2), testDataManager.pleaseCompleteTheTableBelowRegardingDiarrheaOption2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 2).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 2), testDataManager.pleaseCompleteTheTableBelowRegardingDiarrheaOption3);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForClickability(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(1, 3));
        for (int y = 1; y < 9; y++) {
            JavascriptUtils.clickByJS(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(y, 3));
        }
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 2));
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 2).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 2), testDataManager.pleaseCompleteTheTableBelowRegardingEncopresisOption1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 2).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 2), testDataManager.pleaseCompleteTheTableBelowRegardingEncopresisOption2);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.pleaseCompleteTheInformationBelowRegardingBowelText);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 2).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 2), testDataManager.pleaseCompleteTheTableBelowRegardingWeightLossOption1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 2).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 2), testDataManager.pleaseCompleteTheTableBelowRegardingWeightLossOption2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 2).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 2), testDataManager.pleaseCompleteTheTableBelowRegardingWeightLossOption3);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForClickability(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(1, 3));
        JavascriptUtils.clickByJS(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(1, 3));
        JavascriptUtils.clickByJS(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(1, 8));
        JavascriptUtils.clickByJS(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(1, 13));
        JavascriptUtils.clickByJS(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(1, 14));
        JavascriptUtils.clickByJS(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(1, 15));
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(rasopathyQuestionnairePage.dynamicLocator(testDataManager.areYouToiletTrained));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.areYouToiletTrained));
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.medicationForAbdominalPainDropDownTwo());
        CommonUtils.selectDropDownValue(testDataManager.atWhatAgeWereYouToiletTrained, myRASSurveyPage.medicationForAbdominalPainDropDownTwo());
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForClickability(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(1, 3));
        JavascriptUtils.clickByJS(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(1, 3));
        JavascriptUtils.clickByJS(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(1, 8));
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForClickability(myRASSurveyPage.pleaseCompleteTheTableBelowRegardingWeightLossText);
        JavascriptUtils.clickByJS(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(1, 3));
        JavascriptUtils.clickByJS(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(1, 8));
        JavascriptUtils.clickByJS(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(1, 13));
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.medicationForAbdominalPainDropDownTwo());
        CommonUtils.selectDropDownValue(testDataManager.howManyBowelMovementsDoYouHavePerWeek, myRASSurveyPage.medicationForAbdominalPainDropDownTwo());
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.whatIsTheLongestAmountOfTimeThatHasPassedText);
        CommonUtils.selectDropDownValue(testDataManager.whatIsTheLongestAmountOfTimeThatHasPassedWithout, myRASSurveyPage.medicationForAbdominalPainDropDownTwo());
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(rasopathyQuestionnairePage.dynamicLocator(testDataManager.pleaseUseTheBristolStoolChart));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.pleaseUseTheBristolStoolChart));
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouEverHadAProcedureTestOrStudyToEvaluate));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouEverHadAProcedureTestOrStudyToEvaluate));
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManager.pleaseIndicateWhichOfTheFollowingProceduresOption1));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.pleaseIndicateWhichOfTheFollowingProceduresOption1));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.pleaseIndicateWhichOfTheFollowingProceduresOption2));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.pleaseIndicateWhichOfTheFollowingProceduresOption3));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.pleaseIndicateWhichOfTheFollowingProceduresOption4));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.pleaseIndicateWhichOfTheFollowingProceduresOption5));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.pleaseIndicateWhichOfTheFollowingProceduresOption6));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.pleaseIndicateWhichOfTheFollowingProceduresOption7));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.pleaseIndicateWhichOfTheFollowingProceduresOption8));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.pleaseIndicateWhichOfTheFollowingProceduresOption9));
        myRASSurveyPage.dynamicOtheriPleaseSpecifyTextBox(testDataManager.pleaseIndicateWhichOfTheFollowingProceduresOption9).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.dynamicOtheriPleaseSpecifyTextBox(testDataManager.pleaseIndicateWhichOfTheFollowingProceduresOption9), testDataManager.pleaseIndicateWhichOfTheFollowingProceduresOption90ther);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForClickability(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3));
        String[] column1KindOfProcedure = {testDataManager.pleaseProvideAnyDetailsKnownForTheConditionsColumn1Option1,
                testDataManager.pleaseProvideTheInformationBelowForTheFirstProcedureColumn1Option2,
                testDataManager.pleaseProvideTheInformationBelowForTheFirstProcedureColumn1Option3,
                testDataManager.pleaseProvideTheInformationBelowForTheFirstProcedureColumn1Option4,
                testDataManager.pleaseProvideTheInformationBelowForTheFirstProcedureColumn1Option5,
                testDataManager.pleaseProvideTheInformationBelowForTheFirstProcedureColumn1Option6,
                testDataManager.pleaseProvideTheInformationBelowForTheFirstProcedureColumn1Option7,
                testDataManager.pleaseProvideTheInformationBelowForTheFirstProcedureColumn1Option8,
                testDataManager.pleaseProvideTheInformationBelowForTheFirstProcedureColumn1Option9};
        for (int aaa = 1; aaa < 10; aaa++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(aaa, 3).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(aaa, 3), column1KindOfProcedure[aaa - 1]);
        }
        String[] column2KindOfProcedure = {testDataManager.pleaseProvideAnyDetailsKnownForTheConditionsColumn2Option1,
                testDataManager.pleaseProvideTheInformationBelowForTheFirstProcedureColumn2Option2,
                testDataManager.pleaseProvideTheInformationBelowForTheFirstProcedureColumn2Option3,
                testDataManager.pleaseProvideTheInformationBelowForTheFirstProcedureColumn2Option4,
                testDataManager.pleaseProvideTheInformationBelowForTheFirstProcedureColumn2Option5,
                testDataManager.pleaseProvideTheInformationBelowForTheFirstProcedureColumn2Option6,
                testDataManager.pleaseProvideTheInformationBelowForTheFirstProcedureColumn2Option7,
                testDataManager.pleaseProvideTheInformationBelowForTheFirstProcedureColumn2Option8,
                testDataManager.pleaseProvideTheInformationBelowForTheFirstProcedureColumn2Option9};
        for (int bbb = 1; bbb < 10; bbb++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(bbb, 6).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(bbb, 6), column2KindOfProcedure[bbb - 1]);
        }
        String[] column3KindOfProcedure = {testDataManager.pleaseProvideAnyDetailsKnownForTheConditionsColumn3Option1,
                testDataManager.pleaseProvideTheInformationBelowForTheFirstProcedureColumn3Option2,
                testDataManager.pleaseProvideTheInformationBelowForTheFirstProcedureColumn3Option3,
                testDataManager.pleaseProvideTheInformationBelowForTheFirstProcedureColumn3Option4,
                testDataManager.pleaseProvideTheInformationBelowForTheFirstProcedureColumn3Option5,
                testDataManager.pleaseProvideTheInformationBelowForTheFirstProcedureColumn3Option6,
                testDataManager.pleaseProvideTheInformationBelowForTheFirstProcedureColumn3Option7,
                testDataManager.pleaseProvideTheInformationBelowForTheFirstProcedureColumn3Option8,
                testDataManager.pleaseProvideTheInformationBelowForTheFirstProcedureColumn3Option9};
        for (int ccc = 1; ccc < 10; ccc++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(ccc, 9).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(ccc, 9), column3KindOfProcedure[ccc - 1]);
        }
        String[] column4KindOfProcedure = {testDataManager.pleaseProvideAnyDetailsKnownForTheConditionsColumn4Option1,
                testDataManager.pleaseProvideTheInformationBelowForTheFirstProcedureColumn4Option2,
                testDataManager.pleaseProvideTheInformationBelowForTheFirstProcedureColumn4Option3,
                testDataManager.pleaseProvideTheInformationBelowForTheFirstProcedureColumn4Option4,
                testDataManager.pleaseProvideTheInformationBelowForTheFirstProcedureColumn4Option5,
                testDataManager.pleaseProvideTheInformationBelowForTheFirstProcedureColumn4Option6,
                testDataManager.pleaseProvideTheInformationBelowForTheFirstProcedureColumn4Option7,
                testDataManager.pleaseProvideTheInformationBelowForTheFirstProcedureColumn4Option8,
                testDataManager.pleaseProvideTheInformationBelowForTheFirstProcedureColumn4Option9};
        for (int ddd = 1; ddd < 10; ddd++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(ddd, 12).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(ddd, 12), column4KindOfProcedure[ddd - 1]);
        }
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        //*********************** RUN THIS CODE ONLY ON NEW OR RESETTED FORMS ********************************/
//        CommonUtils.waitForClickability(myRASSurveyPage.pleaseProvideInformationForTheMostRecentProcedureText);
//        String[] column1MostRecentProcedure = {testDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn1Option1,
//                testDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn1Option2,
//                testDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn1Option3,
//                testDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn1Option4,
//                testDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn1Option5,
//                testDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn1Option6,
//                testDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn1Option7,
//                testDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn1Option8,
//                testDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn1Option9};
//        for (int fff = 1; fff < 10; fff++) {
//            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(fff, 3).clear();
//            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(fff, 3), column1MostRecentProcedure[fff - 1]);
//        }
//        String[] column2MostRecentProcedure = {testDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn2Option1,
//                testDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn2Option2,
//                testDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn2Option3,
//                testDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn2Option4,
//                testDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn2Option5,
//                testDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn2Option6,
//                testDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn2Option7,
//                testDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn2Option8,
//                testDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn2Option9};
//        for (int ggg = 1; ggg < 10; ggg++) {
//            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(ggg, 6).clear();
//            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(ggg, 6), column2MostRecentProcedure[ggg - 1]);
//        }
//        String[] column3MostRecentProcedure = {testDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn3Option1,
//                testDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn3Option2,
//                testDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn3Option3,
//                testDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn3Option4,
//                testDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn3Option5,
//                testDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn3Option6,
//                testDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn3Option7,
//                testDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn3Option8,
//                testDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn3Option9};
//        for (int hhh = 1; hhh < 10; hhh++) {
//            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(hhh, 9).clear();
//            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(hhh, 9), column3MostRecentProcedure[hhh - 1]);
//        }
//        String[] column4MostRecentProcedure = {testDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn4Option1,
//                testDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn4Option2,
//                testDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn4Option3,
//                testDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn4Option4,
//                testDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn4Option5,
//                testDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn4Option6,
//                testDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn4Option7,
//                testDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn4Option8,
//                testDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn4Option9};
//        for (int iii = 1; iii < 10; iii++) {
//            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(iii, 12).clear();
//            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(iii, 12), column4MostRecentProcedure[iii - 1]);
//        }
//        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
//        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        //*********************** RUN THE CODE ABOVE ONLY ON NEW OR RESETTED FORMS ********************************/
    }

        public void rasScreenerSurveyScenario1PartSix() {
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(305));
            CommonUtils.assertEqualsWithMessage(testDataManager.theNextSetOfQuestionsAskAboutBreathingAndTheLungs, myRASSurveyPage.rasSurveyText.getText(), "-- VERIFYING THE NEXT SET OF QUESTIONS ASK ABOUT BREATHING AND THE LUNGS TEXT --");
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
            rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(380));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouEverHadAnEvaluationByAPulmonologist));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
            rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
            CommonUtils.waitForVisibility(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 2));
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 2).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 2), testDataManager.pleaseProvideTheInformationBelowForThePulmonologistOption1);
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 2).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 2), testDataManager.pleaseProvideTheInformationBelowForThePulmonologistOption2);
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 2).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 2), testDataManager.pleaseProvideTheInformationBelowForThePulmonologistOption3);
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
            rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(162));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouEverHadWheezingOrWhistling));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
            rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(163));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouBeenDiagnosedWithReactiveAirwayDisease));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
            rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(164));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouEverBeenSeenInTheEmergencyRoomForABreathing));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
            rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(165));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouEverBeenSeenInTheHospitalForABreathing));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
            rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(330));
            CommonUtils.assertEqualsWithMessage(testDataManager.theNextSetOfQuestionsWillAskAboutOralHealthAndDental, myRASSurveyPage.rasSurveyText.getText(), "-- VERIFYING THE NEXT SET OF QUESTIONS WILL ASK ABOUT ORAL HEALTH AND DENTAL HISTORY TEXT --");
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
            rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(166));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.doYouReceiveRegularDentalCare));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
            rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
            CommonUtils.waitForVisibility(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 2));
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 2).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 2), testDataManager.pleaseProvideTheInformationBelowForWhereDentalOption1);
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 2).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 2), testDataManager.pleaseProvideTheInformationBelowForWhereDentalOption2);
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 2).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 2), testDataManager.pleaseProvideTheInformationBelowForWhereDentalOption3);
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
            rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(168));
            myRASSurveyPage.dynamicOneTextBox(168).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.dynamicOneTextBox(168), testDataManager.whenDidYouLastVisitADentist);
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
            rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(167));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.whatWasTheReasonForYourLastDentalVisitOption));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
            rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(169));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.doYourGumsBleedRegularlyWithToothBrushing));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
            rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(170));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.doYourTeethOrGumsHurtRegularly));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
            rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(171));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.doYouHavePeriodontalOrGumDisease));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
            rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(172));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouHadDentalSealantsPlaced));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
            rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(173));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.doYouCurrentlyHaveCavities));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
            rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(174));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouPreviouslyHadAnyDentalFillings));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
            rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(175));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.doesYourMouthUsuallyFeelDry));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
            rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(176));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.overallHowWouldYouRateTheOverallHealth));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
            rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(177));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.overallHowWouldYouRateYourDentalHygieneRoutine));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
            rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(178));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouHadAnyChangesInYourSenseOfSmell));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
            rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(179));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouHadAnyChangesInYourSenseOfTaste));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
            rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(180));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.doYouHaveJawOrTemporomandibularJointPain));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
            rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(181));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.doYouHaveFrequentHeadaches));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
            rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(182));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouHadAnyOrthodonticTreatment));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
            rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(183));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouHadAPalatalExpansion));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
            rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(184));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouHadAnyFacialOrDentalTrauma));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
            rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(185));
            myRASSurveyPage.dynamicPleaseSpecifyTextBox(testDataManager.didTheFacialOrDentalTraumaRequireSurgery).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.dynamicPleaseSpecifyTextBox(testDataManager.didTheFacialOrDentalTraumaRequireSurgery), testDataManager.didTheFacialOrDentalTraumaRequireSurgeryPlease);
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
            rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(186));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouHadElectiveJawSurgery));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
            rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(189));
            myRASSurveyPage.dynamicPleaseSpecifyTextBox(testDataManager.doYouHaveAHistoryOfCancerInTheMouthOrJaw).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.dynamicPleaseSpecifyTextBox(testDataManager.doYouHaveAHistoryOfCancerInTheMouthOrJaw), testDataManager.doYouHaveAHistoryOfCancerInTheMouthOrJawPlease);
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
            rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(190));
            myRASSurveyPage.dynamicPleaseSpecifyTextBox(testDataManager.doYouHaveAFamilyMemberWithAJawAbnormality).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.dynamicPleaseSpecifyTextBox(testDataManager.doYouHaveAFamilyMemberWithAJawAbnormality), testDataManager.doYouHaveAFamilyMemberWithAJawAbnormalityPlease);
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
            rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(191));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.doYouHaveAnyNumbnessInOrAroundYourMouth));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
            rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(192));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.doYouHaveAnyMouthSores));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
            rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(193));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.doYourTeethFeelSensitiveToHotOrColdFoods));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
            rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(194));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.doYouHaveProblemsMovingYourLipsTongueOrMouth));
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
            rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(195));
            myRASSurveyPage.dynamicPleaseSpecifyTextBox(testDataManager.overallIsThereAnythingUnusualAboutYourTeethOrMouth).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.dynamicPleaseSpecifyTextBox(testDataManager.overallIsThereAnythingUnusualAboutYourTeethOrMouth), testDataManager.overallIsThereAnythingUnusualAboutYourTeethOrMouthPlease);
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
            rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
            String[] clickingOnOptionInMultiplePages = {testDataManager.haveYouHadTroublePronouncingAnyWords,
                    testDataManager.haveYouFeltThatYourSenseOfTasteHasWorsened,
                    testDataManager.haveYouHadPainfulAchingInYourMouth,
                    testDataManager.haveYouFoundItUncomfortableToEatAnyFoods,
                    testDataManager.areYouSelfConsciousBecauseOfYourTeeth,
                    testDataManager.haveYouFeltTenseBecauseOfProblems,
                    testDataManager.hasYourDietBeenUnsatisfactoryBecause,
                    testDataManager.haveYouHadToInterruptMealsBecauseOfProblems,
                    testDataManager.haveYouFoundItDifficultToRelaxBecause,
                    testDataManager.haveYouBeenABitEmbarrassedBecause,
                    testDataManager.haveYouBeenIrritableWithOtherPeopleBecause,
                    testDataManager.haveYouHadDifficultyDoingYourUsualJobs,
                    testDataManager.haveYouFeltThatLifeInGeneralIsLessSatisfying,
                    testDataManager.haveYouFeltThatLifeInGeneralIsLessSatisfying
            };
            for (int jjj = 196; jjj < 210; jjj++) {
                CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(jjj));
                JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(clickingOnOptionInMultiplePages[jjj-196]));
                CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
                rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
            }
        }

    public void rasScreenerSurveyScenario1PartSeven() {
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(306));
        CommonUtils.assertEqualsWithMessage(testDataManager.theNextSetOfQuestionsAskAboutFluidBalance, myRASSurveyPage.rasSurveyText.getText(), "-- VERIFYING THE NEXT SET OF QUESTIONS ASK ABOUT FLUID BALANCE AND IF ANY FLUID BUILDS TEXT --");
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(331));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouEverBeenDiagnosedWithALymphaticSystemIssue));
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouEverBeenDiagnosedWithAnyOfTheFollowingLymphaticOption1));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouEverBeenDiagnosedWithAnyOfTheFollowingLymphaticOption1));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouEverBeenDiagnosedWithAnyOfTheFollowingLymphaticOption2));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouEverBeenDiagnosedWithAnyOfTheFollowingLymphaticOption3));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouEverBeenDiagnosedWithAnyOfTheFollowingLymphaticOption4));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouEverBeenDiagnosedWithAnyOfTheFollowingLymphaticOption5));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouEverBeenDiagnosedWithAnyOfTheFollowingLymphaticOption6));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouEverBeenDiagnosedWithAnyOfTheFollowingLymphaticOption7));
        myRASSurveyPage.dynamicPleaseSpecifyTextBox(testDataManager.haveYouEverBeenDiagnosedWithAnyOfTheFollowingLymphaticOption7).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.dynamicPleaseSpecifyTextBox(testDataManager.haveYouEverBeenDiagnosedWithAnyOfTheFollowingLymphaticOption7), testDataManager.haveYouEverBeenDiagnosedWithAnyOfTheFollowingLymphaticOption7Other);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForClickability(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3));
        String[] abilityOnser1 = {testDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn1Option1,
                testDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn1Option2,
                testDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn1Option3,
                testDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn1Option4,
                testDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn1Option5,
                testDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn1Option6,
                testDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn1Option7};
        for (int lll = 1; lll < 8; lll++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(lll, 3).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(lll, 3), abilityOnser1[lll - 1]);
        }
        String[] abilityOnser2 = {testDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn2Option1,
                testDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn2Option2,
                testDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn2Option3,
                testDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn2Option4,
                testDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn2Option5,
                testDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn2Option6,
                testDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn2Option7};
        for (int mmm = 1; mmm < 8; mmm++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(mmm, 4).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(mmm, 4), abilityOnser2[mmm - 1]);
        }
        String[] abilityOnser3 = {testDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn3Option1,
                testDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn3Option2,
                testDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn3Option3,
                testDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn3Option4,
                testDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn3Option5,
                testDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn3Option6,
                testDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn3Option7};
        for (int nnn = 1; nnn < 8; nnn++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(nnn, 5).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(nnn, 5), abilityOnser3[nnn - 1]);
        }
        String[] abilityOnser4 = {testDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn4Option1,
                testDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn4Option2,
                testDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn4Option3,
                testDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn4Option4,
                testDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn4Option5,
                testDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn4Option6,
                testDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn4Option7};
        for (int ooo = 1; ooo < 8; ooo++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(ooo, 8).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(ooo, 8), abilityOnser4[ooo - 1]);
        }
        String[] abilityOnser5 = {testDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn5Option1,
                testDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn5Option2,
                testDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn5Option3,
                testDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn5Option4,
                testDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn5Option5,
                testDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn5Option6,
                testDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn5Option7};
        for (int ppp = 1; ppp < 8; ppp++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(ppp, 9).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(ppp, 9), abilityOnser5[ppp - 1]);
        }
        String[] abilityOnser6 = {testDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn6Option1,
                testDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn6Option2,
                testDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn6Option3,
                testDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn6Option4,
                testDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn6Option5,
                testDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn6Option6,
                testDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn6Option7};
        for (int rrr = 1; rrr < 8; rrr++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(rrr, 10).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(rrr, 10), abilityOnser6[rrr - 1]);
        }
        String[] abilityOnser7 = {testDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn7Option1,
                testDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn7Option2,
                testDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn7Option3,
                testDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn7Option4,
                testDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn7Option5,
                testDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn7Option6,
                testDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn7Option7};
        for (int sss = 1; sss < 8; sss++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(sss, 13).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(sss, 13), abilityOnser7[sss - 1]);
        }
        String[] abilityOnser8 = {testDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn8Option1,
                testDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn8Option2,
                testDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn8Option3,
                testDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn8Option4,
                testDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn8Option5,
                testDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn8Option6,
                testDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn8Option7};
        for (int ttt = 1; ttt  < 8; ttt ++) {
            myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(ttt , 16).clear();
            CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(ttt , 16), abilityOnser8[ttt  - 1]);
        }
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(332));
        CommonUtils.assertEqualsWithMessage(testDataManager.theNextSetOfQuestionsWillAskAboutTheKidneys, myRASSurveyPage.rasSurveyText.getText(), "-- VERIFYING THE NEXT SET OF QUESTIONS WILL ASK ABOUT THE KIDNEYS TEXT --");
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(383));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouEverBeenEvaluatedByANephrologist));
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 2));
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 2).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 2), testDataManager.pleaseListTheInformationBelowForTheNephrologistOption1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 2).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 2), testDataManager.pleaseListTheInformationBelowForTheNephrologistOption2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 2).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 2), testDataManager.pleaseListTheInformationBelowForTheNephrologistOption3);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(329));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouEverBeenEvaluatedByANephrologist));
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouEverBeenDiagnosedWithAnyOfTheFollowingKidneyProblemsOption1));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouEverBeenDiagnosedWithAnyOfTheFollowingKidneyProblemsOption1));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouEverBeenDiagnosedWithAnyOfTheFollowingKidneyProblemsOption2));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouEverBeenDiagnosedWithAnyOfTheFollowingKidneyProblemsOption3));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(testDataManager.haveYouEverBeenDiagnosedWithAnyOfTheFollowingKidneyProblemsOption4));
        myRASSurveyPage.dynamicPleaseSpecifyTextBox(testDataManager.haveYouEverBeenDiagnosedWithAnyOfTheFollowingKidneyProblemsOption4).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.dynamicPleaseSpecifyTextBox(testDataManager.haveYouEverBeenDiagnosedWithAnyOfTheFollowingKidneyProblemsOption4), testDataManager.haveYouEverBeenDiagnosedWithAnyOfTheFollowingKidneyProblemsOption4Other);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForClickability(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3));
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1 , 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1 , 3), testDataManager.pleaseCompleteTheTableRegardingKidneyColumn1Option1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2 , 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2 , 3), testDataManager.pleaseCompleteTheTableRegardingKidneyColumn1Option2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3 , 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3 , 3), testDataManager.pleaseCompleteTheTableRegardingKidneyColumn1Option3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4 , 3).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4 , 3), testDataManager.pleaseCompleteTheTableRegardingKidneyColumn1Option4);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1 , 4).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1 , 4), testDataManager.pleaseCompleteTheTableRegardingKidneyColumn2Option1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2 , 4).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2 , 4), testDataManager.pleaseCompleteTheTableRegardingKidneyColumn2Option2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3 , 4).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3 , 4), testDataManager.pleaseCompleteTheTableRegardingKidneyColumn2Option3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4 , 4).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4 , 4), testDataManager.pleaseCompleteTheTableRegardingKidneyColumn2Option4);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1 , 5).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1 , 5), testDataManager.pleaseCompleteTheTableRegardingKidneyColumn3Option1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2 , 5).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2 , 5), testDataManager.pleaseCompleteTheTableRegardingKidneyColumn3Option2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3 , 5).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3 , 5), testDataManager.pleaseCompleteTheTableRegardingKidneyColumn3Option3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4 , 5).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4 , 5), testDataManager.pleaseCompleteTheTableRegardingKidneyColumn3Option4);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1 , 8).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1 , 8), testDataManager.pleaseCompleteTheTableRegardingKidneyColumn4Option1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2 , 8).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2 , 8), testDataManager.pleaseCompleteTheTableRegardingKidneyColumn4Option2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3 , 8).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3 , 8), testDataManager.pleaseCompleteTheTableRegardingKidneyColumn4Option3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4 , 8).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4 , 8), testDataManager.pleaseCompleteTheTableRegardingKidneyColumn4Option4);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1 , 9).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1 , 9), testDataManager.pleaseCompleteTheTableRegardingKidneyColumn5Option1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2 , 9).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2 , 9), testDataManager.pleaseCompleteTheTableRegardingKidneyColumn5Option2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3 , 9).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3 , 9), testDataManager.pleaseCompleteTheTableRegardingKidneyColumn5Option3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4 , 9).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4 , 9), testDataManager.pleaseCompleteTheTableRegardingKidneyColumn5Option4);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1 , 10).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1 , 10), testDataManager.pleaseCompleteTheTableRegardingKidneyColumn6Option1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2 , 10).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2 , 10), testDataManager.pleaseCompleteTheTableRegardingKidneyColumn6Option2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3 , 10).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3 , 10), testDataManager.pleaseCompleteTheTableRegardingKidneyColumn6Option3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4 , 10).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4 , 10), testDataManager.pleaseCompleteTheTableRegardingKidneyColumn6Option4);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1 , 13).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1 , 13), testDataManager.pleaseCompleteTheTableRegardingKidneyColumn7Option1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2 , 13).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2 , 13), testDataManager.pleaseCompleteTheTableRegardingKidneyColumn7Option2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3 , 13).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3 , 13), testDataManager.pleaseCompleteTheTableRegardingKidneyColumn7Option3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4 , 13).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4 , 13), testDataManager.pleaseCompleteTheTableRegardingKidneyColumn7Option4);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1 , 16).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1 , 16), testDataManager.pleaseCompleteTheTableRegardingKidneyColumn8Option1);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2 , 16).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2 , 16), testDataManager.pleaseCompleteTheTableRegardingKidneyColumn8Option2);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3 , 16).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3 , 16), testDataManager.pleaseCompleteTheTableRegardingKidneyColumn8Option3);
        myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4 , 16).clear();
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4 , 16), testDataManager.pleaseCompleteTheTableRegardingKidneyColumn8Option4);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        rasScreenerScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(309));
        CommonUtils.assertEqualsWithMessage(testDataManager.theNextSetOfQuestionsAskAboutHairAndSkinQualities, myRASSurveyPage.rasSurveyText.getText(), "-- VERIFYING THE NEXT SET OF QUESTIONS ASK ABOUT HAIR AND SKIN QUALITIES TEXT --");
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
    }

    public void rasScreenerSurveyScenario1PartEight() {


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
        CommonUtils.clickOnElement(participantDetailsPage.dynamicRecordButtonLocator(testDataManager.firstName + ras_Screener_Constants.SPACE + testDataManager.lastName));
        CucumberLogUtils.logToConsole("---- VERIFYING PARTICIPANT RECORD PREVIEW DATA ----");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(participantDetailsPage.firstNameRecordPreviewField), testDataManager.firstName, "-- VERIFYING PREVIEW RECORD FIRST NAME --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(participantDetailsPage.lastNameRecordPreviewField), testDataManager.lastName, "-- VERIFYING PREVIEW RECORD LAST NAME --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(participantDetailsPage.middleNameRecordPreviewField), testDataManager.middleInitial, "-- VERIFYING PREVIEW RECORD MIDDLE NAME --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(participantDetailsPage.contactHomePhoneRecordPreviewField), testDataManager.homePhoneNumber, "-- VERIFYING PREVIEW RECORD CONTACT HOME PHONE NUMBER --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(participantDetailsPage.contactEmailRecordPreviewField), testDataManager.emailAddress, "-- VERIFYING PREVIEW RECORD CONTACT EMAIL ADDRESS --");
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        CommonUtils.clickOnElement(participantDetailsPage.openRecordButton);
        CucumberLogUtils.logToConsole("---- VERIFYING PARTICIPANT NAME DATA ----");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(participantDetailsPage.nameTextBox), testDataManager.firstName + ras_Screener_Constants.SPACE + testDataManager.lastName, "-- VERIFYING FULL NAME --");
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
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(participantDetailsPage.contactStreetAddress), testDataManager.street + ras_Screener_Constants.SPACE + testDataManager.street2, "-- VERIFYING CONTACT STREET ADDRESS --");
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
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(screenerRecordTablePage.screenerPreviewFamilyMemberRecordField), testDataManager.firstName + ras_Screener_Constants.SPACE + testDataManager.lastName, "-- VERIFYING SCREENER PREVIEW RECORD FAMILY MEMBER RECORD NAME --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(screenerRecordTablePage.screenerPreviewContactEmailAddressField), testDataManager.emailAddress, "-- VERIFYING SCREENER PREVIEW RECORD CONTACT EMAIL ADDRESS FIELD --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(screenerRecordTablePage.screenerPreviewStudyField), ras_Screener_Constants.RAS_STUDY, "-- VERIFYING SCREENER PREVIEW STUDY FIELD --");
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        CommonUtils.clickOnElement(screenerRecordTablePage.openRecordButton);
        CucumberLogUtils.logToConsole("---- VERIFYING SCREENER RECORD NAME AND CONTACT INFORMATION DATA ----");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(screenerRecordTablePage.screenerStudyField), ras_Screener_Constants.RAS_STUDY, "-- VERIFYING STUDY FIELD --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(screenerRecordTablePage.familyMemberRecordField), testDataManager.firstName + ras_Screener_Constants.SPACE + testDataManager.lastName, "-- VERIFYING FAMILY MEMBER RECORD FIELD --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(screenerRecordTablePage.contactEmailField), testDataManager.emailAddress, "-- VERIFYING CONTACT EMAIL FIELD --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(screenerRecordTablePage.contactHomePhoneField), testDataManager.homePhoneNumber, "-- VERIFYING CONTACT HOME PHONE NUMBER --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(screenerRecordTablePage.contactCellPhoneField), testDataManager.cellPhoneNumber, "-- VERIFYING CONTACT CELL PHONE NUMBER --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(screenerRecordTablePage.contactWorkPhoneField), testDataManager.workPhoneNumber, "-- VERIFYING CONTACT WORK PHONE NUMBER --");
        CommonUtils.verifyingDropDownValueIsSelected(screenerRecordTablePage.contactCountryDropDown, testDataManager.countryOption, "-- VERIFYING COUNTRY CONTACT FIELD --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(screenerRecordTablePage.contactStateField), testDataManager.state, "-- VERIFYING STATE --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(screenerRecordTablePage.contactStreetAddressField), testDataManager.street + ras_Screener_Constants.SPACE + testDataManager.street2, "-- VERIFYING CONTACT STREET ADDRESS --");
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