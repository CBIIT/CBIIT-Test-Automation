#Author: @SonikaJain
Feature: Sexual History section of the Fanconi Survey on the Fanconi Longitudinal Cohort Study Portal
  Description:This feature file contains submissions and assertion scenarios for the Sexual History section of the Fanconi Survey by the proband or the legal guardian (Proxy)

  @jains @SexualHistory @CP2-3178 @CP2-3133 @playwright @Regression
  Scenario: Participant fills and submit the Sexual History section for scenario 1
    Given a Participant is on the Fanconi Study login page and logs with user credentials via Okta
    And fills the Sexual History section for scenario 1