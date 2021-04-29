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
formatter.scenario({
  "name": "IDP request creates and decline and approve",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Smoketest"
    },
    {
      "name": "@InitiatesIDP"
    },
    {
      "name": "@Regression"
    },
    {
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User will login to the application as \"gugulothus2\" user",
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
formatter.result({
  "error_message": "org.openqa.selenium.UnhandledAlertException: unexpected alert open: {Alert text : Either provide userid and password or Login with PIV}\n  (Session info: MicrosoftEdge\u003d90.0.818.49): Either provide userid and password or Login with PIV\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027NCI-02189939-L\u0027, ip: \u0027192.168.1.243\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002715.0.2\u0027\nDriver info: org.openqa.selenium.edge.EdgeDriver\nCapabilities {acceptInsecureCerts: false, browserName: msedge, browserVersion: 90.0.818.49, javascriptEnabled: true, ms:edgeOptions: {debuggerAddress: localhost:57650}, msedge: {msedgedriverVersion: 90.0.818.49 (386cfd3fb45b9f..., userDataDir: C:\\Users\\GUGULO~1\\AppData\\L...}, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 177d647409d8c31191f7fcb0d6549e26\n*** Element info: {Using\u003dcss selector, value\u003ddiv[onclick*\u003d\u0027advanced-search\u0027]}\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:120)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByCssSelector(RemoteWebDriver.java:420)\r\n\tat org.openqa.selenium.By$ByCssSelector.findElement(By.java:431)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy18.click(Unknown Source)\r\n\tat com.nci.automation.web.CommonUtils.click(CommonUtils.java:43)\r\n\tat CustomBusinessApp.EIDP.StepsImplementation.DashboardStepImpl.clickOnSearch(DashboardStepImpl.java:25)\r\n\tat CustomBusinessApp.EIDP.Steps.DashboardSteps.clickOnSearch(DashboardSteps.java:18)\r\n\tat ✽.User will click on search in dashboard(file:src/test/java/CustomBusinessApp/EIDP/Features/IDP_Initial%20Workflow.feature:9)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User creates IDP request",
  "rows": [
    {
      "cells": [
        "Search For",
        "Classification Type",
        "NCI Training Organization"
      ]
    },
    {
      "cells": [
        "Non-NCI (Fellows Only)",
        "Fellow",
        "CCR"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "SearchSteps.createIDPrequest(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Logged in user changes the user to trainee",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.changeUser()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User will clickOn start idp button",
  "keyword": "And "
});
formatter.match({
  "location": "DashboardSteps.clickOnStartIDPButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User fills mandatory fields in general information",
  "keyword": "And "
});
formatter.match({
  "location": "GeneralInformationSteps.fillGeneralInformation()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User fills mandatory fields in project deliverable page",
  "keyword": "And "
});
formatter.match({
  "location": "ProjectRelatedDeliverableSteps.fillProjectDeliverableData()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User fills mandatory fields in career goals page",
  "keyword": "And "
});
formatter.match({
  "location": "CareerGoalAndActivitySteps.fillCareerGoal()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User fills mandatory fields in aligning expecations page",
  "keyword": "And "
});
formatter.match({
  "location": "AligningExpectationsSteps.fillAligningExpecations()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User will click on revew and take action button",
  "keyword": "And "
});
formatter.match({
  "location": "AligningExpectationsSteps.user_will_click_on_revew_and_take_action_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks on Send IDP to the Primary Mentor button",
  "keyword": "And "
});
formatter.match({
  "location": "DashboardSteps.sendIDPtoPrimaryMentory()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Logged in user changes the user to \"Berzofsky,Jay\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.changeUser(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User will click on IDP Awaiting response button",
  "keyword": "And "
});
formatter.match({
  "location": "DashboardSteps.clickOnIDPAwaitingResponse()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks on the trainee specific IDP request",
  "keyword": "And "
});
formatter.match({
  "location": "DashboardSteps.selectIncompleteIDPrequestOfTrainnee()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks on Decline IDP button",
  "keyword": "And "
});
formatter.match({
  "location": "DashboardSteps.clickOnDeclineIDPButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Logged in user changes the user to trainee",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.changeUser()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User will clickOn proceed button",
  "keyword": "And "
});
formatter.match({
  "location": "DashboardSteps.clickOnProceedButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks on Send IDP to the Primary Mentor button",
  "keyword": "And "
});
formatter.match({
  "location": "DashboardSteps.sendIDPtoPrimaryMentory()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Logged in user changes the user to \"Berzofsky,Jay\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.changeUser(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User will click on IDP Awaiting response button",
  "keyword": "And "
});
formatter.match({
  "location": "DashboardSteps.clickOnIDPAwaitingResponse()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks on the trainee specific IDP request",
  "keyword": "And "
});
formatter.match({
  "location": "DashboardSteps.selectIncompleteIDPrequestOfTrainnee()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User validates fields in all the tabs and values and clicks on No Revision option",
  "keyword": "And "
});
formatter.match({
  "location": "IDPAwaitingResponseSteps.user_validates_fields_in_all_the_tabs_and_values_and_clicks_on_No_Revision_option()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks on REVIEW AND TAKE ACTION button",
  "keyword": "And "
});
formatter.match({
  "location": "IDPAwaitingResponseSteps.takeAction()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks on SEND IDP TO THE TRAINEE button",
  "keyword": "And "
});
formatter.match({
  "location": "IDPAwaitingResponseSteps.clickOnSendIDPToTraineeButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Logged in user changes the user to trainee",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.changeUser()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Trainee verifies IDP request status as \"Under Trainee\u0027s Review\"",
  "keyword": "And "
});
formatter.match({
  "location": "DashboardSteps.verifyRequestStatus(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Logged in user changes the user to trainee",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.changeUser()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User will clickOn proceed button",
  "keyword": "And "
});
formatter.match({
  "location": "DashboardSteps.clickOnProceedButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User reviews comments and feedbacks in all the tabs",
  "keyword": "And "
});
formatter.match({
  "location": "TraineeReviewSteps.userReadsFeedback()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks on SUBMIT button",
  "keyword": "And "
});
formatter.match({
  "location": "IDPAwaitingResponseSteps.clickOnSubmitButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Logged in user changes the user to \"Cole, Eric\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.changeUser(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks on the trainee specific IDP request",
  "keyword": "And "
});
formatter.match({
  "location": "DashboardSteps.selectIncompleteIDPrequestOfTrainnee()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User marks all the fields as reviewed in all the tabs",
  "keyword": "And "
});
formatter.match({
  "location": "CoPrimaryMentorSteps.markReviewInAllTabs()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks on REVIEW AND TAKE ACTION button",
  "keyword": "And "
});
formatter.match({
  "location": "IDPAwaitingResponseSteps.takeAction()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks on REVIEWED button",
  "keyword": "And "
});
formatter.match({
  "location": "CoPrimaryMentorSteps.clickOnReviewedButton()"
});
formatter.result({
  "status": "skipped"
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
  "name": "User will click on IDP Awaiting response button",
  "keyword": "And "
});
formatter.match({
  "location": "DashboardSteps.clickOnIDPAwaitingResponse()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks on the trainee specific IDP request",
  "keyword": "And "
});
formatter.match({
  "location": "DashboardSteps.selectIncompleteIDPrequestOfTrainnee()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User marks all the fields as reviewed in all the tabs",
  "keyword": "And "
});
formatter.match({
  "location": "CoPrimaryMentorSteps.markReviewInAllTabs()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks on REVIEW AND TAKE ACTION button",
  "keyword": "And "
});
formatter.match({
  "location": "IDPAwaitingResponseSteps.takeAction()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks on APPROVE AND SUBMIT button",
  "keyword": "And "
});
formatter.match({
  "location": "CoPrimaryMentorSteps.clickOnApproveAndSubmitButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks on Yes button",
  "keyword": "And "
});
formatter.match({
  "location": "CoPrimaryMentorSteps.clickOnYesButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Logged in user changes the user to trainee",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.changeUser()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks on VERIFY MEETING button",
  "keyword": "And "
});
formatter.match({
  "location": "DashboardSteps.clickOnVerifyMeetingButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks on Verify meeting and accept IDP button",
  "keyword": "And "
});
formatter.match({
  "location": "DashboardSteps.verifyMeetingAndAccept()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User enters meeting date and submits",
  "keyword": "And "
});
formatter.match({
  "location": "DashboardSteps.enterMeetingDate()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Logged in user changes the user to \"Berzofsky,Jay\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.changeUser(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User will click on IDP Awaiting response button",
  "keyword": "And "
});
formatter.match({
  "location": "DashboardSteps.clickOnIDPAwaitingResponse()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks on proceed button of the trainee specific IDP request",
  "keyword": "And "
});
formatter.match({
  "location": "DashboardSteps.clickProceedbuttonOfTrainee()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks on Verify meeting and accept IDP button",
  "keyword": "And "
});
formatter.match({
  "location": "DashboardSteps.verifyMeetingAndAccept()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User enters meeting date and submits and waits for home queue",
  "keyword": "And "
});
formatter.match({
  "location": "DashboardSteps.enterMeetingDateAndWaitForHomeQueue()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Logged in user changes the user to \"Lipkowitz,Stan\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.changeUser(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User will click on IDP Awaiting response button",
  "keyword": "And "
});
formatter.match({
  "location": "DashboardSteps.clickOnIDPAwaitingResponse()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks on the trainee specific IDP request",
  "keyword": "And "
});
formatter.match({
  "location": "DashboardSteps.selectIncompleteIDPrequestOfTrainnee()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User marks all the fields as reviewed in all the tabs",
  "keyword": "And "
});
formatter.match({
  "location": "CoPrimaryMentorSteps.markReviewInAllTabs()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks on REVIEW AND TAKE ACTION button",
  "keyword": "And "
});
formatter.match({
  "location": "IDPAwaitingResponseSteps.takeAction()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks on APPROVE IDP button",
  "keyword": "And "
});
formatter.match({
  "location": "CoPrimaryMentorSteps.approveIDP()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks on yes button on trainee page",
  "keyword": "And "
});
formatter.match({
  "location": "DashboardSteps.clickYesButtonOnTrainee()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});