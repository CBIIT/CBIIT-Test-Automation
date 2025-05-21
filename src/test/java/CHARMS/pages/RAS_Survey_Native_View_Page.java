package CHARMS.pages;

import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.*;
import static APPS_COMMON.Pages.Selenium_Common_Locators.locateByXpath;

public class RAS_Survey_Native_View_Page {

    /*** STORE RAS SURVEY NATIVE VIEW ELEMENTS HERE*/

    /***************************************************************************
     *                                                                         *
     *                    BEGINNING OF Demographics SECTION                    *
     *                                                                         *
     ***************************************************************************/

    /**
     * Included in published case report or in a different public manner drop down
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.published_case']")
    public WebElement includedInPublishedCaseReportDropDown;

    /**
     * Included in published case report or in a different public manner drop down values
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.published_case']//option")
    public List<WebElement> includedInPublishedCaseReportDropDownValues;

    /**
     * Additional information about authors, publication year or PubMedID input field
     */
    @FindBy(xpath = "//textarea[@id='x_naci_family_coho_rasopathy_iiq.published_info']")
    public WebElement publishedCaseReportAdditionalInformationInputField;

    /**
     * Biological Mother Birth Location text field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_rasopathy_iiq.bio_mom_birth_location']")
    public WebElement biologicalMotherBirthLocation;

    /**
     * Biological Mother Birth Location Unknown checkbox
     */
    @FindBy(xpath = "//input[@name='ni.x_naci_family_coho_rasopathy_iiq.bio_mom_birth_location_unknown']")
    public WebElement biologicalMotherBirthLocationUnknown;

    /**
     * Biological Mothers Age At Birth text field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_rasopathy_iiq.bio_mom_age']")
    public WebElement biologicalMothersAgeAtBirth;

    /**
     * Biological Mothers Heigth (cm) number/digit field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_rasopathy_iiq.mom_height']")
    public WebElement biologicalMothersHeight;

    /**
     * Biological Mothers Heigth Unknown checkbox
     */
    @FindBy(xpath = "//input[@name='ni.x_naci_family_coho_rasopathy_iiq.bio_mom_height_unknown']")
    public WebElement biologicalMothersHeightUnknown;

    /**
     * Biological Father Birth Location text field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_rasopathy_iiq.bio_dad_birth_location']")
    public WebElement biologicalFatherBirthLocation;

    /**
     * Biological Father Birth Location Unknown checkbox
     */
    @FindBy(xpath = "//input[@name='ni.x_naci_family_coho_rasopathy_iiq.bio_dad_birth_location_unknown']")
    public WebElement biologicalFatherBirthLocationUnknown;

    /**
     * Biological Fathers Age At Birth text field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_rasopathy_iiq.bio_dad_age']")
    public WebElement biologicalFathersAgeAtBirth;

    /**
     * Biological Fathers Heigth (cm) number/digit field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_rasopathy_iiq.dad_height']")
    public WebElement biologicalFathersHeight;

    /**
     * Biological Father Heigth Unknown checkbox
     */
    @FindBy(xpath = "//input[@name='ni.x_naci_family_coho_rasopathy_iiq.bio_dad_height_unknown']")
    public WebElement biologicalFatherHeightUnknown;

    /**
     * Update Button on Demographics tab
     */
    @FindBy(xpath = "//button[@id='sysverb_update_bottom']")
    public WebElement updateButton;

    /**
     * Add Attachment Button on Demographics tab
     */
    @FindBy(xpath = "//button[@id='add_attachment_bottom']")
    public WebElement addAttachmentButton;

    /**
     * Insert Button on Demographics tab
     */
    @FindBy(xpath = "//button[@id='sysverb_insert_bottom']")
    public WebElement insertButton;

    /**
     * Insert And Stay Button on Demographics tab
     */
    @FindBy(xpath = "//button[@id='sysverb_insert_and_stay_bottom']")
    public WebElement insertAndStayButton;

    /**
     * Save Button on Demographics tab
     */
    @FindBy(xpath = "//button[@id='sysverb_update_and_stay_bottom']")
    public WebElement saveButtonDemographicsTab;

    /**
     * Insert And Stay Button on Demographics tab
     */
    @FindBy(xpath = "//button[@id='sysverb_delete_bottom']")
    public WebElement deleteButtonDemographicsTab;

    /** ------------------END OF Demographics SECTION--------------------- */

    /********************************************************************************
     *                                                                              *
     *                    BEGINNING OF RASopathy HISTORY SECTION                    *
     *                                                                              *
     *******************************************************************************/

    /**
     * Diagnosed with a RASopathy by a physician through testing dropdown
     **/
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.diagnosed_rasopathy']")
    public WebElement dropdownDiagnosedWithRasopathyByPhysician;

    /**
     * Diagnosed RASopathies list
     */
    @FindBy(xpath = "//p[@id='x_naci_family_coho_rasopathy_iiq.diagnosed_rasopathies_list_nonedit']")
    public WebElement diagnosedRasopathiesTextList;

    /**
     * Please specify other RASopathy input field
     */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_rasopathy_iiq.please_specify_other_rasopathy']")
    public WebElement specifyOtherRasopathyInputField;

    /** ---------------------END OF RASopathy History SECTION--------------------- */

    /****************************************************************************
     *                                                                          *
     *                  BEGINNING OF Birth & Gestation SECTION                  *
     *                                                                          *
     ****************************************************************************/

    /**
     * Diagnosed with hypoglycemia during the newborn period dropdown
     **/
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.hypoglycemia']")
    public WebElement dropdownDiagnosedWithHypoglycemiaDuringNewbornPeriod;

    /**
     * Issues identified in the participant prior to birth
     */
    @FindBy(xpath = "//p[@id='x_naci_family_coho_rasopathy_iiq.issues_prior_to_birth_nonedit']")
    public WebElement issuesPriorToBirthTextList;

    /**
     * Were medications taken while biological mother was pregnant with the participant dropdown
     **/
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.medications_while_pregnant']")
    public WebElement dropdownWereMedicationsTakenWhileMotherWasPregnant;

    /**
     * Were vaping products use by participants bio mom during pregnancy dropdown
     **/
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.were_vaping_products_used']")
    public WebElement dropdownWereVapingProductsUsedDuringPregnancy;

    /**
     * Vape products used
     */
    @FindBy(xpath = "//p[@id='x_naci_family_coho_rasopathy_iiq.vape_products_used_nonedit']")
    public WebElement vapingProductsTextList;

    /**
     * Please specify. Vape products
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_rasopathy_iiq.please_specify_vape_products']")
    public WebElement specifyVapeProductsInputField;

    /**
     * Did participants bio mother use recreational drugs during pregnancy dropdown
     **/
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.drugs_used_during_pregnancy']")
    public WebElement dropdownDidBioMotherUsedRecreationalDrugsDuringPregnancy;

    /**
     * Drugs used by biological mother during pregnancy
     */
    @FindBy(xpath = "//p[@id='x_naci_family_coho_rasopathy_iiq.drugs_used_nonedit']")
    public WebElement recreationalDrugsUsedWhilePregnantTextList;

    /**
     *
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_rasopathy_iiq.please_specify_drugs']")
    public WebElement specifyRecreationalDrugsUsedByMotherDuringPregnancyInputField;

    /**
     * Biological mothers occupation while pregnant with the participant field
     **/
    @FindBy(xpath = "//div//textarea[@id='x_naci_family_coho_rasopathy_iiq.occuption_while_pregnant']")
    public WebElement fieldBiologicalMothersOccupationWhilePregnant;

    /**
     * Biological mothers occupation while pregnant with the participant
     */
    @FindBy(xpath = "//textarea[@id='x_naci_family_coho_rasopathy_iiq.occuption_while_pregnant']")
    public WebElement biologicalMothersOccupationWhilePregnantTextArea;

    /**
     * Biological mothers occupation unknown checkbox
     **/
    @FindBy(xpath = "//input[@id='x_naci_family_coho_rasopathy_iiq.bio_mom_occupation_unknown']")
    public WebElement checkboxBiologicalMothersOccupationUnknown;

    /**
     * Biological father occupation unknown checkbox
     **/
    @FindBy(xpath = "//input[@id='x_naci_family_coho_rasopathy_iiq.bio_dad_occupation_unknown']")
    public WebElement checkboxBiologicalFathersOccupationUnknown;

    /**
     * Did biological mother receive prenatal tests for birth defects/medical problems dropdown
     **/
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.prenatal_testing']")
    public WebElement dropdownDidBioMotherReceivePrenatalTests;

    /**
     * Participant mother's birth complications text list
     */
    @FindBy(xpath = "//p[@id='x_naci_family_coho_rasopathy_iiq.birth_complications_nonedit']")
    public WebElement participantMotherBirthComplicationsTextList;

    /**
     * Infection (please specify) input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_rasopathy_iiq.infection_pregnancy_condition']")
    public WebElement infectionPregnancyConditionInputField;

    /**
     * Rash (please specify) input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_rasopathy_iiq.rash_pregnancy_condition']")
    public WebElement rashPregnancyConditionInputField;

    /**
     * Other complication input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_rasopathy_iiq.other_complication']")
    public WebElement otherComplicationInputField;

    /**
     * Did participants biological mother use tobacco products while pregnant dropdown
     **/
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.tobacco_used_while_pregnant_mom']")
    public WebElement dropdownDidBioMotherUseTobacco;

    /**
     * Tobacco products used by mother during pregnancy text list
     */
    @FindBy(xpath = "//p[@id='x_naci_family_coho_rasopathy_iiq.tobacco_products_used_by_mom_nonedit']")
    public WebElement tobaccoProductsUsedByMotherWhilePregnantTextList;

    /**
     * Please specify (Tobacco products used by mother during pregnancy) input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_rasopathy_iiq.please_specify_tobacco']")
    public WebElement specifyTobaccoUsedByMotherDuringPregnancyInputField;

    /**
     * Did participants biological mother drink alcohol while pregnant with participant dropdown
     **/
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.alcohol_while_pregnant']")
    public WebElement dropdownDidBioMotherUseAlcohol;

    /**
     * Alcohol used by mom during pregnancy text list
     */
    @FindBy(xpath = "//p[@id='x_naci_family_coho_rasopathy_iiq.alcohol_used_by_mom_during_pregnancy_nonedit']")
    public WebElement alcoholUsedByMotherWhilePregnantTextList;

    /**
     * Please specify (Alcohol used by mom during pregnancy)
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_rasopathy_iiq.please_specify_alcohol']")
    public WebElement specifyAlcoholUsedByMotherDuringPregnancyInputField;

    /**
     * Did the participants mother ever live/work in a place where others use tobacco dropdown
     **/
    @FindBy(xpath = "//select[@name='x_naci_family_coho_rasopathy_iiq.live_work_near_tobacco_usage']")
    public WebElement dropdownDidBioMotherEverLiveWorkWhereOtherUseTobacco;

    /**
     * Tobacco products used around mother during pregnancy text
     */
    @FindBy(xpath = "//p[@id='x_naci_family_coho_rasopathy_iiq.environmental_tobacco_types_nonedit']")
    public WebElement tobaccoProductsUsedAroundMotherWhilePregnantTextList;

    /**
     * Please specify (Tobacco products used around mother during pregnancy)
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_rasopathy_iiq.please_specify_tobacco_around']")
    public WebElement specifyTobaccoUsedAroundMotherDuringPregnancyInputField;

    /**
     * Biological fathers occupation while mother was pregnant with the participant field
     **/
    @FindBy(xpath = "//div//textarea[@id='x_naci_family_coho_rasopathy_iiq.fathers_occupation_while_pregnant']")
    public WebElement fieldBioFatherOccupationWhileMotherWasPregnant;

    /**
     * Biological father occupation unknown checkbox
     */
    @FindBy(xpath = "//input[@id='sys_original.x_naci_family_coho_rasopathy_iiq.bio_dad_occupation_unknown']")
    public WebElement biologicalFatherOccupationUnknownCheckbox;

    /** ---------------------END OF Birth & Gestation SECTION--------------------- */

    /*********************************************************************
     *                                                                   *
     *                    BEGINNING OF Growth SECTION                    *
     *                                                                   *
     *********************************************************************/

    /**
     * Has the participant had growth hormone testing dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.growth_hormone_testing']")
    public WebElement hasTheParticipantHadGrowthHormoneTestingDropdown;

    /**
     * Growth Hormone test results text list
     */
    @FindBy(xpath = "//p[@id='x_naci_family_coho_rasopathy_iiq.growth_hormone_test_results_nonedit']")
    public WebElement growthHormoneTestResultsTextList;

