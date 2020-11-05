$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/AnalysisTools/PLCO/Features/ExploreGWAS.feature");
formatter.feature({
  "name": "Explore GWAS",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User generates pairwise BMI Manhattan plot with top ancestry as east asian all and bottom ancestry as european all",
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
  "name": "selects top ancestry as east asian all",
  "keyword": "And "
});
formatter.match({
  "location": "ExploreGWASSteps.selects_top_ancestry_as_east_asian_all()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selects bottom ancestry as european all",
  "keyword": "And "
});
formatter.match({
  "location": "ExploreGWASSteps.selects_bottom_ancestry_as_european_all()"
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
formatter.write("2020-11-05 10:53:20: Screenshot: ");
formatter.embedding("image/png", "embedded0.png");
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});