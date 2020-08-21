$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/ServiceNow/COVIDCode/Features/FollowUpForm.feature");
formatter.feature({
  "name": "COVIDCode Follow Up Form Scenarios",
  "description": "Description: This feature file contains scenarios related to the Follow Up Form",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Follow Up Form - Verifying Group ID and Hospital Code fields are locked - Service Portal",
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
  "name": "a COVIDCode Provider is on the Follow Up Form to update an existing enrollment",
  "keyword": "Given "
});
formatter.match({
  "location": "FollowUpFormSteps.a_COVIDCode_Provider_is_on_the_Follow_Up_Form_to_update_an_existing_enrollment()"
});
formatter.write("2020-08-21 14:00:48: Screenshot: ");
formatter.embedding("image/png", "embedded0.png");
formatter.write("2020-08-21 14:00:49: Screenshot: ");
formatter.embedding("image/png", "embedded1.png");
formatter.write("2020-08-21 14:00:57: Screenshot: ");
formatter.embedding("image/png", "embedded2.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an enrollment is selected",
  "keyword": "When "
});
formatter.match({
  "location": "FollowUpFormSteps.an_enrollment_is_selected()"
});
formatter.write("2020-08-21 14:01:02: Screenshot: ");
formatter.embedding("image/png", "embedded3.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the Group ID and Hospital Code fields should be locked",
  "keyword": "Then "
});
formatter.match({
  "location": "FollowUpFormSteps.the_Group_ID_and_Hospital_Code_fields_should_be_locked()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});