<<<<<<< HEAD
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/AnalysisTools/PLCO/Features/APIAcess.feature");
formatter.feature({
  "name": "API Acess Page",
=======
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/ServiceNow/DevOpsAutomatedBuilds/Features/CICDDevOps.feature");
formatter.feature({
  "name": "CICD_Dev_Ops Automated Build Deployment",
>>>>>>> origin/master
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
<<<<<<< HEAD
  "name": "User navigates to API Acess page",
=======
  "name": "CICD_Dev_Ops UpdateSet Automated Build Deployment",
>>>>>>> origin/master
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
<<<<<<< HEAD
      "name": "@Smoke"
=======
      "name": "@DevOpsCICDInProgressBuild"
>>>>>>> origin/master
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
<<<<<<< HEAD
  "name": "user on PLCO homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "ExploreGWASSteps.user_on_PLCO_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects API Acess tab",
  "keyword": "When "
});
formatter.match({
  "location": "APIAcessSteps.user_selects_API_Acess_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "API Acess page displays",
  "keyword": "Then "
});
formatter.match({
  "location": "APIAcessSteps.api_Acess_page_displays()"
});
formatter.write("2020-11-03 10:41:09: Screenshot: ");
formatter.embedding("image/png", "embedded0.png");
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "User views API Acess Page heading",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user on PLCO homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "ExploreGWASSteps.user_on_PLCO_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects API Acess tab",
  "keyword": "When "
});
formatter.match({
  "location": "APIAcessSteps.user_selects_API_Acess_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "API Acess page displays \"API Access\" heading",
  "keyword": "Then "
});
formatter.match({
  "location": "APIAcessSteps.api_Acess_page_displays_heading(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/java/AnalysisTools/PLCO/Features/ExploreGWAS.feature");
formatter.feature({
  "name": "Explore GWAS",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User generates BMI Manhattan Plot for East Asian All",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user on PLCO homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "ExploreGWASSteps.user_on_PLCO_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects explore GWAS",
  "keyword": "When "
});
formatter.match({
  "location": "ExploreGWASSteps.user_selects_explore_GWAS()"
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
>>>>>>> origin/master
});
formatter.result({
  "status": "passed"
});
formatter.step({
<<<<<<< HEAD
  "name": "selects phenotype as BMI at baseline",
  "keyword": "And "
});
formatter.match({
  "location": "ExploreGWASSteps.selects_phenotype_as_BMI_at_baseline()"
=======
  "name": "selects \"UpdateSet\" as the deployment type",
  "keyword": "And "
});
formatter.match({
  "location": "DevOpsApplicationBuildSteps.selects_as_the_deployment_type(String)"
>>>>>>> origin/master
});
formatter.result({
  "status": "passed"
});
formatter.step({
<<<<<<< HEAD
  "name": "selects ancestry as east asian all",
  "keyword": "And "
});
formatter.match({
  "location": "ExploreGWASSteps.selects_ancestry_as_east_asian_all()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks submit",
  "keyword": "And "
});
formatter.match({
  "location": "ExploreGWASSteps.clicks_submit()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Manhattan Plot displays",
  "keyword": "Then "
});
formatter.match({
  "location": "ExploreGWASSteps.Manhattan_Plot_displays()"
=======
  "name": "selecting sets that contain \"CICD_Dev_Ops_in_progress\" and moving them to the right side table",
  "keyword": "When "
});
formatter.match({
  "location": "DevOpsApplicationBuildSteps.selecting_sets_that_contain_and_moving_them_to_the_right_side_table(String)"
>>>>>>> origin/master
});
formatter.write("2020-11-03 10:41:24: Screenshot: ");
formatter.embedding("image/png", "embedded1.png");
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});