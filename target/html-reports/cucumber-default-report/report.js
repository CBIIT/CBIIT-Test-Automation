$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/ServiceNow/COVIDCode/Features/FollowUpForm.feature");
formatter.feature({
  "name": "COVIDCode Follow Up Form Scenarios",
  "description": "Description: This feature file contains scenarios related to the Follow Up Form",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "RunDefined Follow Up Form - Verifying added education question - Service Portal",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Sprint7"
    },
    {
      "name": "@COVID-95"
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
formatter.write("2020-08-19 15:48:35: Screenshot: ");
formatter.embedding("image/png", "embedded0.png");
formatter.write("2020-08-19 15:48:36: Screenshot: ");
formatter.embedding("image/png", "embedded1.png");
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
formatter.write("2020-08-19 15:48:47: Screenshot: ");
formatter.embedding("image/png", "embedded2.png");
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "RunPending scenario",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Sprint7"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "step one",
  "keyword": "Given "
});
formatter.match({
  "location": "FollowUpFormSteps.step_one()"
});
formatter.result({
  "error_message": "cucumber.api.PendingException: TODO: implement me\n\tat ServiceNow.COVIDCode.Steps.FollowUpFormSteps.step_one(FollowUpFormSteps.java:33)\n\tat ✽.step one(file:src/test/java/ServiceNow/COVIDCode/Features/FollowUpForm.feature:12)\n",
  "status": "pending"
});
formatter.step({
  "name": "step two",
  "keyword": "When "
});
formatter.match({
  "location": "FollowUpFormSteps.step_two()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "step three",
  "keyword": "Then "
});
formatter.match({
  "location": "FollowUpFormSteps.step_three()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});