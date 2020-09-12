$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/ServiceNow/COVIDCode/Features/ServicePortalSurvey.feature");
formatter.feature({
  "name": "Volunteer Survey",
  "description": "  Description: Volunteer Survery scenarios including both Service Portal and Native View",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Volunteer Survey Self Submission - Service Portal",
  "description": "",
  "keyword": "Scenario Outline",
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
formatter.step({
  "name": "a user is on the COVIDCode home page",
  "keyword": "Given "
});
formatter.step({
  "name": "selects the option to Volunteer",
  "keyword": "And "
});
formatter.step({
  "name": "the \"COVIDcode Volunteer Survey\" page displays with the option to start the survey",
  "keyword": "Then "
});
formatter.step({
  "name": "starting the survey",
  "keyword": "When "
});
formatter.step({
  "name": "the user selects option to fill out the survery for themselves",
  "keyword": "And "
});
formatter.step({
  "name": "the question \"Have you tested positive for\" populates",
  "keyword": "Then "
});
formatter.step({
  "name": "\"\u003cHaveYouTestedPositive\u003e\" option is selected",
  "keyword": "When "
});
formatter.step({
  "name": "the question \"How was the sample taken?\" displays",
  "keyword": "Then "
});
formatter.step({
  "name": "\"\u003csampleTypeTaken\u003e\" sample taken is selected",
  "keyword": "When "
});
formatter.step({
  "name": "selecting \"Rapid testing (up to 2 hour turnaround)\" checkbox",
  "keyword": "And "
});
formatter.step({
  "name": "\"\u003ccanYouProvideAcopyOfTest\u003e\" option is selected for being able to provide a copy of test report",
  "keyword": "And "
});
formatter.step({
  "name": "\"\u003cwereYouHospitalized\u003e\" option is selected for being hospitalized",
  "keyword": "And "
});
formatter.step({
  "name": "clicking next",
  "keyword": "When "
});
formatter.step({
  "name": "the \"Contact Information \" displays where the user is able to enter their contact information",
  "keyword": "Then "
});
formatter.step({
  "name": "entering required information",
  "keyword": "When "
});
formatter.step({
  "name": "clicking next to proceed",
  "keyword": "And "
});
formatter.step({
  "name": "the \"How did you hear about us? \" page displays with a question regarding the discovery of the survey",
  "keyword": "Then "
});
formatter.step({
  "name": "\"\u003chowDidYouFindOutAboutTheStudy\u003e\" option is selected for finding out about the study",
  "keyword": "And "
});
formatter.step({
  "name": "clicking Submit",
  "keyword": "And "
});
formatter.step({
  "name": "the \"Your survey has been submitted successfully!\" page displays",
  "keyword": "Then "
});
formatter.step({
  "name": "the user is able to see a message \"If you have any questions, please feel free to email us at covidcode@mail.nih.gov\"",
  "keyword": "And "
});
formatter.step({
  "name": "the user selects OK",
  "keyword": "When "
});
formatter.step({
  "name": "the user is prompted back to the COVIDCode Study Home Page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "HaveYouTestedPositive",
        "sampleTypeTaken",
        "canYouProvideAcopyOfTest",
        "wereYouHospitalized",
        "howDidYouFindOutAboutTheStudy"
      ]
    },
    {
      "cells": [
        "Yes",
        "Saliva",
        "Yes",
        "No",
        "I prefer not to answer"
      ]
    },
    {
      "cells": [
        "Yes",
        "Blood draw",
        "No",
        "Yes",
        "ClinicalTrials.gov"
      ]
    },
    {
      "cells": [
        "Yes",
        "Nasal or throat swab",
        "No",
        "No",
        "COVID-19 prevention website"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Volunteer Survey Self Submission - Service Portal",
  "description": "",
  "keyword": "Scenario Outline",
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
formatter.write("2020-09-11 21:28:11: Screenshot: ");
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
  "name": "\"Yes\" option is selected",
  "keyword": "When "
});
formatter.match({
  "location": "ServicePortalSurveySteps.option_is_selected(String)"
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
  "name": "\"Saliva\" sample taken is selected",
  "keyword": "When "
});
formatter.match({
  "location": "ServicePortalSurveySteps.sample_taken_is_selected(String)"
});
formatter.write("2020-09-11 21:28:13: Screenshot: ");
formatter.embedding("image/png", "embedded1.png");
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
formatter.write("2020-09-11 21:28:13: Screenshot: ");
formatter.embedding("image/png", "embedded2.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"Yes\" option is selected for being able to provide a copy of test report",
  "keyword": "And "
});
formatter.match({
  "location": "ServicePortalSurveySteps.option_is_selected_for_being_able_to_provide_a_copy_of_test_report(String)"
});
formatter.write("2020-09-11 21:28:14: Screenshot: ");
formatter.embedding("image/png", "embedded3.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"No\" option is selected for being hospitalized",
  "keyword": "And "
});
formatter.match({
  "location": "ServicePortalSurveySteps.option_is_selected_for_being_hospitalized(String)"
});
formatter.write("2020-09-11 21:28:14: Screenshot: ");
formatter.embedding("image/png", "embedded4.png");
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
formatter.write("2020-09-11 21:28:15: Screenshot: ");
formatter.embedding("image/png", "embedded5.png");
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
  "name": "\"I prefer not to answer\" option is selected for finding out about the study",
  "keyword": "And "
});
formatter.match({
  "location": "ServicePortalSurveySteps.option_is_selected_for_finding_out_about_the_study(String)"
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
formatter.write("2020-09-11 21:28:18: Screenshot: ");
formatter.embedding("image/png", "embedded6.png");
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
formatter.write("2020-09-11 21:28:18: Screenshot: ");
formatter.embedding("image/png", "embedded7.png");
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
formatter.scenario({
  "name": "Volunteer Survey Self Submission - Service Portal",
  "description": "",
  "keyword": "Scenario Outline",
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
formatter.write("2020-09-11 21:28:34: Screenshot: ");
formatter.embedding("image/png", "embedded8.png");
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
  "name": "\"Yes\" option is selected",
  "keyword": "When "
});
formatter.match({
  "location": "ServicePortalSurveySteps.option_is_selected(String)"
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
  "name": "\"Blood draw\" sample taken is selected",
  "keyword": "When "
});
formatter.match({
  "location": "ServicePortalSurveySteps.sample_taken_is_selected(String)"
});
formatter.write("2020-09-11 21:28:36: Screenshot: ");
formatter.embedding("image/png", "embedded9.png");
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
formatter.write("2020-09-11 21:28:37: Screenshot: ");
formatter.embedding("image/png", "embedded10.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"No\" option is selected for being able to provide a copy of test report",
  "keyword": "And "
});
formatter.match({
  "location": "ServicePortalSurveySteps.option_is_selected_for_being_able_to_provide_a_copy_of_test_report(String)"
});
formatter.write("2020-09-11 21:28:37: Screenshot: ");
formatter.embedding("image/png", "embedded11.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"Yes\" option is selected for being hospitalized",
  "keyword": "And "
});
formatter.match({
  "location": "ServicePortalSurveySteps.option_is_selected_for_being_hospitalized(String)"
});
formatter.write("2020-09-11 21:28:37: Screenshot: ");
formatter.embedding("image/png", "embedded12.png");
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
formatter.write("2020-09-11 21:28:38: Screenshot: ");
formatter.embedding("image/png", "embedded13.png");
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
  "name": "\"ClinicalTrials.gov\" option is selected for finding out about the study",
  "keyword": "And "
});
formatter.match({
  "location": "ServicePortalSurveySteps.option_is_selected_for_finding_out_about_the_study(String)"
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
formatter.write("2020-09-11 21:28:41: Screenshot: ");
formatter.embedding("image/png", "embedded14.png");
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
formatter.write("2020-09-11 21:28:41: Screenshot: ");
formatter.embedding("image/png", "embedded15.png");
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
formatter.scenario({
  "name": "Volunteer Survey Self Submission - Service Portal",
  "description": "",
  "keyword": "Scenario Outline",
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
formatter.write("2020-09-11 21:28:57: Screenshot: ");
formatter.embedding("image/png", "embedded16.png");
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
  "name": "\"Yes\" option is selected",
  "keyword": "When "
});
formatter.match({
  "location": "ServicePortalSurveySteps.option_is_selected(String)"
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
  "name": "\"Nasal or throat swab\" sample taken is selected",
  "keyword": "When "
});
formatter.match({
  "location": "ServicePortalSurveySteps.sample_taken_is_selected(String)"
});
formatter.write("2020-09-11 21:28:59: Screenshot: ");
formatter.embedding("image/png", "embedded17.png");
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
formatter.write("2020-09-11 21:28:59: Screenshot: ");
formatter.embedding("image/png", "embedded18.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"No\" option is selected for being able to provide a copy of test report",
  "keyword": "And "
});
formatter.match({
  "location": "ServicePortalSurveySteps.option_is_selected_for_being_able_to_provide_a_copy_of_test_report(String)"
});
formatter.write("2020-09-11 21:29:00: Screenshot: ");
formatter.embedding("image/png", "embedded19.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"No\" option is selected for being hospitalized",
  "keyword": "And "
});
formatter.match({
  "location": "ServicePortalSurveySteps.option_is_selected_for_being_hospitalized(String)"
});
formatter.write("2020-09-11 21:29:00: Screenshot: ");
formatter.embedding("image/png", "embedded20.png");
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
formatter.write("2020-09-11 21:29:01: Screenshot: ");
formatter.embedding("image/png", "embedded21.png");
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
  "name": "\"COVID-19 prevention website\" option is selected for finding out about the study",
  "keyword": "And "
});
formatter.match({
  "location": "ServicePortalSurveySteps.option_is_selected_for_finding_out_about_the_study(String)"
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
formatter.write("2020-09-11 21:29:04: Screenshot: ");
formatter.embedding("image/png", "embedded22.png");
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
formatter.write("2020-09-11 21:29:04: Screenshot: ");
formatter.embedding("image/png", "embedded23.png");
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