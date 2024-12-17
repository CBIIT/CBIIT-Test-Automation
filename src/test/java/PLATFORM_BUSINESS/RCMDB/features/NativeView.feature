@AllRCMDB
Feature: Recordmanagement feature files

  @RCMDBHomePage @SNOWRMDB-1
  Scenario: Naviate to the landing page and verify the labels
    Given user navigates to the Record management home page
    Then User logins to the application for RCMDB
    Then Go to Native view of application
    Then verify that the page has all the existing labels

  @SNOWRMDB-10
  Scenario: Naviate to the create new record form and create new tracking record
    Given user navigates to the Record management home page
    Then User logins to the application for RCMDB
    Then User clicks on create new record button
    Then Fill all the details
    Then Click on submit
    Then Validate added new record

   @SNOWRMDB-13 @SNOWRMDB-25
  Scenario: Validate Tracking log
    Given user navigates to the Record management home page
    Then User logins to the application for RCMDB
    Then User clicks on all tracking records
    Then Validate tracking log

    @SNOWRMDB-32
  Scenario: Customer Name Manually Entered not accepted
    Given user navigates to the Record management home page
    Then User logins to the application for RCMDB
    Then User clicks on create new record button
    Then Enter customer name manually
    Then User should see error message

    @SNOWRMDB-24
  Scenario: Validate character length  for fields
    Given user navigates to the Record management home page
    Then User logins to the application for RCMDB
    Then User clicks on create new record button
    Then Enter Disposition Authority more than accepted limit

    @RCMDB
  Scenario: Naviate to the RM Tracking record Import and create new tracking record
    Given user navigates to the Record management home page
    Then User logins to the application for RCMDB
    Then User clicks on RM Tracking Record Import
    Then Click on new RM Tracking record
    Then Fill all the record details
    Then Click on submit record

     @QuaterlyCost
  Scenario: Navigate to the Quaterly Costs and create new Quaterly Cost
    Given user navigates to the Record management home page
    Then User logins to the application for RCMDB
    Then User clicks on Quarterly Costs
    Then Click on new Quarterly Cost
    Then Fill all the Quarterly Cost details
    Then Click on submit button
    Then Validate added recorded