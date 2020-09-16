package ServiceNow.COVIDCode.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class NativeViewEnrollmentViewPage extends CommonUtils {

	/** User Group ID drop down */
	@FindBy(xpath = "//*[@id='x_g_nci_geco_covid_geco_covid_19_enrollment.user_group_id']")
	public WebElement userGroupIDDropDown;

	/** Host Hospital Code drop down */
	@FindBy(id = "sys_select.x_g_nci_geco_covid_geco_covid_19_enrollment.host_hospital_code")
	public WebElement hostHospitalCodeDropDown;

	/** Verbal Consent Drop Down */
	@FindBy(id = "x_g_nci_geco_covid_geco_covid_19_enrollment.verbal_consent")
	public WebElement consentDropDown;

	/** Patient Last Name field */
	@FindBy(id = "x_g_nci_geco_covid_geco_covid_19_enrollment.last_name")
	public WebElement patientLastNameField;

	/** Patient First Name */
	@FindBy(id = "x_g_nci_geco_covid_geco_covid_19_enrollment.first_name")
	public WebElement patientFirstName;

	/** Patient Middle Initial */
	@FindBy(id = "x_g_nci_geco_covid_geco_covid_19_enrollment.first_name")
	public WebElement patientMiddleInitial;

	/** Contact email address */
	@FindBy(id = "x_g_nci_geco_covid_geco_covid_19_enrollment.contact_email")
	public WebElement contactEmailAddress;

	/** Contact phone number */
	@FindBy(id = "x_g_nci_geco_covid_geco_covid_19_enrollment.contact_phone_number")
	public WebElement contactPhoneNumber;

	/** Street address 1 */
	@FindBy(id = "x_g_nci_geco_covid_geco_covid_19_enrollment.street_address_1")
	public WebElement streetAddress1;

	/** City */
	@FindBy(id = "x_g_nci_geco_covid_geco_covid_19_enrollment.city")
	public WebElement city;

	/** State */
	@FindBy(id = "x_g_nci_geco_covid_geco_covid_19_enrollment.us_state")
	public WebElement state;

	/** Zip code */
	@FindBy(id = "x_g_nci_geco_covid_geco_covid_19_enrollment.zip_code")
	public WebElement zipCode;

	/** Date form completed field */
	@FindBy(id = "x_g_nci_geco_covid_geco_covid_19_enrollment.form_complete_date")
	public WebElement dateFormCompletedField;

	/** What is your date of birth? field */
	@FindBy(id = "x_g_nci_geco_covid_geco_covid_19_enrollment.date_of_birth")
	public WebElement whatIsYourDateOfBirthField;

	/** What is your biological sex? drop down */
	@FindBy(id = "x_g_nci_geco_covid_geco_covid_19_enrollment.sex")
	public WebElement whatIsYourBioSexDropDown;

	/** What is your current height? */
	@FindBy(id = "x_g_nci_geco_covid_geco_covid_19_enrollment.height_choice")
	public WebElement whatIsYourCurrentHeightDropDown;

	/** Height Feet field */
	@FindBy(id = "x_g_nci_geco_covid_geco_covid_19_enrollment.height_feet")
	public WebElement heightField;

	/** Height inches field */
	@FindBy(id = "x_g_nci_geco_covid_geco_covid_19_enrollment.height_inches")
	public WebElement heightInches;

	/** What is your current weight? drop down */
	@FindBy(id = "x_g_nci_geco_covid_geco_covid_19_enrollment.weight_choice")
	public WebElement currentWeightDropDown;

	/** Weight field */
	@FindBy(id = "x_g_nci_geco_covid_geco_covid_19_enrollment.weight_pounds")
	public WebElement weightField;

	/** How would you describe your race? drop down */
	@FindBy(id = "x_g_nci_geco_covid_geco_covid_19_enrollment.ancestry")
	public WebElement howWouldYouDescribeYourRaceDropDown;

	/** Are you hispanic or latino? drop down */
	@FindBy(id = "x_g_nci_geco_covid_geco_covid_19_enrollment.are_you_hispanic_or_latino")
	public WebElement areYouHispaniceOrLatinoDropDown;

	/** Symptomology tab */
	@FindBy(xpath = "//*[@id='tabs2_section']/span[2]/span[1]/span[2]")
	public WebElement symptomologyTab;

	/** When did you first develop symptoms of COVID-19? field */
	@FindBy(id = "x_g_nci_geco_covid_geco_covid_19_enrollment.date_first_symptoms")
	public WebElement whenFirstDevelopSymptomsField;

	/** When where you officially diagnosed with COVID-19? field */
	@FindBy(id = "x_g_nci_geco_covid_geco_covid_19_enrollment.date_official_diagnosis")
	public WebElement dateOfficiallyDiagnosed;

	/** Exposured and risk factors tab */
	@FindBy(xpath = "//*[@id='tabs2_section']/span[3]/span[1]/span[2]")
	public WebElement exposuredAndRiskFactorsTab;

	/** Please tell me medical medical conditions lock button */
	@FindBy(id = "x_g_nci_geco_covid_geco_covid_19_enrollment.comorbidities_unlock")
	public WebElement tellMeMedicalConditionsLockButton;

	/** Please tell me medical conditions lookup button */
	@FindBy(id = "lookup.x_g_nci_geco_covid_geco_covid_19_enrollment.comorbidities")
	public WebElement tellMeMedicalConditionsLookupButton;

	/** COVID multi select options search bar */
	@FindBy(id = "sys_display.x_g_nci_geco_covid_geco_covid_19_enrollment.comorbidities")
	public WebElement multiSelectOptionsSearchBar;

	/**
	 * Have you/the patient ever regularly vaped an e-cigarette or similar device?
	 * drop down
	 */
	@FindBy(id = "x_g_nci_geco_covid_geco_covid_19_enrollment.vape_habit")
	public WebElement hasPatientVapedDropDown;

	/**
	 * Have you/the patient smoked at least 100 cigarettes in your entire life? drop
	 * down
	 */
	@FindBy(id = "x_g_nci_geco_covid_geco_covid_19_enrollment.smoke_100")
	public WebElement hasPatientSmoked100CigarretesDropDown;

	/**
	 * When you smoke/have smoked, how many cigarettes do/did you usually smoke
	 * daily? drop down
	 */
	@FindBy(id = "x_g_nci_geco_covid_geco_covid_19_enrollment.smoke_habit")
	public WebElement howManyCigarettesPatientSmokesDailyDD;

	/** Non-steroidal anti-inflammatory drugs */
	@FindBy(id = "x_g_nci_geco_covid_geco_covid_19_enrollment.used_anti_inflammatory")
	public WebElement antiInflammatoryDD;

	/** Myocardial infarction or stroke medication (ex. digoxin) */
	@FindBy(id = "x_g_nci_geco_covid_geco_covid_19_enrollment.used_stroke")
	public WebElement strokeMedicationDD;

	/** Paracetamol/acetaminophen (ex. acetaminophen: Tylenol) */
	@FindBy(id = "x_g_nci_geco_covid_geco_covid_19_enrollment.used_paracetamol")
	public WebElement paracetamolAcetaminophenDD;

	/** Blood thinners (ex. warfarin – Coumadin, rivaroxaban – Xarelto) */
	@FindBy(id = "x_g_nci_geco_covid_geco_covid_19_enrollment.used_blood_thinners")
	public WebElement bloodThinnersDD;

	/** Asthma medication (ex. albuterol – Ventolin) */
	@FindBy(id = "x_g_nci_geco_covid_geco_covid_19_enrollment.used_asthma")
	public WebElement asthmaMedicationDD;

	/** ACE-inhibitors for blood pressure (ex. enalapril, lisinopril) */
	@FindBy(id = "x_g_nci_geco_covid_geco_covid_19_enrollment.used_ace_inhibitors")
	public WebElement aceInhibitorsDD;

	/**
	 * Pollen allergy medication (ex diphenhydramine – Benadryl, ioratadine -
	 * Claritin)
	 */
	@FindBy(id = "x_g_nci_geco_covid_geco_covid_19_enrollment.used_allergy")
	public WebElement allergyMedicationUsedDD;

	/**
	 * ARBs(Angiotensin II Receptor Blockers) (candesartan- Atacand,
	 * valsartan-Diovan)
	 */
	@FindBy(id = "x_g_nci_geco_covid_geco_covid_19_enrollment.used_arbs")
	public WebElement usedArbs;

	/** Antibiotics penicillin, azithromycin (ex. Z-pack) */
	@FindBy(id = "x_g_nci_geco_covid_geco_covid_19_enrollment.used_antibiotics")
	public WebElement usedAntibiotics;
	
	/** How many times have you been exposed to known COVID-19 people? */
	@FindBy (id = "x_g_nci_geco_covid_geco_covid_19_enrollment.exposure_frequency")
	public WebElement exposureToCOVID19Frequency;
	
	/** Have you been wearing a face mask? */
	@FindBy (id = "x_g_nci_geco_covid_geco_covid_19_enrollment.exposure_protection")
	public WebElement haveYouBeenWearingFaceMask;
	
	/** Submit button */
	@FindBy (id = "sysverb_insert_bottom")
	public WebElement submitButton;

	public NativeViewEnrollmentViewPage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}

}
