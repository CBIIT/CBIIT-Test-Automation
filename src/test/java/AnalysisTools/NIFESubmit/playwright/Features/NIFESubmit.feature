Feature:These are the scenarios for the NIFESubmit application

  @satya @Smoke @Regression @playwright @NCIATWP-6713
    Scenario: Verify Home tab is available in the NIFE Website
    Given User navigates to the NIFE Website
    Then User clicks on the HOME tab
    Then Verify User is on the Home Tab
    Then User clicks on the Submit Metadata and View Images

  @satya @Smoke @Regression @playwright @NCIATWP-6715
  Scenario: Verify SUBMIT METADATA tab is available in the NIFE Website
    Given User navigates to the NIFE Website
    Then User clicks on the SUBMIT METADATA tab
    Then Verify User is on the SUBMIT METADATA Tab
    Then User imports the excel file

  @satya @Smoke @Regression @playwright @NCIATWP-6716
  Scenario: Verify User is able to submit metadata successfully
    Given User navigates to the NIFE Website
    Then User clicks on the SUBMIT METADATA tab
    And User enters all the required details in study information section
    Then User clicks on the submit button in NIFESubmit
    Then Verify metadata has been submitted successfully

  @satya @Smoke @Regression @playwright @NCIATWP-6717
  Scenario: Verify User is able to reset and download metadata file
    Given User navigates to the NIFE Website
    Then User clicks on the SUBMIT METADATA tab
    And User enters all the required details in study information section
    Then User clicks on the reset button
    Then Verify user is not able to submit metadata successfully
    Then User downloads the metadata file using download button

  @satya @Smoke @Regression @playwright @NCIATWP-6720
  Scenario: Verify User is able to submit metadata after adding biosample
    Given User navigates to the NIFE Website
    Then User clicks on the SUBMIT METADATA tab
    And User enters all the required details in study information section
    Then User clicks on the add biosample
    Then User enters all the required details in the biosample section
    Then User clicks on the submit button in NIFESubmit
    Then Verify metadata has been submitted successfully

  @satya @Smoke @Regression @playwright @NCIATWP-6726
  Scenario: Verify SUBMIT METADATA tab is available in the NIFE Website
    Given User navigates to the NIFE Website
    Then User clicks on the About tab
    Then User clicks on the links and verify the associated title

  @satya @Regression @Smoke @playwright @NCIATWP-6784
  Scenario: Verify user is able to click and validate urls of footer links
    Given User navigates to the NIFE Website
    Then User clicks on policies link and verify it in NIFE
    Then User clicks on the VDPolicy link and verify it in NIFE
    Then User clicks on the Accessibility link and verify it in NIFE
    Then User clicks on the viewing file link and verify it in NIFE
    Then User clicks on the FIOS link and verify it in NIFE

  @satya @Regression @Smoke @playwright @NCIATWP-6785 @NCIATWP-6800
  Scenario: Verify user is able to click and validate urls of footer links
    Given User navigates to the NIFE Website
    Then User clicks on hhs link and verify it in NIFE
    Then User clicks on NIH link and verify it in NIFE
    Then User clicks on NCI link and verify it in NIFE
    Then User clicks on USA gov link and verify it in NIFE