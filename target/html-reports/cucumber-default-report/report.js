$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/CustomBusinessApp/EIDP/Features/IDP_Initial%20Workflow.feature");
formatter.feature({
  "name": "Regression testing",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Search request as Gloria Calloway specifying NIH SAC",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Alena8"
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
  "name": "User will select \"\u003cNIH SAC\u003e\" as NIH SAC on Gloria Calloway page",
  "keyword": "And "
});
formatter.step({
  "name": "User will click Search button on Gloria Calloway page",
  "keyword": "And "
});
formatter.step({
  "name": "User will verify first page results on Gloria Calloway page NIH SAC are \"\u003cNIH SAC\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "NIH SAC",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "NIH SAC"
      ]
    },
    {
      "cells": [
        "HNC1"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Search request as Gloria Calloway specifying NIH SAC",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Alena8"
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
formatter.write("2021-04-22 15:26:01: Screenshot: ");
formatter.embedding("image/png", "embedded0.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User will select \"HNC1\" as NIH SAC on Gloria Calloway page",
  "keyword": "And "
});
formatter.match({
  "location": "SearchSteps.user_will_select_as_NIH_SAC_on_Gloria_Calloway_page(String)"
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
  "name": "User will verify first page results on Gloria Calloway page NIH SAC are \"HNC1\"",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchSteps.user_will_verify_first_page_results_on_Gloria_Calloway_page_NIH_SAC_are(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});