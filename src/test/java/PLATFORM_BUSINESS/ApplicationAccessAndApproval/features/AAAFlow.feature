Feature: AAA flow

  Description: This feature file contains scenarios relating to AAA Portal

  @selenium @Alena @Regression @AAA-37
  Scenario: AAA log in from portal view
    Given  Submitter User logged in to AAA Portal
    And User navigates to AAA form via menu
    Then Submitter User can verify they are on the AAA form

  @selenium @Alena @Regression @AAA-1 @Progression
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