    /**
     * Please specify (Growth Hormone test results) dropdown
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_rasopathy_iiq.please_specify_growth_hormone']")
    public WebElement pleaseSpecifyGrowthHormoneTestResultsInputField;

    /**
     * Has the participant received growth hormone treatment? dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.growth_hormone_treatment']")
    public WebElement hasTheParticipantReceivedGrowthHormoneTreatmentDropdown;

    /**
     * Height before starting growth hormone input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_rasopathy_iiq.height_before_growth_hormone']")
    public WebElement heightBeforeStartingGrowthHormoneInputField;

    /**
     * Height before growth hormone unknown checkbox
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_rasopathy_iiq.height_before_hormone_growth_unknown']")
    public WebElement heightBeforeGrowthHormoneUnknownCheckbox;

    /**
     * How many times has the participant received growth hormone treatment dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.growth_hormone_count']")
    public WebElement howManyTimesHasTheParticipantReceivedGrowthHormoneTreatmentDropdown;

    /**
     * Has the participant ever been evaluated by an endocrinologist for any reason? dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.endocrinologist_evaluation']")
    public WebElement hasTheParticipantEverBeenEvaluatedByAnEndocrinologistForAnyReasonDropdown;

    /**
     * Doctor/medical provider name input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_rasopathy_iiq.endocrinologist_name']")
    public WebElement doctorMedicalProviderNameInputField;

    /**
     * Location (City, State, Country) input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_rasopathy_iiq.endocrinologist_location']")
    public WebElement locationCityStateCountryInputField;

    /**
     * Hospital or Health System Affiliation input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_rasopathy_iiq.hosptial_or_health_system_affiliation']")
    public WebElement hospitalOrHealthSystemAffiliationInputField;

    /** ---------------------END OF Growth SECTION--------------------- */

    /**************************************************************************
     *                                                                        *
     *                    BEGINNING OF Development SECTION                    *
     *                                                                        *
     **************************************************************************/

    /**
     * Was the participant diagnosed with hypotonia as an infant or child? dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.diagnosed_with_hypotonia']")
    public WebElement wasTheParticipantDiagnosedWithHypotoniaAsAnInfantOrChildDropdown;

    /**
     * Has the participant ever received physical therapy dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.physical_therapy']")
    public WebElement hasTheParticipantEverReceivedPhysicalTherapyDropdown;

    /**
     * How would you describe the participant's current speech capabilities? dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.speech_capabilities']")
    public WebElement howWouldYouDescribeTheParticipantCurrentSpeechCapabilitiesDropdown;

    /**
     * Has the participant ever received speech therapy? dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.speech_therapy']")
    public WebElement hasTheParticipantEverReceivedSpeechTherapyDropdown;

    /**
     * Did the participant receive occupation therapy between the ages of 3 & 6 dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.occupational_therapy']")
    public WebElement didTheParticipantReceiveOccupationTherapyBetweenTheAgesOf3And6Dropdown;

    /**
     * Current employment status dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.employment_status']")
    public WebElement currentEmploymentStatusDropdown;

    /**
     * Other employment status input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_rasopathy_iiq.other_employment_status']")
    public WebElement otherEmploymentStatusInputField;

    /**
     * Participants highest level of schooling dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.highest_level_of_schooling_ras']")
    public WebElement participantsHighestLevelOfSchoolingDropdown;

    /**
     * At what age was the participant able to sit without support
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.sit_without_support']")
    public WebElement atWhatAgeWasTheParticipantAbleToSitWithoutSupportDropdown;

    /**
     * At what age was the participant able to walk without support? dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.walk_without_support']")
    public WebElement atWhatAgeWasTheParticipantAbleToWalkWithoutSupportDropdown;

    /**
     * At what age was the participant able to use simple two-word phrases? dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.use_two_phrases']")
    public WebElement atWhatAgeWasTheParticipantAbleToUseSimpleTwoWordPhrasesDropdown;

    /**
     * Diagnosed with cognitive development issues between ages 3 & 6 dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.cognitive_development_issues']")
    public WebElement diagnosedWithCognitiveDevelopmentIssuesBetweenAges3And6Dropdown;

    /**
     * Schooling between the ages of 6 and 10 dropdown
     */
    @FindBy(css = "select[name='x_naci_family_coho_rasopathy_iiq.schooling_6_10']")
    public WebElement schoolingBetweenTheAgesOf6And10Dropdown;

    /**
     * Schooling age 10 to 17 dropdown
     */
    @FindBy(css = "select[id='x_naci_family_coho_rasopathy_iiq.schooling_10_17']")
    public WebElement schoolingAge10To17Dropdown;

    /**
     * Participants diagnosed learning differences text list
     */
    @FindBy(xpath = "//p[@id='x_naci_family_coho_rasopathy_iiq.learning_differences_nonedit']")
    public WebElement participantsDiagnosedLearningDifferencesTextList;

    /**
     * Please specify(Participants diagnosed learning differences) input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_rasopathy_iiq.please_specify_learning_diff']")
    public WebElement pleaseSpecifyParticipantsDiagnosedLearningDifferencesInputField;

    /** ---------------------END OF Development SECTION--------------------- */

    /********************************************************************
     *                                                                  *
     *                    BEGINNING OF Heart SECTION                    *
     *                                                                  *
     ********************************************************************/

    /**
     * Has the participant been evaluated by a cardiologist? dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.evaluated_by_cardiologist']")
    public WebElement hasTheParticipantBeenEvaluatedByACardiologistDropdown;

    /**
     * Name of cardiologist input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_rasopathy_iiq.cardiologist_name']")
    public WebElement nameOfCardiologistInputField;

    /**
     * Location (City, State, Country) input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_rasopathy_iiq.cardiologist_location']")
    public WebElement locationOfCardiologistInputField;

    /**
     * Hospital or Health Center Affiliation input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_rasopathy_iiq.cardiologist_affiliation']")
    public WebElement getHospitalOrHealthSystemAffiliationInputFieldInputField;

    /**
     * Has the participant received treatment for heart problems? dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.heart_treatment_received']")
    public WebElement hasTheParticipantReceivedHeartTreatmentDropdown;

    /**
     * Has the participant been diagnosed with a functional heart issue? dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.functional_heart_issue']")
    public WebElement hasTheParticipantBeenDiagnosedWithAFunctionalHeartIssueDropdown;

    /**
     * Has the participant been diagnosed with  structural heart issues? dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.heart_disease']")
    public WebElement hasTheParticipantBeenDiagnosedWithAStructuralHeartIssueDropdown;

    /**
     * Participants diagnosed structural heart issues text list
     */
    @FindBy(xpath = "//p[@id='x_naci_family_coho_rasopathy_iiq.heart_issues_nonedit']")
    public WebElement participantsDiagnosedStructuralHeartIssuesText;

    /**
     * Please specify(Heart issues) input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_rasopathy_iiq.please_specify_heart_issues']")
    public WebElement pleaseSpecifyOtherHeartIssuesInputField;

    /** ---------------------END OF Heart SECTION--------------------- */

    /******************************************************************************
     *                                                                            *
     *                    BEGINNING OF Medical History SECTION                    *
     *                                                                            *
     ******************************************************************************/

    /**
     * Does the participant have a primary care provider? dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.primary_care']")
    public WebElement doesTheParticipantHaveAPrimaryCareProviderDropdown;

    /**
     * Name of primary care provider input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_rasopathy_iiq.pcp_name']")
    public WebElement nameOfPrimaryCareProviderInputField;

    /**
     * Location of primary care provider input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_rasopathy_iiq.pcp_location']")
    public WebElement locationOfPrimaryCareProviderInputField;

    /**
     * Primary Care Provider Affiliation input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_rasopathy_iiq.pcp_affiliation']")
    public WebElement primaryCareProviderAffiliationInputField;

    /**
     * Has the participant ever had a biopsy? dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.participant_biopsy']")
    public WebElement hasTheParticipantEverHadABiopsyDropdown;

    /**
     * Is the participant allergic to any medications dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.medication_allergy']")
    public WebElement isTheParticipantAllergicToAnyMedicationsDropdown;

    /**
     * Have you ever been diagnosed with a lymphatic system issue dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.lymphatic_diagnosis']")
    public WebElement haveYouEverBeenDiagnosedWithALymphaticSystemIssueDropdown;

    /**
     * Has the participant ever been evaluated by a nephrologist? dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.nephrologist_evaluated']")
    public WebElement hasTheParticipantEverBeenEvaluatedByANephrologistDropdown;

    /**
     * Hospitalized for any reason other than accidental injury or childbirth dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.hospitalized_for_other_reason']")
    public WebElement hasTheParticipantBeenHospitalizedForAnyReasonOtherThanAccidentalInjuryOrChildbirthDropdown;

    /**
     * Is the participant allergic to any foods dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.food_allergy']")
    public WebElement isTheParticipantAllergicToAnyFoodsDropdown;

    /**
     * Is the participant allergic to other things? dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.allergic_other_things']")
    public WebElement isTheParticipantAllergicToOtherThingsDropdown;

    /**
     * Participant ear issues text list
     */
    @FindBy(css = "body > div:nth-child(11) > form:nth-child(1) > span:nth-child(48) > span:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(4) > div:nth-child(2) > p:nth-child(4)")
    public WebElement participantEarIssuesTextList;

    /**
     * Name of Nephrologist input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_rasopathy_iiq.nephrologist_name']")
    public WebElement nameOfNephrologistInputField;

    /**
     * Nephrologist Location input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_rasopathy_iiq.nephrologist_location']")
    public WebElement nephrologistLocationInputField;

    /**
     * Nephrologist affiliation textarea
     */
    @FindBy(xpath = "//textarea[@id='x_naci_family_coho_rasopathy_iiq.nephrologist_affiliation']")
    public WebElement nephrologistAffiliationTextArea;

    /**
     * Has the participant ever been diagnosed with a kidney problem dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.diagnosed_kidney_problem']")
    public WebElement hasTheParticipantEverBeenDiagnosedWithAKidneyProblemDropdown;

    /** ---------------------END OF Medical History SECTION--------------------- */

    /***************************************************************************************************
     *                                                                                                 *
     *                    BEGINNING OF Feeding, Nutrition & Gastro Symptoms SECTION                    *
     *                                                                                                 *
     ***************************************************************************************************/

    /**
     * Has the patient ever seen a GI specialist dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.gi_specialist']")
    public WebElement hasThePatientEverBeenSeenAGISpecialistDropdown;

    /**
     * GI Specialist Name input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_rasopathy_iiq.gi_specialist_name']")
    public WebElement giSpecialistNameInputField;

    /**
     * GI Specialist City, State input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_rasopathy_iiq.gi_specialist_city_state']")
    public WebElement giSpecialistCityStateInputField;

    /**
     * GI Specialist Hospital / Health Center Affiliation input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_rasopathy_iiq.ga_specialist_affiliation']")
    public WebElement giSpecialistHospitalHealthCenterAffiliationInputField;

    /**
     * Participant's diagnosed feeding difficulties text list
     */
    @FindBy(xpath = "//p[@id='x_naci_family_coho_rasopathy_iiq.feeding_difficulties_nonedit']")
    public WebElement participantsDiagnosedFeedingDifficultiesTextList;

    /**
     * Other Feeding Difficulties input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_rasopathy_iiq.other_feeding_difficulties']")
    public WebElement otherFeedingDifficultiesInputField;

    /**
     * Age NJ/NG-tube was placed input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_rasopathy_iiq.age_nj_tube_placed']")
    public WebElement ageNJNGTubeWasPlacedInputField;

    /**
     * Age of NG/NJ tube unknown checkbox
     */
    @FindBy(xpath = "//input[@id='sys_original.x_naci_family_coho_rasopathy_iiq.age_of_ng_nj_tube_unknown']")
    public WebElement ageOfNGNJTubeUnknownCheckbox;

    /**
     * Has the participant had any symptoms that likely involved the GI system dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.gi_symptoms']")
    public WebElement hasTheParticipantHadAnySymptomsThatLikelyInvolvedTheGISystemDropdown;

    /**
     * Age G/G-J tube was placed input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_rasopathy_iiq.age_g_g_j_tube_was_placed']")
    public WebElement ageGGJTubeWasPlacedInputField;

    /**
     * G/G-J tube placement age unknown checkbox
     */
    @FindBy(xpath = "//input[@id='sys_original.x_naci_family_coho_rasopathy_iiq.g_g_j_tube_placement_age_unknown']")
    public WebElement ggjTubePlacementAgeUnknownCheckbox;

    /**
     * Still using G-tube checkbox
     */
    @FindBy(xpath = "//input[@id='sys_original.x_naci_family_coho_rasopathy_iiq.still_using_g_tube']")
    public WebElement stillUsingGTubeCheckbox;

