@MCAExplorer
Feature: MCAExplorer Api Test features

  @satya @Smoke @Regression @NCIATWP-7228
  Scenario: Verify user is able to send opensearch request
    Given User is able to set the env for opensearch request
    Then User is able to send request and receive valid response back

  @satya @Smoke @Regression @NCIATWP-7228
  Scenario: Verify user is able to send open search chromosome request
    Given User is able to set the env for open search chromosome request
    Then User is able to send request and receive valid response back for chromosome search
