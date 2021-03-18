$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/AnalysisTools/CEDCD/Features/CEDCD-BiospecimenCountsTab.feature");
formatter.feature({
  "name": "Test Cases on the Biospecimen Count Tab",
  "description": "Description: This is an automated suite for test cases under the Biospecimen Tab",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "The Clear All button clears all the selection on the Biospecimen Counts Tab",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SS-3453"
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
  "name": "the user is on the CEDCD Biospecimen Tab",
  "keyword": "Given "
});
formatter.match({
  "location": "CEDCDBiospecimenCountsSelectAllCohortsSteps.the_user_is_on_the_CEDCD_Biospecimen_Tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user selects All Types from the Specimen Type drop down",
  "keyword": "And "
});
formatter.match({
  "location": "CEDCDBiospecimenCountClearAllSteps.the_user_selects_All_Types_from_the_Specimen_Type_drop_down()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user selects All Cancers from the Cancer Type drop down",
  "keyword": "And "
});
formatter.match({
  "location": "CEDCDBiospecimenCountClearAllSteps.the_user_selects_All_Cancers_from_the_Cancer_Type_drop_down()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user selects All Cohorts from the Cohorts drop down",
  "keyword": "And "
});
formatter.match({
  "location": "CEDCDBiospecimenCountClearAllSteps.the_user_selects_All_Cohorts_from_the_Cohorts_drop_down()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user searches results",
  "keyword": "And "
});
formatter.match({
  "location": "CEDCDBiospecimenCountClearAllSteps.the_user_searches_results()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//input[@name\u003d\u0027submitBtn\u0027]\"}\n  (Session info: chrome\u003d89.0.4389.90)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027NCI-02133367-ML\u0027, ip: \u0027fe80:0:0:0:7:490b:317f:2a4%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.15.7\u0027, java.version: \u002715.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 89.0.4389.90, chrome: {chromedriverVersion: 88.0.4324.96 (68dba2d8a0b14..., userDataDir: /var/folders/hj/tp7r0v1j7rd...}, goog:chromeOptions: {debuggerAddress: localhost:56756}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 07d971a180908d1a7e00c07faffd4528\n*** Element info: {Using\u003dxpath, value\u003d//input[@name\u003d\u0027submitBtn\u0027]}\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:64)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\n\tat com.sun.proxy.$Proxy20.getWrappedElement(Unknown Source)\n\tat org.openqa.selenium.remote.internal.WebElementToJsonConverter.apply(WebElementToJsonConverter.java:50)\n\tat java.base/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:195)\n\tat java.base/java.util.Spliterators$ArraySpliterator.forEachRemaining(Spliterators.java:948)\n\tat java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:484)\n\tat java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)\n\tat java.base/java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:913)\n\tat java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)\n\tat java.base/java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:578)\n\tat org.openqa.selenium.remote.RemoteWebDriver.executeScript(RemoteWebDriver.java:484)\n\tat com.nci.automation.web.JavascriptUtils.clickByJS(JavascriptUtils.java:29)\n\tat AnalysisTools.CEDCD.Steps.CEDCDBiospecimenCountClearAllSteps.the_user_searches_results(CEDCDBiospecimenCountClearAllSteps.java:42)\n\tat ✽.the user searches results(file:src/test/java/AnalysisTools/CEDCD/Features/CEDCD-BiospecimenCountsTab.feature:12)\n",
  "status": "failed"
});
formatter.step({
  "name": "the user clicks on the Clear All button",
  "keyword": "When "
});
formatter.match({
  "location": "CEDCDBiospecimenCountClearAllSteps.the_user_clicks_on_the_Clear_All_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "all previously selected fields are no longer selected",
  "keyword": "Then "
});
formatter.match({
  "location": "CEDCDBiospecimenCountClearAllSteps.all_previously_selected_fields_are_no_longer_selected()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});