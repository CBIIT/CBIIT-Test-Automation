Feature: SEER Data Access Landing Page Scenarios

  @Smoke @ODS-264 @ODS-256 @juarezds @Smoke @Progression
  Scenario: Verifying Request Database Access text
    Given a user is on the SEER Data Access landing page
    Then the "Request Database Access" text displays as
      """
      Request Database Access
      
      Attention: The Institutional Account route for requesting data is currently not working. As a temporary solution, please use the Non-Institutional route to request access to Research or Research Plus data, even if you have an eRA Commons account.
      
      To request access to the SEER Incidence Databases, you will first need to create a new SEER*Stat Account by registering your email address through the Non-Institutional Account route. This will give you access to the SEER Research Database.
      
      To upgrade your access to include the Research Plus Database, existing SEER*Stat account holders can upgrade their accounts using their registered email address and once again go the Non-Institutional route below. Completing the Non-Institutional route a second time will provide you with the form to request expanded access to Research Plus Database.
      """

  @Smoke @ODS-265 @ODS-263 @ODS-255 @juarezds @Progression
  Scenario: Verifying Institutional Accounts and Non-Institutional Accounts text on landing page
    Given a user is on the SEER Data Access landing page
    Then under "Institutional Accounts" the text displayed is
      """
      Are you affiliated with a research organization, state, or federal government?
      """
    And the text displayed is "* If you are unable to authenticate, please use the Non-institutional option."
    And under "Non-Institutional Accounts", text displayed is
      """
      I am not affiliated with any research organization, state or federal government.
      """
