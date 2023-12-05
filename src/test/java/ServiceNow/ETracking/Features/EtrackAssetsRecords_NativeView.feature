Feature: Etrack Assets Records Test Scenarios

  @ETRACK-2 @ETRACK-14 @chaudhryma @Regression
  Scenario: Test Delete Asset Records
    Given a eTracking user opens an Asset record
    Then there is a Delete button
    When the user clicks the Delete button
    Then the record is deleted

  @ETRACK-6 @ETRACK-9 @chaudhryma @Regression
  Scenario: Create Asset Information Field
    Given an eTracking user is on an Asset record
    Then there is a free text field called "Asset information"
    And the user is able to enter at least one thousand characters

  @ETRACK-3 @ETRACK-15 @chaudhryma @Regression
  Scenario:Test Update Description Field
    Given a eTracking user opens an Asset record
    Then the user opens the Model record
    And there is field called "Description"
    Then the user is able to make text changes to the Description field at any time

  @ETRACK-4 @ETRACK-16 @chaudhryma @Regression
  Scenario:Test Asset Expiration Date Field
    Given an eTracking user is on an Asset record
    Then there is a date picker field called "Expiration date"
    When the user clicks the Expiration Date Calendar icon field
    Then the user is able to select any date

  @ETRACK-5 @ETRACK-17 @chaudhryma @Regression
  Scenario: Test Update Barcode to Decal Number
    Given an eTracking user is on an Asset record
    Then there is a field called "Decal number"
    And there is no field called "Barcode"