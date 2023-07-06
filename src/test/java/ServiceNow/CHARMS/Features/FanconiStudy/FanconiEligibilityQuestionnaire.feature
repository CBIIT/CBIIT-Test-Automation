# Author: @SonikaJain
Feature: Fanconi Eligibility Questionnaire Landing Page on the Fanconi Longitudinal Cohort Study Portal
  
  Description:This feature file contains the scenario for the the submission of the Fanconi Eligibility Questionnaire by the proband and the legal guardian (Proxy)

  @jains @FanconiRegression @Regression
  Scenario: Participant fills the Fanconi Eligibility Questionnaires on the Fanconi Study page
    #  Given a Participant is on the Fanconi Study login page
    #  And logs in Fanconi page via Okta with username "charmsras4@yahoo.com" and password "RASTest2021$$"
    #  And clicks the Fanconi Eligibility Questionnaire widget
    #  Then fills the Fanconi Eligibility Questionnaire form
    #  Then clicks the submit button
    Given the study nurse log in Native View
    Then data submitted via the Fanconi Eligibility Questionnaire is verified in Participant Details page in Native View

  # @jains @FanconiRegression @Regression
  Scenario: Participant fills the Fanconi Eligibility Questionnaires on the Fanconi Study page
    Given a Participant is on the Fanconi Study login page
    #And logs in Fanconi page via Okta with username "charmsras4@yahoo.com" and password "RASTest2021$$"
    And logs in Fanconi page via Okta with username "charmsparticipant1@yopmail.com" and password "Charms123"
    And clicks the Fanconi Eligibility Questionnaire widget
    Then fills the Fanconi Eligibility Questionnaire form
    Then clicks the submit button
    
    
    
#@jains @FanconiRegression @Regression
  Scenario: Participant fills the Fanconi Eligibility Questionnaires on the Fanconi Study page
       Given a Participant is on the Fanconi Study login page
       And logs in Fanconi page via Okta with username "charmsparticipant2@yopmail.com" and password "Charms123"
       And clicks the Fanconi Eligibility Questionnaire widget
       Then fills the Fanconi Eligibility Questionnaire form
       Then clicks the submit button