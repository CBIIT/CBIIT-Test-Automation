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
formatter.uri("file:src/test/java/ServiceNow/COVIDCode/Features/ServicePortalLogin.feature");
formatter.feature({
  "name": "COVIDcode Study Provider User Login Scenarios",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "a COVIDcode Study Provider user is on the COVIDcode study homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "COVIDCodeLoginSteps.a_COVIDcode_Study_Provider_user_is_on_the_COVIDcode_study_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "COVIDcode Study Provider Login when clicking \u0027Access and complete questionnaire\u0027 button and verifies expected header text",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "the COVIDcode Study Provider user logs in by clicking Access and complete questionnaire button",
  "keyword": "When "
});
formatter.match({
  "location": "COVIDCodeLoginSteps.the_COVIDcode_Study_Provider_user_logs_in_by_clicking_Access_and_complete_questionnaire_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the COVIDcode Study Provider user should see the COVIDcode Enrollment Questionnaire",
  "keyword": "Then "
});
formatter.match({
  "location": "COVIDCodeLoginSteps.the_COVIDcode_Study_Provider_user_should_see_the_COVIDcode_Enrollment_Questionnaire()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the Study Provider user sees the header text \"Please fill out each data element to the best of your abilities. If you do not know the answer to a question, select “Don’t know”,  do not leave it blank. Some fields are required and denoted by an asterisk. If you have any questions about completing this survey, please contact the study team at covidcode@mail.nih.gov or (240) 274-6777.\"",
  "keyword": "And "
});
formatter.match({
  "location": "COVIDCodeLoginSteps.the_COVIDcode_Study_Provider_user_sees_the_header_text(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the Study Provider also sees contact email and phone number as \"covidcode@mail.nih.gov or (240) 274-6777.\"",
  "keyword": "And "
});
formatter.match({
  "location": "COVIDCodeLoginSteps.the_COVIDcode_Study_Provider_also_sees_contact_email_and_phone_number_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "a COVIDcode Study Provider user is on the COVIDcode study homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "COVIDCodeLoginSteps.a_COVIDcode_Study_Provider_user_is_on_the_COVIDcode_study_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "COVIDcode Study Provider Login when clicking \u0027Log In\u0027 button and verifies expected header text",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "the COVIDcode Study Provider user logs in by clicking Log In button",
  "keyword": "When "
});
formatter.match({
  "location": "COVIDCodeLoginSteps.the_COVIDcode_Study_Provider_user_logs_in_by_clicking_Log_In_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the COVIDcode Study Provider user should see the COVIDcode Enrollment Questionnaire",
  "keyword": "Then "
});
formatter.match({
  "location": "COVIDCodeLoginSteps.the_COVIDcode_Study_Provider_user_should_see_the_COVIDcode_Enrollment_Questionnaire()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the Study Provider user sees the header text \"Please fill out each data element to the best of your abilities. If you do not know the answer to a question, select “Don’t know”,  do not leave it blank. Some fields are required and denoted by an asterisk. If you have any questions about completing this survey, please contact the study team at covidcode@mail.nih.gov or (240) 274-6777.\"",
  "keyword": "And "
});
formatter.match({
  "location": "COVIDCodeLoginSteps.the_COVIDcode_Study_Provider_user_sees_the_header_text(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the Study Provider also sees contact email and phone number as \"covidcode@mail.nih.gov or (240) 274-6777.\"",
  "keyword": "And "
});
formatter.match({
  "location": "COVIDCodeLoginSteps.the_COVIDcode_Study_Provider_also_sees_contact_email_and_phone_number_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});