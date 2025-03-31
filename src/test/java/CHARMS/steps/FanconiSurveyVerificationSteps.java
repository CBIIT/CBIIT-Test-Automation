package CHARMS.steps;

import APPS_COMMON.PlaywrightUtils.Playwright_ServiceNow_Common_Methods;
import CHARMS.playwright.pages.fanconiStudy.FanconiSurveyPage;
import com.microsoft.playwright.FrameLocator;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.PlaywrightUtils;
import io.cucumber.java.en.Then;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import static com.nci.automation.web.PlaywrightUtils.page;

public class FanconiSurveyVerificationSteps {

    /**
     * Verifies FA Survey data in Native View
     */
    @Then("Study Team member verifies FA Survey data in Native View")
    public void study_team_member_verifies_fa_survey_data_in_native_view() {
        Playwright_ServiceNow_Common_Methods.side_Door_Test_Account_Login();
        var page = PlaywrightUtils.page;
        page.getByPlaceholder("Filter").click();
        page.getByPlaceholder("Filter").fill("All participant Details");
        CommonUtils.sleep(300);
        page.getByText("All Results").click();
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("All Participant Details 1 of 1").setExact(true)).click();
        CommonUtils.sleep(300);
        page.frameLocator("iframe[name=\"gsft_main\"]").getByLabel("Search column: name").click();
        page.frameLocator("iframe[name=\"gsft_main\"]").getByLabel("Search column: name").fill(FanconiSurveyPage.PARTICIPANT_FIRST_NAME + " " + FanconiSurveyPage.PARTICIPANT_LAST_NAME);
        page.frameLocator("iframe[name=\"gsft_main\"]").getByLabel("Search column: name").press("Enter");
        CommonUtils.sleep(300);
        page.frameLocator("iframe[name=\"gsft_main\"]").getByLabel("Preview record:").click();
        CommonUtils.sleep(300);
        page.frameLocator("iframe[name=\"gsft_main\"]").getByRole(AriaRole.LINK, new FrameLocator.GetByRoleOptions().setName("Open Record").setExact(true)).click();
        CommonUtils.sleep(1000);
        assertThat(page.frameLocator("iframe[name=\"gsft_main\"]").locator("[id=\"label\\.x_naci_family_coho_family_history_details\\.name\"]")).containsText("Name");
        page.locator("iframe[name=\"gsft_main\"]").contentFrame().locator("#tabs2_list").getByText("Study Surveys (1)").click();
        page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Open record: STU0001063").click();
        CommonUtils.sleep(2000);
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Study", new FrameLocator.GetByLabelOptions().setExact(true))).isVisible();
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Study", new FrameLocator.GetByLabelOptions().setExact(true))).hasValue("Fanconi");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("First Name")).hasValue(FanconiSurveyPage.PARTICIPANT_FIRST_NAME);
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Middle Name")).hasValue(FanconiSurveyPage.PARTICIPANT_MIDDLE_INITIAL);
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Last Name")).hasValue(FanconiSurveyPage.PARTICIPANT_LAST_NAME);
        assertFASurveyBackgroundInformationTab();
        assertFASurveyDemographicsTab();
        assertFASurveyMedicalHistoryTab();
        assertFASurveyMedicalHistoryContinuedTab();
        assertFASurveyReproductiveHistoryTab();
        assertFASurveySurgicalMedicationAndOtherMedicalTab();
        assertFASurveySexualHistoryTab();
        assertFASurveyAdditionalInformationTab();
    }

    /**
     * Verifies the "Background Information" tab on the FA Survey page within participant record in Native View.
     * This method performs various validations by checking the values and text contents of specific elements on the page.
     */
    public void assertFASurveyBackgroundInformationTab() {
        page.locator("iframe[name=\"gsft_main\"]").contentFrame().locator("#tabs2_section").getByText("Background Information").click();
        CommonUtils.sleep(300);
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Affected Family Member Count")).hasValue("1");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().locator("[id=\"x_naci_family_coho_fa_survey\\.affected_family_members_nonedit\"]")).containsText("Other relative (please specify)");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Other Affected Family Members")).hasValue(FanconiSurveyPage.OTHER_RELATIVE_PLEASE_SPECIFY_ENTERED);
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Ever included in publication?")).containsText("-- None --YesNoUnknown/Unsure");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Ever included in publication?")).hasValue("yes");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Additional information on")).hasValue(FanconiSurveyPage.PLEASE_PROVIDE_ANY_ADDITIONAL_DETAILS);
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Ever attended FA Family Camp?")).containsText("-- None --YesNo");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Ever attended FA Family Camp?")).hasValue("Yes");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Number of attended FA Family")).containsText("-- None --12345678910Unknown/Unsure");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Number of attended FA Family")).hasValue("1");
    }

    /**
     * Verifies the "Demographics" tab on the FA Survey page within participant record in Native View.
     * This method performs various validations by checking the values and text contents of specific elements on the page.
     */
    public void assertFASurveyDemographicsTab() {
        page.locator("iframe[name=\"gsft_main\"]").contentFrame().locator("#tabs2_section").getByText("Demographics").click();
        CommonUtils.sleep(300);
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().locator("[id=\"x_naci_family_coho_fa_survey\\.ethnicity_mother_nonedit\"]")).containsText(FanconiSurveyPage.MOTHER_ETHNICITY_ENTERED);
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().locator("[id=\"x_naci_family_coho_fa_survey\\.race_mother_nonedit\"]")).containsText(FanconiSurveyPage.MOTHERS_RACE_ENTERED);
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Mother's Race Other")).isEmpty();
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().locator("[id=\"x_naci_family_coho_fa_survey\\.ethnicity_father_nonedit\"]")).containsText(FanconiSurveyPage.FATHER_ETHNICITY_ENTERED);
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().locator("[id=\"x_naci_family_coho_fa_survey\\.race_father_nonedit\"]")).containsText(FanconiSurveyPage.FATHERS_RACE_ENTERED);
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Father's Race Other")).isEmpty();
    }

    /**
     * Verifies the "Medical History" tab on the FA Survey page within participant record in Native View.
     * This method performs various validations by checking the values and text contents of specific elements on the page.
     */
    public void assertFASurveyMedicalHistoryTab() {
        page.locator("iframe[name=\"gsft_main\"]").contentFrame().locator("#tabs2_section").getByText("Medical History", new Locator.GetByTextOptions().setExact(true)).click();
        CommonUtils.sleep(300);
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Mother had prenatal tests")).hasValue("yes");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().locator("[id=\"x_naci_family_coho_fa_survey\\.medical_history\\.mother_prenatal_test_results_nonedit\"]")).containsText(FanconiSurveyPage.FA_PRENATAL_TEST_ENTERED);
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Mother's Prenatal Test Result Other")).isEmpty();
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().locator("[id=\"x_naci_family_coho_fa_survey\\.medical_history\\.mother_pregnancy_complications_nonedit\"]")).containsText("My biological mother had no complications");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Mothers Pregnancy")).isEmpty();
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Mother's Pregnancy Complication Other")).isEmpty();
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Mother Taken Pregnancy")).containsText("-- None --YesNoUnknown/Unsure");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Mother Taken Pregnancy")).hasValue("yes");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().locator("[id=\"x_naci_family_coho_fa_survey\\.medical_history\\.mother_pregnancy_medications_nonedit\"]")).containsText(FanconiSurveyPage.ANTIBIOTICS);
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Mother's Pregnancy Medication Other")).isEmpty();
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Mother's Pregnancy Length in")).containsText("-- None --20212223242526272829303132333435363738394041424344Unknown/Unsure");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Mother's Pregnancy Length in")).hasValue(FanconiSurveyPage.FA_MOTHER_PREGNANCY_LENGTH_IN_WEEKS_ENTERED);
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Mother's Labor Induced")).containsText("-- None --YesNoUnknown/Unsure");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Mother's Labor Induced")).hasValue("yes");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Mother Deliver By")).containsText("-- None --Vaginal deliveryVaginal delivery with forceps or suctionCesarean SectionUnknown/Unsure");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Mother Deliver By")).hasValue("1");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Other cesarean section reason")).isEmpty();
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().locator("[id=\"x_naci_family_coho_fa_survey\\.medical_history\\.medical_complication_at_birth_nonedit\"]")).containsText("Birth defects (congenital abnormalities)");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Medical complication at birth other")).isEmpty();
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Hospital stay required at")).containsText("-- None --YesNoUnknown/Unsure");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Hospital stay required at")).hasValue("yes");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Hospital Stay Length At Birth", new FrameLocator.GetByLabelOptions().setExact(true))).hasValue("1");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Hospital Stay Length At Birth Unit")).containsText("-- None --DaysWeeksMonths");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Hospital Stay Length At Birth Unit")).hasValue("days");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Development delayed?")).containsText("-- None --YesNoUnknown/Unsure");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Development delayed?")).hasValue("yes");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Ever told cognitive or")).containsText("-- None --YesNoUnknown/Unsure");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Ever told cognitive or")).hasValue("yes");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Occupational/Physical therapy")).containsText("-- None --YesNoUnknown/Unsure");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Occupational/Physical therapy")).hasValue("yes");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Speech therapy received?")).containsText("-- None --YesNoUnknown/Unsure");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Speech therapy received?")).hasValue("yes");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("IEP or 504 Plan Received?")).containsText("-- None --YesNoUnknown/Unsure");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("IEP or 504 Plan Received?")).hasValue("yes");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().locator("[id=\"x_naci_family_coho_fa_survey\\.medical_history\\.illness_nonedit\"]")).containsText(FanconiSurveyPage.FA_NAME_OF_ILLNESS_ENTERED);
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("Other illness"))).isEmpty();
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().locator("[id=\"x_naci_family_coho_fa_survey\\.medical_history\\.immunizations_nonedit\"]")).containsText(FanconiSurveyPage.FA_NAME_OF_IMMUNIZATION_VACCINATION_ENTERED);
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Other Immunization")).isEmpty();
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Has Allergy")).containsText("-- None --YesNoUnknown/Unsure");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().locator("[id=\"x_naci_family_coho_fa_survey\\.medical_history\\.allergy_details_nonedit\"]")).containsText(FanconiSurveyPage.FOOD_ITEM_ENTERED);
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().locator("[id=\"x_naci_family_coho_fa_survey\\.medical_history\\.first_signs_of_fanconi_amenia_nonedit\"]")).containsText(FanconiSurveyPage.BIRTH_DEFECTS);
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("First Signs of Fanconi Anemia Other")).isEmpty();
    }

    /**
     * Verifies the "Medical History Continued" tab on the FA Survey page within participant record in Native View.
     * This method performs various validations by checking the values and text contents of specific elements on the page.
     */
    public void assertFASurveyMedicalHistoryContinuedTab() {
        page.locator("iframe[name=\"gsft_main\"]").contentFrame().locator("#tabs2_section").getByText("Medical History Continued").click();
        CommonUtils.sleep(300);
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Immunodeficiency Ever")).containsText("-- None --YesNoUnknown/Unsure");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Immunodeficiency Ever")).hasValue("yes");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().locator("[id=\"x_naci_family_coho_fa_survey\\.medical_history\\.immunodeficiency_nonedit\"]")).containsText("Low immunoglobulins");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Immunodeficiency Other")).isEmpty();
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Infections Recurrent?")).containsText("-- None --YesNoUnknown/Unsure");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Infections Recurrent?")).hasValue("yes");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Antibiotics Taken?")).containsText("-- None --YesNoUnknown/Unsure");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Antibiotics Taken?")).hasValue("yes");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().locator("[id=\"x_naci_family_coho_fa_survey\\.medical_history\\.antibiotic_details_nonedit\"]")).containsText("Test Antibiotics");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("RBC transfusion received?")).containsText("-- None --YesNoUnknown/Unsure");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("RBC transfusion received?")).hasValue("yes");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Platelet transfusion received?")).containsText("-- None --YesNoUnknown/Unsure");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Platelet transfusion received?")).hasValue("yes");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().locator("[id=\"x_naci_family_coho_fa_survey\\.medical_history\\.transfusion_details_nonedit\"]")).containsText("Red Cells (PRBCs)");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Bone Marrow Failure treatment")).containsText("-- None --YesNoUnknown/Unsure");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Bone Marrow Failure treatment")).hasValue("yes");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().locator("[id=\"x_naci_family_coho_fa_survey\\.medical_history\\.bmf_medications_nonedit\"]")).containsText("Androgen (Specify name or names if more than one androgen)");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().locator("[id=\"x_naci_family_coho_fa_survey\\.medical_history\\.blood_or_bone_marrow_conditions_nonedit\"]")).containsText("Abnormal chromosome clone(s) in bone marrow. Describe clone");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Transplant Received?", new FrameLocator.GetByLabelOptions().setExact(true))).containsText("-- None --YesNoUnknown/Unsure");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Transplant Received?", new FrameLocator.GetByLabelOptions().setExact(true))).hasValue("yes");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Transplant Chemo Agent")).hasValue("Test Chemotherapy agents ");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Transplant Radiation Received?")).containsText("-- None --YesNoUnknown/Unsure");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Transplant Radiation Received?")).hasValue("yes");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Acute GvHD Developed?")).containsText("-- None --YesNoUnknown/Unsure");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Acute GvHD Developed?")).hasValue("yes");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Chronic GvHD Developed?")).containsText("-- None --YesNoUnknown/Unsure");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Chronic GvHD Developed?")).hasValue("yes");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("GvHD Treatment", new FrameLocator.GetByLabelOptions().setExact(true))).hasValue("Test");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("GvHD Treatment Length", new FrameLocator.GetByLabelOptions().setExact(true))).hasValue("101");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("GvHD Treatment Length In")).containsText("-- None --DaysWeeksMonthsYears");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("GvHD Treatment Length In")).hasValue("days");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("GvHD Treatment Ongoing")).containsText("-- None --YesNoUnknown/Unsure");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("GvHD Treatment Ongoing")).hasValue("yes");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("FA gene therapy received?")).containsText("-- None --YesNoUnknown/Unsure");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("FA gene therapy received?")).hasValue("yes");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Regular Dental Care Received?")).containsText("-- None --YesNoUnknown/Unsure");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Regular Dental Care Received?")).hasValue("yes");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Regular Dental Care Frequency", new FrameLocator.GetByLabelOptions().setExact(true))).hasValue("20");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Regular Dental Care Frequency In")).containsText("-- None --WeeksMonthsYears");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Regular Dental Care Frequency In")).hasValue("weeks");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Last Dental Visit", new FrameLocator.GetByLabelOptions().setExact(true))).hasValue("Dental");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Periodontal or gum disease?")).containsText("-- None --YesNoUnknown/Unsure");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Periodontal or gum disease?")).hasValue("yes");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Dental Hygiene Rating")).containsText("-- None --ExcellentVery GoodGoodFairPoorUnknown/Unsure");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Dental Hygiene Rating")).hasValue("1");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Had orthodontic treatment?")).containsText("-- None --YesNoUnknown/Unsure");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Had orthodontic treatment?")).hasValue("yes");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Had palatal expansion?")).containsText("-- None --YesNoUnknown/Unsure");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Had palatal expansion?")).hasValue("yes");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Had any mouth sores?")).containsText("-- None --YesNoUnknown/Unsure");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Had any mouth sores?")).hasValue("yes");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Had oral lesion?")).containsText("-- None --YesNoUnknown/Unsure");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Had oral lesion?")).hasValue("yes");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("ENT consulted for oral lesion")).containsText("-- None --YesNoUnknown/Unsure");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("ENT consulted for oral lesion")).hasValue("yes");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Biopsy performed for oral")).containsText("-- None --YesNo");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Biopsy performed for oral")).hasValue("yes");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().locator("[id=\"x_naci_family_coho_fa_survey\\.medical_history\\.oral_lesion_diagnosis_nonedit\"]")).containsText("Bacterial Infection");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Oral Lesion diagnosis other")).isEmpty();
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().locator("[id=\"x_naci_family_coho_fa_survey\\.medical_history\\.oral_lesion_sites_nonedit\"]")).containsText("Hard palate");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Oral lesion had brush biopsy?")).containsText("-- None --YesNoDon't know");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Oral lesion had brush biopsy?")).hasValue("yes");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Oral lesion treatment received?")).containsText("-- None --YesNoUnknown/Unsure");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Oral lesion treatment received?")).hasValue("yes");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Oral lesion treatment type")).hasValue("Test Treatment");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("G or GJ tube used?")).containsText("-- None --YesNoUnknown/Unsure");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("G or GJ tube used?")).hasValue("yes");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("G or GJ tube current?")).containsText("-- None --YesNoUnknown/Unsure");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("G or GJ tube current?")).hasValue("yes");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Taking heartburn or reflux")).containsText("-- None --YesNoUnknown/Unsure");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Taking heartburn or reflux")).hasValue("yes");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Heartburn/Reflux Medication(s)")).hasValue("Test medication");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Ever Seen GI Specialist?")).containsText("-- None --YesNoUnknown/Unsure");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Ever Seen GI Specialist?")).hasValue("yes");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Ever had GI procedures?")).containsText("-- None --YesNoUnknown/Unsure");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Ever had GI procedures?")).hasValue("yes");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Endocrine disorder diagnosed?")).containsText("-- None --YesNoUnknown/Unsure");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Endocrine disorder diagnosed?")).hasValue("yes");
    }

    /**
     * Verifies the "Reproductive History" tab on the FA Survey page within participant record in Native View.
     * This method performs various validations by checking the values and text contents of specific elements on the page.
     */
    public void assertFASurveyReproductiveHistoryTab() {
        page.locator("iframe[name=\"gsft_main\"]").contentFrame().locator("#tabs2_section").getByText("Reproductive History").click();
        CommonUtils.sleep(300);
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Sex", new FrameLocator.GetByLabelOptions().setExact(true))).hasValue("Female");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Non standard sex diagnosed?")).containsText("-- None --YesNoPrefer not to answerUnknown/Unsure");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Non standard sex diagnosed?")).hasValue("yes");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Experienced delayed puberty?")).containsText("-- None --Did not experience any delayMild delay, less than two yearsSignificant delay, more than two yearsNot applicable, has not reached age of pubertyUnknown/Unsure");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Experienced delayed puberty?")).hasValue("1");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Undescended testes (cryptorchidism) diagnosed?")).containsText("-- None --YesNoNot applicableUnknown/Unsure");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Undescended testes (cryptorchidism) diagnosed?")).hasValue("yes");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Undescended testes (cryptorchidism) treatment")).containsText("-- None --Hormonal treatmentSurgical treatmentUntreated, still presentNot applicable, resolved on its ownUnknown/Unsure");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Undescended testes (cryptorchidism) treatment")).hasValue("1");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Period/Menstruation issues")).hasValue("Amenorrhea (absence of menstrual periods)");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Period/Menstruation issue other")).isEmpty();
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Experienced fertility")).containsText("-- None --YesNoNot applicableUnknown/Unsure");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Experienced fertility")).hasValue("yes");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Fertility problems", new FrameLocator.GetByLabelOptions().setExact(true))).containsText("-- None --Unable to conceive (or partner unable to conceive)Miscarriage (or partner has history of miscarriages)Not ApplicableUnknown/Unsure");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Fertility problems", new FrameLocator.GetByLabelOptions().setExact(true))).hasValue("1");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Ever had Pap smear?")).containsText("-- None --YesNoNot ApplicableUnknown/Unsure");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("First Pap smear age")).hasValue("100");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Ever had abnormal Pap smear?")).containsText("-- None --YesNoNot applicableUnknown/Unsure");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Ever had abnormal Pap smear?")).hasValue("yes");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("First abnormal Pap smear age")).hasValue("101");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Most recent abnormal Pap smear diagnosis")).containsText("-- None --Vaginal infection or inflammationGenital wartsCervical pre-cancerCancerOther (please specify)Unknown/Unsure");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Most recent abnormal Pap smear diagnosis")).hasValue("1");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Most recent Pap smear")).isEmpty();
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().locator("[id=\"x_naci_family_coho_fa_survey\\.reproductive_history\\.abnormal_pap_smear_treatments_nonedit\"]")).containsText("Burning, Cone, Freezing, Laser, LEEP");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Most recent abnormal pap smear treatments other")).isEmpty();
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("HPV tested with Pap smear?")).containsText("-- None --YesNoUnknown/Unsure");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("HPV tested with Pap smear?")).hasValue("yes");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("High-risk HPV detected on")).containsText("-- None --YesNoUnknown/Unsure");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("High-risk HPV detected on")).hasValue("yes");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Ever had colposcopy procedure")).containsText("-- None --YesNoUnknown/Unsure");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Ever had colposcopy procedure")).hasValue("yes");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Ever experienced uterine")).containsText("-- None --YesNoNot ApplicableUnknown/Unsure");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Ever experienced uterine")).hasValue("yes");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Report uterine bleeding date")).containsText("-- None --DateAgeUnknown/Unsure");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Report uterine bleeding date")).hasValue("date");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Uterine bleeding age")).isEmpty();
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Uterine bleeding month")).hasValue("July");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Uterine bleeding year")).hasValue("1955");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().locator("[id=\"x_naci_family_coho_fa_survey\\.reproductive_history\\.uterine_bleeding_treatments_nonedit\"]")).containsText("Androgens");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Uterine bleeding treatment other")).isEmpty();
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Ever been pregnant")).containsText("-- None --YesNoUnknown/Unsure");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Ever been pregnant")).hasValue("yes");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Breastfeed children")).containsText("-- None --YesNoNot applicableUnknown/Unsure");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Breastfeed children")).hasValue("yes");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Breastfeeding length in months")).hasValue("103");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Ever had hysterectomy")).containsText("-- None --YesNoNot ApplicableUnknown/Unsure");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Ever had hysterectomy")).hasValue("yes");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().locator("[id=\"x_naci_family_coho_fa_survey\\.reproductive_history\\.hysterectomy_reasons_nonedit\"]")).containsText("Bleeding (not vaginal)");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Hysterectomy reason other")).isEmpty();
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Hysterectomy age")).hasValue("103");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Ovary(ies) removed?")).containsText("-- None --YesNoNot applicableUnknown/Unsure");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Ovary(ies) removed?")).hasValue("yes");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Ovary removal type")).containsText("-- None --One ovaryBoth ovariesUnknown/Unsure");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Ovary removal type")).hasValue("1");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Ovary removal reason", new FrameLocator.GetByLabelOptions().setExact(true))).containsText("-- None --CystsOvarian tumorAs part of hysterectomyCancer prevention/ProphylaxisOther (please specify)Unknown/Unsure");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Ovary removal reason", new FrameLocator.GetByLabelOptions().setExact(true))).hasValue("1");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Ovary removal reason other")).isEmpty();
    }

    /**
     * Verifies the "Surgical, Medication, and other Medical" tab on the FA Survey page within participant record in Native View.
     * This method performs various validations by checking the values and text contents of specific elements on the page.
     */
    public void assertFASurveySurgicalMedicationAndOtherMedicalTab() {
        page.locator("iframe[name=\"gsft_main\"]").contentFrame().locator("#tabs2_section").getByText("Surgical, Medication, and").click();
        CommonUtils.sleep(300);
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Undocumented operation or")).containsText("-- None --YesNoUnknown/Unsure");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Undocumented operation or")).hasValue("yes");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Ever been hospitalized for")).containsText("-- None --YesNoUnknown/Unsure");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Ever been hospitalized for")).hasValue("yes");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Ever diagnosed with cancer?")).containsText("-- None --YesNoUnknown/Unsure");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Ever diagnosed with cancer?")).hasValue("yes");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Taking any vitamins, minerals")).containsText("-- None --YesNoUnknown/Unsure");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Taking any vitamins, minerals")).hasValue("yes");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().locator("[id=\"x_naci_family_coho_fa_survey\\.surgical_and_medication_history\\.conditions_skin_nonedit\"]")).containsText("Dark spots (Cafe-au-lait spots) Indicate number");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Conditions - Skin other")).isEmpty();
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().locator("[id=\"x_naci_family_coho_fa_survey\\.surgical_and_medication_history\\.conditions_head_face_mouth_nonedit\"]")).containsText("Cleft lip");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Conditions - Head, face, mouth other")).isEmpty();
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().locator("[id=\"x_naci_family_coho_fa_survey\\.surgical_and_medication_history\\.conditions_teeth_gums_nonedit\"]")).containsText("Early loss of permanent teeth");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Conditions - Teeth and gums other")).isEmpty();
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().locator("[id=\"x_naci_family_coho_fa_survey\\.surgical_and_medication_history\\.conditions_ears_nonedit\"]")).containsText("Abnormal shape - Left ear");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Conditions - Ears other")).isEmpty();
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().locator("[id=\"x_naci_family_coho_fa_survey\\.surgical_and_medication_history\\.conditions_eyes_nonedit\"]")).containsText("Cataracts (acquired)");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Conditions - Eyes other")).isEmpty();
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().locator("[id=\"x_naci_family_coho_fa_survey\\.surgical_and_medication_history\\.conditions_nose_nonedit\"]")).containsText("Flat nasal bridge");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Conditions - Nose other")).isEmpty();
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().locator("[id=\"x_naci_family_coho_fa_survey\\.surgical_and_medication_history\\.conditions_neck_nonedit\"]")).containsText("Congenital elevation of the shoulders (Sprengel's deformity)");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Conditions - Neck other")).isEmpty();
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().locator("[id=\"x_naci_family_coho_fa_survey\\.surgical_and_medication_history\\.conditions_thumbs_nonedit\"]")).containsText("Absent - Left hand");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Conditions - Thumbs other")).isEmpty();
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().locator("[id=\"x_naci_family_coho_fa_survey\\.surgical_and_medication_history\\.conditions_fingers_nonedit\"]")).containsText("Extra finger - Left hand");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Conditions - Fingers other")).isEmpty();
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().locator("[id=\"x_naci_family_coho_fa_survey\\.surgical_and_medication_history\\.conditions_lower_arm_bones_nonedit\"]")).containsText("Absent or weak radial pulse");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Forearm - Radii and ulnae (lower arm bones) other")).isEmpty();
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().locator("[id=\"x_naci_family_coho_fa_survey\\.surgical_and_medication_history\\.conditions_upper_arm_bones_nonedit\"]")).containsText("Absent humerus");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Forearms - Humeri (upper arm bones) other")).isEmpty();
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().locator("[id=\"x_naci_family_coho_fa_survey\\.surgical_and_medication_history\\.conditions_heart_and_lungs_nonedit\"]")).containsText("Asthma");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Conditions - Heart and lungs other")).isEmpty();
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().locator("[id=\"x_naci_family_coho_fa_survey\\.surgical_and_medication_history\\.conditions_genitalia_male_nonedit\"]")).containsText("Abnormal placement of opening for urine (Hypospadias)");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Conditions - Genitalia (Male) other")).isEmpty();
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().locator("[id=\"x_naci_family_coho_fa_survey\\.surgical_and_medication_history\\.condition_genitalia_female_nonedit\"]")).containsText("Abnormal ovaries (Indicate right or left if applicable)");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Condition - Genitalia (Female) other")).isEmpty();
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().locator("[id=\"x_naci_family_coho_fa_survey\\.surgical_and_medication_history\\.conditions_kidneys_nonedit\"]")).containsText("Decreased function");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Conditions - Kidneys other")).isEmpty();
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().locator("[id=\"x_naci_family_coho_fa_survey\\.surgical_and_medication_history\\.conditions_gastrointestinal_nonedit\"]")).containsText("Absent spleen");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Conditions - Gastrointestinal other")).isEmpty();
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().locator("[id=\"x_naci_family_coho_fa_survey\\.surgical_and_medication_history\\.conditions_lower_limbs_nonedit\"]")).containsText("Abnormal knees - Left leg");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Conditions - Lower limbs other")).isEmpty();
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().locator("[id=\"x_naci_family_coho_fa_survey\\.surgical_and_medication_history\\.conditions_skeletal_nonedit\"]")).containsText("Kyphoscoliosis");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Conditions - Skeletal other")).isEmpty();
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Diagnosed with VATER syndrome?")).containsText("-- None --YesNoUnknown/Unsure");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Diagnosed with VATER syndrome?")).hasValue("yes");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().locator("[id=\"x_naci_family_coho_fa_survey\\.surgical_and_medication_history\\.neurological_abnormality_mental_health_nonedit\"]")).containsText("Absent or underdeveloped corpus callosum");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Conditions - Mental Health")).isEmpty();
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Conditions - Neurological")).isEmpty();
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Diagnosed with Fanconi Anemia")).containsText("-- None --YesNoUnknown/Unsure");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Diagnosed with Fanconi Anemia")).hasValue("yes");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("FANS Report Date or Age")).containsText("-- None --AgeDateUnknown/Unsure");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("FANS Report Date or Age")).hasValue("age");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("FANS diagnosis age")).hasValue("102");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("FANS diagnosis date")).isEmpty();
    }

    /**
     * Verifies the "Sexual History" tab on the FA Survey page within participant record in Native View.
     * This method performs various validations by checking the values and text contents of specific elements on the page.
     */
    public void assertFASurveySexualHistoryTab() {
        page.locator("iframe[name=\"gsft_main\"]").contentFrame().locator("#tabs2_section").getByText("Sexual History").click();
        CommonUtils.sleep(300);
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Age at first sexual")).hasValue("31");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Ever had sexual intercourse?")).containsText("-- None --YesNo");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Ever had sexual intercourse?")).hasValue("yes");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("How many different sexual")).containsText("-- None --1 to 23 to 56 to 910 or moreUnknown/Unsure");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("How many different sexual")).hasValue("1");
    }

    /**
     * Verifies the "Additional Information" tab on the FA Survey page within participant record in Native View.
     * This method performs various validations by checking the values and text contents of specific elements on the page.
     */
    public void assertFASurveyAdditionalInformationTab() {
        page.locator("iframe[name=\"gsft_main\"]").contentFrame().locator("#tabs2_section").getByText("Additional Information").click();
        CommonUtils.sleep(300);
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Additional Information", new FrameLocator.GetByLabelOptions().setExact(true))).containsText("Fanconi SUrvey COmpleted");
    }
}