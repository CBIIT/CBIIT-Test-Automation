$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/ServiceNow/COVIDCode/Features/NativeViewScenarios.feature");
formatter.feature({
  "name": "Native View Scenarios",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.scenario({
  "name": "COVIDcode Study nurse with an Admin role is able to submit an Enrollment Questionnaire in Native View",
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
  "name": "a COVIDcode Study nurse with an Admin role has logged in to the COVIDcode Study Native View application",
  "keyword": "Given "
});
formatter.match({
  "location": "NativeViewEQSubmissionSteps.a_COVIDcode_Study_nurse_with_an_Admin_role_has_logged_in_to_the_COVIDcode_Study_Native_View_application()"
});
formatter.write("2020-10-28 18:35:08: Screenshot: ");
formatter.embedding("image/png", "embedded0.png");
formatter.write("2020-10-28 18:35:11: Screenshot: ");
formatter.embedding("image/png", "embedded1.png");
formatter.write("2020-10-28 18:35:18: Screenshot: ");
formatter.embedding("image/png", "embedded2.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "is on the COVIDcode Enrollments page",
  "keyword": "And "
});
formatter.match({
  "location": "NativeViewEQSubmissionSteps.is_on_the_COVIDcode_Enrollments_page()"
});
formatter.write("2020-10-28 18:35:27: Screenshot: ");
formatter.embedding("image/png", "embedded3.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the COVIDcode Study nurse begins an Enrollment Questionnaire for a \"Group 1\" user who consents \"Yes\" to join the study",
  "keyword": "When "
});
formatter.match({
  "location": "NativeViewEQSubmissionSteps.the_COVIDcode_Study_nurse_begins_an_Enrollment_Questionnaire_for_a_user_who_consents_to_join_the_study(String,String)"
});
formatter.write("2020-10-28 18:35:31: Screenshot: ");
formatter.embedding("image/png", "embedded4.png");
formatter.write("2020-10-28 18:35:33: Screenshot: ");
formatter.embedding("image/png", "embedded5.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "fills out the Enrollment Questionnaire by entering all required information including Demographics, Symptomology, and Exposures and Risk Factors",
  "keyword": "And "
});
formatter.match({
  "location": "NativeViewEQSubmissionSteps.fills_out_the_Enrollment_Questionnaire_by_entering_all_required_information_including_Demographics_Symptomology_and_Exposures_and_Risk_Factors()"
});
formatter.write("2020-10-28 18:35:40: Screenshot: ");
formatter.embedding("image/png", "embedded6.png");
formatter.write("2020-10-28 18:35:41: Screenshot: ");
formatter.embedding("image/png", "embedded7.png");
formatter.write("2020-10-28 18:35:41: Screenshot: ");
formatter.embedding("image/png", "embedded8.png");
formatter.write("2020-10-28 18:35:42: Screenshot: ");
formatter.embedding("image/png", "embedded9.png");
formatter.write("2020-10-28 18:35:42: Screenshot: ");
formatter.embedding("image/png", "embedded10.png");
formatter.write("2020-10-28 18:35:43: Screenshot: ");
formatter.embedding("image/png", "embedded11.png");
formatter.write("2020-10-28 18:35:43: Screenshot: ");
formatter.embedding("image/png", "embedded12.png");
formatter.write("2020-10-28 18:35:45: Screenshot: ");
formatter.embedding("image/png", "embedded13.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "submits the Enrollment Questionnaire",
  "keyword": "And "
});
formatter.match({
  "location": "NativeViewEQSubmissionSteps.submits_the_Enrollment_Questionnaire()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the Enrollment Questionnaire should be successfully submitted",
  "keyword": "Then "
});
formatter.match({
  "location": "NativeViewEQSubmissionSteps.the_Enrollment_Questionnaire_should_be_successfully_submitted()"
});
formatter.write("2020-10-28 18:35:48: Screenshot: ");
formatter.embedding("image/png", "embedded14.png");
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/java/ServiceNow/COVIDCode/Features/ServicePortalEQSubmission.feature");
formatter.feature({
  "name": "Service Portal Enrollment Questionnaire Submissions",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "COVIDcode Study Provider Enrollment Questionnaire Submission Group 1 User",
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
  "name": "a COVIDcode Study Provider user has logged in to the COVIDcode Study application",
  "keyword": "Given "
});
formatter.match({
  "location": "ServicePortalEQSubmissionsSteps.a_COVIDcode_Study_Provider_user_has_logged_in_to_the_COVIDcode_Study_application()"
});
formatter.write("2020-10-28 18:35:58: Screenshot: ");
formatter.embedding("image/png", "embedded15.png");
formatter.write("2020-10-28 18:35:58: Screenshot: ");
formatter.embedding("image/png", "embedded16.png");
formatter.write("2020-10-28 18:36:04: Screenshot: ");
formatter.embedding("image/png", "embedded17.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the COVIDcode Study Provider fills out an Enrollment Questionnaire for a \"Group 1\" who says \"Yes\" to join the study",
  "keyword": "When "
});
formatter.match({
  "location": "ServicePortalEQSubmissionsSteps.the_COVIDcode_Study_Provider_fills_out_an_Enrollment_Questionnaire_for_a_who_says_to_join_the_study(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enters users full name, required information, and demographics information",
  "keyword": "And "
});
formatter.match({
  "location": "ServicePortalEQSubmissionsSteps.enters_users_full_name_required_information_and_demographics_information()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "does not enter Disease Course and Exposures and Risk Factors information",
  "keyword": "But "
});
formatter.match({
  "location": "ServicePortalEQSubmissionsSteps.does_not_enter_Disease_Course_and_Exposures_and_Risk_Factors_information()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Submits the enrollment questionnaire",
  "keyword": "And "
});
formatter.match({
  "location": "ServicePortalEQSubmissionsSteps.submits_the_enrollment_questionnaire()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the enrollment questionnaire should be successfully submitted",
  "keyword": "Then "
});
formatter.match({
  "location": "ServicePortalEQSubmissionsSteps.the_enrollment_questionnaire_should_be_successfully_submitted()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/java/ServiceNow/COVIDCode/Features/ServicePortalLogin.feature");
formatter.feature({
  "name": "COVIDcode Study Provider Service Portal Login Scenarios",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "a COVIDcode Study Provider user is on the COVIDcode study homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "COVIDCodeLoginSteps.a_COVIDcode_Study_Provider_user_is_on_the_COVIDcode_study_homepage()"
});
formatter.write("2020-10-28 18:36:21: Screenshot: ");
formatter.embedding("image/png", "embedded18.png");
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "COVIDcode Study Provider Login when clicking \u0027Access and complete questionnaire\u0027 button and verifies expected header text",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "the COVIDcode Study Provider user logs in by clicking Access and complete questionnaire button",
  "keyword": "When "
});
formatter.match({
  "location": "COVIDCodeLoginSteps.the_COVIDcode_Study_Provider_user_logs_in_by_clicking_Access_and_complete_questionnaire_button()"
});
formatter.write("2020-10-28 18:36:22: Screenshot: ");
formatter.embedding("image/png", "embedded19.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the COVIDcode Study Provider user should see the COVIDcode Enrollment Questionnaire",
  "keyword": "Then "
});
formatter.match({
  "location": "COVIDCodeLoginSteps.the_COVIDcode_Study_Provider_user_should_see_the_COVIDcode_Enrollment_Questionnaire()"
});
formatter.write("2020-10-28 18:36:34: Screenshot: ");
formatter.embedding("image/png", "embedded20.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the Study Provider user sees the header text \"Please fill out each data element to the best of your abilities. If you do not know the answer to a question, select “Don’t know”,  do not leave it blank. Some fields are required and denoted by an asterisk. If you have any questions about completing this survey, please contact the study team at covidcode@mail.nih.gov or (240) 274-6777.\"",
  "keyword": "And "
});
formatter.match({
  "location": "COVIDCodeLoginSteps.the_COVIDcode_Study_Provider_user_sees_the_header_text(String)"
});
formatter.write("2020-10-28 18:36:35: Screenshot: ");
formatter.embedding("image/png", "embedded21.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the Study Provider also sees contact email and phone number as \"covidcode@mail.nih.gov or (240) 274-6777.\"",
  "keyword": "And "
});
formatter.match({
  "location": "COVIDCodeLoginSteps.the_COVIDcode_Study_Provider_also_sees_contact_email_and_phone_number_as(String)"
});
formatter.write("2020-10-28 18:36:35: Screenshot: ");
formatter.embedding("image/png", "embedded22.png");
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "a COVIDcode Study Provider user is on the COVIDcode study homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "COVIDCodeLoginSteps.a_COVIDcode_Study_Provider_user_is_on_the_COVIDcode_study_homepage()"
});
formatter.write("2020-10-28 18:36:44: Screenshot: ");
formatter.embedding("image/png", "embedded23.png");
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "COVIDcode Study Provider Login when clicking \u0027Log In\u0027 button and verifies expected header text",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "the COVIDcode Study Provider user logs in by clicking Log In button",
  "keyword": "When "
});
formatter.match({
  "location": "COVIDCodeLoginSteps.the_COVIDcode_Study_Provider_user_logs_in_by_clicking_Log_In_button()"
});
formatter.write("2020-10-28 18:36:45: Screenshot: ");
formatter.embedding("image/png", "embedded24.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the COVIDcode Study Provider user should see the COVIDcode Enrollment Questionnaire",
  "keyword": "Then "
});
formatter.match({
  "location": "COVIDCodeLoginSteps.the_COVIDcode_Study_Provider_user_should_see_the_COVIDcode_Enrollment_Questionnaire()"
});
formatter.write("2020-10-28 18:36:52: Screenshot: ");
formatter.embedding("image/png", "embedded25.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the Study Provider user sees the header text \"Please fill out each data element to the best of your abilities. If you do not know the answer to a question, select “Don’t know”,  do not leave it blank. Some fields are required and denoted by an asterisk. If you have any questions about completing this survey, please contact the study team at covidcode@mail.nih.gov or (240) 274-6777.\"",
  "keyword": "And "
});
formatter.match({
  "location": "COVIDCodeLoginSteps.the_COVIDcode_Study_Provider_user_sees_the_header_text(String)"
});
formatter.write("2020-10-28 18:36:53: Screenshot: ");
formatter.embedding("image/png", "embedded26.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the Study Provider also sees contact email and phone number as \"covidcode@mail.nih.gov or (240) 274-6777.\"",
  "keyword": "And "
});
formatter.match({
  "location": "COVIDCodeLoginSteps.the_COVIDcode_Study_Provider_also_sees_contact_email_and_phone_number_as(String)"
});
formatter.write("2020-10-28 18:36:54: Screenshot: ");
formatter.embedding("image/png", "embedded27.png");
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/java/ServiceNow/COVIDCode/Features/ServicePortalSurvey.feature");
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
      "name": "@Smoke"
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
formatter.write("2020-10-28 18:37:04: Screenshot: ");
formatter.embedding("image/png", "embedded28.png");
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
formatter.write("2020-10-28 18:37:07: Screenshot: ");
formatter.embedding("image/png", "embedded29.png");
formatter.write("2020-10-28 18:37:07: Screenshot: ");
formatter.embedding("image/png", "embedded30.png");
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
formatter.write("2020-10-28 18:37:11: Screenshot: ");
formatter.embedding("image/png", "embedded31.png");
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
formatter.write("2020-10-28 18:37:11: Screenshot: ");
formatter.embedding("image/png", "embedded32.png");
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
formatter.write("2020-10-28 18:37:12: Screenshot: ");
formatter.embedding("image/png", "embedded33.png");
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
formatter.write("2020-10-28 18:37:12: Screenshot: ");
formatter.embedding("image/png", "embedded34.png");
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
formatter.write("2020-10-28 18:37:13: Screenshot: ");
formatter.embedding("image/png", "embedded35.png");
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
formatter.write("2020-10-28 18:37:16: Screenshot: ");
formatter.embedding("image/png", "embedded36.png");
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
formatter.write("2020-10-28 18:37:16: Screenshot: ");
formatter.embedding("image/png", "embedded37.png");
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
      "name": "@Smoke"
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
      "name": "@Smoke"
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
formatter.write("2020-10-28 18:37:32: Screenshot: ");
formatter.embedding("image/png", "embedded38.png");
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
formatter.write("2020-10-28 18:37:34: Screenshot: ");
formatter.embedding("image/png", "embedded39.png");
formatter.write("2020-10-28 18:37:35: Screenshot: ");
formatter.embedding("image/png", "embedded40.png");
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
formatter.write("2020-10-28 18:37:38: Screenshot: ");
formatter.embedding("image/png", "embedded41.png");
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
formatter.write("2020-10-28 18:37:39: Screenshot: ");
formatter.embedding("image/png", "embedded42.png");
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
formatter.write("2020-10-28 18:37:39: Screenshot: ");
formatter.embedding("image/png", "embedded43.png");
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
formatter.write("2020-10-28 18:37:40: Screenshot: ");
formatter.embedding("image/png", "embedded44.png");
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
formatter.write("2020-10-28 18:37:40: Screenshot: ");
formatter.embedding("image/png", "embedded45.png");
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
formatter.write("2020-10-28 18:37:43: Screenshot: ");
formatter.embedding("image/png", "embedded46.png");
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
formatter.write("2020-10-28 18:37:44: Screenshot: ");
formatter.embedding("image/png", "embedded47.png");
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
      "name": "@Smoke"
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
formatter.write("2020-10-28 18:38:02: Screenshot: ");
formatter.embedding("image/png", "embedded48.png");
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
formatter.write("2020-10-28 18:38:05: Screenshot: ");
formatter.embedding("image/png", "embedded49.png");
formatter.write("2020-10-28 18:38:05: Screenshot: ");
formatter.embedding("image/png", "embedded50.png");
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
formatter.write("2020-10-28 18:38:09: Screenshot: ");
formatter.embedding("image/png", "embedded51.png");
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
formatter.write("2020-10-28 18:38:09: Screenshot: ");
formatter.embedding("image/png", "embedded52.png");
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
formatter.write("2020-10-28 18:38:10: Screenshot: ");
formatter.embedding("image/png", "embedded53.png");
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
formatter.write("2020-10-28 18:38:10: Screenshot: ");
formatter.embedding("image/png", "embedded54.png");
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
formatter.write("2020-10-28 18:38:11: Screenshot: ");
formatter.embedding("image/png", "embedded55.png");
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
formatter.write("2020-10-28 18:38:14: Screenshot: ");
formatter.embedding("image/png", "embedded56.png");
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
formatter.write("2020-10-28 18:38:14: Screenshot: ");
formatter.embedding("image/png", "embedded57.png");
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
      "name": "@Smoke"
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
formatter.write("2020-10-28 18:38:35: Screenshot: ");
formatter.embedding("image/png", "embedded58.png");
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
formatter.write("2020-10-28 18:38:38: Screenshot: ");
formatter.embedding("image/png", "embedded59.png");
formatter.write("2020-10-28 18:38:38: Screenshot: ");
formatter.embedding("image/png", "embedded60.png");
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
formatter.write("2020-10-28 18:38:42: Screenshot: ");
formatter.embedding("image/png", "embedded61.png");
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
formatter.write("2020-10-28 18:38:42: Screenshot: ");
formatter.embedding("image/png", "embedded62.png");
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
formatter.write("2020-10-28 18:38:43: Screenshot: ");
formatter.embedding("image/png", "embedded63.png");
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
formatter.write("2020-10-28 18:38:43: Screenshot: ");
formatter.embedding("image/png", "embedded64.png");
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
formatter.write("2020-10-28 18:38:44: Screenshot: ");
formatter.embedding("image/png", "embedded65.png");
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
formatter.write("2020-10-28 18:38:47: Screenshot: ");
formatter.embedding("image/png", "embedded66.png");
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
formatter.write("2020-10-28 18:38:47: Screenshot: ");
formatter.embedding("image/png", "embedded67.png");
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
  "name": "Verifying Volunteer Survey Landing page wording",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Sprint9"
    },
    {
      "name": "@COVID-220"
    },
    {
      "name": "@Smoke"
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
formatter.write("2020-10-28 18:39:03: Screenshot: ");
formatter.embedding("image/png", "embedded68.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the following header displays \"WHY ARE WE DOING THIS STUDY?\" followed by a body description \"Coronavirus 2019 (COVID-19) is a serious public health problem.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "ServicePortalSurveySteps.the_following_header_displays_followed_by_a_body_description(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the header \"WHO CAN JOIN?\" with the body description as \"Anyone who has tested positive for SARS-CoV-2 infection may be eligible to join. We will use the clinical history and biological samples provided by participants for our analyses.\"",
  "keyword": "And "
});
formatter.match({
  "location": "ServicePortalSurveySteps.the_header_with_the_body_description_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "also the header \"Interested in volunteering?\" with the body description \"Fill out a COVID-19 Volunteer Survey to get started.\"",
  "keyword": "And "
});
formatter.match({
  "location": "ServicePortalSurveySteps.also_the_header_with_the_body_description(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "header \"WHAT IS INVOLVED IN THE STUDY?\" with the body description \"We will ask you to\"",
  "keyword": "And "
});
formatter.match({
  "location": "ServicePortalSurveySteps.header_with_the_body_description(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a statement \"Privacy and confidentiality are very important to us. All information shared with us will be anonymized. It is important to note that we intend for our study to benefit a large group of patients. In order to make this possible, we will be unable to return individual genetic results. We may recontact you for additional information over a period of a year after you have joined the study.\"",
  "keyword": "And "
});
formatter.match({
  "location": "ServicePortalSurveySteps.a_statement(String)"
});
formatter.write("2020-10-28 18:39:03: Screenshot: ");
formatter.embedding("image/png", "embedded69.png");
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verifying Survey Submitted data displays under the COVIDCode application - Native View",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Sprint9"
    },
    {
      "name": "@COVID-214"
    },
    {
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "a COVIDcode Study nurse with an Admin role has logged in to the COVIDcode Study Native View application",
  "keyword": "Given "
});
formatter.match({
  "location": "NativeViewEQSubmissionSteps.a_COVIDcode_Study_nurse_with_an_Admin_role_has_logged_in_to_the_COVIDcode_Study_Native_View_application()"
});
formatter.write("2020-10-28 18:39:11: Screenshot: ");
formatter.embedding("image/png", "embedded70.png");
formatter.write("2020-10-28 18:39:14: Screenshot: ");
formatter.embedding("image/png", "embedded71.png");
formatter.write("2020-10-28 18:39:20: Screenshot: ");
formatter.embedding("image/png", "embedded72.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "searching for \"COVIDcode volunteer surveys\" to view follow ups",
  "keyword": "When "
});
formatter.match({
  "location": "ServicePortalSurveySteps.searching_for_to_view_follow_ups(String)"
});
formatter.write("2020-10-28 18:39:30: Screenshot: ");
formatter.embedding("image/png", "embedded73.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicking on a submitted Survey Number",
  "keyword": "And "
});
formatter.match({
  "location": "ServicePortalSurveySteps.clicking_on_an_existing_follow_up_surverys_Group_ID()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "information submitted via the volunteer survey is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "ServicePortalSurveySteps.information_submitted_via_the_volunteer_survey_is_displayed()"
});
formatter.write("2020-10-28 18:39:39: Screenshot: ");
formatter.embedding("image/png", "embedded74.png");
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});