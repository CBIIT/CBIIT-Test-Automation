package CHARMS.steps;

import APPS_COMMON.PageInitializers.PageInitializer;
import APPS_COMMON.Utils.ServiceNow_Login_Methods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class FanconiEligibilityQuestionnaireSteps extends PageInitializer {

    @Given("run the Fanconi reset script to reset the accounts")
    public void run_Fanconi_reset_script_to_reset_the_accounts() {
        fanconiEligibilityQuestionnaireStepsImpl.runResetScripts();
    }

    @Given("All scenarios are submitted")
    public void all_scenarios_are_submitted() {
        fanconiEligibilityQuestionnaireStepsImpl.fanconiEligibilityAllScenariosQuestionnaireSubmission();
    }

    @Then("fills the Fanconi Eligibility Questionnaire form for scenario1")
    public void fills_the_Fanconi_Eligibility_Questionnaire_form_for_scenario1() {
        fanconiEligibilityQuestionnaireStepsImpl.fanconiEligibilityQuestionnaireSubmissionScenario(0);
    }

    @Then("fills the Fanconi Eligibility Questionnaire form for scenario2")
    public void fills_the_fanconi_eligibility_questionnaire_form_for_scenario2() {
        fanconiEligibilityQuestionnaireStepsImpl.fanconiEligibilityQuestionnaireSubmissionScenario(1);
    }

    @Then("fills the Fanconi Eligibility Questionnaire form for scenario3")
    public void fills_the_fanconi_eligibility_questionnaire_form_for_scenario3() {
        fanconiEligibilityQuestionnaireStepsImpl.fanconiEligibilityQuestionnaireSubmissionScenario(2);
    }

    @Then("fills the Fanconi Eligibility Questionnaire form for scenario4")
    public void fills_the_fanconi_eligibility_questionnaire_form_for_scenario4() {
        fanconiEligibilityQuestionnaireStepsImpl.fanconiEligibilityQuestionnaireSubmissionScenario(3);
    }

    @Then("fills the Fanconi Eligibility Questionnaire form for scenario5")
    public void fills_the_fanconi_eligibility_questionnaire_form_for_scenario5() {
        fanconiEligibilityQuestionnaireStepsImpl.fanconiEligibilityQuestionnaireSubmissionScenario(4);
    }

    @Then("fills the Fanconi Eligibility Questionnaire form for scenario6")
    public void fills_the_fanconi_eligibility_questionnaire_form_for_scenario6() {
        fanconiEligibilityQuestionnaireStepsImpl.fanconiEligibilityQuestionnaireSubmissionScenario(5);
    }

    @Then("fills the Fanconi Eligibility Questionnaire form for scenario7")
    public void fills_the_fanconi_eligibility_questionnaire_form_for_scenario7() {
        fanconiEligibilityQuestionnaireStepsImpl.fanconiEligibilityQuestionnaireSubmissionScenario(6);
    }

    @Then("fills the Fanconi Eligibility Questionnaire form for scenario8")
    public void fills_the_fanconi_eligibility_questionnaire_form_for_scenario8() {
        fanconiEligibilityQuestionnaireStepsImpl.fanconiEligibilityQuestionnaireSubmissionScenario(7);
    }

    @Then("fills the Fanconi Eligibility Questionnaire form for scenario9")
    public void fills_the_fanconi_eligibility_questionnaire_form_for_scenario9() {
        fanconiEligibilityQuestionnaireStepsImpl.fanconiEligibilityQuestionnaireSubmissionScenario(8);
    }

    @Then("fills the Fanconi Eligibility Questionnaire form for scenario10")
    public void fills_the_fanconi_eligibility_questionnaire_form_for_scenario10() {
        fanconiEligibilityQuestionnaireStepsImpl.fanconiEligibilityQuestionnaireSubmissionScenario(9);
    }

    @Then("clicks the submit button")
    public void clicks_the_submit_button() {
        fanconiEligibilityQuestionnaireStepsImpl.clickSubmitButton();
    }

    @Given("the study nurse log in Native View")
    public void the_study_nurse_log_in_Native_View() {
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        fanconiEligibilityQuestionnaireStepsImpl.navigateToParticipantDetailsPageInNativeView();
    }

    @Then("data submitted via the Fanconi Eligibility Questionnaire is verified in Participant Details page {string}")
    public void data_submitted_via_the_Fanconi_Eligibility_Questionnaire_is_verified_in_Participant_Details_page(String fanconiScenario) {
        int i = Integer.parseInt(fanconiScenario);
        fanconiEligibilityQuestionnaireStepsImpl.participantDetailPageAssertion(i);
    }

    @Then("data submitted via the Fanconi Eligibility Questionnaire is verified in Participant Details page for each scenario")
    public void data_submitted_via_the_Fanconi_Eligibility_Questionnaire_is_verified_in_Participant_Details_page_for_each_scenario() {
        int rowcount = 0;
        fanconiEligibilityQuestionnaireStepsImpl.participantDetailPageAssertion(rowcount);
    }

    @Given("the study nurse log in Native View and go to Study Screener page")
    public void the_study_nurse_log_in_native_view_and_go_to_study_screener_page() {
        fanconiEligibilityQuestionnaireStepsImpl.loginToNativeView();
        fanconiEligibilityQuestionnaireStepsImpl.loginToFanconiStudyPageInNativeView();
    }

    @Then("data submitted via the Fanconi Eligibility Questionnaire is verified in Fanconi Study Screener page {string}")
    public void data_submitted_via_the_Fanconi_Eligibility_Questionnaire_is_verified_in_Fanconi_Study_Screener_page(String fanconiScenario) {
        int i = Integer.parseInt(fanconiScenario);
        fanconiEligibilityQuestionnaireStepsImpl.fanconiStudyPageAssertions(i);
    }

    @Then("data submitted via the Fanconi Eligibility Questionnaire is verified in Fanconi Screener page {string}")
    public void data_submitted_via_the_Fanconi_Eligibility_Questionnaire_is_verified_in_Fanconi_Screener_page(String fanconiScenario) {
        int i = Integer.parseInt(fanconiScenario);
        fanconiEligibilityQuestionnaireStepsImpl.fanconiScreenerPageAssertions(i);
    }

    @Then("data submitted via the Fanconi Eligibility Questionnaire is verified in Fanconi Study Screener page for each scenario")
    public void data_submitted_via_the_Fanconi_Eligibility_Questionnaire_is_verified_in_Fanconi_Study_Screener_page_for_each_scenario() {
        int rowcount = 0;
        fanconiEligibilityQuestionnaireStepsImpl.fanconiStudyPreviewRecordClicked(rowcount);
        fanconiEligibilityQuestionnaireStepsImpl.fanconiStudyPageAssertions(rowcount);
        fanconiScreenerNVPage.nVFScreenerBackButton.click();
    }

    @Then("consent in Fanconi is verified")
    public void consent_in_Fanconi_is_verified() {
        int rowcount = 1;
        fanconiEligibilityQuestionnaireStepsImpl.participantDetailRecordClicked(rowcount);
        fanconiEligibilityQuestionnaireStepsImpl.fanconiConsentAssertionOnFanconiStudyPage(rowcount);
    }

    @Given("consent is submitted with collection method {string} on sheet {int}")
    public void consent_is_submitted_with_collection_method_on_sheet(String collectionMethod, int rowCount) {
        fanconiEligibilityQuestionnaireStepsImpl.consent_is_submitted_with_collection_method(collectionMethod, rowCount );
    }

    @Given("consent is submitted with collection method {string}")
    public void consent_is_submitted_with_collection_method(String collectionMethod) {
        fanconiEligibilityQuestionnaireStepsImpl.consent_is_submitted_with_collection_method(collectionMethod);
    }

    @Then("Study Team member logs in to Native View and verifies fields in participant's CGB IIQ record")
    public void study_team_member_logs_in_to_native_view_and_verifies_fields_in_participant_s_cgb_iiq_record() {
        fanconiEligibilityQuestionnaireStepsImpl.study_team_navigate_to_participant_s_cgb_iiq_record();
    }
}