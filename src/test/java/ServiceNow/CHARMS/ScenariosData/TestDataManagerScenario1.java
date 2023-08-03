package ServiceNow.CHARMS.ScenariosData;

import ServiceNow.CHARMS.Constants.CHARMSConstants;
import appsCommon.PageInitializer;
import com.nci.automation.dao.ExcelReader;
import java.util.Map;

public class TestDataManagerScenario1 extends PageInitializer {

    /**
     * RAS SCREENER SURVEY VARIABLES
     */
    public Map<String, String> testDataForRasScreenerSubmissionScenario1;
    public String areYouCompletingThisFormForSomeoneElseOrYourself;
    public String firstName;
    public String middleInitial;
    public  String lastName;
    public String whatIsYourDateOfBirth;
    public String dateOfBirthMonth;
    public String dateOfBirthYear;
    public String sexAssignedAtBirthOption;
    public String areYouAdoptedOption;
    public String countryOption;
    public String street;
    public String street2;
    public String city;
    public String state;
    public String zipcode;
    public String emailAddress;
    public String emailAddressConfirm;
    public String homePhoneNumber;
    public String cellPhoneNumber;
    public String workPhoneNumber;
    public String whatIsYourEthnicity;
    public String whatIsYourRace;
    public String areYouAParticipantInOtherStudyGroup;
    public String haveYouBeenDiagnosedWithFollowingConditions;
    public String haveYouBeenDiagnosedWithCancer;
    public String haveYouBeenDiagnosedWithARasopathy;
    public String haveAnyOfYourBiologicalRelativesBeenDiagnosedWithARasopathy;
    public String haveYouEverHadGeneticTesting;
    public String howDidYouHearAboutThisStudy;
    public String howDidYouHearAboutThisStudyOtherReason;
    public String haveYouOrOtherFamilyMembersParticipatedInOtherStudy;
    public String whatAreMainReasonsForParticipatingInStudy;
    public String whatAreMainReasonsForParticipatingInStudyOtherReason;

    /**
     * RAS SCREENER IIQ FORM VARIABLES
     */
    public Map<String, String> testDataForRasScreenerSubmissionIiqScenario1;
    public String pleaseLogInEmailTextBox;
    public String pleaseLogInOneTimePinTextBox;
    public String areYouAdoptedRadioButton;
    public String thisIsACopyForLowerEnvironmentsText;
    public String someOfThisInformationText;
    public String thisFirstSectionOfTheQuestionnaireText;
    public String areYouCompletingThisFormForYourselfRadioButton;
    public String whatIsYourBiologicalSexRadioButton;
    public String forWhichSexDoYouIdentifyRadioButton;
    public String doYouConsiderYourselfToBeRadioButton;
    public String whatIsYourRaceCheckBox;
    public String areYouOfAshkenazyJewishDescentRadioButton;
    public String wereYouRaisedPrimarilyRadioButton;
    public String whatIsYourDateOfBirthCalendar;
    public String whatIsYourDateOfBirthMonthDropDown;
    public String whatIsYourDateOfBirthDayDropDown;
    public String whatIsYourDateOfBirthYearDropDown;
    public String whereWereYouBornCityTextBox;
    public String whereWereYouBornStateTextBox;
    public String whereWereYouBornCountryTextBox;
    public String whereWereYouBornDontKnowTextBox;
    public String mostPeopleHaveAncestorsCheckBox;
    public String whatIsYourBiologicalFatherAncestralBackgroundTextBox;
    public String whatIsYourFammilysReligiousBackgroundCheckBox;
    public String whatIsYourMaritalStatusCheckBox;
    public String whatIsYourMainOccupationRadioButton;
    public String doYouCurrentlyHaveHealthInsuranceRadioButton;
    public String whatIsTheTotalCombinedYearlyIncomeRadioButton;
    public String whatIsTheHighestLevelOfSchoolingRadioButton;
    public String wereYouConceivedUsingVitroRadioButton;
    public String wereYouATwinRadioButton;
    public String areYourBiologicalParentsBloodRelatedRadioButton;
    public String wouldYouSayYouWereBornRadioButton;
    public String pleaseFillOutBirtWeightNumericTextBox;
    public String pleaseFillOutBirtWeightUnitDropDown;
    public String pleaseFillOutHeadNumericTextBox;
    public String pleaseFillOutHeadUnitDropDown;
    public String pleaseFillOutHeadCircumferenceNumericTextBox;
    public String pleaseFillOutHeadCircumferenceUnitDropDown;
    public String thisSectionWillAskAboutCancerText;
    public String haveYouEverBeenDiagnosedWithAnyCancerRadioButton;
    public String haveYouEverHadMedicalGeneticTestingRadioButton;
    public String pleaseFillTheTableBelowWithHeightNumericTextBox;
    public String pleaseFillTheTableBelowWithHeightUnitDropDown;
    public String pleaseFillTheTableBelowWithWeightCurrentNumericTextBox;
    public String pleaseFillTheTableBelowWithWeightCurrentUnitDropDown;
    public String pleaseFillTheTableBelowWithWeightDuringLifetimeNumericTextBox;
    public String pleaseFillTheTableBelowWithWeightDuringLifetimeUnitDropDown;
    public String pleaseFillTheTableBelowWithWeightAt18NumericTextBox;
    public String pleaseFillTheTableBelowWithWeightAt18UnitDropDown;
    public String atWhatAgeWereYouAtTheHighestWeightTextBox;
    public String haveYouSoughtMedicalAdviceRegardingFertilityRadioButton;

