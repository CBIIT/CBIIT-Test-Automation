Feature: GCP Notifications Test Scenarios

  @GCP-15 @GCP-20 @chaudhryma @Regression
  Scenario: Test Update GCP Employee Training Expired Notification - UAT Remediation
    Given a user with admin rights is in the Native View
    When the user types System Notifications in the Filter Navigator
    And clicks Notifications under "System Notification"
    And searches GCP Employee Training expired for the Name filter
    And clicks the GCP Employee Training expired record
    And clicks Preview Notification
    Then verify the GCP Employee Training expired Notification content is same as the given in Acceptance Criteria.
