#@Smoke
Feature: Female Discrepancy
  This tests the discrepancies in the amount of eligible females returned on search cohorts tab.

  @ss-3428 @Progression
  Scenario: Title of your scenario
    Given the user is on the CEDCD homepage
		When the user clicks on the CEDCD search cohorts
		And the user filters by females
		Then "53" results return

  @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
