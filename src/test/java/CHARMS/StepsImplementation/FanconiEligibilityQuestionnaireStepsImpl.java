package CHARMS.StepsImplementation;

import CHARMS.Constants.CHARMS_Data_File_Path_Constants;
import CHARMS.NativeView.Pages.CHARMSParticipantDetailsPage;
import CHARMS.Utils.CharmsUtil;
import APPS_COMMON.PageInitializers.PageInitializer;
import APPS_COMMON.Pages.NativeView_SideDoor_Dashboard_Page;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.TestProperties;
import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import static com.nci.automation.web.TestProperties.getFanconiUrl;
import static com.nci.automation.web.TestProperties.getNCISPUrl;

public class FanconiEligibilityQuestionnaireStepsImpl extends PageInitializer {
    String referralValue;
    String excelSheet = CHARMS_Data_File_Path_Constants.FANCONI_SCREENER_DATA;
    Map<String, String> currentRow;
    Map<String, String> currentRowForCancerHistory;
    Map<String, String> currentRowForAnotherStudy;
    SoftAssert softAssert = new SoftAssert();

    /**
     * Login to the Nativeview to run the reset accounts script for the Fanconi screener accounts
     */
    public void resetTestAccountSignIn()  {
        if (TestProperties.ENV.equals("test")) {
            WebDriverUtils.webDriver.get(
                    "https://service-test.nci.nih.gov/now/nav/ui/classic/params/target/sys_script_fix.do%3Fsys_id%3Db1cf5c0087d0d610ad46326d3fbb3507%26sysparm_record_target%3Dsys_script_fix%26sysparm_record_row%3D2%26sysparm_record_rows%3D1263%26sysparm_record_list%3DORDERBYDESCsys_updated_on");
            CommonUtils.sleep(2000);
        } else if (TestProperties.ENV.equals("dev2")) {
            WebDriverUtils.webDriver.get(
                    "https://service-dev2.nci.nih.gov/now/nav/ui/classic/params/target/sys_script_fix.do%3Fsys_id%3Db1cf5c0087d0d610ad46326d3fbb3507%26sysparm_record_target%3Dsys_script_fix%26sysparm_record_row%3D2%26sysparm_record_rows%3D1263%26sysparm_record_list%3DORDERBYDESCsys_updated_on");
            CommonUtils.sleep(2000);
        }
    }

    /**
     * Login to the Nativeview and run the reset accounts script for the Fanconi screener accounts
     */
    public void resetTestAccount() {
        if (TestProperties.ENV.equals("test")) {
            CommonUtils.sleep(100);
            CommonUtils.switchToFrame(NativeView_SideDoor_Dashboard_Page.nativeViewiFrame);
            CommonUtils.waitForVisibility(testAccountResetPage.nativeViewRunFixScriptButton);
            CommonUtils.sleep(500);
            testAccountResetPage.nativeViewRunFixScriptButton.click();
            CommonUtils.sleep(500);
            CommonUtils.waitForVisibility(testAccountResetPage.nativeViewProceedInBackgroundButton);
            testAccountResetPage.nativeViewProceedInBackgroundButton.click();
            CommonUtils.sleep(500);
            CommonUtils.waitForVisibility(testAccountResetPage.nativeViewCloseButton);
            testAccountResetPage.nativeViewCloseButton.click();
            CommonUtils.sleep(300);
        }
    }

    /**
     * LogOut of the account profile in Nativeview
     */
    public void nativeViewProfilelogOut() {
        WebDriverUtils.webDriver.get(getFanconiUrl());
        CommonUtils.waitForVisibility(oktaLoginPage.agreeBtn);
        oktaLoginPage.agreeBtn.click();
        CommonUtils.waitForVisibility(fanconiLoginPage.profileDropDownButton);
        fanconiLoginPage.profileDropDownButton.click();
        CommonUtils.waitForVisibility(fanconiLoginPage.profileLogOutButton);
        fanconiLoginPage.profileLogOutButton.click();
        CommonUtils.sleep(500);
    }

    /**
     * Method to click Eligibility Questionnaire link
     */
    public void eligibilityQuestionnairelinkClicked() {
        Set<String> allWindowHandles = WebDriverUtils.webDriver.getWindowHandles();
        for (String currentWindow : allWindowHandles) {
            WebDriverUtils.webDriver.switchTo().window(currentWindow);
            CommonUtils.sleep(2000);
        }
        JavascriptUtils.scrollIntoView(fanconiEligibilityQuestionnairePage.nextButton);
        CommonUtils.waitForVisibility(fanconiEligibilityQuestionnairePage.nextButton);
    }

    /**
     * Method to click Initial pages with Information on Study related
     */
    public void initialStudyRelatedPageClicked() {
        for (int i = 1; i <= 6; ++i) {
            CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
        }
    }

