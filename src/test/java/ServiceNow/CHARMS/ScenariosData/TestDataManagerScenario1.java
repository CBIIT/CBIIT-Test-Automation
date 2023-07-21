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
        testDataForRasScreenerSubmissionScenario1 = ExcelReader.excelIntoHashMap(CHARMSConstants.RAS_SELF_SUBMISSION_SCENARIOS_DATA, sheetName);

        areYouCompletingThisFormForSomeoneElseOrYourself = testDataForRasScreenerSubmissionScenario1.get(rASScreenerScenario1_Constants.areYouCompletingThisFormForSomeoneElse);
        firstName = testDataForRasScreenerSubmissionScenario1.get(rASScreenerScenario1_Constants.firstName);
        middleInitial = testDataForRasScreenerSubmissionScenario1.get(rASScreenerScenario1_Constants.middleInitial);
        lastName = testDataForRasScreenerSubmissionScenario1.get(rASScreenerScenario1_Constants.lastName);
        whatIsYourDateOfBirth = testDataForRasScreenerSubmissionScenario1.get(rASScreenerScenario1_Constants.whatIsYourDateOfBirth);
        dateOfBirthMonth = testDataForRasScreenerSubmissionScenario1.get(rASScreenerScenario1_Constants.dateOfBirthMonth);
        dateOfBirthYear = testDataForRasScreenerSubmissionScenario1.get(rASScreenerScenario1_Constants.dateOfBirthYear);
        sexAssignedAtBirthOption = testDataForRasScreenerSubmissionScenario1.get(rASScreenerScenario1_Constants.sexAssignedAtBirthOption);
        areYouAdoptedOption = testDataForRasScreenerSubmissionScenario1.get(rASScreenerScenario1_Constants.areYouAdoptedOption);
        countryOption = testDataForRasScreenerSubmissionScenario1.get(rASScreenerScenario1_Constants.whichCountryDoYouCurrentlyLiveInOption);
        street = testDataForRasScreenerSubmissionScenario1.get(rASScreenerScenario1_Constants.streetAddress);
        street2 = testDataForRasScreenerSubmissionScenario1.get(rASScreenerScenario1_Constants.street2Address);
        city = testDataForRasScreenerSubmissionScenario1.get(rASScreenerScenario1_Constants.cityText);
        state = testDataForRasScreenerSubmissionScenario1.get(rASScreenerScenario1_Constants.stateText);
        zipcode = testDataForRasScreenerSubmissionScenario1.get(rASScreenerScenario1_Constants.zipCodeText);
        emailAddress = testDataForRasScreenerSubmissionScenario1.get(rASScreenerScenario1_Constants.emailAddress);
        emailAddressConfirm = testDataForRasScreenerSubmissionScenario1.get(rASScreenerScenario1_Constants.confirmEmailAddress);
        homePhoneNumber = testDataForRasScreenerSubmissionScenario1.get(rASScreenerScenario1_Constants.homePhoneNumber);
        cellPhoneNumber = testDataForRasScreenerSubmissionScenario1.get(rASScreenerScenario1_Constants.cellPhoneNumber);
        workPhoneNumber = testDataForRasScreenerSubmissionScenario1.get(rASScreenerScenario1_Constants.workPhoneNumber);
        whatIsYourEthnicity = testDataForRasScreenerSubmissionScenario1.get(rASScreenerScenario1_Constants.whatIsYourEthnicity);
        whatIsYourRace = testDataForRasScreenerSubmissionScenario1.get(rASScreenerScenario1_Constants.whatIsYourRace);
        areYouAParticipantInOtherStudyGroup = testDataForRasScreenerSubmissionScenario1.get(rASScreenerScenario1_Constants.areYouAParticipantInOtherStudyGroup);
        haveYouBeenDiagnosedWithFollowingConditions = testDataForRasScreenerSubmissionScenario1.get(rASScreenerScenario1_Constants.haveYouBeenDiagnosedWithTheFollowingConditions);
        haveYouBeenDiagnosedWithCancer = testDataForRasScreenerSubmissionScenario1.get(rASScreenerScenario1_Constants.haveYouEverBeenDiagnosedWithCancer);
        haveYouBeenDiagnosedWithARasopathy = testDataForRasScreenerSubmissionScenario1.get(rASScreenerScenario1_Constants.haveYouBeenDiagnosedWithARasopathy);
        haveAnyOfYourBiologicalRelativesBeenDiagnosedWithARasopathy = testDataForRasScreenerSubmissionScenario1.get(rASScreenerScenario1_Constants.haveAnyBiologicalRelativesBeenDiagnosedWithARasopathy);
        haveYouEverHadGeneticTesting = testDataForRasScreenerSubmissionScenario1.get(rASScreenerScenario1_Constants.haveYouEverHadGeneticTesting);
        howDidYouHearAboutThisStudy = testDataForRasScreenerSubmissionScenario1.get(rASScreenerScenario1_Constants.howDidYouHearAboutThisStudy);
        howDidYouHearAboutThisStudyOtherReason = testDataForRasScreenerSubmissionScenario1.get(rASScreenerScenario1_Constants.howDidYouHearAboutThisStudyOtherReason);
        haveYouOrOtherFamilyMembersParticipatedInOtherStudy = testDataForRasScreenerSubmissionScenario1.get(rASScreenerScenario1_Constants.haveYouOrOtherFamilyMembersParticipatedInOtherStudy);
        whatAreMainReasonsForParticipatingInStudy = testDataForRasScreenerSubmissionScenario1.get(rASScreenerScenario1_Constants.whatAreTheMainReasonsForParticipatingInThisStudy);
        whatAreMainReasonsForParticipatingInStudyOtherReason = testDataForRasScreenerSubmissionScenario1.get(rASScreenerScenario1_Constants.getWhatAreTheMainReasonsForParticipatingInThisStudyOtherReason);
    }

    public void dataInitializerRasScreenerIiqFormScenario1(String sheetName) {
        /**
         * FETCHING DATA FROM EXCEL BEFORE SUBMITTING IIQ FORM
         */
        testDataForRasScreenerSubmissionIiqScenario1 = ExcelReader.excelIntoHashMap(CHARMSConstants.RAS_SELF_SUBMISSION_SCENARIOS_DATA, sheetName);
//        System.out.println("--------------------------------------------------------");
//
//        for (String keys : testDataForRasScreenerSubmissionIiqScenario1.keySet())
//        {
//            System.out.println(keys + ":"+ testDataForRasScreenerSubmissionIiqScenario1.get(keys));
//        }
//        System.out.println("--------------------------------------------------------");

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