Feature: GCP Notifications Test Scenarios

  @GCP-15 @GCP-20 @chaudhryma @Regression
  Scenario: Test Update GCP Employee Training Expired Notification - UAT Remediation
    Given a user with an Admin rights go to Notifications under System Notification in the Native View
    And searches GCP Employee Training expired for the Name filter
    When the User clicks on a Preview Notification button for the GCP Employee Training expired record
    Then the User verifies that the GCP Employee Training expired Notification record content is same as the given in Acceptance Criteria

  @GCP-16 @GCP-21 @chaudhryma @Regression
  Scenario: Test Update GCP Manager Approval Notification - UAT Remediation
    Given a user with an Admin rights go to Notifications under System Notification in the Native View
    And searches GCP Manager Approval Notification for the Name filter
    When the User clicks on a Preview Notification button for the GCP Manager Approval Notification record
    Then verify the GCP Manager Approval Notification content is same as the given in Acceptance Criteria

  @GCP-17 @GCP-22 @chaudhryma @Regression
  Scenario: Test Update GCP Employee Training Past Due Notification - UAT Remediation
    Given a user with an Admin rights go to Notifications under System Notification in the Native View
    And searches GCP Employee Training Past Due for the Name filter
    When the User clicks on a Preview Notification button for the GCP Employee Training Past Due Notification record
    Then verify the GCP Employee Training Past Due Notification content is same as the given in Acceptance Criteria

  @GCP-18 @GCP-23 @chaudhryma @Regression
  Scenario: Test Update GCP Employee Training Notification - UAT Remediation
    Given a user with an Admin rights go to Notifications under System Notification in the Native View
    When searches GCP Employee Training Notification for the Name filter
    And the User clicks on a Preview Notification button for the GCP Employee Training Notification record
    Then verify the GCP Employee Training Notification content is same as the given in Acceptance Criteria

  @GCP-19 @GCP-24 @chaudhryma @Regression
  Scenario: Test Update Your GCP expires in a month Notification - UAT Remediation
    Given a user with an Admin rights go to Notifications under System Notification in the Native View
    When searches GCP Employee Training expires in a month for the Name filter
    And the User clicks on a Preview Notification button for the GCP Employee Training expires in a month Notification record
    Then verify the GCP Employee Training expires in a month Notification content is same as the given in Acceptance Criteria
