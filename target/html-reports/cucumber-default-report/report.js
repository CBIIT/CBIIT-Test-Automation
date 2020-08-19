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
  "status": "skipped"
});
formatter.step({
  "name": "a COVIDCode user accesses a Follow Up Form to update an existing enrollment",
  "keyword": "When "
});
formatter.match({
  "location": "FollowUpFormSteps.a_COVIDCode_user_accesses_a_Follow_Up_Form_to_update_an_existing_enrollment()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the question \"What is the highest level of school that you/the patient completed?\" should display in the demographics section",
  "keyword": "Then "
});
formatter.match({
  "location": "FollowUpFormSteps.the_question_should_display_in_the_demographics_section(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
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
  "status": "skipped"
});
formatter.step({
  "name": "step one",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "step two",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "step three",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "skipped"
});
});