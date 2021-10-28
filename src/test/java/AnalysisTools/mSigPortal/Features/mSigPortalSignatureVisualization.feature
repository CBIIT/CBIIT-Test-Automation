Feature: mSigPortal Signature Visualizations tab

  @Progression1 @NCIATWP-3848 @matarodriguezko
  Scenario: Profile Comparison Chart is Displayed
    Given the user is on the mSigPortal Home page
    And the user navigates to the Visualization section
    When the user calculates sample data
    When the user calculates on Profile Comparison
    Then the chart is displayed

  @Smoke @NCIATWP-3849 @matarodriguezko
  Scenario: Download Plot Link is enabled
    Given the user is on the mSigPortal Home page
    And the user navigates to the Visualization section
    When the user calculates sample data
    Then the download plot link is displayed

  @Smoke @NCIATWP-3851 @matarodriguezko
  Scenario: Success message on the Download Tab
    Given the user is on the mSigPortal Home page
    And the user navigates to the Visualization section
    When the user calculates sample data
    And the user clicks on the Download section tab
    Then the results were successfully analyzed

  @Smoke @NCIATWP-3872 @matarodriguezko
  Scenario: Clicking Load Example Files loads VCF File
    Given the user is on the mSigPortal Home page
    And the user navigates to the Visualization section
    When the user clicks on the Load Example File button
    Then the VCF example file is displayed

  @Smoke @NCIATWP-3873 @matarodriguezko
  Scenario: Cosine Similaritys Calculate tabs are clickable
    Given the user is on the mSigPortal Home page
    And the user navigates to the Visualization section
    When the user calculates sample data
    And the user clicks on Cosine Similarity
    Then the calculate button is enabled on all Cosine Tabs

  @Smoke @NCIATWP-3985 @matarodriguezko
  Scenario: Profile Comparison i icon popup message
    Given the user is on the mSigPortal Home page
    And the user navigates to the Visualization section
    When the user calculates sample data
    And the user clicks on the i icon when on the Profile Comparison tab
    Then the cosmic Signature pop up is displayed

  @Smoke1 @NCIATWP-4020 @matarodriguezko
  Scenario: Mutational Profile Sample Name allows text in field
    Given the user is on the mSigPortal Home page
    And the user navigates to the Visualization section
    When the user calculates sample data
    And then navigates to the Mutational Profiles tab
    Then text can be entered in at the Sample Name text box

  @Smoke @matarodriguezko
  Scenario: The Plot on Profiler Summary is displayed
    Given the user is on the mSigPortal Home page
    And the user navigates to the Visualization section
    When the user calculates public data
    Then the Profiler Summary plot is displayed
