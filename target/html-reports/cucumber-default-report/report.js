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
formatter.step({
  "name": "user selects add new Cohort",
  "keyword": "When "
});
formatter.step({
  "name": "enters Cohort Name as \"\u003cCohort Name\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "enters Cohort Acronym as \"\u003cCohort Acronym\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "enters Cohort Owner",
  "keyword": "And "
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
formatter.step({
  "name": "user selects add new Cohort",
  "keyword": "When "
});
formatter.match({
  "location": "CEDCDQuestionnaireSteps.user_selects_add_new_Cohort()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enters Cohort Name as \"First Automated Cohort\"",
  "keyword": "And "
});
formatter.match({
  "location": "CEDCDQuestionnaireSteps.enters_Cohort_Name_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enters Cohort Acronym as \"FAC\"",
  "keyword": "And "
});
formatter.match({
  "location": "CEDCDQuestionnaireSteps.enters_Cohort_Acronym_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enters Cohort Owner",
  "keyword": "And "
});
formatter.match({
  "location": "CEDCDQuestionnaireSteps.enters_Cohort_Owner()"
});
formatter.result({
  "error_message": "org.openqa.selenium.ElementNotInteractableException: element not interactable\n  (Session info: chrome\u003d89.0.4389.90)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027NCI-02134309-ML\u0027, ip: \u0027fe80:0:0:0:108d:5b13:62e8:5d31%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.15.7\u0027, java.version: \u002714.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 89.0.4389.90, chrome: {chromedriverVersion: 88.0.4324.96 (68dba2d8a0b14..., userDataDir: /var/folders/ls/pc4m1ymd4n1...}, goog:chromeOptions: {debuggerAddress: localhost:57823}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 2641074fd22328ade97503425df3214c\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\n\tat org.openqa.selenium.remote.RemoteWebElement.sendKeys(RemoteWebElement.java:106)\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:564)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\n\tat com.sun.proxy.$Proxy20.sendKeys(Unknown Source)\n\tat AnalysisTools.CEDCD.Steps.CEDCDQuestionnaireSteps.enters_Cohort_Owner(CEDCDQuestionnaireSteps.java:65)\n\tat ✽.enters Cohort Owner(file:src/test/java/AnalysisTools/CEDCD/Features/CEDCDQuestionnaire.feature:10)\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
});