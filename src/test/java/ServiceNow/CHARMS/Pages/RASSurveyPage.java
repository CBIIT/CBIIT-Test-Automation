package ServiceNow.CHARMS.Pages;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;
public class RASSurveyPage {

	
	/*
	 * ----------------- BEGINNING OF COMMON ELEMENTS FOR ALL PAGE -----------------
	 */

	// SAME XPATH FOR ALL IFRAMES
	@FindBy(xpath = "//iframe[@id='preview-view']")
	public WebElement surveyIFrame;
		
	//NEXT BUTTON SAME XPATH FOR ALL NEXT BUTTONS
	@FindBy(xpath = "//input[@title='→']")
	public WebElement surveyNextButton;
		
	//YES (PLEASE SPECIFY) TEXT BOX FOR ALL PAGES
	@FindBy(xpath = "//input[contains(@title,'Yes (please specify)')]")
	public WebElement yesPleaseSpecifyTextBox;
		
	//OTHER (PLEASE SPECIFY) TEXT BOX
	@FindBy(xpath = "//input[contains(@title,'Other (please specify)')]")
	public WebElement otherPleaseSpecifyTextBox;
		
	//YES RADIO BUTTON FOR ALL PAGES
	@FindBy (xpath="//span[contains(text(),'Yes')]")
	public WebElement yesRadioButton;
	
	//PLUS SIGN BUTTON	FOR ALL PAGES
	@FindBy(xpath = "//input[@name='+']")
	public WebElement plusSignButton ;
	
	//XPATH FOR ALL CHECKBOX PAGES
	@FindBy(xpath= "//span[contains(@class,'LabelWrapper')]")
	public List<WebElement> xpathForAllCheckBoxes;
	
	// NIH NATIONAL CANCER INSTITUTE BANNER IMAGE
	@FindBy(xpath = "//form[@data-testid='page-ready']//div//div//div//div//div//img")
	public WebElement nihBannerImage;
	
	// DETAILS LIST DATE(MM/YY) HEADER TEXT
	@FindBy(xpath = "//thead//tr[4]//th[1]")
	public WebElement dateHeaderText;
	
	// DETAILS LIST DATE(MM/YY) TEXT BOX ROW 2
	@FindBy(xpath = "//tbody/tr[1]/td[3]/input[1]")
	public WebElement dateRow1TextBox;
	
	// DETAILS LIST DATE(MM/YY) TEXT BOX ROW 2
	@FindBy(xpath = "//tbody/tr[2]/td[3]/input[1]")
	public WebElement dateRow2TextBox;
	
	// DETAILS LIST DATE(MM/YY) TEXT BOX ROW 3
	@FindBy(xpath = "//tbody/tr[3]/td[3]/input[1]")
	public WebElement dateRow3TextBox;

	
	/*
	 * ----------------- END OF COMMON ELEMENTS FOR ALL PAGE -----------------
	 */
	
	/*
	 * ----------------- BEGINNING OF START RASSURVEY LOGIN PAGE PAGE -----------------
	 */
	

	// MOBILE VIEW SLIDER FOR PREVIEW
	@FindBy (xpath= "//span[contains(@class,'mobile-view-slider')]")
	public WebElement mobileViewSlider;
	
	// LOGIN EMAIL
	@FindBy (xpath= "//input[@name='QR~Authentication-FL_27~0~TEXT']")
	public WebElement cHARMSEmailLogIn;
	
	// LOGIN PASSWORD
	@FindBy (xpath="//input[@name='QR~Authentication-FL_27~1~TEXT']")
	public WebElement cHARMSpasswordToLogIn;
	
	/*
	 *  ----------------- END OF RASSURVEY LOGIN PAGE ----------------- 
	 */
	
	/*
	 * ----------------- BEGINNING OF TO CONFIRM, ARE YOU COMPLETING THIS FORM FOR YOURSELF OR FOR SOMEONE ELSE? PAGE -----------------
	 */

	//I AM COMPLETING THIS FORM FOR MYSELF RADIO BUTTON
	@FindBy (xpath= "//span[contains(text(),'I am completing this form for myself')]")
	public WebElement completingFormForSelfRadioButton;
	
	/*
	 * ----------------- END OF TO CONFIRM, ARE YOU COMPLETING THIS FORM FOR YOURSELF OR FOR SOMEONE ELSE? PAGE -----------------
	 */

	/*
	 * ----------------- BEGINNING OF PLEASE PROVIDE ANY ADDITIONAL INFORMATION ABOUT THE AUTHORS, YEAR OF PUBLICATION OR PUBMED ID (PMID), IF AVAILABLE PAGE -----------------
	 */
	
	@FindBy(xpath="//textarea[@name='QR~QID59~TEXT']")
	public WebElement pleaseProvideAdditionalInfoIfAvailableTextbox;
	
	/*
	 * ----------------- END OF PLEASE PROVIDE ANY ADDITIONAL INFORMATION ABOUT THE AUTHORS, YEAR OF PUBLICATION OR PUBMED ID (PMID), IF AVAILABLE PAGE -----------------
	 */
	
	/*
	 *  ----------------- BEGINNING OF PLEASE COMPLETE THE TABLE BELOW REGARDING YOUR BIOLOGICAL PARENTS. PAGE ----------------- 
	 */
	
	// BIOLOGICAL MOTHER TEXTBOX
	@FindBy(xpath="//input[@name='QR~QID318#1~1~1~TEXT']")
	public WebElement bioMothersBirthCityTextBox;
	
	// BIOLOGICAL FATHER TEXTBOX
	@FindBy(xpath="//input[@name='QR~QID318#1~2~1~TEXT']")
	public WebElement bioFatherBirthCityTextBox;
	
	//MOTHER'S AGE WHEN BORN DROPDOWN
	@FindBy(xpath="//select[@name='QR~QID318#3~1']")
	public WebElement bioMothersAgeWhenBornDropDown;
	
	//FATHER'S AGE WHEN BORN DROPDOWN
	@FindBy (xpath="//select[@name='QR~QID318#3~2']")
	public WebElement bioFathersAgeWhenBornDropDown;
	
	/*
	 *  ----------------- END OF PLEASE COMPLETE THE TABLE BELOW REGARDING YOUR BIOLOGICAL PARENTS. PAGE ----------------- 
	 */
	
	/*
	 *  ----------------- BEGINNING OF WERE YOU DIAGNOSED WITH ANY OF THE FOLLOWING CONDITIONS DURING YOUR MOTHER'S PREGNANCY? 
	 *THESE ARE CONDITIONS OFTEN DETECTED ON ROUTINE FETAL ULTRASOUND.  PLEASE SELECT ALL THAT APPLY. PAGE ----------------- 
	 */
	
	// OTHER TEXT BOX
	@FindBy (xpath="//input[contains(@title,'Other')]")
	public WebElement otherConditionTextBox;
	
	/*
	 *  ----------------- END OF WERE YOU DIAGNOSED WITH ANY OF THE FOLLOWING CONDITIONS DURING YOUR MOTHER'S PREGNANCY? 
	 *THESE ARE CONDITIONS OFTEN DETECTED ON ROUTINE FETAL ULTRASOUND.  PLEASE SELECT ALL THAT APPLY. PAGE ----------------- 
	 */
	
	/*
	 *  ----------------- BEGINNING OF PLEASE INDICATE THE RESULTS OF THE PRENATAL TESTS ADMINISTERED TO 
	 * YOUR BIOLOGICAL MOTHER DURING HER PREGNANCY WITH YOU.  PAGE -----------------
	 */
		
	//SERUM AFP (ALPHA-FETOPROTEIN) NORMAL RADIO BUTTON
	@FindBy (xpath="//label[@for='QR~QID41#1~1~1']")
	public WebElement serumSFRadioButton;
	
	//ULTRASOUND NORMAL RADIO BUTTON
	@FindBy (xpath="//label[@for='QR~QID41#1~2~1']")
	public WebElement ultrasoundRadioButton;
	
	//AMNIOCENTESIS NORMAL RADIO BUTTON
	@FindBy (xpath="//label[@for='QR~QID41#1~3~1']")
	public WebElement amniocentesisRadioButton;
	
	//CHORIONIC VILLUS SAMPLING NORMAL RADIO BUTTON
	@FindBy (xpath="//label[@for='QR~QID41#1~4~1']")
	public WebElement chronicVillaSamplingRadioButton;
	
	//FETAL BLOOD SAMPLING NORMAL RADIO BUTTON
	@FindBy (xpath="//label[@for='QR~QID41#1~5~1']")
	public WebElement fetalBloodSamplingRadioButton;
	
	//STRESS TEST NORMAL RADIO BUTTON
	@FindBy (xpath="//label[@for='QR~QID41#1~6~1']")
	public WebElement stressTestRadioButton;
	
	//X-RAYS NORMAL RADIO BUTTON
	@FindBy (xpath="//label[@for='QR~QID41#1~7~1']")
	public WebElement xRayRadioButton;
	
	//OTHER (PLEASE SPECIFY) NORMAL RADIO BUTTON
	@FindBy (xpath="//label[@for='QR~QID41#1~8~1']")
	public WebElement otherRadioButton;
	
	//OTHER (PLEASE SPECIFY) TEXT BOX
	@FindBy (xpath="//input[@name='QR~QID41~8~TEXT']")
	public WebElement otherTestTextBox;
	
	/*
	 *  ----------------- END OF PLEASE INDICATE THE RESULTS OF THE PRENATAL TESTS ADMINISTERED TO 
	 * YOUR BIOLOGICAL MOTHER DURING HER PREGNANCY WITH YOU.  PAGE -----------------
	 */
	
	/*
	 * ----------------- BEGINNING OF WAS YOUR BIOLOGICAL MOTHER DIAGNOSED WITH ANY OF THE FOLLOWING 
	 * CONDITIONS PRIOR TO OR DURING HER PREGNANCY WITH YOU? PAGE -----------------
	 */
	
	// HYPERTENSION (HIGH BLOOD PRESSURE PRIOR TO PREGNANCY)  TEXT BOX
	@FindBy (xpath="//span[contains(text(),'Hypertension (high blood pressure prior to pregnan')]")
	public WebElement hypertensionTextBox;
	
	//INFECTION (PLEASE SPECIFY) TEXT BOX
		@FindBy (xpath="//input[contains(@title,'Infection (please specify)')]")
		public WebElement typeOfInfectionTextBox;
		
		//RASH (PLEASE SPECIFY)TEXT BOX
		@FindBy (xpath="//input[contains(@title,'Rash (please specify)')]")
		public WebElement rashTextBox;
		
		// OTHER COMPLICATIONS (PLEASE SPECIFY) TEXT BOX
		@FindBy (xpath="//input[@title='Other complications (please specify)']")
		public WebElement otherComplicationsTextBox;
		
	/*
	 * ----------------- END OF WAS YOUR BIOLOGICAL MOTHER DIAGNOSED WITH ANY OF THE FOLLOWING 
	 * CONDITIONS PRIOR TO OR DURING HER PREGNANCY WITH YOU? PAGE -----------------
	 */
	
	/*
     * ----------------- BEGINNING OF PLEASE SELECT ALL MEDICATIONS YOUR MOTHER TOOK DURING HER PREGNANCY WITH YOU. PAGE -----------------
     */
	
	//HORMONES TEXT BOX
	@FindBy (xpath="//span[contains(text(),'Hormones (e.g. DES, progesterone)')]")
	public WebElement hormonesCheckBox;
	
	//HERBAL SUPPLEMENTS (PLEASE SPECIFY) TEXT BOX
	@FindBy (xpath="//input[@title='Herbal supplements (please specify)']")
	public WebElement herbalSupplementTextBox;
		
	//OTHER MEDICATION (PLEASE SPECIFY) TEXT BOX
	@FindBy (xpath="//input[@name='QR~QID47~15~TEXT']")
	public WebElement otherMedicationTextBox;
	
	//OTHER MEDICATION (PLEASE SPECIFY) SECOND TEXT BOX
	@FindBy (xpath="//input[@name='QR~QID47~16~TEXT']")
	public WebElement otherMedicationTextBox2;
	
	
	/*
     * ----------------- END OF PLEASE SELECT ALL MEDICATIONS YOUR MOTHER TOOK DURING HER PREGNANCY WITH YOU. PAGE -----------------
     */
	
	/* ----------------- BEGINNING OF PLEASE PROVIDE DETAILS ON THE NAME OF THE MEDICATION TAKEN, REASON IT WAS TAKEN AND APPROXIMATE LENGTH OF TIME IT WAS TAKEN. 
	 *IF YOU ARE UNSURE OF THE NAME OF OR REASON FOR THE MEDICATION, WRITE 'UNSURE' OR PLACE AN 'X' IN THE TEXT BOX. PAGE -----------------
     */
	
	// ANTIBIOTICS NAME OF MEDICATION TEXT BOX
	@FindBy (xpath="//input[@name='QR~QID62#1~x1~1~TEXT']")
	public WebElement antibioticNameTextBox;
	
	// ANTIBIOTICS REASON MEDICATION PRESCRIBED TEXT BOX
	@FindBy (xpath="//input[@name='QR~QID62#2~x1~1~TEXT']")
	public WebElement antibioticReasonTextBox;
	
	// ANTIBIOTICS LENGTH OF TIME MEDICATION WAS TAKEN (DURING PREGNANCY) DROP DOWN
	@FindBy (xpath="(//select[contains(@name,'QR~QID62#3~x1')])[1]")
	public WebElement antibioticLenghtOfTimeMedicationWasTakenDropDown;

	// VTAMINS NAME OF MEDICATION TEXT BOX
	@FindBy (xpath="//input[@name='QR~QID62#1~x2~1~TEXT']")
	public WebElement vitaminNameTextBox;
	
	// VITAMINS REASON MEDICATION PRESCRIBED TEXT BOX
	@FindBy (xpath="//input[@name='QR~QID62#2~x2~1~TEXT']")
	public WebElement vitaminReasonTextBox;
	
	// VITAMINS LENGTH OF TIME MEDICATION WAS TAKEN (DURING PREGNANCY) DROP DOWN
	@FindBy (xpath="(//select[contains(@name,'QR~QID62#3~x2')])[1]")
	public WebElement vitaminLenghtOfTimeMedicationWasTakenDropDown;
	
	// ANTIHYPERTENSIVES (FOR HIGH BLOOD PRESSURE) NAME OF MEDICATION TEXT BOX
	@FindBy (xpath="//input[@name='QR~QID62#1~x3~1~TEXT']")
	public WebElement antihypertensivesNameTextBox;
	
	// ANTIHYPERTENSIVES (FOR HIGH BLOOD PRESSURE) REASON MEDICATION PRESCRIBED TEXT BOX
	@FindBy (xpath="//input[@name='QR~QID62#2~x3~1~TEXT']")
	public WebElement antihypertensiveReasonTextBox;
	
	// ANTIHYPERTENSIVES (FOR HIGH BLOOD PRESSURE) LENGTH OF TIME MEDICATION WAS TAKEN (DURING PREGNANCY) DROP DOWN
	@FindBy (xpath="//tbody/tr[3]/td[9]/select[1]")
	public WebElement antihypertensivesLenghtOfTimeMedicationWasTakenDropDown;
	
	// MEDICATION FOR HIGH BLOOD GLUCOSE (E.G. INSULIN) NAME OF MEDICATION TEXT BOX
	@FindBy (xpath="//input[@name='QR~QID62#1~x4~1~TEXT']")
	public WebElement insulinMedicationNameTextBox;
	
	// MEDICATION FOR HIGH BLOOD GLUCOSE (E.G. INSULIN) REASON MEDICATION PRESCRIBED TEXT BOX
	@FindBy (xpath="//input[@name='QR~QID62#2~x4~1~TEXT']")
	public WebElement insulinReasonTextBox;
	
	// MEDICATION FOR HIGH BLOOD GLUCOSE (E.G. INSULIN) LENGTH OF TIME MEDICATION WAS TAKEN (DURING PREGNANCY) DROP DOWN
	@FindBy (xpath="(//select[contains(@name,'QR~QID62#3~x4')])[1]")
	public WebElement insulinLenghtOfTimeMedicationWasTakenDropDown;
	
	// ANTIEMETICS (FOR NAUSEA) NAME OF MEDICATION TEXT BOX
	@FindBy (xpath="//input[@name='QR~QID62#1~x5~1~TEXT']")
	public WebElement antiemeticsNameTextBox;
	
	// ANTIEMETICS (FOR NAUSEA) REASON MEDICATION PRESCRIBED TEXT BOX
	@FindBy (xpath="//input[@name='QR~QID62#2~x5~1~TEXT']")
	public WebElement antiemeticsReasonTextBox;
	
	// ANTIEMETICS (FOR NAUSEA) LENGTH OF TIME MEDICATION WAS TAKEN (DURING PREGNANCY) DROP DOWN
	@FindBy (xpath="(//select[contains(@name,'QR~QID62#3~x5')])[1]")
	public WebElement antiemeticsLenghtOfTimeMedicationWasTakenDropDown;
	
	// HORMONES (E.G. DES, PROGESTERONE) NAME OF MEDICATION TEXT BOX
	@FindBy (xpath="//input[@name='QR~QID62#1~x6~1~TEXT']")
	public WebElement hormoneNameTextBox;
	
	// HORMONES (E.G. DES, PROGESTERONE) REASON MEDICATION PRESCRIBED TEXT BOX
	@FindBy (xpath="//input[@name='QR~QID62#2~x6~1~TEXT']")
	public WebElement hormoneReasonTextBox;
	
	// HORMONES (E.G. DES, PROGESTERONE) LENGTH OF TIME MEDICATION WAS TAKEN (DURING PREGNANCY) DROP DOWN
	@FindBy (xpath="(//select[contains(@name,'QR~QID62#3~x6')])[1]")
	public WebElement hormonesLenghtOfTimeMedicationWasTakenDropDown;
	
	// ANTI-DEPRESSANTS NAME OF MEDICATION TEXT BOX
	@FindBy (xpath="//input[@name='QR~QID62#1~x7~1~TEXT']")
	public WebElement antidepressantNameTextBox;
	
	// ANTI-DEPRESSANTS REASON MEDICATION PRESCRIBED TEXT BOX
	@FindBy (xpath="//input[@name='QR~QID62#2~x7~1~TEXT']")
	public WebElement antidepressantReasonTextBox;
	
	// ANTI-DEPRESSANTS LENGTH OF TIME MEDICATION WAS TAKEN (DURING PREGNANCY) DROP DOWN
	@FindBy (xpath="(//select)[7]")
	public WebElement antiDepressantsLenghtOfTimeMedicationWasTakenDropDown;
	
	// DIURETICS NAME OF MEDICATION TEXT BOX
	@FindBy (xpath="//input[@name='QR~QID62#1~x8~1~TEXT']")
	public WebElement diureticNameTextBox;
	
	// DIURETICS REASON MEDICATION PRESCRIBED TEXT BOX
	@FindBy (xpath="//input[@name='QR~QID62#2~x8~1~TEXT']")
	public WebElement diureticReasonTextBox;
	
	// DIURETICS LENGTH OF TIME MEDICATION WAS TAKEN (DURING PREGNANCY) DROP DOWN
	@FindBy (xpath="(//select[contains(@name,'QR~QID62#3~x8')])[1]")
	public WebElement diureticsLenghtOfTimeMedicationWasTakenDropDown;
	
	// PAIN RELIEVERS NAME OF MEDICATION TEXT BOX
	@FindBy (xpath="//input[@name='QR~QID62#1~x9~1~TEXT']")
	public WebElement painReliverNameTextBox;
	
	// PAIN RELIEVERS REASON MEDICATION PRESCRIBED TEXT BOX
	@FindBy (xpath="//input[@name='QR~QID62#2~x9~1~TEXT']")
	public WebElement painReliverReasonTextBox;
	
	// PAIN RELIEVERS LENGTH OF TIME MEDICATION WAS TAKEN (DURING PREGNANCY) DROP DOWN
	@FindBy (xpath="(//select[contains(@name,'QR~QID62#3~x9')])[1]")
	public WebElement painRelieversLenghtOfTimeMedicationWasTakenDropDown;
	
	// MEDICATIONS FOR PRE-TERM LABOR (E.G. TERBUTALINE, MAGNESIUM SULFATE) NAME OF MEDICATION TEXT BOX
	@FindBy (xpath="//input[@name='QR~QID62#1~x10~1~TEXT']")
	public WebElement pretermLaborMedicationNameTextBox;
	
	// MEDICATIONS FOR PRE-TERM LABOR (E.G. TERBUTALINE, MAGNESIUM SULFATE) REASON MEDICATION PRESCRIBED TEXT BOX
	@FindBy (xpath="//input[@name='QR~QID62#2~x10~1~TEXT']")
	public WebElement pretermLaborReasonTextBox;
	
	// MEDICATIONS FOR PRE-TERM LABOR (E.G. TERBUTALINE, MAGNESIUM SULFATE) LENGTH OF TIME MEDICATION WAS TAKEN (DURING PREGNANCY) DROP DOWN
	@FindBy (xpath="(//select[contains(@name,'QR~QID62#3~x10')])[1]")
	public WebElement medicationsForPretermLaborLenghtOfTimeMedicationWasTakenDropDown;
	
	// THYROID MEDICATIONS NAME OF MEDICATION TEXT BOX
	@FindBy (xpath="//input[@name='QR~QID62#1~x11~1~TEXT']")
	public WebElement thyroidMedicationNameTextBox;
	
	// THYROID MEDICATIONS REASON MEDICATION PRESCRIBED TEXT BOX
	@FindBy (xpath="//input[@name='QR~QID62#2~x11~1~TEXT']")
	public WebElement thyroidReasonTextBox;
	
	// THYROID MEDICATIONS LENGTH OF TIME MEDICATION WAS TAKEN (DURING PREGNANCY) DROP DOWN
	@FindBy (xpath="(//select[contains(@name,'QR~QID62#3~x11')])[1]")
	public WebElement thyroidMedicationsLenghtOfTimeMedicationWasTakenDropDown;
	
	// ANTI-SEIZURE MEDICATIONS NAME OF MEDICATION TEXT BOX
	@FindBy (xpath="//input[@name='QR~QID62#1~x12~1~TEXT']")
	public WebElement antiSeizureNameTextBox;
	
	// ANTI-SEIZURE MEDICATIONS REASON MEDICATION PRESCRIBED TEXT BOX
	@FindBy (xpath="//input[@name='QR~QID62#2~x12~1~TEXT']")
	public WebElement antiSeizureReasonTextBox;
	
	// ANTI-SEIZURE MEDICATIONS LENGTH OF TIME MEDICATION WAS TAKEN (DURING PREGNANCY) DROP DOWN
	@FindBy (xpath="(//select[contains(@name,'QR~QID62#3~x12')])[1]")
	public WebElement antiSeizureMedicationsLenghtOfTimeMedicationWasTakenDropDown;
	
	// OREGANO NAME OF MEDICATION TEXT BOX
	@FindBy (xpath="//input[@name='QR~QID62#1~x13~1~TEXT']")
	public WebElement oreganoNameTextBox;
	
	// OREGANO REASON MEDICATION PRESCRIBED TEXT BOX
	@FindBy (xpath="//input[@name='QR~QID62#2~x13~1~TEXT']")
	public WebElement oreganoReasonTextBox;
	
	// OREGANO LENGTH OF TIME MEDICATION WAS TAKEN (DURING PREGNANCY) DROP DOWN
	@FindBy (xpath="(//select[contains(@name,'QR~QID62#3~x13')])[1]")
	public WebElement oreganoLenghtOfTimeMedicationWasTakenDropDown;
	
	// TOTAL PARENTAL NUTRITION (TPN) NAME OF MEDICATION TEXT BOX
	@FindBy (xpath="//input[@name='QR~QID62#1~x14~1~TEXT']")
	public WebElement tpnNameTextBox;
	
	// TOTAL PARENTAL NUTRITION (TPN) REASON MEDICATION PRESCRIBED TEXT BOX
	@FindBy (xpath="//input[@name='QR~QID62#2~x14~1~TEXT']")
	public WebElement tpnReasonTextBox;
	
	// TOTAL PARENTAL NUTRITION (TPN) LENGTH OF TIME MEDICATION WAS TAKEN (DURING PREGNANCY) DROP DOWN
	@FindBy (xpath="(//select[contains(@name,'QR~QID62#3~x14')])[1]")
	public WebElement tpnLenghtOfTimeMedicationWasTakenDropDown;
	
	// TUMERIC NAME OF MEDICATION TEXT BOX
	@FindBy (xpath="//input[@name='QR~QID62#1~x15~1~TEXT']")
	public WebElement turmericNameTextBox;
	
	// TUMERIC REASON MEDICATION PRESCRIBED TEXT BOX
	@FindBy (xpath="//input[@name='QR~QID62#2~x15~1~TEXT']")
	public WebElement turmericReasonTextBox;
	
	// TUMERIC LENGTH OF TIME MEDICATION WAS TAKEN (DURING PREGNANCY) DROP DOWN
	@FindBy (xpath="(//select[contains(@name,'QR~QID62#3~x15')])[1]")
	public WebElement tumericLenghtOfTimeMedicationWasTakenDropDown;
	
	// MELATONIN NAME OF MEDICATION TEXT BOX
	@FindBy (xpath="//input[@name='QR~QID62#1~x16~1~TEXT']")
	public WebElement melatoninNameTextBox;
	
	// MELATONIN REASON MEDICATION PRESCRIBED TEXT BOX
	@FindBy (xpath="//input[@name='QR~QID62#2~x16~1~TEXT']")
	public WebElement melatoninReasonTextBox;
	
	// MELATONIN LENGTH OF TIME MEDICATION WAS TAKEN (DURING PREGNANCY) DROP DOWN
	@FindBy (xpath="(//select[contains(@name,'QR~QID62#3~x16')])[1]")
	public WebElement melatoninLenghtOfTimeMedicationWasTakenDropDown;
	
	/* ----------------- END OF PLEASE PROVIDE DETAILS ON THE NAME OF THE MEDICATION TAKEN, REASON IT WAS TAKEN AND APPROXIMATE LENGTH OF TIME IT WAS TAKEN. 
	 *IF YOU ARE UNSURE OF THE NAME OF OR REASON FOR THE MEDICATION, WRITE 'UNSURE' OR PLACE AN 'X' IN THE TEXT BOX. PAGE -----------------
     */
		
	/*
	 * --------------- BEGINNING OF PLEASE DESCRIBE YOUR BIOLOGICAL PARENTS' OCCUPATION(S) DURING YOUR MOTHER'S PREGNANCY WITH YOU?  PLEASE LIST ALL OF THE OCCUPATIONS DURING THE PREGNANCY. PAGE ---------------
	 */
		
	//TYPE BLOLOGICAL MOTHER TEXT BOX WEBELEMENT
	@FindBy (xpath="(//input[contains(@name,'QR~QID73#1~4~1~TEXT')])[1]")
	public WebElement biologicalMotherOccupationTextBox;
		
	//TYPE BIOLOGICAL FATHER TEXT BOX WEBELEMENT
	@FindBy (xpath="(//input[@name='QR~QID73#1~5~1~TEXT'])[1]")
	public WebElement biologicalFatherOccupationTextBox;
		
	/*
	 * --------------- END OF PLEASE DESCRIBE YOUR BIOLOGICAL PARENTS' OCCUPATION(S) DURING YOUR MOTHER'S PREGNANCY WITH YOU?  PLEASE LIST ALL OF THE OCCUPATIONS DURING THE PREGNANCY. PAGE ---------------
	 */
		
	/*
	 * --------------- BEGINNING OF WHAT IS THE HEIGHT OF YOUR BIOLOGICAL MOTHER AND FATHER?  PLEASE COMPLETE THE TABLE BELOW PAGE ---------------
	 */
		
	//ADULT HEIGHT BIOLOGICAL MOTHER TEXT BOX 
	@FindBy (xpath="(//input[@name='QR~QID75#3~1~1~TEXT'])[1]")
	public WebElement biologicalMotherHeightTextBox;
		
	//ADULT HEIGHT BIOLOGICAL FATHER TEXT BOX 
	@FindBy (xpath="(//input[@name='QR~QID75#3~2~1~TEXT'])[1]")
	public WebElement biologicalFatherHeightTextBox;
	
	//UNIT OF MEASURE BLOLOGICAL MOTHER CENTIMETERS RADIO BUTTON 
	@FindBy (xpath="(//label[@for='QR~QID75#1~1~3'])[1]")
	public WebElement unitOfMeasureMotherRadioButton;
		
	//UNIT OF MEASURE  BLOLOGICAL FATHER CENTIMETERS RADIO BUTTON 
	@FindBy (xpath="(//label[@for='QR~QID75#1~2~3'])[1]")
	public WebElement unitOfMeasureFatherRadioButton;
		
	/*
	 * --------------- END OF WHAT IS THE HEIGHT OF YOUR BIOLOGICAL MOTHER AND FATHER?  PLEASE COMPLETE THE TABLE BELOW  PAGE ---------------
	 */
	
	/*
	 * --------------- BEGINNING OF WHAT IS THE NAME OF THE ENDOCRINOLOGIST WHO COMPLETED YOUR EXAMINATION? PAGE ---------------
	 */
		
	//TYPE OF DOCTOR/MEDICAL PROVIDER NAME TEXT BOX 
	@FindBy (xpath="(//input[contains(@aria-labelledby,'QR~QID371~1~label')])[1]")
	public WebElement doctorMedicalProviderNameTextBox;
		
	//TYPE OF LOCATION (CITY,STATE,COUNTRY) TEXT BOX 
	@FindBy (xpath="(//input[contains(@aria-labelledby,'QR~QID371~2~label')])[1]")
	public WebElement locatioCityStateCountryTextBox;
		
	//TYPE OF HOSPITAL OR HEALTH SYSTEM AFFILIATION TEXT BOX 
	@FindBy (xpath="(//input[contains(@aria-labelledby,'QR~QID371~3~label')])[1]")
	public WebElement hospitalOrHealthSystemAffiliationTextBox;
			
	/*
	 * --------------- END OF WHAT IS THE NAME OF THE ENDOCRINOLOGIST WHO COMPLETED YOUR EXAMINATION? PAGE ---------------
	 */
		
	/*
	 * --------------- BEGINNING OF WHAT WAS YOUR HEIGHT BEFORE STARTING GROWTH HORMONE?  PAGE ---------------
	 */
	
	//TYPE OF WHAT WAS YOUR HEIGHT BEFORE STARTING GROWTH HORMONE? RADIO BUTTON 
	@FindBy (xpath="(//span[contains(text(),'Height (please specify units such as feet, inches ')])[1]")
	public WebElement whatWasYourHeightBeforeStartingGrowthHormoneRadioButton;
		
	// HEIGHT (PLEASE SPECIFY UNITS SUCH AS FEET, INCHES OR CENTIMETERS) TEXT BOX
	@FindBy (xpath = "//input[@title='Height (please specify units such as feet, inches or centimeters)']")
	public WebElement heightTextBox;
		
	/*
	 * --------------- END OF WHAT WAS YOUR HEIGHT BEFORE STARTING GROWTH HORMONE? PAGE ---------------
	 */
		
	/*
	 * --------------- BEGINNING OF HOW MANY TIMES HAVE YOU RECEIVED GROWTH HORMONE TREATMENT? PAGE ---------------
	 */
		
	//TYPE OF HOW MANY TIMES HAVE YOU RECEIVED GROWTH HORMONE TREATMENT DROP DOWN
	@FindBy (xpath="//select[@data-runtime-value='runtime.Selected']")
	public WebElement howManyTimesHaveYouReceivedGrowthHormoneTreatmentDropDown;
		
	/*
	 * --------------- END OF HOW MANY TIMES HAVE YOU RECEIVED GROWTH HORMONE TREATMENT? PAGE ---------------
	 */
		
	/*
	 * --------------- BEGINNING OF PLEASE PROVIDE THE DETAILS OF GROWTH HORMONE REPLACEMENT BY COMPLETING THE TABLE BELOW.  PAGE ---------------
	 */
		
	//TYPE OF GROWTH HORMONE TREATMENT#1 AGE STARTED TEXT BOX
	@FindBy (xpath="(//input[contains(@type,'text')])[1]")
	public WebElement growthHormoneTreatment1AgeStartedTextBox;
		
	//TYPE OF GROWTH HORMONE TREATMENT#1 AGE STOPPED TEXT BOX
	@FindBy (xpath="(//input[contains(@type,'text')])[2]")
	public WebElement growthHormoneTreatment1AgeStoppedTextBox;
				
	//TYPE OF GROWTH HORMONE TREATMENT#1 ARE YOU STILL ON GROWTH HORMONE? NO RADIO BUTTON
	@FindBy (xpath="//label[contains(@for,'QR~QID80#3~1~2')]")
	public WebElement growthHormoneTreatment1AreYouStillOnGrowthHormoneNoRadioButton;
		
	//TYPE OF GROWTH HORMONE TREATMENT#2 AGE STARTED
	@FindBy (xpath="(//input[contains(@type,'text')])[5]")
	public WebElement growthHormoneTreatment2AgeStartedTextBox;
		
	//TYPE OF GROWTH HORMONE TREATMENT#2 AGE STOPPED 
	@FindBy (xpath="(//input[contains(@type,'text')])[6]")
	public WebElement growthHormoneTreatment2AgeStoppedTextBox;
		
	//TYPE OF GROWTH HORMONE TREATMENT#2 ARE YOU STILL ON GROWTH HORMONE? NO RADIO BUTTON
	@FindBy (xpath="//label[contains(@for,'QR~QID80#3~2~2')]")
	public WebElement growthHormoneTreatment2AreYouStillOnGrowthHormoneNoRadioButton;	
		
	//TYPE OF GROWTH HORMONE TREATMENT#3 AGE STARTED
	@FindBy (xpath="(//input[contains(@type,'text')])[9]")
	public WebElement growthHormoneTreatment3AgeStartedTextBox;
		
	//TYPE OF GROWTH HORMONE TREATMENT#3 AGE STOPPED
	@FindBy (xpath="(//input[contains(@type,'text')])[10]")
	public WebElement growthHormoneTreatment3AgeStoppedTextBox;
		
	//TYPE OF GROWTH HORMONE TREATMENT#3 ARE YOU STILL ON GROWTH HORMONE? NO RADIO BUTTON
	@FindBy (xpath="//label[contains(@for,'QR~QID80#3~3~2')]")
	public WebElement growthHormoneTreatment3AreYouStillOnGrowthHormoneNoRadioButton;			

	/*
	 * --------------- END OF PLEASE PROVIDE THE DETAILS OF GROWTH HORMONE REPLACEMENT BY COMPLETING THE TABLE BELOW.  PAGE ---------------
	 */
		
	/*
	 * --------------- BEGINNING OF AT WHAT AGE WERE YOU ABLE TO SIT WITHOUT SUPPORT? PAGE ---------------
	 */
		
	//TYPE OF AT WHAT AGE WERE YOU ABLE TO SIT WITHOUT SUPPORT? 12-18 MONTHS RADIO BUTTON 
	@FindBy (xpath="(//label[@for='QR~QID82~3'])[2]")
	public WebElement atWhatAgeWereYouAbleToSitWithoutSupportCheckRadioButton;
		
	/*
	 * --------------- END OF AT WHAT AGE WERE YOU ABLE TO SIT WITHOUT SUPPORT? PAGE ---------------
	 */
		
	/*
	 * --------------- BEGINNING OF AT WHAT AGE WERE YOU ABLE TO WALK WITHOUT SUPPORT?  PAGE ---------------
	 */
		

	//TYPE OF AT WHAT AGE WERE YOU ABLE TO WALK WITHOUT SUPPORT? 12 -18 MONTHS RADIO BUTTON 
	@FindBy (xpath="(//label[@for='QR~QID84~3'])[2]")
	public WebElement atWhatAgeWereYouAbleToWalkWithoutSupportCheckRadioButton;
		
	/*
	 * --------------- END OF AT WHAT AGE WERE YOU ABLE TO WALK WITHOUT SUPPORT? PAGE ---------------
	 */
	
	/*
	 * ----------------- BEGINNING OF AT WHAT AGE WERE YOU ABLE TO USE SIMPLE TWO-WORD PHRASES? PAGE -----------------
	 */

	// "24-36 MONTHS" RADIO BUTTON
	@FindBy(xpath = "(//label[contains(@for,'QR~QID87~2')])[2]")
	public WebElement twentyFourToThirthySixMonthsRadioButton;

	/*
	 * ----------------- END OF WHAT AGE WERE YOU ABLE TO USE SIMPLE TWO-WORD PHRASES? PAGE -----------------
	 */

	/*
	 * ----------------- BEGINNING OF HOW WOULD YOU DESCRIBE YOUR CURRENT SPEECH CAPABILITIES? PAGE -----------------
	 */

	// "SIMPLE SPEECH COMPARED TO PEOPLE OF THE SAME AGE" RADIO BUTTON
	@FindBy(xpath = "(//span[contains(text(),'Simple speech compared to people of the same age')])[1]")
	public WebElement simpleSpeechComparedToPeopleOfTheSameAgeRadioButton;

	/*
	 * ----------------- END OF HOW WOULD YOU DESCRIBE YOUR CURRENT SPEECH CAPABILITIES? PAGE -----------------
	 */

	/*
	 * ----------------- BEGINNING OF BETWEEN THE AGES OF 3 AND 6 YEARS OLD (PRESCHOOL YEARS), WERE YOU EVER DIAGNOSED WITH ISSUES OF COGNITIVE
	 * DEVELOPMENT? COGNITIVE DEVELOPMENT CAN INCLUDE DIFFICULTIES IN LEARNING, UNDERSTANDING, AND PROCESSING INFORMATION OR MAKING DECISIONS. PAGE -----------------
	 */

	// “SEVERE COGNITIVE DELAY" RADIO BUTTON
	@FindBy(xpath = "(//span[contains(text(),'Severe cognitive delay')])[1]")
	public WebElement severeCognitiveDelayRadioButton;

	/*
	 * ----------------- END OF BETWEEN THE AGES OF 3 AND 6 YEARS OLD (PRESCHOOL YEARS), WERE YOU EVER DIAGNOSED WITH ISSUES OF COGNITIVE DEVELOPMENT?
	 * COGNITIVE DEVELOPMENT CAN INCLUDE DIFFICULTIES IN LEARNING, UNDERSTANDING, AND PROCESSING INFORMATION OR MAKING DECISIONS. PAGE -----------------
	 */

	/*
	 * ----------------- BEGINNING OF BETWEEN THE AGES OF 6 AND 10 (ELEMENTARY SCHOOL AGE) PLEASE SELECT THE OPTION THAT BEST DESCRIBES YOUR SCHOOLING. PAGE -----------------
	 */

	// “ATTENDED TYPICAL ELEMENTARY SCHOOL WITHOUT SUPPORT" RADIO BUTTON
	@FindBy(xpath = "(//span[contains(text(),'Attended typical elementary school without support')])[1]")
	public WebElement attendedTypicalElementarySchoolWithoutSupportRadioButton;

	/*
	 * ----------------- END OF BETWEEN THE AGES OF 6 AND 10 (ELEMENTARY SCHOOL AGE) PLEASE SELECT THE OPTION THAT BEST DESCRIBES YOUR SCHOOLING. PAGE -----------------
	 */
	
	/*
	 *  ----------------- BEGINNING OF BETWEEN THE AGES OF 10 AND 17 (MIDDLE AND HIGH SCHOOL AGE) PLEASE SELECT THE OPTION THAT BEST DESCRIBES YOUR SCHOOLING. PAGE -----------------
	 */
	
	// “ATTENDED TYPICAL CLASSROOM WITHOUT SUPPORT OR LITTLE SUPPORT" RADIO BUTTON
	@FindBy(xpath = "//span[contains(@class,'LabelWrapper')]//label[contains(@for,'QR~QID93~1')]")
	public WebElement attendedTypicalclassroomOrlittleSupportRadioButton;
	
	/*
	 *  ----------------- END OF BETWEEN THE AGES OF 10 AND 17 (MIDDLE AND HIGH SCHOOL AGE) PLEASE SELECT THE OPTION THAT BEST DESCRIBES YOUR SCHOOLING. PAGE -----------------
	 */

	/*
	 * ----------------- BEGINNING OF PLEASE INDICATE THE HIGHEST DEGREE OR LEVEL OF SCHOOLING YOU HAVE COMPLETED PAGE -----------------
	 */

	// “BACHELOR'S DEGREE (4-YEAR COLLEGE WITH BA, BS, AB," RADIO BUTTON
	@FindBy(xpath = "(//span[contains(text(),\"Bachelor's degree (4-year college with BA, BS, AB,\")])[1]")
	public WebElement BachelorsDegreeRadioButton;

	/*
	 * ----------------- END OF PLEASE INDICATE THE HIGHEST DEGREE OR LEVEL OF SCHOOLING YOU HAVE COMPLETED PAGE -----------------
	 */

	/*
	 * ----------------- BEGINNING OF WHAT IS YOUR CURRENT EMPLOYMENT STATUS? PAGE -----------------
	 */

	// “WORKING FULL TIME" RADIO BUTTON
	@FindBy(xpath = "(//span[contains(text(),'Working full time')])[1]")
	public WebElement workingFullTimeRadioButton;

	/*
	 * ----------------- END OF WHAT IS YOUR CURRENT EMPLOYMENT STATUS? PAGE -----------------
	 */

	/*
	 * ----------------- BEGINNING OF WHAT IS THE NAME OF THE CARDIOLOGIST WHO COMPLETED YOUR HEART EVALUATION? PAGE -----------------
	 */

	// "NAME OF DOCTOR/MEDICAL PROVIDER" TEXT BOX
	@FindBy(xpath = "(//input[@class='Medium InputText QR-QID373-1 QWatchTimer'])[1]")
	public WebElement nameOfDoctorOrMedicalProviderTextBox;

	// STEPS TO SENT TEXT TO "LOCATION (CITY, STATE, COUNTRY)" TEXT BOX
	@FindBy(xpath = "(//input[@class='Medium InputText QR-QID373-2 QWatchTimer'])[1]")
	public WebElement locationCityStateCountryTextBox;

	// STEPS TO SENT TEXT TO "HOSPITAL OR HEALTH CENTER AFFILIATION" TEXT BOX
	@FindBy(xpath = "(//input[@class='Medium InputText QR-QID373-3 QWatchTimer'])[1]")
	public WebElement hospitalOrHealthCenterAffiliationTextBox;

	/*
	 * ----------------- END OF WHAT IS THE NAME OF THE CARDIOLOGIST WHO COMPLETED YOUR HEART EVALUATION? PAGE -----------------
	 */

	/*
	 * ----------------- BEGINNING OF Please complete the table below for the following symptom(s), indicating when these symptoms occurred and where these
	 * symptoms were evaluated. You only have to provide the age or date for each symptom (not both). If you don't recall when the symptom first started or
	 * when it most recently occurred, place an 'X' under "don't know." PAGE -----------------
	 */

	// -------------CHEST PAIN OF TIGHTENING SECTION-------------

	// “CHEST PAIN OR TIGHTENING AGE" TEXT BOX
	@FindBy(xpath = "(//input[@type='text'])[1]")
	public WebElement chestPainOrTighteningAgeTextBox;

	// “CHEST PAIN OR TIGHTENING DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[2]")
	public WebElement chestPainOrTighteningDateTextBox;

	// “CHEST PAIN OR TIGHTENING DON'T KNOW" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[3]")
	public WebElement chestPainOrTighteningDontKnowTextBox;

	// “CHEST PAIN OR TIGHTENING FIRST HOSPITAL EVALUATION" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[4]")
	public WebElement chestPainOrTighteningFirstHospitalEvaluationTextBox;

	// “CHEST PAIN OR TIGHTENING FIRST HOSPITAL EVALUATION AGE" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[5]")
	public WebElement chestPainOrTighteningFirstHospitalEvaluationAgeTextBox;

	// “CHEST PAIN OR TIGHTENING FIRST HOSPITAL EVALUATION DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[6]")
	public WebElement chestPainOrTighteningFirstHospitalEvaluationDateTextBox;

	// “CHEST PAIN OR TIGHTENING FIRST HOSPITAL EVALUATION DON'T KNOW" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[7]")
	public WebElement chestPainOrTighteningFirstHospitalEvaluationDontKnowTextBox;

	// “CHEST PAIN OR TIGHTENING MOST RECENT HOSPITAL EVALUATION" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[8]")
	public WebElement chestPainOrTighteningMostRecentHospitalEvaluationTextBox;

	// -------------FATIGUE SECTION-------------

	// “FATIGUE AGE" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[9]")
	public WebElement fatigueAgeTextBox;

	// “FATIGUE DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[10]")
	public WebElement fatigueDateTextBox;

	// “FATIGUE DON'T KNOW" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[11]")
	public WebElement fatigueDontKnowTextBox;

	// “FATIGUE FIRST HOSPITAL EVALUATION" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[12]")
	public WebElement fatigueFirstHospitalEvaluationTextBox;

	// “FATIGUE FIRST HOSPITAL EVALUATION AGE" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[13]")
	public WebElement fatigueFirstHospitalEvaluationAgeTextBox;

	// “FATIGUE FIRST HOSPITAL EVALUATION DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[14]")
	public WebElement fatigueFirstHospitalEvaluationDateTextBox;

	// “FATIGUE FIRST HOSPITAL EVALUATION DON'T KNOW" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[15]")
	public WebElement fatigueFirstHospitalEvaluationDontKnowTextBox;

	// “FATIGUE MOST RECENT HOSPITAL EVALUATION" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[16]")
	public WebElement fatigueMostRecentHospitalEvaluationTextBox;

	// -------------HEART PALPITATIONS/IRREGULAR HEARTBEAT SECTION-------------
	
	// “HEART PALPITATIONS/IRREGULAR HEARTBEAT AGE" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[17]")
	public WebElement heartPalpitationsIrregularHeartBeatAgeTextBox;

	// “HEART PALPITATIONS/IRREGULAR HEARTBEAT DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[18]")
	public WebElement heartPalpitationsIrregularHeartBeatDateTextBox;

	// “HEART PALPITATIONS/IRREGULAR HEARTBEAT DON'T KNOW" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[19]")
	public WebElement heartPalpitationsIrregularHeartBeatDontKnowTextBox;

	// “HEART PALPITATIONS/IRREGULAR HEARTBEAT FIRST HOSPITAL EVALUATION" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[20]")
	public WebElement heartPalpitationsIrregularHeartBeatFirstHospitalEvaluationTextBox;

	// “HEART PALPITATIONS/IRREGULAR HEARTBEAT FIRST HOSPITAL EVALUATION AGE" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[21]")
	public WebElement heartPalpitationsIrregularHeartBeatFirstHospitalEvaluationAgeTextBox;

	// “HEART PALPITATIONS/IRREGULAR HEARTBEAT FIRST HOSPITAL EVALUATION DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[22]")
	public WebElement heartPalpitationsIrregularHeartBeatFirstHospitalEvaluationDateTextBox;

	// “HEART PALPITATIONS/IRREGULAR HEARTBEAT FIRST HOSPITAL EVALUATION DON'T KNOW" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[23]")
	public WebElement heartPalpitationsIrregularHeartBeatFirstHospitalEvaluationDontKnowTextBox;

	// “HEART PALPITATIONS/IRREGULAR HEARTBEAT MOST RECENT HOSPITAL EVALUATION" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[24]")
	public WebElement heartPalpitationsIrregularHeartBeatMostRecentHospitalEvaluationTextBox;

	// -------------LEG CRAMPING SECTION-------------

	// “LEG CRAMPING AGE" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[25]")
	public WebElement legCrampingAgeTextBox;

	// “LEG CRAMPING DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[26]")
	public WebElement legCrampingDateTextBox;

	// “LEG CRAMPING DON'T KNOW" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[27]")
	public WebElement legCrampingDontKnowTextBox;

	// “LEG CRAMPING FIRST HOSPITAL EVALUATION" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[28]")
	public WebElement legCrampingFirstHospitalEvaluationTextBox;

	// “LEG CRAMPING FIRST HOSPITAL EVALUATION AGE" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[29]")
	public WebElement legCrampingFirstHospitalEvaluationAgeTextBox;

	// “LEG CRAMPING FIRST HOSPITAL EVALUATION DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[30]")
	public WebElement legCrampingFirstHospitalEvaluationDateTextBox;

	// “LEG CRAMPING FIRST HOSPITAL EVALUATION DON'T KNOW" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[31]")
	public WebElement legCrampingFirstHospitalEvaluationDontKnowTextBox;

	// “LEG CRAMPING MOST RECENT HOSPITAL EVALUATION" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[32]")
	public WebElement legCrampingMostRecentHospitalEvaluationTextBox;

	// -------------SHORTNESS OF BREATH SECTION-------------

	// “SHORTNESS OF BREATH AGE" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[33]")
	public WebElement shortnessOfBreathAgeTextBox;

	// “SHORTNESS OF BREATH DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[34]")
	public WebElement shortnessOfBreathDateTextBox;

	// “SHORTNESS OF BREATH DON'T KNOW" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[35]")
	public WebElement shortnessOfBreathDontKnowTextBox;

	// “SHORTNESS OF BREATH FIRST HOSPITAL EVALUATION" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[36]")
	public WebElement shortnessOfBreathFirstHospitalEvaluationTextBox;

	// “SHORTNESS OF BREATH FIRST HOSPITAL EVALUATION AGE" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[37]")
	public WebElement shortnessOfBreathFirstHospitalEvaluationAgeTextBox;

	// “SHORTNESS OF BREATH FIRST HOSPITAL EVALUATION DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[38]")
	public WebElement shortnessOfBreathFirstHospitalEvaluationDateTextBox;

	// “SHORTNESS OF BREATH FIRST HOSPITAL EVALUATION DON'T KNOW" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[39]")
	public WebElement shortnessOfBreathFirstHospitalEvaluationDontKnowTextBox;

	// “SHORTNESS OF BREATH MOST RECENT HOSPITAL EVALUATION" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[40]")
	public WebElement shortnessOfBreathMostRecentHospitalEvaluationTextBox;

	// -------------DIFFICULTY EXCERCISING SECTION-------------

	// “DIFFICULTY EXCERCISING AGE" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[41]")
	public WebElement difficultyExcercisingAgeTextBox;

	// “DIFFICULTY EXCERCISING DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[42]")
	public WebElement difficultyExcercisingDateTextBox;

	// “DIFFICULTY EXCERCISING DON'T KNOW" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[43]")
	public WebElement difficultyExcercisingDontKnowTextBox;

	// “DIFFICULTY EXCERCISING FIRST HOSPITAL EVALUATION" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[44]")
	public WebElement difficultyExcercisingFirstHospitalEvaluationTextBox;

	// “DIFFICULTY EXCERCISING FIRST HOSPITAL EVALUATION AGE" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[45]")
	public WebElement difficultyExcercisingFirstHospitalEvaluationAgeTextBox;

	// “DIFFICULTY EXCERCISING FIRST HOSPITAL EVALUATION DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[46]")
	public WebElement difficultyExcercisingFirstHospitalEvaluationDateTextBox;

	// “DIFFICULTY EXCERCISING FIRST HOSPITAL EVALUATION DON'T KNOW" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[47]")
	public WebElement difficultyExcercisingFirstHospitalEvaluationDontKnowTextBox;

	// “DIFFICULTY EXCERCISING MOST RECENT HOSPITAL EVALUATION" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[48]")
	public WebElement difficultyExcercisingMostRecentHospitalEvaluationTextBox;

	// -------------HIGH BLOOD PRESSURE SECTION-------------

	// “HIGH BLOOD PRESSURE AGE" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[49]")
	public WebElement highBloodPressureAgeTextBox;

	// “HIGH BLOOD PRESSURE DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[50]")
	public WebElement highBloodPressureDateTextBox;

	// “HIGH BLOOD PRESSURE DON'T KNOW" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[51]")
	public WebElement highBloodPressureDontKnowTextBox;

	// “HIGH BLOOD PRESSURE FIRST HOSPITAL EVALUATION" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[52]")
	public WebElement highBloodPressureFirstHospitalEvaluationTextBox;

	// “HIGH BLOOD PRESSURE FIRST HOSPITAL EVALUATION AGE" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[53]")
	public WebElement highBloodPressureFirstHospitalEvaluationAgeTextBox;

	// “HIGH BLOOD PRESSURE FIRST HOSPITAL EVALUATION DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[54]")
	public WebElement highBloodPressureFirstHospitalEvaluationDateTextBox;

	// “HIGH BLOOD PRESSURE FIRST HOSPITAL EVALUATION DON'T KNOW" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[55]")
	public WebElement highBloodPressureFirstHospitalEvaluationDontKnowTextBox;

	// "HIGH BLOOD PRESSURE MOST RECENT HOSPITAL EVALUATION" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[56]")
	public WebElement highBloodPressureMostRecentHospitalEvaluationTextBox;

	// ------------KIDNEY DYSFUNCTION SECTION-------------

	// “KIDNEY DYSFUNCTION AGE" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[57]")
	public WebElement kidneyDysfunctionAgeTextBox;

	// “KIDNEY DYSFUNCTION DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[58]")
	public WebElement kidneyDysfunctionDateTextBox;

	// “KIDNEY DYSFUNCTION DON'T KNOW" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[59]")
	public WebElement kidneyDysfunctionDontKnowTextBox;

	// “KIDNEY DYSFUNCTION FIRST HOSPITAL EVALUATION" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[60]")
	public WebElement kidneyDysfunctionFirstHospitalEvaluationTextBox;

	// “KIDNEY DYSFUNCTION FIRST HOSPITAL EVALUATION AGE" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[61]")
	public WebElement kidneyDysfunctionFirstHospitalEvaluationAgeTextBox;

	// “KIDNEY DYSFUNCTION FIRST HOSPITAL EVALUATION DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[62]")
	public WebElement kidneyDysfunctionFirstHospitalEvaluationDateTextBox;

	// “KIDNEY DYSFUNCTION FIRST HOSPITAL EVALUATION DON'T KNOW" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[63]")
	public WebElement kidneyDysfunctionFirstHospitalEvaluationDontKnowTextBox;

	// "KIDNEY DYSFUNCTION MOST RECENT HOSPITAL EVALUATION" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[64]")
	public WebElement kidneyDysfunctionMostRecentHospitalEvaluationTextBox;

	// ------------MIGRAINES SECTION-------------

	// “MIGRAINES AGE" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[65]")
	public WebElement migrainesAgeTextBox;

	// “MIGRAINES DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[66]")
	public WebElement migrainesDateTextBox;

	// “MIGRAINES DON'T KNOW" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[67]")
	public WebElement migrainesDontKnowTextBox;

	// “MIGRAINES FIRST HOSPITAL EVALUATION" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[68]")
	public WebElement migrainesFirstHospitalEvaluationTextBox;

	// “MIGRAINES FIRST HOSPITAL EVALUATION AGE" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[69]")
	public WebElement migrainesFirstHospitalEvaluationAgeTextBox;

	// “MIGRAINES FIRST HOSPITAL EVALUATION DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[70]")
	public WebElement migrainesFirstHospitalEvaluationDateTextBox;

	// “MIGRAINES FIRST HOSPITAL EVALUATION DON'T KNOW" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[71]")
	public WebElement migrainesFirstHospitalEvaluationDontKnowTextBox;

	// "MIGRAINES MOST RECENT HOSPITAL EVALUATION" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[72]")
	public WebElement migrainesMostRecentHospitalEvaluationTextBox;

	// ------------STROKE SECTION-------------

	// “STROKE AGE" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[73]")
	public WebElement strokeAgeTextBox;

	// “STROKE DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[74]")
	public WebElement strokeDateTextBox;

	// “STROKE DON'T KNOW" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[75]")
	public WebElement strokeDontKnowTextBox;

	// “STROKE FIRST HOSPITAL EVALUATION" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[76]")
	public WebElement strokeFirstHospitalEvaluationTextBox;

	// “STROKE FIRST HOSPITAL EVALUATION AGE" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[77]")
	public WebElement strokeFirstHospitalEvaluationAgeTextBox;

	// “STROKE FIRST HOSPITAL EVALUATION DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[78]")
	public WebElement strokeFirstHospitalEvaluationDateTextBox;

	// “STROKE FIRST HOSPITAL EVALUATION DON'T KNOW" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[79]")
	public WebElement strokeFirstHospitalEvaluationDontKnowTextBox;

	// "STROKE MOST RECENT HOSPITAL EVALUATION" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[80]")
	public WebElement strokeMostRecentHospitalEvaluationTextBox;

	// ------------TRANSIENT ISCHEMIC ATTACK (TIA) SECTION-------------

	// “TRANSIENT ISCHEMIC ATTACK (TIA) AGE" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[81]")
	public WebElement transientIschemicAttackAgeTextBox;

	// “TRANSIENT ISCHEMIC ATTACK (TIA) DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[82]")
	public WebElement transientIschemicAttackDateTextBox;

	// “TRANSIENT ISCHEMIC ATTACK (TIA) DON'T KNOW" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[83]")
	public WebElement transientIschemicAttackDontKnowTextBox;

	// “TRANSIENT ISCHEMIC ATTACK (TIA) FIRST HOSPITAL EVALUATION" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[84]")
	public WebElement transientIschemicAttackFirstHospitalEvaluationTextBox;

	// “TRANSIENT ISCHEMIC ATTACK (TIA) FIRST HOSPITAL EVALUATION AGE" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[85]")
	public WebElement transientIschemicAttackFirstHospitalEvaluationAgeTextBox;

	// “TRANSIENT ISCHEMIC ATTACK (TIA) FIRST HOSPITAL EVALUATION DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[86]")
	public WebElement transientIschemicAttackFirstHospitalEvaluationDateTextBox;

	// “TRANSIENT ISCHEMIC ATTACK (TIA) FIRST HOSPITAL EVALUATION DON'T KNOW" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[87]")
	public WebElement transientIschemicAttackFirstHospitalEvaluationDontKnowTextBox;

	// "TRANSIENT ISCHEMIC ATTACK (TIA) MOST RECENT HOSPITAL EVALUATION" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[88]")
	public WebElement transientIschemicAttackMostRecentHospitalEvaluationTextBox;

	// ------------NEVER HAD ANY OF THESE SYMPTOMS SECTION-------------

	// “NEVER HAD ANY OF THESE SYMPTOMS AGE" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[89]")
	public WebElement neverHadAnyOfTheseSymptomsAgeTextBox;

	// “NEVER HAD ANY OF THESE SYMPTOMS DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[90]")
	public WebElement neverHadAnyOfTheseSymptomsDateTextBox;

	// “NEVER HAD ANY OF THESE SYMPTOMS DON'T KNOW" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[91]")
	public WebElement neverHadAnyOfTheseSymptomsDontKnowTextBox;

	// “NEVER HAD ANY OF THESE SYMPTOMS FIRST HOSPITAL EVALUATION" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[92]")
	public WebElement neverHadAnyOfTheseSymptomsFirstHospitalEvaluationTextBox;

	// “NEVER HAD ANY OF THESE SYMPTOMS FIRST HOSPITAL EVALUATION AGE" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[93]")
	public WebElement neverHadAnyOfTheseSymptomsFirstHospitalEvaluationAgeTextBox;

	// “NEVER HAD ANY OF THESE SYMPTOMS FIRST HOSPITAL EVALUATION DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[94]")
	public WebElement neverHadAnyOfTheseSymptomsFirstHospitalEvaluationDateTextBox;

	// “NEVER HAD ANY OF THESE SYMPTOMS FIRST HOSPITAL EVALUATION DON'T KNOW" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[95]")
	public WebElement neverHadAnyOfTheseSymptomsFirstHospitalEvaluationDontKnowTextBox;

	// "NEVER HAD ANY OF THESE SYMPTOMS MOST RECENT HOSPITAL EVALUATION" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[96]")
	public WebElement neverHadAnyOfTheseSymptomsMostRecentHospitalEvaluationTextBox;

	/*
	 * ----------------- END OF PLEASE COMPLETE THE TABLE BELOW FOR THE FOLLOWING SYMPTOM(S), INDICATING WHEN THESE SYMPTOMS OCCURRED AND WHERE THESE SYMPTOMS
	 * WERE EVALUATED. YOU ONLY HAVE TO PROVIDE THE AGE OR DATE FOR EACH SYMPTOM (NOT BOTH). IF YOU DON'T RECALL WHEN THE SYMPTOM FIRST STARTED OR WHEN IT
	 * MOST RECENTLY OCCURRED, PLACE AN 'X' UNDER "DON'T KNOW." PAGE -----------------
	 */


	/*
	 * ----------------- BEGINNING OF HAVE YOU EVER HAD ANY OF THE FOLLOWING TREATMENTS FOR HEART PROBLEMS? PLEASE SELECT ALL THAT APPLY. PAGE -----------------
	 */
	
	// “MEDICATION (PLEASE SPECIFY)" TEXT BOX
	@FindBy(xpath = "(//input[contains(@title,'Medication (please specify)')])[1]")
	public WebElement medicationTextBox;

	/*
	 * ----------------- END OF HAVE YOU EVER HAD ANY OF THE FOLLOWING TREATMENTS FOR HEART PROBLEMS? PLEASE SELECT ALL THAT APPLY. PAGE -----------------
	 */

	/*
	 * ----------------- BEGINNING OF PLEASE COMPLETE THE TABLE BELOW BY PROVIDING INFORMATION FOR THE FIRST TREATMENT AND THE MOST RECENT TREATMENT. YOU ONLY
	 * NEED TO PROVIDE THE AGE AT WHICH SYMPTOMS OCCURRED OR DATE (NOT BOTH). IF YOU DO NOT RECALL THE DETAILS, PLEASE PLACE AN 'X' IN THE 'DON'T KNOW' BOX. PAGE -----------------
	 */

	// -------------MEDICATION (PLEASE SPECIFY) SECTION-------------
	
	// “MEDICATION FIRST TREATMENT AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[1]/td[3]/input[1]")
	public WebElement medicationFirstTreatmentAgeTextBox;

	// “MEDICATION FIRST TREATMENT DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[2]")
	public WebElement medicationFirstTreatmentDateTextBox;

	// “MEDICATION FIRST TREATMENT DON'T KNOW" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[3]")
	public WebElement medicationFirstTreatmentDontKnowTextBox;

	// “MEDICATION FIRST TREATMENT LOCATION HOSPITAL CITY STATE COUNTRY" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[4]")
	public WebElement medicationFirstTreatmentLocationTextBox;

	// “MEDICATION MOST RECENT TREATMENT AGE" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[5]")
	public WebElement medicationMostRecentTreatmentAgeTextBox;

	// “MEDICATION MOST RECENT TREATMENT DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[6]")
	public WebElement medicationMostRecentTreatmentDateTextBox;

	// “MEDICATION MOST RECENT TREATMENT DON'T KNOW" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[7]")
	public WebElement medicationMostRecentTreatmentDontKnowTextBox;

	// “MEDICATION MOST RECENT TREATMENT LOCATION HOSPITAL CITY STATE COUNTRY" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[8]")
	public WebElement medicationMostRecentTreatmentLocationTextBox;

	// -------------CATHETER INTERVENTION SECTION-------------

	// “CATHETER INTERVENTION FIRST TREATMENT AGE" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[9]")
	public WebElement catheterInterventionFirstTreatmentAgeTextBox;

	// “CATHETER INTERVENTION FIRST TREATMENT DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[10]")
	public WebElement catheterInterventionFirstTreatmentDateTextBox;

	// "CATHETER INTERVENTION FIRST TREATMENT DON'T KNOW" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[11]")
	public WebElement catheterInterventionFirstTreatmentDontKnowTextBox;


	// “CATHETER INTERVENTION FIRST TREATMENT LOCATION HOSPITAL CITY STATE COUNTRY" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[12]")
	public WebElement catheterInterventionFirstTreatmentLocationTextBox;

	// “CATHETER INTERVENTION MOST RECENT TREATMENT AGE" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[13]")
	public WebElement catheterInterventionMostRecentTreatmentAgeTextBox;

	// “CATHETER INTERVENTION MOST RECENT TREATMENT DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[14]")
	public WebElement catheterInterventionMostRecentTreatmentDateTextBox;

	// “CATHETER INTERVENTION MOST RECENT TREATMENT DON'T KNOW" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[15]")
	public WebElement catheterInterventionMostRecentTreatmentDontKnowTextBox;

	// “CATHETER INTERVENTION MOST RECENT TREATMENT LOCATION HOSPITAL CITY STATE COUNTRY" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[16]")
	public WebElement catheterInterventionMostRecentTreatmentLocationTextBox;

	// -------------SURGERY SECTION-------------

	// “SURGERY FIRST TREATMENT AGE" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[17]")
	public WebElement surgeryFirstTreatmentAgeTextBox;

	// “SURGERY FIRST TREATMENT DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[18]")
	public WebElement surgeryFirstTreatmentDateTextBox;

	// "SURGERY FIRST TREATMENT DON'T KNOW" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[19]")
	public WebElement surgeryFirstTreatmentDontKnowTextBox;

	// “SURGERY FIRST TREATMENT LOCATION HOSPITAL CITY STATE COUNTRY" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[20]")
	public WebElement surgeryFirstTreatmentLocationTextBox;

	// “SURGERY MOST RECENT TREATMENT AGE" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[21]")
	public WebElement surgeryMostRecentTreatmentAgeTextBox;

	// “SURGERY MOST RECENT TREATMENT DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[22]")
	public WebElement surgeryMostRecentTreatmentDateTextBox;

	// “SURGERY MOST RECENT TREATMENT DON'T KNOW" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[23]")
	public WebElement surgeryMostRecentTreatmentDontKnowTextBox;

	// “SURGERY MOST RECENT TREATMENT LOCATION HOSPITAL CITY STATE COUNTRY" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[24]")
	public WebElement surgeryMostRecentTreatmentLocationTextBox;

	// -------------OTHER(PLEASE SPECIFY) SECTION-------------

	// “OTHER(PLEASE SPECIFY) FIRST TREATMENT AGE" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[25]")
	public WebElement otherFirstTreatmentAgeTextBox;

	// “OTHER(PLEASE SPECIFY) FIRST TREATMENT DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[26]")
	public WebElement otherFirstTreatmentDateTextBox;

	// "OTHER(PLEASE SPECIFY) FIRST TREATMENT DON'T KNOW" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[27]")
	public WebElement otherFirstTreatmentDontKnowTextBox;

	// “OTHER(PLEASE SPECIFY) FIRST TREATMENT LOCATION HOSPITAL CITY STATE COUNTRY" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[28]")
	public WebElement otherFirstTreatmentLocationTextBox;

	// “OTHER(PLEASE SPECIFY) MOST RECENT TREATMENT AGE" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[29]")
	public WebElement otherMostRecentTreatmentAgeTextBox;

	// “OTHER(PLEASE SPECIFY) MOST RECENT TREATMENT DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[30]")
	public WebElement otherMostRecentTreatmentDateTextBox;

	// “OTHER(PLEASE SPECIFY) MOST RECENT TREATMENT DON'T KNOW" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[31]")
	public WebElement otherMostRecentTreatmentDontKnowTextBox;

	// “OTHER(PLEASE SPECIFY) MOST RECENT TREATMENT LOCATION HOSPITAL CITY STATE COUNTRY" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[32]")
	public WebElement otherMostRecentTreatmentLocationTextBox;

	/*
	 * ----------------- END OF PLEASE COMPLETE THE TABLE BELOW BY PROVIDING INFORMATION FOR THE FIRST TREATMENT AND THE MOST RECENT TREATMENT. YOU ONLY
	 * NEED TO PROVIDE THE AGE AT WHICH SYMPTOMS OCCURRED OR DATE (NOT BOTH). IF YOU DO NOT RECALL THE DETAILS, PLEASE PLACE AN 'X' IN THE 'DON'T KNOW' BOX. PAGE -----------------
	 */

	/*
	 * ----------------- BEGINNING OF ARE YOU STILL ON MEDICATION? PAGE -----------------
	 */

	// "YES" (ARE YOU STILL ON MEDICATION?) RADIO BUTTON
	@FindBy(xpath = "(//span[contains(text(),'Yes')])[1]")
	public WebElement yesToAreYouStillOnMedicationRadioButton;

	/*
	 * ----------------- END OF ARE YOU STILL ON MEDICATION? PAGE -----------------
	 */
	
	/*
	 * --------------- BEGINNING OF PROVIDE ANY DETAILS KNOWN FOR THE CONDITION(S) FOR WICH YOU HAVE BEEN DIAGNOSTED. PAGE ---------------
	 */
	
	//TACHYCARDIA AGE OF FIRST SYMPTOM TEXT BOX
	@FindBy(xpath = "//tbody/tr[1]/td[3]/input[1]")
	public WebElement tachycardiaAgeOfFirstSymptomTextBox;
	
	//TACHYCARDIA DATE OF FIRST SYMPTOM TEXT BOX
	@FindBy(xpath = "//tbody/tr[1]/td[4]/input[1]")
	public WebElement tachycardiaDateOfFirstSymptomTextBox;
	
	//TACHYCARDIA AGE OF DIAGNOSIS TEXT BOX
	@FindBy(xpath = "//tbody/tr[1]/td[8]/input[1]")
	public WebElement tachycardiaAgeOfDiagnosisTextBox;
	
	//TACHYCARDIA DATE OF DIAGNOSIS TEXT BOX
	@FindBy(xpath = "//tbody/tr[1]/td[9]/input[1]")
	public WebElement tachycardiaDateOfDiagnosisTextBox;
	
	//TACHYCARDIA TREATMENT AND MEDICATION TAKEN TEXT BOX
	@FindBy(xpath = "//tbody/tr[1]/td[13]/input[1]")
	public WebElement tachycardiaTreatmentAndMedicationTextBox;
	
	//TACHYCARDIA HOSPITAL OF TREATMENT TEXT BOX
	@FindBy(xpath = "//tbody/tr[1]/td[16]/input[1]")
	public WebElement tachycardiaHospitalOfTreatmentTextBox;
	
	//CARDIAC CONDUCTION DEFECT AGE OF FIRST SYMPTOM TEXT BOX
	@FindBy(xpath = "//tbody/tr[2]/td[3]/input[1]")
	public WebElement cardiacConductionDefectAgeOfFirstSymptomTextBox;
	
	//CARDIAC CONDUCTION DEFECT DATE OF FIRST SYMPTOM TEXT BOX
	@FindBy(xpath = "//tbody/tr[2]/td[4]/input[1]")
	public WebElement cardiacConductionDefectDateOfFirstSymptomTextBox;
	
	//CARDIAC CONDUCTION DEFECT AGE OF DIAGNOSIS TEXT BOX
	@FindBy(xpath = "//tbody/tr[2]/td[8]/input[1]")
	public WebElement cardiacConductionDefectAgeOfDiagnosisTextBox;
	
	//CARDIAC CONDUCTION DEFECT DATE OF DIAGNOSIS TEXT BOX
	@FindBy(xpath = "//tbody/tr[2]/td[9]/input[1]")
	public WebElement cardiacConductionDefectDateOfDiagnosisTextBox;
	
	//CARDIAC CONDUCTION DEFECT TREATMENT AND MEDICATION TAKEN TEXT BOX
	@FindBy(xpath = "//tbody/tr[2]/td[13]/input[1]")
	public WebElement cardiacConductionDefectTreatmentAndMedicationTextBox;
	
	//CARDIAC CONDUCTION DEFECT HOSPITAL OF TREATMENT TEXT BOX
	@FindBy(xpath = "//tbody/tr[2]/td[16]/input[1]")
	public WebElement cardiacConductionDefectHospitalOfTreatmentTextBox;
	
	// HEART FAILURE AGE OF FIRST SYMPTOM TEXT BOX
	@FindBy(xpath = "//tbody/tr[3]/td[3]/input[1]")
	public WebElement heartFailureAgeOfFirstSymptomTextBox;
	
	// HEART FAILURE DATE OF FIRST SYMPTOM TEXT BOX
	@FindBy(xpath = "//tbody/tr[3]/td[4]/input[1]")
	public WebElement heartFailureDateOfFirstSymptomTextBox;
	
	// HEART FAILURE AGE OF DIAGNOSIS TEXT BOX
	@FindBy(xpath = "//tbody/tr[3]/td[8]/input[1]")
	public WebElement heartFailureAgeOfDiagnosisTextBox;
	
	// HEART FAILURE DATE OF DIAGNOSIS TEXT BOX
	@FindBy(xpath = "//tbody/tr[3]/td[9]/input[1]")
	public WebElement heartFailureDateOfDiagnosisTextBox;
	
	// HEART FAILURE TREATMENT AND MEDICATION TAKEN TEXT BOX
	@FindBy(xpath = "//tbody/tr[3]/td[13]/input[1]")
	public WebElement heartFailureTreatmentAndMedecationTextBox;
	
	// HEART FAILURE HOSPITAL OF TREATMENT TEXT BOX
	@FindBy(xpath = "//tbody/tr[3]/td[16]/input[1]")
	public WebElement heartFailureHospitalOfTreatmentTextBox;
	
	// OTHER HEART ISSUES AGE OF FIRST SYMPTOM TEXT BOX
	@FindBy(xpath = "//tbody/tr[4]/td[3]/input[1]")
	public WebElement otherHeartIssuesAgeOfFirstSymptomTextBox;
	
	// OTHER HEART ISSUES DATE OF FIRST SYMPTOM TEXT BOX
	@FindBy(xpath = "//tbody/tr[4]/td[4]/input[1]")
	public WebElement otherHeartIssuesDateOfFirstSymptomTextBox;
	
	// OTHER HEART ISSUES AGE OF DIAGNOSIS TEXT BOX
	@FindBy(xpath = "//tbody/tr[4]/td[8]/input[1]")
	public WebElement otherHeartIssuesAgeOfDiagnosisTextBox;
	
	// OTHER HEART ISSUES DATE OF DIAGNOSIS TEXT BOX
	@FindBy(xpath = "//tbody/tr[4]/td[9]/input[1]")
	public WebElement otherHeartIssuesDateOfDiagnosisTextBox;
	
	// OTHER HEART ISSUES TREATMENT AND MEDICATION TAKEN TEXT BOX
	@FindBy(xpath = "//tbody/tr[4]/td[13]/input[1]")
	public WebElement OtherHeartIssuesTreatmentAndMedicationTextBox;
	
	// OTHER HEART ISSUES HOSPITAL OF TREATMENT TEXT BOX
	@FindBy(xpath = "//tbody/tr[4]/td[16]/input[1]")
	public WebElement otherHeartIssuesHospitalOfTreatmentTextBox;
	
	/*
	 * --------------- END OF PROVIDE ANY DETAILS KNOWN FOR THE CONDITION(S) FOR WICH YOU HAVE BEEN DIAGNOSTED. PAGE ---------------
	 */
	
	/*
	 * --------------- BEGINNING INFORMATION FOR PRIMARY CARE PROVIDER. PAGE ---------------
	 */
	
	// PRIMARY CARE PROVIDER NAME TEXT BOX 
	@FindBy(xpath = "//input[contains(@name,'QR~QID397~1~TEXT')]")
	public WebElement PrimaryCareProviderNameTextBox ;
	
	// PRIMARY CARE PROVIDER LOCATION TEXT BOX
	@FindBy(xpath = "//input[@name='QR~QID397~2~TEXT']")
	public WebElement PrimaryCareProviderLocationTextBox ;
	
	// PRIMARY CARE PROVIDER HOSPITAL OR MEDICAL CENTER AFFILIATION TEXT BOX
	@FindBy(xpath = "//input[@name='QR~QID397~3~TEXT']")
	public WebElement PrimaryCareProviderHospitalorMedicalCenterAffiliationTextBox ;
	
	/*
	 * --------------- END INFORMATION FOR PRIMARY CARE PROVIDER. PAGE ---------------
	 */
	
	/*
	 * --------------- BEGINNING OF TABLE OF ALLERGIES. PAGE ---------------
	 */
	
	// ALLERGIES TO MEDICINES RADIO BUTTON
	@FindBy(xpath = "//label[@for='QR~QID317#1~1~1']")
	public WebElement allergiesToMedicinesRadioButton ;
	
	// ALLERGIES TO FOOD RADIO BUTTON
	@FindBy(xpath = "//label[@for='QR~QID317#1~2~1']")
	public WebElement allergiesToFoodRadioButton ;

	//ALLERGIES TO ANYTHING ELSE RADIO BUTTON
	@FindBy(xpath = "//label[@for='QR~QID317#1~3~1']")
	public WebElement allergiesToAnythingElseRadioButton ;
	
	/*
	 * --------------- END OF TABLE OF ALLERGIES. PAGE ---------------
	 */
	
	/*
	 * --------------- BEGINNING OF TABLE OF ALL MEDICATIONS YOU ARE ALLERGIC TO . PAGE ---------------
	 */
		
	// MEDICATION NAME TEXT BOX
	@FindBy(xpath = "//input[@name='QR~QID377#1~1~1~TEXT']")
	public WebElement medicationNamestextBox ;
		
	//ALLERGIES REACTIONS TEXT BOX
	@FindBy(xpath = "//input[@name='QR~QID377#2~1~1~TEXT']")
	public WebElement allergiesReactionsTextBox ;
		
	/*
	 * --------------- END OF TABLE OF ALL MEDICATIONS YOU ARE ALLERGIC TO . PAGE ---------------
	 */
	
	/*
	 * --------------- BEGINNING OF TABLE OF ALL FOOD OF WHICH YOU ARE ALLERGIC TO . PAGE ---------------
	 */
		
	// ALLERGY TO MILK TEXT BOX
	@FindBy(xpath = "//tbody/tr[1]/td[3]/input[1]")
	public WebElement firstFoodAllergyNamestextBox ;
		
	// REACTION TO MILK ALLERGY TEXT BOX
	@FindBy(xpath = "//tbody/tr[1]/td[6]/input[1]")
	public WebElement firstFoodAllergyreactiontextBox ;
		
	// ALLERGY TO NUTS TEXT BOX
	@FindBy(xpath = "//tbody/tr[2]/td[3]/input[1]")
	public WebElement secondFoodAllergyNamestextBox ;
		
	// REACTION TO NUTS ALLERGY TEXT BOX
	@FindBy(xpath = "//tbody/tr[2]/td[6]/input[1]")
	public WebElement secondFoodAllergyreactiontextBox ;
		
	/*
	 * --------------- END OF TABLE OF ALL FOOD OF WHICH YOU ARE ALLERGIC TO . PAGE ---------------
	 */	
		
	/*
	 * --------------- BEGINNING OF TABLE OF ALL "OTHER" ITEMS TO WHICH YOU ARE ALLERGIC THAT WERE NOT INCLUDED IN MEDICATION OR FOOD ALLERGIES. . PAGE ---------------
	 */
	
	// OTHER  ALLERGY 1 TEXT BOX
	@FindBy(xpath = "//input[@name='QR~QID379#1~1~1~TEXT']")
	public WebElement firstOtherAllergyNamesTextBox ;
		
	// OTHER ALLERGY REACTION 1 TEXT BOX
	@FindBy(xpath = "//input[@name='QR~QID379#2~1~1~TEXT']")
	public WebElement firstOtherAllergyReactionTextBox ;
		
	//OTHER ALLERGY 2 TEXT BOX
	@FindBy(xpath = "//input[@name='QR~QID379#1~2~1~TEXT']")
	public WebElement secondOtherAllergyNamesTextBox ;
		
	// OTHER ALLERGY REACTION 2 TEXT BOX
	@FindBy(xpath = "//input[@name='QR~QID379#2~2~1~TEXT']")
	public WebElement secondOtherAllergyReactionTextBox ;
		
	/*
	 * --------------- END OF TABLE OF ALL "OTHER" ITEMS TO WHICH YOU ARE ALLERGIC THAT WERE NOT INCLUDED IN MEDICATION OR FOOD ALLERGIES. . PAGE ---------------
	 */
		
	/*
     * --------------- BEGINNING OF TABLE OF INFORMATION FOR EACH BIOPSY AND SURGERY IN THE TABLE BELOW.. PAGE ---------------
     */
	
	// TYPE OF SURGERY/BIOPSY TEXT BOX
	@FindBy(xpath = "//input[contains(@name,'QR~QID364#4~1~1~TEXT')]")
	public WebElement typeOfSurgeryTextBox ;
		
	// AGE OF SURGERY OR BIOPSY TEXT BOX
	@FindBy(xpath = "//input[@name='QR~QID364#1~1~1~TEXT']")
	public WebElement ageOfSurgeryTextBox ;
		
	// REASON SURGERY OR BIOPSY WAS DONE DROP DOWN 
	@FindBy(xpath = "//tbody/tr[1]/td[11]/select[1]")
	public WebElement reasonSurgeryDropDown;
		
	// HOSPITAL NAME, CITY, STATE/PROVINCE, COUNTRY TEXT BOX
	@FindBy(xpath = "//input[@name='QR~QID364#3~1~1~TEXT']")
	public WebElement surgeryHospitalTextBox ;
		
	/*
	 * --------------- END OF TABLE OF INFORMATION FOR EACH BIOPSY AND SURGERY IN THE TABLE BELOW.. PAGE ---------------
	 */
	
	//PLEASE PROVIDE PRIMARY REASON FOR HOSPITALIZATION TEXT BOX
	@FindBy(xpath = "//input[@name='QR~QID374#3~1~1~TEXT']")
	public WebElement reasonOfHospitalizationTextBox ;
		
	//DATE OF HOSPITALIZATION ACCURANCE TEXT BOX
	@FindBy(xpath = "//input[@name='QR~QID374#1~1~2~TEXT']")
	public WebElement dateOfHospitalizationTextBox ;
		
	// PLACE OF HOSPITALIZATION ACCURANCE 
	@FindBy(xpath = "//textarea[@name='QR~QID374#2~1~1~TEXT']")
	public WebElement placeOfHospitalizationTextBox ;
		
	/*
	 * --------------- END OF PLEASE PROVIDE THE INFORMATION FOR EACH HOSPITALIZATION IN THE TABLE BELOW. 
	 * TO ADD A NEW HOSPITALIZATION, PLEASE CLICK ON THE '+' SIGN IN THE UPPER LEFT CORNER OF THE TABLE.  PAGE ---------------
	 */
		
	/*
	 * --------------- BEGINNING OF THE DETAILS FOR THE GASTROENTEROLOGIST WHO COMPLETED THE EVALUATION PAGE ---------------
	 */
	
	//NAME OF DOCTOR TEXT BOX
	@FindBy(xpath = "//input[@name='QR~QID376~1~TEXT']")
	public WebElement nameOfGastroenterologistTextBox ;
		
	//CITY, STATE TEXT BOX
	@FindBy(xpath = "//input[@name='QR~QID376~2~TEXT']")
	public WebElement cityStateOfGastroenterologistTextBox ;
		
	//HOSPITAL OF HEALTH CENTER AFFILIATION TEXT BOX
	@FindBy(xpath = "//input[@name='QR~QID376~3~TEXT']")
	public WebElement hospitalOfGastroenterologistTextBox ;
		
	/*
	 * --------------- END OF THE DETAILS FOR THE GASTROENTEROLOGIST WHO COMPLETED THE EVALUATION PAGE ---------------
	 */
			
	/*
	 * --------------- BEGINNING OF AT WHAT AGE WAS THE NASOGASTRIC OR NASOJEJUNAL TUBE PLACED? PAGE ---------------
	 */
		
	//NASOJEJUNAL TUBE PLACED RADIO BUTTON 
	@FindBy(xpath = "//span[@class='LabelWrapper']//label[@for='QR~QID122~1']")
	public WebElement tubePlacedRadioButton;
	
	//NASOJEJUNAL TUBE PLACED TEXT BOX
	@FindBy(xpath = "//input[contains(@title,'Age (specify if in days, weeks, months or years)')]")
	public WebElement tubePlacedTextBox;
		
	/*
	 * --------------- END OF AT WHAT AGE WAS THE NASOGASTRIC OR NASOJEJUNAL TUBE PLACED? PAGE ---------------
	 */
		
	/*
	 * --------------- BEGINNING OF AT WHAT AGE WAS THE GASTROSTOMY (G-TUBE) OR GASTROSTOMY-JEJUNOSTOMY (GJ) TUBE PLACED? PAGE ---------------
     */
		
	//GASTROSTOMY-JEJUNOSTOMY  TUBE PLACED RADIO BUTTON 
	@FindBy(xpath = "//span[@class='LabelWrapper']//label[@for='QR~QID123~1']")
	public WebElement tubePlacedJejunostomyPlacedRadioButton;
		
	/*
	 * --------------- END OF AT WHAT AGE WAS THE GASTROSTOMY (G-TUBE) OR GASTROSTOMY-JEJUNOSTOMY (GJ) TUBE PLACED? PAGE ---------------
	 */
		
		
	/*
	 * --------------- BEGINNING OF AT WHAT AGE WAS THE GASTROSTOMY (G-TUBE) OR GASTROSTOMY-JEJUNOSTOMY (GJ) TUBE REMOVED? PAGE ---------------
	 */
		
	//GASTROSTOMY-JEJUNOSTOMY  TUBE PLACED RADIO BUTTON 
	@FindBy(xpath = "//span[@class='LabelWrapper']//label[@for='QR~QID124~1']")
	public WebElement tubePlacedJejunostomyRemovedRadioButton;
		
	/*
	 * --------------- END OF AT WHAT AGE WAS THE GASTROSTOMY (G-TUBE) OR GASTROSTOMY-JEJUNOSTOMY (GJ) TUBE REMOVED? PAGE ---------------
	 */
	
	/*
	 * --------------- BEGINNING OF WHICH OF THE FOLLOWING SYMPTOMS RELATED TO THE GI SYSTEM HAVE OCCURRED?  PLEASE SELECT ALL THAT APPLY.  PAGE ---------------
	 */
	
	// FOOD GETTING STUCK WHILE SWALLOWING CHECK BOX
	@FindBy(xpath = "//div[@role='main']//div//div//div//fieldset//div//span//label[@for='QR~QID125~4']")
	public WebElement FoodGettingStuckWhileSwallowingCheckBox;
	
	// GALLBLADDER PROBLEMS CHECK BOX
	@FindBy(xpath = "//span[contains(text(),'Gallbladder problems (eg, stones, infection)')]")
	public WebElement GallbladderProblemsCheckBox;
	
	// DIARRHEA CHECK BOX
	@FindBy(xpath = "//span[contains(text(),'Diarrhea (loose liquid stool > 1 per day)')]")
	public WebElement DiarrheaCheckBox;
	

	/*
	 * --------------- END OF WHICH OF THE FOLLOWING SYMPTOMS RELATED TO THE GI SYSTEM HAVE OCCURRED?  PLEASE SELECT ALL THAT APPLY.  PAGE ---------------
	 */
	
	/*
	 * --------------- BEGINNING OF THE SYMPTOMS LISTED BELOW WERE PREVIOUS SYMPTOMS OR CURRENT (ONGOING) SYMPTOMS. PAGE ---------------
	 */
	
	// CHOKING/GAGGING RADIO BUTTON 
	@FindBy(xpath = "//label[contains(@for,'QR~QID126#1~x1~1')]")
	public WebElement chockingPreviousSymptomRadioButton;
	
	// DIFFICULTY SWALLOWING RADIO BUTTON
	@FindBy(xpath = "//label[contains(@for,'QR~QID126#1~x2~1')]")
    public WebElement DifficultySwallowingPreviousSymptomRadioButton;
	
	//PAINFUL SWALLOWING RADIO BUTTON
	@FindBy(xpath = "//label[@for='QR~QID126#1~x3~1']")
	public WebElement PainfulSwallowingPreviousSymptomRadioButton;
	
	// FOOD GETTING STUCK WHILE SWALLOWING RADIO BUTTON
	@FindBy(xpath = "//label[@for='QR~QID126#1~x4~1']")
	public WebElement FoodGettingStuckWhileSwallowingPreviousSymptomRadioButton;
	
	//REFLUX HEART BURN RADIO BUTTON
	@FindBy(xpath = "//label[@for='QR~QID126#1~x5~1']")
	public WebElement RefluxHeartBurnPreviousSymptomRadioButton;
	
	// NAUSEA RADIO BUTTON
	@FindBy(xpath = "//label[@for='QR~QID126#1~x6~1']")
	public WebElement NauseaPreviousSymptomRadioButton;
	
	//ABDOMINAL PAIN RADIO BUTTON 
	@FindBy(xpath = "//label[@for='QR~QID126#1~x7~1']")
	public WebElement AbdominalPainPreviousSymptomRadioButton;
	
	//VOMITING RADIO BUTTON
	@FindBy(xpath = "//label[@for='QR~QID126#1~x8~1']")
	public WebElement VomitingPreviousSymptomRadioButton;
	
	// FEEL FULL QUICKLY RADIO BUTTON
	@FindBy(xpath = "//label[@for='QR~QID126#1~x9~1']")
	public WebElement FeelFullQuicklyPreviousSymptomRadioButton;
	
	// GALLBLADDER PROBLEMS RADIO BUTTON
	@FindBy(xpath = "//label[@for='QR~QID126#1~x10~1']")
	public WebElement GallbladderProblemsPreviousSymptomRadioButton;
	
	//JAUNDICE RADIO BUTTON
	@FindBy(xpath = "//label[@for='QR~QID126#1~x11~1']")
	public WebElement JaundicePreviousSymptomRadioButton;
	
	// FOOD ALLERGIES RADIO BUTTON 
	@FindBy(xpath = "//label[@for='QR~QID126#1~x12~1']")
	public WebElement FoodAllergiesPreviousSymptomRadioButton;
			
	// LACTOSE INTOLERANCE RADIO BUTTON
	@FindBy(xpath = "//label[@for='QR~QID126#1~x13~1']")
	public WebElement LactoseIntolerancePreviousSymptomRadioButton;
			
	// AVERSION TO SPECIFIC FOODS OR QUALITIES RADIO BUTTON
	@FindBy(xpath = "//label[@for='QR~QID126#1~x14~1']")
	public WebElement AversionToSpecificFoodsPreviousSymptomRadioButton;
	
	// GAS BLOATING RADIO BUTTON
	@FindBy(xpath = "//label[@for='QR~QID126#1~x15~1']")
	public WebElement GasBloatingPreviousSymptomRadioButton;
	
	// DIARRHEA RADIO BUTTON
	@FindBy(xpath = "//label[@for='QR~QID126#1~x16~1']")
	public WebElement DiarrheaPreviousSymptomRadioButton;
	
	// CONSTIPATION RADIO BUTTON
	@FindBy(xpath = "//label[@for='QR~QID126#1~x17~1']")
	public WebElement ConstipationPreviousSymptomRadioButton;		
	
	// ENCOPRESIS RADIO BUTTON 
	@FindBy(xpath = "//label[@for='QR~QID126#1~x18~1']")
	public WebElement EncopresisPreviousSymptomRadioButton;
	
	// PERIANAL LESIONS OR SORES RADIO BUTTON 
	@FindBy(xpath = "//label[@for='QR~QID126#1~x19~1']")
	public WebElement PerianalLesionsPreviousSymptomRadioButton;

	// UNINTENTIONAL OR UNPLANNED WEIGHT LOSS RADIO BUTTON 
	@FindBy(xpath = "//label[@for='QR~QID126#1~x20~1']")
	public WebElement UnintentionalOrWeighLossPreviousSymptomRadioButton;
	
	// DECREASED APPETITE RADIO BUTTON
	@FindBy(xpath = "//label[@for='QR~QID126#1~x21~1']")
	public WebElement DecreasedAppetitePreviousSymptomRadioButton;	
	
	/*
	 * --------------- END OF THE SYMPTOMS LISTED BELOW WERE PREVIOUS SYMPTOMS OR CURRENT (ONGOING) SYMPTOMS. PAGE ---------------
	 */
	
	/*
	 * --------------- BEGINNING OF DID CHOKING/GAGGING EVER LEAD TO.. PAGE ---------------
	 */
	
	//PNEUMANIA YES RADIO BUTTON 
	@FindBy(xpath = "//tbody/tr[1]/td[1]/label[1]")
	public WebElement pneumoniaYesRadioButton;
	
	//EVALUATION WITH X-RAY ON SWALLOW STUDY YES RADIO BUTTON 
	@FindBy(xpath = "(//label[contains(@for,'QR~QID127~2~1')])[1]")
	public WebElement evaluationWithXrayYesRadioButton;
	
	//ASPIRATION ON SWALLOW STUDY YES RADIO BUTTON 
	@FindBy(xpath = "//tbody/tr[contains(@class,'bottom')]/td[1]/label[1]")
	public WebElement AspirationOnSwallowStudyYesRadioButton;
	
	/*
	 * --------------- END OF DID CHOKING/GAGGING EVER LEAD TO.. PAGE ---------------
	 */
	
	/*
	 * --------------- BEGINNING OF PLEASE COMPLETE THE TABLE BELOW REGARDING HEARTBURN/REFLUX SYMPTOMS. PAGE ---------------
	 */
	
	//HAS A PH PROBE OR IMPEDANCE STUDY EVER BEEN COMPLETED YES RADIO BUTTON 
	@FindBy(xpath = "//label[@for='QR~QID129#1~1~1']")
	public WebElement impedanceStudyYesRadioButton;
	
	//HAVE ANY REFUX/HEARTBURN MEDICATIONS EVER BEEN TAKEN YES RADIO BUTTON
	@FindBy(xpath = "//label[@for='QR~QID129#2~1~1']")
	public WebElement refuxHeartburnmedicationTakenYesRadioButton;
	
	//AGE MEDICATIONS WERE TAKEN TEXT BOX 
	@FindBy(xpath = "//tbody/tr/td[13]/input[1]")
	public WebElement ageOfMedicationTakenTexBox;
	
	//MEDICATIONS TAKEN TEXT BOX
	@FindBy(xpath = "//tbody/tr/td[14]/input[1]")
	public WebElement MedicationTakenTexBox;
	
	/*
	 * --------------- END OF PLEASE COMPLETE THE TABLE BELOW REGARDING HEARTBURN/REFLUX SYMPTOMS. PAGE ---------------
	 */

	/*
	 * --------------- BEGINNING OF  PLEASE COMPLETE THE TABLE BELOW REGARDING NAUSEA SYMPTOMS. PAGE ---------------
	 */
	
	//HAS BOTHERSOME NAUSEA OCCURRED FOR AT LEAST 2 WEEKS NOT RELATED TO MEALS? YES RADIO BUTTON
	@FindBy(xpath= ("//label[@for='QR~QID130#1~1~1']"))
	public WebElement bothersomeNauseaForAtLeast2WeeksNotRelatedToMealsYesRadioButton;
	 
	//HAS NAUSEA THAT IS NOT RELATED TO VOMITING OCCURING(THAT HAS OCCURRED FOR ATLEAST 2 WEEKS? YES RADIO BUTTON
	@FindBy(xpath= ("//label[@for='QR~QID130#4~1~1']"))
	public WebElement nauseaThatIsNotRelatedToVomitingOccurredThatHasOccurredForAtLeast2WeeksYesRadioButton;
	
	//HAVE ANY NAUSEA MEDICATIONS BEEN TAKEN? YES RADIO BUTTON
	@FindBy (xpath= ("//label[@for='QR~QID130#2~1~1']"))
	public WebElement haveAnyNauseaMedicationsBeenTakenYesRadioButton;
	
	//PLEASE INCLUDE THE AGES AT WHICH NAUSEA MEDICATIONS WERE TAKEN AND MEDICATIONS WERE TAKEN AND THE MEDICATION NAME? TEXTBOX
	@FindBy (xpath= ("//tbody/tr/td[18]/input[1]"))
	public WebElement ageAtWhichNauseaMedicationswereTakenAndTheMedicationNameTextBox;
		
	// PLEASE SPECIFY THE MEDICATION NAME TEXT BOX
	@FindBy (xpath= ("//tbody/tr/td[19]/input[1]"))
	public WebElement naauseaMedicationNameTextBox;
	
	/*
	 * --------------- END OF  PLEASE COMPLETE THE TABLE BELOW REGARDING NAUSEA SYMPTOMS. PAGE ---------------
	 */
		
	/*
	 * --------------- BEGINNING OF PLEASE COMPLETE THE NEXT SET OF QUESTIONS REGARDING ABDOMINAL PAIN. PAGE ---------------
	 */
	
	//EVER HAD WAVES OF SEVERE, DISTRESSING,ACUTE PAIN AT THE BELLY-BUTTON OR ENTIRE ABDOMEN? YES RADIO BUTTON
	@FindBy (xpath= ("//label[@for='QR~QID131#1~1~1']"))
	public WebElement severeDistressingAcutePainAtTheBellyButtomOrEntireAbdomenYesRadioButton;
		
	//ARE EPISODES OF BELLY PAIN SEPARATED BY WEEKS OR MONTHS? YES RADIO BUTTON
	@FindBy (xpath= ("(//label[@for='QR~QID131#1~2~1'])[1]"))
	public WebElement areEpisodesOfBellyPainSeparatedByWeeksOrMonthsYesRadioButton;
		
	//DOES ABDOMINAL PAIN PREVENT THE COMPLETION OF USUAL ACTIVITIES? YES RADIO BUTTON
	@FindBy (xpath= ("(//label[@for='QR~QID131#1~3~1'])[1]"))
	public WebElement doesAbdominalPainPreventTheCompletionOfUsualActivitiesYesRadioButton;
		
	//IS THE PAIN SIMILAR WITH EACH EPISODES? YES RADIO BUTTON
	@FindBy (xpath= ("(//label[@for='QR~QID131#1~4~1'])[1]"))
	public WebElement isThePainSimilarWithEachEpisodeYesRadioButton;
		
	//HAVE THESE EPISODES BEEN HAPPENING AT LEAST SIX MONTHS? YES RADIO BUTTON
	@FindBy (xpath= ("(//label[@for='QR~QID131#1~5~1'])[1]"))
	public WebElement haveTheseEpisodesBeenHappeningAtLeastSixMonthsYesRadioButton;
		
	//ABDOMINAL PAINS OCCUR AT LEAST 4 DAYS/MONTHS FOR > 2 MONTHS? YES RADIO BUTTON
	@FindBy (xpath =("(//label[@for='QR~QID131#1~6~1'])[1]"))
	public WebElement abdominalPainsOccurAtLeast4MonthsFor2MonthsYesRadioButton;
		
	//IS PAIN ASSOCIATED WITH HAVING BOWEL MOVEMENTS? YES RADIO BUTTON
	@FindBy (xpath= ("(//label[@for='QR~QID131#1~7~1'])[1]"))
	public WebElement isPainAssociatedWithHavingBowelMovementsYesRadioButton;
		
	//ASSOCIATED WITH CHANGE IN BOWEL MOVEMENT FREQUENCY? YES RADIO BUTTON
	@FindBy (xpath = ("(//label[@for='QR~QID131#1~8~1'])[1]"))
	public WebElement associatedWithChangeInBowelMovementFrequencyYesRadioButton;
		
	//ASSOCIATED WITH CHANGE IN BOWEL MOVEMENT CONSISTENCY? YES RADIO BUTTON
	@FindBy (xpath= ("(//label[@for='QR~QID131#1~9~1'])[1]"))
	public WebElement associatedWithChangeInBowelMovementConsistencyYesRadioButton;
		
	//DID PAIN RESOLVE IN RELATION TO RESOLUTION OF CONSTIPATION? YES RADIO BUTTON
	@FindBy (xpath =("(//label[@for='QR~QID131#1~10~1'])[1]"))
	public WebElement didPainResolveInRelationToResolutionOfConstipationYesRadioButton;
		
	//IS THE PAIN NOT RELATED TO EATING, MENSTRUAL CYCLES OR OTHER ILLNESS? YES RADIO BUTTON
	@FindBy (xpath=("(//label[@for='QR~QID131#1~11~1'])[1]"))
	public WebElement isThePainNotRelatedToEatingMenstrualCyclesOrOtherIllnessYesRadioButton;
		
	//HAS ABDOMINAL PAIN EVER CAUSED AWAKENING FROM SLEEP AT NIGHT? YES RADIO BUTTON
	@FindBy (xpath = ("(//label[@for='QR~QID131#1~12~1'])[1]"))
	public WebElement hasAbdominalPainEverCausedAwakeningFromSleepAtNightYesRadioButton;
		
	//HAS THE ABDOMINAL PAIN CAUSED WEIGHT LOSS? YES RADIO BUTTON
	@FindBy (xpath=("(//label[@for='QR~QID131#1~13~1'])[1]"))
	public WebElement hasTheAbdominalPainCausedWeightLossYesRadioButton;
		
	//IS ABDOMINAL PAIN ASSOCIATED WITH LOSS OF APPETITE? YES RADIO BUTTON
	@FindBy (xpath=("(//label[@for='QR~QID131#1~14~1'])[1]"))
	public WebElement isAbdominalPainAssociatedWithLossOfAppetiteYesRadioButton;
		
	//IS ABDOMINAL PAIN ASSOCIATED WITH NAUSEA? YES RADIO BUTTON
	@FindBy (xpath= ("(//label[@for='QR~QID131#1~15~1'])[1]"))
	public WebElement isAbdominalPainAssociatedWithNauseaYesRadioButton;
		
	//Is abdominal pain associated with vomiting? YES RADIO BUTTON
	@FindBy (xpath =("(//label[@for='QR~QID131#1~16~1'])[1]"))
	public WebElement isAbdominalPainAssociatedWithVomitingYesRadioButton;
		
	//IS ABDOMINAL PAIN ASSOCIATED WITH HEADACHE? YES RADIO BUTTON
	@FindBy (xpath=("(//label[@for='QR~QID131#1~17~1'])[1]"))
	public WebElement isAbdominalPainAssociatedWithHeadacheYesRadioButton;
		
	//IS ABDOMINAL PAIN ASSOCIATED WITH IRRITATION TO BRIGHT LIGHT? YES RADIO BUTTON
	@FindBy (xpath= ("(//label[@for='QR~QID131#1~18~1'])[1]"))
	public WebElement isAbdominalPainAssociatedWithIrritationToBrightLightYesRadioButton;
		
	//IS ABDOMINAL PAIN ASSOCIATED WITH LOOKING PALE? YES RADIO BUTTON
	@FindBy (xpath=("(//label[@for='QR~QID131#1~19~1'])[1]"))
	public WebElement isAbdominalPainAssociatedWithLookingPaleYesRadioButton;
		
	/*
	 * --------------- END OF  PLEASE COMPLETE THE NEXT SET OF QUESTIONS REGARDING ABDOMINAL PAIN. PAGE ---------------
	 */
				
	/*
	 * --------------- BEGINNING OF HOW MANY MEDICATIONS HAVE BEEN TAKEN FOR ABDOMINAL PAIN? PAGE ---------------
	 */
				
	//HOW MANY MEDIATIONS HAVE BEEN TAKEN FOR ABDOMINAL? 2 DROP DOWN
	@FindBy (xpath= ("//select[@data-runtime-value='runtime.Selected']"))
	public WebElement howManyMediationsHaveBeenTakenForAbdominalDropDown;
				
	/*
	 * --------------- END OF HOW MANY MEDICATIONS HAVE BEEN TAKEN FOR ABDOMINAL PAIN? PAGE ---------------
	 */	
	
	/*
	 * --------------- BEGINNING OF PLEASE COMPLETE THE TABLE BELOW REGARDING THE MEDICATIONS TAKEN FOR ABDOMINAL PAIN TO THE BEST OF YOUR ABILITY. PAGE ---------------
	 */

	// PLEASE INCLUDE AGE WHEN EACH MEDICATION WAS TAKEN? #1 TEXT BOX
	@FindBy(xpath = ("//tbody/tr/td[3]/input[1]"))
	public WebElement pleaseIncludeAgeWhenEachAbdominalMedicationWasTakenTextBox;

	// PLEASE SPECIFY THE MEDICATION NAME. #1 TEXT BOX
	@FindBy(xpath = ("//tbody/tr/td[4]/input[1]"))
	public WebElement pleaseSpecifyTheAbdominalMedicationNameTextBox;

	// PLEASE INCLUDE AS MANY DETAILS AS YOU CAN RECALL #1 TEXT BOX
	@FindBy(xpath = ("//textarea[@type='text']"))
	public WebElement pleaseIncludeAbdominalDetailsTextBox;

	/*
	 * --------------- END OF PLEASE COMPLETE THE TABLE BELOW REGARDING THE
	 * MEDICATIONS TAKEN FOR ABDOMINAL PAIN TO THE BEST OF YOUR ABILITY. PAGE
	 * ---------------
	 */	
				
	/*
	 * --------------- BEGINNING OF PLEASE COMPLETE THE NEXT SET OF QUESTIONS REGARDING VOMITING. PAGE ---------------
	 */

	//EVER HAD AT LEAST 2 MONTHS WITH 1 OR MORE EPISODES OF VOMITING PER WEEK? YES RADIO BUTTON
	@FindBy (xpath=("(//label[@for='QR~QID134#1~1~1'])[1]"))
	public WebElement everHadAtLeast2MonthsWith1OrMoreEpisodesOfVomitingPerWeekYesRadioButton;
				
	//IS VOMITING EVER SELF-INDUCED? YES RADIO BUTTON
	@FindBy (xpath=("(//label[@for='QR~QID134#1~2~1'])[1]"))
	public WebElement isVomitingEverSelfInducedYesRadioButton;
				
	//IS VOMITING RELATED TO MEDICATION, SURGERY OR OTHER HEALTH ISSUE? YES RADIO BUTTON
	@FindBy (xpath= ("(//label[@for='QR~QID134#1~3~1'])[1]"))
	public WebElement isVomitingRelatedToMedicationSurgeryOrOtherHealthIssueYesRadioButton;
				
	//EVER HAVE 2 OR MORE EPISODES OF INTENSE NAUSEA AND VOMITING THAT LASTS HOURS TO DAYS WITHIN A 6-MONTH PERIOD? YES RADIO BUTTON
	@FindBy (xpath=("(//label[@for='QR~QID134#1~4~1'])[1]"))
	public WebElement everHave2OrMoreEpisodesOfIntenseNauseaAndVomitingThatLastsHoursToDaysWithinA6MonthPeriodYesRadioButton;
				
	// DO EPISODES OF VOMITING SEEM SIMILAR TO EACH OTHER WHEN THEY OCCUR? YES RADIO BUTTON
	@FindBy (xpath= ("(//label[@for='QR~QID134#1~5~1'])[1]"))
	public WebElement doEpisodesOfVomitingSeemSimilarToEachOtherWhenTheyOccurYesRadioButton;
				
	//ARE THERE WEEKS TO MONTHS WITHOUT SYMPTOMS OF NAUSEA/VOMITING BETWEEN EPISODES? YES RADIO BUTTON
	@FindBy (xpath=("(//label[@for='QR~QID134#1~6~1'])[1]"))
	public WebElement areThereWeeksToMonthsWithoutSymptomsOfNauseaVomitingBetweenEpisodesYesRadioButton;
				
	//EVER VOMITED BLOOD? YES RADIO BUTTON
	@FindBy (xpath=("(//label[@for='QR~QID134#1~7~1'])[1]"))
	public WebElement everVomitedBloodYesRadioButton;
				
	/*
	 * --------------- END OF PLEASE COMPLETE THE NEXT SET OF QUESTIONS REGARDING VOMITING. PAGE ---------------
	 */
				
	/*
	 * --------------- BEGINNING OF HOW MANY MEDICATIONS HAVE BEEN TAKEN FOR VOMITING? PAGE ---------------
	 */
			
	//HOW MANY MEDICATIONS HAVE BEEN TAKEN FOR VOMITING? 2 DROP DOWN
	@FindBy (xpath= ("(//select[@name='QR~QID342'])[1]"))
	public WebElement howManyMedicationsHaveBeenTakenForVomitingDropDown;
	
	/*
	 * --------------- END OF HOW MANY MEDICATIONS HAVE BEEN TAKEN FOR VOMITING? PAGE ---------------
	 */
				
	/*
	 * --------------- BEGINNING OF PLEASE COMPLETE THE LIST BELOW BY DESCRIBING ANY MEDICATIONS TAKEN FOR VOMITING AND THE AGE WHEN THESE MEDICATIONS WERE TAKEN. PAGE ---------------
	 */
				
	//PLEASE INCLUDE AGE WHEN EACH MEDICATION WAS TAKEN. TEXT BOX
	@FindBy (xpath=("//tbody/tr/td[3]/input[1]"))
	public WebElement pleaseIncludeAgeWhenEachVommitingMedicationWasTakenTextBox;
				
    //PLEASE SPECIFY NAME OF MEDICATION TAKEN FOR VOMITING. TEXT BOX
	@FindBy (xpath= ("//tbody/tr/td[4]/input[1]"))
	public WebElement pleaseSpecifyNameOfVommitingMedicationTakenForVomitingTextBox;
	
	//PLEASE INCLUDE AGE WHEN EACH MEDICATION2 WAS TAKEN. TEXT BOX
	@FindBy (xpath=("(//input[@name='QR~QID135#1~2~1~TEXT'])[1]"))
	public WebElement pleaseIncludeAgeWhenEachMedication2WasTakenTextBox;
	
	//PLEASE SPECIFY NAME OF MEDICATION2 TAKEN FOR VOMITING. TEXT BOX
	@FindBy (xpath= ("(//input[@name='QR~QID135#1~2~2~TEXT'])[1]"))
	public WebElement pleaseSpecifyNameOfMedication2TakenForVomitingTextBox;
				
	/*
	 * --------------- END OF PLEASE COMPLETE THE LIST BELOW BY DESCRIBING ANY MEDICATIONS TAKEN FOR VOMITING AND THE AGE WHEN THESE MEDICATIONS WERE TAKEN. PAGE ---------------
	 */
				
	/*
	 * --------------- BEGINNING OF PLEASE ANSWER THE BELOW QUESTIONS REGARDING JAUNDICE (YELLOWING OF THE SKIN). PAGE ---------------
	 */
	
	//WHAT AGE DID JAUNDICE OCCUR? PLEASE SPECIFY IF DAYS/WEEKS/MONTHS/YEARS OLD. 1 DAY TEXT BOX
	@FindBy (xpath= ("(//input[@name='QR~QID138~1~TEXT'])[1]"))
	public WebElement whatAgeDidJaundiceOccurPleaseSpecifyIfDaysWeeksMonthsYearsOld1DayTextBox;
				
	// HOW LONG DID JAUNDICE LAST? TEXT BOX
	@FindBy (xpath=("(//input[@name='QR~QID138~2~TEXT'])[1]"))
	public WebElement howLongDidJaundiceLastTextBox;
				
	/*
	 * --------------- END OF PLEASE ANSWER THE BELOW QUESTIONS REGARDING JAUNDICE (YELLOWING OF THE SKIN). PAGE ---------------
	 */
		
	/*
	 * --------------- BEGINNING OF TO WHAT FOODS ARE YOU AVERSE? DESCRIBE FOODS THAT YOU AVOID BECAUSE YOU DO NOT LIKE THE TEXTURE OR OTHER PHYSICAL QUALITIES OF THE FOOD. PAGE ---------------
	 */
				
	//DESCRIBE FOODS THAT YOU AVOID BECAUSE YOU DO NOT LIKE THE TEXTURE OR OTHER PHYSICAL QUALITIES OF THE FOOD. EGGS TEXT BOX
	@FindBy (xpath= ("(//input[@name='QR~QID141~TEXT'])[1]"))
	public WebElement describeFoodsThatYouAvoidBecauseYouDoNotLikeTheTextureOrOtherPhysicalQualitiesOfTheFoodEggsTextBox;
				
	/*
	 * --------------- END OF TO WHAT FOODS ARE YOU AVERSE? DESCRIBE FOODS THAT YOU AVOID BECAUSE YOU DO NOT LIKE THE TEXTURE OR OTHER PHYSICAL QUALITIES OF THE FOOD. PAGE ---------------
	 */
	
	/*
	 * --------------- BEGINNING OF PLEASE ANSWER THE NEXT TWO QUESTIONS ABOUT DIARRHEA.   PAGE ---------------
	 */
	
	// IS THERE URGENCY (NEED TO RUSH TO GO TO THE BATHROOM)? YES RADIO BUTTON
	@FindBy (xpath= ("(//label[@for='QR~QID142#1~1~1'])[1]"))
	public WebElement isThereUrgencyNeedToRushToGoToTheBathroomYesRadioButton;
				
	//DOES DIARRHEA OCCUR WITH CRAMPY LOWER BELLY PAIN? YES, RADIO BUTTON
	@FindBy (xpath = ("(//label[@for='QR~QID142#1~2~1'])[1]"))
	public WebElement doesDiarrheaOccurWithCrampyLowerBellyPainYesRadioButton;
				
	//IS THE DIARRHEA EVER BLOODY? YES, RADIO BUTTON
	@FindBy (xpath= ("(//label[@for='QR~QID142#1~3~1'])[1]"))
	public WebElement isTheDiarrheaEverBloodyYesRadioButton;
				
	/*
	 * --------------- END OF PLEASE ANSWER THE NEXT TWO QUESTIONS ABOUT DIARRHEA.   PAGE ---------------
	 */
				
	/*
	 * --------------- BEGINNING OF PLEASE COMPLETE THE TABLE BELOW REGARDING DIARRHEA. IF MEDICATIONS HAVE NEVER BEEN USED, PLEASE PUT 'N/A' IN THE BOX. PAGE ---------------
	 */
	
	//WHEN DIARRHEA OCCURS, HOW MANY EPISODES OCCUR IN ONE DAY? TEXT BOX
	@FindBy (xpath = ("(//input[@name='QR~QID143~1~TEXT'])[1]"))
	public WebElement whenDiarrheaOccursHowManyEpisodesOccurInOneDayTextBox;
				
	//WHAT MEDICATIONS HAVE BEEN USED TO TREAT DIARRHEA? TEXT BOX
	@FindBy(xpath = ("//input[@name='QR~QID143~2~TEXT']"))
	public WebElement whatMedicationsHaveBeenUsedToTreatDiarrheaTextBox;
				
	//AT WHAT AGE WERE MEDICATIONS USED TO TREAT DIARRHEA? TEXT BOX
	@FindBy (xpath=("(//input[@name='QR~QID143~3~TEXT'])[1]"))
	public WebElement atWhatAgeWereMedicationsUsedToTreatDiarrheaTextBox;
				
	/*
	 * --------------- END OF PLEASE COMPLETE THE TABLE BELOW REGARDING DIARRHEA. IF MEDICATIONS HAVE NEVER BEEN USED, PLEASE PUT 'N/A' IN THE BOX. PAGE ---------------
	 */
				
	/*
	 * --------------- BEGINNING OF PLEASE COMPLETE THE TABLE REGARDING CONSTIPATION. PAGE ---------------
	 */
	
	//TWO OR FEWER BOWEL MOVEMENTS PER WEEK. YES RADIO BUTTON
	@FindBy (xpath=("(//label[@for='QR~QID144#1~1~1'])[1]"))
	public WebElement twoOrFewerBowelMovementsPerWeekYesRadioButton;
				
	// ONE OR MORE STOOL ACCIDENTS OR STOOL INCONTINENCE PER WEEK. YES RADIO BUTTON
	@FindBy (xpath=("(//label[@for='QR~QID144#1~2~1'])[1]"))
	public WebElement oneOrMoreStoolAccidentsOrStoolIncontinencePerWeekYesRadioButton;
				
	//POSTURING OR EXCESSIVE ATTEMPTS TO AVOID HAVING A BOWEL MOVEMENT. YES RADIO BUTTON
	@FindBy (xpath=("(//label[@for='QR~QID144#1~3~1'])[1]"))
	public WebElement posturingOrExcessiveAttemptsToAvoidHavingABowelMovementYesRadioButton;
				
	//PAINFUL OR HARD BOWEL MOVEMENTS. YES RADIO BUTTON
	@FindBy (xpath=("//label[@for='QR~QID144#1~4~1']"))
	public WebElement painfulOrHardBowelMovementsYesRadioButton;
				
	//HISTORY OF STOOL IMPACTION. YES RADIO BUTTON
	@FindBy (xpath=("//label[@for='QR~QID144#1~5~1']"))
	public WebElement historyOfStoolImpactionYesRadioButton;
				
	//LARGE BOWEL MOVEMENTS THAT CLOG THE TOILET. YES RADIO BUTTON
	@FindBy (xpath=("//label[@for='QR~QID144#1~6~1']"))
	public WebElement largeBowelMovementsThatClogTheToiletYesRadioButton;
				
	//BLOOD ON TOILET PAPER OR IN THE STOOL. YES RADIO BUTTON
	@FindBy (xpath=("//label[@for='QR~QID144#1~7~1']"))
	public WebElement bloodOnToiletPaperOrInTheStoolYesRadioButton;
				
	//HAVING BOWEL MOVEMENTS IN PLACES INAPPROPRIATE OR NOT SOCIALLY ACCEPTABLE. YES RADIO BUTTON
	@FindBy (xpath=("//label[@for='QR~QID144#1~8~1']"))
	public WebElement havingBowelMovementsInPlacesInappropriateOrNotSociallyAcceptableYesRadioButton;
				
	/*
	 * --------------- END OF PLEASE COMPLETE THE TABLE REGARDING CONSTIPATION. PAGE ---------------
	 */
				
	/*
	 * --------------- BEGINNING OF PLEASE COMPLETE THE TABLE BELOW REGARDING ENCOPRESIS. IF MEDICATIONS HAVE NEVER BEEN USED, PLEASE PUT 'N/A' IN THE BOX. PAGE ---------------
	 */
	
	//WHAT MEDICATIONS HAVE BEEN USED TO TREAT ENCOPRESIS? TEXT BOX
	@FindBy (xpath=("//input[@name='QR~QID145~1~TEXT']"))
	public WebElement whatMedicationsHaveBeenUsedToTreatEncopresisTextBox;
				
	//AT WHAT AGE WERE THESE MEDICATIONS USED? TEXT BOX
	@FindBy (xpath= ("//input[@name='QR~QID145~2~TEXT']"))
	public WebElement atWhatAgeWereTheseMedicationsUsedTextBox;
				
	/*
	 * --------------- END OF PLEASE COMPLETE THE TABLE BELOW REGARDING ENCOPRESIS. IF MEDICATIONS HAVE NEVER BEEN USED, PLEASE PUT 'N/A' IN THE BOX. PAGE ---------------
	 */
				
	/*
	 * --------------- BEGINNING OF PLEASE COMPLETE THE TABLE BELOW REGARDING WEIGHT LOSS. PAGE ---------------
	 */
				
	//HOW MUCH WEIGHT HAS BEEN LOST? TEXT BOX
	@FindBy (xpath=("//input[@name='QR~QID146~1~TEXT']"))
	public WebElement howMuchWeightHasBeenLostTextBox;
	
	//OVER WHAT TIME PERIOD DID THIS WEIGHT LOSS OCCUR? TEXT BOX
	@FindBy (xpath= ("//input[@name='QR~QID146~2~TEXT']"))
	public WebElement overWhatTimePeriodDidThisWeightLossOccur30DaysTextBox;
				
	//HAS THE WEIGHT BEEN GAINED BACK? YES/NO. TEXT BOX
	@FindBy (xpath= ("//input[@name='QR~QID146~3~TEXT']"))
	public WebElement hasTheWeightBeenGainedBackYesNoYesTextBox;
				
	/*
	 * --------------- END OF PLEASE COMPLETE THE TABLE BELOW REGARDING WEIGHT LOSS. PAGE ---------------
	 */
				
	/*
	 * --------------- BEGINNING PLEASE COMPLETE THE INFORMATION BELOW REGARDING DECREASED APPETITE.  PAGE ---------------
	 */
				
	//HAS DECREASED APPETITE CAUSED WEIGHT LOSS OR POOR GROWTH? YES RADIO BUTTON
	@FindBy (xpath=("//label[@for='QR~QID147#1~1~1']"))
	public WebElement hasDecreasedAppetiteCausedWeightLossOrPoorGrowthYesRadioButton;
				
	//HAVE NUTRITIONAL SUPPLEMENTS/FEEDS EVER BEEN TAKEN OR RECEIVED? YES, RADIO BUTTON
	@FindBy (xpath=("//label[@for='QR~QID147#2~1~1']"))
	public WebElement haveNutritionalSupplementsFeedsEverBeenTakenOrReceivedYesRadioButton;
				
	//WHAT SUPPLEMENTAL NUTRITION HAVE BEEN TAKEN? PLEASE SELECT ALL THAT APPLY. DRINK PEDIASURE CHECK BOX
	@FindBy (xpath=("//label[@for='QR~QID147#3~1~1']"))
	public WebElement whatSupplementalNutritionHaveBeenTakenPleaseSelectAllThatApplyDrinkPediasureCheckBox;
	
	//WHAT SUPPLEMENTAL NUTRITION HAVE BEEN TAKEN? PLEASE SELECT ALL THAT APPLY. TUBE FEEDING CHECK BOX
	@FindBy (xpath=("//label[@for='QR~QID147#3~1~2']"))
	public WebElement whatSupplementalNutritionHaveBeenTakenPleaseSelectAllThatApplyTubeFeedingCheckBox;
	
	//WHAT SUPPLEMENTAL NUTRITION HAVE BEEN TAKEN? PLEASE SELECT ALL THAT APPLY. TPN CHECK BOX
	@FindBy (xpath=("//label[@for='QR~QID147#3~1~3']"))
	public WebElement whatSupplementalNutritionHaveBeenTakenPleaseSelectAllThatApplyTPNCheckBox;
				
	/*
	 * --------------- END PLEASE COMPLETE THE INFORMATION BELOW REGARDING DECREASED APPETITE.  PAGE ---------------
	 */
	
	/*
	 * --------------- BEGINNING OF AT WHAT AGE (APPROXIMATELY) WERE YOU TOILET TRAINED? PAGE ---------------
	 */
	
	//AT WHAT AGE (APPROXIMATELY) WERE YOU TOILET TRAINED? DROP DOWN
	@FindBy (xpath=("(//select[@name='QR~QID150'])[1]"))
	public WebElement atWhatAgeApproximatelyWereYouToiletTrainedDropDown;
				
	/*
	 * --------------- END OF AT WHAT AGE (APPROXIMATELY) WERE YOU TOILET TRAINED? PAGE ---------------
	 */
				
	/*
	 * --------------- BEGINNING OF PLEASE COMPLETE THE INFORMATION BELOW REGARDING URINATION. PAGE ---------------
	 */
				
	//IS THE TOILET CONSISTENTLY USED FOR ALL URINATION? YES RADIO BUTTON
	@FindBy (xpath=("//label[@for='QR~QID326#1~1~1']"))
	public WebElement isTheToiletConsistentlyUsedForAllUrinationYesRadioButton;
				
	//HAVE THERE BEEN ANY EPISODES OF REPEATED URINARY ACCIDENTS AFTER BEING TOILET TRAINED? YES RADIO BUTTON
	@FindBy (xpath=("//label[@for='QR~QID326#2~1~1']"))
	public WebElement haveThereBeenAnyEpisodesOfRepeatedUrinaryAccidentsAfterBeingToiletTrainedYesRadioButton;
				
	/*
	 * --------------- END OF PLEASE COMPLETE THE INFORMATION BELOW REGARDING URINATION. PAGE ---------------
	 */
				
	/*
	 * --------------- BEGINNING OF  PLEASE COMPLETE THE INFORMATION BELOW REGARDING BOWEL MOVEMENTS. PAGE ---------------
	 */
				
	//IS THE TOILET CONSISTENTLY USED FOR ALL BOWEL MOVEMENTS? YES RADIO BUTTON
	@FindBy (xpath= ("//label[@for='QR~QID328#1~1~1']"))
	public WebElement isTheToiletConsistentlyUsedForAllBowelMovementsYesRadioButton;
				
	//HAVE THERE BEEN ANY EPISODES OF REPEATED BOWEL MOVEMENT ACCIDENTS AFTER BEING TOILET TRAINED? YES RADIO BUTTON
	@FindBy (xpath=("//label[@for='QR~QID328#2~1~1']"))
	public WebElement haveThereBeenAnyEpisodesOfRepeatedBowelMovementAccidentsAfterBeingToiletTrainedYesRadioButton;
				
	//IS THERE PAIN WITH BOWEL MOVEMENTS? YES RADIO BUTTON
	@FindBy (xpath= ("//label[@for='QR~QID328#3~1~1']"))
	public WebElement isTherePainWithBowelMovementsYesRadioButton;
				
	/*
	 * --------------- END OF  PLEASE COMPLETE THE INFORMATION BELOW REGARDING BOWEL MOVEMENTS. PAGE ---------------
	 */
				
	/*
	 * --------------- BEGINNING OF HOW MANY BOWEL MOVEMENTS DO YOU HAVE PER WEEK? PAGE ---------------
	 */
				
	//BEGIN HOW MANY BOWEL MOVEMENTS DO YOU HAVE PER WEEK?  DROP DOWN
	@FindBy (xpath= ("//select[contains(@name,'QR~QID154')]"))
	public WebElement howManyBowelMovementsDoYouHavePerWeekDropDown;
				
	/*
	 * --------------- END OF HOW MANY BOWEL MOVEMENTS DO YOU HAVE PER WEEK? PAGE ---------------
	 */
				
	/*
	 * --------------- BEGINNING OF WHAT IS THE LONGEST AMOUNT OF TIME THAT HAS PASSED WITHOUT YOU HAVING A BOWEL MOVEMENT? PAGE ---------------
	 */
				
	//WHAT IS THE LONGEST AMOUNT OF TIME THAT HAS PASSED WITHOUT YOU HAVING A BOWEL MOVEMENT? DROP DOWN
	@FindBy (xpath=("//select[contains(@name,'QR~QID155')]"))
	public WebElement whatIsTheLongestAmountOfTimeThatHasPassedWithoutYouHavingABowelMovementDropDown;
				
	/*
	 * --------------- END OF WHAT IS THE LONGEST AMOUNT OF TIME THAT HAS PASSED WITHOUT YOU HAVING A BOWEL MOVEMENT? PAGE ---------------
	 */
				
	/*
	 * --------------- BEGINNING OF PLEASE USE THE BRISTOL STOOL CHART SHOWN BELOW AND SELECT THE CHOICE THAT BEST REPRESENTS WHAT TYPICAL BOWEL MOVEMENTS LOOK LIKE. PAGE ---------------
	 */
				
	//BRISTOL STOOL CHART SHOWN BELOW AND SELECT THE CHOICE THAT BEST REPRESENTS WHAT TYPICAL BOWEL MOVEMENTS LOOK LIKE. TYPE 1 RADIO BUTTON
	@FindBy (xpath = ("//span[contains(text(),'Type 1')]"))
	public WebElement bristolStoolChartShownBelowAndSelectTheChoiceThatBestRepresentsWhatTypicalBowelMovementsLookLikeType1RadioButton;
				
	/*
	 * --------------- END PLEASE USE THE BRISTOL STOOL CHART SHOWN BELOW AND SELECT THE CHOICE THAT BEST REPRESENTS WHAT TYPICAL BOWEL MOVEMENTS LOOK LIKE. PAGE ---------------
	 */
		
	/*
	 * --------------- BEGINNING OF PLEASE INDICATE WHICH OF THE FOLLOWING PROCEDURES HAVE BEEN PERFORMED. PLEASE SELECT ALL THAT APPLY. PAGE ---------------
	 */
							
	//PLEASE INDICATE WHICH OF THE FOLLOWING PROCEDURES HAVE BEEN PERFORMED. PLEASE SELECT ALL THAT APPLY. OTHER GI TEST (PLEASE SPECIFY) EXAM TEXT BOX
	@FindBy (xpath=("//input[contains(@title,'Other GI test (please specify)')]"))
	public WebElement pleaseIndicateWhichOfTheFollowingProceduresHaveBeenPerformedPleaseSelectAllThatApplyOtherGITestPleaseSpecifyExamTextBox;

	/*
	 * --------------- END OF PLEASE INDICATE WHICH OF THE FOLLOWING PROCEDURES HAVE BEEN PERFORMED. PLEASE SELECT ALL THAT APPLY. PAGE ---------------
	 */
				
	/*
	 * --------------- BEGINNING OF PLEASE PROVIDE THE INFORMATION BELOW FOR THE FIRST PROCEDURE OF EACH KIND THAT WAS PERFORMED. 
	 *  IN THE NEXT QUESTION, WE WILL ASK ABOUT THE MOST RECENT PROCEDURE AND ANY FINDINGS. PAGE ---------------
	 */
				
	//DIGITAL RECTAL EXAM(MM/YY) OR DON'T KNOW TEXT BOX
	@FindBy (xpath=("//tbody/tr[1]/td[3]/input[1]"))
	public WebElement digitalRectalExamMmYyOrDontKnowTextBox;
				
	//DIGITAL RECTAL EXAM EX. PAIN, ETC TEST TEXT BOX
	@FindBy (xpath=("(//input[contains(@type,'text')])[2]"))
	public WebElement digitalRectalExamexPainEtcTestTextBox;
				
	//DIGITAL RECTAL EXAM EX. POLYP, ULCER TEST TEXT BOX
	@FindBy (xpath=("(//input[contains(@type,'text')])[3]"))
	public WebElement digitalRectalExamexPolypUlcerTestTextBox;
				
	//DIGITAL RECTAL EXAM HOSPITAL NAME, CITY, STATE/PROVINCE, COUNTRY TEXT BOX
	@FindBy (xpath=("(//input[contains(@type,'text')])[4]"))
	public WebElement digitalRectalExamhospitalNameCityStateProvinceCountryTextBox;
				
	//DIGITAL RECTAL EXAM PLEASE SELECT THIS COLUMN IF ONLY ONE PROCEDURE HAS BEEN PERFORMED RADIO BUTTON
	@FindBy (xpath=("(//label[contains(@for,'QR~QID160#5~x1~1')])[1]"))
	public WebElement digitalRectalExampleaseSelectThisColumnIfOnlyOneProcedureHasBeenPerformedRadioButton;
				
	//UPPER ENDOSCOPY (MM/YY) OR DON'T KNOW TEXT BOX
	@FindBy (xpath=("(//input[contains(@type,'text')])[5]"))
	public WebElement upperEndoscopymMYYOrDontKnowTextBox;
				
	//UPPER ENDOSCOPY  EX. PAIN, ETC TEST TEXT BOX
	@FindBy (xpath=("(//input[contains(@type,'text')])[6]"))
	public WebElement upperEndoscopyExPainEtcTestTextBox;
				
	//UPPER ENDOSCOPY  EX. POLYP, ULCER TEST TEXT BOX
	@FindBy (xpath=("(//input[contains(@type,'text')])[7]"))
	public WebElement upperEndoscopyexPolypUlcerTestTextBox;
				
	//UPPER ENDOSCOPY  HOSPITAL NAME, CITY, STATE/PROVINCE, COUNTRY TEXT BOX
	@FindBy (xpath=("(//input[contains(@type,'text')])[8]"))
	public WebElement upperEndoscopyHospitalNameCityStateProvinceCountryTextBox;
				
	//UPPER ENDOSCOPY  PLEASE SELECT THIS COLUMN IF ONLY ONE PROCEDURE HAS BEEN PERFORMED RADIO BUTTON
	@FindBy (xpath=("(//label[contains(@for,'QR~QID160#5~x2~1')])[1]"))
	public WebElement upperEndoscopyPleaseSelectThisColumnIfOnlyOneProcedureHasBeenPerformedRadioButton;

	//COLONOSCOPY (MM/YY) OR DON'T KNOW TEXT BOX
	@FindBy (xpath=("(//input[contains(@type,'text')])[9]"))
	public WebElement colonoscopyMmYyOrDontKnowTextBox;
				
	//COLONOSCOPY EX. PAIN, ETC TEST TEXT BOX
	@FindBy (xpath=("(//input[contains(@type,'text')])[10]"))
	public WebElement colonoscopyExPainEtcTestTextBox;
				
	//COLONOSCOPY EX. POLYP, ULCER TEST TEXT BOX
	@FindBy (xpath=("(//input[contains(@type,'text')])[11]"))
	public WebElement colonoscopyExPolypUlcerTestTextBox;
				
	//COLONOSCOPY HOSPITAL NAME, CITY, STATE/PROVINCE, COUNTRY TEXT BOX
	@FindBy (xpath=("(//input[contains(@type,'text')])[12]"))
	public WebElement colonoscopyHospitalNameCityStateProvinceCountryTextBox;
				
	//COLONOSCOPY PLEASE SELECT THIS COLUMN IF ONLY ONE PROCEDURE HAS BEEN PERFORMED RADIO BUTTON
	@FindBy (xpath=("(//label[contains(@for,'QR~QID160#5~x3~1')])[1]"))
	public WebElement colonoscopyPleaseSelectThisColumnIfOnlyOneProcedureHasBeenPerformedRadioButton;
				
	//ANORECTAL MANOMETRY (MM/YY) OR DON'T KNOW TEXT BOX
	@FindBy (xpath=("(//input[contains(@type,'text')])[13]"))
	public WebElement anorectalManometryMmYyOrDontKnowTextBox;
				
	//ANORECTAL MANOMETRY  EX. PAIN, ETC TEST TEXT BOX
	@FindBy (xpath=("(//input[contains(@type,'text')])[14]"))
	public WebElement anorectalManometryExPainEtcTestTextBox;
				
	//ANORECTAL MANOMETRY  EX. POLYP, ULCER TEST TEXT BOX
	@FindBy (xpath=("(//input[contains(@type,'text')])[15]"))
	public WebElement anorectalManometryExPolypUlcerTestTextBox;
				
	//ANORECTAL MANOMETRY  HOSPITAL NAME, CITY, STATE/PROVINCE, COUNTRY TEXT BOX
	@FindBy (xpath=("(//input[contains(@type,'text')])[16]"))
	public WebElement anorectalManometryHospitalNameCityStateProvinceCountryTextBox;
				
	//ANORECTAL MANOMETRY PLEASE SELECT THIS COLUMN IF ONLY ONE PROCEDURE HAS BEEN PERFORMED RADIO BUTTON
	@FindBy (xpath=("(//label[contains(@for,'QR~QID160#5~x4~1')])[1]"))
	public WebElement anorectalManometryPleaseSelectThisColumnIfOnlyOneProcedureHasBeenPerformedRadioButton;
				
	//PH PROBE OR IMPEDANCE STUDY (MM/YY) OR DON'T KNOW TEXT BOX
	@FindBy (xpath=("(//input[contains(@type,'text')])[17]"))
	public WebElement phProbeOrImpedanceStudyMmYyOrDontKnowTextBox;
				
	//PH PROBE OR IMPEDANCE STUDY EX. PAIN, ETC TEST TEXT BOX
	@FindBy (xpath=("(//input[contains(@type,'text')])[18]"))
	public WebElement phProbeOrImpedanceStudyExPainEtcTestTextBox;
				
	//PH PROBE OR IMPEDANCE STUDY EX. POLYP, ULCER TEST TEXT BOX
	@FindBy (xpath=("(//input[contains(@type,'text')])[19]"))
	public WebElement phProbeOrImpedanceStudyExPolypUlcerTestTextBox;
				
	//PH PROBE OR IMPEDANCE STUDY HOSPITAL NAME, CITY, STATE/PROVINCE, COUNTRY TEXT BOX
	@FindBy (xpath=("(//input[contains(@type,'text')])[20]"))
	public WebElement phProbeOrImpedanceStudyHospitalNameCityStateProvinceCountryTextBox;
				
	//PH PROBE OR IMPEDANCE STUDY PLEASE SELECT THIS COLUMN IF ONLY ONE PROCEDURE HAS BEEN PERFORMED RADIO BUTTON
	@FindBy (xpath=("(//label[contains(@for,'QR~QID160#5~x5~1')])[1]"))
	public WebElement phProbeOrImpedanceStudyPleaseSelectThisColumnIfOnlyOneProcedureHasBeenPerformedRadioButton;
				
	//UPPER GI SWALLOW STUDY(MM/YY) OR DON'T KNOW TEXT BOX
	@FindBy (xpath=("(//input[contains(@type,'text')])[21]"))
	public WebElement upperGiSwallowStudyMmYyOrDontKnowTextBox;
				
	//UPPER GI SWALLOW STUDY EX. PAIN, ETC TEST TEXT BOX
	@FindBy (xpath=("(//input[contains(@type,'text')])[22]"))
	public WebElement upperGiSwallowStudyExPainEtcTestTextBox;
				
	//UPPER GI SWALLOW STUDY EX. POLYP, ULCER TEST TEXT BOX
	@FindBy (xpath=("(//input[contains(@type,'text')])[23]"))
	public WebElement upperGiSwallowStudyExPolypUlcerTestTextBox;
				
	//UPPER GI SWALLOW STUDY HOSPITAL NAME, CITY, STATE/PROVINCE, COUNTRY TEXT BOX
	@FindBy (xpath=("(//input[contains(@type,'text')])[24]"))
	public WebElement upperGiSwallowStudyHospitalNameCityStateProvinceCountryTextBox;
				
	//UPPER GI SWALLOW STUDY PLEASE SELECT THIS COLUMN IF ONLY ONE PROCEDURE HAS BEEN PERFORMED RADIO BUTTON
	@FindBy (xpath=("(//label[contains(@for,'QR~QID160#5~x6~1')])[1]"))
	public WebElement upperGiSwallowStudyPleaseSelectThisColumnIfOnlyOneProcedureHasBeenPerformedRadioButton;
				
	//MODIFIED BARIUM SWALLOW STUDY (MM/YY) OR DON'T KNOW TEXT BOX
	@FindBy (xpath=("(//input[contains(@type,'text')])[25]"))
	public WebElement modifiedBariumSwallowStudyMmYyOrDontKnowTextBox;
				
	//MODIFIED BARIUM SWALLOW STUDY EX. PAIN, ETC TEST TEXT BOX
	@FindBy (xpath=("(//input[contains(@type,'text')])[26]"))
	public WebElement modifiedBariumSwallowStudyExPainEtcTestTextBox;
				
	//MODIFIED BARIUM SWALLOW STUDY EX. POLYP, ULCER TEST TEXT BOX
	@FindBy (xpath=("(//input[contains(@type,'text')])[27]"))
	public WebElement modifiedBariumSwallowStudyExPolypUlcerTestTextBox;
				
	//MODIFIED BARIUM SWALLOW STUDY HOSPITAL NAME, CITY, STATE/PROVINCE, COUNTRY TEXT BOX
	@FindBy (xpath=("(//input[contains(@type,'text')])[28]"))
	public WebElement modifiedBariumSwallowStudyHospitalNameCityStateProvinceCountryTextBox;
				
	//MODIFIED BARIUM SWALLOW STUDY PLEASE SELECT THIS COLUMN IF ONLY ONE PROCEDURE HAS BEEN PERFORMED RADIO BUTTON
	@FindBy (xpath=("(//label[contains(@for,'QR~QID160#5~x7~1')])[1]"))
	public WebElement modifiedBariumSwallowStudyPleaseSelectThisColumnIfOnlyOneProcedureHasBeenPerformedRadioButton;
				
	//GASTRIC EMPTYING STUDY (MM/YY) OR DON'T KNOW TEXT BOX
	@FindBy (xpath=("(//input[contains(@type,'text')])[29]"))
	public WebElement gastricEmptyingStudyMmYyOrDontKnowTextBox;
				
	//GASTRIC EMPTYING STUDY EX. PAIN, ETC TEST TEXT BOX
	@FindBy (xpath=("(//input[contains(@type,'text')])[30]"))
	public WebElement gastricEmptyingStudyExPainEtcTestTextBox;
				
	//GASTRIC EMPTYING STUDY EX. POLYP, ULCER TEST TEXT BOX
	@FindBy (xpath=("(//input[contains(@type,'text')])[31]"))
	public WebElement gastricEmptyingStudyExPolypUlcerTestTextBox;
				
	//GASTRIC EMPTYING STUDY HOSPITAL NAME, CITY, STATE/PROVINCE, COUNTRY TEXT BOX
	@FindBy (xpath=("(//input[contains(@type,'text')])[32]"))
	public WebElement gastricEmptyingStudyHospitalNameCityStateProvinceCountryTextBox;
				
	//GASTRIC EMPTYING STUDY PLEASE SELECT THIS COLUMN IF ONLY ONE PROCEDURE HAS BEEN PERFORMED RADIO BUTTON
	@FindBy (xpath=("(//label[contains(@for,'QR~QID160#5~x8~1')])[1]"))
	public WebElement gastricEmptyingStudyPleaseSelectThisColumnIfOnlyOneProcedureHasBeenPerformedRadioButton;
				
	//ANAL FISSURES EXAM (MM/YY) OR DON'T KNOW TEXT BOX
	@FindBy (xpath=("(//input[contains(@type,'text')])[33]"))
	public WebElement analFissuresExamMmYyOrDontKnowTextBox;
				
	//ANAL SEIZURES EXAM EX. PAIN, ETC TEST TEXT BOX
	@FindBy (xpath=("(//input[contains(@type,'text')])[34]"))
	public WebElement analFissuresExamExPainEtcTestTextBox;
				
	//ANAL SEIZURES EXAM EX. POLYP, ULCER TEST TEXT BOX
	@FindBy (xpath=("(//input[contains(@type,'text')])[35]"))
	public WebElement analFissuresExamExPolypUlcerTestTextBox;
				
	//ANAL SEIZURES EXAM HOSPITAL NAME, CITY, STATE/PROVINCE, COUNTRY TEXT BOX
	@FindBy (xpath=("(//input[contains(@type,'text')])[36]"))
	public WebElement analFissuresExamHospitalNameCityStateProvinceCountryTextBox;
				
	//ANAL SEIZURES EXAM PLEASE SELECT THIS COLUMN IF ONLY ONE PROCEDURE HAS BEEN PERFORMED RADIO BUTTON
	@FindBy (xpath=("(//label[contains(@for,'QR~QID160#5~x9~1')])[1]"))
	public WebElement analFissuresExamPleaseSelectThisColumnIfOnlyOneProcedureHasBeenPerformedRadioButton;
	
	/*
	 * --------------- END OF PLEASE PROVIDE THE INFORMATION BELOW FOR THE FIRST PROCEDURE OF EACH KIND THAT WAS PERFORMED. 
	 *  IN THE NEXT QUESTION, WE WILL ASK ABOUT THE MOST RECENT PROCEDURE AND ANY FINDINGS. PAGE ---------------
	 */

	/*
	 * --------------- BEGINNING OF PLEASE PROVIDE THE INFORMATION BELOW FOR THE PULMONOLOGIST WHO COMPLETED YOUR EVALUATION. PAGE ---------------
	 */
	
	//NAME OF PHYSICIAN TEXT BOX
	@FindBy (xpath=("//input[contains(@name,'QR~QID381~1~TEXT')]"))
	public WebElement nameOfPhysicianTextBox;
				
	//LOCATION (CITY, STATE, COUNTRY) TEXT BOX
	@FindBy (xpath=("//input[contains(@name,'QR~QID381~2~TEXT')]"))
	public WebElement locationPulmonologistCityStateCountryTextBox;
				
	//HOSPITAL AND MEDICAL CENTER AFFILIATION TEXT BOX
	@FindBy (xpath=("//input[contains(@name,'QR~QID381~3~TEXT')]"))
	public WebElement hospitalAndMedicalCenterAffiliationTestTextBox;
				
	/*
	 * --------------- END OF PLEASE PROVIDE THE INFORMATION BELOW FOR THE PULMONOLOGIST WHO COMPLETED YOUR EVALUATION. PAGE ---------------
	 */
			
	/*
	 * ----------------- BEGINING OF PLEASE PROVIDE THE INFORMATION BELOW FOR WHERE DENTAL CARE IS RECEIVED. PAGE -----------------
	 */

	// NAME OF DENTIST TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[1]")
	public WebElement nameOfDentistTextBox;

	// CITY, STATE TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[2]")
	public WebElement cityStateTextBox;

	// MEDICAL CENTER OR MEDICAL/DENTAL GROUP AFFILIATION TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[3]")
	public WebElement medicalCenterOrDentalGroupAffiliationTextBox;

	/*
	 * ----------------- END OF PLEASE PROVIDE THE INFORMATION BELOW FOR WHERE DENTAL CARE IS RECEIVED. PAGE -----------------
	 */

	/*
	 * ----------------- BEGINING OF WHEN DID YOU LAST VISIT A DENTIST? PLEASE USE FORMAT MONTH/YEAR AS MM/YY. PAGE -----------------
	 */

	// WHEN DID YOU LAST VISIT A DENTIST? PLEASE USE FORMAT MONTH/YEAR AS MM/YY TEXT BOX
	@FindBy(xpath = "//input[@type='TEXT']")
	public WebElement whenDidYouLastVisitADentistTextBox;

	/*
	 * ----------------- END OF WHEN DID YOU LAST VISIT A DENTIST? PLEASE USE FORMAT MONTH/YEAR AS MM/YY. PAGE -----------------
	 */

	/*
	 * ----------------- BEGINING OF WHAT WAS THE REASON FOR YOUR LAST DENTAL VISIT? PAGE -----------------
	 */		

	// CLEANING OPTION RADIO BUTTON
	@FindBy(xpath = "//span[@class='LabelWrapper']//label[@for='QR~QID167~1']")
	public WebElement cleaningRadioButton;

	/*
	 * ----------------- END OF WHAT WAS THE REASON FOR YOUR LAST DENTAL VISIT? PAGE -----------------
	 */		

	/*
	 * ----------------- BEGINING OF OVERALL, HOW WOULD YOU RATE THE OVERALL HEALTH OF YOUR TEETH AND GUMS? PAGE -----------------
	 */

	// OVERALL, HOW WOULD YOU RATE THE OVERALL HEALTH OF YOUR TEETH AND GUMS? FAIR RADIO BUTTON
	@FindBy(xpath = "(//label[contains(@for,'QR~QID176~3')])[2]")
	public WebElement overallHealthOfTeethAndGumsFairRadioButton;

	/*
	 * ----------------- END OF OVERALL, HOW WOULD YOU RATE THE OVERALL HEALTH OF YOUR TEETH AND GUMS? PAGE -----------------
	 */

	/*
	 * ----------------- BEGINING OF Overall, how would you rate your dental hygiene routine (regular tooth brushing, flossing, and your home oral mouth rinse)? PAGE -----------------
	 */		

	// OVERALL, HOW WOULD YOU RATE YOUR DENTAL HYGIENE ROUTINE FAIR RADIO BUTTON
	@FindBy(xpath = "(//label[contains(@for,'QR~QID177~3')])[2]")
	public WebElement overallRateDentalHygeneFairRadioButton;

	/*
	 * ----------------- END OF OVERALL, HOW WOULD YOU RATE YOUR DENTAL HYGIENE ROUTINE (REGULAR TOOTH BRUSHING, FLOSSING, AND YOUR HOME ORAL MOUTH RINSE)? PAGE -----------------
	 */		

	/*
	 *  ----------------- BEGINING OF DID THE FACIAL OR DENTAL TRAUMA REQUIRE SURGERY? PAGE -----------------
	 */
		
	//DID THE FACIAL OR DENTAL TRAUMA REQUIRE SURGERY? YES (PLEASE SPECIFY)RADIO BUTTON
	@FindBy(xpath = "(//label[contains(@for,'QR~QID185~1')])[2]")
	public WebElement didTheFacialOrDentalTraumaRequireSurgeryYesRadioButton;
		
	/*
	 * ----------------- END OF DID THE FACIAL OR DENTAL TRAUMA REQUIRE SURGERY? PAGE -----------------
	 */
		
	/*
	 *  ----------------- BEGINING OF DO YOU HAVE A HISTORY OF CANCER IN THE MOUTH OR JAW?
	 * SOME EXAMPLES INCLUDE LYMPHOMA, MINOR SALIVARY GLAND, MUCOSAL MELANOMA, SARCOMA, OR SQUAMOUS CELL CARCINOMA PAGE -----------------
	 */
		
	//DO YOU HAVE A HISTORY OF CANCER IN THE MOUTH OR JAW? SOME EXAMPLES... YES RADIO BUTTON
	@FindBy(xpath = "(//label[contains(@for,'QR~QID189~1')])[2]")
	public WebElement doYouHaveAHistoryOfCancerInTheMouthOrJawYesRadioButton;
					
	/*
	 *  ----------------- END OF DO YOU HAVE A HISTORY OF CANCER IN THE MOUTH OR JAW?
	 * SOME EXAMPLES INCLUDE LYMPHOMA, MINOR SALIVARY GLAND, MUCOSAL MELANOMA, SARCOMA, OR SQUAMOUS CELL CARCINOMA PAGE -----------------
	 */
	
	/*
	 *  ----------------- BEGINING OF DO YOU HAVE A FAMILY MEMBER WITH A JAW ABNORMALITY? PAGE -----------------
	 */
		
	//DO YOU HAVE A FAMILY MEMBER WITH A JAW ABNORMALITY? YES (PLEASE SPECIFY) RADIO BUTTON
	@FindBy(xpath = "(//label[contains(@for,'QR~QID190~1')])[2]")
	public WebElement doYouHaveAFamilyMemberWithJawAbnormalityYesRadioButton;
				
	/*
	 * ----------------- END OF DO YOU HAVE A FAMILY MEMBER WITH A JAW ABNORMALITY? PAGE -----------------
	 */
				
	/*
	 *  ----------------- BEGINING OF OVERALL -- IS THERE ANYTHING UNUSUAL ABOUT YOUR TEETH OR MOUTH 
	 *  (EXTRA TEETH, MISSING TEETH, SEVERE DENTAL DISEASES, JAWBONE PROBLEMS, ENAMEL PROBLEMS, ETC.)? PAGE -----------------
	 */
					
	//OVERALL -- IS THERE ANYTHING UNUSUAL ABOUT YOUR TEETH OR MOUTH...? YES (PLEASE SPECIFY)RADIO BUTTON
	@FindBy(xpath = "(//label[contains(@for,'QR~QID195~1')])[2]")
	public WebElement overallIsThereAnythingUnusualAboutYourTeethOrMouthYesPleaseSpecifyWhatIsUnusualRadioButton;
		
	@FindBy(xpath = "(//input[contains(@title,'Yes (please specify what is unusual)')])[1]")
	public WebElement yesPleaseSpecifyWhatIsUnusualRadioButton;
				
	/*
	 * ----------------- END OF OVERALL -- IS THERE ANYTHING UNUSUAL ABOUT YOUR TEETH OR MOUTH 
	 * (EXTRA TEETH, MISSING TEETH, SEVERE DENTAL DISEASES, JAWBONE PROBLEMS, ENAMEL PROBLEMS, ETC.)? PAGE -----------------
	 */	
		
	/*
   	 *  ----------------- BEGINING OF HAVE YOU HAD TROUBLE PRONOUNCING ANY WORDS BECAUSE OF PROBLEMS WITH YOUR TEETH, MOUTH OR DENTURES? PAGE -----------------
	 */
					
	//HAVE YOU HAD TROUBLE PRONOUNCING ANY WORDS BECAUSE OF PROBLEMS WITH YOUR TEETH, MOUTH OR DENTURES? OCCASIONALLY RADIO BUTTON
	@FindBy(xpath = "(//label[contains(@for,'QR~QID196~3')])[2]")
	public WebElement troublePronouncingWordsBecauseOfProblemsWithTeethMouthOrDenturesOcassionallyRadioButton;
		
	/*
	 * ----------------- END OF HAVE YOU HAD TROUBLE PRONOUNCING ANY WORDS BECAUSE OF PROBLEMS WITH YOUR TEETH, MOUTH OR DENTURES? PAGE -----------------
	 */	
			
	/*
	 *  ----------------- BEGINING OF HAVE YOU FELT THAT YOUR SENSE OF TASTE HAS WORSENED BECAUSE OF PROBLEMS WITH YOUR TEETH, MOUTH OR DENTURES? PAGE -----------------
	 */
					
	//HAVE YOU FELT THAT YOUR SENSE OF TASTE HAS WORSENED BECAUSE OF PROBLEMS WITH YOUR TEETH, MOUTH OR DENTURES? OCCASIONALLY RADIO BUTTON
	@FindBy(xpath = "(//label[contains(@for,'QR~QID197~3')])[2]")
	public WebElement haveYouFeltYourSenseOfTasteWorsenedBecauseOfProblemsWithTeethMouthOrDenturesOcassionallyRadioButton;
		
	/*
	 * ----------------- END OF HAVE YOU FELT THAT YOUR SENSE OF TASTE HAS WORSENED BECAUSE OF PROBLEMS WITH YOUR TEETH, MOUTH OR DENTURES? PAGE -----------------
	 */
		
	/*
	 *  ----------------- BEGINING OF HAVE YOU HAD PAINFUL ACHING IN YOUR MOUTH? PAGE -----------------
	 */
					
	//HAVE YOU HAD PAINFUL ACHING IN YOUR MOUTH? OCCASIONALLY RADIO BUTTON
	@FindBy(xpath = "(//label[contains(@for,'QR~QID198~3')])[2]")
	public WebElement haveYouHadPainfulAchingInYourMouthOcassionallyRadioButton;
		
	/*
	 * ----------------- END OF HAVE YOU HAD PAINFUL ACHING IN YOUR MOUTH? PAGE -----------------
	 */
		
	/*
	 *  ----------------- BEGINING OF HAVE YOU FOUND IT UNCOMFORTABLE TO EAT ANY FOODS BECAUSE OF PROBLEMS WITH YOUR TEETH, MOUTH OR DENTURES? PAGE -----------------
	 */
					
	//HAVE YOU FOUND IT UNCOMFORTABLE TO EAT ANY FOODS BECAUSE OF PROBLEMS WITH YOUR TEETH, MOUTH OR DENTURES? OCCASIONALLY RADIO BUTTON
	@FindBy(xpath = "(//label[contains(@for,'QR~QID199~3')])[2]")
	public WebElement haveYouFoundItUnconfortableToEatFoodsBecauseOfProblemsWithTeethMouthOrDenturesOcassionallyRadioButton;
		
	/*
	 * ----------------- END OF HAVE YOU FOUND IT UNCOMFORTABLE TO EAT ANY FOODS BECAUSE OF PROBLEMS WITH YOUR TEETH, MOUTH OR DENTURES? PAGE -----------------
	 */
			
	/*
	 *  ----------------- BEGINING OF ARE YOU SELF-CONSCIOUS BECAUSE OF YOUR TEETH, MOUTH OR DENTURES? PAGE -----------------
	 */
					
	//ARE YOU SELF-CONSCIOUS BECAUSE OF YOUR TEETH, MOUTH OR DENTURES? OCCASIONALLY RADIO BUTTON
	@FindBy(xpath = "(//label[contains(@for,'QR~QID200~3')])[2]")
	public WebElement areYouSelfConsciousBecauseOfYourTeethMouthOrDenturesOccasionallyRadioButton;
		
	/*
	 * ----------------- END OF ARE YOU SELF-CONSCIOUS BECAUSE OF YOUR TEETH, MOUTH OR DENTURES? PAGE -----------------
	 */
		
	/*
	 *  ----------------- BEGINING OF HAVE YOU FELT TENSE BECAUSE OF PROBLEMS WITH YOUR TEETH, MOUTH OR DENTURES? PAGE -----------------
	 */
					
	//HAVE YOU FELT TENSE BECAUSE OF PROBLEMS WITH YOUR TEETH, MOUTH OR DENTURES? OCCASIONALLY RADIO BUTTON
	@FindBy(xpath = "(//label[contains(@for,'QR~QID201~3')])[2]")
	public WebElement haveYouFeltTenseBecauseOfProblemsWithYourTeethMouthOrDenturesOccasionallyRadioButton;
		
	/*
	 * ----------------- END OF HAVE YOU FELT TENSE BECAUSE OF PROBLEMS WITH YOUR TEETH, MOUTH OR DENTURES? PAGE -----------------
	 */
		
	/*
	 *  ----------------- BEGINING OF HAS YOUR DIET BEEN UNSATISFACTORY BECAUSE OF PROBLEMS WITH YOUR TEETH, MOUTH OR DENTURES? PAGE -----------------
	 */
					
	//HAS YOUR DIET BEEN UNSATISFACTORY BECAUSE OF PROBLEMS WITH YOUR TEETH, MOUTH OR DENTURES? OCCASIONALLY RADIO BUTTON
	@FindBy(xpath = "(//label[contains(@for,'QR~QID202~3')])[2]")
	public WebElement hasYourDietBeenUnsatisfactoryBecauseOfProblemsWithTeethMouthOrDenturesOccasionallyRadioButton;
		
	/*
	 * ----------------- END OF HAS YOUR DIET BEEN UNSATISFACTORY BECAUSE OF PROBLEMS WITH YOUR TEETH, MOUTH OR DENTURES? PAGE -----------------
	 */
		
	/*
	 *  ----------------- BEGINING OF HAVE YOU HAD TO INTERRUPT MEALS BECAUSE OF PROBLEMS WITH YOUR TEETH, MOUTH OR DENTURES? PAGE -----------------
	 */
					
	//HAVE YOU HAD TO INTERRUPT MEALS BECAUSE OF PROBLEMS WITH YOUR TEETH, MOUTH OR DENTURES? OCCASIONALLY RADIO BUTTON
	@FindBy(xpath = "(//label[contains(@for,'QR~QID203~3')])[2]")
	public WebElement haveYouHadToInterruptMealsBeacuseOfProblemsWithTeethMouthOrDenturesOccasionallyRadioButton;
		
	/*
	 * ----------------- END OF HAVE YOU HAD TO INTERRUPT MEALS BECAUSE OF PROBLEMS WITH YOUR TEETH, MOUTH OR DENTURES? PAGE -----------------
	 */
			
	/*
	 *  ----------------- BEGINING OF HAVE YOU FOUND IT DIFFICULT TO RELAX BECAUSE OF PROBLEMS WITH YOUR TEETH, MOUTH OR DENTURES? PAGE -----------------
	 */
					
	//HAVE YOU FOUND IT DIFFICULT TO RELAX BECAUSE OF PROBLEMS WITH YOUR TEETH, MOUTH OR DENTURES? OCCASIONALLY RADIO BUTTON
	@FindBy(xpath = "(//label[contains(@for,'QR~QID204~3')])[2]")
	public WebElement haveYouFoundItDifficultToRelaxBecauseOfProblemsWithTeethMouthOrDenturesOccasionallyRadioButton;
		
	/*
	 * ----------------- END OF HAVE YOU FOUND IT DIFFICULT TO RELAX BECAUSE OF PROBLEMS WITH YOUR TEETH, MOUTH OR DENTURES? PAGE -----------------
	 */
		
		
	/*
	 *  ----------------- BEGINING OF HAVE YOU BEEN A BIT EMBARRASSED BECAUSE OF PROBLEMS WITH YOUR TEETH, MOUTH OR DENTURES? PAGE -----------------
	 */
					
	//HAVE YOU BEEN A BIT EMBARRASSED BECAUSE OF PROBLEMS WITH YOUR TEETH, MOUTH OR DENTURES? OCCASIONALLY RADIO BUTTON
	@FindBy(xpath = "(//label[contains(@for,'QR~QID205~3')])[2]")
	public WebElement haveYouBeenABitEmbarrassedBecauseOfProblemsWithTeethMouthOrDenturesOccasionallyRadioButton;
		
	/*
	 * ----------------- END OF HAVE YOU BEEN A BIT EMBARRASSED BECAUSE OF PROBLEMS WITH YOUR TEETH, MOUTH OR DENTURES? PAGE -----------------
	 */
		
	/*
	 *  ----------------- BEGINING OF HAVE YOU BEEN IRRITABLE WITH OTHER PEOPLE BECAUSE OF PROBLEMS WITH YOUR TEETH, MOUTH OR DENTURES? PAGE -----------------
	 */
					
	//HAVE YOU BEEN IRRITABLE WITH OTHER PEOPLE BECAUSE OF PROBLEMS WITH YOUR TEETH, MOUTH OR DENTURES? OCCASIONALLY RADIO BUTTON
	@FindBy(xpath = "(//label[contains(@for,'QR~QID206~3')])[2]")
	public WebElement haveYouBeenIrritableWithOtherPeopleBecauseOfProblemsWithTeethMouthOrDenturesOccasionallyRadioButton;
		
	/*
	 * ----------------- END OF HAVE YOU BEEN IRRITABLE WITH OTHER PEOPLE BECAUSE OF PROBLEMS WITH YOUR TEETH, MOUTH OR DENTURES? PAGE -----------------
	 */
		
	/*
	 *  ----------------- BEGINING OF HAVE YOU HAD DIFFICULTY DOING YOUR USUAL JOBS BECAUSE OF PROBLEMS WITH YOUR TEETH, MOUTH OR DENTURES? PAGE -----------------
	 */
					
	//HAVE YOU HAD DIFFICULTY DOING YOUR USUAL JOBS BECAUSE OF PROBLEMS WITH YOUR TEETH, MOUTH OR DENTURES? OCCASIONALLY RADIO BUTTON
	@FindBy(xpath = "(//label[contains(@for,'QR~QID207~3')])[2]")
	public WebElement haveYouHadDifficultyDoingYourUsualJobsBecauseOfProblemsWithTeethMouthOrDenturesOccasionallyRadioButton;
		
	/*
	 * ----------------- END OF HAVE YOU HAD DIFFICULTY DOING YOUR USUAL JOBS BECAUSE OF PROBLEMS WITH YOUR TEETH, MOUTH OR DENTURES? PAGE -----------------
	 */
			
	/*
	 *  ----------------- BEGINING OF HAVE YOU FELT THAT LIFE IN GENERAL IS LESS SATISFYING BECAUSE OF PROBLEMS WITH YOUR TEETH, MOUTH OR DENTURES? PAGE -----------------
	 */
					
	//HAVE YOU FELT THAT LIFE IN GENERAL IS LESS SATISFYING BECAUSE OF PROBLEMS WITH YOUR TEETH, MOUTH OR DENTURES? OCCASIONALLY RADIO BUTTON
	@FindBy(xpath = "(//label[contains(@for,'QR~QID208~3')])[2]")
	public WebElement haveYouFeltThatLifeInGeneralIsLessSatisfyingBecauseOfProblemsWithTeethMouthOrDenturesOccasionallyRadioButton;
		
	/*
	 * ----------------- END OF HAVE YOU FELT THAT LIFE IN GENERAL IS LESS SATISFYING BECAUSE OF PROBLEMS WITH YOUR TEETH, MOUTH OR DENTURES? PAGE -----------------
	 */
			
	/*
	 *  ----------------- BEGINING OF HAVE YOU BEEN TOTALLY UNABLE TO FUNCTION BECAUSE OF PROBLEMS WITH YOUR TEETH, MOUTH OR DENTURES? PAGE -----------------
	 */
					
	//HAVE YOU BEEN TOTALLY UNABLE TO FUNCTION BECAUSE OF PROBLEMS WITH YOUR TEETH, MOUTH OR DENTURES? OCCASIONALLY RADIO BUTTON
	@FindBy(xpath = "(//label[contains(@for,'QR~QID209~3')])[2]")
	public WebElement haveYouBeenTotallyUnableToFunctionBecauseOfProblemsWithTeethMouthOrDenturesOccasionallyRadioButton;
		
	/*
	 * ----------------- END OF HAVE YOU BEEN TOTALLY UNABLE TO FUNCTION BECAUSE OF PROBLEMS WITH YOUR TEETH, MOUTH OR DENTURES? PAGE -----------------
	 */
		
	
	
	/*
	 *  ----------------- BEGINING OF PLEASE COMPLETE THE TABLE BELOW TO THE BEST OF YOUR ABILITY ABOUT THE ONSET OF SYMPTOMS, 
	 *    WHEN YOU WERE DIAGNOSED AND IF ANY PROCEDURES OR MEDICATIONS WERE UNDERTAKEN. PAGE -----------------
	 */
	
	
	//NEONATAL LYMPHEDEMA (LYMPH BUILD UP TYPICALLY IN THE ARMS AND LEGS. THIS OCCURS IN THE FIRST MONTH OF LIFE) DATE OF FIRST SYMPTOMS TEXT BOX
	@FindBy(xpath = "//tbody/tr[1]/td[3]/input[1]")
	public WebElement neonatalLymphedemaDateOfFirstSymptomsTextBox;
					
	//NEONATAL LYMPHEDEMA (LYMPH BUILD UP TYPICALLY IN THE ARMS AND LEGS. THIS OCCURS IN THE FIRST MONTH OF LIFE) AGE OF FIRST SYMPTOMS TEXT BOX
	@FindBy(xpath = "//tbody/tr[1]/td[4]/input[1]")
	public WebElement neonatalLymphedemaAgeOfFirstSymptomsTextBox;
	
	//NEONATAL LYMPHEDEMA (LYMPH BUILD UP TYPICALLY IN THE ARMS AND LEGS. THIS OCCURS IN THE FIRST MONTH OF LIFE) DATE OF DIAGNOSIS TEXT BOX
	@FindBy(xpath = "//tbody/tr[1]/td[8]/input[1]")
	public WebElement neonatalLymphedemaDateOfDiagnosisTextBox;
		
	//NEONATAL LYMPHEDEMA (LYMPH BUILD UP TYPICALLY IN THE ARMS AND LEGS. THIS OCCURS IN THE FIRST MONTH OF LIFE) AGE OF DIAGNOSIS TEXT BOX
	@FindBy(xpath = "//tbody/tr[1]/td[9]/input[1]")
	public WebElement neonatalLymphedemaAgeOfDiagnosisTextBox;
	
	//NEONATAL LYMPHEDEMA (LYMPH BUILD UP TYPICALLY IN THE ARMS AND LEGS. THIS OCCURS IN THE FIRST MONTH OF LIFE) MEDICATION TYPE OR PROCEDURE TEXT BOX
	@FindBy(xpath = "//tbody/tr[1]/td[13]/input[1]")
	public WebElement neonatalLymphedemaMedicationOrProcedureTextBox;
			
	//NEONATAL LYMPHEDEMA (LYMPH BUILD UP TYPICALLY IN THE ARMS AND LEGS. THIS OCCURS IN THE FIRST MONTH OF LIFE) NAME OF TREATING HOSPITAL OR PHYSICIAN AND ADDRESS OF HOSPITAL TEXT BOX
	@FindBy(xpath = "//tbody/tr[1]/td[16]/input[1]")
	public WebElement neonatalLymphedemaNameOfTreatingHospitalOrPhysicianAndAddressOfHospitalTextBox;
		
	//LYMPHEDEMA (LYMPH FLUID BUILDS UP AND CAUSES SWELLING IN THE ARMS AND LEGS. THIS OCCURS AFTER ONE MONTH OF AGE) DATE OF FIRST SYMPTOMS TEXT BOX
	@FindBy(xpath = "//tbody/tr[2]/td[3]/input[1]")
	public WebElement lymphedemaDateOfFirstSymptomsTextBox;
	
	//LYMPHEDEMA (LYMPH FLUID BUILDS UP AND CAUSES SWELLING IN THE ARMS AND LEGS. THIS OCCURS AFTER ONE MONTH OF AGE) AGE OF FIRST SYMPTOMS TEXT BOX
	@FindBy(xpath = "//tbody/tr[2]/td[4]/input[1]")
	public WebElement lymphedemaAgeOfFirstSymptomsTextBox;
		
	//LYMPHEDEMA (LYMPH FLUID BUILDS UP AND CAUSES SWELLING IN THE ARMS AND LEGS. THIS OCCURS AFTER ONE MONTH OF AGE) DATE OF DIAGNOSIS TEXT BOX
	@FindBy(xpath = "//tbody/tr[2]/td[8]/input[1]")
	public WebElement lymphedemaDateOfDiagnosisTextBox;
		
	//LYMPHEDEMA (LYMPH FLUID BUILDS UP AND CAUSES SWELLING IN THE ARMS AND LEGS. THIS OCCURS AFTER ONE MONTH OF AGE) AGE OF DIAGNOSIS TEXT BOX
	@FindBy(xpath = "//tbody/tr[2]/td[9]/input[1]")
	public WebElement lymphedemaAgeOfDiagnosisTextBox;
			
	//LYMPHEDEMA (LYMPH FLUID BUILDS UP AND CAUSES SWELLING IN THE ARMS AND LEGS. THIS OCCURS AFTER ONE MONTH OF AGE) MEDICATION TYPE OR PROCEDURE TEXT BOX
	@FindBy(xpath = "//tbody/tr[2]/td[13]/input[1]")
	public WebElement lymphedemaMedicationOrProcedureTextBox;
				
	//LYMPHEDEMA (LYMPH FLUID BUILDS UP AND CAUSES SWELLING IN THE ARMS AND LEGS. THIS OCCURS AFTER ONE MONTH OF AGE) NAME OF TREATING HOSPITAL OR PHYSICIAN AND ADDRESS OF HOSPITAL TEXT BOX
	@FindBy(xpath = "//tbody/tr[2]/td[16]/input[1]")
	public WebElement lymphedemaNameOfTreatingHospitalOrPhysicianAndAddressOfHospitalTextBox;
	
	//CONGENITAL CHYLOTHORAX (LYMPH FLUID BUILDS UP IN THE LUNG; DIAGNOSED WITHIN THE FIRST MONTH OF LIFE) DATE OF FIRST SYMPTOMS TEXT BOX
	@FindBy(xpath = "//tbody/tr[3]/td[3]/input[1]")
	public WebElement congenitalChylothoraxDateOfFirstSymptomsTextBox;
	
	//CONGENITAL CHYLOTHORAX (LYMPH FLUID BUILDS UP IN THE LUNG; DIAGNOSED WITHIN THE FIRST MONTH OF LIFE) AGE OF FIRST SYMPTOMS TEXT BOX
	@FindBy(xpath = "//tbody/tr[3]/td[4]/input[1]")
	public WebElement congenitalChylothoraxAgeOfFirstSymptomsTextBox;
	
	//CONGENITAL CHYLOTHORAX (LYMPH FLUID BUILDS UP IN THE LUNG; DIAGNOSED WITHIN THE FIRST MONTH OF LIFE) DATE OF DIAGNOSIS TEXT BOX
	@FindBy(xpath = "//tbody/tr[3]/td[8]/input[1]")
	public WebElement congenitalChylothoraxDateOfDiagnosisTextBox;
		
	//CONGENITAL CHYLOTHORAX (LYMPH FLUID BUILDS UP IN THE LUNG; DIAGNOSED WITHIN THE FIRST MONTH OF LIFE) AGE OF DIAGNOSIS TEXT BOX
	@FindBy(xpath = "//tbody/tr[3]/td[9]/input[1]")
	public WebElement congenitalChylothoraxAgeOfDiagnosisTextBox;
			
	//CONGENITAL CHYLOTHORAX (LYMPH FLUID BUILDS UP IN THE LUNG; DIAGNOSED WITHIN THE FIRST MONTH OF LIFE) MEDICATION TYPE OR PROCEDURE TEXT BOX
	@FindBy(xpath = "//tbody/tr[3]/td[13]/input[1]")
	public WebElement congenitalChylothoraxMedicationOrProcedureTextBox;
					
	//CONGENITAL CHYLOTHORAX (LYMPH FLUID BUILDS UP IN THE LUNG; DIAGNOSED WITHIN THE FIRST MONTH OF LIFE) NAME OF TREATING HOSPITAL OR PHYSICIAN AND ADDRESS OF HOSPITAL TEXT BOX
	@FindBy(xpath = "//tbody/tr[3]/td[16]/input[1]")
	public WebElement congenitalChylothoraxNameOfTreatingHospitalOrPhysicianAndAddressOfHospitalTextBox;
	
	//PLEURAL EFFUSION/CHYLOTHORAX (LYMPH FLUID BUILDS UP IN THE LUNG; DIAGNOSED AFTER ONE MONTH OF AGE) DATE OF FIRST SYMPTOMS TEXT BOX
	@FindBy(xpath = "//tbody/tr[4]/td[3]/input[1]")
	public WebElement pleuralEffusionChylothoraxDateOfFirstSymptomsTextBox;
	
	//PLEURAL EFFUSION/CHYLOTHORAX (LYMPH FLUID BUILDS UP IN THE LUNG; DIAGNOSED AFTER ONE MONTH OF AGE) AGE OF FIRST SYMPTOMS TEXT BOX
	@FindBy(xpath = "//tbody/tr[4]/td[4]/input[1]")
	public WebElement pleuralEffusionChylothoraxAgeOfFirstSymptomsTextBox;
	
	//PLEURAL EFFUSION/CHYLOTHORAX (LYMPH FLUID BUILDS UP IN THE LUNG; DIAGNOSED AFTER ONE MONTH OF AGE) DATE OF DIAGNOSIS TEXT BOX
	@FindBy(xpath = "//tbody/tr[4]/td[8]/input[1]")
	public WebElement pleuralEffusionChylothoraxDateOfDiagnosisTextBox;
		
	//PLEURAL EFFUSION/CHYLOTHORAX (LYMPH FLUID BUILDS UP IN THE LUNG; DIAGNOSED AFTER ONE MONTH OF AGE) AGE OF DIAGNOSIS TEXT BOX
	@FindBy(xpath = "//tbody/tr[4]/td[9]/input[1]")
	public WebElement pleuralEffusionChylothoraxAgeOfDiagnosisTextBox;
			
	//PLEURAL EFFUSION/CHYLOTHORAX (LYMPH FLUID BUILDS UP IN THE LUNG; DIAGNOSED AFTER ONE MONTH OF AGE) MEDICATION TYPE OR PROCEDURE TEXT BOX
	@FindBy(xpath = "//tbody/tr[4]/td[13]/input[1]")
	public WebElement pleuralEffusionChylothoraxMedicationOrProcedureTextBox;
						
	//PLEURAL EFFUSION/CHYLOTHORAX (LYMPH FLUID BUILDS UP IN THE LUNG; DIAGNOSED AFTER ONE MONTH OF AGE) NAME OF TREATING HOSPITAL OR PHYSICIAN AND ADDRESS OF HOSPITAL TEXT BOX
	@FindBy(xpath = "//tbody/tr[4]/td[16]/input[1]")
	public WebElement pleuralEffusionChylothoraxNameOfTreatingHospitalOrPhysicianAndAddressOfHospitalTextBox;
	
	//LYMPHANGIOMA (LYMPH FLUID UNDER THE SKIN THAT APPEARS AS A SWELLING, MASS, OR CYST; MOST OFTEN OCCURS IN THE HEAD, NECK OR BREAST AREA DATE OF FIRST SYMPTOMS TEXT BOX
	@FindBy(xpath = "//tbody/tr[5]/td[3]/input[1]")
	public WebElement lymphangiomaDateOfFirstSymptomsTextBox;
	
	//LYMPHANGIOMA (LYMPH FLUID UNDER THE SKIN THAT APPEARS AS A SWELLING, MASS, OR CYST; MOST OFTEN OCCURS IN THE HEAD, NECK OR BREAST AREA AGE OF FIRST SYMPTOMS TEXT BOX
	@FindBy(xpath = "//tbody/tr[5]/td[4]/input[1]")
	public WebElement lymphangiomaAgeOfFirstSymptomsTextBox;
	
	//LYMPHANGIOMA (LYMPH FLUID UNDER THE SKIN THAT APPEARS AS A SWELLING, MASS, OR CYST; MOST OFTEN OCCURS IN THE HEAD, NECK OR BREAST AREA DATE OF DIAGNOSIS TEXT BOX
	@FindBy(xpath = "//tbody/tr[5]/td[8]/input[1]")
	public WebElement lymphangiomaDateOfDiagnosisTextBox;
		
	//LYMPHANGIOMA (LYMPH FLUID UNDER THE SKIN THAT APPEARS AS A SWELLING, MASS, OR CYST; MOST OFTEN OCCURS IN THE HEAD, NECK OR BREAST AREA AGE OF DIAGNOSIS TEXT BOX
	@FindBy(xpath = "//tbody/tr[5]/td[9]/input[1]")
	public WebElement lymphangiomaAgeOfDiagnosisTextBox;
			
	//LYMPHANGIOMA (LYMPH FLUID UNDER THE SKIN THAT APPEARS AS A SWELLING, MASS, OR CYST; MOST OFTEN OCCURS IN THE HEAD, NECK OR BREAST AREA MEDICATION TYPE OR PROCEDURE TEXT BOX
	@FindBy(xpath = "//tbody/tr[5]/td[13]/input[1]")
	public WebElement lymphangiomaMedicationOrProcedureTextBox;
							
	//LYMPHANGIOMA (LYMPH FLUID UNDER THE SKIN THAT APPEARS AS A SWELLING, MASS, OR CYST; MOST OFTEN OCCURS IN THE HEAD, NECK OR BREAST AREA NAME OF TREATING HOSPITAL OR PHYSICIAN AND ADDRESS OF HOSPITAL TEXT BOX
	@FindBy(xpath = "//tbody/tr[5]/td[16]/input[1]")
	public WebElement lymphangiomaNameOfTreatingHospitalOrPhysicianAndAddressOfHospitalTextBox;
			
	//CHRONIC ABDOMINAL PAIN DATE OF FIRST SYMPTOMS TEXT BOX
	@FindBy(xpath = "//tbody/tr[6]/td[3]/input[1]")
	public WebElement chronicAbdominalPainDateOfFirstSymptomsBox;
	
	//CHRONIC ABDOMINAL PAIN AGE OF FIRST SYMPTOMS TEXT BOX
	@FindBy(xpath = "//tbody/tr[6]/td[4]/input[1]")
	public WebElement chronicAbdominalPainAgeOfFirstSymptomsBox;
	
	//CHRONIC ABDOMINAL PAIN DATE OF DIAGNOSIS TEXT BOX
	@FindBy(xpath = "//tbody/tr[6]/td[8]/input[1]")
	public WebElement chronicAbdominalPainDateOfDiagnosisBox;
		
	//CHRONIC ABDOMINAL PAIN AGE OF DIAGNOSIS TEXT BOX
	@FindBy(xpath = "//tbody/tr[6]/td[9]/input[1]")
	public WebElement chronicAbdominalPainAgeOfDiagnosisBox;
			
	//CHRONIC ABDOMINAL PAIN MEDICATION TYPE OR PROCEDURE TEXT BOX
	@FindBy(xpath = "//tbody/tr[6]/td[13]/input[1]")
	public WebElement chronicAbdominalPainMedicationOrProcedureTextBox;
								
	//CHRONIC ABDOMINAL PAIN NAME OF TREATING HOSPITAL OR PHYSICIAN AND ADDRESS OF HOSPITAL TEXT BOX
	@FindBy(xpath = "//tbody/tr[6]/td[16]/input[1]")
	public WebElement chronicAbdominalPainNameOfTreatingHospitalOrPhysicianAndAddressOfHospitalTextBox;
		
	//POOR LYMPHATIC DRAINAGE DATE OF FIRST SYMPTOMS TEXT BOX
	@FindBy(xpath = "//tbody/tr[7]/td[3]/input[1]")
	public WebElement poorLymphaticDrainageDateOfFirstSymptomsTextBox;
	
	//POOR LYMPHATIC DRAINAGE AGE OF FIRST SYMPTOMS TEXT BOX
	@FindBy(xpath = "//tbody/tr[7]/td[4]/input[1]")
	public WebElement poorLymphaticDrainageAgeOfFirstSymptomsTextBox;
		
	//POOR LYMPHATIC DRAINAGE DATE OF DIAGNOSIS TEXT BOX
	@FindBy(xpath = "//tbody/tr[7]/td[8]/input[1]")
	public WebElement poorLymphaticDrainageDateOfDiagnosisTextBox;
	
	//POOR LYMPHATIC DRAINAGE AGE OF DIAGNOSIS TEXT BOX
	@FindBy(xpath = "//tbody/tr[7]/td[9]/input[1]")
	public WebElement poorLymphaticDrainageAgeOfDiagnosisTextBox;
			
	//POOR LYMPHATIC DRAINAGE MEDICATION TYPE OR PROCEDURE TEXT BOX
	@FindBy(xpath = "//tbody/tr[7]/td[13]/input[1]")
	public WebElement poorLymphaticDrainageMedicationOrProcedureTextBox;
									
	//POOR LYMPHATIC DRAINAGE NAME OF TREATING HOSPITAL OR PHYSICIAN AND ADDRESS OF HOSPITAL TEXT BOX
	@FindBy(xpath = "//tbody/tr[7]/td[16]/input[1]")
	public WebElement poorLymphaticDrainageNameOfTreatingHospitalOrPhysicianAndAddressOfHospitalTextBox;
		
	/*
	 *  ----------------- END OF PLEASE COMPLETE THE TABLE BELOW TO THE BEST OF YOUR ABILITY ABOUT THE ONSET OF SYMPTOMS, 
	 *  WHEN YOU WERE DIAGNOSED AND IF ANY PROCEDURES OR MEDICATIONS WERE UNDERTAKEN. PAGE -----------------
	 */
		
	/*
	 *  ----------------- BEGINING OF PLEASE LIST THE INFORMATION BELOW FOR THE NEPHROLOGIST WHO COMPLETED YOUR EVALUATION. PAGE -----------------
	 */
					
	//PLEASE LIST THE INFORMATION BELOW FOR THE NEPHROLOGIST WHO COMPLETED YOUR EVALUATION. NAME OF DOCTOR TEXT BOX
	@FindBy(xpath = "//tbody/tr[1]/td[2]/input[1]")
	public WebElement informationForNephrologistNameOfDoctorTextBox;
		
	//PLEASE LIST THE INFORMATION BELOW FOR THE NEPHROLOGIST WHO COMPLETED YOUR EVALUATION. CITY, STATE TEXT BOX
	@FindBy(xpath = "//tbody/tr[2]/td[2]/input[1]")
	public WebElement informationForNephrologistCityStateTextBox;
			
	//PLEASE LIST THE INFORMATION BELOW FOR THE NEPHROLOGIST WHO COMPLETED YOUR EVALUATION. HOSPITAL OR MEDICAL AFFILIATION TEXT BOX
	@FindBy(xpath = "//tbody/tr[3]/td[2]/input[1]")
	public WebElement informationForANephrologistHospitalOrMedicalAffiliationTextBox;
		
	/*
	 *  ----------------- END OF PLEASE LIST THE INFORMATION BELOW FOR THE NEPHROLOGIST WHO COMPLETED YOUR EVALUATION. PAGE -----------------
	 */
		
	/*
	 * ----------------- BEGINNING OF PLEASE COMPLETE THE TABLE BELOW TO THE BEST OF YOUR ABILITY REGARDING DATE OF ONSET OF SYMPTOMS, DIAGNOSIS AND IF ANY
	 * MEDICATIONS OR PROCEDURES WERE UNDERTAKEN. IF YOU DO NOT RECALL THE DETAILS FOR EACH CONDITION LISTED, PLEASE PLACE AN 'X' IN THE BOX. PAGE -----------------
	 */

	//“MINOR ISSUES WITH KIDNEYS... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[1]/td[3]/input[1]")
	public WebElement minorIssuesWithKidneysFirstSymptomsDateTextBox;

	//“MINOR ISSUES WITH KIDNEYS... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[1]/td[4]/input[1]")
	public WebElement minorIssuesWithKidneysFirstSymptomsAgeTextBox;

	//“MINOR ISSUES WITH KIDNEYS... DON'T KNOW" TEXT BOX
	@FindBy(xpath = "//tbody/tr[1]/td[5]/input[1]")
	public WebElement minorIssuesWithKidneysFirstSymptomsDontKnowTextBox;

	//“MINOR ISSUES WITH KIDNEYS... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[1]/td[8]/input[1]")
	public WebElement minorIssuesWithKidneysDiagnosisDateTextBox;

	//“MINOR ISSUES WITH KIDNEYS... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[1]/td[9]/input[1]")
	public WebElement minorIssuesWithKidneysDiagnosisAgeTextBox;

	//“MINOR ISSUES WITH KIDNEYS... DON'T KNOW" TEXT BOX
	@FindBy(xpath = "//tbody/tr[1]/td[10]/input[1]")
	public WebElement minorIssuesWithKidneysDiagnosisDontKnowTextBox;

	//IF PROCEDURE, A BRIEF DESCRIPTION OR NAME OF PROCEDURE
	@FindBy(xpath = "//tbody/tr[1]/td[13]/input[1]")
	public WebElement minorIssuesWithKidneysMedicationTypeTextBox;
	
	//PLEASE PROVIDE ADDRESS OF HOSPITAL OR OFFICE (NAME CITY, STATE/PROVINCE, COUNTRY)
	@FindBy(xpath = "//tbody/tr[1]/td[16]/input[1]")
	public WebElement minorIssuesWithKidneysAddressTextBox;

	//“UNDERDEVELOPED KIDNEY... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[2]/td[3]/input[1]")
	public WebElement underdevelopedKidneyFirstSymptomsDateTextBox;

	//"UNDERDEVELOPED KIDNEY... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[2]/td[4]/input[1]")
	public WebElement underdevelopedKidneyFirstSymptomsAgeTextBox;

	//"UNDERDEVELOPED KIDNEY... DON'T KNOW" TEXT BOX
	@FindBy(xpath = "//tbody/tr[2]/td[5]/input[1]")
	public WebElement underdevelopedKidneyFirstSymptomsDontKnowTextBox;

	//"UNDERDEVELOPED KIDNEY... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[2]/td[8]/input[1]")
	public WebElement underdevelopedKidneyDiagnosisDateTextBox;

	//"UNDERDEVELOPED KIDNEY... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[2]/td[9]/input[1]")
	public WebElement underdevelopedKidneyDiagnosisAgeTextBox;

	//"UNDERDEVELOPED KIDNEY... DON'T KNOW" TEXT BOX
	@FindBy(xpath = "//tbody/tr[2]/td[10]/input[1]")
	public WebElement underdevelopedKidneyDiagnosisDontKnowTextBox;

	//IF PROCEDURE, A BRIEF DESCRIPTION OR NAME OF PROCEDURE
	@FindBy(xpath = "//tbody/tr[2]/td[13]/input[1]")
	public WebElement underdevelopedKidneyMedicationTypeTextBox;

	//PLEASE PROVIDE ADDRESS OF HOSPITAL OR OFFICE (NAME CITY, STATE/PROVINCE, COUNTRY)
	@FindBy(xpath = "//tbody/tr[2]/td[16]/input[1]")
	public WebElement underdevelopedKidneyAddressTextBox;

	//"HYDRONEPHROSIS... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[3]/td[3]/input[1]")
	public WebElement hydronephrosisFirstSymptomsDateTextBox;

	//"HYDRONEPHROSIS... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[3]/td[4]/input[1]")
	public WebElement hydronephrosisFirstSymptomsAgeTextBox;

	//"HYDRONEPHROSIS... DON'T KNOW" TEXT BOX
	@FindBy(xpath = "//tbody/tr[3]/td[5]/input[1]")
	public WebElement hydronephrosisFirstSymptomsDontKnowTextBox;

	//"HYDRONEPHROSIS... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[3]/td[8]/input[1]")
	public WebElement hydronephrosisDiagnosisDateTextBox;

	//"HYDRONEPHROSIS... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[3]/td[9]/input[1]")
	public WebElement hydronephrosisDiagnosisAgeTextBox;

	//"HYDRONEPHROSIS... DON'T KNOW" TEXT BOX
	@FindBy(xpath = "//tbody/tr[3]/td[10]/input[1]")
	public WebElement hydronephrosisDiagnosisDontKnowTextBox;

	//IF PROCEDURE, A BRIEF DESCRIPTION OR NAME OF PROCEDURE
	@FindBy(xpath = "//tbody/tr[3]/td[13]/input[1]")
	public WebElement hydronephrosisMedicationTypeTextBox;

	//PLEASE PROVIDE ADDRESS OF HOSPITAL OR OFFICE (NAME CITY, STATE/PROVINCE, COUNTRY)
	@FindBy(xpath = "//tbody/tr[3]/td[16]/input[1]")
	public WebElement hydronephrosisAddressTextBox;

	//"OTHER... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[4]/td[3]/input[1]")
	public WebElement otherKidneyFirstSymptomsDateTextBox;

	//"OTHER... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[4]/td[4]/input[1]")
	public WebElement otherKidneyFirstSymptomsAgeTextBox;

	//"OTHER... DON'T KNOW" TEXT BOX
	@FindBy(xpath = "//tbody/tr[4]/td[5]/input[1]")
	public WebElement otherKidneyFirstSymptomsDontKnowTextBox;

	//"OTHER... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[4]/td[8]/input[1]")
	public WebElement otherKidneyDiagnosisDateTextBox;

	//"OTHER... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[4]/td[9]/input[1]")
	public WebElement otherKidneyDiagnosisAgeTextBox;

	//"OTHER... DON'T KNOW" TEXT BOX
	@FindBy(xpath = "//tbody/tr[4]/td[10]/input[1]")
	public WebElement otherKidneyDiagnosisDontKnowTextBox;

	//IF PROCEDURE, A BRIEF DESCRIPTION OR NAME OF PROCEDURE
	@FindBy(xpath = "//tbody/tr[4]/td[13]/input[1]")
	public WebElement otherKidneyMedicationTypeTextBox;

	//PLEASE PROVIDE ADDRESS OF HOSPITAL OR OFFICE (NAME CITY, STATE/PROVINCE, COUNTRY)
	@FindBy(xpath = "//tbody/tr[4]/td[16]/input[1]")
	public WebElement otherKidneyAddressTextBox;

	/*
	 * ----------------- END OF PLEASE COMPLETE THE TABLE BELOW TO THE BEST OF YOUR
	 * ABILITY REGARDING DATE OF ONSET OF SYMPTOMS, DIAGNOSIS AND IF ANY MEDICATIONS
	 * OR PROCEDURES WERE UNDERTAKEN. IF YOU DO NOT RECALL THE DETAILS FOR EACH
	 * CONDITION LISTED, PLEASE PLACE AN 'X' IN THE BOX. PAGE ----------------- */

	/*
	 * ----------------- BEGINING OF PLEASE PROVIDE THE INFORMATION BELOW FOR THE
	 * DERMATOLOGIST WHO COMPLETED YOUR EVALUATION. PAGE ----------------- */

	//"NAME OF PHYSICIAN" TEXT BOX
	@FindBy(xpath = "(//input[@class='Medium InputText QR-QID386-1 QWatchTimer'])[1]")
	public WebElement nameOfPhysicianDermatologistTextBox;

	//"CITY, STATE" TEXT BOX
	@FindBy(xpath = "(//input[@class='Medium InputText QR-QID386-2 QWatchTimer'])[1]")
	public WebElement cityStateDermatologistTextBox;
	
	//"HOSPITAL OR MEDICAL CENTER AFFILIATION" TEXT BOX
	@FindBy(xpath = "(//input[@class='Medium InputText QR-QID386-3 QWatchTimer'])[1]")
	public WebElement hospitalOrMedicalCenterAffiliationDermatologistTextBox;

	/*
	 * ----------------- END OF PLEASE PROVIDE THE INFORMATION BELOW FOR THE DERMATOLOGIST WHO COMPLETED YOUR EVALUATION. PAGE -----------------
	 */

	/*
	 * ----------------- BEGINING OF DO YOU HAVE ANY HEMANGIOMAS? HEMANGIOMAS ARE BRIGHT RED MARKS ON THE SKIN MADE UP OF BLOOD VESSELS, WHICH MAY APPEAR AS A
	 * MASS OR LUMP. A HEMANGIOMA MAY APPEAR IN INFANCY OR CHILDHOOD AND FADE OVER TIME. PAGE -----------------
	 */

	//"THREE OR MORE HEMANGIOMAS" CHECK BOX
	@FindBy(xpath = "//span[contains(text(),'Three or more hemangiomas')]")
	public WebElement threeOrMoreHemangiomasRadioButton;

	/*
	 * ----------------- END OF DO YOU HAVE ANY HEMANGIOMAS? HEMANGIOMAS ARE BRIGHT RED MARKS ON THE SKIN MADE UP OF BLOOD VESSELS, WHICH MAY APPEAR AS A MASS OR
	 * LUMP. A HEMANGIOMA MAY APPEAR IN INFANCY OR CHILDHOOD AND FADE OVER TIME. PAGE -----------------
	 */

	/*
	 * ----------------- BEGINING OF PLEASE PROVIDE THE DETAILS BELOW FOR THE
	 * ORTHOPAEDIC SURGEON WHO COMPLETED YOUR EVALUATION.PAGE PART(2)PG.13 LILY
	 * -----------------
	 */

	//"NAME OF PHYSICIAN" TEXT BOX
	@FindBy(xpath = "(//input[@class='Medium InputText QR-QID388-1 QWatchTimer'])[1]")
	public WebElement nameOfPhysicianOrthopaedicTextBox;

	//"CITY, STATE" TEXT BOX
	@FindBy(xpath = "(//input[@class='Medium InputText QR-QID388-2 QWatchTimer'])[1]")
	public WebElement cityStateOrthopaedicTextBox;

	//"HOSPITAL OR MEDICAL CENTER AFFILIATION" TEXT BOX
	@FindBy(xpath = "(//input[@class='Medium InputText QR-QID388-3 QWatchTimer'])[1]")
	public WebElement hospitalOrMedicalCenterAffiliationOrthopaedicTextBox;

	/*
	 * ----------------- END OF PLEASE PROVIDE THE DETAILS BELOW FOR THE ORTHOPAEDIC
	 * SURGEON WHO COMPLETED YOUR EVALUATION. PAGE -----------------
	 */

	/*
	 * ----------------- END OF Please complete the table below for each of the
	 * spine issues listed. For each condition, please indicate your age or date
	 * when they occurred (you do not need to include both). If you do not recall
	 * the details, place an 'X' in the column 'Don't know'. For the treatment
	 * column, if no treatment was required, please write 'None'.PAGE -----------------
	 */

	//“SCOLIOSIS... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[1]/td[3]/input[1]")
	public WebElement scoliosisFirstSymptomsDateTextBox;

	//“SCOLIOSIS... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[1]/td[4]/input[1]")
	public WebElement scoliosisFirstSymptomsAgeTextBox;

	//“SCOLIOSIS... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[1]/td[8]/input[1]")
	public WebElement scoliosisDiagnosisDateTextBox;

	//“SCOLIOSIS... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[1]/td[9]/input[1]")
	public WebElement scoliosisDiagnosisAgeTextBox;

	//"SCOLIOSIS... TREATMENT" TEXT BOX
	@FindBy(xpath = "//tbody/tr[1]/td[13]/textarea[1]")
	public WebElement scoliosisTreatmentTextBox;

	//“KYPHOSIS... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[2]/td[3]/input[1]")
	public WebElement kyphosisFirstSymptomsDateTextBox;

	//“KYPHOSIS... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[2]/td[4]/input[1]")
	public WebElement kyphosisFirstSymptomsAgeTextBox;

	//“KYPHOSIS... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[2]/td[8]/input[1]")
	public WebElement kyphosisDiagnosisDateTextBox;

	//“KYPHOSIS... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[2]/td[9]/input[1]")
	public WebElement kyphosisDiagnosisAgeTextBox;

	//“KYPHOSIS...TREATMENT" TEXT BOX
	@FindBy(xpath = "//tbody/tr[2]/td[13]/textarea[1]")
	public WebElement kyphosisTreatmentTextBox;

	//“KYPHOSCOLIOSIS... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[3]/td[3]/input[1]")
	public WebElement kyphoscoliosisFirstSymptomsDateTextBox;

	//“KYPHOSCOLIOSIS... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[3]/td[4]/input[1]")
	public WebElement kyphoscoliosisFirstSymptomsAgeTextBox;

	//“KYPHOSCOLIOSIS... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[3]/td[8]/input[1]")
	public WebElement kyphoscoliosisDiagnosisDateTextBox;

	//“KYPHOSCOLIOSIS... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[3]/td[9]/input[1]")
	public WebElement kyphoscoliosisDiagnosisAgeTextBox;

	//“KYPHOSCOLIOSIS... TREATMENT" TEXT BOX
	@FindBy(xpath = "//tbody/tr[3]/td[13]/textarea[1]")
	public WebElement kyphoscoliosisTreatmentTextBox;

	//“OTHER... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[4]/td[3]/input[1]")
	public WebElement otherSpineFirstSymptomsDateTextBox;

	//“OTHER... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[4]/td[4]/input[1]")
	public WebElement otherSpineFirstSymptomsAgeTextBox;

	//“OTHER... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[4]/td[8]/input[1]")
	public WebElement otherSpineDiagnosisDateTextBox;

	//“OTHER... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[4]/td[9]/input[1]")
	public WebElement otherSpineDiagnosisAgeTextBox;

	//“OTHER... "TREATMENT" TEXT BOX
	@FindBy(xpath = "//tbody/tr[4]/td[13]/textarea[1]")
	public WebElement otherSpineTreatmentTextBox;

	/*
	 * ----------------- END OF PLEASE COMPLETE THE TABLE BELOW FOR EACH OF THE
	 * SPINE ISSUES LISTED. FOR EACH CONDITION, PLEASE INDICATE YOUR AGE OR DATE
	 * WHEN THEY OCCURRED (YOU DO NOT NEED TO INCLUDE BOTH). IF YOU DO NOT RECALL
	 * THE DETAILS, PLACE AN 'X' IN THE COLUMN 'DON'T KNOW'. FOR THE TREATMENT
	 * COLUMN, IF NO TREATMENT WAS REQUIRED, PLEASE WRITE 'NONE'. PAGE -----------------
	 */

	/*
	 * ----------------- BEGINNING OF PLEASE COMPLETE THE TABLE BELOW FOR EACH OF
	 * THE JOINT ISSUES LISTED. FOR EACH CONDITION, PLEASE INCLUDE THE DATE OR AGE
	 * WHEN SYMPTOMS FIRST OCCURRED AND DATE OR AGE AT DIAGNOSIS (YOU DO NOT NEED TO
	 * INCLUDE BOTH THE DATE AND AGE). IF YOU DO NOT RECALL THE DETAILS, PLEASE
	 * PLACE AN 'X' IN THE COLUMN 'DON'T KNOW.' IF NO TREATMENT WAS REQUIRED, PLEASE
	 * PUT 'NONE' IN THE 'TREATMENT' COLUMN. PAGE  -----------------
	 */

	//“ULNAR DEVIATION.... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[1]/td[3]/input[1]")
	public WebElement ulnarDeviationFirstSymptomsDateTextBox;

	//“ULNAR DEVIATION... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[1]/td[4]/input[1]")
	public WebElement ulnarDeviationFirstSymptomsAgeTextBox;

	//“ULNAR DEVIATION... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[1]/td[8]/input[1]")
	public WebElement ulnarDeviationDiagnosisDateTextBox;

	//“ULNAR DEVIATION.... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[1]/td[9]/input[1]")
	public WebElement ulnarDeviationDiagnosisAgeTextBox;

	//“ULNAR DEVIATION....TREATMENT" TEXT BOX
	@FindBy(xpath = "//tbody/tr[1]/td[13]/textarea[1]")
	public WebElement ulnarDeviationTreatmentTextBox;
	
	//“PES PLANUS... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[2]/td[3]/input[1]")
	public WebElement pesPlanusFirstSymptomsDateTextBox;

	//“PES PLANUS... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[2]/td[4]/input[1]")
	public WebElement pesPlanusFirstSymptomsAgeTextBox;

	//“PES PLANUS... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[2]/td[8]/input[1]")
	public WebElement pesPlanusDiagnosisDateTextBox;

	//“PES PLANUS... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[2]/td[9]/input[1]")
	public WebElement pesPlanusDiagnosisAgeTextBox;

	//“PES PLANUS... "TREATMENT" TEXT BOX
	@FindBy(xpath = "//tbody/tr[2]/td[13]/textarea[1]")
	public WebElement pesPlanusTreatmentTextBox;

	//“ACHILLES TENDON... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[3]/td[3]/input[1]")
	public WebElement achillesTendonFirstSymptomsDateTextBox;

	//“ACHILLES TENDON... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[3]/td[4]/input[1]")
	public WebElement achillesTendonFirstSymptomsAgeTextBox;

	//“ACHILLES TENDON... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[3]/td[8]/input[1]")
	public WebElement achillesTendonDiagnosisDateTextBox;

	//“ACHILLES TENDON... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[3]/td[9]/input[1]")
	public WebElement achillesTendonDiagnosisAgeTextBox;

	//“ACHILLES TENDON..."TREATMENT" TEXT BOX
	@FindBy(xpath = "//tbody/tr[3]/td[13]/textarea[1]")
	public WebElement achillesTendonTreatmentTextBox;

	//“HIP DYSPLASIA... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[4]/td[3]/input[1]")
	public WebElement hipDysplasiaFirstSymptomsDateTextBox;

	//“HIP DYSPLASIA... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[4]/td[4]/input[1]")
	public WebElement hipDysplasiaFirstSymptomsAgeTextBox;

	//“HIP DYSPLASIA... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[4]/td[8]/input[1]")
	public WebElement hipDysplasiaDiagnosisDateTextBox;

	//“HIP DYSPLASIA... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[4]/td[9]/input[1]")
	public WebElement hipDysplasiaDiagnosisAgeTextBox;

	//“HIP DYSPLASIA... TREATMENT" TEXT BOX
	@FindBy(xpath = "//tbody/tr[4]/td[13]/textarea[1]")
	public WebElement hipDysplasiaTreatmentTextBox;

	//“HYPERMOBILITY... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[5]/td[3]/input[1]")
	public WebElement hypermobilityFirstSymptomsDateTextBox;

	//“HYPERMOBILITY... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[5]/td[4]/input[1]")
	public WebElement hypermobilityFirstSymptomsAgeTextBox;

	//“HYPERMOBILITY... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[5]/td[8]/input[1]")
	public WebElement hypermobilityDiagnosisDateTextBox;

	//“HYPERMOBILITY... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[5]/td[9]/input[1]")
	public WebElement hypermobilityDiagnosisAgeTextBox;

	//“HYPERMOBILITY...TREATMENT" TEXT BOX
	@FindBy(xpath = "//tbody/tr[5]/td[13]/textarea[1]")
	public WebElement hypermobilityTreatmentTextBox;
	
	//“OTHER... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[6]/td[3]/input[1]")
	public WebElement otherJointFirstSymptomsDateTextBox;

	//“OTHER.... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[6]/td[4]/input[1]")
	public WebElement otherJointFirstSymptomsAgeTextBox;

	//“OTHER... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[6]/td[8]/input[1]")
	public WebElement otherJointDiagnosisDateTextBox;

	//“OTHER... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[6]/td[9]/input[1]")
	public WebElement otherJointDiagnosisAgeTextBox;

	//“OTHER...TREATMENT" TEXT BOX
	@FindBy(xpath = "//tbody/tr[6]/td[13]/textarea[1]")
	public WebElement otherJointTreatmentTextBox;

	/*
	 * ----------------- END OF PLEASE COMPLETE THE TABLE BELOW FOR EACH OF THE JOINT ISSUES LISTED. FOR EACH CONDITION, PLEASE INCLUDE THE DATE OR AGE WHEN
	 * SYMPTOMS FIRST OCCURRED AND DATE OR AGE AT DIAGNOSIS (YOU DO NOT NEED TO INCLUDE BOTH THE DATE AND AGE). IF YOU DO NOT RECALL THE DETAILS, PLEASE
	 * PLACE AN 'X' IN THE COLUMN 'DON'T KNOW.' IF NO TREATMENT WAS REQUIRED, PLEASE PUT 'NONE' IN THE 'TREATMENT' COLUMN. PAGE  -----------------
	 */

	/*
	 * ----------------- BEGINNING OF PLEASE PROVIDE THE INFORMATION BELOW FOR THE
	 * HEMATOLOGIST/ONCOLOGIST WHO COMPLETED YOUR EVALUATION. PAGE ----------------- 
	 */

	//"NAME OF PHYSICIAN" TEXT BOX
	@FindBy(xpath = "(//input[@class='Medium InputText QR-QID390-1 QWatchTimer'])[1]")
	public WebElement nameOfPhysicianHematologistTextBox;

	//"CITY, STATE" TEXT BOX
	@FindBy(xpath = "(//input[contains(@class,'Medium InputText QR-QID390-2 QWatchTimer')])[1]")
	public WebElement cityStateHematologistTextBox;

	//"HOSPITAL OR MEDICAL CENTER AFFILIATION" TEXT BOX
	@FindBy(xpath = "(//input[@class='Medium InputText QR-QID390-3 QWatchTimer'])[1]")
	public WebElement hospitalOrMedicalCenterAffiliationHematologistTextBox;

	/*
	 * ----------------- END OF PLEASE PROVIDE THE INFORMATION BELOW FOR THE
	 * HEMATOLOGIST/ONCOLOGIST WHO COMPLETED YOUR EVALUATION. PAGE ----------------- */
	
	/*
	 * ----------------- BEGINNING OF DO YOU HAVE ANY OF THE FOLLOWING ISSUES WITH
	 * BLEEDING OR BRUISING? PLEASE SELECT ALL THAT APPLY. PAGE ----------------- */

	//YES BLEEDING RADIO BUTTON
	@FindBy(xpath = "(//span[contains(text(),'Yes')])[1]")
	public WebElement yesBleedingRadioButton;

	/*
	 * ----------------- END OF DO YOU HAVE ANY OF THE FOLLOWING ISSUES WITH
	 * BLEEDING OR BRUISING? PLEASE SELECT ALL THAT APPLY. PAGE ----------------- */

	/*
	 * ----------------- BEGINNING OF PLEASE COMPLETE THE TABLE BELOW FOR EACH OF THE BLEEDING/BRUISING ISSUES LISTED. FOR EACH CONDITION, PLEASE PROVIDE YOUR
	 * AGE OR DATE WHEN SYMPTOMS FIRST STARTED AND AT DIAGNOSIS (YOU ONLY NEED TO PROVIDE DATE OR AGE, BUT NOT BOTH). IF YOU DO NOT RECALL THE DETAILS, PLEASE
	 * PLACE AN 'X' IN THE 'DON'T KNOW' COLUMN. IF NO TREATMENT WAS REQUIRED, PLEASE WRITE 'NONE' IN THE TREATMENT COLUMN. PAGE  -----------------
	 */

	//"EASY BRUISING...DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[1]/td[3]/input[1]")
	public WebElement easyBruisingFirstSymptomsDateTextBox;

	//"EASY BRUISING... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[1]/td[4]/input[1]")
	public WebElement easyBruisingFirstSymptomsAgeTextBox;

	//"EASY BRUISING... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[1]/td[8]/input[1]")
	public WebElement easyBruisingDiagnosisDateTextBox;

	//"EASY BRUISING...AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[1]/td[9]/input[1]")
	public WebElement easyBruisingDiagnosisAgeTextBox;

	//IF PROCEDURE, A BRIEF DESCRIPTION OR NAME OF PROCEDURE TEXT BOX
	@FindBy(xpath = "//tbody/tr[1]/td[13]/input[1]")
	public WebElement easyBruisingMedicationTypeTextBox;
	
	//PLEASE PROVIDE ADDRESS OF HOSPITAL OR OFFICE (NAME CITY, STATE/PROVINCE, COUNTRY) TEXT BOX
	@FindBy(xpath = "//tbody/tr[1]/td[16]/input[1]")
	public WebElement easyBruisingAddressTextBox;

	//"PLATELET DYSFUNCTION... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[2]/td[3]/input[1]")
	public WebElement plateletDysfunctionFirstSymptomsDateTextBox;

	//"PLATELET DYSFUNCTION... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[2]/td[4]/input[1]")
	public WebElement plateletDysfunctionFirstSymptomsAgeTextBox;

	//"PLATELET DYSFUNCTION... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[2]/td[8]/input[1]")
	public WebElement plateletDysfunctionDiagnosisDateTextBox;

	//"PLATELET DYSFUNCTION... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[2]/td[9]/input[1]")
	public WebElement plateletDysfunctionDiagnosisAgeTextBox;
	
	//IF PROCEDURE, A BRIEF DESCRIPTION OR NAME OF PROCEDURE TEXT BOX
	@FindBy(xpath = "//tbody/tr[2]/td[13]/input[1]")
	public WebElement plateletDysfunctionMedicationTypeTextBox;
	
	// PLEASE PROVIDE ADDRESS OF HOSPITAL OR OFFICE (NAME CITY, STATE/PROVINCE, COUNTRY) TEXT BOX
	@FindBy(xpath = "//tbody/tr[2]/td[16]/input[1]")
	public WebElement plateletDysfunctionAddressTextBox;

	//"CLOTTING DISORDER... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[3]/td[3]/input[1]")
	public WebElement clottingDisorderFirstSymptomsDateTextBox;

	//"CLOTTING DISORDER... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[3]/td[4]/input[1]")
	public WebElement clottingDisorderFirstSymptomsAgeTextBox;

	//"CLOTTING DISORDER... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[3]/td[8]/input[1]")
	public WebElement clottingDisorderDiagnosisDateTextBox;

	//"CLOTTING DISORDER... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[3]/td[9]/input[1]")
	public WebElement clottingDisorderDiagnosisAgeTextBox;

	//IF PROCEDURE, A BRIEF DESCRIPTION OR NAME OF PROCEDURE TEXT BOX
	@FindBy(xpath = "//tbody/tr[3]/td[13]/input[1]")
	public WebElement clottingDisorderMedicationTypeTextBox;

	//PLEASE PROVIDE ADDRESS OF HOSPITAL OR OFFICE (NAME CITY, STATE/PROVINCE, COUNTRY) TEXT BOX
	@FindBy(xpath = "//tbody/tr[3]/td[16]/input[1]")
	public WebElement clottingDisorderAddressTextBox;

	//"OTHER.." TEXT BOX
	@FindBy(xpath = "(//input[@class='TextEntryBox InputText QR-QID234-x4-TEXT QWatchTimer'])[1]")
	public WebElement otherBleedingTextBox;

	//"OTHER... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[4]/td[3]/input[1]")
	public WebElement otherBleedingFirstSymptomsDateTextBox;

	//"OTHER... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[4]/td[4]/input[1]")
	public WebElement otherBleedingFirstSymptomsAgeTextBox;

	//"OTHER... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[4]/td[8]/input[1]")
	public WebElement otherBleedingDiagnosisDateTextBox;

	//"OTHER... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[4]/td[9]/input[1]")
	public WebElement otherBleedingDiagnosisAgeTextBox;

	//IF PROCEDURE, A BRIEF DESCRIPTION OR NAME OF PROCEDURE TEXT BOX
	@FindBy(xpath = "//tbody/tr[4]/td[13]/input[1]")
	public WebElement otherBleedingMedicationTypeTextBox;

	//PLEASE PROVIDE ADDRESS OF HOSPITAL OR OFFICE (NAME CITY, STATE/PROVINCE, COUNTRY) TEXT BOX
	@FindBy(xpath = "//tbody/tr[4]/td[16]/input[1]")
	public WebElement otherBleedingAddressTextBox;

	/*
	 * ----------------- END OF PLEASE COMPLETE THE TABLE BELOW FOR EACH OF THE BLEEDING/BRUISING ISSUES LISTED. FOR EACH CONDITION, PLEASE PROVIDE YOUR AGE
	 * OR DATE WHEN SYMPTOMS FIRST STARTED AND AT DIAGNOSIS (YOU ONLY NEED TO PROVIDE DATE OR AGE, BUT NOT BOTH). IF YOU DO NOT RECALL THE DETAILS, PLEASE
	 * PLACE AN 'X' IN THE 'DON'T KNOW' COLUMN. IF NO TREATMENT WAS REQUIRED, PLEASE WRITE 'NONE' IN THE TREATMENT COLUMN. PAGE -----------------
	 */
	
	/*
	 * ----------------- BEGINNING OF Have you ever been diagnosed with any of the following blood disorders or symptoms of blood disorders? Please select all that apply. STEPS PAGE-----------------
	 */
	
	//"OTHER LEUKEMIA..." TEXT BOX
		@FindBy(xpath = "(//input[@title='Other leukemia (please specify)'])[1]")
		public WebElement otherLeukemiaTextBox;
	
	/*
	 * ----------------- END OF Have you ever been diagnosed with any of the following blood disorders or symptoms of blood disorders? Please select all that apply. STEPS PAGE-----------------
	 */
	
	/*
	 * ----------------- BEGINING OF PLEASE COMPLETE THE TABLE BELOW FOR EACH OF THE BLOOD DISORDERS ISSUES LISTED. FOR EACH CONDITION LISTED, PLEASE INCLUDE
	 * EITHER YOUR AGE OR DATE OF SYMPTOMS AND DIAGNOSIS (YOU DO NOT NEED TO INCLUDE BOTH DATE AND AGE). IF YOU DO NOT RECALL THE DETAILS, PLEASE PLACE AN 'X' IN
	 * THE COLUMN 'DON'T KNOW'. IF NO TREATMENT WAS REQUIRED, PLEASE WRITE 'NONE' IN THE 'TREATMENT' COLUMN. PAGE -----------------
	 */

	//"SPLENOMEGALY... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[1]/td[3]/input[1]")
	public WebElement splenomegalyFirstSymptomsDateTextBox;

	//"SPLENOMEGALY... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[1]/td[4]/input[1]")
	public WebElement splenomegalyFirstSymptomsAgeTextBox;

	//"SPLENOMEGALY... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[1]/td[8]/input[1]")
	public WebElement splenomegalyDiagnosisDateTextBox;

	//"SPLENOMEGALY... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[1]/td[9]/input[1]")
	public WebElement splenomegalyDiagnosisAgeTextBox;

	//"SPLENOMEGALY...MEDICATION OR PROCEDURE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[1]/td[13]/input[1]")
	public WebElement splenomegalyMedicationTypeTextBox;

	//PLEASE PROVIDE ADDRESS OF HOSPITAL OR OFFICE (NAME CITY, STATE/PROVINCE, COUNTRY WHERE EVALUATION WAS COMPLETED) TEXT BOX
	@FindBy(xpath = "//tbody/tr[1]/td[16]/input[1]")
	public WebElement splenomegalyAddressTextBox;

	//"MYELOPROLIFERATIVE DISORDER... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[2]/td[3]/input[1]")
	public WebElement myeloproliferativeFirstSymptomsDateTextBox;

	//"MYELOPROLIFERATIVE DISORDER... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[2]/td[4]/input[1]")
	public WebElement myeloproliferativeFirstSymptomsAgeTextBox;

	//"MYELOPROLIFERATIVE DISORDER... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[2]/td[8]/input[1]")
	public WebElement myeloproliferativeDiagnosisDateTextBox;

	//"MYELOPROLIFERATIVE DISORDER... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[2]/td[9]/input[1]")
	public WebElement myeloproliferativeDiagnosisAgeTextBox;

	//"MYELOPROLIFERATIVE DISORDER MEDICATION OR PROCEDURE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[2]/td[13]/input[1]")
	public WebElement myeloproliferativeMedicationTypeTextBox;

	//PLEASE PROVIDE ADDRESS OF HOSPITAL OR OFFICE (NAME CITY, STATE/PROVINCE, COUNTRY WHERE EVALUATION WAS COMPLETED) TEXT BOX
	@FindBy(xpath = "//tbody/tr[2]/td[16]/input[1]")
	public WebElement myeloproliferativeAddressTextBox;

	//"JUVENILE MYELOMONOCYTIC LEUKEMIA... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[3]/td[3]/input[1]")
	public WebElement juvenileMyelomonocyticFirstSymptomsDateTextBox;

	//"JUVENILE MYELOMONOCYTIC LEUKEMIA... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[3]/td[4]/input[1]")
	public WebElement juvenileMyelomonocyticFirstSymptomsAgeTextBox;

	//"JUVENILE MYELOMONOCYTIC LEUKEMIA... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[3]/td[8]/input[1]")
	public WebElement juvenileMyelomonocyticDiagnosisDateTextBox;

	//"JUVENILE MYELOMONOCYTIC LEUKEMIA... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[3]/td[9]/input[1]")
	public WebElement juvenileMyelomonocyticDiagnosisAgeTextBox;

	//MEDICATION OR PROCEDURE TEXT BOX
	@FindBy(xpath = "//tbody/tr[3]/td[13]/input[1]")
	public WebElement juvenileMyelomonocyticMedicationTypeTextBox;

	//PLEASE PROVIDE ADDRESS OF HOSPITAL OR OFFICE (NAME CITY, STATE/PROVINCE, COUNTRY WHERE EVALUATION WAS COMPLETED) TEXT BOX
	@FindBy(xpath = "//tbody/tr[3]/td[16]/input[1]")
	public WebElement juvenileMyelomonocyticAddressTextBox;

	//"THROMBOCYTOPENIA... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[4]/td[3]/input[1]")
	public WebElement thrombocytopeniaFirstSymptomsDateTextBox;

	//"THROMBOCYTOPENIA... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[4]/td[4]/input[1]")
	public WebElement thrombocytopeniaFirstSymptomsAgeTextBox;

	//"THROMBOCYTOPENIA... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[4]/td[8]/input[1]")
	public WebElement thrombocytopeniaDiagnosisDateTextBox;

	//"THROMBOCYTOPENIA... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[4]/td[9]/input[1]")
	public WebElement thrombocytopeniaDiagnosisAgeTextBox;
	
	//MEDICATION OR PROCEDURE TEXT BOX
	@FindBy(xpath = "//tbody/tr[4]/td[13]/input[1]")
	public WebElement thrombocytopeniaMedicationTypeTextBox;

	//PLEASE PROVIDE ADDRESS OF HOSPITAL OR OFFICE (NAME CITY, STATE/PROVINCE, COUNTRY WHERE EVALUATION WAS COMPLETED) TEXT BOX
	@FindBy(xpath = "//tbody/tr[4]/td[16]/input[1]")
	public WebElement thrombocytopeniaAddressTextBox;
	
	//"MARROW HYPOPLASIA... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[5]/td[3]/input[1]")
	public WebElement marrowHypoplasiaFirstSymptomsDateTextBox;

	//"MARROW HYPOPLASIA... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[5]/td[4]/input[1]")
	public WebElement marrowHypoplasiaFirstSymptomsAgeTextBox;

	//"MARROW HYPOPLASIA... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[5]/td[8]/input[1]")
	public WebElement marrowHypoplasiaDiagnosisDateTextBox;

	//"MARROW HYPOPLASIA... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[5]/td[9]/input[1]")
	public WebElement marrowHypoplasiaDiagnosisAgeTextBox;

	//MEDICATION OR PROCEDURE TEXT BOX
	@FindBy(xpath = "//tbody/tr[5]/td[13]/input[1]")
	public WebElement marrowHypoplasiaMedicationTypeTextBox;

	//PLEASE PROVIDE ADDRESS OF HOSPITAL OR OFFICE (NAME CITY, STATE/PROVINCE, COUNTRY WHERE EVALUATION WAS COMPLETED) TEXT BOX
	@FindBy(xpath = "//tbody/tr[5]/td[16]/input[1]")
	public WebElement marrowHypoplasiaAddressTextBox;
	
	//"HISTORY OF LOW BLOOD CELL COUNT... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[6]/td[3]/input[1]")
	public WebElement historyOfLowBloodCellCountFirstSymptomsDateTextBox;

	//"HISTORY OF LOW BLOOD CELL COUNT... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[6]/td[4]/input[1]")
	public WebElement historyOfLowBloodCellCountFirstSymptomsAgeTextBox;

	//"HISTORY OF LOW BLOOD CELL COUNT... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[6]/td[8]/input[1]")
	public WebElement historyOfLowBloodCellCountDiagnosisDateTextBox;

	//"HISTORY OF LOW BLOOD CELL COUNT... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[6]/td[9]/input[1]")
	public WebElement historyOfLowBloodCellCountDiagnosisAgeTextBox;

	//MEDICATION OR PROCEDURE TEXT BOX
	@FindBy(xpath = "//tbody/tr[6]/td[13]/input[1]")
	public WebElement historyOfLowBloodCellCountMedicationTypeTextBox;

	//PLEASE PROVIDE ADDRESS OF HOSPITAL OR OFFICE (NAME CITY, STATE/PROVINCE, COUNTRY WHERE EVALUATION WAS COMPLETED) TEXT BOX
	@FindBy(xpath = "//tbody/tr[6]/td[16]/input[1]")
	public WebElement historyOfLowBloodCellCountAddressTextBox;

	//"OTHER LEUKEMIA... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[7]/td[3]/input[1]")
	public WebElement otherLeukemiaFirstSymptomsDateTextBox;

	//"OTHER LEUKEMIA... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[7]/td[4]/input[1]")
	public WebElement otherLeukemiaFirstSymptomsAgeTextBox;
	
	//"OTHER LEUKEMIA... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[7]/td[8]/input[1]")
	public WebElement otherLeukemiaDiagnosisDateTextBox;

	//"OTHER LEUKEMIA... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[7]/td[9]/input[1]")
	public WebElement otherLeukemiaDiagnosisAgeTextBox;

	//MEDICATION OR PROCEDURE TEXT BOX
	@FindBy(xpath = "//tbody/tr[7]/td[13]/input[1]")
	public WebElement otherLeukemiaMedicationTypeTextBox;

	//PLEASE PROVIDE ADDRESS OF HOSPITAL OR OFFICE (NAME CITY, STATE/PROVINCE, COUNTRY WHERE EVALUATION WAS COMPLETED) TEXT BOX
	@FindBy(xpath = "//tbody/tr[7]/td[16]/input[1]")
	public WebElement otherLeukemiaAddressTextBox;

	//"OTHER (PLEASE SPECIFY)... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[8]/td[3]/input[1]")
	public WebElement otherBloodDisordersFirstSymptomsDateTextBox;

	//"OTHER (PLEASE SPECIFY)... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[8]/td[4]/input[1]")
	public WebElement otherBloodDisordersFirstSymptomsAgeTextBox;

	//"OTHER (PLEASE SPECIFY)... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[8]/td[8]/input[1]")
	public WebElement otherBloodDisordersDiagnosisDateTextBox;

	//"OTHER (PLEASE SPECIFY)... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[8]/td[9]/input[1]")
	public WebElement otherBloodDisordersDiagnosisAgeTextBox;

	//MEDICATION OR PROCEDURE TEXT BOX
	@FindBy(xpath = "//tbody/tr[8]/td[13]/input[1]")
	public WebElement otherBloodDisordersMedicationTypeTextBox;

	//PLEASE PROVIDE ADDRESS OF HOSPITAL OR OFFICE (NAME CITY, STATE/PROVINCE, COUNTRY WHERE EVALUATION WAS COMPLETED) TEXT BOX
	@FindBy(xpath = "//tbody/tr[8]/td[16]/input[1]")
	public WebElement otherBloodDisordersAddressTextBox;

	/*
	 * ----------------- END OF PLEASE COMPLETE THE TABLE BELOW FOR EACH OF THE BLOOD DISORDERS ISSUES LISTED. FOR EACH CONDITION LISTED, PLEASE INCLUDE
	 * EITHER YOUR AGE OR DATE OF SYMPTOMS AND DIAGNOSIS (YOU DO NOT NEED TO INCLUDE BOTH DATE AND AGE). IF YOU DO NOT RECALL THE DETAILS, PLEASE PLACE AN 'X' IN
	 * THE COLUMN 'DON'T KNOW'. IF NO TREATMENT WAS REQUIRED, PLEASE WRITE 'NONE' IN THE 'TREATMENT' COLUMN. STEPS PAGE -----------------
	 */

	/*
	 * ----------------- BEGINNING OF PLEASE COMPLETE THE TABLE BELOW FOR EACH OF THE TUMORS LISTED. PLEASE INCLUDE YOUR AGE OR DATE WHEN SYMPTOMS FIRST
	 * STARTED AND DIAGNOSIS (YOU DO NOT NEED TO INCLUDE BOTH AGE AND DATE). IF YOU DO NOT RECALL THE DETAILS, PLEASE PLACE AN 'X' UNDER THE 'DON'T KNOW' COLUMN. PAGE ----------------- 
	 */

	//"GIANT CELL LESION... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[1]/td[3]/input[1]")
	public WebElement giantCellLesionFirstSymptomsDateTextBox;

	//"GIANT CELL LESION... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[1]/td[4]/input[1]")
	public WebElement giantCellLesionFirstSymptomsAgeTextBox;

	//"GIANT CELL LESION... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[1]/td[8]/input[1]")
	public WebElement giantCellLesionDiagnosisDateTextBox;

	//"GIANT CELL LESION... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[1]/td[9]/input[1]")
	public WebElement giantCellLesionDiagnosisAgeTextBox;

	//GIANT CELL LESION "YES" RADIO BUTTON
	@FindBy(xpath = "//label[@for='QR~QID237#3~x1~1']")
	public WebElement giantCellLesionYesRadioButton;

	//"PIGMENTED VILONODULOUS SYNOVITUS... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[2]/td[3]/input[1]")
	public WebElement pigmentedVilonodulousFirstSymptomsDateTextBox;

	//"PIGMENTED VILONODULOUS SYNOVITUS... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[2]/td[4]/input[1]")
	public WebElement pigmentedVilonodulousFirstSymptomsAgeTextBox;

	//"PIGMENTED VILONODULOUS SYNOVITUS... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[2]/td[8]/input[1]")
	public WebElement pigmentedVilonodulousDiagnosisDateTextBox;

	//"PIGMENTED VILONODULOUS SYNOVITUS... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[2]/td[9]/input[1]")
	public WebElement pigmentedVilonodulousDiagnosisAgeTextBox;

	//PIGMENTED VILONODULOUS SYNOVITUS "YES" RADIO BUTTON
	@FindBy(xpath = "//label[@for='QR~QID237#3~x2~1']")
	public WebElement pigmentedVilonodulousYesRadioButton;

	//"PAPILOMATA... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[3]/td[3]/input[1]")
	public WebElement papilomataFirstSymptomsDateTextBox;

	//"PAPILOMATA... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[3]/td[4]/input[1]")
	public WebElement papilomataFirstSymptomsAgeTextBox;

	//"PAPILOMATA... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[3]/td[8]/input[1]")
	public WebElement papilomataDiagnosisDateTextBox;

	//"PAPILOMATA... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[3]/td[9]/input[1]")
	public WebElement papilomataDiagnosisAgeTextBox;

	//PAPILOMATA... "YES" RADIO BUTTON
	@FindBy(xpath = "//label[contains(@for,'QR~QID237#3~x3~1')]")
	public WebElement papilomataYesRadioButton;

	//"RHABDOMYOSARCOMA... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[4]/td[3]/input[1]")
	public WebElement rhabdomyosarcomaFirstSymptomsDateTextBox;

	//"RHABDOMYOSARCOMA... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[4]/td[4]/input[1]")
	public WebElement rhabdomyosarcomaFirstSymptomsAgeTextBox;

	//"RHABDOMYOSARCOMA... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[4]/td[8]/input[1]")
	public WebElement rhabdomyosarcomaDiagnosisDateTextBox;

	//"RHABDOMYOSARCOMA... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[4]/td[9]/input[1]")
	public WebElement rhabdomyosarcomaDiagnosisAgeTextBox;

	//RHABDOMYOSARCOMA... "YES" RADIO BUTTON
	@FindBy(xpath = "//label[contains(@for,'QR~QID237#3~x4~1')]")
	public WebElement rhabdomyosarcomaYesRadioButton;

	//"NEUROBLASTOMA... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[5]/td[3]/input[1]")
	public WebElement neuroblastomaFirstSymptomsDateTextBox;

	//"NEUROBLASTOMA... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[5]/td[4]/input[1]")
	public WebElement neuroblastomaFirstSymptomsAgeTextBox;

	//"NEUROBLASTOMA... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[5]/td[8]/input[1]")
	public WebElement neuroblastomaDiagnosisDateTextBox;

	//"NEUROBLASTOMA... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[5]/td[9]/input[1]")
	public WebElement neuroblastomaDiagnosisAgeTextBox;

	//NEUROBLASTOMA..."YES" RADIO BUTTON
	@FindBy(xpath = "//label[contains(@for,'QR~QID237#3~x5~1')]")
	public WebElement neuroblastomaYesRadioButton;
	
	//"OTHER (PLEASE SPECIFY)... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[6]/td[3]/input[1]")
	public WebElement otherTumorDisorderFirstSymptomsDateTextBox;

	//"OTHER (PLEASE SPECIFY)... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[6]/td[4]/input[1]")
	public WebElement otherTumorDisorderFirstSymptomsAgeTextBox;

	//"OTHER (PLEASE SPECIFY)... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[6]/td[8]/input[1]")
	public WebElement otherTumorDisorderDiagnosisDateTextBox;

	//"OTHER (PLEASE SPECIFY)... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[6]/td[9]/input[1]")
	public WebElement otherTumorDisorderDiagnosisAgeTextBox;


	//OTHER TUMOR "YES" RADIO BUTTON
	@FindBy(xpath = "//label[contains(@for,'QR~QID237#3~x6~1')]")
	public WebElement otherTumorDisorderYesRadioButton;

	/*
	 * ----------------- END OF PLEASE COMPLETE THE TABLE BELOW FOR EACH OF THE TUMORS LISTED. PLEASE INCLUDE YOUR AGE OR DATE WHEN SYMPTOMS FIRST
	 * STARTED AND DIAGNOSIS (YOU DO NOT NEED TO INCLUDE BOTH AGE AND DATE). IF YOU DO NOT RECALL THE DETAILS, PLEASE PLACE AN 'X' UNDER THE 'DON'T KNOW' COLUMN. PAGE ----------------- 
	 */

	/*
	 * ----------------- BEGINNING OF PLEASE PROVIDE THE NAME OF THE
	 * IMMUNOLOGIST/RHEUMATOLOGIST WHO COMPLETED YOUR EVALUATION. STEPS PAGE ----------------- */

	//"NAME OF PHYSICIAN" TEXT BOX
	@FindBy(xpath = "(//input[@class='Medium InputText QR-QID392-1 QWatchTimer'])[1]")
	public WebElement nameOfPhysicianImmunologistTextBox;

	//"CITY, STATE" TEXT BOX
	@FindBy(xpath = "(//input[@class='Medium InputText QR-QID392-2 QWatchTimer'])[1]")
	public WebElement cityStateImmunologistTextBox;

	//"HOSPITAL OR MEDICAL CENTER AFFILIATION" TEXT BOX
	@FindBy(xpath = "(//input[@class='Medium InputText QR-QID392-3 QWatchTimer'])[1]")
	public WebElement hospitalOrMedicalCenterAffiliationImmunologistTextBox;

	/*
	 * ----------------- END OF PLEASE PROVIDE THE NAME OF THE
	 * IMMUNOLOGIST/RHEUMATOLOGIST WHO COMPLETED YOUR EVALUATION. PAGE ----------------- */

	/*
	 * ----------------- BEGINNING OF PLEASE COMPLETE THE TABLE BELOW FOR EACH OF THE IMMUNODEFICIENCIES LISTED. FOR EACH, PLEASE PROVIDE THE DATE OR AGE AT
	 * WHICH SYMPTOMS OCCURRED AND DIAGNOSIS (YOU DO NOT NEED TO INCLUDE BOTH AGE AND DATE). IF YOU DO NOT RECALL DETAILS, PLEASE PLACE AN 'X' IN THE 'DON'T
	 * KNOW' COLUMN. IF NO TREATMENT HAS BEEN REQUIRED, PLACE 'NONE' IN THE'TREATMENT' COLUMN. PAGE -----------------
	 */

	//"NO FORMAL DIAGNOSIS...DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[1]/td[3]/input[1]")
	public WebElement frequentInfectionsNoFormalDiagnosisFirstSymptomsDateTextBox;

	//"NO FORMAL DIAGNOSIS... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[1]/td[4]/input[1]")
	public WebElement frequentInfectionsNoFormalDiagnosisFirstSymptomsAgeTextBox;

	//"NO FORMAL DIAGNOSIS... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[1]/td[8]/input[1]")
	public WebElement frequentInfectionsNoFormalDiagnosisDiagnosisDateTextBox;

	//"NO FORMAL DIAGNOSIS...AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[1]/td[9]/input[1]")
	public WebElement frequentInfectionsNoFormalDiagnosisDiagnosisAgeTextBox;

	//IF PROCEDURE, A BRIEF DESCRIPTION OR NAME OF PROCEDURE TEXT BOX
	@FindBy(xpath = "//tbody/tr[1]/td[13]/input[1]")
	public WebElement frequentInfectionsNoFormalDiagnosisMedicationTypeTextBox;

	//PLEASE PROVIDE ADDRESS OF HOSPITAL OR OFFICE (NAME CITY, STATE/PROVINCE, COUNTRY) TEXT BOX
	@FindBy(xpath = "//tbody/tr[1]/td[16]/input[1]")
	public WebElement frequentInfectionsNoFormalDiagnosisAddressTextBox;

	//"FORMAL DIAGNOSIS...DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[2]/td[3]/input[1]")
	public WebElement frequentInfectionsFormalDiagnosisFirstSymptomsDateTextBox;

	//"FORMAL DIAGNOSIS... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[2]/td[4]/input[1]")
	public WebElement frequentInfectionsFormalDiagnosisFirstSymptomsAgeTextBox;

	//"FORMAL DIAGNOSI... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[2]/td[8]/input[1]")
	public WebElement frequentInfectionsFormalDiagnosisDiagnosisDateTextBox;

	//"FORMAL DIAGNOSIS...AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[2]/td[9]/input[1]")
	public WebElement frequentInfectionsFormalDiagnosisDiagnosisAgeTextBox;

	//IF PROCEDURE, A BRIEF DESCRIPTION OR NAME OF PROCEDURE TEXT BOX
	@FindBy(xpath = "//tbody/tr[2]/td[13]/input[1]")
	public WebElement frequentInfectionsFormalDiagnosisMedicationTypeTextBox;

	//PLEASE PROVIDE ADDRESS OF HOSPITAL OR OFFICE (NAME CITY, STATE/PROVINCE, COUNTRY) TEXT BOX
	@FindBy(xpath = "//tbody/tr[2]/td[16]/input[1]")
	public WebElement frequentInfectionsFormalDiagnosisAddressTextBox;
	
	//"OTHER... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[3]/td[3]/input[1]")
	public WebElement otherFrequentInfectionsFormalFirstSymptomsDateTextBox;

	//"OTHER... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[3]/td[4]/input[1]")
	public WebElement otherFrequentInfectionsFormalFirstSymptomsAgeTextBox;

	//"OTHER... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[3]/td[8]/input[1]")
	public WebElement otherFrequentInfectionsFormalDiagnosisDateTextBox;

	//"OTHER... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[3]/td[9]/input[1]")
	public WebElement otherFrequentInfectionsFormalDiagnosisAgeTextBox;

	//IF PROCEDURE, A BRIEF DESCRIPTION OR NAME OF PROCEDURE TEXT BOX
	@FindBy(xpath = "//tbody/tr[3]/td[13]/input[1]")
	public WebElement otherFrequentInfectionsFormalDiagnosisMedicationTypeTextBox;

	//PLEASE PROVIDE ADDRESS OF HOSPITAL OR OFFICE (NAME CITY, STATE/PROVINCE, COUNTRY) TEXT BOX
	@FindBy(xpath = "//tbody/tr[3]/td[16]/input[1]")
	public WebElement otherFrequentInfectionsFormalDiagnosisAddressTextBox;

	/*
	 * ----------------- END OF PLEASE COMPLETE THE TABLE BELOW FOR EACH OF THE IMMUNODEFICIENCIES LISTED. FOR EACH, PLEASE PROVIDE THE DATE OR AGE AT
	 * WHICH SYMPTOMS OCCURRED AND DIAGNOSIS (YOU DO NOT NEED TO INCLUDE BOTH AGE AND DATE). IF YOU DO NOT RECALL DETAILS, PLEASE PLACE AN 'X' IN THE 'DON'T
	 * KNOW' COLUMN. IF NO TREATMENT HAS BEEN REQUIRED, PLACE 'NONE' IN THE'TREATMENT' COLUMN. PAGE -----------------
	 */

	/*
	 * ----------------- BEGINNING OF PLEASE COMPLETE THE TABLE BELOW FOR EACH OF THE AUTOIMMUNE CONDITIONS LISTED BELOW. PLEASE PROVIDE THE DATE OR AGE WHEN
	 * SYMPTOMS FIRST OCCURRED AND DIAGNOSIS (YOU DO NOT NEED TO INCLUDE BOTH AGE AND DATE). IF YOU DO NOT RECALL THE DETAILS, PLEASE PLACE AN 'X' IN THE
	 * 'DON'T KNOW' BOX. IF NO TREATMENT WAS REQUIRED, PLEASE STATE 'NONE' IN THE 'TREATMENT' COLUMN. PAGE -----------------
	 */

	//"AUTOIMMUNE THYROIDITIS... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[1]/td[3]/input[1]")
	public WebElement autoimmuneThyroiditisFirstSymptomsDateTextBox;

	//"AUTOIMMUNE THYROIDITIS... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[1]/td[4]/input[1]")
	public WebElement autoimmuneThyroiditisFirstSymptomsAgeTextBox;

	//"AUTOIMMUNE THYROIDITIS... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[1]/td[8]/input[1]")
	public WebElement autoimmuneThyroiditisDiagnosisDateTextBox;

	//"AUTOIMMUNE THYROIDITIS... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[1]/td[9]/input[1]")
	public WebElement autoimmuneThyroiditisDiagnosisAgeTextBox;

	//IF PROCEDURE, A BRIEF DESCRIPTION OR NAME OF PROCEDURE TEXT BOX
	@FindBy(xpath = "//tbody/tr[1]/td[13]/input[1]")
	public WebElement autoimmuneThyroiditisMedicationTypeTextBox;

	//PLEASE PROVIDE ADDRESS OF HOSPITAL OR OFFICE (NAME CITY, STATE/PROVINCE, COUNTRY) TEXT BOX
	@FindBy(xpath = "//tbody/tr[1]/td[16]/input[1]")
	public WebElement autoimmuneThyroiditisAddressTextBox;

	//"LUPUS... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[2]/td[3]/input[1]")
	public WebElement lupusFirstSymptomsDateTextBox;

	//"LUPUS... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[2]/td[4]/input[1]")
	public WebElement lupusFirstSymptomsAgeTextBox;

	//"LUPUS... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[2]/td[8]/input[1]")
	public WebElement lupusDiagnosisDateTextBox;

	//"LUPUS... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[2]/td[9]/input[1]")
	public WebElement lupusDiagnosisAgeTextBox;

	//IF PROCEDURE, A BRIEF DESCRIPTION OR NAME OF PROCEDURE TEXT BOX
	@FindBy(xpath = "//tbody/tr[2]/td[13]/input[1]")
	public WebElement lupusMedicationTypeTextBox;

	//PLEASE PROVIDE ADDRESS OF HOSPITAL OR OFFICE (NAME CITY, STATE/PROVINCE, COUNTRY) TEXT BOX
	@FindBy(xpath = "//tbody/tr[2]/td[16]/input[1]")
	public WebElement lupusAddressTextBox;
	
	//"PSORIASIS... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[3]/td[3]/input[1]")
	public WebElement psoriasisFirstSymptomsDateTextBox;

	//"PSORIASIS... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[3]/td[4]/input[1]")
	public WebElement psoriasisFirstSymptomsAgeTextBox;

	//"PSORIASIS... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[3]/td[8]/input[1]")
	public WebElement psoriasisDiagnosisDateTextBox;

	//"PSORIASIS... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[3]/td[9]/input[1]")
	public WebElement psoriasisDiagnosisAgeTextBox;

	//IF PROCEDURE, A BRIEF DESCRIPTION OR NAME OF PROCEDURE TEXT BOX
	@FindBy(xpath = "//tbody/tr[3]/td[13]/input[1]")
	public WebElement psoriasisMedicationTypeTextBox;

	//PLEASE PROVIDE ADDRESS OF HOSPITAL OR OFFICE (NAME CITY, STATE/PROVINCE, COUNTRY) TEXT BOX
	@FindBy(xpath = "//tbody/tr[3]/td[16]/input[1]")
	public WebElement psoriasisAddressTextBox;

	//"OTHER... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[4]/td[3]/input[1]")
	public WebElement automimmuneBloodConditionFirstSymptomsDateTextBox;

	//"OTHER... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[4]/td[4]/input[1]")
	public WebElement automimmuneBloodConditionFirstSymptomsAgeTextBox;

	//"OTHER... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[4]/td[8]/input[1]")
	public WebElement automimmuneBloodConditionDiagnosisDateTextBox;

	//"OTHER... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[4]/td[9]/input[1]")
	public WebElement automimmuneBloodConditionDiagnosisAgeTextBox;

	//IF PROCEDURE, A BRIEF DESCRIPTION OR NAME OF PROCEDURE TEXT BOX
	@FindBy(xpath = "//tbody/tr[4]/td[13]/input[1]")
	public WebElement automimmuneBloodConditionMedicationTypeTextBox;

	//PLEASE PROVIDE ADDRESS OF HOSPITAL OR OFFICE (NAME CITY, STATE/PROVINCE, COUNTRY) TEXT BOX
	@FindBy(xpath = "//tbody/tr[4]/td[16]/input[1]")
	public WebElement automimmuneBloodConditionAddressTextBox;
	
	//OTHER "AUTOMIMMUNE BLOOD CONDITION..." TEXT BOX
	@FindBy(xpath = "(//input[contains(@title,'Autoimmune blood condition (ie, neutropenic, thrombocytopenia). Please specify')])[1]")
	public WebElement otherAutomimmuneTextBox;

	//"AUTOMIMMUNE BLOOD CONDITION... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[5]/td[3]/input[1]")
	public WebElement otherAutomimmuneBloodConditionFirstSymptomsDateTextBox;

	//"AUTOMIMMUNE BLOOD CONDITION... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[5]/td[4]/input[1]")
	public WebElement otherAutomimmuneBloodConditionFirstSymptomsAgeTextBox;

	//"AUTOMIMMUNE BLOOD CONDITION... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[5]/td[8]/input[1]")
	public WebElement otherAutomimmuneBloodConditionDiagnosisDateTextBox;

	//"AUTOMIMMUNE BLOOD CONDITION... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[5]/td[9]/input[1]")
	public WebElement otherAutomimmuneBloodConditionDiagnosisAgeTextBox;

	//IF PROCEDURE, A BRIEF DESCRIPTION OR NAME OF PROCEDURE TEXT BOX
	@FindBy(xpath = "//tbody/tr[5]/td[13]/input[1]")
	public WebElement otherAutomimmuneBloodConditionMedicationTypeTextBox;

	//PLEASE PROVIDE ADDRESS OF HOSPITAL OR OFFICE (NAME CITY, STATE/PROVINCE, COUNTRY) TEXT BOX
	@FindBy(xpath = "//tbody/tr[5]/td[16]/input[1]")
	public WebElement otherAutomimmuneBloodConditionAddressTextBox;

	/*
	 * ----------------- END OF PLEASE COMPLETE THE TABLE BELOW FOR EACH OF THE AUTOIMMUNE CONDITIONS LISTED BELOW. PLEASE PROVIDE THE DATE OR AGE WHEN
	 * SYMPTOMS FIRST OCCURRED AND DIAGNOSIS (YOU DO NOT NEED TO INCLUDE BOTH AGE AND DATE). IF YOU DO NOT RECALL THE DETAILS, PLEASE PLACE AN 'X' IN THE
	 * 'DON'T KNOW' BOX. IF NO TREATMENT WAS REQUIRED, PLEASE STATE 'NONE' IN THE 'TREATMENT' COLUMN. PAGE -----------------
	 */
	
	/*
	 * ----------------- BEGINNING OF PLEASE PROVIDE THE INFORMATION FOR THE NEUROLOGIST OR NEUROSURGEON WHO COMPLETED YOUR EVALUATION. PAGE ----------------- 
	 */

	//"NAME OF PHYSICIAN" TEXT BOX
	@FindBy(xpath = "(//input[@class='Medium InputText QR-QID394-1 QWatchTimer'])[1]")
	public WebElement nameOfPhysicianNeurologistTextBox;

	//"CITY, STATE" TEXT BOX
	@FindBy(xpath = "(//input[@class='Medium InputText QR-QID394-2 QWatchTimer'])[1]")
	public WebElement cityStateNeurologistTextBox;

	//"HOSPITAL OR MEDICAL CENTER AFFILIATION" TEXT BOX
	@FindBy(xpath = "(//input[@class='Medium InputText QR-QID394-3 QWatchTimer'])[1]")
	public WebElement hospitalOrMedicalCenterAffiliationNeurologistTextBox;

	/*
	 * ----------------- END OF PLEASE PROVIDE THE INFORMATION FOR THE NEUROLOGIST OR NEUROSURGEON WHO COMPLETED YOUR EVALUATION. PAGE ----------------- 
	 */

	/*
	 * ----------------- BEGINNING OF PLEASE COMPLETE THE TABLE BELOW FOR EACH OF THE CONDITIONS LISTED. FOR EACH CONDITION, PLEASE LIST EITHER THE DATE OR AGE
	 * WHEN THE SYMPTOMS STARTED AND TIME OF DIAGNOSIS (YOU DO NOT NEED TO INCLUDE BOTH AGE AND DATE). IF YOU DO NOT RECALL, PLACE AN 'X' IN THE 'DON'T KNOW'
	 * COLUMN. PLEASE INDICATE WHETHER YOU HAVE RECEIVED TREATMENT SUCH AS DECOMPRESSION OR OTHER SURGERY AND THE AGE OR DATE AT TREATMENT, IF ANY.
	 * DECOMPRESSION IS SURGERY TO REDUCE PRESSURE ON YOUR BRAIN AND SPINAL CORD AND RESTORE THE NORMAL FLOW OF CEREBROSPINAL FLUID. PAGE -----------------
	 */
	
	//"CHIARI MALFORMATION... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[1]/td[3]/input[1]")
	public WebElement chiariMalformationFirstSymptomsDateTextBox;

	//"CHIARI MALFORMATION... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[1]/td[4]/input[1]")
	public WebElement chiariMalformationFirstSymptomsAgeTextBox;

	//"CHIARI MALFORMATION... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[1]/td[8]/input[1]")
	public WebElement chiariMalformationDiagnosisDateTextBox;

	//"CHIARI MALFORMATION... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[1]/td[9]/input[1]")
	public WebElement chiariMalformationDiagnosisAgeTextBox;

	//IF PROCEDURE, A BRIEF DESCRIPTION OR NAME OF PROCEDURE TEXT BOX
	@FindBy(xpath = "//tbody/tr[1]/td[13]/input[1]")
	public WebElement chiariMalformationMedicationTypeTextBox;

	//"HYDROCEPHALUS... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[2]/td[3]/input[1]")
	public WebElement hydrocephalusFirstSymptomsDateTextBox;

	//"HYDROCEPHALUS... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[2]/td[4]/input[1]")
	public WebElement hydrocephalusFirstSymptomsAgeTextBox;

	//"HYDROCEPHALUS... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[2]/td[8]/input[1]")
	public WebElement hydrocephalusDiagnosisDateTextBox;

	//"HYDROCEPHALUS... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[2]/td[9]/input[1]")
	public WebElement hydrocephalusDiagnosisAgeTextBox;

	//IF PROCEDURE, A BRIEF DESCRIPTION OR NAME OF PROCEDURE TEXT BOX
	@FindBy(xpath = "//tbody/tr[2]/td[13]/input[1]")
	public WebElement hydrocephalusMedicationTypeTextBox;
	
	//"SYRINGOMYELIA... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[3]/td[3]/input[1]")
	public WebElement syringomyeliaFirstSymptomsDateTextBox;

	//"SYRINGOMYELIA.... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[3]/td[4]/input[1]")
	public WebElement syringomyeliaFirstSymptomsAgeTextBox;

	//"SYRINGOMYELIA.... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[3]/td[8]/input[1]")
	public WebElement syringomyeliaDiagnosisDateTextBox;

	//"SYRINGOMYELIA.... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[3]/td[9]/input[1]")
	public WebElement syringomyeliaDiagnosisAgeTextBox;

	//IF PROCEDURE, A BRIEF DESCRIPTION OR NAME OF PROCEDURE TEXT BOX
	@FindBy(xpath = "//tbody/tr[3]/td[13]/input[1]")
	public WebElement syringomyeliaMedicationTypeTextBox;

	//"TETHERED... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[4]/td[3]/input[1]")
	public WebElement tetheredFirstSymptomsDateTextBox;

	//"TETHERED.... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[4]/td[4]/input[1]")
	public WebElement tetheredFirstSymptomsAgeTextBox;

	//"TETHERED.... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[4]/td[8]/input[1]")
	public WebElement tetheredDiagnosisDateTextBox;

	//"TETHERED.... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[4]/td[9]/input[1]")
	public WebElement tetheredDiagnosisAgeTextBox;

	//IF PROCEDURE, A BRIEF DESCRIPTION OR NAME OF PROCEDURE TEXT BOX
	@FindBy(xpath = "//tbody/tr[4]/td[13]/input[1]")
	public WebElement tetheredMedicationTypeTextBox;

	//"CORTICAL... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[5]/td[3]/input[1]")
	public WebElement corticalFirstSymptomsDateTextBox;

	//"CORTICAL.... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[5]/td[4]/input[1]")
	public WebElement corticalFirstSymptomsAgeTextBox;

	//"CORTICAL.... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[5]/td[8]/input[1]")
	public WebElement corticalDiagnosisDateTextBox;

	//"CORTICAL.... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[5]/td[9]/input[1]")
	public WebElement corticalDiagnosisAgeTextBox;

	//IF PROCEDURE, A BRIEF DESCRIPTION OR NAME OF PROCEDURE TEXT BOX
	@FindBy(xpath = "//tbody/tr[5]/td[13]/input[1]")
	public WebElement corticalMedicationTypeTextBox;

	//"Other... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[6]/td[3]/input[1]")
	public WebElement otherNeurologicalFirstSymptomsDateTextBox;

	//"OTHER... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[6]/td[4]/input[1]")
	public WebElement otherNeurologicalFirstSymptomsAgeTextBox;

	//"OTHER... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[6]/td[8]/input[1]")
	public WebElement otherNeurologicalDiagnosisDateTextBox;

	//"OTHER... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[6]/td[9]/input[1]")
	public WebElement otherNeurologicalDiagnosisAgeTextBox;

	//IF PROCEDURE, A BRIEF DESCRIPTION OR NAME OF PROCEDURE TEXT BOX
	@FindBy(xpath = "//tbody/tr[6]/td[13]/input[1]")
	public WebElement otherNeurologicalMedicationTypeTextBox;

	/*
	 * ----------------- END OF PLEASE COMPLETE THE TABLE BELOW FOR EACH OF THE
	 * CONDITIONS LISTED. FOR EACH CONDITION, PLEASE LIST EITHER THE DATE OR AGE
	 * WHEN THE SYMPTOMS STARTED AND TIME OF DIAGNOSIS (YOU DO NOT NEED TO INCLUDE
	 * BOTH AGE AND DATE). IF YOU DO NOT RECALL, PLACE AN 'X' IN THE 'DON'T KNOW'
	 * COLUMN. PLEASE INDICATE WHETHER YOU HAVE RECEIVED TREATMENT SUCH AS
	 * DECOMPRESSION OR OTHER SURGERY AND THE AGE OR DATE AT TREATMENT, IF ANY.
	 * DECOMPRESSION IS SURGERY TO REDUCE PRESSURE ON YOUR BRAIN AND SPINAL CORD AND
	 * RESTORE THE NORMAL FLOW OF CEREBROSPINAL FLUID. PAGE  ----------------- */

	/*
	 * ----------------- BEGINNING OF PLEASE COMPLETE THE TABLE BELOW FOR EACH OF
	 * THE CONDITIONS LISTED. FOR EACH CONDITION, PLEASE INCLUDE THE AGE OR DATE
	 * WHEN SYMPTOMS OCCURRED AND WHEN DIAGNOSED (YOU DO NOT NEED TO INCLUDE BOTH
	 * AGE AND DATE). IF YOU DO NOT RECALL, PLEASE PLACE AN 'X' IN THE 'DON'T KNOW'
	 * BOX. PAGE -----------------*/
	
	//"FEBRILE... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[1]/td[3]/input[1]")
	public WebElement febrileFirstSymptomsDateTextBox;

	//"FEBRILE... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[1]/td[4]/input[1]")
	public WebElement febrileFirstSymptomsAgeTextBox;

	//"FEBRILE... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[1]/td[8]/input[1]")
	public WebElement febrileDiagnosisDateTextBox;

	//"FEBRILE... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[1]/td[9]/input[1]")
	public WebElement febrileDiagnosisAgeTextBox;

	//IF PROCEDURE, A BRIEF DESCRIPTION OR NAME OF PROCEDURE TEXT BOX
	@FindBy(xpath = "//tbody/tr[1]/td[13]/input[1]")
	public WebElement febrileMedicationTypeTextBox;

	//"EPILEPSY RESOLVED... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[2]/td[3]/input[1]")
	public WebElement epilepsyResolvedFirstSymptomsDateTextBox;

	//"EPILEPSY RESOLVED... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[2]/td[4]/input[1]")
	public WebElement epilepsyResolvedFirstSymptomsAgeTextBox;

	//"EPILEPSY RESOLVED... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[2]/td[8]/input[1]")
	public WebElement epilepsyResolvedDiagnosisDateTextBox;

	//"EPILEPSY RESOLVED... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[2]/td[9]/input[1]")
	public WebElement epilepsyResolvedDiagnosisAgeTextBox;

	//IF PROCEDURE, A BRIEF DESCRIPTION OR NAME OF PROCEDURE TEXT BOX
	@FindBy(xpath = "//tbody/tr[2]/td[13]/input[1]")
	public WebElement epilepsyResolvedMedicationTypeTextBox;
	
	//"EPILEPSY ONGOING... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[3]/td[3]/input[1]")
	public WebElement epilepsyOngoingFirstSymptomsDateTextBox;

	//"EPILEPSY ONGOING.... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[3]/td[4]/input[1]")
	public WebElement epilepsyOngoingFirstSymptomsAgeTextBox;

	//"EPILEPSY ONGOING.... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[3]/td[8]/input[1]")
	public WebElement epilepsyOngoingDiagnosisDateTextBox;

	//"EPILEPSY ONGOING.... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[3]/td[9]/input[1]")
	public WebElement epilepsyOngoingDiagnosisAgeTextBox;

	//IF PROCEDURE, A BRIEF DESCRIPTION OR NAME OF PROCEDURE TEXT BOX
	@FindBy(xpath = "//tbody/tr[3]/td[13]/input[1]")
	public WebElement epilepsyOngoingMedicationTypeTextBox;

	//"SEIZURES UNCONTROLLED... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[4]/td[3]/input[1]")
	public WebElement seizuresUncontrolledFirstSymptomsDateTextBox;

	//"SEIZURES UNCONTROLLED... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[4]/td[4]/input[1]")
	public WebElement seizuresUncontrolledFirstSymptomsAgeTextBox;

	//"SEIZURES UNCONTROLLED... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[4]/td[8]/input[1]")
	public WebElement seizuresUncontrolledDiagnosisDateTextBox;

	//"SEIZURES UNCONTROLLED... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[4]/td[9]/input[1]")
	public WebElement seizuresUncontrolledDiagnosisAgeTextBox;

	//IF PROCEDURE, A BRIEF DESCRIPTION OR NAME OF PROCEDURE TEXT BOX
	@FindBy(xpath = "//tbody/tr[4]/td[13]/input[1]")
	public WebElement seizuresUncontrolledMedicationTypeTextBox;

	//"OTHER... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[5]/td[3]/input[1]")
	public WebElement otherEpilepsyFirstSymptomsDateTextBox;

	//"OTHER... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[5]/td[4]/input[1]")
	public WebElement otherEpilepsyFirstSymptomsAgeTextBox;

	//"OTHER... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[5]/td[8]/input[1]")
	public WebElement otherEpilepsyDiagnosisDateTextBox;

	//"OTHER... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[5]/td[9]/input[1]")
	public WebElement otherEpilepsyDiagnosisAgeTextBox;

	//IF PROCEDURE, A BRIEF DESCRIPTION OR NAME OF PROCEDURE TEXT BOX
	@FindBy(xpath = "//tbody/tr[5]/td[13]/input[1]")
	public WebElement otherEpilepsyMedicationTypeTextBox;

	/*
	 * ----------------- END OF PLEASE COMPLETE THE TABLE BELOW FOR EACH OF THE CONDITIONS LISTED. FOR EACH CONDITION, PLEASE INCLUDE THE AGE OR DATE WHEN
	 * SYMPTOMS OCCURRED AND WHEN DIAGNOSED (YOU DO NOT NEED TO INCLUDE BOTH AGE AND DATE). IF YOU DO NOT RECALL, PLEASE PLACE AN 'X' IN THE 'DON'T KNOW' BOX. PAGE ----------------- 
	 */

	/*
	 * ----------------- BEGINNING OF HAVE YOU EVER BEEN EVALUATED BY A PSYCHIATRIST, PSYCHOLOGIST OR BEHAVIORAL PEDIATRICIAN? THESE MEDICAL
	 * PROVIDERS OFTEN DIAGNOSE CONDITIONS SUCH AS DEPRESSION, ANXIETY, LEARNING DIFFICULTIES, AND DEVELOPMENTAL DISORDERS. PAGE ----------------
	 * */

	//"NAME OF PHYSICIAN" TEXT BOX
	@FindBy(xpath = "(//input[@class='Medium InputText QR-QID396-1 QWatchTimer'])[1]")
	public WebElement nameOfPhysicianPsychologistTextBox;

	//"CITY, STATE" TEXT BOX
	@FindBy(xpath = "(//input[@class='Medium InputText QR-QID396-2 QWatchTimer'])[1]")
	public WebElement cityStatePsychologistTextBox;

	//"HOSPITAL OR MEDICAL CENTER AFFILIATION" TEXT BOX
	@FindBy(xpath = "(//input[@class='Medium InputText QR-QID396-3 QWatchTimer'])[1]")
	public WebElement hospitalOrMedicalCenterAffiliationPsychologistTextBox;

	/*
	 * ----------------- END OF HAVE YOU EVER BEEN EVALUATED BY A PSYCHIATRIST, PSYCHOLOGIST OR BEHAVIORAL PEDIATRICIAN? THESE MEDICAL PROVIDERS OFTEN
	 * DIAGNOSE CONDITIONS SUCH AS DEPRESSION, ANXIETY, LEARNING DIFFICULTIES, AND DEVELOPMENTAL DISORDERS.  PAGE -----------------
	 */

	/*
	 * ----------------- BEGINNING OF PLEASE COMPLETE THE TABLE BELOW FOR EACH OF THE DIAGNOSED BEHAVIORAL AND/OR PSYCHIATRIC CONDITIONS LISTED. FOR EACH
	 * CONDITION, PLEASE LIST THE DATE OR AGE OF SYMPTOM ONSET AND DIAGNOSIS (YOU DO NOT NEED TO INCLUDE BOTH AGE AND DATE). IF YOU DO NOT RECALL, PLEASE PLACE AN
	 * 'X' IN THE 'DON'T KNOW' BOX. IF NO TREATMENT WAS REQUIRED, PLACE 'NONE' IN THE 'TREATMENT' COLUMN. PAGE ----------------- 
	 */

	//"AUTISM... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[1]/td[3]/input[1]")
	public WebElement autismFirstSymptomsDateTextBox;

	//"AUTISM... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[1]/td[4]/input[1]")
	public WebElement autismFirstSymptomsAgeTextBox;

	//"AUTISM... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[1]/td[8]/input[1]")
	public WebElement autismDiagnosisDateTextBox;

	//"AUTISM... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[1]/td[9]/input[1]")
	public WebElement autismDiagnosisAgeTextBox;

	//IF PROCEDURE, A BRIEF DESCRIPTION OR NAME OF PROCEDURE TEXT BOX
	@FindBy(xpath = "//tbody/tr[1]/td[13]/input[1]")
	public WebElement autismTreatmentTextBox;

	//"SCHIZOPHRENIA... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[2]/td[3]/input[1]")
	public WebElement schizophreniaFirstSymptomsDateTextBox;

	//"SCHIZOPHRENIA... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[2]/td[4]/input[1]")
	public WebElement schizophreniaFirstSymptomsAgeTextBox;

	//"SCHIZOPHRENIA... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[2]/td[8]/input[1]")
	public WebElement schizophreniaDiagnosisDateTextBox;

	//"SCHIZOPHRENIA... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[2]/td[9]/input[1]")
	public WebElement schizophreniaDiagnosisAgeTextBox;
	
	//IF PROCEDURE, A BRIEF DESCRIPTION OR NAME OF PROCEDURE TEXT BOX
	@FindBy(xpath = "//tbody/tr[2]/td[13]/input[1]")
	public WebElement schizophreniaTreatmentTextBox;

	//"BIPOLAR... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[3]/td[3]/input[1]")
	public WebElement bipolarFirstSymptomsDateTextBox;

	//"BIPOLAR... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[3]/td[4]/input[1]")
	public WebElement bipolarFirstSymptomsAgeTextBox;

	//"BIPOLAR... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[3]/td[8]/input[1]")
	public WebElement bipolarDiagnosisDateTextBox;

	//"BIPOLAR... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[3]/td[9]/input[1]")
	public WebElement bipolarDiagnosisAgeTextBox;

	//IF PROCEDURE, A BRIEF DESCRIPTION OR NAME OF PROCEDURE TEXT BOX
	@FindBy(xpath = "//tbody/tr[3]/td[13]/input[1]")
	public WebElement bipolarTreatmentTextBox;

	//"ANXIETY... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[4]/td[3]/input[1]")
	public WebElement anxietyFirstSymptomsDateTextBox;

	//"ANXIETY... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[4]/td[4]/input[1]")
	public WebElement anxietyFirstSymptomsAgeTextBox;

	//"ANXIETY...DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[4]/td[8]/input[1]")
	public WebElement anxietyDiagnosisDateTextBox;

	//"ANXIETY... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[4]/td[9]/input[1]")
	public WebElement anxietyDiagnosisAgeTextBox;

	//IF PROCEDURE, A BRIEF DESCRIPTION OR NAME OF PROCEDURE TEXT BOX
	@FindBy(xpath = "//tbody/tr[4]/td[13]/input[1]")
	public WebElement anxietyTreatmentTextBox;

	//"MOOD PROBLEMS... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[5]/td[3]/input[1]")
	public WebElement moodProblemsFirstSymptomsDateTextBox;

	//"MOOD PROBLEMS... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[5]/td[4]/input[1]")
	public WebElement moodProblemsFirstSymptomsAgeTextBox;

	//"MOOD PROBLEMS... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[5]/td[8]/input[1]")
	public WebElement moodProblemsDiagnosisDateTextBox;

	//"MOOD PROBLEMS...AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[5]/td[9]/input[1]")
	public WebElement moodProblemsDiagnosisAgeTextBox;

	//IF PROCEDURE, A BRIEF DESCRIPTION OR NAME OF PROCEDURE TEXT BOX
	@FindBy(xpath = "//tbody/tr[5]/td[13]/input[1]")
	public WebElement moodProblemsTreatmentTextBox;

	//"OBSESSIONS OR COMPULSIONS... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[6]/td[3]/input[1]")
	public WebElement obsessionsFirstSymptomsDateTextBox;

	//"OBSESSIONS OR COMPULSIONS... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[6]/td[4]/input[1]")
	public WebElement obsessionsFirstSymptomsAgeTextBox;

	//"OBSESSIONS OR COMPULSIONS... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[6]/td[8]/input[1]")
	public WebElement obsessionsDiagnosisDateTextBox;

	//"OBSESSIONS OR COMPULSIONS...AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[6]/td[9]/input[1]")
	public WebElement obsessionsDiagnosisAgeTextBox;

	//IF PROCEDURE, A BRIEF DESCRIPTION OR NAME OF PROCEDURE TEXT BOX
	@FindBy(xpath = "//tbody/tr[6]/td[13]/input[1]")
	public WebElement obsessionsTreatmentTextBox;

	//"PTSD.. DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[7]/td[3]/input[1]")
	public WebElement ptsdFirstSymptomsDateTextBox;

	//"PTSD.. AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[7]/td[4]/input[1]")
	public WebElement ptsdFirstSymptomsAgeTextBox;

	//"PTSD.. DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[7]/td[8]/input[1]")
	public WebElement ptsdDiagnosisDateTextBox;

	//"PTSD.. AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[7]/td[9]/input[1]")
	public WebElement ptsdDiagnosisAgeTextBox;

	//IF PROCEDURE, A BRIEF DESCRIPTION OR NAME OF PROCEDURE TEXT BOX
	@FindBy(xpath = "//tbody/tr[7]/td[13]/input[1]")
	public WebElement ptsdTreatmentTextBox;

	//"SELF HARM... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[8]/td[3]/input[1]")
	public WebElement selfHarmFirstSymptomsDateTextBox;

	//"SELF HARM... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[8]/td[4]/input[1]")
	public WebElement selfHarmFirstSymptomsAgeTextBox;

	//"SELF HARM... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[8]/td[8]/input[1]")
	public WebElement selfHarmDiagnosisDateTextBox;

	//"SELF HARM... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[8]/td[9]/input[1]")
	public WebElement selfHarmDiagnosisAgeTextBox;

	//IF PROCEDURE, A BRIEF DESCRIPTION OR NAME OF PROCEDURE TEXT BOX
	@FindBy(xpath = "//tbody/tr[8]/td[13]/input[1]")
	public WebElement selfHarmTreatmentTextBox;

	//"AGRESSION... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[9]/td[3]/input[1]")
	public WebElement agressionFirstSymptomsDateTextBox;

	//"AGRESSION... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[9]/td[4]/input[1]")
	public WebElement agressionFirstSymptomsAgeTextBox;

	//"AGRESSION... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[9]/td[8]/input[1]")
	public WebElement agressionDiagnosisDateTextBox;

	//"AGRESSION... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[9]/td[9]/input[1]")
	public WebElement agressionDiagnosisAgeTextBox;

	//IF PROCEDURE, A BRIEF DESCRIPTION OR NAME OF PROCEDURE TEXT BOX
	@FindBy(xpath = "//tbody/tr[9]/td[13]/input[1]")
	public WebElement agressionTreatmentTextBox;

	//"OTHER... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[10]/td[3]/input[1]")
	public WebElement otherBehavioralFirstSymptomsDateTextBox;

	//"OTHER... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[10]/td[4]/input[1]")
	public WebElement otherBehavioralFirstSymptomsAgeTextBox;

	//"OTHER... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[10]/td[8]/input[1]")
	public WebElement otherBehavioralDiagnosisDateTextBox;

	//"OTHER... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[10]/td[9]/input[1]")
	public WebElement otherBehavioralDiagnosisAgeTextBox;

	//IF PROCEDURE, A BRIEF DESCRIPTION OR NAME OF PROCEDURE TEXT BOX
	@FindBy(xpath = "//tbody/tr[10]/td[13]/input[1]")
	public WebElement otherBehavioralTreatmentTextBox;

	/*
	 * ----------------- BEGINNING OF PLEASE COMPLETE THE TABLE BELOW FOR EACH OF THE DIAGNOSED BEHAVIORAL AND/OR PSYCHIATRIC CONDITIONS LISTED. FOR EACH CONDITION, PLEASE LIST THE DATE OR AGE OF SYMPTOM ONSET AND DIAGNOSIS (YOU DO
	 * NOT NEED TO INCLUDE BOTH AGE AND DATE). IF YOU DO NOT RECALL, PLEASE PLACE AN 'X' IN THE 'DON'T KNOW' BOX. IF NO TREATMENT WAS REQUIRED, PLACE 'NONE' IN
	 * THE 'TREATMENT' COLUMN. PAGE ----------------- 
	  */

	/*
	 * ----------------- BEGINING OF PLEASE LIST AND DESCRIBE ANY ADDITIONAL NEUROLOGIC CONDITIONS HERE THAT WERE NOT COVERED BY THE PREVIOUS QUESTIONS. PAGE  ----------------- 
	 */
	
	//"ADDITIONAL NEUROLOGIC CONDITIONS" TEXT BOX
	@FindBy(xpath = "//input[@type='TEXT']")
	public WebElement additionalNeurologicConditionsTextBox;

	/*
	 * ----------------- END OF PLEASE LIST AND DESCRIBE ANY ADDITIONAL NEUROLOGIC
	 * CONDITIONS HERE THAT WERE NOT COVERED BY THE PREVIOUS QUESTIONS. PAGE -----------------*/

	/*
	 * ----------------- BEGINING OF PLEASE COMPLETE THE TABLE BELOW FOR EACH OF THE
	 * CONDITIONS LISTED. FOR EACH CONDITION, PLEASE LIST THE AGE OR DATE WHEN
	 * SYMPTOMS FIRST STARTED AND WHEN THE DIAGNOSIS WAS MADE (YOU DO NOT NEED TO
	 * INCLUDE BOTH DATE AND AGE). IF YOU DO NOT RECALL, PLACE AN 'X' IN THE 'DON'T
	 * KNOW' COLUMN. IF NO TREATMENT WAS REQUIRED, PLACE 'NONE' IN THE 'TREATMENT'
	 * COLUMN. PAGE -----------------*/

	//"NEUROLOGICAL VISUAL IMPAIRMENT (INCLUDES CORTICAL... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[1]/td[3]/input[1]")
	public WebElement neurologicalVisualFirstSymptomsDateTextBox;

	//"NEUROLOGICAL VISUAL IMPAIRMENT (INCLUDES CORTICAL... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[1]/td[4]/input[1]")
	public WebElement neurologicalVisualFirstSymptomsAgeTextBox;

	//"NEUROLOGICAL VISUAL IMPAIRMENT (INCLUDES CORTICAL... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[1]/td[8]/input[1]")
	public WebElement neurologicalVisualDiagnosisDateTextBox;

	//"NEUROLOGICAL VISUAL IMPAIRMENT (INCLUDES CORTICAL... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[1]/td[9]/input[1]")
	public WebElement neurologicalVisualDiagnosisAgeTextBox;

	//STEPS TO SEND TEXT TO "TREATMENT..." TEXT BOX
	@FindBy(xpath = "//tbody/tr[1]/td[13]/input[1]")
	public WebElement neurologicalVisualTreatmentTextBox;

	//"NEARSIGHTEDNESS... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[2]/td[3]/input[1]")
	public WebElement nearsightednessFirstSymptomsDateTextBox;

	//"NEARSIGHTEDNESS... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[2]/td[4]/input[1]")
	public WebElement nearsightednessFirstSymptomsAgeTextBox;

	//"NEARSIGHTEDNESS... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[2]/td[8]/input[1]")
	public WebElement nearsightednessDiagnosisDateTextBox;

	//"NEARSIGHTEDNESS... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[2]/td[9]/input[1]")
	public WebElement nearsightednessDiagnosisAgeTextBox;

	//STEPS TO SEND TEXT TO "TREATMENT..." TEXT BOX
	@FindBy(xpath = "//tbody/tr[2]/td[13]/input[1]")
	public WebElement nearsightednessTreatmentTextBox;

	//"FARSIGHTEDNESS... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[3]/td[3]/input[1]")
	public WebElement farsightednessFirstSymptomsDateTextBox;

	//"FARSIGHTEDNESS... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[3]/td[4]/input[1]")
	public WebElement farsightednessFirstSymptomsAgeTextBox;

	//"FARSIGHTEDNESS... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[3]/td[8]/input[1]")
	public WebElement farsightednessDiagnosisDateTextBox;

	//"FARSIGHTEDNESS... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[3]/td[9]/input[1]")
	public WebElement farsightednessDiagnosisAgeTextBox;

	//STEPS TO SEND TEXT TO "TREATMENT..." TEXT BOX
	@FindBy(xpath = "//tbody/tr[3]/td[13]/input[1]")
	public WebElement farsightednessTreatmentTextBox;

	//"ASTIGMATISM.... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[4]/td[3]/input[1]")
	public WebElement astigmatismFirstSymptomsDateTextBox;

	//"ASTIGMATISM... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[4]/td[4]/input[1]")
	public WebElement astigmatismFirstSymptomsAgeTextBox;

	//"ASTIGMATISM... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[4]/td[8]/input[1]")
	public WebElement astigmatismDiagnosisDateTextBox;

	//"ASTIGMATISM... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[4]/td[9]/input[1]")
	public WebElement astigmatismDiagnosisAgeTextBox;

	//STEPS TO SEND TEXT TO "TREATMENT..." TEXT BOX
	@FindBy(xpath = "//tbody/tr[4]/td[13]/input[1]")
	public WebElement astigmatismTreatmentTextBox;

	//"AMBLYOPIA.... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[5]/td[3]/input[1]")
	public WebElement amblyopiaFirstSymptomsDateTextBox;

	//"AMBLYOPIA.... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[5]/td[4]/input[1]")
	public WebElement amblyopiaFirstSymptomsAgeTextBox;

	//"AMBLYOPIA.... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[5]/td[8]/input[1]")
	public WebElement amblyopiaDiagnosisDateTextBox;

	//"AMBLYOPIA.... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[5]/td[9]/input[1]")
	public WebElement amblyopiaDiagnosisAgeTextBox;

	//STEPS TO SEND TEXT TO "TREATMENT..." TEXT BOX
	@FindBy(xpath = "//tbody/tr[5]/td[13]/input[1]")
	public WebElement amblyopiaTreatmentTextBox;

	//"OTHER... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[6]/td[3]/input[1]")
	public WebElement otherEyeSightFirstSymptomsDateTextBox;

	//"OTHER... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[6]/td[4]/input[1]")
	public WebElement otherEyeSightFirstSymptomsAgeTextBox;

	//"OTHER... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "//tbody/tr[6]/td[8]/input[1]")
	public WebElement otherEyeSightDiagnosisDateTextBox;

	//"OTHER... AGE" TEXT BOX
	@FindBy(xpath = "//tbody/tr[6]/td[9]/input[1]")
	public WebElement otherEyeSightDiagnosisAgeTextBox;
	
	//IF PROCEDURE, A BRIEF DESCRIPTION OR NAME OF PROCEDURE TEXT BOX
	@FindBy(xpath = "//tbody/tr[6]/td[13]/input[1]")
	public WebElement otherEyeSightMedicationTypeTextBox;

	//PLEASE PROVIDE ADDRESS OF HOSPITAL OR OFFICE (NAME CITY, STATE/PROVINCE, COUNTRY) TEXT BOX
	@FindBy(xpath = "//tbody/tr[6]/td[16]/input[1]")
	public WebElement otherEyeSightAddressTextBox;

	/*
	 * ----------------- END OF PLEASE COMPLETE THE TABLE BELOW FOR EACH OF THE CONDITIONS LISTED. FOR EACH CONDITION, PLEASE LIST THE AGE OR DATE WHEN
	 * SYMPTOMS FIRST STARTED AND WHEN THE DIAGNOSIS WAS MADE (YOU DO NOT NEED TO INCLUDE BOTH DATE AND AGE). IF YOU DO NOT RECALL, PLACE AN 'X' IN THE 'DON'T
	 * KNOW' COLUMN. IF NO TREATMENT WAS REQUIRED, PLACE 'NONE' IN THE 'TREATMENT' COLUMN. PAGE ----------------- 
	 */

	/*
	 * ----------------- BEGINING OF PLEASE COMPLETE THE TABLE BELOW REGARDING STRABISMUS. PLEASE LIST THE AGE OR DATE WHEN SYMPTOMS FIRST STARTED AND WHEN
	 * THE DIAGNOSIS WAS MADE (YOU DO NOT NEED TO INCLUDE BOTH DATE AND AGE). IF YOU DO NOT RECALL, PLACE AN 'X' IN THE 'DON'T KNOW' COLUMN. IF NO TREATMENT WAS
	 * REQUIRED, PLACE 'NONE' IN THE 'TREATMENT' COLUMN. PAGE  ----------------- 
	 */

	//"PLEASE PROVIDE DETAILS OF ... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "(//input[@type='text'])[1]")
	public WebElement strabismusFirstSymptomsDateTextBox;

	//"PLEASE PROVIDE DETAILS OF ... AGE" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[2]")
	public WebElement strabismusFirstSymptomsAgeTextBox;

	//"PLEASE PROVIDE DETAILS OF ... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[4]")
	public WebElement strabismusDiagnosisDateTextBox;

	//"PLEASE PROVIDE DETAILS OF ... AGE" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[5]")
	public WebElement strabismusDiagnosisAgeTextBox;


	//"OCCLUSION" TEXT BOX
	@FindBy(xpath = "(//label[contains(@for,'QR~QID255#3~1~1')])[1]")
	public WebElement occlusionTreatmentTextBox;

	//"SURGERY" TEXT BOX
	@FindBy(xpath = "(//label[@for='QR~QID255#3~1~2'])[1]")
	public WebElement surgeryTreatmentTextBox;

	//"OTHER" TEXT BOX
	@FindBy(xpath = "(//label[@for='QR~QID255#3~1~3'])[1]")
	public WebElement otherTreatmentTextBox;

	//"NO TREATMENT NEEDED" TEXT BOX
	@FindBy(xpath = "(//label[@for='QR~QID255#3~1~4'])[1]")
	public WebElement noTreatmentNeededTextBox;

	/*
	 * ----------------- END OF PLEASE COMPLETE THE TABLE BELOW REGARDING STRABISMUS. PLEASE LIST THE AGE OR DATE WHEN SYMPTOMS FIRST STARTED AND WHEN THE DIAGNOSIS WAS MADE (YOU DO NOT NEED TO INCLUDE BOTH DATE AND AGE). IF YOU
	 * DO NOT RECALL, PLACE AN 'X' IN THE 'DON'T KNOW' COLUMN. IF NO TREATMENT WAS REQUIRED, PLACE 'NONE' IN THE 'TREATMENT' COLUMN. PAGE ----------------- 
	 */

	/*
	 * ----------------- BEGINING OF PLEASE COMPLETE THE TABLE BELOW REGARDING
	 * NYSTAGMUS. PLEASE INCLUDE THE AGE OR DATE WHEN SYMPTOMS FIRST OCCURRED AND WHEN THE DIAGNOSIS WAS MADE (YOU DO NOT NEED TO INCLUDE BOTH AGE AND DATE). PAGE ----------------- 
	 */

	//"PLEASE PROVIDE DETAILS OF ... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "(//input[@type='text'])[1]")
	public WebElement nystagmusFirstSymptomsDateTextBox;

	//"PLEASE PROVIDE DETAILS OF ... AGE" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[2]")
	public WebElement nystagmusFirstSymptomsAgeTextBox;

	//"PLEASE PROVIDE DETAILS OF ... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[4]")
	public WebElement nystagmusDiagnosisDateTextBox;

	//"PLEASE PROVIDE DETAILS OF ... AGE" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[5]")
	public WebElement nystagmusDiagnosisAgeTextBox;

	//"PLEASE PROVIDE DETAILS OF....UNSURE/UKNOWN" TEXT BOX
	@FindBy(xpath = "(//input[contains(@type,'text')])[6]")
	public WebElement nystagmusUnsureDiagnosisTextBox;


	//NYSTAGMUS TREATMENT "YES" RADIO BUTTON
	@FindBy(xpath = "(//label[contains(@for,'QR~QID257#3~1~1')])[1]")
	public WebElement yesNystagmusTreatmentRadioButton;

	//NYSTAGMUS TREATMENT "NO" RADIO BUTTON
	@FindBy(xpath = "(//label[@for='QR~QID257#3~1~2'])[1]")
	public WebElement nonystagmusTreatmentRadioButton;

	//NYSTAGMUS "MILD (SHORT-TERM)" RADIO BUTTON
	@FindBy(xpath = "(//label[@for='QR~QID257#4~1~1'])[1]")
	public WebElement mildNystagmusRadioButton;

	//"ONGOING/SEVERE NYSTAGMUS AFFECTING VISION OR BALANCE" RADIO BUTTON
	@FindBy(xpath = "(//label[@for='QR~QID257#4~1~2'])[1]")
	public WebElement ongoingSevereNystagmusRadioButton;

	/*
	 * ----------------- END OF PLEASE COMPLETE THE TABLE BELOW REGARDING NYSTAGMUS. PLEASE INCLUDE THE AGE OR DATE WHEN SYMPTOMS FIRST OCCURRED AND WHEN THE
	 * DIAGNOSIS WAS MADE (YOU DO NOT NEED TO INCLUDE BOTH AGE AND DATE). PAGE -----------------
	 */

	/*
	 * ----------------- BEGINNING OF PLEASE COMPLETE THE TABLE BELOW FOR EACH OF THE CONDITIONS LISTED. FOR EACH CONDITION, PLEASE LIST THE AGE OR DATE WHEN
	 * SYMPTOMS FIRST OCCURRED AND WHEN THE DIAGNOSIS WAS MADE (YOU DO NOT NEED TO INCLUDE BOTH AGE AND DATE). IF YOU DO NOT RECALL THE DETAILS, PLACE AN 'X' IN
	 * THE 'DON'T KNOW' COLUMN. PAGE -----------------
	 */

	//"SENSORINEURAL HEARING LOSS... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "(//input[@type='text'])[1]")
	public WebElement sensorineuralFirstSymptomsDateTextBox;

	//"SENSORINEURAL HEARING LOSS... AGE" TEXT BOX
	@FindBy(xpath = "(//input[@type='text'])[2]")
	public WebElement sensorineuralFirstSymptomsAgeTextBox;

	//"SENSORINEURAL HEARING LOSS... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "(//input[@type='text'])[4]")
	public WebElement sensorineuralDiagnosisDateTextBox;

	//"SENSORINEURAL HEARING LOSS... AGE" TEXT BOX
	@FindBy(xpath = "(//input[@type='text'])[5]")
	public WebElement sensorineuralDiagnosisAgeTextBox;
	
	//SENSORINEURAL "YES" RADIO BUTTON
	@FindBy(xpath = "(//label[contains(@for,'QR~QID258#3~x1~1')])[1]")
	public WebElement yesSensorineuralTreatmentRadioButton;

	//SENSORINEURAL "NO" RADIO BUTTON
	@FindBy(xpath = "(//label[@for='QR~QID258#3~x1~2'])[1]")
	public WebElement noSensorineuralTreatmentRadioButton;

	//"CONDUCTIVE HEARING LOSS... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "(//input[@type='text'])[7]")
	public WebElement conductiveFirstSymptomsDateTextBox;

	//"CONDUCTIVE HEARING LOSS... AGE" TEXT BOX
	@FindBy(xpath = "(//input[@type='text'])[8]")
	public WebElement conductiveFirstSymptomsAgeTextBox;
	
	//"CONDUCTIVE HEARING LOSS... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "(//input[@type='text'])[10]")
	public WebElement conductiveDiagnosisDateTextBox;

	//"CONDUCTIVE HEARING LOSS... AGE" TEXT BOX
	@FindBy(xpath = "(//input[@type='text'])[11]")
	public WebElement conductiveDiagnosisAgeTextBox;

	//CONDUCTIVE HEARING TREATMENT "YES" RADIO BUTTON
	@FindBy(xpath = "(//label[contains(@for,'QR~QID258#3~x2~1')])[1]")
	public WebElement yesConductiveTreatmentRadioButton;

	//CONDUCTIVE HEARING TREATMENT "NO" RADIO BUTTON
	@FindBy(xpath = "(//label[@for='QR~QID258#3~x2~2'])[1]")
	public WebElement noConductiveTreatmentRadioButton;

	//"MIXED HEARING LOSS... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "(//input[@type='text'])[13]")
	public WebElement mixedFirstSymptomsDateTextBox;

	//"MIXED HEARING LOSS... AGE" TEXT BOX
	@FindBy(xpath = "(//input[@type='text'])[14]")
	public WebElement mixedFirstSymptomsAgeTextBox;

	//"MIXED HEARING LOSS... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "(//input[@type='text'])[16]")
	public WebElement mixedDiagnosisDateTextBox;

	//"MIXED HEARING LOSS... AGE" TEXT BOX
	@FindBy(xpath = "(//input[@type='text'])[17]")
	public WebElement mixedDiagnosisAgeTextBox;

	//MIXED HEARING TREATMENT "YES" RADIO BUTTON
	@FindBy(xpath = "(//label[contains(@for,'QR~QID258#3~x3~1')])[1]")
	public WebElement yesMixedTreatmentRadioButton;

	//MIXED HEARING TREATMENT "NO" RADIO BUTTON
	@FindBy(xpath = "(//label[@for='QR~QID258#3~x3~2'])[1]")
	public WebElement noMixedTreatmentRadioButton;

	//"HEARING LOSS UNSURE OF TYPE... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "(//input[@type='text'])[19]")
	public WebElement unsureHearingLossFirstSymptomsDateTextBox;

	//"HEARING LOSS UNSURE OF TYPE... AGE" TEXT BOX
	@FindBy(xpath = "(//input[@type='text'])[20]")
	public WebElement unsureHearingLossFirstSymptomsAgeTextBox;

	//"HEARING LOSS UNSURE OF TYPE... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "(//input[@type='text'])[22]")
	public WebElement unsureHearingLossDiagnosisDateTextBox;

	//"HEARING LOSS UNSURE OF TYPE... AGE" TEXT BOX
	@FindBy(xpath = "(//input[@type='text'])[23]")
	public WebElement unsureHearingLossDiagnosisAgeTextBox;

	//HEARING LOSS UNSURE TREATMENT "YES" RADIO BUTTON
	@FindBy(xpath = "(//label[contains(@for,'QR~QID258#3~x4~1')])[1]")
	public WebElement yesUnsureHearingLossTreatmentRadioButton;

	//HEARING LOSS UNSURE TREATMENT "NO" RADIO BUTTON
	@FindBy(xpath = "(//label[@for='QR~QID258#3~x4~2'])[1]")
	public WebElement noUnsureHearingLossTreatmentRadioButton;

	//HEARING LOSS "OTHER" TEXT BOX
	@FindBy(xpath = "(//input[@type='text'])[25]")
	public WebElement otherHearingLossTextBox;

	//HEARING LOSS "OTHER... DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "(//input[@type='text'])[26]")
	public WebElement otherHearingLossFirstSymptomsDateTextBox;

	//HEARING LOSS "OTHER... AGE" TEXT BOX
	@FindBy(xpath = "(//input[@type='text'])[27]")
	public WebElement otherHearingLossFirstSymptomsAgeTextBox;

	//"OTHER HEARING LOSS...  DATE(MM/YY)" TEXT BOX
	@FindBy(xpath = "(//input[@type='text'])[29]")
	public WebElement otherHearingLossDiagnosisDateTextBox;

	//"OTHER HEARING LOSS DIAGNOSIS...  AGE" TEXT BOX
	@FindBy(xpath = "(//input[@type='text'])[30]")
	public WebElement otherHearingLossDiagnosisAgeTextBox;

	//OTHER TREATMENT "YES" RADIO BUTTON
	@FindBy(xpath = "(//label[@for='QR~QID258#3~x6~1'])[1]")
	public WebElement yesOtherTreatmentRadioButton;

	//OTHER TREATMENT "NO" RADIO BUTTON
	@FindBy(xpath = "(//label[@for='QR~QID258#3~x6~2'])[1]")
	public WebElement noOtherTreatmentRadioButton;

	/*
	 * ----------------- END OF PLEASE COMPLETE THE TABLE BELOW FOR EACH OF THE CONDITIONS LISTED. FOR EACH CONDITION, PLEASE LIST THE AGE OR DATE WHEN
	 * SYMPTOMS FIRST OCCURRED AND WHEN THE DIAGNOSIS WAS MADE (YOU DO NOT NEED TO INCLUDE BOTH AGE AND DATE). IF YOU DO NOT RECALL THE DETAILS, PLACE AN 'X' IN
	 * THE 'DON'T KNOW' COLUMN. PAGE ----------------- 
	 */

	/*
	 * ----------------- BEGINNING OF IF THERE ARE ANY OTHER HEALTH ISSUES PRESENT
	 * THAT HAVE NOT BEEN CAPTURED BY THIS SURVEY, PLEASE LIST THEM HERE: PAGE ----------------- 
	 */
	
	//"UNSURE/UNKNOWN" TEXT BOX
	@FindBy(xpath = "(//textarea)[1]")
	public WebElement anyOtherHealthIssuesTextBox;

	/*
	 * ----------------- END OF IF THERE ARE ANY OTHER HEALTH ISSUES PRESENT THAT
	 * HAVE NOT BEEN CAPTURED BY THIS SURVEY, PLEASE LIST THEM HERE: PAGE ----------------- */

	public RASSurveyPage(){	
		PageFactory.initElements(WebDriverUtils.webDriver, this);
		
	}
	/*
	 * --------------------------- BEGINNING OF TO CONFIRM ARE YOU COMPLETING THIS FORM FOR YOURSELF OR FOR SOMEONE ELSE--------------------------- 
	 */
	
	//I AM COMPLETING THIS FORM FOR SOMEONE ELSE RADIO BUTTON
		@FindBy (xpath= "//span[contains(text(),'I am completing this form for someone else')]")
		public WebElement completingFormForSomeoneElse;
	
		/*
		 * --------------------------- END OF TO CONFIRM ARE YOU COMPLETING THIS FORM FOR YOURSELF OR FOR SOMEONE ELSE--------------------------- 
		 */
		
		/*
		 * --------------------------- BEGINNING OF PLEASE CONFIRM THE NAME OF THE PERSON FOR WHOM YOU ARE COMPLETING THIS QUESTIONNAIRE.--------------------------- 
		 */
		
	// PLEASE CONFIRM THE NAME OF THE PERSON FOR WHOM YOU ARE COMPLETING THIS QUESTIONNAIRE. FIRSTNAME TEXT BOX 
		@FindBy (xpath= "//input[@id='QR~QID2~1']")
		public WebElement personFirstNameCompletingQuestionnaire;
		
		// PLEASE CONFIRM THE NAME OF THE PERSON FOR WHOM YOU ARE COMPLETING THIS QUESTIONNAIRE. MIDDLE INITIAL TEXT BOX 
		@FindBy (xpath= "//input[@id='QR~QID2~2']")
		public WebElement personMiddleInitialCompletingQuestionnaire;
		
		// PLEASE CONFIRM THE NAME OF THE PERSON FOR WHOM YOU ARE COMPLETING THIS QUESTIONNAIRE. LAST NAME TEXT BOX 
		@FindBy (xpath= "//input[@id='QR~QID2~3']")
		public WebElement personLastNameCompletingQuestionnaire;
		
		/*
		 * --------------------------- END OF PLEASE CONFIRM THE NAME OF THE PERSON FOR WHOM YOU ARE COMPLETING THIS QUESTIONNAIRE.--------------------------- 
		 */
		
		/*
		 * --------------------------- BEGINNING OF IS CHRISTINA STILL ALIVE?--------------------------- 
		 */
		// IS CHRISTINA STILL ALIVE "YES" RADIO BUTTON
		@FindBy (xpath= "//span[contains(text(),'Yes')]")
		public WebElement yesIsChristinaStillAlive;
		
		/*
		 * --------------------------- END OF IS CHRISTINA STILL ALIVE?--------------------------- 
		 */
		
		/*
		 * --------------------------- BEGINNING OF HAS CHRISTINA EVER BEEN INCLUDED IN A PUBLISHED CASE REPORT OR OTHERWISE REPRESENTED IN A PUBLIC MANNER BY A HEALTHCARE PROVIDER OR RESEARCHER --------------------------- 
		 */
		
		//HAS CHRISTINA EVER BEEN INCLUDED IN A PUBLISHED CASE REPORT OR OTHERWISE REPRESENTED IN A PUBLIC MANNER BY A HEALTHCARE PROVIDER OR RESEARCHER? "YES" RADIO BUTTON
		@FindBy (xpath="//span[contains(text(),'Yes')]")
		public WebElement yesChristinaHasBeenIncludedInAPublishedCase;
		
		/*
		 * --------------------------- END OF HAS CHRISTINA EVER BEEN INCLUDED IN A PUBLISHED CASE REPORT OR OTHERWISE REPRESENTED IN A PUBLIC MANNER BY A HEALTHCARE PROVIDER OR RESEARCHER --------------------------- 
		 */
		
		/*
		 *  ----------------- BEGINNING OF PLEASE COMPLETE THE TABLE BELOW REGARDING CHRISTINAS BIOLOGICAL PARENTS. PAGE ----------------- 
		 */
		// BIOLOGICAL MOTHER TEXTBOX
		@FindBy(xpath="//tr[@class='Choice ']//input[@type='text']")
		public WebElement biologicalMothersBirthCityTextBox;
		
		// BIOLOGICAL FATHER TEXTBOX
		@FindBy(xpath="//tr[@class='Choice ReadableAlt']//input[@type='text']")
		public WebElement biologicalFatherBirthCityTextBox;
		
		//MOTHER'S AGE WHEN BORN DROPDOWN
		@FindBy(xpath="(//select[@class='MatrixDL QWatchTimer'])[1]")
		public WebElement biologicalMothersAgeWhenBornDropDown;
		
		//FATHER'S AGE WHEN BORN DROPDOWN
		@FindBy (xpath="//tr[@class='Choice ReadableAlt']//select[@class='MatrixDL QWatchTimer']")
		public WebElement biologicalFathersAgeWhenBornDropDown;
		
		/*
		 *  ----------------- END OF PLEASE COMPLETE THE TABLE BELOW REGARDING CHRISTINAS BIOLOGICAL PARENTS. PAGE ----------------- 
		 */
		
		
		
		
		/*
		 * --------------------------- BEGINNING OF WAS CHRISTINA RAMIREZ DIAGNOSED WITH HYPOGLYCEMIA (LOW BLOOD SUGAR) DURING THE NEWBORN PERIOD?--------------------------- 
		 */
		
		//WAS CHRISTINA RAMIREZ DIAGNOSED WITH HYPOGLYCEMIA LOW BLOOD SUGAR DURING THE NEWBORN PERIOD? "YES" RADIO BUTTON
		@FindBy (xpath="//span[contains(text(),'Yes')]")
		public WebElement yesChristinaWasDiagnosedWithHypoglycemia;
		
		/*
		 * --------------------------- END OF WAS CHRISTINA RAMIREZ DIAGNOSED WITH HYPOGLYCEMIA (LOW BLOOD SUGAR) DURING THE NEWBORN PERIOD?--------------------------- 
		 */
		
		/*
		 * --------------------------- BEGINNING OF WAS CHRISTINA RAMIREZ DIAGNOSED WITH ANY OF THE FOLLOWING CONDITIONS DURING THEIR MOTHER'S PREGNANCY?--------------------------- 
		 */

		//EXTRA FLUID IN THE NECK AREA NUCHAL EDEMA RADIO BUTTON
		@FindBy (xpath= "//span[contains(text(),'Extra fluid in the neck area (nuchal edema)')]")
		public WebElement extraFluidInTheNeckArea;
		
		//EXTRA FLUID IN THE LUNG AREA PLEURAL EDEMA RADIO BUTTON
		@FindBy (xpath="//span[contains(text(),'Extra fluid in the lung area (pleural edema)')]")
		public WebElement extraFluidInTheLungArea;
		
		//EXTRA FLUID IN THE ABDOMEN ASCITES RADIO BUTTON
		@FindBy (xpath = "//span[contains(text(),'Extra fluid in the abdomen (ascites)')]")
		public WebElement extraFluidInTheAbdomenAscites;
		
		//EXTRA FLUID IN MORE THAN ONE BODY AREA HYDROPS RADIO BUTTON
		@FindBy (xpath = "//span[contains(text(),'Extra fluid in more than one body area (hydrops)')]")
		public WebElement extraFluidInMoreThanOneBodyAreaHydrops;
		
		//TOO MUCH FLUID IN THE AMNIOTIC SAC POLYHYDRAMNIOS RADIO BUTTON
		@FindBy (xpath= "//span[contains(text(),'Too much fluid in the amniotic sac (polyhydramnios')]")
		public WebElement tooMuchFluidInTheAmnioticSac;
		
		//HEART ISSUE RADIO BUTTON
		@FindBy (xpath="//span[contains(text(),'Heart issue')]")
		public WebElement heartIssue;
		
		//OTHER PLEASE SPECIFY TEXT BOX
		@FindBy(xpath = "(//input[@id='QR~QID38~7~TEXT'])[1]")
		public WebElement otherPleaseSpecifyOtherTextBox;
		
		/*
		 * --------------------------- END OF WAS CHRISTINA RAMIREZ DIAGNOSED WITH ANY OF THE FOLLOWING CONDITIONS DURING THEIR MOTHER'S PREGNANCY?--------------------------- 
		 */
		
		/*
		 * --------------------------- BEGINNING OF DURING HER PREGNANCY WITH CHRISTINA RAMIREZ DID THEIR MOTHER HAVE ANY PRENATAL TESTS TO IDENTIFY FETAL BIRTH DEFECTS OR FETAL MEDICAL PROBLEMS?--------------------------- 
		 */
		
		// DURING HER PREGNANCY WITH CHRISTINA RAMIREZ DID THEIR MOTHER HAVE ANY PRENATAL TESTS TO IDENTIFY FETAL BIRTH DEFECTS OR FETAL MEDICAL PROBLEMS? "YES" RADIO BUTTON
		 @FindBy (xpath = "(//span)[3]")
		 public WebElement yesChristinasMotherHadPrenatalTestToIdentifyBirthDefects;
		
		/*
		 * --------------------------- END OF DURING HER PREGNANCY WITH CHRISTINA RAMIREZ DID THEIR MOTHER HAVE ANY PRENATAL TESTS TO IDENTIFY FETAL BIRTH DEFECTS OR FETAL MEDICAL PROBLEMS?--------------------------- 
		 */
		 
		 /*
		 * --------------------------- BEGINNING OF PLEASE INDICATE THE RESULTS OF THE PRENATAL TESTS ADMINISTERED TO THE BIOLOGICAL MOTHER OF "NAME OF PARTICIPANT" DURING HER PREGNANCY WITH CHRISTINA RAMIREZ.--------------------------- 
		 */
		 	//SERUM AFP (ALPHA-FETOPROTEIN) NORMAL RADIO BUTTON
			@FindBy (xpath="//label[@for='QR~QID42#1~1~1']")
			public WebElement serumAFPProxyRadioButton;
			
			//ULTRASOUND NORMAL RADIO BUTTON
			@FindBy (xpath="//label[@for='QR~QID42#1~2~1']")
			public WebElement ultraSoundProxyRadioButton;
			
			//AMNIOCENTESIS NORMAL RADIO BUTTON
			@FindBy (xpath="//label[@for='QR~QID42#1~3~1']")
			public WebElement amniocentesisProxyRadioButton;
			
			//CHORIONIC VILLUS SAMPLING NORMAL RADIO BUTTON
			@FindBy (xpath="//label[@for='QR~QID42#1~4~1']")
			public WebElement chorionicVillusSamplingProxyRadioButton;
			
			//FETAL BLOOD SAMPLING NORMAL RADIO BUTTON
			@FindBy (xpath="//label[@for='QR~QID42#1~5~1']")
			public WebElement fetalBloodSamplingProxyRadioButton;
			
			//STRESS TEST NORMAL RADIO BUTTON
			@FindBy (xpath="//label[@for='QR~QID42#1~6~1']")
			public WebElement stressTestProxyRadioButton;
			
			//X-RAYS NORMAL RADIO BUTTON
			@FindBy (xpath="//label[@for='QR~QID42#1~7~1']")
			public WebElement xRayProxyRadioButton;
			
			//OTHER (PLEASE SPECIFY) NORMAL RADIO BUTTON
			@FindBy (xpath="//label[@for='QR~QID42#1~8~1']")
			public WebElement otherProxyRadioButton;
			
			//OTHER (PLEASE SPECIFY) TEXT BOX
			@FindBy (xpath="//input[@type='text']")
			public WebElement otherTestProxyTextBox;
			

			/*
			 * --------------------------- END OF PLEASE INDICATE THE RESULTS OF THE PRENATAL TESTS ADMINISTERED TO THE BIOLOGICAL MOTHER OF CHRISTINA RAMIREZ DURING HER PREGNANCY WITH CHRISTINA RAMIREZ.--------------------------- 
			 */
		 
			 /*
			 * --------------------------- BEGINNING OF DURING HER PREGNANCY WITH CHRISTINA RAMIREZ, DID THEIR BIOLOGICAL MOTHER TAKE ANY MEDICATIONS, VITAMINS OR SUPPLEMENTS FOR ANY REASON? --------------------------- 
			 */
				
			//OTHER MEDICATION (PLEASE SPECIFY)PROXY TEXT BOX
			@FindBy (xpath="//li[15]//span[1]//input[1]")
			public WebElement otherMedicationProxyTextBox;
			
			//OTHER MEDICATION (PLEASE SPECIFY) SECOND PROXY TEXT BOX
			@FindBy (xpath="//li[16]//span[1]//input[1]")
			public WebElement otherMedicationProxyTextBox2;
			 /*
			 * --------------------------- END OF DURING HER PREGNANCY WITH CHRISTINA RAMIREZ, DID THEIR BIOLOGICAL MOTHER TAKE ANY MEDICATIONS, VITAMINS OR SUPPLEMENTS FOR ANY REASON? --------------------------- 
			 */

			 /*
			 * --------------------------- BEGINNING OF PLEASE DESCRIBE CHRISTINAS BIOLOGICAL PARENTS OCCUPATIONS DURING THEIR MOTHERS PREGNANCY WITH CHRISTINA? PAGE --------------------------- 
			 */

			//TYPE BLOLOGICAL MOTHER TEXT BOX WEBELEMENT
			@FindBy (xpath="(//input[contains(@type,'text')])[1]")
			public WebElement biologicalMotherOccupationProxyTextBox;
				
			//TYPE BIOLOGICAL FATHER TEXT BOX WEBELEMENT
			@FindBy (xpath="(//input[contains(@type,'text')])[2]")
			public WebElement biologicalFatherOccupationProxyTextBox;
				
			/*
			 * --------------------------- END OF PLEASE DESCRIBE CHRISTINAS BIOLOGICAL PARENTS OCCUPATIONS DURING THEIR MOTHERS PREGNANCY WITH CHRISTINA? PAGE --------------------------- 
			 */

			 /*
			 * --------------------------- BEGINNING OF WHAT IS THE HEIGHT OF CHRISTINAS BIOLOGICAL MOTHER AND FATHER?  PAGE --------------------------- 
			 */
			//ADULT HEIGHT BIOLOGICAL MOTHER TEXT BOX 
			@FindBy (xpath="(//input[contains(@type,'text')])[1]")
			public WebElement biologicalMotherHeightProxyTextBox;
				
			//ADULT HEIGHT BIOLOGICAL FATHER TEXT BOX 
			@FindBy (xpath="(//input[contains(@type,'text')])[2]")
			public WebElement biologicalFatherHeightProxyTextBox;
			
			//UNIT OF MEASURE BLOLOGICAL MOTHER CENTIMETERS RADIO BUTTON 
			@FindBy (xpath="(//label[@for='QR~QID410#1~1~3'])[1]")
			public WebElement unitOfMeasureMotherProxyRadioButton;
				
			//UNIT OF MEASURE  BLOLOGICAL FATHER CENTIMETERS RADIO BUTTON 
			@FindBy (xpath="(//label[@for='QR~QID410#1~2~3'])[1]")
			public WebElement unitOfMeasureFatherProxyRadioButton;
				

			 /*
			 * --------------------------- END OF WHAT IS THE HEIGHT OF CHRISTINAS BIOLOGICAL MOTHER AND FATHER?  PAGE --------------------------- 
			 */

			/*
			 * --------------------------- BEGINNING OF WHAT IS THE NAME OF THE ENDOCRINOLOGIST WHO COMPLETED CHRISTINAS EXAMINATION?  PAGE --------------------------- 
			 */
			//TYPE OF DOCTOR/MEDICAL PROVIDER NAME TEXT BOX 
			@FindBy (xpath="(//input[@class='Medium InputText QR-QID412-1 QWatchTimer'])[1]")
			public WebElement doctorMedicalProviderNameProxyTextBox;
				
			//TYPE OF LOCATION (CITY,STATE,COUNTRY) TEXT BOX 
			@FindBy (xpath="(//input[@class='Medium InputText QR-QID412-2 QWatchTimer'])[1]")
			public WebElement locatioCityStateCountryProxyTextBox;
				
			//TYPE OF HOSPITAL OR HEALTH SYSTEM AFFILIATION TEXT BOX 
			@FindBy (xpath="(//input[@class='Medium InputText QR-QID412-3 QWatchTimer'])[1]")
			public WebElement hospitalOrHealthSystemAffiliationProxyTextBox;
			
				
			/*
			 * --------------------------- END OF WHAT IS THE NAME OF THE ENDOCRINOLOGIST WHO COMPLETED CHRISTINAS EXAMINATION?  PAGE --------------------------- 
			 */
			
			/*
			 * --------------- BEGINNING OF AT WHAT AGE WAS CHRISTINA ABLE TO SIT WITHOUT SUPPORT? PAGE ---------------
			 */
				
			//TYPE OF AT WHAT AGE WAS CHRISTINA ABLE TO SIT WITHOUT SUPPORT? 12-18 MONTHS RADIO BUTTON 
			@FindBy (xpath= "(//span[contains(text(),'12-18 months')])[1]")
			public WebElement atWhatAgeWereYouAbleToSitWithoutSupportProxyCheckRadioButton;
			
			/*
			 * --------------- END OF AT WHAT AGE WAS CHRISTINA ABLE TO SIT WITHOUT SUPPORT? PAGE ---------------
			 */
			
			/*
			 * --------------- BEGINNING OF AT WHAT AGE WAS CHRISTINA ABLE TO WALK WITHOUT SUPPORT?  PAGE ---------------
			 */
				
			//TYPE OF AT WHAT AGE WAS CHRISTINA ABLE TO WALK WITHOUT SUPPORT? 12 -18 MONTHS RADIO BUTTON 
			@FindBy (xpath="//span[contains(text(),'12-18 months')]")
			public WebElement atWhatAgeWereYouAbleToWalkWithoutSupportProxyCheckRadioButton;
			
			/*
			 * --------------- END OF AT WHAT AGE WAS CHRISTINA ABLE TO WALK WITHOUT SUPPORT?  PAGE ---------------
			 */
			
			/*
			 * ----------------- BEGINNING OF AT WHAT AGE WAS CHRISTINA ABLE TO USE SIMPLE TWO-WORD PHRASES? PAGE -----------------
			 */

			// "36-48 MONTHS" RADIO BUTTON
			@FindBy(xpath = "(//span[contains(text(),'24-36 months')])[1]")
			public WebElement twentyFourToThirthySixMonthsProxyRadioButton;
			
			/*
			 * ----------------- END OF AT WHAT AGE WAS CHRISTINA ABLE TO USE SIMPLE TWO-WORD PHRASES? PAGE -----------------
			 */

			/*
			 *  ----------------- BEGINNING OF BETWEEN THE AGES OF 10 AND 17 (MIDDLE AND HIGH SCHOOL AGE) PLEASE SELECT THE OPTION THAT BEST DESCRIBES CHRISTINA'S SCHOOLING.   PAGE -----------------
			 */
			
			// “ATTENDED TYPICAL CLASSROOM WITHOUT SUPPORT OR LITTLE SUPPORT" RADIO BUTTON
			@FindBy(xpath = "//body/div/div/form[contains(@name,'Page')]/div/div/div/div/div[contains(@role,'main')]/div/div/div/fieldset/div/ul/li[1]/span[1]")
			public WebElement attendedTypicalclassroomOrlittleSupportProxyRadioButton;
			
			/*
			 *  ----------------- END OF BETWEEN THE AGES OF 10 AND 17 (MIDDLE AND HIGH SCHOOL AGE) PLEASE SELECT THE OPTION THAT BEST DESCRIBES CHRISTINA'S SCHOOLING.   PAGE -----------------
			 */
			
			/*
			 * ----------------- BEGINNING OF WHAT IS THE NAME OF THE CARDIOLOGIST WHO COMPLETED CHRISTINAS HEART EVALUATION? PAGE -----------------
			 */

			// "NAME OF DOCTOR/MEDICAL PROVIDER" TEXT BOX
			@FindBy(xpath = "(//input[@type='text'])[1]")
			public WebElement nameOfDoctorOrMedicalProviderProxyTextBox;

			// STEPS TO SENT TEXT TO "LOCATION (CITY, STATE, COUNTRY)" TEXT BOX
			@FindBy(xpath = "(//input[contains(@type,'text')])[2]")
			public WebElement locationCityStateCountryProxyTextBox;

			// STEPS TO SENT TEXT TO "HOSPITAL OR HEALTH CENTER AFFILIATION" TEXT BOX
			@FindBy(xpath = "(//input[contains(@type,'text')])[3]")
			public WebElement hospitalOrHealthCenterAffiliationProxyTextBox;
			
			/*
			 * ----------------- END OF WHAT IS THE NAME OF THE CARDIOLOGIST WHO COMPLETED CHRISTINAS HEART EVALUATION? PAGE -----------------
			 */
			
			/*
			 * ----------------- BEGINNING OF PLEASE COMPLETE THE TABLE BELOW BY PROVIDING INFORMATION FOR THE FIRST TREATMENT AND THE MOST RECENT TREATMENT.  YOU ONLY NEED TO PROVIDE THE AGE AT WHICH SYMPTOMS
			 *  OCCURRED OR DATE NOT BOTH. IF YOU DO NOT RECALL THE DETAILS, PLEASE PLACE AN X IN THE DONT KNOW BOX.   PAGE -----------------
			 */

			// -------------MEDICATION (PLEASE SPECIFY) SECTION-------------
			
			// “MEDICATION FIRST TREATMENT AGE" TEXT BOX
			@FindBy(xpath = "//tbody/tr[1]/td[3]/input[1]")
			public WebElement medicationFirstTreatmentAgeProxyTextBox;

			// “MEDICATION FIRST TREATMENT DATE(MM/YY)" TEXT BOX
			@FindBy(xpath = "//tbody/tr[1]/td[4]/input[1]")
			public WebElement medicationFirstTreatmentDateProxyTextBox;

			// “MEDICATION FIRST TREATMENT DON'T KNOW" TEXT BOX
			@FindBy(xpath = "(//input[@type='text'])[3]")
			public WebElement medicationFirstTreatmentDontKnowProxyTextBox;

			// “MEDICATION FIRST TREATMENT LOCATION HOSPITAL CITY STATE COUNTRY" TEXT BOX
			@FindBy(xpath = "//tbody/tr[1]/td[8]/input[1]")
			public WebElement medicationFirstTreatmentLocationProxyTextBox;

			// “MEDICATION MOST RECENT TREATMENT AGE" TEXT BOX
			@FindBy(xpath = "//tbody/tr[1]/td[11]/input[1]")
			public WebElement medicationMostRecentTreatmentAgeProxyTextBox;

			// “MEDICATION MOST RECENT TREATMENT DATE(MM/YY)" TEXT BOX
			@FindBy(xpath = "//tbody/tr[1]/td[12]/input[1]")
			public WebElement medicationMostRecentTreatmentDateProxyTextBox;

			// “MEDICATION MOST RECENT TREATMENT DON'T KNOW" TEXT BOX
			@FindBy(xpath = "//tbody/tr[1]/td[13]/input[1]")
			public WebElement medicationMostRecentTreatmentDontKnowProxyTextBox;

			// “MEDICATION MOST RECENT TREATMENT LOCATION HOSPITAL CITY STATE COUNTRY" TEXT BOX
			@FindBy(xpath = "//tbody/tr[1]/td[16]/input[1]")
			public WebElement medicationMostRecentTreatmentLocationProxyTextBox;

			// -------------CATHETER INTERVENTION SECTION-------------

			// “CATHETER INTERVENTION FIRST TREATMENT AGE" TEXT BOX
			@FindBy(xpath = "//tbody/tr[2]/td[3]/input[1]")
			public WebElement catheterInterventionFirstTreatmentAgeProxyTextBox;

			// “CATHETER INTERVENTION FIRST TREATMENT DATE(MM/YY)" TEXT BOX
			@FindBy(xpath = "//tbody/tr[2]/td[4]/input[1]")
			public WebElement catheterInterventionFirstTreatmentDateProxyTextBox;

			// "CATHETER INTERVENTION FIRST TREATMENT DON'T KNOW" TEXT BOX
			@FindBy(xpath = "//tbody/tr[2]/td[5]/input[1]")
			public WebElement catheterInterventionFirstTreatmentDontKnowProxyTextBox;

			// “CATHETER INTERVENTION FIRST TREATMENT LOCATION HOSPITAL CITY STATE COUNTRY"
			// TEXT BOX
			@FindBy(xpath = "//tbody/tr[2]/td[8]/input[1]")
			public WebElement catheterInterventionFirstTreatmentLocationProxyTextBox;

			// “CATHETER INTERVENTION MOST RECENT TREATMENT AGE" TEXT BOX
			@FindBy(xpath = "//tbody/tr[2]/td[11]/input[1]")
			public WebElement catheterInterventionMostRecentTreatmentAgeProxyTextBox;

			// “CATHETER INTERVENTION MOST RECENT TREATMENT DATE(MM/YY)" TEXT BOX
			@FindBy(xpath = "//tbody/tr[2]/td[12]/input[1]")
			public WebElement catheterInterventionMostRecentTreatmentDateProxyTextBox;

			// “CATHETER INTERVENTION MOST RECENT TREATMENT DON'T KNOW" TEXT BOX
			@FindBy(xpath = "//tbody/tr[2]/td[13]/input[1]")
			public WebElement catheterInterventionMostRecentTreatmentDontKnowProxyTextBox;

			// “CATHETER INTERVENTION MOST RECENT TREATMENT LOCATION HOSPITAL CITY STATE
			// COUNTRY" TEXT BOX
			@FindBy(xpath = "//tbody/tr[2]/td[16]/input[1]")
			public WebElement catheterInterventionMostRecentTreatmentLocationProxyTextBox;

			// -------------SURGERY SECTION-------------

			// “SURGERY FIRST TREATMENT AGE" TEXT BOX
			@FindBy(xpath = "//tbody/tr[3]/td[3]/input[1]")
			public WebElement surgeryFirstTreatmentAgeProxyTextBox;

			// “SURGERY FIRST TREATMENT DATE(MM/YY)" TEXT BOX
			@FindBy(xpath = "//tbody/tr[3]/td[4]/input[1]")
			public WebElement surgeryFirstTreatmentDateProxyTextBox;

			// "SURGERY FIRST TREATMENT DON'T KNOW" TEXT BOX
			@FindBy(xpath = "//tbody/tr[3]/td[5]/input[1]")
			public WebElement surgeryFirstTreatmentDontKnowProxyTextBox;

			// “SURGERY FIRST TREATMENT LOCATION HOSPITAL CITY STATE COUNTRY" TEXT BOX
			@FindBy(xpath = "//tbody/tr[3]/td[8]/input[1]")
			public WebElement surgeryFirstTreatmentLocationProxyTextBox;

			// “SURGERY MOST RECENT TREATMENT AGE" TEXT BOX
			@FindBy(xpath = "//tbody/tr[3]/td[11]/input[1]")
			public WebElement surgeryMostRecentTreatmentAgeProxyTextBox;

			// “SURGERY MOST RECENT TREATMENT DATE(MM/YY)" TEXT BOX
			@FindBy(xpath = "//tbody/tr[3]/td[12]/input[1]")
			public WebElement surgeryMostRecentTreatmentDateProxyTextBox;

			// “SURGERY MOST RECENT TREATMENT DON'T KNOW" TEXT BOX
			@FindBy(xpath = "//tbody/tr[3]/td[13]/input[1]")
			public WebElement surgeryMostRecentTreatmentDontKnowProxyTextBox;

			// “SURGERY MOST RECENT TREATMENT LOCATION HOSPITAL CITY STATE COUNTRY" TEXT BOX
			@FindBy(xpath = "//tbody/tr[3]/td[16]/input[1]")
			public WebElement surgeryMostRecentTreatmentLocationProxyTextBox;

			// -------------OTHER(PLEASE SPECIFY) SECTION-------------

			// “OTHER(PLEASE SPECIFY) FIRST TREATMENT AGE" TEXT BOX
			@FindBy(xpath = "//tbody/tr[4]/td[3]/input[1]")
			public WebElement otherFirstTreatmentAgeProxyTextBox;

			// “OTHER(PLEASE SPECIFY) FIRST TREATMENT DATE(MM/YY)" TEXT BOX
			@FindBy(xpath = "//tbody/tr[4]/td[4]/input[1]")
			public WebElement otherFirstTreatmentDateProxyTextBox;

			// "OTHER(PLEASE SPECIFY) FIRST TREATMENT DON'T KNOW" TEXT BOX
			@FindBy(xpath = "//tbody/tr[4]/td[5]/input[1]")
			public WebElement otherFirstTreatmentDontKnowProxyTextBox;

			// “OTHER(PLEASE SPECIFY) FIRST TREATMENT LOCATION HOSPITAL CITY STATE COUNTRY" TEXT BOX
			@FindBy(xpath = "//tbody/tr[4]/td[8]/input[1]")
			public WebElement otherFirstTreatmentLocationProxyTextBox;

			// “OTHER(PLEASE SPECIFY) MOST RECENT TREATMENT AGE" TEXT BOX
			@FindBy(xpath = "//tbody/tr[4]/td[11]/input[1]")
			public WebElement otherMostRecentTreatmentAgeProxyTextBox;

			// “OTHER(PLEASE SPECIFY) MOST RECENT TREATMENT DATE(MM/YY)" TEXT BOX
			@FindBy(xpath = "//tbody/tr[4]/td[12]/input[1]")
			public WebElement otherMostRecentTreatmentDateProxyTextBox;

			// “OTHER(PLEASE SPECIFY) MOST RECENT TREATMENT DON'T KNOW" TEXT BOX
			@FindBy(xpath = "//tbody/tr[4]/td[13]/input[1]")
			public WebElement otherMostRecentTreatmentDontKnowProxyTextBox;

			// “OTHER(PLEASE SPECIFY) MOST RECENT TREATMENT LOCATION HOSPITAL CITY STATE COUNTRY" TEXT BOX
			@FindBy(xpath = "//tbody/tr[4]/td[16]/input[1]")
			public WebElement otherMostRecentTreatmentLocationProxyTextBox;

			/*
			 * ----------------- END OF PLEASE COMPLETE THE TABLE BELOW BY PROVIDING INFORMATION FOR THE FIRST TREATMENT AND THE MOST RECENT TREATMENT.  YOU ONLY NEED TO PROVIDE THE AGE AT WHICH SYMPTOMS
			 *  OCCURRED OR DATE NOT BOTH. IF YOU DO NOT RECALL THE DETAILS, PLEASE PLACE AN X IN THE DONT KNOW BOX.   PAGE -----------------
			 */

			/*
			 * --------------- BEGINNING OF PLEASE PROVIDE ANY DETAILS KNOWN FOR THE CONDITION(S) FOR WHICH CHRISTINA HAS BEEN DIAGNOSED. PAGE ---------------
			 */
			
			//TACHYCARDIA AGE OF FIRST SYMPTOM TEXT BOX
			@FindBy(xpath = "//tbody/tr[1]/td[3]/input[1]")
			public WebElement tachycardiaAgeOfFirstSymptomProxyTextBox;
			
			//TACHYCARDIA AGE OF DIAGNOSIS TEXT BOX
			@FindBy(xpath = "//tbody/tr[1]/td[8]/input[1]")
			public WebElement tachycardiaAgeOfDiagnosisProxyTextBox;
			
			//TACHYCARDIA TREATMENT AND MEDICATION TAKEN TEXT BOX
			@FindBy(xpath = "//tbody/tr[1]/td[13]/input[1]")
			public WebElement tachycardiaTreatmentAndMedicationProxyTextBox;
			
			//TACHYCARDIA HOSPITAL OF TREATMENT TEXT BOX
			@FindBy(xpath = "//tbody/tr[1]/td[16]/input[1]")
			public WebElement tachycardiaHospitalOfTreatmentProxyTextBox;
			
			//CARDIAC CONDUCTION DEFECT DATE OF FIRST SYMPTOM TEXT BOX
			@FindBy(xpath = "//tbody/tr[2]/td[3]/input[1]")
			public WebElement cardiacConductionDefectFristSymptomProxyTextBox;
			
			//CARDIAC CONDUCTION DEFECT DATE OF DIAGNOSIS TEXT BOX
			@FindBy(xpath = "//tbody/tr[2]/td[8]/input[1]")
			public WebElement cardiacConductionDefectDateOfDiagnosisProxyTextBox;
			
			//CARDIAC CONDUCTION DEFECT TREATMENT AND MEDICATION TAKEN TEXT BOX
			@FindBy(xpath = "//tbody/tr[2]/td[13]/input[1]")
			public WebElement cardiacConductionDefectTreatmentAndMedicationProxyTextBox;
			
			//CARDIAC CONDUCTION DEFECT HOSPITAL OF TREATMENT TEXT BOX
			@FindBy(xpath = "//tbody/tr[2]/td[16]/input[1]")
			public WebElement cardiacConductionDefectHospitalOfTreatmentProxyTextBox;
			
			// HEART FAILURE AGE OF FIRST SYMPTOM TEXT BOX
			@FindBy(xpath = "//tbody/tr[3]/td[3]/input[1]")
			public WebElement heartFailureAgeOfFirstSymptomProxyTextBox;
			
			// HEART FAILURE DATE OF DIAGNOSIS TEXT BOX
			@FindBy(xpath = "//tbody/tr[3]/td[8]/input[1]")
			public WebElement heartFailureDateOfDiagnosisProxyTextBox;
			
			// HEART FAILURE TREATMENT AND MEDICATION TAKEN TEXT BOX
			@FindBy(xpath = "//tbody/tr[3]/td[13]/input[1]")
			public WebElement heartFailureTreatmentAndMedecationProxyTextBox;
			
			// HEART FAILURE HOSPITAL OF TREATMENT TEXT BOX
			@FindBy(xpath = "//tbody/tr[3]/td[16]/input[1]")
			public WebElement heartFailureHospitalOfTreatmentProxyTextBox;
			
			// OTHER HEART ISSUES DATE OF FIRST SYMPTOM TEXT BOX
			@FindBy(xpath = "//tbody/tr[4]/td[3]/input[1]")
			public WebElement otherHeartIssuesDateOfFirstSymptomProxyTextBox;
			
			// OTHER HEART ISSUES AGE OF DIAGNOSIS TEXT BOX
			@FindBy(xpath = "//tbody/tr[4]/td[8]/input[1]")
			public WebElement otherHeartIssuesAgeOfDiagnosisProxyTextBox;
			
			// OTHER HEART ISSUES TREATMENT AND MEDICATION TAKEN TEXT BOX
			@FindBy(xpath = "//tbody/tr[4]/td[13]/input[1]")
			public WebElement OtherHeartIssuesTreatmentAndMedicationProxyTextBox;
			
			// OTHER HEART ISSUES HOSPITAL OF TREATMENT TEXT BOX
			@FindBy(xpath = "//tbody/tr[4]/td[16]/input[1]")
			public WebElement otherHeartIssuesHospitalOfTreatmentProxyTextBox;

			/*
			 * --------------- END OF PLEASE PROVIDE ANY DETAILS KNOWN FOR THE CONDITION(S) FOR WHICH CHRISTINA HAS BEEN DIAGNOSED. PAGE ---------------
			 */

			/*
			 * --------------- BEGINNING PLEASE PROVIDE THE INFORMATION FOR CHRISTINAS PRIMARY CARE PROVIDER BELOW.   PAGE ---------------
			 */
			
			// PRIMARY CARE PROVIDER NAME TEXT BOX 
			@FindBy(xpath = "(//input[@type='text'])[1]")
			public WebElement PrimaryCareProviderNameProxyTextBox ;
			
			// PRIMARY CARE PROVIDER LOCATION TEXT BOX
			@FindBy(xpath = "(//input[contains(@type,'text')])[2]")
			public WebElement PrimaryCareProviderLocationProxyTextBox ;
			
			// PRIMARY CARE PROVIDER HOSPITAL OR MEDICAL CENTER AFFILIATION TEXT BOX
			@FindBy(xpath = "(//input[contains(@type,'text')])[3]")
			public WebElement PrimaryCareProviderHospitalorMedicalCenterAffiliationProxyTextBox ;

			/*
			 * --------------- END PLEASE PROVIDE THE INFORMATION FOR CHRISTINAS PRIMARY CARE PROVIDER BELOW.   PAGE ---------------
			 */

			/*
			 * --------------- BEGINNING OF PLEASE INDICATE IN THE TABLE BELOW IF CHRISTINA HAS ALLERGIES TO THE LISTED ITEMS. PAGE ---------------
			 */
			
			// ALLERGIES TO MEDICINES RADIO BUTTON
			@FindBy(xpath = "//label[@for='QR~QID447#1~1~1']")
			public WebElement allergiesToMedicinesProxyRadioButton ;
			
			// ALLERGIES TO FOOD RADIO BUTTON
			@FindBy(xpath = "//label[@for='QR~QID447#1~2~1']")
			public WebElement allergiesToFoodProxyRadioButton ;

			//ALLERGIES TO ANYTHING ELSE RADIO BUTTON
			@FindBy(xpath = "//label[@for='QR~QID447#1~3~1']")
			public WebElement allergiesToAnythingElseProxyRadioButton ;
			
			/*
			 * --------------- END OF PLEASE INDICATE IN THE TABLE BELOW IF CHRISTINA HAS ALLERGIES TO THE LISTED ITEMS. PAGE ---------------
			 */

			/*
			 * --------------- BEGINNING OF TABLE OF ALL MEDICATIONS WHICH CHRISTINA IS ALLERGIC TO . PAGE ---------------
			 */
				
			// MEDICATION NAME TEXT BOX
			@FindBy(xpath = "(//input[@type='text'])[1]")
			public WebElement medicationNamesProxyTextBox ;
				
			//ALLERGIES REACTIONS TEXT BOX
			@FindBy(xpath = "(//input[@type='text'])[2]")
			public WebElement allergiesReactionsProxyTextBox ;
			
			/*
			 * --------------- END OF TABLE OF ALL MEDICATIONS WHICH CHRISTINA IS ALLERGIC TO . PAGE ---------------
			 */	
			
			/*
			 * --------------- BEGINNING OF TABLE OF ALL FOOD OF WHICH CHRISTINA IS ALLERGIC TO . PAGE ---------------
			 */
				
			// ALLERGY TO MILK TEXT BOX
			@FindBy(xpath = "(//input[@type='text'])[1]")
			public WebElement firstFoodAllergyNamesProxyTextBox ;
				
			// REACTION TO MILK ALLERGY TEXT BOX
			@FindBy(xpath = "(//input[@type='text'])[2]")
			public WebElement firstFoodAllergyreactionProxyTextBox ;
				
			// ALLERGY TO NUTS TEXT BOX
			@FindBy(xpath = "(//input[@type='text'])[3]")
			public WebElement secondFoodAllergyNamesProxyTextBox ;
				
			// REACTION TO NUTS ALLERGY TEXT BOX
			@FindBy(xpath = "(//input[@type='text'])[4]")
			public WebElement secondFoodAllergyreactionProxyTextBox ;
			
			/*
			 * --------------- END OF TABLE OF ALL FOOD OF WHICH CHRISTINA IS ALLERGIC TO . PAGE ---------------
			 */		

			/*
			 * --------------- BEGINNING OF TABLE OF ALL "OTHER" ITEMS TO WHICH CHRISTINA IS ALLERGIC THAT WERE NOT INCLUDED IN MEDICATION OR FOOD ALLERGIES. . PAGE ---------------
			 */
			
			// OTHER  ALLERGY 1 TEXT BOX
			@FindBy(xpath = "(//input[@type='text'])[1]")
			public WebElement firstOtherAllergyNamesProxyTextBox ;
				
			// OTHER ALLERGY REACTION 1 TEXT BOX
			@FindBy(xpath = "(//input[@type='text'])[2]")
			public WebElement firstOtherAllergyReactionProxyTextBox ;
				
			//OTHER ALLERGY 2 TEXT BOX
			@FindBy(xpath = "(//input[@type='text'])[3]")
			public WebElement secondOtherAllergyNamesProxyTextBox ;
			
			// OTHER ALLERGY REACTION 2 TEXT BOX
			@FindBy(xpath = "(//input[@type='text'])[4]")
			public WebElement secondOtherAllergyReactionProxyTextBox ;

			/*
			 * --------------- END OF TABLE OF ALL "OTHER" ITEMS TO WHICH CHRISTINA IS ALLERGIC THAT WERE NOT INCLUDED IN MEDICATION OR FOOD ALLERGIES. . PAGE ---------------
			 */

			/*
			 * --------------- BEGINNING OF PLEASE PROVIDE THE INFORMATION FOR EACH HOSPITALIZATION IN THE TABLE BELOW. 
			 * TO ADD A NEW HOSPITALIZATION, PLEASE CLICK ON THE '+' SIGN IN THE UPPER LEFT CORNER OF THE TABLE.  PAGE ---------------
			 */

			//PLEASE PROVIDE PRIMARY REASON FOR HOSPITALIZATION TEXT BOX
			@FindBy(xpath = "(//input[@type='text'])[1]")
			public WebElement reasonOfHospitalizationProxyTextBox ;
				
			//DATE OF HOSPITALIZATION ACCURANCE TEXT BOX
			@FindBy(xpath = "(//input[@type='text'])[3]")
			public WebElement dateOfHospitalizationProxyTextBox ;
				
			// PLACE OF HOSPITALIZATION ACCURANCE 
			@FindBy(xpath = "(//textarea[@type='text'])[1]")
			public WebElement placeOfHospitalizationProxyTextBox ;
				
			/*
			 * --------------- END OF PLEASE PROVIDE THE INFORMATION FOR EACH HOSPITALIZATION IN THE TABLE BELOW. 
			 * TO ADD A NEW HOSPITALIZATION, PLEASE CLICK ON THE '+' SIGN IN THE UPPER LEFT CORNER OF THE TABLE.  PAGE ---------------
			 */
			
			/*
			 * --------------- BEGINNING OF PLEASE COMPLETE THE NEXT SET OF QUESTIONS REGARDING ABDOMINAL PAIN PROXY. PAGE ---------------
			 */
			
			//EVER HAD WAVES OF SEVERE, DISTRESSING,ACUTE PAIN AT THE BELLY-BUTTON OR ENTIRE ABDOMEN? YES RADIO BUTTON
			@FindBy (xpath= ("(//label[@for='QR~QID131#1~1~1'])[1]"))
			public WebElement severeDistressingAcutePainAtTheBellyButtomOrEntireAbdomenProxyYesRadioButton;
				
			//ARE EPISODES OF BELLY PAIN SEPARATED BY WEEKS OR MONTHS? YES RADIO BUTTON
			@FindBy (xpath= ("(//label[@for='QR~QID131#1~2~1'])[1]"))
			public WebElement areEpisodesOfBellyPainSeparatedByWeeksOrMonthsProxyYesRadioButton;
				
			//DOES ABDOMINAL PAIN PREVENT THE COMPLETION OF USUAL ACTIVITIES? YES RADIO BUTTON
			@FindBy (xpath= ("(//label[@for='QR~QID131#1~3~1'])[1]"))
			public WebElement doesAbdominalPainPreventTheCompletionOfUsualActivitiesProxyYesRadioButton;
				
			//IS THE PAIN SIMILAR WITH EACH EPISODES? YES RADIO BUTTON
			@FindBy (xpath= ("(//label[@for='QR~QID131#1~4~1'])[1]"))
			public WebElement isThePainSimilarWithEachEpisodeProxyYesRadioButton;
				
			//HAVE THESE EPISODES BEEN HAPPENING AT LEAST SIX MONTHS? YES RADIO BUTTON
			@FindBy (xpath= ("(//label[@for='QR~QID131#1~5~1'])[1]"))
			public WebElement haveTheseEpisodesBeenHappeningAtLeastSixMonthsProxyYesRadioButton;
				
			//ABDOMINAL PAINS OCCUR AT LEAST 4 DAYS/MONTHS FOR > 2 MONTHS? YES RADIO BUTTON
			@FindBy (xpath =("(//label[@for='QR~QID131#1~6~1'])[1]"))
			public WebElement abdominalPainsOccurAtLeast4MonthsFor2MonthsProxyYesRadioButton;
				
			//IS PAIN ASSOCIATED WITH HAVING BOWEL MOVEMENTS? YES RADIO BUTTON
			@FindBy (xpath= ("(//label[@for='QR~QID131#1~7~1'])[1]"))
			public WebElement isPainAssociatedWithHavingBowelMovementsProxyYesRadioButton;
				
			//ASSOCIATED WITH CHANGE IN BOWEL MOVEMENT FREQUENCY? YES RADIO BUTTON
			@FindBy (xpath = ("(//label[@for='QR~QID131#1~8~1'])[1]"))
			public WebElement associatedWithChangeInBowelMovementFrequencyProxyYesRadioButton;
				
			//ASSOCIATED WITH CHANGE IN BOWEL MOVEMENT CONSISTENCY? YES RADIO BUTTON
			@FindBy (xpath= ("(//label[@for='QR~QID131#1~9~1'])[1]"))
			public WebElement associatedWithChangeInBowelMovementConsistencyProxyYesRadioButton;
				
			//DID PAIN RESOLVE IN RELATION TO RESOLUTION OF CONSTIPATION? YES RADIO BUTTON
			@FindBy (xpath =("(//label[@for='QR~QID131#1~10~1'])[1]"))
			public WebElement didPainResolveInRelationToResolutionOfConstipationProxyYesRadioButton;
				
			//IS THE PAIN NOT RELATED TO EATING, MENSTRUAL CYCLES OR OTHER ILLNESS? YES RADIO BUTTON
			@FindBy (xpath=("(//label[@for='QR~QID131#1~11~1'])[1]"))
			public WebElement isThePainNotRelatedToEatingMenstrualCyclesOrOtherIllnessProxyYesRadioButton;
				
			//HAS ABDOMINAL PAIN EVER CAUSED AWAKENING FROM SLEEP AT NIGHT? YES RADIO BUTTON
			@FindBy (xpath = ("(//label[@for='QR~QID131#1~12~1'])[1]"))
			public WebElement hasAbdominalPainEverCausedAwakeningFromSleepAtNightProxyYesRadioButton;
				
			//HAS THE ABDOMINAL PAIN CAUSED WEIGHT LOSS? YES RADIO BUTTON
			@FindBy (xpath=("(//label[@for='QR~QID131#1~13~1'])[1]"))
			public WebElement hasTheAbdominalPainCausedWeightLossProxyYesRadioButton;
				
			//IS ABDOMINAL PAIN ASSOCIATED WITH LOSS OF APPETITE? YES RADIO BUTTON
			@FindBy (xpath=("(//label[@for='QR~QID131#1~14~1'])[1]"))
			public WebElement isAbdominalPainAssociatedWithLossOfAppetiteProxyYesRadioButton;
				
			//IS ABDOMINAL PAIN ASSOCIATED WITH NAUSEA? YES RADIO BUTTON
			@FindBy (xpath= ("(//label[@for='QR~QID131#1~15~1'])[1]"))
			public WebElement isAbdominalPainAssociatedWithNauseaProxyYesRadioButton;
				
			//Is abdominal pain associated with vomiting? YES RADIO BUTTON
			@FindBy (xpath =("(//label[@for='QR~QID131#1~16~1'])[1]"))
			public WebElement isAbdominalPainAssociatedWithVomitingProxyYesRadioButton;
				
			//IS ABDOMINAL PAIN ASSOCIATED WITH HEADACHE? YES RADIO BUTTON
			@FindBy (xpath=("(//label[@for='QR~QID131#1~17~1'])[1]"))
			public WebElement isAbdominalPainAssociatedWithHeadacheProxyYesRadioButton;
				
			//IS ABDOMINAL PAIN ASSOCIATED WITH IRRITATION TO BRIGHT LIGHT? YES RADIO BUTTON
			@FindBy (xpath= ("(//label[@for='QR~QID131#1~18~1'])[1]"))
			public WebElement isAbdominalPainAssociatedWithIrritationToBrightLightProxyYesRadioButton;
				
			//IS ABDOMINAL PAIN ASSOCIATED WITH LOOKING PALE? YES RADIO BUTTON
			@FindBy (xpath=("(//label[@for='QR~QID131#1~19~1'])[1]"))
			public WebElement isAbdominalPainAssociatedWithLookingPaleProxyYesRadioButton;
			/*
			 * --------------- END OF PLEASE COMPLETE THE NEXT SET OF QUESTIONS REGARDING ABDOMINAL PAIN PROXY. PAGE ---------------
			 */

			/*
			 * --------------- BEGINNING OF TO WHAT FOODS IS CHRISTINA AVERSE? PLEASE DESCRIBE FOODS THAT CHRISTINA AVOIDS BECAUSE THEY DO NOT LIKE THE TEXTURE OR OTHER PHYSICAL QUALITIES OF THE FOOD   PAGE ---------------
			 */
						
			//DESCRIBE FOODS THAT YOU AVOID BECAUSE YOU DO NOT LIKE THE TEXTURE OR OTHER PHYSICAL QUALITIES OF THE FOOD. EGGS TEXT BOX
			@FindBy (xpath= ("(//input[@name='QR~QID575~TEXT'])[1]"))
			public WebElement describeFoodsThatYouAvoidBecauseYouDoNotLikeTheTextureOrOtherPhysicalQualitiesOfTheFoodEggsProxyTextBox;
			
			/*
			 * --------------- END OF TO WHAT FOODS IS CHRISTINA AVERSE? PLEASE DESCRIBE FOODS THAT CHRISTINA AVOIDS BECAUSE THEY DO NOT LIKE THE TEXTURE OR OTHER PHYSICAL QUALITIES OF THE FOOD   PAGE ---------------
			 */
			
			/*
			 * --------------- BEGINNING OF AT WHAT AGE (APPROXIMATELY) WAS CHRISTINA TOILET TRAINED? PAGE ---------------
			 */
			
			//AT WHAT AGE (APPROXIMATELY) WERE YOU TOILET TRAINED? DROP DOWN
			@FindBy (xpath=("(//select[@name='QR~QID577'])[1]"))
			public WebElement atWhatAgeApproximatelyWereYouToiletTrainedProxyDropDown;

			/*
			 * --------------- END OF AT WHAT AGE (APPROXIMATELY) WAS CHRISTINA TOILET TRAINED? PAGE ---------------
			 */

			/*
			 * --------------- BEGINNING OF HOW MANY BOWEL MOVEMENTS DOES CHRISTINA HAVE PER WEEK? PAGE ---------------
			 */
						
			//BEGIN HOW MANY BOWEL MOVEMENTS DO YOU HAVE PER WEEK?  DROP DOWN
			@FindBy (xpath= ("(//select[@name='QR~QID578'])[1]"))
			public WebElement howManyBowelMovementsDoYouHavePerWeekProxyDropDown;

			/*
			 * --------------- END OF HOW MANY BOWEL MOVEMENTS DOES CHRISTINA HAVE PER WEEK? PAGE ---------------
			 */

			/*
			 * --------------- BEGINNING OF WHAT IS THE LONGEST AMOUNT OF TIME THAT HAS PASSED WITHOUT CHRISTINA HAVING A BOWEL MOVEMENT? PAGE ---------------
			 */
						
			//WHAT IS THE LONGEST AMOUNT OF TIME THAT HAS PASSED WITHOUT YOU HAVING A BOWEL MOVEMENT? DROP DOWN
			@FindBy (xpath=("(//select[@name='QR~QID579'])[1]"))
			public WebElement whatIsTheLongestAmountOfTimeThatHasPassedWithoutYouHavingABowelMovementProxyDropDown;

			/*
			 * --------------- END OF WHAT IS THE LONGEST AMOUNT OF TIME THAT HAS PASSED WITHOUT CHRISTINA HAVING A BOWEL MOVEMENT? PAGE ---------------
			 */

			/*
			 * --------------- BEGINNING OF PLEASE PROVIDE THE INFORMATION BELOW FOR THE PULMONOLOGIST WHO COMPLETED FOR PROXY EVALUATION. PAGE ---------------
			 */
			
			//NAME OF PHYSICIAN TEXT BOX
			@FindBy (xpath=("(//input[@type='text'])[1]"))
			public WebElement nameOfPhysicianProxyTextBox;
						
			//LOCATION (CITY, STATE, COUNTRY) TEXT BOX
			@FindBy (xpath=("(//input[contains(@type,'text')])[2]"))
			public WebElement locationPulmonologistCityStateCountryProxyTextBox;
						
			//HOSPITAL AND MEDICAL CENTER AFFILIATION TEXT BOX
			@FindBy (xpath=("(//input[contains(@type,'text')])[3]"))
			public WebElement hospitalAndMedicalCenterAffiliationTestProxyTextBox;

			/*
			 * --------------- END OF PLEASE PROVIDE THE INFORMATION BELOW FOR THE PULMONOLOGIST WHO COMPLETED FOR PROXY EVALUATION. PAGE ---------------
			 */
			
			/*
			 * ----------------- BEGINING OF WHAT WAS THE REASON FOR YOUR LAST PROXY DENTAL VISIT? PAGE -----------------
			 */		

			// CLEANING OPTION RADIO BUTTON
			@FindBy(xpath = "(//label[@for='QR~QID531~1'])[2]")
			public WebElement cleaningProxyRadioButton;

			/*
			 * ----------------- END OF WHAT WAS THE REASON FOR YOUR LAST PROXY DENTAL VISIT? PAGE -----------------
			 */
			
			/*
			 * ----------------- BEGINING OF OVERALL, HOW WOULD YOU RATE PROXY THE OVERALL HEALTH OF YOUR TEETH AND GUMS? PAGE -----------------
			 */

			// OVERALL, HOW WOULD YOU RATE THE OVERALL HEALTH OF YOUR TEETH AND GUMS? PROXY FAIR RADIO BUTTON
			@FindBy(xpath = "(//label[@for='QR~QID539~3'])[2]")
			public WebElement overallHealthOfTeethAndGumsFairProxyRadioButton;

			/*
			 * ----------------- END OF OVERALL, HOW WOULD YOU RATE PROXY THE OVERALL HEALTH OF YOUR TEETH AND GUMS? PAGE -----------------
			 */

			/*
			 * ----------------- BEGINING OF OVERALL, HOW WOULD YOU RATE PROXY DENTAL HYGIENE ROUTINE (REGULAR TOOTH BRUSHING, FLOSSING, AND YOUR HOME ORAL MOUTH RINSE)? PAGE -----------------
			 */		

			// OVERALL, HOW WOULD YOU RATE PROXY DENTAL HYGIENE ROUTINE FAIR RADIO BUTTON
			@FindBy(xpath = "(//label[@for='QR~QID540~3'])[2]")
			public WebElement overallRateDentalHygeneFairProxyRadioButton;

			/*
			 * ----------------- END OF OVERALL, HOW WOULD YOU RATE PROXY DENTAL HYGIENE ROUTINE (REGULAR TOOTH BRUSHING, FLOSSING, AND YOUR HOME ORAL MOUTH RINSE)? PAGE -----------------
			 */	
			
			/*
			 *  ----------------- BEGINING OF OVERALL -- IS THERE ANYTHING UNUSUAL ABOUT PROXY TEETH OR MOUTH 
			 *  (EXTRA TEETH, MISSING TEETH, SEVERE DENTAL DISEASES, JAWBONE PROBLEMS, ENAMEL PROBLEMS, ETC.)? PAGE -----------------
			 */
							
			//OVERALL -- IS THERE ANYTHING UNUSUAL ABOUT PROXY TEETH OR MOUTH...? YES (PLEASE SPECIFY)RADIO BUTTON
			@FindBy(xpath = "//span[contains(text(),'Yes (please specify what is unusual)')]")
			public WebElement overallIsThereAnythingUnusualAboutYourTeethOrMouthYesPleaseSpecifyWhatIsUnusualProxyRadioButton;
						
			/*
			 * ----------------- END OF OVERALL -- IS THERE ANYTHING UNUSUAL ABOUT PROXY TEETH OR MOUTH 
			 * (EXTRA TEETH, MISSING TEETH, SEVERE DENTAL DISEASES, JAWBONE PROBLEMS, ENAMEL PROBLEMS, ETC.)? PAGE -----------------
			 */	
			
			/*
		   	 *  ----------------- BEGINING OF HAVE YOU HAD TROUBLE PRONOUNCING ANY WORDS BECAUSE OF PROBLEMS WITH PROXY TEETH, MOUTH OR DENTURES? PAGE -----------------
			 */
							
			//HAVE YOU HAD TROUBLE PRONOUNCING ANY WORDS BECAUSE OF PROBLEMS WITH PROXY TEETH, MOUTH OR DENTURES? OCCASIONALLY RADIO BUTTON
			@FindBy(xpath = "(//label[contains(@for,'QR~QID556~3')])[2]")
			public WebElement troublePronouncingWordsBecauseOfProblemsWithTeethMouthOrDenturesOcassionallyProxyRadioButton;
				
			/*
			 * ----------------- END OF HAVE YOU HAD TROUBLE PRONOUNCING ANY WORDS BECAUSE OF PROBLEMS WITH PROXY TEETH, MOUTH OR DENTURES? PAGE -----------------
			 */	
					
			/*
			 *  ----------------- BEGINING OF HAVE YOU FELT THAT YOUR SENSE OF TASTE HAS WORSENED BECAUSE OF PROBLEMS WITH PROXY TEETH, MOUTH OR DENTURES? PAGE -----------------
			 */
							
			//HAVE YOU FELT THAT YOUR SENSE OF TASTE HAS WORSENED BECAUSE OF PROBLEMS WITH PROXY TEETH, MOUTH OR DENTURES? OCCASIONALLY RADIO BUTTON
			@FindBy(xpath = "(//label[contains(@for,'QR~QID557~3')])[2]")
			public WebElement haveYouFeltYourSenseOfTasteWorsenedBecauseOfProblemsWithTeethMouthOrDenturesOcassionallyProxyRadioButton;
				
			/*
			 * ----------------- END OF HAVE YOU FELT THAT YOUR SENSE OF TASTE HAS WORSENED BECAUSE OF PROBLEMS WITH PROXY TEETH, MOUTH OR DENTURES? PAGE -----------------
			 */
				
			/*
			 *  ----------------- BEGINING OF HAVE YOU HAD PAINFUL ACHING IN PROXY MOUTH? PAGE -----------------
			 */
							
			//HAVE YOU HAD PAINFUL ACHING IN PROXY MOUTH? OCCASIONALLY RADIO BUTTON
			@FindBy(xpath = "(//label[contains(@for,'QR~QID558~3')])[2]")
			public WebElement haveYouHadPainfulAchingInYourMouthOcassionallyProxyRadioButton;
				
			/*
			 * ----------------- END OF HAVE YOU HAD PAINFUL ACHING IN PROXY MOUTH? PAGE -----------------
			 */
				
			/*
			 *  ----------------- BEGINING OF HAVE YOU FOUND IT UNCOMFORTABLE TO EAT ANY FOODS BECAUSE OF PROBLEMS WITH PROXY TEETH, MOUTH OR DENTURES? PAGE -----------------
			 */
							
			//HAVE YOU FOUND IT UNCOMFORTABLE TO EAT ANY FOODS BECAUSE OF PROBLEMS WITH PROXY TEETH, MOUTH OR DENTURES? OCCASIONALLY RADIO BUTTON
			@FindBy(xpath = "(//label[contains(@for,'QR~QID559~3')])[2]")
			public WebElement haveYouFoundItUnconfortableToEatFoodsBecauseOfProblemsWithTeethMouthOrDenturesOcassionallyProxyRadioButton;
				
			/*
			 * ----------------- END OF HAVE YOU FOUND IT UNCOMFORTABLE TO EAT ANY FOODS BECAUSE OF PROBLEMS WITH PROXY TEETH, MOUTH OR DENTURES? PAGE -----------------
			 */
					
			/*
			 *  ----------------- BEGINING OF ARE YOU SELF-CONSCIOUS BECAUSE OF PROXY TEETH, MOUTH OR DENTURES? PAGE -----------------
			 */
							
			//ARE YOU SELF-CONSCIOUS BECAUSE OF PROXY TEETH, MOUTH OR DENTURES? OCCASIONALLY RADIO BUTTON
			@FindBy(xpath = "(//label[contains(@for,'QR~QID560~3')])[2]")
			public WebElement areYouSelfConsciousBecauseOfYourTeethMouthOrDenturesOccasionallyProxyRadioButton;
				
			/*
			 * ----------------- END OF ARE YOU SELF-CONSCIOUS BECAUSE OF PROXY TEETH, MOUTH OR DENTURES? PAGE -----------------
			 */
				
			/*
			 *  ----------------- BEGINING OF HAVE YOU FELT TENSE BECAUSE OF PROBLEMS WITH PROXY TEETH, MOUTH OR DENTURES? PAGE -----------------
			 */
							
			//HAVE YOU FELT TENSE BECAUSE OF PROBLEMS WITH PROXY TEETH, MOUTH OR DENTURES? OCCASIONALLY RADIO BUTTON
			@FindBy(xpath = "(//label[contains(@for,'QR~QID561~3')])[2]")
			public WebElement haveYouFeltTenseBecauseOfProblemsWithYourTeethMouthOrDenturesOccasionallyProxyRadioButton;
				
			/*
			 * ----------------- END OF HAVE YOU FELT TENSE BECAUSE OF PROBLEMS WITH PROXY TEETH, MOUTH OR DENTURES? PAGE -----------------
			 */
				
			/*
			 *  ----------------- BEGINING OF HAS YOUR DIET BEEN UNSATISFACTORY BECAUSE OF PROBLEMS WITH PROXY TEETH, MOUTH OR DENTURES? PAGE -----------------
			 */
							
			//HAS YOUR DIET BEEN UNSATISFACTORY BECAUSE OF PROBLEMS WITH PROXY TEETH, MOUTH OR DENTURES? OCCASIONALLY RADIO BUTTON
			@FindBy(xpath = "(//label[contains(@for,'QR~QID562~3')])[2]")
			public WebElement hasYourDietBeenUnsatisfactoryBecauseOfProblemsWithTeethMouthOrDenturesOccasionallyProxyRadioButton;
				
			/*
			 * ----------------- END OF HAS YOUR DIET BEEN UNSATISFACTORY BECAUSE OF PROBLEMS WITH PROXY TEETH, MOUTH OR DENTURES? PAGE -----------------
			 */
				
			/*
			 *  ----------------- BEGINING OF HAVE YOU HAD TO INTERRUPT MEALS BECAUSE OF PROBLEMS WITH PROXY TEETH, MOUTH OR DENTURES? PAGE -----------------
			 */
							
			//HAVE YOU HAD TO INTERRUPT MEALS BECAUSE OF PROBLEMS WITH PROXY TEETH, MOUTH OR DENTURES? OCCASIONALLY RADIO BUTTON
			@FindBy(xpath = "(//label[contains(@for,'QR~QID563~3')])[2]")
			public WebElement haveYouHadToInterruptMealsBeacuseOfProblemsWithTeethMouthOrDenturesOccasionallyProxyRadioButton;
				
			/*
			 * ----------------- END OF HAVE YOU HAD TO INTERRUPT MEALS BECAUSE OF PROBLEMS WITH PROXY TEETH, MOUTH OR DENTURES? PAGE -----------------
			 */
					
			/*
			 *  ----------------- BEGINING OF HAVE YOU FOUND IT DIFFICULT TO RELAX BECAUSE OF PROBLEMS WITH PROXY TEETH, MOUTH OR DENTURES? PAGE -----------------
			 */
							
			//HAVE YOU FOUND IT DIFFICULT TO RELAX BECAUSE OF PROBLEMS WITH PROXY TEETH, MOUTH OR DENTURES? OCCASIONALLY RADIO BUTTON
			@FindBy(xpath = "(//label[contains(@for,'QR~QID564~3')])[2]")
			public WebElement haveYouFoundItDifficultToRelaxBecauseOfProblemsWithTeethMouthOrDenturesOccasionallyProxyRadioButton;
				
			/*
			 * ----------------- END OF HAVE YOU FOUND IT DIFFICULT TO RELAX BECAUSE OF PROBLEMS WITH PROXY TEETH, MOUTH OR DENTURES? PAGE -----------------
			 */
				
				
			/*
			 *  ----------------- BEGINING OF HAVE YOU BEEN A BIT EMBARRASSED BECAUSE OF PROBLEMS WITH PROXY TEETH, MOUTH OR DENTURES? PAGE -----------------
			 */
							
			//HAVE YOU BEEN A BIT EMBARRASSED BECAUSE OF PROBLEMS WITH PROXY TEETH, MOUTH OR DENTURES? OCCASIONALLY RADIO BUTTON
			@FindBy(xpath = "(//label[contains(@for,'QR~QID565~3')])[2]")
			public WebElement haveYouBeenABitEmbarrassedBecauseOfProblemsWithTeethMouthOrDenturesOccasionallyProxyRadioButton;
				
			/*
			 * ----------------- END OF HAVE YOU BEEN A BIT EMBARRASSED BECAUSE OF PROBLEMS WITH PROXY TEETH, MOUTH OR DENTURES? PAGE -----------------
			 */
				
			/*
			 *  ----------------- BEGINING OF HAVE YOU BEEN IRRITABLE WITH OTHER PEOPLE BECAUSE OF PROBLEMS WITH PROXY TEETH, MOUTH OR DENTURES? PAGE -----------------
			 */
							
			//HAVE YOU BEEN IRRITABLE WITH OTHER PEOPLE BECAUSE OF PROBLEMS WITH PROXY TEETH, MOUTH OR DENTURES? OCCASIONALLY RADIO BUTTON
			@FindBy(xpath = "(//label[contains(@for,'QR~QID566~3')])[2]")
			public WebElement haveYouBeenIrritableWithOtherPeopleBecauseOfProblemsWithTeethMouthOrDenturesOccasionallyProxyRadioButton;
				
			/*
			 * ----------------- END OF HAVE YOU BEEN IRRITABLE WITH OTHER PEOPLE BECAUSE OF PROBLEMS WITH PROXY TEETH, MOUTH OR DENTURES? PAGE -----------------
			 */
				
			/*
			 *  ----------------- BEGINING OF HAVE YOU HAD DIFFICULTY DOING YOUR USUAL JOBS BECAUSE OF PROBLEMS WITH PROXY TEETH, MOUTH OR DENTURES? PAGE -----------------
			 */
							
			//HAVE YOU HAD DIFFICULTY DOING YOUR USUAL JOBS BECAUSE OF PROBLEMS WITH PROXY TEETH, MOUTH OR DENTURES? OCCASIONALLY RADIO BUTTON
			@FindBy(xpath = "(//label[contains(@for,'QR~QID567~3')])[2]")
			public WebElement haveYouHadDifficultyDoingYourUsualJobsBecauseOfProblemsWithTeethMouthOrDenturesOccasionallyProxyRadioButton;
				
			/*
			 * ----------------- END OF HAVE YOU HAD DIFFICULTY DOING YOUR USUAL JOBS BECAUSE OF PROBLEMS WITH PROXY TEETH, MOUTH OR DENTURES? PAGE -----------------
			 */
					
			/*
			 *  ----------------- BEGINING OF HAVE YOU FELT THAT LIFE IN GENERAL IS LESS SATISFYING BECAUSE OF PROBLEMS WITH PROXY TEETH, MOUTH OR DENTURES? PAGE -----------------
			 */
							
			//HAVE YOU FELT THAT LIFE IN GENERAL IS LESS SATISFYING BECAUSE OF PROBLEMS WITH PROXY TEETH, MOUTH OR DENTURES? OCCASIONALLY RADIO BUTTON
			@FindBy(xpath = "(//label[contains(@for,'QR~QID568~3')])[2]")
			public WebElement haveYouFeltThatLifeInGeneralIsLessSatisfyingBecauseOfProblemsWithTeethMouthOrDenturesOccasionallyProxyRadioButton;
				
			/*
			 * ----------------- END OF HAVE YOU FELT THAT LIFE IN GENERAL IS LESS SATISFYING BECAUSE OF PROBLEMS WITH PROXY TEETH, MOUTH OR DENTURES? PAGE -----------------
			 */
					
			/*
			 *  ----------------- BEGINING OF HAVE YOU BEEN TOTALLY UNABLE TO FUNCTION BECAUSE OF PROBLEMS WITH PROXY TEETH, MOUTH OR DENTURES? PAGE -----------------
			 */
							
			//HAVE YOU BEEN TOTALLY UNABLE TO FUNCTION BECAUSE OF PROBLEMS WITH PROXY TEETH, MOUTH OR DENTURES? OCCASIONALLY RADIO BUTTON
			@FindBy(xpath = "(//label[contains(@for,'QR~QID569~3')])[2]")
			public WebElement haveYouBeenTotallyUnableToFunctionBecauseOfProblemsWithTeethMouthOrDenturesOccasionallyProxyRadioButton;
				
			/*
			 * ----------------- END OF HAVE YOU BEEN TOTALLY UNABLE TO FUNCTION BECAUSE OF PROBLEMS WITH PROXY TEETH, MOUTH OR DENTURES? PAGE -----------------
			 */
			
			/*
			 * ----------------- BEGINING OF PLEASE PROVIDE THE INFORMATION BELOW FOR THE
			 * DERMATOLOGIST WHO COMPLETED PROXY EVALUATION. PAGE ----------------- */

			//"NAME OF PHYSICIAN" TEXT BOX
			@FindBy(xpath = "(//input[@type='text'])[1]")
			public WebElement nameOfPhysicianDermatologistProxyTextBox;

			//"CITY, STATE" TEXT BOX
			@FindBy(xpath = "(//input[@type='text'])[2]")
			public WebElement cityStateProxyTextBox;
			
			//"HOSPITAL OR MEDICAL CENTER AFFILIATION" TEXT BOX
			@FindBy(xpath = "(//input[@type='text'])[3]")
			public WebElement hospitalOrMedicalCenterAffiliationProxyTextBox;

			/*
			 * ----------------- END OF PLEASE PROVIDE THE INFORMATION BELOW FOR THE DERMATOLOGIST WHO COMPLETED PROXY EVALUATION. PAGE -----------------
			 */
			
			/*
			 * ----------------- BEGINNING OF PLEASE COMPLETE THE TABLE BELOW FOR EACH OF THE TUMORS LISTED. PLEASE INCLUDE PROXY AGE OR DATE WHEN SYMPTOMS FIRST
			 * STARTED AND DIAGNOSIS (YOU DO NOT NEED TO INCLUDE BOTH AGE AND DATE). IF YOU DO NOT RECALL THE DETAILS, PLEASE PLACE AN 'X' UNDER THE 'DON'T KNOW' COLUMN. PAGE ----------------- 
			 */

			
			//GIANT CELL LESION "YES" RADIO BUTTON
			@FindBy(xpath = "//label[@for='QR~QID495#3~x1~1']")
			public WebElement giantCellLesionYesProxyRadioButton;

			//PIGMENTED VILONODULOUS SYNOVITUS "YES" RADIO BUTTON
			@FindBy(xpath = "//label[@for='QR~QID495#3~x2~1']")
			public WebElement pigmentedVilonodulousYesProxyRadioButton;

			//PAPILOMATA... "YES" RADIO BUTTON
			@FindBy(xpath = "//label[contains(@for,'QR~QID495#3~x3~1')]")
			public WebElement papilomataYesProxyRadioButton;

			//RHABDOMYOSARCOMA... "YES" RADIO BUTTON
			@FindBy(xpath = "//label[contains(@for,'QR~QID495#3~x4~1')]")
			public WebElement rhabdomyosarcomaYesProxyRadioButton;

			//NEUROBLASTOMA..."YES" RADIO BUTTON
			@FindBy(xpath = "//label[contains(@for,'QR~QID495#3~x5~1')]")
			public WebElement neuroblastomaYesProxyRadioButton;

			//OTHER TUMOR "YES" RADIO BUTTON
			@FindBy(xpath = "//label[contains(@for,'QR~QID495#3~x6~1')]")
			public WebElement otherTumorDisorderYesProxyRadioButton;

			/*
			 * ----------------- END OF PLEASE COMPLETE THE TABLE BELOW FOR EACH OF THE TUMORS LISTED. PLEASE INCLUDE PROXY AGE OR DATE WHEN SYMPTOMS FIRST
			 * STARTED AND DIAGNOSIS (YOU DO NOT NEED TO INCLUDE BOTH AGE AND DATE). IF YOU DO NOT RECALL THE DETAILS, PLEASE PLACE AN 'X' UNDER THE 'DON'T KNOW' COLUMN. PAGE ----------------- 
			 */
			
			/*
			 * ----------------- BEGINNING OF PROXY PLEASE COMPLETE THE TABLE BELOW FOR EACH OF THE CONDITIONS LISTED. FOR EACH CONDITION, PLEASE LIST THE AGE OR DATE WHEN
			 * SYMPTOMS FIRST OCCURRED AND WHEN THE DIAGNOSIS WAS MADE (YOU DO NOT NEED TO INCLUDE BOTH AGE AND DATE). IF YOU DO NOT RECALL THE DETAILS, PLACE AN 'X' IN
			 * THE 'DON'T KNOW' COLUMN. PAGE -----------------
			 */

			//SENSORINEURAL "YES" RADIO BUTTON
			@FindBy(xpath = "(//label[contains(@for,'QR~QID527#3~x1~1')])[1]")
			public WebElement yesSensorineuralTreatmentProxyRadioButton;

			//CONDUCTIVE HEARING TREATMENT "YES" RADIO BUTTON
			@FindBy(xpath = "(//label[contains(@for,'QR~QID527#3~x2~1')])[1]")
			public WebElement yesConductiveTreatmentProxyRadioButton;

			//MIXED HEARING TREATMENT "YES" RADIO BUTTON
			@FindBy(xpath = "(//label[contains(@for,'QR~QID527#3~x3~1')])[1]")
			public WebElement yesMixedTreatmentProxyRadioButton;

			//HEARING LOSS UNSURE TREATMENT "YES" RADIO BUTTON
			@FindBy(xpath = "(//label[contains(@for,'QR~QID527#3~x4~1')])[1]")
			public WebElement yesUnsureHearingLossTreatmentProxyRadioButton;

			//OTHER TREATMENT "YES" RADIO BUTTON
			@FindBy(xpath = "(//label[@for='QR~QID527#3~x6~1'])[1]")
			public WebElement yesOtherTreatmentProxyRadioButton;

			/*
			 * ----------------- END OF PROXY PLEASE COMPLETE THE TABLE BELOW FOR EACH OF THE CONDITIONS LISTED. FOR EACH CONDITION, PLEASE LIST THE AGE OR DATE WHEN
			 * SYMPTOMS FIRST OCCURRED AND WHEN THE DIAGNOSIS WAS MADE (YOU DO NOT NEED TO INCLUDE BOTH AGE AND DATE). IF YOU DO NOT RECALL THE DETAILS, PLACE AN 'X' IN
			 * THE 'DON'T KNOW' COLUMN. PAGE ----------------- 
			 */


}


