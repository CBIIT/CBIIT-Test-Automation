Feature: Unauthenticated Applicant Workflow

Background: common steps
Given User is on AppTracker home page and user is "Applicant"

@Ticket124-1 @WithoutOkta
Scenario: Applicant User is able to get to a Vacancy detail page without an Okta account set up before
And User views live vacancy
When User clicks Sign In And Apply button
When User is redirected to the Okta sign in page
And User does not have an Okta account set up
And User fills in mandatory fields
And User clicks Submit button
Then User can see message "User account created, please check your email for a message from Okta to activate your account"

@Ticket124-2 @WithOkta
Scenario: Applicant User is able to get to a Vacancy detail page with an Okta account set up before
And User views live vacancy
When User clicks Sign In And Apply button
When User is redirected to the Okta sign in page
And User already has an Okta account set up
Then Okta sign in page allows User to enter the username
And User is redirected to Vacancy details page
