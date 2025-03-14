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
     * This method verifies the RAS Survey Data in Native View for Scenario Two.
     */
    @Then("RAS Survey Data for Scenario Two is verified")
    public void ras_survey_Data_for_scenario_two_is_verified() {
        /**
         * ----- BEGINNING Demographics SECTION VALIDATION -----
         */
        ras_Survey_TestDataManager.dataInitializerRasSurvey("RASSurveyScenario2");
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
        /**
         * ----- END Demographics SECTION VALIDATION -----
         */

        /**
         * ----- BEGINNING RASopathy History SECTION VALIDATION -----
         */
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
        softAssert.assertTrue(sortAndCompareLists(ras_survey_native_view.textToList(ras_survey_native_view.diagnosedRasopathiesTextList), expectedDiagnosedRasopathies), "* * * * * RAS SURVEY MISMATCH IN 'Diagnosed RASopathies' TEXT * * * * *");
        softAssertDropDownValueIsSelected(ras_survey_native_view.dropdownDiagnosedWithRasopathyByPhysician, ras_Survey_TestDataManager.haveYouBeenDiagnosedWithARASopathy, "* * * * * RAS SURVEY MISMATCH IN 'Diagnosed with a RASopathy by a physician through testing' INPUT FIELD * * * * *");
        verifyInputField(ras_survey_native_view.specifyOtherRasopathyInputField, ras_Survey_TestDataManager.pleaseIndicateIfYouHaveBeenDiagnosedWithRASopathiesOption9Other, "* * * * * Please specify other RASopathy' INPUT FIELD * * * * *");
        CucumberLogUtils.logScreenshot();
        /**
         * ----- END RASopathy History SECTION VALIDATION -----
         */

        /**
         * ----- BEGINNING Birth & Gestation SECTION VALIDATION -----
         */
        ras_Survey_TestDataManager.dataInitializerRasSurvey("RASSurveyScenario2");
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
        softAssert.assertTrue(sortAndCompareLists(ras_survey_native_view.textToList(ras_survey_native_view.issuesPriorToBirthTextList), expectedIssuesPriorToBirth), "* * * * * RAS SURVEY MISMATCH IN 'Issues identified in the participant prior to birth' TEXT * * * * *");
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
        softAssert.assertTrue(sortAndCompareLists(ras_survey_native_view.textToList(ras_survey_native_view.vapingProductsTextList), expectedVapingProductsUsedWhilePregnant), "* * * * * RAS SURVEY MISMATCH IN 'Vape products used' TEXT * * * * *");
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
        softAssert.assertTrue(sortAndCompareLists(ras_survey_native_view.textToList(ras_survey_native_view.recreationalDrugsUsedWhilePregnantTextList), expectedDrugsUsedByBiologicalMotherWhilePregnant), "* * * * * RAS SURVEY MISMATCH IN 'Drugs used by biological mother during pregnancy' TEXT * * * * *");
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
        softAssert.assertTrue(sortAndCompareLists(ras_survey_native_view.textToList(ras_survey_native_view.participantMotherBirthComplicationsTextList), expectedMotherBirthComplicationsTextList), "* * * * * RAS SURVEY MISMATCH IN 'Participant mother's birth complications' TEXT * * * * *");
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
        softAssert.assertTrue(sortAndCompareLists(ras_survey_native_view.textToList(ras_survey_native_view.tobaccoProductsUsedByMotherWhilePregnantTextList), expectedTobaccoProductsUsedByMotherDuringPregnancyTextList), "* * * * * RAS SURVEY MISMATCH IN 'Tobacco products used by mother during pregnancy' TEXT * * * * *");
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
        softAssert.assertTrue(sortAndCompareLists(ras_survey_native_view.textToList(ras_survey_native_view.alcoholUsedByMotherWhilePregnantTextList), expectedAlcoholUsedByMotherDuringPregnancyTextList), "* * * * * RAS SURVEY MISMATCH IN 'Alcohol used by mom during pregnancy' TEXT * * * * *");
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
        softAssert.assertTrue(sortAndCompareLists(ras_survey_native_view.textToList(ras_survey_native_view.tobaccoProductsUsedAroundMotherWhilePregnantTextList), expectedTobaccoProductsUsedAroundMotherWhilePregnantTextList), "* * * * * RAS SURVEY MISMATCH IN 'Tobacco products used around mother during pregnancy' TEXT * * * * *");
        verifyInputField(ras_survey_native_view.specifyTobaccoUsedAroundMotherDuringPregnancyInputField, ras_Survey_TestDataManager.whatProductsWereUsedAroundOption4Other, "* * * * * RAS SURVEY MISMATCH IN 'Please specify (Tobacco products used around mother during pregnancy)' INPUT FIELD * * * * *");
        verifyInputField(ras_survey_native_view.fieldBioFatherOccupationWhileMotherWasPregnant, ras_Survey_TestDataManager.biologicalMotherOccupationDuringPregnancyFather, "* * * * * RAS SURVEY MISMATCH IN 'Biological fathers occupation while mother was pregnant with the participant' INPUT FIELD * * * * *");
        verifyCheckbox("true", ras_survey_native_view.biologicalFatherOccupationUnknownCheckbox, "* * * * * RAS SURVEY MISMATCH IN 'Biological father occupation unknown' CHECKBOX * * * * *");
        CucumberLogUtils.logScreenshot();
    }
}