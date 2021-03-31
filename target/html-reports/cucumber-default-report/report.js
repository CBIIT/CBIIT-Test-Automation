$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/AnalysisTools/CEDCD/Features/CEDCDQuestionnaire.feature");
formatter.feature({
  "name": "Questionnaire",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Cohort Owner logs in and selects cohort",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Progression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the CEDCD homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "CEDCDQuestionnaireSteps.the_user_is_on_the_CEDCD_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user is logged in as a Cohort Owner",
  "keyword": "When "
});
formatter.match({
  "location": "CEDCDQuestionnaireSteps.the_user_is_logged_in_as_a_Cohort_Owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the Cohort Owner selects their Cohort questionnaire",
  "keyword": "And "
});
formatter.match({
  "location": "CEDCDQuestionnaireSteps.the_Cohort_Owner_selects_their_Cohort_questionnaire()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Section A of the Questionnaire is filled out",
  "keyword": "Then "
});
formatter.match({
  "location": "CEDCDQuestionnaireSteps.section_A_of_the_Questionnaire_is_filled_out()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});