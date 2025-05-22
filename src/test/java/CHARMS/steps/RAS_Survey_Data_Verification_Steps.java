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
import static APPS_COMMON.Pages.Selenium_Common_Locators.locateByXpath;
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
     * This method verifies the RAS Survey data for scenario two in Native View within the "Vision and Hearing" section.
     */
    public static void verify_ras_survey_data_scenarioTwo_vision_and_hearing_section() {
        String expectedParticipantEarIssues = "Excessive earwax, Chronic or recurrent ear infection, Other";
        CommonUtils.waitForVisibility(ras_survey_native_view.dynamicTabLocator("Vision & Hearing"));
        JavascriptUtils.scrollIntoView(ras_survey_native_view.dynamicTabLocator("Vision & Hearing"));
        CommonUtils.clickOnElement(ras_survey_native_view.dynamicTabLocator("Vision & Hearing"));
        CommonUtils.waitForVisibility(ras_survey_native_view.diagnosedWithPtosisDropdown);
        softAssertDropDownValueIsSelected(ras_survey_native_view.diagnosedWithPtosisDropdown, ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithPtosis, "* * * * * RAS SURVEY MISMATCH IN \"Vision & Hearing\" section 'Diagnosed with ptosis' INPUT FIELD * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.didThePtosisRequireTreatmentDropdown, ras_Survey_TestDataManager.didYouRequireTreatmentForPtosis, "* * * * * RAS SURVEY MISMATCH IN \"Vision & Hearing\" section 'Did the ptosis require treatment?' INPUT FIELD * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.participantExperiencedHearingLossDropdown, ras_Survey_TestDataManager.haveYouExperiencedHearingLoss, "* * * * * RAS SURVEY MISMATCH IN \"Vision & Hearing\" section 'Participant experienced hearing loss' INPUT FIELD * * * * *");
        softAssert.assertEquals(ras_survey_native_view.participantEarIssuesText.getText(), expectedParticipantEarIssues, "* * * * * RAS SURVEY MISMATCH IN \"Vision & Hearing\" section 'Participant ear issues' TEXT LIST * * * * *");
        verifyInputField(ras_survey_native_view.pleaseSpecifyParticipantEarIssuesInputField, ras_Survey_TestDataManager.doYouHaveAnyOfTheFollowingIssuesWithYourEarsOption3Other, "* * * * * RAS SURVEY MISMATCH IN \"Vision & Hearing\" section 'Please specify(Participant ear issues)' INPUT FIELD * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.issuesWithVisionOrEyesightDropdown, ras_Survey_TestDataManager.haveYouEverHadAnyIssuesWithYourVision, "* * * * * RAS SURVEY MISMATCH IN \"Vision & Hearing\" section 'Issues with vision or eyesight' INPUT FIELD * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.participantExperiencedStrabismusDropdown, ras_Survey_TestDataManager.haveYouEverExperiencedStabismus, "* * * * * RAS SURVEY MISMATCH IN \"Vision & Hearing\" section 'Participant experienced strabismus' INPUT FIELD * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.participantExperiencedNystagmusDropdown, ras_Survey_TestDataManager.haveYouEverExperiencedNystagmus, "* * * * * RAS SURVEY MISMATCH IN \"Vision & Hearing\" section 'Participant experienced nystagmus' INPUT FIELD * * * * *");
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method verifies the RAS Survey data for scenario two in Native View within the "Prenatal Test History" section.
     */
    public static void verify_ras_survey_data_scenarioTwo_prenatal_test_history_section() {
        clickTab("Prenatal Test History");
        verifyPrenatalTestHistory("Fetal blood sampling", "Normal");
        verifyPrenatalTestHistory("Ultrasound", "Normal");
        verifyPrenatalTestHistory("Stress test", "Normal");
        verifyPrenatalTestHistory("Amniocentesis", "Normal");
        verifyPrenatalTestHistory("X-rays", "Normal");
        verifyPrenatalTestHistory("Serum AFP (alpha-fetoprotein)", "Normal");
        verifyPrenatalTestHistory("Chorionic villus sampling", "Normal");
        openRelatedListRecord("Other (please specify)");
        assertTestType("Other (please specify)");
        assertTestResult("Normal");
        assertPleaseSpecifyField(ras_Survey_TestDataManager.pleaseIndicateTheResultsOfThePrenatalTestsOther);
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(locateByXpath("//button[@title='Back']"));
        CommonUtils.sleep(800);
    }

    /**
     * This method verifies the RAS Survey data for scenario two in Native View within the "Medication Taken While Pregnant" section.
     */
    public static void verify_ras_survey_data_scenarioTwo_medications_taken_while_pregnant_section() {
        clickTab("Medication Taken While Pregnant");
        openRelatedListRecord("Vitamins");
        verifyInputField(ras_survey_native_view.medicationInputField, ras_Survey_TestDataManager.pleaseSelectAllMedicationsYourMotherTookOption2, "* * * * * RAS SURVEY MISMATCH IN \"Medications Taken While Pregnant - Vitamins\" section 'Medication' * * * * *");
        verifyInputField(ras_survey_native_view.nameOfMedicationInputField, ras_Survey_TestDataManager.pleaseProvideDetailsOfTheMedicationTakenColumn1Option2, "* * * * * RAS SURVEY MISMATCH IN \"Medications Taken While Pregnant - Vitamins\" section 'Name of Medication' * * * * *");
        verifyInputField(ras_survey_native_view.lengthOfTimeMedicationWasTakenInputField, ras_Survey_TestDataManager.pleaseProvideDetailsOfTheMedicationTakenDROPDOWNOption2, "* * * * * RAS SURVEY MISMATCH IN \"Medications Taken While Pregnant - Vitamins\" section 'Length of time medication was taken' * * * * *");
        verifyInputField(ras_survey_native_view.reasonMedicationWasTakenInputField, ras_Survey_TestDataManager.pleaseProvideDetailsOfTheMedicationTakenColumn2Option2, "* * * * * RAS SURVEY MISMATCH IN \"Medications Taken While Pregnant - Vitamins\" section 'Reason medication was taken' * * * * *");
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(locateByXpath("//button[@title='Back']"));
        CommonUtils.sleep(800);
        openRelatedListRecord("Antihypertensives (for high blood pressure)");
        verifyInputField(ras_survey_native_view.medicationInputField, ras_Survey_TestDataManager.pleaseSelectAllMedicationsYourMotherTookOption3, "* * * * * RAS SURVEY MISMATCH IN \"Medications Taken While Pregnant - Medication for high blood glucose (e.g. insulin)\" section 'Medication' * * * * *");
        verifyInputField(ras_survey_native_view.nameOfMedicationInputField, ras_Survey_TestDataManager.pleaseProvideDetailsOfTheMedicationTakenColumn1Option3, "* * * * * RAS SURVEY MISMATCH IN \"Medications Taken While Pregnant - Medication for high blood glucose (e.g. insulin)\" section 'Name of Medication' * * * * *");
        verifyInputField(ras_survey_native_view.lengthOfTimeMedicationWasTakenInputField, ras_Survey_TestDataManager.pleaseProvideDetailsOfTheMedicationTakenDROPDOWNOption3, "* * * * * RAS SURVEY MISMATCH IN \"Medications Taken While Pregnant - Medication for high blood glucose (e.g. insulin)\" section 'Length of time medication was taken' * * * * *");
        verifyInputField(ras_survey_native_view.reasonMedicationWasTakenInputField, ras_Survey_TestDataManager.pleaseProvideDetailsOfTheMedicationTakenColumn2Option3, "* * * * * RAS SURVEY MISMATCH IN \"Medications Taken While Pregnant - Medication for high blood glucose (e.g. insulin)\" section 'Reason medication was taken' * * * * *");
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(locateByXpath("//button[@title='Back']"));
        CommonUtils.sleep(800);
        openRelatedListRecord("Medication for high blood glucose (e.g. insulin)");
        verifyInputField(ras_survey_native_view.medicationInputField, ras_Survey_TestDataManager.pleaseSelectAllMedicationsYourMotherTookOption4, "* * * * * RAS SURVEY MISMATCH IN \"Medications Taken While Pregnant - Antihypertensives\" section 'Medication' * * * * *");
        verifyInputField(ras_survey_native_view.nameOfMedicationInputField, ras_Survey_TestDataManager.pleaseProvideDetailsOfTheMedicationTakenColumn1Option4, "* * * * * RAS SURVEY MISMATCH IN \"Medications Taken While Pregnant - Antihypertensives\" section 'Name of Medication' * * * * *");
        verifyInputField(ras_survey_native_view.lengthOfTimeMedicationWasTakenInputField, ras_Survey_TestDataManager.pleaseProvideDetailsOfTheMedicationTakenDROPDOWNOption4, "* * * * * RAS SURVEY MISMATCH IN \"Medications Taken While Pregnant - Antihypertensives\" section 'Length of time medication was taken' * * * * *");
        verifyInputField(ras_survey_native_view.reasonMedicationWasTakenInputField, ras_Survey_TestDataManager.pleaseProvideDetailsOfTheMedicationTakenColumn2Option4, "* * * * * RAS SURVEY MISMATCH IN \"Medications Taken While Pregnant - Antihypertensives\" section 'Reason medication was taken' * * * * *");
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(locateByXpath("//button[@title='Back']"));
        CommonUtils.sleep(800);
        openRelatedListRecord("Antiemetics (for nausea)");
        verifyInputField(ras_survey_native_view.medicationInputField, ras_Survey_TestDataManager.pleaseSelectAllMedicationsYourMotherTookOption5, "* * * * * RAS SURVEY MISMATCH IN \"Medications Taken While Pregnant - Antiemetics (for nausea)\" section 'Medication' * * * * *");
        verifyInputField(ras_survey_native_view.nameOfMedicationInputField, ras_Survey_TestDataManager.pleaseProvideDetailsOfTheMedicationTakenColumn1Option5, "* * * * * RAS SURVEY MISMATCH IN \"Medications Taken While Pregnant - Antiemetics (for nausea)\" section 'Name of Medication' * * * * *");
        verifyInputField(ras_survey_native_view.lengthOfTimeMedicationWasTakenInputField, ras_Survey_TestDataManager.pleaseProvideDetailsOfTheMedicationTakenDROPDOWNOption5, "* * * * * RAS SURVEY MISMATCH IN \"Medications Taken While Pregnant - Antiemetics (for nausea)\" section 'Length of time medication was taken' * * * * *");
        verifyInputField(ras_survey_native_view.reasonMedicationWasTakenInputField, ras_Survey_TestDataManager.pleaseProvideDetailsOfTheMedicationTakenColumn2Option5, "* * * * * RAS SURVEY MISMATCH IN \"Medications Taken While Pregnant - Antiemetics (for nausea)\" section 'Reason medication was taken' * * * * *");
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(locateByXpath("//button[@title='Back']"));
        CommonUtils.sleep(800);
        openRelatedListRecord("Hormones (e.g. DES, progesterone)");
        verifyInputField(ras_survey_native_view.medicationInputField, ras_Survey_TestDataManager.pleaseSelectAllMedicationsYourMotherTookOption6, "* * * * * RAS SURVEY MISMATCH IN \"Medications Taken While Pregnant - Hormones (e.g. DES, progesterone)\" section 'Medication' * * * * *");
        verifyInputField(ras_survey_native_view.nameOfMedicationInputField, ras_Survey_TestDataManager.pleaseProvideDetailsOfTheMedicationTakenColumn1Option6, "* * * * * RAS SURVEY MISMATCH IN \"Medications Taken While Pregnant - Hormones (e.g. DES, progesterone)\" section 'Name of Medication' * * * * *");
        verifyInputField(ras_survey_native_view.lengthOfTimeMedicationWasTakenInputField, ras_Survey_TestDataManager.pleaseProvideDetailsOfTheMedicationTakenDROPDOWNOption6, "* * * * * RAS SURVEY MISMATCH IN \"Medications Taken While Pregnant - Hormones (e.g. DES, progesterone)\" section 'Length of time medication was taken' * * * * *");
        verifyInputField(ras_survey_native_view.reasonMedicationWasTakenInputField, ras_Survey_TestDataManager.pleaseProvideDetailsOfTheMedicationTakenColumn2Option6, "* * * * * RAS SURVEY MISMATCH IN \"Medications Taken While Pregnant - Hormones (e.g. DES, progesterone)\" section 'Reason medication was taken' * * * * *");
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(locateByXpath("//button[@title='Back']"));
        CommonUtils.sleep(800);
        openRelatedListRecord("Diuretics");
        verifyInputField(ras_survey_native_view.medicationInputField, ras_Survey_TestDataManager.pleaseSelectAllMedicationsYourMotherTookOption8, "* * * * * RAS SURVEY MISMATCH IN \"Medications Taken While Pregnant - Diuretics\" section 'Medication' * * * * *");
        verifyInputField(ras_survey_native_view.nameOfMedicationInputField, ras_Survey_TestDataManager.pleaseProvideDetailsOfTheMedicationTakenColumn1Option7, "* * * * * RAS SURVEY MISMATCH IN \"Medications Taken While Pregnant - Diuretics\" section 'Name of Medication' * * * * *");
        verifyInputField(ras_survey_native_view.lengthOfTimeMedicationWasTakenInputField, ras_Survey_TestDataManager.pleaseProvideDetailsOfTheMedicationTakenDROPDOWNOption7, "* * * * * RAS SURVEY MISMATCH IN \"Medications Taken While Pregnant - Diuretics\" section 'Length of time medication was taken' * * * * *");
        verifyInputField(ras_survey_native_view.reasonMedicationWasTakenInputField, ras_Survey_TestDataManager.pleaseProvideDetailsOfTheMedicationTakenColumn2Option8, "* * * * * RAS SURVEY MISMATCH IN \"Medications Taken While Pregnant - Diuretics\" section 'Reason medication was taken' * * * * *");
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(locateByXpath("//button[@title='Back']"));
        CommonUtils.sleep(800);
        openRelatedListRecord("Anti-depressants");
        verifyInputField(ras_survey_native_view.medicationInputField, ras_Survey_TestDataManager.pleaseSelectAllMedicationsYourMotherTookOption7, "* * * * * RAS SURVEY MISMATCH IN \"Medications Taken While Pregnant - Anti-depressants\" section 'Medication' * * * * *");
        verifyInputField(ras_survey_native_view.nameOfMedicationInputField, ras_Survey_TestDataManager.pleaseProvideDetailsOfTheMedicationTakenColumn1Option8, "* * * * * RAS SURVEY MISMATCH IN \"Medications Taken While Pregnant - Anti-depressants\" section 'Name of Medication' * * * * *");
        verifyInputField(ras_survey_native_view.lengthOfTimeMedicationWasTakenInputField, ras_Survey_TestDataManager.pleaseProvideDetailsOfTheMedicationTakenDROPDOWNOption8, "* * * * * RAS SURVEY MISMATCH IN \"Medications Taken While Pregnant - Anti-depressants\" section 'Length of time medication was taken' * * * * *");
        verifyInputField(ras_survey_native_view.reasonMedicationWasTakenInputField, ras_Survey_TestDataManager.pleaseProvideDetailsOfTheMedicationTakenColumn2Option7, "* * * * * RAS SURVEY MISMATCH IN \"Medications Taken While Pregnant - Anti-depressants\" section 'Reason medication was taken' * * * * *");
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(locateByXpath("//button[@title='Back']"));
        CommonUtils.sleep(800);
        openRelatedListRecord("Pain relievers");
        verifyInputField(ras_survey_native_view.medicationInputField, ras_Survey_TestDataManager.pleaseSelectAllMedicationsYourMotherTookOption9, "* * * * * RAS SURVEY MISMATCH IN \"Medications Taken While Pregnant - Pain relievers\" section 'Medication' * * * * *");
        verifyInputField(ras_survey_native_view.nameOfMedicationInputField, ras_Survey_TestDataManager.pleaseProvideDetailsOfTheMedicationTakenColumn1Option9, "* * * * * RAS SURVEY MISMATCH IN \"Medications Taken While Pregnant - Pain relievers\" section 'Name of Medication' * * * * *");
        verifyInputField(ras_survey_native_view.lengthOfTimeMedicationWasTakenInputField, ras_Survey_TestDataManager.pleaseProvideDetailsOfTheMedicationTakenDROPDOWNOption9, "* * * * * RAS SURVEY MISMATCH IN \"Medications Taken While Pregnant - Pain relievers\" section 'Length of time medication was taken' * * * * *");
        verifyInputField(ras_survey_native_view.reasonMedicationWasTakenInputField, ras_Survey_TestDataManager.pleaseProvideDetailsOfTheMedicationTakenColumn2Option9, "* * * * * RAS SURVEY MISMATCH IN \"Medications Taken While Pregnant - Pain relievers\" section 'Reason medication was taken' * * * * *");
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(locateByXpath("//button[@title='Back']"));
        CommonUtils.sleep(800);
        openRelatedListRecord("Medications for pre-term labor (e.g. terbutaline, magnesium sulfate)");
        verifyInputField(ras_survey_native_view.medicationInputField, ras_Survey_TestDataManager.pleaseSelectAllMedicationsYourMotherTookOption10, "* * * * * RAS SURVEY MISMATCH IN \"Medications Taken While Pregnant - Medications for pre-term labor (e.g. terbutaline, magnesium sulfate)\" section 'Medication' * * * * *");
        verifyInputField(ras_survey_native_view.nameOfMedicationInputField, ras_Survey_TestDataManager.pleaseProvideDetailsOfTheMedicationTakenColumn1Option10, "* * * * * RAS SURVEY MISMATCH IN \"Medications Taken While Pregnant - Medications for pre-term labor (e.g. terbutaline, magnesium sulfate)\" section 'Name of Medication' * * * * *");
        verifyInputField(ras_survey_native_view.lengthOfTimeMedicationWasTakenInputField, ras_Survey_TestDataManager.pleaseProvideDetailsOfTheMedicationTakenDROPDOWNOption10, "* * * * * RAS SURVEY MISMATCH IN \"Medications Taken While Pregnant - Medications for pre-term labor (e.g. terbutaline, magnesium sulfate)\" section 'Length of time medication was taken' * * * * *");
        verifyInputField(ras_survey_native_view.reasonMedicationWasTakenInputField, ras_Survey_TestDataManager.pleaseProvideDetailsOfTheMedicationTakenColumn2Option10, "* * * * * RAS SURVEY MISMATCH IN \"Medications Taken While Pregnant - Medications for pre-term labor (e.g. terbutaline, magnesium sulfate)\" section 'Reason medication was taken' * * * * *");
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(locateByXpath("//button[@title='Back']"));
        CommonUtils.sleep(800);
        openRelatedListRecord("Thyroid medications");
        verifyInputField(ras_survey_native_view.medicationInputField, ras_Survey_TestDataManager.pleaseSelectAllMedicationsYourMotherTookOption11, "* * * * * RAS SURVEY MISMATCH IN \"Medications Taken While Pregnant - Thyroid medications\" section 'Medication' * * * * *");
        verifyInputField(ras_survey_native_view.nameOfMedicationInputField, ras_Survey_TestDataManager.pleaseProvideDetailsOfTheMedicationTakenColumn1Option11, "* * * * * RAS SURVEY MISMATCH IN \"Medications Taken While Pregnant - Thyroid medications\" section 'Name of Medication' * * * * *");
        verifyInputField(ras_survey_native_view.lengthOfTimeMedicationWasTakenInputField, ras_Survey_TestDataManager.pleaseProvideDetailsOfTheMedicationTakenDROPDOWNOption11, "* * * * * RAS SURVEY MISMATCH IN \"Medications Taken While Pregnant - Thyroid medications\" section 'Length of time medication was taken' * * * * *");
        verifyInputField(ras_survey_native_view.reasonMedicationWasTakenInputField, ras_Survey_TestDataManager.pleaseProvideDetailsOfTheMedicationTakenColumn2Option11, "* * * * * RAS SURVEY MISMATCH IN \"Medications Taken While Pregnant - Thyroid medications\" section 'Reason medication was taken' * * * * *");
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(locateByXpath("//button[@title='Back']"));
        CommonUtils.sleep(800);
        openRelatedListRecord("Anti-seizure medications");
        verifyInputField(ras_survey_native_view.medicationInputField, ras_Survey_TestDataManager.pleaseSelectAllMedicationsYourMotherTookOption12, "* * * * * RAS SURVEY MISMATCH IN \"Medications Taken While Pregnant - Anti-seizure medications\" section 'Medication' * * * * *");
        verifyInputField(ras_survey_native_view.nameOfMedicationInputField, ras_Survey_TestDataManager.pleaseProvideDetailsOfTheMedicationTakenColumn1Option12, "* * * * * RAS SURVEY MISMATCH IN \"Medications Taken While Pregnant - Anti-seizure medications\" section 'Name of Medication' * * * * *");
        verifyInputField(ras_survey_native_view.lengthOfTimeMedicationWasTakenInputField, ras_Survey_TestDataManager.pleaseProvideDetailsOfTheMedicationTakenDROPDOWNOption12, "* * * * * RAS SURVEY MISMATCH IN \"Medications Taken While Pregnant - Anti-seizure medications\" section 'Length of time medication was taken' * * * * *");
        verifyInputField(ras_survey_native_view.reasonMedicationWasTakenInputField, ras_Survey_TestDataManager.pleaseProvideDetailsOfTheMedicationTakenColumn2Option12, "* * * * * RAS SURVEY MISMATCH IN \"Medications Taken While Pregnant - Anti-seizure medications\" section 'Reason medication was taken' * * * * *");
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(locateByXpath("//button[@title='Back']"));
        CommonUtils.sleep(800);
        openRelatedListRecord("Herbal supplements (please specify)");
        verifyInputField(ras_survey_native_view.medicationInputField, ras_Survey_TestDataManager.pleaseSelectAllMedicationsYourMotherTookOption13, "* * * * * RAS SURVEY MISMATCH IN \"Medications Taken While Pregnant - Herbal supplements (please specify)\" section 'Medication' * * * * *");
        verifyInputField(ras_survey_native_view.nameOfMedicationInputField, ras_Survey_TestDataManager.pleaseProvideDetailsOfTheMedicationTakenColumn1Option13, "* * * * * RAS SURVEY MISMATCH IN \"Medications Taken While Pregnant - Herbal supplements (please specify)\" section 'Name of Medication' * * * * *");
        verifyInputField(ras_survey_native_view.lengthOfTimeMedicationWasTakenInputField, ras_Survey_TestDataManager.pleaseProvideDetailsOfTheMedicationTakenDROPDOWNOption13, "* * * * * RAS SURVEY MISMATCH IN \"Medications Taken While Pregnant - Herbal supplements (please specify)\" section 'Length of time medication was taken' * * * * *");
        verifyInputField(ras_survey_native_view.reasonMedicationWasTakenInputField, ras_Survey_TestDataManager.pleaseProvideDetailsOfTheMedicationTakenColumn2Option13, "* * * * * RAS SURVEY MISMATCH IN \"Medications Taken While Pregnant - Herbal supplements (please specify)\" section 'Reason medication was taken' * * * * *");
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(locateByXpath("//button[@title='Back']"));
        CommonUtils.sleep(800);
        openRelatedListRecord("Total parental nutrition (TPN)");
        verifyInputField(ras_survey_native_view.medicationInputField, ras_Survey_TestDataManager.pleaseSelectAllMedicationsYourMotherTookOption14, "* * * * * RAS SURVEY MISMATCH IN \"Medications Taken While Pregnant - Total parental nutrition (TPN)\" section 'Medication' * * * * *");
        verifyInputField(ras_survey_native_view.nameOfMedicationInputField, ras_Survey_TestDataManager.pleaseProvideDetailsOfTheMedicationTakenColumn1Option14, "* * * * * RAS SURVEY MISMATCH IN \"Medications Taken While Pregnant - Total parental nutrition (TPN)\" section 'Name of Medication' * * * * *");
        verifyInputField(ras_survey_native_view.lengthOfTimeMedicationWasTakenInputField, ras_Survey_TestDataManager.pleaseProvideDetailsOfTheMedicationTakenDROPDOWNOption14, "* * * * * RAS SURVEY MISMATCH IN \"Medications Taken While Pregnant - Total parental nutrition (TPN)\" section 'Length of time medication was taken' * * * * *");
        verifyInputField(ras_survey_native_view.reasonMedicationWasTakenInputField, ras_Survey_TestDataManager.pleaseProvideDetailsOfTheMedicationTakenColumn2Option14, "* * * * * RAS SURVEY MISMATCH IN \"Medications Taken While Pregnant - Total parental nutrition (TPN)\" section 'Reason medication was taken' * * * * *");
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(locateByXpath("//button[@title='Back']"));
        CommonUtils.sleep(800);
        openRelatedListRecord("Other medication (please specify)");
        verifyInputField(ras_survey_native_view.medicationInputField, ras_Survey_TestDataManager.pleaseSelectAllMedicationsYourMotherTookOption15, "* * * * * RAS SURVEY MISMATCH IN \"Medications Taken While Pregnant - Other medication (please specify)\" section 'Medication' * * * * *");
        verifyInputField(ras_survey_native_view.nameOfMedicationInputField, ras_Survey_TestDataManager.pleaseProvideDetailsOfTheMedicationTakenColumn1Option15, "* * * * * RAS SURVEY MISMATCH IN \"Medications Taken While Pregnant - Other medication (please specify)\" section 'Name of Medication' * * * * *");
        verifyInputField(ras_survey_native_view.lengthOfTimeMedicationWasTakenInputField, ras_Survey_TestDataManager.pleaseProvideDetailsOfTheMedicationTakenDROPDOWNOption15, "* * * * * RAS SURVEY MISMATCH IN \"Medications Taken While Pregnant - Other medication (please specify)\" section 'Length of time medication was taken' * * * * *");
        verifyInputField(ras_survey_native_view.pleaseSpecifyMedicationWasTakenInputField, ras_Survey_TestDataManager.pleaseSelectAllMedicationsYourMotherTookOption15PleaseSpecify, "* * * * * RAS SURVEY MISMATCH IN \"Medications Taken While Pregnant - Other medication (please specify)\" section 'Please specify' * * * * *");
        verifyInputField(ras_survey_native_view.reasonMedicationWasTakenInputField, ras_Survey_TestDataManager.pleaseProvideDetailsOfTheMedicationTakenColumn2Option15, "* * * * * RAS SURVEY MISMATCH IN \"Medications Taken While Pregnant - Other medication (please specify)\" section 'Reason medication was taken' * * * * *");
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(locateByXpath("//button[@title='Back']"));
        CommonUtils.sleep(800);
        openRelatedListRecord("Antibiotics");
        verifyInputField(ras_survey_native_view.medicationInputField, ras_Survey_TestDataManager.pleaseSelectAllMedicationsYourMotherTookOption1, "* * * * * RAS SURVEY MISMATCH IN \"Medications Taken While Pregnant - Antibiotics\" section 'Medication' * * * * *");
        verifyInputField(ras_survey_native_view.nameOfMedicationInputField, ras_Survey_TestDataManager.pleaseProvideDetailsOfTheMedicationTakenColumn1Option1, "* * * * * RAS SURVEY MISMATCH IN \"Medications Taken While Pregnant - Antibiotics\" section 'Name of Medication' * * * * *");
        verifyInputField(ras_survey_native_view.lengthOfTimeMedicationWasTakenInputField, ras_Survey_TestDataManager.pleaseProvideDetailsOfTheMedicationTakenDROPDOWNOption5, "* * * * * RAS SURVEY MISMATCH IN \"Medications Taken While Pregnant - Antibiotics\" section 'Length of time medication was taken' * * * * *");
        verifyInputField(ras_survey_native_view.reasonMedicationWasTakenInputField, ras_Survey_TestDataManager.pleaseProvideDetailsOfTheMedicationTakenColumn2Option1, "* * * * * RAS SURVEY MISMATCH IN \"Medications Taken While Pregnant - Antibiotics\" section 'Reason medication was taken' * * * * *");
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(locateByXpath("//button[@title='Back']"));
        CommonUtils.sleep(800);
    }

    /**
     * This method verifies the RAS Survey data for scenario two in Native View within the "Growth Hormone Details" section.
     */
    public static void verify_ras_survey_data_scenarioTwo_growth_hormone_details_section() {
        clickTab("Growth Hormone Details");
        CommonUtils.hoverOverElement(locateByXpath("//tbody[@class='list2_body -sticky-group-headers']/tr[@record_class='x_naci_family_coho_growth_hormone_details']"));
        JavascriptUtils.clickByJS(locateByXpath("//tbody[@class='list2_body -sticky-group-headers']//a[@data-list_id='x_naci_family_coho_rasopathy_iiq.x_naci_family_coho_growth_hormone_details.iiq']"));
        CommonUtils.sleep(800);
        CommonUtils.waitForClickability(locateByXpath("//a[normalize-space()='Open Record']"));
        JavascriptUtils.clickByJS(locateByXpath("//a[normalize-space()='Open Record']"));
        CommonUtils.sleep(800);
        verifyInputField(ras_survey_native_view.hormoneTreatmentNumberInputField, "1.0", "* * * * * RAS SURVEY MISMATCH IN \"Growth Hormone Details - Hormone Treatment Number\" section 'Medication' * * * * *");
        verifyInputField(ras_survey_native_view.ageGrowthHormoneStartedInputField, ras_Survey_TestDataManager.pleaseProvideTheDetailsOfGrowthHormoneReplacementAgeStart, "* * * * * RAS SURVEY MISMATCH IN \"Growth Hormone Details - Age growth hormone started\" section '1.0' * * * * *");
        verifyInputField(ras_survey_native_view.ageGrowthHormoneStoppedInputField, ras_Survey_TestDataManager.pleaseProvideTheDetailsOfGrowthHormoneReplacementAgeStopped, "* * * * * RAS SURVEY MISMATCH IN \"Growth Hormone Details - Age growth hormone stopped\" section '1.0' * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.stillOnGrowthHormoneDropdown, "Yes", "* * * * * RAS SURVEY MISMATCH IN \"Growth Hormone Details - Still on growth hormone\" section '1.0' * * * * *");
        verifyInputField(ras_survey_native_view.dateGrowthHormoneStartedInputField, ras_Survey_TestDataManager.pleaseProvideTheDetailsOfGrowthHormoneReplacementDateStart, "* * * * * RAS SURVEY MISMATCH IN \"Growth Hormone Details - Date growth hormone started\" section '1.0' * * * * *");
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(locateByXpath("//button[@title='Back']"));
        CommonUtils.sleep(800);
    }

    /**
     * This method verifies the RAS Survey data for scenario two in Native View within the "Heart Symptoms" section.
     */
    public static void verify_ras_survey_data_scenarioTwo_heart_symptoms_details_section() {
        clickTab("Heart Symptoms");
        openRelatedListRecord("Chest pain or tightening");
        verifyInputField(ras_survey_native_view.symptomInputField, ras_Survey_TestDataManager.haveYouEverHadAnyOfTheFollowingSymptomsOption1, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Chest pain or tightening\" section 'Symptom' * * * * *");
        verifyInputField(ras_survey_native_view.ageOfFirstHospitalEvaluationInputField, ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn1Option1, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Chest pain or tightening\" section 'Age of first hospital evaluation' * * * * *");
        verifyInputField(ras_survey_native_view.dateOfFirstEvaluationInputField, ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn2Option1, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Chest pain or tightening\" section 'Date of first evaluation' * * * * *");
        verifyCheckbox("true", ras_survey_native_view.firstEvaluationUnknownCheckbox, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Chest pain or tightening\" section 'First evaluation unknown' CHECKBOX * * * * *");
        verifyInputField(ras_survey_native_view.firstHospitalEvaluationTextarea, ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn4Option1, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Chest pain or tightening\" section 'First hospital evaluation' * * * * *");
        verifyInputField(ras_survey_native_view.ageOfMostRecentEvaluationInputField, ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn5Option1, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Chest pain or tightening\" section 'Age of most recent evaluation' * * * * *");
        verifyInputField(ras_survey_native_view.dateOfMostRecentEvaluationInputField, ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn6Option1, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Chest pain or tightening\" section 'Date of most recent evaluation' * * * * *");
        verifyCheckbox("true", ras_survey_native_view.dateOfRecentEvaluationUnknownCheckbox, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Chest pain or tightening\" section 'Recent hospital evaluation' CHECKBOX * * * * *");
        verifyInputField(ras_survey_native_view.recentHospitalEvaluationTextarea, ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn8Option1, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Chest pain or tightening\" section 'Recent hospital evaluation' * * * * *");
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(locateByXpath("//button[@title='Back']"));
        CommonUtils.sleep(800);
        openRelatedListRecord("Fatigue");
        verifyInputField(ras_survey_native_view.symptomInputField, ras_Survey_TestDataManager.haveYouEverHadAnyOfTheFollowingSymptomsOption2, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Fatigue\" section 'Symptom' * * * * *");
        verifyInputField(ras_survey_native_view.ageOfFirstHospitalEvaluationInputField, ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn1Option2, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Fatigue\" section 'Age of first hospital evaluation' * * * * *");
        verifyInputField(ras_survey_native_view.dateOfFirstEvaluationInputField, ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn2Option2, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Fatigue\" section 'Date of first evaluation' * * * * *");
        verifyCheckbox("true", ras_survey_native_view.firstEvaluationUnknownCheckbox, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Fatigue\" section 'First evaluation unknown' CHECKBOX * * * * *");
        verifyInputField(ras_survey_native_view.firstHospitalEvaluationTextarea, ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn4Option2, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Fatigue\" section 'First hospital evaluation' * * * * *");
        verifyInputField(ras_survey_native_view.ageOfMostRecentEvaluationInputField, ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn5Option2, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Fatigue\" section 'Age of most recent evaluation' * * * * *");
        verifyInputField(ras_survey_native_view.dateOfMostRecentEvaluationInputField, ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn6Option2, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Fatigue\" section 'Date of most recent evaluation' * * * * *");
        verifyCheckbox("true", ras_survey_native_view.dateOfRecentEvaluationUnknownCheckbox, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Fatigue\" section 'Recent hospital evaluation' CHECKBOX * * * * *");
        verifyInputField(ras_survey_native_view.recentHospitalEvaluationTextarea, ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn8Option2, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Fatigue\" section 'Recent hospital evaluation' * * * * *");
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(locateByXpath("//button[@title='Back']"));
        CommonUtils.sleep(800);
        openRelatedListRecord("Difficulty exercising");
        verifyInputField(ras_survey_native_view.symptomInputField, ras_Survey_TestDataManager.haveYouEverHadAnyOfTheFollowingSymptomsOption6, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Difficulty exercising\" section 'Symptom' * * * * *");
        verifyInputField(ras_survey_native_view.ageOfFirstHospitalEvaluationInputField, ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn1Option6, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Difficulty exercising\" section 'Age of first hospital evaluation' * * * * *");
        verifyInputField(ras_survey_native_view.dateOfFirstEvaluationInputField, ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn2Option6, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Difficulty exercising\" section 'Date of first evaluation' * * * * *");
        verifyCheckbox("true", ras_survey_native_view.firstEvaluationUnknownCheckbox, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Difficulty exercising\" section 'First evaluation unknown' CHECKBOX * * * * *");
        verifyInputField(ras_survey_native_view.firstHospitalEvaluationTextarea, ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn4Option6, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Difficulty exercising\" section 'First hospital evaluation' * * * * *");
        verifyInputField(ras_survey_native_view.ageOfMostRecentEvaluationInputField, ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn5Option6, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Difficulty exercising\" section 'Age of most recent evaluation' * * * * *");
        verifyInputField(ras_survey_native_view.dateOfMostRecentEvaluationInputField, ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn6Option6, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Difficulty exercising\" section 'Date of most recent evaluation' * * * * *");
        verifyCheckbox("true", ras_survey_native_view.dateOfRecentEvaluationUnknownCheckbox, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Difficulty exercising\" section 'Recent hospital evaluation' CHECKBOX * * * * *");
        verifyInputField(ras_survey_native_view.recentHospitalEvaluationTextarea, ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn8Option6, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Difficulty exercising\" section 'Recent hospital evaluation' * * * * *");
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(locateByXpath("//button[@title='Back']"));
        CommonUtils.sleep(800);
        openRelatedListRecord("Stroke");
        verifyInputField(ras_survey_native_view.symptomInputField, ras_Survey_TestDataManager.haveYouEverHadAnyOfTheFollowingSymptomsOption10, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Stroke\" section 'Symptom' * * * * *");
        verifyInputField(ras_survey_native_view.ageOfFirstHospitalEvaluationInputField, ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn1Option10, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Stroke\" section 'Age of first hospital evaluation' * * * * *");
        verifyInputField(ras_survey_native_view.dateOfFirstEvaluationInputField, ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn2Option10, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Stroke\" section 'Date of first evaluation' * * * * *");
        verifyCheckbox("true", ras_survey_native_view.firstEvaluationUnknownCheckbox, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Stroke\" section 'First evaluation unknown' CHECKBOX * * * * *");
        verifyInputField(ras_survey_native_view.firstHospitalEvaluationTextarea, ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn4Option10, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Stroke\" section 'First hospital evaluation' * * * * *");
        verifyInputField(ras_survey_native_view.ageOfMostRecentEvaluationInputField, ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn5Option10, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Stroke\" section 'Age of most recent evaluation' * * * * *");
        verifyInputField(ras_survey_native_view.dateOfMostRecentEvaluationInputField, ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn6Option10, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Stroke\" section 'Date of most recent evaluation' * * * * *");
        verifyCheckbox("true", ras_survey_native_view.dateOfRecentEvaluationUnknownCheckbox, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Stroke\" section 'Recent hospital evaluation' CHECKBOX * * * * *");
        verifyInputField(ras_survey_native_view.recentHospitalEvaluationTextarea, ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn8Option10, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Stroke\" section 'Recent hospital evaluation' * * * * *");
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(locateByXpath("//button[@title='Back']"));
        CommonUtils.sleep(800);
        openRelatedListRecord("Heart palpitations/irregular heartbeat");
        verifyInputField(ras_survey_native_view.symptomInputField, ras_Survey_TestDataManager.haveYouEverHadAnyOfTheFollowingSymptomsOption3, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Heart palpitations/irregular heartbeat\" section 'Symptom' * * * * *");
        verifyInputField(ras_survey_native_view.ageOfFirstHospitalEvaluationInputField, ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn1Option3, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Heart palpitations/irregular heartbeat\" section 'Age of first hospital evaluation' * * * * *");
        verifyInputField(ras_survey_native_view.dateOfFirstEvaluationInputField, ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn2Option3, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Heart palpitations/irregular heartbeat\" section 'Date of first evaluation' * * * * *");
        verifyCheckbox("true", ras_survey_native_view.firstEvaluationUnknownCheckbox, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Heart palpitations/irregular heartbeat\" section 'First evaluation unknown' CHECKBOX * * * * *");
        verifyInputField(ras_survey_native_view.firstHospitalEvaluationTextarea, ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn4Option3, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Heart palpitations/irregular heartbeat\" section 'First hospital evaluation' * * * * *");
        verifyInputField(ras_survey_native_view.ageOfMostRecentEvaluationInputField, ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn5Option3, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Heart palpitations/irregular heartbeat\" section 'Age of most recent evaluation' * * * * *");
        verifyInputField(ras_survey_native_view.dateOfMostRecentEvaluationInputField, ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn6Option3, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Heart palpitations/irregular heartbeat\" section 'Date of most recent evaluation' * * * * *");
        verifyCheckbox("true", ras_survey_native_view.dateOfRecentEvaluationUnknownCheckbox, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Heart palpitations/irregular heartbeat\" section 'Recent hospital evaluation' CHECKBOX * * * * *");
        verifyInputField(ras_survey_native_view.recentHospitalEvaluationTextarea, ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn8Option3, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Heart palpitations/irregular heartbeat\" section 'Recent hospital evaluation' * * * * *");
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(locateByXpath("//button[@title='Back']"));
        CommonUtils.sleep(800);
        openRelatedListRecord("Heart palpitations/irregular heartbeat");
        verifyInputField(ras_survey_native_view.symptomInputField, ras_Survey_TestDataManager.haveYouEverHadAnyOfTheFollowingSymptomsOption3, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Difficulty exercising\" section 'Symptom' * * * * *");
        verifyInputField(ras_survey_native_view.ageOfFirstHospitalEvaluationInputField, ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn1Option3, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Difficulty exercising\" section 'Age of first hospital evaluation' * * * * *");
        verifyInputField(ras_survey_native_view.dateOfFirstEvaluationInputField, ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn2Option3, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Difficulty exercising\" section 'Date of first evaluation' * * * * *");
        verifyCheckbox("true", ras_survey_native_view.firstEvaluationUnknownCheckbox, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Difficulty exercising\" section 'First evaluation unknown' CHECKBOX * * * * *");
        verifyInputField(ras_survey_native_view.firstHospitalEvaluationTextarea, ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn4Option3, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Difficulty exercising\" section 'First hospital evaluation' * * * * *");
        verifyInputField(ras_survey_native_view.ageOfMostRecentEvaluationInputField, ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn5Option3, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Difficulty exercising\" section 'Age of most recent evaluation' * * * * *");
        verifyInputField(ras_survey_native_view.dateOfMostRecentEvaluationInputField, ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn6Option3, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Difficulty exercising\" section 'Date of most recent evaluation' * * * * *");
        verifyCheckbox("true", ras_survey_native_view.dateOfRecentEvaluationUnknownCheckbox, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Difficulty exercising\" section 'Recent hospital evaluation' CHECKBOX * * * * *");
        verifyInputField(ras_survey_native_view.recentHospitalEvaluationTextarea, ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn8Option3, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Difficulty exercising\" section 'Recent hospital evaluation' * * * * *");
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(locateByXpath("//button[@title='Back']"));
        CommonUtils.sleep(800);
        openRelatedListRecord("High blood pressure");
        verifyInputField(ras_survey_native_view.symptomInputField, ras_Survey_TestDataManager.haveYouEverHadAnyOfTheFollowingSymptomsOption7, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Difficulty exercising\" section 'Symptom' * * * * *");
        verifyInputField(ras_survey_native_view.ageOfFirstHospitalEvaluationInputField, ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn1Option7, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Difficulty exercising\" section 'Age of first hospital evaluation' * * * * *");
        verifyInputField(ras_survey_native_view.dateOfFirstEvaluationInputField, ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn2Option7, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Difficulty exercising\" section 'Date of first evaluation' * * * * *");
        verifyCheckbox("true", ras_survey_native_view.firstEvaluationUnknownCheckbox, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Difficulty exercising\" section 'First evaluation unknown' CHECKBOX * * * * *");
        verifyInputField(ras_survey_native_view.firstHospitalEvaluationTextarea, ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn4Option7, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Difficulty exercising\" section 'First hospital evaluation' * * * * *");
        verifyInputField(ras_survey_native_view.ageOfMostRecentEvaluationInputField, ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn5Option7, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Difficulty exercising\" section 'Age of most recent evaluation' * * * * *");
        verifyInputField(ras_survey_native_view.dateOfMostRecentEvaluationInputField, ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn6Option7, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Difficulty exercising\" section 'Date of most recent evaluation' * * * * *");
        verifyCheckbox("true", ras_survey_native_view.dateOfRecentEvaluationUnknownCheckbox, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Difficulty exercising\" section 'Recent hospital evaluation' CHECKBOX * * * * *");
        verifyInputField(ras_survey_native_view.recentHospitalEvaluationTextarea, ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn8Option7, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Difficulty exercising\" section 'Recent hospital evaluation' * * * * *");
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(locateByXpath("//button[@title='Back']"));
        CommonUtils.sleep(800);
        openRelatedListRecord("Transient ischemic attack (TIA) also known as \"mini stroke\"");
        verifyInputField(ras_survey_native_view.symptomInputField, ras_Survey_TestDataManager.haveYouEverHadAnyOfTheFollowingSymptomsOption11, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Transient ischemic attack (TIA) also known as \"mini stroke\"\" section 'Symptom' * * * * *");
        verifyInputField(ras_survey_native_view.ageOfFirstHospitalEvaluationInputField, ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn1Option11, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Transient ischemic attack (TIA) also known as \"mini stroke\"\" section 'Age of first hospital evaluation' * * * * *");
        verifyInputField(ras_survey_native_view.dateOfFirstEvaluationInputField, ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn2Option11, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Transient ischemic attack (TIA) also known as \"mini stroke\"\" section 'Date of first evaluation' * * * * *");
        verifyCheckbox("true", ras_survey_native_view.firstEvaluationUnknownCheckbox, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Transient ischemic attack (TIA) also known as \"mini stroke\"\" section 'First evaluation unknown' CHECKBOX * * * * *");
        verifyInputField(ras_survey_native_view.firstHospitalEvaluationTextarea, ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn4Option11, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Transient ischemic attack (TIA) also known as \"mini stroke\"\" section 'First hospital evaluation' * * * * *");
        verifyInputField(ras_survey_native_view.ageOfMostRecentEvaluationInputField, ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn5Option11, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Transient ischemic attack (TIA) also known as \"mini stroke\"\" section 'Age of most recent evaluation' * * * * *");
        verifyInputField(ras_survey_native_view.dateOfMostRecentEvaluationInputField, ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn6Option11, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Transient ischemic attack (TIA) also known as \"mini stroke\"\" section 'Date of most recent evaluation' * * * * *");
        verifyCheckbox("true", ras_survey_native_view.dateOfRecentEvaluationUnknownCheckbox, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Transient ischemic attack (TIA) also known as \"mini stroke\"\" section 'Recent hospital evaluation' CHECKBOX * * * * *");
        verifyInputField(ras_survey_native_view.recentHospitalEvaluationTextarea, ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn8Option11, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Transient ischemic attack (TIA) also known as \"mini stroke\"\" section 'Recent hospital evaluation' * * * * *");
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(locateByXpath("//button[@title='Back']"));
        CommonUtils.sleep(800);
        openRelatedListRecord("Leg cramping");
        verifyInputField(ras_survey_native_view.symptomInputField, ras_Survey_TestDataManager.haveYouEverHadAnyOfTheFollowingSymptomsOption4, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Leg cramping\" section 'Symptom' * * * * *");
        verifyInputField(ras_survey_native_view.ageOfFirstHospitalEvaluationInputField, ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn1Option4, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Leg cramping\" section 'Age of first hospital evaluation' * * * * *");
        verifyInputField(ras_survey_native_view.dateOfFirstEvaluationInputField, ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn2Option4, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Leg cramping\" section 'Date of first evaluation' * * * * *");
        verifyCheckbox("true", ras_survey_native_view.firstEvaluationUnknownCheckbox, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Leg cramping\" section 'First evaluation unknown' CHECKBOX * * * * *");
        verifyInputField(ras_survey_native_view.firstHospitalEvaluationTextarea, ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn4Option4, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Leg cramping\" section 'First hospital evaluation' * * * * *");
        verifyInputField(ras_survey_native_view.ageOfMostRecentEvaluationInputField, ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn5Option4, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Leg cramping\" section 'Age of most recent evaluation' * * * * *");
        verifyInputField(ras_survey_native_view.dateOfMostRecentEvaluationInputField, ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn6Option4, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Leg cramping\" section 'Date of most recent evaluation' * * * * *");
        verifyCheckbox("true", ras_survey_native_view.dateOfRecentEvaluationUnknownCheckbox, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Leg cramping\" section 'Recent hospital evaluation' CHECKBOX * * * * *");
        verifyInputField(ras_survey_native_view.recentHospitalEvaluationTextarea, ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn8Option4, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Leg cramping\" section 'Recent hospital evaluation' * * * * *");
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(locateByXpath("//button[@title='Back']"));
        CommonUtils.sleep(800);
        openRelatedListRecord("Kidney dysfunction");
        verifyInputField(ras_survey_native_view.symptomInputField, ras_Survey_TestDataManager.haveYouEverHadAnyOfTheFollowingSymptomsOption8, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Kidney dysfunction\" section 'Symptom' * * * * *");
        verifyInputField(ras_survey_native_view.ageOfFirstHospitalEvaluationInputField, ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn1Option8, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Kidney dysfunction\" section 'Age of first hospital evaluation' * * * * *");
        verifyInputField(ras_survey_native_view.dateOfFirstEvaluationInputField, ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn2Option8, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Kidney dysfunction\" section 'Date of first evaluation' * * * * *");
        verifyCheckbox("true", ras_survey_native_view.firstEvaluationUnknownCheckbox, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Kidney dysfunction\" section 'First evaluation unknown' CHECKBOX * * * * *");
        verifyInputField(ras_survey_native_view.firstHospitalEvaluationTextarea, ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn4Option8, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Kidney dysfunction\" section 'First hospital evaluation' * * * * *");
        verifyInputField(ras_survey_native_view.ageOfMostRecentEvaluationInputField, ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn5Option8, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Kidney dysfunction\" section 'Age of most recent evaluation' * * * * *");
        verifyInputField(ras_survey_native_view.dateOfMostRecentEvaluationInputField, ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn6Option8, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Kidney dysfunction\" section 'Date of most recent evaluation' * * * * *");
        verifyCheckbox("true", ras_survey_native_view.dateOfRecentEvaluationUnknownCheckbox, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Kidney dysfunction\" section 'Recent hospital evaluation' CHECKBOX * * * * *");
        verifyInputField(ras_survey_native_view.recentHospitalEvaluationTextarea, ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn8Option8, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Kidney dysfunction\" section 'Recent hospital evaluation' * * * * *");
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(locateByXpath("//button[@title='Back']"));
        CommonUtils.sleep(800);
        openRelatedListRecord("Shortness of breath");
        verifyInputField(ras_survey_native_view.symptomInputField, ras_Survey_TestDataManager.haveYouEverHadAnyOfTheFollowingSymptomsOption5, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Shortness of breath\" section 'Symptom' * * * * *");
        verifyInputField(ras_survey_native_view.ageOfFirstHospitalEvaluationInputField, ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn1Option5, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Shortness of breath\" section 'Age of first hospital evaluation' * * * * *");
        verifyInputField(ras_survey_native_view.dateOfFirstEvaluationInputField, ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn2Option5, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Shortness of breath\" section 'Date of first evaluation' * * * * *");
        verifyCheckbox("true", ras_survey_native_view.firstEvaluationUnknownCheckbox, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Shortness of breath\" section 'First evaluation unknown' CHECKBOX * * * * *");
        verifyInputField(ras_survey_native_view.firstHospitalEvaluationTextarea, ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn4Option5, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Shortness of breath\" section 'First hospital evaluation' * * * * *");
        verifyInputField(ras_survey_native_view.ageOfMostRecentEvaluationInputField, ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn5Option5, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Shortness of breath\" section 'Age of most recent evaluation' * * * * *");
        verifyInputField(ras_survey_native_view.dateOfMostRecentEvaluationInputField, ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn6Option5, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Shortness of breath\" section 'Date of most recent evaluation' * * * * *");
        verifyCheckbox("true", ras_survey_native_view.dateOfRecentEvaluationUnknownCheckbox, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Shortness of breath\" section 'Recent hospital evaluation' CHECKBOX * * * * *");
        verifyInputField(ras_survey_native_view.recentHospitalEvaluationTextarea, ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn8Option5, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Shortness of breath\" section 'Recent hospital evaluation' * * * * *");
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(locateByXpath("//button[@title='Back']"));
        CommonUtils.sleep(800);
        openRelatedListRecord("Migraines");
        verifyInputField(ras_survey_native_view.symptomInputField, ras_Survey_TestDataManager.haveYouEverHadAnyOfTheFollowingSymptomsOption9, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Migraines\" section 'Symptom' * * * * *");
        verifyInputField(ras_survey_native_view.ageOfFirstHospitalEvaluationInputField, ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn1Option9, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Migraines\" section 'Age of first hospital evaluation' * * * * *");
        verifyInputField(ras_survey_native_view.dateOfFirstEvaluationInputField, ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn2Option9, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Migraines\" section 'Date of first evaluation' * * * * *");
        verifyCheckbox("true", ras_survey_native_view.firstEvaluationUnknownCheckbox, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Migraines\" section 'First evaluation unknown' CHECKBOX * * * * *");
        verifyInputField(ras_survey_native_view.firstHospitalEvaluationTextarea, ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn4Option9, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Migraines\" section 'First hospital evaluation' * * * * *");
        verifyInputField(ras_survey_native_view.ageOfMostRecentEvaluationInputField, ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn5Option9, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Migraines\" section 'Age of most recent evaluation' * * * * *");
        verifyInputField(ras_survey_native_view.dateOfMostRecentEvaluationInputField, ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn6Option9, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Migraines\" section 'Date of most recent evaluation' * * * * *");
        verifyCheckbox("true", ras_survey_native_view.dateOfRecentEvaluationUnknownCheckbox, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Migraines\" section 'Recent hospital evaluation' CHECKBOX * * * * *");
        verifyInputField(ras_survey_native_view.recentHospitalEvaluationTextarea, ras_Survey_TestDataManager.pleaseProvideInformationForTheFIRSTTreatmentColumn8Option9, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Symptoms - Migraines\" section 'Recent hospital evaluation' * * * * *");
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(locateByXpath("//button[@title='Back']"));
        CommonUtils.sleep(800);
    }

    /**
     * This method verifies the RAS Survey data for scenario two in Native View within the "Heart Treatments" section.
     */
    public static void verify_ras_survey_data_scenarioTwo_heart_treatments_section() {
        clickTab("Heart Treatments");
        openRelatedListRecord("Surgery");
        verifyInputField(ras_survey_native_view.surgeryInputField, ras_Survey_TestDataManager.haveYouEverHadAnyOfTheFollowingTreatmentsForHeartOption3, "* * * * * RAS SURVEY MISMATCH IN \"Heart Treatments - Surgery\" section 'Treatment' * * * * *");
        verifyInputField(ras_survey_native_view.dateOfFirstTreatmentInputField, ras_Survey_TestDataManager.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn2Option3, "* * * * * RAS SURVEY MISMATCH IN \"Heart Treatments - Surgery\" section 'Date of first treatment' * * * * *");
        verifyCheckbox("true", ras_survey_native_view.dateAgeOfFirstTreatmentUnknownCheckbox, "* * * * * RAS SURVEY MISMATCH IN \"Heart Treatments - Surgery\" section 'Date/age first treatment unknown' CHECKBOX * * * * *");
        verifyInputField(ras_survey_native_view.firstTreatmentLocationTextarea, ras_Survey_TestDataManager.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn4Option3, "* * * * * RAS SURVEY MISMATCH IN \"Heart Treatments - Surgery\" section 'First Treatment Location' * * * * *");
        verifyInputField(ras_survey_native_view.dateOfMostRecentTreatmentInputField, ras_Survey_TestDataManager.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn6Option3, "* * * * * RAS SURVEY MISMATCH IN \"Heart Treatments - Surgery\" section 'Date of most recent treatment' * * * * *");
        verifyCheckbox("true", ras_survey_native_view.dateAgeOfMostRecentTreatmentUnknownCheckbox, "* * * * * RAS SURVEY MISMATCH IN \"Heart Treatments - Surgery\" section 'Date/age recent treatment unknown' CHECKBOX * * * * *");
        verifyInputField(ras_survey_native_view.mostRecentTreatmentLocationTextarea, ras_Survey_TestDataManager.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn8Option3, "* * * * * RAS SURVEY MISMATCH IN \"Heart Treatments - Surgery\" section 'Most recent treatment location' * * * * *");
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(locateByXpath("//button[@title='Back']"));
        CommonUtils.sleep(1000);
        CommonUtils.hoverOverElement(locateByXpath("//tr[contains(@id,'row_x_naci_family_coho_rasopathy_iiq.x_naci_family_coho_participant_heart_treatment_history')]//td//a[@aria-label='Preview record: Other (please specify)']"));
        JavascriptUtils.clickByJS(locateByXpath("//tr[contains(@id,'row_x_naci_family_coho_rasopathy_iiq.x_naci_family_coho_participant_heart_treatment_history')]//td//a[@aria-label='Preview record: Other (please specify)']"));
        CommonUtils.sleep(800);
        CommonUtils.waitForClickability(locateByXpath("//a[normalize-space()='Open Record']"));
        JavascriptUtils.clickByJS(locateByXpath("//a[normalize-space()='Open Record']"));
        CommonUtils.sleep(800);
        verifyInputField(ras_survey_native_view.surgeryInputField, ras_Survey_TestDataManager.haveYouEverHadAnyOfTheFollowingTreatmentsForHeartOption4, "* * * * * RAS SURVEY MISMATCH IN \"Heart Treatments - Other (please specify)\" section 'Treatment' * * * * *");
        verifyInputField(ras_survey_native_view.pleaseSpecifyTreatmentInputField, ras_Survey_TestDataManager.haveYouEverHadAnyOfTheFollowingTreatmentsForHeartOption4Specify, "* * * * * RAS SURVEY MISMATCH IN \"Heart Treatments - Other (please specify)\" section 'Please specify' * * * * *");
        verifyInputField(ras_survey_native_view.dateOfFirstTreatmentInputField, ras_Survey_TestDataManager.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn2Option4, "* * * * * RAS SURVEY MISMATCH IN \"Heart Treatments - Other (please specify)\" section 'Date of first treatment' * * * * *");
        verifyCheckbox("true", ras_survey_native_view.dateAgeOfFirstTreatmentUnknownCheckbox, "* * * * * RAS SURVEY MISMATCH IN \"Heart Treatments - Other (please specify)\" section 'Date/age first treatment unknown' CHECKBOX * * * * *");
        verifyInputField(ras_survey_native_view.firstTreatmentLocationTextarea, ras_Survey_TestDataManager.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn4Option4, "* * * * * RAS SURVEY MISMATCH IN \"Heart Treatments - Other (please specify)\" section 'First Treatment Location' * * * * *");
        verifyInputField(ras_survey_native_view.dateOfMostRecentTreatmentInputField, ras_Survey_TestDataManager.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn6Option4, "* * * * * RAS SURVEY MISMATCH IN \"Heart Treatments - Other (please specify)\" section 'Date of most recent treatment' * * * * *");
        verifyCheckbox("true", ras_survey_native_view.dateAgeOfMostRecentTreatmentUnknownCheckbox, "* * * * * RAS SURVEY MISMATCH IN \"Heart Treatments - Other (please specify)\" section 'Date/age recent treatment unknown' CHECKBOX * * * * *");
        verifyInputField(ras_survey_native_view.mostRecentTreatmentLocationTextarea, ras_Survey_TestDataManager.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn8Option4, "* * * * * RAS SURVEY MISMATCH IN \"Heart Treatments - Other (please specify)\" section 'Most recent treatment location' * * * * *");
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(locateByXpath("//button[@title='Back']"));
        CommonUtils.sleep(800);
        openRelatedListRecord("Catheter intervention");
        verifyInputField(ras_survey_native_view.surgeryInputField, ras_Survey_TestDataManager.haveYouEverHadAnyOfTheFollowingTreatmentsForHeartOption2, "* * * * * RAS SURVEY MISMATCH IN \"Heart Treatments - Catheter intervention (i.e., \"a heart cath')\" section 'Treatment' * * * * *");
        verifyInputField(ras_survey_native_view.dateOfFirstTreatmentInputField, ras_Survey_TestDataManager.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn2Option2, "* * * * * RAS SURVEY MISMATCH IN \"Heart Treatments - Catheter intervention (i.e., \"a heart cath')\" section 'Date of first treatment' * * * * *");
        verifyCheckbox("true", ras_survey_native_view.dateAgeOfFirstTreatmentUnknownCheckbox, "* * * * * RAS SURVEY MISMATCH IN \"Heart Treatments - Catheter intervention (i.e., \"a heart cath')\" section 'Date/age first treatment unknown' CHECKBOX * * * * *");
        verifyInputField(ras_survey_native_view.firstTreatmentLocationTextarea, ras_Survey_TestDataManager.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn4Option2, "* * * * * RAS SURVEY MISMATCH IN \"Heart Treatments - Catheter intervention (i.e., \"a heart cath')\" section 'First Treatment Location' * * * * *");
        verifyInputField(ras_survey_native_view.dateOfMostRecentTreatmentInputField, ras_Survey_TestDataManager.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn6Option2, "* * * * * RAS SURVEY MISMATCH IN \"Heart Treatments - Catheter intervention (i.e., \"a heart cath')\" section 'Date of most recent treatment' * * * * *");
        verifyCheckbox("true", ras_survey_native_view.dateAgeOfMostRecentTreatmentUnknownCheckbox, "* * * * * RAS SURVEY MISMATCH IN \"Heart Treatments - Catheter intervention (i.e., \"a heart cath')\" section 'Date/age recent treatment unknown' CHECKBOX * * * * *");
        verifyInputField(ras_survey_native_view.mostRecentTreatmentLocationTextarea, ras_Survey_TestDataManager.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn8Option2, "* * * * * RAS SURVEY MISMATCH IN \"Heart Treatments - Catheter intervention (i.e., \"a heart cath')\" section 'Most recent treatment location' * * * * *");
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(locateByXpath("//button[@title='Back']"));
        CommonUtils.sleep(800);
        openRelatedListRecord("Medication (please specify)");
        verifyInputField(ras_survey_native_view.surgeryInputField, ras_Survey_TestDataManager.haveYouEverHadAnyOfTheFollowingTreatmentsForHeartOption1, "* * * * * RAS SURVEY MISMATCH IN \"Heart Treatments - Medication (please specify)\" section 'Treatment' * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.isTheParticipantStillOnThisMedicationDropdown, "Yes", "* * * * * RAS SURVEY MISMATCH IN \"Heart Treatments - Medication (please specify)\" section 'Is the participant still on this medication' DROPDOWN * * * * *");
        verifyInputField(ras_survey_native_view.pleaseSpecifyTreatmentInputField, ras_Survey_TestDataManager.haveYouEverHadAnyOfTheFollowingTreatmentsForHeartOption1Specify, "* * * * * RAS SURVEY MISMATCH IN \"Heart Treatments - Medication (please specify)\" section 'Please specify' * * * * *");
        verifyInputField(ras_survey_native_view.dateOfFirstTreatmentInputField, ras_Survey_TestDataManager.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn2Option1, "* * * * * RAS SURVEY MISMATCH IN \"Heart Treatments - Medication (please specify)\" section 'Date of first treatment' * * * * *");
        verifyCheckbox("true", ras_survey_native_view.dateAgeOfFirstTreatmentUnknownCheckbox, "* * * * * RAS SURVEY MISMATCH IN \"Heart Treatments - Medication (please specify)\" section 'Date/age first treatment unknown' CHECKBOX * * * * *");
        verifyInputField(ras_survey_native_view.firstTreatmentLocationTextarea, ras_Survey_TestDataManager.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn4Option1, "* * * * * RAS SURVEY MISMATCH IN \"Heart Treatments - Medication (please specify)\" section 'First Treatment Location' * * * * *");
        verifyInputField(ras_survey_native_view.dateOfMostRecentTreatmentInputField, ras_Survey_TestDataManager.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn6Option1, "* * * * * RAS SURVEY MISMATCH IN \"Heart Treatments - Medication (please specify)\" section 'Date of most recent treatment' * * * * *");
        verifyCheckbox("true", ras_survey_native_view.dateAgeOfMostRecentTreatmentUnknownCheckbox, "* * * * * RAS SURVEY MISMATCH IN \"Heart Treatments - Medication (please specify)\" section 'Date/age recent treatment unknown' CHECKBOX * * * * *");
        verifyInputField(ras_survey_native_view.mostRecentTreatmentLocationTextarea, ras_Survey_TestDataManager.pleaseProvidingInformationForFirstAndMostRecentTreatmentColumn8Option1, "* * * * * RAS SURVEY MISMATCH IN \"Heart Treatments - Medication (please specify)\" section 'Most recent treatment location' * * * * *");
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(locateByXpath("//button[@title='Back']"));
        CommonUtils.sleep(800);
    }

    /**
     * This method verifies the RAS Survey data for scenario two in Native View within the "Participant Heart Issues" section.
     */
    public static void verify_ras_survey_data_scenarioTwo_participant_heart_issues_section() {
        clickTab("Participant Heart Issues");
        openRelatedListRecord("Tachycardia (heart beats too fast)");
        verifyInputField(ras_survey_native_view.issueInputField, ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithAnyFunctionalHeartIssuesOption1, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Issues - Tachycardia (heart beats too fast)\" section 'Issue' * * * * *");
        verifyInputField(ras_survey_native_view.ageAtDiagnosisInputField, ras_Survey_TestDataManager.pleaseProvideAnyDetailsKnownForTheConditionsColumn4Option1, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Issues - Tachycardia (heart beats too fast)\" section 'Age at diagnosis' * * * * *");
        verifyInputField(ras_survey_native_view.dateOfDiagnosisInputField, ras_Survey_TestDataManager.pleaseProvideAnyDetailsKnownForTheConditionsColumn5Option1, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Issues - Tachycardia (heart beats too fast)\" section 'Date of diagnosis' * * * * *");
        verifyCheckbox("true", ras_survey_native_view.ageDateOfDiagnosisUnknownCheckbox, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Issues - Tachycardia (heart beats too fast)\" section 'Age/date of diagnosis unknown' CHECKBOX * * * * *");
        verifyInputField(ras_survey_native_view.treatmentTextArea, ras_Survey_TestDataManager.pleaseProvideAnyDetailsKnownForTheConditionsColumn7Option1, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Issues - Tachycardia (heart beats too fast)\" section 'Treatment' * * * * *");
        verifyInputField(ras_survey_native_view.hospitalWhereTreatmentReceivedTextarea, ras_Survey_TestDataManager.pleaseProvideAnyDetailsKnownForTheConditionsColumn8Option1, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Issues - Tachycardia (heart beats too fast)\" section 'Hospital where treatment received' * * * * *");
        verifyInputField(ras_survey_native_view.ageAtFirstSymptomsInputField, ras_Survey_TestDataManager.pleaseProvideAnyDetailsKnownForTheConditionsColumn1Option1, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Issues - Tachycardia (heart beats too fast)\" section 'Age at first symptoms' * * * * *");
        verifyInputField(ras_survey_native_view.dateOfFirstSymptomsInputField, ras_Survey_TestDataManager.pleaseProvideAnyDetailsKnownForTheConditionsColumn2Option1, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Issues - Tachycardia (heart beats too fast)\" section 'Date of first symptoms' * * * * *");
        verifyCheckbox("true", ras_survey_native_view.ageDateOfFirstSymptomUnknownCheckbox, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Issues - Tachycardia (heart beats too fast)\" section 'Age/date of first symptom' CHECKBOX * * * * *");
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(locateByXpath("//button[@title='Back']"));
        CommonUtils.sleep(800);
        openRelatedListRecord("Cardiac conduction defect (when electrical signals cause irregular or abnormal heart beats)");
        verifyInputField(ras_survey_native_view.issueInputField, ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithAnyFunctionalHeartIssuesOption2, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Issues - Cardiac conduction defect\" section 'Issue' * * * * *");
        verifyInputField(ras_survey_native_view.ageAtDiagnosisInputField, ras_Survey_TestDataManager.pleaseProvideAnyDetailsKnownForTheConditionsColumn4Option2, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Issues - Cardiac conduction defect\" section 'Age at diagnosis' * * * * *");
        verifyInputField(ras_survey_native_view.dateOfDiagnosisInputField, ras_Survey_TestDataManager.pleaseProvideAnyDetailsKnownForTheConditionsColumn5Option2, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Issues - Cardiac conduction defect\" section 'Date of diagnosis' * * * * *");
        verifyCheckbox("true", ras_survey_native_view.ageDateOfDiagnosisUnknownCheckbox, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Issues - Cardiac conduction defect\" section 'Age/date of diagnosis unknown' CHECKBOX * * * * *");
        verifyInputField(ras_survey_native_view.treatmentTextArea, ras_Survey_TestDataManager.pleaseProvideAnyDetailsKnownForTheConditionsColumn7Option2, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Issues - Cardiac conduction defect\" section 'Treatment' * * * * *");
        verifyInputField(ras_survey_native_view.hospitalWhereTreatmentReceivedTextarea, ras_Survey_TestDataManager.pleaseProvideAnyDetailsKnownForTheConditionsColumn8Option2, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Issues - Cardiac conduction defect\" section 'Hospital where treatment received' * * * * *");
        verifyInputField(ras_survey_native_view.ageAtFirstSymptomsInputField, ras_Survey_TestDataManager.pleaseProvideAnyDetailsKnownForTheConditionsColumn1Option2, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Issues - Cardiac conduction defect\" section 'Age at first symptoms' * * * * *");
        verifyInputField(ras_survey_native_view.dateOfFirstSymptomsInputField, ras_Survey_TestDataManager.pleaseProvideAnyDetailsKnownForTheConditionsColumn2Option2, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Issues - Cardiac conduction defect\" section 'Date of first symptoms' * * * * *");
        verifyCheckbox("true", ras_survey_native_view.ageDateOfFirstSymptomUnknownCheckbox, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Issues - Cardiac conduction defect\" section 'Age/date of first symptom' CHECKBOX * * * * *");
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(locateByXpath("//button[@title='Back']"));
        CommonUtils.sleep(800);
        openRelatedListRecord("Heart failure (when the heart cannot");
        verifyInputField(ras_survey_native_view.issueInputField, ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithAnyFunctionalHeartIssuesOption3, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Issues - Heart failure (when the heart cannot pump enough blood to the body)\" section 'Issue' * * * * *");
        verifyInputField(ras_survey_native_view.ageAtDiagnosisInputField, ras_Survey_TestDataManager.pleaseProvideAnyDetailsKnownForTheConditionsColumn4Option3, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Issues - Heart failure (when the heart cannot pump enough blood to the body)\" section 'Age at diagnosis' * * * * *");
        verifyInputField(ras_survey_native_view.dateOfDiagnosisInputField, ras_Survey_TestDataManager.pleaseProvideAnyDetailsKnownForTheConditionsColumn5Option3, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Issues - Heart failure (when the heart cannot pump enough blood to the body)\" section 'Date of diagnosis' * * * * *");
        verifyCheckbox("true", ras_survey_native_view.ageDateOfDiagnosisUnknownCheckbox, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Issues - Heart failure (when the heart cannot pump enough blood to the body)\" section 'Age/date of diagnosis unknown' CHECKBOX * * * * *");
        verifyInputField(ras_survey_native_view.treatmentTextArea, ras_Survey_TestDataManager.pleaseProvideAnyDetailsKnownForTheConditionsColumn7Option3, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Issues - Heart failure (when the heart cannot pump enough blood to the body)\" section 'Treatment' * * * * *");
        verifyInputField(ras_survey_native_view.hospitalWhereTreatmentReceivedTextarea, ras_Survey_TestDataManager.pleaseProvideAnyDetailsKnownForTheConditionsColumn8Option3, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Issues - Heart failure (when the heart cannot pump enough blood to the body)\" section 'Hospital where treatment received' * * * * *");
        verifyInputField(ras_survey_native_view.ageAtFirstSymptomsInputField, ras_Survey_TestDataManager.pleaseProvideAnyDetailsKnownForTheConditionsColumn1Option3, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Issues - Heart failure (when the heart cannot pump enough blood to the body)\" section 'Age at first symptoms' * * * * *");
        verifyInputField(ras_survey_native_view.dateOfFirstSymptomsInputField, ras_Survey_TestDataManager.pleaseProvideAnyDetailsKnownForTheConditionsColumn2Option3, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Issues - Heart failure (when the heart cannot pump enough blood to the body)\" section 'Date of first symptoms' * * * * *");
        verifyCheckbox("true", ras_survey_native_view.ageDateOfFirstSymptomUnknownCheckbox, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Issues - Heart failure (when the heart cannot pump enough blood to the body)\" section 'Age/date of first symptom' CHECKBOX * * * * *");
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(locateByXpath("//button[@title='Back']"));
        CommonUtils.sleep(800);
        CommonUtils.hoverOverElement(locateByXpath("//tr[contains(@id,'x_naci_family_coho_rasopathy_iiq.x_naci_family_coho_participant_heart_issues.iiq')]//td//a[@aria-label='Preview record: Other (please specify)']"));
        JavascriptUtils.clickByJS(locateByXpath("//tr[contains(@id,'x_naci_family_coho_rasopathy_iiq.x_naci_family_coho_participant_heart_issues.iiq')]//td//a[@aria-label='Preview record: Other (please specify)']"));
        CommonUtils.sleep(800);
        CommonUtils.waitForClickability(locateByXpath("//a[normalize-space()='Open Record']"));
        JavascriptUtils.clickByJS(locateByXpath("//a[normalize-space()='Open Record']"));
        CommonUtils.sleep(800);
        verifyInputField(ras_survey_native_view.issueInputField, "Other (please specify)", "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Issues - Heart failure (when the heart cannot pump enough blood to the body)\" section 'Issue' * * * * *");
        verifyInputField(ras_survey_native_view.pleaseSpecifyParticipantHeartIssuesInputField, ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithAnyFunctionalHeartIssuesOption4Other, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Issues - Other (please specify)\" section 'Please specify' * * * * *");
        verifyInputField(ras_survey_native_view.ageAtDiagnosisInputField, ras_Survey_TestDataManager.pleaseProvideAnyDetailsKnownForTheConditionsColumn4Option4, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Issues - Other (please specify)\" section 'Age at diagnosis' * * * * *");
        verifyInputField(ras_survey_native_view.dateOfDiagnosisInputField, ras_Survey_TestDataManager.pleaseProvideAnyDetailsKnownForTheConditionsColumn5Option4, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Issues - Other (please specify)\" section 'Date of diagnosis' * * * * *");
        verifyCheckbox("true", ras_survey_native_view.ageDateOfDiagnosisUnknownCheckbox, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Issues - Other (please specify)\" section 'Age/date of diagnosis unknown' CHECKBOX * * * * *");
        verifyInputField(ras_survey_native_view.treatmentTextArea, ras_Survey_TestDataManager.pleaseProvideAnyDetailsKnownForTheConditionsColumn7Option4, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Issues - Other (please specify)\" section 'Treatment' * * * * *");
        verifyInputField(ras_survey_native_view.hospitalWhereTreatmentReceivedTextarea, ras_Survey_TestDataManager.pleaseProvideAnyDetailsKnownForTheConditionsColumn8Option4, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Issues - Other (please specify)\" section 'Hospital where treatment received' * * * * *");
        verifyInputField(ras_survey_native_view.ageAtFirstSymptomsInputField, ras_Survey_TestDataManager.pleaseProvideAnyDetailsKnownForTheConditionsColumn1Option4, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Issues - Other (please specify)\" section 'Age at first symptoms' * * * * *");
        verifyInputField(ras_survey_native_view.dateOfFirstSymptomsInputField, ras_Survey_TestDataManager.pleaseProvideAnyDetailsKnownForTheConditionsColumn2Option4, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Issues - Other (please specify)\" section 'Date of first symptoms' * * * * *");
        verifyCheckbox("true", ras_survey_native_view.ageDateOfFirstSymptomUnknownCheckbox, "* * * * * RAS SURVEY MISMATCH IN \"Participant Heart Issues - Other (please specify)\" section 'Age/date of first symptom' CHECKBOX * * * * *");
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(locateByXpath("//button[@title='Back']"));
        CommonUtils.sleep(800);
    }

    /**
     * This method verifies the RAS Survey data for scenario two in Native View within the "Biopsy History" section.
     */
    public static void verify_ras_survey_data_scenarioTwo_biopsy_history_section() {
        clickTab("Biopsy History");
        openRelatedListRecord("null");
        verifyInputField(ras_survey_native_view.biopsyHistoryTypeInputField, ras_Survey_TestDataManager.pleaseProvideTheInformationForEachBiopsyColumn1, "* * * * * RAS SURVEY MISMATCH IN \"Biopsy\" section 'Type' * * * * *");
        verifyInputField(ras_survey_native_view.dateBiopsyWasPerformedInputField, ras_Survey_TestDataManager.pleaseProvideTheInformationForEachBiopsyColumn3, "* * * * * RAS SURVEY MISMATCH IN \"Biopsy\" section 'Date biopsy was performed' * * * * *");
        verifyInputField(ras_survey_native_view.nameAndLocationOfFacilityWhereBiopsyWasPreformedTextarea, ras_Survey_TestDataManager.pleaseProvideTheInformationForEachBiopsyColumn6, "* * * * * RAS SURVEY MISMATCH IN \"Biopsy\" section 'Name and location of facility where biopsy was preformed' * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.biopsyHistoryReasonDropdown, ras_Survey_TestDataManager.pleaseProvideTheInformationForEachBiopsyColumn5, "* * * * * RAS SURVEY MISMATCH IN \"Biopsy\" section 'Pain' DROPDOWN * * * * *");
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(locateByXpath("//button[@title='Back']"));
        CommonUtils.sleep(800);
    }

    /**
     * This method verifies the RAS Survey data for scenario two in Native View within the "Allergy Histories" section.
     */
    public static void verify_ras_survey_data_scenarioTwo_allergy_histories_section() {
        clickTab("Allergy Histories");
        openRelatedListRecord("Test238");
        softAssertDropDownValueIsSelected(ras_survey_native_view.allergyHistoryTypeDropdown, "Medication", "* * * * * RAS SURVEY MISMATCH IN \"Allergy Histories - Test238\" section 'Type' DROPDOWN * * * * *");
        verifyInputField(ras_survey_native_view.allergyHistoryNameInputField, ras_Survey_TestDataManager.pleaseCompleteAllMedicationsToWhichYouAreAllergicColumn1, "* * * * * RAS SURVEY MISMATCH IN \"Allergy Histories - Test238\" section 'Name' * * * * *");
        verifyInputField(ras_survey_native_view.allergyHistoryReactionInputField, ras_Survey_TestDataManager.pleaseCompleteAllMedicationsToWhichYouAreAllergicColumn2, "* * * * * RAS SURVEY MISMATCH IN \"Allergy Histories - Test238\" section 'Reaction' * * * * *");
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(locateByXpath("//button[@title='Back']"));
        CommonUtils.sleep(800);
        openRelatedListRecord("Test241");
        softAssertDropDownValueIsSelected(ras_survey_native_view.allergyHistoryTypeDropdown, "Other", "* * * * * RAS SURVEY MISMATCH IN \"Allergy Histories - Test241\" section 'Type' DROPDOWN * * * * *");
        verifyInputField(ras_survey_native_view.allergyHistoryNameInputField, ras_Survey_TestDataManager.pleaseCompleteAllOtherToWhichYouAreAllergicColumn1, "* * * * * RAS SURVEY MISMATCH IN \"Allergy Histories - Test241\" section 'Name' * * * * *");
        verifyInputField(ras_survey_native_view.allergyHistoryReactionInputField, ras_Survey_TestDataManager.pleaseCompleteAllFoodsToWhichYouAreAllergicColumn1, "* * * * * RAS SURVEY MISMATCH IN \"Allergy Histories - Test241\" section 'Reaction' * * * * *");
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(locateByXpath("//button[@title='Back']"));
        CommonUtils.sleep(800);
    }

    /**
     * This method verifies the RAS Survey data for scenario two in Native View within the "Hospital History" section.
     */
    public static void verify_ras_survey_data_scenarioTwo_hospital_history_section() {
        clickTab("Hospital History");
        openRelatedListRecord("Test 226");
        verifyInputField(ras_survey_native_view.whereWasTheParticipantHospitalizedTextarea, ras_Survey_TestDataManager.pleaseProvideTheInformationForEachHospitalizationColumn5, "* * * * * RAS SURVEY MISMATCH IN \"Hospital History - Test 226\" section 'Where was the participant hospitalized' * * * * *");
        verifyInputField(ras_survey_native_view.reasonForHospitalizationTextarea, ras_Survey_TestDataManager.pleaseProvideTheInformationForEachHospitalizationColumn1, "* * * * * RAS SURVEY MISMATCH IN \"Hospital History - Test 226\" section 'Reason for hospitalization' * * * * *");
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(locateByXpath("//button[@title='Back']"));
        CommonUtils.sleep(800);
    }

    /**
     * This method verifies the RAS Survey data for scenario two in Native View within the "Gastrointestinal Exams" section.
     */
    public static void verify_ras_survey_data_scenarioTwo_gastrointestinal_exams_section() {
        clickTab("Gastrointestinal Exams");
        openRelatedListRecord("Digital rectal exam");
        verifyInputField(ras_survey_native_view.gastrointestinalExamsExamStudyTextarea, ras_Survey_TestDataManager.pleaseIndicateWhichOfTheFollowingProceduresOption1, "* * * * * RAS SURVEY MISMATCH IN \"Gastrointestinal Exams - Digital rectal exam\" section 'Exam/Study' * * * * *");
        verifyInputField(ras_survey_native_view.gastrointestinalExamsDateOfFirstExamInputField, ras_Survey_TestDataManager.pleaseProvideAnyDetailsKnownForTheConditionsColumn1Option1, "* * * * * RAS SURVEY MISMATCH IN \"Gastrointestinal Exams - Digital rectal exam\" section 'Date of first exam' * * * * *");
        verifyInputField(ras_survey_native_view.gastrointestinalExamsFindingsFromTheFirstExamInputField, ras_Survey_TestDataManager.pleaseProvideAnyDetailsKnownForTheConditionsColumn3Option1, "* * * * * RAS SURVEY MISMATCH IN \"Gastrointestinal Exams - Digital rectal exam\" section 'Findings from the first exam/study' * * * * *");
        verifyInputField(ras_survey_native_view.gastrointestinalExamsReasonTheParticipantHadTheirExamStudyTextarea, ras_Survey_TestDataManager.pleaseProvideAnyDetailsKnownForTheConditionsColumn2Option1, "* * * * * RAS SURVEY MISMATCH IN \"Gastrointestinal Exams - Digital rectal exam\" section 'Reason the participant had their exam/study' * * * * *");
        verifyInputField(ras_survey_native_view.gastrointestinalExamsWhereDidTheParticipantHaveTheirFirstExamStudyTextarea, ras_Survey_TestDataManager.pleaseProvideAnyDetailsKnownForTheConditionsColumn4Option1, "* * * * * RAS SURVEY MISMATCH IN \"Gastrointestinal Exams - Digital rectal exam\" section 'Where did the participant have their first exam/study?' * * * * *");
        verifyInputField(ras_survey_native_view.gastrointestinalExamsDateOfMostRecentExamInputField, ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn1Option1, "* * * * * RAS SURVEY MISMATCH IN \"Gastrointestinal Exams - Digital rectal exam\" section 'Date of most recent exam' * * * * *");
        verifyInputField(ras_survey_native_view.gastrointestinalExamsFindingsOfTheMostRecentExamTextarea, ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn3Option1, "* * * * * RAS SURVEY MISMATCH IN \"Gastrointestinal Exams - Digital rectal exam\" section 'Findings of the most recent exam' * * * * *");
        verifyInputField(ras_survey_native_view.gastrointestinalExamsReasonForMostRecentExamTextarea, ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn2Option1, "* * * * * RAS SURVEY MISMATCH IN \"Gastrointestinal Exams - Digital rectal exam\" section 'Reason for most recent exam' * * * * *");
        verifyInputField(ras_survey_native_view.gastrointestinalExamsWhereDidTheParticipantHaveTheirMostRecentStudyTextarea, ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn4Option1, "* * * * * RAS SURVEY MISMATCH IN \"Gastrointestinal Exams - Digital rectal exam\" section 'Where did the participant have their most recent study?' * * * * *");
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(locateByXpath("//button[@title='Back']"));
        CommonUtils.sleep(800);
        openRelatedListRecord("Colonoscopy");
        verifyInputField(ras_survey_native_view.gastrointestinalExamsExamStudyTextarea, ras_Survey_TestDataManager.pleaseIndicateWhichOfTheFollowingProceduresOption3, "* * * * * RAS SURVEY MISMATCH IN \"Gastrointestinal Exams - Colonoscopy\" section 'Exam/Study' * * * * *");
        verifyInputField(ras_survey_native_view.gastrointestinalExamsDateOfFirstExamInputField, ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForTheFirstProcedureColumn1Option3, "* * * * * RAS SURVEY MISMATCH IN \"Gastrointestinal Exams - Colonoscopy\" section 'Date of first exam' * * * * *");
        verifyInputField(ras_survey_native_view.gastrointestinalExamsFindingsFromTheFirstExamInputField, ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForTheFirstProcedureColumn3Option3, "* * * * * RAS SURVEY MISMATCH IN \"Gastrointestinal Exams - Colonoscopy\" section 'Findings from the first exam/study' * * * * *");
        verifyInputField(ras_survey_native_view.gastrointestinalExamsReasonTheParticipantHadTheirExamStudyTextarea, ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForTheFirstProcedureColumn2Option3, "* * * * * RAS SURVEY MISMATCH IN \"Gastrointestinal Exams - Colonoscopy\" section 'Reason the participant had their exam/study' * * * * *");
        verifyInputField(ras_survey_native_view.gastrointestinalExamsWhereDidTheParticipantHaveTheirFirstExamStudyTextarea, ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForTheFirstProcedureColumn4Option3, "* * * * * RAS SURVEY MISMATCH IN \"Gastrointestinal Exams - Colonoscopy\" section 'Where did the participant have their first exam/study?' * * * * *");
        verifyInputField(ras_survey_native_view.gastrointestinalExamsDateOfMostRecentExamInputField, ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn1Option3, "* * * * * RAS SURVEY MISMATCH IN \"Gastrointestinal Exams - Colonoscopy\" section 'Date of most recent exam' * * * * *");
        verifyInputField(ras_survey_native_view.gastrointestinalExamsFindingsOfTheMostRecentExamTextarea, ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn3Option3, "* * * * * RAS SURVEY MISMATCH IN \"Gastrointestinal Exams - Colonoscopy\" section 'Findings of the most recent exam' * * * * *");
        verifyInputField(ras_survey_native_view.gastrointestinalExamsReasonForMostRecentExamTextarea, ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn2Option3, "* * * * * RAS SURVEY MISMATCH IN \"Gastrointestinal Exams - Colonoscopy\" section 'Reason for most recent exam' * * * * *");
        verifyInputField(ras_survey_native_view.gastrointestinalExamsWhereDidTheParticipantHaveTheirMostRecentStudyTextarea, ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn4Option3, "* * * * * RAS SURVEY MISMATCH IN \"Gastrointestinal Exams - Colonoscopy\" section 'Where did the participant have their most recent study?' * * * * *");
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(locateByXpath("//button[@title='Back']"));
        CommonUtils.sleep(800);
        openRelatedListRecord("Other GI test (please specify)");
        verifyInputField(ras_survey_native_view.gastrointestinalExamsExamStudyTextarea, ras_Survey_TestDataManager.pleaseIndicateWhichOfTheFollowingProceduresOption9, "* * * * * RAS SURVEY MISMATCH IN \"Gastrointestinal Exams - Other GI test (please specify)\" section 'Exam/Study' * * * * *");
        verifyInputField(ras_survey_native_view.gastrointestinalExamsPleaseSpecifyInputField, ras_Survey_TestDataManager.pleaseIndicateWhichOfTheFollowingProceduresOption90ther, "* * * * * RAS SURVEY MISMATCH IN \"Gastrointestinal Exams - Other GI test (please specify)\" section 'Please specify' * * * * *");
        verifyInputField(ras_survey_native_view.gastrointestinalExamsDateOfFirstExamInputField, ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForTheFirstProcedureColumn1Option9, "* * * * * RAS SURVEY MISMATCH IN \"Gastrointestinal Exams - Other GI test (please specify)\" section 'Date of first exam' * * * * *");
        verifyInputField(ras_survey_native_view.gastrointestinalExamsFindingsFromTheFirstExamInputField, ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForTheFirstProcedureColumn3Option9, "* * * * * RAS SURVEY MISMATCH IN \"Gastrointestinal Exams - Other GI test (please specify)\" section 'Findings from the first exam/study' * * * * *");
        verifyInputField(ras_survey_native_view.gastrointestinalExamsReasonTheParticipantHadTheirExamStudyTextarea, ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForTheFirstProcedureColumn2Option9, "* * * * * RAS SURVEY MISMATCH IN \"Gastrointestinal Exams - Other GI test (please specify)\" section 'Reason the participant had their exam/study' * * * * *");
        verifyInputField(ras_survey_native_view.gastrointestinalExamsWhereDidTheParticipantHaveTheirFirstExamStudyTextarea, ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForTheFirstProcedureColumn4Option9, "* * * * * RAS SURVEY MISMATCH IN \"Gastrointestinal Exams - Other GI test (please specify)\" section 'Where did the participant have their first exam/study?' * * * * *");
        verifyInputField(ras_survey_native_view.gastrointestinalExamsDateOfMostRecentExamInputField, ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn1Option9, "* * * * * RAS SURVEY MISMATCH IN \"Gastrointestinal Exams - Other GI test (please specify)\" section 'Date of most recent exam' * * * * *");
        verifyInputField(ras_survey_native_view.gastrointestinalExamsFindingsOfTheMostRecentExamTextarea, ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn3Option9, "* * * * * RAS SURVEY MISMATCH IN \"Gastrointestinal Exams - Other GI test (please specify)\" section 'Findings of the most recent exam' * * * * *");
        verifyInputField(ras_survey_native_view.gastrointestinalExamsReasonForMostRecentExamTextarea, ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn2Option9, "* * * * * RAS SURVEY MISMATCH IN \"Gastrointestinal Exams - Other GI test (please specify)\" section 'Reason for most recent exam' * * * * *");
        verifyInputField(ras_survey_native_view.gastrointestinalExamsWhereDidTheParticipantHaveTheirMostRecentStudyTextarea, ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn3Option9, "* * * * * RAS SURVEY MISMATCH IN \"Gastrointestinal Exams - Other GI test (please specify)\" section 'Where did the participant have their most recent study?' * * * * *");
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(locateByXpath("//button[@title='Back']"));
        CommonUtils.sleep(800);
        openRelatedListRecord("Modified barium swallow study");
        verifyInputField(ras_survey_native_view.gastrointestinalExamsExamStudyTextarea, ras_Survey_TestDataManager.pleaseIndicateWhichOfTheFollowingProceduresOption7, "* * * * * RAS SURVEY MISMATCH IN \"Gastrointestinal Exams - Modified barium swallow study\" section 'Exam/Study' * * * * *");
        verifyInputField(ras_survey_native_view.gastrointestinalExamsDateOfFirstExamInputField, ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForTheFirstProcedureColumn1Option7, "* * * * * RAS SURVEY MISMATCH IN \"Gastrointestinal Exams - Modified barium swallow study\" section 'Date of first exam' * * * * *");
        verifyInputField(ras_survey_native_view.gastrointestinalExamsFindingsFromTheFirstExamInputField, ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForTheFirstProcedureColumn3Option7, "* * * * * RAS SURVEY MISMATCH IN \"Gastrointestinal Exams - Modified barium swallow study\" section 'Findings from the first exam/study' * * * * *");
        verifyInputField(ras_survey_native_view.gastrointestinalExamsReasonTheParticipantHadTheirExamStudyTextarea, ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForTheFirstProcedureColumn2Option7, "* * * * * RAS SURVEY MISMATCH IN \"Gastrointestinal Exams - Modified barium swallow study\" section 'Reason the participant had their exam/study' * * * * *");
        verifyInputField(ras_survey_native_view.gastrointestinalExamsWhereDidTheParticipantHaveTheirFirstExamStudyTextarea, ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForTheFirstProcedureColumn4Option7, "* * * * * RAS SURVEY MISMATCH IN \"Gastrointestinal Exams - Modified barium swallow study\" section 'Where did the participant have their first exam/study?' * * * * *");
        verifyInputField(ras_survey_native_view.gastrointestinalExamsDateOfMostRecentExamInputField, ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn1Option7, "* * * * * RAS SURVEY MISMATCH IN \"Gastrointestinal Exams - Modified barium swallow study\" section 'Date of most recent exam' * * * * *");
        verifyInputField(ras_survey_native_view.gastrointestinalExamsFindingsOfTheMostRecentExamTextarea, ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn3Option7, "* * * * * RAS SURVEY MISMATCH IN \"Gastrointestinal Exams - Modified barium swallow study\" section 'Findings of the most recent exam' * * * * *");
        verifyInputField(ras_survey_native_view.gastrointestinalExamsReasonForMostRecentExamTextarea, ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn2Option7, "* * * * * RAS SURVEY MISMATCH IN \"Gastrointestinal Exams - Modified barium swallow study\" section 'Reason for most recent exam' * * * * *");
        verifyInputField(ras_survey_native_view.gastrointestinalExamsWhereDidTheParticipantHaveTheirMostRecentStudyTextarea, ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn4Option7, "* * * * * RAS SURVEY MISMATCH IN \"Gastrointestinal Exams - Modified barium swallow study\" section 'Where did the participant have their most recent study?' * * * * *");
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(locateByXpath("//button[@title='Back']"));
        CommonUtils.sleep(800);
        openRelatedListRecord("pH probe or impedance study");
        verifyInputField(ras_survey_native_view.gastrointestinalExamsExamStudyTextarea, ras_Survey_TestDataManager.pleaseIndicateWhichOfTheFollowingProceduresOption5, "* * * * * RAS SURVEY MISMATCH IN \"Gastrointestinal Exams - pH probe or impedance study\" section 'Exam/Study' * * * * *");
        verifyInputField(ras_survey_native_view.gastrointestinalExamsDateOfFirstExamInputField, ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForTheFirstProcedureColumn1Option5, "* * * * * RAS SURVEY MISMATCH IN \"Gastrointestinal Exams - pH probe or impedance study\" section 'Date of first exam' * * * * *");
        verifyInputField(ras_survey_native_view.gastrointestinalExamsFindingsFromTheFirstExamInputField, ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForTheFirstProcedureColumn3Option5, "* * * * * RAS SURVEY MISMATCH IN \"Gastrointestinal Exams - pH probe or impedance study\" section 'Findings from the first exam/study' * * * * *");
        verifyInputField(ras_survey_native_view.gastrointestinalExamsReasonTheParticipantHadTheirExamStudyTextarea, ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForTheFirstProcedureColumn2Option5, "* * * * * RAS SURVEY MISMATCH IN \"Gastrointestinal Exams - pH probe or impedance study\" section 'Reason the participant had their exam/study' * * * * *");
        verifyInputField(ras_survey_native_view.gastrointestinalExamsWhereDidTheParticipantHaveTheirFirstExamStudyTextarea, ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForTheFirstProcedureColumn4Option5, "* * * * * RAS SURVEY MISMATCH IN \"Gastrointestinal Exams - pH probe or impedance study\" section 'Where did the participant have their first exam/study?' * * * * *");
        verifyInputField(ras_survey_native_view.gastrointestinalExamsDateOfMostRecentExamInputField, ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn1Option5, "* * * * * RAS SURVEY MISMATCH IN \"Gastrointestinal Exams - pH probe or impedance study\" section 'Date of most recent exam' * * * * *");
        verifyInputField(ras_survey_native_view.gastrointestinalExamsFindingsOfTheMostRecentExamTextarea, ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn3Option5, "* * * * * RAS SURVEY MISMATCH IN \"Gastrointestinal Exams - pH probe or impedance study\" section 'Findings of the most recent exam' * * * * *");
        verifyInputField(ras_survey_native_view.gastrointestinalExamsReasonForMostRecentExamTextarea, ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn2Option3, "* * * * * RAS SURVEY MISMATCH IN \"Gastrointestinal Exams - pH probe or impedance study\" section 'Reason for most recent exam' * * * * *");
        verifyInputField(ras_survey_native_view.gastrointestinalExamsWhereDidTheParticipantHaveTheirMostRecentStudyTextarea, ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn4Option5, "* * * * * RAS SURVEY MISMATCH IN \"Gastrointestinal Exams - pH probe or impedance study\" section 'Where did the participant have their most recent study?' * * * * *");
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(locateByXpath("//button[@title='Back']"));
        CommonUtils.sleep(800);
        openRelatedListRecord("Upper GI swallow study");
        verifyInputField(ras_survey_native_view.gastrointestinalExamsExamStudyTextarea, ras_Survey_TestDataManager.pleaseIndicateWhichOfTheFollowingProceduresOption6, "* * * * * RAS SURVEY MISMATCH IN \"Gastrointestinal Exams - Upper GI swallow study\" section 'Exam/Study' * * * * *");
        verifyInputField(ras_survey_native_view.gastrointestinalExamsDateOfFirstExamInputField, ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForTheFirstProcedureColumn1Option6, "* * * * * RAS SURVEY MISMATCH IN \"Gastrointestinal Exams - Upper GI swallow study\" section 'Date of first exam' * * * * *");
        verifyInputField(ras_survey_native_view.gastrointestinalExamsFindingsFromTheFirstExamInputField, ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForTheFirstProcedureColumn3Option6, "* * * * * RAS SURVEY MISMATCH IN \"Gastrointestinal Exams - Upper GI swallow study\" section 'Findings from the first exam/study' * * * * *");
        verifyInputField(ras_survey_native_view.gastrointestinalExamsReasonTheParticipantHadTheirExamStudyTextarea, ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForTheFirstProcedureColumn2Option6, "* * * * * RAS SURVEY MISMATCH IN \"Gastrointestinal Exams - Upper GI swallow study\" section 'Reason the participant had their exam/study' * * * * *");
        verifyInputField(ras_survey_native_view.gastrointestinalExamsWhereDidTheParticipantHaveTheirFirstExamStudyTextarea, ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForTheFirstProcedureColumn4Option6, "* * * * * RAS SURVEY MISMATCH IN \"Gastrointestinal Exams - Upper GI swallow study\" section 'Where did the participant have their first exam/study?' * * * * *");
        verifyInputField(ras_survey_native_view.gastrointestinalExamsDateOfMostRecentExamInputField, ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn1Option6, "* * * * * RAS SURVEY MISMATCH IN \"Gastrointestinal Exams - Upper GI swallow study\" section 'Date of most recent exam' * * * * *");
        verifyInputField(ras_survey_native_view.gastrointestinalExamsFindingsOfTheMostRecentExamTextarea, ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn3Option6, "* * * * * RAS SURVEY MISMATCH IN \"Gastrointestinal Exams - Upper GI swallow study\" section 'Findings of the most recent exam' * * * * *");
        verifyInputField(ras_survey_native_view.gastrointestinalExamsReasonForMostRecentExamTextarea, ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn2Option6, "* * * * * RAS SURVEY MISMATCH IN \"Gastrointestinal Exams - Upper GI swallow study\" section 'Reason for most recent exam' * * * * *");
        verifyInputField(ras_survey_native_view.gastrointestinalExamsWhereDidTheParticipantHaveTheirMostRecentStudyTextarea, ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn4Option6, "* * * * * RAS SURVEY MISMATCH IN \"Gastrointestinal Exams - Upper GI swallow study\" section 'Where did the participant have their most recent study?' * * * * *");
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(locateByXpath("//button[@title='Back']"));
        CommonUtils.sleep(800);
        openRelatedListRecord("Anorectal manometry");
        verifyInputField(ras_survey_native_view.gastrointestinalExamsExamStudyTextarea, ras_Survey_TestDataManager.pleaseIndicateWhichOfTheFollowingProceduresOption4, "* * * * * RAS SURVEY MISMATCH IN \"Gastrointestinal Exams - Anorectal manometry\" section 'Exam/Study' * * * * *");
        verifyInputField(ras_survey_native_view.gastrointestinalExamsDateOfFirstExamInputField, ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForTheFirstProcedureColumn1Option4, "* * * * * RAS SURVEY MISMATCH IN \"Gastrointestinal Exams - Anorectal manometry\" section 'Date of first exam' * * * * *");
        verifyInputField(ras_survey_native_view.gastrointestinalExamsFindingsFromTheFirstExamInputField, ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForTheFirstProcedureColumn3Option4, "* * * * * RAS SURVEY MISMATCH IN \"Gastrointestinal Exams - Anorectal manometry\" section 'Findings from the first exam/study' * * * * *");
        verifyInputField(ras_survey_native_view.gastrointestinalExamsReasonTheParticipantHadTheirExamStudyTextarea, ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForTheFirstProcedureColumn2Option4, "* * * * * RAS SURVEY MISMATCH IN \"Gastrointestinal Exams - Anorectal manometry\" section 'Reason the participant had their exam/study' * * * * *");
        verifyInputField(ras_survey_native_view.gastrointestinalExamsWhereDidTheParticipantHaveTheirFirstExamStudyTextarea, ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForTheFirstProcedureColumn4Option4, "* * * * * RAS SURVEY MISMATCH IN \"Gastrointestinal Exams - Anorectal manometry\" section 'Where did the participant have their first exam/study?' * * * * *");
        verifyInputField(ras_survey_native_view.gastrointestinalExamsDateOfMostRecentExamInputField, ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn1Option4, "* * * * * RAS SURVEY MISMATCH IN \"Gastrointestinal Exams - Anorectal manometry\" section 'Date of most recent exam' * * * * *");
        verifyInputField(ras_survey_native_view.gastrointestinalExamsFindingsOfTheMostRecentExamTextarea, ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn3Option4, "* * * * * RAS SURVEY MISMATCH IN \"Gastrointestinal Exams - Anorectal manometry\" section 'Findings of the most recent exam' * * * * *");
        verifyInputField(ras_survey_native_view.gastrointestinalExamsReasonForMostRecentExamTextarea, ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn2Option2, "* * * * * RAS SURVEY MISMATCH IN \"Gastrointestinal Exams - Anorectal manometry\" section 'Reason for most recent exam' * * * * *");
        verifyInputField(ras_survey_native_view.gastrointestinalExamsWhereDidTheParticipantHaveTheirMostRecentStudyTextarea, ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn4Option4, "* * * * * RAS SURVEY MISMATCH IN \"Gastrointestinal Exams - Anorectal manometry\" section 'Where did the participant have their most recent study?' * * * * *");
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(locateByXpath("//button[@title='Back']"));
        CommonUtils.sleep(800);
        openRelatedListRecord("Upper endoscopy");
        verifyInputField(ras_survey_native_view.gastrointestinalExamsExamStudyTextarea, ras_Survey_TestDataManager.pleaseIndicateWhichOfTheFollowingProceduresOption2, "* * * * * RAS SURVEY MISMATCH IN \"Gastrointestinal Exams - Anorectal manometry\" section 'Exam/Study' * * * * *");
        verifyInputField(ras_survey_native_view.gastrointestinalExamsDateOfFirstExamInputField, ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForTheFirstProcedureColumn1Option2, "* * * * * RAS SURVEY MISMATCH IN \"Gastrointestinal Exams - Anorectal manometry\" section 'Date of first exam' * * * * *");
        verifyInputField(ras_survey_native_view.gastrointestinalExamsFindingsFromTheFirstExamInputField, ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForTheFirstProcedureColumn3Option2, "* * * * * RAS SURVEY MISMATCH IN \"Gastrointestinal Exams - Anorectal manometry\" section 'Findings from the first exam/study' * * * * *");
        verifyInputField(ras_survey_native_view.gastrointestinalExamsReasonTheParticipantHadTheirExamStudyTextarea, ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForTheFirstProcedureColumn2Option2, "* * * * * RAS SURVEY MISMATCH IN \"Gastrointestinal Exams - Anorectal manometry\" section 'Reason the participant had their exam/study' * * * * *");
        verifyInputField(ras_survey_native_view.gastrointestinalExamsWhereDidTheParticipantHaveTheirFirstExamStudyTextarea, ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForTheFirstProcedureColumn4Option2, "* * * * * RAS SURVEY MISMATCH IN \"Gastrointestinal Exams - Anorectal manometry\" section 'Where did the participant have their first exam/study?' * * * * *");
        verifyInputField(ras_survey_native_view.gastrointestinalExamsDateOfMostRecentExamInputField, ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn1Option2, "* * * * * RAS SURVEY MISMATCH IN \"Gastrointestinal Exams - Anorectal manometry\" section 'Date of most recent exam' * * * * *");
        verifyInputField(ras_survey_native_view.gastrointestinalExamsFindingsOfTheMostRecentExamTextarea, ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn3Option2, "* * * * * RAS SURVEY MISMATCH IN \"Gastrointestinal Exams - Anorectal manometry\" section 'Findings of the most recent exam' * * * * *");
        verifyInputField(ras_survey_native_view.gastrointestinalExamsReasonForMostRecentExamTextarea, ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn2Option2, "* * * * * RAS SURVEY MISMATCH IN \"Gastrointestinal Exams - Anorectal manometry\" section 'Reason for most recent exam' * * * * *");
        verifyInputField(ras_survey_native_view.gastrointestinalExamsWhereDidTheParticipantHaveTheirMostRecentStudyTextarea, ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn4Option2, "* * * * * RAS SURVEY MISMATCH IN \"Gastrointestinal Exams - Anorectal manometry\" section 'Where did the participant have their most recent study?' * * * * *");
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(locateByXpath("//button[@title='Back']"));
        CommonUtils.sleep(800);
        openRelatedListRecord("Gastric emptying study");
        verifyInputField(ras_survey_native_view.gastrointestinalExamsExamStudyTextarea, ras_Survey_TestDataManager.pleaseIndicateWhichOfTheFollowingProceduresOption8, "* * * * * RAS SURVEY MISMATCH IN \"Gastrointestinal Exams - Gastric emptying study\" section 'Exam/Study' * * * * *");
        verifyInputField(ras_survey_native_view.gastrointestinalExamsDateOfFirstExamInputField, ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForTheFirstProcedureColumn1Option8, "* * * * * RAS SURVEY MISMATCH IN \"Gastrointestinal Exams - Gastric emptying study\" section 'Date of first exam' * * * * *");
        verifyInputField(ras_survey_native_view.gastrointestinalExamsFindingsFromTheFirstExamInputField, ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForTheFirstProcedureColumn3Option8, "* * * * * RAS SURVEY MISMATCH IN \"Gastrointestinal Exams - Gastric emptying study\" section 'Findings from the first exam/study' * * * * *");
        verifyInputField(ras_survey_native_view.gastrointestinalExamsReasonTheParticipantHadTheirExamStudyTextarea, ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForTheFirstProcedureColumn2Option8, "* * * * * RAS SURVEY MISMATCH IN \"Gastrointestinal Exams - Gastric emptying study\"section 'Reason the participant had their exam/study' * * * * *");
        verifyInputField(ras_survey_native_view.gastrointestinalExamsWhereDidTheParticipantHaveTheirFirstExamStudyTextarea, ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForTheFirstProcedureColumn4Option8, "* * * * * RAS SURVEY MISMATCH IN \"Gastrointestinal Exams - Gastric emptying study\" section 'Where did the participant have their first exam/study?' * * * * *");
        verifyInputField(ras_survey_native_view.gastrointestinalExamsDateOfMostRecentExamInputField, ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn1Option8, "* * * * * RAS SURVEY MISMATCH IN \"Gastrointestinal Exams - Gastric emptying study\" section 'Date of most recent exam' * * * * *");
        verifyInputField(ras_survey_native_view.gastrointestinalExamsFindingsOfTheMostRecentExamTextarea, ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn3Option8, "* * * * * RAS SURVEY MISMATCH IN \"Gastrointestinal Exams - Gastric emptying study\" section 'Findings of the most recent exam' * * * * *");
        verifyInputField(ras_survey_native_view.gastrointestinalExamsReasonForMostRecentExamTextarea, ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn2Option8, "* * * * * RAS SURVEY MISMATCH IN \"Gastrointestinal Exams - Gastric emptying study\" section 'Reason for most recent exam' * * * * *");
        verifyInputField(ras_survey_native_view.gastrointestinalExamsWhereDidTheParticipantHaveTheirMostRecentStudyTextarea, ras_Survey_TestDataManager.pleaseProvideTheInformationBelowForMostRecentProcedureColumn4Option8, "* * * * * RAS SURVEY MISMATCH IN \"Gastrointestinal Exams - Gastric emptying study\" section 'Where did the participant have their most recent study?' * * * * *");
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(locateByXpath("//button[@title='Back']"));
        CommonUtils.sleep(800);
    }

    /**
     * This method verifies the RAS Survey data for scenario two in Native View within the "Gastrointestinal Exams" section.
     */
    public static void verify_ras_survey_data_scenarioTwo_gi_symptoms_section() {
        clickTab("GI Symptoms");
        openRelatedListRecord("Lactose intolerance (gas, bloating, diarrhea with dairy products)");
        verifyInputField(ras_survey_native_view.giSymptomsSymptomInputField, ras_Survey_TestDataManager.whichOfTheFollowingSymptomsRelatedToTheGIOption13, "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Lactose intolerance (gas, bloating, diarrhea with dairy products)\" section 'Symptom' * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.giSymptomsDoesTheParticipantTakeALactoseSupplementDropdown, "Yes", "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Lactose intolerance (gas, bloating, diarrhea with dairy products)\" section 'Does the participant take a lactose supplement' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.giSymptomsStatusDropdown, "Previous (resolved symptom)", "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Lactose intolerance (gas, bloating, diarrhea with dairy products)\" section 'Status' DROPDOWN * * * * *");
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(locateByXpath("//button[@title='Back']"));
        CommonUtils.sleep(800);
        openRelatedListRecord("Gas bloating");
        verifyInputField(ras_survey_native_view.giSymptomsSymptomInputField, ras_Survey_TestDataManager.whichOfTheFollowingSymptomsRelatedToTheGIOption15, "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Gas bloating\" section 'Symptom' * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.giSymptomsStatusDropdown, "Previous (resolved symptom)", "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Gas bloating\" section 'Status' DROPDOWN * * * * *");
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(locateByXpath("//button[@title='Back']"));
        CommonUtils.sleep(800);
        openRelatedListRecord("Perianal lesions or sores");
        verifyInputField(ras_survey_native_view.giSymptomsSymptomInputField, ras_Survey_TestDataManager.whichOfTheFollowingSymptomsRelatedToTheGIOption19, "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Perianal lesions or sores\" section 'Symptom' * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.giSymptomsStatusDropdown, "Previous (resolved symptom)", "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Perianal lesions or sores\" section 'Status' DROPDOWN * * * * *");
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(locateByXpath("//button[@title='Back']"));
        CommonUtils.sleep(800);
        openRelatedListRecord("Constipation");
        verifyInputField(ras_survey_native_view.giSymptomsSymptomInputField, ras_Survey_TestDataManager.whichOfTheFollowingSymptomsRelatedToTheGIOption17, "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Constipation\" section 'Symptom' * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.giSymptomsTwoOrFewerBowelMovementsPerWeekDropdown, "Yes", "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Constipation\" section '2 or fewer bowel movements per week' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.giSymptomsOneOrMoreStoolAccidentOrStoolIncontinencePerWeekDropdown, "Yes", "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Constipation\" section '1 or more stool accidents or stool incontinence per week' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.giSymptomsPosturingOrExcessiveAttemptsToAvoidHavingABowelMovementDropdown, "Yes", "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Constipation\" section 'Posturing or excessive attempts to avoid having a bowel movement' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.giSymptomsHistoryOfStoolImpactionDropdown, "Yes", "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Constipation\" section 'History of stool impaction' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.giSymptomsStatusDropdown, "Previous (resolved symptom)", "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Constipation\" section 'Status' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.giSymptomsLargeBowelMovementsThatClogTheToiletDropdown, "Yes", "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Constipation\" section 'Large bowel movements that clog the toilet' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.giSymptomsBloodOnToiletPaperOrInTheStoolDropdown, "Yes", "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Constipation\" section 'Blood on toilet paper or in the stool' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.giSymptomsBowelMovementsInPlacesInappropriateOrNotSociallyAcceptableDropdown, "Yes", "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Constipation\" section 'Having bowel movements in places inappropriate or not socially acceptable' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.giSymptomsPainfulOrHardBowelMovementsDropdown, "Yes", "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Constipation\" section 'Painful or Hard bowel movements' DROPDOWN * * * * *");
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(locateByXpath("//button[@title='Back']"));
        CommonUtils.sleep(800);
        openRelatedListRecord("Decreased appetite");
        verifyInputField(ras_survey_native_view.giSymptomsSymptomInputField, ras_Survey_TestDataManager.whichOfTheFollowingSymptomsRelatedToTheGIOption21, "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Decreased appetite\" section 'Symptom' * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.giSymptomsStatusDropdown, "Previous (resolved symptom)", "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Decreased appetite\" section 'Status' DROPDOWN * * * * *");
        String whatSupplementalNutritionHaveHaveBeenTakenExpectedText = "Drinks (ex. Pediasure), Tube feeding (ex NG or g-tube), TPN (IV nutrition)";
        softAssert.assertEquals(ras_survey_native_view.giSymptomsWhatSupplementalNutritionHaveBeenTakenText.getText(), whatSupplementalNutritionHaveHaveBeenTakenExpectedText, "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Decreased appetite\" section 'What supplemental nutrition have been taken?' TEXT * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.giSymptomsHasDecreasedAppetiteCausedWeightLossOrPoorGrowthDropdown, "Yes", "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Decreased appetite\" section 'Has decreased appetite caused weight loss or poor growth?' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.giSymptomsHaveNutritionalSupplementsFeedsEverBeenTakenOrReceivedDropdown, "Yes", "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Decreased appetite\" section 'Have nutritional supplements/feeds ever been taken or received?' DROPDOWN * * * * *");
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(locateByXpath("//button[@title='Back']"));
        CommonUtils.sleep(800);
        openRelatedListRecord("Vomiting");
        verifyInputField(ras_survey_native_view.giSymptomsSymptomInputField, ras_Survey_TestDataManager.whichOfTheFollowingSymptomsRelatedToTheGIOption8, "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Vomitting\" section 'Symptom' * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.giSymptomsStatusDropdown, "Previous (resolved symptom)", "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Vomiting\" section 'Status' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.giSymptomsEverHadAtLeast2MonthsWith1OrMoreEpisodesOfVomitingPerWeekDropdown, "Yes", "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Vomiting\" section 'Ever had at least 2 months with 1 or more episodes of vomiting per week?' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.giSymptomsIsVomitingEverSelfInducedDropdown, "Yes", "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Vomiting\" section 'Is vomiting ever self-induced?' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.giSymptomsIsVomitingRelatedToMedicationSurgeryOrOtherHealthIssueDropdown, "Yes", "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Vomiting\" section 'Is vomiting related to medication, surgery or other health issue?' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.giSymptomsHaveAnyMedicationsEverBeenTakenForVomitingDropdown, "Yes", "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Vomiting\" section 'Have any medications ever been taken for vomiting' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.giSymptomsDoEpisodesOfVomitingSeemSimilarToEachOtherWhenTheyOccurDropdown, "Yes", "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Vomiting\" section 'Do episodes of vomiting seem similar to each other when they occur?' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.giSymptomsAreThereWeeksToMonthsWithoutSymptomsOfNauseaVomitingBetweenEpisodesDropdown, "Yes", "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Vomiting\" section 'Are there weeks to months without symptoms of nausea/vomiting between episodes?' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.giSymptomsEverVomitedBloodDropdown, "Yes", "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Vomiting\" section 'Ever vomited blood?' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.giSymptomsEverHad2OrMoreEpisodesOfIntenseVomitingWithin6MonthPeriodDropdown, "Yes", "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Vomiting\" section 'Ever had 2 or more episodes of intense vomiting within 6 month period' DROPDOWN * * * * *");
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(locateByXpath("//button[@title='Back']"));
        CommonUtils.sleep(800);
        openRelatedListRecord("Choking/gagging");
        verifyInputField(ras_survey_native_view.giSymptomsSymptomInputField, ras_Survey_TestDataManager.whichOfTheFollowingSymptomsRelatedToTheGIOption1, "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Choking/gagging\" section 'Symptom' * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.giSymptomsStatusDropdown, "Previous (resolved symptom)", "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Choking/gagging\" section 'Status' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.giSymptomsDidChokingGaggingLeadToPneumoniaDropdown, "Yes", "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Choking/gagging\" section 'Did choking/gagging lead to pneumonia' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.giSymptomsDidChokingGaggingLeadToXRaySwallowStudyDropdown, "Yes", "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Choking/gagging\" section 'Did choking/gagging ever lead to a x-ray swallow study' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.giSymptomsDidChokingGaggingLeadToAspirationOrSwallowStudyDropdown, "Yes", "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Choking/gagging\" section 'Did choking/gagging ever lead to aspiration on swallow study' DROPDOWN * * * * *");
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(locateByXpath("//button[@title='Back']"));
        CommonUtils.sleep(800);
        openRelatedListRecord("Painful swallowing");
        verifyInputField(ras_survey_native_view.giSymptomsSymptomInputField, ras_Survey_TestDataManager.whichOfTheFollowingSymptomsRelatedToTheGIOption3, "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Painful swallowing\" section 'Symptom' * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.giSymptomsStatusDropdown, "Previous (resolved symptom)", "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Painful swallowing\" section 'Status' DROPDOWN * * * * *");
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(locateByXpath("//button[@title='Back']"));
        CommonUtils.sleep(800);
        openRelatedListRecord("Jaundice (yellow skin). This does not include jaundice that occurs in the first week of life");
        verifyInputField(ras_survey_native_view.giSymptomsSymptomInputField, ras_Survey_TestDataManager.whichOfTheFollowingSymptomsRelatedToTheGIOption11, "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Jaundice (yellow skin)\" section 'Symptom' * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.giSymptomsStatusDropdown, "Previous (resolved symptom)", "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Jaundice (yellow skin)\" section 'Status' DROPDOWN * * * * *");
        verifyInputField(ras_survey_native_view.giSymptomsWhatAgeDidJaundiceOccurInputField, ras_Survey_TestDataManager.pleaseAnswerTheBelowQuestionsRegardingJaundiceTextBox1, "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Jaundice (yellow skin)\" section 'What age did jaundice occur' * * * * *");
        verifyInputField(ras_survey_native_view.giSymptomsHowLongDidJaundiceLastDropdown, ras_Survey_TestDataManager.pleaseAnswerTheBelowQuestionsRegardingJaundiceTextBox2, "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Jaundice (yellow skin)\" section 'How long did jaundice last?' DROPDOWN * * * * *");
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(locateByXpath("//button[@title='Back']"));
        CommonUtils.sleep(800);
        openRelatedListRecord("Abdominal pain");
        verifyInputField(ras_survey_native_view.giSymptomsSymptomInputField, ras_Survey_TestDataManager.whichOfTheFollowingSymptomsRelatedToTheGIOption7, "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Abdominal pain\" section 'Symptom' * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.giSymptomsStatusDropdown, "Previous (resolved symptom)", "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Abdominal pain\" section 'Status' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.giSymptomsWavesOfSevereDistressingAcutePainAtTheBellyButtonOrEntireAbdomenDropdown, "Yes", "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Abdominal pain\" section 'Waves of severe, distressing, acute pain at the belly-button or entire abdomen' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.giSymptomsAreEpisodesOfBellyPainSeparatedByWeeksOrMonthsDropdown, "Yes", "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Abdominal pain\" section 'Are episodes of belly pain separated by weeks or months' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.giSymptomsDoesAbdominalPainPreventTheCompletionOfUsualActivitiesDropdown, "Yes", "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Abdominal pain\" section 'Does abdominal pain prevent the completion of usual activities' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.giSymptomsIsThePainSimilarWithEachEpisodeDropdown, "Yes", "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Abdominal pain\" section 'Is the pain similar with each episode' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.giSymptomsHaveTheseEpisodesBeenHappeningAtLeastSixMonthsDropdown, "Yes", "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Abdominal pain\" section 'Have these episodes been happening at least six months' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.giSymptomsAbdominalPainsOccurAtLeast4DaysMonthForGreaterThan2MonthsDropdown, "Yes", "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Abdominal pain\" section 'Abdominal pains occur at least 4 days/month for > 2 months?' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.giSymptomsIsPainAssociatedWithHavingBowelMovementsDropdown, "Yes", "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Abdominal pain\" section 'Is pain associated with having bowel movements?' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.giSymptomsAnyChangesInBowelMovementFrequencyDropdown, "Yes", "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Abdominal pain\" section 'Any changes in bowel movement frequency?' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.giSymptomsAssociatedWithChangeInBowelMovementConsistencyDropdown, "Yes", "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Abdominal pain\" section 'Associated with change in bowel movement consistency?' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.giSymptomsDidPainResolveInRelationToResolutionOfConstipationDropdown, "Yes", "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Abdominal pain\" section 'Did pain resolve in relation to resolution of constipation' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.giSymptomsHowManyMedicationsHaveBeenTakenForAbdominalPainDropdown, "1", "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Abdominal pain\" section 'How many medications have been taken for abdominal pain' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.giSymptomsIsThePainNotRelatedToEatingMenstrualCyclesOrOtherIllnessDropdown, "Yes", "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Abdominal pain\" section 'Is the pain not related to eating, menstrual cycles or other illness?' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.giSymptomsHasAbdominalPainEverCausedAwakeningFromSleepAtNightDropdown, "Yes", "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Abdominal pain\" section 'Has abdominal pain ever caused awakening from sleep at night?' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.giSymptomsHasTheAbdominalPainCausedWeightLossDropdown, "Yes", "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Abdominal pain\" section 'Has the abdominal pain caused weight loss?' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.giSymptomsIsAbdominalPainAssociatedWithLossOfAppetiteDropdown, "Yes", "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Abdominal pain\" section 'Is abdominal pain associated with loss of appetite?' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.giSymptomsIsAbdominalPainAssociatedWithNauseaDropdown, "Yes", "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Abdominal pain\" section 'Is abdominal pain associated with nausea?' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.giSymptomsIsAbdominalPainAssociatedWithVomitingDropdown, "Yes", "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Abdominal pain\" section 'Is abdominal pain associated with vomiting?' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.giSymptomsIsAbdominalPainAssociatedWithHeadacheDropdown, "Yes", "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Abdominal pain\" section 'Is abdominal pain associated with headache?' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.giSymptomsIsAbdominalPainAssociatedWithIrritationToBrightLightDropdown, "Yes", "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Abdominal pain\" section 'Is abdominal pain associated with irritation to bright light?' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.giSymptomsIsAbdominalPainAssociatedWithLookingPaleDropdown, "Yes", "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Abdominal pain\" section 'Is abdominal pain associated with looking pale?' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.giSymptomsHaveAnyMedicationsEverBeenTakenForAbdominalPainDropdown, "Yes", "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Abdominal pain\" section 'Have any medications ever been taken for abdominal pain?' DROPDOWN * * * * *");
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(locateByXpath("//button[@title='Back']"));
        CommonUtils.sleep(800);
        openRelatedListRecord("Nausea");
        verifyInputField(ras_survey_native_view.giSymptomsSymptomInputField, ras_Survey_TestDataManager.whichOfTheFollowingSymptomsRelatedToTheGIOption6, "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Nausea\" section 'Symptom' * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.giSymptomsStatusDropdown, "Previous (resolved symptom)", "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Nausea\" section 'Status' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.giSymptomsHasBothersomeNauseaOccurredForAtLeast2WeeksNotRelatedToMealsDropdown, "Yes", "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Nausea\" section 'Has bothersome nausea occurred for at least 2 weeks not related to meals?' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.giSymptomsHasNauseaUnrelatedToVomitingOccurredForAtLeast2WeeksDropdown, "Yes", "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Nausea\" section 'Has nausea unrelated to vomiting occurred for at least 2 weeks' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.giSymptomsHaveAnyMedicationsBeenTakenForTheNauseaDropdown, "Yes", "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Nausea\" section 'Have any medications been taken for the nausea' DROPDOWN * * * * *");
        verifyInputField(ras_survey_native_view.giSymptomsAgeMedicationsTakenInputField, ras_Survey_TestDataManager.pleaseCompleteTheTableBelowRegardingHeartburnColumn1, "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Nausea\" section 'Age medications taken' input * * * * *");
        verifyInputField(ras_survey_native_view.giSymptomsNameOfMedicationsTakenInputField, ras_Survey_TestDataManager.pleaseCompleteTheTableBelowRegardingHeartburnColumn2, "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Nausea\" section 'Name of medications taken' input * * * * *");
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(locateByXpath("//button[@title='Back']"));
        CommonUtils.sleep(800);
        openRelatedListRecord("Difficulty swallowing");
        verifyInputField(ras_survey_native_view.giSymptomsSymptomInputField, ras_Survey_TestDataManager.whichOfTheFollowingSymptomsRelatedToTheGIOption2, "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Difficulty swallowing\" section 'Symptom' * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.giSymptomsStatusDropdown, "Previous (resolved symptom)", "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Difficulty swallowing\" section 'Status' DROPDOWN * * * * *");
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(locateByXpath("//button[@title='Back']"));
        CommonUtils.sleep(800);
        openRelatedListRecord("Encopresis (Frequent or daily leakage of stool)");
        verifyInputField(ras_survey_native_view.giSymptomsSymptomInputField, ras_Survey_TestDataManager.whichOfTheFollowingSymptomsRelatedToTheGIOption18, "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Encopresis\" section 'Symptom' * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.giSymptomsStatusDropdown, "Previous (resolved symptom)", "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Encopresis\" section 'Status' DROPDOWN * * * * *");
        verifyInputField(ras_survey_native_view.giSymptomsEncopresisMedicationAgeInputField, ras_Survey_TestDataManager.pleaseCompleteTheTableBelowRegardingEncopresisOption2, "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Encopresis\" section 'Age medications were used' * * * * *");
        verifyInputField(ras_survey_native_view.giSymptomsMedicationsUsedToTreatEncopresisTextarea, ras_Survey_TestDataManager.pleaseCompleteTheTableBelowRegardingEncopresisOption1, "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Encopresis\" section 'Medications used to treat encopresis' * * * * *");
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(locateByXpath("//button[@title='Back']"));
        CommonUtils.sleep(800);
        openRelatedListRecord("Aversion to specific foods or qualities/food textures");
        verifyInputField(ras_survey_native_view.giSymptomsSymptomInputField, ras_Survey_TestDataManager.whichOfTheFollowingSymptomsRelatedToTheGIOption14, "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Aversion to specific foods or qualities/food textures\" section 'Symptom' * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.giSymptomsStatusDropdown, "Previous (resolved symptom)", "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Aversion to specific foods or qualities/food textures\" section 'Status' DROPDOWN * * * * *");
        verifyInputField(ras_survey_native_view.giSymptomsFoodsParticipantIsAverseToTextarea, ras_Survey_TestDataManager.toWhatFoodsAreYouAverse, "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Aversion to specific foods or qualities/food textures\" section 'Foods participant is averse to' * * * * *");
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(locateByXpath("//button[@title='Back']"));
        CommonUtils.sleep(800);
        openRelatedListRecord("Gallbladder problems (eg, stones, infection)");
        verifyInputField(ras_survey_native_view.giSymptomsSymptomInputField, ras_Survey_TestDataManager.whichOfTheFollowingSymptomsRelatedToTheGIOption10, "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Gallbladder problems (eg, stones, infection)\" section 'Symptom' * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.giSymptomsStatusDropdown, "Previous (resolved symptom)", "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Gallbladder problems (eg, stones, infection)\" section 'Status' DROPDOWN * * * * *");
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(locateByXpath("//button[@title='Back']"));
        CommonUtils.sleep(800);
        openRelatedListRecord("Feel full quickly or have abdominal pain that interferes with appetite");
        verifyInputField(ras_survey_native_view.giSymptomsSymptomInputField, ras_Survey_TestDataManager.whichOfTheFollowingSymptomsRelatedToTheGIOption9, "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Feel full quickly or have abdominal pain that interferes with appetite\" section 'Symptom' * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.giSymptomsStatusDropdown, "Previous (resolved symptom)", "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Feel full quickly or have abdominal pain that interferes with appetite\" section 'Status' DROPDOWN * * * * *");
        List<String> expectedGISymptomsThatOccured4OrMoreDaysMonthForAtLeastTwoMonths = new ArrayList<>() {
            {
                add(ras_Survey_TestDataManager.haveAnyOfTheFollowingSymptomsOccurred4Option1);
                add(ras_Survey_TestDataManager.haveAnyOfTheFollowingSymptomsOccurred4Option2);
                add(ras_Survey_TestDataManager.haveAnyOfTheFollowingSymptomsOccurred4Option3);
            }
        };
        softAssert.assertTrue(sortAndCompareLists(textToList(ras_survey_native_view.giSymptomsTheSymptomsThatOccurred4OrMoreDaysMonthForAtLeastTwoMonthsText), expectedGISymptomsThatOccured4OrMoreDaysMonthForAtLeastTwoMonths), "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Feel full quickly or have abdominal pain that interferes with appetite\" section 'The symptoms that occurred 4 or more days/month for at least two months' TEXT * * * * *");
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(locateByXpath("//button[@title='Back']"));
        CommonUtils.sleep(800);
        openRelatedListRecord("Reflux/heartburn");
        verifyInputField(ras_survey_native_view.giSymptomsSymptomInputField, ras_Survey_TestDataManager.whichOfTheFollowingSymptomsRelatedToTheGIOption5, "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Reflux/heartburn\" section 'Symptom' * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.giSymptomsStatusDropdown, "Previous (resolved symptom)", "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Reflux/heartburn\" section 'Status' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.giSymptomsHasAPHProbeOrImpedanceStudyEverBeenCompletedDropdown, "Yes", "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Reflux/heartburn\" section 'Has a pH probe or impedance study ever been completed' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.giSymptomsHaveAnyRefluxHeartburnMedicationsEverBeenTakenDropdown, "Yes", "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Reflux/heartburn\" section 'Have any reflux/heartburn medications ever been taken' DROPDOWN * * * * *");
        verifyInputField(ras_survey_native_view.giSymptomsRefluxHeartburnMedicationNameInputField, ras_Survey_TestDataManager.pleaseCompleteTheTableBelowRegardingHeartburnColumn2, "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Reflux/heartburn\" section 'Medication name' * * * * *");
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(locateByXpath("//button[@title='Back']"));
        CommonUtils.sleep(800);
        openRelatedListRecord("Food allergies");
        verifyInputField(ras_survey_native_view.giSymptomsSymptomInputField, ras_Survey_TestDataManager.whichOfTheFollowingSymptomsRelatedToTheGIOption12, "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Food allergies\" section 'Symptom' * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.giSymptomsStatusDropdown, "Previous (resolved symptom)", "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Food allergies\" section 'Status' DROPDOWN * * * * *");
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(locateByXpath("//button[@title='Back']"));
        CommonUtils.sleep(800);
        openRelatedListRecord("Food getting stuck while swallowing");
        verifyInputField(ras_survey_native_view.giSymptomsSymptomInputField, ras_Survey_TestDataManager.whichOfTheFollowingSymptomsRelatedToTheGIOption4, "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Food getting stuck while swallowing\" section 'Symptom' * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.giSymptomsStatusDropdown, "Previous (resolved symptom)", "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Food getting stuck while swallowing\" section 'Status' DROPDOWN * * * * *");
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(locateByXpath("//button[@title='Back']"));
        CommonUtils.sleep(800);
        openRelatedListRecord("Unintentional or unplanned weight loss");
        verifyInputField(ras_survey_native_view.giSymptomsSymptomInputField, ras_Survey_TestDataManager.whichOfTheFollowingSymptomsRelatedToTheGIOption20, "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Unintentional or unplanned weight loss\" section 'Symptom' * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.giSymptomsStatusDropdown, "Previous (resolved symptom)", "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Unintentional or unplanned weight loss\" section 'Status' DROPDOWN * * * * *");
        verifyInputField(ras_survey_native_view.giSymptomsHowMuchWeightHasBeenLostInputField, ras_Survey_TestDataManager.pleaseCompleteTheTableBelowRegardingWeightLossOption1, "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Unintentional or unplanned weight loss\" section 'How much weight has been lost' * * * * *");
        verifyInputField(ras_survey_native_view.giSymptomsOverWhatTimePeriodDidWeightLossOccurInputField, ras_Survey_TestDataManager.pleaseCompleteTheTableBelowRegardingWeightLossOption2, "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Unintentional or unplanned weight loss\" section 'Over what time period did weight loss occur' * * * * *");
        verifyInputField(ras_survey_native_view.giSymptomsHasTheWeightBeenGainedBackInputField, ras_Survey_TestDataManager.pleaseCompleteTheTableBelowRegardingWeightLossOption3, "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Unintentional or unplanned weight loss\" section 'Has the weight been gained back' * * * * *");
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(locateByXpath("//button[@title='Back']"));
        CommonUtils.sleep(800);
        openRelatedListRecord("Diarrhea (loose liquid stool > 1 per day)");
        verifyInputField(ras_survey_native_view.giSymptomsSymptomInputField, ras_Survey_TestDataManager.whichOfTheFollowingSymptomsRelatedToTheGIOption16, "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Diarrhea (loose liquid stool > 1 per day)\" section 'Symptom' * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.giSymptomsStatusDropdown, "Previous (resolved symptom)", "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Diarrhea (loose liquid stool > 1 per day)\" section 'Status' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.giSymptomsIsThereAnUrgencyDropdown, "Yes", "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Diarrhea (loose liquid stool > 1 per day)\" section 'Is there an urgency?' DROPDOWN * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.giSymptomsDoesDiarrheaOccurWithCrampyLowerBellyPainDropdown, "Yes", "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Diarrhea (loose liquid stool > 1 per day)\" section 'Does diarrhea occur with crampy lower belly pain?' DROPDOWN * * * * *");
        verifyInputField(ras_survey_native_view.giSymptomsAtWhatAgeWereMedicationsUsedToTreatDiarrheaInputField, ras_Survey_TestDataManager.pleaseCompleteTheTableBelowRegardingDiarrheaOption3, "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Diarrhea (loose liquid stool > 1 per day)\" section 'At what age were medications used to treat diarrhea?' * * * * *");
        verifyInputField(ras_survey_native_view.giSymptomsWhatMedicationsHaveBeenUsedToTreatDiarrheaTextarea, ras_Survey_TestDataManager.pleaseCompleteTheTableBelowRegardingDiarrheaOption2, "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Diarrhea (loose liquid stool > 1 per day)\" section 'At what age were medications used to treat diarrhea?' * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.giSymptomsIsTheDiarrheaEverBloodyDropdown, "Yes", "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Diarrhea (loose liquid stool > 1 per day)\" section 'Is the diarrhea ever bloody?' DROPDOWN * * * * *");
        verifyInputField(ras_survey_native_view.giSymptomsWhenDiarrheaOccursHowManyEpisodesInOneDayInputField, ras_Survey_TestDataManager.pleaseCompleteTheTableBelowRegardingDiarrheaOption1, "* * * * * RAS SURVEY MISMATCH IN \"GI Symptoms - Diarrhea (loose liquid stool > 1 per day)\" section 'When diarrhea occurs, how many episodes in one day?' * * * * *");
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(locateByXpath("//button[@title='Back']"));
        CommonUtils.sleep(800);
    }

    /**
     * This method verifies the RAS Survey data for scenario two in Native View within the "Lymphatic System Issues" section.
     */
    public static void verify_ras_survey_data_scenarioTwo_lymphatic_system_issues_section() {
        clickTab("Lymphatic System Issues");
        openRelatedListRecord("Congenital chylothorax");
        verifyInputField(ras_survey_native_view.participantLymphaticIssueHistoryIssueInputField, ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithAnyOfTheFollowingLymphaticOption3, "* * * * * RAS SURVEY MISMATCH IN \"Lymphatic System Issues - Congenital chylothorax\" section 'Issue' * * * * *");
        verifyInputField(ras_survey_native_view.participantLymphaticIssueHistoryDateOfFirstSymptomInputField, ras_Survey_TestDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn1Option3, "* * * * * RAS SURVEY MISMATCH IN \"Lymphatic System Issues - Congenital chylothorax\" section 'Date of first symptom' * * * * *");
        verifyCheckbox("true", ras_survey_native_view.participantLymphaticIssueHistoryDateAgeOfFirstSymptomsUnknownCheckbox, "* * * * * RAS SURVEY MISMATCH IN \"Lymphatic System Issues - Congenital chylothorax\" section 'Date/age of first symptoms unknown' CHECKBOX * * * * *");
        verifyInputField(ras_survey_native_view.participantLymphaticIssueHistoryTreatmentTextarea, ras_Survey_TestDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn7Option3, "* * * * * RAS SURVEY MISMATCH IN \"Lymphatic System Issues - Congenital chylothorax\" section 'Treatment' * * * * *");
        verifyInputField(ras_survey_native_view.participantLymphaticIssueHistoryNameOfTreatingPhysicianTextarea, ras_Survey_TestDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn8Option3, "* * * * * RAS SURVEY MISMATCH IN \"Lymphatic System Issues - Congenital chylothorax\" section 'Name of treating physician' * * * * *");
        verifyInputField(ras_survey_native_view.participantLymphaticIssueHistoryDateOfDiagnosisInputField, ras_Survey_TestDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn4Option3, "* * * * * RAS SURVEY MISMATCH IN \"Lymphatic System Issues - Congenital chylothorax\" section 'Date of diagnosis' * * * * *");
        verifyCheckbox("true", ras_survey_native_view.participantLymphaticIssueHistoryDateAgeOfFirstDiagnosisUnknownCheckbox, "* * * * * RAS SURVEY MISMATCH IN \"Lymphatic System Issues - Congenital chylothorax\" section 'Date/age of diagnosis unknown' CHECKBOX * * * * *");
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(locateByXpath("//button[@title='Back']"));
        CommonUtils.sleep(800);
        CommonUtils.hoverOverElement(locateByXpath("//tr[contains(@id,'row_x_naci_family_coho_rasopathy_iiq.x_naci_family_coho_participant_lymphatic_issue_history')]//td//a[@aria-label='Preview record: Other (please specify)']"));
        JavascriptUtils.clickByJS(locateByXpath("//tr[contains(@id,'row_x_naci_family_coho_rasopathy_iiq.x_naci_family_coho_participant_lymphatic_issue_history')]//td//a[@aria-label='Preview record: Other (please specify)']"));
        CommonUtils.sleep(800);
        CommonUtils.waitForClickability(locateByXpath("//a[normalize-space()='Open Record']"));
        JavascriptUtils.clickByJS(locateByXpath("//a[normalize-space()='Open Record']"));
        CommonUtils.sleep(800);
        verifyInputField(ras_survey_native_view.participantLymphaticIssueHistoryIssueInputField, "Other (please specify)", "* * * * * RAS SURVEY MISMATCH IN \"Lymphatic System Issues - Other (please specify)\" section 'Issue' * * * * *");
        verifyInputField(ras_survey_native_view.participantLymphaticIssueHistoryPleaseSpecifyInputField, ras_Survey_TestDataManager.overallIsThereAnythingUnusualAboutYourTeethOrMouthPlease, "* * * * * RAS SURVEY MISMATCH IN \"Lymphatic System Issues - Other (please specify)\" section 'Please specify' * * * * *");
        verifyInputField(ras_survey_native_view.participantLymphaticIssueHistoryDateOfFirstSymptomInputField, ras_Survey_TestDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn1Option7, "* * * * * RAS SURVEY MISMATCH IN \"Lymphatic System Issues - Other (please specify)\" section 'Date of first symptom' * * * * *");
        verifyCheckbox("true", ras_survey_native_view.participantLymphaticIssueHistoryDateAgeOfFirstSymptomsUnknownCheckbox, "* * * * * RAS SURVEY MISMATCH IN \"Lymphatic System Issues - Other (please specify)\" section 'Date/age of first symptoms unknown' CHECKBOX * * * * *");
        verifyInputField(ras_survey_native_view.participantLymphaticIssueHistoryTreatmentTextarea, ras_Survey_TestDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn7Option7, "* * * * * RAS SURVEY MISMATCH IN \"Lymphatic System Issues - Other (please specify)\" section 'Treatment' * * * * *");
        verifyInputField(ras_survey_native_view.participantLymphaticIssueHistoryNameOfTreatingPhysicianTextarea, ras_Survey_TestDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn8Option7, "* * * * * RAS SURVEY MISMATCH IN \"Lymphatic System Issues - Other (please specify)\" section 'Name of treating physician' * * * * *");
        verifyInputField(ras_survey_native_view.participantLymphaticIssueHistoryDateOfDiagnosisInputField, ras_Survey_TestDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn4Option7, "* * * * * RAS SURVEY MISMATCH IN \"Lymphatic System Issues - Other (please specify)\" section 'Date of diagnosis' * * * * *");
        verifyCheckbox("true", ras_survey_native_view.participantLymphaticIssueHistoryDateAgeOfFirstDiagnosisUnknownCheckbox, "* * * * * RAS SURVEY MISMATCH IN \"Lymphatic System Issues - Congenital chylothorax\" section 'Date/age of diagnosis unknown' CHECKBOX * * * * *");
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(locateByXpath("//button[@title='Back']"));
        CommonUtils.sleep(800);
        openRelatedListRecord("Neonatal lymphedema");
        verifyInputField(ras_survey_native_view.participantLymphaticIssueHistoryIssueInputField, ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithAnyOfTheFollowingLymphaticOption1, "* * * * * RAS SURVEY MISMATCH IN \"Lymphatic System Issues - Neonatal lymphedema \" section 'Issue' * * * * *");
        verifyInputField(ras_survey_native_view.participantLymphaticIssueHistoryDateOfFirstSymptomInputField, ras_Survey_TestDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn1Option1, "* * * * * RAS SURVEY MISMATCH IN \"Lymphatic System Issues - Neonatal lymphedema \" section 'Date of first symptom' * * * * *");
        verifyCheckbox("true", ras_survey_native_view.participantLymphaticIssueHistoryDateAgeOfFirstSymptomsUnknownCheckbox, "* * * * * RAS SURVEY MISMATCH IN \"Lymphatic System Issues - Neonatal lymphedema \" section 'Date/age of first symptoms unknown' CHECKBOX * * * * *");
        verifyInputField(ras_survey_native_view.participantLymphaticIssueHistoryTreatmentTextarea, ras_Survey_TestDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn7Option1, "* * * * * RAS SURVEY MISMATCH IN \"Lymphatic System Issues - Neonatal lymphedema \" section 'Treatment' * * * * *");
        verifyInputField(ras_survey_native_view.participantLymphaticIssueHistoryNameOfTreatingPhysicianTextarea, ras_Survey_TestDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn8Option1, "* * * * * RAS SURVEY MISMATCH IN \"Lymphatic System Issues - Neonatal lymphedema \" section 'Name of treating physician' * * * * *");
        verifyInputField(ras_survey_native_view.participantLymphaticIssueHistoryDateOfDiagnosisInputField, ras_Survey_TestDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn4Option1, "* * * * * RAS SURVEY MISMATCH IN \"Lymphatic System Issues - Neonatal lymphedema \" section 'Date of diagnosis' * * * * *");
        verifyCheckbox("true", ras_survey_native_view.participantLymphaticIssueHistoryDateAgeOfFirstDiagnosisUnknownCheckbox, "* * * * * RAS SURVEY MISMATCH IN \"Lymphatic System Issues - Neonatal lymphedema \" section 'Date/age of diagnosis unknown' CHECKBOX * * * * *");
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(locateByXpath("//button[@title='Back']"));
        CommonUtils.sleep(800);
        openRelatedListRecord("Pleural effusion/chylothorax");
        verifyInputField(ras_survey_native_view.participantLymphaticIssueHistoryIssueInputField, ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithAnyOfTheFollowingLymphaticOption4, "* * * * * RAS SURVEY MISMATCH IN \"Lymphatic System Issues - Pleural effusion/chylothorax\" section 'Issue' * * * * *");
        verifyInputField(ras_survey_native_view.participantLymphaticIssueHistoryDateOfFirstSymptomInputField, ras_Survey_TestDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn1Option4, "* * * * * RAS SURVEY MISMATCH IN \"Lymphatic System Issues - Pleural effusion/chylothorax\" section 'Date of first symptom' * * * * *");
        verifyCheckbox("true", ras_survey_native_view.participantLymphaticIssueHistoryDateAgeOfFirstSymptomsUnknownCheckbox, "* * * * * RAS SURVEY MISMATCH IN \"Lymphatic System Issues - Pleural effusion/chylothorax\" section 'Date/age of first symptoms unknown' CHECKBOX * * * * *");
        verifyInputField(ras_survey_native_view.participantLymphaticIssueHistoryTreatmentTextarea, ras_Survey_TestDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn7Option4, "* * * * * RAS SURVEY MISMATCH IN \"Lymphatic System Issues - Pleural effusion/chylothorax\" section 'Treatment' * * * * *");
        verifyInputField(ras_survey_native_view.participantLymphaticIssueHistoryNameOfTreatingPhysicianTextarea, ras_Survey_TestDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn8Option4, "* * * * * RAS SURVEY MISMATCH IN \"Lymphatic System Issues - Pleural effusion/chylothorax\" section 'Name of treating physician' * * * * *");
        verifyInputField(ras_survey_native_view.participantLymphaticIssueHistoryDateOfDiagnosisInputField, ras_Survey_TestDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn4Option4, "* * * * * RAS SURVEY MISMATCH IN \"Lymphatic System Issues - Pleural effusion/chylothorax\" section 'Date of diagnosis' * * * * *");
        verifyCheckbox("true", ras_survey_native_view.participantLymphaticIssueHistoryDateAgeOfFirstDiagnosisUnknownCheckbox, "* * * * * RAS SURVEY MISMATCH IN \"Lymphatic System Issues - Pleural effusion/chylothorax\" section 'Date/age of diagnosis unknown' CHECKBOX * * * * *");
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(locateByXpath("//button[@title='Back']"));
        CommonUtils.sleep(800);
        openRelatedListRecord("Lymphangioma");
        verifyInputField(ras_survey_native_view.participantLymphaticIssueHistoryIssueInputField, ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithAnyOfTheFollowingLymphaticOption5 + ")", "* * * * * RAS SURVEY MISMATCH IN \"Lymphatic System Issues - Lymphangioma\" section 'Issue' * * * * *");
        verifyInputField(ras_survey_native_view.participantLymphaticIssueHistoryDateOfFirstSymptomInputField, ras_Survey_TestDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn1Option5, "* * * * * RAS SURVEY MISMATCH IN \"Lymphatic System Issues - Lymphangioma\" section 'Date of first symptom' * * * * *");
        verifyCheckbox("true", ras_survey_native_view.participantLymphaticIssueHistoryDateAgeOfFirstSymptomsUnknownCheckbox, "* * * * * RAS SURVEY MISMATCH IN \"Lymphatic System Issues - Lymphangioma\" section 'Date/age of first symptoms unknown' CHECKBOX * * * * *");
        verifyInputField(ras_survey_native_view.participantLymphaticIssueHistoryTreatmentTextarea, ras_Survey_TestDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn7Option5, "* * * * * RAS SURVEY MISMATCH IN \"Lymphatic System Issues - Lymphangioma\" section 'Treatment' * * * * *");
        verifyInputField(ras_survey_native_view.participantLymphaticIssueHistoryNameOfTreatingPhysicianTextarea, ras_Survey_TestDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn8Option5, "* * * * * RAS SURVEY MISMATCH IN \"Lymphatic System Issues - Lymphangioma\" section 'Name of treating physician' * * * * *");
        verifyInputField(ras_survey_native_view.participantLymphaticIssueHistoryDateOfDiagnosisInputField, ras_Survey_TestDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn4Option5, "* * * * * RAS SURVEY MISMATCH IN \"Lymphatic System Issues - Lymphangioma\" section 'Date of diagnosis' * * * * *");
        verifyCheckbox("true", ras_survey_native_view.participantLymphaticIssueHistoryDateAgeOfFirstDiagnosisUnknownCheckbox, "* * * * * RAS SURVEY MISMATCH IN \"Lymphatic System Issues - Lymphangioma\" section 'Date/age of diagnosis unknown' CHECKBOX * * * * *");
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(locateByXpath("//button[@title='Back']"));
        CommonUtils.sleep(800);
        openRelatedListRecord("Lymphedema");
        verifyInputField(ras_survey_native_view.participantLymphaticIssueHistoryIssueInputField, ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithAnyOfTheFollowingLymphaticOption2, "* * * * * RAS SURVEY MISMATCH IN \"Lymphatic System Issues - Lymphedema\" section 'Issue' * * * * *");
        verifyInputField(ras_survey_native_view.participantLymphaticIssueHistoryDateOfFirstSymptomInputField, ras_Survey_TestDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn1Option2, "* * * * * RAS SURVEY MISMATCH IN \"Lymphatic System Issues - Lymphedema\" section 'Date of first symptom' * * * * *");
        verifyCheckbox("true", ras_survey_native_view.participantLymphaticIssueHistoryDateAgeOfFirstSymptomsUnknownCheckbox, "* * * * * RAS SURVEY MISMATCH IN \"Lymphatic System Issues - Lymphedema\" section 'Date/age of first symptoms unknown' CHECKBOX * * * * *");
        verifyInputField(ras_survey_native_view.participantLymphaticIssueHistoryTreatmentTextarea, ras_Survey_TestDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn7Option2, "* * * * * RAS SURVEY MISMATCH IN \"Lymphatic System Issues - Lymphedema\" section 'Treatment' * * * * *");
        verifyInputField(ras_survey_native_view.participantLymphaticIssueHistoryNameOfTreatingPhysicianTextarea, ras_Survey_TestDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn8Option2, "* * * * * RAS SURVEY MISMATCH IN \"Lymphatic System Issues - Lymphedema\" section 'Name of treating physician' * * * * *");
        verifyInputField(ras_survey_native_view.participantLymphaticIssueHistoryDateOfDiagnosisInputField, ras_Survey_TestDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn4Option2, "* * * * * RAS SURVEY MISMATCH IN \"Lymphatic System Issues - Lymphedema\" section 'Date of diagnosis' * * * * *");
        verifyCheckbox("true", ras_survey_native_view.participantLymphaticIssueHistoryDateAgeOfFirstDiagnosisUnknownCheckbox, "* * * * * RAS SURVEY MISMATCH IN \"Lymphatic System Issues - Lymphedema\" section 'Date/age of diagnosis unknown' CHECKBOX * * * * *");
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(locateByXpath("//button[@title='Back']"));
        CommonUtils.sleep(800);
        openRelatedListRecord("Chronic abdominal pain");
        verifyInputField(ras_survey_native_view.participantLymphaticIssueHistoryIssueInputField, ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithAnyOfTheFollowingLymphaticOption6, "* * * * * RAS SURVEY MISMATCH IN \"Lymphatic System Issues - Chronic abdominal pain\" section 'Issue' * * * * *");
        verifyInputField(ras_survey_native_view.participantLymphaticIssueHistoryDateOfFirstSymptomInputField, ras_Survey_TestDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn1Option6, "* * * * * RAS SURVEY MISMATCH IN \"Lymphatic System Issues - Chronic abdominal pain\" section 'Date of first symptom' * * * * *");
        verifyCheckbox("true", ras_survey_native_view.participantLymphaticIssueHistoryDateAgeOfFirstSymptomsUnknownCheckbox, "* * * * * RAS SURVEY MISMATCH IN \"Lymphatic System Issues - Chronic abdominal pain\" section 'Date/age of first symptoms unknown' CHECKBOX * * * * *");
        verifyInputField(ras_survey_native_view.participantLymphaticIssueHistoryTreatmentTextarea, ras_Survey_TestDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn7Option6, "* * * * * RAS SURVEY MISMATCH IN \"Lymphatic System Issues - Chronic abdominal pain\" section 'Treatment' * * * * *");
        verifyInputField(ras_survey_native_view.participantLymphaticIssueHistoryNameOfTreatingPhysicianTextarea, ras_Survey_TestDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn8Option6, "* * * * * RAS SURVEY MISMATCH IN \"Lymphatic System Issues - Chronic abdominal pain\" section 'Name of treating physician' * * * * *");
        verifyInputField(ras_survey_native_view.participantLymphaticIssueHistoryDateOfDiagnosisInputField, ras_Survey_TestDataManager.pleaseCompleteToTheBestOfYourAbilityAboutTheOnsetColumn4Option6, "* * * * * RAS SURVEY MISMATCH IN \"Lymphatic System Issues - Chronic abdominal pain\" section 'Date of diagnosis' * * * * *");
        verifyCheckbox("true", ras_survey_native_view.participantLymphaticIssueHistoryDateAgeOfFirstDiagnosisUnknownCheckbox, "* * * * * RAS SURVEY MISMATCH IN \"Lymphatic System Issues - Chronic abdominal pain\" section 'Date/age of diagnosis unknown' CHECKBOX * * * * *");
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(locateByXpath("//button[@title='Back']"));
        CommonUtils.sleep(800);
    }

    /**
     * This method verifies the RAS Survey data for scenario two in Native View within the "Kidney Issues" section.
     */
    public static void verify_ras_survey_data_scenarioTwo_kidney_issues_section() {
        clickTab("Kidney Issues");
        openRelatedListRecord("Minor issues with kidenys");
        softAssertDropDownValueIsSelected(ras_survey_native_view.participantKidneyIssuesIssueDropdown, "Minor issues with kidenys", "* * * * * RAS SURVEY MISMATCH IN \"Kidney Issues - Minor issues with kidneys\" section 'Issue' DROPDOWN * * * * *");
        verifyInputField(ras_survey_native_view.participantKidneyIssuesHistoryDateOfFirstSymptomInputField, ras_Survey_TestDataManager.pleaseCompleteTheTableRegardingKidneyColumn1Option1, "* * * * * RAS SURVEY MISMATCH IN \"Kidney Issues - Minor issues with kidneys\" section 'Date of first symptom' * * * * *");
        verifyCheckbox("true", ras_survey_native_view.participantKidneyIssuesHistoryDateAgeOfFirstSymptomsUnknownCheckbox, "* * * * * RAS SURVEY MISMATCH IN \"Kidney Issues - Minor issues with kidneys\" section 'Date/age of first symptoms unknown' CHECKBOX * * * * *");
        verifyInputField(ras_survey_native_view.participantKidneyIssuesHistoryTreatmentTextarea, ras_Survey_TestDataManager.pleaseCompleteTheTableRegardingKidneyColumn4Option3, "* * * * * RAS SURVEY MISMATCH IN \"Kidney Issues - Minor issues with kidneys\" section 'Treatment' * * * * *");
        verifyInputField(ras_survey_native_view.participantKidneyIssuesHistoryNameOfTreatingPhysicianTextarea, ras_Survey_TestDataManager.pleaseCompleteTheTableRegardingKidneyColumn8Option1, "* * * * * RAS SURVEY MISMATCH IN \"Kidney Issues - Minor issues with kidneys\" section 'Physician information' * * * * *");
        verifyInputField(ras_survey_native_view.participantKidneyIssuesHistoryDateOfDiagnosisInputField, ras_Survey_TestDataManager.pleaseCompleteTheTableRegardingKidneyColumn4Option1, "* * * * * RAS SURVEY MISMATCH IN \"Kidney Issues - Minor issues with kidneys\" section 'Date of diagnosis' * * * * *");
        verifyCheckbox("true", ras_survey_native_view.participantKidneyIssuesHistoryDateAgeOfFirstDiagnosisUnknownCheckbox, "* * * * * RAS SURVEY MISMATCH IN \"Kidney Issues - Minor issues with kidneys\" section 'Date/age of diagnosis unknown' CHECKBOX * * * * *");
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(locateByXpath("//button[@title='Back']"));
        CommonUtils.sleep(800);
        CommonUtils.hoverOverElement(locateByXpath("//tr[contains(@id,'row_x_naci_family_coho_rasopathy_iiq.x_naci_family_coho_participant_kidney_issues.iiq')]//td//a[@aria-label='Preview record: Other']"));
        JavascriptUtils.clickByJS(locateByXpath("//tr[contains(@id,'row_x_naci_family_coho_rasopathy_iiq.x_naci_family_coho_participant_kidney_issues.iiq')]//td//a[@aria-label='Preview record: Other']"));
        CommonUtils.sleep(800);
        CommonUtils.waitForClickability(locateByXpath("//a[normalize-space()='Open Record']"));
        JavascriptUtils.clickByJS(locateByXpath("//a[normalize-space()='Open Record']"));
        CommonUtils.sleep(800);
        softAssertDropDownValueIsSelected(ras_survey_native_view.participantKidneyIssuesIssueDropdown, "Other", "* * * * * RAS SURVEY MISMATCH IN \"Kidney Issues - Other\" section 'Issue' DROPDOWN * * * * *");
        verifyInputField(ras_survey_native_view.participantKidneyIssuesHistoryPleaseSpecifyInputField, ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithAnyOfTheFollowingKidneyProblemsOption4Other, "* * * * * RAS SURVEY MISMATCH IN \"Kidney Issues - Other\" section 'Please specify' * * * * *");
        verifyInputField(ras_survey_native_view.participantKidneyIssuesHistoryDateOfFirstSymptomInputField, ras_Survey_TestDataManager.pleaseCompleteTheTableRegardingKidneyColumn1Option4, "* * * * * RAS SURVEY MISMATCH IN \"Kidney Issues - Other\" section 'Date of first symptom' * * * * *");
        verifyCheckbox("true", ras_survey_native_view.participantKidneyIssuesHistoryDateAgeOfFirstSymptomsUnknownCheckbox, "* * * * * RAS SURVEY MISMATCH IN \"Kidney Issues - Other\" section 'Date/age of first symptoms unknown' CHECKBOX * * * * *");
        verifyInputField(ras_survey_native_view.participantKidneyIssuesHistoryTreatmentTextarea, ras_Survey_TestDataManager.pleaseCompleteTheTableRegardingKidneyColumn7Option4, "* * * * * RAS SURVEY MISMATCH IN \"Kidney Issues - Other\" section 'Treatment' * * * * *");
        verifyInputField(ras_survey_native_view.participantKidneyIssuesHistoryNameOfTreatingPhysicianTextarea, ras_Survey_TestDataManager.pleaseCompleteTheTableRegardingKidneyColumn8Option4, "* * * * * RAS SURVEY MISMATCH IN \"Kidney Issues - Other\" section 'Physician information' * * * * *");
        verifyInputField(ras_survey_native_view.participantKidneyIssuesHistoryDateOfDiagnosisInputField, ras_Survey_TestDataManager.pleaseCompleteTheTableRegardingKidneyColumn4Option4, "* * * * * RAS SURVEY MISMATCH IN \"Kidney Issues - Other\" section 'Date of diagnosis' * * * * *");
        verifyCheckbox("true", ras_survey_native_view.participantKidneyIssuesHistoryDateAgeOfFirstDiagnosisUnknownCheckbox, "* * * * * RAS SURVEY MISMATCH IN \"Kidney Issues - Other\" section 'Date/age of diagnosis unknown' CHECKBOX * * * * *");
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(locateByXpath("//button[@title='Back']"));
        CommonUtils.sleep(800);
        openRelatedListRecord("Hydronephrosis");
        softAssertDropDownValueIsSelected(ras_survey_native_view.participantKidneyIssuesIssueDropdown, "Hydronephrosis", "* * * * * RAS SURVEY MISMATCH IN \"Kidney Issues - Hydronephrosis\" section 'Issue' DROPDOWN * * * * *");
        verifyInputField(ras_survey_native_view.participantKidneyIssuesHistoryDateOfFirstSymptomInputField, ras_Survey_TestDataManager.pleaseCompleteTheTableRegardingKidneyColumn1Option3, "* * * * * RAS SURVEY MISMATCH IN \"Kidney Issues - Hydronephrosis\" section 'Date of first symptom' * * * * *");
        verifyCheckbox("true", ras_survey_native_view.participantKidneyIssuesHistoryDateAgeOfFirstSymptomsUnknownCheckbox, "* * * * * RAS SURVEY MISMATCH IN \"Kidney Issues - Hydronephrosis\" section 'Date/age of first symptoms unknown' CHECKBOX * * * * *");
        verifyInputField(ras_survey_native_view.participantKidneyIssuesHistoryTreatmentTextarea, ras_Survey_TestDataManager.pleaseCompleteTheTableRegardingKidneyColumn7Option3, "* * * * * RAS SURVEY MISMATCH IN \"Kidney Issues - Hydronephrosis\" section 'Treatment' * * * * *");
        verifyInputField(ras_survey_native_view.participantKidneyIssuesHistoryNameOfTreatingPhysicianTextarea, ras_Survey_TestDataManager.pleaseCompleteTheTableRegardingKidneyColumn8Option3, "* * * * * RAS SURVEY MISMATCH IN \"Kidney Issues - Hydronephrosis\" section 'Physician information' * * * * *");
        verifyInputField(ras_survey_native_view.participantKidneyIssuesHistoryDateOfDiagnosisInputField, ras_Survey_TestDataManager.pleaseCompleteTheTableRegardingKidneyColumn4Option3, "* * * * * RAS SURVEY MISMATCH IN \"Kidney Issues - Hydronephrosis\" section 'Date of diagnosis' * * * * *");
        verifyCheckbox("true", ras_survey_native_view.participantKidneyIssuesHistoryDateAgeOfFirstDiagnosisUnknownCheckbox, "* * * * * RAS SURVEY MISMATCH IN \"Kidney Issues - Hydronephrosis\" section 'Date/age of diagnosis unknown' CHECKBOX * * * * *");
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(locateByXpath("//button[@title='Back']"));
        CommonUtils.sleep(800);
        openRelatedListRecord("Underdeveloped kidney(renaly hopolasia) or missing kidney (renal agenesis)");
        softAssertDropDownValueIsSelected(ras_survey_native_view.participantKidneyIssuesIssueDropdown, "Underdeveloped kidney(renaly hopolasia) or missing kidney (renal agenesis)", "* * * * * RAS SURVEY MISMATCH IN \"Kidney Issues - Underdeveloped kidney\" section 'Issue' DROPDOWN * * * * *");
        verifyInputField(ras_survey_native_view.participantKidneyIssuesHistoryDateOfFirstSymptomInputField, ras_Survey_TestDataManager.pleaseCompleteTheTableRegardingKidneyColumn1Option2, "* * * * * RAS SURVEY MISMATCH IN \"Kidney Issues - Underdeveloped kidney\" section 'Date of first symptom' * * * * *");
        verifyCheckbox("true", ras_survey_native_view.participantKidneyIssuesHistoryDateAgeOfFirstSymptomsUnknownCheckbox, "* * * * * RAS SURVEY MISMATCH IN \"Kidney Issues - Underdeveloped kidney\" section 'Date/age of first symptoms unknown' CHECKBOX * * * * *");
        verifyInputField(ras_survey_native_view.participantKidneyIssuesHistoryTreatmentTextarea, ras_Survey_TestDataManager.pleaseCompleteTheTableRegardingKidneyColumn4Option4, "* * * * * RAS SURVEY MISMATCH IN \"Kidney Issues - Underdeveloped kidney\" section 'Treatment' * * * * *");
        verifyInputField(ras_survey_native_view.participantKidneyIssuesHistoryNameOfTreatingPhysicianTextarea, ras_Survey_TestDataManager.pleaseCompleteTheTableRegardingKidneyColumn8Option2, "* * * * * RAS SURVEY MISMATCH IN \"Kidney Issues - Underdeveloped kidney\" section 'Physician information' * * * * *");
        verifyInputField(ras_survey_native_view.participantKidneyIssuesHistoryDateOfDiagnosisInputField, ras_Survey_TestDataManager.pleaseCompleteTheTableRegardingKidneyColumn4Option2, "* * * * * RAS SURVEY MISMATCH IN \"Kidney Issues - Underdeveloped kidney\" section 'Date of diagnosis' * * * * *");
        verifyCheckbox("true", ras_survey_native_view.participantKidneyIssuesHistoryDateAgeOfFirstDiagnosisUnknownCheckbox, "* * * * * RAS SURVEY MISMATCH IN \"Kidney Issues - Underdeveloped kidney\" section 'Date/age of diagnosis unknown' CHECKBOX * * * * *");
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(locateByXpath("//button[@title='Back']"));
        CommonUtils.sleep(800);
    }

    /**
     * This method verifies the RAS Survey data for scenario two in Native View within the "Spinal Information" section.
     */
    public static void verify_ras_survey_data_scenarioTwo_spinal_information_section() {
        clickTab("Spinal Information");
        openRelatedListRecord("Kyphoscoliosis");
        softAssertDropDownValueIsSelected(ras_survey_native_view.participantSpinalInformationTypeOfCurvatureDropdown, "Kyphoscoliosis", "* * * * * RAS SURVEY MISMATCH IN \"Spinal Information - Kyphoscoliosis\" section 'Type of curvature' DROPDOWN * * * * *");
        verifyInputField(ras_survey_native_view.participantSpinalInformationDateOfFirstSymptomInputField, ras_Survey_TestDataManager.pleaseCompleteTheTableBelowForEachOfTheSpineIssuesColumn1Option3, "* * * * * RAS SURVEY MISMATCH IN \"Spinal Information - Kyphoscoliosis\" section 'Date of first symptom' * * * * *");
        verifyCheckbox("true", ras_survey_native_view.participantSpinalInformationDateAgeOfFirstSymptomsUnknownCheckbox, "* * * * * RAS SURVEY MISMATCH IN \"Spinal Information - Kyphoscoliosis\" section 'Date/age of first symptoms unknown' CHECKBOX * * * * *");
        verifyInputField(ras_survey_native_view.participantSpinalInformationTreatmentTextarea, ras_Survey_TestDataManager.pleaseCompleteTheTableBelowForEachOfTheSpineIssuesColumn7Option3, "* * * * * RAS SURVEY MISMATCH IN \"Spinal Information - Kyphoscoliosis\" section 'Treatment' * * * * *");
        verifyInputField(ras_survey_native_view.participantSpinalInformationDateOfDiagnosisInputField, ras_Survey_TestDataManager.pleaseCompleteTheTableBelowForEachOfTheSpineIssuesColumn4Option3, "* * * * * RAS SURVEY MISMATCH IN \"Spinal Information - Kyphoscoliosis\" section 'Date of diagnosis' * * * * *");
        verifyCheckbox("true", ras_survey_native_view.participantSpinalInformationDateAgeOfFirstDiagnosisUnknownCheckbox, "* * * * * RAS SURVEY MISMATCH IN \"Spinal Information - Kyphoscoliosis\" section 'Date/age of diagnosis unknown' CHECKBOX * * * * *");
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(locateByXpath("//button[@title='Back']"));
        CommonUtils.sleep(800);
        openRelatedListRecord("Kyphosis");
        softAssertDropDownValueIsSelected(ras_survey_native_view.participantSpinalInformationTypeOfCurvatureDropdown, "Kyphosis", "* * * * * RAS SURVEY MISMATCH IN \"Spinal Information - Kyphosis\" section 'Type of curvature' DROPDOWN * * * * *");
        verifyInputField(ras_survey_native_view.participantSpinalInformationDateOfFirstSymptomInputField, ras_Survey_TestDataManager.pleaseCompleteTheTableBelowForEachOfTheSpineIssuesColumn1Option2, "* * * * * RAS SURVEY MISMATCH IN \"Spinal Information - Kyphosis\" section 'Date of first symptom' * * * * *");
        verifyCheckbox("true", ras_survey_native_view.participantSpinalInformationDateAgeOfFirstSymptomsUnknownCheckbox, "* * * * * RAS SURVEY MISMATCH IN \"Spinal Information - Kyphosis\" section 'Date/age of first symptoms unknown' CHECKBOX * * * * *");
        verifyInputField(ras_survey_native_view.participantSpinalInformationTreatmentTextarea, ras_Survey_TestDataManager.pleaseCompleteTheTableBelowForEachOfTheSpineIssuesColumn7Option2, "* * * * * RAS SURVEY MISMATCH IN \"Spinal Information - Kyphosis\" section 'Treatment' * * * * *");
        verifyInputField(ras_survey_native_view.participantSpinalInformationDateOfDiagnosisInputField, ras_Survey_TestDataManager.pleaseCompleteTheTableBelowForEachOfTheSpineIssuesColumn4Option2, "* * * * * RAS SURVEY MISMATCH IN \"Spinal Information - Kyphosis\" section 'Date of diagnosis' * * * * *");
        verifyCheckbox("true", ras_survey_native_view.participantSpinalInformationDateAgeOfFirstDiagnosisUnknownCheckbox, "* * * * * RAS SURVEY MISMATCH IN \"Spinal Information - Kyphosis\" section 'Date/age of diagnosis unknown' CHECKBOX * * * * *");
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(locateByXpath("//button[@title='Back']"));
        CommonUtils.sleep(800);
        openRelatedListRecord("Scoliosis");
        softAssertDropDownValueIsSelected(ras_survey_native_view.participantSpinalInformationTypeOfCurvatureDropdown, "Scoliosis", "* * * * * RAS SURVEY MISMATCH IN \"Spinal Information - Scoliosis\" section 'Type of curvature' DROPDOWN * * * * *");
        verifyInputField(ras_survey_native_view.participantSpinalInformationDateOfFirstSymptomInputField, ras_Survey_TestDataManager.pleaseCompleteTheTableBelowForEachOfTheSpineIssuesColumn1Option1, "* * * * * RAS SURVEY MISMATCH IN \"Spinal Information - Scoliosis\" section 'Date of first symptom' * * * * *");
        verifyCheckbox("true", ras_survey_native_view.participantSpinalInformationDateAgeOfFirstSymptomsUnknownCheckbox, "* * * * * RAS SURVEY MISMATCH IN \"Spinal Information - Scoliosis\" section 'Date/age of first symptoms unknown' CHECKBOX * * * * *");
        verifyInputField(ras_survey_native_view.participantSpinalInformationTreatmentTextarea, ras_Survey_TestDataManager.pleaseCompleteTheTableBelowForEachOfTheSpineIssuesColumn7Option1, "* * * * * RAS SURVEY MISMATCH IN \"Spinal Information - Scoliosis\" section 'Treatment' * * * * *");
        verifyInputField(ras_survey_native_view.participantSpinalInformationDateOfDiagnosisInputField, ras_Survey_TestDataManager.pleaseCompleteTheTableBelowForEachOfTheSpineIssuesColumn4Option1, "* * * * * RAS SURVEY MISMATCH IN \"Spinal Information - Scoliosis\" section 'Date of diagnosis' * * * * *");
        verifyCheckbox("true", ras_survey_native_view.participantSpinalInformationDateAgeOfFirstDiagnosisUnknownCheckbox, "* * * * * RAS SURVEY MISMATCH IN \"Spinal Information - Scoliosis\" section 'Date/age of diagnosis unknown' CHECKBOX * * * * *");
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(locateByXpath("//button[@title='Back']"));
        CommonUtils.sleep(800);
        CommonUtils.hoverOverElement(locateByXpath("//tr[contains(@id,'row_x_naci_family_coho_rasopathy_iiq.x_naci_family_coho_participant_spinal_information.iiq')]//td//a[@aria-label='Preview record: Other']"));
        JavascriptUtils.clickByJS(locateByXpath("//tr[contains(@id,'row_x_naci_family_coho_rasopathy_iiq.x_naci_family_coho_participant_spinal_information.iiq')]//td//a[@aria-label='Preview record: Other']"));
        CommonUtils.sleep(800);
        CommonUtils.waitForClickability(locateByXpath("//a[normalize-space()='Open Record']"));
        JavascriptUtils.clickByJS(locateByXpath("//a[normalize-space()='Open Record']"));
        CommonUtils.sleep(800);
        softAssertDropDownValueIsSelected(ras_survey_native_view.participantSpinalInformationTypeOfCurvatureDropdown, "Other", "* * * * * RAS SURVEY MISMATCH IN \"Spinal Information - Other\" section 'Type of curvature' DROPDOWN * * * * *");
        verifyInputField(ras_survey_native_view.participantSpinalInformationPleaseSpecifyInputField, ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithAnyOfTheFollowingSkinTumorsOthers, "* * * * * RAS SURVEY MISMATCH IN \"Spinal Information - Other\" section 'Please specify' * * * * *");
        verifyInputField(ras_survey_native_view.participantSpinalInformationDateOfFirstSymptomInputField, ras_Survey_TestDataManager.pleaseCompleteTheTableBelowForEachOfTheSpineIssuesColumn1Option4, "* * * * * RAS SURVEY MISMATCH IN \"Spinal Information - Other\" section 'Date of first symptom' * * * * *");
        verifyCheckbox("true", ras_survey_native_view.participantSpinalInformationDateAgeOfFirstSymptomsUnknownCheckbox, "* * * * * RAS SURVEY MISMATCH IN \"Spinal Information - Other\" section 'Date/age of first symptoms unknown' CHECKBOX * * * * *");
        verifyInputField(ras_survey_native_view.participantSpinalInformationTreatmentTextarea, ras_Survey_TestDataManager.pleaseCompleteTheTableBelowForEachOfTheSpineIssuesColumn7Option4, "* * * * * RAS SURVEY MISMATCH IN \"Spinal Information - Other\" section 'Treatment' * * * * *");
        verifyInputField(ras_survey_native_view.participantSpinalInformationDateOfDiagnosisInputField, ras_Survey_TestDataManager.pleaseCompleteTheTableBelowForEachOfTheSpineIssuesColumn4Option4, "* * * * * RAS SURVEY MISMATCH IN \"Spinal Information - Other\" section 'Date of diagnosis' * * * * *");
        verifyCheckbox("true", ras_survey_native_view.participantSpinalInformationDateAgeOfFirstDiagnosisUnknownCheckbox, "* * * * * RAS SURVEY MISMATCH IN \"Spinal Information - Other\" section 'Date/age of diagnosis unknown' CHECKBOX * * * * *");
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(locateByXpath("//button[@title='Back']"));
        CommonUtils.sleep(800);
    }

    /**
     * This method verifies the RAS Survey data for scenario two in Native View within the "Joint Issues" section.
     */
    public static void verify_ras_survey_data_scenarioTwo_joint_issues_section() {
        clickTab("Joint Issues");
        openRelatedListRecord("Hip dysplasia requiring surgery");
        verifyInputField(ras_survey_native_view.participantJointIssuesInputField, ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithTheFollowingJointIssues4, "* * * * * RAS SURVEY MISMATCH IN \"Joint Issues - Hip dysplasia requiring surgery\" section 'Issue' * * * * *");
        verifyInputField(ras_survey_native_view.participantJointIssuesDateOfFirstSymptomInputField, ras_Survey_TestDataManager.pleaseCompleteTheJointIssuesListedColumn1Option4, "* * * * * RAS SURVEY MISMATCH IN \"Joint Issues - Hip dysplasia requiring surgery\" section 'Date of first symptom' * * * * *");
        verifyCheckbox("true", ras_survey_native_view.participantJointIssuesDateAgeOfFirstSymptomsUnknownCheckbox, "* * * * * RAS SURVEY MISMATCH IN \"Joint Issues - Hip dysplasia requiring surgery\" section 'Date/age of first symptoms unknown' CHECKBOX * * * * *");
        verifyInputField(ras_survey_native_view.participantJointIssuesTreatmentTextarea, ras_Survey_TestDataManager.pleaseCompleteTheJointIssuesListedColumn7Option4, "* * * * * RAS SURVEY MISMATCH IN \"Joint Issues - Hip dysplasia requiring surgery\" section 'Treatment' * * * * *");
        verifyInputField(ras_survey_native_view.participantJointIssuesDateOfDiagnosisInputField, ras_Survey_TestDataManager.pleaseCompleteTheJointIssuesListedColumn4Option4, "* * * * * RAS SURVEY MISMATCH IN \"Joint Issues - Hip dysplasia requiring surgery\" section 'Date of diagnosis' * * * * *");
        verifyCheckbox("true", ras_survey_native_view.participantJointIssuesDateAgeOfFirstDiagnosisUnknownCheckbox, "* * * * * RAS SURVEY MISMATCH IN \"Joint Issues - Hip dysplasia requiring surgery\" section 'Date/age of diagnosis unknown' CHECKBOX * * * * *");
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(locateByXpath("//button[@title='Back']"));
        CommonUtils.sleep(800);
        openRelatedListRecord("Pes planus/pes valgus (also known as flat feet)");
        verifyInputField(ras_survey_native_view.participantJointIssuesInputField, ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithTheFollowingJointIssues2, "* * * * * RAS SURVEY MISMATCH IN \"Joint Issues - Hip dysplasia requiring surgery\" section 'Issue' * * * * *");
        verifyInputField(ras_survey_native_view.participantJointIssuesDateOfFirstSymptomInputField, ras_Survey_TestDataManager.pleaseCompleteTheJointIssuesListedColumn1Option2, "* * * * * RAS SURVEY MISMATCH IN \"Joint Issues - Hip dysplasia requiring surgery\" section 'Date of first symptom' * * * * *");
        verifyCheckbox("true", ras_survey_native_view.participantJointIssuesDateAgeOfFirstSymptomsUnknownCheckbox, "* * * * * RAS SURVEY MISMATCH IN \"Joint Issues - Hip dysplasia requiring surgery\" section 'Date/age of first symptoms unknown' CHECKBOX * * * * *");
        verifyInputField(ras_survey_native_view.participantJointIssuesTreatmentTextarea, ras_Survey_TestDataManager.pleaseCompleteTheJointIssuesListedColumn7Option2, "* * * * * RAS SURVEY MISMATCH IN \"Joint Issues - Hip dysplasia requiring surgery\" section 'Treatment' * * * * *");
        verifyInputField(ras_survey_native_view.participantJointIssuesDateOfDiagnosisInputField, ras_Survey_TestDataManager.pleaseCompleteTheJointIssuesListedColumn4Option2, "* * * * * RAS SURVEY MISMATCH IN \"Joint Issues - Hip dysplasia requiring surgery\" section 'Date of diagnosis' * * * * *");
        verifyCheckbox("true", ras_survey_native_view.participantJointIssuesDateAgeOfFirstDiagnosisUnknownCheckbox, "* * * * * RAS SURVEY MISMATCH IN \"Joint Issues - Hip dysplasia requiring surgery\" section 'Date/age of diagnosis unknown' CHECKBOX * * * * *");
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(locateByXpath("//button[@title='Back']"));
        CommonUtils.sleep(800);
        openRelatedListRecord("Achilles tendon contracture (tightness in the achilles tendon which runs from your heel to your ankle and causes pain or the foot to remain in an abnormal position)");
        verifyInputField(ras_survey_native_view.participantJointIssuesInputField, ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithTheFollowingJointIssues3, "* * * * * RAS SURVEY MISMATCH IN \"Joint Issues - Achilles tendon contracture\" section 'Issue' * * * * *");
        verifyInputField(ras_survey_native_view.participantJointIssuesDateOfFirstSymptomInputField, ras_Survey_TestDataManager.pleaseCompleteTheJointIssuesListedColumn1Option3, "* * * * * RAS SURVEY MISMATCH IN \"Joint Issues - Achilles tendon contracture\" section 'Date of first symptom' * * * * *");
        verifyCheckbox("true", ras_survey_native_view.participantJointIssuesDateAgeOfFirstSymptomsUnknownCheckbox, "* * * * * RAS SURVEY MISMATCH IN \"Joint Issues - Achilles tendon contracture\" section 'Date/age of first symptoms unknown' CHECKBOX * * * * *");
        verifyInputField(ras_survey_native_view.participantJointIssuesTreatmentTextarea, ras_Survey_TestDataManager.pleaseCompleteTheJointIssuesListedColumn7Option3, "* * * * * RAS SURVEY MISMATCH IN \"Joint Issues - Achilles tendon contracture\" section 'Treatment' * * * * *");
        verifyInputField(ras_survey_native_view.participantJointIssuesDateOfDiagnosisInputField, ras_Survey_TestDataManager.pleaseCompleteTheJointIssuesListedColumn4Option3, "* * * * * RAS SURVEY MISMATCH IN \"Joint Issues - Achilles tendon contracture\" section 'Date of diagnosis' * * * * *");
        verifyCheckbox("true", ras_survey_native_view.participantJointIssuesDateAgeOfFirstDiagnosisUnknownCheckbox, "* * * * * RAS SURVEY MISMATCH IN \"Joint Issues - Achilles tendon contracture\" section 'Date/age of diagnosis unknown' CHECKBOX * * * * *");
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(locateByXpath("//button[@title='Back']"));
        CommonUtils.sleep(800);
        openRelatedListRecord("Hypermobility (joints that are more flexible than usual; sometimes referred to as \"double jointed\")");
        verifyInputField(ras_survey_native_view.participantJointIssuesInputField, ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithTheFollowingJointIssues5, "* * * * * RAS SURVEY MISMATCH IN \"Joint Issues - Hypermobility\" section 'Issue' * * * * *");
        verifyInputField(ras_survey_native_view.participantJointIssuesDateOfFirstSymptomInputField, ras_Survey_TestDataManager.pleaseCompleteTheJointIssuesListedColumn1Option5, "* * * * * RAS SURVEY MISMATCH IN \"Joint Issues - Hypermobility\" section 'Date of first symptom' * * * * *");
        verifyCheckbox("true", ras_survey_native_view.participantJointIssuesDateAgeOfFirstSymptomsUnknownCheckbox, "* * * * * RAS SURVEY MISMATCH IN \"Joint Issues - Hypermobility\" section 'Date/age of first symptoms unknown' CHECKBOX * * * * *");
        verifyInputField(ras_survey_native_view.participantJointIssuesTreatmentTextarea, ras_Survey_TestDataManager.pleaseCompleteTheJointIssuesListedColumn7Option5, "* * * * * RAS SURVEY MISMATCH IN \"Joint Issues - Hypermobility\" section 'Treatment' * * * * *");
        verifyInputField(ras_survey_native_view.participantJointIssuesDateOfDiagnosisInputField, ras_Survey_TestDataManager.pleaseCompleteTheJointIssuesListedColumn4Option5, "* * * * * RAS SURVEY MISMATCH IN \"Joint Issues - Hypermobility\" section 'Date of diagnosis' * * * * *");
        verifyCheckbox("true", ras_survey_native_view.participantJointIssuesDateAgeOfFirstDiagnosisUnknownCheckbox, "* * * * * RAS SURVEY MISMATCH IN \"Joint Issues - Hypermobility\" section 'Date/age of diagnosis unknown' CHECKBOX * * * * *");
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(locateByXpath("//button[@title='Back']"));
        CommonUtils.sleep(800);
        openRelatedListRecord("Ulnar deviation (also called ulnar drift, when your fingers bend towards your pinky finger, but your wrist shifts towards your thumb. May cause swelling and difficulty gripping)");
        verifyInputField(ras_survey_native_view.participantJointIssuesInputField, ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithTheFollowingJointIssues1, "* * * * * RAS SURVEY MISMATCH IN \"Joint Issues - Ulnar deviation\" section 'Issue' * * * * *");
        verifyInputField(ras_survey_native_view.participantJointIssuesDateOfFirstSymptomInputField, ras_Survey_TestDataManager.pleaseCompleteTheJointIssuesListedColumn1Option1, "* * * * * RAS SURVEY MISMATCH IN \"Joint Issues - Ulnar deviation\" section 'Date of first symptom' * * * * *");
        verifyCheckbox("true", ras_survey_native_view.participantJointIssuesDateAgeOfFirstSymptomsUnknownCheckbox, "* * * * * RAS SURVEY MISMATCH IN \"Joint Issues - Ulnar deviation\" section 'Date/age of first symptoms unknown' CHECKBOX * * * * *");
        verifyInputField(ras_survey_native_view.participantJointIssuesTreatmentTextarea, ras_Survey_TestDataManager.pleaseCompleteTheJointIssuesListedColumn7Option1, "* * * * * RAS SURVEY MISMATCH IN \"Joint Issues - Ulnar deviation\" section 'Treatment' * * * * *");
        verifyInputField(ras_survey_native_view.participantJointIssuesDateOfDiagnosisInputField, ras_Survey_TestDataManager.pleaseCompleteTheJointIssuesListedColumn4Option1, "* * * * * RAS SURVEY MISMATCH IN \"Joint Issues - Ulnar deviation\" section 'Date of diagnosis' * * * * *");
        verifyCheckbox("true", ras_survey_native_view.participantJointIssuesDateAgeOfFirstDiagnosisUnknownCheckbox, "* * * * * RAS SURVEY MISMATCH IN \"Joint Issues - Ulnar deviation\" section 'Date/age of diagnosis unknown' CHECKBOX * * * * *");
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(locateByXpath("//button[@title='Back']"));
        CommonUtils.sleep(800);
        CommonUtils.hoverOverElement(locateByXpath("//tr[contains(@id,'row_x_naci_family_coho_rasopathy_iiq.x_naci_family_coho_participants_joint_issues.iiq')]//td//a[@aria-label='Preview record: Other (please specify)']"));
        JavascriptUtils.clickByJS(locateByXpath("//tr[contains(@id,'row_x_naci_family_coho_rasopathy_iiq.x_naci_family_coho_participants_joint_issues.iiq')]//td//a[@aria-label='Preview record: Other (please specify)']"));
        CommonUtils.sleep(800);
        CommonUtils.waitForClickability(locateByXpath("//a[normalize-space()='Open Record']"));
        JavascriptUtils.clickByJS(locateByXpath("//a[normalize-space()='Open Record']"));
        CommonUtils.sleep(800);
        verifyInputField(ras_survey_native_view.participantJointIssuesInputField, "Other (please specify)", "* * * * * RAS SURVEY MISMATCH IN \"Joint Issues - Other (please specify)\" section 'Issue' * * * * *");
        verifyInputField(ras_survey_native_view.participantJointIssuesPleaseSpecifyInputField, ras_Survey_TestDataManager.haveYouEverBeenDiagnosedWithTheFollowingJointIssues6Other, "* * * * * RAS SURVEY MISMATCH IN \"Joint Issues - Other (please specify)\" section 'Please specify' * * * * *");
        verifyInputField(ras_survey_native_view.participantJointIssuesDateOfFirstSymptomInputField, ras_Survey_TestDataManager.pleaseCompleteTheJointIssuesListedColumn1Option6, "* * * * * RAS SURVEY MISMATCH IN \"Joint Issues - Other (please specify)\" section 'Date of first symptom' * * * * *");
        verifyCheckbox("true", ras_survey_native_view.participantJointIssuesDateAgeOfFirstSymptomsUnknownCheckbox, "* * * * * RAS SURVEY MISMATCH IN \"Joint Issues - Other (please specify)\" section 'Date/age of first symptoms unknown' CHECKBOX * * * * *");
        verifyInputField(ras_survey_native_view.participantJointIssuesTreatmentTextarea, ras_Survey_TestDataManager.pleaseCompleteTheJointIssuesListedColumn7Option6, "* * * * * RAS SURVEY MISMATCH IN \"Joint Issues - Other (please specify)\" section 'Treatment' * * * * *");
        verifyInputField(ras_survey_native_view.participantJointIssuesDateOfDiagnosisInputField, ras_Survey_TestDataManager.pleaseCompleteTheJointIssuesListedColumn4Option6, "* * * * * RAS SURVEY MISMATCH IN \"Joint Issues - Other (please specify)\" section 'Date of diagnosis' * * * * *");
        verifyCheckbox("true", ras_survey_native_view.participantJointIssuesDateAgeOfFirstDiagnosisUnknownCheckbox, "* * * * * RAS SURVEY MISMATCH IN \"Joint Issues - Other (please specify)\" section 'Date/age of diagnosis unknown' CHECKBOX * * * * *");
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(locateByXpath("//button[@title='Back']"));
        CommonUtils.sleep(800);
    }

    /**
     * This method verifies the RAS Survey data for scenario two in Native View within the "Bleeding Issues" section.
     */
    public static void verify_ras_survey_data_scenarioTwo_bleeding_issues_section() {
        clickTab("Bleeding Issues");
        openRelatedListRecord("Easy bruising (bruising with little or no trauma)");
        verifyInputField(ras_survey_native_view.participantBleedingIssuesInputField, ras_Survey_TestDataManager.doYouHaveAnyOfTheFollowingIssuesWithBleedingOrBruising1, "* * * * * RAS SURVEY MISMATCH IN \"Bleeding Issues - Easy bruising\" section 'Issue' * * * * *");
        verifyInputField(ras_survey_native_view.participantJointIssuesDateOfDiagnosisInputField, ras_Survey_TestDataManager.pleaseCompleteBleedingBruisingIssuesListedColumn4Option1, "* * * * * RAS SURVEY MISMATCH IN \"Bleeding Issues - Easy bruising\" section 'Date of diagnosis' * * * * *");
        verifyCheckbox("true", ras_survey_native_view.participantJointIssuesDateAgeOfFirstSymptomsUnknownCheckbox, "* * * * * RAS SURVEY MISMATCH IN \"Bleeding Issues - Easy bruising\" section 'Date/age of first symptoms unknown' CHECKBOX * * * * *");
        verifyInputField(ras_survey_native_view.participantBleedingIssuesTreatmentTextarea, ras_Survey_TestDataManager.pleaseCompleteBleedingBruisingIssuesListedColumn7Option1, "* * * * * RAS SURVEY MISMATCH IN \"Bleeding Issues - Easy bruising\" section 'Treatment' * * * * *");
        verifyInputField(ras_survey_native_view.participantBleedingIssuesNameOfTreatingHospitalOrPhysicianInputField, ras_Survey_TestDataManager.pleaseCompleteBleedingBruisingIssuesListedColumn8Option1, "* * * * * RAS SURVEY MISMATCH IN \"Bleeding Issues - Easy bruising\" section 'Name of treating hospital or physician' * * * * *");
        verifyInputField(ras_survey_native_view.participantBleedingIssuesDateOfFirstSymptomInputField, ras_Survey_TestDataManager.pleaseCompleteBleedingBruisingIssuesListedColumn1Option1, "* * * * * RAS SURVEY MISMATCH IN \"Bleeding Issues - Easy bruising\" section 'Date of first symptom' * * * * *");
        verifyCheckbox("true", ras_survey_native_view.participantJointIssuesDateAgeOfFirstDiagnosisUnknownCheckbox, "* * * * * RAS SURVEY MISMATCH IN \"Bleeding Issues - Easy bruising\" section 'Date/age of diagnosis unknown' CHECKBOX * * * * *");
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(locateByXpath("//button[@title='Back']"));
        CommonUtils.sleep(800);
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
        verify_ras_survey_data_scenarioTwo_vision_and_hearing_section();
        verify_ras_survey_data_scenarioTwo_prenatal_test_history_section();
        verify_ras_survey_data_scenarioTwo_medications_taken_while_pregnant_section();
        verify_ras_survey_data_scenarioTwo_growth_hormone_details_section();
        verify_ras_survey_data_scenarioTwo_heart_symptoms_details_section();
        verify_ras_survey_data_scenarioTwo_heart_treatments_section();
        verify_ras_survey_data_scenarioTwo_participant_heart_issues_section();
        verify_ras_survey_data_scenarioTwo_biopsy_history_section();
        verify_ras_survey_data_scenarioTwo_allergy_histories_section();
        verify_ras_survey_data_scenarioTwo_hospital_history_section();
        verify_ras_survey_data_scenarioTwo_gastrointestinal_exams_section();
        verify_ras_survey_data_scenarioTwo_gi_symptoms_section();
        verify_ras_survey_data_scenarioTwo_lymphatic_system_issues_section();
        verify_ras_survey_data_scenarioTwo_kidney_issues_section();
        verify_ras_survey_data_scenarioTwo_spinal_information_section();
        verify_ras_survey_data_scenarioTwo_joint_issues_section();
        verify_ras_survey_data_scenarioTwo_bleeding_issues_section();
    }
}