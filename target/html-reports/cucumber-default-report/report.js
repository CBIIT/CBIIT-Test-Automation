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
  "name": "enters Cohort Owner",
  "keyword": "And "
});
formatter.step({
  "name": "enters \"\u003cNotes\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "clicks submit",
  "keyword": "And "
});
formatter.step({
  "name": "Cohort is added",
  "keyword": "Then "
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
        "Second Automated Cohort",
        "SAC",
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
  "name": "enters Cohort Name as \"Second Automated Cohort\"",
  "keyword": "And "
});
formatter.match({
  "location": "CEDCDQuestionnaireSteps.enters_Cohort_Name_as(String)"
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
  "status": "passed"
});
formatter.step({
  "name": "enters \"This Cohort Will Be Automated\"",
  "keyword": "And "
});
formatter.match({
  "location": "CEDCDQuestionnaireSteps.enters(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks submit",
  "keyword": "And "
});
formatter.match({
  "location": "CEDCDQuestionnaireSteps.clicks_submit()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"link text\",\"selector\":\"Submit\"}\n  (Session info: chrome\u003d89.0.4389.90)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027NCI-02134309-ML\u0027, ip: \u0027fe80:0:0:0:1427:6f46:8945:846f%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.15.7\u0027, java.version: \u002714.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 89.0.4389.90, chrome: {chromedriverVersion: 88.0.4324.96 (68dba2d8a0b14..., userDataDir: /var/folders/ls/pc4m1ymd4n1...}, goog:chromeOptions: {debuggerAddress: localhost:52244}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 7b52479f9e4e8189e0875f186d224ae7\n*** Element info: {Using\u003dlink text, value\u003dSubmit}\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByLinkText(RemoteWebDriver.java:380)\n\tat org.openqa.selenium.By$ByLinkText.findElement(By.java:220)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\n\tat com.sun.proxy.$Proxy20.click(Unknown Source)\n\tat AnalysisTools.CEDCD.Steps.CEDCDQuestionnaireSteps.clicks_submit(CEDCDQuestionnaireSteps.java:76)\n\tat ✽.clicks submit(file:src/test/java/AnalysisTools/CEDCD/Features/CEDCDQuestionnaire.feature:12)\n",
  "status": "failed"
});
formatter.step({
  "name": "Cohort is added",
  "keyword": "Then "
});
formatter.match({
  "location": "CEDCDQuestionnaireSteps.Cohort_is_added()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});