$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/ServiceNow/CICDBuild/Features/CICDDevOps.feature");
formatter.feature({
  "name": "CICD_Dev_Ops Automated Build Deployment",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "CICD DevOps Application Automated Build Deployment",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@CICD_Dev_Ops_Application_Build"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "login to the CICD_Dev_Ops application in Native View is successful with username \"DevOpsUsername\" and password \"DevOpsPassword\"",
  "keyword": "Given "
});
formatter.match({
  "location": "DevOpsApplicationBuildSteps.login_to_the_CICD_Dev_Ops_application_in_Native_View_is_successful_with_username_and_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selecting the \"CICD_Dev_Ops\" application",
  "keyword": "When "
});
formatter.match({
  "location": "DevOpsApplicationBuildSteps.selecting_the_application(String)"
});
formatter.write("2020-11-12 21:51:00: Screenshot: ");
formatter.embedding("image/png", "embedded0.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selecting \"Application\" as the deployment type",
  "keyword": "And "
});
formatter.match({
  "location": "DevOpsApplicationBuildSteps.selecting_as_the_deployment_type(String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: Cannot locate option with value: Application\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027NCI-02134309-ML\u0027, ip: \u0027fe80:0:0:0:1055:8e0d:e612:a958%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.15.7\u0027, java.version: \u00271.8.0_271\u0027\nDriver info: driver.version: unknown\n\tat org.openqa.selenium.support.ui.Select.findOptionsByValue(Select.java:283)\n\tat org.openqa.selenium.support.ui.Select.selectByValue(Select.java:186)\n\tat com.nci.automation.web.CommonUtils.selectDropDownValue(CommonUtils.java:98)\n\tat ServiceNow.CICDBuild.StepsImplementation.DevOpsAutomatedBuildStepsImplementation.selectingApplicationAsDeploymentType(DevOpsAutomatedBuildStepsImplementation.java:57)\n\tat ServiceNow.CICDBuild.Steps.DevOpsApplicationBuildSteps.selecting_as_the_deployment_type(DevOpsApplicationBuildSteps.java:31)\n\tat ✽.selecting \"Application\" as the deployment type(file:src/test/java/ServiceNow/CICDBuild/Features/CICDDevOps.feature:7)\n",
  "status": "failed"
});
formatter.step({
  "name": "build is able to be executed successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "DevOpsApplicationBuildSteps.build_is_able_to_be_executed_successfully()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});