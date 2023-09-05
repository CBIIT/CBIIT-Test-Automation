Feature: RAS Screener Scenarios
  Description: This feature file contains scenarios which submit the IIQ Form

  @bucurgb @myRasStudy @IIQ
  Scenario Outline: This scenario outline is completing the IIQ Forms only
    Given a participant is on the RASopathies Longitudinal Cohort Study login page "myRASLoginPage"
    And logs in via Okta with username "<Email>" and password "<Password>"
    And clicks on the IIQ Form
    And a participant enters username "<Email>" and pin
    And the participant submits a Individual Information Questionnaire for excel sheet "<IIQScenario>"
    Examples:
      | Email                          | Password      | IIQScenario  |
      | charmsras1@yahoo.com           | RASTest2022$$ | IIQScenario4 |
      | charmsras2@yahoo.com           | RASTest2023$$ | IIQScenario4 |
      | charmsras3@yahoo.com           | RASTest2023$$ | IIQScenario3 |
      | charmsras5@yahoo.com           | RASTest2023$$ | IIQScenario2 |

  @bucurgb @myRasStudy @SampleIiqForm
  Scenario: This scenario outline is completing the IIQ Folm - SAMPLE
    And a participant enters username "diego1@test.com" and pin "123456"
    And the participant submits a Individual Information Questionnaire for excel sheet "IIQScenario4"