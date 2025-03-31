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


    /** ---------------------END OF Heart SECTION--------------------- */

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
     * Does the participant have jaw or temporomandibular joint pain
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
     * Has the participant had elective jaw surgery dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.jaw_surgery']")
    public WebElement hasTheParticipantYouHadElectiveJawSurgeryDropdown;

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
     * Does the participant have any numbness in or around the mouth
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.mouth_numbness']")
    public WebElement doesTheParticipantHaveAnyNumbnessInOrAroundTheMouthDropdown;

    /**
     * Do the participant's teeth feel sensitive to hot or cold food?
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
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.self_concious']")
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
     * How would the participant rate their teeth and gums
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
    public WebElement isAnythingUnusualAboutTheParticipantSTeethOrMouthDropdown;

    /**
     * Please specify(Is anything unusual about the participant's teeth or mouth)
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
     * @param actualCheckboxValue the actual value to compare with the checkbox element's value attribute
     * @param checkBoxElm         the WebElement representing the checkbox element to verify
     * @param errorMessage        the error message to throw if the verification fails
     */
    public static void verifyCheckbox(String actualCheckboxValue, WebElement checkBoxElm, String errorMessage) {
        softAssert.assertEquals(actualCheckboxValue, CommonUtils.getAttributeValueOfValueAttribute(checkBoxElm), errorMessage);

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