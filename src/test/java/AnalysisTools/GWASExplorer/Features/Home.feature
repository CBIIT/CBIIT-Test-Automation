Feature: These are the scenarios for the GWAS Explorer's Home page

  @Smoke @matakevin @selenium
  Scenario: Credits are displayed as expected
    Given the user is on the GWAS Explorer home page
    Then the credit text is displayed

  @Smoke @matakevin @selenium
  Scenario: User is able to go to source code from About page
    Given the user is on the GWAS Explorer home page
    When user clicks on About page
    And clicks on Github
    Then user goes to source code from About page

  @Smoke @matakevin @Regression @selenium
  Scenario: User navigates to API Access page
    Given the user is on the GWAS Explorer home page
    When user selects API Access tab
    Then API Access page displays

  @Smoke @matakevin @selenium
  Scenario: User views API Access Page heading
    Given the user is on the GWAS Explorer home page
    When user selects API Access tab
    Then API Acess page displays "API Access" heading

  @Smoke @matakevin @selenium
  Scenario: User is able to go to source code from home page
    Given the user is on the GWAS Explorer home page
    When user clicks on source code
    Then user goes to PLCO source code on github

  @Smoke @matakevin @selenium
  Scenario: User navigates from about page to Explore GWAS
    Given the user is on the GWAS Explorer home page
    When user navigates to the About page
    And user clicks explore on GWAS results
    Then user is on explore GWAS tab where "Summary Results" displays