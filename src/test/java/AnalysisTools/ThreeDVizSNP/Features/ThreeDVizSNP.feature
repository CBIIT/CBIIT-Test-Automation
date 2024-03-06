@ThreeDVizSNP
Feature: TheeDVizSNP features

  @TC1 @satya @Smoke @Regression
  Scenario: 3DVizSNP application is up and running
    Given User navigates to 3DVizSNP page
    Then verify that vizulise and about tabs are available

  @TC2 @satya @Smoke @Refression
  Scenario: 3DVizSNP is able to submit vcf file
    Given User navigates to 3DVizSNP page
    #Then verify that vizulise and about tabs are available
    Then upload the vcf file and submit

  @TC3 @Satya @smoke @regression
  Scenario: 3DVizSNP Download Results validation
    Given User navigates to 3DVizSNP page
    When User clicks Visualize Button
    And User clicks choose file and upload the vcf file
    And User clicks submit button
    And User should click OK in Alert
    And User click Download Results button
    
    @TC4 @Satya @smoke @regression
  Scenario: 3DVizSNP Total Number of records Validation
    Given User navigates to 3DVizSNP page
    When User clicks Visualize Button
    And User clicks choose file and upload the vcf file
    And User clicks submit button
    And User should click OK in Alert
    Then User should verify that Records are getting displayed as expected
    
    @TC5 @Satya @smoke @regression
  Scenario: 3DVizSNP Varient Highlight Validation
    Given User navigates to 3DVizSNP page
    When User clicks Visualize Button
    And User clicks choose file and upload the vcf file
    And User clicks submit button
    And User should click OK in Alert
    Then User clicks Other varient
    Then Verify that selected varient is getting highlighted and exact dimensions are getting displayed
    
    @TC6 @Satya @smoke @regression
  Scenario: 3DVizSNP Records sorting Validation
    Given User navigates to 3DVizSNP page
    When User clicks Visualize Button
    And User clicks choose file and upload the vcf file
    And User clicks submit button
    And User should click OK in Alert
    Then User clicks on varient header
    Then Verify that sorting order is getting changed based on varient
    
    @TC7 @Satya @smoke @regression
  Scenario: 3DVizSNP Records Filter Validation
    Given User navigates to 3DVizSNP page
    When User clicks Visualize Button
    And User clicks choose file and upload the vcf file
    And User clicks submit button
    And User should click OK in Alert
    Then User entered 'random' filter 
    Then Verify Records are getting filtered as expected