$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/ServiceNow/CICDBuild/Features/MyCICDTestApp.feature");
formatter.feature({
  "name": "MyCICDTestApp Automated Build Deployment",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "CICD DevOps Application Automated Build Deployment",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@MyCICDTestApp_Application_Build"
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
  "name": "selecting the \"MyCICDTestApp\" application",
  "keyword": "When "
});
formatter.match({
  "location": "DevOpsApplicationBuildSteps.selecting_the_application(String)"
});
formatter.write("2020-11-03 17:21:36: Screenshot: ");
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
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});