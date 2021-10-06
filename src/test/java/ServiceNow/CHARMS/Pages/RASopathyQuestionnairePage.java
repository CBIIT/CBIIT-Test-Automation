package ServiceNow.CHARMS.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nci.automation.web.WebDriverUtils;

public class RASopathyQuestionnairePage {

	/** --------------- BEGINNING OF RASopathy Questionnaire PAGE --------------- */

	/* STUDY INTRODUCTION next button (THIS WORKS FOR ALL NEXT BUTTONS) */
	@FindBy(xpath = "//input[@title='→']")
	public WebElement studyNextButton;

	/**
	 * --------------- BEGINNING OF Are you completing this form for someone else or
	 * for yourself? PAGE ---------------
	 */

	/* I am completing this form for someone else option */
	@FindBy(xpath = "//span[contains(text(),'I am completing this form for someone else')]")
	public WebElement iAmCompletingThisFormForSomeoneElseOption;

	/**
	 * --------------- END OF Are you completing this form for someone else or for
	 * yourself? PAGE ---------------
	 */

	/**
	 * --------------- BEGINNING OF What is the name of the person who may be
	 * eligible for this study? PAGE ---------------
	 */

	/* First Name text box */
	@FindBy(xpath = "//input[@name='QR~QID105~4~TEXT']")
	public WebElement firstNameTextBox;

	/* Middle Name text box */
	@FindBy(xpath = "//input[@name='QR~QID105~5~TEXT']")
	public WebElement middleNameTextBox;

	/* Last Name text box */
	@FindBy(xpath = "//input[@name='QR~QID105~6~TEXT']")
	public WebElement lastNameTextBox;

	/**
	 * --------------- END OF What is the name of the person who may be eligible for
	 * this study? PAGE ---------------
	 */

	/** --------------- BEGINNING OF What is your name? PAGE --------------- */

	/* First Name of What is your name? text box */
	@FindBy(xpath = "//input[@name='QR~QID3~4~TEXT']")
	public WebElement firstNameWhatIsYourNameTextBox;

	/* Middle Name of What is your name? text box */
	@FindBy(xpath = "//input[@name='QR~QID3~5~TEXT']")
	public WebElement middleNameWhatIsYourNameTextBox;

	/* Last Name of What is your name? text box */
	@FindBy(xpath = "//input[@name='QR~QID3~6~TEXT']")
	public WebElement lastNameWhatIsYourNameTextBox;

	/** --------------- END OF What is your name? PAGE --------------- */

	/**
	 * --------------- BEGINNING OF What is your relationship to name? PAGE
	 * ---------------
	 */

	/* What is your relationship to name? Other option */
	@FindBy(xpath = "//span[contains(text(),'Other')]")
	public WebElement whatIsYourRelationshipToNameOption;

	/* What is your relationship to name? Other text box */
	@FindBy(xpath = "//input[@title='Other']")
	public WebElement whatIsYourRelationshipToNameTextBox;

	/**
	 * --------------- END OF What is your relationship to name? PAGE
	 * ---------------
	 */

	/**
	 * --------------- BEGINNING OF Are you the legal guardian of -- name? PAGE
	 * ---------------
	 */

	/* Are you the legal guardian of -- name? Yes option */
	@FindBy(xpath = "//span[@class='LabelWrapper']//label[@for='QR~QID5~1']")
	public WebElement areYouTheLegalGuardianYesOption;

	/**
	 * --------------- END OF Are you the legal guardian of automated name? PAGE
	 * ---------------
	 */

	/** --------------- BEGINNING OF Date of birth of "name" PAGE --------------- */

	/* Calendar month drop down */
	@FindBy(xpath = "//select[@aria-label='Month']")
	public WebElement calendarMonthDropDown;

	/* Calendar year text box */
	@FindBy(xpath = "//input[@aria-label='Year']")
	public WebElement calendarYearTextBox;

	/* Calendar day option */
	@FindBy(xpath = "//span[@aria-label='April 1, 1990']")
	public WebElement calendarDayOption;

