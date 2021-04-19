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
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: cannot determine loading status\nfrom disconnected: received Inspector.detached event\n  (Session info: chrome\u003d89.0.4389.128)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027NCI-02225370-L\u0027, ip: \u002710.0.0.30\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002715.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 89.0.4389.128, chrome: {chromedriverVersion: 88.0.4324.96 (68dba2d8a0b14..., userDataDir: C:\\Users\\NEKRAS~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:60516}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 1f15720ed92de4fc23544d23b357c630\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:64)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.get(RemoteWebDriver.java:277)\r\n\tat CustomBusinessApp.EIDP.StepsImplementation.EIDPLoginStepImpl.eidpApplicationLogin(EIDPLoginStepImpl.java:19)\r\n\tat CustomBusinessApp.EIDP.Steps.LoginSteps.loginByUsername(LoginSteps.java:24)\r\n\tat ✽.User will login to the application as \"nekrashevicha2\" user(file:src/test/java/CustomBusinessApp/EIDP/Features/IDP_Initial%20Workflow.feature:381)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Logged in user changes the user to \"Ginsburg,Erika\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.changeUser(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User will click on search in dashboard",
  "keyword": "And "
});
formatter.match({
  "location": "DashboardSteps.clickOnSearch()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User will select \"CBIIT\" as Training Organization",
  "keyword": "And "
});
formatter.match({
  "location": "SearchSteps.user_will_select_as_Training_Organization(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User will click Search button",
  "keyword": "And "
});
formatter.match({
  "location": "SearchSteps.user_will_click_Search_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User will verify first page search results of \"CBIIT\"",
  "keyword": "And "
});
formatter.match({
  "location": "SearchSteps.user_will_verify_first_page_search_results_of(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});