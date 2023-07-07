Feature: mSigPortal Signature Visualizations tab

  @Smoke @Uddins2
    Scenario: Visualization public default parameters
    Given the user is on the mSigPortal Home page
    When the user navigates to the Visualization section
    And the user click submit
    Then the sample count plot is displayed
