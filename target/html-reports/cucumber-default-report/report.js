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
  "name": "IDP Search request specifying  Training Organization and Training Lab, Branch, or Office",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Alena3"
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
  "name": "User will select \"\u003cTraining Organization\u003e\" as Training Organization",
  "keyword": "And "
});
formatter.step({
  "name": "User will click Search button",
  "keyword": "And "
});
formatter.step({
  "name": "User will verify first page search results of \"\u003cTraining Organization\u003e\"",
  "keyword": "And "
});
formatter.examples({
  "name": "Training Organization",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Training Organization"
      ]
    },
    {
      "cells": [
        "CBIIT"
      ]
    }
  ]
});
formatter.scenario({
  "name": "IDP Search request specifying  Training Organization and Training Lab, Branch, or Office",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoketest"
    },
    {
      "name": "@Alena3"
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
formatter.write("2021-04-19 14:22:03: Screenshot: ");
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
formatter.write("2021-04-19 14:22:11: Screenshot: After Search");
formatter.embedding("image/png", "embedded1.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User will select \"CBIIT\" as Training Organization",
  "keyword": "And "
});
formatter.match({
  "location": "SearchSteps.user_will_select_as_Training_Organization(String)"
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
  "name": "User will verify first page search results of \"CBIIT\"",
  "keyword": "And "
});
formatter.match({
  "location": "SearchSteps.user_will_verify_first_page_search_results_of(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});