	/** --------------- END OF Date of birth of "name" PAGE --------------- */

	/**
	 * --------------- BEGINNING OF Sex of "name" assigned at birth PAGE
	 * ---------------
	 */

	/* Sex Male option */
	@FindBy(xpath = "//span[contains(text(),'Male')]")
	public WebElement sexMaleOptionAssignedAtBirth;

	/**
	 * --------------- END OF Sex of "name" assigned at birth PAGE ---------------
	 */

	/** --------------- BEGINNING OF Is "name" adopted? PAGE --------------- */

	/* Yes option */
	@FindBy(xpath = "//span[@class='LabelWrapper']//label[@for='QR~QID11~1']")
	public WebElement isParticipantAdoptedYesOption;

	/** --------------- END OF Is "name" adopted? PAGE --------------- */

	/** --------------- BEGINNING OF Is "name" still alive? PAGE --------------- */

	/* Yes option */
	@FindBy(xpath = "//span[@class='LabelWrapper']//label[@for='QR~QID12~1']")
	public WebElement isParticipantStillAliveYesOption;

	/** --------------- END OF Is "name" still alive? PAGE --------------- */

	/**
	 * --------------- BEGINNING OF Does "name" currently live in the United States?
	 * PAGE ---------------
	 */

	/* Yes option */
	@FindBy(xpath = "//span[@class='LabelWrapper']//label[@for='QR~QID112~1']")
	public WebElement doesParticipantLiveInUnitedStatesYesOption;

	/**
	 * --------------- END OF Does "name" currently live in the United States? PAGE
	 * ---------------
	 */

	/**
	 * --------------- BEGINNING OF Does "name" currently live in the United States?
	 * PAGE ---------------
	 */

	/* Street text box */
	@FindBy(xpath = "//input[@name='QR~QID14~4~TEXT']")
	public WebElement addressForStudyMaterialsToBeSentStreetTextBox;

	/* City text box */
	@FindBy(xpath = "//input[@name='QR~QID14~6~TEXT']")
	public WebElement addressForStudyMaterialsToBeSentCityTextBox;

	/* State text box */
	@FindBy(xpath = "//input[@name='QR~QID14~7~TEXT']")
	public WebElement addressForStudyMaterialsToBeSentStateTextBox;

	/* Zip Code text box */
	@FindBy(xpath = "//input[@name='QR~QID14~8~TEXT']")
	public WebElement addressForStudyMaterialsToBeSentZipCodeTextBox;

	/**
	 * --------------- END OF Does "name" currently live in the United States? PAGE
	 * ---------------
	 */

	/**
	 * --------------- BEGINNING OF What is your email address? PAGE ---------------
	 */

	/* Email address text box */
	@FindBy(xpath = "//input[@name='QR~QID15~TEXT']")
	public WebElement whatIsYourEmailAddressTextBox;

	/** --------------- END OF What is your email address? PAGE --------------- */

	/**
	 * --------------- BEGINNING OF Please confirm your email address PAGE
	 * ---------------
	 */

	/* Email address text box */
	@FindBy(xpath = "//input[@name='QR~QID16~TEXT']")
	public WebElement pleaseConfirmYourEmailAddressTextBox;

	/**
	 * --------------- END OF Please confirm your email address PAGE ---------------
	 */

	/**
	 * --------------- BEGINNING OF Please list your phone numbers below. Please
	 * also select your preferred contact number. PAGE ---------------
	 */

	/* Home phone number text box */
	@FindBy(xpath = "//input[@name='QR~QID17~4~TEXT']")
	public WebElement pleaseListHomePhoneNumberTextBox;

	/* Cell phone number text box */
	@FindBy(xpath = "//input[@name='QR~QID17~5~TEXT']")
	public WebElement pleaseListCellPhoneNumberTextBox;

	/* Work phone number text box */
	@FindBy(xpath = "//input[@name='QR~QID17~8~TEXT']")
	public WebElement pleaseListWorkPhoneNumberTextBox;

