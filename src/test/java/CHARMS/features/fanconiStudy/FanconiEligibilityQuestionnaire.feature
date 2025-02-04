#Author: @SonikaJain
Feature: Fanconi Eligibility Questionnaire-Screener on the Fanconi Longitudinal Cohort Study Portal
  Description:This feature file has different submissions and assertion scenarios for the Fanconi Eligibility Questionnaire by the proband and the legal guardian (Proxy)

  @jains @FanconiSubmission @CP2-1949 @Fanconi_Regression @selenium @Smoke
  Scenario: Participant fills the Fanconi screener by the Proband for scenario 1
    Given run the Fanconi reset script to reset the accounts

  @jains @FanconiSubmission @CP2-1949 @Fanconi_Regression @selenium @Smoke
  Scenario Outline: Participant fills the Fanconi screener by the Proband for scenario 1
    Given a Participant is on the Fanconi Study login page
    And logs in Fanconi page via Okta with username "<Email>" and password "<Password>"
    And clicks the Fanconi Eligibility Questionnaire widget
    Then fills the Fanconi Eligibility Questionnaire form for scenario1
    Then clicks the submit button
    Given the study nurse log in Native View
    Then data submitted via the Fanconi Eligibility Questionnaire is verified in Participant Details page "<FanconiScenario>"
    Then data submitted via the Fanconi Eligibility Questionnaire is verified in Fanconi Study Screener page "<FanconiScenario>"
    Then data submitted via the Fanconi Eligibility Questionnaire is verified in Fanconi Screener page "<FanconiScenario>"
    And consent is submitted with collection method "<ConsentCollectionMethod>" on sheet <FanconiScenario>
    Examples:
      | Email                         | Password  | ConsentCollectionMethod | FanconiScenario |
      | sj.fanconitester1@yopmail.com | Test123$$ | iMed                    | 0               |

  @jains @FanconiSubmission @CP2-1949 @Fanconi_Regression @selenium @Smoke
  Scenario Outline: Participant fills the Fanconi screener by the Proband for scenario 2
    Given a Participant is on the Fanconi Study login page
    And logs in Fanconi page via Okta with username "<Email>" and password "<Password>"
    And clicks the Fanconi Eligibility Questionnaire widget
    Then fills the Fanconi Eligibility Questionnaire form for scenario2
    Then clicks the submit button
    Given the study nurse log in Native View
    Then data submitted via the Fanconi Eligibility Questionnaire is verified in Participant Details page "<FanconiScenario>"
    Then data submitted via the Fanconi Eligibility Questionnaire is verified in Fanconi Study Screener page "<FanconiScenario>"
    Then data submitted via the Fanconi Eligibility Questionnaire is verified in Fanconi Screener page "<FanconiScenario>"
    And consent is submitted with collection method "<ConsentCollectionMethod>" on sheet <FanconiScenario>
    Examples:
      | Email                         | Password  | ConsentCollectionMethod | FanconiScenario |
      | sj.fanconitester2@yopmail.com | Test123$$ | iMed                    | 1               |

  @jains @FanconiSubmission @CP2-1949 @Fanconi_Regression @selenium @Smoke
  Scenario Outline: Participant fills the Fanconi screener by the Proband for scenario 3
    Given a Participant is on the Fanconi Study login page
    And logs in Fanconi page via Okta with username "<Email>" and password "<Password>"
    And clicks the Fanconi Eligibility Questionnaire widget
    Then fills the Fanconi Eligibility Questionnaire form for scenario3
    Then clicks the submit button
    Given the study nurse log in Native View
    Then data submitted via the Fanconi Eligibility Questionnaire is verified in Participant Details page "<FanconiScenario>"
    Then data submitted via the Fanconi Eligibility Questionnaire is verified in Fanconi Study Screener page "<FanconiScenario>"
    Then data submitted via the Fanconi Eligibility Questionnaire is verified in Fanconi Screener page "<FanconiScenario>"
    And consent is submitted with collection method "<ConsentCollectionMethod>" on sheet <FanconiScenario>
    Examples:
      | Email                         | Password  | ConsentCollectionMethod | FanconiScenario |
      | sj.fanconitester3@yopmail.com | Test123$$ | iMed                    | 2               |

  @jains @FanconiSubmission @CP2-1949 @Fanconi_Regression @selenium @Smoke
  Scenario Outline: Participant fills the Fanconi screener by the Proband for scenario 4
    Given a Participant is on the Fanconi Study login page
    And logs in Fanconi page via Okta with username "<Email>" and password "<Password>"
    And clicks the Fanconi Eligibility Questionnaire widget
    Then fills the Fanconi Eligibility Questionnaire form for scenario4
    Then clicks the submit button
    Given the study nurse log in Native View
    Then data submitted via the Fanconi Eligibility Questionnaire is verified in Participant Details page "<FanconiScenario>"
    Then data submitted via the Fanconi Eligibility Questionnaire is verified in Fanconi Study Screener page "<FanconiScenario>"
    Then data submitted via the Fanconi Eligibility Questionnaire is verified in Fanconi Screener page "<FanconiScenario>"
    And consent is submitted with collection method "<ConsentCollectionMethod>" on sheet <FanconiScenario>
    Examples:
      | Email                         | Password  | ConsentCollectionMethod | FanconiScenario |
      | sj.fanconitester4@yopmail.com | Test123$$ | iMed                    | 3               |

  @jains @FanconiSubmission @CP2-1949 @Fanconi_Regression @selenium @Smoke
  Scenario Outline: Participant fills the Fanconi screener by the Proband for scenario 5
    Given a Participant is on the Fanconi Study login page
    And logs in Fanconi page via Okta with username "<Email>" and password "<Password>"
    And clicks the Fanconi Eligibility Questionnaire widget
    Then fills the Fanconi Eligibility Questionnaire form for scenario5
    Then clicks the submit button
    Given the study nurse log in Native View
    Then data submitted via the Fanconi Eligibility Questionnaire is verified in Participant Details page "<FanconiScenario>"
    Then data submitted via the Fanconi Eligibility Questionnaire is verified in Fanconi Study Screener page "<FanconiScenario>"
    Then data submitted via the Fanconi Eligibility Questionnaire is verified in Fanconi Screener page "<FanconiScenario>"
    And consent is submitted with collection method "<ConsentCollectionMethod>" on sheet <FanconiScenario>
    Examples:
      | Email                         | Password  | ConsentCollectionMethod | FanconiScenario |
      | sj.fanconitester5@yopmail.com | Test123$$ | iMed                    | 4               |

  @jains @FanconiSubmission @CP2-1949 @Fanconi_Regression @selenium @Smoke
  Scenario Outline: Participant fills the Fanconi screener by the Proband for scenario 6
    Given a Participant is on the Fanconi Study login page
    And logs in Fanconi page via Okta with username "<Email>" and password "<Password>"
    And clicks the Fanconi Eligibility Questionnaire widget
    Then fills the Fanconi Eligibility Questionnaire form for scenario6
    Then clicks the submit button
    Given the study nurse log in Native View
    Then data submitted via the Fanconi Eligibility Questionnaire is verified in Participant Details page "<FanconiScenario>"
    Then data submitted via the Fanconi Eligibility Questionnaire is verified in Fanconi Study Screener page "<FanconiScenario>"
    Then data submitted via the Fanconi Eligibility Questionnaire is verified in Fanconi Screener page "<FanconiScenario>"
    And consent is submitted with collection method "<ConsentCollectionMethod>" on sheet <FanconiScenario>
    Examples:
      | Email                         | Password  | ConsentCollectionMethod | FanconiScenario |
      | sj.fanconitester6@yopmail.com | Test123$$ | iMed                    | 5               |

  @jains @FanconiSubmission @CP2-1949 @Fanconi_Regression @selenium @Smoke
  Scenario Outline: Participant fills the Fanconi screener by the Proband for scenario 7
    Given a Participant is on the Fanconi Study login page
    And logs in Fanconi page via Okta with username "<Email>" and password "<Password>"
    And clicks the Fanconi Eligibility Questionnaire widget
    Then fills the Fanconi Eligibility Questionnaire form for scenario7
    Then clicks the submit button
    Given the study nurse log in Native View
    Then data submitted via the Fanconi Eligibility Questionnaire is verified in Participant Details page "<FanconiScenario>"
    Then data submitted via the Fanconi Eligibility Questionnaire is verified in Fanconi Study Screener page "<FanconiScenario>"
    Then data submitted via the Fanconi Eligibility Questionnaire is verified in Fanconi Screener page "<FanconiScenario>"
    And consent is submitted with collection method "<ConsentCollectionMethod>" on sheet <FanconiScenario>
    Examples:
      | Email                         | Password  | ConsentCollectionMethod | FanconiScenario |
      | sj.fanconitester7@yopmail.com | Test123$$ | iMed                    | 6               |

  @jains @FanconiSubmission @CP2-1949 @Fanconi_Regression @selenium @Smoke
  Scenario Outline: Participant fills the Fanconi screener by the Proband for scenario 8
    Given a Participant is on the Fanconi Study login page
    And logs in Fanconi page via Okta with username "<Email>" and password "<Password>"
    And clicks the Fanconi Eligibility Questionnaire widget
    Then fills the Fanconi Eligibility Questionnaire form for scenario8
    Then clicks the submit button
    Given the study nurse log in Native View
    Then data submitted via the Fanconi Eligibility Questionnaire is verified in Participant Details page "<FanconiScenario>"
    Then data submitted via the Fanconi Eligibility Questionnaire is verified in Fanconi Study Screener page "<FanconiScenario>"
    Then data submitted via the Fanconi Eligibility Questionnaire is verified in Fanconi Screener page "<FanconiScenario>"
    And consent is submitted with collection method "<ConsentCollectionMethod>" on sheet <FanconiScenario>
    Examples:
      | Email                         | Password  | ConsentCollectionMethod | FanconiScenario |
      | sj.fanconitester8@yopmail.com | Test123$$ | iMed                    | 7               |

  @jains @FanconiSubmission @CP2-1949 @Fanconi_Regression @selenium @Smoke
  Scenario Outline: Participant fills the Fanconi screener by the Proxy for scenario 9
    Given a Participant is on the Fanconi Study login page
    And logs in Fanconi page via Okta with username "<Email>" and password "<Password>"
    And clicks the Fanconi Eligibility Questionnaire widget
    Then fills the Fanconi Eligibility Questionnaire form for scenario9
    Then clicks the submit button
    Given the study nurse log in Native View
    Then data submitted via the Fanconi Eligibility Questionnaire is verified in Participant Details page "<FanconiScenario>"
    Then data submitted via the Fanconi Eligibility Questionnaire is verified in Fanconi Study Screener page "<FanconiScenario>"
    Then data submitted via the Fanconi Eligibility Questionnaire is verified in Fanconi Screener page "<FanconiScenario>"
    And consent is submitted with collection method "<ConsentCollectionMethod>" on sheet <FanconiScenario>
    Examples:
      | Email                         | Password  | ConsentCollectionMethod | FanconiScenario |
      | sj.fanconitester9@yopmail.com | Test123$$ | iMed                    | 8               |

  @jains @FanconiSubmission @CP2-1949 @Fanconi_Regression @selenium @Smoke
  Scenario Outline: Participant fills the Fanconi screener by the Proxy for scenario 10
    Given a Participant is on the Fanconi Study login page
    And logs in Fanconi page via Okta with username "<Email>" and password "<Password>"
    And clicks the Fanconi Eligibility Questionnaire widget
    Then fills the Fanconi Eligibility Questionnaire form for scenario10
    Then clicks the submit button
    Given the study nurse log in Native View
    Then data submitted via the Fanconi Eligibility Questionnaire is verified in Participant Details page "<FanconiScenario>"
    Then data submitted via the Fanconi Eligibility Questionnaire is verified in Fanconi Study Screener page "<FanconiScenario>"
    Then data submitted via the Fanconi Eligibility Questionnaire is verified in Fanconi Screener page "<FanconiScenario>"
    And consent is submitted with collection method "<ConsentCollectionMethod>" on sheet <FanconiScenario>
    Examples:
      | Email                          | Password  | ConsentCollectionMethod | FanconiScenario |
      | sj.fanconitester10@yopmail.com | Test123$$ | iMed                    | 9               |

  @jains @FanconiSubmission @Fanconi_Regression @selenium
  Scenario: Participant fills the Fanconi screener for all different scenarios
    Given run the Fanconi reset script to reset the accounts
    Given All scenarios are submitted

  @jains @FanconiAssertion @CP2-1995 @Fanconi_Regression @selenium @Smoke
  Scenario Outline:: Participant Details Page Assertions for all the scenarios in ServiceNow
    Given the study nurse log in Native View
    Then data submitted via the Fanconi Eligibility Questionnaire is verified in Participant Details page "<FanconiScenario>"
    Then data submitted via the Fanconi Eligibility Questionnaire is verified in Fanconi Study Screener page "<FanconiScenario>"
    Then data submitted via the Fanconi Eligibility Questionnaire is verified in Fanconi Screener page "<FanconiScenario>"
    Examples:
      | FanconiScenario |
      | 0               |
      | 1               |

  @jains @FanconiAssertion @CP2-1995 @Fanconi_Regression @selenium
  Scenario: Participant Details Page Assertions for one scenario at a time in ServiceNow
    Given the study nurse log in Native View
    Then data submitted via the Fanconi Eligibility Questionnaire is verified in Participant Details page for each scenario

  @jains @FanconiAssertion @CP2-1995 @Fanconi_Regression @selenium
  Scenario: Consent process is completed in participant details page in ServiceNow
    Given the study nurse log in Native View
    Then data submitted via the Fanconi Eligibility Questionnaire is verified in Participant Details page for each scenario
    Then consent in Fanconi is verified

  @jains @FanconiAssertion @CP2-1995 @In-progress @selenium
  Scenario: Completion of the Consent process in participant details page in ServiceNow
    Given the study nurse log in Native View
    Then consent in Fanconi is verified

  @jains @FanconiAssertion @CP2-1995 @In-progress @selenium
  Scenario: Fanconi Study Screener page Assertions for all the scenarios in ServiceNow
    Given the study nurse log in Native View and go to Study Screener page
    Then data submitted via the Fanconi Eligibility Questionnaire is verified in Fanconi Study Screener page for each scenario

  @jains @FanconiAssertion @CP2-1995 @In-progress @selenium
  Scenario: Fanconi Study Screener page Assertions for one scenario at a time in ServiceNow
    Given the study nurse log in Native View and go to Study Screener page
    Then data submitted via the Fanconi Eligibility Questionnaire is verified in Fanconi Study Screener page for each scenario