$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/ServiceNow/COVIDCode/Features/NativeViewScenarios.feature");
formatter.feature({
  "name": "COVIDcode Study nurse with an Admin role submits Enrollment Questionnaire Submission",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.scenario({
  "name": "COVIDcode Study nurse with an Admin role is able to submit an Enrollment Questionnaire in Native View",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "a COVIDcode Study nurse with an Admin role has logged in to the COVIDcode Study Native View application",
  "keyword": "Given "
});
formatter.match({
  "location": "NativeViewEQSubmissionSteps.a_COVIDcode_Study_nurse_with_an_Admin_role_has_logged_in_to_the_COVIDcode_Study_Native_View_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "is on the COVIDcode Enrollments page",
  "keyword": "And "
});
formatter.match({
  "location": "NativeViewEQSubmissionSteps.is_on_the_COVIDcode_Enrollments_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the COVIDcode Study nurse begins an Enrollment Questionnaire for a \"Group 1\" user who consents \"Yes\" to join the study",
  "keyword": "When "
});
formatter.match({
  "location": "NativeViewEQSubmissionSteps.the_COVIDcode_Study_nurse_begins_an_Enrollment_Questionnaire_for_a_user_who_consents_to_join_the_study(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "fills out the Enrollment Questionnaire by entering all required information including Demographics, Symptomology, and Exposures and Risk Factors",
  "keyword": "And "
});
formatter.match({
  "location": "NativeViewEQSubmissionSteps.fills_out_the_Enrollment_Questionnaire_by_entering_all_required_information_including_Demographics_Symptomology_and_Exposures_and_Risk_Factors()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "submits the Enrollment Questionnaire",
  "keyword": "And "
});
formatter.match({
  "location": "NativeViewEQSubmissionSteps.submits_the_Enrollment_Questionnaire()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the Enrollment Questionnaire should be successfully submitted",
  "keyword": "Then "
});
formatter.match({
  "location": "NativeViewEQSubmissionSteps.the_Enrollment_Questionnaire_should_be_successfully_submitted()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});