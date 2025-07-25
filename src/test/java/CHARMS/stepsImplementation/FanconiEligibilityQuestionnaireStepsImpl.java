package CHARMS.stepsImplementation;

import APPS_COMMON.Utils.ServiceNow_Common_Methods;
import APPS_COMMON.Utils.ServiceNow_Login_Methods;
import CHARMS.constants.CHARMSRASScreenerConstants;
import CHARMS.constants.CHARMS_Data_File_Path_Constants;
import CHARMS.nativeView.pages.CHARMSParticipantDetailsPage;
import CHARMS.pages.NativeViewCHARMSDashboardPage;
import CHARMS.steps.RAS_All_Steps;
import CHARMS.steps.RAS_Common_Methods;
import CHARMS.utils.CharmsUtil;
import APPS_COMMON.PageInitializers.PageInitializer;
import APPS_COMMON.Pages.NativeView_SideDoor_Dashboard_Page;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.TestProperties;
import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static APPS_COMMON.Pages.Selenium_Common_Locators.locateByXpath;
import static com.nci.automation.web.TestProperties.getFanconiUrl;

public class FanconiEligibilityQuestionnaireStepsImpl extends PageInitializer {
    String excelSheet = CHARMS_Data_File_Path_Constants.FANCONI_SCREENER_DATA;
    String referralValue;
    String regex = "\\d{5}-\\d{2}-\\d{3}";
    String subjectIDValue;
    String participantValue;
    String consentDate;
    Map<String, String> currentRow = null;
    Map<String, String> currentRowForCancerHistory;
    Map<String, String> currentRowForAnotherStudy;
    SoftAssert softAssert = new SoftAssert();

    /**
     * Run Reset Script for Fanconi in NativeView
     */
    public void runResetScripts() {
        loginToNativeView();
        resetTestAccountSignIn();
        resetTestAccount();
        nativeViewProfilelogOut();
    }

    /**
     * LogIn to NativeView Side door Login URL
     */
    public void loginToNativeView() {
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        CucumberLogUtils.logScreenshot();
    }

    /**
     * Login to NativeView to run the reset accounts script for the Fanconi screener accounts
     */
    public void resetTestAccountSignIn() {
        if (TestProperties.ENV.equals("test")) {
            WebDriverUtils.webDriver.get(
                    "https://service-test.nci.nih.gov/now/nav/ui/classic/params/target/sys_script_fix.do%3Fsys_id%3Db1cf5c0087d0d610ad46326d3fbb3507%26sysparm_record_target%3Dsys_script_fix%26sysparm_record_row%3D2%26sysparm_record_rows%3D1263%26sysparm_record_list%3DORDERBYDESCsys_updated_on");
            CucumberLogUtils.logScreenshot();
            CommonUtils.sleep(1800);
        } else if (TestProperties.ENV.equals("dev2")) {
            WebDriverUtils.webDriver.get(
                    "https://service-dev2.nci.nih.gov/now/nav/ui/classic/params/target/sys_script_fix.do%3Fsys_id%3Db1cf5c0087d0d610ad46326d3fbb3507%26sysparm_record_target%3Dsys_script_fix%26sysparm_record_row%3D2%26sysparm_record_rows%3D1263%26sysparm_record_list%3DORDERBYDESCsys_updated_on");
            CucumberLogUtils.logScreenshot();
            CommonUtils.sleep(1800);
        }
    }

    /**
     * Login to the NativeView and run the reset accounts script for the Fanconi screener accounts
     */
    public void resetTestAccount() {
        if (TestProperties.ENV.equals("test")) {
            CommonUtils.sleep(100);
            CommonUtils.switchToFrame(NativeView_SideDoor_Dashboard_Page.nativeViewiFrame);
            CommonUtils.waitForVisibility(testAccountResetPage.nativeViewRunFixScriptButton);
            testAccountResetPage.nativeViewRunFixScriptButton.click();
            CommonUtils.sleep(800);
            CommonUtils.waitForVisibility(testAccountResetPage.nativeViewProceedInBackgroundButton);
            testAccountResetPage.nativeViewProceedInBackgroundButton.click();
            CommonUtils.sleep(800);
            CommonUtils.waitForVisibility(testAccountResetPage.nativeViewCloseButton);
            testAccountResetPage.nativeViewCloseButton.click();
        }
    }

    /**
     * LogOut of the account profile in NativeView
     */
    public void nativeViewProfilelogOut() {
        ServiceNow_Common_Methods.logOutOfNativeView();
        CommonUtils.sleep(800);
    }

    /**
     * Method to submit the Fanconi screener scenario VIA the portal
     */
    public void fanconiEligibilityQuestionnaireSubmissionScenario(int rowNumForAssertion) {
        currentRow = CharmsUtil.testManagerData(excelSheet, "FanconiScreener", rowNumForAssertion);
        fanconiEligibilityQuestionnaireStepsImpl.eligibilityQuestionnairelinkClicked();
        fanconiEligibilityQuestionnaireStepsImpl.initialStudyRelatedPageClicked();
        fanconiEligibilityQuestionnaireStepsImpl.participantSubmission();
        fanconiEligibilityQuestionnaireStepsImpl.participantNameSelected();
        fanconiEligibilityQuestionnaireStepsImpl.participatedInBoneMarrowFailureStudy();
        CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
        fanconiEligibilityQuestionnaireStepsImpl.participantBasicInformationSelected();
        fanconiEligibilityQuestionnaireStepsImpl.IsParticipantAdopted();
        fanconiEligibilityQuestionnaireStepsImpl.participantCountrySelected();
        fanconiEligibilityQuestionnaireStepsImpl.emailAddressAdded();
        fanconiEligibilityQuestionnaireStepsImpl.phoneNumbersAdded();
        fanconiEligibilityQuestionnaireStepsImpl.ethnicitySelected();
        fanconiEligibilityQuestionnaireStepsImpl.raceSelected();
        fanconiEligibilityQuestionnaireStepsImpl.IsOtherMedicalInstitutionSelected();
        fanconiEligibilityQuestionnaireStepsImpl.otherMedicalInstitutionSelected();
        fanconiEligibilityQuestionnaireStepsImpl.otherMedicalInstitutionDetailsAdded();
        CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
        fanconiEligibilityQuestionnaireStepsImpl.diagnosedWithFanconiAnemia();
        fanconiEligibilityQuestionnaireStepsImpl.diagnosedWithFanconiAnemiaSelected();
        fanconiEligibilityQuestionnaireStepsImpl.chromosomeBreakageTestSelected();
        fanconiEligibilityQuestionnaireStepsImpl.whereChromosomeBreakageTestPerformed();
        fanconiEligibilityQuestionnaireStepsImpl.whatWasChromosomeBreakageTestResult();
        fanconiEligibilityQuestionnaireStepsImpl.toProvideChromosomeBreakageTestResults();
        fanconiEligibilityQuestionnaireStepsImpl.hadComplementationGeneticTesting();
        fanconiEligibilityQuestionnaireStepsImpl.WasTheGeneticTestingPositive();
        fanconiEligibilityQuestionnaireStepsImpl.checkFAGenesTested();
        fanconiEligibilityQuestionnaireStepsImpl.mutationsVariantsInformationSelected();
        fanconiEligibilityQuestionnaireStepsImpl.haveCopyOfGeneticTestResults();
        fanconiEligibilityQuestionnaireStepsImpl.howProvideGeneticTestResults();
        fanconiEligibilityQuestionnaireStepsImpl.featuresOptionsSelected();
        fanconiEligibilityQuestionnaireStepsImpl.everBeenDiagnosedWithBoneMarrowFailure();
        fanconiEligibilityQuestionnaireStepsImpl.reportDateOrAgeOfDiagnosis();
        fanconiEligibilityQuestionnaireStepsImpl.diagnosedWithMyelodysplasticSyndrome();
        fanconiEligibilityQuestionnaireStepsImpl.ageOrDateWhenMyelodysplasticSyndromeDiagnosed();
        fanconiEligibilityQuestionnaireStepsImpl.everReceivedBoneMarrowTransplant();
        fanconiEligibilityQuestionnaireStepsImpl.reportDateOrAgeOfTransplant();
        fanconiEligibilityQuestionnaireStepsImpl.everBeenDiagnosedWithCancer();
        fanconiEligibilityQuestionnaireStepsImpl.cancerDetailsAdded();
        fanconiEligibilityQuestionnaireStepsImpl.currentMedicationsAreYouReceiving();
        CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
        fanconiEligibilityQuestionnaireStepsImpl.howDidYouHearAboutThisStudy();
        fanconiEligibilityQuestionnaireStepsImpl.healthCareProviderInformation();
        fanconiEligibilityQuestionnaireStepsImpl.permissionToCallProvider();
        fanconiEligibilityQuestionnaireStepsImpl.mainReasonToParticipateInThisStudy();
    }

    /**
     * Method to click Eligibility Questionnaire link
     */
    public void eligibilityQuestionnairelinkClicked() {
        Set<String> allWindowHandles = WebDriverUtils.webDriver.getWindowHandles();
        for (String currentWindow : allWindowHandles) {
            WebDriverUtils.webDriver.switchTo().window(currentWindow);
            CommonUtils.sleep(800);
        }
        JavascriptUtils.scrollIntoView(fanconiEligibilityQuestionnairePage.nextButton);
        CommonUtils.waitForVisibility(fanconiEligibilityQuestionnairePage.nextButton);
        CommonUtils.sleep(1800);
    }

    /**
     * Method to click Initial pages with Information on Study related
     */
    public void initialStudyRelatedPageClicked() {
        for (int i = 1; i <= 6; ++i) {
            CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
            CommonUtils.sleep(800);
        }
    }

