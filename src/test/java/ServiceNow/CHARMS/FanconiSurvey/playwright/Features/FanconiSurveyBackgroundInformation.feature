#Author: @SonikaJain
Feature: Background Information section of the Fanconi Survey on the Fanconi Longitudinal Cohort Study Portal
  
  Description:This feature file contains submissions and assertion scenarios for the Background Information section of the Fanconi Survey by the proband or the legal guardian (Proxy)

  @jains @BackgroundInformation 
  Scenario: Participant fills the Fanconi screener for all different scenarios
    Given All scenarios are submitted

  @jains @BackgroundInformation @Regression
  Scenario: Participant fills and submit the Background Information section by the Proband for scenario 1
    Given a Participant is on the Fanconi Study login page and logs with user credentials via Okta
    And fills the Background Information section
    Then clicks the submit button
    
    And logs in Fanconi page via Okta with username "charmsras1@yahoo.com" and password "RASTest2022$$"
    And clicks the Fanconi Eligibility Questionnaire widget
    Then fills the Fanconi Eligibility Questionnaire form for scenario1
    Then clicks the submit button

  @jains @FanconiSubmission 
  Scenario: Participant fills the Fanconi screener by the Proband for scenario 2
    Given a Participant is on the Fanconi Study login page
    And logs in Fanconi page via Okta with username "charmsras1@yahoo.com" and password "RASTest2022$$"
    And clicks the Fanconi Eligibility Questionnaire widget
    Then fills the Fanconi Eligibility Questionnaire form for scenario2
    Then clicks the submit button

  @jains @FanconiSubmission 
  Scenario: Participant fills the Fanconi screener by the Proband for scenario 3
    Given a Participant is on the Fanconi Study login page
    And logs in Fanconi page via Okta with username "charmsras1@yahoo.com" and password "RASTest2022$$"
    And clicks the Fanconi Eligibility Questionnaire widget
    Then fills the Fanconi Eligibility Questionnaire form for scenario3
    Then clicks the submit button

  @jains @FanconiSubmission 
  Scenario: Participant fills the Fanconi screener by the Proband for scenario 4
    Given a Participant is on the Fanconi Study login page
    And logs in Fanconi page via Okta with username "charmsras1@yahoo.com" and password "RASTest2022$$"
    And clicks the Fanconi Eligibility Questionnaire widget
    Then fills the Fanconi Eligibility Questionnaire form for scenario4
    Then clicks the submit button

  @jains @FanconiSubmission 
  Scenario: Participant fills the Fanconi screener by the Proband for scenario 5
    Given a Participant is on the Fanconi Study login page
    And logs in Fanconi page via Okta with username "charmsras1@yahoo.com" and password "RASTest2022$$"
    And clicks the Fanconi Eligibility Questionnaire widget
    Then fills the Fanconi Eligibility Questionnaire form for scenario5
    Then clicks the submit button

  @jains @FanconiSubmission 
  Scenario: Participant fills the Fanconi screener by the Proband for scenario 6
    Given a Participant is on the Fanconi Study login page
    And logs in Fanconi page via Okta with username "charmsras1@yahoo.com" and password "RASTest2022$$"
    And clicks the Fanconi Eligibility Questionnaire widget
    Then fills the Fanconi Eligibility Questionnaire form for scenario6
    Then clicks the submit button

  @jains @FanconiSubmission 
  Scenario: Participant fills the Fanconi screener by the Proband for scenario 7
    Given a Participant is on the Fanconi Study login page
    And logs in Fanconi page via Okta with username "charmsras1@yahoo.com" and password "RASTest2022$$"
    And clicks the Fanconi Eligibility Questionnaire widget
    Then fills the Fanconi Eligibility Questionnaire form for scenario7
    Then clicks the submit button

  @jains @FanconiSubmission 
  Scenario: Participant fills the Fanconi screener by the Proband for scenario 8
    Given a Participant is on the Fanconi Study login page
    And logs in Fanconi page via Okta with username "charmsras1@yahoo.com" and password "RASTest2022$$"
    And clicks the Fanconi Eligibility Questionnaire widget
    Then fills the Fanconi Eligibility Questionnaire form for scenario8
    Then clicks the submit button

  @jains @FanconiSubmission 
  Scenario: Participant fills the Fanconi screener by the Proxy for scenario 9
    Given a Participant is on the Fanconi Study login page
    And logs in Fanconi page via Okta with username "charmsras1@yahoo.com" and password "RASTest2022$$"
    And clicks the Fanconi Eligibility Questionnaire widget
    Then fills the Fanconi Eligibility Questionnaire form for scenario9
    Then clicks the submit button

  @jains @FanconiSubmission 
  Scenario: Participant fills the Fanconi screener by the Proxy for scenario 10
    Given a Participant is on the Fanconi Study login page
    And logs in Fanconi page via Okta with username "charmsras1@yahoo.com" and password "RASTest2022$$"
    And clicks the Fanconi Eligibility Questionnaire widget
    Then fills the Fanconi Eligibility Questionnaire form for scenario10
    Then clicks the submit button

  @jains @FanconiAssertion 
  Scenario: Participant Details Page Assertions for all the scenarios in ServiceNow
    Given the study nurse log in Native View
    Then data submitted via the Fanconi Eligibility Questionnaire is verified in Participant Details page for all scenarios

  @jains @FanconiAssertion 
  Scenario: Participant Details Page Assertions for one scenario at a time in ServiceNow
    Given the study nurse log in Native View
    Then data submitted via the Fanconi Eligibility Questionnaire is verified in Participant Details page for each scenario

  @jains @FanconiAssertion 
  Scenario: Consent process is completed in participant details page in ServiceNow
    Given the study nurse log in Native View
    Then data submitted via the Fanconi Eligibility Questionnaire is verified in Participant Details page for each scenario
    Then consent in Fanconi is verified

  @jains @FanconiAssertion 
  Scenario: Completion of the Consent process in participant details page in ServiceNow
    Given the study nurse log in Native View
    Then consent in Fanconi is verified

  @jains @FanconiAssertion 
  Scenario: Fanconi Study Screener page Assertions for all the scenarios in ServiceNow
    Given the study nurse log in Native View and go to Study Screener page
    Then data submitted via the Fanconi Eligibility Questionnaire is verified in Fanconi Study Screener page for all scenarios

  @jains @FanconiAssertion 
  Scenario: Fanconi Study Screener page Assertions for one scenario at a time in ServiceNow
    Given the study nurse log in Native View and go to Study Screener page
    Then data submitted via the Fanconi Eligibility Questionnaire is verified in Fanconi Study Screener page for each scenario

  @jains @FanconiAssertion 
  Scenario: Fanconi Study Screener page Assertions for one scenario at a time in ServiceNow
    Given the study nurse log in Native View and go to Study Screener page
    Then data submitted is verified in Fanconi Study page
