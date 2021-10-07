Feature: mSigPortal Signature Visualizations tab

@Progression @NCIATWP-3828 @matarodriguezko
  Scenario: Incorrect File Type Error Message
    Given the user is on the mSigPortal Home page
    When the user submits with an incorrect file type
    Then an error message is displayed

	@NCIATWP-3848		@matarodriguezko
  Scenario: Profile Comparison Chart is Displayed
    Given the user is on the mSigPortal Home page
    And the user navigates to the Visualization section
    When User inputted data is selected
    And the user loads example data with file format VCF
    When the data is calculated
    Then the user navigates to Profile Comparison
    When the user calculates on Profile Comparison
    Then the chart is displayed

@Smoke 	@NCIATWP-3849	 @matarodriguezko
  Scenario: Download Plot Link is enabled
    Given the user is on the mSigPortal Home page
    And the user navigates to the Visualization section
    When the user calculates sample data
    Then the download plot link is displayed

@Smoke 	@NCIATWP-3851	 @matarodriguezko
  Scenario: Success message on the Download Tab
    Given the user is on the mSigPortal Home page
    And the user navigates to the Visualization section
    When the user calculates sample data
    And the user clicks on the Download section tab
    Then the results were successfully analyzed

 	@NCIATWP-3870	 @matarodriguezko
  Scenario: 
    Given the user is on the mSigPortal Home page
    When the user clicks on the Signature Visualization banner
    Then the Public and User radio button buttons are clickable

 	@NCIATWP-3872	 @matarodriguezko
  Scenario: 
    Given the user is on the mSigPortal Home page
    And the user navigates to the Visualization section
    When the User data source is selected
    And the user clicks on load Example Data link
    Then the VCF example file is displayed

 	@NCIATWP-3873	 @matarodriguezko
  Scenario: 
    Given the user is on the mSigPortal Home page
    And the user navigates to the Visualization section
    When the user calculates using User provided example data
    And the user clicks on Cosine Similarity
    Then the calculate button is enabled on all 3 Cosine Tabs
