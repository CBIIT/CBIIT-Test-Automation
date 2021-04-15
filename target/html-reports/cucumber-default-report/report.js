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
      "name": "@Smoketest"
    },
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
formatter.write("2021-04-15 16:05:42: Screenshot: ");
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
formatter.write("2021-04-15 16:05:51: Screenshot: After Search");
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
formatter.write("2021-04-15 16:06:18: Screenshot: ");
formatter.embedding("image/png", "embedded2.png");
formatter.write("2021-04-15 16:06:28: Screenshot: ");
formatter.embedding("image/png", "embedded3.png");
formatter.write("2021-04-15 16:06:39: Screenshot: ");
formatter.embedding("image/png", "embedded4.png");
formatter.result({
  "error_message": "org.openqa.selenium.WebDriverException: chrome not reachable\n  (Session info: chrome\u003d89.0.4389.114)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027NCI-02225370-L\u0027, ip: \u002710.0.0.30\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002715.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 89.0.4389.114, chrome: {chromedriverVersion: 88.0.4324.96 (68dba2d8a0b14..., userDataDir: C:\\Users\\NEKRAS~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:50920}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 885c31e904fbfb9414bc57744531f83f\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:64)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:84)\r\n\tat CustomBusinessApp.EIDP.StepsImplementation.SearchStepImpl.verifyTraineeUnderPrimaryMentor(SearchStepImpl.java:351)\r\n\tat CustomBusinessApp.EIDP.Steps.SearchSteps.user_will_verify_expected_result_as(SearchSteps.java:250)\r\n\tat ✽.User will verify expected result as \"Ali Abazeed\"(file:src/test/java/CustomBusinessApp/EIDP/Features/IDP_Initial%20Workflow.feature:398)\r\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
});