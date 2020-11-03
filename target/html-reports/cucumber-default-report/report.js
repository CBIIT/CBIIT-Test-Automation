$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/AnalysisTools/PLCO/Features/ExploreGWAS.feature");
formatter.feature({
  "name": "Explore GWAS",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User generates Manhattan Plot with Pairwise Plot",
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
  "name": "selects Pairwise Plots",
  "keyword": "And "
});
formatter.match({
  "location": "ExploreGWASSteps.selects_Pairwise_Plots()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});