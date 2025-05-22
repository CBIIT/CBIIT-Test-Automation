@CADSRServicePortal @AllCADSR
Feature: CADSR feature files

  @SNOWCADSR-67
  Scenario: Validate Request submitted confirmation Service Portal page
    Given User opens caDSR Application
    When User Logins to the caDSR application
    Then Start a new request
    Then Enter CADSR request details
    Then Click on Save button
    Then User should see request submitted confirmation page

  @SNOWCADSR-69
  Scenario: Validate caDSR POC Fields in Request Form
    Given User opens caDSR Application
    When User Logins to the caDSR application
    Then Start a new request
    Then User should see Requested for field

  @SNOWCADSR-68
  Scenario: Validate caDSR helpdesk Request Form
    Given User opens caDSR Application
    When User Logins to the caDSR application
    Then Start a new request
    Then User should see all the available attribute fields to select

  @SNOWCADSR-94 @SNOWCADSR-96
  Scenario: Validate auto populate of customer details in caDSR helpdesk Request Form
    Given User opens caDSR Application
    When User Logins to the caDSR application
    Then Start a new request
    Then verify that the customer details are already populated

  @SNOWCADSR-95
  Scenario: Validate mapping for Organization to caSAR fulfiller user
    Given User opens caDSR Application
    When User Logins to the caDSR application
    Then Start a new request
    Then User should see caSDR Fulfiller group assigned to the operations selected

  @SNOWCADSR-104
  Scenario: Validate multiple selection of operations
    Given User opens caDSR Application
    When User Logins to the caDSR application
    Then Start a new request
    Then Enter CADSR request details
    Then Select multiple curation operations

  @SNOWCADSR-105
  Scenario: Validate default priority
    Given User opens caDSR Application
    When User Logins to the caDSR application
    Then Start a new request
    Then User should see default priority as Moderate

  @SNOWCADSR-97 @SNOWCADSR-246
  Scenario: Validate child tickets when multiple curation operations are slected
    Given User opens caDSR Application
    When User Logins to the caDSR application
    Then Start a new request
    Then Enter CADSR request details
    Then Select multiple curation operations
    Then Click on Save button
    Then Go to native view
    Then validate child tickets

  @SNOWCADSR-98 @SNOWCADSR-122
  Scenario: Validate removed POC/ additional contact details from service portal page
    Given User opens caDSR Application
    When User Logins to the caDSR application
    Then Start a new request
    Then Verify if POC field is available

  @SNOWCADSR-108
  Scenario: Update Operations dropdown to not show Curation Task when Task = NONE
    Given User opens caDSR Application
    When User Logins to the caDSR application
    Then Start a new request
    Then Verify Operations

  @SNOWCADSR-118 @SNOWCADSR-122 @SNOWCADSR-187
  Scenario: Validate default columns for incident grid
    Given User opens caDSR Application
    When User Logins to the caDSR application
    Then User click on view my tickets
    Then User should see default columns for incident list

  @SNOWCADSR-121
  Scenario: Validate content to caDSR homepage
    Given User opens caDSR Application
    When User Logins to the caDSR application
    Then Verify content to caDSR homepage

  @SNOWCADSR-123
  Scenario: Validate my caDSR ticket page
    Given User opens caDSR Application
    When User Logins to the caDSR application
    Then Start a new request
    Then Enter CADSR request details
    Then Click on Save button
    Then Go to View My Tickets
    Then Validate ticket ID in native view

  @SNOWCADSR-124 @SNOWCADSR-134
  Scenario: Validate read only view of my tickets
    Given User opens caDSR Application
    When User Logins to the caDSR application
    Then Start a new request
    Then Enter CADSR request details
    Then Click on Save button
    Then Go to View My Tickets
    Then User should see read only view of the ticket

  @SNOWCADSR-132 @SNOWCADSR-192
  Scenario: Validate autofill of user record information
    Given User opens caDSR Application
    When User Logins to the caDSR application
    Then Start a new request
    Then Validate autofill of user record information

  @SNOWCADSR-133
  Scenario: Validate workflow progress indicator
    Given User opens caDSR Application
    When User Logins to the caDSR application
    Then Go to view my tickets
    Then Open latest ticket
    Then User should see workflow progress indicator

  @SNOWCADSR-135
  Scenario: Validate content to caDSR request form
    Given User opens caDSR Application
    When User Logins to the caDSR application
    Then Start a new request
    Then Validate static text in request form

  @SNOWCADSR-148
  Scenario: Validate curation count of child tickets roll up to parent ticket
    Given User opens caDSR Application
    When User Logins to the caDSR application
    Then Start a new request
    Then Enter CADSR request details
    Then Select multipl curation operations
    Then Click on Save button
    Then Click on Complete button
    Then Go to native view
    Then Open latest caDSR ticket
    Then Goto curation task and open first curation task
    Then Update curation count
    Then User should see updated curation count for parent ticket

  @SNOWCADSR-149
  Scenario: Validate create new button in my ticket page
    Given User opens caDSR Application
    When User Logins to the caDSR application
    Then Go to View My Tickets
    Then User should see new request button

  @SNOWCADSR-151
  Scenario: Validate notification to customer when request due date has been updated
    Given User opens caDSR Application
    When User Logins to the caDSR application
    Then Start a new request
    Then Enter CADSR request details
    Then Click on Save button
    Then Click on Complete button
    Then Go to native view
    Then Impersonate user as service now user
    Then Go to native view
    Then Open latest caDSR ticket
    Then Update request due date

  @SNOWCADSR-170
  Scenario: Validate caDSR Service Portal Breadcrumbs
    Given User opens caDSR Application
    When User Logins to the caDSR application
    Then Go to View My Tickets
    Then Check if breadcrumb is present as "My caDSR Tickets"

  @SNOWCADSR-171
  Scenario: Validate snc_internal user submitting caDSR request form
    Given User opens caDSR Application
    When User Logins to the caDSR application
    Then Go to native view
    When Impersonate Dianna Kelly as service now user
    Given User opens caDSR Application
    Then Start a new request
    Then User should see request form

  @SNOWCADSR-182
  Scenario: Validate SOW Number to reference field of Request
    Given User opens caDSR Application
    When User Logins to the caDSR application
    Then Start a new request
    Then Enter CADSR request details
    Then Click on Save button
    Then Go to native view
    Then Open latest caDSR ticket
    Then User should see default SOW number selected

  @SNOWCADSR-184
  Scenario: Validate different login options in landing page of Helpdesk portal
    Given User opens caDSR Home Page
    Then User should see multiple widget

  @SNOWCADSR-185
  Scenario: Validate Fulfiller users closing a ticket without filling in “Resolution info”
    Given User opens caDSR Application
    When User Logins to the caDSR application
    Then Start a new request
    Then Enter CADSR request details without curation tasks
    Then Click on Save button
    Then Go to native view
    Then Open latest caDSR ticket
    Then Close ticket without filling resolution info

  @SNOWCADSR-186
  Scenario: Validate Parent Child relationship to allow reference to previous ticket
    Given User opens caDSR Application
    When User Logins to the caDSR application
    Then Start a new request
    Then Enter CADSR request details
    Then Click on Save button
    Then Click on Complete button
    Then Go to native view
    Then Impersonate user as service now user
    Then Go to native view
    Then Open latest caDSR ticket
    Then Click on Resolve
    Then Start a new request on service now portal
    Then Reference it to previous ticket

  @SNOWCADSR-188
  Scenario: Validate hiding Services/Knowledge/QuickLinks menu within caDSR portal
    Given User opens caDSR Application
    When User Logins to the caDSR application
    Then Verify content to caDSR homepage
    Then User shouldnt see Services, Knowledge, QuickLinks menu

  @SNOWCADSR-189
  Scenario: Validate hiding Login, Tickets Link within caDSR portal
    Given User opens caDSR Application
    When User Logins to the caDSR application
    Then Verify ticket link shouldnt be available

  @SNOWCADSR-197
  Scenario: Validate Remove Ticket Detail Link from My Ticket Status View.
    Given User opens caDSR Application
    When User Logins to the caDSR application
    Then Go to view my tickets
    Then Open latest ticket
    Then User shouldnt see Ticket detail link

  @SNOWCADSR-198
  Scenario: Validate submission confirmation page with View My tickets button
    Given User opens caDSR Application
    When User Logins to the caDSR application
    Then Start a new request
    Then Enter CADSR request details
    Then Click on Save button
    Then Click on Complete button
    Then Click on View my Ticket

  @SNOWCADSR-203
  Scenario: Validate Removal of Add Watchers and Add Attachments buttons on My Ticket Status" view
    Given User opens caDSR Application
    When User Logins to the caDSR application
    Then Go to View My Tickets
    Then Open Latest Ticket
    Then User shouldnt have Add watcher and Add Attachments button

  @SNOWCADSR-204
  Scenario: Validate Help text to the Curation Operations field on the ServiceNow Portal
    Given User opens caDSR Application
    When User Logins to the caDSR application
    Then Start a new request
    Then Select Curation task and Varify help text

  @SNOWCADSR-205
  Scenario: Validate Format of new Attachment page to match current caDSR format
    Given User opens caDSR Application
    When User Logins to the caDSR application
    Then Start a new request
    Then Enter CADSR request details
    Then Click on Save button
    Then User should see new format of add attachment page with matching current caDSR format

  @SNOWCADSR-213
  Scenario: Validate Closing all associated subtask will auto-resolve the parent ticket
    Given User opens caDSR Application
    When User Logins to the caDSR application
    Then Start a new request
    Then Enter CADSR request details
    Then Click on Save button
    Then Go to native view
    Then Open latest caDSR ticket
    Then Open child ticket
    Then Close latest child ticket
    Then Validate parent ticket status

  @SNOWCADSR-215
  Scenario: Validate external users adding additional Contact email addresses on the Request Form
    Given User opens caDSR Application
    When User Logins to the caDSR application
    Then Start a new request
    Then User should be able to enter additional contact email addresses

  @SNOWCADSR-216
  Scenario: Validate caDSR fulfiller to Re-open caDSR Task if parent ticket state is not equal to Closed
    Given User opens caDSR Application
    When User Logins to the caDSR application
    Then Start a new request
    Then Enter CADSR request details
    Then Select multipl curation operations
    Then Click on Save button
    Then Go to native view
    Then Open latest caDSR ticket
    Then Open child ticket
    Then Close latest child ticket
    Then User should be able to reopen child ticket

  @SNOWCADSR-219
  Scenario: Validate Remove Hyperlink from Request Form Text on Login page
    Given User opens caDSR Home Page
    Then User shouldnt see hyperlink on the Request Form

  @SNOWCADSR-223
  Scenario: Validate Hiding Get help footer
    Given User opens caDSR Home Page
    Then User shouldnt see Get Help Footer

  @SNOWCADSR-225 @SNOWCADSR-214
  Scenario Outline: Validate Two Way Ticket assignment (By Assignment Group Or Assigned To)
    Given User opens caDSR Application
    When User Logins to the caDSR application
    Then Start a new request
    Then Enter CADSR request details
    Then select the organization name as "<OrganizationName>"
    Then Click on Save button
    Then Click on Complete button
    Then Go to native view
    Then Open latest caDSR ticket
    Then User should see assignment group as "<AssignmentGroup>"

    Examples:
      | OrganizationName                                     | AssignmentGroup |
      | Alliance (Alliance for Clinical Trials in Oncology ) | caDSR Green     |
      | AMC (Aids Malignancy Consortium)                     | caDSR Red       |
      | CCR (NCI Center for Cancer Research)                 | caDSR Green     |
      | CDS (Cancer Data Service)                            | caDSR Blue      |

  @SNOWCADSR-232
  Scenario: Validate Update Requested For Info onChange updating requested_for
    Given User opens caDSR Application
    When User Logins to the caDSR application
    Then Start a new request
    Then Update Requested For and validated updated Phone , email and organisation based on selection

  @SNOWCADSR-233
  Scenario: Validate external and internal caDSR Users to upload to caDSR request
    Given User opens caDSR Application
    When User Logins to the caDSR application
    Then Start a new request
    Then Enter CADSR request details
    Then Click on Save button
    Then User should have option to upload attachment

  @SNOWCADSR-234
  Scenario: Validate Update caDSR portal URL to cadsr-curation
    Given User opens caDSR Home Page
    Then Validate caDSR portal URL

  @SNOWCADSR-237
  Scenario: Validate Refactor Curation Count Requirement and Validation
    Given User opens caDSR Application
    When User Logins to the caDSR application
    Then Start a new request
    Then Enter CADSR request details
    Then Click on Save button
    Then Click on Complete button
    Then Go to native view
    Then Open latest caDSR ticket
    Then Open child ticket
    Then Complete child ticket and update
    Then Close parent ticket without curation count and update

  @SNOWCADSR-247
  Scenario: Validate phone number on Portal request form to a non-required field
    Given User opens caDSR Application
    When User Logins to the caDSR application
    Then Start a new request
    Then Enter CADSR request details
    Then Clear default phone number
    Then Click on Save button

  @SNOWCADSR-248
  Scenario: Validate Close incomplete Status and /or Resolved tickets from My Historical Ticket View
    Given User opens caDSR Application
    When User Logins to the caDSR application
    Then Go to View My Tickets
    Then Go to View My Historical Ticket
    Then Validate close incomplete and resolved tickets

  @SNOWCADSR-249
  Scenario: Validate My Active Ticket query result to show Resolved and Close Incomplete Tickets
    Given User opens caDSR Application
    When User Logins to the caDSR application
    Then Go to View My Tickets
    Then Validate resolved and close incomplete tickets

  @SNOWCADSR-257
  Scenario: Validate email validation to additional email contact
    Given User opens caDSR Application
    When User Logins to the caDSR application
    Given User opens caDSR Application
    Then Start a new request
    Then Enter CADSR request details
    Then User should see error message when he enter invalid additional contact email addresses

  @SNOWCADSR-258
  Scenario: Validate confirm button to My Active Ticket View for "Resolved Tickets"
    Given User opens caDSR Application
    When User Logins to the caDSR application
    Given User opens caDSR Application
    Then Start a new request
    Then Enter CADSR request details
    Then Click on Save button
    Then Click on Complete button
    Then Go to native view
    Then Open latest caDSR ticket
    Then Open child ticket
    Then Complete child ticket and update
    Then Resolve parent ticket without curation count and update
    Given User opens caDSR Application
    Then Go to View My Tickets
    Then Validate resolved confirmed status

  @SNOWCADSR-262
  Scenario: Validate update of caDSR to caDSR II to reflect New application on the Native View
    Given User opens caDSR Application
    When User Logins to the caDSR application
    Given User opens caDSR Application
    Then Go to native view
    # Then Open latest caDSR ticket
    Then Validate update of caDSR to caDSR II

  #Fail not re-directed to home page
  #@SNOWCADSR-206 @SNOWCADSR-207
  #Scenario: Validate re-direct unauthenticated users from caDSR tickets and caDSR request form to homepage
    #Given User opens caDSR Application
    #Then Go to a new request page
    #Then User should be re-directed to homepage
    #Then Go to my tickets
    #Then User should be re-directed to homepage
    #Then Go to my ticket view
    #Then User should be re-directed to homepage

  @SNOWCADSR-259
  Scenario: Validate closed tickets are not editable
    Given User opens caDSR Application
    When User Logins to the caDSR application
    Then Start a new request
    Then Enter CADSR request details
    Then Click on Save button
    Then Click on Complete button
    Then Go to native view
    Then Open latest caDSR ticket
    Then Open child ticket
    Then Complete child ticket and update
    Then Close parent ticket without curation count and update
    Then Open latest caDSR ticket
    Then verify that the fields are disabled
