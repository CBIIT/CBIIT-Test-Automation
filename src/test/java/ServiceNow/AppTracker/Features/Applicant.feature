Feature: Unauthenticated Applicant Workflow

Background: common steps
Given User is on AppTracker home page and user is "Applicant"

@Ticket124-1 @WithoutOkta
Scenario: Applicant User is able to get to a Vacancy detail page without an Okta account set up before
Given User is on AppTracker home page and user is "Applicant"
And User chooses to register for Okta
And User is redirected to the Okta registration page
And User fills in mandatory fields
And User clicks Submit button
Then User can see confirmation message "User account created, please check your email for a message from Okta to activate your account"

@Ticket124-2 @WithOkta
Scenario: Applicant User is able to get to a Vacancy detail page with an Okta account set up before
Given User is on AppTracker home page and user is "Applicant"
And User chooses to log in with Okta
When User is redirected to the Okta sign in page
And User already has an Okta account set up
Then Okta sign in page allows User to enter the username
And User is redirected to Vacancy details page