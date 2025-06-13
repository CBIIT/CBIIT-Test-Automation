package CHARMS.stepsImplementation;

import APPS_COMMON.PageInitializers.PageInitializer;
import CHARMS.constants.CHARMS_Data_File_Path_Constants;
import CHARMS.constants.MetforminScreenerConstants;
import CHARMS.utils.CharmsUtil;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.CommonUtils;
import org.testng.asserts.SoftAssert;

public class MetforminScreenerStepsImpl extends PageInitializer {
    static SoftAssert softAssert = new SoftAssert();
    String metforminScreenerData = CHARMS_Data_File_Path_Constants.METFORMIN_SCREENER_DATA;

    /*** THIS METHOD WILL RUN RESET SCRIPT TO RESET THE TEST ACCOUNTS ***/
    public void runResetScripts() {
        String testURl = "https://service-test.nci.nih.gov/now/nav/ui/classic/params/target/sys_script_fix.do%3Fsys_id%3D88bd66bc872866d07e87a8a60cbb35ee%26sysparm_record_target%3Dsys_script_fix%26sysparm_record_row%3D14%26sysparm_record_rows%3D1440%26sysparm_record_list%3DORDERBYDESCsys_updated_on";
        String devURL = "https://service-dev2.nci.nih.gov/now/nav/ui/classic/params/target/sys_script_fix.do%3Fsys_id%3D88bd66bc872866d07e87a8a60cbb35ee%26sysparm_record_target%3Dsys_script_fix%26sysparm_record_row%3D14%26sysparm_record_rows%3D1440%26sysparm_record_list%3DORDERBYDESCsys_updated_on";

        CharmsUtil.loginToNativeView();   // TODO: Implement login logic for NativeView Side door Login URL
        CharmsUtil.resetTestAccountSignIn(testURl, devURL);   // TODO: SignIn to the reset script for Metformin screener
        CharmsUtil.resetTestAccount();  // TODO: Implement the logic to reset the test account for Metformin screener
        CharmsUtil.nativeViewProfileLogOut();     // TODO: Implement the logic to log out of the NativeView profile for Metformin screener
    }

    /*** THIS METHOD WILL SELECT THE SCREENER SUBMISSION ACCORDING TO THE SHEET CHOSEN IN THE FEATURE FILE ***/
    public void metforminScreenerScenarioSubmission(String metforminScreenerScenario) {
        metforminScreener_TestDataManager.dataInitializerMetforminScreener(metforminScreenerScenario);
        metforminScreenerSubmission(metforminScreenerScenario);
    }

    /*** THIS METHOD WILL SUBMIT AND ASSERT THE METFORMIN SCREENER FROM PORTAL ***/
    private void metforminScreenerSubmission(String sheetName) {
        if (sheetName.equals("MetforminScreenerScenario1")) {
            bannerAssertionsForMetforminForm();
            participantNameInformationDetails();
            participantBasicInformationDetails();
            participantContactInformationSubmission();
            participantOtherInformationDetails();
            participantLiFraumeniSyndromeDetails();
            participantCancerDiagnosis();
            participantCancerTreatmentDetails();
            participantStudyDetails();
            softAssert.assertAll();
        }
    }

