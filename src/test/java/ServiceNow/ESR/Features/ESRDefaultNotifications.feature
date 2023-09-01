Feature: ESR Default Notifications

  Description: This feature file contains scenarios relating to notifications in ESR

  @ESR-533 @Regression @sarwarahmed1
  Scenario: Test a submitted request notification for the creation of an ESR ticket
    Given a user logs in with valid credentials for Native View on the NCI at your service page "nativeViewSideDoor"
    And user searches "ESR" in the filter bar
    And the user clicks on create ESR
    And user fills out all required information including "Test Project", "Test Description", "Sue Pan", "Aaron Taye", "Aaron Bell" and "123" and clicks submit
    Then user checks the activity feed and confirms request notification is sent

  @ESR-580 @ESR-578 @Regression @sarwarahmed1
  Scenario: Test a submitted request notification for the creation of an ESR ticket
    Given a user logs in with valid credentials for Native View on the NCI at your service page "nativeViewSideDoor"
    And user searches "ESR" in the filter bar
    And the user clicks on create ESR
    And user fills out all required information including "Test Project", "Test Description", "Sue Pan", "Aaron Taye", "Aaron Bell" and "123" and clicks submit
    And user proceeds into the catalog task
    And fills out catalog task with required information such as "NCI OD CRS" to get into the Federal Lead Approval stage
    Then user checks the activity feed to confirm the Federal Lead approval notification was sent
