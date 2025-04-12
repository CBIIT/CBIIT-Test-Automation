package CHARMS.steps;

import APPS_COMMON.Utils.Dynamic_Locators;
import APPS_COMMON.Utils.ServiceNow_Login_Methods;
import APPS_COMMON.PageInitializers.PageInitializer;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;

import java.util.*;

import static CHARMS.pages.RAS_Survey_Native_View_Page.*;
import static CHARMS.steps.RAS_Common_Methods.softAssertDropDownValueIsSelected;
import static Hooks.Hooks.softAssert;

public class RAS_Survey_Data_Verification_Steps extends PageInitializer {
    @Then("RAS Survey Data for Scenario One is verified")
    public void ras_survey_Data_for_scenario_one_is_verified() {
        /**
         * DATA VERIFICATION
         */
        /**
         * NAVIGATING TO RAS SURVEY TABLE
         */
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        CommonUtils.sendKeysToElement(nativeViewHomePage.nativeViewFilterNavigator, "CHARMS");
        JavascriptUtils.scrollIntoView(Dynamic_Locators.dynamicTextLocator("RASopathy Surveys"));
        CommonUtils.clickOnElement(Dynamic_Locators.dynamicTextLocator("RASopathy Surveys"));
        CommonUtils.switchToFrame(charmsNativeViewPage.nativeViewIframe);
        WebDriverUtils.webDriver.findElement(By.xpath("//a[@aria-label='Preview record: IIQ0001090']")).click();
        CommonUtils.clickOnElement(participantDetailsPage.openRecordButton);
        /**
         * EXAMPLE OF CLICKING ON TAB
         */
        CommonUtils.clickOnElement(ras_survey_native_view.dynamicTabLocator("RASopathy History"));
        /**
         *  ----- BEGINNING Basic information SECTION VALIDATION ----- DIEGO
         */
        /**
         *  ----- END Basic information SECTION VALIDATION ----- DIEGO
         */

        /** ----- BEGINNING DEMOGRAPHICS SECTION VALIDATION ----- HAMID */
        CommonUtils.clickOnElement(ras_survey_native_view.dynamicTabLocator("Demographics"));
        CommonUtils.verifyingDropDownValueIsSelected(ras_survey_native_view.includedInPublishedCaseReportDropDown, "", "-- VERIFYING THE SELECTED VALUE IN INCLUDED IN PUBLISHED CASE REPORT DROPDOWN");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(ras_survey_native_view.biologicalMotherBirthLocation), "", "-- VERIFYING BIOLOGICAL MOTHER BIRTH LOCATION --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(ras_survey_native_view.biologicalMotherBirthLocationUnknown), "", "VERIFYING BIOLOGICAL MOTHER BIRTH LOCATION UNKNOWN CHECKBOX");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(ras_survey_native_view.biologicalMothersAgeAtBirth), "", "VERIFYING BIOLOGICAL MOTHERS AGE AT BIRTH");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(ras_survey_native_view.biologicalMothersHeight), "", "VERIFYING BIOLOGICAL MOTHERS HEIGHT");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(ras_survey_native_view.biologicalMothersHeightUnknown), "", "VERIFYING BIOLOGICAL MOTHERS HEIGHT UNKNOWN CHECKBOX");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(ras_survey_native_view.biologicalFatherBirthLocation), "", "-- VERIFYING BIOLOGICAL FATHER BIRTH LOCATION --");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(ras_survey_native_view.biologicalFatherBirthLocationUnknown), "", "VERIFYING BIOLOGICAL FATHER BIRTH LOCATION UNKNOWN CHECKBOX");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(ras_survey_native_view.biologicalFathersAgeAtBirth), "", "VERIFYING BIOLOGICAL FATHERS AGE AT BIRTH");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(ras_survey_native_view.biologicalFathersHeight), "", "VERIFYING BIOLOGICAL FATHERS HEIGHT");
        CommonUtils.assertEqualsWithMessage(CommonUtils.getAttributeValueOfValueAttribute(ras_survey_native_view.biologicalFatherHeightUnknown), "", "VERIFYING BIOLOGICAL FATHERS HEIGHT UNKNOWN CHECKBOX");
        /**  ----- END DEMOGRAPHICS SECTION VALIDATION ----- HAMID      */

        /** ----- BEGINNING RASopathy History SECTION VALIDATION ----- ALENA         */
        CommonUtils.clickOnElement(ras_survey_native_view.dynamicTabLocator("RASopathy History"));
        CommonUtils.verifyingDropDownValueIsSelected(ras_survey_native_view.dropdownDiagnosedWithRasopathyByPhysician, "No", "No value is displayed for Diagnosed with a RASopathy by a physician through testing");
        /** ----- END RASopathy History SECTION VALIDATION ----- ALENA         */
        /** ----- BEGINNING Birth and Gestation SECTION VALIDATION ----- ALENA         */
        CommonUtils.clickOnElement(ras_survey_native_view.dynamicTabLocator("Birth & Gestation"));
        CommonUtils.verifyingDropDownValueIsSelected(ras_survey_native_view.dropdownDiagnosedWithHypoglycemiaDuringNewbornPeriod, "No", "No value is displayed for Diagnosed with hypoglycemia during the newborn period dropdown");
        CommonUtils.verifyingDropDownValueIsSelected(ras_survey_native_view.dropdownWereMedicationsTakenWhileMotherWasPregnant, "No", " No value is displayed for Were medications taken while biological mother was pregnant with the participant dropdown");
        CommonUtils.verifyingDropDownValueIsSelected(ras_survey_native_view.dropdownWereVapingProductsUsedDuringPregnancy, "No", "No value is displayed for Were vaping products use by participants bio mom during pregnancy dropdown");
        CommonUtils.verifyingDropDownValueIsSelected(ras_survey_native_view.dropdownDidBioMotherUsedRecreationalDrugsDuringPregnancy, "No", "No value is displayed for Did participants bio mother use recreational drugs during pregnancy dropdown");
        CommonUtils.assertEqualsWithMessage(ras_survey_native_view.fieldBiologicalMothersOccupationWhilePregnant.getText(), "Nurse", "Nurse value is displayed for Biological mothers occupation while pregnant with the participant field");
        CommonUtils.assertEqualsWithMessage(ras_survey_native_view.checkboxBiologicalMothersOccupationUnknown.getAttribute("value"), "false", "Biological mothers occupation unknown checkbox is unchecked");
        CommonUtils.verifyingDropDownValueIsSelected(ras_survey_native_view.dropdownDidBioMotherReceivePrenatalTests, "Yes", "Yes value is displayed for Did biological mother receive prenatal tests for birth defects/medical problems dropdown");
        CommonUtils.verifyingDropDownValueIsSelected(ras_survey_native_view.dropdownDidBioMotherUseTobacco, "Yes", "Yes value is displayed for Did participants biological mother use tobacco products while pregnant dropdown");
        CommonUtils.verifyingDropDownValueIsSelected(ras_survey_native_view.dropdownDidBioMotherUseAlcohol, "Yes", "Yes value is displayed for Did participants biological mother drink alcohol while pregnant with participant dropdown");
        CommonUtils.verifyingDropDownValueIsSelected(ras_survey_native_view.dropdownDidBioMotherEverLiveWorkWhereOtherUseTobacco, "Yes", "Yes value is displayed for Did the participants mother ever live/work in a place where others use tobacco dropdown");
        CommonUtils.assertEqualsWithMessage(ras_survey_native_view.fieldBioFatherOccupationWhileMotherWasPregnant.getText(), "", "No value is displayed for Biological mothers occupation while pregnant with the participant field");
        CommonUtils.assertEqualsWithMessage(ras_survey_native_view.checkboxBiologicalFathersOccupationUnknown.getAttribute("value"), "false", "Biological fathers occupation unknown checkbox is unchecked");
        /** ----- END Birth and Gestation SECTION VALIDATION ----- ALENA
         /**
         *  ----- BEGINNING GROWTH SECTION VALIDATION ----- DIEGO
         */
        /**  ----- END GROWTH SECTION VALIDATION ----- DIEGO**/
    }

