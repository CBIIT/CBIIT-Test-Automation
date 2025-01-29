Feature: These are the scenarios for the Home page on the JPSurv Application

  @Smoke @satya @Regression @playwright @NCIATWP-2205
  Scenario: Verify all the links available in the JPSurv website
    Given User navigates to JPSurv home page
    Then User clicks on the Surveillance Research Program link
    Then Verify user is in the NCI Analysis Tools Home Page

  @Smoke @satya @playwright @Regression @NCIATWP-6670 @NCIATWP-4478
  Scenario: Verify all the links available in the JPSurv website
    Given User navigates to JPSurv home page
    Then User clicks on the see article links and validate the title
    Then User clicks on the journal link and validate the title

  @Smoke @satya @playwright @Regression @NCIATWP-1698 @NCIATWP-4434
  Scenario: Verify user is able to navigate to help link in JPSurv website
    Given User navigates to JPSurv home page
    Then User clicks on the help tab in the JPOSurv website
    Then Verify user is in the help section of the website

  @Smoke @satya @playwright @Regression @NCIATWP-8065 @NCIATWP-1696
  Scenario: Verify user clicks on the submit button to calculate cohert and model specifications
    Given User navigates to JPSurv home page
    Then User uploads file in the homepage
    Then User selects start year of diagnosis
    Then User selects end year of diagnosis
    Then User selects interval of maximum years of diagnosis
    Then User clicks on the NHL checkbox
    Then User clicks on the submit button to calculate cohert and model specifications

  @Smoke @satya @playwright @Regression @NCIATWP-4322
  Scenario: Verify reset button is working fine
    Given User navigates to JPSurv home page
    Then User uploads file in the homepage
    Then User selects start year of diagnosis
    Then User selects end year of diagnosis
    Then User selects interval of maximum years of diagnosis
    Then User clicks on the NHL checkbox
    Then User clicks on the reset button to reset the selected data

  @Smoke @satya @playwright @Regression @NCIATWP-7693 @NCIATWP-7692 @NCIATWP-7662 @NCIATWP-6662
  Scenario: Verify user is able to do the conditional survival calculation
    Given User navigates to JPSurv home page
    Then User uploads file in the homepage
    Then User selects start year of diagnosis
    Then User selects end year of diagnosis
    Then User selects interval of maximum years of diagnosis
    Then User clicks on the NHL checkbox
    Then User clicks on the submit button to calculate cohert and model specifications
    Then User expands the conditional survival calculation field
    Then User clicks on the conditional survival recalculation checkbox
    Then User selects the start and end conditional intervals
    Then User clicks on the submit button

  @Smoke @satya @playwright @Regression @NCIATWP-7763 @NCIATWP-7690
  Scenario: Verify user is able to do the conditional survival calculation with multiple intervals
    Given User navigates to JPSurv home page
    Then User uploads file in the homepage
    Then User selects start year of diagnosis
    Then User selects end year of diagnosis
    Then User selects interval of maximum years of diagnosis
    Then User clicks on the NHL checkbox
    Then User clicks on the submit button to calculate cohert and model specifications
    Then User expands the conditional survival calculation field
    Then User clicks on the conditional survival recalculation checkbox
    Then User selects the start and end conditional intervals
    Then User clicks on the add interval
    Then User selects the start and end conditional intervals in the new interval
    Then User clicks on the submit button

  @Smoke @satya @playwright @Regression @NCIATWP-8384 @NCIATWP-2232 @NCIATWP-1699 @NCIATWP-4383
  Scenario: Verify user is able to click on the full dataset and workspace link
    Given User navigates to JPSurv home page
    Then User uploads file in the homepage
    Then User selects start year of diagnosis
    Then User selects end year of diagnosis
    Then User selects interval of maximum years of diagnosis
    Then User clicks on the NHL checkbox
    Then User clicks on the submit button to calculate cohert and model specifications
    Then User clicks on the download full dataset link
    Then User click on the save workspace link

  @Smoke @satya @playwright @Regression @NCIATWP-1697
  Scenario: Verify user is able to upload the CSV file under the same input type
    Given User navigates to JPSurv home page
    Then User selects CSV file as input type
    Then User uploads CSV file in the homepage

  @Smoke @satya @playwright @Regression @CIATWP-8046 @NCIATWP-8045 @NCIATWP-1714
  Scenario: Verify user is able to get the data on uploading ZIP file under the workspace as the input type
    Given User navigates to JPSurv home page
    Then User selects workspace as input type
    Then User uploads the ZIP file in the homepage
    Then User clicks on the submit button after uploading file
    Then User clicks on every presentation of nav item
    Then Verify user is able to hide the configuration panel

  @Smoke @satya @playwright @Regression @NCIATWP-7664 @NCIATWP-7657 @NCIATWP-2190
  Scenario: Verify user is able to click on the every presentation of nav item and also able to hide the configuration panel
    Given User navigates to JPSurv home page
    Then User uploads file in the homepage
    Then User selects start year of diagnosis
    Then User selects end year of diagnosis
    Then User selects interval of maximum years of diagnosis
    Then User clicks on the NHL checkbox
    Then User clicks on the submit button to calculate cohert and model specifications
    Then User clicks on every presentation of nav item
    Then Verify user is able to hide the configuration panel

  @Smoke @satya @playwright @Regression  @NCIATWP-4625
  Scenario: Verify user is able to submit the data to the email
    Given User navigates to JPSurv home page
    Then User uploads file in the homepage
    Then User selects start year of diagnosis
    Then User selects end year of diagnosis
    Then User selects interval of maximum years of diagnosis
    Then User clicks on the NHL checkbox
    Then User selects the long running job checkbox
    Then User enters "JPSurv NHL job" as job name and "gugulothus2@nih.gov" as email in the notification section
    Then User clicks on the submit button after uploading file
    Then Verify the data is submitted to the email

  @Smoke @satya @playwright @Regression @NCIATWP-2749
  Scenario: Verify user changes cohort type from NHL to CML and clicks on every presentation of nav item
    Given User navigates to JPSurv home page
    Then User uploads file in the homepage
    Then User selects start year of diagnosis
    Then User selects end year of diagnosis
    Then User selects interval of maximum years of diagnosis
    Then User selects both on the NHL and CML checkbox
    Then User clicks on the submit button to calculate cohert and model specifications
    Then User changes cohort from NHL to CML
    Then User clicks on every presentation of nav item
    Then Verify user is able to hide the configuration panel

  @Smoke @satya @playwright @Regression @NCIATWP-8065 @NCIATWP-1696 @NCIATWP-8152
  Scenario: Verify user clicks on the submit button to calculate cohert and model specifications
    Given User navigates to JPSurv home page
    Then User uploads file in the homepage
    Then User selects start year of diagnosis
    Then User selects end year of diagnosis
    Then User selects interval of maximum years of diagnosis
    Then User clicks on the NHL checkbox
    Then User checks the relax proportionality and selects the cutpoint "5"
    Then User clicks on the submit button to calculate cohert and model specifications
    Then User changes the Cutpoint to "6"
    Then Validate that result page contains plots
    Then User changes the Cutpoint to optimal
    Then Validate that result page contains plots
    Then Validate BIC text is been displayed after calculation

  @Smoke @satya @playwright @Regression @NCIATWP-8065 @NCIATWP-1696
  Scenario: Verify user clicks on the submit button to calculate cohert and model specifications
    Given User navigates to JPSurv home page
    Then User uploads file in the homepage
    Then User selects start year of diagnosis
    Then User selects end year of diagnosis
    Then User selects interval of maximum years of diagnosis
    Then User clicks on the NHL checkbox
    Then User checks the relax proportionality and selects the cutpoint "5"
    Then User clicks on the submit button to calculate cohert and model specifications
    Then Verify Cutpoint is coming next to Cohort and Model table headings

  @Smoke @satya @playwright @Regression @NCIATWP-6669
  Scenario: Verify user is able to get the trend measures on recalculating between calendar year of diagnosis
    Given User navigates to JPSurv home page
    Then User uploads file in the homepage
    Then User selects start year of diagnosis
    Then User selects end year of diagnosis
    Then User selects interval of maximum years of diagnosis
    Then User selects only CML checkbox only
    Then User clicks on the submit button to calculate cohert and model specifications
    Then User clicks on recalculate after selecting calendar year from "1980" to "1990"
    Then Verify the user is getting result after recalculating

  @Smoke @satya @playwright @Regression @NCIATWP-8065
  Scenario: Verify user is able to click on the footer links
    Given User navigates to JPSurv home page
    Then User clicks on the cancer control link and verify
    Then User clicks on the NCI link and verify it under div tag

  @Smoke @satya @playwright @Regression @NCIATWP-6669
  Scenario: Verify user is able to click on the death vs year at diagnosis tab
    Given User navigates to JPSurv home page
    Then User uploads file in the homepage
    Then User selects start year of diagnosis
    Then User selects end year of diagnosis
    Then User selects interval of maximum years of diagnosis
    Then User selects only CML checkbox only
    Then User clicks on the submit button to calculate cohert and model specifications
    Then User clicks on death vs year at diagnosis

  @Smoke @satya @playwright @Regression @NCIATWP-6611 @NCIATWP-6565
  Scenario: Verify user is able to click on the death vs year at diagnosis tab
    Given User navigates to JPSurv home page
    Then User uploads file in the homepage
    Then User selects start year of diagnosis
    Then User selects end year of diagnosis
    Then User selects interval of maximum years of diagnosis
    Then User selects only CML checkbox only
    Then User clicks on the submit button to calculate cohert and model specifications
    Then Verify model is selected as "1 (final selected model)"
    Then User adds and remove interval after clicking on the conditional survival calculation

  @Smoke @satya @playwright @Regression @NCIATWP-8065
  Scenario: Verify user is able to click on the footer links under more information
    Given User navigates to JPSurv home page
    Then User clicks on the HHS of US Department link and verify it
    Then User clicks on the NIH link and verify it
    Then User clicks on the NCI link and verify it
    Then User clicks on the USA gov link and verify it

  @Smoke @satya @playwright @Regression @NCIATWP-8065 @NCIATWP-4627
  Scenario: Verify user is able to click on the footer links under policies
    Given User navigates to JPSurv home page
    Then User clicks on the accessibility link and verify it
    Then User clicks on the Disclaimer link and verify it
    Then User clicks on the FOIA link and verify it
    Then User clicks on the HHS Vulnerability Disclosure link and verify it

  @Smoke @satya @playwright @Regression @NCIATWP-7683
  Scenario: Verify result page contains plots after calculations
    Given User navigates to JPSurv home page
    Then User uploads file in the homepage
    Then User selects start year of diagnosis
    Then User selects end year of diagnosis
    Then User selects interval of maximum years of diagnosis
    Then User selects only CML checkbox only
    Then User clicks on the submit button to calculate cohert and model specifications
    Then Validate that result page contains plots

  @Smoke @satya @playwright @Regression @NCIATWP-7669
  Scenario: Verify Conditional Survival Calculation button availability after calculation
    Given User navigates to JPSurv home page
    Then User calculates cohert and model specifications with Conditional Survival Model Using Truncated Data
    Then Validate Conditional Survival Calculation button is not available after calculation.
    Then User calculates cohert and model specifications with Relax proportionality
    Then Validate Conditional Survival Calculation button is not available after calculation.
    Then User calculates cohert and model specifications with No Options
    Then Validate Conditional Survival Calculation button is available after calculation.

  @Smoke @satya @playwright @Regression @NCIATWP-7668 @NCIATWP-7660 @NCIATWP-4322 @NCIATWP-7672
  Scenario: Verify cut point is already selected and cut point text ia also visible
    Given User navigates to JPSurv home page
    Then User uploads files and adds other data with relax proportionality
    Then Validate that cut point is already selected with optimum value
    Then Validate that cut point text is visible
    And User clicks on the Advanced options and changes the entry to "8"
    Then User clicks on the reset advanced options and validates entry is not "8"

  @Smoke @satya @playwright @Regression @NCIATWP-4376
  Scenario: Verify whether add annotation is clickable or not
    Given User navigates to JPSurv home page
    Then User calculates cohert and model specifications with Conditional Survival Model Using Truncated Data
    And Verify add annotation button is visible and clickable
    Then Click on the Add Annotation button

  @Smoke @satya @playwright @Regression @NCIATWP-1727
  Scenario: Verify result page contains plots after calculations
    Given User navigates to JPSurv home page
    Then User uploads file in the homepage
    Then User selects start year of diagnosis
    Then User selects end year of diagnosis
    Then User selects interval of maximum years of diagnosis
    Then User selects only CML checkbox only
    Then User clicks on the submit button to calculate cohert and model specifications
    And User clicks on the model estimates
    Then Validates the model estimates contains mentioned texts

  @Smoke @satya @playwright @Regression @NCIATWP-6706 @NCIATWP-7764
  Scenario: Verify result page contains plots after calculations
    Given User navigates to JPSurv home page
    And User add specifications with NHL and Relax proportionality checkboxes
    Then Validate Relax Proportionality text is visible
    Then User clicks on the submit button to calculate cohert and model specifications
    Then Validate the title of all the columns of the model table after calculation