    /**
     * Method to submit 'Are you completing this questionnaire for someone else?or Yourself
     */
    public void participantSubmission() {
        CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.participantCompletingRBtonList,
                currentRow.get("AreYouCompletingThisQuestionnaireForSomeoneElse"));
        CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
    }

    /**
     * Method to submit the Participant and Proxy Name details
     */
    public void participantNameSelected() {
        if (currentRow.get("AreYouCompletingThisQuestionnaireForSomeoneElse").contentEquals("Yes, I am completing this form for someone else")) {
            CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.firstNameByProxyTextBox, currentRow.get("ProxyFirstName"));
            CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.middleNameByProxyTextBox,
                    currentRow.get("ProxyMIddleName"));
            CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.lastNameByProxyTextBox,
                    currentRow.get("ProxyLastName"));
            CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
            CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.proxyFirstNameTextBox,
                    currentRow.get("WhatIsYourNameFirstName"));
            CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.proxyMiddleNameTextBox,
                    currentRow.get("WhatIsYourNameMiddleName"));
            CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.proxyLastNameTextBox,
                    currentRow.get("WhatIsYourNameLastName"));
            CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
            CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList,
                    currentRow.get("WhatIsYourRelationshipToParticipant"));
            if (currentRow.get("WhatIsYourRelationshipToParticipant").contentEquals("Other")) {
                CharmsUtil.sendKeysToElement(
                        fanconiEligibilityQuestionnairePage.yourRelationshipToParticipantOtherTextBox,
                        currentRow.get("WhatIsYourRelationshipToParticipantOther"));
            }
            CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
            CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList,
                    currentRow.get("AreYouTheLegalGuardianOfParticipant"));
            CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
        } else {
            CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.firstNameTextBox,
                    currentRow.get("ParticipantFirstName"));
            CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.middleNameTextBox,
                    currentRow.get("ParticipantMiddleName"));
            CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.lastNameTextBox,
                    currentRow.get("ParticipantLastName"));
            CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
        }
    }

    /**
     * Method to submit Participant Basic Information- DOB,Gender by Birth
     */
    public void participantBasicInformationSelected() {
        CommonUtils.waitForVisibility(fanconiEligibilityQuestionnairePage.calendarMonthDropDown);
        CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.calendarMonthDropDown,
                currentRow.get("DOBMonth"));
        fanconiEligibilityQuestionnairePage.calendarYearTextBox.clear();
        CommonUtils.sleep(300);
        CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.calendarYearTextBox,
                currentRow.get("DOBYear"));
        CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.calendarDayOption);
        CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
        CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.sexAssignedRBtonList,
                currentRow.get("SexAssigned"));
        CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
    }

    /**
     * Method to submit Participant Current Gender and Pronouns
     */
    public void participantGenderInformationSelected() {
        if (currentRow.get("CurrentGender").isEmpty()) {
        } else {
            CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.currentGenderRBtonList,
                    currentRow.get("CurrentGender"));
            if (currentRow.get("CurrentGender").contentEquals("I use a different term:")) {
                CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.currentGenderDifferentTermTextBox,
                        currentRow.get("CurrentGenderOther"));
            }
            CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
            if (currentRow.get("Pronouns").isEmpty()) {
            } else {
                CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.pronounsRBtonList,
                        currentRow.get("Pronouns"));
                if (currentRow.get("Pronouns").contentEquals("I use a different term:")) {
                    CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.pronounsDifferentTermTextBox,
                            currentRow.get("PronounsOther"));
                }
                CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
            }
        }
    }

    /**
     * Method to add the Country and Address details
     */
    public void participantCountrySelected() {
        if (currentRow.get("AreYouCompletingThisQuestionnaireForSomeoneElse")
                .contentEquals("Yes, I am completing this form for someone else")) {
            CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.countrylivedProxyDropDownList,
                    currentRow.get("CountryLived"));
            CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
            if (currentRow.get("CountryLived").contentEquals("United States of America")) {
                CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.streetProxyTextBox,
                        currentRow.get("StreetAddress1"));
                CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.additionalStreetProxyTextBox,
                        currentRow.get("StreetAddress2"));
                CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.cityProxyTextBox,
                        currentRow.get("City"));
                CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.stateProxyTextBox,
                        currentRow.get("State"));
                CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.zipCodeProxyTextBox,
                        currentRow.get("ZipCode"));
                CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
            }
        } else {
            CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.countrylivedDropDownList,
                    currentRow.get("CountryLived"));
            CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
            if (currentRow.get("CountryLived").contentEquals("United States of America")) {
                CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.streetTextBox,
                        currentRow.get("StreetAddress1"));
                CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.additionalStreetTextBox,
                        currentRow.get("StreetAddress2"));
                CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.cityTextBox,
                        currentRow.get("City"));
                CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.stateTextBox,
                        currentRow.get("State"));
                CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.zipCodeTextBox,
                        currentRow.get("ZipCode"));
                CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
            }
        }
    }

    /**
     * Method to provide the Email Address
     */
    public void emailAddressAdded() {
        CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.emailAddressTextBox,
                currentRow.get("EmailAddress"));
        CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
        CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.confirmEmailAddressTextBox,
                currentRow.get("ConfirmationEmailAddress"));
        CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
    }

    /**
     * Method to submit the participant in the NIH Inherited Bone Marrow Failure Syndrome study?
     */
    public void participatedInBoneMarrowFailureStudy() {
        CharmsUtil.selectRadioButtonValue(
                fanconiEligibilityQuestionnairePage.participateBoneMarrowSyndromeStudyRBtonList,
                currentRow.get("AreOrWereYouAParticipanInNIHInheritedBoneMarrowFailuresyndromeStudy"));
        CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
    }

    /**
     * Method to submit if Participant is adopted
     */
    public void IsParticipantAdopted() {
        CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.adoptedRBtonList,
                currentRow.get("AreYouAdopted"));
        CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
    }

    /**
     * Method to submit the phone details
     */
    public void phoneNumbersAdded() {
        CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.homePhoneNumberTextBox,
                currentRow.get("HomePhoneNumber"));
        CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.cellPhoneNumberTextBox,
                currentRow.get("CellPhoneNumber"));
        CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.workPhoneNumberTextBox,
                currentRow.get("WorkPhoneNumber"));
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
    }

    /**
     * Method to submit the Ethnicity details
     */
    public void ethnicitySelected() {
        CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.ethnicityRBtonList,
                currentRow.get("Ethnicity"));
        CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
    }

    /**
     * Method to submit the Race details
     */
    public void raceSelected() {
        for (int j = 1; j <= 6; ++j) {
            if (currentRow.get("Race" + j) != null) {
                CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.raceRBtonList,
                        currentRow.get("Race" + j));
            }
        }
        if (currentRow.get("OtherRace") != null) {
            CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.otherRaceNameTextBox,
                    currentRow.get("OtherRace"));
        }
        CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
    }

    /**
     * Method to submit Have you ever participated in a Fanconi anemia study at
     * another medical institution, university, government agency or other site?
     */
    public void IsOtherMedicalInstitutionSelected() {
        CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList,
                currentRow.get("HaveYouEverParticipatedInFanconiAnemiaStudyAtAnotherMedicalInstitution"));
        CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
    }

    /**
     * Method to submit Specifications of Another Medical Institution selected
     */
    public void otherMedicalInstitutionSelected() {
        if (currentRow.get("HaveYouEverParticipatedInFanconiAnemiaStudyAtAnotherMedicalInstitution")
                .contentEquals("Yes")) {
            CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList,
                    currentRow.get("SpecifyParticipationInOtherStudies0"));
            fanconiEligibilityQuestionnairePage.commonRBtonList.get(1).click();
            CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.fanconiAnemiaResearcStudyAt1TextBox,
                    currentRow.get("SpecifyParticipationInOtherStudiesDetails1"));
            fanconiEligibilityQuestionnairePage.commonRBtonList.get(2).click();
            CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.fanconiAnemiaResearcStudyAt2TextBox,
                    currentRow.get("SpecifyParticipationInOtherStudiesDetails2"));
            fanconiEligibilityQuestionnairePage.commonRBtonList.get(3).click();
            CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.fanconiAnemiaResearcStudyOther1TextBox,
                    currentRow.get("SpecifyParticipationInOtherStudiesDetails3"));
            fanconiEligibilityQuestionnairePage.commonRBtonList.get(4).click();
            CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.fanconiAnemiaResearcStudyOther2TextBox,
                    currentRow.get("SpecifyParticipationInOtherStudiesDetails4"));
            fanconiEligibilityQuestionnairePage.commonRBtonList.get(5).click();
            CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.fanconiAnemiaResearcStudyOther3TextBox,
                    currentRow.get("SpecifyParticipationInOtherStudiesDetails5"));
            CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
        }
    }

    /**
     * Method to submit additional information regarding participation in other studies.
     */
    public void otherMedicalInstitutionDetailsAdded() {
        int k = 0;
        int j = 1;
        if (currentRow.get("HaveYouEverParticipatedInFanconiAnemiaStudyAtAnotherMedicalInstitution")
                .contentEquals("Yes")) {
            for (int i = 0; i <= 5; ++i) {
                Map<String, String> currentRowForAnotherStudy = CharmsUtil.testManagerData(excelSheet, "OtherStudies", i);
                String otherStudyName = (currentRowForAnotherStudy.get("OtherStudyName"));
                String otherStudyContactPerson = (currentRowForAnotherStudy.get("OtherStudyContactPerson"));
                String otherStudyPhoneNumber = (currentRowForAnotherStudy.get("OtherStudyPhoneNumber"));
                String otherStudyInstitution = (currentRowForAnotherStudy.get("OtherStudyInstitution"));
                String otherStudyParticipationYear1 = (currentRowForAnotherStudy.get("OtherStudyParticipationYear1"));
                String otherStudyParticipationYear2 = (currentRowForAnotherStudy.get("OtherStudyParticipationYear2"));
                CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.otherStudyNameList.get(i),
                        otherStudyName);
                CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.otherStudyContactPersonList.get(i),
                        otherStudyContactPerson);
                CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.otherStudyPhoneNumberList.get(i),
                        otherStudyPhoneNumber);
                CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.otherStudyInstitutionList.get(i),
                        otherStudyInstitution);
                CharmsUtil.selectDropDownValue(
                        fanconiEligibilityQuestionnairePage.otherStudyCurrentlyParticipatingDropDownList.get(i),
                        currentRowForAnotherStudy.get("OtherStudyCurrentlyParticipation"));
                CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.otherStudyNoLongerStartYearList.get(k),
                        otherStudyParticipationYear1);
                CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.otherStudyNoLongerStartYearList.get(j),
                        otherStudyParticipationYear2);
                k = k + 2;
                j = j + 2;
            }
        }
        CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
    }

    /**
     * Method to submit Have you been diagnosed with Fanconi anemia?
     */
    public void diagnosedWithFanconiAnemia() {
        CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList,
                currentRow.get("HaveYouBeenDiagnosedWithFanconiAnemia"));
        CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
    }

    /**
     * Method to submit the age or date when you were diagnosed with Fanconi anemia
     */
    public void diagnosedWithFanconiAnemiaSelected() {
        if (currentRow.get("HaveYouBeenDiagnosedWithFanconiAnemia").contentEquals("Yes")) {
            CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList,
                    currentRow.get("WhenWereYouDiagnosedWithFanconiAnemiaAgeOrDate"));
            if (currentRow.get("WhenWereYouDiagnosedWithFanconiAnemiaAgeOrDate")
                    .contentEquals("Age in years (if under age 1 year, please enter 0)")) {
                CharmsUtil.sendKeysToElement(
                        fanconiEligibilityQuestionnairePage.ageParticipantDiagnosedWithFanconiTextBox,
                        currentRow.get("WhenWereYouDiagnosedWithFanconiAnemiaAge"));
            } else if (currentRow.get("WhenWereYouDiagnosedWithFanconiAnemiaAgeOrDate")
                    .contentEquals("Date (MM/DD/YYYY)")) {
                CharmsUtil.sendKeysToElement(
                        fanconiEligibilityQuestionnairePage.dateParticipantDiagnosedWithFanconiTextBox,
                        currentRow.get("WhenWereYouDiagnosedWithFanconiAnemiaDate"));
            }
            CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
        }
    }

    /**
     * Method to submit Have you had a chromosome breakage test for FA (sometimes
     * also called MMC or DEB test) on a blood sample?
     */
    public void chromosomeBreakageTestSelected() {
        CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList,
                currentRow.get("HaveYouHadAChromosomeBreakageTestForFAOnBloodSample"));
        CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
    }

    /**
     * Method to submit Where was the chromosome breakage test performed?
     */
    public void whereChromosomeBreakageTestPerformed() {
        if (currentRow.get("HaveYouHadAChromosomeBreakageTestForFAOnBloodSample").contentEquals("Yes")) {
            CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList,
                    currentRow.get("WhereWasTheChromosomeBreakageTestPerformed"));
            if (currentRow.get("WhereWasTheChromosomeBreakageTestPerformed").contentEquals("Other (please specify)")) {
                CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.chromosomBreakageTestPerformedTextBox,
                        currentRow.get("WhereWasTheChromosomeBreakageTestPerformedOther"));
            }
            CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
        }
        if (currentRow.get("WhatWasTheChromosomeBreakageTestResultInconclusive").contentEquals("Inconclusive")) {
            CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList,
                    currentRow.get("WhatWasTheChromosomeBreakageTestResultInconclusive"));
            CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
            CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList,
                    currentRow.get("InconclusiveResult"));
            CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
        }
    }

    /**
     * Method to submit What was the chromosome breakage test result?
     */
    public void whatWasChromosomeBreakageTestResult() {
        if (currentRow.get("HaveYouHadAChromosomeBreakageTestForFAOnBloodSample").contentEquals("Yes")) {
            CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList,
                    currentRow.get("WhatWasTheChromosomeBreakageTestResult"));
            CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
        }
    }

    /**
     * Method to provide the chromosome breakage test results to us
     */
    public void toProvideChromosomeBreakageTestResults() {
        if (currentRow.get("HowWouldYouLikeToProvideChromosomeBreakageTestResults").isEmpty()) {
        } else {
            CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList,
                    currentRow.get("HowWouldYouLikeToProvideChromosomeBreakageTestResults"));
            CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
            CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
        }
    }

    /**
     * Method to submit ever had complementation testing or genetic testing
     */
    public void hadComplementationGeneticTesting() {
        CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList,
                currentRow.get("HaveYouEverHadComplementationGeneticTesting"));
        CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
    }

    /**
     * Method to provide Was the genetic testing positive for Fanconi anemia
     */
    public void WasTheGeneticTestingPositive() {
        if (currentRow.get("HaveYouEverHadComplementationGeneticTesting").contentEquals("Yes")) {
            CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList,
                    currentRow.get("WasTheGeneticTestingPositiveForFanconiAnemia"));
            CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
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
            CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.checkFAGenesTestedTextBox,
                    currentRow.get("FAGenesTestedTextBox"));
            for (int i = 23; i <= optionsLength - 2; ++i) {
                CharmsUtil.clickOnRadioButtonElement(fanconiEligibilityQuestionnairePage.commonRBtonList.get(i));
            }
            CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
        } else {
        }
    }

    /**
     * Method to submit Was the genetic testing positive for Fanconi anemia
     */
    public void mutationsVariantsInformationSelected() {
        if (currentRow.get("WasTheGeneticTestingPositiveForFanconiAnemia").contentEquals("Yes")) {
            CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.geneNameDropDownList,
                    currentRow.get("GeneName"));
            CommonUtils.sleep(2000);
            CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.mutationVariant1TextBox,
                    currentRow.get("MutationVariant1"));
            CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.inheritedFrom1DropDownList,
                    currentRow.get("InheritedFrom1"));
            CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.mutationVariant2TextBox,
                    currentRow.get("MutationVariant2"));
            CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.inheritedFrom2DropDownList,
                    currentRow.get("InheritedFrom2"));
            CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
        }
    }

    /**
     * Method to provide if you have a copy of the genetic test results?
     */
    public void haveCopyOfGeneticTestResults() {
        if (currentRow.get("HaveYouEverHadComplementationGeneticTesting").contentEquals("Yes")) {
            CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList,
                    currentRow.get("DoYouHaveCopyOfGeneticTestResults"));
            CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
        } else {
        }
    }

    /**
     * Method to submit how you like to provide the genetic test results to us?
     */
    public void howProvideGeneticTestResults() {
        if (currentRow.get("DoYouHaveCopyOfGeneticTestResults").contentEquals("Yes")) {
            CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList,
                    currentRow.get("HowWouldYouLikeToProvideGeneticTestResults"));
            CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
            CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
        } else {
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
        } else if (currentRow.get("LowBirthWeight").contentEquals("No")) {
            for (int i = 0; i <= optionsLength - 1; ++i) {
                CharmsUtil.clickOnRadioButtonElement(fanconiEligibilityQuestionnairePage.noForFeaturesOptions.get(i));
            }
        } else if (currentRow.get("LowBirthWeight").contentEquals("Unknown/Unsure")) {
            for (int i = 0; i <= optionsLength - 1; ++i) {
                CharmsUtil
                        .clickOnRadioButtonElement(fanconiEligibilityQuestionnairePage.unsureForFeaturesOptions.get(i));
            }
        }
        CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
        CommonUtils.sleep(600);
    }

    /**
     * Method to submit if you ever been diagnosed with bone marrow failure?
     */
    public void everBeenDiagnosedWithBoneMarrowFailure() {
        CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList,
                currentRow.get("HaveYouEverBeenDiagnosedWithBoneMarrowFailure"));
        CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
        CommonUtils.sleep(600);
    }

    /**
     * Method to report date or age of diagnosis?
     */
    public void reportDateOrAgeOfDiagnosis() {
        if (currentRow.get("HaveYouEverBeenDiagnosedWithBoneMarrowFailure").contentEquals("Yes")) {
            CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.reportDateOrAgeOfDiagnosisDropDownList,
                    currentRow.get("DoYouWantReportDateOrAgeOfDiagnosis"));
            CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.monthOfDiagnosisDropDownList,
                    currentRow.get("BoneMarrowFailureMonthOfDiagnosis"));
            CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.yearOfDiagnosisDropDownList,
                    currentRow.get("BoneMarrowFailureYearOfDiagnosis"));
            CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.ageAtDiagnosisDropDownList,
                    currentRow.get("BoneMarrowFailureAgeAtDiagnosis"));
            CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.wasTreatmentReceivedDropDownList,
                    currentRow.get("BoneMarrowFailureWasTreatmentReceived"));
            if (currentRow.get("AreYouCompletingThisQuestionnaireForSomeoneElse")
                    .contentEquals("No, I am completing this form for myself")) {
                CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.treatmentReceivedTextBox,
                        currentRow.get("BoneMarrowFailureTreatment"));
            } else if (currentRow.get("AreYouCompletingThisQuestionnaireForSomeoneElse")
                    .contentEquals("Yes, I am completing this form for someone else")) {
                CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.treatmentReceivedProxyTextBox,
                        currentRow.get("BoneMarrowFailureTreatment"));
            }
            CharmsUtil.selectDropDownValue(
                    fanconiEligibilityQuestionnairePage.didYouReceiveBloodTransfusionDropDownList,
                    currentRow.get("DidYouReceiveOrReceivingBloodTransfusion"));
            CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
        } else {
        }
        CommonUtils.sleep(600);
    }

    /**
     * Method to report if ever been diagnosed with myelodysplastic syndrome (MDS)
     */
    public void diagnosedWithMyelodysplasticSyndrome() {
        if (currentRow.get("HaveYouEverBeenDiagnosedWithBoneMarrowFailure").contentEquals("Yes")) {
            CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList,
                    currentRow.get("HaveYouEverBeenDiagnosedWithMyelodysplasticSyndrome"));
            CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
        } else {
        }
        CommonUtils.sleep(600);
    }

    /**
     * Method to report When were you diagnosed with myelodysplastic syndrome(MDS)
     */
    public void ageOrDateWhenMyelodysplasticSyndromeDiagnosed() {
        if (currentRow.get("HaveYouEverBeenDiagnosedWithMyelodysplasticSyndrome").contentEquals("Yes")) {
            CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList,
                    currentRow.get("AgeOrDateWhenMyelodysplasticSyndromeDiagnosed"));
            if (currentRow.get("AgeOrDateWhenMyelodysplasticSyndromeDiagnosed").contentEquals("Age")) {
                CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.ageParticipantDiagnosedWithMDSTextBox,
                        currentRow.get("AgeWhenMyelodysplasticSyndromeDiagnosed"));
            }
            if (currentRow.get("AgeOrDateWhenMyelodysplasticSyndromeDiagnosed").contentEquals("Date (MM/DD/YYYY)")) {
                CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.dateParticipantDiagnosedWithMDSTextBox,
                        currentRow.get("DateWhenMyelodysplasticSyndromeDiagnosed"));
            }
            CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
        } else {
        }
        CommonUtils.sleep(600);
    }

    /**
     * Method to report if received a bone marrow, stem cell, or cord blood transplant?
     */
    public void everReceivedBoneMarrowTransplant() {
        if (currentRow.get("HaveYouEverBeenDiagnosedWithMyelodysplasticSyndrome").contentEquals("Yes")
                || currentRow.get("HaveYouEverBeenDiagnosedWithMyelodysplasticSyndrome").contentEquals("No")) {
            CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList,
                    currentRow.get("HaveYouEverReceivedBoneMarrowTransplant"));
            if (currentRow.get("HaveYouEverReceivedBoneMarrowTransplant")
                    .contentEquals("Yes (specify treatment center including city, state, and phone number if known)")) {
                CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.treatmentInstitutionProxyTextBox,
                        currentRow.get("BoneMarrowTransplantTreatmentInstitution"));
            } else if (currentRow.get("HaveYouEverReceivedBoneMarrowTransplant")
                    .contentEquals("Yes (specify treatment institution)")) {
                CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.treatmentInstitutionTextBox,
                        currentRow.get("BoneMarrowTransplantTreatmentInstitution"));
            }
            CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
        } else {
        }
        CommonUtils.sleep(600);
    }

    /**
     * Method to provide information about when you had a bone marrow, stem cell, or
     * cord blood transplant. If you do not recall the details, select 'Don't know'.
     */
    public void reportDateOrAgeOfTransplant() {
        if (currentRow.get("HaveYouEverBeenDiagnosedWithMyelodysplasticSyndrome").contentEquals("Yes")) {
            if (currentRow.get("HaveYouEverReceivedBoneMarrowTransplant")
                    .contentEquals("Yes (specify treatment center including city, state, and phone number if known)")) {
                CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.wantToReportDateOrAgeDropDownList,
                        currentRow.get("ReportDateOrAgeOfTransplant"));
                CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.monthOfTransplantDropDownList,
                        currentRow.get("MonthOfTransplant"));
                CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.yearOfTransplantDropDownList,
                        currentRow.get("YearOfTransplant"));
                CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.ageAtTransplantDropDownList,
                        currentRow.get("AgeOfTransplant"));
                CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.donorTypeDropDownList,
                        currentRow.get("DonorType"));
                CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.transpalntDonarTypeDropDownList,
                        currentRow.get("TransplantDonorMatch"));
                CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.stemCellSourceDropDownList,
                        currentRow.get("StemCellSource"));
            }
            if (currentRow.get("HaveYouEverReceivedBoneMarrowTransplant")
                    .contentEquals("Yes (specify treatment institution)")) {
                CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.wantToReportDateOrAgeDropDownList,
                        currentRow.get("ReportDateOrAgeOfTransplant"));
                CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.monthOfTransplantDropDownList,
                        currentRow.get("MonthOfTransplant"));
                CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.yearOfTransplantDropDownList,
                        currentRow.get("YearOfTransplant"));
                CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.ageAtTransplantDropDownList,
                        currentRow.get("AgeOfTransplant"));
                CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.donorTypeDropDownList,
                        currentRow.get("DonorType"));
                CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.transpalntDonarTypeDropDownList,
                        currentRow.get("TransplantDonorMatch"));
                CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.stemCellSourceDropDownList,
                        currentRow.get("StemCellSource"));
            }
            CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
        }
        CommonUtils.sleep(600);
    }

    /**
     * Method to submit information Have you ever been diagnosed with cancer?
     */
    public void everBeenDiagnosedWithCancer() {
        CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList,
                currentRow.get("HaveYouEverBeenDiagnosedWithCancer"));
        CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
    }

    /**
     * Method to provide all information about cancer
     */
    public void cancerdetailsAdded() {
        if (currentRow.get("HaveYouEverBeenDiagnosedWithCancer").contentEquals("No")) {
        } else {
            if (currentRow.get("AreYouCompletingThisQuestionnaireForSomeoneElse")
                    .contentEquals("No, I am completing this form for myself")) {
                for (int i = 0; i <= 3; i++) {
                    Map<String, String> currentRowForCancerHistory = CharmsUtil.testManagerData(excelSheet, "Cancer",
                            i);
                    CharmsUtil.selectDropDownValue(
                            fanconiEligibilityQuestionnairePage.dynamicCancerDropDownLocator("QR~QID212#1~", i + 1),
                            currentRowForCancerHistory.get("TumorType"));
                    CharmsUtil.sendKeysToElement(
                            fanconiEligibilityQuestionnairePage.dynamicCancerTextBoxLocator("QR~QID212#2~", i + 1),
                            currentRowForCancerHistory.get("TumorAdditionalDetails"));
                    CharmsUtil.selectDropDownValue(
                            fanconiEligibilityQuestionnairePage.dynamicCancerDropDownLocator("QR~QID212#10~", i + 1),
                            currentRowForCancerHistory.get("ReportDateOrAgeOfDiagnosis"));
                    CharmsUtil.selectDropDownValue(
                            fanconiEligibilityQuestionnairePage.dynamicCancerDropDownLocator("QR~QID212#3~", i + 1),
                            currentRowForCancerHistory.get("TumorMonthOfDiagnosis"));
                    CharmsUtil.selectDropDownValue(
                            fanconiEligibilityQuestionnairePage.dynamicCancerDropDownLocator("QR~QID212#4~", i + 1),
                            currentRowForCancerHistory.get("TumorYearOfDiagnosis"));
                    CharmsUtil.selectDropDownValue(
                            fanconiEligibilityQuestionnairePage.dynamicCancerDropDownLocator("QR~QID212#11~", i + 1),
                            currentRowForCancerHistory.get("TumorAgeAtDiagnosis"));
                    CharmsUtil.selectDropDownValue(
                            fanconiEligibilityQuestionnairePage.dynamicCancerDropDownLocator("QR~QID212#5~", i + 1),
                            currentRowForCancerHistory.get("AreYouCurrentlyReceivingTumorTreatment"));
                    CharmsUtil.sendKeysToElement(
                            fanconiEligibilityQuestionnairePage.dynamicCancerTextBoxLocator("QR~QID212#6~", i + 1),
                            currentRowForCancerHistory.get("TreatmentInstitution"));
                    CharmsUtil.sendKeysToElement(
                            fanconiEligibilityQuestionnairePage.dynamicCancerTextBoxLocator("QR~QID212#7~", i + 1),
                            currentRowForCancerHistory.get("TreatingPhysician"));
                    CharmsUtil.sendKeysToElement(
                            fanconiEligibilityQuestionnairePage.dynamicCancerTextBoxLocator("QR~QID212#8~", i + 1),
                            currentRowForCancerHistory.get("NameOfInstitutionOrClinicWhereBiopsyOccured"));
                    CharmsUtil.sendKeysToElement(
                            fanconiEligibilityQuestionnairePage.dynamicCancerTextBoxLocator("QR~QID212#9~", i + 1),
                            currentRowForCancerHistory.get("NameOfPhysicianWhoPerformedBiopsy"));
                }
            }
            if (currentRow.get("AreYouCompletingThisQuestionnaireForSomeoneElse")
                    .contentEquals("Yes, I am completing this form for someone else")) {
                for (int i = 0; i <= 3; i++) {
                    Map<String, String> currentRowForCancerHistory = CharmsUtil.testManagerData(excelSheet, "Cancer",
                            i);
                    CharmsUtil.selectDropDownValue(
                            fanconiEligibilityQuestionnairePage.dynamicCancerDropDownLocator("QR~QID213#1~", i + 1),
                            currentRowForCancerHistory.get("TumorType"));
                    CharmsUtil.sendKeysToElement(
                            fanconiEligibilityQuestionnairePage.dynamicCancerTextBoxLocator("QR~QID213#2~", i + 1),
                            currentRowForCancerHistory.get("TumorAdditionalDetails"));
                    CharmsUtil.selectDropDownValue(
                            fanconiEligibilityQuestionnairePage.dynamicCancerDropDownLocator("QR~QID213#10~", i + 1),
                            currentRowForCancerHistory.get("ReportDateOrAgeOfDiagnosis"));
                    CharmsUtil.selectDropDownValue(
                            fanconiEligibilityQuestionnairePage.dynamicCancerDropDownLocator("QR~QID213#3~", i + 1),
                            currentRowForCancerHistory.get("TumorMonthOfDiagnosis"));
                    CharmsUtil.selectDropDownValue(
                            fanconiEligibilityQuestionnairePage.dynamicCancerDropDownLocator("QR~QID213#4~", i + 1),
                            currentRowForCancerHistory.get("TumorYearOfDiagnosis"));
                    CharmsUtil.selectDropDownValue(
                            fanconiEligibilityQuestionnairePage.dynamicCancerDropDownLocator("QR~QID213#11~", i + 1),
                            currentRowForCancerHistory.get("TumorAgeAtDiagnosis"));
                    CharmsUtil.selectDropDownValue(
                            fanconiEligibilityQuestionnairePage.dynamicCancerDropDownLocator("QR~QID213#5~", i + 1),
                            currentRowForCancerHistory.get("AreYouCurrentlyReceivingTumorTreatment"));
                    CharmsUtil.sendKeysToElement(
                            fanconiEligibilityQuestionnairePage.dynamicCancerTextBoxLocator("QR~QID213#6~", i + 1),
                            currentRowForCancerHistory.get("TreatmentInstitution"));
                    CharmsUtil.sendKeysToElement(
                            fanconiEligibilityQuestionnairePage.dynamicCancerTextBoxLocator("QR~QID213#7~", i + 1),
                            currentRowForCancerHistory.get("TreatingPhysician"));
                    CharmsUtil.sendKeysToElement(
                            fanconiEligibilityQuestionnairePage.dynamicCancerTextBoxLocator("QR~QID213#8~", i + 1),
                            currentRowForCancerHistory.get("NameOfInstitutionOrClinicWhereBiopsyOccured"));
                    CharmsUtil.sendKeysToElement(
                            fanconiEligibilityQuestionnairePage.dynamicCancerTextBoxLocator("QR~QID213#9~", i + 1),
                            currentRowForCancerHistory.get("NameOfPhysicianWhoPerformedBiopsy"));
                }
            }
            CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
        }
        CommonUtils.sleep(600);
    }

    /**
     * Method to add current medication(s) that you are receiving?
     */
    public void currentMedicationsAreYouReceiving() {
        CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.currentMedicationOption,
                currentRow.get("WhatCurrentMedicationsAreYouReceiving"));
        if (currentRow.get("WhatCurrentMedicationsAreYouReceiving").contentEquals("Name of Medication(s)")) {
            CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.currentMedicationTextBox,
                    currentRow.get("CurrentMedicationList"));
        } else {
            CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.currentMedicationNotApplicableOption);
        }
        CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
    }

    /**
     * Method to add How did you hear about this study?
     */
    public void howDidYouHearAboutThisStudy() {
        CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList,
                currentRow.get("HowDidYouHearAboutThisStudy"));
        if (currentRow.get("HowDidYouHearAboutThisStudy").contentEquals("Physician")) {
            CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.physicianNameTextBox,
                    currentRow.get("HearAboutThisStudyText"));
        }
        if (currentRow.get("HowDidYouHearAboutThisStudy").contentEquals("Fanconi Anemia Research Fund")) {
            CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.fanconiAnemiaResearchFundTextBox,
                    currentRow.get("HearAboutThisStudyText"));
        }
        if (currentRow.get("HowDidYouHearAboutThisStudy").contentEquals("Genetic counselor")) {
            CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.geneticCounselorTextBox,
                    currentRow.get("HearAboutThisStudyText"));
        }
        if (currentRow.get("HowDidYouHearAboutThisStudy").contentEquals("Other")) {
            CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.otherProviderTextBox,
                    currentRow.get("HearAboutThisStudyText"));
        }
        CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
    }

    /**
     * Method to add name,address,and phone number of the health care provider
     */
    public void healthCareProviderInformation() {
        CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.healthCareProviderNameTextBox,
                currentRow.get("HealthCareProviderName"));
        CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.healthCareProviderAddressTextBox,
                currentRow.get("HealthCareProviderAddress"));
        CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.healthCareProviderPhoneNumberTextBox,
                currentRow.get("HealthCareProviderPhoneNumber"));
        CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
    }

    /**
     * Method for permission to call this individual to seek more information?
     */
    public void permissionToCallProvider() {
        CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList,
                currentRow.get("DoWeHaveYourPermissionToCallThisIndividualToSeekMoreInformation"));
        CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
    }

    /**
     * Method to add main reasons for participating in this study
     */
    public void mainReasonToParticipateInThisStudy() {
        CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList,
                currentRow.get("WhatAreMainReasonToParticipateInThisStudy1"));
        CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.participateInResearchTextBox,
                currentRow.get("WhatAreMainReasonToParticipateInThisStudy1Details"));
        CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList,
                currentRow.get("WhatAreMainReasonToParticipateInThisStudy2"));
        CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.screenForPotentialCancerDiagnosisTextBox,
                currentRow.get("WhatAreMainReasonToParticipateInThisStudy2Details"));
        CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList,
                currentRow.get("WhatAreMainReasonToParticipateInThisStudy3"));
        CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.receiveGeneticTestingTextBox,
                currentRow.get("WhatAreMainReasonToParticipateInThisStudy3Details"));
        CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList,
                currentRow.get("WhatAreMainReasonToParticipateInThisStudy4"));
        CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.otherTextBox,
                currentRow.get("WhatAreMainReasonToParticipateInThisStudy4Details"));
        CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
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
        CommonUtils.sleep(500);
    }

    /**
     * PARTICIPANT DETAILS PAGE IN NATIVE VIEW ASSERTIONS
     */
    public void loginToNativeView() {
        WebDriverUtils.webDriver.get(getNCISPUrl());
        CommonUtils.waitForVisibility(iTrustloginPage.loginLink);
        CharmsUtil.clickOnElement(iTrustloginPage.loginLink);
        CharmsUtil.sendKeysToElement(iTrustloginPage.userNameField, "jains18");
        CharmsUtil.sendKeysToElement(iTrustloginPage.passwordField, "Sj0801**Sj0801**");
        CharmsUtil.clickOnElement(iTrustloginPage.signInButton);
        CommonUtils.waitForVisibility(WebDriverUtils.webDriver.findElement(By.linkText("Native View")));
        CharmsUtil.clickOnElement(WebDriverUtils.webDriver.findElement(By.linkText("Native View")));
        CommonUtils.maximizeWindow();
    }

    /**
     * Method to Log in to the Participant details page in Native View
     */
    public void loginToParticipantDetailsPageInNativeView() {
        CommonUtils.waitForVisibility(nativeViewHomePage.nativeViewFilterNavigator);
        CharmsUtil.sendKeysToElement(nativeViewHomePage.nativeViewFilterNavigator, "CHARMS");
        CommonUtils.waitForVisibility(CHARMSParticipantDetailsPage.nVFamiliesLinkInNavigator);
        CommonUtils.waitForVisibility(CHARMSParticipantDetailsPage.nVAllParticipantDetailsLinkInNavigator);
        CharmsUtil.clickOnElement(CHARMSParticipantDetailsPage.nVAllParticipantDetailsLinkInNavigator);
        CommonUtils.waitForVisibility(CHARMSParticipantDetailsPage.nVParticipantDetailsListViewiFrame);
        CommonUtils.switchToFrame(CHARMSParticipantDetailsPage.nVParticipantDetailsListViewiFrame);
    }

    /**
     * Method to Log in to the Participant details page in Native View
     */
    public void loginToParticipantDetailsPageInNativeView1() {
        CommonUtils.sleep(4000);
        CommonUtils.waitForVisibility(NativeView_SideDoor_Dashboard_Page.filterNavigatorTextBox);
        NativeView_SideDoor_Dashboard_Page.filterNavigatorTextBox.sendKeys("All Participant Details");
        CucumberLogUtils.logScreenshot();
        CommonUtils.sleep(3000);
        CommonUtils.clickOnElement(NativeView_SideDoor_Dashboard_Page.allParticipantDetailsLink);
        CommonUtils.sleep(3000);
        CommonUtils.switchToFrame(NativeView_SideDoor_Dashboard_Page.nativeViewiFrame);
        CommonUtils.sleep(2000);
    }
    
    /**
     * Method to click the participant detail record in list view page
     */
    public void participantDetailRecordClicked(int rowNumForAssertion) {
        currentRow = CharmsUtil.testManagerData(excelSheet, "FanconiScreener", rowNumForAssertion);
        String participantView = currentRow.get("ParticipantFirstName") + " " + currentRow.get("ParticipantLastName");
        String participantProxyView = currentRow.get("ProxyFirstName") + " " + currentRow.get("ProxyLastName");
        if (currentRow.get("ParticipantFirstName").isBlank()) {
            CharmsUtil.clickOnElement(CHARMSParticipantDetailsPage.dynamicPreviewButtonLocator1(participantProxyView));
        } else {
            CharmsUtil.clickOnElement(CHARMSParticipantDetailsPage.dynamicPreviewButtonLocator1(participantView));
            CharmsUtil.clickOnElement(CHARMSParticipantDetailsPage.dynamicPreviewButtonLocator("Open Record"));
        }
    }

    /**
     * Method to assert the General Information on Participant Details page
     */
    public void generalInformationAssertionOnparticipantDetailPage(int rowNumForAssertion) {
        Map<String, String> currentRow = CharmsUtil.testManagerData(excelSheet, "FanconiScreener", rowNumForAssertion);
        CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.dynamicLocatorContainsText("Subject ID"), "Subject ID", " Subject ID Label of the General Information on Participant Details page ");
         }

    /**
     * Method to assert the Personal Information on Participant Details
     */
    public void personalInformationAssertionOnparticipantDetailPage(int rowNumForAssertion) {
        Map<String, String> currentRow = CharmsUtil.testManagerData(excelSheet, "FanconiScreener", rowNumForAssertion);
        CharmsUtil.labelHighlight(cHARMSParticipantDetailsPage.nVParticipantPersonalInformationTab);
        cHARMSParticipantDetailsPage.nVParticipantPersonalInformationTab.click();
        CharmsUtil.assertTextBoxData(softAssert,
                cHARMSParticipantDetailsPage.nVParticipantPersonalInformationTabRelationshipToYou, "proband",
                " Relationship to You of the Personal Information on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert,
                cHARMSParticipantDetailsPage.nVParticipantPersonalInformationTabFirstName,
                currentRow.get("ParticipantFirstName"),
                "First Name of the Personal Information on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert,
                cHARMSParticipantDetailsPage.nVParticipantPersonalInformationTabMiddleName,
                currentRow.get("ParticipantMiddleName"),
                " Middle Name of the Personal Information on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert,
                cHARMSParticipantDetailsPage.nVParticipantPersonalInformationTabLastName,
                currentRow.get("ParticipantLastName"),
                " Last Name of the Personal Information on Participant Details page ");
    }

    /**
     * Method to assert the Demographic Information on Participant Details
     */
    public void demographicsAssertionOnparticipantDetailPage(int rowNumForAssertion) {
        Map<String, String> currentRow = CharmsUtil.testManagerData(excelSheet, "FanconiScreener", rowNumForAssertion);
        CharmsUtil.labelHighlight(cHARMSParticipantDetailsPage.nVParticipantDemographicsTab);
        cHARMSParticipantDetailsPage.nVParticipantDemographicsTab.click();
        CharmsUtil.assertDropDownData(softAssert,
                cHARMSParticipantDetailsPage.nVParticipantDemographicsTabBiologicalGender,
                currentRow.get("SexAssigned"), " Biological Gender of the Demographics on Participant Details page ");
        CharmsUtil.assertDropDownData(softAssert,
                cHARMSParticipantDetailsPage.nVParticipantDemographicsTabIdentifiedGender,
                currentRow.get("CurrentGender"), " Identified Gender of the Demographics on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.nVParticipantDemographicsTabRaceDetails,
                currentRow.get("RaceList"), " Participant Race link of the Demographics on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.nVParticipantDemographicsTabRaceOtherText,
                currentRow.get("OtherRace"),
                " Participant Other Race of the Demographics on Participant Details page ");
        CharmsUtil.assertDropDownData(softAssert, cHARMSParticipantDetailsPage.nVParticipantDemographicsTabEthnicity,
                currentRow.get("Ethnicity"), " Ethnicity of the Demographics on Participant Details page ");
        CharmsUtil.assertDropDownData(softAssert, cHARMSParticipantDetailsPage.nVParticipantDemographicsTabPronouns,
                currentRow.get("Pronouns"), " Pronouns of the Demographics on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert,
                cHARMSParticipantDetailsPage.nVParticipantDemographicsTabPronounsOtherText,
                currentRow.get("PronounsOther"), " Other Pronouns of the Demographics on Participant Details page ");
        CharmsUtil.assertDropDownData(softAssert,
                cHARMSParticipantDetailsPage.nVParticipantDemographicsTabIsTheParticipantAdopted,
                currentRow.get("AreYouAdopted"),
                " Is the participant adopted of the Demographics on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.nVParticipantDemographicsTabDOB,
                currentRow.get("DOB"), " Date of Birth of the Demographics on Participant Details page ");
        CharmsUtil.assertDropDownData(softAssert,
                cHARMSParticipantDetailsPage.nVParticipantDemographicsTabIfDOBUnknownAge18, "-- None --",
                " If Date of Birth is unkown of the Demographics on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.nVParticipantDemographicsTabtAge,
                cHARMSParticipantDetailsPage.nVParticipantDemographicsTabtAge.getAttribute("value"),
                " Age of the Demographics on Participant Details page ");
    }

    /**
     * Method to assert the Contact Info on Participant Details page
     */
    public void contactInformationAssertionOnparticipantDetailPage(int rowNumForAssertion) {
        Map<String, String> currentRow = CharmsUtil.testManagerData(excelSheet, "FanconiScreener", rowNumForAssertion);
        CharmsUtil.labelHighlight(cHARMSParticipantDetailsPage.nVParticipantContactInfoTab);
        cHARMSParticipantDetailsPage.nVParticipantContactInfoTab.click();
        CharmsUtil.assertDropDownData(softAssert,
                cHARMSParticipantDetailsPage.nVParticipantContactInfoTabDoesParticipantNeedLegalRepresentation, "None",
                " Does the participant need legal representation? of the Contact Info on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.nVParticipantContactInfoTabStreetAddress,
                currentRow.get("StreetAddress1") + " " + currentRow.get("StreetAddress2"),
                " Contact Street Address of the Contact Info on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.nVParticipantContactInfoTabState,
                currentRow.get("State"), " Contact State of the Contact Info on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.nVParticipantContactInfoTabCity,
                currentRow.get("City"), " Contact City of the Contact Info on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.nVParticipantContactInfoTabZipcode,
                currentRow.get("ZipCode"), "Contact Zip Code of the Contact Info on Participant Details page ");
        CharmsUtil.assertDropDownData(softAssert, cHARMSParticipantDetailsPage.nVParticipantContactInfoTabCountry,
                currentRow.get("CountryLived"), "Contact Country of the Contact Info on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.nVParticipantContactInfoTabEmail,
                currentRow.get("EmailAddress"), "Contact Email of the Contact Info on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.nVParticipantContactInfoTabHomePhone,
                currentRow.get("HomePhoneNumber"),
                "Contact Home Phone of the Contact Info on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.nVParticipantContactInfoTabCellPhone,
                currentRow.get("CellPhoneNumber"),
                "Contact Cell Phone of the Contact Info on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.nVParticipantContactInfoTabWorkPhone,
                currentRow.get("WorkPhoneNumber"),
                "Contact Work Phone of the Contact Info on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.nVParticipantContactInfoTabPreferredPhone,
                currentRow.get("PreferredPhoneNumber"),
                "Contact Preferred phone of the Contact Info on Participant Details page ");
    }

    /**
     * Method to click the Back Button on Participant details page
     */
    public void participantDetailsBackButtonClicked() {
        CHARMSParticipantDetailsPage.nVAllParticipantDetailsBackButton.click();
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
        fanconiEligibilityQuestionnaireStepsImpl.participantGenderInformationSelected();
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
        fanconiEligibilityQuestionnaireStepsImpl.cancerdetailsAdded();
        fanconiEligibilityQuestionnaireStepsImpl.currentMedicationsAreYouReceiving();
        CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
        fanconiEligibilityQuestionnaireStepsImpl.howDidYouHearAboutThisStudy();
        fanconiEligibilityQuestionnaireStepsImpl.healthCareProviderInformation();
        fanconiEligibilityQuestionnaireStepsImpl.permissionToCallProvider();
        fanconiEligibilityQuestionnaireStepsImpl.mainReasonToParticipateInThisStudy();
    }

    /**
     * Method to Login to the the All referral list view in Native View
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
     * Method to click Fanconi Preview button on Referall list view page
     */
    public void fanconiStudyPreviewRecordClicked(int rowNumForAssertion) {
        currentRow = CharmsUtil.testManagerData(excelSheet, "FanconiScreener", rowNumForAssertion);
        String referallName = currentRow.get("ParticipantFirstName") + " " + currentRow.get("ParticipantLastName");
        String referallProxyName = currentRow.get("ProxyFirstName") + " " + currentRow.get("ProxyLastName");

        if (currentRow.get("ParticipantFirstName").isBlank()) {
            System.out.println(referallProxyName);
            CharmsUtil.clickOnElement(fanconiScreenerNVPage.dynamicReferralPreviewButtonLocator(referallProxyName));
        } else {
            System.out.println(referallName);
            CharmsUtil.clickOnElement(fanconiScreenerNVPage.dynamicReferralPreviewButtonLocator(referallName));
        }
    }

    /**
     * Method to assert the Fanconi Study: General Information
     */
    public void generalInformationAssertionOnFanconiStudyPage(int rowNumForAssertion) {
        referralValue = fanconiScreenerNVPage.nVFScreenerNumberValue.getText();
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerNumber, referralValue,
                "Number of the General Information on Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert,
                fanconiScreenerNVPage.nVFScreenerDoesParticipantNeedLegalRepresentation, "No",
                "Does the participant need legal representation of the General Information on Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerStudy, "Fanconi",
                "Study of the General Information on Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerFamilyMemberRecord,
                (currentRow.get("ParticipantFirstName") + " " + currentRow.get("ParticipantLastName")),
                "Family Member Record of the General Information on Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerVitalStatus, "Not answered",
                "Vital Status of the General Information on Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerDateOfDeath, "",
                "Date of death of the General Information on Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerEligibilityStatus,
                "Waiting for Eligibility",
                "Eligibility Status of the General Information on Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerEnrollmentStatus,
                "New Screener Received",
                "Enrollment Status of the General Information on Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerDateConsentRequested, "",
                "Date Consent Requested of the General Information on Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerConsentReminderCount, "0",
                "Consent Reminder Count of the General Information on Fanconi Study Screener page ");
    }

    /**
     * Method to assert the Fanconi Study: Contact Information
     */
    public void contactInformationAssertionOnFanconiStudyPage(int rowNumForAssertion) {
        CharmsUtil.clickOnElement(fanconiScreenerNVPage.nVFScreenerContactInfoTab);
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerFirstName,
                currentRow.get("ParticipantFirstName"),
                " First Name of the Contact Information in Fanconi Study screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerMiddleName,
                currentRow.get("ParticipantMiddleName"),
                " Middle Name of the Contact Information in Fanconi Study screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerLastName,
                currentRow.get("ParticipantLastName"),
                " Last Name of the Contact Information in Fanconi Study screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerProxyFirstName,
                currentRow.get("ProxyFirstName"),
                " Proxy First Name of the Contact Information in Fanconi Study screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerProxyMiddleName,
                currentRow.get("ProxyMiddleName"),
                " Proxy Middle Name of the Contact Information in Fanconi Study screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerProxyLastName,
                currentRow.get("ProxyLastName"),
                " Proxy Last Name of the Contact Information in Fanconi Study screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerStreetAddress,
                currentRow.get("StreetAddress1") + " " + currentRow.get("StreetAddress2"),
                " Contact Street Address of the Contact Information in Fanconi Study screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerState, currentRow.get("State"),
                " Contact State of the Contact Information in  Fanconi Study screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerCity, currentRow.get("City"),
                " Contact City of the Contact Information in Fanconi Study screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerZipcode, currentRow.get("ZipCode"),
                " Contact Zip Code of the Contact Information in Fanconi Study screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerCountry,
                currentRow.get("CountryLived"),
                " Contact Country of the Contact Information in Fanconi Study screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerEmail, currentRow.get("EmailAddress"),
                " Contact Email of the Contact Information in Fanconi Study screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerHomePhone,
                currentRow.get("HomePhoneNumber"),
                " Contact Home Phone of the Contact Information in Fanconi Study screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerCellPhone,
                currentRow.get("CellPhoneNumber"),
                " Contact Cell Phone of the Contact Information in Fanconi Study screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerWorkPhone,
                currentRow.get("WorkPhoneNumber"),
                " Contact Work Phone of the Contact Information in Fanconi Study screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerPreferredPhone,
                currentRow.get("PreferredPhoneNumber"),
                " Contact Preferred phone of the Contact Information in Fanconi Study screener page ");
    }

    /**
     * Method to assert the Fanconi Study: Demographics Information
     */
    public void demographicsAssertionOnFanconiStudyPage(int rowNumForAssertion) {
        CharmsUtil.clickOnElement(fanconiScreenerNVPage.nVFScreenerDemographicsTab);
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerDOB, currentRow.get("DOB"),
                " Date of Birth of the Demographics in Fanconi Study screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerBiologicalGender,
                currentRow.get("SexAssigned"),
                " Biological Gender of the Demographics in Fanconi Study screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerIdentifiedGender,
                currentRow.get("CurrentGender"),
                " Identified Gender of the Demographics in Fanconi Study screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerRace, currentRow.get("RaceList"),
                " Participant Race  of the Demographics in Fanconi Study screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerRaceOtherText,
                currentRow.get("OtherRace"),
                " Participant Other Race of the Demographics in Fanconi Study screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerIsTheParticipantAdopted,
                currentRow.get("AreYouAdopted"),
                " Is the participant adopted? of the Demographics in Fanconi Study screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerEthnicity,
                currentRow.get("Ethnicity"), " Ethnicity of the Demographics in Fanconi Study screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerPronouns, currentRow.get("Pronouns"),
                " Pronouns of the Demographics in Fanconi Study screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerPronounsOtherText,
                currentRow.get("PronounsOther"),
                " Other Pronouns Other Pronouns of the Demographics in Fanconi Study screener page ");
    }

    /**
     * Method to assert the Fanconi Study:Fanconi History Information
     */
    public void fanconiHistoryAssertionOnFanconiStudyPage(int rowNumForAssertion) {
        CharmsUtil.clickOnElement(fanconiScreenerNVPage.nVFScreenerHistoryTab);
        CharmsUtil.assertDropDownData(softAssert,
                fanconiScreenerNVPage.nVFScreenerHistoryOfFanconiAnemiaStudyInvolvement,
                currentRow.get("HaveYouEverParticipatedInFanconiAnemiaStudyAtAnotherMedicalInstitution"),
                " History of Fanconi anemia study involvement of the Fanconi History in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerFanconiAnemiaDiagnosis,
                currentRow.get("HaveYouBeenDiagnosedWithFanconiAnemia"),
                " Fanconi anemia diagnosis? of the Fanconi History in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerAgeAtFanconiDiagnosis,
                currentRow.get("WhenWereYouDiagnosedWithFanconiAnemiaAge"),
                " Age at Fanconi diagnosis of the Fanconi History in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerDateOfFanconiDiagnosis,
                currentRow.get("WhenWereYouDiagnosedWithFanconiAnemiaDate"),
                " Date of Fanconi diagnosis of the Fanconi History in Fanconi Study Screener page ");
    }

    /**
     * Method to assert Fanconi Study:Genetic Testing History Information
     */
    public void geneticTestingHistoryAssertionOnFanconiStudyPage(int rowNumForAssertion) {
        CharmsUtil.clickOnElement(fanconiScreenerNVPage.nVFScreenerGeneticTestingHistoryTab);
        CharmsUtil.assertDropDownData(softAssert,
                fanconiScreenerNVPage.nVFScreenerIsComplementationTestingPreviouslyDone,
                currentRow.get("HaveYouEverHadComplementationGeneticTesting"),
                " Complementation Testing previously done? of the Genetic Testing History in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerGeneticTestingPositiveForFanconi,
                currentRow.get("WasTheGeneticTestingPositiveForFanconiAnemia"),
                " Genetic testing positive for Fanconi? of the Genetic Testing History in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerDoesGeneticTestResultCopy,
                currentRow.get("DoYouHaveCopyOfGeneticTestResults"),
                " Does the participant have a copy of the genetic test results? of the Genetic Testing History in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerGeneticTestResultsDeliveryMethod,
                currentRow.get("HowWouldYouLikeToProvideGeneticTestResults"),
                " Participants preferred method of delivering genetic test results of the Genetic Testing History in Fanconi Study Screener page ");
    }

    /**
     * Method to assert the Fanconi Study:FA Genes Tested
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
     * Method to assert the Fanconi Study:Medical History Information
     */
    public void medicalHistoryAssertionOnFanconiStudyPage(int rowNumForAssertion) {
        CharmsUtil.clickOnElement(fanconiScreenerNVPage.nVFScreenerMedicalHistoryTab);
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerEverDiagnosedWithCancer,
                currentRow.get("HaveYouEverBeenDiagnosedWithCancer"),
                " Ever diagnosed with Cancer? of the Medical History in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerChromosomeBreakageTestOnBlood,
                currentRow.get("HaveYouHadAChromosomeBreakageTestForFAOnBloodSample"),
                " Chromosome breakage test on blood of the Medical History in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerChromosomeBreakageTestLocation,
                currentRow.get("WhereWasTheChromosomeBreakageTestPerformed"),
                " Chromosome breakage test location of the Medical History in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerChromosomeBreakageResult,
                currentRow.get("WhatWasTheChromosomeBreakageTestResult"),
                " Chromosome breakage result of the Medical History in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerChromosomeBreakageTestOnSkin,
                currentRow.get("ChromosomeBreakageTestOnSkin"),
                " Chromosome breakage test on skin of the Medical History in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerChromosomeBreakageSkinTestResult,
                currentRow.get("ChromosomeBreakageSkinTestResult"),
                " Chromosome breakage skin test result of the Medical History in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert,
                fanconiScreenerNVPage.nVFScreenerChromosomeBreakageBloodTestResultDelivery,
                currentRow.get("HowWouldYouLikeToProvideChromosomeBreakageTestResults"),
                " Chromosome Breakage Blood Test Result Delivery of the Medical History in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerDiagnosedWithMyelodsplasticSyndrome,
                currentRow.get("HaveYouEverBeenDiagnosedWithMyelodysplasticSyndrome"),
                " Diagnosed with Myelodsplastic Syndrome (MDS) of the Medical History in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert,
                fanconiScreenerNVPage.nVFScreenerAgeWhenMyelodysplasticSyndromeDiagnosed,
                currentRow.get("AgeWhenMyelodysplasticSyndromeDiagnosed"),
                " Age when myelodysplastic syndrome diagnosed of the Medical History in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert,
                fanconiScreenerNVPage.nVFScreenerDateWhenMyelodysplasticSyndromeDiagnosed,
                currentRow.get("DateWhenMyelodysplasticSyndromeDiagnosed"),
                " Date when myelodysplastic syndrome diagnosed of the Medical History in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerEverReceivedBoneMarrowTransplant,
                currentRow.get("HaveYouEverReceivedBoneMarrowTransplant"),
                " Ever received transplant (bone marrow/stem cell/ cord blood) of the Medical History in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerTransplantTreatmentInstitution,
                currentRow.get("BoneMarrowTransplantTreatmentInstitution"),
                " Transplant treatment institution (bone marrow/stem cell/ cord blood) of the Medical History in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerAgeAtTransplant,
                currentRow.get("AgeOfTransplant"),
                " Age at transplant of the Medical History in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerMonthOfTransplant,
                currentRow.get("MonthOfTransplant"),
                " Month of transplant of the Medical History in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerYearOfTransplant,
                currentRow.get("YearOfTransplant"),
                " Year of transplant of the Medical History in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerDonorType,
                currentRow.get("DonorType"), " Donor type of the Medical History in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerTransplantDonorMatch,
                currentRow.get("TransplantDonorMatch"),
                " Transplant donor match of the Medical History in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerStemCellSource,
                currentRow.get("StemCellSource"),
                " Stem cell source of the Medical History in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerCurrentMedications,
                currentRow.get("CurrentMedicationList"),
                " Current Medications of the Medical History in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerHealthCarProviderName,
                currentRow.get("HealthCareProviderName"),
                " Health Care Provider Name of the Medical History in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerHealthCareProviderAddress,
                currentRow.get("HealthCareProviderAddress"),
                " Health Care Provider Address of the Medical History in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerHealthCareProviderPhoneNumber,
                currentRow.get("HealthCareProviderPhoneNumber"),
                " Health Care Provider Phone Number of the Medical History in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerPermissionToContactProvider,
                currentRow.get("DoWeHaveYourPermissionToCallThisIndividualToSeekMoreInformation"),
                " Permission to contact Provider Assertion of the Medical History in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerBoneMarrowFailure,
                currentRow.get("HaveYouEverBeenDiagnosedWithBoneMarrowFailure"),
                " Bone marrow failure of the Medical History in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerBoneMarrowFailureAgeAtDiagnosis,
                currentRow.get("BoneMarrowFailureAgeAtDiagnosis"),
                " Bone marrow failure age at diagnosis of the Medical History in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerBoneMarrowFailureMonthOfDiagnosis,
                currentRow.get("BoneMarrowFailureMonthOfDiagnosis"),
                " Bone marrow failure month of diagnosis of the Medical History in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerBoneMarrowFailureYearOfDiagnosis,
                currentRow.get("BoneMarrowFailureYearOfDiagnosis"),
                " Bone marrow failure year of diagnosis of the Medical History in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert,
                fanconiScreenerNVPage.nVFScreenerBoneMarrowFailureWasTreatmentReceived,
                currentRow.get("BoneMarrowFailureWasTreatmentReceived"),
                " Bone marrow failure was treatment received of the Medical History in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerTreatment,
                currentRow.get("BoneMarrowFailureTreatment"),
                " Bone marrow failure Treatment of the Medical History in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerReceivedBloodTransfusions,
                currentRow.get("DidYouReceiveOrReceivingBloodTransfusion"),
                " Did You receive Blood Transfusions of the Medical History in Fanconi Study Screener page ");
    }

    /**
     * Method to assert the Fanconi Study: Participant Features
     */
    public void participantFeaturesAssertionOnFanconiStudyPage(int rowNumForAssertion) {
        CharmsUtil.clickOnElement(fanconiScreenerNVPage.nVFScreenerParticipantFeaturesTab);
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerLowBirthWeight,
                currentRow.get("LowBirthWeight"),
                " Low birth weight of the Participant Features in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerFeedingProblemsOrFailureToThrive,
                currentRow.get("FeedingProblemsOrFailureToThrive"),
                " Feeding problems or Failure to thrive of the Participant Features in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerShortStature,
                currentRow.get("ShortStature"),
                " Short Stature of the Participant Features in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerDevelopmentalDelay,
                currentRow.get("NeurocognitiveDevelopmentalDelay"),
                " Neurocognitive Developmental Delayof the Participant Features in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerSkinAbnormalities,
                currentRow.get("SkinAbnormalities"),
                "Skin abnormalities of the Participant Features in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerHeadCraniofacialAbnormalities,
                currentRow.get("HeadCraniofacialAbnormalities"),
                " Head Craniofacial Abnormalities of the Participant Features in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerMouthAbnormalities,
                currentRow.get("MouthAbnormalities"),
                " Mouth abnormalities of the Participant Features in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerEyeAbnormalities,
                currentRow.get("EyeAbnormalities"),
                " Eye Abnormalities of the Participant Features in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerEarAbnormalities,
                currentRow.get("EarAbnormalities"),
                " Ear Abnormalities of the Participant Features in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerExtremityAbnormalities,
                currentRow.get("ExtremityAbnormalities"),
                " Extremity Abnormalities of the Participant Features in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerSkeletalDeformities,
                currentRow.get("SkeletalDeformities"),
                " Skeletal Deformities of the Participant Features in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerHeartProblems,
                currentRow.get("HeartProblems"),
                " Heart Problems of the Participant Features in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerHeartProblemsOther,
                currentRow.get("HeartProblemsOther"),
                " Heart Problems Other of the Participant Features in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerKidneyAbnormalities,
                currentRow.get("KidneyAbnormalities"),
                " Kidney Abnormalities of the Participant Features in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerGenitalAbnormalities,
                currentRow.get("GenitalAbnormalities"),
                " Genital Abnormalities of the Participant Features in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerFertilityProblemsHypogonadism,
                currentRow.get("FertilityProblemsHypogonadism"),
                " Fertility Problems Hypogonadism of the Participant Features in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerEndocrineProblems,
                currentRow.get("EndocrineProblems"),
                " Endocrine Problems of the Participant Features in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerMetabolicDisorders,
                currentRow.get("MetabolicDisorders"),
                " Metabolic Disorders of the Participant Features in Fanconi Study Screener page ");
    }

    /**
     * Method to assert the Fanconi Study: Final Information
     */
    public void finaInformationAssertionOnFanconiStudyPage(int rowNumForAssertion) {
        CharmsUtil.clickOnElement(fanconiScreenerNVPage.nVFScreenerFinalInformationTab);
        CharmsUtil.assertDropDownData(softAssert,
                fanconiScreenerNVPage.nVFScreenerParticpantInNIHInheritedBoneMarrowFailureSyndromeStudy,
                currentRow.get("AreOrWereYouAParticipanInNIHInheritedBoneMarrowFailuresyndromeStudy"),
                " Particpant in NIH Inherited Bone Marrow Failure Syndrome study of the Final Information in Fanconi Study Screener page ");
        CharmsUtil.labelHighlight(
                fanconiScreenerNVPage.nVFScreenerParticpantInNIHInheritedBoneMarrowFailureSyndromeStudyLock);
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerMainReasonsForParticipatingInStudy,
                currentRow.get("MainReasonToParticipateInThisStudyAll"),
                " Main reasons for participating in this study of the Final Information in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerParticipateInResearch,
                currentRow.get("WhatAreMainReasonToParticipateInThisStudy1Details"),
                " Participate in research of the Final Information in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerScreenForPotentialCancerDiagnosis,
                currentRow.get("WhatAreMainReasonToParticipateInThisStudy2Details"),
                " Screen for potential cancer diagnosis of the Final Information in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerReceiveGeneticTesting,
                currentRow.get("WhatAreMainReasonToParticipateInThisStudy3Details"),
                " Receive genetic testing of the Final Information in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerOtherReasonForParticipation,
                currentRow.get("WhatAreMainReasonToParticipateInThisStudy4Details"),
                " Other reason for participation of the Final Information in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerPreviousStudies,
                currentRow.get("PreviousStudies"),
                " Previous studies of the Final Information in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerHowDidYouHearAboutThisStudy,
                currentRow.get("HowDidYouHearAboutThisStudy"),
                " How did you hear about this study of the Final Information in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerPhysician,
                currentRow.get("HearAboutThisStudyText"),
                " Physician of the Final Information in Fanconi Study Screener page ");
    }

    /**
     * Method to assert the Fanconi Study:Intake participates in another study
     */
    public void intakeParticipatesInAnotherStudyAssertionOnFanconiStudyPage(int rowNumForAssertion) {
        CharmsUtil.clickOnElement(fanconiScreenerNVPage.nVFScreenerIntakeParticipatesInAnotherStudyTab);
        List<WebElement> rowList = fanconiScreenerNVPage.nVFScreenerIntakeParticipatesInAnotherStudyTableLinks;
        if (!rowList.isEmpty()) {
            for (int i = 0; i <= rowList.size() - 1; i++) {
                CommonUtils.scrollIntoView(fanconiScreenerNVPage.nVFScreenerIntakeParticipatesInAnotherStudyTable);
                currentRowForAnotherStudy = CharmsUtil.testManagerData(excelSheet, "OtherStudies", i);
                CharmsUtil.clickOnElement(rowList.get(i));
                CharmsUtil.clickOnElement(fanconiScreenerNVPage.nVFScreenerOpenRecordButton);
                CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.IntakeParticipatesInAnotherStudyTitle,
                        "Intake participates in another study",
                        " Study Name in Intake participates title in another study in Fanconi Study Screener page ");
                CharmsUtil.assertTextBoxData(softAssert,
                        fanconiScreenerNVPage.nVFScreenerIntakeParticipatesStudyNameTextBox,
                        currentRowForAnotherStudy.get("ParticipantStudyNameInNV") + ": "
                                + currentRowForAnotherStudy.get("OtherStudyName"),
                        " Study Name in Intake participates in another study in Fanconi Study Screener page ");
                CharmsUtil.assertTextBoxData(softAssert,
                        fanconiScreenerNVPage.nVFScreenerIntakeParticipatesStudyContactPersonTextBox,
                        currentRowForAnotherStudy.get("OtherStudyContactPerson"),
                        " Study Contact Person in Intake participates in another study in Fanconi Study Screener page ");
                CharmsUtil.assertTextBoxData(softAssert,
                        fanconiScreenerNVPage.nVFScreenerIntakeParticipatesStudyPhoneNumberTextBox,
                        currentRowForAnotherStudy.get("OtherStudyPhoneNumber"),
                        " Study Phone Number in Intake participates in another study in Fanconi Study Screener page ");
                CharmsUtil.assertTextBoxData(softAssert,
                        fanconiScreenerNVPage.nVFScreenerIntakeParticipatesStartDateTextBox,
                        currentRowForAnotherStudy.get("OtherStudyParticipationYear1"),
                        " Start Date in Intake participates in another study in Fanconi Study Screener page ");
                CharmsUtil.assertTextBoxData(softAssert,
                        fanconiScreenerNVPage.nVFScreenerIntakeParticipatesStudyEndDateTextBox,
                        currentRowForAnotherStudy.get("OtherStudyParticipationYear2"),
                        " End Date in Intake participates in another study in Fanconi Study Screener page ");
                CharmsUtil.assertTextBoxData(softAssert,
                        fanconiScreenerNVPage.nVFScreenerIntakeParticipatesStudyInstitutionTextBox,
                        currentRowForAnotherStudy.get("OtherStudyInstitution"),
                        " Institution in Intake participates in another study in Fanconi Study Screener page ");
                CharmsUtil.assertDropDownData(softAssert,
                        fanconiScreenerNVPage.nVFScreenerIntakeParticipatesStudyCurrentlyParticipatingDropDown,
                        currentRowForAnotherStudy.get("OtherStudyCurrentlyParticipation"),
                        " Currently participating in Intake participates in another study in Fanconi Study Screener page ");
                CharmsUtil.assertTextBoxData(softAssert,
                        fanconiScreenerNVPage.nVFScreenerIntakeParticipatesStudyRelationshipToYouTextBox, "",
                        " Relationship to you in Intake participates in another study in Fanconi Study Screener page ");
                CharmsUtil.assertTextBoxData(softAssert,
                        fanconiScreenerNVPage.nVFScreenerIntakeParticipatesStudyFirstNameTextBox, "",
                        " First Name Intake participates in another study in Fanconi Study Screener page ");
                CharmsUtil.assertTextBoxData(softAssert,
                        fanconiScreenerNVPage.nVFScreenerIntakeParticipatesStudyLastNameTextBox, "",
                        " Last Name Intake participates in another study in Fanconi Study Screener page ");
                CharmsUtil.clickOnElement(fanconiScreenerNVPage.nVFScreenerBackButton);
                CommonUtils.scrollIntoView(fanconiScreenerNVPage.nVFScreenerIntakeParticipatesInAnotherStudyTable);
                CommonUtils.sleep(2000);
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
                CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerGeneticMutationTitle,
                        "Genetic Mutation/Variant", " Genetic Mutation/Variants Title in Fanconi Study Screener page ");
                CharmsUtil.assertTextBoxData(softAssert,
                        fanconiScreenerNVPage.nVFScreenerGeneticMutationScreenerTextBox, referralValue,
                        " Screener in Genetic Mutation/Variants of Fanconi Study Screener page ");
                CharmsUtil.assertTextBoxData(softAssert,
                        fanconiScreenerNVPage.nVFScreenerGeneticMutationGeneNameTextBox, currentRow.get("GeneName"),
                        " Gene Name in Genetic Mutation/Variants of Fanconi Study Screener page ");
                CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerGeneticMutationVariantTextBox,
                        currentRow.get("MutationVariant1"),
                        " Mutation/Variant in Genetic Mutation/Variants of Fanconi Study Screener page ");
                CharmsUtil.assertDropDownData(softAssert,
                        fanconiScreenerNVPage.nVFScreenerGeneticMutationInheritedFromDropDown,
                        currentRow.get("InheritedFrom1"),
                        " Inherited From in Genetic Mutation/Variants of Fanconi Study Screener page ");
                CharmsUtil.assertTextBoxData(softAssert,
                        fanconiScreenerNVPage.nVFScreenerGeneticMutationVariant2TextBox,
                        currentRow.get("MutationVariant2"),
                        " Mutation/Variant 2 in Genetic Mutation/Variants of Fanconi Study Screener page ");
                CharmsUtil.assertDropDownData(softAssert,
                        fanconiScreenerNVPage.nVFScreenerGeneticMutationInheritedFrom2DropDown,
                        currentRow.get("InheritedFrom2"),
                        " Inherited From 2 in Genetic Mutation/Variants of Fanconi Study Screener page ");
                CharmsUtil.clickOnElement(fanconiScreenerNVPage.nVFScreenerBackButton);
            }
        }
    }

    /**
     * Method to assert the Fanconi Study: Patient Cancer History
     */
    public void cancerHistoryAssertionOnFanconiStudyPage(int rowNumForAssertion) {
        CharmsUtil.clickOnElement(fanconiScreenerNVPage.nVFScreenerCancerHistoryTab);
        List<WebElement> rowList = fanconiScreenerNVPage.nVFScreenerCancerHistoryTableRowsLink;
        if (!rowList.isEmpty()) {
            for (int i = 0; i <= rowList.size() - 1; i++) {
                CharmsUtil.clickOnElement(fanconiScreenerNVPage.nVFScreenerCancerHistoryTableLinks);
                CharmsUtil.clickOnElement(fanconiScreenerNVPage.nVFScreenerOpenRecordButton);
                CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerCancerHistoryTitle,
                        "CHARMS Referral Patient Cancer", " Cancer History Title in Fanconi Study Screener page ");
                CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerCancerHistoryTumorType,
                        currentRowForCancerHistory.get("TumorType"), " Tumor Type in Fanconi Study Screener page ");
                CharmsUtil.assertDropDownData(softAssert,
                        fanconiScreenerNVPage.nVFScreenerCancerHistoryMonthOfDiagnosis,
                        currentRowForCancerHistory.get("TumorMonthOfDiagnosis"),
                        " Month of diagnosis in Fanconi Study Screener page ");
                CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerCancerHistoryYearOfDiagnosis,
                        currentRowForCancerHistory.get("TumorYearOfDiagnosis"),
                        " Year of diagnosis in Fanconi Study Screener page ");
                CharmsUtil.assertTextBoxData(softAssert,
                        fanconiScreenerNVPage.nVFScreenerCancerHistoryHowOldWhenCancerDiagnosed,
                        currentRowForCancerHistory.get("TumorAgeAtDiagnosis"),
                        " How old was the research participant when the cancer was diagnosed?in Fanconi Study Screener page ");
                CharmsUtil.assertDropDownData(softAssert,
                        fanconiScreenerNVPage.nVFScreenerCancerHistoryCurrentlyBeingTreated,
                        currentRowForCancerHistory.get("AreYouCurrentlyReceivingTumorTreatment"),
                        " Currently being treated in Fanconi Study Screener page ");
                CharmsUtil.assertTextBoxData(softAssert,
                        fanconiScreenerNVPage.nVFScreenerCancerHistoryTreatmentInstitution,
                        currentRowForCancerHistory.get("TreatmentInstitution"),
                        " Treatment Institution in Fanconi Study Screener page ");
                CharmsUtil.assertTextBoxData(softAssert,
                        fanconiScreenerNVPage.nVFScreenerCancerHistoryTreatingPhysician,
                        currentRowForCancerHistory.get("TreatingPhysician"),
                        " Treating Physician in Fanconi Study Screener page ");
                CharmsUtil.assertTextBoxData(softAssert,
                        fanconiScreenerNVPage.nVFScreenerCancerHistoryNameOfInstitution,
                        currentRowForCancerHistory.get("NameOfInstitutionOrClinicWhereBiopsyOccured"),
                        " Name of institution or clinic where biopsy occurred  in Fanconi Study Screener page ");
                CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerCancerHistoryNameOfPhysician,
                        currentRowForCancerHistory.get("NameOfPhysicianWhoPerformedBiopsy"),
                        " Name of physician who performed the biopsy in Fanconi Study Screener page ");
                CharmsUtil.clickOnElement(fanconiScreenerNVPage.nVFScreenerBackButton);
            }
        }
    }

    /**
     * Method to assert all data in the Fanconi Study page
     */
    public void fanconiStudyPageAssertions(int rowNumForAssertion) {
        currentRow = CharmsUtil.testManagerData(excelSheet, "FanconiScreener", rowNumForAssertion);
        currentRowForCancerHistory = CharmsUtil.testManagerData(excelSheet, "Cancer", rowNumForAssertion);
        fanconiEligibilityQuestionnaireStepsImpl.generalInformationAssertionOnFanconiStudyPage(rowNumForAssertion);
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
        fanconiEligibilityQuestionnaireStepsImpl.cancerHistoryAssertionOnFanconiStudyPage(rowNumForAssertion);
        softAssert.assertAll();
    }

    /**
     * Fanconi Eligibility Question submission method
     */
    public void fanconiEligibilityAllScenariosQuestionnaireSubmission() {
        for (int i = 10; i <= 10; ++i) {
            String username = "charmsparticipant" + i + "@yopmail.com";
            String password = "Charms123";
            System.out.println(username);
            CommonUtils.sleep(1000);
            if (i != 1) {
                try {
                    CharmsUtil.clickOnElement(fanconiLoginPage.LogoutDropDownLink);
                    CharmsUtil.clickOnElement(fanconiLoginPage.LogoutButton);
                } catch (Exception e) {
                }
            }
            WebDriverUtils.webDriver.get(getFanconiUrl());
            System.out.println(WebDriverUtils.webDriver.getCurrentUrl());
            CommonUtils.sleep(1000);
            CommonUtils.waitForVisibility(fanconiLoginPage.enrollLoginButton);
            CharmsUtil.clickOnElement(fanconiLoginPage.enrollLoginButton);
            CharmsUtil.sendKeysToElement(oktaLoginPage.usernameTxtBox, username);
            CharmsUtil.sendKeysToElement(oktaLoginPage.passwordTxtBox, password);
            CommonUtils.sleep(600);
            CommonUtils.waitForVisibility(oktaLoginPage.loginBtn);
            CharmsUtil.clickOnElement(oktaLoginPage.loginBtn);
            CommonUtils.waitForVisibility(fanconiLoginPage.warningAgreeButton);
            CharmsUtil.clickOnElement(fanconiLoginPage.warningAgreeButton);
            fanconiLoginPage.eligibilityQuestionnaireLink.click();
            fanconiEligibilityQuestionnaireStepsImpl.fanconiEligibilityQuestionnaireSubmissionScenario(i - 1);
            CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
            Set<String> windows = WebDriverUtils.webDriver.getWindowHandles();
            int sizer = windows.size();
            Iterator<String> iterator = windows.iterator();
            while (iterator.hasNext()) {
                String selectedTab = iterator.next();
                System.out.println(WebDriverUtils.webDriver.getCurrentUrl());
                WebDriverUtils.webDriver.switchTo().window(selectedTab);
                break;
            }
        }
    }

    /**
     * Method to assert the Fanconi Study: Consent Flow
     */
    public void fanconiConsentAssertionOnFanconiStudyPage(int rowNumForAssertion) {
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
        CharmsUtil.assertDropDownData(softAssert, cHARMSParticipantDetailsPage.nVParticipantEnrollmentStatus,
                "Eligibility Review", " Enrollment Status of the General Information on Participant Details page ");
        CharmsUtil.labelHighlight(cHARMSParticipantDetailsPage.nVParticipantMarkEligibleButton);
        cHARMSParticipantDetailsPage.nVParticipantMarkEligibleButton.click();
        CommonUtils.sleep(2000);
        CharmsUtil.assertDropDownData(softAssert, cHARMSParticipantDetailsPage.nVParticipantEnrollmentStatus,
                "Eligible", " Eligibility Status of the General Information on Participant Details page ");
        CharmsUtil.assertDropDownData(softAssert, cHARMSParticipantDetailsPage.nVParticipantEnrollmentStatus,
                "Awaiting Consent", " Enrollment Status of the General Information on Participant Details page ");
        CommonUtils.scrollIntoView(cHARMSParticipantDetailsPage.nVParticipantConsentTableTab);
        CommonUtils.sleep(2000);
        CharmsUtil.clickOnElement(cHARMSParticipantDetailsPage.nVParticipantConsentTableTab);
        CharmsUtil.clickOnElement(cHARMSParticipantDetailsPage.nVParticipantConsentTablePreviewLink);
        CharmsUtil.clickOnElement(cHARMSParticipantDetailsPage.nVParticipantOpenRecordButton);
        CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.nVParticipantFamilyMemberTextBox,
                (currentRow.get("ParticipantFirstName") + " " + currentRow.get("ParticipantLastName")),
                " Family Member of the CHARMS Consent Page ");
        CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.nVParticipantConsentStatusTextBox, "1",
                "Consent Status in Family Member of the CHARMS Consent Page ");
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
        CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.nVParticipantCohortTextBox, "field",
                " Cohort in CHARMS Consent Page ");
        CharmsUtil.selectDropDownValue(cHARMSParticipantDetailsPage.nVParticipantConsentFormDropDown, "Field");
        CharmsUtil.labelHighlight(cHARMSParticipantDetailsPage.nVParticipantConsentVersionTextBox);
        CharmsUtil.clickOnElement(cHARMSParticipantDetailsPage.nVParticipantTimeIcon3);
        CharmsUtil.clickOnElement(cHARMSParticipantDetailsPage.nVParticipantGoToToday);
        CharmsUtil.selectDropDownValue(cHARMSParticipantDetailsPage.nVParticipantConsentTypeDropDown, "Adult");
        CharmsUtil.selectDropDownValue(cHARMSParticipantDetailsPage.nVParticipantResponseTypeDropDown,
                "Upload to Portal");
        CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.nVParticipantConsentStatusTextBox, "3",
                " Consent Status Family Member of the CHARMS Consent Page ");
        CharmsUtil.labelHighlight(cHARMSParticipantDetailsPage.nVParticipantConsentDateTextBox);
        CharmsUtil.clickOnElement(cHARMSParticipantDetailsPage.nVParticipantTimeIcon4);
        CharmsUtil.clickOnElement(cHARMSParticipantDetailsPage.nVParticipantGoToToday);
        CharmsUtil.labelHighlight(cHARMSParticipantDetailsPage.nVParticipantTimeIconOkButton);
        cHARMSParticipantDetailsPage.nVParticipantTimeIconOkButton.click();
        CharmsUtil.selectDropDownValue(cHARMSParticipantDetailsPage.nVParticipantCurrentPreviousDropDown, "Current");
        CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.nVParticipantStudyTextBox, "Fanconi",
                "Family Member of the CHARMS Consent Page ");
        CharmsUtil.selectDropDownValue(cHARMSParticipantDetailsPage.nVParticipantConsentAssentStatusDropDown,
                "Pending");
        CharmsUtil.selectDropDownValue(cHARMSParticipantDetailsPage.nVParticipantInterpreterUsedDropDown, "No");
        CharmsUtil.selectDropDownValue(
                cHARMSParticipantDetailsPage.nVParticipantFutureUseOfSpecimensAndDataByNIHDropDown,
                "Dead End by Study Manager");
        CharmsUtil.selectDropDownValue(cHARMSParticipantDetailsPage.nVParticipantFutureUseByCollaboratorsDropDown,
                "Dead End by PI");
        CharmsUtil.selectDropDownValue(
                cHARMSParticipantDetailsPage.nVParticipantFutureIdentifiableUseByCollaboratorsDropDown,
                "Dead End by PI");
        CharmsUtil.selectDropDownValue(cHARMSParticipantDetailsPage.nVParticipantReturnOfGeneticFindingsDropDown, "0");
        CharmsUtil.selectDropDownValue(cHARMSParticipantDetailsPage.nVParticipantParticipantAssentDropDown,
                "Not Needed");
        CharmsUtil.selectDropDownValue(cHARMSParticipantDetailsPage.nVParticipantParticipantConsentDropDown,
                "Required");
        CharmsUtil.labelHighlight(cHARMSParticipantDetailsPage.nVParticipantCallCompleteButton);
        cHARMSParticipantDetailsPage.nVParticipantCallCompleteButton.click();
        CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.nVParticipantConsentStatusTextBox, "5",
                " Consent Status Family Member of the CHARMS Consent Page ");
        CharmsUtil.clickOnElement(cHARMSParticipantDetailsPage.nVParticipantAttachmentButton);
        CharmsUtil.clickOnElement(cHARMSParticipantDetailsPage.nVParticipantChooseFileButton);
        cHARMSParticipantDetailsPage.nVParticipantChooseFileButton.sendKeys(
                "/Users/jains18/git/CBIIT-Test-Automation/src/main/resources/Family Cohort Study Consent.pdf");
        CharmsUtil.clickOnElement(cHARMSParticipantDetailsPage.nVParticipantHardCopyOfConsentReceivedButton);
        softAssert.assertAll();
    }

    /**
     * Method to assert the Participant Detail: Complete page
     */
    public void allScenariosParticipantDetailPageAssertion() {
        for (int i = 0; i <= 9; i++) {
            fanconiEligibilityQuestionnaireStepsImpl.participantDetailPageAssertion(i);
            CharmsUtil.clickOnElement(CHARMSParticipantDetailsPage.nVAllParticipantDetailsBackButton);
        }
    }

    /**
     * Method to assert the Participant Detail: Complete page
     */
    public void participantDetailPageAssertion(int rowNumForAssertion) {
        fanconiEligibilityQuestionnaireStepsImpl.participantDetailRecordClicked(rowNumForAssertion);
        fanconiEligibilityQuestionnaireStepsImpl.generalInformationAssertionOnparticipantDetailPage(rowNumForAssertion);
        fanconiEligibilityQuestionnaireStepsImpl.personalInformationAssertionOnparticipantDetailPage(rowNumForAssertion);
        fanconiEligibilityQuestionnaireStepsImpl.demographicsAssertionOnparticipantDetailPage(rowNumForAssertion);
        fanconiEligibilityQuestionnaireStepsImpl.contactInformationAssertionOnparticipantDetailPage(rowNumForAssertion);
        softAssert.assertAll();
    }

    /**
     * Method to assert the Fanconi Study: Every tab on the page
     */
    public void fanconiStudyCompleteAssertion(int rowNumForAssertion) {
        currentRow = CharmsUtil.testManagerData(excelSheet, "FanconiScreener", rowNumForAssertion);
        currentRowForCancerHistory = CharmsUtil.testManagerData(excelSheet, "Cancer", rowNumForAssertion);
        referralValue = fanconiScreenerNVPage.nVFScreenerNumberValue.getText();
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerNumber, referralValue,
                "Number of the General Information on Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert,
                fanconiScreenerNVPage.nVFScreenerDoesParticipantNeedLegalRepresentation, "No",
                "Does the participant need legal representation of the General Information on Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerStudy, "Fanconi",
                "Study of the General Information on Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerFamilyMemberRecord,
                (currentRow.get("ParticipantFirstName") + " " + currentRow.get("ParticipantLastName")),
                "Family Member Record of the General Information on Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerVitalStatus, "Not answered",
                "Vital Status of the General Information on Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerDateOfDeath, "",
                "Date of death of the General Information on Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerEligibilityStatus,
                "Waiting for Eligibility",
                "Eligibility Status of the General Information on Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerEnrollmentStatus,
                "New Screener Received",
                "Enrollment Status of the General Information on Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerDateConsentRequested, "",
                "Date Consent Requested of the General Information on Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerConsentReminderCount, "0",
                "Consent Reminder Count of the General Information on Fanconi Study Screener page ");
        CharmsUtil.labelHighlight(fanconiScreenerNVPage.nVFScreenerContactInfoTab);
        fanconiScreenerNVPage.nVFScreenerContactInfoTab.click();
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerFirstName,
                currentRow.get("ParticipantFirstName"),
                " First Name of the Contact Information in Fanconi Study screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerMiddleName,
                currentRow.get("ParticipantMiddleName"),
                " Middle Name of the Contact Information in Fanconi Study screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerLastName,
                currentRow.get("ParticipantLastName"),
                " Last Name of the Contact Information in Fanconi Study screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerProxyFirstName,
                currentRow.get("ProxyFirstName"),
                " Proxy First Name of the Contact Information in Fanconi Study screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerProxyMiddleName,
                currentRow.get("ProxyMiddleName"),
                " Proxy Middle Name of the Contact Information in Fanconi Study screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerProxyLastName,
                currentRow.get("ProxyLastName"),
                " Proxy Last Name of the Contact Information in Fanconi Study screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerStreetAddress,
                currentRow.get("StreetAddress1") + " " + currentRow.get("StreetAddress2"),
                " Contact Street Address of the Contact Information in Fanconi Study screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerState, currentRow.get("State"),
                " Contact State of the Contact Information in Fanconi Study screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerCity, currentRow.get("City"),
                " Contact City of the Contact Information in Fanconi Study screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerZipcode, currentRow.get("ZipCode"),
                " Contact Zip Code of the Contact Information in Fanconi Study screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerCountry,
                currentRow.get("CountryLived"),
                " Contact Country of the Contact Information in Fanconi Study screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerEmail, currentRow.get("EmailAddress"),
                " Contact Email of the Contact Information in Fanconi Study screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerHomePhone,
                currentRow.get("HomePhoneNumber"),
                " Contact Home Phone of the Contact Information in Fanconi Study screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerCellPhone,
                currentRow.get("CellPhoneNumber"),
                " Contact Cell Phone of the Contact Information in Fanconi Study screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerWorkPhone,
                currentRow.get("WorkPhoneNumber"),
                " Contact Work Phone of the Contact Information in Fanconi Study screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerPreferredPhone,
                currentRow.get("PreferredPhoneNumber"),
                " Contact Preferred phone of the Contact Information in Fanconi Study screener page ");
        CharmsUtil.clickOnElement(fanconiScreenerNVPage.nVFScreenerDemographicsTab);
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerDOB, currentRow.get("DOB"),
                " Date of Birth of the Demographics in Fanconi Study screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerBiologicalGender,
                currentRow.get("SexAssigned"),
                " Biological Gender of the Demographics in Fanconi Study screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerIdentifiedGender,
                currentRow.get("CurrentGender"),
                " Identified Gender of the Demographics in Fanconi Study screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerRace, currentRow.get("RaceList"),
                " Participant Race  of the Demographics in Fanconi Study screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerRaceOtherText,
                currentRow.get("OtherRace"),
                " Participant Other Race of the Demographics in Fanconi Study screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerIsTheParticipantAdopted,
                currentRow.get("AreYouAdopted"),
                " Is the participant adopted? of the Demographics in Fanconi Study screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerEthnicity,
                currentRow.get("Ethnicity"), " Ethnicity of the Demographics in Fanconi Study screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerPronouns, currentRow.get("Pronouns"),
                " Pronouns of the Demographics in Fanconi Study screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerPronounsOtherText,
                currentRow.get("PronounsOther"),
                " Other Pronouns Other Pronouns of the Demographics in Fanconi Study screener page ");
        CharmsUtil.clickOnElement(fanconiScreenerNVPage.nVFScreenerHistoryTab);
        CharmsUtil.assertDropDownData(softAssert,
                fanconiScreenerNVPage.nVFScreenerHistoryOfFanconiAnemiaStudyInvolvement,
                currentRow.get("HaveYouEverParticipatedInFanconiAnemiaStudyAtAnotherMedicalInstitution"),
                " History of Fanconi anemia study involvement of the Fanconi History in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerFanconiAnemiaDiagnosis,
                currentRow.get("HaveYouBeenDiagnosedWithFanconiAnemia"),
                " Fanconi anemia diagnosis? of the Fanconi History in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerAgeAtFanconiDiagnosis,
                currentRow.get("WhenWereYouDiagnosedWithFanconiAnemiaAge"),
                " Age at Fanconi diagnosis of the Fanconi History in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerDateOfFanconiDiagnosis,
                currentRow.get("WhenWereYouDiagnosedWithFanconiAnemiaDate"),
                " Date of Fanconi diagnosis of the Fanconi History in Fanconi Study Screener page ");
        CharmsUtil.clickOnElement(fanconiScreenerNVPage.nVFScreenerGeneticTestingHistoryTab);
        CharmsUtil.assertDropDownData(softAssert,
                fanconiScreenerNVPage.nVFScreenerIsComplementationTestingPreviouslyDone,
                currentRow.get("HaveYouEverHadComplementationGeneticTesting"),
                " Complementation Testing previously done? of the Genetic Testing History in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerGeneticTestingPositiveForFanconi,
                currentRow.get("WasTheGeneticTestingPositiveForFanconiAnemia"),
                " Genetic testing positive for Fanconi? of the Genetic Testing History in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerDoesGeneticTestResultCopy,
                currentRow.get("DoYouHaveCopyOfGeneticTestResults"),
                " Does the participant have a copy of the genetic test results? of the Genetic Testing History in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerGeneticTestResultsDeliveryMethod,
                currentRow.get("HowWouldYouLikeToProvideGeneticTestResults"),
                " Participants preferred method of delivering genetic test results of the Genetic Testing History in Fanconi Study Screener page ");
        CharmsUtil.clickOnElement(fanconiScreenerNVPage.nVFScreenerFAGenesTestedTab);
        for (int i = 0; i <= 26; ++i) {
            CharmsUtil.assertCheckBox(softAssert, fanconiScreenerNVPage.nVFScreenerFAGenesTested.get(i), false,
                    "FA Genes checkBox number: " + i + " Tested the FA Genes in Fanconi Study Screener page");
        }
        CharmsUtil.clickOnElement(fanconiScreenerNVPage.nVFScreenerMedicalHistoryTab);
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerEverDiagnosedWithCancer,
                currentRow.get("HaveYouEverBeenDiagnosedWithCancer"),
                " Ever diagnosed with Cancer? of the Medical History in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerChromosomeBreakageTestOnBlood,
                currentRow.get("HaveYouHadAChromosomeBreakageTestForFAOnBloodSample"),
                " Chromosome breakage test on blood of the Medical History in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerChromosomeBreakageTestLocation,
                currentRow.get("WhereWasTheChromosomeBreakageTestPerformed"),
                " Chromosome breakage test location of the Medical History in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerChromosomeBreakageResult,
                currentRow.get("WhatWasTheChromosomeBreakageTestResult"),
                " Chromosome breakage result of the Medical History in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerChromosomeBreakageTestOnSkin,
                currentRow.get("ChromosomeBreakageTestOnSkin"),
                " Chromosome breakage test on skin of the Medical History in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerChromosomeBreakageSkinTestResult,
                currentRow.get("ChromosomeBreakageSkinTestResult"),
                " Chromosome breakage skin test result of the Medical History in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert,
                fanconiScreenerNVPage.nVFScreenerChromosomeBreakageBloodTestResultDelivery,
                currentRow.get("HowWouldYouLikeToProvideChromosomeBreakageTestResults"),
                " Chromosome Breakage Blood Test Result Delivery of the Medical History in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerDiagnosedWithMyelodsplasticSyndrome,
                currentRow.get("HaveYouEverBeenDiagnosedWithMyelodysplasticSyndrome"),
                " Diagnosed with Myelodsplastic Syndrome (MDS) of the Medical History in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert,
                fanconiScreenerNVPage.nVFScreenerAgeWhenMyelodysplasticSyndromeDiagnosed,
                currentRow.get("AgeWhenMyelodysplasticSyndromeDiagnosed"),
                " Age when myelodysplastic syndrome diagnosed of the Medical History in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert,
                fanconiScreenerNVPage.nVFScreenerDateWhenMyelodysplasticSyndromeDiagnosed,
                currentRow.get("DateWhenMyelodysplasticSyndromeDiagnosed"),
                " Date when myelodysplastic syndrome diagnosed of the Medical History in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerEverReceivedBoneMarrowTransplant,
                currentRow.get("HaveYouEverReceivedBoneMarrowTransplant"),
                " Ever received transplant (bone marrow/stem cell/ cord blood) of the Medical History in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerTransplantTreatmentInstitution,
                currentRow.get("BoneMarrowTransplantTreatmentInstitution"),
                " Transplant treatment institution (bone marrow/stem cell/ cord blood) of the Medical History in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerAgeAtTransplant,
                currentRow.get("AgeOfTransplant"),
                " Age at transplant of the Medical History in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerMonthOfTransplant,
                currentRow.get("MonthOfTransplant"),
                " Month of transplant of the Medical History in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerYearOfTransplant,
                currentRow.get("YearOfTransplant"),
                " Year of transplant of the Medical History in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerDonorType,
                currentRow.get("DonorType"), " Donor type of the Medical History in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerTransplantDonorMatch,
                currentRow.get("TransplantDonorMatch"),
                " Transplant donor match of the Medical History in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerStemCellSource,
                currentRow.get("StemCellSource"),
                " Stem cell source of the Medical History in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerCurrentMedications,
                currentRow.get("CurrentMedicationList"),
                " Current Medications of the Medical History in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerHealthCarProviderName,
                currentRow.get("HealthCareProviderName"),
                " Health Care Provider Name of the Medical History in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerHealthCareProviderAddress,
                currentRow.get("HealthCareProviderAddress"),
                " Health Care Provider Address of the Medical History in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerHealthCareProviderPhoneNumber,
                currentRow.get("HealthCareProviderPhoneNumber"),
                " Health Care Provider Phone Number of the Medical History in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerPermissionToContactProvider,
                currentRow.get("DoWeHaveYourPermissionToCallThisIndividualToSeekMoreInformation"),
                " Permission to contact Provider Assertion of the Medical History in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerBoneMarrowFailure,
                currentRow.get("HaveYouEverBeenDiagnosedWithBoneMarrowFailure"),
                " Bone marrow failure of the Medical History in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerBoneMarrowFailureAgeAtDiagnosis,
                currentRow.get("BoneMarrowFailureAgeAtDiagnosis"),
                " Bone marrow failure age at diagnosis of the Medical History in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerBoneMarrowFailureMonthOfDiagnosis,
                currentRow.get("BoneMarrowFailureMonthOfDiagnosis"),
                " Bone marrow failure month of diagnosis of the Medical History in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerBoneMarrowFailureYearOfDiagnosis,
                currentRow.get("BoneMarrowFailureYearOfDiagnosis"),
                " Bone marrow failure year of diagnosis of the Medical History in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert,
                fanconiScreenerNVPage.nVFScreenerBoneMarrowFailureWasTreatmentReceived,
                currentRow.get("BoneMarrowFailureWasTreatmentReceived"),
                " Bone marrow failure was treatment received of the Medical History in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerTreatment,
                currentRow.get("BoneMarrowFailureTreatment"),
                " Bone marrow failure Treatment of the Medical History in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerReceivedBloodTransfusions,
                currentRow.get("DidYouReceiveOrReceivingBloodTransfusion"),
                " Did You receive Blood Transfusions of the Medical History in Fanconi Study Screener page ");
        CharmsUtil.clickOnElement(fanconiScreenerNVPage.nVFScreenerParticipantFeaturesTab);
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerLowBirthWeight,
                currentRow.get("LowBirthWeight"),
                " Low birth weight of the Participant Features in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerFeedingProblemsOrFailureToThrive,
                currentRow.get("FeedingProblemsOrFailureToThrive"),
                " Feeding problems or Failure to thrive of the Participant Features in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerShortStature,
                currentRow.get("ShortStature"),
                " Short Stature of the Participant Features in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerDevelopmentalDelay,
                currentRow.get("NeurocognitiveDevelopmentalDelay"),
                " Neurocognitive Developmental Delayof the Participant Features in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerSkinAbnormalities,
                currentRow.get("SkinAbnormalities"),
                "Skin abnormalities of the Participant Features in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerHeadCraniofacialAbnormalities,
                currentRow.get("HeadCraniofacialAbnormalities"),
                " Head Craniofacial Abnormalities of the Participant Features in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerMouthAbnormalities,
                currentRow.get("MouthAbnormalities"),
                " Mouth abnormalities of the Participant Features in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerEyeAbnormalities,
                currentRow.get("EyeAbnormalities"),
                " Eye Abnormalities of the Participant Features in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerEarAbnormalities,
                currentRow.get("EarAbnormalities"),
                " Ear Abnormalities of the Participant Features in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerExtremityAbnormalities,
                currentRow.get("ExtremityAbnormalities"),
                " Extremity Abnormalities of the Participant Features in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerSkeletalDeformities,
                currentRow.get("SkeletalDeformities"),
                " Skeletal Deformities of the Participant Features in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerHeartProblems,
                currentRow.get("HeartProblems"),
                " Heart Problems of the Participant Features in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerHeartProblemsOther,
                currentRow.get("HeartProblemsOther"),
                " Heart Problems Other of the Participant Features in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerKidneyAbnormalities,
                currentRow.get("KidneyAbnormalities"),
                " Kidney Abnormalities of the Participant Features in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerGenitalAbnormalities,
                currentRow.get("GenitalAbnormalities"),
                " Genital Abnormalities of the Participant Features in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerFertilityProblemsHypogonadism,
                currentRow.get("FertilityProblemsHypogonadism"),
                " Fertility Problems Hypogonadism of the Participant Features in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerEndocrineProblems,
                currentRow.get("EndocrineProblems"),
                " Endocrine Problems of the Participant Features in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerMetabolicDisorders,
                currentRow.get("MetabolicDisorders"),
                " Metabolic Disorders of the Participant Features in Fanconi Study Screener page ");
        CharmsUtil.clickOnElement(fanconiScreenerNVPage.nVFScreenerFinalInformationTab);
        CharmsUtil.assertDropDownData(softAssert,
                fanconiScreenerNVPage.nVFScreenerParticpantInNIHInheritedBoneMarrowFailureSyndromeStudy,
                currentRow.get("AreOrWereYouAParticipanInNIHInheritedBoneMarrowFailuresyndromeStudy"),
                " Particpant in NIH Inherited Bone Marrow Failure Syndrome study of the Final Information in Fanconi Study Screener page ");
        CharmsUtil.labelHighlight(
                fanconiScreenerNVPage.nVFScreenerParticpantInNIHInheritedBoneMarrowFailureSyndromeStudyLock);
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerMainReasonsForParticipatingInStudy,
                currentRow.get("MainReasonToParticipateInThisStudyAll"),
                "Main reasons for participating in this study of the Final Information in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerParticipateInResearch,
                currentRow.get("WhatAreMainReasonToParticipateInThisStudy1Details"),
                "Participate in research of the Final Information in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerScreenForPotentialCancerDiagnosis,
                currentRow.get("WhatAreMainReasonToParticipateInThisStudy2Details"),
                "Screen for potential cancer diagnosis of the Final Information in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerReceiveGeneticTesting,
                currentRow.get("WhatAreMainReasonToParticipateInThisStudy3Details"),
                "Receive genetic testing of the Final Information in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerOtherReasonForParticipation,
                currentRow.get("WhatAreMainReasonToParticipateInThisStudy4Details"),
                "Other reason for participation of the Final Information in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerPreviousStudies,
                currentRow.get("PreviousStudies"),
                " Previous studies of the Final Information in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerHowDidYouHearAboutThisStudy,
                currentRow.get("HowDidYouHearAboutThisStudy"),
                " How did you hear about this study of the Final Information in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerPhysician,
                currentRow.get("HearAboutThisStudyText"),
                " Health care provider of the Final Information in Fanconi Study Screener page ");
        CharmsUtil.clickOnElement(fanconiScreenerNVPage.nVFScreenerIntakeParticipatesInAnotherStudyTab);
        CommonUtils.scrollIntoView(fanconiScreenerNVPage.nVFScreenerIntakeParticipatesInAnotherStudyTable);
        List<WebElement> rowList = fanconiScreenerNVPage.nVFScreenerIntakeParticipatesInAnotherStudyTableLinks;
        for (int j = 0; j <= rowList.size() - 1; j++) {
            currentRowForAnotherStudy = CharmsUtil.testManagerData(excelSheet, "OtherStudies", j);
            CharmsUtil.clickOnElement(rowList.get(j));
            CharmsUtil.clickOnElement(fanconiScreenerNVPage.nVFScreenerOpenRecordButton);
            CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.IntakeParticipatesInAnotherStudyTitle,
                    "Intake participates in another study",
                    " Study Name in Intake participates title in another study in Fanconi Study Screener page ");
            CharmsUtil.assertTextBoxData(softAssert,
                    fanconiScreenerNVPage.nVFScreenerIntakeParticipatesStudyNameTextBox,
                    currentRowForAnotherStudy.get("ParticipantStudyNameInNV") + ": "
                            + currentRowForAnotherStudy.get("OtherStudyName"),
                    " Study Name in Intake participates in another study in Fanconi Study Screener page ");
            // Study Contact Person Assertion
            CharmsUtil.assertTextBoxData(softAssert,
                    fanconiScreenerNVPage.nVFScreenerIntakeParticipatesStudyContactPersonTextBox,
                    currentRowForAnotherStudy.get("OtherStudyContactPerson"),
                    " Study Contact Person in Intake participates in another study in Fanconi Study Screener page ");
            // Study Phone Number Assertion
            CharmsUtil.assertTextBoxData(softAssert,
                    fanconiScreenerNVPage.nVFScreenerIntakeParticipatesStudyPhoneNumberTextBox,
                    currentRowForAnotherStudy.get("OtherStudyPhoneNumber"),
                    " Study Phone Number in Intake participates in another study in Fanconi Study Screener page ");
            CharmsUtil.assertTextBoxData(softAssert,
                    fanconiScreenerNVPage.nVFScreenerIntakeParticipatesStartDateTextBox,
                    currentRowForAnotherStudy.get("OtherStudyParticipationYear1"),
                    " Start Date in Intake participates in another study in Fanconi Study Screener page ");
            CharmsUtil.assertTextBoxData(softAssert,
                    fanconiScreenerNVPage.nVFScreenerIntakeParticipatesStudyEndDateTextBox,
                    currentRowForAnotherStudy.get("OtherStudyParticipationYear2"),
                    " End Date in Intake participates in another study in Fanconi Study Screener page ");
            CharmsUtil.assertTextBoxData(softAssert,
                    fanconiScreenerNVPage.nVFScreenerIntakeParticipatesStudyInstitutionTextBox,
                    currentRowForAnotherStudy.get("OtherStudyInstitution"),
                    " Institution in Intake participates in another study in Fanconi Study Screener page ");
            CharmsUtil.assertDropDownData(softAssert,
                    fanconiScreenerNVPage.nVFScreenerIntakeParticipatesStudyCurrentlyParticipatingDropDown,
                    currentRowForAnotherStudy.get("OtherStudyCurrentlyParticipation"),
                    " Currently participating in Intake participates in another study in Fanconi Study Screener page ");
            CharmsUtil.assertTextBoxData(softAssert,
                    fanconiScreenerNVPage.nVFScreenerIntakeParticipatesStudyRelationshipToYouTextBox, "",
                    " Relationship to you in Intake participates in another study in Fanconi Study Screener page ");
            CharmsUtil.assertTextBoxData(softAssert,
                    fanconiScreenerNVPage.nVFScreenerIntakeParticipatesStudyFirstNameTextBox, "",
                    " First Name Intake participates in another study in Fanconi Study Screener page ");
            CharmsUtil.assertTextBoxData(softAssert,
                    fanconiScreenerNVPage.nVFScreenerIntakeParticipatesStudyLastNameTextBox, "",
                    " Last Name Intake participates in another study in Fanconi Study Screener page ");
            CharmsUtil.clickOnElement(fanconiScreenerNVPage.nVFScreenerBackButton);
            CommonUtils.scrollIntoView(fanconiScreenerNVPage.nVFScreenerIntakeParticipatesInAnotherStudyTable);
            CommonUtils.sleep(600);
        }
        CharmsUtil.clickOnElement(fanconiScreenerNVPage.nVFScreenerGeneticMutationvariantTab);
        CharmsUtil.clickOnElement(fanconiScreenerNVPage.nVFScreenerGeneticMutationvariantPreviewRecordButton);
        CharmsUtil.clickOnElement(fanconiScreenerNVPage.nVFScreenerOpenRecordButton);
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerGeneticMutationTitle,
                "Genetic Mutation/Variant", " Genetic Mutation/Variants Title in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerGeneticMutationScreenerTextBox,
                referralValue, " Screener in Genetic Mutation/Variants of Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerGeneticMutationGeneNameTextBox,
                currentRow.get("GeneName"), " Gene Name in Genetic Mutation/Variants of Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerGeneticMutationVariantTextBox,
                currentRow.get("MutationVariant1"),
                " Mutation/Variant in Genetic Mutation/Variants of Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerGeneticMutationInheritedFromDropDown,
                currentRow.get("InheritedFrom1"),
                " Inherited From in Genetic Mutation/Variants of Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerGeneticMutationVariant2TextBox,
                currentRow.get("MutationVariant2"),
                " Mutation/Variant 2 in Genetic Mutation/Variants of Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert,
                fanconiScreenerNVPage.nVFScreenerGeneticMutationInheritedFrom2DropDown,
                currentRow.get("InheritedFrom2"),
                " Inherited From 2 in Genetic Mutation/Variants of Fanconi Study Screener page ");
        CharmsUtil.clickOnElement(fanconiScreenerNVPage.nVFScreenerBackButton);
        CharmsUtil.clickOnElement(fanconiScreenerNVPage.nVFScreenerCancerHistoryTab);
        CharmsUtil.clickOnElement(fanconiScreenerNVPage.nVFScreenerCancerHistoryTableLinks);
        CharmsUtil.clickOnElement(fanconiScreenerNVPage.nVFScreenerOpenRecordButton);
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerCancerHistoryTitle,
                "CHARMS Referral Patient Cancer", " Cancer History Title in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerCancerHistoryTumorType,
                currentRowForCancerHistory.get("TumorType"), " Tumor Type in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerCancerHistoryMonthOfDiagnosis,
                currentRowForCancerHistory.get("TumorMonthOfDiagnosis"),
                " Month of diagnosis in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerCancerHistoryYearOfDiagnosis,
                currentRowForCancerHistory.get("TumorYearOfDiagnosis"),
                " Year of diagnosis in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert,
                fanconiScreenerNVPage.nVFScreenerCancerHistoryHowOldWhenCancerDiagnosed,
                currentRowForCancerHistory.get("TumorAgeAtDiagnosis"),
                " How old was the research participant when the cancer was diagnosed?in Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerCancerHistoryCurrentlyBeingTreated,
                currentRowForCancerHistory.get("AreYouCurrentlyReceivingTumorTreatment"),
                " Currently being treated in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerCancerHistoryTreatmentInstitution,
                currentRowForCancerHistory.get("TreatmentInstitution"),
                " Treatment Institution in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerCancerHistoryTreatingPhysician,
                currentRowForCancerHistory.get("TreatingPhysician"),
                " Treating Physician in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerCancerHistoryNameOfInstitution,
                currentRowForCancerHistory.get("NameOfInstitutionOrClinicWhereBiopsyOccured"),
                " Name of institution or clinic where biopsy occurred  in Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerCancerHistoryNameOfPhysician,
                currentRowForCancerHistory.get("NameOfPhysicianWhoPerformedBiopsy"),
                " Name of physician who performed the biopsy in Fanconi Study Screener page ");
        CharmsUtil.clickOnElement(fanconiScreenerNVPage.nVFScreenerBackButton);
        softAssert.assertAll();
    }
}
