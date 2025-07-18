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
    And User chooses No for "Was easy to upload document files to the FCAS Vendor Portal"
    And User chooses No answer for "Is there additional information you think should be included in the FCAS Vendor Portal User Guide"
    And User chooses Yes for portal being organized in a user-friendly way
    And User inputs comments for anything else field
    And User clicks Submit feedback button

  @Alena @Regression @selenium @OASYS-3623
  Scenario: Planning page layout
    Given User accepts PII Disclaimer
    And User navigates to Planning page
    And User can see Planning page header
    And User can see Search field
    And User can see All statuses dropdown
    And User can see Title Planning tab column
    And User can see ID column
    And User can see Requested by column
    And User can see Severability column
    And User can see Est. Award Date column
    And User can see Last Updated column
    And User can see Status column

  @Alena @Regression @selenium @OASYS-3623
  Scenario: Solicitations page quick filters
    Given User accepts PII Disclaimer
    And User navigates to Solicitations page
    And User can see Proposal Requested quick filter
    And User can see Active quick filter
    And User can see Submitted quick filter
    And User can see Rejected quick filter

  @Alena @Regression @selenium @OASYS-3623
  Scenario: Solicitations page layout
    Given User accepts PII Disclaimer
    And User navigates to Solicitations page
    And User can verify Solicitations page header
    And User can see Search field
    And User can see Title Solicitation tab column
    And User can see Solicitation column
    And User can see Division column
    And User can see Amendments column
    And User can see Price Type column
    And User can see Q&A End Date column
    And User can see Proposal Due Date column
    And User can see Last Updated column
    And User can see Status column

  @Alena @Regression @selenium @OASYS-3622
  Scenario: Company account page Details tab
    Given User accepts PII Disclaimer
    And User navigates to Company account page
    And User can verify Company Account tab page header
    When User clicks Edit button for Company Details
    Then User is on Edit Company Details modal
    And User can see name Edit Company Details field
    And User can see email Edit Company Details field
    And User can see DUNS Edit Company Details field
    And User can see mailing address Edit Company Details field
    Then User clicks Cancel button

  @Alena @Regression @selenium @OASYS-3622
  Scenario: Company account page Users tab
    Given User accepts PII Disclaimer
    And User navigates to Company account page
    And User clicks on Users tab
    And User can see Add User button
    And User can see Show Inactive Users option
    And User can see Search field
    And User can see name column of Users tab
    And User can see job title column of Users tab
    And User can see email column of Users tab
    And User can see phone column of Users tab
    And User can see access to view column of Users tab
    And User can see admin column of Users tab
    And User can see account active column of Users tab
