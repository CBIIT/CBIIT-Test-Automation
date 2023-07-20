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
        doYouConsiderYourselfToBeRadioButton = testDataForRasScreenerSubmissionIiqScenario1.get(rASScreenerScenario1_Constants.FOR_WHICH_SEX_DO_DO_YOU_IDENTIFY_RADIO_BUTTON);
    }
}