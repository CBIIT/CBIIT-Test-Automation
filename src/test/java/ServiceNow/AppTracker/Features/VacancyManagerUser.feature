Feature: Vacancy Manager Workflow

Background: common steps
Given User is on AppTracker home page and user is "AppTracker Vacancy Manager"

@Satya1Ticket88 
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
| Mandatory Statements |
| Vacancy Committee |
| Email Templates |
| Review and Finalize |
And User click on "Vacancy Committee" without entering any value in previous field
Then User should able to navigate to the "Basic Vacancy Information" without any error


@Satya5Ticket93
Scenario: Verify the Vacancy Manager dashboard landing page
And User should see Vacancy Dashboard Page
And User can see the dashboard page displaying tabs as below 
|pre-flight vacancies|live vacancies	     |closed vacancies    |
Then User can see count of each tabs


		
@Satya6Ticket93
Scenario: Verify dashboard page sub filters
#When User clicks on any sub tab
#And User can see the grid shows the filtered value
When User clicks on live vacancies tab
And User can see the "All", "Live", "Extended" sub filters on live vacancies
When User is on pre-flight vacancies tab
And User can see the "All", "Draft", "Finalized" sub filters on pre-flight vacancies tab
When User clicks on closed vacancies tab
Then User can see the "All", "Closed", "Triaged", "Individually Scored", "Scored", "Archived" sub filters on closed vacancies

@Satya7Ticket94
Scenario Outline: Verify set vacancy date functionality
When User clicks on the Create Vacancy button
Then User should able to navigate to the "Basic Vacancy Information" without any error
When User adds new open date and close date
|Open date|Close Date|
|2021-05-14|2021-05-14|

Then User can see the calendar pop up displays with Past dates disabled
And User selects date same as today's date
When User clicks on the Close date field
Then User can see the calendar pop up displays with Past dates disabled
When User selects the closed date same as open date
Then User can see the error message as "Please pick a close date that is after the open date."
When User selects the open date as greater than the close date
Then User can see the error message as "Please pick an open date that is before the close date."

@Satya8Ticket94
Scenario: Verify the manual date enter functionality in vacancy dates fields
When User is on create vacancy page
And User enters the past date in open date field & tab out
Then User can see the dates changing to current date automatically
And User enters the past date in Closed date field & tab out
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
When User clicks on the create vacancy button
Then User can see the create vacancy form opens
When User click on the Mandatory Statements link
Then User can see "Equal Opportunity Employment,Standards of Conduct/Financial Disclosure, Foreign Education, Reasonable Accommodation" toggle buttons
And User can see pre-filled rich text area on each of the field

@Satya11Ticket101
Scenario: Verify the on/off for the buttons in the mandatory statements

And User is on Mandatory Statements page
When User toggle off any of the button
Then User can see the respective text area is hidden
When User updates the field value
And User Off/On the button
Then User can see the updated value displays on the text field

@Satya12Ticket101
Scenario: Verify the Mandatory Statements persistency on clicking other tabs

And User is on Mandatory Statements page
When User toggle off the Equal Opportunity Employer button
And User updates the value in Standards of Conduct/Financial Disclosure and toggle On
And User updates the value in Standards of Conduct/Financial Disclosure and toggle Off
Then User click on other tab
And User click on Mandatory Statements tab
Then User can see the same state displays when user navigates to other tab

@Satya13Ticket102
Scenario: Verify create vacancy documents upload functionality

And User is on Create Vacancy page
Then User can see the below fields under Application Documents
| Curriculum Vitae (CV) | Cover Letter | Vision Statement |Qualification Statement }
And User can see Add more button to add more documents
And User can see optional check box in each field to indicate the document is optional 
And User can see trash icon in each field to delete the field

@Satya13Ticket102
Scenario: Verify the rename & persistency functionality in documents section 
And User is on Create Vacancy form page
When User renames any field in the Application Documents section
And User adds more documents
And User deletes 1 existing document section
And User navigates to some other tab
When User comes back to Basic information tab
Then User can see changes in documents section remains the same

@Satya14Ticket103
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
