#Author: @SonikaJain
Feature: Background Information section of the Fanconi Survey on the Fanconi Longitudinal Cohort Study Portal
  Description:This feature file contains submissions and assertion scenarios for the Background Information section of the Fanconi Survey by the proband or the legal guardian (Proxy)

  @jains @BackgroundInformation @Regression @playwright
  Scenario: Participant fills and submit the Background Information section for scenario 1
    Given a Participant is on the Fanconi Study login page and logs with user credentials via Okta
    And fills the Background Information section