    /**
     * Age gastronomy tube(G/G-J) removed input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_rasopathy_iiq.age_g_tube_removed']")
    public WebElement ageGastronomyTubeGGJRemovedInputField;

    /**
     * G/G-J tube removal age unknown checkbox
     */
    @FindBy(xpath = "//input[@id='sys_original.x_naci_family_coho_rasopathy_iiq.g_g_j_tube_removal_age_unknown']")
    public WebElement ggjTubeRemovalAgeUnknownCheckbox;

    /**
     * Toilet trained dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.toilet_trained']")
    public WebElement toiletTrainedDropdown;

    /**
     * Age successfully toilet trained input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_rasopathy_iiq.age_successfully_toilet_trained']")
    public WebElement ageSuccessfullyToiletTrainedInputField;

    /**
     * Any episodes of repeated urine accidents after being toilet trained? dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.repeated_urine_accidents']")
    public WebElement anyEpisodesOfRepeatedUrineAccidentsAfterBeingToiletTrainedDropdown;

    /**
     * Does the patient consistently use the toilet for all bowel movements? dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.toilet_bowel_movements']")
    public WebElement doesThePatientConsistentlyUseTheToiletForAllBowlMovementsDropdown;

    /**
     * Pain with bowel movements dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.pain_with_bowel_movements']")
    public WebElement painWithBowelMovementsDropdown;

    /**
     * Bristol Stool Chart Type dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.bristol_stool_chart_type']")
    public WebElement bristolStoolChartTypeDropdown;

    /**
     * Does the patient consistently use the toilet for all urination? dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.toilet_urination']")
    public WebElement doesThePatientConsistentlyUseTheToiletForAllUrinationDropdown;

    /**
     * Any episodes of repeated bowel movement accidents after being toilet trained? dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.bowel_accidents']")
    public WebElement getAnyEpisodesOfRepeatedBowelAccidentsAfterBeingToiletTrainedDropdown;

    /**
     * How many bowel movements do you have per week? dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.how_many_bowel_movements_do_you_have_per_week']")
    public WebElement howManyBowelMovementsDoYouHavePerWeekDropdown;

    /**
     * Longest time without a bowel movement dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.longest_time_without_a_bowel_movement']")
    public WebElement longestTimeWithoutABowelMovementDropdown;

    /**
     * Has the participant had a procedure, test or study to evaluate their GI? dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.gi_procedure']")
    public WebElement hasTheParticipantHadAProcedureTestOrStudyToEvaluateTheirGIDropdown;

    /** ---------------------END OF Feeding, Nutrition & Gastro Symptoms SECTION--------------------- */

    /*********************************************************************
     *                                                                   *
     *                    BEGINNING OF Breath SECTION                    *
     *                                                                   *
     *********************************************************************/

    /**
     * Has the participant ever been evaluated by a pulmonologist? Dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.pulmonologist_evaluation']")
    public WebElement hasTheParticipantEverBeenEvaluatedByAPulmonologistDropdown;

    /**
     * Pulmonologist name input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_rasopathy_iiq.pulmonologsit_name']")
    public WebElement pulmonologistNameInputField;

    /**
     * Pulmonologist location input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_rasopathy_iiq.pulmonologist_location']")
    public WebElement pulmonologistLocationInputField;

    /**
     * Pulmonologist affiliation input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_rasopathy_iiq.pulmonologist_affiliation']")
    public WebElement pulmonologistAffiliationInputField;

    /**
     * Has the participant had wheezing or whistling in the chest? Dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.wheezing_whistling_in_chest']")
    public WebElement hasTheParticipantHadWheezingOrWhistlingInTheChestDropdown;

    /**
     * Has the participant been in the emergency room for a breathing problem? Dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.emergency_room_for_breathing']")
    public WebElement hasTheParticipantBeenInTheEmergencyRoomForABreathingProblemDropdown;

    /**
     * Has a doctor diagnosed the participant with reactive airway disease or asthma? Dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.diagnosed_with_asthma']")
    public WebElement hasADoctorDiagnosedPatientWithReactionAirwayDiseaseOrAsthmaDropdown;

    /**
     * Has the participant been admitted to the hospital for a breathing problem? Dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.admitted_to_the_hospital_for_breathing']")
    public WebElement hasTheParticipantBeenAdmittedToTheHospitalForABreathingProblemDropdown;

    /** ---------------------END OF Breath SECTION--------------------- */

    /***************************************************************************
     *                                                                         *
     *                    BEGINNING OF Mouth/Dental SECTION                    *
     *                                                                         *
     ***************************************************************************/

    /**
     * Does the participant receive regular dental care? dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.regular_dental_care']")
    public WebElement doesTheParticipantReceiveRegularDentalCareDropdown;

    /**
     * Name of dentist input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_rasopathy_iiq.dentist_name']")
    public WebElement nameOfDentistInputField;

    /**
     * Dentist location input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_rasopathy_iiq.dentist_location']")
    public WebElement dentistLocationInputField;

    /**
     * Dentist affiliation textarea
     */
    @FindBy(xpath = "//textarea[@id='x_naci_family_coho_rasopathy_iiq.dentist_affiliation']")
    public WebElement dentistAffiliationTextarea;

    /**
     * Main reason for last dental visit dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.main_reason_for_last_dental_visit']")
    public WebElement mainReasonForLastDentalVisitDropdown;

    /**
     * Does the participants teeth or gums hurt? dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.tooth_pain']")
    public WebElement doesTheParticipantsTeethOrGumsHurtDropdown;

    /**
     * Has the participant had dental sealants placed? dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.dental_sealants_placed']")
    public WebElement hasTheParticipantHadDentalSealantsPlacedDropdown;

    /**
     * Has the participant had any dental filings? dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.dental_filings']")
    public WebElement hasTheParticipantHadAnyDentalFilingsDropdown;

    /**
     * Does the participants mouth usually feel dry? dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.dry_mouth']")
    public WebElement doesTheParticipantsMouthUsuallyFeelDryDropdown;

    /**
     * Has the participant had any changes in their sense of smell? dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.sense_of_smell']")
    public WebElement hasTheParticipantHadAnyChangesInTheirSenseOfSmellDropdown;

    /**
     * Does the participant have jaw or temporomandibular joint pain dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.temporomandibular_joint_paint']")
    public WebElement doesTheParticipantHaveJawOrTemporomandibularJointPainDropdown;

    /**
     * Has the participant had orthodontic treatment? dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.ortho_treatment']")
    public WebElement hasTheParticipantHadOrthodonticTreatmentDropdown;

    /**
     * Did the participant have palatal expansion? dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.palatal_expansion']")
    public WebElement didTheParticipantHavePalatalExpansionDropdown;

    /**
     * Has the participant had elective jaw surgery dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.jaw_surgery']")
    public WebElement hasTheParticipantHadElectiveJawSurgeryDropdown;

    /**
     * History of cancer in the mouth or jaw dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.cancer_of_mouth']")
    public WebElement historyOfCancerInTheMouthOrJawDropdown;

    /**
     * Please specify(History of cancer in the mouth or jaw) input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_rasopathy_iiq.please_specify_mouth_cancer']")
    public WebElement pleaseSpecifyHistoryOfCancerInTheMouthOrJawInputField;

    /**
     * Does the participant have any numbness in or around the mouth dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.mouth_numbness']")
    public WebElement doesTheParticipantHaveAnyNumbnessInOrAroundTheMouthDropdown;

    /**
     * Do the participant's teeth feel sensitive to hot or cold food? dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.hot_cold_teeth_sensitivity']")
    public WebElement doTheParticipantsTeethFeelSensitiveToHotOrColdFoodDropdown;

    /**
     * Had trouble pronouncing words because of problems with teeth/mouth dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.trouble_pronouncing_words']")
    public WebElement hadTroublePronouncingWordsBecauseOfProblemsWithTeethMouthDropdown;

    /**
     * Has the participant had painful aching in their mouth dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.painful_aching_in_mouth']")
    public WebElement hasTheParticipantHadPainfulAchingInTheirMouthDropdown;

    /**
     * Has the participant been self-conscious because of their teeth/mouth dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.self_councious_teeth']")
    public WebElement hasTheParticipantBeenSelfConsciousBecauseOfTheirTeethMouthDropdown;

    /**
     * Has the participant felt tense because of problems with teeth/mouth dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.tense_teeth_mouth']")
    public WebElement hasTheParticipantFeltTenseBecauseOfProblemsWithTeethMouthDropdown;

    /**
     * Has the participant interrupted meals because of problems with teeth/mouth dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.interrupted_meals']")
    public WebElement hasTheParticipantInterruptedMealsBecauseOfProblemsWithTeethMouthDropdown;

    /**
     * Has the participant been a bit embarrassed because of teeth/mouth dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.embarrased_teeth_mouth']")
    public WebElement hasTheParticipantBeenABitEmbarrassedBecauseOfTeethMouthDropdown;

    /**
     * Difficulty doing usual jobs because of problems with teeth/mouth dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.difficulty_doing_usual_jobs']")
    public WebElement difficultyDoingUsualJobsBecauseOfProblemsWithTeethMouthDropdown;

    /**
     * Has the participant been totally unable to function because of teeth dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.unable_to_function']")
    public WebElement hasTheParticipantBeenTotallyUnableToFunctionBecauseOfTeethDropdown;

    /**
     * When did the participant last visit a dentist input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_rasopathy_iiq.last_dentist_visit']")
    public WebElement whenDidTheParticipantLastVisitADentistInputField;

    /**
     * Does the participant's gums bleed easily with tooth brushing now? dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.bleeding_gums']")
    public WebElement doesTheParticipantGumsBleedEasilyWithToothBrushingNowDropdown;

    /**
     * Does the participant have periodontal or gum disease? dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.gum_disease']")
    public WebElement doesTheParticipantHavePeriodontalOrGumDiseaseDropdown;

    /**
     * Does the participant have cavities now? dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.cavities']")
    public WebElement doesTheParticipantHaveCavitiesNowDropdown;

    /**
     * How would the participant rate their hygiene routine dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.hygiene_rating']")
    public WebElement howWouldTheParticipantRateTheirHygieneRoutineDropdown;

    /**
     * How would the participant rate their teeth and gums dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.teeth_gums_rating']")
    public WebElement howWouldTheParticipantRateTheirTeethAndGumsDropdown;

    /**
     * Has the participant had any changes in your sense of taste? dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.sense_of_taste']")
    public WebElement hasTheParticipantHadAnyChangesInTheirSenseOfTasteDropdown;

    /**
     * Does the participant have frequent headaches? dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.frequent_headaches']")
    public WebElement doesTheParticipantHaveFrequentHeadachesDropdown;

    /**
     * Has the participant had any facial or dental trauma? dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.facial_dental_trauma']")
    public WebElement hasTheParticipantHadAnyFacialOrDentalTraumaDropdown;

    /**
     * Did the participant have dental surgery? dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.dental_surgery']")
    public WebElement didTheParticipantHaveDentalSurgeryDropdown;

    /**
     * Please specify(Did the participant have dental surgery?) input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_rasopathy_iiq.please_specify_dental_surgery']")
    public WebElement pleaseSpecifyDidTheParticipantHaveDentalSurgeryInputField;

    /**
     * Does the participant have a family member with a syndrome or a jaw abnormality dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.relative_with_jaw_abnormality']")
    public WebElement doesTheParticipantHaveAFamilyMemberWithASyndromeOrAJawAbnormalityDropdown;

    /**
     * Please specify(Does the participant have a family member with a syndrome or a jaw abnormality)
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_rasopathy_iiq.please_specify_jaw_abnormality']")
    public WebElement pleaseSpecifyDoesTheParticipantHaveAFamilyMemberWithASyndromeOrAJawAbnormalityInputField;

    /**
     * Does the participant have any mouth sores? dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.mouth_sores']")
    public WebElement doesTheParticipantHaveAnyMouthSoresDropdown;

    /**
     * Does the participant have problems moving their lips, tongue, or mouth? dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.problems_moving_mouth']")
    public WebElement doesTheParticipantHaveProblemsMovingTheirLipsTongueOrMouthDropdown;

    /**
     * Is anything unusual about the participant's teeth or mouth dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.unusual_teeth_mouth']")
    public WebElement isAnythingUnusualAboutTheParticipantsTeethOrMouthDropdown;

    /**
     * Please specify(Is anything unusual about the participant's teeth or mouth) input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_rasopathy_iiq.please_specify_teeth_mouth']")
    public WebElement pleaseSpecifyIsAnythingUnusualAboutTheParticipantSTeethOrMouthInputField;

    /**
     * Worsened sense of taste because of problems with teeth/mouth dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.worsened_sense_of_taste']")
    public WebElement worsenedSenseOfTasteBecauseOfProblemsWithTeethMouthDropdown;

    /**
     * Uncomfortable eating any foods with their teeth/mouth dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.uncomfortable_eating_foods']")
    public WebElement uncomfortableEatingAnyFoodsWithTheirTeethMouthDropdown;

    /**
     * Unsatisfactory diet because of problems with teeth/mouth dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.diet_teeth_mouth']")
    public WebElement unsatisfactoryDietBecauseOfProblemsWithTeethMouthDropdown;

    /**
     * Has the participant found it difficult to relax due to problems with teeth/mouth dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.difficult_to_relax']")
    public WebElement hasTheParticipantFoundItDifficultToRelaxDueToProblemsWithTeethMouthDropdown;

    /**
     * Irritable with others people because of problems with teeth/mouth dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.irritable_with_others']")
    public WebElement irritableWithOthersPeopleBecauseOfProblemsWithTeethMouthDropdown;

    /**
     * Has the participant felt life was less satisfying due to their teeth/mouth dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.life_less_satisfying']")
    public WebElement hasTheParticipantFeltLifeWasLessSatisfyingDueToTheirTeethMouthDropdown;

    /**
     * ---------------------END OF Mouth/Dental SECTION---------------------
     */

