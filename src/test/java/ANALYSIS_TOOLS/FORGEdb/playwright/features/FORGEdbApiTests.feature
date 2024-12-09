Feature: FORGEdb Api Test features

  @satya @Smoke @Regression @playwright @NCIATWP-7443
  Scenario: Verify user is able to send request and receive valid response back for FORGEdb Api for all versioned datasets
    Given User is able to set the env for all versioned datasets request
    Then User is able to send request and receive valid response back for FORGEdb Api for all versioned datasets

  @satya @Smoke @Regression @playwright @NCIATWP-7443
  Scenario: Verify user is able to send request and receive valid response of the schema for a versioned dataset
    Given User is able to set the env for a versioned dataset request
    Then User is able to send request and receive valid response of the schema for a versioned dataset

  @satya @Smoke @Regression @playwright @NCIATWP-7661
  Scenario: Verify user is able to send request and receive valid response back for a versioned dataset for an rsid request
    Given User is able to set the env for a versioned dataset for an rsid request
    Then User is able to send request and receive valid response back for a versioned dataset for an rsid request