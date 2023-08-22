Feature: RAS Screener Scenarios
  Description: This feature file contains scenarios which submit myRAS Screeners and verifies questionnaire datas in Native View

  @juarezds @myRasScreenerSubmissionOnly @InProgress
  Scenario Outline: Participant Self Submission Scenarios
#    Given a participant is on the RASopathies Longitudinal Cohort Study login page "myRASLoginPage"
#    And logs in via Okta with username "<Email>" and password "<Password>"
#    And clicks on Eligibility Questionnaire to begin questionnaire
#    When the participant submits a screener from excel sheet "<ScreenerScenario>"
#  	Then data submitted for scenario is verified in native from the excel sheet "<ScreenerScenario>"
#    And the consent is submitted for "<ScreenerScenario>"
	Given a participant is on the RASopathies Longitudinal Cohort Study login page "myRASLoginPage"
	And logs in via Okta with username "<Email>" and password "<Password>"
    And clicks on the IIQ Form
    And a participant enters username "<Email>" and pin
    And the participant submits a Individual Information Questionnaire for excel sheet "<IIQScenario>"

    Examples:
      | Email                | Password      | ScreenerScenario  | IIQScenario  | SurveyScenario     |
#      | charmsras1@yahoo.com | RASTest2022$$ | screenerScenario1 | IIQScenario1 | RasSurveyScenario1 |
#      | charmsras2@yahoo.com | RASTest2023$$ | screenerScenario2 | IIQScenario2 | RasSurveyScenario2 |
#      | charmsras3@yahoo.com | RASTest2023$$ | screenerScenario3 | IIQScenario3 | RasSurveyScenario3 |
#      | charmsras5@yahoo.com | RASTest2023$$ | screenerScenario4 | IIQScenario1 | RasSurveyScenario4 |
      | charmsras6@gmail.com | RASTest2023$$ | screenerScenario4 | IIQScenario1 | RasSurveyScenario4 |