	/* Preferred Contact cell phone number check box */
	@FindBy(xpath = "//tbody/tr[@class='ChoiceRow ReadableAlt ']/td[1]/label[1]")
	public WebElement pleaseSelectCellPhonePreferredContactCheckBox;

	/**
	 * --------------- END OF Please list your phone numbers below. Please also
	 * select your preferred contact number. PAGE ---------------
	 */

	/** --------------- BEGINNING OF Ethnicity of "Name" PAGE --------------- */

	/* Not hispanic/latino option */
	@FindBy(xpath = "//span[contains(@class,'LabelWrapper')]//label[contains(@for,'QR~QID18~2')]")
	public WebElement authenticityOfParticipantNotHispanicLatinoOption;

	/** --------------- END OF Ethnicity of "Name" PAGE --------------- */

	/**
	 * --------------- BEGINNING OF Race of "Name". Please select all that apply.
	 * PAGE ---------------
	 */

	/* Other text box */
	@FindBy(xpath = "//input[@title='Other']")
	public WebElement raceOfParticipantOtherTextBox;

	/**
	 * --------------- END OF Race of "Name". Please select all that apply. PAGE
	 * ---------------
	 */

	/**
	 * --------------- BEGINNING OF Is Automated Test a participant in any other
	 * research study or registry group? Please specify. PAGE ---------------
	 */

	/* Other option */
	@FindBy(xpath = "//span[@class='LabelWrapper']//label[@for='QR~QID115~3']")
	public WebElement isParticipantInOtherResearchStudyOtherOption;

	/* Other text box */
	@FindBy(xpath = "//input[@title='Other']")
	public WebElement isParticipantInOtherResearchStudyOtherTextBox;

	/**
	 * --------------- END OF Is Automated Test a participant in any other research
	 * study or registry group? Please specify. PAGE ---------------
	 */

	/**
	 * --------------- BEGINNING OF Has Automated Test ever been diagnosed with the
	 * following conditions? Select all that apply. If you do not see the exact
	 * condition diagnosed, please select the closest answer. PAGE ---------------
	 */

	/* Other option */
	@FindBy(xpath = "//span[contains(text(),': such as endocrine issues, bleeding disorders, se')]")
	public WebElement hasParticipantBeenDiagnosedWithFollowingConditionsOtherOption;

	/* Other text box */
	@FindBy(xpath = "//input[contains(@title,'<strong>Other</strong>: such as endocrine issues, bleeding disorders, seizures, tethered cord')]")
	public WebElement hasParticipantBeenDiagnosedWithFollowingConditionsOtherTextBox;

	/**
	 * --------------- END OF Has Automated Test ever been diagnosed with the
	 * following conditions? Select all that apply. If you do not see the exact
	 * condition diagnosed, please select the closest answer. PAGE ---------------
	 */

	/**
	 * --------------- BEGINNING OF Has "Name" ever been diagnosed with cancer? PAGE
	 * ---------------
	 */

	/* Yes option */
	@FindBy(xpath = "//span[@class='LabelWrapper']//label[@for='QR~QID32~1']")
	public WebElement hasProxyBeenDiagnosedWithCancerYesOption;

	/**
	 * --------------- END OF Has "Name" ever been diagnosed with cancer? PAGE
	 * ---------------
	 */

	/**
	 * --------------- BEGINNING OF Please complete the box below by selecting which
	 * primary cancers were diagnosed and at what age and year they occurred. If
	 * cancer spread from one place to another, please only indicate the original
	 * cancers and not the number of sites where cancer spread. PAGE ---------------
	 */

	/* First drop down */
	@FindBy(xpath = "//select[@name='QR~QID86#1~1']")
	public WebElement primaryCancerFirstDropDown;

	/* Second drop down */
	@FindBy(xpath = "//select[@name='QR~QID86#1~2']")
	public WebElement primaryCancerSecondDropDown;

	/* Third drop down */
	@FindBy(xpath = "//select[@name='QR~QID86#1~3']")
	public WebElement primaryCancerThirdDropDown;

	/* Fourth drop down */
	@FindBy(xpath = "//select[@name='QR~QID86#1~4']")
	public WebElement primaryCancerFourthDropDown;

