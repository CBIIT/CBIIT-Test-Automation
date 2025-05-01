package CHARMS.steps;

import APPS_COMMON.Utils.Dynamic_Locators;
import APPS_COMMON.Utils.ServiceNow_Login_Methods;
import APPS_COMMON.PageInitializers.PageInitializer;
import CHARMS.utils.CharmsUtil;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import java.util.ArrayList;
import java.util.List;
import static CHARMS.steps.RAS_Common_Methods.softAssertDropDownValueIsSelected;
import static CHARMS.utils.CharmsUtil.*;
import static Hooks.Hooks.softAssert;

public class RAS_Survey_Data_Verification_Steps extends PageInitializer {

    /**
     * This method verifies the RAS Survey Data in Native View for Scenario One.
     */
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
        softAssertDropDownValueIsSelected(ras_survey_native_view.includedInPublishedCaseReportDropDown, ras_Survey_TestDataManager.haveYouEverBeenIncluded, "* * * * * RAS SURVEY MISMATCH IN \"Demographics\" section 'Included in published case report or in a different public manner' DROPDOWN * * * * *");
        softAssert.assertEquals(ras_survey_native_view.publishedCaseReportAdditionalInformationInputField.getText(), ras_Survey_TestDataManager.pleaseProvideAnyAdditionalInformation, "* * * * * RAS SURVEY MISMATCH IN \"Demographics\" section 'Additional information about authors, publication year or PubMedID' INPUT FIELD * * * * *");
        verifyInputField(ras_survey_native_view.biologicalMotherBirthLocation, ras_Survey_TestDataManager.pleaseCompleteYourBiologicalParentsBiologicalMotherCity, "* * * * * RAS SURVEY MISMATCH IN \"Demographics\" section 'Biological mother birth location' INPUT FIELD * * * * *");
        verifyCheckbox("true", ras_survey_native_view.biologicalMotherBirthLocationUnknown, "* * * * * RAS SURVEY MISMATCH IN \"Demographics\" section 'Biological mother birth location unknown' CHECKBOX * * * * *");
        verifyInputField(ras_survey_native_view.biologicalMothersAgeAtBirth, ras_Survey_TestDataManager.pleaseCompleteYourBiologicalParentsBiologicalMotherAge, "* * * * * RAS SURVEY MISMATCH IN \"Demographics\" section 'Biological mothers age at birth' * * * * *");
        softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(ras_survey_native_view.biologicalMothersHeight), CharmsUtil.inchToCm(ras_Survey_TestDataManager.whatIsTheHeightOfYourBiologicalMother), "* * * * * RAS SURVEY MISMATCH IN \"Demographics\" section 'Biological mothers height (cm)' * * * * *");
        verifyCheckbox("true", ras_survey_native_view.biologicalMothersHeightUnknown, "* * * * * RAS SURVEY MISMATCH IN \"Demographics\" section 'Biological mothers height unknown' CHECKBOX * * * * *");
        verifyInputField(ras_survey_native_view.biologicalFatherBirthLocation, ras_Survey_TestDataManager.pleaseCompleteYourBiologicalParentsBiologicalFatherCity, "* * * * * RAS SURVEY MISMATCH IN \"Demographics\" section 'Biological father birth location' INPUT FIELD * * * * *");
        verifyCheckbox("true", ras_survey_native_view.biologicalFatherBirthLocationUnknown, "* * * * * RAS SURVEY MISMATCH IN \"Demographics\" section 'Biological father birth location unknown' CHECKBOX * * * * *");
        verifyInputField(ras_survey_native_view.biologicalFathersAgeAtBirth, ras_Survey_TestDataManager.pleaseCompleteYourBiologicalParentsBiologicalFatherAge, "* * * * * RAS SURVEY MISMATCH IN \"Demographics\" section 'Biological fathers age at birth' INPUT FIELD * * * * *");
        softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(ras_survey_native_view.biologicalFathersHeight).replace(",", ""), CharmsUtil.inchToCm(ras_Survey_TestDataManager.whatIsTheHeightOfYourBiologicalFather), "* * * * * RAS SURVEY MISMATCH IN \"Demographics\" section 'Biological fathers height (cm)' INPUT FIELD * * * * *");
        verifyCheckbox("true", ras_survey_native_view.biologicalFatherHeightUnknown, "* * * * * RAS SURVEY MISMATCH IN \"Demographics\" section 'Biological fathers height unknown' CHECKBOX * * * * *");
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
        softAssert.assertTrue(sortAndCompareLists(textToList(ras_survey_native_view.diagnosedRasopathiesTextList), expectedDiagnosedRasopathies), "* * * * * RAS SURVEY MISMATCH IN \"RASopathy History\" section 'Diagnosed RASopathies' TEXT LIST * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.dropdownDiagnosedWithRasopathyByPhysician, ras_Survey_TestDataManager.haveYouBeenDiagnosedWithARASopathy, "* * * * * RAS SURVEY MISMATCH IN \"RASopathy History\" section 'Diagnosed with a RASopathy by a physician through testing' INPUT FIELD * * * * *");
        verifyInputField(ras_survey_native_view.specifyOtherRasopathyInputField, ras_Survey_TestDataManager.pleaseIndicateIfYouHaveBeenDiagnosedWithRASopathiesOption9Other, "* * * * * RAS SURVEY MISMATCH IN \"RASopathy History\" section 'Please specify other RASopathy' INPUT FIELD * * * * *");
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
        softAssertDropDownValueIsSelected(ras_survey_native_view.dropdownDiagnosedWithHypoglycemiaDuringNewbornPeriod, ras_Survey_TestDataManager.wereYouDiagnosedWithHypoglycemia, "* * * * * RAS SURVEY MISMATCH IN \"Birth & Gestation\" section 'Diagnosed with hypoglycemia during the newborn period' DROPDOWN * * * * *");
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
        softAssert.assertTrue(sortAndCompareLists(textToList(ras_survey_native_view.issuesPriorToBirthTextList), expectedIssuesPriorToBirth), "* * * * * RAS SURVEY MISMATCH IN \"Birth & Gestation\" section 'Issues identified in the participant prior to birth' TEXT LIST * * * * *");
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
        softAssert.assertTrue(sortAndCompareLists(textToList(ras_survey_native_view.vapingProductsTextList), expectedVapingProductsUsedWhilePregnant), "* * * * * RAS SURVEY MISMATCH IN \"Birth & Gestation\" section 'Vape products used' TEXT LIST * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.dropdownWereMedicationsTakenWhileMotherWasPregnant, ras_Survey_TestDataManager.duringHerPregnancyWithYouSupplements, "* * * * * RAS SURVEY MISMATCH IN \"Birth & Gestation\" section 'Were medications taken while biological mother was pregnant with the participant' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.dropdownWereVapingProductsUsedDuringPregnancy, ras_Survey_TestDataManager.didYourBiologicalMotherUseAnyVaping, "* * * * * RAS SURVEY MISMATCH IN \"Birth & Gestation\" section 'Were vaping products use by participants bio mom during pregnancy' DROPDOWN * * * * *");
        verifyInputField(ras_survey_native_view.specifyVapeProductsInputField, ras_Survey_TestDataManager.whichVapingProductsDidYourMotherUseOption10PleaseSpecify, "* * * * * RAS SURVEY MISMATCH IN \"Birth & Gestation\" section 'Please specify (vape products used)' * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.dropdownDidBioMotherUsedRecreationalDrugsDuringPregnancy, ras_Survey_TestDataManager.didYourBiologicalMotherUseAnyRecreationalDrugs, "* * * * * RAS SURVEY MISMATCH IN \"Birth & Gestation\" section 'Did participants bio mother use recreational drugs during pregnancy' DROPDOWN * * * * *");
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
        softAssert.assertTrue(sortAndCompareLists(textToList(ras_survey_native_view.recreationalDrugsUsedWhilePregnantTextList), expectedDrugsUsedByBiologicalMotherWhilePregnant), "* * * * * RAS SURVEY MISMATCH IN \"Birth & Gestation\" section 'Drugs used by biological mother during pregnancy' TEXT LIST * * * * *");
        verifyInputField(ras_survey_native_view.specifyRecreationalDrugsUsedByMotherDuringPregnancyInputField, ras_Survey_TestDataManager.whatRecreationalDrugOption11Other, "* * * * * RAS SURVEY MISMATCH IN \"Birth & Gestation\" section 'Please specify (Drugs used by biological mother during pregnancy)' INPUT FIELD * * * * *");
        verifyInputField(ras_survey_native_view.biologicalMothersOccupationWhilePregnantTextArea, ras_Survey_TestDataManager.biologicalMotherOccupationDuringPregnancy, "* * * * * RAS SURVEY MISMATCH IN \"Birth & Gestation\" section 'Biological mothers occupation while pregnant with the participant' INPUT FIELD * * * * *");
        verifyCheckbox("true", ras_survey_native_view.checkboxBiologicalMothersOccupationUnknown, "* * * * * RAS SURVEY MISMATCH IN \"Birth & Gestation\" section 'Biological mother occupation unknown' CHECKBOX * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.dropdownDidBioMotherReceivePrenatalTests, ras_Survey_TestDataManager.duringHerPregnancyWithYou, "* * * * * RAS SURVEY MISMATCH IN \"Birth & Gestation\" section 'Did biological mother receive prenatal tests for birth defects/medical problems' DROPDOWN * * * * *");
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
        softAssert.assertTrue(sortAndCompareLists(textToList(ras_survey_native_view.participantMotherBirthComplicationsTextList), expectedMotherBirthComplicationsTextList), "* * * * * RAS SURVEY MISMATCH IN \"Birth & Gestation\" section 'Participant mother's birth complications' TEXT LIST * * * * *");
        verifyInputField(ras_survey_native_view.infectionPregnancyConditionInputField, ras_Survey_TestDataManager.wasYourBiologicalMotherDiagnosedOption8PleaseSpecify, "* * * * * RAS SURVEY MISMATCH IN \"Birth & Gestation\" section 'Infection (please specify)' INPUT FIELD * * * * *");
        verifyInputField(ras_survey_native_view.rashPregnancyConditionInputField, ras_Survey_TestDataManager.wasYourBiologicalMotherDiagnosedOption9PleaseSpecify, "* * * * * RAS SURVEY MISMATCH IN \"Birth & Gestation\" section 'Rash (please specify)' INPUT FIELD * * * * *");
        verifyInputField(ras_survey_native_view.otherComplicationInputField, ras_Survey_TestDataManager.wasYourBiologicalMotherDiagnosedOption10PleaseSpecify, "* * * * * RAS SURVEY MISMATCH IN \"Birth & Gestation\" section 'Other complication' INPUT FIELD * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.dropdownDidBioMotherUseTobacco, ras_Survey_TestDataManager.didYourBiologicalMotherUseAnyTobacco, "* * * * * RAS SURVEY MISMATCH IN \"Birth & Gestation\" section 'Did participants biological mother use tobacco products while pregnant?' DROPDOWN * * * * *");
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
        softAssert.assertTrue(sortAndCompareLists(textToList(ras_survey_native_view.tobaccoProductsUsedByMotherWhilePregnantTextList), expectedTobaccoProductsUsedByMotherDuringPregnancyTextList), "* * * * * RAS SURVEY MISMATCH IN \"Birth & Gestation\" section 'Tobacco products used by mother during pregnancy' TEXT LIST * * * * *");
        verifyInputField(ras_survey_native_view.specifyTobaccoUsedByMotherDuringPregnancyInputField, ras_Survey_TestDataManager.whatTobaccoProductsDidYourBiologicalMotherOption6PleaseSpecify, "* * * * * RAS SURVEY MISMATCH IN \"Birth & Gestation\" section 'Please specify (Tobacco products used by mother during pregnancy)' INPUT FIELD * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.dropdownDidBioMotherUseAlcohol, ras_Survey_TestDataManager.didYourBiologicalMotherDrink, "* * * * * RAS SURVEY MISMATCH IN \"Birth & Gestation\" section 'Did participants biological mother drink alcohol while pregnant with participant' DROPDOWN * * * * *");
        List<String> expectedAlcoholUsedByMotherDuringPregnancyTextList = new ArrayList<>() {
            {
                add(ras_Survey_TestDataManager.WhatAlcoholicBeveragesDidYourMotherDrinkOption1);
                add(ras_Survey_TestDataManager.WhatAlcoholicBeveragesDidYourMotherDrinkOption2);
                add(ras_Survey_TestDataManager.WhatAlcoholicBeveragesDidYourMotherDrinkOption3);
                add(ras_Survey_TestDataManager.WhatAlcoholicBeveragesDidYourMotherDrinkOption4);
                add(ras_Survey_TestDataManager.WhatAlcoholicBeveragesDidYourMotherDrinkOption5);
            }
        };
        softAssert.assertTrue(sortAndCompareLists(textToList(ras_survey_native_view.alcoholUsedByMotherWhilePregnantTextList), expectedAlcoholUsedByMotherDuringPregnancyTextList), "* * * * * RAS SURVEY MISMATCH IN \"Birth & Gestation\" section 'Alcohol used by mom during pregnancy' TEXT LIST * * * * *");
        verifyInputField(ras_survey_native_view.specifyAlcoholUsedByMotherDuringPregnancyInputField, ras_Survey_TestDataManager.WhatAlcoholicBeveragesDidYourMotherDrinkOption5Other, "* * * * * RAS SURVEY MISMATCH IN \"Birth & Gestation\" section 'Please specify (Alcohol used by mom during pregnancy)' INPUT FIELD * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.dropdownDidBioMotherEverLiveWorkWhereOtherUseTobacco, ras_Survey_TestDataManager.didYourBiologicalMotherEverLiveWhereSmokedCigarettes, "* * * * * RAS SURVEY MISMATCH IN \"Birth & Gestation\" section 'Did the participants mother ever live/work in a place where others use tobacco' DROPDOWN * * * * *");
        List<String> expectedTobaccoProductsUsedAroundMotherWhilePregnantTextList = new ArrayList<>() {
            {
                add(ras_Survey_TestDataManager.whatProductsWereUsedAroundOption1);
                add(ras_Survey_TestDataManager.whatProductsWereUsedAroundOption2);
                add(ras_Survey_TestDataManager.whatProductsWereUsedAroundOption3);
                add(ras_Survey_TestDataManager.whatProductsWereUsedAroundOption4);
            }
        };
        softAssert.assertTrue(sortAndCompareLists(textToList(ras_survey_native_view.tobaccoProductsUsedAroundMotherWhilePregnantTextList), expectedTobaccoProductsUsedAroundMotherWhilePregnantTextList), "* * * * * RAS SURVEY MISMATCH IN \"Birth & Gestation\" section 'Tobacco products used around mother during pregnancy' TEXT LIST * * * * *");
        verifyInputField(ras_survey_native_view.specifyTobaccoUsedAroundMotherDuringPregnancyInputField, ras_Survey_TestDataManager.whatProductsWereUsedAroundOption4Other, "* * * * * RAS SURVEY MISMATCH IN \"Birth & Gestation\" section 'Please specify (Tobacco products used around mother during pregnancy)' INPUT FIELD * * * * *");
        verifyInputField(ras_survey_native_view.fieldBioFatherOccupationWhileMotherWasPregnant, ras_Survey_TestDataManager.biologicalMotherOccupationDuringPregnancyFather, "* * * * * RAS SURVEY MISMATCH IN \"Birth & Gestation\" section 'Biological fathers occupation while mother was pregnant with the participant' INPUT FIELD * * * * *");
        verifyCheckbox("true", ras_survey_native_view.biologicalFatherOccupationUnknownCheckbox, "* * * * * RAS SURVEY MISMATCH IN \"Birth & Gestation\" section 'Biological father occupation unknown' CHECKBOX * * * * *");
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
        softAssertDropDownValueIsSelected(ras_survey_native_view.hasTheParticipantHadGrowthHormoneTestingDropdown, ras_Survey_TestDataManager.haveYouEverHadGrowthHormoneTesting, "* * * * * RAS SURVEY MISMATCH IN \"Growth\" section 'Has the participant had growth hormone testing?' DROPDOWN * * * * *");
        softAssert.assertTrue(sortAndCompareLists(textToList(ras_survey_native_view.growthHormoneTestResultsTextList), expectedGrowthHormoneTestResultsTextList), "* * * * * RAS SURVEY MISMATCH IN \"Growth\" section 'Growth Hormone test results' TEXT LIST * * * * *");
        verifyInputField(ras_survey_native_view.pleaseSpecifyGrowthHormoneTestResultsInputField, ras_Survey_TestDataManager.whatWereTheResultsOfYourGrowthHormoneOption4Other, "* * * * * RAS SURVEY MISMATCH IN \"Growth\" section 'Please specify (Growth Hormone test results)' INPUT FIELD * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.hasTheParticipantReceivedGrowthHormoneTreatmentDropdown, ras_Survey_TestDataManager.haveYouEverReceivedGrowthHormoneTreatment, "* * * * * RAS SURVEY MISMATCH IN \"Growth\" section 'Has the participant received growth hormone treatment?' DROPDOWN * * * * *");
        verifyInputField(ras_survey_native_view.heightBeforeStartingGrowthHormoneInputField, ras_Survey_TestDataManager.whatWasYourHeightBeforeStartingGrowthHormoneHeight, "* * * * * RAS SURVEY MISMATCH IN \"Growth\" section 'Height before starting growth hormone' INPUT FIELD * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.howManyTimesHasTheParticipantReceivedGrowthHormoneTreatmentDropdown, ras_Survey_TestDataManager.howManyTimesHaveYouReceivedGrowthHormoneTreatment, "* * * * * RAS SURVEY MISMATCH IN \"Growth\" section 'How many times has the participant received growth hormone treatment' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.hasTheParticipantEverBeenEvaluatedByAnEndocrinologistForAnyReasonDropdown, ras_Survey_TestDataManager.haveYouEverBeenEvaluatedByAnEndocrinologist, "* * * * * RAS SURVEY MISMATCH IN \"Growth\" section 'Has the participant ever been evaluated by an endocrinologist for any reason? ' DROPDOWN * * * * *");
        verifyInputField(ras_survey_native_view.doctorMedicalProviderNameInputField, ras_Survey_TestDataManager.whatIsTheNameOfTheEndocrinologistDoctor, "* * * * * RAS SURVEY MISMATCH IN \"Growth\" section 'Doctor/medical provider name' INPUT FIELD * * * * *");
        verifyInputField(ras_survey_native_view.locationCityStateCountryInputField, ras_Survey_TestDataManager.whatIsTheNameOfTheEndocrinologistLocation, "* * * * * RAS SURVEY MISMATCH IN \"Growth\" section 'Location (City, State, Country)' INPUT FIELD * * * * *");
        verifyInputField(ras_survey_native_view.hospitalOrHealthSystemAffiliationInputField, ras_Survey_TestDataManager.whatIsTheNameOfTheEndocrinologistHospital, "* * * * * RAS SURVEY MISMATCH IN \"Growth\" section 'Hospital or Health System Affiliation' INPUT FIELD * * * * *");
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
        softAssertDropDownValueIsSelected(ras_survey_native_view.wasTheParticipantDiagnosedWithHypotoniaAsAnInfantOrChildDropdown, ras_Survey_TestDataManager.wereYouEverDiagnosedWithHypotoniaAsAnInfantOrChild, "* * * * * RAS SURVEY MISMATCH IN \"Development\" section 'Was the participant diagnosed with hypotonia as an infant or child?' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.hasTheParticipantEverReceivedPhysicalTherapyDropdown, ras_Survey_TestDataManager.haveYouEverReceivedPhysicalTherapy, "* * * * * RAS SURVEY MISMATCH IN \"Development\" section 'Has the participant ever received physical therapy' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.howWouldYouDescribeTheParticipantCurrentSpeechCapabilitiesDropdown, ras_Survey_TestDataManager.howWouldYouDescribeYourCurrentSpeechCapabilities, "* * * * * RAS SURVEY MISMATCH IN \"Development\" section 'How would you describe the participant's current speech capabilities?' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.hasTheParticipantEverReceivedSpeechTherapyDropdown, ras_Survey_TestDataManager.haveYouEverReceivedSpeechTherapy, "* * * * * RAS SURVEY MISMATCH IN \"Development\" section 'Has the participant ever received speech therapy?' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.didTheParticipantReceiveOccupationTherapyBetweenTheAgesOf3And6Dropdown, ras_Survey_TestDataManager.didYouReceiveOccupationalTherapyBetween3And6YearsOfAge, "* * * * * RAS SURVEY MISMATCH IN \"Development\" section 'Did the participant receive occupation therapy between the ages of 3 & 6' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.currentEmploymentStatusDropdown, ras_Survey_TestDataManager.whatIsYourCurrentEmploymentStatus, "* * * * * RAS SURVEY MISMATCH IN \"Development\" section 'Current employment status' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.participantsHighestLevelOfSchoolingDropdown, ras_Survey_TestDataManager.pleaseIndicateTheHighestDegree, "* * * * * RAS SURVEY MISMATCH IN \"Development\" section 'Participants highest level of schooling' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.atWhatAgeWasTheParticipantAbleToSitWithoutSupportDropdown, ras_Survey_TestDataManager.atWhatAgeWereYouAbleToSitWithoutSupport, "* * * * * RAS SURVEY MISMATCH IN \"Development\" section 'At what age was the participant able to sit without support' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.atWhatAgeWasTheParticipantAbleToWalkWithoutSupportDropdown, ras_Survey_TestDataManager.atWhatAgeWereYouAbleToWalkWithoutSupport, "* * * * * RAS SURVEY MISMATCH IN \"Development\" section 'At what age was the participant able to walk without support?' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.atWhatAgeWasTheParticipantAbleToUseSimpleTwoWordPhrasesDropdown, ras_Survey_TestDataManager.atWhatAgeWereYouAbleToUseSimpleTwoWordPhrases, "* * * * * RAS SURVEY MISMATCH IN \"Development\" section 'At what age was the participant able to use simple two-word phrases?' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.diagnosedWithCognitiveDevelopmentIssuesBetweenAges3And6Dropdown, ras_Survey_TestDataManager.betweenTheAgesOf3And6YearsOld, "* * * * * RAS SURVEY MISMATCH IN \"Development\" section 'Diagnosed with cognitive development issues between ages 3 & 6' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.schoolingBetweenTheAgesOf6And10Dropdown, ras_Survey_TestDataManager.betweenTheAgesOf6And10, "* * * * * RAS SURVEY MISMATCH IN \"Development\" section 'Schooling between the ages of 6 and 10' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.schoolingAge10To17Dropdown, ras_Survey_TestDataManager.betweenTheAgesOf10And17, "* * * * * RAS SURVEY MISMATCH IN \"Development\" section 'Schooling age 10 to 17' DROPDOWN * * * * *");
        List<String> expectedParticipantsDiagnosedLearningDifferencesTextList = new ArrayList<>() {
            {
                add(ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithLearningDifferencesOption1);
                add(ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithLearningDifferencesOption2);
                add(ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithLearningDifferencesOption3);
                add(ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithLearningDifferencesOption4);
            }
        };
        softAssert.assertTrue(sortAndCompareLists(textToListHyphenated(ras_survey_native_view.participantsDiagnosedLearningDifferencesTextList), expectedParticipantsDiagnosedLearningDifferencesTextList), "* * * * * RAS SURVEY MISMATCH IN \"Development\" section 'Participants diagnosed learning differences' TEXT LIST * * * * *");
        verifyInputField(ras_survey_native_view.pleaseSpecifyParticipantsDiagnosedLearningDifferencesInputField, ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithLearningDifferencesOption4Other, "* * * * * RAS SURVEY MISMATCH IN \"Development\" section 'Please specify(Participants diagnosed learning differences)' INPUT FIELD * * * * *");
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
        softAssertDropDownValueIsSelected(ras_survey_native_view.hasTheParticipantBeenEvaluatedByACardiologistDropdown, ras_Survey_TestDataManager.haveYouEverBeenEvaluatedByACardiologist, "* * * * * RAS SURVEY MISMATCH IN \"Heart\" section 'Has the participant been evaluated by a cardiologist?' DROPDOWN * * * * *");
        verifyInputField(ras_survey_native_view.nameOfCardiologistInputField, ras_Survey_TestDataManager.whatIsTheNameOfTheCardiologistDoctor, "* * * * * RAS SURVEY MISMATCH IN \"Heart\" section 'Name of cardiologist' INPUT FIELD * * * * *");
        verifyInputField(ras_survey_native_view.locationOfCardiologistInputField, ras_Survey_TestDataManager.whatIsTheNameOfTheCardiologistLocation, "* * * * * RAS SURVEY MISMATCH IN \"Heart\" section 'Location (City, State, Country)' INPUT FIELD * * * * *");
        verifyInputField(ras_survey_native_view.getHospitalOrHealthSystemAffiliationInputFieldInputField, ras_Survey_TestDataManager.whatIsTheNameOfTheCardiologistHospital, "* * * * * RAS SURVEY MISMATCH IN \"Heart\" section 'Hospital or Health Center Affiliation' INPUT FIELD * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.hasTheParticipantReceivedHeartTreatmentDropdown, ras_Survey_TestDataManager.haveYouEverReceivedTreatmentForHeartProblems, "* * * * * RAS SURVEY MISMATCH IN \"Heart\" section 'Has the participant received treatment for heart problems?' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.hasTheParticipantBeenDiagnosedWithAFunctionalHeartIssueDropdown, ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithAnyFunctionalHeartIssues, "* * * * * RAS SURVEY MISMATCH IN \"Heart\" section 'Has the participant been diagnosed with a functional heart issue?' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.hasTheParticipantBeenDiagnosedWithAStructuralHeartIssueDropdown, ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithAnyStructuralHeartIssues, "* * * * * RAS SURVEY MISMATCH IN \"Heart\" section 'Has the participant been diagnosed with  structural heart issues?' DROPDOWN * * * * *");
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
        softAssert.assertTrue(sortAndCompareLists(textToListHyphenated(ras_survey_native_view.participantsDiagnosedStructuralHeartIssuesText), expectedParticipantsHeartIssuesTextList), "* * * * * RAS SURVEY MISMATCH IN \"Heart\" section 'Participants diagnosed structural heart issues' TEXT LIST * * * * *");
        verifyInputField(ras_survey_native_view.pleaseSpecifyOtherHeartIssuesInputField, ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithAnyOfTheFollowingStructuralHeartIssuesOption6Other, "* * * * * RAS SURVEY MISMATCH IN \"Heart\" section 'Please specify (Heart issues)' INPUT FIELD * * * * *");
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
        softAssertDropDownValueIsSelected(ras_survey_native_view.doesTheParticipantHaveAPrimaryCareProviderDropdown, ras_Survey_TestDataManager.doYouHaveAPrimaryCareProvider, "* * * * * RAS SURVEY MISMATCH IN \"Medical History\" section 'Does the participant have a primary care provider?' DROPDOWN * * * * *");
        verifyInputField(ras_survey_native_view.nameOfPrimaryCareProviderInputField, ras_Survey_TestDataManager.pleaseProvideTheInformationForYourPrimaryCareProviderBelowDoctor, "* * * * * RAS SURVEY MISMATCH IN \"Medical History\" section 'Name of primary care provider' INPUT FIELD * * * * *");
        verifyInputField(ras_survey_native_view.locationOfPrimaryCareProviderInputField, ras_Survey_TestDataManager.pleaseProvideTheInformationForYourPrimaryCareProviderBelowLocation, "* * * * * RAS SURVEY MISMATCH IN \"Medical History\" section 'Location of primary care provider' INPUT FIELD * * * * *");
        verifyInputField(ras_survey_native_view.primaryCareProviderAffiliationInputField, ras_Survey_TestDataManager.pleaseProvideTheInformationForYourPrimaryCareProviderBelowHospital, "* * * * * RAS SURVEY MISMATCH IN \"Medical History\" section 'Primary Care Provider Affiliation' INPUT FIELD * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.hasTheParticipantEverHadABiopsyDropdown, ras_Survey_TestDataManager.haveYouEverHadAnOperationOrBiopsy, "* * * * * RAS SURVEY MISMATCH IN \"Medical History\" section 'Has the participant ever had a biopsy?' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.isTheParticipantAllergicToAnyMedicationsDropdown, "Yes", "* * * * * RAS SURVEY MISMATCH IN \"Medical History\" section 'Is the participant allergic to any medications' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.haveYouEverBeenDiagnosedWithALymphaticSystemIssueDropdown, ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithALymphaticSystemIssue, "* * * * * RAS SURVEY MISMATCH IN \"Medical History\" section 'Have you ever been diagnosed with a lymphatic system issue' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.hasTheParticipantEverBeenEvaluatedByANephrologistDropdown, ras_Survey_TestDataManager.haveYouEverBeenEvaluatedByANephrologist, "* * * * * RAS SURVEY MISMATCH IN \"Medical History\" section 'Has the participant ever been evaluated by a nephrologist?' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.hasTheParticipantBeenHospitalizedForAnyReasonOtherThanAccidentalInjuryOrChildbirthDropdown, ras_Survey_TestDataManager.haveYouEverBeenHospitalizedForAnyReason, "* * * * * RAS SURVEY MISMATCH IN \"Medical History\" section 'Hospitalized for any reason other than accidental injury or childbirth' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.isTheParticipantAllergicToAnyFoodsDropdown, "Yes", "* * * * * RAS SURVEY MISMATCH IN \"Medical History\" section 'Is the participant allergic to any foods' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.isTheParticipantAllergicToOtherThingsDropdown, "Yes", "* * * * * RAS SURVEY MISMATCH IN \"Medical History\" section 'Is the participant allergic to other things?' DROPDOWN * * * * *");
        List<String> expectedParticipantsEarIssuesTextList = new ArrayList<>() {
            {
                add("Excessive earwax");
                add("Chronic or recurrent ear infection (also known as recurrent otitis media)");
                add(ras_Survey_TestDataManager.doYouHaveAnyOfTheFollowingIssuesWithYourEarsOption3Other);
            }
        };
        softAssert.assertTrue(sortAndCompareLists(textToList(ras_survey_native_view.participantEarIssuesTextList), expectedParticipantsEarIssuesTextList), "* * * * * RAS SURVEY MISMATCH IN \"Medical History\" section 'Participants diagnosed structural heart issues' TEXT LIST * * * * *");
        verifyInputField(ras_survey_native_view.nameOfNephrologistInputField, ras_Survey_TestDataManager.pleaseListTheInformationBelowForTheNephrologistOption1, "* * * * * RAS SURVEY MISMATCH IN \"Medical History\" section 'Name of nephrologist' INPUT FIELD * * * * *");
        verifyInputField(ras_survey_native_view.nephrologistLocationInputField, ras_Survey_TestDataManager.pleaseListTheInformationBelowForTheNephrologistOption2, "* * * * * RAS SURVEY MISMATCH IN \"Medical History\" section 'Nephrologist Location' INPUT FIELD * * * * *");
        verifyInputField(ras_survey_native_view.nephrologistAffiliationTextArea, ras_Survey_TestDataManager.pleaseListTheInformationBelowForTheNephrologistOption3, "* * * * * RAS SURVEY MISMATCH IN \"Medical History\" section 'Nephrologist Affiliation' TEXT AREA * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.hasTheParticipantEverBeenDiagnosedWithAKidneyProblemDropdown, ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithAKidneyProblem, "* * * * * RAS SURVEY MISMATCH IN \"Medical History\" section 'Has the participant ever been diagnosed with a kidney problem' DROPDOWN * * * * *");
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method verifies the RAS Survey data for scenario two in Native View within the "Feeding, Nutrition & Gastro Symptoms" section.
     */
    public static void verify_ras_survey_data_scenarioTwo_feeding_nutrition_gastro_symptoms_section() {
        CommonUtils.waitForVisibility(ras_survey_native_view.dynamicTabLocator("Feeding, Nutrition & Gastro Symptoms"));
        JavascriptUtils.scrollIntoView(ras_survey_native_view.dynamicTabLocator("Feeding, Nutrition & Gastro Symptoms"));
        CommonUtils.clickOnElement(ras_survey_native_view.dynamicTabLocator("Feeding, Nutrition & Gastro Symptoms"));
        CommonUtils.waitForVisibility(ras_survey_native_view.hasThePatientEverBeenSeenAGISpecialistDropdown);
        softAssertDropDownValueIsSelected(ras_survey_native_view.hasThePatientEverBeenSeenAGISpecialistDropdown, ras_Survey_TestDataManager.haveYouEverBeenEvaluatedByAGastroenterologist, "* * * * * RAS SURVEY MISMATCH IN \"Feeding, Nutrition & Gastro Symptoms\" section 'Has the patient ever seen a GI specialist' DROPDOWN * * * * *");
        verifyInputField(ras_survey_native_view.giSpecialistNameInputField, ras_Survey_TestDataManager.pleaseProvideTheDetailsForTheGastroenterologistDoctor, "* * * * * RAS SURVEY MISMATCH IN \"Feeding, Nutrition & Gastro Symptoms\" section 'GI Specialist Name' INPUT FIELD * * * * *");
        verifyInputField(ras_survey_native_view.giSpecialistCityStateInputField, ras_Survey_TestDataManager.pleaseProvideTheDetailsForTheGastroenterologistLocation, "* * * * * RAS SURVEY MISMATCH IN \"Feeding, Nutrition & Gastro Symptoms\" section 'GI Specialist City, State' INPUT FIELD * * * * *");
        verifyInputField(ras_survey_native_view.giSpecialistHospitalHealthCenterAffiliationInputField, ras_Survey_TestDataManager.pleaseProvideTheDetailsForTheGastroenterologistHospital, "* * * * * RAS SURVEY MISMATCH IN \"Feeding, Nutrition & Gastro Symptoms\" section 'GI Specialist Hospital / Health Center Affiliation' INPUT FIELD * * * * *");
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
        softAssert.assertTrue(sortAndCompareLists(textToListHyphenated(ras_survey_native_view.participantsDiagnosedFeedingDifficultiesTextList), expectedparticipantsDiagnosedFeedingDifficultiesTextList), "* * * * * RAS SURVEY MISMATCH IN \"Feeding, Nutrition & Gastro Symptoms\" section 'Participant's diagnosed feeding difficulties' TEXT LIST * * * * *");
        verifyInputField(ras_survey_native_view.otherFeedingDifficultiesInputField, ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithAnyOfTheFollowingFeedingDifficultiesOption6Other, "* * * * * RAS SURVEY MISMATCH IN \"Feeding, Nutrition & Gastro Symptoms\" section 'Other Feeding Difficulties' INPUT FIELD * * * * *");
        verifyInputField(ras_survey_native_view.ageNJNGTubeWasPlacedInputField, ras_Survey_TestDataManager.atWhatAgeWasTheNasogastricOrNasojejunalTubePlacedAge, "* * * * * RAS SURVEY MISMATCH IN \"Feeding, Nutrition & Gastro Symptoms\" section 'Age NJ/NG-tube was placed' INPUT FIELD * * * * *");
        verifyCheckbox("false", ras_survey_native_view.ageOfNGNJTubeUnknownCheckbox, "* * * * * RAS SURVEY MISMATCH IN \"Feeding, Nutrition & Gastro Symptoms\" section 'Age of NG/NJ tube unknown' CHECKBOX * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.hasTheParticipantHadAnySymptomsThatLikelyInvolvedTheGISystemDropdown, ras_Survey_TestDataManager.HaveYouEverHadAnyPhysicalSymptoms, "* * * * * RAS SURVEY MISMATCH IN \"Feeding, Nutrition & Gastro Symptoms\" section 'Has the participant had any symptoms that likely involved the GI system' DROPDOWN * * * * *");
        verifyInputField(ras_survey_native_view.ageGGJTubeWasPlacedInputField, ras_Survey_TestDataManager.atWhatAgeWasTheNasogastricOrNasojejunalTubePlacedAge, "* * * * * RAS SURVEY MISMATCH IN \"Feeding, Nutrition & Gastro Symptoms\" section 'Age G/G-J tube was placed' INPUT FIELD * * * * *");
        verifyCheckbox("false", ras_survey_native_view.ggjTubePlacementAgeUnknownCheckbox, "* * * * * RAS SURVEY MISMATCH IN \"Feeding, Nutrition & Gastro Symptoms\" section 'G/G-J tube placement age unknown' CHECKBOX * * * * *");
        verifyCheckbox("false", ras_survey_native_view.stillUsingGTubeCheckbox, "* * * * * RAS SURVEY MISMATCH IN \"Feeding, Nutrition & Gastro Symptoms\" section 'Still using G-tube' CHECKBOX * * * * *");
        verifyInputField(ras_survey_native_view.ageGastronomyTubeGGJRemovedInputField, ras_Survey_TestDataManager.atWhatAgeWasTheGastrostomyGtubeRemovedAge, "* * * * * RAS SURVEY MISMATCH IN \"Feeding, Nutrition & Gastro Symptoms\" section 'Age gastronomy tube(G/G-J) removed' INPUT FIELD * * * * *");
        verifyCheckbox("false", ras_survey_native_view.ggjTubeRemovalAgeUnknownCheckbox, "* * * * * RAS SURVEY MISMATCH IN \"Feeding, Nutrition & Gastro Symptoms\" section 'G/G-J tube removal age unknown' CHECKBOX * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.toiletTrainedDropdown, ras_Survey_TestDataManager.areYouToiletTrained, "* * * * * RAS SURVEY MISMATCH IN \"Feeding, Nutrition & Gastro Symptoms\" section 'Toilet trained' DROPDOWN * * * * *");
        verifyInputField(ras_survey_native_view.ageSuccessfullyToiletTrainedInputField, ras_Survey_TestDataManager.atWhatAgeWereYouToiletTrained, "* * * * * RAS SURVEY MISMATCH IN \"Feeding, Nutrition & Gastro Symptoms\" section 'Age successfully toilet trained' INPUT FIELD * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.anyEpisodesOfRepeatedUrineAccidentsAfterBeingToiletTrainedDropdown, "Yes", "* * * * * RAS SURVEY MISMATCH IN \"Feeding, Nutrition & Gastro Symptoms\" section 'Any episodes of repeated urine accidents after being toilet trained?' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.doesThePatientConsistentlyUseTheToiletForAllBowlMovementsDropdown, "Yes", "* * * * * RAS SURVEY MISMATCH IN \"Feeding, Nutrition & Gastro Symptoms\" section 'Does the patient consistently use the toilet for all bowel movements?' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.painWithBowelMovementsDropdown, "Yes", "* * * * * RAS SURVEY MISMATCH IN \"Feeding, Nutrition & Gastro Symptoms\" section 'Pain with bowel movements' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.bristolStoolChartTypeDropdown, ras_Survey_TestDataManager.pleaseUseTheBristolStoolChart, "* * * * * RAS SURVEY MISMATCH IN \"Feeding, Nutrition & Gastro Symptoms\" section 'Bristol Stool Chart Type' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.doesThePatientConsistentlyUseTheToiletForAllUrinationDropdown, "Yes", "* * * * * RAS SURVEY MISMATCH IN \"Feeding, Nutrition & Gastro Symptoms\" section 'Does the patient consistently use the toilet for all urination?' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.getAnyEpisodesOfRepeatedBowelAccidentsAfterBeingToiletTrainedDropdown, "Yes", "* * * * * RAS SURVEY MISMATCH IN \"Feeding, Nutrition & Gastro Symptoms\" section 'Any episodes of repeated bowel movement accidents after being toilet trained?' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.howManyBowelMovementsDoYouHavePerWeekDropdown, ras_Survey_TestDataManager.howManyBowelMovementsDoYouHavePerWeek, "* * * * * RAS SURVEY MISMATCH IN \"Feeding, Nutrition & Gastro Symptoms\" section 'How many bowel movements do you have per week?' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.longestTimeWithoutABowelMovementDropdown, ras_Survey_TestDataManager.whatIsTheLongestAmountOfTimeThatHasPassedWithout, "* * * * * RAS SURVEY MISMATCH IN \"Feeding, Nutrition & Gastro Symptoms\" section 'Longest time without a bowel movement' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.hasTheParticipantHadAProcedureTestOrStudyToEvaluateTheirGIDropdown, ras_Survey_TestDataManager.haveYouEverHadAProcedureTestOrStudyToEvaluate, "* * * * * RAS SURVEY MISMATCH IN \"Feeding, Nutrition & Gastro Symptoms\" section 'Has the participant had a procedure, test or study to evaluate their GI?' DROPDOWN * * * * *");
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method verifies the RAS Survey data for scenario two in Native View within the "Breathing" section.
     */
    public static void verify_ras_survey_data_scenarioTwo_breathing_section() {
        CommonUtils.waitForVisibility(ras_survey_native_view.dynamicTabLocator("Breathing"));
        JavascriptUtils.scrollIntoView(ras_survey_native_view.dynamicTabLocator("Breathing"));
        CommonUtils.clickOnElement(ras_survey_native_view.dynamicTabLocator("Breathing"));
        CommonUtils.waitForVisibility(ras_survey_native_view.hasTheParticipantEverBeenEvaluatedByAPulmonologistDropdown);
        softAssertDropDownValueIsSelected(ras_survey_native_view.hasTheParticipantEverBeenEvaluatedByAPulmonologistDropdown, ras_Survey_TestDataManager.haveYouEverHadAnEvaluationByAPulmonologist, "* * * * * RAS SURVEY MISMATCH IN \"Breathing\" section 'Has the participant ever been evaluated by a pulmonologist?' DROPDOWN * * * * *");
        verifyInputField(ras_survey_native_view.pulmonologistNameInputField, ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForThePulmonologistOption1, "* * * * * RAS SURVEY MISMATCH IN \"Breathing\" section 'Pulmonologist name' INPUT FIELD * * * * *");
        verifyInputField(ras_survey_native_view.pulmonologistLocationInputField, ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForThePulmonologistOption2, "* * * * * RAS SURVEY MISMATCH IN \"Breathing\" section 'Pulmonologist location' INPUT FIELD * * * * *");
        verifyInputField(ras_survey_native_view.pulmonologistAffiliationInputField, ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForThePulmonologistOption3, "* * * * * RAS SURVEY MISMATCH IN \"Breathing\" section 'Pulmonologist affiliation' INPUT FIELD * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.hasTheParticipantHadWheezingOrWhistlingInTheChestDropdown, ras_Survey_TestDataManager.haveYouEverHadWheezingOrWhistling, "* * * * * RAS SURVEY MISMATCH IN \"Breathing\" section 'Has the participant had wheezing or whistling in the chest?' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.hasTheParticipantBeenInTheEmergencyRoomForABreathingProblemDropdown, ras_Survey_TestDataManager.haveYouEverBeenSeenInTheEmergencyRoomForABreathing, "* * * * * RAS SURVEY MISMATCH IN \"Breathing\" section 'Has the participant been in the emergency room for a breathing problem?' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.hasADoctorDiagnosedPatientWithReactionAirwayDiseaseOrAsthmaDropdown, ras_Survey_TestDataManager.haveYouBeenDiagnosedWithReactiveAirwayDisease, "* * * * * RAS SURVEY MISMATCH IN \"Breathing\" section 'Has a doctor diagnosed the participant with reactive airway disease or asthma?' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.hasTheParticipantBeenAdmittedToTheHospitalForABreathingProblemDropdown, ras_Survey_TestDataManager.haveYouEverBeenSeenInTheEmergencyRoomForABreathing, "* * * * * RAS SURVEY MISMATCH IN \"Breathing\" section 'Has the participant been admitted to the hospital for a breathing problem?' DROPDOWN * * * * *");
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method verifies the RAS Survey data for scenario two in Native View within the "Mouth/Dental" section.
     */
    public static void verify_ras_survey_data_scenarioTwo_mouth_dental_section() {
        CommonUtils.waitForVisibility(ras_survey_native_view.dynamicTabLocator("Mouth/Dental"));
        JavascriptUtils.scrollIntoView(ras_survey_native_view.dynamicTabLocator("Mouth/Dental"));
        CommonUtils.clickOnElement(ras_survey_native_view.dynamicTabLocator("Mouth/Dental"));
        CommonUtils.waitForVisibility(ras_survey_native_view.doesTheParticipantReceiveRegularDentalCareDropdown);
        softAssertDropDownValueIsSelected(ras_survey_native_view.doesTheParticipantReceiveRegularDentalCareDropdown, ras_Survey_TestDataManager.doYouReceiveRegularDentalCare, "* * * * * RAS SURVEY MISMATCH IN \"Mouth/Dental\" section 'Does the participant receive regular dental care?' DROPDOWN * * * * *");
        verifyInputField(ras_survey_native_view.nameOfDentistInputField, ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForWhereDentalOption1, "* * * * * RAS SURVEY MISMATCH IN \"Mouth/Dental\" section 'Name of dentist' INPUT FIELD * * * * *");
        verifyInputField(ras_survey_native_view.dentistLocationInputField, ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForWhereDentalOption2, "* * * * * RAS SURVEY MISMATCH IN \"Mouth/Dental\" section 'Dentist location' INPUT FIELD * * * * *");
        verifyInputField(ras_survey_native_view.dentistAffiliationTextarea, ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForWhereDentalOption3, "* * * * * RAS SURVEY MISMATCH IN \"Mouth/Dental\" section 'Dentist affiliation' TEXTAREA * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.mainReasonForLastDentalVisitDropdown, ras_Survey_TestDataManager.whatWasTheReasonForYourLastDentalVisitOption, "* * * * * RAS SURVEY MISMATCH IN \"Mouth/Dental\" section 'Main reason for last dental visit' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.doesTheParticipantsTeethOrGumsHurtDropdown, ras_Survey_TestDataManager.doYourTeethOrGumsHurtRegularly, "* * * * * RAS SURVEY MISMATCH IN \"Mouth/Dental\" section 'Does the participants teeth or gums hurt?' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.hasTheParticipantHadDentalSealantsPlacedDropdown, ras_Survey_TestDataManager.haveYouHadDentalSealantsPlaced, "* * * * * RAS SURVEY MISMATCH IN \"Mouth/Dental\" section 'Has the participant had dental sealants placed?' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.hasTheParticipantHadAnyDentalFilingsDropdown, ras_Survey_TestDataManager.haveYouPreviouslyHadAnyDentalFillings, "* * * * * RAS SURVEY MISMATCH IN \"Mouth/Dental\" section 'Has the participant had any dental filings?' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.doesTheParticipantsMouthUsuallyFeelDryDropdown, ras_Survey_TestDataManager.doesYourMouthUsuallyFeelDry, "* * * * * RAS SURVEY MISMATCH IN \"Mouth/Dental\" section 'Does the participants mouth usually feel dry?' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.hasTheParticipantHadAnyChangesInTheirSenseOfSmellDropdown, ras_Survey_TestDataManager.haveYouHadAnyChangesInYourSenseOfSmell, "* * * * * RAS SURVEY MISMATCH IN \"Mouth/Dental\" section 'Has the participant had any changes in their sense of smell?' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.doesTheParticipantHaveJawOrTemporomandibularJointPainDropdown, ras_Survey_TestDataManager.doYouHaveJawOrTemporomandibularJointPain, "* * * * * RAS SURVEY MISMATCH IN \"Mouth/Dental\" section 'Does the participant have jaw or temporomandibular joint pain' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.hasTheParticipantHadOrthodonticTreatmentDropdown, ras_Survey_TestDataManager.haveYouHadAnyOrthodonticTreatment, "* * * * * RAS SURVEY MISMATCH IN \"Mouth/Dental\" section 'Has the participant had orthodontic treatment?' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.didTheParticipantHavePalatalExpansionDropdown, ras_Survey_TestDataManager.haveYouHadAPalatalExpansion, "* * * * * RAS SURVEY MISMATCH IN \"Mouth/Dental\" section 'Did the participant have palatal expansion?' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.hasTheParticipantHadElectiveJawSurgeryDropdown, ras_Survey_TestDataManager.haveYouHadElectiveJawSurgery, "* * * * * RAS SURVEY MISMATCH IN \"Mouth/Dental\" section 'Has the participant had elective jaw surgery' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.historyOfCancerInTheMouthOrJawDropdown, "Yes", "* * * * * RAS SURVEY MISMATCH IN \"Mouth/Dental\" section 'History of cancer in the mouth or jaw' DROPDOWN * * * * *");
        verifyInputField(ras_survey_native_view.pleaseSpecifyHistoryOfCancerInTheMouthOrJawInputField, ras_Survey_TestDataManager.doYouHaveAHistoryOfCancerInTheMouthOrJawPlease, "* * * * * RAS SURVEY MISMATCH IN \"Mouth/Dental\" section 'Please specify(History of cancer in the mouth or jaw)' INPUT FIELD * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.doesTheParticipantHaveAnyNumbnessInOrAroundTheMouthDropdown, ras_Survey_TestDataManager.doYouHaveAnyNumbnessInOrAroundYourMouth, "* * * * * RAS SURVEY MISMATCH IN \"Mouth/Dental\" section 'Does the participant have any numbness in or around the mouth' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.doTheParticipantsTeethFeelSensitiveToHotOrColdFoodDropdown, ras_Survey_TestDataManager.doYourTeethFeelSensitiveToHotOrColdFoods, "* * * * * RAS SURVEY MISMATCH IN \"Mouth/Dental\" section 'Do the participant's teeth feel sensitive to hot or cold food?' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.hadTroublePronouncingWordsBecauseOfProblemsWithTeethMouthDropdown, ras_Survey_TestDataManager.haveYouHadTroublePronouncingAnyWords, "* * * * * RAS SURVEY MISMATCH IN \"Mouth/Dental\" section 'Had trouble pronouncing words because of problems with teeth/mouth' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.hasTheParticipantHadPainfulAchingInTheirMouthDropdown, ras_Survey_TestDataManager.haveYouHadPainfulAchingInYourMouth, "* * * * * RAS SURVEY MISMATCH IN \"Mouth/Dental\" section 'Has the participant had painful aching in their mouth' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.hasTheParticipantBeenSelfConsciousBecauseOfTheirTeethMouthDropdown, ras_Survey_TestDataManager.areYouSelfConsciousBecauseOfYourTeeth, "* * * * * RAS SURVEY MISMATCH IN \"Mouth/Dental\" section 'Has the participant been self-conscious because of their teeth/mouth' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.hasTheParticipantFeltTenseBecauseOfProblemsWithTeethMouthDropdown, ras_Survey_TestDataManager.haveYouFeltTenseBecauseOfProblems, "* * * * * RAS SURVEY MISMATCH IN \"Mouth/Dental\" section 'Has the participant felt tense because of problems with teeth/mouth' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.hasTheParticipantInterruptedMealsBecauseOfProblemsWithTeethMouthDropdown, ras_Survey_TestDataManager.haveYouHadToInterruptMealsBecauseOfProblems, "* * * * * RAS SURVEY MISMATCH IN \"Mouth/Dental\" section 'Has the participant interrupted meals because of problems with teeth/mouth' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.hasTheParticipantBeenABitEmbarrassedBecauseOfTeethMouthDropdown, ras_Survey_TestDataManager.haveYouBeenABitEmbarrassedBecause, "* * * * * RAS SURVEY MISMATCH IN \"Mouth/Dental\" section 'Has the participant been a bit embarrassed because of teeth/mouth' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.difficultyDoingUsualJobsBecauseOfProblemsWithTeethMouthDropdown, ras_Survey_TestDataManager.haveYouHadDifficultyDoingYourUsualJobs, "* * * * * RAS SURVEY MISMATCH IN \"Mouth/Dental\" section 'Difficulty doing usual jobs because of problems with teeth/mouth' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.hasTheParticipantBeenTotallyUnableToFunctionBecauseOfTeethDropdown, ras_Survey_TestDataManager.haveYouBeenTotallyUnableToFunctionBecause, "* * * * * RAS SURVEY MISMATCH IN \"Mouth/Dental\" section 'Has the participant been totally unable to function because of teeth' DROPDOWN * * * * *");
        verifyInputField(ras_survey_native_view.whenDidTheParticipantLastVisitADentistInputField, ras_Survey_TestDataManager.whenDidYouLastVisitADentist, "* * * * * RAS SURVEY MISMATCH IN \"Mouth/Dental\" section 'When did the participant last visit a dentist' INPUT FIELD * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.doesTheParticipantGumsBleedEasilyWithToothBrushingNowDropdown, ras_Survey_TestDataManager.doYourGumsBleedRegularlyWithToothBrushing, "* * * * * RAS SURVEY MISMATCH IN \"Mouth/Dental\" section 'Does the participant's gums bleed easily with tooth brushing now?' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.doesTheParticipantHavePeriodontalOrGumDiseaseDropdown, ras_Survey_TestDataManager.doYouHavePeriodontalOrGumDisease, "* * * * * RAS SURVEY MISMATCH IN \"Mouth/Dental\" section 'Does the participant have periodontal or gum disease?' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.doesTheParticipantHaveCavitiesNowDropdown, ras_Survey_TestDataManager.doYouCurrentlyHaveCavities, "* * * * * RAS SURVEY MISMATCH IN \"Mouth/Dental\" section 'Does the participant have cavities now?' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.howWouldTheParticipantRateTheirHygieneRoutineDropdown, ras_Survey_TestDataManager.overallHowWouldYouRateYourDentalHygieneRoutine, "* * * * * RAS SURVEY MISMATCH IN \"Mouth/Dental\" section 'How would the participant rate their hygiene routine' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.howWouldTheParticipantRateTheirTeethAndGumsDropdown, ras_Survey_TestDataManager.overallHowWouldYouRateTheOverallHealth, "* * * * * RAS SURVEY MISMATCH IN \"Mouth/Dental\" section 'How would the participant rate their teeth and gums' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.hasTheParticipantHadAnyChangesInTheirSenseOfTasteDropdown, ras_Survey_TestDataManager.haveYouHadAnyChangesInYourSenseOfTaste, "* * * * * RAS SURVEY MISMATCH IN \"Mouth/Dental\" section 'Has the participant had any changes in your sense of taste?' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.doesTheParticipantHaveFrequentHeadachesDropdown, ras_Survey_TestDataManager.doYouHaveFrequentHeadaches, "* * * * * RAS SURVEY MISMATCH IN \"Mouth/Dental\" section 'Does the participant have frequent headaches?' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.hasTheParticipantHadAnyFacialOrDentalTraumaDropdown, ras_Survey_TestDataManager.haveYouHadAnyFacialOrDentalTrauma, "* * * * * RAS SURVEY MISMATCH IN \"Mouth/Dental\" section 'Has the participant had any facial or dental trauma?' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.didTheParticipantHaveDentalSurgeryDropdown, "Yes", "* * * * * RAS SURVEY MISMATCH IN \"Mouth/Dental\" section 'Did the participant have dental surgery?' DROPDOWN * * * * *");
        verifyInputField(ras_survey_native_view.pleaseSpecifyDidTheParticipantHaveDentalSurgeryInputField, ras_Survey_TestDataManager.didTheFacialOrDentalTraumaRequireSurgeryPlease, "* * * * * RAS SURVEY MISMATCH IN \"Mouth/Dental\" section 'Please specify(Did the participant have dental surgery?)' INPUT FIELD * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.doesTheParticipantHaveAFamilyMemberWithASyndromeOrAJawAbnormalityDropdown, "Yes", "* * * * * RAS SURVEY MISMATCH IN \"Mouth/Dental\" section 'Does the participant have a family member with a syndrome or a jaw abnormality' DROPDOWN * * * * *");
        verifyInputField(ras_survey_native_view.pleaseSpecifyDoesTheParticipantHaveAFamilyMemberWithASyndromeOrAJawAbnormalityInputField, ras_Survey_TestDataManager.doYouHaveAFamilyMemberWithAJawAbnormalityPlease, "* * * * * RAS SURVEY MISMATCH IN \"Mouth/Dental\" section 'Please specify(Does the participant have a family member with a syndrome or a jaw abnormality)' INPUT FIELD * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.doesTheParticipantHaveAnyMouthSoresDropdown, ras_Survey_TestDataManager.doYouHaveAnyMouthSores, "* * * * * RAS SURVEY MISMATCH IN \"Mouth/Dental\" section 'Does the participant have any mouth sores?' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.doesTheParticipantHaveProblemsMovingTheirLipsTongueOrMouthDropdown, ras_Survey_TestDataManager.doYouHaveProblemsMovingYourLipsTongueOrMouth, "* * * * * RAS SURVEY MISMATCH IN \"Mouth/Dental\" section 'Does the participant have problems moving their lips, tongue, or mouth?' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.isAnythingUnusualAboutTheParticipantsTeethOrMouthDropdown, "Yes", "* * * * * RAS SURVEY MISMATCH IN \"Mouth/Dental\" section 'Is anything unusual about the participant's teeth or mouth' DROPDOWN * * * * *");
        verifyInputField(ras_survey_native_view.pleaseSpecifyIsAnythingUnusualAboutTheParticipantSTeethOrMouthInputField, ras_Survey_TestDataManager.overallIsThereAnythingUnusualAboutYourTeethOrMouthPlease, "* * * * * RAS SURVEY MISMATCH IN \"Mouth/Dental\" section 'Please specify(Is anything unusual about the participant's teeth or mouth)' INPUT FIELD * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.worsenedSenseOfTasteBecauseOfProblemsWithTeethMouthDropdown, ras_Survey_TestDataManager.haveYouFeltThatYourSenseOfTasteHasWorsened, "* * * * * RAS SURVEY MISMATCH IN \"Mouth/Dental\" section 'Worsened sense of taste because of problems with teeth/mouth' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.uncomfortableEatingAnyFoodsWithTheirTeethMouthDropdown, ras_Survey_TestDataManager.haveYouFoundItUncomfortableToEatAnyFoods, "* * * * * RAS SURVEY MISMATCH IN \"Mouth/Dental\" section 'Uncomfortable eating any foods with their teeth/mouth' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.unsatisfactoryDietBecauseOfProblemsWithTeethMouthDropdown, ras_Survey_TestDataManager.hasYourDietBeenUnsatisfactoryBecause, "* * * * * RAS SURVEY MISMATCH IN \"Mouth/Dental\" section 'Unsatisfactory diet because of problems with teeth/mouth' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.hasTheParticipantFoundItDifficultToRelaxDueToProblemsWithTeethMouthDropdown, ras_Survey_TestDataManager.haveYouFeltTenseBecauseOfProblems, "* * * * * RAS SURVEY MISMATCH IN \"Mouth/Dental\" section 'Has the participant found it difficult to relax due to problems with teeth/mouth' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.irritableWithOthersPeopleBecauseOfProblemsWithTeethMouthDropdown, ras_Survey_TestDataManager.haveYouBeenIrritableWithOtherPeopleBecause, "* * * * * RAS SURVEY MISMATCH IN \"Mouth/Dental\" section 'Irritable with others people because of problems with teeth/mouth' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.hasTheParticipantFeltLifeWasLessSatisfyingDueToTheirTeethMouthDropdown, ras_Survey_TestDataManager.haveYouFeltThatLifeInGeneralIsLessSatisfying, "* * * * * RAS SURVEY MISMATCH IN \"Mouth/Dental\" section 'Has the participant felt life was less satisfying due to their teeth/mouth' DROPDOWN * * * * *");
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method verifies the RAS Survey data for scenario two in Native View within the "Hair & Skin" section.
     */
    public static void verify_ras_survey_data_scenarioTwo_hair_and_skin_section() {
        String expectedDescriptionOfParticipantsHairText = "Waveless, Wavy, Sparse/having too little hair, Fine, Curly/wooly, East to pluck, Other";
        String expectedDiagnosedSkinIssuesText = "Keratosis pilaris (patches of small, hard bumps often found on the upper arms. These look similar to goose bumps), Palmar/plantar hyperkeratosis (significant thickening of the skin on the palms of the hands or soles of the feet), Facial keratosis/Ulerythema ophryogenes (patches of dry, hard sandpaper-like bumps on the face, particularly in and near the eyebrows), Ichthyosis (dry, scaly skin), Other (please specify)";
        String expectedDescriptionOfParticipantsSkinMarksText = "Three or more cafe-au-lait spots (light brown birthmarks the color of coffee with milk), Diffuse hyperpigmentation (patches of skin that are darker than the rest of your skin), Three or more nevi (small brown, tan, pink or red spots, also called moles), Three or more lentigines (dark, smooth/flat freckles or spots on the skin), Other (please specify)";
        String expectedDiagnosedSkinTumorsText = "Granular cell tumor (soft tissue tumor, often benign, commonly located in the head and neck area and tongue), Melanoma, Dysplastic nevi, Papilloma (wart-like growths), Other (please specify)";
        CommonUtils.waitForVisibility(ras_survey_native_view.dynamicTabLocator("Hair & Skin"));
        JavascriptUtils.scrollIntoView(ras_survey_native_view.dynamicTabLocator("Hair & Skin"));
        CommonUtils.clickOnElement(ras_survey_native_view.dynamicTabLocator("Hair & Skin"));
        CommonUtils.waitForVisibility(ras_survey_native_view.hasParticipantBeenEvaluatedByADermatologistDropdown);
        softAssertDropDownValueIsSelected(ras_survey_native_view.hasParticipantBeenEvaluatedByADermatologistDropdown, ras_Survey_TestDataManager.haveYouEverBeenEvaluatedByADermatologist, "* * * * * RAS SURVEY MISMATCH IN \"Hair & Skin\" section 'Has participant been evaluated by a dermatologist?' DROPDOWN * * * * *");
        softAssert.assertEquals(ras_survey_native_view.descriptionOfParticipantsHairText.getText(), expectedDescriptionOfParticipantsHairText, "* * * * * RAS SURVEY MISMATCH IN \"Hair & Skin\" section 'Description of participant's hair' TEXT LIST * * * * *");
        verifyInputField(ras_survey_native_view.nameOfDermatologistInputField, ras_Survey_TestDataManager.pleaseProvideDermatologistWhoCompletedYourEvaluationOption1, "* * * * * RAS SURVEY MISMATCH IN \"Hair & Skin\" section 'Name of dermatologist' INPUT FIELD * * * * *");
        verifyInputField(ras_survey_native_view.cityStateOfDermatologistInputField, ras_Survey_TestDataManager.pleaseProvideDermatologistWhoCompletedYourEvaluationOption2, "* * * * * RAS SURVEY MISMATCH IN \"Hair & Skin\" section 'City, State of dermatologist' INPUT FIELD * * * * *");
        verifyInputField(ras_survey_native_view.hospitalOrMedicalCenterAffiliationOfDermatologistInputField, ras_Survey_TestDataManager.pleaseProvideDermatologistWhoCompletedYourEvaluationOption3, "* * * * * RAS SURVEY MISMATCH IN \"Hair & Skin\" section 'Hospital or Medical Center Affiliation of Dermatologist' INPUT FIELD * * * * *");
        verifyInputField(ras_survey_native_view.otherHairDescriptionInputField, ras_Survey_TestDataManager.pleaseChooseTheBestTermsToDescribeYourHair7Other, "* * * * * RAS SURVEY MISMATCH IN \"Hair & Skin\" section 'Other hair description' INPUT FIELD * * * * *");
        softAssert.assertEquals(ras_survey_native_view.diagnosedSkinIssuesText.getText(), expectedDiagnosedSkinIssuesText, "* * * * * RAS SURVEY MISMATCH IN \"Hair & Skin\" section 'Diagnosed skin issues' TEXT LIST * * * * *");
        verifyInputField(ras_survey_native_view.otherSkinIssuesInputField, ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithPatchesOfThickenedSkinOther, "* * * * * RAS SURVEY MISMATCH IN \"Hair & Skin\" section 'Other skin issues' INPUT FIELD * * * * *");
        softAssert.assertEquals(ras_survey_native_view.pigmentedSkinFindingsText.getText(), expectedDescriptionOfParticipantsSkinMarksText, "* * * * * RAS SURVEY MISMATCH IN \"Hair & Skin\" section 'Pigmented skin findings' TEXT LIST * * * * *");
        verifyInputField(ras_survey_native_view.otherPigmentedSkinFindingsInputField, ras_Survey_TestDataManager.doYouHaveAnyOfTheFollowingPigmentedSkinFindingsOther, "* * * * * RAS SURVEY MISMATCH IN \"Hair & Skin\" section 'Other pigmented findings' INPUT FIELD * * * * *");
        softAssert.assertEquals(ras_survey_native_view.diagnosedSkinTumorsText.getText(), expectedDiagnosedSkinTumorsText, "* * * * * RAS SURVEY MISMATCH IN \"Hair & Skin\" section 'Diagnosed skin tumors' TEXT LIST * * * * *");
        verifyInputField(ras_survey_native_view.otherSkinTumorsInputField, ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithAnyOfTheFollowingSkinTumorsOthers, "* * * * * RAS SURVEY MISMATCH IN \"Hair & Skin\" section 'Other skin tumors' INPUT FIELD * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.isTheTextureOrAmountOfHairSimilarToABiologicalRelativesDropdown, ras_Survey_TestDataManager.isTheTextureOrAmountOfYourHairSimilar, "* * * * * RAS SURVEY MISMATCH IN \"Hair & Skin\" section 'Is the texture or amount of hair similar to a biological relatives?' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.doesTheParticipantHaveAnyHemangiomasDropdown, ras_Survey_TestDataManager.doYouHaveAnyHemangiomas, "* * * * * RAS SURVEY MISMATCH IN \"Hair & Skin\" section 'Does the participant have any hemangiomas?' DROPDOWN * * * * *");
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method verifies the RAS Survey data for scenario two in Native View within the "Skeletal" section.
     */
    public static void verify_ras_survey_data_scenarioTwo_skeletal_section() {
        String expectedDiagnosedSkeletalFindingsText = "Pectus carinatum (breastbone sticks out from the chest), Pectus excavatum (breastbone appears sunken or caved into the chest), Broad chest, nipples widely spaced, Other (please specify)";
        CommonUtils.waitForVisibility(ras_survey_native_view.dynamicTabLocator("Skeletal"));
        JavascriptUtils.scrollIntoView(ras_survey_native_view.dynamicTabLocator("Skeletal"));
        CommonUtils.clickOnElement(ras_survey_native_view.dynamicTabLocator("Skeletal"));
        CommonUtils.waitForVisibility(ras_survey_native_view.hasTheParticipantBeenEvaluatedByAnOrthopaedicSurgeonDropdown);
        softAssertDropDownValueIsSelected(ras_survey_native_view.hasTheParticipantBeenEvaluatedByAnOrthopaedicSurgeonDropdown, ras_Survey_TestDataManager.haveYouEverBeenEvaluatedByAnOrthopaedicSurgeon, "* * * * * RAS SURVEY MISMATCH IN \"Skeletal\" section 'Has the participant been evaluated by an orthopaedic surgeon?' DROPDOWN * * * * *");
        verifyInputField(ras_survey_native_view.nameOfOrthopaedicSurgeonInputField, ras_Survey_TestDataManager.pleaseProvideTheDetailsBelowForTheOrthopaedicOption1, "* * * * * RAS SURVEY MISMATCH IN \"Skeletal\" section 'Name of orthopaedic surgeon' INPUT FIELD * * * * *");
        verifyInputField(ras_survey_native_view.locationOfOrthopaedicSurgeonInputField, ras_Survey_TestDataManager.pleaseProvideTheDetailsBelowForTheOrthopaedicOption2, "* * * * * RAS SURVEY MISMATCH IN \"Skeletal\" section 'Location of orthopaedic surgeon' INPUT FIELD * * * * *");
        verifyInputField(ras_survey_native_view.orthopediacSurgeonsHospitalOrMedicalCenterAffiliationInputField, ras_Survey_TestDataManager.pleaseProvideTheDetailsBelowForTheOrthopaedicOption3, "* * * * * RAS SURVEY MISMATCH IN \"Skeletal\" section 'Orthopaedic surgeons hospital or medical center affiliation' INPUT FIELD * * * * *");
        softAssert.assertEquals(ras_survey_native_view.diagnosedSkeletalFindingsText.getText(), expectedDiagnosedSkeletalFindingsText, "* * * * * RAS SURVEY MISMATCH IN \"Skeletal\" section 'Diagnosed skeletal findings' TEXT LIST * * * * *");
        verifyInputField(ras_survey_native_view.otherSkeletalFindingsInputField, ras_Survey_TestDataManager.haveYouBeenDiagnosedWithAnyOfTheFollowingSkeletalOption4Other, "* * * * * RAS SURVEY MISMATCH IN \"Skeletal\" section 'Other skeletal findings' INPUT FIELD * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.doesTheParticipantHaveAnyIssuesWithCurvingOfTheSpineDropdown, ras_Survey_TestDataManager.doYouHaveAnyIssuesWithCurvingOfTheSpine, "* * * * * RAS SURVEY MISMATCH IN \"Skeletal\" section 'Does the participant have any issues with curving of the spine' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.hasTheParticipantNeckBeenDescribedAsShortOrWebbedDropdown, ras_Survey_TestDataManager.hasYourNeckBeenDescribedAsShortOrWebbed, "* * * * * RAS SURVEY MISMATCH IN \"Skeletal\" section 'Has the participant's neck been described as short or webbed?' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.hasTheParticipantEverBeenDiagnosedWithJoinIssuesDropdown, ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithJointIssues, "* * * * * RAS SURVEY MISMATCH IN \"Skeletal\" section 'Has the participant ever been diagnosed with joint issues?' DROPDOWN * * * * *");
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method verifies the RAS Survey data for scenario two in Native View within the "Hematology, Oncology and Immunology" section.
     */
    public static void verify_ras_survey_data_scenarioTwo_hematology_oncology_and_immunology_section() {
        CommonUtils.waitForVisibility(ras_survey_native_view.dynamicTabLocator("Hematology, Oncology and Immunology"));
        JavascriptUtils.scrollIntoView(ras_survey_native_view.dynamicTabLocator("Hematology, Oncology and Immunology"));
        CommonUtils.clickOnElement(ras_survey_native_view.dynamicTabLocator("Hematology, Oncology and Immunology"));
        CommonUtils.waitForVisibility(ras_survey_native_view.hasTheParticipantEverBeenEvaluatedByAHematologistOrOncologistDropdown);
        softAssertDropDownValueIsSelected(ras_survey_native_view.hasTheParticipantEverBeenEvaluatedByAHematologistOrOncologistDropdown, ras_Survey_TestDataManager.haveYouEverHadAnEvaluationByAHematologist, "* * * * * RAS SURVEY MISMATCH IN \"Hematology, Oncology and Immunology\" section 'Has the participant ever had an evaluation by a hematologist or oncologist?' DROPDOWN * * * * *");
        verifyInputField(ras_survey_native_view.nameOfHematologistOncologistDropdown, ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForTheHematologistOption1, "* * * * * RAS SURVEY MISMATCH IN \"Hematology, Oncology and Immunology\" section 'Name of hematologist/oncologist' INPUT FIELD * * * * *");
        verifyInputField(ras_survey_native_view.locationOfHematologistOncologistDropdown, ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForTheHematologistOption2, "* * * * * RAS SURVEY MISMATCH IN \"Hematology, Oncology and Immunology\" section 'Name of hematologist/oncologist' INPUT FIELD * * * * *");
        verifyInputField(ras_survey_native_view.hematologistOncologistMedicalAffiliationInputField, ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForTheHematologistOption3, "* * * * * RAS SURVEY MISMATCH IN \"Hematology, Oncology and Immunology\" section 'Hematologist/Oncologist medical affiliation' INPUT FIELD * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.doesTheParticipantHaveAnyIssuesWithBleedingOrBruisingDropdown, ras_Survey_TestDataManager.doYouHaveIssuesWithBleedingOrBruising, "* * * * * RAS SURVEY MISMATCH IN \"Hematology, Oncology and Immunology\" section 'Does the participant have any issues with bleeding or bruising?' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.doesTheParticipantHaveAHistoryOfFrequentInfectionsDropdown, ras_Survey_TestDataManager.doYouHaveAHistoryOfFrequentInfections, "* * * * * RAS SURVEY MISMATCH IN \"Hematology, Oncology and Immunology\" section 'Does the participant have a history of frequent infections?' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.hasTheParticipantBeenDiagnosedWithAnAutoimmuneDisorderDropdown, ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithAnAutoimmuneDisorder, "* * * * * RAS SURVEY MISMATCH IN \"Hematology, Oncology and Immunology\" section 'Has the participant been diagnosed with an autoimmune disorder?' DROPDOWN * * * * *");
        verifyInputField(ras_survey_native_view.nameOfImmunologistRheumatologistInputField, ras_Survey_TestDataManager.pleaseProvideTheNameOfTheImmunologistOption1, "* * * * * RAS SURVEY MISMATCH IN \"Hematology, Oncology and Immunology\" section 'Name of immunologist/rheumatologist' INPUT FIELD * * * * *");
        verifyInputField(ras_survey_native_view.immunologistRheumatologistLocationInputField, ras_Survey_TestDataManager.pleaseProvideTheNameOfTheImmunologistOption2, "* * * * * RAS SURVEY MISMATCH IN \"Hematology, Oncology and Immunology\" section 'Immunologist/rheumatologist location' INPUT FIELD * * * * *");
        verifyInputField(ras_survey_native_view.immunologistRheumatologistAffiliationInputField, ras_Survey_TestDataManager.pleaseProvideTheNameOfTheImmunologistOption3, "* * * * * RAS SURVEY MISMATCH IN \"Hematology, Oncology and Immunology\" section 'Immunologist/rheumatologist affiliation' INPUT FIELD * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.doesTheParticipantHaveAnyKnownBloodDisordersOrSymptomsDropdown, ras_Survey_TestDataManager.doYouHaveAnyKnownBloodDisorders, "* * * * * RAS SURVEY MISMATCH IN \"Hematology, Oncology and Immunology\" section 'Does the participant have any known blood disorders or symptoms such disorders?' INPUT FIELD * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.hasTheParticipantBeenEvaluatedByAnImmunologistOrRheumatologistDropdown, ras_Survey_TestDataManager.haveYouEverBeenEvaluatedByAnImmunologist, "* * * * * RAS SURVEY MISMATCH IN \"Hematology, Oncology and Immunology\" section 'Has the participant been evaluated by an immunologist or rheumatologist?' INPUT FIELD * * * * *");
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method verifies the RAS Survey data for scenario two in Native View within the "Brain & Neurology" section.
     */
    public static void verify_ras_survey_data_scenarioTwo_brain_neurology_section() {
        CommonUtils.waitForVisibility(ras_survey_native_view.dynamicTabLocator("Brain & Neurology"));
        JavascriptUtils.scrollIntoView(ras_survey_native_view.dynamicTabLocator("Brain & Neurology"));
        CommonUtils.clickOnElement(ras_survey_native_view.dynamicTabLocator("Brain & Neurology"));
        CommonUtils.waitForVisibility(ras_survey_native_view.hasTheParticipantEverBeenEvaluatedByANeurologistOrNeurosurgeonDropdown);
        softAssertDropDownValueIsSelected(ras_survey_native_view.hasTheParticipantEverBeenEvaluatedByANeurologistOrNeurosurgeonDropdown, ras_Survey_TestDataManager.haveYouEverBeenEvaluatedByANeurologist, "* * * * * RAS SURVEY MISMATCH IN \"Brain & Neurology\" section 'Has the participant ever been evaluated by a neurologist or neurosurgeon?' INPUT FIELD * * * * *");
        verifyInputField(ras_survey_native_view.nameOfNeurologistInputField, ras_Survey_TestDataManager.pleaseProvideTheInformationForTheNeurologistOption1, "* * * * * RAS SURVEY MISMATCH IN \"Brain & Neurology\" section 'Name of neurologist' INPUT FIELD * * * * *");
        verifyInputField(ras_survey_native_view.locationOfNeurologistInputField, ras_Survey_TestDataManager.pleaseProvideTheInformationForTheNeurologistOption2, "* * * * * RAS SURVEY MISMATCH IN \"Brain & Neurology\" section 'Location of neurologist' INPUT FIELD * * * * *");
        verifyInputField(ras_survey_native_view.neurologistAffiliationInputField, ras_Survey_TestDataManager.pleaseProvideTheInformationForTheNeurologistOption3, "* * * * * RAS SURVEY MISMATCH IN \"Brain & Neurology\" section 'Neurologist affiliation' INPUT FIELD * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.hasTheParticipantEverBeenDiagnosedWithABrainAbnormalityDropdown, ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithAStructuralBrainAbnormality, "* * * * * RAS SURVEY MISMATCH IN \"Brain & Neurology\" section 'Has the participant ever been diagnosed with a structural brain abnormality?' INPUT FIELD * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.evaluatedByAPsychiatristPsychologistOrBehavioralPediatricianDropdown, ras_Survey_TestDataManager.haveYouEverBeenEvaluatedByAPsychiatrist, "* * * * * RAS SURVEY MISMATCH IN \"Brain & Neurology\" section 'Evaluated by a psychiatrist, psychologist or behavioral pediatrician?' INPUT FIELD * * * * *");
        verifyInputField(ras_survey_native_view.nameOfPhysicianInputField, ras_Survey_TestDataManager.pleaseProvideTheInformationListedPsychiatristOption1, "* * * * * RAS SURVEY MISMATCH IN \"Brain & Neurology\" section 'Name of physician' INPUT FIELD * * * * *");
        verifyInputField(ras_survey_native_view.locationOfPhysicianInputField, ras_Survey_TestDataManager.pleaseProvideTheInformationListedPsychiatristOption2, "* * * * * RAS SURVEY MISMATCH IN \"Brain & Neurology\" section 'Location of physician' INPUT FIELD * * * * *");
        verifyInputField(ras_survey_native_view.psychiatristAffiliationInputField, ras_Survey_TestDataManager.pleaseProvideTheInformationListedPsychiatristOption3, "* * * * * RAS SURVEY MISMATCH IN \"Brain & Neurology\" section 'Psychiatrist affiliation' INPUT FIELD * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.doesTheParticipantHaveAHistorySeizuresDropdown, ras_Survey_TestDataManager.doYouHaveAHistoryOfSeizures, "* * * * * RAS SURVEY MISMATCH IN \"Brain & Neurology\" section 'Does the participant have a history seizures?' INPUT FIELD * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.hasTheParticipantBeenDiagnosedWithABehavioralOrPsychiatricConditionDropdown, ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithABehavioral, "* * * * * RAS SURVEY MISMATCH IN \"Brain & Neurology\" section 'Has the participant been diagnosed with a behavioral or psychiatric condition?' INPUT FIELD * * * * *");
        CucumberLogUtils.logScreenshot();
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
        verify_ras_survey_data_scenarioTwo_breathing_section();
        verify_ras_survey_data_scenarioTwo_mouth_dental_section();
        verify_ras_survey_data_scenarioTwo_hair_and_skin_section();
        verify_ras_survey_data_scenarioTwo_skeletal_section();
        verify_ras_survey_data_scenarioTwo_hematology_oncology_and_immunology_section();
        verify_ras_survey_data_scenarioTwo_brain_neurology_section();
    }
}