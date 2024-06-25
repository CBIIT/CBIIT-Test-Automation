Feature: CBIIT Off-boarding form Scenarios
  Description: This Feature file contains CBIIT Off-boarding form Scenarios

  @OFFBOARD-18 @chaudhryma @Regression @playwright
  Scenario: Verify the Save application functionality
    Given I am logged in as a authenticated employee (Federal, Contractor, Volunteer, Fellow etc.)
    When I navigate to to the Offboarding request form to put in a request to off-board or transfer an employee
    Then I expect to see the following Text at the top of the Request Form:
    """
    This form is used to initiate and offboarding/transfer request for any employee (Federal, Contractor, Volunteer, Fellow etc.) that is leaving CBIIT.  They could be going to another Division, Office or Center (DOC) or leaving NIH all together.  Supervisor’s or Contract POC’s should initiate this request and fill in all relevant information. You will likely have to schedule a time to turn in your badge and all equipment. Contact the CBIIT HR Task Force with any questions or concerns (NCICBIITHRTaskforce@mail.nih.gov).
    """

  @OFFBOARD-35 @chaudhryma @Regression @playwright
  Scenario: Test Reorganize Catalog Item Form Fields
    Given I am an Offboarding requester
    When I open the Offboarding request form
    Then I should see "Departure or Transfer Request" field
    And If user selects “NO” for the “Is the employee located On Site?” field, then show the “FedEx Label Needed” field.
    And the “FedEx Label Needed” field should be under “Employee Address” field.
    And If user selects “Yes” for the “FedEx Label Needed” field, then show the “Are Boxes Needed for Items to be returned?” field.
    And If user selects “Yes”, for the “Are Boxes Needed for Items to be returned?” field, then show “Number of Boxes Needed?” field
    And If user selects “Yes”, for the “ Hardware Return Ticket Already Created” field , then just show “Hardware Return Ticket Number” field.