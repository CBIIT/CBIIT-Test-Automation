$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/ServiceNow/COVIDCode/Features/FollowUpForm.feature");
formatter.feature({
  "name": "COVIDCode Follow Up Form Scenarios",
  "description": "Description: This feature file contains scenarios related to the Follow Up Form",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Follow Up Form - Verifying \u0027Drug Treatments\u0027 section - Service Portal",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Sprint8"
    },
    {
      "name": "@COVID-116"
    },
    {
      "name": "@Progression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "a COVIDCode provider is on the Disease Course section on the Follow Up Form",
  "keyword": "When "
});
formatter.match({
  "location": "FollowUpFormSteps.a_COVIDCode_provider_is_on_the_Disease_Course_section_on_the_Follow_Up_Form()"
});
formatter.write("2020-09-12 00:03:38: Screenshot: ");
formatter.embedding("image/png", "embedded0.png");
formatter.write("2020-09-12 00:03:39: Screenshot: ");
formatter.embedding("image/png", "embedded1.png");
formatter.write("2020-09-12 00:03:48: Screenshot: ");
formatter.embedding("image/png", "embedded2.png");
formatter.write("2020-09-12 00:03:52: Screenshot: ");
formatter.embedding("image/png", "embedded3.png");
formatter.write("2020-09-12 00:03:54: Screenshot: ");
formatter.embedding("image/png", "embedded4.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"Drug Treatments\" section should display along with the values \"None\", \"Azithromycin\", \"Chloroquine\", \"Corticosteroids\", \"Hydroxycholoquine\", \"JAK Inhibitor\", \"Remdesivir\", \"Tocilizumab\", \"Other\"",
  "keyword": "Then "
});
formatter.match({
  "location": "FollowUpFormSteps.section_should_display_along_with_the_values(String,String,String,String,String,String,String,String,String,String)"
});
formatter.write("2020-09-12 00:04:01: Screenshot: ");
formatter.embedding("image/png", "embedded5.png");
formatter.write("2020-09-12 00:04:08: Screenshot: ");
formatter.embedding("image/png", "embedded6.png");
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});