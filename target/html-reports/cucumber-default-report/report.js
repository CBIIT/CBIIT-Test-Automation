$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/CustomBusinessApp/EIDP/Features/IDP_Initial%20Workflow.feature");
formatter.feature({
  "name": "Regression testing",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "IDP Search Request by selecting Primary Mentor",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Alena4"
    }
  ]
});
formatter.step({
  "name": "User will login to the application as \"nekrashevicha2\" user",
  "keyword": "When "
});
formatter.step({
  "name": "Logged in user changes the user to \"Ginsburg,Erika\"",
  "keyword": "And "
});
formatter.step({
  "name": "User will click on search in dashboard",
  "keyword": "And "
});
formatter.step({
  "name": "User will select \"\u003cPrimary Mentor\u003e\" as Primary Mentor",
  "keyword": "And "
});
formatter.step({
  "name": "User will click Search button",
  "keyword": "And "
});
formatter.step({
  "name": "User will verify expected result as \"\u003cPrimary Mentor\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "Primary Mentor Options",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Primary Mentor"
      ]
    },
    {
      "cells": [
        "Ali Abazeed"
      ]
    }
  ]
});
formatter.scenario({
  "name": "IDP Search Request by selecting Primary Mentor",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Alena4"
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
  "name": "Logged in user changes the user to \"Ginsburg,Erika\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.changeUser(String)"
});
formatter.write("2021-04-21 16:30:07: Screenshot: ");
formatter.embedding("image/png", "embedded0.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User will click on search in dashboard",
  "keyword": "And "
});
formatter.match({
  "location": "DashboardSteps.clickOnSearch()"
});
formatter.write("2021-04-21 16:30:16: Screenshot: After Search");
formatter.embedding("image/png", "embedded1.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User will select \"Ali Abazeed\" as Primary Mentor",
  "keyword": "And "
});
formatter.match({
  "location": "SearchSteps.user_will_select_as_Primary_Mentor(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User will click Search button",
  "keyword": "And "
});
formatter.match({
  "location": "SearchSteps.user_will_click_Search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User will verify expected result as \"Ali Abazeed\"",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchSteps.user_will_verify_expected_result_as(String)"
});
formatter.write("2021-04-21 16:30:43: Screenshot: ");
formatter.embedding("image/png", "embedded2.png");
formatter.write("2021-04-21 16:30:53: Screenshot: ");
formatter.embedding("image/png", "embedded3.png");
formatter.write("2021-04-21 16:31:03: Screenshot: ");
formatter.embedding("image/png", "embedded4.png");
formatter.write("2021-04-21 16:31:14: Screenshot: ");
formatter.embedding("image/png", "embedded5.png");
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});