    /*** THIS METHOD WILL ASSERT THE BANNERS IN METFORMIN SCREENER FROM PORTAL ***/
    public void bannerAssertionsForMetforminForm() {
        String header1 = "NCI Family Studies Hub";
        String header2 = "Welcome to the Metformin Cancer Survey!";
        String header3 = "Metformin in Li-Fraumeni (MILI-NCI) Screener";
        String header4 = "MILI-NCI Study";
        String header5 = "Our Goal";
        String header6 = "Who can join?";
        String header7 = "What to expect?";
        String header8 = "Contact";
        String header9 = "Survey Instructions";
        String header10 = "Click here to Start";
        String header11 = "Thank you for starting the Metformin Cancer Survey screening at the National Cancer Institute!";
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorTextBoxUsingP(header2), header2, header2 + " Label ");
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorTextBoxUsingH(header3), header3, header3 + " Label ");
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorTextBoxUsingH(header4), header4, header4 + " Label ");
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorTextBoxUsingH(header5), header5, header5 + " Label ");
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorTextBoxUsingH(header6), header6, header6 + " Label ");
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorTextBoxUsingH(header7), header7, header7 + " Label ");
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorTextBoxUsingH(header8), header8, header8 + " Label ");
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorTextBoxUsingH(header9), header9, header9 + " Label ");
        CharmsUtil.assertButtonLabel(softAssert, metforminScreenerPage.dynamicLocatorUsingNormalizeSpace(header10), header10, header10 + " Label ");
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorTextBoxUsingP(header11), header11, header11 + " Label ");
        CharmsUtil.clickOnElement(metforminScreenerPage.dynamicLocatorForButtonUsingNormalizeSpace(header10));
        CommonUtils.sleep(1000);
        CucumberLogUtils.logScreenshot();
    }

    /*** THIS METHOD WILL SUBMIT AND ASSERT THE PARTICIPANT NAME INFORMATION IN METFORMIN SCREENER FROM PORTAL ***/
    private void participantNameInformationDetails() {
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorWithAUsingNormalizeSpace("Home"), "Home", " Home Label");
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.metforminScreenerTitle, "Metformin Screener", "Metformin Screener Label");
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorTextBoxUsingH2("Metformin Screener"), "Metformin Screener", " Metformin Screener Label");
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingSpanNormalizeSpace("Indicates required"), "Indicates required", " Indicates required Label");
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingSpanNormalizeSpace(MetforminScreenerConstants.ARE_YOU_COMPLETING_THIS_QUESTIONNAIRE_FOR_SOMEONE_ELSE), MetforminScreenerConstants.ARE_YOU_COMPLETING_THIS_QUESTIONNAIRE_FOR_SOMEONE_ELSE, " Are you completing this questionnaire for someone else? Label ");
        CharmsUtil.SelectValueFromDropDown(metforminScreenerPage.dynamicLocatorUsingSpanContainText("-- None --"), MetforminScreenerConstants.RELATIONSHIP_TO_PARTICIPANT, metforminScreener_TestDataManager.areYouCompletingThisQuestionnaireForSomeoneElse);
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingSpanContainText(MetforminScreenerConstants.WHAT_IS_YOUR_NAME), MetforminScreenerConstants.WHAT_IS_YOUR_NAME, " What is your name? Label ");
        /***** NAME *****/
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingSpanContainTextAndIndex(MetforminScreenerConstants.FIRST_NAME, 2), MetforminScreenerConstants.FIRST_NAME, " First Name Label ");
        CharmsUtil.sendKeysToElement(metforminScreenerPage.dynamicLocatorForInputElementInMetforminScreener(MetforminScreenerConstants.FIRST_NAME, 2), metforminScreener_TestDataManager.firstName);
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingSpanContainTextAndIndex(MetforminScreenerConstants.MIDDLE_INITIAL, 2), MetforminScreenerConstants.MIDDLE_INITIAL, " First Name Label ");
        CharmsUtil.sendKeysToElement(metforminScreenerPage.dynamicLocatorForInputElementInMetforminScreener(MetforminScreenerConstants.MIDDLE_INITIAL, 2), metforminScreener_TestDataManager.middleInitial);
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingSpanContainTextAndIndex(MetforminScreenerConstants.LAST_NAME, 2), MetforminScreenerConstants.LAST_NAME, " First Name Label ");
        CharmsUtil.sendKeysToElement(metforminScreenerPage.dynamicLocatorForInputElementInMetforminScreener(MetforminScreenerConstants.LAST_NAME, 2), metforminScreener_TestDataManager.lastName);
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingLabelContainsText(MetforminScreenerConstants.THE_NEXT_SET_OF_QUESTIONS_WILL_COLLECT_BASIC_INFORMATION_ABOUT_YOU_THE_PARTICIPANT), MetforminScreenerConstants.THE_NEXT_SET_OF_QUESTIONS_WILL_COLLECT_BASIC_INFORMATION_ABOUT_YOU_THE_PARTICIPANT, " The next set of questions will collect basic information about you/the participant. Label");
    }

    /*** THIS METHOD WILL SUBMIT AND ASSERT THE PARTICIPANT BASIC INFORMATION IN METFORMIN SCREENER FROM PORTAL ***/
    private void participantBasicInformationDetails() {
        /***** DOB *****/
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.metforminParticipantDOBLabel, MetforminScreenerConstants.WHAT_IS_YOUR_THE_PARTICIPANTS_DATE_OF_BIRTH, " What is your/the participant's date of birth? Label ");
        CharmsUtil.sendKeysToElement(metforminScreenerPage.dynamicLocatorForInputElementUsingNameInMetforminScreener("date_of_birth", 1), metforminScreener_TestDataManager.whatIsYourTheParticipantsDateOfBirth);
        /***** SEX *****/
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingSpanAriaLabel(MetforminScreenerConstants.WHAT_IS_YOUR_THE_PARTICIPANTS_SEX), MetforminScreenerConstants.WHAT_IS_YOUR_THE_PARTICIPANTS_SEX, " What is your/the participant's sex? Label");
        CharmsUtil.SelectValueFromDropDown(metforminScreenerPage.metforminParticipantSexInput, MetforminScreenerConstants.PARTICIPANT_SEX, metforminScreener_TestDataManager.whatIsYouTheParticipantsSex);
        /***** ADOPTED *****/
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.metforminParticipantAdoptedLabel, MetforminScreenerConstants.ARE_YOU_THE_PARTICIPANT_ADOPTED, " Are you/the participant adopted? Label");
        CharmsUtil.SelectValueFromDropDown(metforminScreenerPage.dynamicLocatorUsingSpanId("4"), MetforminScreenerConstants.YES_NO, metforminScreener_TestDataManager.areYouTheParticipantAdopted);
    }

    /*** THIS METHOD WILL SUBMIT AND ASSERT THE PARTICIPANT CONTACT INFORMATION IN METFORMIN SCREENER FROM PORTAL ***/
    private void participantContactInformationSubmission() {
        /***** COUNTRY *****/
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingSpanAriaLabel(MetforminScreenerConstants.IN_WHICH_COUNTRY_DO_YOU_THE_PARTICIPANT_CURRENTLY_LIVE), MetforminScreenerConstants.IN_WHICH_COUNTRY_DO_YOU_THE_PARTICIPANT_CURRENTLY_LIVE, " In which country do you/the participant currently live? Label");
        CharmsUtil.clickOnElement(metforminScreenerPage.metforminParticipantCountryInput);
        CommonUtils.sleep(500);
        CharmsUtil.sendKeysToElement(metforminScreenerPage.metforminParticipantCountryInput1, metforminScreener_TestDataManager.inWhichCountryDoYouTheParticipantCurrentlyLive);
        metforminScreenerPage.metforminParticipantCountryInput1.sendKeys(org.openqa.selenium.Keys.TAB);
        /***** ADDRESS *****/
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingLabelContainText(MetforminScreenerConstants.PLEASE_PROVIDE_THE_MAILING_ADDRESS_WHERE_STUDY_MATERIALS_CAN_BE_SENT_AS_NEEDED), MetforminScreenerConstants.PLEASE_PROVIDE_THE_MAILING_ADDRESS_WHERE_STUDY_MATERIALS_CAN_BE_SENT_AS_NEEDED, " Please provide the mailing address where study materials can be sent, as needed. Label");
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingSpanNormalizeSpace(MetforminScreenerConstants.STREET), MetforminScreenerConstants.STREET, " Street Label");
        CharmsUtil.sendKeysToElement(metforminScreenerPage.dynamicLocatorForInputElementUsingNameInMetforminScreener("street_address", 1), metforminScreener_TestDataManager.street);
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingSpanNormalizeSpace(MetforminScreenerConstants.STREET_2_OPTIONAL), MetforminScreenerConstants.STREET_2_OPTIONAL, " Street 2 (Optional) Label");
        CharmsUtil.sendKeysToElement(metforminScreenerPage.dynamicLocatorForInputElementUsingNameInMetforminScreener("street_address2", 1), metforminScreener_TestDataManager.street2Optional);
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingSpanNormalizeSpace(MetforminScreenerConstants.CITY), MetforminScreenerConstants.CITY, " City Label");
        CharmsUtil.sendKeysToElement(metforminScreenerPage.dynamicLocatorForInputElementUsingNameInMetforminScreener("city", 1), metforminScreener_TestDataManager.city);
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingSpanNormalizeSpace(MetforminScreenerConstants.STATE_ABBREVIATION), MetforminScreenerConstants.STATE_ABBREVIATION, " State (Abbreviation) Label");
        CharmsUtil.sendKeysToElement(metforminScreenerPage.dynamicLocatorForInputElementUsingNameInMetforminScreener("state", 1), metforminScreener_TestDataManager.stateAbbreviation);
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingSpanNormalizeSpace(MetforminScreenerConstants.ZIP_CODE), MetforminScreenerConstants.ZIP_CODE, " Zip Code Label");
        CharmsUtil.sendKeysToElement(metforminScreenerPage.dynamicLocatorForInputElementUsingNameInMetforminScreener("zip_code", 1), metforminScreener_TestDataManager.zipCode);
    }

    /*** THIS METHOD WILL SUBMIT AND ASSERT THE PARTICIPANT OTHER INFORMATION IN METFORMIN SCREENER FROM PORTAL ***/
    private void participantOtherInformationDetails() {
        /***** EMAIL *****/
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.metforminParticipantEmailAddressLabel, MetforminScreenerConstants.WHAT_IS_YOUR_THE_PARTICIPANTS_EMAIL_ADDRESS, " Zip Code Label");
        CharmsUtil.sendKeysToElement(metforminScreenerPage.dynamicLocatorForInputElementUsingNameInMetforminScreener("email_address", 1), metforminScreener_TestDataManager.whatIsYourTheParticipantsEmailAddress);
        metforminScreenerPage.dynamicLocatorForInputElementUsingNameInMetforminScreener("email_address", 1).sendKeys(org.openqa.selenium.Keys.TAB);
        /***** CONFIRM EMAIL *****/
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingSpanAriaLabel("Read only - Please confirm your/the participant's email address."), MetforminScreenerConstants.PLEASE_CONFIRM_YOUR_THE_PARTICIPANTS_EMAIL_ADDRESS, " Please confirm your/the participant's email address. Label");
        CharmsUtil.sendKeysToElement(metforminScreenerPage.dynamicLocatorForInputElementUsingNameInMetforminScreener("confirm_email_address", 1), metforminScreener_TestDataManager.pleaseConfirmYourTheParticipantsEmailAddress);
        /***** PHONE NUMBER *****/
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingSpanContainText(MetforminScreenerConstants.PLEASE_LIST_YOUR_THE_PARTICIPANTS_PHONE_NUMBERS_BELOW_AND_INCLUDE_COUNTRY_CODE), MetforminScreenerConstants.PLEASE_LIST_YOUR_THE_PARTICIPANTS_PHONE_NUMBERS_BELOW_AND_INCLUDE_COUNTRY_CODE, " Please list your/the participant's phone numbers below and include country code. Label");
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingSpanContainText(MetforminScreenerConstants.PLEASE_LIST_YOUR_THE_PARTICIPANTS_PHONE_NUMBERS_BELOW_AND_INCLUDE_COUNTRY_CODE), MetforminScreenerConstants.PLEASE_LIST_YOUR_THE_PARTICIPANTS_PHONE_NUMBERS_BELOW_AND_INCLUDE_COUNTRY_CODE, " Please list your/the participant's phone numbers below and include country code. Label");
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorTextBoxUsingP(MetforminScreenerConstants.PLEASE_ALSO_SELECT_YOUR_PREFERRED_CONTACT_NUMBER), MetforminScreenerConstants.PLEASE_ALSO_SELECT_YOUR_PREFERRED_CONTACT_NUMBER, " Please also select your preferred contact number. Label");
        /***** HOME PHONE NUMBER *****/
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingSpanNormalizeSpace(MetforminScreenerConstants.HOME_PHONE_NUMBER), MetforminScreenerConstants.HOME_PHONE_NUMBER, " 'Home Phone Number Label");
        CharmsUtil.sendKeysToElement(metforminScreenerPage.dynamicLocatorForInputElementInMetforminScreener(MetforminScreenerConstants.HOME_PHONE_NUMBER, 1), metforminScreener_TestDataManager.homePhoneNumber);
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingSpanContainTextAndIndex(MetforminScreenerConstants.PREFERRED, 1), MetforminScreenerConstants.PREFERRED, " 'Preferred Home Phone Number Label");
        CharmsUtil.assertCheckBox(softAssert, metforminScreenerPage.dynamicLocatorUsingSpanContainTextAndIndex(MetforminScreenerConstants.PREFERRED, 1), false, "Preferred Home Phone Number Checkbox selected");
        /***** WORK PHONE NUMBER *****/
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingSpanNormalizeSpace(MetforminScreenerConstants.WORK_PHONE_NUMBER), MetforminScreenerConstants.WORK_PHONE_NUMBER, " Work Phone Number Label");
        CharmsUtil.sendKeysToElement(metforminScreenerPage.dynamicLocatorForInputElementInMetforminScreener(MetforminScreenerConstants.WORK_PHONE_NUMBER, 1), metforminScreener_TestDataManager.workPhoneNumber);
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingSpanContainTextAndIndex(MetforminScreenerConstants.PREFERRED, 3), MetforminScreenerConstants.PREFERRED, " Preferred Work Phone Number Label");
        CharmsUtil.assertCheckBox(softAssert, metforminScreenerPage.dynamicLocatorUsingSpanContainTextAndIndex(MetforminScreenerConstants.PREFERRED, 3), false, " Preferred Cell Phone Number Checkbox selected");
        CharmsUtil.clickOnElement(metforminScreenerPage.dynamicLocatorUsingSpanContainTextAndIndex(MetforminScreenerConstants.PREFERRED, 3));
        /***** CELL PHONE NUMBER *****/
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingSpanNormalizeSpace(MetforminScreenerConstants.CELL_PHONE_NUMBER), MetforminScreenerConstants.CELL_PHONE_NUMBER, " Cell Phone Number Label");
        CharmsUtil.sendKeysToElement(metforminScreenerPage.dynamicLocatorForInputElementInMetforminScreener(MetforminScreenerConstants.CELL_PHONE_NUMBER, 1), metforminScreener_TestDataManager.cellPhoneNumber);
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingSpanContainTextAndIndex(MetforminScreenerConstants.PREFERRED, 2), MetforminScreenerConstants.PREFERRED, " Preferred Cell Phone Number Label");
        CharmsUtil.assertCheckBox(softAssert, metforminScreenerPage.dynamicLocatorUsingSpanContainTextAndIndex(MetforminScreenerConstants.PREFERRED, 2), false, " Preferred Cell Phone Number Checkbox selected");
        /***** RACE *****/
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.metforminParticipantRaceLabel, MetforminScreenerConstants.WHAT_IS_YOUR_THE_PARTICIPANTS_RACE_PLEASE_SELECT_ALL_THAT_APPLY, "What is your/the participant's race? Please select all that apply. Label");
        CharmsUtil.SelectValueFromDropDown(metforminScreenerPage.metforminParticipantRaceInput, MetforminScreenerConstants.RACE, metforminScreener_TestDataManager.whatIsYourTheParticipantsRacePleaseSelectAllThatApply);
        metforminScreenerPage.metforminParticipantRaceInput.sendKeys(org.openqa.selenium.Keys.TAB);
        /***** ETHNICITY *****/
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingSpanContainText(MetforminScreenerConstants.WHAT_IS_YOUR_THE_PARTICIPANTS_ETHNICITY), MetforminScreenerConstants.WHAT_IS_YOUR_THE_PARTICIPANTS_ETHNICITY, "What is your/the participant's ethnicity? Label");
        CharmsUtil.SelectValueFromDropDown(metforminScreenerPage.dynamicLocatorUsingSpanContainTextAndIndex("-- None --", 3), MetforminScreenerConstants.ETHNICITY, metforminScreener_TestDataManager.whatIsYourTheParticipantsEthnicity);
        CucumberLogUtils.logScreenshot();
    }

    /*** THIS METHOD WILL SUBMIT AND ASSERT THE PARTICIPANT CONTACT INFORMATION IN METFORMIN SCREENER FROM PORTAL ***/
    private void participantLiFraumeniSyndromeDetails() {
        /*****  Li-Fraumeni syndrome study *****/
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingSpanNormalizeSpace(MetforminScreenerConstants.HAVE_YOU_THE_PARTICIPANT_EVER_PARTICIPATED_IN_A_LIFRAUMENI_SYNDROME_STUDY), MetforminScreenerConstants.HAVE_YOU_THE_PARTICIPANT_EVER_PARTICIPATED_IN_A_LIFRAUMENI_SYNDROME_STUDY, " Have you/the participant ever participated in a Li-Fraumeni syndrome study? Label");
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingSpanContainTitleAndIndex(MetforminScreenerConstants.EG_AT_ANOTHER_MEDICAL_INSTITUTION_UNIVERSITY_GOVERNMENT_AGENCY_OR_OTHER_SITE, 1), MetforminScreenerConstants.EG_AT_ANOTHER_MEDICAL_INSTITUTION_UNIVERSITY_GOVERNMENT_AGENCY_OR_OTHER_SITE, " e.g. at another medical institution, university, government agency, or other site\n Label");
        CharmsUtil.SelectValueFromDropDown(metforminScreenerPage.dynamicLocatorUsingSpanId("6"), MetforminScreenerConstants.YES_NO_UNKNOWN_UNSURE, metforminScreener_TestDataManager.haveYouTheParticipantEverParticipatedInALiFraumeniSyndromeStudy);
        /***** study(ies) or registry group(s) *****/
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingSpanNormalizeSpace(MetforminScreenerConstants.PLEASE_SPECIFY_THE_STUDYIES_OR_REGISTRY_GROUPS_REGARDING_PARTICIPATION_IN_OTHER_STUDIES), MetforminScreenerConstants.PLEASE_SPECIFY_THE_STUDYIES_OR_REGISTRY_GROUPS_REGARDING_PARTICIPATION_IN_OTHER_STUDIES, " Please specify the studies or registry groups regarding participation in other studies. Label");
        CharmsUtil.SelectValueFromDropDown(metforminScreenerPage.dynamicLocatorUsingSpanId("7"), MetforminScreenerConstants.GROUP_STUDIES, metforminScreener_TestDataManager.pleaseSpecifyTheStudiesOrRegistryGroupsRegardingParticipationInOtherStudies);
        /***** Li-Fraumeni syndrome management *****/
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingSpanNormalizeSpace(MetforminScreenerConstants.DO_YOU_CURRENTLY_RECEIVE_REGULAR_LI_FRAUMENI_SYNDROME_SCREENING_OR_MANAGEMENT), MetforminScreenerConstants.DO_YOU_CURRENTLY_RECEIVE_REGULAR_LI_FRAUMENI_SYNDROME_SCREENING_OR_MANAGEMENT, " Do you currently receive regular Li-Fraumeni syndrome screening or management? Label");
        CharmsUtil.SelectValueFromDropDown(metforminScreenerPage.dynamicLocatorUsingSpanId("8"), MetforminScreenerConstants.YES_NO_UNKNOWN_UNSURE, metforminScreener_TestDataManager.doYouCurrentlyReceiveRegularLiFraumeniSyndromeScreeningOrManagement);
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingLabelContainText("Provide information about the institution where yo"), MetforminScreenerConstants.PROVIDE_INFORMATION_ABOUT_THE_INSTITUTION_WHERE_YOU_THE_PARTICIPANT_RECEIVE_REGULAR_LIFRAUMENI_SYNDROME_MANAGEMENT, " Provide information about the institution where you/the participant receive regular Li-Fraumeni syndrome management. Label");
        /***** Physician Name **/
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingSpanNormalizeSpace(MetforminScreenerConstants.PHYSICIAN_NAME), MetforminScreenerConstants.PHYSICIAN_NAME, " Physician Name Label");
        CharmsUtil.sendKeysToElement(metforminScreenerPage.dynamicLocatorForInputElementInMetforminScreener(MetforminScreenerConstants.PHYSICIAN_NAME, 1), metforminScreener_TestDataManager.physicianName);
        /***** Institution Name **/
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingSpanNormalizeSpace(MetforminScreenerConstants.INSTITUTION_NAME), MetforminScreenerConstants.INSTITUTION_NAME, " Institution Name Label");
        CharmsUtil.sendKeysToElement(metforminScreenerPage.dynamicLocatorForInputElementInMetforminScreener(MetforminScreenerConstants.INSTITUTION_NAME, 1), metforminScreener_TestDataManager.institutionName);
        /***** City State Province Name **/
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingSpanNormalizeSpace(MetforminScreenerConstants.CITY_STATE_PROVINCE), MetforminScreenerConstants.CITY_STATE_PROVINCE, " City, State/Province Label");
        CharmsUtil.sendKeysToElement(metforminScreenerPage.dynamicLocatorForInputElementInMetforminScreener(MetforminScreenerConstants.CITY_STATE_PROVINCE, 1), metforminScreener_TestDataManager.cityStateProvince);
        /***** Phone Number **/
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingSpanNormalizeSpace(MetforminScreenerConstants.PHONE_NUMBER), MetforminScreenerConstants.PHONE_NUMBER, " Phone Number Label");
        CharmsUtil.sendKeysToElement(metforminScreenerPage.dynamicLocatorForInputElementInMetforminScreener(MetforminScreenerConstants.PHONE_NUMBER, 1), metforminScreener_TestDataManager.phoneNumber);
        /***** Have you/the participant been diagnosed with Li-Fraumeni syndrome? **/
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingSpanContainText("To determine eligibility, we need to collect infor"), MetforminScreenerConstants.DELIVERY_INFORMATION, " To determine eligibility, we need to collect information about your Li-Fraumeni syndrome diagnosis, genetic testing performed, cancers diagnoses, and medication history. Label");
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingSpanNormalizeSpace(MetforminScreenerConstants.HAVE_YOU_THE_PARTICIPANT_BEEN_DIAGNOSED_WITH_LI_FRAUMENI_SYNDROME), MetforminScreenerConstants.HAVE_YOU_THE_PARTICIPANT_BEEN_DIAGNOSED_WITH_LI_FRAUMENI_SYNDROME, " Have you/the participant been diagnosed with Li-Fraumeni syndrome? Label");
        CharmsUtil.SelectValueFromDropDown(metforminScreenerPage.dynamicLocatorUsingSpanId("9"), MetforminScreenerConstants.YES_NO_UNKNOWN_UNSURE, metforminScreener_TestDataManager.haveYouTheParticipantBeenDiagnosedWithLiFraumeniSyndrome);
        /***** Genetic testing for the TP53 gene? **/
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingSpanNormalizeSpace(MetforminScreenerConstants.HAVE_YOU_THE_PARTICIPANT_HAD_GENETIC_TESTING_FOR_THE_TP53_GENE), MetforminScreenerConstants.HAVE_YOU_THE_PARTICIPANT_HAD_GENETIC_TESTING_FOR_THE_TP53_GENE, "Have you/the participant had genetic testing for the TP53 gene? Label");
        CharmsUtil.SelectValueFromDropDown(metforminScreenerPage.dynamicLocatorUsingSpanId("10"), MetforminScreenerConstants.YES_NO_UNKNOWN_UNSURE, metforminScreener_TestDataManager.haveYouTheParticipantHadGeneticTestingForTheTP53Gene);
        /***** Genetic testing for the TP53 gene? Results **/
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.metforminParticipantTP53Label, MetforminScreenerConstants.WHAT_WAS_THE_RESULT_OF_YOUR_THE_PARTICIPANTS_TP53_GENETIC_TESTING, "What was the result of your/the participant's TP53 genetic testing? Label");
        CharmsUtil.SelectValueFromDropDown(metforminScreenerPage.dynamicLocatorUsingSpanId("11"), MetforminScreenerConstants.TP53_RESULT_OPTIONS, metforminScreener_TestDataManager.whatWasTheResultOfYourTheParticipantsTP53GeneticTesting);
        /***** How would you like to provide your genetic test results to us? Please select one.**/
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingSpanNormalizeSpace(MetforminScreenerConstants.HOW_WOULD_YOU_LIKE_TO_PROVIDE_YOUR_GENETIC_TEST_RESULTS), MetforminScreenerConstants.HOW_WOULD_YOU_LIKE_TO_PROVIDE_YOUR_GENETIC_TEST_RESULTS, "How would you like to provide your genetic test results to us? Please select one. Label");
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorTextBoxUsingP(MetforminScreenerConstants.THE_STUDY_TEAM_WILL_NEED_TO_REVIEW_YOUR_GENETIC_TEST_RESULTS_BEFORE_DETERMINING_ELIGIBILITY), MetforminScreenerConstants.THE_STUDY_TEAM_WILL_NEED_TO_REVIEW_YOUR_GENETIC_TEST_RESULTS_BEFORE_DETERMINING_ELIGIBILITY, "THE_STUDY_TEAM_WILL_NEED_TO_REVIEW_YOUR_GENETIC_TEST_RESULTS_BEFORE_DETERMINING_ELIGIBILITY Label");
        CharmsUtil.SelectValueFromDropDown(metforminScreenerPage.dynamicLocatorUsingSpanId("12"), MetforminScreenerConstants.GENETIC_TEST_RESULTS_OPTIONS, metforminScreener_TestDataManager.howWouldYouLikeToProvideYourGeneticTestResults);
        /***** Delivery instructions **/
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.metforminParticipantDeliveryInstructions, MetforminScreenerConstants.DELIVERY_INSTRUCTIONS, " Delivery instructions Label");
        /***** Delivery Information **/
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.metforminParticipantMailDeliveryInstructions, metforminScreener_TestDataManager.deliveryHelpText, "Delivery Information Label");
        /***** Pregnant **/
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingSpanNormalizeSpace(MetforminScreenerConstants.ARE_YOU_THE_PARTICIPANT_CURRENTLY_PREGNANT), MetforminScreenerConstants.ARE_YOU_THE_PARTICIPANT_CURRENTLY_PREGNANT, " Are you/the participant currently pregnant? Label");
        CharmsUtil.SelectValueFromDropDown(metforminScreenerPage.dynamicLocatorUsingSpanId("13"), MetforminScreenerConstants.YES_NO_UNKNOWN_UNSURE_NOT_APPLICABLE, metforminScreener_TestDataManager.areYouTheParticipantCurrentlyPregnant);
        /***** congenital lactic acidosis **/
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingSpanNormalizeSpace(MetforminScreenerConstants.WERE_YOU_THE_PARTICIPANT_DIAGNOSED_WITH_CONGENITAL_LACTIC_ACIDOSIS), MetforminScreenerConstants.WERE_YOU_THE_PARTICIPANT_DIAGNOSED_WITH_CONGENITAL_LACTIC_ACIDOSIS, " Were you/the participant diagnosed with congenital lactic acidosis? Label");
        CharmsUtil.SelectValueFromDropDown(metforminScreenerPage.dynamicLocatorUsingSpanId("14"), MetforminScreenerConstants.YES_NO_UNKNOWN_UNSURE, metforminScreener_TestDataManager.wereYouTheParticipantDiagnosedWithCongenitalLacticAcidosis);
    }

    /*** THIS METHOD WILL SUBMIT AND ASSERT THE PARTICIPANT CANCER DIAGNOSIS INFORMATION IN METFORMIN SCREENER FROM PORTAL ***/
    private void participantCancerDiagnosis() {
    }

    /*** THIS METHOD WILL SUBMIT AND ASSERT THE PARTICIPANT CANCER TREATMENT DETAILS INFORMATION IN METFORMIN SCREENER FROM PORTAL ***/
    private void participantCancerTreatmentDetails() {
        }

    /*** THIS METHOD WILL SUBMIT AND ASSERT THE PARTICIPANT STUDY DETAILS INFORMATION IN METFORMIN SCREENER FROM PORTAL ***/
    private void participantStudyDetails() {
       }

    /*** THIS METHOD WILL SUBMIT AND ASSERT ALL THE SCENARIOS FOR METFORMIN SCREENER FROM PORTAL ***/
    public void submitAllScenarios() {
    }

    /*** THIS METHOD WILL SUBMIT METFORMIN SCREENER FROM PORTAL ***/
    public void clickSubmitButton() {
    }
}