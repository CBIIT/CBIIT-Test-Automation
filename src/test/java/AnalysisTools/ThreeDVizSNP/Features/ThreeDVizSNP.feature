@ThreeDVizSNP
Feature: TheeDVizSNP features

  @satya @Smoke @Regression @CIATWP-5911 @NCIATWP-5942
  Scenario: 3DVizSNP application is up and running
    Given User navigates to 3DVizSNP page
    Then verify that vizulise and about tabs are available

  @satya @Regression @NCIATWP-6014
  Scenario: 3DVizSNP is able to submit vcf file
    Given User navigates to 3DVizSNP page
    Then upload the vcf file and submit

  @Satya @Regression @NCIATWP-5931
  Scenario: 3DVizSNP Download Results validation
    Given User navigates to 3DVizSNP page
    When User clicks Visualize Button
    Then User should see the vcf text and one file upload filed
    And User clicks choose file and upload the vcf file
    And User clicks submit button
    And User should click OK in Alert

  @Satya1 @Regression @Smoke @NCIATWP-5931 @NCIATWP-5955
  Scenario: 3DVizSNP Total Number of records Validation
    Given User navigates to 3DVizSNP page
    When User clicks Visualize Button
    And User clicks choose file and upload the vcf file
    And User clicks submit button
    And User should click OK in Alert
    Then User should verify that Records are getting displayed as expected

  @Satya @Smoke @Regression @NCIATWP-5955
  Scenario: 3DVizSNP Varient Highlight Validation
    Given User navigates to 3DVizSNP page
    When User clicks Visualize Button
    And User clicks choose file and upload the vcf file
    And User clicks submit button
    And User should click OK in Alert
    Then User clicks Other varient
    Then Verify that selected varient is getting highlighted and exact dimensions are getting displayed

  @Satya @Regressionn @NCIATWP-5919 @NCIATWP-5955
  Scenario: 3DVizSNP Records sorting Validation
    Given User navigates to 3DVizSNP page
    When User clicks Visualize Button
    And User clicks choose file and upload the vcf file
    And User clicks submit button
    And User should click OK in Alert
    Then User clicks on varient header
    Then Verify that sorting order is getting changed based on varient

  @Satya @Smoke @Regression @NCIATWP-5984
  Scenario: 3DVizSNP Records Filter Validation
    Given User navigates to 3DVizSNP page
    When User clicks Visualize Button
    And User clicks choose file and upload the vcf file
    And User clicks submit button
    And User should click OK in Alert
    Then User entered 'random' filter
    Then Verify Records are getting filtered as expected

  @Satya @Regression @Smoke @NCIATWP-6023
  Scenario: 3DVizSNP Long Running Job Email Validation
    Given User navigates to 3DVizSNP page
    When User clicks Visualize Button
    And User clicks choose file and upload the vcf file
    And user clicks Long-running Job checkbox,entering email and name
    And User clicks submit button
    Then User should verify that email notification is sent

  @Satya @Smoke @regression @NCIATWP-5984
  Scenario: 3DVizSNP invalid Gene symbol validation
    Given User navigates to 3DVizSNP page
    When User clicks Visualize Button
    And User clicks choose file and upload the vcf file
    And User enter invalid text in Gene Textbox '12345'
    And User clicks submit button
    Then User should verify Error message Gene symbols searched for are not found in the attached file is getting displayed.

  @Satya @Smoke @Regression @NCIATWP-6522
  Scenario: 3DVizSNP invalid vcf file validation
    Given User navigates to 3DVizSNP page
    When User clicks Visualize Button
    And User clicks choose file and upload invalid file
    And User clicks submit button
    Then User should verify Error message Visualization Job Failed is getting displayed.

  @Satya @Smoke @Regression @NCIATWP-6012 @NCIATWP-6037
  Scenario: 3DVizSNP svg,png,json download validation
    Given User navigates to 3DVizSNP page
    When User clicks Visualize Button
    And User clicks choose file and upload the vcf file
    And User clicks submit button
    And User should click OK in Alert
    Then User clicks svg,json,png button and download files

  @Satya @Smoke @Regression @NCIATWP-6013
  Scenario: 3DVizSNP mini windows interaction(expand,minimize,close) validation
    Given User navigates to 3DVizSNP page
    When User clicks Visualize Button
    And User clicks choose file and upload the vcf file
    And User clicks submit button
    And User should click OK in Alert
    Then Verify that all the mini windows are interactable

  @Satya @Smoke @Regression @NCIATWP-5916 @NCIATWP-6028
  Scenario: 3DVizSNP feedback button validation
    Given User navigates to 3DVizSNP page
    When User clicks Visualize Button
    And User clicks choose file and upload the vcf file
    And User clicks submit button
    And User should click OK in Alert
    Then user clicks feedback button
