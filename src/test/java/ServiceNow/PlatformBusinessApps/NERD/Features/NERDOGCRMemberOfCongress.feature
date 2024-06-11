Feature: Test Member of congress results appearance

  @SS-5200 @SS-5212 @bucurgb @Regression @selenium
  Scenario: Test Member of congress results appearance
    Given a user is in the OGCR Admin Group
    When the user goes to the OGCR Knowledge Base
    And the OGCR user clicks the Add New Entry button
    Then the Member of Congress drop down field only includes options that have the "Active" flag enabled in the Member of Congress table
