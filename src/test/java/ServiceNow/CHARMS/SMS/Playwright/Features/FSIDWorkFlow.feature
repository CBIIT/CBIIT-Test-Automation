Feature: FSID Workflow
  Description:This feature file contains the Participant Details and Participant Study pages that have a Related List for the SMS Subject Flags feature. This list will allow the Study Team to track various Participant statuses

  @jains @SubjectFlags @CP2-3671 @playwright @In-Progress
  Scenario: Participant fills and submit the Background Information section for scenario 1
    Given a Participant is on the Fanconi Study login page and logs with user credentials via Okta
    And fills the Background Information section for scenario 1