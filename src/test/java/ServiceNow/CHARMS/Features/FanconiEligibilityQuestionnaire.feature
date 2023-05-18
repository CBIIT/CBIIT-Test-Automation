# Author: @SonikaJain
Feature: Fanconi Eligibility Questionnaire Landing Page on the Fanconi Longitudinal Cohort Study Portal
  
  Description:This feature file contains the scenario for the the submission of the Fanconi Eligibility Questionnaire by the proband and the legal guardian (Proxy)


  #@jains @FanconiRegression @Regression
  Scenario: Participant fills the Fanconi Eligibility Questionnaires on the Fanconi Study page
    Given a Participant is on the Fanconi Study login page
  And logs in Fanconi page via Okta with username "charmsras1@yahoo.com" and password "RASTest2022$$"
   And clicks the Fanconi Eligibility Questionnaire widget
   Then fills the Fanconi Eligibility Questionnaire form
   