Feature: CCR/OIT HelpDesk testing

  @CCRHELPDES-153 @chaudhryma @Regression @playwright
  Scenario: Test Allow CCR OIT Help Desk access for all NIH users
    Given I am an authenticated NCI Frederick user 'Ellen Volkmar',
    When I go to the CCR OIT Help Desk catalog item,
    Then I should be able to access the help desk to submit a request.