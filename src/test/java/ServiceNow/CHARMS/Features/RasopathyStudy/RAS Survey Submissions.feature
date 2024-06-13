Feature: RAS Survey Scenarios
  This feature file contains RAS Survey scenarios submission

  @bucurgb @myRasStudy @RasSurvey @Smoke
  Scenario Outline: This scenario outline is completing the RAS Surveys only
    Given a participant is on the RASopathies Longitudinal Cohort Study login page "myRASLoginPage"
    And logs in via Okta with username "<Email>" and password "<Password>"
    And clicks on the Ras Survey Form
    And a participant enters username "<Email>" and pin
    When the participant submits a RAS Survey from excel sheet "<SurveyScenario>"
    Examples:
      | Email                | Password      | SurveyScenario     |
      | charmsras1@yahoo.com | RASTest2022$$ | RASSurveyScenario1 |
      | charmsras2@yahoo.com | RASTest2023$$ | RASSurveyScenario2 |
      | charmsras3@yahoo.com | RASTest2023$$ | RASSurveyScenario3 |
      | charmsras5@yahoo.com | RASTest2023$$ | RASSurveyScenario4 |
