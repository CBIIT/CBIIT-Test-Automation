package ServiceNow.CHARMS.NativeView.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
	@FindBy(xpath = "//body/div[5]/div[1]/div[1]/nav[1]/div[1]/div[3]/div[1]/div[1]/concourse-application-tree[1]/ul[1]/li[17]/ul[1]/li[5]/div[1]/div[1]/a[1]/div[1]/div[1]")
	public WebElement nativeViewDashboardLink;

	/*--------- Native view frame -----------  */
	@FindBy(xpath = "//iframe[@title='RAS Study | ServiceNow']")
	public WebElement nativeViewiFrameCHARMS;

	/*--------- Native view Waiting for Eligibility Review button ---------- */
	@FindBy(xpath = "//a[@rel='eligibility_status%3Dwaiting_for_eligibility']")
	public WebElement nativeViewWaitingForElegibilityReviewButton;

	/*--------- Native view Family Member Details Preview Automated Test button---------- */
	@FindBy(xpath = "//a[@aria-label='Preview record: Automated Test']")
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
	@FindBy(xpath = "//p[@data-original-title=\"Participant Race (Select all that apply)\"]")
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
	@FindBy(xpath = "//a[@rel='enrollment_status%3D6']")
	public WebElement nativeViewAwaitingPISignatureLink;

	/* ------ Native view Family Study Consent link ------ */
	@FindBy(xpath = "//a[normalize-space()='Family Cohort Study Consent.pdf']")
	public WebElement nativeViewFamilyStudyConsentLink;

	/* ----- Native view Family Sign Consent button ------- */
	@FindBy(xpath = "//span[@class='navbar_ui_actions']//button[@value='cc01bb4cdbd7c810b86770c08c9619dc'][normalize-space()='Sign Consent']")
	public WebElement nativeViewSignConsentButton;

	/* ********** END OF Native View Elements for ALL pages ********** */

	/* **************************************************** */

	public CHARMSNativeViewPage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}
}
