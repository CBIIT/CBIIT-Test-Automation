$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/ServiceNow/COVIDCode/Features/SignOutVerification.feature");
formatter.feature({
  "name": "Sign Out Verification",
  "description": "This feature file will verify that the user can log out properly",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Test_Case_COVID-245"
    },
    {
      "name": "@User_Story_COVID-261"
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
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "is on the home page",
  "keyword": "And "
});
formatter.match({
  "location": "SignOutVerificationSteps.is_on_the_home_page()"
});
formatter.write("2020-11-02 16:54:59: Screenshot: ");
formatter.embedding("image/png", "embedded2.png");
formatter.result({
  "status": "passed"
});
formatter.step({
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
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});