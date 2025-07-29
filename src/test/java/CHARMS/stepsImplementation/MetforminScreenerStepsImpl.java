package CHARMS.stepsImplementation;

import APPS_COMMON.PageInitializers.PageInitializer;
import APPS_COMMON.Pages.NativeView_SideDoor_Dashboard_Page;
import APPS_COMMON.Utils.ServiceNow_Common_Methods;
import CHARMS.constants.CHARMS_Data_File_Path_Constants;
import CHARMS.constants.MetforminScreenerConstants;
import CHARMS.utils.CharmsUtil;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import org.openqa.selenium.Keys;
import org.testng.asserts.SoftAssert;
import java.util.Objects;

public class MetforminScreenerStepsImpl extends PageInitializer {
    static SoftAssert softAssert = new SoftAssert();
    String metforminScreenerData = CHARMS_Data_File_Path_Constants.METFORMIN_SCREENER_DATA;
    String participantName;
    String subjectIDValue;
    String referralValue;
    String participantValue;

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

    /*** THIS METHOD WILL CLICK THE METFORMIN SCREENER WIDGET ON THE PORTAL **/
    public void metforminEligibilityQuestionnaireWidgetClick() {
        CommonUtils.sleep(1000);
        metforminScreenerPage.dynamicLocatorUsingSpanNormalizeSpace("Metformin Study").click();
        CommonUtils.sleep(1000);
        metforminScreenerPage.dynamicLocatorUsingSpanNormalizeSpace("Metformin Eligibility Questionnaire").click();
        CommonUtils.sleep(1000);
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
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingLabelContainText(MetforminScreenerConstants.THE_NEXT_SET_OF_QUESTIONS_WILL_COLLECT_BASIC_INFORMATION_ABOUT_YOU_THE_PARTICIPANT), MetforminScreenerConstants.THE_NEXT_SET_OF_QUESTIONS_WILL_COLLECT_BASIC_INFORMATION_ABOUT_YOU_THE_PARTICIPANT, " The next set of questions will collect basic information about you/the participant. Label");
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
        CommonUtils.sleep(500);
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
        CommonUtils.sleep(500);
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
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingSpanNormalizeSpace(MetforminScreenerConstants.HAVE_YOU_THE_PARTICIPANT_EVER_BEEN_DIAGNOSED_WITH_CANCER), MetforminScreenerConstants.HAVE_YOU_THE_PARTICIPANT_EVER_BEEN_DIAGNOSED_WITH_CANCER, " Have you/the participant ever been diagnosed with cancer? Label");
        CharmsUtil.SelectValueFromDropDown(metforminScreenerPage.dynamicLocatorUsingSpanId("15"), MetforminScreenerConstants.YES_NO_UNKNOWN_UNSURE, metforminScreener_TestDataManager.haveYouTheParticipantEverBeenDiagnosedWithCancer);
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.metforminParticipantCancerHelpText, MetforminScreenerConstants.CANCER_HELP_TEXT, " Cancer help text Label");
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.metforminParticipantCancerInformationText, MetforminScreenerConstants.CANCER_INFORMATION_TEXT, " Cancer information Label");
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingSpanNormalizeSpace(MetforminScreenerConstants.CANCER_DETAILS), MetforminScreenerConstants.CANCER_DETAILS, " Cancer Details Label");
        CharmsUtil.assertButtonLabel(softAssert, metforminScreenerPage.dynamicLocatorForButtonUsingNormalizeSpace(MetforminScreenerConstants.ADD), MetforminScreenerConstants.ADD, " Add Button Label");
        CharmsUtil.assertButtonLabel(softAssert, metforminScreenerPage.dynamicLocatorForButtonUsingNormalizeSpace(MetforminScreenerConstants.REMOVE_ALL), MetforminScreenerConstants.REMOVE_ALL, " Remove All Button Label");
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingTableNormalizeSpace(MetforminScreenerConstants.ACTIONS), MetforminScreenerConstants.ACTIONS, " Actions Label in the table");
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingTableNormalizeSpace(MetforminScreenerConstants.TUMOR_TYPE), MetforminScreenerConstants.TUMOR_TYPE, " Tumor Type Label in the table");
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingTableNormalizeSpace(MetforminScreenerConstants.PLEASE_SELECT_AGE_OR_DATE_FOR_REPORTING), MetforminScreenerConstants.PLEASE_SELECT_AGE_OR_DATE_FOR_REPORTING, "Please select Age or Date for reporting Label");
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingTableNormalizeSpace(MetforminScreenerConstants.AGE_AT_DIAGNOSIS), MetforminScreenerConstants.AGE_AT_DIAGNOSIS, "Age at Diagnosis Label");
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingTableNormalizeSpace(MetforminScreenerConstants.MONTH_OF_DIAGNOSIS), MetforminScreenerConstants.MONTH_OF_DIAGNOSIS, "Month of Diagnosis Label");
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingTableNormalizeSpace(MetforminScreenerConstants.YEAR_OF_DIAGNOSIS), MetforminScreenerConstants.YEAR_OF_DIAGNOSIS, "Year of Diagnosis Label");
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingTableNormalizeSpace(MetforminScreenerConstants.ARE_YOU_THE_PARTICIPANT_CURRENTLY_RECEIVING_TREATMENT), MetforminScreenerConstants.ARE_YOU_THE_PARTICIPANT_CURRENTLY_RECEIVING_TREATMENT, "Are you/the participant currently receiving treatment? Label");
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingTableNormalizeSpace(MetforminScreenerConstants.PLEASE_PROVIDE_THE_NAME_OF_THE_INSTITUTION_WHERE_THE_CANCER_WAS_DIAGNOSED), MetforminScreenerConstants.PLEASE_PROVIDE_THE_NAME_OF_THE_INSTITUTION_WHERE_THE_CANCER_WAS_DIAGNOSED, "Please provide the name of the institution where the cancer was diagnosed. Label");
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingTableNormalizeSpace(MetforminScreenerConstants.PLEASE_PROVIDE_THE_NAME_OF_THE_INSTITUTION_WHERE_THE_CANCER_WAS_TREATED), MetforminScreenerConstants.PLEASE_PROVIDE_THE_NAME_OF_THE_INSTITUTION_WHERE_THE_CANCER_WAS_TREATED, "Please provide the name of the institution where the cancer was treated. Label");
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingTableNormalizeSpace(MetforminScreenerConstants.PLEASE_PROVIDE_THE_NAME_OF_THE_TREATING_PHYSICIAN), MetforminScreenerConstants.PLEASE_PROVIDE_THE_NAME_OF_THE_TREATING_PHYSICIAN, "Please provide the name of the treating physician. Label");
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingTableNormalizeSpace(MetforminScreenerConstants.ADDITIONAL_DETAILS), MetforminScreenerConstants.ADDITIONAL_DETAILS, "Additional Details Label");
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.metforminCancerNoDataToDisplay, MetforminScreenerConstants.NO_DATA_TO_DISPLAY, " No data to display Label");
        CharmsUtil.clickOnElement(metforminScreenerPage.dynamicLocatorForButtonUsingNormalizeSpace(MetforminScreenerConstants.ADD));
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingSpanNormalizeSpace(MetforminScreenerConstants.TUMOR_TYPE), MetforminScreenerConstants.TUMOR_TYPE, " Tumor Type Label");
        CharmsUtil.clickOnElement(metforminScreenerPage.metforminParticipantTumorTypeInput);
        CommonUtils.sleep(800);
        CharmsUtil.clickOnElement(metforminScreenerPage.metforminParticipantTumorDetailsInput1);
        CommonUtils.sleep(500);
        CharmsUtil.sendKeysToElement(metforminScreenerPage.metforminParticipantTumorDetailsInput1, metforminScreener_TestDataManager.tumorType);
        metforminScreenerPage.metforminParticipantTumorDetailsInput1.sendKeys(org.openqa.selenium.Keys.TAB);
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingSpanNormalizeSpace(MetforminScreenerConstants.PLEASE_SELECT_AGE_OR_DATE_FOR_REPORTING), MetforminScreenerConstants.PLEASE_SELECT_AGE_OR_DATE_FOR_REPORTING, "Please select Age or Date for reporting Label");
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.metforminParticipantTumorDateOrAgeLabel, "Select Unknown/Unsure if you don't know the date or age of cancer diagnosis", "Select Unknown/Unsure help text Label");
        CharmsUtil.SelectValueFromDropDown(metforminScreenerPage.dynamicLocatorUsingSpanId1("2"), MetforminScreenerConstants.YEAR_OR_AGE_OF_DIAGNOSIS, metforminScreener_TestDataManager.pleaseSelectAgeOrDateForReporting);
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingNormalizeSpaceSpan(MetforminScreenerConstants.AGE_AT_DIAGNOSIS), MetforminScreenerConstants.AGE_AT_DIAGNOSIS, "Age at Diagnosis Label");
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingNormalizeSpaceSpan("Select 0 if diagnosis occurred before age 1."), "Select 0 if diagnosis occurred before age 1.", "Select 0 if diagnosis occurred before age 1. Label");
        CharmsUtil.clickOnElement(metforminScreenerPage.dynamicLocatorUsingSpanId1("3"));
        CommonUtils.sleep(500);
        CharmsUtil.clickOnElement(metforminScreenerPage.metforminParticipantTumorDetailsInput1);
        CharmsUtil.sendKeysToElement(metforminScreenerPage.metforminParticipantTumorDetailsInput1, metforminScreener_TestDataManager.ageAtDiagnosis);
        metforminScreenerPage.metforminParticipantTumorDetailsInput1.sendKeys(org.openqa.selenium.Keys.TAB);
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingNormalizeSpaceSpan(MetforminScreenerConstants.ARE_YOU_THE_PARTICIPANT_CURRENTLY_RECEIVING_TREATMENT), MetforminScreenerConstants.ARE_YOU_THE_PARTICIPANT_CURRENTLY_RECEIVING_TREATMENT, "Are you/the participant currently receiving treatment? Label");
        CharmsUtil.clickOnElement(metforminScreenerPage.dynamicLocatorUsingSpanId1("6"));
        CommonUtils.sleep(500);
        CharmsUtil.clickOnElement(metforminScreenerPage.metforminParticipantTumorDetailsInput1);
        CharmsUtil.sendKeysToElement(metforminScreenerPage.metforminParticipantTumorDetailsInput1, metforminScreener_TestDataManager.areYouTheParticipantCurrentlyReceivingTreatment);
        metforminScreenerPage.metforminParticipantTumorDetailsInput1.sendKeys(org.openqa.selenium.Keys.TAB);
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingNormalizeSpaceSpan(MetforminScreenerConstants.PLEASE_PROVIDE_THE_NAME_OF_THE_INSTITUTION_WHERE_THE_CANCER_WAS_DIAGNOSED), MetforminScreenerConstants.PLEASE_PROVIDE_THE_NAME_OF_THE_INSTITUTION_WHERE_THE_CANCER_WAS_DIAGNOSED, "Please provide the name of the institution where the cancer was diagnosed. Label");
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingSpanTitle(MetforminScreenerConstants.TYPE_UNKNOWN_UNSURE_IF_YOU_ARE_NOT_SURE, 1), MetforminScreenerConstants.TYPE_UNKNOWN_UNSURE_IF_YOU_ARE_NOT_SURE, "Type Unknown/Unsure if you are not sure. Label");
        CharmsUtil.sendKeysToElement(metforminScreenerPage.metforminParticipantInstitutionDiagnosedInput, metforminScreener_TestDataManager.pleaseProvideTheNameOfTheInstitutionWhereTheCancerWasDiagnosed);
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingNormalizeSpaceSpan(MetforminScreenerConstants.PLEASE_PROVIDE_THE_NAME_OF_THE_INSTITUTION_WHERE_THE_CANCER_WAS_TREATED), MetforminScreenerConstants.PLEASE_PROVIDE_THE_NAME_OF_THE_INSTITUTION_WHERE_THE_CANCER_WAS_TREATED, "Please provide the name of the institution where the cancer was treated. Label");
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingSpanTitle(MetforminScreenerConstants.TYPE_UNKNOWN_UNSURE_IF_YOU_ARE_NOT_SURE, 2), MetforminScreenerConstants.TYPE_UNKNOWN_UNSURE_IF_YOU_ARE_NOT_SURE, "Type Unknown/Unsure if you are not sure. Label");
        CharmsUtil.sendKeysToElement(metforminScreenerPage.metforminParticipantInstitutionTreatedInput, metforminScreener_TestDataManager.pleaseProvideTheNameOfTheInstitutionWhereTheCancerWasTreated);
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingNormalizeSpaceSpan(MetforminScreenerConstants.PLEASE_PROVIDE_THE_NAME_OF_THE_TREATING_PHYSICIAN), MetforminScreenerConstants.PLEASE_PROVIDE_THE_NAME_OF_THE_TREATING_PHYSICIAN, "Please provide the name of the treating physician. Label");
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingSpanTitle(MetforminScreenerConstants.TYPE_UNKNOWN_UNSURE_IF_YOU_ARE_NOT_SURE, 3), MetforminScreenerConstants.TYPE_UNKNOWN_UNSURE_IF_YOU_ARE_NOT_SURE, "Type Unknown/Unsure if you are not sure. Label");
        CharmsUtil.sendKeysToElement(metforminScreenerPage.metforminParticipantTreatingPhysicianInput, metforminScreener_TestDataManager.pleaseProvideTheNameOfTheTreatingPhysician);
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingSpanNormalizeSpace(MetforminScreenerConstants.ADDITIONAL_DETAILS), MetforminScreenerConstants.ADDITIONAL_DETAILS, " Additional Details Label");
        CharmsUtil.sendKeysToElement(metforminScreenerPage.metforminParticipantCancerAdditionalDetailsInput, metforminScreener_TestDataManager.additionalDetails);
        CharmsUtil.assertButtonLabel(softAssert, metforminScreenerPage.dynamicLocatorForButtonUsingNormalizeSpace("Cancel"), "Cancel", "Cancel button Label");
        CharmsUtil.assertButtonLabel(softAssert, metforminScreenerPage.dynamicLocatorForButtonUsingNormalizeSpace("Add"), "Add", "Add button Label");
        CucumberLogUtils.logScreenshot();
        CharmsUtil.clickOnElement(metforminScreenerPage.dynamicLocatorForButtonUsingNormalizeSpace("Add"));
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingTDTag(metforminScreener_TestDataManager.tumorType), metforminScreener_TestDataManager.tumorType, " Tumor Type value in the Cancer details MRVS table ");
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingTDTag(MetforminScreenerConstants.AGE), metforminScreener_TestDataManager.age, " Tumor Type value in the Cancer details MRVS table ");
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingTDTag(metforminScreener_TestDataManager.ageAtDiagnosis), metforminScreener_TestDataManager.ageAtDiagnosis, " Age at Diagnosis value in the Cancer details MRVS table ");
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.metforminParticipantTumorTypeMonthOfDiagnosisInput, metforminScreener_TestDataManager.monthOfDiagnosis, " Month of diagnosis value in the Cancer details MRVS table ");
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.metforminParticipantTumorTypeYearfDiagnosisInput, metforminScreener_TestDataManager.yearOfDiagnosis, " Year of diagnosis value in the Cancer details MRVS table ");
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingTDTag(metforminScreener_TestDataManager.areYouTheParticipantCurrentlyReceivingTreatment), metforminScreener_TestDataManager.areYouTheParticipantCurrentlyReceivingTreatment, " Are you/the participant currently receiving treatment? value in the Cancer details MRVS table ");
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingTDTag(metforminScreener_TestDataManager.pleaseProvideTheNameOfTheInstitutionWhereTheCancerWasDiagnosed), metforminScreener_TestDataManager.pleaseProvideTheNameOfTheInstitutionWhereTheCancerWasDiagnosed, " Please provide the name of the institution where the cancer was diagnosed. value in the Cancer details MRVS table ");
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingTDTag(metforminScreener_TestDataManager.pleaseProvideTheNameOfTheInstitutionWhereTheCancerWasTreated), metforminScreener_TestDataManager.pleaseProvideTheNameOfTheInstitutionWhereTheCancerWasTreated, " Please provide the name of the institution where the cancer was treated. value in the Cancer details MRVS table ");
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingTDTag(metforminScreener_TestDataManager.pleaseProvideTheNameOfTheTreatingPhysician), metforminScreener_TestDataManager.pleaseProvideTheNameOfTheTreatingPhysician, " Please provide the name of the institution where the cancer was treated. value in the Cancer details MRVS table ");
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingTDTag(metforminScreener_TestDataManager.additionalDetails), metforminScreener_TestDataManager.additionalDetails, " Additional Details value in the Cancer details MRVS table ");
    }

    /*** THIS METHOD WILL SUBMIT AND ASSERT THE PARTICIPANT CANCER TREATMENT DETAILS INFORMATION IN METFORMIN SCREENER FROM PORTAL ***/
    private void participantCancerTreatmentDetails() {
        /***** Assertion and input for "Have you/the participant had surgery to remove a cancer in the last 3 months? *****/
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingSpanNormalizeSpace(MetforminScreenerConstants.HAVE_YOU_THE_PARTICIPANT_HAD_SURGERY_TO_REMOVE_CANCER_LAST_3_MONTHS), MetforminScreenerConstants.HAVE_YOU_THE_PARTICIPANT_HAD_SURGERY_TO_REMOVE_CANCER_LAST_3_MONTHS, "Have you/the participant had surgery to remove a cancer in the last 3 months? Label");
        CharmsUtil.SelectValueFromDropDown(metforminScreenerPage.dynamicLocatorUsingSpanId("16"), MetforminScreenerConstants.YES_NO_UNKNOWN_UNSURE, metforminScreener_TestDataManager.haveYouTheParticipantHadSurgeryToRemoveCancerLast3Months);
        /***** Assertion and input for "Please provide the date of surgery. *****/
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingSpanNormalizeSpace(MetforminScreenerConstants.PLEASE_PROVIDE_THE_DATE_OF_SURGERY), MetforminScreenerConstants.PLEASE_PROVIDE_THE_DATE_OF_SURGERY, "Please provide the date of surgery. Label");
        CharmsUtil.sendKeysToElement(metforminScreenerPage.dynamicLocatorForInputElementUsingNameInMetforminScreener("date_of_3mnth", 1), metforminScreener_TestDataManager.pleaseProvideTheDateOfSurgery);
        /***** Assertion and input for "Have you/the participant received chemotherapy or radiation in the last 6 months? *****/
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingSpanNormalizeSpace(MetforminScreenerConstants.HAVE_YOU_THE_PARTICIPANT_RECEIVED_CHEMOTHERAPY_OR_RADIATION_LAST_6_MONTHS), MetforminScreenerConstants.HAVE_YOU_THE_PARTICIPANT_RECEIVED_CHEMOTHERAPY_OR_RADIATION_LAST_6_MONTHS, "Have you/the participant received chemotherapy or radiation in the last 6 months? Label");
        CharmsUtil.SelectValueFromDropDown(metforminScreenerPage.dynamicLocatorUsingSpanId("17"), MetforminScreenerConstants.YES_NO_UNKNOWN_UNSURE, metforminScreener_TestDataManager.haveYouTheParticipantReceivedChemotherapyOrRadiationLast6Months);
        /***** Assertion and input for "What was the date of your/the participant's last treatment? *****/
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingSpanContainText(MetforminScreenerConstants.WHAT_WAS_THE_DATE_OF_PARTICIPANT_LAST_TREATMENT), MetforminScreenerConstants.WHAT_WAS_THE_DATE_OF_PARTICIPANT_LAST_TREATMENT, "What was the date of your/the participant's last treatment? Label");
        CharmsUtil.sendKeysToElement(metforminScreenerPage.dynamicLocatorForInputElementUsingNameInMetforminScreener("date_of_6mnth", 1), metforminScreener_TestDataManager.whatWasTheDateOfParticipantLastTreatment);
        /***** Assertion and input for "Are you/the participant currently undergoing treatment for a cancer? *****/
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingSpanNormalizeSpace(MetforminScreenerConstants.ARE_YOU_THE_PARTICIPANT_CURRENTLY_UNDERGOING_TREATMENT_FOR_CANCER), MetforminScreenerConstants.ARE_YOU_THE_PARTICIPANT_CURRENTLY_UNDERGOING_TREATMENT_FOR_CANCER, "Are you/the participant currently undergoing treatment for a cancer? Label");
        CharmsUtil.SelectValueFromDropDown(metforminScreenerPage.dynamicLocatorUsingSpanId("18"), MetforminScreenerConstants.YES_NO_UNKNOWN_UNSURE, metforminScreener_TestDataManager.areYouTheParticipantCurrentlyUndergoingTreatmentForCancer);
        /***** Assertion for "What current medication(s) are you/the participant taking? (if any) *****/
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.metforminParticipantCurrentMedLabel, MetforminScreenerConstants.WHAT_CURRENT_MEDICATIONS_ARE_YOU_THE_PARTICIPANT_TAKING_IF_ANY, "What current medication(s) are you/the participant taking? (if any) Label");
        /***** Assertion and input for "List all medications and separate with a semicolon (example: aspirin; Tylenol). *****/
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingSpanNormalizeSpace(MetforminScreenerConstants.LIST_ALL_MEDICATIONS_AND_SEPARATE_WITH_A_SEMICOLON), MetforminScreenerConstants.LIST_ALL_MEDICATIONS_AND_SEPARATE_WITH_A_SEMICOLON, "List all medications and separate with a semicolon (example: aspirin; Tylenol). Label");
        CharmsUtil.sendKeysToElement(metforminScreenerPage.metforminParticipantCurrentMedInput, metforminScreener_TestDataManager.listAllMedicationsAndSeparateWithASemicolon);
        /***** Assertion for "Not applicable / No medication *****/
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingSpanContainText(MetforminScreenerConstants.NOT_APPLICABLE_NO_MEDICATION), MetforminScreenerConstants.NOT_APPLICABLE_NO_MEDICATION, "Not applicable / No medication Label");
        CharmsUtil.assertCheckBox(softAssert, metforminScreenerPage.dynamicLocatorUsingSpanContainText(MetforminScreenerConstants.NOT_APPLICABLE_NO_MEDICATION), false, "Not applicable / No medication Checkbox selected");
        /***** Assertion and dropdown for "Do you/the participant have a known allergy to Metformin? *****/
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingSpanNormalizeSpace(MetforminScreenerConstants.DO_YOU_THE_PARTICIPANT_HAVE_A_KNOWN_ALLERGY_TO_METFORMIN), MetforminScreenerConstants.DO_YOU_THE_PARTICIPANT_HAVE_A_KNOWN_ALLERGY_TO_METFORMIN, "Do you/the participant have a known allergy to Metformin? Label");
        CharmsUtil.SelectValueFromDropDown(metforminScreenerPage.dynamicLocatorUsingSpanId("19"), MetforminScreenerConstants.YES_NO_UNKNOWN_UNSURE, metforminScreener_TestDataManager.doYouTheParticipantHaveAKnownAllergyToMetformin);
        /***** Assertion and dropdown for "Have you/the participant ever taken Metformin? *****/
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingSpanNormalizeSpace(MetforminScreenerConstants.HAVE_YOU_THE_PARTICIPANT_EVER_TAKEN_METFORMIN), MetforminScreenerConstants.HAVE_YOU_THE_PARTICIPANT_EVER_TAKEN_METFORMIN, "Have you/the participant ever taken Metformin? Label");
        CharmsUtil.SelectValueFromDropDown(metforminScreenerPage.dynamicLocatorUsingSpanId("20"), MetforminScreenerConstants.YES_NO_UNKNOWN_UNSURE, metforminScreener_TestDataManager.haveYouTheParticipantEverTakenMetformin);
        /***** Assertion for "Have you/the participant taken Metformin for more than 3 months in total? *****/
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingSpanNormalizeSpace(MetforminScreenerConstants.HAVE_YOU_THE_PARTICIPANT_TAKEN_METFORMIN_FOR_MORE_THAN_3_MONTHS_IN_TOTAL), MetforminScreenerConstants.HAVE_YOU_THE_PARTICIPANT_TAKEN_METFORMIN_FOR_MORE_THAN_3_MONTHS_IN_TOTAL, "Have you/the participant taken Metformin for more than 3 months in total? Label");
        /***** Assertion  and dropdown for "For example, if you took Metformin for two months in 2015 and one month in 2017, select yes. *****/
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.metforminParticipantMetforminInfoLabel, "For example, if you took Metformin for two months in 2015 and one month in 2017, select yes.", "Metformin duration example help text Label");
        CharmsUtil.SelectValueFromDropDown(metforminScreenerPage.dynamicLocatorUsingSpanId("21"), MetforminScreenerConstants.YES_NO_UNKNOWN_UNSURE, metforminScreener_TestDataManager.haveYouTheParticipantTakenMetforminForMoreThan3MonthsInTotal);
        /***** Assertion and dropdown for "Are you/the participant currently taking Metformin? *****/
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingSpanNormalizeSpace(MetforminScreenerConstants.ARE_YOU_THE_PARTICIPANT_CURRENTLY_TAKING_METFORMIN), MetforminScreenerConstants.ARE_YOU_THE_PARTICIPANT_CURRENTLY_TAKING_METFORMIN, "Are you/the participant currently taking Metformin? Label");
        CharmsUtil.SelectValueFromDropDown(metforminScreenerPage.dynamicLocatorUsingSpanId("22"), MetforminScreenerConstants.YES_NO_UNKNOWN_UNSURE, metforminScreener_TestDataManager.areYouTheParticipantCurrentlyTakingMetformin);
    }

    /*** THIS METHOD WILL SUBMIT AND ASSERT THE PARTICIPANT STUDY DETAILS INFORMATION IN METFORMIN SCREENER FROM PORTAL ***/
    private void participantStudyDetails() {
        /***** Assertion for "Here are a few remaining questions regarding this study." *****/
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingSpanNormalizeSpace(MetforminScreenerConstants.HERE_ARE_A_FEW_REMAINING_QUESTIONS_REGARDING_THIS_STUDY), MetforminScreenerConstants.HERE_ARE_A_FEW_REMAINING_QUESTIONS_REGARDING_THIS_STUDY, "Here are a few remaining questions regarding this study. Label");
        /***** Assertion and dropdown for "How did you/the participant hear about this study?" *****/
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingSpanNormalizeSpace(MetforminScreenerConstants.HOW_DID_YOU_THE_PARTICIPANT_HEAR_ABOUT_THIS_STUDY), MetforminScreenerConstants.HOW_DID_YOU_THE_PARTICIPANT_HEAR_ABOUT_THIS_STUDY, "How did you/the participant hear about this study? Label");
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.metforminParticipantHealthCareInfoLabel, MetforminScreenerConstants.STUDY_INFORMATION, "If a specific health care provider referred you to this study, please include their name in the corresponding text box. Label");
        CharmsUtil.SelectValueFromDropDown(metforminScreenerPage.dynamicLocatorUsingSpanId("23"), MetforminScreenerConstants.HEAR_ABOUT_STUDY_OPTIONS, metforminScreener_TestDataManager.howDidYouTheParticipantHearAboutThisStudy);
        /***** Assertion for "Medical Information" *****/
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.metforminParticipantMedicalInfoLabel, MetforminScreenerConstants.MEDICAL_INFORMATION, "In case we require additional medical information to determine if you/the participant are eligible to participate in our research study, please provide us with the name, address, and phone number of the health care provider who is most familiar with your/the participant’s case:Label");
        /***** Assertion and dropdown input for "Name" *****/
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingSpanNormalizeSpace(MetforminScreenerConstants.NAME), MetforminScreenerConstants.NAME, "Name Label");
        CharmsUtil.sendKeysToElement(metforminScreenerPage.dynamicLocatorForInputElementUsingNameInMetforminScreener("health_care_prov_name", 1), metforminScreener_TestDataManager.name);
        /***** Assertion and dropdown input for "Address" *****/
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingSpanNormalizeSpace(MetforminScreenerConstants.ADDRESS), MetforminScreenerConstants.ADDRESS, "Address Label");
        CharmsUtil.sendKeysToElement(metforminScreenerPage.dynamicLocatorForInputElementUsingNameInMetforminScreener("health_care_prov_address", 1), metforminScreener_TestDataManager.address);
        /***** Assertion and dropdown input for "Phone Number" *****/
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingSpanContainTextAndIndex(MetforminScreenerConstants.PHONE_NUMBER, 5), MetforminScreenerConstants.PHONE_NUMBER, "Phone Number Label");
        CharmsUtil.sendKeysToElement(metforminScreenerPage.dynamicLocatorForInputElementUsingNameInMetforminScreener("health_care_prov_phone_number", 1), metforminScreener_TestDataManager.medicalPhoneNumber);
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingNormalizeSpaceSpan(MetforminScreenerConstants.DO_WE_HAVE_YOUR_THE_PARTICIPANTS_PERMISSION_TO_CALL_THIS_INDIVIDUAL_TO_SEEK_MORE_INFORMATION), MetforminScreenerConstants.DO_WE_HAVE_YOUR_THE_PARTICIPANTS_PERMISSION_TO_CALL_THIS_INDIVIDUAL_TO_SEEK_MORE_INFORMATION, "Do we have your/the participant's permission to call this individual to seek more information? Label");
        CharmsUtil.SelectValueFromDropDown(metforminScreenerPage.dynamicLocatorUsingSpanId("24"), MetforminScreenerConstants.YES_NO, metforminScreener_TestDataManager.doWeHaveYourTheParticipantsPermissionToCallThisIndividualToSeekMoreInformation);
        /***** Assertion and dropdown for "What are the main reasons for participating in this study? Select all that apply." *****/
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingSpanNormalizeSpace(MetforminScreenerConstants.WHAT_ARE_THE_MAIN_REASONS_FOR_PARTICIPATING_IN_THIS_STUDY_SELECT_ALL_THAT_APPLY), MetforminScreenerConstants.WHAT_ARE_THE_MAIN_REASONS_FOR_PARTICIPATING_IN_THIS_STUDY_SELECT_ALL_THAT_APPLY, "What are the main reasons for participating in this study? Select all that apply. Label");// Assertion for "Please elaborate on the reason in the corresponding textbox."
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingSpanNormalizeSpace(MetforminScreenerConstants.PLEASE_ELABORATE_ON_THE_REASON_IN_THE_CORRESPONDING_TEXTBOX), MetforminScreenerConstants.PLEASE_ELABORATE_ON_THE_REASON_IN_THE_CORRESPONDING_TEXTBOX, "Please elaborate on the reason in the corresponding textbox. Label");
        CommonUtils.sleep(1000);
        CharmsUtil.SelectValueFromDropDown(metforminScreenerPage.metforminParticipantStudySiteInput, MetforminScreenerConstants.STUDY_REASON, metforminScreener_TestDataManager.whatAreTheMainReasonsForParticipatingInThisStudySelectAllThatApply);
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingSpanNormalizeSpace(MetforminScreenerConstants.RECEIVE_GENETIC_TESTING), MetforminScreenerConstants.RECEIVE_GENETIC_TESTING, "Receive genetic testing: Label");
        CharmsUtil.sendKeysToElement(metforminScreenerPage.metforminParticipantGeneticTestInput, metforminScreener_TestDataManager.receiveGeneticTesting);
        metforminScreenerPage.metforminParticipantGeneticTestInput.sendKeys(org.openqa.selenium.Keys.TAB);
        /***** Assertion for "Please provide any additional information you would like to share with the study team." and Submit button *****/
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.metforminParticipantSubmitInfoLabel, MetforminScreenerConstants.SUBMIT_INFORMATION, "Submit Information Label");
    }

    /*** THIS METHOD WILL SUBMIT METFORMIN SCREENER FROM PORTAL ***/
    public void clickSubmitButton() {
        CharmsUtil.assertButtonLabel(softAssert, metforminScreenerPage.dynamicLocatorForButtonUsingNormalizeSpace("Submit"), "Submit", "Submit button Label");
        CharmsUtil.clickOnElement(metforminScreenerPage.dynamicLocatorForButtonUsingNormalizeSpace("Submit"));
        CommonUtils.sleep(1000);
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingPContainText("Thank you very much. The information you have prov"), metforminScreener_TestDataManager.submit_Screen_text1, "Thank you for completing the Metformin Screener text 1. Label");
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingPContainText("Please feel free to call at any time if you have a"), metforminScreener_TestDataManager.submit_Screen_text2, "Thank you for completing the Metformin Screener text 2. Label");
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingPContainText("Thank you for your willingness to consider joining"), metforminScreener_TestDataManager.submit_Screen_text3, "Thank you for completing the Metformin Screener text 3. Label");
        CharmsUtil.assertButtonLabel(softAssert, metforminScreenerPage.dynamicLocatorForButtonUsingNormalizeSpace(MetforminScreenerConstants.OK), MetforminScreenerConstants.OK, "Ok button Label");
        CharmsUtil.clickOnElement(metforminScreenerPage.dynamicLocatorForButtonUsingNormalizeSpace(metforminScreener_TestDataManager.oK));
        CommonUtils.sleep(1000);
        CucumberLogUtils.logScreenshot();
    }

    /*** THIS METHOD WILL SUBMIT AND ASSERT ALL THE SCENARIOS FOR METFORMIN SCREENER FROM PORTAL ***/
    public void submitAllScenarios() {
        clickSubmitButton();
    }

    /*** Method to Log in to the Participant details page in Native View */
    public void navigateToParticipantDetailsPageInNativeView() {
        CommonUtils.sleep(2000);
        CommonUtils.waitForVisibility(NativeView_SideDoor_Dashboard_Page.filterNavigatorTextBox);
        NativeView_SideDoor_Dashboard_Page.filterNavigatorTextBox.sendKeys("All Participant Details");
        CucumberLogUtils.logScreenshot();
        CommonUtils.sleep(1800);
        CommonUtils.clickOnElement(NativeView_SideDoor_Dashboard_Page.allParticipantDetailsLink);
        CommonUtils.sleep(1800);
        CommonUtils.switchToFrame(NativeView_SideDoor_Dashboard_Page.nativeViewiFrame);
        CommonUtils.sleep(1800);
        CucumberLogUtils.logScreenshot();
    }

    /*** Method to Assert the Metformin participant detail page in NativeView */
    public void participantDetailsPageAssertionForMetforminScreener(String sheetName) {
        if (sheetName.contentEquals("MetforminScreenerScenario1")) {
            metforminScreener_TestDataManager.dataInitializerMetforminScreener(sheetName);
            metforminOpenParticipantDetailPageInNV();
            metforminGeneralInformationAssertionOnParticipantDetailPageInNV();
            metforminPersonalInformationAssertionOnParticipantDetailPageInNV();
            metforminDemographicsAssertionOnParticipantDetailPageInNV();
            metforminContactInformationAssertionOnParticipantDetailPageInNV();
            metforminProxyContactInformationAssertionOnParticipantDetailPageInNV();
        }
    }

    /*** Method to Assert the Metformin participant Study Screener page in NativeView */
    public void participantStudyScreenerPageAssertionForMetforminScreener(String sheetName) {
        if (sheetName.contentEquals("MetforminScreenerScenario1")) {
            metforminScreener_TestDataManager.dataInitializerMetforminScreener(sheetName);
            metforminStudyScreenerPreviewRecordClicked();
            metforminStudyScreenerGeneralInformationAssertions();
        }
    }

    /*** Methods to Assert the Metformin participant Referral page  data fields in NativeView */
    public void participantReferralPageAssertionForMetforminScreener(String sheetName) {
        if (sheetName.contentEquals("MetforminScreenerScenario1")) {
            metforminScreener_TestDataManager.dataInitializerMetforminScreener(sheetName);
            metforminReferralPagePreviewRecordClicked();
            metforminReferralPageGeneralInformationAssertions();
            metforminReferralPageContactInformationAssertion();
            metforminReferralPageDemographicsAssertion();
            metforminReferralPageStudyQuestionsAssertion();
            metforminReferralPageMedicalQuestionsQuestions();
            metforminReferralPageFinalQuestionsAssertion();
            metforminReferralPageReferralPatientCancersAssertion();
        }
    }

    /*** Method to click the participant detail record in list view page */
    private void metforminOpenParticipantDetailPageInNV() {
        String participantView = (metforminScreener_TestDataManager.firstName + " " + metforminScreener_TestDataManager.middleInitial + " " + metforminScreener_TestDataManager.lastName);
        String participantProxyView = (metforminScreener_TestDataManager.proxyFirstName + " " + metforminScreener_TestDataManager.proxyMiddleName + " " + metforminScreener_TestDataManager.proxyLastName);
        if (participantView.isBlank()) {
            if (nativeViewCHARMSParticipantStudyPage.nVParticipantSearchColumnName.isDisplayed()) {
            } else {
                nativeViewCHARMSParticipantStudyPage.nVParticipantSearchColumnButton.click();
            }
            nativeViewCHARMSParticipantStudyPage.nVParticipantSearchColumnName.sendKeys(participantProxyView);
            nativeViewCHARMSParticipantStudyPage.nVParticipantSearchColumnName.sendKeys(Keys.RETURN);
            CharmsUtil.clickOnElement(nativeViewCHARMSParticipantStudyPage.dynamicPreviewButtonLocator1(participantProxyView));
            CommonUtils.sleep(1000);
            CucumberLogUtils.logScreenshot();
            CharmsUtil.clickOnElement(nativeViewCHARMSParticipantStudyPage.dynamicPreviewButtonLocator("Open Record"));
            CommonUtils.sleep(1000);
            CucumberLogUtils.logScreenshot();
        } else {
            if (nativeViewCHARMSParticipantStudyPage.nVParticipantSearchColumnName.isDisplayed()) {
            } else {
                nativeViewCHARMSParticipantStudyPage.nVParticipantSearchColumnButton.click();
            }
            nativeViewCHARMSParticipantStudyPage.nVParticipantSearchColumnName.sendKeys(participantView);
            nativeViewCHARMSParticipantStudyPage.nVParticipantSearchColumnName.sendKeys(Keys.RETURN);
            CharmsUtil.clickOnElement(nativeViewCHARMSParticipantStudyPage.dynamicPreviewButtonLocator1(participantView));
            CommonUtils.sleep(1000);
            CucumberLogUtils.logScreenshot();
            CharmsUtil.clickOnElement(nativeViewCHARMSParticipantStudyPage.dynamicPreviewButtonLocator("Open Record"));
            CommonUtils.sleep(1000);
            CucumberLogUtils.logScreenshot();
        }
    }

    /*** Method to assert the General Information on Participant Details page */
    public void metforminGeneralInformationAssertionOnParticipantDetailPageInNV() {
        String participantView = (metforminScreener_TestDataManager.firstName + " " + metforminScreener_TestDataManager.middleInitial + " " + metforminScreener_TestDataManager.lastName);
        String participantProxyView = (metforminScreener_TestDataManager.proxyFirstName + " " + metforminScreener_TestDataManager.proxyMiddleName + " " + metforminScreener_TestDataManager.proxyLastName);
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantStudyPage.dynamicLocatorContainsText("Subject ID"));
        CommonUtils.sleep(500);
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorContainsText("Subject ID"), "Subject ID", " Subject ID Label of the General Information on Participant Details page ");
        subjectIDValue = (nativeViewCHARMSParticipantStudyPage.dynamicLocatorForReadOnlyInputValuesInParticipantDetailsPage("full_family_id").getDomAttribute("value"));
        if (subjectIDValue != null && subjectIDValue.isEmpty()) {
            CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorForReadOnlyInputValuesInParticipantDetailsPage("full_family_id"), "", " Subject ID of the General Information on Participant Details page ");
        }
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorUsingNormalizeSpaceInSpan("Name"), "Name", " Name Label of the General Information on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorForReadOnlyInputValuesInParticipantDetailsPage("name"), participantView, " Participant Name of the General Information on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorUsingNormalizeSpaceInSpan("Permission to contact"), "Permission to contact", " Permission to contact Label of the General Information on Participant Details page ");
        CharmsUtil.assertDropDownData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorForSelectElementsInParticipantDetailsPage("permission_to_contact"), "Unknown", " Permission to contact of the General Information on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorUsingNormalizeSpaceInSpan("FHQ Patient"), "FHQ Patient", " FHQ Patient Label of the General Information on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorForInputElementsInParticipantDetailsPage("fhq_patient"), "", " FHQ Patient Value of the General Information on Participant Details page ");
        if ((nativeViewCHARMSParticipantStudyPage.dynamicLocatorForReadOnlyInputValuesInParticipantDetailsPage("full_family_id").getDomAttribute("value").isEmpty())) {
            CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorUsingNormalizeSpaceInSpan("Eligibility Status"), "Eligibility Status", " Eligibility Status Label of the General Information on Participant Details page ");
            CharmsUtil.assertDropDownData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorForReadOnlySelectValuesInParticipantDetailsPage("eligibility_status"), "Waiting for Eligibility", " Eligibility Status of the General Information on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorUsingNormalizeSpaceInSpan("Enrollment Status"), "Enrollment Status", " Enrollment Status Label of the General Information on Participant Details page ");
            CharmsUtil.assertDropDownData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorForSelectElementsInParticipantDetailsPage("enrollment_status"), "New Screener Received", " Enrollment Status of the General Information on Participant Details page ");
        } else {
            CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorUsingNormalizeSpaceInSpan("Eligibility Status"), "Eligibility Status", " Eligibility Status Label of the General Information on Participant Details page ");
            CharmsUtil.assertDropDownData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorForReadOnlySelectValuesInParticipantDetailsPage("eligibility_status"), "Eligible", " Eligibility Status after the consent complete of the General Information on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorUsingNormalizeSpaceInSpan("Enrollment Status"), "Enrollment Status", " Enrollment Status Label of the General Information on Participant Details page ");
            CharmsUtil.assertDropDownData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorForSelectElementsInParticipantDetailsPage("enrollment_status"), "Awaiting Enrollment Forms", " Enrollment Status of the General Information on Participant Details page ");
        }
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorUsingNormalizeSpaceInSpan("Studies"), "Studies", " Studies Label of the General Information on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.nVParticipantStudies, "Metformin", " Studies on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorUsingNormalizeSpaceInSpan("Study Subcategory"), "Study Subcategory", " Study Subcategory Label of the General Information on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorUsingNormalizeSpaceInSpan("NIH MRN number"), "NIH MRN number", " NIH MRN number Label of the General Information on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorForInputElementInParticipantDetailsPage("nih_number"), "", " NIH MRN number on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.nVParticipantNIHMRNnumberInfo, "NIH MRN number should include the dashes", " NIH MRN number Information Text on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorUsingNormalizeSpaceInSpan("Invitation Code"), "Invitation Code", " Invitation Code Label of the General Information on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorForInputElementInParticipantDetailsPage("invitation_code"), "", " Invitation Code on Participant Details page ");
    }

    /*** Method to assert the Personal Information on Participant Details */
    public void metforminPersonalInformationAssertionOnParticipantDetailPageInNV() {
        CharmsUtil.labelHighlight(nativeViewCHARMSParticipantStudyPage.nVParticipantPersonalInformationTab);
        nativeViewCHARMSParticipantStudyPage.nVParticipantPersonalInformationTab.click();
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorUsingNormalizeSpaceInSpan("Relationship to Proband"), "Relationship to Proband", " Relationship to Proband Label of the Personal Information on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorForSelectElementsInParticipantDetailsPage("relationship_to_you"), "proband", " Relationship to You of the Personal Information on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorUsingNormalizeSpaceInSpan(MetforminScreenerConstants.FIRST_NAME), "First Name", " First Name Label of the Personal Information on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorForInputElementInParticipantDetailsPage("first_name"), metforminScreener_TestDataManager.firstName, " First Name Value of the Personal Information on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorUsingNormalizeSpaceInSpan(MetforminScreenerConstants.MIDDLE_NAME), MetforminScreenerConstants.MIDDLE_NAME, " Middle Name Label of the Personal Information on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorForInputElementInParticipantDetailsPage("middle_name"), metforminScreener_TestDataManager.middleInitial, " Middle Name Value of the Personal Information on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorUsingNormalizeSpaceInSpan(MetforminScreenerConstants.LAST_NAME), MetforminScreenerConstants.LAST_NAME, " Last Name Label of the Personal Information on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorForInputElementInParticipantDetailsPage("last_name"), metforminScreener_TestDataManager.lastName, " Last Name Value of the Personal Information on Participant Details page ");
    }

    /*** Method to assert the Demographic Information on Participant Details */
    public void metforminDemographicsAssertionOnParticipantDetailPageInNV() {
        CharmsUtil.labelHighlight(nativeViewCHARMSParticipantStudyPage.nVParticipantDemographicsTab);
        nativeViewCHARMSParticipantStudyPage.nVParticipantDemographicsTab.click();
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorContainsText("Sex"), "Sex", " Sex Label of the General Information on Participant Details page ");
        CharmsUtil.assertDropDownData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorForSelectElementsInParticipantDetailsPage("biological_gender"), metforminScreener_TestDataManager.whatIsYouTheParticipantsSex, " Biological Gender Value of the Demographics on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorContainsText("Participant Race (Select all that apply)"), "Participant Race (Select all that apply)", " Participant Race (Select all that apply) Label of the General Information on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.nVParticipantDemographicsTabRaceDetails, metforminScreener_TestDataManager.whatIsYourTheParticipantsRacePleaseSelectAllThatApply, " Participant Race link Value of the Demographics on Participant Details page ");
        String value = nativeViewCHARMSParticipantStudyPage.nVParticipantDemographicsTabRaceDetails.getText();
        if (value.contains("Other (please specify)")) {
            CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorUsingSpanNormalizeSpace("Other"), "Other", " Other Label of the General Information on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorForInputElementInParticipantDetailsPage("other_race"), metforminScreener_TestDataManager.whatIsYourTheParticipantsRacePleaseSelectAllThatApply, " Participant Other Race Value of the Demographics on Participant Details page ");
        }
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorContainsText("Ethnicity"), "Ethnicity", " Ethnicity Label of the General Information on Participant Details page ");
        CharmsUtil.assertDropDownData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorForSelectElementsInParticipantDetailsPage("ethnicity"), metforminScreener_TestDataManager.whatIsYourTheParticipantsEthnicity, " Ethnicity Value of the Demographics on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorContainsText("Is the participant adopted?"), "Is the participant adopted?", " Is the participant adopted? Label of the General Information on Participant Details page ");
        CharmsUtil.assertDropDownData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorForSelectElementsInParticipantDetailsPage("adopted"), metforminScreener_TestDataManager.areYouTheParticipantAdopted, " Is the participant adopted of the Demographics on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorContainsText("Vital Status"), "Vital Status", " Vital Status Label of the General Information on Participant Details page ");
        CharmsUtil.assertDropDownData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorForSelectElementsInParticipantDetailsPage("person_alive"), metforminScreener_TestDataManager.vitalStatus, " Vital Status Value of the Demographics on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorContainsText("Date of Birth"), "Date of Birth", " Date of Birth Label of the General Information on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorForInputElementInParticipantDetailsPage("date_of_birth"), metforminScreener_TestDataManager.whatIsYourTheParticipantsDateOfBirth, " Date of Birth value of the Demographics on Participant Details page ");
        CharmsUtil.assertCheckBox(softAssert, fanconiScreenerNVPage.dynamicLocatorForCheckBoxElementsInPS("date_of_birth_is_estimated"), false, " Date of Birth is estimated CheckBox Value of the General Information on Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorContainsText("Date of Death"), "Date of Death", " Date of Death Label of the General Information on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorForInputElementInParticipantDetailsPage("death_date"), "", " Date of death value of the Demographics on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorContainsText("If Date of Birth is unknown, is this person 18 years old or older"), "If Date of Birth is unknown, is this person 18 years old or older", " If Date of Birth is unknown, is this person 18 years old or older Label of the General Information on Participant Details page ");
        CharmsUtil.assertDropDownData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorForSelectElementsInParticipantDetailsPage("if_date_of_birth_is_unkown_is_this_person_18_years_old_or_older"), "-- None --", " If Date of Birth is unkown of the Demographics on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorUsingNormalizeSpaceInSpan("Age"), "Age", " Age Label of the General Information on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorForReadOnlyInputValuesInParticipantDetailsPage("age"), metforminScreener_TestDataManager.calculatedAge, " Age of the Demographics on Participant Details page ");
    }

    /*** Method to assert the Contact Info on Participant Details page*/
    public void metforminContactInformationAssertionOnParticipantDetailPageInNV() {
        CharmsUtil.labelHighlight(nativeViewCHARMSParticipantStudyPage.nVParticipantContactInfoTab);
        nativeViewCHARMSParticipantStudyPage.nVParticipantContactInfoTab.click();
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorContainsText("Person who filled the screener"), "Person who filled the screener", " Person who filled the screener Label of the Contact Information on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorForInputElementInParticipantDetailsPage("legal_representative_name"), (metforminScreener_TestDataManager.firstName + " " + metforminScreener_TestDataManager.middleInitial + " " + metforminScreener_TestDataManager.lastName), " Person who filled the screener text box of the Contact Information on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorContainsText(MetforminScreenerConstants.WHAT_IS_YOUR_RELATIONSHIP_TO_PARTICIPANT), MetforminScreenerConstants.WHAT_IS_YOUR_RELATIONSHIP_TO_PARTICIPANT, " What is your relationship to the participant? Label of the Contact Information on Participant Details page ");
        CharmsUtil.assertDropDownData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorForSelectElementsInParticipantDetailsPage("relationship"), metforminScreener_TestDataManager.whatIsYourRelationshipToParticipant, " What is your relationship to the participant? Value of the Contact Info on Participant Details page ");
        if (metforminScreener_TestDataManager.proxyFirstName.contentEquals("")) {
            /** Contact Info **/
            CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorContainsText(MetforminScreenerConstants.ARE_YOU_THE_LEGAL_GUARDIAN_OF_THIS_PERSON), MetforminScreenerConstants.ARE_YOU_THE_LEGAL_GUARDIAN_OF_THIS_PERSON, " Are you the legal guardian of this person? Label of the Contact Information on Participant Details page ");
            CharmsUtil.assertDropDownData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorForSelectElementsInParticipantDetailsPage("legal_guardian"), metforminScreener_TestDataManager.areYouTheLegalGuardianOfThisPerson, " Are you the legal guardian of this person? Value of the Contact Info on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorContainsText("Does the participant need legal representation?"), "Does the participant need legal representation?", " Does the participant need legal representation? Label of the Contact Information on Participant Details page ");
            CharmsUtil.assertDropDownData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorForSelectElementsInParticipantDetailsPage("proxy_required"), "-- None --", " Does the participant need legal representation? Value of the Contact Info on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorContainsText("Contact Street Address"), "Contact Street Address", " Contact Street Address Label of the Contact Information on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorForInputElementInParticipantDetailsPage("street_address"), metforminScreener_TestDataManager.street, " Contact Street Address Value of the Contact Info on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorContainsText("Contact Street Address 2"), "Contact Street Address 2", " Contact Street Address2 Label of the Contact Information on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorForInputElementInParticipantDetailsPage("contact_street_address_2"), metforminScreener_TestDataManager.street2Optional, " Contact Street Address 2 of the Contact Info on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorContainsText("Contact City"), "Contact City", " Contact City Label of the Contact Information on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorForInputElementInParticipantDetailsPage("city"), metforminScreener_TestDataManager.city, " Contact City Value of the Contact Info on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorContainsText("Contact State"), "Contact State", " Contact State Label of the Contact Information on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorForInputElementInParticipantDetailsPage("state"), metforminScreener_TestDataManager.stateAbbreviation, " Contact State Value of the Contact Info on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorContainsText("Contact Zip Code"), "Contact Zip Code", " Contact Zip Code Label of the Contact Information on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorForInputElementInParticipantDetailsPage("zipcode"), metforminScreener_TestDataManager.zipCode, " Contact Zip Code Value of the Contact Info on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorUsingSpanNormalizeSpace("Contact Country"), "Contact Country", " Contact Country Label of the Contact Information on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorForInputElementsInParticipantDetailsPage("contact_country"), metforminScreener_TestDataManager.inWhichCountryDoYouTheParticipantCurrentlyLive, " Contact Country Value of the Contact Info on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorContainsText(MetforminScreenerConstants.REGISTRATION_EMAIL), MetforminScreenerConstants.REGISTRATION_EMAIL, " Registration Email Label of the Contact Information on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorForInputElementInParticipantDetailsPage("user_record.email"), metforminScreener_TestDataManager.registrationEmail, " Registration Email Value of the Contact Info on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorContainsText("Contact Email"), "Contact Email", " Contact Email Label of the Contact Information on Participant Details page ");
        } else {
            /** Contact Info **/
            CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorContainsText(MetforminScreenerConstants.ARE_YOU_THE_LEGAL_GUARDIAN_OF_THIS_PERSON), MetforminScreenerConstants.ARE_YOU_THE_LEGAL_GUARDIAN_OF_THIS_PERSON, " Are you the legal guardian of this person? Label of the Contact Information on Participant Details page ");
            CharmsUtil.assertDropDownData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorForSelectElementsInParticipantDetailsPage("legal_guardian"), metforminScreener_TestDataManager.areYouTheLegalGuardianOfThisPerson, " Are you the legal guardian of this person? Value of the Contact Info on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorContainsText("Does the participant need legal representation?"), "Does the participant need legal representation?", " Does the participant need legal representation? Label of the Contact Information on Participant Details page ");
            CharmsUtil.assertDropDownData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorForSelectElementsInParticipantDetailsPage("proxy_required"), "-- None --", " Does the participant need legal representation? Value of the Contact Info on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorContainsText("Contact Street Address"), "Contact Street Address", " Contact Street Address Label of the Contact Information on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorForInputElementInParticipantDetailsPage("street_address"), "", " Contact Street Address Value of the Contact Info on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorContainsText("Contact Street Address 2"), "Contact Street Address 2", " Contact Street Address2 Label of the Contact Information on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorForInputElementInParticipantDetailsPage("contact_street_address_2"), "", " Contact Street Address 2 of the Contact Info on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorContainsText("Contact City"), "Contact City", " Contact City Label of the Contact Information on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorForInputElementInParticipantDetailsPage("city"), "", " Contact City Value of the Contact Info on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorContainsText("Contact State"), "Contact State", " Contact State Label of the Contact Information on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorForInputElementInParticipantDetailsPage("state"), "", " Contact State Value of the Contact Info on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorContainsText("Contact Zip Code"), "Contact Zip Code", " Contact Zip Code Label of the Contact Information on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorForInputElementInParticipantDetailsPage("zipcode"), "", " Contact Zip Code Value of the Contact Info on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorUsingSpanNormalizeSpace("Contact Country"), "Contact Country", " Contact Country Label of the Contact Information on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorForInputElementsInParticipantDetailsPage("contact_country"), "", " Contact Country Value of the Contact Info on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorContainsText("Registration Email"), "Registration Email", " Registration Email Label of the Contact Information on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorForInputElementInParticipantDetailsPage("user_record.email"), metforminScreener_TestDataManager.registrationEmail, " Registration Email Value of the Contact Info on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorContainsText("Contact Email"), "Contact Email", " Contact Email Label of the Contact Information on Participant Details page ");
        }
        if (metforminScreener_TestDataManager.firstName.contentEquals("")) {
            CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorForInputElementInParticipantDetailsPage("email_address"), "", " Contact Email Value of the Contact Info on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorContainsText("Contact Home Phone"), "Contact Home Phone", " Contact Home Phone Label of the Contact Information on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorForInputElementInParticipantDetailsPage("phone"), "", " Contact Home Phone Value of the Contact Info on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorContainsText("Contact Cell Phone"), "Contact Cell Phone", " Contact Cell Phone Label of the Contact Information on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorForInputElementInParticipantDetailsPage("cell_phone"), "", " Contact Cell Phone Value of the Contact Info on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorContainsText("Contact Work Phone"), "Contact Work Phone", " Contact Work Phone Label of the Contact Information on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorForInputElementInParticipantDetailsPage("work_phone"), "", " Contact Work Phone Value of the Contact Info on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorContainsText("Contact Preferred phone"), "Contact Preferred phone", " Contact Preferred phone Label of the Contact Information on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorForInputElementInParticipantDetailsPage("preferred_phone"), "", " Contact Preferred phone Value of the Contact Info on Participant Details page ");
        } else {
            CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorForInputElementInParticipantDetailsPage("email_address"), metforminScreener_TestDataManager.pleaseConfirmYourTheParticipantsEmailAddress, " Contact Email Value of the Contact Info on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorContainsText("Contact Home Phone"), "Contact Home Phone", " Contact Home Phone Label of the Contact Information on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorForInputElementInParticipantDetailsPage("phone"), metforminScreener_TestDataManager.homePhoneNumber, " Contact Home Phone Value of the Contact Info on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorContainsText("Contact Cell Phone"), "Contact Cell Phone", " Contact Cell Phone Label of the Contact Information on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorForInputElementInParticipantDetailsPage("cell_phone"), metforminScreener_TestDataManager.cellPhoneNumber, " Contact Cell Phone Value of the Contact Info on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorContainsText("Contact Work Phone"), "Contact Work Phone", " Contact Work Phone Label of the Contact Information on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorForInputElementInParticipantDetailsPage("work_phone"), metforminScreener_TestDataManager.workPhoneNumber, " Contact Work Phone Value of the Contact Info on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorContainsText("Contact Preferred phone"), "Contact Preferred phone", " Contact Preferred phone Label of the Contact Information on Participant Details page ");
            CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorForInputElementInParticipantDetailsPage("preferred_phone"), metforminScreener_TestDataManager.preferred, " Contact Preferred phone Value of the Contact Info on Participant Details page ");
        }
    }

    /*** Method to assert the Proxy Contact Info on Participant Details page */
    public void metforminProxyContactInformationAssertionOnParticipantDetailPageInNV() {
        CharmsUtil.labelHighlight(nativeViewCHARMSParticipantStudyPage.nVParticipantProxyContactInfoTab);
        nativeViewCHARMSParticipantStudyPage.nVParticipantProxyContactInfoTab.click();
        CommonUtils.sleep(1000);
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorContainsText(MetforminScreenerConstants.PROXY_FIRST_NAME), MetforminScreenerConstants.PROXY_FIRST_NAME, " Proxy First Name Label of the Contact Information on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorForInputElementInParticipantDetailsPage("proxy_first_name"), metforminScreener_TestDataManager.proxyFirstName, " Proxy First Name Value of the Contact Info on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorContainsText(MetforminScreenerConstants.PROXY_MIDDLE_NAME), MetforminScreenerConstants.PROXY_MIDDLE_NAME, " Proxy Middle Name Label of the Contact Information on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorForInputElementInParticipantDetailsPage("proxy_middle_name"), metforminScreener_TestDataManager.proxyMiddleName, " Proxy Middle Name Value of the Contact Info on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorContainsText(MetforminScreenerConstants.PROXY_LAST_NAME), MetforminScreenerConstants.PROXY_LAST_NAME, " Proxy Last Name Label of the Contact Information on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorForInputElementInParticipantDetailsPage("proxy_last_name"), metforminScreener_TestDataManager.proxyLastName, " Proxy Last Name Value of the Contact Info on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorContainsText(MetforminScreenerConstants.PROXY_CONTACT_STREET_ADDRESS), MetforminScreenerConstants.PROXY_CONTACT_STREET_ADDRESS, " Proxy Contact Street Address Label of the Contact Information on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorForInputElementInParticipantDetailsPage("proxy_contact_street_address"), metforminScreener_TestDataManager.proxyContactStreetAddress, " Proxy Street Address Value of the Contact Info on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorContainsText(MetforminScreenerConstants.PROXY_CONTACT_STREET_ADDRESS_2_OPTIONAL), MetforminScreenerConstants.PROXY_CONTACT_STREET_ADDRESS_2_OPTIONAL, " Proxy Contact Street Address 2 (optional) Label of the Contact Info on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorForInputElementInParticipantDetailsPage("proxy_street_address_2"), metforminScreener_TestDataManager.proxyContactStreetAddress2Optional, " Proxy Contact Street Address 2 (optional) Value of the Contact Info on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorContainsText(MetforminScreenerConstants.PROXY_CONTACT_CITY), MetforminScreenerConstants.PROXY_CONTACT_CITY, " Proxy Contact City Label of the Contact Information on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorForInputElementInParticipantDetailsPage("proxy_contact_city"), metforminScreener_TestDataManager.proxyContactCity, " Proxy City Value of the Contact Info on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorContainsText(MetforminScreenerConstants.PROXY_CONTACT_STATE), MetforminScreenerConstants.PROXY_CONTACT_STATE, " Proxy Contact State Label of the Contact Information on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorForInputElementInParticipantDetailsPage("proxy_state"), metforminScreener_TestDataManager.proxyContactState, " Proxy Zip Code Value of the Contact Info on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorContainsText(MetforminScreenerConstants.PROXY_CONTACT_ZIPCODE), MetforminScreenerConstants.PROXY_CONTACT_ZIPCODE, " Proxy Contact Zipcode Label of the Contact Information on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorForInputElementInParticipantDetailsPage("proxy_contact_zipcode"), metforminScreener_TestDataManager.proxyContactZipcode, " Proxy Zip Code Value of the Contact Info on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorContainsText(MetforminScreenerConstants.PROXY_CONTACT_COUNTRY), MetforminScreenerConstants.PROXY_CONTACT_COUNTRY, " Proxy Contact Country Label of the Contact Information on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorForInputElementsInParticipantDetailsPage("proxy_contact_country"), metforminScreener_TestDataManager.proxyContactCountry, " Proxy Contact Country Value of the Contact Info on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorContainsText(MetforminScreenerConstants.PROXY_CONTACT_EMAIL), MetforminScreenerConstants.PROXY_CONTACT_EMAIL, " Proxy Contact Email Label of the Contact Information on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorForInputElementInParticipantDetailsPage("proxy_email_address"), metforminScreener_TestDataManager.proxyContactEmail, " Proxy Email Value of the Contact Info on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorContainsText(MetforminScreenerConstants.PROXY_CONTACT_HOME_PHONE), MetforminScreenerConstants.PROXY_CONTACT_HOME_PHONE, " Proxy Contact Home Phone Label of the Contact Information on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorForInputElementInParticipantDetailsPage("proxy_phone_number"), metforminScreener_TestDataManager.proxyContactHomePhone, " Proxy Home Phone Value of the Contact Info on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorContainsText(MetforminScreenerConstants.PROXY_CONTACT_CELL_PHONE), MetforminScreenerConstants.PROXY_CONTACT_CELL_PHONE, " Proxy Contact Cell Phone Label of the Contact Information on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorForInputElementInParticipantDetailsPage("proxy_cell_phone"), metforminScreener_TestDataManager.proxyContactCellPhone, " Proxy Cell Phone Value of the Contact Info on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorContainsText(MetforminScreenerConstants.PROXY_CONTACT_WORK_PHONE), MetforminScreenerConstants.PROXY_CONTACT_WORK_PHONE, " Proxy Contact Work Phone Label of the Contact Information on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorForInputElementInParticipantDetailsPage("proxy_work_phone"), metforminScreener_TestDataManager.proxyContactWorkPhone, " Proxy Work Phone Value of the Contact Info on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorContainsText(MetforminScreenerConstants.PROXY_PREFERRED_PHONE), MetforminScreenerConstants.PROXY_PREFERRED_PHONE, " Proxy Contact Preferred phone Label of the Contact Information on Participant Details page ");
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorForInputElementInParticipantDetailsPage("proxy_preferred_phone"), metforminScreener_TestDataManager.proxyPreferredPhone, " Proxy Preferred phone Value of the Contact Info on Participant Details page ");
    }

    public void metforminStudyScreenerPreviewRecordClicked() {
        CharmsUtil.clickOnElement(fanconiScreenerNVPage.nVParticipantStudiesTab);
        if (subjectIDValue.isEmpty()) {
            CharmsUtil.labelHighlight(fanconiScreenerNVPage.nVPreviewButtonLocator);
            JavascriptUtils.clickByJS(fanconiScreenerNVPage.nVPreviewButtonLocator);
        } else {
            System.out.println("subjectIDValue: " + subjectIDValue);
            CharmsUtil.clickOnElement(fanconiScreenerNVPage.dynamicLocatorForPreviewButtonLocator(subjectIDValue));
        }
        CommonUtils.sleep(2000);
        CommonUtils.waitForVisibility(fanconiScreenerNVPage.nVFamilyMembersOpenRecordButton);
        CharmsUtil.labelHighlight(fanconiScreenerNVPage.nVFamilyMembersOpenRecordButton);
        JavascriptUtils.clickByJS(fanconiScreenerNVPage.nVFamilyMembersOpenRecordButton);
        CommonUtils.sleep(2000);
    }

    /*** Method to assert Participant data in the Metformin Study page*/
    public void metforminStudyScreenerGeneralInformationAssertions() {
        participantName = (metforminScreener_TestDataManager.firstName + " " + metforminScreener_TestDataManager.middleInitial + " " + metforminScreener_TestDataManager.lastName);
        referralValue = nativeViewCHARMSParticipantStudyPage.dynamicLocatorForInputElements("screener_ref").getDomAttribute("value");
        participantValue = nativeViewCHARMSParticipantStudyPage.dynamicLocatorForInputElements("participant").getDomAttribute("value");
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorUsingDataNormalizeSpaceInSpan("Participant"), "Participant", "Participant label of the General Information on Fanconi Study Screener page ");
        if (Objects.requireNonNull(nativeViewCHARMSParticipantStudyPage.dynamicLocatorForInputElements("participant").getDomAttribute("value")).isEmpty()) {
            CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorForInputElements("participant"), "", "Participant Input Value of the General Information on Fanconi Study Screener page ");
        } else {
            CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorForInputElements("participant"), subjectIDValue, "Participant Input Value of the General Information on Fanconi Study Screener page ");
        }
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorUsingDataNormalizeSpaceInSpan("Name"), "Name", "Name label of the General Information on Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.nVParticipantNameValue, participantName, " Participant Name of the General Information on Participant Details page ");
        if (Objects.requireNonNull(nativeViewCHARMSParticipantStudyPage.dynamicLocatorForInputElements("participant").getDomAttribute("value")).isEmpty()) {
            CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorContainsText("Eligibility Status"), "Eligibility Status", " Eligibility Status label of the General Information on Fanconi Study Screener page ");
            CharmsUtil.assertDropDownData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorForSelectElements("eligibility_status"), "Waiting for Eligibility", " Eligibility Status Value of the General Information on Fanconi Study Screener page ");
            CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorContainsText("Enrollment Status"), "Enrollment Status", " Enrollment Status label of the General Information on Fanconi Study Screener page ");
            CharmsUtil.assertDropDownData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorForSelectElements("enrollment_status"), "New Screener Received", " Enrollment Status Value of the General Information on Fanconi Study Screener page ");
        } else {
            CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorContainsText("Eligibility Status"), "Eligibility Status", " Eligibility Status label of the General Information on Fanconi Study Screener page ");
            CharmsUtil.assertDropDownData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorForSelectElements("eligibility_status"), "Eligible", " Eligibility Status Value of the General Information on Fanconi Study Screener page ");
            CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorContainsText("Enrollment Status"), "Enrollment Status", " Enrollment Status label of the General Information on Fanconi Study Screener page ");
            CharmsUtil.assertDropDownData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorForSelectElements("enrollment_status"), "Awaiting Enrollment Forms", " Enrollment Status Value of the General Information on Fanconi Study Screener page ");
        }
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorContainsText1("Screener"), "Screener", " Screener label of the General Information on Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorForInputElements("screener_ref"), referralValue, " Referral Value of General Information on Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorContainsText("IIQ"), "IIQ", " IIQ label of the General Information on Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorForInputElements("iiq_ref"), "", " IIQ Input value of the General Information on Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorContainsText("Study Sub Categories"), "Study Sub Categories", " Study Sub Categories label of the General Information on Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorUsingDataNormalizeSpaceInSpan("Study"), "Study", " Study label of the General Information on Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorForInputElements("study"), "Metformin", " Study Input Value of the General Information on Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorContainsText("Cohort"), "Cohort", " Cohort label of the General Information on Fanconi Study Screener page ");
        if (Objects.requireNonNull(nativeViewCHARMSParticipantStudyPage.dynamicLocatorForInputElements("participant").getDomAttribute("value")).isEmpty()) {
            CharmsUtil.assertDropDownData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorForSelectElements("cohort"), "Field", " Cohort Select Value of the General Information on Fanconi Study Screener page ");
        } else {
            CharmsUtil.assertDropDownData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorForSelectElements("cohort"), "Clinical", " Cohort Select Value of the General Information on Fanconi Study Screener page ");
        }
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorContainsText("NIH MRN number"), "NIH MRN number", " NIH MRN number label of the General Information on Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.nVParticipantNIHMRNNumberInput, "", " NIH MRN number Input value of General Information on Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorContainsText("Screener Complete"), "Screener Complete", " Screener Complete label of the General Information on Fanconi Study Screener page ");
        CharmsUtil.assertCheckBox(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorForCheckBoxElements1("screener_complete"), false, " Screener Complete CheckBox Value of the General Information on Fanconi Study Screener page ");
        CharmsUtil.assertCheckBox(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorForCheckBoxElements("screener_complete"), true, " Screener Complete CheckBox Value of the General Information on Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorContainsText("IIQ Complete"), "IIQ Complete", " IIQ Complete label of the General Information on Fanconi Study Screener page ");
        CharmsUtil.assertCheckBox(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorForCheckBoxElements1("iiq_complete"), false, " IIQ Complete CheckBox Value of the General Information on Fanconi Study Screener page ");
        CharmsUtil.assertCheckBox(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorForCheckBoxElements("iiq_complete"), false, " IIQ Complete CheckBox Value of the General Information on Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorContainsText("Study Survey Complete"), "Study Survey Complete", " Study Survey Complete label of the General Information on Fanconi Study Screener page ");
        CharmsUtil.assertCheckBox(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorForCheckBoxElements1("study_survey_complete"), false, " Study Survey Complete CheckBox Value of the General Information on Fanconi Study Screener page ");
        CharmsUtil.assertCheckBox(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorForCheckBoxElements("study_survey_complete"), false, " Study Survey Complete CheckBox Value of the General Information on Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorContainsText("All Required Forms Completed"), "All Required Forms Completed", " All Required Forms Completed label of the General Information on Fanconi Study Screener page ");
        CharmsUtil.assertCheckBox(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorForCheckBoxElements1("forms_completed"), false, "All Required Forms Completed CheckBox Value of the General Information on Fanconi Study Screener page ");
        CharmsUtil.assertCheckBox(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorForCheckBoxElements("forms_completed"), false, " All Required Forms Completed CheckBox Value of the General Information on Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorContainsText("MRR Complete"), "MRR Complete", " MRR Complete label of the General Information on Fanconi Study Screener page ");
        CommonUtils.sleep(800);
        CharmsUtil.assertCheckBox(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorForCheckBoxElements1("mrr_complete"), false, " Ever Consented CheckBox Value of the General Information on Fanconi Study Screener page ");
        CharmsUtil.assertCheckBox(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorForCheckBoxElements("mrr_complete"), false, " MRR Complete CheckBox Value of the General Information on Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorContainsText("Ever Consented"), "Ever Consented", " Ever Consented label of the General Information on Fanconi Study Screener page ");
        CharmsUtil.assertCheckBox(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorForCheckBoxElements1("consent_signed"), false, " Ever Consented CheckBox Value of the General Information on Fanconi Study Screener page ");
        if (!Objects.requireNonNull(nativeViewCHARMSParticipantStudyPage.dynamicLocatorForInputElements("participant").getDomAttribute("value")).isEmpty()) {
            CharmsUtil.assertCheckBox(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorForCheckBoxElements("consent_signed"), true, " Ever Consented CheckBox Value of the General Information on Fanconi Study Screener page ");
        } else {
            CharmsUtil.assertCheckBox(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorForCheckBoxElements("consent_signed"), false, " Ever Consented CheckBox Value of the General Information on Fanconi Study Screener page ");
        }
        CharmsUtil.assertTextBoxData(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorContainsText("Ever Assented"), "Ever Assented", " Ever Assented label of the General Information on Fanconi Study Screener page ");
        CharmsUtil.assertCheckBox(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorForCheckBoxElements1("assent_signed"), false, " Ever Assented CheckBox Value of the General Information on Fanconi Study Screener page ");
        CharmsUtil.assertCheckBox(softAssert, nativeViewCHARMSParticipantStudyPage.dynamicLocatorForCheckBoxElements("assent_signed"), false, " Ever Assented CheckBox Value of the General Information on Fanconi Study Screener page ");
        CommonUtils.sleep(800);
    }

    /*** Method to click the Metformin screener Referral Page Preview button */
    public void metforminReferralPagePreviewRecordClicked() {
        CharmsUtil.clickOnElement(nativeViewCHARMSParticipantStudyPage.nVFScreenerRefPreviewRecordButton);
        CommonUtils.sleep(1000);
        CharmsUtil.clickOnElement(nativeViewCHARMSParticipantStudyPage.nVFScreenerOpenRecordButton);
    }

    /*** Method to assert data in the Metformin screener Referral Page of nativeView */
    public void metforminReferralPageGeneralInformationAssertions() {
        String referralValue = metforminScreenerPage.dynamicLocatorForInputElement("number").getDomAttribute("value");
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingNormalizeSpaceInSpan("Number"), "Number", " Number label on Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorForInputElement("number"), referralValue, " Referral Number on Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingNormalizeSpaceInSpan("Does the participant need legal representation?"), "Does the participant need legal representation?", " Does the participant need legal representation? label on Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, metforminScreenerPage.dynamicLocatorForSelectElements("proxy_required"), "-- None --", " Does the participant need legal representation Input value on Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingNormalizeSpaceInSpan("Age Completed"), "Age Completed", " Age Completed label on Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorForReadOnlyInputElements("age_completed"), metforminScreener_TestDataManager.calculatedAge, " Age Completed Read only Value on Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingNormalizeSpaceInSpan("Study"), "Study", " Study label on Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.nVFScreenerStudy, "Metformin", "Study of the General Information on Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingNormalizeSpaceInSpan("Participant Info"), "Participant Info", " Participant Info label on Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorForDisplayReadOnlyInputElements("family_member_record"), subjectIDValue, " Family Member Record of the General Information on Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingSpanTitle1("Participant Info Name", 1), "Name", " Participant Info label on Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorForReadOnlyInputElements("family_member_record.name"), participantName, " participant Name value of the General Information on Fanconi Study Screener page ");
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingNormalizeSpaceInSpan("Participant Study Data"), "Participant Study Data", " Participant Study Data label on Fanconi Study Screener page ");
        if (participantValue.isEmpty()) {
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorForDisplayReadOnlyInputElements("participant_study"), "", " participant_study' Record of the General Information on Fanconi Study Screener page ");
        } else {
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorForDisplayReadOnlyInputElements("participant_study"), participantValue, " participant_study' Record of the General Information on Fanconi Study Screener page ");
        }
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingNormalizeSpaceInSpan("Vital Status"), "Vital Status", " Vital Status label on Fanconi Study Screener page ");
        CharmsUtil.assertDropDownData(softAssert, metforminScreenerPage.nVMetforminScreenerVitalStatus, "Not answered", "Vital Status of the General Information on Fanconi Study Screener page ");
        if (participantValue.isEmpty()) {
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingNormalizeSpaceInSpan("Eligibility Status"), "Eligibility Status", " Eligibility Status label on Fanconi Study Screener page ");
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.nVFScreenerEligibilityStatus, "waiting_for_eligibility", "Eligibility Status of the General Information on Fanconi Study Screener page ");
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingNormalizeSpaceInSpan("Enrollment Status"), "Enrollment Status", " Enrollment Status label on Fanconi Study Screener page ");
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.nVFScreenerEnrollmentStatus, "1", "Enrollment Status of the General Information on Fanconi Study Screener page ");
        } else {
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingNormalizeSpaceInSpan("Eligibility Status"), "Eligibility Status", " Eligibility Status label on Fanconi Study Screener page ");
            CharmsUtil.assertDropDownData(softAssert, metforminScreenerPage.nVFScreenerEligibilityStatus, "Eligible", "Eligibility Status of the General Information on Fanconi Study Screener page ");
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingNormalizeSpaceInSpan("Enrollment Status"), "Enrollment Status", " Enrollment Status label on Fanconi Study Screener page ");
            CharmsUtil.assertDropDownData(softAssert, metforminScreenerPage.nVFScreenerEnrollmentStatus, "Awaiting Enrollment Forms", "Enrollment Status of the General Information on Fanconi Study Screener page ");
        }
    }

    /*** Method to assert the Contact Information in the Metformin screener Referral Page */
    public void metforminReferralPageContactInformationAssertion() {
        CharmsUtil.clickOnElement(metforminScreenerPage.nVFScreenerContactInfoTab);
        if (metforminScreener_TestDataManager.proxyFirstName.contentEquals("")) {
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingNormalizeSpaceInSpan(MetforminScreenerConstants.FIRST_NAME), MetforminScreenerConstants.FIRST_NAME, " First Name label of the Contact Information tab in Metformin Referral page ");
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorForInputElementsOfFamily("first_name"), metforminScreener_TestDataManager.firstName, " First Name Value of the Contact Information tab in Metformin Referral page ");
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingNormalizeSpaceInSpan(MetforminScreenerConstants.MIDDLE_NAME), MetforminScreenerConstants.MIDDLE_NAME, " Middle Name label of the Contact Information tab in Metformin Referral page ");
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorForInputElementsOfFamily("middle_name"), metforminScreener_TestDataManager.middleInitial, " Middle Name Value of the Contact Information tab in Metformin Referral page ");
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingNormalizeSpaceInSpan(MetforminScreenerConstants.LAST_NAME), MetforminScreenerConstants.LAST_NAME, " Last Name label of the Contact Information tab in Metformin Referral page ");
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorForInputElementsOfFamily("last_name"), metforminScreener_TestDataManager.lastName, " Last Name Value of the Contact Information tab in Metformin Referral page ");
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingNormalizeSpaceInSpan(MetforminScreenerConstants.IN_WHICH_COUNTRY_DO_YOU_THE_PARTICIPANT_CURRENTLY_LIVE), MetforminScreenerConstants.IN_WHICH_COUNTRY_DO_YOU_THE_PARTICIPANT_CURRENTLY_LIVE, " Contact Country label of the Contact Information tab in Metformin Referral page ");
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorForDisplayReadOnlyInputElements("country"), metforminScreener_TestDataManager.inWhichCountryDoYouTheParticipantCurrentlyLive, " Contact Country Value of the Contact Information tab in Metformin Referral page ");
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingNormalizeSpaceInSpan("Street Address"), "Street Address", " Street Address label of the Contact Information tab in Metformin Referral page ");
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorForInputElementsOfFamily("street_address"), metforminScreener_TestDataManager.street, " Street Address Value for non USA country of the Contact Information tab in Metformin Referral page ");
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingNormalizeSpaceInSpan("Street 2 (optional)"), "Street 2 (optional)", " Street 2 (optional) label of the Contact Information tab in Metformin Referral page ");
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorForInputElementsOfFamily("street_address2"), metforminScreener_TestDataManager.street2Optional, " Street 2 (optional) Value for non USA country of the Contact Information tab in Metformin Referral page ");
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingNormalizeSpaceInSpan("City"), "City", " City label of the Contact Information tab in Metformin Referral page ");
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorForInputElementsOfFamily("city"), metforminScreener_TestDataManager.city, " City Value of the Contact Information tab in Metformin Referral page ");
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingNormalizeSpaceInSpan("State/Province"), "State/Province", " State/Province label of the Contact Information tab in Metformin Referral page ");
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorForInputElementsOfFamily("state"), metforminScreener_TestDataManager.stateAbbreviation, " State/Province Value of the Contact Information tab in Metformin Referral page");
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingNormalizeSpaceInSpan("Zip Code"), "Zip Code", " Zip Code label of the Contact Information tab in Metformin Referral page ");
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorForInputElementsOfFamily("zip_code"), metforminScreener_TestDataManager.zipCode, " Contact Zip Code Value of the Contact Information tab in Metformin Referral page ");
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingNormalizeSpaceInSpan("Email Address"), "Email Address", " Email Address label of the Contact Information tab in Metformin Referral page ");
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorForInputElementsOfFamily("email_address"), metforminScreener_TestDataManager.whatIsYourTheParticipantsEmailAddress, " Contact Email Value of the Contact Information tab in Metformin Referral page ");
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingNormalizeSpaceInSpan("Preferred Contact"), "Preferred Contact", " Preferred Contact label of the Contact Information tab in Metformin Referral page ");
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorForSelectElement("preferred_contact"), metforminScreener_TestDataManager.preferredContact, " Preferred Contact Value of the Contact Information tab in Metformin Referral page ");
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingNormalizeSpaceInSpan("Home Phone Number"), "Home Phone Number", " Home Phone Number label of the Contact Information tab in Metformin Referral page ");
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorForInputElementsOfFamily("home_phone"), metforminScreener_TestDataManager.homePhoneNumber, " Contact Home Phone Value of the Contact Information tab in Metformin Referral page ");
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingNormalizeSpaceInSpan("Cell Phone Number"), "Cell Phone Number", " Cell Phone Number label of the Contact Information tab in Metformin Referral page ");
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorForInputElementsOfFamily("cell_phone"), metforminScreener_TestDataManager.cellPhoneNumber, " Cell Phone Number Value of the Contact Information tab in Metformin Referral page ");
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingNormalizeSpaceInSpan("Work Phone Number"), "Work Phone Number", " Work Phone Number label of the Contact Information tab in Metformin Referral page ");
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorForInputElementsOfFamily("work_phone"), metforminScreener_TestDataManager.workPhoneNumber, " Work Phone Number Value of the Contact Information tab in Metformin Referral page ");
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingNormalizeSpaceInSpan(MetforminScreenerConstants.ARE_YOU_THE_LEGAL_GUARDIAN_OF_THIS_PERSON), "Are you the legal guardian of this person?", " Are you the legal guardian of this person? label of the Contact Information tab in Metformin Referral page ");
            CharmsUtil.assertDropDownData(softAssert, metforminScreenerPage.dynamicLocatorForSelectElement("legal_guardian"), metforminScreener_TestDataManager.areYouTheLegalGuardianOfThisPerson, " Relationship Value of the Contact Info on Fanconi Study Screener page ");
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingNormalizeSpaceInSpan("What is your relationship to this person?"), "What is your relationship to this person?", " What is your relationship to this person? label of the Contact Information tab in Metformin Referral page ");
            CharmsUtil.assertDropDownData(softAssert, metforminScreenerPage.dynamicLocatorForSelectElement("relationship"), metforminScreener_TestDataManager.whatIsYourRelationshipToParticipant, " Relationship Value of the Contact Information tab in Metformin Referral page ");
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingNormalizeSpaceInSpan("Proxy First Name"), "Proxy First Name", " Proxy First Name label of the Contact Information tab in Metformin Referral page ");
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorForInputElementsOfFamily("your_first_name"), metforminScreener_TestDataManager.proxyFirstName, " Proxy First Name  Value of the Contact Information tab in Metformin Referral page ");
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingNormalizeSpaceInSpan("Proxy Middle Name"), "Proxy Middle Name", " Proxy Middle Name label of the Contact Information tab in Metformin Referral page ");
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorForInputElementsOfFamily("your_middle_name"), metforminScreener_TestDataManager.proxyMiddleName, " Proxy Middle Name Value of the Contact Information tab in Metformin Referral page ");
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingNormalizeSpaceInSpan("Proxy Last Name"), "Proxy Last Name", " Proxy Last Name label of the Contact Information tab in Metformin Referral page ");
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorForInputElementsOfFamily("your_last_name"), metforminScreener_TestDataManager.proxyLastName, " Proxy Last Name Value of the Contact Information tab in Metformin Referral page ");
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingNormalizeSpaceInSpan("Proxy Street Address"), "Proxy Street Address", " Proxy Street Address label of the Contact Information tab in Metformin Referral page ");
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorForInputElementsOfFamily("proxy_street_address"), "", " Street Address Value for non USA country of the Contact Information tab in Metformin Referral page ");
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingNormalizeSpaceInSpan("Proxy Street Address 2 (Optional)"), "Proxy Street Address 2 (Optional)", " Proxy Street Address 2 (Optional) label of the Contact Information tab in Metformin Referral page ");
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorForInputElementsOfFamily("proxy_street_address_2"), "", " Proxy Street Address 2 (Optional) Value for non USA country of the Contact Information tab in Metformin Referral page ");
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingNormalizeSpaceInSpan("Proxy City"), "Proxy City", " Proxy City label of the Contact Information tab in Metformin Referral page ");
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorForInputElementsOfFamily("proxy_city"), "", " Proxy City Value of the Contact Information tab in Metformin Referral page ");
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingNormalizeSpaceInSpan("Proxy State/Province"), "Proxy State/Province", " Proxy State/Province label of the Contact Information tab in Metformin Referral page ");
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorForInputElementsOfFamily("proxy_state"), "", " State/Province Value of the Contact Information tab in Metformin Referral page ");
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingNormalizeSpaceInSpan("Proxy Zip Code"), "Proxy Zip Code", " Proxy Zip Code label of the Contact Information tab in Metformin Referral page ");
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorForInputElementsOfFamily("proxy_zip_code"), "", " Proxy Zip Code Value of the Contact Information tab in Metformin Referral page ");
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingNormalizeSpaceInSpan("Proxy Email Address"), "Proxy Email Address", " Proxy Email Address label of the Contact Information tab in Metformin Referral page ");
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorForInputElementsOfFamily("proxy_email_address"), "", " Proxy Email Value of the Contact Information tab in Metformin Referral page ");
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingNormalizeSpaceInSpan("Proxy Home Phone"), "Proxy Home Phone", " Proxy Home Phone label of the Contact Information tab in Metformin Referral page ");
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorForInputElementsOfFamily("proxy_home_phone"), "", " Proxy Home Phone Value of the Contact Information tab in Metformin Referral page ");
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingNormalizeSpaceInSpan("Proxy Cell Phone"), "Proxy Cell Phone", " Proxy Cell Phone label of the Contact Information tab in Metformin Referral page ");
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorForInputElementsOfFamily("proxy_cell_phone"), "", " Proxy Cell Phone Value of the Contact Information tab in Metformin Referral page ");
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingNormalizeSpaceInSpan("Proxy Work Phone"), "Proxy Work Phone", " Proxy Work Phone label of the Contact Information tab in Metformin Referral page ");
        } else {
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingNormalizeSpaceInSpan(MetforminScreenerConstants.FIRST_NAME), MetforminScreenerConstants.FIRST_NAME, " First Name label of the Contact Information tab in Metformin Referral page ");
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorForInputElementsOfFamily("first_name"), metforminScreener_TestDataManager.firstName, " First Name of the Contact Information Value of the Contact Information tab in Metformin Referral page ");
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingNormalizeSpaceInSpan(MetforminScreenerConstants.MIDDLE_NAME), MetforminScreenerConstants.MIDDLE_NAME, " Middle Name label of the Contact Information tab in Metformin Referral page ");
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorForInputElementsOfFamily("middle_name"), metforminScreener_TestDataManager.middleInitial, " Middle Name Value of the Contact Information tab in Metformin Referral page ");
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingNormalizeSpaceInSpan(MetforminScreenerConstants.LAST_NAME), MetforminScreenerConstants.LAST_NAME, " Last Name label of the Contact Information tab in Metformin Referral page ");
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorForInputElementsOfFamily("last_name"), metforminScreener_TestDataManager.lastName, " Last Name Value of the Contact Information tab in Metformin Referral page ");
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingNormalizeSpaceInSpan("Street Address"), "Street Address", " Street Address label of the Contact Information tab in Metformin Referral page ");
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorForInputElementsOfFamily("street_address"), "", " Street Address Value for non USA country of the Contact Information tab in Metformin Referral page ");
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingNormalizeSpaceInSpan("Street 2 (optional)"), "Street 2 (optional)", " Street 2 (optional) label of the Contact Information tab in Metformin Referral page ");
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorForInputElementsOfFamily("street_address2"), "", " Street 2 (optional) Value for non USA country of the Contact Information tab in Metformin Referral page ");
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingNormalizeSpaceInSpan("City"), "City", " City label of the Contact Information tab in Metformin Referral page ");
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorForInputElementsOfFamily("city"), "", " City Value of the Contact Information tab in Metformin Referral page ");
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingNormalizeSpaceInSpan("State/Province"), "State/Province", " State/Province label of the Contact Information tab in Metformin Referral page ");
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorForInputElementsOfFamily("state"), "", " State/Province Value of the Contact Information tab in Metformin Referral page ");
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingNormalizeSpaceInSpan("Zip Code"), "Zip Code", " Zip Code label of the Contact Information tab in Metformin Referral page ");
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorForInputElementsOfFamily("zip_code"), "", " Contact Zip Code Value of the Contact Information tab in Metformin Referral page ");
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingNormalizeSpaceInSpan("Contact Country"), "Contact Country", " Contact Country label of the Contact Information tab in Metformin Referral page ");
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.nVParticipantContactCountryInput, "", " Contact Country Value of the Contact Information tab in Metformin Referral page ");
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingNormalizeSpaceInSpan("Email Address"), "Email Address", " Email Address label of the Contact Information tab in Metformin Referral page ");
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorForInputElementsOfFamily("email_address"), "", " Contact Email Value of the Contact Information tab in Metformin Referral page ");
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingNormalizeSpaceInSpan(MetforminScreenerConstants.ARE_YOU_THE_LEGAL_GUARDIAN_OF_THIS_PERSON), "Are you the legal guardian of this person?", " Are you the legal guardian of this person? label of the Contact Information tab in Metformin Referral page ");
            CharmsUtil.assertDropDownData(softAssert, metforminScreenerPage.dynamicLocatorForSelectElement("legal_guardian"), metforminScreener_TestDataManager.areYouTheLegalGuardianOfThisPerson, " Relationship Value of the Contact Information tab in Metformin Referral page ");
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingNormalizeSpaceInSpan("What is your relationship to this person?"), "What is your relationship to this person?", " What is your relationship to this person? label of the Contact Information tab in Metformin Referral page ");
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingNormalizeSpaceInSpan("Proxy First Name"), "Proxy First Name", " Proxy First Name label of the Contact Information tab in Metformin Referral page ");
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorForInputElementsOfFamily("your_first_name"), metforminScreener_TestDataManager.proxyFirstName, " Proxy First Name  Valueof the Contact Information tab in Metformin Referral page ");
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingNormalizeSpaceInSpan("Proxy Middle Name"), "Proxy Middle Name", " Proxy Middle Name label of the Contact Information tab in Metformin Referral page ");
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorForInputElementsOfFamily("your_middle_name"), metforminScreener_TestDataManager.proxyMiddleName, " Proxy Middle Name Value of the Contact Information tab in Metformin Referral page ");
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingNormalizeSpaceInSpan("Proxy Last Name"), "Proxy Last Name", " Proxy Last Name label of the Contact Information tab in Metformin Referral page ");
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorForInputElementsOfFamily("your_last_name"), metforminScreener_TestDataManager.proxyLastName, " Proxy Last Name Value of the Contact Information tab in Metformin Referral page ");
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingNormalizeSpaceInSpan("Proxy Street Address"), "Proxy Street Address", " Proxy Street Address label of the Contact Information tab in Metformin Referral page ");
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorForInputElementsOfFamily("proxy_street_address"), metforminScreener_TestDataManager.street, " Street Address Value for non USA country of the Contact Information tab in Metformin Referral page ");
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingNormalizeSpaceInSpan("Proxy Street Address 2 (Optional)"), "Proxy Street Address 2 (Optional)", " Proxy Street Address 2 (Optional) label of the Contact Information tab in Metformin Referral page ");
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorForInputElementsOfFamily("proxy_street_address_2"), metforminScreener_TestDataManager.street2Optional, " Proxy Street Address 2 (Optional) Value for non USA country of the Contact Information tab in Metformin Referral page ");
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingNormalizeSpaceInSpan("Proxy City"), "Proxy City", " Proxy City label of the Contact Information tab in Metformin Referral page ");
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorForInputElementsOfFamily("proxy_city"), metforminScreener_TestDataManager.city, " Proxy City Value of the Contact Information tab in Metformin Referral page ");
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingNormalizeSpaceInSpan("Proxy State/Province"), "Proxy State/Province", " Proxy State/Province label of the Contact Information tab in Metformin Referral page ");
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorForInputElementsOfFamily("proxy_state"), metforminScreener_TestDataManager.stateAbbreviation, " State/Province Value of the Contact Information tab in Metformin Referral page ");
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingNormalizeSpaceInSpan("Proxy Zip Code"), "Proxy Zip Code", " Proxy Zip Code label of the Contact Information tab in Metformin Referral page ");
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorForInputElementsOfFamily("proxy_zip_code"), metforminScreener_TestDataManager.zipCode, " Proxy Zip Code Value of the Contact Information tab in Metformin Referral page ");
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingNormalizeSpaceInSpan("Proxy Email Address"), "Proxy Email Address", " Proxy Email Address label of the Contact Information tab in Metformin Referral page ");
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorForInputElementsOfFamily("proxy_email_address"), metforminScreener_TestDataManager.whatIsYourTheParticipantsEmailAddress, " Proxy Email Value of the Contact Information tab in Metformin Referral page ");
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingNormalizeSpaceInSpan("Proxy Home Phone"), "Proxy Home Phone", " Proxy Home Phone label of the Contact Information tab in Metformin Referral page ");
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorForInputElementsOfFamily("proxy_home_phone"), metforminScreener_TestDataManager.homePhoneNumber, " Proxy Home Phone Valueof the Contact Information tab in Metformin Referral page ");
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingNormalizeSpaceInSpan("Proxy Cell Phone"), "Proxy Cell Phone", " Proxy Cell Phone label of the Contact Information tab in Metformin Referral page ");
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorForInputElementsOfFamily("proxy_cell_phone"), metforminScreener_TestDataManager.cellPhoneNumber, " Proxy Cell Phone Value of the Contact Information tab in Metformin Referral page ");
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingNormalizeSpaceInSpan("Proxy Work Phone"), "Proxy Work Phone", " Proxy Work Phone label of the Contact Information tab in Metformin Referral page ");
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorForInputElementsOfFamily("proxy_work_phone"), metforminScreener_TestDataManager.workPhoneNumber, " Proxy Work Phone Value of the Contact Information tab in Metformin Referral page ");
        }
    }

    /*** Method to assert the Demographics in the Metformin screener Referral Page */
    private void metforminReferralPageDemographicsAssertion() {
        CharmsUtil.clickOnElement(metforminScreenerPage.dynamicLocatorUsingNormalizeSpace("Demographics"));
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingNormalizeSpaceInSpan("Date of birth"), "Date of birth", " Date of birth label of the Demographics tab in Metformin Referral page ");
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorForInputElementsOfFamily("date_of_birth"), metforminScreener_TestDataManager.whatIsYourTheParticipantsDateOfBirth, " Date of birth Value of the of the Demographics tab in Metformin Referral page ");
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingNormalizeSpaceInSpan("Sex"), "Sex", " Biological Gender label of the Demographics tab in Metformin Referral page ");
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorForDisplayReadOnlyInputElements("biological_sex_ref"), metforminScreener_TestDataManager.whatIsYouTheParticipantsSex, " Biological Gender Value of the Demographics tab in Metformin Referral page ");
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingNormalizeSpaceInSpan("Participant Race (Select all that apply)"), "Participant Race (Select all that apply)", " Participant Race (Select all that apply) label of the Demographics tab in Metformin Referral page ");
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.nVScreenerRace, metforminScreener_TestDataManager.whatIsYourTheParticipantsRacePleaseSelectAllThatApply, " Participant Race Value of the Demographics tab in Metformin Referral page ");
        String value = metforminScreenerPage.nVScreenerRace.getText();
        if (value.contains("Other (please specify)")) {
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingNormalizeSpaceInSpan("Other race"), "Other race", " Other Race label of the Demographics tab in Metformin Referral page ");
            CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorForInputElementsOfFamily("other_race"), metforminScreener_TestDataManager.whatIsYourTheParticipantsRacePleaseSelectAllThatApply, " Participant Other Race Value of the Demographics tab in Metformin Referral page ");
        }
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingNormalizeSpaceInSpan("Adopted"), "Adopted", " Adopted label of the Demographics tab in Metformin Referral page ");
        CharmsUtil.assertDropDownData(softAssert, metforminScreenerPage.dynamicLocatorForSelectElement("u_adopted"), metforminScreener_TestDataManager.areYouTheParticipantAdopted, " Adopted  Value of the Demographics tab in Metformin Referral page ");
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingNormalizeSpaceInSpan("Ethnicity"), "Ethnicity", " Ethnicity label of the Demographics tab in Metformin Referral page ");
        CharmsUtil.assertDropDownData(softAssert, metforminScreenerPage.dynamicLocatorForSelectElement("race_ethnicity"), metforminScreener_TestDataManager.whatIsYourTheParticipantsEthnicity, " Ethnicity Value of the Demographics tab in Metformin Referral page ");
    }

    /*** Method to assert the Patients Cancer in the Metformin screener Referral Page */
    private void metforminReferralPageStudyQuestionsAssertion() {
        CharmsUtil.clickOnElement(metforminScreenerPage.dynamicLocatorUsingNormalizeSpace("Study Questions"));
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingNormalizeSpaceInSpan("Participated in Li-Fraumeni syndrome study at another site?"), "Participated in Li-Fraumeni syndrome study at another site?", " Participated in Li-Fraumeni syndrome study at another site? label of the Study Questions tab in Metformin Referral page ");
        CharmsUtil.assertDropDownData(softAssert, metforminScreenerPage.dynamicLocatorForSelectElement("participated_li_fraumeni"), metforminScreener_TestDataManager.haveYouTheParticipantEverParticipatedInALiFraumeniSyndromeStudy, " Participated in Li-Fraumeni syndrome study at another site? Value of the Study Questions tab in Metformin Referral page ");
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingNormalizeSpaceInSpan("Studies or registry group(s) for other studies:"), "Studies or registry group(s) for other studies:", " Studies or registry group(s) for other studies: label of the Study Questions tab in Metformin Referral page ");
        CharmsUtil.assertDropDownData(softAssert, metforminScreenerPage.dynamicLocatorForSelectElement("specify_other_studies"), metforminScreener_TestDataManager.pleaseSpecifyTheStudiesOrRegistryGroupsRegardingParticipationInOtherStudies, "Studies or registry group(s) for other studies: value of the Study Questions tab in Metformin Referral page ");
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingNormalizeSpaceInSpan("Do you currently receive regular Li-Fraumeni syndrome screening or management?"), "Do you currently receive regular Li-Fraumeni syndrome screening or management?", " Do you currently receive regular Li-Fraumeni syndrome screening or management? label of the Study Questions tab in Metformin Referral page ");
        CharmsUtil.assertDropDownData(softAssert, metforminScreenerPage.dynamicLocatorForSelectElement("currently_receive_management"), metforminScreener_TestDataManager.doYouCurrentlyReceiveRegularLiFraumeniSyndromeScreeningOrManagement, " Do you currently receive regular Li-Fraumeni syndrome screening or management? valueof the Study Questions tab in Metformin Referral page ");
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingNormalizeSpaceInSpan(MetforminScreenerConstants.PHYSICIAN_NAME), MetforminScreenerConstants.PHYSICIAN_NAME, " Physician Name label of the Study Questions tab in Metformin Referral page ");
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorForInputElementsOfFamily("doctor_name"), metforminScreener_TestDataManager.physicianName, " Physician Name Value of the Study Questions tab in Metformin Referral page ");
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingNormalizeSpaceInSpan(MetforminScreenerConstants.INSTITUTION_NAME), MetforminScreenerConstants.INSTITUTION_NAME, " Institution Name label of the Study Questions tab in Metformin Referral page ");
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorForInputElementsOfFamily("institution_name"), metforminScreener_TestDataManager.institutionName, " Institution Name Value of the Study Questions tab in Metformin Referral page ");
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingNormalizeSpaceInSpan(MetforminScreenerConstants.CITY_STATE_PROVINCE), MetforminScreenerConstants.CITY_STATE_PROVINCE, " City label of the Study Questions tab in Metformin Referral page ");
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorForInputElementsOfFamily("city_state_province"), metforminScreener_TestDataManager.cityStateProvince, " City Value of the Study Questions tab in Metformin Referral page ");
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingNormalizeSpaceInSpan(MetforminScreenerConstants.PHONE_NUMBER), MetforminScreenerConstants.PHONE_NUMBER, " Phone Number label of the Study Questions tab in Metformin Referral page ");
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorForInputElementsOfFamily("doctor_number"), metforminScreener_TestDataManager.phoneNumber, " Doctor Phone Number Value of the Study Questions tab in Metformin Referral page ");
    }

    /*** Method to assert the Medical Questions in the Metformin screener Referral Page */
    private void metforminReferralPageMedicalQuestionsQuestions() {
        CharmsUtil.clickOnElement(metforminScreenerPage.dynamicLocatorUsingNormalizeSpace("Medical Questions"));
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingNormalizeSpaceInSpan(MetforminScreenerConstants.ARE_YOU_THE_PARTICIPANT_CURRENTLY_PREGNANT), MetforminScreenerConstants.ARE_YOU_THE_PARTICIPANT_CURRENTLY_PREGNANT, " Are you/the participant currently pregnant? label of the Medical Questions tab in Metformin Referral page ");
        CharmsUtil.assertDropDownData(softAssert, metforminScreenerPage.dynamicLocatorForSelectElement("currently_pregnant"), metforminScreener_TestDataManager.haveYouTheParticipantEverParticipatedInALiFraumeniSyndromeStudy, " Are you/the participant currently pregnant? Value of the Medical Questions tab in Metformin Referral page ");
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingNormalizeSpaceInSpan(MetforminScreenerConstants.WERE_YOU_THE_PARTICIPANT_DIAGNOSED_WITH_CONGENITAL_LACTIC_ACIDOSIS), MetforminScreenerConstants.WERE_YOU_THE_PARTICIPANT_DIAGNOSED_WITH_CONGENITAL_LACTIC_ACIDOSIS, " Were you/the participant diagnosed with congenital lactic acidosis? label of the Medical Questions tab in Metformin Referral page ");
        CharmsUtil.assertDropDownData(softAssert, metforminScreenerPage.dynamicLocatorForSelectElement("diagnosed_lactic"), metforminScreener_TestDataManager.wereYouTheParticipantDiagnosedWithCongenitalLacticAcidosis, " Were you/the participant diagnosed with congenital lactic acidosis? Value of the Medical Questions tab in Metformin Referral page ");
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingNormalizeSpaceInSpan(MetforminScreenerConstants.HAVE_YOU_THE_PARTICIPANT_EVER_BEEN_DIAGNOSED_WITH_CANCER), MetforminScreenerConstants.HAVE_YOU_THE_PARTICIPANT_EVER_BEEN_DIAGNOSED_WITH_CANCER, " Have you/the participant ever been diagnosed with cancer? label of the Medical Questions tab in Metformin Referral page ");
        CharmsUtil.assertDropDownData(softAssert, metforminScreenerPage.dynamicLocatorForSelectElement("diagnosed_cancer"), metforminScreener_TestDataManager.haveYouTheParticipantEverBeenDiagnosedWithCancer, " Have you/the participant ever been diagnosed with cancer? Value of the Medical Questions tab in Metformin Referral page ");
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingNormalizeSpaceInSpan(MetforminScreenerConstants.HAVE_YOU_THE_PARTICIPANT_HAD_SURGERY_TO_REMOVE_CANCER_LAST_3_MONTHS), MetforminScreenerConstants.HAVE_YOU_THE_PARTICIPANT_HAD_SURGERY_TO_REMOVE_CANCER_LAST_3_MONTHS, " Have you/the participant had surgery to remove a cancer in the last 3 months? label of the Medical Questions tab in Metformin Referral page ");
        CharmsUtil.assertDropDownData(softAssert, metforminScreenerPage.dynamicLocatorForSelectElement("surgery_remove_3mnth"), metforminScreener_TestDataManager.haveYouTheParticipantHadSurgeryToRemoveCancerLast3Months, " Have you/the participant had surgery to remove a cancer in the last 3 months? Value of the Medical Questions tab in Metformin Referral page ");
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingNormalizeSpaceInSpan("Date of surgery"), "Date of surgery", " Date of surgery label of the Medical Questions tab in Metformin Referral page ");
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorForInputElement("date_of_3mnth"), metforminScreener_TestDataManager.pleaseProvideTheDateOfSurgery, " Date of surgery Value of the Medical Questions tab in Metformin Referral page ");
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingContainsText("Have you/the participant received chemotherapy or radiation in the last 6"), "Have you/the participant received chemotherapy or radiation in the last 6 months", " Have you/the participant received chemotherapy or radiation in the last 6 months? label of the Medical Questions tab in Metformin Referral page ");
        CharmsUtil.assertDropDownData(softAssert, metforminScreenerPage.dynamicLocatorForSelectElement("chemo_6mnth"), metforminScreener_TestDataManager.haveYouTheParticipantReceivedChemotherapyOrRadiationLast6Months, " Have you/the participant received chemotherapy or radiation in the last 6 months? Value of the Medical Questions tab in Metformin Referral page ");
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingContainsText("What was the date of your/the participant"), MetforminScreenerConstants.WHAT_WAS_THE_DATE_OF_PARTICIPANT_LAST_TREATMENT, " What was the date of your/the participant's last treatment? label of the Medical Questions tab in Metformin Referral page ");
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorForInputElement("date_of_6mnth"), metforminScreener_TestDataManager.whatWasTheDateOfParticipantLastTreatment, " What was the date of your/the participant's last treatment? Value of the Medical Questions tab in Metformin Referral page ");
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingNormalizeSpaceInSpan(MetforminScreenerConstants.ARE_YOU_THE_PARTICIPANT_CURRENTLY_UNDERGOING_TREATMENT_FOR_CANCER), MetforminScreenerConstants.ARE_YOU_THE_PARTICIPANT_CURRENTLY_UNDERGOING_TREATMENT_FOR_CANCER, " Are you/the participant currently undergoing treatment for a cancer? label of the Medical Questions tab in Metformin Referral page ");
        CharmsUtil.assertDropDownData(softAssert, metforminScreenerPage.dynamicLocatorForSelectElement("currently_treated_cancer"), metforminScreener_TestDataManager.areYouTheParticipantCurrentlyUndergoingTreatmentForCancer, " Are you/the participant currently undergoing treatment for a cancer? Value of the Medical Questions tab in Metformin Referral page ");
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingNormalizeSpaceInSpan(MetforminScreenerConstants.LIST_ALL_MEDICATIONS_AND_SEPARATE_WITH_A_SEMICOLON), MetforminScreenerConstants.LIST_ALL_MEDICATIONS_AND_SEPARATE_WITH_A_SEMICOLON, " What was the date of your/the participant's last treatment? label of the Medical Questions tab in Metformin Referral page ");
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorForInputElementsOfFamily("current_meds"), metforminScreener_TestDataManager.listAllMedicationsAndSeparateWithASemicolon, " What was the date of your/the participant's last treatment? Value of the Medical Questions tab in Metformin Referral page ");
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingNormalizeSpaceInSpan(MetforminScreenerConstants.DO_YOU_THE_PARTICIPANT_HAVE_A_KNOWN_ALLERGY_TO_METFORMIN), MetforminScreenerConstants.DO_YOU_THE_PARTICIPANT_HAVE_A_KNOWN_ALLERGY_TO_METFORMIN, " List all medications and separate with a semicolon (example: aspirin; Tylenol). label of the Medical Questions tab in Metformin Referral page ");
        CharmsUtil.assertDropDownData(softAssert, metforminScreenerPage.dynamicLocatorForSelectElement("allergy_metformin"), metforminScreener_TestDataManager.doYouTheParticipantHaveAKnownAllergyToMetformin, " List all medications and separate with a semicolon (example: aspirin; Tylenol). Value of the Medical Questions tab in Metformin Referral page ");
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingNormalizeSpaceInSpan(MetforminScreenerConstants.HAVE_YOU_THE_PARTICIPANT_EVER_TAKEN_METFORMIN), MetforminScreenerConstants.HAVE_YOU_THE_PARTICIPANT_EVER_TAKEN_METFORMIN, " Have you/the participant ever taken Metformin? label of the Medical Questions tab in Metformin Referral page ");
        CharmsUtil.assertDropDownData(softAssert, metforminScreenerPage.dynamicLocatorForSelectElement("taken_metformin"), metforminScreener_TestDataManager.haveYouTheParticipantEverTakenMetformin, " Have you/the participant ever taken Metformin? Value of the Medical Questions tab in Metformin Referral page ");
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingNormalizeSpaceInSpan(MetforminScreenerConstants.HAVE_YOU_THE_PARTICIPANT_TAKEN_METFORMIN_FOR_MORE_THAN_3_MONTHS_IN_TOTAL), MetforminScreenerConstants.HAVE_YOU_THE_PARTICIPANT_TAKEN_METFORMIN_FOR_MORE_THAN_3_MONTHS_IN_TOTAL, " Have you/the participant taken Metformin for more than 3 months in total? label of the Medical Questions tab in Metformin Referral page ");
        CharmsUtil.assertDropDownData(softAssert, metforminScreenerPage.dynamicLocatorForSelectElement("more_than_3mnths_met"), metforminScreener_TestDataManager.haveYouTheParticipantEverTakenMetformin, " Have you/the participant taken Metformin for more than 3 months in total? Value of the Medical Questions tab in Metformin Referral page ");
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingNormalizeSpaceInSpan(MetforminScreenerConstants.ARE_YOU_THE_PARTICIPANT_CURRENTLY_TAKING_METFORMIN), MetforminScreenerConstants.ARE_YOU_THE_PARTICIPANT_CURRENTLY_TAKING_METFORMIN, " Are you/the participant currently taking Metformin? label of the Medical Questions tab in Metformin Referral page ");
        CharmsUtil.assertDropDownData(softAssert, metforminScreenerPage.dynamicLocatorForSelectElement("currently_taking_met"), metforminScreener_TestDataManager.haveYouTheParticipantEverTakenMetformin, " Are you/the participant currently taking Metformin? Value of the Medical Questions tab in Metformin Referral page ");
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingNormalizeSpaceInSpan(MetforminScreenerConstants.WHEN_DID_YOU_THE_PARTICIPANT_STOP_TAKING_METFORMIN), MetforminScreenerConstants.WHEN_DID_YOU_THE_PARTICIPANT_STOP_TAKING_METFORMIN, " When did you/the participant stop taking Metformin? label of the Medical Questions tab in Metformin Referral page ");
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorForInputElementsOfFamily("stop_taking_met_date"), metforminScreener_TestDataManager.whenDidYouTheParticipantStopTakingMetformin, " When did you/the participant stop taking Metformin? Value of the Medical Questions tab in Metformin Referral page ");
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingNormalizeSpaceInSpan(MetforminScreenerConstants.HAVE_YOU_THE_PARTICIPANT_HAD_GENETIC_TESTING_FOR_THE_TP53_GENE), MetforminScreenerConstants.HAVE_YOU_THE_PARTICIPANT_HAD_GENETIC_TESTING_FOR_THE_TP53_GENE, " Have you/the participant had genetic testing for the TP53 gene? label of the Medical Questions tab in Metformin Referral page ");
        CharmsUtil.assertDropDownData(softAssert, metforminScreenerPage.dynamicLocatorForSelectElement("tested_tp53"), metforminScreener_TestDataManager.haveYouTheParticipantHadGeneticTestingForTheTP53Gene, " Have you/the participant had genetic testing for the TP53 gene? Value of the Medical Questions tab in Metformin Referral page ");
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingContainsText("What was the result of your/the participant"), MetforminScreenerConstants.WHAT_WAS_THE_RESULT_OF_YOUR_THE_PARTICIPANTS_TP53_GENETIC_TESTING, " What was the result of your/the participant's TP53 genetic testing? label of the Medical Questions tab in Metformin Referral page ");
        CharmsUtil.assertDropDownData(softAssert, metforminScreenerPage.dynamicLocatorForSelectElement("results_tp53"), metforminScreener_TestDataManager.whatWasTheResultOfYourTheParticipantsTP53GeneticTesting, " What was the result of your/the participant's TP53 genetic testing? Value of the Medical Questions tab in Metformin Referral page ");
    }

    /*** Method to assert the Final Questions in the Metformin screener Referral Page */
    private void metforminReferralPageFinalQuestionsAssertion() {
        CharmsUtil.clickOnElement(metforminScreenerPage.dynamicLocatorUsingNormalizeSpace("Final Questions"));
        CharmsUtil.assertTextBoxData(softAssert, metforminScreenerPage.dynamicLocatorUsingNormalizeSpaceInSpan("How did you hear about this study?"), "How did you hear about this study?", " How did you hear about this study? label of the Final Questions tab in Metformin Referral page ");
    }

    /*** Method to assert the Patient Cancer Questions in the Metformin screener Referral Page */
    private void metforminReferralPageReferralPatientCancersAssertion() {
        CharmsUtil.clickOnElement(metforminScreenerPage.dynamicLocatorUsingNormalizeSpace("Referral Patient Cancers (1)"));
        CharmsUtil.clickOnElement(metforminScreenerPage.nVMetforminScreenerCancerPreviewRecord);
    }

    /*** Method to logout of native view */
    public void logoutOfNativeViewPage() {
        CommonUtils.sleep(800);
        ServiceNow_Common_Methods.logOutOfNativeView();
        softAssert.assertAll();
    }
}