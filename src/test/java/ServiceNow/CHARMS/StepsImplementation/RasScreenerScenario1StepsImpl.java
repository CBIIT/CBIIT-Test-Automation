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
     * THIS METHOD WILL SELECT THE SCREENER SUBMISSION ACCORDING TO THE SHEET CHOSEN IN THE FEATURE FILE
     */
    public void rasScreenerScenarioSelector(String sheetName) {
        testDataManagerScenario1.dataInitializerRasScreenerSurveyScenario1(sheetName);
        if(sheetName.contains("screenerScenario1")) {
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
     * USE THIS METHOD WILL COMPLETE THE RAS SCREENER SCENARIO 1
     */
    public void rasScreenerSubmissionScenario1() {
        CommonUtils.switchToNextWindow();
        MiscUtils.sleep(1000);
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
            rasopathyQuestionnairePage.dynamicEmailAddressTextBox(rASScreenerScenario1_Constants.CONFIRM_EMAIL_ADDRESS).sendKeys(testDataManagerScenario1.emailAddress);
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScreenerScenario1StepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicEmailAddressTextBox(rASScreenerScenario1_Constants.CONFIRM_EMAIL_ADDRESS).sendKeys(testDataManagerScenario1.emailAddress);
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
        String previousWindow = WebDriverUtils.webDriver.getWindowHandle();
        WebDriverUtils.webDriver.switchTo().window(previousWindow);
        MiscUtils.sleep(1000);
        if(nativeViewEnrollementsPage.filterNavigatorIconButton.isDisplayed()){
            CommonUtils.clickOnElement(nativeViewEnrollementsPage.filterNavigatorIconButton);
            CommonUtils.waitForVisibility(nativeViewEnrollementsPage.filterNavigator);
        }
        nativeViewEnrollementsPage.filterNavigator.clear();
        MiscUtils.sleep(500);
        nativeViewEnrollementsPage.filterNavigator.sendKeys("CHARMS");
        CommonUtils.waitForClickability(nativeViewCHARMSDashboardPage.nativeViewCharmsDashboardButton);
        JavascriptUtils.scrollIntoView(nativeViewCHARMSDashboardPage.nativeViewCharmsDashboardButton);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        JavascriptUtils.clickByJS(nativeViewCHARMSDashboardPage.nativeViewCharmsDashboardButton);
        CommonUtils.waitForVisibility(nativeViewAccessRequestPage.accessRequestIFrame);
        CommonUtils.switchToFrame(nativeViewAccessRequestPage.accessRequestIFrame);
        CommonUtils.waitForVisibility(nativeViewCHARMSDashboardPage.rasStudyMenu);
        CommonUtils.assertTrue(nativeViewCHARMSDashboardPage.rasStudyMenu.getText()
                .contains("RAS Study"));
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        CommonUtils.waitForVisibility(NativeViewCHARMSDashboardPage.nativeViewnewScreenerReceivedLocator(CHARMSRASScreenerConstants.CONSENT_FLOW_NAME)); //Add this inted of name when running entire test:testDataManager.firstName + " " + testDataManager.lastName
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        CommonUtils.clickOnElement(NativeViewCHARMSDashboardPage.nativeViewnewScreenerReceivedLocator(CHARMSRASScreenerConstants.CONSENT_FLOW_NAME));//Add this inted of name when running entire test:testDataManager.firstName + " " + testDataManager.lastName
        MiscUtils.sleep(1000);
        if(CommonUtils.isElementDisplayed(nativeViewCHARMSDashboardPage.rasStudyOpenRecordButton)){
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
            CommonUtils.clickOnElement(nativeViewCHARMSDashboardPage.rasStudyOpenRecordButton);
        }
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