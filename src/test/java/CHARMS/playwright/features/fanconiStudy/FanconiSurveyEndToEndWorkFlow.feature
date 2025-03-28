#Author: @SonikaJain
Feature: All sections of the Fanconi Survey on the Fanconi Longitudinal Cohort Study Portal starting from Fanconi Screener to Consent to Survey
  Description:This feature file contains submissions and assertion scenarios for All sections of the Fanconi Survey on the Fanconi Longitudinal Cohort Study Portal starting from Fanconi Screener to Consent to Survey by the proband or the legal guardian (Proxy)

  @jains @FanconiEndToEndWorkFlow @CP2-3178 @CP2-3133 @playwright @Fanconi_Regression
  Scenario: Participant fills Fanconi Screener consent and then Survey for scenario 1
    Given a Participant runs reset Fanconi screener and Survey script
    Then fills the Fanconi Screener
    And fills the consent in NativeView
    When a Participant is on the Fanconi Study login page and logs with user credentials via Okta
    Then fills the Background Information section for scenario 1
    And fills the Demographic section for scenario 1
    And fills the Medical History section for scenario 1
    And fills the Medical History Continued section for scenario 1
    And fills the Reproductive History section for scenario 1
    And fills the Surgical and other Medical History section for scenario 1
    And fills the Sexual History section for scenario 1
    And submit the Fanconi Survey

  @jains @FanconiEndToEndWorkFlow @CP2-3178 @CP2-3133 @playwright @Fanconi_Regression @InProgress
  Scenario: Participant fills Fanconi Screener consent and then Survey for scenario 1
    And Study Team member verifies FA Survey data in Native View