Feature:These are the scenarios for the MRAT application

  @satya @Smoke @Regression @playwright
  Scenario: Verify User is on the MRAT online calculator page
    Given User navigates to the MRAT Website
    Then User clicks on the MRAT link
    Then Verify User is on the MRAT calculator page

  @satya @Smoke @Regression @playwright
  Scenario: Verify all the links for the resources on Melanoma Risk
    Given User navigates to the MRAT Website
    Then User clicks on the MRAT link
    Then User clicks on the skin cancer link
    Then User clicks on the Melanoma vs Mole link
    Then User clicks on the common moles link
    Then User clicks on the CCT for Melanoma Prevention link
    Then User clicks on the What Does Melanoma Look Like link

  @satya @Smoke @Regression @playwright
  Scenario: Verify User is on about the calculator tab
    Given User navigates to the MRAT Website
    Then User clicks on the about the calculator tab in the MRAT Website
    Then Verify User is on the about the calculator tab of the MRAT Website

  @satya @Smoke @Regression @playwright
  Scenario: Verify User is on the risk calculator tab
    Given User navigates to the MRAT Website
    Then User clicks on the risk calculator tab in the MRAT Website
    Then Verify User is on the risk calculator tab of the MRAT Website

  @satya @Smoke @Regression @playwright
  Scenario: Verify all the links available in the about the calculator tab
    Given User navigates to the MRAT Website
    Then User clicks on the about the calculator tab in the MRAT Website
    Then User clicks on the github repository link and verify it
    Then User clicks on the terms and condition link and verify it
    Then User clicks on the high risk of melanoma link and verify it

  @satya @Smoke @Regression @playwright
  Scenario: Verify User is able to reset the selections on the risk calculator tab
    Given User navigates to the MRAT Website
    Then User clicks on the risk calculator tab in the MRAT Website
    Then User selects some fields in the risk calculator page
    Then User clicks on the reset button in the MRAT website
    Then Verify User is on the risk calculator tab of the MRAT Website

  @satya @Smoke @Regression @playwright
  Scenario: Verify User is able to calculate the risk using risk calculator
    Given User navigates to the MRAT Website
    Then User clicks on the risk calculator tab in the MRAT Website
    Then User enters all the required details for risk calculation
    Then User clicks on the calculate risk button in the MRAT

  @satya @Smoke @Regression @playwright
  Scenario: Verify User is able to calculate the risk using risk calculator without selecting details
    Given User navigates to the MRAT Website
    Then User clicks on the risk calculator tab in the MRAT Website
    Then User clicks on the calculate risk button in the MRAT
    Then Verify calculate risk button is visible and risk is not calculated

  @satya @Smoke @Regression @playwright
  Scenario: Verify User is able to validate title or url of page after clicking on the links available in the footer
    Given User navigates to the MRAT Website
    Then User clicks on the home link and verify it in the MRAT
    Then User clicks on the contact link and verify it in the MRAT
    Then User clicks on the policies link and verify it in the MRAT
    Then User clicks on the HHS Vulnerability Disclosure link and verify it in the MRAT
    Then User clicks on the Accessibility link and verify it in the MRAT

  @satya @Smoke @Regression @playwright @NCIATWP-2405
  Scenario: Verify User is able to validate title or url of page after clicking on the remaining links available in the footer
    Given User navigates to the MRAT Website
    Then User clicks on the US Department of HHS link and verify it in the MRAT
    Then User clicks on the NIH link and verify it in the MRAT
    Then User clicks on the NCI link and verify it in the MRAT
    Then User clicks on the USA gov link and verify it in the MRAT