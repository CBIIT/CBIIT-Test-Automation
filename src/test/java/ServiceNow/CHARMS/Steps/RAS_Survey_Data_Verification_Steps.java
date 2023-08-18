package ServiceNow.CHARMS.Steps;

import appsCommon.DynamicLocators;
import appsCommon.PageInitializer;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;

public class RAS_Survey_Data_Verification_Steps extends PageInitializer {

    @Then("RAS Survey Data for Scenario One is verified")
    public void ras_survey_Data_for_scenario_one_is_verified() {
        /**
         * DATA VERIFICATION
         */
        /**
         * NAVIGATING TO RAS SURVEY TABLE
         */
        nativeViewLoginImpl.sideDoorAccountLogin();
        CommonUtils.sendKeysToElement(nativeViewHomePage.nativeViewFilterNavigator, "CHARMS");
        JavascriptUtils.scrollIntoView(DynamicLocators.dynamicTextLocator("RASopathy Surveys"));
        CommonUtils.clickOnElement(DynamicLocators.dynamicTextLocator("RASopathy Surveys"));
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
        /**
         *  ----- BEGINNING DEMOGRAPHICS SECTION VALIDATION ----- HAMID
         */
        /**
         *  ----- END DEMOGRAPHICS SECTION VALIDATION ----- HAMID
         */
        /**
         *  ----- BEGINNING RASopathy History SECTION VALIDATION ----- ALENA
         */
        CommonUtils.clickOnElement(ras_survey_native_view.dynamicTabLocator("RASopathy History"));
        CommonUtils.verifyingDropDownValueIsSelected(ras_survey_native_view.dropdownDiagnosedWithRasopathyByPhysician,"No","No value is displayed for Diagnosed with a RASopathy by a physician through testing");
        /**
         *  ----- END RASopathy History SECTION VALIDATION ----- ALENA
         */
        /**
         *  ----- BEGINNING Birth and Gestation SECTION VALIDATION ----- ALENA
         */
        CommonUtils.clickOnElement(ras_survey_native_view.dynamicTabLocator("Birth & Gestation"));
        CommonUtils.verifyingDropDownValueIsSelected(ras_survey_native_view.dropdownDiagnosedWithHypoglycemiaDuringNewbornPeriod,"No","No value is displayed for Diagnosed with hypoglycemia during the newborn period dropdown");
        CommonUtils.verifyingDropDownValueIsSelected(ras_survey_native_view.dropdownWereMedicationsTakenWhileMotherWasPregnant,"No"," No value is displayed for Were medications taken while biological mother was pregnant with the participant dropdown");
        CommonUtils.verifyingDropDownValueIsSelected(ras_survey_native_view.dropdownWereVapingProductsUsedDuringPregnancy,"No","No value is displayed for Were vaping products use by participants bio mom during pregnancy dropdown");
        CommonUtils.verifyingDropDownValueIsSelected(ras_survey_native_view.dropdownDidBioMotherUsedRecreationalDrugsDuringPregnancy,"No","No value is displayed for Did participants bio mother use recreational drugs during pregnancy dropdown");
        CommonUtils.assertEqualsWithMessage(ras_survey_native_view.fieldBiologicalMothersOccupationWhilePregnant.getText(), "Nurse", "Nurse value is displayed for Biological mothers occupation while pregnant with the participant field");
        CommonUtils.assertEqualsWithMessage(ras_survey_native_view.checkboxBiologicalMothersOccupationUnknown.getAttribute("value"), "false", "Biological mothers occupation unknown checkbox is unchecked");
        CommonUtils.verifyingDropDownValueIsSelected(ras_survey_native_view.dropdownDidBioMotherReceivePrenatalTests,"Yes","Yes value is displayed for Did biological mother receive prenatal tests for birth defects/medical problems dropdown");
        CommonUtils.verifyingDropDownValueIsSelected(ras_survey_native_view.dropdownDidBioMotherUseTobacco,"Yes","Yes value is displayed for Did participants biological mother use tobacco products while pregnant dropdown");
        CommonUtils.verifyingDropDownValueIsSelected(ras_survey_native_view.dropdownDidBioMotherUseAlcohol,"Yes","Yes value is displayed for Did participants biological mother drink alcohol while pregnant with participant dropdown");
        CommonUtils.verifyingDropDownValueIsSelected(ras_survey_native_view.dropdownDidBioMotherEverLiveWorkWhereOtherUseTobacco,"Yes","Yes value is displayed for Did the participants mother ever live/work in a place where others use tobacco dropdown");
        CommonUtils.assertEqualsWithMessage(ras_survey_native_view.fieldBioFatherOccupationWhileMotherWasPregnant.getText(), "", "No value is displayed for Biological mothers occupation while pregnant with the participant field");
        CommonUtils.assertEqualsWithMessage(ras_survey_native_view.checkboxBiologicalFathersOccupationUnknown.getAttribute("value"), "false", "Biological fathers occupation unknown checkbox is unchecked");
        /** ----- END Birth and Gestation SECTION VALIDATION ----- ALENA
        /**
         *  ----- BEGINNING GROWTH SECTION VALIDATION ----- DIEGO
         */
        /**  ----- END GROWTH SECTION VALIDATION ----- DIEGO**/
    }
}