	/* Age at diagnosis first text box */
	@FindBy(xpath = "//input[@name='QR~QID86#3~1~1~TEXT']")
	public WebElement ageAtDiagnosisFirstTextBox;

	/* Age at diagnosis second text box */
	@FindBy(xpath = "//input[@name='QR~QID86#3~2~1~TEXT']")
	public WebElement ageAtDiagnosisSecondTextBox;

	/* Age at diagnosis third text box */
	@FindBy(xpath = "//input[@name='QR~QID86#3~3~1~TEXT']")
	public WebElement ageAtDiagnosisThirdTextBox;

	/* Age at diagnosis fourth text box */
	@FindBy(xpath = "//input[@name='QR~QID86#3~4~1~TEXT']")
	public WebElement ageAtDiagnosisFourthTextBox;

	/* Year of diagnosis first text box */
	@FindBy(xpath = "//input[@name='QR~QID86#4~1~1~TEXT']")
	public WebElement yearOfDiagnosisFirstTextBox;

	/* Year of diagnosis second text box */
	@FindBy(xpath = "//input[@name='QR~QID86#4~2~1~TEXT']")
	public WebElement yearOfDiagnosisSecondTextBox;

	/* Year of diagnosis third text box */
	@FindBy(xpath = "//input[@name='QR~QID86#4~3~1~TEXT']")
	public WebElement yearOfDiagnosisThirdTextBox;

	/* Year of diagnosis fourth text box */
	@FindBy(xpath = "//input[@name='QR~QID86#4~4~1~TEXT']")
	public WebElement yearOfDiagnosisFourthTextBox;

	/* Currently receiving treatment first radio button */
	@FindBy(xpath = "//label[@for='QR~QID86#5~1~1']")
	public WebElement currentlyReceivingTreatmentFirstRadioButton;

	/* Currently receiving treatment second radio button */
	@FindBy(xpath = "//label[@for='QR~QID86#5~2~1']")
	public WebElement currentlyReceivingTreatmentSecondRadioButton;

	/* Currently receiving treatment first radio button */
	@FindBy(xpath = "//label[@for='QR~QID86#5~3~1']")
	public WebElement currentlyReceivingTreatmentThirdRadioButton;

	/* Currently receiving treatment first radio button */
	@FindBy(xpath = "//label[@for='QR~QID86#5~4~1']")
	public WebElement currentlyReceivingTreatmentFourthRadioButton;

	/**
	 * --------------- END OF Please complete the box below by selecting which
	 * primary cancers were diagnosed and at what age and year they occurred. If
	 * cancer spread from one place to another, please only indicate the original
	 * cancers and not the number of sites where cancer spread. PAGE ---------------
	 */

	/**
	 * --------------- BEGINNING OF Has "Name" been diagnosed with a RASopathy such
	 * as Noonan syndrome, Noonan syndrome with multiple lentigines, Costello
	 * syndrome, cardiofaciocutaneous syndrome, Legius syndrome, capillary
	 * arteriovenous malformation syndrome, hereditary gingival fibromatosis or
	 * SYNGAP1 syndrome? PAGE ---------------
	 */

	/* Yes option */
	@FindBy(xpath = "//span[@class='LabelWrapper']//label[@for='QR~QID27~1']")
	public WebElement hasProxyBeenDiagnosedWithaRasopathyYesOption;

	/**
	 * --------------- END OF Has "Name" been diagnosed with a RASopathy such as
	 * Noonan syndrome, Noonan syndrome with multiple lentigines, Costello syndrome,
	 * cardiofaciocutaneous syndrome, Legius syndrome, capillary arteriovenous
	 * malformation syndrome, hereditary gingival fibromatosis or SYNGAP1 syndrome?
	 * PAGE ---------------
	 */

	/**
	 * --------------- BEGINNING OF For which specific RASopathy has Automated Test
	 * been diagnosed? PAGE ---------------
	 */

