$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/AnalysisTools/CEDCD/Features/CEDCD-BiospecimenCountsTab.feature");
formatter.feature({
  "name": "Test Cases on the Biospecimen Count Tab",
  "description": "Description: This is an automated suite for test cases under the Biospecimen Tab",
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
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the CEDCD Biospecimen Tab",
  "keyword": "Given "
});
formatter.match({
  "location": "CEDCDBiospecimenCountsSelectAllCohortsSteps.the_user_is_on_the_CEDCD_Biospecimen_Tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user selects All Types from the Specimen Type drop down",
  "keyword": "And "
});
formatter.match({
  "location": "CEDCDBiospecimenCountClearAllSteps.the_user_selects_All_Types_from_the_Specimen_Type_drop_down()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user selects All Cancers from the Cancer Type drop down",
  "keyword": "And "
});
formatter.match({
  "location": "CEDCDBiospecimenCountClearAllSteps.the_user_selects_All_Cancers_from_the_Cancer_Type_drop_down()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user selects All Cohorts from the Cohorts drop down",
  "keyword": "And "
});
formatter.match({
  "location": "CEDCDBiospecimenCountClearAllSteps.the_user_selects_All_Cohorts_from_the_Cohorts_drop_down()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user searches results",
  "keyword": "And "
});
formatter.match({
  "location": "CEDCDBiospecimenCountClearAllSteps.the_user_searches_results()"
});
formatter.write("2020-12-09 14:40:07: Screenshot: ");
formatter.embedding("image/png", "embedded0.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on the Clear All button",
  "keyword": "When "
});
formatter.match({
  "location": "CEDCDBiospecimenCountClearAllSteps.the_user_clicks_on_the_Clear_All_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "all previously selected fields are no longer selected",
  "keyword": "Then "
});
formatter.match({
  "location": "CEDCDBiospecimenCountClearAllSteps.all_previously_selected_fields_are_no_longer_selected()"
});
formatter.write("2020-12-09 14:40:08: Screenshot: ");
formatter.embedding("image/png", "embedded1.png");
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
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
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the CEDCD Biospecimen Tab",
  "keyword": "Given "
});
formatter.match({
  "location": "CEDCDBiospecimenCountsSelectAllCohortsSteps.the_user_is_on_the_CEDCD_Biospecimen_Tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on the Specimen Type drop down",
  "keyword": "And "
});
formatter.match({
  "location": "CEDCDBiospecimenCountsSelectAllCohortsSteps.the_user_clicks_on_the_Specimen_Type_drop_down()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on the All Types check box",
  "keyword": "And "
});
formatter.match({
  "location": "CEDCDBiospecimenCountsSelectAllCohortsSteps.the_user_clicks_on_the_All_Types_check_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "all Specimen tabs are selected",
  "keyword": "Then "
});
formatter.match({
  "location": "CEDCDBiospecimenCountsSelectAllCohortsSteps.all_Specimen_tabs_are_selected()"
});
formatter.write("2020-12-09 14:40:21: Screenshot: ");
formatter.embedding("image/png", "embedded2.png");
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
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
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the CEDCD Biospecimen Tab",
  "keyword": "Given "
});
formatter.match({
  "location": "CEDCDBiospecimenCountsSelectAllCohortsSteps.the_user_is_on_the_CEDCD_Biospecimen_Tab()"
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
formatter.write("2020-12-09 14:40:31: Screenshot: ");
formatter.embedding("image/png", "embedded3.png");
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Cancer Type Drop Down is sorted Alphabetically",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SS-3509"
    },
    {
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the CEDCD Biospecimen tab",
  "keyword": "Given "
});
formatter.match({
  "location": "CEDCDBiospecimenCountsAlphabeticalCancerTypeSteps.the_user_is_on_the_CEDCD_Biospecimen_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on the Cancer Types drop down",
  "keyword": "When "
});
formatter.match({
  "location": "CEDCDBiospecimenCountsAlphabeticalCancerTypeSteps.the_user_clicks_on_the_Cancer_Types_drop_down()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the drop down is sorted alphabetically",
  "keyword": "Then "
});
formatter.match({
  "location": "CEDCDBiospecimenCountsAlphabeticalCancerTypeSteps.the_drop_down_is_sorted_alphabetically()"
});
formatter.write("2020-12-09 14:40:42: Screenshot: ");
formatter.embedding("image/png", "embedded4.png");
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/java/AnalysisTools/CEDCD/Features/CEDCD-SearchCohortsTab.feature");
formatter.feature({
  "name": "Test Cases on the Search Cohorts Tab",
  "description": "Description: This is an automated suite for test cases under the Search Cohorts Tab",
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
      "name": "@Smoke"
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
formatter.write("2020-12-09 14:40:54: Screenshot: ");
formatter.embedding("image/png", "embedded5.png");
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
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
      "name": "@Smoke"
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
formatter.write("2020-12-09 14:41:07: Screenshot: ");
formatter.embedding("image/png", "embedded6.png");
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Select All Cohorts",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SS-3430"
    },
    {
      "name": "@Smoke"
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
  "name": "the user clicks on the select all check box",
  "keyword": "And "
});
formatter.match({
  "location": "CEDCDSelectAllCohortsSteps.the_user_clicks_on_the_select_all_check_box()"
});
formatter.write("2020-12-09 14:41:16: Screenshot: ");
formatter.embedding("image/png", "embedded7.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "all studies are selected",
  "keyword": "Then "
});
formatter.match({
  "location": "CEDCDSelectAllCohortsSteps.all_studies_are_selected()"
});
formatter.write("2020-12-09 14:41:17: Screenshot: ");
formatter.embedding("image/png", "embedded8.png");
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
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
      "name": "@Smoke"
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
formatter.write("2020-12-09 14:41:29: Screenshot: ");
formatter.embedding("image/png", "embedded9.png");
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Tests the new Search Cohorts Page Layout",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SS-3432"
    },
    {
      "name": "@Smoke"
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
  "name": "the user sees updated Search Cohorts UI page",
  "keyword": "Then "
});
formatter.match({
  "location": "CEDCDSearchCohortsNewPageLayoutSteps.the_user_sees_updated_Search_Cohorts_UI_page()"
});
formatter.write("2020-12-09 14:41:41: Screenshot: ");
formatter.embedding("image/png", "embedded10.png");
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Restoring Search Criteria after Switching Tabs.",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SS-3446"
    },
    {
      "name": "@Smoke"
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
  "name": "the user filters for a certain study",
  "keyword": "When "
});
formatter.match({
  "location": "CEDCDSearchCohortsRestoringSearchCriteriaAfterSwitchingTabsSteps.the_user_filters_for_a_certain_study()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on a different tab",
  "keyword": "And "
});
formatter.match({
  "location": "CEDCDSearchCohortsRestoringSearchCriteriaAfterSwitchingTabsSteps.the_user_clicks_on_a_different_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user click back on the previous tab",
  "keyword": "And "
});
formatter.match({
  "location": "CEDCDSearchCohortsRestoringSearchCriteriaAfterSwitchingTabsSteps.the_user_click_back_on_the_previous_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user is filtered result from before are still populated",
  "keyword": "Then "
});
formatter.match({
  "location": "CEDCDSearchCohortsRestoringSearchCriteriaAfterSwitchingTabsSteps.the_user_is_filtered_result_from_before_are_still_populated()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
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
      "name": "@Smoke"
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
  "location": "CEDCDSearchCohortsCategoriesofDataSortedSteps.the_user_clicks_on_the_Categories_of_Data_Collected_drop_down()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "all selections are sorted alphabetically",
  "keyword": "Then "
});
formatter.match({
  "location": "CEDCDSearchCohortsCategoriesofDataSortedSteps.all_selections_are_sorted_alphabetically()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});