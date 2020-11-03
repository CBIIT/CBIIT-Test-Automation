$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/AnalysisTools/PLCO/Features/APIAcess.feature");
formatter.feature({
  "name": "API Acess Page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User navigates to API Acess page",
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
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selects phenotype as BMI at baseline",
  "keyword": "And "
});
formatter.match({
  "location": "ExploreGWASSteps.selects_phenotype_as_BMI_at_baseline()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
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