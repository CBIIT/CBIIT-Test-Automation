Feature:These are the scenarios for the Soccer application

  @satya @Smoke @Regression @NCIATWP-1467 @playwright
  Scenario: Verify user is able to open home page and go to soccer page
    Given User navigates to soccer home page
    Then User click on run soccer button
    Then verify that user is on soccer page
    Then user click on the doi link
    Then verify that user is on oxford Academic page

  @satya @Regression @Smoke @NCIATWP-1476 @playwright
  Scenario: Verify user is able to see graph in model page
    Given User navigates to soccer home page
    Then User click on model button
    Then verify that graph is getting displayed in model page
    Then user click on the doi link in models page
    Then verify that user is on oxford Academic page
    Then User navigates to soccer home page
    Then User click on model button
    Then User click on the computer based coding link and verify it

  @satya @Regression @Smoke @NCIATWP-1325 @playwright
  Scenario: Verify user is able to download in socassign page
    Given User navigates to soccer home page
    When User click on socassign button
    Then User is able to click download button and download socassign jar file
    Then User is able to click socassign and download jnlp file

  @satya @Regression @Smoke  @NCIATWP-1523 @playwright
  Scenario: Verify user is able to verify hyperlinks in resources page
    Given User navigates to soccer home page
    When User click on resources button
    Then verify that all the hyperlinks are clickable and navigating to respective page.

  @satya @Regression @Smoke @NCIATWP-1525 @playwright
  Scenario: Verify user is able to navigate to help page
    Given User navigates to soccer home page
    Then User click on help button
    Then verify that user is able to navigate to 3 different soccer section in help page

  @satya @Regression @Smoke @NCIATWP-1524 @playwright
  Scenario: Verify user is able to navigate to FAQ page
    Given User navigates to soccer home page
    Then User click on FAQ button
    Then verify that user is on the FAQ Page

  @satya @Regression @Smoke @NCIATWP-1476 @playwright
  Scenario: Verify user is able to get the Soccer Score with default Soccer Model
    Given User navigates to soccer home page
    Then User click on Soccer button
    Then User choose a file and upload it
    Then User click on Submit button
    Then verify the result has graph plots
    Then User download the results by clicking on Download Results

  @satya @Regression @Smoke @NCIATWP-1476 @playwright
  Scenario: Verify user is able to submit job with first version of Soccer Model
    Given User navigates to soccer home page
    Then User click on Soccer button
    Then User selects first version of model
    Then User choose a file and upload it
    Then User clicks on the job to add in the queue and enters the email
    Then User click on Submit button
    Then Verify job has been submitted

  @satya @Regression @Smoke @NCIATWP-2158 @playwright
  Scenario: Verify user is able to click and validate urls of footer links
    Given User navigates to soccer home page
    Then User clicks on policies link and verify it
    Then User clicks on the VDPolicy link and verify it
    Then User clicks on the Accessibility link and verify it
    Then User clicks on the viewing file link and verify it
    Then User clicks on the FIOS link and verify it

  @satya @Regression @Smoke @NCIATWP-2158 @playwright
  Scenario: Verify user is able to click and validate urls of footer links
    Given User navigates to soccer home page
    Then User clicks on hhs link and verify it
    Then User clicks on NIH link and verify it
    Then User clicks on NCS link and verify it
    Then User clicks on USA gov link and verify it





