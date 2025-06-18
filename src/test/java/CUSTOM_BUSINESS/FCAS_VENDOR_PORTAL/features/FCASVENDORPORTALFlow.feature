Feature: FCAS Vendor Portal Flow

  Background: common steps
    Given User is logged in to the FCAS Vendor Portal

  @Alena @Regression @selenium @OASYS-4122
  Scenario: Edit contract information
    Given User accepts PII Disclaimer
    And User is on Existing Contracts page
    When User clicks on All Contracts dropdown
    Then User can see All Contracts and My Contracts options
    And User can see Show Closed Contracts option
    And User can see a search page text field


  @Alena @Regression @selenium @OASYS-3657
  Scenario: Edit contract information Submit Invoice option
    Given User accepts PII Disclaimer
    And User is on Existing Contracts page
    And User chooses Existing Contracts Submit Invoice option
    Then User can see Submit Invoice page header
    And User can see Invoice field
    And User can see Invoice date field
    And User can see Start date field
    And User can see End date field
    And User can see Amount field
    And User can see Invoice date field
    And User can see Submission Type dropdown
    And User can see Primary Contact dropdown
    And User can see Associates dropdown
    And User can see Comments field
    And User can see Choose File button
    Then User clicks Cancel button

  @Alena @Regression @selenium @OASYS-3657
  Scenario: Edit contract information Submit Deliverable option
    Given User accepts PII Disclaimer
    And User is on Existing Contracts page
    And User chooses Existing Contracts Submit Deliverable option
    Then User can see Submit Deliverable page header
    And User can see Status Filter dropdown
    And User can see Scheduled field
    And User can see Unscheduled field
    Then User clicks Cancel button

