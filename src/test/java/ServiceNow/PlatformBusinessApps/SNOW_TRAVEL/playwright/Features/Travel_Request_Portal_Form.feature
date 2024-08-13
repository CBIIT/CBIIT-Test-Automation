Feature: SNOWTRAVEL Portal Form Scenarios
  Description: This Feature file contains SNOWTRAVEL Travle Planning System Form Scenarios

  @SNOWTRAVEL-131 @Chaudhryma @Smoke @Regression @playwright
  Scenario: Test Rename "Travel Request" form Catalog Item
    Given I am an authenticated NCI user,
    When I navigate to the NCI at Your Service Portal,
    And I click on "Services"
    And I click "CBIIT Business Services",
    Then I will see the current form "Travel Request" updated to "Travel Planning System"

  @SNOWTRAVEL-130 @Chaudhryma @Smoke @Regression @playwright
  Scenario: Test Travel Start Date and Travel End Date Field Additions
    Given I am an authenticated DOC CGH Travel Request User
    When I navigate to the Trip Information section of the form,
    Then I should see the required "Travel Start Date" field to enter date
    And also see the required "Travel End Date" field to enter date
    And the "Travel Start Date" field will map to the Travel Start Date field in the variables section of the RITM in NV
    And the "Travel End Date" field will map to the Travel End Date in the variables section of the RITM in NV

  @SNOWTRAVEL-125 @Chaudhryma @Smoke @Regression @playwright
  Scenario: Test 1: CGH Field Enhancements on Travel Request Form
    Given I am an authenticated DOC CGH Travel Request User
    When I am on the "Travel Planning System" form
    Then I verify the first four questions on the form under "Travel Questions" section
    And the first question "Do you have a defined role at the meeting/conference or intended for professional development?" is optional
    And the second question "Does your travel align with your group's Strategic Plan and Staff role/duties?" is optional
    And the third question "Does your travel meet travel deadlines and administrative deadlines (training requirements, passport/visa requirements)?" is optional
    And I verify that the fourth question "Do you travel to a Level 3 or 4 travel advisory location?" is also optional

  @SNOWTRAVEL-125 @Chaudhryma @Smoke @Regression @playwright
  Scenario: Test 2: CGH Field Enhancements on Travel Request Form
    Given I am an authenticated DOC CGH Travel Request User
    When I am on the "Travel Planning System" form
    Then I will not see the following help text language under the field "Destination Type" under the "Event" section:"Local needs to be submitted 2 weeks before event date."

  @SNOWTRAVEL-125 @Chaudhryma @Smoke @Regression @playwright
  Scenario: Test 3: CGH Field Enhancements on Travel Request Form
    Given I am an authenticated DOC CGH Travel Request User
    When I am on the "Travel Planning System" form
    Then I will not see the Header on the form "Travel Cash Advance",
    And the following fields under "Travel Cash Advance" section will be removed:
      """
      Cash (Direct Deposit) Advance Requested
      Reason for Cash Advance
      """