    public void dataInitializerRasScreenerSurveyScenario1(String sheetName){
        /**
         * FETCHING DATA FROM EXCEL BEFORE SUBMITTING SCREENER
         */
        if(sheetName.equals("RASScreenerscenario1")) {
            testDataForRasScreenerSubmissionScenario1 = ExcelReader.excelIntoHashMap(CHARMSConstants.RAS_SCENARIO_ONE_DATA, sheetName);
            areYouCompletingThisFormForSomeoneElseOrYourself = testDataForRasScreenerSubmissionScenario1.get(rASScreenerScenario1_Constants.ARE_YOU_COMPLETING_THIS_FORM_FOR_SOMEONE_ELSE);
            firstName = testDataForRasScreenerSubmissionScenario1.get(rASScreenerScenario1_Constants.FIRST_NAME);
            middleInitial = testDataForRasScreenerSubmissionScenario1.get(rASScreenerScenario1_Constants.MIDDLE_INITIAL);
            lastName = testDataForRasScreenerSubmissionScenario1.get(rASScreenerScenario1_Constants.LAST_NAME);
            whatIsYourDateOfBirth = testDataForRasScreenerSubmissionScenario1.get(rASScreenerScenario1_Constants.WHAT_IS_YOUR_DATE_OF_BIRTH);
            dateOfBirthMonth = testDataForRasScreenerSubmissionScenario1.get(rASScreenerScenario1_Constants.DATE_OF_BIRTH_MONTH);
            dateOfBirthYear = testDataForRasScreenerSubmissionScenario1.get(rASScreenerScenario1_Constants.DATE_OF_BIRTH_YEAR);
            sexAssignedAtBirthOption = testDataForRasScreenerSubmissionScenario1.get(rASScreenerScenario1_Constants.SEX_ASSIGNED_AT_BIRTH_OPTION);
            areYouAdoptedOption = testDataForRasScreenerSubmissionScenario1.get(rASScreenerScenario1_Constants.ARE_YOU_ADOPTED_OPTION);
            countryOption = testDataForRasScreenerSubmissionScenario1.get(rASScreenerScenario1_Constants.WHICH_COUNTRY_DO_YOU_CURRENTLY_LIVE_IN_OPTION);
            street = testDataForRasScreenerSubmissionScenario1.get(rASScreenerScenario1_Constants.STREET_ADDRESS);
            street2 = testDataForRasScreenerSubmissionScenario1.get(rASScreenerScenario1_Constants.STREET_2_ADDRESS);
            city = testDataForRasScreenerSubmissionScenario1.get(rASScreenerScenario1_Constants.CITY_TEXT);
            state = testDataForRasScreenerSubmissionScenario1.get(rASScreenerScenario1_Constants.STATE_TEXT);
            zipcode = testDataForRasScreenerSubmissionScenario1.get(rASScreenerScenario1_Constants.ZIP_CODE_TEXT);
            emailAddress = testDataForRasScreenerSubmissionScenario1.get(rASScreenerScenario1_Constants.EMAIL_ADDRESS);
            emailAddressConfirm = testDataForRasScreenerSubmissionScenario1.get(rASScreenerScenario1_Constants.CONFIRM_EMAIL_ADDRESS);
            homePhoneNumber = testDataForRasScreenerSubmissionScenario1.get(rASScreenerScenario1_Constants.HOME_PHONE_NUMBER);
            cellPhoneNumber = testDataForRasScreenerSubmissionScenario1.get(rASScreenerScenario1_Constants.CELL_PHONE_NUMBER);
            workPhoneNumber = testDataForRasScreenerSubmissionScenario1.get(rASScreenerScenario1_Constants.WORK_PHONE_NUMBER);
            whatIsYourEthnicity = testDataForRasScreenerSubmissionScenario1.get(rASScreenerScenario1_Constants.WHAT_IS_YOUR_ETHNICITY);
            whatIsYourRace = testDataForRasScreenerSubmissionScenario1.get(rASScreenerScenario1_Constants.WHAT_IS_YOUR_RACE);
            areYouAParticipantInOtherStudyGroup = testDataForRasScreenerSubmissionScenario1.get(rASScreenerScenario1_Constants.ARE_YOU_A_PARTICIPANT_IN_OTHER_STUDY_GROUP);
            haveYouBeenDiagnosedWithFollowingConditions = testDataForRasScreenerSubmissionScenario1.get(rASScreenerScenario1_Constants.HAVE_YOU_BEEN_DIAGNOSED_WITH_THE_FOLLOWING_CONDITIONS);
            haveYouBeenDiagnosedWithCancer = testDataForRasScreenerSubmissionScenario1.get(rASScreenerScenario1_Constants.HAVE_YOU_EVER_BEEN_DIAGNOSED_WITH_CANCER);
            haveYouBeenDiagnosedWithARasopathy = testDataForRasScreenerSubmissionScenario1.get(rASScreenerScenario1_Constants.HAVE_YOU_BEEN_DIAGNOSED_WITH_A_RASOPATHY);
            haveAnyOfYourBiologicalRelativesBeenDiagnosedWithARasopathy = testDataForRasScreenerSubmissionScenario1.get(rASScreenerScenario1_Constants.HAVE_ANY_BIOLOGICAL_RELATIVES_BEEN_DIAGNOSED_WITH_ARASOPATHY);
            haveYouEverHadGeneticTesting = testDataForRasScreenerSubmissionScenario1.get(rASScreenerScenario1_Constants.HAVE_YOU_EVER_HAD_GENETIC_TESTING);
            howDidYouHearAboutThisStudy = testDataForRasScreenerSubmissionScenario1.get(rASScreenerScenario1_Constants.HOW_DID_YOU_HEAR_ABOUT_THIS_STUDY);
            howDidYouHearAboutThisStudyOtherReason = testDataForRasScreenerSubmissionScenario1.get(rASScreenerScenario1_Constants.HOW_DID_YOU_HEAR_ABOUT_THIS_STUDY_OTHER_REASON);
            haveYouOrOtherFamilyMembersParticipatedInOtherStudy = testDataForRasScreenerSubmissionScenario1.get(rASScreenerScenario1_Constants.HAVE_YOU_OR_OTHER_FAMILY_MEMBERS_PARTICIPATED_IN_OTHER_STUDY);
            whatAreMainReasonsForParticipatingInStudy = testDataForRasScreenerSubmissionScenario1.get(rASScreenerScenario1_Constants.WHAT_ARE_THE_MAIN_REASONS_FOR_PARTICIPATING_IN_THIS_STUDY);
            whatAreMainReasonsForParticipatingInStudyOtherReason = testDataForRasScreenerSubmissionScenario1.get(rASScreenerScenario1_Constants.WHAT_ARE_THE_MAIN_REASONS_FOR_PARTICIPATING_IN_THIS_STUDY_OTHER_REASON);
        } else if(sheetName.equals("the next sheet name")){
            testDataForRasScreenerSubmissionScenario1 = ExcelReader.excelIntoHashMap(CHARMSConstants.RAS_SCENARIO_ONE_DATA, sheetName);


        }
    }

