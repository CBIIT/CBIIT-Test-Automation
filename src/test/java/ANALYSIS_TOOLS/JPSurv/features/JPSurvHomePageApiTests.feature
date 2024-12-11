Feature: JPSurvHomePage Api Test features

  @satya @Smoke @Regression @playwright @NCIATWP-4351
  Scenario: Verify user is able to submit data through the request
    Given User is able to set the env for submitting data request
    Then User is able to send post request and receive valid response back on submitting of data
    Then Verify response of the API is submitted

  @satya @Smoke @Regression @playwright @NCIATWP-1699
  Scenario: Verify user is able to export data through the request
    Given User is able to set the env for exporting data request
    Then User is able to send get request and receive valid response back on exporting of data

  @satya @Smoke @Regression @playwright @NCIATWP-4358
  Scenario: Verify user is able to do the conditional survival recalculation
    Given User is able to set the env for conditional survival recalculation
    Then User is able to send post request and receive valid response back for conditional survival recalculation

  @satya @Smoke @Regression @playwright @NCIATWP-1727
  Scenario: Verify user is able to get the calendar trends between conditional survival and year at diagnosis
    Given User is able to set the env for getting the calendar trends
    Then User is able to send post request and receive valid response back for the calendar trends
    Then verify start and end year in the response of the API

  @satya @Smoke @Regression @playwright @NCIATWP-1696
  Scenario: Verify user is able to import data through the request
    Given User is able to set the env for importing data request
    Then User is able to send post request and receive valid response back on importing of data