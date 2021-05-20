Feature: Vacancy Manager Workflow

Background: common steps
Given User is on AppTracker home page and user is "AppTracker Vacancy Manager"

@Regression @Smoke @Jira88
Scenario: verify vacancy description without copy/paste
And User should see Vacancy Dashboard Page
When User clicks on Create Vacancy button
And User enters the vacancy title
Then User should see "Basic Vacancy Information" text as
 """
•	Determines customers’ needs and desires by specifying the research needed to obtain market information.
•	Recommends the nature and scope of present and future product lines by reviewing product specifications and requirements; appraising new product ideas and/or product or packaging changes.
•	Assesses market competition by comparing the company’s product to competitors’ products.
•	Provides source data for product line communications by defining product marketing communication objectives.
•	Obtains product market share by working with sales director to develop product sales strategies.
•	Assesses product market data by calling on customers with field salespeople and evaluating sales call results.


 """
 
@Satya3Ticket89
Scenario: Verify Letters of Recommendation persistent in Basic Information 
When User clicks on Create Vacancy button
And User selects recommendation as 2
And User clicks Save button
Then User can verify the recommendation value showing as 2 on Review and Finalize page



@Satya4Ticket91
Scenario: Verify create vacancy form
When User clicks on Create Vacancy button
And User can see the Create Vacancy form opens with below left menu items
| Basic Vacancy Information |
| Mandatory Statements      |
| Vacancy Committee         |
| Email Templates  |
| Review and Finalize |
And User click on "Vacancy Committee" without entering any value in previous field
Then User should able to navigate to the "Basic Vacancy Information" without any error


@Satya5Ticket93
Scenario: Verify the Vacancy Manager dashboard landing page
And User should see Vacancy Dashboard Page
And User can see the dashboard page displaying tabs as below 
|pre-flight vacancies|live vacancies|closed vacancies    |
Then User can see count of each tabs


		
@Satya6Ticket93
Scenario: Verify dashboard page sub filters
When User clicks on live vacancies tab
And User can see the "All", "Live", "Extended" sub filters on live vacancies
When User is on pre-flight vacancies tab
And User can see the "All", "Draft", "Finalized" sub filters on pre-flight vacancies tab
When User clicks on closed vacancies tab
Then User can see the "All", "Closed", "Triaged", "Individually Scored", "Scored", "Archived" sub filters on closed vacancies

@Satya7Ticket94
Scenario: Verify set vacancy date functionality
When User clicks on Create Vacancy button
Then User should able to navigate to the "Basic Vacancy Information" without any error
And User clicks on the Open date field to see calendar past dates disabled
And User clicks on the Close Date field to see calendar past dates disabled
And User selects date same as today's date as below
|Open Date |2021-05-18|
|Close Date|2021-05-21|
Then User can see the calendar pop up displays with Past dates disabled
#Then User can see the under Close Date field message displays with "Please pick a close date that is after the open date."
#When User selects the Open date as greater than the Close date 
#Then User can see the under Open Date field message displays with "Please pick an open date that is before the close date."

@Satya8Ticket94
Scenario: Verify the manual date enter functionality in vacancy dates fields
When User is on create vacancy page
And User enters the past date in open date field & tab out
Then User can see the dates changing to current date automatically
And User enters the past date in Closed date field & tab ou
Then User can see the dates changing to current date automatically

@Satya9Ticket94
Scenario: Verify the date field persistent in create vacancy form
When User clicks on the Create Vacancy button
And User selects the open & closed date
Then User navigates to other tab
And User comes back to Basic info tab
Then User can see the selected Open & Closed date displaying as the same


@Satya10Ticket101 
Scenario: Verify the Mandatory Statements Page
When User clicks on Create Vacancy button
And User clicks on the Mandatory Statements section
Then User can see "Equal Opportunity Employer","Standards of Conduct/Financial Disclosure", "Foreign Education", "Reasonable Accommodation" toggle buttons
And User can see pre-filled rich text area on each of the field

@Satya11Ticket101
Scenario Outline: Verify the on/off for the buttons in the mandatory statements
When User clicks on Create Vacancy button
And User clicks on the Mandatory Statements section
And User toggles off "<buttons>" as below
Examples: buttons
|buttons| 
|Foreign Education|
|Reasonable Accommodation|

@Satya12Ticket101
Scenario: Verify the Mandatory Statements persistence on editing text
And User clicks on Create Vacancy button
And User clicks on the Mandatory Statements section
And User edits Equal Opportunity Employer text by adding "This position requires traveling overseas"
And User toggles off/on Equal Opportunity Employer button
And User toggles off Standards of Conduct/Financial Disclosure button
Then User can see the updated value displays in the text field

@Satya13Ticket102
Scenario: Verify create vacancy documents upload functionality
And User should see Vacancy Dashboard Page
When User clicks on Create Vacancy button
Then User can see the below fields under Application Documents "Curriculum Vitae (CV)"Cover Letter", Vision Statement", "Qualification Statement"
And User can see Add more button to add more documents
And User can see optional check box in each field to indicate the document is optional 
And User can see trash icon in each field to delete the field

@Satya14Ticket102
Scenario:Verify the rename & persistence of functionality in documents section
Given User is on AppTracker home page and user is "AppTracker Vacancy Manager"
And User should see Vacancy Dashboard Page
And User clicks on Create Vacancy button
And User renames any field in the Application Documents section and User adds more documents
And User deletes 1 existing document section
And User clicks on the Mandatory Statements section
When User comes back to Basic information tab
Then User can see changes in documents section remains the same

@Satya15Ticket103
Scenario: Verify the email template in create vacancy form
Given User logged in to the application with Vacancy Manager user role & is on create vacancy form page
When User clicks on the Email Template tab
Then User can see the below fields
And Application Saved Application is Inactive Application Submitted Confirmation Applicant Not Referred to Interview Applicant Invitation to Interview
And User can see checkbox to mark the template as active or not
When User edits any email template
And User marks the template as active/inactive
And User clicks on some other tab
When User clicks on the Email template tab
Then User can see the updated changes displaying as same
