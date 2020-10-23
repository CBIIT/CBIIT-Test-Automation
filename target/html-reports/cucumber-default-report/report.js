$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/ServiceNow/COVIDCode/Features/ServicePortalEQSubmission.feature");
formatter.feature({
  "name": "Service Portal Enrollment Questionnaire Submissions",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "COVIDcode Study Provider Enrollment Questionnaire Submission Group 1 User",
  "description": "",
  "keyword": "Scenario",
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
  "name": "a COVIDcode Study Provider user has logged in to the COVIDcode Study application",
  "keyword": "Given "
});
formatter.match({
  "location": "ServicePortalEQSubmissionsSteps.a_COVIDcode_Study_Provider_user_has_logged_in_to_the_COVIDcode_Study_application()"
});
formatter.write("2020-10-23 15:36:31: Screenshot: ");
formatter.embedding("image/png", "embedded0.png");
formatter.write("2020-10-23 15:36:32: Screenshot: ");
formatter.embedding("image/png", "embedded1.png");
formatter.write("2020-10-23 15:36:38: Screenshot: ");
formatter.embedding("image/png", "embedded2.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the COVIDcode Study Provider fills out an Enrollment Questionnaire for a \"Group 1\" who says \"Yes\" to join the study",
  "keyword": "When "
});
formatter.match({
  "location": "ServicePortalEQSubmissionsSteps.the_COVIDcode_Study_Provider_fills_out_an_Enrollment_Questionnaire_for_a_who_says_to_join_the_study(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enters users full name, required information, and demographics information",
  "keyword": "And "
});
formatter.match({
  "location": "ServicePortalEQSubmissionsSteps.enters_users_full_name_required_information_and_demographics_information()"
});
formatter.result({
  "error_message": "org.openqa.selenium.ElementNotInteractableException: element not interactable\n  (Session info: chrome\u003d86.0.4240.111)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027NCI-02195279-ML\u0027, ip: \u0027fe80:0:0:0:14d7:38c8:7392:c5b0%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.15.6\u0027, java.version: \u002714.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 86.0.4240.111, chrome: {chromedriverVersion: 86.0.4240.22 (398b0743353ff..., userDataDir: /var/folders/10/x0tkb8rd0yl...}, goog:chromeOptions: {debuggerAddress: localhost:50284}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: d03c416b5cb937075baaab8815759c6d\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\n\tat org.openqa.selenium.remote.RemoteWebElement.sendKeys(RemoteWebElement.java:106)\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:564)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\n\tat com.sun.proxy.$Proxy20.sendKeys(Unknown Source)\n\tat ServiceNow.COVIDCode.StepsImplementation.ServicePortalEQPageImpl.requiredDemographicsInfo(ServicePortalEQPageImpl.java:109)\n\tat ServiceNow.COVIDCode.Steps.ServicePortalEQSubmissionsSteps.enters_users_full_name_required_information_and_demographics_information(ServicePortalEQSubmissionsSteps.java:24)\n\tat ✽.enters users full name, required information, and demographics information(file:src/test/java/ServiceNow/COVIDCode/Features/ServicePortalEQSubmission.feature:7)\n",
  "status": "failed"
});
formatter.step({
  "name": "does not enter Disease Course and Exposures and Risk Factors information",
  "keyword": "But "
});
formatter.match({
  "location": "ServicePortalEQSubmissionsSteps.does_not_enter_Disease_Course_and_Exposures_and_Risk_Factors_information()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Submits the enrollment questionnaire",
  "keyword": "And "
});
formatter.match({
  "location": "ServicePortalEQSubmissionsSteps.submits_the_enrollment_questionnaire()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the enrollment questionnaire should be successfully submitted",
  "keyword": "Then "
});
formatter.match({
  "location": "ServicePortalEQSubmissionsSteps.the_enrollment_questionnaire_should_be_successfully_submitted()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});