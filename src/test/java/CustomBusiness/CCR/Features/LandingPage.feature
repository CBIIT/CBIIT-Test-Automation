Feature: CCR Landing Page Scenarios

  Background: common steps
    Given User is on CCR Landing page and user is "internal user"

  @Alena @Regression @Smoke @landingPage
  Scenario: Verify CCR Landing Page items
    And User can see tabs displayed
    |Home|Positions|
