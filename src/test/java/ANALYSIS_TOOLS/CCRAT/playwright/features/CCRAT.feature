Feature:These are the scenarios for the CCRAT application

  @satya @Smoke @Regression @playwright @NCIATWP-1301 @NCIATWP-8659
  Scenario: Verify User is on the CCRAT online calculator page
    Given User navigates to the CCRAT Website
    Then User clicks on the CCRAT link
    Then Verify User is on the CCRAT online calculator page

  @satya @Smoke @Regression @playwright @NCIATWP-1301 @NCIATWP-8660
  Scenario: Verify User is on about the calculator page
    Given User navigates to the CCRAT Website
    When User clicks on about the calculator page
    Then Verify User is on about the calculator page

  @satya @Smoke @Regression @playwright @NCIATWP-8661
  Scenario: Verify User is able to navigate to the CCRAT calculator page
    Given User navigates to the CCRAT Website
    When User clicks on the CCRAT calculator page
    Then Verify User is on the CCRAT calculator page

  @satya @Smoke @Regression @playwright @NCIATWP-8662
  Scenario: Verify User is able to click on the links available for resources
    Given User navigates to the CCRAT Website
    Then User clicks on the CCRAT link
    Then User clicks on the colorectal cancer link and verify it
    Then User clicks on the test to detect colorectal cancer link and verify it

  @satya @Smoke @Regression @playwright @NCIATWP-8663
  Scenario: Verifying the links available on about the calculator page in CCRAT website
    Given User navigates to the CCRAT Website
    When User clicks on about the calculator page
    Then User clicks on the SAS Macro link and verify it
    Then User clicks on the Gauss program link and verify it
    Then user clicks on the Colorectal cancer risk prediction link and verify it
    Then user clicks on the  Validation of a colorectal cancer risk prediction link and verify it

  @satya @Smoke @Regression @playwright @NCIATWP-8664
  Scenario: Verifying that the reset button in risk calculator is working as expected
    Given User navigates to the CCRAT Website
    When User clicks on the Calculate Patient Risk button in CCRAT
    Then User selects some fields under risk calculator tab
    And User clicks on the reset button under risk calculator
    Then Verify that selected fields are deselected now

  @satya @Smoke @Regression @playwright @NCIATWP-8665
  Scenario: Verifying that user is able to calculate the risk under the specified tab
    Given User navigates to the CCRAT Website
    When User clicks on the Calculate Patient Risk button in CCRAT
    Then User enters all the mandatory details in the calculation of risk
    Then User calculates the risk based on the entered details

  @satya @Smoke @Regression @playwright @NCIATWP-8666
  Scenario: Verify user can start a new assessment after submitting the current assessment
    Given User navigates to the CCRAT Website
    When User clicks on the Calculate Patient Risk button in CCRAT
    Then User enters all the mandatory details in the calculation of risk
    Then User calculates the risk based on the entered details
    Then User clicks on the start a new assessment button to recalculate
    Then Verify that selected fields are deselected now

  @satya @Smoke @Regression @playwright @NCIATWP-8667
  Scenario: Verify that user is able to edit the calculated risk on entered details
    Given User navigates to the CCRAT Website
    When User clicks on the Calculate Patient Risk button in CCRAT
    Then User enters all the mandatory details in the calculation of risk
    Then User calculates the risk based on the entered details
    Then User clicks on the edit response button
    Then user edits the family history details in the risk calculator page
    Then User calculates the risk based on the entered details

  @satya @Smoke @Regression @playwright @NCIATWP-8662
  Scenario: Verify User is on the CCRAT online calculator page
    Given User navigates to the CCRAT Website
    Then User clicks on the CCRAT link
    When User clicks on the Calculate Patient Risk button in CCRAT
    Then User enters wrong height data and validates the error message

  @satya @Smoke @Regression @playwright @NCIATWP-8663
  Scenario: Verify User is on the CCRAT online calculator page
    Given User navigates to the CCRAT Website
    Then User clicks on home link in the footer and validates it
    Then User clicks on contact link in the footer and validates it