	/* Other option */
	@FindBy(xpath = "//span[@class='LabelWrapper']//label[@for='QR~QID28~10']")
	public WebElement participantSpecificRasopathyOtherOption;

	/* Other text box */
	@FindBy(xpath = "//input[contains(@title,'Other')]")
	public WebElement participantSpecificRasopathyOtherTextBox;

	/**
	 * --------------- END OF For which specific RASopathy has Automated Test been
	 * diagnosed? PAGE ---------------
	 */

	/**
	 * --------------- BEGINNING OF Age (in years) at diagnosis PAGE ---------------
	 */

	/* Age (in years) at diagnosis text box */
	@FindBy(xpath = "//input[@name='QR~QID29~TEXT']")
	public WebElement participantAgeInYearsAtDiagnosis;

	/**
	 * --------------- END OF Age (in years) at diagnosis PAGE ---------------
	 */

	/**
	 * --------------- BEGINNING OF Year of diagnosis (yyyy) PAGE ---------------
	 */

	/* Age (in years) at diagnosis text box */
	@FindBy(xpath = "//input[@name='QR~QID30~TEXT']")
	public WebElement participantsYearOfDiagnosis;

	/**
	 * --------------- END OF Year of diagnosis (yyyy) PAGE ---------------
	 */

	/**
	 * --------------- BEGINNING OF Have any of "name" biological relatives been
	 * diagnosed with a RASopathy? PAGE ---------------
	 */

	/* Yes option */
	@FindBy(xpath = "//span[@class='LabelWrapper']//label[@for='QR~QID123~1']")
	public WebElement participantsFamilyMembersBeenDiagnosedYesOption;

	/**
	 * --------------- END OF Have any of "name" biological relatives been diagnosed
	 * with a RASopathy? PAGE ---------------
	 */

	/**
	 * --------------- BEGINNING OF Has participant ever had genetic testing? PAGE
	 * ---------------
	 */

	/* Yes option */
	@FindBy(xpath = "//span[@class='LabelWrapper']//label[@for='QR~QID36~1']")
	public WebElement participantsEverHadGeneticTestingYesOption;

	/**
	 * --------------- END OF Has participant ever had genetic testing? PAGE
	 * ---------------
	 */

	/**
	 * --------------- BEGINNING OF Do you have a copy of the genetic test results?
	 * PAGE ---------------
	 */

	/* Yes option */
	@FindBy(xpath = "//span[@class='LabelWrapper']//label[@for='QR~QID102~1']")
	public WebElement participantCopyOfGeneticTestResultsYesOption;

	/* No option */
	@FindBy(xpath = "//span[@class='LabelWrapper']//label[@for='QR~QID102~2']")
	public WebElement participantCopyOfGeneticTestResultsNoOption;

	/**
	 * --------------- END OF Do you have a copy of the genetic test results? PAGE
	 * ---------------
	 */

	/**
	 * --------------- BEGINNING OF How would you like to provide the genetic test
	 * results to us? Please select one. On the next page, you will be provided with
	 * where to send the information. PAGE ---------------
	 */

	/* Upload to this questionnaire option */
	@FindBy(xpath = "//span[contains(@class,'LabelWrapper')]//label[contains(@for,'QR~QID125~2')]")
	public WebElement participantUploadToThisQuestionnaireOption;

	/**
	 * --------------- END OF How would you like to provide the genetic test results
	 * to us? Please select one. On the next page, you will be provided with where
	 * to send the information. PAGE ---------------
	 */

	/**
	 * --------------- BEGINNING OF If you would like to upload the genetic test
	 * results, please do so here. Note: Only pdf files are accepted. PAGE
	 * ---------------
	 */

	/* Drop files or click here to upload */
	@FindBy(xpath = "//button[normalize-space()='Drop files or click here to upload']")
	public WebElement dropFilesOrClickHereToUploadButton;

	/* Word document PDF text */
	@FindBy(xpath = "//div[contains(@class,'FileUploadName')]")
	public WebElement wordDocumentPDFtext;

	/**
	 * --------------- END OF If you would like to upload the genetic test results,
	 * please do so here. Note: Only pdf files are accepted. PAGE ---------------
	 */

