package CHARMS.pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class FanconiEligibilityQuestionnairePage extends CommonUtils {

	public FanconiEligibilityQuestionnairePage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}

	public WebElement dynamicCancerDropDownLocator(String text, int i) {
		return WebDriverUtils.webDriver.findElement(By.xpath("(//select[@name='" + text + i + "'])[1]"));
	}

	public WebElement dynamicCancerTextBoxLocator(String text, int i) {
		return WebDriverUtils.webDriver.findElement(By.xpath("(//input[@name='" + text + i + "~1~TEXT'])[1]"));
	}

	public WebElement dynamicCancerDateOrAgeLocator(String text, int i) {
		return WebDriverUtils.webDriver.findElement(By.xpath("(//select[@name='" + text + i + "'])[1]"));
	}

	/*************************************************************/
	/* GENERAL LOCATORS ON Fanconi ELigibility Questionnaire PAGE */
	/**************************************************************/

	/* Next Button */
	@FindBy(xpath = "//input[@class='NextButton Button']")
	public WebElement nextButton;

	/* Question1 Label:Please indicate your relationship to the participant. */
	@FindBy(xpath = "(//span[normalize-space()='Please indicate your relationship to the participant.'])[1]")
	public WebElement relationshipToParticipantLabel;

	/* Question1 Option1: Yes, I am completing this form for someone else */
	@FindBy(xpath = "(//span[contains(text(),'Yes, I am completing this form for someone else')])[1]")
	public WebElement participantOption;

	/* Question1 Option2: No, I am completing this form for myself */
	@FindBy(xpath = "//span[contains(text(),'No, I am completing this form for myself')]")
	public WebElement proxyOption;

	/*
	 * Participant: Are you completing this questionnaire for someone else Radio
	 * Button List
	 */
	@FindBy(xpath = "(//span[contains(@class,'LabelWrapper')])")
	public List<WebElement> participantCompletingRBtonList;

	/* The next set of questions will collect basic information about you. */
	@FindBy(xpath = "//div[@class='QuestionText BorderColor']")
	public WebElement banner1;

	/* Participant: First Name textBox */
	@FindBy(xpath = "(//input[@name='QR~QID2~4~TEXT'])[1]")
	public WebElement firstNameTextBox;

	/* Participant: Middle Initial textBox */
	@FindBy(xpath = "(//input[@name='QR~QID2~5~TEXT'])[1]")
	public WebElement middleNameTextBox;

	/* Participant: Last Name textBox */
	@FindBy(xpath = "(//input[@name='QR~QID2~6~TEXT'])[1]")
	public WebElement lastNameTextBox;

	/* Participant: First Name By Proxy textBox */
	@FindBy(xpath = "(//input[@id='QR~QID105~4'])[1]")
	public WebElement firstNameByProxyTextBox;

	/* Participant: Middle Initial By Proxy textBox */
	@FindBy(xpath = "(//input[@id='QR~QID105~5'])[1]")
	public WebElement middleNameByProxyTextBox;

	/* Participant: Last Name By Proxy textBox */
	@FindBy(xpath = "(//input[@id='QR~QID105~6'])[1]")
	public WebElement lastNameByProxyTextBox;

	/* Participant: Proxy First Name textBox */
	@FindBy(xpath = "(//input[@id='QR~QID3~4'])[1]")
	public WebElement proxyFirstNameTextBox;

	/* Participant:Proxy Middle Initial textBox */
	@FindBy(xpath = "(//input[@id='QR~QID3~5'])[1]")
	public WebElement proxyMiddleNameTextBox;

	/* Participant: Proxy Last Name textBox */
	@FindBy(xpath = "(//input[@id='QR~QID3~6'])[1]")
	public WebElement proxyLastNameTextBox;

	/* Participant:What is your relationship to participant? textBox */
	@FindBy(xpath = "(//input[@title='Other'])[1]")
	public WebElement yourRelationshipToParticipantOtherTextBox;

	/* Participant: Bone Marrow Syndrome Study Radio Button List */
	@FindBy(xpath = "(//span[contains(@class,'LabelWrapper')])")
	public List<WebElement> participateBoneMarrowSyndromeStudyRBtonList;

	/* Calendar month drop down */
	@FindBy(xpath = "//select[@aria-label='Month']")
	public WebElement calendarMonthDropDown;

	/* Calendar year text box */
	@FindBy(xpath = "//input[@aria-label='Year']")
	public WebElement calendarYearTextBox;

	/* Calendar day option */
	@FindBy(xpath = "//span[contains(@aria-label,'21')]")
	public WebElement calendarDayOption;

	/* Calendar day option */
	@FindBy(xpath = "(//div[@class='dayContainer'])[1]")
	public List<WebElement> calendarDay;

	/* Participant: Sex Assigned Radio Button List */
	@FindBy(xpath = "(//span[contains(@class,'LabelWrapper')])")
	public List<WebElement> sexAssignedRBtonList;

	/* Participant: Current Gender Radio Button List */
	@FindBy(xpath = "(//span[contains(@class,'LabelWrapper')])")
	public List<WebElement> currentGenderRBtonList;

	/* Participant: Adopted Radio Button List */
	@FindBy(xpath = "(//span[contains(@class,'LabelWrapper')])")
	public List<WebElement> adoptedRBtonList;

	/* Participant: Country currently lived Drop-down list option */
	@FindBy(xpath = "(//select[@name='QR~QID157'])[1]")
	public WebElement countrylivedDropDownList;

	/* Participant: Mailing Address Street TextBox */
	@FindBy(xpath = "(//input[@name='QR~QID110~4~TEXT'])[1]")
	public WebElement streetTextBox;

	/* Participant: Mailing Address Street Optional TextBox */
	@FindBy(xpath = "(//input[@name='QR~QID110~5~TEXT'])[1]")
	public WebElement additionalStreetTextBox;

	/* Participant: Mailing Address City TextBox */
	@FindBy(xpath = "(//input[@name='QR~QID110~6~TEXT'])[1]")
	public WebElement cityTextBox;

	/* Participant: Mailing Address State TextBox */
	@FindBy(xpath = "(//input[@name='QR~QID110~7~TEXT'])[1]")
	public WebElement stateTextBox;

	/* Participant: Mailing Address Zip Code TextBox */
	@FindBy(xpath = "(//input[@name='QR~QID110~9~TEXT'])[1]")
	public WebElement zipCodeTextBox;

	/* Participant: Country currently lived Drop-down list option */
	@FindBy(xpath = "(//select[@id='QR~QID156'])[1]")
	public WebElement countrylivedProxyDropDownList;

	/* Participant: Mailing Address Street TextBox */
	@FindBy(xpath = "(//input[@id='QR~QID14~4'])[1]")
	public WebElement streetProxyTextBox;

	/* Participant: Mailing Address Street Optional TextBox */
	@FindBy(xpath = "(//input[@id='QR~QID14~5'])[1]")
	public WebElement additionalStreetProxyTextBox;

	/* Participant: Mailing Address City TextBox */
	@FindBy(xpath = "(//input[@id='QR~QID14~6'])[1]")
	public WebElement cityProxyTextBox;

	/* Participant: Mailing Address State TextBox */
	@FindBy(xpath = "(//input[@id='QR~QID14~7'])[1]")
	public WebElement stateProxyTextBox;

	/* Participant: Mailing Address Zip Code TextBox */
	@FindBy(xpath = "(//input[@id='QR~QID14~8'])[1]")
	public WebElement zipCodeProxyTextBox;

	/* Participant: Email Address TextBox */
	@FindBy(xpath = "//input[@name='QR~QID15~TEXT']")
	public WebElement emailAddressTextBox;

	/* Participant: Confirm Email Address TextBox */
	@FindBy(xpath = "//input[@name='QR~QID16~TEXT']")
	public WebElement confirmEmailAddressTextBox;

	/* Participant: Home Phone Number TextBox */
	@FindBy(xpath = "(//input[contains(@type,'text')])[1]")
	public WebElement homePhoneNumberTextBox;

	/* Participant: Preferred Home Phone Number TextBox */
	@FindBy(xpath = "//tbody/tr[1]/td[1]/label[1]")
	public WebElement preferredHomePhoneNumberTextBox;

	/* Participant: Cell Phone Number TextBox */
	@FindBy(xpath = "(//input[contains(@type,'text')])[2]")
	public WebElement cellPhoneNumberTextBox;

	/* Participant: Preferred Cell Phone Number TextBox */
	@FindBy(xpath = "//tbody/tr[2]/td[1]/label[1]")
	public WebElement preferredCellPhoneNumberTextBox;

	/* Participant: Work Phone Number TextBox */
	@FindBy(xpath = "(//input[contains(@type,'text')])[3]")
	public WebElement workPhoneNumberTextBox;

	/* Participant: Preferred Work Phone Number TextBox */
	@FindBy(xpath = "//tbody/tr[3]/td[1]/label[1]")
	public WebElement preferredWorkPhoneNumberTextBox;

	/* Participant: Ethnicity options */
	@FindBy(xpath = "(//span[contains(@class,'LabelWrapper')])")
	public List<WebElement> ethnicityRBtonList;

	/* Participant: Race options */
	@FindBy(xpath = "(//span[contains(@class,'LabelWrapper')])")
	public List<WebElement> raceRBtonList;

	/* Participant: participation in other Race Name TextBox */
	@FindBy(xpath = "(//span[contains(@class,'LabelWrapper')])[6]/input")
	public WebElement otherRaceNameTextBox;

	/* Participant: Common options */
	@FindBy(xpath = "(//span[contains(@class,'LabelWrapper')])")
	public List<WebElement> commonRBtonList;

	/*
	 * Participant:Please specify the study(ies) or registry group(s) regarding
	 * participation in other studies.
	 */
	@FindBy(xpath = "(//input[@name='QR~QID25~2~TEXT'])[1]")
	public WebElement fanconiAnemiaResearchStudyAt1TextBox;

	/*
	 * Participant:Please specify the study(ies) or registry group(s) regarding
	 * participation in other studies.
	 */
	@FindBy(xpath = "(//input[@name='QR~QID25~7~TEXT'])[1]")
	public WebElement fanconiAnemiaResearcStudyAt2TextBox;

	/*
	 * Participant:Please specify the study(ies) or registry group(s) regarding
	 * participation in other studies.
	 */
	@FindBy(xpath = "(//input[@name='QR~QID25~3~TEXT'])[1]")
	public WebElement fanconiAnemiaResearcStudyOther1TextBox;

	/*
	 * Participant:Please specify the study(ies) or registry group(s) regarding
	 * participation in other studies.
	 */
	@FindBy(xpath = "(//input[@name='QR~QID25~4~TEXT'])[1]")
	public WebElement fanconiAnemiaResearcStudyOther2TextBox;

	/*
	 * Participant:Please specify the study(ies) or registry group(s) regarding
	 * participation in other studies.
	 */
	@FindBy(xpath = "(//input[@name='QR~QID25~5~TEXT'])[1]")
	public WebElement fanconiAnemiaResearcStudyOther3TextBox;

	/* Participant: participation in other study Name Options */
	@FindBy(xpath = "//input[contains(@id, 'QR~QID97#1')]")
	public List<WebElement> otherStudyNameList;

	/* Participant: participation in other study Contact person Name Options */
	@FindBy(xpath = "//input[contains(@id, 'QR~QID97#2')]")
	public List<WebElement> otherStudyContactPersonList;

	/* Participant: participation in other study Contact Phone Number Options */
	@FindBy(xpath = "//input[contains(@id, 'QR~QID97#3')]")
	public List<WebElement> otherStudyPhoneNumberList;

	/* Participant: participation in other study Institution Options */
	@FindBy(xpath = "//input[contains(@id, 'QR~QID97#5')]")
	public List<WebElement> otherStudyInstitutionList;

	/* Participant: Currently participating in other study Drop-down List */
	@FindBy(xpath = "//select[contains(@id, 'QR~QID97#6')]")
	public List<WebElement> otherStudyCurrentlyParticipatingDropDownList;

	/*
	 * Participant: No longer participation in other study Institution Start year
	 * TextBox
	 */
	@FindBy(xpath = "//input[contains(@id, 'QR~QID97#4')]")
	public List<WebElement> otherStudyNoLongerStartYearList;

	/* Participant: participation in other study Name TextBox */
	@FindBy(xpath = "(//input[@name='QR~QID97#1~x1~1~TEXT'])[1]")
	public WebElement otherStudyNameTextBox;

	/* Participant: participation in other study Contact person Name TextBox */
	@FindBy(xpath = "(//input[@name='QR~QID97#2~x1~1~TEXT'])[1]")
	public WebElement otherStudyContactPersonNameTextBox;

	/* Participant: participation in other study Contact Phone Number TextBox */
	@FindBy(xpath = "(//input[@name='QR~QID97#3~x1~1~TEXT'])[1]")
	public WebElement otherStudyPhoneNumberTextBox;

	/* Participant: participation in other study Institution TextBox */
	@FindBy(xpath = "(//input[@name='QR~QID97#5~x1~1~TEXT'])[1]")
	public WebElement otherStudyInstitutionTextBox;

	/*
	 * Participant: No longer participation in other study Institution Start year
	 * TextBox
	 */
	@FindBy(xpath = "(//input[@name='QR~QID97#4~x1~1~TEXT'])[1]")
	public WebElement otherStudyNoLongerStartYearTextBox;

	/*
	 * Participant: No longer participation in other study Institution End year
	 * TextBox
	 */
	@FindBy(xpath = "(//input[@name='QR~QID97#4~x1~2~TEXT'])[1]")
	public WebElement otherStudyNoLongerEndYearTextBox;

	/************************************ */
	/*
	 * Participant: the age when Participant diagnosed with Fanconi anemia TextBox
	 */
	@FindBy(xpath = "(//input[@title='Age in years (if under age 1 year, please enter 0)'])[1]")
	public WebElement ageParticipantDiagnosedWithFanconiTextBox;

	/* Participant: send the information by FAX Radio Button */
	@FindBy(xpath = "(//li[contains(@class,'Selection reg')])[1]")
	public WebElement faxRadioButton;

	/* Participant: Where was the chromosome breakage test performed? TextBox */
	@FindBy(xpath = "(//input[contains(@title,'Other (please specify)')])[1]")
	public WebElement chromosomBreakageTestPerformedTextBox;

	/* Participant: Please check FA genes tested.(Mark all that apply).TextBox */
	@FindBy(xpath = "//input[@title='Other genes/syndromes']")
	public WebElement checkFAGenesTestedTextBox;

	/*
	 * Participant: the date when Participant diagnosed with Fanconi anemia TextBox
	 */
	@FindBy(xpath = "(//input[@title='Date (MM/DD/YYYY)'])[1]")
	public WebElement dateParticipantDiagnosedWithFanconiTextBox;

	/* Participant: Gene Name Drop Down List */
	@FindBy(xpath = "(//select[@name='QR~QID166#3~1'])[1]")
	public WebElement geneNameDropDownList;

	/* Participant: Gene Name Drop Down List 1 */
	@FindBy(xpath = "(//select[@name='QR~QID166#3~1'])//option[@value=1]")
	public WebElement geneNameDropDownList1;

	/* Participant: Mutation/Variant #1 TextBox */
	@FindBy(xpath = "(//input[@name='QR~QID166#1~1~1~TEXT'])[1]")
	public WebElement mutationVariant1TextBox;

	/* Participant: Inherited From 1 Drop Down List */
	@FindBy(xpath = "(//select[@name='QR~QID166#2~1'])[1]")
	public WebElement inheritedFrom1DropDownList;

	/* Participant: Inherited From 1 Drop Down List 1 */
	@FindBy(xpath = "(//select[@name='QR~QID166#2~1'])[1]")
	public WebElement inheritedFrom1DropDownList1;

	/* Participant: Mutation/Variant #2 TextBox */
	@FindBy(xpath = "(//input[@name='QR~QID166#4~1~1~TEXT'])[1]")
	public WebElement mutationVariant2TextBox;

	/* Participant: Inherited From 2 Drop Down List */
	@FindBy(xpath = "(//select[@name='QR~QID166#5~1'])[1]")
	public WebElement inheritedFrom2DropDownList;

	/* Participant: Inherited From 2 Drop Down List 1 */
	@FindBy(xpath = "(//select[@name='QR~QID166#5~1'])[1]")
	public WebElement inheritedFrom2DropDownList1;

	/*
	 * Participant: Have you been told that you have any of the following features
	 */
	@FindBy(xpath = "//td[@class='c4   ']")
	public List<WebElement> yesForFeaturesOptions;

	/*
	 * Participant: Heart Problems such as: congenital heart disease, other
	 */
	@FindBy(xpath = "(//input[@id='QR~QID168~13~TEXT'])[1]")
	public WebElement heartProblemsOtherText;

	/*
	 * Participant: Heart Problems such as: congenital heart disease, other
	 */
	@FindBy(xpath = "(//input[@id='QR~QID177~13~TEXT'])[1]")
	public WebElement heartProblemsOtherProxyText;

	/*
	 * Participant: Have you been told that you have any of the following features
	 */
	@FindBy(xpath = "//td[@class='c5   ']")
	public List<WebElement> noForFeaturesOptions;

	/*
	 * Participant: Have you been told that you have any of the following features
	 */
	@FindBy(xpath = "//td[@class='c6 last  ']")
	public List<WebElement> unsureForFeaturesOptions;

	/*
	 * Participant diagnosed with bone marrow: Do you want report date or age of
	 * diagnosis?
	 */
	@FindBy(xpath = "(//select[@name='QR~QID197#6~1'])[1]")
	public WebElement reportDateOrAgeOfDiagnosisDropDownList1;

	/*
	 * Participant diagnosed with bone marrow: Do you want report date or age of
	 * diagnosis?
	 */
	@FindBy(xpath = "(//tr[@class='Choice ']/child::td/select)[1]")
	public WebElement reportDateOrAgeOfDiagnosisDropDownList;

	/* Participant diagnosed with bone marrow: Month of diagnosis */
	@FindBy(xpath = "(//select[@name='QR~QID197#1~1'])[1]")
	public WebElement monthOfDiagnosisDropDownList1;

	/* Participant diagnosed with bone marrow: Month of diagnosis */
	@FindBy(xpath = "(//tr[@class='Choice ']/child::td/select)[2]")
	public WebElement monthOfDiagnosisDropDownList;

	/* Participant diagnosed with bone marrow: Year of diagnosis */
	@FindBy(xpath = "(//select[@name='QR~QID197#4~1'])[1]")
	public WebElement yearOfDiagnosisDropDownList1;

	/* Participant diagnosed with bone marrow: Year of diagnosis */
	@FindBy(xpath = "(//tr[@class='Choice ']/child::td/select)[3]")
	public WebElement yearOfDiagnosisDropDownList;

	/*
	 * Participant diagnosed with bone marrow: Age at diagnosis(If diagnosed under 1
	 * year, please select 0)
	 */
	@FindBy(xpath = "(//select[@name='QR~QID197#5~1'])[1]")
	public WebElement ageAtDiagnosisDropDownList1;

	/*
	 * Participant diagnosed with bone marrow: Age at diagnosis(If diagnosed under 1
	 * year, please select 0)
	 */
	@FindBy(xpath = "(//tr[@class='Choice ']/child::td/select)[4]")
	public WebElement ageAtDiagnosisDropDownList;

	/* Participant diagnosed with bone marrow: Was treatment received? */
	@FindBy(xpath = "(//select[@name='QR~QID197#7~1'])[1]")
	public WebElement wasTreatmentReceivedDropDownList1;

	/* Participant diagnosed with bone marrow: Was treatment received? */
	@FindBy(xpath = "(//tr[@class='Choice ']/child::td/select)[5]")
	public WebElement wasTreatmentReceivedDropDownList;

	/*
	 * Participant diagnosed with bone marrow: Treatment--If treatment received,
	 * please specify treatment (for example androgren, eltrombopag, other)
	 */
	@FindBy(xpath = "(//input[@name='QR~QID197#2~1~1~TEXT'])[1]")
	public WebElement treatmentReceivedTextBox1;

	/*
	 * Participant diagnosed with bone marrow: Treatment--If treatment received,
	 * please specify treatment (for example androgren, eltrombopag, other)
	 */
	@FindBy(xpath = "//tbody//tr[@class='Choice ']/child::td//input")
	public WebElement treatmentReceivedTextBox;

	/*
	 * Participant diagnosed with bone marrow: Treatment--If treatment received,
	 * please specify treatment (for example androgren, eltrombopag, other)
	 */
	@FindBy(xpath = "//tbody//tr[@class='Choice ']/child::td//textarea")
	public WebElement treatmentReceivedProxyTextBox;

	/*
	 * Participant diagnosed with bone marrow: Did you receive or are you receiving
	 * blood transfusions?
	 */
	@FindBy(xpath = "(//select[@name='QR~QID197#3~1'])[1]")
	public WebElement didYouReceiveBloodTransfusionDropDownList1;

	/*
	 * Participant diagnosed with bone marrow: Did you receive or are you receiving
	 * blood transfusions?
	 */
	@FindBy(xpath = "(//tr[@class='Choice ']/child::td/select)[6]")
	public WebElement didYouReceiveBloodTransfusionDropDownList;

	/*
	 * Participant: the age when Participant diagnosed with myelodysplastic syndrome
	 * (MDS) TextBox
	 */
	@FindBy(xpath = "(//input[@title='Age'])[1]")
	public WebElement ageParticipantDiagnosedWithMDSTextBox;

	/*
	 * Participant: the age when Participant diagnosed with myelodysplastic syndrome
	 * (MDS) TextBox
	 */
	@FindBy(xpath = "(//input[@title='Date (MM/DD/YYYY)'])[1]")
	public WebElement dateParticipantDiagnosedWithMDSTextBox;

	/*
	 * Participant:received a bone marrow, stem cell, or cord blood transplant
	 * TextBox
	 */
	@FindBy(xpath = "(//input[@title='Yes (specify treatment institution)'])[1]")
	public WebElement treatmentInstitutionTextBox;

	/*
	 * Participant:received a bone marrow, stem cell, or cord blood transplant
	 * TextBox
	 */
	@FindBy(xpath = "(//textarea[@title='Yes (specify treatment center including city, state, and phone number if known)'])[1]")
	public WebElement treatmentInstitutionProxyTextBox;

	/*
	 * Participant:Information about Bone Marrow :Do you want to report date or age
	 * of your transplant?
	 */
	@FindBy(xpath = "(//select[@name='QR~QID209#6~1'])[1]")
	public WebElement wantToReportDateOrAgeDropDownList1;

	/* Participant Information about Bone Marrow :Month of transplant */
	@FindBy(xpath = "(//select[@name='QR~QID209#1~1'])[1]")
	public WebElement monthOfTransplantDropDownList1;

	/* Participant Information about Bone Marrow :Year of transplant */
	@FindBy(xpath = "(//select[@name='QR~QID209#4~1'])[1]")
	public WebElement yearOfTransplantDropDownList1;

	/*
	 * Participant Information about Bone Marrow :Age at transplant (If diagnosed
	 * under 1 year, please select 0)
	 */
	@FindBy(xpath = "(//select[@name='QR~QID209#5~1'])[1]")
	public WebElement ageAtTransplantDropDownList1;

	/* Participant Information about Bone Marrow :Donor type */
	@FindBy(xpath = "(//select[@name='QR~QID209#7~1'])[1]")
	public WebElement donorTypeDropDownList1;

	/* Participant Information about Bone Marrow :Transplant donor match */
	@FindBy(xpath = "(//select[@name='QR~QID209#2~1'])[1]")
	public WebElement transpalntDonarTypeDropDownList1;

	/* Participant Information about Bone Marrow :Stem cell source */
	@FindBy(xpath = "(//select[@name='QR~QID209#3~1'])[1]")
	public WebElement stemCellSourceDropDownList1;

	/************************/
	/*
	 * Participant:Information about Bone Marrow :Do you want to report date or age
	 * of your transplant?
	 */
	@FindBy(xpath = "(//tr[@class='Choice ']/child::td/select)[1]")
	public WebElement wantToReportDateOrAgeDropDownList;

	/* Participant Information about Bone Marrow :Month of transplant */
	@FindBy(xpath = "(//tr[@class='Choice ']/child::td/select)[2]")
	public WebElement monthOfTransplantDropDownList;

	/* Participant Information about Bone Marrow :Year of transplant */
	@FindBy(xpath = "(//tr[@class='Choice ']/child::td/select)[3]")
	public WebElement yearOfTransplantDropDownList;

	/*
	 * Participant Information about Bone Marrow :Age at transplant (If diagnosed
	 * under 1 year, please select 0)
	 */
	@FindBy(xpath = "(//tr[@class='Choice ']/child::td/select)[4]")
	public WebElement ageAtTransplantDropDownList;

	/* Participant Information about Bone Marrow :Donor type */
	@FindBy(xpath = "(//tr[@class='Choice ']/child::td/select)[5]")
	public WebElement donorTypeDropDownList;

	/* Participant Information about Bone Marrow :Transplant donor match */
	@FindBy(xpath = "(//tr[@class='Choice ']/child::td/select)[6]")
	public WebElement transpalntDonarTypeDropDownList;

	/* Participant Information about Bone Marrow :Stem cell source */
	@FindBy(xpath = "(//tr[@class='Choice ']/child::td/select)[7]")
	public WebElement stemCellSourceDropDownList;

	/* Participant: received current medication Option */
	@FindBy(xpath = "(//span[contains(text(),'Name of Medication(s)')])[1]")
	public List<WebElement> currentMedicationOption;

	/* Participant: received current medication TextBox */
	@FindBy(xpath = "(//textarea[@title='Name of Medication(s)'])[1]")
	public WebElement currentMedicationTextBox;

	/* Participant: received current medication Not Applicable Option */
	@FindBy(xpath = "(//span[contains(text(),'Not Applicable')])[1]")
	public WebElement currentMedicationNotApplicableOption;

	/* Participant Primary Cancer: Tumor Type */
	@FindBy(xpath = "(//select[@name='QR~QID212#1~1'])[1]")
	public WebElement tumorTypeDropDownList1;

	/* Participant Primary Cancer: Tumor Type */
	@FindBy(xpath = "(//select[@name='QR~QID212#1~2'])[1]")
	public WebElement tumorTypeDropDownList2;

	/* Participant Primary Cancer: Tumor Type */
	@FindBy(xpath = "(//select[@name='QR~QID212#1~3'])[1]")
	public WebElement tumorTypeDropDownList3;

	/* Participant Primary Cancer: Tumor Type */
	@FindBy(xpath = "(//select[@name='QR~QID212#1~4'])[1]")
	public WebElement tumorTypeDropDownList4;

	/* Participant Primary Cancer: Additional Details */
	@FindBy(xpath = "(//input[@name='QR~QID212#2~1~1~TEXT'])[1]")
	public WebElement tumorAdditionalDetailsTextBox;

	/*
	 * Participant Primary Cancer: Do you want to report date or age of diagnosis?
	 */
	@FindBy(xpath = "(//select[@name='QR~QID212#10~1'])[1]")
	public WebElement tumorDateOrAgeOfDiagnosisDropDownList;

	/* Participant Primary Cancer: Month of diagnosis */
	@FindBy(xpath = "(//select[@name='QR~QID212#3~1'])[1]")
	public WebElement tumorMonthOfDiagnosisDropDownList;

	/* Participant Primary Cancer: Year of diagnosis */
	@FindBy(xpath = "(//select[@name='QR~QID212#4~1'])[1]")
	public WebElement tumorYearOfDiagnosisDropDownList;

	/* Participant Primary Cancer: Age at diagnosis in years */
	@FindBy(xpath = "(//select[contains(@name,'QR~QID212#11~1')])[1]")
	public WebElement tumorAgeOfDiagnosisDropDownList;

	/* Participant Primary Cancer: Are you currently receiving treatment? */
	@FindBy(xpath = "(//select[@name='QR~QID212#5~1'])[1]")
	public WebElement areYouCurrentlyReceivingTreatmentDropDownList;

	/* Participant Primary Cancer: Treatment Institution */
	@FindBy(xpath = "(//input[@name='QR~QID212#6~1~1~TEXT'])[1]")
	public WebElement tumorTreatmentInstitutionTextBox;

	/* Participant Primary Cancer: Treating Physician */
	@FindBy(xpath = "(//input[@name='QR~QID212#7~1~1~TEXT'])[1]")
	public WebElement tumorTreatingPhysicianTextBox;

	/*
	 * Participant Primary Cancer: Name of institution or clinic where biopsy
	 * occurred
	 */
	@FindBy(xpath = "(//input[@name='QR~QID212#8~1~1~TEXT'])[1]")
	public WebElement tumorInstitutionClinicTextBox;

	/* Participant Primary Cancer: Name of physician who performed the biopsy */
	@FindBy(xpath = "(//input[@name='QR~QID212#9~1~1~TEXT'])[1]")
	public WebElement tumorPhysicianNameTextBox;

	/* Participant: Physician Name TextBox */
	@FindBy(xpath = "(//input[@title='<span style=\"font-family:Arial,Helvetica,sans-serif;\">Physician</span>'])[1]")
	public WebElement physicianNameTextBox;

	/* Participant: Fanconi Anemia Research Fund TextBox */
	@FindBy(xpath = "(//input[contains(@title,'<span style=\"font-family:Arial,Helvetica,sans-serif;\">Fanconi Cancer Foundation (formerly Fanconi Anemia Research Fund)</span>')])[1]")
	public WebElement fanconiAnemiaResearchFundTextBox;

	/* Participant: Genetic counselor TextBox */
	@FindBy(xpath = "(//input[contains(@title,'<span style=\"font-family:Arial,Helvetica,sans-serif;\">Genetic Counselor</span>')])[1]")
	public WebElement geneticCounselorTextBox;

	/* Participant: Other TextBox */
	@FindBy(xpath = "(//input[contains(@title,'Other')])[1]")
	public WebElement otherProviderTextBox;
	/*****************************************/

	/* Participant: Health care provider Name TextBox */
	@FindBy(xpath = "(//tbody/tr/td[2]/input)[1]")
	public WebElement healthCareProviderNameTextBox;

	/* Participant: Health care provider Address TextBox */
	@FindBy(xpath = "(//tbody/tr/td[2]/input)[2]")
	public WebElement healthCareProviderAddressTextBox;

	/* Participant: Health care provider Phone Number TextBox */
	@FindBy(xpath = "(//tbody/tr/td[2]/input)[3]")
	public WebElement healthCareProviderPhoneNumberTextBox;

	/* Participant: Participate in Research TextBox */
	@FindBy(xpath = "(//input[@title='<span style=\"font-family:Arial,Helvetica,sans-serif;\">Participate in research</span>'])[1]")
	public WebElement participateInResearchTextBox;

	/* Participant: Screen for potential cancer diagnosis TextBox */
	@FindBy(xpath = "(//input[@title='<span style=\"font-family:Arial,Helvetica,sans-serif;\">Screen for potential cancer diagnosis</span>'])[1]")
	public WebElement screenForPotentialCancerDiagnosisTextBox;

	/* Participant: Receive genetic testing TextBox */
	@FindBy(xpath = "(//input[@title='<span style=\"font-family:Arial,Helvetica,sans-serif;\">Receive genetic testing</span>'])[1]")
	public WebElement receiveGeneticTestingTextBox;

	/* Participant: Other TextBox */
	@FindBy(xpath = "(//input[@title='<span style=\"font-family:Arial,Helvetica,sans-serif;\">Other</span>'])[1]")
	public WebElement otherTextBox;
}
