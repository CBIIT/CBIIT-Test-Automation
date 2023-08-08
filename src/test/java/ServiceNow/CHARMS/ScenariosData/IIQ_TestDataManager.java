package ServiceNow.CHARMS.ScenariosData;

import ServiceNow.CHARMS.Constants.CHARMSConstants;
import appsCommon.PageInitializer;
import com.nci.automation.dao.ExcelReader;

import java.util.Map;

public class IIQ_TestDataManager extends PageInitializer {

    /**
     * RAS SCREENER IIQ FORM VARIABLES
     */
    public Map<String, String> testDataForIiqForm;
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

    public void dataInitializerIIQ(String sheetName) {
        /**
         * FETCHING DATA FROM EXCEL BEFORE SUBMITTING IIQ FORM
         */
        testDataForIiqForm = ExcelReader.excelIntoHashMap(CHARMSConstants.RAS_SCENARIO_ONE_DATA, sheetName);
        pleaseLogInEmailTextBox = testDataForIiqForm.get(iiq_Constants.PLEASE_LOG_IN_EMAIL_TEXT_BOX);
        pleaseLogInOneTimePinTextBox = testDataForIiqForm.get(iiq_Constants.PLEASE_LOG_IN_ONE_TIME_PIN_TEXT_BOX);
        areYouAdoptedRadioButton = testDataForIiqForm.get(iiq_Constants.ARE_YOU_ADOPTED_RADIO_BUTTON);
        thisIsACopyForLowerEnvironmentsText = testDataForIiqForm.get(iiq_Constants.THIS_IS_A_COPY_FOR_LOWER_ENVIRONMENTS_TEXT);
        someOfThisInformationText = testDataForIiqForm.get(iiq_Constants.SOME_OF_THIS_INFORMATION_TEXT);
        thisFirstSectionOfTheQuestionnaireText = testDataForIiqForm.get(iiq_Constants.THIS_FIRST_QUESTION_OF_THE_QUESTIONNAIRE_TEXT);
        areYouCompletingThisFormForYourselfRadioButton = testDataForIiqForm.get(iiq_Constants.ARE_YOU_COMPLETING_THIS_FORM_FOR_YOURSELF_RADIO_BUTTON);
        whatIsYourBiologicalSexRadioButton = testDataForIiqForm.get(iiq_Constants.WHAT_IS_YOUR_BIOLOGICAL_SEX_RADIO_BUTTON);
        forWhichSexDoYouIdentifyRadioButton = testDataForIiqForm.get(iiq_Constants.FOR_WHICH_SEX_DO_DO_YOU_IDENTIFY_RADIO_BUTTON);
        doYouConsiderYourselfToBeRadioButton = testDataForIiqForm.get(iiq_Constants.DO_YOU_CONSIDER_YOURSELF_TO_BE_RADIO_BUTTON);
        whatIsYourRaceCheckBox = testDataForIiqForm.get(iiq_Constants.WHAT_IS_YOUR_RACE_CHECK_BOX);
        areYouOfAshkenazyJewishDescentRadioButton = testDataForIiqForm.get(iiq_Constants.ARE_YOU_OF_ASHKENAZY_JEWISH_DESCENT_RADIO_BUTTON);
        wereYouRaisedPrimarilyRadioButton = testDataForIiqForm.get(iiq_Constants.WERE_YOU_RAISED_PRIMARILY_RADIO_BUTTON);
        whatIsYourDateOfBirthCalendar = testDataForIiqForm.get(iiq_Constants.WHAT_IS_YOUR_DATE_OF_BIRTH_CALENDAR);
        whatIsYourDateOfBirthMonthDropDown = testDataForIiqForm.get(iiq_Constants.WHAT_IS_YOUR_DATE_OF_BIRTH_MONTH_DROP_DOWN);
        whatIsYourDateOfBirthDayDropDown = testDataForIiqForm.get(iiq_Constants.WHAT_IS_YOUR_DATE_OF_BIRTH_DAY_DROP_DOWN);
        whatIsYourDateOfBirthYearDropDown = testDataForIiqForm.get(iiq_Constants.WHAT_IS_YOUR_DATE_OF_BIRTH_YEAR_DROP_DOWN);
        whereWereYouBornCityTextBox = testDataForIiqForm.get(iiq_Constants.WHERE_WERE_YOU_BORN_CITY_TEXT_BOX);
        whereWereYouBornStateTextBox = testDataForIiqForm.get(iiq_Constants.WHERE_WERE_YOU_BORN_STATE_TEXT_BOX);
        whereWereYouBornCountryTextBox = testDataForIiqForm.get(iiq_Constants.WHERE_WERE_YOU_BORN_COUNTRY_TEXT_BOX);
        whereWereYouBornDontKnowTextBox = testDataForIiqForm.get(iiq_Constants.WHERE_WERE_YOU_BORN_DONTKNOW_TEXT_BOX);
        mostPeopleHaveAncestorsCheckBox = testDataForIiqForm.get(iiq_Constants.MOST_PEOPLE_HAVE_ANCESTORS_CHECK_BOX);
        whatIsYourBiologicalFatherAncestralBackgroundTextBox = testDataForIiqForm.get(iiq_Constants.WHAT_IS_YOUR_BIOLOGICAL_FATHER_ANCESTRAL_BACKGROUND_TEXT_BOX);
        whatIsYourFammilysReligiousBackgroundCheckBox = testDataForIiqForm.get(iiq_Constants.WHAT_IS_YOUR_FAMMILYS_RELIGIOUS_BACKGROUND_CHECK_BOX);
        whatIsYourMaritalStatusCheckBox = testDataForIiqForm.get(iiq_Constants.WHAT_IS_YOUR_MARITAL_STATUS_CHECK_BOX);
        whatIsYourMainOccupationRadioButton = testDataForIiqForm.get(iiq_Constants.WHAT_IS_YOUR_MAIN_OCCUPATION_RADIO_BUTTON);
        doYouCurrentlyHaveHealthInsuranceRadioButton = testDataForIiqForm.get(iiq_Constants.DO_YOU_CURRENTLY_HAVE_HEALTH_INSURANCE_RADIO_BUTTON);
        whatIsTheTotalCombinedYearlyIncomeRadioButton = testDataForIiqForm.get(iiq_Constants.WHAT_IS_THE_TOTAL_COMBINED_YEARLY_INCOME_RADIO_BUTTON);
        whatIsTheHighestLevelOfSchoolingRadioButton = testDataForIiqForm.get(iiq_Constants.WHAT_IS_THE_HIGHEST_LEVEL_OF_SCHOOLING_RADIO_BUTTON);
        wereYouConceivedUsingVitroRadioButton = testDataForIiqForm.get(iiq_Constants.WERE_YOU_CONCEIVED_USING_VITRO_RADIO_BUTTON);
        wereYouATwinRadioButton = testDataForIiqForm.get(iiq_Constants.WERE_YOU_A_TWIN_RADIO_BUTTON);
        areYourBiologicalParentsBloodRelatedRadioButton = testDataForIiqForm.get(iiq_Constants.ARE_YOUR_BIOLOGICAL_PARENTS_BLOOD_RELATED_RADIO_BUTTON);
        wouldYouSayYouWereBornRadioButton = testDataForIiqForm.get(iiq_Constants.WOULD_YOU_SAY_YOU_WERE_BORN_RADIO_BUTTON);
        pleaseFillOutBirtWeightNumericTextBox = testDataForIiqForm.get(iiq_Constants.PLEASE_FILL_OUT_BIRT_WEIGHT_NUMERIC_TEXT_BOX);
        pleaseFillOutBirtWeightUnitDropDown = testDataForIiqForm.get(iiq_Constants.PLEASE_FILL_OUT_BIRT_WEIGHT_UNIT_DROP_DOWN);
        pleaseFillOutHeadNumericTextBox = testDataForIiqForm.get(iiq_Constants.PLEASE_FILL_OUT_BIRT_HEAD_NUMERIC_TEXT_BOX);
        pleaseFillOutHeadUnitDropDown = testDataForIiqForm.get(iiq_Constants.PLEASE_FILL_OUT_BIRT_HEAD_UNIT_DROP_DOWN);
        pleaseFillOutHeadCircumferenceNumericTextBox = testDataForIiqForm.get(iiq_Constants.PLEASE_FILL_OUT_BIRT_HEAD_CIRCUMFERENCE_NUMERIC_TEXT_BOX);
        pleaseFillOutHeadCircumferenceUnitDropDown = testDataForIiqForm.get(iiq_Constants.PLEASE_FILL_OUT_BIRT_HEAD_CIRCUMFERENCE_UNIT_DROP_DOWN);
        thisSectionWillAskAboutCancerText = testDataForIiqForm.get(iiq_Constants.THIS_SECTION_WILL_ASK_ABOUT_CANCER_TEXT);
        haveYouEverBeenDiagnosedWithAnyCancerRadioButton = testDataForIiqForm.get(iiq_Constants.HAVE_YOU_EVER_BEEN_DIAGNOSED_WITH_ANY_CANCER_RADIO_BUTTON);
        haveYouEverHadMedicalGeneticTestingRadioButton = testDataForIiqForm.get(iiq_Constants.HAVE_YOU_EVER_HAD_MEDICAL_GENETIC_TESTING_RADIO_BUTTON);
        pleaseFillTheTableBelowWithHeightNumericTextBox = testDataForIiqForm.get(iiq_Constants.PLEASE_FILL_THE_TABLE_BELOW_WITH_HEIGHT_NUMERIC_TEXT_BOX);
        pleaseFillTheTableBelowWithHeightUnitDropDown = testDataForIiqForm.get(iiq_Constants.PLEASE_FILL_THE_TABLE_BELOW_WITH_HEIGHT_UNIT_DROP_DOWN);
        pleaseFillTheTableBelowWithWeightCurrentNumericTextBox = testDataForIiqForm.get(iiq_Constants.PLEASE_FILL_THE_TABLE_BELOW_WITH_WEIGHT_CURRENT_NUMERIC_TEXT_BOX);
        pleaseFillTheTableBelowWithWeightCurrentUnitDropDown = testDataForIiqForm.get(iiq_Constants.PLEASE_FILL_THE_TABLE_BELOW_WITH_WEIGHT_CURRENT_UNIT_DROP_DOWN);
        pleaseFillTheTableBelowWithWeightDuringLifetimeNumericTextBox = testDataForIiqForm.get(iiq_Constants.PLEASE_FILL_THE_TABLE_BELOW_WITH_WEIGHT_DURING_LIFETIME_NUMERIC_TEXT_BOX);
        pleaseFillTheTableBelowWithWeightDuringLifetimeUnitDropDown = testDataForIiqForm.get(iiq_Constants.PLEASE_FILL_THE_TABLE_BELOW_WITH_WEIGHT_DURING_LIFETIME_UNIT_DROP_DOWN);
        pleaseFillTheTableBelowWithWeightAt18NumericTextBox = testDataForIiqForm.get(iiq_Constants.PLEASE_FILL_THE_TABLE_BELOW_WITH_WEIGHT_AT_18_NUMERIC_TEXT_BOX);
        pleaseFillTheTableBelowWithWeightAt18UnitDropDown = testDataForIiqForm.get(iiq_Constants.PLEASE_FILL_THE_TABLE_BELOW_WITH_WEIGHT_AT_18_UNIT_DROP_DOWN);
        atWhatAgeWereYouAtTheHighestWeightTextBox = testDataForIiqForm.get(iiq_Constants.AT_WHAT_AGE_WERE_YOU_AT_THE_HIGHEST_WEIGHT_TEXT_BOX);
        haveYouSoughtMedicalAdviceRegardingFertilityRadioButton = testDataForIiqForm.get(iiq_Constants.HAVE_YOU_SOUGHT_MEDICAL_ADVICE_REGARDING_FERTILITY_RADIO_BUTTON);
    }
}