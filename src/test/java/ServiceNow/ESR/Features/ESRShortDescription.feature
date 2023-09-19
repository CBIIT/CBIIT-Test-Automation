Feature: ESR Short Description
  Description: This feature file contains scenarios relating to short description fields in an ESR ticket

  @ESR-525 @Progression @sarwarahmed1
  Scenario: Test a submitted request notification for the creation of an ESR ticket
    Given a user logs in with valid credentials for Native View on the NCI at your service page "nativeViewSideDoor"
    And user searches "ESR" in the filter bar
    And the user clicks on create ESR
    And user fills out all required information including "Test Project", "Test Description", "Sue Pan", "Aaron Taye", "Aaron Bell" and "123" and clicks submit
    Then user goes into the new ESR ticket and confirms the following fields: "ESR ID" and "Stage"


