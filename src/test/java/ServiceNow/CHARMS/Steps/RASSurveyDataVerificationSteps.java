package ServiceNow.CHARMS.Steps;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.asserts.SoftAssert;
import java.io.IOException;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.xceptions.TestingException;
import appsCommon.PageInitializer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RASSurveyDataVerificationSteps extends PageInitializer {

	SoftAssert softAssertion = new SoftAssert();

	@Then("all data submitted via the RAS Survey is verified in Native View")
	public void all_data_submitted_via_the_RAS_Survey_is_verified_in_Native_View()
			throws InvalidFormatException, IOException, TestingException {

		// Logging into native view
		MiscUtils.sleep(1000);
		nativeViewLoginImpl.nativeViewLogin();
		CommonUtils.waitForVisibility(nativeViewHomePage.nativeViewFilterNavigator);
		MiscUtils.sleep(6000);
		nativeViewHomePage.nativeViewFilterNavigator.sendKeys("RASopathy");
		MiscUtils.sleep(1000);

		// click on RASopathy Survey
		CommonUtils.waitForVisibility(charmsNativeViewPage.nativeViewRasSurveyRASopathySurveysModule);
		charmsNativeViewPage.nativeViewRasSurveyRASopathySurveysModule.click();

		// below code switches to frame
		CommonUtils.waitForVisibility(charmsNativeViewPage.nativeViewRasSurveyRASopathySurveyIframe);
		CommonUtils.switchToFrame(charmsNativeViewPage.nativeViewRasSurveyRASopathySurveyIframe);
		MiscUtils.sleep(1000);

		// click on Test Record Button
		CommonUtils.waitForVisibility(charmsNativeViewPage.nativeViewRasSurveyTestRecordPreviewButton);
		charmsNativeViewPage.nativeViewRasSurveyTestRecordPreviewButton.click();
		MiscUtils.sleep(1000);
		CucumberLogUtils.logScreenShot();

		// Open Automated Test Record
		CommonUtils.waitForVisibility(charmsNativeViewPage.nativeViewRasSurveyOpenRecordButton);
		charmsNativeViewPage.nativeViewRasSurveyOpenRecordButton.click();

		// Verifying basic participant information
		MiscUtils.sleep(1500);
		CommonUtils.waitForVisibility(charmsNativeViewPage.nativeViewRasSurveyParticipantNameTextBox);

		CommonUtils.assertEquals("Automated Test",
				charmsNativeViewPage.nativeViewRasSurveyParticipantNameTextBox.getAttribute("value"));

		CommonUtils.assertEquals("RASopathy",
				charmsNativeViewPage.nativeViewRasSurveyStudyTextBox.getAttribute("value"));

		CommonUtils.assertEquals("SELECTED",
				charmsNativeViewPage.nativeViewRasSurveyEligibilityStatusField.getAttribute("selected"));

		CommonUtils.assertEquals("SELECTED",
				charmsNativeViewPage.nativeViewRasSurveyEnrollmentStatusField.getAttribute("selected"));

		// ------- DEMOGRAPHICS SECTION DATA VERIFICATION --------
		// Clicking the Demographics tab
		JavascriptUtils.scrollIntoView(charmsNativeViewPage.nativeViewRasSurveyDemographicsTab);
		charmsNativeViewPage.nativeViewRasSurveyDemographicsTab.click();

		// Verifying Yes Participant is "Included in published case report or in a
		// different public manner" drop down
		CommonUtils.assertEquals("Yes",
				charmsNativeViewPage.nativeViewRasSurveyIncludedInPublishedCaseReportOrInADifferentPublicMannerDropDown
						.getText());

		// Verifying "Additional information about authors, publication year or
		// PubMedID" text box
		CommonUtils.assertEquals("SELF SUBMISSION TEST FLOW - PUBLISHED IN ANOTHER CANCER STUDY",
				charmsNativeViewPage.nativeViewRasSurveyAdditionalInformationAboutAuthorsPublicationYearOrPubMedIDTextBox
						.getText());

		// Verifying "Biological mother birth location" text box
		CommonUtils.assertEquals("LOS ANGELES",
				charmsNativeViewPage.nativeViewRasSurveyBiologicalMotherBirthLocationTextBox.getAttribute("value"));

		// Verifying "Biological mother age at birth" text box
		CommonUtils.assertEquals("23",
				charmsNativeViewPage.nativeViewRasSurveyBiologicalMotherAgeAtBirthTextBox.getAttribute("value"));

		// Verifying "Biological father birth location" text box
		CommonUtils.assertEquals("PUERTO VALLARTA",
				charmsNativeViewPage.nativeViewRasSurveyBiologicalFatherBirthLocationTextBox.getAttribute("value"));

		// Verifying "Biological father age at birth" text box
		CommonUtils.assertEquals("26",
				charmsNativeViewPage.nativeViewRasSurveyBiologicalFatherAgeAtBirthTextBox.getAttribute("value"));

		// Verifying "Biological mothers height (cm)" textbox
		CommonUtils.assertEquals("150",
				charmsNativeViewPage.nativeViewRasSurveyBiologicalMotherHeightTextBox.getAttribute("value"));

		// Verifying "Biological fathers height (cm)" textbox
		CommonUtils.assertEquals("180",
				charmsNativeViewPage.nativeViewRasSurveyBiologicalFatherHeightTextBox.getAttribute("value"));

		// ------- BIRTH AND GESTATION TAB ----------------
		// Clicking the Birth And Gestation tab
		JavascriptUtils.scrollIntoView(charmsNativeViewPage.nativeViewRasSurveyBirthAndGestationTab);
		charmsNativeViewPage.nativeViewRasSurveyBirthAndGestationTab.click();

		// Verifying Participant clicks YES "Were you diagnosed with hypoglycemia (low
		// blood sugar) during the newborn period."
		CommonUtils.assertEquals("Yes",
				charmsNativeViewPage.nativeViewRasSurveyWereYouDiagnosedWithHypoglycemiaLowBloodSugarDuringTheNewbornPeriodDropDown
						.getText());

		// Verifying Participant selects All that apply and enters text "Issues
		// identified in the participant prior to birth/Were you diagnosed with any of
		// the following conditions during your mothers pregnancy?"
		CommonUtils.assertEquals("Extra fluid in the neck area (nuchal edema), "
				+ "Extra fluid in the lung area (pleural edema), "
				+ "Extra fluid in the abdomen (ascites), "
				+ "Extra fluid in more than one body area (hydrops), "
				+ "Too much fluid in the amniotic sac (polyhydramnios), Heart issue, Other",
				charmsNativeViewPage.nativeViewRasSurveyIssuesIdentifiedInTheParticipantPriorToBirthTextArea.getText());
		CommonUtils.assertEquals("ABNORMAL BONE STRUCTURE",
				charmsNativeViewPage.nativeViewRasSurveyIssuesIdentifiedInTheParticipantPriorToBirthPleaseSpecifyTextBox
						.getAttribute("value"));

		// Verifying Participant clicks YES "During her pregnancy with you, did your
		// mother have any prenatal tests to identify fetal birth defects or fetal
		// medical problems?"
		CommonUtils.assertEquals("Yes",
				charmsNativeViewPage.nativeViewRasSurveyDidBiologicalMotherReceivePrenatalTestsForBirthDefectsMedicalProblemsDropDown
						.getText());

		// Verifying participant selects all birth complications
		CommonUtils.assertEquals("Polyhydramnios (excess amniotic fluid), "
				+ "Proteinuria (excess protein in urine), Gestational diabetes (Diabetes that developed during pregnancy and then went away), "
				+ "Diabetes mellitus (Diabetes that developed before the pregnancy), "
				+ "Spotting/bleeding, Gestational hypertension (high blood pressure during pregnancy), "
				+ "Hypertension (high blood pressure prior to pregnancy), "
				+ "Infection (please specify), Rash (please specify), Other complications (please specify)",
				charmsNativeViewPage.nativeViewRasSurveyParticipantmothersbirthcomplications.getText());

		// Verifying participants birth mother's complication Infection text box
		CommonUtils.assertEquals("FLU",
				charmsNativeViewPage.nativeViewRasSurveymotherscomplicationinfectiontextbox.getAttribute("value"));

		// Verifying participants birth mother's complication Rash text box
		CommonUtils.assertEquals("ECZEMA",
				charmsNativeViewPage.nativeViewRasSurveyMothersComplicationRashTextbox.getAttribute("value"));

		// Verifying participants birth mother's other complication text box
		CommonUtils.assertEquals("STREP THROAT",
				charmsNativeViewPage.nativeViewRasSurveyMothersOtherComplicationTextbox.getAttribute("value"));

		// Verifying YES to "participant mother taking medication while pregnant"
		// dropdown
		CommonUtils.assertEquals("Yes",
				charmsNativeViewPage.nativeViewRasSurveyWereMedicationsTakenWhileBioMotherPregnant.getText());

		// Verifying YES to "Did your biological mother use any tobacco products during
		// her pregnancy with you?" dropdown
		CommonUtils.assertEquals("Yes",
				charmsNativeViewPage.natiViewRasSurveyDidBioMotherUseTobaccoDuringPregnancy.getText());

		// Verifying Participant selects all for Tobacco products used by mother during
		// pregnancy
		CommonUtils.assertEquals("Cigarettes, Cigars, Pipes, Snuff, Chewing tobacco, Other (please specify)",
				charmsNativeViewPage.nativeViewRasSurveyTobaccoProductsUsedByMother.getText());

		// Verifying Participants Please Specify Other Text Box
		CommonUtils.assertEquals("WAX",
				charmsNativeViewPage.nativeViewRasSurveyPleaseSpecifytextbox.getAttribute("value"));

		// Verifying YES to vaping products use by participants bio mom during pregnancy
		// dropdown
		CommonUtils.assertEquals("Yes",
				charmsNativeViewPage.nativeViewRasSurveyVapingProductsUsedByMotherDuringPregnacyDropDown.getText());

		// Verifying Participant Selects Apply All to Vaping Products used
		CommonUtils.assertEquals("Electronic cigarettes, Cig-a-likes, Minis, Vape pens, "
				+ "Mid-sized e-hookah, Mechanical modified nicotine delivery systems (MODs), "
				+ "Vape MODs/personal vaporizer, Electronic hookah, Juul, Other (please specify)",
				charmsNativeViewPage.nativeViewRasSurveyVapingProductsUsed.getText());

		// Verifying ELECTONIC CIGAR for Please Specify Other Vaping Products Used Text
		// Box
		CommonUtils.assertEquals("ELECTRONIC CIGARS",
				charmsNativeViewPage.nativeViewRasSurveyPleaseSpecifyOtherVapingProductTextBox.getAttribute("value"));

		// Verifying Participant selects YES to Did Mother Use Alcohol Use DropDown

		/**
		 * EXAMPLE OF ASSERTION *
		 */
		CommonUtils.assertEquals("Yes",
				charmsNativeViewPage.nativeViewRasSurveyDidMotherDrinkAlcoholDuringPregnancyDropDown.getText());

		// Verifying Participant Selects ALL for Alcohol Used By Mother
		CommonUtils.assertEquals("Wine, Beer, Hard liquor, Liqueurs, Others (please specify)",
				charmsNativeViewPage.nativeViewRasSurveyAlcoholUsedByMotherDuringPregnancy.getText());

		// Verifying Participant Other Alcohol Please Specify Text Box
		CommonUtils.assertEquals("ABSINTHE",
				charmsNativeViewPage.nativeViewRasSurveyOtherAlcoholPleaseSpecifyTextbox.getAttribute("value"));

		// Verifying Participant Did Mother Use Recreational Drugs Drop Down
		CommonUtils.assertEquals("Yes",
				charmsNativeViewPage.nativeViewRasSurveyDidMotherUseRecreationalDrugsDropdown.getText());

		// Verifying Participant Drugs used by biological mother during pregnancy
		CommonUtils.assertEquals("Cannabis (marijuana, weed, pot), Heroin, Cocaine, Ectasy, Amphetamines, "
				+ "Barbiturate/benzodiazepines, LSD (acid), Opium, Psychedelic mushrooms, Solvents, Other (please specify)",
				charmsNativeViewPage.nativeViewRasSurveyDrugsUsedByBioMotherSelection.getText());

		// Verifying HASH for Participant Mother's Other Drugs Used Please Specify Text
		// box
		CommonUtils.assertEquals("HASH",
				charmsNativeViewPage.nativeViewRasSurveyOtherDrugsUsedByMotherPleaseSPecifyTextBox
						.getAttribute("value"));

		// Verifying Participant Biological Mothers Occupation While pregnant with the
		// participant Text Area
		CommonUtils.assertEquals("TEACHER",
				charmsNativeViewPage.nativeViewRasSurveyMothersOccupationWhilePregnantTextArea.getText());

		// Verifying Participant Father's Occupation While Mother Pregnant With
		// Participant Text Area
		CommonUtils.assertEquals("DIRECTOR",
				charmsNativeViewPage.nativeViewRasSurveyFatherOccupationWhileMotherPregnantWithParticipantTextArea
						.getText());

		// Verifying Did the participants mother ever live/work in a place where others
		// use tobacco
		CommonUtils.assertEquals("Yes",
				charmsNativeViewPage.nativeViewRasSurveyDidParticipantMotherLiveWhereTobaccoDropDown.getText());

		// Verifying Tobacco Products Used Around Mother During Pregnancy
		CommonUtils.assertEquals("Yes",
				charmsNativeViewPage.nativeVIewRasSurveyTobaccoProductsUsedAroundMotherDuringPregnancyDropDown
						.getText());

		// Verifying Other Please Specify Tobacco Products Used Around Mother During
		// Pregancy textbox
		CommonUtils.assertEquals("JUUL",
				charmsNativeViewPage.nativeViewRasSurveyOtherTobaccoUsedAroundMotherDuringPregPleaseSpecifyTextArea
						.getAttribute("value"));

		// ------------------ GROWTH SECTION TAB--------------------

		charmsNativeViewPage.nativeViewRasSurveyGrowthTab.click();

		// Verifying Participant click YES for "Has The Participant Had Growth Hormone
		// Testing" dropdown
		CommonUtils.assertEquals("Yes",
				charmsNativeViewPage.nativeViewRasSurveyGrowthHasTheParticipantHadGrowthHormoneTestingDropDown
						.getText());
		// Has the participant ever been evaluated by an endocrinologist for any reason?
		// DropDown
		CommonUtils.assertEquals("Yes",
				charmsNativeViewPage.nativeViewRasSurveyGrowthHasTheParticipantEverBeenEvaledByAnEndrocrinologistDropDown
						.getText());

		// Verifying Participant Medical Provider name is Doctor Geraldine TZU
		CommonUtils.assertEquals("DOCTOR GERALDINE TZU",
				charmsNativeViewPage.nativeViewRasSurveyGrowthDoctorMedicalProviderNameTextBox.getAttribute("value"));

		// Verifying Participant Medical location is Ashburn VA, United States
		CommonUtils.assertEquals("ASHBURN, VA, UNITED STATES",
				charmsNativeViewPage.nativeViewRasSurveyGrowthDoctorMedicalProviderLocationTextBox
						.getAttribute("value"));

		// Verifying Participant Doctor Medical Provider Hospital or Health System
		// Affiliation is INOVA
		CommonUtils.assertEquals("INOVA",
				charmsNativeViewPage.nativeViewRasSurveyGrowthDoctorMedicalProviderHospitalOrHealthSystemAffiliationTextBox
						.getAttribute("value"));

		// Verifying Participant selects all that apply and enters other text for
		// "Growth Hormone Results"
		CommonUtils.assertEquals("Normal growth hormone levels, "
				+ "Growth hormone deficiency - insufficient production of growth hormone from pituitary gland, "
				+ "Neurosecretory dysfunction - insufficient release (secretion) of growth hormone from the pituitary gland, Other (please specify)",
				charmsNativeViewPage.nativeViewRasSurveyGrowthHormoneResultsTextArea.getText());
		charmsNativeViewPage.nativeViewRasSurveyGrowthHormoneResultsTextAreaPleaseSpecifyTextBox.getText()
				.contains("ADRENALINE OR EPINEPHRINE");

		// Verifying Participant selects YES to "Has the participant received growth
		// hormone treatment?"
		CommonUtils.assertEquals("Yes",
				charmsNativeViewPage.nativeViewRasSurveyHasParticipantReceivedGrowthHormoneTreatmentDropDown.getText());

		// Verifying Participant Height before starting growth hormone text box
		CommonUtils.assertEquals("5.5 Feet",
				charmsNativeViewPage.nativeViewRasSurveyHeightbeforestartinggrowthhormonetextbox.getAttribute("value"));

		// Verifying Particiapant How Many Times they Received Growth HormoneTreatment
		// Dropdown
		CommonUtils.assertEquals("3",
				charmsNativeViewPage.nativeViewRasSurveyHowManyTimeshastheParticipantReceivedGrowthHormoneTreatmentDropdown
						.getText());

		// ---------------- DEVELOPMENT TAB --------------------
		charmsNativeViewPage.nativeViewRasSurveyDevelopmentTab.click();

		// Verifying Was the participant diagnosed with hypotonia as an infant or child?
		// DropDown
		CommonUtils.assertEquals("Yes",
				charmsNativeViewPage.nativeViewRasSurveyparticipantDiagnosedWithHypotoniaAsAnInfantOrChildDropDown
						.getText());

		// Verifying At what age was the participant able to sit without support
		// DropDown
		CommonUtils.assertEquals("12 - 18 months",
				charmsNativeViewPage.nativeViewRasSurveyAgeAbleToSitWithoutSupportDropdown.getText());

		// Verifying At What age was the participant able to Walk without support
		// DropDown
		CommonUtils.assertEquals("12 - 18 months",
				charmsNativeViewPage.nativeViewRasSurveyAgeAbletoWalkWithoutSupportDropdown.getText());

		// Verifying If Partipant Had Physical Therapy DropDown
		CommonUtils.assertEquals("Yes",
				charmsNativeViewPage.nativeViewRasSUrveyReceivedReceivedPhysicalTherapyDropDown.getText());

		// Verifying Age of Participant Using Two Word Phrases DropDown
		CommonUtils.assertEquals("24 - 36 months",
				charmsNativeViewPage.nativeViewRasSurveyAgeAbleUseSimpleTwoWordDropdown.getText());

		// Verifying Current Speech Capabilities DropDown
		CommonUtils.assertEquals("Simple speech compared to other people the same age",
				charmsNativeViewPage.nativeVIewRasSurveyCurrentSpeechCapabilitiesDropDown.getText());

		// Verifying If Participant Ever Received Speech Therapy DropDown
		CommonUtils.assertEquals("Yes",
				charmsNativeViewPage.nativeViewRasSurveyEverReceivedSpeechTherapyDropDown.getText());

		// Verifying Cognitive Development Issues Between 3 & 6 DropDown
		CommonUtils.assertEquals("Severe cognitive delay",
				charmsNativeViewPage.nativeViewRasSurveyCognitiveDevIssuesBetweenThreeAndSixDropDown.getText());

		// Verifying If Participant Received Occupational Therapy Between 3 & 6 DropDown
		CommonUtils.assertEquals("Yes",
				charmsNativeViewPage.nativeViewRasSurveyReceiveOccupationalTherapyBetween3And6DropDown.getText());

		// Verifying Schooling between the ages of 6 and 10 DropDown
		CommonUtils.assertEquals("Attended typical elementary school without support",
				charmsNativeViewPage.nativeViewRasSurveySchoolingBetweenSixAndTenDropDown.getText());

		// Verifying Schooling Between The Ages of 10 to 17 DropDown
		CommonUtils.assertEquals("Attended typical classroom with no or minor support",
				charmsNativeViewPage.nativeViewRasSurveySchoolingAge10To17Dropdown.getText());

		// Verifying Current Emp Status DropDown
		CommonUtils.assertEquals("Working full time",
				charmsNativeViewPage.nativeViewRasSurveyCurrenEmpStatusDropdown.getText());

		// Verifying Participants diagnosed learning differences
		CommonUtils.assertEquals(
				"Short attention span - includes attention deficit disorder (ADD) and attention deficit hyperactivity diosrder (ADHD), "
						+ "Dyslexia/legasthenie - difficulty with language skills, particularly reading, due to problems relating speech sounds to letters and words, Dyscalculia - difficulty with math skills and understanding numbers and arithmetic, Other (please specify)",
				charmsNativeViewPage.nativeViewRasSurveyDiagnosedLearningDifferencesTextArea.getText());

		// Verifying Please Specify Other Diagnose Learning Textbox
		CommonUtils.assertEquals("DYSGRAPHIA",
				charmsNativeViewPage.nativeViewRasSurveyDiagnoseOtherTextBox.getAttribute("value"));

		// Verifying Other Emp Status
		CommonUtils.assertEquals("", charmsNativeViewPage.nativeViewRasSurveyOtherEmpStatusTextbox.getText());

		// Verifying Participants highest level of schooling Dropdown
		CommonUtils.assertEquals("Bachelor's degree (4-year college with BA, BS, AB, BBA)",
				charmsNativeViewPage.nativeViewRasSurveyHighestLevelOfSchoolingDropdown.getText());

		// ------- BREATHING VERIFICATION --------
		{
			// Navitgate to Breathing Tab
			charmsNativeViewPage.nativeViewRasSurveyBreathingTab.click();

			// Verifying Participant selects Yes to "Has the participant ever been evaluated
			// by a pulmonologist?"
			CommonUtils.assertEquals("Yes",
					charmsNativeViewPage.nativeViewRasSurveyHasTheParticipantBeenEvaledByPulmonologistDropDown
							.getText());

			// Verifying Participant Pulmonologist name
			CommonUtils.assertEquals("DOCTOR LEE VOSS",
					charmsNativeViewPage.nativeViewRasSurveyPulmonologsitNameTextBox.getAttribute("value"));

			// Verifying Participant Pulmonologist location
			CommonUtils.assertEquals("MONROVIA, MD, USA",
					charmsNativeViewPage.nativeViewRasSurveyPulmonologsitLocationTextBox.getAttribute("value"));

			// Verifying Participant Pulmonologist affiliation
			CommonUtils.assertEquals("HOLLYCROSS",
					charmsNativeViewPage.nativeViewRasSurveyPulmonologsitAffiliationTextBox.getAttribute("value"));

			// Verifying Participant selects Yes to "Has the participant had wheezing or
			// whistling in the chest?"
			CommonUtils.assertEquals("Yes",
					charmsNativeViewPage.nativeViewRasSurveyHasTheParticipantBeenEvaledByPulmonologistDropDown
							.getText());

			// Verifying Participant selects Yes to "Has the participant been in the
			// emergency room for a breathing problem?"
			CommonUtils.assertEquals("Yes",
					charmsNativeViewPage.nativeViewRasSurveyHasTheParticipantBeenToTheEmergencyRoomForBreathingProblemsDropDown
							.getText());

			// Verifying Participant selects Yes to "Has a doctor diagnosed the participant
			// with reactive airway disease or asthma?"
			CommonUtils.assertEquals("Yes",
					charmsNativeViewPage.nativeViewRasSurveyHasADoctorDiagnosedParticipantWithReactiveAirwayDiseaseOrAsthmaDropDown
							.getText());

			// Verifying Participant selects Yes to "Has the participant been admitted to
			// the hospital for a breathing problem?"
			CommonUtils.assertEquals("Yes",
					charmsNativeViewPage.nativeViewRasSurveyHasADoctorDiagnosedParticipantWithReactiveAirwayDiseaseOrAsthmaDropDown
							.getText());
		}

		// ------- MOUTH/DENTAL VERIFICATION --------
		{
			// Navitgate to Mouth/Dental Tab
			charmsNativeViewPage.nativeViewRasSurveyMouth_DentalTab.click();

			// Verify - Does the participant receive regular dental care? -- dropdown
			CommonUtils.assertEquals("Yes",
					charmsNativeViewPage.nativeViewRasSurveyDoesTheParticipantRecieveRegularDentalCareDropDown
							.getText());

			// Verify - When did the participant last visit a dentist -- text box
			CommonUtils.assertEquals("12/21/2012",
					charmsNativeViewPage.nativeViewRasSurveyNameTextBox.getAttribute("value"));

			// Verify - Name of dentist -- text box
			CommonUtils.assertEquals("DOCTOR DEAN ROY",
					charmsNativeViewPage.nativeViewRasSurveyDentistNameTextBox.getAttribute("value"));

			// Verify - Dentist location -- text box
			CommonUtils.assertEquals("ARLINGTON, VA",
					charmsNativeViewPage.nativeViewRasSurveyDentistLocationTextBox.getAttribute("value"));

			// Verify - Dentist affiliation -- text box
			CommonUtils.assertEquals("INOVA",
					charmsNativeViewPage.nativeViewRasSurveyDentistAffiliationTextBox.getAttribute("value"));

			// Verify - Main reason for last dental visit -- dropdown
			CommonUtils.assertEquals("Cleaning",
					charmsNativeViewPage.nativeViewRasSurveyMainReasonForLastDentalVisitDropDown.getText());

			// Verify - Does the participant's gums bleed easily with tooth brushing now? --
			// dropdown
			CommonUtils.assertEquals("Yes",
					charmsNativeViewPage.nativeViewRasSurveyDoesTheParticipantGumsBleedEasilyWithToothBrushingDropDown
							.getText());

			// Verify - Does the participants teeth or gums hurt? -- dropdown
			CommonUtils.assertEquals("Yes",
					charmsNativeViewPage.nativeViewRasSurveyDoesTheParticipantsTeethOrGumsHurtDropDown.getText());

			// Verify - Does the participant have periodontal or gum disease? -- dropdown
			CommonUtils.assertEquals("Yes", charmsNativeViewPage.nativeViewRasSurveyGumDiseaseDropDown.getText());

			// Verify - Has the participant had dental sealants placed? -- dropdown
			CommonUtils.assertEquals("Yes", charmsNativeViewPage.nativeViewRasSurveDentalSealantsyDropDown.getText());

			// Verify - Does the participant have cavities now? -- dropdown
			CommonUtils.assertEquals("Yes", charmsNativeViewPage.nativeViewRasSurveCavitiesyDropDown.getText());

			// Verify - Has the participant had any dental filings? -- dropdown
			CommonUtils.assertEquals("Yes", charmsNativeViewPage.nativeViewRasSurveyDentalFilingsDropDown.getText());

			// Verify - How would the participant rate their hygiene routine -- dropdown
			CommonUtils.assertEquals("Fair", charmsNativeViewPage.nativeViewRasSurveyHygienRatingDropDown.getText());

			// Verify - Does the participants mouth usually feel dry? -- dropdown
			CommonUtils.assertEquals("Yes", charmsNativeViewPage.nativeViewRasSurveyDryMouthDropDown.getText());

			// Verify - How would the participant rate their teeth and gums -- dropdown
			CommonUtils.assertEquals("Fair", charmsNativeViewPage.nativeViewRasSurveyTeethGumsRatingDropDown.getText());

			// Verify - Has the participant had any changes in their sense of smell? --
			// dropdown
			CommonUtils.assertEquals("Yes", charmsNativeViewPage.nativeViewRasSurveySenseOfSmellDropDown.getText());

			// Verify - Has the participant had any changes in your sense of taste? --
			// dropdown
			CommonUtils.assertEquals("Yes", charmsNativeViewPage.nativeViewRasSurveySenseOfTasteDropDown.getText());

			// Verify - Does the participant have jaw or temporomandibular joint paint --
			// dropdown
			CommonUtils.assertEquals("Yes",
					charmsNativeViewPage.nativeViewRasSurveyTemporomandibularJointPaintDropDown.getText());

			// Verify - Does the participant have frequent headaches? -- dropdown
			CommonUtils.assertEquals("Yes",
					charmsNativeViewPage.nativeViewRasSurveyFrequentHeadachesDropDown.getText());

			// Verify - Has the participant had orthodonic treatment? -- dropdown
			CommonUtils.assertEquals("Yes", charmsNativeViewPage.nativeViewRasSurveyOrthoTreatmentDropDown.getText());

			// Verify - Has the participant had any facial or dental trauma? -- dropdown
			CommonUtils.assertEquals("Yes",
					charmsNativeViewPage.nativeViewRasSurveyFacialDentalTraumaDropDown.getText());

			// Verify - Did the participant have palatal expansion? -- dropdown
			CommonUtils.assertEquals("Yes", charmsNativeViewPage.nativeViewRasSurveyPalatalExpansionDropDown.getText());

			// Verify - Did the participant have dental surgery? -- dropdown
			CommonUtils.assertEquals("Yes", charmsNativeViewPage.nativeViewRasSurveyDentalSurgeryDropDown.getText());

			// Verify - Please specify(Dental Surgery) -- textbox
			CommonUtils.assertEquals("ROOT CANAL",
					charmsNativeViewPage.nativeViewRasSurveyPleaseSpecifyDentalSurgeryTextBox.getAttribute("value"));

			// Verify - Has the participant had elective jaw surgery -- dropdown
			CommonUtils.assertEquals("Yes", charmsNativeViewPage.nativeViewRasSurveyJawSurgeryDropDown.getText());

			// Verify - History of cancer in the mouth or jaw -- dropdown
			CommonUtils.assertEquals("Yes", charmsNativeViewPage.nativeViewRasSurveyCancerOfMouthDropDown.getText());

			// Verify - Please specify(Cancer in the mouth or jaw) -- textbox
			CommonUtils.assertEquals("SQUAMOUS CELL CARCINOMA",
					charmsNativeViewPage.nativeViewRasSurveyPleaseSpecifyMouthCancerTextBox.getAttribute("value"));

			// Verify - Does the participant have a family member with a syndrome or a jaw
			// abnormality -- dropdown
			CommonUtils.assertEquals("Yes",
					charmsNativeViewPage.nativeViewRasSurveyRelativeWithJawAbnormalityDropDown.getText());

			// Verify - Please specify(Jaw syndrome or abnormality) -- textbox
			CommonUtils.assertEquals("SMALL UPPER JAW",
					charmsNativeViewPage.nativeViewRasSurveyPleaseSpecifyJawAbnormalityTextBox.getAttribute("value"));

			// Verify - Does the participant have any numbness in or around the mouth --
			// dropdown
			CommonUtils.assertEquals("Yes", charmsNativeViewPage.nativeViewRasSurveyMouthNumbnessDropDown.getText());

			// Verify - Does the participant have any mouth sores? -- dropdown
			CommonUtils.assertEquals("Yes", charmsNativeViewPage.nativeViewRasSurveyMouthSoresDropDown.getText());

			// Verify - Do the participant's teeth feel sensitive to hot or cold food? --
			// dropdown
			CommonUtils.assertEquals("Yes",
					charmsNativeViewPage.nativeViewRasSurveyHotColdTeethSensitivityDropDown.getText());

			// Verify - Does the participant have problems moving their lips, tongue, or
			// mouth? -- dropdown
			CommonUtils.assertEquals("Yes",
					charmsNativeViewPage.nativeViewRasProblemsMovingMouthSurveyDropDown.getText());

			// Verify - Had trouble pronouncing words because of problems with teeth/mouth
			// -- dropdown
			CommonUtils.assertEquals("Occasionally",
					charmsNativeViewPage.nativeViewRasTroublePronouncingWordsSurveyDropDown.getText());

			// Verify - Is anything unusual about the participant's teeth or mouth --
			// dropdown
			CommonUtils.assertEquals("Yes",
					charmsNativeViewPage.nativeViewRasSurveyUnusualTeethMouthDropDown.getText());

			// Verify - Please specify(Unusual about teeth or mouth) -- textbox
			CommonUtils.assertEquals("EXTRA TEETH",
					charmsNativeViewPage.nativeViewRasSurveyPleaseSpecifyTeethMouthTextBox.getAttribute("value"));

			// Verify - Has the participant had painful aching in thier mouth -- dropdown
			CommonUtils.assertEquals("Occasionally",
					charmsNativeViewPage.nativeViewRasPainfulAchingInMouthSurveyDropDown.getText());

			// Verify - Has the participant been self-concious because of their teeth/mouth
			// -- dropdown
			CommonUtils.assertEquals("Occasionally",
					charmsNativeViewPage.nativeViewSelfCounciousTeethRasSurvey.getText());

			// Verify - Worsened sense of taste because of problems with teeth/mouth --
			// dropdown
			CommonUtils.assertEquals("Occasionally",
					charmsNativeViewPage.nativeViewRasWorsenedSenseOfTasteSurveyDropDown.getText());

			// Verify - Uncomfortable eating any foods with their teeth/mouth -- dropdown
			CommonUtils.assertEquals("Occasionally",
					charmsNativeViewPage.nativeViewUncomfortableEatingFoodsRasSurvey.getText());

			// Verify - Has the participant felt tense because of problems with teeth/mouth
			// -- dropdown
			CommonUtils.assertEquals("Occasionally",
					charmsNativeViewPage.nativeViewRasTenseTeethMouthSurveyDropDown.getText());

			// Verify - Unsatisfactory diet because of problems with teeth/mouth -- dropdown
			CommonUtils.assertEquals("Occasionally",
					charmsNativeViewPage.nativeViewDietTeethMouthRasSurveyDropDown.getText());

			// Verify - Has the participant interrupted meals because of problems with
			// teeth/mouth -- dropdown
			CommonUtils.assertEquals("Occasionally",
					charmsNativeViewPage.nativeViewInterruptedMealsRasSurveyDropDown.getText());

			// Verify - Has the participant found it difficult to relax due to problems with
			// teeth/mouth -- dropdown
			CommonUtils.assertEquals("Occasionally",
					charmsNativeViewPage.nativeViewRasDifficultToRelaxSurveyDropDown.getText());

			// Verify - Has the participant been a bit embarrased because of teeth/mouth --
			// dropdown
			CommonUtils.assertEquals("Occasionally",
					charmsNativeViewPage.nativeViewRasEmbarrasedTeethMouthSurveyDropDown.getText());

			// Verify - Irritable with others people because of problems with teeth/mouth --
			// dropdown
			CommonUtils.assertEquals("Occasionally",
					charmsNativeViewPage.nativeViewRasIrritableWithOthersSurveyDropDown.getText());

			// Verify - Difficulty doing usual jobs because of problems with teeth/mouth --
			// dropdown
			CommonUtils.assertEquals("Occasionally",
					charmsNativeViewPage.nativeViewRasDifficultyDoingUsualJobsSurveyDropDown.getText());

			// Verify - Has the participant felt life was less satisfying due to their
			// teeth/mouth -- dropdown
			CommonUtils.assertEquals("Occasionally",
					charmsNativeViewPage.nativeViewRasLifeLessSatisfyingSurveyDropDown.getText());

			// Verify - Has the participant been totally unable to funciton because of
			// teeth/m -- dropdown **** Mention wording
			CommonUtils.assertEquals("Occasionally",
					charmsNativeViewPage.nativeViewRasSurveyUnableToFunctionDropDown.getText());
		}
		// ------- HEMATOLOGY, ONCOLOGY AND IMMUNOLOGY --------
		{
			// Hematology, Oncology and Immunology -- span
			charmsNativeViewPage.nativeViewRasSurveyHematologyOncologyAndImmunologyTab.click();

			// Verifying Participant selects Yes to "Has the participant ever had an
			// evaluation by a hematologist or oncologist?" -- dropdown
			CommonUtils.assertEquals("Yes",
					charmsNativeViewPage.nativeViewRasSurveyHasTheParticipantEverHadAnEvaledByAHematologistOrOncologistDropDown
							.getText());

			// Verifying Participant Name of hematologist/oncologist -- textbox
			CommonUtils.assertEquals("DOCTOR LILY KING",
					charmsNativeViewPage.nativeViewRasSurveyNameOfHematologist_OncologistTextBox.getAttribute("value"));

			// Verifying Participant Location of hematologist/oncologist -- textbox
			CommonUtils.assertEquals("ARLINGTON, VA",
					charmsNativeViewPage.nativeViewRasSurveyLocationOfHematologist_OncologistTextBox
							.getAttribute("value"));

			// Verifying Participant Hematologist/Oncologist medical affiliation -- textbox
			CommonUtils.assertEquals("INOVA",
					charmsNativeViewPage.nativeViewRasSurveyHematologist_OncologistMedicalAffiliationTextBox
							.getAttribute("value"));

			// Verifying Participant selects Yes to "Does the participant have any issues
			// with bleeding or bruising?" -- dropdown
			CommonUtils.assertEquals("Yes",
					charmsNativeViewPage.nativeViewRasSurveyDoesTheParticipantHaveIssuesWithBleedingOrBruisingDropDown
							.getText());

			// Verifying Participant selects Yes to "Does the participant have a history of
			// frequent infections?" -- dropdown
			CommonUtils.assertEquals("Yes",
					charmsNativeViewPage.nativeViewRasSurveyDoesTheParticipantHaveAHistoryOfFrequentInfectionsDropDown
							.getText());

			// Verifying Participant selects Yes to "Has the participant been diagnosed with
			// an autoimmune disorder?" -- dropdown
			CommonUtils.assertEquals("Yes",
					charmsNativeViewPage.nativeViewRasSurveyHasTheParticipantBeenDiagnosedWithAnAutoimmuneDisorderDropDown
							.getText());

			// Verifying Participant selects Yes to "Does the participant have any known
			// blood disorders or symptoms such disorders?" -- dropdown ***Mention Wording
			// of question
			CommonUtils.assertEquals("Yes",
					charmsNativeViewPage.nativeViewRasSurveyDoesTheParticipantHaveAnyKnownBloodDisordersOrSymptomsDropDown
							.getText());

			// Verifying Participant selects Yes to "Has the participant been evaluated by
			// an immunologist or rheumatologist?" -- dropdown
			CommonUtils.assertEquals("Yes",
					charmsNativeViewPage.nativeViewRasSurveyHasTheParticipantBeenEvaledByAnImmunologistOrRheumatologistDropDown
							.getText());
		}

		// ------- Brain & Neurology --------
		{
			// Navitgate to Brain & Neurology Tab -- span
			charmsNativeViewPage.nativeViewRasSurveyBrainAndNeurologyTab.click();

			// Verifying Participant selects Yes to "Has the participant ever been evaluated
			// by a neurologist or neurosurgeon?" -- dropdown
			CommonUtils.assertEquals("Yes",
					charmsNativeViewPage.nativeViewRasSurveyHasTheParticipantEverBeenEvaledByANeurologistOrNeurosurgeonDropDown
							.getText());

			// Verifying Participant Name of neurologist -- textbox
			CommonUtils.assertEquals("DOCTOR JENNIFER LOPEZ",
					charmsNativeViewPage.nativeViewRasSurveyNameOfNeurologistTextBox.getAttribute("value"));

			// Verifying Participant Location of neurologist -- textbox
			CommonUtils.assertEquals("MAIMI, FL",
					charmsNativeViewPage.nativeViewRasSurveyLocationOfNeurologistTextBox.getAttribute("value"));

			// Verifying Participant Neurologist affiliation -- textbox
			CommonUtils.assertEquals("MERCY HOSPITAL",
					charmsNativeViewPage.nativeViewRasSurveyNeurologistAffiliationTextBox.getAttribute("value"));

			// Verifying Participant selects Yes to "Has the participant ever been diagnosed
			// with a structural brain abnormality?" -- dropdown
			CommonUtils.assertEquals("Yes",
					charmsNativeViewPage.nativeViewRasSurveyHasTheParticipantBeenDiagnosdWithAStructuralBrainAbnormalityDropDown
							.getText());

			// Verifying Participant selects Yes to "Evaluated by a psychiatrist,
			// psychologist or behavioral pediatrician?" -- dropdown
			CommonUtils.assertEquals("Yes",
					charmsNativeViewPage.nativeViewRasSurveyEvaluatedByAPsychiatristPsychologistOrBehavioralPediatricianDropDown
							.getText());

			// Verifying Participant selects Yes to "Does the participant have a history
			// seizures?" -- dropdown ***Mention Wording of question
			CommonUtils.assertEquals("Yes",
					charmsNativeViewPage.nativeViewRasSurveyDoesTheParticipantHaveAHistorySeizuresDropDown.getText());

			// Verifying Participant selects Yes to "Has the participant been diagnosed with
			// a behavioral or psychiatric condition?" -- dropdown
			CommonUtils.assertEquals("Yes",
					charmsNativeViewPage.nativeViewRasSurveyHasTheParticipantBeenDiagnosedWIthABehavioralOrPsychiatricConditionDropDown
							.getText());

			// Verifying Participant Name of physician -- textbox
			CommonUtils.assertEquals("DOCTOR BRAD PITT",
					charmsNativeViewPage.nativeViewRasSurveyNameOfPhysicianTextBox.getAttribute("value"));

			// Verifying Participant Location of physician -- textbox
			CommonUtils.assertEquals("WASHINGTON, DC",
					charmsNativeViewPage.nativeViewRasSurveyLocationOfPhysicianTextBox.getAttribute("value"));

			// Verifying Participant Psychiatrist affiliation -- textbox
			CommonUtils.assertEquals("G.W. HOSPITAL",
					charmsNativeViewPage.nativeViewRasSurveyPsychiatristAffiliationTextBox.getAttribute("value"));

			// Verifying Participant Psychiatrist affiliation -- textbox
			CommonUtils.assertEquals("", charmsNativeViewPage.nativeViewRasSurveyAdditionalNeurologicalConditionsTextBox
					.getAttribute("value"));
		}

		// ---------VISION/HEARING SECTION
		{
			// Navitgate to Vision/Hearing Tab -- span
			charmsNativeViewPage.nativeViewRasSurveyVision_HearingTab.click();

			// Verifying Participant selects Yes to "Diagnosed with ptosis" -- dropdown
			CommonUtils.assertEquals("Yes",
					charmsNativeViewPage.nativeViewRasSurveyDiagnosedWithPtosisDropDown.getText());

			// Verifying Participant selects Yes to "Did the ptosis require treatment?" --
			// dropdown
			CommonUtils.assertEquals("Yes",
					charmsNativeViewPage.nativeViewRasSurveyDidThePtosisRequireTreatmentDropDown.getText());

			// Verifying Participant selects Yes to "Participant experienced hearing loss"
			// -- dropdown
			CommonUtils.assertEquals("Yes",
					charmsNativeViewPage.nativeViewRasSurveyParticipantExperiencedHearingLosssDropDown.getText());

			// Verifying Participant selects Yes to "Issues with vision or eyesight" --
			// dropdown
			CommonUtils.assertEquals("Yes",
					charmsNativeViewPage.nativeViewRasSurveyIssuesWithVisionOrEyeSightDropDown.getText());

			// Verifying Participant selects Yes to "Participant experienced strabismus" --
			// dropdown
			CommonUtils.assertEquals("Yes",
					charmsNativeViewPage.nativeViewRasSurveyParticipantExperiencedStrabismusDropDown.getText());

			// Verifying Participant selects Yes to "Participant experienced nystagmus" --
			// dropdown
			CommonUtils.assertEquals("Yes",
					charmsNativeViewPage.nativeViewRasSurveyParticipantExperiencedNystagmusDropDown.getText());

			// Verifying Participant Participant ear issues -- paragraph
			CommonUtils.assertEquals("Excessive earwax, Chronic or recurrent ear infection, Other",
					charmsNativeViewPage.nativeViewRasSurveyParticipantEarIsssuesPTag.getText());

			// Verifying Participant Participant ear issues, Please specify -- textbox
			CommonUtils.assertEquals("INNER EAR INFECTION",
					charmsNativeViewPage.nativeViewRasSurveyPleaseSpecifyEarIssuesTextBox.getAttribute("value"));
		}

		// ------- HEART SECTION DATA VERIFICATION --------
		charmsNativeViewPage.nativeViewRasSurveyHeartTab.click();

		// Verifying Participant selects Yes to "Has the participant been evaluated by a
		// cardiologist?" Drop down
		CommonUtils.assertEquals("Yes",
				charmsNativeViewPage.nativeViewRasSurveyHasTheParticipantBeenEvaluatedByACardiologistDropDown
						.getText());

		// Verifying Participant Name of Cardiologist Text Box
		CommonUtils.assertEquals("DOCTOR RUSS JUNIOR",
				charmsNativeViewPage.nativeViewRasSurveyNameOfTheCardiologistTextBox.getAttribute("value"));

		// Verifying Location (City, State, Country) Text Box
		CommonUtils.assertEquals("WASHINGTON DC, USA",
				charmsNativeViewPage.nativeViewRasSurveyHeartTabLocationCityStateCountryTextBox.getAttribute("value"));

		// Verifying Hospital Or Health Center Affiliation Text Box
		CommonUtils.assertEquals("G.W. HOSPITAL",
				charmsNativeViewPage.nativeViewRasSurveyHospitalOrHealthCenterAffiliationTextBox
						.getAttribute("value"));

		// Verifying Participant selects Yes to "Has the participant received treatment
		// for heart problems?" Drop Down
		CommonUtils.assertEquals("Yes",
				charmsNativeViewPage.nativeViewRasSurveyHasTheParticicpantRecievedTreatmentForHearProblemsDropDown
						.getText());

		// Verifying Participant selects None to "Has the participant been diagnosed
		// with a functional heart issue?" Drop Down
		CommonUtils.assertEquals("Yes",
				charmsNativeViewPage.nativeViewRasSurveyHasTheParticipantBeenDiagnosedWithAFuncitonalHeartIssueDropDown
						.getText());

		// Verifying Participant selects Yes to "Has the participant been diagnosed with
		// structural heart issues?" Drop Down
		CommonUtils.assertEquals("Yes",
				charmsNativeViewPage.nativeViewRasSurveyHasTheParticipantBeenDIagnosedWithStructuralHeartIssuesDropDown
						.getText());

		// Verifying Particpants diagnosed structural heart issues Text Area
		CommonUtils.assertEquals(
				"Pulmonary valve stenosis or pulmonary valve dysplasia (PVS/PS) - these are conditions where the valve that allows blood to flow from your heart to your lungs does not fully open or is structurally abnormal, Hypertrophic cardiomyopathy (HCM) - when the heart muscle becomes abnormally thick, Atrial septal defect (ASD) - a hole in the wall of the heart that separates the upper chambers (atria), Ventricular septal defect (VSD) - a hole in the wall of the heart that separates the lower, or main pumping, chambers (ventricles) of the heart, Mitral/tricuspid valve anomalies - when the valves between the chambers of the heart do not open or close properly, Other (please specify)",
				charmsNativeViewPage.nativeViewRasSurveyParticipantsDiagnosedStructuralHeartIssuesTextArea.getText());

		// Verifying Please Specifiy Text Box
		CommonUtils.assertEquals("GIANT HEART",
				charmsNativeViewPage.nativeViewRasSurveyDiagnosedStructuralHeartIssuesPleaseSpecifiyTextBox
						.getAttribute("value"));

		// ------- MEDICAL HISTORY SECTION DATA VERIFICATION --------
		charmsNativeViewPage.nativeViewRasSurveyMedicalHistoryTab.click();

		// Verifying Participant selects Yes to Does the participant have a primary care
		// provider? Drop Down
		CommonUtils.assertEquals("Yes",
				charmsNativeViewPage.nativeViewRasSurveyDoesTheParticipantHaveAPrimaryCareProviderDropDown.getText());

		// Verifying Participant Name of primary care provider Text Box
		CommonUtils.assertEquals("DOCTOR GEORGE PEABODY",
				charmsNativeViewPage.nativeViewRasSurveyNameOfPrimaryCareProviderTextBox.getAttribute("value"));

		// Verifying Participant Location of primary care provider Text Box
		CommonUtils.assertEquals("FAIRFAX",
				charmsNativeViewPage.nativeViewRasSurveyLocationOfPrimaryCareProviderTextBox.getAttribute("value"));

		// Verifying Primary Care Provider Affiliation Text Box
		CommonUtils.assertEquals("INOVA",
				charmsNativeViewPage.nativeViewRasSurveyPrimaryCareProviderAffiliationTextBox.getAttribute("value"));

		// Verifying Participant selects Yes to "Has the participant ever had a biopsy?"
		// Drop Down
		CommonUtils.assertEquals("Yes",
				charmsNativeViewPage.nativeViewRasSurveyHasTheParticipantEverHadABiopsyDropDown.getText());

		// Verifying Participant selects Yes to "Is the participant allergic to any
		// medications" Drop Down
		CommonUtils.assertEquals("Yes",
				charmsNativeViewPage.nativeViewRasSurveyIsTheParticipantAllergicToAnyMedicationsDropDown.getText());

		// Verifying Participant selects Yes to "Have you ever been diagnosed with a
		// lymphatic system issue" Drop Down
		CommonUtils.assertEquals("Yes",
				charmsNativeViewPage.nativeViewRasSurveyHaveYouEverBeenDiagnosedWithALymphaticSystemIssueDropDown
						.getText());

		// Verifying Participant selects Yes to "Has the participant ever been evaluated
		// by a nephrologist?" Drop Down
		CommonUtils.assertEquals("Yes",
				charmsNativeViewPage.nativeViewRasSurveyHasTheParticipantEverBeenEvaluatedByANephrologistDropDown
						.getText());

		// Verifying Name of nephrologist Text Box
		CommonUtils.assertEquals("DOCTOR LAUREN RODNEY",
				charmsNativeViewPage.nativeViewRasSurveyNameOfNephrologistTextBox.getAttribute("value"));

		// Verifying Nephrologist Location Text Box
		CommonUtils.assertEquals("ARLINGTON, VA",
				charmsNativeViewPage.nativeViewRasSurveyNephrologistLocationTextBox.getAttribute("value"));

		// Veifying Nephrologist affiliation Text Box
		CommonUtils.assertEquals("INOVA",
				charmsNativeViewPage.nativeViewRasSurveyNephrologistAffilitionTextBox.getAttribute("value"));

		// Verifying Has the participant ever been diagnosed with a kidney problem Drop
		// Down
		CommonUtils.assertEquals("Yes",
				charmsNativeViewPage.nativeViewRasSurveyHasTheParticipantEverBeenDiagnosedWithAKidneyProblemDropDown
						.getText());

		// Verifying Hospitalized for any reason other than accidental injury or
		// childbirth Drop Down
		CommonUtils.assertEquals("Yes",
				charmsNativeViewPage.nativeViewRasSurveyHospitalizedForAnyReasonOtherThanAccidentalInjuryOrChildbirthDropDown
						.getText());

		// Verifying Is the participant allergic to any foods Drop Down
		CommonUtils.assertEquals("Yes",
				charmsNativeViewPage.nativeViewRasSurveyIsTheParticipantAllergicToAnyFoodsDropDown.getText());

		// Verifying Is the participant allergic to other things? Drop Down
		CommonUtils.assertEquals("Yes",
				charmsNativeViewPage.nativeViewRasSurveyIsTheParticipantAllergicToOtherThingsDropDown.getText());

		// Verifying Participant ear issues Text Area
		CommonUtils.assertEquals("Excessive earwax, Chronic or recurrent ear infection, Other",
				charmsNativeViewPage.nativeViewRasSurveyParticipantEarIssuesTextArea.getText());

		// --------FEEDING/NUTRITION/GAS DATA VERIFICATION----------------

		charmsNativeViewPage.nativeViewRasSurveyFeedingNutriGasTab.click();

		// Verifying If Patient Ever Been Seen by a GI Specialist - Dropdown
		CommonUtils.assertEquals("Yes", charmsNativeViewPage.nativeViewRasSurveyEverSeenGISpecialistDropdown.getText());

		// Verifying Has the participant had any symptoms that likely involved the GI
		// system- Dropdown
		CommonUtils.assertEquals("Yes", charmsNativeViewPage.nativeViewRasSurveySymptomsofGISystemDropdown.getText());

		// Verfying GI Specialist Name - Textbox
		CommonUtils.assertEquals("DOCTOR PHIL VOSS",
				charmsNativeViewPage.nativeViewRasSurveyGiSpecialistNameTextbox.getAttribute("value"));

		// Verfying GI Specialist City, State- Textbox
		CommonUtils.assertEquals("FAIRFAX, VA",
				charmsNativeViewPage.nativeViewRasSurveySpecialistCityStateTextbox.getAttribute("value"));

		// Verfying GI Specialist Hospital / Health Center Affiliation- Textbox
		CommonUtils.assertEquals("INOVA",
				charmsNativeViewPage.nativeViewRasSurveyHospitalAffiliationTextbox.getAttribute("value"));

		// Verfying Participant's diagnosed feeding difficulties - Textarea
		CommonUtils.assertEquals("Poor eater - declining food or unable to eat enough food for growth, "
				+ "Required feeding tube inserted in the nose to help with feeding, Required surgically placed feeding tube (in the stomach or small intestine) to help with feeding, "
				+ "Gastroparesis - delayed stomach emptying (when the stomach does not empty as quickly as it should), Other (please specify)",
				charmsNativeViewPage.nativeViewRasSurveyDiagnosedFeedingDifficultiesTextarea.getText());

		// Verfying Other Feeding Difficulties- Textbox
		CommonUtils.assertEquals("TROUBLE SWALLOWING",
				charmsNativeViewPage.nativeViewRasSurveyOtherFeedingDifficultiesTextBox.getAttribute("value"));

		// Verfying Age NJ/NG-tube was placed- Textbox
		CommonUtils.assertEquals("10 DAYS",
				charmsNativeViewPage.nativeViewRasSurveyAgeNJNGTubeTextbox.getAttribute("value"));

		// Verfying Age G/G-J tube was placed- Textbox
		CommonUtils.assertEquals("20 DAYS",
				charmsNativeViewPage.nativeViewRasSurveyAgeGGJTubeTextbox.getAttribute("value"));

		// Age gastronomy tube(G/G-J) removed- Textbox
		CommonUtils.assertEquals("30 DAYS",
				charmsNativeViewPage.nativeViewRasSurveyAgeGastroTubeRemovedTextbox.getAttribute("value"));

		// This step did not show up in Native View
		// All that apply Which of the following symptoms related to the GI system have
		// occurred?
		// CommonUtils.assertEquals("expected", charmsNativeViewPage.);

		// Veirfying if Participant is Toilet trained- Dropdown
		CommonUtils.assertEquals("Yes", charmsNativeViewPage.nativeViewRasSurveyToiletTrainedDropdown.getText());

		// Verifying Age successfully toilet trained- Textbox
		CommonUtils.assertEquals("2",
				charmsNativeViewPage.nativeViewRasSurveyAgeSuccesfullyToiletTrainedTextbox.getAttribute("value"));

		// Any episodes of repeated urine accidents after being toilet trained?-
		// Dropdown
		CommonUtils.assertEquals("Yes",
				charmsNativeViewPage.nativeViewRasSurveyEpisodesRepeatedUrineafterTrainedDropdown.getText());

		// Does the patient consistently use the toilet for all urination?- Dropdown
		CommonUtils.assertEquals("Yes",
				charmsNativeViewPage.nativeViewRasSurveyConsistentlyUseToiletUrinationDropdown.getText());

		// Does the patient consistently use the toilet for all bowel movements?-
		// Dropdown
		CommonUtils.assertEquals("Yes",
				charmsNativeViewPage.nativeViewRasSurveyToiletForAllBowelMovementDropdown.getText());

		// Any episodes of repeated bowel movement accidents after being toilet
		// trained?- Dropdown
		CommonUtils.assertEquals("Yes",
				charmsNativeViewPage.nativeViewRasSurveyRepeatedBowelAccidentsAfterTrainedDropdown.getText());

		// Pain with bowel movements- Dropdown
		CommonUtils.assertEquals("Yes", charmsNativeViewPage.nativeViewRasSurveyPainBowelMovementsDropdown.getText());

		// How many bowel movements do you have per week?- Textbox
		CommonUtils.assertEquals("2", charmsNativeViewPage.nativeViewRasSurveyBowelMovementsPerWeekDropDown.getText());

		// Bristol Stool Chart Type- Dropdown
		CommonUtils.assertEquals("Type 1", charmsNativeViewPage.nativeViewRasSurveyBristolStoolChartDropdown.getText());

		// Longest time without a bowel movement- Dropdown
		CommonUtils.assertEquals("2 days",
				charmsNativeViewPage.nativeViewRasSurveyLongestTimeWithoutBowelMovementDropdown.getText());

		// Has the participant had a procedure, test or study to evaluate their GI?-
		// Dropdown
		CommonUtils.assertEquals("Yes",
				charmsNativeViewPage.nativeViewRasSurveyProcedureToEvaluateGIDropdown.getText());

		// ------- HAIR & SKIN DATA VERIFICATION --------
		charmsNativeViewPage.nativeViewRasSurveyHairAndSkinTab.click();

		// Verifying Participant selects Yes to "Has participant been evaluated by a
		// dermatologist?" Drop Down
		CommonUtils.assertEquals("Yes",
				charmsNativeViewPage.nativeViewRasSurveyHasParticipantBeenEvaluatedByADermatologistDropDown.getText());

		// Verifying Name of dermatlogist Text Box
		CommonUtils.assertEquals("DOCTOR DERMA CLOONEY",
				charmsNativeViewPage.nativeViewRasSurveyNameOfDermatologistTextBox.getAttribute("value"));

		// Verifying City, State of dermatologist Text Box
		CommonUtils.assertEquals("WASHINGTON, DC",
				charmsNativeViewPage.nativeViewRasSurveyCityStateOfDermatologistTextBox.getAttribute("value"));

		// Verifying Hospital or Medical Center Affiliation of Dermatologist Text Box
		CommonUtils.assertEquals("G.W. HOSPITAL",
				charmsNativeViewPage.nativeViewRasSurveyHospitalOrMedicalCenterAffilitionOfDermatologistTextBox
						.getAttribute("value"));

		// Verifying Description of participant's hair Text Area
		CommonUtils.assertEquals(
				"Waveless, Wavy, Sparse/having too little hair, Fine, Curly/wooly, East to pluck, Other",
				charmsNativeViewPage.nativeViewRasSurveyDescriptionOfParticipantsHairTextArea.getText());

		// Verifying Other hair description Text Box
		CommonUtils.assertEquals("THICK HAIR",
				charmsNativeViewPage.nativeViewRasSurveyOtherHairDescriptionTextBox.getAttribute("value"));

		// Verifying Diagnosed skin issues Text Area
		CommonUtils.assertEquals(
				"Keratosis pilaris (patches of small, hard bumps often found on the upper arms. These look similar to goose bumps), Palmar/plantar hyperkeratosis (significant thickening of the skin on the palms of the hands or soles of the feet), Facial keratosis/Ulerythema ophryogenes (patches of dry, hard sandpaper-like bumps on the face, particularly in and near the eyebrows), Ichthyosis (dry, scaly skin), Other (please specify)",
				charmsNativeViewPage.nativeViewRasSurveyDiagnosedSkinIssuesTextArea.getText());

		// Verifying Other skin issues Text Box
		CommonUtils.assertEquals("VITILIGO",
				charmsNativeViewPage.nativeViewRasSurveyOtherSkinIssuesTextBox.getAttribute("value"));

		// Verifying Pigmented skin findings Text Area
		CommonUtils.assertEquals(
				"Three or more cafe-au-lait spots (light brown birthmarks the color of coffee with milk), Diffuse hyperpigmentation (patches of skin that are darker than the rest of your skin), Three or more nevi (small brown, tan, pink or red spots, also called moles), Three or more lentigines (dark, smooth/flat freckles or spots on the skin), Other (please specify)",
				charmsNativeViewPage.nativeViewRasSurveyPigmentedSkinFindingsTextArea.getText());

		// Verifying Other pigmented findings Text Box
		CommonUtils.assertEquals("ALBINISM",
				charmsNativeViewPage.nativeViewRasSurveyOtherPigmentedFindingsTextBox.getAttribute("value"));

		// Verifying Diagnosed skin tumors Text Area
		CommonUtils.assertEquals(
				"Granular cell tumor (soft tissue tumor, often benign, commonly located in the head and neck area and tongue), Melanoma, Dysplastic nevi, Papilloma (wart-like growths), Other (please specify)",
				charmsNativeViewPage.nativeViewRasSurveyDiagnosedSkinTumorsTextArea.getText());

		// Verifying Other skin tumors Text Box
		CommonUtils.assertEquals("BENIGN TUMOR",
				charmsNativeViewPage.nativeViewRasSurveyOtherSkinTumorsTextBox.getAttribute("value"));

		// Verifying Is the texture or amount of hair similar to a biological relatives?
		// Drop Down
		CommonUtils.assertEquals("Yes",
				charmsNativeViewPage.nativeViewRasSurveyIsTheTextureOrAmountOfHairSimilarToABiologicalRelativesDropDown
						.getText());

		// Verifying Does the participant have any hemangiomas? Drop Down
		CommonUtils.assertEquals("Three or more hemangiomas",
				charmsNativeViewPage.nativeViewRasSurveyDoesTheParticipantHaveAnyHemangiomasDropDown.getText());

		// ------- SKELETAL DATA VERIFICATION --------
		charmsNativeViewPage.nativeViewRasSurveySkeletalTab.click();

		// Verifying Participant selects Yes to "Has the participant been evaluated by
		// an orthopaedic surgeon?" Drop Down
		CommonUtils.assertEquals("Yes",
				charmsNativeViewPage.nativeViewRasSurveyHasTheParticipantBeenEvaluatedByAnOrthopaedicSurgeonDropDown
						.getText());

		// Verifying Name of orthopaedic surgeon Text Box
		CommonUtils.assertEquals("DOCTOR BASHIR ZIKRIA",
				charmsNativeViewPage.nativeViewRasSurveyNameOfOrthopaedicSurgeonTextBox.getAttribute("value"));

		// Verifying Location of Orthopaedic surgeon Text Box
		CommonUtils.assertEquals("BETHESDA, MD",
				charmsNativeViewPage.nativeViewRasSurveyLocationOfOrthopaedicSurgeonTextBox.getAttribute("value"));

		// Verifying Orthopaedic surgeons hospital or medical center affiliation Text
		// Box
		CommonUtils.assertEquals("JOHNS HOPKINS",
				charmsNativeViewPage.nativeVIewRasSurveyOrthopaedicSurgeonsHospitalOrMedicalCenterAffiliationTextBox
						.getAttribute("value"));

		// Verifying Diagnosed skeletal findings Text Area Check if assertion error
		CommonUtils.assertEquals(
				"Pectus carinatum (breastbone sticks out from the chest), Pectus excavatum (breastbone appears sunken or caved into the chest), Broad chest, nipples widely spaced, Other (please specify)",
				charmsNativeViewPage.nativeViewRasSurveyDiagnosedSkeletalFindingsTextArea.getText());

		// Verifying Other skeletal findings Text Box
		CommonUtils.assertEquals("RICKETS",
				charmsNativeViewPage.nativeViewRasSurveyOtherSkeletalFindingsTextBox.getAttribute("value"));

		// Verifying Participant selects Yes to "Does the participant have any issues
		// with curving of the spine" Drop Down
		CommonUtils.assertEquals("Yes",
				charmsNativeViewPage.nativeViewRasSurveyDoesTheParticipantHaveAnyIssuesWithCurvingOfTheSpineDropDown
						.getText());

		// Verifying Participant selects Yes to "Has the participant's neck been
		// described as short or webbed?" Drop Down
		CommonUtils.assertEquals("Yes",
				charmsNativeViewPage.nativeViewRasSurveyHasTheParticipantsNeckBeenDescribedAsShortOrWebbedDropDown
						.getText());

		// Verifying Participant selects Yes to "Has the participant ever been diagnosed
		// with joint issues?" Drop Down
		CommonUtils.assertEquals("Yes",
				charmsNativeViewPage.nativeViewRasSurveyHasTheParticipantEverBeenDiagnosedWithJointIssuesDropDown
						.getText());

		// Asserts native view data table, Prenatal Test History, Medication Taken While
		// Pregnant, Growth Hormone Details, Heart Symptoms, Heart Treatments,
		// Participant Heart Issues
		rASSurveyStepsImpl.assertTable(charmsNativeViewPage.nativeViewRasSurveyTableTabs);

	}

	@Given("data verification")
	public void data_verification() throws TestingException, InvalidFormatException, IOException {

		// Logging into native view
		MiscUtils.sleep(1000);
		nativeViewLoginImpl.nativeViewLogin();
		CommonUtils.waitForVisibility(nativeViewHomePage.nativeViewFilterNavigator);
		MiscUtils.sleep(6000);
		nativeViewHomePage.nativeViewFilterNavigator.sendKeys("RASopathy");
		MiscUtils.sleep(1000);

		// click on RASopathy Survey
		CommonUtils.waitForVisibility(charmsNativeViewPage.nativeViewRasSurveyRASopathySurveysModule);
		charmsNativeViewPage.nativeViewRasSurveyRASopathySurveysModule.click();

		// below code switches to frame
		CommonUtils.waitForVisibility(charmsNativeViewPage.nativeViewRasSurveyRASopathySurveyIframe);
		CommonUtils.switchToFrame(charmsNativeViewPage.nativeViewRasSurveyRASopathySurveyIframe);
		MiscUtils.sleep(1000);

		// click on Test Record Button
		CommonUtils.waitForVisibility(charmsNativeViewPage.nativeViewRasSurveyTestRecordPreviewButton);
		charmsNativeViewPage.nativeViewRasSurveyTestRecordPreviewButton.click();
		MiscUtils.sleep(1000);
		CucumberLogUtils.logScreenShot();

		// Open Automated Test Record
		CommonUtils.waitForVisibility(charmsNativeViewPage.nativeViewRasSurveyOpenRecordButton);
		charmsNativeViewPage.nativeViewRasSurveyOpenRecordButton.click();

		// Verifying basic participant information
		MiscUtils.sleep(1500);
		CommonUtils.waitForVisibility(charmsNativeViewPage.nativeViewRasSurveyParticipantNameTextBox);

		CommonUtils.assertEquals("Automated Test",
				charmsNativeViewPage.nativeViewRasSurveyParticipantNameTextBox.getAttribute("value"));

		CommonUtils.assertEquals("RASopathy",
				charmsNativeViewPage.nativeViewRasSurveyStudyTextBox.getAttribute("value"));

		CommonUtils.assertEquals("SELECTED",
				charmsNativeViewPage.nativeViewRasSurveyEligibilityStatusField.getAttribute("selected"));

		CommonUtils.assertEquals("SELECTED",
				charmsNativeViewPage.nativeViewRasSurveyEnrollmentStatusField.getAttribute("selected"));

		// ------- DEMOGRAPHICS SECTION DATA VERIFICATION --------
		// Clicking the Demographics tab
		JavascriptUtils.scrollIntoView(charmsNativeViewPage.nativeViewRasSurveyDemographicsTab);
		charmsNativeViewPage.nativeViewRasSurveyDemographicsTab.click();

		// Verifying Yes Participant is "Included in published case report or in a
		// different public manner" drop down
		CommonUtils.assertEquals("Yes",
				charmsNativeViewPage.nativeViewRasSurveyIncludedInPublishedCaseReportOrInADifferentPublicMannerDropDown
						.getText());

		// Verifying "Additional information about authors, publication year or
		// PubMedID" text box
		CommonUtils.assertEquals("SELF SUBMISSION TEST FLOW - PUBLISHED IN ANOTHER CANCER STUDY",
				charmsNativeViewPage.nativeViewRasSurveyAdditionalInformationAboutAuthorsPublicationYearOrPubMedIDTextBox
						.getText());

		// Verifying "Biological mother birth location" text box
		CommonUtils.assertEquals("LOS ANGELES",
				charmsNativeViewPage.nativeViewRasSurveyBiologicalMotherBirthLocationTextBox.getAttribute("value"));

		// Verifying "Biological mother age at birth" text box
		CommonUtils.assertEquals("23",
				charmsNativeViewPage.nativeViewRasSurveyBiologicalMotherAgeAtBirthTextBox.getAttribute("value"));

		// Verifying "Biological father birth location" text box
		CommonUtils.assertEquals("PUERTO VALLARTA",
				charmsNativeViewPage.nativeViewRasSurveyBiologicalFatherBirthLocationTextBox.getAttribute("value"));

		// Verifying "Biological father age at birth" text box
		CommonUtils.assertEquals("26",
				charmsNativeViewPage.nativeViewRasSurveyBiologicalFatherAgeAtBirthTextBox.getAttribute("value"));

		// Verifying "Biological mothers height (cm)" textbox
		CommonUtils.assertEquals("150",
				charmsNativeViewPage.nativeViewRasSurveyBiologicalMotherHeightTextBox.getAttribute("value"));

		// Verifying "Biological mothers height (cm)" textbox
		CommonUtils.assertEquals("180",
				charmsNativeViewPage.nativeViewRasSurveyBiologicalFatherHeightTextBox.getAttribute("value"));

		// ------- BIRTH AND GESTATION TAB ----------------
		// Clicking the Birth And Gestation tab
		JavascriptUtils.scrollIntoView(charmsNativeViewPage.nativeViewRasSurveyBirthAndGestationTab);
		charmsNativeViewPage.nativeViewRasSurveyBirthAndGestationTab.click();

		// Verifying Participant clicks YES "Were you diagnosed with hypoglycemia (low
		// blood sugar) during the newborn period."
		CommonUtils.assertEquals("Yes",
				charmsNativeViewPage.nativeViewRasSurveyWereYouDiagnosedWithHypoglycemiaLowBloodSugarDuringTheNewbornPeriodDropDown
						.getText());

		// Verifying Participant selects All that apply and enters text "Issues
		// identified in the participant prior to birth/Were you diagnosed with any of
		// the following conditions during your mothers pregnancy?"
		CommonUtils.assertEquals("Extra fluid in the neck area (nuchal edema), "
				+ "Extra fluid in the lung area (pleural edema), "
				+ "Extra fluid in the abdomen (ascites), "
				+ "Extra fluid in more than one body area (hydrops), "
				+ "Too much fluid in the amniotic sac (polyhydramnios), Heart issue, Other",
				charmsNativeViewPage.nativeViewRasSurveyIssuesIdentifiedInTheParticipantPriorToBirthTextArea.getText());
		CommonUtils.assertEquals("ABNORMAL BONE STRUCTURE",
				charmsNativeViewPage.nativeViewRasSurveyIssuesIdentifiedInTheParticipantPriorToBirthPleaseSpecifyTextBox
						.getAttribute("value"));

		// Verifying Participant clicks YES "During her pregnancy with you, did your
		// mother have any prenatal tests to identify fetal birth defects or fetal
		// medical problems?"
		CommonUtils.assertEquals("Yes",
				charmsNativeViewPage.nativeViewRasSurveyDidBiologicalMotherReceivePrenatalTestsForBirthDefectsMedicalProblemsDropDown
						.getText());

		// Verifying participant selects all birth complications
		CommonUtils.assertEquals("Polyhydramnios (excess amniotic fluid), "
				+ "Proteinuria (excess protein in urine), Gestational diabetes (Diabetes that developed during pregnancy and then went away), "
				+ "Diabetes mellitus (Diabetes that developed before the pregnancy), "
				+ "Spotting/bleeding, Gestational hypertension (high blood pressure during pregnancy), "
				+ "Hypertension (high blood pressure prior to pregnancy), "
				+ "Infection (please specify), Rash (please specify), Other complications (please specify)",
				charmsNativeViewPage.nativeViewRasSurveyParticipantmothersbirthcomplications.getText());

		// Verifying participants birth mother's complication Infection text box
		CommonUtils.assertEquals("FLU",
				charmsNativeViewPage.nativeViewRasSurveymotherscomplicationinfectiontextbox.getAttribute("value"));

		// Verifying participants birth mother's complication Rash text box
		CommonUtils.assertEquals("ECZEMA",
				charmsNativeViewPage.nativeViewRasSurveyMothersComplicationRashTextbox.getAttribute("value"));

		// Verifying participants birth mother's other complication text box
		CommonUtils.assertEquals("STREP THROAT",
				charmsNativeViewPage.nativeViewRasSurveyMothersOtherComplicationTextbox.getAttribute("value"));

		// Verifying YES to "participant mother taking medication while pregnant"
		// dropdown
		CommonUtils.assertEquals("Yes",
				charmsNativeViewPage.nativeViewRasSurveyWereMedicationsTakenWhileBioMotherPregnant.getText());

		// Verifying YES to "Did your biological mother use any tobacco products during
		// her pregnancy with you?" dropdown
		CommonUtils.assertEquals("Yes",
				charmsNativeViewPage.natiViewRasSurveyDidBioMotherUseTobaccoDuringPregnancy.getText());

		// Verifying Participant selects all for Tobacco products used by mother during
		// pregnancy
		CommonUtils.assertEquals("Cigarettes, Cigars, Pipes, Snuff, Chewing tobacco, Other (please specify)",
				charmsNativeViewPage.nativeViewRasSurveyTobaccoProductsUsedByMother.getText());

		// Verifying Participants Please Specify Other Text Box
		CommonUtils.assertEquals("WAX",
				charmsNativeViewPage.nativeViewRasSurveyPleaseSpecifytextbox.getAttribute("value"));

		// Verifying YES to vaping products use by participants bio mom during pregnancy
		// dropdown
		CommonUtils.assertEquals("Yes",
				charmsNativeViewPage.nativeViewRasSurveyVapingProductsUsedByMotherDuringPregnacyDropDown.getText());

		// Verifying Participant Selects Apply All to Vaping Products used
		CommonUtils.assertEquals("Electronic cigarettes, Cig-a-likes, Minis, Vape pens, "
				+ "Mid-sized e-hookah, Mechanical modified nicotine delivery systems (MODs), "
				+ "Vape MODs/personal vaporizer, Electronic hookah, Juul, Other (please specify)",
				charmsNativeViewPage.nativeViewRasSurveyVapingProductsUsed.getText());

		// Verifying ELECTONIC CIGAR for Please Specify Other Vaping Products Used Text
		// Box
		CommonUtils.assertEquals("ELECTRONIC CIGARS",
				charmsNativeViewPage.nativeViewRasSurveyPleaseSpecifyOtherVapingProductTextBox.getAttribute("value"));

		// Verifying Participant selects YES to Did Mother Use Alcohol Use DropDown

		/**
		 * EXAMPLE OF ASSERTION *
		 */
		CommonUtils.assertEquals("Yes",
				charmsNativeViewPage.nativeViewRasSurveyDidMotherDrinkAlcoholDuringPregnancyDropDown.getText());

		// Verifying Participant Selects ALL for Alcohol Used By Mother
		CommonUtils.assertEquals("Wine, Beer, Hard liquor, Liqueurs, Others (please specify)",
				charmsNativeViewPage.nativeViewRasSurveyAlcoholUsedByMotherDuringPregnancy.getText());

		// Verifying Participant Other Alcohol Please Specify Text Box
		CommonUtils.assertEquals("ABSINTHE",
				charmsNativeViewPage.nativeViewRasSurveyOtherAlcoholPleaseSpecifyTextbox.getAttribute("value"));

		// Verifying Participant Did Mother Use Recreational Drugs Drop Down
		CommonUtils.assertEquals("Yes",
				charmsNativeViewPage.nativeViewRasSurveyDidMotherUseRecreationalDrugsDropdown.getText());

		// Verifying Participant Drugs used by biological mother during pregnancy
		CommonUtils.assertEquals("Cannabis (marijuana, weed, pot), Heroin, Cocaine, Ectasy, Amphetamines, "
				+ "Barbiturate/benzodiazepines, LSD (acid), Opium, Psychedelic mushrooms, Solvents, Other (please specify)",
				charmsNativeViewPage.nativeViewRasSurveyDrugsUsedByBioMotherSelection.getText());

		// Verifying HASH for Participant Mother's Other Drugs Used Please Specify Text
		// box
		CommonUtils.assertEquals("HASH",
				charmsNativeViewPage.nativeViewRasSurveyOtherDrugsUsedByMotherPleaseSPecifyTextBox
						.getAttribute("value"));

		// Verifying Participant Biological Mothers Occupation While pregnant with the
		// participant Text Area
		CommonUtils.assertEquals("TEACHER",
				charmsNativeViewPage.nativeViewRasSurveyMothersOccupationWhilePregnantTextArea.getText());

		// Verifying Participant Father's Occupation While Mother Pregnant With
		// Participant Text Area
		CommonUtils.assertEquals("DIRECTOR",
				charmsNativeViewPage.nativeViewRasSurveyFatherOccupationWhileMotherPregnantWithParticipantTextArea
						.getText());

		// Verifying Did the participants mother ever live/work in a place where others
		// use tobacco
		CommonUtils.assertEquals("Yes",
				charmsNativeViewPage.nativeViewRasSurveyDidParticipantMotherLiveWhereTobaccoDropDown.getText());

		// Verifying Tobacco Products Used Around Mother During Pregnancy
		CommonUtils.assertEquals("Cigarettes, Cigars, Pipes, Other (please specify)",
				charmsNativeViewPage.nativeVIewRasSurveyTobaccoProductsUsedAroundMotherDuringPregnancyDropDown
						.getText());

		// Verifying Other Please Specify Tobacco Products Used Around Mother During
		// Pregancy textbox
		CommonUtils.assertEquals("JUUL",
				charmsNativeViewPage.nativeViewRasSurveyOtherTobaccoUsedAroundMotherDuringPregPleaseSpecifyTextArea
						.getAttribute("value"));

		// ------------------ GROWTH SECTION TAB--------------------

		charmsNativeViewPage.nativeViewRasSurveyGrowthTab.click();

		// Verifying Participant click YES for "Has The Participant Had Growth Hormone
		// Testing" dropdown
		CommonUtils.assertEquals("Yes",
				charmsNativeViewPage.nativeViewRasSurveyGrowthHasTheParticipantHadGrowthHormoneTestingDropDown
						.getText());

		// Verifying Participant Has the participant ever been evaluated by an
		// endocrinologist for any reason? Dropdown
		CommonUtils.assertEquals("Yes",
				charmsNativeViewPage.nativeViewRasSurveyGrowthHasTheParticipantEverBeenEvaledByAnEndrocrinologistDropDown
						.getText());

		// Verifying Participant Medical Provider name is Doctor Geraldine TZU
		CommonUtils.assertEquals("DOCTOR GERALDINE TZU",
				charmsNativeViewPage.nativeViewRasSurveyGrowthDoctorMedicalProviderNameTextBox.getAttribute("value"));

		// Verifying Participant Medical location is Ashburn VA, United States
		CommonUtils.assertEquals("ASHBURN, VA, UNITED STATES",
				charmsNativeViewPage.nativeViewRasSurveyGrowthDoctorMedicalProviderLocationTextBox
						.getAttribute("value"));

		// Verifying Participant Doctor Medical Provider Hospital or Health System
		// Affiliation is INOVA
		CommonUtils.assertEquals("INOVA",
				charmsNativeViewPage.nativeViewRasSurveyGrowthDoctorMedicalProviderHospitalOrHealthSystemAffiliationTextBox
						.getAttribute("value"));

		// Verifying Participant selects all that apply and enters other text for
		// "Growth Hormone Results"
		CommonUtils.assertEquals("Normal growth hormone levels, "
				+ "Growth hormone deficiency - insufficient production of growth hormone from pituitary gland, "
				+ "Neurosecretory dysfunction - insufficient release (secretion) of growth hormone from the pituitary gland, Other (please specify)",
				charmsNativeViewPage.nativeViewRasSurveyGrowthHormoneResultsTextArea.getText());
		charmsNativeViewPage.nativeViewRasSurveyGrowthHormoneResultsTextAreaPleaseSpecifyTextBox.getText()
				.contains("ADRENALINE OR EPINEPHRINE");

		// Verifying Participant selects YES to "Has the participant received growth
		// hormone treatment?"
		CommonUtils.assertEquals("Yes",
				charmsNativeViewPage.nativeViewRasSurveyHasParticipantReceivedGrowthHormoneTreatmentDropDown.getText());

		// Verifying Participant Height before starting growth hormone text box
		CommonUtils.assertEquals("5.5 Feet",
				charmsNativeViewPage.nativeViewRasSurveyHeightbeforestartinggrowthhormonetextbox.getAttribute("value"));

		// Verifying Particiapant How Many Times they Received Growth HormoneTreatment
		// Dropdown
		CommonUtils.assertEquals("3",
				charmsNativeViewPage.nativeViewRasSurveyHowManyTimeshastheParticipantReceivedGrowthHormoneTreatmentDropdown
						.getText());

		// ---------------- DEVELOPMENT TAB --------------------
		charmsNativeViewPage.nativeViewRasSurveyDevelopmentTab.click();

		// Verifying Was the participant diagnosed with hypotonia as an infant or child?
		CommonUtils.assertEquals("Yes",
				charmsNativeViewPage.nativeViewRasSurveyparticipantDiagnosedWithHypotoniaAsAnInfantOrChildDropDown
						.getText());

		// Verifying At what age was the participant able to sit without support
		CommonUtils.assertEquals("12 - 18 months",
				charmsNativeViewPage.nativeViewRasSurveyAgeAbleToSitWithoutSupportDropdown.getText());

		// Verifying At What age was the participant able to Walk without support
		CommonUtils.assertEquals("12 - 18 months",
				charmsNativeViewPage.nativeViewRasSurveyAgeAbletoWalkWithoutSupportDropdown.getText());

		// Verifying If Partipant Had Physical Therapy
		CommonUtils.assertEquals("Yes",
				charmsNativeViewPage.nativeViewRasSUrveyReceivedReceivedPhysicalTherapyDropDown.getText());

		// Verifying Age of Participant Using Two Word Phrases
		CommonUtils.assertEquals("24 - 36 months",
				charmsNativeViewPage.nativeViewRasSurveyAgeAbleUseSimpleTwoWordDropdown.getText());

		// Verifying Current Speech Capabilities
		CommonUtils.assertEquals("Simple speech compared to other people the same age",
				charmsNativeViewPage.nativeVIewRasSurveyCurrentSpeechCapabilitiesDropDown.getText());

		// Verifying If Participant Ever Received Speech Therapy
		CommonUtils.assertEquals("Yes",
				charmsNativeViewPage.nativeViewRasSurveyEverReceivedSpeechTherapyDropDown.getText());

		// Verifying Cognitive Development Issues Between 3 & 6
		CommonUtils.assertEquals("Severe cognitive delay",
				charmsNativeViewPage.nativeViewRasSurveyCognitiveDevIssuesBetweenThreeAndSixDropDown.getText());

		// Verifying If Participant Received Occupational Therapy Between 3 & 6
		CommonUtils.assertEquals("Yes",
				charmsNativeViewPage.nativeViewRasSurveyReceiveOccupationalTherapyBetween3And6DropDown.getText());

		// Verifying Schooling between the ages of 6 and 10
		CommonUtils.assertEquals("Attended typical elementary school without support",
				charmsNativeViewPage.nativeViewRasSurveySchoolingBetweenSixAndTenDropDown.getText());

		// Verifying Schooling Between The Ages of 10 to 17
		CommonUtils.assertEquals("Attended typical classroom with no or minor support",
				charmsNativeViewPage.nativeViewRasSurveySchoolingAge10To17Dropdown.getText());

		// Verifying Current Emp Status
		CommonUtils.assertEquals("Working full time",
				charmsNativeViewPage.nativeViewRasSurveyCurrenEmpStatusDropdown.getText());

		// Verifying Participants diagnosed learning differences
		CommonUtils.assertEquals(
				"Short attention span - includes attention deficit disorder (ADD) and attention deficit hyperactivity diosrder (ADHD), "
						+ "Dyslexia/legasthenie - difficulty with language skills, particularly reading, due to problems relating speech sounds to letters and words, Dyscalculia - difficulty with math skills and understanding numbers and arithmetic, Other (please specify)",
				charmsNativeViewPage.nativeViewRasSurveyDiagnosedLearningDifferencesTextArea.getText());

		// Verifying Please Specify Other Diagnose Learning Textbox
		CommonUtils.assertEquals("DYSGRAPHIA",
				charmsNativeViewPage.nativeViewRasSurveyDiagnoseOtherTextBox.getAttribute("value"));

		// Verifying Other Emp Status
		CommonUtils.assertEquals("", charmsNativeViewPage.nativeViewRasSurveyOtherEmpStatusTextbox.getText());

		// Verifying Participants highest level of schooling Dropdown
		// CommonUtils.assertEquals("Bachelor's degree (4-year college with BA, BS, AB,
		// BBA)",
		// charmsNativeViewPage.nativeViewRasSurveyHighestLevelOfSchoolingDropdown.getText());

		// ------- BREATHING VERIFICATION --------
		{
			// Navitgate to Breathing Tab
			charmsNativeViewPage.nativeViewRasSurveyBreathingTab.click();

			// Verifying Participant selects Yes to "Has the participant ever been evaluated
			// by a pulmonologist?"
			CommonUtils.assertEquals("Yes",
					charmsNativeViewPage.nativeViewRasSurveyHasTheParticipantBeenEvaledByPulmonologistDropDown
							.getText());

			// Verifying Participant Pulmonologist name
			CommonUtils.assertEquals("DOCTOR LEE VOSS",
					charmsNativeViewPage.nativeViewRasSurveyPulmonologsitNameTextBox.getAttribute("value"));

			// Verifying Participant Pulmonologist location
			CommonUtils.assertEquals("MONROVIA, MD, USA",
					charmsNativeViewPage.nativeViewRasSurveyPulmonologsitLocationTextBox.getAttribute("value"));

			// Verifying Participant Pulmonologist affiliation
			CommonUtils.assertEquals("HOLLYCROSS",
					charmsNativeViewPage.nativeViewRasSurveyPulmonologsitAffiliationTextBox.getAttribute("value"));

			// Verifying Participant selects Yes to "Has the participant had wheezing or
			// whistling in the chest?"
			CommonUtils.assertEquals("Yes",
					charmsNativeViewPage.nativeViewRasSurveyHasTheParticipantBeenEvaledByPulmonologistDropDown
							.getText());

			// Verifying Participant selects Yes to "Has the participant been in the
			// emergency room for a breathing problem?"
			CommonUtils.assertEquals("Yes",
					charmsNativeViewPage.nativeViewRasSurveyHasTheParticipantBeenToTheEmergencyRoomForBreathingProblemsDropDown
							.getText());

			// Verifying Participant selects Yes to "Has a doctor diagnosed the participant
			// with reactive airway disease or asthma?"
			CommonUtils.assertEquals("Yes",
					charmsNativeViewPage.nativeViewRasSurveyHasADoctorDiagnosedParticipantWithReactiveAirwayDiseaseOrAsthmaDropDown
							.getText());

			// Verifying Participant selects Yes to "Has the participant been admitted to
			// the hospital for a breathing problem?"
			CommonUtils.assertEquals("Yes",
					charmsNativeViewPage.nativeViewRasSurveyHasADoctorDiagnosedParticipantWithReactiveAirwayDiseaseOrAsthmaDropDown
							.getText());
		}

		// ------- MOUTH/DENTAL VERIFICATION --------
		{
			// Navitgate to Mouth/Dental Tab
			charmsNativeViewPage.nativeViewRasSurveyMouth_DentalTab.click();

			// Verify - Does the participant receive regular dental care? -- dropdown
			CommonUtils.assertEquals("Yes",
					charmsNativeViewPage.nativeViewRasSurveyDoesTheParticipantRecieveRegularDentalCareDropDown
							.getText());

			// Verify - When did the participant last visit a dentist -- text box
			CommonUtils.assertEquals("12/21/2012",
					charmsNativeViewPage.nativeViewRasSurveyNameTextBox.getAttribute("value"));

			// Verify - Name of dentist -- text box
			CommonUtils.assertEquals("DOCTOR DEAN ROY",
					charmsNativeViewPage.nativeViewRasSurveyDentistNameTextBox.getAttribute("value"));

			// Verify - Dentist location -- text box
			CommonUtils.assertEquals("ARLINGTON, VA",
					charmsNativeViewPage.nativeViewRasSurveyDentistLocationTextBox.getAttribute("value"));

			// Verify - Dentist affiliation -- text box
			CommonUtils.assertEquals("INOVA",
					charmsNativeViewPage.nativeViewRasSurveyDentistAffiliationTextBox.getAttribute("value"));

			// Verify - Main reason for last dental visit -- dropdown
			CommonUtils.assertEquals("Cleaning",
					charmsNativeViewPage.nativeViewRasSurveyMainReasonForLastDentalVisitDropDown.getText());

			// Verify - Does the participant's gums bleed easily with tooth brushing now? --
			// dropdown
			CommonUtils.assertEquals("Yes",
					charmsNativeViewPage.nativeViewRasSurveyDoesTheParticipantGumsBleedEasilyWithToothBrushingDropDown
							.getText());

			// Verify - Does the participants teeth or gums hurt? -- dropdown
			CommonUtils.assertEquals("Yes",
					charmsNativeViewPage.nativeViewRasSurveyDoesTheParticipantsTeethOrGumsHurtDropDown.getText());

			// Verify - Does the participant have periodontal or gum disease? -- dropdown
			CommonUtils.assertEquals("Yes", charmsNativeViewPage.nativeViewRasSurveyGumDiseaseDropDown.getText());

			// Verify - Has the participant had dental sealants placed? -- dropdown
			CommonUtils.assertEquals("Yes", charmsNativeViewPage.nativeViewRasSurveDentalSealantsyDropDown.getText());

			// Verify - Does the participant have cavities now? -- dropdown
			CommonUtils.assertEquals("Yes", charmsNativeViewPage.nativeViewRasSurveCavitiesyDropDown.getText());

			// Verify - Has the participant had any dental filings? -- dropdown
			CommonUtils.assertEquals("Yes", charmsNativeViewPage.nativeViewRasSurveyDentalFilingsDropDown.getText());

			// Verify - How would the participant rate their hygiene routine -- dropdown
			CommonUtils.assertEquals("Fair", charmsNativeViewPage.nativeViewRasSurveyHygienRatingDropDown.getText());

			// Verify - Does the participants mouth usually feel dry? -- dropdown
			CommonUtils.assertEquals("Yes", charmsNativeViewPage.nativeViewRasSurveyDryMouthDropDown.getText());

			// Verify - How would the participant rate their teeth and gums -- dropdown
			CommonUtils.assertEquals("Fair", charmsNativeViewPage.nativeViewRasSurveyTeethGumsRatingDropDown.getText());

			// Verify - Has the participant had any changes in their sense of smell? --
			// dropdown
			CommonUtils.assertEquals("Yes", charmsNativeViewPage.nativeViewRasSurveySenseOfSmellDropDown.getText());

			// Verify - Has the participant had any changes in your sense of taste? --
			// dropdown
			CommonUtils.assertEquals("Yes", charmsNativeViewPage.nativeViewRasSurveySenseOfTasteDropDown.getText());

			// Verify - Does the participant have jaw or temporomandibular joint paint --
			// dropdown
			CommonUtils.assertEquals("Yes",
					charmsNativeViewPage.nativeViewRasSurveyTemporomandibularJointPaintDropDown.getText());

			// Verify - Does the participant have frequent headaches? -- dropdown
			CommonUtils.assertEquals("Yes",
					charmsNativeViewPage.nativeViewRasSurveyFrequentHeadachesDropDown.getText());

			// Verify - Has the participant had orthodonic treatment? -- dropdown
			CommonUtils.assertEquals("Yes", charmsNativeViewPage.nativeViewRasSurveyOrthoTreatmentDropDown.getText());

			// Verify - Has the participant had any facial or dental trauma? -- dropdown
			CommonUtils.assertEquals("Yes",
					charmsNativeViewPage.nativeViewRasSurveyFacialDentalTraumaDropDown.getText());

			// Verify - Did the participant have palatal expansion? -- dropdown
			CommonUtils.assertEquals("Yes", charmsNativeViewPage.nativeViewRasSurveyPalatalExpansionDropDown.getText());

			// Verify - Did the participant have dental surgery? -- dropdown
			CommonUtils.assertEquals("Yes", charmsNativeViewPage.nativeViewRasSurveyDentalSurgeryDropDown.getText());

			// Verify - Please specify(Dental Surgery) -- textbox
			CommonUtils.assertEquals("ROOT CANAL",
					charmsNativeViewPage.nativeViewRasSurveyPleaseSpecifyDentalSurgeryTextBox.getAttribute("value"));

			// Verify - Has the participant had elective jaw surgery -- dropdown
			CommonUtils.assertEquals("Yes", charmsNativeViewPage.nativeViewRasSurveyJawSurgeryDropDown.getText());

			// Verify - History of cancer in the mouth or jaw -- dropdown
			CommonUtils.assertEquals("Yes", charmsNativeViewPage.nativeViewRasSurveyCancerOfMouthDropDown.getText());

			// Verify - Please specify(Cancer in the mouth or jaw) -- textbox
			CommonUtils.assertEquals("SQUAMOUS CELL CARCINOMA",
					charmsNativeViewPage.nativeViewRasSurveyPleaseSpecifyMouthCancerTextBox.getAttribute("value"));

			// Verify - Does the participant have a family member with a syndrome or a jaw
			// abnormality -- dropdown
			CommonUtils.assertEquals("Yes",
					charmsNativeViewPage.nativeViewRasSurveyRelativeWithJawAbnormalityDropDown.getText());

			// Verify - Please specify(Jaw syndrome or abnormality) -- textbox
			CommonUtils.assertEquals("SMALL UPPER JAW",
					charmsNativeViewPage.nativeViewRasSurveyPleaseSpecifyJawAbnormalityTextBox.getAttribute("value"));

			// Verify - Does the participant have any numbness in or around the mouth --
			// dropdown
			CommonUtils.assertEquals("Yes", charmsNativeViewPage.nativeViewRasSurveyMouthNumbnessDropDown.getText());

			// Verify - Does the participant have any mouth sores? -- dropdown
			CommonUtils.assertEquals("Yes", charmsNativeViewPage.nativeViewRasSurveyMouthSoresDropDown.getText());

			// Verify - Do the participant's teeth feel sensitive to hot or cold food? --
			// dropdown
			CommonUtils.assertEquals("Yes",
					charmsNativeViewPage.nativeViewRasSurveyHotColdTeethSensitivityDropDown.getText());

			// Verify - Does the participant have problems moving their lips, tongue, or
			// mouth? -- dropdown
			CommonUtils.assertEquals("Yes",
					charmsNativeViewPage.nativeViewRasProblemsMovingMouthSurveyDropDown.getText());

			// Verify - Had trouble pronouncing words because of problems with teeth/mouth
			// -- dropdown
			CommonUtils.assertEquals("Occasionally",
					charmsNativeViewPage.nativeViewRasTroublePronouncingWordsSurveyDropDown.getText());

			// Verify - Is anything unusual about the participant's teeth or mouth --
			// dropdown
			CommonUtils.assertEquals("Yes",
					charmsNativeViewPage.nativeViewRasSurveyUnusualTeethMouthDropDown.getText());

			// Verify - Please specify(Unusual about teeth or mouth) -- textbox
			CommonUtils.assertEquals("EXTRA TEETH",
					charmsNativeViewPage.nativeViewRasSurveyPleaseSpecifyTeethMouthTextBox.getAttribute("value"));

			// Verify - Has the participant had painful aching in thier mouth -- dropdown
			CommonUtils.assertEquals("Occasionally",
					charmsNativeViewPage.nativeViewRasPainfulAchingInMouthSurveyDropDown.getText());

			// Verify - Has the participant been self-concious because of their teeth/mouth
			// -- dropdown
			CommonUtils.assertEquals("Occasionally",
					charmsNativeViewPage.nativeViewSelfCounciousTeethRasSurvey.getText());

			// Verify - Worsened sense of taste because of problems with teeth/mouth --
			// dropdown
			CommonUtils.assertEquals("Occasionally",
					charmsNativeViewPage.nativeViewRasWorsenedSenseOfTasteSurveyDropDown.getText());

			// Verify - Uncomfortable eating any foods with their teeth/mouth -- dropdown
			CommonUtils.assertEquals("Occasionally",
					charmsNativeViewPage.nativeViewUncomfortableEatingFoodsRasSurvey.getText());

			// Verify - Has the participant felt tense because of problems with teeth/mouth
			// -- dropdown
			CommonUtils.assertEquals("Occasionally",
					charmsNativeViewPage.nativeViewRasTenseTeethMouthSurveyDropDown.getText());

			// Verify - Unsatisfactory diet because of problems with teeth/mouth -- dropdown
			CommonUtils.assertEquals("Occasionally",
					charmsNativeViewPage.nativeViewDietTeethMouthRasSurveyDropDown.getText());

			// Verify - Has the participant interrupted meals because of problems with
			// teeth/mouth -- dropdown
			CommonUtils.assertEquals("Occasionally",
					charmsNativeViewPage.nativeViewInterruptedMealsRasSurveyDropDown.getText());

			// Verify - Has the participant found it difficult to relax due to problems with
			// teeth/mouth -- dropdown
			CommonUtils.assertEquals("Occasionally",
					charmsNativeViewPage.nativeViewRasDifficultToRelaxSurveyDropDown.getText());

			// Verify - Has the participant been a bit embarrased because of teeth/mouth --
			// dropdown
			CommonUtils.assertEquals("Occasionally",
					charmsNativeViewPage.nativeViewRasEmbarrasedTeethMouthSurveyDropDown.getText());

			// Verify - Irritable with others people because of problems with teeth/mouth --
			// dropdown
			CommonUtils.assertEquals("Occasionally",
					charmsNativeViewPage.nativeViewRasIrritableWithOthersSurveyDropDown.getText());

			// Verify - Difficulty doing usual jobs because of problems with teeth/mouth --
			// dropdown
			CommonUtils.assertEquals("Occasionally",
					charmsNativeViewPage.nativeViewRasDifficultyDoingUsualJobsSurveyDropDown.getText());

			// Verify - Has the participant felt life was less satisfying due to their
			// teeth/mouth -- dropdown
			CommonUtils.assertEquals("Occasionally",
					charmsNativeViewPage.nativeViewRasLifeLessSatisfyingSurveyDropDown.getText());

			// Verify - Has the participant been totally unable to funciton because of
			// teeth/m -- dropdown **** Mention wording
			CommonUtils.assertEquals("Occasionally",
					charmsNativeViewPage.nativeViewRasSurveyUnableToFunctionDropDown.getText());
		}
		// ------- HEMATOLOGY, ONCOLOGY AND IMMUNOLOGY --------
		{
			// Hematology, Oncology and Immunology -- span
			charmsNativeViewPage.nativeViewRasSurveyHematologyOncologyAndImmunologyTab.click();

			// Verifying Participant selects Yes to "Has the participant ever had an
			// evaluation by a hematologist or oncologist?" -- dropdown
			CommonUtils.assertEquals("Yes",
					charmsNativeViewPage.nativeViewRasSurveyHasTheParticipantEverHadAnEvaledByAHematologistOrOncologistDropDown
							.getText());

			// Verifying Participant Name of hematologist/oncologist -- textbox
			CommonUtils.assertEquals("DOCTOR LILY KING",
					charmsNativeViewPage.nativeViewRasSurveyNameOfHematologist_OncologistTextBox.getAttribute("value"));

			// Verifying Participant Location of hematologist/oncologist -- textbox
			CommonUtils.assertEquals("ARLINGTON, VA",
					charmsNativeViewPage.nativeViewRasSurveyLocationOfHematologist_OncologistTextBox
							.getAttribute("value"));

			// Verifying Participant Hematologist/Oncologist medical affiliation -- textbox
			CommonUtils.assertEquals("INOVA",
					charmsNativeViewPage.nativeViewRasSurveyHematologist_OncologistMedicalAffiliationTextBox
							.getAttribute("value"));

			// Verifying Participant selects Yes to "Does the participant have any issues
			// with bleeding or bruising?" -- dropdown
			CommonUtils.assertEquals("Yes",
					charmsNativeViewPage.nativeViewRasSurveyDoesTheParticipantHaveIssuesWithBleedingOrBruisingDropDown
							.getText());

			// Verifying Participant selects Yes to "Does the participant have a history of
			// frequent infections?" -- dropdown
			CommonUtils.assertEquals("Yes",
					charmsNativeViewPage.nativeViewRasSurveyDoesTheParticipantHaveAHistoryOfFrequentInfectionsDropDown
							.getText());

			// Verifying Participant selects Yes to "Has the participant been diagnosed with
			// an autoimmune disorder?" -- dropdown
			CommonUtils.assertEquals("Yes",
					charmsNativeViewPage.nativeViewRasSurveyHasTheParticipantBeenDiagnosedWithAnAutoimmuneDisorderDropDown
							.getText());

			// Verifying Participant selects Yes to "Does the participant have any known
			// blood disorders or symptoms such disorders?" -- dropdown ***Mention Wording
			// of question
			CommonUtils.assertEquals("Yes",
					charmsNativeViewPage.nativeViewRasSurveyDoesTheParticipantHaveAnyKnownBloodDisordersOrSymptomsDropDown
							.getText());

			// Verifying Participant selects Yes to "Has the participant been evaluated by
			// an immunologist or rheumatologist?" -- dropdown
			CommonUtils.assertEquals("Yes",
					charmsNativeViewPage.nativeViewRasSurveyHasTheParticipantBeenEvaledByAnImmunologistOrRheumatologistDropDown
							.getText());
		}

		// ------- Brain & Neurology --------
		{
			// Navitgate to Brain & Neurology Tab -- span
			charmsNativeViewPage.nativeViewRasSurveyBrainAndNeurologyTab.click();

			// Verifying Participant selects Yes to "Has the participant ever been evaluated
			// by a neurologist or neurosurgeon?" -- dropdown
			CommonUtils.assertEquals("Yes",
					charmsNativeViewPage.nativeViewRasSurveyHasTheParticipantEverBeenEvaledByANeurologistOrNeurosurgeonDropDown
							.getText());

			// Verifying Participant Name of neurologist -- textbox
			CommonUtils.assertEquals("DOCTOR JENNIFER LOPEZ",
					charmsNativeViewPage.nativeViewRasSurveyNameOfNeurologistTextBox.getAttribute("value"));

			// Verifying Participant Location of neurologist -- textbox
			CommonUtils.assertEquals("MAIMI, FL",
					charmsNativeViewPage.nativeViewRasSurveyLocationOfNeurologistTextBox.getAttribute("value"));

			// Verifying Participant Neurologist affiliation -- textbox
			CommonUtils.assertEquals("MERCY HOSPITAL",
					charmsNativeViewPage.nativeViewRasSurveyNeurologistAffiliationTextBox.getAttribute("value"));

			// Verifying Participant selects Yes to "Has the participant ever been diagnosed
			// with a structural brain abnormality?" -- dropdown
			CommonUtils.assertEquals("Yes",
					charmsNativeViewPage.nativeViewRasSurveyHasTheParticipantBeenDiagnosdWithAStructuralBrainAbnormalityDropDown
							.getText());

			// Verifying Participant selects Yes to "Evaluated by a psychiatrist,
			// psychologist or behavioral pediatrician?" -- dropdown
			CommonUtils.assertEquals("Yes",
					charmsNativeViewPage.nativeViewRasSurveyEvaluatedByAPsychiatristPsychologistOrBehavioralPediatricianDropDown
							.getText());

			// Verifying Participant selects Yes to "Does the participant have a history
			// seizures?" -- dropdown ***Mention Wording of question
			CommonUtils.assertEquals("Yes",
					charmsNativeViewPage.nativeViewRasSurveyDoesTheParticipantHaveAHistorySeizuresDropDown.getText());

			// Verifying Participant selects Yes to "Has the participant been diagnosed with
			// a behavioral or psychiatric condition?" -- dropdown
			CommonUtils.assertEquals("Yes",
					charmsNativeViewPage.nativeViewRasSurveyHasTheParticipantBeenDiagnosedWIthABehavioralOrPsychiatricConditionDropDown
							.getText());

			// Verifying Participant Name of physician -- textbox
			CommonUtils.assertEquals("DOCTOR BRAD PITT",
					charmsNativeViewPage.nativeViewRasSurveyNameOfPhysicianTextBox.getAttribute("value"));

			// Verifying Participant Location of physician -- textbox
			CommonUtils.assertEquals("WASHINGTON, DC",
					charmsNativeViewPage.nativeViewRasSurveyLocationOfPhysicianTextBox.getAttribute("value"));

			// Verifying Participant Psychiatrist affiliation -- textbox
			CommonUtils.assertEquals("G.W. HOSPITAL",
					charmsNativeViewPage.nativeViewRasSurveyPsychiatristAffiliationTextBox.getAttribute("value"));

			// Verifying Participant Psychiatrist affiliation -- textbox
			CommonUtils.assertEquals("", charmsNativeViewPage.nativeViewRasSurveyAdditionalNeurologicalConditionsTextBox
					.getAttribute("value"));
		}

		// ---------VISION/HEARING SECTION
		{
			// Navitgate to Vision/Hearing Tab -- span
			charmsNativeViewPage.nativeViewRasSurveyVision_HearingTab.click();

			// Verifying Participant selects Yes to "Diagnosed with ptosis" -- dropdown
			CommonUtils.assertEquals("Yes",
					charmsNativeViewPage.nativeViewRasSurveyDiagnosedWithPtosisDropDown.getText());

			// Verifying Participant selects Yes to "Did the ptosis require treatment?" --
			// dropdown
			CommonUtils.assertEquals("Yes",
					charmsNativeViewPage.nativeViewRasSurveyDidThePtosisRequireTreatmentDropDown.getText());

			// Verifying Participant selects Yes to "Participant experienced hearing loss"
			// -- dropdown
			CommonUtils.assertEquals("Yes",
					charmsNativeViewPage.nativeViewRasSurveyParticipantExperiencedHearingLosssDropDown.getText());

			// Verifying Participant selects Yes to "Issues with vision or eyesight" --
			// dropdown
			CommonUtils.assertEquals("Yes",
					charmsNativeViewPage.nativeViewRasSurveyIssuesWithVisionOrEyeSightDropDown.getText());

			// Verifying Participant selects Yes to "Participant experienced strabismus" --
			// dropdown
			CommonUtils.assertEquals("Yes",
					charmsNativeViewPage.nativeViewRasSurveyParticipantExperiencedStrabismusDropDown.getText());

			// Verifying Participant selects Yes to "Participant experienced nystagmus" --
			// dropdown
			CommonUtils.assertEquals("Yes",
					charmsNativeViewPage.nativeViewRasSurveyParticipantExperiencedNystagmusDropDown.getText());

			// Verifying Participant Participant ear issues -- paragraph
			CommonUtils.assertEquals("Excessive earwax, Chronic or recurrent ear infection, Other",
					charmsNativeViewPage.nativeViewRasSurveyParticipantEarIsssuesPTag.getText());

			// Verifying Participant Participant ear issues, Please specify -- textbox
			CommonUtils.assertEquals("INNER EAR INFECTION",
					charmsNativeViewPage.nativeViewRasSurveyPleaseSpecifyEarIssuesTextBox.getAttribute("value"));
		}

		// ------- HEART SECTION DATA VERIFICATION --------
		charmsNativeViewPage.nativeViewRasSurveyHeartTab.click();

		// Verifying Participant selects Yes to "Has the participant been evaluated by a
		// cardiologist?" Drop down
		CommonUtils.assertEquals("Yes",
				charmsNativeViewPage.nativeViewRasSurveyHasTheParticipantBeenEvaluatedByACardiologistDropDown
						.getText());

		// Verifying Participant Name of Cardiologist Text Box
		CommonUtils.assertEquals("DOCTOR RUSS JUNIOR",
				charmsNativeViewPage.nativeViewRasSurveyNameOfTheCardiologistTextBox.getAttribute("value"));

		// Verifying Location (City, State, Country) Text Box
		CommonUtils.assertEquals("WASHINGTON DC, USA",
				charmsNativeViewPage.nativeViewRasSurveyHeartTabLocationCityStateCountryTextBox.getAttribute("value"));

		// Verifying Hospital Or Health Center Affiliation Text Box
		CommonUtils.assertEquals("G.W. HOSPITAL",
				charmsNativeViewPage.nativeViewRasSurveyHospitalOrHealthCenterAffiliationTextBox
						.getAttribute("value"));

		// Verifying Participant selects Yes to "Has the participant received treatment
		// for heart problems?" Drop Down
		CommonUtils.assertEquals("Yes",
				charmsNativeViewPage.nativeViewRasSurveyHasTheParticicpantRecievedTreatmentForHearProblemsDropDown
						.getText());

		// Verifying Participant selects None to "Has the participant been diagnosed
		// with a functional heart issue?" Drop Down
		CommonUtils.assertEquals("Yes",
				charmsNativeViewPage.nativeViewRasSurveyHasTheParticipantBeenDiagnosedWithAFuncitonalHeartIssueDropDown
						.getText());

		// Verifying Participant selects Yes to "Has the participant been diagnosed with
		// structural heart issues?" Drop Down
		CommonUtils.assertEquals("Yes",
				charmsNativeViewPage.nativeViewRasSurveyHasTheParticipantBeenDIagnosedWithStructuralHeartIssuesDropDown
						.getText());

		// Verifying Particpants diagnosed structural heart issues Text Area
		CommonUtils.assertEquals(
				"Pulmonary valve stenosis or pulmonary valve dysplasia (PVS/PS) - these are conditions where the valve that allows blood to flow from your heart to your lungs does not fully open or is structurally abnormal, Hypertrophic cardiomyopathy (HCM) - when the heart muscle becomes abnormally thick, Atrial septal defect (ASD) - a hole in the wall of the heart that separates the upper chambers (atria), Ventricular septal defect (VSD) - a hole in the wall of the heart that separates the lower, or main pumping, chambers (ventricles) of the heart, Mitral/tricuspid valve anomalies - when the valves between the chambers of the heart do not open or close properly, Other (please specify)",
				charmsNativeViewPage.nativeViewRasSurveyParticipantsDiagnosedStructuralHeartIssuesTextArea.getText());

		// Verifying Please Specifiy Text Box
		CommonUtils.assertEquals("GIANT HEART",
				charmsNativeViewPage.nativeViewRasSurveyDiagnosedStructuralHeartIssuesPleaseSpecifiyTextBox
						.getAttribute("value"));

		// ------- MEDICAL HISTORY SECTION DATA VERIFICATION --------
		charmsNativeViewPage.nativeViewRasSurveyMedicalHistoryTab.click();

		// MISSING Does the participant have a primary care provider?

		// Verifying Participant Name of primary care provider Text Box
		CommonUtils.assertEquals("DOCTOR GEORGE PEABODY",
				charmsNativeViewPage.nativeViewRasSurveyNameOfPrimaryCareProviderTextBox.getAttribute("value"));

		// Verifying Participant Location of primary care provider Text Box
		CommonUtils.assertEquals("FAIRFAX",
				charmsNativeViewPage.nativeViewRasSurveyLocationOfPrimaryCareProviderTextBox.getAttribute("value"));

		// Verifying Primary Care Provider Affiliation Text Box
		CommonUtils.assertEquals("INOVA",
				charmsNativeViewPage.nativeViewRasSurveyPrimaryCareProviderAffiliationTextBox.getAttribute("value"));

		// Verifying Participant selects Yes to "Has the participant ever had a biopsy?"
		// Drop Down
		CommonUtils.assertEquals("Yes",
				charmsNativeViewPage.nativeViewRasSurveyHasTheParticipantEverHadABiopsyDropDown.getText());

		// Verifying Participant selects Yes to "Is the participant allergic to any
		// medications" Drop Down
		CommonUtils.assertEquals("Yes",
				charmsNativeViewPage.nativeViewRasSurveyIsTheParticipantAllergicToAnyMedicationsDropDown.getText());

		// Verifying Participant selects Yes to "Have you ever been diagnosed with a
		// lymphatic system issue" Drop Down
		CommonUtils.assertEquals("Yes",
				charmsNativeViewPage.nativeViewRasSurveyHaveYouEverBeenDiagnosedWithALymphaticSystemIssueDropDown
						.getText());

		// Verifying Participant selects Yes to "Has the participant ever been evaluated
		// by a nephrologist?" Drop Down
		CommonUtils.assertEquals("Yes",
				charmsNativeViewPage.nativeViewRasSurveyHasTheParticipantEverBeenEvaluatedByANephrologistDropDown
						.getText());

		// Verifying Name of nephrologist Text Box
		CommonUtils.assertEquals("DOCTOR LAUREN RODNEY",
				charmsNativeViewPage.nativeViewRasSurveyNameOfNephrologistTextBox.getAttribute("value"));

		// Verifying Nephrologist Location Text Box
		CommonUtils.assertEquals("ARLINGTON, VA",
				charmsNativeViewPage.nativeViewRasSurveyNephrologistLocationTextBox.getAttribute("value"));

		// Veifying Nephrologist affiliation Text Box
		CommonUtils.assertEquals("INOVA",
				charmsNativeViewPage.nativeViewRasSurveyNephrologistAffilitionTextBox.getAttribute("value"));

		// Verifying Has the participant ever been diagnosed with a kidney problem Drop
		// Down
		CommonUtils.assertEquals("Yes",
				charmsNativeViewPage.nativeViewRasSurveyHasTheParticipantEverBeenDiagnosedWithAKidneyProblemDropDown
						.getText());

		// Verifying Hospitalized for any reason other than accidental injury or
		// childbirth Drop Down
		CommonUtils.assertEquals("Yes",
				charmsNativeViewPage.nativeViewRasSurveyHospitalizedForAnyReasonOtherThanAccidentalInjuryOrChildbirthDropDown
						.getText());

		// Verifying Is the participant allergic to any foods Drop Down
		CommonUtils.assertEquals("Yes",
				charmsNativeViewPage.nativeViewRasSurveyIsTheParticipantAllergicToAnyFoodsDropDown.getText());

		// Verifying Is the participant allergic to other things? Drop Down
		CommonUtils.assertEquals("Yes",
				charmsNativeViewPage.nativeViewRasSurveyIsTheParticipantAllergicToOtherThingsDropDown.getText());

		// Verifying Participant ear issues Text Area
		CommonUtils.assertEquals("Excessive earwax, Chronic or recurrent ear infection, Other",
				charmsNativeViewPage.nativeViewRasSurveyParticipantEarIssuesTextArea.getText());

		// --------FEEDING/NUTRITION/GAS DATA VERIFICATION----------------

		charmsNativeViewPage.nativeViewRasSurveyFeedingNutriGasTab.click();

		// Verifying If Patient Ever Been Seen by a GI Specialist - Dropdown
		CommonUtils.assertEquals("Yes", charmsNativeViewPage.nativeViewRasSurveyEverSeenGISpecialistDropdown.getText());

		// Verifying Has the participant had any symptoms that likely involved the GI
		// system- Dropdown
		CommonUtils.assertEquals("Yes", charmsNativeViewPage.nativeViewRasSurveySymptomsofGISystemDropdown.getText());

		// Verfying GI Specialist Name - Textbox
		CommonUtils.assertEquals("DOCTOR PHIL VOSS",
				charmsNativeViewPage.nativeViewRasSurveyGiSpecialistNameTextbox.getAttribute("value"));

		// Verfying GI Specialist City, State- Textbox
		CommonUtils.assertEquals("FAIRFAX, VA",
				charmsNativeViewPage.nativeViewRasSurveySpecialistCityStateTextbox.getAttribute("value"));

		// Verfying GI Specialist Hospital / Health Center Affiliation- Textbox
		CommonUtils.assertEquals("INOVA",
				charmsNativeViewPage.nativeViewRasSurveyHospitalAffiliationTextbox.getAttribute("value"));

		// Verfying Participant's diagnosed feeding difficulties - Textarea
		CommonUtils.assertEquals("Poor eater - declining food or unable to eat enough food for growth, "
				+ "Required feeding tube inserted in the nose to help with feeding, Required surgically placed feeding tube (in the stomach or small intestine) to help with feeding, "
				+ "Gastroparesis - delayed stomach emptying (when the stomach does not empty as quickly as it should), Other (please specify)",
				charmsNativeViewPage.nativeViewRasSurveyDiagnosedFeedingDifficultiesTextarea.getText());

		// Verfying Other Feeding Difficulties- Textbox
		CommonUtils.assertEquals("TROUBLE SWALLOWING",
				charmsNativeViewPage.nativeViewRasSurveyOtherFeedingDifficultiesTextBox.getAttribute("value"));

		// Verfying Age NJ/NG-tube was placed- Textbox
		CommonUtils.assertEquals("10 DAYS",
				charmsNativeViewPage.nativeViewRasSurveyAgeNJNGTubeTextbox.getAttribute("value"));

		// Verfying Age G/G-J tube was placed- Textbox
		CommonUtils.assertEquals("20 DAYS",
				charmsNativeViewPage.nativeViewRasSurveyAgeGGJTubeTextbox.getAttribute("value"));

		// Age gastronomy tube(G/G-J) removed- Textbox
		CommonUtils.assertEquals("30 DAYS",
				charmsNativeViewPage.nativeViewRasSurveyAgeGastroTubeRemovedTextbox.getAttribute("value"));

		// This step did not show up in Native View
		// All that apply Which of the following symptoms related to the GI system have
		// occurred?
		// CommonUtils.assertEquals("expected", charmsNativeViewPage.);

		// Veirfying if Participant is Toilet trained- Dropdown
		CommonUtils.assertEquals("Yes", charmsNativeViewPage.nativeViewRasSurveyToiletTrainedDropdown.getText());

		// Verifying Age successfully toilet trained- Textbox
		CommonUtils.assertEquals("2",
				charmsNativeViewPage.nativeViewRasSurveyAgeSuccesfullyToiletTrainedTextbox.getAttribute("value"));

		// Any episodes of repeated urine accidents after being toilet trained?-
		// Dropdown
		CommonUtils.assertEquals("Yes",
				charmsNativeViewPage.nativeViewRasSurveyEpisodesRepeatedUrineafterTrainedDropdown.getText());

		// Does the patient consistently use the toilet for all urination?- Dropdown
		CommonUtils.assertEquals("Yes",
				charmsNativeViewPage.nativeViewRasSurveyConsistentlyUseToiletUrinationDropdown.getText());

		// Does the patient consistently use the toilet for all bowel movements?-
		// Dropdown
		CommonUtils.assertEquals("Yes",
				charmsNativeViewPage.nativeViewRasSurveyToiletForAllBowelMovementDropdown.getText());

		// Any episodes of repeated bowel movement accidents after being toilet
		// trained?- Dropdown
		CommonUtils.assertEquals("Yes",
				charmsNativeViewPage.nativeViewRasSurveyRepeatedBowelAccidentsAfterTrainedDropdown.getText());

		// Pain with bowel movements- Dropdown
		CommonUtils.assertEquals("Yes", charmsNativeViewPage.nativeViewRasSurveyPainBowelMovementsDropdown.getText());

		// How many bowel movements do you have per week?- Textbox
		CommonUtils.assertEquals("2", charmsNativeViewPage.nativeViewRasSurveyBowelMovementsPerWeekDropDown.getText());

		// Bristol Stool Chart Type- Dropdown
		CommonUtils.assertEquals("Type 1", charmsNativeViewPage.nativeViewRasSurveyBristolStoolChartDropdown.getText());

		// Longest time without a bowel movement- Dropdown
		CommonUtils.assertEquals("2 days",
				charmsNativeViewPage.nativeViewRasSurveyLongestTimeWithoutBowelMovementDropdown.getText());

		// Has the participant had a procedure, test or study to evaluate their GI?-
		// Dropdown
		CommonUtils.assertEquals("Yes",
				charmsNativeViewPage.nativeViewRasSurveyProcedureToEvaluateGIDropdown.getText());

		// ------- HAIR & SKIN DATA VERIFICATION --------
		charmsNativeViewPage.nativeViewRasSurveyHairAndSkinTab.click();

		// Verifying Name of dermatlogist Text Box
		CommonUtils.assertEquals("DOCTOR DERMA CLOONEY",
				charmsNativeViewPage.nativeViewRasSurveyNameOfDermatologistTextBox.getAttribute("value"));

		// Verifying City, State of dermatologist Text Box
		CommonUtils.assertEquals("WASHINGTON, DC",
				charmsNativeViewPage.nativeViewRasSurveyCityStateOfDermatologistTextBox.getAttribute("value"));

		// Verifying Hospital or Medical Center Affiliation of Dermatologist Text Box
		CommonUtils.assertEquals("G.W. HOSPITAL",
				charmsNativeViewPage.nativeViewRasSurveyHospitalOrMedicalCenterAffilitionOfDermatologistTextBox
						.getAttribute("value"));

		// Verifying Description of participant's hair Text Area
		CommonUtils.assertEquals(
				"Waveless, Wavy, Sparse/having too little hair, Fine, Curly/wooly, East to pluck, Other",
				charmsNativeViewPage.nativeViewRasSurveyDescriptionOfParticipantsHairTextArea.getText());

		// Verifying Other hair description Text Box
		CommonUtils.assertEquals("THICK HAIR",
				charmsNativeViewPage.nativeViewRasSurveyOtherHairDescriptionTextBox.getAttribute("value"));

		// Verifying Diagnosed skin issues Text Area
		CommonUtils.assertEquals(
				"Keratosis pilaris (patches of small, hard bumps often found on the upper arms. These look similar to goose bumps), Palmar/plantar hyperkeratosis (significant thickening of the skin on the palms of the hands or soles of the feet), Facial keratosis/Ulerythema ophryogenes (patches of dry, hard sandpaper-like bumps on the face, particularly in and near the eyebrows), Ichthyosis (dry, scaly skin), Other (please specify)",
				charmsNativeViewPage.nativeViewRasSurveyDiagnosedSkinIssuesTextArea.getText());

		// Verifying Other skin issues Text Box
		CommonUtils.assertEquals("VITILIGO",
				charmsNativeViewPage.nativeViewRasSurveyOtherSkinIssuesTextBox.getAttribute("value"));

		// Verifying Pigmented skin findings Text Area
		CommonUtils.assertEquals(
				"Three or more cafe-au-lait spots (light brown birthmarks the color of coffee with milk), Diffuse hyperpigmentation (patches of skin that are darker than the rest of your skin), Three or more nevi (small brown, tan, pink or red spots, also called moles), Three or more lentigines (dark, smooth/flat freckles or spots on the skin), Other (please specify)",
				charmsNativeViewPage.nativeViewRasSurveyPigmentedSkinFindingsTextArea.getText());

		// Verifying Other pigmented findings Text Box
		CommonUtils.assertEquals("ALBINISM",
				charmsNativeViewPage.nativeViewRasSurveyOtherPigmentedFindingsTextBox.getAttribute("value"));

		// Verifying Diagnosed skin tumors Text Area
		CommonUtils.assertEquals(
				"Granular cell tumor (soft tissue tumor, often benign, commonly located in the head and neck area and tongue), Melanoma, Dysplastic nevi, Papilloma (wart-like growths), Other (please specify)",
				charmsNativeViewPage.nativeViewRasSurveyDiagnosedSkinTumorsTextArea.getText());

		// Verifying Other skin tumors Text Box
		CommonUtils.assertEquals("BENIGN TUMOR",
				charmsNativeViewPage.nativeViewRasSurveyOtherSkinTumorsTextBox.getAttribute("value"));

		// Verifying Is the texture or amount of hair similar to a biological relatives?
		// Drop Down
		CommonUtils.assertEquals("Yes",
				charmsNativeViewPage.nativeViewRasSurveyIsTheTextureOrAmountOfHairSimilarToABiologicalRelativesDropDown
						.getText());

		// Verifying Does the participant have any hemangiomas? Drop Down
		CommonUtils.assertEquals("Three or more hemangiomas",
				charmsNativeViewPage.nativeViewRasSurveyDoesTheParticipantHaveAnyHemangiomasDropDown.getText());

		// ------- SKELETAL DATA VERIFICATION --------
		charmsNativeViewPage.nativeViewRasSurveySkeletalTab.click();

		// Verifying Participant selects Yes to "Has the participant been evaluated by
		// an orthopaedic surgeon?" Drop Down
		CommonUtils.assertEquals("Yes",
				charmsNativeViewPage.nativeViewRasSurveyHasTheParticipantBeenEvaluatedByAnOrthopaedicSurgeonDropDown
						.getText());

		// Verifying Name of orthopaedic surgeon Text Box
		CommonUtils.assertEquals("DOCTOR BASHIR ZIKRIA",
				charmsNativeViewPage.nativeViewRasSurveyNameOfOrthopaedicSurgeonTextBox.getAttribute("value"));

		// Verifying Location of Orthopaedic surgeon Text Box
		CommonUtils.assertEquals("BETHESDA, MD",
				charmsNativeViewPage.nativeViewRasSurveyLocationOfOrthopaedicSurgeonTextBox.getAttribute("value"));

		// Verifying Orthopaedic surgeons hospital or medical center affiliation Text
		// Box
		CommonUtils.assertEquals("JOHNS HOPKINS",
				charmsNativeViewPage.nativeVIewRasSurveyOrthopaedicSurgeonsHospitalOrMedicalCenterAffiliationTextBox
						.getAttribute("value"));

		// Verifying Diagnosed skeletal findings Text Area
		CommonUtils.assertEquals(
				"Pectus carinatum (breastbone sticks out from the chest), Pectus excavatum (breastbone appears sunken or caved into the chest), Broad chest, nipples widely spaced, Other (please specify)",
				charmsNativeViewPage.nativeViewRasSurveyDiagnosedSkeletalFindingsTextArea.getText());

		// Verifying Other skeletal findings Text Box
		CommonUtils.assertEquals("RICKETS",
				charmsNativeViewPage.nativeViewRasSurveyOtherSkeletalFindingsTextBox.getAttribute("value"));

		// Verifying Participant selects Yes to "Does the participant have any issues
		// with curving of the spine" Drop Down
		CommonUtils.assertEquals("Yes",
				charmsNativeViewPage.nativeViewRasSurveyDoesTheParticipantHaveAnyIssuesWithCurvingOfTheSpineDropDown
						.getText());

		// Verifying Participant selects Yes to "Has the participant's neck been
		// described as short or webbed?" Drop Down
		CommonUtils.assertEquals("Yes",
				charmsNativeViewPage.nativeViewRasSurveyHasTheParticipantsNeckBeenDescribedAsShortOrWebbedDropDown
						.getText());

		// Verifying Participant selects Yes to "Has the participant ever been diagnosed
		// with joint issues?" Drop Down
		CommonUtils.assertEquals("Yes",
				charmsNativeViewPage.nativeViewRasSurveyHasTheParticipantEverBeenDiagnosedWithJointIssuesDropDown
						.getText());

		// Asserts native view data table
		rASSurveyStepsImpl.assertTable(charmsNativeViewPage.nativeViewRasSurveyTableTabs);

	}
}