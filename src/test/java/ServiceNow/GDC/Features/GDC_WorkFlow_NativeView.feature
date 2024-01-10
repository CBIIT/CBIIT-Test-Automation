Feature: GDC Workflow Test Scenarios

  @GDCSNOW-5 @GDCSNOW-68 @chaudhryma @Regression
  Scenario: Test Configure GDC workflow
    Given I am authenticated GDC Fulfiller in the Native View
    When I get a ticket assigned to me to complete a request
    Then I should see UI Actions in the top right hand corner that follow GDC flow

  @GDCSNOW-8 @GDCSNOW-55 @chaudhryma @Regression
  Scenario: Test Configure GDC workflow
    Given I am authenticated GDC Fulfiller in the Native View
    When a new ticket has been created and submitted
    And I change the state of the ticket to resolved and save
    Then I should be able to go to the closure info and check that business duration is filled



