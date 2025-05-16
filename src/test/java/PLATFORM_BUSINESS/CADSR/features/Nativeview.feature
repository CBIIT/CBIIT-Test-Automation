@CADSRNative @AllCADSR
Feature: CADSR feature files

  @CADSRNativeViewRequest @SNOWCADSR-57
  Scenario: Validate caDSR Native View Request Form
    Given User opens caDSR Application
    When User Logins to the caDSR application
    Then Go to Native view of the application
    Then Go to CADSR Requests
    Then Start a new request on native view
    Then User should see Save, Add Attachments and Submit button


  @SNOWCADSR-109
  Scenario: Validate default columns for incident grid
    Given User opens caDSR Application
    When User Logins to the CADSR application
    Then Go to Native view of the application
    Then Go to CADSR Requests
    Then User should see default columns for incident grid

  @SNOWCADSR-201
  Scenario: Validate caDSRTASK Status choices
    Given User opens caDSR Application
    When User Logins to the caDSR application
    Then Go to Native view of the application
    Then Go to CADSR Requests
    Then Start a new request on native view
    Then User should see available different choices of status

  @SNOWCADSR-200
  Scenario: Validate Change State field to Status on caDSR task/ticket forms
    Given User opens caDSR Application
    When User Logins to the caDSR application
    Given User opens caDSR Application
    Then Go to native view
    Then Open latest caDSR ticket
    Then User should see Status field

  @SNOWCADSR-226
  Scenario: Open parent ticket update assigned to validate child ticket gets the same assigned to person
    Given User opens caDSR Application
    When User Logins to the caDSR application
    Given User opens caDSR Application
    Then Start a new request
    Then Enter CADSR request details
    Then Click on Save button
    Then Click on Complete button
    Then Go to native view
    Then Open latest caDSR ticket
    Then Set Assigned to and save
    Then Open child ticket
    Then Validate assigned to value in child ticket

  @SNOWCADSR-245
  Scenario: Open child ticket check reference to parent ticket
    Given User opens caDSR Application
    When User Logins to the caDSR application
    Given User opens caDSR Application
    Then Go to native view
    Then Open latest caDSR ticket
    Then Open child ticket
    Then Validate parent ticket reference

  @SNOWCADSR-298
  Scenario: Validate text on landing page and Portal Request Form page
    Given User opens caDSR Application
    When User Logins to the caDSR application
    Then validate text on landing page
    Then Start a new request
    Then validate text on request form page

  @SNOWCADSR-299 @SNOWCADSR-255
  Scenario: Validate multiple email ids can be added to  portal request form
    Given User opens caDSR Application
    When User Logins to the caDSR application
    Then Start a new request
    Then Enter CADSR request details
    Then try adding one more email id
    Then Click on Save button
    Then Click on Complete button

  @SNOWCADSR-300
  Scenario: validate Vulnerability Disclosure Policy (VDP) Program URL to Portal pages footer
    Given User opens caDSR Application
    When User Logins to the caDSR application
    Then validate page footer
    Then Start a new request
    Then validate page footer

  @SNOWCADSR-256
  Scenario: Validate the organization list on portal view request
    Given User opens caDSR Application
    When User Logins to the caDSR application
    Then Start a new request
    Then validate that the list of organiation is as expected

  @SNOWCADSR-246
  Scenario: Validate that the details field is not mandatory on portal request form
    Given User opens caDSR Application
    When User Logins to the caDSR application
    Then Start a new request
    Then Enter CADSR request details
    Then Click on Save button
    Then validate that user is able to complete the form without entering data in details form