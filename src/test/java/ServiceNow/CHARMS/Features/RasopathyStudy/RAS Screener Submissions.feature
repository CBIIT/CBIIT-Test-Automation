Feature: RAS Screener Scenarios
  Description: This feature file contains scenarios which submit myRAS Screeners and the Consent flow

  @bucurgb @myRasStudy @ScreenersSubmissionAndConsentOnly @Regression
  Scenario Outline: This scenario outline is completing the RAS Screener and the Consent flow only
    Given a participant is on the RASopathies Longitudinal Cohort Study login page "myRASLoginPage"
    And logs in via Okta with username "<Email>" and password "<Password>"
    And clicks on Eligibility Questionnaire to begin questionnaire
    When the participant submits a screener from excel sheet "<ScreenerScenario>"
    And the consent is submitted for "<ScreenerScenario>"
    Examples:
      | Email                | Password      | ScreenerScenario  |
      | charmsras1@yahoo.com | RASTest2022$$ | screenerScenario1 |
      | charmsras2@yahoo.com | RASTest2023$$ | screenerScenario2 |
      | charmsras3@yahoo.com | RASTest2023$$ | screenerScenario3 |
      | charmsras5@yahoo.com | RASTest2023$$ | screenerScenario4 |
