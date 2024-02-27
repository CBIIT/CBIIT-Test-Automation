Feature: This Feature File contains Quick Link and logged in user verifications and Management menu

  @QuickLinkVerification @nesarh2 @Regression
  Scenario: Test Egrants Quick Links and logged in user
    Given User is logged in the application and is on the landing page
    And User is able to navigate to "PMS" hyperlink
    And verifies that the logged in user "Logged in as:Hamid Nesar" is shown