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
  "name": "IDP Search request specifying  Classification type",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Alena2"
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
  "name": "User will select \"\u003cClassification Type\u003e\" as Classification type",
  "keyword": "And "
});
formatter.step({
  "name": "User will click Search button",
  "keyword": "And "
});
formatter.step({
  "name": "User will verify first page results classification type are \"\u003cClassification Type\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "Classification Type Options",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Classification Type"
      ]
    },
    {
      "cells": [
        "Fellow"
      ]
    },
    {
      "cells": [
        "Employee"
      ]
    }
  ]
});
formatter.scenario({
  "name": "IDP Search request specifying  Classification type",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoketest"
    },
    {
      "name": "@Alena2"
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
formatter.write("2021-04-11 22:15:33: Screenshot: ");
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
formatter.write("2021-04-11 22:15:41: Screenshot: After Search");
formatter.embedding("image/png", "embedded1.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User will select \"Fellow\" as Classification type",
  "keyword": "And "
});
formatter.match({
  "location": "SearchSteps.user_will_select_as_Fellow(String)"
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
  "name": "User will verify first page results classification type are \"Fellow\"",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchSteps.user_will_verify_expected_results(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "IDP Search request specifying  Classification type",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoketest"
    },
    {
      "name": "@Alena2"
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
formatter.write("2021-04-11 22:16:20: Screenshot: ");
formatter.embedding("image/png", "embedded2.png");
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
formatter.write("2021-04-11 22:16:27: Screenshot: After Search");
formatter.embedding("image/png", "embedded3.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User will select \"Employee\" as Classification type",
  "keyword": "And "
});
formatter.match({
  "location": "SearchSteps.user_will_select_as_Fellow(String)"
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
  "name": "User will verify first page results classification type are \"Employee\"",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchSteps.user_will_verify_expected_results(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});