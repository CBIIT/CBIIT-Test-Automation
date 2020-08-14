$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/ServiceNow/COVIDDash/Features/Covid19Dashboard.feature");
formatter.feature({
  "name": "COVID Dashboard",
  "description": "  Description: This feature file tests COVIDDASH-7, 8, 20, 134, 135, 138, 136, 137, 140, 142, 143, 148",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Validating Study Submission without attaching a Related URL",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "a User has logged in to the NIH COVID-19 Biorepository Dashboard Application",
  "keyword": "Given "
});
formatter.match({
  "location": "COVIDHomePageSteps.a_User_has_logged_in_to_the_NIH_COVID_Biorepository_Dashboard_Application(Integer)"
});
formatter.write("2020-08-13 14:43:43: INFO: Environment: Test (https://service-test.nci.nih.gov/nih-covid-19-dashboard?xpage\u003dlanding_pub)");
formatter.write("2020-08-13 14:43:43: Screenshot: ");
formatter.embedding("image/png", "embedded0.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the User selects a Principal Investigator \"Diego Juarez\"",
  "keyword": "When "
});
formatter.match({
  "location": "COVIDHomePageSteps.the_User_selects_a_Principal_Investigator(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enters a unique IRB Protocol Number which can contain numbers and text such as \"77YXB33\"",
  "keyword": "And "
});
formatter.match({
  "location": "COVIDHomePageSteps.enters_a_unique_IRB_Protocol_Number_which_can_contain_numbers_and_text_such_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enters a Study Title as \"Automation Test\"",
  "keyword": "And "
});
formatter.match({
  "location": "COVIDHomePageSteps.enters_a_Study_Title_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selects any Biospecimen Type \"Other\" and enters Other type as \"Automation Test\"",
  "keyword": "And "
});
formatter.match({
  "location": "COVIDHomePageSteps.selects_any_Biospecimen_Type_than_enters_Other_type_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selects any Biospecimen Collection Frequency",
  "keyword": "And "
});
formatter.match({
  "location": "COVIDHomePageSteps.selects_any_Biospecimen_Collection_Frequency()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verifies that \"NCI Frederick\" text is displayed in the Repository Location text box",
  "keyword": "And "
});
formatter.match({
  "location": "COVIDHomePageSteps.verifies_that_text_is_displayed_in_the_Repository_Location_text_box(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enters Study Specific Aims \"Test Automation\"",
  "keyword": "And "
});
formatter.match({
  "location": "COVIDHomePageSteps.enters_Study_Specific_Aims(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "attaches an IRB Protocol Document",
  "keyword": "And "
});
formatter.match({
  "location": "COVIDHomePageSteps.attaches_an_IRB_Protocol_Document()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "does not attach a Related URL",
  "keyword": "And "
});
formatter.match({
  "location": "COVIDHomePageSteps.does_not_attach_a_Related_URL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the User is able to successfully submit the study \"77YXB33\"",
  "keyword": "Then "
});
formatter.match({
  "location": "COVIDHomePageSteps.the_User_is_able_to_successfully_submit_the_study(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Validating Study Submission with attaching multiple Related URL\u0027s",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "a User has logged in to the NIH COVID-19 Biorepository Dashboard Application",
  "keyword": "Given "
});
formatter.match({
  "location": "COVIDHomePageSteps.a_User_has_logged_in_to_the_NIH_COVID_Biorepository_Dashboard_Application(Integer)"
});
formatter.write("2020-08-13 14:44:24: INFO: Environment: Test (https://service-test.nci.nih.gov/nih-covid-19-dashboard?xpage\u003dlanding_pub)");
formatter.write("2020-08-13 14:44:24: Screenshot: ");
formatter.embedding("image/png", "embedded1.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the User selects a Principal Investigator \"Diego Juarez\"",
  "keyword": "When "
});
formatter.match({
  "location": "COVIDHomePageSteps.the_User_selects_a_Principal_Investigator(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enters a unique IRB Protocol Number which can contain numbers and text such as \"77DJ88\"",
  "keyword": "And "
});
formatter.match({
  "location": "COVIDHomePageSteps.enters_a_unique_IRB_Protocol_Number_which_can_contain_numbers_and_text_such_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enters a Study Title as \"Automation Test\"",
  "keyword": "And "
});
formatter.match({
  "location": "COVIDHomePageSteps.enters_a_Study_Title_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selects any Biospecimen Type \"Other\" and enters Other type as \"Automation Test\"",
  "keyword": "And "
});
formatter.match({
  "location": "COVIDHomePageSteps.selects_any_Biospecimen_Type_than_enters_Other_type_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selects any Biospecimen Collection Frequency",
  "keyword": "And "
});
formatter.match({
  "location": "COVIDHomePageSteps.selects_any_Biospecimen_Collection_Frequency()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verifies that \"NCI Frederick\" text is displayed in the Repository Location text box",
  "keyword": "And "
});
formatter.match({
  "location": "COVIDHomePageSteps.verifies_that_text_is_displayed_in_the_Repository_Location_text_box(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enters Study Specific Aims \"Test Automation\"",
  "keyword": "And "
});
formatter.match({
  "location": "COVIDHomePageSteps.enters_Study_Specific_Aims(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "attaches an IRB Protocol Document",
  "keyword": "And "
});
formatter.match({
  "location": "COVIDHomePageSteps.attaches_an_IRB_Protocol_Document()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "attaches multiple Related URL’s",
  "keyword": "And "
});
formatter.match({
  "location": "COVIDHomePageSteps.attaches_multiple_Related_URL_s()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the User is able to successfully submit the study \"77DJ88\"",
  "keyword": "Then "
});
formatter.match({
  "location": "COVIDHomePageSteps.the_User_is_able_to_successfully_submit_the_study(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verifying a user is not able to submit a study form when not attaching an IRB Protocol Document",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "a User has logged in to the NIH COVID-19 Biorepository Dashboard Application",
  "keyword": "Given "
});
formatter.match({
  "location": "COVIDHomePageSteps.a_User_has_logged_in_to_the_NIH_COVID_Biorepository_Dashboard_Application(Integer)"
});
formatter.write("2020-08-13 14:45:08: INFO: Environment: Test (https://service-test.nci.nih.gov/nih-covid-19-dashboard?xpage\u003dlanding_pub)");
formatter.write("2020-08-13 14:45:08: Screenshot: ");
formatter.embedding("image/png", "embedded2.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the User enters all required information",
  "keyword": "When "
});
formatter.match({
  "location": "COVIDHomePageSteps.the_User_enters_all_required_information()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "does not attach an IRB Protocol Document",
  "keyword": "But "
});
formatter.match({
  "location": "COVIDHomePageSteps.does_not_attach_an_IRB_Protocol_Document()"
});
formatter.write("2020-08-13 14:45:19: Screenshot: ");
formatter.embedding("image/png", "embedded3.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "attempts to confirm and submit the study form",
  "keyword": "And "
});
formatter.match({
  "location": "COVIDHomePageSteps.attempts_to_confirm_and_submit_the_study_form()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user is not able to successfully submit the study form",
  "keyword": "Then "
});
formatter.match({
  "location": "COVIDHomePageSteps.the_user_is_not_able_to_successfully_submit_the_study_form()"
});
formatter.write("2020-08-13 14:45:20: Screenshot: ");
formatter.embedding("image/png", "embedded4.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "sees a pop up with a message indicating study documentation is required before submitting",
  "keyword": "And "
});
formatter.match({
  "location": "COVIDHomePageSteps.sees_a_pop_up_with_the_message()"
});
formatter.write("2020-08-13 14:45:20: Screenshot: ");
formatter.embedding("image/png", "embedded5.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "when selecting \"Go Back\"",
  "keyword": "And "
});
formatter.match({
  "location": "COVIDHomePageSteps.when_selecting(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "under Study Documentation the user sees the message \" Study documentation is required. Please attach the appropriate file(s). \"",
  "keyword": "Then "
});
formatter.match({
  "location": "COVIDHomePageSteps.under_Study_Documentation_the_user_sees_the_message(String)"
});
formatter.write("2020-08-13 14:45:21: Screenshot: ");
formatter.embedding("image/png", "embedded6.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user logs out",
  "keyword": "And "
});
formatter.match({
  "location": "COVIDHomePageSteps.the_user_logs_out()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verifying Home Page verbiage",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "a User has logged in to the NIH COVID-19 Biorepository Dashboard Application",
  "keyword": "Given "
});
formatter.match({
  "location": "COVIDHomePageSteps.a_User_has_logged_in_to_the_NIH_COVID_Biorepository_Dashboard_Application(Integer)"
});
formatter.write("2020-08-13 14:45:33: INFO: Environment: Test (https://service-test.nci.nih.gov/nih-covid-19-dashboard?xpage\u003dlanding_pub)");
formatter.write("2020-08-13 14:45:33: Screenshot: ");
formatter.embedding("image/png", "embedded7.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the submissions home page",
  "keyword": "When "
});
formatter.match({
  "location": "COVIDHomePageSteps.the_user_us_on_the_submissions_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should see the home page below verbiage",
  "keyword": "Then ",
  "doc_string": {
    "value": "The COVID-19 Biorepository is available to all Intramural Research Program (IRP) Investigators with an IRB\napproved COVID-19 related study. This biorepository will serve two primary functions:\n\n1. Storage for biospecimens collected as part of an IRP IRB approved COVID-19 protocol in the NCI-Frederick \nCentral Repository\n2. Provide a catalogue of COVID-related studies with biospecimens to facilitate COVID-19 research for the \nwider scientific community\n\nTo ship and store biospecimens in the NCI-Frederick Repository, please complete the form to the left.\nAll fields are required. The IRB approved protocol must be submitted and please include any other \nsupporting documentation. Your request will be reviewed within 2 business days (as feasible). If approved,\nyou will be contacted with instructions on how to proceed with the transfer of your specimens with a \nmanifest to the Repository.\n\nIf you have any questions, please contact Mandy Black blacka@mail.nih.gov.\n\nThank you for your interest in the COVID-19 Biorepository"
  }
});
formatter.match({
  "location": "COVIDHomePageSteps.the_user_should_see_the_home_page_verbiage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verifying empty field messages",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "a User has logged in to the NIH COVID-19 Biorepository Dashboard Application",
  "keyword": "Given "
});
formatter.match({
  "location": "COVIDHomePageSteps.a_User_has_logged_in_to_the_NIH_COVID_Biorepository_Dashboard_Application(Integer)"
});
formatter.write("2020-08-13 14:45:48: INFO: Environment: Test (https://service-test.nci.nih.gov/nih-covid-19-dashboard?xpage\u003dlanding_pub)");
formatter.write("2020-08-13 14:45:48: Screenshot: ");
formatter.embedding("image/png", "embedded8.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the User enters any IRB Protocol Number and immediately deletes it",
  "keyword": "When "
});
formatter.match({
  "location": "COVIDHomePageSteps.the_User_enters_any_IRB_Protocol_Number_and_immediately_deletes_it()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on any other field on the page",
  "keyword": "And "
});
formatter.match({
  "location": "COVIDHomePageSteps.clicks_on_any_other_field_on_the_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an error message displays for IRB field with the message \"Please enter an IRB protocol number\"",
  "keyword": "Then "
});
formatter.match({
  "location": "COVIDHomePageSteps.an_error_message_displays_for_IRB_field_with_the_message(String)"
});
formatter.write("2020-08-13 14:45:55: INFO: Please enter an IRB protocol number. This field is required.");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the User enters any Study Title and immediately deletes it",
  "keyword": "When "
});
formatter.match({
  "location": "COVIDHomePageSteps.the_User_enters_any_Study_Title_and_immediately_deletes_it()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on any other field on the page",
  "keyword": "And "
});
formatter.match({
  "location": "COVIDHomePageSteps.clicks_on_any_other_field_on_the_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an error message displays for title with the message \"Please enter a title for this study. This field is required.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "COVIDHomePageSteps.an_error_message_displays_for_title_with_the_message(String)"
});
formatter.write("2020-08-13 14:45:55: INFO: Please enter a title for this study. This field is required.");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the User selects a Biospecimen Collection Frequency and then immediately selects no option",
  "keyword": "When "
});
formatter.match({
  "location": "COVIDHomePageSteps.the_User_selects_a_Biospecimen_Type_and_then_immediately_selects_no_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on any other field on the page",
  "keyword": "And "
});
formatter.match({
  "location": "COVIDHomePageSteps.clicks_on_any_other_field_on_the_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an error message displays for colection with the message \"Please select the appropriate collection frequency. This field is required.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "COVIDHomePageSteps.an_error_message_displays_for_colection_with_the_message(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the User enters any Study Specific Aim and immediately deletes it",
  "keyword": "When "
});
formatter.match({
  "location": "COVIDHomePageSteps.the_User_enters_any_Study_Specific_Aim_and_immediately_deletes_it()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on any other field on the page",
  "keyword": "And "
});
formatter.match({
  "location": "COVIDHomePageSteps.clicks_on_any_other_field_on_the_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an error message displays for aims with the message \"Please enter the study specific aims. This field is required.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "COVIDHomePageSteps.an_error_message_displays_for_aims_with_the_message(String)"
});
formatter.write("2020-08-13 14:45:55: INFO: Please enter the study specific aims. This field is required.");
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verifying Study Form Submission as a Reviewer",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "a User has logged in to the NIH COVID-19 Biorepository Dashboard Application",
  "keyword": "Given "
});
formatter.match({
  "location": "COVIDHomePageSteps.a_User_has_logged_in_to_the_NIH_COVID_Biorepository_Dashboard_Application(Integer)"
});
formatter.write("2020-08-13 14:46:03: INFO: Environment: Test (https://service-test.nci.nih.gov/nih-covid-19-dashboard?xpage\u003dlanding_pub)");
formatter.write("2020-08-13 14:46:03: Screenshot: ");
formatter.embedding("image/png", "embedded9.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "successfully submits a Study Form",
  "keyword": "And "
});
formatter.match({
  "location": "COVIDHomePageSteps.successfully_submits_a_Study_Form()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "impersonating a reviewer",
  "keyword": "When "
});
formatter.match({
  "location": "COVIDHomePageSteps.impersonating_a_reviewer()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the submitted study is displayed and options to Approve or Reject are available",
  "keyword": "Then "
});
formatter.match({
  "location": "SubmissionsPageSteps.the_submitted_study_is_displayed_and_options_to_Approve_or_Reject_are_available()"
});
formatter.write("2020-08-13 14:46:41: Screenshot: ");
formatter.embedding("image/png", "embedded10.png");
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/java/ServiceNow/COVIDDash/Features/Login.feature");
formatter.feature({
  "name": "Login",
  "description": "  Reviewer and Regular User/PI Login\n  Description: This feature tests User Story COVIDDASH-133, 141",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Reviewer Login",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "a Reviewer navigates to the COVID-19 Biorepository login page",
  "keyword": "Given "
});
formatter.match({
  "location": "COVIDHomePageSteps.a_Reviewer_navigates_to_the_COVID_Biorepository_login_page(Integer)"
});
formatter.write("2020-08-13 14:46:49: INFO: Environment: Test (https://service-test.nci.nih.gov/nih-covid-19-dashboard?xpage\u003dlanding_pub)");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the Reviewer selects Login to access button",
  "keyword": "When "
});
formatter.match({
  "location": "COVIDHomePageSteps.the_Reviewer_selects_Login_to_access_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "logs in by entering iTrust credentials",
  "keyword": "And "
});
formatter.match({
  "location": "ITrustLoginPageSteps.logs_in_by_entering_iTrust_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the Reviewer is directed to the Submissions page",
  "keyword": "Then "
});
formatter.match({
  "location": "SubmissionsPageSteps.the_Reviewer_is_directed_to_the_Submissions_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "is able to see two tables names \"Studies Pending Approval\" and \"Approved / Rejected Studies\"",
  "keyword": "And "
});
formatter.match({
  "location": "SubmissionsPageSteps.is_able_to_see_two_tables_names_and(String,String)"
});
formatter.write("2020-08-13 14:47:11: Screenshot: ");
formatter.embedding("image/png", "embedded11.png");
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});