Feature: CBIIT On-Boarding form Scenarios
  Description: This Feature file contains CBIIT On-Boarding form Scenarios

  @OCI-9 @chaudhryma @playwright @IN-PROGRESS
  Scenario:Test Give Supervisors access to view the details of an onboarding ticket for new hires (contractors) working under them.
    Given I am a CBIIT Supervisor "Umit Topaloglu" for Onboarding Request submitted for a New Hire (contractor)
    When I access to the submitted Onboarding Request from my portal
    Then I should have access to view the submitted onboarding request for that new hire in the Native View.