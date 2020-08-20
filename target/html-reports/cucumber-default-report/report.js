$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/ServiceNow/COVIDCode/Features/FollowUpForm.feature");
formatter.feature({
  "name": "COVIDCode Follow Up Form Scenarios",
  "description": "Description: This feature file contains scenarios related to the Follow Up Form",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Follow Up Form - Verifying added education question - Service Portal",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Sprint7"
    },
    {
      "name": "@COVID-95"
    },
    {
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "a COVIDCode user accesses a Follow Up Form to update an existing enrollment",
  "keyword": "When "
});
formatter.match({
  "location": "FollowUpFormSteps.a_COVIDCode_user_accesses_a_Follow_Up_Form_to_update_an_existing_enrollment()"
});
formatter.write("2020-08-20 13:40:07: Screenshot: ");
formatter.embedding("image/png", "embedded0.png");
formatter.write("2020-08-20 13:40:08: Screenshot: ");
formatter.embedding("image/png", "embedded1.png");
formatter.write("2020-08-20 13:40:15: Screenshot: ");
formatter.embedding("image/png", "embedded2.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the question \"What is the highest level of school that you/the patient completed?\" should display in the demographics section",
  "keyword": "Then "
});
formatter.match({
  "location": "FollowUpFormSteps.the_question_should_display_in_the_demographics_section(String)"
});
formatter.write("2020-08-20 13:40:16: Screenshot: ");
formatter.embedding("image/png", "embedded3.png");
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Follow Up Form - Search Function - Service Portal",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Sprint7"
    },
    {
      "name": "@COVID-209"
    },
    {
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "a COVIDCode user is on the Follow Up Form to update an existing enrollment",
  "keyword": "Given "
});
formatter.match({
  "location": "FollowUpFormSteps.a_COVIDCode_user_is_on_the_Follow_Up_Form_to_update_an_existing_enrollment()"
});
formatter.write("2020-08-20 13:40:29: Screenshot: ");
formatter.embedding("image/png", "embedded4.png");
formatter.write("2020-08-20 13:40:29: Screenshot: ");
formatter.embedding("image/png", "embedded5.png");
formatter.write("2020-08-20 13:40:37: Screenshot: ");
formatter.embedding("image/png", "embedded6.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user is able to search an existing enrollment by patient ID, last name, first name, or NIH Medical Record Number",
  "keyword": "Then "
});
formatter.match({
  "location": "FollowUpFormSteps.the_user_is_able_to_search_an_existing_enrollment_by_patient_ID_last_name_first_name_or_NIH_Medical_Record_Number()"
});
formatter.write("2020-08-20 13:40:42: Screenshot: ");
formatter.embedding("image/png", "embedded7.png");
formatter.write("2020-08-20 13:40:45: Screenshot: ");
formatter.embedding("image/png", "embedded8.png");
formatter.write("2020-08-20 13:40:49: Screenshot: ");
formatter.embedding("image/png", "embedded9.png");
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});