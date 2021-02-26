$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/ServiceNow/SEER/Features/LandingPage.feature");
formatter.feature({
  "name": "SEER Data Access Landing Page Scenarios",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verifying Request Database Access text",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Smoke"
    },
    {
      "name": "@juarezds"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "a user is on the SEER Data Access landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "SEERLandingPageSteps.a_user_is_on_the_SEER_Data_Access_landing_page()"
});
formatter.write("2021-02-25 21:30:21: Screenshot: ");
formatter.embedding("image/png", "embedded0.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the \"Request Database Access\" text displays as",
  "keyword": "Then ",
  "doc_string": {
    "value": "Request Database Access\nTo request access to the SEER Incidence Databases, you will need to create a new SEER*Stat account by registering. For immediate access to the SEER Research Plus Databases, you will need to register with your eRA Commons credentials using the Institutional Account Login. If you do not have an eRA commons login and are not affiliated with an Institute, you will need to use the Non-Institutional Account, and will receive access to the SEER Research Database.\nIf you are affiliated with an Institute and have an institutional email account (.edu, .gov, .org), you must use your eRA Commons credentials to request the SEER data.\nExisting SEER*Stat account holders can upgrade access to the Research Plus Databases by logging in with your SEER*Stat Username and registered email address.\nOnly users who have already used this system to request a new, non-Institutional account can upgrade an existing account. All other users should follow steps to create a new account."
  }
});
formatter.match({
  "location": "SEERLandingPageSteps.the_text_displays_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verifying Institutional Accounts, Non-Institutional Accounts, Existing SEER*Stat Account Holders text on landing page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Smoke"
    },
    {
      "name": "@juarezds"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "a user is on the SEER Data Access landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "SEERLandingPageSteps.a_user_is_on_the_SEER_Data_Access_landing_page()"
});
formatter.write("2021-02-25 21:30:30: Screenshot: ");
formatter.embedding("image/png", "embedded1.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "under \"Institutional Accounts\" the text displayed is",
  "keyword": "Then ",
  "doc_string": {
    "value": "Do you have an account affiliated with a research organization?\nExamples include: eRA commons login, NIH, HHS, etc."
  }
});
formatter.match({
  "location": "SEERLandingPageSteps.under_the_text_displayed_is(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the text displayed is \"* If you are unable to authenticate, please use the Non-institutional option.\"",
  "keyword": "And "
});
formatter.match({
  "location": "SEERLandingPageSteps.the_text_displayed_is(String)"
});
formatter.write("2021-02-25 21:30:32: Screenshot: ");
formatter.embedding("image/png", "embedded2.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "under \"Non-Institutional Accounts\", text displayed is",
  "keyword": "And ",
  "doc_string": {
    "value": "For all other accounts, please enter your email to continue.\nExamples include Google or Yahoo accounts."
  }
});
formatter.match({
  "location": "SEERLandingPageSteps.under_text_displayed_is(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "under \"Existing SEER*Stat Account Holders\" text displayed is \"Please enter your current SEER*Stat Username and the email address you used to request access to other databases.\" and \"Request SEER Research Plus Databases\"",
  "keyword": "And "
});
formatter.match({
  "location": "SEERLandingPageSteps.under_text_displayed_is_and(String,String,String)"
});
formatter.write("2021-02-25 21:30:33: Screenshot: ");
formatter.embedding("image/png", "embedded3.png");
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/java/ServiceNow/SEER/Features/SEERDataAccessRequestPage.feature");
formatter.feature({
  "name": "SEER Data Access Request Scenarios",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Non-Institutional flow - Verifying SEER Data Access Request page contents and agreements for Non-Institutional flow",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Smoke"
    },
    {
      "name": "@juarezds"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "a SEER User Registration has been successfully submitted",
  "keyword": "Given "
});
formatter.match({
  "location": "SEERDataAccessRequestPageSteps.a_SEER_User_Registration_has_been_successfully_submitted()"
});
formatter.write("2021-02-25 21:31:08: Screenshot: ");
formatter.embedding("image/png", "embedded4.png");
formatter.write("2021-02-25 21:31:13: Screenshot: ");
formatter.embedding("image/png", "embedded5.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verifies email address by clicking on the email verification link that is sent to the user after submitting a SEER User registration form",
  "keyword": "And "
});
formatter.match({
  "location": "SEERDataAccessRequestPageSteps.user_verifies_email_address_by_clicking_on_the_email_verification_link_that_is_sent_to_the_user_after_submitting_a_SEER_User_registration_form()"
});
formatter.write("2021-02-25 21:31:19: Screenshot: ");
formatter.embedding("image/png", "embedded6.png");
formatter.write("2021-02-25 21:31:24: Screenshot: ");
formatter.embedding("image/png", "embedded7.png");
formatter.write("2021-02-25 21:31:32: Screenshot: ");
formatter.embedding("image/png", "embedded8.png");
formatter.write("2021-02-25 21:32:22: Screenshot: ");
formatter.embedding("image/png", "embedded9.png");
formatter.write("2021-02-25 21:32:32: Screenshot: ");
formatter.embedding("image/png", "embedded10.png");
formatter.write("2021-02-25 21:32:48: Screenshot: ");
formatter.embedding("image/png", "embedded11.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user is directed to the \u0027SEER Data Access Request\u0027 page",
  "keyword": "Then "
});
formatter.match({
  "location": "SEERDataAccessRequestPageSteps.the_user_is_directed_to_the_page(String)"
});
formatter.result({
  "error_message": "java.lang.AssertionError\n\tat org.junit.Assert.fail(Assert.java:86)\n\tat org.junit.Assert.assertTrue(Assert.java:41)\n\tat org.junit.Assert.assertTrue(Assert.java:52)\n\tat ServiceNow.SEER.Steps.SEERDataAccessRequestPageSteps.the_user_is_directed_to_the_page(SEERDataAccessRequestPageSteps.java:119)\n\tat ✽.the user is directed to the \u0027SEER Data Access Request\u0027 page(file:src/test/java/ServiceNow/SEER/Features/SEERDataAccessRequestPage.feature:8)\n",
  "status": "failed"
});
formatter.step({
  "name": "the \u0027Requested for\u0027 field contains the name of the requestor in read-only format",
  "keyword": "And "
});
formatter.match({
  "location": "SEERDataAccessRequestPageSteps.the_field_contains_the_name_of_the_requestor_in_read_only_format(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the \u0027Database type\u0027 field displays with \u0027SEER Research Database\u0027 in read-only format",
  "keyword": "And "
});
formatter.match({
  "location": "SEERDataAccessRequestPageSteps.the_field_displays_with_in_read_only_format(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user can select a general purpose for using the data",
  "keyword": "And "
});
formatter.match({
  "location": "SEERDataAccessRequestPageSteps.the_user_can_select_a_general_purpose_for_using_the_data()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "before entering initials for \u0027Data Use Agreement Certification\u0027 the Initials text box displays with the users initials in read-only mode",
  "keyword": "And "
});
formatter.match({
  "location": "SEERDataAccessRequestPageSteps.before_entering_initials_for_the_Initials_text_box_displays_with_the_users_initials_in_read_only_mode(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the Data Use Agreement Certification text agreement displayed",
  "keyword": "And "
});
formatter.match({
  "location": "SEERDataAccessRequestPageSteps.the_Data_Use_Agreement_Certification_text_agreement_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "before entering initials for \u0027Best Practice Assurance\u0027, the users initials display in read only format",
  "keyword": "And "
});
formatter.match({
  "location": "SEERDataAccessRequestPageSteps.before_entering_initials_for_the_users_initials_display_in_read_only_format(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the Best Practice Assurance text displayed",
  "keyword": "And "
});
formatter.match({
  "location": "SEERDataAccessRequestPageSteps.the_Best_Practice_Assurance_text_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "when the user scrolls down each agreement",
  "keyword": "And "
});
formatter.match({
  "location": "SEERDataAccessRequestPageSteps.when_the_user_scrolls_down_each_agreement()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user is able to enter intials",
  "keyword": "Then "
});
formatter.match({
  "location": "SEERDataAccessRequestPageSteps.the_user_is_able_to_enter_intials()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "SEER information is displayed on the bottom of the page as follows:",
  "keyword": "And ",
  "doc_string": {
    "value": "SEER is supported by the Surveillance Research Program (SRP) in NCI\u0027s Division of Cancer Control and Population Sciences (DCCPS). SRP provides national leadership in the science of cancer surveillance as well as analytical tools and methodological expertise in collecting, analyzing, interpreting, and disseminating reliable population-based statistics."
  }
});
formatter.match({
  "location": "SEERDataAccessRequestPageSteps.seer_information_is_displayed_on_the_bottom_of_the_page_as_follows(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "after entering required information, the user is able to successfully submit the SEER Data Access Request form",
  "keyword": "Then "
});
formatter.match({
  "location": "SEERDataAccessRequestPageSteps.after_entering_required_information_the_user_is_able_to_successfully_submit_the_SEER_Data_Access_Request_form()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/java/ServiceNow/SEER/Features/SEERUserRegistrationPage.feature");
formatter.feature({
  "name": "SEER User Registration Scenarios",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verifying Undergraduate or Graduate students get directed to landing page when selecting \u0027Undergraduate or Graduate Student\u0027 for \u0027Which of these best describe you?\u0027 on the SEER Registration Page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Smoke"
    },
    {
      "name": "@juarezds"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "a user is on the SEER Data Access landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "SEERLandingPageSteps.a_user_is_on_the_SEER_Data_Access_landing_page()"
});
formatter.write("2021-02-25 21:32:57: Screenshot: ");
formatter.embedding("image/png", "embedded12.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters an email address as \"test@mail.com\" and continues with the email verification for Non-Institutional Accounts",
  "keyword": "When "
});
formatter.match({
  "location": "SEERUserRegistrationPageSteps.the_user_enters_an_email_address_as_and_continues_with_the_email_verification_for_Non_Institutional_Accounts(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "fills out the SEER Registration form",
  "keyword": "And "
});
formatter.match({
  "location": "SEERUserRegistrationPageSteps.fills_out_the_SEER_Registration_form()"
});
formatter.write("2021-02-25 21:33:18: Screenshot: ");
formatter.embedding("image/png", "embedded13.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "for \u0027Which of these best describe you?\u0027 selects \u0027Undergraduate or Graduate Student\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "SEERUserRegistrationPageSteps.for_selects(String,String)"
});
formatter.write("2021-02-25 21:33:25: Screenshot: ");
formatter.embedding("image/png", "embedded14.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user is directed back to the landing page with a message indicating the user must request access via the Institutional Accounts option",
  "keyword": "Then "
});
formatter.match({
  "location": "SEERUserRegistrationPageSteps.the_user_is_directed_back_to_the_landing_page_with_a_message_indicating_the_user_must_request_access_via_the_Institutional_Accounts_option()"
});
formatter.write("2021-02-25 21:33:28: Screenshot: ");
formatter.embedding("image/png", "embedded15.png");
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verifying Sate and Zip code fields are required when selecting United States of America for Country field",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Smoke"
    },
    {
      "name": "@juarezds"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "a user is on the SEER Data Access landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "SEERLandingPageSteps.a_user_is_on_the_SEER_Data_Access_landing_page()"
});
formatter.write("2021-02-25 21:33:37: Screenshot: ");
formatter.embedding("image/png", "embedded16.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user proceeds with email verification for a Non-Institutional Account",
  "keyword": "And "
});
formatter.match({
  "location": "SEERUserRegistrationPageSteps.user_proceeds_with_email_verification_for_a_Non_Institutional_Account()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "entering required information",
  "keyword": "When "
});
formatter.match({
  "location": "SEERUserRegistrationPageSteps.entering_required_information()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "entering and selecting \"United States of America\" for Country field",
  "keyword": "And "
});
formatter.match({
  "location": "SEERUserRegistrationPageSteps.entering_and_selecting_for_Country_field(String)"
});
formatter.write("2021-02-25 21:33:56: Screenshot: ");
formatter.embedding("image/png", "embedded17.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "submitting the registration form",
  "keyword": "And "
});
formatter.match({
  "location": "SEERUserRegistrationPageSteps.submitting_the_registration_form()"
});
formatter.write("2021-02-25 21:34:07: Screenshot: ");
formatter.embedding("image/png", "embedded18.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user is not able to submit the registration form because the State and Zip Code fields are required",
  "keyword": "Then "
});
formatter.match({
  "location": "SEERUserRegistrationPageSteps.the_user_is_not_able_to_submit_the_registration_form_because_the_State_and_Zip_Code_fields_are_required()"
});
formatter.write("2021-02-25 21:34:13: Screenshot: ");
formatter.embedding("image/png", "embedded19.png");
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verifying \"Thank you - your registration is complete.\" page contents",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Smoke"
    },
    {
      "name": "@juarezds"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "a user is on the SEER Data Access landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "SEERLandingPageSteps.a_user_is_on_the_SEER_Data_Access_landing_page()"
});
formatter.write("2021-02-25 21:34:21: Screenshot: ");
formatter.embedding("image/png", "embedded20.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters an email address for Non-Institutional Account",
  "keyword": "When "
});
formatter.match({
  "location": "SEERUserRegistrationPageSteps.the_user_enters_an_email_address_for_Non_Institutional_Account()"
});
formatter.write("2021-02-25 21:34:22: Screenshot: ");
formatter.embedding("image/png", "embedded21.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "fills out all required fields on SEER Data registration page",
  "keyword": "And "
});
formatter.match({
  "location": "SEERUserRegistrationPageSteps.fills_out_all_required_fields_on_SEER_Data_registration_page()"
});
formatter.write("2021-02-25 21:34:31: Screenshot: ");
formatter.embedding("image/png", "embedded22.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "submits the registration form",
  "keyword": "And "
});
formatter.match({
  "location": "SEERUserRegistrationPageSteps.submits_the_registration_form()"
});
formatter.write("2021-02-25 21:34:34: Screenshot: ");
formatter.embedding("image/png", "embedded23.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the \"Thank you - your registration is complete.\" page displays",
  "keyword": "Then "
});
formatter.match({
  "location": "SEERUserRegistrationPageSteps.the_page_displays(String)"
});
formatter.write("2021-02-25 21:34:37: Screenshot: ");
formatter.embedding("image/png", "embedded24.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the page header displays as \"SEER Incidence Database details\"",
  "keyword": "And "
});
formatter.match({
  "location": "SEERUserRegistrationPageSteps.the_page_header_displays_as(String)"
});
formatter.write("2021-02-25 21:34:38: Screenshot: ");
formatter.embedding("image/png", "embedded25.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the following text also displays",
  "keyword": "And ",
  "doc_string": {
    "value": "Thank you - your registration is complete.\nYou will recieve a confirmation email with more instructions momentarily.\nOnce the email address you have submitted has been verified you can login and complete the Data Access Request form.\n\nWhat to expect when completing the data access request form:\nThe electronic Data Access Request form requires a brief description of your intended use of the data (based on the type of data being requested). You will also be required to review and agree to the Data Use Agreement (DUA).\nYou will also be required to review and agree to the Best Practices for Securing NCI-supported Registry Data.\nOnce your access is approved, you will receive a username and password for accessing the data through SEER*Stat Software.\nNote for continued or new data release access: Your access will be restricted on April 30th of each year in preparation for the release of updated data. You will need to re-apply for access to the updated database starting April 1st.\n← Back to SEER Database details"
  }
});
formatter.match({
  "location": "SEERUserRegistrationPageSteps.the_following_text_also_displays(String)"
});
formatter.write("2021-02-25 21:34:39: Screenshot: ");
formatter.embedding("image/png", "embedded26.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the \u003c- Back to SEER Database details button displays",
  "keyword": "And "
});
formatter.match({
  "location": "SEERUserRegistrationPageSteps.the_Back_to_SEER_Database_details_button_displays()"
});
formatter.write("2021-02-25 21:34:40: Screenshot: ");
formatter.embedding("image/png", "embedded27.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the following SEER information text displays on the bottom of the page",
  "keyword": "And ",
  "doc_string": {
    "value": "SEER is supported by the Surveillance Research Program (SRP) in NCI\u0027s Division of Cancer Control and Population Sciences (DCCPS). SRP provides national leadership in the science of cancer surveillance as well as analytical tools and methodological expertise in collecting, analyzing, interpreting, and disseminating reliable population-based statistics."
  }
});
formatter.match({
  "location": "SEERUserRegistrationPageSteps.the_following_SEER_information_text_displays_on_the_bottom_of_the_page(String)"
});
formatter.write("2021-02-25 21:34:41: Screenshot: ");
formatter.embedding("image/png", "embedded28.png");
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verifying \u0027SEER Incidence Database\u0027 bread crumb directs user to https://seer.cancer.gov/data/",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Smoke"
    },
    {
      "name": "@juarezds"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "a user is on the SEER Data Access landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "SEERLandingPageSteps.a_user_is_on_the_SEER_Data_Access_landing_page()"
});
formatter.write("2021-02-25 21:34:49: Screenshot: ");
formatter.embedding("image/png", "embedded29.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the \u0027SEER Incidence Database\u0027 bread crumb displays",
  "keyword": "Then "
});
formatter.match({
  "location": "SEERDataAccessRequestPageSteps.the_bread_crumb_displays(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "when clicking, user is directed to \"https://seer.cancer.gov/data/\"",
  "keyword": "And "
});
formatter.match({
  "location": "SEERDataAccessRequestPageSteps.when_clicking_user_is_directed_to(String)"
});
formatter.write("2021-02-25 21:34:53: Screenshot: ");
formatter.embedding("image/png", "embedded30.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enter an email address for a Non-Institutional Account",
  "keyword": "When "
});
formatter.match({
  "location": "SEERUserRegistrationPageSteps.the_user_enter_an_email_address_for_a_Non_Institutional_Account()"
});
formatter.write("2021-02-25 21:34:57: Screenshot: ");
formatter.embedding("image/png", "embedded31.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the \u0027SEER User Registration\u0027 page",
  "keyword": "And "
});
formatter.match({
  "location": "SEERDataAccessRequestPageSteps.the_user_is_on_the_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the \u0027SEER Incidence Database\u0027 bread crumb displays",
  "keyword": "Then "
});
formatter.match({
  "location": "SEERDataAccessRequestPageSteps.the_bread_crumb_displays(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "when clicking, user is directed to \"https://seer.cancer.gov/data/\"",
  "keyword": "And "
});
formatter.match({
  "location": "SEERDataAccessRequestPageSteps.when_clicking_user_is_directed_to(String)"
});
formatter.write("2021-02-25 21:35:01: Screenshot: ");
formatter.embedding("image/png", "embedded32.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "fills out all required fields on the SEER Data registration page",
  "keyword": "And "
});
formatter.match({
  "location": "SEERUserRegistrationPageSteps.fills_out_all_required_fields_on_the_SEER_Data_registration_page()"
});
formatter.write("2021-02-25 21:35:12: Screenshot: ");
formatter.embedding("image/png", "embedded33.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "submits the registration form",
  "keyword": "And "
});
formatter.match({
  "location": "SEERUserRegistrationPageSteps.submits_the_registration_form()"
});
formatter.write("2021-02-25 21:35:15: Screenshot: ");
formatter.embedding("image/png", "embedded34.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is directed to the \u0027Thank you - your registration is complete.\u0027 page",
  "keyword": "Then "
});
formatter.match({
  "location": "SEERDataAccessRequestPageSteps.user_is_directed_to_the_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the \u0027SEER Incidence Database\u0027 bread crumb displays",
  "keyword": "And "
});
formatter.match({
  "location": "SEERDataAccessRequestPageSteps.the_bread_crumb_displays(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "when clicking, user is directed to \"https://seer.cancer.gov/data/\"",
  "keyword": "And "
});
formatter.match({
  "location": "SEERDataAccessRequestPageSteps.when_clicking_user_is_directed_to(String)"
});
formatter.write("2021-02-25 21:35:19: Screenshot: ");
formatter.embedding("image/png", "embedded35.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user confirms their email address by clicking on the email verifation link sent to the users email address",
  "keyword": "When "
});
formatter.match({
  "location": "SEERDataAccessRequestPageSteps.user_confirms_their_email_address_by_clicking_on_the_email_verifation_link_sent_to_the_users_email_address()"
});
formatter.write("2021-02-25 21:35:29: Screenshot: ");
formatter.embedding("image/png", "embedded36.png");
formatter.write("2021-02-25 21:35:33: Screenshot: ");
formatter.embedding("image/png", "embedded37.png");
formatter.write("2021-02-25 21:35:41: Screenshot: ");
formatter.embedding("image/png", "embedded38.png");
formatter.write("2021-02-25 21:35:47: Screenshot: ");
formatter.embedding("image/png", "embedded39.png");
formatter.write("2021-02-25 21:36:28: Screenshot: ");
formatter.embedding("image/png", "embedded40.png");
formatter.write("2021-02-25 21:36:36: Screenshot: ");
formatter.embedding("image/png", "embedded41.png");
formatter.write("2021-02-25 21:36:41: Screenshot: ");
formatter.embedding("image/png", "embedded42.png");
formatter.write("2021-02-25 21:36:45: Screenshot: ");
formatter.embedding("image/png", "embedded43.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user is directed to \u0027SEER Data Access Request\u0027 page",
  "keyword": "Then "
});
formatter.match({
  "location": "SEERDataAccessRequestPageSteps.the_user_is_directed_to_page(String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//div[@class \u003d \u0027breadcrumbs-container\u0027]/h1\"}\n  (Session info: chrome\u003d88.0.4324.192)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027Diegos-MBP\u0027, ip: \u0027fe80:0:0:0:1cda:9194:37a6:c30e%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.16\u0027, java.version: \u002715.0.1\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 88.0.4324.192, chrome: {chromedriverVersion: 88.0.4324.96 (68dba2d8a0b14..., userDataDir: /var/folders/ph/bzj7vj0x6js...}, goog:chromeOptions: {debuggerAddress: localhost:62041}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 4956f716c380848d782c18a2c393d914\n*** Element info: {Using\u003dxpath, value\u003d//div[@class \u003d \u0027breadcrumbs-container\u0027]/h1}\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:64)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\n\tat com.sun.proxy.$Proxy20.getText(Unknown Source)\n\tat ServiceNow.SEER.Steps.SEERDataAccessRequestPageSteps.the_user_is_directed_to_page(SEERDataAccessRequestPageSteps.java:449)\n\tat ✽.the user is directed to \u0027SEER Data Access Request\u0027 page(file:src/test/java/ServiceNow/SEER/Features/SEERUserRegistrationPage.feature:63)\n",
  "status": "failed"
});
formatter.step({
  "name": "the \u0027SEER Incidence Database\u0027 bread crumb displays",
  "keyword": "And "
});
formatter.match({
  "location": "SEERDataAccessRequestPageSteps.the_bread_crumb_displays(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "when clicking, user is directed to \"https://seer.cancer.gov/data/\"",
  "keyword": "And "
});
formatter.match({
  "location": "SEERDataAccessRequestPageSteps.when_clicking_user_is_directed_to(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user has to select a general purpose for using the data",
  "keyword": "Then "
});
formatter.match({
  "location": "SEERDataAccessRequestPageSteps.the_user_has_to_select_a_general_purpose_for_using_the_data()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "also has to agree by typing initials to the Data Use Agreement Certification and Best Practice Assurance",
  "keyword": "And "
});
formatter.match({
  "location": "SEERDataAccessRequestPageSteps.also_has_to_agree_by_typing_initials_to_the_Data_Use_Agreement_Certification_and_Best_Practice_Assurance()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "successfully submitting the SEER Data Request form",
  "keyword": "When "
});
formatter.match({
  "location": "SEERDataAccessRequestPageSteps.successfully_submitting_the_SEER_Data_Request_form()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the page \u0027Thank you - your data access request is complete.\u0027 displays",
  "keyword": "Then "
});
formatter.match({
  "location": "SEERDataAccessRequestPageSteps.the_page_displays(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the \u0027SEER Incidence Database\u0027 bread crumb displays",
  "keyword": "And "
});
formatter.match({
  "location": "SEERDataAccessRequestPageSteps.the_bread_crumb_displays(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "when clicking, user is directed to \"https://seer.cancer.gov/data/\"",
  "keyword": "And "
});
formatter.match({
  "location": "SEERDataAccessRequestPageSteps.when_clicking_user_is_directed_to(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verifying bread crumbs on \"Thank you - your registration is complete.\" page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Smoke"
    },
    {
      "name": "@juarezds"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "a user is on the SEER Data Access landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "SEERLandingPageSteps.a_user_is_on_the_SEER_Data_Access_landing_page()"
});
formatter.write("2021-02-25 21:38:24: Screenshot: ");
formatter.embedding("image/png", "embedded44.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters email address for a Non-Institutional Account",
  "keyword": "When "
});
formatter.match({
  "location": "SEERUserRegistrationPageSteps.user_enters_email_address_for_a_Non_Institutional_Account()"
});
formatter.write("2021-02-25 21:38:25: Screenshot: ");
formatter.embedding("image/png", "embedded45.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "fills out all required fields on SEER Data registration page",
  "keyword": "And "
});
formatter.match({
  "location": "SEERUserRegistrationPageSteps.fills_out_all_required_fields_on_SEER_Data_registration_page()"
});
formatter.write("2021-02-25 21:38:34: Screenshot: ");
formatter.embedding("image/png", "embedded46.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "submits the registration form",
  "keyword": "And "
});
formatter.match({
  "location": "SEERUserRegistrationPageSteps.submits_the_registration_form()"
});
formatter.write("2021-02-25 21:38:37: Screenshot: ");
formatter.embedding("image/png", "embedded47.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is directed to the \u0027Thank you - your registration is complete.\u0027 page",
  "keyword": "Then "
});
formatter.match({
  "location": "SEERDataAccessRequestPageSteps.user_is_directed_to_the_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the following breadcrumbs are displayed \"Home\", \"SEER Data \u0026 Software\", \"SEER Incidence Database\", \"Request SEER Incidence Data\", \"Submission Confirmation\"",
  "keyword": "Then "
});
formatter.match({
  "location": "SEERUserRegistrationPageSteps.the_following_breadcrumbs_are_displayed(String,String,String,String,String)"
});
formatter.write("2021-02-25 21:38:38: Screenshot: ");
formatter.embedding("image/png", "embedded48.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the \u0027SEER Incidence Database\u0027 bread crumb displays",
  "keyword": "And "
});
formatter.match({
  "location": "SEERDataAccessRequestPageSteps.the_bread_crumb_displays(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "when clicking, user is directed to \"https://seer.cancer.gov/data/\"",
  "keyword": "And "
});
formatter.match({
  "location": "SEERDataAccessRequestPageSteps.when_clicking_user_is_directed_to(String)"
});
formatter.write("2021-02-25 21:38:41: Screenshot: ");
formatter.embedding("image/png", "embedded49.png");
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});