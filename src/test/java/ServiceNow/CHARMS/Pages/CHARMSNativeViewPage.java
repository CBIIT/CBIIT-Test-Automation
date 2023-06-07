package ServiceNow.CHARMS.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class CHARMSNativeViewPage extends CommonUtils {

    /* ------ Studio link ------ */
    @FindBy(xpath = "//*[@id='bb0c4ba0c3120200ca27ff9c02d3ae7e']/div/div")
    public WebElement studioLink;

    /* ------ Native View Studio CHARMS Referrals iframe ------ */
    @FindBy(xpath = "/html/body/div[1]/section/editor-tabset/div/div/editor-tab-frame/iframe")
    public WebElement nativeViewStudioIframe;

    /* ------ Native View Studio Family Member Details iframe ------ */
    @FindBy(xpath = "/html/body/div[1]/section/editor-tabset/div/div[2]/editor-tab-frame/iframe")
    public WebElement nativeViewFamilyMemberDetailsIframe;

    /* ------ Native View Studio FCSMS Form Access iframe ------ */
    @FindBy(xpath = "/html/body/div[1]/section/editor-tabset/div/div[3]/editor-tab-frame/iframe")
    public WebElement nativeViewFCSMSformAccessIframe;

    /* *************************************************************** */

    /* ************* ServiceNow Studio CHARMS Referrals ************* */

    /* -------- CHARMS Referrals x button ------------ */
    @FindBy(xpath = "/html/body/div[1]/section/editor-tabset/ul/li[1]/a")
    public WebElement charmsReferralsXbutton;

    /* --------- Applications search bar ------ */
    @FindBy(xpath = "//input[@name='filter']")
    public WebElement applicationsSearchBar;

    /* --------- Family Cohort Study link ------ */
    @FindBy(linkText = "Family Cohort Study")
    public WebElement familyCohortStudyLink;

    /* --------- CHARMS Referrals link ------ */
    @FindBy(xpath = "/html/body/div[1]/nav/app-explorer/div[1]/ul/li[1]/ul/li[1]/ul/li[3]/a")
    public WebElement charmsReferralsLink;

    /* --------- CHARMS Referrals Show List ------ */
    @FindBy(xpath = "//*[@id='465ea163c3113000bac1addbdfba8f29']")
    public WebElement charmsReferralsShowList;

    /* --------- CHARMS Referrals show list search drop down------ */
    @FindBy(xpath = "//div[@class='input-group']/span/span/select")
    public WebElement charmsReferralsShowListSearchDropDown;

    /* --------- CHARMS Referrals show list search text box */
    @FindBy(xpath = "/html/body/div[1]/div[1]/span/div/div[1]/div/span/div/div/input")
    public WebElement charmsReferralsShowListSearchTextBox;

    /* --------- CHARMS Referrals show list Test Account email address ------ */
    @FindBy(xpath = "//td[contains(text(),'diegoju')]")
    public WebElement charmsReferralsShowListTestAccountEmailAddress;

    /* --------- CHARMS Referrals show list test account check box ------ */
    @FindBy(xpath = "/html/body/div[1]/div[1]/span/div/div[6]/table/tbody/tr/td/div/table/tbody/tr/td[1]/span/label")
    public WebElement charmsReferralsShowListTestAccountCheckBox;

    /* --------- CHARMS Referrals show list delete drop down ------ */
    @FindBy(xpath = "/html/body/div[1]/div[1]/span/div/div[6]/div[1]/table/tbody/tr/td[1]/span[2]/select")
    public WebElement charmsReferralsShowListDeleteDropDown;

    /* --- CHARMS Referrals show list confirmation pop up Delete button -- */
    @FindBy(xpath = "//button[@id='ok_button']")
    public WebElement charmsReferralsPopUpDeleteButton;

    /* *************************************************************** */

    /* ************* FAMILY MEMBER DETAILS ************* */

    /* ---- Family Member Details x button ------ */
    @FindBy(xpath = "/html/body/div[1]/section/editor-tabset/ul/li[2]/a")
    public WebElement familyMemberDetailsXbutton;

    /* ---------Family Member Details ------ */
    @FindBy(xpath = "//*[@id='navigation-modules']/ul/li[1]/ul/li[1]/ul/li[7]/a")
    public WebElement familyMemberDetailsLink;

    /*--------- Family Member Details Show List link ------ */
    @FindBy(xpath = "//*[@id='465ea163c3113000bac1addbdfba8f29']")
    public WebElement familyMemberDetailsShowListLink;

    /* ---------Family Member Details show list search drop down ------ */
    @FindBy(xpath = "//div[@class='input-group']/span/span/select")
    public WebElement familyMemberDetailsShowListSearchDropDown;

    /* ---------Family Member Details show list search text box ------ */
    @FindBy(xpath = "/html/body/div[1]/div[1]/span/div/div[1]/div/span/div/div/input")
    public WebElement familyMemberDetailsShowListSearchTextBox;

    /* -------- Family Member Details show list check box ------ */
    @FindBy(xpath = "/html/body/div[1]/div[1]/span/div/div[6]/table/tbody/tr/td/div/table/tbody/tr/td[1]/span/label")
    public WebElement familyMemberDetailsShowListCheckBox;

    /* -------- Family Member Details show list delete drop down ------ */
    @FindBy(xpath = "/html/body/div[1]/div[1]/span/div/div[6]/div[1]/table/tbody/tr/td[1]/span[2]/select")
    public WebElement familyMemberDetailsShowListDeleteDropDown;

    /* ------- Family Member Details show list pop up delete button ----- */
    @FindBy(xpath = "//button[@id='ok_button']")
    public WebElement familyMemberDetailsShowListPopUpDeleteButton;

    /* *************************************************************** */

    /* ************* FCSMS FORM ACCESS ************* */

    /* ------- FCSMS Form Access ------ */
    @FindBy(xpath = "//*[@id='navigation-modules']/ul/li[1]/ul/li[1]/ul/li[9]/a")
    public WebElement fcsmsFormAccess;

    /* -------- FCSMS Form Access Show List Link ------ */
    @FindBy(xpath = "//*[@id='465ea163c3113000bac1addbdfba8f29']")
    public WebElement fcsmsFormAccessShowListLink;

    /* ------ FCSMS Form Access Show List ------ */
    @FindBy(xpath = "//div[@class='input-group']/span/span/select")
    public WebElement fcsmsFormAccessShowListDropDrown;

    /* --------- FCSMS Form Access Show List search box ------ */
    @FindBy(xpath = "/html/body/div[1]/div[1]/span/div/div[1]/div/span/div/div/input")
    public WebElement fcsmsFormAccessShowListSearchBox;

    /* --------- FCSMS Form Access Show List Account check box ------ */
    @FindBy(xpath = "/html/body/div[1]/div[1]/span/div/div[6]/table/tbody/tr/td/div/table/tbody/tr/td[1]/span/label")
    public WebElement fcsmsFormAccessShowListAccountCheckBox;

    /* --------- FCSMS Form Access Show List Delete drop down ------ */
    @FindBy(xpath = "/html/body/div[1]/div[1]/span/div/div[6]/div[1]/table/tbody/tr/td[1]/span[2]/select")
    public WebElement fcsmsFormAccessShowListDeleteDropDown;

    /* --------- FCSMS Form Access Show List Delete button ------ */
    @FindBy(xpath = "//button[@id='ok_button']")
    public WebElement fcsmsFormAccessShowListDeleteButton;

    /* *************************************************************** */

    /* **** BEGINNING OF NATIVE VIEW ELEMENTS FOR ALL PAGES ***** */

    /*--------- Dashboard Link  */
    @FindBy(xpath = "//ul[@aria-label='Modules for Application: CHARMS']//div//div[@class='sn-widget-list-title'][normalize-space()='Dashboard']")
    public WebElement nativeViewDashboardLink;

    /*--------- Native view frame -----------  */
    @FindBy(xpath = "//iframe[@title='RAS Study | ServiceNow']")
    public WebElement nativeViewiFrameCHARMS;

    /*--------- Native view Waiting for Eligibility Review button ---------- */
    @FindBy(xpath = "(//div/span/a)[1]")
    public WebElement nativeViewWaitingForElegibilityReviewButton;

    /*--------- Native view Family Member Details Preview Automated Test button---------- */
    @FindBy(xpath = "//a[@aria-label='Preview record: AutomatedFirstNameOfParticipant AutomatedLastNameOfParticipant']")
    public WebElement nativeViewFamilyMemberDetailsPreviewAutomatedTestButton;

    /*--------- Native view Family Member Details Preview Automated Test First Name text ---------- */
    @FindBy(xpath = "/html/body/div[4]/div[3]/form/div/span/span/div[4]/div/div[1]/div[2]/div[2]/input[1]")
    public WebElement nativeViewFamilyMemberDetailsPreviewAutomatedFirstNameText;

    /*--------- Native view Family Member Details Preview Automated Test Last Name text ---------- */
    @FindBy(xpath = "//body/div[@role='dialog']/div[@class='popover-content']/form[@name='x_naci_family_coho_family_history_details.do']/div/span[contains(@class,'tabs2_section tabs2_section_0 tabs2_section0')]/span[contains(@class,'section')]/div[@aria-label='Family Member Details form section']/div[@class='row']/div[2]/div[2]/div[2]/input[1]")
    public WebElement nativeViewFamilyMemberDetailsPreviewAutomatedLastNameText;

    /*--------- Native view Family Member Details Preview Automated Test Contact Home Phone Text ---------- */
    @FindBy(xpath = "//body/div[@role='dialog']/div[@class='popover-content']/form[@name='x_naci_family_coho_family_history_details.do']/div/span[contains(@class,'tabs2_section tabs2_section_0 tabs2_section0')]/span[contains(@class,'section')]/div[@aria-label='Family Member Details form section']/div[@class='row']/div[2]/div[3]/div[2]/input[1]")
    public WebElement nativeViewFamilyMemberDetailsPreviewAutomatedContactHomePhoneText;

    /*--------- Native view Family Member Details Preview Automated Test Open Record button ---------- */
    @FindBy(xpath = "//a[normalize-space()='Open Record']")
    public WebElement nativeViewFamilyMemberDetailsPreviewAutomatedTestOpenRecordButton;

    /*--------- Native view Family Member Details Automated Test Record 'Name' text ---------- */
    @FindBy(xpath = "//body/div[2]/form[1]/span[1]/span[1]/div[5]/div[2]/div[1]/div[2]/div[2]/input[1]")
    public WebElement nativeViewFamilyMemberDetailsAutomatedTestRecordNameText;

    /*--------- Native view Family Member Details Automated Test Record 'Waiting for eligibility' text ---------- */
    @FindBy(xpath = "(//option[@selected='SELECTED'])[2]")
    public WebElement nativeViewFamilyMemberDetailsAutomatedTestRecordWaitingForEligibilityText;

    /*-- Native view Family Member Details Automated Test Record 'New Screener Received text */
    @FindBy(xpath = "(//option[@selected='SELECTED'])[3]")
    public WebElement nativeViewFamilyMemberDetailsAutomatedTestRecordNewScreenerReceivedText;

    /*--- Native view Family Member Details Automated Test Record 'May we have your permission to contact this relative?'text--- */
    @FindBy(xpath = "(//option[@selected='SELECTED'])[1]")
    public WebElement nativeViewFamilyMemberDetailsAutomatedTestRecordMayWeHaveYourPermissionToContactThisRelativeYesText;

    @FindBy(xpath = "//input[contains(@name,\"sys_display.x_naci_family_coho_family_history_details.proband_screener\")]")
    public WebElement nativeViewFamilyMemberDetailsAutomatedTestRecordReferral;

    /* *************************************************************** */

    /* *** VERIFIES PERSONAL INFORMATION DATA IN FAMILY MEMBERS DETAILS PAGE*** */

    /* --------- PERSONAL INFORMATION tab ----------- */
    @FindBy(xpath = "//form[@name=\"x_naci_family_coho_family_history_details.do\"]//div[@role=\"tablist\"]//span[normalize-space()=\"Personal Information\"]")
    public WebElement nVFamilyMemberDetailsRecordPersonalInformationTab;

    /*---- PERSONAL INFORMATION tab--> RelationshipToYou DropDown option selected -- */
    @FindBy(xpath = "//select[@name=\"x_naci_family_coho_family_history_details.relationship_to_you\"]//option[@value=\"proband\"]")
    public WebElement nVFamilyMemberDetailsRecordPersonalInformationTabRelationshipToYou;

    /*--- PERSONAL INFORMATION tab-->FirstName ------*/
    @FindBy(xpath = "//input[@name=\"x_naci_family_coho_family_history_details.first_name\"]")
    public WebElement nVFamilyMemberDetailsRecordPersonalInformationTabFirstName;

    /* ----------- PERSONAL INFORMATION tab--> MiddleName ------- */
    @FindBy(xpath = "//input[@name=\"x_naci_family_coho_family_history_details.middle_name\"]")
    public WebElement nVFamilyMemberDetailsRecordPersonalInformationTabMiddleName;

    /* -------- PPERSONAL INFORMATION tab--> LastName ------ */
    @FindBy(xpath = "//input[@name=\"x_naci_family_coho_family_history_details.last_name\"]")
    public WebElement nVFamilyMemberDetailsRecordPersonalInformationTabLastName;

    /* *************************************************************** */

    /* *** VERIFIES DEMOGRAPHICS DATA IN FAMILY MEMBERS DETAILS PAGE *** */

    /* --------- DEMOGRAPHICS tab ----------- */
    @FindBy(xpath = "//form[@name=\"x_naci_family_coho_family_history_details.do\"]//div[@role=\"tablist\"]//span[normalize-space()=\"Demographics\"]")
    public WebElement nVFamilyMemberDetailsRecordDemographicsTab;

    /* ----DEMOGRAPHICS tab --> Biological Gender? DropDown selected option ---- */
    @FindBy(xpath = "//select[@id=\"x_naci_family_coho_family_history_details.biological_gender\"]//option[@selected=\"SELECTED\"]")
    public WebElement nVFamilyMemberDetailsRecordDemographicsTabBiologicalGender;

    /*--DEMOGRAPHICS tab --> Participants identified gender? DropDown selected option-- */
    @FindBy(xpath = "//select[@id=\"x_naci_family_coho_family_history_details.participants_identified_gender\"]//option[@selected=\"SELECTED\"]")
    public WebElement nVFamilyMemberDetailsRecordDemographicsTabParticipantsIdentifiedGender;

    /* -------- DEMOGRAPHICS tab --> Ethnicity? DropDown selected option ------ */
    @FindBy(xpath = "//select[@name=\"x_naci_family_coho_family_history_details.ethnicity\"]//option[@selected=\"SELECTED\"]")
    public WebElement nVFamilyMemberDetailsRecordDemographicsTabEthnicity;

    /*---DEMOGRAPHICS tab --> Is the participant adopted? DropDown selected option-	 */
    @FindBy(xpath = "//select[@id=\"x_naci_family_coho_family_history_details.adopted\"]//option[@selected=\"SELECTED\"]")
    public WebElement nVFamilyMemberDetailsRecordDemographicsTabIsTheParticipantAdopted;

    /* -------- DEMOGRAPHICS tab --> Date of Birth iFrame ------ */
    @FindBy(xpath = "//input[@value=\"04/01/1990\"]")
    public WebElement nVFamilyMemberDetailsRecordDemographicsTabParticipantDOB;

    /*--DEMOGRAPHICS tab --> If Date of Birth is unkown, is this person 18 years old or older ? DropDown selected option-- */
    @FindBy(xpath = "//body/div[@data-position-below-header=\"true\"]/form[@method=\"POST\"]/span[@role=\"tabpanel\"]/span[@data-header-only=\"false\"]/div[@aria-label=\"Demographics form section\"]/div/div/div[3]/div[2]/select[1]//option[@selected=\"SELECTED\"]")
    public WebElement nVFamilyMemberDetailsRecordDemographicsTabIfDOBUnknownAge18;

    /* ------- DEMOGRAPHICS tab --> Age ------ */
    @FindBy(xpath = "//input[@id=\"sys_readonly.x_naci_family_coho_family_history_details.age\"]")
    public WebElement nVFamilyMemberDetailsRecordDemographicsTabParticipantAge;

    /*---- DEMOGRAPHICS tab --> Participant Race (Select all that apply) ---- */
    @FindBy(xpath = "//p[@id=\"x_naci_family_coho_family_history_details.race_nonedit\"]")
    public WebElement nVFamilyMemberDetailsRecordDemographicsTabParticipantRace;

    /* -------- DEMOGRAPHICS tab --> Participant Race Other TextBox ------ */
    @FindBy(xpath = "//input[@id=\"x_naci_family_coho_family_history_details.other_race\"]")
    public WebElement nVFamilyMemberDetailsRecordDemographicsTabParticipantRaceOtherText;

    /* *************************************************************** */

    /* **** VERIFIES CONTACT INFO DATA IN FAMILY MEMBERS DETAILS PAGE *** */

    /* --------- CONTACT INFO tab ----------- */
    @FindBy(xpath = "//form[@name=\"x_naci_family_coho_family_history_details.do\"]//div[@role=\"tablist\"]//span[normalize-space()=\"Contact Info\"]")
    public WebElement nVFamilyMemberDetailsRecordContactInfoTab;

    /*-- CONTACT INFO tab--> Does the participant need legal representation? DropDown selected option --- */
    @FindBy(xpath = "//select[@name=\"x_naci_family_coho_family_history_details.proxy_required\"]//option[@selected=\"SELECTED\"]")
    public WebElement nVFamilyMemberDetailsRecordContactInfoTabDoesParticipantNeedLegalRepresentation;

    /* ------ CONTACT INFO tab--> Legal Representative Name------------ */
    @FindBy(xpath = "//input[@name=\"x_naci_family_coho_family_history_details.legal_representative_name\"]")
    public WebElement nVFamilyMemberDetailsRecordContactInfoTabLegalRepresentativeName;

    /*-- CONTACT INFO tab--> What is your relationship to this person? DropDown selected option */
    @FindBy(xpath = "//select[@name=\"x_naci_family_coho_family_history_details.relationship\"]//option[@selected=\"SELECTED\"]")
    public WebElement nVFamilyMemberDetailsRecordContactInfoTabWhatIsYourRelationshipToThisPerson;

    /*-- CONTACT INFO tab--> Are you the legal guardian of this person? DropDown selected option --*/
    @FindBy(xpath = "//select[@name=\"x_naci_family_coho_family_history_details.legal_guardian\"]//option[@selected=\"SELECTED\"]")
    public WebElement nVFamilyMemberDetailsRecordContactInfoTabAreYouTheLegalGuardianOfThisPerson;

    /* CONTACT INFO tab--> Please specify your relationship to the participant */
    @FindBy(xpath = "//input[@name=\"x_naci_family_coho_family_history_details.proxy_relationship_to_participant\"]")
    public WebElement nVFamilyMemberDetailsRecordContactInfoTabSpecifyYourRelationshipToTheParticipant;

    /* ------ CONTACT INFO tab--> Contact Street Address------------ */
    @FindBy(xpath = "//input[@name=\"x_naci_family_coho_family_history_details.street_address\"]")
    public WebElement nVFamilyMemberDetailsRecordContactInfoTabStreetAddress;

    /* ----- CONTACT INFO tab--> Contact State- ------ */
    @FindBy(xpath = "//input[@name=\"x_naci_family_coho_family_history_details.state\"]")
    public WebElement nVFamilyMemberDetailsRecordContactInfoTabState;

    /* ----- CONTACT INFO tab--> Contact City ------ */
    @FindBy(xpath = "//input[@name=\"x_naci_family_coho_family_history_details.city\"]")
    public WebElement nVFamilyMemberDetailsRecordContactInfoTabCity;

    /* ----- CONTACT INFO tab--> Contact Country ------ */
    @FindBy(xpath = "//select[@name=\"x_naci_family_coho_family_history_details.proxy_contact_country\"]//option[@selected=\"SELECTED\"]")
    public WebElement nVFamilyMemberDetailsRecordContactInfoTabCountry;

    /* ----- CONTACT INFO tab--> Contact ZipCode ------ */
    @FindBy(xpath = "//input[@name=\"x_naci_family_coho_family_history_details.zipcode\"]")
    public WebElement nVFamilyMemberDetailsRecordContactInfoTabZipcode;

    /* ----- CONTACT INFO tab--> Contact Email ------ */
    @FindBy(xpath = "//input[@name=\"x_naci_family_coho_family_history_details.proxy_email_address\"]")
    public WebElement nVFamilyMemberDetailsRecordContactInfoTabEmail;

    /* ----- CONTACT INFO tab--> Contact Home Phone ------ */
    @FindBy(xpath = "//input[@id=\"x_naci_family_coho_family_history_details.phone\"]")
    public WebElement nVFamilyMemberDetailsRecordContactInfoTabHomePhone;

    /* ----- CONTACT INFO tab--> Contact Cell Phone ------ */
    @FindBy(xpath = "//input[@name=\"x_naci_family_coho_family_history_details.cell_phone\"]")
    public WebElement nVFamilyMemberDetailsRecordContactInfoTabCellPhone;

    /* ----- CONTACT INFO tab--> Contact Work Phone ------ */
    @FindBy(xpath = "//input[@id=\"x_naci_family_coho_family_history_details.work_phone\"]")
    public WebElement nVFamilyMemberDetailsRecordContactInfoTabWorkPhone;

    /* *************************************************************** */

    /* *** VERIFIES MEDICAL INFORMATION DATA IN FAMILY MEMBERS DETAILS PAGE *** */

    /* --------- MEDICAL INFORMATION tab ----------- */
    @FindBy(xpath = "//form[@name=\"x_naci_family_coho_family_history_details.do\"]//div[@role=\"tablist\"]//span[normalize-space()=\"Medical Information\"]")
    public WebElement nVFamilyMemberDetailsRecordMedicalInfoTab;

    /*
     * -- MEDICAL INFORMATION tab--> Has a physician ever diagnosed this participant
     * with cancer? DropDown selected option --
     */
    @FindBy(xpath = "//select[@name=\"x_naci_family_coho_family_history_details.has_cancer\"]//option[@selected=\"SELECTED\"]")
    public WebElement nVFamilyMemberDetailsRecordMedicalInfoPhysicianDiagnosedParticipantWithCancer;

    /*
     * -- MEDICAL INFORMATION tab--> Has the participant ever had genetic testing?
     * DropDown selected option --
     */
    @FindBy(xpath = "//select[@name=\"x_naci_family_coho_family_history_details.genetic_testing\"]//option[@selected=\"SELECTED\"]")
    public WebElement nVFamilyMemberDetailsRecordMedicalInfoParticipantEverHadGeneticTesting;

    /* -- MEDICAL INFORMATION tab--> Vital Status? DropDown selected option -- */
    @FindBy(xpath = "//select[@name=\"x_naci_family_coho_family_history_details.person_alive\"]//option[@selected=\"SELECTED\"]")
    public WebElement nVFamilyMemberDetailsRecordMedicalInfoParticipantVitalStatus;

    /* *************************************************************** */

    /* *** VERIFIES DATA IN THE PARTICIPANT CANCER HISTORY TAB *** */

    @FindBy(xpath = "\"(//span[starts-with(normalize-space(), 'Patient Cancer History')])[1]\")")
    public WebElement nVPatientCancerHistorytTab;

    @FindBy(xpath = "//iframe[@id='gsft_main']")
    public WebElement nVPatientCancerHistoryIframe;

    @FindBy(xpath = "//a[@aria-label=\"Preview record: Skin cancer (i.e.Melanoma)\"]")
    public WebElement nVReferralPatientCancerIntakeFormForSkinCancerButton;

    @FindBy(xpath = "//a[@aria-label=\"Preview record: Breast left\"]")
    public WebElement nVReferralPatientCancerIntakeFormForBreastLeftButton;

    @FindBy(xpath = "//a[@title=\"Preview Anal cancer\"]")
    public WebElement nVReferralPatientCancerIntakeFormForAnalCancerButton;

    @FindBy(xpath = "//a[@aria-label=\"Preview record: Adrenal Gland\"]")
    public WebElement nVReferralPatientCancerIntakeFormForAdrenalGlandButton;

    @FindBy(xpath = "//a[normalize-space()=\"Open Record\"]")
    public WebElement nVReferralPatientIntakeFormPreviewOpenRecordButton;

    @FindBy(xpath = "//input[@name=\"sys_display.x_naci_family_coho_mock_up_intake_patient_cancer.cancer_type\"]")
    public WebElement nVReferralPatientCancerIntakeFormCancerTypeOrSite;

    @FindBy(xpath = "//select[@name=\"x_naci_family_coho_mock_up_intake_patient_cancer.currently_being_treated\"]//option[@selected=\"SELECTED\"]")
    public WebElement nVReferralPatientCancerIntakeFormCurrentlyBeingTreated;

    @FindBy(xpath = "//input[@name=\"x_naci_family_coho_mock_up_intake_patient_cancer.year_of_diagnosis\"]")
    public WebElement nVReferralPatientCancerIntakeFormYearOfDiagnosis;

    @FindBy(xpath = "//input[@name=\"x_naci_family_coho_mock_up_intake_patient_cancer.age_in_years_at_diagnosis\"]")
    public WebElement nVReferralPatientCancerIntakeFormHowOldWasParticipantWhenCancerWasDiagnosed;

    @FindBy(xpath = "//select[contains(@name,\"x_naci_family_coho_mock_up_intake_patient_cancer.age_range\")]//option[@selected=\"SELECTED\"]")
    public WebElement nVReferralPatientCancerIntakeFormIfUnknownSelectAgeRange;

    @FindBy(xpath = "//button[@aria-label=\"Back\"]")
    public WebElement nVReferralParticipantIntakeFormBackButton;

    /* *************************************************************** */

    @FindBy(xpath = "//*[@id=\"tabs2_list\"]/span[2]/span/span[2]")
    public WebElement nVParticipantGeneticHistoryTab;

    @FindBy(xpath = "//a[contains(@aria-label,\"Open record: SPRED1 (Legius syndrome)\")]")
    public WebElement nVParticipantGeneticHistorySpred1LegiusSyndrome;

    @FindBy(xpath = "//textarea[@aria-label=\"Genes\"]")
    public WebElement nVParticipantGeneticHistoryGenes;

    @FindBy(xpath = "//p[@title=\"Studies\"]")
    public WebElement nVParticipantGeneticHistoryStudies;

    /* ***** VERIFIES DATA IN THE PARTICIPANT GENETIC HISTORY TAB ***** */
    @FindBy(xpath = "//table[contains(@aria-label,\"Participant Genetic History.\")]")
    public WebElement participantGeneticHistoryTable;

    @FindBy(xpath = "//div[@data-position-below-header=\"true\"]")
    public WebElement nVFamilyMembersDetailPage;

    /*
     *
     *
     * @FindBy(xpath =
     * "//body[1]/div[2]/div[2]/div[1]/div[2]/span[1]/div[2]/div[4]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/a[1]")
     * public WebElement nVParticipantGeneticHistoryOtherGenesSyndromes;
     *
     * @FindBy(xpath =
     * "//body[1]/div[2]/div[2]/div[1]/div[2]/span[1]/div[2]/div[4]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[2]/td[2]/a[1]")
     * public WebElement nVParticipantGeneticHistoryHrasCostelloSyndrome;
     *
     * @FindBy(xpath =
     * "//body[1]/div[2]/div[2]/div[1]/div[2]/span[1]/div[2]/div[4]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[3]/td[2]/a[1]")
     * public WebElement nVParticipantGeneticHistorySpred1LegiusSyndrome;
     *
     * @FindBy(xpath =
     * "//body[1]/div[2]/div[2]/div[1]/div[2]/span[1]/div[2]/div[4]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[4]/td[2]/a[1]")
     * public WebElement nVParticipantGeneticHistoryBrafKrasMek1Map2k1Mek2Mapk2;
     *
     * @FindBy(xpath = "//tbody/tr[5]/td[2]/a[1]") public WebElement
     * nVParticipantGeneticHistoryBrafCblKrasLztr1Map3k8MrasNr;
     *
     * @FindBy(xpath = "//tbody/tr[6]/td[2]/a[1]") public WebElement
     * nVParticipantGeneticHistoryPtpn11Raf1NoonanSyndrome;
     *
     * @FindBy(xpath = "//tbody/tr[7]/td[2]/a[1]") public WebElement
     * nVParticipantGeneticHistorySyngap1Syndrome;
     *
     * @FindBy(xpath = "//tbody/tr[8]/td[2]/a[1]") public WebElement
     * nVParticipantGeneticHistoryRasa1CapillaryArteriovenousMalformat;
     *
     * @FindBy(xpath =
     * "//select[@name=\"sys_select.x_naci_family_coho_fcsms_intake_form_patient_genetic_tests.tested_genes_syndromes\"]//option[@selected=\"SELECTED\"]")
     * public WebElement
     * nVParticipantGeneticTestsIntakeFormTestedGenesHereditaryCancerSyndromes;
     */

    @FindBy(xpath = "//select[@id=\"sys_select.x_naci_family_coho_fcsms_intake_form_patient_genetic_tests.tested_genes_syndromes\"]//option[@selected=\"SELECTED\"]")
    public WebElement nVParticipantGeneticTestedGenesSyndromes;

    @FindBy(xpath = "//input[@name=\"sys_display.x_naci_family_coho_fcsms_intake_form_patient_genetic_tests.intake_form\"]")
    public WebElement nVParticipantGeneticIntakeFormReferralId;

    @FindBy(xpath = "//select[@name=\"x_naci_family_coho_fcsms_intake_form_patient_genetic_tests.test_result\"]//option[@selected=\"SELECTED\"]")
    public WebElement nVParticipantGeneticTestResult;

    /* *************************************************************** */

    /* ************* VERIFIES DATA IN THE RAS REFERRAL PAGE ************* */

    /* Family Member Details Page --> Referral data field populated automatically */
    @FindBy(xpath = "//input[@name=\"sys_display.x_naci_family_coho_family_history_details.proband_screener\"]")
    public WebElement nVFamilyMemberDetailsRecordPageReferral;

    /* Family Member Details Page --> Preview Referral Record Radio Button */
    @FindBy(xpath = "//button[@name=\"viewr.x_naci_family_coho_family_history_details.proband_screener\"]")
    public WebElement nVFamilyMemberDetailsRecordPagePreviewReferralRecordButton;

    /* Family Member Details Page --> Preview Referral Record iFrame */
    @FindBy(xpath = "//div[@class=\"popover glide-popup fade top in\"]")
    public WebElement nVFamilyMemberDetailsRecordPagePreviewReferralRecordIframe;

    /*-- Family Member Details Page --> Open Record button in the Preview Referral Record iFrame -- */
    @FindBy(xpath = "//a[@class=\"btn btn-sm btn-default pop-over-button pull-right\"]")
    public WebElement nVFamilyMemberDetailsRecordPagePreviewReferralRecordIframeOpenRecord;

    /* ---- RAS Referral view page --> RAS Referral bar Title ---- */
    @FindBy(xpath = "//h1[@class=\"form_header navbar-title navbar-title-twoline\"]")
    public WebElement nVRasReferralViewPageRASReferralBarTitle;

    /*-- RAS Referral view page -->Does the participant need legal representation? DropDown selected option --- */
    @FindBy(xpath = "//select[@name=\"x_naci_family_coho_ras_referral.family_member_record.proxy_required\"]//option[@selected=\"SELECTED\"]")
    public WebElement nVRasReferralViewPageDoesParticipantNeedLegalRepresentation;

    /* RAS Referral view page -->Legal Representative Name */
    @FindBy(xpath = "//input[@name=\"x_naci_family_coho_ras_referral.family_member_record.legal_representative_name\"]")
    public WebElement nVRasReferralViewPageLegalRepresentativeName;

    /*-- RAS Referral view page -->What is your relationship to this person? DropDown selected option -- */
    @FindBy(xpath = "//select[contains(@name,\"x_naci_family_coho_ras_referral.family_member_record.relationship\")]//option[@selected=\"SELECTED\"]")
    public WebElement nVRasReferralViewPageWhatIsYourRelationshipToThisPerson;

    /*-- RAS Referral view page --> Are you the legal guardian of this person? DropDown selected option -- */
    @FindBy(xpath = "//select[@name=\"x_naci_family_coho_ras_referral.family_member_record.legal_guardian\"]//option[@selected=\"SELECTED\"]")
    public WebElement nVRasReferralViewPageAreYouTheLegalGuardianOfThisPerson;

    /*-- RAS Referral view page --> Please specify your relationship to the participant--- */
    @FindBy(xpath = "//input[@name=\"x_naci_family_coho_ras_referral.family_member_record.proxy_relationship_to_participant\"]")
    public WebElement nVRasReferralViewPagespecifyYourRelationshipToTheParticipant;

    /* RAS Referral view page --> Study */
    @FindBy(xpath = "//input[@name=\"sys_display.x_naci_family_coho_ras_referral.study\"]")
    public WebElement nVRasReferralViewPageStudy;

    /* RAS Referral view page --> Family Member Record */
    @FindBy(xpath = "//input[@name=\"sys_display.x_naci_family_coho_ras_referral.family_member_record\"]")
    public WebElement nVRasReferralViewPageFamilyMemberRecord;

    /* RAS Referral view page --> Vital Status ? DropDown selected option */
    @FindBy(xpath = "//select[@name=\"x_naci_family_coho_ras_referral.family_member_record.person_alive\"]//option[@selected=\"SELECTED\"]")
    public WebElement nVRasReferralViewPageVitalStatus;

    /* RAS Referral view page --> Referral Submitted? DropDown selected option */
    @FindBy(xpath = "//input[@aria-label=\"Referral Submitted\"]")
    public WebElement nVRasReferralViewPageReferralSubmitted;

    /* RAS Referral view page --> Eligibility Status? DropDown selected option */
    @FindBy(xpath = "//select[@name=\"sys_readonly.x_naci_family_coho_ras_referral.family_member_record.eligibility_status\"]//option[@selected=\"SELECTED\"]")
    public WebElement nVRasReferralViewPageEligibilityStatus;

    /* RAS Referral view page --> Enrollment Status? DropDown selected option */
    @FindBy(xpath = "//select[@name=\"sys_readonly.x_naci_family_coho_ras_referral.family_member_record.enrollment_status\"]//option[@selected=\"SELECTED\"]")
    public WebElement nVRasReferralViewPageEnrollmentStatus;

    /* ******* RAS REFERRAL VIEW PAGE--> CONTACT INFO TAB******** */

    /* RAS Referral view page --> Contact Information Tab */
    @FindBy(xpath = "//span[normalize-space()=\"Contact Information\"]")
    public WebElement nVRasReferralViewPageContactInformationTab;

    /* RAS Referral view page Contact Information Tab--> Contact Email */
    @FindBy(xpath = "//input[@name=\"x_naci_family_coho_ras_referral.family_member_record.proxy_email_address\"]")
    public WebElement nVRasReferralViewPageContactInformationTabContactEmail;

    /* RAS Referral view page Contact Information Tab--> Contact Home Phone */
    @FindBy(xpath = "//input[@name=\"x_naci_family_coho_ras_referral.family_member_record.phone\"]")
    public WebElement nVRasReferralViewPageContactInformationTabContactHomePhone;

    /* RAS Referral view page Contact Information Tab--> Contact Cell Phone */
    @FindBy(xpath = "//input[@name=\"x_naci_family_coho_ras_referral.family_member_record.cell_phone\"]")
    public WebElement nVRasReferralViewPageContactInformationTabContactCellPhone;

    /* RAS Referral view page Contact Information Tab--> Contact Work Phone */
    @FindBy(xpath = "//input[@name=\"x_naci_family_coho_ras_referral.family_member_record.work_phone\"]")
    public WebElement nVRasReferralViewPageContactInformationTabContactWorkPhone;

    /*--RAS Referral view page Contact Information Tab--> Country of Birth? DropDown selected option--*/
    @FindBy(xpath = "//select[@name=\"x_naci_family_coho_ras_referral.country_of_birth\"]//option[@selected=\"SELECTED\"]")
    public WebElement nVRasReferralViewPageContactInformationTabCountryOfBirth;

    /* RAS Referral view page Contact Information Tab--> Contact Street Address */
    @FindBy(xpath = "//input[@name=\"x_naci_family_coho_ras_referral.family_member_record.street_address\"]")
    public WebElement nVRasReferralViewPageContactInformationTabContactStreetAddress;

    /* RAS Referral view page Contact Information Tab--> Contact City */
    @FindBy(xpath = "//input[@name=\"x_naci_family_coho_ras_referral.family_member_record.city\"]")
    public WebElement nVRasReferralViewPageContactInformationTabContactCity;

    /* RAS Referral view page Contact Information Tab--> Contact State */
    @FindBy(xpath = "//input[@name=\"x_naci_family_coho_ras_referral.family_member_record.state\"]")
    public WebElement nVRasReferralViewPageContactInformationTabContactState;

    /* RAS Referral view page Contact Information Tab--> Contact ZipCode */
    @FindBy(xpath = "//input[@name=\"x_naci_family_coho_ras_referral.family_member_record.zipcode\"]")
    public WebElement nVRasReferralViewPageContactInformationTabContactZipCode;

    /* ******* RAS REFERRAL VIEW PAGE--> DEMOGRAPHIC TAB******** */

    /* RAS Referral view page --> Demographics Tab */
    @FindBy(xpath = "//span[normalize-space()=\"Demographics\"]")
    public WebElement nVRasReferralViewPageDemographicsTab;

    /*--RAS Referral view page Demographics Tab--> Participant Race (Select all that apply)-- */
    @FindBy(xpath = "//p[@data-original-title='Participant Race (Select all that apply)']")
    public WebElement nVRasReferralViewPageDemographicsTabParticipantRace;

    /* RAS Referral view page Demographics Tab--> Other */
    @FindBy(xpath = "//input[@name=\"x_naci_family_coho_ras_referral.family_member_record.other_race\"]")
    public WebElement nVRasReferralViewPageDemographicsTabOther;

    /*
     * RAS Referral view page Demographics Tab--> Biological Gender? DropDown
     * selected option
     */
    @FindBy(xpath = "//select[@name=\"x_naci_family_coho_ras_referral.family_member_record.biological_gender\"]//option[@selected=\"SELECTED\"]")
    public WebElement nVRasReferralViewPageDemographicsTabBiologicalGender;

    /* RAS Referral view page Demographics Tab--> Date of Birth */
    @FindBy(xpath = "//input[@value=\"04/01/1990\"]")
    public WebElement nVRasReferralViewPageDemographicsTabDateOfBirth;

    /*
     * RAS Referral view page Demographics Tab--> Ethnicity? DropDown selected
     * option
     */
    @FindBy(xpath = "//select[@name=\"x_naci_family_coho_ras_referral.family_member_record.ethnicity\"]//option[@selected=\"SELECTED\"]")
    public WebElement nVRasReferralViewPageDemographicsTabEthnicity;

    /* RAS Referral view page --> RASopathy History Tab */
    @FindBy(xpath = "//span[normalize-space()=\"RASopathy History\"]")
    public WebElement nVRasReferralViewPageRASopathyHistoryTab;

    /*
     * RAS Referral view page RASopathy History Tab --> Have you been diagnosed with
     * a RASopathy ? DropDown selected option
     */
    @FindBy(xpath = "//select[@id=\"x_naci_family_coho_ras_referral.rasopathy_diagnosis\"]//option[@selected=\"SELECTED\"]")
    public WebElement nVRasReferralViewPageRASopathyHistoryTabHaveYouBeenDiagnosedWithRASopathy;

    /*
     * RAS Referral view page RASopathy History Tab --> RASopathy diagnosis ?
     * DropDown selected option
     */
    @FindBy(xpath = "//select[@name=\"x_naci_family_coho_ras_referral.ras_diagnosis\"]//option[@selected=\"SELECTED\"]")
    public WebElement nVRasReferralViewPageRASopathyHistoryTabRASopathyDiagnosis;

    /* RAS Referral view page RASopathy History Tab --> Please specify */
    @FindBy(xpath = "//input[@name=\"x_naci_family_coho_ras_referral.ras_diagnosis_please_specify\"]")
    public WebElement nVRasReferralViewPageRASopathyHistoryTabASopathyDiagnosisPleaseSpecify;

    /*
     * RAS Referral view page RASopathy History Tab --> Age(in years) at diagnosis
     */
    @FindBy(xpath = "//input[@name=\"x_naci_family_coho_ras_referral.age_in_years_at_diagnosis\"]")
    public WebElement nVRasReferralViewPageRASopathyHistoryTabAgeInYearsAtDiagnosis;

    /* RAS Referral view page RASopathy History Tab --> Year of diagnosis */
    @FindBy(xpath = "//input[@name=\"x_naci_family_coho_ras_referral.year_of_ras_diagnosis\"]")
    public WebElement nVRasReferralViewPageRASopathyHistoryTabYearOfDiagnosis;

    /*
     * RAS Referral view page RASopathy History Tab --> Has the participant been
     * diagnosed with any of the following Conditions?
     */
    @FindBy(xpath = "//p[@title=\"Has the participant been diagnosed with any of the following Conditions?\"]")
    public WebElement nVRasReferralViewPageRASopathyHistoryTabHasParticipantBeenDiagnosedWithAnyOfTheFollowingConditions;

    /* RAS Referral view page RASopathy History Tab --> Other conditions */
    @FindBy(xpath = "//textarea[@name=\"x_naci_family_coho_ras_referral.other_conditions\"]")
    public WebElement nVRasReferralViewPageRASopathyHistoryTabOtherConditions;

    /*
     * RAS Referral view page RASopathy History Tab --> Have any of your biological
     * relatives been diagnosed with a RASopathy? DropDown selected option
     */
    @FindBy(xpath = "//select[@name=\"x_naci_family_coho_ras_referral.realtives_rasopathy_diagnosis\"]//option[@selected=\"SELECTED\"]")
    public WebElement nVRasReferralViewPageRASopathyHistoryTabHaveAnyOfYourBiologicalRelativesBeenDiagnosedWithRASopathy;

    /* RAS Referral view page --> Cancer History Tab */
    @FindBy(xpath = "//span[normalize-space()=\"Cancer History\"]")
    public WebElement nVRasReferralViewPageCancerHistoryTab;

    /*
     * RAS Referral view page Cancer History Tab --> Has a physician ever diagnosed
     * this participant with cancer? DropDown selected option
     */
    @FindBy(xpath = "//select[@name=\"x_naci_family_coho_ras_referral.family_member_record.has_cancer\"]//option[@selected=\"SELECTED\"]")
    public WebElement nVRasReferralViewPageCancerHistoryTabHasPhysicianEverDiagnosedParticipantWithCancer;

    /* RAS Referral view page --> Genetic Testing History Tab */
    @FindBy(xpath = "//span[normalize-space()=\"Genetic Testing History\"]")
    public WebElement nVRasReferralViewPageGeneticTestingHistoryTab;

    /*
     * RAS Referral view page Genetic Testing History Tab --> Has the participant
     * ever had genetic testing? DropDown selected option
     */
    @FindBy(xpath = "//select[@name=\"x_naci_family_coho_ras_referral.family_member_record.genetic_testing\"]//option[@selected=\"SELECTED\"]")
    public WebElement nVRasReferralViewPageGeneticTestingHistoryTabHasParticipantEverHadGeneticTesting;

    /*
     * RAS Referral view page Genetic Testing History Tab --> Does the participant
     * have a copy of the genetic test results? DropDown selected option
     */
    @FindBy(xpath = "//select[@name=\"x_naci_family_coho_ras_referral.copy_of_genetic_test_results\"]//option[@selected=\"SELECTED\"]")
    public WebElement nVRasReferralViewPageGeneticTestingHistoryTabDoesParticipantHaveCopyOfGeneticTestResults;

    /*
     * RAS Referral view page Genetic Testing History Tab --> Participants preferred
     * method of delivering genetic test results ? DropDown selected option
     */
    @FindBy(xpath = "//select[@name=\"x_naci_family_coho_ras_referral.participants_preferred_method_of_delivering_genetic_test_results\"]//option[@selected=\"SELECTED\"]")
    public WebElement nVRasReferralViewPageGeneticTestingHistoryTabParticipantPreferredMethodOfDeliveringGeneticTestResults;

    /*
     * RAS Referral view page Genetic Testing History Tab --> Have any relatives
     * been genetically tested for inherited cancer syndromes? DropDown selected
     * option
     */
    @FindBy(xpath = "//select[@name=\"x_naci_family_coho_ras_referral.relatives_had_genetic_testing\"]//option[@selected=\"SELECTED\"]")
    public WebElement nVRasReferralViewPageGeneticTestingHistoryTabHaveAnyRelativesBeenGeneticallyTestedFoInheritedCancerSyndromes;

    /* RAS Referral view page --> Final Information Tab */
    @FindBy(xpath = "//span[normalize-space()=\"Final Information\"]")
    public WebElement nVRasReferralViewPageFinalInformationTab;

    /*
     * RAS Referral view page Final Information Tab --> How did you hear about this
     * study? DropDown selected option
     */
    @FindBy(xpath = "//select[@name=\"x_naci_family_coho_ras_referral.hear_about_this_study\"]//option[@selected=\"SELECTED\"]")
    public WebElement nVRasReferralViewPageFinalInformationTabHowDidYouHearAboutThisStudy;

    /* RAS Referral view page Final Information Tab --> Please specify */
    @FindBy(xpath = "//input[@name=\"x_naci_family_coho_ras_referral.other_how_did_you_hear\"]")
    public WebElement nVRasReferralViewPageFinalInformationTabPleaseSpecify;

    /*
     * RAS Referral view page Final Information Tab --> Has the participant or any
     * family member participated in any cancer study? DropDown selected option
     */
    @FindBy(xpath = "//select[@name=\"x_naci_family_coho_ras_referral.participated_through_another_institution\"]//option[@selected=\"SELECTED\"]")
    public WebElement nVRasReferralViewPageFinalInformationTabHasParticipantOrAnyFamilyMemberParticipatedInAnyCancerStudy;

    /*
     * RAS Referral view page Final Information Tab --> Are any relatives currently
     * receiving cancer care or follow-up? DropDown selected option
     */
    @FindBy(xpath = "//select[@name=\"x_naci_family_coho_ras_referral.received_cancer_care\"]//option[@selected=\"SELECTED\"]")
    public WebElement nVRasReferralViewPageFinalInformationTabAreAnyRelativesCurrentlyReceivingCancerCareOrFollowUp;

    /*
     * RAS Referral view page Final Information Tab --> Main reasons for
     * participating in this study? Select all that apply.
     */
    @FindBy(xpath = "//p[contains(text(),\"Participate in research, Identify a diagnosis, Rec\")]")
    public WebElement nVRasReferralViewPageFinalInformationTabMainReasonsForParticipatingInThisStudy;

    /* RAS Referral view page Final Information Tab --> Identify a diagnosis */
    @FindBy(xpath = "//input[contains(@aria-label,\"Identify a diagnosis\")]")
    public WebElement nVRasReferralViewPageFinalInformationTabIdentifyDiagnosis;

    /* RAS Referral view page Final Information Tab --> Receive genetic testing */
    @FindBy(xpath = "//input[@name=\"x_naci_family_coho_ras_referral.receive_genetic_testing\"]")
    public WebElement nVRasReferralViewPageFinalInformationTabReceiveGeneticTesting;

    /* RAS Referral view page Final Information Tab --> Participate in research */
    @FindBy(xpath = "//input[@name=\"x_naci_family_coho_ras_referral.participate_in_research\"]")
    public WebElement nVRasReferralViewPageFinalInformationTabParticipateInResearch;

    /* RAS Referral view page Final Information Tab --> Other */
    @FindBy(xpath = "//input[@name=\"x_naci_family_coho_ras_referral.other_reason_for_participation\"]")
    public WebElement nVRasReferralViewPageFinalInformationTabOther;

    /*
     * RAS Referral view page Final Information Tab --> Are you a participant in any
     * other research study or registry group? DropDown selected option
     */
    @FindBy(xpath = "//select[@name=\"x_naci_family_coho_ras_referral.additional_ras_study_participation\"]//option[@selected=\"SELECTED\"]")
    public WebElement nVRasReferralViewPageFinalInformationTabAreYouParticipantInAnyOtherResearchStudyOrRegistryGroup;

    /* RAS Referral view page Final Information Tab --> Comments */
    @FindBy(xpath = "//textarea[@name=\"x_naci_family_coho_ras_referral.comments\"]")
    public WebElement nVRasReferralViewPageFinalInformationTabComments;

    /* RAS Referral view page --> Comments Tab */
    @FindBy(xpath = "//span[contains(@class,\"tab_caption_text\")][normalize-space()=\"Comments\"]")
    public WebElement nVRasReferralViewPageCommentsTab;

    /* RAS Referral view page Comments Tab --> Comments */
    @FindBy(xpath = "//textarea[@class=\"sn-string-textarea form-control ng-pristine ng-untouched ng-valid ng-isolate-scope ng-empty ng-valid-required\"]")
    public WebElement nVRasReferralViewPageCommentsTabComments;

    /* RAS Referral view page Comments Tab --> Activities: 1 */
    @FindBy(xpath = "//span[contains(@class,\"sn-card-component-createdby\")]")
    public WebElement nVRasReferralViewPageCommentsTabActivities1;

    /* Native view Family Member Details --> Submit for Eligibility Review button */
    @FindBy(xpath = "//span[@class='navbar_ui_actions']//button[@value='ea5e9eacdb998810b86770c08c96196e'][normalize-space()='Submit for Eligibility Review']")
    public WebElement nativeViewFamilyMemberDetailsAutomatedTestRecordSubmitForEligibilityReviewButton;

    /* Native view Family Member Details --> Mark Eligible button */
    @FindBy(xpath = "//span[contains(@class,'navbar_ui_actions')]//button[contains(@name,'not_important')][normalize-space()='Mark Eligible']")
    public WebElement nativeViewFamilyMemberDetailsAutomatedTestRecordMarkEligibleButton;

    /* Native view Family Member Details --> History Tab */
    @FindBy(xpath = "//span[normalize-space()='History']")
    public WebElement nativeViewFamilyMemberDetailsAutomatedTestRecordHistoryTab;

    /* Native view Family Member Details --> History comments box */
    @FindBy(xpath = "//textarea[contains(@class,'sn-string-textarea form-control ng-pristine ng-untouched ng-valid ng-isolate-scope ng-empty ng-valid-required')]")
    public WebElement nativeViewFamilyMemberDetailsAutomatedTestRecordHistoryCommentsBox;

    /* Native view Family Member Details--> History comments box */
    @FindBy(xpath = "//span[@class='navbar_ui_actions']//button[@value='e65678521bc9b814e541631ee54bcb87'][normalize-space()='Send Consent']")
    public WebElement nativeViewFamilyMemberDetailsAutomatedTestRecordSendConsentButton;

    /* ------ Native view 'DJ' button ----- */
    @FindBy(xpath = "//span[contains(text(),'DJ')]")
    public WebElement nativeViewDJButton;

    /* ----- Native view Log Out------ */
    @FindBy(xpath = "//a[normalize-space()='Log out']")
    public WebElement nativeViewLogOutButton;

    /* ----- Native view Awaiting PI Signature link ----- */
    @FindBy(xpath = "/html/body/div[1]/div[4]/div[1]/div[2]/div[2]/div/div[7]/div[1]/div[2]/div[1]/div[3]/div/span/a")
    public WebElement nativeViewAwaitingPISignatureLink;

    /* ------ Native view Family Study Consent link ------ */
    @FindBy(xpath = "//a[normalize-space()='Family Cohort Study Consent.pdf']")
    public WebElement nativeViewFamilyStudyConsentLink;

    /* ----- Native view Family Sign Consent button ------- */
    @FindBy(xpath = "//span[@class='navbar_ui_actions']//button[@value='cc01bb4cdbd7c810b86770c08c9619dc'][normalize-space()='Sign Consent']")
    public WebElement nativeViewSignConsentButton;

    /* **************************************************** */

    /**
     * ----- BEGINNING OF Native view RAS Survey Data Verification -------
     */

    /* ----- Native view Rasopathy Survey module ------- */
    @FindBy(xpath = "//div[contains(text(),'RASopathy Surveys')]")
    public WebElement nativeViewRasSurveyRASopathySurveysModule;

    /* ----- Native view Rasopathy Survey iFrame ------- */
    @FindBy(xpath = "//*[@id='gsft_main']")
    public WebElement nativeViewRasSurveyRASopathySurveyIframe;

    /* ----- Native view Rasopathy Test Record Preview button ------- */
    @FindBy(xpath = "/html/body/div[1]/div[1]/span/div/div[5]/table/tbody/tr/td/div/table/tbody/tr[1]/td[2]/a")
    public WebElement nativeViewRasSurveyTestRecordPreviewButton;

    /* ----- Native view Rasopathy Open Record button ------- */
    @FindBy(xpath = "//a[normalize-space()='Open Record']")
    public WebElement nativeViewRasSurveyOpenRecordButton;

    /**
     * ************************** BEGINNING OF BASIC INFORMATION SECTION
     * **************************
     */

    /* ----- Native view Rasopathy Participant name text box ------- */
    @FindBy(xpath = "//input[@name='sys_display.x_naci_family_coho_rasopathy_iiq.participant']")
    public WebElement nativeViewRasSurveyParticipantNameTextBox;

    /* ----- Native view Rasopathy Survey Study text box ------- */
    @FindBy(xpath = "//input[@name='sys_display.x_naci_family_coho_rasopathy_iiq.participant.family.study']")
    public WebElement nativeViewRasSurveyStudyTextBox;

    /* ----- Native view Rasopathy Survey Eligibility status field ------- */
    @FindBy(xpath = "//option[@value='eligible']")
    public WebElement nativeViewRasSurveyEligibilityStatusField;

    /* ----- Native view Rasopathy Survey Enrollment status field ------- */
    @FindBy(xpath = "//option[normalize-space()='Awaiting Enrollment Forms']")
    public WebElement nativeViewRasSurveyEnrollmentStatusField;

    /**
     * ************************** END OF BASIC INFORMATION SECTION
     * **************************
     *
     */

    /**
     * ************************** BEGINNING OF DEMOGRAPHICS SECTION
     * **************************
     */

    /* ----- Native view Rasopathy Survey button ------- */
    @FindBy(xpath = "//div[contains(text(),'RASopathy Surveys')]")
    public WebElement nativeViewRasSurveyRASopathySurveysButton;

    /* ----- Native view Rasopathy Survey Demographics tab ------- */
    @FindBy(xpath = "//span[normalize-space()='Demographics']")
    public WebElement nativeViewRasSurveyDemographicsTab;

    /*
     * ----- Native view Rasopathy Survey
     * "Included in published case report or in a different public manner" drop down
     * -------
     */

    @FindBy(xpath = "//select[@name='x_naci_family_coho_rasopathy_iiq.published_case']//option[@value='1'][normalize-space()='Yes']")
    public WebElement nativeViewRasSurveyIncludedInPublishedCaseReportOrInADifferentPublicMannerDropDown;

    /*
     * ----- Native view Rasopathy Survey
     * "Additional information about authors, publication year or PubMedID" text box
     * -------
     */
    @FindBy(xpath = "//textarea[@name='x_naci_family_coho_rasopathy_iiq.published_info']")
    public WebElement nativeViewRasSurveyAdditionalInformationAboutAuthorsPublicationYearOrPubMedIDTextBox;

    /*
     * ----- Native view Rasopathy Survey "Biological mother birth location" text
     * box -------
     */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_rasopathy_iiq.bio_mom_birth_location']")
    public WebElement nativeViewRasSurveyBiologicalMotherBirthLocationTextBox;

    /*
     * ----- Native view Rasopathy Survey "Biological mother age at birth" text box
     * -------
     */
    @FindBy(xpath = "//input[@aria-label='Biological mothers age at birth']")
    public WebElement nativeViewRasSurveyBiologicalMotherAgeAtBirthTextBox;

    /*
     * ----- Native view Rasopathy Survey "Biological mother's height" text box
     * -------
     */
    @FindBy(xpath = "//input[@aria-label='Biological mothers height (cm)']")
    public WebElement nativeViewRasSurveyBiologicalMotherHeightTextBox;

    /*
     * ----- Native view Rasopathy Survey "Biological father birth location" text
     * box -------
     */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_rasopathy_iiq.bio_dad_birth_location']")
    public WebElement nativeViewRasSurveyBiologicalFatherBirthLocationTextBox;

    /*
     * ----- Native view Rasopathy Survey "Biological father age at birth" text box
     * -------
     */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_rasopathy_iiq.bio_dad_age']")
    public WebElement nativeViewRasSurveyBiologicalFatherAgeAtBirthTextBox;

    /*
     * ----- Native view Rasopathy Survey "Biological father's height" text box
     * -------
     */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_rasopathy_iiq.dad_height']")
    public WebElement nativeViewRasSurveyBiologicalFatherHeightTextBox;

    /**
     * ************************** END OF DEMOGRAPHICS SECTION
     * **************************
     */

    /**
     * ************************** BEGINNING OF BIRTH & GESTATION SECTION
     * **************************
     */

    /* ----- Native view Rasopathy Survey Birth & Gestation tab ------- */

    @FindBy(xpath = "//span[normalize-space()='Birth & Gestation']")
    public WebElement nativeViewRasSurveyBirthAndGestationTab;

    /*
     * ----- Native view Rasopathy Survey
     * "Were you diagnosed with hypoglycemia (low blood sugar) during the newborn period"
     * drop down -------
     */
    @FindBy(xpath = "//select[@name='x_naci_family_coho_rasopathy_iiq.hypoglycemia']//option[@selected='SELECTED']")
    public WebElement nativeViewRasSurveyWereYouDiagnosedWithHypoglycemiaLowBloodSugarDuringTheNewbornPeriodDropDown;

    /*
     * ----- Native view Rasopathy Survey
     * "Issues identified in the participant prior to birth/Were you diagnosed with any of the following conditions during your mothers pregnancy?"
     * text area -------
     */
    @FindBy(xpath = "//p[contains(text(),'Extra fluid in the neck area (nuchal edema), Extra')]")
    public WebElement nativeViewRasSurveyIssuesIdentifiedInTheParticipantPriorToBirthTextArea;

    /*
     * ----- Native view Rasopathy Survey Please Specify for
     * "Issues identified in the participant prior to birth/Were you diagnosed with any of the following conditions during your mothers pregnancy?"
     * text area -------
     */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_rasopathy_iiq.please_specify_issues_prior_birth']")
    public WebElement nativeViewRasSurveyIssuesIdentifiedInTheParticipantPriorToBirthPleaseSpecifyTextBox;

    /*
     * ----- Native view Rasopathy Survey
     * "Did biological mother receive prenatal tests for birth defects/medical problems"
     * Dropdown -------
     */
    @FindBy(xpath = "//select[@name='x_naci_family_coho_rasopathy_iiq.prenatal_testing']//option[@selected='SELECTED']")
    public WebElement nativeViewRasSurveyDidBiologicalMotherReceivePrenatalTestsForBirthDefectsMedicalProblemsDropDown;

    // ------- Native View Survey Participant mothers birth complications
    // -----------
    @FindBy(xpath = "//p[contains(text(),'Polyhydramnios (excess amniotic fluid), Proteinuri')]")
    public WebElement nativeViewRasSurveyParticipantmothersbirthcomplications;

    // -------- Native View Survey birth mother's complication Infection text box
    // -----
    @FindBy(xpath = "//input[@name='x_naci_family_coho_rasopathy_iiq.infection_pregnancy_condition']")
    public WebElement nativeViewRasSurveymotherscomplicationinfectiontextbox;

    // -------- Native View Survey birth mother's complication Rash text box -----
    @FindBy(xpath = "//input[@name='x_naci_family_coho_rasopathy_iiq.rash_pregnancy_condition']")
    public WebElement nativeViewRasSurveyMothersComplicationRashTextbox;

    // -------- Native View Survey birth mother's other complication Other text box
    // -----
    @FindBy(xpath = "//input[@name='x_naci_family_coho_rasopathy_iiq.other_complication']")
    public WebElement nativeViewRasSurveyMothersOtherComplicationTextbox;

    // --------- Native view Survey Were medications taken while biological mother
    // was pregnant with the participant
    @FindBy(xpath = "//select[@name='x_naci_family_coho_rasopathy_iiq.medications_while_pregnant']//option[@value='1'][normalize-space()='Yes']")
    public WebElement nativeViewRasSurveyWereMedicationsTakenWhileBioMotherPregnant;

    // --------Native View Survey Did your biological mother use any tobacco
    // products during her pregnancy with you?
    @FindBy(xpath = "//select[@name='x_naci_family_coho_rasopathy_iiq.tobacco_used_while_pregnant_mom']//option[@selected='SELECTED']")
    public WebElement natiViewRasSurveyDidBioMotherUseTobaccoDuringPregnancy;

    // --------Native View Survey Tobacco products used by mother during pregnancy
    @FindBy(xpath = "//p[contains(text(),'Cigarettes, Cigars, Pipes, Snuff, Chewing tobacco,')]")
    public WebElement nativeViewRasSurveyTobaccoProductsUsedByMother;

    // ---------Native View Survey Please Specify Other Tobacco textbox
    @FindBy(xpath = "//input[@name='x_naci_family_coho_rasopathy_iiq.please_specify_tobacco']")
    public WebElement nativeViewRasSurveyPleaseSpecifytextbox;

    // --------Native view Survey Were vaping products use by participants bio mom
    // during pregnancy dropdown
    @FindBy(xpath = "//select[@name='x_naci_family_coho_rasopathy_iiq.were_vaping_products_used']//option[@selected='SELECTED']")
    public WebElement nativeViewRasSurveyVapingProductsUsedByMotherDuringPregnacyDropDown;

    // ------Native View Survey Select all Vaping Products used by Mother
    @FindBy(xpath = "//p[contains(text(),'Electronic cigarettes, Cig-a-likes, Minis, Vape pe')]")
    public WebElement nativeViewRasSurveyVapingProductsUsed;

    // -------Native View Survey Please Specify Other Vaping Products Used Text Box
    @FindBy(xpath = "//input[@name='x_naci_family_coho_rasopathy_iiq.please_specify_vape_products']")
    public WebElement nativeViewRasSurveyPleaseSpecifyOtherVapingProductTextBox;

    // -----Native View Survey "Did your biological mother drink any alcoholic
    // beverages during her pregnancy with you?" textbox
    @FindBy(xpath = "//select[@name='x_naci_family_coho_rasopathy_iiq.alcohol_while_pregnant']//option[@selected='SELECTED']")
    public WebElement nativeViewRasSurveyDidMotherDrinkAlcoholDuringPregnancyDropDown;

    // -------Native VIew Survey Selecting Alcohol Used By Mom during pregnancy
    @FindBy(xpath = "//p[contains(text(),'Wine, Beer, Hard liquor, Liqueurs, Others (please ')]")
    public WebElement nativeViewRasSurveyAlcoholUsedByMotherDuringPregnancy;

    // -------Native View Survey Other Alcohol Please Specify Text Box
    @FindBy(xpath = "//input[@name='x_naci_family_coho_rasopathy_iiq.please_specify_alcohol']")
    public WebElement nativeViewRasSurveyOtherAlcoholPleaseSpecifyTextbox;

    // ------Native View Survey Did participants bio mother use recreational drugs
    // during pregnancy
    @FindBy(xpath = "//select[@name='x_naci_family_coho_rasopathy_iiq.drugs_used_during_pregnancy']//option[@selected='SELECTED']")
    public WebElement nativeViewRasSurveyDidMotherUseRecreationalDrugsDropdown;

    // ------Native View Survey Drugs used by biological mother during pregnancy
    @FindBy(xpath = "//p[contains(text(),'Cannabis (marijuana, weed, pot), Heroin, Cocaine, ')]")
    public WebElement nativeViewRasSurveyDrugsUsedByBioMotherSelection;

    // --------Native View Survey Other Drugs Used Please Specify Text Box
    @FindBy(xpath = "//input[@name='x_naci_family_coho_rasopathy_iiq.please_specify_drugs']")
    public WebElement nativeViewRasSurveyOtherDrugsUsedByMotherPleaseSPecifyTextBox;

    // -------Native View Survey Biological mothers occupation while pregnant with
    // the participant
    @FindBy(xpath = "//textarea[@name='x_naci_family_coho_rasopathy_iiq.occuption_while_pregnant']")
    public WebElement nativeViewRasSurveyMothersOccupationWhilePregnantTextArea;

    // --------Native View Survey Biological fathers occupation while mother was
    // pregnant with the participant
    @FindBy(xpath = "//textarea[@name='x_naci_family_coho_rasopathy_iiq.fathers_occupation_while_pregnant']")
    public WebElement nativeViewRasSurveyFatherOccupationWhileMotherPregnantWithParticipantTextArea;

    // -------Native View Survey Did the participants mother ever live/work in a
    // place where others use tobacco drop down
    @FindBy(xpath = "//select[@name='x_naci_family_coho_rasopathy_iiq.live_work_near_tobacco_usage']//option[@selected='SELECTED']")
    public WebElement nativeViewRasSurveyDidParticipantMotherLiveWhereTobaccoDropDown;

    // --------Native View Survey Tobacco products used around mother during
    // pregnancy DropDown
    @FindBy(xpath = "//select[@name='x_naci_family_coho_rasopathy_iiq.tobacco_used_while_pregnant_mom']/option[@selected='SELECTED']")
    public WebElement nativeVIewRasSurveyTobaccoProductsUsedAroundMotherDuringPregnancyDropDown;

    // --------Native View Survey OTHER Tobacco products used around mother during
    // pregnancy Please Specify
    @FindBy(xpath = "//input[@name='x_naci_family_coho_rasopathy_iiq.please_specify_tobacco_around']")
    public WebElement nativeViewRasSurveyOtherTobaccoUsedAroundMotherDuringPregPleaseSpecifyTextArea;

    /**
     * ************************** END OF BIRTH & GESTATION SECTION
     * **************************
     */

    /**
     * ************************** BEGINNING OF GROWTH SECTION
     * **************************
     */
    /* ----- Native view Rasopathy Survey GROWTH tab ------- */
    @FindBy(xpath = "//span[normalize-space()='Growth']")
    public WebElement nativeViewRasSurveyGrowthTab;

    /*
     * ----- Has the participant had growth hormone testing DropDown-------
     */
    @FindBy(xpath = "//select[@name='x_naci_family_coho_rasopathy_iiq.growth_hormone_testing']//option[@selected='SELECTED']")
    public WebElement nativeViewRasSurveyGrowthHasTheParticipantHadGrowthHormoneTestingDropDown;
    /*
     * ----- Has the participant ever been evaluated by an endocrinologist for any
     * reason? DropDown-------
     */
    @FindBy(xpath = "//select[@name='x_naci_family_coho_rasopathy_iiq.endocrinologist_evaluation']//option[@selected='SELECTED']")
    public WebElement nativeViewRasSurveyGrowthHasTheParticipantEverBeenEvaledByAnEndrocrinologistDropDown;

    /*
     * ----- Doctor/medical provider name text box -------
     */
    @FindBy(xpath = "//input[contains(@aria-label,'Doctor/medical provider name')]")
    public WebElement nativeViewRasSurveyGrowthDoctorMedicalProviderNameTextBox;

    /*
     * -----Doctor/Medical Location(City, State, Country) text box -------
     */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_rasopathy_iiq.endocrinologist_location']")
    public WebElement nativeViewRasSurveyGrowthDoctorMedicalProviderLocationTextBox;

    /*
     * ----- Hospital or Health System Affiliation text box -------
     */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_rasopathy_iiq.hosptial_or_health_system_affiliation']")
    public WebElement nativeViewRasSurveyGrowthDoctorMedicalProviderHospitalOrHealthSystemAffiliationTextBox;

    /*
     * ------ Growth Hormone Test Results Text Area -----
     */
    @FindBy(xpath = "//p[contains(text(),'Normal growth hormone levels, Growth hormone defic')]")
    public WebElement nativeViewRasSurveyGrowthHormoneResultsTextArea;

    // ---------- Growth Hormone Results TextArea Please Specify TextBox ------
    @FindBy(xpath = "//input[@name='x_naci_family_coho_rasopathy_iiq.please_specify_growth_hormone']")
    public WebElement nativeViewRasSurveyGrowthHormoneResultsTextAreaPleaseSpecifyTextBox;

    // ------ Participant Received Growth Hormone Treatment DropDown ------
    @FindBy(xpath = "//select[@name='x_naci_family_coho_rasopathy_iiq.growth_hormone_treatment']//option[@selected='SELECTED']")
    public WebElement nativeViewRasSurveyHasParticipantReceivedGrowthHormoneTreatmentDropDown;

    // ------ Height before starting growth hormone textbox ------
    @FindBy(xpath = "//input[contains(@aria-label,'Height before starting growth hormone')]")
    public WebElement nativeViewRasSurveyHeightbeforestartinggrowthhormonetextbox;

    // ------ How many times has the participant received growth hormone treatment
    // DropDown
    @FindBy(xpath = "//select[@name='x_naci_family_coho_rasopathy_iiq.growth_hormone_count']//option[@selected='SELECTED']")
    public WebElement nativeViewRasSurveyHowManyTimeshastheParticipantReceivedGrowthHormoneTreatmentDropdown;

    /**
     * ************************** END OF GROWTH SECTION
     * **************************
     */

    /**
     * *************************** BEGGINING OF DEVELOPMENT SECTION
     * **************************
     */

    // ---------- Native View Rasopathy Survey DEVELOPMENT Tab ----------
    @FindBy(xpath = "//span[normalize-space()='Development']")
    public WebElement nativeViewRasSurveyDevelopmentTab;

    // ------Native View Was the participant diagnosed with hypotonia as an infant
    // or child? DropDown
    @FindBy(xpath = "//select[@name='x_naci_family_coho_rasopathy_iiq.diagnosed_with_hypotonia']//option[@selected='SELECTED']")
    public WebElement nativeViewRasSurveyparticipantDiagnosedWithHypotoniaAsAnInfantOrChildDropDown;

    // -------Native View At what age was the participant able to sit without
    // support DropDown
    @FindBy(xpath = "//select[@name='x_naci_family_coho_rasopathy_iiq.sit_without_support']//option[@selected='SELECTED']")
    public WebElement nativeViewRasSurveyAgeAbleToSitWithoutSupportDropdown;

    // ----- Native View At What Age Was The Participant Able To Walk Without
    // Support DropDown
    @FindBy(xpath = "//select[@name='x_naci_family_coho_rasopathy_iiq.walk_without_support']//option[@selected='SELECTED']")
    public WebElement nativeViewRasSurveyAgeAbletoWalkWithoutSupportDropdown;

    // --------Native View Has Participant Received Physical Therapy DropDown
    @FindBy(xpath = "//select[@name='x_naci_family_coho_rasopathy_iiq.physical_therapy']//option[@selected='SELECTED']")
    public WebElement nativeViewRasSUrveyReceivedReceivedPhysicalTherapyDropDown;

    // -------Native View Age Participant Able to use simple two-word phrases?
    // DropDown
    @FindBy(xpath = "//select[@name='x_naci_family_coho_rasopathy_iiq.use_two_phrases']//option[@selected='SELECTED']")
    public WebElement nativeViewRasSurveyAgeAbleUseSimpleTwoWordDropdown;

    // -------Native View Curretn Speech Capabilities DropDown
    @FindBy(xpath = "//select[@name='x_naci_family_coho_rasopathy_iiq.speech_capabilities']//option[@selected='SELECTED']")
    public WebElement nativeVIewRasSurveyCurrentSpeechCapabilitiesDropDown;

    // -------Native View Has Participant Received Speech Therapy DropDown
    @FindBy(xpath = "//select[@name='x_naci_family_coho_rasopathy_iiq.speech_therapy']//option[@selected='SELECTED']")
    public WebElement nativeViewRasSurveyEverReceivedSpeechTherapyDropDown;

    // -------Native View Diagnosed with cognitive development issues between ages 3
    // & 6 DropDown
    @FindBy(xpath = "//select[@name='x_naci_family_coho_rasopathy_iiq.cognitive_development_issues']//option[@selected='SELECTED']")
    public WebElement nativeViewRasSurveyCognitiveDevIssuesBetweenThreeAndSixDropDown;

    // -------Native View Did the participant receive occupation therapy between the
    // ages of 3 & 6 DropDown
    @FindBy(xpath = "//select[@name='x_naci_family_coho_rasopathy_iiq.occupational_therapy']//option[@selected='SELECTED']")
    public WebElement nativeViewRasSurveyReceiveOccupationalTherapyBetween3And6DropDown;

    // -------Native View Schooling between the ages of 6 and 10 DropDown
    @FindBy(xpath = "//select[@name='x_naci_family_coho_rasopathy_iiq.schooling_6_10']//option[@selected='SELECTED']")
    public WebElement nativeViewRasSurveySchoolingBetweenSixAndTenDropDown;

    // -------Native View Schooling age 10 to 17
    @FindBy(xpath = "//select[@name='x_naci_family_coho_rasopathy_iiq.schooling_10_17']//option[@selected='SELECTED']")
    public WebElement nativeViewRasSurveySchoolingAge10To17Dropdown;

    // -------Native View Current employment status DropDown
    @FindBy(xpath = "//select[@name='x_naci_family_coho_rasopathy_iiq.employment_status']//option[@selected='SELECTED']")
    public WebElement nativeViewRasSurveyCurrenEmpStatusDropdown;

    // -------Native View Participants diagnosed learning differences Textarea
    @FindBy(xpath = "//p[contains(text(),'Short attention span - includes attention deficit ')]")
    public WebElement nativeViewRasSurveyDiagnosedLearningDifferencesTextArea;

    // -------Native View Diagnose Learning Other Please Specify Textbox
    @FindBy(xpath = "//input[@name='x_naci_family_coho_rasopathy_iiq.please_specify_learning_diff']")
    public WebElement nativeViewRasSurveyDiagnoseOtherTextBox;

    // -------Native View Other Employment Status
    @FindBy(xpath = "//input[@name='x_naci_family_coho_rasopathy_iiq.other_employment_status']")
    public WebElement nativeViewRasSurveyOtherEmpStatusTextbox;

    // -------Native View Participants highest level of schooling DropDown
    @FindBy(xpath = "//select[@name='x_naci_family_coho_rasopathy_iiq.highest_level_of_schooling_ras']//option[@selected='SELECTED']")
    public WebElement nativeViewRasSurveyHighestLevelOfSchoolingDropdown;

    /**
     * *************************** END OF DEVELOPMENT SECTION
     * **************************
     */

    /**
     * ************************** BEGINNING OF HEART SECTION
     * **************************
     */

    /* -------- Native view Rasopathy Survey Heart tab ---------- */
    @FindBy(xpath = "//span[normalize-space()='Heart']")
    public WebElement nativeViewRasSurveyHeartTab;

    /*
     * ----- Has the participant been evaluated by a cardiologist? DropDown -------
     */
    @FindBy(xpath = "//select[@name='x_naci_family_coho_rasopathy_iiq.evaluated_by_cardiologist']//option[@selected='SELECTED']")
    public WebElement nativeViewRasSurveyHasTheParticipantBeenEvaluatedByACardiologistDropDown;

    /* ----- Name of cardiologist Text Box ------- */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_rasopathy_iiq.cardiologist_name']")
    public WebElement nativeViewRasSurveyNameOfTheCardiologistTextBox;

    /* ------ Heart Tab Location (City, State, Country) Text Box -------- */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_rasopathy_iiq.cardiologist_location']")
    public WebElement nativeViewRasSurveyHeartTabLocationCityStateCountryTextBox;

    /* ------ Hosptial or Health Center Affiliation Text Box ------- */
    @FindBy(xpath = "//input[contains(@aria-label,'Hosptial or Health Center Affiliation')]")
    public WebElement nativeViewRasSurveyHospitalOrHealthCenterAffiliationTextBox;

    /*
     * ------ Has the participant received treatment for heart problems? Drop Down
     * --------
     */
    @FindBy(xpath = "//select[@name='x_naci_family_coho_rasopathy_iiq.heart_treatment_received']//option[@selected='SELECTED']")
    public WebElement nativeViewRasSurveyHasTheParticicpantRecievedTreatmentForHearProblemsDropDown;

    /*
     * ------- Has the participant been diagnosed with a functional heart issue?
     * Drop Down --------
     */
    @FindBy(xpath = "//select[@name='x_naci_family_coho_rasopathy_iiq.functional_heart_issue']//option[@selected='SELECTED']")
    public WebElement nativeViewRasSurveyHasTheParticipantBeenDiagnosedWithAFuncitonalHeartIssueDropDown;

    /*
     * ------- Has the participant been diagnosed with structural heart issues? Drop
     * Down -------
     */
    @FindBy(xpath = "//select[@name='x_naci_family_coho_rasopathy_iiq.heart_disease']//option[@selected='SELECTED']")
    public WebElement nativeViewRasSurveyHasTheParticipantBeenDIagnosedWithStructuralHeartIssuesDropDown;

    /* ------- Participants diagnosed structural heart issues Text Area -------- */
    @FindBy(xpath = "//p[contains(text(),'Pulmonary valve stenosis or pulmonary valve dyspla')]")
    public WebElement nativeViewRasSurveyParticipantsDiagnosedStructuralHeartIssuesTextArea;

    /* ------- Please Specify Text Box ------- */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_rasopathy_iiq.please_specify_heart_issues']")
    public WebElement nativeViewRasSurveyDiagnosedStructuralHeartIssuesPleaseSpecifiyTextBox;

    /**
     * ************************** END OF HEART SECTION
     * **************************
     */

    /**
     * ************************** BEGINNING OF MEDICAL HISTORY SECTION
     * **************************
     */

    /* ------- Native View Rasopothy Survey Medical History Tab ------- */
    @FindBy(xpath = "//span[normalize-space()='Medical History']")
    public WebElement nativeViewRasSurveyMedicalHistoryTab;

    /*
     * ------- Does the participant have a primary care provider? Drop Down -------
     */
    @FindBy(xpath = "//select[@name='x_naci_family_coho_rasopathy_iiq.primary_care']//option[@selected='SELECTED']")
    public WebElement nativeViewRasSurveyDoesTheParticipantHaveAPrimaryCareProviderDropDown;

    /* ------- Name of primary care provider Text Box ------- */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_rasopathy_iiq.pcp_name']")
    public WebElement nativeViewRasSurveyNameOfPrimaryCareProviderTextBox;

    /* ------- Location of primary care provider Text Box ------- */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_rasopathy_iiq.pcp_location']")
    public WebElement nativeViewRasSurveyLocationOfPrimaryCareProviderTextBox;

    /* ------- Primary Care Provider Affiliation Text Box ------- */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_rasopathy_iiq.pcp_affiliation']")
    public WebElement nativeViewRasSurveyPrimaryCareProviderAffiliationTextBox;

    /* ------- Has the participant ever had a biopsy? Drop Down ------- */
    @FindBy(xpath = "//select[@name='x_naci_family_coho_rasopathy_iiq.participant_biopsy']//option[@selected='SELECTED']")
    public WebElement nativeViewRasSurveyHasTheParticipantEverHadABiopsyDropDown;

    /* ------- Is the participant allergic to any medications Drop Down ------- */
    @FindBy(xpath = "//select[@name='x_naci_family_coho_rasopathy_iiq.medication_allergy']//option[@selected='SELECTED']")
    public WebElement nativeViewRasSurveyIsTheParticipantAllergicToAnyMedicationsDropDown;

    /*
     * ------- Have you ever been diagnosed with a lymphatic system issue Drop Down
     * -------
     */
    @FindBy(xpath = "//select[@name='x_naci_family_coho_rasopathy_iiq.lymphatic_diagnosis']//option[@selected='SELECTED']")
    public WebElement nativeViewRasSurveyHaveYouEverBeenDiagnosedWithALymphaticSystemIssueDropDown;

    /*
     * ------- Has the participant ever been evaluated by a nephrologist? Drop Down
     * -------
     */
    @FindBy(xpath = "//select[@name='x_naci_family_coho_rasopathy_iiq.nephrologist_evaluated']//option[@selected='SELECTED']")
    public WebElement nativeViewRasSurveyHasTheParticipantEverBeenEvaluatedByANephrologistDropDown;

    /* ------- Name of nephrologist Text box ------- */
    @FindBy(xpath = "//input[contains(@aria-label,'Name of nephrologist')]")
    public WebElement nativeViewRasSurveyNameOfNephrologistTextBox;

    /* ------- Nephrologist Location Text box ------- */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_rasopathy_iiq.nephrologist_location']")
    public WebElement nativeViewRasSurveyNephrologistLocationTextBox;

    /* ------- Nephrologist affiliation Text box ------- */
    @FindBy(xpath = "//textarea[@name='x_naci_family_coho_rasopathy_iiq.nephrologist_affiliation']")
    public WebElement nativeViewRasSurveyNephrologistAffilitionTextBox;

    /*
     * ------- Has the participant ever been diagnosed with a kidney problem Drop
     * Down -------
     */
    @FindBy(xpath = "//select[@name='x_naci_family_coho_rasopathy_iiq.diagnosed_kidney_problem']//option[@selected='SELECTED']")
    public WebElement nativeViewRasSurveyHasTheParticipantEverBeenDiagnosedWithAKidneyProblemDropDown;

    /*
     * ------- Hospitalized for any reason other than accidental injury or
     * childbirth Drop Down ------
     */
    @FindBy(xpath = "//select[@name='x_naci_family_coho_rasopathy_iiq.hospitalized_for_other_reason']//option[@selected='SELECTED']")
    public WebElement nativeViewRasSurveyHospitalizedForAnyReasonOtherThanAccidentalInjuryOrChildbirthDropDown;

    /* ------- Is the participant allergic to any foods Drop Down ------- */
    @FindBy(xpath = "//select[@name='x_naci_family_coho_rasopathy_iiq.food_allergy']//option[@selected='SELECTED']")
    public WebElement nativeViewRasSurveyIsTheParticipantAllergicToAnyFoodsDropDown;

    /* ------- Is the participant allergic to other things? Drop Down ------- */
    @FindBy(xpath = "//select[contains(@name,'x_naci_family_coho_rasopathy_iiq.allergic_other_things')]//option[@selected='SELECTED']")
    public WebElement nativeViewRasSurveyIsTheParticipantAllergicToOtherThingsDropDown;

    /* ------- Participant ear issues Text Area ------- */
    @FindBy(xpath = "//div[@aria-label='Medical History form section']//p[@class='form-control-static'][contains(text(),'Excessive earwax, Chronic or recurrent ear infecti')]")
    public WebElement nativeViewRasSurveyParticipantEarIssuesTextArea;

    /**
     * ************************** END OF MEDICAL HISTORY SECTION
     * **************************
     */

    /**
     * ************************** BEGINNING OF BREATHING SECTION
     * **************************
     */
    // Breathing tab locator -- span
    @FindBy(xpath = "//span[normalize-space()='Breathing']")
    public WebElement nativeViewRasSurveyBreathingTab;

    // Has the participant ever been evaluated by a pulmonologist? -- dropdown
    @FindBy(xpath = "//*[@id='x_naci_family_coho_rasopathy_iiq.pulmonologist_evaluation']/option[@selected='SELECTED']")
    public WebElement nativeViewRasSurveyHasTheParticipantBeenEvaledByPulmonologistDropDown;

    // Pulmonologist name -- text box
    @FindBy(xpath = "//*[@id='x_naci_family_coho_rasopathy_iiq.pulmonologsit_name']")
    public WebElement nativeViewRasSurveyPulmonologsitNameTextBox;

    // Pulmonologist location -- text box
    @FindBy(xpath = "//*[@id='x_naci_family_coho_rasopathy_iiq.pulmonologist_location']")
    public WebElement nativeViewRasSurveyPulmonologsitLocationTextBox;

    // Pulmonologist affiliation -- text box
    @FindBy(xpath = "//*[@id='x_naci_family_coho_rasopathy_iiq.pulmonologist_affiliation']")
    public WebElement nativeViewRasSurveyPulmonologsitAffiliationTextBox;

    // Has the participant had wheezing or whistling in the chest? -- dropdown
    @FindBy(xpath = "//*[@id='x_naci_family_coho_rasopathy_iiq.wheezing_whistling_in_chest']/option[@selected='SELECTED']")
    public WebElement nativeViewRasSurveyHasTheParticipantHadWheezingorWhistlinginChestDropDown;

    // Has the participant been in the emergency room for a breathing problem? --
    // dropdown
    @FindBy(xpath = "//*[@id='x_naci_family_coho_rasopathy_iiq.emergency_room_for_breathing']/option[@selected='SELECTED']")
    public WebElement nativeViewRasSurveyHasTheParticipantBeenToTheEmergencyRoomForBreathingProblemsDropDown;

    // Has a doctor diagnosed the participant with reactive airway disease or
    // asthma? -- dropdown
    @FindBy(xpath = "//*[@id='x_naci_family_coho_rasopathy_iiq.diagnosed_with_asthma']/option[@selected='SELECTED']")
    public WebElement nativeViewRasSurveyHasADoctorDiagnosedParticipantWithReactiveAirwayDiseaseOrAsthmaDropDown;

    // Has the participant been admitted to the hospital for a breathing problem? --
    // dropdown
    @FindBy(xpath = "//*[@id='x_naci_family_coho_rasopathy_iiq.admitted_to_the_hospital_for_breathing']/option[@selected='SELECTED']")
    public WebElement nativeViewRasSurveyHasTheParticipantBeenAdmittedToHospitalForBreathingProblemDropDown;

    // All text boxes in breathing tab
    @FindBy(xpath = "//span[contains(@class,'tabs2_section tabs2_section_9 tabs2_section9 tab_section')]//span[contains(@class,'section')]//input[@type='text']")
    public List<WebElement> nativeViewRasSurveyBreathingTabTextBoxs;

    // All dropdown boxes in breathing tab
    @FindBy(xpath = "(//span[contains(@class,'tabs2_section tabs2_section_9 tabs2_section9 tab_section')]//span[contains(@class,'section')]//option[@selected='SELECTED'])")
    public List<WebElement> nativeViewRasSurveyBreathingTabDropDowns;

    /**
     * ************************** END OF BREATHING SECTION
     * **************************
     */

    /**
     * ************************** BEGINNING OF MOUTH/DENTAL SECTION
     * **************************
     */
    // Metal/Dental tab locator -- span
    @FindBy(xpath = "//span[normalize-space()='Mouth/Dental']")
    public WebElement nativeViewRasSurveyMouth_DentalTab;

    // Does the participant receive regular dental care? -- dropdown
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.regular_dental_care']//option[@selected='SELECTED']")
    public WebElement nativeViewRasSurveyDoesTheParticipantRecieveRegularDentalCareDropDown;

    // When did the participant last visit a dentist -- text box
    @FindBy(xpath = "//input[@name='x_naci_family_coho_rasopathy_iiq.last_dentist_visit']")
    public WebElement nativeViewRasSurveyNameTextBox;

    // Name of dentist -- text box
    @FindBy(xpath = "//input[@name='x_naci_family_coho_rasopathy_iiq.dentist_name']")
    public WebElement nativeViewRasSurveyDentistNameTextBox;

    // Dentist location -- text box
    @FindBy(xpath = "//input[@id='x_naci_family_coho_rasopathy_iiq.dentist_location']")
    public WebElement nativeViewRasSurveyDentistLocationTextBox;

    // Dentist affiliation -- text box
    @FindBy(xpath = "//textarea[@id='x_naci_family_coho_rasopathy_iiq.dentist_affiliation']")
    public WebElement nativeViewRasSurveyDentistAffiliationTextBox;

    // Main reason for last dental visit -- dropdown
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.main_reason_for_last_dental_visit']//option[@selected='SELECTED']")
    public WebElement nativeViewRasSurveyMainReasonForLastDentalVisitDropDown;

    // Does the participant's gums bleed easily with tooth brushing now? -- dropdown
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.bleeding_gums']//option[@selected='SELECTED']")
    public WebElement nativeViewRasSurveyDoesTheParticipantGumsBleedEasilyWithToothBrushingDropDown;

    // Does the participants teeth or gums hurt? -- dropdown
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.tooth_pain']//option[@selected='SELECTED']")
    public WebElement nativeViewRasSurveyDoesTheParticipantsTeethOrGumsHurtDropDown;

    // Does the participant have periodontal or gum disease? -- dropdown
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.gum_disease']//option[@selected='SELECTED']")
    public WebElement nativeViewRasSurveyGumDiseaseDropDown;

    // Has the participant had dental sealants placed? -- dropdown
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.dental_sealants_placed']//option[@selected='SELECTED']")
    public WebElement nativeViewRasSurveDentalSealantsyDropDown;

    // Does the participant have cavities now? -- dropdown
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.cavities']//option[@selected='SELECTED']")
    public WebElement nativeViewRasSurveCavitiesyDropDown;

    // Has the participant had any dental filings? -- dropdown
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.dental_filings']//option[@selected='SELECTED']")
    public WebElement nativeViewRasSurveyDentalFilingsDropDown;

    // How would the participant rate their hygiene routine -- dropdown
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.hygiene_rating']//option[@selected='SELECTED']")
    public WebElement nativeViewRasSurveyHygienRatingDropDown;

    // Does the participants mouth usually feel dry? -- dropdown
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.dry_mouth']//option[@selected='SELECTED']")
    public WebElement nativeViewRasSurveyDryMouthDropDown;

    // How would the participant rate their teeth and gums -- dropdown
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.teeth_gums_rating']//option[@selected='SELECTED']")
    public WebElement nativeViewRasSurveyTeethGumsRatingDropDown;

    // Has the participant had any changes in their sense of smell? -- dropdown
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.sense_of_smell']//option[@selected='SELECTED']")
    public WebElement nativeViewRasSurveySenseOfSmellDropDown;

    // Has the participant had any changes in your sense of taste? -- dropdown
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.sense_of_taste']//option[@selected='SELECTED']")
    public WebElement nativeViewRasSurveySenseOfTasteDropDown;

    // Does the participant have jaw or temporomandibular joint paint -- dropdown
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.temporomandibular_joint_paint']//option[@selected='SELECTED']")
    public WebElement nativeViewRasSurveyTemporomandibularJointPaintDropDown;

    // Does the participant have frequent headaches? -- dropdown
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.frequent_headaches']//option[@selected='SELECTED']")
    public WebElement nativeViewRasSurveyFrequentHeadachesDropDown;

    // Has the participant had orthodonic treatment? -- dropdown
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.ortho_treatment']//option[@selected='SELECTED']")
    public WebElement nativeViewRasSurveyOrthoTreatmentDropDown;

    // Has the participant had any facial or dental trauma? -- dropdown
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.facial_dental_trauma']//option[@selected='SELECTED']")
    public WebElement nativeViewRasSurveyFacialDentalTraumaDropDown;

    // Did the participant have palatal expansion? -- dropdown
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.palatal_expansion']//option[@selected='SELECTED']")
    public WebElement nativeViewRasSurveyPalatalExpansionDropDown;

    // Did the participant have dental surgery? -- dropdown
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.dental_surgery']//option[@selected='SELECTED']")
    public WebElement nativeViewRasSurveyDentalSurgeryDropDown;

    // Please specify -- textbox
    @FindBy(xpath = "//input[@id='x_naci_family_coho_rasopathy_iiq.please_specify_dental_surgery']")
    public WebElement nativeViewRasSurveyPleaseSpecifyDentalSurgeryTextBox;

    // Has the participant had elective jaw surgery -- dropdown
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.jaw_surgery']//option[@selected='SELECTED']")
    public WebElement nativeViewRasSurveyJawSurgeryDropDown;

    // History of cancer in the mouth or jaw -- dropdown
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.cancer_of_mouth']//option[@selected='SELECTED']")
    public WebElement nativeViewRasSurveyCancerOfMouthDropDown;

    // Please specify -- textbox
    @FindBy(xpath = "//input[@id='x_naci_family_coho_rasopathy_iiq.please_specify_mouth_cancer']")
    public WebElement nativeViewRasSurveyPleaseSpecifyMouthCancerTextBox;

    // Does the participant have a family member with a syndrome or a jaw
    // abnormality -- dropdown
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.relative_with_jaw_abnormality']//option[@selected='SELECTED']")
    public WebElement nativeViewRasSurveyRelativeWithJawAbnormalityDropDown;

    // Please specify -- textbox
    @FindBy(xpath = "//input[@id='x_naci_family_coho_rasopathy_iiq.please_specify_jaw_abnormality']")
    public WebElement nativeViewRasSurveyPleaseSpecifyJawAbnormalityTextBox;

    // Does the participant have any numbness in or around the mouth -- dropdown
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.mouth_numbness']//option[@selected='SELECTED']")
    public WebElement nativeViewRasSurveyMouthNumbnessDropDown;

    // Does the participant have any mouth sores? -- dropdown
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.mouth_sores']//option[@selected='SELECTED']")
    public WebElement nativeViewRasSurveyMouthSoresDropDown;

    // Do the participant's teeth feel sensitive to hot or cold food? -- dropdown
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.hot_cold_teeth_sensitivity']//option[@selected='SELECTED']")
    public WebElement nativeViewRasSurveyHotColdTeethSensitivityDropDown;

    // Does the participant have problems moving their lips, tongue, or mouth? --
    // dropdown
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.problems_moving_mouth']//option[@selected='SELECTED']")
    public WebElement nativeViewRasProblemsMovingMouthSurveyDropDown;

    // Had trouble pronouncing words because of problems with teeth/mouth --
    // dropdown
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.trouble_pronouncing_words']//option[@selected='SELECTED']")
    public WebElement nativeViewRasTroublePronouncingWordsSurveyDropDown;

    // Is anything unusual about the participant's teeth or mouth -- dropdown
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.unusual_teeth_mouth']//option[@selected='SELECTED']")
    public WebElement nativeViewRasSurveyUnusualTeethMouthDropDown;

    // Please specify -- textbox
    @FindBy(xpath = "//input[@id='x_naci_family_coho_rasopathy_iiq.please_specify_teeth_mouth']")
    public WebElement nativeViewRasSurveyPleaseSpecifyTeethMouthTextBox;

    // Has the participant had painful aching in thier mouth -- dropdown
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.painful_aching_in_mouth']//option[@selected='SELECTED']")
    public WebElement nativeViewRasPainfulAchingInMouthSurveyDropDown;

    // Has the participant been self-concious because of their teeth/mouth --
    // dropdown
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.self_councious_teeth']//option[@selected='SELECTED']")
    public WebElement nativeViewSelfCounciousTeethRasSurvey;

    // Worsened sense of taste because of problems with teeth/mouth -- dropdown
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.worsened_sense_of_taste']//option[@selected='SELECTED']")
    public WebElement nativeViewRasWorsenedSenseOfTasteSurveyDropDown;

    // Uncomfortable eating any foods with their teeth/mouth -- dropdown
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.uncomfortable_eating_foods']//option[@selected='SELECTED']")
    public WebElement nativeViewUncomfortableEatingFoodsRasSurvey;

    // Has the participant felt tense because of problems with teeth/mouth --
    // dropdown
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.tense_teeth_mouth']//option[@selected='SELECTED']")
    public WebElement nativeViewRasTenseTeethMouthSurveyDropDown;

    // Unsatisfactory diet because of problems with teeth/mouth -- dropdown
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.diet_teeth_mouth']//option[@selected='SELECTED']")
    public WebElement nativeViewDietTeethMouthRasSurveyDropDown;

    // Has the participant interrupted meals because of problems with teeth/mouth --
    // dropdown
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.interrupted_meals']//option[@selected='SELECTED']")
    public WebElement nativeViewInterruptedMealsRasSurveyDropDown;

    // Has the participant found it difficult to relax due to problems with
    // teeth/mouth -- dropdown
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.difficult_to_relax']//option[@selected='SELECTED']")
    public WebElement nativeViewRasDifficultToRelaxSurveyDropDown;

    // Has the participant been a bit embarrased because of teeth/mouth -- dropdown
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.embarrased_teeth_mouth']//option[@selected='SELECTED']")
    public WebElement nativeViewRasEmbarrasedTeethMouthSurveyDropDown;

    // Irritable with others people because of problems with teeth/mouth -- dropdown
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.irritable_with_others']//option[@selected='SELECTED']")
    public WebElement nativeViewRasIrritableWithOthersSurveyDropDown;

    // Difficulty doing usual jobs because of problems with teeth/mouth -- dropdown
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.difficulty_doing_usual_jobs']//option[@selected='SELECTED']")
    public WebElement nativeViewRasDifficultyDoingUsualJobsSurveyDropDown;

    // Has the participant felt life was less satisfying due to their teeth/mouth --
    // dropdown
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.life_less_satisfying']//option[@selected='SELECTED']")
    public WebElement nativeViewRasLifeLessSatisfyingSurveyDropDown;

    // Has the participant been totally unable to funciton because of teeth/m --
    // dropdown **** Mention wording
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.unable_to_function']//option[@selected='SELECTED']")
    public WebElement nativeViewRasSurveyUnableToFunctionDropDown;

    /**
     * ************************** END OF MOUTH/DENTAL SECTION
     * **************************
     */

    /**
     * ************************** BEGINNING OF HAIR & SKIN SECTION
     * **************************
     */

    /* ------- Native View Rasopothy Survey Hair & Skin Tab ------- */
    @FindBy(xpath = "//span[normalize-space()='Hair & Skin']")
    public WebElement nativeViewRasSurveyHairAndSkinTab;

    // Has participant been evaluated by a dermatologist? -- dropdown
    @FindBy(xpath = "//select[@name='x_naci_family_coho_rasopathy_iiq.dermatologist']//option[@selected='SELECTED']")
    public WebElement nativeViewRasSurveyHasParticipantBeenEvaluatedByADermatologistDropDown;

    /* ------- Name of dermatologist Text Box ------- */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_rasopathy_iiq.name_of_dermatlogist']")
    public WebElement nativeViewRasSurveyNameOfDermatologistTextBox;

    /* ------- City, State of dermatologist Text Box ------- */
    @FindBy(xpath = "//input[contains(@aria-label,'City, State of dermatologist')]")
    public WebElement nativeViewRasSurveyCityStateOfDermatologistTextBox;

    /*
     * ------- Hospital or Medical Center Affiliation of Dermatologist Text Box
     * -------
     */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_rasopathy_iiq.dermatologist_affiliation']")
    public WebElement nativeViewRasSurveyHospitalOrMedicalCenterAffilitionOfDermatologistTextBox;

    /* ------- Description of participant's hair Text Area ------- */
    @FindBy(xpath = "//p[contains(text(),'Waveless, Wavy, Sparse/having too little hair, Fin')]")
    public WebElement nativeViewRasSurveyDescriptionOfParticipantsHairTextArea;

    /* ------- Other hair description Text Box ------- */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_rasopathy_iiq.other_hair_description']")
    public WebElement nativeViewRasSurveyOtherHairDescriptionTextBox;

    /* ------- Diagnosed skin issues Text Area ------- */
    @FindBy(xpath = "//p[contains(text(),'Keratosis pilaris (patches of small, hard bumps of')]")
    public WebElement nativeViewRasSurveyDiagnosedSkinIssuesTextArea;

    /* ------- Other skin issues Text Box ------- */
    @FindBy(xpath = "//input[contains(@aria-label,'Other skin issues')]")
    public WebElement nativeViewRasSurveyOtherSkinIssuesTextBox;

    /* ------- Pigmented skin findings Text Area ------- */
    @FindBy(xpath = "//p[contains(text(),'Three or more cafe-au-lait spots (light brown birt')]")
    public WebElement nativeViewRasSurveyPigmentedSkinFindingsTextArea;

    /* ------- Other pigmented findings Text Box ------- */
    @FindBy(xpath = "//input[contains(@aria-label,'Other pigmented findings')]")
    public WebElement nativeViewRasSurveyOtherPigmentedFindingsTextBox;

    /* ------- Diagnosed skin tumors Text Area ------- */
    @FindBy(xpath = "//p[contains(text(),'Granular cell tumor (soft tissue tumor, often beni')]")
    public WebElement nativeViewRasSurveyDiagnosedSkinTumorsTextArea;

    /* ------- Other skin tumors Text Box ------- */
    @FindBy(xpath = "//input[contains(@aria-label,'Other skin tumors')]")
    public WebElement nativeViewRasSurveyOtherSkinTumorsTextBox;

    /*
     * ------- Is the texture or amount of hair similar to a biological relatives?
     * Drop Down -------
     */
    @FindBy(xpath = "//select[@name='x_naci_family_coho_rasopathy_iiq.similar_hair']//option[@selected='SELECTED']")
    public WebElement nativeViewRasSurveyIsTheTextureOrAmountOfHairSimilarToABiologicalRelativesDropDown;

    /* ------- Does the participant have any hemangiomas? Drop Down ------- */
    @FindBy(xpath = "//select[contains(@name,'x_naci_family_coho_rasopathy_iiq.hemangiomas')]//option[@selected='SELECTED']")
    public WebElement nativeViewRasSurveyDoesTheParticipantHaveAnyHemangiomasDropDown;

    /**
     * ************************** END OF HAIR & SKIN SECTION
     * **************************
     */
    /**
     * ************************** BEGINNING OF SKELETAL SECTION
     * **************************
     */

    /* ------- Native View Rasopothy Survey Skeletal Tab ------- */
    @FindBy(xpath = "//span[normalize-space()='Skeletal']")
    public WebElement nativeViewRasSurveySkeletalTab;

    /*
     * ------- Has the participant been evaluated by an orthopaedic surgeon? Drop
     * Down -------
     */
    @FindBy(xpath = "//select[@name='x_naci_family_coho_rasopathy_iiq.orthopaedic_surgeon']//option[@selected='SELECTED']")
    public WebElement nativeViewRasSurveyHasTheParticipantBeenEvaluatedByAnOrthopaedicSurgeonDropDown;

    /* ------- Name of orthopaedic surgeon Text Box ------- */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_rasopathy_iiq.ortho_name']")
    public WebElement nativeViewRasSurveyNameOfOrthopaedicSurgeonTextBox;

    /* ------- Location of Orthopaedic surgeon Text Box ------- */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_rasopathy_iiq.ortho_location']")
    public WebElement nativeViewRasSurveyLocationOfOrthopaedicSurgeonTextBox;

    /*
     * ------- Orthopaedic surgeons hospital or medical center affiliation Text Box
     * -------
     */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_rasopathy_iiq.orthopaedic_surgeon_affiliation']")
    public WebElement nativeVIewRasSurveyOrthopaedicSurgeonsHospitalOrMedicalCenterAffiliationTextBox;

    /* ------- Diagnosed skeletal findings Text Area ------ */
    @FindBy(xpath = "//p[contains(@data-original-title,'Diagnosed skeletal findings')]")
    public WebElement nativeViewRasSurveyDiagnosedSkeletalFindingsTextArea;

    /* ------- Other skeletal findings Text Box ------ */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_rasopathy_iiq.other_skeletal_findings']")
    public WebElement nativeViewRasSurveyOtherSkeletalFindingsTextBox;

    /*
     * ------- Does the participant have any issues with curving of the spine Drop
     * Down ------
     */
    @FindBy(xpath = "//select[@name='x_naci_family_coho_rasopathy_iiq.curving_of_the_spine']//option[@selected='SELECTED']")
    public WebElement nativeViewRasSurveyDoesTheParticipantHaveAnyIssuesWithCurvingOfTheSpineDropDown;

    /*
     * ------- Has the participant's neck been described as short or webbed? Drop
     * Down ------
     */
    @FindBy(xpath = "//select[@name='x_naci_family_coho_rasopathy_iiq.short_webbed_neck']//option[@selected='SELECTED']")
    public WebElement nativeViewRasSurveyHasTheParticipantsNeckBeenDescribedAsShortOrWebbedDropDown;

    /*
     * ------- Has the participant ever been diagnosed with joint issues? Drop Down
     * ------
     */
    @FindBy(xpath = "//select[@name='x_naci_family_coho_rasopathy_iiq.joint_issues']//option[@selected='SELECTED']")
    public WebElement nativeViewRasSurveyHasTheParticipantEverBeenDiagnosedWithJointIssuesDropDown;

    /**
     * ************************** END OF SKELETAL SECTION
     * **************************
     */

    /**
     * ************************** BEGINNING OF HEMATOLOGY, ONCOLOGY, IMMUNOLOGY
     * SECTION
     * **************************
     */
    // Hematology, Oncology and Immunology tab locator -- span
    @FindBy(xpath = "//span[normalize-space()='Hematology, Oncology and Immunology']")
    public WebElement nativeViewRasSurveyHematologyOncologyAndImmunologyTab;

    // Has the participant ever had an evaluation by a hematologist or oncologist?
    // -- dropdown
    @FindBy(xpath = "//*[@id='x_naci_family_coho_rasopathy_iiq.hematologist_oncologist']/option[@selected='SELECTED']")
    public WebElement nativeViewRasSurveyHasTheParticipantEverHadAnEvaledByAHematologistOrOncologistDropDown;

    // Name of hematologist/oncologist -- text box
    @FindBy(xpath = "//*[@id='x_naci_family_coho_rasopathy_iiq.hematologist_name']")
    public WebElement nativeViewRasSurveyNameOfHematologist_OncologistTextBox;

    // Location of hematologist/oncologist -- text box
    @FindBy(xpath = "//*[@id='x_naci_family_coho_rasopathy_iiq.hematologist_location']")
    public WebElement nativeViewRasSurveyLocationOfHematologist_OncologistTextBox;

    // Hematologist/Oncologist medical affiliation -- text box
    @FindBy(xpath = "//*[@id='x_naci_family_coho_rasopathy_iiq.hematologist_oncologist_medical_affiliation']")
    public WebElement nativeViewRasSurveyHematologist_OncologistMedicalAffiliationTextBox;

    // Does the participant have any issues with bleeding or bruising? -- dropdown
    @FindBy(xpath = "//*[@id='x_naci_family_coho_rasopathy_iiq.bleeding_bruising']/option[@selected='SELECTED']")
    public WebElement nativeViewRasSurveyDoesTheParticipantHaveIssuesWithBleedingOrBruisingDropDown;

    // Does the participant have a history of frequent infections? -- dropdown
    @FindBy(xpath = "//*[@id='x_naci_family_coho_rasopathy_iiq.infections']/option[@selected='SELECTED']")
    public WebElement nativeViewRasSurveyDoesTheParticipantHaveAHistoryOfFrequentInfectionsDropDown;

    // Has the participant been diagnosed with an autoimmune disorder? -- dropdown
    @FindBy(xpath = "//*[@id='x_naci_family_coho_rasopathy_iiq.diagnosed_autoimmune']/option[@selected='SELECTED']")
    public WebElement nativeViewRasSurveyHasTheParticipantBeenDiagnosedWithAnAutoimmuneDisorderDropDown;

    // Does the participant have any known blood disorders or symptoms such
    // disorders? -- dropdown ****Mention wording issue on question
    @FindBy(xpath = "//*[@id='x_naci_family_coho_rasopathy_iiq.known_blood_disorders']/option[@selected='SELECTED']")
    public WebElement nativeViewRasSurveyDoesTheParticipantHaveAnyKnownBloodDisordersOrSymptomsDropDown;

    // Has the participant been evaluated by an immunologist or rheumatologist? --
    // dropdown
    @FindBy(xpath = "//*[@id='x_naci_family_coho_rasopathy_iiq.immunologist_rheumatologist']/option[@selected='SELECTED']")
    public WebElement nativeViewRasSurveyHasTheParticipantBeenEvaledByAnImmunologistOrRheumatologistDropDown;

    // Name of immunologist/rheumatologist -- text box
    @FindBy(xpath = "//*[@id='x_naci_family_coho_rasopathy_iiq.immunologist_rheumatologist_name']]")
    public WebElement nativeViewRasSurveyNameOfImmunologist_rheumatologistTextBox;

    // Immunologist/rheumatologist location -- text box
    @FindBy(xpath = "//*[@id='x_naci_family_coho_rasopathy_iiq.immunologist_rheumatologist_location']")
    public WebElement nativeViewRasSurveyLocationOfImmunologist_rheumatologistTextBox;

    // Immunologist/rheumatologist affiliation -- text box
    @FindBy(xpath = "//*[@id='x_naci_family_coho_rasopathy_iiq.immunologist_rheumatologist_affiliation']")
    public WebElement nativeViewRasSurveyImmunologist_RheumaologistMedicalAffiliationTextBox;

    // All text boxes in Hemato_Onco_Immuno tab
    @FindBy(xpath = "(//div[contains(@aria-label,'Hematology, Oncology and Immunology form section')]//input[@type='text'])")
    public List<WebElement> nativeViewRasSurveyHemato_Onco_ImmunoTabTextBoxs;

    // All dropdown boxes in Hemato_Onco_Immuno tab
    @FindBy(xpath = "(//div[contains(@aria-label,'Hematology, Oncology and Immunology form section')]//option[@selected='SELECTED'])")
    public List<WebElement> nativeViewRasSurveyHemato_Onco_ImmunoTabDropDowns;

    /**
     * ************************** END OF HEMATOLOGY, ONCOLOGY, IMMUNOLOGY SECTION
     * **************************
     */

    /**
     * ************************** BEGINNING OF BRAIN & NEUROLOGY SECTION
     * **************************
     */
    @FindBy(xpath = "//span[normalize-space()='Brain & Neurology']")
    public WebElement nativeViewRasSurveyBrainAndNeurologyTab;

    // Has the participant ever been evaluated by a neurologist or neurosurgeon? --
    // dropdown
    @FindBy(xpath = "//*[@id='x_naci_family_coho_rasopathy_iiq.evaluated_by_neurologist']/option[@selected='SELECTED']")
    public WebElement nativeViewRasSurveyHasTheParticipantEverBeenEvaledByANeurologistOrNeurosurgeonDropDown;

    // Name of neurologist -- text box
    @FindBy(xpath = "//*[@id='x_naci_family_coho_rasopathy_iiq.name_of_neurologist']")
    public WebElement nativeViewRasSurveyNameOfNeurologistTextBox;

    // Location of neurologist -- text box
    @FindBy(xpath = "//*[@id='x_naci_family_coho_rasopathy_iiq.neurologist_location']")
    public WebElement nativeViewRasSurveyLocationOfNeurologistTextBox;

    // Neurologist affiliation -- text box
    @FindBy(xpath = "//*[@id='x_naci_family_coho_rasopathy_iiq.neurologist_affiliation']")
    public WebElement nativeViewRasSurveyNeurologistAffiliationTextBox;

    // Has the participant ever been diagnosed with a structural brain abnormality?
    // -- dropdown
    @FindBy(xpath = "//*[@id='x_naci_family_coho_rasopathy_iiq.diagnosed_brain_abnormality']/option[2]")
    public WebElement nativeViewRasSurveyHasTheParticipantBeenDiagnosdWithAStructuralBrainAbnormalityDropDown;

    // Evaluated by a psychiatrist, psychologist or behavioral pediatrician? --
    // dropdown
    @FindBy(xpath = "//*[@id='x_naci_family_coho_rasopathy_iiq.evaluated_by_psychiatrist']/option[2]")
    public WebElement nativeViewRasSurveyEvaluatedByAPsychiatristPsychologistOrBehavioralPediatricianDropDown;

    // Does the participant have a history seizures?-- dropdown ****Wording issue
    @FindBy(xpath = "//*[@id='x_naci_family_coho_rasopathy_iiq.seizure_history']/option[2]")
    public WebElement nativeViewRasSurveyDoesTheParticipantHaveAHistorySeizuresDropDown;

    // Has the participant been diagnosed with a behavioral or psychiatric
    // condition? -- dropdown
    @FindBy(xpath = "//*[@id='x_naci_family_coho_rasopathy_iiq.diagnosed_psychiatric_condition']/option[2]")
    public WebElement nativeViewRasSurveyHasTheParticipantBeenDiagnosedWIthABehavioralOrPsychiatricConditionDropDown;

    // Name of physician -- text box
    @FindBy(xpath = "//*[@id='x_naci_family_coho_rasopathy_iiq.name_of_physician']")
    public WebElement nativeViewRasSurveyNameOfPhysicianTextBox;

    // Location of physician -- text box -- text box
    @FindBy(xpath = "//*[@id='x_naci_family_coho_rasopathy_iiq.physician_location_psych']")
    public WebElement nativeViewRasSurveyLocationOfPhysicianTextBox;

    // Psychiatrist affiliation -- text box
    @FindBy(xpath = "//*[@id='x_naci_family_coho_rasopathy_iiq.psychiatrist_affiliation']")
    public WebElement nativeViewRasSurveyPsychiatristAffiliationTextBox;

    // Additional Neurological Conditions -- text box
    @FindBy(xpath = "//input[@name='x_naci_family_coho_rasopathy_iiq.neuro_extra_condtions']")
    public WebElement nativeViewRasSurveyAdditionalNeurologicalConditionsTextBox;

    /**
     * ************************** END OF BRAIN & NEUROLOGY SECTION
     * **************************
     */

    /**
     * ************************** BEGINNING OF VISION/HEARING SECTION
     * **************************
     */
    // Vision/Hearing tab locator -- span
    @FindBy(xpath = "//span[normalize-space()='Vision & Hearing']")
    public WebElement nativeViewRasSurveyVision_HearingTab;

    // Diagnosed with ptosis -- dropdown
    @FindBy(xpath = "//*[@id='x_naci_family_coho_rasopathy_iiq.ptosis_diagnosis']/option[@selected='SELECTED']")
    public WebElement nativeViewRasSurveyDiagnosedWithPtosisDropDown;

    // Did the ptosis require treatment? -- dropdown
    @FindBy(xpath = "//*[@id='x_naci_family_coho_rasopathy_iiq.ptosis_treatment_required']/option[@selected='SELECTED']")
    public WebElement nativeViewRasSurveyDidThePtosisRequireTreatmentDropDown;

    // Participant experienced hearing loss -- dropdown
    @FindBy(xpath = "//*[@id='x_naci_family_coho_rasopathy_iiq.hearing_loss']/option[@selected='SELECTED']")
    public WebElement nativeViewRasSurveyParticipantExperiencedHearingLosssDropDown;

    // Issues with vision or eyesight
    @FindBy(xpath = "//*[@id='x_naci_family_coho_rasopathy_iiq.eye_issues']/option[@selected='SELECTED']")
    public WebElement nativeViewRasSurveyIssuesWithVisionOrEyeSightDropDown;

    // Participant experienced strabismus
    @FindBy(xpath = "//*[@id='x_naci_family_coho_rasopathy_iiq.strabismus']/option[@selected='SELECTED']")
    public WebElement nativeViewRasSurveyParticipantExperiencedStrabismusDropDown;

    // Participant experienced nystagmus
    @FindBy(xpath = "//*[@id='x_naci_family_coho_rasopathy_iiq.nystagmus']/option[@selected='SELECTED']")
    public WebElement nativeViewRasSurveyParticipantExperiencedNystagmusDropDown;

    // Participant ear issues -- p tag
    @FindBy(xpath = "//div[@aria-label='Vision & Hearing form section']//p[@class='form-control-static'][contains(text(),'Excessive earwax, Chronic or recurrent ear infecti')]")
    public WebElement nativeViewRasSurveyParticipantEarIsssuesPTag;

    // Please specify Participant ear issues -- text box
    @FindBy(xpath = "//*[@id='x_naci_family_coho_rasopathy_iiq.please_specify_ear_issues']")
    public WebElement nativeViewRasSurveyPleaseSpecifyEarIssuesTextBox;

    // All dropdown boxes in vision/hearing tab
    @FindBy(xpath = "(//div[@aria-label='Vision & Hearing form section']//option[@selected='SELECTED'])")
    public List<WebElement> nativeViewRasSurveyVision_HearingTabDropDowns;

    /**
     * ************************** END OF VISION/HEARING SECTION
     * **************************
     */

    /**
     * ************************** BEGINNING OF FEEDING/NUTRITION/GASTRO
     * **************************
     */
    // Identifying Feeding, Nutri, Gas Tab
    @FindBy(xpath = "//span[normalize-space()='Feeding, Nutrition & Gastro Symptoms']")
    public WebElement nativeViewRasSurveyFeedingNutriGasTab;

    // Has the patient ever seen a GI specialist DropDown
    @FindBy(xpath = "//select[@name='x_naci_family_coho_rasopathy_iiq.gi_specialist']//option[@selected='SELECTED']")
    public WebElement nativeViewRasSurveyEverSeenGISpecialistDropdown;

    // Has the participant had any symptoms that likely involved the GI system
    // DropDown
    @FindBy(xpath = "//select[@name='x_naci_family_coho_rasopathy_iiq.gi_symptoms']//option[@selected='SELECTED']")
    public WebElement nativeViewRasSurveySymptomsofGISystemDropdown;

    // GI Specialist Name
    @FindBy(xpath = "//input[@name='x_naci_family_coho_rasopathy_iiq.gi_specialist_name']")
    public WebElement nativeViewRasSurveyGiSpecialistNameTextbox;

    // GI Specialist City, State
    @FindBy(xpath = "//input[@name='x_naci_family_coho_rasopathy_iiq.gi_specialist_city_state']")
    public WebElement nativeViewRasSurveySpecialistCityStateTextbox;

    // GI Specialist Hospital / Health Center Affiliation
    @FindBy(xpath = "//input[@name='x_naci_family_coho_rasopathy_iiq.ga_specialist_affiliation']")
    public WebElement nativeViewRasSurveyHospitalAffiliationTextbox;

    // Participant's diagnosed feeding difficulties
    @FindBy(xpath = "//p[contains(text(),'Poor eater - declining food or unable to eat enoug')]")
    public WebElement nativeViewRasSurveyDiagnosedFeedingDifficultiesTextarea;

    // Other Feeding Difficulties
    @FindBy(xpath = "//input[@name='x_naci_family_coho_rasopathy_iiq.other_feeding_difficulties']")
    public WebElement nativeViewRasSurveyOtherFeedingDifficultiesTextBox;

    // Age NJ/NG-tube was placed
    @FindBy(xpath = "//input[@name='x_naci_family_coho_rasopathy_iiq.age_nj_tube_placed']")
    public WebElement nativeViewRasSurveyAgeNJNGTubeTextbox;

    // Age G/G-J tube was placed
    @FindBy(xpath = "//input[@name='x_naci_family_coho_rasopathy_iiq.age_g_g_j_tube_was_placed']")
    public WebElement nativeViewRasSurveyAgeGGJTubeTextbox;

    // Age gastronomy tube(G/G-J) removed
    @FindBy(xpath = "//input[@name='x_naci_family_coho_rasopathy_iiq.age_g_tube_removed']")
    public WebElement nativeViewRasSurveyAgeGastroTubeRemovedTextbox;

    // Toilet trained DropDown
    @FindBy(xpath = "//select[@name='x_naci_family_coho_rasopathy_iiq.toilet_trained']//option[@selected='SELECTED']")
    public WebElement nativeViewRasSurveyToiletTrainedDropdown;

    // Age successfully toilet trained
    @FindBy(xpath = "//input[@name='x_naci_family_coho_rasopathy_iiq.age_successfully_toilet_trained']")
    public WebElement nativeViewRasSurveyAgeSuccesfullyToiletTrainedTextbox;

    // Any episodes of repeated urine accidents after being toilet trained? DropDown
    @FindBy(xpath = "//select[@name='x_naci_family_coho_rasopathy_iiq.repeated_urine_accidents']//option[@selected='SELECTED']")
    public WebElement nativeViewRasSurveyEpisodesRepeatedUrineafterTrainedDropdown;

    // Does the patient consistently use the toilet for all urination? DropDown
    @FindBy(xpath = "//select[@name='x_naci_family_coho_rasopathy_iiq.toilet_urination']//option[@selected='SELECTED']")
    public WebElement nativeViewRasSurveyConsistentlyUseToiletUrinationDropdown;

    // Does the patient consistently use the toilet for all bowel movements?
    // DropDown
    @FindBy(xpath = "//select[@name='x_naci_family_coho_rasopathy_iiq.toilet_bowel_movements']//option[@selected='SELECTED']")
    public WebElement nativeViewRasSurveyToiletForAllBowelMovementDropdown;

    // Any episodes of repeated bowel movement accidents after being toilet trained?
    // DropDown
    @FindBy(xpath = "//select[@name='x_naci_family_coho_rasopathy_iiq.bowel_accidents']//option[@selected='SELECTED']")
    public WebElement nativeViewRasSurveyRepeatedBowelAccidentsAfterTrainedDropdown;

    // Pain with bowel movements DropDown
    @FindBy(xpath = "//select[@name='x_naci_family_coho_rasopathy_iiq.pain_with_bowel_movements']//option[@selected='SELECTED']")
    public WebElement nativeViewRasSurveyPainBowelMovementsDropdown;

    // How many bowel movements do you have per week? DropDown
    @FindBy(xpath = "//select[@name='x_naci_family_coho_rasopathy_iiq.how_many_bowel_movements_do_you_have_per_week']//option[@selected='SELECTED']")
    public WebElement nativeViewRasSurveyBowelMovementsPerWeekDropDown;

    // Bristol Stool Chart Type DropDown
    @FindBy(xpath = "//select[@name='x_naci_family_coho_rasopathy_iiq.bristol_stool_chart_type']//option[@selected='SELECTED']")
    public WebElement nativeViewRasSurveyBristolStoolChartDropdown;

    // Longest time without a bowel movement DropDown
    @FindBy(xpath = "//select[@name='x_naci_family_coho_rasopathy_iiq.longest_time_without_a_bowel_movement']//option[@selected='SELECTED']")
    public WebElement nativeViewRasSurveyLongestTimeWithoutBowelMovementDropdown;

    // Has the participant had a procedure, test or study to evaluate their GI?
    // DropDown
    @FindBy(xpath = "//select[@name='x_naci_family_coho_rasopathy_iiq.gi_procedure']//option[@selected='SELECTED']")
    public WebElement nativeViewRasSurveyProcedureToEvaluateGIDropdown;

    /**
     * Dynamic Xpath
     */
    public WebElement dynamicXpath(String value) {
        return WebDriverUtils.webDriver.findElement(By.xpath(
                "(//div[@tab_caption='GI Symptoms']/span//div//div//table//tbody//tr[@data-type='list2_row']//td[@class='vt']//a)[contains(text(),'"
                        + value + "')]"));
    }

    public WebElement cousinXpath(String value) {
        return WebDriverUtils.webDriver.findElement(By.xpath(
                "(//div[@tab_caption='GI Symptoms']/span//div//div//table//tbody//tr[@data-type='list2_row']//td[@class='vt']//a)[contains(text(),'"
                        + value + "')]//parent::td//following-sibling::td//a"));
    }

    @FindBy(xpath = "//span[normalize-space()='GI Symptoms (21)']")
    public WebElement GItab;
    /**
     * ************************** END OF FEEDING/NUTRITION/GASTRO
     * **************************
     */
    // Tabs in native view data table
    @FindBy(xpath = "//body/div[contains(@class,'overflow_x_hidden-hotfix')]/div[1]//span[@class='tab_header']//span[@role='tab']")
    public List<WebElement> nativeViewRasSurveyTableTabs;

    /*----- NEW LOCATORS BELOW ----- */

    /***
     * USE THIS METHOD TO DYNAMICALLY LOCATE CHARMS DASHBOARD MODULE LINKS
     * @param text
     * @return
     */
    public WebElement dynamicDashboardModuleLinkLocator(String text) {
        return WebDriverUtils.webDriver.findElement(By.xpath("(//*[text()='" + text + "']//parent::div//parent::div//parent::div)[1]/div[1]/following-sibling::div/div/div[3]/div/div/span/a"));
    }


    /* ********** END OF Native view RAS Survey Data Verification ********** */

    /* **************************************************** */


    public CHARMSNativeViewPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}
