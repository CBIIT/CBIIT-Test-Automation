$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/AnalysisTools/CEDCD/Features/CEDCD-BiospecimenCount-ClearAllButton.feature");
formatter.feature({
  "name": "The \"Clear All\" button on the Biospecimen Counts Tab works how intended",
  "description": "Description:",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "The Clear All button clears all the selection on the Biospecimen Counts Tab",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SS-3453"
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
  "name": "the user selects All Types from the Specimen Type drop down",
  "keyword": "And "
});
formatter.match({
  "location": "CEDCDBiospecimenCountClearAll.the_user_selects_All_Types_from_the_Specimen_Type_drop_down()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user selects All Cancers from the Cancer Type drop down",
  "keyword": "And "
});
formatter.match({
  "location": "CEDCDBiospecimenCountClearAll.the_user_selects_All_Cancers_from_the_Cancer_Type_drop_down()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user selects All Cohorts from the Cohorts drop down",
  "keyword": "And "
});
formatter.match({
  "location": "CEDCDBiospecimenCountClearAll.the_user_selects_All_Cohorts_from_the_Cohorts_drop_down()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user searches results",
  "keyword": "And "
});
formatter.match({
  "location": "CEDCDBiospecimenCountClearAll.the_user_searches_results()"
});
formatter.write("2020-11-16 14:37:42: Screenshot: ");
formatter.embedding("image/png", "embedded0.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on the Clear All button",
  "keyword": "When "
});
formatter.match({
  "location": "CEDCDBiospecimenCountClearAll.the_user_clicks_on_the_Clear_All_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "all previously selected fields are no longer selected",
  "keyword": "Then "
});
formatter.match({
  "location": "CEDCDBiospecimenCountClearAll.all_previously_selected_fields_are_no_longer_selected()"
});
formatter.write("2020-11-16 14:37:43: Screenshot: ");
formatter.embedding("image/png", "embedded1.png");
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});