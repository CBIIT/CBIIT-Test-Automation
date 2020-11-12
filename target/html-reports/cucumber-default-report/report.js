$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/AnalysisTools/CEDCD/Features/CEDCD-MaleDiscrepancyOnSearchCohortPage.feature");
formatter.feature({
  "name": "Male Discrepancy on the Search Cohorts tab.",
  "description": "  This tests the discrepancies in the amount of eligible males returned on \"search cohorts\" tab.",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Eligible Male Cohorts returned on the Search Cohorts Tab",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SS-3429"
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
  "name": "the user is on the CEDCD homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "CEDCDSearchFemaleCohortsSteps.the_user_is_on_the_CEDCD_homepage()"
});
formatter.write("2020-11-12 17:11:33: Screenshot: ");
formatter.embedding("image/png", "embedded0.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on the CEDCD search cohorts tab",
  "keyword": "When "
});
formatter.match({
  "location": "CEDCDSearchFemaleCohortsSteps.the_user_clicks_on_the_CEDCD_search_cohorts_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user filters by males",
  "keyword": "And "
});
formatter.match({
  "location": "CEDCDMaleDiscrepancyOnSearchCohortsSteps.the_user_filters_by_males()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "44 results return for Male cohort Filter results",
  "keyword": "Then "
});
formatter.match({
  "location": "CEDCDMaleDiscrepancyOnSearchCohortsSteps.results_return_for_Male_cohort_Filter_results(int)"
});
formatter.write("2020-11-12 17:11:34: Screenshot: ");
formatter.embedding("image/png", "embedded1.png");
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/java/AnalysisTools/CEDCD/Features/CEDCDSearchCohortsPage.feature");
formatter.feature({
  "name": "Female Discrepancy",
  "description": "  This tests the discrepancies in the amount of eligible females returned on search cohorts tab.",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Eligible Female Cohorts returned on the Search Cohorts Tab",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SS-3428"
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
  "name": "the user is on the CEDCD homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "CEDCDSearchFemaleCohortsSteps.the_user_is_on_the_CEDCD_homepage()"
});
formatter.write("2020-11-12 17:11:43: Screenshot: ");
formatter.embedding("image/png", "embedded2.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on the CEDCD search cohorts tab",
  "keyword": "When "
});
formatter.match({
  "location": "CEDCDSearchFemaleCohortsSteps.the_user_clicks_on_the_CEDCD_search_cohorts_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user filters by females",
  "keyword": "And "
});
formatter.match({
  "location": "CEDCDSearchFemaleCohortsSteps.the_user_filters_by_females()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "53 results return for Female Cohort Filter Result",
  "keyword": "Then "
});
formatter.match({
  "location": "CEDCDSearchFemaleCohortsSteps.results_return_for_Female_Cohort_Filter_Result(int)"
});
formatter.write("2020-11-12 17:11:44: Screenshot: ");
formatter.embedding("image/png", "embedded3.png");
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});