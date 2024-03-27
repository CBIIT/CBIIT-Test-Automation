@MCAExplorer
Feature: MCAExplorer features

  @satya @Regression @NCIATWP-6311 @NCIATWP-6723 @NCIATWP-6298 @NCIATWP-6722
  Scenario: MCAExplorer Row count Validation
    Given User navigates to MCAExplorer page
    Then clicks on advance filters
    Then clicks on submit button
    Then verify if the circle is present on the screen
    Then verify that there are some rows in the result
    Then Zoom in in the circle
    Then go back to full circle
    Then verify if the circle is present on the screen

  @satya @Regression @NCIATWP-6606 @NCIATWP-5438
  Scenario: Verify graph & table will be empty when we removed the mandatory fields & try to plot the graph
    Given User navigates to MCAExplorer page
    When User clears the mandatory field Study
    And clicks on submit button
    Then verify that there are 0 rows in the result

  @satya @Smoke @Regression @NCIATWP-6676 @NCIATWP-6797
  Scenario: Verify data with different plot types
    Given User navigates to MCAExplorer page
    Then user select "Chromosome level" in plot type
    Then select chromosome 1 in chromosome dropdown
    Then clicks on submit button
    Then verify that there are 198 rows in the result

  @satya @Regression @NCIATWP-5316 @NCIATWP-5326 @NCIATWP-6270
  Scenario: Verify the selection of X & Y should display on the graph & table column
    Given User navigates to MCAExplorer page
    When User selects 'X' include chromosome
    And clicks on submit button
    Then verify the graph contains the 'X' value
    When User selects 'Y' include chromosome
    And clicks on submit button
    Then verify the graph contains the 'Y' value

  @satya @Regression @NCIATWP-6766 @NCIATWP-5541
  Scenario: Verify the plot type for Chromosome Level
    Given User navigates to MCAExplorer page
    When user select "Chromosome level" in plot type
    And select chromosome 1 in chromosome dropdown
    And User verify the end range as '248956422'
    And select chromosome 2 in chromosome dropdown
    And User verify the end range as '242193529'
    And clicks on advance filters
    And clicks on submit button

  @satya @Regression @NCIATWP-6310 @NCIATWP-6298 @NCIATWP-6722
  Scenario: Verify the pagination functionality in the grid
    Given User navigates to MCAExplorer page
    When clicks on submit button
    Then verify '10' rows displayed in the table
    And select the pagination drop down as '25'
    Then verify '25' rows displayed in the table

  @satya @Regression @NCIATWP-6310 @NCIATWP-6298
  Scenario: Verify the pairwise plot all chromosome circle
    Given User navigates to MCAExplorer
    When user clicks pairwise PLOTS CHECKBOX
    And user selects 'X' and 'Y' chromosomes in Include Chromosomes
    And user click choose more attribute
    And user selects age checkbox
    And user enter "5" & "7" in GroupA age
    And user enter "6" & "8" in GroupB age
    Then user clicks save button
    Then user should verify that circle is present on the screen

  @satya @Regression @NCIATWP-5324 @NCIATWP-6310
  Scenario: Verify user is able to zoom more than once
    Given User navigates to MCAExplorer page
    Then clicks on advance filters
    Then clicks on submit button
    Then verify if the circle is present on the screen
    Then Zoom in in the circle

  @satya @Regression @NCIATWP-6605 @NCIATWP-5320
  Scenario: Verify the download images functionality
    Given User navigates to MCAExplorer
    When user clicks pairwise PLOTS CHECKBOX
    And user selects 'x' and 'y' chromosomes in Include Chromosomes
    And user click choose more attribute
    And user selects age checkbox
    Then user clicks save button
    Then click on download comparison image

  @satya @Regression @NCIATWP-6268 @NCIATWP-5545 @NCIATWP-5577 @NCIATWP-5338
  Scenario: Verify the pair wise plot all chromosome Table rows
    Given User navigates to MCAExplorer
    When user clicks pairwise PLOTS CHECKBOX
    And user selects 'x' and 'y' chromosomes in Include Chromosomes
    And user click choose more attribute
    And user selects age checkbox
    And user selects study,copy number state and age "5" "20" in both Group A and Group B
    Then user clicks save button

  @satya @Regression @NCIATWP-6676 @NCIATWP-5576 @NCIATWP-5546
  Scenario: Verify the pair wise plot allchromoso me chart header
    Given User navigates to MCAExplorer
    When user clicks pairwise PLOTS CHECKBOX
    And user selects 'All Chromosomes' in Plot Type dropdown
    And user selects 'x' and 'y' chromosomes in Include Chromosomes
    And user click choose more attribute
    And user selects age checkbox
    And user selects study,copy number state and age "5" "20" in both Group A and Group B
    Then user clicks save button
    Then user can verify that chart header is "Study: PLCOUK Biobank; Types: Loss; Age: 5-20"

  @satya @Regression @NCIATWP-6478 @NCIATWP-5327
  Scenario: verify the export data download functionality
    Given User navigates to MCAExplorer
    When user select Chromosome level in plot type
    And select chromosome 1 in chromosome dropdown
    And clicks on submit button
    Then user clicks export data, file should get downloaded