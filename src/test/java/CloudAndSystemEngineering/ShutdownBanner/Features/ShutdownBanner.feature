Feature: Shutdown Banner

  @bucurgb @CO3-1029 @CO3-1028 @CO3-1044
  Scenario: Collecting URLs from application
    Given a user is on the webpage
    Then the user should be able to gather all application pages

  @bucurgb @CO3-1029 @CO3-1028 @CO3-1044
  Scenario: Verifying the page loading time from excel sheet
    Given a user is on the webpage
    Then the user should see the page loading time in the console

  @bucurgb @CO3-1029 @CO3-1028 @CO3-1044
  Scenario: Verifying the shutdown banner is displaying on URLs from excel sheet
    Given a user is on the webpage
    Then the user should see the shutdown banner

  @bucurgb @CO3-1029 @CO3-1028 @CO3-1044
  Scenario: Verifying the shutdown banner is displaying on URLs from sitemap
    Given a user is on the webpage
    Then the user should see the shutdown banner on the sitemap urls