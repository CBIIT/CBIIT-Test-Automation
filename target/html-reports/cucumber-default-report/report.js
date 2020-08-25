$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/ServiceNow/COVIDCode/Features/FollowUpForm.feature");
formatter.feature({
  "name": "COVIDCode Follow Up Form Scenarios",
  "description": "Description: This feature file contains scenarios related to the Follow Up Form",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Follow Up Form - Verifying Enhanced Symptoms Question - Service Portal",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Sprint7"
    },
    {
      "name": "@COVID-193"
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
  "name": "a COVIDCode user is on the Follow Up Form to update an existing enrollment",
  "keyword": "Given "
});
formatter.match({
  "location": "FollowUpFormSteps.a_COVIDCode_user_is_on_the_Follow_Up_Form_to_update_an_existing_enrollment()"
});
formatter.write("2020-08-24 21:51:40: Screenshot: ");
formatter.embedding("image/png", "embedded0.png");
formatter.write("2020-08-24 21:51:42: Screenshot: ");
formatter.embedding("image/png", "embedded1.png");
formatter.write("2020-08-24 21:51:52: Screenshot: ");
formatter.embedding("image/png", "embedded2.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the Disease Course section to add information",
  "keyword": "When "
});
formatter.match({
  "location": "FollowUpFormSteps.the_user_is_on_the_Disease_Course_section_to_add_information()"
});
formatter.write("2020-08-24 21:51:56: Screenshot: ");
formatter.embedding("image/png", "embedded3.png");
formatter.write("2020-08-24 21:51:58: Screenshot: ");
formatter.embedding("image/png", "embedded4.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user is able to select multiple symptoms in the symptoms field",
  "keyword": "Then "
});
formatter.match({
  "location": "FollowUpFormSteps.the_user_is_able_to_select_multiple_symptoms_in_the_symptoms_field()"
});
formatter.write("2020-08-24 21:52:00: Screenshot: ");
formatter.embedding("image/png", "embedded5.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user selects \"None of the above\" after having selected multiple symptoms",
  "keyword": "When "
});
formatter.match({
  "location": "FollowUpFormSteps.the_user_selects_after_having_selected_multiple_symptoms(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user sees a pop up with the message \"Choosing None of the Above will clear the previously selected values, is that Ok?\"",
  "keyword": "Then "
});
formatter.match({
  "location": "FollowUpFormSteps.the_user_sees_a_pop_up_with_the_message(String)"
});
formatter.write("2020-08-24 21:52:01: Screenshot: ");
formatter.embedding("image/png", "embedded6.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user selects Yes",
  "keyword": "When "
});
formatter.match({
  "location": "FollowUpFormSteps.the_user_selects_Yes()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"None of the above\" option displays and replaces all previously selected symptoms",
  "keyword": "Then "
});
formatter.match({
  "location": "FollowUpFormSteps.option_displays_and_replaces_all_previously_selected_symptoms(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user attempts to add a symptom such as \"Cough\" after selecting \"None of the above\" option",
  "keyword": "When "
});
formatter.match({
  "location": "FollowUpFormSteps.the_user_attempts_to_add_a_symptom_such_as_after_selecting_option(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user sees another pop up with the message \"Choosing this symptom will result in previous options being removed, is that Ok?\"",
  "keyword": "Then "
});
formatter.match({
  "location": "FollowUpFormSteps.the_user_sees_another_pop_up_with_the_message(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user selects Yes",
  "keyword": "When "
});
formatter.match({
  "location": "FollowUpFormSteps.the_user_selects_Yes()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"Cough\" symptom is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "FollowUpFormSteps.symptom_is_displayed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selecting \"Don\u0027t know\" after having selected a symptoms",
  "keyword": "When "
});
formatter.match({
  "location": "FollowUpFormSteps.selecting_after_having_selected_a_symptoms(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user is able to see another pop up with the message \"Choosing Don\u0027t Know will clear the previously selected values, is that Ok?\"",
  "keyword": "Then "
});
formatter.match({
  "location": "FollowUpFormSteps.the_user_is_able_to_see_another_pop_up_with_the_message(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user selects Yes",
  "keyword": "When "
});
formatter.match({
  "location": "FollowUpFormSteps.the_user_selects_Yes()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"Don\u0027t know\" option displays",
  "keyword": "Then "
});
formatter.match({
  "location": "FollowUpFormSteps.option_displays(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});