    public void dataInitializerRasScreenerIiqFormScenario1(String sheetName) {
        /**
         * FETCHING DATA FROM EXCEL BEFORE SUBMITTING IIQ FORM
         */
        testDataForRasScreenerSubmissionIiqScenario1 = ExcelReader.excelIntoHashMap(CHARMSConstants.RAS_SCENARIO_ONE_DATA, sheetName);
        pleaseLogInEmailTextBox = testDataForRasScreenerSubmissionIiqScenario1.get(rASScreenerScenario1_Constants.PLEASE_LOG_IN_EMAIL_TEXT_BOX);
        pleaseLogInOneTimePinTextBox = testDataForRasScreenerSubmissionIiqScenario1.get(rASScreenerScenario1_Constants.PLEASE_LOG_IN_ONE_TIME_PIN_TEXT_BOX);
        areYouAdoptedRadioButton = testDataForRasScreenerSubmissionIiqScenario1.get(rASScreenerScenario1_Constants.ARE_YOU_ADOPTED_RADIO_BUTTON);
        thisIsACopyForLowerEnvironmentsText = testDataForRasScreenerSubmissionIiqScenario1.get(rASScreenerScenario1_Constants.THIS_IS_A_COPY_FOR_LOWER_ENVIRONMENTS_TEXT);
        someOfThisInformationText = testDataForRasScreenerSubmissionIiqScenario1.get(rASScreenerScenario1_Constants.SOME_OF_THIS_INFORMATION_TEXT);
        thisFirstSectionOfTheQuestionnaireText = testDataForRasScreenerSubmissionIiqScenario1.get(rASScreenerScenario1_Constants.THIS_FIRST_QUESTION_OF_THE_QUESTIONNAIRE_TEXT);
        areYouCompletingThisFormForYourselfRadioButton = testDataForRasScreenerSubmissionIiqScenario1.get(rASScreenerScenario1_Constants.ARE_YOU_COMPLETING_THIS_FORM_FOR_YOURSELF_RADIO_BUTTON);
        whatIsYourBiologicalSexRadioButton = testDataForRasScreenerSubmissionIiqScenario1.get(rASScreenerScenario1_Constants.WHAT_IS_YOUR_BIOLOGICAL_SEX_RADIO_BUTTON);
        forWhichSexDoYouIdentifyRadioButton = testDataForRasScreenerSubmissionIiqScenario1.get(rASScreenerScenario1_Constants.FOR_WHICH_SEX_DO_DO_YOU_IDENTIFY_RADIO_BUTTON);
        doYouConsiderYourselfToBeRadioButton = testDataForRasScreenerSubmissionIiqScenario1.get(rASScreenerScenario1_Constants.DO_YOU_CONSIDER_YOURSELF_TO_BE_RADIO_BUTTON);
        whatIsYourRaceCheckBox = testDataForRasScreenerSubmissionIiqScenario1.get(rASScreenerScenario1_Constants.WHAT_IS_YOUR_RACE_CHECK_BOX);
        areYouOfAshkenazyJewishDescentRadioButton = testDataForRasScreenerSubmissionIiqScenario1.get(rASScreenerScenario1_Constants.ARE_YOU_OF_ASHKENAZY_JEWISH_DESCENT_RADIO_BUTTON);
        wereYouRaisedPrimarilyRadioButton = testDataForRasScreenerSubmissionIiqScenario1.get(rASScreenerScenario1_Constants.WERE_YOU_RAISED_PRIMARILY_RADIO_BUTTON);
        whatIsYourDateOfBirthCalendar = testDataForRasScreenerSubmissionIiqScenario1.get(rASScreenerScenario1_Constants.WHAT_IS_YOUR_DATE_OF_BIRTH_CALENDAR);
        whatIsYourDateOfBirthMonthDropDown = testDataForRasScreenerSubmissionIiqScenario1.get(rASScreenerScenario1_Constants.WHAT_IS_YOUR_DATE_OF_BIRTH_MONTH_DROP_DOWN);
        whatIsYourDateOfBirthDayDropDown = testDataForRasScreenerSubmissionIiqScenario1.get(rASScreenerScenario1_Constants.WHAT_IS_YOUR_DATE_OF_BIRTH_DAY_DROP_DOWN);
        whatIsYourDateOfBirthYearDropDown = testDataForRasScreenerSubmissionIiqScenario1.get(rASScreenerScenario1_Constants.WHAT_IS_YOUR_DATE_OF_BIRTH_YEAR_DROP_DOWN);
        whereWereYouBornCityTextBox = testDataForRasScreenerSubmissionIiqScenario1.get(rASScreenerScenario1_Constants.WHERE_WERE_YOU_BORN_CITY_TEXT_BOX);
        whereWereYouBornStateTextBox = testDataForRasScreenerSubmissionIiqScenario1.get(rASScreenerScenario1_Constants.WHERE_WERE_YOU_BORN_STATE_TEXT_BOX);
        whereWereYouBornCountryTextBox = testDataForRasScreenerSubmissionIiqScenario1.get(rASScreenerScenario1_Constants.WHERE_WERE_YOU_BORN_COUNTRY_TEXT_BOX);
        whereWereYouBornDontKnowTextBox = testDataForRasScreenerSubmissionIiqScenario1.get(rASScreenerScenario1_Constants.WHERE_WERE_YOU_BORN_DONTKNOW_TEXT_BOX);
        mostPeopleHaveAncestorsCheckBox = testDataForRasScreenerSubmissionIiqScenario1.get(rASScreenerScenario1_Constants.MOST_PEOPLE_HAVE_ANCESTORS_CHECK_BOX);
        whatIsYourBiologicalFatherAncestralBackgroundTextBox = testDataForRasScreenerSubmissionIiqScenario1.get(rASScreenerScenario1_Constants.WHAT_IS_YOUR_BIOLOGICAL_FATHER_ANCESTRAL_BACKGROUND_TEXT_BOX);
        whatIsYourFammilysReligiousBackgroundCheckBox = testDataForRasScreenerSubmissionIiqScenario1.get(rASScreenerScenario1_Constants.WHAT_IS_YOUR_FAMMILYS_RELIGIOUS_BACKGROUND_CHECK_BOX);
        whatIsYourMaritalStatusCheckBox = testDataForRasScreenerSubmissionIiqScenario1.get(rASScreenerScenario1_Constants.WHAT_IS_YOUR_MARITAL_STATUS_CHECK_BOX);
        whatIsYourMainOccupationRadioButton = testDataForRasScreenerSubmissionIiqScenario1.get(rASScreenerScenario1_Constants.WHAT_IS_YOUR_MAIN_OCCUPATION_RADIO_BUTTON);
        doYouCurrentlyHaveHealthInsuranceRadioButton = testDataForRasScreenerSubmissionIiqScenario1.get(rASScreenerScenario1_Constants.DO_YOU_CURRENTLY_HAVE_HEALTH_INSURANCE_RADIO_BUTTON);
        whatIsTheTotalCombinedYearlyIncomeRadioButton = testDataForRasScreenerSubmissionIiqScenario1.get(rASScreenerScenario1_Constants.WHAT_IS_THE_TOTAL_COMBINED_YEARLY_INCOME_RADIO_BUTTON);
        whatIsTheHighestLevelOfSchoolingRadioButton = testDataForRasScreenerSubmissionIiqScenario1.get(rASScreenerScenario1_Constants.WHAT_IS_THE_HIGHEST_LEVEL_OF_SCHOOLING_RADIO_BUTTON);
        wereYouConceivedUsingVitroRadioButton = testDataForRasScreenerSubmissionIiqScenario1.get(rASScreenerScenario1_Constants.WERE_YOU_CONCEIVED_USING_VITRO_RADIO_BUTTON);
        wereYouATwinRadioButton = testDataForRasScreenerSubmissionIiqScenario1.get(rASScreenerScenario1_Constants.WERE_YOU_A_TWIN_RADIO_BUTTON);
        areYourBiologicalParentsBloodRelatedRadioButton = testDataForRasScreenerSubmissionIiqScenario1.get(rASScreenerScenario1_Constants.ARE_YOUR_BIOLOGICAL_PARENTS_BLOOD_RELATED_RADIO_BUTTON);
        wouldYouSayYouWereBornRadioButton = testDataForRasScreenerSubmissionIiqScenario1.get(rASScreenerScenario1_Constants.WOULD_YOU_SAY_YOU_WERE_BORN_RADIO_BUTTON);
        pleaseFillOutBirtWeightNumericTextBox = testDataForRasScreenerSubmissionIiqScenario1.get(rASScreenerScenario1_Constants.PLEASE_FILL_OUT_BIRT_WEIGHT_NUMERIC_TEXT_BOX);
        pleaseFillOutBirtWeightUnitDropDown = testDataForRasScreenerSubmissionIiqScenario1.get(rASScreenerScenario1_Constants.PLEASE_FILL_OUT_BIRT_WEIGHT_UNIT_DROP_DOWN);
        pleaseFillOutHeadNumericTextBox = testDataForRasScreenerSubmissionIiqScenario1.get(rASScreenerScenario1_Constants.PLEASE_FILL_OUT_BIRT_HEAD_NUMERIC_TEXT_BOX);
        pleaseFillOutHeadUnitDropDown = testDataForRasScreenerSubmissionIiqScenario1.get(rASScreenerScenario1_Constants.PLEASE_FILL_OUT_BIRT_HEAD_UNIT_DROP_DOWN);
        pleaseFillOutHeadCircumferenceNumericTextBox = testDataForRasScreenerSubmissionIiqScenario1.get(rASScreenerScenario1_Constants.PLEASE_FILL_OUT_BIRT_HEAD_CIRCUMFERENCE_NUMERIC_TEXT_BOX);
        pleaseFillOutHeadCircumferenceUnitDropDown = testDataForRasScreenerSubmissionIiqScenario1.get(rASScreenerScenario1_Constants.PLEASE_FILL_OUT_BIRT_HEAD_CIRCUMFERENCE_UNIT_DROP_DOWN);
        thisSectionWillAskAboutCancerText = testDataForRasScreenerSubmissionIiqScenario1.get(rASScreenerScenario1_Constants.THIS_SECTION_WILL_ASK_ABOUT_CANCER_TEXT);
        haveYouEverBeenDiagnosedWithAnyCancerRadioButton = testDataForRasScreenerSubmissionIiqScenario1.get(rASScreenerScenario1_Constants.HAVE_YOU_EVER_BEEN_DIAGNOSED_WITH_ANY_CANCER_RADIO_BUTTON);
        haveYouEverHadMedicalGeneticTestingRadioButton = testDataForRasScreenerSubmissionIiqScenario1.get(rASScreenerScenario1_Constants.HAVE_YOU_EVER_HAD_MEDICAL_GENETIC_TESTING_RADIO_BUTTON);
        pleaseFillTheTableBelowWithHeightNumericTextBox = testDataForRasScreenerSubmissionIiqScenario1.get(rASScreenerScenario1_Constants.PLEASE_FILL_THE_TABLE_BELOW_WITH_HEIGHT_NUMERIC_TEXT_BOX);
        pleaseFillTheTableBelowWithHeightUnitDropDown = testDataForRasScreenerSubmissionIiqScenario1.get(rASScreenerScenario1_Constants.PLEASE_FILL_THE_TABLE_BELOW_WITH_HEIGHT_UNIT_DROP_DOWN);
        pleaseFillTheTableBelowWithWeightCurrentNumericTextBox = testDataForRasScreenerSubmissionIiqScenario1.get(rASScreenerScenario1_Constants.PLEASE_FILL_THE_TABLE_BELOW_WITH_WEIGHT_CURRENT_NUMERIC_TEXT_BOX);
        pleaseFillTheTableBelowWithWeightCurrentUnitDropDown = testDataForRasScreenerSubmissionIiqScenario1.get(rASScreenerScenario1_Constants.PLEASE_FILL_THE_TABLE_BELOW_WITH_WEIGHT_CURRENT_UNIT_DROP_DOWN);
        pleaseFillTheTableBelowWithWeightDuringLifetimeNumericTextBox = testDataForRasScreenerSubmissionIiqScenario1.get(rASScreenerScenario1_Constants.PLEASE_FILL_THE_TABLE_BELOW_WITH_WEIGHT_DURING_LIFETIME_NUMERIC_TEXT_BOX);
        pleaseFillTheTableBelowWithWeightDuringLifetimeUnitDropDown = testDataForRasScreenerSubmissionIiqScenario1.get(rASScreenerScenario1_Constants.PLEASE_FILL_THE_TABLE_BELOW_WITH_WEIGHT_DURING_LIFETIME_UNIT_DROP_DOWN);
        pleaseFillTheTableBelowWithWeightAt18NumericTextBox = testDataForRasScreenerSubmissionIiqScenario1.get(rASScreenerScenario1_Constants.PLEASE_FILL_THE_TABLE_BELOW_WITH_WEIGHT_AT_18_NUMERIC_TEXT_BOX);
        pleaseFillTheTableBelowWithWeightAt18UnitDropDown = testDataForRasScreenerSubmissionIiqScenario1.get(rASScreenerScenario1_Constants.PLEASE_FILL_THE_TABLE_BELOW_WITH_WEIGHT_AT_18_UNIT_DROP_DOWN);
        atWhatAgeWereYouAtTheHighestWeightTextBox = testDataForRasScreenerSubmissionIiqScenario1.get(rASScreenerScenario1_Constants.AT_WHAT_AGE_WERE_YOU_AT_THE_HIGHEST_WEIGHT_TEXT_BOX);
        haveYouSoughtMedicalAdviceRegardingFertilityRadioButton = testDataForRasScreenerSubmissionIiqScenario1.get(rASScreenerScenario1_Constants.HAVE_YOU_SOUGHT_MEDICAL_ADVICE_REGARDING_FERTILITY_RADIO_BUTTON);
    }
}