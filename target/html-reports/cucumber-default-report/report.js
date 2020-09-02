$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/ServiceNow/CHARMS/Features/TESTACCOUNTRESET.feature");
formatter.feature({
  "name": "TEST ACCOUNT RESET",
  "description": "Description: This feature resets CHARMS test accounts used for Automation",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Test Account Reset",
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
  "name": "logged in to ServiceNow Native View",
  "keyword": "Given "
});
formatter.match({
  "location": "TestAccountResetSteps.logged_in_to_ServiceNow_Native_View()"
});
formatter.write("2020-09-01 20:55:32: Screenshot: ");
formatter.embedding("image/png", "embedded0.png");
formatter.write("2020-09-01 20:55:35: Screenshot: ");
formatter.embedding("image/png", "embedded1.png");
formatter.write("2020-09-01 20:55:42: Screenshot: ");
formatter.embedding("image/png", "embedded2.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "searching for \"Studio\" in the filter navigator",
  "keyword": "When "
});
formatter.match({
  "location": "TestAccountResetSteps.searching_for_in_the_filter_navigator(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Studio",
  "keyword": "And "
});
formatter.match({
  "location": "TestAccountResetSteps.click_on_Studio()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a new tab opens with ServiceNow Studios applications filter search box",
  "keyword": "Then "
});
formatter.match({
  "location": "TestAccountResetSteps.a_new_tab_opens_with_ServiceNow_Studios_applications_filter_search_box()"
});
formatter.write("2020-09-01 20:55:53: Screenshot: ");
formatter.embedding("image/png", "embedded3.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "searching for \"Family Cohort Study\"",
  "keyword": "When "
});
formatter.match({
  "location": "TestAccountResetSteps.searching_for(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicking on the Family Cohort Study application link",
  "keyword": "And "
});
formatter.match({
  "location": "TestAccountResetSteps.clicking_on_the_Family_Cohort_Study_application_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the \"Welcome to Studio\" page displays with CHARMS application explorer",
  "keyword": "Then "
});
formatter.match({
  "location": "TestAccountResetSteps.the_page_displays_with_CHARMS_application_explorer(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "on the tables drop down navigate to CHARMS Referrals",
  "keyword": "Then "
});
formatter.match({
  "location": "TestAccountResetSteps.on_the_tables_drop_down_navigate_to_CHARMS_Referrals()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "under \"Related Links\" click on Show List",
  "keyword": "And "
});
formatter.match({
  "location": "TestAccountResetSteps.under_click_on_Show_List(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "search for test account email address \"diegojuarezbusiness@gmail.com\"",
  "keyword": "Then "
});
formatter.match({
  "location": "TestAccountResetSteps.search_for_test_account_email_address(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select the account and delete it - this will reset the screener form",
  "keyword": "Then "
});
formatter.match({
  "location": "TestAccountResetSteps.select_the_account_and_delete_it_this_will_reset_the_screener_form()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "on the tables drop down navigate to Family Member Details",
  "keyword": "Then "
});
formatter.match({
  "location": "TestAccountResetSteps.on_the_tables_drop_down_navigate_to_Family_Member_Details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "navigate to Show List",
  "keyword": "Then "
});
formatter.match({
  "location": "TestAccountResetSteps.navigate_to_Show_List()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "search by testers name \"Diego TestAccount2\"",
  "keyword": "Then "
});
formatter.match({
  "location": "TestAccountResetSteps.search_by_testers_name(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select the account and delete it - this will reset Family Member Details",
  "keyword": "Then "
});
formatter.match({
  "location": "TestAccountResetSteps.select_the_account_and_delete_it_this_will_reset_Family_Member_Details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "on the tables drop down navigate to FCSMS Form Access",
  "keyword": "Then "
});
formatter.match({
  "location": "TestAccountResetSteps.on_the_tables_drop_down_navigate_to_FCSMS_Form_Access()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "navigate to  FCSMS Show List",
  "keyword": "Then "
});
formatter.match({
  "location": "TestAccountResetSteps.navigate_to_FCSMS_Show_List()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "search for test account email address for FCSMS form \"diegojuarezbusiness@gmail.com\"",
  "keyword": "Then "
});
formatter.match({
  "location": "TestAccountResetSteps.search_for_test_account_email_address_for_FCSMS_form(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select the account and delete it - this will reset FCSMS Form Access",
  "keyword": "Then "
});
formatter.match({
  "location": "TestAccountResetSteps.select_the_account_and_delete_it_this_will_reset_FCSMS_Form_Access()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});