    /**
     * This method verifies the RAS Survey data for scenario two in Native View within the "Demographics" section.
     */
    public void verify_ras_survey_data_scenarioTwo_demographics_section() {
        CommonUtils.waitForVisibility(ras_survey_native_view.dynamicTabLocator("Demographics"));
        JavascriptUtils.scrollIntoView(ras_survey_native_view.dynamicTabLocator("Demographics"));
        CommonUtils.clickOnElement(ras_survey_native_view.dynamicTabLocator("Demographics"));
        CommonUtils.waitForVisibility(ras_survey_native_view.includedInPublishedCaseReportDropDown);
        softAssertDropDownValueIsSelected(ras_survey_native_view.includedInPublishedCaseReportDropDown, ras_Survey_TestDataManager.haveYouEverBeenIncluded, "* * * * * RAS SURVEY MISMATCH IN 'Included in published case report or in a different public manner' DROPDOWN * * * * *");
        softAssert.assertEquals(ras_survey_native_view.publishedCaseReportAdditionalInformationInputField.getText(), ras_Survey_TestDataManager.pleaseProvideAnyAdditionalInformation, "* * * * * RAS SURVEY MISMATCH IN 'Additional information about authors, publication year or PubMedID' INPUT FIELD * * * * *");
        verifyInputField(ras_survey_native_view.biologicalMotherBirthLocation, ras_Survey_TestDataManager.pleaseCompleteYourBiologicalParentsBiologicalMotherCity, "* * * * * RAS SURVEY MISMATCH IN 'Biological mother birth location' INPUT FIELD * * * * *");
        verifyCheckbox("true", ras_survey_native_view.biologicalMotherBirthLocationUnknown, "* * * * * RAS SURVEY MISMATCH IN 'Biological mother birth location unknown' CHECKBOX * * * * *");
        verifyInputField(ras_survey_native_view.biologicalMothersAgeAtBirth, ras_Survey_TestDataManager.pleaseCompleteYourBiologicalParentsBiologicalMotherAge, "* * * * * RAS SURVEY MISMATCH IN 'Biological mothers age at birth' * * * * *");
        softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(ras_survey_native_view.biologicalMothersHeight), ras_survey_native_view.inchToCm(ras_Survey_TestDataManager.whatIsTheHeightOfYourBiologicalMother), "* * * * * RAS SURVEY MISMATCH IN 'Biological mothers height (cm)' * * * * *");
        verifyCheckbox("true", ras_survey_native_view.biologicalMothersHeightUnknown, "* * * * * RAS SURVEY MISMATCH IN 'Biological mothers height unknown' CHECKBOX * * * * *");
        verifyInputField(ras_survey_native_view.biologicalFatherBirthLocation, ras_Survey_TestDataManager.pleaseCompleteYourBiologicalParentsBiologicalFatherCity, "* * * * * RAS SURVEY MISMATCH IN 'Biological father birth location' INPUT FIELD * * * * *");
        verifyCheckbox("true", ras_survey_native_view.biologicalFatherBirthLocationUnknown, "* * * * * RAS SURVEY MISMATCH IN 'Biological father birth location unknown' CHECKBOX * * * * *");
        verifyInputField(ras_survey_native_view.biologicalFathersAgeAtBirth, ras_Survey_TestDataManager.pleaseCompleteYourBiologicalParentsBiologicalFatherAge, "* * * * * RAS SURVEY MISMATCH IN 'Biological fathers age at birth' INPUT FIELD * * * * *");
        softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(ras_survey_native_view.biologicalFathersHeight).replace(",", ""), ras_survey_native_view.inchToCm(ras_Survey_TestDataManager.whatIsTheHeightOfYourBiologicalFather), "* * * * * RAS SURVEY MISMATCH IN 'Biological fathers height (cm)' INPUT FIELD * * * * *");
        verifyCheckbox("true", ras_survey_native_view.biologicalFatherHeightUnknown, "* * * * * RAS SURVEY MISMATCH IN 'Biological fathers height unknown' CHECKBOX * * * * *");
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method verifies the RAS Survey data for scenario two in Native View within the "RASopathy History" section.
     */
    public void verify_ras_survey_data_scenarioTwo_rasopathy_history_section() {
        CommonUtils.clickOnElement(ras_survey_native_view.dynamicTabLocator("RASopathy History"));
        CommonUtils.sleep(800);
        CommonUtils.waitForVisibility(ras_survey_native_view.dropdownDiagnosedWithRasopathyByPhysician);
        List<String> expectedDiagnosedRasopathies = new ArrayList<>() {
            {
                add(ras_Survey_TestDataManager.pleaseIndicateIfYouHaveBeenDiagnosedWithRASopathiesOption1);
                add(ras_Survey_TestDataManager.pleaseIndicateIfYouHaveBeenDiagnosedWithRASopathiesOption2);
                add(ras_Survey_TestDataManager.pleaseIndicateIfYouHaveBeenDiagnosedWithRASopathiesOption3);
                add(ras_Survey_TestDataManager.pleaseIndicateIfYouHaveBeenDiagnosedWithRASopathiesOption4);
                add(ras_Survey_TestDataManager.pleaseIndicateIfYouHaveBeenDiagnosedWithRASopathiesOption5);
                add(ras_Survey_TestDataManager.pleaseIndicateIfYouHaveBeenDiagnosedWithRASopathiesOption6);
                add(ras_Survey_TestDataManager.pleaseIndicateIfYouHaveBeenDiagnosedWithRASopathiesOption7);
                add(ras_Survey_TestDataManager.pleaseIndicateIfYouHaveBeenDiagnosedWithRASopathiesOption8);
                add(ras_Survey_TestDataManager.pleaseIndicateIfYouHaveBeenDiagnosedWithRASopathiesOption9);
            }
        };
        softAssert.assertTrue(sortAndCompareLists(ras_survey_native_view.textToList(ras_survey_native_view.diagnosedRasopathiesTextList), expectedDiagnosedRasopathies), "* * * * * RAS SURVEY MISMATCH IN 'Diagnosed RASopathies' TEXT LIST * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.dropdownDiagnosedWithRasopathyByPhysician, ras_Survey_TestDataManager.haveYouBeenDiagnosedWithARASopathy, "* * * * * RAS SURVEY MISMATCH IN 'Diagnosed with a RASopathy by a physician through testing' INPUT FIELD * * * * *");
        verifyInputField(ras_survey_native_view.specifyOtherRasopathyInputField, ras_Survey_TestDataManager.pleaseIndicateIfYouHaveBeenDiagnosedWithRASopathiesOption9Other, "* * * * * Please specify other RASopathy' INPUT FIELD * * * * *");
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method verifies the RAS Survey data for scenario two in Native View within the "Birth & Gestation" section.
     */
    public void verify_ras_survey_data_scenarioTwo_birth_and_gestation_section() {
        CommonUtils.waitForVisibility(ras_survey_native_view.dynamicTabLocator("Birth & Gestation"));
        JavascriptUtils.scrollIntoView(ras_survey_native_view.dynamicTabLocator("Birth & Gestation"));
        CommonUtils.clickOnElement(ras_survey_native_view.dynamicTabLocator("Birth & Gestation"));
        CommonUtils.waitForVisibility(ras_survey_native_view.dropdownDiagnosedWithHypoglycemiaDuringNewbornPeriod);
        softAssertDropDownValueIsSelected(ras_survey_native_view.dropdownDiagnosedWithHypoglycemiaDuringNewbornPeriod, ras_Survey_TestDataManager.wereYouDiagnosedWithHypoglycemia, "* * * * * RAS SURVEY MISMATCH IN 'Diagnosed with hypoglycemia during the newborn period' DROPDOWN * * * * *");
        List<String> expectedIssuesPriorToBirth = new ArrayList<>() {
            {
                add(ras_Survey_TestDataManager.wereYouDiagnosedWithAnyOfTheFollowingDuringPregnancyOption1);
                add(ras_Survey_TestDataManager.wereYouDiagnosedWithAnyOfTheFollowingDuringPregnancyOption2);
                add(ras_Survey_TestDataManager.wereYouDiagnosedWithAnyOfTheFollowingDuringPregnancyOption3);
                add(ras_Survey_TestDataManager.wereYouDiagnosedWithAnyOfTheFollowingDuringPregnancyOption4);
                add(ras_Survey_TestDataManager.wereYouDiagnosedWithAnyOfTheFollowingDuringPregnancyOption5);
                add(ras_Survey_TestDataManager.wereYouDiagnosedWithAnyOfTheFollowingDuringPregnancyOption6);
                add(ras_Survey_TestDataManager.wereYouDiagnosedWithAnyOfTheFollowingDuringPregnancyOption7);

            }
        };
        softAssert.assertTrue(sortAndCompareLists(ras_survey_native_view.textToList(ras_survey_native_view.issuesPriorToBirthTextList), expectedIssuesPriorToBirth), "* * * * * RAS SURVEY MISMATCH IN 'Issues identified in the participant prior to birth' TEXT LIST * * * * *");
        List<String> expectedVapingProductsUsedWhilePregnant = new ArrayList<>() {
            {
                add(ras_Survey_TestDataManager.whichVapingProductsDidYourMotherUseOption1);
                add(ras_Survey_TestDataManager.whichVapingProductsDidYourMotherUseOption2);
                add(ras_Survey_TestDataManager.whichVapingProductsDidYourMotherUseOption3);
                add(ras_Survey_TestDataManager.whichVapingProductsDidYourMotherUseOption4);
                add(ras_Survey_TestDataManager.whichVapingProductsDidYourMotherUseOption5);
                add(ras_Survey_TestDataManager.whichVapingProductsDidYourMotherUseOption6);
                add(ras_Survey_TestDataManager.whichVapingProductsDidYourMotherUseOption7);
                add(ras_Survey_TestDataManager.whichVapingProductsDidYourMotherUseOption8);
                add(ras_Survey_TestDataManager.whichVapingProductsDidYourMotherUseOption9);
                add(ras_Survey_TestDataManager.whichVapingProductsDidYourMotherUseOption10);
            }
        };
        softAssert.assertTrue(sortAndCompareLists(ras_survey_native_view.textToList(ras_survey_native_view.vapingProductsTextList), expectedVapingProductsUsedWhilePregnant), "* * * * * RAS SURVEY MISMATCH IN 'Vape products used' TEXT LIST * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.dropdownWereMedicationsTakenWhileMotherWasPregnant, ras_Survey_TestDataManager.duringHerPregnancyWithYouSupplements, "* * * * * RAS SURVEY MISMATCH IN 'Were medications taken while biological mother was pregnant with the participant' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.dropdownWereVapingProductsUsedDuringPregnancy, ras_Survey_TestDataManager.didYourBiologicalMotherUseAnyVaping, "* * * * * RAS SURVEY MISMATCH IN 'Were vaping products use by participants bio mom during pregnancy' DROPDOWN * * * * *");
        verifyInputField(ras_survey_native_view.specifyVapeProductsInputField, ras_Survey_TestDataManager.whichVapingProductsDidYourMotherUseOption10PleaseSpecify, "* * * * * RAS SURVEY MISMATCH IN 'Please specify (vape products used)' * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.dropdownDidBioMotherUsedRecreationalDrugsDuringPregnancy, ras_Survey_TestDataManager.didYourBiologicalMotherUseAnyRecreationalDrugs, "* * * * * RAS SURVEY MISMATCH IN 'Did participants bio mother use recreational drugs during pregnancy' DROPDOWN * * * * *");
        List<String> expectedDrugsUsedByBiologicalMotherWhilePregnant = new ArrayList<>() {
            {
                add(ras_Survey_TestDataManager.whatRecreationalDrugOption1);
                add(ras_Survey_TestDataManager.whatRecreationalDrugOption2);
                add(ras_Survey_TestDataManager.whatRecreationalDrugOption3);
                add(ras_Survey_TestDataManager.whatRecreationalDrugOption4);
                add(ras_Survey_TestDataManager.whatRecreationalDrugOption5);
                add(ras_Survey_TestDataManager.whatRecreationalDrugOption6);
                add(ras_Survey_TestDataManager.whatRecreationalDrugOption7);
                add(ras_Survey_TestDataManager.whatRecreationalDrugOption8);
                add(ras_Survey_TestDataManager.whatRecreationalDrugOption9);
                add(ras_Survey_TestDataManager.whatRecreationalDrugOption10);
                add(ras_Survey_TestDataManager.whatRecreationalDrugOption11);
            }
        };
        softAssert.assertTrue(sortAndCompareLists(ras_survey_native_view.textToList(ras_survey_native_view.recreationalDrugsUsedWhilePregnantTextList), expectedDrugsUsedByBiologicalMotherWhilePregnant), "* * * * * RAS SURVEY MISMATCH IN 'Drugs used by biological mother during pregnancy' TEXT LIST * * * * *");
        verifyInputField(ras_survey_native_view.specifyRecreationalDrugsUsedByMotherDuringPregnancyInputField, ras_Survey_TestDataManager.whatRecreationalDrugOption11Other, "* * * * * RAS SURVEY MISMATCH IN 'Please specify (Drugs used by biological mother during pregnancy)' INPUT FIELD * * * * *");
        verifyInputField(ras_survey_native_view.biologicalMothersOccupationWhilePregnantTextArea, ras_Survey_TestDataManager.biologicalMotherOccupationDuringPregnancy, "* * * * * RAS SURVEY MISMATCH IN 'Biological mothers occupation while pregnant with the participant' INPUT FIELD * * * * *");
        verifyCheckbox("true", ras_survey_native_view.checkboxBiologicalMothersOccupationUnknown, "* * * * * RAS SURVEY MISMATCH IN 'Biological mother occupation unknown' CHECKBOX * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.dropdownDidBioMotherReceivePrenatalTests, ras_Survey_TestDataManager.duringHerPregnancyWithYou, "* * * * * RAS SURVEY MISMATCH IN 'Did biological mother receive prenatal tests for birth defects/medical problems' DROPDOWN * * * * *");
        List<String> expectedMotherBirthComplicationsTextList = new ArrayList<>() {
            {
                add(ras_Survey_TestDataManager.wasYourBiologicalMotherDiagnosedOption1);
                add(ras_Survey_TestDataManager.wasYourBiologicalMotherDiagnosedOption2);
                add(ras_Survey_TestDataManager.wasYourBiologicalMotherDiagnosedOption3);
                add(ras_Survey_TestDataManager.wasYourBiologicalMotherDiagnosedOption4);
                add(ras_Survey_TestDataManager.wasYourBiologicalMotherDiagnosedOption5);
                add(ras_Survey_TestDataManager.wasYourBiologicalMotherDiagnosedOption6);
                add(ras_Survey_TestDataManager.wasYourBiologicalMotherDiagnosedOption7);
                add(ras_Survey_TestDataManager.wasYourBiologicalMotherDiagnosedOption8);
                add(ras_Survey_TestDataManager.wasYourBiologicalMotherDiagnosedOption9);
                add(ras_Survey_TestDataManager.wasYourBiologicalMotherDiagnosedOption10);
            }
        };
        softAssert.assertTrue(sortAndCompareLists(ras_survey_native_view.textToList(ras_survey_native_view.participantMotherBirthComplicationsTextList), expectedMotherBirthComplicationsTextList), "* * * * * RAS SURVEY MISMATCH IN 'Participant mother's birth complications' TEXT LIST * * * * *");
        verifyInputField(ras_survey_native_view.infectionPregnancyConditionInputField, ras_Survey_TestDataManager.wasYourBiologicalMotherDiagnosedOption8PleaseSpecify, "* * * * * RAS SURVEY MISMATCH IN 'Infection (please specify)' INPUT FIELD * * * * *");
        verifyInputField(ras_survey_native_view.rashPregnancyConditionInputField, ras_Survey_TestDataManager.wasYourBiologicalMotherDiagnosedOption9PleaseSpecify, "* * * * * RAS SURVEY MISMATCH IN 'Rash (please specify)' INPUT FIELD * * * * *");
        verifyInputField(ras_survey_native_view.otherComplicationInputField, ras_Survey_TestDataManager.wasYourBiologicalMotherDiagnosedOption10PleaseSpecify, "* * * * * RAS SURVEY MISMATCH IN 'Other complication' INPUT FIELD * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.dropdownDidBioMotherUseTobacco, ras_Survey_TestDataManager.didYourBiologicalMotherUseAnyTobacco, "* * * * * RAS SURVEY MISMATCH IN 'Did participants biological mother use tobacco products while pregnant?' DROPDOWN * * * * *");
        List<String> expectedTobaccoProductsUsedByMotherDuringPregnancyTextList = new ArrayList<>() {
            {
                add(ras_Survey_TestDataManager.whatTobaccoProductsDidYourBiologicalMotherOption1);
                add(ras_Survey_TestDataManager.whatTobaccoProductsDidYourBiologicalMotherOption2);
                add(ras_Survey_TestDataManager.whatTobaccoProductsDidYourBiologicalMotherOption3);
                add(ras_Survey_TestDataManager.whatTobaccoProductsDidYourBiologicalMotherOption4);
                add(ras_Survey_TestDataManager.whatTobaccoProductsDidYourBiologicalMotherOption5);
                add(ras_Survey_TestDataManager.whatTobaccoProductsDidYourBiologicalMotherOption6);
            }
        };
        softAssert.assertTrue(sortAndCompareLists(ras_survey_native_view.textToList(ras_survey_native_view.tobaccoProductsUsedByMotherWhilePregnantTextList), expectedTobaccoProductsUsedByMotherDuringPregnancyTextList), "* * * * * RAS SURVEY MISMATCH IN 'Tobacco products used by mother during pregnancy' TEXT LIST * * * * *");
        verifyInputField(ras_survey_native_view.specifyTobaccoUsedByMotherDuringPregnancyInputField, ras_Survey_TestDataManager.whatTobaccoProductsDidYourBiologicalMotherOption6PleaseSpecify, "* * * * * RAS SURVEY MISMATCH IN 'Please specify (Tobacco products used by mother during pregnancy)' INPUT FIELD * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.dropdownDidBioMotherUseAlcohol, ras_Survey_TestDataManager.didYourBiologicalMotherDrink, "* * * * * RAS SURVEY MISMATCH IN 'Did participants biological mother drink alcohol while pregnant with participant' DROPDOWN * * * * *");
        List<String> expectedAlcoholUsedByMotherDuringPregnancyTextList = new ArrayList<>() {
            {
                add(ras_Survey_TestDataManager.WhatAlcoholicBeveragesDidYourMotherDrinkOption1);
                add(ras_Survey_TestDataManager.WhatAlcoholicBeveragesDidYourMotherDrinkOption2);
                add(ras_Survey_TestDataManager.WhatAlcoholicBeveragesDidYourMotherDrinkOption3);
                add(ras_Survey_TestDataManager.WhatAlcoholicBeveragesDidYourMotherDrinkOption4);
                add(ras_Survey_TestDataManager.WhatAlcoholicBeveragesDidYourMotherDrinkOption5);
            }
        };
        softAssert.assertTrue(sortAndCompareLists(ras_survey_native_view.textToList(ras_survey_native_view.alcoholUsedByMotherWhilePregnantTextList), expectedAlcoholUsedByMotherDuringPregnancyTextList), "* * * * * RAS SURVEY MISMATCH IN 'Alcohol used by mom during pregnancy' TEXT LIST * * * * *");
        verifyInputField(ras_survey_native_view.specifyAlcoholUsedByMotherDuringPregnancyInputField, ras_Survey_TestDataManager.WhatAlcoholicBeveragesDidYourMotherDrinkOption5Other, "* * * * * RAS SURVEY MISMATCH IN 'Please specify (Alcohol used by mom during pregnancy)' INPUT FIELD * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.dropdownDidBioMotherEverLiveWorkWhereOtherUseTobacco, ras_Survey_TestDataManager.didYourBiologicalMotherEverLiveWhereSmokedCigarettes, "* * * * * RAS SURVEY MISMATCH IN 'Did the participants mother ever live/work in a place where others use tobacco' DROPDOWN * * * * *");
        List<String> expectedTobaccoProductsUsedAroundMotherWhilePregnantTextList = new ArrayList<>() {
            {
                add(ras_Survey_TestDataManager.whatProductsWereUsedAroundOption1);
                add(ras_Survey_TestDataManager.whatProductsWereUsedAroundOption2);
                add(ras_Survey_TestDataManager.whatProductsWereUsedAroundOption3);
                add(ras_Survey_TestDataManager.whatProductsWereUsedAroundOption4);
            }
        };
        softAssert.assertTrue(sortAndCompareLists(ras_survey_native_view.textToList(ras_survey_native_view.tobaccoProductsUsedAroundMotherWhilePregnantTextList), expectedTobaccoProductsUsedAroundMotherWhilePregnantTextList), "* * * * * RAS SURVEY MISMATCH IN 'Tobacco products used around mother during pregnancy' TEXT LIST * * * * *");
        verifyInputField(ras_survey_native_view.specifyTobaccoUsedAroundMotherDuringPregnancyInputField, ras_Survey_TestDataManager.whatProductsWereUsedAroundOption4Other, "* * * * * RAS SURVEY MISMATCH IN 'Please specify (Tobacco products used around mother during pregnancy)' INPUT FIELD * * * * *");
        verifyInputField(ras_survey_native_view.fieldBioFatherOccupationWhileMotherWasPregnant, ras_Survey_TestDataManager.biologicalMotherOccupationDuringPregnancyFather, "* * * * * RAS SURVEY MISMATCH IN 'Biological fathers occupation while mother was pregnant with the participant' INPUT FIELD * * * * *");
        verifyCheckbox("true", ras_survey_native_view.biologicalFatherOccupationUnknownCheckbox, "* * * * * RAS SURVEY MISMATCH IN 'Biological father occupation unknown' CHECKBOX * * * * *");
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method verifies the RAS Survey data for scenario two in Native View within the "Growth" section.
     */
    public void verify_ras_survey_data_scenarioTwo_growth_section() {
        CommonUtils.waitForVisibility(ras_survey_native_view.dynamicTabLocator("Growth"));
        JavascriptUtils.scrollIntoView(ras_survey_native_view.dynamicTabLocator("Growth"));
        CommonUtils.clickOnElement(ras_survey_native_view.dynamicTabLocator("Growth"));
        CommonUtils.waitForVisibility(ras_survey_native_view.hasTheParticipantHadGrowthHormoneTestingDropdown);
        List<String> expectedGrowthHormoneTestResultsTextList = new ArrayList<>() {
            {
                add(ras_Survey_TestDataManager.whatWereTheResultsOfYourGrowthHormoneOption1);
                add(ras_Survey_TestDataManager.whatWereTheResultsOfYourGrowthHormoneOption2);
                add(ras_Survey_TestDataManager.whatWereTheResultsOfYourGrowthHormoneOption3);
                add(ras_Survey_TestDataManager.whatWereTheResultsOfYourGrowthHormoneOption4);
            }
        };
        softAssertDropDownValueIsSelected(ras_survey_native_view.hasTheParticipantHadGrowthHormoneTestingDropdown, ras_Survey_TestDataManager.haveYouEverHadGrowthHormoneTesting, "* * * * * RAS SURVEY MISMATCH IN 'Has the participant had growth hormone testing?' DROPDOWN * * * * *");
        softAssert.assertTrue(sortAndCompareLists(ras_survey_native_view.textToList(ras_survey_native_view.growthHormoneTestResultsTextList), expectedGrowthHormoneTestResultsTextList), "* * * * * RAS SURVEY MISMATCH IN 'Growth Hormone test results' TEXT LIST * * * * *");
        verifyInputField(ras_survey_native_view.pleaseSpecifyGrowthHormoneTestResultsInputField, ras_Survey_TestDataManager.whatWereTheResultsOfYourGrowthHormoneOption4Other, "* * * * * RAS SURVEY MISMATCH IN 'Please specify (Growth Hormone test results)' INPUT FIELD * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.hasTheParticipantReceivedGrowthHormoneTreatmentDropdown, ras_Survey_TestDataManager.haveYouEverReceivedGrowthHormoneTreatment, "* * * * * RAS SURVEY MISMATCH IN 'Has the participant received growth hormone treatment?' DROPDOWN * * * * *");
        verifyInputField(ras_survey_native_view.heightBeforeStartingGrowthHormoneInputField, ras_Survey_TestDataManager.whatWasYourHeightBeforeStartingGrowthHormoneHeight, "* * * * * RAS SURVEY MISMATCH IN 'Height before starting growth hormone' INPUT FIELD * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.howManyTimesHasTheParticipantReceivedGrowthHormoneTreatmentDropdown, ras_Survey_TestDataManager.howManyTimesHaveYouReceivedGrowthHormoneTreatment, "* * * * * RAS SURVEY MISMATCH IN 'How many times has the participant received growth hormone treatment' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.hasTheParticipantEverBeenEvaluatedByAnEndocrinologistForAnyReasonDropdown, ras_Survey_TestDataManager.haveYouEverBeenEvaluatedByAnEndocrinologist, "* * * * * RAS SURVEY MISMATCH IN 'Has the participant ever been evaluated by an endocrinologist for any reason? ' DROPDOWN * * * * *");
        verifyInputField(ras_survey_native_view.doctorMedicalProviderNameInputField, ras_Survey_TestDataManager.whatIsTheNameOfTheEndocrinologistDoctor, "* * * * * RAS SURVEY MISMATCH IN 'Doctor/medical provider name' INPUT FIELD * * * * *");
        verifyInputField(ras_survey_native_view.locationCityStateCountryInputField, ras_Survey_TestDataManager.whatIsTheNameOfTheEndocrinologistLocation, "* * * * * RAS SURVEY MISMATCH IN 'Location (City, State, Country)' INPUT FIELD * * * * *");
        verifyInputField(ras_survey_native_view.hospitalOrHealthSystemAffiliationInputField, ras_Survey_TestDataManager.whatIsTheNameOfTheEndocrinologistHospital, "* * * * * RAS SURVEY MISMATCH IN 'Hospital or Health System Affiliation' INPUT FIELD * * * * *");
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method verifies the RAS Survey data for scenario two in Native View within the "Development" section.
     */
    public void verify_ras_survey_data_scenarioTwo_development_section() {
        CommonUtils.waitForVisibility(ras_survey_native_view.dynamicTabLocator("Development"));
        JavascriptUtils.scrollIntoView(ras_survey_native_view.dynamicTabLocator("Development"));
        CommonUtils.clickOnElement(ras_survey_native_view.dynamicTabLocator("Development"));
        CommonUtils.waitForVisibility(ras_survey_native_view.wasTheParticipantDiagnosedWithHypotoniaAsAnInfantOrChildDropdown);
        softAssertDropDownValueIsSelected(ras_survey_native_view.wasTheParticipantDiagnosedWithHypotoniaAsAnInfantOrChildDropdown, ras_Survey_TestDataManager.wereYouEverDiagnosedWithHypotoniaAsAnInfantOrChild, "* * * * * RAS SURVEY MISMATCH IN 'Was the participant diagnosed with hypotonia as an infant or child?' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.hasTheParticipantEverReceivedPhysicalTherapyDropdown, ras_Survey_TestDataManager.haveYouEverReceivedPhysicalTherapy, "* * * * * RAS SURVEY MISMATCH IN 'Has the participant ever received physical therapy' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.howWouldYouDescribeTheParticipantCurrentSpeechCapabilitiesDropdown, ras_Survey_TestDataManager.howWouldYouDescribeYourCurrentSpeechCapabilities, "* * * * * RAS SURVEY MISMATCH IN 'How would you describe the participant's current speech capabilities?' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.hasTheParticipantEverReceivedSpeechTherapyDropdown, ras_Survey_TestDataManager.haveYouEverReceivedSpeechTherapy, "* * * * * RAS SURVEY MISMATCH IN 'Has the participant ever received speech therapy?' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.didTheParticipantReceiveOccupationTherapyBetweenTheAgesOf3And6Dropdown, ras_Survey_TestDataManager.didYouReceiveOccupationalTherapyBetween3And6YearsOfAge, "* * * * * RAS SURVEY MISMATCH IN 'Did the participant receive occupation therapy between the ages of 3 & 6' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.currentEmploymentStatusDropdown, ras_Survey_TestDataManager.whatIsYourCurrentEmploymentStatus, "* * * * * RAS SURVEY MISMATCH IN 'Current employment status' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.participantsHighestLevelOfSchoolingDropdown, ras_Survey_TestDataManager.pleaseIndicateTheHighestDegree, "* * * * * RAS SURVEY MISMATCH IN 'Participants highest level of schooling' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.atWhatAgeWasTheParticipantAbleToSitWithoutSupportDropdown, ras_Survey_TestDataManager.atWhatAgeWereYouAbleToSitWithoutSupport, "* * * * * RAS SURVEY MISMATCH IN 'At what age was the participant able to sit without support' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.atWhatAgeWasTheParticipantAbleToWalkWithoutSupportDropdown, ras_Survey_TestDataManager.atWhatAgeWereYouAbleToWalkWithoutSupport, "* * * * * RAS SURVEY MISMATCH IN 'At what age was the participant able to walk without support?' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.atWhatAgeWasTheParticipantAbleToUseSimpleTwoWordPhrasesDropdown, ras_Survey_TestDataManager.atWhatAgeWereYouAbleToUseSimpleTwoWordPhrases, "* * * * * RAS SURVEY MISMATCH IN 'At what age was the participant able to use simple two-word phrases?' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.diagnosedWithCognitiveDevelopmentIssuesBetweenAges3And6Dropdown, ras_Survey_TestDataManager.betweenTheAgesOf3And6YearsOld, "* * * * * RAS SURVEY MISMATCH IN 'Diagnosed with cognitive development issues between ages 3 & 6' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.schoolingBetweenTheAgesOf6And10Dropdown, ras_Survey_TestDataManager.betweenTheAgesOf6And10, "* * * * * RAS SURVEY MISMATCH IN 'Schooling between the ages of 6 and 10' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.schoolingAge10To17Dropdown, ras_Survey_TestDataManager.betweenTheAgesOf10And17, "* * * * * RAS SURVEY MISMATCH IN 'Schooling age 10 to 17' DROPDOWN * * * * *");
        List<String> expectedParticipantsDiagnosedLearningDifferencesTextList = new ArrayList<>() {
            {
                add(ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithLearningDifferencesOption1);
                add(ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithLearningDifferencesOption2);
                add(ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithLearningDifferencesOption3);
                add(ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithLearningDifferencesOption4);
            }
        };
        softAssert.assertTrue(sortAndCompareLists(ras_survey_native_view.textToListHyphenated(ras_survey_native_view.participantsDiagnosedLearningDifferencesTextList), expectedParticipantsDiagnosedLearningDifferencesTextList), "* * * * * RAS SURVEY MISMATCH IN 'Participants diagnosed learning differences' TEXT LIST * * * * *");
        verifyInputField(ras_survey_native_view.pleaseSpecifyParticipantsDiagnosedLearningDifferencesInputField, ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithLearningDifferencesOption4Other, "* * * * * RAS SURVEY MISMATCH IN 'Please specify(Participants diagnosed learning differences)' INPUT FIELD * * * * *");
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method verifies the RAS Survey data for scenario two in Native View within the "Heart" section.
     */
    public void verify_ras_survey_data_scenarioTwo_heart_section() {
        CommonUtils.waitForVisibility(ras_survey_native_view.dynamicTabLocator("Heart"));
        JavascriptUtils.scrollIntoView(ras_survey_native_view.dynamicTabLocator("Heart"));
        CommonUtils.clickOnElement(ras_survey_native_view.dynamicTabLocator("Heart"));
        CommonUtils.waitForVisibility(ras_survey_native_view.hasTheParticipantBeenEvaluatedByACardiologistDropdown);
        softAssertDropDownValueIsSelected(ras_survey_native_view.hasTheParticipantBeenEvaluatedByACardiologistDropdown, ras_Survey_TestDataManager.haveYouEverBeenEvaluatedByACardiologist, "* * * * * RAS SURVEY MISMATCH IN 'Has the participant been evaluated by a cardiologist?' DROPDOWN * * * * *");
        verifyInputField(ras_survey_native_view.nameOfCardiologistInputField, ras_Survey_TestDataManager.whatIsTheNameOfTheCardiologistDoctor, "* * * * * RAS SURVEY MISMATCH IN 'Name of cardiologist' INPUT FIELD * * * * *");
        verifyInputField(ras_survey_native_view.locationOfCardiologistInputField, ras_Survey_TestDataManager.whatIsTheNameOfTheCardiologistLocation, "* * * * * RAS SURVEY MISMATCH IN 'Location (City, State, Country)' INPUT FIELD * * * * *");
        verifyInputField(ras_survey_native_view.getHospitalOrHealthSystemAffiliationInputFieldInputField, ras_Survey_TestDataManager.whatIsTheNameOfTheCardiologistHospital, "* * * * * RAS SURVEY MISMATCH IN 'Hospital or Health Center Affiliation' INPUT FIELD * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.hasTheParticipantReceivedHeartTreatmentDropdown, ras_Survey_TestDataManager.haveYouEverReceivedTreatmentForHeartProblems, "* * * * * RAS SURVEY MISMATCH IN 'Has the participant received treatment for heart problems?' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.hasTheParticipantBeenDiagnosedWithAFunctionalHeartIssueDropdown, ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithAnyFunctionalHeartIssues, "* * * * * RAS SURVEY MISMATCH IN 'Has the participant been diagnosed with a functional heart issue?' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.hasTheParticipantBeenDiagnosedWithAStructuralHeartIssueDropdown, ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithAnyStructuralHeartIssues, "* * * * * RAS SURVEY MISMATCH IN 'Has the participant been diagnosed with  structural heart issues?' DROPDOWN * * * * *");
        List<String> expectedParticipantsHeartIssuesTextList = new ArrayList<>() {
            {
                add(ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithAnyOfTheFollowingStructuralHeartIssuesOption1);
                add(ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithAnyOfTheFollowingStructuralHeartIssuesOption2);
                add(ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithAnyOfTheFollowingStructuralHeartIssuesOption3);
                add(ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithAnyOfTheFollowingStructuralHeartIssuesOption4);
                add(ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithAnyOfTheFollowingStructuralHeartIssuesOption5);
                add(ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithAnyOfTheFollowingStructuralHeartIssuesOption6);
            }
        };
        softAssert.assertTrue(sortAndCompareLists(ras_survey_native_view.textToListHyphenated(ras_survey_native_view.participantsDiagnosedStructuralHeartIssuesText), expectedParticipantsHeartIssuesTextList), "* * * * * RAS SURVEY MISMATCH IN 'Participants diagnosed structural heart issues' TEXT LIST * * * * *");
        verifyInputField(ras_survey_native_view.pleaseSpecifyOtherHeartIssuesInputField, ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithAnyOfTheFollowingStructuralHeartIssuesOption6Other, "* * * * * RAS SURVEY MISMATCH IN 'Please specify (Heart issues)' INPUT FIELD * * * * *");
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method verifies the RAS Survey data for scenario two in Native View within the "Medical History" section.
     */
    public static void verify_ras_survey_data_scenarioTwo_medical_history_section() {
        CommonUtils.waitForVisibility(ras_survey_native_view.dynamicTabLocator("Medical History"));
        JavascriptUtils.scrollIntoView(ras_survey_native_view.dynamicTabLocator("Medical History"));
        CommonUtils.clickOnElement(ras_survey_native_view.dynamicTabLocator("Medical History"));
        CommonUtils.waitForVisibility(ras_survey_native_view.doesTheParticipantHaveAPrimaryCareProviderDropdown);
        softAssertDropDownValueIsSelected(ras_survey_native_view.doesTheParticipantHaveAPrimaryCareProviderDropdown, ras_Survey_TestDataManager.doYouHaveAPrimaryCareProvider, "* * * * * RAS SURVEY MISMATCH IN 'Does the participant have a primary care provider?' DROPDOWN * * * * *");
        verifyInputField(ras_survey_native_view.nameOfPrimaryCareProviderInputField, ras_Survey_TestDataManager.pleaseProvideTheInformationForYourPrimaryCareProviderBelowDoctor, "* * * * * RAS SURVEY MISMATCH IN 'Name of primary care provider' INPUT FIELD * * * * *");
        verifyInputField(ras_survey_native_view.locationOfPrimaryCareProviderInputField, ras_Survey_TestDataManager.pleaseProvideTheInformationForYourPrimaryCareProviderBelowLocation, "* * * * * RAS SURVEY MISMATCH IN 'Location of primary care provider' INPUT FIELD * * * * *");
        verifyInputField(ras_survey_native_view.primaryCareProviderAffiliationInputField, ras_Survey_TestDataManager.pleaseProvideTheInformationForYourPrimaryCareProviderBelowHospital, "* * * * * RAS SURVEY MISMATCH IN 'Primary Care Provider Affiliation' INPUT FIELD * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.hasTheParticipantEverHadABiopsyDropdown, ras_Survey_TestDataManager.haveYouEverHadAnOperationOrBiopsy, "* * * * * RAS SURVEY MISMATCH IN 'Has the participant ever had a biopsy?' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.isTheParticipantAllergicToAnyMedicationsDropdown, "Yes", "* * * * * RAS SURVEY MISMATCH IN 'Is the participant allergic to any medications' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.haveYouEverBeenDiagnosedWithALymphaticSystemIssueDropdown, ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithALymphaticSystemIssue, "* * * * * RAS SURVEY MISMATCH IN 'Have you ever been diagnosed with a lymphatic system issue' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.hasTheParticipantEverBeenEvaluatedByANephrologistDropdown, ras_Survey_TestDataManager.haveYouEverBeenEvaluatedByANephrologist, "* * * * * RAS SURVEY MISMATCH IN 'Has the participant ever been evaluated by a nephrologist?' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.hasTheParticipantBeenHospitalizedForAnyReasonOtherThanAccidentalInjuryOrChildbirthDropdown, ras_Survey_TestDataManager.haveYouEverBeenHospitalizedForAnyReason, "* * * * * RAS SURVEY MISMATCH IN 'Hospitalized for any reason other than accidental injury or childbirth' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.isTheParticipantAllergicToAnyFoodsDropdown, "Yes", "* * * * * RAS SURVEY MISMATCH IN 'Is the participant allergic to any foods' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.isTheParticipantAllergicToOtherThingsDropdown, "Yes", "* * * * * RAS SURVEY MISMATCH IN 'Is the participant allergic to other things?' DROPDOWN * * * * *");
        List<String> expectedParticipantsEarIssuesTextList = new ArrayList<>() {
            {
                add("Excessive earwax");
                add("Chronic or recurrent ear infection (also known as recurrent otitis media)");
                add(ras_Survey_TestDataManager.doYouHaveAnyOfTheFollowingIssuesWithYourEarsOption3Other);
            }
        };
        softAssert.assertTrue(sortAndCompareLists(ras_survey_native_view.textToList(ras_survey_native_view.participantEarIssuesTextList), expectedParticipantsEarIssuesTextList), "* * * * * RAS SURVEY MISMATCH IN 'Participants diagnosed structural heart issues' TEXT LIST * * * * *");
        verifyInputField(ras_survey_native_view.nameOfNephrologistInputField, ras_Survey_TestDataManager.pleaseListTheInformationBelowForTheNephrologistOption1, "* * * * * RAS SURVEY MISMATCH IN 'Name of nephrologist' INPUT FIELD * * * * *");
        verifyInputField(ras_survey_native_view.nephrologistLocationInputField, ras_Survey_TestDataManager.pleaseListTheInformationBelowForTheNephrologistOption2, "* * * * * RAS SURVEY MISMATCH IN 'Nephrologist Location' INPUT FIELD * * * * *");
        softAssert.assertEquals(ras_survey_native_view.nephrologistAffiliationTextArea, ras_Survey_TestDataManager.pleaseListTheInformationBelowForTheNephrologistOption3, "* * * * * RAS SURVEY MISMATCH IN 'Nephrologist Affiliation' TEXT AREA * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.hasTheParticipantEverBeenDiagnosedWithAKidneyProblemDropdown, ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithAKidneyProblem, "* * * * * RAS SURVEY MISMATCH IN 'Has the participant ever been diagnosed with a kidney problem' DROPDOWN * * * * *");
    }

    /**
     * This method verifies the RAS Survey data for scenario two in Native View within the "Feeding, Nutrition & Gastro Symptoms" section.
     */
    public static void verify_ras_survey_data_scenarioTwo_feeding_nutrition_gastro_symptoms_section() {
        CommonUtils.waitForVisibility(ras_survey_native_view.dynamicTabLocator("Feeding, Nutrition & Gastro Symptoms"));
        JavascriptUtils.scrollIntoView(ras_survey_native_view.dynamicTabLocator("Feeding, Nutrition & Gastro Symptoms"));
        CommonUtils.clickOnElement(ras_survey_native_view.dynamicTabLocator("Feeding, Nutrition & Gastro Symptoms"));
        CommonUtils.waitForVisibility(ras_survey_native_view.hasThePatientEverBeenSeenAGISpecialistDropdown);
        softAssertDropDownValueIsSelected(ras_survey_native_view.hasThePatientEverBeenSeenAGISpecialistDropdown, ras_Survey_TestDataManager.haveYouEverBeenEvaluatedByAGastroenterologist, "* * * * * RAS SURVEY MISMATCH IN 'Has the patient ever seen a GI specialist' DROPDOWN * * * * *");
        verifyInputField(ras_survey_native_view.giSpecialistNameInputField, ras_Survey_TestDataManager.pleaseProvideTheDetailsForTheGastroenterologistDoctor, "* * * * * RAS SURVEY MISMATCH IN 'GI Specialist Name' INPUT FIELD * * * * *");
        verifyInputField(ras_survey_native_view.giSpecialistCityStateInputField, ras_Survey_TestDataManager.pleaseProvideTheDetailsForTheGastroenterologistLocation, "* * * * * RAS SURVEY MISMATCH IN 'GI Specialist City, State' INPUT FIELD * * * * *");
        verifyInputField(ras_survey_native_view.giSpecialistHospitalHealthCenterAffiliationInputField, ras_Survey_TestDataManager.pleaseProvideTheDetailsForTheGastroenterologistHospital, "* * * * * RAS SURVEY MISMATCH IN 'GI Specialist Hospital / Health Center Affiliation' INPUT FIELD * * * * *");
        List<String> expectedparticipantsDiagnosedFeedingDifficultiesTextList = new ArrayList<>() {
            {
                add(ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithAnyOfTheFollowingFeedingDifficultiesOption1);
                add(ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithAnyOfTheFollowingFeedingDifficultiesOption2);
                add(ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithAnyOfTheFollowingFeedingDifficultiesOption3);
                add(ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithAnyOfTheFollowingFeedingDifficultiesOption4);
                add(ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithAnyOfTheFollowingFeedingDifficultiesOption5);
                add(ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithAnyOfTheFollowingFeedingDifficultiesOption6);
            }
        };
        softAssert.assertTrue(sortAndCompareLists(ras_survey_native_view.textToListHyphenated(ras_survey_native_view.participantsDiagnosedFeedingDifficultiesTextList), expectedparticipantsDiagnosedFeedingDifficultiesTextList), "* * * * * RAS SURVEY MISMATCH IN 'Participant's diagnosed feeding difficulties' TEXT LIST * * * * *");
        verifyInputField(ras_survey_native_view.otherFeedingDifficultiesInputField, ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithAnyOfTheFollowingFeedingDifficultiesOption6Other, "* * * * * RAS SURVEY MISMATCH IN 'Other Feeding Difficulties' INPUT FIELD * * * * *");
        verifyInputField(ras_survey_native_view.ageNJNGTubeWasPlacedInputField, ras_Survey_TestDataManager.atWhatAgeWasTheNasogastricOrNasojejunalTubePlacedAge, "* * * * * RAS SURVEY MISMATCH IN 'Age NJ/NG-tube was placed' INPUT FIELD * * * * *");
        verifyCheckbox("false", ras_survey_native_view.ageOfNGNJTubeUnknownCheckbox, "* * * * * RAS SURVEY MISMATCH IN 'Age of NG/NJ tube unknown' CHECKBOX * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.hasTheParticipantHadAnySymptomsThatLikelyInvolvedTheGISystemDropdown, ras_Survey_TestDataManager.HaveYouEverHadAnyPhysicalSymptoms, "* * * * * RAS SURVEY MISMATCH IN 'Has the participant had any symptoms that likely involved the GI system' DROPDOWN * * * * *");
        verifyInputField(ras_survey_native_view.ageGGJTubeWasPlacedInputField, ras_Survey_TestDataManager.atWhatAgeWasTheNasogastricOrNasojejunalTubePlacedAge, "* * * * * RAS SURVEY MISMATCH IN 'Age G/G-J tube was placed' INPUT FIELD * * * * *");
        verifyCheckbox("false", ras_survey_native_view.ggjTubePlacementAgeUnknownCheckbox, "* * * * * RAS SURVEY MISMATCH IN 'G/G-J tube placement age unknown' CHECKBOX * * * * *");
        verifyCheckbox("false", ras_survey_native_view.stillUsingGTubeCheckbox, "* * * * * RAS SURVEY MISMATCH IN 'Still using G-tube' CHECKBOX * * * * *");
        verifyInputField(ras_survey_native_view.ageGastronomyTubeGGJRemovedInputField, ras_Survey_TestDataManager.atWhatAgeWasTheGastrostomyGtubeRemovedAge, "* * * * * RAS SURVEY MISMATCH IN 'Age gastronomy tube(G/G-J) removed' INPUT FIELD * * * * *");
        verifyCheckbox("false", ras_survey_native_view.ggjTubeRemovalAgeUnknownCheckbox, "* * * * * RAS SURVEY MISMATCH IN 'G/G-J tube removal age unknown' CHECKBOX * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.toiletTrainedDropdown, ras_Survey_TestDataManager.areYouToiletTrained, "* * * * * RAS SURVEY MISMATCH IN 'Toilet trained' DROPDOWN * * * * *");
        verifyInputField(ras_survey_native_view.ageSuccessfullyToiletTrainedInputField, ras_Survey_TestDataManager.atWhatAgeWereYouToiletTrained, "* * * * * RAS SURVEY MISMATCH IN 'Age successfully toilet trained' INPUT FIELD * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.anyEpisodesOfRepeatedUrineAccidentsAfterBeingToiletTrainedDropdown, "Yes", "* * * * * RAS SURVEY MISMATCH IN 'Any episodes of repeated urine accidents after being toilet trained?' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.doesThePatientConsistentlyUseTheToiletForAllBowlMovementsDropdown, "Yes", "* * * * * RAS SURVEY MISMATCH IN 'Does the patient consistently use the toilet for all bowel movements?' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.painWithBowelMovementsDropdown, "Yes", "* * * * * RAS SURVEY MISMATCH IN 'Pain with bowel movements' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.bristolStoolChartTypeDropdown, ras_Survey_TestDataManager.pleaseUseTheBristolStoolChart, "* * * * * RAS SURVEY MISMATCH IN 'Bristol Stool Chart Type' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.doesThePatientConsistentlyUseTheToiletForAllUrinationDropdown, "Yes", "* * * * * RAS SURVEY MISMATCH IN 'Does the patient consistently use the toilet for all urination?' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.getAnyEpisodesOfRepeatedBowelAccidentsAfterBeingToiletTrainedDropdown, "Yes", "* * * * * RAS SURVEY MISMATCH IN 'Any episodes of repeated bowel movement accidents after being toilet trained?' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.howManyBowelMovementsDoYouHavePerWeekDropdown, ras_Survey_TestDataManager.howManyBowelMovementsDoYouHavePerWeek, "* * * * * RAS SURVEY MISMATCH IN 'How many bowel movements do you have per week?' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.longestTimeWithoutABowelMovementDropdown, ras_Survey_TestDataManager.whatIsTheLongestAmountOfTimeThatHasPassedWithout, "* * * * * RAS SURVEY MISMATCH IN 'Longest time without a bowel movement' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.hasTheParticipantHadAProcedureTestOrStudyToEvaluateTheirGIDropdown, ras_Survey_TestDataManager.haveYouEverHadAProcedureTestOrStudyToEvaluate, "* * * * * RAS SURVEY MISMATCH IN 'Has the participant had a procedure, test or study to evaluate their GI?' DROPDOWN * * * * *");
    }

    /**
     * This method verifies the RAS Survey Data in Native View for Scenario Two.
     */
    @Then("RAS Survey Data for Scenario Two is verified")
    public void ras_survey_Data_for_scenario_two_is_verified() {
        ras_Survey_TestDataManager.dataInitializerRasSurvey("RASSurveyScenario2");

        verify_ras_survey_data_scenarioTwo_demographics_section();
        verify_ras_survey_data_scenarioTwo_rasopathy_history_section();
        verify_ras_survey_data_scenarioTwo_birth_and_gestation_section();
        verify_ras_survey_data_scenarioTwo_growth_section();
        verify_ras_survey_data_scenarioTwo_development_section();
        verify_ras_survey_data_scenarioTwo_heart_section();
        verify_ras_survey_data_scenarioTwo_medical_history_section();
        verify_ras_survey_data_scenarioTwo_feeding_nutrition_gastro_symptoms_section();



    }
}