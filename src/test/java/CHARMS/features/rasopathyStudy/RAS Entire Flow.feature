Feature: RAS Screener Scenarios
  Description: This feature file contains scenarios which submit myRAS Screeners, Consent Flows, IIQ Forms and the RAS Surveys. No data verification in Native View

  @JUAREZDS @RAS_STUDY @2CP2-2332 @Smoke @RAS_Regression1 @selenium
  Scenario Outline: This scenario outline is completing the myRAS Screeners, Consent Flows, IIQ Forms and the RAS Surveys
    Given test automation account has been reset
    Given a participant is on the RASopathies Longitudinal Cohort Study login page "myRASLoginPage"
    And logs in via Okta with username "<Email>" and password "<Password>"
    And clicks on "Eligibility Questionnaire" to begin survey
    When the participant submits a screener from excel sheet "<ScreenerScenario>"
#    Then screener data from "<ScreenerScenario>" is verified
    And Study Team member logs in to Native View and completes consent call "<ScreenerScenario>" with Collection Method "Participant upload to portal"
    Then data submitted for scenario is verified in native from the excel sheet "<ScreenerScenario>"
    Given a participant is on the RASopathies Longitudinal Cohort Study login page "myRASLoginPage"
    And logs in via Okta with username "<Email>" and password "<Password>"
    And clicks on the IIQ Form
    And a participant enters username "<Email>" and pin
    And the participant submits a Individual Information Questionnaire for excel sheet "<IIQScenario>"
    Given a participant is on the RASopathies Longitudinal Cohort Study login page "myRASLoginPage"
    And logs in via Okta with username "<Email>" and password "<Password>"
    And clicks on the Ras Survey Form
    And a participant enters username "<Email>" and pin
    When the participant submits a RAS Survey from excel sheet "<SurveyScenario>"
    Examples:
      | Email                | Password          | ScreenerScenario  | IIQScenario  | SurveyScenario     |
      | charmsras1@yahoo.com | CharmsStudies123$ | screenerScenario1 | IIQScenario1 | RASSurveyScenario1 |
      | charmsras1@yahoo.com | CharmsStudies123$ | screenerScenario2 | IIQScenario2 | RASSurveyScenario2 |
#      | charmsras3@yahoo.com | RASTest2023$$     | screenerScenario3 | IIQScenario3 | RASSurveyScenario3 |
#      | charmsras5@yahoo.com | RASTest2023$$     | screenerScenario4 | IIQScenario4 | RASSurveyScenario4 |

  @muzipovay2 @RAS_STUDY @2CP2-2332 @CP2-3908 @CP2-3909 @selenium @RAS_Regression1
  Scenario Outline: This scenario outline is completing the myRAS Screeners, Consent Flows, IIQ Forms and the RAS Surveys
    Given test automation account "https://service-test.nci.nih.gov/nav_to.do?uri=sys_script_fix.do?sys_id=b8daf9fa872096107e87a8a60cbb3597" has been reset
    Given a participant is on the RASopathies Longitudinal Cohort Study login page "myRASLoginPage"
    And logs in via Okta with username "<Email>" and password "<Password>"
    And clicks on "Eligibility Questionnaire" to begin survey
    When the participant submits a screener from excel sheet "<ScreenerScenario>"
    And the consent is submitted for "<ScreenerScenario>"
    Then data submitted for scenario is verified in native from the excel sheet "<ScreenerScenario>"
    Given a participant is on the RASopathies Longitudinal Cohort Study login page "myRASLoginPage"
    And logs in via Okta with username "<Email>" and password "<Password>"
    And clicks on the Ras Survey Form
    And a participant enters username "<Email>" and pin
    When the participant submits a RAS Survey from excel sheet "<SurveyScenario>"
    And Study Team member logs in to Native View and navigates to participant's record "screenerScenario2"
    And Study Team member navigates to RASopathy Survey
    And RAS Survey Data for Scenario Two is verified
    Examples:
      | Email                           | Password   | ScreenerScenario  | SurveyScenario     |
      | consent_participant@yopmail.com | Charms123$ | screenerScenario2 | RASSurveyScenario2 |