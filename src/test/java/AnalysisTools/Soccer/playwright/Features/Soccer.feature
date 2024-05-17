Feature:This feature files is for soccer features

  @satya @Smoke @Regression @NCIATWP-1467
  Scenario: Verify user is able to open home page and go to soccer page
    Given User navigates to soccer home page
    Then User click on run soccer button
    Then verify that user is on soccer page
    Then user click on the doi link
    Then verify that user is on oxford Academic page

  @satya @Regression @Smoke @NCIATWP-1476
  Scenario: Verify user is able to see graph in model page
    Given User navigates to soccer home page
    Then User click on model button
    Then verify that graph is getting displayed in model page
    Then user click on the doi link in models page
    Then verify that user is on oxford Academic page
    Then User navigates to soccer home page
    Then User click on model button
    Then User click on the computer based coding link and verify it

  @satya @Regression @Smoke @NCIATWP-1325
  Scenario: Verify user is able to download in socassign page
    Given User navigates to soccer home page
    When User click on socassign button
    Then User is able to click download button and download socassign jar file
    Then User is able to click socassign and download jnlp file

  @satya @Regression @Smoke  @NCIATWP-1523
  Scenario: Verify user is able to verify hyperlinks in resources page
    Given User navigates to soccer home page
    When User click on resources button
    Then verify that all the hyperlinks are clickable and navigating to respective page.

  @satya @Regression @Smoke @NCIATWP-1525
  Scenario: Verify user is able to navigate to help page
    Given User navigates to soccer home page
    Then User click on help button
    Then verify that user is able to navigate to 3 different soccer section in help page

  @satya @Regression @Smoke @NCIATWP-1524
  Scenario: Verify user is able to navigate to FAQ page
    Given User navigates to soccer home page
    Then User click on FAQ button
    Then verify that user is able to navigate to FAQ Page



