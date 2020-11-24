$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/AnalysisTools/CEDCD/Features/CEDCD-SearchCohortsTab.feature");
formatter.feature({
  "name": "Test Cases on the Search Cohorts Tab",
  "description": "Description: This is an automated suite for test cases under the Search Cohorts Tab",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Categories of Data Collected sorted Alphabetically",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SS-3438"
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
  "location": "CEDCDSearchFemaleCohortsSteps.the_user_is_on_the_CEDCD_Search_Cohorts_Tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on the Categories of Data Collected drop down",
  "keyword": "When "
});
formatter.match({
  "location": "CEDCDSearchCohortsCategoriesofDataSorted.the_user_clicks_on_the_Categories_of_Data_Collected_drop_down()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "all selections are sorted alphabetically",
  "keyword": "Then "
});
formatter.match({
  "location": "CEDCDSearchCohortsCategoriesofDataSorted.all_selections_are_sorted_alphabetically()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});