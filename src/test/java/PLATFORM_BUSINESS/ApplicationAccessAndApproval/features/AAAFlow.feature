Feature: AAA flow

  Description: This feature file contains scenarios relating to AAA Portal

  @selenium @Alena @Regression @AAA-37
  Scenario: AAA log in from portal view
    Given  Submitter User logged in to AAA Portal
    And User navigates to AAA form via menu
    Then Submitter User can verify they are on the AAA form

  @selenium @Alena @Regression @AAA-1
  Scenario: Validate AAA form fields in portal view
    Given  Submitter User logged in to AAA Portal
    And User navigates to AAA form via menu
    And User is on AAA form portal view
    And User can see Requested for dropdown
    And User can see Requested for field is prepopulated
    And User can see Requested for Email is prepopulated
    And User can see Requested for Organization Affiliation is prepopulated
    And User can see System Name dropdown
    And User can see Applications Datasources dropdown
    And User can see Application Datasource Short Description field
    And User can see DOC Level field
    And User can see User Role field
    And User can see Valid Until Date datepicker
    And User can see Business Justification field
    And User can see Federal Supervisor dropdown
    And User can see 2nd Level Federal Supervisor dropdown

  @selenium @Alena @Regression @AAA-37
  Scenario: Validate AAA form dropdown and text in portal view
    Given  Submitter User logged in to AAA Portal
    And User navigates to AAA form via menu
    And User is on AAA form portal view
    When User clicks on System Name dropdown
    Then User can see the expected System Name dropdown options
    When User clicks on Applications Datasources dropdown
    Then User can see Applications Datasources text input field
    And User can see Privilege level field text
    And User can see DOC level field text
    And User can see Valid Until Date field text
   And User can see Add Attachment button