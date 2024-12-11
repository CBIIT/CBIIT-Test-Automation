Feature:These are the scenarios for the FORGEdb application

  @satya @Smoke @Regression @playwright @NCIATWP-6855
  Scenario: Verify Home tab is available in the FORGEdb Website
    Given User navigates to the FORGEdb Website
    Then User clicks on the HOME tab in FORGEdb
    Then Verify User is on the Home tab
    Then User clicks on the Genome Biology link and verify it

  @satya @Smoke @Regression @playwright @NCIATWP-6857
  Scenario: Verify user is on the explore tab after clicking on the Example Analysis
    Given User navigates to the FORGEdb Website
    Then User clicks on the HOME tab in FORGEdb
    Then User clicks on the example analysis
    Then Verify user is on the explore tab

  @satya @Smoke @Regression @playwright @NCIATWP-6857
  Scenario: Verify user is on the explore tab after clicking on the Example Analysis
    Given User navigates to the FORGEdb Website
    Then User clicks on the example analysis
    Then User clicks on genome link and verify it.
    Then User clicks on FORGEdb score link
    Then Verify user is on the about tab in the FORGEdb website

  @satya @Smoke @Regression @playwright @NCIATWP-6858
  Scenario: Verify user is able to search with rsid in home tab and get the results in the explore tab
    Given User navigates to the FORGEdb Website
    Then User clicks on the HOME tab in FORGEdb
    Then User enters the rsid in the search box
    Then User clicks on the search button
    Then Verify search query has given the results on the explore tab

  @satya @Smoke @Regression @playwright @NCIATWP-6858
  Scenario: Verify user is able to search with rsid from explore tab
    Given User navigates to the FORGEdb Website
    Then User clicks on the explore tab
    And User enters text in the search box of explore tab
    Then User clicks on the search button in explore tab
    Then Verify search query has given the results on the explore tab

  @satya @Smoke @Regression @playwright @NCIATWP-6859
  Scenario: Verify about tab is available in the FORGEdb website
    Given User navigates to the FORGEdb Website
    Then User clicks on the about tab in the FORGEdb website
    Then Verify user is on the about tab in the FORGEdb website

  @satya @Smoke @Regression @playwright @NCIATWP-6964
  Scenario: Verify User is able to
    Given User navigates to the FORGEdb Website
    Then User clicks on the about tab in the FORGEdb website
    Then User clicks on the image in about tab
    Then Verify the FORGEdb result text in the about tab

  @satya @Smoke @Regression @playwright @NCIATWP-6964
  Scenario: Verify user is able to navigate to FORGE2.0 website and clicks on run button
    Given User navigates to the FORGEdb Website
    Then User clicks on the example analysis
    Then User clicks on the FORGE2 link and then click on run button
    Then Verify user is on the explore tab

  @satya @Smoke @Regression @playwright @NCIATWP-6964
  Scenario: Verify title of new page available in the about tab of FORGEdb website
    Given User navigates to the FORGEdb Website
    Then User clicks on the about tab in the FORGEdb website
    Then User clicks on the youtube link for specific scores explanation
    Then User clicks on the division of cancer link and verify title of it

  @satya @Smoke @Regression @playwright @NCIATWP-7441
  Scenario: Verify User is able to click on footer links under policies
    Given User navigates to the FORGEdb Website
    Then User clicks on the Accessibility link and verify the opened page
    Then User clicks on the Disclaimer link and verify the opened page
    Then User clicks on the FOIA link and verify the opened page
    Then User clicks on the HHS Vulnerability Disclosure link and verify the opened page

  @satya @Smoke @Regression @playwright @NCIATWP-7441
  Scenario: Verify User is able to click on footer links under more information section
    Given User navigates to the FORGEdb Website
    Then User clicks on the US Department of Health link and verify the opened page
    Then User clicks on the NIH link and verify the opened page
    Then User clicks on the NCI link and verify the opened page
    Then User clicks on the USA gov link and verify the opened page