    /**************************************************************************
     *                                                                        *
     *                    BEGINNING OF Hair & Skin SECTION                    *
     *                                                                        *
     **************************************************************************/

    /**
     * Has participant been evaluated by a dermatologist? Dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.dermatologist']")
    public WebElement hasParticipantBeenEvaluatedByADermatologistDropdown;

    /**
     * Name of dermatologist input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_rasopathy_iiq.name_of_dermatlogist']")
    public WebElement nameOfDermatologistInputField;

    /**
     * City, State of dermatologist input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_rasopathy_iiq.city_state_of_dermatologist']")
    public WebElement cityStateOfDermatologistInputField;

    /**
     * Hospital or Medical Center Affiliation of Dermatologist input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_rasopathy_iiq.dermatologist_affiliation']")
    public WebElement hospitalOrMedicalCenterAffiliationOfDermatologistInputField;

    /**
     * Description of participant's hair text
     */
    @FindBy(xpath = "//p[@id='x_naci_family_coho_rasopathy_iiq.hair_description_nonedit']")
    public WebElement descriptionOfParticipantsHairText;

    /**
     * Other hair description input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_rasopathy_iiq.other_hair_description']")
    public WebElement otherHairDescriptionInputField;

    /**
     * Diagnosed skin issues text
     */
    @FindBy(xpath = "//p[@id='x_naci_family_coho_rasopathy_iiq.diagnosed_skin_issues_nonedit']")
    public WebElement diagnosedSkinIssuesText;

    /**
     * Other skin issues input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_rasopathy_iiq.other_skin_issues']")
    public WebElement otherSkinIssuesInputField;

    /**
     * Pigmented skin findings text
     */
    @FindBy(xpath = "//p[@id='x_naci_family_coho_rasopathy_iiq.pigmented_skin_findings_nonedit']")
    public WebElement pigmentedSkinFindingsText;

    /**
     * Other pigmented findings input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_rasopathy_iiq.other_pigmented_findings']")
    public WebElement otherPigmentedSkinFindingsInputField;

    /**
     * Diagnosed skin tumors text
     */
    @FindBy(xpath = "//p[@id='x_naci_family_coho_rasopathy_iiq.skin_tumors_nonedit']")
    public WebElement diagnosedSkinTumorsText;

    /**
     * Other skin tumors input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_rasopathy_iiq.other_skin_tumors']")
    public WebElement otherSkinTumorsInputField;

    /**
     * Is the texture or amount of hair similar to a biological relatives? Dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.similar_hair']")
    public WebElement isTheTextureOrAmountOfHairSimilarToABiologicalRelativesDropdown;

    /**
     * Does the participant have any hemangiomas? Dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.hemangiomas']")
    public WebElement doesTheParticipantHaveAnyHemangiomasDropdown;

    /**
     * ---------------------END OF Hair & Skin SECTION---------------------
     */

    /***********************************************************************
     *                                                                     *
     *                    BEGINNING OF Skeletal SECTION                    *
     *                                                                     *
     ***********************************************************************/

    /**
     * Has the participant been evaluated by an orthopaedic surgeon? Dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.orthopaedic_surgeon']")
    public WebElement hasTheParticipantBeenEvaluatedByAnOrthopaedicSurgeonDropdown;

    /**
     * Name of orthopaedic surgeon input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_rasopathy_iiq.ortho_name']")
    public WebElement nameOfOrthopaedicSurgeonInputField;

    /**
     * Location of orthopaedic surgeon input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_rasopathy_iiq.ortho_location']")
    public WebElement locationOfOrthopaedicSurgeonInputField;

    /**
     * Orthopedic surgeons hospital or medical center affiliation input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_rasopathy_iiq.orthopaedic_surgeon_affiliation']")
    public WebElement orthopediacSurgeonsHospitalOrMedicalCenterAffiliationInputField;

    /**
     * Diagnosed skeletal findings text
     */
    @FindBy(xpath = "//p[@id='x_naci_family_coho_rasopathy_iiq.diagnosed_skeletal_findings_nonedit']")
    public WebElement diagnosedSkeletalFindingsText;

    /**
     * Other skeletal findings input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_rasopathy_iiq.other_skeletal_findings']")
    public WebElement otherSkeletalFindingsInputField;

    /**
     * Does the participant have any issues with curving of the spine dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.curving_of_the_spine']")
    public WebElement doesTheParticipantHaveAnyIssuesWithCurvingOfTheSpineDropdown;

    /**
     * Has the participant's neck been described as short or webbed? dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.short_webbed_neck']")
    public WebElement hasTheParticipantNeckBeenDescribedAsShortOrWebbedDropdown;

    /**
     * Has the participant ever been diagnosed with joint issues? dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.joint_issues']")
    public WebElement hasTheParticipantEverBeenDiagnosedWithJoinIssuesDropdown;

    /**
     * ---------------------END OF Skeletal SECTION---------------------
     */

    /**************************************************************************************************
     *                                                                                                *
     *                    BEGINNING OF Hematology, Oncology and Immunology SECTION                    *
     *                                                                                                *
     **************************************************************************************************/

    /**
     * Has the participant ever had an evaluation by a hematologist or oncologist? dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.hematologist_oncologist']")
    public WebElement hasTheParticipantEverBeenEvaluatedByAHematologistOrOncologistDropdown;

    /**
     * Name of hematologist/oncologist dropdown
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_rasopathy_iiq.hematologist_name']")
    public WebElement nameOfHematologistOncologistDropdown;

    /**
     * Location of hematologist/oncologist input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_rasopathy_iiq.hematologist_location']")
    public WebElement locationOfHematologistOncologistDropdown;

    /**
     * Hematologist/Oncologist medical affiliation input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_rasopathy_iiq.hematologist_oncologist_medical_affiliation']")
    public WebElement hematologistOncologistMedicalAffiliationInputField;

    /**
     * Does the participant have any issues with bleeding or bruising? Dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.bleeding_bruising']")
    public WebElement doesTheParticipantHaveAnyIssuesWithBleedingOrBruisingDropdown;

    /**
     * Does the participant have a history of frequent infections? Dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.infections']")
    public WebElement doesTheParticipantHaveAHistoryOfFrequentInfectionsDropdown;

    /**
     * Has the participant been diagnosed with an autoimmune disorder? Dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.diagnosed_autoimmune']")
    public WebElement hasTheParticipantBeenDiagnosedWithAnAutoimmuneDisorderDropdown;

    /**
     * Name of immunologist/rheumatologist input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_rasopathy_iiq.immunologist_rheumatologist_name']")
    public WebElement nameOfImmunologistRheumatologistInputField;

    /**
     * Immunologist/rheumatologist location input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_rasopathy_iiq.immunologist_rheumatologist_location']")
    public WebElement immunologistRheumatologistLocationInputField;

    /**
     * Immunologist/rheumatologist affiliation input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_rasopathy_iiq.immunologist_rheumatologist_affiliation']")
    public WebElement immunologistRheumatologistAffiliationInputField;

    /**
     * Does the participant have any known blood disorders or symptoms such disorders? Dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.known_blood_disorders']")
    public WebElement doesTheParticipantHaveAnyKnownBloodDisordersOrSymptomsDropdown;

    /**
     * Has the participant been evaluated by an immunologist or rheumatologist? Dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.immunologist_rheumatologist']")
    public WebElement hasTheParticipantBeenEvaluatedByAnImmunologistOrRheumatologistDropdown;

    /**
     * ---------------------END OF Hematology, Oncology and Immunology SECTION---------------------
     */

    /********************************************************************************
     *                                                                              *
     *                    BEGINNING OF Brain & Neurology SECTION                    *
     *                                                                              *
     ********************************************************************************/

    /**
     * Has the participant ever been evaluated by a neurologist or neurosurgeon? Dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.evaluated_by_neurologist']")
    public WebElement hasTheParticipantEverBeenEvaluatedByANeurologistOrNeurosurgeonDropdown;

    /**
     * Name of neurologist input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_rasopathy_iiq.name_of_neurologist']")
    public WebElement nameOfNeurologistInputField;

    /**
     * Location of neurologist input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_rasopathy_iiq.neurologist_location']")
    public WebElement locationOfNeurologistInputField;

    /**
     * Neurologist affiliation input field
     */
    @FindBy(xpath = "//textarea[@id='x_naci_family_coho_rasopathy_iiq.neurologist_affiliation']")
    public WebElement neurologistAffiliationInputField;

    /**
     * Has the participant ever been diagnosed with a structural brain abnormality? Dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.diagnosed_brain_abnormality']")
    public WebElement hasTheParticipantEverBeenDiagnosedWithABrainAbnormalityDropdown;

    /**
     * Evaluated by a psychiatrist, psychologist or behavioral pediatrician? Dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.evaluated_by_psychiatrist']")
    public WebElement evaluatedByAPsychiatristPsychologistOrBehavioralPediatricianDropdown;

    /**
     * Name of physician input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_rasopathy_iiq.name_of_physician']")
    public WebElement nameOfPhysicianInputField;

    /**
     * Location of physician input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_rasopathy_iiq.physician_location_psych']")
    public WebElement locationOfPhysicianInputField;

    /**
     * Psychiatrist affiliation input field
     */
    @FindBy(xpath = "//textarea[@id='x_naci_family_coho_rasopathy_iiq.psychiatrist_affiliation']")
    public WebElement psychiatristAffiliationInputField;

    /**
     * Does the participant have a history seizures? Dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.seizure_history']")
    public WebElement doesTheParticipantHaveAHistorySeizuresDropdown;

    /**
     * Has the participant been diagnosed with a behavioral or psychiatric condition? Dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.diagnosed_psychiatric_condition']")
    public WebElement hasTheParticipantBeenDiagnosedWithABehavioralOrPsychiatricConditionDropdown;

    /**
     * ---------------------END OF Brain & Neurology SECTION---------------------
     */

    /********************************************************************************
     *                                                                              *
     *                    BEGINNING OF Vision & Hearing SECTION                     *
     *                                                                              *
     ********************************************************************************/

    /**
     * Diagnosed with ptosis Dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.ptosis_diagnosis']")
    public WebElement diagnosedWithPtosisDropdown;

    /**
     * Did the ptosis require treatment? Dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.ptosis_treatment_required']")
    public WebElement didThePtosisRequireTreatmentDropdown;

    /**
     * Participant experienced hearing loss Dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.hearing_loss']")
    public WebElement participantExperiencedHearingLossDropdown;

    /**
     * Participant ear issues text
     */
    @FindBy(css = "div[aria-label='Vision & Hearing form section'] p[class='form-control-static']")
    public WebElement participantEarIssuesText;

    /**
     * Please specify(Participant ear issues) input field
     */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_rasopathy_iiq.please_specify_ear_issues']")
    public WebElement pleaseSpecifyParticipantEarIssuesInputField;

    /**
     * Issues with vision or eyesight dropdown
     */
    @FindBy(xpath = "//select[contains(@name,'x_naci_family_coho_rasopathy_iiq.eye_issues')]")
    public WebElement issuesWithVisionOrEyesightDropdown;

    /**
     * Participant experienced strabismus dropdown
     */
    @FindBy(xpath = "//select[@name='x_naci_family_coho_rasopathy_iiq.strabismus']")
    public WebElement participantExperiencedStrabismusDropdown;

    /**
     * Participant experienced nystagmus dropdown
     */
    @FindBy(xpath = "//select[@name='x_naci_family_coho_rasopathy_iiq.nystagmus']")
    public WebElement participantExperiencedNystagmusDropdown;

    /**
     * ---------------------END OF Vision & Hearing SECTION---------------------
     */

