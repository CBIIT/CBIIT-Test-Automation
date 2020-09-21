$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/ServiceNow/COVIDCode/Features/ServicePortalSurvey.feature");
formatter.feature({
  "name": "Volunteer Survey",
  "description": "  Description: Volunteer Survery scenarios including both Service Portal and Native View",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Volunteer Survey Self Submission_1 - Service Portal",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Sprint9"
    },
    {
      "name": "@COVID-109"
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
  "name": "a user is on the COVIDCode home page",
  "keyword": "Given "
});
formatter.match({
  "location": "ServicePortalSurveySteps.a_user_is_on_the_COVIDCode_home_page()"
});
formatter.write("2020-09-19 17:19:18: Screenshot: ");
formatter.embedding("image/png", "embedded0.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selects the option to Volunteer",
  "keyword": "And "
});
formatter.match({
  "location": "ServicePortalSurveySteps.selects_the_option_to_Volunteer()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the \"COVIDcode Volunteer Survey\" page displays with the option to start the survey",
  "keyword": "Then "
});
formatter.match({
  "location": "ServicePortalSurveySteps.the_page_displays_with_the_option_to_start_the_survey(String)"
});
formatter.write("2020-09-19 17:19:20: Screenshot: ");
formatter.embedding("image/png", "embedded1.png");
formatter.write("2020-09-19 17:19:20: Screenshot: ");
formatter.embedding("image/png", "embedded2.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "starting the survey",
  "keyword": "When "
});
formatter.match({
  "location": "ServicePortalSurveySteps.starting_the_survey()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user selects option to fill out the survery for themselves",
  "keyword": "And "
});
formatter.match({
  "location": "ServicePortalSurveySteps.the_user_selects_option_to_fill_out_the_survery_for_themselves()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the question \"Have you tested positive for\" populates",
  "keyword": "Then "
});
formatter.match({
  "location": "ServicePortalSurveySteps.populates(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selecting No",
  "keyword": "When "
});
formatter.match({
  "location": "ServicePortalSurveySteps.selecting_No()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the question \"How was the sample taken?\" displays",
  "keyword": "Then "
});
formatter.match({
  "location": "ServicePortalSurveySteps.the_question_displays(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selecting \"Nasal or throat swab\"",
  "keyword": "When "
});
formatter.match({
  "location": "ServicePortalSurveySteps.selecting(String)"
});
formatter.write("2020-09-19 17:19:25: Screenshot: ");
formatter.embedding("image/png", "embedded3.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selecting \"Rapid testing (up to 2 hour turnaround)\" checkbox",
  "keyword": "And "
});
formatter.match({
  "location": "ServicePortalSurveySteps.selecting_checkbox(String)"
});
formatter.write("2020-09-19 17:19:26: Screenshot: ");
formatter.embedding("image/png", "embedded4.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selecting No for being able to provide a copy of test report",
  "keyword": "And "
});
formatter.match({
  "location": "ServicePortalSurveySteps.selecting_No_for_being_able_to_provide_a_copy_of_test_report()"
});
formatter.write("2020-09-19 17:19:27: Screenshot: ");
formatter.embedding("image/png", "embedded5.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selecting No for for ever being hospitalized",
  "keyword": "And "
});
formatter.match({
  "location": "ServicePortalSurveySteps.selecting_No_for_for_ever_being_hospitalized()"
});
formatter.write("2020-09-19 17:19:29: Screenshot: ");
formatter.embedding("image/png", "embedded6.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicking next",
  "keyword": "When "
});
formatter.match({
  "location": "ServicePortalSurveySteps.clicking_next()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the \"Contact Information \" displays where the user is able to enter their contact information",
  "keyword": "Then "
});
formatter.match({
  "location": "ServicePortalSurveySteps.the_displays_where_the_user_is_able_to_enter_their_contact_information(String)"
});
formatter.write("2020-09-19 17:19:30: Screenshot: ");
formatter.embedding("image/png", "embedded7.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "entering required information",
  "keyword": "When "
});
formatter.match({
  "location": "ServicePortalSurveySteps.entering_required_information()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicking next to proceed",
  "keyword": "And "
});
formatter.match({
  "location": "ServicePortalSurveySteps.clicking_next_to_proceed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the \"How did you hear about us? \" page displays with a question regarding the discovery of the survey",
  "keyword": "Then "
});
formatter.match({
  "location": "ServicePortalSurveySteps.the_page_displays_with_a_question_regarding_the_discovery_of_the_survey(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selecting option \"I prefer not to answer\"",
  "keyword": "When "
});
formatter.match({
  "location": "ServicePortalSurveySteps.selecting_option(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicking Submit",
  "keyword": "And "
});
formatter.match({
  "location": "ServicePortalSurveySteps.clicking_Submit()"
});
formatter.write("2020-09-19 17:19:35: Screenshot: ");
formatter.embedding("image/png", "embedded8.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the \"Your survey has been submitted successfully!\" page displays",
  "keyword": "Then "
});
formatter.match({
  "location": "ServicePortalSurveySteps.the_page_displays(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user is able to see a message \"If you have any questions, please feel free to email us at covidcode@mail.nih.gov\"",
  "keyword": "And "
});
formatter.match({
  "location": "ServicePortalSurveySteps.the_user_is_able_to_see_a_message_followed_the_by_email_address(String)"
});
formatter.write("2020-09-19 17:19:36: Screenshot: ");
formatter.embedding("image/png", "embedded9.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user selects OK",
  "keyword": "When "
});
formatter.match({
  "location": "ServicePortalSurveySteps.the_user_selects_OK()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user is prompted back to the COVIDCode Study Home Page",
  "keyword": "Then "
});
formatter.match({
  "location": "ServicePortalSurveySteps.the_user_is_prompted_back_to_the_COVIDCode_Study_Home_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});