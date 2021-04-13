$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/CustomBusinessApp/EIDP/Features/IDP_Initial%20Workflow.feature");
formatter.feature({
  "name": "Regression testing",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Smoketest"
    }
  ]
});
formatter.scenarioOutline({
  "name": "IDP Search request as Gloria Calloway",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Alena6"
    },
    {
      "name": "@GloriaCalllowaySearch"
    }
  ]
});
formatter.step({
  "name": "User will login to the application as \"nekrashevicha2\" user",
  "keyword": "When "
});
formatter.step({
  "name": "Logged in user changes the user to \"Calloway, Gloria\"",
  "keyword": "And "
});
formatter.step({
  "name": "User enters \"\u003cTrainee First Name\u003e\" to first name input box",
  "keyword": "And "
});
formatter.step({
  "name": "User enters \"\u003cTrainee Last Name\u003e\" to last name input box",
  "keyword": "And "
});
formatter.step({
  "name": "User will click Search button on Gloria Calloway page",
  "keyword": "And "
});
formatter.step({
  "name": "verify expected results as \"\u003cTrainee First Name\u003e\" and \"\u003cTrainee Last Name\u003e\" on Gloria Calloway page",
  "keyword": "Then "
});
formatter.examples({
  "name": "User fills out the form as in the table below:",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Trainee First Name",
        "Trainee Last Name"
      ]
    },
    {
      "cells": [
        "Kate",
        "Brown"
      ]
    }
  ]
});
formatter.scenario({
  "name": "IDP Search request as Gloria Calloway",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoketest"
    },
    {
      "name": "@Alena6"
    },
    {
      "name": "@GloriaCalllowaySearch"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User will login to the application as \"nekrashevicha2\" user",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.loginByUsername(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Logged in user changes the user to \"Calloway, Gloria\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.changeUser(String)"
});
formatter.write("2021-04-13 12:33:31: Screenshot: ");
formatter.embedding("image/png", "embedded0.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"Kate\" to first name input box",
  "keyword": "And "
});
formatter.match({
  "location": "SearchSteps.user_enters_to_first_name_input_box(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"Brown\" to last name input box",
  "keyword": "And "
});
formatter.match({
  "location": "SearchSteps.user_enters_to_last_name_input_box(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User will click Search button on Gloria Calloway page",
  "keyword": "And "
});
formatter.match({
  "location": "SearchSteps.user_will_click_Search_button_on_Gloria_Calloway_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify expected results as \"Kate\" and \"Brown\" on Gloria Calloway page",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchSteps.verify_expected_results_as_and_on_Gloria_Calloway_page(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});