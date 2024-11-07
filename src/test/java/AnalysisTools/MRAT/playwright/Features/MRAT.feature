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