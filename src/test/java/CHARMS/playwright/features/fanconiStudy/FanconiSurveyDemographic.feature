#Author: @SonikaJain
Feature: Demographic section of the Fanconi Survey on the Fanconi Longitudinal Cohort Study Portal
  Description:This feature file contains submissions and assertion scenarios for the Demographic section of the Fanconi Survey by the proband or the legal guardian (Proxy)

  @jains @Demographic @CP2-3178 @CP2-3133 @playwright @Fanconi_Regression
  Scenario: Participant fills and submit the Demographic section for scenario 1
    Given a Participant is on the Fanconi Study login page and logs with user credentials via Okta
    And fills the Demographic section for scenario 1