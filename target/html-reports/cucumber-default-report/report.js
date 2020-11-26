$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/AnalysisTools/PLCO/Features/ExploreGWAS.feature");
formatter.feature({
  "name": "Explore GWAS",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Loading Manhattan Plot Displays loading icon",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Progression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.beforestep({
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
formatter.beforestep({
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
formatter.beforestep({
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
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "selects ancestry as European Female",
  "keyword": "And "
});
formatter.match({
  "location": "ExploreGWASSteps.selects_ancestry_as_European_Female()"
});
formatter.result({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "clicks submit for results to load",
  "keyword": "Then "
});
formatter.match({
  "location": "ExploreGWASSteps.clicks_submit_for_results_to_load()"
});
formatter.write("2020-11-26 15:09:24: Screenshot: ");
formatter.embedding("image/png", "embedded0.png");
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});