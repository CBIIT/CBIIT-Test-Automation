Feature: SMS Subject Flags
  Description:This feature file covers the portion of the Study Management System that allows Study Team members to track Participant Subject Flags easily from either the Participant Details or Participant Study forms. These Subject Flags records are per study and include details that impact (and are synced to) Family Records.

  @jains @SubjectFlags @playwright @In-Progress
  Scenario: Participant fills and submit the Background Information section for scenario 1
    Given a Participant is on the Fanconi Study login page and logs with user credentials via Okta
    And fills the Background Information section for scenario 1