Feature: Scenarios for the API Access page on GWAS Explorer

  @Smoke @matakevin
  Scenario: API GET call for API Download
    Given user sends GET request for cancer phenotype
    Then user receives response for cancer phenotype

  @Progression @matakevin @NEEDSREVIEW
  Scenario: API GET call for API Participants
    Given user sends GET request for Participant data
    Then user receives response for Participant data

  @Smoke @matakevin
  Scenario: API GET call for API PCA
    Given user sends GET request for PCA
    Then user receives response for PCA

  @Smoke @matakevin
  Scenario: API GET call for API Phenotypes
    Given user sends GET request for phenotype
    Then user receives response for phenotype

  @Smoke @matakevin
  Scenario: API GET call for API Ping
    Given user sends GET request for API Ping
    Then user receives response for API Ping

  @Smoke @matakevin
  Scenario: API GET call for API Points
    Given user sends GET request for Points
    Then user receives response for Points

  @Smoke @matakevin
  Scenario: API GET call for API Summary
    Given user sends GET request for Summary
    Then user receives response for Summary

  @Smoke @matakevin
  Scenario: API GET call for API Variants
    Given user sends GET request for API Variants
    Then user receives response for API Variants

  @Smoke @matakevin
  Scenario: API GET call for API Export Variants
    Given user sends GET request for Export Variants
    Then user receives response for Export Variants