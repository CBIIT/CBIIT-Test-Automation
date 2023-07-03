package ServiceNow.CHARMS.StepsImplementation;

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
        testDataManager.dataInitializer("Scenario1");
        nativeViewLoginImpl.sideDoorAccountLogin();
        CommonUtils.sendKeysToElement(nativeViewHomePage.nativeViewFilterNavigator, "CHARMS");
        CommonUtils.clickOnElement(charmsNativeViewPage.dashboardModuleLink);
        CommonUtils.switchToFrame(charmsNativeViewPage.nativeViewiFrameCHARMS);
        CucumberLogUtils.logScreenShot();
        JavascriptUtils.scrollIntoView(charmsNativeViewPage.dynamicDashboardModuleLinkLocator("Eligibility Review Needed"));
        CommonUtils.clickOnElement(charmsNativeViewPage.dynamicDashboardModuleLinkLocator("Eligibility Review Needed"));
        CommonUtils.switchToNextWindow();
        CucumberLogUtils.logToConsole("---- RETRIEVING DATA FROM EXCEL ----");
        CommonUtils.clickOnElement(participantDetailsPage.dynamicRecordButtonLocator(testDataManager.firstName + rasScreenerConstants.space + testDataManager.lastName));
        CucumberLogUtils.logToConsole("---- VERIFYING PARTICIPANT RECORD PREVIEW DATA ----");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(participantDetailsPage.firstNameRecordPreviewField), testDataManager.firstName, "-- VERIFYING PREVIEW RECORD FIRST NAME --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(participantDetailsPage.lastNameRecordPreviewField), testDataManager.lastName, "-- VERIFYING PREVIEW RECORD LAST NAME --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(participantDetailsPage.middleNameRecordPreviewField), testDataManager.middleInitial, "-- VERIFYING PREVIEW RECORD MIDDLE NAME --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(participantDetailsPage.contactHomePhoneRecordPreviewField), testDataManager.homePhoneNumber, "-- VERIFYING PREVIEW RECORD CONTACT HOME PHONE NUMBER --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(participantDetailsPage.contactEmailRecordPreviewField), testDataManager.emailAddress, "-- VERIFYING PREVIEW RECORD CONTACT EMAIL ADDRESS --");
        CommonUtils.clickOnElement(participantDetailsPage.openRecordButton);
        CucumberLogUtils.logToConsole("---- VERIFYING PARTICIPANT NAME DATA ----");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(participantDetailsPage.nameTextBox), testDataManager.firstName + rasScreenerConstants.space + testDataManager.lastName, "-- VERIFYING FULL NAME --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(participantDetailsPage.firstNameTextBox), testDataManager.firstName, "-- VERIFYING FIRST NAME --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(participantDetailsPage.middleInitialTextBox), testDataManager.middleInitial, "-- VERIFYING MIDDLE INITIAL --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(participantDetailsPage.lastNameTextBox), testDataManager.lastName, "-- VERIFYING LAST NAME --");
        CommonUtils.clickOnElement(participantDetailsPage.demographicsTab);
        CucumberLogUtils.logToConsole("---- VERIFYING PARTICIPANT DEMOGRAPHICS DATA ----");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(participantDetailsPage.dateOfBirthTextBox), testDataManager.whatIsYourDateOfBirth, "-- VERIFYING DATE OF BIRTH --");
        CommonUtils.verifyingDropDownValueIsSelected(participantDetailsPage.biologicalGenderDropDown, testDataManager.sexAssignedAtBirthOption, "-- VERIFYING BIOLOGICAL GENDER --");
        CommonUtils.verifyingDropDownValueIsSelected(participantDetailsPage.isParticipantAdoptedDropDown, testDataManager.areYouAdoptedOption, "-- VERIFYING IF THE PARTICIPANT IS ADOPTED --");
        CommonUtils.assertEqualsWithMessage(participantDetailsPage.participantRacePreferNotToAnswerOption.getText(), testDataManager.whatIsYourRace, "-- VERIFYING RACE --");
        CommonUtils.verifyingDropDownValueIsSelected(participantDetailsPage.ethnicityDropDownOption, testDataManager.whatIsYourEthnicity, "-- VERIFYING ETHNICITY --");
        CommonUtils.clickOnElement(participantDetailsPage.contactInfoTab);
        CucumberLogUtils.logToConsole("---- VERIFYING PARTICIPANT CONTACT INFORMATION DATA ----");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(participantDetailsPage.contactStreetAddress), testDataManager.street + rasScreenerConstants.space + testDataManager.street2, "-- VERIFYING CONTACT STREET ADDRESS --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(participantDetailsPage.contactState), testDataManager.state, "-- VERIFYING CONTACT STATE --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(participantDetailsPage.contactCity), testDataManager.city, "- VERIFYING CONTACT CITY --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(participantDetailsPage.contactZipCode), testDataManager.zipcode, "-- VERIFYING ZIP CODE --");
        CommonUtils.verifyingDropDownValueIsSelected(participantDetailsPage.contactCountryDropDown, testDataManager.countryOption, "-- VERIFYING CONTACT COUNTRY --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(participantDetailsPage.contactEmailAddress), testDataManager.emailAddress, "-- VERIFYING CONTACT EMAIL ADDRESS --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(participantDetailsPage.contactHomePhone), testDataManager.homePhoneNumber, "-- VERIFYING CONTACT HOME PHONE --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(participantDetailsPage.contactCellPhone), testDataManager.cellPhoneNumber, "-- VERIFYING CONTACT CELL PHONE --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(participantDetailsPage.contactWorkPhone), testDataManager.workPhoneNumber, "-- VERIFYING CONTACT WORK PHONE --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(participantDetailsPage.contactPreferredPhone), testDataManager.cellPhoneNumber, "-- VERIFYING PREFERRED PHONE --");
        CommonUtils.clickOnElement(participantDetailsPage.medicalInformationTab);
        CucumberLogUtils.logToConsole("---- VERIFYING PARTICIPANT MEDICAL INFORMATION DATA ----");
        CommonUtils.verifyingDropDownValueIsSelected(participantDetailsPage.hasAPhysicianEverDiagnosedThisParticipantWithCancerDropDown, testDataManager.haveYouBeenDiagnosedWithCancer, "-- VERIFYING IF PARTICIPANT HAS BEEN DIAGNOSED WITH CANCER --");
        rasScreenerStepsImpl.verifyingDropDownOption(participantDetailsPage.vitalStatusYesDropDownOption, "-- VERIFYING VITAL STATUS --");
        CommonUtils.verifyingDropDownValueIsSelected(participantDetailsPage.hasTheParticipantEverHadGeneticTestingDropDown, testDataManager.haveYouEverHadGeneticTesting, "-- VERIFYING IF THE PARTICIPANT HAS HAD GENETIC TESTING --");
        CommonUtils.clickOnElement(participantDetailsPage.rasopathyHistoryTab);
        CucumberLogUtils.logToConsole("---- VERIFYING PARTICIPANT RASOPATHY HISTORY DATA ----");
        CommonUtils.verifyingDropDownValueIsSelected(participantDetailsPage.haveYouBeenDiagnosedWithARasopathyDropDown, testDataManager.haveYouBeenDiagnosedWithARasopathy, "-- VERIFYING IF PARTICIPANT HAS BEEN DIAGNOSED WITH A RASOPATHY --");
        CommonUtils.verifyingDropDownValueIsSelected(participantDetailsPage.haveAnyOfYourBiologicalRelativesBeenDiagnosedWithARasopathyDropDown, testDataManager.haveAnyOfYourBiologicalRelativesBeenDiagnosedWithARasopathy, "-- VERIFYING IF BIOLOGICAL RELATIVES HAVE BEEN DIAGNOSED WITH A RASOPATHY --");
        CucumberLogUtils.logToConsole("---- OPENING AND VERIFYING SCREENER RECORD DATA ----");
        CommonUtils.clickOnElement(screenerRecordTablePage.referralPreviewButton);
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(screenerRecordTablePage.screenerPreviewFamilyMemberRecordField), testDataManager.firstName + rasScreenerConstants.space + testDataManager.lastName, "-- VERIFYING SCREENER PREVIEW RECORD FAMILY MEMBER RECORD NAME --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(screenerRecordTablePage.screenerPreviewContactEmailAddressField), testDataManager.emailAddress, "-- VERIFYING SCREENER PREVIEW RECORD CONTACT EMAIL ADDRESS FIELD --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(screenerRecordTablePage.screenerPreviewStudyField), rasScreenerConstants.RAS_STUDY, "-- VERIFYING SCREENER PREVIEW STUDY FIELD --");
        CommonUtils.clickOnElement(screenerRecordTablePage.openRecordButton);
        CucumberLogUtils.logToConsole("---- VERIFYING SCREENER RECORD NAME AND CONTACT INFORMATION DATA ----");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(screenerRecordTablePage.screenerStudyField), rasScreenerConstants.RAS_STUDY, "-- VERIFYING STUDY FIELD --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(screenerRecordTablePage.familyMemberRecordField), testDataManager.firstName + rasScreenerConstants.space + testDataManager.lastName, "-- VERIFYING FAMILY MEMBER RECORD FIELD --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(screenerRecordTablePage.contactEmailField), testDataManager.emailAddress, "-- VERIFYING CONTACT EMAIL FIELD --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(screenerRecordTablePage.contactHomePhoneField), testDataManager.homePhoneNumber, "-- VERIFYING CONTACT HOME PHONE NUMBER --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(screenerRecordTablePage.contactCellPhoneField), testDataManager.cellPhoneNumber, "-- VERIFYING CONTACT CELL PHONE NUMBER --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(screenerRecordTablePage.contactWorkPhoneField), testDataManager.workPhoneNumber, "-- VERIFYING CONTACT WORK PHONE NUMBER --");
        CommonUtils.verifyingDropDownValueIsSelected(screenerRecordTablePage.contactCountryDropDown, testDataManager.countryOption, "-- VERIFYING COUNTRY CONTACT FIELD --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(screenerRecordTablePage.contactStateField), testDataManager.state, "-- VERIFYING STATE --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(screenerRecordTablePage.contactStreetAddressField), testDataManager.street + rasScreenerConstants.space + testDataManager.street2, "-- VERIFYING CONTACT STREET ADDRESS --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(screenerRecordTablePage.contactCityField), testDataManager.city, "-- VERIFYING CONTACT CITY --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(screenerRecordTablePage.contactZipCodeField), testDataManager.zipcode, "-- VERIFYING ZIP CODE --");
        CommonUtils.clickOnElement(screenerRecordTablePage.dynamicLocatorForTabs("Demographics"));
        CommonUtils.assertEqualsWithMessage(screenerRecordTablePage.demographicsParticipantRacePreferNotToAnswerOption.getText(), testDataManager.whatIsYourRace, "-- VERIFYING RACE OF PARTICIPANT --");
        CommonUtils.verifyingDropDownValueIsSelected(screenerRecordTablePage.demographicsBiologicalGenderDropDown, testDataManager.sexAssignedAtBirthOption, "-- VERIFYING BIOLOGICAL GENDER --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(screenerRecordTablePage.demographicsDateOfBirthField), testDataManager.whatIsYourDateOfBirth, "-- VERIFYING DATE OF BIRTH --");
        CommonUtils.verifyingDropDownValueIsSelected(screenerRecordTablePage.demographicsEthnicityDropDown, testDataManager.whatIsYourEthnicity, "-- VERIFYING ETHNICITY --");
        CommonUtils.clickOnElement(screenerRecordTablePage.dynamicLocatorForTabs("RASopathy History"));
        CucumberLogUtils.logToConsole("---- VERIFYING SCREENER RECORD RASOPATHY HISTORY DATA ----");
        CommonUtils.verifyingDropDownValueIsSelected(screenerRecordTablePage.rasopathyHistoryHaveYouBeenDiagnosedWithARasopathyDropDown, testDataManager.haveYouBeenDiagnosedWithARasopathy, "-- VERIFYING IF PARTICIPANT HAS BEEN DIAGNOSED WITH A RASOPATHY --");
        CommonUtils.assertEqualsWithMessage(screenerRecordTablePage.rasopathyHistoryNeverDiagnosedWithAnyOfTheseConditions.getText(), testDataManager.haveYouBeenDiagnosedWithFollowingConditions, "-- VERIFYING IF CANDIDATE HAS BEEN DIAGNOSED WITH ANY CONDITIONS --");
        CommonUtils.verifyingDropDownValueIsSelected(screenerRecordTablePage.rasopathyHistoryHaveAnyOfYourBiologicalRelativesBeenDiagnosedWithARasopathyDropDown, testDataManager.haveAnyOfYourBiologicalRelativesBeenDiagnosedWithARasopathy, "-- VERIFYING IF ANY OF BIOLOGICAL RELATIVES BEEN DIAGNOSED WITH A RASOPATHY --");
        CommonUtils.clickOnElement(screenerRecordTablePage.dynamicLocatorForTabs("Cancer History"));
        CucumberLogUtils.logToConsole("---- VERIFYING SCREENER RECORD CANCER HISTORY DATA ----");
        CommonUtils.verifyingDropDownValueIsSelected(screenerRecordTablePage.cancerHistoryHasAPhysicianEverDiagnosedParticipantWithCancerDropDown, testDataManager.haveYouBeenDiagnosedWithCancer, "-- VERIFYING IF PARTICIPANT HAS BEEN DIAGNOSED WITH CANCER --");
        CommonUtils.clickOnElement(screenerRecordTablePage.dynamicLocatorForTabs("Genetic Testing History"));
        CucumberLogUtils.logToConsole("---- VERIFYING SCREENER RECORD GENETIC TESTING HISTORY DATA ----");
        CommonUtils.verifyingDropDownValueIsSelected(screenerRecordTablePage.geneticTestingHistoryHasTheParticipantEverHadGeneticTestingDropDown, testDataManager.haveYouEverHadGeneticTesting, "-- VERIFYING IF PARTICIPANT HAS HAD GENETIC TESTING --");
        CommonUtils.clickOnElement(screenerRecordTablePage.dynamicLocatorForTabs("Final Information"));
        CucumberLogUtils.logToConsole("---- VERIFYING SCREENER RECORD FINAL INFORMATION DATA ----");
        CommonUtils.verifyingDropDownValueIsSelected(screenerRecordTablePage.finalInformationHowDidYouHearAboutThisStudyDropDown, testDataManager.howDidYouHearAboutThisStudy, "-- VERIFYING HOW DID PARTICIPANT HEAR ABOUT THE STUDY --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(screenerRecordTablePage.finalInformationHowDidYouHearAboutThisStudyPleaseSpecifyTextBox), testDataManager.howDidYouHearAboutThisStudyOtherReason, "-- VERIFYING HOW DID YOU PARTICIPANT HEAR ABOUT THE STUDY OTHER REASONS --");
        CommonUtils.verifyingDropDownValueIsSelected(screenerRecordTablePage.finalInformationHasParticipantOrAnyFamilyMemberParticipatedInAnyCancerStudyDropDown, testDataManager.haveYouOrOtherFamilyMembersParticipatedInOtherStudy, "-- VERIFYING IF PARTICIPANT OR FAMILY MEMBER HAVE PARTICIPATED IN CANCER STUDY --");
        CommonUtils.assertEqualsWithMessage(screenerRecordTablePage.finalInformationMainReasonsForParticipatingInThisStudyOtherOption.getText(), testDataManager.whatAreMainReasonsForParticipatingInStudy, "-- VERIFYING MAIN REASONS FOR PARTICIPATING IN STUDY --");
        CommonUtils.assertEqualsWithMessage(screenerRecordTablePage.finalInformationMainReasonsForParticipatingInThisStudyOtherReasonsField.getText(), testDataManager.whatAreMainReasonsForParticipatingInStudyOtherReason, "-- VERIFYING MAIN REASONS FOR PARTICIPATING IN STUDY FIELD --");
        CommonUtils.verifyingDropDownValueIsSelected(screenerRecordTablePage.finalInformationAreYouAParticipantInAnyOtherResearchStudyOrRegistryGroupDropDown, testDataManager.areYouAParticipantInOtherStudyGroup, "-- VERIFYING IF PARTICIPANT IS PART OF RESEARCH STUDY OR REGISTRY GROUP --");
    }
}