    /***********************************************************************************************
     *                                                                                             *
     *                    BEGINNING OF Medications Taken While Pregnant SECTION                    *
     *                                                                                             *
     ***********************************************************************************************/

    /**
     * Medication input field
     */
    @FindBy(xpath = "//input[@name='sys_display.original.x_naci_family_coho_medications_taken_while_pregnant.medication']")
    public WebElement medicationInputField;

    /**
     * Name of Medication input field
     */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_medications_taken_while_pregnant.name']")
    public WebElement nameOfMedicationInputField;

    /**
     * Length of time medication was taken input field
     */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_medications_taken_while_pregnant.medication_usage_length']")
    public WebElement lengthOfTimeMedicationWasTakenInputField;

    /**
     * Please specify input field
     */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_medications_taken_while_pregnant.please_specify']")
    public WebElement pleaseSpecifyMedicationWasTakenInputField;

    /**
     * Reason medication was taken input field
     */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_medications_taken_while_pregnant.reason_for_medication']")
    public WebElement reasonMedicationWasTakenInputField;

    /**
     * ---------------------END OF Medications Taken While Pregnant SECTION---------------------
     */

    /*************************************************************************************
     *                                                                                   *
     *                    BEGINNING OF Growth Hormone Details SECTION                    *
     *                                                                                   *
     *************************************************************************************/

    /**
     * Hormone Treatment Number input field
     */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_growth_hormone_details.treatment_count']")
    public WebElement hormoneTreatmentNumberInputField;

    /**
     * Age growth hormone started input field
     */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_growth_hormone_details.age_started']")
    public WebElement ageGrowthHormoneStartedInputField;

    /**
     * Age growth hormone stopped field
     */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_growth_hormone_details.age_stopped']")
    public WebElement ageGrowthHormoneStoppedInputField;

    /**
     * Still on growth hormone dropdown
     */
    @FindBy(xpath = "//select[@name='x_naci_family_coho_growth_hormone_details.growth_hormone_active']")
    public WebElement stillOnGrowthHormoneDropdown;

    /**
     * Date growth hormone started input field
     */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_growth_hormone_details.date_started']")
    public WebElement dateGrowthHormoneStartedInputField;

    /**
     * ---------------------END OF Growth Hormone Details SECTION---------------------
     */

    /*****************************************************************************
     *                                                                           *
     *                    BEGINNING OF Heart Symptoms SECTION                    *
     *                                                                           *
     *****************************************************************************/

    /**
     * Symptom input field
     */
    @FindBy(xpath = "//input[@id='sys_display.x_naci_family_coho_participant_heart_issue_symptom.symptom']")
    public WebElement symptomInputField;

    /**
     * Age of first hospital evaluation input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_participant_heart_issue_symptom.age_of_first_hospital_evaluation']")
    public WebElement ageOfFirstHospitalEvaluationInputField;

    /**
     * Date of first evaluation input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_participant_heart_issue_symptom.date_of_first_evaluation']")
    public WebElement dateOfFirstEvaluationInputField;

    /**
     * First evaluation unknown checkbox
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_participant_heart_issue_symptom.first_evaluation_unknown']")
    public WebElement firstEvaluationUnknownCheckbox;

    /**
     * First hospital evaluation textarea
     */
    @FindBy(xpath = "//textarea[@id='x_naci_family_coho_participant_heart_issue_symptom.first_hospital_evaluation']")
    public WebElement firstHospitalEvaluationTextarea;

    /**
     * Age of most recent evaluation input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_participant_heart_issue_symptom.age_recent_evaluation']")
    public WebElement ageOfMostRecentEvaluationInputField;

    /**
     * Date of most recent evaluation input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_participant_heart_issue_symptom.date_recent_evaluation']")
    public WebElement dateOfMostRecentEvaluationInputField;

    /**
     * Date of recent evaluation unknown checkbox
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_participant_heart_issue_symptom.date_recent_evaluation_unknown']")
    public WebElement dateOfRecentEvaluationUnknownCheckbox;

    /**
     * Recent hospital evaluation textarea
     */
    @FindBy(xpath = "//textarea[@id='x_naci_family_coho_participant_heart_issue_symptom.recent_hospital_evaluation']")
    public WebElement recentHospitalEvaluationTextarea;

    /**
     * ---------------------END OF Heart Symptoms SECTION---------------------
     */

    /*******************************************************************************
     *                                                                             *
     *                    BEGINNING OF Heart Treatments SECTION                    *
     *                                                                             *
     ******************************************************************************/

    /**
     * Surgery input field
     */
    @FindBy(xpath = "//input[@id='sys_display.x_naci_family_coho_participant_heart_treatment_history.treatment']")
    public WebElement surgeryInputField;

    /**
     * Please specify(Treatment) input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_participant_heart_treatment_history.please_specify']")
    public WebElement pleaseSpecifyTreatmentInputField;

    /**
     * Is the participant still on this medication dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_participant_heart_treatment_history.still_on_meds']")
    public WebElement isTheParticipantStillOnThisMedicationDropdown;

    /**
     * Date of first treatment input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_participant_heart_treatment_history.first_treatment_date']")
    public WebElement dateOfFirstTreatmentInputField;

    /**
     * Date/age first treatment unknown checkbox
     */
    @FindBy(xpath = "//input[@id='sys_original.x_naci_family_coho_participant_heart_treatment_history.first_treatment_unknown']")
    public WebElement dateAgeOfFirstTreatmentUnknownCheckbox;

    /**
     * First Treatment Location textarea
     */
    @FindBy(xpath = "//textarea[@id='x_naci_family_coho_participant_heart_treatment_history.first_treatment_location']")
    public WebElement firstTreatmentLocationTextarea;

    /**
     * Date of most recent treatment input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_participant_heart_treatment_history.recent_treatment_date']")
    public WebElement dateOfMostRecentTreatmentInputField;

    /**
     * Date/age recent treatment unknown checkbox
     */
    @FindBy(xpath = "//input[@id='sys_original.x_naci_family_coho_participant_heart_treatment_history.recent_treatment_unknown']")
    public WebElement dateAgeOfMostRecentTreatmentUnknownCheckbox;

    /**
     * Most recent treatment location textarea
     */
    @FindBy(xpath = "//textarea[@id='x_naci_family_coho_participant_heart_treatment_history.recent_treatment_location']")
    public WebElement mostRecentTreatmentLocationTextarea;

    /**
     * ---------------------END OF Heart Treatments SECTION---------------------
     */


    /***************************************************************************************
     *                                                                                     *
     *                    BEGINNING OF Participant Heart Issues SECTION                    *
     *                                                                                     *
     ***************************************************************************************/

    /**
     * Issue input field
     */
    @FindBy(xpath = "//input[@id='sys_display.x_naci_family_coho_participant_heart_issues.issue']")
    public WebElement issueInputField;

    /**
     * Participant heart issues - Please specify input field
     */
    @FindBy(xpath = "//span[normalize-space()='Please specify']/parent::label/parent::div/following-sibling::div/input")
    public WebElement pleaseSpecifyParticipantHeartIssuesInputField;

    /**
     * Age at diagnosis input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_participant_heart_issues.diagnosis_age']")
    public WebElement ageAtDiagnosisInputField;

    /**
     * Date of diagnosis input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_participant_heart_issues.diagnosis_date']")
    public WebElement dateOfDiagnosisInputField;

    /**
     * Age/date of diagnosis unknown checkbox
     */
    @FindBy(xpath = "//input[@id='sys_original.x_naci_family_coho_participant_heart_issues.diagnosis_time_unknown']")
    public WebElement ageDateOfDiagnosisUnknownCheckbox;

    /**
     * Treatment textarea
     */
    @FindBy(xpath = "//textarea[@id='x_naci_family_coho_participant_heart_issues.treatment']")
    public WebElement treatmentTextArea;

    /**
     * Hospital where treatment received textarea
     */
    @FindBy(xpath = "//textarea[@id='x_naci_family_coho_participant_heart_issues.hospital']")
    public WebElement hospitalWhereTreatmentReceivedTextarea;

    /**
     * Age at first symptoms input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_participant_heart_issues.symptom_age']")
    public WebElement ageAtFirstSymptomsInputField;

    /**
     * Date of first symptoms input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_participant_heart_issues.symptom_date']")
    public WebElement dateOfFirstSymptomsInputField;

    /**
     * Age/date of first symptom unknown checkbox
     */
    @FindBy(xpath = "//input[@id='sys_original.x_naci_family_coho_participant_heart_issues.symptom_time_unknown']")
    public WebElement ageDateOfFirstSymptomUnknownCheckbox;

    /**
     * ---------------------END OF Participant Heart Issues SECTION---------------------
     */

    /*****************************************************************************
     *                                                                           *
     *                    BEGINNING OF Biopsy History SECTION                    *
     *                                                                           *
     *****************************************************************************/

    /**
     * Type input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_participant_biopsy_history.type']")
    public WebElement biopsyHistoryTypeInputField;

    /**
     * Date biopsy was performed input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_participant_biopsy_history.date']")
    public WebElement dateBiopsyWasPerformedInputField;

    /**
     * Name and location of facility where biopsy was preformed textarea
     */
    @FindBy(xpath = "//textarea[@id='x_naci_family_coho_participant_biopsy_history.name_location']")
    public WebElement nameAndLocationOfFacilityWhereBiopsyWasPreformedTextarea;

    /**
     * Reason dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_participant_biopsy_history.reason']")
    public WebElement biopsyHistoryReasonDropdown;

    /**
     * ---------------------END OF Biopsy History Issues SECTION---------------------
     */

    /*****************************************************************************
     *                                                                           *
     *                    BEGINNING OF Allergy Histories SECTION                    *
     *                                                                           *
     *****************************************************************************/

    /**
     * Type dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_allergy_history.type']")
    public WebElement allergyHistoryTypeDropdown;

    /**
     * Name input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_allergy_history.name']")
    public WebElement allergyHistoryNameInputField;

    /**
     * Reaction input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_allergy_history.reaction']")
    public WebElement allergyHistoryReactionInputField;

    /**
     * ---------------------END OF Allergy Histories SECTION---------------------
     */

    /*******************************************************************************
     *                                                                             *
     *                    BEGINNING OF Hospital History SECTION                    *
     *                                                                             *
     *******************************************************************************/

    /**
     * Where was the participant hospitalized textarea
     */
    @FindBy(xpath = "//textarea[@id='x_naci_family_coho_hospitalization_history.location']")
    public WebElement whereWasTheParticipantHospitalizedTextarea;

    /**
     * Reason for hospitalization textarea
     */
    @FindBy(xpath = "//textarea[@id='x_naci_family_coho_hospitalization_history.reason']")
    public WebElement reasonForHospitalizationTextarea;

    /**
     * ---------------------END OF Hospital History SECTION---------------------
     */

    /*************************************************************************************
     *                                                                                   *
     *                    BEGINNING OF Gastrointestinal Exams SECTION                    *
     *                                                                                   *
     *************************************************************************************/

    /**
     * Exam/Study textarea
     */
    @FindBy(xpath = "//input[@id='sys_display.x_naci_family_coho_gastrointestinal_symptom_history.exam']")
    public WebElement gastrointestinalExamsExamStudyTextarea;

    /**
     * Please specify input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_gastrointestinal_symptom_history.please_specify']")
    public WebElement gastrointestinalExamsPleaseSpecifyInputField;

    /**
     * Date of first exam input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_gastrointestinal_symptom_history.date_of_first_study']")
    public WebElement gastrointestinalExamsDateOfFirstExamInputField;

    /**
     * Findings from the first exam/study input field
     */
    @FindBy(xpath = "//textarea[@id='x_naci_family_coho_gastrointestinal_symptom_history.findings_from_first_exam']")
    public WebElement gastrointestinalExamsFindingsFromTheFirstExamInputField;

    /**
     * Reason the participant had their exam/study textarea
     */
    @FindBy(xpath = "//textarea[@id='x_naci_family_coho_gastrointestinal_symptom_history.reason_for_exam']")
    public WebElement gastrointestinalExamsReasonTheParticipantHadTheirExamStudyTextarea;

    /**
     * Where did the participant have their first exam/study? textarea
     */
    @FindBy(xpath = "//textarea[@id='x_naci_family_coho_gastrointestinal_symptom_history.location_first_exam']")
    public WebElement gastrointestinalExamsWhereDidTheParticipantHaveTheirFirstExamStudyTextarea;

    /**
     * Date of most recent exam input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_gastrointestinal_symptom_history.date_recent_exam']")
    public WebElement gastrointestinalExamsDateOfMostRecentExamInputField;

    /**
     * Findings of the most recent exam textarea
     */
    @FindBy(xpath = "//textarea[@id='x_naci_family_coho_gastrointestinal_symptom_history.findings_recent_exam']")
    public WebElement gastrointestinalExamsFindingsOfTheMostRecentExamTextarea;