	/**
	 * --------------- BEGINNING OF
	 * 
	 * Were any genetic changes detected for the following syndromes? (Mark all that
	 * apply). PAGE ---------------
	 */

	/* Other genes/syndromes option */
	@FindBy(xpath = "//span[@class='LabelWrapper']//label[@for='QR~QID40~8']")
	public WebElement wereAnyGeneticChangesDetectedOtherGenesSyndromeOption;

	/* Noonan syndrome option */
	@FindBy(xpath = "//span[contains(@class,'LabelWrapper')]//label[contains(@for,'QR~QID40~1')]")
	public WebElement wereAnyGeneticChangesDetectedNoonanSyndromeOption;

	/* Noonan syndrome with multiple lentigines option */
	@FindBy(xpath = "//strong[normalize-space()='Noonan syndrome with multiple lentigines']")
	public WebElement wereAnyGeneticChangesDetectedNoonanSyndromeWithMultipleLentiginesOption;

	/* Cardiofaciocutaneous syndrome option */
	@FindBy(xpath = "//label[contains(@for,'QR~QID40~3')]//span")
	public WebElement wereAnyGeneticChangesDetectedCardiofaciocutaneousSyndromeOption;

	/* Costello syndrome option */
	@FindBy(xpath = "//label[contains(@for,'QR~QID40~4')]//span[1]")
	public WebElement wereAnyGeneticChangesDetectedCostelloSyndromeOption;

	/* Capillary syndrome option */
	@FindBy(xpath = "//strong[normalize-space()='Capillary arteriovenous malformation syndrome']")
	public WebElement wereAnyGeneticChangesDetectedCapillarySyndromeOption;

	/* SYNGAP1 syndrome option */
	@FindBy(xpath = "//strong[normalize-space()='SYNGAP1 syndrome']")
	public WebElement wereAnyGeneticChangesDetectedSYNGAP1SyndromeOption;

	/* Legius syndrome option */
	@FindBy(xpath = "//strong[normalize-space()='Legius syndrome']")
	public WebElement wereAnyGeneticChangesDetectedLegiusSyndromeOption;

	/**
	 * --------------- END OF
	 * 
	 * Were any genetic changes detected for the following syndromes? (Mark all that
	 * apply). PAGE ---------------
	 */

	/**
	 * --------------- BEGINNING OF
	 * 
	 * How did you hear about this study? If a specific health care provider
	 * referred sdfg sgd to this study, please include their name in the
	 * corresponding text box. PAGE ---------------
	 */

	/* Other option */
	@FindBy(xpath = "//span[@class='LabelWrapper']//label[@for='QR~QID70~8']")
	public WebElement howDidYouHearAboutTheStudyOtherOption;

	/* Other text box */
	@FindBy(xpath = "//input[contains(@title,'Other')]")
	public WebElement howDidYouHearAboutTheStudyOtherTextBox;

	/**
	 * --------------- END OF
	 * 
	 * How did you hear about this study? If a specific health care provider
	 * referred sdfg sgd to this study, please include their name in the
	 * corresponding text box. PAGE ---------------
	 */

	/**
	 * --------------- BEGINNING OF
	 * 
	 * Has participant or other family members ever participated in another study on
	 * RASopathies at another medical institution, university, government agency or
	 * other site? PAGE ---------------
	 */

	/* Yes option */
	@FindBy(xpath = "//span[@class='LabelWrapper']//label[@for='QR~QID127~1']")
	public WebElement hasParticipantOrOtherFamilyMemberParticipatedInOtherStudyYesOption;

	/**
	 * --------------- END OF
	 * 
	 * Has participant or other family members ever participated in another study on
	 * RASopathies at another medical institution, university, government agency or
	 * other site? PAGE ---------------
	 */

	/**
	 * --------------- BEGINNING OF
	 * 
	 * Please provide the information regarding previous participation in other
	 * RASopathy studies in the box below. PAGE ---------------
	 */

