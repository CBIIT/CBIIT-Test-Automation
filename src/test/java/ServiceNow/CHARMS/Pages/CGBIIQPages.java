package ServiceNow.CHARMS.Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class CGBIIQPages extends CommonUtils {

	public CGBIIQPages() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);

	}
	
	/** Mobile View Slider Switch */
	@FindBy (xpath = "//span[@class='mobile-view-slider']")
	public WebElement mobileViewSlider;
	
	/** Reusable elements for Yes and No radio buttons */
	/** Yes Radio Button */
	@FindBy (xpath = "//span[contains(text(),'Yes')]")
	public WebElement yesSelection;
	
	/** No Radio Button */
	@FindBy (xpath = "//span[contains(text(),'No')]")
	public WebElement noSelection;
	
	/** This is the element for the next button (Can be used for any next button on questoinnaire) */
	@FindBy (xpath = "//input[@name='NextButton']")
	public WebElement nextButton;
	
	/** List of Elements to use when multiple answers can be selected */
	@FindBy (xpath = "//label[@class='MultipleAnswer  ChoiceTextPositionLeft']")
	public List<WebElement> multipleAnswers;
	
	/** Other Please specify text box */
	
	@FindBy (xpath = "//input[@type='text']")
	public WebElement otherPleaseSpecifyTextBox;
	
	/** Switching to Questionnaire's Desktop view frame */
	
	@FindBy (xpath = "//iframe[@id='preview-view']")
	public WebElement desktopFrame;
	
	/** This is the Number of Pregnancies Fathered radio button */
	@FindBy (xpath= "//span[contains(text(),'Number of pregnancies fathered')]")
	public WebElement numberOfPregnanciesFatheredRadioButton;
	
	/** This is the Number of Pregnancies Fathered text button */
	@FindBy (xpath= "//input[@type='text']")
	public WebElement numberOfPregnanciesFatheredTextBox;
	
	/** This is the element for users email */
	@FindBy (xpath ="//input[@name='QR~Authentication-FL_18~0~TEXT']")
	public WebElement loginEmail;
	
	/** This is the text box for the one time PIN number */
	@FindBy (xpath ="//input[@name='QR~Authentication-FL_18~1~TEXT']")
	public WebElement oneTimePin;
	
	/**================================================================================*/
	
	/** This is the radio button for completing the questionnaire for someone else */
	@FindBy (xpath = "//span[contains(text(),'I am completing this form for someone else')]")
	public WebElement completingForSomeoneElseRadioButton;
	
	/** This is the radio button for completing the questionnaire for Yourself */
	@FindBy (xpath = "//span[contains(text(),'I am completing this form for myself')]")
	public WebElement completingForSomeoneMyselfRadioButton;
	
	/**================================================================================*/
	
	/** This is the element for selecting Female as the Proband's gender */
	@FindBy (xpath = "//span[contains(text(),'Female')]")
	public WebElement probandFemaleSex;
	
	/** This is the element for selecting Male as the Proband's gender */
	@FindBy (xpath = "//span[contains(text(),'Male')]")
	public WebElement probandMaleSex;
	
	/**================================================================================*/
	
	/** The next couple elements specify Ethnicity and Race of Proband */
	@FindBy (xpath = "(//span[contains(text(),'Hispanic or Latino')])[1]")
	public WebElement probandsHispanicEthnicity;
	
	/**================================================================================*/
	
	/** This is the text box for the Probands Name */
	@FindBy (xpath = "//input[@type='TEXT']")
	public WebElement probandsName;
	
	/**================================================================================*/
	
	/** This element is for the the White race check box */
	@FindBy (xpath = "//span[contains(text(),'White')]")
	public WebElement probandsWhiteRace;
	
	/** This element is for the the Black or African American race check box */
	@FindBy (xpath = "//span[contains(text(),'Black or African American')]")
	public WebElement probandsBlackRace;
	
	/** This element is for the the Native Hawaiian or Other Pacific Islander race check box */
	@FindBy (xpath = "//span[contains(text(),'Native Hawaiian or Other Pacific Islander')]")
	public WebElement probandsNativeHawaiianRace;
	
	/** This element is for the the American Indian or Alaska Native race check box */
	@FindBy (xpath = "//span[contains(text(),'American Indian or Alaska Native')]")
	public WebElement probandsAmericanIndianRace;
	
	/** This element is for the the Asian race check box */
	@FindBy (xpath = "//span[contains(text(),'Asian')]")
	public WebElement probandsAsianRace;
	
	/** This element is for the the Other (please specify) race check box */
	@FindBy (xpath = "//span[contains(text(),'Other (please specify)')]")
	public WebElement probandsOtherRace;
	
	/** This element is for the the Other (please specify) race text box */
	@FindBy (xpath = "//input[@type='text']")
	public WebElement probandsOtherRaceTextbox;
	
	/**================================================================================*/
	
	/** Proxy Flow Probands Guardian's Name */
	@FindBy (xpath = "//input[@name='QR~QID113#1~1~1~TEXT']")
	public WebElement guardianNameProxyFlow;
	
	/** Proband Flow Probands Guardian's Name */
	@FindBy (xpath = "//input[@name='QR~QID22#1~1~1~TEXT']")
	public WebElement guardiansNameProbandFlow;
	
	/** Proxy Flow Relationship of Guardian to Proband */
	@FindBy (xpath = "//input[@name='QR~QID113#2~1~1~TEXT']")
	public WebElement guardianRelationshipToProbandProxyFlow;
	
	/** Probands Flow Relationship of Guardian to Proband */
	@FindBy (xpath = "//input[@name='QR~QID22#2~1~1~TEXT']")
	public WebElement guardiansRelationshipToProbandProbandFlow;
	
	/**================================================================================*/
	
	/** DOB of Proband */
	
	/** Previous month button */
	@FindBy (xpath = "//span[@class='arrowDown']")
	public WebElement previousYearButton;
	
	
	/** First of the month Value */
	@FindBy (xpath = "(//span[@class='flatpickr-day '])[1]")
	public WebElement probandsDOBDay;
	
	/**================================================================================*/
	
	/** City where Proband was born */
	@FindBy (xpath = "//input[@id='QR~QID158~1']")
	public WebElement probandCityProxyFlow;
	
	/** City where Proband was born */
	@FindBy (xpath = "//input[@id='QR~QID24~1']")
	public WebElement probandCity;
	
	/** State where Proband was born */
	@FindBy (xpath = "//input[@id='QR~QID158~2']")
	public WebElement probandStateProxyFlow;
	
	/** State where Proband was born */
	@FindBy (xpath = "//input[@id='QR~QID24~2']")
	public WebElement probandState;
	
	/** Country where Proband was born */
	@FindBy (xpath = "//input[@id='QR~QID158~3']")
	public WebElement probandCountryProxyFlow;
	
	/** Country where Proband was born */
	@FindBy (xpath = "//input[@id='QR~QID24~3']")
	public WebElement probandCountry;
	
	/** If nothing is know of the place of birth, fill out Don't know text box */
	@FindBy (xpath = "//input[@id='QR~QID158~4']")
	public WebElement probandDontKnowProxyFlow;
	
	/** If nothing is know of the place of birth, fill out Don't know text box */
	@FindBy (xpath = "//input[@id='QR~QID24~4']")
	public WebElement probandDontKnow;
	
	/**================================================================================*/
	
	/** Marital Status of Proband */
	/** Value */
	@FindBy (xpath = "(//span[contains(text(),'Married')])[1]")
	public WebElement marriedMaritalStatus;
	
	/**================================================================================*/
	
	/** Occupation checkbox of Proband */
	/** Describe job or main occupation Value */
	@FindBy (xpath = "//span[contains(text(),'Describe job or main occupation')]")
	public WebElement probandsOccupation;
	
	/** Occupation text box of Proband */
	@FindBy (xpath = "//input[@id='QR~QID120~4~TEXT']")
	public WebElement probandsOccupationTextBoxProxyFlow;
	
	/** Occupation text box of Proband */
	@FindBy (xpath = "//input[@type='text']")
	public WebElement probandsOccupationTextBox;
	
	
	/**================================================================================*/
	
	/** Total income of Proband's household */
	/** More than $80,000 Value */
	@FindBy (xpath = "//span[contains(text(),'More than $80,000')]")
	public WebElement householdIncome;
	
	/**================================================================================*/
	
	/** Highest level of education of Proband */
	/** Completed college Value */
	@FindBy (xpath = "//span[contains(text(),'Completed college')]")
	public WebElement educationLevel;
	
	/**================================================================================*/
	
	/** This how was the Proband conceived Yes, donor sperm and egg value radio button */
	@FindBy (xpath = "//span[contains(text(),'Yes, donor sperm and egg')]")
	public WebElement conceivedBySpermAndEggDonation;
	
	/**================================================================================*/
	
	/** This is the What type of birth was d? Twin Value */
	@FindBy (xpath = "//span[contains(text(),'Twin')]")
	public WebElement probandTwinBirth;
	
	/**================================================================================*/
	
	/** This is the What type of birth was d? Fraternal Twin Value */
	@FindBy (xpath = "//span[contains(text(),'Fraternal')]")
	public WebElement fraternalTwinValue;
	
	/**================================================================================*/
	
	/** Type of Birth either Twin or Multiple drop down */
	@FindBy (xpath = "//select[@id='QR~QID40#4~1']")
	public WebElement siblingBirthTypeDropdown;
	
	/** This is the siblings first name text box */
	@FindBy (xpath = "//input[@name='QR~QID40#1~1~1~TEXT']")
	public WebElement siblingFirstName;
	
	/** This is the siblings last initial text box */
	@FindBy (xpath = "//select[@id='QR~QID40#2~1']")
	public WebElement siblingLastNameInitial;
	
	/** This is the relationship of sibling (Identical/Fraternal/Multiple Birth) */
	@FindBy (xpath = "//select[@id='QR~QID40#3~1']")
	public WebElement siblingRelationshipToProband;
	
	/**================================================================================*/
	
	/** Parents relationship to each other radio button */
	@FindBy (xpath = "//span[contains(text(),'Relationship')]")
	public WebElement parentsRelationshipToEachotherRadioButton;
	
	/** Parents relationship to each other text box */
	@FindBy (xpath = "//textarea[@id='QR~QID42~1~TEXT']")
	public WebElement parentsRelationshipToEachotherTextBox;
	
	/**================================================================================*/
	
	/** How was Proband born? radio button */
	@FindBy (xpath = "//span[contains(text(),'full term (37-42 weeks)')]")
	public WebElement fullTermBirth;
	
	/**================================================================================*/
	
	/** How much was the Proband when they were born? (in lbs) */
	@FindBy (xpath = "//input[@name='QR~QID133#1~1~1~TEXT']")
	public WebElement numericalWeight;
	
	/** How long was the Proband when they were born? (in Inches) */
	@FindBy (xpath = "//input[@name='QR~QID133#1~2~1~TEXT']")
	public WebElement numericalLength;
	
	/** How long was the circumference of the Probands Head when they were born? (in Inches) */
	@FindBy (xpath = "//input[@name='QR~QID133#1~3~1~TEXT']")
	public WebElement numericalHeadCircumference;
	
	/** Unit of measurement for how much was the Proband when they were born? (in lbs) */
	@FindBy (xpath = "//select[@id='QR~QID133#3~1']")
	public WebElement unitOfMeasurementWeight;
	
	/** Unit of measurement for how long was the Proband when they were born? (in Inches) */
	@FindBy (xpath = "//select[@id='QR~QID133#3~2']")
	public WebElement unitOfMeasurementLength;
	
	/** Unit of measurement for how long was the circumference of the Probands Head when they were born? (in Inches) */
	@FindBy (xpath = "//select[@id='QR~QID133#3~3']")
	public WebElement unitOfMeasurementHeadCircumference;
	
	/** How much was the Proband when they were born? (in lbs) */
	@FindBy (xpath = "//input[@name='QR~QID98#1~1~1~TEXT']")
	public WebElement numericalWeightProband;
	
	/** How long was the Proband when they were born? (in Inches) */
	@FindBy (xpath = "//input[@name='QR~QID98#1~2~1~TEXT']")
	public WebElement numericalLengthProband;
	
	/** How long was the circumference of the Probands Head when they were born? (in Inches) */
	@FindBy (xpath = "//input[@name='QR~QID98#1~3~1~TEXT']")
	public WebElement numericalHeadCircumferenceProband;
	
	/** Unit of measurement for how much was the Proband when they were born? (in lbs) */
	@FindBy (xpath = "//select[@id='QR~QID98#3~1']")
	public WebElement unitOfMeasurementWeightProband;
	
	/** Unit of measurement for how long was the Proband when they were born? (in Inches) */
	@FindBy (xpath = "//select[@id='QR~QID98#3~2']")
	public WebElement unitOfMeasurementLengthProband;
	
	/** Unit of measurement for how long was the circumference of the Probands Head when they were born? (in Inches) */
	@FindBy (xpath = "//select[@id='QR~QID98#3~3']")
	public WebElement unitOfMeasurementHeadCircumferenceProband;
	
	/**================================================================================*/
	
	/** This webelement is the Adrenal Gland selection of the Please select or report the primary cancer(s) or benign tumor(s) that have been diagnosed */
	@FindBy (xpath = "//span[contains(text(),'Adrenal gland')]")
	public WebElement cancerBenignTumorAdrenalGlandValue;
	
	/**================================================================================*/
	
	/** Year when the Proband was diagnosed */
	@FindBy (xpath = "(//input[@type='text'])[1]")
	public WebElement dateOfDiagnosisInYears;
	
	/** The Probands age in years when diagnosed */
	@FindBy (xpath = "(//input[@type='text'])[2]")
	public WebElement ageOfDiagnosisInYear;
	
	/** State and address of Facility where the Proband was Diagnosed */
	@FindBy (xpath = "(//input[@type='text'])[4]")
	public WebElement facilityAddressWhereProbandWasDiagnosed;
	
	/** State and address of Facility where the Proband was Treated */
	@FindBy (xpath = "(//input[@type='text'])[5]")
	public WebElement facilityAddressWhereProbandWasTreated;
	
	/** Type of Treatment at the Facility */
	@FindBy (xpath = "//label[@for='QR~QID63#4~x1~1']")
	public WebElement treatmentReceivedSurgery;
	
	/** Type of Treatment at the Facility */
	@FindBy (xpath = "//label[@for='QR~QID63#4~x1~2']")
	public WebElement treatmentReceivedChemotherapy;
	
	/** Type of Treatment at the Facility */
	@FindBy (xpath = "//label[@for='QR~QID63#4~x1~3']")
	public WebElement treatmentReceivedRadiation;
	
	/** Type of Treatment at the Facility */
	@FindBy (xpath = "//label[@for='QR~QID63#4~x1~4']")
	public WebElement treatmentReceivedImmunotherapy;
	
	/** Type of Treatment at the Facility */
	@FindBy (xpath = "//label[@for='QR~QID63#4~x1~5']")
	public WebElement treatmentReceivedOther;
	
	/**================================================================================*/
	
	/** This is the gene or the panel that was tested */
	@FindBy (xpath = "//select[@id='QR~QID168#4~1']")
	public WebElement geneOrSyndromeTested;
	
	/** Date testing occured in Month/Years */
	@FindBy (xpath = "//input[@id='QR~QID168#1~1~1~TEXT']")
	public WebElement dateOfTesting;
	
	/** Age of Proband when testing occured. */
	@FindBy (xpath = "//input[@id='QR~QID168#1~1~2~TEXT']")
	public WebElement ageOfTesting;
	
	/** Name, City, State/Province and Country of Hospital where testing occured. */
	@FindBy (xpath = "//textarea[@id='QR~QID168#2~1~1~TEXT']")
	public WebElement hospitalLocation;
	
	/** Selected answer that best summarizes the findings of the evaluation */
	@FindBy (xpath = "//select[@id='QR~QID168#3~1']")
	public WebElement bestSummaryOfEvaluation;
	
	
	
	/** This is the gene or the panel that was tested Proband Flow */
	@FindBy (xpath = "//select[@id='QR~QID70#4~1']")
	public WebElement geneOrSyndromeTestedProbandFlow;
	
	/** Date testing occured in Month/Years Proband Flow */
	@FindBy (xpath = "//input[@id='QR~QID70#1~1~1~TEXT']")
	public WebElement dateOfTestingProbandFlow;
	
	/** Age of Proband when testing occured Proband Flow */
	@FindBy (xpath = "//input[@id='QR~QID70#1~1~2~TEXT']")
	public WebElement ageOfTestingProbandFlow;
	
	/** Name, City, State/Province and Country of Hospital where testing occured Proband Flow */
	@FindBy (xpath = "//textarea[@id='QR~QID70#2~1~1~TEXT']")
	public WebElement hospitalLocationProbandFlow;
	
	/** Selected answer that best summarizes the findings of the evaluation Proband Flow */
	@FindBy (xpath = "//select[@id='QR~QID70#3~1']")
	public WebElement bestSummaryOfEvaluationProbandFlow;
	
	/**================================================================================*/
	
	/** Current weight of Proband Proxy Flow */
	@FindBy (xpath = "//input[@name='QR~QID140#1~1~1~TEXT']")
	public WebElement numericalCurrentWeight;
	
	/** Current height of Proband Proxy Flow */
	@FindBy (xpath = "//input[@name='QR~QID140#1~2~1~TEXT']")
	public WebElement numericalCurrentHeight;
	
	/** Weight of Proband at 18 years old Proxy Flow */
	@FindBy (xpath = "//input[@name='QR~QID140#1~3~1~TEXT']")
	public WebElement numericalWeightAt18;
	
	/** Weight of Proband at 30 years old Proxy Flow */
	@FindBy (xpath = "//input[@name='QR~QID140#1~4~1~TEXT']")
	public WebElement numericalWeightAt30;
	
	/** Weight of Proband at 40 years old Proxy Flow */
	@FindBy (xpath = "//input[@name='QR~QID140#1~5~1~TEXT']")
	public WebElement numericalWeightAt40;
	
	/** Unit of measurement for Current weight of Proband Proxy Flow */
	@FindBy (xpath = "//select[@id='QR~QID140#2~1']")
	public WebElement UnitOfMeasurementCurrentWeight;
	
	/** Unit of measurement for Current height of Proband Proxy Flow */
	@FindBy (xpath = "//select[@id='QR~QID140#2~2']")
	public WebElement UnitOfMeasurementCurrentHeight;
	
	/** Unit of measurement for weight of Proband at 18 years old Proxy Flow */
	@FindBy (xpath = "//select[@id='QR~QID140#2~3']")
	public WebElement UnitOfMeasurementWeightAt18;
	
	/** Unit of measurement for weight of Proband at 30 years old Proxy Flow */
	@FindBy (xpath = "//select[@id='QR~QID140#2~4']")
	public WebElement UnitOfMeasurementWeightAt30;
	
	/** Unit of measurement for weight of Proband at 40 years old Proxy Flow */
	@FindBy (xpath = "//select[@id='QR~QID140#2~5']")
	public WebElement UnitOfMeasurementWeightAt40;
	
	/**================================================================================*/
	
	/** Current weight of Proband */
	@FindBy (xpath = "//input[@name='QR~QID101#1~1~1~TEXT']")
	public WebElement numericalCurrentWeightProbandFlow;
	
	/** Current height of Proband */
	@FindBy (xpath = "//input[@name='QR~QID101#1~2~1~TEXT']")
	public WebElement numericalCurrentHeightProbandFlow;
	
	/** Weight of Proband at 18 years old */
	@FindBy (xpath = "//input[@name='QR~QID101#1~3~1~TEXT']")
	public WebElement numericalWeightAt18ProbandFlow;
	
	/** Weight of Proband at 30 years old */
	@FindBy (xpath = "//input[@name='QR~QID101#1~4~1~TEXT']")
	public WebElement numericalWeightAt30ProbandFlow;
	
	/** Weight of Proband at 40 years old */
	@FindBy (xpath = "//input[@name='QR~QID101#1~5~1~TEXT']")
	public WebElement numericalWeightAt40ProbandFlow;
	
	/** Unit of measurement for Current weight of Proband */
	@FindBy (xpath = "//select[@id='QR~QID101#2~1']")
	public WebElement UnitOfMeasurementCurrentWeightProbandFlow;
	
	/** Unit of measurement for Current height of Proband */
	@FindBy (xpath = "//select[@id='QR~QID101#2~2']")
	public WebElement UnitOfMeasurementCurrentHeightProbandFlow;
	
	/** Unit of measurement for weight of Proband at 18 years old */
	@FindBy (xpath = "//select[@id='QR~QID101#2~3']")
	public WebElement UnitOfMeasurementWeightAt18ProbandFlow;
	
	/** Unit of measurement for weight of Proband at 30 years old */
	@FindBy (xpath = "//select[@id='QR~QID101#2~4']")
	public WebElement UnitOfMeasurementWeightAt30ProbandFlow;
	
	/** Unit of measurement for weight of Proband at 40 years old */
	@FindBy (xpath = "//select[@id='QR~QID101#2~5']")
	public WebElement UnitOfMeasurementWeightAt40ProbandFlow;
	
	/**================================================================================*/
	
	/** What is the most the Proband has ever weighed NOT INCLUDING PREGNANCY */
	@FindBy (xpath = "//input[@type='TEXT']")
	public WebElement mostProbandHasEverWeighed;
	
	/**================================================================================*/
	
	/** At what age was the Proband the tallest they have ever been */
	@FindBy (xpath = "//input[@type='TEXT']")
	public WebElement ageProbandWeighedTheMost;
	
	/**================================================================================*/
	
	/** At what age did the Proband have their first menstrual Period */
	@FindBy (xpath = "//span[contains(text(),'Age (in years)')]")
	public WebElement ageInYears;
	
	/** At what age did the Proband have their first menstrual Period Text Box */
	@FindBy (xpath = "//input[@id='QR~QID79~1~TEXT']")
	public WebElement ageProbandHadFirstMenstrualPeriodTextBox;
	
	/**================================================================================*/
	
	/** At what age did the Proband have their most recent menstrual Period */
	@FindBy (xpath = "//span[contains(text(),'Date (mm/yyyy)')]")
	public WebElement ageProbandHadMostRecentMenstrualPeriod;
	
	/** At what age did the Proband have their most recent menstrual Period Text Box */
	@FindBy (xpath = "(//input[@type='text'])[2]")
	public WebElement ageProbandHadMostRecentMenstrualPeriodTextBox;
	
	/**================================================================================*/
	
	/** Reason if Proband has not had period in last year Still having period value */
	@FindBy (xpath = "//span[contains(text(),'Still having periods')]")
	public WebElement stillHavingPeriodsRadioButton;
	
	/**================================================================================*/
	
	/** The Probands age of their first pregnancy */
	@FindBy (xpath = "//input[@id='QR~QID162']")
	public WebElement ageOfFirstPregnancy;
	
	/** The Probands age of their first pregnancy Proband Flow */
	@FindBy (xpath = "//input[@type='TEXT']")
	public WebElement ageOfFirstPregnancyProbandFlow;
	
	/**================================================================================*/
	
	/** Number of times the Proband has been pregnant */
	@FindBy (xpath = "//input[@id='QR~QID160']")
	public WebElement numberOfTimesProbandHasBeenPregnant;
	
	/** Number of times the Proband has been pregnant */
	@FindBy (xpath = "//input[@type='TEXT']")
	public WebElement numberOfTimesProbandHasBeenPregnantProbandFlow;
	
	/**================================================================================*/
	
	/** Age when the Proband consulted a Doctor over difficulties getting pregnant */
	@FindBy (xpath = "//input[@type='TEXT']")
	public WebElement ageWhenConsultedDrOverDifficultiesGettingPregnant;
	
	/**================================================================================*/
	
	/** Diagnosis for difficulty getting pregnant Low Sperm Count Value */
	@FindBy (xpath = "//span[contains(text(),'Low sperm count')]")
	public WebElement diagnosisPregnancyDifficultyLowSpermCount;
	
	/**================================================================================*/
	
	/** The age when the Proband was prescribed hormones */
	@FindBy (xpath = "//input[@type='text']")
	public WebElement ageProbandWasPrescribedHormonesTextBox;
	
	/**================================================================================*/
	
	/** Number of Weeks the Proband was on the Prescribed Hormones */
	@FindBy (xpath = "//span[contains(text(),'Time (in weeks)')]")
	public WebElement weeksProbandTookPrescribedHormones;
	
	/** Number of Weeks the Proband was on the Prescribed Hormones text box */
	@FindBy (xpath = "(//input[@type='text'])[1]")
	public WebElement weeksProbandTookPrescribedHormonesTextBox;
	
	/**================================================================================*/
	
	/** You are almost done text from page */
	@FindBy (xpath = "//div[contains(text(),'You are almost done!')]")
	public WebElement youAreAlmostDoneText;
	
	/** Number of Weeks the Proband was on the Prescribed Hormones text box */
	@FindBy (xpath = "(//input[@type='text'])[1]")
	public WebElement weeksProbandTookPrescribedHormonesadfarvsvasrfTextBox;
	
	/**================================================================================*/
	
	/** This is the end of the survey screen */
	@FindBy (xpath = "//div[@id='EndOfSurvey']")
	public WebElement endOfSurveyText;
	
}