    /**
     * Reason for most recent exam textarea
     */
    @FindBy(xpath = "//textarea[@id='x_naci_family_coho_gastrointestinal_symptom_history.recent_exam_reason']")
    public WebElement gastrointestinalExamsReasonForMostRecentExamTextarea;

    /**
     * Where did the participant have their most recent study? textarea
     */
    @FindBy(xpath = "//textarea[@id='x_naci_family_coho_gastrointestinal_symptom_history.location_recent_exam']")
    public WebElement gastrointestinalExamsWhereDidTheParticipantHaveTheirMostRecentStudyTextarea;

    /**
     * ---------------------END OF Gastrointestinal Exams SECTION---------------------
     */

    /**************************************************************************
     *                                                                        *
     *                    BEGINNING OF GI Symptoms SECTION                    *
     *                                                                        *
     ***************************************************************************/

    /**
     * Symptom input field
     */
    @FindBy(xpath = "//input[@id='sys_display.x_naci_family_coho_gi_symptom_history.symptom']")
    public WebElement giSymptomsSymptomInputField;

    /**
     * ---------------------START OF Lactose intolerance Record---------------------
     */

    /**
     * Does the participant take a lactose supplement dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_gi_symptom_history.lactose_supplement']")
    public WebElement giSymptomsDoesTheParticipantTakeALactoseSupplementDropdown;

    /**
     * Status dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_gi_symptom_history.status']")
    public WebElement giSymptomsStatusDropdown;

    /**
     * ---------------------START OF Lactose intolerance Record---------------------
     */

    /**
     * ---------------------START OF Constipation Record---------------------
     */

    /**
     * 2 or fewer bowel movements per week dropdown
     */
    @FindBy(css = "select[id='x_naci_family_coho_gi_symptom_history.u_2_fewer_bowel_movement']")
    public WebElement giSymptomsTwoOrFewerBowelMovementsPerWeekDropdown;

    /**
     * 1 or more stool accidents or stool incontinence per week dropdown
     */
    @FindBy(css = "select[id='x_naci_family_coho_gi_symptom_history.u_1_more_stool_accident']")
    public WebElement giSymptomsOneOrMoreStoolAccidentOrStoolIncontinencePerWeekDropdown;

    /**
     * Posturing or excessive attempts to avoid having a bowel movement dropdown
     */
    @FindBy(css = "select[id='x_naci_family_coho_gi_symptom_history.attempts_avoid_bowel_movement']")
    public WebElement giSymptomsPosturingOrExcessiveAttemptsToAvoidHavingABowelMovementDropdown;

    /**
     * History of stool impaction dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_gi_symptom_history.history_of_stool_impaction']")
    public WebElement giSymptomsHistoryOfStoolImpactionDropdown;

    /**
     * Large bowel movements that clog the toilet dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_gi_symptom_history.clog_toilet']")
    public WebElement giSymptomsLargeBowelMovementsThatClogTheToiletDropdown;

    /**
     * Blood on toilet paper or in the stool dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_gi_symptom_history.blood_constipation']")
    public WebElement giSymptomsBloodOnToiletPaperOrInTheStoolDropdown;

    /**
     * Having bowel movements in places inappropriate or not socially acceptable dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_gi_symptom_history.innapropriate_bowel_movements']")
    public WebElement giSymptomsBowelMovementsInPlacesInappropriateOrNotSociallyAcceptableDropdown;

    /**
     * Painful or Hard bowel movements dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_gi_symptom_history.constipation_painful_hard']")
    public WebElement giSymptomsPainfulOrHardBowelMovementsDropdown;

    /**
     * ---------------------END OF Constipation Record---------------------
     */

    /**
     * ---------------------START OF Decreased appetite Record---------------------
     */

    /**
     * What supplemental nutrition have been taken? text
     */
    @FindBy(xpath = "//p[@id='x_naci_family_coho_gi_symptom_history.supplemental_nutrition_nonedit']")
    public WebElement giSymptomsWhatSupplementalNutritionHaveBeenTakenText;

    /**
     * Has decreased appetite caused weight loss or poor growth? dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_gi_symptom_history.decreased_appetite_weight_loss']")
    public WebElement giSymptomsHasDecreasedAppetiteCausedWeightLossOrPoorGrowthDropdown;

    /**
     * Have nutritional supplements/feeds ever been taken or received? dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_gi_symptom_history.nutritional_supplements']")
    public WebElement giSymptomsHaveNutritionalSupplementsFeedsEverBeenTakenOrReceivedDropdown;

    /**
     * ---------------------END OF Decreased appetite Record---------------------
     */

    /**
     * ---------------------START OF Vomiting Record---------------------
     */

    /**
     * Ever had at least 2 months with 1 or more episodes of vomiting per week? dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_gi_symptom_history.vomiting_frequency']")
    public WebElement giSymptomsEverHadAtLeast2MonthsWith1OrMoreEpisodesOfVomitingPerWeekDropdown;

    /**
     * Is vomiting ever self-induced? dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_gi_symptom_history.vomiting_self_induced']")
    public WebElement giSymptomsIsVomitingEverSelfInducedDropdown;

    /**
     * Is vomiting related to medication, surgery or other health issue? dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_gi_symptom_history.vomiting_relation']")
    public WebElement giSymptomsIsVomitingRelatedToMedicationSurgeryOrOtherHealthIssueDropdown;

    /**
     * Have any medications ever been taken for vomiting dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_gi_symptom_history.vomit_medications']")
    public WebElement giSymptomsHaveAnyMedicationsEverBeenTakenForVomitingDropdown;

    /**
     * Do episodes of vomiting seem similar to each other when they occur? dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_gi_symptom_history.vomiting_similarities']")
    public WebElement giSymptomsDoEpisodesOfVomitingSeemSimilarToEachOtherWhenTheyOccurDropdown;

    /**
     * Are there weeks to months without symptoms of nausea/vomiting between episodes? dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_gi_symptom_history.time_without_symptoms']")
    public WebElement giSymptomsAreThereWeeksToMonthsWithoutSymptomsOfNauseaVomitingBetweenEpisodesDropdown;

    /**
     * Ever vomited blood? dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_gi_symptom_history.vomited_blood']")
    public WebElement giSymptomsEverVomitedBloodDropdown;

    /**
     * Ever had 2 or more episodes of intense vomiting within 6 month period dropdown
     */
    @FindBy(css = "select[id='x_naci_family_coho_gi_symptom_history.vomiting_2_intense']")
    public WebElement giSymptomsEverHad2OrMoreEpisodesOfIntenseVomitingWithin6MonthPeriodDropdown;

    /**
     * ---------------------END OF GI Vomiting Record---------------------
     */

    /**
     * ---------------------START OF GI Choking/gagging Record---------------------
     */

    /**
     * Did choking/gagging lead to pneumonia dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_gi_symptom_history.pneumonia']")
    public WebElement giSymptomsDidChokingGaggingLeadToPneumoniaDropdown;

    /**
     * Did choking/gagging ever lead to a x-ray swallow study dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_gi_symptom_history.x_ray_swallow_study']")
    public WebElement giSymptomsDidChokingGaggingLeadToXRaySwallowStudyDropdown;

    /**
     * Did choking/gagging ever lead to aspiration on swallow study dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_gi_symptom_history.aspiration']")
    public WebElement giSymptomsDidChokingGaggingLeadToAspirationOrSwallowStudyDropdown;

    /**
     * ---------------------END OF GI Choking/gagging Record---------------------
     */

    /**
     * ---------------------START OF GI Jaundice (yellow skin) Record---------------------
     */

    /**
     * What age did jaundice occur input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_gi_symptom_history.jaundice_age']")
    public WebElement giSymptomsWhatAgeDidJaundiceOccurInputField;

    /**
     * How long did jaundice last? dropdown
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_gi_symptom_history.jaundice_timeline']")
    public WebElement giSymptomsHowLongDidJaundiceLastDropdown;

    /**
     * ---------------------END OF GI Jaundice (yellow skin) Record---------------------
     */

    /**
     * ---------------------START OF GI Abdominal pain Record---------------------
     */

    /**
     * Waves of severe, distressing, acute pain at the belly-button or entire abdomen dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_gi_symptom_history.severe_pain']")
    public WebElement giSymptomsWavesOfSevereDistressingAcutePainAtTheBellyButtonOrEntireAbdomenDropdown;

    /**
     * Are episodes of belly pain separated by weeks or months dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_gi_symptom_history.belly_pain']")
    public WebElement giSymptomsAreEpisodesOfBellyPainSeparatedByWeeksOrMonthsDropdown;

    /**
     * Does abdominal pain prevent the completion of usual activities dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_gi_symptom_history.pain_prevent_activities']")
    public WebElement giSymptomsDoesAbdominalPainPreventTheCompletionOfUsualActivitiesDropdown;

    /**
     * Is the pain similar with each episode dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_gi_symptom_history.similar_pain']")
    public WebElement giSymptomsIsThePainSimilarWithEachEpisodeDropdown;

    /**
     * Have these episodes been happening at least six months dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_gi_symptom_history.episode_occurence']")
    public WebElement giSymptomsHaveTheseEpisodesBeenHappeningAtLeastSixMonthsDropdown;

    /**
     * Abdominal pains occur at least 4 days/month for > 2 months? dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_gi_symptom_history.abdominal_pain_occurrance']")
    public WebElement giSymptomsAbdominalPainsOccurAtLeast4DaysMonthForGreaterThan2MonthsDropdown;

    /**
     * Is pain associated with having bowel movements? dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_gi_symptom_history.painful_bowel_movements']")
    public WebElement giSymptomsIsPainAssociatedWithHavingBowelMovementsDropdown;

    /**
     * Any changes in bowel movement frequency? dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_gi_symptom_history.bowel_movement_frequency']")
    public WebElement giSymptomsAnyChangesInBowelMovementFrequencyDropdown;

    /**
     * Associated with change in bowel movement consistency? dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_gi_symptom_history.bowel_movement_consistency']")
    public WebElement giSymptomsAssociatedWithChangeInBowelMovementConsistencyDropdown;

    /**
     * Did pain resolve in relation to resolution of constipation dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_gi_symptom_history.pain_resolved_post_constipation']")
    public WebElement giSymptomsDidPainResolveInRelationToResolutionOfConstipationDropdown;

    /**
     * How many medications have been taken for abdominal pain dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_gi_symptom_history.abdominal_pain_meds_count']")
    public WebElement giSymptomsHowManyMedicationsHaveBeenTakenForAbdominalPainDropdown;

    /**
     * Is the pain not related to eating, menstrual cycles or other illness? dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_gi_symptom_history.pain_relation']")
    public WebElement giSymptomsIsThePainNotRelatedToEatingMenstrualCyclesOrOtherIllnessDropdown;

    /**
     * Has abdominal pain ever caused awakening from sleep at night? dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_gi_symptom_history.awoken_abdominal_pain']")
    public WebElement giSymptomsHasAbdominalPainEverCausedAwakeningFromSleepAtNightDropdown;

    /**
     * Has the abdominal pain caused weight loss? dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_gi_symptom_history.pain_weight_loss']")
    public WebElement giSymptomsHasTheAbdominalPainCausedWeightLossDropdown;

    /**
     * Is abdominal pain associated with loss of appetite? dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_gi_symptom_history.loss_of_appetite']")
    public WebElement giSymptomsIsAbdominalPainAssociatedWithLossOfAppetiteDropdown;

    /**
     * Is abdominal pain associated with nausea? dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_gi_symptom_history.pain_nausea']")
    public WebElement giSymptomsIsAbdominalPainAssociatedWithNauseaDropdown;

    /**
     * Is abdominal pain associated with vomiting? dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_gi_symptom_history.pain_vomiting']")
    public WebElement giSymptomsIsAbdominalPainAssociatedWithVomitingDropdown;

    /**
     * Is abdominal pain associated with headache? dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_gi_symptom_history.pain_headache']")
    public WebElement giSymptomsIsAbdominalPainAssociatedWithHeadacheDropdown;

    /**
     * Is abdominal pain associated with irritation to bright light? dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_gi_symptom_history.pain_bright_light']")
    public WebElement giSymptomsIsAbdominalPainAssociatedWithIrritationToBrightLightDropdown;

    /**
     * Is abdominal pain associated with looking pale? dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_gi_symptom_history.pain_pale']")
    public WebElement giSymptomsIsAbdominalPainAssociatedWithLookingPaleDropdown;

    /**
     * Have any medications ever been taken for abdominal pain? dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_gi_symptom_history.abdominal_pain_meds']")
    public WebElement giSymptomsHaveAnyMedicationsEverBeenTakenForAbdominalPainDropdown;

    /**
     * ---------------------END OF GI Abdominal pain Record---------------------
     */

