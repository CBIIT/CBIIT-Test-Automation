Feature:These are the scenarios for the Visualization tab of mSigPortal website

  @satya @Smoke @Regression @playwright @NCIATWP-5609
  Scenario: Verify User is on the Visualization tab of the mSigPortal application
    Given User navigates to the mSigPortal Website
    When User clicks on the visualization card on the mSigPortal website
    And User clicks on the submit button in the visualization tab
    Then User click on the reset button in the visualization tab

  @satya @Smoke @Regression @playwright @NCIATWP-5711
  Scenario: Verify User is able to get bar graph on calculating and also able to download the the plotly data
    Given User navigates to the mSigPortal Website
    When User clicks on the visualization card on the mSigPortal website
    And User clicks on the submit button in the visualization tab
    And navigates to the "Mutational Pattern Enrichment Analysis" tab
    And calculates with "0.2" minimal proportions
    Then Validates the bar graph is displayed
    Then user clicks on the download the plotly data

  @satya @Smoke @Regression @playwright @NCIATWP-5907
  Scenario: Verify that minimal proportion value should be between zero and one
    Given User navigates to the mSigPortal Website
    When User clicks on the visualization card on the mSigPortal website
    And User clicks on the submit button in the visualization tab
    And navigates to the "Mutational Pattern Enrichment Analysis" tab
    And calculates with "5" minimal proportions
    Then Validate the error message "Enter a value between 0 and 1"

  @satya @Smoke @Regression @playwright @NCIATWP-5864
  Scenario: Verify the user is able to check SBS96 Plot is displayed or not
    Given User navigates to the mSigPortal Website
    When User clicks on the visualization card on the mSigPortal website
    And User clicks on the submit button in the visualization tab
    And User moves to the "Mutational Profiles" tab
    Then verifies that profile type is selected "SBS" and matrix size as "96"
    Then the SBS96 Plot is displayed
    Then User clicks on the download plotly data button under Mutational Profiles tab