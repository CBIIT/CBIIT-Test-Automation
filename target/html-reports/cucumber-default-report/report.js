$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/ServiceNow/COVIDCode/Features/FollowUpForm.feature");
formatter.feature({
  "name": "COVIDCode Follow Up Form Scenarios",
  "description": "Description: This feature file contains scenarios related to the Follow Up Form",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Follow Up Form - Verifying Exposure and Risk Factors questions display - Service Portal",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Sprint7"
    },
    {
      "name": "@COVID-206"
    },
    {
      "name": "@Progression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "a COVIDCode Provider is on the Follow Up Form to update an existing enrollment",
  "keyword": "Given "
});
formatter.match({
  "location": "FollowUpFormSteps.a_COVIDCode_Provider_is_on_the_Follow_Up_Form_to_update_an_existing_enrollment()"
});
formatter.write("2020-09-02 16:11:53: Screenshot: ");
formatter.embedding("image/png", "embedded0.png");
formatter.write("2020-09-02 16:11:54: Screenshot: ");
formatter.embedding("image/png", "embedded1.png");
formatter.write("2020-09-02 16:12:03: Screenshot: ");
formatter.embedding("image/png", "embedded2.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "on the \"Exposures and Risk Factors\" section",
  "keyword": "When "
});
formatter.match({
  "location": "FollowUpFormSteps.on_the_section(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the following questions should display \"Your/Patient\u0027s typical self reported health?\", \"Medical Conditions\", \"If you/the patient has cancer, what type of cancer is it? (Please specify)\", \"Are immunizations up to date?\", \"Have you/the patient received the following vaccinations:\", \"What were your/the patient\u0027s typical walking pace?\",\"Hours spent sitting\", \"Have you/the patient ever regularly vaped an e-cigarette or similar device?\", \"Have you/the patient smoked at least 100 cigarettes in your/their entire life?\", \"About how often do you/the patient consume alcoholic beverages?\", \"Hours per week spent exercising\"",
  "keyword": "Then "
});
formatter.match({
  "location": "FollowUpFormSteps.the_following_questions_should_display(String,String,String,String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/java/ServiceNow/COVIDCode/Features/NativeViewScenarios.feature");
formatter.feature({
  "name": "Native View Scenarios",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Smoke"
    },
    {
      "name": "@Progression"
    }
  ]
});
formatter.scenario({
  "name": "COVIDcode Study nurse with an Admin role is able to submit an Enrollment Questionnaire in Native View",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Smoke"
    },
    {
      "name": "@Progression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "a COVIDcode Study nurse with an Admin role has logged in to the COVIDcode Study Native View application",
  "keyword": "Given "
});
formatter.match({
  "location": "NativeViewEQSubmissionSteps.a_COVIDcode_Study_nurse_with_an_Admin_role_has_logged_in_to_the_COVIDcode_Study_Native_View_application()"
});
formatter.write("2020-09-02 16:12:12: Screenshot: ");
formatter.embedding("image/png", "embedded3.png");
formatter.write("2020-09-02 16:12:15: Screenshot: ");
formatter.embedding("image/png", "embedded4.png");
formatter.write("2020-09-02 16:12:23: Screenshot: ");
formatter.embedding("image/png", "embedded5.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "is on the COVIDcode Enrollments page",
  "keyword": "And "
});
formatter.match({
  "location": "NativeViewEQSubmissionSteps.is_on_the_COVIDcode_Enrollments_page()"
});
formatter.write("2020-09-02 16:12:34: Screenshot: ");
formatter.embedding("image/png", "embedded6.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the COVIDcode Study nurse begins an Enrollment Questionnaire for a \"Group 3\" user who consents \"Yes\" to join the study",
  "keyword": "When "
});
formatter.match({
  "location": "NativeViewEQSubmissionSteps.the_COVIDcode_Study_nurse_begins_an_Enrollment_Questionnaire_for_a_user_who_consents_to_join_the_study(String,String)"
});
formatter.write("2020-09-02 16:12:39: Screenshot: ");
formatter.embedding("image/png", "embedded7.png");
formatter.result({
  "error_message": "org.openqa.selenium.ElementNotInteractableException: element not interactable\n  (Session info: chrome\u003d85.0.4183.83)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027NCI-02195279-ML\u0027, ip: \u00272600:8806:1100:1f9:0:0:0:32a9%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.15.6\u0027, java.version: \u002714.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 85.0.4183.83, chrome: {chromedriverVersion: 84.0.4147.30 (48b3e868b4cc0..., userDataDir: /var/folders/10/x0tkb8rd0yl...}, goog:chromeOptions: {debuggerAddress: localhost:56541}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 7e41a7d60280f0e718d1bde96229065d\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\n\tat org.openqa.selenium.remote.RemoteWebElement.sendKeys(RemoteWebElement.java:106)\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:564)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\n\tat com.sun.proxy.$Proxy20.sendKeys(Unknown Source)\n\tat ServiceNow.COVIDCode.Steps.NativeViewEQSubmissionSteps.the_COVIDcode_Study_nurse_begins_an_Enrollment_Questionnaire_for_a_user_who_consents_to_join_the_study(NativeViewEQSubmissionSteps.java:54)\n\tat ✽.the COVIDcode Study nurse begins an Enrollment Questionnaire for a \"Group 3\" user who consents \"Yes\" to join the study(file:src/test/java/ServiceNow/COVIDCode/Features/NativeViewScenarios.feature:10)\n",
  "status": "failed"
});
formatter.step({
  "name": "fills out the Enrollment Questionnaire by entering all required information including Demographics, Symptomology, and Exposures and Risk Factors",
  "keyword": "And "
});
formatter.match({
  "location": "NativeViewEQSubmissionSteps.fills_out_the_Enrollment_Questionnaire_by_entering_all_required_information_including_Demographics_Symptomology_and_Exposures_and_Risk_Factors()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "submits the Enrollment Questionnaire",
  "keyword": "And "
});
formatter.match({
  "location": "NativeViewEQSubmissionSteps.submits_the_Enrollment_Questionnaire()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the Enrollment Questionnaire should be successfully submitted",
  "keyword": "Then "
});
formatter.match({
  "location": "NativeViewEQSubmissionSteps.the_Enrollment_Questionnaire_should_be_successfully_submitted()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});