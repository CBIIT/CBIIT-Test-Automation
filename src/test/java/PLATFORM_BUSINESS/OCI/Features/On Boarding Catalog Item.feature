Feature: CBIIT On-Boarding form Scenarios
  Description: This Feature file contains CBIIT On-Boarding form Scenarios

  @OCI-1 @chaudhryma @playwright @Regression
  Scenario:Test Give Supervisors access to view the details of an onboarding ticket for new hires (contractors) working under them.
    Given I am a CBIIT Supervisor "Umit Topaloglu"
    When a Onboarding Request submitted for a New Hire (contractor)
    And I access to the submitted Onboarding Request from my portal
    Then I should have access to view the submitted onboarding request for that new hire in the Native View.

  @OCI-2 @chaudhryma @playwright @Regression
  Scenario:Test Enhance Onboarding notification to include contract company name
    Given I am a CBIIT Supervisor "Umit Topaloglu" for Onboarding Request submitted for a New Hire (contractor)
    When a new hires onboarding process has been completed and the Onboarding Request state is closed complete
    Then I should see an email notifications to be sent to me (I am CC'd) making aware that a new hires onboarding process has been completed
    And the notification includes the contract company that they work for.