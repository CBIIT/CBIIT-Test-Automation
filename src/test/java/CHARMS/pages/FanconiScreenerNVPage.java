package CHARMS.pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.nci.automation.web.WebDriverUtils;
import APPS_COMMON.PageInitializers.PageInitializer;

public class FanconiScreenerNVPage extends PageInitializer {
    /* *************************************************************** */
    /* ********** LOCATORS IN FANCONI STUDY SCREENER ***************** */
    /* *************************************************************** */

    public FanconiScreenerNVPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }

    /* Method to dynamically locate elements in Native View */
    public WebElement dynamicLocatorContainsText(String text) {
        return WebDriverUtils.webDriver.findElement(By.xpath("//*[contains(text(),'" + text + "')]"));
    }

    /* Method to dynamically locate elements in Native View */
    public WebElement dynamicLocatorUsingNormalizeSpace(String text) {
        return WebDriverUtils.webDriver.findElement(By.xpath("//*[normalize-space()='" + text + "']"));
    }

    /* Method to dynamically locate elements in Native View */
    public WebElement dynamicLocatorUsingSpanNormalizeSpace(String text) {
        return WebDriverUtils.webDriver.findElement(By.xpath("(//span[normalize-space()='" + text + "'])[1]"));
    }

    /* Method to dynamically locate elements in Native View */
    public WebElement dynamicLocatorUsingNormalizeSpaceInSpan(String text) {
        return WebDriverUtils.webDriver.findElement(By.xpath("//span[@class='label-text'][normalize-space()='" + text + "']"));
    }

    /* Use This Method To Dynamically Locate Record Buttons On */
    public WebElement dynamicReferralPreviewButtonLocator(String text) {
        return WebDriverUtils.webDriver.findElement(By.xpath("//a[normalize-space()='" + text + "']//parent::a"));
    }

    /* Use This Method To Dynamically Preview Record Buttons On */
    public WebElement dynamicPreviewButtonLocator(String text) {
        return WebDriverUtils.webDriver.findElement(By.xpath("(//a[@aria-label='Preview record: " + text + "'])[2]"));
    }

    /* Use This Method To Dynamically Preview Record Buttons On */
    public WebElement dynamicPreviewButtonLocator1(String text) {
        return WebDriverUtils.webDriver.findElement(By.xpath("(//a[@aria-label='Preview record: '])[2]"));
    }

    /* Method to dynamically locate elements in Native View */
    public WebElement dynamicLocatorUsingDataNormalizeSpaceInSpan(String text) {
        return WebDriverUtils.webDriver.findElement(By.xpath("(//span[@data-html='false'][normalize-space()='" + text + "'])[1]"));
    }

    /* Method to dynamically locate Input Value elements in Native View */
    public WebElement dynamicLocatorForInputElements(String text) {
        return WebDriverUtils.webDriver.findElement(By.xpath("(//input[@id='sys_display.x_naci_family_coho_participant_study." + text + "'])[1]"));
    }

    /* Method to dynamically locate Input Read Value elements in Fanconi Study Screener in Native View */
    public WebElement dynamicLocatorForReadOnlyInputElementsInFAScreener(String text) {
        return WebDriverUtils.webDriver.findElement(By.xpath("(//input[@id='sys_readonly.x_naci_family_coho_fanconi_study_screener." + text + "'])[1]"));
    }

    /* Method to dynamically locate Input Value elements in Fanconi Study Screener in Native View */
    public WebElement dynamicLocatorForInputElementsInFAScreener(String text) {
        return WebDriverUtils.webDriver.findElement(By.xpath("(//input[@id='x_naci_family_coho_fanconi_study_screener." + text + "'])[1]"));
    }

    /* Method to dynamically locate Input Value elements of family member in Fanconi Study Screener in Native View */
    public WebElement dynamicLocatorForInputElementsOfFamilyInFAScreener(String text) {
        return WebDriverUtils.webDriver.findElement(By.xpath("(//input[@id='x_naci_family_coho_fanconi_study_screener.family_member_record." + text + "'])[1]"));
    }

    /* Method to dynamically locate Select Value elements in Fanconi Screener page in Native View */
    public WebElement dynamicLocatorForSelectElementsInFAScreenerPage(String text) {
        return WebDriverUtils.webDriver.findElement(By.xpath("(//select[@name='x_naci_family_coho_fanconi_study_screener.family_member_record." + text + "'])[1]"));
    }

    /* Method to dynamically locate Select Value elements in Fanconi Screener page in Native View */
    public WebElement dynamicLocatorForSelectElementInFAScreenerPage(String text) {
        return WebDriverUtils.webDriver.findElement(By.xpath("(//select[@id='x_naci_family_coho_fanconi_study_screener." + text + "'])[1]"));
    }

    /* Method to dynamically locate Select Value elements in Native View */
    public WebElement dynamicLocatorForSelectElements(String text) {
        return WebDriverUtils.webDriver.findElement(By.xpath("(//select[@id='x_naci_family_coho_participant_study." + text + "'])[1]"));
    }

    /* Method to dynamically locate Textarea Value elements in Native View */
    public WebElement dynamicLocatorForTextAreaElements(String text) {
        return WebDriverUtils.webDriver.findElement(By.xpath("(//textarea[@id='x_naci_family_coho_fanconi_study_screener." + text + "'])[1]"));
    }

    /* Method to dynamically locate Intake participates in another study Value  in Fanconi Study Screener in Native View */
    public WebElement dynamicLocatorForInputElementsOfIntakeParticipatesInFAScreener(String text) {
        return WebDriverUtils.webDriver.findElement(By.xpath("(//input[@id='x_naci_family_coho_intake_participate_another_study." + text + "'])[1]"));
    }

    /* Method to dynamically locate CheckBox Select elements in Native View */
    public WebElement dynamicLocatorForCheckBoxElements(String text) {
      //  return WebDriverUtils.webDriver.findElement(By.xpath("(//label[@id='label.ni.x_naci_family_coho_participant_study." + text + "'])[1]"));
        return WebDriverUtils.webDriver.findElement(By.xpath("(//label[@id='label.ni.x_naci_family_coho_participant_study." + text + "'])[1]"));
    }

    /* Method to dynamically locate CheckBox Select elements in Native View */
    public WebElement dynamicLocatorForCheckBoxElements(int i) {
        return WebDriverUtils.webDriver.findElement(By.xpath("(//span[@class='input-group-checkbox'])["+ i +"]"));
    }

    /* Intake participates in another study tab--> Study Contact Person */
    @FindBy(xpath = "(//input[@id='x_naci_family_coho_intake_participate_another_study.study_contact_person'])[1]")
    public WebElement nVFScreenerIntakeParticipatesStudyContactPersonTextBox;

    /* NV Fanconi Screener: NIH MRN number Input value  */
    @FindBy(xpath = "(//input[@id='x_naci_family_coho_participant_study.participant.nih_number'])[1]")
    public WebElement nVParticipantNIHMRNNumberInput;

    /* NV Fanconi Screener: Subject Id Input value  */
    @FindBy(xpath = "(//input[@id='sys_readonly.x_naci_family_coho_participant_study.participant.full_family_id'])[1]")
    public WebElement nVParticipantSubjectIdInput;

    /* NV Fanconi Screener: Participant Studies tab in Navigator */
    @FindBy(xpath = "(//span[normalize-space()='Participant Studies (1)'])[1]")
    public WebElement nVParticipantStudiesTab;

    /* NV Fanconi Screener: All referaal button in Navigator */
    @FindBy(xpath = "(//div[@class='sn-widget-list-title'][normalize-space()='All Referrals'])[1]")
    public WebElement nVAllReferralsButton;

    /* CHARMS Referrals List view-> iFrame */
    @FindBy(xpath = "//iframe[@id='gsft_main']")
    public WebElement nVReferralsListViewiFrame;

    /* NV Fanconi Screener: Participant Details Preview button */
    @FindBy(xpath = "(//a[@title='Preview Fanconi-1 tester-1'])[1]")
    public WebElement nVFamilyMembersPreviewButton;

    /* NV Fanconi Screener: Participant Details Preview button */
    @FindBy(xpath = "//*[text()='Fanconi-6 tester-6']/parent::tr/td[2]")
    public WebElement nVParticipantDetailsPreviewButton;

    /* NV Fanconi Screener: Participant Details Open Record button */
    @FindBy(xpath = "(//a[normalize-space()='Open Record'])[1]")
    public WebElement nVFamilyMembersOpenRecordButton;

    /* *************************************************************** */
    /* ********** LOCATORS In General Section ***************** */
    /* *************************************************************** */

    /* NV Fanconi Screener: Switch to Iframe */
    @FindBy(xpath = "//iframe[@id='gsft_main']")
    public WebElement nVFScreenerIframe;

    /* NV Fanconi Screener: Proband Fanconi Screener preview record button */
    @FindBy(xpath = "(//button[@name='viewr.x_naci_family_coho_family_history_details.proband_screener'])[1]")
    public WebElement nVFScreenerPreviewRecordButton;

    /* NV Fanconi Screener: Open record button */
    @FindBy(xpath = "(//a[normalize-space()='Open Record'])[1]")
    public WebElement nVOpenRecordButton;

    /* NV Fanconi Screener: Number Value */
    @FindBy(xpath = "(//span[@class='form_display_value'])[1]")
    public WebElement nVFScreenerNumberValue;

    /* NV Fanconi Screener: Number */
    @FindBy(xpath = "(//input[@name='x_naci_family_coho_fanconi_study_screener.number'])[1]")
    public WebElement nVFScreenerNumber;

    /* NV Fanconi Screener: Does the participant need legal representation */
    @FindBy(xpath = "(//select[@name='x_naci_family_coho_fanconi_study_screener.family_member_record.proxy_required'])[1]")
    public WebElement nVFScreenerDoesParticipantNeedLegalRepresentation;

    /* NV Fanconi Screener: Study */
    @FindBy(xpath = "(//input[@name='sys_display.x_naci_family_coho_fanconi_study_screener.study'])[1]")
    public WebElement nVFScreenerStudy;

    /* NV Fanconi Screener: Family Member Record */
    @FindBy(xpath = "(//input[@name='sys_display.x_naci_family_coho_fanconi_study_screener.family_member_record'])[1]")
    public WebElement nVFScreenerFamilyMemberRecord;

    /* NV Fanconi Screener: Vital Status */
    @FindBy(xpath = "(//select[@name='x_naci_family_coho_fanconi_study_screener.family_member_record.person_alive'])[1]")
    public WebElement nVFScreenerVitalStatus;

    /* NV Fanconi Screener: Date of death */
    @FindBy(xpath = "(//input[@name='x_naci_family_coho_fanconi_study_screener.family_member_record.death_date'])[1]")
    public WebElement nVFScreenerDateOfDeath;

    /* NV Fanconi Screener: Eligibility Status */
    @FindBy(xpath = "(//select[@name='sys_readonly.x_naci_family_coho_fanconi_study_screener.family_member_record.eligibility_status'])[1]")
    public WebElement nVFScreenerEligibilityStatus;

    /* NV Fanconi Screener: Enrollment Status */
    @FindBy(xpath = "(//select[@name='sys_readonly.x_naci_family_coho_fanconi_study_screener.family_member_record.enrollment_status'])[1]")
    public WebElement nVFScreenerEnrollmentStatus;

    /* NV Fanconi Screener: Date Consent Requested */
    @FindBy(xpath = "(//input[@name='x_naci_family_coho_fanconi_study_screener.family_member_record.date_consent_requested'])[1]")
    public WebElement nVFScreenerDateConsentRequested;

    /* NV Fanconi Screener: Consent Reminder Count */
    @FindBy(xpath = "(//input[@name='x_naci_family_coho_fanconi_study_screener.consent_reminder_count'])[1]")
    public WebElement nVFScreenerConsentReminderCount;

    /* *************************************************************** */
    /* ********** LOCATORS In Contact Information Tab **************** */
    /* *************************************************************** */

    /* Fanconi Screener Referral Preview button */
    @FindBy(xpath = "(//button[@id='viewr.x_naci_family_coho_participant_study.screener_ref'])[1]")
    public WebElement nVFScreenerRefPreviewRecordButton;

    /* CONTACT INFO tab : Contact Information */
    @FindBy(xpath = "(//span[normalize-space()='Contact Information'])[1]")
    public WebElement nVFScreenerContactInfoTab;

    /* CONTACT INFO tab->FirstName */
    @FindBy(xpath = "(//input[@name='x_naci_family_coho_fanconi_study_screener.family_member_record.first_name'])[1]")
    public WebElement nVFScreenerFirstName;

    /* CONTACT INFO tab->MiddleName */
    @FindBy(xpath = "(//input[@name='x_naci_family_coho_fanconi_study_screener.family_member_record.middle_name'])[1]")
    public WebElement nVFScreenerMiddleName;

    /* CONTACT INFO tab->LastName */
    @FindBy(xpath = "(//input[@name='x_naci_family_coho_fanconi_study_screener.family_member_record.last_name'])[1]")
    public WebElement nVFScreenerLastName;

    /* CONTACT INFO tab->ProxyFirstName */
    @FindBy(xpath = "(//input[@name='x_naci_family_coho_fanconi_study_screener.family_member_record.proxy_first_name'])[1]")
    public WebElement nVFScreenerProxyFirstName;

    /* CONTACT INFO tab->ProxyMiddleName */
    @FindBy(xpath = "(//input[@name='x_naci_family_coho_fanconi_study_screener.family_member_record.proxy_middle_name'])[1]")
    public WebElement nVFScreenerProxyMiddleName;

    /* CONTACT INFO tab->ProxyLastName */
    @FindBy(xpath = "(//input[@name='x_naci_family_coho_fanconi_study_screener.family_member_record.proxy_last_name'])[1]")
    public WebElement nVFScreenerProxyLastName;

    /* CONTACT INFO tab->Contact Street Address TextBox */
    @FindBy(xpath = "(//input[@name='x_naci_family_coho_fanconi_study_screener.family_member_record.street_address'])[1]")
    public WebElement nVFScreenerStreetAddress;

    /* CONTACT INFO tab->What is your relationship to this person? Dropdown */
    @FindBy(xpath = "(//select[@id='x_naci_family_coho_fanconi_study_screener.relationship'])[1]")
    public WebElement nVFScreenerRelationShip;

    /* CONTACT INFO tab->Contact City TextBox */
    @FindBy(xpath = "(//input[@name='x_naci_family_coho_fanconi_study_screener.family_member_record.city'])[1]")
    public WebElement nVFScreenerCity;

    /* CONTACT INFO tab->Contact State TextBox */
    @FindBy(xpath = "(//input[@name='x_naci_family_coho_fanconi_study_screener.family_member_record.state])[1]")
    public WebElement nVFScreenerState;

    /* CONTACT INFO tab->Contact ZipCode TextBox */
    @FindBy(xpath = "(//input[@name='x_naci_family_coho_fanconi_study_screener.family_member_record.zipcode'])[1]")
    public WebElement nVFScreenerZipcode;

    /* CONTACT INFO tab->Contact Country DropDown */
    @FindBy(xpath = "(//select[@name='x_naci_family_coho_fanconi_study_screener.family_member_record.country'])[1]")
    public WebElement nVFScreenerCountry;

    /* CONTACT INFO tab->Contact Email TextBox */
    @FindBy(xpath = "(//input[@name='x_naci_family_coho_fanconi_study_screener.family_member_record.email_address'])[1]")
    public WebElement nVFScreenerEmail;

    /* CONTACT INFO tab->Contact Home Phone TextBox */
    @FindBy(xpath = "(//input[@name='x_naci_family_coho_fanconi_study_screener.family_member_record.phone'])[1]")
    public WebElement nVFScreenerHomePhone;

    /* CONTACT INFO tab->Contact Cell Phone TextBox */
    @FindBy(xpath = "(//input[@name='x_naci_family_coho_fanconi_study_screener.family_member_record.cell_phone'])[1]")
    public WebElement nVFScreenerCellPhone;

    /* CONTACT INFO tab->Contact Work Phone TextBox */
    @FindBy(xpath = "(//input[@name='x_naci_family_coho_fanconi_study_screener.family_member_record.work_phone'])[1]")
    public WebElement nVFScreenerWorkPhone;

    /* CONTACT INFO tab->Contact Contact Preferred Phone TextBox */
    @FindBy(xpath = "(//input[@name='x_naci_family_coho_fanconi_study_screener.family_member_record.preferred_phone'])[1]")
    public WebElement nVFScreenerPreferredPhone;

    /* *************************************************************** */
    /* ********** LOCATORS In Demographic Tab ***************** */
    /* *************************************************************** */

    /* DEMOGRAPHICS tab */
    @FindBy(xpath = "(//span[normalize-space()='Demographics'])[1]")
    public WebElement nVFScreenerDemographicsTab;

    /* DEMOGRAPHICS tab->Date of Birth iFrame */
    @FindBy(xpath = "(//input[@name='x_naci_family_coho_fanconi_study_screener.family_member_record.date_of_birth_month_day_year'])[1]")
    public WebElement nVFScreenerDOB;

    /* DEMOGRAPHICS tab->Biological Gender? DropDown selected option */
    @FindBy(xpath = "(//select[@name='x_naci_family_coho_fanconi_study_screener.family_member_record.biological_gender'])[1]")
    public WebElement nVFScreenerBiologicalGender;

    /* DEMOGRAPHICS tab->Identified gender? DropDown selected option */
    @FindBy(xpath = "(//select[@name='x_naci_family_coho_fanconi_study_screener.family_member_record.screener_identified_gender'])[1]")
    public WebElement nVFScreenerIdentifiedGender;

    /* DEMOGRAPHICS tab->Participant Race (Select all that apply) */
    @FindBy(xpath = "(//p[@id='x_naci_family_coho_fanconi_study_screener.family_member_record.race_nonedit'])[1]")
    public WebElement nVFScreenerRace;

    /* DEMOGRAPHICS tab->Participant Race Other TextBox */
    @FindBy(xpath = "(//input[contains(@onchange,\"onChange('x_naci_family_coho_fanconi_study_screener.family_member_record.other_race');\")])[1]")
    public WebElement nVFScreenerRaceOtherText;

    /* DEMOGRAPHICS tab->Is the participant adopted? DropDown selected option */
    @FindBy(xpath = "(//select[@name='x_naci_family_coho_fanconi_study_screener.family_member_record.adopted'])[1]")
    public WebElement nVFScreenerIsTheParticipantAdopted;

    /* DEMOGRAPHICS tab->Ethnicity? DropDown selected option */
    @FindBy(xpath = "(//select[@name='x_naci_family_coho_fanconi_study_screener.family_member_record.ethnicity'])[1]")
    public WebElement nVFScreenerEthnicity;

    /* DEMOGRAPHICS tab->Pronouns DropDown selected option */
    @FindBy(xpath = "(//select[contains(@name,'x_naci_family_coho_fanconi_study_screener.family_member_record.pronouns')])[1]")
    public WebElement nVFScreenerPronouns;

    /* DEMOGRAPHICS tab - -> Other Pronouns textBox */
    @FindBy(xpath = "(//input[@name='x_naci_family_coho_fanconi_study_screener.family_member_record.pronouns_other'])[1]")
    public WebElement nVFScreenerPronounsOtherText;

    /* *************************************************************** */
    /* ********** LOCATORS In Fanconi History Tab ***************** */
    /* *************************************************************** */

    /* Fanconi History tab-> */
    @FindBy(xpath = "(//span[normalize-space()='Fanconi History'])[1]")
    public WebElement nVFScreenerHistoryTab;

    /* Fanconi History tab->History of Fanconi anemia study involvement: DropDown selected option */
    @FindBy(xpath = "(//select[@name='x_naci_family_coho_fanconi_study_screener.history_of_fanconi_anemia_study_involvement'])[1]")
    public WebElement nVFScreenerHistoryOfFanconiAnemiaStudyInvolvement;

    /* Fanconi History tab->Fanconi anemia diagnosis?: DropDown selected option */
    @FindBy(xpath = "(//select[@name='x_naci_family_coho_fanconi_study_screener.fanconi_anemia_diagnosis'])[1]")
    public WebElement nVFScreenerFanconiAnemiaDiagnosis;

    /* Fanconi History tab->Age at Fanconi diagnosis: TextBox */
    @FindBy(xpath = "(//input[@name='x_naci_family_coho_fanconi_study_screener.age_at_fanconi_diagnosis'])[1]")
    public WebElement nVFScreenerAgeAtFanconiDiagnosis;

    /* Fanconi History tab->Date of Fanconi diagnosis: Date Picker */
    @FindBy(xpath = "(//input[@name='x_naci_family_coho_fanconi_study_screener.date_of_fanconi_diagnosis'])[1]")
    public WebElement nVFScreenerDateOfFanconiDiagnosis;

    /* *************************************************************** */
    /* ********** LOCATORS In Genetic Testing History Tab *********** */
    /* *************************************************************** */

    /* Fanconi History tab-> */
    @FindBy(xpath = "(//span[normalize-space()='Genetic Testing History'])[1]")
    public WebElement nVFScreenerGeneticTestingHistoryTab;

    /* Genetic Testing History tab->Complementation Testing previously done?Dropdown selected option */
    @FindBy(xpath = "(//select[@name='x_naci_family_coho_fanconi_study_screener.complementation_testing_previously_done'])[1]")
    public WebElement nVFScreenerIsComplementationTestingPreviouslyDone;

    /* Genetic Testing History tab->Genetic testing positive for Fanconi? Dropdown selected option */
    @FindBy(xpath = "(//select[@name='x_naci_family_coho_fanconi_study_screener.genetic_testing_positive_for_fanconi'])[1]")
    public WebElement nVFScreenerGeneticTestingPositiveForFanconi;

    /* Genetic Testing History tab->Does the participant have a copy of the genetic test results? Dropdown selected option */
    @FindBy(xpath = "(//select[@name='x_naci_family_coho_fanconi_study_screener.genetic_test_result'])[1]")
    public WebElement nVFScreenerDoesGeneticTestResultCopy;

    /* Genetic Testing History tab->Participants preferred method of delivering genetic test results: Dropdown selected option */
    @FindBy(xpath = "(//select[@name='x_naci_family_coho_fanconi_study_screener.participants_preferred_method_of_delivering_genetic_test_results'])[1]")
    public WebElement nVFScreenerGeneticTestResultsDeliveryMethod;

    /* *************************************************************** */
    /* ********** LOCATORS In FA Genes Tested Tab ***************** */
    /* *************************************************************** */

    /* FA Genes Tested tab */
    @FindBy(xpath = "(//span[normalize-space()='FA Genes Tested'])[1]")
    public WebElement nVFScreenerFAGenesTestedTab;

    /* FA Genes Tested tab->: FA Genes Tested CheckBoxes */
    @FindBy(xpath = "(//span[@class='input-group-checkbox'])")
    public List<WebElement> nVFScreenerFAGenesTested;

    /* FA Genes Tested tab->: Other genes/syndromes : TextBox */
    @FindBy(xpath = "(//input[contains(@aria-label,'Other genes/syndromes')])[1]")
    public WebElement nVFScreenerOtherGenesSyndrome;

    /* *************************************************************** */
    /* ********** LOCATORS In Medical History Tab ***************** */
    /* *************************************************************** */

    /* Medical History tab */
    @FindBy(xpath = "(//span[normalize-space()='Medical History'])[1]")
    public WebElement nVFScreenerMedicalHistoryTab;

    /* Medical History tab->: Ever diagnosed with Cancer? Dropdown selected option */
    @FindBy(xpath = "(//select[@name='x_naci_family_coho_fanconi_study_screener.ever_diagnosed_with_cancer'])[1]")
    public WebElement nVFScreenerEverDiagnosedWithCancer;

    /*Medical History tab->: Chromosome breakage test on blood: Dropdown selected option */
    @FindBy(xpath = "(//select[@name='x_naci_family_coho_fanconi_study_screener.chromosome_breakage_test_on_blood'])[1]")
    public WebElement nVFScreenerChromosomeBreakageTestOnBlood;

    /* Medical History tab->: Chromosome breakage test location Dropdown selected option */
    @FindBy(xpath = "(//select[@name='x_naci_family_coho_fanconi_study_screener.chromosome_breakage_test_location'])[1]")
    public WebElement nVFScreenerChromosomeBreakageTestLocation;

    /* Medical History tab->: Chromosome breakage result Dropdown selected option */
    @FindBy(xpath = "(//select[@name='x_naci_family_coho_fanconi_study_screener.chromosome_breakage_result'])[1]")
    public WebElement nVFScreenerChromosomeBreakageResult;

    /* Medical History tab->: Chromosome breakage test on skin Dropdown selected option */
    @FindBy(xpath = "(//select[@name='x_naci_family_coho_fanconi_study_screener.chromosome_breakage_test_on_skin'])[1]")
    public WebElement nVFScreenerChromosomeBreakageTestOnSkin;

    /*
     * Medical History tab->: Chromosome breakage skin test result Dropdown selected
     * option
     */
    @FindBy(xpath = "(//select[@name='x_naci_family_coho_fanconi_study_screener.chromosome_breakage_skin_test_result'])[1]")
    public WebElement nVFScreenerChromosomeBreakageSkinTestResult;

    /*
     * Medical History tab->: Chromosome Breakage Blood Test Result Delivery*
     * Dropdown selected option
     */
    @FindBy(xpath = "(//select[@name='x_naci_family_coho_fanconi_study_screener.test_result_delivery_method'])[1]")
    public WebElement nVFScreenerChromosomeBreakageBloodTestResultDelivery;

    /*
     * Medical History tab->: Diagnosed with Myelodsplastic Syndrome (MDS) Dropdown
     * selected option
     */
    @FindBy(xpath = "(//select[@name='x_naci_family_coho_fanconi_study_screener.diagnosed_with_mylodsplastic_syndrome_mds'])[1]")
    public WebElement nVFScreenerDiagnosedWithMyelodsplasticSyndrome;

    /* Medical History tab->: Age when myelodysplastic syndrome diagnosed Textbox */
    @FindBy(xpath = "(//input[@name='x_naci_family_coho_fanconi_study_screener.age_when_diagnosed_myelodysplastic_syndrome'])[1]")
    public WebElement nVFScreenerAgeWhenMyelodysplasticSyndromeDiagnosed;

    /*
     * Medical History tab->: Date when myelodysplastic syndrome diagnosed:
     * DatePicker
     */
    @FindBy(xpath = "(//input[@name='x_naci_family_coho_fanconi_study_screener.date_when_myelodysplastic_syndrome_diagnosed'])[1]")
    public WebElement nVFScreenerDateWhenMyelodysplasticSyndromeDiagnosed;

    /*
     * Medical History tab->: Ever received transplant (bone marrow/stem cell/ cord
     * blood)? Dropdown selected option
     */
    @FindBy(xpath = "(//select[@name='x_naci_family_coho_fanconi_study_screener.ever_received_transplant_bone_marrow_stem_cell_cord_blood'])[1]")
    public WebElement nVFScreenerEverReceivedBoneMarrowTransplant;

    /*
     * Medical History tab->: Transplant treatment institution (bone marrow/stem
     * cell/ cord blood): Textbox
     */
    @FindBy(xpath = "(//input[@name='x_naci_family_coho_fanconi_study_screener.transplant_treatment_institution_bone_marrow_stem_cell_cord_blood'])[1]")
    public WebElement nVFScreenerTransplantTreatmentInstitution;

    /* Medical History tab->: Age at transplant : Textbox */
    @FindBy(xpath = "(//input[@name='x_naci_family_coho_fanconi_study_screener.age_at_transplant'])[1]")
    public WebElement nVFScreenerAgeAtTransplant;

    /* Medical History tab->: Month of transplant: Textbox */
    @FindBy(xpath = "(//input[@name='x_naci_family_coho_fanconi_study_screener.month_of_transplant'])[1]")
    public WebElement nVFScreenerMonthOfTransplant;

    /* Medical History tab->: Year of transplant: Textbox */
    @FindBy(xpath = "(//input[@name='x_naci_family_coho_fanconi_study_screener.year_of_transplant'])[1]")
    public WebElement nVFScreenerYearOfTransplant;

    /* Medical History tab->: Donor type Dropdown selected option */
    @FindBy(xpath = "(//select[@name='x_naci_family_coho_fanconi_study_screener.transplant_donor_type'])[1]")
    public WebElement nVFScreenerDonorType;

    /* Medical History tab->: Transplant donor match Dropdown selected option */
    @FindBy(xpath = "(//select[@name='x_naci_family_coho_fanconi_study_screener.transplant_donor_match'])[1]")
    public WebElement nVFScreenerTransplantDonorMatch;

    /* Medical History tab->: Stem cell source Dropdown selected option */
    @FindBy(xpath = "(//select[@name='x_naci_family_coho_fanconi_study_screener.stem_cell_source'])[1]")
    public WebElement nVFScreenerStemCellSource;

    /* Medical History tab->: Current Medications: Text */
    @FindBy(xpath = "(//textarea[@name='x_naci_family_coho_fanconi_study_screener.current_medications'])[1]")
    public WebElement nVFScreenerCurrentMedications;

    /* Medical History tab->: Health Care Provider Name: Text */
    @FindBy(xpath = "(//input[@name='x_naci_family_coho_fanconi_study_screener.health_care_provider_name'])[1]")
    public WebElement nVFScreenerHealthCarProviderName;

    /* Medical History tab->: Health Care Provider Address: Text */
    @FindBy(xpath = "(//textarea[@name='x_naci_family_coho_fanconi_study_screener.health_care_provider_address'])[1]")
    public WebElement nVFScreenerHealthCareProviderAddress;

    /* Medical History tab->: Health Care Provider Phone Number: Textbox */
    @FindBy(xpath = "(//input[@name='x_naci_family_coho_fanconi_study_screener.health_care_provider_phone_number_text'])[1]")
    public WebElement nVFScreenerHealthCareProviderPhoneNumber;

    /* Medical History tab->: Permission to contact Provider: Dropdown selected option */
    @FindBy(xpath = "(//select[@name='x_naci_family_coho_fanconi_study_screener.permission_to_contact_provider'])[1]")
    public WebElement nVFScreenerPermissionToContactProvider;

    /* Medical History tab->: Bone marrow failure? Dropdown selected option */
    @FindBy(xpath = "(//select[contains(@name,'x_naci_family_coho_fanconi_study_screener.bone_marrow_failure')])[1]")
    public WebElement nVFScreenerBoneMarrowFailure;

    /* Medical History tab->: Bone marrow failure age at diagnosis: Textbox */
    @FindBy(xpath = "(//input[@name='x_naci_family_coho_fanconi_study_screener.bone_anemia_lowbloodcount_age_at_diagnosis'])[1]")
    public WebElement nVFScreenerBoneMarrowFailureAgeAtDiagnosis;

    /* Medical History tab->: Bone marrow failure month of diagnosis: Textbox */
    @FindBy(xpath = "(//input[@name='x_naci_family_coho_fanconi_study_screener.bone_anemia_lowbloodcount_month_of_diagnosis'])[1]")
    public WebElement nVFScreenerBoneMarrowFailureMonthOfDiagnosis;

    /* Medical History tab->: Bone marrow failure year of diagnosis: Textbox */
    @FindBy(xpath = "(//input[@name='x_naci_family_coho_fanconi_study_screener.bone_anemia_lowbloodcount_year_of_diagnosis'])[1]")
    public WebElement nVFScreenerBoneMarrowFailureYearOfDiagnosis;

    /* Medical History tab->: Bone marrow failure was treatment received? Dropdown selected option */
    @FindBy(xpath = "(//select[@name='x_naci_family_coho_fanconi_study_screener.bone_anemia_lowbloodcount_was_treatment_received'])[1]")
    public WebElement nVFScreenerBoneMarrowFailureWasTreatmentReceived;

    /* Medical History tab->: Treatment: Textbox */
    @FindBy(xpath = "(//input[@name='x_naci_family_coho_fanconi_study_screener.bone_anemia_lowbloodcount_treatment'])[1]")
    public WebElement nVFScreenerTreatment;

    /* Medical History tab->: Received blood transfusions Dropdown selected option */
    @FindBy(xpath = "(//select[@name='x_naci_family_coho_fanconi_study_screener.bone_anemia_lowbloodcount_received_blood_transfusions'])[1]")
    public WebElement nVFScreenerReceivedBloodTransfusions;

    /* *************************************************************** */
    /* ********** LOCATORS In Participant Features Tab *************** */
    /* *************************************************************** */

    /* Participant Features tab */
    @FindBy(xpath = "(//span[normalize-space()='Participant Features'])[1]")
    public WebElement nVFScreenerParticipantFeaturesTab;

    /* Participant Features tab->: Low birth weight Dropdown selected option */
    @FindBy(xpath = "(//select[@name='x_naci_family_coho_fanconi_study_screener.low_birth_weight'])[1]")
    public WebElement nVFScreenerLowBirthWeight;

    /* Participant Features tab->: Feeding problems or Failure to thrive Dropdown selected option */
    @FindBy(xpath = "(//select[@name='x_naci_family_coho_fanconi_study_screener.feeding_problems_or_failure_to_thrive'])[1]")
    public WebElement nVFScreenerFeedingProblemsOrFailureToThrive;

    /* Participant Features tab->: Short stature Dropdown selected option */
    @FindBy(xpath = "(//select[@name='x_naci_family_coho_fanconi_study_screener.short_stature'])[1]")
    public WebElement nVFScreenerShortStature;

    /* Participant Features tab->: Neurocognitive/ Developmental delay Dropdown selected option */
    @FindBy(xpath = "(//select[@name='x_naci_family_coho_fanconi_study_screener.neurocognitive_developmental_delay'])[1]")
    public WebElement nVFScreenerDevelopmentalDelay;

    /* Participant Features tab->: Skin abnormalities Dropdown selected option */
    @FindBy(xpath = "(//select[@name='x_naci_family_coho_fanconi_study_screener.skin_abnormalities'])[1]")
    public WebElement nVFScreenerSkinAbnormalities;

    /*Participant Features tab->: Head/Craniofacial abnormalities Dropdown selected option */
    @FindBy(xpath = "(//select[@name='x_naci_family_coho_fanconi_study_screener.head_craniofacial_abnormalities'])[1]")
    public WebElement nVFScreenerHeadCraniofacialAbnormalities;

    /* Participant Features tab->: Mouth abnormalities Dropdown selected option */
    @FindBy(xpath = "(//select[@name='x_naci_family_coho_fanconi_study_screener.mouth_abnormalities'])[1]")
    public WebElement nVFScreenerMouthAbnormalities;

    /* Participant Features tab->: Eye abnormalities Dropdown selected option */
    @FindBy(xpath = "(//select[@name='x_naci_family_coho_fanconi_study_screener.eye_abnormalities'])[1]")
    public WebElement nVFScreenerEyeAbnormalities;

    /* Participant Features tab->: Ear abnormalities Dropdown selected option */
    @FindBy(xpath = "(//select[@name='x_naci_family_coho_fanconi_study_screener.ear_abnormalities'])[1]")
    public WebElement nVFScreenerEarAbnormalities;

    /*Participant Features tab->: Extremity abnormalities Dropdown selected option*/
    @FindBy(xpath = "(//select[@name='x_naci_family_coho_fanconi_study_screener.extremity_abnormalities'])[1]")
    public WebElement nVFScreenerExtremityAbnormalities;

    /* Participant Features tab->: Skeletal deformities Dropdown selected option */
    @FindBy(xpath = "(//select[@name='x_naci_family_coho_fanconi_study_screener.skeletal_deformities'])[1]")
    public WebElement nVFScreenerSkeletalDeformities;

    /* Participant Features tab->: Heart problems Dropdown selected option */
    @FindBy(xpath = "(//select[@name='x_naci_family_coho_fanconi_study_screener.heart_problems'])[1]")
    public WebElement nVFScreenerHeartProblems;

    /* Participant Features tab->: Heart problems other: Textbox */
    @FindBy(xpath = "(//input[@name='x_naci_family_coho_fanconi_study_screener.heart_problems_other'])[1]")
    public WebElement nVFScreenerHeartProblemsOther;

    /* Participant Features tab->: Kidney abnormalities Dropdown selected option */
    @FindBy(xpath = "(//select[@name='x_naci_family_coho_fanconi_study_screener.kidney_abnormalities'])[1]")
    public WebElement nVFScreenerKidneyAbnormalities;

    /* Participant Features tab->: Genital abnormalities Dropdown selected option */
    @FindBy(xpath = "(//select[@name='x_naci_family_coho_fanconi_study_screener.genital_abnormalities'])[1]")
    public WebElement nVFScreenerGenitalAbnormalities;

    /* Participant Features tab->: Fertility problems, hypogonadism Dropdownselected option */
    @FindBy(xpath = "(//select[@name='x_naci_family_coho_fanconi_study_screener.fertility_problems_hypogonadism'])[1]")
    public WebElement nVFScreenerFertilityProblemsHypogonadism;

    /* Participant Features tab->: Endocrine problems Dropdown selected option */
    @FindBy(xpath = "(//select[@name='x_naci_family_coho_fanconi_study_screener.endocrine_problems'])[1]")
    public WebElement nVFScreenerEndocrineProblems;

    /* Participant Features tab->: Metabolic disorders Dropdown selected option */
    @FindBy(xpath = "(//select[@name='x_naci_family_coho_fanconi_study_screener.metabolic_disorders'])[1]")
    public WebElement nVFScreenerMetabolicDisorders;

    /* *************************************************************** */
    /* ********** LOCATORS In Final Information Tab ***************** */
    /* *************************************************************** */

    /* Final Information tab */
    @FindBy(xpath = "(//span[normalize-space()='Final Information'])[1]")
    public WebElement nVFScreenerFinalInformationTab;

    @FindBy(xpath = "//button[@id='x_naci_family_coho_fanconi_study_screener.main_reasons_for_participating_unlock']//span[@class='icon icon-locked']")
    public WebElement nVFScreenerParticpantInNIHInheritedBoneMarrowFailureSyndromeStudyLock;

    /*
     * Final Information tab->: Participant in NIH Inherited Bone Marrow Failure
     * Syndrome study? Dropdown selected option
     */
    @FindBy(xpath = "(//select[@name='x_naci_family_coho_fanconi_study_screener.particpant_in_inherited_bone_marrow_study'])[1]")
    public WebElement nVFScreenerParticpantInNIHInheritedBoneMarrowFailureSyndromeStudy;

    /*
     * Final Information tab->: Main reasons for participating in this study? Select
     * all that apply: Textbox
     */
    @FindBy(xpath = "(//p[contains(text(),'Participate in research, Identify a diagnosis, Rec')])[1]")
    public WebElement nVFScreenerMainReasonsForParticipatingInStudy;

    /* Final Information tab->: Participate in research: Textbox */
    @FindBy(xpath = "(//textarea[contains(@name,'x_naci_family_coho_fanconi_study_screener.participate_in_research')])[1]")
    public WebElement nVFScreenerParticipateInResearch;

    /* Final Information tab->: Screen for potential cancer diagnosis: Textbox */
    @FindBy(xpath = "(//textarea[@name='x_naci_family_coho_fanconi_study_screener.screen_for_potential_cancer_diagnosis'])[1]")
    public WebElement nVFScreenerScreenForPotentialCancerDiagnosis;

    /* Final Information tab->: Receive genetic testing: Textbox */
    @FindBy(xpath = "(//textarea[@name='x_naci_family_coho_fanconi_study_screener.receive_genetic_testing'])[1]")
    public WebElement nVFScreenerReceiveGeneticTesting;

    /* Final Information tab->: Other reason for participation: Textbox */
    @FindBy(xpath = "(//textarea[@name='x_naci_family_coho_fanconi_study_screener.other_reason_for_participation'])[1]")
    public WebElement nVFScreenerOtherReasonForParticipation;

    /* Final Information tab->: Previous studies: Textbox */
    @FindBy(xpath = "(//textarea[@name='x_naci_family_coho_fanconi_study_screener.previous_studies'])[1]")
    public WebElement nVFScreenerPreviousStudies;

    /*
     * Final Information tab->: How did you hear about this study? Dropdown selected
     * option
     */
    @FindBy(xpath = "(//select[@name='x_naci_family_coho_fanconi_study_screener.hear_about_this_study'])[1]")
    public WebElement nVFScreenerHowDidYouHearAboutThisStudy;

    /* Final Information tab->: Physician: Textbox */
    @FindBy(xpath = "(//input[@name='x_naci_family_coho_fanconi_study_screener.physician'])[1]")
    public WebElement nVFScreenerPhysician;

    /* *****************************TABLES***************************** */

    /* NV Fanconi Screener: Study Contact Person column options button */
    @FindBy(xpath = "(//i[@aria-label='Study Contact Person column options'])[1]")
    public WebElement nVFStudyContactPersonColumnOptionsButton;

    /* NV Fanconi Screener: Study Contact Person column sort options button */
    @FindBy(xpath = "(//div[normalize-space()='Sort (a to z)'])[1]")
    public WebElement nVFStudyContactPersonColumnSortsButton;

    /* NV Fanconi Screener: Open Record button */
    @FindBy(xpath = "(//a[normalize-space()='Open Record'])[1]")
    public WebElement nVFScreenerOpenRecordButton;

    /* NV Fanconi Screener: Back button */
    @FindBy(xpath = "(//button[@title='Back'])[1]")
    public WebElement nVFScreenerBackButton;

    /* NV Fanconi Screener: Arrow down button */
    @FindBy(xpath = "(//span[@class='icon-arrow-down'])[1]")
    public WebElement nVFScreenerArrowDownButton;

    /* NV Fanconi Screener: CHARMS Referrals Link on Referral list view */
    @FindBy(xpath = "(//a[normalize-space()='CHARMS Referrals'])[1]")
    public WebElement nVFScreenerCHARMSReferralLink;

    /* ************************************************************ */
    /* ** LOCATORS In Intake participates in another study Tab ** */
    /* ************************************************************ */

    /* Intake participates in another study tab--> Intake Form Table */
    @FindBy(xpath = "//table[@id=\"x_naci_family_coho_fanconi_study_screener.x_naci_family_coho_intake_participate_another_study.intake_form_id_table\"]/tbody")
    public WebElement nVFScreenerIntakeParticipatesInAnotherStudyTable;

    /* Intake participates in another study tab */
    @FindBy(xpath = "//span[@aria-controls='x_naci_family_coho_fanconi_study_screener.x_naci_family_coho_intake_participate_another_study.intake_form_id_list']")
    public WebElement nVFScreenerIntakeParticipatesInAnotherStudyTab1;

    /* Intake participates in another study tab */
    @FindBy(xpath = "(//div[@class='tabs2_strip tabs2_strip_deferred']//span)[4]")
    public WebElement nVFScreenerIntakeParticipatesInAnotherStudyTab;

    /* Intake participates in another study No records to display */
    @FindBy(xpath = "(//td[normalize-space()='No records to display'])[1]")
    public WebElement nVFScreenerIntakeParticipatesInAnotherStudyBlank;

    /* Intake participates in another stud tab--> Intake Form Table Preview Button */
    @FindBy(xpath = "//table[@id='x_naci_family_coho_fanconi_study_screener.x_naci_family_coho_intake_participate_another_study.intake_form_id_table']/tbody/tr/td[2]")
    public List<WebElement> nVFScreenerIntakeParticipatesInAnotherStudyTableLinks;

    /* Intake participates in another study tab--> Intake participates in another study Title */
    @FindBy(xpath = "(//div[@class='navbar-title-caption'])[1]")
    public WebElement IntakeParticipatesInAnotherStudyTitle;

    /* Intake participates in another study tab--> Study Name */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_intake_participate_another_study.study_name']")
    public WebElement nVFScreenerIntakeParticipatesStudyNameTextBox;

    /* Intake participates in another study tab --> Study Phone Number */
    @FindBy(xpath = "(//input[@id='x_naci_family_coho_intake_participate_another_study.study_phone_number'])[1]")
    public WebElement nVFScreenerIntakeParticipatesStudyPhoneNumberTextBox;

    /* Intake participates in another study tab--> Start Date */
    @FindBy(xpath = "(//input[@id='x_naci_family_coho_intake_participate_another_study.start_date'])[1]")
    public WebElement nVFScreenerIntakeParticipatesStartDateTextBox;

    /* Intake participates in another study tab-->End Date */
    @FindBy(xpath = "(//input[@id='x_naci_family_coho_intake_participate_another_study.end_date'])[1]")
    public WebElement nVFScreenerIntakeParticipatesStudyEndDateTextBox;

    /* Intake participates in another study tab--> Institution */
    @FindBy(xpath = "(//input[@id='x_naci_family_coho_intake_participate_another_study.institution'])[1]")
    public WebElement nVFScreenerIntakeParticipatesStudyInstitutionTextBox;

    /* Intake participates in another study tab--> Currently participating */
    @FindBy(xpath = "(//select[@id='x_naci_family_coho_intake_participate_another_study.currently_participating'])[1]")
    public WebElement nVFScreenerIntakeParticipatesStudyCurrentlyParticipatingDropDown;

    /* Intake participates in another study tab-->Relationship to you */
    @FindBy(xpath = "(//input[@id='x_naci_family_coho_intake_participate_another_study.relationship_to_you'])[1]")
    public WebElement nVFScreenerIntakeParticipatesStudyRelationshipToYouTextBox;

    /* Intake participates in another study tab-->First Name */
    @FindBy(xpath = "(//input[@id='x_naci_family_coho_intake_participate_another_study.first_name'])[1]")
    public WebElement nVFScreenerIntakeParticipatesStudyFirstNameTextBox;

    /* Intake participates in another study tab-->Last Name */
    @FindBy(xpath = "(//input[@id='x_naci_family_coho_intake_participate_another_study.last_name'])[1]")
    public WebElement nVFScreenerIntakeParticipatesStudyLastNameTextBox;

    /* ******************************************************** */
    /* ******** LOCATORS In Genetic Mutation/Variants Tab ***** */
    /* ******************************************************** */

    /* Genetic Mutation/Variants tab */
    @FindBy(xpath = "//body/div[contains(@class,'overflow_x_hidden-hotfix')]/div[contains(@aria-label,'Section Tab Lists')]/span[2]/span[1]/span[2]")
    public WebElement nVFScreenerGeneticMutationvariantTab1;

    /* Genetic Mutation/Variants tab */
    @FindBy(xpath = "//span[normalize-space()='Genetic Mutation/Variants (1)']")
    public WebElement nVFScreenerGeneticMutationvariantTab2;

    /* Genetic Mutation/Variants tab */
    @FindBy(xpath = "(//div[@class='tabs2_strip tabs2_strip_deferred']//span)[8]")
    public WebElement nVFScreenerGeneticMutationvariantTab;

    /* Genetic Mutation/Variants tab */
    @FindBy(xpath = "//table[@id='x_naci_family_coho_fanconi_study_screener.x_naci_family_coho_genetic_mutation_variant.screener_table']/tbody/tr/td[2] ")
    public List<WebElement> nVFScreenerGeneticMutationvariantTableLinks;

    /* Genetic Mutation/Variants --> Preview Record button */
    @FindBy(xpath = "//tbody[@class='list2_body']//tr[@data-list_id='x_naci_family_coho_fanconi_study_screener.x_naci_family_coho_genetic_mutation_variant.screener']//td[2]//a")
    public WebElement nVFScreenerGeneticMutationvariantPreviewRecordButton;

    /* Genetic Mutation/Variants --> Preview Record button */
    @FindBy(xpath = "(//a[@class='btn btn-icon table-btn-lg icon-info list_popup'])[4]")
    public WebElement nVFScreenerGeneticMutationvariantPreviewRecordButton1;

    /* Genetic Mutation/Variants Title */
    @FindBy(xpath = "(//div[normalize-space()='Genetic Mutation/Variant'])[1]")
    public WebElement nVFScreenerGeneticMutationTitle;

    /* Genetic Mutation/Variants tab--> Screener Referral Number */
    @FindBy(xpath = "(//input[@id='sys_display.x_naci_family_coho_genetic_mutation_variant.screener'])[1]")
    public WebElement nVFScreenerGeneticMutationScreenerTextBox;

    /* Genetic Mutation/Variants tab--> Gene Name */
    @FindBy(xpath = "(//input[@id='sys_display.x_naci_family_coho_genetic_mutation_variant.gene_name'])[1]")
    public WebElement nVFScreenerGeneticMutationGeneNameTextBox;

    /* Genetic Mutation/Variants tab--> Mutation/Variant */
    @FindBy(xpath = "(//input[@id='x_naci_family_coho_genetic_mutation_variant.mutation_variant'])[1]")
    public WebElement nVFScreenerGeneticMutationVariantTextBox;
    ;

    /* Genetic Mutation/Variants tab-->Inherited From */
    @FindBy(xpath = "(//select[@id='x_naci_family_coho_genetic_mutation_variant.inherited_from'])[1]")
    public WebElement nVFScreenerGeneticMutationInheritedFromDropDown;

    /* Genetic Mutation/Variants tab--> Mutation/Variant 2 */
    @FindBy(xpath = "(//input[@id='x_naci_family_coho_genetic_mutation_variant.mutation_variant_2'])[1]")
    public WebElement nVFScreenerGeneticMutationVariant2TextBox;

    /* Genetic Mutation/Variants tab-->Inherited From 2 */
    @FindBy(xpath = "(//select[@id='x_naci_family_coho_genetic_mutation_variant.inherited_from_2'])[1]")
    public WebElement nVFScreenerGeneticMutationInheritedFrom2DropDown;

    /* ******************************************************** */
    /* LOCATORS In Fanconi Screener: Patient Cancer History Tab */
    /* ******************************************************** */

    /* Cancer History Tab */
    @FindBy(xpath = "(//span[normalize-space()='Fanconi Screener: Patient Cancer History (4)'])[1]")
    public WebElement nVFScreenerCancerHistoryTab1;

    /* Cancer History in another study tab--> Cancer Table */
    @FindBy(xpath = "driver.findElement(By.xpath(\"(//a[@aria-label='Preview record: null'])[1]\"))")
    public WebElement nVFScreenerCancerHistoryInAnotherStudyTable;

    /* Cancer History Tab */
    @FindBy(xpath = "(//div[@class='tabs2_strip tabs2_strip_deferred']//span)[12]")
    public WebElement nVFScreenerCancerHistoryTab;

    /* Cancer History Tab-- Total records */
    @FindBy(xpath = "//tr[@record_class='x_naci_family_coho_mock_up_intake_patient_cancer']//td[@class='list_decoration_cell col-small col-center ']")
    public List<WebElement> nVFScreenerCancerHistoryTableRowsLink;

    /* Cancer History Tab--> Cancer History Table Preview Button */
    @FindBy(xpath = "//tr[@record_class='x_naci_family_coho_mock_up_intake_patient_cancer']//td[@class='list_decoration_cell col-small col-center ']")
    public WebElement nVFScreenerCancerHistoryTableLinks;

    /* Cancer History Tab-Please Specify column options button */
    @FindBy(xpath = "(//i[@aria-label='Please Specify column options'])[1]")
    public WebElement nVFCancerHistoryPleaseSpecifyColumnOptionsButton;

    /* Cancer History Tab- Please Specify column sort options button */
    @FindBy(xpath = "(//div[normalize-space()='Sort (a to z)'])[1]")
    public WebElement nVFCancerHistoryPleaseSpecifyColumnSortsButton;

    /* Cancer History Tab-->Title */
    @FindBy(xpath = "(//div[@class='navbar-title-caption'])[1]")
    public WebElement nVFScreenerCancerHistoryTitle;

    /* Method to dynamically locate Cancer History Value  in Fanconi Study Screener in Native View */
    public WebElement dynamicLocatorForInputElementsOfCancerHistoryInFAScreener1(String text) {
        return WebDriverUtils.webDriver.findElement(By.xpath("(//input[@id='sys_display.x_naci_family_coho_mock_up_intake_patient_cancer." + text + "'])[1]"));
    }

    /* Method to dynamically locate Cancer History Value  in Fanconi Study Screener in Native View */
    public WebElement dynamicLocatorForInputElementsOfCancerHistoryInFAScreener(String text) {
        return WebDriverUtils.webDriver.findElement(By.xpath("(//input[@id='x_naci_family_coho_mock_up_intake_patient_cancer." + text + "'])[1]"));
    }

    /* Method to dynamically locate Cancer History elements in Fanconi Screener page in Native View */
    public WebElement dynamicLocatorForSelectElementOfCancerHistoryInFAScreener(String text) {
        return WebDriverUtils.webDriver.findElement(By.xpath("(//select[@id='x_naci_family_coho_mock_up_intake_patient_cancer." + text + "'])[1]"));
    }

    /* Cancer History Tab--> Tumor Type */
    @FindBy(xpath = "(//input[@id='sys_display.x_naci_family_coho_mock_up_intake_patient_cancer.tumor_type'])[1]")
    public WebElement nVFScreenerCancerHistoryTumorType;

    /* Cancer History Tab--> Month of diagnosis */
    @FindBy(xpath = "(//select[@id='x_naci_family_coho_mock_up_intake_patient_cancer.month_of_diagnosis'])[1]")
    public WebElement nVFScreenerCancerHistoryMonthOfDiagnosis;

    /* Cancer History Tab-->Year of diagnosis */
    @FindBy(xpath = "(//input[@id='x_naci_family_coho_mock_up_intake_patient_cancer.year_of_diagnosis'])[1]")
    public WebElement nVFScreenerCancerHistoryYearOfDiagnosis;

    /* Cancer History Tab-->How old was the research participant when the cancer was diagnosed? */
    @FindBy(xpath = "(//input[@id='x_naci_family_coho_mock_up_intake_patient_cancer.age_in_years_at_diagnosis'])[1]")
    public WebElement nVFScreenerCancerHistoryHowOldWhenCancerDiagnosed;

    /* Cancer History Tab-->Currently being treated */
    @FindBy(xpath = "(//select[@id='x_naci_family_coho_mock_up_intake_patient_cancer.currently_being_treated'])[1]")
    public WebElement nVFScreenerCancerHistoryCurrentlyBeingTreated;

    /* Cancer History Tab-->Treatment Institution */
    @FindBy(xpath = "(//input[@id='x_naci_family_coho_mock_up_intake_patient_cancer.treatment_institution'])[1]")
    public WebElement nVFScreenerCancerHistoryTreatmentInstitution;

    /* Cancer History Tab-->Treating Physician */
    @FindBy(xpath = "(//input[@id='x_naci_family_coho_mock_up_intake_patient_cancer.treating_physician'])[1]")
    public WebElement nVFScreenerCancerHistoryTreatingPhysician;

    /* Cancer History Tab-->Name of institution or clinic where biopsy occurred */
    @FindBy(xpath = "(//input[@id='x_naci_family_coho_mock_up_intake_patient_cancer.biopsy_institution'])[1]")
    public WebElement nVFScreenerCancerHistoryNameOfInstitution;

    /* Cancer History Tab-->Name of physician who performed the biopsy */
    @FindBy(xpath = "(//input[@id='x_naci_family_coho_mock_up_intake_patient_cancer.biopsy_physician'])[1]")
    public WebElement nVFScreenerCancerHistoryNameOfPhysician;
}
