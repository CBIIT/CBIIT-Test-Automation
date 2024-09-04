Feature: CBIIT Off-boarding form Scenarios
  Description: This Feature file contains CBIIT Off-boarding form Scenarios

  @OFFBOARD-18 @chaudhryma @Regression @Smoke @playwright
  Scenario: Verify the Save application functionality
    Given I am logged in as a authenticated employee (Federal, Contractor, Volunteer, Fellow etc.)
    When I navigate to to the Offboarding request form to put in a request to off-board or transfer an employee
    Then I expect to see the following Text at the top of the Request Form:
    """
    This form is used to initiate and offboarding/transfer request for any employee (Federal, Contractor, Volunteer, Fellow etc.) that is leaving CBIIT.  They could be going to another Division, Office or Center (DOC) or leaving NIH all together.  Supervisor’s or Contract POC’s should initiate this request and fill in all relevant information. You will likely have to schedule a time to turn in your badge and all equipment. Contact the CBIIT HR Task Force with any questions or concerns (NCICBIITHRTaskforce@mail.nih.gov).
    """

  @OFFBOARD-35 @chaudhryma @Regression @Smoke @playwright
  Scenario: Test 1: Reorganize Catalog Item Form Fields
    Given I am an Offboarding requester
    When I open the Offboarding request form
    Then I should see "Departure or Transfer Request" field to put in a "Departure" Request for an employee
    And If user selects “NO” for the “Is the employee located On Site?” field, then show the “FedEx Label Needed” field.
    And the “FedEx Label Needed” field should be under “Employee Address” field.
    And If user selects “Yes” for the “FedEx Label Needed” field, then show the “Are Boxes Needed for Items to be returned?” field.
    And the “Are Boxes Needed for Items to be returned?” field should be under “FedEx Label Needed” field.
    And If user selects “No”, for the “Are Boxes Needed for Items to be returned?” field, then “Number of Boxes Needed?” field does not display
    And If user selects “Yes”, for the “Are Boxes Needed for Items to be returned?” field, then show “Number of Boxes Needed?” field
    And If user selects “Yes”, for the “ Hardware Return Ticket Already Created” field , then just show “Hardware Return Ticket Number” field.

  @OFFBOARD-35 @chaudhryma @Regression @Smoke @playwright
  Scenario: Test 2: Reorganize Catalog Item Form Fields
    Given I am an Offboarding requester
    When I open the Offboarding request form
    Then I should see "Departure or Transfer Request" field to put in a "Transfer" Request
    And If user select “Yes” for the answer to “Is the employee located On Site?” field, show “Onsite Location” field.
    And If user selects “No”, for the “ Hardware Return Ticket Already Created” field , then show both the “Return Hardware Request” link  and “Hardware Return Ticket Number” field.
    And verify that the Hardware Request link URL should be "https://service-test.nci.nih.gov/ncisp?id=nci_sc_cat_item&sys_id=3fc39c056ff56e00e04fd15eae3ee46c"

  @OFFBOARD-56 @chaudhryma @Regression @Smoke @playwright
  Scenario:Test 1: Offboarding Form Changes
    Given I am an authenticated user with NCI credential
    When I fill out an offboarding form for "Departure" request under the "Departure or Transfer Request" field
    And select "Yes" for "Hardware Return Ticket Already Created" field
    Then "Hardware Return Ticket Number(s)" should be required only for departure Request

  @OFFBOARD-56 @chaudhryma @Regression @Smoke @playwright
  Scenario:Test 2: Offboarding Form Changes
    Given I am an authenticated user with NCI credential
    When I fill out an offboarding form for "Transfer" under the "Departure or Transfer Request" field
    And select "Yes" for "Hardware Return Ticket Already Created" field
    Then "Hardware Return Ticket Number(s)" should NOT be required for transfer Request