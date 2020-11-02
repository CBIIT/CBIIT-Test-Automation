<<<<<<< HEAD
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/ServiceNow/COVIDCode/Features/SignOutVerification.feature");
formatter.feature({
  "name": "Sign Out Verification",
  "description": "This feature file will verify that the user can log out properly",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "",
=======
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/ServiceNow/DevOpsAutomatedBuilds/Features/CICDDevOps.feature");
formatter.feature({
  "name": "CICD_Dev_Ops Automated Build Deployment",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "CICD_Dev_Ops UpdateSet Automated Build Deployment",
>>>>>>> 43b116712bb97f25528753db61f93dc549c0d364
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
<<<<<<< HEAD
      "name": "@Test_Case_COVID-245"
    },
    {
      "name": "@User_Story_COVID-261"
    },
    {
      "name": "@Progression"
=======
      "name": "@DevOpsCICDInProgressBuild"
>>>>>>> 43b116712bb97f25528753db61f93dc549c0d364
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
<<<<<<< HEAD
  "name": "an internal user is logged into the COVIDcode application",
  "keyword": "Given "
});
formatter.match({
  "location": "SignOutVerificationSteps.an_internal_user_is_logged_into_the_COVIDcode_application()"
});
formatter.write("2020-11-02 16:54:53: Screenshot: ");
formatter.embedding("image/png", "embedded0.png");
formatter.write("2020-11-02 16:54:56: Screenshot: ");
formatter.embedding("image/png", "embedded1.png");
=======
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
>>>>>>> 43b116712bb97f25528753db61f93dc549c0d364
formatter.result({
  "status": "passed"
});
formatter.step({
<<<<<<< HEAD
  "name": "is on the home page",
  "keyword": "And "
});
formatter.match({
  "location": "SignOutVerificationSteps.is_on_the_home_page()"
});
formatter.write("2020-11-02 16:54:59: Screenshot: ");
formatter.embedding("image/png", "embedded2.png");
=======
  "name": "selects \"UpdateSet\" as the deployment type",
  "keyword": "And "
});
formatter.match({
  "location": "DevOpsApplicationBuildSteps.selects_as_the_deployment_type(String)"
});
>>>>>>> 43b116712bb97f25528753db61f93dc549c0d364
formatter.result({
  "status": "passed"
});
formatter.step({
<<<<<<< HEAD
  "name": "the internal user is able to sign out of the application by clicking on the Sign Out button",
  "keyword": "Then "
});
formatter.match({
  "location": "SignOutVerificationSteps.the_internal_user_is_able_to_sign_out_of_the_application_by_clicking_on_the_button()"
});
formatter.write("2020-11-02 16:55:01: Screenshot: ");
formatter.embedding("image/png", "embedded3.png");
formatter.write("2020-11-02 16:55:05: Screenshot: ");
formatter.embedding("image/png", "embedded4.png");
=======
  "name": "selecting sets that contain \"CICD_Dev_Ops_in_progress\" and moving them to the right side table",
  "keyword": "When "
});
formatter.match({
  "location": "DevOpsApplicationBuildSteps.selecting_sets_that_contain_and_moving_them_to_the_right_side_table(String)"
});
>>>>>>> 43b116712bb97f25528753db61f93dc549c0d364
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});