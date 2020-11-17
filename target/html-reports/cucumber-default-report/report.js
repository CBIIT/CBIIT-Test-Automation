$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/AnalysisTools/CEDCD/Features/CEDCD-SearchCohorts-AlcoholConsumption.feature");
formatter.feature({
  "name": "Alcohol Consumption",
  "description": "Description: when search cohorts using \"Alcohol consumption\" filter, old nci shows 58 entries, while new nci shows 58 entries",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Filtering Cohorts by Alcohol Consumption",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SS-3437"
    },
    {
      "name": "@Progression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the CEDCD Search Cohorts Tab",
  "keyword": "Given "
});
formatter.match({
  "location": "CEDCDSearchCohortAlcoholConsumptionSteps.the_user_is_on_the_CEDCD_Search_Cohorts_Tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user searches cohorts through Alcohol Consumption filter",
  "keyword": "When "
});
formatter.match({
  "location": "CEDCDSearchCohortAlcoholConsumptionSteps.the_user_searches_cohorts_through_Alcohol_Consumption_filter()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user sees 58 studies returned",
  "keyword": "Then "
});
formatter.match({
  "location": "CEDCDSearchCohortAlcoholConsumptionSteps.the_user_sees_studies_returned(int)"
});
formatter.write("2020-11-17 10:28:13: Screenshot: ");
formatter.embedding("image/png", "embedded0.png");
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});