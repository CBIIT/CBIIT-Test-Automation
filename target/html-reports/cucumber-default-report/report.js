$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/AnalysisTools/PLCO/Features/BrowsePhenotype.feature");
formatter.feature({
  "name": "Browse Phenotype",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User on Browse Phenotype Tab",
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
  "name": "user clicks browse phenotype tab",
  "keyword": "When "
});
formatter.match({
  "location": "BrowsePhenotypeSteps.user_clicks_browse_phenotype_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "browse phenotype page displays \"Please select a phenotype\"",
  "keyword": "Then "
});
formatter.match({
  "location": "BrowsePhenotypeSteps.browse_phenotype_page_displays(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});