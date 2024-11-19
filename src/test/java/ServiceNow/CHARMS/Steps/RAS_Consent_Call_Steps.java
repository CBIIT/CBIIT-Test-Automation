package ServiceNow.CHARMS.Steps;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static Hooks.Hooks.softAssert;
import static appsCommon.PageInitializers.PageInitializer.*;
import static appsCommon.Pages.Selenium_Common_Locators.locateByXpath;

public class RAS_Consent_Call_Steps {

    /**
     * This method navigates to the participant's Consent Record from the Participant Details page in Native View.
     */
    @When("navigates to participant Consent Record")
    public void navigates_to_participant_consent_record() {
        JavascriptUtils.scrollIntoView(nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsConsentsTab);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsConsentsTab);
        CommonUtils.hoverOverElement(participantDetailsPage.consentStatusText);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsConsentsPreviewButton);
        CommonUtils.waitForVisibility(nativeViewCHARMSDashboardPage.rasStudyOpenRecordButton);
        CommonUtils.sleep(500);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(nativeViewCHARMSDashboardPage.rasStudyOpenRecordButton);
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeCalendar);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * Selects "Yes" in the dropdown indicating that the participant does need legal representation.
     */
    @When("selects {string} for does participant does need legal representation")
    public void selects_yes_the_participant_does_need_legal_representation(String selectOption) {
        nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsContactInfoTab.click();
        CommonUtils.waitForClickability(nativeViewCHARMSParticipantDetailsPage.doesParticipantNeedLegalRepresentationDropdown);
        CommonUtils.selectDropDownValue(selectOption, nativeViewCHARMSParticipantDetailsPage.doesParticipantNeedLegalRepresentationDropdown);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method selects the Response Type in the participant Consent Record.
     *
     * @param responseType the type of response to be selected (Must be one of the following: CHARMS e-consent, Participant upload to portal, Mail/Fax/Email/Other, iMed)
     */
    @When("selects {string} as the Response Type")
    public void selects_as_the_response_type(String responseType) {
        CucumberLogUtils.scenario.log("* * * * RESPONSE TYPE * * * *");
        CommonUtils.selectDropDownValue(responseType, nativeViewCHARMSParticipantConsentPage.rasStudyConsentResponseTypeDropDown);
    }

    /**
     * This method selects Today as the Consent Call Scheduled Time.
     */
    @When("selects Today as the Consent Call Scheduled Time")
    public void selects_today_as_the_consent_call_scheduled_time() {
        CucumberLogUtils.scenario.log("* * * * CONSENT CALL SCHEDULED TIME * * * *");
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeCalendar);
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeTodayButton);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeTodayButton);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeAcceptButton);
    }

    /**
     * This method selects Today as the Consent Call Date.
     */
    @When("selects Today as the Consent Call Date")
    public void selects_today_as_the_consent_call_date() {
        CucumberLogUtils.scenario.log("* * * * CONSENT CALL DATE * * * *");
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleDateCalendar);
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeTodayButton);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallScheduleTimeTodayButton);
    }

    /**
     * This method selects a value from the "Was verbal assent obtained?" dropdown.
     *
     * @param selectOption the option to be selected for the "Was verbal assent obtained?" dropdown (e.g., Yes, No).
     */
    @When("selects {string} for Was verbal assent obtained")
    public void selects_for_was_verbal_assent_obtained(String selectOption) {
        CucumberLogUtils.scenario.log("* * * * WAS VERBAL ASSENT OBTAINED? * * * *");
        CommonUtils.waitForClickability(nativeViewCHARMSParticipantConsentPage.rasStudyConsentWasVerbalAssentObtainedDropDown);
        CommonUtils.selectDropDownValue(selectOption, nativeViewCHARMSParticipantConsentPage.rasStudyConsentWasVerbalAssentObtainedDropDown);
    }

    /**
     * This method selects a value from the Copy of "Consent/Assent Provided Before Signing" dropdown.
     *
     * @param selectOption the option to be selected from the "Consent/Assent Provided Before Signing" dropdown.
     */
    @When("selects {string} for Copy of ConsentAssent Provided Before Signing")
    public void selects_for_copy_of_consent_assent_provided_before_signing(String selectOption) {
        CucumberLogUtils.scenario.log("* * * * COPY OF CONSENT/ASSENT PROVIDED PROVIDED BEFORE SIGNING * * * *");
        CommonUtils.waitForClickability(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCopyOfConsentAssentProvidedDropDown);
        CommonUtils.selectDropDownValue(selectOption, nativeViewCHARMSParticipantConsentPage.rasStudyConsentCopyOfConsentAssentProvidedDropDown);
    }

    /**
     * This method selects a value from the "Protocol Discussed in Private Setting" dropdown.
     *
     * @param selectOption the option to be selected from the "Protocol Discussed in Private Setting" dropdown.
     */
    @When("selects {string} for Protocol Discussed in Private Setting")
    public void selects_for_protocol_discussed_in_private_setting(String selectOption) {
        CucumberLogUtils.scenario.log("* * * * PROTOCOL DISCUSSED IN PRIVATE SETTING * * * *");
        CommonUtils.selectDropDownValue(selectOption, nativeViewCHARMSParticipantConsentPage.rasStudyConsentProtocolDiscussedInPrivateSettingDropDown);
    }

    /**
     * This method selects a value from the "Participant Verbalized Understanding of Study Conditions and Participation" dropdown.
     *
     * @param selectOption the option to be selected from the "Participant Verbalized Understanding of Study Conditions and Participation" dropdown.
     */
    @When("selects {string} for Participant Verbalized Understanding of Study Conditions and Participation")
    public void selects_for_participant_verbalized_understanding_of_study_conditions_and_participation(String selectOption) {
        CucumberLogUtils.scenario.log("* * * * PARTICIPANT VERBALIZED UNDERSTANDING OF STUDY CONDITIONS AND PARTICIPATION * * * *");
        CommonUtils.selectDropDownValue(selectOption, nativeViewCHARMSParticipantConsentPage.rasStudyConsentParticipantVerbalizedUnderstandingOfStudyConditionsAndParticipationDropDown);
    }

    /**
     * This method selects a value from the "Parent/Guardian Status" dropdown.
     *
     * @param parentGuardianStatus the option to be selected from the "Parent/Guardian Status" dropdown.
     */
    @When("selects {string} for Parent Guardian Status")
    public void selects_for_parent_guardian_status(String parentGuardianStatus) {
        CommonUtils.scrollIntoView(nativeViewCHARMSParticipantConsentPage.rasStudyConsentParentGuardianStatusDropDown);
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantConsentPage.rasStudyConsentParentGuardianStatusDropDown);
        CommonUtils.waitForClickability(nativeViewCHARMSParticipantConsentPage.rasStudyConsentParentGuardianStatusDropDown);
        CommonUtils.selectDropDownValue(parentGuardianStatus, nativeViewCHARMSParticipantConsentPage.rasStudyConsentParentGuardianStatusDropDown);
        CommonUtils.sleep(800);
    }

    /**
     * Selects the specified option for Parent/Guardian 1 Signed dropdown.
     *
     * @param selectOption the option to be selected for Parent/Guardian 1 Signed dropdown.
     */
    @When("selects {string} for Parent Guardian 1 Signed")
    public void selects_for_parent_guardian_1_signed(String selectOption) {
        CommonUtils.selectDropDownValue(selectOption, nativeViewCHARMSParticipantConsentPage.rasStudyConsentParentGuardian1SignedDropDown);
    }

    /**
     * Enters the specified name as the Parent/Guardian 1 name.
     *
     * @param parentGuardian1Name the name to be entered into the Parent/Guardian 1 name field.
     */
    @When("enters {string} as the Parent Guardian 1 name")
    public void enters_as_the_parent_guardian_1_name(String parentGuardian1Name) {
        CommonUtils.waitForClickability(nativeViewCHARMSParticipantConsentPage.rasStudyConsentParentGuardian1NameTextField);
        CommonUtils.sendKeys(nativeViewCHARMSParticipantConsentPage.rasStudyConsentParentGuardian1NameTextField, parentGuardian1Name);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * Selects the specified option for Parent/Guardian 2 Signed dropdown.
     *
     * @param selectOption the option to be selected for Parent/Guardian 2 Signed dropdown.
     */
    @When("selects {string} for Parent Guardian 2 Signed")
    public void selects_for_parent_guardian_2_signed(String selectOption) {
        CommonUtils.selectDropDownValue(selectOption, nativeViewCHARMSParticipantConsentPage.rasStudyConsentParentGuardian2SignedDropDown);
    }

    /**
     * Enters the specified name as the Parent/Guardian 2 name.
     *
     * @param parentGuardian2Name the name to be entered into the Parent/Guardian 2 name field.
     */
    @When("enters {string} as the Parent Guardian 2 name")
    public void enters_as_the_parent_guardian_2_name(String parentGuardian2Name) {
        CommonUtils.waitForClickability(nativeViewCHARMSParticipantConsentPage.rasStudyConsentParentGuardian2NameTextField);
        CommonUtils.sendKeys(nativeViewCHARMSParticipantConsentPage.rasStudyConsentParentGuardian2NameTextField, parentGuardian2Name);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method selects a value from the "Questions Addressed Before Signing" dropdown.
     *
     * @param selectOption the option to be selected from the "Questions Addressed Before Signing" dropdown.
     */
    @When("selects {string} for Questions Addressed Before Signing")
    public void selects_for_questions_addressed_before_signing(String selectOption) {
        CucumberLogUtils.scenario.log("* * * * QUESTIONS ADDRESSED BEFORE SIGNING * * * *");
        CommonUtils.selectDropDownValue(selectOption, nativeViewCHARMSParticipantConsentPage.rasStudyConsentQuestionsAddressedBeforeSigningDropDown);
    }

    /**
     * Selects the specified number of Legal Authorized Representatives (LARs) in the system.
     *
     * @param numberOfLARs the number of Legal Authorized Representatives to be selected.
     */
    @When("selects {string} for the Number of LARs")
    public void select_for_the_number_of_LARs(String numberOfLARs) {
        CommonUtils.scrollIntoView(nativeViewCHARMSParticipantConsentPage.numberOfLARsDropDown);
        CucumberLogUtils.scenario.log("* * * * * NUMBER OF LARS: " + numberOfLARs + " * * * * *");
        CommonUtils.selectDropDownValue(numberOfLARs, nativeViewCHARMSParticipantConsentPage.numberOfLARsDropDown);
        CommonUtils.sleep(800);
    }

    /**
     * Selects the specified value for LAR 1 Signed dropdown.
     *
     * @param LAR1Signed the value to be selected for LAR 1 Signed.
     */
    @When("selects {string} for LAR 1 Signed")
    public void selects_for_LAR_1_signed(String LAR1Signed) {
        CucumberLogUtils.scenario.log("* * * * * LAR 1 SIGNED: " + LAR1Signed + " * * * * *");
        CommonUtils.waitForClickability(nativeViewCHARMSParticipantConsentPage.lar1SignedDropDown);
        CommonUtils.selectDropDownValue(LAR1Signed, nativeViewCHARMSParticipantConsentPage.lar1SignedDropDown);
    }

    /**
     * Enters the specified Legal Authorized Representative (LAR) 1 name.
     *
     * @param LAR1Name the name of the Legal Authorized Representative 1 to be entered.
     */
    @When("enters {string} as the LAR 1 Name")
    public void enters_LAR_1_name(String LAR1Name) {
        CucumberLogUtils.scenario.log("* * * * * LAR 1 NAME: " + LAR1Name + " * * * * *");
        CommonUtils.waitForClickability(nativeViewCHARMSParticipantConsentPage.lar1NameTextField);
        nativeViewCHARMSParticipantConsentPage.lar1NameTextField.sendKeys(LAR1Name);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * Selects the specified value for LAR 2 Signed dropdown.
     *
     * @param LAR2Signed the value to be selected for LAR 2 Signed dropdown.
     */
    @When("selects {string} for LAR 2 Signed")
    public void selects_for_LAR_2_signed(String LAR2Signed) {
        CucumberLogUtils.scenario.log("* * * * * LAR 2 SIGNED: " + LAR2Signed + " * * * * *");
        CommonUtils.waitForClickability(nativeViewCHARMSParticipantConsentPage.lar2SignedDropDown);
        CommonUtils.selectDropDownValue(LAR2Signed, nativeViewCHARMSParticipantConsentPage.lar2SignedDropDown);
    }

    /**
     * Enters the specified Legal Authorized Representative (LAR) 2 name.
     *
     * @param LAR2Name the name of the Legal Authorized Representative 2 to be entered.
     */
    @When("enters {string} as the LAR 2 Name")
    public void enters_LAR_2_name(String LAR2Name) {
        CucumberLogUtils.scenario.log("* * * * * LAR 2 NAME: " + LAR2Name + " * * * * *");
        CommonUtils.waitForClickability(nativeViewCHARMSParticipantConsentPage.lar2NameTextField);
        nativeViewCHARMSParticipantConsentPage.lar1NameTextField.sendKeys(LAR2Name);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * Presses the Call Complete button on the participant Consent Record
     */
    @When("presses the Call Complete button")
    public void presses_the_call_complete_button() {
        CommonUtils.sleep(800);
        CucumberLogUtils.scenario.log("* * * * * CALL COMPLETE * * * * *");
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCallCompleteButton);
        CommonUtils.sleep(1000);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * Verifies the value of the Consent/Assent Status dropdown.
     *
     * @param consentAssentStatus the expected value of the Consent/Assent Status dropdown.
     */
    @Then("verifies Consent Assent status is {string}")
    public void verifies_consent_assent_status_is(String consentAssentStatus) {
        JavascriptUtils.scrollIntoView(nativeViewCHARMSParticipantConsentPage.rasStudyConsentConsentAssentStatusDropDown);
        CommonUtils.sleep(500);
        RAS_Common_Methods.softAssertDropDownValueIsSelected(nativeViewCHARMSParticipantConsentPage.rasStudyConsentConsentAssentStatusDropDown, consentAssentStatus, "* * * * * Consent/Assent Status value mismatch. * * * * *");
        CucumberLogUtils.logScreenshot();
    }

    /**
     * Selects the specified option for Consent/Assent Obtained Before Study Procedures dropdown.
     *
     * @param selectOption the option to be selected for the Consent/Assent Obtained Before Study Procedures dropdown.
     */
    @Given("selects {string} for Consent Assent Obtained Before Study Procedures")
    public void selects_for_consent_assent_obtained_before_study_procedures(String selectOption) {
        CucumberLogUtils.scenario.log("* * * * CONSENT/ASSENT OBTAINED BEFORE STUDY PROCEDURES * * * *");
        CommonUtils.selectDropDownValue(selectOption, nativeViewCHARMSParticipantConsentPage.rasStudyConsentConsentAssentObtainedBeforeStudyProceduresDropDown);
    }

    /**
     * Selects the specified option for Copy of Signed/Dated Consent/Assent Given to Participant.
     *
     * @param selectOption the option to be selected for the Copy of Signed/Dated Consent/Assent Given to Participant dropdown
     */
    @Given("selects {string} for Copy of Signed Dated Consent Assent Given to Participant")
    public void selects_for_copy_of_signed_dated_consent_assent_given_to_participant(String selectOption) {
        CucumberLogUtils.scenario.log("* * * * COPY OF SIGNED/DATED CONSENT/ASSENT GIVEN TO PARTICIPANT * * * *");
        CommonUtils.selectDropDownValue(selectOption, nativeViewCHARMSParticipantConsentPage.rasStudyConsentCopyOfSignedDatedConsentAssentGivenToParticipantDropDown);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * Verifies "Age-appropriate assent obtained?" dropdown value.
     */
    @Given("verifies Age-appropriate assent obtained value is {string}")
    public void verifies_age_appropriate_assent_obtained_value(String expectedDropDownValue) {
        JavascriptUtils.scrollIntoView(nativeViewCHARMSParticipantConsentPage.ageAppropriateAssentObtainedDropDown);
        CommonUtils.sleep(500);
        RAS_Common_Methods.softAssertDropDownValueIsSelected(nativeViewCHARMSParticipantConsentPage.ageAppropriateAssentObtainedDropDown, expectedDropDownValue, "* * * * * \"Age-appropriate assent obtained?\" value mismatch.");
        CucumberLogUtils.logScreenshot();
    }

    /**
     * Presses the Sign and Complete button.
     * Then verifies the Consent Status, Consent Date, and Signed By fields.
     */
    @Then("Study Team member presses Sign and Complete")
    public void study_team_member_presses_sign_and_complete() {
        CommonUtils.waitForClickability(nativeViewCHARMSParticipantConsentPage.rasStudyConsentSignAndCompleteButton);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantConsentPage.rasStudyConsentSignAndCompleteButton);
        CommonUtils.sleep(2000);
        CucumberLogUtils.logScreenshot();
        RAS_Common_Methods.softAssertDropDownValueIsSelected(nativeViewCHARMSParticipantConsentPage.rasStudyConsentStatusTextBox, "Complete", "* * * * * Consent Status value mismatch. * * * * *");
        softAssert.assertEquals(nativeViewCHARMSParticipantConsentPage.rasStudyConsentDateTextBox.getAttribute("value"), CommonUtils.getTodayDate(), "* * * * * Consent Date value mismatch. * * * * *");
        softAssert.assertEquals(locateByXpath("//input[@id='sys_display.x_naci_family_coho_fcsms_consent.consent_by']").getAttribute("value"), "CBIIT Test Account", "* * * * * Signed By value mismatch. * * * * *");
    }
}