	/* Study name Relative 1 text box */
	@FindBy(xpath = "//input[@name='QR~QID97#1~1~1~TEXT']")
	public WebElement studyNameRelative1textbox;

	/* Study name Relative 2 text box */
	@FindBy(xpath = "//input[@name='QR~QID97#1~2~1~TEXT']")
	public WebElement studyNameRelative2textbox;

	/* Study name Relative 3 text box */
	@FindBy(xpath = "//input[@name='QR~QID97#1~3~1~TEXT']")
	public WebElement studyNameRelative3textbox;

	/* Study name Relative 4 text box */
	@FindBy(xpath = "//input[@name='QR~QID97#1~4~1~TEXT']")
	public WebElement studyNameRelative4textbox;

	/* Family relationship Relative 1 text box */
	@FindBy(xpath = "//input[@name='QR~QID97#2~1~1~TEXT']")
	public WebElement familyRelationshipRelative1textbox;

	/* Family relationship Relative 2 text box */
	@FindBy(xpath = "//input[@name='QR~QID97#2~2~1~TEXT']")
	public WebElement familyRelationshipRelative2textbox;

	/* Family relationship Relative 3 text box */
	@FindBy(xpath = "//input[@name='QR~QID97#2~3~1~TEXT']")
	public WebElement familyRelationshipRelative3textbox;

	/* Family relationship Relative 4 text box */
	@FindBy(xpath = "//input[@name='QR~QID97#2~4~1~TEXT']")
	public WebElement familyRelationshipRelative4textbox;

	/* Study contact person Relative 1 text box */
	@FindBy(xpath = "//input[@name='QR~QID97#3~1~1~TEXT']")
	public WebElement studyContactPersonRelative1textbox;

	/* Study contact person Relative 2 text box */
	@FindBy(xpath = "//input[@name='QR~QID97#3~2~1~TEXT']")
	public WebElement studyContactPersonRelative2textbox;

	/* Study contact person Relative 3 text box */
	@FindBy(xpath = "//input[@name='QR~QID97#3~3~1~TEXT']")
	public WebElement studyContactPersonRelative3textbox;

	/* Study contact person Relative 4 text box */
	@FindBy(xpath = "//input[@name='QR~QID97#3~4~1~TEXT']")
	public WebElement studyContactPersonRelative4textbox;

	/* Study phone number Relative 1 text box */
	@FindBy(xpath = "//input[@name='QR~QID97#4~1~1~TEXT']")
	public WebElement studyPhoneNumberRelative1textbox;

	/* Study phone number Relative 2 text box */
	@FindBy(xpath = "//input[@name='QR~QID97#4~2~1~TEXT']")
	public WebElement studyPhoneNumberRelative2textbox;

	/* Study phone number Relative 3 text box */
	@FindBy(xpath = "//input[@name='QR~QID97#4~3~1~TEXT']")
	public WebElement studyPhoneNumberRelative3textbox;

	/* Study phone number Relative 4 text box */
	@FindBy(xpath = "//input[@name='QR~QID97#4~4~1~TEXT']")
	public WebElement studyPhoneNumberRelative4textbox;

	/* Date of participation year Relative 1 text box */
	@FindBy(xpath = "//input[@name='QR~QID97#5~1~1~TEXT']")
	public WebElement dateOfParticipationStartYearRelative1textbox;

	/* Date of participation year Relative 2 text box */
	@FindBy(xpath = "//input[@name='QR~QID97#5~2~1~TEXT']")
	public WebElement dateOfParticipationStartYearRelative2textbox;

	/* Date of participation year Relative 3 text box */
	@FindBy(xpath = "//input[@name='QR~QID97#5~3~1~TEXT']")
	public WebElement dateOfParticipationStartYearRelative3textbox;

	/* Date of participation start year Relative 4 text box */
	@FindBy(xpath = "//input[@name='QR~QID97#5~4~1~TEXT']")
	public WebElement dateOfParticipationStartYearRelative4textbox;

	/* Date of participation end year Relative 1 text box */
	@FindBy(xpath = "//input[@name='QR~QID97#5~1~2~TEXT']")
	public WebElement dateOfParticipationEndYearRelative1textbox;

