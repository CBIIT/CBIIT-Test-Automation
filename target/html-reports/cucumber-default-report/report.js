$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/AnalysisTools/CEDCD/Features/CEDCD-BiospecimenCountsTab.feature");
formatter.feature({
  "name": "Test Cases on the Biospecimen Count Tab",
  "description": "Description: This is an automated suite for test cases under the Biospecimen Tab",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Select Type Sorted Alphabetically",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SS-3439"
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
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on the Biospecimen Counts tab",
  "keyword": "When "
});
formatter.match({
  "location": "CEDCDBiospecimenCountsSelectAllCohortsSteps.the_user_clicks_on_the_Biospecimen_Counts_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on the Specimen Types drop down",
  "keyword": "And "
});
formatter.match({
  "location": "CEDCDBiospecimenCountsSelectTypesAlphabeticallySteps.the_user_clicks_on_the_Specimen_Types_drop_down()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the alphabetized Specimen Types are displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "CEDCDBiospecimenCountsSelectTypesAlphabeticallySteps.the_alphabetized_Specimen_Types_are_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});