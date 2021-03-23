$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/AnalysisTools/CEDCD/Features/CEDCDQuestionnaire.feature");
formatter.feature({
  "name": "Questionnaire",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Admin able to add cohort",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Progression"
    }
  ]
});
formatter.step({
  "name": "the user is on the CEDCD homepage",
  "keyword": "Given "
});
formatter.step({
  "name": "the user is logged in as Admin",
  "keyword": "When "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Cohort Name",
        "Cohort Acronym",
        "Notes"
      ]
    },
    {
      "cells": [
        "First Automated Cohort",
        "FAC",
        "This Cohort Will Be Automated"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Admin able to add cohort",
  "description": "",
  "keyword": "Scenario Outline",
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
  "name": "the user is on the CEDCD homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "CEDCDQuestionnaireSteps.the_user_is_on_the_CEDCD_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user is logged in as Admin",
  "keyword": "When "
});
formatter.match({
  "location": "CEDCDQuestionnaireSteps.the_user_is_logged_in_as_Admin()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});