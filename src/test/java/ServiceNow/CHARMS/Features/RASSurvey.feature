Feature: RAS Survey Submissions
  
  This feature file contains scenarios which submits RAS Survey and verify questionnaire data submitted via Qualtrics is imported as expected in Native View

  @jains 
  Scenario: Proxy submits RAS Survey questionnaire via Qualtrics
  
  Given a proxy is on the RASopathies Longitudinal Cohort Study login page
    And logs in via Okta with username "charmsras6@gmail.com" and password "RASTest2021$$"
    And clicks on Eligibility Questionnaire to begin questionnaire
    And clicks next after reviewing the STUDY INTRODCTION
    And selects I am completing this form for someone else option