Feature: CBIIT Off-boarding form Scenarios
  Description: This Feature file contains CBIIT Off-boarding form Scenarios

  @OFFBOARD-18 @chaudhryma
  Scenario: Verify the Save application functionality
    Given I am logged in as a authenticated employee (Federal, Contractor, Volunteer, Fellow etc.)
    When I navigate to to the Offboarding request form to put in a request to off-board or transfer an employee
    Then I expect to see the following Text at the top of the Request Form:
"""
This form is used to initiate and offboarding/transfer request for any employee (Federal, Contractor, Volunteer, Fellow etc.) that is leaving CBIIT.  They could be going to another Division, Office or Center (DOC) or leaving NIH all together.  Supervisor’s or Contract POC’s should initiate this request and fill in all relevant information. You will likely have to schedule a time to turn in your badge and all equipment. Contact the CBIIT HR Task Force with any questions or concerns (NCICBIITHRTaskforce@mail.nih.gov).
"""

