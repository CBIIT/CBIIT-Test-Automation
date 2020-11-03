$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/ServiceNow/CICDBuild/Features/CICDDevOps.feature");
formatter.feature({
  "name": "CICD_Dev_Ops Automated Build Deployment",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "CICD DevOps UpdateSet Automated Build Deployment",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@CICD_Dev_Ops_UpdateSet_Build"
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
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selects \"UpdateSet\" as the deployment type",
  "keyword": "And "
});
formatter.match({
  "location": "DevOpsApplicationBuildSteps.selects_as_the_deployment_type(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selecting sets that contain \"CICD_Dev_Ops_in_progress\" and moving them to the right side table",
  "keyword": "When "
});
formatter.match({
  "location": "DevOpsApplicationBuildSteps.selecting_sets_that_contain_and_moving_them_to_the_right_side_table(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "build is able to be executed successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "DevOpsApplicationBuildSteps.build_is_able_to_be_executed_successfully()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});