    /**
     * Method to submit 'Are you completing this questionnaire for someone else?or Yourself
     */
    public void participantSubmission() {
        CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.participantCompletingRBtonList, currentRow.get("AreYouCompletingThisQuestionnaireForSomeoneElse"));
        CommonUtils.sleep(800);
        CucumberLogUtils.logScreenshot();
        CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
        CommonUtils.sleep(800);
    }

    /**
     * Method to submit the Participant and Proxy Name details
     */
    public void participantNameSelected() {
        if (currentRow.get("AreYouCompletingThisQuestionnaireForSomeoneElse").contentEquals("Yes, I am completing this form for someone else")) {
            CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.firstNameByProxyTextBox, currentRow.get("ProxyFirstName"));
            CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.middleNameByProxyTextBox, currentRow.get("ProxyMiddleName"));
            CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.lastNameByProxyTextBox, currentRow.get("ProxyLastName"));
            CucumberLogUtils.logScreenshot();
            CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
            CommonUtils.sleep(800);
            CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.proxyFirstNameTextBox, currentRow.get("WhatIsYourNameFirstName"));
            CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.proxyMiddleNameTextBox, currentRow.get("WhatIsYourNameMiddleName"));
            CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.proxyLastNameTextBox, currentRow.get("WhatIsYourNameLastName"));
            CucumberLogUtils.logScreenshot();
            CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
            CommonUtils.sleep(800);
            CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList, currentRow.get("WhatIsYourRelationshipToParticipant"));
            if (currentRow.get("WhatIsYourRelationshipToParticipant").contentEquals("Other")) {
                CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.yourRelationshipToParticipantOtherTextBox, currentRow.get("WhatIsYourRelationshipToParticipantOther"));
                CucumberLogUtils.logScreenshot();
            }
            CommonUtils.sleep(800);
            CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
            CommonUtils.sleep(800);
            CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList, currentRow.get("AreYouTheLegalGuardianOfParticipant"));
            CommonUtils.sleep(800);
            CucumberLogUtils.logScreenshot();
            CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
        } else {
            CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.firstNameTextBox, currentRow.get("ParticipantFirstName"));
            CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.middleNameTextBox, currentRow.get("ParticipantMiddleName"));
            CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.lastNameTextBox, currentRow.get("ParticipantLastName"));
            CucumberLogUtils.logScreenshot();
            CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
            CommonUtils.sleep(800);
        }
    }

    /**
     * Method to submit the participant in the NIH Inherited Bone Marrow Failure Syndrome study?
     */
    public void participatedInBoneMarrowFailureStudy() {
        CharmsUtil.selectRadioButtonValue(
                fanconiEligibilityQuestionnairePage.participateBoneMarrowSyndromeStudyRBtonList, currentRow.get("AreOrWereYouAParticipanInNIHInheritedBoneMarrowFailuresyndromeStudy"));
        CommonUtils.sleep(800);
        CucumberLogUtils.logScreenshot();
        CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
        CommonUtils.sleep(1800);
    }

    /**
     * Method to submit Participant Basic Information- DOB,Gender by Birth
     */
    public void participantBasicInformationSelected() {
        CommonUtils.waitForVisibility(fanconiEligibilityQuestionnairePage.calendarMonthDropDown);
        fanconiEligibilityQuestionnairePage.calendarYearTextBox.clear();
        CommonUtils.sleep(800);
        CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.calendarYearTextBox, currentRow.get("DOBYear"));
        CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.calendarMonthDropDown, currentRow.get("DOBMonth"));
        CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.calendarDayOption);
        CommonUtils.sleep(800);
        CucumberLogUtils.logScreenshot();
        CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
        CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.sexAssignedRBtonList, currentRow.get("SexAssigned"));
        CommonUtils.sleep(800);
        CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
        CommonUtils.sleep(800);
    }

    /**
     * Method to submit Participant Current Gender and Pronouns
     */
    public void participantGenderInformationSelected() {
        CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.currentGenderRBtonList, currentRow.get("CurrentGender"));
        CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
        CommonUtils.sleep(1800);
    }

    /**
     * Method to add the Country and Address details
     */
    public void participantCountrySelected() {
        if (currentRow.get("AreYouCompletingThisQuestionnaireForSomeoneElse").contentEquals("Yes, I am completing this form for someone else")) {
            CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.countrylivedProxyDropDownList, currentRow.get("CountryLived"));
            CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
            if (currentRow.get("CountryLived").contentEquals("United States of America")) {
                CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.streetProxyTextBox, currentRow.get("StreetAddress1"));
                CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.additionalStreetProxyTextBox, currentRow.get("StreetAddress2"));
                CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.cityProxyTextBox, currentRow.get("City"));
                CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.stateProxyTextBox, currentRow.get("State"));
                CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.zipCodeProxyTextBox, currentRow.get("ZipCode"));
                CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
                CommonUtils.sleep(1800);
            }
        } else {
            CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.countrylivedDropDownList, currentRow.get("CountryLived"));
            CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
            if (currentRow.get("CountryLived").contentEquals("United States of America")) {
                CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.streetTextBox, currentRow.get("StreetAddress1"));
                CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.additionalStreetTextBox, currentRow.get("StreetAddress2"));
                CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.cityTextBox, currentRow.get("City"));
                CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.stateTextBox, currentRow.get("State"));
                CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.zipCodeTextBox, currentRow.get("ZipCode"));
                CommonUtils.sleep(800);
                CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
                CommonUtils.sleep(1800);
            }
        }
    }

    /**
     * Method to provide the Email Address
     */
    public void emailAddressAdded() {
        CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.emailAddressTextBox, currentRow.get("EmailAddress"));
        CommonUtils.sleep(800);
        CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
        CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.confirmEmailAddressTextBox, currentRow.get("ConfirmationEmailAddress"));
        CommonUtils.sleep(800);
        CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
        CommonUtils.sleep(1800);
    }

    /**
     * Method to submit if Participant is adopted
     */
    public void IsParticipantAdopted() {
        CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.adoptedRBtonList, currentRow.get("AreYouAdopted"));
        CommonUtils.sleep(800);
        CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
        CommonUtils.sleep(1800);
    }

    /**
     * Method to submit the phone details
     */
    public void phoneNumbersAdded() {
        CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.homePhoneNumberTextBox, currentRow.get("HomePhoneNumber"));
        CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.cellPhoneNumberTextBox, currentRow.get("CellPhoneNumber"));
        CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.workPhoneNumberTextBox, currentRow.get("WorkPhoneNumber"));
        if (currentRow.get("HomePhoneNumber").contentEquals(currentRow.get("PreferredPhoneNumber"))) {
            CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.preferredHomePhoneNumberTextBox);
        }
        if (currentRow.get("CellPhoneNumber").contentEquals(currentRow.get("PreferredPhoneNumber"))) {
            CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.preferredCellPhoneNumberTextBox);
        }
        if (currentRow.get("WorkPhoneNumber").contentEquals(currentRow.get("PreferredPhoneNumber"))) {
            CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.preferredWorkPhoneNumberTextBox);
        }
        CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
        CommonUtils.sleep(1800);
    }

    /**
     * Method to submit the Ethnicity details
     */
    public void ethnicitySelected() {
        CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.ethnicityRBtonList, currentRow.get("Ethnicity"));
        CommonUtils.sleep(800);
        CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
        CommonUtils.sleep(1800);
    }

    /**
     * Method to submit the Race details
     */
    public void raceSelected() {
        for (int j = 1; j <= 6; ++j) {
            if (currentRow.get("Race" + j) != null) {
                CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.raceRBtonList, currentRow.get("Race" + j));
            }
        }
        if (currentRow.get("OtherRace") != null) {
            CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.otherRaceNameTextBox, currentRow.get("OtherRace"));
        }
        CommonUtils.sleep(800);
        CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
        CommonUtils.sleep(1800);
    }

    /**
     * Method to submit Have you ever participated in a Fanconi anemia study at
     * another medical institution, university, government agency or other site?
     */
    public void IsOtherMedicalInstitutionSelected() {
        CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList, currentRow.get("HaveYouEverParticipatedInFanconiAnemiaStudyAtAnotherMedicalInstitution"));
        CommonUtils.sleep(800);
        CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
        CommonUtils.sleep(1800);
    }

    /**
     * Method to submit Specifications of Another Medical Institution selected
     */
    public void otherMedicalInstitutionSelected() {
        if (currentRow.get("HaveYouEverParticipatedInFanconiAnemiaStudyAtAnotherMedicalInstitution").contentEquals("Yes")) {
            CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList, currentRow.get("SpecifyParticipationInOtherStudies0"));
            fanconiEligibilityQuestionnairePage.commonRBtonList.get(1).click();
            CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.fanconiAnemiaResearchStudyAt1TextBox, currentRow.get("SpecifyParticipationInOtherStudiesDetails1"));
            fanconiEligibilityQuestionnairePage.commonRBtonList.get(2).click();
            CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.fanconiAnemiaResearcStudyAt2TextBox, currentRow.get("SpecifyParticipationInOtherStudiesDetails2"));
            fanconiEligibilityQuestionnairePage.commonRBtonList.get(3).click();
            CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.fanconiAnemiaResearcStudyOther1TextBox, currentRow.get("SpecifyParticipationInOtherStudiesDetails3"));
            fanconiEligibilityQuestionnairePage.commonRBtonList.get(4).click();
            CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.fanconiAnemiaResearcStudyOther2TextBox, currentRow.get("SpecifyParticipationInOtherStudiesDetails4"));
            fanconiEligibilityQuestionnairePage.commonRBtonList.get(5).click();
            CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.fanconiAnemiaResearcStudyOther3TextBox, currentRow.get("SpecifyParticipationInOtherStudiesDetails5"));
            CommonUtils.sleep(800);
            CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
            CommonUtils.sleep(1800);
        }
    }

    /**
     * Method to submit additional information regarding participation in other studies.
     */
    public void otherMedicalInstitutionDetailsAdded() {
        int k = 0;
        int j = 1;
        if (currentRow.get("HaveYouEverParticipatedInFanconiAnemiaStudyAtAnotherMedicalInstitution").contentEquals("Yes")) {
            for (int i = 0; i <= 5; ++i) {
                Map<String, String> currentRowForAnotherStudy = CharmsUtil.testManagerData(excelSheet, "OtherStudies", i);
                String otherStudyName = (currentRowForAnotherStudy.get("OtherStudyName"));
                String otherStudyContactPerson = (currentRowForAnotherStudy.get("OtherStudyContactPerson"));
                String otherStudyPhoneNumber = (currentRowForAnotherStudy.get("OtherStudyPhoneNumber"));
                String otherStudyInstitution = (currentRowForAnotherStudy.get("OtherStudyInstitution"));
                String otherStudyParticipationYear1 = (currentRowForAnotherStudy.get("OtherStudyParticipationYear1"));
                String otherStudyParticipationYear2 = (currentRowForAnotherStudy.get("OtherStudyParticipationYear2"));
                CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.otherStudyNameList.get(i), otherStudyName);
                CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.otherStudyContactPersonList.get(i), otherStudyContactPerson);
                CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.otherStudyPhoneNumberList.get(i), otherStudyPhoneNumber);
                CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.otherStudyInstitutionList.get(i), otherStudyInstitution);
                CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.otherStudyCurrentlyParticipatingDropDownList.get(i), currentRowForAnotherStudy.get("OtherStudyCurrentlyParticipation"));
                CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.otherStudyNoLongerStartYearList.get(k), otherStudyParticipationYear1);
                CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.otherStudyNoLongerStartYearList.get(j), otherStudyParticipationYear2);
                k = k + 2;
                j = j + 2;
            }
        }
        CommonUtils.sleep(800);
        CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
        CommonUtils.sleep(1800);
    }

    /**
     * Method to submit Have you been diagnosed with Fanconi anemia?
     */
    public void diagnosedWithFanconiAnemia() {
        CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList, currentRow.get("HaveYouBeenDiagnosedWithFanconiAnemia"));
        CommonUtils.sleep(800);
        CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
        CommonUtils.sleep(1800);
    }

    /**
     * Method to submit the age or date when you were diagnosed with Fanconi anemia
     */
    public void diagnosedWithFanconiAnemiaSelected() {
        if (currentRow.get("HaveYouBeenDiagnosedWithFanconiAnemia").contentEquals("Yes")) {
            CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList, currentRow.get("WhenWereYouDiagnosedWithFanconiAnemiaAgeOrDate"));
            if (currentRow.get("WhenWereYouDiagnosedWithFanconiAnemiaAgeOrDate").contentEquals("Age in years (if under age 1 year, please enter 0)")) {
                CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.ageParticipantDiagnosedWithFanconiTextBox, currentRow.get("WhenWereYouDiagnosedWithFanconiAnemiaAge"));
            } else if (currentRow.get("WhenWereYouDiagnosedWithFanconiAnemiaAgeOrDate").contentEquals("Date (MM/DD/YYYY)")) {
                CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.dateParticipantDiagnosedWithFanconiTextBox, currentRow.get("WhenWereYouDiagnosedWithFanconiAnemiaDate"));
            }
            CommonUtils.sleep(800);
            CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
            CommonUtils.sleep(1800);
        }
    }

    /**
     * Method to submit Have you had a chromosome breakage test for FA (sometimes also called MMC or DEB test) on a blood sample?
     */
    public void chromosomeBreakageTestSelected() {
        CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList, currentRow.get("HaveYouHadAChromosomeBreakageTestForFAOnBloodSample"));
        CommonUtils.sleep(800);
        CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
        CommonUtils.sleep(1800);
    }

    /**
     * Method to submit Where was the chromosome breakage test performed?
     */
    public void whereChromosomeBreakageTestPerformed() {
        if (currentRow.get("HaveYouHadAChromosomeBreakageTestForFAOnBloodSample").contentEquals("Yes")) {
            CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList, currentRow.get("WhereWasTheChromosomeBreakageTestPerformed"));
            if (currentRow.get("WhereWasTheChromosomeBreakageTestPerformed").contentEquals("Other (please specify)")) {
                CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.chromosomBreakageTestPerformedTextBox, currentRow.get("WhereWasTheChromosomeBreakageTestPerformedOther"));
            }
            CommonUtils.sleep(800);
            CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
        }
        if (currentRow.get("WhatWasTheChromosomeBreakageTestResultInconclusive").contentEquals("Inconclusive")) {
            CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList, currentRow.get("WhatWasTheChromosomeBreakageTestResultInconclusive"));
            CommonUtils.sleep(800);
            CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
            CommonUtils.sleep(800);
            CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList, currentRow.get("InconclusiveResult"));
            CommonUtils.sleep(800);
            CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
        }
        CommonUtils.sleep(1800);
    }

    /**
     * Method to submit What was the chromosome breakage test result?
     */
    public void whatWasChromosomeBreakageTestResult() {
        if (currentRow.get("HaveYouHadAChromosomeBreakageTestForFAOnBloodSample").contentEquals("Yes")) {
            CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList, currentRow.get("WhatWasTheChromosomeBreakageTestResult"));
            CommonUtils.sleep(800);
            CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
            CommonUtils.sleep(1800);
        }
    }

    /**
     * Method to provide the chromosome breakage test results to us
     */
    public void toProvideChromosomeBreakageTestResults() {
        if (currentRow.get("HowWouldYouLikeToProvideChromosomeBreakageTestResults").isEmpty()) {
        } else {
            CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList, currentRow.get("HowWouldYouLikeToProvideChromosomeBreakageTestResults"));
            CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
            CommonUtils.sleep(800);
            CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
            CommonUtils.sleep(1800);
        }
    }

    /**
     * Method to submit ever had complementation testing or genetic testing
     */
    public void hadComplementationGeneticTesting() {
        CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList, currentRow.get("HaveYouEverHadComplementationGeneticTesting"));
        CommonUtils.sleep(800);
        CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
        CommonUtils.sleep(1800);
    }

    /**
     * Method to provide Was the genetic testing positive for Fanconi anemia
     */
    public void WasTheGeneticTestingPositive() {
        if (currentRow.get("HaveYouEverHadComplementationGeneticTesting").contentEquals("Yes")) {
            CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList, currentRow.get("WasTheGeneticTestingPositiveForFanconiAnemia"));
            CommonUtils.sleep(800);
            CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
            CommonUtils.sleep(1800);
        }
    }

    /**
     * Method to submit the Please check FA genes tested.(Mark all that apply)
     */
    public void checkFAGenesTested() {
        if (currentRow.get("WasTheGeneticTestingPositiveForFanconiAnemia").contentEquals("No")
                || currentRow.get("WasTheGeneticTestingPositiveForFanconiAnemia").contentEquals("Unknown/Unsure")) {
            int optionsLength = fanconiEligibilityQuestionnairePage.commonRBtonList.size();
            for (int i = 0; i <= 21; ++i) {
                CharmsUtil.clickOnRadioButtonElement(fanconiEligibilityQuestionnairePage.commonRBtonList.get(i));
            }
            CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.checkFAGenesTestedTextBox, currentRow.get("FAGenesTestedTextBox"));
            for (int i = 23; i <= optionsLength - 2; ++i) {
                CharmsUtil.clickOnRadioButtonElement(fanconiEligibilityQuestionnairePage.commonRBtonList.get(i));
            }
            CommonUtils.sleep(800);
            CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
        }
        CommonUtils.sleep(1800);
    }

    /**
     * Method to submit Was the genetic testing positive for Fanconi anemia
     */
    public void mutationsVariantsInformationSelected() {
        if (currentRow.get("WasTheGeneticTestingPositiveForFanconiAnemia").contentEquals("Yes")) {
            CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.geneNameDropDownList, currentRow.get("GeneName"));
            CommonUtils.sleep(800);
            CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.mutationVariant1TextBox, currentRow.get("MutationVariant1"));
            CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.inheritedFrom1DropDownList, currentRow.get("InheritedFrom1"));
            CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.mutationVariant2TextBox, currentRow.get("MutationVariant2"));
            CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.inheritedFrom2DropDownList, currentRow.get("InheritedFrom2"));
            CommonUtils.sleep(800);
            CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
            CommonUtils.sleep(800);
        }
    }

    /**
     * Method to provide if you have a copy of the genetic test results?
     */
    public void haveCopyOfGeneticTestResults() {
        if (currentRow.get("HaveYouEverHadComplementationGeneticTesting").contentEquals("Yes")) {
            CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList, currentRow.get("DoYouHaveCopyOfGeneticTestResults"));
            CommonUtils.sleep(800);
            CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
            CommonUtils.sleep(1800);
        }
    }

    /**
     * Method to submit how you like to provide the genetic test results to us?
     */
    public void howProvideGeneticTestResults() {
        if (currentRow.get("DoYouHaveCopyOfGeneticTestResults").contentEquals("Yes")) {
            CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList, currentRow.get("HowWouldYouLikeToProvideGeneticTestResults"));
            CommonUtils.sleep(800);
            CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
            CommonUtils.sleep(800);
            CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
            CommonUtils.sleep(1800);
        }
    }

    /**
     * Method to provide any of the following features?
     */
    public void featuresOptionsSelected() {
        int optionsLength = fanconiEligibilityQuestionnairePage.yesForFeaturesOptions.size();
        if (currentRow.get("LowBirthWeight").contentEquals("Yes")) {
            for (int i = 0; i <= optionsLength - 1; ++i) {
                CharmsUtil.clickOnRadioButtonElement(fanconiEligibilityQuestionnairePage.yesForFeaturesOptions.get(i));
            }
            if (currentRow.get("ParticipantFirstName").contentEquals("")) {
                CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.heartProblemsOtherProxyText, currentRow.get("HeartProblemsOther"));
            } else {
                CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.heartProblemsOtherText, currentRow.get("HeartProblemsOther"));
            }
        } else if (currentRow.get("LowBirthWeight").contentEquals("No")) {
            for (int i = 0; i <= optionsLength - 1; ++i) {
                CharmsUtil.clickOnRadioButtonElement(fanconiEligibilityQuestionnairePage.noForFeaturesOptions.get(i));
            }
        } else if (currentRow.get("LowBirthWeight").contentEquals("Unknown/Unsure")) {
            for (int i = 0; i <= optionsLength - 1; ++i) {
                CharmsUtil.clickOnRadioButtonElement(fanconiEligibilityQuestionnairePage.unsureForFeaturesOptions.get(i));
            }
        }
        CommonUtils.sleep(800);
        CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
        CommonUtils.sleep(1800);
    }

    /**
     * Method to submit if you have ever been diagnosed with bone marrow failure?
     */
    public void everBeenDiagnosedWithBoneMarrowFailure() {
        CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList, currentRow.get("HaveYouEverBeenDiagnosedWithBoneMarrowFailure"));
        CommonUtils.sleep(800);
        CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
        CommonUtils.sleep(1800);
    }

    /**
     * Method to report date or age of diagnosis?
     */
    public void reportDateOrAgeOfDiagnosis() {
        if (currentRow.get("HaveYouEverBeenDiagnosedWithBoneMarrowFailure").contentEquals("Yes")) {
            CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.reportDateOrAgeOfDiagnosisDropDownList, currentRow.get("DoYouWantReportDateOrAgeOfDiagnosis"));
            CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.monthOfDiagnosisDropDownList, currentRow.get("BoneMarrowFailureMonthOfDiagnosis"));
            CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.yearOfDiagnosisDropDownList, currentRow.get("BoneMarrowFailureYearOfDiagnosis"));
            CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.ageAtDiagnosisDropDownList, currentRow.get("BoneMarrowFailureAgeAtDiagnosis"));
            CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.wasTreatmentReceivedDropDownList, currentRow.get("BoneMarrowFailureWasTreatmentReceived"));
            if (currentRow.get("AreYouCompletingThisQuestionnaireForSomeoneElse").contentEquals("No, I am completing this form for myself")) {
                CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.treatmentReceivedTextBox, currentRow.get("BoneMarrowFailureTreatment"));
            } else if (currentRow.get("AreYouCompletingThisQuestionnaireForSomeoneElse").contentEquals("Yes, I am completing this form for someone else")) {
                CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.treatmentReceivedProxyTextBox, currentRow.get("BoneMarrowFailureTreatment"));
            }
            CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.didYouReceiveBloodTransfusionDropDownList, currentRow.get("DidYouReceiveOrReceivingBloodTransfusion"));
            CommonUtils.sleep(800);
            CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
        }
        CommonUtils.sleep(1800);
    }

    /**
     * Method to report if ever been diagnosed with myelodysplastic syndrome (MDS)
     */
    public void diagnosedWithMyelodysplasticSyndrome() {
        if (currentRow.get("HaveYouEverBeenDiagnosedWithBoneMarrowFailure").contentEquals("Yes")) {
            CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList, currentRow.get("HaveYouEverBeenDiagnosedWithMyelodysplasticSyndrome"));
            CommonUtils.sleep(800);
            CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
        }
        CommonUtils.sleep(1800);
    }

    /**
     * Method to report When were you diagnosed with myelodysplastic syndrome(MDS)
     */
    public void ageOrDateWhenMyelodysplasticSyndromeDiagnosed() {
        if (currentRow.get("HaveYouEverBeenDiagnosedWithMyelodysplasticSyndrome").contentEquals("Yes")) {
            CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList, currentRow.get("AgeOrDateWhenMyelodysplasticSyndromeDiagnosed"));
            if (currentRow.get("AgeOrDateWhenMyelodysplasticSyndromeDiagnosed").contentEquals("Age")) {
                CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.ageParticipantDiagnosedWithMDSTextBox, currentRow.get("AgeWhenMyelodysplasticSyndromeDiagnosed"));
            }
            if (currentRow.get("AgeOrDateWhenMyelodysplasticSyndromeDiagnosed").contentEquals("Date (MM/DD/YYYY)")) {
                CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.dateParticipantDiagnosedWithMDSTextBox, currentRow.get("DateWhenMyelodysplasticSyndromeDiagnosed"));
            }
            CommonUtils.sleep(800);
            CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
        }
        CommonUtils.sleep(1800);
    }

    /**
     * Method to report if received a bone marrow, stem cell, or cord blood transplant?
     */
    public void everReceivedBoneMarrowTransplant() {
        if (currentRow.get("HaveYouEverBeenDiagnosedWithMyelodysplasticSyndrome").contentEquals("Yes") || currentRow.get("HaveYouEverBeenDiagnosedWithMyelodysplasticSyndrome").contentEquals("No")) {
            CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList, currentRow.get("HaveYouEverReceivedBoneMarrowTransplant"));
            if (currentRow.get("HaveYouEverReceivedBoneMarrowTransplant").contentEquals("Yes (specify treatment center including city, state, and phone number if known)")) {
                CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.treatmentInstitutionProxyTextBox, currentRow.get("BoneMarrowTransplantTreatmentInstitution"));
            } else if (currentRow.get("HaveYouEverReceivedBoneMarrowTransplant").contentEquals("Yes (specify treatment institution)")) {
                CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.treatmentInstitutionTextBox, currentRow.get("BoneMarrowTransplantTreatmentInstitution"));
            }
            CommonUtils.sleep(800);
            CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
        }
        CommonUtils.sleep(1800);
    }

    /**
     * Method to provide information about when you had a bone marrow, stem cell, or
     * cord blood transplant. If you do not recall the details, select 'Don't know'.
     */
    public void reportDateOrAgeOfTransplant() {
        if (currentRow.get("HaveYouEverBeenDiagnosedWithMyelodysplasticSyndrome").contentEquals("Yes")) {
            if (currentRow.get("HaveYouEverReceivedBoneMarrowTransplant").contentEquals("Yes (specify treatment center including city, state, and phone number if known)")) {
                CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.wantToReportDateOrAgeDropDownList, currentRow.get("ReportDateOrAgeOfTransplant"));
                CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.monthOfTransplantDropDownList, currentRow.get("MonthOfTransplant"));
                CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.yearOfTransplantDropDownList, currentRow.get("YearOfTransplant"));
                CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.ageAtTransplantDropDownList, currentRow.get("AgeOfTransplant"));
                CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.donorTypeDropDownList, currentRow.get("DonorType"));
                CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.transpalntDonarTypeDropDownList, currentRow.get("TransplantDonorMatch"));
                CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.stemCellSourceDropDownList, currentRow.get("StemCellSource"));
            }
            if (currentRow.get("HaveYouEverReceivedBoneMarrowTransplant").contentEquals("Yes (specify treatment institution)")) {
                CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.wantToReportDateOrAgeDropDownList, currentRow.get("ReportDateOrAgeOfTransplant"));
                CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.monthOfTransplantDropDownList, currentRow.get("MonthOfTransplant"));
                CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.yearOfTransplantDropDownList, currentRow.get("YearOfTransplant"));
                CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.ageAtTransplantDropDownList, currentRow.get("AgeOfTransplant"));
                CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.donorTypeDropDownList, currentRow.get("DonorType"));
                CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.transpalntDonarTypeDropDownList, currentRow.get("TransplantDonorMatch"));
                CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.stemCellSourceDropDownList, currentRow.get("StemCellSource"));
            }
            CommonUtils.sleep(800);
            CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
            CommonUtils.sleep(1800);
        }
    }

    /**
     * Method to submit information Have you ever been diagnosed with cancer?
     */
    public void everBeenDiagnosedWithCancer() {
        CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList, currentRow.get("HaveYouEverBeenDiagnosedWithCancer"));
        CommonUtils.sleep(800);
        CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
        CommonUtils.sleep(1800);
    }

    /**
     * Method to provide all information about cancer
     */
    public void cancerDetailsAdded() {
        if (currentRow.get("HaveYouEverBeenDiagnosedWithCancer").contentEquals("No")) {
        } else {
            if (currentRow.get("AreYouCompletingThisQuestionnaireForSomeoneElse").contentEquals("No, I am completing this form for myself")) {
                for (int i = 0; i <= 3; i++) {
                    Map<String, String> currentRowForCancerHistory = CharmsUtil.testManagerData(excelSheet, "Cancer", i);
                    CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.dynamicCancerDropDownLocator("QR~QID212#1~", i + 1), currentRowForCancerHistory.get("TumorType"));
                    CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.dynamicCancerTextBoxLocator("QR~QID212#2~", i + 1), currentRowForCancerHistory.get("TumorAdditionalDetails"));
                    CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.dynamicCancerDropDownLocator("QR~QID212#10~", i + 1), currentRowForCancerHistory.get("ReportDateOrAgeOfDiagnosis"));
                    CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.dynamicCancerDropDownLocator("QR~QID212#3~", i + 1), currentRowForCancerHistory.get("TumorMonthOfDiagnosis"));
                    CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.dynamicCancerDropDownLocator("QR~QID212#4~", i + 1), currentRowForCancerHistory.get("TumorYearOfDiagnosis"));
                    CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.dynamicCancerDropDownLocator("QR~QID212#11~", i + 1), currentRowForCancerHistory.get("TumorAgeAtDiagnosis"));
                    CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.dynamicCancerDropDownLocator("QR~QID212#5~", i + 1), currentRowForCancerHistory.get("AreYouCurrentlyReceivingTumorTreatment"));
                    CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.dynamicCancerTextBoxLocator("QR~QID212#6~", i + 1), currentRowForCancerHistory.get("TreatmentInstitution"));
                    CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.dynamicCancerTextBoxLocator("QR~QID212#7~", i + 1), currentRowForCancerHistory.get("TreatingPhysician"));
                    CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.dynamicCancerTextBoxLocator("QR~QID212#8~", i + 1), currentRowForCancerHistory.get("NameOfInstitutionOrClinicWhereBiopsyOccured"));
                    CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.dynamicCancerTextBoxLocator("QR~QID212#9~", i + 1), currentRowForCancerHistory.get("NameOfPhysicianWhoPerformedBiopsy"));
                }
            }
            if (currentRow.get("AreYouCompletingThisQuestionnaireForSomeoneElse")
                    .contentEquals("Yes, I am completing this form for someone else")) {
                for (int i = 0; i <= 3; i++) {
                    Map<String, String> currentRowForCancerHistory = CharmsUtil.testManagerData(excelSheet, "Cancer", i);
                    CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.dynamicCancerDropDownLocator("QR~QID213#1~", i + 1), currentRowForCancerHistory.get("TumorType"));
                    CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.dynamicCancerTextBoxLocator("QR~QID213#2~", i + 1), currentRowForCancerHistory.get("TumorAdditionalDetails"));
                    CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.dynamicCancerDropDownLocator("QR~QID213#10~", i + 1), currentRowForCancerHistory.get("ReportDateOrAgeOfDiagnosis"));
                    CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.dynamicCancerDropDownLocator("QR~QID213#3~", i + 1), currentRowForCancerHistory.get("TumorMonthOfDiagnosis"));
                    CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.dynamicCancerDropDownLocator("QR~QID213#4~", i + 1), currentRowForCancerHistory.get("TumorYearOfDiagnosis"));
                    CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.dynamicCancerDropDownLocator("QR~QID213#11~", i + 1), currentRowForCancerHistory.get("TumorAgeAtDiagnosis"));
                    CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.dynamicCancerDropDownLocator("QR~QID213#5~", i + 1), currentRowForCancerHistory.get("AreYouCurrentlyReceivingTumorTreatment"));
                    CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.dynamicCancerTextBoxLocator("QR~QID213#6~", i + 1), currentRowForCancerHistory.get("TreatmentInstitution"));
                    CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.dynamicCancerTextBoxLocator("QR~QID213#7~", i + 1), currentRowForCancerHistory.get("TreatingPhysician"));
                    CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.dynamicCancerTextBoxLocator("QR~QID213#8~", i + 1), currentRowForCancerHistory.get("NameOfInstitutionOrClinicWhereBiopsyOccured"));
                    CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.dynamicCancerTextBoxLocator("QR~QID213#9~", i + 1), currentRowForCancerHistory.get("NameOfPhysicianWhoPerformedBiopsy"));
                }
            }
            CommonUtils.sleep(800);
            CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
            CommonUtils.sleep(1800);
        }
    }

    /**
     * Method to add current medication(s) that you are receiving?
     */
    public void currentMedicationsAreYouReceiving() {
        CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.currentMedicationOption, currentRow.get("WhatCurrentMedicationsAreYouReceiving"));
        if (currentRow.get("WhatCurrentMedicationsAreYouReceiving").contentEquals("Name of Medication(s)")) {
            CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.currentMedicationTextBox, currentRow.get("CurrentMedicationList"));
        } else {
            CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.currentMedicationNotApplicableOption);
        }
        CommonUtils.sleep(800);
        CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
        CommonUtils.sleep(1800);
    }

    /**
     * Method to add How did you hear about this study?
     */
    public void howDidYouHearAboutThisStudy() {
        CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList, currentRow.get("HowDidYouHearAboutThisStudy"));
        if (currentRow.get("HowDidYouHearAboutThisStudy").contentEquals("Physician")) {
            CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.physicianNameTextBox, currentRow.get("HearAboutThisStudyText"));
        }
        if (currentRow.get("HowDidYouHearAboutThisStudy").contentEquals("Fanconi Cancer Foundation (formerly Fanconi Anemia Research Fund)")) {
            CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.fanconiAnemiaResearchFundTextBox, currentRow.get("HearAboutThisStudyText"));
        }
        if (currentRow.get("HowDidYouHearAboutThisStudy").contentEquals("Genetic Counselor")) {
            CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.geneticCounselorTextBox, currentRow.get("HearAboutThisStudyText"));
        }
        if (currentRow.get("HowDidYouHearAboutThisStudy").contentEquals("Other")) {
            CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.otherProviderTextBox, currentRow.get("HearAboutThisStudyText"));
        }
        CommonUtils.sleep(800);
        CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
        CommonUtils.sleep(1800);
    }

    /**
     * Method to add name,address,and phone number of the health care provider
     */
    public void healthCareProviderInformation() {
        CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.healthCareProviderNameTextBox, currentRow.get("HealthCareProviderName"));
        CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.healthCareProviderAddressTextBox, currentRow.get("HealthCareProviderAddress"));
        CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.healthCareProviderPhoneNumberTextBox, currentRow.get("HealthCareProviderPhoneNumber"));
        CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
        CommonUtils.sleep(1800);
    }

    /**
     * Method for permission to call this individual to seek more information?
     */
    public void permissionToCallProvider() {
        CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList, currentRow.get("DoWeHaveYourPermissionToCallThisIndividualToSeekMoreInformation"));
        CommonUtils.sleep(800);
        CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
        CommonUtils.sleep(1800);
    }

    /**
     * Method to add main reasons for participating in this study
     */
    public void mainReasonToParticipateInThisStudy() {
        CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList, currentRow.get("WhatAreMainReasonToParticipateInThisStudy1"));
        CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.participateInResearchTextBox, currentRow.get("WhatAreMainReasonToParticipateInThisStudy1Details"));
        CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList, currentRow.get("WhatAreMainReasonToParticipateInThisStudy2"));
        CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.screenForPotentialCancerDiagnosisTextBox, currentRow.get("WhatAreMainReasonToParticipateInThisStudy2Details"));
        CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList, currentRow.get("WhatAreMainReasonToParticipateInThisStudy3"));
        CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.receiveGeneticTestingTextBox, currentRow.get("WhatAreMainReasonToParticipateInThisStudy3Details"));
        CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList, currentRow.get("WhatAreMainReasonToParticipateInThisStudy4"));
        CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.otherTextBox, currentRow.get("WhatAreMainReasonToParticipateInThisStudy4Details"));
        CommonUtils.sleep(800);
        CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
        CommonUtils.sleep(1800);
    }

    /**
     * Method to click the final Submit button
     */
    public void clickSubmitButton() {
        CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
        WebDriverUtils.webDriver.get(getFanconiUrl());
        CommonUtils.waitForVisibility(fanconiLoginPage.profileDropDownButton);
        fanconiLoginPage.profileDropDownButton.click();
        CommonUtils.waitForVisibility(fanconiLoginPage.profileLogOutButton);
        fanconiLoginPage.profileLogOutButton.click();
        CommonUtils.sleep(1800);
    }

    /**
     * Method to Log in to the Participant details page in Native View
     */
    public void navigateToParticipantDetailsPageInNativeView() {
        CommonUtils.sleep(2000);
        CommonUtils.waitForVisibility(NativeView_SideDoor_Dashboard_Page.filterNavigatorTextBox);
        NativeView_SideDoor_Dashboard_Page.filterNavigatorTextBox.sendKeys("All Participant Details");
        CucumberLogUtils.logScreenshot();
        CommonUtils.sleep(1800);
        CommonUtils.clickOnElement(NativeView_SideDoor_Dashboard_Page.allParticipantDetailsLink);
        CommonUtils.sleep(1800);
        CommonUtils.switchToFrame(NativeView_SideDoor_Dashboard_Page.nativeViewiFrame);
        CommonUtils.sleep(1800);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * Method to click the participant detail record in list view page
     */
    public void participantDetailRecordClicked(int rowNumForAssertion) {
        currentRow = CharmsUtil.testManagerData(excelSheet, "FanconiScreener", rowNumForAssertion);
        String participantView = currentRow.get("ParticipantFirstName") + " " + currentRow.get("ParticipantMiddleName") + " " + currentRow.get("ParticipantLastName");
        String participantProxyView = currentRow.get("ProxyFirstName") + " " + currentRow.get("ProxyMiddleName") + " " + currentRow.get("ProxyLastName");
        if (currentRow.get("ParticipantFirstName").isBlank()) {
            if (cHARMSParticipantDetailsPage.nVParticipantSearchColumnName.isDisplayed()) {
            } else {
                cHARMSParticipantDetailsPage.nVParticipantSearchColumnButton.click();
            }
            cHARMSParticipantDetailsPage.nVParticipantSearchColumnName.sendKeys(participantProxyView);
            cHARMSParticipantDetailsPage.nVParticipantSearchColumnName.sendKeys(Keys.RETURN);
            CharmsUtil.clickOnElement(CHARMSParticipantDetailsPage.dynamicPreviewButtonLocator1(participantProxyView));
            CommonUtils.sleep(1800);
            CucumberLogUtils.logScreenshot();
            CharmsUtil.clickOnElement(CHARMSParticipantDetailsPage.dynamicPreviewButtonLocator("Open Record"));
            CommonUtils.sleep(3000);
            CucumberLogUtils.logScreenshot();
        } else {
            if (cHARMSParticipantDetailsPage.nVParticipantSearchColumnName.isDisplayed()) {
            } else {
                cHARMSParticipantDetailsPage.nVParticipantSearchColumnButton.click();
            }
            cHARMSParticipantDetailsPage.nVParticipantSearchColumnName.sendKeys(participantView);
            cHARMSParticipantDetailsPage.nVParticipantSearchColumnName.sendKeys(Keys.RETURN);
            CharmsUtil.clickOnElement(CHARMSParticipantDetailsPage.dynamicPreviewButtonLocator1(participantView));
            CommonUtils.sleep(2000);
            CucumberLogUtils.logScreenshot();
            CharmsUtil.clickOnElement(CHARMSParticipantDetailsPage.dynamicPreviewButtonLocator("Open Record"));
            CommonUtils.sleep(5000);
            CucumberLogUtils.logScreenshot();
        }
    }

    /**
     * Method to assert the General Information on Participant Details page
     */
    public void generalInformationAssertionOnParticipantDetailPage(int rowNumForAssertion) {
        if (currentRow == null) {
            currentRow = CharmsUtil.testManagerData(excelSheet, "FanconiScreener", rowNumForAssertion);
        }
        CommonUtils.waitForVisibility(cHARMSParticipantDetailsPage.dynamicLocatorContainsText("Subject ID"));
        CommonUtils.sleep(500);
        CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorContainsText("Subject ID"), "Subject ID", " Subject ID Label of the General Information on Participant Details page ");
        subjectIDValue = (cHARMSParticipantDetailsPage.dynamicLocatorForReadOnlyInputValuesInParticipantDetailsPage("full_family_id").getDomAttribute("value"));
        if (subjectIDValue.isEmpty()) {
            CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorForReadOnlyInputValuesInParticipantDetailsPage("full_family_id"), "", " Subject ID of the General Information on Participant Details page ");
        } else {
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(subjectIDValue);
            if (matcher.matches()) {
                CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorForReadOnlyInputValuesInParticipantDetailsPage("full_family_id"), subjectIDValue, " Subject ID of the General Information on Participant Details page ");
            } else {
                CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorForReadOnlyInputValuesInParticipantDetailsPage("full_family_id"), subjectIDValue, " Subject ID does not match the pattern of the General Information on Participant Details page ");
            }
        }
        CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorUsingNormalizeSpaceInSpan("Name"), "Name", " Name Label of the General Information on Participant Details page ");
        if (currentRow.get("ParticipantFirstName").contentEquals("")) {
            CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorForReadOnlyInputValuesInParticipantDetailsPage("name"), (currentRow.get("ProxyFirstName") + " " + currentRow.get("ProxyMiddleName") + " " + currentRow.get("ProxyLastName")), " Participant Name in proxy Scenario of the General Information on Participant Details page ");
        } else {
            CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorForReadOnlyInputValuesInParticipantDetailsPage("name"), (currentRow.get("ParticipantFirstName") + " " + currentRow.get("ParticipantMiddleName") + " " + currentRow.get("ParticipantLastName")), " Participant Name of the General Information on Participant Details page ");
        }
        CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorUsingNormalizeSpaceInSpan("Permission to contact"), "Permission to contact", " Permission to contact Label of the General Information on Participant Details page ");
        CharmsUtil.assertDropDownData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorForSelectElementsInParticipantDetailsPage("permission_to_contact"), "Unknown", " Permission to contact of the General Information on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorUsingNormalizeSpaceInSpan("FHQ Patient"), "FHQ Patient", " FHQ Patient Label of the General Information on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorForInputElementsInParticipantDetailsPage("fhq_patient"), "", " FHQ Patient Value of the General Information on Participant Details page ");
        if ((cHARMSParticipantDetailsPage.dynamicLocatorForReadOnlyInputValuesInParticipantDetailsPage("full_family_id").getDomAttribute("value").isEmpty())) {
            CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorUsingNormalizeSpaceInSpan("Eligibility Status"), "Eligibility Status", " Eligibility Status Label of the General Information on Participant Details page ");
            CharmsUtil.assertDropDownData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorForReadOnlySelectValuesInParticipantDetailsPage("eligibility_status"), "Waiting for Eligibility", " Eligibility Status of the General Information on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorUsingNormalizeSpaceInSpan("Enrollment Status"), "Enrollment Status", " Enrollment Status Label of the General Information on Participant Details page ");
            CharmsUtil.assertDropDownData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorForSelectElementsInParticipantDetailsPage("enrollment_status"), "New Screener Received", " Enrollment Status of the General Information on Participant Details page ");
        } else {
            CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorUsingNormalizeSpaceInSpan("Eligibility Status"), "Eligibility Status", " Eligibility Status Label of the General Information on Participant Details page ");
            CharmsUtil.assertDropDownData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorForReadOnlySelectValuesInParticipantDetailsPage("eligibility_status"), "Eligible", " Eligibility Status after the consent complete of the General Information on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorUsingNormalizeSpaceInSpan("Enrollment Status"), "Enrollment Status", " Enrollment Status Label of the General Information on Participant Details page ");
            CharmsUtil.assertDropDownData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorForSelectElementsInParticipantDetailsPage("enrollment_status"), "Awaiting Enrollment Forms", " Enrollment Status of the General Information on Participant Details page ");
        }
        CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorUsingNormalizeSpaceInSpan("Studies"), "Studies", " Studies Label of the General Information on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.nVParticipantStudies, "Fanconi", " Studies on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorUsingNormalizeSpaceInSpan("Study Subcategory"), "Study Subcategory", " Study Subcategory Label of the General Information on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorUsingNormalizeSpaceInSpan("NIH MRN number"), "NIH MRN number", " NIH MRN number Label of the General Information on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorForInputElementInParticipantDetailsPage("nih_number"), "", " NIH MRN number on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.nVParticipantNIHMRNnumberInfo, "NIH MRN number should include the dashes", " NIH MRN number Information Text on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorUsingNormalizeSpaceInSpan("Invitation Code"), "Invitation Code", " Invitation Code Label of the General Information on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorForInputElementInParticipantDetailsPage("invitation_code"), "", " Invitation Code on Participant Details page ");
    }

    /**
     * Method to assert the Personal Information on Participant Details
     */
    public void personalInformationAssertionOnParticipantDetailPage(int rowNumForAssertion) {
        if (currentRow == null) {
            currentRow = CharmsUtil.testManagerData(excelSheet, "FanconiScreener", rowNumForAssertion);
        }
        CharmsUtil.labelHighlight(cHARMSParticipantDetailsPage.nVParticipantPersonalInformationTab);
        cHARMSParticipantDetailsPage.nVParticipantPersonalInformationTab.click();
        CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorUsingNormalizeSpaceInSpan("Relationship to Proband"), "Relationship to Proband", " Relationship to Proband Label of the Personal Information on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorForSelectElementsInParticipantDetailsPage("relationship_to_you"), "proband", " Relationship to You of the Personal Information on Participant Details page ");
        if (currentRow.get("ParticipantFirstName").contentEquals("")) {
            CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorUsingNormalizeSpaceInSpan("First Name"), "First Name", " First Name Label of the Personal Information on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorForInputElementInParticipantDetailsPage("first_name"), currentRow.get("ProxyFirstName"), " First Name Value in Proxy scenario of the Personal Information on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorUsingNormalizeSpaceInSpan("Middle Name"), "Middle Name", " Middle Name Label of the Personal Information on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorForInputElementInParticipantDetailsPage("middle_name"), currentRow.get("ProxyMiddleName"), " Middle Name Value in Proxy scenario of the Personal Information on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorUsingNormalizeSpaceInSpan("Last Name"), "Last Name", " Last Name Label of the Personal Information on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorForInputElementInParticipantDetailsPage("last_name"), currentRow.get("ProxyLastName"), " Last Name Value in Proxy scenario of the Personal Information on Participant Details page ");
        } else {
            CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorUsingNormalizeSpaceInSpan("First Name"), "First Name", " First Name Label of the Personal Information on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorForInputElementInParticipantDetailsPage("first_name"), currentRow.get("ParticipantFirstName"), " First Name of the Personal Information on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorUsingNormalizeSpaceInSpan("Middle Name"), "Middle Name", " Middle Name Label of the Personal Information on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorForInputElementInParticipantDetailsPage("middle_name"), currentRow.get("ParticipantMiddleName"), " Middle Name of the Personal Information on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorUsingNormalizeSpaceInSpan("Last Name"), "Last Name", " Last Name Label of the Personal Information on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorForInputElementInParticipantDetailsPage("last_name"), currentRow.get("ParticipantLastName"), " Last Name of the Personal Information on Participant Details page ");
        }
    }

    /**
     * Method to assert the Demographic Information on Participant Details
     */
    public void demographicsAssertionOnParticipantDetailPage(int rowNumForAssertion) {
        if (currentRow == null) {
            currentRow = CharmsUtil.testManagerData(excelSheet, "FanconiScreener", rowNumForAssertion);
        }
        CharmsUtil.labelHighlight(cHARMSParticipantDetailsPage.nVParticipantDemographicsTab);
        cHARMSParticipantDetailsPage.nVParticipantDemographicsTab.click();
        CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorContainsText("Sex"), "Sex", " Sex Label of the General Information on Participant Details page ");
        CharmsUtil.assertDropDownData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorForSelectElementsInParticipantDetailsPage("biological_gender"), currentRow.get("SexAssigned"), " Biological Gender Value of the Demographics on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorContainsText("Participant Race (Select all that apply)"), "Participant Race (Select all that apply)", " Participant Race (Select all that apply) Label of the General Information on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.nVParticipantDemographicsTabRaceDetails, currentRow.get("RaceList"), " Participant Race link Value of the Demographics on Participant Details page ");
        String value = cHARMSParticipantDetailsPage.nVParticipantDemographicsTabRaceDetails.getText();
        if (value.contains("Other (please specify)")) {
            CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorUsingSpanNormalizeSpace("Other"), "Other", " Other Label of the General Information on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorForInputElementInParticipantDetailsPage("other_race"), currentRow.get("OtherRace"), " Participant Other Race Value of the Demographics on Participant Details page ");
        }
        CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorContainsText("Ethnicity"), "Ethnicity", " Ethnicity Label of the General Information on Participant Details page ");
        CharmsUtil.assertDropDownData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorForSelectElementsInParticipantDetailsPage("ethnicity"), currentRow.get("Ethnicity"), " Ethnicity Value of the Demographics on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorContainsText("Is the participant adopted?"), "Is the participant adopted?", " Is the participant adopted? Label of the General Information on Participant Details page ");
        CharmsUtil.assertDropDownData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorForSelectElementsInParticipantDetailsPage("adopted"), currentRow.get("AreYouAdopted"), " Is the participant adopted of the Demographics on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorContainsText("Vital Status"), "Vital Status", " Vital Status Label of the General Information on Participant Details page ");
        CharmsUtil.assertDropDownData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorForSelectElementsInParticipantDetailsPage("person_alive"), currentRow.get("VitalStatus"), " Vital Status Value of the Demographics on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorContainsText("Date of Birth"), "Date of Birth", " Date of Birth Label of the General Information on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorForInputElementInParticipantDetailsPage("date_of_birth"), currentRow.get("DOB"), " Date of Birth value of the Demographics on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorContainsText("Date of birth is estimated"), "Date of birth is estimated", " Date of birth is estimated Label of the General Information on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorUsingLabel("Date of birth is estimated"), "", " Date of Birth is estimated value of the General Information on Participant Details page ");
        CharmsUtil.assertCheckBox(softAssert, fanconiScreenerNVPage.dynamicLocatorForCheckBoxElementsInPS("date_of_birth_is_estimated"), false, " Date of Birth is estimated CheckBox Value of the General Information on Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorContainsText("Date of Death"), "Date of Death", " Date of Death Label of the General Information on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorForInputElementInParticipantDetailsPage("death_date"), "", " Date of death value of the Demographics on Participant Details page ");
        CharmsUtil.assertCheckBox(softAssert, fanconiScreenerNVPage.dynamicLocatorForCheckBoxElementsInPS("date_of_death_is_estimated"), false, " Date of death is estimated CheckBox Value of the General Information on Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorContainsText("Date of death is estimated"), "Date of death is estimated", " Date of death is estimated Label of the General Information on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorUsingLabel("Date of death is estimated"), "", " Date of death is estimated value of the General Information on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorContainsText("If Date of Birth is unknown, is this person 18 years old or older"), "If Date of Birth is unknown, is this person 18 years old or older", " If Date of Birth is unknown, is this person 18 years old or older Label of the General Information on Participant Details page ");
        CharmsUtil.assertDropDownData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorForSelectElementsInParticipantDetailsPage("if_date_of_birth_is_unkown_is_this_person_18_years_old_or_older"), "-- None --", " If Date of Birth is unkown of the Demographics on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorUsingNormalizeSpaceInSpan("Age"), "Age", " Age Label of the General Information on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorForReadOnlyInputValuesInParticipantDetailsPage("age"), currentRow.get("CalculatedAge"), " Age of the Demographics on Participant Details page ");
    }

    /**
     * Method to assert the Contact Info on Participant Details page
     */
    public void contactInformationAssertionOnParticipantDetailPage(int rowNumForAssertion) {
        Map<String, String> currentRow = CharmsUtil.testManagerData(excelSheet, "FanconiScreener", rowNumForAssertion);
        CharmsUtil.labelHighlight(cHARMSParticipantDetailsPage.nVParticipantContactInfoTab);
        cHARMSParticipantDetailsPage.nVParticipantContactInfoTab.click();
        CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorContainsText("Person who filled the screener"), "Person who filled the screener", " Person who filled the screener Label of the Contact Information on Participant Details page ");
        if (currentRow.get("ParticipantFirstName").contentEquals("")) {
            CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorForInputElementInParticipantDetailsPage("legal_representative_name"), (currentRow.get("WhatIsYourNameFirstName") + " " + currentRow.get("WhatIsYourNameMiddleName") + " " + currentRow.get("WhatIsYourNameLastName")), " Person who filled the screener text box of the Contact Information on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorContainsText("What is your relationship to the participant?"), "What is your relationship to the participant?", " What is your relationship to the participant? Label of the Contact Information on Participant Details page ");
            CharmsUtil.assertDropDownData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorForSelectElementsInParticipantDetailsPage("relationship"), currentRow.get("WhatIsYourRelationshipToParticipantInNV"), " What is your relationship to the participant? Value of the Contact Info on Participant Details page ");
            /** Contact Info **/
            CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorContainsText("Are you the legal guardian of this person?"), "Are you the legal guardian of this person?", " Are you the legal guardian of this person? Label of the Contact Information on Participant Details page ");
            CharmsUtil.assertDropDownData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorForSelectElementsInParticipantDetailsPage("legal_guardian"), currentRow.get("AreYouTheLegalGuardianOfThisPerson"), " Are you the legal guardian of this person? Value of the Contact Info on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorContainsText("Does the participant need legal representation?"), "Does the participant need legal representation?", " Does the participant need legal representation? Label of the Contact Information on Participant Details page ");
            CharmsUtil.assertDropDownData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorForSelectElementsInParticipantDetailsPage("proxy_required"), "-- None --", " Does the participant need legal representation? Value of the Contact Info on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorContainsText("Contact Street Address"), "Contact Street Address", " Contact Street Address Label of the Contact Information on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorForInputElementInParticipantDetailsPage("street_address"), "", " Contact Street Address Value of the Contact Info on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorContainsText("Contact Street Address 2"), "Contact Street Address 2", " Contact Street Address2 Label of the Contact Information on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorForInputElementInParticipantDetailsPage("contact_street_address_2"), "", " Contact Street Address 2 of the Contact Info on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorContainsText("Contact City"), "Contact City", " Contact City Label of the Contact Information on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorForInputElementInParticipantDetailsPage("city"), "", " Contact City Value of the Contact Info on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorContainsText("Contact State"), "Contact State", " Contact State Label of the Contact Information on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorForInputElementInParticipantDetailsPage("state"), "", " Contact State Value of the Contact Info on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorContainsText("Contact Zip Code"), "Contact Zip Code", " Contact Zip Code Label of the Contact Information on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorForInputElementInParticipantDetailsPage("zipcode"), "", " Contact Zip Code Value of the Contact Info on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorUsingSpanNormalizeSpace("Contact Country"), "Contact Country", " Contact Country Label of the Contact Information on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorForInputElementsInParticipantDetailsPage("contact_country"), "", " Contact Country Value of the Contact Info on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorContainsText("Registration Email"), "Registration Email", " Registration Email Label of the Contact Information on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorForInputElementInParticipantDetailsPage("user_record.email"), currentRow.get("RegistrationEmailAddress"), " Registration Email Value of the Contact Info on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorContainsText("Contact Email"), "Contact Email", " Contact Email Label of the Contact Information on Participant Details page ");
        } else {
            CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorForInputElementInParticipantDetailsPage("legal_representative_name"), currentRow.get("ParticipantFirstName") + " " + currentRow.get("ParticipantMiddleName") + " " + currentRow.get("ParticipantLastName"), " Person who filled the screener text box of the Contact Information on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorContainsText("What is your relationship to the participant?"), "What is your relationship to the participant?", " What is your relationship to the participant? Label of the Contact Information on Participant Details page ");
            CharmsUtil.assertDropDownData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorForSelectElementsInParticipantDetailsPage("relationship"), "Self", " What is your relationship to the participant? Value of the Contact Info on Participant Details page ");
            /** Contact Info **/
            CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorContainsText("Are you the legal guardian of this person?"), "Are you the legal guardian of this person?", " Are you the legal guardian of this person? Label of the Contact Information on Participant Details page ");
            CharmsUtil.assertDropDownData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorForSelectElementsInParticipantDetailsPage("legal_guardian"), currentRow.get("AreYouTheLegalGuardianOfThisPerson"), " Are you the legal guardian of this person? Value of the Contact Info on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorContainsText("Does the participant need legal representation?"), "Does the participant need legal representation?", " Does the participant need legal representation? Label of the Contact Information on Participant Details page ");
            CharmsUtil.assertDropDownData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorForSelectElementsInParticipantDetailsPage("proxy_required"), "-- None --", " Does the participant need legal representation? Value of the Contact Info on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorContainsText("Contact Street Address"), "Contact Street Address", " Contact Street Address Label of the Contact Information on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorForInputElementInParticipantDetailsPage("street_address"), currentRow.get("StreetAddress1"), " Contact Street Address Value of the Contact Info on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorContainsText("Contact Street Address 2"), "Contact Street Address 2", " Contact Street Address2 Label of the Contact Information on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorForInputElementInParticipantDetailsPage("contact_street_address_2"), currentRow.get("StreetAddress2"), " Contact Street Address 2 of the Contact Info on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorContainsText("Contact City"), "Contact City", " Contact City Label of the Contact Information on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorForInputElementInParticipantDetailsPage("city"), currentRow.get("City"), " Contact City Value of the Contact Info on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorContainsText("Contact State"), "Contact State", " Contact State Label of the Contact Information on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorForInputElementInParticipantDetailsPage("state"), currentRow.get("State"), " Contact State Value of the Contact Info on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorContainsText("Contact Zip Code"), "Contact Zip Code", " Contact Zip Code Label of the Contact Information on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorForInputElementInParticipantDetailsPage("zipcode"), currentRow.get("ZipCode"), " Contact Zip Code Value of the Contact Info on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorUsingSpanNormalizeSpace("Contact Country"), "Contact Country", " Contact Country Label of the Contact Information on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorForInputElementsInParticipantDetailsPage("contact_country"), currentRow.get("CountryLived"), " Contact Country Value of the Contact Info on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorContainsText("Registration Email"), "Registration Email", " Registration Email Label of the Contact Information on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorForInputElementInParticipantDetailsPage("user_record.email"), currentRow.get("RegistrationEmailAddress"), " Registration Email Value of the Contact Info on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorContainsText("Contact Email"), "Contact Email", " Contact Email Label of the Contact Information on Participant Details page ");
        }
        if (currentRow.get("ParticipantFirstName").contentEquals("")) {
            CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorForInputElementInParticipantDetailsPage("email_address"), "", " Contact Email Value of the Contact Info on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorContainsText("Contact Home Phone"), "Contact Home Phone", " Contact Home Phone Label of the Contact Information on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorForInputElementInParticipantDetailsPage("phone"), "", " Contact Home Phone Value of the Contact Info on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorContainsText("Contact Cell Phone"), "Contact Cell Phone", " Contact Cell Phone Label of the Contact Information on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorForInputElementInParticipantDetailsPage("cell_phone"), "", " Contact Cell Phone Value of the Contact Info on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorContainsText("Contact Work Phone"), "Contact Work Phone", " Contact Work Phone Label of the Contact Information on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorForInputElementInParticipantDetailsPage("work_phone"), "", " Contact Work Phone Value of the Contact Info on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorContainsText("Contact Preferred phone"), "Contact Preferred phone", " Contact Preferred phone Label of the Contact Information on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorForInputElementInParticipantDetailsPage("preferred_phone"), "", " Contact Preferred phone Value of the Contact Info on Participant Details page ");
        } else {
            CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorForInputElementInParticipantDetailsPage("email_address"), currentRow.get("EmailAddress"), " Contact Email Value of the Contact Info on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorContainsText("Contact Home Phone"), "Contact Home Phone", " Contact Home Phone Label of the Contact Information on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorForInputElementInParticipantDetailsPage("phone"), currentRow.get("HomePhoneNumber"), " Contact Home Phone Value of the Contact Info on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorContainsText("Contact Cell Phone"), "Contact Cell Phone", " Contact Cell Phone Label of the Contact Information on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorForInputElementInParticipantDetailsPage("cell_phone"), currentRow.get("CellPhoneNumber"), " Contact Cell Phone Value of the Contact Info on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorContainsText("Contact Work Phone"), "Contact Work Phone", " Contact Work Phone Label of the Contact Information on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorForInputElementInParticipantDetailsPage("work_phone"), currentRow.get("WorkPhoneNumber"), " Contact Work Phone Value of the Contact Info on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorContainsText("Contact Preferred phone"), "Contact Preferred phone", " Contact Preferred phone Label of the Contact Information on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorForInputElementInParticipantDetailsPage("preferred_phone"), currentRow.get("PreferredPhoneNumber"), " Contact Preferred phone Value of the Contact Info on Participant Details page ");
        }
    }

    /**
     * Method to assert the Contact Info on Participant Details page using @param rowNumForAssertion
     */
    public void proxyContactInformationAssertionOnParticipantDetailPage(int rowNumForAssertion) {
        Map<String, String> currentRow = CharmsUtil.testManagerData(excelSheet, "FanconiScreener", rowNumForAssertion);
        CharmsUtil.labelHighlight(cHARMSParticipantDetailsPage.nVParticipantProxyContactInfoTab);
        cHARMSParticipantDetailsPage.nVParticipantProxyContactInfoTab.click();
        CommonUtils.sleep(1000);
        CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorContainsText("Proxy First Name"), "Proxy First Name", " Proxy First Name Label of the Contact Information on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorForInputElementInParticipantDetailsPage("proxy_first_name"), currentRow.get("WhatIsYourNameFirstName"), " Proxy First Name Value of the Contact Info on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorContainsText("Proxy Middle Name"), "Proxy Middle Name", " Proxy Middle Name Label of the Contact Information on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorForInputElementInParticipantDetailsPage("proxy_middle_name"), currentRow.get("WhatIsYourNameMiddleName"), " Proxy Middle Name Value of the Contact Info on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorContainsText("Proxy Last Name"), "Proxy Last Name", " Proxy Last Name Label of the Contact Information on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorForInputElementInParticipantDetailsPage("proxy_last_name"), currentRow.get("WhatIsYourNameLastName"), " Proxy Last Name Value of the Contact Info on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorContainsText("Proxy Contact Street Address"), "Proxy Contact Street Address", " Proxy Contact Street Address Label of the Contact Information on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorForInputElementInParticipantDetailsPage("proxy_contact_street_address"), currentRow.get("ProxyStreetAddress"), " Proxy Street Address Value of the Contact Info on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorContainsText("Proxy Contact Street Address 2 (optional)"), "Proxy Contact Street Address 2 (optional)", " Proxy Contact Street Address 2 (optional) Label of the Contact Info on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorForInputElementInParticipantDetailsPage("proxy_street_address_2"), currentRow.get("ProxyStreetAddress2"), " Proxy Contact Street Address 2 (optional) Value of the Contact Info on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorContainsText("Proxy Contact City"), "Proxy Contact City", " Proxy Contact City Label of the Contact Information on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorForInputElementInParticipantDetailsPage("proxy_contact_city"), currentRow.get("ProxyCity"), " Proxy City Value of the Contact Info on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorContainsText("Proxy Contact State"), "Proxy Contact State", " Proxy Contact State Label of the Contact Information on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorForInputElementInParticipantDetailsPage("proxy_state"), currentRow.get("ProxyState"), " Proxy Zip Code Value of the Contact Info on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorForInputElementInParticipantDetailsPage("proxy_contact_zipcode"), currentRow.get("ProxyZipCode"), " Proxy Zip Code Value of the Contact Info on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorContainsText("Proxy Contact Zipcode"), "Proxy Contact Zipcode", " Proxy Contact Zipcode Label of the Contact Information on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorForInputElementInParticipantDetailsPage("proxy_contact_zipcode"), currentRow.get("ProxyZipCode"), " Proxy Zip Code Value of the Contact Info on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorContainsText("Proxy Contact Country"), "Proxy Contact Country", " Proxy Contact Country Label of the Contact Information on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorForInputElementsInParticipantDetailsPage("proxy_contact_country"), currentRow.get("ProxyCountry"), " Proxy Contact Country Value of the Contact Info on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorContainsText("Proxy Contact Email"), "Proxy Contact Email", " Proxy Contact Email Label of the Contact Information on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorForInputElementInParticipantDetailsPage("proxy_email_address"), currentRow.get("ProxyEmailAddress"), " Proxy Email Value of the Contact Info on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorContainsText("Proxy Contact Home Phone"), "Proxy Contact Home Phone", " Proxy Contact Home Phone Label of the Contact Information on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorForInputElementInParticipantDetailsPage("proxy_phone_number"), currentRow.get("ProxyPhoneNumber"), " Proxy Home Phone Value of the Contact Info on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorContainsText("Proxy Contact Cell Phone"), "Proxy Contact Cell Phone", " Proxy Contact Cell Phone Label of the Contact Information on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorForInputElementInParticipantDetailsPage("proxy_cell_phone"), currentRow.get("ProxyCellPhone"), " Proxy Cell Phone Value of the Contact Info on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorContainsText("Proxy Contact Work Phone"), "Proxy Contact Work Phone", " Proxy Contact Work Phone Label of the Contact Information on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorForInputElementInParticipantDetailsPage("proxy_work_phone"), currentRow.get("ProxyWorkPhone"), " Proxy Work Phone Value of the Contact Info on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorContainsText("Proxy Preferred Phone"), "Proxy Preferred Phone", " Proxy Contact Preferred phone Label of the Contact Information on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorForInputElementInParticipantDetailsPage("proxy_preferred_phone"), currentRow.get("ProxyPreferredPhoneNumber"), " Proxy Preferred phone Value of the Contact Info on Participant Details page ");
    }

    /**
     * Method to click the Back Button on Participant details page
     */
    public void participantDetailsBackButtonClicked() {
        CHARMSParticipantDetailsPage.nVAllParticipantDetailsBackButton.click();
    }

    /**
     * Method to Log in to All referral list view in Native View
     */
    public void loginToFanconiStudyPageInNativeView() {
        CommonUtils.waitForVisibility(nativeViewHomePage.nativeViewFilterNavigator);
        CharmsUtil.clickOnElement(nativeViewHomePage.nativeViewFilterNavigator);
        CharmsUtil.sendKeysToElement(nativeViewHomePage.nativeViewFilterNavigator, "All Referrals");
        CommonUtils.waitForVisibility(fanconiScreenerNVPage.nVAllReferralsButton);
        CharmsUtil.clickOnElement(fanconiScreenerNVPage.nVAllReferralsButton);
        CommonUtils.waitForVisibility(fanconiScreenerNVPage.nVReferralsListViewiFrame);
        CommonUtils.switchToFrame(fanconiScreenerNVPage.nVReferralsListViewiFrame);
    }

    /**
     * Method to click Fanconi Preview button on Referral list view page
     */
    public void fanconiStudyPreviewRecordClicked(int rowNumForAssertion) {
        if (currentRow == null) {
            currentRow = CharmsUtil.testManagerData(excelSheet, "FanconiScreener", rowNumForAssertion);
        }
        CharmsUtil.clickOnElement(fanconiScreenerNVPage.nVParticipantStudiesTab);
        if (currentRow.get("ParticipantFirstName").isBlank()) {
            if (subjectIDValue.isEmpty()) {
                CharmsUtil.labelHighlight(fanconiScreenerNVPage.nVPreviewButtonLocator);
                JavascriptUtils.clickByJS(fanconiScreenerNVPage.nVPreviewButtonLocator);
            } else {
                System.out.println("subjectIDValue: " + subjectIDValue);
                CharmsUtil.clickOnElement(fanconiScreenerNVPage.dynamicLocatorForPreviewButtonLocator(subjectIDValue));
            }
        } else {
            if (subjectIDValue.isEmpty()) {
                CharmsUtil.labelHighlight(fanconiScreenerNVPage.nVPreviewButtonLocator);
                JavascriptUtils.clickByJS(fanconiScreenerNVPage.nVPreviewButtonLocator);
            } else {
                CharmsUtil.clickOnElement(fanconiScreenerNVPage.dynamicLocatorForPreviewButtonLocator(subjectIDValue));
            }
        }
        CommonUtils.sleep(3000);
        CommonUtils.waitForVisibility(fanconiScreenerNVPage.nVFamilyMembersOpenRecordButton);
        CharmsUtil.labelHighlight(fanconiScreenerNVPage.nVFamilyMembersOpenRecordButton);
        JavascriptUtils.clickByJS(fanconiScreenerNVPage.nVFamilyMembersOpenRecordButton);
        CommonUtils.sleep(3000);
    }

    /**
     * Method to click the Fanconi screener Page Preview button
     */
    public void fanconiScreenerPagePreviewRecordClicked() {
        CharmsUtil.clickOnElement(fanconiScreenerNVPage.nVFScreenerRefPreviewRecordButton);
        CharmsUtil.clickOnElement(fanconiScreenerNVPage.nVFScreenerOpenRecordButton);
    }

    /**
     * Method to assert data in the Fanconi Study page of nativeView
     */
    public void fanconiScreenerPageGeneralInformationAssertions(int rowNumForAssertion) {
        String referralValue = fanconiScreenerNVPage.dynamicLocatorForInputElementsInFAScreener("number").getDomAttribute("value");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Number"), "Number", " Number label on Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorForInputElementsInFAScreener("number"), referralValue, " Referral Number on Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Does the participant need legal representation?"), "Does the participant need legal representation?", " Does the participant need legal representation? label on Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.dynamicLocatorForSelectElementsInFAScreenerPage("proxy_required"), "-- None --", " Does the participant need legal representation Input value on Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Age Completed"), "Age Completed", " Age Completed label on Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorForReadOnlyInputElementsInFAScreener("age_completed"), currentRow.get("CalculatedAge"), " Age Completed Read only Value on Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Study"), "Study", " Study label on Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerStudy, "Fanconi", "Study of the General Information on Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Participant Info"), "Participant Info", " Participant Info label on Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorForDisplayReadOnlyInputElementsInFAScreener("family_member_record"), subjectIDValue, " Family Member Record of the General Information on Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Participant Study Data"), "Participant Study Data", " Participant Study Data label on Fanconi Study Screener page ");
        if (participantValue.isEmpty()) {
            CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorForDisplayReadOnlyInputElementsInFAScreener("participant_study"), "", " participant_study' Record of the General Information on Fanconi Study Screener page ");
        } else {
            CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorForDisplayReadOnlyInputElementsInFAScreener("participant_study"), participantValue, " participant_study' Record of the General Information on Fanconi Study Screener page ");
        }
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Vital Status"), "Vital Status", " Vital Status label on Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerVitalStatus, "Not answered", "Vital Status of the General Information on Fanconi Study Screener page ");
        if (participantValue.isEmpty()) {
            CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Eligibility Status"), "Eligibility Status", " Eligibility Status label on Fanconi Study Screener page ");
            CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerEligibilityStatus, "waiting_for_eligibility", "Eligibility Status of the General Information on Fanconi Study Screener page ");
            CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Enrollment Status"), "Enrollment Status", " Enrollment Status label on Fanconi Study Screener page ");
            CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerEnrollmentStatus, "1", "Enrollment Status of the General Information on Fanconi Study Screener page ");
            CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Date Consent Requested"), "Date Consent Requested", " Date Consent Requested label on Fanconi Study Screener page ");
            CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerDateConsentRequested, "", "Date Consent Requested of the General Information on Fanconi Study Screener page ");
            CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Consent Reminder Count"), "Consent Reminder Count", " Consent Reminder Count label on Fanconi Study Screener page ");
            CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerConsentReminderCount, "0", "Consent Reminder Count of the General Information on Fanconi Study Screener page ");
        } else {
            CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Eligibility Status"), "Eligibility Status", " Eligibility Status label on Fanconi Study Screener page ");
            CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerEligibilityStatus, "Eligible", "Eligibility Status of the General Information on Fanconi Study Screener page ");
            CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Enrollment Status"), "Enrollment Status", " Enrollment Status label on Fanconi Study Screener page ");
            CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerEnrollmentStatus, "Awaiting Enrollment Forms", "Enrollment Status of the General Information on Fanconi Study Screener page ");
            CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Date Consent Requested"), "Date Consent Requested", " Date Consent Requested label on Fanconi Study Screener page ");
            CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerDateConsentRequested, consentDate, "Date Consent Requested of the General Information on Fanconi Study Screener page ");
            CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Consent Reminder Count"), "Consent Reminder Count", " Consent Reminder Count label on Fanconi Study Screener page ");
            CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerConsentReminderCount, "0", "Consent Reminder Count of the General Information on Fanconi Study Screener page ");
        }
    }

    /**
     * Method to assert the Fanconi Screener: Contact Information
     */
    public void contactInformationAssertionOnFanconiStudyPage(int rowNumForAssertion) {
        CharmsUtil.clickOnElement(fanconiScreenerNVPage.nVFScreenerContactInfoTab);
        if (currentRow.get("ParticipantFirstName").contentEquals("")) {
            CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("First Name"), "First Name", " First Name label of the Contact Information in Fanconi Study screener page ");
            CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorForInputElementsOfFamilyInFAScreener("first_name"), currentRow.get("ProxyFirstName"), " First Name of the Contact Information Value in Fanconi Study screener page ");
            CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Middle Name"), "Middle Name", " Middle Name label of the Contact Information in Fanconi Study screener page ");
            CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorForInputElementsOfFamilyInFAScreener("middle_name"), currentRow.get("ProxyMiddleName"), " Middle Name Value of the Contact Information in Fanconi Study screener page ");
            CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Last Name"), "Last Name", " Last Name label of the Contact Information in Fanconi Study screener page ");
            CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorForInputElementsOfFamilyInFAScreener("last_name"), currentRow.get("ProxyLastName"), " Last Name Value of the Contact Information in Fanconi Study screener page ");
            CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Street Address"), "Street Address", " Street Address label of the Contact Information in Fanconi Study screener page ");
            CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorForInputElementsOfFamilyInFAScreener("street_address"), "", " Street Address Value for non USA country of the Contact Information in Fanconi Study screener page ");
            CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Street 2 (optional)"), "Street 2 (optional)", " Street 2 (optional) label of the Contact Information in Fanconi Study screener page ");
            CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorForInputElementsOfFamilyInFAScreener("street_address2"), "", " Street 2 (optional) Value for non USA country of the Contact Information in Fanconi Study screener page ");
            CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("City"), "City", " City label of the Contact Information in Fanconi Study screener page ");
            CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorForInputElementsOfFamilyInFAScreener("city"), "", " City Value of the Contact Information in Fanconi Study screener page ");
            CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("State/Province"), "State/Province", " State/Province label of the Contact Information in Fanconi Study screener page ");
            CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorForInputElementsOfFamilyInFAScreener("state"), "", " State/Province Value of the Contact Information in  Fanconi Study screener page ");
            CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Zip Code"), "Zip Code", " Zip Code label of the Contact Information in Fanconi Study screener page ");
            CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorForInputElementsOfFamilyInFAScreener("zip_code"), "", " Contact Zip Code Value of the Contact Information in Fanconi Study screener page ");
            CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Contact Country"), "Contact Country", " Contact Country label of the Contact Information in Fanconi Study screener page ");
            CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVParticipantContactCountryInput, "", " Contact Country Value of the Contact Information in Fanconi Study screener page ");
            CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Email Address"), "Email Address", " Email Address label of the Contact Information in Fanconi Study screener page ");
            CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorForInputElementsOfFamilyInFAScreener("email_address"), "", " Contact Email Value of the Contact Information in Fanconi Study screener page ");
        } else {
            CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("First Name"), "First Name", " First Name label of the Contact Information in Fanconi Study screener page ");
            CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorForInputElementsOfFamilyInFAScreener("first_name"), currentRow.get("ParticipantFirstName"), " First Name Value of the Contact Information in Fanconi Study screener page ");
            CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Middle Name"), "Middle Name", " Middle Name label of the Contact Information in Fanconi Study screener page ");
            CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorForInputElementsOfFamilyInFAScreener("middle_name"), currentRow.get("ParticipantMiddleName"), " Middle Name Value of the Contact Information in Fanconi Study screener page ");
            CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Last Name"), "Last Name", " Last Name label of the Contact Information in Fanconi Study screener page ");
            CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorForInputElementsOfFamilyInFAScreener("last_name"), currentRow.get("ParticipantLastName"), " Last Name Value of the Contact Information in Fanconi Study screener page ");
            CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Street Address"), "Street Address", " Street Address label of the Contact Information in Fanconi Study screener page ");
            CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorForInputElementsOfFamilyInFAScreener("street_address"), currentRow.get("StreetAddress1"), " Street Address Value for non USA country of the Contact Information in Fanconi Study screener page ");
            CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Street 2 (optional)"), "Street 2 (optional)", " Street 2 (optional) label of the Contact Information in Fanconi Study screener page ");
            CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorForInputElementsOfFamilyInFAScreener("street_address2"), currentRow.get("StreetAddress2"), " Street 2 (optional) Value for non USA country of the Contact Information in Fanconi Study screener page ");
            CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("City"), "City", " City label of the Contact Information in Fanconi Study screener page ");
            CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorForInputElementsOfFamilyInFAScreener("city"), currentRow.get("City"), " City Value of the Contact Information in Fanconi Study screener page ");
            CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("State/Province"), "State/Province", " State/Province label of the Contact Information in Fanconi Study screener page ");
            CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorForInputElementsOfFamilyInFAScreener("state"), currentRow.get("State"), " State/Province Value of the Contact Information in  Fanconi Study screener page ");
            CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Zip Code"), "Zip Code", " Zip Code label of the Contact Information in Fanconi Study screener page ");
            CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorForInputElementsOfFamilyInFAScreener("zip_code"), currentRow.get("ZipCode"), " Contact Zip Code Value of the Contact Information in Fanconi Study screener page ");
            CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Contact Country"), "Contact Country", " Contact Country label of the Contact Information in Fanconi Study screener page ");
            CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVParticipantContactCountryInput, currentRow.get("CountryLived"), " Contact Country Value of the Contact Information in Fanconi Study screener page ");
            CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Email Address"), "Email Address", " Email Address label of the Contact Information in Fanconi Study screener page ");
            CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorForInputElementsOfFamilyInFAScreener("email_address"), currentRow.get("EmailAddress"), " Contact Email Value of the Contact Information in Fanconi Study screener page ");
            CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Preferred Contact"), "Preferred Contact", " Preferred Contact label of the Contact Information in Fanconi Study screener page ");
            CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorForSelectElementInFAScreenerPage("preferred_contact"), currentRow.get("PreferredPhoneNumberInStudyScreener"), " Preferred Contact Value of the Contact Information in Fanconi Study screener page ");
            CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Home Phone Number"), "Home Phone Number", " Home Phone Number label of the Contact Information in Fanconi Study screener page ");
            CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorForInputElementsOfFamilyInFAScreener("home_phone"), currentRow.get("HomePhoneNumber"), " Contact Home Phone Value of the Contact Information in Fanconi Study screener page ");
            CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Cell Phone Number"), "Cell Phone Number", " Cell Phone Number label of the Contact Information in Fanconi Study screener page ");
            CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorForInputElementsOfFamilyInFAScreener("cell_phone"), currentRow.get("CellPhoneNumber"), " Cell Phone Number Value of the Contact Information in Fanconi Study screener page ");
            CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Work Phone Number"), "Work Phone Number", " Work Phone Number label of the Contact Information in Fanconi Study screener page ");
            CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorForInputElementsOfFamilyInFAScreener("work_phone"), currentRow.get("WorkPhoneNumber"), " Work Phone Number Value of the Contact Information in Fanconi Study screener page ");
        }
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("What is your relationship to this person?"), "What is your relationship to this person?", " What is your relationship to this person? label of the Contact Information in Fanconi Study screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.dynamicLocatorForSelectElementInFAScreenerPage("relationship"), currentRow.get("WhatIsYourRelationshipToParticipantInNV"), " Relationship Value of the Contact Info on Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Proxy First Name"), "Proxy First Name", " Proxy First Name label of the Contact Information in Fanconi Study screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorForInputElementsOfFamilyInFAScreener("your_first_name"), currentRow.get("WhatIsYourNameFirstName"), " Proxy First Name  Value of the Contact Information in Fanconi Study screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Proxy Middle Name"), "Proxy Middle Name", " Proxy Middle Name label of the Contact Information in Fanconi Study screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorForInputElementsOfFamilyInFAScreener("your_middle_name"), currentRow.get("WhatIsYourNameMiddleName"), " Proxy Middle Name Value of the Contact Information in Fanconi Study screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Proxy Last Name"), "Proxy Last Name", " Proxy Last Name label of the Contact Information in Fanconi Study screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorForInputElementsOfFamilyInFAScreener("your_last_name"), currentRow.get("WhatIsYourNameLastName"), " Proxy Last Name Value of the Contact Information in Fanconi Study screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Proxy Street Address"), "Proxy Street Address", " Proxy Street Address label of the Contact Information in Fanconi Study screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorForInputElementsOfFamilyInFAScreener("proxy_street_address"), currentRow.get("ProxyStreetAddress"), " Street Address Value for non USA country of the Contact Information in Fanconi Study screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Proxy Street Address 2 (Optional)"), "Proxy Street Address 2 (Optional)", " Proxy Street Address 2 (Optional) label of the Contact Information in Fanconi Study screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorForInputElementsOfFamilyInFAScreener("proxy_street_address_2"), currentRow.get("ProxyStreetAddress2"), " Proxy Street Address 2 (Optional) Value for non USA country of the Contact Information in Fanconi Study screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Proxy City"), "Proxy City", " Proxy City label of the Contact Information in Fanconi Study screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorForInputElementsOfFamilyInFAScreener("proxy_city"), currentRow.get("ProxyCity"), " Proxy City Value of the Contact Information in Fanconi Study screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Proxy State/Province"), "Proxy State/Province", " Proxy State/Province label of the Contact Information in Fanconi Study screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorForInputElementsOfFamilyInFAScreener("proxy_state"), currentRow.get("ProxyState"), " State/Province Value of the Contact Information in  Fanconi Study screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Proxy Zip Code"), "Proxy Zip Code", " Proxy Zip Code label of the Contact Information in Fanconi Study screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorForInputElementsOfFamilyInFAScreener("proxy_zip_code"), currentRow.get("ProxyZipCode"), " Proxy Zip Code Value of the Contact Information in Fanconi Study screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Proxy Email Address"), "Proxy Email Address", " Proxy Email Address label of the Contact Information in Fanconi Study screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorForInputElementsOfFamilyInFAScreener("proxy_email_address"), currentRow.get("ProxyEmailAddress"), " Proxy Email Value of the Contact Information in Fanconi Study screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Proxy Home Phone"), "Proxy Home Phone", " Proxy Home Phone label of the Contact Information in Fanconi Study screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorForInputElementsOfFamilyInFAScreener("proxy_home_phone"), currentRow.get("ProxyPhoneNumber"), " Proxy Home Phone Value of the Contact Information in Fanconi Study screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Proxy Cell Phone"), "Proxy Cell Phone", " Proxy Cell Phone label of the Contact Information in Fanconi Study screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorForInputElementsOfFamilyInFAScreener("proxy_cell_phone"), currentRow.get("ProxyCellPhone"), " Proxy Cell Phone Value of the Contact Information in Fanconi Study screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Proxy Work Phone"), "Proxy Work Phone", " Proxy Work Phone label of the Contact Information in Fanconi Study screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorForInputElementsOfFamilyInFAScreener("proxy_work_phone"), currentRow.get("ProxyWorkPhone"), " Proxy Work Phone Value of the Contact Information in Fanconi Study screener page ");
    }

    /**
     * Method to assert the Fanconi Screener: Demographics Information of the Participant in Fanconi screener Page
     */
    public void demographicsAssertionOnFanconiStudyPage(int rowNumForAssertion) {
        CharmsUtil.clickOnElement(fanconiScreenerNVPage.nVFScreenerDemographicsTab);
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Date of birth"), "Date of birth", " Date of birth label of the Demographics Information in Fanconi Study screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorForInputElementsOfFamilyInFAScreener("date_of_birth"), currentRow.get("DOB"), " Date of birth Value of the Demographics in Fanconi Study screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Sex"), "Sex", " Biological Gender label of the Demographics Information in Fanconi Study screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVParticipantBiologicalSexInput, currentRow.get("SexAssigned"), " Biological Gender Value of the Demographics in Fanconi Study screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Participant Race (Select all that apply)"), "Participant Race (Select all that apply)", " Participant Race (Select all that apply) label of the Demographics Information in Fanconi Study screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerRace1, currentRow.get("RaceList"), " Participant Race Value of the Demographics in Fanconi Study screener page ");
        String value = fanconiScreenerNVPage.nVFScreenerRace1.getText();
        if (value.contains("Other (please specify)")) {
            CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Other race"), "Other race", " Other Race label of the Demographics Information in Fanconi Study screener page ");
            CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorForInputElementsOfFamilyInFAScreener("other_race"), currentRow.get("OtherRace"), " Participant Other Race Value of the Demographics in Fanconi Study screener page ");
        }
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Adopted"), "Adopted", " Adopted label of the Demographics Information in Fanconi Study screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.dynamicLocatorForSelectElementInFAScreenerPage("u_adopted"), currentRow.get("AreYouAdopted"), " Adopted  Value of the Demographics in Fanconi Study screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Ethnicity"), "Ethnicity", " Ethnicity label of the Demographics Information in Fanconi Study screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.dynamicLocatorForSelectElementInFAScreenerPage("race_ethnicity"), currentRow.get("Ethnicity"), " Ethnicity Value of the Demographics in Fanconi Study screener page ");
    }

    /**
     * Method to assert the Fanconi Screener: Fanconi History Information
     */
    public void fanconiHistoryAssertionOnFanconiStudyPage(int rowNumForAssertion) {
        CharmsUtil.clickOnElement(fanconiScreenerNVPage.nVFScreenerHistoryTab);
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("History of Fanconi anemia study involvement"), "History of Fanconi anemia study involvement", " History of Fanconi anemia study involvement label of the Fanconi History Information in Fanconi Study screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.dynamicLocatorForSelectElementInFAScreenerPage("history_of_fanconi_anemia_study_involvement"), currentRow.get("HaveYouEverParticipatedInFanconiAnemiaStudyAtAnotherMedicalInstitution"), " History of Fanconi anemia study involvement of the Fanconi History in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Fanconi anemia diagnosis?"), "Fanconi anemia diagnosis?", " Fanconi anemia diagnosis? label of the Fanconi History Information in Fanconi Study screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.dynamicLocatorForSelectElementInFAScreenerPage("fanconi_anemia_diagnosis"), currentRow.get("HaveYouBeenDiagnosedWithFanconiAnemia"), " Fanconi anemia diagnosis? of the Fanconi History in Fanconi Study Screener page ");
        if (currentRow.get("HaveYouBeenDiagnosedWithFanconiAnemia").contentEquals("Yes")) {
            CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Age at Fanconi diagnosis"), "Age at Fanconi diagnosis", " Age at Fanconi diagnosis label of the Fanconi History Information in Fanconi Study screener page ");
            CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorForInputElementsInFAScreener("age_at_fanconi_diagnosis"), currentRow.get("WhenWereYouDiagnosedWithFanconiAnemiaAge"), " Age at Fanconi diagnosis of the Fanconi History in Fanconi Study Screener page ");
            CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Date of Fanconi diagnosis"), "Date of Fanconi diagnosis", " Date of Fanconi diagnosis label of the Fanconi History Information in Fanconi Study screener page ");
            CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorForInputElementsInFAScreener("date_of_fanconi_diagnosis"), currentRow.get("WhenWereYouDiagnosedWithFanconiAnemiaDate"), " Date of Fanconi diagnosis of the Fanconi History in Fanconi Study Screener page ");
        }
    }

    /**
     * Method to assert Fanconi Screener: Genetic Testing History Information
     */
    public void geneticTestingHistoryAssertionOnFanconiStudyPage(int rowNumForAssertion) {
        CharmsUtil.clickOnElement(fanconiScreenerNVPage.nVFScreenerGeneticTestingHistoryTab);
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Complementation Testing previously done?"), "Complementation Testing previously done?", " Complementation Testing previously done? label of the Genetic Testing History in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.dynamicLocatorForSelectElementInFAScreenerPage("complementation_testing_previously_done"), currentRow.get("HaveYouEverHadComplementationGeneticTesting"), " Complementation Testing previously done? of the Genetic Testing History in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Genetic testing positive for Fanconi?"), "Genetic testing positive for Fanconi?", " Genetic testing positive for Fanconi? label of the Genetic Testing History in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.dynamicLocatorForSelectElementInFAScreenerPage("genetic_testing_positive_for_fanconi"), currentRow.get("WasTheGeneticTestingPositiveForFanconiAnemia"), " Genetic testing positive for Fanconi? of the Genetic Testing History in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Does the participant have a copy of the genetic test results?"), "Does the participant have a copy of the genetic test results?", " Does the participant have a copy of the genetic test results? label of the Genetic Testing History in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.dynamicLocatorForSelectElementInFAScreenerPage("genetic_test_result"), currentRow.get("DoYouHaveCopyOfGeneticTestResults"), " Does the participant have a copy of the genetic test results? of the Genetic Testing History in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Participants preferred method of delivering genetic test results"), "Participants preferred method of delivering genetic test results", " Participants preferred method of delivering genetic test results label of the Genetic Testing History in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.dynamicLocatorForSelectElementInFAScreenerPage("participants_preferred_method_of_delivering_genetic_test_results"), currentRow.get("HowWouldYouLikeToProvideGeneticTestResults"), " Participants preferred method of delivering genetic test results of the Genetic Testing History in Fanconi Study Screener page ");
    }

    /**
     * Method to assert the Fanconi Screener: FA Genes Tested
     */
    public void fAGenesTestedAssertionOnFanconiStudyPage(int rowNumForAssertion) {
        CharmsUtil.clickOnElement(fanconiScreenerNVPage.nVFScreenerFAGenesTestedTab);
        int number = fanconiScreenerNVPage.nVFScreenerFAGenesTested.size();
        for (int i = 0; i <= 26; ++i) {
            CharmsUtil.assertCheckBox(softAssert, fanconiScreenerNVPage.nVFScreenerFAGenesTested.get(i), false,
                    "FA Genes checkBox number: " + i + " Tested of the FA Genes Tested in Fanconi Study Screener page");
        }
    }

    /**
     * Method to assert the Fanconi Screener: Medical History Information
     */
    public void medicalHistoryAssertionOnFanconiStudyPage(int rowNumForAssertion) {
        CharmsUtil.clickOnElement(fanconiScreenerNVPage.nVFScreenerMedicalHistoryTab);
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Ever diagnosed with Cancer?"), "Ever diagnosed with Cancer?", " Ever diagnosed with Cancer? label of the Medical History in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.dynamicLocatorForSelectElementInFAScreenerPage("ever_diagnosed_with_cancer"), currentRow.get("HaveYouEverBeenDiagnosedWithCancer"), " Ever diagnosed with Cancer? of the Medical History in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Chromosome breakage test on blood"), "Chromosome breakage test on blood", " Chromosome breakage test on blood label of the Medical History in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.dynamicLocatorForSelectElementInFAScreenerPage("chromosome_breakage_test_on_blood"), currentRow.get("HaveYouHadAChromosomeBreakageTestForFAOnBloodSample"), " Chromosome breakage test on blood of the Medical History in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Chromosome breakage test location"), "Chromosome breakage test location", " Chromosome breakage test location label of the Medical History in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.dynamicLocatorForSelectElementInFAScreenerPage("chromosome_breakage_test_location"), currentRow.get("WhereWasTheChromosomeBreakageTestPerformed"), " Chromosome breakage test location of the Medical History in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Chromosome breakage result"), "Chromosome breakage result", " Chromosome breakage result label of the Medical History in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.dynamicLocatorForSelectElementInFAScreenerPage("chromosome_breakage_result"), currentRow.get("WhatWasTheChromosomeBreakageTestResult"), " Chromosome breakage result of the Medical History in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Chromosome breakage test on skin"), "Chromosome breakage test on skin", " Chromosome breakage test on skin label of the Medical History in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.dynamicLocatorForSelectElementInFAScreenerPage("chromosome_breakage_test_on_skin"), currentRow.get("ChromosomeBreakageTestOnSkin"), " Chromosome breakage test on skin of the Medical History in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Chromosome breakage skin test result"), "Chromosome breakage skin test result", " Chromosome breakage skin test result label of the Medical History in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.dynamicLocatorForSelectElementInFAScreenerPage("chromosome_breakage_skin_test_result"), currentRow.get("ChromosomeBreakageSkinTestResult"), " Chromosome breakage skin test result of the Medical History in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Chromosome Breakage Blood Test Result Delivery"), "Chromosome Breakage Blood Test Result Delivery", " Chromosome Breakage Blood Test Result Delivery label of the Medical History in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.dynamicLocatorForSelectElementInFAScreenerPage("test_result_delivery_method"), currentRow.get("HowWouldYouLikeToProvideChromosomeBreakageTestResults"), " Chromosome Breakage Blood Test Result Delivery of the Medical History in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Diagnosed with Myelodsplastic Syndrome (MDS)"), "Diagnosed with Myelodsplastic Syndrome (MDS)", " Diagnosed with Myelodsplastic Syndrome (MDS) label of the Medical History in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.dynamicLocatorForSelectElementInFAScreenerPage("diagnosed_with_mylodsplastic_syndrome_mds"), currentRow.get("HaveYouEverBeenDiagnosedWithMyelodysplasticSyndrome"), " Diagnosed with Myelodsplastic Syndrome (MDS) Value of the Medical History in Fanconi Study Screener page ");
        if (currentRow.get("HaveYouEverBeenDiagnosedWithMyelodysplasticSyndrome").contains("Yes")) {
            CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Age when myelodysplastic syndrome diagnosed"), "Age when myelodysplastic syndrome diagnosed", " Age when myelodysplastic syndrome diagnosed label of the Medical History in Fanconi Study Screener page ");
            CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorForInputElementsInFAScreener("age_when_diagnosed_myelodysplastic_syndrome"), currentRow.get("AgeWhenMyelodysplasticSyndromeDiagnosed"), " Age when myelodysplastic syndrome Value diagnosed of the Medical History in Fanconi Study Screener page ");
            CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Date when myelodysplastic syndrome diagnosed"), "Date when myelodysplastic syndrome diagnosed", " Date when myelodysplastic syndrome diagnosed label of the Medical History in Fanconi Study Screener page ");
            CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorForInputElementsInFAScreener("date_when_myelodysplastic_syndrome_diagnosed"), currentRow.get("DateWhenMyelodysplasticSyndromeDiagnosed"), " Date when myelodysplastic syndrome Value diagnosed of the Medical History in Fanconi Study Screener page ");
        }
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Ever received transplant (bone marrow/stem cell/ cord blood)?"), "Ever received transplant (bone marrow/stem cell/ cord blood)?", " Ever received transplant (bone marrow/stem cell/ cord blood)? label of the Medical History in Fanconi Study Screener page ");
        if (currentRow.get("ParticipantFirstName").contentEquals("")) {
            CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.dynamicLocatorForSelectElementInFAScreenerPage("ever_received_transplant_bone_marrow_stem_cell_cord_blood"), "Yes (specify treatment institution)", " Ever received transplant (bone marrow/stem cell/ cord blood) Value of the Medical History in Fanconi Study Screener page ");
        } else {
            CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.dynamicLocatorForSelectElementInFAScreenerPage("ever_received_transplant_bone_marrow_stem_cell_cord_blood"), currentRow.get("HaveYouEverReceivedBoneMarrowTransplant"), " Ever received transplant (bone marrow/stem cell/ cord blood) Value of the Medical History in Fanconi Study Screener page ");
        }
        if (currentRow.get("HaveYouEverReceivedBoneMarrowTransplant").contains("Yes (specify treatment institution)")) {
            CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Transplant treatment institution (bone marrow/stem cell/ cord blood)"), "Transplant treatment institution (bone marrow/stem cell/ cord blood)", " Transplant treatment institution (bone marrow/stem cell/ cord blood) label of the Medical History in Fanconi Study Screener page ");
            CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorForInputElementsInFAScreener("transplant_treatment_institution_bone_marrow_stem_cell_cord_blood"), currentRow.get("BoneMarrowTransplantTreatmentInstitution"), " Transplant treatment institution (bone marrow/stem cell/ cord blood) Value of the Medical History in Fanconi Study Screener page ");
            CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Age at transplant"), "Age at transplant", "Age at transplant label of the Medical History in Fanconi Study Screener page ");
            CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorForInputElementsInFAScreener("age_at_transplant"), currentRow.get("AgeOfTransplant"), " Age at transplant of the Medical History in Fanconi Study Screener page ");
            CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Month of transplant"), "Month of transplant", " Month of transplant label of the Medical History in Fanconi Study Screener page ");
            CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorForInputElementsInFAScreener("month_of_transplant"), currentRow.get("MonthOfTransplant"), " Month of transplant of the Medical History in Fanconi Study Screener page ");
            CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Year of transplant"), "Year of transplant", " Year of transplant label of the Medical History in Fanconi Study Screener page ");
            CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorForInputElementsInFAScreener("year_of_transplant"), currentRow.get("YearOfTransplant"), " Year of transplant of the Medical History in Fanconi Study Screener page ");
            CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Donor type"), "Donor type", " Donor type label of the Medical History in Fanconi Study Screener page ");
            CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.dynamicLocatorForSelectElementInFAScreenerPage("transplant_donor_type"), currentRow.get("DonorType"), " Donor type of the Medical History in Fanconi Study Screener page ");
            CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Transplant donor match"), "Transplant donor match", " Transplant donor match label of the Medical History in Fanconi Study Screener page ");
            CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.dynamicLocatorForSelectElementInFAScreenerPage("transplant_donor_match"), currentRow.get("TransplantDonorMatch"), " Transplant donor match of the Medical History in Fanconi Study Screener page ");
            CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Stem cell source"), "Stem cell source", " Stem cell source label of the Medical History in Fanconi Study Screener page ");
            CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.dynamicLocatorForSelectElementInFAScreenerPage("stem_cell_source"), currentRow.get("StemCellSource"), " Stem cell source of the Medical History in Fanconi Study Screener page ");
        }
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Current Medications"), "Current Medications", " Current Medications label of the Medical History in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerCurrentMedications, currentRow.get("CurrentMedicationList"), " Current Medications of the Medical History in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Health Care Provider Name"), "Health Care Provider Name", " Health Care Provider Name label of the Medical History in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorForInputElementsInFAScreener("health_care_provider_name"), currentRow.get("HealthCareProviderName"), " Health Care Provider Name of the Medical History in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Health Care Provider Address"), "Health Care Provider Address", " Health Care Provider Address label of the Medical History in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerHealthCareProviderAddress, currentRow.get("HealthCareProviderAddress"), " Health Care Provider Address of the Medical History in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Health Care Provider Phone Number"), "Health Care Provider Phone Number", " Health Care Provider Phone Number label of the Medical History in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorForInputElementsInFAScreener("health_care_provider_phone_number_text"), currentRow.get("HealthCareProviderPhoneNumber"), " Health Care Provider Phone Number of the Medical History in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Permission to contact Provider"), "Permission to contact Provider", " Permission to contact Provider label of the Medical History in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorForSelectElementInFAScreenerPage("permission_to_contact_provider"), currentRow.get("DoWeHaveYourPermissionToCallThisIndividualToSeekMoreInformation"), " Permission to contact Provider Assertion of the Medical History in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Bone marrow failure?"), "Bone marrow failure?", " Bone marrow failure? label of the Medical History in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.dynamicLocatorForSelectElementInFAScreenerPage("bone_marrow_failure"), currentRow.get("HaveYouEverBeenDiagnosedWithBoneMarrowFailure"), " Bone marrow failure of the Medical History in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Bone marrow failure age at diagnosis"), "Bone marrow failure age at diagnosis", " Bone marrow failure age at diagnosis label of the Medical History in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorForInputElementsInFAScreener("bone_anemia_lowbloodcount_age_at_diagnosis"), currentRow.get("BoneMarrowFailureAgeAtDiagnosis"), " Bone marrow failure age at diagnosis of the Medical History in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Bone marrow failure month of diagnosis"), "Bone marrow failure month of diagnosis", " Bone marrow failure month of diagnosis label of the Medical History in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorForInputElementsInFAScreener("bone_anemia_lowbloodcount_month_of_diagnosis"), currentRow.get("BoneMarrowFailureMonthOfDiagnosis"), " Bone marrow failure month of diagnosis of the Medical History in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Bone marrow failure year of diagnosis"), "Bone marrow failure year of diagnosis", " Bone marrow failure year of diagnosis label of the Medical History in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorForInputElementsInFAScreener("bone_anemia_lowbloodcount_year_of_diagnosis"), currentRow.get("BoneMarrowFailureYearOfDiagnosis"), " Bone marrow failure year of diagnosis of the Medical History in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Bone marrow failure was treatment received?"), "Bone marrow failure was treatment received?", " Bone marrow failure was treatment received? label of the Medical History in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.dynamicLocatorForSelectElementInFAScreenerPage("bone_anemia_lowbloodcount_was_treatment_received"), currentRow.get("BoneMarrowFailureWasTreatmentReceived"), " Bone marrow failure was treatment received of the Medical History in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Treatment"), "Treatment", " Treatment label of the Medical History in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorForInputElementsInFAScreener("bone_anemia_lowbloodcount_treatment"), currentRow.get("BoneMarrowFailureTreatment"), " Bone marrow failure Treatment of the Medical History in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Received blood transfusions"), "Received blood transfusions", " Received blood transfusions label of the Medical History in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.dynamicLocatorForSelectElementInFAScreenerPage("bone_anemia_lowbloodcount_received_blood_transfusions"), currentRow.get("DidYouReceiveOrReceivingBloodTransfusion"), " Did You receive Blood Transfusions of the Medical History in Fanconi Study Screener page ");
    }

    /**
     * Method to assert the Fanconi Screener: Participant Features
     */
    public void participantFeaturesAssertionOnFanconiStudyPage(int rowNumForAssertion) {
        CharmsUtil.clickOnElement(fanconiScreenerNVPage.nVFScreenerParticipantFeaturesTab);
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Low birth weight"), "Low birth weight", " Received blood transfusions label of the Participant Features in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.dynamicLocatorForSelectElementInFAScreenerPage("low_birth_weight"), currentRow.get("LowBirthWeight"), " Low birth weight of the Participant Features in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Feeding problems or Failure to thrive"), "Feeding problems or Failure to thrive", " Feeding problems or Failure to thrive label of the Participant Features in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.dynamicLocatorForSelectElementInFAScreenerPage("feeding_problems_or_failure_to_thrive"), currentRow.get("FeedingProblemsOrFailureToThrive"), " Feeding problems or Failure to thrive of the Participant Features in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Short stature"), "Short stature", " Short stature label of the Participant Features in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.dynamicLocatorForSelectElementInFAScreenerPage("short_stature"), currentRow.get("ShortStature"), " Short Stature of the Participant Features in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Neurocognitive/ Developmental delay"), "Neurocognitive/ Developmental delay", " Neurocognitive/ Developmental delay label of the Participant Features in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.dynamicLocatorForSelectElementInFAScreenerPage("neurocognitive_developmental_delay"), currentRow.get("NeurocognitiveDevelopmentalDelay"), " Neurocognitive Developmental Delayof the Participant Features in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Skin abnormalities"), "Skin abnormalities", " Skin abnormalities label of the Participant Features in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.dynamicLocatorForSelectElementInFAScreenerPage("skin_abnormalities"), currentRow.get("SkinAbnormalities"), "Skin abnormalities of the Participant Features in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Head/Craniofacial abnormalities"), "Head/Craniofacial abnormalities", " Head/Craniofacial abnormalities label of the Participant Features in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.dynamicLocatorForSelectElementInFAScreenerPage("head_craniofacial_abnormalities"), currentRow.get("HeadCraniofacialAbnormalities"), " Head Craniofacial Abnormalities of the Participant Features in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Mouth abnormalities"), "Mouth abnormalities", " Mouth abnormalities label of the Participant Features in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.dynamicLocatorForSelectElementInFAScreenerPage("mouth_abnormalities"), currentRow.get("MouthAbnormalities"), " Mouth abnormalities of the Participant Features in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Eye abnormalities"), "Eye abnormalities", " Eye abnormalities label of the Participant Features in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.dynamicLocatorForSelectElementInFAScreenerPage("eye_abnormalities"), currentRow.get("EyeAbnormalities"), " Eye Abnormalities of the Participant Features in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Ear abnormalities"), "Ear abnormalities", " Ear abnormalities label of the Participant Features in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.dynamicLocatorForSelectElementInFAScreenerPage("ear_abnormalities"), currentRow.get("EarAbnormalities"), " Ear Abnormalities of the Participant Features in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Extremity abnormalities"), "Extremity abnormalities", " Extremity abnormalities label of the Participant Features in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.dynamicLocatorForSelectElementInFAScreenerPage("extremity_abnormalities"), currentRow.get("ExtremityAbnormalities"), " Extremity Abnormalities of the Participant Features in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Skeletal deformities"), "Skeletal deformities", " Skeletal deformities label of the Participant Features in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.dynamicLocatorForSelectElementInFAScreenerPage("skeletal_deformities"), currentRow.get("SkeletalDeformities"), " Skeletal Deformities of the Participant Features in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Heart problems"), "Heart problems", " Heart problems label of the Participant Features in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.dynamicLocatorForSelectElementInFAScreenerPage("heart_problems"), currentRow.get("HeartProblems"), " Heart Problems of the Participant Features in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Heart problems other"), "Heart problems other", " Heart problems other label of the Participant Features in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorForInputElementsInFAScreener("heart_problems_other"), currentRow.get("HeartProblemsOther"), " Heart Problems Other Value of the Participant Features in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Kidney abnormalities"), "Kidney abnormalities", " Kidney abnormalities label of the Participant Features in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.dynamicLocatorForSelectElementInFAScreenerPage("kidney_abnormalities"), currentRow.get("KidneyAbnormalities"), " Kidney Abnormalities of the Participant Features in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Genital abnormalities"), "Genital abnormalities", " Genital abnormalities label of the Participant Features in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.dynamicLocatorForSelectElementInFAScreenerPage("genital_abnormalities"), currentRow.get("GenitalAbnormalities"), " Genital Abnormalities of the Participant Features in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Fertility problems, hypogonadism"), "Fertility problems, hypogonadism", " Fertility problems, hypogonadism label of the Participant Features in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.dynamicLocatorForSelectElementInFAScreenerPage("fertility_problems_hypogonadism"), currentRow.get("FertilityProblemsHypogonadism"), " Fertility Problems Hypogonadism of the Participant Features in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Endocrine problems"), "Endocrine problems", " Endocrine problems label of the Participant Features in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.dynamicLocatorForSelectElementInFAScreenerPage("endocrine_problems"), currentRow.get("EndocrineProblems"), " Endocrine Problems of the Participant Features in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Metabolic disorders"), "Metabolic disorders", " Metabolic disorders label of the Participant Features in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.dynamicLocatorForSelectElementInFAScreenerPage("metabolic_disorders"), currentRow.get("MetabolicDisorders"), " Metabolic Disorders of the Participant Features in Fanconi Study Screener page ");
    }

    /**
     * Method to assert the Fanconi Study: Final Information
     */
    public void finaInformationAssertionOnFanconiStudyPage(int rowNumForAssertion) {
        CharmsUtil.clickOnElement(fanconiScreenerNVPage.nVFScreenerFinalInformationTab);
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Participant in NIH Inherited Bone Marrow Failure Syndrome study?"), "Participant in NIH Inherited Bone Marrow Failure Syndrome study?", " Participant in NIH Inherited Bone Marrow Failure Syndrome study? label of the Final Information in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.dynamicLocatorForSelectElementInFAScreenerPage("particpant_in_inherited_bone_marrow_study"), currentRow.get("AreOrWereYouAParticipanInNIHInheritedBoneMarrowFailuresyndromeStudy"), " Participant in NIH Inherited Bone Marrow Failure Syndrome study Value of the Final Information in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorContainsText("Main reasons for participating in this study?"), "Main reasons for participating in this study? Select all that apply.", " Main reasons for participating in this study? Select all that apply. label of the Final Information in Fanconi Study Screener page ");
        CharmsUtil.labelHighlight(fanconiScreenerNVPage.nVFScreenerParticpantInNIHInheritedBoneMarrowFailureSyndromeStudyLock);
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerMainReasonsForParticipatingInStudy, currentRow.get("MainReasonToParticipateInThisStudyAll"), " Main reasons for participating in this study Value of the Final Information in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Participate in research"), "Participate in research", " Participate in research label of the Final Information in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorForTextAreaElements("participate_in_research"), currentRow.get("WhatAreMainReasonToParticipateInThisStudy1Details"), " Participate in research Value of the Final Information in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Screen for potential cancer diagnosis"), "Screen for potential cancer diagnosis", " Screen for potential cancer diagnosis label of the Final Information in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorForTextAreaElements("screen_for_potential_cancer_diagnosis"), currentRow.get("WhatAreMainReasonToParticipateInThisStudy2Details"), " Screen for potential cancer diagnosis Value of the Final Information in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Receive genetic testing"), "Receive genetic testing", " Receive genetic testing label of the Final Information in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorForTextAreaElements("receive_genetic_testing"), currentRow.get("WhatAreMainReasonToParticipateInThisStudy3Details"), " Receive genetic testing Value of the Final Information in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Other reason for participation"), "Other reason for participation", " Other reason for participation label of the Final Information in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorForTextAreaElements("other_reason_for_participation"), currentRow.get("WhatAreMainReasonToParticipateInThisStudy4Details"), " Other reason for participation Value of the Final Information in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Previous studies"), "Previous studies", " Previous studies label of the Final Information in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorForTextAreaElements("previous_studies"), currentRow.get("PreviousStudiesNV"), " Previous studies Value of the Final Information in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("How did you hear about this study?"), "How did you hear about this study?", " How did you hear about this study? label of the Final Information in Fanconi Study Screener page ");
        if (currentRow.get("HowDidYouHearAboutThisStudy").contentEquals("Physician")) {
            CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Physician"), "Physician", " Physician label of the Final Information in Fanconi Study Screener page ");
            CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorForInputElementsInFAScreener("physician"), currentRow.get("HearAboutThisStudyText"), " Physician Value of the Final Information in Fanconi Study Screener page ");
        }
        if (currentRow.get("HowDidYouHearAboutThisStudy1").contentEquals("Fanconi Anemia Research Fund")) {
            CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Fanconi Anemia Research Fund"), "Fanconi Anemia Research Fund", " Fanconi Anemia Research Fund label of the Final Information in Fanconi Study Screener page ");
            CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorForInputElementsInFAScreener("fanconi_anemia_research_fund"), currentRow.get("HearAboutThisStudyText"), " Fanconi Anemia Research Fund Value of the Final Information in Fanconi Study Screener page ");
        }
        if (currentRow.get("HowDidYouHearAboutThisStudy").contentEquals("Genetic Counselor")) {
            CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Genetic Counselor"), "Genetic Counselor", " Genetic Counselor label of the Final Information in Fanconi Study Screener page ");
            CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorForInputElementsInFAScreener("genetic_counselor"), currentRow.get("HearAboutThisStudyText"), " Genetic Counselor Value of the Final Information in Fanconi Study Screener page ");
        }
        if (currentRow.get("HowDidYouHearAboutThisStudy").contentEquals("Other")) {
            CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingNormalizeSpaceInSpan("Please specify"), "Please specify", " Please specify Other label of the Final Information in Fanconi Study Screener page ");
            CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorForInputElementsInFAScreener("other_how_did_you_hear"), currentRow.get("HearAboutThisStudyText"), " Please specify Other Value of the Final Information in Fanconi Study Screener page ");
        }
    }

    /**
     * Method to assert the Fanconi Screener: Intake participates in another study
     */
    public void intakeParticipatesInAnotherStudyAssertionOnFanconiStudyPage(int rowNumForAssertion) {
        CharmsUtil.clickOnElement(fanconiScreenerNVPage.nVFScreenerIntakeParticipatesInAnotherStudyTab);
        List<WebElement> rowList = fanconiScreenerNVPage.nVFScreenerIntakeParticipatesInAnotherStudyTableLinks;
        if (!rowList.isEmpty()) {
            CommonUtils.scrollIntoView(fanconiScreenerNVPage.nVFScreenerIntakeParticipatesInAnotherStudyTable);
            CharmsUtil.clickOnElement(fanconiScreenerNVPage.nVFStudyContactPersonColumnOptionsButton);
            CharmsUtil.clickOnElement(fanconiScreenerNVPage.nVFStudyContactPersonColumnSortsButton);
            for (int i = 0; i <= rowList.size() - 1; i++) {
                CommonUtils.scrollIntoView(fanconiScreenerNVPage.nVFScreenerIntakeParticipatesInAnotherStudyTable);
                currentRowForAnotherStudy = CharmsUtil.testManagerData(excelSheet, "OtherStudies", i);
                CharmsUtil.clickOnElement(rowList.get(i));
                CharmsUtil.clickOnElement(fanconiScreenerNVPage.nVFScreenerOpenRecordButton);
                CommonUtils.sleep(1000);
                CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.IntakeParticipatesInAnotherStudyTitle, "Intake participates in another study", " Study Name in Intake participates title in another study in Fanconi Study Screener page ");
                CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingSpanNormalizeSpace("Study Name"), "Study Name", " Study Name label of Intake participates title in another study in Fanconi Study Screener page ");
                CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorForInputElementsOfIntakeParticipatesInFAScreener("study_name"), currentRowForAnotherStudy.get("ParticipantStudyNameInNV") + ": " + currentRowForAnotherStudy.get("OtherStudyName"), " Study Name in Intake participates in another study in Fanconi Study Screener page ");
                CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingSpanNormalizeSpace("Study Contact Person"), "Study Contact Person", " Study Contact Person label of Intake participates title in another study in Fanconi Study Screener page ");
                CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorForInputElementsOfIntakeParticipatesInFAScreener("study_contact_person"), currentRowForAnotherStudy.get("OtherStudyContactPerson"), " Study Contact Person in Intake participates in another study in Fanconi Study Screener page ");
                CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingSpanNormalizeSpace("Study Phone Number"), "Study Phone Number", " Study Phone Number label of Intake participates title in another study in Fanconi Study Screener page ");
                CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorForInputElementsOfIntakeParticipatesInFAScreener("study_phone_number"), currentRowForAnotherStudy.get("OtherStudyPhoneNumber"), " Study Phone Number in Intake participates in another study in Fanconi Study Screener page ");
                CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingSpanNormalizeSpace("Start Date"), "Start Date", " Start Date label of Intake participates title in another study in Fanconi Study Screener page ");
                CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorForInputElementsOfIntakeParticipatesInFAScreener("start_date"), currentRowForAnotherStudy.get("OtherStudyParticipationYear1"), " Start Date in Intake participates in another study in Fanconi Study Screener page ");
                CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingSpanNormalizeSpace("End Date"), "End Date", " End Date label of Intake participates title in another study in Fanconi Study Screener page ");
                CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorForInputElementsOfIntakeParticipatesInFAScreener("end_date"), currentRowForAnotherStudy.get("OtherStudyParticipationYear2"), " End Date in Intake participates in another study in Fanconi Study Screener page ");
                CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingSpanNormalizeSpace("Participant Info"), "Participant Info", " Participant Info label of Intake participates in another study in Fanconi Study Screener page ");
                CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorForInputElementsOfIntakeParticipatesDisplayInFAScreener("participant_details"), "", " Participant Info value in Intake participates in another study in Fanconi Study Screener page ");
                CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingSpanNormalizeSpace("Institution"), "Institution", " Institution label of Intake participates title in another study in Fanconi Study Screener page ");
                CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorForInputElementsOfIntakeParticipatesInFAScreener("institution"), currentRowForAnotherStudy.get("OtherStudyInstitution"), " Institution in Intake participates in another study in Fanconi Study Screener page ");
                CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingSpanNormalizeSpace("Currently participating"), "Currently participating", " Currently participating label of Intake participates title in another study in Fanconi Study Screener page ");
                CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerIntakeParticipatesStudyCurrentlyParticipatingDropDown, currentRowForAnotherStudy.get("OtherStudyCurrentlyParticipation"), " Currently participating in Intake participates in another study in Fanconi Study Screener page ");
                CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingSpanNormalizeSpace("Intake Form ID"), "Intake Form ID", " Intake Form ID label of Intake participates title in another study in Fanconi Study Screener page ");
                CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorForInputElementsOfIntakeParticipatesDisplayInFAScreener("intake_form_id"), referralValue, " Intake Form ID value in Intake participates in another study in Fanconi Study Screener page ");
                CharmsUtil.clickOnElement(fanconiScreenerNVPage.nVFScreenerBackButton);
                CommonUtils.scrollIntoView(fanconiScreenerNVPage.nVFScreenerIntakeParticipatesInAnotherStudyTable);
                CommonUtils.sleep(1800);
            }
        }
    }

    /**
     * Method to assert the Fanconi Study: Genetic Mutation/Variants
     */
    public void geneticMutationVariantsAssertionOnFanconiStudyPage(int rowNumForAssertion) {
        CharmsUtil.clickOnElement(fanconiScreenerNVPage.nVFScreenerGeneticMutationvariantTab);
        List<WebElement> rowList = fanconiScreenerNVPage.nVFScreenerGeneticMutationvariantTableLinks;
        if (!rowList.isEmpty()) {
            for (int i = 0; i <= rowList.size() - 1; i++) {
                CharmsUtil.clickOnElement(fanconiScreenerNVPage.nVFScreenerGeneticMutationvariantPreviewRecordButton);
                CharmsUtil.clickOnElement(fanconiScreenerNVPage.nVFScreenerOpenRecordButton);
                CommonUtils.sleep(1000);
                CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerGeneticMutationTitle, "Genetic Mutation/Variant", " Genetic Mutation/Variants Title in Fanconi Study Screener page ");
                CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingSpanNormalizeSpace("Screener"), "Screener", " Screener label of Genetic Mutation/Variants in Fanconi Study Screener page ");
                CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerGeneticMutationScreenerTextBox, referralValue, " Screener in Genetic Mutation/Variants of Fanconi Study Screener page ");
                CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingSpanNormalizeSpace("Gene Name"), "Gene Name", " Gene Name label of Genetic Mutation/Variants in Fanconi Study Screener page ");
                CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerGeneticMutationGeneNameTextBox, currentRow.get("GeneName"), " Gene Name in Genetic Mutation/Variants of Fanconi Study Screener page ");
                CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingSpanNormalizeSpace("Mutation/Variant"), "Mutation/Variant", " Mutation/Variant label of Genetic Mutation/Variants in Fanconi Study Screener page ");
                CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerGeneticMutationVariantTextBox, currentRow.get("MutationVariant1"), " Mutation/Variant in Genetic Mutation/Variants of Fanconi Study Screener page ");
                CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingSpanNormalizeSpace("Inherited From"), "Inherited From", " Inherited From label of Genetic Mutation/Variants in Fanconi Study Screener page ");
                CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerGeneticMutationInheritedFromDropDown, currentRow.get("InheritedFrom1"), " Inherited From in Genetic Mutation/Variants of Fanconi Study Screener page ");
                CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingSpanNormalizeSpace("Mutation/Variant 2"), "Mutation/Variant 2", " Mutation/Variant 2 label of Genetic Mutation/Variants in Fanconi Study Screener page ");
                CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerGeneticMutationVariant2TextBox, currentRow.get("MutationVariant2"), " Mutation/Variant 2 in Genetic Mutation/Variants of Fanconi Study Screener page ");
                CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingSpanNormalizeSpace("Inherited From 2"), "Inherited From 2", " Inherited From 2 label of Genetic Mutation/Variants in Fanconi Study Screener page ");
                CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerGeneticMutationInheritedFrom2DropDown, currentRow.get("InheritedFrom2"), " Inherited From 2 in Genetic Mutation/Variants of Fanconi Study Screener page ");
                CharmsUtil.clickOnElement(fanconiScreenerNVPage.nVFScreenerBackButton);
            }
        }
    }

    /**
     * Method to assert the Fanconi Study: Patient Cancer History
     */
    public void cancerHistoryAssertionOnFanconiStudyPage() {
        CharmsUtil.clickOnElement(fanconiScreenerNVPage.nVFScreenerCancerHistoryTab);
        List<WebElement> rowList = fanconiScreenerNVPage.nVFScreenerCancerHistoryTableRowsLink;
        if (!rowList.isEmpty()) {
            CharmsUtil.clickOnElement(fanconiScreenerNVPage.nVFCancerHistoryPleaseSpecifyColumnOptionsButton);
            CharmsUtil.clickOnElement(fanconiScreenerNVPage.nVFCancerHistoryPleaseSpecifyColumnSortsButton);
            for (int i = 0; i <= rowList.size() - 1; i++) {
                currentRowForCancerHistory = CharmsUtil.testManagerData(excelSheet, "Cancer", i);
                CommonUtils.sleep(1000);
                CharmsUtil.clickOnElement(rowList.get(i));
                CommonUtils.sleep(1000);
                CharmsUtil.clickOnElement(fanconiScreenerNVPage.nVFScreenerOpenRecordButton);
                CommonUtils.sleep(1000);
                CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerCancerHistoryTitle, "Referral Patient Cancer", " Referral Patient Cancer History Title in Fanconi Study Screener page ");
                CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingSpanNormalizeSpace("Tumor Type"), "Tumor Type", " Tumor Type label of Patient Cancer History in Fanconi Study Screener page ");
                CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorForInputElementsOfCancerHistoryInFAScreener1("tumor_type"), currentRowForCancerHistory.get("TumorType"), " Tumor Type in Fanconi Study Screener page ");
                CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingSpanNormalizeSpace("Month of diagnosis"), "Month of diagnosis", " Month of diagnosis label of Patient Cancer History in Fanconi Study Screener page ");
                CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.dynamicLocatorForSelectElementOfCancerHistoryInFAScreener("month_of_diagnosis"), currentRowForCancerHistory.get("TumorMonthOfDiagnosis"), " Month of diagnosis in Fanconi Study Screener page ");
                CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingSpanNormalizeSpace("Year of diagnosis"), "Year of diagnosis", " Year of diagnosis label of Patient Cancer History in Fanconi Study Screener page ");
                CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorForInputElementsOfCancerHistoryInFAScreener("year_of_diagnosis"), currentRowForCancerHistory.get("TumorYearOfDiagnosis"), " Year of diagnosis in Fanconi Study Screener page ");
                CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingSpanNormalizeSpace("Age at Diagnosis"), "Age at Diagnosis", " Age at Diagnosis label of Patient Cancer History in Fanconi Study Screener page ");
                CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorForInputElementsOfCancerHistoryInFAScreener("age_in_years_at_diagnosis"), currentRowForCancerHistory.get("TumorAgeAtDiagnosis"), " How old was the research participant when the cancer was diagnosed?in Fanconi Study Screener page ");
                CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingSpanNormalizeSpace("Currently being treated"), "Currently being treated", " Currently being treated label of Patient Cancer History in Fanconi Study Screener page ");
                CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.dynamicLocatorForSelectElementOfCancerHistoryInFAScreener("currently_being_treated"), currentRowForCancerHistory.get("AreYouCurrentlyReceivingTumorTreatment"), " Currently being treated in Fanconi Study Screener page ");
                CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingSpanNormalizeSpace("Treatment Institution"), "Treatment Institution", " Treatment Institution label of Patient Cancer History in Fanconi Study Screener page ");
                CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorForInputElementsOfCancerHistoryInFAScreener("treatment_institution"), currentRowForCancerHistory.get("TreatmentInstitution"), " Treatment Institution in Fanconi Study Screener page ");
                CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingSpanNormalizeSpace("Treating Physician"), "Treating Physician", " Treating Physician label of Patient Cancer History in Fanconi Study Screener page ");
                CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorForInputElementsOfCancerHistoryInFAScreener("treating_physician"), currentRowForCancerHistory.get("TreatingPhysician"), " Treating Physician in Fanconi Study Screener page ");
                CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingSpanNormalizeSpace("Name of institution or clinic where biopsy occurred"), "Name of institution or clinic where biopsy occurred", " Name of institution or clinic where biopsy occurred label of Patient Cancer History in Fanconi Study Screener page ");
                CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorForInputElementsOfCancerHistoryInFAScreener("biopsy_institution"), currentRowForCancerHistory.get("NameOfInstitutionOrClinicWhereBiopsyOccured"), " Name of institution or clinic where biopsy occurred  in Fanconi Study Screener page ");
                CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingSpanNormalizeSpace("Name of physician who performed the biopsy"), "Name of physician who performed the biopsy", " Name of physician who performed the biopsy label of Patient Cancer History in Fanconi Study Screener page ");
                CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorForInputElementsOfCancerHistoryInFAScreener("biopsy_physician"), currentRowForCancerHistory.get("NameOfPhysicianWhoPerformedBiopsy"), " Name of physician who performed the biopsy in Fanconi Study Screener page ");
                CharmsUtil.clickOnElement(fanconiScreenerNVPage.nVFScreenerBackButton);
                CommonUtils.sleep(800);
            }
        }
    }

    /**
     * Method to assert all data in the Fanconi Study page
     */
    public void fanconiStudyPageAssertions(int rowNumForAssertion) {
        if (currentRow == null) {
            currentRow = CharmsUtil.testManagerData(excelSheet, "FanconiScreener", rowNumForAssertion);
        }
        fanconiEligibilityQuestionnaireStepsImpl.fanconiStudyPreviewRecordClicked(rowNumForAssertion);
        fanconiEligibilityQuestionnaireStepsImpl.fanconiStudyPageGeneralInformationAssertions(rowNumForAssertion);
        softAssert.assertAll();
    }

    /**
     * Method to assert Participant data in the Fanconi Study page
     */
    public void fanconiStudyPageGeneralInformationAssertions(int rowNumForAssertion) {
        referralValue = fanconiScreenerNVPage.dynamicLocatorForInputElements("screener_ref").getDomAttribute("value");
        participantValue = fanconiScreenerNVPage.dynamicLocatorForInputElements("participant").getDomAttribute("value");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingDataNormalizeSpaceInSpan("Participant"), "Participant", "Participant label of the General Information on Fanconi Study Screener page ");
        if (Objects.requireNonNull(fanconiScreenerNVPage.dynamicLocatorForInputElements("participant").getDomAttribute("value")).isEmpty()) {
            CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorForInputElements("participant"), "", "Participant Input Value of the General Information on Fanconi Study Screener page ");
        } else {
            CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorForInputElements("participant"), subjectIDValue, "Participant Input Value of the General Information on Fanconi Study Screener page ");
        }
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingDataNormalizeSpaceInSpan("Name"), "Name", "Name label of the General Information on Fanconi Study Screener page ");
        if (currentRow.get("ParticipantFirstName").contentEquals("")) {
            CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVParticipantNameValue, (currentRow.get("ProxyFirstName") + " " + currentRow.get("ProxyMiddleName") + " " + currentRow.get("ProxyLastName")), " Participant Name in proxy Scenario of the General Information on Participant Details page ");
        } else {
            CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVParticipantNameValue, (currentRow.get("ParticipantFirstName") + " " + currentRow.get("ParticipantMiddleName") + " " + currentRow.get("ParticipantLastName")), " Participant Name of the General Information on Participant Details page ");
        }
        if (fanconiScreenerNVPage.dynamicLocatorForInputElements("participant").getDomAttribute("value").isEmpty()) {
            CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorContainsText("Eligibility Status"), "Eligibility Status", " Eligibility Status label of the General Information on Fanconi Study Screener page ");
            CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.dynamicLocatorForSelectElements("eligibility_status"), "Waiting for Eligibility", " Eligibility Status Value of the General Information on Fanconi Study Screener page ");
            CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorContainsText("Enrollment Status"), "Enrollment Status", " Enrollment Status label of the General Information on Fanconi Study Screener page ");
            CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.dynamicLocatorForSelectElements("enrollment_status"), "New Screener Received", " Enrollment Status Value of the General Information on Fanconi Study Screener page ");
        } else {
            CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorContainsText("Eligibility Status"), "Eligibility Status", " Eligibility Status label of the General Information on Fanconi Study Screener page ");
            CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.dynamicLocatorForSelectElements("eligibility_status"), "Eligible", " Eligibility Status Value of the General Information on Fanconi Study Screener page ");
            CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorContainsText("Enrollment Status"), "Enrollment Status", " Enrollment Status label of the General Information on Fanconi Study Screener page ");
            CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.dynamicLocatorForSelectElements("enrollment_status"), "Awaiting Enrollment Forms", " Enrollment Status Value of the General Information on Fanconi Study Screener page ");
        }
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorContainsText1("Screener"), "Screener", " Screener label of the General Information on Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorForInputElements("screener_ref"), referralValue, " Referral Value of General Information on Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorContainsText("IIQ"), "IIQ", " IIQ label of the General Information on Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorForInputElements("iiq_ref"), "", " IIQ Input value of the General Information on Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorContainsText("FA Survey"), "FA Survey", " FA Survey label of the General Information on Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorForInputElements("fa_survey"), "", " FA Survey Input Value of the General Information on Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorContainsText("Study Sub Categories"), "Study Sub Categories", " Study Sub Categories label of the General Information on Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorUsingDataNormalizeSpaceInSpan("Study"), "Study", " Study label of the General Information on Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorForInputElements("study"), "Fanconi", " Study Input Value of the General Information on Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorContainsText("Cohort"), "Cohort", " Cohort label of the General Information on Fanconi Study Screener page ");
        if (fanconiScreenerNVPage.dynamicLocatorForInputElements("participant").getDomAttribute("value").isEmpty()) {
            CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.dynamicLocatorForSelectElements("cohort"), "Field", " Cohort Select Value of the General Information on Fanconi Study Screener page ");
        } else {
            CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.dynamicLocatorForSelectElements("cohort"), "Clinical", " Cohort Select Value of the General Information on Fanconi Study Screener page ");
        }
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorContainsText("NIH MRN number"), "NIH MRN number", " NIH MRN number label of the General Information on Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVParticipantNIHMRNNumberInput, "", " NIH MRN number Input value of General Information on Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorContainsText("Screener Complete"), "Screener Complete", " Screener Complete label of the General Information on Fanconi Study Screener page ");
        CharmsUtil.assertCheckBox(softAssert, fanconiScreenerNVPage.dynamicLocatorForCheckBoxElements1("screener_complete"), false, " Screener Complete CheckBox Value of the General Information on Fanconi Study Screener page ");
        CharmsUtil.assertCheckBox(softAssert, fanconiScreenerNVPage.dynamicLocatorForCheckBoxElements("screener_complete"), true, " Screener Complete CheckBox Value of the General Information on Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorContainsText("IIQ Complete"), "IIQ Complete", " IIQ Complete label of the General Information on Fanconi Study Screener page ");
        CharmsUtil.assertCheckBox(softAssert, fanconiScreenerNVPage.dynamicLocatorForCheckBoxElements1("iiq_complete"), false, " IIQ Complete CheckBox Value of the General Information on Fanconi Study Screener page ");
        CharmsUtil.assertCheckBox(softAssert, fanconiScreenerNVPage.dynamicLocatorForCheckBoxElements("iiq_complete"), false, " IIQ Complete CheckBox Value of the General Information on Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorContainsText("Study Survey Complete"), "Study Survey Complete", " Study Survey Complete label of the General Information on Fanconi Study Screener page ");
        CharmsUtil.assertCheckBox(softAssert, fanconiScreenerNVPage.dynamicLocatorForCheckBoxElements1("study_survey_complete"), false, " Study Survey Complete CheckBox Value of the General Information on Fanconi Study Screener page ");
        CharmsUtil.assertCheckBox(softAssert, fanconiScreenerNVPage.dynamicLocatorForCheckBoxElements("study_survey_complete"), false, " Study Survey Complete CheckBox Value of the General Information on Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorContainsText("All Required Forms Completed"), "All Required Forms Completed", " All Required Forms Completed label of the General Information on Fanconi Study Screener page ");
        CharmsUtil.assertCheckBox(softAssert, fanconiScreenerNVPage.dynamicLocatorForCheckBoxElements1("forms_completed"), false, "All Required Forms Completed CheckBox Value of the General Information on Fanconi Study Screener page ");
        CharmsUtil.assertCheckBox(softAssert, fanconiScreenerNVPage.dynamicLocatorForCheckBoxElements("forms_completed"), false, " All Required Forms Completed CheckBox Value of the General Information on Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorContainsText("MRR Complete"), "MRR Complete", " MRR Complete label of the General Information on Fanconi Study Screener page ");
        CommonUtils.sleep(800);
        CharmsUtil.assertCheckBox(softAssert, fanconiScreenerNVPage.dynamicLocatorForCheckBoxElements1("mrr_complete"), false, " Ever Consented CheckBox Value of the General Information on Fanconi Study Screener page ");
        CharmsUtil.assertCheckBox(softAssert, fanconiScreenerNVPage.dynamicLocatorForCheckBoxElements("mrr_complete"), false, " MRR Complete CheckBox Value of the General Information on Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorContainsText("Ever Consented"), "Ever Consented", " Ever Consented label of the General Information on Fanconi Study Screener page ");
        CharmsUtil.assertCheckBox(softAssert, fanconiScreenerNVPage.dynamicLocatorForCheckBoxElements1("consent_signed"), false, " Ever Consented CheckBox Value of the General Information on Fanconi Study Screener page ");
        if (!Objects.requireNonNull(fanconiScreenerNVPage.dynamicLocatorForInputElements("participant").getDomAttribute("value")).isEmpty()) {
            CharmsUtil.assertCheckBox(softAssert, fanconiScreenerNVPage.dynamicLocatorForCheckBoxElements("consent_signed"), true, " Ever Consented CheckBox Value of the General Information on Fanconi Study Screener page ");
        } else {
            CharmsUtil.assertCheckBox(softAssert, fanconiScreenerNVPage.dynamicLocatorForCheckBoxElements("consent_signed"), false, " Ever Consented CheckBox Value of the General Information on Fanconi Study Screener page ");
        }
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.dynamicLocatorContainsText("Ever Assented"), "Ever Assented", " Ever Assented label of the General Information on Fanconi Study Screener page ");
        CharmsUtil.assertCheckBox(softAssert, fanconiScreenerNVPage.dynamicLocatorForCheckBoxElements1("assent_signed"), false, " Ever Assented CheckBox Value of the General Information on Fanconi Study Screener page ");
        CharmsUtil.assertCheckBox(softAssert, fanconiScreenerNVPage.dynamicLocatorForCheckBoxElements("assent_signed"), false, " Ever Assented CheckBox Value of the General Information on Fanconi Study Screener page ");
        consentDate = fanconiScreenerNVPage.nVConsentDate.getText();
        CommonUtils.sleep(800);
    }

    /**
     * Method to assert all data in the Fanconi Study page
     */
    public void fanconiScreenerPageAssertions(int rowNumForAssertion) {
        if (currentRow == null) {
            currentRow = CharmsUtil.testManagerData(excelSheet, "FanconiScreener", rowNumForAssertion);
        }
        fanconiEligibilityQuestionnaireStepsImpl.fanconiScreenerPagePreviewRecordClicked();
        fanconiEligibilityQuestionnaireStepsImpl.fanconiScreenerPageGeneralInformationAssertions(rowNumForAssertion);
        fanconiEligibilityQuestionnaireStepsImpl.contactInformationAssertionOnFanconiStudyPage(rowNumForAssertion);
        fanconiEligibilityQuestionnaireStepsImpl.demographicsAssertionOnFanconiStudyPage(rowNumForAssertion);
        fanconiEligibilityQuestionnaireStepsImpl.fanconiHistoryAssertionOnFanconiStudyPage(rowNumForAssertion);
        fanconiEligibilityQuestionnaireStepsImpl.geneticTestingHistoryAssertionOnFanconiStudyPage(rowNumForAssertion);
        fanconiEligibilityQuestionnaireStepsImpl.fAGenesTestedAssertionOnFanconiStudyPage(rowNumForAssertion);
        fanconiEligibilityQuestionnaireStepsImpl.medicalHistoryAssertionOnFanconiStudyPage(rowNumForAssertion);
        fanconiEligibilityQuestionnaireStepsImpl.participantFeaturesAssertionOnFanconiStudyPage(rowNumForAssertion);
        fanconiEligibilityQuestionnaireStepsImpl.finaInformationAssertionOnFanconiStudyPage(rowNumForAssertion);
        fanconiEligibilityQuestionnaireStepsImpl.intakeParticipatesInAnotherStudyAssertionOnFanconiStudyPage(rowNumForAssertion);
        fanconiEligibilityQuestionnaireStepsImpl.geneticMutationVariantsAssertionOnFanconiStudyPage(rowNumForAssertion);
        fanconiEligibilityQuestionnaireStepsImpl.cancerHistoryAssertionOnFanconiStudyPage();
        fanconiEligibilityQuestionnaireStepsImpl.nativeViewProfilelogOut();
        softAssert.assertAll();
    }

    /**
     * Fanconi Eligibility Question submission method
     */
    public void fanconiEligibilityAllScenariosQuestionnaireSubmission() {
        for (int i = 1; i <= 10; ++i) {
            String username = "sj.fanconitester" + i + "@yopmail.com";
            String password = "Test123$$";
            WebDriverUtils.webDriver.get(getFanconiUrl());
            System.out.println(username);
            CommonUtils.sleep(800);
            CommonUtils.waitForVisibility(fanconiLoginPage.enrollLoginButton);
            CharmsUtil.clickOnElement(fanconiLoginPage.enrollLoginButton);
            if (i != 1) {
                CharmsUtil.clickOnElement(cHARMSParticipantDetailsPage.dynamicLocatorUsingNormalizeSpace("Back to sign in"));
                oktaLoginPage.usernameTxtBox.clear();
            }
            CharmsUtil.sendKeysToElement(oktaLoginPage.usernameTxtBox, username);
            CharmsUtil.clickOnElement(oktaLoginPage.nextButton);
            CharmsUtil.sendKeysToElement(oktaLoginPage.passwordTxtBox, password);
            CharmsUtil.clickOnElement(oktaLoginPage.verifyBtn);
            CucumberLogUtils.logScreenshot();
            CommonUtils.waitForVisibility(oktaLoginPage.agreeBtn);
            CharmsUtil.clickOnElement(oktaLoginPage.agreeBtn);
            fanconiLoginPage.eligibilityQuestionnaireLink.click();
            fanconiEligibilityQuestionnaireStepsImpl.fanconiEligibilityQuestionnaireSubmissionScenario(i - 1);
            fanconiEligibilityQuestionnaireStepsImpl.clickSubmitButton();
        }
    }

    /**
     * Method to assert the Fanconi Study: Consent Flow using @param rowCount
     */
    public void fanconiConsentAssertionOnFanconiStudyPage(int rowCount) {
        CharmsUtil.assertDropDownData(softAssert, cHARMSParticipantDetailsPage.nVParticipantEnrollmentStatus,
                "New Screener Received", " Enrollment Status of the General Information on Participant Details page ");
        CharmsUtil.labelHighlight(cHARMSParticipantDetailsPage.nVParticipantSubmitForEligibilityReviewButton);
        cHARMSParticipantDetailsPage.nVParticipantSubmitForEligibilityReviewButton.click();
        CommonUtils.sleep(2000);
        CharmsUtil.labelHighlight(cHARMSParticipantDetailsPage.nVParticipantHoldDateTextBox);
        CharmsUtil.clickOnElement(cHARMSParticipantDetailsPage.nVParticipantHoldDateButton);
        CharmsUtil.clickOnElement(cHARMSParticipantDetailsPage.nVParticipantHoldGoToTodayButton);
        CharmsUtil.labelHighlight(cHARMSParticipantDetailsPage.nVParticipantSubmitForEligibilityReviewButton);
        cHARMSParticipantDetailsPage.nVParticipantSubmitForEligibilityReviewButton.click();
        CommonUtils.sleep(2000);
        CharmsUtil.assertDropDownData(softAssert, cHARMSParticipantDetailsPage.nVParticipantEnrollmentStatus, "Eligibility Review", " Enrollment Status of the General Information on Participant Details page ");
        CharmsUtil.labelHighlight(cHARMSParticipantDetailsPage.nVParticipantMarkEligibleButton);
        cHARMSParticipantDetailsPage.nVParticipantMarkEligibleButton.click();
        CommonUtils.sleep(2000);
        CharmsUtil.assertDropDownData(softAssert, cHARMSParticipantDetailsPage.nVParticipantEnrollmentStatus, "Eligible", " Eligibility Status of the General Information on Participant Details page ");
        CharmsUtil.assertDropDownData(softAssert, cHARMSParticipantDetailsPage.nVParticipantEnrollmentStatus, "Awaiting Consent", " Enrollment Status of the General Information on Participant Details page ");
        CommonUtils.scrollIntoView(cHARMSParticipantDetailsPage.nVParticipantConsentTableTab);
        CommonUtils.sleep(2000);
        CharmsUtil.clickOnElement(cHARMSParticipantDetailsPage.nVParticipantConsentTableTab);
        CharmsUtil.clickOnElement(cHARMSParticipantDetailsPage.nVParticipantConsentTablePreviewLink);
        CharmsUtil.clickOnElement(cHARMSParticipantDetailsPage.nVParticipantOpenRecordButton);
        CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.nVParticipantFamilyMemberTextBox, (currentRow.get("ParticipantFirstName") + " " + currentRow.get("ParticipantLastName")), " Family Member of the CHARMS Consent Page ");
        CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.nVParticipantConsentStatusTextBox, "1", "Consent Status in Family Member of the CHARMS Consent Page ");
        CharmsUtil.labelHighlight(cHARMSParticipantDetailsPage.nVParticipantConsentCallScheduledTimeTextBox);
        CharmsUtil.clickOnElement(cHARMSParticipantDetailsPage.nVParticipantTimeIcon);
        CharmsUtil.clickOnElement(cHARMSParticipantDetailsPage.nVParticipantGoToToday);
        CharmsUtil.clickOnElement(cHARMSParticipantDetailsPage.nVParticipantTimeIconOkButton);
        CharmsUtil.labelHighlight(cHARMSParticipantDetailsPage.nVParticipantConsentCallDatesTextBox);
        CharmsUtil.labelHighlight(cHARMSParticipantDetailsPage.nVParticipantTimeIcon1);
        CharmsUtil.clickOnElement(cHARMSParticipantDetailsPage.nVParticipantTimeIcon);
        CharmsUtil.labelHighlight(cHARMSParticipantDetailsPage.nVParticipantGoToToday);
        CharmsUtil.clickOnElement(cHARMSParticipantDetailsPage.nVParticipantGoToToday);
        CharmsUtil.labelHighlight(cHARMSParticipantDetailsPage.nVParticipantTimeIconOkButton);
        cHARMSParticipantDetailsPage.nVParticipantTimeIconOkButton.click();
        CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.nVParticipantCohortTextBox, "field", " Cohort in CHARMS Consent Page ");
        CharmsUtil.selectDropDownValue(cHARMSParticipantDetailsPage.nVParticipantConsentFormDropDown, "Field");
        CharmsUtil.labelHighlight(cHARMSParticipantDetailsPage.nVParticipantConsentVersionTextBox);
        CharmsUtil.clickOnElement(cHARMSParticipantDetailsPage.nVParticipantTimeIcon3);
        CharmsUtil.clickOnElement(cHARMSParticipantDetailsPage.nVParticipantGoToToday);
        CharmsUtil.selectDropDownValue(cHARMSParticipantDetailsPage.nVParticipantConsentTypeDropDown, "Adult");
        CharmsUtil.selectDropDownValue(cHARMSParticipantDetailsPage.nVParticipantResponseTypeDropDown, "Upload to Portal");
        CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.nVParticipantConsentStatusTextBox, "3", " Consent Status Family Member of the CHARMS Consent Page ");
        CharmsUtil.labelHighlight(cHARMSParticipantDetailsPage.nVParticipantConsentDateTextBox);
        CharmsUtil.clickOnElement(cHARMSParticipantDetailsPage.nVParticipantTimeIcon4);
        CharmsUtil.clickOnElement(cHARMSParticipantDetailsPage.nVParticipantGoToToday);
        CharmsUtil.labelHighlight(cHARMSParticipantDetailsPage.nVParticipantTimeIconOkButton);
        cHARMSParticipantDetailsPage.nVParticipantTimeIconOkButton.click();
        CharmsUtil.selectDropDownValue(cHARMSParticipantDetailsPage.nVParticipantCurrentPreviousDropDown, "Current");
        CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.nVParticipantStudyTextBox, "Fanconi", "Family Member of the CHARMS Consent Page ");
        CharmsUtil.selectDropDownValue(cHARMSParticipantDetailsPage.nVParticipantConsentAssentStatusDropDown, "Pending");
        CharmsUtil.selectDropDownValue(cHARMSParticipantDetailsPage.nVParticipantInterpreterUsedDropDown, "No");
        CharmsUtil.selectDropDownValue(cHARMSParticipantDetailsPage.nVParticipantFutureUseOfSpecimensAndDataByNIHDropDown, "Dead End by Study Manager");
        CharmsUtil.selectDropDownValue(cHARMSParticipantDetailsPage.nVParticipantFutureUseByCollaboratorsDropDown, "Dead End by PI");
        CharmsUtil.selectDropDownValue(cHARMSParticipantDetailsPage.nVParticipantFutureIdentifiableUseByCollaboratorsDropDown, "Dead End by PI");
        CharmsUtil.selectDropDownValue(cHARMSParticipantDetailsPage.nVParticipantReturnOfGeneticFindingsDropDown, "0");
        CharmsUtil.selectDropDownValue(cHARMSParticipantDetailsPage.nVParticipantParticipantAssentDropDown, "Not Needed");
        CharmsUtil.selectDropDownValue(cHARMSParticipantDetailsPage.nVParticipantParticipantConsentDropDown, "Required");
        CharmsUtil.labelHighlight(cHARMSParticipantDetailsPage.nVParticipantCallCompleteButton);
        cHARMSParticipantDetailsPage.nVParticipantCallCompleteButton.click();
        CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.nVParticipantConsentStatusTextBox, "5", " Consent Status Family Member of the CHARMS Consent Page ");
        CharmsUtil.clickOnElement(cHARMSParticipantDetailsPage.nVParticipantAttachmentButton);
        CharmsUtil.clickOnElement(cHARMSParticipantDetailsPage.nVParticipantChooseFileButton);
        cHARMSParticipantDetailsPage.nVParticipantChooseFileButton.sendKeys("/Users/jains18/git/CBIIT-Test-Automation/src/main/resources/Family Cohort Study Consent.pdf");
        CharmsUtil.clickOnElement(cHARMSParticipantDetailsPage.nVParticipantHardCopyOfConsentReceivedButton);
        softAssert.assertAll();
    }

    /**
     * Method to assert the Participant Detail Page: Assertion of the Participant Detail page using @param rowNumForAssertion
     */
    public void participantDetailPageAssertion(int rowNumForAssertion) {
        fanconiEligibilityQuestionnaireStepsImpl.participantDetailRecordClicked(rowNumForAssertion);
        fanconiEligibilityQuestionnaireStepsImpl.generalInformationAssertionOnParticipantDetailPage(rowNumForAssertion);
        fanconiEligibilityQuestionnaireStepsImpl.personalInformationAssertionOnParticipantDetailPage(rowNumForAssertion);
        fanconiEligibilityQuestionnaireStepsImpl.demographicsAssertionOnParticipantDetailPage(rowNumForAssertion);
        fanconiEligibilityQuestionnaireStepsImpl.contactInformationAssertionOnParticipantDetailPage(rowNumForAssertion);
        fanconiEligibilityQuestionnaireStepsImpl.proxyContactInformationAssertionOnParticipantDetailPage(rowNumForAssertion);
        softAssert.assertAll();
    }

    /**
     * Submits consent with the specified collection method for the provided row of data.
     *
     * @param collectionMethod The collection method to be used for submitting consent.
     * @param rowCount         The row number from which the data will be retrieved for submitting consent.
     */
    public void consent_is_submitted_with_collection_method(String collectionMethod, int rowCount) {
        String participantView = currentRow.get("ParticipantFirstName") + " " + currentRow.get("ParticipantMiddleName") + " " + currentRow.get("ParticipantLastName");
        String participantProxyView = currentRow.get("ProxyFirstName") + " " + currentRow.get("ProxyMiddleName") + " " + currentRow.get("ProxyLastName");
        currentRow = CharmsUtil.testManagerData(excelSheet, "FanconiScreener", rowCount);
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        CommonUtils.sleep(4000);
        CommonUtils.waitForVisibility(NativeView_SideDoor_Dashboard_Page.filterNavigatorTextBox);
        NativeView_SideDoor_Dashboard_Page.filterNavigatorTextBox.sendKeys("All Participant Details");
        CucumberLogUtils.logScreenshot();
        CommonUtils.sleep(3000);
        CommonUtils.clickOnElement(NativeView_SideDoor_Dashboard_Page.allParticipantDetailsLink);
        CommonUtils.sleep(3000);
        CommonUtils.switchToFrame(NativeView_SideDoor_Dashboard_Page.nativeViewiFrame);
        CommonUtils.sleep(2000);
        CucumberLogUtils.logScreenshot();
        if (currentRow.get("ParticipantFirstName") != null && !("").equals(currentRow.get("ParticipantFirstName"))) {
            CommonUtils.hoverOverElement(nativeViewCHARMSParticipantDetailsPage.dynamicRecordButtonLocator(participantView));
            CommonUtils.clickOnElement(NativeViewCHARMSDashboardPage.nativeViewnewScreenerReceivedLocator(participantView));
            CommonUtils.hoverOverElement(nativeViewCHARMSParticipantDetailsPage.dynamicRecordButtonLocator(currentRow.get("ParticipantFirstName") + " " + currentRow.get("ParticipantLastName")));
            CommonUtils.clickOnElement(NativeViewCHARMSDashboardPage.nativeViewnewScreenerReceivedLocator(currentRow.get("ParticipantFirstName") + " " + currentRow.get("ParticipantLastName")));
            CucumberLogUtils.logScreenshot();
        } else {
            CommonUtils.hoverOverElement(nativeViewCHARMSParticipantDetailsPage.dynamicRecordButtonLocator(participantProxyView));
            CommonUtils.clickOnElement(NativeViewCHARMSDashboardPage.nativeViewnewScreenerReceivedLocator(participantProxyView));
            CommonUtils.hoverOverElement(nativeViewCHARMSParticipantDetailsPage.dynamicRecordButtonLocator(currentRow.get("ProxyFirstName") + " " + currentRow.get("ProxyLastName")));
            CommonUtils.clickOnElement(NativeViewCHARMSDashboardPage.nativeViewnewScreenerReceivedLocator(currentRow.get("ProxyFirstName") + " " + currentRow.get("ProxyLastName")));
            CucumberLogUtils.logScreenshot();
        }
        CommonUtils.sleep(1800);
        if (CommonUtils.isElementDisplayed(nativeViewCHARMSDashboardPage.rasStudyOpenRecordButton)) {
            CucumberLogUtils.logScreenshot();
            CommonUtils.clickOnElement(nativeViewCHARMSDashboardPage.rasStudyOpenRecordButton);
        }
        CommonUtils.sleep(2000);
        RAS_Common_Methods.submitParticipantForReviewAndEligibility();
        /**
         * BEGINNING: CONSENT FLOW PROCESS
         */
        JavascriptUtils.scrollIntoView(nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsConsentsTab);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsConsentsTab);
        CommonUtils.hoverOverElement(nativeViewCHARMSParticipantDetailsPage.consentStatusText);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsConsentsPreviewButton);
        CommonUtils.waitForVisibility(nativeViewCHARMSDashboardPage.rasStudyOpenRecordButton);
        CommonUtils.sleep(800);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(nativeViewCHARMSDashboardPage.rasStudyOpenRecordButton);
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeCalendar);
        CucumberLogUtils.logScreenshot();
        CucumberLogUtils.scenario.log("* * * * CONSENT CALL SCHEDULED TIME * * * *");
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeCalendar);
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeTodayButton);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeTodayButton);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeAcceptButton);
        CucumberLogUtils.scenario.log("* * * * CONSENT CALL DATE * * * *");
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleDateCalendar);
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeTodayButton);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeTodayButton);
        CucumberLogUtils.scenario.log("* * * * RESPONSE TYPE * * * *");
        CommonUtils.selectDropDownValue(collectionMethod, nativeViewCHARMSParticipantConsentPage.rasStudyConsentCollectionMethodDropDown);
        CucumberLogUtils.scenario.log("* * * * CONSENT CALL VERSION * * * *");
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleVersionCalendarButton);
        CommonUtils.waitForClickability(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleVersionCalendarButton);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleVersionCalendarButton);
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeTodayButton);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeTodayButton);
        CucumberLogUtils.scenario.log("* * * * CONSENT DATE * * * *");
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentDateCalendar);
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeTodayButton);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeTodayButton);
        CucumberLogUtils.scenario.log("* * * * CONSENTED BY * * * *");
        CommonUtils.waitForClickability(nativeViewCHARMSParticipantConsentPage.rasStudyConsentByTextBox);
        CommonUtils.sendKeys(nativeViewCHARMSParticipantConsentPage.rasStudyConsentByTextBox, CHARMSRASScreenerConstants.CONSENTED_BY_USER_NAME);
        CommonUtils.sendKeys(nativeViewCHARMSParticipantConsentPage.rasStudyConsentByTextBox, Keys.ENTER);
        CommonUtils.sleep(800);
        if (!collectionMethod.equalsIgnoreCase("iMed")) {
            CommonUtils.sleep(800);
            CucumberLogUtils.scenario.log("* * * * COPY OF CONSENT/ASSENT PROVIDED PROVIDED BEFORE SIGNING * * * *");
            CommonUtils.waitForClickability(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCopyOfConsentAssentProvidedDropDown);
            CommonUtils.selectDropDownValue("Yes", nativeViewCHARMSParticipantConsentPage.rasStudyConsentCopyOfConsentAssentProvidedDropDown);
            CommonUtils.sleep(800);
            CucumberLogUtils.scenario.log("* * * * PROTOCOL DISCUSSED IN PRIVATE SETTING * * * *");
            CommonUtils.selectDropDownValue("Yes", nativeViewCHARMSParticipantConsentPage.rasStudyConsentProtocolDiscussedInPrivateSettingDropDown);
            CommonUtils.sleep(800);
            CucumberLogUtils.scenario.log("* * * * PARTICIPANT VERBALIZED UNDERSTANDING OF STUDY CONDITIONS AND PARTICIPATION * * * *");
            CommonUtils.selectDropDownValue("Yes", nativeViewCHARMSParticipantConsentPage.rasStudyConsentParticipantVerbalizedUnderstandingOfStudyConditionsAndParticipationDropDown);
            CommonUtils.sleep(800);
            CucumberLogUtils.scenario.log("* * * * QUESTIONS ADDRESSED BEFORE SIGNING * * * *");
            CommonUtils.selectDropDownValue("Yes", nativeViewCHARMSParticipantConsentPage.rasStudyConsentQuestionsAddressedBeforeSigningDropDown);
            CucumberLogUtils.logScreenshot();
        }
        CommonUtils.sleep(800);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallCompleteButton);
        CommonUtils.sleep(1800);
        if (!collectionMethod.equalsIgnoreCase("iMed")) {
            CucumberLogUtils.scenario.log("* * * * CONSENT/ASSENT OBTAINED BEFORE STUDY PROCEDURES * * * *");
            CommonUtils.selectDropDownValue("Yes", nativeViewCHARMSParticipantConsentPage.rasStudyConsentConsentAssentObtainedBeforeStudyProceduresDropDown);
            CommonUtils.sleep(800);
            CucumberLogUtils.scenario.log("* * * * COPY OF SIGNED/DATED CONSENT/ASSENT GIVEN TO PARTICIPANT * * * *");
            CommonUtils.selectDropDownValue("Yes", nativeViewCHARMSParticipantConsentPage.rasStudyConsentCopyOfSignedDatedConsentAssentGivenToParticipantDropDown);
        } else {
            CommonUtils.selectDropDownValue("Yes", nativeViewCHARMSParticipantConsentPage.rasStudyConsentFutureSpecimensAndDataDropDown);
            CommonUtils.sleep(800);
            CommonUtils.selectDropDownValue("Yes", nativeViewCHARMSParticipantConsentPage.rasStudyConsentFutureUseCollaboratorsDropDown);
            CommonUtils.sleep(800);
            CommonUtils.selectDropDownValue("Yes", nativeViewCHARMSParticipantConsentPage.rasStudyConsentFutureIdentifiableUseCollaboratorsDropDown);
            CommonUtils.sleep(800);
            CucumberLogUtils.logScreenshot();
        }
        CommonUtils.waitForClickability(nativeViewCHARMSParticipantConsentPage.rasStudyConsentAddFileButton);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentAddFileButton);
        CucumberLogUtils.logScreenshot();
        CommonUtils.sleep(8000);
        JavascriptUtils.uploadFileToHiddenFieldWithInputTag(nativeViewCHARMSParticipantConsentPage.rasStudyConsentChoseFileButton, CHARMS_Data_File_Path_Constants.FAMILY_COHORT_STUDY_PDF_PATH);
        CommonUtils.sleep(2000);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentChoseFileCloseButton);
        CommonUtils.waitForClickability(nativeViewCHARMSParticipantConsentPage.rasStudyConsentHardCopyReceivedButton);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentHardCopyReceivedButton);
        CommonUtils.waitForClickability(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCompletedConsentButton);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCompletedConsentButton);
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantConsentPage.rasStudyConsentParticipantRecordsReadyToProgressMessage);
        softAssert.assertEquals(nativeViewCHARMSParticipantConsentPage.rasStudyConsentParticipantRecordsReadyToProgressMessage.getText(), CHARMSRASScreenerConstants.PARTICIPANT_READY_TO_PROGRESS_TEXT, "---- VERIFYING PARTICIPANT RECORD READY TO PROGRESS MESSAGE ----");
        softAssert.assertEquals(nativeViewCHARMSParticipantConsentPage.rasStudyConsentConsentRecordCompletedMessageMessage.getText(), CHARMSRASScreenerConstants.CONSENT_RECORD_COMPLETED_TEXT, "---- VERIFYING CONSENT RECORD COMPLETED AND FAMILY RECORD IS NOW ACTIVE! MESSAGE ----");
        CommonUtils.sleep(1800);
        CucumberLogUtils.logScreenshot();
        RAS_All_Steps.nativeViewStudyTeamMemberLogsOut();
    }

    /**
     * Submits consent with the provided collection method for a participant.
     *
     * @param collectionMethod The method used for collecting consent
     */
    public void consent_is_submitted_with_collection_method(String collectionMethod) {
        currentRow = CharmsUtil.testManagerData(excelSheet, "FanconiScreener", 0);
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        CommonUtils.sleep(4000);
        CommonUtils.waitForVisibility(NativeView_SideDoor_Dashboard_Page.filterNavigatorTextBox);
        NativeView_SideDoor_Dashboard_Page.filterNavigatorTextBox.sendKeys("All Participant Details");
        CucumberLogUtils.logScreenshot();
        CommonUtils.sleep(3000);
        CommonUtils.clickOnElement(NativeView_SideDoor_Dashboard_Page.allParticipantDetailsLink);
        CommonUtils.sleep(3000);
        CommonUtils.switchToFrame(NativeView_SideDoor_Dashboard_Page.nativeViewiFrame);
        CommonUtils.sleep(2000);
        CucumberLogUtils.logScreenshot();
        CommonUtils.hoverOverElement(nativeViewCHARMSParticipantDetailsPage.dynamicRecordButtonLocator(currentRow.get("ParticipantFirstName") + " " + currentRow.get("ParticipantLastName")));
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(NativeViewCHARMSDashboardPage.nativeViewnewScreenerReceivedLocator(currentRow.get("ParticipantFirstName") + " " + currentRow.get("ParticipantLastName")));
        CommonUtils.sleep(1800);
        if (CommonUtils.isElementDisplayed(nativeViewCHARMSDashboardPage.rasStudyOpenRecordButton)) {
            CucumberLogUtils.logScreenshot();
            CommonUtils.clickOnElement(nativeViewCHARMSDashboardPage.rasStudyOpenRecordButton);
        }
        CommonUtils.sleep(2000);
        RAS_Common_Methods.submitParticipantForReviewAndEligibility();
        /**
         * BEGINNING: CONSENT FLOW PROCESS
         */
        JavascriptUtils.scrollIntoView(nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsConsentsTab);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsConsentsTab);
        CommonUtils.hoverOverElement(nativeViewCHARMSParticipantDetailsPage.consentStatusText);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsConsentsPreviewButton);
        CommonUtils.waitForVisibility(nativeViewCHARMSDashboardPage.rasStudyOpenRecordButton);
        CommonUtils.sleep(800);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(nativeViewCHARMSDashboardPage.rasStudyOpenRecordButton);
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeCalendar);
        CucumberLogUtils.logScreenshot();
        CucumberLogUtils.scenario.log("* * * * CONSENT CALL SCHEDULED TIME * * * *");
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeCalendar);
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeTodayButton);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeTodayButton);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeAcceptButton);
        CucumberLogUtils.scenario.log("* * * * CONSENT CALL DATE * * * *");
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleDateCalendar);
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeTodayButton);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeTodayButton);
        CucumberLogUtils.scenario.log("* * * * RESPONSE TYPE * * * *");
        CommonUtils.selectDropDownValue(collectionMethod, nativeViewCHARMSParticipantConsentPage.rasStudyConsentCollectionMethodDropDown);
        CucumberLogUtils.scenario.log("* * * * CONSENT CALL VERSION * * * *");
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleVersionCalendarButton);
        CommonUtils.waitForClickability(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleVersionCalendarButton);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleVersionCalendarButton);
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeTodayButton);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeTodayButton);
        CucumberLogUtils.scenario.log("* * * * CONSENT DATE * * * *");
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentDateCalendar);
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeTodayButton);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeTodayButton);
        CucumberLogUtils.scenario.log("* * * * CONSENTED BY * * * *");
        CommonUtils.waitForClickability(nativeViewCHARMSParticipantConsentPage.rasStudyConsentByTextBox);
        CommonUtils.sendKeys(nativeViewCHARMSParticipantConsentPage.rasStudyConsentByTextBox, CHARMSRASScreenerConstants.CONSENTED_BY_USER_NAME);
        CommonUtils.sendKeys(nativeViewCHARMSParticipantConsentPage.rasStudyConsentByTextBox, Keys.ENTER);
        CommonUtils.sleep(800);
        if (!collectionMethod.equalsIgnoreCase("iMed")) {
            CommonUtils.sleep(800);
            CucumberLogUtils.scenario.log("* * * * COPY OF CONSENT/ASSENT PROVIDED PROVIDED BEFORE SIGNING * * * *");
            CommonUtils.waitForClickability(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCopyOfConsentAssentProvidedDropDown);
            CommonUtils.selectDropDownValue("Yes", nativeViewCHARMSParticipantConsentPage.rasStudyConsentCopyOfConsentAssentProvidedDropDown);
            CommonUtils.sleep(800);
            CucumberLogUtils.scenario.log("* * * * PROTOCOL DISCUSSED IN PRIVATE SETTING * * * *");
            CommonUtils.selectDropDownValue("Yes", nativeViewCHARMSParticipantConsentPage.rasStudyConsentProtocolDiscussedInPrivateSettingDropDown);
            CommonUtils.sleep(800);
            CucumberLogUtils.scenario.log("* * * * PARTICIPANT VERBALIZED UNDERSTANDING OF STUDY CONDITIONS AND PARTICIPATION * * * *");
            CommonUtils.selectDropDownValue("Yes", nativeViewCHARMSParticipantConsentPage.rasStudyConsentParticipantVerbalizedUnderstandingOfStudyConditionsAndParticipationDropDown);
            CommonUtils.sleep(800);
            CucumberLogUtils.scenario.log("* * * * QUESTIONS ADDRESSED BEFORE SIGNING * * * *");
            CommonUtils.selectDropDownValue("Yes", nativeViewCHARMSParticipantConsentPage.rasStudyConsentQuestionsAddressedBeforeSigningDropDown);
            CucumberLogUtils.logScreenshot();
        }
        CommonUtils.sleep(800);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallCompleteButton);
        CommonUtils.sleep(1800);
        if (!collectionMethod.equalsIgnoreCase("iMed")) {
            CucumberLogUtils.scenario.log("* * * * CONSENT/ASSENT OBTAINED BEFORE STUDY PROCEDURES * * * *");
            CommonUtils.selectDropDownValue("Yes", nativeViewCHARMSParticipantConsentPage.rasStudyConsentConsentAssentObtainedBeforeStudyProceduresDropDown);
            CommonUtils.sleep(800);
            CucumberLogUtils.scenario.log("* * * * COPY OF SIGNED/DATED CONSENT/ASSENT GIVEN TO PARTICIPANT * * * *");
            CommonUtils.selectDropDownValue("Yes", nativeViewCHARMSParticipantConsentPage.rasStudyConsentCopyOfSignedDatedConsentAssentGivenToParticipantDropDown);
        } else {
            CommonUtils.selectDropDownValue("Yes", nativeViewCHARMSParticipantConsentPage.rasStudyConsentFutureSpecimensAndDataDropDown);
            CommonUtils.sleep(800);
            CommonUtils.selectDropDownValue("Yes", nativeViewCHARMSParticipantConsentPage.rasStudyConsentFutureUseCollaboratorsDropDown);
            CommonUtils.sleep(800);
            CommonUtils.selectDropDownValue("Yes", nativeViewCHARMSParticipantConsentPage.rasStudyConsentFutureIdentifiableUseCollaboratorsDropDown);
            CommonUtils.sleep(800);
            CucumberLogUtils.logScreenshot();
        }
        CommonUtils.waitForClickability(nativeViewCHARMSParticipantConsentPage.rasStudyConsentAddFileButton);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentAddFileButton);
        CucumberLogUtils.logScreenshot();
        CommonUtils.sleep(8000);
        JavascriptUtils.uploadFileToHiddenFieldWithInputTag(nativeViewCHARMSParticipantConsentPage.rasStudyConsentChoseFileButton, CHARMS_Data_File_Path_Constants.FAMILY_COHORT_STUDY_PDF_PATH);
        CommonUtils.sleep(2000);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentChoseFileCloseButton);
        CommonUtils.waitForClickability(nativeViewCHARMSParticipantConsentPage.rasStudyConsentHardCopyReceivedButton);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentHardCopyReceivedButton);
        CommonUtils.waitForClickability(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCompletedConsentButton);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCompletedConsentButton);
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantConsentPage.rasStudyConsentParticipantRecordsReadyToProgressMessage);
        softAssert.assertEquals(nativeViewCHARMSParticipantConsentPage.rasStudyConsentParticipantRecordsReadyToProgressMessage.getText(), CHARMSRASScreenerConstants.PARTICIPANT_READY_TO_PROGRESS_TEXT, "---- VERIFYING PARTICIPANT RECORD READY TO PROGRESS MESSAGE ----");
        softAssert.assertEquals(nativeViewCHARMSParticipantConsentPage.rasStudyConsentConsentRecordCompletedMessageMessage.getText(), CHARMSRASScreenerConstants.CONSENT_RECORD_COMPLETED_TEXT, "---- VERIFYING CONSENT RECORD COMPLETED AND FAMILY RECORD IS NOW ACTIVE! MESSAGE ----");
        CommonUtils.sleep(1800);
        CucumberLogUtils.logScreenshot();
        RAS_All_Steps.nativeViewStudyTeamMemberLogsOut();
    }

    /**
     * Logs in to Native View and navigates to the participant's CGB IIQ record.
     */
    public void study_team_navigate_to_participant_s_cgb_iiq_record() {
        currentRow = CharmsUtil.testManagerData(excelSheet, "FanconiScreener", 0);
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        CommonUtils.sleep(4000);
        CommonUtils.waitForVisibility(NativeView_SideDoor_Dashboard_Page.filterNavigatorTextBox);
        NativeView_SideDoor_Dashboard_Page.filterNavigatorTextBox.sendKeys("All Participant Details");
        CucumberLogUtils.logScreenshot();
        CommonUtils.sleep(3000);
        CommonUtils.clickOnElement(NativeView_SideDoor_Dashboard_Page.allParticipantDetailsLink);
        CommonUtils.sleep(3000);
        CommonUtils.switchToFrame(NativeView_SideDoor_Dashboard_Page.nativeViewiFrame);
        CommonUtils.sleep(2000);
        CucumberLogUtils.logScreenshot();
        CommonUtils.hoverOverElement(nativeViewCHARMSParticipantDetailsPage.dynamicRecordButtonLocator(currentRow.get("ParticipantFirstName") + " " + currentRow.get("ParticipantLastName")));
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(NativeViewCHARMSDashboardPage.nativeViewnewScreenerReceivedLocator(currentRow.get("ParticipantFirstName") + " " + currentRow.get("ParticipantLastName")));
        CommonUtils.sleep(1800);
        if (CommonUtils.isElementDisplayed(nativeViewCHARMSDashboardPage.rasStudyOpenRecordButton)) {
            CucumberLogUtils.logScreenshot();
            CommonUtils.clickOnElement(nativeViewCHARMSDashboardPage.rasStudyOpenRecordButton);
        }
        CommonUtils.sleep(2000);
        JavascriptUtils.scrollIntoView(nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsCGBIIQTab);
        nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsCGBIIQTab.click();
        CommonUtils.hoverOverElement(locateByXpath("//td[normalize-space()='CGB Individual Information Questionnaire']"));
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantDetailsPage.cgbIiqPreviewButton);
        nativeViewCHARMSParticipantDetailsPage.cgbIiqPreviewButton.click();
        CommonUtils.sleep(800);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(nativeViewCHARMSDashboardPage.rasStudyOpenRecordButton);
        CommonUtils.sleep(800);
        verify_fields_in_native_view_cgb_iqq_record();
    }

    /**
     * Method for verifying CGB IIQ record fields in Native View.
     */
    public void verify_fields_in_native_view_cgb_iqq_record() {
        softAssert.assertEquals(nativeViewCGBIIQPage.participantsCityOfBirthTextField.getDomAttribute("value"), iiq_TestDataManager.whereWereYouBornCityTextBox, "* * * * * CGB IIQ - MISMATCH IN \"Participants city of birth\" * * * * *");
        softAssert.assertEquals(nativeViewCGBIIQPage.participantsStateProvidenceOfTextField.getDomAttribute("value"), iiq_TestDataManager.whereWereYouBornStateTextBox, "* * * * * CGB IIQ - MISMATCH IN \"Participants state/province of birth\" * * * * *");
        softAssert.assertEquals(nativeViewCGBIIQPage.participantsCountryOfBirthTextField.getDomAttribute("value"), iiq_TestDataManager.whereWereYouBornCountryTextBox, "* * * * * CGB IIQ - MISMATCH IN \"Participants country of birth\" * * * * *");
        softAssert.assertTrue(nativeViewCGBIIQPage.participantsBirthLocationUnknownCheckbox.getDomAttribute("value").equals("true"), "* * * * * CGB IIQ - MISMATCH IN \"Birth location unknown\" * * * * *");
        CommonUtils.sleep(800);
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.scrollIntoView(nativeViewCGBIIQPage.participantsBioMomAncestryNonEdit);
        softAssert.assertEquals(nativeViewCGBIIQPage.participantsBioMomAncestryNonEdit, iiq_TestDataManager.mostPeopleHaveAncestorsCheckBox, "* * * * * CGB IIQ - MISMATCH IN \"Biological mothers ancestral background\" * * * * *");
        softAssert.assertEquals(nativeViewCGBIIQPage.participantsBioDadAncestryNonEdit, iiq_TestDataManager.whatIsYourBiologicalFatherAncestralBackgroundTextBox, "* * * * * CGB IIQ - MISMATCH IN \"Biological mothers ancestral background\" * * * * *");
        softAssert.assertEquals(nativeViewCGBIIQPage.familysReligiousBackgroundNonEdit, iiq_TestDataManager.whatIsYourFammilysReligiousBackgroundCheckBox, "* * * * * CGB IIQ - MISMATCH IN \"Family's religous background\" * * * * *");
        RAS_Common_Methods.softAssertDropDownValueIsSelected(nativeViewCGBIIQPage.raisedByNonBioParentDropdown, iiq_TestDataManager.wereYouRaisedPrimarilyRadioButton, "* * * * * CGB IIQ - MISMATCH IN \"Was the participant raised by someone other than their own bio parent?\" * * * * *");
        RAS_Common_Methods.softAssertDropDownValueIsSelected(nativeViewCGBIIQPage.isTheParticipantOfAshkenaziJewishDescentDropdown, iiq_TestDataManager.areYouOfAshkenazyJewishDescentRadioButton, "* * * * * CGB IIQ - MISMATCH IN \"Is the participant of Ashkenazi jewish descent?\" * * * * *");
        RAS_Common_Methods.softAssertDropDownValueIsSelected(nativeViewCGBIIQPage.maritalStatusDropdown, iiq_TestDataManager.whatIsYourMaritalStatusCheckBox, "* * * * * CGB IIQ - MISMATCH IN \"Participant's marital status\" * * * * *");
        RAS_Common_Methods.softAssertDropDownValueIsSelected(nativeViewCGBIIQPage.householdIncomeDropdown, iiq_TestDataManager.whatIsTheTotalCombinedYearlyIncomeRadioButton.split(", or")[0], "* * * * * CGB IIQ - MISMATCH IN \"Total household income in the last 12 months\" * * * * *");
        RAS_Common_Methods.softAssertDropDownValueIsSelected(nativeViewCGBIIQPage.participantsHighestLevelOfSchoolingDropdown, iiq_TestDataManager.whatIsTheHighestLevelOfSchoolingRadioButton, "* * * * * CGB IIQ - MISMATCH IN \"Participants highest level of schooling\" * * * * *");
        softAssert.assertEquals(nativeViewCGBIIQPage.participantsUsualJobOrMainOccupationTextArea.getText(), iiq_TestDataManager.whatHasBeenYourUsualJobOther, "* * * * * CGB IIQ - MISMATCH IN \"Participants usual job or main occupation during their lifetime\" * * * * *");
        RAS_Common_Methods.softAssertDropDownValueIsSelected(nativeViewCGBIIQPage.doesTheParticipantHaveHealthInsuranceDropdown, iiq_TestDataManager.doYouCurrentlyHaveHealthInsuranceRadioButton, "* * * * * CGB IIQ - MISMATCH IN \"Does the participant have health insurance?\" * * * * *");
        CucumberLogUtils.logScreenshot();
    }
}