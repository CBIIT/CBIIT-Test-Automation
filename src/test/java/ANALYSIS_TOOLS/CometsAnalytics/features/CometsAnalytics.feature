@cometsanalystics
Feature: This feature files is for Comets Analytics features

  @satya @Smoke @Regression  @selenium @NCIATWP-4391 @NCIATWP-6290
  Scenario: Verify user is able to open home page and got to analysis page
    Given User navigates to comets analytics home page
    Then Click on perform analysis button
    Then verify that user is on anaysis page

  @satya @Smoke @Regression @selenium @NCIATWP-4411 @NCIATWP-6292
  Scenario: Verify user is able to open footer links
    Given User navigates to comets analytics home page
    When User clicks on footer links like about comets and verify new tab is opened
    When User clicks on footer links like tutorials and verify new tab is opened
    When User clicks on footer links like vigenette and verify new tab is opened

  @satya @Smoke @Regression @selenium @NCIATWP-4427
  Scenario: Verify user is able to access the footer links on about page
    Given User navigates to comets analytics home page
    When User clicks About button
    Then User should be able to view Help, Accessibility, Current Version Functionality, Acknowledgements, Citation is getting displayed

  @satya @Smoke @Regression @selenium @NCIATWP-4429
  Scenario: Verify user is able to download sample input.
    Given User navigates to comets analytics home page
    When User clicks on Analysis button
    And User clicks on Download Sample Input

  @satya @Smoke @Regression @selenium @NCIATWP-4413
  Scenario: Verify that user is able to view integrity check
    Given User navigates to comets analytics home page
    When User clicks on Analysis button
    And User selects option 'EPIC' from Comets Chorot Dropdown
    And User upload file and click check integrity
    Then User should be able to view the Sucess message "Integrity Check Successful"

  @satya @Smoke @Regression @selenium @NCIATWP-4444
  Scenario: Verify that user is able to get error on uploading invalid file
    Given User navigates to comets analytics home page
    When User clicks on Analysis button
    And User selects option 'EPIC' from Comets Chorot Dropdown
    And User upload invalid file and click check integrity
    Then User should be able to view the Error Message "Integrity Check Failed"

  @satya @Smoke @Regression @selenium @NCIATWP-4446 @NCIATWP-4451
  Scenario: Verify that user is able to reset button
    Given User navigates to comets analytics home page
    When User clicks on Analysis button
    And User selects option 'EPIC' from Comets Chorot Dropdown
    And User should cick reset button
    Then user should verify that its reseted and  cohort dropdown value is "Other/Undefined"

  @satya @Regression @selenium @NCIATWP-4475
  Scenario: Verify that user is able to download report
    Given User navigates to comets analytics home page
    When User clicks on Analysis button
    And User selects option 'EPIC' from Comets Chorot Dropdown
    And User upload file and click check integrity
    Then User clicks download report, report should get downloaded

  @satya @Smoke @Regression @selenium @NCIATWP-6295
  Scenario: Verify that user is able to click all models
    Given User navigates to comets analytics home page
    When User clicks on Analysis button
    And User selects option 'EPIC' from Comets Chorot Dropdown
    And User upload file and click check integrity
    And User should be click all models set email id as "test@test.com" and click run models
    Then User should get success message and result should be emailed.

  @satya @Smoke @Regression @selenium @NCIATWP-6470
  Scenario: Verify that user is able to click pre-specified models
    Given User navigates to comets analytics home page
    When User clicks on Analysis button
    And User selects option 'EPIC' from Comets Chorot Dropdown
    And User upload file and click check integrity
    And User should be click pre-specified models and use model type should be clicked
    And User should select option from Model type dropdown and Model Dropdown and click run model
    Then User should be able to view the downlad button

  @satya @Regression @Smoke @selenium @NCIATWP-4141
  Scenario: Verify that user is able to click custom models
    Given User navigates to comets analytics home page
    When User clicks on Analysis button
    And User selects option 'EPIC' from Comets Chorot Dropdown
    And User upload file and click check integrity
    And User should be click custom models and use model type should be clicked
    And User should select option from Model type dropdown and and enter model name
    And User should fill all the custom model parameters and click run model
    Then User should be able to view the results

  @satya @Regression @selenium @NCIATWP-6345
  Scenario: Verify that user is able to view heatmap
    Given User navigates to comets analytics home page
    When User clicks on Analysis button
    And User selects option 'EPIC' from Comets Chorot Dropdown
    And User upload file and click check integrity
    And User should be click pre-specified models and use model type should be clicked
    And User should select option from Model type dropdown and Model Dropdown and click run model
    Then User should able to click HeatMap
    Then User should verify sort starte By, Sort outcome, P-value functionality are working

  @satya @Smoke @Regression @selenium @NCIATWP-8700
  Scenario: Verify that user is able to reset under Method of Analyses
    Given User navigates to comets analytics home page
    When User clicks on Analysis button
    And User selects option 'EPIC' from Comets Chorot Dropdown
    And User upload file and click check integrity
    Then User clicks on the reset button under Method of Analyses
    Then user should verify that its reseted and  cohort dropdown value is "Other/Undefined"

  @satya @Smoke @Regression @selenium @NCIATWP-8691
  Scenario: Verify that user is able to remove the integrity success message
    Given User navigates to comets analytics home page
    When User clicks on Analysis button
    And User selects option 'EPIC' from Comets Chorot Dropdown
    And User upload file and click check integrity
    Then user clicks on the cross available in the integrity success message
    Then User should not be able to view the Success message "Integrity Check Successful"

  @satya @Smoke @Regression @selenium @NCIATWP-8701
  Scenario: Verify that user is able to change data visibility under model results run from method of analyses
    Given User navigates to comets analytics home page
    When User clicks on Analysis button
    And User selects option 'EPIC' from Comets Chorot Dropdown
    And User upload file and click check integrity
    And User should be click pre-specified models and use model type should be clicked
    And User should select option from Model type dropdown and Model Dropdown and click run model
    Then User changes the model result visibility from the dropdown

  @satya @Smoke1 @Regression @selenium @NCIATWP-8703
  Scenario: Verify that user is able to download report
    Given User navigates to comets analytics home page
    When User clicks on Analysis button
    And User selects option 'EPIC' from Comets Chorot Dropdown
    And User upload file and click check integrity
    And User should be click pre-specified models and use model type should be clicked
    And User should select option from Model type dropdown and Model Dropdown and click run model
    Then User clicks on the download results button
    Then User clicks on the Last button in the model result page