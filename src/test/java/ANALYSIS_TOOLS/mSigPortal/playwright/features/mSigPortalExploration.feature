Feature:These are the scenarios for the Exploration tab of mSigPortal website

  @satya @Smoke @Regression @playwright @NCIATWP-5969 @NCIATWP-5935
  Scenario: Verify User is on the Exploration tab of the mSigPortal application
    Given User navigates to the mSigPortal Website
    When User clicks on the exploration card on the mSigPortal website
    And User clicks on the submit button in the exploration tab
    Then User click on the reset button in the exploration tab