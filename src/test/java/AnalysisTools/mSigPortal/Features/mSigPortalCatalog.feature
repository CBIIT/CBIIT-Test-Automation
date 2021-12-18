Feature: mSigPortal Catalog Section

  Scenario: SBS Graph is being displayed

  @Smoke @matarodriguezko
  Scenario: Etiology graph on Catalog Page is displayed
    Given the user is on the mSigPortal Home page
    When the user navigates to the Catalog page
    And the user calculates by clicking on the SBS Graph
    Then a download link for the graph is displayed on the Catalog page
