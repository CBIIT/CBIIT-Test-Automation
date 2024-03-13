@ThreeDVizSNP
Feature: TheeDVizSNP features

  @TC1 @satya @Smoke @Regression 
  Scenario: 3DVizSNP application is up and running
    Given User navigates to 3DVizSNP page
    Then verify that vizulise and about tabs are available

  @TC2 @satya @Smoke @Regression
  Scenario: 3DVizSNP is able to submit vcf file
    Given User navigates to 3DVizSNP page
    Then upload the vcf file and submit

  @TC3 @Satya @smoke @Regression
  Scenario: 3DVizSNP Download Results validation
    Given User navigates to 3DVizSNP page
    When User clicks Visualize Button
    And User clicks choose file and upload the vcf file
    And User clicks submit button
    And User should click OK in Alert
    And User click Download Results button

  @TC4 @Satya @smoke @Regression
  Scenario: 3DVizSNP Total Number of records Validation
    Given User navigates to 3DVizSNP page
    When User clicks Visualize Button
    And User clicks choose file and upload the vcf file
    And User clicks submit button
    And User should click OK in Alert
    Then User should verify that Records are getting displayed as expected

  @TC5 @Satya @smoke @Regression
  Scenario: 3DVizSNP Varient Highlight Validation
    Given User navigates to 3DVizSNP page
    When User clicks Visualize Button
    And User clicks choose file and upload the vcf file
    And User clicks submit button
    And User should click OK in Alert
    Then User clicks Other varient
    Then Verify that selected varient is getting highlighted and exact dimensions are getting displayed

  @TC6 @Satya @smoke @Regressionn
  Scenario: 3DVizSNP Records sorting Validation
    Given User navigates to 3DVizSNP page
    When User clicks Visualize Button
    And User clicks choose file and upload the vcf file
    And User clicks submit button
    And User should click OK in Alert
    Then User clicks on varient header
    Then Verify that sorting order is getting changed based on varient

  @TC7 @Satya @smoke @Regression
  Scenario: 3DVizSNP Records Filter Validation
    Given User navigates to 3DVizSNP page
    When User clicks Visualize Button
    And User clicks choose file and upload the vcf file
    And User clicks submit button
    And User should click OK in Alert
    Then User entered 'random' filter
    Then Verify Records are getting filtered as expected

  @TC8 @Satya @smoke @Regression
  Scenario: 3DVizSNP Long Running Job Email Validation
    Given User navigates to 3DVizSNP page
    When User clicks Visualize Button
    And User clicks choose file and upload the vcf file
    And user clicks Long-running Job checkbox,entering email and name
    And User clicks submit button
    Then User should verify that email notification is sent

  @TC9 @Satya @smoke @regression
  Scenario: 3DVizSNP invalid Gene symbol validation
    Given User navigates to 3DVizSNP page
    When User clicks Visualize Button
    And User clicks choose file and upload the vcf file
    And User enter invalid text in Gene Textbox
    And User clicks submit button
    Then User should verify Error message Gene symbols searched for are not found in the attached file is getting displayed.

  @TC10 @Satya @smoke @Regression
  Scenario: 3DVizSNP invalid vcf file validation
    Given User navigates to 3DVizSNP page
    When User clicks Visualize Button
    And User clicks choose file and upload invalid file
    And User clicks submit button
    Then User should verify Error message Visualization Job Failed is getting displayed.

  @TC11 @Satya @smoke @Regression
  Scenario: 3DVizSNP svg,png,json download validation
    Given User navigates to 3DVizSNP page
    When User clicks Visualize Button
    And User clicks choose file and upload the vcf file
    And User clicks submit button
    And User should click OK in Alert
    Then User clicks svg,json,png button and download files
    
    @TC12 @Satya @smoke @Regression
  Scenario: 3DVizSNP mini windows interaction(expand,minimize,close) validation
    Given User navigates to 3DVizSNP page
    When User clicks Visualize Button
    And User clicks choose file and upload the vcf file
    And User clicks submit button
    And User should click OK in Alert
    Then Verify that all the mini windows are interactable
    
    @TC13 @Satya @smoke @Regression
  Scenario: 3DVizSNP feedback button validation
    Given User navigates to 3DVizSNP page
    When User clicks Visualize Button
    And User clicks choose file and upload the vcf file
    And User clicks submit button
    And User should click OK in Alert
    Then user clicks feedback button