	/* Date of participation end year Relative 2 text box */
	@FindBy(xpath = "//input[@name='QR~QID97#5~2~2~TEXT']")
	public WebElement dateOfParticipationEndYearRelative2textbox;

	/* Date of participation end year Relative 3 text box */
	@FindBy(xpath = "//input[@name='QR~QID97#5~3~2~TEXT']")
	public WebElement dateOfParticipationEndYearRelative3textbox;

	/* Date of participation end year Relative 4 text box */
	@FindBy(xpath = "//input[@name='QR~QID97#5~4~2~TEXT']")
	public WebElement dateOfParticipationEndYearRelative4textbox;

	/**
	 * --------------- END OF
	 * 
	 * Please provide the information regarding previous participation in other
	 * RASopathy studies in the box below. PAGE ---------------
	 */

	/**
	 * --------------- BEGINNING OF
	 * 
	 * What are the main reasons for participating in this study? Select all that
	 * apply. Please elaborate on the reason in the corresponding textbox. PAGE
	 * ---------------
	 */

	/* Participate in research option */
	@FindBy(xpath = "//span[contains(@class,'LabelWrapper')]//label[contains(@for,'QR~QID81~1')]")
	public WebElement mainReasonForParticipatingInStudyParticipateInResearchOption;

	/* Participate in research text box */
	@FindBy(xpath = "//input[contains(@title,'<span style=\"font-family:Arial,Helvetica,sans-serif;\">Participate in research</span>')]")
	public WebElement mainReasonForParticipatingInStudyParticipateInResearchTextBox;

	/* Identify a diagnosis option */
	@FindBy(xpath = "//span[@class='LabelWrapper']//label[@for='QR~QID81~2']")
	public WebElement mainReasonForParticipatingInStudyIdentifyADiagnosisOption;

	/* Identify a diagnosis text box */
	@FindBy(xpath = "//input[contains(@title,'<span style=\"font-family:Arial,Helvetica,sans-serif;\">Identify a diagnosis</span>')]")
	public WebElement mainReasonForParticipatingInStudyIdentifyADiagnosisTextBox;

	/* Receive genetic testing option */
	@FindBy(xpath = "//span[@class='LabelWrapper']//label[@for='QR~QID81~3']")
	public WebElement mainReasonForParticipatingInStudyReceiveGeneticTestingOption;

	/* Receive genetic testing text box */
	@FindBy(xpath = "//input[contains(@title,'<span style=\"font-family:Arial,Helvetica,sans-serif;\">Receive genetic testing</span>')]")
	public WebElement mainReasonForParticipatingInStudyReceiveGeneticTestingTextBox;

	/* Other option */
	@FindBy(xpath = "//span[@class='LabelWrapper']//label[@for='QR~QID81~4']")
	public WebElement mainReasonForParticipatingInStudyOtherOption;

	/* Other text box */
	@FindBy(xpath = "//input[contains(@title,'<span style=\"font-family:Arial,Helvetica,sans-serif;\">Other</span>')]")
	public WebElement mainReasonForParticipatingInStudyOtherTextBox;

	/**
	 * --------------- END OF
	 * 
	 * What are the main reasons for participating in this study? Select all that
	 * apply. Please elaborate on the reason in the corresponding textbox. PAGE
	 * ---------------
	 */

	/**
	 * --------------- BEGINNING OF
	 * 
	 * We thank you for your time spent taking this survey. Your response has been
	 * recorded. PAGE ---------------
	 */

	/* Submission successful text */
	@FindBy(xpath = "//div[@class='END_OF_SURVEY EndOfSurvey BorderColor SystemEndOfSurvey']")
	public WebElement submissionSuccessfulText;
	
	/**
	 * --------------- END OF
	 * 
	 * We thank you for your time spent taking this survey. Your response has been
	 * recorded. PAGE ---------------
	 */

	/** --------------- END OF RASopathy Questionnaire PAGE --------------- */

	public RASopathyQuestionnairePage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}

}
