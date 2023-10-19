package ServiceNow.CHARMS.StepsImplementation;

import ServiceNow.CHARMS.Constants.CHARMSConstants;
import ServiceNow.CHARMS.Constants.CHARMSRASScreenerConstants;
import ServiceNow.CHARMS.Pages.NativeViewCHARMSDashboardPage;
import ServiceNow.COVIDDash.Utils.COVIDConstants;
import ServiceNow.SEER.StepsImplementation.SEERDataAccessRequestPageStepsImpl;
import appsCommon.ServiceNow_Login_Methods;
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
import org.testng.Assert;

public class RasScenario1StepsImpl extends PageInitializer {
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
        if (sheetName.contentEquals("screenerScenario1")) {
            ras_Screener_TestDataManager.dataInitializerRasScreener(sheetName);
            rasScenario1StepsImpl.rasScreenerSubmissionScenario1();
        } else if (sheetName.contentEquals("screenerScenario2")) {
            ras_Screener_TestDataManager.dataInitializerRasScreener(sheetName);
            rasScenario2StepsImpl.rasScreenerSubmissionScenario2();
        } else if (sheetName.contentEquals("screenerScenario3")) {
            ras_Screener_TestDataManager.dataInitializerRasScreener(sheetName);
            rasScenario3StepsImpl.rasScreenerSubmissionScenario3();
        } else if (sheetName.contentEquals("screenerScenario4")) {
            ras_Screener_TestDataManager.dataInitializerRasScreener(sheetName);
            rasScenario4StepsImpl.rasScreenerSubmissionScenario4();
        }
    }

    /***
     * THIS METHOD WILL SELECT THE SCREENER FOR VERIFICATION ACCORDING TO THE SHEET CHOSEN IN THE FEATURE FILE
     */
    public void rasScreenerVerificationScenarioSelector(String sheetName) {
        if (sheetName.contentEquals("screenerScenario1")) {
            ras_Screener_TestDataManager.dataInitializerRasScreener(sheetName);
            rasScenario1StepsImpl.verifying_RAS_Screener_Scenario_1_Data(sheetName);
        }

    }

    /***
     * THIS METHOD WILL SELECT THE CONSENT FLOW ACCORDING TO THE SHEET CHOSEN IN THE FEATURE FILE
     */
    public void rasConsentScenarioSelector(String sheetName) {
            ras_Screener_TestDataManager.dataInitializerRasScreener(sheetName);
            rasScenario1StepsImpl.nativeViewConsentFlowProcessScenario1(sheetName);
    }

    /***
     * THIS METHOD WILL SELECT THE IIQ SUBMISSION ACCORDING TO THE SHEET CHOSEN IN THE FEATURE FILE
     */
    public void iiqScenarioSelector(String sheetNameIiq) {
        if (sheetNameIiq.contentEquals("IIQScenario1")) {
            iiq_TestDataManager.dataInitializerIIQ(sheetNameIiq);
            rasScenario1StepsImpl.rasScreenerIIQFormScenario1();
        } else if (sheetNameIiq.contentEquals("IIQScenario2")) {
            iiq_TestDataManager.dataInitializerIIQ(sheetNameIiq);
            rasScenario2StepsImpl.rasScreenerIIQFormScenario2();
        } else if (sheetNameIiq.contentEquals("IIQScenario3")) {
            iiq_TestDataManager.dataInitializerIIQ(sheetNameIiq);
            rasScenario3StepsImpl.rasScreenerIIQFormScenario3();
        } else if (sheetNameIiq.contentEquals("IIQScenario4")) {
            iiq_TestDataManager.dataInitializerIIQ(sheetNameIiq);
            rasScenario4StepsImpl.rasScreenerIIQFormScenario4();
        }
    }

    /***
     * THIS METHOD WILL SELECT THE SURVEY SUBMISSION ACCORDING TO THE SHEET CHOSEN IN THE FEATURE FILE
     */
    public void rasSurveyScenarioSelector(String sheetName) {
        if (sheetName.contentEquals("RASSurveyScenario1")) {
            ras_Survey_TestDataManager.dataInitializerRasSurvey(sheetName);
            rasScenario1StepsImpl.rasScreenerSurveyScenario1PartOne();
            rasScenario1StepsImpl.rasScreenerSurveyScenario1PartTwo();
            rasScenario1StepsImpl.rasScreenerSurveyScenario1PartThree();
            rasScenario1StepsImpl.rasScreenerSurveyScenario1PartFour();
            rasScenario1StepsImpl.rasScreenerSurveyScenario1PartFive();
            rasScenario1StepsImpl.rasScreenerSurveyScenario1PartSix();
            rasScenario1StepsImpl.rasScreenerSurveyScenario1PartSeven();
            rasScenario1StepsImpl.rasScreenerSurveyScenario1PartEight();
            rasScenario1StepsImpl.rasScreenerSurveyScenario1PartNine();
            rasScenario1StepsImpl.rasScreenerSurveyScenario1PartTen();
        } else if (sheetName.contentEquals("RASSurveyScenario2")) {
            ras_Survey_TestDataManager.dataInitializerRasSurvey(sheetName);
            rasScenario2StepsImpl.rasScreenerSurveyScenario2PartOne();
            rasScenario2StepsImpl.rasScreenerSurveyScenario2PartTwo();
            rasScenario2StepsImpl.rasScreenerSurveyScenario2PartThree();
            rasScenario2StepsImpl.rasScreenerSurveyScenario2PartFour();
            rasScenario2StepsImpl.rasScreenerSurveyScenario2PartFive();
            rasScenario2StepsImpl.rasScreenerSurveyScenario2PartSix();
            rasScenario2StepsImpl.rasScreenerSurveyScenario2PartSeven();
            rasScenario2StepsImpl.rasScreenerSurveyScenario2PartEight();
            rasScenario2StepsImpl.rasScreenerSurveyScenario2PartNine();
            rasScenario2StepsImpl.rasScreenerSurveyScenario2PartTen();
        } else if (sheetName.contentEquals("RASSurveyScenario3")) {
            ras_Survey_TestDataManager.dataInitializerRasSurvey(sheetName);
            rasScenario3StepsImpl.rasScreenerSurveyScenario3PartOne();
            rasScenario3StepsImpl.rasScreenerSurveyScenario3PartTwo();
            rasScenario3StepsImpl.rasScreenerSurveyScenario3PartThree();
            rasScenario3StepsImpl.rasScreenerSurveyScenario3PartFour();
            rasScenario3StepsImpl.rasScreenerSurveyScenario3PartFive();
            rasScenario3StepsImpl.rasScreenerSurveyScenario3PartSix();
            rasScenario3StepsImpl.rasScreenerSurveyScenario3PartSeven();
            rasScenario3StepsImpl.rasScreenerSurveyScenario3PartEight();
            rasScenario3StepsImpl.rasScreenerSurveyScenario3PartNine();
            rasScenario3StepsImpl.rasScreenerSurveyScenario3PartTen();
        } else if (sheetName.contentEquals("RASSurveyScenario4")) {
            ras_Survey_TestDataManager.dataInitializerRasSurvey(sheetName);
            rasScenario4StepsImpl.rasScreenerSurveyScenario4PartOne();
            rasScenario4StepsImpl.rasScreenerSurveyScenario4PartTwo();
            rasScenario4StepsImpl.rasScreenerSurveyScenario4PartThree();
            rasScenario4StepsImpl.rasScreenerSurveyScenario4PartFour();
            rasScenario4StepsImpl.rasScreenerSurveyScenario4PartFive();
            rasScenario4StepsImpl.rasScreenerSurveyScenario4PartSix();
            rasScenario4StepsImpl.rasScreenerSurveyScenario4PartSeven();
            rasScenario4StepsImpl.rasScreenerSurveyScenario4PartEight();
            rasScenario4StepsImpl.rasScreenerSurveyScenario4PartNine();
            rasScenario4StepsImpl.rasScreenerSurveyScenario4PartTen();
        }
    }

    /***
     * THIS METHOD WILL LOG IN WITH USER NAME AND PASSWORD DEFINED IN FEATURE FILE
     */
    public void logsInViaOktaWithUsernameAndPassword(String username, String password) {

        MiscUtils.sleep(1000);
        CommonUtils.waitForVisibility(myRASLoginPage.loginToMyRASButton);
        myRASLoginPage.loginToMyRASButton.click();

        try {
            oktaLoginPage.usernameTxtBox.isDisplayed();
            oktaLoginPage.usernameTxtBox.sendKeys(username);
            oktaLoginPage.passwordTxtBox.sendKeys(password);
            CommonUtils.waitForClickability(oktaLoginPage.loginBtn);
            MiscUtils.sleep(1000);
            CommonUtils.clickOnElement(oktaLoginPage.loginBtn);
            MiscUtils.sleep(2000);
            CommonUtils.waitForVisibility(myRASHomePage.warningAgreeButton);
            CucumberLogUtils.logScreenshot();
            myRASHomePage.warningAgreeButton.click();
        } catch (NoSuchElementException e) {
            CommonUtils.sendKeysToElement(oktaLoginPage.passwordTxtBox, password);
            CommonUtils.waitForClickability(oktaLoginPage.loginBtn);
            MiscUtils.sleep(1000);
            CommonUtils.clickOnElement(oktaLoginPage.loginBtn);
            MiscUtils.sleep(2000);
            CommonUtils.waitForVisibility(myRASHomePage.warningAgreeButton);
            CucumberLogUtils.logScreenshot();
            myRASHomePage.warningAgreeButton.click();
        }
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
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(myRASHomePage.rasoptathyRasSurveyButton);
        MiscUtils.sleep(30000);
        CucumberLogUtils.logScreenshot();
        CommonUtils.waitForClickability(myRASHomePage.rasoptathyRasSurveyCloseButton);
        CommonUtils.clickOnElement(myRASHomePage.rasoptathyRasSurveyCloseButton);
        CommonUtils.waitForVisibility(myRASHomePage.rasoptathyRasSurveyButton);
        CucumberLogUtils.logScreenshot();
        MiscUtils.sleep(5000);
        CommonUtils.clickOnElement(myRASHomePage.rasoptathyRasSurveyButton);
        CommonUtils.waitForClickability(myRASHomePage.rasoptathyRasSurveyGoButton);
        MiscUtils.sleep(5000);
    }

    /***
     * USE THIS METHOD TO CLICK ON RAS IIF FORM
     */
    public void clicksOnTheIiqForm() {
        CommonUtils.waitForVisibility(myRASHomePage.rasoptathyIiqButton);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(myRASHomePage.rasoptathyIiqButton);
        MiscUtils.sleep(30000);
        CucumberLogUtils.logScreenshot();
        CommonUtils.waitForClickability(myRASHomePage.rasoptathyRasSurveyCloseButton);
        CommonUtils.clickOnElement(myRASHomePage.rasoptathyRasSurveyCloseButton);
        CommonUtils.waitForVisibility(myRASHomePage.rasoptathyIiqButton);
        CucumberLogUtils.logScreenshot();
        MiscUtils.sleep(5000);
        CommonUtils.clickOnElement(myRASHomePage.rasoptathyIiqButton);
        CommonUtils.waitForClickability(myRASHomePage.rasoptathyRasSurveyGoButton);
        MiscUtils.sleep(5000);
    }

    /***
     * USE THIS METHOD TO ENTER EMAIL AND PIN
     */
    public void aParticipantEntersUsernameUndPin(String email) {
        CucumberLogUtils.logScreenshot();
        CommonUtils.waitForVisibility(myRASHomePage.rasoptathyRasSurveyPin);
        String pin = myRASHomePage.rasoptathyRasSurveyPin.getText();
        CommonUtils.clickOnElement(myRASHomePage.rasoptathyRasSurveyGoButton);
        CommonUtils.switchToNextWindow();
        MiscUtils.sleep(3000);
        CommonUtils.waitForVisibility(rasopathyQuestionnairePage.dynamicTextBoxLocator("Email"));
        rasopathyQuestionnairePage.dynamicTextBoxLocator("Email").sendKeys(email);
        rasopathyQuestionnairePage.pinTextBox.sendKeys(pin);
        CucumberLogUtils.logScreenshot();
        MiscUtils.sleep(3000);
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        MiscUtils.sleep(3000);
        CucumberLogUtils.logScreenshot();
    }

    /***
     * USE THIS METHOD TO ENTER EMAIL AND PIN IN THE IIQ SAMPLE FORM
     */
    public void aParticipantEntersUsernameUndPinSample(String email, String pin) {
        WebDriverUtils.webDriver.get(CHARMSConstants.IIQ_SAMPLE_FORM);
        CucumberLogUtils.logScreenshot();
        CommonUtils.waitForVisibility(rasopathyQuestionnairePage.dynamicTextBoxLocator("Email"));
        rasopathyQuestionnairePage.dynamicTextBoxLocator("Email").sendKeys(email);
        rasopathyQuestionnairePage.pinTextBox.sendKeys(pin);
        CucumberLogUtils.logScreenshot();
        MiscUtils.sleep(3000);
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        MiscUtils.sleep(3000);
        CucumberLogUtils.logScreenshot();
    }

    /***
     * USE THIS METHOD TO REWIND THE SURVEY FORM
     */
    public void theParticipantWillBeAbleToRewindTheForm() {
        MiscUtils.sleep(2000);
        while (rasopathyQuestionnairePage.rasSurveyPreviousButton.isDisplayed()) {
            rasScenario1StepsImpl.clickOnSurveyPreviousButton();
        }
    }

    /***
     * USE THIS METHOD WILL COMPLETE THE RAS SCREENER SCENARIO 1
     */
    public void rasScreenerSubmissionScenario1() {
        CommonUtils.switchToNextWindow();
        MiscUtils.sleep(2000);
        CommonUtils.waitForVisibility(myRASSurveyPage.rasSurveyThisCopyText);
        //ASSERTING THAT THIS IS THE COPY FOR LOWER ENVIRONMENTS ONLY!!! MESSAGE DISPLAYS
        Assert.assertEquals(myRASSurveyPage.rasSurveyThisCopyText.getText(), ras_Screener_Constants.THIS_IS_A_COPY);
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.scrollIntoView(rasopathyQuestionnairePage.studyNextButton);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        MiscUtils.sleep(2000);
        if (!rasopathyQuestionnairePage.iAmCompletingThisFormForMyselfOption.isDisplayed()) {
            rasScenario1StepsImpl.clickOnScreenerNextButton();
        }
        try {
            rasopathyQuestionnairePage.iAmCompletingThisFormForMyselfOption.click();
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScenario1StepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.iAmCompletingThisFormForMyselfOption.click();
            CucumberLogUtils.logScreenshot();
        }
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        try {
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
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScenario1StepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicLocator(ras_Screener_TestDataManager.whatIsYourRace).click();
            CucumberLogUtils.logScreenshot();
        }
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            rasopathyQuestionnairePage.dynamicLocator(ras_Screener_TestDataManager.areYouAParticipantInOtherStudyGroup).click();
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            rasScenario1StepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicLocator(ras_Screener_TestDataManager.whatIsYourRace).click();
            CucumberLogUtils.logScreenshot();
        }
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(26));
        CommonUtils.assertEqualsWithMessage(ras_Screener_TestDataManager.toDetermineEligibilityForThisStudy, myRASSurveyPage.rasScreenerText.getText(), "-- VERIFYING TO DETERMINE ELIGIBILITY FOR THIS STUDY TEXT --");
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            rasopathyQuestionnairePage.dynamicLocator(ras_Screener_TestDataManager.haveYouBeenDiagnosedWithFollowingConditions).click();
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScenario1StepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicLocator(ras_Screener_TestDataManager.haveYouBeenDiagnosedWithFollowingConditions).click();
            CucumberLogUtils.logScreenshot();
        }
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        CucumberLogUtils.logScreenshot();
        try {
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(117));
            rasopathyQuestionnairePage.dynamicLocator(ras_Screener_TestDataManager.haveYouBeenDiagnosedWithCancer).click();
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            rasScenario1StepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicLocator(ras_Screener_TestDataManager.haveYouBeenDiagnosedWithCancer).click();
            CucumberLogUtils.logScreenshot();
        }
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(118));
            CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicLocator(ras_Screener_TestDataManager.haveYouBeenDiagnosedWithARasopathy));
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            rasScenario1StepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicLocator(ras_Screener_TestDataManager.haveYouBeenDiagnosedWithARasopathy).click();
            CucumberLogUtils.logScreenshot();
        }
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(101));
        CommonUtils.assertEqualsWithMessage(ras_Screener_TestDataManager.weKnowThatRASopathiesAreAGroup, myRASSurveyPage.dynamicTopText(101).getText(), "-- VERIFYING WE KNOW THAT RASOPATHIES ARE A GROUP TEXT --");
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            CommonUtils.waitForVisibility(rasopathyQuestionnairePage.haveAnyOfYourRelativesBeenDiagnosedNoRadioButton);
            CommonUtils.clickOnElement(rasopathyQuestionnairePage.haveAnyOfYourRelativesBeenDiagnosedNoRadioButton);
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScenario1StepsImpl.clickOnScreenerNextButton();
            CommonUtils.clickOnElement(rasopathyQuestionnairePage.haveAnyOfYourRelativesBeenDiagnosedNoRadioButton);
            CucumberLogUtils.logScreenshot();
        }
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(120));
            CommonUtils.clickOnElement(rasopathyQuestionnairePage.haveYouEverHadGeneticTestingNoRadioButton);
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScenario1StepsImpl.clickOnScreenerNextButton();
            CommonUtils.clickOnElement(rasopathyQuestionnairePage.haveYouEverHadGeneticTestingNoRadioButton);
            CucumberLogUtils.logScreenshot();
        }
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(69));
        CommonUtils.assertEqualsWithMessage(ras_Screener_TestDataManager.weWillNowAskAFewRemainingQuestionsRegarding, myRASSurveyPage.rasScreenerText.getText(), "-- VERIFYING WE WILL NOW ASK A FEW REMAINING QUESTIONS TEXT --");
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnScreenerNextButton();

        try {
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(126));
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
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(71));
            CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicLocator(ras_Screener_TestDataManager.haveYouOrOtherFamilyMembersParticipatedInOtherStudy));
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScenario1StepsImpl.clickOnScreenerNextButton();
            CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicLocator(ras_Screener_TestDataManager.haveYouOrOtherFamilyMembersParticipatedInOtherStudy));
            CucumberLogUtils.logScreenshot();
        }
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(81));
            CommonUtils.scrollIntoView(rasopathyQuestionnairePage.dynamicLocator(ras_Screener_TestDataManager.whatAreMainReasonsForParticipatingInStudy));
            CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicLocator(ras_Screener_TestDataManager.whatAreMainReasonsForParticipatingInStudy));
            System.out.println();
            rasopathyQuestionnairePage.dynamicLocatorForMainReasonForParticipatingInStudy(ras_Screener_TestDataManager.whatAreMainReasonsForParticipatingInStudy).sendKeys(ras_Screener_TestDataManager.whatAreMainReasonsForParticipatingInStudyOtherReason);
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScenario1StepsImpl.clickOnScreenerNextButton();
            CommonUtils.scrollIntoView(rasopathyQuestionnairePage.dynamicLocator(ras_Screener_TestDataManager.whatAreMainReasonsForParticipatingInStudy));
            CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicLocator(ras_Screener_TestDataManager.whatAreMainReasonsForParticipatingInStudy));
            rasopathyQuestionnairePage.dynamicLocatorForMainReasonForParticipatingInStudy(ras_Screener_TestDataManager.whatAreMainReasonsForParticipatingInStudy).sendKeys(ras_Screener_TestDataManager.whatAreMainReasonsForParticipatingInStudyOtherReason);
            CucumberLogUtils.logScreenshot();
        }
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(91));
        CommonUtils.assertEqualsWithMessage(ras_Screener_TestDataManager.youAreAlmostDone, myRASSurveyPage.rasScreenerText.getText(), "-- VERIFYING YOU ARE ALMOST DONE TEXT --");
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        MiscUtils.sleep(3000);
        CucumberLogUtils.logScreenshot();
        MiscUtils.sleep(1000);
        logOutOfNativeView();
    }

    /***
     * USE THIS METHOD FOR NATIVE VIEW CONSENT FLOW PROCESS SCENARIO 1
     */
    public void nativeViewConsentFlowProcessScenario1(String sheetName) {
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        MiscUtils.sleep(1000);
        if (nativeViewEnrollementsPage.filterNavigatorIconButton.isDisplayed()) {
            CommonUtils.clickOnElement(nativeViewEnrollementsPage.filterNavigatorIconButton);
            CommonUtils.waitForVisibility(nativeViewEnrollementsPage.filterNavigator);
        }
        nativeViewEnrollementsPage.filterNavigator.clear();
        MiscUtils.sleep(500);
        nativeViewEnrollementsPage.filterNavigator.sendKeys("CHARMS");
        CommonUtils.waitForClickability(nativeViewCHARMSDashboardPage.nativeViewAllParticipantsDetailsButton);
        JavascriptUtils.scrollIntoView(nativeViewCHARMSDashboardPage.nativeViewAllParticipantsDetailsButton);
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(nativeViewCHARMSDashboardPage.nativeViewAllParticipantsDetailsButton);
        CommonUtils.waitForVisibility(nativeViewAccessRequestPage.accessRequestIFrame);
        CommonUtils.switchToFrame(nativeViewAccessRequestPage.accessRequestIFrame);
        CommonUtils.waitForVisibility(nativeViewCHARMSDashboardPage.rasStudyParticipantsDetailsMenu);
        CommonUtils.assertTrue(nativeViewCHARMSDashboardPage.rasStudyParticipantsDetailsMenu.getText()
                .contains("Participant Details"));
        CucumberLogUtils.logScreenshot();
        if (sheetName.contentEquals("screenerScenario1")) {
            CommonUtils.waitForVisibility(NativeViewCHARMSDashboardPage.nativeViewnewScreenerReceivedLocator(ras_Screener_TestDataManager.firstName + " " + ras_Screener_TestDataManager.lastName));
            CucumberLogUtils.logScreenshot();
            CommonUtils.clickOnElement(NativeViewCHARMSDashboardPage.nativeViewnewScreenerReceivedLocator(ras_Screener_TestDataManager.firstName + " " + ras_Screener_TestDataManager.lastName));
        } else if (sheetName.contentEquals("screenerScenario2")) {
            CommonUtils.waitForVisibility(NativeViewCHARMSDashboardPage.nativeViewnewScreenerReceivedLocator(ras_Screener_TestDataManager.firstName + " " + ras_Screener_TestDataManager.lastName));
            CucumberLogUtils.logScreenshot();
            CommonUtils.clickOnElement(NativeViewCHARMSDashboardPage.nativeViewnewScreenerReceivedLocator(ras_Screener_TestDataManager.firstName + " " + ras_Screener_TestDataManager.lastName));
        } else if (sheetName.contentEquals("screenerScenario3")) {
            CommonUtils.waitForVisibility(NativeViewCHARMSDashboardPage.nativeViewnewScreenerReceivedLocator(ras_Screener_TestDataManager.whatIsTheNameOfThePersonWhoMayBeEligibleForThisStudyFirst + " " + ras_Screener_TestDataManager.whatIsTheNameOfThePersonWhoMayBeEligibleForThisStudyLast));
            CucumberLogUtils.logScreenshot();
            CommonUtils.clickOnElement(NativeViewCHARMSDashboardPage.nativeViewnewScreenerReceivedLocator(ras_Screener_TestDataManager.whatIsTheNameOfThePersonWhoMayBeEligibleForThisStudyFirst + " " + ras_Screener_TestDataManager.whatIsTheNameOfThePersonWhoMayBeEligibleForThisStudyLast));
        } else if (sheetName.contentEquals("screenerScenario4")) {
            CommonUtils.waitForVisibility(NativeViewCHARMSDashboardPage.nativeViewnewScreenerReceivedLocator(ras_Screener_TestDataManager.whatIsTheNameOfThePersonWhoMayBeEligibleForThisStudyFirst + " " + ras_Screener_TestDataManager.whatIsTheNameOfThePersonWhoMayBeEligibleForThisStudyLast));
            CucumberLogUtils.logScreenshot();
            CommonUtils.clickOnElement(NativeViewCHARMSDashboardPage.nativeViewnewScreenerReceivedLocator(ras_Screener_TestDataManager.whatIsTheNameOfThePersonWhoMayBeEligibleForThisStudyFirst + " " + ras_Screener_TestDataManager.whatIsTheNameOfThePersonWhoMayBeEligibleForThisStudyLast));
        }
        MiscUtils.sleep(1000);
        if (CommonUtils.isElementDisplayed(nativeViewCHARMSDashboardPage.rasStudyOpenRecordButton)) {
            CucumberLogUtils.logScreenshot();
            CommonUtils.clickOnElement(nativeViewCHARMSDashboardPage.rasStudyOpenRecordButton);
        }
        CommonUtils.waitForClickability(nativeViewCHARMSParticipantDetailsPage.nativeSubjectFlagButton);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantDetailsPage.nativeSubjectFlagButton);
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantConsentPage.rasStudyNonParticipantDateButton);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyNonParticipantDateButton);
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeTodayButton);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeTodayButton);
        MiscUtils.sleep(2000);
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsSubmitForEligibilityButton);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsSubmitForEligibilityButton);
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsMarkEligibleButton);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsMarkEligibleButton);
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsConsentAddedText);
        CucumberLogUtils.logScreenshot();
        CommonUtils.assertEqualsWithMessage(nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsConsentAddedText.getText(), CHARMSRASScreenerConstants.CONSENT_ADDED_TEXT, "---- VERIFYING SCREENER RECORD RASOPATHY HISTORY DATA ----");
        /* BEGINNING: CONSENT FLOW PROCESS */
        JavascriptUtils.scrollIntoView(nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsConsentsButton);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsConsentsButton);
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsConsentsPreviewButton);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsConsentsPreviewButton);
        CommonUtils.waitForVisibility(nativeViewCHARMSDashboardPage.rasStudyOpenRecordButton);
        MiscUtils.sleep(500);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(nativeViewCHARMSDashboardPage.rasStudyOpenRecordButton);
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeCalendar);
        CucumberLogUtils.logScreenshot();
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
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallCompleteButton);
        MiscUtils.sleep(1000);
        CommonUtils.waitForClickability(nativeViewCHARMSParticipantConsentPage.rasStudyConsentAddFileButton);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentAddFileButton);
        CucumberLogUtils.logScreenshot();
        CommonUtils.sendKeys(nativeViewCHARMSParticipantConsentPage.rasStudyConsentChoseFileButton,
                COVIDConstants.IIQ_STUDY_DOCUMENTATION_PDF_PATH);
        MiscUtils.sleep(2000);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentChoseFileCloseButton);
        CommonUtils.waitForClickability(nativeViewCHARMSParticipantConsentPage.rasStudyConsentHardCopyReceivedButton);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentHardCopyReceivedButton);
        CommonUtils.waitForClickability(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCompletedConsentButton);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCompletedConsentButton);
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantConsentPage.rasStudyConsentParticipantRecordsReadyToProgressMessage);
        CommonUtils.assertEqualsWithMessage(nativeViewCHARMSParticipantConsentPage.rasStudyConsentParticipantRecordsReadyToProgressMessage.getText(), CHARMSRASScreenerConstants.PARTICIPANT_READY_TO_PROGRESS_TEXT, "---- VERIFYING PARTICIPANT RECORD READY TO PROGRESS MESSAGE ----");
        CommonUtils.assertEqualsWithMessage(nativeViewCHARMSParticipantConsentPage.rasStudyConsentConsentRecordCompletedMessageMessage.getText(), CHARMSRASScreenerConstants.CONSENT_RECORD_COMPLETED_TEXT, "---- VERIFYING CONSENT RECORD COMPLETED AND FAMILY RECORD IS NOW ACTIVE! MESSAGE ----");
        MiscUtils.sleep(500);
        CucumberLogUtils.logScreenshot();
        SEERDataAccessRequestPageStepsImpl.nativeViewLogOut();
    }

    /***
     * USE THIS METHOD WILL COMPLETE THE IIQ FORM SCENARIO 1
     */
    public void rasScreenerIIQFormScenario1() {
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
        try {
            CommonUtils.waitForClickability(myRASIIQFormPage.screenerIiqFormForWhichSexYouIdentifyRadioButton);
            myRASIIQFormPage.screenerIiqFormForWhichSexYouIdentifyRadioButton.click();
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScenario1StepsImpl.clickOnScreenerNextButton();
            myRASIIQFormPage.screenerIiqFormForWhichSexYouIdentifyRadioButton.click();
            CucumberLogUtils.logScreenshot();
        }
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
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(19));
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
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(93));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(iiq_TestDataManager.areYouOfAshkenazyJewishDescentRadioButton));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(20));
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
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(21));
        MiscUtils.sleep(1000);
        CommonUtils.clickOnElement(rasopathyQuestionnairePage.iiqWereYouRaisedNoOption);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        if (!rasopathyQuestionnairePage.calendarYearTextBox.isDisplayed()) {
            CommonUtils.clickOnElement(rasopathyQuestionnairePage.iiqWereYouRaisedNoOption);
            rasScenario1StepsImpl.clickOnScreenerNextButton();
        }
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
        try {
            rasopathyQuestionnairePage.dynamicTextBoxLocator(iiq_Constants.WHERE_WERE_YOU_BORN_CITY_TEXT_BOX_QUESTION).sendKeys(iiq_TestDataManager.whereWereYouBornCityTextBox);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(iiq_Constants.WHERE_WERE_YOU_BORN_STATE_TEXT_BOX_QUESTION).sendKeys(iiq_TestDataManager.whereWereYouBornStateTextBox);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(iiq_Constants.WHERE_WERE_YOU_BORN_COUNTRY_TEXT_BOX_QUESTION).sendKeys(iiq_TestDataManager.whereWereYouBornCountryTextBox);
            rasopathyQuestionnairePage.iIQAddressDontKnowTextBox.sendKeys(iiq_TestDataManager.whereWereYouBornDontKnowTextBox);
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScenario1StepsImpl.clickOnScreenerNextButton();
            rasopathyQuestionnairePage.dynamicTextBoxLocator(iiq_Constants.WHERE_WERE_YOU_BORN_CITY_TEXT_BOX_QUESTION).sendKeys(iiq_TestDataManager.whereWereYouBornCityTextBox);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(iiq_Constants.WHERE_WERE_YOU_BORN_STATE_TEXT_BOX_QUESTION).sendKeys(iiq_TestDataManager.whereWereYouBornStateTextBox);
            rasopathyQuestionnairePage.dynamicTextBoxLocator(iiq_Constants.WHERE_WERE_YOU_BORN_COUNTRY_TEXT_BOX_QUESTION).sendKeys(iiq_TestDataManager.whereWereYouBornCountryTextBox);
            rasopathyQuestionnairePage.iIQAddressDontKnowTextBox.sendKeys(iiq_TestDataManager.whereWereYouBornDontKnowTextBox);
            CucumberLogUtils.logScreenshot();
        }
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(27));
        CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicClickOnCheckboxesIiqTable(1, 2));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(28));
        MiscUtils.sleep(2000);
        CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicClickOnCheckboxesIiqTable(1, 4));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(29));
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
        try {
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(31));
            MiscUtils.sleep(1000);
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(iiq_TestDataManager.whatIsYourMainOccupationRadioButton));
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScenario1StepsImpl.clickOnScreenerNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(iiq_TestDataManager.whatIsYourMainOccupationRadioButton));
            CucumberLogUtils.logScreenshot();
        }
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(95));
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
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(33));
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
        CommonUtils.waitForVisibility(myRASIIQFormPage.screenerIiqFormThisSectionAsksDetailedMedicalHistoryText);
        CommonUtils.assertEqualsWithMessage(iiq_Constants.THIS_SECTION_ASKS_YOU_TEXT, myRASIIQFormPage.screenerIiqFormThisSectionAsksDetailedMedicalHistoryText.getText(), "-- VERIFYING THIS SECTION ASKS DETAILED MEDICAL HISTORY TEXT --");
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(47));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(iiq_TestDataManager.wereYouConceivedUsingVitroRadioButton));
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScenario1StepsImpl.clickOnScreenerNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(iiq_TestDataManager.wereYouConceivedUsingVitroRadioButton));
            CucumberLogUtils.logScreenshot();
        }
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(37));
        MiscUtils.sleep(1000);
        CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicLocator(iiq_TestDataManager.wereYouATwinRadioButton));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        if (!myRASSurveyPage.dynamicTopText(41).isDisplayed()) {
            CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicLocator(iiq_TestDataManager.wereYouATwinRadioButton));
            CucumberLogUtils.logScreenshot();
            rasScenario1StepsImpl.clickOnScreenerNextButton();
        }

        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(41));
        MiscUtils.sleep(1000);
        CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicLocator(iiq_TestDataManager.areYourBiologicalParentsBloodRelatedRadioButton));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        if (!myRASSurveyPage.dynamicTopText(43).isDisplayed()) {
            CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicLocator(iiq_TestDataManager.areYourBiologicalParentsBloodRelatedRadioButton));
            CucumberLogUtils.logScreenshot();
            rasScenario1StepsImpl.clickOnScreenerNextButton();
        }
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
        CommonUtils.waitForVisibility(myRASIIQFormPage.screenerIiqFormFillOutBirthWeight);
        CommonUtils.sendKeysToElement(myRASIIQFormPage.screenerIiqFormFillOutBirthWeight, iiq_TestDataManager.pleaseFillOutBirtWeightNumericTextBox);
        MiscUtils.sleep(3000);
        CommonUtils.selectDropDownValue(iiq_TestDataManager.pleaseFillOutBirtWeightUnitDropDown, myRASIIQFormPage.screenerIiqFormFillOutBirthWeightUnitDropDown);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        CommonUtils.waitForVisibility(myRASIIQFormPage.screenerIiqFormFillOutBirthLenghtHeadNumeticTextBox);
        CommonUtils.sendKeysToElement(myRASIIQFormPage.screenerIiqFormFillOutBirthLenghtHeadNumeticTextBox, iiq_TestDataManager.pleaseFillOutHeadNumericTextBox);
        CommonUtils.sendKeysToElement(myRASIIQFormPage.screenerIiqFormFillOutBirthLenghtHeadCircumferenceNumeticTextBox, iiq_TestDataManager.pleaseFillOutHeadCircumferenceNumericTextBox);
        MiscUtils.sleep(3000);
        CommonUtils.selectDropDownValue(iiq_TestDataManager.pleaseFillOutHeadUnitDropDown, myRASIIQFormPage.screenerIiqFormFillOutBirthLenghtHeadUnitDropDown);
        CommonUtils.selectDropDownValue(iiq_TestDataManager.pleaseFillOutHeadCircumferenceUnitDropDown, myRASIIQFormPage.screenerIiqFormFillOutBirthLenghtHeadCircumferenceUnitDropDown);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        CommonUtils.waitForVisibility(myRASIIQFormPage.screenerIiqFormThisSectionWillAskAboutCancerText);
        CommonUtils.assertEqualsWithMessage(iiq_Constants.THIS_SECTION_WILL_ASK_ABOUT_CANCER_TEXT, myRASIIQFormPage.screenerIiqFormThisSectionWillAskAboutCancerText.getText(), "-- VERIFYING THIS SECTION WILL ASK ABOUT CANCER TEXT --");
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(62));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(iiq_TestDataManager.haveYouEverBeenDiagnosedWithAnyCancerRadioButton));
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScenario1StepsImpl.clickOnScreenerNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(iiq_TestDataManager.haveYouEverBeenDiagnosedWithAnyCancerRadioButton));
            CucumberLogUtils.logScreenshot();
        }
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(67));
        MiscUtils.sleep(1000);
        CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicLocator(iiq_TestDataManager.haveYouEverHadMedicalGeneticTestingRadioButton));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        if (!myRASIIQFormPage.screenerIiqFormFillOutCurrentHeightTextBox.isDisplayed()) {
            CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicLocator(iiq_TestDataManager.haveYouEverHadMedicalGeneticTestingRadioButton));
            CucumberLogUtils.logScreenshot();
            rasScenario1StepsImpl.clickOnScreenerNextButton();
        }
        CommonUtils.waitForVisibility(myRASIIQFormPage.screenerIiqFormFillOutCurrentHeightTextBox);
        CommonUtils.sendKeysToElement(myRASIIQFormPage.screenerIiqFormFillOutCurrentHeightTextBox, iiq_TestDataManager.pleaseFillTheTableBelowWithHeightNumericTextBox);
        MiscUtils.sleep(2000);
        CommonUtils.selectDropDownValue(iiq_TestDataManager.pleaseFillTheTableBelowWithHeightUnitDropDown, myRASIIQFormPage.screenerIiqFormFillOutCurrentHeightUnitDropDown);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        MiscUtils.sleep(3000);
        CommonUtils.waitForVisibility(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3));
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3), iiq_TestDataManager.pleaseCompleteTheTableBelowIndicatingYourWeightColumn1Option1);
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 3), iiq_TestDataManager.pleaseCompleteTheTableBelowIndicatingYourWeightColumn1Option2);
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(3, 3), iiq_TestDataManager.pleaseCompleteTheTableBelowIndicatingYourWeightColumn1Option3);
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(4, 3), iiq_TestDataManager.pleaseCompleteTheTableBelowIndicatingYourWeightColumn1Option4);
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(5, 3), iiq_TestDataManager.pleaseCompleteTheTableBelowIndicatingYourWeightColumn1Option5);
        CommonUtils.selectDropDownValue(iiq_TestDataManager.pleaseCompleteTheTableBelowIndicatingYourWeightColumn2Option1, myRASSurveyPage.dynamicDropDownTwo(1, 6));
        CommonUtils.selectDropDownValue(iiq_TestDataManager.pleaseCompleteTheTableBelowIndicatingYourWeightColumn2Option2, myRASSurveyPage.dynamicDropDownTwo(2, 6));
        CommonUtils.selectDropDownValue(iiq_TestDataManager.pleaseCompleteTheTableBelowIndicatingYourWeightColumn2Option3, myRASSurveyPage.dynamicDropDownTwo(3, 6));
        CommonUtils.selectDropDownValue(iiq_TestDataManager.pleaseCompleteTheTableBelowIndicatingYourWeightColumn2Option4, myRASSurveyPage.dynamicDropDownTwo(4, 6));
        CommonUtils.selectDropDownValue(iiq_TestDataManager.pleaseCompleteTheTableBelowIndicatingYourWeightColumn2Option5, myRASSurveyPage.dynamicDropDownTwo(5, 6));
        CommonUtils.clickOnElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(1, 9));
        CommonUtils.clickOnElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(2, 9));
        CommonUtils.clickOnElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(3, 9));
        CommonUtils.clickOnElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(4, 9));
        CommonUtils.clickOnElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(5, 9));
        CommonUtils.clickOnElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(1, 12));
        CommonUtils.clickOnElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(2, 12));
        CommonUtils.clickOnElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(3, 12));
        CommonUtils.clickOnElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(4, 12));
        CommonUtils.clickOnElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(5, 12));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(78));
        CommonUtils.sendKeysToElement(myRASSurveyPage.dynamicOneTextBox(78), iiq_TestDataManager.atWhatAgeWereYouAtTheHighestWeightTextBox);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        try {
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(154));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(iiq_TestDataManager.haveYouSoughtMedicalAdviceRegardingFertilityRadioButton));
            CucumberLogUtils.logScreenshot();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            rasScenario1StepsImpl.clickOnScreenerNextButton();
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(iiq_TestDataManager.haveYouSoughtMedicalAdviceRegardingFertilityRadioButton));
            CucumberLogUtils.logScreenshot();
        }
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        CommonUtils.waitForVisibility(myRASIIQFormPage.screenerIiqFormYouAreAlmostDoneText);
        CommonUtils.assertEqualsWithMessage(iiq_Constants.YOU_ARE_ALMOST_DONE_TEXT, myRASIIQFormPage.screenerIiqFormYouAreAlmostDoneText.getText(), "-- VERIFYING YOU ARE ALMOST DONE TEXT --");
        CucumberLogUtils.logScreenshot();
        MiscUtils.sleep(3000);
        rasScenario1StepsImpl.clickOnScreenerNextButton();
        MiscUtils.sleep(1000);
        CucumberLogUtils.logScreenshot();
        logOutOfNativeView();
    }

    /***
     * USE THIS METHOD WILL COMPLETE THE RAS SURVEY SCENARIO 1
     */
    public void rasScreenerSurveyScenario1PartOne() {
        CommonUtils.waitForVisibility(myRASSurveyPage.rasSurveyThankYouForStartingText);
        CommonUtils.assertEqualsWithMessage(ras_Survey_TestDataManager.thankYouForStartingTheRASSurveyAndFor, myRASSurveyPage.rasSurveyText.getText(), "-- VERIFYING THANK YOU FOR STARTING THE RAS SURVEY AND FOR YOUR TEXT --");
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.rasSurveyThisQuestionMayTakeText);
        CommonUtils.assertEqualsWithMessage(ras_Survey_TestDataManager.thisQuestionnaireMayTakeYouSeveral, myRASSurveyPage.rasSurveyText.getText(), "-- VERIFYING THIS QUESTIONNAIRE MAY TAKE YOU SEVERAL HOURS TO COMPLETE TEXT --");
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.rasSurveyTheFirstBlockText);
        CommonUtils.assertEqualsWithMessage(ras_Survey_TestDataManager.thisQuestionnaireMayTakeYouSeveral, myRASSurveyPage.rasSurveyText.getText(), "-- VERIFYING THE FIRST BLOCK OF QUESTIONS WILL COLLECT TEXT --");
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(1));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.toConfirmAreYouCompleting));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(58));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverBeenIncluded));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.rasSurveyTheNextSetOfQuestionsWillAskAboutBirthAndNeonatalText);
        CommonUtils.assertEqualsWithMessage(ras_Survey_TestDataManager.theNextSetOfQuestionsWillAskAboutNeonatalHistory, myRASSurveyPage.rasSurveyText.getText(), "-- VERIFYING THE NEXT SET OF QUESTIONS WILL ASK ABOUT BIRTH AND NEONATAL  TEXT --");
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.pleaseCompleteYourBiologicalParentsBiologicalMotherCityTextBox);
        int momAgeDropdownIndex = Integer.valueOf(ras_Survey_TestDataManager.pleaseCompleteYourBiologicalParentsBiologicalMotherAge) - 11;
        int fatherDropDownIndex = Integer.valueOf(ras_Survey_TestDataManager.pleaseCompleteYourBiologicalParentsBiologicalFatherAge) - 11;
        CommonUtils.sendKeysToElement(myRASSurveyPage.pleaseCompleteYourBiologicalParentsBiologicalMotherCityTextBox, ras_Survey_TestDataManager.pleaseCompleteYourBiologicalParentsBiologicalMotherCity);
        CommonUtils.clickOnElement(myRASSurveyPage.pleaseCompleteYourBiologicalParentsBiologicalMotherUnsureRadioButton);
        CommonUtils.selectDropDownValue(myRASSurveyPage.pleaseCompleteYourBiologicalParentsBiologicalMotherYearsDropDown, momAgeDropdownIndex);
        CommonUtils.sendKeysToElement(myRASSurveyPage.pleaseCompleteYourBiologicalParentsBiologicalFatherCityTextBox, ras_Survey_TestDataManager.pleaseCompleteYourBiologicalParentsBiologicalFatherCity);
        CommonUtils.clickOnElement(myRASSurveyPage.pleaseCompleteYourBiologicalParentsBiologicalFatherUnsureRadioButton);
        CommonUtils.selectDropDownValue(myRASSurveyPage.pleaseCompleteYourBiologicalParentsBiologicalFatherYearsDropDown, fatherDropDownIndex);
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
        CommonUtils.waitForVisibility(rasopathyQuestionnairePage.dynamicClickOnCheckboxesScreener(9));
        CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicClickOnCheckboxesScreener(9));
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
        CommonUtils.waitForVisibility(rasopathyQuestionnairePage.dynamicClickOnCheckboxesScreener(12));
        CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicClickOnCheckboxesScreener(12));
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
        try {
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(63));
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
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(65));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.didYourBiologicalMotherUseAnyVaping));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(67));
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
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(69));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.didYourBiologicalMotherUseAnyRecreationalDrugs));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(71));
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
        CommonUtils.waitForVisibility(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3));
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3), ras_Survey_TestDataManager.biologicalMotherOccupationDuringPregnancy);
        JavascriptUtils.clickByJS(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(1, 6));
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 3), ras_Survey_TestDataManager.biologicalMotherOccupationDuringPregnancyFather);
        JavascriptUtils.clickByJS(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(2, 6));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.whatIsTheHeightOfYourBiologicalMotherAndFatherText);
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(1, 3), ras_Survey_TestDataManager.whatIsTheHeightOfYourBiologicalMother);
        JavascriptUtils.clickByJS(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(1, 6));
        JavascriptUtils.clickByJS(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(1, 10));
        CommonUtils.sendKeysToElement(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(2, 3), ras_Survey_TestDataManager.whatIsTheHeightOfYourBiologicalFather);
        JavascriptUtils.clickByJS(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(2, 6));
        JavascriptUtils.clickByJS(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(2, 10));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.rasSurveyTheNextSetOfQuestionsWillAskAboutHormoneRelatedGrowthText);
        CommonUtils.assertEqualsWithMessage(ras_Survey_TestDataManager.theNextSetHormoneRelatedGrowth, myRASSurveyPage.rasSurveyText.getText(), "-- VERIFYING THE NEXT SET OF QUESTIONS WILL ASK ABOUT HORMONE RELATED GROWTH TEXT --");
        CucumberLogUtils.logScreenshot();
    }

    public void rasScreenerSurveyScenario1PartTwo() {
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
        try {
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(76));
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
        try {
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(78));
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
        CommonUtils.waitForVisibility(myRASSurveyPage.theNextSetOfQuestionsWillAskAboutDevelopmentText);
        CommonUtils.assertEqualsWithMessage(ras_Survey_TestDataManager.theNextSetOfQuestionsWillAskAboutDevelopment, myRASSurveyPage.rasSurveyText.getText(), "-- VERIFYING THE NEXT SET OF QUESTIONS WILL ASK ABOUT DEVELOPMENT TEXT --");
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
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(84));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.atWhatAgeWereYouAbleToWalkWithoutSupport));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        try {
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverReceivedPhysicalTherapy));
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
            CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.atWhatAgeWereYouAbleToUseSimpleTwoWordPhrases));
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
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(88));
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
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(90));
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
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(92));
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
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(93));
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
        MiscUtils.sleep(2000);
        CommonUtils.waitForVisibility(rasopathyQuestionnairePage.dynamicClickOnCheckboxesScreener(5));
        CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicClickOnCheckboxesScreener(5));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(97));
        MiscUtils.sleep(2000);
    }

    public void rasScreenerSurveyScenario1PartThree() {
        //*** ATTACHING FILE CAN'T BE AUTOMATED IN QUATRICS. MANUAL TESTING WAS PERFORMED FOR UPLOADING A FILE *******
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.theNextSetOfQuestionsWillAskAboutHeartText);
        CommonUtils.assertEqualsWithMessage(ras_Survey_TestDataManager.theNextSetOfQuestionsWillAskAboutHeart, myRASSurveyPage.rasSurveyText.getText(), "-- VERIFYING THE NEXT SET OF QUESTIONS WILL ASK ABOUT HEART TEXT --");
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(372));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverBeenEvaluatedByACardiologist));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(320));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithAnyStructuralHeartIssues));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(100));
        CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicClickOnCheckboxesScreener(12));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForClickability(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithAnyFunctionalHeartIssues));
        CommonUtils.waitForVisibility(myRASSurveyPage.haveYouEverBeenDiagnosedWithAnyFunctionalHeartIssueText);
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithAnyFunctionalHeartIssues));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.theNextTwoQuestionsWillAskAboutRASopathyDiagnosesText);
        CommonUtils.assertEqualsWithMessage(ras_Survey_TestDataManager.theNextTwoQuestionsWillAskAboutRASopathyDiagnoses, myRASSurveyPage.rasSurveyText.getText(), "-- VERIFYING THE NEXT TWO QUESTIONS WILL ASK ABOUT RASOPATHY DIAGNOSES TEXT --");
        CucumberLogUtils.logScreenshot();
    }

    public void rasScreenerSurveyScenario1PartFour() {
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouBeenDiagnosedWithARASopathy));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouBeenDiagnosedWithARASopathy));
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
        CommonUtils.waitForClickability(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(1, 4));
        JavascriptUtils.clickByJS(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(1, 4));
        JavascriptUtils.clickByJS(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(2, 4));
        JavascriptUtils.clickByJS(myRASSurveyPage.enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(3, 4));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(108));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverHadAnOperationOrBiopsy));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(110));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverBeenHospitalizedForAnyReason));
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
        CommonUtils.waitForVisibility(rasopathyQuestionnairePage.dynamicClickOnCheckboxesScreener(7));
        CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicClickOnCheckboxesScreener(7));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.HaveYouEverHadAnyPhysicalSymptoms));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.HaveYouEverHadAnyPhysicalSymptoms));
        CucumberLogUtils.logScreenshot();
    }

    public void rasScreenerSurveyScenario1PartFive() {
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(327));
        CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.areYouToiletTrained));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.medicationForAbdominalPainDropDownTwo());
        CommonUtils.selectDropDownValue(ras_Survey_TestDataManager.howManyBowelMovementsDoYouHavePerWeek, myRASSurveyPage.medicationForAbdominalPainDropDownTwo());
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.whatIsTheLongestAmountOfTimeThatHasPassedText);
        CommonUtils.selectDropDownValue(ras_Survey_TestDataManager.whatIsTheLongestAmountOfTimeThatHasPassedWithout, myRASSurveyPage.medicationForAbdominalPainDropDownTwo());
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(153));
        CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.ifYouAreNotYetAbleToUseTheToilet));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.pleaseUseTheBristolStoolChart));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.pleaseUseTheBristolStoolChart));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(351));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverHadAProcedureTestOrStudyToEvaluate));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
    }

    public void rasScreenerSurveyScenario1PartSix() {
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(305));
        CommonUtils.assertEqualsWithMessage(ras_Survey_TestDataManager.theNextSetOfQuestionsAskAboutBreathingAndTheLungs, myRASSurveyPage.rasSurveyText.getText(), "-- VERIFYING THE NEXT SET OF QUESTIONS ASK ABOUT BREATHING AND THE LUNGS TEXT --");
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(380));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverHadAnEvaluationByAPulmonologist));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(162));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverHadWheezingOrWhistling));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(163));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouBeenDiagnosedWithReactiveAirwayDisease));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(164));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverBeenSeenInTheEmergencyRoomForABreathing));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(165));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverBeenSeenInTheHospitalForABreathing));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(330));
        CommonUtils.assertEqualsWithMessage(ras_Survey_TestDataManager.theNextSetOfQuestionsWillAskAboutOralHealthAndDental, myRASSurveyPage.rasSurveyText.getText(), "-- VERIFYING THE NEXT SET OF QUESTIONS WILL ASK ABOUT ORAL HEALTH AND DENTAL HISTORY TEXT --");
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(166));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.doYouReceiveRegularDentalCare));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(168));
        CommonUtils.sendKeysToElement(myRASSurveyPage.dynamicOneTextBox(168), ras_Survey_TestDataManager.whenDidYouLastVisitADentist);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(167));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.whatWasTheReasonForYourLastDentalVisitOption));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(169));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.doYourGumsBleedRegularlyWithToothBrushing));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(170));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.doYourTeethOrGumsHurtRegularly));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(171));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.doYouHavePeriodontalOrGumDisease));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(172));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouHadDentalSealantsPlaced));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(173));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.doYouCurrentlyHaveCavities));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(174));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouPreviouslyHadAnyDentalFillings));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(175));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.doesYourMouthUsuallyFeelDry));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(176));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.overallHowWouldYouRateTheOverallHealth));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(177));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.overallHowWouldYouRateYourDentalHygieneRoutine));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(178));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouHadAnyChangesInYourSenseOfSmell));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(179));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouHadAnyChangesInYourSenseOfTaste));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(180));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.doYouHaveJawOrTemporomandibularJointPain));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(181));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.doYouHaveFrequentHeadaches));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(182));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouHadAnyOrthodonticTreatment));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(184));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouHadAnyFacialOrDentalTrauma));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(186));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouHadElectiveJawSurgery));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(189));
        CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicClickOnCheckboxesScreener(2));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(190));
        CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicClickOnCheckboxesScreener(2));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(191));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.doYouHaveAnyNumbnessInOrAroundYourMouth));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(192));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.doYouHaveAnyMouthSores));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(193));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.doYourTeethFeelSensitiveToHotOrColdFoods));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(194));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.doYouHaveProblemsMovingYourLipsTongueOrMouth));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(195));
        CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicClickOnCheckboxesScreener(2));
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
                ras_Survey_TestDataManager.haveYouFeltThatLifeInGeneralIsLessSatisfying};
        for (int jjj = 196; jjj < 210; jjj++) {
            CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(jjj));
            JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(clickingOnOptionInMultiplePages[jjj - 196]));
            CucumberLogUtils.logScreenshot();
            rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        }
    }

    public void rasScreenerSurveyScenario1PartSeven() {
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(306));
        CommonUtils.assertEqualsWithMessage(ras_Survey_TestDataManager.theNextSetOfQuestionsAskAboutFluidBalance, myRASSurveyPage.rasSurveyText.getText(), "-- VERIFYING THE NEXT SET OF QUESTIONS ASK ABOUT FLUID BALANCE AND IF ANY FLUID BUILDS TEXT --");
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(331));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithALymphaticSystemIssue));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(332));
        CommonUtils.assertEqualsWithMessage(ras_Survey_TestDataManager.theNextSetOfQuestionsWillAskAboutTheKidneys, myRASSurveyPage.rasSurveyText.getText(), "-- VERIFYING THE NEXT SET OF QUESTIONS WILL ASK ABOUT THE KIDNEYS TEXT --");
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(383));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverBeenEvaluatedByANephrologist));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(329));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithAKidneyProblem));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(309));
        CommonUtils.assertEqualsWithMessage(ras_Survey_TestDataManager.theNextSetOfQuestionsAskAboutHairAndSkinQualities, myRASSurveyPage.rasSurveyText.getText(), "-- VERIFYING THE NEXT SET OF QUESTIONS ASK ABOUT HAIR AND SKIN QUALITIES TEXT --");
        CucumberLogUtils.logScreenshot();
    }

    public void rasScreenerSurveyScenario1PartEight() {
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(385));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverBeenEvaluatedByADermatologist));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(rasopathyQuestionnairePage.dynamicClickOnCheckboxesScreener(4));
        CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicClickOnCheckboxesScreener(4));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(221));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.isTheTextureOrAmountOfYourHairSimilar));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(rasopathyQuestionnairePage.dynamicClickOnCheckboxesScreener(7));
        CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicClickOnCheckboxesScreener(7));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(rasopathyQuestionnairePage.dynamicClickOnCheckboxesScreener(5));
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(223));
        CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicClickOnCheckboxesScreener(7));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(224));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.doYouHaveAnyHemangiomas));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(rasopathyQuestionnairePage.dynamicClickOnCheckboxesScreener(5));
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(225));
        CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicClickOnCheckboxesScreener(7));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(310));
        CommonUtils.assertEqualsWithMessage(ras_Survey_TestDataManager.theNextSetOfQuestionsAskAboutSkeletalConditions, myRASSurveyPage.rasSurveyText.getText(), "-- VERIFYING THE NEXT SET OF QUESTIONS ASK ABOUT SKELETAL CONDITIONS TEXT --");
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(387));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverBeenEvaluatedByAnOrthopaedicSurgeon));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(226));
        CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicClickOnCheckboxesScreener(6));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(352));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.doYouHaveAnyIssuesWithCurvingOfTheSpine));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(231));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.hasYourNeckBeenDescribedAsShortOrWebbed));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(353));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithJointIssues));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(311));
        CommonUtils.assertEqualsWithMessage(ras_Survey_TestDataManager.theNextSetOfQuestionsAskAboutBloodDisorders, myRASSurveyPage.rasSurveyText.getText(), "-- VERIFYING THE NEXT SET OF QUESTIONS ASK ABOUT BLOOD DISORDERS TEXT --");
        CucumberLogUtils.logScreenshot();
    }

    public void rasScreenerSurveyScenario1PartNine() {
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(389));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverHadAnEvaluationByAHematologist));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(354));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.doYouHaveIssuesWithBleedingOrBruising));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(355));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.doYouHaveAnyKnownBloodDisorders));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(238));
        CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicClickOnCheckboxesScreener(8));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(356));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.doYouHaveAHistoryOfFrequentInfections));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(391));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverBeenEvaluatedByAnImmunologist));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(357));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithAnAutoimmuneDisorder));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(312));
        CommonUtils.assertEqualsWithMessage(ras_Survey_TestDataManager.theNextSetOfQuestionsAskAboutNervousSystem, myRASSurveyPage.rasSurveyText.getText(), "-- VERIFYING THE NEXT SET OF QUESTIONS ASK ABOUT NERVOUS SYSTEM TEXT --");
        CucumberLogUtils.logScreenshot();
    }

    public void rasScreenerSurveyScenario1PartTen() {
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(393));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverBeenEvaluatedByANeurologist));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(358));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithAStructuralBrainAbnormality));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(359));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.doYouHaveAHistoryOfSeizures));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(395));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverBeenEvaluatedByAPsychiatrist));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(360));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithABehavioral));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(249));
        CommonUtils.sendKeysToElement(myRASSurveyPage.dynamicOneTextBox(249), ras_Survey_TestDataManager.pleaseListAndDescribeAnyAdditionalNeurologicConditions);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(313));
        CommonUtils.assertEqualsWithMessage(ras_Survey_TestDataManager.theNextSetOfQuestionsAskAboutVisionAndHearing, myRASSurveyPage.rasSurveyText.getText(), "-- VERIFYING THE NEXT SET OF QUESTIONS ASK ABOUT VISION AND HEARING TEXT --");
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(250));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithPtosis));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(361));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverHadAnyIssuesWithYourVision));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(253));
        CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicClickOnCheckboxesScreener(7));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(254));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverExperiencedStabismus));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(256));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouEverExperiencedNystagmus));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(362));
        JavascriptUtils.clickByJS(rasopathyQuestionnairePage.dynamicLocator(ras_Survey_TestDataManager.haveYouExperiencedHearingLoss));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(260));
        CommonUtils.clickOnElement(rasopathyQuestionnairePage.dynamicClickOnCheckboxesScreener(4));
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(297));
        CommonUtils.sendKeysToElement(myRASSurveyPage.dynamicOneTextBox(297), ras_Survey_TestDataManager.ifThereAreAnyOtherHealthIssues);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        CommonUtils.waitForVisibility(myRASSurveyPage.dynamicTopText(298));
        CommonUtils.assertEqualsWithMessage(ras_Survey_TestDataManager.youAreAlmostDoneSurvey, myRASSurveyPage.dynamicTopText(298).getText(), "-- VERIFYING YOU ARE ALMOST DONE TEXT --");
        MiscUtils.sleep(1000);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.clickOnSurveySavAndNextButton();
        MiscUtils.sleep(3000);
        CucumberLogUtils.logScreenshot();
        MiscUtils.sleep(1000);
        logOutOfNativeView();
    }

    /***
     * USE THIS METHOD TO LOG OUT OF NATIVE VIEW
     */
    public static void logOutOfNativeView() {
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("nativeview"));
        MiscUtils.sleep(2000);
        CommonUtils.clickOnElement(nativeViewHomePage.profileModule);
        CommonUtils.clickOnElement(nativeViewHomePage.logOutButton);
    }

    public void verifyingDropDownOption(WebElement element, String message) {
        CommonUtils.assertEqualsWithMessage(element.getAttribute("selected"), "true", message);
    }

    /***
     * THIS METHOD VERIFIES RAS SCREENER SCENARIO 1 DATA IN NATIVE VIEW
     */
    public void verifying_RAS_Screener_Scenario_1_Data(String sheetName) {
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        MiscUtils.sleep(1000);
        if (nativeViewEnrollementsPage.filterNavigatorIconButton.isDisplayed()) {
            CommonUtils.clickOnElement(nativeViewEnrollementsPage.filterNavigatorIconButton);
            CommonUtils.waitForVisibility(nativeViewEnrollementsPage.filterNavigator);
        }
        nativeViewEnrollementsPage.filterNavigator.clear();
        MiscUtils.sleep(500);
        nativeViewEnrollementsPage.filterNavigator.sendKeys("CHARMS");
        CommonUtils.waitForClickability(nativeViewCHARMSDashboardPage.nativeViewAllParticipantsDetailsButton);
        JavascriptUtils.scrollIntoView(nativeViewCHARMSDashboardPage.nativeViewAllParticipantsDetailsButton);
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(nativeViewCHARMSDashboardPage.nativeViewAllParticipantsDetailsButton);
        CommonUtils.waitForVisibility(nativeViewAccessRequestPage.accessRequestIFrame);
        CommonUtils.switchToFrame(nativeViewAccessRequestPage.accessRequestIFrame);
        CommonUtils.waitForVisibility(nativeViewCHARMSDashboardPage.rasStudyParticipantsDetailsMenu);
        CommonUtils.assertTrue(nativeViewCHARMSDashboardPage.rasStudyParticipantsDetailsMenu.getText()
                .contains("Participant Details"));
        CucumberLogUtils.logScreenshot();
        if (sheetName.contentEquals("screenerScenario1")) {
            CommonUtils.waitForVisibility(NativeViewCHARMSDashboardPage.nativeViewnewScreenerReceivedLocator(ras_Screener_TestDataManager.firstName + " " + ras_Screener_TestDataManager.lastName));
            CucumberLogUtils.logScreenshot();
            CommonUtils.clickOnElement(NativeViewCHARMSDashboardPage.nativeViewnewScreenerReceivedLocator(ras_Screener_TestDataManager.firstName + " " + ras_Screener_TestDataManager.lastName));
        } else if (sheetName.contentEquals("screenerScenario2")) {
            CommonUtils.waitForVisibility(NativeViewCHARMSDashboardPage.nativeViewnewScreenerReceivedLocator(ras_Screener_TestDataManager.firstName + " " + ras_Screener_TestDataManager.lastName));
            CucumberLogUtils.logScreenshot();
            CommonUtils.clickOnElement(NativeViewCHARMSDashboardPage.nativeViewnewScreenerReceivedLocator(ras_Screener_TestDataManager.firstName + " " + ras_Screener_TestDataManager.lastName));
        } else if (sheetName.contentEquals("screenerScenario3")) {
            CommonUtils.waitForVisibility(NativeViewCHARMSDashboardPage.nativeViewnewScreenerReceivedLocator(ras_Screener_TestDataManager.whatIsTheNameOfThePersonWhoMayBeEligibleForThisStudyFirst + " " + ras_Screener_TestDataManager.whatIsTheNameOfThePersonWhoMayBeEligibleForThisStudyLast));
            CucumberLogUtils.logScreenshot();
            CommonUtils.clickOnElement(NativeViewCHARMSDashboardPage.nativeViewnewScreenerReceivedLocator(ras_Screener_TestDataManager.whatIsTheNameOfThePersonWhoMayBeEligibleForThisStudyFirst + " " + ras_Screener_TestDataManager.whatIsTheNameOfThePersonWhoMayBeEligibleForThisStudyLast));
        } else if (sheetName.contentEquals("screenerScenario4")) {
            CommonUtils.waitForVisibility(NativeViewCHARMSDashboardPage.nativeViewnewScreenerReceivedLocator(ras_Screener_TestDataManager.whatIsTheNameOfThePersonWhoMayBeEligibleForThisStudyFirst + " " + ras_Screener_TestDataManager.whatIsTheNameOfThePersonWhoMayBeEligibleForThisStudyLast));
            CucumberLogUtils.logScreenshot();
            CommonUtils.clickOnElement(NativeViewCHARMSDashboardPage.nativeViewnewScreenerReceivedLocator(ras_Screener_TestDataManager.whatIsTheNameOfThePersonWhoMayBeEligibleForThisStudyFirst + " " + ras_Screener_TestDataManager.whatIsTheNameOfThePersonWhoMayBeEligibleForThisStudyLast));
        }
        MiscUtils.sleep(1000);
        System.out.println("---- VERIFYING PARTICIPANT RECORD PREVIEW DATA ----");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(participantDetailsPage.firstNameRecordPreviewField), ras_Screener_TestDataManager.firstName, "-- VERIFYING PREVIEW RECORD FIRST NAME --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(participantDetailsPage.lastNameRecordPreviewField), ras_Screener_TestDataManager.lastName, "-- VERIFYING PREVIEW RECORD LAST NAME --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(participantDetailsPage.middleNameRecordPreviewField), ras_Screener_TestDataManager.middleInitial, "-- VERIFYING PREVIEW RECORD MIDDLE NAME --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(participantDetailsPage.contactHomePhoneRecordPreviewField), ras_Screener_TestDataManager.homePhoneNumber, "-- VERIFYING PREVIEW RECORD CONTACT HOME PHONE NUMBER --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(participantDetailsPage.contactEmailRecordPreviewField), ras_Screener_TestDataManager.emailAddress, "-- VERIFYING PREVIEW RECORD CONTACT EMAIL ADDRESS --");
        CucumberLogUtils.logScreenshot();
        if (CommonUtils.isElementDisplayed(nativeViewCHARMSDashboardPage.rasStudyOpenRecordButton)) {
            CucumberLogUtils.logScreenshot();
            CommonUtils.clickOnElement(nativeViewCHARMSDashboardPage.rasStudyOpenRecordButton);
        }
        System.out.println("---- VERIFYING PARTICIPANT NAME DATA ----");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(participantDetailsPage.nameTextBox), ras_Screener_TestDataManager.firstName + ras_Screener_Constants.SPACE + ras_Screener_TestDataManager.lastName, "-- VERIFYING FULL NAME --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(participantDetailsPage.firstNameTextBox), ras_Screener_TestDataManager.firstName, "-- VERIFYING FIRST NAME --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(participantDetailsPage.middleInitialTextBox), ras_Screener_TestDataManager.middleInitial, "-- VERIFYING MIDDLE INITIAL --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(participantDetailsPage.lastNameTextBox), ras_Screener_TestDataManager.lastName, "-- VERIFYING LAST NAME --");
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(participantDetailsPage.demographicsTab);
        System.out.println("---- VERIFYING PARTICIPANT DEMOGRAPHICS DATA ----");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(participantDetailsPage.dateOfBirthTextBox), ras_Screener_TestDataManager.whatIsYourDateOfBirth, "-- VERIFYING DATE OF BIRTH --");
        CommonUtils.verifyingDropDownValueIsSelected(participantDetailsPage.biologicalGenderDropDown, ras_Screener_TestDataManager.sexAssignedAtBirthOption, "-- VERIFYING BIOLOGICAL GENDER --");
        CommonUtils.verifyingDropDownValueIsSelected(participantDetailsPage.isParticipantAdoptedDropDown, ras_Screener_TestDataManager.areYouAdoptedOption, "-- VERIFYING IF THE PARTICIPANT IS ADOPTED --");
        CommonUtils.assertEqualsWithMessage(participantDetailsPage.participantRacePreferNotToAnswerOption.getText(), ras_Screener_TestDataManager.whatIsYourRace, "-- VERIFYING RACE --");
        CommonUtils.verifyingDropDownValueIsSelected(participantDetailsPage.ethnicityDropDownOption, ras_Screener_TestDataManager.whatIsYourEthnicity, "-- VERIFYING ETHNICITY --");
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(participantDetailsPage.contactInfoTab);
        System.out.println("---- VERIFYING PARTICIPANT CONTACT INFORMATION DATA ----");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(participantDetailsPage.contactStreetAddress), ras_Screener_TestDataManager.street + ras_Screener_Constants.SPACE + ras_Screener_TestDataManager.street2, "-- VERIFYING CONTACT STREET ADDRESS --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(participantDetailsPage.contactState), ras_Screener_TestDataManager.state, "-- VERIFYING CONTACT STATE --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(participantDetailsPage.contactCity), ras_Screener_TestDataManager.city, "- VERIFYING CONTACT CITY --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(participantDetailsPage.contactZipCode), ras_Screener_TestDataManager.zipcode, "-- VERIFYING ZIP CODE --");
        CommonUtils.verifyingDropDownValueIsSelected(participantDetailsPage.contactCountryDropDown, ras_Screener_TestDataManager.countryOption, "-- VERIFYING CONTACT COUNTRY --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(participantDetailsPage.contactEmailAddress), ras_Screener_TestDataManager.emailAddress, "-- VERIFYING CONTACT EMAIL ADDRESS --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(participantDetailsPage.contactHomePhone), ras_Screener_TestDataManager.homePhoneNumber, "-- VERIFYING CONTACT HOME PHONE --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(participantDetailsPage.contactCellPhone), ras_Screener_TestDataManager.cellPhoneNumber, "-- VERIFYING CONTACT CELL PHONE --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(participantDetailsPage.contactWorkPhone), ras_Screener_TestDataManager.workPhoneNumber, "-- VERIFYING CONTACT WORK PHONE --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(participantDetailsPage.contactPreferredPhone), ras_Screener_TestDataManager.cellPhoneNumber, "-- VERIFYING PREFERRED PHONE --");
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(participantDetailsPage.participantStudiesTab);
        CucumberLogUtils.logScreenshot();
        CommonUtils.waitForVisibility(participantDetailsPage.participantStudiesInfoButton);
        CommonUtils.clickOnElement(participantDetailsPage.participantStudiesInfoButton);
        CucumberLogUtils.logScreenshot();
        CommonUtils.waitForClickability(nativeViewCHARMSDashboardPage.rasStudyOpenRecordButton);
        CommonUtils.clickOnElement(nativeViewCHARMSDashboardPage.rasStudyOpenRecordButton);
        CucumberLogUtils.logScreenshot();
        CommonUtils.waitForClickability(nativeViewCHARMSParticipantStudyPage.participantStudyScreenerInfoButton);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantStudyPage.participantStudyScreenerInfoButton);
        System.out.println("---- OPENING AND VERIFYING SCREENER RECORD DATA ----");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(screenerRecordTablePage.screenerPreviewFamilyMemberRecordField), ras_Screener_TestDataManager.firstName + ras_Screener_Constants.SPACE + ras_Screener_TestDataManager.lastName, "-- VERIFYING SCREENER PREVIEW RECORD FAMILY MEMBER RECORD NAME --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(screenerRecordTablePage.screenerPreviewContactEmailAddressField), ras_Screener_TestDataManager.emailAddress, "-- VERIFYING SCREENER PREVIEW RECORD CONTACT EMAIL ADDRESS FIELD --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(screenerRecordTablePage.screenerPreviewStudyField), ras_Screener_Constants.RAS_STUDY, "-- VERIFYING SCREENER PREVIEW STUDY FIELD --");
        CucumberLogUtils.logScreenshot();
        CommonUtils.waitForClickability(nativeViewCHARMSDashboardPage.rasStudyOpenRecordButton);
        CommonUtils.clickOnElement(nativeViewCHARMSDashboardPage.rasStudyOpenRecordButton);
        CucumberLogUtils.logScreenshot();
        rasScenario1StepsImpl.verifyingDropDownOption(participantDetailsPage.vitalStatusYesDropDownOption, "-- VERIFYING VITAL STATUS --");
        CommonUtils.clickOnElement(screenerRecordTablePage.contactInformationButton);
        System.out.println("---- VERIFYING SCREENER RECORD NAME AND CONTACT INFORMATION DATA ----");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(screenerRecordTablePage.screenerStudyField), ras_Screener_Constants.RAS_STUDY, "-- VERIFYING STUDY FIELD --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(screenerRecordTablePage.familyMemberRecordField), ras_Screener_TestDataManager.firstName + ras_Screener_Constants.SPACE + ras_Screener_TestDataManager.lastName, "-- VERIFYING FAMILY MEMBER RECORD FIELD --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(screenerRecordTablePage.contactEmailField), ras_Screener_TestDataManager.emailAddress, "-- VERIFYING CONTACT EMAIL FIELD --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(screenerRecordTablePage.contactHomePhoneField), ras_Screener_TestDataManager.homePhoneNumber, "-- VERIFYING CONTACT HOME PHONE NUMBER --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(screenerRecordTablePage.contactCellPhoneField), ras_Screener_TestDataManager.cellPhoneNumber, "-- VERIFYING CONTACT CELL PHONE NUMBER --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(screenerRecordTablePage.contactWorkPhoneField), ras_Screener_TestDataManager.workPhoneNumber, "-- VERIFYING CONTACT WORK PHONE NUMBER --");
        CommonUtils.verifyingDropDownValueIsSelected(screenerRecordTablePage.contactCountryDropDown, ras_Screener_TestDataManager.countryOption, "-- VERIFYING COUNTRY CONTACT FIELD --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(screenerRecordTablePage.contactStateField), ras_Screener_TestDataManager.state, "-- VERIFYING STATE --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(screenerRecordTablePage.contactStreetAddressField), ras_Screener_TestDataManager.street + ras_Screener_Constants.SPACE + ras_Screener_TestDataManager.street2, "-- VERIFYING CONTACT STREET ADDRESS --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(screenerRecordTablePage.contactCityField), ras_Screener_TestDataManager.city, "-- VERIFYING CONTACT CITY --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(screenerRecordTablePage.contactZipCodeField), ras_Screener_TestDataManager.zipcode, "-- VERIFYING ZIP CODE --");
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(screenerRecordTablePage.dynamicLocatorForTabs("Demographics"));
        CommonUtils.assertEqualsWithMessage(screenerRecordTablePage.demographicsParticipantRacePreferNotToAnswerOption.getText(), ras_Screener_TestDataManager.whatIsYourRace, "-- VERIFYING RACE OF PARTICIPANT --");
        CommonUtils.verifyingDropDownValueIsSelected(screenerRecordTablePage.demographicsBiologicalGenderDropDown, ras_Screener_TestDataManager.sexAssignedAtBirthOption, "-- VERIFYING BIOLOGICAL GENDER --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(screenerRecordTablePage.demographicsDateOfBirthField), ras_Screener_TestDataManager.whatIsYourDateOfBirth, "-- VERIFYING DATE OF BIRTH --");
        CommonUtils.verifyingDropDownValueIsSelected(screenerRecordTablePage.demographicsEthnicityDropDown, ras_Screener_TestDataManager.whatIsYourEthnicity, "-- VERIFYING ETHNICITY --");
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(screenerRecordTablePage.dynamicLocatorForTabs("RASopathy History"));
        System.out.println("---- VERIFYING SCREENER RECORD RASOPATHY HISTORY DATA ----");
        CommonUtils.verifyingDropDownValueIsSelected(screenerRecordTablePage.rasopathyHistoryHaveYouBeenDiagnosedWithARasopathyDropDown, ras_Screener_TestDataManager.haveYouBeenDiagnosedWithARasopathy, "-- VERIFYING IF PARTICIPANT HAS BEEN DIAGNOSED WITH A RASOPATHY --");
        CommonUtils.assertEqualsWithMessage(screenerRecordTablePage.rasopathyHistoryNeverDiagnosedWithAnyOfTheseConditions.getText(), ras_Screener_TestDataManager.haveYouBeenDiagnosedWithFollowingConditions, "-- VERIFYING IF CANDIDATE HAS BEEN DIAGNOSED WITH ANY CONDITIONS --");
        CommonUtils.verifyingDropDownValueIsSelected(screenerRecordTablePage.rasopathyHistoryHaveAnyOfYourBiologicalRelativesBeenDiagnosedWithARasopathyDropDown, ras_Screener_TestDataManager.haveAnyOfYourBiologicalRelativesBeenDiagnosedWithARasopathy, "-- VERIFYING IF ANY OF BIOLOGICAL RELATIVES BEEN DIAGNOSED WITH A RASOPATHY --");
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(screenerRecordTablePage.dynamicLocatorForTabs("Cancer History"));
        System.out.println("---- VERIFYING SCREENER RECORD CANCER HISTORY DATA ----");
        CommonUtils.verifyingDropDownValueIsSelected(screenerRecordTablePage.cancerHistoryHasAPhysicianEverDiagnosedParticipantWithCancerDropDown, ras_Screener_TestDataManager.haveYouBeenDiagnosedWithCancer, "-- VERIFYING IF PARTICIPANT HAS BEEN DIAGNOSED WITH CANCER --");
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(screenerRecordTablePage.dynamicLocatorForTabs("Genetic Testing History"));
        System.out.println("---- VERIFYING SCREENER RECORD GENETIC TESTING HISTORY DATA ----");
        CommonUtils.verifyingDropDownValueIsSelected(screenerRecordTablePage.geneticTestingHistoryHasTheParticipantEverHadGeneticTestingDropDown, ras_Screener_TestDataManager.haveYouEverHadGeneticTesting, "-- VERIFYING IF PARTICIPANT HAS HAD GENETIC TESTING --");
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(screenerRecordTablePage.dynamicLocatorForTabs("Final Information"));
        System.out.println("---- VERIFYING SCREENER RECORD FINAL INFORMATION DATA ----");
        CommonUtils.verifyingDropDownValueIsSelected(screenerRecordTablePage.finalInformationHowDidYouHearAboutThisStudyDropDown, ras_Screener_TestDataManager.howDidYouHearAboutThisStudy, "-- VERIFYING HOW DID PARTICIPANT HEAR ABOUT THE STUDY --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(screenerRecordTablePage.finalInformationHowDidYouHearAboutThisStudyPleaseSpecifyTextBox), ras_Screener_TestDataManager.howDidYouHearAboutThisStudyOtherReason, "-- VERIFYING HOW DID YOU PARTICIPANT HEAR ABOUT THE STUDY OTHER REASONS --");
        CommonUtils.verifyingDropDownValueIsSelected(screenerRecordTablePage.finalInformationHasParticipantOrAnyFamilyMemberParticipatedInAnyCancerStudyDropDown, ras_Screener_TestDataManager.haveYouOrOtherFamilyMembersParticipatedInOtherStudy, "-- VERIFYING IF PARTICIPANT OR FAMILY MEMBER HAVE PARTICIPATED IN CANCER STUDY --");
        CommonUtils.assertEqualsWithMessage(screenerRecordTablePage.finalInformationMainReasonsForParticipatingInThisStudyOtherOption.getText(), ras_Screener_TestDataManager.whatAreMainReasonsForParticipatingInStudy, "-- VERIFYING MAIN REASONS FOR PARTICIPATING IN STUDY --");
        CommonUtils.assertEqualsWithMessage(screenerRecordTablePage.finalInformationMainReasonsForParticipatingInThisStudyOtherReasonsField.getText(), ras_Screener_TestDataManager.whatAreMainReasonsForParticipatingInStudyOtherReason, "-- VERIFYING MAIN REASONS FOR PARTICIPATING IN STUDY FIELD --");
        CommonUtils.verifyingDropDownValueIsSelected(screenerRecordTablePage.finalInformationAreYouAParticipantInAnyOtherResearchStudyOrRegistryGroupDropDown, ras_Screener_TestDataManager.areYouAParticipantInOtherStudyGroup, "-- VERIFYING IF PARTICIPANT IS PART OF RESEARCH STUDY OR REGISTRY GROUP --");
        CucumberLogUtils.logScreenshot();
        logOutOfNativeView();
    }
}