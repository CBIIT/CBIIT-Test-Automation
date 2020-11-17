$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/AnalysisTools/PLCO/Features/PublicAPI.feature");
formatter.feature({
  "name": "Public API",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User querys cancer phenotype",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Progression"
    }
  ]
});
formatter.step({
  "name": "user sends GET request for cancer phenotype",
  "keyword": "Given "
});
formatter.match({
  "location": "PublicAPISteps.user_sends_GET_request_for_cancer_phenotype()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user receives response for cancer phenotype",
  "keyword": "Then "
});
formatter.match({
  "location": "PublicAPISteps.user_receives_response_for_cancer_phenotype()"
});
formatter.result({
  "status": "passed"
});
});