@MCAExplorer
Feature: MCAExplorer features

  @TC1
  Scenario Outline: MCAExplorer Row count Validation
    Given User navigates to MCAExplorer page
    Then clicks on advance filters
    Then clicks on submit button
    Then verify if the circle is present on the screen
    Then verify that there are 2339 rows in the result

    Examples: 
      | StudyOption | copynumberstateOption |
      | PLCO        | All Event Types       |
