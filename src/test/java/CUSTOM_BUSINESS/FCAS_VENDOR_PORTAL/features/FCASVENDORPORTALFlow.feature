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

  @Alena @Regression @selenium @OASYS-3657
  Scenario: Edit contract information Submit COA option
    Given User accepts PII Disclaimer
    And User is on Existing Contracts page
    And User chooses Existing Contracts Submit COA option
    Then User can see Submit COA page header
    And User can see COA Requirement dropdown
    And User can see COA field
    And User can see Title field
    And User can see Primary Contact dropdown
    And User can see Associates dropdown
    And User can see Comments field
    And User can see Choose File button
    Then User clicks Cancel button

  @Alena @Regression @selenium @OASYS-3657
  Scenario: Edit contract information Submit Work Order option
    Given User accepts PII Disclaimer
    And User is on Existing Contracts page
    And User chooses Existing Contracts Submit Work Order option
    Then User can see Submit Work Order page header
    And User can see Version Work Order field
    And User can see Work Order field
    And User can see Title field
    And User can see Package Type dropdown
    And User can see Primary Contact dropdown
    And User can see Associates dropdown
    And User can see Estimate field
    And User can see Beneficiary Occupancy Date field
    And User can see Project ID field
    And User can see Directorate Customer field
    And User can see Directorate field
    And User can see Building field
    And User can see Room field
    And User can see Comments field
    And User can see Choose File button
    Then User clicks Cancel button

  @Alena @Regression @selenium @OASYS-3657
  Scenario: Edit contract information Submit Notification option
    Given User accepts PII Disclaimer
    And User is on Existing Contracts page
    And User chooses Existing Contracts Submit Notification option
    Then User can see Submit Notification page header
    And User can see Notification Type dropdown
    And User can see Notification field
    And User can see Title field
    And User can see Primary Contact dropdown
    And User can see Associates dropdown
    And User can see Comments field
    And User can see Choose File button
    Then User clicks Cancel button

  @Alena @Regression @selenium @OASYS-3623
  Scenario: Existing Contracts page layout
    Given User accepts PII Disclaimer
    And User is on Existing Contracts page
    And User can see Title column
    And User can see PIID column
    And User can see Ref PIID column
    And User can see Severability column
    And User can see PIID column
    And User can see Status column
    And User can see Est Ultimate Completion column

  @Alena @Regression @selenium @OASYS-3623
  Scenario: FCAS Vendor Portal tabs
    Given User accepts PII Disclaimer
    And User is on Existing Contracts page
    And User can see Existing Contracts tab
    When User clicks on Planning tab
    Then User can verify Planning tab page header
    When User clicks on Solicitations tab
    Then User can verify Solicitation tab page header
    When User clicks on Company Account tab
    Then User can verify Company Account tab page header

  @Alena @Regression @selenium @OASYS-3765
  Scenario: FCAS Vendor Portal User leaves feedback
    Given User accepts PII Disclaimer
    When User chooses to leave feedback
    Then User is on Leave Feedback modal
    And User chooses Yes for The FCAS Vendor Portal application was user friendly
    And User chooses No for was easy to upload document files to the FCAS Vendor Portal
    And User chooses No for Is there additional information you think should be included in the FCAS Vendor Portal User Guide
    And User chooses Yes for Is the FCAS Vendor Portal organized in a user-friendly way
    And User inputs comments for Is there anything else you think we should know regarding the FCAS Vendor Portal Application question
    And User clicks Submit feedback button