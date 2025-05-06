Feature:These are the scenarios for the mSigPortal Home application

  @satya @Smoke @Regression @playwright @NCIATWP-5957
  Scenario: Verify User is on the home page of the mSigPortal application
    Given User navigates to the mSigPortal Website
    Then Verify the title of the mSigPortal Website
    Then Verify user is on the home page of the mSigPortal website

  @satya @Smoke @Regression @playwright @NCIATWP-5957
  Scenario: Verify User is navigating to the about on clicking learn more about mSigPortal button
    Given User navigates to the mSigPortal Website
    When User clicks on the learn more about mSigPortal button
    Then Validate User is on the about navbar on the mSigPortal website

  @satya @Smoke @Regression @playwright @NCIATWP-5957
  Scenario: Verify User is navigating to the respective card on link of it
    Given User navigates to the mSigPortal Website
    When User clicks on the catalogue card on the mSigPortal website
    Then Validate User is on the catalogue navbar on the mSigPortal website
    When User clicks on the visualisation card on the mSigPortal website
    Then Validate User is on the visualisation navbar on the mSigPortal website
    When User clicks on the exploration card on the mSigPortal website
    Then Validate User is on the exploration navbar on the mSigPortal website
    When User clicks on the association card on the mSigPortal website
    Then Validate User is on the association navbar on the mSigPortal website