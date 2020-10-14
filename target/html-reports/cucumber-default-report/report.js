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
      "name": "@Progression"
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
formatter.write("2020-10-14 16:47:56: Screenshot: ");
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
formatter.write("2020-10-14 16:48:00: Screenshot: ");
formatter.embedding("image/png", "embedded1.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the Proband is directed to the Clinical Genetics Branch page",
  "keyword": "Then "
});
formatter.match({
  "location": "ProbandLoginSteps.the_Proband_is_directed_to_the_Clinical_Genetics_Branch_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});