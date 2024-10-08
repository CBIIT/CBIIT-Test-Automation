Feature: mSigPortal Signature Explorer tab

  @matakevin @NEEDSREVIEW @selenium
  Scenario: Tumor Mutational Burden graph on Signature Exploration Page is displayed
    Given the user is on the mSigPortal Home page
    When the user navigates to the Signature Explorer page
    And the user calculates using public data
    Then the Tumor Mutational Burden download plot link is displayed

  @Smoke @matakevin @selenium
  Scenario: Instructions are displayed on the default Explorer Page
    Given the user is on the mSigPortal Home page
    When the user navigates to the Signature Explorer page
    Then the Instructions are displayed
