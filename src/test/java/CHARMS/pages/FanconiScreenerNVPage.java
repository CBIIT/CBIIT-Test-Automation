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

    /* Method to dynamically locate Input Value elements in Native View */
    public WebElement dynamicLocatorForPreviewButtonLocator(String text) {
        return WebDriverUtils.webDriver.findElement(By.xpath("(//a[@aria-label='Preview record: " + text + "'])[3]"));
    }

    /* Use This Method To Dynamically Preview Record Buttons On */
    public WebElement dynamicPreviewButtonLocator2(String text) {
        return WebDriverUtils.webDriver.findElement(By.xpath("(//a[@aria-label='Preview record: '])[3]"));
    }

    /* Method to dynamically locate elements in Native View */
    public WebElement dynamicLocatorUsingDataNormalizeSpaceInSpan(String text) {
        return WebDriverUtils.webDriver.findElement(By.xpath("(//span[@data-html='false'][normalize-space()='" + text + "'])[1]"));
    }

    /* Method to dynamically locate Input Value elements in Native View */
    public WebElement dynamicLocatorForInputElements(String text) {
        return WebDriverUtils.webDriver.findElement(By.xpath("(//input[@id='sys_display.x_naci_family_coho_participant_study." + text + "'])[1]"));
    }

    /* Method to dynamically locate Input Display Read Value elements in Fanconi Study Screener in Native View */
    public WebElement dynamicLocatorForDisplayReadOnlyInputElementsInFAScreener(String text) {
        return WebDriverUtils.webDriver.findElement(By.xpath("(//input[@id='sys_display.x_naci_family_coho_fanconi_study_screener." + text + "'])[1]"));
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

    /* Method to dynamically locate CheckBox labels in Fanconi study page in Native View */
    public WebElement dynamicLocatorForCheckBoxElements1(String text) {
        return WebDriverUtils.webDriver.findElement(By.xpath("(//label[@id='label.ni.x_naci_family_coho_participant_study." + text + "'])[1]"));
    }

    /* Method to dynamically locate CheckBox labels in Fanconi study page in Native View */
    public WebElement dynamicLocatorForCheckBoxElements(String text) {
        return WebDriverUtils.webDriver.findElement(By.xpath("(//input[@id='ni.x_naci_family_coho_participant_study." + text + "'])[1]"));
    }

    /* Method to dynamically locate CheckBox elements in Fanconi study page in Native View */
    public WebElement dynamicLocatorForCheckBoxElements(int i) {
        return WebDriverUtils.webDriver.findElement(By.xpath("(//span[@class='input-group-checkbox'])["+ i +"]"));
    }

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

    /* NV Fanconi Screener: All referaal button in Navigator */
    @FindBy(xpath = "(//td[@class='vt'])[3]")
    public WebElement nVConsentDate;

    /* CHARMS Referrals List view-> iFrame */
    @FindBy(xpath = "//iframe[@id='gsft_main']")
    public WebElement nVReferralsListViewiFrame;

    /* NV Fanconi Screener: Participant Details Open Record button */
    @FindBy(xpath = "(//a[normalize-space()='Open Record'])[1]")
    public WebElement nVFamilyMembersOpenRecordButton;

    /* *************************************************************** */
    /* ********** LOCATORS In General Section ***************** */
    /* *************************************************************** */
    /* NV Fanconi Screener: Study */
    @FindBy(xpath = "(//input[@name='sys_display.x_naci_family_coho_fanconi_study_screener.study'])[1]")
    public WebElement nVFScreenerStudy;

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

    /* *************************************************************** */
    /* ********** LOCATORS In Demographic Tab ***************** */
    /* *************************************************************** */

    /* DEMOGRAPHICS tab */
    @FindBy(xpath = "(//span[normalize-space()='Demographics'])[1]")
    public WebElement nVFScreenerDemographicsTab;

    /* DEMOGRAPHICS tab->Participant Race (Select all that apply) */
    @FindBy(xpath = "(//p[@id='x_naci_family_coho_fanconi_study_screener.family_member_record.race_nonedit'])[1]")
    public WebElement nVFScreenerRace;

    /* DEMOGRAPHICS tab->Participant Race Other TextBox */
    @FindBy(xpath = "(//input[contains(@onchange,\"onChange('x_naci_family_coho_fanconi_study_screener.family_member_record.other_race');\")])[1]")
    public WebElement nVFScreenerRaceOtherText;

    /* *************************************************************** */
    /* ********** LOCATORS In Fanconi History Tab ***************** */
    /* *************************************************************** */

    /* Fanconi History tab-> */
    @FindBy(xpath = "(//span[normalize-space()='Fanconi History'])[1]")
    public WebElement nVFScreenerHistoryTab;

    /* *************************************************************** */
    /* ********** LOCATORS In Genetic Testing History Tab *********** */
    /* *************************************************************** */

    /* Fanconi History tab-> */
    @FindBy(xpath = "(//span[normalize-space()='Genetic Testing History'])[1]")
    public WebElement nVFScreenerGeneticTestingHistoryTab;

    /* *************************************************************** */
    /* ********** LOCATORS In FA Genes Tested Tab ***************** */
    /* *************************************************************** */

    /* FA Genes Tested tab */
    @FindBy(xpath = "(//span[normalize-space()='FA Genes Tested'])[1]")
    public WebElement nVFScreenerFAGenesTestedTab;

    /* FA Genes Tested tab->: FA Genes Tested CheckBoxes */
    @FindBy(xpath = "(//span[@class='input-group-checkbox'])")
    public List<WebElement> nVFScreenerFAGenesTested;

    /* *************************************************************** */
    /* ********** LOCATORS In Medical History Tab ***************** */
    /* *************************************************************** */

    /* Medical History tab */
    @FindBy(xpath = "(//span[normalize-space()='Medical History'])[1]")
    public WebElement nVFScreenerMedicalHistoryTab;

    /* Medical History tab->: Current Medications: Text */
    @FindBy(xpath = "(//textarea[@name='x_naci_family_coho_fanconi_study_screener.current_medications'])[1]")
    public WebElement nVFScreenerCurrentMedications;

    /* Medical History tab->: Health Care Provider Address: Text */
    @FindBy(xpath = "(//textarea[@name='x_naci_family_coho_fanconi_study_screener.health_care_provider_address'])[1]")
    public WebElement nVFScreenerHealthCareProviderAddress;

    /* *************************************************************** */
    /* ********** LOCATORS In Participant Features Tab *************** */
    /* *************************************************************** */

    /* Participant Features tab */
    @FindBy(xpath = "(//span[normalize-space()='Participant Features'])[1]")
    public WebElement nVFScreenerParticipantFeaturesTab;

    /* *************************************************************** */
    /* ********** LOCATORS In Final Information Tab ***************** */
    /* *************************************************************** */

    /* Final Information tab */
    @FindBy(xpath = "(//span[normalize-space()='Final Information'])[1]")
    public WebElement nVFScreenerFinalInformationTab;

    @FindBy(xpath = "(//span[@class='label-text'][contains(text(),'Participant in NIH Inherited Bone Marrow Failure S')])[1]")
    public WebElement nVFScreenerParticpantInNIHInheritedBoneMarrowFailureSyndromeStudyLock;

    /* Final Information tab->: Main reasons for participating in this study? Select all that apply: Textbox */
    @FindBy(xpath = "(//p[contains(text(),'Participate in research, Identify a diagnosis, Rec')])[1]")
    public WebElement nVFScreenerMainReasonsForParticipatingInStudy;

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

    /* ************************************************************ */
    /* ** LOCATORS In Intake participates in another study Tab ** */
    /* ************************************************************ */

    /* Intake participates in another study tab--> Intake Form Table */
    @FindBy(xpath = "//table[@id=\"x_naci_family_coho_fanconi_study_screener.x_naci_family_coho_intake_participate_another_study.intake_form_id_table\"]/tbody")
    public WebElement nVFScreenerIntakeParticipatesInAnotherStudyTable;

    /* Intake participates in another study tab */
    @FindBy(xpath = "(//div[@class='tabs2_strip tabs2_strip_deferred']//span)[4]")
    public WebElement nVFScreenerIntakeParticipatesInAnotherStudyTab;

    /* Intake participates in another stud tab--> Intake Form Table Preview Button */
    @FindBy(xpath = "//table[@id='x_naci_family_coho_fanconi_study_screener.x_naci_family_coho_intake_participate_another_study.intake_form_id_table']/tbody/tr/td[2]")
    public List<WebElement> nVFScreenerIntakeParticipatesInAnotherStudyTableLinks;

    /* Intake participates in another study tab--> Intake participates in another study Title */
    @FindBy(xpath = "(//div[@class='navbar-title-caption'])[1]")
    public WebElement IntakeParticipatesInAnotherStudyTitle;

    /* Intake participates in another study tab--> Currently participating */
    @FindBy(xpath = "(//select[@id='x_naci_family_coho_intake_participate_another_study.currently_participating'])[1]")
    public WebElement nVFScreenerIntakeParticipatesStudyCurrentlyParticipatingDropDown;

    /* ******************************************************** */
    /* ******** LOCATORS In Genetic Mutation/Variants Tab ***** */
    /* ******************************************************** */

    /* Genetic Mutation/Variants tab */
    @FindBy(xpath = "(//div[@class='tabs2_strip tabs2_strip_deferred']//span)[8]")
    public WebElement nVFScreenerGeneticMutationvariantTab;

    /* Genetic Mutation/Variants tab */
    @FindBy(xpath = "//table[@id='x_naci_family_coho_fanconi_study_screener.x_naci_family_coho_genetic_mutation_variant.screener_table']/tbody/tr/td[2] ")
    public List<WebElement> nVFScreenerGeneticMutationvariantTableLinks;

    /* Genetic Mutation/Variants --> Preview Record button */
    @FindBy(xpath = "(//tr[@data-list_id=\"x_naci_family_coho_fanconi_study_screener.x_naci_family_coho_genetic_mutation_variant.screener\"]/td)[2]")
    public WebElement nVFScreenerGeneticMutationvariantPreviewRecordButton;

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
    @FindBy(xpath = "(//div[@class='tabs2_strip tabs2_strip_deferred']//span)[12]")
    public WebElement nVFScreenerCancerHistoryTab;

    /* Cancer History Tab--> Total records */
    @FindBy(xpath = "(//a[@title='Preview null'])")
    public List<WebElement> nVFScreenerCancerHistoryTableRowsLink;

    /* Cancer History Tab--> Please Specify column options button */
    @FindBy(xpath = "(//i[@aria-label='Please Specify column options'])[1]")
    public WebElement nVFCancerHistoryPleaseSpecifyColumnOptionsButton;

    /* Cancer History Tab--> Please Specify column sort options button */
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
}
