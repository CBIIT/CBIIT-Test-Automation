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
  "status": "skipped"
});
formatter.step({
  "name": "the user is on the CEDCD homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "CEDCDSearchFemaleCohortsSteps.the_user_is_on_the_CEDCD_homepage()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user clicks on the Biospecimen Counts tab",
  "keyword": "When "
});
formatter.match({
  "location": "CEDCDBiospecimenCountsSelectAllCohortsSteps.the_user_clicks_on_the_Biospecimen_Counts_tab()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user selects All Types from the Specimen Type drop down",
  "keyword": "And "
});
formatter.match({
  "location": "CEDCDBiospecimenCountClearAll.the_user_selects_All_Types_from_the_Specimen_Type_drop_down()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user selects All Cancers from the Cancer Type drop down",
  "keyword": "And "
});
formatter.match({
  "location": "CEDCDBiospecimenCountClearAll.the_user_selects_All_Cancers_from_the_Cancer_Type_drop_down()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user selects All Cohorts from the Cohorts drop down",
  "keyword": "And "
});
formatter.match({
  "location": "CEDCDBiospecimenCountClearAll.the_user_selects_All_Cohorts_from_the_Cohorts_drop_down()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user searches results",
  "keyword": "And "
});
formatter.match({
  "location": "CEDCDBiospecimenCountClearAll.the_user_searches_results()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user clicks on the Clear All button",
  "keyword": "When "
});
formatter.match({
  "location": "CEDCDBiospecimenCountClearAll.the_user_clicks_on_the_Clear_All_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "all previously selected fields are no longer selected",
  "keyword": "Then "
});
formatter.match({
  "location": "CEDCDBiospecimenCountClearAll.all_previously_selected_fields_are_no_longer_selected()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
formatter.uri("file:src/test/java/AnalysisTools/CEDCD/Features/CEDCD-BiospecimenCounts-SelectAllCheckbox.feature");
formatter.feature({
  "name": "Selecting All Cohorts on Biospecimen Tab",
  "description": "Description: This Scenario verifies the following ticket:\n\nselect \u0027Biospecimen Counts\u0027 tab -\u003e \u0027Specimen Type\u0027 button -\u003e \u0027All Types\u0027 check box. none of the options below will be selected. This issue might be the reason why submit button does not work in this filter setting",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Selecting all Cohorts from the Biospecimen Tab",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SS-3436"
    },
    {
      "name": "@Progression"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "the user is on the CEDCD homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "CEDCDSearchFemaleCohortsSteps.the_user_is_on_the_CEDCD_homepage()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user clicks on the Biospecimen Counts tab",
  "keyword": "When "
});
formatter.match({
  "location": "CEDCDBiospecimenCountsSelectAllCohortsSteps.the_user_clicks_on_the_Biospecimen_Counts_tab()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user clicks on the Specimen Type drop down",
  "keyword": "And "
});
formatter.match({
  "location": "CEDCDBiospecimenCountsSelectAllCohortsSteps.the_user_clicks_on_the_Specimen_Type_drop_down()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user clicks on the All Types check box",
  "keyword": "And "
});
formatter.match({
  "location": "CEDCDBiospecimenCountsSelectAllCohortsSteps.the_user_clicks_on_the_All_Types_check_box()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "all Specimen tabs are selected",
  "keyword": "Then "
});
formatter.match({
  "location": "CEDCDBiospecimenCountsSelectAllCohortsSteps.all_Specimen_tabs_are_selected()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
formatter.uri("file:src/test/java/AnalysisTools/CEDCD/Features/CEDCD-MaleDiscrepancyOnSearchCohortPage.feature");
formatter.feature({
  "name": "Male Discrepancy on the Search Cohorts Tab.",
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
  "status": "skipped"
});
formatter.step({
  "name": "the user is on the CEDCD homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "CEDCDSearchFemaleCohortsSteps.the_user_is_on_the_CEDCD_homepage()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user clicks on the CEDCD search cohorts tab",
  "keyword": "When "
});
formatter.match({
  "location": "CEDCDSearchFemaleCohortsSteps.the_user_clicks_on_the_CEDCD_search_cohorts_tab()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user filters by males",
  "keyword": "And "
});
formatter.match({
  "location": "CEDCDMaleDiscrepancyOnSearchCohortsSteps.the_user_filters_by_males()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "44 results return for Male cohort Filter results",
  "keyword": "Then "
});
formatter.match({
  "location": "CEDCDMaleDiscrepancyOnSearchCohortsSteps.results_return_for_Male_cohort_Filter_results(int)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
formatter.uri("file:src/test/java/AnalysisTools/CEDCD/Features/CEDCD-SearchCohorts-AlcoholConsumption.feature");
formatter.feature({
  "name": "Alcohol Consumption",
  "description": "Description: when search cohorts using \u0027Alcohol consumption\u0027 filter, old nci shows 58 entries, while new nci shows 46 entries",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Filtering Cohorts by Alcohol Consumption",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Progression"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "the user is on the CEDCD Search Cohorts Tab",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the user searches cohorts through Alcohol Consumption filter",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the user see 46 studies returned",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "skipped"
});
formatter.uri("file:src/test/java/AnalysisTools/CEDCD/Features/CEDCD-SearchCohorts-SelectAllCohorts.feature");
formatter.feature({
  "name": "Selecting All on the Cohort Studies Tab",
  "description": "\tThis test case is to ensure the \"select all\" button on the search cohorts tab will select all returned studies.",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Select All Cohorts",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Progression"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "the user is on the CEDCD homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "CEDCDSearchFemaleCohortsSteps.the_user_is_on_the_CEDCD_homepage()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user clicks on the CEDCD search cohorts tab",
  "keyword": "When "
});
formatter.match({
  "location": "CEDCDSearchFemaleCohortsSteps.the_user_clicks_on_the_CEDCD_search_cohorts_tab()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user clicks on the select all check box",
  "keyword": "And "
});
formatter.match({
  "location": "CEDCDSelectAllCohortsSteps.the_user_clicks_on_the_select_all_check_box()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "all studies are selected",
  "keyword": "Then "
});
formatter.match({
  "location": "CEDCDSelectAllCohortsSteps.all_studies_are_selected()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
formatter.uri("file:src/test/java/AnalysisTools/CEDCD/Features/CEDCDSearchCohortsPage.feature");
formatter.feature({
  "name": "Female Discrepancy on the Search Cohorts Tab",
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
  "status": "skipped"
});
formatter.step({
  "name": "the user is on the CEDCD homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "CEDCDSearchFemaleCohortsSteps.the_user_is_on_the_CEDCD_homepage()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user clicks on the CEDCD search cohorts tab",
  "keyword": "When "
});
formatter.match({
  "location": "CEDCDSearchFemaleCohortsSteps.the_user_clicks_on_the_CEDCD_search_cohorts_tab()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user filters by females",
  "keyword": "And "
});
formatter.match({
  "location": "CEDCDSearchFemaleCohortsSteps.the_user_filters_by_females()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "53 results return for Female Cohort Filter Result",
  "keyword": "Then "
});
formatter.match({
  "location": "CEDCDSearchFemaleCohortsSteps.results_return_for_Female_Cohort_Filter_Result(int)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
});