$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/ServiceNow/COVIDDash/Features/Covid19Dashboard.feature");
formatter.feature({
  "name": "COVID19 Dashboard Scenarios",
  "description": "  Description: This feature file tests COVIDDASH-7, 8, 20, 134, 135, 138, 136, 137, 140, 142, 143, 148",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verifying Study Form Submission as a Reviewer",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@progression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "a User has logged in to the NIH COVID-19 Biorepository Dashboard Application",
  "keyword": "Given "
});
formatter.match({
  "location": "COVIDHomePageSteps.a_User_has_logged_in_to_the_NIH_COVID_Biorepository_Dashboard_Application(Integer)"
});
formatter.write("2020-09-21 15:10:29: INFO: Environment: Test (https://service-test.nci.nih.gov/nih-covid-19-dashboard?xpage\u003dlanding_pub)");
formatter.write("2020-09-21 15:10:29: Screenshot: ");
formatter.embedding("image/png", "embedded0.png");
formatter.write("2020-09-21 15:10:37: Screenshot: ");
formatter.embedding("image/png", "embedded1.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "successfully submits a Study Form",
  "keyword": "And "
});
formatter.match({
  "location": "COVIDHomePageSteps.successfully_submits_a_Study_Form()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "impersonating a reviewer",
  "keyword": "When "
});
formatter.match({
  "location": "COVIDHomePageSteps.impersonating_a_reviewer()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the submitted study is displayed and options to Approve or Reject are available",
  "keyword": "Then "
});
formatter.match({
  "location": "SubmissionsPageSteps.the_submitted_study_is_displayed_and_options_to_Approve_or_Reject_are_available()"
});
formatter.write("2020-09-21 15:11:10: Screenshot: ");
formatter.embedding("image/png", "embedded2.png");
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});