$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/CustomBusinessApp/EIDP/Features/IDP_Initial%20Workflow.feature");
formatter.feature({
  "name": "Regression testing",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "IDP Search request as Gloria Calloway  specifying  Classification type",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Alena7"
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
  "name": "User will select \"\u003cClassification Type\u003e\" as Classification type on Gloria Calloway page",
  "keyword": "And "
});
formatter.step({
  "name": "User will click Search button on Gloria Calloway page",
  "keyword": "And "
});
formatter.step({
  "name": "User will verify first page results on Gloria Calloway page classification type are \"\u003cClassification Type\u003e\"",
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
        "Employee"
      ]
    }
  ]
});
formatter.scenario({
  "name": "IDP Search request as Gloria Calloway  specifying  Classification type",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Alena7"
    }
  ]
});
formatter.step({
  "name": "User will login to the application as \"nekrashevicha2\" user",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Logged in user changes the user to \"Calloway, Gloria\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User will select \"Employee\" as Classification type on Gloria Calloway page",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User will click Search button on Gloria Calloway page",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User will verify first page results on Gloria Calloway page classification type are \"Employee\"",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});