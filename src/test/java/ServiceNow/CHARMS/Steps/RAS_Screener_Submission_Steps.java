package ServiceNow.CHARMS.Steps;
import java.util.Set;
import com.nci.automation.utils.CucumberLogUtils;
import org.openqa.selenium.*;
import org.testng.Assert;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;
import appsCommon.PageInitializer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RAS_Screener_Submission_Steps extends PageInitializer {

    @Given("a participant is on the RASopathies Longitudinal Cohort Study login page {string}")
    public void a_participant_is_on_the_RASopathies_Longitudinal_Cohort_Study_login_page(String applicationID) {
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl(applicationID));
        CucumberLogUtils.logScreenshot();
        WebDriverUtils.webDriver.manage().deleteAllCookies();
    }

    @When("the participant submits a screener from excel sheet {string}")
    public void the_participant_submits_a_screener_from_excel_sheet(String sheetName) {
        rasScenario1StepsImpl.rasScreenerScenarioSelector(sheetName);
    }

    @Then("data submitted for scenario is verified in native from the excel sheet {string}")
    public void data_submitted_for_scenario_is_verified_in_native_from_the_excel_sheet(String sheetName) {
        rasScenario1StepsImpl.rasScreenerVerificationScenarioSelector(sheetName);
    }

    @Then("the consent is submitted for {string}")
    public void the_consent_is_submitted_for(String sheetName) {
        rasScenario1StepsImpl.rasConsentScenarioSelector(sheetName);
    }

    @Given("the participant submits a Individual Information Questionnaire for excel sheet {string}")
    public void the_participant_submits_a_individual_information_questionnaire_for_excel_sheet(String sheetNameIiq) {
        rasScenario1StepsImpl.iiqScenarioSelector(sheetNameIiq);
    }

    @Given("a proxy is on the RASopathies Longitudinal Cohort Study login page")
    public void a_user_is_on_the_RASopathies_Longitudinal_Cohort_Study_login_page() throws TestingException {
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("myRASLoginPage"));
    }

    @Given("a proband is on the RASopathies Longitudinal Cohort Study login page")
    public void a_proband_is_on_the_RASopathies_Longitudinal_Cohort_Study_login_page() throws TestingException {
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("myRASLoginPage"));
    }

    @Given("logs in via Okta with username {string} and password {string}")
    public void logs_in_via_Okta_with_username_and_password(String username, String password) {
        rasScenario1StepsImpl.logsInViaOktaWithUsernameAndPassword(username, password);
    }

    @Given("clicks on Eligibility Questionnaire to begin questionnaire")
    public void clicks_on_Eligibility_Questionnaire_to_begin_questionnaire() {
        rasScenario1StepsImpl.clicksOnEligibilityQuestionnaireToBeginQuestionnaire();
    }

    @Given("clicks next after reviewing the STUDY INTRODUCTION")
    public void clicks_next_after_reviewing_the_STUDY_INTRODUCTION() {
        CommonUtils.switchToNextWindow();
        MiscUtils.sleep(2000);
        JavascriptUtils.scrollIntoView(rasopathyQuestionnairePage.thisFormCannotBeSavedText);
        JavascriptUtils.scrollIntoView(rasopathyQuestionnairePage.ifYouAreUnableToCompleteText);
        CommonUtils.waitForVisibility(rasopathyQuestionnairePage.studyNextButton);
        CommonUtils.clickOnElement(rasopathyQuestionnairePage.studyNextButton);
        MiscUtils.sleep(2000);
    }

    @Given("selects country {string} for In which country does participant currently live?")
    public void selects_country_for_In_which_country_does_participant_currently_live(String string) {

    }


    @Given("selects Hispanic\\/Latino option for Ethnicity of participant")
    public void selects_Hispanic_Latino_option_for_Ethnicity_of_participant() {
        MiscUtils.sleep(1000);
        CommonUtils.waitForVisibility(rasopathyQuestionnairePage.authenticityOfParticipantHispanicLatinoOption);
        rasopathyQuestionnairePage.authenticityOfParticipantHispanicLatinoOption.click();

        rasopathyQuestionnairePage.studyNextButton.click();
    }

    @Given("selects Not Hispanic\\/Latino option for Ethnicity of participant")
    public void selects_Not_Hispanic_Latino_option_for_Ethnicity_of_participant() {
        MiscUtils.sleep(1000);
        CommonUtils.waitForVisibility(rasopathyQuestionnairePage.authenticityOfParticipantNotHispanicLatinoOption);
        rasopathyQuestionnairePage.authenticityOfParticipantNotHispanicLatinoOption.click();

        rasopathyQuestionnairePage.studyNextButton.click();
    }

    /* END: Select Ethnicity of the participant */
    /* ******************************************************* */
    /* BEGINNING: Selecting Race of the participant */

    @Given("selects White, Black\\/African American, Native Hawaiian\\/Pacific Islander, American Indian\\/Alaskan Native, Asian and enters {string} for other when selecting Race of participant")
    public void selects_White_Black_African_American_Native_Hawaiian_Pacific_Islander_American_Indian_Alaskan_Native_Asian_and_enters_for_other_when_selecting_Race_of_participant(String otherRace) {
        MiscUtils.sleep(1000);
        CommonUtils.waitForVisibility(rasopathyQuestionnairePage.raceOfParticipantOtherTextBox);
        rasopathyQuestionnairePage.raceOfParticipantWhite.click();
        rasopathyQuestionnairePage.raceOfParticipantBlackAfricanAmerican.click();
        rasopathyQuestionnairePage.raceOfParticipantnativeHawaiianPacificIslander.click();
        rasopathyQuestionnairePage.raceOfParticipantAmericanIndianAlaskanNative.click();
        rasopathyQuestionnairePage.raceOfParticipantAsian.click();
        rasopathyQuestionnairePage.raceOfParticipantOther.click();
        rasopathyQuestionnairePage.raceOfParticipantOtherTextBox.sendKeys(otherRace);

        rasopathyQuestionnairePage.studyNextButton.click();
    }

    @Given("selects Feeding problems, failure to thrive, or other stomach\\/digestive problems option for participant being diagnosed with any of the listed conditions")
    public void selects_Feeding_problems_failure_to_thrive_or_other_stomach_digestive_problems_option_for_participant_being_diagnosed_with_any_of_the_listed_conditions() {
        MiscUtils.sleep(1000);
        CommonUtils.waitForVisibility(rasopathyQuestionnairePage.hasParticipantBeenDiagnosedWithConditionsFeedingProblemsOption);
        rasopathyQuestionnairePage.hasParticipantBeenDiagnosedWithConditionsFeedingProblemsOption.click();
    }

    @Given("selects skin\\/hair abnormalitiessuch as: soft loose skin, fine\\/thin\\/thick\\/dry\\/brittle\\/curly hair, slow growing hair, tumors or small skin tags near the nose or anus, lipomas, light to dark brown birth marks \\(cafe au lait spots), freckles in the armpits option for participant being diagnosed with any of the listed conditions")
    public void selects_skin_hair_abnormalitiessuch_as_soft_loose_skin_fine_thin_thick_dry_brittle_curly_hair_slow_growing_hair_tumors_or_small_skin_tags_near_the_nose_or_anus_lipomas_light_to_dark_brown_birth_marks_cafe_au_lait_spots_freckles_in_the_armpits_option_for_participant_being_diagnosed_with_any_of_the_listed_conditions() {
        rasopathyQuestionnairePage.hasParticipantBeenDiagnosedWithConditionsSkinHairAbnormalitiesOption.click();
    }

    @Given("selects No option for participant being diagnosed with a Rasopathy")
    public void selects_No_option_for_participant_being_diagnosed_with_a_Rasopathy() {
        MiscUtils.sleep(1000);
        CommonUtils.waitForVisibility(rasopathyQuestionnairePage.hasProxyBeenDiagnosedWithaRasopathyNoOption);
        rasopathyQuestionnairePage.hasProxyBeenDiagnosedWithaRasopathyNoOption.click();

        rasopathyQuestionnairePage.studyNextButton.click();
    }


    /*
     * THE SERVICENOW USER ADDS COMMENTS IN THE HISTORY SECTION AND SENDS CONSENT
     * FORM - NOT IN USE ANYMORE!!!!!!!!
     */
    @Given("the ServiceNow user adds comments in the history section {string} and sends consent form")
    public void the_ServiceNow_user_adds_comments_in_the_history_section_and_sends_consent_form(String consentComment) throws TestingException {

        CommonUtils.waitForVisibility(charmsNativeViewPage.nativeViewFamilyMemberDetailsAutomatedTestRecordHistoryTab);
        charmsNativeViewPage.nativeViewFamilyMemberDetailsAutomatedTestRecordHistoryTab.click();

        CommonUtils.waitForVisibility(charmsNativeViewPage.nativeViewFamilyMemberDetailsAutomatedTestRecordHistoryCommentsBox);
        charmsNativeViewPage.nativeViewFamilyMemberDetailsAutomatedTestRecordHistoryCommentsBox.sendKeys(consentComment);

        CommonUtils.waitForVisibility(charmsNativeViewPage.nativeViewFamilyMemberDetailsAutomatedTestRecordSendConsentButton);
        CommonUtils.scrollIntoView(charmsNativeViewPage.nativeViewFamilyMemberDetailsAutomatedTestRecordSendConsentButton);
        charmsNativeViewPage.nativeViewFamilyMemberDetailsAutomatedTestRecordSendConsentButton.click();

        /* LOGGING OUT OF NATIVE VIEW WITH DJ ACCOUNT */
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("nativeview"));

        MiscUtils.sleep(1000);
        CommonUtils.waitForVisibility(charmsNativeViewPage.nativeViewDJButton);
        charmsNativeViewPage.nativeViewDJButton.click();

        CommonUtils.waitForVisibility(charmsNativeViewPage.nativeViewLogOutButton);
        charmsNativeViewPage.nativeViewLogOutButton.click();

    }

    @When("the myRAS user signs the consent form in the Service Portal")
    public void the_myRAS_user_signs_the_consent_form_in_the_Service_Portal() throws TestingException {

        CommonUtils.waitForVisibility(myRASHomePage.rasopathyStudyConsent);
        myRASHomePage.rasopathyStudyConsent.click();

        // SCROLLING DOWN TO FIRST CHECKBOX
        JavascriptUtils.scrollIntoView(WebDriverUtils.webDriver.findElement(By.xpath("//input[@value='read']")));

        // CLICKING ON FIRST CHECKBOX
        WebDriverUtils.webDriver.findElement(By.xpath("//input[@value='read']")).click();

        // CLICKING I AM IN THIS PERSON
        WebDriverUtils.webDriver.findElement(By.xpath("//input[@aria-label='I am this person.']")).click();

        // ASSERTING NEW CONSENT TEXT FOR 'I AM IN THIS PERSON'
        // CommonUtils.assertEquals(
        // " Please indicate if you give permission for your specimens and data to be
        // stored and used for future research by selecting one of the following
        // statements: ",
        // WebDriverUtils.webDriver.findElement(By.xpath(
        // "/html/body/div/section/main/div[2]/div/sp-page-row/div/div[2]/span/div/div[1]/div/div/div[4]/div[2]/div[6]/div/label/text()"))
        // .getText());

        // CLICKING 'I DO give permission for my coded specimens and data to be stored
        // and used for future research.'
        WebDriverUtils.webDriver.findElement(By.xpath("/html/body/div/section/main/div[2]/div/sp-page-row/div/div[2]/span/div/div[1]/div/div/div[4]/div[2]/div[7]/div[1]/input")).click();

        // CLICKING I DO give permission for my coded specimens and data to be shared
        // with other researchers and used by these researchers for future research.
        WebDriverUtils.webDriver.findElement(By.xpath("//body[1]/div[1]/section[1]/main[1]/div[2]/div[1]/sp-page-row[1]/div[1]/div[2]/span[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[2]/div[10]/div[1]/input[1]")).click();

        myRasStudyConsentPage.consentButton.click();
        MiscUtils.sleep(2000);

        myRasStudyConsentPage.signingPasswordTextBox.sendKeys("RASTest2021$$");

        myRasStudyConsentPage.signButton.click();
        MiscUtils.sleep(3000);

        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("nativeview"));
        MiscUtils.sleep(1500);
        CommonUtils.waitForVisibility(testAccountResetPage.nativeViewCCButton);
        testAccountResetPage.nativeViewCCButton.click();
        CommonUtils.waitForVisibility(testAccountResetPage.nativeViewCCLogOutButton);
        testAccountResetPage.nativeViewCCLogOutButton.click();

    }

    /**
     * @param username
     * @param password
     * @throws TestingException USE BELOW METHOD TO SIGN CONSENT FORM - USE SAME
     *                          CREDENTIALS USED TO SUBMIT ELIGIBILITY QUESTIONNAIRE
     */

    @When("the myRas user signs in with Username {string} and Password {string}")
    public void the_myRas_user_signs_in_with_Username_and_Password(String username, String password) throws TestingException {

        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("myRASLoginPage"));

        CommonUtils.waitForVisibility(myRASLoginPage.loginToMyRASButton);
        myRASLoginPage.loginToMyRASButton.click();
        oktaLoginPage.usernameTxtBox.sendKeys(username);
        oktaLoginPage.passwordTxtBox.sendKeys(password);
        CommonUtils.waitForVisibility(oktaLoginPage.loginBtn);
        oktaLoginPage.loginBtn.click();

        CommonUtils.waitForVisibility(myRASHomePage.warningAgreeButton);
        myRASHomePage.warningAgreeButton.click();

        MiscUtils.sleep(1000);
        CommonUtils.waitForVisibility(myRASHomePage.rasopathyStudyConsent);
        JavascriptUtils.clickByJS(myRASHomePage.rasopathyStudyConsent);

        MiscUtils.sleep(1000);
        CommonUtils.waitForVisibility(myRasStudyConsentPage.yesIhaveReadTheTermsAndConditionsCheckbox);
        myRasStudyConsentPage.yesIhaveReadTheTermsAndConditionsCheckbox.click();

        JavascriptUtils.scrollIntoView(myRasStudyConsentPage.iAmThisPersonRadioButton);
        myRasStudyConsentPage.iAmThisPersonRadioButton.click();

        myRasStudyConsentPage.iDoGivePermissionForMyCodedSpecimensAndDataToBeStoredRadioButton.click();

        myRasStudyConsentPage.iDoGivePermissionForMyCodedSpecimensAndDataToBeSharedWithOtherResearchersRadioButton.click();

        CommonUtils.waitForVisibility(myRasStudyConsentPage.consentButton);
        myRasStudyConsentPage.consentButton.click();

        CommonUtils.waitForVisibility(myRasStudyConsentPage.signingPasswordTextBox);
        MiscUtils.sleep(1000);
        myRasStudyConsentPage.signingPasswordTextBox.sendKeys("RASTest2021$$");

        CommonUtils.waitForVisibility(myRasStudyConsentPage.signButton);
        myRasStudyConsentPage.signButton.click();
        MiscUtils.sleep(2500);

        CommonUtils.waitForVisibility(myRasStudyConsentPage.yourConsentFormHasBeenSubmittedOKbutton);
        myRasStudyConsentPage.yourConsentFormHasBeenSubmittedOKbutton.click();

        /* LOGGING OUT OF CHARMS AUTOMATED OKTA ACCOUNT */
        CommonUtils.waitForVisibility(myRASHomePage.charmsAutomatedTestTwoLink);
        myRASHomePage.charmsAutomatedTestTwoLink.click();

        CommonUtils.waitForVisibility(myRASHomePage.charmsAutomatedTestTwoSignOutLink);
        myRASHomePage.charmsAutomatedTestTwoSignOutLink.click();

    }

    /*
     * A SERVICENOW USER NAVIGATES TO CHARMS NATIVE VIEW AND OPENS RECORDS THAT ARE
     * AWAITING PI SIGNATURE
     */
    @When("a ServiceNow user navigates to CHARMS Native view and opens records that are Awaiting PI Signature")
    public void a_ServiceNow_user_navigates_to_CHARMS_Native_view_and_opens_records_that_are_Awaiting_PI_Signature() throws TestingException {

        nativeViewLoginImpl.sideDoorAccountLogin();

        CommonUtils.waitForVisibility(nativeViewHomePage.nativeViewFilterNavigator);
        nativeViewHomePage.nativeViewFilterNavigator.sendKeys("CHARMS");

        CommonUtils.waitForVisibility(charmsNativeViewPage.nativeViewDashboardLink);
        charmsNativeViewPage.nativeViewDashboardLink.click();

        CommonUtils.waitForVisibility(charmsNativeViewPage.nativeViewiFrameCHARMS);
        CommonUtils.switchToFrame(charmsNativeViewPage.nativeViewiFrameCHARMS);

        CommonUtils.waitForVisibility(charmsNativeViewPage.nativeViewAwaitingPISignatureLink);
        charmsNativeViewPage.nativeViewAwaitingPISignatureLink.click();

    }

    /*
     * SELECTS THE SUBMITTED myRAS SCREENER RECORD THAT HAS SIGNED CONSENT FORM FROM
     * PARTICIPANT ATTACHED
     */
    @Given("selects the submitted MyRAS screener record that has signed consent form from participant attached")
    public void selects_the_submitted_MyRAS_screener_record_that_has_signed_consent_form_from_participant_attached() {

        Set<String> allWindowHandles1 = WebDriverUtils.webDriver.getWindowHandles();
        for (String currentWindow1 : allWindowHandles1) {
            WebDriverUtils.webDriver.switchTo().window(currentWindow1);
        }

        CommonUtils.waitForVisibility(charmsNativeViewPage.nativeViewFamilyMemberDetailsPreviewAutomatedTestButton);
        charmsNativeViewPage.nativeViewFamilyMemberDetailsPreviewAutomatedTestButton.click();

        CommonUtils.waitForVisibility(charmsNativeViewPage.nativeViewFamilyMemberDetailsPreviewAutomatedFirstNameText);
        Assert.assertTrue(charmsNativeViewPage.nativeViewFamilyMemberDetailsPreviewAutomatedFirstNameText.getAttribute("value").contentEquals("Automated"));

        Assert.assertTrue(charmsNativeViewPage.nativeViewFamilyMemberDetailsPreviewAutomatedLastNameText.getAttribute("value").contentEquals("Test"));

        Assert.assertTrue(charmsNativeViewPage.nativeViewFamilyMemberDetailsPreviewAutomatedContactHomePhoneText.getAttribute("value").contentEquals("703-687-5816"));

        Assert.assertTrue(charmsNativeViewPage.nativeViewFamilyStudyConsentLink.isDisplayed());

        CommonUtils.waitForVisibility(charmsNativeViewPage.nativeViewFamilyMemberDetailsPreviewAutomatedTestOpenRecordButton);
        charmsNativeViewPage.nativeViewFamilyMemberDetailsPreviewAutomatedTestOpenRecordButton.click();

    }

    /* THE SERVICENOW USER SIGNS THE CONSENT FORM */

    @When("signs the consent form")
    public void signs_the_consent_form() throws TestingException {
        Set<String> allWindowHandles1 = WebDriverUtils.webDriver.getWindowHandles();
        for (String currentWindow1 : allWindowHandles1) {
            WebDriverUtils.webDriver.switchTo().window(currentWindow1);
        }

        CommonUtils.waitForVisibility(WebDriverUtils.webDriver.findElement(By.xpath("//a[@aria-label='Open record: Automated Test']")));
        WebDriverUtils.webDriver.findElement(By.xpath("//a[@aria-label='Open record: Automated Test']")).click();
        MiscUtils.sleep(2000);

        JavascriptUtils.scrollIntoView(WebDriverUtils.webDriver.findElement(By.xpath("//span[normalize-space()='Consents (1)']")));

        /**
         * Clicking on 'Consents'
         */
        WebDriverUtils.webDriver.findElement(By.xpath("//span[normalize-space()='Consents (1)']")).click();

        WebDriverUtils.webDriver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[3]/span/div[2]/div[4]/table/tbody/tr/td/div/table/tbody/tr/td[2]/a")).click();

        /**
         * Clicking on 'Open Record'
         */
        WebDriverUtils.webDriver.findElement(By.xpath("//a[normalize-space()='Open Record']")).click();

        CommonUtils.waitForVisibility(WebDriverUtils.webDriver.findElement(By.xpath("//input[@name='x_naci_family_coho_fcsms_consent.consent_date']")));
        // Entering Consent Date
        JavascriptUtils.selectDateByJS(WebDriverUtils.webDriver.findElement(By.xpath("//input[@name='x_naci_family_coho_fcsms_consent.consent_date']")), "05/05/2022");

        // Entering 'Consent By'
        WebDriverUtils.webDriver.findElement(By.xpath("//input[@name='sys_display.x_naci_family_coho_fcsms_consent.consent_by']")).sendKeys("CBIIT Test Account");
        WebDriverUtils.webDriver.findElement(By.xpath("//input[@name='sys_display.x_naci_family_coho_fcsms_consent.consent_by']")).sendKeys(Keys.RETURN);

        // Clicking 'Sign and Complete' button
        WebDriverUtils.webDriver.findElement(By.xpath("(//*[contains(text(),'Sign and Complete')])[1]")).click();

        MiscUtils.sleep(3000);

        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("nativeview"));

        MiscUtils.sleep(1500);

        CommonUtils.waitForVisibility(WebDriverUtils.webDriver.findElement(By.xpath("//a[@class='dropdown-toggle']")));
        WebDriverUtils.webDriver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();

        CommonUtils.waitForVisibility(testAccountResetPage.nativeViewCCLogOutButton);
        testAccountResetPage.nativeViewCCLogOutButton.click();

    }

    @Given("the ServiceNow user signs the consent form")
    public void the_ServiceNow_user_signs_the_consent_form() throws TestingException {

        CommonUtils.waitForVisibility(WebDriverUtils.webDriver.findElement(By.xpath("//input[@name='x_naci_family_coho_fcsms_consent.consent_date']")));
        // Entering Consent Date
        JavascriptUtils.selectDateByJS(WebDriverUtils.webDriver.findElement(By.xpath("//input[@name='x_naci_family_coho_fcsms_consent.consent_date']")), "05/05/2022");

        // Entering 'Consent By'
        WebDriverUtils.webDriver.findElement(By.xpath("//input[@name='sys_display.x_naci_family_coho_fcsms_consent.consent_by']")).sendKeys("CBIIT Test Account");
        WebDriverUtils.webDriver.findElement(By.xpath("//input[@name='sys_display.x_naci_family_coho_fcsms_consent.consent_by']")).sendKeys(Keys.RETURN);

        // Clicking 'Sign and Complete' button
        WebDriverUtils.webDriver.findElement(By.xpath("(//*[contains(text(),'Sign and Complete')])[1]")).click();

        MiscUtils.sleep(3000);

        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("nativeview"));

        MiscUtils.sleep(1500);

        CommonUtils.waitForVisibility(WebDriverUtils.webDriver.findElement(By.xpath("//a[@class='dropdown-toggle']")));
        WebDriverUtils.webDriver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();

        CommonUtils.waitForVisibility(testAccountResetPage.nativeViewCCLogOutButton);
        testAccountResetPage.nativeViewCCLogOutButton.click();

    }

    /* *************************************************************** */
    /* **************** THE END ************************************** */
    /* *************************************************************** */

    /* -------------- ******* CGB IIQ SUBMISSION ********* ------------------ */
    @Given("clicks on the Individual Information Questionnaire to begin the IIQ form")
    public void clicks_on_the_Individual_Information_Questionnaire_to_begin_the_IIQ_form() {

        CommonUtils.waitForVisibility(myRASHomePage.warningAgreeButton);
        myRASHomePage.warningAgreeButton.click();

        CommonUtils.waitForVisibility(myRASHomePage.rasoptathyIndividualInformationQuestionnaire);
        MiscUtils.sleep(1000);
        myRASHomePage.rasoptathyIndividualInformationQuestionnaire.click();
        MiscUtils.sleep(65000);
    }

    static String cgbIIQOneTimePin;

    @Given("enters email address {string} and One Time Pin code to proceed with the form")
    public void enters_email_address_and_One_Time_Pin_code_to_proceed_with_the_form(String emailAddress) {

        CommonUtils.waitForVisibility(myRASHomePage.rasoptathyIndividualInformationQuestionnairePinText);

        cgbIIQOneTimePin = myRASHomePage.rasoptathyIndividualInformationQuestionnairePinText.getText();

        CommonUtils.waitForVisibility(myRASHomePage.rasoptathyIndividualInformationQuestionnaireOneTimePinGoButton);
        myRASHomePage.rasoptathyIndividualInformationQuestionnaireOneTimePinGoButton.click();

        Set<String> allWindowHandles1 = WebDriverUtils.webDriver.getWindowHandles();
        for (String currentWindow1 : allWindowHandles1) {
            WebDriverUtils.webDriver.switchTo().window(currentWindow1);
        }

        MiscUtils.sleep(1000);
        CommonUtils.waitForVisibility(cgbIIQPage.cgbIIQOneTimePinTextBox);
        // MiscUtils.sleep(2000);
        cgbIIQPage.cgbIIQOneTimeEmailTextBox.sendKeys("charmsras5@yahoo.com");
        cgbIIQPage.cgbIIQOneTimePinTextBox.sendKeys(cgbIIQOneTimePin);


        JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);

        /** DEBUG HERE --------- ISSUE WAS FOUND TEST CASE WILL BE UPDATED */
        cGBIIQPages.nextButton.click();
        MiscUtils.sleep(1000);
        // MiscUtils.sleep(10000);
    }
}