$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/ServiceNow/CHARMS/Features/ProbandScenarios.feature");
formatter.feature({
  "name": "Proband Scenarios",
  "description": "Description: This feature file contains Proband related scenarios",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Proband LFS Okta Login",
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
  "name": "a Proband is on the CHARMS home page",
  "keyword": "Given "
});
formatter.match({
  "location": "ProbandLoginSteps.a_Proband_is_on_the_CHARMS_home_page()"
});
formatter.write("2020-10-15 14:35:48: Screenshot: ");
formatter.embedding("image/png", "embedded0.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the Proband logs in with existing valid credentials",
  "keyword": "When "
});
formatter.match({
  "location": "ProbandLoginSteps.the_Proband_logs_in_with_existing_valid_credentials()"
});
formatter.write("2020-10-15 14:35:51: Screenshot: ");
formatter.embedding("image/png", "embedded1.png");
formatter.write("2020-10-15 14:35:54: Screenshot: ");
formatter.embedding("image/png", "embedded2.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the \"Clinical Genetics Branch\" page displays",
  "keyword": "Then "
});
formatter.match({
  "location": "ProbandLoginSteps.the_page_displays(String)"
});
formatter.write("2020-10-15 14:35:57: Screenshot: ");
formatter.embedding("image/png", "embedded3.png");
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});