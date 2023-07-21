package ServiceNow.CHARMS.ScenariosData;

import ServiceNow.CHARMS.Constants.CHARMSConstants;
import appsCommon.PageInitializer;
import com.nci.automation.dao.ExcelReader;

import java.util.Map;

public class TestDataManager extends PageInitializer {

    public Map<String, String> testDataForRasScreenerSubmission;
    public String areYouCompletingThisFormForSomeoneElseOrYourself;
    public String firstName;
    public String middleInitial;
    public String lastName;
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

    public void dataInitializer(String sheetName) {
        /**
         * FETCHING DATA FROM EXCEL BEFORE SUBMITTING SCREENER
         */
        testDataForRasScreenerSubmission = ExcelReader.excelIntoHashMap(CHARMSConstants.RAS_SELF_SUBMISSION_SCENARIOS_DATA, sheetName);

        areYouCompletingThisFormForSomeoneElseOrYourself = testDataForRasScreenerSubmission.get(rasScreenerConstants.areYouCompletingThisFormForSomeoneElse);
        firstName = testDataForRasScreenerSubmission.get(rasScreenerConstants.firstName);
        middleInitial = testDataForRasScreenerSubmission.get(rasScreenerConstants.middleInitial);
        lastName = testDataForRasScreenerSubmission.get(rasScreenerConstants.lastName);
        whatIsYourDateOfBirth = testDataForRasScreenerSubmission.get(rasScreenerConstants.whatIsYourDateOfBirth);
        dateOfBirthMonth = testDataForRasScreenerSubmission.get(rasScreenerConstants.dateOfBirthMonth);
        dateOfBirthYear = testDataForRasScreenerSubmission.get(rasScreenerConstants.dateOfBirthYear);
        sexAssignedAtBirthOption = testDataForRasScreenerSubmission.get(rasScreenerConstants.sexAssignedAtBirthOption);
        areYouAdoptedOption = testDataForRasScreenerSubmission.get(rasScreenerConstants.areYouAdoptedOption);
        countryOption = testDataForRasScreenerSubmission.get(rasScreenerConstants.whichCountryDoYouCurrentlyLiveInOption);
        street = testDataForRasScreenerSubmission.get(rasScreenerConstants.streetAddress);
        street2 = testDataForRasScreenerSubmission.get(rasScreenerConstants.street2Address);
        city = testDataForRasScreenerSubmission.get(rasScreenerConstants.cityText);
        state = testDataForRasScreenerSubmission.get(rasScreenerConstants.stateText);
        zipcode = testDataForRasScreenerSubmission.get(rasScreenerConstants.zipCodeText);
        emailAddress = testDataForRasScreenerSubmission.get(rasScreenerConstants.emailAddress);
        emailAddressConfirm = testDataForRasScreenerSubmission.get(rasScreenerConstants.confirmEmailAddress);
        homePhoneNumber = testDataForRasScreenerSubmission.get(rasScreenerConstants.homePhoneNumber);
        cellPhoneNumber = testDataForRasScreenerSubmission.get(rasScreenerConstants.cellPhoneNumber);
        workPhoneNumber = testDataForRasScreenerSubmission.get(rasScreenerConstants.workPhoneNumber);
        whatIsYourEthnicity = testDataForRasScreenerSubmission.get(rasScreenerConstants.whatIsYourEthnicity);
        whatIsYourRace = testDataForRasScreenerSubmission.get(rasScreenerConstants.whatIsYourRace);
        areYouAParticipantInOtherStudyGroup = testDataForRasScreenerSubmission.get(rasScreenerConstants.areYouAParticipantInOtherStudyGroup);
        haveYouBeenDiagnosedWithFollowingConditions = testDataForRasScreenerSubmission.get(rasScreenerConstants.haveYouBeenDiagnosedWithTheFollowingConditions);
        haveYouBeenDiagnosedWithCancer = testDataForRasScreenerSubmission.get(rasScreenerConstants.haveYouEverBeenDiagnosedWithCancer);
        haveYouBeenDiagnosedWithARasopathy = testDataForRasScreenerSubmission.get(rasScreenerConstants.haveYouBeenDiagnosedWithARasopathy);
        haveAnyOfYourBiologicalRelativesBeenDiagnosedWithARasopathy = testDataForRasScreenerSubmission.get(rasScreenerConstants.haveAnyBiologicalRelativesBeenDiagnosedWithARasopathy);
        haveYouEverHadGeneticTesting = testDataForRasScreenerSubmission.get(rasScreenerConstants.haveYouEverHadGeneticTesting);
        howDidYouHearAboutThisStudy = testDataForRasScreenerSubmission.get(rasScreenerConstants.howDidYouHearAboutThisStudy);
        howDidYouHearAboutThisStudyOtherReason = testDataForRasScreenerSubmission.get(rasScreenerConstants.howDidYouHearAboutThisStudyOtherReason);
        haveYouOrOtherFamilyMembersParticipatedInOtherStudy = testDataForRasScreenerSubmission.get(rasScreenerConstants.haveYouOrOtherFamilyMembersParticipatedInOtherStudy);
        whatAreMainReasonsForParticipatingInStudy = testDataForRasScreenerSubmission.get(rasScreenerConstants.whatAreTheMainReasonsForParticipatingInThisStudy);
        whatAreMainReasonsForParticipatingInStudyOtherReason = testDataForRasScreenerSubmission.get(rasScreenerConstants.getWhatAreTheMainReasonsForParticipatingInThisStudyOtherReason);


    }
}
