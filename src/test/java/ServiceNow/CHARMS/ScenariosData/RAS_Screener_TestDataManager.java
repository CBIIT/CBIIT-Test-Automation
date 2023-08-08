package ServiceNow.CHARMS.ScenariosData;

import ServiceNow.CHARMS.Constants.CHARMSConstants;
import appsCommon.PageInitializer;
import com.nci.automation.dao.ExcelReader;
import java.util.Map;

public class RAS_Screener_TestDataManager extends PageInitializer {

    /**
     * RAS SCREENER VARIABLES
     */
    public Map<String, String> testDataForRasScreener;
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
    public String whatIsTheNameOfThePersonWhoMayBeEligibleForThisStudyFirst;
    public String whatIsTheNameOfThePersonWhoMayBeEligibleForThisStudyMi;
    public String whatIsTheNameOfThePersonWhoMayBeEligibleForThisStudyLast;

    public void dataInitializerRasScreener(String sheetName) {
        /**
         * FETCHING DATA FROM EXCEL BEFORE SUBMITTING SCREENER
         */
        testDataForRasScreener = ExcelReader.excelIntoHashMap(CHARMSConstants.RAS_SCENARIO_ONE_DATA, sheetName);

        if (sheetName.equals("screenerScenario1")) {
            areYouCompletingThisFormForSomeoneElseOrYourself = testDataForRasScreener.get(ras_Screener_Constants.ARE_YOU_COMPLETING_THIS_FORM_FOR_SOMEONE_ELSE);
            firstName = testDataForRasScreener.get(ras_Screener_Constants.FIRST_NAME);
            middleInitial = testDataForRasScreener.get(ras_Screener_Constants.MIDDLE_INITIAL);
            lastName = testDataForRasScreener.get(ras_Screener_Constants.LAST_NAME);
            whatIsYourDateOfBirth = testDataForRasScreener.get(ras_Screener_Constants.WHAT_IS_YOUR_DATE_OF_BIRTH);
            dateOfBirthMonth = testDataForRasScreener.get(ras_Screener_Constants.DATE_OF_BIRTH_MONTH);
            dateOfBirthYear = testDataForRasScreener.get(ras_Screener_Constants.DATE_OF_BIRTH_YEAR);
            sexAssignedAtBirthOption = testDataForRasScreener.get(ras_Screener_Constants.SEX_ASSIGNED_AT_BIRTH_OPTION);
            areYouAdoptedOption = testDataForRasScreener.get(ras_Screener_Constants.ARE_YOU_ADOPTED_OPTION);
            countryOption = testDataForRasScreener.get(ras_Screener_Constants.WHICH_COUNTRY_DO_YOU_CURRENTLY_LIVE_IN_OPTION);
            street = testDataForRasScreener.get(ras_Screener_Constants.STREET_ADDRESS);
            street2 = testDataForRasScreener.get(ras_Screener_Constants.STREET_2_ADDRESS);
            city = testDataForRasScreener.get(ras_Screener_Constants.CITY_TEXT);
            state = testDataForRasScreener.get(ras_Screener_Constants.STATE_TEXT);
            zipcode = testDataForRasScreener.get(ras_Screener_Constants.ZIP_CODE_TEXT);
            emailAddress = testDataForRasScreener.get(ras_Screener_Constants.EMAIL_ADDRESS);
            emailAddressConfirm = testDataForRasScreener.get(ras_Screener_Constants.CONFIRM_EMAIL_ADDRESS);
            homePhoneNumber = testDataForRasScreener.get(ras_Screener_Constants.HOME_PHONE_NUMBER);
            cellPhoneNumber = testDataForRasScreener.get(ras_Screener_Constants.CELL_PHONE_NUMBER);
            workPhoneNumber = testDataForRasScreener.get(ras_Screener_Constants.WORK_PHONE_NUMBER);
            whatIsYourEthnicity = testDataForRasScreener.get(ras_Screener_Constants.WHAT_IS_YOUR_ETHNICITY);
            whatIsYourRace = testDataForRasScreener.get(ras_Screener_Constants.WHAT_IS_YOUR_RACE);
            areYouAParticipantInOtherStudyGroup = testDataForRasScreener.get(ras_Screener_Constants.ARE_YOU_A_PARTICIPANT_IN_OTHER_STUDY_GROUP);
            haveYouBeenDiagnosedWithFollowingConditions = testDataForRasScreener.get(ras_Screener_Constants.HAVE_YOU_BEEN_DIAGNOSED_WITH_THE_FOLLOWING_CONDITIONS);
            haveYouBeenDiagnosedWithCancer = testDataForRasScreener.get(ras_Screener_Constants.HAVE_YOU_EVER_BEEN_DIAGNOSED_WITH_CANCER);
            haveYouBeenDiagnosedWithARasopathy = testDataForRasScreener.get(ras_Screener_Constants.HAVE_YOU_BEEN_DIAGNOSED_WITH_A_RASOPATHY);
            haveAnyOfYourBiologicalRelativesBeenDiagnosedWithARasopathy = testDataForRasScreener.get(ras_Screener_Constants.HAVE_ANY_BIOLOGICAL_RELATIVES_BEEN_DIAGNOSED_WITH_ARASOPATHY);
            haveYouEverHadGeneticTesting = testDataForRasScreener.get(ras_Screener_Constants.HAVE_YOU_EVER_HAD_GENETIC_TESTING);
            howDidYouHearAboutThisStudy = testDataForRasScreener.get(ras_Screener_Constants.HOW_DID_YOU_HEAR_ABOUT_THIS_STUDY);
            howDidYouHearAboutThisStudyOtherReason = testDataForRasScreener.get(ras_Screener_Constants.HOW_DID_YOU_HEAR_ABOUT_THIS_STUDY_OTHER_REASON);
            haveYouOrOtherFamilyMembersParticipatedInOtherStudy = testDataForRasScreener.get(ras_Screener_Constants.HAVE_YOU_OR_OTHER_FAMILY_MEMBERS_PARTICIPATED_IN_OTHER_STUDY);
            whatAreMainReasonsForParticipatingInStudy = testDataForRasScreener.get(ras_Screener_Constants.WHAT_ARE_THE_MAIN_REASONS_FOR_PARTICIPATING_IN_THIS_STUDY);
            whatAreMainReasonsForParticipatingInStudyOtherReason = testDataForRasScreener.get(ras_Screener_Constants.WHAT_ARE_THE_MAIN_REASONS_FOR_PARTICIPATING_IN_THIS_STUDY_OTHER_REASON);
        } else if (sheetName.equals("screenerScenario2")) {
            areYouCompletingThisFormForSomeoneElseOrYourself = testDataForRasScreener.get(ras_Screener_Constants.ARE_YOU_COMPLETING_THIS_FORM_FOR_SOMEONE_ELSE);

        }
    }
}