$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/ServiceNow/COVIDCode/Features/ServicePortalEQSubmission.feature");
formatter.feature({
  "name": "Service Portal Enrollment Questionnaire Submissions",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "COVIDcode Study Provider Enrollment Questionnaire Submission Group 1 User",
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
  "name": "a COVIDcode Study Provider user has logged in to the COVIDcode Study application",
  "keyword": "Given "
});
formatter.match({
  "location": "ServicePortalEQSubmissionsSteps.a_COVIDcode_Study_Provider_user_has_logged_in_to_the_COVIDcode_Study_application()"
});
formatter.write("2020-08-20 09:03:09: Screenshot: ");
formatter.embedding("image/png", "embedded0.png");
formatter.write("2020-08-20 09:03:09: Screenshot: ");
formatter.embedding("image/png", "embedded1.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the COVIDcode Study Provider fills out an Enrollment Questionnaire for a \"Group 1\" who says \"Yes\" to join the study",
  "keyword": "When "
});
formatter.match({
  "location": "ServicePortalEQSubmissionsSteps.the_COVIDcode_Study_Provider_fills_out_an_Enrollment_Questionnaire_for_a_who_says_to_join_the_study(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enters users full name, required information, and demographics information",
  "keyword": "And "
});
formatter.match({
  "location": "ServicePortalEQSubmissionsSteps.enters_users_full_name_required_information_and_demographics_information()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "does not enter Disease Course and Exposures and Risk Factors information",
  "keyword": "But "
});
formatter.match({
  "location": "ServicePortalEQSubmissionsSteps.does_not_enter_Disease_Course_and_Exposures_and_Risk_Factors_information()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Submits the enrollment questionnaire",
  "keyword": "And "
});
formatter.match({
  "location": "ServicePortalEQSubmissionsSteps.submits_the_enrollment_questionnaire()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the enrollment questionnaire should be successfully submitted",
  "keyword": "Then "
});
formatter.match({
  "location": "ServicePortalEQSubmissionsSteps.the_enrollment_questionnaire_should_be_successfully_submitted()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});