package CHARMS.steps;

import CHARMS.constants.Native_View_Constants;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static Hooks.Hooks.softAssert;
import static APPS_COMMON.PageInitializers.PageInitializer.*;
import static APPS_COMMON.Pages.Selenium_Common_Locators.locateByXpath;

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
     * Selects the specified option for whether the participant needs legal representation.
     *
     * @param selectOption The option to select for whether the participant needs legal representation
     */
    @When("selects {string} for does participant does need legal representation")
    public void selects_yes_the_participant_does_need_legal_representation(String selectOption) {
        nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsContactInfoTab.click();
        CommonUtils.waitForClickability(nativeViewCHARMSParticipantDetailsPage.doesParticipantNeedLegalRepresentationDropdown);
        CommonUtils.selectDropDownValue(selectOption, nativeViewCHARMSParticipantDetailsPage.doesParticipantNeedLegalRepresentationDropdown);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method selects the Collection Method in the participant Consent Record.
     *
     * @param collectionMethod the type of response to be selected (Must be one of the following: CHARMS e-consent, Participant upload to portal, Mail/Fax/Email/Other, iMed)
     */
    @When("selects {string} as the Collection Method")
    public void selects_as_the_collection_method(String collectionMethod) {
        CucumberLogUtils.scenario.log("* * * * COLLECTION METHOD * * * *");
        CHARMS.steps.RAS_Common_Methods.softAssertDropdownOptions(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCollectionMethodDropDown, Native_View_Constants.consentRecordCollectionMethodDropdownOptions, "---- VERIFYING COLLECTION METHOD DROPDOWN OPTIONS ----");
        CommonUtils.selectDropDownValue(collectionMethod, nativeViewCHARMSParticipantConsentPage.rasStudyConsentCollectionMethodDropDown);
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
        CHARMS.steps.RAS_Common_Methods.softAssertDropdownOptions(nativeViewCHARMSParticipantConsentPage.rasStudyConsentWasVerbalAssentObtainedDropDown, Native_View_Constants.consentRecordWasVerbalAssentObtainedDropdownOptions, "---- VERIFYING WAS VERBAL ASSENT OBTAINED? DROPDOWN OPTIONS ----");
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
        CHARMS.steps.RAS_Common_Methods.softAssertDropdownOptions(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCopyOfConsentAssentProvidedDropDown, Native_View_Constants.consentRecordYesNoQuestionDropdownOptions, "---- VERIFYING COPY OF CONSENT/ASSENT PROVIDED PROVIDED BEFORE SIGNING DROPDOWN OPTIONS ----");
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
        CHARMS.steps.RAS_Common_Methods.softAssertDropdownOptions(nativeViewCHARMSParticipantConsentPage.rasStudyConsentProtocolDiscussedInPrivateSettingDropDown, Native_View_Constants.consentRecordYesNoQuestionDropdownOptions, "---- VERIFYING PROTOCOL DISCUSSED IN PRIVATE SETTING DROPDOWN OPTIONS ----");
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
        CHARMS.steps.RAS_Common_Methods.softAssertDropdownOptions(nativeViewCHARMSParticipantConsentPage.rasStudyConsentParticipantVerbalizedUnderstandingOfStudyConditionsAndParticipationDropDown, Native_View_Constants.consentRecordYesNoQuestionDropdownOptions, "---- VERIFYING PARTICIPANT VERBALIZED UNDERSTANDING OF STUDY CONDITIONS AND PARTICIPATION DROPDOWN OPTIONS ----");
        CommonUtils.selectDropDownValue(selectOption, nativeViewCHARMSParticipantConsentPage.rasStudyConsentParticipantVerbalizedUnderstandingOfStudyConditionsAndParticipationDropDown);
    }

    /**
     * This method selects a value from the "Questions Addressed Before Signing" dropdown.
     *
     * @param selectOption the option to be selected from the "Questions Addressed Before Signing" dropdown.
     */
    @When("selects {string} for Questions Addressed Before Signing")
    public void selects_for_questions_addressed_before_signing(String selectOption) {
        CucumberLogUtils.scenario.log("* * * * QUESTIONS ADDRESSED BEFORE SIGNING * * * *");
        CHARMS.steps.RAS_Common_Methods.softAssertDropdownOptions(nativeViewCHARMSParticipantConsentPage.rasStudyConsentQuestionsAddressedBeforeSigningDropDown, Native_View_Constants.consentRecordYesNoQuestionDropdownOptions, "---- VERIFYING QUESTIONS ADDRESSED BEFORE SIGNING DROPDOWN OPTIONS ----");
        CommonUtils.selectDropDownValue(selectOption, nativeViewCHARMSParticipantConsentPage.rasStudyConsentQuestionsAddressedBeforeSigningDropDown);
    }

    /**
     * Selects the specified option for Consent/Assent Obtained Before Study Procedures dropdown.
     *
     * @param selectOption the option to be selected for the Consent/Assent Obtained Before Study Procedures dropdown.
     */
    @Given("selects {string} for Consent Assent Obtained Before Study Procedures")
    public void selects_for_consent_assent_obtained_before_study_procedures(String selectOption) {
        CucumberLogUtils.scenario.log("* * * * CONSENT/ASSENT OBTAINED BEFORE STUDY PROCEDURES * * * *");
        CHARMS.steps.RAS_Common_Methods.softAssertDropdownOptions(nativeViewCHARMSParticipantConsentPage.rasStudyConsentConsentAssentObtainedBeforeStudyProceduresDropDown, Native_View_Constants.consentRecordYesNoQuestionDropdownOptions, "---- VERIFYING CONSENT/ASSENT OBTAINED BEFORE STUDY PROCEDURES DROPDOWN OPTIONS ----");
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
        CHARMS.steps.RAS_Common_Methods.softAssertDropdownOptions(nativeViewCHARMSParticipantConsentPage.rasStudyConsentCopyOfSignedDatedConsentAssentGivenToParticipantDropDown, Native_View_Constants.consentRecordYesNoQuestionDropdownOptions, "---- VERIFYING COPY OF SIGNED/DATED CONSENT/ASSENT GIVEN TO PARTICIPANT DROPDOWN OPTIONS ----");
        CommonUtils.selectDropDownValue(selectOption, nativeViewCHARMSParticipantConsentPage.rasStudyConsentCopyOfSignedDatedConsentAssentGivenToParticipantDropDown);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * Selects whether an interpreter was used from the dropdown.
     *
     * @param selectOption The option to select for whether an interpreter was used
     */
    @Given("selects {string} was Interpreter used")
    public void selects_was_interpreter_used(String selectOption) {
        CucumberLogUtils.scenario.log("* * * * INTERPRETER USED? * * * *");
        CommonUtils.waitForClickability(nativeViewCHARMSParticipantConsentPage.rasStudyConsentInterpreterUsedDropDown);
        CucumberLogUtils.logScreenshot();
        softAssert.assertTrue(locateByXpath("//span[normalize-space()='Interpreter used?']").isDisplayed());
        CHARMS.steps.RAS_Common_Methods.softAssertDropdownOptions(nativeViewCHARMSParticipantConsentPage.rasStudyConsentInterpreterUsedDropDown, Native_View_Constants.consentRecordYesNoQuestionDropdownOptions, "---- VERIFYING INTERPRETER USED DROPDOWN OPTIONS ----");
        CommonUtils.selectDropDownValue(selectOption, nativeViewCHARMSParticipantConsentPage.rasStudyConsentInterpreterUsedDropDown);
    }

    /**
     * Enters the provided interpreter name or ID into the corresponding text field on the page.
     *
     * @param interpreterNameOrId The interpreter name or ID to be entered into the text field
     */
    @Given("enters {string} for Interpreter Name or ID")
    public void enters_for_interpreter_name_or_id(String interpreterNameOrId) {
        CucumberLogUtils.scenario.log("* * * * INTERPRETER NAME OR ID * * * *");
        CommonUtils.waitForVisibility(locateByXpath("//span[normalize-space()='Interpreter Name or ID']"));
        softAssert.assertTrue(locateByXpath("//span[normalize-space()='Interpreter Name or ID']").isDisplayed());
        softAssert.assertTrue(nativeViewCHARMSParticipantConsentPage.rasStudyConsentInterpreterNameOrIdTextField.isDisplayed());
        softAssert.assertTrue(nativeViewCHARMSParticipantConsentPage.rasStudyConsentInterpreterNameOrIdTextField.isEnabled());
        nativeViewCHARMSParticipantConsentPage.rasStudyConsentInterpreterNameOrIdTextField.sendKeys(interpreterNameOrId);
    }

    /**
     * Enters the specified interpreter language for the Interpreter Language field.
     *
     * @param interpreterLanguage The interpreter language to be entered for the Interpreter Language field.
     */
    @Given("enters {string} for Interpreter Language")
    public void enters_for_interpreter_language(String interpreterLanguage) {
        CucumberLogUtils.scenario.log("* * * * INTERPRETER LANGUAGE * * * *");
        CommonUtils.waitForVisibility(locateByXpath("//span[normalize-space()='Interpreter Language']"));
        softAssert.assertTrue(locateByXpath("//span[normalize-space()='Interpreter Language']").isDisplayed());
        softAssert.assertTrue(nativeViewCHARMSParticipantConsentPage.rasStudyConsentInterpreterLanguageTextField.isDisplayed());
        softAssert.assertTrue(nativeViewCHARMSParticipantConsentPage.rasStudyConsentInterpreterLanguageTextField.isEnabled());
        nativeViewCHARMSParticipantConsentPage.rasStudyConsentInterpreterLanguageTextField.sendKeys(interpreterLanguage);
    }

    /**
     * Selects the given option for Interpreter Witness dropdown in the consent form.
     *
     * @param selectOption The option to be selected in the Interpreter Witness dropdown.
     */
    @Given("selects {string} for Interpreter Witness")
    public void selects_for_interpreter_witness(String selectOption) {
        CucumberLogUtils.scenario.log("* * * * INTERPRETER WITNESS * * * *");
        CommonUtils.waitForClickability(nativeViewCHARMSParticipantConsentPage.rasStudyConsentInterpreterWitnessDropDown);
        softAssert.assertTrue(locateByXpath("//span[normalize-space()='Interpreter Witness?']").isDisplayed());
        CHARMS.steps.RAS_Common_Methods.softAssertDropdownOptions(nativeViewCHARMSParticipantConsentPage.rasStudyConsentInterpreterWitnessDropDown, Native_View_Constants.consentRecordInterpreterWitnessDropdownOptions, "---- VERIFYING INTERPRETER WITNESS DROPDOWN OPTIONS ----");
        CommonUtils.selectDropDownValue(selectOption, nativeViewCHARMSParticipantConsentPage.rasStudyConsentInterpreterWitnessDropDown);
    }

    /**
     * Selects the specified option for Interpreter Signed dropdown in the participant consent page.
     *
     * @param selectOption The option to be selected in the Interpreter Signed dropdown.
     */
    @Given("selects {string} for Interpreter Signed")
    public void selects_for_interpreter_signed(String selectOption) {
        CucumberLogUtils.scenario.log("* * * * INTERPRETER SIGNED * * * *");
        CommonUtils.waitForClickability(nativeViewCHARMSParticipantConsentPage.rasStudyConsentInterpreterSignedDropDown);
        softAssert.assertTrue(locateByXpath("//span[normalize-space()='Interpreter Signed']").isDisplayed());
        CHARMS.steps.RAS_Common_Methods.softAssertDropdownOptions(nativeViewCHARMSParticipantConsentPage.rasStudyConsentInterpreterSignedDropDown, Native_View_Constants.consentRecordInterpreterSignedDropdownOptions, "---- VERIFYING INTERPRETER SIGNED DROPDOWN OPTIONS ----");
        CommonUtils.selectDropDownValue(selectOption, nativeViewCHARMSParticipantConsentPage.rasStudyConsentInterpreterSignedDropDown);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method selects a value from the "Parent/Guardian Status" dropdown.
     *
     * @param parentGuardianStatus the option to be selected from the "Parent/Guardian Status" dropdown.
     */
    @When("selects {string} for Parent Guardian Status")
    public void selects_for_parent_guardian_status(String parentGuardianStatus) {
        CucumberLogUtils.scenario.log("* * * * SELECTS PARENT/GUARDIAN STATUS: " + parentGuardianStatus + " * * * *");
        CommonUtils.scrollIntoView(nativeViewCHARMSParticipantConsentPage.rasStudyConsentParentGuardianStatusDropDown);
        CommonUtils.waitForVisibility(nativeViewCHARMSParticipantConsentPage.rasStudyConsentParentGuardianStatusDropDown);
        CommonUtils.waitForClickability(nativeViewCHARMSParticipantConsentPage.rasStudyConsentParentGuardianStatusDropDown);
        CHARMS.steps.RAS_Common_Methods.softAssertDropdownOptions(nativeViewCHARMSParticipantConsentPage.rasStudyConsentParentGuardianStatusDropDown, Native_View_Constants.consentRecordParentGuardianStatusDropdownOptions, "---- VERIFYING PARENT/GUARDIAN STATUS DROPDOWN OPTIONS ----");
        CommonUtils.selectDropDownValue(parentGuardianStatus, nativeViewCHARMSParticipantConsentPage.rasStudyConsentParentGuardianStatusDropDown);
        CommonUtils.sleep(800);
        CHARMS.steps.RAS_Common_Methods.softAssertDropdownOptions(nativeViewCHARMSParticipantConsentPage.rasStudyConsentNumberOfParentGuardianSignaturesRequiredDropDown, Native_View_Constants.consentRecordGuardianSignaturesRequiredDropdownOptions, "---- VERIFYING NUMBER OF PARENT/GUARDIAN SIGNATURES REQUIRED DROPDOWN OPTIONS ----");
    }

    /**
     * Selects the specified option for Parent/Guardian 1 Signed dropdown.
     *
     * @param selectOption the option to be selected for Parent/Guardian 1 Signed dropdown.
     */
    @When("selects {string} for Parent Guardian 1 Signed")
    public void selects_for_parent_guardian_1_signed(String selectOption) {
        CucumberLogUtils.scenario.log("* * * * SELECTS PARENT/GUARDIAN 1 SIGNED: " + selectOption + " * * * *");
        CHARMS.steps.RAS_Common_Methods.softAssertDropdownOptions(nativeViewCHARMSParticipantConsentPage.rasStudyConsentParentGuardian1SignedDropDown, Native_View_Constants.consentRecordGuardianSignedDropdownOptions, "---- VERIFYING SELECTS PARENT/GUARDIAN 1 SIGNED DROPDOWN OPTIONS ----");
        CommonUtils.selectDropDownValue(selectOption, nativeViewCHARMSParticipantConsentPage.rasStudyConsentParentGuardian1SignedDropDown);
    }

    /**
     * Enters the specified name as the Parent/Guardian 1 name.
     *
     * @param parentGuardian1Name the name to be entered into the Parent/Guardian 1 name field.
     */
    @When("enters {string} as the Parent Guardian 1 name")
    public void enters_as_the_parent_guardian_1_name(String parentGuardian1Name) {
        CucumberLogUtils.scenario.log("* * * * ENTERS PARENT/GUARDIAN 1 NAME * * * *");
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
        CucumberLogUtils.scenario.log("* * * * SELECTS PARENT/GUARDIAN 2 SIGNED: " + selectOption + " * * * *");
        CHARMS.steps.RAS_Common_Methods.softAssertDropdownOptions(nativeViewCHARMSParticipantConsentPage.rasStudyConsentParentGuardian1SignedDropDown, Native_View_Constants.consentRecordGuardianSignedDropdownOptions, "---- VERIFYING SELECTS PARENT/GUARDIAN 2 SIGNED DROPDOWN OPTIONS ----");
        CommonUtils.selectDropDownValue(selectOption, nativeViewCHARMSParticipantConsentPage.rasStudyConsentParentGuardian2SignedDropDown);
    }

    /**
     * Enters the specified name as the Parent/Guardian 2 name.
     *
     * @param parentGuardian2Name the name to be entered into the Parent/Guardian 2 name field.
     */
    @When("enters {string} as the Parent Guardian 2 name")
    public void enters_as_the_parent_guardian_2_name(String parentGuardian2Name) {
        CucumberLogUtils.scenario.log("* * * * ENTERS PARENT/GUARDIAN 2 NAME * * * *");
        CommonUtils.waitForClickability(nativeViewCHARMSParticipantConsentPage.rasStudyConsentParentGuardian2NameTextField);
        CommonUtils.sendKeys(nativeViewCHARMSParticipantConsentPage.rasStudyConsentParentGuardian2NameTextField, parentGuardian2Name);
        CucumberLogUtils.logScreenshot();
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
        CHARMS.steps.RAS_Common_Methods.softAssertDropdownOptions(nativeViewCHARMSParticipantConsentPage.numberOfLARsDropDown, Native_View_Constants.consentRecordNumberOfLarsDropdownOptions, "---- VERIFYING NUMBER OF LARS DROPDOWN OPTIONS ----");
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
        CHARMS.steps.RAS_Common_Methods.softAssertDropdownOptions(nativeViewCHARMSParticipantConsentPage.lar1SignedDropDown, Native_View_Constants.consentRecordLARSignedDropdownOptions, "---- VERIFYING LAR 1 SIGNED DROPDOWN OPTIONS ----");
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
        CucumberLogUtils.scenario.log("* * * * * LAR 1 NAME * * * * *");
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
        CHARMS.steps.RAS_Common_Methods.softAssertDropdownOptions(nativeViewCHARMSParticipantConsentPage.lar2SignedDropDown, Native_View_Constants.consentRecordLARSignedDropdownOptions, "---- VERIFYING LAR 2 SIGNED DROPDOWN OPTIONS ----");
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
        CucumberLogUtils.scenario.log("* * * * * LAR 2 NAME * * * * *");
        CommonUtils.waitForClickability(nativeViewCHARMSParticipantConsentPage.lar2NameTextField);
        nativeViewCHARMSParticipantConsentPage.lar2NameTextField.sendKeys(LAR2Name);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * Verifies that Consent Assent category is auto-populated to the expected value.
     *
     * @param expectedConsentAssentCategory the expected Consent Assent category to be auto-populated
     */
    @When("verifies that Consent Assent category auto-populated to {string}")
    public void verifies_that_consent_assent_category_auto_populated_to(String expectedConsentAssentCategory) {
        CommonUtils.waitForClickability(nativeViewCHARMSParticipantConsentPage.rasStudyConsentAssentCategoryDropDown);
        JavascriptUtils.scrollIntoView(nativeViewCHARMSParticipantConsentPage.rasStudyConsentAssentCategoryDropDown);
        CHARMS.steps.RAS_Common_Methods.softAssertDropdownOptions(nativeViewCHARMSParticipantConsentPage.rasStudyConsentAssentCategoryDropDown, Native_View_Constants.consentRecordConsentAssentCategoryDropdownOptions, "---- VERIFYING CONSENT/ASSENT CATEGORY DROPDOWN OPTIONS ----");
        CommonUtils.verifyingDropDownValueIsSelected(nativeViewCHARMSParticipantConsentPage.rasStudyConsentAssentCategoryDropDown, expectedConsentAssentCategory, "---- Consent/Assent Category Dropdown Options Mismatch ----");
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
        CHARMS.steps.RAS_Common_Methods.softAssertDropdownOptions(nativeViewCHARMSParticipantConsentPage.rasStudyConsentConsentAssentStatusDropDown, Native_View_Constants.consentRecordConsentAssentStatusDropdownOptions, "---- VERIFYING CONSENT/ASSENT STATUS DROPDOWN OPTIONS ----");
        CHARMS.steps.RAS_Common_Methods.softAssertDropDownValueIsSelected(nativeViewCHARMSParticipantConsentPage.rasStudyConsentConsentAssentStatusDropDown, consentAssentStatus, "---- Consent/Assent Status value mismatch ----");
        CucumberLogUtils.logScreenshot();
    }

    /**
     * Selects the specified option for age-appropriate assent obtained dropdown.
     *
     * @param selectOption The option to be selected for age-appropriate assent obtained dropdown.
     */
    @Then("selects {string} for Age-appropriate assent obtained")
    public void selects_for_age_appropriate_assent_obtained(String selectOption) {
        JavascriptUtils.scrollIntoView(nativeViewCHARMSParticipantConsentPage.ageAppropriateAssentObtainedDropDown);
        CommonUtils.sleep(500);
        CHARMS.steps.RAS_Common_Methods.softAssertDropdownOptions(nativeViewCHARMSParticipantConsentPage.ageAppropriateAssentObtainedDropDown, Native_View_Constants.consentRecordYesNoQuestionDropdownOptions, "---- VERIFYING AGE-APPROPRIATE ASSENT OBTAINED DROPDOWN OPTIONS ----");
        CommonUtils.selectDropDownValue(selectOption, nativeViewCHARMSParticipantConsentPage.ageAppropriateAssentObtainedDropDown);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * Verifies "Age-appropriate assent obtained?" dropdown value.
     *
     * @param expectedDropDownValue The expected dropdown value to verify against
     */
    @Given("verifies Age-appropriate assent obtained value is {string}")
    public void verifies_age_appropriate_assent_obtained_value(String expectedDropDownValue) {
        JavascriptUtils.scrollIntoView(nativeViewCHARMSParticipantConsentPage.ageAppropriateAssentObtainedDropDown);
        CommonUtils.sleep(500);
        CHARMS.steps.RAS_Common_Methods.softAssertDropdownOptions(nativeViewCHARMSParticipantConsentPage.ageAppropriateAssentObtainedDropDown, Native_View_Constants.consentRecordYesNoQuestionDropdownOptions, "---- VERIFYING AGE-APPROPRIATE ASSENT OBTAINED DROPDOWN OPTIONS ----");
        CHARMS.steps.RAS_Common_Methods.softAssertDropDownValueIsSelected(nativeViewCHARMSParticipantConsentPage.ageAppropriateAssentObtainedDropDown, expectedDropDownValue, "----  \"Age-appropriate assent obtained?\" value mismatch ----");
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
        RAS_Common_Methods.softAssertDropDownValueIsSelected(nativeViewCHARMSParticipantConsentPage.rasStudyConsentStatusTextBox, "Complete", "---- Consent Status value mismatch ----");
        softAssert.assertEquals(nativeViewCHARMSParticipantConsentPage.rasStudyConsentDateTextBox.getAttribute("value"), CommonUtils.getTodayDate(), "---- Consent Date value mismatch ----");
        softAssert.assertEquals(locateByXpath("//input[@id='sys_display.x_naci_family_coho_fcsms_consent.consent_by']").getAttribute("value"), "CBIIT Test Account", "---- Signed By value mismatch ----");
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsConsentsPreviewButton);
        CommonUtils.waitForVisibility(nativeViewCHARMSDashboardPage.rasStudyOpenRecordButton);
        CommonUtils.sleep(500);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(nativeViewCHARMSDashboardPage.rasStudyOpenRecordButton);
    }
}