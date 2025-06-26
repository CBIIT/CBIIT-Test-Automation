@CCRHELPDESK
Feature: CCRHelpDesk testing

  @Satya @CCRHELPDES-17 @EndToEndTestCase @NewTestCaseNumber
  Scenario: Create CCR Helpdesk Workflow States
    Given User opens CCR HelpDesk application in browser
    When User will login to CCR HelpDesk application
    Then Submit a new ticket
    Then verify the state of the ticket as  "New"
    Then goto native view
    Then Filter on CCR Healpdesk menu
    Then search for the lastet ticket
    Then Assign the ticket to myself
    Then verify the state of the ticket as "Open"
    Then click on ticket on hold
    Then verify the state of the ticket as "On Hold"
    Then click on completed button
    Then verify the state of the ticket as "Resolved"
    Then Close the ticket
    Then verify the state of the ticket as "Closed"

  @CCRHELPDES-14
  Scenario: Configure CCR/OIT Request Form
    Given User opens CCR HelpDesk application in browser
    When User will login to CCR HelpDesk application
    Then validate that the following fields are available to enter details requested for
    Then validate that the following fields are available to enter details Application Name – List of applications needed.
    Then validate that the following fields are available to enter details Short Description
    Then validate that the following fields are available to enter details Description

  @CCRHELPDES-13
  Scenario: Configure CCR/OIT Native View Request Form
    Given User opens CCR HelpDesk application in browser
    When User will login to CCR HelpDesk application
    Then goto native view
    Then Filter on CCR Healpdesk menu
    Then search for the lastet ticket
    Then Open new ticket
    Then validate that this field is available Ticket ID (Auto generated)
    Then validate that this field is available Status (drop down) (Open, In Review, Work in Progress, Resolved, Closed Complete)
    Then validate that this field is available Submitted By (auto-populate)
    Then validate that this field is available Submitted Date (auto-populate)
    Then validate that this field is available Application Name – List of applications needed.
    Then validate that this field is available Priority (high, Medium, Low) default = Med (not visible to customer)
    Then validate that this field is available Severity (high, Medium, Low) default = Med (not visible to customer)
    Then validate that this field is available Due Date (Validate Due Date is not before submitted date) (not visible to customer)

  @CCRHELPDES-10 @CCRHELPDES-50
  Scenario: Create CCR OIT Case Table
    Given User opens CCR HelpDesk application in browser
    When User will login to CCR HelpDesk application
    Then Submit a new ticket
    Then verify the state of the ticket as  "New"

  @CCRHELPDES-25 @CCRHELPDES-25
  Scenario: Customize CCR/OIT Request form (Record producer)
    Given User opens CCR HelpDesk application in browser
    When User will login to CCR HelpDesk application
    Then validate that the following fields are available to enter details requested for
    Then validate that the following fields are available to enter details Application Name – List of applications needed.
    Then validate that the following fields are available to enter details Short Description
    Then validate that the following fields are available to enter details Description

  @CCRHELPDES-28
  Scenario: Customize CCR/OIT Helpdesk Native view Form
    Given User opens CCR HelpDesk application in browser
    When User will login to CCR HelpDesk application
    Then goto native view
    Then Filter on CCR Healpdesk menu
    Then search for the lastet ticket
    Then Open new ticket
    Then validate that this field is available Ticket ID (Auto generated)
    Then validate that this field is available State (Required)
    Then validate that this field is available Created
    Then validate that this field is available Opened by
    Then validate that this field is available Requested For
    Then validate that this field is available Application  (Required)
    Then validate that this field is available Due Date
    Then validate that this field is available Assignment Group (Required)
    Then validate that this field is available Assigned to
    Then validate that this field is available Detail Tab
    Then validate that this field is available Short Description
    Then validate that this field is available Description
    Then validate that this field is available Notes Tab
    Then validate that this field is available Emails
    Then validate that this field is available created
    Then validate that this field is available Recipients
    Then validate that this field is available Subject

  @CCRHELPDES-36
  Scenario: Update Application Choices table to contain Distribution List field
    Given User opens CCR HelpDesk application in browser
    When User will login to CCR HelpDesk application
    Then goto native view
    Then Filter on CCR Healpdesk menu
    When I click on "Application Choice" in CCR/OIT Help  Desk menu
    Then I should see "Distribution list" as one of the fields.

  @CCRHELPDES-46
  Scenario: Update Application Choices form (O&M)
    Given User opens CCR HelpDesk application in browser
    When User will login to CCR HelpDesk application
    Then goto native view
    Then Filter on CCR Healpdesk menu
    When I click on "Application Choice" in CCR/OIT Help  Desk menu
    Then Open new ticket
    Then I should see the following choices have been added Created by
    Then I should see the following choices have been added Created on
    Then I should see the following choices have been added Updated
    Then I should see the following choices have been added Updated by
    
    
