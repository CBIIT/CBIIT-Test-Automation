package CHARMS.pages;

import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NativeViewCGBIIQPage {

    /*****************************************************************
     *                                                               *
     *                    DEMOGRAPHICS TAB FIELDS                    *
     *                                                               *
     *****************************************************************/

    /**
     * Demographics tab
     */
    @FindBy(xpath = "//span[normalize-space()='Demographics']")
    public WebElement demographicsTab;

    /**
     * Participants city of birth text field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_cgb_iiq.born_city']")
    public WebElement participantsCityOfBirthTextField;

    /**
     * Participants state/province of birth text field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_cgb_iiq.born_state_province']")
    public WebElement participantsStateProvidenceOfTextField;

    /**
     * Participants country of birth text field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_cgb_iiq.born_country']")
    public WebElement participantsCountryOfBirthTextField;

    /**
     * Birth location unknown checkbox
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_cgb_iiq.birth_location_unknown']")
    public WebElement participantsBirthLocationUnknownCheckbox;

    /**
     * Biological mothers ancestral background text
     */
    @FindBy(xpath = "//p[@id='x_naci_family_coho_cgb_iiq.bio_mom_ancestry_nonedit']")
    public WebElement participantsBioMomAncestryNonEdit;

    /**
     * Biological dad's ancestral background text
     */
    @FindBy(xpath = "//p[@id='x_naci_family_coho_cgb_iiq.bio_dad_ancestry_nonedit']")
    public WebElement participantsBioDadAncestryNonEdit;

    /**
     * Family's religious background text
     */
    @FindBy(xpath = "//p[@id='x_naci_family_coho_cgb_iiq.family_religous_background_nonedit']")
    public WebElement familysReligiousBackgroundNonEdit;

    /**
     * Is the participant of Ashkenazi jewish descent? Dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_cgb_iiq.ashkenazi_jewish']")
    public WebElement isTheParticipantOfAshkenaziJewishDescentDropdown;

    /**
     * Was the participant raised by someone other than their own bio parent? Dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_cgb_iiq.rasied_by_non_bio_parent']")
    public WebElement raisedByNonBioParentDropdown;

    /**
     * Participant's marital status dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_cgb_iiq.marital_status']")
    public WebElement maritalStatusDropdown;

    /**
     * Total household income in the last 12 months dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_cgb_iiq.household_income']")
    public WebElement householdIncomeDropdown;

    /**
     * Participants highest level of schooling dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_cgb_iiq.highest_level_of_schooling']")
    public WebElement participantsHighestLevelOfSchoolingDropdown;

    /**
     * Participants usual job or main occupation during their lifetime text area
     */
    @FindBy(xpath = "//textarea[@id='x_naci_family_coho_cgb_iiq.lifetime_job_occupation']")
    public WebElement participantsUsualJobOrMainOccupationTextArea;

    /**
     * Does the participant have health insurance? Dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_cgb_iiq.health_insurance']")
    public WebElement doesTheParticipantHaveHealthInsuranceDropdown;

    /********************************************************************
     *                                                                  *
     *                    MEDICAL HISTORY TAB FIELDS                    *
     *                                                                  *
     ********************************************************************/

    /**
     * Medical History tab
     */
    @FindBy(xpath = "//span[normalize-space()='Medical History']")
    public WebElement medicalHistoryTab;

    /**
     * Participants birth timing dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_cgb_iiq.birth_timing']")
    public WebElement birthTimingDropdown;

    /**
     * Participant birth weight (grams) input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_cgb_iiq.birth_weight']")
    public WebElement birthWeightInputField;

    /**
     * Birth weight unknown checkbox
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_cgb_iiq.birth_weight_unknown']")
    public WebElement birthWeightUnknownCheckbox;

    /**
     * Participant birth length (cm) input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_cgb_iiq.birth_length']")
    public WebElement birthLengthInputField;

    /**
     * Birth length unknown checkbox
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_cgb_iiq.birth_length_unknown']")
    public WebElement birthLengthUnknownCheckbox;

    /**
     * Participants head circumference at birth (cm) input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_cgb_iiq.head_circumference_at_birth']")
    public WebElement headCircumferenceAtBirthInputField;

    /**
     * Head circumference unknown checkbox
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_cgb_iiq.head_circumference_unknown']")
    public WebElement headCircumferenceUnknownCheckbox;

    /**
     * Are participants bio parents blood-related dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_cgb_iiq.bio_parents_related']")
    public WebElement bioParentsRelatedDropdown;

    /**
     * Is participant a twin or multiple birth? dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_cgb_iiq.twin_multiple_birth']")
    public WebElement twinMultipleBirthDropdown;

    /**
     * Participant conceived using in vitro fertilization dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_cgb_iiq.in_vitro_fertilization']")
    public WebElement inVitroFertilizationDropdown;

    /**
     * Has the participant been evaluated for genetic disease or syndrome? dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_cgb_iiq.genetic_evaluation']")
    public WebElement hasBeenEvaluatedForGeneticDiseaseOrSyndromeEvaluationDropdown;

    /**
     * Do you have genetic test results you can upload dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_cgb_iiq.genetic_test_results']")
    public WebElement doYouHaveGeneticTestResultsToUploadDropdown;

    /**
     * Has the participant been diagnosed with cancer and/or benign tumor? dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_cgb_iiq.participant_cancer']")
    public WebElement participantDiagnosedWithCancerOrBenignTumorDropdown;

    /**********************************************************************
     *                                                                    *
     *                    PHYSICAL FINDINGS TAB FIELDS                    *
     *                                                                    *
     *********************************************************************/

    /**
     * Physical Findings tab
     */
    @FindBy(xpath = "//span[normalize-space()='Physical Findings']")
    public WebElement physicalFindingsTab;

    /**
     * Current height (CM) input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_cgb_iiq.current_height']")
    public WebElement currentHeightInputField;

    /**
     * Current height unknown checkbox
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_cgb_iiq.current_height_unknown']")
    public WebElement currentHeightUnknownCheckbox;

    /**
     * Weight at 18 years of age (kg) input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_cgb_iiq.weight_at_18']")
    public WebElement weightAt18InputField;

    /**
     * Reason weight at 18 unknown dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_cgb_iiq.reason_weight_at_18_unknown']")
    public WebElement reasonWeightAt18UnknownDropdown;

    /**
     * Weight at 30 years of age (kg) input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_cgb_iiq.weight_at_30']")
    public WebElement weightAt30InputField;

    /**
     * Reason weight at 30 unknown dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_cgb_iiq.reason_weight_at_30_unknown']")
    public WebElement reasonWeightAt30UnknownDropdown;

    /**
     * Age at highest weight input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_cgb_iiq.age_at_highest_weight']")
    public WebElement ageAtHighestWeightInputField;

    /**
     * Current weight (kg) input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_cgb_iiq.current_weight']")
    public WebElement currentWeightInputField;

    /**
     * Current weight unknown checkbox
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_cgb_iiq.current_weight_unknown']")
    public WebElement currentWeightUnknownCheckbox;

    /**
     * Weight at 40 years of age (kg) input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_cgb_iiq.weight_at_40']")
    public WebElement weightAt40InputField;

    /**
     * Reason weight at 40 unknown dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_cgb_iiq.reason_weight_at_40_unknown']")
    public WebElement reasonWeightAt40UnknownDropdown;

    /**
     * Highest weight during lifetime? (excluding pregnancy) (kg) input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_cgb_iiq.most_participant_has_weighed']")
    public WebElement highestWeightDuringLifetimeInputField;

    /**
     * Reason for highest weight unknown dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_cgb_iiq.reason_weight_at_highest_unknown']")
    public WebElement reasonHighestWeightUnknownDropdown;

    /*************************************************************************
     *                                                                       *
     *                    REPRODUCTIVE HISTORY TAB FIELDS                    *
     *                                                                       *
     *************************************************************************/

    /**
     * Reproductive History tab
     */
    @FindBy(xpath = "//span[normalize-space()='Reproductive History']")
    public WebElement reproductiveHistoryTab;

    /**
     * Have you had a menstrual period? Dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_cgb_iiq.menstrual_period']")
    public WebElement haveYouHadAMenstrualPeriodDropdown;

    /**
     * Reason for no periods input field
     */
    @FindBy(xpath = "//input[@id='sys_display.x_naci_family_coho_cgb_iiq.reason_for_no_periods']")
    public WebElement reasonForNoPeriodsInputField;

    /**
     * Has the participant ever been pregnant dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_cgb_iiq.pregnant']")
    public WebElement hasTheParticipantEverBeenPregnantDropdown;

    /**
     * Has participant tried to become pregnant for a year or more without success dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_cgb_iiq.pregnancy_success']")
    public WebElement hasParticipantTriedToBecomePregnantForYearOrMoreWithoutSuccessDropdown;

    /**
     * Has the participant consulted a doctor because of difficulty getting pregnant? Dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_cgb_iiq.consulted_doctor']")
    public WebElement hasParticipantConsultedADoctorBecauseOfDifficultyGettingPregnantDropdown;

    /**
     * Was the participant prescribed female hormones? Dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_cgb_iiq.female_hormones']")
    public WebElement wasParticipantPrescribedFemaleHormonesDropdown;

    /**
     * Has participant taken pills, injections or implants for birth control dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_cgb_iiq.pills_injections_implants']")
    public WebElement hasParticipantTakenPillsInjectionsImplantsForBirthControlDropdown;

    /**
     * Total Live Births input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_cgb_iiq.total_livebirths']")
    public WebElement totalLiveBirthsInputField;

    /**
     * Total Miscarriages input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_cgb_iiq.total_miscarriages']")
    public WebElement totalMiscarriagesInputField;

    /**
     * Total Stillbirths input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_cgb_iiq.total_stillbirths']")
    public WebElement totalStillbirthsInputField;

    public NativeViewCGBIIQPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}
