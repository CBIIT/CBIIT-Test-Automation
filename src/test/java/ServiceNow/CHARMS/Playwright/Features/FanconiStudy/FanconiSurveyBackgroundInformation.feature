#Author: @SonikaJain
Feature: Background Information section of the Fanconi Survey on the Fanconi Longitudinal Cohort Study Portal
  Description:This feature file contains submissions and assertion scenarios for the Background Information section of the Fanconi Survey by the proband or the legal guardian (Proxy)

  @jains @BackgroundInformation @CP2-3178 @CP2-3133 @playwright @Fanconi_Regression
  Scenario: Participant fills and submit the Background Information section for scenario 1
    Given a Participant runs reset Fanconi screener and Survey script
    Then fills the Fanconi Screener
    And fills the consent in NativeView
    When a Participant is on the Fanconi Study login page and logs with user credentials via Okta
    Then fills the Background Information section for scenario 1