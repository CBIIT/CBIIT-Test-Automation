Feature: mSigPortal Catalog Section

  Scenario: SBS Graph is being displayed

  @matakevin @NEEDSREVIEW
  Scenario: Etiology graph on Catalog Page is displayed
    Given the user is on the mSigPortal Home page
    When the user navigates to the Catalog page
    And the user calculates by clicking on the SBS Graph
    Then a download link for the graph is displayed on the Catalog page

  @Smoke @matakevin
  Scenario: SBS24 plot for Aflatoxin etiologies under cancer reference signature category displays
    Given the user is on the mSigPortal Home page
    When the user navigates to the Catalog page
    And the user clicks Cancer Reference Signatures Catagory
    And the user clicks Aflatoxin Proposed Etiologies
    And the user selects SBS24 signature
    Then SBS24 plot displays

  @Smoke @matakevin
  Scenario: SBS96 Pie chart displays on RS in mSigPortal
    Given the user is on the mSigPortal Home page
    When the user navigates to the Catalog page
    And the user clicks Reference Signature tab
    Then the SBS96 Pie chart is displays

  @Smoke @matakevin
  Scenario: SBS1 plot displays in RS profile
    Given the user is on the mSigPortal Home page
    When the user navigates to the Catalog page
    And the user clicks Reference Signature tab
    And the user clicks RSProfile
    And the user clicks calculate button
    Then the SBS1 plot is displays
    Then the RS Profile graph is displays
    Then the RS Profile graph bar is displays