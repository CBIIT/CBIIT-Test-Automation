Feature: These are the features for the Home Page
  @Smoke @matakevin
  Scenario: Credits are displayed as expected
    Given the user is on the GWAS Explorer home page
    Then the credit text is displayed

  @Smoke
  Scenario: User is able to go to source code from About page
    Given the user is on the GWAS Explorer home page
    When user clicks on About page
    And clicks on Github
    Then user goes to source code from About page

  @Smoke @matakevin @Regression
  Scenario: User navigates to API Access page
    Given the user is on the GWAS Explorer home page
    When user selects API Access tab
    Then API Access page displays

  @Smoke
  Scenario: User views API Access Page heading
    Given the user is on the GWAS Explorer home page
    When user selects API Access tab
    Then API Acess page displays "API Access" heading

  @Smoke
  Scenario: User is able to go to source code from home page
    Given the user is on the GWAS Explorer home page
    When user clicks on source code
    Then user goes to PLCO source code on github

  @Smoke
  Scenario: User navigates from about page to Explore GWAS
    Given the user is on the GWAS Explorer home page
    When user navigates to the About page
    And user clicks explore on GWAS results
    Then user is on explore GWAS tab where "Summary Results" displays