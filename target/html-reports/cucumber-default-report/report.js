$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/ServiceNow/COVIDDash/Features/Covid19Dashboard.feature");
formatter.feature({
  "name": "COVID Dashboard",
  "description": "  Description: This feature file tests COVIDDASH-7, 8, 20, 134, 135, 138, 136, 137, 140, 142, 143, 148",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Validate Autopulation",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    },
    {
      "name": "@progression"
    }
  ]
});
formatter.step({
  "name": "a User has logged in to the NIH COVID-19 Biorepository Dashboard Application",
  "keyword": "Given "
});
formatter.step({
  "name": "user validates that Institute, Division, Email Address, and Phone Number fields are not editable",
  "keyword": "And "
});
formatter.step({
  "name": "the User selects a principal Investigator by typing their name in the principal Investigator search box. \"\u003cPI Name\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "the Institute, Division, Email Address, and Phone Number fields are auto-populated. \"\u003cistitName\u003e\",\"\u003cdvsnName\u003e\",\"\u003cpiEmail\u003e\",\"\u003cpiPhonNum\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "user validates that Institute, Division, Email Address, and Phone Number fields are not editable",
  "keyword": "Then "
});
formatter.step({
  "name": "the user logs out",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "PI Name",
        "istitName",
        "dvsnName",
        "piEmail",
        "piPhonNum"
      ]
    },
    {
      "cells": [
        "Sohil Zalmay",
        "NCI",
        "OD",
        "@nih.gov",
        "2402766573"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Validate Autopulation",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    },
    {
      "name": "@progression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "a User has logged in to the NIH COVID-19 Biorepository Dashboard Application",
  "keyword": "Given "
});
formatter.match({
  "location": "COVIDHomePageSteps.a_User_has_logged_in_to_the_NIH_COVID_Biorepository_Dashboard_Application(Integer)"
});
formatter.write("2020-07-22 11:19:55: INFO: Environment: Test (https://service-test.nci.nih.gov/nih-covid-19-dashboard?xpage\u003dlanding_pub)");
formatter.write("2020-07-22 11:19:55: Screenshot: ");
formatter.embedding("image/png", "embedded0.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user validates that Institute, Division, Email Address, and Phone Number fields are not editable",
  "keyword": "And "
});
formatter.match({
  "location": "COVIDHomePageSteps.user_validates_that_Institute_Division_Email_Address_and_Phone_Number_fields_are_not_editabel()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the User selects a principal Investigator by typing their name in the principal Investigator search box. \"Sohil Zalmay\"",
  "keyword": "When "
});
formatter.match({
  "location": "COVIDHomePageSteps.the_User_selects_a_Primary_Investigator_by_typing_their_name_in_the_Primary_Investigator_search_box(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the Institute, Division, Email Address, and Phone Number fields are auto-populated. \"NCI\",\"OD\",\"@nih.gov\",\"2402766573\"",
  "keyword": "Then "
});
formatter.match({
  "location": "COVIDHomePageSteps.the_Institute_Division_Email_Address_and_Phone_Number_fields_are_auto_populated(String,String,String,String)"
});
formatter.write("2020-07-22 11:20:08: Screenshot: ");
formatter.embedding("image/png", "embedded1.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user validates that Institute, Division, Email Address, and Phone Number fields are not editable",
  "keyword": "Then "
});
formatter.match({
  "location": "COVIDHomePageSteps.user_validates_that_Institute_Division_Email_Address_and_Phone_Number_fields_are_not_editabel()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user logs out",
  "keyword": "And "
});
formatter.match({
  "location": "COVIDHomePageSteps.the_user_logs_out()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});