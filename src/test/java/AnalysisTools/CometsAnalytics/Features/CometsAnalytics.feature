@cometsanalystics
Feature: This feature files is for Comets Analytics features

  @satya @Smoke @Regression @NCIATWP-4391 @NCIATWP-6290
  Scenario: Verify user is able to open home page and got to analysis page
    Given User navigates to comets analytics home page
    Then Click on perform analysis button
    Then verify that user is on anaysis page

  @satya @Regression @NCIATWP-4411 @NCIATWP-6292
  Scenario: Verify user is able to open footer links
    Given User navigates to comets analytics home page
    When User clicks on footer links like about comets and verify new tab is opened
    When User clicks on footer links like tutorials and verify new tab is opened
    When User clicks on footer links like vigenette and verify new tab is opened

  @satya @Smoke @Regression @NCIATWP-4427
  Scenario: Verify user is able to About Page
    Given User navigates to comets analytics home page
    When User clicks About button
    Then User should be able to view Help, Accessibility, Current Version Functionality, Acknowledgements, Citation is getting displayed

  @satya @Regression @NCIATWP-4429
  Scenario: Verify user is able to download sample input.
    Given User navigates to comets analytics home page
    When User clicks on Analysis button
    And User clicks on Download Sample Input

  @satya @Regression @NCIATWP-4413
  Scenario: Verify that user is able to view integrity check
    Given User navigates to comets analytics home page
    When User clicks on Analysis button
    And User selects option 'EPIC' from Comets Chorot Dropdown
    And User upload file and click check integrity
    Then User should be able to view the Sucess message "Integrity Check Successful"

  @satya6 @Regression @NCIATWP-4444
  Scenario: Verify that user is able to get error on uploading invalid file
    Given User navigates to comets analytics home page
    When User clicks on Analysis button
    And User selects option 'EPIC' from Comets Chorot Dropdown
    And User upload invalid file and click check integrity
    Then User should be able to view the Error Message "Integrity Check Failed"

  @satya @Smoke @Regression @NCIATWP-4446 @NCIATWP-4451
  Scenario: Verify that user is able to reset button
    Given User navigates to comets analytics home page
    When User clicks on Analysis button
    And User selects option 'EPIC' from Comets Chorot Dropdown
    And User should cick reset button
    Then user should verify that its reseted and  cohort dropdown value is "Other/Undefined"

  @satya @Regressio @NCIATWP-4475
  Scenario: Verify that user is able to download report
    Given User navigates to comets analytics home page
    When User clicks on Analysis button
    And User selects option 'EPIC' from Comets Chorot Dropdown
    And User upload file and click check integrity
    Then User clicks download report, report should get downloaded

  @satya @Smoke @Regression @NCIATWP-6295
  Scenario: Verify that user is able to click all models
    Given User navigates to comets analytics home page
    When User clicks on Analysis button
    And User selects option 'EPIC' from Comets Chorot Dropdown
    And User upload file and click check integrity
    And User should be click all models set email id as "test@test.com" and click run models
    Then User should get success message and result should be emailed.

  @satya @Smoke @Regression @NCIATWP-6470
  Scenario: Verify that user is able to click pre-specified models
    Given User navigates to comets analytics home page
    When User clicks on Analysis button
    And User selects option 'EPIC' from Comets Chorot Dropdown
    And User upload file and click check integrity
    And User should be click pre-specified models and use model type should be clicked
    And User should select option from Model type dropdown and Model Dropdown and click run model
    Then User should be able to view the results

  @satya @Regression @NCIATWP-4141
  Scenario: Verify that user is able to click custom models
    Given User navigates to comets analytics home page
    When User clicks on Analysis button
    And User selects option 'EPIC' from Comets Chorot Dropdown
    And User upload file and click check integrity
    And User should be click custom models and use model type should be clicked
    And User should select option from Model type dropdown and and enter model name
    And User should fill all the custom model parameters and click run model
    Then User should be able to view the results

  @satya @Smoke @Regression @NCIATWP-6345
  Scenario: Verify that user is able to view heatmap
    Given User navigates to comets analytics home page
    When User clicks on Analysis button
    And User selects option 'EPIC' from Comets Chorot Dropdown
    And User upload file and click check integrity
    And User should be click pre-specified models and use model type should be clicked
    And User should select option from Model type dropdown and Model Dropdown and click run model
    Then User should able to click HeatMap
    Then User should verify sort starte By, Sort outcome, P-value functionality are working