    /**
     * ---------------------START OF GI Nausea Record---------------------
     */

    /**
     * Has bothersome nausea occurred for at least 2 weeks not related to meals? dropdown
     */
    @FindBy(css = "select[id='x_naci_family_coho_gi_symptom_history.nausea_2_weeks']")
    public WebElement giSymptomsHasBothersomeNauseaOccurredForAtLeast2WeeksNotRelatedToMealsDropdown;

    /**
     * Has nausea unrelated to vomiting occurred for at least 2 weeks dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_gi_symptom_history.nausea_unrelated_to_vomitting']")
    public WebElement giSymptomsHasNauseaUnrelatedToVomitingOccurredForAtLeast2WeeksDropdown;

    /**
     * Have any medications been taken for the nausea dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_gi_symptom_history.nausea_medication']")
    public WebElement giSymptomsHaveAnyMedicationsBeenTakenForTheNauseaDropdown;

    /**
     * Age medications taken input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_gi_symptom_history.age_medications_taken']")
    public WebElement giSymptomsAgeMedicationsTakenInputField;

    /**
     * Name of medications taken input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_gi_symptom_history.nausea_med_name']")
    public WebElement giSymptomsNameOfMedicationsTakenInputField;

    /**
     * ---------------------END OF GI Nausea Record---------------------
     */

    /**
     * ---------------------START OF GI Encopresis (Frequent or daily leakage of stool) Record---------------------
     */

    /**
     * Age medications were used input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_gi_symptom_history.encopresis_medication_age']")
    public WebElement giSymptomsEncopresisMedicationAgeInputField;

    /**
     * Medications used to treat encopresis textarea
     */
    @FindBy(xpath = "//textarea[@id='x_naci_family_coho_gi_symptom_history.encopresis_medications']\n")
    public WebElement giSymptomsMedicationsUsedToTreatEncopresisTextarea;

    /**
     * ---------------------END OF GI Encopresis (Frequent or daily leakage of stool) Record---------------------
     */

    /**
     * ---------------------START OF GI Aversion to specific foods or qualities/food textures Record---------------------
     */

    /**
     * Foods participant is averse to textarea
     */
    @FindBy(xpath = "//textarea[@id='x_naci_family_coho_gi_symptom_history.foods_participant_is_averse_too']")
    public WebElement giSymptomsFoodsParticipantIsAverseToTextarea;

    /**
     * ---------------------END OF GI Aversion to specific foods or qualities/food textures Record---------------------
     */

    /**
     * ---------------------START OF GI Feel full quickly or have abdominal pain that interferes with appetite Record---------------------
     */

    /**
     * The symptoms that occurred 4 or more days/month for at least two months text
     */
    @FindBy(css = " p[id='x_naci_family_coho_gi_symptom_history.the_symptoms_that_occurred_4_or_more_days_month_for_at_least_two_months_nonedit']")
    public WebElement giSymptomsTheSymptomsThatOccurred4OrMoreDaysMonthForAtLeastTwoMonthsText;

    /**
     * ---------------------END OF GI Feel full quickly or have abdominal pain that interferes with appetite Record---------------------
     */

    /**
     * ---------------------START OF GI Reflux/heartburn Record---------------------
     */

    /**
     * Has a pH probe or impedance study ever been completed dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_gi_symptom_history.ph_probe']")
    public WebElement giSymptomsHasAPHProbeOrImpedanceStudyEverBeenCompletedDropdown;

    /**
     * Have any reflux/heartburn medications ever been taken dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_gi_symptom_history.acid_refulx']")
    public WebElement giSymptomsHaveAnyRefluxHeartburnMedicationsEverBeenTakenDropdown;

    /**
     * Reflux/heartburn - Medication name input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_gi_symptom_history.medication_name']")
    public WebElement giSymptomsRefluxHeartburnMedicationNameInputField;

    /**
     * ---------------------END OF GI Reflux/heartburn Record---------------------
     */

    /**
     * ---------------------START OF GI Unintentional or unplanned weight loss Record---------------------
     */

    /**
     * How much weight has been lost input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_gi_symptom_history.weight_loss']")
    public WebElement giSymptomsHowMuchWeightHasBeenLostInputField;

    /**
     * Over what time period did weight loss occur input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_gi_symptom_history.weight_loss_time']")
    public WebElement giSymptomsOverWhatTimePeriodDidWeightLossOccurInputField;

    /**
     * Has the weight been gained back input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_gi_symptom_history.weight_gained_back']")
    public WebElement giSymptomsHasTheWeightBeenGainedBackInputField;

    /**
     * ---------------------END OF GI Unintentional or unplanned weight loss Record---------------------
     */

    /**
     * ---------------------START OF GI Diarrhea (loose liquid stool > 1 per day) Record---------------------
     */

    /**
     * Is there an urgency? (need to rush to the bathroom) dropdown
     */
    @FindBy(xpath = "//select[@name='x_naci_family_coho_gi_symptom_history.diarrhea_urgency']")
    public WebElement giSymptomsIsThereAnUrgencyDropdown;

    /**
     * Does diarrhea occur with crampy lower belly pain? dropdown
     */
    @FindBy(xpath = "//select[@name='x_naci_family_coho_gi_symptom_history.diarrhea_cramps']")
    public WebElement giSymptomsDoesDiarrheaOccurWithCrampyLowerBellyPainDropdown;

    /**
     * At what age were medications used to treat diarrhea? input field
     */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_gi_symptom_history.diarrhea_medication_age']")
    public WebElement giSymptomsAtWhatAgeWereMedicationsUsedToTreatDiarrheaInputField;

    /**
     * What medications have been used to treat diarrhea textarea
     */
    @FindBy(xpath = "//textarea[@name='x_naci_family_coho_gi_symptom_history.diarrhea_medications']")
    public WebElement giSymptomsWhatMedicationsHaveBeenUsedToTreatDiarrheaTextarea;

    /**
     * Is the diarrhea ever bloody? dropdown
     */
    @FindBy(xpath = "//select[@name='x_naci_family_coho_gi_symptom_history.bloody_diarrhea']")
    public WebElement giSymptomsIsTheDiarrheaEverBloodyDropdown;

    /**
     * When diarrhea occurs, how many episodes in one day? input field
     */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_gi_symptom_history.diarrhea_episodes']")
    public WebElement giSymptomsWhenDiarrheaOccursHowManyEpisodesInOneDayInputField;

    /**
     * ---------------------END OF GI Diarrhea (loose liquid stool > 1 per day) Record---------------------
     */

    /**
     * ---------------------END OF GI Symptoms SECTION---------------------
     */

    /**
     * ---------------------START OF Participant Lymphatic Issue History SECTION---------------------
     */

    /**
     * Participant Lymphatic Issue - Issue input field
     */
    @FindBy(xpath = "//input[@id='sys_display.x_naci_family_coho_participant_lymphatic_issue_history.issue']")
    public WebElement participantLymphaticIssueHistoryIssueInputField;

    /**
     * Date of first symptom input field
     */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_participant_lymphatic_issue_history.date']")
    public WebElement participantLymphaticIssueHistoryDateOfFirstSymptomInputField;

    /**
     * Date/age of first symptoms unknown checkbox
     */
    @FindBy(xpath = "//input[contains(@name,'sys_original.x_naci_family_coho_participant_lymphatic_issue_history.symptoms_time_unknown')]")
    public WebElement participantLymphaticIssueHistoryDateAgeOfFirstSymptomsUnknownCheckbox;

    /**
     * Treatment textarea
     */
    @FindBy(xpath = "//textarea[@name='x_naci_family_coho_participant_lymphatic_issue_history.treatment']")
    public WebElement participantLymphaticIssueHistoryTreatmentTextarea;

    /**
     * Name of treating physician textarea
     */
    @FindBy(xpath = "//textarea[@name='x_naci_family_coho_participant_lymphatic_issue_history.physician']")
    public WebElement participantLymphaticIssueHistoryNameOfTreatingPhysicianTextarea;

    /**
     * Date of diagnosis input field
     */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_participant_lymphatic_issue_history.diagnosis_date']")
    public WebElement participantLymphaticIssueHistoryDateOfDiagnosisInputField;

    /**
     * Date/age of diagnosis unknown checkbox
     */
    @FindBy(xpath = "//input[contains(@name,'sys_original.x_naci_family_coho_participant_lymphatic_issue_history.diagnosis_time_unknown')]")
    public WebElement participantLymphaticIssueHistoryDateAgeOfFirstDiagnosisUnknownCheckbox;

    /**
     * Please specify input field
     */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_participant_lymphatic_issue_history.please_specify']")
    public WebElement participantLymphaticIssueHistoryPleaseSpecifyInputField;

    /**
     * ---------------------END OF Participant Lymphatic Issue History SECTION---------------------
     */


    /**
     * ---------------------START OF Participant Kidney Issues SECTION---------------------
     */

    /**
     * Participant Kidney Issues - Issue drop down
     */
    @FindBy(xpath = "//select[@name='x_naci_family_coho_participant_kidney_issues.issue']")
    public WebElement participantKidneyIssuesIssueDropdown;

    /**
     * Date of first symptom input field
     */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_participant_kidney_issues.date_first_symptom']")
    public WebElement participantKidneyIssuesHistoryDateOfFirstSymptomInputField;

    /**
     * Date/age of first symptoms unknown checkbox
     */
    @FindBy(xpath = "//input[@name='sys_original.x_naci_family_coho_participant_kidney_issues.symptoms_time_unknown']")
    public WebElement participantKidneyIssuesHistoryDateAgeOfFirstSymptomsUnknownCheckbox;

    /**
     * Treatment textarea
     */
    @FindBy(xpath = "//textarea[@name='x_naci_family_coho_participant_kidney_issues.treatment']")
    public WebElement participantKidneyIssuesHistoryTreatmentTextarea;

    /**
     * Name of treating physician textarea
     */
    @FindBy(xpath = "//textarea[@name='x_naci_family_coho_participant_kidney_issues.physician_information']")
    public WebElement participantKidneyIssuesHistoryNameOfTreatingPhysicianTextarea;

    /**
     * Date of diagnosis input field
     */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_participant_kidney_issues.diagnosis_date']")
    public WebElement participantKidneyIssuesHistoryDateOfDiagnosisInputField;

    /**
     * Date/age of diagnosis unknown checkbox
     */
    @FindBy(xpath = "//input[@name='sys_original.x_naci_family_coho_participant_kidney_issues.diagnosis_time_unknown']")
    public WebElement participantKidneyIssuesHistoryDateAgeOfFirstDiagnosisUnknownCheckbox;

    /**
     * Please specify input field
     */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_participant_kidney_issues.please_specify']")
    public WebElement participantKidneyIssuesHistoryPleaseSpecifyInputField;

    /**
     * ---------------------END OF Participant Kidney Issues SECTION---------------------
     */


    /**
     * ---------------------START OF Spinal Information SECTION---------------------
     */

    /**
     * Type of curvature drop down
     */
    @FindBy(xpath = "//select[@name='x_naci_family_coho_participant_spinal_information.type']")
    public WebElement participantSpinalInformationTypeOfCurvatureDropdown;

    /**
     * Date of first symptom input field
     */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_participant_spinal_information.date']")
    public WebElement participantSpinalInformationDateOfFirstSymptomInputField;

    /**
     * Date/age of first symptoms unknown checkbox
     */
    @FindBy(xpath = "//input[@name='sys_original.x_naci_family_coho_participant_spinal_information.symtom_time_unknown']")
    public WebElement participantSpinalInformationDateAgeOfFirstSymptomsUnknownCheckbox;

    /**
     * Treatment textarea
     */
    @FindBy(xpath = "//textarea[@name='x_naci_family_coho_participant_spinal_information.treatment']")
    public WebElement participantSpinalInformationTreatmentTextarea;

    /**
     * Date of diagnosis input field
     */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_participant_spinal_information.diagnosis_date']")
    public WebElement participantSpinalInformationDateOfDiagnosisInputField;

    /**
     * Date/age of diagnosis unknown checkbox
     */
    @FindBy(xpath = "//input[@name='sys_original.x_naci_family_coho_participant_spinal_information.diagnosis_time_unknown']")
    public WebElement participantSpinalInformationDateAgeOfFirstDiagnosisUnknownCheckbox;

    /**
     * Please specify input field
     */
    @FindBy(xpath = "//select[@name='x_naci_family_coho_participant_spinal_information.type']")
    public WebElement participantSpinalInformationPleaseSpecifyInputField;

    /**
     * ---------------------END OF Spinal Information SECTION---------------------
     */

    /**
     * ---------------------START OF Joint Issues SECTION---------------------
     */

