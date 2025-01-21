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

    @Then("data submitted via the Fanconi Eligibility Questionnaire is verified in Participant Details page for all scenarios")
    public void data_submitted_via_the_Fanconi_Eligibility_Questionnaire_is_verified_in_Participant_Details_page_for_all_scenarios() {
        fanconiEligibilityQuestionnaireStepsImpl.allScenariosParticipantDetailPageAssertion();
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

    @Then("data submitted via the Fanconi Eligibility Questionnaire is verified in Fanconi Study Screener page for all scenarios")
    public void data_submitted_via_the_Fanconi_Eligibility_Questionnaire_is_verified_in_Fanconi_Study_Screener_page_for_all_scenarios() {
        for (int i = 0; i <= 0; i++) {
            fanconiEligibilityQuestionnaireStepsImpl.fanconiStudyPageAssertions(i);
        }
    }

    @Then("data submitted via the Fanconi Eligibility Questionnaire is verified in Fanconi Screener page for all scenarios")
    public void data_submitted_via_the_Fanconi_Eligibility_Questionnaire_is_verified_in_Fanconi_Screener_page_for_all_scenarios() {
        for (int i = 0; i <= 0; i++) {
            fanconiEligibilityQuestionnaireStepsImpl.fanconiScreenerPageAssertions(i);
        }
    }

    @Then("data submitted via the Fanconi Eligibility Questionnaire is verified in Fanconi Study Screener page for each scenario")
    public void data_submitted_via_the_Fanconi_Eligibility_Questionnaire_is_verified_in_Fanconi_Study_Screener_page_for_each_scenario() {
        int rowcount = 0;
        fanconiEligibilityQuestionnaireStepsImpl.fanconiStudyPreviewRecordClicked(rowcount);
        fanconiEligibilityQuestionnaireStepsImpl.fanconiStudyPageAssertions(rowcount);
        fanconiScreenerNVPage.nVFScreenerBackButton.click();
    }

    @Then("data submitted is verified in Fanconi Study page")
    public void data_submitted_is_verified_in_fanconi_study_page() {
        fanconiEligibilityQuestionnaireStepsImpl.fanconiStudyCompleteAssertion(0);
    }

    @Then("consent in Fanconi is verified")
    public void consent_in_Fanconi_is_verified() {
        int rowcount = 1;
        fanconiEligibilityQuestionnaireStepsImpl.participantDetailRecordClicked(rowcount);
        fanconiEligibilityQuestionnaireStepsImpl.fanconiConsentAssertionOnFanconiStudyPage(rowcount);
    }
}