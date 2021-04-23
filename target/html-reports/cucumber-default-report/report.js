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
    },
    {
      "cells": [
        "HNU22"
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
formatter.write("2021-04-23 16:38:09: Screenshot: ");
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
  "error_message": "java.lang.AssertionError: HNC1DOES NOT EXIST IN THE DROPDOWN LIST, FAILED!!!\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat CustomBusinessApp.EIDP.StepsImplementation.SearchStepImpl.verifyNIHSAAC(SearchStepImpl.java:459)\r\n\tat CustomBusinessApp.EIDP.Steps.SearchSteps.user_will_verify_first_page_results_on_Gloria_Calloway_page_NIH_SAC_are(SearchSteps.java:305)\r\n\tat ✽.User will verify first page results on Gloria Calloway page NIH SAC are \"HNC1\"(file:src/test/java/CustomBusinessApp/EIDP/Features/IDP_Initial%20Workflow.feature:456)\r\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Search request as Gloria Calloway specifying NIH SAC",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Alena8"
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
formatter.write("2021-04-23 16:38:49: Screenshot: ");
formatter.embedding("image/png", "embedded1.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User will select \"HNU22\" as NIH SAC on Gloria Calloway page",
  "keyword": "And "
});
formatter.match({
  "location": "SearchSteps.user_will_select_as_NIH_SAC_on_Gloria_Calloway_page(String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: Cannot locate option with value: HNU22\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027NCI-02225370-L\u0027, ip: \u002710.0.0.30\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002715.0.2\u0027\nDriver info: driver.version: unknown\r\n\tat org.openqa.selenium.support.ui.Select.findOptionsByValue(Select.java:283)\r\n\tat org.openqa.selenium.support.ui.Select.selectByValue(Select.java:186)\r\n\tat com.nci.automation.web.CommonUtils.selectDropDownValue(CommonUtils.java:101)\r\n\tat CustomBusinessApp.EIDP.StepsImplementation.SearchStepImpl.selectDropdownNIHSACGloriaCalloway(SearchStepImpl.java:453)\r\n\tat CustomBusinessApp.EIDP.Steps.SearchSteps.user_will_select_as_NIH_SAC_on_Gloria_Calloway_page(SearchSteps.java:300)\r\n\tat ✽.User will select \"HNU22\" as NIH SAC on Gloria Calloway page(file:src/test/java/CustomBusinessApp/EIDP/Features/IDP_Initial%20Workflow.feature:454)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User will click Search button on Gloria Calloway page",
  "keyword": "And "
});
formatter.match({
  "location": "SearchSteps.user_will_click_Search_button_on_Gloria_Calloway_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User will verify first page results on Gloria Calloway page NIH SAC are \"HNU22\"",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchSteps.user_will_verify_first_page_results_on_Gloria_Calloway_page_NIH_SAC_are(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});