    /**
     * Issue input field
     */
    @FindBy(xpath = "//input[@name='sys_display.x_naci_family_coho_participants_joint_issues.issue']")
    public WebElement participantJointIssuesInputField;

    /**
     * Date of first symptom input field
     */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_participants_joint_issues.symptom_date']")
    public WebElement participantJointIssuesDateOfFirstSymptomInputField;

    /**
     * Date/age of first symptoms unknown checkbox
     */
    @FindBy(xpath = "//input[contains(@name,'sys_original.x_naci_family_coho_participants_joint_issues.symptom_time_unknown')]")
    public WebElement participantJointIssuesDateAgeOfFirstSymptomsUnknownCheckbox;

    /**
     * Treatment textarea
     */
    @FindBy(xpath = "//textarea[@name='x_naci_family_coho_participants_joint_issues.treatment']")
    public WebElement participantJointIssuesTreatmentTextarea;

    /**
     * Date of diagnosis input field
     */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_participants_joint_issues.diagnosis_date']")
    public WebElement participantJointIssuesDateOfDiagnosisInputField;

    /**
     * Date/age of diagnosis unknown checkbox
     */
    @FindBy(xpath = "//input[contains(@name,'sys_original.x_naci_family_coho_participants_joint_issues.diagnosis_time_unknown')]")
    public WebElement participantJointIssuesDateAgeOfFirstDiagnosisUnknownCheckbox;

    /**
     * Please specify input field
     */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_participants_joint_issues.please_specify']")
    public WebElement participantJointIssuesPleaseSpecifyInputField;

    /**
     * ---------------------END OF Joint Issues SECTION---------------------
     */

    /**
     * ---------------------START OF Bleeding Issues SECTION---------------------
     */

    /**
     * Issue input field
     */
    @FindBy(xpath = "//input[@name='sys_display.x_naci_family_coho_participant_bleeding_issues.issue']")
    public WebElement participantBleedingIssuesInputField;

    /**
     * Date of first symptom input field
     */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_participant_bleeding_issues.symptom_date']")
    public WebElement participantBleedingIssuesDateOfFirstSymptomInputField;

    /**
     * Date/age of first symptoms unknown checkbox
     */
    @FindBy(xpath = "//input[@name='sys_original.x_naci_family_coho_participant_bleeding_issues.first_symptom_time_unknown']")
    public WebElement participantBleedingIssuesDateAgeOfFirstSymptomsUnknownCheckbox;

    /**
     * Treatment textarea
     */
    @FindBy(xpath = "//textarea[@name='x_naci_family_coho_participant_bleeding_issues.treatment']")
    public WebElement participantBleedingIssuesTreatmentTextarea;

    /**
     * Name of treating hospital or physician input field
     */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_participant_bleeding_issues.physician_name']")
    public WebElement participantBleedingIssuesNameOfTreatingHospitalOrPhysicianInputField;

    /**
     * Date of diagnosis input field
     */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_participant_bleeding_issues.diagnosis_date']")
    public WebElement participantBleedingIssuesDateOfDiagnosisInputField;

    /**
     * Date/age of diagnosis unknown checkbox
     */
    @FindBy(xpath = "//input[@name='sys_original.x_naci_family_coho_participant_bleeding_issues.diagnosis_time_unknown']")
    public WebElement participantBleedingIssuesDateAgeOfFirstDiagnosisUnknownCheckbox;

    /**
     * Please specify input field
     */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_participant_bleeding_issues.please_specify']")
    public WebElement participantBleedingIssuesPleaseSpecifyInputField;

    /**
     * ---------------------END OF Bleeding Issues SECTION---------------------
     */


    /**
     * ---------------------START OF Blood Disorders SECTION---------------------
     */

    /**
     * Blood disorder/symptom input field
     */
    @FindBy(xpath = "//input[@name='sys_display.x_naci_family_coho_participant_blood_disorders.disorder_symptom']")
    public WebElement participantBloodDisordersDisorderSymptomInputField;

    /**
     * Date of first symptom input field
     */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_participant_blood_disorders.symptom_date']")
    public WebElement participantBloodDisordersDateOfFirstSymptomInputField;

    /**
     * Date/age of first symptoms unknown checkbox
     */
    @FindBy(xpath = "//input[@name='sys_original.x_naci_family_coho_participant_blood_disorders.diagnosis_time_unknown']")
    public WebElement participantBloodDisordersDateAgeOfFirstSymptomsUnknownCheckbox;

    /**
     * Treatment textarea
     */
    @FindBy(xpath = "//textarea[@name='x_naci_family_coho_participant_blood_disorders.treatment']")
    public WebElement participantBloodDisordersTreatmentTextarea;

    /**
     * Name of treating hospital or physician text area
     */
    @FindBy(xpath = "//textarea[@name='x_naci_family_coho_participant_blood_disorders.name_of_treating_phyisican']")
    public WebElement participantBloodDisordersNameOfTreatingHospitalOrPhysicianTextarea;

    /**
     * Date of diagnosis input field
     */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_participant_blood_disorders.diagnosis_date']")
    public WebElement participantBloodDisordersDateOfDiagnosisInputField;

    /**
     * Date/age of diagnosis unknown checkbox
     */
    @FindBy(xpath = "//input[@name='sys_original.x_naci_family_coho_participant_blood_disorders.diagnosis_time_unknown']")
    public WebElement participantBloodDisordersDateAgeOfFirstDiagnosisUnknownCheckbox;

    /**
     * Please specify input field
     */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_participant_blood_disorders.please_specify']")
    public WebElement participantBloodDisordersPleaseSpecifyInputField;

    /**
     * ---------------------END OF Blood Disorders SECTION---------------------
     */

    /**
     * ---------------------START OF Infections SECTION---------------------
     */

    /**
     * Infection dropdown
     */
    @FindBy(xpath = "//select[@name='x_naci_family_coho_participant_infection_history.infection']")
    public WebElement participantInfectionsInfectionDropdown;

    /**
     * Date of first symptom input field
     */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_participant_infection_history.symptom_date']")
    public WebElement participantInfectionsDateOfFirstSymptomInputField;

    /**
     * Date/age of first symptoms unknown checkbox
     */
    @FindBy(xpath = "//input[contains(@name,'sys_original.x_naci_family_coho_participant_infection_history.symptom_time_unknown')]")
    public WebElement participantInfectionsDateAgeOfFirstSymptomsUnknownCheckbox;

    /**
     * Treatment textarea
     */
    @FindBy(xpath = "//textarea[@name='x_naci_family_coho_participant_infection_history.treatment']")
    public WebElement participantInfectionsTreatmentTextarea;

    /**
     * Name of treating hospital or physician text area
     */
    @FindBy(xpath = "//textarea[@name='x_naci_family_coho_participant_infection_history.name_of_physician']")
    public WebElement participantInfectionsNameOfTreatingHospitalOrPhysicianTextarea;

    /**
     * Date of diagnosis input field
     */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_participant_infection_history.diagnosis_date']")
    public WebElement participantInfectionsDateOfDiagnosisInputField;

    /**
     * Date/age of diagnosis unknown checkbox
     */
    @FindBy(xpath = "//input[contains(@name,'sys_original.x_naci_family_coho_participant_infection_history.diagnosis_time_unknown')]")
    public WebElement participantInfectionsDateAgeOfFirstDiagnosisUnknownCheckbox;

    /**
     * Please specify input field
     */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_participant_infection_history.please_specify']")
    public WebElement participantInfectionsPleaseSpecifyInputField;

    /**
     * ---------------------END OF Infections SECTION---------------------
     */


    /**
     * ---------------------START OF Tumors SECTION---------------------
     */

    /**
     * Tumors input field
     */
    @FindBy(xpath = "//input[@name='sys_display.x_naci_family_coho_participant_tumor_history.tumor']")
    public WebElement participantTumorsInputField;

    /**
     * Date of first symptom input field
     */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_participant_tumor_history.symptom_date']")
    public WebElement participantTumorsDateOfFirstSymptomInputField;

    /**
     * Date/age of first symptoms unknown checkbox
     */
    @FindBy(xpath = "//input[@name='sys_original.x_naci_family_coho_participant_tumor_history.symptom_time_unknown']")
    public WebElement participantTumorsDateAgeOfFirstSymptomsUnknownCheckbox;

    /**
     * Date of diagnosis input field
     */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_participant_tumor_history.diagnosis_date']")
    public WebElement participantTumorsDateOfDiagnosisInputField;

    /**
     * Date/age of diagnosis unknown checkbox
     */
    @FindBy(xpath = "//input[@name='sys_original.x_naci_family_coho_participant_tumor_history.diagnosis_time_unknown']")
    public WebElement participantTumorsDateAgeOfFirstDiagnosisUnknownCheckbox;

    /**
     * Genetic testing dropdown
     */
    @FindBy(xpath = "//select[@name='x_naci_family_coho_participant_tumor_history.genetic_testing']")
    public WebElement participantTumorsGeneticTestingDropdown;

    /**
     * Please specify input field
     */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_participant_tumor_history.please_specify']")
    public WebElement participantTumorsPleaseSpecifyInputField;

    /**
     * ---------------------END OF Tumors SECTION---------------------
     */

    /**
     * ---------------------START OF Autoimmune History SECTION---------------------
     */

    /**
     * Condition input field
     */
    @FindBy(xpath = "//input[@name='sys_display.x_naci_family_coho_participant_autoimmune_history.condition']")
    public WebElement participantAutoimmuneHistoryInputField;

    /**
     * Age of first symptoms input field
     */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_participant_autoimmune_history.symptom_age']")
    public WebElement participantAutoimmuneHistoryAgeOfFirstSymptomInputField;

    /**
     * Date of first symptoms input field
     */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_participant_autoimmune_history.syptom_date']")
    public WebElement participantAutoimmuneHistoryDateOfFirstSymptomInputField;

    /**
     * Date of diagnosis input field
     */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_participant_autoimmune_history.diagnosis_date']")
    public WebElement participantAutoimmuneHistoryDateOfDiagnosisInputField;

    /**
     * Date/age of diagnosis unknown checkbox
     */
    @FindBy(xpath = "//input[@name='sys_original.x_naci_family_coho_participant_autoimmune_history.diagnosis_time_unknown']")
    public WebElement participantAutoimmuneHistoryDateAgeOfFirstDiagnosisUnknownCheckbox;

    /**
     * Treatment textarea
     */
    @FindBy(xpath = "//textarea[@name='x_naci_family_coho_participant_autoimmune_history.treatment']")
    public WebElement participantAutoimmuneHistoryTreatmentTextarea;

    /**
     * Name of treating hospital or physician text area
     */
    @FindBy(xpath = "//textarea[@name='x_naci_family_coho_participant_autoimmune_history.physician_info']")
    public WebElement participantAutoimmuneHistoryNameOfTreatingHospitalOrPhysicianTextarea;

    /**
     * Please specify input field
     */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_participant_autoimmune_history.please_specify']")
    public WebElement participantAutoimmuneHistoryPleaseSpecifyInputField;

    /**
     * ---------------------END OF Autoimmune History SECTION---------------------
     */


    /**
     * USE THIS METHOD TO DYNAMICALLY LOCATE TABS BY SPECIFYING EXACT TEXT
     *
     * @param text
     * @return
     */
    public WebElement dynamicTabLocator(String text) {
        return WebDriverUtils.webDriver.findElement(By.xpath("//span[text()='" + text + "']"));
    }

    /**
     * use this method to dynamically locate input fields by providing the input field label text.
     *
     * @param inputFieldLabel the label associated with the input field
     * @return WebElement representing the located input field
     */
    public static WebElement dynamicInputFieldLocator(String inputFieldLabel) {
        return locateByXpath("//span[normalize-space()='" + inputFieldLabel + "']/parent::label/parent::div/following-sibling::div/input");
    }

    /**
     * Use this method to dynamically locate lookup fields by providing the lookup field label text.
     *
     * @param lookupFieldLabel the label associated with the lookup field
     * @return WebElement representing the located lookup field
     */
    public static WebElement dynamicLookupFieldLocator(String lookupFieldLabel) {
        return locateByXpath("//span[normalize-space()='" + lookupFieldLabel + "']/parent::label/parent::div/following-sibling::div/input[2]");
    }

    /**
     * Use this method to dynamically locate select dropdowns by providing the select dropdown label text.
     *
     * @param selectDropdownLabel The label text of the select dropdown to be located.
     * @return The WebElement corresponding to the located dropdown element.
     */
    public static WebElement dynamicSelectDropdownLocator(String selectDropdownLabel) {
        return locateByXpath("//span[normalize-space()='" + selectDropdownLabel + "']/parent::label/parent::div/following-sibling::div/select");
    }

    public RAS_Survey_Native_View_Page() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}