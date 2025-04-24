package CHARMS.pages;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static Hooks.Hooks.softAssert;

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
    @FindBy(xpath = "//span[normalize-space()='Other hair description']")
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
     * Verifies the input field element with the expected value using SoftAssert and throws an error message if the assertion fails.
     *
     * @param inputFieldElm the WebElement input field element to verify
     * @param expectedValue the expected value to compare with the input field element's value attribute
     * @param errorMessage  the error message to throw in case of assertion failure
     */
    public static void verifyInputField(WebElement inputFieldElm, String expectedValue, String errorMessage) {
        softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(inputFieldElm), expectedValue, errorMessage);
    }

    /**
     * Verifies the checkbox element with the actual value against the value attribute of the checkbox element.
     *
     * @param expectedCheckboxValue the expected value to compare with the checkbox element's value attribute
     * @param checkBoxElm           the WebElement representing the checkbox element to verify
     * @param errorMessage          the error message to throw if the verification fails
     */
    public static void verifyCheckbox(String expectedCheckboxValue, WebElement checkBoxElm, String errorMessage) {
        softAssert.assertEquals(expectedCheckboxValue, CommonUtils.getAttributeValueOfValueAttribute(checkBoxElm), errorMessage);
    }

    /**
     * Converts the text content of a WebElement to a list of strings.
     *
     * @param webElement the WebElement containing the text to be processed
     * @return a List of strings extracted from the text content of the WebElement, separated by commas and excluding content within parentheses
     */
    public List<String> textToList(WebElement webElement) {
        List<String> output = new ArrayList<>();
        StringBuilder currentItem = new StringBuilder();
        int openParentheses = 0;
        for (char c : webElement.getText().toCharArray()) {
            if (c == ',' && openParentheses == 0) {
                output.add(currentItem.toString().trim());
                currentItem.setLength(0);
            } else {
                if (c == '(') {
                    openParentheses++;
                } else if (c == ')') {
                    openParentheses--;
                }
                currentItem.append(c);
            }
        }
        if (currentItem.length() > 0) {
            output.add(currentItem.toString().trim());
        }
        return output;
    }

    /**
     * Converts inches to centimeters.
     *
     * @param inches a String representation of the length in inches to be converted
     * @return a String representing the length converted from inches to centimeters
     */
    public String inchToCm(String inches) {
        return String.valueOf((int) Math.floor(Integer.parseInt(inches) * 2.54));
    }

    /**
     * Sorts and compares two lists of string values in a case-insensitive manner.
     *
     * @param actualListValues   the list of actual string values to be sorted and compared
     * @param expectedListValues the list of expected string values to be sorted and compared
     * @return true if the sorted actualListValues is equal to the sorted expectedListValues, false otherwise
     */
    public static boolean sortAndCompareLists(List<String> actualListValues, List<String> expectedListValues) {
        Collections.sort(actualListValues);
        Collections.sort(expectedListValues);
        System.out.println("Actual: " + actualListValues);
        System.out.println("Expected: " + expectedListValues);
        return actualListValues.equals(expectedListValues);
    }

    /**
     * Converts the text content of a WebElement to a list of strings.
     *
     * @param webElement the WebElement containing the text to be processed
     * @return a List of strings extracted from the text content of the WebElement, separated by commas and excluding content within parentheses
     */
    public List<String> textToListHyphenated(WebElement webElement) {
        List<String> output = new ArrayList<>();

        String regex = "(\\b[^,]+? - .*?)(?=, [^,]+? -|, Other \\(please specify\\)|$)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(webElement.getText());
        while (matcher.find()) {
            output.add(matcher.group(1).trim());
        }
        return output;
    }

    public RAS_Survey_Native_View_Page() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}