package ServiceNow.CHARMS.ScenariosData;

import ServiceNow.CHARMS.Constants.CHARMSConstants;
import appsCommon.PageInitializer;
import com.nci.automation.dao.ExcelReader;
import java.util.Map;

public class TestDataManager extends PageInitializer {

    public Map<String, String> testDataForRasScreenerScenario1;
    public String areYouCompletingThisFormForSomeoneElseOrYourself;
    public String firstName;
    public String middleInitial;
    public  String lastName;
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

    public void dataInitializer(String sheetName){
        /**
         * FETCHING DATA FROM EXCEL BEFORE SUBMITTING SCREENER
         */
        testDataForRasScreenerScenario1 = ExcelReader.excelIntoHashMap(CHARMSConstants.RAS_SELF_SUBMISSION_SCENARIOS_DATA, sheetName);

        areYouCompletingThisFormForSomeoneElseOrYourself = testDataForRasScreenerScenario1.get(rasScreenerConstants.areYouCompletingThisFormForSomeoneElse);
        firstName = testDataForRasScreenerScenario1.get(rasScreenerConstants.firstName);
        middleInitial = testDataForRasScreenerScenario1.get(rasScreenerConstants.middleInitial);
        lastName = testDataForRasScreenerScenario1.get(rasScreenerConstants.lastName);
        dateOfBirthMonth = testDataForRasScreenerScenario1.get(rasScreenerConstants.dateOfBirthMonth);
        dateOfBirthYear = testDataForRasScreenerScenario1.get(rasScreenerConstants.dateOfBirthYear);
        sexAssignedAtBirthOption = testDataForRasScreenerScenario1.get(rasScreenerConstants.sexAssignedAtBirthOption);
        areYouAdoptedOption = testDataForRasScreenerScenario1.get(rasScreenerConstants.areYouAdoptedOption);
        countryOption = testDataForRasScreenerScenario1.get(rasScreenerConstants.whichCountryDoYouCurrentlyLiveInOption);
        street = testDataForRasScreenerScenario1.get(rasScreenerConstants.streetAddress);
        street2 = testDataForRasScreenerScenario1.get(rasScreenerConstants.street2Address);
        city = testDataForRasScreenerScenario1.get(rasScreenerConstants.cityText);
        state = testDataForRasScreenerScenario1.get(rasScreenerConstants.stateText);
        zipcode = testDataForRasScreenerScenario1.get(rasScreenerConstants.zipCodeText);
        emailAddress = testDataForRasScreenerScenario1.get(rasScreenerConstants.emailAddress);
        emailAddressConfirm = testDataForRasScreenerScenario1.get(rasScreenerConstants.confirmEmailAddress);
        homePhoneNumber = testDataForRasScreenerScenario1.get(rasScreenerConstants.homePhoneNumber);
        cellPhoneNumber = testDataForRasScreenerScenario1.get(rasScreenerConstants.cellPhoneNumber);
        workPhoneNumber = testDataForRasScreenerScenario1.get(rasScreenerConstants.workPhoneNumber);
        whatIsYourEthnicity = testDataForRasScreenerScenario1.get(rasScreenerConstants.whatIsYourEthnicity);
        whatIsYourRace = testDataForRasScreenerScenario1.get(rasScreenerConstants.whatIsYourRace);
        areYouAParticipantInOtherStudyGroup = testDataForRasScreenerScenario1.get(rasScreenerConstants.areYouAParticipantInOtherStudyGroup);
        haveYouBeenDiagnosedWithFollowingConditions = testDataForRasScreenerScenario1.get(rasScreenerConstants.haveYouBeenDiagnosedWithTheFollowingConditions);
        haveYouBeenDiagnosedWithCancer = testDataForRasScreenerScenario1.get(rasScreenerConstants.haveYouEverBeenDiagnosedWithCancer);
        haveYouBeenDiagnosedWithARasopathy = testDataForRasScreenerScenario1.get(rasScreenerConstants.haveYouBeenDiagnosedWithARasopathy);
        haveAnyOfYourBiologicalRelativesBeenDiagnosedWithARasopathy = testDataForRasScreenerScenario1.get(rasScreenerConstants.haveAnyBiologicalRelativesBeenDiagnosedWithARasopathy);
        haveYouEverHadGeneticTesting = testDataForRasScreenerScenario1.get(rasScreenerConstants.haveYouEverHadGeneticTesting);
        howDidYouHearAboutThisStudy = testDataForRasScreenerScenario1.get(rasScreenerConstants.howDidYouHearAboutThisStudy);
        howDidYouHearAboutThisStudyOtherReason = testDataForRasScreenerScenario1.get(rasScreenerConstants.howDidYouHearAboutThisStudyOtherReason);
        haveYouOrOtherFamilyMembersParticipatedInOtherStudy = testDataForRasScreenerScenario1.get(rasScreenerConstants.haveYouOrOtherFamilyMembersParticipatedInOtherStudy);
        whatAreMainReasonsForParticipatingInStudy = testDataForRasScreenerScenario1.get(rasScreenerConstants.whatAreTheMainReasonsForParticipatingInThisStudy);
        whatAreMainReasonsForParticipatingInStudyOtherReason = testDataForRasScreenerScenario1.get(rasScreenerConstants.getWhatAreTheMainReasonsForParticipatingInThisStudyOtherReason);
    }
}