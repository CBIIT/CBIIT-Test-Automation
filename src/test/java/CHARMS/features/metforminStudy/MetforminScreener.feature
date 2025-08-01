#Author: @SonikaJain
Feature: Metformin Screener on Online enrollment in NCI Family Studies Hub Portal
  Description:This feature file has different submissions and assertion scenarios for the Metformin Screener by the proband and the legal guardian (Proxy)

  @jains @MetforminSubmission @CP2-1949 @Metformin_Regression @selenium @Smoke
  Scenario: Reset the test accounts
    Given run the Metformin reset script to reset the accounts

  @jains @MetforminSubmission @Metformin_Regression @selenium
  Scenario: Participant fills the Metformin screener for all different scenarios
    Given run the Metformin reset script to reset the accounts
    Given All Metformin scenarios are submitted
    Given run the Metformin reset script to reset the accounts

  @jains @MetforminSubmission @CP2-1949 @Metformin_Regression @selenium @Smoke
  Scenario Outline: Participant fills the Metformin screener by the Proband for scenario
    Given a Participant is on the Metformin Study login page
    And logs in Metformin page via Okta with username "<Email>" and password "<Password>"
    And clicks the Metformin Eligibility Questionnaire widget
    Then fills the Metformin Eligibility Questionnaire form for scenario "<MetforminScreenerScenario>"
    Then click the submit button

    Examples:
      | Email                       | Password          | MetforminScreenerScenario  |
      | Metformin1Test1@yopmail.com | CharmsStudies123$ | MetforminScreenerScenario1 |

  @jains @MetforminSubmission @CP2-1949 @Metformin_Regression @selenium @Smoke
  Scenario Outline: Participant fills the Metformin screener by the Proband for scenario
    Given the study nurse logs in Native View
    Then data submitted for Metformin participant is verified in Participant Details page in NativeView from excel sheet "<MetforminScreenerScenario>"
    Then data submitted for Metformin participant is verified in Study Screener page in NativeView from excel sheet "<MetforminScreenerScenario>"
    Then data submitted for Metformin participant is verified in Metformin Screener page in NativeView from excel sheet "<MetforminScreenerScenario>"
    Then logout from Native View

    Examples:
      | MetforminScreenerScenario  |
      | MetforminScreenerScenario1 |

